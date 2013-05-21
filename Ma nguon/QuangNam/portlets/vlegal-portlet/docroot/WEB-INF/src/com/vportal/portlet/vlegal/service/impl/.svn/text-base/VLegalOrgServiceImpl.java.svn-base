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
import com.vportal.portlet.vlegal.DeleteOrgException;
import com.vportal.portlet.vlegal.InvalidOrgNameExceptionException;
import com.vportal.portlet.vlegal.NoSuchVLegalOrgException;
import com.vportal.portlet.vlegal.model.VLegalOrg;
import com.vportal.portlet.vlegal.service.VLegalDocumentServiceUtil;
import com.vportal.portlet.vlegal.service.VLegalLoggerServiceUtil;
import com.vportal.portlet.vlegal.service.base.VLegalOrgServiceBaseImpl;
import com.vportal.portlet.vlegal.service.permission.VLegalOrgPermission;
import com.vportal.portlet.vlegal.util.permission.ActionKeysExt;

/**
 * The implementation of the v legal org remote service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link com.vportal.portlet.vlegal.service.VLegalOrgService} interface.
 * </p>
 *
 * <p>
 * Never reference this interface directly. Always use {@link com.vportal.portlet.vlegal.service.VLegalOrgServiceUtil} to access the v legal org remote service.
 * </p>
 *
 * <p>
 * This is a remote service. Methods of this service are expected to have security checks based on the propagated JAAS credentials because this service can be accessed remotely.
 * </p>
 *
 * @author ACB
 * @see com.vportal.portlet.vlegal.service.base.VLegalOrgServiceBaseImpl
 * @see com.vportal.portlet.vlegal.service.VLegalOrgServiceUtil
 */
public class VLegalOrgServiceImpl extends VLegalOrgServiceBaseImpl {
	public VLegalOrg addOrg(long groupId, String name, String description,
			String language, boolean rssable, boolean status,
			String[] communityPermissions, String[] guestPermissions,
			ThemeDisplay themeDisplay) throws RemoteException, PrincipalException, com.liferay.portal.kernel.exception.PortalException, com.liferay.portal.kernel.exception.SystemException {

		PortletPermissionUtil.check(getPermissionChecker(), themeDisplay
				.getLayout().getPlid(), PortletKeysExt.VLEGAL,
				ActionKeysExt.ADD);

		return addOrg(groupId, name, description, language, rssable, status,
				null, null, communityPermissions, guestPermissions,
				themeDisplay);
	}

	// Add Organization

	@SuppressWarnings("deprecation")
	public VLegalOrg addOrg(long groupId, String name, String description,
			String language, boolean rssable, boolean status,
			Boolean addCommunityPermissions, Boolean addGuestPermissions,
			String[] communityPermissions, String[] guestPermissions,
			ThemeDisplay themeDisplay) throws PortalException, RemoteException, com.liferay.portal.kernel.exception.SystemException, PrincipalException, NoSuchUserException {

		_validator(name);

		String orgId = String.valueOf(counterLocalService.increment());
		Date now = new Date();

		long userId = getUserId();
		User user = userPersistence.findByPrimaryKey(userId);

		VLegalOrg vOrg = vLegalOrgPersistence.create(orgId);

		vOrg.setCompanyId(user.getCompanyId());
		vOrg.setGroupId(groupId);
		vOrg.setName(name);
		vOrg.setDescription(description);
		vOrg.setStatusOrg(status);
		vOrg.setLanguage(language);
		vOrg.setRssable(rssable);

		vOrg.setCreatedDate(now);
		vOrg.setCreatedByUser(getUserId());
		vOrg.setUserId(userId);

		vOrg.setModifiedDate(now);
		vOrg.setPosition(1);

		vLegalOrgPersistence.update(vOrg, false);

		// Logging...
		VLegalLoggerServiceUtil
				.log(groupId, CalendarUtil.getTimestamp(now)
						+ " -- CREATE: [vlegal] -> Organization ["
						+ name
						+ "] by "
						+ userPersistence.findByPrimaryKey(getUserId())
								.getScreenName());

		// Resources

		if ((addCommunityPermissions != null) && (addGuestPermissions != null)) {

			addEntryResources(vOrg, addCommunityPermissions.booleanValue(),
					addGuestPermissions.booleanValue());
		} else {
			addEntryResources(vOrg, communityPermissions, guestPermissions);
		}

		return vOrg;

	}

