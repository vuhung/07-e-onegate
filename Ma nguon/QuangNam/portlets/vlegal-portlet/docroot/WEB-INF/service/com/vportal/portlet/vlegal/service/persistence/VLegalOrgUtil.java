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

import com.vportal.portlet.vlegal.model.VLegalOrg;

import java.util.List;

/**
 * The persistence utility for the v legal org service. This utility wraps {@link VLegalOrgPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
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
 * @see VLegalOrgPersistence
 * @see VLegalOrgPersistenceImpl
 * @generated
 */
public class VLegalOrgUtil {
	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#clearCache()
	 */
	public static void clearCache() {
		getPersistence().clearCache();
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#clearCache(com.liferay.portal.model.BaseModel)
	 */
	public static void clearCache(VLegalOrg vLegalOrg) {
		getPersistence().clearCache(vLegalOrg);
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
	public static List<VLegalOrg> findWithDynamicQuery(
		DynamicQuery dynamicQuery) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<VLegalOrg> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<VLegalOrg> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#remove(com.liferay.portal.model.BaseModel)
	 */
	public static VLegalOrg remove(VLegalOrg vLegalOrg)
		throws SystemException {
		return getPersistence().remove(vLegalOrg);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, boolean)
	 */
	public static VLegalOrg update(VLegalOrg vLegalOrg, boolean merge)
		throws SystemException {
		return getPersistence().update(vLegalOrg, merge);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, boolean, ServiceContext)
	 */
	public static VLegalOrg update(VLegalOrg vLegalOrg, boolean merge,
		ServiceContext serviceContext) throws SystemException {
		return getPersistence().update(vLegalOrg, merge, serviceContext);
	}

	/**
	* Caches the v legal org in the entity cache if it is enabled.
	*
	* @param vLegalOrg the v legal org to cache
	*/
	public static void cacheResult(
		com.vportal.portlet.vlegal.model.VLegalOrg vLegalOrg) {
		getPersistence().cacheResult(vLegalOrg);
	}

	/**
	* Caches the v legal orgs in the entity cache if it is enabled.
	*
	* @param vLegalOrgs the v legal orgs to cache
	*/
	public static void cacheResult(
		java.util.List<com.vportal.portlet.vlegal.model.VLegalOrg> vLegalOrgs) {
		getPersistence().cacheResult(vLegalOrgs);
	}

	/**
	* Creates a new v legal org with the primary key. Does not add the v legal org to the database.
	*
	* @param orgId the primary key for the new v legal org
	* @return the new v legal org
	*/
	public static com.vportal.portlet.vlegal.model.VLegalOrg create(
		java.lang.String orgId) {
		return getPersistence().create(orgId);
	}

	/**
	* Removes the v legal org with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param orgId the primary key of the v legal org to remove
	* @return the v legal org that was removed
	* @throws com.vportal.portlet.vlegal.NoSuchVLegalOrgException if a v legal org with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.vportal.portlet.vlegal.model.VLegalOrg remove(
		java.lang.String orgId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vlegal.NoSuchVLegalOrgException {
		return getPersistence().remove(orgId);
	}

	public static com.vportal.portlet.vlegal.model.VLegalOrg updateImpl(
		com.vportal.portlet.vlegal.model.VLegalOrg vLegalOrg, boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(vLegalOrg, merge);
	}

	/**
	* Finds the v legal org with the primary key or throws a {@link com.vportal.portlet.vlegal.NoSuchVLegalOrgException} if it could not be found.
	*
	* @param orgId the primary key of the v legal org to find
	* @return the v legal org
	* @throws com.vportal.portlet.vlegal.NoSuchVLegalOrgException if a v legal org with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.vportal.portlet.vlegal.model.VLegalOrg findByPrimaryKey(
		java.lang.String orgId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vlegal.NoSuchVLegalOrgException {
		return getPersistence().findByPrimaryKey(orgId);
	}

	/**
	* Finds the v legal org with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param orgId the primary key of the v legal org to find
	* @return the v legal org, or <code>null</code> if a v legal org with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.vportal.portlet.vlegal.model.VLegalOrg fetchByPrimaryKey(
		java.lang.String orgId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(orgId);
	}

	/**
	* Finds all the v legal orgs where groupId = &#63;.
	*
	* @param groupId the group id to search with
	* @return the matching v legal orgs
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.vportal.portlet.vlegal.model.VLegalOrg> findByGroupId(
		long groupId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByGroupId(groupId);
	}

	/**
	* Finds a range of all the v legal orgs where groupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param groupId the group id to search with
	* @param start the lower bound of the range of v legal orgs to return
	* @param end the upper bound of the range of v legal orgs to return (not inclusive)
	* @return the range of matching v legal orgs
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.vportal.portlet.vlegal.model.VLegalOrg> findByGroupId(
		long groupId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByGroupId(groupId, start, end);
	}

	/**
	* Finds an ordered range of all the v legal orgs where groupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param groupId the group id to search with
	* @param start the lower bound of the range of v legal orgs to return
	* @param end the upper bound of the range of v legal orgs to return (not inclusive)
	* @param orderByComparator the comparator to order the results by
	* @return the ordered range of matching v legal orgs
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.vportal.portlet.vlegal.model.VLegalOrg> findByGroupId(
		long groupId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByGroupId(groupId, start, end, orderByComparator);
	}

	/**
	* Finds the first v legal org in the ordered set where groupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param groupId the group id to search with
	* @param orderByComparator the comparator to order the set by
	* @return the first matching v legal org
	* @throws com.vportal.portlet.vlegal.NoSuchVLegalOrgException if a matching v legal org could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.vportal.portlet.vlegal.model.VLegalOrg findByGroupId_First(
		long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vlegal.NoSuchVLegalOrgException {
		return getPersistence().findByGroupId_First(groupId, orderByComparator);
	}

	/**
	* Finds the last v legal org in the ordered set where groupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param groupId the group id to search with
	* @param orderByComparator the comparator to order the set by
	* @return the last matching v legal org
	* @throws com.vportal.portlet.vlegal.NoSuchVLegalOrgException if a matching v legal org could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.vportal.portlet.vlegal.model.VLegalOrg findByGroupId_Last(
		long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vlegal.NoSuchVLegalOrgException {
		return getPersistence().findByGroupId_Last(groupId, orderByComparator);
	}

	/**
	* Finds the v legal orgs before and after the current v legal org in the ordered set where groupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param orgId the primary key of the current v legal org
	* @param groupId the group id to search with
	* @param orderByComparator the comparator to order the set by
	* @return the previous, current, and next v legal org
	* @throws com.vportal.portlet.vlegal.NoSuchVLegalOrgException if a v legal org with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.vportal.portlet.vlegal.model.VLegalOrg[] findByGroupId_PrevAndNext(
		java.lang.String orgId, long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vlegal.NoSuchVLegalOrgException {
		return getPersistence()
				   .findByGroupId_PrevAndNext(orgId, groupId, orderByComparator);
	}

	/**
	* Finds all the v legal orgs where groupId = &#63; and language = &#63;.
	*
	* @param groupId the group id to search with
	* @param language the language to search with
	* @return the matching v legal orgs
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.vportal.portlet.vlegal.model.VLegalOrg> findByG_L(
		long groupId, java.lang.String language)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByG_L(groupId, language);
	}

	/**
	* Finds a range of all the v legal orgs where groupId = &#63; and language = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param groupId the group id to search with
	* @param language the language to search with
	* @param start the lower bound of the range of v legal orgs to return
	* @param end the upper bound of the range of v legal orgs to return (not inclusive)
	* @return the range of matching v legal orgs
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.vportal.portlet.vlegal.model.VLegalOrg> findByG_L(
		long groupId, java.lang.String language, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByG_L(groupId, language, start, end);
	}

	/**
	* Finds an ordered range of all the v legal orgs where groupId = &#63; and language = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param groupId the group id to search with
	* @param language the language to search with
	* @param start the lower bound of the range of v legal orgs to return
	* @param end the upper bound of the range of v legal orgs to return (not inclusive)
	* @param orderByComparator the comparator to order the results by
	* @return the ordered range of matching v legal orgs
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.vportal.portlet.vlegal.model.VLegalOrg> findByG_L(
		long groupId, java.lang.String language, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByG_L(groupId, language, start, end, orderByComparator);
	}

	/**
	* Finds the first v legal org in the ordered set where groupId = &#63; and language = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param groupId the group id to search with
	* @param language the language to search with
	* @param orderByComparator the comparator to order the set by
	* @return the first matching v legal org
	* @throws com.vportal.portlet.vlegal.NoSuchVLegalOrgException if a matching v legal org could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.vportal.portlet.vlegal.model.VLegalOrg findByG_L_First(
		long groupId, java.lang.String language,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vlegal.NoSuchVLegalOrgException {
		return getPersistence()
				   .findByG_L_First(groupId, language, orderByComparator);
	}

	/**
	* Finds the last v legal org in the ordered set where groupId = &#63; and language = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param groupId the group id to search with
	* @param language the language to search with
	* @param orderByComparator the comparator to order the set by
	* @return the last matching v legal org
	* @throws com.vportal.portlet.vlegal.NoSuchVLegalOrgException if a matching v legal org could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.vportal.portlet.vlegal.model.VLegalOrg findByG_L_Last(
		long groupId, java.lang.String language,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vlegal.NoSuchVLegalOrgException {
		return getPersistence()
				   .findByG_L_Last(groupId, language, orderByComparator);
	}

	/**
	* Finds the v legal orgs before and after the current v legal org in the ordered set where groupId = &#63; and language = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param orgId the primary key of the current v legal org
	* @param groupId the group id to search with
	* @param language the language to search with
	* @param orderByComparator the comparator to order the set by
	* @return the previous, current, and next v legal org
	* @throws com.vportal.portlet.vlegal.NoSuchVLegalOrgException if a v legal org with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.vportal.portlet.vlegal.model.VLegalOrg[] findByG_L_PrevAndNext(
		java.lang.String orgId, long groupId, java.lang.String language,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vlegal.NoSuchVLegalOrgException {
		return getPersistence()
				   .findByG_L_PrevAndNext(orgId, groupId, language,
			orderByComparator);
	}

	/**
	* Finds the v legal org where groupId = &#63; and orgId = &#63; or throws a {@link com.vportal.portlet.vlegal.NoSuchVLegalOrgException} if it could not be found.
	*
	* @param groupId the group id to search with
	* @param orgId the org id to search with
	* @return the matching v legal org
	* @throws com.vportal.portlet.vlegal.NoSuchVLegalOrgException if a matching v legal org could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.vportal.portlet.vlegal.model.VLegalOrg findByG_O(
		long groupId, java.lang.String orgId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vlegal.NoSuchVLegalOrgException {
		return getPersistence().findByG_O(groupId, orgId);
	}

	/**
	* Finds the v legal org where groupId = &#63; and orgId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param groupId the group id to search with
	* @param orgId the org id to search with
	* @return the matching v legal org, or <code>null</code> if a matching v legal org could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.vportal.portlet.vlegal.model.VLegalOrg fetchByG_O(
		long groupId, java.lang.String orgId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByG_O(groupId, orgId);
	}

	/**
	* Finds the v legal org where groupId = &#63; and orgId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param groupId the group id to search with
	* @param orgId the org id to search with
	* @return the matching v legal org, or <code>null</code> if a matching v legal org could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.vportal.portlet.vlegal.model.VLegalOrg fetchByG_O(
		long groupId, java.lang.String orgId, boolean retrieveFromCache)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByG_O(groupId, orgId, retrieveFromCache);
	}

	/**
	* Finds all the v legal orgs where groupId = &#63; and statusOrg = &#63; and language = &#63;.
	*
	* @param groupId the group id to search with
	* @param statusOrg the status org to search with
	* @param language the language to search with
	* @return the matching v legal orgs
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.vportal.portlet.vlegal.model.VLegalOrg> findByS_L(
		long groupId, boolean statusOrg, java.lang.String language)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByS_L(groupId, statusOrg, language);
	}

	/**
	* Finds a range of all the v legal orgs where groupId = &#63; and statusOrg = &#63; and language = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param groupId the group id to search with
	* @param statusOrg the status org to search with
	* @param language the language to search with
	* @param start the lower bound of the range of v legal orgs to return
	* @param end the upper bound of the range of v legal orgs to return (not inclusive)
	* @return the range of matching v legal orgs
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.vportal.portlet.vlegal.model.VLegalOrg> findByS_L(
		long groupId, boolean statusOrg, java.lang.String language, int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByS_L(groupId, statusOrg, language, start, end);
	}

	/**
	* Finds an ordered range of all the v legal orgs where groupId = &#63; and statusOrg = &#63; and language = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param groupId the group id to search with
	* @param statusOrg the status org to search with
	* @param language the language to search with
	* @param start the lower bound of the range of v legal orgs to return
	* @param end the upper bound of the range of v legal orgs to return (not inclusive)
	* @param orderByComparator the comparator to order the results by
	* @return the ordered range of matching v legal orgs
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.vportal.portlet.vlegal.model.VLegalOrg> findByS_L(
		long groupId, boolean statusOrg, java.lang.String language, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByS_L(groupId, statusOrg, language, start, end,
			orderByComparator);
	}

	/**
	* Finds the first v legal org in the ordered set where groupId = &#63; and statusOrg = &#63; and language = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param groupId the group id to search with
	* @param statusOrg the status org to search with
	* @param language the language to search with
	* @param orderByComparator the comparator to order the set by
	* @return the first matching v legal org
	* @throws com.vportal.portlet.vlegal.NoSuchVLegalOrgException if a matching v legal org could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.vportal.portlet.vlegal.model.VLegalOrg findByS_L_First(
		long groupId, boolean statusOrg, java.lang.String language,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vlegal.NoSuchVLegalOrgException {
		return getPersistence()
				   .findByS_L_First(groupId, statusOrg, language,
			orderByComparator);
	}

	/**
	* Finds the last v legal org in the ordered set where groupId = &#63; and statusOrg = &#63; and language = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param groupId the group id to search with
	* @param statusOrg the status org to search with
	* @param language the language to search with
	* @param orderByComparator the comparator to order the set by
	* @return the last matching v legal org
	* @throws com.vportal.portlet.vlegal.NoSuchVLegalOrgException if a matching v legal org could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.vportal.portlet.vlegal.model.VLegalOrg findByS_L_Last(
		long groupId, boolean statusOrg, java.lang.String language,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vlegal.NoSuchVLegalOrgException {
		return getPersistence()
				   .findByS_L_Last(groupId, statusOrg, language,
			orderByComparator);
	}

	/**
	* Finds the v legal orgs before and after the current v legal org in the ordered set where groupId = &#63; and statusOrg = &#63; and language = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param orgId the primary key of the current v legal org
	* @param groupId the group id to search with
	* @param statusOrg the status org to search with
	* @param language the language to search with
	* @param orderByComparator the comparator to order the set by
	* @return the previous, current, and next v legal org
	* @throws com.vportal.portlet.vlegal.NoSuchVLegalOrgException if a v legal org with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.vportal.portlet.vlegal.model.VLegalOrg[] findByS_L_PrevAndNext(
		java.lang.String orgId, long groupId, boolean statusOrg,
		java.lang.String language,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vlegal.NoSuchVLegalOrgException {
		return getPersistence()
				   .findByS_L_PrevAndNext(orgId, groupId, statusOrg, language,
			orderByComparator);
	}

	/**
	* Finds all the v legal orgs where groupId = &#63; and statusOrg = &#63; and rssable = &#63;.
	*
	* @param groupId the group id to search with
	* @param statusOrg the status org to search with
	* @param rssable the rssable to search with
	* @return the matching v legal orgs
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.vportal.portlet.vlegal.model.VLegalOrg> findByS_Rss(
		long groupId, boolean statusOrg, boolean rssable)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByS_Rss(groupId, statusOrg, rssable);
	}

	/**
	* Finds a range of all the v legal orgs where groupId = &#63; and statusOrg = &#63; and rssable = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param groupId the group id to search with
	* @param statusOrg the status org to search with
	* @param rssable the rssable to search with
	* @param start the lower bound of the range of v legal orgs to return
	* @param end the upper bound of the range of v legal orgs to return (not inclusive)
	* @return the range of matching v legal orgs
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.vportal.portlet.vlegal.model.VLegalOrg> findByS_Rss(
		long groupId, boolean statusOrg, boolean rssable, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByS_Rss(groupId, statusOrg, rssable, start, end);
	}

	/**
	* Finds an ordered range of all the v legal orgs where groupId = &#63; and statusOrg = &#63; and rssable = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param groupId the group id to search with
	* @param statusOrg the status org to search with
	* @param rssable the rssable to search with
	* @param start the lower bound of the range of v legal orgs to return
	* @param end the upper bound of the range of v legal orgs to return (not inclusive)
	* @param orderByComparator the comparator to order the results by
	* @return the ordered range of matching v legal orgs
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.vportal.portlet.vlegal.model.VLegalOrg> findByS_Rss(
		long groupId, boolean statusOrg, boolean rssable, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByS_Rss(groupId, statusOrg, rssable, start, end,
			orderByComparator);
	}

	/**
	* Finds the first v legal org in the ordered set where groupId = &#63; and statusOrg = &#63; and rssable = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param groupId the group id to search with
	* @param statusOrg the status org to search with
	* @param rssable the rssable to search with
	* @param orderByComparator the comparator to order the set by
	* @return the first matching v legal org
	* @throws com.vportal.portlet.vlegal.NoSuchVLegalOrgException if a matching v legal org could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.vportal.portlet.vlegal.model.VLegalOrg findByS_Rss_First(
		long groupId, boolean statusOrg, boolean rssable,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vlegal.NoSuchVLegalOrgException {
		return getPersistence()
				   .findByS_Rss_First(groupId, statusOrg, rssable,
			orderByComparator);
	}

	/**
	* Finds the last v legal org in the ordered set where groupId = &#63; and statusOrg = &#63; and rssable = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param groupId the group id to search with
	* @param statusOrg the status org to search with
	* @param rssable the rssable to search with
	* @param orderByComparator the comparator to order the set by
	* @return the last matching v legal org
	* @throws com.vportal.portlet.vlegal.NoSuchVLegalOrgException if a matching v legal org could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.vportal.portlet.vlegal.model.VLegalOrg findByS_Rss_Last(
		long groupId, boolean statusOrg, boolean rssable,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vlegal.NoSuchVLegalOrgException {
		return getPersistence()
				   .findByS_Rss_Last(groupId, statusOrg, rssable,
			orderByComparator);
	}

	/**
	* Finds the v legal orgs before and after the current v legal org in the ordered set where groupId = &#63; and statusOrg = &#63; and rssable = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param orgId the primary key of the current v legal org
	* @param groupId the group id to search with
	* @param statusOrg the status org to search with
	* @param rssable the rssable to search with
	* @param orderByComparator the comparator to order the set by
	* @return the previous, current, and next v legal org
	* @throws com.vportal.portlet.vlegal.NoSuchVLegalOrgException if a v legal org with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.vportal.portlet.vlegal.model.VLegalOrg[] findByS_Rss_PrevAndNext(
		java.lang.String orgId, long groupId, boolean statusOrg,
		boolean rssable,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vlegal.NoSuchVLegalOrgException {
		return getPersistence()
				   .findByS_Rss_PrevAndNext(orgId, groupId, statusOrg, rssable,
			orderByComparator);
	}

	/**
	* Finds all the v legal orgs where groupId = &#63; and language = &#63; and parentId = &#63;.
	*
	* @param groupId the group id to search with
	* @param language the language to search with
	* @param parentId the parent id to search with
	* @return the matching v legal orgs
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.vportal.portlet.vlegal.model.VLegalOrg> findByG_L_P(
		long groupId, java.lang.String language, java.lang.String parentId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByG_L_P(groupId, language, parentId);
	}

	/**
	* Finds a range of all the v legal orgs where groupId = &#63; and language = &#63; and parentId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param groupId the group id to search with
	* @param language the language to search with
	* @param parentId the parent id to search with
	* @param start the lower bound of the range of v legal orgs to return
	* @param end the upper bound of the range of v legal orgs to return (not inclusive)
	* @return the range of matching v legal orgs
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.vportal.portlet.vlegal.model.VLegalOrg> findByG_L_P(
		long groupId, java.lang.String language, java.lang.String parentId,
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByG_L_P(groupId, language, parentId, start, end);
	}

	/**
	* Finds an ordered range of all the v legal orgs where groupId = &#63; and language = &#63; and parentId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param groupId the group id to search with
	* @param language the language to search with
	* @param parentId the parent id to search with
	* @param start the lower bound of the range of v legal orgs to return
	* @param end the upper bound of the range of v legal orgs to return (not inclusive)
	* @param orderByComparator the comparator to order the results by
	* @return the ordered range of matching v legal orgs
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.vportal.portlet.vlegal.model.VLegalOrg> findByG_L_P(
		long groupId, java.lang.String language, java.lang.String parentId,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByG_L_P(groupId, language, parentId, start, end,
			orderByComparator);
	}

	/**
	* Finds the first v legal org in the ordered set where groupId = &#63; and language = &#63; and parentId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param groupId the group id to search with
	* @param language the language to search with
	* @param parentId the parent id to search with
	* @param orderByComparator the comparator to order the set by
	* @return the first matching v legal org
	* @throws com.vportal.portlet.vlegal.NoSuchVLegalOrgException if a matching v legal org could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.vportal.portlet.vlegal.model.VLegalOrg findByG_L_P_First(
		long groupId, java.lang.String language, java.lang.String parentId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vlegal.NoSuchVLegalOrgException {
		return getPersistence()
				   .findByG_L_P_First(groupId, language, parentId,
			orderByComparator);
	}

	/**
	* Finds the last v legal org in the ordered set where groupId = &#63; and language = &#63; and parentId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param groupId the group id to search with
	* @param language the language to search with
	* @param parentId the parent id to search with
	* @param orderByComparator the comparator to order the set by
	* @return the last matching v legal org
	* @throws com.vportal.portlet.vlegal.NoSuchVLegalOrgException if a matching v legal org could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.vportal.portlet.vlegal.model.VLegalOrg findByG_L_P_Last(
		long groupId, java.lang.String language, java.lang.String parentId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vlegal.NoSuchVLegalOrgException {
		return getPersistence()
				   .findByG_L_P_Last(groupId, language, parentId,
			orderByComparator);
	}

	/**
	* Finds the v legal orgs before and after the current v legal org in the ordered set where groupId = &#63; and language = &#63; and parentId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param orgId the primary key of the current v legal org
	* @param groupId the group id to search with
	* @param language the language to search with
	* @param parentId the parent id to search with
	* @param orderByComparator the comparator to order the set by
	* @return the previous, current, and next v legal org
	* @throws com.vportal.portlet.vlegal.NoSuchVLegalOrgException if a v legal org with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.vportal.portlet.vlegal.model.VLegalOrg[] findByG_L_P_PrevAndNext(
		java.lang.String orgId, long groupId, java.lang.String language,
		java.lang.String parentId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vlegal.NoSuchVLegalOrgException {
		return getPersistence()
				   .findByG_L_P_PrevAndNext(orgId, groupId, language, parentId,
			orderByComparator);
	}

	/**
	* Finds all the v legal orgs where groupId = &#63; and language = &#63; and parentId = &#63; and statusOrg = &#63;.
	*
	* @param groupId the group id to search with
	* @param language the language to search with
	* @param parentId the parent id to search with
	* @param statusOrg the status org to search with
	* @return the matching v legal orgs
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.vportal.portlet.vlegal.model.VLegalOrg> findByG_L_P_S(
		long groupId, java.lang.String language, java.lang.String parentId,
		boolean statusOrg)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByG_L_P_S(groupId, language, parentId, statusOrg);
	}

	/**
	* Finds a range of all the v legal orgs where groupId = &#63; and language = &#63; and parentId = &#63; and statusOrg = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param groupId the group id to search with
	* @param language the language to search with
	* @param parentId the parent id to search with
	* @param statusOrg the status org to search with
	* @param start the lower bound of the range of v legal orgs to return
	* @param end the upper bound of the range of v legal orgs to return (not inclusive)
	* @return the range of matching v legal orgs
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.vportal.portlet.vlegal.model.VLegalOrg> findByG_L_P_S(
		long groupId, java.lang.String language, java.lang.String parentId,
		boolean statusOrg, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByG_L_P_S(groupId, language, parentId, statusOrg,
			start, end);
	}

	/**
	* Finds an ordered range of all the v legal orgs where groupId = &#63; and language = &#63; and parentId = &#63; and statusOrg = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param groupId the group id to search with
	* @param language the language to search with
	* @param parentId the parent id to search with
	* @param statusOrg the status org to search with
	* @param start the lower bound of the range of v legal orgs to return
	* @param end the upper bound of the range of v legal orgs to return (not inclusive)
	* @param orderByComparator the comparator to order the results by
	* @return the ordered range of matching v legal orgs
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.vportal.portlet.vlegal.model.VLegalOrg> findByG_L_P_S(
		long groupId, java.lang.String language, java.lang.String parentId,
		boolean statusOrg, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByG_L_P_S(groupId, language, parentId, statusOrg,
			start, end, orderByComparator);
	}

	/**
	* Finds the first v legal org in the ordered set where groupId = &#63; and language = &#63; and parentId = &#63; and statusOrg = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param groupId the group id to search with
	* @param language the language to search with
	* @param parentId the parent id to search with
	* @param statusOrg the status org to search with
	* @param orderByComparator the comparator to order the set by
	* @return the first matching v legal org
	* @throws com.vportal.portlet.vlegal.NoSuchVLegalOrgException if a matching v legal org could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.vportal.portlet.vlegal.model.VLegalOrg findByG_L_P_S_First(
		long groupId, java.lang.String language, java.lang.String parentId,
		boolean statusOrg,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vlegal.NoSuchVLegalOrgException {
		return getPersistence()
				   .findByG_L_P_S_First(groupId, language, parentId, statusOrg,
			orderByComparator);
	}

	/**
	* Finds the last v legal org in the ordered set where groupId = &#63; and language = &#63; and parentId = &#63; and statusOrg = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param groupId the group id to search with
	* @param language the language to search with
	* @param parentId the parent id to search with
	* @param statusOrg the status org to search with
	* @param orderByComparator the comparator to order the set by
	* @return the last matching v legal org
	* @throws com.vportal.portlet.vlegal.NoSuchVLegalOrgException if a matching v legal org could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.vportal.portlet.vlegal.model.VLegalOrg findByG_L_P_S_Last(
		long groupId, java.lang.String language, java.lang.String parentId,
		boolean statusOrg,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vlegal.NoSuchVLegalOrgException {
		return getPersistence()
				   .findByG_L_P_S_Last(groupId, language, parentId, statusOrg,
			orderByComparator);
	}

	/**
	* Finds the v legal orgs before and after the current v legal org in the ordered set where groupId = &#63; and language = &#63; and parentId = &#63; and statusOrg = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param orgId the primary key of the current v legal org
	* @param groupId the group id to search with
	* @param language the language to search with
	* @param parentId the parent id to search with
	* @param statusOrg the status org to search with
	* @param orderByComparator the comparator to order the set by
	* @return the previous, current, and next v legal org
	* @throws com.vportal.portlet.vlegal.NoSuchVLegalOrgException if a v legal org with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.vportal.portlet.vlegal.model.VLegalOrg[] findByG_L_P_S_PrevAndNext(
		java.lang.String orgId, long groupId, java.lang.String language,
		java.lang.String parentId, boolean statusOrg,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vlegal.NoSuchVLegalOrgException {
		return getPersistence()
				   .findByG_L_P_S_PrevAndNext(orgId, groupId, language,
			parentId, statusOrg, orderByComparator);
	}

	/**
	* Finds all the v legal orgs.
	*
	* @return the v legal orgs
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.vportal.portlet.vlegal.model.VLegalOrg> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
	}

	/**
	* Finds a range of all the v legal orgs.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of v legal orgs to return
	* @param end the upper bound of the range of v legal orgs to return (not inclusive)
	* @return the range of v legal orgs
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.vportal.portlet.vlegal.model.VLegalOrg> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

	/**
	* Finds an ordered range of all the v legal orgs.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of v legal orgs to return
	* @param end the upper bound of the range of v legal orgs to return (not inclusive)
	* @param orderByComparator the comparator to order the results by
	* @return the ordered range of v legal orgs
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.vportal.portlet.vlegal.model.VLegalOrg> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the v legal orgs where groupId = &#63; from the database.
	*
	* @param groupId the group id to search with
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByGroupId(long groupId)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByGroupId(groupId);
	}

	/**
	* Removes all the v legal orgs where groupId = &#63; and language = &#63; from the database.
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
	* Removes the v legal org where groupId = &#63; and orgId = &#63; from the database.
	*
	* @param groupId the group id to search with
	* @param orgId the org id to search with
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByG_O(long groupId, java.lang.String orgId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vlegal.NoSuchVLegalOrgException {
		getPersistence().removeByG_O(groupId, orgId);
	}

	/**
	* Removes all the v legal orgs where groupId = &#63; and statusOrg = &#63; and language = &#63; from the database.
	*
	* @param groupId the group id to search with
	* @param statusOrg the status org to search with
	* @param language the language to search with
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByS_L(long groupId, boolean statusOrg,
		java.lang.String language)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByS_L(groupId, statusOrg, language);
	}

	/**
	* Removes all the v legal orgs where groupId = &#63; and statusOrg = &#63; and rssable = &#63; from the database.
	*
	* @param groupId the group id to search with
	* @param statusOrg the status org to search with
	* @param rssable the rssable to search with
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByS_Rss(long groupId, boolean statusOrg,
		boolean rssable)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByS_Rss(groupId, statusOrg, rssable);
	}

	/**
	* Removes all the v legal orgs where groupId = &#63; and language = &#63; and parentId = &#63; from the database.
	*
	* @param groupId the group id to search with
	* @param language the language to search with
	* @param parentId the parent id to search with
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByG_L_P(long groupId, java.lang.String language,
		java.lang.String parentId)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByG_L_P(groupId, language, parentId);
	}

	/**
	* Removes all the v legal orgs where groupId = &#63; and language = &#63; and parentId = &#63; and statusOrg = &#63; from the database.
	*
	* @param groupId the group id to search with
	* @param language the language to search with
	* @param parentId the parent id to search with
	* @param statusOrg the status org to search with
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByG_L_P_S(long groupId, java.lang.String language,
		java.lang.String parentId, boolean statusOrg)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByG_L_P_S(groupId, language, parentId, statusOrg);
	}

	/**
	* Removes all the v legal orgs from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Counts all the v legal orgs where groupId = &#63;.
	*
	* @param groupId the group id to search with
	* @return the number of matching v legal orgs
	* @throws SystemException if a system exception occurred
	*/
	public static int countByGroupId(long groupId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByGroupId(groupId);
	}

	/**
	* Counts all the v legal orgs where groupId = &#63; and language = &#63;.
	*
	* @param groupId the group id to search with
	* @param language the language to search with
	* @return the number of matching v legal orgs
	* @throws SystemException if a system exception occurred
	*/
	public static int countByG_L(long groupId, java.lang.String language)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByG_L(groupId, language);
	}

	/**
	* Counts all the v legal orgs where groupId = &#63; and orgId = &#63;.
	*
	* @param groupId the group id to search with
	* @param orgId the org id to search with
	* @return the number of matching v legal orgs
	* @throws SystemException if a system exception occurred
	*/
	public static int countByG_O(long groupId, java.lang.String orgId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByG_O(groupId, orgId);
	}

	/**
	* Counts all the v legal orgs where groupId = &#63; and statusOrg = &#63; and language = &#63;.
	*
	* @param groupId the group id to search with
	* @param statusOrg the status org to search with
	* @param language the language to search with
	* @return the number of matching v legal orgs
	* @throws SystemException if a system exception occurred
	*/
	public static int countByS_L(long groupId, boolean statusOrg,
		java.lang.String language)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByS_L(groupId, statusOrg, language);
	}

