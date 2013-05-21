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
import com.vportal.portlet.vlegal.InvalidSignerFirstNameExceptionException;
import com.vportal.portlet.vlegal.InvalidSignerLastNameExceptionException;
import com.vportal.portlet.vlegal.NoSuchVLegalSignerException;
import com.vportal.portlet.vlegal.model.VLegalSigner;
import com.vportal.portlet.vlegal.service.VLegalLoggerServiceUtil;
import com.vportal.portlet.vlegal.service.VLegalSignerServiceUtil;
import com.vportal.portlet.vlegal.service.base.VLegalSignerServiceBaseImpl;
import com.vportal.portlet.vlegal.service.permission.VLegalSignerPermission;
import com.vportal.portlet.vlegal.util.permission.ActionKeysExt;

/**
 * The implementation of the v legal signer remote service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link com.vportal.portlet.vlegal.service.VLegalSignerService} interface.
 * </p>
 *
 * <p>
 * Never reference this interface directly. Always use {@link com.vportal.portlet.vlegal.service.VLegalSignerServiceUtil} to access the v legal signer remote service.
 * </p>
 *
 * <p>
 * This is a remote service. Methods of this service are expected to have security checks based on the propagated JAAS credentials because this service can be accessed remotely.
 * </p>
 *
 * @author ACB
 * @see com.vportal.portlet.vlegal.service.base.VLegalSignerServiceBaseImpl
 * @see com.vportal.portlet.vlegal.service.VLegalSignerServiceUtil
 */
public class VLegalSignerServiceImpl extends VLegalSignerServiceBaseImpl {
	public VLegalSigner addSigner(long groupId, String firstName,
			String lastName, String language, boolean statusSigner,
			String[] communityPermissions, String[] guestPermissions,
			ThemeDisplay themeDisplay) throws RemoteException, PrincipalException, com.liferay.portal.kernel.exception.PortalException, com.liferay.portal.kernel.exception.SystemException {

		PortletPermissionUtil.check(getPermissionChecker(), themeDisplay
				.getLayout().getPlid(), PortletKeysExt.VLEGAL,
				ActionKeysExt.ADD);

		return addSigner(groupId, firstName, lastName, language, statusSigner, null,
				null, communityPermissions, guestPermissions, themeDisplay);
	}

	@SuppressWarnings("deprecation")
	public VLegalSigner addSigner(long groupId, String firstName,
			String lastName, String language, boolean statusSigner,
			Boolean addCommunityPermissions, Boolean addGuestPermissions,
			String[] communityPermissions, String[] guestPermissions,
			ThemeDisplay themeDisplay) throws PortalException, RemoteException, com.liferay.portal.kernel.exception.SystemException, PrincipalException, NoSuchUserException {

		_validator(firstName, lastName);
		String sigId = String.valueOf(counterLocalService.increment());
		Date now = new Date();

		long userId = getUserId();
		User user = userPersistence.findByPrimaryKey(userId);
		VLegalSigner vSigner = vLegalSignerPersistence.create(sigId);

		vSigner.setFirstName(firstName);
		vSigner.setLastName(lastName);
		vSigner.setLanguage(language);
		vSigner.setStatusSigner(statusSigner);

		vSigner.setCreatedDate(now);
		vSigner.setCreatedByUser(getUserId());
		vSigner.setUserId(getUserId());
		vSigner.setCompanyId(user.getCompanyId());
		vSigner.setGroupId(groupId);

		vSigner.setModifiedDate(now);

		vLegalSignerPersistence.update(vSigner,false);

		// Resources

		if ((addCommunityPermissions != null) && (addGuestPermissions != null)) {

			addEntryResources(vSigner, addCommunityPermissions.booleanValue(),
					addGuestPermissions.booleanValue());
		} else {
			addEntryResources(vSigner, communityPermissions, guestPermissions);
		}
		// Logging...
		VLegalLoggerServiceUtil.log(groupId, CalendarUtil.getTimestamp(now)
				+ " -- CREATE: [vlegal] -> signer [" + firstName + " "
				+ lastName + "] by " + user.getScreenName());

		return vSigner;

	}

