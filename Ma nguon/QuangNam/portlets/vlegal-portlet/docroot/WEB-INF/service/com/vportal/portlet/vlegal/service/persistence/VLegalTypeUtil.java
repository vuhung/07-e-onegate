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

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.service.ServiceContext;

import com.vportal.portlet.vlegal.model.VLegalType;

import java.util.List;

/**
 * The persistence utility for the v legal type service. This utility wraps {@link VLegalTypePersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Never modify this class directly. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
 * </p>
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author ACB
 * @see VLegalTypePersistence
 * @see VLegalTypePersistenceImpl
 * @generated
 */
public class VLegalTypeUtil {
	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#clearCache()
	 */
	public static void clearCache() {
		getPersistence().clearCache();
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#clearCache(com.liferay.portal.model.BaseModel)
	 */
	public static void clearCache(VLegalType vLegalType) {
		getPersistence().clearCache(vLegalType);
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
	public static List<VLegalType> findWithDynamicQuery(
		DynamicQuery dynamicQuery) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<VLegalType> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<VLegalType> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#remove(com.liferay.portal.model.BaseModel)
	 */
	public static VLegalType remove(VLegalType vLegalType)
		throws SystemException {
		return getPersistence().remove(vLegalType);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, boolean)
	 */
	public static VLegalType update(VLegalType vLegalType, boolean merge)
		throws SystemException {
		return getPersistence().update(vLegalType, merge);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, boolean, ServiceContext)
	 */
	public static VLegalType update(VLegalType vLegalType, boolean merge,
		ServiceContext serviceContext) throws SystemException {
		return getPersistence().update(vLegalType, merge, serviceContext);
	}

	/**
	* Caches the v legal type in the entity cache if it is enabled.
	*
	* @param vLegalType the v legal type to cache
	*/
	public static void cacheResult(
		com.vportal.portlet.vlegal.model.VLegalType vLegalType) {
		getPersistence().cacheResult(vLegalType);
	}

	/**
	* Caches the v legal types in the entity cache if it is enabled.
	*
	* @param vLegalTypes the v legal types to cache
	*/
	public static void cacheResult(
		java.util.List<com.vportal.portlet.vlegal.model.VLegalType> vLegalTypes) {
		getPersistence().cacheResult(vLegalTypes);
	}

	/**
	* Creates a new v legal type with the primary key. Does not add the v legal type to the database.
	*
	* @param typeId the primary key for the new v legal type
	* @return the new v legal type
	*/
	public static com.vportal.portlet.vlegal.model.VLegalType create(
		java.lang.String typeId) {
		return getPersistence().create(typeId);
	}

	/**
	* Removes the v legal type with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param typeId the primary key of the v legal type to remove
	* @return the v legal type that was removed
	* @throws com.vportal.portlet.vlegal.NoSuchVLegalTypeException if a v legal type with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.vportal.portlet.vlegal.model.VLegalType remove(
		java.lang.String typeId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vlegal.NoSuchVLegalTypeException {
		return getPersistence().remove(typeId);
	}

	public static com.vportal.portlet.vlegal.model.VLegalType updateImpl(
		com.vportal.portlet.vlegal.model.VLegalType vLegalType, boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(vLegalType, merge);
	}

	/**
	* Finds the v legal type with the primary key or throws a {@link com.vportal.portlet.vlegal.NoSuchVLegalTypeException} if it could not be found.
	*
	* @param typeId the primary key of the v legal type to find
	* @return the v legal type
	* @throws com.vportal.portlet.vlegal.NoSuchVLegalTypeException if a v legal type with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.vportal.portlet.vlegal.model.VLegalType findByPrimaryKey(
		java.lang.String typeId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vlegal.NoSuchVLegalTypeException {
		return getPersistence().findByPrimaryKey(typeId);
	}

	/**
	* Finds the v legal type with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param typeId the primary key of the v legal type to find
	* @return the v legal type, or <code>null</code> if a v legal type with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.vportal.portlet.vlegal.model.VLegalType fetchByPrimaryKey(
		java.lang.String typeId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(typeId);
	}

	/**
	* Finds all the v legal types where groupId = &#63;.
	*
	* @param groupId the group id to search with
	* @return the matching v legal types
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.vportal.portlet.vlegal.model.VLegalType> findByGroupId(
		long groupId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByGroupId(groupId);
	}

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
	public static java.util.List<com.vportal.portlet.vlegal.model.VLegalType> findByGroupId(
		long groupId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByGroupId(groupId, start, end);
	}

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
	public static java.util.List<com.vportal.portlet.vlegal.model.VLegalType> findByGroupId(
		long groupId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByGroupId(groupId, start, end, orderByComparator);
	}

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
	public static com.vportal.portlet.vlegal.model.VLegalType findByGroupId_First(
		long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vlegal.NoSuchVLegalTypeException {
		return getPersistence().findByGroupId_First(groupId, orderByComparator);
	}

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
	public static com.vportal.portlet.vlegal.model.VLegalType findByGroupId_Last(
		long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vlegal.NoSuchVLegalTypeException {
		return getPersistence().findByGroupId_Last(groupId, orderByComparator);
	}

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
	public static com.vportal.portlet.vlegal.model.VLegalType[] findByGroupId_PrevAndNext(
		java.lang.String typeId, long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vlegal.NoSuchVLegalTypeException {
		return getPersistence()
				   .findByGroupId_PrevAndNext(typeId, groupId, orderByComparator);
	}

	/**
	* Finds the v legal type where groupId = &#63; and typeId = &#63; or throws a {@link com.vportal.portlet.vlegal.NoSuchVLegalTypeException} if it could not be found.
	*
	* @param groupId the group id to search with
	* @param typeId the type id to search with
	* @return the matching v legal type
	* @throws com.vportal.portlet.vlegal.NoSuchVLegalTypeException if a matching v legal type could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.vportal.portlet.vlegal.model.VLegalType findByG_T(
		long groupId, java.lang.String typeId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vlegal.NoSuchVLegalTypeException {
		return getPersistence().findByG_T(groupId, typeId);
	}

	/**
	* Finds the v legal type where groupId = &#63; and typeId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param groupId the group id to search with
	* @param typeId the type id to search with
	* @return the matching v legal type, or <code>null</code> if a matching v legal type could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.vportal.portlet.vlegal.model.VLegalType fetchByG_T(
		long groupId, java.lang.String typeId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByG_T(groupId, typeId);
	}

	/**
	* Finds the v legal type where groupId = &#63; and typeId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param groupId the group id to search with
	* @param typeId the type id to search with
	* @return the matching v legal type, or <code>null</code> if a matching v legal type could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.vportal.portlet.vlegal.model.VLegalType fetchByG_T(
		long groupId, java.lang.String typeId, boolean retrieveFromCache)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByG_T(groupId, typeId, retrieveFromCache);
	}

	/**
	* Finds all the v legal types where groupId = &#63; and statusType = &#63; and language = &#63;.
	*
	* @param groupId the group id to search with
	* @param statusType the status type to search with
	* @param language the language to search with
	* @return the matching v legal types
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.vportal.portlet.vlegal.model.VLegalType> findByS_L(
		long groupId, boolean statusType, java.lang.String language)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByS_L(groupId, statusType, language);
	}

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
	public static java.util.List<com.vportal.portlet.vlegal.model.VLegalType> findByS_L(
		long groupId, boolean statusType, java.lang.String language, int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByS_L(groupId, statusType, language, start, end);
	}

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
	public static java.util.List<com.vportal.portlet.vlegal.model.VLegalType> findByS_L(
		long groupId, boolean statusType, java.lang.String language, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByS_L(groupId, statusType, language, start, end,
			orderByComparator);
	}

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
	public static com.vportal.portlet.vlegal.model.VLegalType findByS_L_First(
		long groupId, boolean statusType, java.lang.String language,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vlegal.NoSuchVLegalTypeException {
		return getPersistence()
				   .findByS_L_First(groupId, statusType, language,
			orderByComparator);
	}

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
	public static com.vportal.portlet.vlegal.model.VLegalType findByS_L_Last(
		long groupId, boolean statusType, java.lang.String language,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vlegal.NoSuchVLegalTypeException {
		return getPersistence()
				   .findByS_L_Last(groupId, statusType, language,
			orderByComparator);
	}

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
	public static com.vportal.portlet.vlegal.model.VLegalType[] findByS_L_PrevAndNext(
		java.lang.String typeId, long groupId, boolean statusType,
		java.lang.String language,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vlegal.NoSuchVLegalTypeException {
		return getPersistence()
				   .findByS_L_PrevAndNext(typeId, groupId, statusType,
			language, orderByComparator);
	}

	/**
	* Finds all the v legal types where groupId = &#63; and statusType = &#63; and rssable = &#63;.
	*
	* @param groupId the group id to search with
	* @param statusType the status type to search with
	* @param rssable the rssable to search with
	* @return the matching v legal types
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.vportal.portlet.vlegal.model.VLegalType> findByS_Rss(
		long groupId, boolean statusType, boolean rssable)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByS_Rss(groupId, statusType, rssable);
	}

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
	public static java.util.List<com.vportal.portlet.vlegal.model.VLegalType> findByS_Rss(
		long groupId, boolean statusType, boolean rssable, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByS_Rss(groupId, statusType, rssable, start, end);
	}

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
	public static java.util.List<com.vportal.portlet.vlegal.model.VLegalType> findByS_Rss(
		long groupId, boolean statusType, boolean rssable, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByS_Rss(groupId, statusType, rssable, start, end,
			orderByComparator);
	}

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
	public static com.vportal.portlet.vlegal.model.VLegalType findByS_Rss_First(
		long groupId, boolean statusType, boolean rssable,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vlegal.NoSuchVLegalTypeException {
		return getPersistence()
				   .findByS_Rss_First(groupId, statusType, rssable,
			orderByComparator);
	}

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
	public static com.vportal.portlet.vlegal.model.VLegalType findByS_Rss_Last(
		long groupId, boolean statusType, boolean rssable,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vlegal.NoSuchVLegalTypeException {
		return getPersistence()
				   .findByS_Rss_Last(groupId, statusType, rssable,
			orderByComparator);
	}

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
	public static com.vportal.portlet.vlegal.model.VLegalType[] findByS_Rss_PrevAndNext(
		java.lang.String typeId, long groupId, boolean statusType,
		boolean rssable,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vlegal.NoSuchVLegalTypeException {
		return getPersistence()
				   .findByS_Rss_PrevAndNext(typeId, groupId, statusType,
			rssable, orderByComparator);
	}

	/**
	* Finds all the v legal types.
	*
	* @return the v legal types
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.vportal.portlet.vlegal.model.VLegalType> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
	}

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
	public static java.util.List<com.vportal.portlet.vlegal.model.VLegalType> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

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
	public static java.util.List<com.vportal.portlet.vlegal.model.VLegalType> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the v legal types where groupId = &#63; from the database.
	*
	* @param groupId the group id to search with
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByGroupId(long groupId)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByGroupId(groupId);
	}

	/**
	* Removes the v legal type where groupId = &#63; and typeId = &#63; from the database.
	*
	* @param groupId the group id to search with
	* @param typeId the type id to search with
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByG_T(long groupId, java.lang.String typeId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vlegal.NoSuchVLegalTypeException {
		getPersistence().removeByG_T(groupId, typeId);
	}

	/**
	* Removes all the v legal types where groupId = &#63; and statusType = &#63; and language = &#63; from the database.
	*
	* @param groupId the group id to search with
	* @param statusType the status type to search with
	* @param language the language to search with
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByS_L(long groupId, boolean statusType,
		java.lang.String language)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByS_L(groupId, statusType, language);
	}

	/**
	* Removes all the v legal types where groupId = &#63; and statusType = &#63; and rssable = &#63; from the database.
	*
	* @param groupId the group id to search with
	* @param statusType the status type to search with
	* @param rssable the rssable to search with
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByS_Rss(long groupId, boolean statusType,
		boolean rssable)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByS_Rss(groupId, statusType, rssable);
	}

	/**
	* Removes all the v legal types from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Counts all the v legal types where groupId = &#63;.
	*
	* @param groupId the group id to search with
	* @return the number of matching v legal types
	* @throws SystemException if a system exception occurred
	*/
	public static int countByGroupId(long groupId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByGroupId(groupId);
	}

	/**
	* Counts all the v legal types where groupId = &#63; and typeId = &#63;.
	*
	* @param groupId the group id to search with
	* @param typeId the type id to search with
	* @return the number of matching v legal types
	* @throws SystemException if a system exception occurred
	*/
	public static int countByG_T(long groupId, java.lang.String typeId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByG_T(groupId, typeId);
	}

	/**
	* Counts all the v legal types where groupId = &#63; and statusType = &#63; and language = &#63;.
	*
	* @param groupId the group id to search with
	* @param statusType the status type to search with
	* @param language the language to search with
	* @return the number of matching v legal types
	* @throws SystemException if a system exception occurred
	*/
	public static int countByS_L(long groupId, boolean statusType,
		java.lang.String language)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByS_L(groupId, statusType, language);
	}

	/**
	* Counts all the v legal types where groupId = &#63; and statusType = &#63; and rssable = &#63;.
	*
	* @param groupId the group id to search with
	* @param statusType the status type to search with
	* @param rssable the rssable to search with
	* @return the number of matching v legal types
	* @throws SystemException if a system exception occurred
	*/
	public static int countByS_Rss(long groupId, boolean statusType,
		boolean rssable)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByS_Rss(groupId, statusType, rssable);
	}

	/**
	* Counts all the v legal types.
	*
	* @return the number of v legal types
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static VLegalTypePersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (VLegalTypePersistence)PortletBeanLocatorUtil.locate(com.vportal.portlet.vlegal.service.ClpSerializer.SERVLET_CONTEXT_NAME,
					VLegalTypePersistence.class.getName());
		}

		return _persistence;
	}

	public void setPersistence(VLegalTypePersistence persistence) {
		_persistence = persistence;
	}

	private static VLegalTypePersistence _persistence;
}