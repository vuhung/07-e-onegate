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

import com.vportal.portlet.vlegal.model.VLegalDDRel;

import java.util.List;

/**
 * The persistence utility for the v legal d d rel service. This utility wraps {@link VLegalDDRelPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
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
 * @see VLegalDDRelPersistence
 * @see VLegalDDRelPersistenceImpl
 * @generated
 */
public class VLegalDDRelUtil {
	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#clearCache()
	 */
	public static void clearCache() {
		getPersistence().clearCache();
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#clearCache(com.liferay.portal.model.BaseModel)
	 */
	public static void clearCache(VLegalDDRel vLegalDDRel) {
		getPersistence().clearCache(vLegalDDRel);
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
	public static List<VLegalDDRel> findWithDynamicQuery(
		DynamicQuery dynamicQuery) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<VLegalDDRel> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<VLegalDDRel> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#remove(com.liferay.portal.model.BaseModel)
	 */
	public static VLegalDDRel remove(VLegalDDRel vLegalDDRel)
		throws SystemException {
		return getPersistence().remove(vLegalDDRel);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, boolean)
	 */
	public static VLegalDDRel update(VLegalDDRel vLegalDDRel, boolean merge)
		throws SystemException {
		return getPersistence().update(vLegalDDRel, merge);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, boolean, ServiceContext)
	 */
	public static VLegalDDRel update(VLegalDDRel vLegalDDRel, boolean merge,
		ServiceContext serviceContext) throws SystemException {
		return getPersistence().update(vLegalDDRel, merge, serviceContext);
	}

	/**
	* Caches the v legal d d rel in the entity cache if it is enabled.
	*
	* @param vLegalDDRel the v legal d d rel to cache
	*/
	public static void cacheResult(
		com.vportal.portlet.vlegal.model.VLegalDDRel vLegalDDRel) {
		getPersistence().cacheResult(vLegalDDRel);
	}

	/**
	* Caches the v legal d d rels in the entity cache if it is enabled.
	*
	* @param vLegalDDRels the v legal d d rels to cache
	*/
	public static void cacheResult(
		java.util.List<com.vportal.portlet.vlegal.model.VLegalDDRel> vLegalDDRels) {
		getPersistence().cacheResult(vLegalDDRels);
	}

	/**
	* Creates a new v legal d d rel with the primary key. Does not add the v legal d d rel to the database.
	*
	* @param vLegalDDRelPK the primary key for the new v legal d d rel
	* @return the new v legal d d rel
	*/
	public static com.vportal.portlet.vlegal.model.VLegalDDRel create(
		VLegalDDRelPK vLegalDDRelPK) {
		return getPersistence().create(vLegalDDRelPK);
	}

	/**
	* Removes the v legal d d rel with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param vLegalDDRelPK the primary key of the v legal d d rel to remove
	* @return the v legal d d rel that was removed
	* @throws com.vportal.portlet.vlegal.NoSuchVLegalDDRelException if a v legal d d rel with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.vportal.portlet.vlegal.model.VLegalDDRel remove(
		VLegalDDRelPK vLegalDDRelPK)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vlegal.NoSuchVLegalDDRelException {
		return getPersistence().remove(vLegalDDRelPK);
	}

	public static com.vportal.portlet.vlegal.model.VLegalDDRel updateImpl(
		com.vportal.portlet.vlegal.model.VLegalDDRel vLegalDDRel, boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(vLegalDDRel, merge);
	}

	/**
	* Finds the v legal d d rel with the primary key or throws a {@link com.vportal.portlet.vlegal.NoSuchVLegalDDRelException} if it could not be found.
	*
	* @param vLegalDDRelPK the primary key of the v legal d d rel to find
	* @return the v legal d d rel
	* @throws com.vportal.portlet.vlegal.NoSuchVLegalDDRelException if a v legal d d rel with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.vportal.portlet.vlegal.model.VLegalDDRel findByPrimaryKey(
		VLegalDDRelPK vLegalDDRelPK)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vlegal.NoSuchVLegalDDRelException {
		return getPersistence().findByPrimaryKey(vLegalDDRelPK);
	}

	/**
	* Finds the v legal d d rel with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param vLegalDDRelPK the primary key of the v legal d d rel to find
	* @return the v legal d d rel, or <code>null</code> if a v legal d d rel with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.vportal.portlet.vlegal.model.VLegalDDRel fetchByPrimaryKey(
		VLegalDDRelPK vLegalDDRelPK)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(vLegalDDRelPK);
	}

	/**
	* Finds all the v legal d d rels where departmentId = &#63;.
	*
	* @param departmentId the department id to search with
	* @return the matching v legal d d rels
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.vportal.portlet.vlegal.model.VLegalDDRel> findByDepartament(
		long departmentId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByDepartament(departmentId);
	}

	/**
	* Finds a range of all the v legal d d rels where departmentId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param departmentId the department id to search with
	* @param start the lower bound of the range of v legal d d rels to return
	* @param end the upper bound of the range of v legal d d rels to return (not inclusive)
	* @return the range of matching v legal d d rels
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.vportal.portlet.vlegal.model.VLegalDDRel> findByDepartament(
		long departmentId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByDepartament(departmentId, start, end);
	}

	/**
	* Finds an ordered range of all the v legal d d rels where departmentId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param departmentId the department id to search with
	* @param start the lower bound of the range of v legal d d rels to return
	* @param end the upper bound of the range of v legal d d rels to return (not inclusive)
	* @param orderByComparator the comparator to order the results by
	* @return the ordered range of matching v legal d d rels
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.vportal.portlet.vlegal.model.VLegalDDRel> findByDepartament(
		long departmentId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByDepartament(departmentId, start, end,
			orderByComparator);
	}

	/**
	* Finds the first v legal d d rel in the ordered set where departmentId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param departmentId the department id to search with
	* @param orderByComparator the comparator to order the set by
	* @return the first matching v legal d d rel
	* @throws com.vportal.portlet.vlegal.NoSuchVLegalDDRelException if a matching v legal d d rel could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.vportal.portlet.vlegal.model.VLegalDDRel findByDepartament_First(
		long departmentId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vlegal.NoSuchVLegalDDRelException {
		return getPersistence()
				   .findByDepartament_First(departmentId, orderByComparator);
	}

	/**
	* Finds the last v legal d d rel in the ordered set where departmentId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param departmentId the department id to search with
	* @param orderByComparator the comparator to order the set by
	* @return the last matching v legal d d rel
	* @throws com.vportal.portlet.vlegal.NoSuchVLegalDDRelException if a matching v legal d d rel could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.vportal.portlet.vlegal.model.VLegalDDRel findByDepartament_Last(
		long departmentId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vlegal.NoSuchVLegalDDRelException {
		return getPersistence()
				   .findByDepartament_Last(departmentId, orderByComparator);
	}

	/**
	* Finds the v legal d d rels before and after the current v legal d d rel in the ordered set where departmentId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param vLegalDDRelPK the primary key of the current v legal d d rel
	* @param departmentId the department id to search with
	* @param orderByComparator the comparator to order the set by
	* @return the previous, current, and next v legal d d rel
	* @throws com.vportal.portlet.vlegal.NoSuchVLegalDDRelException if a v legal d d rel with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.vportal.portlet.vlegal.model.VLegalDDRel[] findByDepartament_PrevAndNext(
		VLegalDDRelPK vLegalDDRelPK, long departmentId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vlegal.NoSuchVLegalDDRelException {
		return getPersistence()
				   .findByDepartament_PrevAndNext(vLegalDDRelPK, departmentId,
			orderByComparator);
	}

	/**
	* Finds all the v legal d d rels where docId = &#63;.
	*
	* @param docId the doc id to search with
	* @return the matching v legal d d rels
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.vportal.portlet.vlegal.model.VLegalDDRel> findByDoc(
		java.lang.String docId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByDoc(docId);
	}

	/**
	* Finds a range of all the v legal d d rels where docId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param docId the doc id to search with
	* @param start the lower bound of the range of v legal d d rels to return
	* @param end the upper bound of the range of v legal d d rels to return (not inclusive)
	* @return the range of matching v legal d d rels
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.vportal.portlet.vlegal.model.VLegalDDRel> findByDoc(
		java.lang.String docId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByDoc(docId, start, end);
	}

	/**
	* Finds an ordered range of all the v legal d d rels where docId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param docId the doc id to search with
	* @param start the lower bound of the range of v legal d d rels to return
	* @param end the upper bound of the range of v legal d d rels to return (not inclusive)
	* @param orderByComparator the comparator to order the results by
	* @return the ordered range of matching v legal d d rels
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.vportal.portlet.vlegal.model.VLegalDDRel> findByDoc(
		java.lang.String docId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByDoc(docId, start, end, orderByComparator);
	}

	/**
	* Finds the first v legal d d rel in the ordered set where docId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param docId the doc id to search with
	* @param orderByComparator the comparator to order the set by
	* @return the first matching v legal d d rel
	* @throws com.vportal.portlet.vlegal.NoSuchVLegalDDRelException if a matching v legal d d rel could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.vportal.portlet.vlegal.model.VLegalDDRel findByDoc_First(
		java.lang.String docId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vlegal.NoSuchVLegalDDRelException {
		return getPersistence().findByDoc_First(docId, orderByComparator);
	}

	/**
	* Finds the last v legal d d rel in the ordered set where docId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param docId the doc id to search with
	* @param orderByComparator the comparator to order the set by
	* @return the last matching v legal d d rel
	* @throws com.vportal.portlet.vlegal.NoSuchVLegalDDRelException if a matching v legal d d rel could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.vportal.portlet.vlegal.model.VLegalDDRel findByDoc_Last(
		java.lang.String docId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vlegal.NoSuchVLegalDDRelException {
		return getPersistence().findByDoc_Last(docId, orderByComparator);
	}

	/**
	* Finds the v legal d d rels before and after the current v legal d d rel in the ordered set where docId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param vLegalDDRelPK the primary key of the current v legal d d rel
	* @param docId the doc id to search with
	* @param orderByComparator the comparator to order the set by
	* @return the previous, current, and next v legal d d rel
	* @throws com.vportal.portlet.vlegal.NoSuchVLegalDDRelException if a v legal d d rel with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.vportal.portlet.vlegal.model.VLegalDDRel[] findByDoc_PrevAndNext(
		VLegalDDRelPK vLegalDDRelPK, java.lang.String docId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vlegal.NoSuchVLegalDDRelException {
		return getPersistence()
				   .findByDoc_PrevAndNext(vLegalDDRelPK, docId,
			orderByComparator);
	}

	/**
	* Finds all the v legal d d rels.
	*
	* @return the v legal d d rels
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.vportal.portlet.vlegal.model.VLegalDDRel> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
	}

	/**
	* Finds a range of all the v legal d d rels.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of v legal d d rels to return
	* @param end the upper bound of the range of v legal d d rels to return (not inclusive)
	* @return the range of v legal d d rels
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.vportal.portlet.vlegal.model.VLegalDDRel> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

	/**
	* Finds an ordered range of all the v legal d d rels.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of v legal d d rels to return
	* @param end the upper bound of the range of v legal d d rels to return (not inclusive)
	* @param orderByComparator the comparator to order the results by
	* @return the ordered range of v legal d d rels
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.vportal.portlet.vlegal.model.VLegalDDRel> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the v legal d d rels where departmentId = &#63; from the database.
	*
	* @param departmentId the department id to search with
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByDepartament(long departmentId)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByDepartament(departmentId);
	}

	/**
	* Removes all the v legal d d rels where docId = &#63; from the database.
	*
	* @param docId the doc id to search with
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByDoc(java.lang.String docId)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByDoc(docId);
	}

	/**
	* Removes all the v legal d d rels from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Counts all the v legal d d rels where departmentId = &#63;.
	*
	* @param departmentId the department id to search with
	* @return the number of matching v legal d d rels
	* @throws SystemException if a system exception occurred
	*/
	public static int countByDepartament(long departmentId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByDepartament(departmentId);
	}

	/**
	* Counts all the v legal d d rels where docId = &#63;.
	*
	* @param docId the doc id to search with
	* @return the number of matching v legal d d rels
	* @throws SystemException if a system exception occurred
	*/
	public static int countByDoc(java.lang.String docId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByDoc(docId);
	}

	/**
	* Counts all the v legal d d rels.
	*
	* @return the number of v legal d d rels
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static VLegalDDRelPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (VLegalDDRelPersistence)PortletBeanLocatorUtil.locate(com.vportal.portlet.vlegal.service.ClpSerializer.SERVLET_CONTEXT_NAME,
					VLegalDDRelPersistence.class.getName());
		}

		return _persistence;
	}

	public void setPersistence(VLegalDDRelPersistence persistence) {
		_persistence = persistence;
	}

	private static VLegalDDRelPersistence _persistence;
}