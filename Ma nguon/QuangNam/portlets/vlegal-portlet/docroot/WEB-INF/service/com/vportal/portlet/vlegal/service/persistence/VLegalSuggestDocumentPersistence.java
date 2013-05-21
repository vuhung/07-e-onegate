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

import com.vportal.portlet.vlegal.model.VLegalSuggestDocument;

/**
 * The persistence interface for the v legal suggest document service.
 *
 * <p>
 * Never modify or reference this interface directly. Always use {@link VLegalSuggestDocumentUtil} to access the v legal suggest document persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
 * </p>
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author ACB
 * @see VLegalSuggestDocumentPersistenceImpl
 * @see VLegalSuggestDocumentUtil
 * @generated
 */
public interface VLegalSuggestDocumentPersistence extends BasePersistence<VLegalSuggestDocument> {
	/**
	* Caches the v legal suggest document in the entity cache if it is enabled.
	*
	* @param vLegalSuggestDocument the v legal suggest document to cache
	*/
	public void cacheResult(
		com.vportal.portlet.vlegal.model.VLegalSuggestDocument vLegalSuggestDocument);

	/**
	* Caches the v legal suggest documents in the entity cache if it is enabled.
	*
	* @param vLegalSuggestDocuments the v legal suggest documents to cache
	*/
	public void cacheResult(
		java.util.List<com.vportal.portlet.vlegal.model.VLegalSuggestDocument> vLegalSuggestDocuments);

	/**
	* Creates a new v legal suggest document with the primary key. Does not add the v legal suggest document to the database.
	*
	* @param sugId the primary key for the new v legal suggest document
	* @return the new v legal suggest document
	*/
	public com.vportal.portlet.vlegal.model.VLegalSuggestDocument create(
		java.lang.String sugId);

