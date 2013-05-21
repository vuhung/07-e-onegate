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

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.util.ClassLoaderProxy;

/**
 * The utility for the v legal org remote service. This utility wraps {@link com.vportal.portlet.vlegal.service.impl.VLegalOrgServiceImpl} and is the primary access point for service operations in application layer code running on a remote server.
 *
 * <p>
 * Never modify this class directly. Add custom service methods to {@link com.vportal.portlet.vlegal.service.impl.VLegalOrgServiceImpl} and rerun ServiceBuilder to regenerate this class.
 * </p>
 *
 * <p>
 * This is a remote service. Methods of this service are expected to have security checks based on the propagated JAAS credentials because this service can be accessed remotely.
 * </p>
 *
 * @author ACB
 * @see VLegalOrgService
 * @see com.vportal.portlet.vlegal.service.base.VLegalOrgServiceBaseImpl
 * @see com.vportal.portlet.vlegal.service.impl.VLegalOrgServiceImpl
 * @generated
 */
public class VLegalOrgServiceUtil {
	public static com.vportal.portlet.vlegal.model.VLegalOrg addOrg(
		long groupId, java.lang.String name, java.lang.String description,
		java.lang.String language, boolean rssable, boolean status,
		java.lang.String[] communityPermissions,
		java.lang.String[] guestPermissions,
		com.liferay.portal.theme.ThemeDisplay themeDisplay)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			com.liferay.portal.security.auth.PrincipalException,
			java.rmi.RemoteException {
		return getService()
				   .addOrg(groupId, name, description, language, rssable,
			status, communityPermissions, guestPermissions, themeDisplay);
	}

	public static com.vportal.portlet.vlegal.model.VLegalOrg addOrg(
		long groupId, java.lang.String name, java.lang.String description,
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
			java.rmi.RemoteException {
		return getService()
				   .addOrg(groupId, name, description, language, rssable,
			status, addCommunityPermissions, addGuestPermissions,
			communityPermissions, guestPermissions, themeDisplay);
	}

	public static com.vportal.portlet.vlegal.model.VLegalOrg updateOrg(
		long groupId, java.lang.String orgId, java.lang.String name,
		java.lang.String description, java.lang.String language,
		boolean rssable, boolean status, int position)
		throws com.liferay.portal.NoSuchUserException,
			com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			com.liferay.portal.security.auth.PrincipalException,
			com.vportal.portlet.vlegal.NoSuchVLegalOrgException,
			java.rmi.RemoteException {
		return getService()
				   .updateOrg(groupId, orgId, name, description, language,
			rssable, status, position);
	}

	public static com.vportal.portlet.vlegal.model.VLegalOrg updateOrg(
		com.vportal.portlet.vlegal.model.VLegalOrg vOrg)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException, java.rmi.RemoteException {
		return getService().updateOrg(vOrg);
	}

	public static void addEntryResources(long entryId,
		boolean addCommunityPermissions, boolean addGuestPermissions)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		getService()
			.addEntryResources(entryId, addCommunityPermissions,
			addGuestPermissions);
	}

