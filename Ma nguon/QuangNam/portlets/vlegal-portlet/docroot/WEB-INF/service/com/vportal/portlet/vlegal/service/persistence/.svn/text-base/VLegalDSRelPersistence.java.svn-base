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

import com.vportal.portlet.vlegal.model.VLegalDSRel;

/**
 * The persistence interface for the v legal d s rel service.
 *
 * <p>
 * Never modify or reference this interface directly. Always use {@link VLegalDSRelUtil} to access the v legal d s rel persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
 * </p>
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author ACB
 * @see VLegalDSRelPersistenceImpl
 * @see VLegalDSRelUtil
 * @generated
 */
public interface VLegalDSRelPersistence extends BasePersistence<VLegalDSRel> {
	/**
	* Caches the v legal d s rel in the entity cache if it is enabled.
	*
	* @param vLegalDSRel the v legal d s rel to cache
	*/
	public void cacheResult(
		com.vportal.portlet.vlegal.model.VLegalDSRel vLegalDSRel);

	/**
	* Caches the v legal d s rels in the entity cache if it is enabled.
	*
	* @param vLegalDSRels the v legal d s rels to cache
	*/
	public void cacheResult(
		java.util.List<com.vportal.portlet.vlegal.model.VLegalDSRel> vLegalDSRels);

	/**
	* Creates a new v legal d s rel with the primary key. Does not add the v legal d s rel to the database.
	*
	* @param vLegalDSRelPK the primary key for the new v legal d s rel
	* @return the new v legal d s rel
	*/
	public com.vportal.portlet.vlegal.model.VLegalDSRel create(
		VLegalDSRelPK vLegalDSRelPK);

	/**
	* Removes the v legal d s rel with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param vLegalDSRelPK the primary key of the v legal d s rel to remove
	* @return the v legal d s rel that was removed
	* @throws com.vportal.portlet.vlegal.NoSuchVLegalDSRelException if a v legal d s rel with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.vportal.portlet.vlegal.model.VLegalDSRel remove(
		VLegalDSRelPK vLegalDSRelPK)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vlegal.NoSuchVLegalDSRelException;

	public com.vportal.portlet.vlegal.model.VLegalDSRel updateImpl(
		com.vportal.portlet.vlegal.model.VLegalDSRel vLegalDSRel, boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Finds the v legal d s rel with the primary key or throws a {@link com.vportal.portlet.vlegal.NoSuchVLegalDSRelException} if it could not be found.
	*
	* @param vLegalDSRelPK the primary key of the v legal d s rel to find
	* @return the v legal d s rel
	* @throws com.vportal.portlet.vlegal.NoSuchVLegalDSRelException if a v legal d s rel with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.vportal.portlet.vlegal.model.VLegalDSRel findByPrimaryKey(
		VLegalDSRelPK vLegalDSRelPK)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vlegal.NoSuchVLegalDSRelException;

	/**
	* Finds the v legal d s rel with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param vLegalDSRelPK the primary key of the v legal d s rel to find
	* @return the v legal d s rel, or <code>null</code> if a v legal d s rel with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.vportal.portlet.vlegal.model.VLegalDSRel fetchByPrimaryKey(
		VLegalDSRelPK vLegalDSRelPK)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Finds all the v legal d s rels where sigId = &#63;.
	*
	* @param sigId the sig id to search with
	* @return the matching v legal d s rels
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.vportal.portlet.vlegal.model.VLegalDSRel> findBySigner(
		java.lang.String sigId)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.vportal.portlet.vlegal.model.VLegalDSRel> findBySigner(
		java.lang.String sigId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.vportal.portlet.vlegal.model.VLegalDSRel> findBySigner(
		java.lang.String sigId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public com.vportal.portlet.vlegal.model.VLegalDSRel findBySigner_First(
		java.lang.String sigId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vlegal.NoSuchVLegalDSRelException;

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
	public com.vportal.portlet.vlegal.model.VLegalDSRel findBySigner_Last(
		java.lang.String sigId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vlegal.NoSuchVLegalDSRelException;

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
	public com.vportal.portlet.vlegal.model.VLegalDSRel[] findBySigner_PrevAndNext(
		VLegalDSRelPK vLegalDSRelPK, java.lang.String sigId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vlegal.NoSuchVLegalDSRelException;

	/**
	* Finds all the v legal d s rels where docId = &#63;.
	*
	* @param docId the doc id to search with
	* @return the matching v legal d s rels
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.vportal.portlet.vlegal.model.VLegalDSRel> findByDoc(
		java.lang.String docId)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.vportal.portlet.vlegal.model.VLegalDSRel> findByDoc(
		java.lang.String docId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.vportal.portlet.vlegal.model.VLegalDSRel> findByDoc(
		java.lang.String docId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public com.vportal.portlet.vlegal.model.VLegalDSRel findByDoc_First(
		java.lang.String docId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vlegal.NoSuchVLegalDSRelException;

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
	public com.vportal.portlet.vlegal.model.VLegalDSRel findByDoc_Last(
		java.lang.String docId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vlegal.NoSuchVLegalDSRelException;

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
	public com.vportal.portlet.vlegal.model.VLegalDSRel[] findByDoc_PrevAndNext(
		VLegalDSRelPK vLegalDSRelPK, java.lang.String docId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vlegal.NoSuchVLegalDSRelException;

	/**
	* Finds all the v legal d s rels.
	*
	* @return the v legal d s rels
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.vportal.portlet.vlegal.model.VLegalDSRel> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.vportal.portlet.vlegal.model.VLegalDSRel> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.vportal.portlet.vlegal.model.VLegalDSRel> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the v legal d s rels where sigId = &#63; from the database.
	*
	* @param sigId the sig id to search with
	* @throws SystemException if a system exception occurred
	*/
	public void removeBySigner(java.lang.String sigId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the v legal d s rels where docId = &#63; from the database.
	*
	* @param docId the doc id to search with
	* @throws SystemException if a system exception occurred
	*/
	public void removeByDoc(java.lang.String docId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the v legal d s rels from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Counts all the v legal d s rels where sigId = &#63;.
	*
	* @param sigId the sig id to search with
	* @return the number of matching v legal d s rels
	* @throws SystemException if a system exception occurred
	*/
	public int countBySigner(java.lang.String sigId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Counts all the v legal d s rels where docId = &#63;.
	*
	* @param docId the doc id to search with
	* @return the number of matching v legal d s rels
	* @throws SystemException if a system exception occurred
	*/
	public int countByDoc(java.lang.String docId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Counts all the v legal d s rels.
	*
	* @return the number of v legal d s rels
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}