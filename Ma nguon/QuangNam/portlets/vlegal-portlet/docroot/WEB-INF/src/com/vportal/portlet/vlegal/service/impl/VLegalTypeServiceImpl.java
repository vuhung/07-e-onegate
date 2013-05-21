/**
 * Copyright (c) 2000-2011 Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.vportal.portlet.vlegal.service.impl;

import java.rmi.RemoteException;
import java.util.Date;
import java.util.List;

import com.liferay.portal.NoSuchUserException;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.annotation.Propagation;
import com.liferay.portal.kernel.annotation.Transactional;
import com.liferay.portal.kernel.util.CalendarUtil;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.User;
import com.liferay.portal.security.auth.PrincipalException;
import com.liferay.portal.service.permission.PortletPermissionUtil;
import com.liferay.portal.theme.ThemeDisplay;
import com.vportal.portal.util.PortletKeysExt;
import com.vportal.portlet.vlegal.DeleteTypeException;
import com.vportal.portlet.vlegal.InvalidTypeNameException;
import com.vportal.portlet.vlegal.NoSuchVLegalTypeException;
import com.vportal.portlet.vlegal.model.VLegalType;
import com.vportal.portlet.vlegal.service.VLegalDocumentServiceUtil;
import com.vportal.portlet.vlegal.service.VLegalLoggerServiceUtil;
import com.vportal.portlet.vlegal.service.base.VLegalTypeServiceBaseImpl;
import com.vportal.portlet.vlegal.service.permission.VLegalTypePermission;
import com.vportal.portlet.vlegal.service.persistence.VLegalDocumentUtil;
import com.vportal.portlet.vlegal.util.permission.ActionKeysExt;

/**
 * The implementation of the v legal type remote service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link com.vportal.portlet.vlegal.service.VLegalTypeService} interface.
 * </p>
 *
 * <p>
 * Never reference this interface directly. Always use {@link com.vportal.portlet.vlegal.service.VLegalTypeServiceUtil} to access the v legal type remote service.
 * </p>
 *
 * <p>
 * This is a remote service. Methods of this service are expected to have security checks based on the propagated JAAS credentials because this service can be accessed remotely.
 * </p>
 *
 * @author ACB
 * @see com.vportal.portlet.vlegal.service.base.VLegalTypeServiceBaseImpl
 * @see com.vportal.portlet.vlegal.service.VLegalTypeServiceUtil
 */
public class VLegalTypeServiceImpl extends VLegalTypeServiceBaseImpl {
	
	public VLegalType addType(long groupId, String name, String description,
			String language, boolean status, boolean rssable,
			String[] communityPermissions, String[] guestPermissions,
			ThemeDisplay themeDisplay) throws RemoteException, PrincipalException, com.liferay.portal.kernel.exception.PortalException, com.liferay.portal.kernel.exception.SystemException {

		PortletPermissionUtil.check(getPermissionChecker(), themeDisplay
				.getLayout().getPlid(), PortletKeysExt.VLEGAL,
				ActionKeysExt.ADD);

		return addType(groupId, name, description, language, status, rssable,
				null, null, communityPermissions, guestPermissions,
				themeDisplay);

	}

	// ADD NEW TYPE
	@SuppressWarnings({ "deprecation", "unused" })
	public VLegalType addType(long groupId, String name, String description,
			String language, boolean status, boolean rssable,
			Boolean addCommunityPermissions, Boolean addGuestPermissions,
			String[] communityPermissions, String[] guestPermissions,
			ThemeDisplay themeDisplay) throws PortalException, SystemException,
			RemoteException {
		try
		{
			_validate(name);
	
			String typeid = String.valueOf(counterLocalService.increment());
	
			long id = counterLocalService.increment();
	
			VLegalType type = vLegalTypePersistence.create(typeid);
	
			Date now = new Date();
			long userId = getUserId();
			User user = userPersistence.findByPrimaryKey(userId);
	
			type.setCompanyId(user.getCompanyId());
			type.setGroupId(groupId);
			type.setName(name);
			type.setDescription(description);
			type.setLanguage(language);
			type.setStatusType(status);
			type.setRssable(rssable);
	
			type.setCreatedDate(now);
			type.setCreatedByUser(userId);
			type.setModifiedDate(now);
			type.setModifiedByUser(userId);
			type.setPosition(1);
	
			vLegalTypePersistence.update(type, false);
	
			// Resources
	
			if ((addCommunityPermissions != null) && (addGuestPermissions != null)) {
	
				addEntryResources(type, addCommunityPermissions.booleanValue(),
						addGuestPermissions.booleanValue());
			} else {
				addEntryResources(type, communityPermissions, guestPermissions);
			}
	
			// Logging...
			VLegalLoggerServiceUtil.log(groupId, CalendarUtil.getTimestamp(now)
					+ " -- CREATE : [vlegal] -> type [" + name + "] by "
					+ user.getScreenName());
	
			return type;
		}catch(Exception ex)
		{
			
		}
		return null;
	}

