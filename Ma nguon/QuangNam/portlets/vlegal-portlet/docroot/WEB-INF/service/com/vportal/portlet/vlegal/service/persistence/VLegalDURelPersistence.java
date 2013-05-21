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

import com.vportal.portlet.vlegal.model.VLegalDURel;

/**
 * The persistence interface for the v legal d u rel service.
 *
 * <p>
 * Never modify or reference this interface directly. Always use {@link VLegalDURelUtil} to access the v legal d u rel persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
 * </p>
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author ACB
 * @see VLegalDURelPersistenceImpl
 * @see VLegalDURelUtil
 * @generated
 */
public interface VLegalDURelPersistence extends BasePersistence<VLegalDURel> {
	/**
	* Caches the v legal d u rel in the entity cache if it is enabled.
	*
	* @param vLegalDURel the v legal d u rel to cache
	*/
	public void cacheResult(
		com.vportal.portlet.vlegal.model.VLegalDURel vLegalDURel);

	/**
	* Caches the v legal d u rels in the entity cache if it is enabled.
	*
	* @param vLegalDURels the v legal d u rels to cache
	*/
	public void cacheResult(
		java.util.List<com.vportal.portlet.vlegal.model.VLegalDURel> vLegalDURels);

	/**
	* Creates a new v legal d u rel with the primary key. Does not add the v legal d u rel to the database.
	*
	* @param vLegalDURelPK the primary key for the new v legal d u rel
	* @return the new v legal d u rel
	*/
	public com.vportal.portlet.vlegal.model.VLegalDURel create(
		VLegalDURelPK vLegalDURelPK);

