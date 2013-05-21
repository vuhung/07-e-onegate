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

package com.vportal.portlet.vfaq.service.impl;

import java.util.Date;
import java.util.List;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.security.permission.ActionKeys;
import com.liferay.portal.util.PortalUtil;
import com.vportal.portlet.vfaq.model.FAQCategory;
import com.vportal.portlet.vfaq.model.impl.FAQCategoryImpl;
import com.vportal.portlet.vfaq.service.base.FAQCategoryServiceBaseImpl;
import com.vportal.portlet.vfaq.service.permission.FAQCategoryPermission;
import com.vportal.portlet.vfaq.service.persistence.FAQCategoryUtil;
import com.vportal.portlet.vfaq.util.ActionKeysExt;

/**
 * The implementation of the f a q category remote service.
 * 
 * <p>
 * All custom service methods should be put in this class. Whenever methods are
 * added, rerun ServiceBuilder to copy their definitions into the
 * {@link com.vportal.portlet.vfaq.service.FAQCategoryService} interface.
 * </p>
 * 
 * <p>
 * Never reference this interface directly. Always use
 * {@link com.vportal.portlet.vfaq.service.FAQCategoryServiceUtil} to access the
 * f a q category remote service.
 * </p>
 * 
 * <p>
 * This is a remote service. Methods of this service are expected to have
 * security checks based on the propagated JAAS credentials because this service
 * can be accessed remotely.
 * </p>
 * 
 * @author HOAN
 * @see com.vportal.portlet.vfaq.service.base.FAQCategoryServiceBaseImpl
 * @see com.vportal.portlet.vfaq.service.FAQCategoryServiceUtil
 */
public class FAQCategoryServiceImpl extends FAQCategoryServiceBaseImpl {
	public FAQCategory addCategory(String name, String description,
			String language, long parent, int catorder, int catlevel,
			String image, String createdByUser, Date createdDate, long plId,
			long userId) throws PortalException, SystemException {

		FAQCategoryPermission.check(getPermissionChecker(), plId, parent,
				ActionKeysExt.ADD_CATEGORY);

		long groupId = PortalUtil.getScopeGroupId(plId);

		return faqCategoryLocalService.addCategory(name, description, language,
				parent, catorder, catlevel, image, createdByUser, createdDate,
				groupId, userId);

	}

	public FAQCategory addCategory(String name, String description,
			String language, long parent, int catorder, int catlevel,
			String image, String createdByUser, Date createdDate, long plId,
			long userId, boolean addCommunityPermissions,
			boolean addGuestPermissions) throws PortalException,
			SystemException {

		FAQCategoryPermission.check(getPermissionChecker(), plId, parent,
				ActionKeysExt.ADD_CATEGORY);

		long groupId = PortalUtil.getScopeGroupId(plId);

		return faqCategoryLocalService.addCategory(name, description, language,
				parent, catorder, catlevel, image, createdByUser, createdDate,
				groupId, userId, new Boolean(addCommunityPermissions),
				new Boolean(addGuestPermissions));

	}

	public FAQCategory addCategory(String name, String description,
			String language, long parent, int catorder, int catlevel,
			String image, String createdByUser, Date createdDate, long plId,
			long userId, String[] communityPermissions,
			String[] guestPermissions) throws PortalException, SystemException {

		FAQCategoryPermission.check(getPermissionChecker(), plId, parent,
				ActionKeysExt.ADD_CATEGORY);

		long groupId = PortalUtil.getScopeGroupId(plId);

		return faqCategoryLocalService.addCategory(name, description, language,
				parent, catorder, catlevel, image, createdByUser, createdDate,
				groupId, userId, communityPermissions, guestPermissions);

	}

	public FAQCategory updateCategory(long categoryId, String name,
			String description, String language, long parent, int catorder,
			int catlevel, String image, String modifiedByUser,
			Date modifiedDate, long groupId, long userId)
			throws PortalException, SystemException {

		FAQCategoryPermission.check(getPermissionChecker(), groupId,
				categoryId, ActionKeys.UPDATE);

		return faqCategoryLocalService.updateCategory(categoryId, name,
				description, language, parent, catorder, catlevel, image,
				modifiedByUser, modifiedDate, groupId, userId);

	}

	public FAQCategory updateImage(long groupId, long categoryId,
			String imageName) throws SystemException, PortalException {

		FAQCategoryPermission.check(getPermissionChecker(), groupId,
				categoryId, ActionKeys.UPDATE);

		return faqCategoryLocalService.updateImage(categoryId, imageName);
	}

	public void deleteCategory(long groupId, long categoryId)
			throws PortalException, SystemException {

		FAQCategoryPermission.check(getPermissionChecker(), groupId,
				categoryId, ActionKeys.DELETE);

		faqCategoryLocalService.deleteCategory(categoryId);
	}

	public FAQCategory getCategory(long groupId, long categoryId)
			throws PortalException, SystemException {

		FAQCategoryPermission.check(getPermissionChecker(), groupId,
				categoryId, ActionKeys.VIEW);

		return faqCategoryLocalService.getCategory(groupId, categoryId);
	}

	public List getCategoriesByG_L(long groupId, String language)
			throws PortalException, SystemException {

		return (List) faqCategoryLocalService.getByG_L(groupId, language);
	}

	// Rest of codes belong to CuongNV
	public List findAll() throws Exception {
		return FAQCategoryUtil.findAll();
	}

	public FAQCategory findByPrimaryKey(long id) throws Exception {
		return FAQCategoryUtil.findByPrimaryKey(id);
	}

	public FAQCategory findFirst() throws Exception {
		List myList = FAQCategoryUtil.findAll();
		if ((myList != null) && (myList.size() > 0)) {
			return (FAQCategory) myList.get(0);
		}
		return (new FAQCategoryImpl());
	}
}