	// Update Organization
	@SuppressWarnings("deprecation")
	public VLegalOrg updateOrg(long groupId, String orgId, String name,
			String description, String language, boolean rssable,
			boolean status, int position) throws PortalException,
			RemoteException, PrincipalException, NoSuchVLegalOrgException, com.liferay.portal.kernel.exception.SystemException, NoSuchUserException {

		VLegalOrgPermission.check(getPermissionChecker(), orgId,
				ActionKeysExt.UPDATE);

		_validator(name);

		Date now = new Date();

		VLegalOrg vOrg = vLegalOrgPersistence.findByPrimaryKey(orgId);

		vOrg.setGroupId(groupId);
		vOrg.setName(name);
		vOrg.setDescription(description);
		vOrg.setStatusOrg(status);
		vOrg.setRssable(rssable);
		vOrg.setPosition(position);

		vOrg.setCreatedDate(now);
		vOrg.setCreatedByUser(getUserId());

		vOrg.setModifiedDate(now);
		vOrg.setModifiedByUser(getUserId());

		vLegalOrgPersistence.update(vOrg, false);

		// Logging...
		VLegalLoggerServiceUtil
				.log(groupId, CalendarUtil.getTimestamp(now)
						+ " -- UPDATE: [vlegal] -> Organization ["
						+ name
						+ "] by "
						+ userPersistence.findByPrimaryKey(getUserId())
								.getScreenName());

		return vOrg;
	}

