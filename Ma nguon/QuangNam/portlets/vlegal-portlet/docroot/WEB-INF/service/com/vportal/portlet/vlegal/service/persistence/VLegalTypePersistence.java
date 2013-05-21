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

package com.vportal.portlet.vlegal.service.persistence;

import com.liferay.portal.service.persistence.BasePersistence;

import com.vportal.portlet.vlegal.model.VLegalType;

/**
 * The persistence interface for the v legal type service.
 *
 * <p>
 * Never modify or reference this interface directly. Always use {@link VLegalTypeUtil} to access the v legal type persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
 * </p>
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author ACB
 * @see VLegalTypePersistenceImpl
 * @see VLegalTypeUtil
 * @generated
 */
public interface VLegalTypePersistence extends BasePersistence<VLegalType> {
	/**
	* Caches the v legal type in the entity cache if it is enabled.
	*
	* @param vLegalType the v legal type to cache
	*/
	public void cacheResult(
		com.vportal.portlet.vlegal.model.VLegalType vLegalType);

	/**
	* Caches the v legal types in the entity cache if it is enabled.
	*
	* @param vLegalTypes the v legal types to cache
	*/
	public void cacheResult(
		java.util.List<com.vportal.portlet.vlegal.model.VLegalType> vLegalTypes);

	/**
	* Creates a new v legal type with the primary key. Does not add the v legal type to the database.
	*
	* @param typeId the primary key for the new v legal type
	* @return the new v legal type
	*/
	public com.vportal.portlet.vlegal.model.VLegalType create(
		java.lang.String typeId);

