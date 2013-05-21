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
 * The utility for the v legal type remote service. This utility wraps {@link com.vportal.portlet.vlegal.service.impl.VLegalTypeServiceImpl} and is the primary access point for service operations in application layer code running on a remote server.
 *
 * <p>
 * Never modify this class directly. Add custom service methods to {@link com.vportal.portlet.vlegal.service.impl.VLegalTypeServiceImpl} and rerun ServiceBuilder to regenerate this class.
 * </p>
 *
 * <p>
 * This is a remote service. Methods of this service are expected to have security checks based on the propagated JAAS credentials because this service can be accessed remotely.
 * </p>
 *
 * @author ACB
 * @see VLegalTypeService
 * @see com.vportal.portlet.vlegal.service.base.VLegalTypeServiceBaseImpl
 * @see com.vportal.portlet.vlegal.service.impl.VLegalTypeServiceImpl
 * @generated
 */
public class VLegalTypeServiceUtil {
	public static com.vportal.portlet.vlegal.model.VLegalType addType(
		long groupId, java.lang.String name, java.lang.String description,
		java.lang.String language, boolean status, boolean rssable,
		java.lang.String[] communityPermissions,
		java.lang.String[] guestPermissions,
		com.liferay.portal.theme.ThemeDisplay themeDisplay)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			com.liferay.portal.security.auth.PrincipalException,
			java.rmi.RemoteException {
		return getService()
				   .addType(groupId, name, description, language, status,
			rssable, communityPermissions, guestPermissions, themeDisplay);
	}

	public static com.vportal.portlet.vlegal.model.VLegalType addType(
		long groupId, java.lang.String name, java.lang.String description,
		java.lang.String language, boolean status, boolean rssable,
		java.lang.Boolean addCommunityPermissions,
		java.lang.Boolean addGuestPermissions,
		java.lang.String[] communityPermissions,
		java.lang.String[] guestPermissions,
		com.liferay.portal.theme.ThemeDisplay themeDisplay)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException, java.rmi.RemoteException {
		return getService()
				   .addType(groupId, name, description, language, status,
			rssable, addCommunityPermissions, addGuestPermissions,
			communityPermissions, guestPermissions, themeDisplay);
	}

	public static com.vportal.portlet.vlegal.model.VLegalType updateType(
		long groupId, java.lang.String typeId, java.lang.String language,
		java.lang.String name, java.lang.String description, int position,
		boolean status, boolean rssable)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException, java.rmi.RemoteException {
		return getService()
				   .updateType(groupId, typeId, language, name, description,
			position, status, rssable);
	}

	public static com.vportal.portlet.vlegal.model.VLegalType updateType(
		com.vportal.portlet.vlegal.model.VLegalType lType)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException, java.rmi.RemoteException {
		return getService().updateType(lType);
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
		com.vportal.portlet.vlegal.model.VLegalType entry,
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
		com.vportal.portlet.vlegal.model.VLegalType entry,
		java.lang.String[] communityPermissions,
		java.lang.String[] guestPermissions)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		getService()
			.addEntryResources(entry, communityPermissions, guestPermissions);
	}

	public static void deleteType(java.lang.String typeId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException, java.rmi.RemoteException {
		getService().deleteType(typeId);
	}

	public static void deleteTypeAndDocs(java.lang.String typeId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException, java.rmi.RemoteException {
		getService().deleteTypeAndDocs(typeId);
	}

	public static com.vportal.portlet.vlegal.model.VLegalType getType(
		java.lang.String typeId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException, java.rmi.RemoteException {
		return getService().getType(typeId);
	}

	public static com.vportal.portlet.vlegal.model.VLegalType getType(
		long groupId, java.lang.String typeId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException, java.rmi.RemoteException {
		return getService().getType(groupId, typeId);
	}

	public static java.util.List getDocByType(java.lang.String typeId,
		java.lang.String language)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException, java.rmi.RemoteException {
		return getService().getDocByType(typeId, language);
	}

	public static java.util.List getAllTypes()
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException, java.rmi.RemoteException {
		return getService().getAllTypes();
	}

	public static java.util.List getTypeByGroupId(long groupId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException, java.rmi.RemoteException {
		return getService().getTypeByGroupId(groupId);
	}

	public static java.util.List getTypeByGroupId(long groupId, int begin,
		int end)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException, java.rmi.RemoteException {
		return getService().getTypeByGroupId(groupId, begin, end);
	}

	public static int countTypeByGroupId(long groupId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException, java.rmi.RemoteException {
		return getService().countTypeByGroupId(groupId);
	}

	public static java.util.List getTypesByL_S(long groupId,
		java.lang.String language, boolean status)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException, java.rmi.RemoteException {
		return getService().getTypesByL_S(groupId, language, status);
	}

	public static java.util.List getTypesByL_RSS(long groupId, boolean status,
		boolean rss)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException, java.rmi.RemoteException {
		return getService().getTypesByL_RSS(groupId, status, rss);
	}

	public static com.vportal.portlet.vlegal.model.VLegalType addTypeNew(
		long arg0, long arg1, long arg2, java.lang.String arg3,
		java.lang.String arg4, java.lang.String arg5, boolean arg6,
		boolean arg7, com.liferay.portal.theme.ThemeDisplay arg8)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException, java.rmi.RemoteException {
		return getService()
				   .addTypeNew(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7,
			arg8);
	}

	public static java.util.List getDocByType(java.lang.String arg0,
		java.lang.String arg1, int arg2)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException, java.rmi.RemoteException {
		return getService().getDocByType(arg0, arg1, arg2);
	}

	public static com.vportal.portlet.vlegal.model.VLegalType updateTypeNew(
		long arg0, long arg1, java.lang.String arg2, java.lang.String arg3,
		java.lang.String arg4, java.lang.String arg5, int arg6, boolean arg7,
		boolean arg8)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException, java.rmi.RemoteException {
		return getService()
				   .updateTypeNew(arg0, arg1, arg2, arg3, arg4, arg5, arg6,
			arg7, arg8);
	}

	public static void clearService() {
		_service = null;
	}

	public static VLegalTypeService getService() {
		if (_service == null) {
			Object obj = PortletBeanLocatorUtil.locate(ClpSerializer.SERVLET_CONTEXT_NAME,
					VLegalTypeService.class.getName());
			ClassLoader portletClassLoader = (ClassLoader)PortletBeanLocatorUtil.locate(ClpSerializer.SERVLET_CONTEXT_NAME,
					"portletClassLoader");

			ClassLoaderProxy classLoaderProxy = new ClassLoaderProxy(obj,
					portletClassLoader);

			_service = new VLegalTypeServiceClp(classLoaderProxy);

			ClpSerializer.setClassLoader(portletClassLoader);
		}

		return _service;
	}

	public void setService(VLegalTypeService service) {
		_service = service;
	}

	private static VLegalTypeService _service;
}