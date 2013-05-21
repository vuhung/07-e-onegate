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

import com.vportal.portlet.vlegal.model.VLegalField;

/**
 * The persistence interface for the v legal field service.
 *
 * <p>
 * Never modify or reference this interface directly. Always use {@link VLegalFieldUtil} to access the v legal field persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
 * </p>
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author ACB
 * @see VLegalFieldPersistenceImpl
 * @see VLegalFieldUtil
 * @generated
 */
public interface VLegalFieldPersistence extends BasePersistence<VLegalField> {
	/**
	* Caches the v legal field in the entity cache if it is enabled.
	*
	* @param vLegalField the v legal field to cache
	*/
	public void cacheResult(
		com.vportal.portlet.vlegal.model.VLegalField vLegalField);

	/**
	* Caches the v legal fields in the entity cache if it is enabled.
	*
	* @param vLegalFields the v legal fields to cache
	*/
	public void cacheResult(
		java.util.List<com.vportal.portlet.vlegal.model.VLegalField> vLegalFields);

	/**
	* Creates a new v legal field with the primary key. Does not add the v legal field to the database.
	*
	* @param fieldId the primary key for the new v legal field
	* @return the new v legal field
	*/
	public com.vportal.portlet.vlegal.model.VLegalField create(
		java.lang.String fieldId);

