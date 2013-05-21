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

import com.vportal.portlet.vlegal.model.VLegalDFRel;

import java.util.List;

/**
 * The persistence utility for the v legal d f rel service. This utility wraps {@link VLegalDFRelPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
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
 * @see VLegalDFRelPersistence
 * @see VLegalDFRelPersistenceImpl
 * @generated
 */
public class VLegalDFRelUtil {
	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#clearCache()
	 */
	public static void clearCache() {
		getPersistence().clearCache();
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#clearCache(com.liferay.portal.model.BaseModel)
	 */
	public static void clearCache(VLegalDFRel vLegalDFRel) {
		getPersistence().clearCache(vLegalDFRel);
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
	public static List<VLegalDFRel> findWithDynamicQuery(
		DynamicQuery dynamicQuery) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<VLegalDFRel> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<VLegalDFRel> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#remove(com.liferay.portal.model.BaseModel)
	 */
	public static VLegalDFRel remove(VLegalDFRel vLegalDFRel)
		throws SystemException {
		return getPersistence().remove(vLegalDFRel);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, boolean)
	 */
	public static VLegalDFRel update(VLegalDFRel vLegalDFRel, boolean merge)
		throws SystemException {
		return getPersistence().update(vLegalDFRel, merge);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, boolean, ServiceContext)
	 */
	public static VLegalDFRel update(VLegalDFRel vLegalDFRel, boolean merge,
		ServiceContext serviceContext) throws SystemException {
		return getPersistence().update(vLegalDFRel, merge, serviceContext);
	}

	/**
	* Caches the v legal d f rel in the entity cache if it is enabled.
	*
	* @param vLegalDFRel the v legal d f rel to cache
	*/
	public static void cacheResult(
		com.vportal.portlet.vlegal.model.VLegalDFRel vLegalDFRel) {
		getPersistence().cacheResult(vLegalDFRel);
	}

	/**
	* Caches the v legal d f rels in the entity cache if it is enabled.
	*
	* @param vLegalDFRels the v legal d f rels to cache
	*/
	public static void cacheResult(
		java.util.List<com.vportal.portlet.vlegal.model.VLegalDFRel> vLegalDFRels) {
		getPersistence().cacheResult(vLegalDFRels);
	}

	/**
	* Creates a new v legal d f rel with the primary key. Does not add the v legal d f rel to the database.
	*
	* @param vLegalDFRelPK the primary key for the new v legal d f rel
	* @return the new v legal d f rel
	*/
	public static com.vportal.portlet.vlegal.model.VLegalDFRel create(
		VLegalDFRelPK vLegalDFRelPK) {
		return getPersistence().create(vLegalDFRelPK);
	}

	/**
	* Removes the v legal d f rel with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param vLegalDFRelPK the primary key of the v legal d f rel to remove
	* @return the v legal d f rel that was removed
	* @throws com.vportal.portlet.vlegal.NoSuchVLegalDFRelException if a v legal d f rel with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.vportal.portlet.vlegal.model.VLegalDFRel remove(
		VLegalDFRelPK vLegalDFRelPK)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vlegal.NoSuchVLegalDFRelException {
		return getPersistence().remove(vLegalDFRelPK);
	}

	public static com.vportal.portlet.vlegal.model.VLegalDFRel updateImpl(
		com.vportal.portlet.vlegal.model.VLegalDFRel vLegalDFRel, boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(vLegalDFRel, merge);
	}

	/**
	* Finds the v legal d f rel with the primary key or throws a {@link com.vportal.portlet.vlegal.NoSuchVLegalDFRelException} if it could not be found.
	*
	* @param vLegalDFRelPK the primary key of the v legal d f rel to find
	* @return the v legal d f rel
	* @throws com.vportal.portlet.vlegal.NoSuchVLegalDFRelException if a v legal d f rel with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.vportal.portlet.vlegal.model.VLegalDFRel findByPrimaryKey(
		VLegalDFRelPK vLegalDFRelPK)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vlegal.NoSuchVLegalDFRelException {
		return getPersistence().findByPrimaryKey(vLegalDFRelPK);
	}

	/**
	* Finds the v legal d f rel with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param vLegalDFRelPK the primary key of the v legal d f rel to find
	* @return the v legal d f rel, or <code>null</code> if a v legal d f rel with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.vportal.portlet.vlegal.model.VLegalDFRel fetchByPrimaryKey(
		VLegalDFRelPK vLegalDFRelPK)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(vLegalDFRelPK);
	}

	/**
	* Finds all the v legal d f rels where fieldId = &#63;.
	*
	* @param fieldId the field id to search with
	* @return the matching v legal d f rels
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.vportal.portlet.vlegal.model.VLegalDFRel> findByField(
		java.lang.String fieldId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByField(fieldId);
	}

	/**
	* Finds a range of all the v legal d f rels where fieldId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param fieldId the field id to search with
	* @param start the lower bound of the range of v legal d f rels to return
	* @param end the upper bound of the range of v legal d f rels to return (not inclusive)
	* @return the range of matching v legal d f rels
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.vportal.portlet.vlegal.model.VLegalDFRel> findByField(
		java.lang.String fieldId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByField(fieldId, start, end);
	}

	/**
	* Finds an ordered range of all the v legal d f rels where fieldId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param fieldId the field id to search with
	* @param start the lower bound of the range of v legal d f rels to return
	* @param end the upper bound of the range of v legal d f rels to return (not inclusive)
	* @param orderByComparator the comparator to order the results by
	* @return the ordered range of matching v legal d f rels
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.vportal.portlet.vlegal.model.VLegalDFRel> findByField(
		java.lang.String fieldId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByField(fieldId, start, end, orderByComparator);
	}

	/**
	* Finds the first v legal d f rel in the ordered set where fieldId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param fieldId the field id to search with
	* @param orderByComparator the comparator to order the set by
	* @return the first matching v legal d f rel
	* @throws com.vportal.portlet.vlegal.NoSuchVLegalDFRelException if a matching v legal d f rel could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.vportal.portlet.vlegal.model.VLegalDFRel findByField_First(
		java.lang.String fieldId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vlegal.NoSuchVLegalDFRelException {
		return getPersistence().findByField_First(fieldId, orderByComparator);
	}

	/**
	* Finds the last v legal d f rel in the ordered set where fieldId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param fieldId the field id to search with
	* @param orderByComparator the comparator to order the set by
	* @return the last matching v legal d f rel
	* @throws com.vportal.portlet.vlegal.NoSuchVLegalDFRelException if a matching v legal d f rel could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.vportal.portlet.vlegal.model.VLegalDFRel findByField_Last(
		java.lang.String fieldId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vlegal.NoSuchVLegalDFRelException {
		return getPersistence().findByField_Last(fieldId, orderByComparator);
	}

	/**
	* Finds the v legal d f rels before and after the current v legal d f rel in the ordered set where fieldId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param vLegalDFRelPK the primary key of the current v legal d f rel
	* @param fieldId the field id to search with
	* @param orderByComparator the comparator to order the set by
	* @return the previous, current, and next v legal d f rel
	* @throws com.vportal.portlet.vlegal.NoSuchVLegalDFRelException if a v legal d f rel with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.vportal.portlet.vlegal.model.VLegalDFRel[] findByField_PrevAndNext(
		VLegalDFRelPK vLegalDFRelPK, java.lang.String fieldId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vlegal.NoSuchVLegalDFRelException {
		return getPersistence()
				   .findByField_PrevAndNext(vLegalDFRelPK, fieldId,
			orderByComparator);
	}

	/**
	* Finds all the v legal d f rels where docId = &#63;.
	*
	* @param docId the doc id to search with
	* @return the matching v legal d f rels
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.vportal.portlet.vlegal.model.VLegalDFRel> findByDoc(
		java.lang.String docId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByDoc(docId);
	}

	/**
	* Finds a range of all the v legal d f rels where docId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param docId the doc id to search with
	* @param start the lower bound of the range of v legal d f rels to return
	* @param end the upper bound of the range of v legal d f rels to return (not inclusive)
	* @return the range of matching v legal d f rels
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.vportal.portlet.vlegal.model.VLegalDFRel> findByDoc(
		java.lang.String docId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByDoc(docId, start, end);
	}

	/**
	* Finds an ordered range of all the v legal d f rels where docId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param docId the doc id to search with
	* @param start the lower bound of the range of v legal d f rels to return
	* @param end the upper bound of the range of v legal d f rels to return (not inclusive)
	* @param orderByComparator the comparator to order the results by
	* @return the ordered range of matching v legal d f rels
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.vportal.portlet.vlegal.model.VLegalDFRel> findByDoc(
		java.lang.String docId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByDoc(docId, start, end, orderByComparator);
	}

	/**
	* Finds the first v legal d f rel in the ordered set where docId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param docId the doc id to search with
	* @param orderByComparator the comparator to order the set by
	* @return the first matching v legal d f rel
	* @throws com.vportal.portlet.vlegal.NoSuchVLegalDFRelException if a matching v legal d f rel could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.vportal.portlet.vlegal.model.VLegalDFRel findByDoc_First(
		java.lang.String docId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vlegal.NoSuchVLegalDFRelException {
		return getPersistence().findByDoc_First(docId, orderByComparator);
	}

	/**
	* Finds the last v legal d f rel in the ordered set where docId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param docId the doc id to search with
	* @param orderByComparator the comparator to order the set by
	* @return the last matching v legal d f rel
	* @throws com.vportal.portlet.vlegal.NoSuchVLegalDFRelException if a matching v legal d f rel could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.vportal.portlet.vlegal.model.VLegalDFRel findByDoc_Last(
		java.lang.String docId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vlegal.NoSuchVLegalDFRelException {
		return getPersistence().findByDoc_Last(docId, orderByComparator);
	}

	/**
	* Finds the v legal d f rels before and after the current v legal d f rel in the ordered set where docId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param vLegalDFRelPK the primary key of the current v legal d f rel
	* @param docId the doc id to search with
	* @param orderByComparator the comparator to order the set by
	* @return the previous, current, and next v legal d f rel
	* @throws com.vportal.portlet.vlegal.NoSuchVLegalDFRelException if a v legal d f rel with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.vportal.portlet.vlegal.model.VLegalDFRel[] findByDoc_PrevAndNext(
		VLegalDFRelPK vLegalDFRelPK, java.lang.String docId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vlegal.NoSuchVLegalDFRelException {
		return getPersistence()
				   .findByDoc_PrevAndNext(vLegalDFRelPK, docId,
			orderByComparator);
	}

	/**
	* Finds all the v legal d f rels.
	*
	* @return the v legal d f rels
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.vportal.portlet.vlegal.model.VLegalDFRel> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
	}

	/**
	* Finds a range of all the v legal d f rels.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of v legal d f rels to return
	* @param end the upper bound of the range of v legal d f rels to return (not inclusive)
	* @return the range of v legal d f rels
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.vportal.portlet.vlegal.model.VLegalDFRel> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

	/**
	* Finds an ordered range of all the v legal d f rels.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of v legal d f rels to return
	* @param end the upper bound of the range of v legal d f rels to return (not inclusive)
	* @param orderByComparator the comparator to order the results by
	* @return the ordered range of v legal d f rels
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.vportal.portlet.vlegal.model.VLegalDFRel> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the v legal d f rels where fieldId = &#63; from the database.
	*
	* @param fieldId the field id to search with
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByField(java.lang.String fieldId)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByField(fieldId);
	}

	/**
	* Removes all the v legal d f rels where docId = &#63; from the database.
	*
	* @param docId the doc id to search with
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByDoc(java.lang.String docId)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByDoc(docId);
	}

	/**
	* Removes all the v legal d f rels from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Counts all the v legal d f rels where fieldId = &#63;.
	*
	* @param fieldId the field id to search with
	* @return the number of matching v legal d f rels
	* @throws SystemException if a system exception occurred
	*/
	public static int countByField(java.lang.String fieldId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByField(fieldId);
	}

	/**
	* Counts all the v legal d f rels where docId = &#63;.
	*
	* @param docId the doc id to search with
	* @return the number of matching v legal d f rels
	* @throws SystemException if a system exception occurred
	*/
	public static int countByDoc(java.lang.String docId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByDoc(docId);
	}

	/**
	* Counts all the v legal d f rels.
	*
	* @return the number of v legal d f rels
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static VLegalDFRelPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (VLegalDFRelPersistence)PortletBeanLocatorUtil.locate(com.vportal.portlet.vlegal.service.ClpSerializer.SERVLET_CONTEXT_NAME,
					VLegalDFRelPersistence.class.getName());
		}

		return _persistence;
	}

	public void setPersistence(VLegalDFRelPersistence persistence) {
		_persistence = persistence;
	}

	private static VLegalDFRelPersistence _persistence;
}