	// Update Signer
	@SuppressWarnings("deprecation")
	public VLegalSigner updateSigner(long groupId, String sigId,
			String firstName, String lastName, String language, boolean statusSigner)
			throws PortalException, SystemException, RemoteException {

		try
		{
			VLegalSignerPermission.check(getPermissionChecker(), sigId,
					ActionKeysExt.UPDATE);
	
			_validator(firstName, lastName);
	
			VLegalSigner vSigner = vLegalSignerPersistence.findByPrimaryKey(sigId);
	
			vSigner.setFirstName(firstName);
			vSigner.setLastName(lastName);
			vSigner.setLanguage(language);
			vSigner.setStatusSigner(statusSigner);
	
			vLegalSignerPersistence.update(vSigner,false);
			// Logging...
			VLegalLoggerServiceUtil.log(groupId, CalendarUtil
					.getTimestamp(new Date())
					+ " -- UPDATE: [vlegal] -> signer ["
					+ firstName
					+ " "
					+ lastName + "] by " + getUserId());
	
			return vSigner;
		}catch(Exception ex)
		{
			
		}
		
		return null;
	}

	@SuppressWarnings("deprecation")
	public VLegalSigner updateSigner(VLegalSigner vSigner)
			throws PortalException, SystemException, RemoteException {
		return updateSigner(vSigner.getGroupId(), vSigner.getSigId(), vSigner
				.getFirstName(), vSigner.getLastName(), vSigner.getLanguage(),
				vSigner.getStatusSigner());
	}