	@SuppressWarnings("deprecation")
	public VLegalOrg updateOrg(VLegalOrg vOrg) throws PortalException,
			SystemException, RemoteException {
		try {
			return updateOrg(vOrg.getGroupId(), vOrg.getOrgId(), vOrg.getName(),
					vOrg.getDescription(), vOrg.getLanguage(), vOrg.getRssable(),
					vOrg.getStatusOrg(), vOrg.getPosition());
		} catch (NoSuchVLegalOrgException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (NoSuchUserException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (PrincipalException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (com.liferay.portal.kernel.exception.SystemException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	@SuppressWarnings("deprecation")
	public void addEntryResources(long entryId,
			boolean addCommunityPermissions, boolean addGuestPermissions)
			throws PortalException, SystemException {

		VLegalOrg entry;
		try {
			entry = vLegalOrgPersistence.findByPrimaryKey(String
					.valueOf(entryId));
			
			addEntryResources(entry, addCommunityPermissions, addGuestPermissions);
		} catch (NoSuchVLegalOrgException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (com.liferay.portal.kernel.exception.SystemException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		
	}

	@SuppressWarnings("deprecation")
	public void addEntryResources(VLegalOrg entry,
			boolean addCommunityPermissions, boolean addGuestPermissions)
			throws PortalException, SystemException {

		try {
			resourceLocalService.addResources(entry.getCompanyId(), entry
					.getGroupId(), entry.getUserId(), VLegalOrg.class.getName(),
					entry.getOrgId(), false, addCommunityPermissions,
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

		VLegalOrg entry;
		try {
			entry = vLegalOrgPersistence.findByPrimaryKey(String
					.valueOf(entryId));
			
			addEntryResources(entry, communityPermissions, guestPermissions);
		} catch (NoSuchVLegalOrgException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (com.liferay.portal.kernel.exception.SystemException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@SuppressWarnings("deprecation")
	public void addEntryResources(VLegalOrg entry,
			String[] communityPermissions, String[] guestPermissions)
			throws PortalException, SystemException {

		try {
			resourceLocalService.addModelResources(entry.getCompanyId(), entry
					.getGroupId(), entry.getUserId(), VLegalOrg.class.getName(),
					entry.getOrgId(), communityPermissions, guestPermissions);
		} catch (com.liferay.portal.kernel.exception.PortalException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (com.liferay.portal.kernel.exception.SystemException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@SuppressWarnings("rawtypes")
	public List getAllOrg() throws PortalException, SystemException,
			RemoteException {
		try {
			return vLegalOrgPersistence.findAll();
		} catch (com.liferay.portal.kernel.exception.SystemException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	@SuppressWarnings("deprecation")
	public List getAllOrgByS_L(long groupId, boolean status, String language) {
		try {
			return vLegalOrgPersistence.findByS_L(groupId, status, language);
		} catch (com.liferay.portal.kernel.exception.SystemException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	@SuppressWarnings({ "rawtypes", "deprecation" })
	public List getAllOrgByS_Rss(long groupId, boolean status, boolean rssable)
			throws PortalException, SystemException, RemoteException {
		try {
			return vLegalOrgPersistence.findByS_Rss(groupId, status, rssable);
		} catch (com.liferay.portal.kernel.exception.SystemException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	@SuppressWarnings({ "deprecation", "rawtypes" })
	public List getOrgByGroupId(long groupId) throws SystemException {
		try {
			return vLegalOrgPersistence.findByGroupId(groupId);
		} catch (com.liferay.portal.kernel.exception.SystemException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	@SuppressWarnings({ "rawtypes", "deprecation" })
	public List getOrgByGroupId(long groupId, int begin, int end)
			throws SystemException {
		try {
			return vLegalOrgPersistence.findByGroupId(groupId, begin, end);
		} catch (com.liferay.portal.kernel.exception.SystemException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	@SuppressWarnings("deprecation")
	public int countOrgByGroupId(long groupId) throws SystemException {
		try {
			return vLegalOrgPersistence.countByGroupId(groupId);
		} catch (com.liferay.portal.kernel.exception.SystemException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return 0;
	}

	// Get a Organization
	@SuppressWarnings("deprecation")
	public VLegalOrg getOrg(String orgId){
		try
		{
		if (Validator.isNull(orgId)) {
			
			throw new NoSuchVLegalOrgException();
			
		}
			return vLegalOrgPersistence.findByPrimaryKey(orgId);
		}catch(Exception ex)
		{
			
		}
		return null;
	}

	// Get a Organization
	@SuppressWarnings("deprecation")
	public VLegalOrg getOrg(long groupId, String orgId) throws PortalException,
			SystemException, RemoteException {
		if (Validator.isNull(orgId)) {
			try {
				throw new NoSuchVLegalOrgException();
			} catch (NoSuchVLegalOrgException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		try {
			return vLegalOrgPersistence.findByG_O(groupId, orgId);
		} catch (NoSuchVLegalOrgException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (com.liferay.portal.kernel.exception.SystemException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	// Delete Organization
	@SuppressWarnings({ "deprecation", "rawtypes" })
	public void deleteOrg(String orgId) throws PortalException,
			SystemException, RemoteException {

		try
		{
			VLegalOrgPermission.check(getPermissionChecker(), orgId,
					ActionKeysExt.DELETE);
	
			if (Validator.isNull(orgId)) {
				throw new NoSuchVLegalOrgException();
			}
	
			VLegalOrg vOrg = vLegalOrgPersistence.findByPrimaryKey(orgId);
	
			List listDocByOrg = (List) VLegalDocumentServiceUtil.getDocByG_L_O(vOrg
					.getGroupId(), vOrg.getLanguage(), orgId);
	
			if (Validator.isNotNull(listDocByOrg) && listDocByOrg.size() > 0) {
				throw new DeleteOrgException();
			}
	
			String name = vOrg.getName();
	
			vLegalOrgPersistence.remove(vOrg);
	
			// Logging...
			VLegalLoggerServiceUtil.log(0, CalendarUtil.getTimestamp(new Date())
					+ " -- DELETE: [vlegal] -> organization [" + name + "] by "
					+ getUserId());
		}catch(Exception ex)
		{
			
		}

	}

	@SuppressWarnings("deprecation")
	public void _validator(String name)
			throws PortalException, SystemException {
		if (Validator.isNull(name)|| Validator.equals(name, "")) {
			try {
				throw new InvalidOrgNameExceptionException();
			} catch (InvalidOrgNameExceptionException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	@SuppressWarnings("deprecation")
	@Override
	public VLegalOrg addOrg(long arg0, String arg1, String arg2, String arg3,
			boolean arg4, boolean arg5, String arg6, ThemeDisplay arg7)
			throws PortalException, SystemException, RemoteException {
		// TODO Auto-generated method stub
		return null;
	}

	@SuppressWarnings("deprecation")
	@Override
	public VLegalOrg addOrg(long arg0, long arg1, long arg2, String arg3,
			String arg4, String arg5, boolean arg6, boolean arg7, String arg8,
			ThemeDisplay arg9) throws PortalException, SystemException,
			RemoteException {
		// TODO Auto-generated method stub
		return null;
	}

	@SuppressWarnings("deprecation")
	@Override
	public int countOrgByG_L(long arg0, String arg1) throws PortalException,
			SystemException, RemoteException {
		// TODO Auto-generated method stub
		return 0;
	}

	@SuppressWarnings("deprecation")
	@Override
	public int countOrgByG_L_P_S(long arg0, String arg1, String arg2,
			boolean arg3) throws PortalException, SystemException,
			RemoteException {
		// TODO Auto-generated method stub
		return 0;
	}

	@SuppressWarnings("deprecation")
	@Override
	public int countOrgByG_L_S(long arg0, String arg1, String arg2)
			throws PortalException, SystemException, RemoteException {
		// TODO Auto-generated method stub
		return 0;
	}

	@SuppressWarnings({ "rawtypes", "deprecation" })
	@Override
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List getOrgByG_L(long arg0, String arg1) throws PortalException,
			SystemException, RemoteException {
		// TODO Auto-generated method stub
		return null;
	}

	@SuppressWarnings({ "rawtypes", "deprecation" })
	@Override
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List getOrgByG_L(long arg0, String arg1, int arg2, int arg3)
			throws PortalException, SystemException, RemoteException {
		// TODO Auto-generated method stub
		return null;
	}

	@SuppressWarnings({ "rawtypes", "deprecation" })
	@Override
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List getOrgByG_L_P(long arg0, String arg1, String arg2)
			throws PortalException, SystemException, RemoteException {
		// TODO Auto-generated method stub
		return null;
	}

	@SuppressWarnings({ "rawtypes", "deprecation" })
	@Override
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List getOrgByG_L_P(long arg0, String arg1, String arg2, int arg3,
			int arg4) throws PortalException, SystemException, RemoteException {
		// TODO Auto-generated method stub
		return null;
	}

	@SuppressWarnings({ "rawtypes", "deprecation" })
	@Override
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List getOrgByG_L_P_S(long arg0, String arg1, String arg2,
			boolean arg3) throws PortalException, SystemException,
			RemoteException {
		// TODO Auto-generated method stub
		return null;
	}

	@SuppressWarnings({ "rawtypes", "deprecation" })
	@Override
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List getOrgByG_L_P_S(long arg0, String arg1, String arg2,
			boolean arg3, int arg4, int arg5) throws PortalException,
			SystemException, RemoteException {
		// TODO Auto-generated method stub
		return null;
	}

	@SuppressWarnings("deprecation")
	@Override
	public VLegalOrg updateOrg(long arg0, String arg1, String arg2,
			String arg3, String arg4, boolean arg5, boolean arg6, String arg7,
			int arg8) throws PortalException, SystemException, RemoteException {
		// TODO Auto-generated method stub
		return null;
	}
}