	// UPDATE TYPE
	@SuppressWarnings("deprecation")
	public VLegalType updateType(long groupId, String typeId, String language,
			String name, String description, int position, boolean status,
			boolean rssable) throws PortalException, SystemException,
			RemoteException {
		try
		{
			VLegalTypePermission.check(getPermissionChecker(), typeId,
					ActionKeysExt.UPDATE);
	
			_validate(name);
	
			VLegalType lType = vLegalTypePersistence.findByPrimaryKey(typeId);
	
			Date now = new Date();
			long userId = getUserId();
			User user = userPersistence.findByPrimaryKey(userId);
	
			lType.setModifiedDate(now);
			lType.setModifiedByUser(userId);
	
			lType.setGroupId(groupId);
			lType.setName(name);
			lType.setDescription(description);
			lType.setPosition(position);
			lType.setLanguage(language);
	
			lType.setStatusType(status);
			lType.setRssable(rssable);
	
			vLegalTypePersistence.update(lType, false);
	
			// Logging...
	
			VLegalLoggerServiceUtil.log(groupId, CalendarUtil.getTimestamp(now)
					+ " -- UPDATE : [vlegal] -> type [" + name + "] by "
					+ user.getScreenName());
	
			return lType;
		}catch(Exception ex)
		{
			
		}
		return null;
	}

	@SuppressWarnings("deprecation")
	public VLegalType updateType(VLegalType lType) throws PortalException,
			SystemException, RemoteException {
		return updateType(lType.getGroupId(), lType.getPrimaryKey(), lType
				.getLanguage(), lType.getName(), lType.getDescription(), lType
				.getPosition(), lType.getStatusType(), lType.getRssable());
	}

