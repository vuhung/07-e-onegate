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
import com.liferay.portal.kernel.util.CalendarUtil;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.User;
import com.liferay.portal.security.auth.PrincipalException;
import com.liferay.portal.service.permission.PortletPermissionUtil;
import com.liferay.portal.theme.ThemeDisplay;
import com.vportal.portal.util.PortletKeysExt;
import com.vportal.portlet.vlegal.DeleteFieldException;
import com.vportal.portlet.vlegal.InvalidFieldNameExceptionException;
import com.vportal.portlet.vlegal.NoSuchVLegalFieldException;
import com.vportal.portlet.vlegal.model.VLegalField;
import com.vportal.portlet.vlegal.service.VLegalDocumentServiceUtil;
import com.vportal.portlet.vlegal.service.VLegalLoggerServiceUtil;
import com.vportal.portlet.vlegal.service.base.VLegalFieldServiceBaseImpl;
import com.vportal.portlet.vlegal.service.permission.VLegalFieldPermission;
import com.vportal.portlet.vlegal.util.permission.ActionKeysExt;

/**
 * The implementation of the v legal field remote service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link com.vportal.portlet.vlegal.service.VLegalFieldService} interface.
 * </p>
 *
 * <p>
 * Never reference this interface directly. Always use {@link com.vportal.portlet.vlegal.service.VLegalFieldServiceUtil} to access the v legal field remote service.
 * </p>
 *
 * <p>
 * This is a remote service. Methods of this service are expected to have security checks based on the propagated JAAS credentials because this service can be accessed remotely.
 * </p>
 *
 * @author ACB
 * @see com.vportal.portlet.vlegal.service.base.VLegalFieldServiceBaseImpl
 * @see com.vportal.portlet.vlegal.service.VLegalFieldServiceUtil
 */
public class VLegalFieldServiceImpl extends VLegalFieldServiceBaseImpl {
	
	public VLegalField addField(long groupId, String name, String description,
			String language, boolean status, boolean rssable,
			String[] communityPermissions, String[] guestPermissions,
			ThemeDisplay themeDisplay) throws RemoteException, PrincipalException, com.liferay.portal.kernel.exception.PortalException, com.liferay.portal.kernel.exception.SystemException {

		PortletPermissionUtil.check(getPermissionChecker(), themeDisplay
				.getLayout().getPlid(), PortletKeysExt.VLEGAL,
				ActionKeysExt.ADD);

		return addField(groupId, name, description, language, status, rssable,
				null, null, communityPermissions, guestPermissions,
				themeDisplay);
	}

	@SuppressWarnings({ "deprecation", "unused" })
	public VLegalField addField(long groupId, String name, String description,
			String language, boolean status, boolean rssable,
			Boolean addCommunityPermissions, Boolean addGuestPermissions,
			String[] communityPermissions, String[] guestPermissions,
			ThemeDisplay themeDisplay) throws PortalException, RemoteException, com.liferay.portal.kernel.exception.SystemException, PrincipalException, NoSuchUserException {

		_validate(name);

		String fieldId = String.valueOf(counterLocalService.increment());

		long id = counterLocalService.increment();

		// Get Current Datetime
		Date now = new Date();
		long userId = getUserId();
		User user = userPersistence.findByPrimaryKey(userId);

		VLegalField vField = vLegalFieldPersistence.create(fieldId);

		vField.setCompanyId(user.getCompanyId());
		vField.setGroupId(groupId);
		vField.setName(name);
		vField.setDescription(description);
		vField.setLanguage(language);
		vField.setStatusField(status);
		vField.setRssable(rssable);
		vField.setCreatedDate(now);
		vField.setCreatedByUser(userId);
		vField.setUserId(userId);
		vField.setModifiedDate(now);

		vLegalFieldPersistence.update(vField, false);

		// Resources

		if ((addCommunityPermissions != null) && (addGuestPermissions != null)) {

			addEntryResources(vField, addCommunityPermissions.booleanValue(),
					addGuestPermissions.booleanValue());
		} else {
			addEntryResources(vField, communityPermissions, guestPermissions);
		}

		// Resources
		if ((addCommunityPermissions != null) && (addGuestPermissions != null)) {

			addEntryResources(vField, addCommunityPermissions.booleanValue(),
					addGuestPermissions.booleanValue());
		} else {
			addEntryResources(vField, communityPermissions, guestPermissions);
		}

		// Logging...
		VLegalLoggerServiceUtil.log(groupId, CalendarUtil.getTimestamp(now)
				+ " -- CREATE: [vlegal] -> field [" + name + "] by "
				+ user.getScreenName());

		return vField;
	}

