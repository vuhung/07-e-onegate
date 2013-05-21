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

package com.vportal.portlet.vlegal.service;

import com.liferay.portal.kernel.annotation.Isolation;
import com.liferay.portal.kernel.annotation.Propagation;
import com.liferay.portal.kernel.annotation.Transactional;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;

/**
 * The interface for the v legal org remote service.
 *
 * <p>
 * Never modify or reference this interface directly. Always use {@link VLegalOrgServiceUtil} to access the v legal org remote service. Add custom service methods to {@link com.vportal.portlet.vlegal.service.impl.VLegalOrgServiceImpl} and rerun ServiceBuilder to automatically copy the method declarations to this interface.
 * </p>
 *
 * <p>
 * This is a remote service. Methods of this service are expected to have security checks based on the propagated JAAS credentials because this service can be accessed remotely.
 * </p>
 *
 * @author ACB
 * @see VLegalOrgServiceUtil
 * @see com.vportal.portlet.vlegal.service.base.VLegalOrgServiceBaseImpl
 * @see com.vportal.portlet.vlegal.service.impl.VLegalOrgServiceImpl
 * @generated
 */
@Transactional(isolation = Isolation.PORTAL, rollbackFor =  {
	PortalException.class, SystemException.class})
public interface VLegalOrgService {
	public com.vportal.portlet.vlegal.model.VLegalOrg addOrg(long groupId,
		java.lang.String name, java.lang.String description,
		java.lang.String language, boolean rssable, boolean status,
		java.lang.String[] communityPermissions,
		java.lang.String[] guestPermissions,
		com.liferay.portal.theme.ThemeDisplay themeDisplay)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			com.liferay.portal.security.auth.PrincipalException,
			java.rmi.RemoteException;

	public com.vportal.portlet.vlegal.model.VLegalOrg addOrg(long groupId,
		java.lang.String name, java.lang.String description,
		java.lang.String language, boolean rssable, boolean status,
		java.lang.Boolean addCommunityPermissions,
		java.lang.Boolean addGuestPermissions,
		java.lang.String[] communityPermissions,
		java.lang.String[] guestPermissions,
		com.liferay.portal.theme.ThemeDisplay themeDisplay)
		throws com.liferay.portal.NoSuchUserException,
			com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			com.liferay.portal.security.auth.PrincipalException,
			java.rmi.RemoteException;

	public com.vportal.portlet.vlegal.model.VLegalOrg updateOrg(long groupId,
		java.lang.String orgId, java.lang.String name,
		java.lang.String description, java.lang.String language,
		boolean rssable, boolean status, int position)
		throws com.liferay.portal.NoSuchUserException,
			com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			com.liferay.portal.security.auth.PrincipalException,
			com.vportal.portlet.vlegal.NoSuchVLegalOrgException,
			java.rmi.RemoteException;

	public com.vportal.portlet.vlegal.model.VLegalOrg updateOrg(
		com.vportal.portlet.vlegal.model.VLegalOrg vOrg)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException, java.rmi.RemoteException;

	public void addEntryResources(long entryId,
		boolean addCommunityPermissions, boolean addGuestPermissions)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException;

	public void addEntryResources(
		com.vportal.portlet.vlegal.model.VLegalOrg entry,
		boolean addCommunityPermissions, boolean addGuestPermissions)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException;

	public void addEntryResources(long entryId,
		java.lang.String[] communityPermissions,
		java.lang.String[] guestPermissions)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException;

	public void addEntryResources(
		com.vportal.portlet.vlegal.model.VLegalOrg entry,
		java.lang.String[] communityPermissions,
		java.lang.String[] guestPermissions)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public java.util.List getAllOrg()
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException, java.rmi.RemoteException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public java.util.List getAllOrgByS_L(long groupId, boolean status,
		java.lang.String language);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public java.util.List getAllOrgByS_Rss(long groupId, boolean status,
		boolean rssable)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException, java.rmi.RemoteException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public java.util.List getOrgByGroupId(long groupId)
		throws com.liferay.portal.kernel.exception.SystemException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public java.util.List getOrgByGroupId(long groupId, int begin, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	public int countOrgByGroupId(long groupId)
		throws com.liferay.portal.kernel.exception.SystemException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public com.vportal.portlet.vlegal.model.VLegalOrg getOrg(
		java.lang.String orgId);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public com.vportal.portlet.vlegal.model.VLegalOrg getOrg(long groupId,
		java.lang.String orgId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException, java.rmi.RemoteException;

	public void deleteOrg(java.lang.String orgId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException, java.rmi.RemoteException;

	public void _validator(java.lang.String name)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException;

	public com.vportal.portlet.vlegal.model.VLegalOrg addOrg(long arg0,
		java.lang.String arg1, java.lang.String arg2, java.lang.String arg3,
		boolean arg4, boolean arg5, java.lang.String arg6,
		com.liferay.portal.theme.ThemeDisplay arg7)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException, java.rmi.RemoteException;

	public com.vportal.portlet.vlegal.model.VLegalOrg addOrg(long arg0,
		long arg1, long arg2, java.lang.String arg3, java.lang.String arg4,
		java.lang.String arg5, boolean arg6, boolean arg7,
		java.lang.String arg8, com.liferay.portal.theme.ThemeDisplay arg9)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException, java.rmi.RemoteException;

	public int countOrgByG_L(long arg0, java.lang.String arg1)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException, java.rmi.RemoteException;

	public int countOrgByG_L_P_S(long arg0, java.lang.String arg1,
		java.lang.String arg2, boolean arg3)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException, java.rmi.RemoteException;

	public int countOrgByG_L_S(long arg0, java.lang.String arg1,
		java.lang.String arg2)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException, java.rmi.RemoteException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public java.util.List getOrgByG_L(long arg0, java.lang.String arg1)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException, java.rmi.RemoteException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public java.util.List getOrgByG_L(long arg0, java.lang.String arg1,
		int arg2, int arg3)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException, java.rmi.RemoteException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public java.util.List getOrgByG_L_P(long arg0, java.lang.String arg1,
		java.lang.String arg2)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException, java.rmi.RemoteException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public java.util.List getOrgByG_L_P(long arg0, java.lang.String arg1,
		java.lang.String arg2, int arg3, int arg4)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException, java.rmi.RemoteException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public java.util.List getOrgByG_L_P_S(long arg0, java.lang.String arg1,
		java.lang.String arg2, boolean arg3)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException, java.rmi.RemoteException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public java.util.List getOrgByG_L_P_S(long arg0, java.lang.String arg1,
		java.lang.String arg2, boolean arg3, int arg4, int arg5)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException, java.rmi.RemoteException;

	public com.vportal.portlet.vlegal.model.VLegalOrg updateOrg(long arg0,
		java.lang.String arg1, java.lang.String arg2, java.lang.String arg3,
		java.lang.String arg4, boolean arg5, boolean arg6,
		java.lang.String arg7, int arg8)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException, java.rmi.RemoteException;
}