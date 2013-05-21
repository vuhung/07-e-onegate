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

import com.vportal.portlet.vlegal.model.VLegalFORel;

/**
 * The persistence interface for the v legal f o rel service.
 *
 * <p>
 * Never modify or reference this interface directly. Always use {@link VLegalFORelUtil} to access the v legal f o rel persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
 * </p>
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author ACB
 * @see VLegalFORelPersistenceImpl
 * @see VLegalFORelUtil
 * @generated
 */
public interface VLegalFORelPersistence extends BasePersistence<VLegalFORel> {
	/**
	* Caches the v legal f o rel in the entity cache if it is enabled.
	*
	* @param vLegalFORel the v legal f o rel to cache
	*/
	public void cacheResult(
		com.vportal.portlet.vlegal.model.VLegalFORel vLegalFORel);

	/**
	* Caches the v legal f o rels in the entity cache if it is enabled.
	*
	* @param vLegalFORels the v legal f o rels to cache
	*/
	public void cacheResult(
		java.util.List<com.vportal.portlet.vlegal.model.VLegalFORel> vLegalFORels);

	/**
	* Creates a new v legal f o rel with the primary key. Does not add the v legal f o rel to the database.
	*
	* @param vLegalFORelPK the primary key for the new v legal f o rel
	* @return the new v legal f o rel
	*/
	public com.vportal.portlet.vlegal.model.VLegalFORel create(
		VLegalFORelPK vLegalFORelPK);

	/**
	* Removes the v legal f o rel with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param vLegalFORelPK the primary key of the v legal f o rel to remove
	* @return the v legal f o rel that was removed
	* @throws com.vportal.portlet.vlegal.NoSuchVLegalFORelException if a v legal f o rel with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.vportal.portlet.vlegal.model.VLegalFORel remove(
		VLegalFORelPK vLegalFORelPK)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vlegal.NoSuchVLegalFORelException;

	public com.vportal.portlet.vlegal.model.VLegalFORel updateImpl(
		com.vportal.portlet.vlegal.model.VLegalFORel vLegalFORel, boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Finds the v legal f o rel with the primary key or throws a {@link com.vportal.portlet.vlegal.NoSuchVLegalFORelException} if it could not be found.
	*
	* @param vLegalFORelPK the primary key of the v legal f o rel to find
	* @return the v legal f o rel
	* @throws com.vportal.portlet.vlegal.NoSuchVLegalFORelException if a v legal f o rel with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.vportal.portlet.vlegal.model.VLegalFORel findByPrimaryKey(
		VLegalFORelPK vLegalFORelPK)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vlegal.NoSuchVLegalFORelException;

	/**
	* Finds the v legal f o rel with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param vLegalFORelPK the primary key of the v legal f o rel to find
	* @return the v legal f o rel, or <code>null</code> if a v legal f o rel with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.vportal.portlet.vlegal.model.VLegalFORel fetchByPrimaryKey(
		VLegalFORelPK vLegalFORelPK)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Finds all the v legal f o rels where fieldId = &#63;.
	*
	* @param fieldId the field id to search with
	* @return the matching v legal f o rels
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.vportal.portlet.vlegal.model.VLegalFORel> findByField(
		java.lang.String fieldId)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.vportal.portlet.vlegal.model.VLegalFORel> findByField(
		java.lang.String fieldId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.vportal.portlet.vlegal.model.VLegalFORel> findByField(
		java.lang.String fieldId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public com.vportal.portlet.vlegal.model.VLegalFORel findByField_First(
		java.lang.String fieldId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vlegal.NoSuchVLegalFORelException;

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
	public com.vportal.portlet.vlegal.model.VLegalFORel findByField_Last(
		java.lang.String fieldId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vlegal.NoSuchVLegalFORelException;

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
	public com.vportal.portlet.vlegal.model.VLegalFORel[] findByField_PrevAndNext(
		VLegalFORelPK vLegalFORelPK, java.lang.String fieldId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vlegal.NoSuchVLegalFORelException;

	/**
	* Finds all the v legal f o rels where orgId = &#63;.
	*
	* @param orgId the org id to search with
	* @return the matching v legal f o rels
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.vportal.portlet.vlegal.model.VLegalFORel> findByOrg(
		java.lang.String orgId)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.vportal.portlet.vlegal.model.VLegalFORel> findByOrg(
		java.lang.String orgId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.vportal.portlet.vlegal.model.VLegalFORel> findByOrg(
		java.lang.String orgId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public com.vportal.portlet.vlegal.model.VLegalFORel findByOrg_First(
		java.lang.String orgId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vlegal.NoSuchVLegalFORelException;

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
	public com.vportal.portlet.vlegal.model.VLegalFORel findByOrg_Last(
		java.lang.String orgId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vlegal.NoSuchVLegalFORelException;

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
	public com.vportal.portlet.vlegal.model.VLegalFORel[] findByOrg_PrevAndNext(
		VLegalFORelPK vLegalFORelPK, java.lang.String orgId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vlegal.NoSuchVLegalFORelException;

	/**
	* Finds all the v legal f o rels.
	*
	* @return the v legal f o rels
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.vportal.portlet.vlegal.model.VLegalFORel> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.vportal.portlet.vlegal.model.VLegalFORel> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.vportal.portlet.vlegal.model.VLegalFORel> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the v legal f o rels where fieldId = &#63; from the database.
	*
	* @param fieldId the field id to search with
	* @throws SystemException if a system exception occurred
	*/
	public void removeByField(java.lang.String fieldId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the v legal f o rels where orgId = &#63; from the database.
	*
	* @param orgId the org id to search with
	* @throws SystemException if a system exception occurred
	*/
	public void removeByOrg(java.lang.String orgId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the v legal f o rels from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Counts all the v legal f o rels where fieldId = &#63;.
	*
	* @param fieldId the field id to search with
	* @return the number of matching v legal f o rels
	* @throws SystemException if a system exception occurred
	*/
	public int countByField(java.lang.String fieldId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Counts all the v legal f o rels where orgId = &#63;.
	*
	* @param orgId the org id to search with
	* @return the number of matching v legal f o rels
	* @throws SystemException if a system exception occurred
	*/
	public int countByOrg(java.lang.String orgId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Counts all the v legal f o rels.
	*
	* @return the number of v legal f o rels
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}