	/**
	* Removes the v legal field with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param fieldId the primary key of the v legal field to remove
	* @return the v legal field that was removed
	* @throws com.vportal.portlet.vlegal.NoSuchVLegalFieldException if a v legal field with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.vportal.portlet.vlegal.model.VLegalField remove(
		java.lang.String fieldId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vlegal.NoSuchVLegalFieldException;

	public com.vportal.portlet.vlegal.model.VLegalField updateImpl(
		com.vportal.portlet.vlegal.model.VLegalField vLegalField, boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Finds the v legal field with the primary key or throws a {@link com.vportal.portlet.vlegal.NoSuchVLegalFieldException} if it could not be found.
	*
	* @param fieldId the primary key of the v legal field to find
	* @return the v legal field
	* @throws com.vportal.portlet.vlegal.NoSuchVLegalFieldException if a v legal field with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.vportal.portlet.vlegal.model.VLegalField findByPrimaryKey(
		java.lang.String fieldId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vlegal.NoSuchVLegalFieldException;

	/**
	* Finds the v legal field with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param fieldId the primary key of the v legal field to find
	* @return the v legal field, or <code>null</code> if a v legal field with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.vportal.portlet.vlegal.model.VLegalField fetchByPrimaryKey(
		java.lang.String fieldId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Finds all the v legal fields where groupId = &#63;.
	*
	* @param groupId the group id to search with
	* @return the matching v legal fields
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.vportal.portlet.vlegal.model.VLegalField> findByGroupId(
		long groupId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Finds a range of all the v legal fields where groupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param groupId the group id to search with
	* @param start the lower bound of the range of v legal fields to return
	* @param end the upper bound of the range of v legal fields to return (not inclusive)
	* @return the range of matching v legal fields
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.vportal.portlet.vlegal.model.VLegalField> findByGroupId(
		long groupId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Finds an ordered range of all the v legal fields where groupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param groupId the group id to search with
	* @param start the lower bound of the range of v legal fields to return
	* @param end the upper bound of the range of v legal fields to return (not inclusive)
	* @param orderByComparator the comparator to order the results by
	* @return the ordered range of matching v legal fields
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.vportal.portlet.vlegal.model.VLegalField> findByGroupId(
		long groupId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Finds the first v legal field in the ordered set where groupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param groupId the group id to search with
	* @param orderByComparator the comparator to order the set by
	* @return the first matching v legal field
	* @throws com.vportal.portlet.vlegal.NoSuchVLegalFieldException if a matching v legal field could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.vportal.portlet.vlegal.model.VLegalField findByGroupId_First(
		long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vlegal.NoSuchVLegalFieldException;

	/**
	* Finds the last v legal field in the ordered set where groupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param groupId the group id to search with
	* @param orderByComparator the comparator to order the set by
	* @return the last matching v legal field
	* @throws com.vportal.portlet.vlegal.NoSuchVLegalFieldException if a matching v legal field could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.vportal.portlet.vlegal.model.VLegalField findByGroupId_Last(
		long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vlegal.NoSuchVLegalFieldException;

	/**
	* Finds the v legal fields before and after the current v legal field in the ordered set where groupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param fieldId the primary key of the current v legal field
	* @param groupId the group id to search with
	* @param orderByComparator the comparator to order the set by
	* @return the previous, current, and next v legal field
	* @throws com.vportal.portlet.vlegal.NoSuchVLegalFieldException if a v legal field with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.vportal.portlet.vlegal.model.VLegalField[] findByGroupId_PrevAndNext(
		java.lang.String fieldId, long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vlegal.NoSuchVLegalFieldException;

	/**
	* Finds the v legal field where groupId = &#63; and fieldId = &#63; or throws a {@link com.vportal.portlet.vlegal.NoSuchVLegalFieldException} if it could not be found.
	*
	* @param groupId the group id to search with
	* @param fieldId the field id to search with
	* @return the matching v legal field
	* @throws com.vportal.portlet.vlegal.NoSuchVLegalFieldException if a matching v legal field could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.vportal.portlet.vlegal.model.VLegalField findByG_F(
		long groupId, java.lang.String fieldId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vlegal.NoSuchVLegalFieldException;

	/**
	* Finds the v legal field where groupId = &#63; and fieldId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param groupId the group id to search with
	* @param fieldId the field id to search with
	* @return the matching v legal field, or <code>null</code> if a matching v legal field could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.vportal.portlet.vlegal.model.VLegalField fetchByG_F(
		long groupId, java.lang.String fieldId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Finds the v legal field where groupId = &#63; and fieldId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param groupId the group id to search with
	* @param fieldId the field id to search with
	* @return the matching v legal field, or <code>null</code> if a matching v legal field could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.vportal.portlet.vlegal.model.VLegalField fetchByG_F(
		long groupId, java.lang.String fieldId, boolean retrieveFromCache)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Finds all the v legal fields where groupId = &#63; and statusField = &#63; and language = &#63;.
	*
	* @param groupId the group id to search with
	* @param statusField the status field to search with
	* @param language the language to search with
	* @return the matching v legal fields
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.vportal.portlet.vlegal.model.VLegalField> findByS_L(
		long groupId, boolean statusField, java.lang.String language)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Finds a range of all the v legal fields where groupId = &#63; and statusField = &#63; and language = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param groupId the group id to search with
	* @param statusField the status field to search with
	* @param language the language to search with
	* @param start the lower bound of the range of v legal fields to return
	* @param end the upper bound of the range of v legal fields to return (not inclusive)
	* @return the range of matching v legal fields
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.vportal.portlet.vlegal.model.VLegalField> findByS_L(
		long groupId, boolean statusField, java.lang.String language,
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Finds an ordered range of all the v legal fields where groupId = &#63; and statusField = &#63; and language = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param groupId the group id to search with
	* @param statusField the status field to search with
	* @param language the language to search with
	* @param start the lower bound of the range of v legal fields to return
	* @param end the upper bound of the range of v legal fields to return (not inclusive)
	* @param orderByComparator the comparator to order the results by
	* @return the ordered range of matching v legal fields
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.vportal.portlet.vlegal.model.VLegalField> findByS_L(
		long groupId, boolean statusField, java.lang.String language,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Finds the first v legal field in the ordered set where groupId = &#63; and statusField = &#63; and language = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param groupId the group id to search with
	* @param statusField the status field to search with
	* @param language the language to search with
	* @param orderByComparator the comparator to order the set by
	* @return the first matching v legal field
	* @throws com.vportal.portlet.vlegal.NoSuchVLegalFieldException if a matching v legal field could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.vportal.portlet.vlegal.model.VLegalField findByS_L_First(
		long groupId, boolean statusField, java.lang.String language,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vlegal.NoSuchVLegalFieldException;

	/**
	* Finds the last v legal field in the ordered set where groupId = &#63; and statusField = &#63; and language = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param groupId the group id to search with
	* @param statusField the status field to search with
	* @param language the language to search with
	* @param orderByComparator the comparator to order the set by
	* @return the last matching v legal field
	* @throws com.vportal.portlet.vlegal.NoSuchVLegalFieldException if a matching v legal field could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.vportal.portlet.vlegal.model.VLegalField findByS_L_Last(
		long groupId, boolean statusField, java.lang.String language,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vlegal.NoSuchVLegalFieldException;

	/**
	* Finds the v legal fields before and after the current v legal field in the ordered set where groupId = &#63; and statusField = &#63; and language = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param fieldId the primary key of the current v legal field
	* @param groupId the group id to search with
	* @param statusField the status field to search with
	* @param language the language to search with
	* @param orderByComparator the comparator to order the set by
	* @return the previous, current, and next v legal field
	* @throws com.vportal.portlet.vlegal.NoSuchVLegalFieldException if a v legal field with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.vportal.portlet.vlegal.model.VLegalField[] findByS_L_PrevAndNext(
		java.lang.String fieldId, long groupId, boolean statusField,
		java.lang.String language,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vlegal.NoSuchVLegalFieldException;

	/**
	* Finds all the v legal fields where language = &#63; and statusField = &#63;.
	*
	* @param language the language to search with
	* @param statusField the status field to search with
	* @return the matching v legal fields
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.vportal.portlet.vlegal.model.VLegalField> findByL_S(
		java.lang.String language, boolean statusField)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Finds a range of all the v legal fields where language = &#63; and statusField = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param language the language to search with
	* @param statusField the status field to search with
	* @param start the lower bound of the range of v legal fields to return
	* @param end the upper bound of the range of v legal fields to return (not inclusive)
	* @return the range of matching v legal fields
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.vportal.portlet.vlegal.model.VLegalField> findByL_S(
		java.lang.String language, boolean statusField, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Finds an ordered range of all the v legal fields where language = &#63; and statusField = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param language the language to search with
	* @param statusField the status field to search with
	* @param start the lower bound of the range of v legal fields to return
	* @param end the upper bound of the range of v legal fields to return (not inclusive)
	* @param orderByComparator the comparator to order the results by
	* @return the ordered range of matching v legal fields
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.vportal.portlet.vlegal.model.VLegalField> findByL_S(
		java.lang.String language, boolean statusField, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Finds the first v legal field in the ordered set where language = &#63; and statusField = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param language the language to search with
	* @param statusField the status field to search with
	* @param orderByComparator the comparator to order the set by
	* @return the first matching v legal field
	* @throws com.vportal.portlet.vlegal.NoSuchVLegalFieldException if a matching v legal field could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.vportal.portlet.vlegal.model.VLegalField findByL_S_First(
		java.lang.String language, boolean statusField,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vlegal.NoSuchVLegalFieldException;

	/**
	* Finds the last v legal field in the ordered set where language = &#63; and statusField = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param language the language to search with
	* @param statusField the status field to search with
	* @param orderByComparator the comparator to order the set by
	* @return the last matching v legal field
	* @throws com.vportal.portlet.vlegal.NoSuchVLegalFieldException if a matching v legal field could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.vportal.portlet.vlegal.model.VLegalField findByL_S_Last(
		java.lang.String language, boolean statusField,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vlegal.NoSuchVLegalFieldException;

	/**
	* Finds the v legal fields before and after the current v legal field in the ordered set where language = &#63; and statusField = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param fieldId the primary key of the current v legal field
	* @param language the language to search with
	* @param statusField the status field to search with
	* @param orderByComparator the comparator to order the set by
	* @return the previous, current, and next v legal field
	* @throws com.vportal.portlet.vlegal.NoSuchVLegalFieldException if a v legal field with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.vportal.portlet.vlegal.model.VLegalField[] findByL_S_PrevAndNext(
		java.lang.String fieldId, java.lang.String language,
		boolean statusField,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vlegal.NoSuchVLegalFieldException;

	/**
	* Finds all the v legal fields where groupId = &#63; and statusField = &#63; and rssable = &#63;.
	*
	* @param groupId the group id to search with
	* @param statusField the status field to search with
	* @param rssable the rssable to search with
	* @return the matching v legal fields
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.vportal.portlet.vlegal.model.VLegalField> findByS_Rss(
		long groupId, boolean statusField, boolean rssable)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Finds a range of all the v legal fields where groupId = &#63; and statusField = &#63; and rssable = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param groupId the group id to search with
	* @param statusField the status field to search with
	* @param rssable the rssable to search with
	* @param start the lower bound of the range of v legal fields to return
	* @param end the upper bound of the range of v legal fields to return (not inclusive)
	* @return the range of matching v legal fields
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.vportal.portlet.vlegal.model.VLegalField> findByS_Rss(
		long groupId, boolean statusField, boolean rssable, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Finds an ordered range of all the v legal fields where groupId = &#63; and statusField = &#63; and rssable = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param groupId the group id to search with
	* @param statusField the status field to search with
	* @param rssable the rssable to search with
	* @param start the lower bound of the range of v legal fields to return
	* @param end the upper bound of the range of v legal fields to return (not inclusive)
	* @param orderByComparator the comparator to order the results by
	* @return the ordered range of matching v legal fields
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.vportal.portlet.vlegal.model.VLegalField> findByS_Rss(
		long groupId, boolean statusField, boolean rssable, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Finds the first v legal field in the ordered set where groupId = &#63; and statusField = &#63; and rssable = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param groupId the group id to search with
	* @param statusField the status field to search with
	* @param rssable the rssable to search with
	* @param orderByComparator the comparator to order the set by
	* @return the first matching v legal field
	* @throws com.vportal.portlet.vlegal.NoSuchVLegalFieldException if a matching v legal field could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.vportal.portlet.vlegal.model.VLegalField findByS_Rss_First(
		long groupId, boolean statusField, boolean rssable,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vlegal.NoSuchVLegalFieldException;

	/**
	* Finds the last v legal field in the ordered set where groupId = &#63; and statusField = &#63; and rssable = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param groupId the group id to search with
	* @param statusField the status field to search with
	* @param rssable the rssable to search with
	* @param orderByComparator the comparator to order the set by
	* @return the last matching v legal field
	* @throws com.vportal.portlet.vlegal.NoSuchVLegalFieldException if a matching v legal field could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.vportal.portlet.vlegal.model.VLegalField findByS_Rss_Last(
		long groupId, boolean statusField, boolean rssable,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vlegal.NoSuchVLegalFieldException;

	/**
	* Finds the v legal fields before and after the current v legal field in the ordered set where groupId = &#63; and statusField = &#63; and rssable = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param fieldId the primary key of the current v legal field
	* @param groupId the group id to search with
	* @param statusField the status field to search with
	* @param rssable the rssable to search with
	* @param orderByComparator the comparator to order the set by
	* @return the previous, current, and next v legal field
	* @throws com.vportal.portlet.vlegal.NoSuchVLegalFieldException if a v legal field with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.vportal.portlet.vlegal.model.VLegalField[] findByS_Rss_PrevAndNext(
		java.lang.String fieldId, long groupId, boolean statusField,
		boolean rssable,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vlegal.NoSuchVLegalFieldException;

	/**
	* Finds all the v legal fields.
	*
	* @return the v legal fields
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.vportal.portlet.vlegal.model.VLegalField> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Finds a range of all the v legal fields.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of v legal fields to return
	* @param end the upper bound of the range of v legal fields to return (not inclusive)
	* @return the range of v legal fields
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.vportal.portlet.vlegal.model.VLegalField> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Finds an ordered range of all the v legal fields.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of v legal fields to return
	* @param end the upper bound of the range of v legal fields to return (not inclusive)
	* @param orderByComparator the comparator to order the results by
	* @return the ordered range of v legal fields
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.vportal.portlet.vlegal.model.VLegalField> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the v legal fields where groupId = &#63; from the database.
	*
	* @param groupId the group id to search with
	* @throws SystemException if a system exception occurred
	*/
	public void removeByGroupId(long groupId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes the v legal field where groupId = &#63; and fieldId = &#63; from the database.
	*
	* @param groupId the group id to search with
	* @param fieldId the field id to search with
	* @throws SystemException if a system exception occurred
	*/
	public void removeByG_F(long groupId, java.lang.String fieldId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vlegal.NoSuchVLegalFieldException;

	/**
	* Removes all the v legal fields where groupId = &#63; and statusField = &#63; and language = &#63; from the database.
	*
	* @param groupId the group id to search with
	* @param statusField the status field to search with
	* @param language the language to search with
	* @throws SystemException if a system exception occurred
	*/
	public void removeByS_L(long groupId, boolean statusField,
		java.lang.String language)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the v legal fields where language = &#63; and statusField = &#63; from the database.
	*
	* @param language the language to search with
	* @param statusField the status field to search with
	* @throws SystemException if a system exception occurred
	*/
	public void removeByL_S(java.lang.String language, boolean statusField)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the v legal fields where groupId = &#63; and statusField = &#63; and rssable = &#63; from the database.
	*
	* @param groupId the group id to search with
	* @param statusField the status field to search with
	* @param rssable the rssable to search with
	* @throws SystemException if a system exception occurred
	*/
	public void removeByS_Rss(long groupId, boolean statusField, boolean rssable)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the v legal fields from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Counts all the v legal fields where groupId = &#63;.
	*
	* @param groupId the group id to search with
	* @return the number of matching v legal fields
	* @throws SystemException if a system exception occurred
	*/
	public int countByGroupId(long groupId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Counts all the v legal fields where groupId = &#63; and fieldId = &#63;.
	*
	* @param groupId the group id to search with
	* @param fieldId the field id to search with
	* @return the number of matching v legal fields
	* @throws SystemException if a system exception occurred
	*/
	public int countByG_F(long groupId, java.lang.String fieldId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Counts all the v legal fields where groupId = &#63; and statusField = &#63; and language = &#63;.
	*
	* @param groupId the group id to search with
	* @param statusField the status field to search with
	* @param language the language to search with
	* @return the number of matching v legal fields
	* @throws SystemException if a system exception occurred
	*/
	public int countByS_L(long groupId, boolean statusField,
		java.lang.String language)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Counts all the v legal fields where language = &#63; and statusField = &#63;.
	*
	* @param language the language to search with
	* @param statusField the status field to search with
	* @return the number of matching v legal fields
	* @throws SystemException if a system exception occurred
	*/
	public int countByL_S(java.lang.String language, boolean statusField)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Counts all the v legal fields where groupId = &#63; and statusField = &#63; and rssable = &#63;.
	*
	* @param groupId the group id to search with
	* @param statusField the status field to search with
	* @param rssable the rssable to search with
	* @return the number of matching v legal fields
	* @throws SystemException if a system exception occurred
	*/
	public int countByS_Rss(long groupId, boolean statusField, boolean rssable)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Counts all the v legal fields.
	*
	* @return the number of v legal fields
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}