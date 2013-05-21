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
 * The utility for the v legal signer remote service. This utility wraps {@link com.vportal.portlet.vlegal.service.impl.VLegalSignerServiceImpl} and is the primary access point for service operations in application layer code running on a remote server.
 *
 * <p>
 * Never modify this class directly. Add custom service methods to {@link com.vportal.portlet.vlegal.service.impl.VLegalSignerServiceImpl} and rerun ServiceBuilder to regenerate this class.
 * </p>
 *
 * <p>
 * This is a remote service. Methods of this service are expected to have security checks based on the propagated JAAS credentials because this service can be accessed remotely.
 * </p>
 *
 * @author ACB
 * @see VLegalSignerService
 * @see com.vportal.portlet.vlegal.service.base.VLegalSignerServiceBaseImpl
 * @see com.vportal.portlet.vlegal.service.impl.VLegalSignerServiceImpl
 * @generated
 */
public class VLegalSignerServiceUtil {
	public static com.vportal.portlet.vlegal.model.VLegalSigner addSigner(
		long groupId, java.lang.String firstName, java.lang.String lastName,
		java.lang.String language, boolean statusSigner,
		java.lang.String[] communityPermissions,
		java.lang.String[] guestPermissions,
		com.liferay.portal.theme.ThemeDisplay themeDisplay)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			com.liferay.portal.security.auth.PrincipalException,
			java.rmi.RemoteException {
		return getService()
				   .addSigner(groupId, firstName, lastName, language,
			statusSigner, communityPermissions, guestPermissions, themeDisplay);
	}

	public static com.vportal.portlet.vlegal.model.VLegalSigner addSigner(
		long groupId, java.lang.String firstName, java.lang.String lastName,
		java.lang.String language, boolean statusSigner,
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
				   .addSigner(groupId, firstName, lastName, language,
			statusSigner, addCommunityPermissions, addGuestPermissions,
			communityPermissions, guestPermissions, themeDisplay);
	}

	public static com.vportal.portlet.vlegal.model.VLegalSigner updateSigner(
		long groupId, java.lang.String sigId, java.lang.String firstName,
		java.lang.String lastName, java.lang.String language,
		boolean statusSigner)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException, java.rmi.RemoteException {
		return getService()
				   .updateSigner(groupId, sigId, firstName, lastName, language,
			statusSigner);
	}

	public static com.vportal.portlet.vlegal.model.VLegalSigner updateSigner(
		com.vportal.portlet.vlegal.model.VLegalSigner vSigner)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException, java.rmi.RemoteException {
		return getService().updateSigner(vSigner);
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
		com.vportal.portlet.vlegal.model.VLegalSigner entry,
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
		com.vportal.portlet.vlegal.model.VLegalSigner entry,
		java.lang.String[] communityPermissions,
		java.lang.String[] guestPermissions)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		getService()
			.addEntryResources(entry, communityPermissions, guestPermissions);
	}

	public static java.util.List getSignerByGroupId(long groupId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getSignerByGroupId(groupId);
	}

	public static java.util.List getSignerByGroupId(long groupId, int begin,
		int end) throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getSignerByGroupId(groupId, begin, end);
	}

	public static int countSignerByGroupId(long groupId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().countSignerByGroupId(groupId);
	}

	public static java.util.List getAllByG_L_S(long groupId,
		java.lang.String language, boolean statusSigner)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException, java.rmi.RemoteException {
		return getService().getAllByG_L_S(groupId, language, statusSigner);
	}

	public static java.util.List getAllSignerByG_L(long groupId,
		java.lang.String language)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException, java.rmi.RemoteException {
		return getService().getAllSignerByG_L(groupId, language);
	}

	public static java.util.List getAllSigner()
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException, java.rmi.RemoteException {
		return getService().getAllSigner();
	}

	public static com.vportal.portlet.vlegal.model.VLegalSigner getSigner(
		java.lang.String sigId) {
		return getService().getSigner(sigId);
	}

	public static com.vportal.portlet.vlegal.model.VLegalSigner getSigner(
		long groupId, java.lang.String sigId) {
		return getService().getSigner(groupId, sigId);
	}

	public static void deleteSigner(java.lang.String sigId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException, java.rmi.RemoteException {
		getService().deleteSigner(sigId);
	}

	public static void _validator(java.lang.String firstName,
		java.lang.String lastName)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		getService()._validator(firstName, lastName);
	}

	public static com.vportal.portlet.vlegal.model.VLegalSigner addSigner(
		long arg0, java.lang.String arg1, java.lang.String arg2,
		java.lang.String arg3, boolean arg4,
		com.liferay.portal.theme.ThemeDisplay arg5)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException, java.rmi.RemoteException {
		return getService().addSigner(arg0, arg1, arg2, arg3, arg4, arg5);
	}

	public static com.vportal.portlet.vlegal.model.VLegalSigner addSigner(
		long arg0, long arg1, long arg2, java.lang.String arg3,
		java.lang.String arg4, java.lang.String arg5, boolean arg6,
		com.liferay.portal.theme.ThemeDisplay arg7)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException, java.rmi.RemoteException {
		return getService()
				   .addSigner(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
	}

	public static void clearService() {
		_service = null;
	}

	public static VLegalSignerService getService() {
		if (_service == null) {
			Object obj = PortletBeanLocatorUtil.locate(ClpSerializer.SERVLET_CONTEXT_NAME,
					VLegalSignerService.class.getName());
			ClassLoader portletClassLoader = (ClassLoader)PortletBeanLocatorUtil.locate(ClpSerializer.SERVLET_CONTEXT_NAME,
					"portletClassLoader");

			ClassLoaderProxy classLoaderProxy = new ClassLoaderProxy(obj,
					portletClassLoader);

			_service = new VLegalSignerServiceClp(classLoaderProxy);

			ClpSerializer.setClassLoader(portletClassLoader);
		}

		return _service;
	}

	public void setService(VLegalSignerService service) {
		_service = service;
	}

	private static VLegalSignerService _service;
}