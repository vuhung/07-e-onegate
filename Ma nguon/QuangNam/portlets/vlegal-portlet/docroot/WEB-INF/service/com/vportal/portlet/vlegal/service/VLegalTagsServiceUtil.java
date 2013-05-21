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
 * The utility for the v legal tags remote service. This utility wraps {@link com.vportal.portlet.vlegal.service.impl.VLegalTagsServiceImpl} and is the primary access point for service operations in application layer code running on a remote server.
 *
 * <p>
 * Never modify this class directly. Add custom service methods to {@link com.vportal.portlet.vlegal.service.impl.VLegalTagsServiceImpl} and rerun ServiceBuilder to regenerate this class.
 * </p>
 *
 * <p>
 * This is a remote service. Methods of this service are expected to have security checks based on the propagated JAAS credentials because this service can be accessed remotely.
 * </p>
 *
 * @author ACB
 * @see VLegalTagsService
 * @see com.vportal.portlet.vlegal.service.base.VLegalTagsServiceBaseImpl
 * @see com.vportal.portlet.vlegal.service.impl.VLegalTagsServiceImpl
 * @generated
 */
public class VLegalTagsServiceUtil {
	public static com.vportal.portlet.vlegal.model.VLegalTags addTag(
		long groupId, java.lang.String name, boolean status,
		java.lang.String[] communityPermissions,
		java.lang.String[] guestPermissions,
		com.liferay.portal.theme.ThemeDisplay themeDisplay)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			com.liferay.portal.security.auth.PrincipalException,
			java.rmi.RemoteException {
		return getService()
				   .addTag(groupId, name, status, communityPermissions,
			guestPermissions, themeDisplay);
	}

	public static com.vportal.portlet.vlegal.model.VLegalTags addTag(
		long groupId, java.lang.String name, boolean status,
		java.lang.Boolean addCommunityPermissions,
		java.lang.Boolean addGuestPermissions,
		java.lang.String[] communityPermissions,
		java.lang.String[] guestPermissions,
		com.liferay.portal.theme.ThemeDisplay themeDisplay)
		throws com.liferay.portal.NoSuchUserException,
			com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			com.liferay.portal.security.auth.PrincipalException,
			com.vportal.portlet.vlegal.NoSuchVLegalTagsException,
			java.rmi.RemoteException {
		return getService()
				   .addTag(groupId, name, status, addCommunityPermissions,
			addGuestPermissions, communityPermissions, guestPermissions,
			themeDisplay);
	}

	public static void addEntryResources(
		com.vportal.portlet.vlegal.model.VLegalTags vTag,
		java.lang.String[] communityPermissions,
		java.lang.String[] guestPermissions)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vlegal.NoSuchVLegalTagsException {
		getService()
			.addEntryResources(vTag, communityPermissions, guestPermissions);
	}

	public static void addEntryResources(
		com.vportal.portlet.vlegal.model.VLegalTags vTag,
		boolean addCommunityPermissions, boolean addGuestPermissions)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vlegal.NoSuchVLegalTagsException {
		getService()
			.addEntryResources(vTag, addCommunityPermissions,
			addGuestPermissions);
	}

	public static void addEntryResources(long entryId,
		boolean addCommunityPermissions, boolean addGuestPermissions)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vlegal.NoSuchVLegalTagsException {
		getService()
			.addEntryResources(entryId, addCommunityPermissions,
			addGuestPermissions);
	}

	public static void addEntryResources(long entryId,
		java.lang.String[] communityPermissions,
		java.lang.String[] guestPermissions)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vlegal.NoSuchVLegalTagsException {
		getService()
			.addEntryResources(entryId, communityPermissions, guestPermissions);
	}

	public static com.vportal.portlet.vlegal.model.VLegalTags getTag(
		java.lang.String tagId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vlegal.NoSuchVLegalTagsException {
		return getService().getTag(tagId);
	}

	public static void deleteTag(java.lang.String tagId) {
		getService().deleteTag(tagId);
	}

	public static void deleteTags(java.lang.String[] tagId) {
		getService().deleteTags(tagId);
	}

	public static java.util.List getTag_Status(long groupId, boolean status) {
		return getService().getTag_Status(groupId, status);
	}

	public static java.util.List getTags(long groupId, java.lang.String name,
		java.lang.String status, boolean dup, int begin, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getTags(groupId, name, status, dup, begin, end);
	}

	public static java.util.List getTagsByGroupId(long groupId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getTagsByGroupId(groupId);
	}

	public static java.util.List getTag_Status(long groupId, boolean status,
		com.liferay.portal.kernel.util.OrderByComparator obc)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.rmi.RemoteException {
		return getService().getTag_Status(groupId, status, obc);
	}

	public static void _validator(long groupId, java.lang.String name)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		getService()._validator(groupId, name);
	}

	public static void clearService() {
		_service = null;
	}

	public static VLegalTagsService getService() {
		if (_service == null) {
			Object obj = PortletBeanLocatorUtil.locate(ClpSerializer.SERVLET_CONTEXT_NAME,
					VLegalTagsService.class.getName());
			ClassLoader portletClassLoader = (ClassLoader)PortletBeanLocatorUtil.locate(ClpSerializer.SERVLET_CONTEXT_NAME,
					"portletClassLoader");

			ClassLoaderProxy classLoaderProxy = new ClassLoaderProxy(obj,
					portletClassLoader);

			_service = new VLegalTagsServiceClp(classLoaderProxy);

			ClpSerializer.setClassLoader(portletClassLoader);
		}

		return _service;
	}

	public void setService(VLegalTagsService service) {
		_service = service;
	}

	private static VLegalTagsService _service;
}