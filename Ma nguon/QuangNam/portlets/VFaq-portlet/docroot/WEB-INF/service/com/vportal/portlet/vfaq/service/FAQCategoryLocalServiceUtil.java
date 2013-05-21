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
 * The utility for the f a q category local service. This utility wraps {@link com.vportal.portlet.vfaq.service.impl.FAQCategoryLocalServiceImpl} and is the primary access point for service operations in application layer code running on the local server.
 *
 * <p>
 * Never modify this class directly. Add custom service methods to {@link com.vportal.portlet.vfaq.service.impl.FAQCategoryLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
 * </p>
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author HOAN
 * @see FAQCategoryLocalService
 * @see com.vportal.portlet.vfaq.service.base.FAQCategoryLocalServiceBaseImpl
 * @see com.vportal.portlet.vfaq.service.impl.FAQCategoryLocalServiceImpl
 * @generated
 */
public class FAQCategoryLocalServiceUtil {
	/**
	* Adds the f a q category to the database. Also notifies the appropriate model listeners.
	*
	* @param faqCategory the f a q category to add
	* @return the f a q category that was added
	* @throws SystemException if a system exception occurred
	*/
	public static com.vportal.portlet.vfaq.model.FAQCategory addFAQCategory(
		com.vportal.portlet.vfaq.model.FAQCategory faqCategory)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().addFAQCategory(faqCategory);
	}

	/**
	* Creates a new f a q category with the primary key. Does not add the f a q category to the database.
	*
	* @param id the primary key for the new f a q category
	* @return the new f a q category
	*/
	public static com.vportal.portlet.vfaq.model.FAQCategory createFAQCategory(
		long id) {
		return getService().createFAQCategory(id);
	}

	/**
	* Deletes the f a q category with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the f a q category to delete
	* @throws PortalException if a f a q category with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static void deleteFAQCategory(long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		getService().deleteFAQCategory(id);
	}

	/**
	* Deletes the f a q category from the database. Also notifies the appropriate model listeners.
	*
	* @param faqCategory the f a q category to delete
	* @throws SystemException if a system exception occurred
	*/
	public static void deleteFAQCategory(
		com.vportal.portlet.vfaq.model.FAQCategory faqCategory)
		throws com.liferay.portal.kernel.exception.SystemException {
		getService().deleteFAQCategory(faqCategory);
	}

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query to search with
	* @return the matching rows
	* @throws SystemException if a system exception occurred
	*/
	@SuppressWarnings("rawtypes")
	public static java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param dynamicQuery the dynamic query to search with
	* @param start the lower bound of the range of model instances to return
	* @param end the upper bound of the range of model instances to return (not inclusive)
	* @return the range of matching rows
	* @throws SystemException if a system exception occurred
	*/
	@SuppressWarnings("rawtypes")
	public static java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException {
		return getService().dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param dynamicQuery the dynamic query to search with
	* @param start the lower bound of the range of model instances to return
	* @param end the upper bound of the range of model instances to return (not inclusive)
	* @param orderByComparator the comparator to order the results by
	* @return the ordered range of matching rows
	* @throws SystemException if a system exception occurred
	*/
	@SuppressWarnings("rawtypes")
	public static java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .dynamicQuery(dynamicQuery, start, end, orderByComparator);
	}

	/**
	* Counts the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query to search with
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	public static long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().dynamicQueryCount(dynamicQuery);
	}

	/**
	* Gets the f a q category with the primary key.
	*
	* @param id the primary key of the f a q category to get
	* @return the f a q category
	* @throws PortalException if a f a q category with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.vportal.portlet.vfaq.model.FAQCategory getFAQCategory(
		long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getFAQCategory(id);
	}

	/**
	* Gets a range of all the f a q categories.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of f a q categories to return
	* @param end the upper bound of the range of f a q categories to return (not inclusive)
	* @return the range of f a q categories
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.vportal.portlet.vfaq.model.FAQCategory> getFAQCategories(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getFAQCategories(start, end);
	}

	/**
	* Gets the number of f a q categories.
	*
	* @return the number of f a q categories
	* @throws SystemException if a system exception occurred
	*/
	public static int getFAQCategoriesCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getFAQCategoriesCount();
	}

	/**
	* Updates the f a q category in the database. Also notifies the appropriate model listeners.
	*
	* @param faqCategory the f a q category to update
	* @return the f a q category that was updated
	* @throws SystemException if a system exception occurred
	*/
	public static com.vportal.portlet.vfaq.model.FAQCategory updateFAQCategory(
		com.vportal.portlet.vfaq.model.FAQCategory faqCategory)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().updateFAQCategory(faqCategory);
	}

	/**
	* Updates the f a q category in the database. Also notifies the appropriate model listeners.
	*
	* @param faqCategory the f a q category to update
	* @param merge whether to merge the f a q category with the current session. See {@link com.liferay.portal.service.persistence.BatchSession#update(com.liferay.portal.kernel.dao.orm.Session, com.liferay.portal.model.BaseModel, boolean)} for an explanation.
	* @return the f a q category that was updated
	* @throws SystemException if a system exception occurred
	*/
	public static com.vportal.portlet.vfaq.model.FAQCategory updateFAQCategory(
		com.vportal.portlet.vfaq.model.FAQCategory faqCategory, boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().updateFAQCategory(faqCategory, merge);
	}

	public static com.vportal.portlet.vfaq.model.FAQCategory addCategory(
		java.lang.String name, java.lang.String description,
		java.lang.String language, long parent, int catorder, int catlevel,
		java.lang.String image, java.lang.String createdByUser,
		java.util.Date createdDate, long groupId, long userId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .addCategory(name, description, language, parent, catorder,
			catlevel, image, createdByUser, createdDate, groupId, userId);
	}

	public static com.vportal.portlet.vfaq.model.FAQCategory addCategory(
		java.lang.String name, java.lang.String description,
		java.lang.String language, long parent, int catorder, int catlevel,
		java.lang.String image, java.lang.String createdByUser,
		java.util.Date createdDate, long groupId, long userId,
		java.lang.Boolean addCommunityPermissions,
		java.lang.Boolean addGuestPermissions)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .addCategory(name, description, language, parent, catorder,
			catlevel, image, createdByUser, createdDate, groupId, userId,
			addCommunityPermissions, addGuestPermissions);
	}

	public static com.vportal.portlet.vfaq.model.FAQCategory addCategory(
		java.lang.String name, java.lang.String description,
		java.lang.String language, long parent, int catorder, int catlevel,
		java.lang.String image, java.lang.String createdByUser,
		java.util.Date createdDate, long groupId, long userId,
		java.lang.String[] communityPermissions,
		java.lang.String[] guestPermissions)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .addCategory(name, description, language, parent, catorder,
			catlevel, image, createdByUser, createdDate, groupId, userId,
			communityPermissions, guestPermissions);
	}

	public static com.vportal.portlet.vfaq.model.FAQCategory addCategory(
		java.lang.String name, java.lang.String description,
		java.lang.String language, long parent, int catorder, int catlevel,
		java.lang.String image, java.lang.String createdByUser,
		java.util.Date createdDate, long groupId, long userId,
		java.lang.Boolean addCommunityPermissions,
		java.lang.Boolean addGuestPermissions,
		java.lang.String[] communityPermissions,
		java.lang.String[] guestPermissions)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .addCategory(name, description, language, parent, catorder,
			catlevel, image, createdByUser, createdDate, groupId, userId,
			addCommunityPermissions, addGuestPermissions, communityPermissions,
			guestPermissions);
	}

	public static com.vportal.portlet.vfaq.model.FAQCategory updateImage(
		long categoryId, java.lang.String imageName)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().updateImage(categoryId, imageName);
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

	public static void deleteCategory(long categoryId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		getService().deleteCategory(categoryId);
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

	public static com.vportal.portlet.vfaq.model.FAQCategory getCategory(
		long categoryId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getCategory(categoryId);
	}

	public static java.util.List getSubCategory(long groupId, long parentId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getSubCategory(groupId, parentId);
	}

	public static java.util.List getSubCategory(long parentId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getSubCategory(parentId);
	}

	public static java.util.List getAll(long groupId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getAll(groupId);
	}

	public static java.util.List getAll(long groupId, int start, int end)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getAll(groupId, start, end);
	}

	public static int countAll(long groupId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().countAll(groupId);
	}

	public static java.util.List getAll()
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getAll();
	}

	public static java.util.List getAll(int begin, int end)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getAll(begin, end);
	}

	public static java.util.List getByGroupId(long groupId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getByGroupId(groupId);
	}

	public static void addCategoryResources(long categoryId,
		boolean addCommunityPermissions, boolean addGuestPermissions)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		getService()
			.addCategoryResources(categoryId, addCommunityPermissions,
			addGuestPermissions);
	}

	public static void addCategoryResources(
		com.vportal.portlet.vfaq.model.FAQCategory category,
		boolean addCommunityPermissions, boolean addGuestPermissions)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		getService()
			.addCategoryResources(category, addCommunityPermissions,
			addGuestPermissions);
	}

	public static void addCategoryResources(long categoryId,
		java.lang.String[] communityPermissions,
		java.lang.String[] guestPermissions)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		getService()
			.addCategoryResources(categoryId, communityPermissions,
			guestPermissions);
	}

	public static void addCategoryResources(
		com.vportal.portlet.vfaq.model.FAQCategory category,
		java.lang.String[] communityPermissions,
		java.lang.String[] guestPermissions)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		getService()
			.addCategoryResources(category, communityPermissions,
			guestPermissions);
	}

	public static java.util.List getByG_L(long groupId,
		java.lang.String language)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getByG_L(groupId, language);
	}

	public static java.util.List getByG_L(long groupId,
		java.lang.String language, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getByG_L(groupId, language, start, end);
	}

	public static java.util.List getByG_L_P(long groupId,
		java.lang.String language, long parentId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getByG_L_P(groupId, language, parentId);
	}

	public static java.util.List getByG_L_P(long groupId,
		java.lang.String language, long parentId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getByG_L_P(groupId, language, parentId, start, end);
	}

	public static int countByG_L(long groupId, java.lang.String language)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().countByG_L(groupId, language);
	}

	public static int countByG_L_P(long groupId, java.lang.String language,
		long parentId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().countByG_L_P(groupId, language, parentId);
	}

	public static int countByG_L_C(long groupId, java.lang.String language,
		long categoryId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().countByG_L_C(groupId, language, categoryId);
	}

	public static void clearService() {
		_service = null;
	}

	public static FAQCategoryLocalService getService() {
		if (_service == null) {
			Object obj = PortletBeanLocatorUtil.locate(ClpSerializer.SERVLET_CONTEXT_NAME,
					FAQCategoryLocalService.class.getName());
			ClassLoader portletClassLoader = (ClassLoader)PortletBeanLocatorUtil.locate(ClpSerializer.SERVLET_CONTEXT_NAME,
					"portletClassLoader");

			ClassLoaderProxy classLoaderProxy = new ClassLoaderProxy(obj,
					portletClassLoader);

			_service = new FAQCategoryLocalServiceClp(classLoaderProxy);

			ClpSerializer.setClassLoader(portletClassLoader);
		}

		return _service;
	}

	public void setService(FAQCategoryLocalService service) {
		_service = service;
	}

	private static FAQCategoryLocalService _service;
}