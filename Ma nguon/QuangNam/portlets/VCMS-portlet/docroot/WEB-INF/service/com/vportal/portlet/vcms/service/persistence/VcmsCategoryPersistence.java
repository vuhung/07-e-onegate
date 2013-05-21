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

package com.vportal.portlet.vcms.service.persistence;

import com.liferay.portal.service.persistence.BasePersistence;

import com.vportal.portlet.vcms.model.VcmsCategory;

/**
 * The persistence interface for the vcms category service.
 *
 * <p>
 * Never modify or reference this interface directly. Always use {@link VcmsCategoryUtil} to access the vcms category persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
 * </p>
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author HOAN
 * @see VcmsCategoryPersistenceImpl
 * @see VcmsCategoryUtil
 * @generated
 */
public interface VcmsCategoryPersistence extends BasePersistence<VcmsCategory> {
	/**
	* Caches the vcms category in the entity cache if it is enabled.
	*
	* @param vcmsCategory the vcms category to cache
	*/
	public void cacheResult(
		com.vportal.portlet.vcms.model.VcmsCategory vcmsCategory);

	/**
	* Caches the vcms categories in the entity cache if it is enabled.
	*
	* @param vcmsCategories the vcms categories to cache
	*/
	public void cacheResult(
		java.util.List<com.vportal.portlet.vcms.model.VcmsCategory> vcmsCategories);

	/**
	* Creates a new vcms category with the primary key. Does not add the vcms category to the database.
	*
	* @param categoryId the primary key for the new vcms category
	* @return the new vcms category
	*/
	public com.vportal.portlet.vcms.model.VcmsCategory create(
		java.lang.String categoryId);