	/**
	* Counts all the v legal orgs where groupId = &#63; and statusOrg = &#63; and rssable = &#63;.
	*
	* @param groupId the group id to search with
	* @param statusOrg the status org to search with
	* @param rssable the rssable to search with
	* @return the number of matching v legal orgs
	* @throws SystemException if a system exception occurred
	*/
	public static int countByS_Rss(long groupId, boolean statusOrg,
		boolean rssable)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByS_Rss(groupId, statusOrg, rssable);
	}

	/**
	* Counts all the v legal orgs where groupId = &#63; and language = &#63; and parentId = &#63;.
	*
	* @param groupId the group id to search with
	* @param language the language to search with
	* @param parentId the parent id to search with
	* @return the number of matching v legal orgs
	* @throws SystemException if a system exception occurred
	*/
	public static int countByG_L_P(long groupId, java.lang.String language,
		java.lang.String parentId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByG_L_P(groupId, language, parentId);
	}

	/**
	* Counts all the v legal orgs where groupId = &#63; and language = &#63; and parentId = &#63; and statusOrg = &#63;.
	*
	* @param groupId the group id to search with
	* @param language the language to search with
	* @param parentId the parent id to search with
	* @param statusOrg the status org to search with
	* @return the number of matching v legal orgs
	* @throws SystemException if a system exception occurred
	*/
	public static int countByG_L_P_S(long groupId, java.lang.String language,
		java.lang.String parentId, boolean statusOrg)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .countByG_L_P_S(groupId, language, parentId, statusOrg);
	}

	/**
	* Counts all the v legal orgs.
	*
	* @return the number of v legal orgs
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static VLegalOrgPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (VLegalOrgPersistence)PortletBeanLocatorUtil.locate(com.vportal.portlet.vlegal.service.ClpSerializer.SERVLET_CONTEXT_NAME,
					VLegalOrgPersistence.class.getName());
		}

		return _persistence;
	}

	public void setPersistence(VLegalOrgPersistence persistence) {
		_persistence = persistence;
	}

	private static VLegalOrgPersistence _persistence;
}