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

/**
 * <p>
 * This class is a wrapper for {@link FAQCategoryService}.
 * </p>
 *
 * @author    HOAN
 * @see       FAQCategoryService
 * @generated
 */
public class FAQCategoryServiceWrapper implements FAQCategoryService {
	public FAQCategoryServiceWrapper(FAQCategoryService faqCategoryService) {
		_faqCategoryService = faqCategoryService;
	}

	public com.vportal.portlet.vfaq.model.FAQCategory addCategory(
		java.lang.String name, java.lang.String description,
		java.lang.String language, long parent, int catorder, int catlevel,
		java.lang.String image, java.lang.String createdByUser,
		java.util.Date createdDate, long plId, long userId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _faqCategoryService.addCategory(name, description, language,
			parent, catorder, catlevel, image, createdByUser, createdDate,
			plId, userId);
	}

	public com.vportal.portlet.vfaq.model.FAQCategory addCategory(
		java.lang.String name, java.lang.String description,
		java.lang.String language, long parent, int catorder, int catlevel,
		java.lang.String image, java.lang.String createdByUser,
		java.util.Date createdDate, long plId, long userId,
		boolean addCommunityPermissions, boolean addGuestPermissions)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _faqCategoryService.addCategory(name, description, language,
			parent, catorder, catlevel, image, createdByUser, createdDate,
			plId, userId, addCommunityPermissions, addGuestPermissions);
	}

	public com.vportal.portlet.vfaq.model.FAQCategory addCategory(
		java.lang.String name, java.lang.String description,
		java.lang.String language, long parent, int catorder, int catlevel,
		java.lang.String image, java.lang.String createdByUser,
		java.util.Date createdDate, long plId, long userId,
		java.lang.String[] communityPermissions,
		java.lang.String[] guestPermissions)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _faqCategoryService.addCategory(name, description, language,
			parent, catorder, catlevel, image, createdByUser, createdDate,
			plId, userId, communityPermissions, guestPermissions);
	}

	public com.vportal.portlet.vfaq.model.FAQCategory updateCategory(
		long categoryId, java.lang.String name, java.lang.String description,
		java.lang.String language, long parent, int catorder, int catlevel,
		java.lang.String image, java.lang.String modifiedByUser,
		java.util.Date modifiedDate, long groupId, long userId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _faqCategoryService.updateCategory(categoryId, name,
			description, language, parent, catorder, catlevel, image,
			modifiedByUser, modifiedDate, groupId, userId);
	}

	public com.vportal.portlet.vfaq.model.FAQCategory updateImage(
		long groupId, long categoryId, java.lang.String imageName)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _faqCategoryService.updateImage(groupId, categoryId, imageName);
	}

	public void deleteCategory(long groupId, long categoryId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		_faqCategoryService.deleteCategory(groupId, categoryId);
	}

	public com.vportal.portlet.vfaq.model.FAQCategory getCategory(
		long groupId, long categoryId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _faqCategoryService.getCategory(groupId, categoryId);
	}

	public java.util.List getCategoriesByG_L(long groupId,
		java.lang.String language)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _faqCategoryService.getCategoriesByG_L(groupId, language);
	}

	public java.util.List findAll() throws java.lang.Exception {
		return _faqCategoryService.findAll();
	}

	public com.vportal.portlet.vfaq.model.FAQCategory findByPrimaryKey(long id)
		throws java.lang.Exception {
		return _faqCategoryService.findByPrimaryKey(id);
	}

	public com.vportal.portlet.vfaq.model.FAQCategory findFirst()
		throws java.lang.Exception {
		return _faqCategoryService.findFirst();
	}

	public FAQCategoryService getWrappedFAQCategoryService() {
		return _faqCategoryService;
	}

	private FAQCategoryService _faqCategoryService;
}