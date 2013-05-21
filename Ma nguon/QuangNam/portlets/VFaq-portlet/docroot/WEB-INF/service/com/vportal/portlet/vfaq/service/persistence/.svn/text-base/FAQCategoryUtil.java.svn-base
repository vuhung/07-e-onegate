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

package com.vportal.portlet.vfaq.service.persistence;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.service.ServiceContext;

import com.vportal.portlet.vfaq.model.FAQCategory;

import java.util.List;

/**
 * The persistence utility for the f a q category service. This utility wraps {@link FAQCategoryPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Never modify this class directly. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
 * </p>
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author HOAN
 * @see FAQCategoryPersistence
 * @see FAQCategoryPersistenceImpl
 * @generated
 */
public class FAQCategoryUtil {
	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#clearCache()
	 */
	public static void clearCache() {
		getPersistence().clearCache();
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#clearCache(com.liferay.portal.model.BaseModel)
	 */
	public static void clearCache(FAQCategory faqCategory) {
		getPersistence().clearCache(faqCategory);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#countWithDynamicQuery(DynamicQuery)
	 */
	public long countWithDynamicQuery(DynamicQuery dynamicQuery)
		throws SystemException {
		return getPersistence().countWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<FAQCategory> findWithDynamicQuery(
		DynamicQuery dynamicQuery) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<FAQCategory> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<FAQCategory> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#remove(com.liferay.portal.model.BaseModel)
	 */
	public static FAQCategory remove(FAQCategory faqCategory)
		throws SystemException {
		return getPersistence().remove(faqCategory);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, boolean)
	 */
	public static FAQCategory update(FAQCategory faqCategory, boolean merge)
		throws SystemException {
		return getPersistence().update(faqCategory, merge);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, boolean, ServiceContext)
	 */
	public static FAQCategory update(FAQCategory faqCategory, boolean merge,
		ServiceContext serviceContext) throws SystemException {
		return getPersistence().update(faqCategory, merge, serviceContext);
	}

	/**
	* Caches the f a q category in the entity cache if it is enabled.
	*
	* @param faqCategory the f a q category to cache
	*/
	public static void cacheResult(
		com.vportal.portlet.vfaq.model.FAQCategory faqCategory) {
		getPersistence().cacheResult(faqCategory);
	}

	/**
	* Caches the f a q categories in the entity cache if it is enabled.
	*
	* @param faqCategories the f a q categories to cache
	*/
	public static void cacheResult(
		java.util.List<com.vportal.portlet.vfaq.model.FAQCategory> faqCategories) {
		getPersistence().cacheResult(faqCategories);
	}

	/**
	* Creates a new f a q category with the primary key. Does not add the f a q category to the database.
	*
	* @param id the primary key for the new f a q category
	* @return the new f a q category
	*/
	public static com.vportal.portlet.vfaq.model.FAQCategory create(long id) {
		return getPersistence().create(id);
	}

	/**
	* Removes the f a q category with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the f a q category to remove
	* @return the f a q category that was removed
	* @throws com.vportal.portlet.vfaq.NoSuchFAQCategoryException if a f a q category with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.vportal.portlet.vfaq.model.FAQCategory remove(long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vfaq.NoSuchFAQCategoryException {
		return getPersistence().remove(id);
	}

	public static com.vportal.portlet.vfaq.model.FAQCategory updateImpl(
		com.vportal.portlet.vfaq.model.FAQCategory faqCategory, boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(faqCategory, merge);
	}

	/**
	* Finds the f a q category with the primary key or throws a {@link com.vportal.portlet.vfaq.NoSuchFAQCategoryException} if it could not be found.
	*
	* @param id the primary key of the f a q category to find
	* @return the f a q category
	* @throws com.vportal.portlet.vfaq.NoSuchFAQCategoryException if a f a q category with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.vportal.portlet.vfaq.model.FAQCategory findByPrimaryKey(
		long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vfaq.NoSuchFAQCategoryException {
		return getPersistence().findByPrimaryKey(id);
	}

	/**
	* Finds the f a q category with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the f a q category to find
	* @return the f a q category, or <code>null</code> if a f a q category with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.vportal.portlet.vfaq.model.FAQCategory fetchByPrimaryKey(
		long id) throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(id);
	}

	/**
	* Finds all the f a q categories where groupId = &#63;.
	*
	* @param groupId the group id to search with
	* @return the matching f a q categories
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.vportal.portlet.vfaq.model.FAQCategory> findByGroupId(
		long groupId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByGroupId(groupId);
	}

	/**
	* Finds a range of all the f a q categories where groupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param groupId the group id to search with
	* @param start the lower bound of the range of f a q categories to return
	* @param end the upper bound of the range of f a q categories to return (not inclusive)
	* @return the range of matching f a q categories
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.vportal.portlet.vfaq.model.FAQCategory> findByGroupId(
		long groupId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByGroupId(groupId, start, end);
	}

	/**
	* Finds an ordered range of all the f a q categories where groupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param groupId the group id to search with
	* @param start the lower bound of the range of f a q categories to return
	* @param end the upper bound of the range of f a q categories to return (not inclusive)
	* @param orderByComparator the comparator to order the results by
	* @return the ordered range of matching f a q categories
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.vportal.portlet.vfaq.model.FAQCategory> findByGroupId(
		long groupId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByGroupId(groupId, start, end, orderByComparator);
	}

	/**
	* Finds the first f a q category in the ordered set where groupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param groupId the group id to search with
	* @param orderByComparator the comparator to order the set by
	* @return the first matching f a q category
	* @throws com.vportal.portlet.vfaq.NoSuchFAQCategoryException if a matching f a q category could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.vportal.portlet.vfaq.model.FAQCategory findByGroupId_First(
		long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vfaq.NoSuchFAQCategoryException {
		return getPersistence().findByGroupId_First(groupId, orderByComparator);
	}

	/**
	* Finds the last f a q category in the ordered set where groupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param groupId the group id to search with
	* @param orderByComparator the comparator to order the set by
	* @return the last matching f a q category
	* @throws com.vportal.portlet.vfaq.NoSuchFAQCategoryException if a matching f a q category could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.vportal.portlet.vfaq.model.FAQCategory findByGroupId_Last(
		long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vfaq.NoSuchFAQCategoryException {
		return getPersistence().findByGroupId_Last(groupId, orderByComparator);
	}

	/**
	* Finds the f a q categories before and after the current f a q category in the ordered set where groupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param id the primary key of the current f a q category
	* @param groupId the group id to search with
	* @param orderByComparator the comparator to order the set by
	* @return the previous, current, and next f a q category
	* @throws com.vportal.portlet.vfaq.NoSuchFAQCategoryException if a f a q category with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.vportal.portlet.vfaq.model.FAQCategory[] findByGroupId_PrevAndNext(
		long id, long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vfaq.NoSuchFAQCategoryException {
		return getPersistence()
				   .findByGroupId_PrevAndNext(id, groupId, orderByComparator);
	}

	/**
	* Finds the f a q category where groupId = &#63; and id = &#63; or throws a {@link com.vportal.portlet.vfaq.NoSuchFAQCategoryException} if it could not be found.
	*
	* @param groupId the group id to search with
	* @param id the id to search with
	* @return the matching f a q category
	* @throws com.vportal.portlet.vfaq.NoSuchFAQCategoryException if a matching f a q category could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.vportal.portlet.vfaq.model.FAQCategory findByG_C(
		long groupId, long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vfaq.NoSuchFAQCategoryException {
		return getPersistence().findByG_C(groupId, id);
	}

	/**
	* Finds the f a q category where groupId = &#63; and id = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param groupId the group id to search with
	* @param id the id to search with
	* @return the matching f a q category, or <code>null</code> if a matching f a q category could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.vportal.portlet.vfaq.model.FAQCategory fetchByG_C(
		long groupId, long id)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByG_C(groupId, id);
	}

	/**
	* Finds the f a q category where groupId = &#63; and id = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param groupId the group id to search with
	* @param id the id to search with
	* @return the matching f a q category, or <code>null</code> if a matching f a q category could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.vportal.portlet.vfaq.model.FAQCategory fetchByG_C(
		long groupId, long id, boolean retrieveFromCache)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByG_C(groupId, id, retrieveFromCache);
	}

	/**
	* Finds all the f a q categories where groupId = &#63; and parent = &#63;.
	*
	* @param groupId the group id to search with
	* @param parent the parent to search with
	* @return the matching f a q categories
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.vportal.portlet.vfaq.model.FAQCategory> findByG_P(
		long groupId, long parent)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByG_P(groupId, parent);
	}

	/**
	* Finds a range of all the f a q categories where groupId = &#63; and parent = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param groupId the group id to search with
	* @param parent the parent to search with
	* @param start the lower bound of the range of f a q categories to return
	* @param end the upper bound of the range of f a q categories to return (not inclusive)
	* @return the range of matching f a q categories
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.vportal.portlet.vfaq.model.FAQCategory> findByG_P(
		long groupId, long parent, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByG_P(groupId, parent, start, end);
	}

	/**
	* Finds an ordered range of all the f a q categories where groupId = &#63; and parent = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param groupId the group id to search with
	* @param parent the parent to search with
	* @param start the lower bound of the range of f a q categories to return
	* @param end the upper bound of the range of f a q categories to return (not inclusive)
	* @param orderByComparator the comparator to order the results by
	* @return the ordered range of matching f a q categories
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.vportal.portlet.vfaq.model.FAQCategory> findByG_P(
		long groupId, long parent, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByG_P(groupId, parent, start, end, orderByComparator);
	}

	/**
	* Finds the first f a q category in the ordered set where groupId = &#63; and parent = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param groupId the group id to search with
	* @param parent the parent to search with
	* @param orderByComparator the comparator to order the set by
	* @return the first matching f a q category
	* @throws com.vportal.portlet.vfaq.NoSuchFAQCategoryException if a matching f a q category could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.vportal.portlet.vfaq.model.FAQCategory findByG_P_First(
		long groupId, long parent,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vfaq.NoSuchFAQCategoryException {
		return getPersistence()
				   .findByG_P_First(groupId, parent, orderByComparator);
	}

	/**
	* Finds the last f a q category in the ordered set where groupId = &#63; and parent = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param groupId the group id to search with
	* @param parent the parent to search with
	* @param orderByComparator the comparator to order the set by
	* @return the last matching f a q category
	* @throws com.vportal.portlet.vfaq.NoSuchFAQCategoryException if a matching f a q category could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.vportal.portlet.vfaq.model.FAQCategory findByG_P_Last(
		long groupId, long parent,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vfaq.NoSuchFAQCategoryException {
		return getPersistence()
				   .findByG_P_Last(groupId, parent, orderByComparator);
	}

	/**
	* Finds the f a q categories before and after the current f a q category in the ordered set where groupId = &#63; and parent = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param id the primary key of the current f a q category
	* @param groupId the group id to search with
	* @param parent the parent to search with
	* @param orderByComparator the comparator to order the set by
	* @return the previous, current, and next f a q category
	* @throws com.vportal.portlet.vfaq.NoSuchFAQCategoryException if a f a q category with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.vportal.portlet.vfaq.model.FAQCategory[] findByG_P_PrevAndNext(
		long id, long groupId, long parent,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vfaq.NoSuchFAQCategoryException {
		return getPersistence()
				   .findByG_P_PrevAndNext(id, groupId, parent, orderByComparator);
	}

	/**
	* Finds all the f a q categories where parent = &#63;.
	*
	* @param parent the parent to search with
	* @return the matching f a q categories
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.vportal.portlet.vfaq.model.FAQCategory> findByParentId(
		long parent) throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByParentId(parent);
	}

	/**
	* Finds a range of all the f a q categories where parent = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param parent the parent to search with
	* @param start the lower bound of the range of f a q categories to return
	* @param end the upper bound of the range of f a q categories to return (not inclusive)
	* @return the range of matching f a q categories
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.vportal.portlet.vfaq.model.FAQCategory> findByParentId(
		long parent, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByParentId(parent, start, end);
	}

	/**
	* Finds an ordered range of all the f a q categories where parent = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param parent the parent to search with
	* @param start the lower bound of the range of f a q categories to return
	* @param end the upper bound of the range of f a q categories to return (not inclusive)
	* @param orderByComparator the comparator to order the results by
	* @return the ordered range of matching f a q categories
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.vportal.portlet.vfaq.model.FAQCategory> findByParentId(
		long parent, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByParentId(parent, start, end, orderByComparator);
	}

	/**
	* Finds the first f a q category in the ordered set where parent = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param parent the parent to search with
	* @param orderByComparator the comparator to order the set by
	* @return the first matching f a q category
	* @throws com.vportal.portlet.vfaq.NoSuchFAQCategoryException if a matching f a q category could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.vportal.portlet.vfaq.model.FAQCategory findByParentId_First(
		long parent,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vfaq.NoSuchFAQCategoryException {
		return getPersistence().findByParentId_First(parent, orderByComparator);
	}

	/**
	* Finds the last f a q category in the ordered set where parent = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param parent the parent to search with
	* @param orderByComparator the comparator to order the set by
	* @return the last matching f a q category
	* @throws com.vportal.portlet.vfaq.NoSuchFAQCategoryException if a matching f a q category could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.vportal.portlet.vfaq.model.FAQCategory findByParentId_Last(
		long parent,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vfaq.NoSuchFAQCategoryException {
		return getPersistence().findByParentId_Last(parent, orderByComparator);
	}

	/**
	* Finds the f a q categories before and after the current f a q category in the ordered set where parent = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param id the primary key of the current f a q category
	* @param parent the parent to search with
	* @param orderByComparator the comparator to order the set by
	* @return the previous, current, and next f a q category
	* @throws com.vportal.portlet.vfaq.NoSuchFAQCategoryException if a f a q category with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.vportal.portlet.vfaq.model.FAQCategory[] findByParentId_PrevAndNext(
		long id, long parent,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vfaq.NoSuchFAQCategoryException {
		return getPersistence()
				   .findByParentId_PrevAndNext(id, parent, orderByComparator);
	}

	/**
	* Finds all the f a q categories where groupId = &#63; and language = &#63;.
	*
	* @param groupId the group id to search with
	* @param language the language to search with
	* @return the matching f a q categories
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.vportal.portlet.vfaq.model.FAQCategory> findByG_L(
		long groupId, java.lang.String language)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByG_L(groupId, language);
	}

	/**
	* Finds a range of all the f a q categories where groupId = &#63; and language = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param groupId the group id to search with
	* @param language the language to search with
	* @param start the lower bound of the range of f a q categories to return
	* @param end the upper bound of the range of f a q categories to return (not inclusive)
	* @return the range of matching f a q categories
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.vportal.portlet.vfaq.model.FAQCategory> findByG_L(
		long groupId, java.lang.String language, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByG_L(groupId, language, start, end);
	}

	/**
	* Finds an ordered range of all the f a q categories where groupId = &#63; and language = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param groupId the group id to search with
	* @param language the language to search with
	* @param start the lower bound of the range of f a q categories to return
	* @param end the upper bound of the range of f a q categories to return (not inclusive)
	* @param orderByComparator the comparator to order the results by
	* @return the ordered range of matching f a q categories
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.vportal.portlet.vfaq.model.FAQCategory> findByG_L(
		long groupId, java.lang.String language, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByG_L(groupId, language, start, end, orderByComparator);
	}

	/**
	* Finds the first f a q category in the ordered set where groupId = &#63; and language = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param groupId the group id to search with
	* @param language the language to search with
	* @param orderByComparator the comparator to order the set by
	* @return the first matching f a q category
	* @throws com.vportal.portlet.vfaq.NoSuchFAQCategoryException if a matching f a q category could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.vportal.portlet.vfaq.model.FAQCategory findByG_L_First(
		long groupId, java.lang.String language,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vfaq.NoSuchFAQCategoryException {
		return getPersistence()
				   .findByG_L_First(groupId, language, orderByComparator);
	}

	/**
	* Finds the last f a q category in the ordered set where groupId = &#63; and language = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param groupId the group id to search with
	* @param language the language to search with
	* @param orderByComparator the comparator to order the set by
	* @return the last matching f a q category
	* @throws com.vportal.portlet.vfaq.NoSuchFAQCategoryException if a matching f a q category could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.vportal.portlet.vfaq.model.FAQCategory findByG_L_Last(
		long groupId, java.lang.String language,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vfaq.NoSuchFAQCategoryException {
		return getPersistence()
				   .findByG_L_Last(groupId, language, orderByComparator);
	}

	/**
	* Finds the f a q categories before and after the current f a q category in the ordered set where groupId = &#63; and language = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param id the primary key of the current f a q category
	* @param groupId the group id to search with
	* @param language the language to search with
	* @param orderByComparator the comparator to order the set by
	* @return the previous, current, and next f a q category
	* @throws com.vportal.portlet.vfaq.NoSuchFAQCategoryException if a f a q category with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.vportal.portlet.vfaq.model.FAQCategory[] findByG_L_PrevAndNext(
		long id, long groupId, java.lang.String language,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vfaq.NoSuchFAQCategoryException {
		return getPersistence()
				   .findByG_L_PrevAndNext(id, groupId, language,
			orderByComparator);
	}

	/**
	* Finds all the f a q categories where groupId = &#63; and language = &#63; and parent = &#63;.
	*
	* @param groupId the group id to search with
	* @param language the language to search with
	* @param parent the parent to search with
	* @return the matching f a q categories
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.vportal.portlet.vfaq.model.FAQCategory> findByG_L_P(
		long groupId, java.lang.String language, long parent)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByG_L_P(groupId, language, parent);
	}

	/**
	* Finds a range of all the f a q categories where groupId = &#63; and language = &#63; and parent = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param groupId the group id to search with
	* @param language the language to search with
	* @param parent the parent to search with
	* @param start the lower bound of the range of f a q categories to return
	* @param end the upper bound of the range of f a q categories to return (not inclusive)
	* @return the range of matching f a q categories
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.vportal.portlet.vfaq.model.FAQCategory> findByG_L_P(
		long groupId, java.lang.String language, long parent, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByG_L_P(groupId, language, parent, start, end);
	}

	/**
	* Finds an ordered range of all the f a q categories where groupId = &#63; and language = &#63; and parent = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param groupId the group id to search with
	* @param language the language to search with
	* @param parent the parent to search with
	* @param start the lower bound of the range of f a q categories to return
	* @param end the upper bound of the range of f a q categories to return (not inclusive)
	* @param orderByComparator the comparator to order the results by
	* @return the ordered range of matching f a q categories
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.vportal.portlet.vfaq.model.FAQCategory> findByG_L_P(
		long groupId, java.lang.String language, long parent, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByG_L_P(groupId, language, parent, start, end,
			orderByComparator);
	}

	/**
	* Finds the first f a q category in the ordered set where groupId = &#63; and language = &#63; and parent = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param groupId the group id to search with
	* @param language the language to search with
	* @param parent the parent to search with
	* @param orderByComparator the comparator to order the set by
	* @return the first matching f a q category
	* @throws com.vportal.portlet.vfaq.NoSuchFAQCategoryException if a matching f a q category could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.vportal.portlet.vfaq.model.FAQCategory findByG_L_P_First(
		long groupId, java.lang.String language, long parent,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vfaq.NoSuchFAQCategoryException {
		return getPersistence()
				   .findByG_L_P_First(groupId, language, parent,
			orderByComparator);
	}

	/**
	* Finds the last f a q category in the ordered set where groupId = &#63; and language = &#63; and parent = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param groupId the group id to search with
	* @param language the language to search with
	* @param parent the parent to search with
	* @param orderByComparator the comparator to order the set by
	* @return the last matching f a q category
	* @throws com.vportal.portlet.vfaq.NoSuchFAQCategoryException if a matching f a q category could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.vportal.portlet.vfaq.model.FAQCategory findByG_L_P_Last(
		long groupId, java.lang.String language, long parent,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vfaq.NoSuchFAQCategoryException {
		return getPersistence()
				   .findByG_L_P_Last(groupId, language, parent,
			orderByComparator);
	}

	/**
	* Finds the f a q categories before and after the current f a q category in the ordered set where groupId = &#63; and language = &#63; and parent = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param id the primary key of the current f a q category
	* @param groupId the group id to search with
	* @param language the language to search with
	* @param parent the parent to search with
	* @param orderByComparator the comparator to order the set by
	* @return the previous, current, and next f a q category
	* @throws com.vportal.portlet.vfaq.NoSuchFAQCategoryException if a f a q category with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.vportal.portlet.vfaq.model.FAQCategory[] findByG_L_P_PrevAndNext(
		long id, long groupId, java.lang.String language, long parent,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vfaq.NoSuchFAQCategoryException {
		return getPersistence()
				   .findByG_L_P_PrevAndNext(id, groupId, language, parent,
			orderByComparator);
	}

	/**
	* Finds all the f a q categories.
	*
	* @return the f a q categories
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.vportal.portlet.vfaq.model.FAQCategory> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
	}

	/**
	* Finds a range of all the f a q categories.
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
	public static java.util.List<com.vportal.portlet.vfaq.model.FAQCategory> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

	/**
	* Finds an ordered range of all the f a q categories.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of f a q categories to return
	* @param end the upper bound of the range of f a q categories to return (not inclusive)
	* @param orderByComparator the comparator to order the results by
	* @return the ordered range of f a q categories
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.vportal.portlet.vfaq.model.FAQCategory> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the f a q categories where groupId = &#63; from the database.
	*
	* @param groupId the group id to search with
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByGroupId(long groupId)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByGroupId(groupId);
	}

	/**
	* Removes the f a q category where groupId = &#63; and id = &#63; from the database.
	*
	* @param groupId the group id to search with
	* @param id the id to search with
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByG_C(long groupId, long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vfaq.NoSuchFAQCategoryException {
		getPersistence().removeByG_C(groupId, id);
	}

	/**
	* Removes all the f a q categories where groupId = &#63; and parent = &#63; from the database.
	*
	* @param groupId the group id to search with
	* @param parent the parent to search with
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByG_P(long groupId, long parent)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByG_P(groupId, parent);
	}

	/**
	* Removes all the f a q categories where parent = &#63; from the database.
	*
	* @param parent the parent to search with
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByParentId(long parent)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByParentId(parent);
	}

	/**
	* Removes all the f a q categories where groupId = &#63; and language = &#63; from the database.
	*
	* @param groupId the group id to search with
	* @param language the language to search with
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByG_L(long groupId, java.lang.String language)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByG_L(groupId, language);
	}

	/**
	* Removes all the f a q categories where groupId = &#63; and language = &#63; and parent = &#63; from the database.
	*
	* @param groupId the group id to search with
	* @param language the language to search with
	* @param parent the parent to search with
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByG_L_P(long groupId, java.lang.String language,
		long parent) throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByG_L_P(groupId, language, parent);
	}

	/**
	* Removes all the f a q categories from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Counts all the f a q categories where groupId = &#63;.
	*
	* @param groupId the group id to search with
	* @return the number of matching f a q categories
	* @throws SystemException if a system exception occurred
	*/
	public static int countByGroupId(long groupId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByGroupId(groupId);
	}

	/**
	* Counts all the f a q categories where groupId = &#63; and id = &#63;.
	*
	* @param groupId the group id to search with
	* @param id the id to search with
	* @return the number of matching f a q categories
	* @throws SystemException if a system exception occurred
	*/
	public static int countByG_C(long groupId, long id)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByG_C(groupId, id);
	}

	/**
	* Counts all the f a q categories where groupId = &#63; and parent = &#63;.
	*
	* @param groupId the group id to search with
	* @param parent the parent to search with
	* @return the number of matching f a q categories
	* @throws SystemException if a system exception occurred
	*/
	public static int countByG_P(long groupId, long parent)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByG_P(groupId, parent);
	}

	/**
	* Counts all the f a q categories where parent = &#63;.
	*
	* @param parent the parent to search with
	* @return the number of matching f a q categories
	* @throws SystemException if a system exception occurred
	*/
	public static int countByParentId(long parent)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByParentId(parent);
	}

