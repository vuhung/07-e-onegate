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

import com.vportal.portlet.vlegal.model.VLegalTDRel;

/**
 * The persistence interface for the v legal t d rel service.
 *
 * <p>
 * Never modify or reference this interface directly. Always use {@link VLegalTDRelUtil} to access the v legal t d rel persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
 * </p>
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author ACB
 * @see VLegalTDRelPersistenceImpl
 * @see VLegalTDRelUtil
 * @generated
 */
public interface VLegalTDRelPersistence extends BasePersistence<VLegalTDRel> {
	/**
	* Caches the v legal t d rel in the entity cache if it is enabled.
	*
	* @param vLegalTDRel the v legal t d rel to cache
	*/
	public void cacheResult(
		com.vportal.portlet.vlegal.model.VLegalTDRel vLegalTDRel);

	/**
	* Caches the v legal t d rels in the entity cache if it is enabled.
	*
	* @param vLegalTDRels the v legal t d rels to cache
	*/
	public void cacheResult(
		java.util.List<com.vportal.portlet.vlegal.model.VLegalTDRel> vLegalTDRels);

	/**
	* Creates a new v legal t d rel with the primary key. Does not add the v legal t d rel to the database.
	*
	* @param vLegalTDRelPK the primary key for the new v legal t d rel
	* @return the new v legal t d rel
	*/
	public com.vportal.portlet.vlegal.model.VLegalTDRel create(
		VLegalTDRelPK vLegalTDRelPK);

	/**
	* Removes the v legal t d rel with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param vLegalTDRelPK the primary key of the v legal t d rel to remove
	* @return the v legal t d rel that was removed
	* @throws com.vportal.portlet.vlegal.NoSuchVLegalTDRelException if a v legal t d rel with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.vportal.portlet.vlegal.model.VLegalTDRel remove(
		VLegalTDRelPK vLegalTDRelPK)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vlegal.NoSuchVLegalTDRelException;

	public com.vportal.portlet.vlegal.model.VLegalTDRel updateImpl(
		com.vportal.portlet.vlegal.model.VLegalTDRel vLegalTDRel, boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Finds the v legal t d rel with the primary key or throws a {@link com.vportal.portlet.vlegal.NoSuchVLegalTDRelException} if it could not be found.
	*
	* @param vLegalTDRelPK the primary key of the v legal t d rel to find
	* @return the v legal t d rel
	* @throws com.vportal.portlet.vlegal.NoSuchVLegalTDRelException if a v legal t d rel with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.vportal.portlet.vlegal.model.VLegalTDRel findByPrimaryKey(
		VLegalTDRelPK vLegalTDRelPK)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vlegal.NoSuchVLegalTDRelException;

	/**
	* Finds the v legal t d rel with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param vLegalTDRelPK the primary key of the v legal t d rel to find
	* @return the v legal t d rel, or <code>null</code> if a v legal t d rel with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.vportal.portlet.vlegal.model.VLegalTDRel fetchByPrimaryKey(
		VLegalTDRelPK vLegalTDRelPK)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Finds all the v legal t d rels where docId = &#63;.
	*
	* @param docId the doc id to search with
	* @return the matching v legal t d rels
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.vportal.portlet.vlegal.model.VLegalTDRel> findByDocument(
		java.lang.String docId)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.vportal.portlet.vlegal.model.VLegalTDRel> findByDocument(
		java.lang.String docId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.vportal.portlet.vlegal.model.VLegalTDRel> findByDocument(
		java.lang.String docId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public com.vportal.portlet.vlegal.model.VLegalTDRel findByDocument_First(
		java.lang.String docId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vlegal.NoSuchVLegalTDRelException;

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
	public com.vportal.portlet.vlegal.model.VLegalTDRel findByDocument_Last(
		java.lang.String docId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vlegal.NoSuchVLegalTDRelException;

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
	public com.vportal.portlet.vlegal.model.VLegalTDRel[] findByDocument_PrevAndNext(
		VLegalTDRelPK vLegalTDRelPK, java.lang.String docId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vlegal.NoSuchVLegalTDRelException;

	/**
	* Finds all the v legal t d rels where tagId = &#63;.
	*
	* @param tagId the tag id to search with
	* @return the matching v legal t d rels
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.vportal.portlet.vlegal.model.VLegalTDRel> findByTag(
		java.lang.String tagId)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.vportal.portlet.vlegal.model.VLegalTDRel> findByTag(
		java.lang.String tagId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.vportal.portlet.vlegal.model.VLegalTDRel> findByTag(
		java.lang.String tagId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public com.vportal.portlet.vlegal.model.VLegalTDRel findByTag_First(
		java.lang.String tagId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vlegal.NoSuchVLegalTDRelException;

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
	public com.vportal.portlet.vlegal.model.VLegalTDRel findByTag_Last(
		java.lang.String tagId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vlegal.NoSuchVLegalTDRelException;

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
	public com.vportal.portlet.vlegal.model.VLegalTDRel[] findByTag_PrevAndNext(
		VLegalTDRelPK vLegalTDRelPK, java.lang.String tagId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vlegal.NoSuchVLegalTDRelException;

	/**
	* Finds all the v legal t d rels.
	*
	* @return the v legal t d rels
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.vportal.portlet.vlegal.model.VLegalTDRel> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.vportal.portlet.vlegal.model.VLegalTDRel> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.vportal.portlet.vlegal.model.VLegalTDRel> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the v legal t d rels where docId = &#63; from the database.
	*
	* @param docId the doc id to search with
	* @throws SystemException if a system exception occurred
	*/
	public void removeByDocument(java.lang.String docId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the v legal t d rels where tagId = &#63; from the database.
	*
	* @param tagId the tag id to search with
	* @throws SystemException if a system exception occurred
	*/
	public void removeByTag(java.lang.String tagId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the v legal t d rels from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Counts all the v legal t d rels where docId = &#63;.
	*
	* @param docId the doc id to search with
	* @return the number of matching v legal t d rels
	* @throws SystemException if a system exception occurred
	*/
	public int countByDocument(java.lang.String docId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Counts all the v legal t d rels where tagId = &#63;.
	*
	* @param tagId the tag id to search with
	* @return the number of matching v legal t d rels
	* @throws SystemException if a system exception occurred
	*/
	public int countByTag(java.lang.String tagId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Counts all the v legal t d rels.
	*
	* @return the number of v legal t d rels
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}