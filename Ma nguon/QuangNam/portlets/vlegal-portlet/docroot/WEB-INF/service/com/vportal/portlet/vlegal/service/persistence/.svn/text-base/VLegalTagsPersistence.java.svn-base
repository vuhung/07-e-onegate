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

import com.vportal.portlet.vlegal.model.VLegalTags;

/**
 * The persistence interface for the v legal tags service.
 *
 * <p>
 * Never modify or reference this interface directly. Always use {@link VLegalTagsUtil} to access the v legal tags persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
 * </p>
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author ACB
 * @see VLegalTagsPersistenceImpl
 * @see VLegalTagsUtil
 * @generated
 */
public interface VLegalTagsPersistence extends BasePersistence<VLegalTags> {
	/**
	* Caches the v legal tags in the entity cache if it is enabled.
	*
	* @param vLegalTags the v legal tags to cache
	*/
	public void cacheResult(
		com.vportal.portlet.vlegal.model.VLegalTags vLegalTags);

	/**
	* Caches the v legal tagses in the entity cache if it is enabled.
	*
	* @param vLegalTagses the v legal tagses to cache
	*/
	public void cacheResult(
		java.util.List<com.vportal.portlet.vlegal.model.VLegalTags> vLegalTagses);

	/**
	* Creates a new v legal tags with the primary key. Does not add the v legal tags to the database.
	*
	* @param tagId the primary key for the new v legal tags
	* @return the new v legal tags
	*/
	public com.vportal.portlet.vlegal.model.VLegalTags create(
		java.lang.String tagId);

