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

import com.vportal.portlet.vlegal.model.VLegalTDRel;

import java.util.List;

/**
 * The persistence utility for the v legal t d rel service. This utility wraps {@link VLegalTDRelPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
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
 * @see VLegalTDRelPersistence
 * @see VLegalTDRelPersistenceImpl
 * @generated
 */
public class VLegalTDRelUtil {
	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#clearCache()
	 */
	public static void clearCache() {
		getPersistence().clearCache();
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#clearCache(com.liferay.portal.model.BaseModel)
	 */
	public static void clearCache(VLegalTDRel vLegalTDRel) {
		getPersistence().clearCache(vLegalTDRel);
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
	public static List<VLegalTDRel> findWithDynamicQuery(
		DynamicQuery dynamicQuery) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<VLegalTDRel> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<VLegalTDRel> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#remove(com.liferay.portal.model.BaseModel)
	 */
	public static VLegalTDRel remove(VLegalTDRel vLegalTDRel)
		throws SystemException {
		return getPersistence().remove(vLegalTDRel);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, boolean)
	 */
	public static VLegalTDRel update(VLegalTDRel vLegalTDRel, boolean merge)
		throws SystemException {
		return getPersistence().update(vLegalTDRel, merge);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, boolean, ServiceContext)
	 */
	public static VLegalTDRel update(VLegalTDRel vLegalTDRel, boolean merge,
		ServiceContext serviceContext) throws SystemException {
		return getPersistence().update(vLegalTDRel, merge, serviceContext);
	}

	/**
	* Caches the v legal t d rel in the entity cache if it is enabled.
	*
	* @param vLegalTDRel the v legal t d rel to cache
	*/
	public static void cacheResult(
		com.vportal.portlet.vlegal.model.VLegalTDRel vLegalTDRel) {
		getPersistence().cacheResult(vLegalTDRel);
	}

	/**
	* Caches the v legal t d rels in the entity cache if it is enabled.
	*
	* @param vLegalTDRels the v legal t d rels to cache
	*/
	public static void cacheResult(
		java.util.List<com.vportal.portlet.vlegal.model.VLegalTDRel> vLegalTDRels) {
		getPersistence().cacheResult(vLegalTDRels);
	}

	/**
	* Creates a new v legal t d rel with the primary key. Does not add the v legal t d rel to the database.
	*
	* @param vLegalTDRelPK the primary key for the new v legal t d rel
	* @return the new v legal t d rel
	*/
	public static com.vportal.portlet.vlegal.model.VLegalTDRel create(
		VLegalTDRelPK vLegalTDRelPK) {
		return getPersistence().create(vLegalTDRelPK);
	}

	/**
	* Removes the v legal t d rel with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param vLegalTDRelPK the primary key of the v legal t d rel to remove
	* @return the v legal t d rel that was removed
	* @throws com.vportal.portlet.vlegal.NoSuchVLegalTDRelException if a v legal t d rel with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.vportal.portlet.vlegal.model.VLegalTDRel remove(
		VLegalTDRelPK vLegalTDRelPK)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vlegal.NoSuchVLegalTDRelException {
		return getPersistence().remove(vLegalTDRelPK);
	}

	public static com.vportal.portlet.vlegal.model.VLegalTDRel updateImpl(
		com.vportal.portlet.vlegal.model.VLegalTDRel vLegalTDRel, boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(vLegalTDRel, merge);
	}

	/**
	* Finds the v legal t d rel with the primary key or throws a {@link com.vportal.portlet.vlegal.NoSuchVLegalTDRelException} if it could not be found.
	*
	* @param vLegalTDRelPK the primary key of the v legal t d rel to find
	* @return the v legal t d rel
	* @throws com.vportal.portlet.vlegal.NoSuchVLegalTDRelException if a v legal t d rel with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.vportal.portlet.vlegal.model.VLegalTDRel findByPrimaryKey(
		VLegalTDRelPK vLegalTDRelPK)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vlegal.NoSuchVLegalTDRelException {
		return getPersistence().findByPrimaryKey(vLegalTDRelPK);
	}

	/**
	* Finds the v legal t d rel with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param vLegalTDRelPK the primary key of the v legal t d rel to find
	* @return the v legal t d rel, or <code>null</code> if a v legal t d rel with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.vportal.portlet.vlegal.model.VLegalTDRel fetchByPrimaryKey(
		VLegalTDRelPK vLegalTDRelPK)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(vLegalTDRelPK);
	}

	/**
	* Finds all the v legal t d rels where docId = &#63;.
	*
	* @param docId the doc id to search with
	* @return the matching v legal t d rels
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.vportal.portlet.vlegal.model.VLegalTDRel> findByDocument(
		java.lang.String docId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByDocument(docId);
	}

	/**
	* Finds a range of all the v legal t d rels where docId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param docId the doc id to search with
	* @param start the lower bound of the range of v legal t d rels to return
	* @param end the upper bound of the range of v legal t d rels to return (not inclusive)
	* @return the range of matching v legal t d rels
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.vportal.portlet.vlegal.model.VLegalTDRel> findByDocument(
		java.lang.String docId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByDocument(docId, start, end);
	}

	/**
	* Finds an ordered range of all the v legal t d rels where docId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param docId the doc id to search with
	* @param start the lower bound of the range of v legal t d rels to return
	* @param end the upper bound of the range of v legal t d rels to return (not inclusive)
	* @param orderByComparator the comparator to order the results by
	* @return the ordered range of matching v legal t d rels
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.vportal.portlet.vlegal.model.VLegalTDRel> findByDocument(
		java.lang.String docId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByDocument(docId, start, end, orderByComparator);
	}

	/**
	* Finds the first v legal t d rel in the ordered set where docId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param docId the doc id to search with
	* @param orderByComparator the comparator to order the set by
	* @return the first matching v legal t d rel
	* @throws com.vportal.portlet.vlegal.NoSuchVLegalTDRelException if a matching v legal t d rel could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.vportal.portlet.vlegal.model.VLegalTDRel findByDocument_First(
		java.lang.String docId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vlegal.NoSuchVLegalTDRelException {
		return getPersistence().findByDocument_First(docId, orderByComparator);
	}

	/**
	* Finds the last v legal t d rel in the ordered set where docId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param docId the doc id to search with
	* @param orderByComparator the comparator to order the set by
	* @return the last matching v legal t d rel
	* @throws com.vportal.portlet.vlegal.NoSuchVLegalTDRelException if a matching v legal t d rel could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.vportal.portlet.vlegal.model.VLegalTDRel findByDocument_Last(
		java.lang.String docId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vlegal.NoSuchVLegalTDRelException {
		return getPersistence().findByDocument_Last(docId, orderByComparator);
	}

	/**
	* Finds the v legal t d rels before and after the current v legal t d rel in the ordered set where docId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param vLegalTDRelPK the primary key of the current v legal t d rel
	* @param docId the doc id to search with
	* @param orderByComparator the comparator to order the set by
	* @return the previous, current, and next v legal t d rel
	* @throws com.vportal.portlet.vlegal.NoSuchVLegalTDRelException if a v legal t d rel with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.vportal.portlet.vlegal.model.VLegalTDRel[] findByDocument_PrevAndNext(
		VLegalTDRelPK vLegalTDRelPK, java.lang.String docId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vlegal.NoSuchVLegalTDRelException {
		return getPersistence()
				   .findByDocument_PrevAndNext(vLegalTDRelPK, docId,
			orderByComparator);
	}

	/**
	* Finds all the v legal t d rels where tagId = &#63;.
	*
	* @param tagId the tag id to search with
	* @return the matching v legal t d rels
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.vportal.portlet.vlegal.model.VLegalTDRel> findByTag(
		java.lang.String tagId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByTag(tagId);
	}

	/**
	* Finds a range of all the v legal t d rels where tagId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param tagId the tag id to search with
	* @param start the lower bound of the range of v legal t d rels to return
	* @param end the upper bound of the range of v legal t d rels to return (not inclusive)
	* @return the range of matching v legal t d rels
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.vportal.portlet.vlegal.model.VLegalTDRel> findByTag(
		java.lang.String tagId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByTag(tagId, start, end);
	}

	/**
	* Finds an ordered range of all the v legal t d rels where tagId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param tagId the tag id to search with
	* @param start the lower bound of the range of v legal t d rels to return
	* @param end the upper bound of the range of v legal t d rels to return (not inclusive)
	* @param orderByComparator the comparator to order the results by
	* @return the ordered range of matching v legal t d rels
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.vportal.portlet.vlegal.model.VLegalTDRel> findByTag(
		java.lang.String tagId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByTag(tagId, start, end, orderByComparator);
	}

	/**
	* Finds the first v legal t d rel in the ordered set where tagId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param tagId the tag id to search with
	* @param orderByComparator the comparator to order the set by
	* @return the first matching v legal t d rel
	* @throws com.vportal.portlet.vlegal.NoSuchVLegalTDRelException if a matching v legal t d rel could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.vportal.portlet.vlegal.model.VLegalTDRel findByTag_First(
		java.lang.String tagId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vlegal.NoSuchVLegalTDRelException {
		return getPersistence().findByTag_First(tagId, orderByComparator);
	}

	/**
	* Finds the last v legal t d rel in the ordered set where tagId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param tagId the tag id to search with
	* @param orderByComparator the comparator to order the set by
	* @return the last matching v legal t d rel
	* @throws com.vportal.portlet.vlegal.NoSuchVLegalTDRelException if a matching v legal t d rel could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.vportal.portlet.vlegal.model.VLegalTDRel findByTag_Last(
		java.lang.String tagId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vlegal.NoSuchVLegalTDRelException {
		return getPersistence().findByTag_Last(tagId, orderByComparator);
	}

	/**
	* Finds the v legal t d rels before and after the current v legal t d rel in the ordered set where tagId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param vLegalTDRelPK the primary key of the current v legal t d rel
	* @param tagId the tag id to search with
	* @param orderByComparator the comparator to order the set by
	* @return the previous, current, and next v legal t d rel
	* @throws com.vportal.portlet.vlegal.NoSuchVLegalTDRelException if a v legal t d rel with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.vportal.portlet.vlegal.model.VLegalTDRel[] findByTag_PrevAndNext(
		VLegalTDRelPK vLegalTDRelPK, java.lang.String tagId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vlegal.NoSuchVLegalTDRelException {
		return getPersistence()
				   .findByTag_PrevAndNext(vLegalTDRelPK, tagId,
			orderByComparator);
	}

	/**
	* Finds all the v legal t d rels.
	*
	* @return the v legal t d rels
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.vportal.portlet.vlegal.model.VLegalTDRel> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
	}

	/**
	* Finds a range of all the v legal t d rels.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of v legal t d rels to return
	* @param end the upper bound of the range of v legal t d rels to return (not inclusive)
	* @return the range of v legal t d rels
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.vportal.portlet.vlegal.model.VLegalTDRel> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

	/**
	* Finds an ordered range of all the v legal t d rels.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of v legal t d rels to return
	* @param end the upper bound of the range of v legal t d rels to return (not inclusive)
	* @param orderByComparator the comparator to order the results by
	* @return the ordered range of v legal t d rels
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.vportal.portlet.vlegal.model.VLegalTDRel> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the v legal t d rels where docId = &#63; from the database.
	*
	* @param docId the doc id to search with
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByDocument(java.lang.String docId)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByDocument(docId);
	}

	/**
	* Removes all the v legal t d rels where tagId = &#63; from the database.
	*
	* @param tagId the tag id to search with
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByTag(java.lang.String tagId)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByTag(tagId);
	}

	/**
	* Removes all the v legal t d rels from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Counts all the v legal t d rels where docId = &#63;.
	*
	* @param docId the doc id to search with
	* @return the number of matching v legal t d rels
	* @throws SystemException if a system exception occurred
	*/
	public static int countByDocument(java.lang.String docId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByDocument(docId);
	}

	/**
	* Counts all the v legal t d rels where tagId = &#63;.
	*
	* @param tagId the tag id to search with
	* @return the number of matching v legal t d rels
	* @throws SystemException if a system exception occurred
	*/
	public static int countByTag(java.lang.String tagId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByTag(tagId);
	}

	/**
	* Counts all the v legal t d rels.
	*
	* @return the number of v legal t d rels
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static VLegalTDRelPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (VLegalTDRelPersistence)PortletBeanLocatorUtil.locate(com.vportal.portlet.vlegal.service.ClpSerializer.SERVLET_CONTEXT_NAME,
					VLegalTDRelPersistence.class.getName());
		}

		return _persistence;
	}

	public void setPersistence(VLegalTDRelPersistence persistence) {
		_persistence = persistence;
	}

	private static VLegalTDRelPersistence _persistence;
}