	@SuppressWarnings("deprecation")
	public void addEntryResources(long entryId,
			boolean addCommunityPermissions, boolean addGuestPermissions)
			throws PortalException, SystemException {
		
		VLegalType entry;
		
		try 
		{
			entry = vLegalTypePersistence.findByPrimaryKey(String
					.valueOf(entryId));
			
			addEntryResources(entry, addCommunityPermissions, addGuestPermissions);
		} catch (NoSuchVLegalTypeException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (com.liferay.portal.kernel.exception.SystemException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@SuppressWarnings("deprecation")
	public void addEntryResources(VLegalType entry,
			boolean addCommunityPermissions, boolean addGuestPermissions)
			throws PortalException, SystemException {

		try {
			resourceLocalService.addResources(entry.getCompanyId(), entry
					.getGroupId(), entry.getUserId(), VLegalType.class.getName(),
					entry.getTypeId(), false, addCommunityPermissions,
					addGuestPermissions);
		} catch (com.liferay.portal.kernel.exception.PortalException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (com.liferay.portal.kernel.exception.SystemException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@SuppressWarnings("deprecation")
	public void addEntryResources(long entryId, String[] communityPermissions,
			String[] guestPermissions) throws PortalException, SystemException {

		VLegalType entry;
		try 
		{
			entry = vLegalTypePersistence.findByPrimaryKey(String
					.valueOf(entryId));
			addEntryResources(entry, communityPermissions, guestPermissions);
		} catch (NoSuchVLegalTypeException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (com.liferay.portal.kernel.exception.SystemException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@SuppressWarnings("deprecation")
	public void addEntryResources(VLegalType entry,
			String[] communityPermissions, String[] guestPermissions)
			throws PortalException, SystemException {

		try 
		{
			resourceLocalService.addModelResources(entry.getCompanyId(), entry
					.getGroupId(), entry.getUserId(), VLegalType.class.getName(),
					entry.getTypeId(), communityPermissions, guestPermissions);
		} catch (com.liferay.portal.kernel.exception.PortalException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (com.liferay.portal.kernel.exception.SystemException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	// DELETE TYPE BY TYPEID
	@SuppressWarnings({ "deprecation", "rawtypes" })
	public void deleteType(String typeId) throws PortalException,
			SystemException, RemoteException {

		try
		{
		VLegalTypePermission.check(getPermissionChecker(), typeId,
				ActionKeysExt.DELETE);

		if (Validator.isNull(typeId)) {
			return;
		}

		VLegalType lType = vLegalTypePersistence.findByPrimaryKey(typeId);

		List listDocByType = (List) VLegalDocumentServiceUtil.getDocByG_L_T(
				lType.getGroupId(), lType.getLanguage(), typeId);

		if (Validator.isNotNull(listDocByType) && listDocByType.size() > 0) {
			throw new DeleteTypeException();
		}

		Date now = new Date();
		long userId = getUserId();
		User user = userPersistence.findByPrimaryKey(userId);
		String name = lType.getName();

		vLegalTypePersistence.remove(lType);

		// Logging...
		VLegalLoggerServiceUtil.log(0, CalendarUtil.getTimestamp(now)
				+ " -- DELETE : [vlegal] -> type [" + name + "] by "
				+ user.getScreenName());
		}catch(Exception ex)
		{
			
		}

	}

	@SuppressWarnings("deprecation")
	public void deleteTypeAndDocs(String typeId) throws PortalException,
			SystemException, RemoteException {
		// delete type and All Document into Type
	}

	@SuppressWarnings("deprecation")
	public VLegalType getType(String typeId) throws PortalException,
			SystemException, RemoteException {

		try
		{
			if (Validator.isNull(typeId) || Validator.equals(typeId, "")) {
					throw new NoSuchVLegalTypeException();
			}
	
			VLegalType lType = vLegalTypePersistence.findByPrimaryKey(typeId);
	
			return lType;
		}catch(Exception ex)
		{
			
		}
		return null;
	}

	@SuppressWarnings("deprecation")
	public VLegalType getType(long groupId, String typeId)
			throws PortalException, SystemException, RemoteException {

		try
		{
			if (Validator.isNull(typeId) || Validator.equals(typeId, "")) {
				throw new NoSuchVLegalTypeException();
			}
	
			VLegalType lType = vLegalTypePersistence.findByG_T(groupId, typeId);
	
			return lType;
		}catch(Exception ex)
		{
			
		}
		return null;
	}

	@SuppressWarnings({ "rawtypes", "deprecation" })
	public List getDocByType(String typeId, String language)
			throws PortalException, SystemException, RemoteException {

		try {
			return VLegalDocumentUtil.findByDocsByT_L(typeId, language);
		} catch (com.liferay.portal.kernel.exception.SystemException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	@SuppressWarnings({ "rawtypes", "deprecation" })
	public List getAllTypes() throws PortalException, SystemException,
			RemoteException {
		try {
			return vLegalTypePersistence.findAll();
		} catch (com.liferay.portal.kernel.exception.SystemException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	@SuppressWarnings({ "rawtypes", "deprecation" })
	public List getTypeByGroupId(long groupId) throws PortalException,
			SystemException, RemoteException {
		try {
			return vLegalTypePersistence.findByGroupId(groupId);
		} catch (com.liferay.portal.kernel.exception.SystemException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	@SuppressWarnings({ "rawtypes", "deprecation" })
	public List getTypeByGroupId(long groupId, int begin, int end)
			throws PortalException, SystemException, RemoteException {
		try {
			return vLegalTypePersistence.findByGroupId(groupId, begin, end);
		} catch (com.liferay.portal.kernel.exception.SystemException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	@SuppressWarnings("deprecation")
	public int countTypeByGroupId(long groupId) throws PortalException,
			SystemException, RemoteException {
		try {
			return vLegalTypePersistence.countByGroupId(groupId);
		} catch (com.liferay.portal.kernel.exception.SystemException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return 0;
	}

	@SuppressWarnings({ "rawtypes", "deprecation" })
	public List getTypesByL_S(long groupId, String language, boolean status)
			throws PortalException, SystemException, RemoteException {

		try {
			return vLegalTypePersistence.findByS_L(groupId, status, language);
		} catch (com.liferay.portal.kernel.exception.SystemException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	@SuppressWarnings({ "rawtypes", "deprecation" })
	public List getTypesByL_RSS(long groupId, boolean status, boolean rss)
			throws PortalException, SystemException, RemoteException {

		try {
			return vLegalTypePersistence.findByS_Rss(groupId, status, rss);
		} catch (com.liferay.portal.kernel.exception.SystemException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	@SuppressWarnings("deprecation")
	private void _validate(String name)
			throws PortalException, SystemException, InvalidTypeNameException {
		if (Validator.isNull(name) || Validator.equals(name, "")) {
			throw new InvalidTypeNameException();
		}
	}

	@Override
	public VLegalType addTypeNew(long arg0, long arg1, long arg2, String arg3,
			String arg4, String arg5, boolean arg6, boolean arg7,
			ThemeDisplay arg8) throws PortalException, SystemException,
			RemoteException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List getDocByType(String arg0, String arg1, int arg2)
			throws PortalException, SystemException, RemoteException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public VLegalType updateTypeNew(long arg0, long arg1, String arg2,
			String arg3, String arg4, String arg5, int arg6, boolean arg7,
			boolean arg8) throws PortalException, SystemException,
			RemoteException {
		// TODO Auto-generated method stub
		return null;
	}
}