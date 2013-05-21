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

package com.vportal.portlet.vlinksman.service.persistence;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.service.ServiceContext;

import com.vportal.portlet.vlinksman.model.Links;

import java.util.List;

/**
 * The persistence utility for the links service. This utility wraps {@link LinksPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Never modify this class directly. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
 * </p>
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author hai
 * @see LinksPersistence
 * @see LinksPersistenceImpl
 * @generated
 */
public class LinksUtil {
	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#clearCache()
	 */
	public static void clearCache() {
		getPersistence().clearCache();
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#clearCache(com.liferay.portal.model.BaseModel)
	 */
	public static void clearCache(Links links) {
		getPersistence().clearCache(links);
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
	public static List<Links> findWithDynamicQuery(DynamicQuery dynamicQuery)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<Links> findWithDynamicQuery(DynamicQuery dynamicQuery,
		int start, int end) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<Links> findWithDynamicQuery(DynamicQuery dynamicQuery,
		int start, int end, OrderByComparator orderByComparator)
		throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#remove(com.liferay.portal.model.BaseModel)
	 */
	public static Links remove(Links links) throws SystemException {
		return getPersistence().remove(links);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, boolean)
	 */
	public static Links update(Links links, boolean merge)
		throws SystemException {
		return getPersistence().update(links, merge);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, boolean, ServiceContext)
	 */
	public static Links update(Links links, boolean merge,
		ServiceContext serviceContext) throws SystemException {
		return getPersistence().update(links, merge, serviceContext);
	}

	/**
	* Caches the links in the entity cache if it is enabled.
	*
	* @param links the links to cache
	*/
	public static void cacheResult(
		com.vportal.portlet.vlinksman.model.Links links) {
		getPersistence().cacheResult(links);
	}

	/**
	* Caches the linkses in the entity cache if it is enabled.
	*
	* @param linkses the linkses to cache
	*/
	public static void cacheResult(
		java.util.List<com.vportal.portlet.vlinksman.model.Links> linkses) {
		getPersistence().cacheResult(linkses);
	}

	/**
	* Creates a new links with the primary key. Does not add the links to the database.
	*
	* @param linkId the primary key for the new links
	* @return the new links
	*/
	public static com.vportal.portlet.vlinksman.model.Links create(long linkId) {
		return getPersistence().create(linkId);
	}

	/**
	* Removes the links with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param linkId the primary key of the links to remove
	* @return the links that was removed
	* @throws com.vportal.portlet.vlinksman.NoSuchLinksException if a links with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.vportal.portlet.vlinksman.model.Links remove(long linkId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vlinksman.NoSuchLinksException {
		return getPersistence().remove(linkId);
	}

	public static com.vportal.portlet.vlinksman.model.Links updateImpl(
		com.vportal.portlet.vlinksman.model.Links links, boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(links, merge);
	}

	/**
	* Finds the links with the primary key or throws a {@link com.vportal.portlet.vlinksman.NoSuchLinksException} if it could not be found.
	*
	* @param linkId the primary key of the links to find
	* @return the links
	* @throws com.vportal.portlet.vlinksman.NoSuchLinksException if a links with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.vportal.portlet.vlinksman.model.Links findByPrimaryKey(
		long linkId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vlinksman.NoSuchLinksException {
		return getPersistence().findByPrimaryKey(linkId);
	}

	/**
	* Finds the links with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param linkId the primary key of the links to find
	* @return the links, or <code>null</code> if a links with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.vportal.portlet.vlinksman.model.Links fetchByPrimaryKey(
		long linkId) throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(linkId);
	}

	/**
	* Finds all the linkses where linkgroupId = &#63;.
	*
	* @param linkgroupId the linkgroup id to search with
	* @return the matching linkses
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.vportal.portlet.vlinksman.model.Links> findBylinkgroupId(
		long linkgroupId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findBylinkgroupId(linkgroupId);
	}

	/**
	* Finds a range of all the linkses where linkgroupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param linkgroupId the linkgroup id to search with
	* @param start the lower bound of the range of linkses to return
	* @param end the upper bound of the range of linkses to return (not inclusive)
	* @return the range of matching linkses
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.vportal.portlet.vlinksman.model.Links> findBylinkgroupId(
		long linkgroupId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findBylinkgroupId(linkgroupId, start, end);
	}

	/**
	* Finds an ordered range of all the linkses where linkgroupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param linkgroupId the linkgroup id to search with
	* @param start the lower bound of the range of linkses to return
	* @param end the upper bound of the range of linkses to return (not inclusive)
	* @param orderByComparator the comparator to order the results by
	* @return the ordered range of matching linkses
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.vportal.portlet.vlinksman.model.Links> findBylinkgroupId(
		long linkgroupId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findBylinkgroupId(linkgroupId, start, end, orderByComparator);
	}

	/**
	* Finds the first links in the ordered set where linkgroupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param linkgroupId the linkgroup id to search with
	* @param orderByComparator the comparator to order the set by
	* @return the first matching links
	* @throws com.vportal.portlet.vlinksman.NoSuchLinksException if a matching links could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.vportal.portlet.vlinksman.model.Links findBylinkgroupId_First(
		long linkgroupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vlinksman.NoSuchLinksException {
		return getPersistence()
				   .findBylinkgroupId_First(linkgroupId, orderByComparator);
	}

	/**
	* Finds the last links in the ordered set where linkgroupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param linkgroupId the linkgroup id to search with
	* @param orderByComparator the comparator to order the set by
	* @return the last matching links
	* @throws com.vportal.portlet.vlinksman.NoSuchLinksException if a matching links could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.vportal.portlet.vlinksman.model.Links findBylinkgroupId_Last(
		long linkgroupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vlinksman.NoSuchLinksException {
		return getPersistence()
				   .findBylinkgroupId_Last(linkgroupId, orderByComparator);
	}

	/**
	* Finds the linkses before and after the current links in the ordered set where linkgroupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param linkId the primary key of the current links
	* @param linkgroupId the linkgroup id to search with
	* @param orderByComparator the comparator to order the set by
	* @return the previous, current, and next links
	* @throws com.vportal.portlet.vlinksman.NoSuchLinksException if a links with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.vportal.portlet.vlinksman.model.Links[] findBylinkgroupId_PrevAndNext(
		long linkId, long linkgroupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vlinksman.NoSuchLinksException {
		return getPersistence()
				   .findBylinkgroupId_PrevAndNext(linkId, linkgroupId,
			orderByComparator);
	}

	/**
	* Finds all the linkses where groupId = &#63; and linkgroupId = &#63;.
	*
	* @param groupId the group id to search with
	* @param linkgroupId the linkgroup id to search with
	* @return the matching linkses
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.vportal.portlet.vlinksman.model.Links> findByG_LG(
		long groupId, long linkgroupId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByG_LG(groupId, linkgroupId);
	}

	/**
	* Finds a range of all the linkses where groupId = &#63; and linkgroupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param groupId the group id to search with
	* @param linkgroupId the linkgroup id to search with
	* @param start the lower bound of the range of linkses to return
	* @param end the upper bound of the range of linkses to return (not inclusive)
	* @return the range of matching linkses
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.vportal.portlet.vlinksman.model.Links> findByG_LG(
		long groupId, long linkgroupId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByG_LG(groupId, linkgroupId, start, end);
	}

	/**
	* Finds an ordered range of all the linkses where groupId = &#63; and linkgroupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param groupId the group id to search with
	* @param linkgroupId the linkgroup id to search with
	* @param start the lower bound of the range of linkses to return
	* @param end the upper bound of the range of linkses to return (not inclusive)
	* @param orderByComparator the comparator to order the results by
	* @return the ordered range of matching linkses
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.vportal.portlet.vlinksman.model.Links> findByG_LG(
		long groupId, long linkgroupId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByG_LG(groupId, linkgroupId, start, end,
			orderByComparator);
	}

	/**
	* Finds the first links in the ordered set where groupId = &#63; and linkgroupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param groupId the group id to search with
	* @param linkgroupId the linkgroup id to search with
	* @param orderByComparator the comparator to order the set by
	* @return the first matching links
	* @throws com.vportal.portlet.vlinksman.NoSuchLinksException if a matching links could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.vportal.portlet.vlinksman.model.Links findByG_LG_First(
		long groupId, long linkgroupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vlinksman.NoSuchLinksException {
		return getPersistence()
				   .findByG_LG_First(groupId, linkgroupId, orderByComparator);
	}

	/**
	* Finds the last links in the ordered set where groupId = &#63; and linkgroupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param groupId the group id to search with
	* @param linkgroupId the linkgroup id to search with
	* @param orderByComparator the comparator to order the set by
	* @return the last matching links
	* @throws com.vportal.portlet.vlinksman.NoSuchLinksException if a matching links could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.vportal.portlet.vlinksman.model.Links findByG_LG_Last(
		long groupId, long linkgroupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vlinksman.NoSuchLinksException {
		return getPersistence()
				   .findByG_LG_Last(groupId, linkgroupId, orderByComparator);
	}

	/**
	* Finds the linkses before and after the current links in the ordered set where groupId = &#63; and linkgroupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param linkId the primary key of the current links
	* @param groupId the group id to search with
	* @param linkgroupId the linkgroup id to search with
	* @param orderByComparator the comparator to order the set by
	* @return the previous, current, and next links
	* @throws com.vportal.portlet.vlinksman.NoSuchLinksException if a links with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.vportal.portlet.vlinksman.model.Links[] findByG_LG_PrevAndNext(
		long linkId, long groupId, long linkgroupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vlinksman.NoSuchLinksException {
		return getPersistence()
				   .findByG_LG_PrevAndNext(linkId, groupId, linkgroupId,
			orderByComparator);
	}

	/**
	* Finds all the linkses where groupId = &#63;.
	*
	* @param groupId the group id to search with
	* @return the matching linkses
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.vportal.portlet.vlinksman.model.Links> findByGroupId(
		long groupId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByGroupId(groupId);
	}

	/**
	* Finds a range of all the linkses where groupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param groupId the group id to search with
	* @param start the lower bound of the range of linkses to return
	* @param end the upper bound of the range of linkses to return (not inclusive)
	* @return the range of matching linkses
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.vportal.portlet.vlinksman.model.Links> findByGroupId(
		long groupId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByGroupId(groupId, start, end);
	}

	/**
	* Finds an ordered range of all the linkses where groupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param groupId the group id to search with
	* @param start the lower bound of the range of linkses to return
	* @param end the upper bound of the range of linkses to return (not inclusive)
	* @param orderByComparator the comparator to order the results by
	* @return the ordered range of matching linkses
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.vportal.portlet.vlinksman.model.Links> findByGroupId(
		long groupId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByGroupId(groupId, start, end, orderByComparator);
	}

	/**
	* Finds the first links in the ordered set where groupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param groupId the group id to search with
	* @param orderByComparator the comparator to order the set by
	* @return the first matching links
	* @throws com.vportal.portlet.vlinksman.NoSuchLinksException if a matching links could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.vportal.portlet.vlinksman.model.Links findByGroupId_First(
		long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vlinksman.NoSuchLinksException {
		return getPersistence().findByGroupId_First(groupId, orderByComparator);
	}

	/**
	* Finds the last links in the ordered set where groupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param groupId the group id to search with
	* @param orderByComparator the comparator to order the set by
	* @return the last matching links
	* @throws com.vportal.portlet.vlinksman.NoSuchLinksException if a matching links could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.vportal.portlet.vlinksman.model.Links findByGroupId_Last(
		long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vlinksman.NoSuchLinksException {
		return getPersistence().findByGroupId_Last(groupId, orderByComparator);
	}

	/**
	* Finds the linkses before and after the current links in the ordered set where groupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param linkId the primary key of the current links
	* @param groupId the group id to search with
	* @param orderByComparator the comparator to order the set by
	* @return the previous, current, and next links
	* @throws com.vportal.portlet.vlinksman.NoSuchLinksException if a links with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.vportal.portlet.vlinksman.model.Links[] findByGroupId_PrevAndNext(
		long linkId, long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vlinksman.NoSuchLinksException {
		return getPersistence()
				   .findByGroupId_PrevAndNext(linkId, groupId, orderByComparator);
	}

	/**
	* Finds all the linkses.
	*
	* @return the linkses
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.vportal.portlet.vlinksman.model.Links> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
	}

	/**
	* Finds a range of all the linkses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of linkses to return
	* @param end the upper bound of the range of linkses to return (not inclusive)
	* @return the range of linkses
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.vportal.portlet.vlinksman.model.Links> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

	/**
	* Finds an ordered range of all the linkses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of linkses to return
	* @param end the upper bound of the range of linkses to return (not inclusive)
	* @param orderByComparator the comparator to order the results by
	* @return the ordered range of linkses
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.vportal.portlet.vlinksman.model.Links> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the linkses where linkgroupId = &#63; from the database.
	*
	* @param linkgroupId the linkgroup id to search with
	* @throws SystemException if a system exception occurred
	*/
	public static void removeBylinkgroupId(long linkgroupId)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeBylinkgroupId(linkgroupId);
	}

	/**
	* Removes all the linkses where groupId = &#63; and linkgroupId = &#63; from the database.
	*
	* @param groupId the group id to search with
	* @param linkgroupId the linkgroup id to search with
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByG_LG(long groupId, long linkgroupId)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByG_LG(groupId, linkgroupId);
	}

	/**
	* Removes all the linkses where groupId = &#63; from the database.
	*
	* @param groupId the group id to search with
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByGroupId(long groupId)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByGroupId(groupId);
	}

	/**
	* Removes all the linkses from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Counts all the linkses where linkgroupId = &#63;.
	*
	* @param linkgroupId the linkgroup id to search with
	* @return the number of matching linkses
	* @throws SystemException if a system exception occurred
	*/
	public static int countBylinkgroupId(long linkgroupId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countBylinkgroupId(linkgroupId);
	}

	/**
	* Counts all the linkses where groupId = &#63; and linkgroupId = &#63;.
	*
	* @param groupId the group id to search with
	* @param linkgroupId the linkgroup id to search with
	* @return the number of matching linkses
	* @throws SystemException if a system exception occurred
	*/
	public static int countByG_LG(long groupId, long linkgroupId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByG_LG(groupId, linkgroupId);
	}

	/**
	* Counts all the linkses where groupId = &#63;.
	*
	* @param groupId the group id to search with
	* @return the number of matching linkses
	* @throws SystemException if a system exception occurred
	*/
	public static int countByGroupId(long groupId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByGroupId(groupId);
	}

	/**
	* Counts all the linkses.
	*
	* @return the number of linkses
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static LinksPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (LinksPersistence)PortletBeanLocatorUtil.locate(com.vportal.portlet.vlinksman.service.ClpSerializer.SERVLET_CONTEXT_NAME,
					LinksPersistence.class.getName());
		}

		return _persistence;
	}

	public void setPersistence(LinksPersistence persistence) {
		_persistence = persistence;
	}

	private static LinksPersistence _persistence;
}