	/**
	* Removes the v legal tags with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param tagId the primary key of the v legal tags to remove
	* @return the v legal tags that was removed
	* @throws com.vportal.portlet.vlegal.NoSuchVLegalTagsException if a v legal tags with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.vportal.portlet.vlegal.model.VLegalTags remove(
		java.lang.String tagId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vlegal.NoSuchVLegalTagsException;

	public com.vportal.portlet.vlegal.model.VLegalTags updateImpl(
		com.vportal.portlet.vlegal.model.VLegalTags vLegalTags, boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Finds the v legal tags with the primary key or throws a {@link com.vportal.portlet.vlegal.NoSuchVLegalTagsException} if it could not be found.
	*
	* @param tagId the primary key of the v legal tags to find
	* @return the v legal tags
	* @throws com.vportal.portlet.vlegal.NoSuchVLegalTagsException if a v legal tags with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.vportal.portlet.vlegal.model.VLegalTags findByPrimaryKey(
		java.lang.String tagId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vlegal.NoSuchVLegalTagsException;

	/**
	* Finds the v legal tags with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param tagId the primary key of the v legal tags to find
	* @return the v legal tags, or <code>null</code> if a v legal tags with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.vportal.portlet.vlegal.model.VLegalTags fetchByPrimaryKey(
		java.lang.String tagId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Finds all the v legal tagses where groupId = &#63;.
	*
	* @param groupId the group id to search with
	* @return the matching v legal tagses
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.vportal.portlet.vlegal.model.VLegalTags> findByGroupId(
		long groupId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Finds a range of all the v legal tagses where groupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param groupId the group id to search with
	* @param start the lower bound of the range of v legal tagses to return
	* @param end the upper bound of the range of v legal tagses to return (not inclusive)
	* @return the range of matching v legal tagses
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.vportal.portlet.vlegal.model.VLegalTags> findByGroupId(
		long groupId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Finds an ordered range of all the v legal tagses where groupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param groupId the group id to search with
	* @param start the lower bound of the range of v legal tagses to return
	* @param end the upper bound of the range of v legal tagses to return (not inclusive)
	* @param orderByComparator the comparator to order the results by
	* @return the ordered range of matching v legal tagses
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.vportal.portlet.vlegal.model.VLegalTags> findByGroupId(
		long groupId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Finds the first v legal tags in the ordered set where groupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param groupId the group id to search with
	* @param orderByComparator the comparator to order the set by
	* @return the first matching v legal tags
	* @throws com.vportal.portlet.vlegal.NoSuchVLegalTagsException if a matching v legal tags could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.vportal.portlet.vlegal.model.VLegalTags findByGroupId_First(
		long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vlegal.NoSuchVLegalTagsException;

	/**
	* Finds the last v legal tags in the ordered set where groupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param groupId the group id to search with
	* @param orderByComparator the comparator to order the set by
	* @return the last matching v legal tags
	* @throws com.vportal.portlet.vlegal.NoSuchVLegalTagsException if a matching v legal tags could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.vportal.portlet.vlegal.model.VLegalTags findByGroupId_Last(
		long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vlegal.NoSuchVLegalTagsException;

	/**
	* Finds the v legal tagses before and after the current v legal tags in the ordered set where groupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param tagId the primary key of the current v legal tags
	* @param groupId the group id to search with
	* @param orderByComparator the comparator to order the set by
	* @return the previous, current, and next v legal tags
	* @throws com.vportal.portlet.vlegal.NoSuchVLegalTagsException if a v legal tags with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.vportal.portlet.vlegal.model.VLegalTags[] findByGroupId_PrevAndNext(
		java.lang.String tagId, long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vlegal.NoSuchVLegalTagsException;

	/**
	* Finds all the v legal tagses where groupId = &#63; and statusTags = &#63;.
	*
	* @param groupId the group id to search with
	* @param statusTags the status tags to search with
	* @return the matching v legal tagses
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.vportal.portlet.vlegal.model.VLegalTags> findByP_S(
		long groupId, boolean statusTags)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Finds a range of all the v legal tagses where groupId = &#63; and statusTags = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param groupId the group id to search with
	* @param statusTags the status tags to search with
	* @param start the lower bound of the range of v legal tagses to return
	* @param end the upper bound of the range of v legal tagses to return (not inclusive)
	* @return the range of matching v legal tagses
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.vportal.portlet.vlegal.model.VLegalTags> findByP_S(
		long groupId, boolean statusTags, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Finds an ordered range of all the v legal tagses where groupId = &#63; and statusTags = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param groupId the group id to search with
	* @param statusTags the status tags to search with
	* @param start the lower bound of the range of v legal tagses to return
	* @param end the upper bound of the range of v legal tagses to return (not inclusive)
	* @param orderByComparator the comparator to order the results by
	* @return the ordered range of matching v legal tagses
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.vportal.portlet.vlegal.model.VLegalTags> findByP_S(
		long groupId, boolean statusTags, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Finds the first v legal tags in the ordered set where groupId = &#63; and statusTags = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param groupId the group id to search with
	* @param statusTags the status tags to search with
	* @param orderByComparator the comparator to order the set by
	* @return the first matching v legal tags
	* @throws com.vportal.portlet.vlegal.NoSuchVLegalTagsException if a matching v legal tags could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.vportal.portlet.vlegal.model.VLegalTags findByP_S_First(
		long groupId, boolean statusTags,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vlegal.NoSuchVLegalTagsException;

	/**
	* Finds the last v legal tags in the ordered set where groupId = &#63; and statusTags = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param groupId the group id to search with
	* @param statusTags the status tags to search with
	* @param orderByComparator the comparator to order the set by
	* @return the last matching v legal tags
	* @throws com.vportal.portlet.vlegal.NoSuchVLegalTagsException if a matching v legal tags could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.vportal.portlet.vlegal.model.VLegalTags findByP_S_Last(
		long groupId, boolean statusTags,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vlegal.NoSuchVLegalTagsException;

	/**
	* Finds the v legal tagses before and after the current v legal tags in the ordered set where groupId = &#63; and statusTags = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param tagId the primary key of the current v legal tags
	* @param groupId the group id to search with
	* @param statusTags the status tags to search with
	* @param orderByComparator the comparator to order the set by
	* @return the previous, current, and next v legal tags
	* @throws com.vportal.portlet.vlegal.NoSuchVLegalTagsException if a v legal tags with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.vportal.portlet.vlegal.model.VLegalTags[] findByP_S_PrevAndNext(
		java.lang.String tagId, long groupId, boolean statusTags,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vlegal.NoSuchVLegalTagsException;

	/**
	* Finds all the v legal tagses.
	*
	* @return the v legal tagses
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.vportal.portlet.vlegal.model.VLegalTags> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Finds a range of all the v legal tagses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of v legal tagses to return
	* @param end the upper bound of the range of v legal tagses to return (not inclusive)
	* @return the range of v legal tagses
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.vportal.portlet.vlegal.model.VLegalTags> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Finds an ordered range of all the v legal tagses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of v legal tagses to return
	* @param end the upper bound of the range of v legal tagses to return (not inclusive)
	* @param orderByComparator the comparator to order the results by
	* @return the ordered range of v legal tagses
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.vportal.portlet.vlegal.model.VLegalTags> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the v legal tagses where groupId = &#63; from the database.
	*
	* @param groupId the group id to search with
	* @throws SystemException if a system exception occurred
	*/
	public void removeByGroupId(long groupId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the v legal tagses where groupId = &#63; and statusTags = &#63; from the database.
	*
	* @param groupId the group id to search with
	* @param statusTags the status tags to search with
	* @throws SystemException if a system exception occurred
	*/
	public void removeByP_S(long groupId, boolean statusTags)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the v legal tagses from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Counts all the v legal tagses where groupId = &#63;.
	*
	* @param groupId the group id to search with
	* @return the number of matching v legal tagses
	* @throws SystemException if a system exception occurred
	*/
	public int countByGroupId(long groupId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Counts all the v legal tagses where groupId = &#63; and statusTags = &#63;.
	*
	* @param groupId the group id to search with
	* @param statusTags the status tags to search with
	* @return the number of matching v legal tagses
	* @throws SystemException if a system exception occurred
	*/
	public int countByP_S(long groupId, boolean statusTags)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Counts all the v legal tagses.
	*
	* @return the number of v legal tagses
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}