	public static void addEntryResources(
		com.vportal.portlet.vlegal.model.VLegalOrg entry,
		boolean addCommunityPermissions, boolean addGuestPermissions)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		getService()
			.addEntryResources(entry, addCommunityPermissions,
			addGuestPermissions);
	}

	public static void addEntryResources(long entryId,
		java.lang.String[] communityPermissions,
		java.lang.String[] guestPermissions)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		getService()
			.addEntryResources(entryId, communityPermissions, guestPermissions);
	}

	public static void addEntryResources(
		com.vportal.portlet.vlegal.model.VLegalOrg entry,
		java.lang.String[] communityPermissions,
		java.lang.String[] guestPermissions)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		getService()
			.addEntryResources(entry, communityPermissions, guestPermissions);
	}

	public static java.util.List getAllOrg()
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException, java.rmi.RemoteException {
		return getService().getAllOrg();
	}

	public static java.util.List getAllOrgByS_L(long groupId, boolean status,
		java.lang.String language) {
		return getService().getAllOrgByS_L(groupId, status, language);
	}

	public static java.util.List getAllOrgByS_Rss(long groupId, boolean status,
		boolean rssable)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException, java.rmi.RemoteException {
		return getService().getAllOrgByS_Rss(groupId, status, rssable);
	}

	public static java.util.List getOrgByGroupId(long groupId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getOrgByGroupId(groupId);
	}

	public static java.util.List getOrgByGroupId(long groupId, int begin,
		int end) throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getOrgByGroupId(groupId, begin, end);
	}

	public static int countOrgByGroupId(long groupId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().countOrgByGroupId(groupId);
	}

	public static com.vportal.portlet.vlegal.model.VLegalOrg getOrg(
		java.lang.String orgId) {
		return getService().getOrg(orgId);
	}

	public static com.vportal.portlet.vlegal.model.VLegalOrg getOrg(
		long groupId, java.lang.String orgId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException, java.rmi.RemoteException {
		return getService().getOrg(groupId, orgId);
	}

	public static void deleteOrg(java.lang.String orgId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException, java.rmi.RemoteException {
		getService().deleteOrg(orgId);
	}

	public static void _validator(java.lang.String name)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		getService()._validator(name);
	}

	public static com.vportal.portlet.vlegal.model.VLegalOrg addOrg(long arg0,
		java.lang.String arg1, java.lang.String arg2, java.lang.String arg3,
		boolean arg4, boolean arg5, java.lang.String arg6,
		com.liferay.portal.theme.ThemeDisplay arg7)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException, java.rmi.RemoteException {
		return getService()
				   .addOrg(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
	}

	public static com.vportal.portlet.vlegal.model.VLegalOrg addOrg(long arg0,
		long arg1, long arg2, java.lang.String arg3, java.lang.String arg4,
		java.lang.String arg5, boolean arg6, boolean arg7,
		java.lang.String arg8, com.liferay.portal.theme.ThemeDisplay arg9)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException, java.rmi.RemoteException {
		return getService()
				   .addOrg(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7,
			arg8, arg9);
	}

	public static int countOrgByG_L(long arg0, java.lang.String arg1)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException, java.rmi.RemoteException {
		return getService().countOrgByG_L(arg0, arg1);
	}

	public static int countOrgByG_L_P_S(long arg0, java.lang.String arg1,
		java.lang.String arg2, boolean arg3)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException, java.rmi.RemoteException {
		return getService().countOrgByG_L_P_S(arg0, arg1, arg2, arg3);
	}

	public static int countOrgByG_L_S(long arg0, java.lang.String arg1,
		java.lang.String arg2)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException, java.rmi.RemoteException {
		return getService().countOrgByG_L_S(arg0, arg1, arg2);
	}

	public static java.util.List getOrgByG_L(long arg0, java.lang.String arg1)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException, java.rmi.RemoteException {
		return getService().getOrgByG_L(arg0, arg1);
	}

	public static java.util.List getOrgByG_L(long arg0, java.lang.String arg1,
		int arg2, int arg3)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException, java.rmi.RemoteException {
		return getService().getOrgByG_L(arg0, arg1, arg2, arg3);
	}

	public static java.util.List getOrgByG_L_P(long arg0,
		java.lang.String arg1, java.lang.String arg2)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException, java.rmi.RemoteException {
		return getService().getOrgByG_L_P(arg0, arg1, arg2);
	}

	public static java.util.List getOrgByG_L_P(long arg0,
		java.lang.String arg1, java.lang.String arg2, int arg3, int arg4)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException, java.rmi.RemoteException {
		return getService().getOrgByG_L_P(arg0, arg1, arg2, arg3, arg4);
	}

	public static java.util.List getOrgByG_L_P_S(long arg0,
		java.lang.String arg1, java.lang.String arg2, boolean arg3)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException, java.rmi.RemoteException {
		return getService().getOrgByG_L_P_S(arg0, arg1, arg2, arg3);
	}

	public static java.util.List getOrgByG_L_P_S(long arg0,
		java.lang.String arg1, java.lang.String arg2, boolean arg3, int arg4,
		int arg5)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException, java.rmi.RemoteException {
		return getService().getOrgByG_L_P_S(arg0, arg1, arg2, arg3, arg4, arg5);
	}

	public static com.vportal.portlet.vlegal.model.VLegalOrg updateOrg(
		long arg0, java.lang.String arg1, java.lang.String arg2,
		java.lang.String arg3, java.lang.String arg4, boolean arg5,
		boolean arg6, java.lang.String arg7, int arg8)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException, java.rmi.RemoteException {
		return getService()
				   .updateOrg(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7,
			arg8);
	}

	public static void clearService() {
		_service = null;
	}

	public static VLegalOrgService getService() {
		if (_service == null) {
			Object obj = PortletBeanLocatorUtil.locate(ClpSerializer.SERVLET_CONTEXT_NAME,
					VLegalOrgService.class.getName());
			ClassLoader portletClassLoader = (ClassLoader)PortletBeanLocatorUtil.locate(ClpSerializer.SERVLET_CONTEXT_NAME,
					"portletClassLoader");

			ClassLoaderProxy classLoaderProxy = new ClassLoaderProxy(obj,
					portletClassLoader);

			_service = new VLegalOrgServiceClp(classLoaderProxy);

			ClpSerializer.setClassLoader(portletClassLoader);
		}

		return _service;
	}

	public void setService(VLegalOrgService service) {
		_service = service;
	}

	private static VLegalOrgService _service;
}