	/**
	* Removes the v legal suggest document with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param sugId the primary key of the v legal suggest document to remove
	* @return the v legal suggest document that was removed
	* @throws com.vportal.portlet.vlegal.NoSuchVLegalSuggestDocumentException if a v legal suggest document with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.vportal.portlet.vlegal.model.VLegalSuggestDocument remove(
		java.lang.String sugId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vlegal.NoSuchVLegalSuggestDocumentException;

	public com.vportal.portlet.vlegal.model.VLegalSuggestDocument updateImpl(
		com.vportal.portlet.vlegal.model.VLegalSuggestDocument vLegalSuggestDocument,
		boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Finds the v legal suggest document with the primary key or throws a {@link com.vportal.portlet.vlegal.NoSuchVLegalSuggestDocumentException} if it could not be found.
	*
	* @param sugId the primary key of the v legal suggest document to find
	* @return the v legal suggest document
	* @throws com.vportal.portlet.vlegal.NoSuchVLegalSuggestDocumentException if a v legal suggest document with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.vportal.portlet.vlegal.model.VLegalSuggestDocument findByPrimaryKey(
		java.lang.String sugId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vlegal.NoSuchVLegalSuggestDocumentException;

	/**
	* Finds the v legal suggest document with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param sugId the primary key of the v legal suggest document to find
	* @return the v legal suggest document, or <code>null</code> if a v legal suggest document with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.vportal.portlet.vlegal.model.VLegalSuggestDocument fetchByPrimaryKey(
		java.lang.String sugId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Finds all the v legal suggest documents where groupId = &#63;.
	*
	* @param groupId the group id to search with
	* @return the matching v legal suggest documents
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.vportal.portlet.vlegal.model.VLegalSuggestDocument> findByGroupId(
		long groupId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Finds a range of all the v legal suggest documents where groupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param groupId the group id to search with
	* @param start the lower bound of the range of v legal suggest documents to return
	* @param end the upper bound of the range of v legal suggest documents to return (not inclusive)
	* @return the range of matching v legal suggest documents
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.vportal.portlet.vlegal.model.VLegalSuggestDocument> findByGroupId(
		long groupId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Finds an ordered range of all the v legal suggest documents where groupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param groupId the group id to search with
	* @param start the lower bound of the range of v legal suggest documents to return
	* @param end the upper bound of the range of v legal suggest documents to return (not inclusive)
	* @param orderByComparator the comparator to order the results by
	* @return the ordered range of matching v legal suggest documents
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.vportal.portlet.vlegal.model.VLegalSuggestDocument> findByGroupId(
		long groupId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Finds the first v legal suggest document in the ordered set where groupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param groupId the group id to search with
	* @param orderByComparator the comparator to order the set by
	* @return the first matching v legal suggest document
	* @throws com.vportal.portlet.vlegal.NoSuchVLegalSuggestDocumentException if a matching v legal suggest document could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.vportal.portlet.vlegal.model.VLegalSuggestDocument findByGroupId_First(
		long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vlegal.NoSuchVLegalSuggestDocumentException;

	/**
	* Finds the last v legal suggest document in the ordered set where groupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param groupId the group id to search with
	* @param orderByComparator the comparator to order the set by
	* @return the last matching v legal suggest document
	* @throws com.vportal.portlet.vlegal.NoSuchVLegalSuggestDocumentException if a matching v legal suggest document could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.vportal.portlet.vlegal.model.VLegalSuggestDocument findByGroupId_Last(
		long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vlegal.NoSuchVLegalSuggestDocumentException;

	/**
	* Finds the v legal suggest documents before and after the current v legal suggest document in the ordered set where groupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param sugId the primary key of the current v legal suggest document
	* @param groupId the group id to search with
	* @param orderByComparator the comparator to order the set by
	* @return the previous, current, and next v legal suggest document
	* @throws com.vportal.portlet.vlegal.NoSuchVLegalSuggestDocumentException if a v legal suggest document with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.vportal.portlet.vlegal.model.VLegalSuggestDocument[] findByGroupId_PrevAndNext(
		java.lang.String sugId, long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vlegal.NoSuchVLegalSuggestDocumentException;

	/**
	* Finds all the v legal suggest documents where groupId = &#63; and approved = &#63;.
	*
	* @param groupId the group id to search with
	* @param approved the approved to search with
	* @return the matching v legal suggest documents
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.vportal.portlet.vlegal.model.VLegalSuggestDocument> findByP_A(
		long groupId, boolean approved)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Finds a range of all the v legal suggest documents where groupId = &#63; and approved = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param groupId the group id to search with
	* @param approved the approved to search with
	* @param start the lower bound of the range of v legal suggest documents to return
	* @param end the upper bound of the range of v legal suggest documents to return (not inclusive)
	* @return the range of matching v legal suggest documents
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.vportal.portlet.vlegal.model.VLegalSuggestDocument> findByP_A(
		long groupId, boolean approved, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Finds an ordered range of all the v legal suggest documents where groupId = &#63; and approved = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param groupId the group id to search with
	* @param approved the approved to search with
	* @param start the lower bound of the range of v legal suggest documents to return
	* @param end the upper bound of the range of v legal suggest documents to return (not inclusive)
	* @param orderByComparator the comparator to order the results by
	* @return the ordered range of matching v legal suggest documents
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.vportal.portlet.vlegal.model.VLegalSuggestDocument> findByP_A(
		long groupId, boolean approved, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Finds the first v legal suggest document in the ordered set where groupId = &#63; and approved = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param groupId the group id to search with
	* @param approved the approved to search with
	* @param orderByComparator the comparator to order the set by
	* @return the first matching v legal suggest document
	* @throws com.vportal.portlet.vlegal.NoSuchVLegalSuggestDocumentException if a matching v legal suggest document could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.vportal.portlet.vlegal.model.VLegalSuggestDocument findByP_A_First(
		long groupId, boolean approved,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vlegal.NoSuchVLegalSuggestDocumentException;

	/**
	* Finds the last v legal suggest document in the ordered set where groupId = &#63; and approved = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param groupId the group id to search with
	* @param approved the approved to search with
	* @param orderByComparator the comparator to order the set by
	* @return the last matching v legal suggest document
	* @throws com.vportal.portlet.vlegal.NoSuchVLegalSuggestDocumentException if a matching v legal suggest document could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.vportal.portlet.vlegal.model.VLegalSuggestDocument findByP_A_Last(
		long groupId, boolean approved,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vlegal.NoSuchVLegalSuggestDocumentException;

	/**
	* Finds the v legal suggest documents before and after the current v legal suggest document in the ordered set where groupId = &#63; and approved = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param sugId the primary key of the current v legal suggest document
	* @param groupId the group id to search with
	* @param approved the approved to search with
	* @param orderByComparator the comparator to order the set by
	* @return the previous, current, and next v legal suggest document
	* @throws com.vportal.portlet.vlegal.NoSuchVLegalSuggestDocumentException if a v legal suggest document with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.vportal.portlet.vlegal.model.VLegalSuggestDocument[] findByP_A_PrevAndNext(
		java.lang.String sugId, long groupId, boolean approved,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vlegal.NoSuchVLegalSuggestDocumentException;

	/**
	* Finds the v legal suggest document where groupId = &#63; and sugId = &#63; or throws a {@link com.vportal.portlet.vlegal.NoSuchVLegalSuggestDocumentException} if it could not be found.
	*
	* @param groupId the group id to search with
	* @param sugId the sug id to search with
	* @return the matching v legal suggest document
	* @throws com.vportal.portlet.vlegal.NoSuchVLegalSuggestDocumentException if a matching v legal suggest document could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.vportal.portlet.vlegal.model.VLegalSuggestDocument findByG_S(
		long groupId, java.lang.String sugId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vlegal.NoSuchVLegalSuggestDocumentException;

	/**
	* Finds the v legal suggest document where groupId = &#63; and sugId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param groupId the group id to search with
	* @param sugId the sug id to search with
	* @return the matching v legal suggest document, or <code>null</code> if a matching v legal suggest document could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.vportal.portlet.vlegal.model.VLegalSuggestDocument fetchByG_S(
		long groupId, java.lang.String sugId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Finds the v legal suggest document where groupId = &#63; and sugId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param groupId the group id to search with
	* @param sugId the sug id to search with
	* @return the matching v legal suggest document, or <code>null</code> if a matching v legal suggest document could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.vportal.portlet.vlegal.model.VLegalSuggestDocument fetchByG_S(
		long groupId, java.lang.String sugId, boolean retrieveFromCache)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Finds all the v legal suggest documents where groupId = &#63; and language = &#63;.
	*
	* @param groupId the group id to search with
	* @param language the language to search with
	* @return the matching v legal suggest documents
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.vportal.portlet.vlegal.model.VLegalSuggestDocument> findByP_L(
		long groupId, java.lang.String language)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Finds a range of all the v legal suggest documents where groupId = &#63; and language = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param groupId the group id to search with
	* @param language the language to search with
	* @param start the lower bound of the range of v legal suggest documents to return
	* @param end the upper bound of the range of v legal suggest documents to return (not inclusive)
	* @return the range of matching v legal suggest documents
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.vportal.portlet.vlegal.model.VLegalSuggestDocument> findByP_L(
		long groupId, java.lang.String language, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Finds an ordered range of all the v legal suggest documents where groupId = &#63; and language = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param groupId the group id to search with
	* @param language the language to search with
	* @param start the lower bound of the range of v legal suggest documents to return
	* @param end the upper bound of the range of v legal suggest documents to return (not inclusive)
	* @param orderByComparator the comparator to order the results by
	* @return the ordered range of matching v legal suggest documents
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.vportal.portlet.vlegal.model.VLegalSuggestDocument> findByP_L(
		long groupId, java.lang.String language, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Finds the first v legal suggest document in the ordered set where groupId = &#63; and language = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param groupId the group id to search with
	* @param language the language to search with
	* @param orderByComparator the comparator to order the set by
	* @return the first matching v legal suggest document
	* @throws com.vportal.portlet.vlegal.NoSuchVLegalSuggestDocumentException if a matching v legal suggest document could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.vportal.portlet.vlegal.model.VLegalSuggestDocument findByP_L_First(
		long groupId, java.lang.String language,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vlegal.NoSuchVLegalSuggestDocumentException;

	/**
	* Finds the last v legal suggest document in the ordered set where groupId = &#63; and language = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param groupId the group id to search with
	* @param language the language to search with
	* @param orderByComparator the comparator to order the set by
	* @return the last matching v legal suggest document
	* @throws com.vportal.portlet.vlegal.NoSuchVLegalSuggestDocumentException if a matching v legal suggest document could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.vportal.portlet.vlegal.model.VLegalSuggestDocument findByP_L_Last(
		long groupId, java.lang.String language,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vlegal.NoSuchVLegalSuggestDocumentException;

	/**
	* Finds the v legal suggest documents before and after the current v legal suggest document in the ordered set where groupId = &#63; and language = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param sugId the primary key of the current v legal suggest document
	* @param groupId the group id to search with
	* @param language the language to search with
	* @param orderByComparator the comparator to order the set by
	* @return the previous, current, and next v legal suggest document
	* @throws com.vportal.portlet.vlegal.NoSuchVLegalSuggestDocumentException if a v legal suggest document with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.vportal.portlet.vlegal.model.VLegalSuggestDocument[] findByP_L_PrevAndNext(
		java.lang.String sugId, long groupId, java.lang.String language,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vlegal.NoSuchVLegalSuggestDocumentException;

	/**
	* Finds all the v legal suggest documents where groupId = &#63; and language = &#63; and approved = &#63;.
	*
	* @param groupId the group id to search with
	* @param language the language to search with
	* @param approved the approved to search with
	* @return the matching v legal suggest documents
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.vportal.portlet.vlegal.model.VLegalSuggestDocument> findByP_L_A(
		long groupId, java.lang.String language, boolean approved)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Finds a range of all the v legal suggest documents where groupId = &#63; and language = &#63; and approved = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param groupId the group id to search with
	* @param language the language to search with
	* @param approved the approved to search with
	* @param start the lower bound of the range of v legal suggest documents to return
	* @param end the upper bound of the range of v legal suggest documents to return (not inclusive)
	* @return the range of matching v legal suggest documents
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.vportal.portlet.vlegal.model.VLegalSuggestDocument> findByP_L_A(
		long groupId, java.lang.String language, boolean approved, int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Finds an ordered range of all the v legal suggest documents where groupId = &#63; and language = &#63; and approved = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param groupId the group id to search with
	* @param language the language to search with
	* @param approved the approved to search with
	* @param start the lower bound of the range of v legal suggest documents to return
	* @param end the upper bound of the range of v legal suggest documents to return (not inclusive)
	* @param orderByComparator the comparator to order the results by
	* @return the ordered range of matching v legal suggest documents
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.vportal.portlet.vlegal.model.VLegalSuggestDocument> findByP_L_A(
		long groupId, java.lang.String language, boolean approved, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Finds the first v legal suggest document in the ordered set where groupId = &#63; and language = &#63; and approved = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param groupId the group id to search with
	* @param language the language to search with
	* @param approved the approved to search with
	* @param orderByComparator the comparator to order the set by
	* @return the first matching v legal suggest document
	* @throws com.vportal.portlet.vlegal.NoSuchVLegalSuggestDocumentException if a matching v legal suggest document could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.vportal.portlet.vlegal.model.VLegalSuggestDocument findByP_L_A_First(
		long groupId, java.lang.String language, boolean approved,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vlegal.NoSuchVLegalSuggestDocumentException;

	/**
	* Finds the last v legal suggest document in the ordered set where groupId = &#63; and language = &#63; and approved = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param groupId the group id to search with
	* @param language the language to search with
	* @param approved the approved to search with
	* @param orderByComparator the comparator to order the set by
	* @return the last matching v legal suggest document
	* @throws com.vportal.portlet.vlegal.NoSuchVLegalSuggestDocumentException if a matching v legal suggest document could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.vportal.portlet.vlegal.model.VLegalSuggestDocument findByP_L_A_Last(
		long groupId, java.lang.String language, boolean approved,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vlegal.NoSuchVLegalSuggestDocumentException;

	/**
	* Finds the v legal suggest documents before and after the current v legal suggest document in the ordered set where groupId = &#63; and language = &#63; and approved = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param sugId the primary key of the current v legal suggest document
	* @param groupId the group id to search with
	* @param language the language to search with
	* @param approved the approved to search with
	* @param orderByComparator the comparator to order the set by
	* @return the previous, current, and next v legal suggest document
	* @throws com.vportal.portlet.vlegal.NoSuchVLegalSuggestDocumentException if a v legal suggest document with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.vportal.portlet.vlegal.model.VLegalSuggestDocument[] findByP_L_A_PrevAndNext(
		java.lang.String sugId, long groupId, java.lang.String language,
		boolean approved,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vlegal.NoSuchVLegalSuggestDocumentException;

	/**
	* Finds all the v legal suggest documents where groupId = &#63; and language = &#63; and approved = &#63; and draftId = &#63;.
	*
	* @param groupId the group id to search with
	* @param language the language to search with
	* @param approved the approved to search with
	* @param draftId the draft id to search with
	* @return the matching v legal suggest documents
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.vportal.portlet.vlegal.model.VLegalSuggestDocument> findByP_L_A_D(
		long groupId, java.lang.String language, boolean approved,
		java.lang.String draftId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Finds a range of all the v legal suggest documents where groupId = &#63; and language = &#63; and approved = &#63; and draftId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param groupId the group id to search with
	* @param language the language to search with
	* @param approved the approved to search with
	* @param draftId the draft id to search with
	* @param start the lower bound of the range of v legal suggest documents to return
	* @param end the upper bound of the range of v legal suggest documents to return (not inclusive)
	* @return the range of matching v legal suggest documents
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.vportal.portlet.vlegal.model.VLegalSuggestDocument> findByP_L_A_D(
		long groupId, java.lang.String language, boolean approved,
		java.lang.String draftId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Finds an ordered range of all the v legal suggest documents where groupId = &#63; and language = &#63; and approved = &#63; and draftId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param groupId the group id to search with
	* @param language the language to search with
	* @param approved the approved to search with
	* @param draftId the draft id to search with
	* @param start the lower bound of the range of v legal suggest documents to return
	* @param end the upper bound of the range of v legal suggest documents to return (not inclusive)
	* @param orderByComparator the comparator to order the results by
	* @return the ordered range of matching v legal suggest documents
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.vportal.portlet.vlegal.model.VLegalSuggestDocument> findByP_L_A_D(
		long groupId, java.lang.String language, boolean approved,
		java.lang.String draftId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Finds the first v legal suggest document in the ordered set where groupId = &#63; and language = &#63; and approved = &#63; and draftId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param groupId the group id to search with
	* @param language the language to search with
	* @param approved the approved to search with
	* @param draftId the draft id to search with
	* @param orderByComparator the comparator to order the set by
	* @return the first matching v legal suggest document
	* @throws com.vportal.portlet.vlegal.NoSuchVLegalSuggestDocumentException if a matching v legal suggest document could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.vportal.portlet.vlegal.model.VLegalSuggestDocument findByP_L_A_D_First(
		long groupId, java.lang.String language, boolean approved,
		java.lang.String draftId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vlegal.NoSuchVLegalSuggestDocumentException;

	/**
	* Finds the last v legal suggest document in the ordered set where groupId = &#63; and language = &#63; and approved = &#63; and draftId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param groupId the group id to search with
	* @param language the language to search with
	* @param approved the approved to search with
	* @param draftId the draft id to search with
	* @param orderByComparator the comparator to order the set by
	* @return the last matching v legal suggest document
	* @throws com.vportal.portlet.vlegal.NoSuchVLegalSuggestDocumentException if a matching v legal suggest document could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.vportal.portlet.vlegal.model.VLegalSuggestDocument findByP_L_A_D_Last(
		long groupId, java.lang.String language, boolean approved,
		java.lang.String draftId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vlegal.NoSuchVLegalSuggestDocumentException;

	/**
	* Finds the v legal suggest documents before and after the current v legal suggest document in the ordered set where groupId = &#63; and language = &#63; and approved = &#63; and draftId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param sugId the primary key of the current v legal suggest document
	* @param groupId the group id to search with
	* @param language the language to search with
	* @param approved the approved to search with
	* @param draftId the draft id to search with
	* @param orderByComparator the comparator to order the set by
	* @return the previous, current, and next v legal suggest document
	* @throws com.vportal.portlet.vlegal.NoSuchVLegalSuggestDocumentException if a v legal suggest document with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.vportal.portlet.vlegal.model.VLegalSuggestDocument[] findByP_L_A_D_PrevAndNext(
		java.lang.String sugId, long groupId, java.lang.String language,
		boolean approved, java.lang.String draftId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vlegal.NoSuchVLegalSuggestDocumentException;

	/**
	* Finds all the v legal suggest documents where approved = &#63; and draftId = &#63;.
	*
	* @param approved the approved to search with
	* @param draftId the draft id to search with
	* @return the matching v legal suggest documents
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.vportal.portlet.vlegal.model.VLegalSuggestDocument> findByA_D(
		boolean approved, java.lang.String draftId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Finds a range of all the v legal suggest documents where approved = &#63; and draftId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param approved the approved to search with
	* @param draftId the draft id to search with
	* @param start the lower bound of the range of v legal suggest documents to return
	* @param end the upper bound of the range of v legal suggest documents to return (not inclusive)
	* @return the range of matching v legal suggest documents
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.vportal.portlet.vlegal.model.VLegalSuggestDocument> findByA_D(
		boolean approved, java.lang.String draftId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Finds an ordered range of all the v legal suggest documents where approved = &#63; and draftId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param approved the approved to search with
	* @param draftId the draft id to search with
	* @param start the lower bound of the range of v legal suggest documents to return
	* @param end the upper bound of the range of v legal suggest documents to return (not inclusive)
	* @param orderByComparator the comparator to order the results by
	* @return the ordered range of matching v legal suggest documents
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.vportal.portlet.vlegal.model.VLegalSuggestDocument> findByA_D(
		boolean approved, java.lang.String draftId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Finds the first v legal suggest document in the ordered set where approved = &#63; and draftId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param approved the approved to search with
	* @param draftId the draft id to search with
	* @param orderByComparator the comparator to order the set by
	* @return the first matching v legal suggest document
	* @throws com.vportal.portlet.vlegal.NoSuchVLegalSuggestDocumentException if a matching v legal suggest document could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.vportal.portlet.vlegal.model.VLegalSuggestDocument findByA_D_First(
		boolean approved, java.lang.String draftId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vlegal.NoSuchVLegalSuggestDocumentException;

	/**
	* Finds the last v legal suggest document in the ordered set where approved = &#63; and draftId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param approved the approved to search with
	* @param draftId the draft id to search with
	* @param orderByComparator the comparator to order the set by
	* @return the last matching v legal suggest document
	* @throws com.vportal.portlet.vlegal.NoSuchVLegalSuggestDocumentException if a matching v legal suggest document could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.vportal.portlet.vlegal.model.VLegalSuggestDocument findByA_D_Last(
		boolean approved, java.lang.String draftId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vlegal.NoSuchVLegalSuggestDocumentException;

	/**
	* Finds the v legal suggest documents before and after the current v legal suggest document in the ordered set where approved = &#63; and draftId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param sugId the primary key of the current v legal suggest document
	* @param approved the approved to search with
	* @param draftId the draft id to search with
	* @param orderByComparator the comparator to order the set by
	* @return the previous, current, and next v legal suggest document
	* @throws com.vportal.portlet.vlegal.NoSuchVLegalSuggestDocumentException if a v legal suggest document with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.vportal.portlet.vlegal.model.VLegalSuggestDocument[] findByA_D_PrevAndNext(
		java.lang.String sugId, boolean approved, java.lang.String draftId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vlegal.NoSuchVLegalSuggestDocumentException;

	/**
	* Finds all the v legal suggest documents where draftId = &#63;.
	*
	* @param draftId the draft id to search with
	* @return the matching v legal suggest documents
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.vportal.portlet.vlegal.model.VLegalSuggestDocument> findBySuggByDraftId(
		java.lang.String draftId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Finds a range of all the v legal suggest documents where draftId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param draftId the draft id to search with
	* @param start the lower bound of the range of v legal suggest documents to return
	* @param end the upper bound of the range of v legal suggest documents to return (not inclusive)
	* @return the range of matching v legal suggest documents
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.vportal.portlet.vlegal.model.VLegalSuggestDocument> findBySuggByDraftId(
		java.lang.String draftId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Finds an ordered range of all the v legal suggest documents where draftId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param draftId the draft id to search with
	* @param start the lower bound of the range of v legal suggest documents to return
	* @param end the upper bound of the range of v legal suggest documents to return (not inclusive)
	* @param orderByComparator the comparator to order the results by
	* @return the ordered range of matching v legal suggest documents
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.vportal.portlet.vlegal.model.VLegalSuggestDocument> findBySuggByDraftId(
		java.lang.String draftId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Finds the first v legal suggest document in the ordered set where draftId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param draftId the draft id to search with
	* @param orderByComparator the comparator to order the set by
	* @return the first matching v legal suggest document
	* @throws com.vportal.portlet.vlegal.NoSuchVLegalSuggestDocumentException if a matching v legal suggest document could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.vportal.portlet.vlegal.model.VLegalSuggestDocument findBySuggByDraftId_First(
		java.lang.String draftId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vlegal.NoSuchVLegalSuggestDocumentException;

	/**
	* Finds the last v legal suggest document in the ordered set where draftId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param draftId the draft id to search with
	* @param orderByComparator the comparator to order the set by
	* @return the last matching v legal suggest document
	* @throws com.vportal.portlet.vlegal.NoSuchVLegalSuggestDocumentException if a matching v legal suggest document could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.vportal.portlet.vlegal.model.VLegalSuggestDocument findBySuggByDraftId_Last(
		java.lang.String draftId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vlegal.NoSuchVLegalSuggestDocumentException;

	/**
	* Finds the v legal suggest documents before and after the current v legal suggest document in the ordered set where draftId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param sugId the primary key of the current v legal suggest document
	* @param draftId the draft id to search with
	* @param orderByComparator the comparator to order the set by
	* @return the previous, current, and next v legal suggest document
	* @throws com.vportal.portlet.vlegal.NoSuchVLegalSuggestDocumentException if a v legal suggest document with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.vportal.portlet.vlegal.model.VLegalSuggestDocument[] findBySuggByDraftId_PrevAndNext(
		java.lang.String sugId, java.lang.String draftId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vlegal.NoSuchVLegalSuggestDocumentException;

	/**
	* Finds all the v legal suggest documents.
	*
	* @return the v legal suggest documents
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.vportal.portlet.vlegal.model.VLegalSuggestDocument> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Finds a range of all the v legal suggest documents.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of v legal suggest documents to return
	* @param end the upper bound of the range of v legal suggest documents to return (not inclusive)
	* @return the range of v legal suggest documents
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.vportal.portlet.vlegal.model.VLegalSuggestDocument> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Finds an ordered range of all the v legal suggest documents.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of v legal suggest documents to return
	* @param end the upper bound of the range of v legal suggest documents to return (not inclusive)
	* @param orderByComparator the comparator to order the results by
	* @return the ordered range of v legal suggest documents
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.vportal.portlet.vlegal.model.VLegalSuggestDocument> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the v legal suggest documents where groupId = &#63; from the database.
	*
	* @param groupId the group id to search with
	* @throws SystemException if a system exception occurred
	*/
	public void removeByGroupId(long groupId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the v legal suggest documents where groupId = &#63; and approved = &#63; from the database.
	*
	* @param groupId the group id to search with
	* @param approved the approved to search with
	* @throws SystemException if a system exception occurred
	*/
	public void removeByP_A(long groupId, boolean approved)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes the v legal suggest document where groupId = &#63; and sugId = &#63; from the database.
	*
	* @param groupId the group id to search with
	* @param sugId the sug id to search with
	* @throws SystemException if a system exception occurred
	*/
	public void removeByG_S(long groupId, java.lang.String sugId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vlegal.NoSuchVLegalSuggestDocumentException;

	/**
	* Removes all the v legal suggest documents where groupId = &#63; and language = &#63; from the database.
	*
	* @param groupId the group id to search with
	* @param language the language to search with
	* @throws SystemException if a system exception occurred
	*/
	public void removeByP_L(long groupId, java.lang.String language)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the v legal suggest documents where groupId = &#63; and language = &#63; and approved = &#63; from the database.
	*
	* @param groupId the group id to search with
	* @param language the language to search with
	* @param approved the approved to search with
	* @throws SystemException if a system exception occurred
	*/
	public void removeByP_L_A(long groupId, java.lang.String language,
		boolean approved)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the v legal suggest documents where groupId = &#63; and language = &#63; and approved = &#63; and draftId = &#63; from the database.
	*
	* @param groupId the group id to search with
	* @param language the language to search with
	* @param approved the approved to search with
	* @param draftId the draft id to search with
	* @throws SystemException if a system exception occurred
	*/
	public void removeByP_L_A_D(long groupId, java.lang.String language,
		boolean approved, java.lang.String draftId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the v legal suggest documents where approved = &#63; and draftId = &#63; from the database.
	*
	* @param approved the approved to search with
	* @param draftId the draft id to search with
	* @throws SystemException if a system exception occurred
	*/
	public void removeByA_D(boolean approved, java.lang.String draftId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the v legal suggest documents where draftId = &#63; from the database.
	*
	* @param draftId the draft id to search with
	* @throws SystemException if a system exception occurred
	*/
	public void removeBySuggByDraftId(java.lang.String draftId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the v legal suggest documents from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Counts all the v legal suggest documents where groupId = &#63;.
	*
	* @param groupId the group id to search with
	* @return the number of matching v legal suggest documents
	* @throws SystemException if a system exception occurred
	*/
	public int countByGroupId(long groupId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Counts all the v legal suggest documents where groupId = &#63; and approved = &#63;.
	*
	* @param groupId the group id to search with
	* @param approved the approved to search with
	* @return the number of matching v legal suggest documents
	* @throws SystemException if a system exception occurred
	*/
	public int countByP_A(long groupId, boolean approved)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Counts all the v legal suggest documents where groupId = &#63; and sugId = &#63;.
	*
	* @param groupId the group id to search with
	* @param sugId the sug id to search with
	* @return the number of matching v legal suggest documents
	* @throws SystemException if a system exception occurred
	*/
	public int countByG_S(long groupId, java.lang.String sugId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Counts all the v legal suggest documents where groupId = &#63; and language = &#63;.
	*
	* @param groupId the group id to search with
	* @param language the language to search with
	* @return the number of matching v legal suggest documents
	* @throws SystemException if a system exception occurred
	*/
	public int countByP_L(long groupId, java.lang.String language)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Counts all the v legal suggest documents where groupId = &#63; and language = &#63; and approved = &#63;.
	*
	* @param groupId the group id to search with
	* @param language the language to search with
	* @param approved the approved to search with
	* @return the number of matching v legal suggest documents
	* @throws SystemException if a system exception occurred
	*/
	public int countByP_L_A(long groupId, java.lang.String language,
		boolean approved)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Counts all the v legal suggest documents where groupId = &#63; and language = &#63; and approved = &#63; and draftId = &#63;.
	*
	* @param groupId the group id to search with
	* @param language the language to search with
	* @param approved the approved to search with
	* @param draftId the draft id to search with
	* @return the number of matching v legal suggest documents
	* @throws SystemException if a system exception occurred
	*/
	public int countByP_L_A_D(long groupId, java.lang.String language,
		boolean approved, java.lang.String draftId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Counts all the v legal suggest documents where approved = &#63; and draftId = &#63;.
	*
	* @param approved the approved to search with
	* @param draftId the draft id to search with
	* @return the number of matching v legal suggest documents
	* @throws SystemException if a system exception occurred
	*/
	public int countByA_D(boolean approved, java.lang.String draftId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Counts all the v legal suggest documents where draftId = &#63;.
	*
	* @param draftId the draft id to search with
	* @return the number of matching v legal suggest documents
	* @throws SystemException if a system exception occurred
	*/
	public int countBySuggByDraftId(java.lang.String draftId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Counts all the v legal suggest documents.
	*
	* @return the number of v legal suggest documents
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}