	/**
	* Counts all the f a q categories where groupId = &#63; and language = &#63;.
	*
	* @param groupId the group id to search with
	* @param language the language to search with
	* @return the number of matching f a q categories
	* @throws SystemException if a system exception occurred
	*/
	public static int countByG_L(long groupId, java.lang.String language)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByG_L(groupId, language);
	}

	/**
	* Counts all the f a q categories where groupId = &#63; and language = &#63; and parent = &#63;.
	*
	* @param groupId the group id to search with
	* @param language the language to search with
	* @param parent the parent to search with
	* @return the number of matching f a q categories
	* @throws SystemException if a system exception occurred
	*/
	public static int countByG_L_P(long groupId, java.lang.String language,
		long parent) throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByG_L_P(groupId, language, parent);
	}

	/**
	* Counts all the f a q categories.
	*
	* @return the number of f a q categories
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static FAQCategoryPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (FAQCategoryPersistence)PortletBeanLocatorUtil.locate(com.vportal.portlet.vfaq.service.ClpSerializer.SERVLET_CONTEXT_NAME,
					FAQCategoryPersistence.class.getName());
		}

		return _persistence;
	}

	public void setPersistence(FAQCategoryPersistence persistence) {
		_persistence = persistence;
	}

	private static FAQCategoryPersistence _persistence;
}