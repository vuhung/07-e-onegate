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

import com.vportal.portlet.vlegal.model.VLegalFORel;

import java.util.List;

/**
 * The persistence utility for the v legal f o rel service. This utility wraps {@link VLegalFORelPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
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
 * @see VLegalFORelPersistence
 * @see VLegalFORelPersistenceImpl
 * @generated
 */
public class VLegalFORelUtil {
	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#clearCache()
	 */
	public static void clearCache() {
		getPersistence().clearCache();
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#clearCache(com.liferay.portal.model.BaseModel)
	 */
	public static void clearCache(VLegalFORel vLegalFORel) {
		getPersistence().clearCache(vLegalFORel);
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
	public static List<VLegalFORel> findWithDynamicQuery(
		DynamicQuery dynamicQuery) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<VLegalFORel> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<VLegalFORel> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#remove(com.liferay.portal.model.BaseModel)
	 */
	public static VLegalFORel remove(VLegalFORel vLegalFORel)
		throws SystemException {
		return getPersistence().remove(vLegalFORel);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, boolean)
	 */
	public static VLegalFORel update(VLegalFORel vLegalFORel, boolean merge)
		throws SystemException {
		return getPersistence().update(vLegalFORel, merge);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, boolean, ServiceContext)
	 */
	public static VLegalFORel update(VLegalFORel vLegalFORel, boolean merge,
		ServiceContext serviceContext) throws SystemException {
		return getPersistence().update(vLegalFORel, merge, serviceContext);
	}

	/**
	* Caches the v legal f o rel in the entity cache if it is enabled.
	*
	* @param vLegalFORel the v legal f o rel to cache
	*/
	public static void cacheResult(
		com.vportal.portlet.vlegal.model.VLegalFORel vLegalFORel) {
		getPersistence().cacheResult(vLegalFORel);
	}

	/**
	* Caches the v legal f o rels in the entity cache if it is enabled.
	*
	* @param vLegalFORels the v legal f o rels to cache
	*/
	public static void cacheResult(
		java.util.List<com.vportal.portlet.vlegal.model.VLegalFORel> vLegalFORels) {
		getPersistence().cacheResult(vLegalFORels);
	}

	/**
	* Creates a new v legal f o rel with the primary key. Does not add the v legal f o rel to the database.
	*
	* @param vLegalFORelPK the primary key for the new v legal f o rel
	* @return the new v legal f o rel
	*/
	public static com.vportal.portlet.vlegal.model.VLegalFORel create(
		VLegalFORelPK vLegalFORelPK) {
		return getPersistence().create(vLegalFORelPK);
	}

	/**
	* Removes the v legal f o rel with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param vLegalFORelPK the primary key of the v legal f o rel to remove
	* @return the v legal f o rel that was removed
	* @throws com.vportal.portlet.vlegal.NoSuchVLegalFORelException if a v legal f o rel with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.vportal.portlet.vlegal.model.VLegalFORel remove(
		VLegalFORelPK vLegalFORelPK)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vlegal.NoSuchVLegalFORelException {
		return getPersistence().remove(vLegalFORelPK);
	}

	public static com.vportal.portlet.vlegal.model.VLegalFORel updateImpl(
		com.vportal.portlet.vlegal.model.VLegalFORel vLegalFORel, boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(vLegalFORel, merge);
	}

	/**
	* Finds the v legal f o rel with the primary key or throws a {@link com.vportal.portlet.vlegal.NoSuchVLegalFORelException} if it could not be found.
	*
	* @param vLegalFORelPK the primary key of the v legal f o rel to find
	* @return the v legal f o rel
	* @throws com.vportal.portlet.vlegal.NoSuchVLegalFORelException if a v legal f o rel with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.vportal.portlet.vlegal.model.VLegalFORel findByPrimaryKey(
		VLegalFORelPK vLegalFORelPK)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vlegal.NoSuchVLegalFORelException {
		return getPersistence().findByPrimaryKey(vLegalFORelPK);
	}

	/**
	* Finds the v legal f o rel with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param vLegalFORelPK the primary key of the v legal f o rel to find
	* @return the v legal f o rel, or <code>null</code> if a v legal f o rel with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.vportal.portlet.vlegal.model.VLegalFORel fetchByPrimaryKey(
		VLegalFORelPK vLegalFORelPK)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(vLegalFORelPK);
	}

	/**
	* Finds all the v legal f o rels where fieldId = &#63;.
	*
	* @param fieldId the field id to search with
	* @return the matching v legal f o rels
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.vportal.portlet.vlegal.model.VLegalFORel> findByField(
		java.lang.String fieldId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByField(fieldId);
	}

	/**
	* Finds a range of all the v legal f o rels where fieldId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param fieldId the field id to search with
	* @param start the lower bound of the range of v legal f o rels to return
	* @param end the upper bound of the range of v legal f o rels to return (not inclusive)
	* @return the range of matching v legal f o rels
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.vportal.portlet.vlegal.model.VLegalFORel> findByField(
		java.lang.String fieldId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByField(fieldId, start, end);
	}

	/**
	* Finds an ordered range of all the v legal f o rels where fieldId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param fieldId the field id to search with
	* @param start the lower bound of the range of v legal f o rels to return
	* @param end the upper bound of the range of v legal f o rels to return (not inclusive)
	* @param orderByComparator the comparator to order the results by
	* @return the ordered range of matching v legal f o rels
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.vportal.portlet.vlegal.model.VLegalFORel> findByField(
		java.lang.String fieldId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByField(fieldId, start, end, orderByComparator);
	}

	/**
	* Finds the first v legal f o rel in the ordered set where fieldId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param fieldId the field id to search with
	* @param orderByComparator the comparator to order the set by
	* @return the first matching v legal f o rel
	* @throws com.vportal.portlet.vlegal.NoSuchVLegalFORelException if a matching v legal f o rel could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.vportal.portlet.vlegal.model.VLegalFORel findByField_First(
		java.lang.String fieldId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vlegal.NoSuchVLegalFORelException {
		return getPersistence().findByField_First(fieldId, orderByComparator);
	}

	/**
	* Finds the last v legal f o rel in the ordered set where fieldId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param fieldId the field id to search with
	* @param orderByComparator the comparator to order the set by
	* @return the last matching v legal f o rel
	* @throws com.vportal.portlet.vlegal.NoSuchVLegalFORelException if a matching v legal f o rel could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.vportal.portlet.vlegal.model.VLegalFORel findByField_Last(
		java.lang.String fieldId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vlegal.NoSuchVLegalFORelException {
		return getPersistence().findByField_Last(fieldId, orderByComparator);
	}

	/**
	* Finds the v legal f o rels before and after the current v legal f o rel in the ordered set where fieldId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param vLegalFORelPK the primary key of the current v legal f o rel
	* @param fieldId the field id to search with
	* @param orderByComparator the comparator to order the set by
	* @return the previous, current, and next v legal f o rel
	* @throws com.vportal.portlet.vlegal.NoSuchVLegalFORelException if a v legal f o rel with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.vportal.portlet.vlegal.model.VLegalFORel[] findByField_PrevAndNext(
		VLegalFORelPK vLegalFORelPK, java.lang.String fieldId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vlegal.NoSuchVLegalFORelException {
		return getPersistence()
				   .findByField_PrevAndNext(vLegalFORelPK, fieldId,
			orderByComparator);
	}

	/**
	* Finds all the v legal f o rels where orgId = &#63;.
	*
	* @param orgId the org id to search with
	* @return the matching v legal f o rels
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.vportal.portlet.vlegal.model.VLegalFORel> findByOrg(
		java.lang.String orgId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByOrg(orgId);
	}

	/**
	* Finds a range of all the v legal f o rels where orgId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param orgId the org id to search with
	* @param start the lower bound of the range of v legal f o rels to return
	* @param end the upper bound of the range of v legal f o rels to return (not inclusive)
	* @return the range of matching v legal f o rels
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.vportal.portlet.vlegal.model.VLegalFORel> findByOrg(
		java.lang.String orgId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByOrg(orgId, start, end);
	}

	/**
	* Finds an ordered range of all the v legal f o rels where orgId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param orgId the org id to search with
	* @param start the lower bound of the range of v legal f o rels to return
	* @param end the upper bound of the range of v legal f o rels to return (not inclusive)
	* @param orderByComparator the comparator to order the results by
	* @return the ordered range of matching v legal f o rels
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.vportal.portlet.vlegal.model.VLegalFORel> findByOrg(
		java.lang.String orgId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByOrg(orgId, start, end, orderByComparator);
	}

	/**
	* Finds the first v legal f o rel in the ordered set where orgId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param orgId the org id to search with
	* @param orderByComparator the comparator to order the set by
	* @return the first matching v legal f o rel
	* @throws com.vportal.portlet.vlegal.NoSuchVLegalFORelException if a matching v legal f o rel could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.vportal.portlet.vlegal.model.VLegalFORel findByOrg_First(
		java.lang.String orgId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vlegal.NoSuchVLegalFORelException {
		return getPersistence().findByOrg_First(orgId, orderByComparator);
	}

	/**
	* Finds the last v legal f o rel in the ordered set where orgId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param orgId the org id to search with
	* @param orderByComparator the comparator to order the set by
	* @return the last matching v legal f o rel
	* @throws com.vportal.portlet.vlegal.NoSuchVLegalFORelException if a matching v legal f o rel could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.vportal.portlet.vlegal.model.VLegalFORel findByOrg_Last(
		java.lang.String orgId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vlegal.NoSuchVLegalFORelException {
		return getPersistence().findByOrg_Last(orgId, orderByComparator);
	}

	/**
	* Finds the v legal f o rels before and after the current v legal f o rel in the ordered set where orgId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param vLegalFORelPK the primary key of the current v legal f o rel
	* @param orgId the org id to search with
	* @param orderByComparator the comparator to order the set by
	* @return the previous, current, and next v legal f o rel
	* @throws com.vportal.portlet.vlegal.NoSuchVLegalFORelException if a v legal f o rel with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.vportal.portlet.vlegal.model.VLegalFORel[] findByOrg_PrevAndNext(
		VLegalFORelPK vLegalFORelPK, java.lang.String orgId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vlegal.NoSuchVLegalFORelException {
		return getPersistence()
				   .findByOrg_PrevAndNext(vLegalFORelPK, orgId,
			orderByComparator);
	}

	/**
	* Finds all the v legal f o rels.
	*
	* @return the v legal f o rels
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.vportal.portlet.vlegal.model.VLegalFORel> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
	}

	/**
	* Finds a range of all the v legal f o rels.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of v legal f o rels to return
	* @param end the upper bound of the range of v legal f o rels to return (not inclusive)
	* @return the range of v legal f o rels
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.vportal.portlet.vlegal.model.VLegalFORel> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

	/**
	* Finds an ordered range of all the v legal f o rels.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of v legal f o rels to return
	* @param end the upper bound of the range of v legal f o rels to return (not inclusive)
	* @param orderByComparator the comparator to order the results by
	* @return the ordered range of v legal f o rels
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.vportal.portlet.vlegal.model.VLegalFORel> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the v legal f o rels where fieldId = &#63; from the database.
	*
	* @param fieldId the field id to search with
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByField(java.lang.String fieldId)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByField(fieldId);
	}

	/**
	* Removes all the v legal f o rels where orgId = &#63; from the database.
	*
	* @param orgId the org id to search with
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByOrg(java.lang.String orgId)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByOrg(orgId);
	}

	/**
	* Removes all the v legal f o rels from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Counts all the v legal f o rels where fieldId = &#63;.
	*
	* @param fieldId the field id to search with
	* @return the number of matching v legal f o rels
	* @throws SystemException if a system exception occurred
	*/
	public static int countByField(java.lang.String fieldId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByField(fieldId);
	}

	/**
	* Counts all the v legal f o rels where orgId = &#63;.
	*
	* @param orgId the org id to search with
	* @return the number of matching v legal f o rels
	* @throws SystemException if a system exception occurred
	*/
	public static int countByOrg(java.lang.String orgId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByOrg(orgId);
	}

	/**
	* Counts all the v legal f o rels.
	*
	* @return the number of v legal f o rels
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static VLegalFORelPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (VLegalFORelPersistence)PortletBeanLocatorUtil.locate(com.vportal.portlet.vlegal.service.ClpSerializer.SERVLET_CONTEXT_NAME,
					VLegalFORelPersistence.class.getName());
		}

		return _persistence;
	}

	public void setPersistence(VLegalFORelPersistence persistence) {
		_persistence = persistence;
	}

	private static VLegalFORelPersistence _persistence;
}