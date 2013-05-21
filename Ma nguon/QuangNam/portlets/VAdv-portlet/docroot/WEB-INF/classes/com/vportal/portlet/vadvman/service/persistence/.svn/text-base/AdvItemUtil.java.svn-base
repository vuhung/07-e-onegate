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

package com.vportal.portlet.vadvman.service.persistence;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.service.ServiceContext;

import com.vportal.portlet.vadvman.model.AdvItem;

import java.util.List;

/**
 * The persistence utility for the adv item service. This utility wraps {@link AdvItemPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
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
 * @see AdvItemPersistence
 * @see AdvItemPersistenceImpl
 * @generated
 */
public class AdvItemUtil {
	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#clearCache()
	 */
	public static void clearCache() {
		getPersistence().clearCache();
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#clearCache(com.liferay.portal.model.BaseModel)
	 */
	public static void clearCache(AdvItem advItem) {
		getPersistence().clearCache(advItem);
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
	public static List<AdvItem> findWithDynamicQuery(DynamicQuery dynamicQuery)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<AdvItem> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<AdvItem> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#remove(com.liferay.portal.model.BaseModel)
	 */
	public static AdvItem remove(AdvItem advItem) throws SystemException {
		return getPersistence().remove(advItem);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, boolean)
	 */
	public static AdvItem update(AdvItem advItem, boolean merge)
		throws SystemException {
		return getPersistence().update(advItem, merge);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, boolean, ServiceContext)
	 */
	public static AdvItem update(AdvItem advItem, boolean merge,
		ServiceContext serviceContext) throws SystemException {
		return getPersistence().update(advItem, merge, serviceContext);
	}

	/**
	* Caches the adv item in the entity cache if it is enabled.
	*
	* @param advItem the adv item to cache
	*/
	public static void cacheResult(
		com.vportal.portlet.vadvman.model.AdvItem advItem) {
		getPersistence().cacheResult(advItem);
	}

	/**
	* Caches the adv items in the entity cache if it is enabled.
	*
	* @param advItems the adv items to cache
	*/
	public static void cacheResult(
		java.util.List<com.vportal.portlet.vadvman.model.AdvItem> advItems) {
		getPersistence().cacheResult(advItems);
	}

	/**
	* Creates a new adv item with the primary key. Does not add the adv item to the database.
	*
	* @param itemId the primary key for the new adv item
	* @return the new adv item
	*/
	public static com.vportal.portlet.vadvman.model.AdvItem create(long itemId) {
		return getPersistence().create(itemId);
	}

	/**
	* Removes the adv item with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param itemId the primary key of the adv item to remove
	* @return the adv item that was removed
	* @throws com.vportal.portlet.vadvman.NoSuchAdvItemException if a adv item with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.vportal.portlet.vadvman.model.AdvItem remove(long itemId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vadvman.NoSuchAdvItemException {
		return getPersistence().remove(itemId);
	}

	public static com.vportal.portlet.vadvman.model.AdvItem updateImpl(
		com.vportal.portlet.vadvman.model.AdvItem advItem, boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(advItem, merge);
	}

	/**
	* Finds the adv item with the primary key or throws a {@link com.vportal.portlet.vadvman.NoSuchAdvItemException} if it could not be found.
	*
	* @param itemId the primary key of the adv item to find
	* @return the adv item
	* @throws com.vportal.portlet.vadvman.NoSuchAdvItemException if a adv item with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.vportal.portlet.vadvman.model.AdvItem findByPrimaryKey(
		long itemId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vadvman.NoSuchAdvItemException {
		return getPersistence().findByPrimaryKey(itemId);
	}

	/**
	* Finds the adv item with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param itemId the primary key of the adv item to find
	* @return the adv item, or <code>null</code> if a adv item with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.vportal.portlet.vadvman.model.AdvItem fetchByPrimaryKey(
		long itemId) throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(itemId);
	}

	/**
	* Finds all the adv items where groupId = &#63;.
	*
	* @param groupId the group id to search with
	* @return the matching adv items
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.vportal.portlet.vadvman.model.AdvItem> findByG(
		long groupId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByG(groupId);
	}

	/**
	* Finds a range of all the adv items where groupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param groupId the group id to search with
	* @param start the lower bound of the range of adv items to return
	* @param end the upper bound of the range of adv items to return (not inclusive)
	* @return the range of matching adv items
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.vportal.portlet.vadvman.model.AdvItem> findByG(
		long groupId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByG(groupId, start, end);
	}

	/**
	* Finds an ordered range of all the adv items where groupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param groupId the group id to search with
	* @param start the lower bound of the range of adv items to return
	* @param end the upper bound of the range of adv items to return (not inclusive)
	* @param orderByComparator the comparator to order the results by
	* @return the ordered range of matching adv items
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.vportal.portlet.vadvman.model.AdvItem> findByG(
		long groupId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByG(groupId, start, end, orderByComparator);
	}

	/**
	* Finds the first adv item in the ordered set where groupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param groupId the group id to search with
	* @param orderByComparator the comparator to order the set by
	* @return the first matching adv item
	* @throws com.vportal.portlet.vadvman.NoSuchAdvItemException if a matching adv item could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.vportal.portlet.vadvman.model.AdvItem findByG_First(
		long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vadvman.NoSuchAdvItemException {
		return getPersistence().findByG_First(groupId, orderByComparator);
	}

	/**
	* Finds the last adv item in the ordered set where groupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param groupId the group id to search with
	* @param orderByComparator the comparator to order the set by
	* @return the last matching adv item
	* @throws com.vportal.portlet.vadvman.NoSuchAdvItemException if a matching adv item could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.vportal.portlet.vadvman.model.AdvItem findByG_Last(
		long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vadvman.NoSuchAdvItemException {
		return getPersistence().findByG_Last(groupId, orderByComparator);
	}

	/**
	* Finds the adv items before and after the current adv item in the ordered set where groupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param itemId the primary key of the current adv item
	* @param groupId the group id to search with
	* @param orderByComparator the comparator to order the set by
	* @return the previous, current, and next adv item
	* @throws com.vportal.portlet.vadvman.NoSuchAdvItemException if a adv item with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.vportal.portlet.vadvman.model.AdvItem[] findByG_PrevAndNext(
		long itemId, long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vadvman.NoSuchAdvItemException {
		return getPersistence()
				   .findByG_PrevAndNext(itemId, groupId, orderByComparator);
	}

	/**
	* Finds all the adv items where typeId = &#63;.
	*
	* @param typeId the type id to search with
	* @return the matching adv items
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.vportal.portlet.vadvman.model.AdvItem> findByT(
		long typeId) throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByT(typeId);
	}

	/**
	* Finds a range of all the adv items where typeId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param typeId the type id to search with
	* @param start the lower bound of the range of adv items to return
	* @param end the upper bound of the range of adv items to return (not inclusive)
	* @return the range of matching adv items
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.vportal.portlet.vadvman.model.AdvItem> findByT(
		long typeId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByT(typeId, start, end);
	}

	/**
	* Finds an ordered range of all the adv items where typeId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param typeId the type id to search with
	* @param start the lower bound of the range of adv items to return
	* @param end the upper bound of the range of adv items to return (not inclusive)
	* @param orderByComparator the comparator to order the results by
	* @return the ordered range of matching adv items
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.vportal.portlet.vadvman.model.AdvItem> findByT(
		long typeId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByT(typeId, start, end, orderByComparator);
	}

	/**
	* Finds the first adv item in the ordered set where typeId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param typeId the type id to search with
	* @param orderByComparator the comparator to order the set by
	* @return the first matching adv item
	* @throws com.vportal.portlet.vadvman.NoSuchAdvItemException if a matching adv item could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.vportal.portlet.vadvman.model.AdvItem findByT_First(
		long typeId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vadvman.NoSuchAdvItemException {
		return getPersistence().findByT_First(typeId, orderByComparator);
	}

	/**
	* Finds the last adv item in the ordered set where typeId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param typeId the type id to search with
	* @param orderByComparator the comparator to order the set by
	* @return the last matching adv item
	* @throws com.vportal.portlet.vadvman.NoSuchAdvItemException if a matching adv item could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.vportal.portlet.vadvman.model.AdvItem findByT_Last(
		long typeId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vadvman.NoSuchAdvItemException {
		return getPersistence().findByT_Last(typeId, orderByComparator);
	}

	/**
	* Finds the adv items before and after the current adv item in the ordered set where typeId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param itemId the primary key of the current adv item
	* @param typeId the type id to search with
	* @param orderByComparator the comparator to order the set by
	* @return the previous, current, and next adv item
	* @throws com.vportal.portlet.vadvman.NoSuchAdvItemException if a adv item with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.vportal.portlet.vadvman.model.AdvItem[] findByT_PrevAndNext(
		long itemId, long typeId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vadvman.NoSuchAdvItemException {
		return getPersistence()
				   .findByT_PrevAndNext(itemId, typeId, orderByComparator);
	}

	/**
	* Finds all the adv items where groupId = &#63; and typeId = &#63;.
	*
	* @param groupId the group id to search with
	* @param typeId the type id to search with
	* @return the matching adv items
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.vportal.portlet.vadvman.model.AdvItem> findByG_T(
		long groupId, long typeId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByG_T(groupId, typeId);
	}

	/**
	* Finds a range of all the adv items where groupId = &#63; and typeId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param groupId the group id to search with
	* @param typeId the type id to search with
	* @param start the lower bound of the range of adv items to return
	* @param end the upper bound of the range of adv items to return (not inclusive)
	* @return the range of matching adv items
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.vportal.portlet.vadvman.model.AdvItem> findByG_T(
		long groupId, long typeId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByG_T(groupId, typeId, start, end);
	}

	/**
	* Finds an ordered range of all the adv items where groupId = &#63; and typeId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param groupId the group id to search with
	* @param typeId the type id to search with
	* @param start the lower bound of the range of adv items to return
	* @param end the upper bound of the range of adv items to return (not inclusive)
	* @param orderByComparator the comparator to order the results by
	* @return the ordered range of matching adv items
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.vportal.portlet.vadvman.model.AdvItem> findByG_T(
		long groupId, long typeId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByG_T(groupId, typeId, start, end, orderByComparator);
	}

	/**
	* Finds the first adv item in the ordered set where groupId = &#63; and typeId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param groupId the group id to search with
	* @param typeId the type id to search with
	* @param orderByComparator the comparator to order the set by
	* @return the first matching adv item
	* @throws com.vportal.portlet.vadvman.NoSuchAdvItemException if a matching adv item could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.vportal.portlet.vadvman.model.AdvItem findByG_T_First(
		long groupId, long typeId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vadvman.NoSuchAdvItemException {
		return getPersistence()
				   .findByG_T_First(groupId, typeId, orderByComparator);
	}

	/**
	* Finds the last adv item in the ordered set where groupId = &#63; and typeId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param groupId the group id to search with
	* @param typeId the type id to search with
	* @param orderByComparator the comparator to order the set by
	* @return the last matching adv item
	* @throws com.vportal.portlet.vadvman.NoSuchAdvItemException if a matching adv item could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.vportal.portlet.vadvman.model.AdvItem findByG_T_Last(
		long groupId, long typeId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vadvman.NoSuchAdvItemException {
		return getPersistence()
				   .findByG_T_Last(groupId, typeId, orderByComparator);
	}

	/**
	* Finds the adv items before and after the current adv item in the ordered set where groupId = &#63; and typeId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param itemId the primary key of the current adv item
	* @param groupId the group id to search with
	* @param typeId the type id to search with
	* @param orderByComparator the comparator to order the set by
	* @return the previous, current, and next adv item
	* @throws com.vportal.portlet.vadvman.NoSuchAdvItemException if a adv item with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.vportal.portlet.vadvman.model.AdvItem[] findByG_T_PrevAndNext(
		long itemId, long groupId, long typeId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vadvman.NoSuchAdvItemException {
		return getPersistence()
				   .findByG_T_PrevAndNext(itemId, groupId, typeId,
			orderByComparator);
	}

	/**
	* Finds all the adv items where groupId = &#63; and status = &#63;.
	*
	* @param groupId the group id to search with
	* @param status the status to search with
	* @return the matching adv items
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.vportal.portlet.vadvman.model.AdvItem> findByG_S(
		long groupId, boolean status)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByG_S(groupId, status);
	}

	/**
	* Finds a range of all the adv items where groupId = &#63; and status = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param groupId the group id to search with
	* @param status the status to search with
	* @param start the lower bound of the range of adv items to return
	* @param end the upper bound of the range of adv items to return (not inclusive)
	* @return the range of matching adv items
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.vportal.portlet.vadvman.model.AdvItem> findByG_S(
		long groupId, boolean status, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByG_S(groupId, status, start, end);
	}

	/**
	* Finds an ordered range of all the adv items where groupId = &#63; and status = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param groupId the group id to search with
	* @param status the status to search with
	* @param start the lower bound of the range of adv items to return
	* @param end the upper bound of the range of adv items to return (not inclusive)
	* @param orderByComparator the comparator to order the results by
	* @return the ordered range of matching adv items
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.vportal.portlet.vadvman.model.AdvItem> findByG_S(
		long groupId, boolean status, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByG_S(groupId, status, start, end, orderByComparator);
	}

	/**
	* Finds the first adv item in the ordered set where groupId = &#63; and status = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param groupId the group id to search with
	* @param status the status to search with
	* @param orderByComparator the comparator to order the set by
	* @return the first matching adv item
	* @throws com.vportal.portlet.vadvman.NoSuchAdvItemException if a matching adv item could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.vportal.portlet.vadvman.model.AdvItem findByG_S_First(
		long groupId, boolean status,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vadvman.NoSuchAdvItemException {
		return getPersistence()
				   .findByG_S_First(groupId, status, orderByComparator);
	}

	/**
	* Finds the last adv item in the ordered set where groupId = &#63; and status = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param groupId the group id to search with
	* @param status the status to search with
	* @param orderByComparator the comparator to order the set by
	* @return the last matching adv item
	* @throws com.vportal.portlet.vadvman.NoSuchAdvItemException if a matching adv item could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.vportal.portlet.vadvman.model.AdvItem findByG_S_Last(
		long groupId, boolean status,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vadvman.NoSuchAdvItemException {
		return getPersistence()
				   .findByG_S_Last(groupId, status, orderByComparator);
	}

	/**
	* Finds the adv items before and after the current adv item in the ordered set where groupId = &#63; and status = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param itemId the primary key of the current adv item
	* @param groupId the group id to search with
	* @param status the status to search with
	* @param orderByComparator the comparator to order the set by
	* @return the previous, current, and next adv item
	* @throws com.vportal.portlet.vadvman.NoSuchAdvItemException if a adv item with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.vportal.portlet.vadvman.model.AdvItem[] findByG_S_PrevAndNext(
		long itemId, long groupId, boolean status,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vadvman.NoSuchAdvItemException {
		return getPersistence()
				   .findByG_S_PrevAndNext(itemId, groupId, status,
			orderByComparator);
	}

	/**
	* Finds all the adv items.
	*
	* @return the adv items
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.vportal.portlet.vadvman.model.AdvItem> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
	}

	/**
	* Finds a range of all the adv items.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of adv items to return
	* @param end the upper bound of the range of adv items to return (not inclusive)
	* @return the range of adv items
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.vportal.portlet.vadvman.model.AdvItem> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

	/**
	* Finds an ordered range of all the adv items.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of adv items to return
	* @param end the upper bound of the range of adv items to return (not inclusive)
	* @param orderByComparator the comparator to order the results by
	* @return the ordered range of adv items
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.vportal.portlet.vadvman.model.AdvItem> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the adv items where groupId = &#63; from the database.
	*
	* @param groupId the group id to search with
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByG(long groupId)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByG(groupId);
	}

	/**
	* Removes all the adv items where typeId = &#63; from the database.
	*
	* @param typeId the type id to search with
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByT(long typeId)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByT(typeId);
	}

	/**
	* Removes all the adv items where groupId = &#63; and typeId = &#63; from the database.
	*
	* @param groupId the group id to search with
	* @param typeId the type id to search with
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByG_T(long groupId, long typeId)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByG_T(groupId, typeId);
	}

	/**
	* Removes all the adv items where groupId = &#63; and status = &#63; from the database.
	*
	* @param groupId the group id to search with
	* @param status the status to search with
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByG_S(long groupId, boolean status)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByG_S(groupId, status);
	}

	/**
	* Removes all the adv items from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Counts all the adv items where groupId = &#63;.
	*
	* @param groupId the group id to search with
	* @return the number of matching adv items
	* @throws SystemException if a system exception occurred
	*/
	public static int countByG(long groupId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByG(groupId);
	}

	/**
	* Counts all the adv items where typeId = &#63;.
	*
	* @param typeId the type id to search with
	* @return the number of matching adv items
	* @throws SystemException if a system exception occurred
	*/
	public static int countByT(long typeId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByT(typeId);
	}

	/**
	* Counts all the adv items where groupId = &#63; and typeId = &#63;.
	*
	* @param groupId the group id to search with
	* @param typeId the type id to search with
	* @return the number of matching adv items
	* @throws SystemException if a system exception occurred
	*/
	public static int countByG_T(long groupId, long typeId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByG_T(groupId, typeId);
	}

	/**
	* Counts all the adv items where groupId = &#63; and status = &#63;.
	*
	* @param groupId the group id to search with
	* @param status the status to search with
	* @return the number of matching adv items
	* @throws SystemException if a system exception occurred
	*/
	public static int countByG_S(long groupId, boolean status)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByG_S(groupId, status);
	}

	/**
	* Counts all the adv items.
	*
	* @return the number of adv items
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static AdvItemPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (AdvItemPersistence)PortletBeanLocatorUtil.locate(com.vportal.portlet.vadvman.service.ClpSerializer.SERVLET_CONTEXT_NAME,
					AdvItemPersistence.class.getName());
		}

		return _persistence;
	}

	public void setPersistence(AdvItemPersistence persistence) {
		_persistence = persistence;
	}

	private static AdvItemPersistence _persistence;
}