	/**
	* Removes the vcms category with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param categoryId the primary key of the vcms category to remove
	* @return the vcms category that was removed
	* @throws com.vportal.portlet.vcms.NoSuchVcmsCategoryException if a vcms category with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.vportal.portlet.vcms.model.VcmsCategory remove(
		java.lang.String categoryId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vcms.NoSuchVcmsCategoryException;

	public com.vportal.portlet.vcms.model.VcmsCategory updateImpl(
		com.vportal.portlet.vcms.model.VcmsCategory vcmsCategory, boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Finds the vcms category with the primary key or throws a {@link com.vportal.portlet.vcms.NoSuchVcmsCategoryException} if it could not be found.
	*
	* @param categoryId the primary key of the vcms category to find
	* @return the vcms category
	* @throws com.vportal.portlet.vcms.NoSuchVcmsCategoryException if a vcms category with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.vportal.portlet.vcms.model.VcmsCategory findByPrimaryKey(
		java.lang.String categoryId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vcms.NoSuchVcmsCategoryException;

	/**
	* Finds the vcms category with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param categoryId the primary key of the vcms category to find
	* @return the vcms category, or <code>null</code> if a vcms category with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.vportal.portlet.vcms.model.VcmsCategory fetchByPrimaryKey(
		java.lang.String categoryId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Finds all the vcms categories where groupId = &#63; and portionId = &#63; and language = &#63;.
	*
	* @param groupId the group id to search with
	* @param portionId the portion id to search with
	* @param language the language to search with
	* @return the matching vcms categories
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.vportal.portlet.vcms.model.VcmsCategory> findByPortion_Language(
		long groupId, java.lang.String portionId, java.lang.String language)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Finds a range of all the vcms categories where groupId = &#63; and portionId = &#63; and language = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param groupId the group id to search with
	* @param portionId the portion id to search with
	* @param language the language to search with
	* @param start the lower bound of the range of vcms categories to return
	* @param end the upper bound of the range of vcms categories to return (not inclusive)
	* @return the range of matching vcms categories
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.vportal.portlet.vcms.model.VcmsCategory> findByPortion_Language(
		long groupId, java.lang.String portionId, java.lang.String language,
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Finds an ordered range of all the vcms categories where groupId = &#63; and portionId = &#63; and language = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param groupId the group id to search with
	* @param portionId the portion id to search with
	* @param language the language to search with
	* @param start the lower bound of the range of vcms categories to return
	* @param end the upper bound of the range of vcms categories to return (not inclusive)
	* @param orderByComparator the comparator to order the results by
	* @return the ordered range of matching vcms categories
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.vportal.portlet.vcms.model.VcmsCategory> findByPortion_Language(
		long groupId, java.lang.String portionId, java.lang.String language,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Finds the first vcms category in the ordered set where groupId = &#63; and portionId = &#63; and language = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param groupId the group id to search with
	* @param portionId the portion id to search with
	* @param language the language to search with
	* @param orderByComparator the comparator to order the set by
	* @return the first matching vcms category
	* @throws com.vportal.portlet.vcms.NoSuchVcmsCategoryException if a matching vcms category could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.vportal.portlet.vcms.model.VcmsCategory findByPortion_Language_First(
		long groupId, java.lang.String portionId, java.lang.String language,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vcms.NoSuchVcmsCategoryException;

	/**
	* Finds the last vcms category in the ordered set where groupId = &#63; and portionId = &#63; and language = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param groupId the group id to search with
	* @param portionId the portion id to search with
	* @param language the language to search with
	* @param orderByComparator the comparator to order the set by
	* @return the last matching vcms category
	* @throws com.vportal.portlet.vcms.NoSuchVcmsCategoryException if a matching vcms category could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.vportal.portlet.vcms.model.VcmsCategory findByPortion_Language_Last(
		long groupId, java.lang.String portionId, java.lang.String language,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vcms.NoSuchVcmsCategoryException;

	/**
	* Finds the vcms categories before and after the current vcms category in the ordered set where groupId = &#63; and portionId = &#63; and language = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param categoryId the primary key of the current vcms category
	* @param groupId the group id to search with
	* @param portionId the portion id to search with
	* @param language the language to search with
	* @param orderByComparator the comparator to order the set by
	* @return the previous, current, and next vcms category
	* @throws com.vportal.portlet.vcms.NoSuchVcmsCategoryException if a vcms category with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.vportal.portlet.vcms.model.VcmsCategory[] findByPortion_Language_PrevAndNext(
		java.lang.String categoryId, long groupId, java.lang.String portionId,
		java.lang.String language,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vcms.NoSuchVcmsCategoryException;

	/**
	* Finds all the vcms categories where groupId = &#63; and parentId = &#63; and language = &#63;.
	*
	* @param groupId the group id to search with
	* @param parentId the parent id to search with
	* @param language the language to search with
	* @return the matching vcms categories
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.vportal.portlet.vcms.model.VcmsCategory> findByParent_Language(
		long groupId, java.lang.String parentId, java.lang.String language)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Finds a range of all the vcms categories where groupId = &#63; and parentId = &#63; and language = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param groupId the group id to search with
	* @param parentId the parent id to search with
	* @param language the language to search with
	* @param start the lower bound of the range of vcms categories to return
	* @param end the upper bound of the range of vcms categories to return (not inclusive)
	* @return the range of matching vcms categories
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.vportal.portlet.vcms.model.VcmsCategory> findByParent_Language(
		long groupId, java.lang.String parentId, java.lang.String language,
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Finds an ordered range of all the vcms categories where groupId = &#63; and parentId = &#63; and language = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param groupId the group id to search with
	* @param parentId the parent id to search with
	* @param language the language to search with
	* @param start the lower bound of the range of vcms categories to return
	* @param end the upper bound of the range of vcms categories to return (not inclusive)
	* @param orderByComparator the comparator to order the results by
	* @return the ordered range of matching vcms categories
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.vportal.portlet.vcms.model.VcmsCategory> findByParent_Language(
		long groupId, java.lang.String parentId, java.lang.String language,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Finds the first vcms category in the ordered set where groupId = &#63; and parentId = &#63; and language = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param groupId the group id to search with
	* @param parentId the parent id to search with
	* @param language the language to search with
	* @param orderByComparator the comparator to order the set by
	* @return the first matching vcms category
	* @throws com.vportal.portlet.vcms.NoSuchVcmsCategoryException if a matching vcms category could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.vportal.portlet.vcms.model.VcmsCategory findByParent_Language_First(
		long groupId, java.lang.String parentId, java.lang.String language,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vcms.NoSuchVcmsCategoryException;

	/**
	* Finds the last vcms category in the ordered set where groupId = &#63; and parentId = &#63; and language = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param groupId the group id to search with
	* @param parentId the parent id to search with
	* @param language the language to search with
	* @param orderByComparator the comparator to order the set by
	* @return the last matching vcms category
	* @throws com.vportal.portlet.vcms.NoSuchVcmsCategoryException if a matching vcms category could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.vportal.portlet.vcms.model.VcmsCategory findByParent_Language_Last(
		long groupId, java.lang.String parentId, java.lang.String language,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vcms.NoSuchVcmsCategoryException;

	/**
	* Finds the vcms categories before and after the current vcms category in the ordered set where groupId = &#63; and parentId = &#63; and language = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param categoryId the primary key of the current vcms category
	* @param groupId the group id to search with
	* @param parentId the parent id to search with
	* @param language the language to search with
	* @param orderByComparator the comparator to order the set by
	* @return the previous, current, and next vcms category
	* @throws com.vportal.portlet.vcms.NoSuchVcmsCategoryException if a vcms category with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.vportal.portlet.vcms.model.VcmsCategory[] findByParent_Language_PrevAndNext(
		java.lang.String categoryId, long groupId, java.lang.String parentId,
		java.lang.String language,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vcms.NoSuchVcmsCategoryException;

	/**
	* Finds all the vcms categories where groupId = &#63; and language = &#63;.
	*
	* @param groupId the group id to search with
	* @param language the language to search with
	* @return the matching vcms categories
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.vportal.portlet.vcms.model.VcmsCategory> findByLanguage(
		long groupId, java.lang.String language)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Finds a range of all the vcms categories where groupId = &#63; and language = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param groupId the group id to search with
	* @param language the language to search with
	* @param start the lower bound of the range of vcms categories to return
	* @param end the upper bound of the range of vcms categories to return (not inclusive)
	* @return the range of matching vcms categories
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.vportal.portlet.vcms.model.VcmsCategory> findByLanguage(
		long groupId, java.lang.String language, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Finds an ordered range of all the vcms categories where groupId = &#63; and language = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param groupId the group id to search with
	* @param language the language to search with
	* @param start the lower bound of the range of vcms categories to return
	* @param end the upper bound of the range of vcms categories to return (not inclusive)
	* @param orderByComparator the comparator to order the results by
	* @return the ordered range of matching vcms categories
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.vportal.portlet.vcms.model.VcmsCategory> findByLanguage(
		long groupId, java.lang.String language, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Finds the first vcms category in the ordered set where groupId = &#63; and language = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param groupId the group id to search with
	* @param language the language to search with
	* @param orderByComparator the comparator to order the set by
	* @return the first matching vcms category
	* @throws com.vportal.portlet.vcms.NoSuchVcmsCategoryException if a matching vcms category could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.vportal.portlet.vcms.model.VcmsCategory findByLanguage_First(
		long groupId, java.lang.String language,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vcms.NoSuchVcmsCategoryException;

	/**
	* Finds the last vcms category in the ordered set where groupId = &#63; and language = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param groupId the group id to search with
	* @param language the language to search with
	* @param orderByComparator the comparator to order the set by
	* @return the last matching vcms category
	* @throws com.vportal.portlet.vcms.NoSuchVcmsCategoryException if a matching vcms category could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.vportal.portlet.vcms.model.VcmsCategory findByLanguage_Last(
		long groupId, java.lang.String language,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vcms.NoSuchVcmsCategoryException;

	/**
	* Finds the vcms categories before and after the current vcms category in the ordered set where groupId = &#63; and language = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param categoryId the primary key of the current vcms category
	* @param groupId the group id to search with
	* @param language the language to search with
	* @param orderByComparator the comparator to order the set by
	* @return the previous, current, and next vcms category
	* @throws com.vportal.portlet.vcms.NoSuchVcmsCategoryException if a vcms category with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.vportal.portlet.vcms.model.VcmsCategory[] findByLanguage_PrevAndNext(
		java.lang.String categoryId, long groupId, java.lang.String language,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vcms.NoSuchVcmsCategoryException;

	/**
	* Finds all the vcms categories where groupId = &#63; and portionId = &#63; and parentId = &#63; and language = &#63;.
	*
	* @param groupId the group id to search with
	* @param portionId the portion id to search with
	* @param parentId the parent id to search with
	* @param language the language to search with
	* @return the matching vcms categories
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.vportal.portlet.vcms.model.VcmsCategory> findByP_P_L(
		long groupId, java.lang.String portionId, java.lang.String parentId,
		java.lang.String language)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Finds a range of all the vcms categories where groupId = &#63; and portionId = &#63; and parentId = &#63; and language = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param groupId the group id to search with
	* @param portionId the portion id to search with
	* @param parentId the parent id to search with
	* @param language the language to search with
	* @param start the lower bound of the range of vcms categories to return
	* @param end the upper bound of the range of vcms categories to return (not inclusive)
	* @return the range of matching vcms categories
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.vportal.portlet.vcms.model.VcmsCategory> findByP_P_L(
		long groupId, java.lang.String portionId, java.lang.String parentId,
		java.lang.String language, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Finds an ordered range of all the vcms categories where groupId = &#63; and portionId = &#63; and parentId = &#63; and language = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param groupId the group id to search with
	* @param portionId the portion id to search with
	* @param parentId the parent id to search with
	* @param language the language to search with
	* @param start the lower bound of the range of vcms categories to return
	* @param end the upper bound of the range of vcms categories to return (not inclusive)
	* @param orderByComparator the comparator to order the results by
	* @return the ordered range of matching vcms categories
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.vportal.portlet.vcms.model.VcmsCategory> findByP_P_L(
		long groupId, java.lang.String portionId, java.lang.String parentId,
		java.lang.String language, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Finds the first vcms category in the ordered set where groupId = &#63; and portionId = &#63; and parentId = &#63; and language = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param groupId the group id to search with
	* @param portionId the portion id to search with
	* @param parentId the parent id to search with
	* @param language the language to search with
	* @param orderByComparator the comparator to order the set by
	* @return the first matching vcms category
	* @throws com.vportal.portlet.vcms.NoSuchVcmsCategoryException if a matching vcms category could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.vportal.portlet.vcms.model.VcmsCategory findByP_P_L_First(
		long groupId, java.lang.String portionId, java.lang.String parentId,
		java.lang.String language,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vcms.NoSuchVcmsCategoryException;

	/**
	* Finds the last vcms category in the ordered set where groupId = &#63; and portionId = &#63; and parentId = &#63; and language = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param groupId the group id to search with
	* @param portionId the portion id to search with
	* @param parentId the parent id to search with
	* @param language the language to search with
	* @param orderByComparator the comparator to order the set by
	* @return the last matching vcms category
	* @throws com.vportal.portlet.vcms.NoSuchVcmsCategoryException if a matching vcms category could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.vportal.portlet.vcms.model.VcmsCategory findByP_P_L_Last(
		long groupId, java.lang.String portionId, java.lang.String parentId,
		java.lang.String language,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vcms.NoSuchVcmsCategoryException;

	/**
	* Finds the vcms categories before and after the current vcms category in the ordered set where groupId = &#63; and portionId = &#63; and parentId = &#63; and language = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param categoryId the primary key of the current vcms category
	* @param groupId the group id to search with
	* @param portionId the portion id to search with
	* @param parentId the parent id to search with
	* @param language the language to search with
	* @param orderByComparator the comparator to order the set by
	* @return the previous, current, and next vcms category
	* @throws com.vportal.portlet.vcms.NoSuchVcmsCategoryException if a vcms category with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.vportal.portlet.vcms.model.VcmsCategory[] findByP_P_L_PrevAndNext(
		java.lang.String categoryId, long groupId, java.lang.String portionId,
		java.lang.String parentId, java.lang.String language,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vcms.NoSuchVcmsCategoryException;

	/**
	* Finds all the vcms categories.
	*
	* @return the vcms categories
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.vportal.portlet.vcms.model.VcmsCategory> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Finds a range of all the vcms categories.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of vcms categories to return
	* @param end the upper bound of the range of vcms categories to return (not inclusive)
	* @return the range of vcms categories
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.vportal.portlet.vcms.model.VcmsCategory> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Finds an ordered range of all the vcms categories.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of vcms categories to return
	* @param end the upper bound of the range of vcms categories to return (not inclusive)
	* @param orderByComparator the comparator to order the results by
	* @return the ordered range of vcms categories
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.vportal.portlet.vcms.model.VcmsCategory> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the vcms categories where groupId = &#63; and portionId = &#63; and language = &#63; from the database.
	*
	* @param groupId the group id to search with
	* @param portionId the portion id to search with
	* @param language the language to search with
	* @throws SystemException if a system exception occurred
	*/
	public void removeByPortion_Language(long groupId,
		java.lang.String portionId, java.lang.String language)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the vcms categories where groupId = &#63; and parentId = &#63; and language = &#63; from the database.
	*
	* @param groupId the group id to search with
	* @param parentId the parent id to search with
	* @param language the language to search with
	* @throws SystemException if a system exception occurred
	*/
	public void removeByParent_Language(long groupId,
		java.lang.String parentId, java.lang.String language)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the vcms categories where groupId = &#63; and language = &#63; from the database.
	*
	* @param groupId the group id to search with
	* @param language the language to search with
	* @throws SystemException if a system exception occurred
	*/
	public void removeByLanguage(long groupId, java.lang.String language)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the vcms categories where groupId = &#63; and portionId = &#63; and parentId = &#63; and language = &#63; from the database.
	*
	* @param groupId the group id to search with
	* @param portionId the portion id to search with
	* @param parentId the parent id to search with
	* @param language the language to search with
	* @throws SystemException if a system exception occurred
	*/
	public void removeByP_P_L(long groupId, java.lang.String portionId,
		java.lang.String parentId, java.lang.String language)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the vcms categories from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Counts all the vcms categories where groupId = &#63; and portionId = &#63; and language = &#63;.
	*
	* @param groupId the group id to search with
	* @param portionId the portion id to search with
	* @param language the language to search with
	* @return the number of matching vcms categories
	* @throws SystemException if a system exception occurred
	*/
	public int countByPortion_Language(long groupId,
		java.lang.String portionId, java.lang.String language)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Counts all the vcms categories where groupId = &#63; and parentId = &#63; and language = &#63;.
	*
	* @param groupId the group id to search with
	* @param parentId the parent id to search with
	* @param language the language to search with
	* @return the number of matching vcms categories
	* @throws SystemException if a system exception occurred
	*/
	public int countByParent_Language(long groupId, java.lang.String parentId,
		java.lang.String language)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Counts all the vcms categories where groupId = &#63; and language = &#63;.
	*
	* @param groupId the group id to search with
	* @param language the language to search with
	* @return the number of matching vcms categories
	* @throws SystemException if a system exception occurred
	*/
	public int countByLanguage(long groupId, java.lang.String language)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Counts all the vcms categories where groupId = &#63; and portionId = &#63; and parentId = &#63; and language = &#63;.
	*
	* @param groupId the group id to search with
	* @param portionId the portion id to search with
	* @param parentId the parent id to search with
	* @param language the language to search with
	* @return the number of matching vcms categories
	* @throws SystemException if a system exception occurred
	*/
	public int countByP_P_L(long groupId, java.lang.String portionId,
		java.lang.String parentId, java.lang.String language)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Counts all the vcms categories.
	*
	* @return the number of vcms categories
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}