	// UPDATE A EXIST FIELD ENTRY
	@SuppressWarnings("deprecation")
	public VLegalField updateField(long groupId, String fieldId, String name,
			String description, String language, boolean status, boolean rss)
			throws PortalException, SystemException, RemoteException {
		try
		{
			VLegalFieldPermission.check(getPermissionChecker(), fieldId,
					ActionKeysExt.UPDATE);
	
			_validate(name);
	
			Date now = new Date();
			VLegalField vField = vLegalFieldPersistence.findByPrimaryKey(fieldId);
	
			vField.setGroupId(groupId);
			vField.setName(name);
			vField.setDescription(description);
			vField.setLanguage(language);
			vField.setStatusField(status);
			vField.setRssable(rss);
			vField.setModifiedDate(now);
	
			vLegalFieldPersistence.update(vField, false);
			// Logging...
			VLegalLoggerServiceUtil
					.log(groupId, CalendarUtil.getTimestamp(now)
							+ " -- UPDATE: [vlegal] -> field ["
							+ name
							+ "] by "
							+ userPersistence.findByPrimaryKey(getUserId())
									.getScreenName());
	
			return vField;
		
		}catch(Exception ex)
		{
			
		}
		
		return null;
	}

	@SuppressWarnings("deprecation")
	public void addEntryResources(long entryId,
			boolean addCommunityPermissions, boolean addGuestPermissions)
			throws PortalException, SystemException {

		VLegalField entry;
		try {
			entry = vLegalFieldPersistence.findByPrimaryKey(String
					.valueOf(entryId));
			
			addEntryResources(entry, addCommunityPermissions, addGuestPermissions);
		} catch (NoSuchVLegalFieldException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (com.liferay.portal.kernel.exception.SystemException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@SuppressWarnings("deprecation")
	public void addEntryResources(VLegalField entry,
			boolean addCommunityPermissions, boolean addGuestPermissions)
			throws PortalException, SystemException {

		try {
			resourceLocalService.addResources(entry.getCompanyId(), entry
					.getGroupId(), entry.getUserId(), VLegalField.class.getName(),
					entry.getFieldId(), false, addCommunityPermissions,
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

		VLegalField entry;
		try {
			entry = vLegalFieldPersistence.findByPrimaryKey(String
					.valueOf(entryId));
			addEntryResources(entry, communityPermissions, guestPermissions);
		} catch (NoSuchVLegalFieldException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (com.liferay.portal.kernel.exception.SystemException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@SuppressWarnings("deprecation")
	public void addEntryResources(VLegalField entry,
			String[] communityPermissions, String[] guestPermissions)
			throws PortalException, SystemException {

		try {
			resourceLocalService.addModelResources(entry.getCompanyId(), entry
					.getGroupId(), entry.getUserId(), VLegalField.class.getName(),
					entry.getFieldId(), communityPermissions, guestPermissions);
		} catch (com.liferay.portal.kernel.exception.PortalException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (com.liferay.portal.kernel.exception.SystemException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@SuppressWarnings({ "deprecation", "rawtypes" })
	public void deleteField(String fieldId) throws PortalException,
			SystemException, RemoteException {

		try
		{
			VLegalFieldPermission.check(getPermissionChecker(), fieldId,
					ActionKeysExt.DELETE);
	
			VLegalField vDoc = vLegalFieldPersistence.findByPrimaryKey(fieldId);
	
			if (Validator.isNull(fieldId)) {
				throw new NoSuchFieldException();
			}
	
			List listDocByField = (List) VLegalDocumentServiceUtil.getDocByG_L_F(
					vDoc.getGroupId(), vDoc.getLanguage(), fieldId);
	
			if (Validator.isNotNull(listDocByField) && listDocByField.size() > 0) {
				throw new DeleteFieldException();
			}
	
			vLegalFieldPersistence.remove(fieldId);
	
			// Logging...
			VLegalLoggerServiceUtil
					.log(0, CalendarUtil.getTimestamp(new Date())
							+ " -- DELETE: [vlegal] -> field ["
							+ vDoc.getName()
							+ "] by "
							+ userPersistence.findByPrimaryKey(getUserId())
									.getScreenName());
		}catch(Exception ex)
		{
			
		}
	}

	@SuppressWarnings("deprecation")
	public VLegalField getVField(String fieldId){
		try
		{
			if (Validator.isNull(fieldId)) 
			{
				throw new NoSuchFieldException();
			}
			return vLegalFieldPersistence.findByPrimaryKey(fieldId);
		}catch(Exception ex)
		{
			
		}
		return null;
	}

	@SuppressWarnings("deprecation")
	public VLegalField getVField(long groupId, String fieldId)
			throws PortalException, SystemException, RemoteException {

		try {
			return vLegalFieldPersistence.findByG_F(groupId, fieldId);
		} catch (NoSuchVLegalFieldException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (com.liferay.portal.kernel.exception.SystemException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	// get all fields
	@SuppressWarnings("deprecation")
	public List getAllFields() throws PortalException, SystemException,
			RemoteException {

		try {
			return vLegalFieldPersistence.findAll();
		} catch (com.liferay.portal.kernel.exception.SystemException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	@SuppressWarnings("rawtypes")
	public List getFieldByGroupId(long groupId) throws SystemException {
		try {
			return vLegalFieldPersistence.findByGroupId(groupId);
		} catch (com.liferay.portal.kernel.exception.SystemException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	@SuppressWarnings({ "rawtypes", "deprecation" })
	public List getFieldByGroupId(long groupId, int begin, int end)
			throws SystemException {
		try {
			return vLegalFieldPersistence.findByGroupId(groupId, begin, end);
		} catch (com.liferay.portal.kernel.exception.SystemException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	@SuppressWarnings("deprecation")
	public int countFieldByGroupId(long groupId) throws SystemException {
		try {
			return vLegalFieldPersistence.countByGroupId(groupId);
		} catch (com.liferay.portal.kernel.exception.SystemException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return 0;
	}

	@SuppressWarnings({ "rawtypes", "deprecation" })
	public List getVFieldByS_L(long groupId, boolean status, String language)
			throws PortalException, SystemException, RemoteException {
		try {
			return vLegalFieldPersistence.findByS_L(groupId, status, language);
		} catch (com.liferay.portal.kernel.exception.SystemException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	
	@SuppressWarnings({ "rawtypes", "deprecation" })
	public List getVFieldByS_L(String language, boolean status)
			throws PortalException, SystemException, RemoteException {
		try {
			return vLegalFieldPersistence.findByL_S(language, status);
		} catch (com.liferay.portal.kernel.exception.SystemException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	@SuppressWarnings({ "rawtypes", "deprecation" })
	public List getVFieldByS_Rss(long groupId, boolean status, boolean rssable)
			throws PortalException, SystemException, RemoteException {
		try {
			return vLegalFieldPersistence.findByS_Rss(groupId, status, rssable);
		} catch (com.liferay.portal.kernel.exception.SystemException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	@SuppressWarnings({ "rawtypes", "deprecation" })
	public List getFieldByOrg(long groupId, String orgId, String language,
			String status, int begin, int end) throws SystemException,
			PortalException {
		return vLegalFieldFinder.findFieldByOrgRel(groupId, orgId, language,
				status, "N/A", begin, end);
	}

	@SuppressWarnings({ "rawtypes", "deprecation" })
	public List getFieldByType(long groupId, String typeId, String language,
			String status, int begin, int end) throws SystemException,
			PortalException {
		return vLegalFieldFinder.findFieldByTypeRel(groupId, typeId, language,
				status, "N/A", begin, end);
	}

	@SuppressWarnings({ "rawtypes", "deprecation" })
	public List getAllFieldByPS(long groupId, String language)
			throws SystemException, PortalException {
		return vLegalFieldFinder.findFieldByPS(groupId, language, "TRUE",
				"N/A", 0, 0);
	}

	@SuppressWarnings({ "rawtypes", "deprecation" })
	public List getFieldRelDoc_T_O(long groupId, String language,
			String typeId, String orgId) throws SystemException {
		return vLegalFieldFinder.findFieldExistByDoc(groupId, language, typeId,
				orgId, 2, "N/A", 0, 0);
	}

	@SuppressWarnings("deprecation")
	public void _validate(String name)
			throws PortalException {
		if (Validator.isNull(name)|| Validator.equals(name, "")) {
			try {
				throw new InvalidFieldNameExceptionException();
			} catch (InvalidFieldNameExceptionException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	@SuppressWarnings("deprecation")
	@Override
	public VLegalField addField(long arg0, String arg1, String arg2,
			String arg3, boolean arg4, boolean arg5, ThemeDisplay arg6)
			throws PortalException, SystemException, RemoteException {
		// TODO Auto-generated method stub
		return null;
	}

	@SuppressWarnings("deprecation")
	@Override
	public VLegalField addField(long arg0, long arg1, long arg2, String arg3,
			String arg4, String arg5, boolean arg6, boolean arg7,
			ThemeDisplay arg8) throws PortalException, SystemException,
			RemoteException {
		// TODO Auto-generated method stub
		return null;
	}

}