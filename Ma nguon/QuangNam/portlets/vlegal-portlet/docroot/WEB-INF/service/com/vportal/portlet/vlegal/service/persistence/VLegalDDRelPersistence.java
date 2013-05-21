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

import com.liferay.portal.service.persistence.BasePersistence;

import com.vportal.portlet.vlegal.model.VLegalDDRel;

/**
 * The persistence interface for the v legal d d rel service.
 *
 * <p>
 * Never modify or reference this interface directly. Always use {@link VLegalDDRelUtil} to access the v legal d d rel persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
 * </p>
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author ACB
 * @see VLegalDDRelPersistenceImpl
 * @see VLegalDDRelUtil
 * @generated
 */
public interface VLegalDDRelPersistence extends BasePersistence<VLegalDDRel> {
	/**
	* Caches the v legal d d rel in the entity cache if it is enabled.
	*
	* @param vLegalDDRel the v legal d d rel to cache
	*/
	public void cacheResult(
		com.vportal.portlet.vlegal.model.VLegalDDRel vLegalDDRel);

	/**
	* Caches the v legal d d rels in the entity cache if it is enabled.
	*
	* @param vLegalDDRels the v legal d d rels to cache
	*/
	public void cacheResult(
		java.util.List<com.vportal.portlet.vlegal.model.VLegalDDRel> vLegalDDRels);

	/**
	* Creates a new v legal d d rel with the primary key. Does not add the v legal d d rel to the database.
	*
	* @param vLegalDDRelPK the primary key for the new v legal d d rel
	* @return the new v legal d d rel
	*/
	public com.vportal.portlet.vlegal.model.VLegalDDRel create(
		VLegalDDRelPK vLegalDDRelPK);

	/**
	* Removes the v legal d d rel with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param vLegalDDRelPK the primary key of the v legal d d rel to remove
	* @return the v legal d d rel that was removed
	* @throws com.vportal.portlet.vlegal.NoSuchVLegalDDRelException if a v legal d d rel with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.vportal.portlet.vlegal.model.VLegalDDRel remove(
		VLegalDDRelPK vLegalDDRelPK)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vlegal.NoSuchVLegalDDRelException;

	public com.vportal.portlet.vlegal.model.VLegalDDRel updateImpl(
		com.vportal.portlet.vlegal.model.VLegalDDRel vLegalDDRel, boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Finds the v legal d d rel with the primary key or throws a {@link com.vportal.portlet.vlegal.NoSuchVLegalDDRelException} if it could not be found.
	*
	* @param vLegalDDRelPK the primary key of the v legal d d rel to find
	* @return the v legal d d rel
	* @throws com.vportal.portlet.vlegal.NoSuchVLegalDDRelException if a v legal d d rel with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.vportal.portlet.vlegal.model.VLegalDDRel findByPrimaryKey(
		VLegalDDRelPK vLegalDDRelPK)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vlegal.NoSuchVLegalDDRelException;

	/**
	* Finds the v legal d d rel with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param vLegalDDRelPK the primary key of the v legal d d rel to find
	* @return the v legal d d rel, or <code>null</code> if a v legal d d rel with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.vportal.portlet.vlegal.model.VLegalDDRel fetchByPrimaryKey(
		VLegalDDRelPK vLegalDDRelPK)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Finds all the v legal d d rels where departmentId = &#63;.
	*
	* @param departmentId the department id to search with
	* @return the matching v legal d d rels
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.vportal.portlet.vlegal.model.VLegalDDRel> findByDepartament(
		long departmentId)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.vportal.portlet.vlegal.model.VLegalDDRel> findByDepartament(
		long departmentId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.vportal.portlet.vlegal.model.VLegalDDRel> findByDepartament(
		long departmentId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public com.vportal.portlet.vlegal.model.VLegalDDRel findByDepartament_First(
		long departmentId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vlegal.NoSuchVLegalDDRelException;

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
	public com.vportal.portlet.vlegal.model.VLegalDDRel findByDepartament_Last(
		long departmentId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vlegal.NoSuchVLegalDDRelException;

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
	public com.vportal.portlet.vlegal.model.VLegalDDRel[] findByDepartament_PrevAndNext(
		VLegalDDRelPK vLegalDDRelPK, long departmentId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vlegal.NoSuchVLegalDDRelException;

	/**
	* Finds all the v legal d d rels where docId = &#63;.
	*
	* @param docId the doc id to search with
	* @return the matching v legal d d rels
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.vportal.portlet.vlegal.model.VLegalDDRel> findByDoc(
		java.lang.String docId)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.vportal.portlet.vlegal.model.VLegalDDRel> findByDoc(
		java.lang.String docId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.vportal.portlet.vlegal.model.VLegalDDRel> findByDoc(
		java.lang.String docId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public com.vportal.portlet.vlegal.model.VLegalDDRel findByDoc_First(
		java.lang.String docId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vlegal.NoSuchVLegalDDRelException;

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
	public com.vportal.portlet.vlegal.model.VLegalDDRel findByDoc_Last(
		java.lang.String docId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vlegal.NoSuchVLegalDDRelException;

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
	public com.vportal.portlet.vlegal.model.VLegalDDRel[] findByDoc_PrevAndNext(
		VLegalDDRelPK vLegalDDRelPK, java.lang.String docId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vlegal.NoSuchVLegalDDRelException;

	/**
	* Finds all the v legal d d rels.
	*
	* @return the v legal d d rels
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.vportal.portlet.vlegal.model.VLegalDDRel> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.vportal.portlet.vlegal.model.VLegalDDRel> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.vportal.portlet.vlegal.model.VLegalDDRel> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the v legal d d rels where departmentId = &#63; from the database.
	*
	* @param departmentId the department id to search with
	* @throws SystemException if a system exception occurred
	*/
	public void removeByDepartament(long departmentId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the v legal d d rels where docId = &#63; from the database.
	*
	* @param docId the doc id to search with
	* @throws SystemException if a system exception occurred
	*/
	public void removeByDoc(java.lang.String docId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the v legal d d rels from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Counts all the v legal d d rels where departmentId = &#63;.
	*
	* @param departmentId the department id to search with
	* @return the number of matching v legal d d rels
	* @throws SystemException if a system exception occurred
	*/
	public int countByDepartament(long departmentId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Counts all the v legal d d rels where docId = &#63;.
	*
	* @param docId the doc id to search with
	* @return the number of matching v legal d d rels
	* @throws SystemException if a system exception occurred
	*/
	public int countByDoc(java.lang.String docId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Counts all the v legal d d rels.
	*
	* @return the number of v legal d d rels
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}