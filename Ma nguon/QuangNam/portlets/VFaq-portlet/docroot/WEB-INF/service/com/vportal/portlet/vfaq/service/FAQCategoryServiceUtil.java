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

package com.vportal.portlet.vfaq.service;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.util.ClassLoaderProxy;

/**
 * The utility for the f a q category remote service. This utility wraps {@link com.vportal.portlet.vfaq.service.impl.FAQCategoryServiceImpl} and is the primary access point for service operations in application layer code running on a remote server.
 *
 * <p>
 * Never modify this class directly. Add custom service methods to {@link com.vportal.portlet.vfaq.service.impl.FAQCategoryServiceImpl} and rerun ServiceBuilder to regenerate this class.
 * </p>
 *
 * <p>
 * This is a remote service. Methods of this service are expected to have security checks based on the propagated JAAS credentials because this service can be accessed remotely.
 * </p>
 *
 * @author HOAN
 * @see FAQCategoryService
 * @see com.vportal.portlet.vfaq.service.base.FAQCategoryServiceBaseImpl
 * @see com.vportal.portlet.vfaq.service.impl.FAQCategoryServiceImpl
 * @generated
 */
public class FAQCategoryServiceUtil {
	public static com.vportal.portlet.vfaq.model.FAQCategory addCategory(
		java.lang.String name, java.lang.String description,
		java.lang.String language, long parent, int catorder, int catlevel,
		java.lang.String image, java.lang.String createdByUser,
		java.util.Date createdDate, long plId, long userId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .addCategory(name, description, language, parent, catorder,
			catlevel, image, createdByUser, createdDate, plId, userId);
	}

	public static com.vportal.portlet.vfaq.model.FAQCategory addCategory(
		java.lang.String name, java.lang.String description,
		java.lang.String language, long parent, int catorder, int catlevel,
		java.lang.String image, java.lang.String createdByUser,
		java.util.Date createdDate, long plId, long userId,
		boolean addCommunityPermissions, boolean addGuestPermissions)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .addCategory(name, description, language, parent, catorder,
			catlevel, image, createdByUser, createdDate, plId, userId,
			addCommunityPermissions, addGuestPermissions);
	}

	public static com.vportal.portlet.vfaq.model.FAQCategory addCategory(
		java.lang.String name, java.lang.String description,
		java.lang.String language, long parent, int catorder, int catlevel,
		java.lang.String image, java.lang.String createdByUser,
		java.util.Date createdDate, long plId, long userId,
		java.lang.String[] communityPermissions,
		java.lang.String[] guestPermissions)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .addCategory(name, description, language, parent, catorder,
			catlevel, image, createdByUser, createdDate, plId, userId,
			communityPermissions, guestPermissions);
	}

	public static com.vportal.portlet.vfaq.model.FAQCategory updateCategory(
		long categoryId, java.lang.String name, java.lang.String description,
		java.lang.String language, long parent, int catorder, int catlevel,
		java.lang.String image, java.lang.String modifiedByUser,
		java.util.Date modifiedDate, long groupId, long userId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .updateCategory(categoryId, name, description, language,
			parent, catorder, catlevel, image, modifiedByUser, modifiedDate,
			groupId, userId);
	}

	public static com.vportal.portlet.vfaq.model.FAQCategory updateImage(
		long groupId, long categoryId, java.lang.String imageName)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().updateImage(groupId, categoryId, imageName);
	}

	public static void deleteCategory(long groupId, long categoryId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		getService().deleteCategory(groupId, categoryId);
	}

	public static com.vportal.portlet.vfaq.model.FAQCategory getCategory(
		long groupId, long categoryId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getCategory(groupId, categoryId);
	}

	public static java.util.List getCategoriesByG_L(long groupId,
		java.lang.String language)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getCategoriesByG_L(groupId, language);
	}

	public static java.util.List findAll() throws java.lang.Exception {
		return getService().findAll();
	}

	public static com.vportal.portlet.vfaq.model.FAQCategory findByPrimaryKey(
		long id) throws java.lang.Exception {
		return getService().findByPrimaryKey(id);
	}

	public static com.vportal.portlet.vfaq.model.FAQCategory findFirst()
		throws java.lang.Exception {
		return getService().findFirst();
	}

	public static void clearService() {
		_service = null;
	}

	public static FAQCategoryService getService() {
		if (_service == null) {
			Object obj = PortletBeanLocatorUtil.locate(ClpSerializer.SERVLET_CONTEXT_NAME,
					FAQCategoryService.class.getName());
			ClassLoader portletClassLoader = (ClassLoader)PortletBeanLocatorUtil.locate(ClpSerializer.SERVLET_CONTEXT_NAME,
					"portletClassLoader");

			ClassLoaderProxy classLoaderProxy = new ClassLoaderProxy(obj,
					portletClassLoader);

			_service = new FAQCategoryServiceClp(classLoaderProxy);

			ClpSerializer.setClassLoader(portletClassLoader);
		}

		return _service;
	}

	public void setService(FAQCategoryService service) {
		_service = service;
	}

	private static FAQCategoryService _service;
}