	/**
	* Removes the v legal d u rel with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param vLegalDURelPK the primary key of the v legal d u rel to remove
	* @return the v legal d u rel that was removed
	* @throws com.vportal.portlet.vlegal.NoSuchVLegalDURelException if a v legal d u rel with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.vportal.portlet.vlegal.model.VLegalDURel remove(
		VLegalDURelPK vLegalDURelPK)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vlegal.NoSuchVLegalDURelException;

	public com.vportal.portlet.vlegal.model.VLegalDURel updateImpl(
		com.vportal.portlet.vlegal.model.VLegalDURel vLegalDURel, boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Finds the v legal d u rel with the primary key or throws a {@link com.vportal.portlet.vlegal.NoSuchVLegalDURelException} if it could not be found.
	*
	* @param vLegalDURelPK the primary key of the v legal d u rel to find
	* @return the v legal d u rel
	* @throws com.vportal.portlet.vlegal.NoSuchVLegalDURelException if a v legal d u rel with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.vportal.portlet.vlegal.model.VLegalDURel findByPrimaryKey(
		VLegalDURelPK vLegalDURelPK)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vlegal.NoSuchVLegalDURelException;

	/**
	* Finds the v legal d u rel with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param vLegalDURelPK the primary key of the v legal d u rel to find
	* @return the v legal d u rel, or <code>null</code> if a v legal d u rel with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.vportal.portlet.vlegal.model.VLegalDURel fetchByPrimaryKey(
		VLegalDURelPK vLegalDURelPK)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Finds all the v legal d u rels where departmentId = &#63;.
	*
	* @param departmentId the department id to search with
	* @return the matching v legal d u rels
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.vportal.portlet.vlegal.model.VLegalDURel> findByDepartament(
		long departmentId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Finds a range of all the v legal d u rels where departmentId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param departmentId the department id to search with
	* @param start the lower bound of the range of v legal d u rels to return
	* @param end the upper bound of the range of v legal d u rels to return (not inclusive)
	* @return the range of matching v legal d u rels
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.vportal.portlet.vlegal.model.VLegalDURel> findByDepartament(
		long departmentId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Finds an ordered range of all the v legal d u rels where departmentId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param departmentId the department id to search with
	* @param start the lower bound of the range of v legal d u rels to return
	* @param end the upper bound of the range of v legal d u rels to return (not inclusive)
	* @param orderByComparator the comparator to order the results by
	* @return the ordered range of matching v legal d u rels
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.vportal.portlet.vlegal.model.VLegalDURel> findByDepartament(
		long departmentId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Finds the first v legal d u rel in the ordered set where departmentId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param departmentId the department id to search with
	* @param orderByComparator the comparator to order the set by
	* @return the first matching v legal d u rel
	* @throws com.vportal.portlet.vlegal.NoSuchVLegalDURelException if a matching v legal d u rel could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.vportal.portlet.vlegal.model.VLegalDURel findByDepartament_First(
		long departmentId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vlegal.NoSuchVLegalDURelException;

	/**
	* Finds the last v legal d u rel in the ordered set where departmentId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param departmentId the department id to search with
	* @param orderByComparator the comparator to order the set by
	* @return the last matching v legal d u rel
	* @throws com.vportal.portlet.vlegal.NoSuchVLegalDURelException if a matching v legal d u rel could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.vportal.portlet.vlegal.model.VLegalDURel findByDepartament_Last(
		long departmentId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vlegal.NoSuchVLegalDURelException;

	/**
	* Finds the v legal d u rels before and after the current v legal d u rel in the ordered set where departmentId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param vLegalDURelPK the primary key of the current v legal d u rel
	* @param departmentId the department id to search with
	* @param orderByComparator the comparator to order the set by
	* @return the previous, current, and next v legal d u rel
	* @throws com.vportal.portlet.vlegal.NoSuchVLegalDURelException if a v legal d u rel with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.vportal.portlet.vlegal.model.VLegalDURel[] findByDepartament_PrevAndNext(
		VLegalDURelPK vLegalDURelPK, long departmentId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vlegal.NoSuchVLegalDURelException;

	/**
	* Finds all the v legal d u rels where userid = &#63;.
	*
	* @param userid the userid to search with
	* @return the matching v legal d u rels
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.vportal.portlet.vlegal.model.VLegalDURel> findByUser(
		long userid) throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Finds a range of all the v legal d u rels where userid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param userid the userid to search with
	* @param start the lower bound of the range of v legal d u rels to return
	* @param end the upper bound of the range of v legal d u rels to return (not inclusive)
	* @return the range of matching v legal d u rels
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.vportal.portlet.vlegal.model.VLegalDURel> findByUser(
		long userid, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Finds an ordered range of all the v legal d u rels where userid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param userid the userid to search with
	* @param start the lower bound of the range of v legal d u rels to return
	* @param end the upper bound of the range of v legal d u rels to return (not inclusive)
	* @param orderByComparator the comparator to order the results by
	* @return the ordered range of matching v legal d u rels
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.vportal.portlet.vlegal.model.VLegalDURel> findByUser(
		long userid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Finds the first v legal d u rel in the ordered set where userid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param userid the userid to search with
	* @param orderByComparator the comparator to order the set by
	* @return the first matching v legal d u rel
	* @throws com.vportal.portlet.vlegal.NoSuchVLegalDURelException if a matching v legal d u rel could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.vportal.portlet.vlegal.model.VLegalDURel findByUser_First(
		long userid,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vlegal.NoSuchVLegalDURelException;

	/**
	* Finds the last v legal d u rel in the ordered set where userid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param userid the userid to search with
	* @param orderByComparator the comparator to order the set by
	* @return the last matching v legal d u rel
	* @throws com.vportal.portlet.vlegal.NoSuchVLegalDURelException if a matching v legal d u rel could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.vportal.portlet.vlegal.model.VLegalDURel findByUser_Last(
		long userid,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vlegal.NoSuchVLegalDURelException;

	/**
	* Finds the v legal d u rels before and after the current v legal d u rel in the ordered set where userid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param vLegalDURelPK the primary key of the current v legal d u rel
	* @param userid the userid to search with
	* @param orderByComparator the comparator to order the set by
	* @return the previous, current, and next v legal d u rel
	* @throws com.vportal.portlet.vlegal.NoSuchVLegalDURelException if a v legal d u rel with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.vportal.portlet.vlegal.model.VLegalDURel[] findByUser_PrevAndNext(
		VLegalDURelPK vLegalDURelPK, long userid,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vlegal.NoSuchVLegalDURelException;

	/**
	* Finds the v legal d u rel where userid = &#63; or throws a {@link com.vportal.portlet.vlegal.NoSuchVLegalDURelException} if it could not be found.
	*
	* @param userid the userid to search with
	* @return the matching v legal d u rel
	* @throws com.vportal.portlet.vlegal.NoSuchVLegalDURelException if a matching v legal d u rel could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.vportal.portlet.vlegal.model.VLegalDURel findByUserId(
		long userid)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vlegal.NoSuchVLegalDURelException;

	/**
	* Finds the v legal d u rel where userid = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param userid the userid to search with
	* @return the matching v legal d u rel, or <code>null</code> if a matching v legal d u rel could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.vportal.portlet.vlegal.model.VLegalDURel fetchByUserId(
		long userid) throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Finds the v legal d u rel where userid = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param userid the userid to search with
	* @return the matching v legal d u rel, or <code>null</code> if a matching v legal d u rel could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.vportal.portlet.vlegal.model.VLegalDURel fetchByUserId(
		long userid, boolean retrieveFromCache)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Finds all the v legal d u rels.
	*
	* @return the v legal d u rels
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.vportal.portlet.vlegal.model.VLegalDURel> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Finds a range of all the v legal d u rels.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of v legal d u rels to return
	* @param end the upper bound of the range of v legal d u rels to return (not inclusive)
	* @return the range of v legal d u rels
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.vportal.portlet.vlegal.model.VLegalDURel> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Finds an ordered range of all the v legal d u rels.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of v legal d u rels to return
	* @param end the upper bound of the range of v legal d u rels to return (not inclusive)
	* @param orderByComparator the comparator to order the results by
	* @return the ordered range of v legal d u rels
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.vportal.portlet.vlegal.model.VLegalDURel> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the v legal d u rels where departmentId = &#63; from the database.
	*
	* @param departmentId the department id to search with
	* @throws SystemException if a system exception occurred
	*/
	public void removeByDepartament(long departmentId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the v legal d u rels where userid = &#63; from the database.
	*
	* @param userid the userid to search with
	* @throws SystemException if a system exception occurred
	*/
	public void removeByUser(long userid)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes the v legal d u rel where userid = &#63; from the database.
	*
	* @param userid the userid to search with
	* @throws SystemException if a system exception occurred
	*/
	public void removeByUserId(long userid)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vlegal.NoSuchVLegalDURelException;

	/**
	* Removes all the v legal d u rels from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Counts all the v legal d u rels where departmentId = &#63;.
	*
	* @param departmentId the department id to search with
	* @return the number of matching v legal d u rels
	* @throws SystemException if a system exception occurred
	*/
	public int countByDepartament(long departmentId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Counts all the v legal d u rels where userid = &#63;.
	*
	* @param userid the userid to search with
	* @return the number of matching v legal d u rels
	* @throws SystemException if a system exception occurred
	*/
	public int countByUser(long userid)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Counts all the v legal d u rels where userid = &#63;.
	*
	* @param userid the userid to search with
	* @return the number of matching v legal d u rels
	* @throws SystemException if a system exception occurred
	*/
	public int countByUserId(long userid)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Counts all the v legal d u rels.
	*
	* @return the number of v legal d u rels
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}