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

import com.vportal.portlet.vlegal.model.VLegalTags;

import java.util.List;

/**
 * The persistence utility for the v legal tags service. This utility wraps {@link VLegalTagsPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
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
 * @see VLegalTagsPersistence
 * @see VLegalTagsPersistenceImpl
 * @generated
 */
public class VLegalTagsUtil {
	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#clearCache()
	 */
	public static void clearCache() {
		getPersistence().clearCache();
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#clearCache(com.liferay.portal.model.BaseModel)
	 */
	public static void clearCache(VLegalTags vLegalTags) {
		getPersistence().clearCache(vLegalTags);
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
	public static List<VLegalTags> findWithDynamicQuery(
		DynamicQuery dynamicQuery) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<VLegalTags> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<VLegalTags> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#remove(com.liferay.portal.model.BaseModel)
	 */
	public static VLegalTags remove(VLegalTags vLegalTags)
		throws SystemException {
		return getPersistence().remove(vLegalTags);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, boolean)
	 */
	public static VLegalTags update(VLegalTags vLegalTags, boolean merge)
		throws SystemException {
		return getPersistence().update(vLegalTags, merge);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, boolean, ServiceContext)
	 */
	public static VLegalTags update(VLegalTags vLegalTags, boolean merge,
		ServiceContext serviceContext) throws SystemException {
		return getPersistence().update(vLegalTags, merge, serviceContext);
	}

	/**
	* Caches the v legal tags in the entity cache if it is enabled.
	*
	* @param vLegalTags the v legal tags to cache
	*/
	public static void cacheResult(
		com.vportal.portlet.vlegal.model.VLegalTags vLegalTags) {
		getPersistence().cacheResult(vLegalTags);
	}

	/**
	* Caches the v legal tagses in the entity cache if it is enabled.
	*
	* @param vLegalTagses the v legal tagses to cache
	*/
	public static void cacheResult(
		java.util.List<com.vportal.portlet.vlegal.model.VLegalTags> vLegalTagses) {
		getPersistence().cacheResult(vLegalTagses);
	}

	/**
	* Creates a new v legal tags with the primary key. Does not add the v legal tags to the database.
	*
	* @param tagId the primary key for the new v legal tags
	* @return the new v legal tags
	*/
	public static com.vportal.portlet.vlegal.model.VLegalTags create(
		java.lang.String tagId) {
		return getPersistence().create(tagId);
	}

	/**
	* Removes the v legal tags with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param tagId the primary key of the v legal tags to remove
	* @return the v legal tags that was removed
	* @throws com.vportal.portlet.vlegal.NoSuchVLegalTagsException if a v legal tags with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.vportal.portlet.vlegal.model.VLegalTags remove(
		java.lang.String tagId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vlegal.NoSuchVLegalTagsException {
		return getPersistence().remove(tagId);
	}

	public static com.vportal.portlet.vlegal.model.VLegalTags updateImpl(
		com.vportal.portlet.vlegal.model.VLegalTags vLegalTags, boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(vLegalTags, merge);
	}

	/**
	* Finds the v legal tags with the primary key or throws a {@link com.vportal.portlet.vlegal.NoSuchVLegalTagsException} if it could not be found.
	*
	* @param tagId the primary key of the v legal tags to find
	* @return the v legal tags
	* @throws com.vportal.portlet.vlegal.NoSuchVLegalTagsException if a v legal tags with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.vportal.portlet.vlegal.model.VLegalTags findByPrimaryKey(
		java.lang.String tagId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vlegal.NoSuchVLegalTagsException {
		return getPersistence().findByPrimaryKey(tagId);
	}

	/**
	* Finds the v legal tags with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param tagId the primary key of the v legal tags to find
	* @return the v legal tags, or <code>null</code> if a v legal tags with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.vportal.portlet.vlegal.model.VLegalTags fetchByPrimaryKey(
		java.lang.String tagId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(tagId);
	}

	/**
	* Finds all the v legal tagses where groupId = &#63;.
	*
	* @param groupId the group id to search with
	* @return the matching v legal tagses
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.vportal.portlet.vlegal.model.VLegalTags> findByGroupId(
		long groupId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByGroupId(groupId);
	}

	/**
	* Finds a range of all the v legal tagses where groupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param groupId the group id to search with
	* @param start the lower bound of the range of v legal tagses to return
	* @param end the upper bound of the range of v legal tagses to return (not inclusive)
	* @return the range of matching v legal tagses
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.vportal.portlet.vlegal.model.VLegalTags> findByGroupId(
		long groupId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByGroupId(groupId, start, end);
	}

	/**
	* Finds an ordered range of all the v legal tagses where groupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param groupId the group id to search with
	* @param start the lower bound of the range of v legal tagses to return
	* @param end the upper bound of the range of v legal tagses to return (not inclusive)
	* @param orderByComparator the comparator to order the results by
	* @return the ordered range of matching v legal tagses
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.vportal.portlet.vlegal.model.VLegalTags> findByGroupId(
		long groupId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByGroupId(groupId, start, end, orderByComparator);
	}

	/**
	* Finds the first v legal tags in the ordered set where groupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param groupId the group id to search with
	* @param orderByComparator the comparator to order the set by
	* @return the first matching v legal tags
	* @throws com.vportal.portlet.vlegal.NoSuchVLegalTagsException if a matching v legal tags could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.vportal.portlet.vlegal.model.VLegalTags findByGroupId_First(
		long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vlegal.NoSuchVLegalTagsException {
		return getPersistence().findByGroupId_First(groupId, orderByComparator);
	}

	/**
	* Finds the last v legal tags in the ordered set where groupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param groupId the group id to search with
	* @param orderByComparator the comparator to order the set by
	* @return the last matching v legal tags
	* @throws com.vportal.portlet.vlegal.NoSuchVLegalTagsException if a matching v legal tags could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.vportal.portlet.vlegal.model.VLegalTags findByGroupId_Last(
		long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vlegal.NoSuchVLegalTagsException {
		return getPersistence().findByGroupId_Last(groupId, orderByComparator);
	}

	/**
	* Finds the v legal tagses before and after the current v legal tags in the ordered set where groupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param tagId the primary key of the current v legal tags
	* @param groupId the group id to search with
	* @param orderByComparator the comparator to order the set by
	* @return the previous, current, and next v legal tags
	* @throws com.vportal.portlet.vlegal.NoSuchVLegalTagsException if a v legal tags with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.vportal.portlet.vlegal.model.VLegalTags[] findByGroupId_PrevAndNext(
		java.lang.String tagId, long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vlegal.NoSuchVLegalTagsException {
		return getPersistence()
				   .findByGroupId_PrevAndNext(tagId, groupId, orderByComparator);
	}

	/**
	* Finds all the v legal tagses where groupId = &#63; and statusTags = &#63;.
	*
	* @param groupId the group id to search with
	* @param statusTags the status tags to search with
	* @return the matching v legal tagses
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.vportal.portlet.vlegal.model.VLegalTags> findByP_S(
		long groupId, boolean statusTags)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByP_S(groupId, statusTags);
	}

	/**
	* Finds a range of all the v legal tagses where groupId = &#63; and statusTags = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param groupId the group id to search with
	* @param statusTags the status tags to search with
	* @param start the lower bound of the range of v legal tagses to return
	* @param end the upper bound of the range of v legal tagses to return (not inclusive)
	* @return the range of matching v legal tagses
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.vportal.portlet.vlegal.model.VLegalTags> findByP_S(
		long groupId, boolean statusTags, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByP_S(groupId, statusTags, start, end);
	}

	/**
	* Finds an ordered range of all the v legal tagses where groupId = &#63; and statusTags = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param groupId the group id to search with
	* @param statusTags the status tags to search with
	* @param start the lower bound of the range of v legal tagses to return
	* @param end the upper bound of the range of v legal tagses to return (not inclusive)
	* @param orderByComparator the comparator to order the results by
	* @return the ordered range of matching v legal tagses
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.vportal.portlet.vlegal.model.VLegalTags> findByP_S(
		long groupId, boolean statusTags, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByP_S(groupId, statusTags, start, end, orderByComparator);
	}

	/**
	* Finds the first v legal tags in the ordered set where groupId = &#63; and statusTags = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param groupId the group id to search with
	* @param statusTags the status tags to search with
	* @param orderByComparator the comparator to order the set by
	* @return the first matching v legal tags
	* @throws com.vportal.portlet.vlegal.NoSuchVLegalTagsException if a matching v legal tags could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.vportal.portlet.vlegal.model.VLegalTags findByP_S_First(
		long groupId, boolean statusTags,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vlegal.NoSuchVLegalTagsException {
		return getPersistence()
				   .findByP_S_First(groupId, statusTags, orderByComparator);
	}

	/**
	* Finds the last v legal tags in the ordered set where groupId = &#63; and statusTags = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param groupId the group id to search with
	* @param statusTags the status tags to search with
	* @param orderByComparator the comparator to order the set by
	* @return the last matching v legal tags
	* @throws com.vportal.portlet.vlegal.NoSuchVLegalTagsException if a matching v legal tags could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.vportal.portlet.vlegal.model.VLegalTags findByP_S_Last(
		long groupId, boolean statusTags,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vlegal.NoSuchVLegalTagsException {
		return getPersistence()
				   .findByP_S_Last(groupId, statusTags, orderByComparator);
	}

	/**
	* Finds the v legal tagses before and after the current v legal tags in the ordered set where groupId = &#63; and statusTags = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param tagId the primary key of the current v legal tags
	* @param groupId the group id to search with
	* @param statusTags the status tags to search with
	* @param orderByComparator the comparator to order the set by
	* @return the previous, current, and next v legal tags
	* @throws com.vportal.portlet.vlegal.NoSuchVLegalTagsException if a v legal tags with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.vportal.portlet.vlegal.model.VLegalTags[] findByP_S_PrevAndNext(
		java.lang.String tagId, long groupId, boolean statusTags,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vlegal.NoSuchVLegalTagsException {
		return getPersistence()
				   .findByP_S_PrevAndNext(tagId, groupId, statusTags,
			orderByComparator);
	}

	/**
	* Finds all the v legal tagses.
	*
	* @return the v legal tagses
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.vportal.portlet.vlegal.model.VLegalTags> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
	}

	/**
	* Finds a range of all the v legal tagses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of v legal tagses to return
	* @param end the upper bound of the range of v legal tagses to return (not inclusive)
	* @return the range of v legal tagses
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.vportal.portlet.vlegal.model.VLegalTags> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

	/**
	* Finds an ordered range of all the v legal tagses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of v legal tagses to return
	* @param end the upper bound of the range of v legal tagses to return (not inclusive)
	* @param orderByComparator the comparator to order the results by
	* @return the ordered range of v legal tagses
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.vportal.portlet.vlegal.model.VLegalTags> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the v legal tagses where groupId = &#63; from the database.
	*
	* @param groupId the group id to search with
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByGroupId(long groupId)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByGroupId(groupId);
	}

	/**
	* Removes all the v legal tagses where groupId = &#63; and statusTags = &#63; from the database.
	*
	* @param groupId the group id to search with
	* @param statusTags the status tags to search with
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByP_S(long groupId, boolean statusTags)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByP_S(groupId, statusTags);
	}

	/**
	* Removes all the v legal tagses from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Counts all the v legal tagses where groupId = &#63;.
	*
	* @param groupId the group id to search with
	* @return the number of matching v legal tagses
	* @throws SystemException if a system exception occurred
	*/
	public static int countByGroupId(long groupId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByGroupId(groupId);
	}

	/**
	* Counts all the v legal tagses where groupId = &#63; and statusTags = &#63;.
	*
	* @param groupId the group id to search with
	* @param statusTags the status tags to search with
	* @return the number of matching v legal tagses
	* @throws SystemException if a system exception occurred
	*/
	public static int countByP_S(long groupId, boolean statusTags)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByP_S(groupId, statusTags);
	}

	/**
	* Counts all the v legal tagses.
	*
	* @return the number of v legal tagses
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static VLegalTagsPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (VLegalTagsPersistence)PortletBeanLocatorUtil.locate(com.vportal.portlet.vlegal.service.ClpSerializer.SERVLET_CONTEXT_NAME,
					VLegalTagsPersistence.class.getName());
		}

		return _persistence;
	}

	public void setPersistence(VLegalTagsPersistence persistence) {
		_persistence = persistence;
	}

	private static VLegalTagsPersistence _persistence;
}