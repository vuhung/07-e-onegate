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

import com.liferay.portal.service.persistence.BasePersistence;

import com.vportal.portlet.vadvman.model.AdvItem;

/**
 * The persistence interface for the adv item service.
 *
 * <p>
 * Never modify or reference this interface directly. Always use {@link AdvItemUtil} to access the adv item persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
 * </p>
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author HOAN
 * @see AdvItemPersistenceImpl
 * @see AdvItemUtil
 * @generated
 */
public interface AdvItemPersistence extends BasePersistence<AdvItem> {
	/**
	* Caches the adv item in the entity cache if it is enabled.
	*
	* @param advItem the adv item to cache
	*/
	public void cacheResult(com.vportal.portlet.vadvman.model.AdvItem advItem);

	/**
	* Caches the adv items in the entity cache if it is enabled.
	*
	* @param advItems the adv items to cache
	*/
	public void cacheResult(
		java.util.List<com.vportal.portlet.vadvman.model.AdvItem> advItems);

	/**
	* Creates a new adv item with the primary key. Does not add the adv item to the database.
	*
	* @param itemId the primary key for the new adv item
	* @return the new adv item
	*/
	public com.vportal.portlet.vadvman.model.AdvItem create(long itemId);

	/**
	* Removes the adv item with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param itemId the primary key of the adv item to remove
	* @return the adv item that was removed
	* @throws com.vportal.portlet.vadvman.NoSuchAdvItemException if a adv item with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.vportal.portlet.vadvman.model.AdvItem remove(long itemId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vadvman.NoSuchAdvItemException;

	public com.vportal.portlet.vadvman.model.AdvItem updateImpl(
		com.vportal.portlet.vadvman.model.AdvItem advItem, boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Finds the adv item with the primary key or throws a {@link com.vportal.portlet.vadvman.NoSuchAdvItemException} if it could not be found.
	*
	* @param itemId the primary key of the adv item to find
	* @return the adv item
	* @throws com.vportal.portlet.vadvman.NoSuchAdvItemException if a adv item with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.vportal.portlet.vadvman.model.AdvItem findByPrimaryKey(
		long itemId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vadvman.NoSuchAdvItemException;

	/**
	* Finds the adv item with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param itemId the primary key of the adv item to find
	* @return the adv item, or <code>null</code> if a adv item with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.vportal.portlet.vadvman.model.AdvItem fetchByPrimaryKey(
		long itemId) throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Finds all the adv items where groupId = &#63;.
	*
	* @param groupId the group id to search with
	* @return the matching adv items
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.vportal.portlet.vadvman.model.AdvItem> findByG(
		long groupId)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.vportal.portlet.vadvman.model.AdvItem> findByG(
		long groupId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.vportal.portlet.vadvman.model.AdvItem> findByG(
		long groupId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public com.vportal.portlet.vadvman.model.AdvItem findByG_First(
		long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vadvman.NoSuchAdvItemException;

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
	public com.vportal.portlet.vadvman.model.AdvItem findByG_Last(
		long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vadvman.NoSuchAdvItemException;

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
	public com.vportal.portlet.vadvman.model.AdvItem[] findByG_PrevAndNext(
		long itemId, long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vadvman.NoSuchAdvItemException;

	/**
	* Finds all the adv items where typeId = &#63;.
	*
	* @param typeId the type id to search with
	* @return the matching adv items
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.vportal.portlet.vadvman.model.AdvItem> findByT(
		long typeId) throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.vportal.portlet.vadvman.model.AdvItem> findByT(
		long typeId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.vportal.portlet.vadvman.model.AdvItem> findByT(
		long typeId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public com.vportal.portlet.vadvman.model.AdvItem findByT_First(
		long typeId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vadvman.NoSuchAdvItemException;

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
	public com.vportal.portlet.vadvman.model.AdvItem findByT_Last(long typeId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vadvman.NoSuchAdvItemException;

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
	public com.vportal.portlet.vadvman.model.AdvItem[] findByT_PrevAndNext(
		long itemId, long typeId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vadvman.NoSuchAdvItemException;

	/**
	* Finds all the adv items where groupId = &#63; and typeId = &#63;.
	*
	* @param groupId the group id to search with
	* @param typeId the type id to search with
	* @return the matching adv items
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.vportal.portlet.vadvman.model.AdvItem> findByG_T(
		long groupId, long typeId)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.vportal.portlet.vadvman.model.AdvItem> findByG_T(
		long groupId, long typeId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.vportal.portlet.vadvman.model.AdvItem> findByG_T(
		long groupId, long typeId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public com.vportal.portlet.vadvman.model.AdvItem findByG_T_First(
		long groupId, long typeId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vadvman.NoSuchAdvItemException;

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
	public com.vportal.portlet.vadvman.model.AdvItem findByG_T_Last(
		long groupId, long typeId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vadvman.NoSuchAdvItemException;

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
	public com.vportal.portlet.vadvman.model.AdvItem[] findByG_T_PrevAndNext(
		long itemId, long groupId, long typeId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vadvman.NoSuchAdvItemException;

	/**
	* Finds all the adv items where groupId = &#63; and status = &#63;.
	*
	* @param groupId the group id to search with
	* @param status the status to search with
	* @return the matching adv items
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.vportal.portlet.vadvman.model.AdvItem> findByG_S(
		long groupId, boolean status)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.vportal.portlet.vadvman.model.AdvItem> findByG_S(
		long groupId, boolean status, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.vportal.portlet.vadvman.model.AdvItem> findByG_S(
		long groupId, boolean status, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public com.vportal.portlet.vadvman.model.AdvItem findByG_S_First(
		long groupId, boolean status,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vadvman.NoSuchAdvItemException;

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
	public com.vportal.portlet.vadvman.model.AdvItem findByG_S_Last(
		long groupId, boolean status,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vadvman.NoSuchAdvItemException;

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
	public com.vportal.portlet.vadvman.model.AdvItem[] findByG_S_PrevAndNext(
		long itemId, long groupId, boolean status,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vadvman.NoSuchAdvItemException;

	/**
	* Finds all the adv items.
	*
	* @return the adv items
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.vportal.portlet.vadvman.model.AdvItem> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.vportal.portlet.vadvman.model.AdvItem> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.vportal.portlet.vadvman.model.AdvItem> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the adv items where groupId = &#63; from the database.
	*
	* @param groupId the group id to search with
	* @throws SystemException if a system exception occurred
	*/
	public void removeByG(long groupId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the adv items where typeId = &#63; from the database.
	*
	* @param typeId the type id to search with
	* @throws SystemException if a system exception occurred
	*/
	public void removeByT(long typeId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the adv items where groupId = &#63; and typeId = &#63; from the database.
	*
	* @param groupId the group id to search with
	* @param typeId the type id to search with
	* @throws SystemException if a system exception occurred
	*/
	public void removeByG_T(long groupId, long typeId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the adv items where groupId = &#63; and status = &#63; from the database.
	*
	* @param groupId the group id to search with
	* @param status the status to search with
	* @throws SystemException if a system exception occurred
	*/
	public void removeByG_S(long groupId, boolean status)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the adv items from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Counts all the adv items where groupId = &#63;.
	*
	* @param groupId the group id to search with
	* @return the number of matching adv items
	* @throws SystemException if a system exception occurred
	*/
	public int countByG(long groupId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Counts all the adv items where typeId = &#63;.
	*
	* @param typeId the type id to search with
	* @return the number of matching adv items
	* @throws SystemException if a system exception occurred
	*/
	public int countByT(long typeId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Counts all the adv items where groupId = &#63; and typeId = &#63;.
	*
	* @param groupId the group id to search with
	* @param typeId the type id to search with
	* @return the number of matching adv items
	* @throws SystemException if a system exception occurred
	*/
	public int countByG_T(long groupId, long typeId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Counts all the adv items where groupId = &#63; and status = &#63;.
	*
	* @param groupId the group id to search with
	* @param status the status to search with
	* @return the number of matching adv items
	* @throws SystemException if a system exception occurred
	*/
	public int countByG_S(long groupId, boolean status)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Counts all the adv items.
	*
	* @return the number of adv items
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}