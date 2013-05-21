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

package com.vportal.portlet.vcms.service;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.util.ClassLoaderProxy;

/**
 * The utility for the vcms category remote service. This utility wraps {@link com.vportal.portlet.vcms.service.impl.VcmsCategoryServiceImpl} and is the primary access point for service operations in application layer code running on a remote server.
 *
 * <p>
 * Never modify this class directly. Add custom service methods to {@link com.vportal.portlet.vcms.service.impl.VcmsCategoryServiceImpl} and rerun ServiceBuilder to regenerate this class.
 * </p>
 *
 * <p>
 * This is a remote service. Methods of this service are expected to have security checks based on the propagated JAAS credentials because this service can be accessed remotely.
 * </p>
 *
 * @author HOAN
 * @see VcmsCategoryService
 * @see com.vportal.portlet.vcms.service.base.VcmsCategoryServiceBaseImpl
 * @see com.vportal.portlet.vcms.service.impl.VcmsCategoryServiceImpl
 * @generated
 */
public class VcmsCategoryServiceUtil {
	public static com.vportal.portlet.vcms.model.VcmsCategory addCategory(
		long groupId, long companyId, long plid, java.lang.String portionId,
		java.lang.String parentId, java.lang.String name,
		java.lang.String description, boolean anchored, java.lang.String href,
		java.lang.String language, boolean hasImage, java.lang.String image,
		boolean rssable, java.lang.String[] communityPermissions,
		java.lang.String[] guestPermissions)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.rmi.RemoteException {
		return getService()
				   .addCategory(groupId, companyId, plid, portionId, parentId,
			name, description, anchored, href, language, hasImage, image,
			rssable, communityPermissions, guestPermissions);
	}

	public static com.vportal.portlet.vcms.model.VcmsCategory addCategory(
		long groupId, long companyId, long plid, java.lang.String portionId,
		java.lang.String parentId, java.lang.String name,
		java.lang.String description, boolean anchored, java.lang.String href,
		java.lang.String language, boolean hasImage, java.lang.String image,
		boolean rssable, java.lang.Boolean addCommunityPermissions,
		java.lang.Boolean addGuestPermissions,
		java.lang.String[] communityPermissions,
		java.lang.String[] guestPermissions)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.rmi.RemoteException {
		return getService()
				   .addCategory(groupId, companyId, plid, portionId, parentId,
			name, description, anchored, href, language, hasImage, image,
			rssable, addCommunityPermissions, addGuestPermissions,
			communityPermissions, guestPermissions);
	}

	public static void changePortion(java.lang.String parentId, long groupId,
		java.lang.String portionId, java.lang.String language)
		throws com.liferay.portal.kernel.exception.SystemException {
		getService().changePortion(parentId, groupId, portionId, language);
	}