	/**
	* Removes the v legal type with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param typeId the primary key of the v legal type to remove
	* @return the v legal type that was removed
	* @throws com.vportal.portlet.vlegal.NoSuchVLegalTypeException if a v legal type with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.vportal.portlet.vlegal.model.VLegalType remove(
		java.lang.String typeId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vlegal.NoSuchVLegalTypeException;

	public com.vportal.portlet.vlegal.model.VLegalType updateImpl(
		com.vportal.portlet.vlegal.model.VLegalType vLegalType, boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Finds the v legal type with the primary key or throws a {@link com.vportal.portlet.vlegal.NoSuchVLegalTypeException} if it could not be found.
	*
	* @param typeId the primary key of the v legal type to find
	* @return the v legal type
	* @throws com.vportal.portlet.vlegal.NoSuchVLegalTypeException if a v legal type with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.vportal.portlet.vlegal.model.VLegalType findByPrimaryKey(
		java.lang.String typeId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vlegal.NoSuchVLegalTypeException;

	/**
	* Finds the v legal type with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param typeId the primary key of the v legal type to find
	* @return the v legal type, or <code>null</code> if a v legal type with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.vportal.portlet.vlegal.model.VLegalType fetchByPrimaryKey(
		java.lang.String typeId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Finds all the v legal types where groupId = &#63;.
	*
	* @param groupId the group id to search with
	* @return the matching v legal types
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.vportal.portlet.vlegal.model.VLegalType> findByGroupId(
		long groupId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Finds a range of all the v legal types where groupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param groupId the group id to search with
	* @param start the lower bound of the range of v legal types to return
	* @param end the upper bound of the range of v legal types to return (not inclusive)
	* @return the range of matching v legal types
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.vportal.portlet.vlegal.model.VLegalType> findByGroupId(
		long groupId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Finds an ordered range of all the v legal types where groupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param groupId the group id to search with
	* @param start the lower bound of the range of v legal types to return
	* @param end the upper bound of the range of v legal types to return (not inclusive)
	* @param orderByComparator the comparator to order the results by
	* @return the ordered range of matching v legal types
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.vportal.portlet.vlegal.model.VLegalType> findByGroupId(
		long groupId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Finds the first v legal type in the ordered set where groupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param groupId the group id to search with
	* @param orderByComparator the comparator to order the set by
	* @return the first matching v legal type
	* @throws com.vportal.portlet.vlegal.NoSuchVLegalTypeException if a matching v legal type could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.vportal.portlet.vlegal.model.VLegalType findByGroupId_First(
		long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vlegal.NoSuchVLegalTypeException;

	/**
	* Finds the last v legal type in the ordered set where groupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param groupId the group id to search with
	* @param orderByComparator the comparator to order the set by
	* @return the last matching v legal type
	* @throws com.vportal.portlet.vlegal.NoSuchVLegalTypeException if a matching v legal type could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.vportal.portlet.vlegal.model.VLegalType findByGroupId_Last(
		long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vlegal.NoSuchVLegalTypeException;

	/**
	* Finds the v legal types before and after the current v legal type in the ordered set where groupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param typeId the primary key of the current v legal type
	* @param groupId the group id to search with
	* @param orderByComparator the comparator to order the set by
	* @return the previous, current, and next v legal type
	* @throws com.vportal.portlet.vlegal.NoSuchVLegalTypeException if a v legal type with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.vportal.portlet.vlegal.model.VLegalType[] findByGroupId_PrevAndNext(
		java.lang.String typeId, long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vlegal.NoSuchVLegalTypeException;

	/**
	* Finds the v legal type where groupId = &#63; and typeId = &#63; or throws a {@link com.vportal.portlet.vlegal.NoSuchVLegalTypeException} if it could not be found.
	*
	* @param groupId the group id to search with
	* @param typeId the type id to search with
	* @return the matching v legal type
	* @throws com.vportal.portlet.vlegal.NoSuchVLegalTypeException if a matching v legal type could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.vportal.portlet.vlegal.model.VLegalType findByG_T(long groupId,
		java.lang.String typeId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vlegal.NoSuchVLegalTypeException;

	/**
	* Finds the v legal type where groupId = &#63; and typeId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param groupId the group id to search with
	* @param typeId the type id to search with
	* @return the matching v legal type, or <code>null</code> if a matching v legal type could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.vportal.portlet.vlegal.model.VLegalType fetchByG_T(
		long groupId, java.lang.String typeId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Finds the v legal type where groupId = &#63; and typeId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param groupId the group id to search with
	* @param typeId the type id to search with
	* @return the matching v legal type, or <code>null</code> if a matching v legal type could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.vportal.portlet.vlegal.model.VLegalType fetchByG_T(
		long groupId, java.lang.String typeId, boolean retrieveFromCache)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Finds all the v legal types where groupId = &#63; and statusType = &#63; and language = &#63;.
	*
	* @param groupId the group id to search with
	* @param statusType the status type to search with
	* @param language the language to search with
	* @return the matching v legal types
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.vportal.portlet.vlegal.model.VLegalType> findByS_L(
		long groupId, boolean statusType, java.lang.String language)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Finds a range of all the v legal types where groupId = &#63; and statusType = &#63; and language = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param groupId the group id to search with
	* @param statusType the status type to search with
	* @param language the language to search with
	* @param start the lower bound of the range of v legal types to return
	* @param end the upper bound of the range of v legal types to return (not inclusive)
	* @return the range of matching v legal types
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.vportal.portlet.vlegal.model.VLegalType> findByS_L(
		long groupId, boolean statusType, java.lang.String language, int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Finds an ordered range of all the v legal types where groupId = &#63; and statusType = &#63; and language = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param groupId the group id to search with
	* @param statusType the status type to search with
	* @param language the language to search with
	* @param start the lower bound of the range of v legal types to return
	* @param end the upper bound of the range of v legal types to return (not inclusive)
	* @param orderByComparator the comparator to order the results by
	* @return the ordered range of matching v legal types
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.vportal.portlet.vlegal.model.VLegalType> findByS_L(
		long groupId, boolean statusType, java.lang.String language, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Finds the first v legal type in the ordered set where groupId = &#63; and statusType = &#63; and language = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param groupId the group id to search with
	* @param statusType the status type to search with
	* @param language the language to search with
	* @param orderByComparator the comparator to order the set by
	* @return the first matching v legal type
	* @throws com.vportal.portlet.vlegal.NoSuchVLegalTypeException if a matching v legal type could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.vportal.portlet.vlegal.model.VLegalType findByS_L_First(
		long groupId, boolean statusType, java.lang.String language,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vlegal.NoSuchVLegalTypeException;

	/**
	* Finds the last v legal type in the ordered set where groupId = &#63; and statusType = &#63; and language = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param groupId the group id to search with
	* @param statusType the status type to search with
	* @param language the language to search with
	* @param orderByComparator the comparator to order the set by
	* @return the last matching v legal type
	* @throws com.vportal.portlet.vlegal.NoSuchVLegalTypeException if a matching v legal type could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.vportal.portlet.vlegal.model.VLegalType findByS_L_Last(
		long groupId, boolean statusType, java.lang.String language,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vlegal.NoSuchVLegalTypeException;

	/**
	* Finds the v legal types before and after the current v legal type in the ordered set where groupId = &#63; and statusType = &#63; and language = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param typeId the primary key of the current v legal type
	* @param groupId the group id to search with
	* @param statusType the status type to search with
	* @param language the language to search with
	* @param orderByComparator the comparator to order the set by
	* @return the previous, current, and next v legal type
	* @throws com.vportal.portlet.vlegal.NoSuchVLegalTypeException if a v legal type with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.vportal.portlet.vlegal.model.VLegalType[] findByS_L_PrevAndNext(
		java.lang.String typeId, long groupId, boolean statusType,
		java.lang.String language,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vlegal.NoSuchVLegalTypeException;

	/**
	* Finds all the v legal types where groupId = &#63; and statusType = &#63; and rssable = &#63;.
	*
	* @param groupId the group id to search with
	* @param statusType the status type to search with
	* @param rssable the rssable to search with
	* @return the matching v legal types
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.vportal.portlet.vlegal.model.VLegalType> findByS_Rss(
		long groupId, boolean statusType, boolean rssable)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Finds a range of all the v legal types where groupId = &#63; and statusType = &#63; and rssable = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param groupId the group id to search with
	* @param statusType the status type to search with
	* @param rssable the rssable to search with
	* @param start the lower bound of the range of v legal types to return
	* @param end the upper bound of the range of v legal types to return (not inclusive)
	* @return the range of matching v legal types
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.vportal.portlet.vlegal.model.VLegalType> findByS_Rss(
		long groupId, boolean statusType, boolean rssable, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Finds an ordered range of all the v legal types where groupId = &#63; and statusType = &#63; and rssable = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param groupId the group id to search with
	* @param statusType the status type to search with
	* @param rssable the rssable to search with
	* @param start the lower bound of the range of v legal types to return
	* @param end the upper bound of the range of v legal types to return (not inclusive)
	* @param orderByComparator the comparator to order the results by
	* @return the ordered range of matching v legal types
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.vportal.portlet.vlegal.model.VLegalType> findByS_Rss(
		long groupId, boolean statusType, boolean rssable, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Finds the first v legal type in the ordered set where groupId = &#63; and statusType = &#63; and rssable = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param groupId the group id to search with
	* @param statusType the status type to search with
	* @param rssable the rssable to search with
	* @param orderByComparator the comparator to order the set by
	* @return the first matching v legal type
	* @throws com.vportal.portlet.vlegal.NoSuchVLegalTypeException if a matching v legal type could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.vportal.portlet.vlegal.model.VLegalType findByS_Rss_First(
		long groupId, boolean statusType, boolean rssable,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vlegal.NoSuchVLegalTypeException;

	/**
	* Finds the last v legal type in the ordered set where groupId = &#63; and statusType = &#63; and rssable = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param groupId the group id to search with
	* @param statusType the status type to search with
	* @param rssable the rssable to search with
	* @param orderByComparator the comparator to order the set by
	* @return the last matching v legal type
	* @throws com.vportal.portlet.vlegal.NoSuchVLegalTypeException if a matching v legal type could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.vportal.portlet.vlegal.model.VLegalType findByS_Rss_Last(
		long groupId, boolean statusType, boolean rssable,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vlegal.NoSuchVLegalTypeException;

	/**
	* Finds the v legal types before and after the current v legal type in the ordered set where groupId = &#63; and statusType = &#63; and rssable = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param typeId the primary key of the current v legal type
	* @param groupId the group id to search with
	* @param statusType the status type to search with
	* @param rssable the rssable to search with
	* @param orderByComparator the comparator to order the set by
	* @return the previous, current, and next v legal type
	* @throws com.vportal.portlet.vlegal.NoSuchVLegalTypeException if a v legal type with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.vportal.portlet.vlegal.model.VLegalType[] findByS_Rss_PrevAndNext(
		java.lang.String typeId, long groupId, boolean statusType,
		boolean rssable,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vlegal.NoSuchVLegalTypeException;

	/**
	* Finds all the v legal types.
	*
	* @return the v legal types
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.vportal.portlet.vlegal.model.VLegalType> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Finds a range of all the v legal types.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of v legal types to return
	* @param end the upper bound of the range of v legal types to return (not inclusive)
	* @return the range of v legal types
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.vportal.portlet.vlegal.model.VLegalType> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Finds an ordered range of all the v legal types.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of v legal types to return
	* @param end the upper bound of the range of v legal types to return (not inclusive)
	* @param orderByComparator the comparator to order the results by
	* @return the ordered range of v legal types
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.vportal.portlet.vlegal.model.VLegalType> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the v legal types where groupId = &#63; from the database.
	*
	* @param groupId the group id to search with
	* @throws SystemException if a system exception occurred
	*/
	public void removeByGroupId(long groupId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes the v legal type where groupId = &#63; and typeId = &#63; from the database.
	*
	* @param groupId the group id to search with
	* @param typeId the type id to search with
	* @throws SystemException if a system exception occurred
	*/
	public void removeByG_T(long groupId, java.lang.String typeId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vlegal.NoSuchVLegalTypeException;

	/**
	* Removes all the v legal types where groupId = &#63; and statusType = &#63; and language = &#63; from the database.
	*
	* @param groupId the group id to search with
	* @param statusType the status type to search with
	* @param language the language to search with
	* @throws SystemException if a system exception occurred
	*/
	public void removeByS_L(long groupId, boolean statusType,
		java.lang.String language)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the v legal types where groupId = &#63; and statusType = &#63; and rssable = &#63; from the database.
	*
	* @param groupId the group id to search with
	* @param statusType the status type to search with
	* @param rssable the rssable to search with
	* @throws SystemException if a system exception occurred
	*/
	public void removeByS_Rss(long groupId, boolean statusType, boolean rssable)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the v legal types from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Counts all the v legal types where groupId = &#63;.
	*
	* @param groupId the group id to search with
	* @return the number of matching v legal types
	* @throws SystemException if a system exception occurred
	*/
	public int countByGroupId(long groupId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Counts all the v legal types where groupId = &#63; and typeId = &#63;.
	*
	* @param groupId the group id to search with
	* @param typeId the type id to search with
	* @return the number of matching v legal types
	* @throws SystemException if a system exception occurred
	*/
	public int countByG_T(long groupId, java.lang.String typeId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Counts all the v legal types where groupId = &#63; and statusType = &#63; and language = &#63;.
	*
	* @param groupId the group id to search with
	* @param statusType the status type to search with
	* @param language the language to search with
	* @return the number of matching v legal types
	* @throws SystemException if a system exception occurred
	*/
	public int countByS_L(long groupId, boolean statusType,
		java.lang.String language)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Counts all the v legal types where groupId = &#63; and statusType = &#63; and rssable = &#63;.
	*
	* @param groupId the group id to search with
	* @param statusType the status type to search with
	* @param rssable the rssable to search with
	* @return the number of matching v legal types
	* @throws SystemException if a system exception occurred
	*/
	public int countByS_Rss(long groupId, boolean statusType, boolean rssable)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Counts all the v legal types.
	*
	* @return the number of v legal types
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}