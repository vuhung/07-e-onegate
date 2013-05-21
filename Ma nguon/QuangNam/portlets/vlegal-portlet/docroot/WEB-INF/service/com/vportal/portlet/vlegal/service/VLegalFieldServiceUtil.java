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
 * The utility for the v legal field remote service. This utility wraps {@link com.vportal.portlet.vlegal.service.impl.VLegalFieldServiceImpl} and is the primary access point for service operations in application layer code running on a remote server.
 *
 * <p>
 * Never modify this class directly. Add custom service methods to {@link com.vportal.portlet.vlegal.service.impl.VLegalFieldServiceImpl} and rerun ServiceBuilder to regenerate this class.
 * </p>
 *
 * <p>
 * This is a remote service. Methods of this service are expected to have security checks based on the propagated JAAS credentials because this service can be accessed remotely.
 * </p>
 *
 * @author ACB
 * @see VLegalFieldService
 * @see com.vportal.portlet.vlegal.service.base.VLegalFieldServiceBaseImpl
 * @see com.vportal.portlet.vlegal.service.impl.VLegalFieldServiceImpl
 * @generated
 */
public class VLegalFieldServiceUtil {
	public static com.vportal.portlet.vlegal.model.VLegalField addField(
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
				   .addField(groupId, name, description, language, status,
			rssable, communityPermissions, guestPermissions, themeDisplay);
	}

	public static com.vportal.portlet.vlegal.model.VLegalField addField(
		long groupId, java.lang.String name, java.lang.String description,
		java.lang.String language, boolean status, boolean rssable,
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
				   .addField(groupId, name, description, language, status,
			rssable, addCommunityPermissions, addGuestPermissions,
			communityPermissions, guestPermissions, themeDisplay);
	}

	public static com.vportal.portlet.vlegal.model.VLegalField updateField(
		long groupId, java.lang.String fieldId, java.lang.String name,
		java.lang.String description, java.lang.String language,
		boolean status, boolean rss)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException, java.rmi.RemoteException {
		return getService()
				   .updateField(groupId, fieldId, name, description, language,
			status, rss);
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
		com.vportal.portlet.vlegal.model.VLegalField entry,
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
		com.vportal.portlet.vlegal.model.VLegalField entry,
		java.lang.String[] communityPermissions,
		java.lang.String[] guestPermissions)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		getService()
			.addEntryResources(entry, communityPermissions, guestPermissions);
	}

	public static void deleteField(java.lang.String fieldId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException, java.rmi.RemoteException {
		getService().deleteField(fieldId);
	}

	public static com.vportal.portlet.vlegal.model.VLegalField getVField(
		java.lang.String fieldId) {
		return getService().getVField(fieldId);
	}

	public static com.vportal.portlet.vlegal.model.VLegalField getVField(
		long groupId, java.lang.String fieldId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException, java.rmi.RemoteException {
		return getService().getVField(groupId, fieldId);
	}

	public static java.util.List getAllFields()
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException, java.rmi.RemoteException {
		return getService().getAllFields();
	}

	public static java.util.List getFieldByGroupId(long groupId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getFieldByGroupId(groupId);
	}

	public static java.util.List getFieldByGroupId(long groupId, int begin,
		int end) throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getFieldByGroupId(groupId, begin, end);
	}

	public static int countFieldByGroupId(long groupId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().countFieldByGroupId(groupId);
	}

	public static java.util.List getVFieldByS_L(long groupId, boolean status,
		java.lang.String language)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException, java.rmi.RemoteException {
		return getService().getVFieldByS_L(groupId, status, language);
	}

	public static java.util.List getVFieldByS_L(java.lang.String language,
		boolean status)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException, java.rmi.RemoteException {
		return getService().getVFieldByS_L(language, status);
	}

	public static java.util.List getVFieldByS_Rss(long groupId, boolean status,
		boolean rssable)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException, java.rmi.RemoteException {
		return getService().getVFieldByS_Rss(groupId, status, rssable);
	}

	public static java.util.List getFieldByOrg(long groupId,
		java.lang.String orgId, java.lang.String language,
		java.lang.String status, int begin, int end)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .getFieldByOrg(groupId, orgId, language, status, begin, end);
	}

	public static java.util.List getFieldByType(long groupId,
		java.lang.String typeId, java.lang.String language,
		java.lang.String status, int begin, int end)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .getFieldByType(groupId, typeId, language, status, begin, end);
	}

	public static java.util.List getAllFieldByPS(long groupId,
		java.lang.String language)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getAllFieldByPS(groupId, language);
	}

	public static java.util.List getFieldRelDoc_T_O(long groupId,
		java.lang.String language, java.lang.String typeId,
		java.lang.String orgId) throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getFieldRelDoc_T_O(groupId, language, typeId, orgId);
	}

	public static void _validate(java.lang.String name)
		throws com.liferay.portal.kernel.exception.PortalException {
		getService()._validate(name);
	}

	public static com.vportal.portlet.vlegal.model.VLegalField addField(
		long arg0, java.lang.String arg1, java.lang.String arg2,
		java.lang.String arg3, boolean arg4, boolean arg5,
		com.liferay.portal.theme.ThemeDisplay arg6)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException, java.rmi.RemoteException {
		return getService().addField(arg0, arg1, arg2, arg3, arg4, arg5, arg6);
	}

	public static com.vportal.portlet.vlegal.model.VLegalField addField(
		long arg0, long arg1, long arg2, java.lang.String arg3,
		java.lang.String arg4, java.lang.String arg5, boolean arg6,
		boolean arg7, com.liferay.portal.theme.ThemeDisplay arg8)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException, java.rmi.RemoteException {
		return getService()
				   .addField(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7,
			arg8);
	}

	public static void clearService() {
		_service = null;
	}

	public static VLegalFieldService getService() {
		if (_service == null) {
			Object obj = PortletBeanLocatorUtil.locate(ClpSerializer.SERVLET_CONTEXT_NAME,
					VLegalFieldService.class.getName());
			ClassLoader portletClassLoader = (ClassLoader)PortletBeanLocatorUtil.locate(ClpSerializer.SERVLET_CONTEXT_NAME,
					"portletClassLoader");

			ClassLoaderProxy classLoaderProxy = new ClassLoaderProxy(obj,
					portletClassLoader);

			_service = new VLegalFieldServiceClp(classLoaderProxy);

			ClpSerializer.setClassLoader(portletClassLoader);
		}

		return _service;
	}

	public void setService(VLegalFieldService service) {
		_service = service;
	}

	private static VLegalFieldService _service;
}