	public static void addCategoryResources(java.lang.String categoryId,
		boolean addCommunityPermissions, boolean addGuestPermissions)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		getService()
			.addCategoryResources(categoryId, addCommunityPermissions,
			addGuestPermissions);
	}

	public static void addCategoryResources(
		com.vportal.portlet.vcms.model.VcmsCategory category,
		boolean addCommunityPermissions, boolean addGuestPermissions)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		getService()
			.addCategoryResources(category, addCommunityPermissions,
			addGuestPermissions);
	}

	public static void addCategoryResources(java.lang.String categoryId,
		java.lang.String[] communityPermissions,
		java.lang.String[] guestPermissions)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		getService()
			.addCategoryResources(categoryId, communityPermissions,
			guestPermissions);
	}

	public static void addCategoryResources(
		com.vportal.portlet.vcms.model.VcmsCategory category,
		java.lang.String[] communityPermissions,
		java.lang.String[] guestPermissions)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		getService()
			.addCategoryResources(category, communityPermissions,
			guestPermissions);
	}

	public static com.vportal.portlet.vcms.model.VcmsCategory updateCategory(
		long groupId, long companyId, java.lang.String categoryId,
		java.lang.String portionId, java.lang.String parentId,
		java.lang.String name, java.lang.String description, boolean anchored,
		java.lang.String href, java.lang.String language, boolean hasImage,
		java.lang.String image, int position, int userHit, boolean rssable)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.rmi.RemoteException {
		return getService()
				   .updateCategory(groupId, companyId, categoryId, portionId,
			parentId, name, description, anchored, href, language, hasImage,
			image, position, userHit, rssable);
	}

	public static com.vportal.portlet.vcms.model.VcmsCategory updateCategory(
		com.vportal.portlet.vcms.model.VcmsCategory category)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.rmi.RemoteException {
		return getService().updateCategory(category);
	}

	public static void deleteCategory(java.lang.String categoryId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.rmi.RemoteException {
		getService().deleteCategory(categoryId);
	}

	public static com.vportal.portlet.vcms.model.VcmsCategory getCategory(
		java.lang.String categoryId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.rmi.RemoteException {
		return getService().getCategory(categoryId);
	}

	public static java.lang.String getCategoriesByRSS(
		java.lang.String categoryId, int max, java.lang.String type,
		double version, java.lang.String displayStyle,
		java.lang.String feedURL, java.lang.String entryURL, int quantity,
		com.liferay.portal.theme.ThemeDisplay themeDisplay)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.rmi.RemoteException {
		return getService()
				   .getCategoriesByRSS(categoryId, max, type, version,
			displayStyle, feedURL, entryURL, quantity, themeDisplay);
	}

	public static java.util.List getCategoriesByPortion(long groupId,
		java.lang.String portionId, java.lang.String language)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.rmi.RemoteException {
		return getService().getCategoriesByPortion(groupId, portionId, language);
	}

	public static java.util.List getCategoriesByParent(long groupId,
		java.lang.String parentId, java.lang.String language)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.rmi.RemoteException {
		return getService().getCategoriesByParent(groupId, parentId, language);
	}

	public static java.util.List getCategoriesByParent(long groupId,
		java.lang.String parentId, java.lang.String language, int start, int end)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.rmi.RemoteException {
		return getService()
				   .getCategoriesByParent(groupId, parentId, language, start,
			end);
	}

	public static int countCategoriesByParent(long groupId,
		java.lang.String parentId, java.lang.String language)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.rmi.RemoteException {
		return getService().countCategoriesByParent(groupId, parentId, language);
	}

	public static java.util.List getCategoriesByP_P(long groupId,
		java.lang.String portionId, java.lang.String parentId,
		java.lang.String language)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.rmi.RemoteException {
		return getService()
				   .getCategoriesByP_P(groupId, portionId, parentId, language);
	}

	public static java.util.List getCategoriesByP_P(long groupId,
		java.lang.String portionId, java.lang.String parentId,
		java.lang.String language, int start, int end)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.rmi.RemoteException {
		return getService()
				   .getCategoriesByP_P(groupId, portionId, parentId, language,
			start, end);
	}

	public static int countCategoriesByP_P(long groupId,
		java.lang.String portionId, java.lang.String parentId,
		java.lang.String language)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.rmi.RemoteException {
		return getService()
				   .countCategoriesByP_P(groupId, portionId, parentId, language);
	}

	public static int countByP_L(long groupId, java.lang.String language)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.rmi.RemoteException {
		return getService().countByP_L(groupId, language);
	}

	public static void clearService() {
		_service = null;
	}

	public static VcmsCategoryService getService() {
		if (_service == null) {
			Object obj = PortletBeanLocatorUtil.locate(ClpSerializer.SERVLET_CONTEXT_NAME,
					VcmsCategoryService.class.getName());
			ClassLoader portletClassLoader = (ClassLoader)PortletBeanLocatorUtil.locate(ClpSerializer.SERVLET_CONTEXT_NAME,
					"portletClassLoader");

			ClassLoaderProxy classLoaderProxy = new ClassLoaderProxy(obj,
					portletClassLoader);

			_service = new VcmsCategoryServiceClp(classLoaderProxy);

			ClpSerializer.setClassLoader(portletClassLoader);
		}

		return _service;
	}

	public void setService(VcmsCategoryService service) {
		_service = service;
	}

	private static VcmsCategoryService _service;
}