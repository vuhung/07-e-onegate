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

import com.vportal.portlet.vlegal.model.VLegalFTRel;

import java.util.List;

/**
 * The persistence utility for the v legal f t rel service. This utility wraps {@link VLegalFTRelPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
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
 * @see VLegalFTRelPersistence
 * @see VLegalFTRelPersistenceImpl
 * @generated
 */
public class VLegalFTRelUtil {
	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#clearCache()
	 */
	public static void clearCache() {
		getPersistence().clearCache();
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#clearCache(com.liferay.portal.model.BaseModel)
	 */
	public static void clearCache(VLegalFTRel vLegalFTRel) {
		getPersistence().clearCache(vLegalFTRel);
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
	public static List<VLegalFTRel> findWithDynamicQuery(
		DynamicQuery dynamicQuery) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<VLegalFTRel> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<VLegalFTRel> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#remove(com.liferay.portal.model.BaseModel)
	 */
	public static VLegalFTRel remove(VLegalFTRel vLegalFTRel)
		throws SystemException {
		return getPersistence().remove(vLegalFTRel);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, boolean)
	 */
	public static VLegalFTRel update(VLegalFTRel vLegalFTRel, boolean merge)
		throws SystemException {
		return getPersistence().update(vLegalFTRel, merge);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, boolean, ServiceContext)
	 */
	public static VLegalFTRel update(VLegalFTRel vLegalFTRel, boolean merge,
		ServiceContext serviceContext) throws SystemException {
		return getPersistence().update(vLegalFTRel, merge, serviceContext);
	}

	/**
	* Caches the v legal f t rel in the entity cache if it is enabled.
	*
	* @param vLegalFTRel the v legal f t rel to cache
	*/
	public static void cacheResult(
		com.vportal.portlet.vlegal.model.VLegalFTRel vLegalFTRel) {
		getPersistence().cacheResult(vLegalFTRel);
	}

	/**
	* Caches the v legal f t rels in the entity cache if it is enabled.
	*
	* @param vLegalFTRels the v legal f t rels to cache
	*/
	public static void cacheResult(
		java.util.List<com.vportal.portlet.vlegal.model.VLegalFTRel> vLegalFTRels) {
		getPersistence().cacheResult(vLegalFTRels);
	}

	/**
	* Creates a new v legal f t rel with the primary key. Does not add the v legal f t rel to the database.
	*
	* @param vLegalFTRelPK the primary key for the new v legal f t rel
	* @return the new v legal f t rel
	*/
	public static com.vportal.portlet.vlegal.model.VLegalFTRel create(
		VLegalFTRelPK vLegalFTRelPK) {
		return getPersistence().create(vLegalFTRelPK);
	}

	/**
	* Removes the v legal f t rel with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param vLegalFTRelPK the primary key of the v legal f t rel to remove
	* @return the v legal f t rel that was removed
	* @throws com.vportal.portlet.vlegal.NoSuchVLegalFTRelException if a v legal f t rel with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.vportal.portlet.vlegal.model.VLegalFTRel remove(
		VLegalFTRelPK vLegalFTRelPK)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vlegal.NoSuchVLegalFTRelException {
		return getPersistence().remove(vLegalFTRelPK);
	}

	public static com.vportal.portlet.vlegal.model.VLegalFTRel updateImpl(
		com.vportal.portlet.vlegal.model.VLegalFTRel vLegalFTRel, boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(vLegalFTRel, merge);
	}

	/**
	* Finds the v legal f t rel with the primary key or throws a {@link com.vportal.portlet.vlegal.NoSuchVLegalFTRelException} if it could not be found.
	*
	* @param vLegalFTRelPK the primary key of the v legal f t rel to find
	* @return the v legal f t rel
	* @throws com.vportal.portlet.vlegal.NoSuchVLegalFTRelException if a v legal f t rel with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.vportal.portlet.vlegal.model.VLegalFTRel findByPrimaryKey(
		VLegalFTRelPK vLegalFTRelPK)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vlegal.NoSuchVLegalFTRelException {
		return getPersistence().findByPrimaryKey(vLegalFTRelPK);
	}

	/**
	* Finds the v legal f t rel with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param vLegalFTRelPK the primary key of the v legal f t rel to find
	* @return the v legal f t rel, or <code>null</code> if a v legal f t rel with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.vportal.portlet.vlegal.model.VLegalFTRel fetchByPrimaryKey(
		VLegalFTRelPK vLegalFTRelPK)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(vLegalFTRelPK);
	}

	/**
	* Finds all the v legal f t rels where fieldId = &#63;.
	*
	* @param fieldId the field id to search with
	* @return the matching v legal f t rels
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.vportal.portlet.vlegal.model.VLegalFTRel> findByField(
		java.lang.String fieldId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByField(fieldId);
	}

	/**
	* Finds a range of all the v legal f t rels where fieldId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param fieldId the field id to search with
	* @param start the lower bound of the range of v legal f t rels to return
	* @param end the upper bound of the range of v legal f t rels to return (not inclusive)
	* @return the range of matching v legal f t rels
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.vportal.portlet.vlegal.model.VLegalFTRel> findByField(
		java.lang.String fieldId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByField(fieldId, start, end);
	}

	/**
	* Finds an ordered range of all the v legal f t rels where fieldId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param fieldId the field id to search with
	* @param start the lower bound of the range of v legal f t rels to return
	* @param end the upper bound of the range of v legal f t rels to return (not inclusive)
	* @param orderByComparator the comparator to order the results by
	* @return the ordered range of matching v legal f t rels
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.vportal.portlet.vlegal.model.VLegalFTRel> findByField(
		java.lang.String fieldId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByField(fieldId, start, end, orderByComparator);
	}

	/**
	* Finds the first v legal f t rel in the ordered set where fieldId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param fieldId the field id to search with
	* @param orderByComparator the comparator to order the set by
	* @return the first matching v legal f t rel
	* @throws com.vportal.portlet.vlegal.NoSuchVLegalFTRelException if a matching v legal f t rel could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.vportal.portlet.vlegal.model.VLegalFTRel findByField_First(
		java.lang.String fieldId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vlegal.NoSuchVLegalFTRelException {
		return getPersistence().findByField_First(fieldId, orderByComparator);
	}

	/**
	* Finds the last v legal f t rel in the ordered set where fieldId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param fieldId the field id to search with
	* @param orderByComparator the comparator to order the set by
	* @return the last matching v legal f t rel
	* @throws com.vportal.portlet.vlegal.NoSuchVLegalFTRelException if a matching v legal f t rel could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.vportal.portlet.vlegal.model.VLegalFTRel findByField_Last(
		java.lang.String fieldId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vlegal.NoSuchVLegalFTRelException {
		return getPersistence().findByField_Last(fieldId, orderByComparator);
	}

	/**
	* Finds the v legal f t rels before and after the current v legal f t rel in the ordered set where fieldId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param vLegalFTRelPK the primary key of the current v legal f t rel
	* @param fieldId the field id to search with
	* @param orderByComparator the comparator to order the set by
	* @return the previous, current, and next v legal f t rel
	* @throws com.vportal.portlet.vlegal.NoSuchVLegalFTRelException if a v legal f t rel with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.vportal.portlet.vlegal.model.VLegalFTRel[] findByField_PrevAndNext(
		VLegalFTRelPK vLegalFTRelPK, java.lang.String fieldId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vlegal.NoSuchVLegalFTRelException {
		return getPersistence()
				   .findByField_PrevAndNext(vLegalFTRelPK, fieldId,
			orderByComparator);
	}

	/**
	* Finds all the v legal f t rels where typeId = &#63;.
	*
	* @param typeId the type id to search with
	* @return the matching v legal f t rels
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.vportal.portlet.vlegal.model.VLegalFTRel> findByType(
		java.lang.String typeId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByType(typeId);
	}

	/**
	* Finds a range of all the v legal f t rels where typeId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param typeId the type id to search with
	* @param start the lower bound of the range of v legal f t rels to return
	* @param end the upper bound of the range of v legal f t rels to return (not inclusive)
	* @return the range of matching v legal f t rels
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.vportal.portlet.vlegal.model.VLegalFTRel> findByType(
		java.lang.String typeId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByType(typeId, start, end);
	}

	/**
	* Finds an ordered range of all the v legal f t rels where typeId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param typeId the type id to search with
	* @param start the lower bound of the range of v legal f t rels to return
	* @param end the upper bound of the range of v legal f t rels to return (not inclusive)
	* @param orderByComparator the comparator to order the results by
	* @return the ordered range of matching v legal f t rels
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.vportal.portlet.vlegal.model.VLegalFTRel> findByType(
		java.lang.String typeId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByType(typeId, start, end, orderByComparator);
	}

	/**
	* Finds the first v legal f t rel in the ordered set where typeId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param typeId the type id to search with
	* @param orderByComparator the comparator to order the set by
	* @return the first matching v legal f t rel
	* @throws com.vportal.portlet.vlegal.NoSuchVLegalFTRelException if a matching v legal f t rel could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.vportal.portlet.vlegal.model.VLegalFTRel findByType_First(
		java.lang.String typeId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vlegal.NoSuchVLegalFTRelException {
		return getPersistence().findByType_First(typeId, orderByComparator);
	}

	/**
	* Finds the last v legal f t rel in the ordered set where typeId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param typeId the type id to search with
	* @param orderByComparator the comparator to order the set by
	* @return the last matching v legal f t rel
	* @throws com.vportal.portlet.vlegal.NoSuchVLegalFTRelException if a matching v legal f t rel could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.vportal.portlet.vlegal.model.VLegalFTRel findByType_Last(
		java.lang.String typeId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vlegal.NoSuchVLegalFTRelException {
		return getPersistence().findByType_Last(typeId, orderByComparator);
	}

	/**
	* Finds the v legal f t rels before and after the current v legal f t rel in the ordered set where typeId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param vLegalFTRelPK the primary key of the current v legal f t rel
	* @param typeId the type id to search with
	* @param orderByComparator the comparator to order the set by
	* @return the previous, current, and next v legal f t rel
	* @throws com.vportal.portlet.vlegal.NoSuchVLegalFTRelException if a v legal f t rel with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.vportal.portlet.vlegal.model.VLegalFTRel[] findByType_PrevAndNext(
		VLegalFTRelPK vLegalFTRelPK, java.lang.String typeId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vlegal.NoSuchVLegalFTRelException {
		return getPersistence()
				   .findByType_PrevAndNext(vLegalFTRelPK, typeId,
			orderByComparator);
	}

	/**
	* Finds all the v legal f t rels.
	*
	* @return the v legal f t rels
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.vportal.portlet.vlegal.model.VLegalFTRel> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
	}

	/**
	* Finds a range of all the v legal f t rels.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of v legal f t rels to return
	* @param end the upper bound of the range of v legal f t rels to return (not inclusive)
	* @return the range of v legal f t rels
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.vportal.portlet.vlegal.model.VLegalFTRel> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

	/**
	* Finds an ordered range of all the v legal f t rels.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of v legal f t rels to return
	* @param end the upper bound of the range of v legal f t rels to return (not inclusive)
	* @param orderByComparator the comparator to order the results by
	* @return the ordered range of v legal f t rels
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.vportal.portlet.vlegal.model.VLegalFTRel> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the v legal f t rels where fieldId = &#63; from the database.
	*
	* @param fieldId the field id to search with
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByField(java.lang.String fieldId)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByField(fieldId);
	}

	/**
	* Removes all the v legal f t rels where typeId = &#63; from the database.
	*
	* @param typeId the type id to search with
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByType(java.lang.String typeId)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByType(typeId);
	}

	/**
	* Removes all the v legal f t rels from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Counts all the v legal f t rels where fieldId = &#63;.
	*
	* @param fieldId the field id to search with
	* @return the number of matching v legal f t rels
	* @throws SystemException if a system exception occurred
	*/
	public static int countByField(java.lang.String fieldId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByField(fieldId);
	}

	/**
	* Counts all the v legal f t rels where typeId = &#63;.
	*
	* @param typeId the type id to search with
	* @return the number of matching v legal f t rels
	* @throws SystemException if a system exception occurred
	*/
	public static int countByType(java.lang.String typeId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByType(typeId);
	}

	/**
	* Counts all the v legal f t rels.
	*
	* @return the number of v legal f t rels
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static VLegalFTRelPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (VLegalFTRelPersistence)PortletBeanLocatorUtil.locate(com.vportal.portlet.vlegal.service.ClpSerializer.SERVLET_CONTEXT_NAME,
					VLegalFTRelPersistence.class.getName());
		}

		return _persistence;
	}

	public void setPersistence(VLegalFTRelPersistence persistence) {
		_persistence = persistence;
	}

	private static VLegalFTRelPersistence _persistence;
}