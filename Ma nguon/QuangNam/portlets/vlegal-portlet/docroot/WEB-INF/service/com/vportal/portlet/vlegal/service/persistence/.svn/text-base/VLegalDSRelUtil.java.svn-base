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

import com.vportal.portlet.vlegal.model.VLegalDSRel;

import java.util.List;

/**
 * The persistence utility for the v legal d s rel service. This utility wraps {@link VLegalDSRelPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
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
 * @see VLegalDSRelPersistence
 * @see VLegalDSRelPersistenceImpl
 * @generated
 */
public class VLegalDSRelUtil {
	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#clearCache()
	 */
	public static void clearCache() {
		getPersistence().clearCache();
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#clearCache(com.liferay.portal.model.BaseModel)
	 */
	public static void clearCache(VLegalDSRel vLegalDSRel) {
		getPersistence().clearCache(vLegalDSRel);
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
	public static List<VLegalDSRel> findWithDynamicQuery(
		DynamicQuery dynamicQuery) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<VLegalDSRel> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<VLegalDSRel> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#remove(com.liferay.portal.model.BaseModel)
	 */
	public static VLegalDSRel remove(VLegalDSRel vLegalDSRel)
		throws SystemException {
		return getPersistence().remove(vLegalDSRel);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, boolean)
	 */
	public static VLegalDSRel update(VLegalDSRel vLegalDSRel, boolean merge)
		throws SystemException {
		return getPersistence().update(vLegalDSRel, merge);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, boolean, ServiceContext)
	 */
	public static VLegalDSRel update(VLegalDSRel vLegalDSRel, boolean merge,
		ServiceContext serviceContext) throws SystemException {
		return getPersistence().update(vLegalDSRel, merge, serviceContext);
	}

	/**
	* Caches the v legal d s rel in the entity cache if it is enabled.
	*
	* @param vLegalDSRel the v legal d s rel to cache
	*/
	public static void cacheResult(
		com.vportal.portlet.vlegal.model.VLegalDSRel vLegalDSRel) {
		getPersistence().cacheResult(vLegalDSRel);
	}

	/**
	* Caches the v legal d s rels in the entity cache if it is enabled.
	*
	* @param vLegalDSRels the v legal d s rels to cache
	*/
	public static void cacheResult(
		java.util.List<com.vportal.portlet.vlegal.model.VLegalDSRel> vLegalDSRels) {
		getPersistence().cacheResult(vLegalDSRels);
	}

	/**
	* Creates a new v legal d s rel with the primary key. Does not add the v legal d s rel to the database.
	*
	* @param vLegalDSRelPK the primary key for the new v legal d s rel
	* @return the new v legal d s rel
	*/
	public static com.vportal.portlet.vlegal.model.VLegalDSRel create(
		VLegalDSRelPK vLegalDSRelPK) {
		return getPersistence().create(vLegalDSRelPK);
	}

	/**
	* Removes the v legal d s rel with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param vLegalDSRelPK the primary key of the v legal d s rel to remove
	* @return the v legal d s rel that was removed
	* @throws com.vportal.portlet.vlegal.NoSuchVLegalDSRelException if a v legal d s rel with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.vportal.portlet.vlegal.model.VLegalDSRel remove(
		VLegalDSRelPK vLegalDSRelPK)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vlegal.NoSuchVLegalDSRelException {
		return getPersistence().remove(vLegalDSRelPK);
	}

	public static com.vportal.portlet.vlegal.model.VLegalDSRel updateImpl(
		com.vportal.portlet.vlegal.model.VLegalDSRel vLegalDSRel, boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(vLegalDSRel, merge);
	}

	/**
	* Finds the v legal d s rel with the primary key or throws a {@link com.vportal.portlet.vlegal.NoSuchVLegalDSRelException} if it could not be found.
	*
	* @param vLegalDSRelPK the primary key of the v legal d s rel to find
	* @return the v legal d s rel
	* @throws com.vportal.portlet.vlegal.NoSuchVLegalDSRelException if a v legal d s rel with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.vportal.portlet.vlegal.model.VLegalDSRel findByPrimaryKey(
		VLegalDSRelPK vLegalDSRelPK)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vlegal.NoSuchVLegalDSRelException {
		return getPersistence().findByPrimaryKey(vLegalDSRelPK);
	}

	/**
	* Finds the v legal d s rel with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param vLegalDSRelPK the primary key of the v legal d s rel to find
	* @return the v legal d s rel, or <code>null</code> if a v legal d s rel with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.vportal.portlet.vlegal.model.VLegalDSRel fetchByPrimaryKey(
		VLegalDSRelPK vLegalDSRelPK)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(vLegalDSRelPK);
	}

	/**
	* Finds all the v legal d s rels where sigId = &#63;.
	*
	* @param sigId the sig id to search with
	* @return the matching v legal d s rels
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.vportal.portlet.vlegal.model.VLegalDSRel> findBySigner(
		java.lang.String sigId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findBySigner(sigId);
	}

	/**
	* Finds a range of all the v legal d s rels where sigId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param sigId the sig id to search with
	* @param start the lower bound of the range of v legal d s rels to return
	* @param end the upper bound of the range of v legal d s rels to return (not inclusive)
	* @return the range of matching v legal d s rels
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.vportal.portlet.vlegal.model.VLegalDSRel> findBySigner(
		java.lang.String sigId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findBySigner(sigId, start, end);
	}

	/**
	* Finds an ordered range of all the v legal d s rels where sigId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param sigId the sig id to search with
	* @param start the lower bound of the range of v legal d s rels to return
	* @param end the upper bound of the range of v legal d s rels to return (not inclusive)
	* @param orderByComparator the comparator to order the results by
	* @return the ordered range of matching v legal d s rels
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.vportal.portlet.vlegal.model.VLegalDSRel> findBySigner(
		java.lang.String sigId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findBySigner(sigId, start, end, orderByComparator);
	}

	/**
	* Finds the first v legal d s rel in the ordered set where sigId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param sigId the sig id to search with
	* @param orderByComparator the comparator to order the set by
	* @return the first matching v legal d s rel
	* @throws com.vportal.portlet.vlegal.NoSuchVLegalDSRelException if a matching v legal d s rel could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.vportal.portlet.vlegal.model.VLegalDSRel findBySigner_First(
		java.lang.String sigId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vlegal.NoSuchVLegalDSRelException {
		return getPersistence().findBySigner_First(sigId, orderByComparator);
	}

	/**
	* Finds the last v legal d s rel in the ordered set where sigId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param sigId the sig id to search with
	* @param orderByComparator the comparator to order the set by
	* @return the last matching v legal d s rel
	* @throws com.vportal.portlet.vlegal.NoSuchVLegalDSRelException if a matching v legal d s rel could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.vportal.portlet.vlegal.model.VLegalDSRel findBySigner_Last(
		java.lang.String sigId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vlegal.NoSuchVLegalDSRelException {
		return getPersistence().findBySigner_Last(sigId, orderByComparator);
	}

	/**
	* Finds the v legal d s rels before and after the current v legal d s rel in the ordered set where sigId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param vLegalDSRelPK the primary key of the current v legal d s rel
	* @param sigId the sig id to search with
	* @param orderByComparator the comparator to order the set by
	* @return the previous, current, and next v legal d s rel
	* @throws com.vportal.portlet.vlegal.NoSuchVLegalDSRelException if a v legal d s rel with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.vportal.portlet.vlegal.model.VLegalDSRel[] findBySigner_PrevAndNext(
		VLegalDSRelPK vLegalDSRelPK, java.lang.String sigId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vlegal.NoSuchVLegalDSRelException {
		return getPersistence()
				   .findBySigner_PrevAndNext(vLegalDSRelPK, sigId,
			orderByComparator);
	}

	/**
	* Finds all the v legal d s rels where docId = &#63;.
	*
	* @param docId the doc id to search with
	* @return the matching v legal d s rels
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.vportal.portlet.vlegal.model.VLegalDSRel> findByDoc(
		java.lang.String docId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByDoc(docId);
	}

	/**
	* Finds a range of all the v legal d s rels where docId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param docId the doc id to search with
	* @param start the lower bound of the range of v legal d s rels to return
	* @param end the upper bound of the range of v legal d s rels to return (not inclusive)
	* @return the range of matching v legal d s rels
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.vportal.portlet.vlegal.model.VLegalDSRel> findByDoc(
		java.lang.String docId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByDoc(docId, start, end);
	}

	/**
	* Finds an ordered range of all the v legal d s rels where docId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param docId the doc id to search with
	* @param start the lower bound of the range of v legal d s rels to return
	* @param end the upper bound of the range of v legal d s rels to return (not inclusive)
	* @param orderByComparator the comparator to order the results by
	* @return the ordered range of matching v legal d s rels
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.vportal.portlet.vlegal.model.VLegalDSRel> findByDoc(
		java.lang.String docId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByDoc(docId, start, end, orderByComparator);
	}

	/**
	* Finds the first v legal d s rel in the ordered set where docId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param docId the doc id to search with
	* @param orderByComparator the comparator to order the set by
	* @return the first matching v legal d s rel
	* @throws com.vportal.portlet.vlegal.NoSuchVLegalDSRelException if a matching v legal d s rel could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.vportal.portlet.vlegal.model.VLegalDSRel findByDoc_First(
		java.lang.String docId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vlegal.NoSuchVLegalDSRelException {
		return getPersistence().findByDoc_First(docId, orderByComparator);
	}

	/**
	* Finds the last v legal d s rel in the ordered set where docId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param docId the doc id to search with
	* @param orderByComparator the comparator to order the set by
	* @return the last matching v legal d s rel
	* @throws com.vportal.portlet.vlegal.NoSuchVLegalDSRelException if a matching v legal d s rel could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.vportal.portlet.vlegal.model.VLegalDSRel findByDoc_Last(
		java.lang.String docId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vlegal.NoSuchVLegalDSRelException {
		return getPersistence().findByDoc_Last(docId, orderByComparator);
	}

	/**
	* Finds the v legal d s rels before and after the current v legal d s rel in the ordered set where docId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param vLegalDSRelPK the primary key of the current v legal d s rel
	* @param docId the doc id to search with
	* @param orderByComparator the comparator to order the set by
	* @return the previous, current, and next v legal d s rel
	* @throws com.vportal.portlet.vlegal.NoSuchVLegalDSRelException if a v legal d s rel with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.vportal.portlet.vlegal.model.VLegalDSRel[] findByDoc_PrevAndNext(
		VLegalDSRelPK vLegalDSRelPK, java.lang.String docId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vlegal.NoSuchVLegalDSRelException {
		return getPersistence()
				   .findByDoc_PrevAndNext(vLegalDSRelPK, docId,
			orderByComparator);
	}

	/**
	* Finds all the v legal d s rels.
	*
	* @return the v legal d s rels
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.vportal.portlet.vlegal.model.VLegalDSRel> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
	}

	/**
	* Finds a range of all the v legal d s rels.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of v legal d s rels to return
	* @param end the upper bound of the range of v legal d s rels to return (not inclusive)
	* @return the range of v legal d s rels
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.vportal.portlet.vlegal.model.VLegalDSRel> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

	/**
	* Finds an ordered range of all the v legal d s rels.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of v legal d s rels to return
	* @param end the upper bound of the range of v legal d s rels to return (not inclusive)
	* @param orderByComparator the comparator to order the results by
	* @return the ordered range of v legal d s rels
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.vportal.portlet.vlegal.model.VLegalDSRel> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the v legal d s rels where sigId = &#63; from the database.
	*
	* @param sigId the sig id to search with
	* @throws SystemException if a system exception occurred
	*/
	public static void removeBySigner(java.lang.String sigId)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeBySigner(sigId);
	}

	/**
	* Removes all the v legal d s rels where docId = &#63; from the database.
	*
	* @param docId the doc id to search with
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByDoc(java.lang.String docId)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByDoc(docId);
	}

	/**
	* Removes all the v legal d s rels from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Counts all the v legal d s rels where sigId = &#63;.
	*
	* @param sigId the sig id to search with
	* @return the number of matching v legal d s rels
	* @throws SystemException if a system exception occurred
	*/
	public static int countBySigner(java.lang.String sigId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countBySigner(sigId);
	}

	/**
	* Counts all the v legal d s rels where docId = &#63;.
	*
	* @param docId the doc id to search with
	* @return the number of matching v legal d s rels
	* @throws SystemException if a system exception occurred
	*/
	public static int countByDoc(java.lang.String docId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByDoc(docId);
	}

	/**
	* Counts all the v legal d s rels.
	*
	* @return the number of v legal d s rels
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static VLegalDSRelPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (VLegalDSRelPersistence)PortletBeanLocatorUtil.locate(com.vportal.portlet.vlegal.service.ClpSerializer.SERVLET_CONTEXT_NAME,
					VLegalDSRelPersistence.class.getName());
		}

		return _persistence;
	}

	public void setPersistence(VLegalDSRelPersistence persistence) {
		_persistence = persistence;
	}

	private static VLegalDSRelPersistence _persistence;
}