	@SuppressWarnings("deprecation")
	public void addEntryResources(long entryId,
			boolean addCommunityPermissions, boolean addGuestPermissions)
			throws PortalException, SystemException {

		VLegalSigner entry;
		try {
			entry = vLegalSignerPersistence.findByPrimaryKey(String
					.valueOf(entryId));
			
			addEntryResources(entry, addCommunityPermissions, addGuestPermissions);
		} catch (NoSuchVLegalSignerException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (com.liferay.portal.kernel.exception.SystemException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@SuppressWarnings("deprecation")
	public void addEntryResources(VLegalSigner entry,
			boolean addCommunityPermissions, boolean addGuestPermissions)
			throws PortalException, SystemException {

		try {
			resourceLocalService.addResources(entry.getCompanyId(), entry
					.getGroupId(), entry.getUserId(), VLegalSigner.class.getName(),
					entry.getSigId(), false, addCommunityPermissions,
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

		VLegalSigner entry;
		try {
			entry = vLegalSignerPersistence.findByPrimaryKey(String
					.valueOf(entryId));
			
			addEntryResources(entry, communityPermissions, guestPermissions);
		} catch (NoSuchVLegalSignerException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (com.liferay.portal.kernel.exception.SystemException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
	}

	@SuppressWarnings("deprecation")
	public void addEntryResources(VLegalSigner entry,
			String[] communityPermissions, String[] guestPermissions)
			throws PortalException, SystemException {

		try {
			resourceLocalService.addModelResources(entry.getCompanyId(), entry
					.getGroupId(), entry.getUserId(), VLegalSigner.class.getName(),
					entry.getSigId(), communityPermissions, guestPermissions);
		} catch (com.liferay.portal.kernel.exception.PortalException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (com.liferay.portal.kernel.exception.SystemException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@SuppressWarnings({ "deprecation", "rawtypes" })
	public List getSignerByGroupId(long groupId) throws SystemException {
		try {
			return vLegalSignerPersistence.findByGroupId(groupId);
		} catch (com.liferay.portal.kernel.exception.SystemException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	@SuppressWarnings({ "rawtypes", "deprecation" })
	public List getSignerByGroupId(long groupId,int begin,int end) throws SystemException {
		try {
			return vLegalSignerPersistence.findByGroupId(groupId,begin,end);
		} catch (com.liferay.portal.kernel.exception.SystemException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return null;
	}
	@SuppressWarnings("deprecation")
	public int countSignerByGroupId(long groupId) throws SystemException {
		try {
			return vLegalSignerPersistence.countByGroupId(groupId);
		} catch (com.liferay.portal.kernel.exception.SystemException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return 0;
	}

	// List all signer by groupId + language + status
	@SuppressWarnings({ "rawtypes", "deprecation" })
	public List getAllByG_L_S(long groupId, String language,
			boolean statusSigner) throws PortalException, SystemException,
			RemoteException {
		try {
			return vLegalSignerPersistence.findByG_L_S(groupId, language, statusSigner);
		} catch (com.liferay.portal.kernel.exception.SystemException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	// List all signer by groupid and language
	@SuppressWarnings({ "rawtypes", "deprecation" })
	public List getAllSignerByG_L(long groupId, String language)
			throws PortalException, SystemException, RemoteException {
		try {
			return vLegalSignerPersistence.findByGroup_Lang(groupId, language);
		} catch (com.liferay.portal.kernel.exception.SystemException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	// List all signer
	@SuppressWarnings({ "rawtypes", "deprecation" })
	public List getAllSigner() throws PortalException, SystemException,
			RemoteException {
		try {
			return vLegalSignerPersistence.findAll();
		} catch (com.liferay.portal.kernel.exception.SystemException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	// Get a Signer
	@SuppressWarnings("deprecation")
	public VLegalSigner getSigner(String sigId){
		try
		{
		if (Validator.isNull(sigId)) {
			
			throw new NoSuchVLegalSignerException();
			
		}
			return vLegalSignerPersistence.findByPrimaryKey(sigId);
		}catch(Exception ex)
		{
			
		}
		return null;
	}

	// Get a Signer
	@SuppressWarnings("deprecation")
	public VLegalSigner getSigner(long groupId, String sigId){
		try
		{
		if (Validator.isNull(sigId)) {
			throw new NoSuchVLegalSignerException();
		}
			return vLegalSignerPersistence.findByG_S(groupId, sigId);
		}catch(Exception ex)
		{
			
		}
		return null;
	}

	// Delete Signer
	@SuppressWarnings("deprecation")
	public void deleteSigner(String sigId) throws PortalException,
			SystemException, RemoteException {

		try
		{
		VLegalSignerPermission.check(getPermissionChecker(), sigId,
				ActionKeysExt.DELETE);

		if (Validator.isNull(sigId)) {
			throw new NoSuchVLegalSignerException();
		}
		String firstName = VLegalSignerServiceUtil.getSigner(sigId)
				.getFirstName();
		String lastName = VLegalSignerServiceUtil.getSigner(sigId)
				.getLastName();

		vLegalSignerPersistence.remove(sigId);
		// Logging...
		VLegalLoggerServiceUtil.log(0, CalendarUtil.getTimestamp(new Date())
				+ " -- DELETE: [vlegal] -> signer [" + firstName + " "
				+ lastName + "] by " + getUserId());
		
		}catch(Exception ex)
		{
			
		}

	}

	@SuppressWarnings("deprecation")
	public void _validator(String firstName, String lastName)
			throws PortalException, SystemException {
		if (Validator.isNull(firstName)) {
			try {
				throw new InvalidSignerFirstNameExceptionException();
			} catch (InvalidSignerFirstNameExceptionException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		if (Validator.isNull(lastName)) {
			try {
				throw new InvalidSignerLastNameExceptionException();
			} catch (InvalidSignerLastNameExceptionException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	@SuppressWarnings("deprecation")
	@Override
	public VLegalSigner addSigner(long arg0, String arg1, String arg2,
			String arg3, boolean arg4, ThemeDisplay arg5)
			throws PortalException, SystemException, RemoteException {
		// TODO Auto-generated method stub
		return null;
	}

	@SuppressWarnings("deprecation")
	@Override
	public VLegalSigner addSigner(long arg0, long arg1, long arg2, String arg3,
			String arg4, String arg5, boolean arg6, ThemeDisplay arg7)
			throws PortalException, SystemException, RemoteException {
		// TODO Auto-generated method stub
		return null;
	}
}