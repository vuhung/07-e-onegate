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

import com.vportal.portlet.vlegal.model.VLegalDraftDocument;

/**
 * The persistence interface for the v legal draft document service.
 *
 * <p>
 * Never modify or reference this interface directly. Always use {@link VLegalDraftDocumentUtil} to access the v legal draft document persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
 * </p>
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author ACB
 * @see VLegalDraftDocumentPersistenceImpl
 * @see VLegalDraftDocumentUtil
 * @generated
 */
public interface VLegalDraftDocumentPersistence extends BasePersistence<VLegalDraftDocument> {
	/**
	* Caches the v legal draft document in the entity cache if it is enabled.
	*
	* @param vLegalDraftDocument the v legal draft document to cache
	*/
	public void cacheResult(
		com.vportal.portlet.vlegal.model.VLegalDraftDocument vLegalDraftDocument);

	/**
	* Caches the v legal draft documents in the entity cache if it is enabled.
	*
	* @param vLegalDraftDocuments the v legal draft documents to cache
	*/
	public void cacheResult(
		java.util.List<com.vportal.portlet.vlegal.model.VLegalDraftDocument> vLegalDraftDocuments);

	/**
	* Creates a new v legal draft document with the primary key. Does not add the v legal draft document to the database.
	*
	* @param draftId the primary key for the new v legal draft document
	* @return the new v legal draft document
	*/
	public com.vportal.portlet.vlegal.model.VLegalDraftDocument create(
		java.lang.String draftId);

	/**
	* Removes the v legal draft document with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param draftId the primary key of the v legal draft document to remove
	* @return the v legal draft document that was removed
	* @throws com.vportal.portlet.vlegal.NoSuchVLegalDraftDocumentException if a v legal draft document with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.vportal.portlet.vlegal.model.VLegalDraftDocument remove(
		java.lang.String draftId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vlegal.NoSuchVLegalDraftDocumentException;

	public com.vportal.portlet.vlegal.model.VLegalDraftDocument updateImpl(
		com.vportal.portlet.vlegal.model.VLegalDraftDocument vLegalDraftDocument,
		boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Finds the v legal draft document with the primary key or throws a {@link com.vportal.portlet.vlegal.NoSuchVLegalDraftDocumentException} if it could not be found.
	*
	* @param draftId the primary key of the v legal draft document to find
	* @return the v legal draft document
	* @throws com.vportal.portlet.vlegal.NoSuchVLegalDraftDocumentException if a v legal draft document with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.vportal.portlet.vlegal.model.VLegalDraftDocument findByPrimaryKey(
		java.lang.String draftId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vlegal.NoSuchVLegalDraftDocumentException;

	/**
	* Finds the v legal draft document with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param draftId the primary key of the v legal draft document to find
	* @return the v legal draft document, or <code>null</code> if a v legal draft document with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.vportal.portlet.vlegal.model.VLegalDraftDocument fetchByPrimaryKey(
		java.lang.String draftId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Finds all the v legal draft documents where groupId = &#63;.
	*
	* @param groupId the group id to search with
	* @return the matching v legal draft documents
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.vportal.portlet.vlegal.model.VLegalDraftDocument> findByGroupId(
		long groupId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Finds a range of all the v legal draft documents where groupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param groupId the group id to search with
	* @param start the lower bound of the range of v legal draft documents to return
	* @param end the upper bound of the range of v legal draft documents to return (not inclusive)
	* @return the range of matching v legal draft documents
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.vportal.portlet.vlegal.model.VLegalDraftDocument> findByGroupId(
		long groupId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Finds an ordered range of all the v legal draft documents where groupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param groupId the group id to search with
	* @param start the lower bound of the range of v legal draft documents to return
	* @param end the upper bound of the range of v legal draft documents to return (not inclusive)
	* @param orderByComparator the comparator to order the results by
	* @return the ordered range of matching v legal draft documents
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.vportal.portlet.vlegal.model.VLegalDraftDocument> findByGroupId(
		long groupId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Finds the first v legal draft document in the ordered set where groupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param groupId the group id to search with
	* @param orderByComparator the comparator to order the set by
	* @return the first matching v legal draft document
	* @throws com.vportal.portlet.vlegal.NoSuchVLegalDraftDocumentException if a matching v legal draft document could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.vportal.portlet.vlegal.model.VLegalDraftDocument findByGroupId_First(
		long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vlegal.NoSuchVLegalDraftDocumentException;

	/**
	* Finds the last v legal draft document in the ordered set where groupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param groupId the group id to search with
	* @param orderByComparator the comparator to order the set by
	* @return the last matching v legal draft document
	* @throws com.vportal.portlet.vlegal.NoSuchVLegalDraftDocumentException if a matching v legal draft document could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.vportal.portlet.vlegal.model.VLegalDraftDocument findByGroupId_Last(
		long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vlegal.NoSuchVLegalDraftDocumentException;

	/**
	* Finds the v legal draft documents before and after the current v legal draft document in the ordered set where groupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param draftId the primary key of the current v legal draft document
	* @param groupId the group id to search with
	* @param orderByComparator the comparator to order the set by
	* @return the previous, current, and next v legal draft document
	* @throws com.vportal.portlet.vlegal.NoSuchVLegalDraftDocumentException if a v legal draft document with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.vportal.portlet.vlegal.model.VLegalDraftDocument[] findByGroupId_PrevAndNext(
		java.lang.String draftId, long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vlegal.NoSuchVLegalDraftDocumentException;

	/**
	* Finds the v legal draft document where groupId = &#63; and draftId = &#63; or throws a {@link com.vportal.portlet.vlegal.NoSuchVLegalDraftDocumentException} if it could not be found.
	*
	* @param groupId the group id to search with
	* @param draftId the draft id to search with
	* @return the matching v legal draft document
	* @throws com.vportal.portlet.vlegal.NoSuchVLegalDraftDocumentException if a matching v legal draft document could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.vportal.portlet.vlegal.model.VLegalDraftDocument findByG_D(
		long groupId, java.lang.String draftId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vlegal.NoSuchVLegalDraftDocumentException;

	/**
	* Finds the v legal draft document where groupId = &#63; and draftId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param groupId the group id to search with
	* @param draftId the draft id to search with
	* @return the matching v legal draft document, or <code>null</code> if a matching v legal draft document could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.vportal.portlet.vlegal.model.VLegalDraftDocument fetchByG_D(
		long groupId, java.lang.String draftId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Finds the v legal draft document where groupId = &#63; and draftId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param groupId the group id to search with
	* @param draftId the draft id to search with
	* @return the matching v legal draft document, or <code>null</code> if a matching v legal draft document could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.vportal.portlet.vlegal.model.VLegalDraftDocument fetchByG_D(
		long groupId, java.lang.String draftId, boolean retrieveFromCache)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Finds all the v legal draft documents where groupId = &#63; and statusDraft = &#63; and docCode = &#63;.
	*
	* @param groupId the group id to search with
	* @param statusDraft the status draft to search with
	* @param docCode the doc code to search with
	* @return the matching v legal draft documents
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.vportal.portlet.vlegal.model.VLegalDraftDocument> findByP_S_D(
		long groupId, int statusDraft, java.lang.String docCode)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Finds a range of all the v legal draft documents where groupId = &#63; and statusDraft = &#63; and docCode = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param groupId the group id to search with
	* @param statusDraft the status draft to search with
	* @param docCode the doc code to search with
	* @param start the lower bound of the range of v legal draft documents to return
	* @param end the upper bound of the range of v legal draft documents to return (not inclusive)
	* @return the range of matching v legal draft documents
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.vportal.portlet.vlegal.model.VLegalDraftDocument> findByP_S_D(
		long groupId, int statusDraft, java.lang.String docCode, int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Finds an ordered range of all the v legal draft documents where groupId = &#63; and statusDraft = &#63; and docCode = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param groupId the group id to search with
	* @param statusDraft the status draft to search with
	* @param docCode the doc code to search with
	* @param start the lower bound of the range of v legal draft documents to return
	* @param end the upper bound of the range of v legal draft documents to return (not inclusive)
	* @param orderByComparator the comparator to order the results by
	* @return the ordered range of matching v legal draft documents
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.vportal.portlet.vlegal.model.VLegalDraftDocument> findByP_S_D(
		long groupId, int statusDraft, java.lang.String docCode, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Finds the first v legal draft document in the ordered set where groupId = &#63; and statusDraft = &#63; and docCode = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param groupId the group id to search with
	* @param statusDraft the status draft to search with
	* @param docCode the doc code to search with
	* @param orderByComparator the comparator to order the set by
	* @return the first matching v legal draft document
	* @throws com.vportal.portlet.vlegal.NoSuchVLegalDraftDocumentException if a matching v legal draft document could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.vportal.portlet.vlegal.model.VLegalDraftDocument findByP_S_D_First(
		long groupId, int statusDraft, java.lang.String docCode,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vlegal.NoSuchVLegalDraftDocumentException;

	/**
	* Finds the last v legal draft document in the ordered set where groupId = &#63; and statusDraft = &#63; and docCode = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param groupId the group id to search with
	* @param statusDraft the status draft to search with
	* @param docCode the doc code to search with
	* @param orderByComparator the comparator to order the set by
	* @return the last matching v legal draft document
	* @throws com.vportal.portlet.vlegal.NoSuchVLegalDraftDocumentException if a matching v legal draft document could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.vportal.portlet.vlegal.model.VLegalDraftDocument findByP_S_D_Last(
		long groupId, int statusDraft, java.lang.String docCode,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vlegal.NoSuchVLegalDraftDocumentException;

	/**
	* Finds the v legal draft documents before and after the current v legal draft document in the ordered set where groupId = &#63; and statusDraft = &#63; and docCode = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param draftId the primary key of the current v legal draft document
	* @param groupId the group id to search with
	* @param statusDraft the status draft to search with
	* @param docCode the doc code to search with
	* @param orderByComparator the comparator to order the set by
	* @return the previous, current, and next v legal draft document
	* @throws com.vportal.portlet.vlegal.NoSuchVLegalDraftDocumentException if a v legal draft document with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.vportal.portlet.vlegal.model.VLegalDraftDocument[] findByP_S_D_PrevAndNext(
		java.lang.String draftId, long groupId, int statusDraft,
		java.lang.String docCode,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vlegal.NoSuchVLegalDraftDocumentException;

	/**
	* Finds all the v legal draft documents where groupId = &#63; and statusDraft = &#63; and fieldId = &#63;.
	*
	* @param groupId the group id to search with
	* @param statusDraft the status draft to search with
	* @param fieldId the field id to search with
	* @return the matching v legal draft documents
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.vportal.portlet.vlegal.model.VLegalDraftDocument> findByP_S_F(
		long groupId, int statusDraft, java.lang.String fieldId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Finds a range of all the v legal draft documents where groupId = &#63; and statusDraft = &#63; and fieldId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param groupId the group id to search with
	* @param statusDraft the status draft to search with
	* @param fieldId the field id to search with
	* @param start the lower bound of the range of v legal draft documents to return
	* @param end the upper bound of the range of v legal draft documents to return (not inclusive)
	* @return the range of matching v legal draft documents
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.vportal.portlet.vlegal.model.VLegalDraftDocument> findByP_S_F(
		long groupId, int statusDraft, java.lang.String fieldId, int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Finds an ordered range of all the v legal draft documents where groupId = &#63; and statusDraft = &#63; and fieldId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param groupId the group id to search with
	* @param statusDraft the status draft to search with
	* @param fieldId the field id to search with
	* @param start the lower bound of the range of v legal draft documents to return
	* @param end the upper bound of the range of v legal draft documents to return (not inclusive)
	* @param orderByComparator the comparator to order the results by
	* @return the ordered range of matching v legal draft documents
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.vportal.portlet.vlegal.model.VLegalDraftDocument> findByP_S_F(
		long groupId, int statusDraft, java.lang.String fieldId, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Finds the first v legal draft document in the ordered set where groupId = &#63; and statusDraft = &#63; and fieldId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param groupId the group id to search with
	* @param statusDraft the status draft to search with
	* @param fieldId the field id to search with
	* @param orderByComparator the comparator to order the set by
	* @return the first matching v legal draft document
	* @throws com.vportal.portlet.vlegal.NoSuchVLegalDraftDocumentException if a matching v legal draft document could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.vportal.portlet.vlegal.model.VLegalDraftDocument findByP_S_F_First(
		long groupId, int statusDraft, java.lang.String fieldId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vlegal.NoSuchVLegalDraftDocumentException;

	/**
	* Finds the last v legal draft document in the ordered set where groupId = &#63; and statusDraft = &#63; and fieldId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param groupId the group id to search with
	* @param statusDraft the status draft to search with
	* @param fieldId the field id to search with
	* @param orderByComparator the comparator to order the set by
	* @return the last matching v legal draft document
	* @throws com.vportal.portlet.vlegal.NoSuchVLegalDraftDocumentException if a matching v legal draft document could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.vportal.portlet.vlegal.model.VLegalDraftDocument findByP_S_F_Last(
		long groupId, int statusDraft, java.lang.String fieldId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vlegal.NoSuchVLegalDraftDocumentException;

	/**
	* Finds the v legal draft documents before and after the current v legal draft document in the ordered set where groupId = &#63; and statusDraft = &#63; and fieldId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param draftId the primary key of the current v legal draft document
	* @param groupId the group id to search with
	* @param statusDraft the status draft to search with
	* @param fieldId the field id to search with
	* @param orderByComparator the comparator to order the set by
	* @return the previous, current, and next v legal draft document
	* @throws com.vportal.portlet.vlegal.NoSuchVLegalDraftDocumentException if a v legal draft document with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.vportal.portlet.vlegal.model.VLegalDraftDocument[] findByP_S_F_PrevAndNext(
		java.lang.String draftId, long groupId, int statusDraft,
		java.lang.String fieldId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vlegal.NoSuchVLegalDraftDocumentException;

	/**
	* Finds all the v legal draft documents where groupId = &#63; and statusDraft = &#63; and typeId = &#63;.
	*
	* @param groupId the group id to search with
	* @param statusDraft the status draft to search with
	* @param typeId the type id to search with
	* @return the matching v legal draft documents
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.vportal.portlet.vlegal.model.VLegalDraftDocument> findByP_S_T(
		long groupId, int statusDraft, java.lang.String typeId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Finds a range of all the v legal draft documents where groupId = &#63; and statusDraft = &#63; and typeId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param groupId the group id to search with
	* @param statusDraft the status draft to search with
	* @param typeId the type id to search with
	* @param start the lower bound of the range of v legal draft documents to return
	* @param end the upper bound of the range of v legal draft documents to return (not inclusive)
	* @return the range of matching v legal draft documents
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.vportal.portlet.vlegal.model.VLegalDraftDocument> findByP_S_T(
		long groupId, int statusDraft, java.lang.String typeId, int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Finds an ordered range of all the v legal draft documents where groupId = &#63; and statusDraft = &#63; and typeId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param groupId the group id to search with
	* @param statusDraft the status draft to search with
	* @param typeId the type id to search with
	* @param start the lower bound of the range of v legal draft documents to return
	* @param end the upper bound of the range of v legal draft documents to return (not inclusive)
	* @param orderByComparator the comparator to order the results by
	* @return the ordered range of matching v legal draft documents
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.vportal.portlet.vlegal.model.VLegalDraftDocument> findByP_S_T(
		long groupId, int statusDraft, java.lang.String typeId, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Finds the first v legal draft document in the ordered set where groupId = &#63; and statusDraft = &#63; and typeId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param groupId the group id to search with
	* @param statusDraft the status draft to search with
	* @param typeId the type id to search with
	* @param orderByComparator the comparator to order the set by
	* @return the first matching v legal draft document
	* @throws com.vportal.portlet.vlegal.NoSuchVLegalDraftDocumentException if a matching v legal draft document could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.vportal.portlet.vlegal.model.VLegalDraftDocument findByP_S_T_First(
		long groupId, int statusDraft, java.lang.String typeId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vlegal.NoSuchVLegalDraftDocumentException;

	/**
	* Finds the last v legal draft document in the ordered set where groupId = &#63; and statusDraft = &#63; and typeId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param groupId the group id to search with
	* @param statusDraft the status draft to search with
	* @param typeId the type id to search with
	* @param orderByComparator the comparator to order the set by
	* @return the last matching v legal draft document
	* @throws com.vportal.portlet.vlegal.NoSuchVLegalDraftDocumentException if a matching v legal draft document could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.vportal.portlet.vlegal.model.VLegalDraftDocument findByP_S_T_Last(
		long groupId, int statusDraft, java.lang.String typeId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vlegal.NoSuchVLegalDraftDocumentException;

	/**
	* Finds the v legal draft documents before and after the current v legal draft document in the ordered set where groupId = &#63; and statusDraft = &#63; and typeId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param draftId the primary key of the current v legal draft document
	* @param groupId the group id to search with
	* @param statusDraft the status draft to search with
	* @param typeId the type id to search with
	* @param orderByComparator the comparator to order the set by
	* @return the previous, current, and next v legal draft document
	* @throws com.vportal.portlet.vlegal.NoSuchVLegalDraftDocumentException if a v legal draft document with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.vportal.portlet.vlegal.model.VLegalDraftDocument[] findByP_S_T_PrevAndNext(
		java.lang.String draftId, long groupId, int statusDraft,
		java.lang.String typeId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vlegal.NoSuchVLegalDraftDocumentException;

	/**
	* Finds all the v legal draft documents where groupId = &#63; and statusDraft = &#63; and language = &#63;.
	*
	* @param groupId the group id to search with
	* @param statusDraft the status draft to search with
	* @param language the language to search with
	* @return the matching v legal draft documents
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.vportal.portlet.vlegal.model.VLegalDraftDocument> findByP_S_L(
		long groupId, int statusDraft, java.lang.String language)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Finds a range of all the v legal draft documents where groupId = &#63; and statusDraft = &#63; and language = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param groupId the group id to search with
	* @param statusDraft the status draft to search with
	* @param language the language to search with
	* @param start the lower bound of the range of v legal draft documents to return
	* @param end the upper bound of the range of v legal draft documents to return (not inclusive)
	* @return the range of matching v legal draft documents
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.vportal.portlet.vlegal.model.VLegalDraftDocument> findByP_S_L(
		long groupId, int statusDraft, java.lang.String language, int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Finds an ordered range of all the v legal draft documents where groupId = &#63; and statusDraft = &#63; and language = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param groupId the group id to search with
	* @param statusDraft the status draft to search with
	* @param language the language to search with
	* @param start the lower bound of the range of v legal draft documents to return
	* @param end the upper bound of the range of v legal draft documents to return (not inclusive)
	* @param orderByComparator the comparator to order the results by
	* @return the ordered range of matching v legal draft documents
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.vportal.portlet.vlegal.model.VLegalDraftDocument> findByP_S_L(
		long groupId, int statusDraft, java.lang.String language, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Finds the first v legal draft document in the ordered set where groupId = &#63; and statusDraft = &#63; and language = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param groupId the group id to search with
	* @param statusDraft the status draft to search with
	* @param language the language to search with
	* @param orderByComparator the comparator to order the set by
	* @return the first matching v legal draft document
	* @throws com.vportal.portlet.vlegal.NoSuchVLegalDraftDocumentException if a matching v legal draft document could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.vportal.portlet.vlegal.model.VLegalDraftDocument findByP_S_L_First(
		long groupId, int statusDraft, java.lang.String language,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vlegal.NoSuchVLegalDraftDocumentException;

	/**
	* Finds the last v legal draft document in the ordered set where groupId = &#63; and statusDraft = &#63; and language = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param groupId the group id to search with
	* @param statusDraft the status draft to search with
	* @param language the language to search with
	* @param orderByComparator the comparator to order the set by
	* @return the last matching v legal draft document
	* @throws com.vportal.portlet.vlegal.NoSuchVLegalDraftDocumentException if a matching v legal draft document could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.vportal.portlet.vlegal.model.VLegalDraftDocument findByP_S_L_Last(
		long groupId, int statusDraft, java.lang.String language,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vlegal.NoSuchVLegalDraftDocumentException;

	/**
	* Finds the v legal draft documents before and after the current v legal draft document in the ordered set where groupId = &#63; and statusDraft = &#63; and language = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param draftId the primary key of the current v legal draft document
	* @param groupId the group id to search with
	* @param statusDraft the status draft to search with
	* @param language the language to search with
	* @param orderByComparator the comparator to order the set by
	* @return the previous, current, and next v legal draft document
	* @throws com.vportal.portlet.vlegal.NoSuchVLegalDraftDocumentException if a v legal draft document with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.vportal.portlet.vlegal.model.VLegalDraftDocument[] findByP_S_L_PrevAndNext(
		java.lang.String draftId, long groupId, int statusDraft,
		java.lang.String language,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vlegal.NoSuchVLegalDraftDocumentException;

	/**
	* Finds all the v legal draft documents where groupId = &#63; and language = &#63;.
	*
	* @param groupId the group id to search with
	* @param language the language to search with
	* @return the matching v legal draft documents
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.vportal.portlet.vlegal.model.VLegalDraftDocument> findByP_L(
		long groupId, java.lang.String language)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Finds a range of all the v legal draft documents where groupId = &#63; and language = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param groupId the group id to search with
	* @param language the language to search with
	* @param start the lower bound of the range of v legal draft documents to return
	* @param end the upper bound of the range of v legal draft documents to return (not inclusive)
	* @return the range of matching v legal draft documents
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.vportal.portlet.vlegal.model.VLegalDraftDocument> findByP_L(
		long groupId, java.lang.String language, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Finds an ordered range of all the v legal draft documents where groupId = &#63; and language = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param groupId the group id to search with
	* @param language the language to search with
	* @param start the lower bound of the range of v legal draft documents to return
	* @param end the upper bound of the range of v legal draft documents to return (not inclusive)
	* @param orderByComparator the comparator to order the results by
	* @return the ordered range of matching v legal draft documents
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.vportal.portlet.vlegal.model.VLegalDraftDocument> findByP_L(
		long groupId, java.lang.String language, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Finds the first v legal draft document in the ordered set where groupId = &#63; and language = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param groupId the group id to search with
	* @param language the language to search with
	* @param orderByComparator the comparator to order the set by
	* @return the first matching v legal draft document
	* @throws com.vportal.portlet.vlegal.NoSuchVLegalDraftDocumentException if a matching v legal draft document could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.vportal.portlet.vlegal.model.VLegalDraftDocument findByP_L_First(
		long groupId, java.lang.String language,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vlegal.NoSuchVLegalDraftDocumentException;

	/**
	* Finds the last v legal draft document in the ordered set where groupId = &#63; and language = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param groupId the group id to search with
	* @param language the language to search with
	* @param orderByComparator the comparator to order the set by
	* @return the last matching v legal draft document
	* @throws com.vportal.portlet.vlegal.NoSuchVLegalDraftDocumentException if a matching v legal draft document could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.vportal.portlet.vlegal.model.VLegalDraftDocument findByP_L_Last(
		long groupId, java.lang.String language,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vlegal.NoSuchVLegalDraftDocumentException;

	/**
	* Finds the v legal draft documents before and after the current v legal draft document in the ordered set where groupId = &#63; and language = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param draftId the primary key of the current v legal draft document
	* @param groupId the group id to search with
	* @param language the language to search with
	* @param orderByComparator the comparator to order the set by
	* @return the previous, current, and next v legal draft document
	* @throws com.vportal.portlet.vlegal.NoSuchVLegalDraftDocumentException if a v legal draft document with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.vportal.portlet.vlegal.model.VLegalDraftDocument[] findByP_L_PrevAndNext(
		java.lang.String draftId, long groupId, java.lang.String language,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vlegal.NoSuchVLegalDraftDocumentException;

	/**
	* Finds all the v legal draft documents where groupId = &#63; and statusDraft = &#63; and createdByUser = &#63; and language = &#63;.
	*
	* @param groupId the group id to search with
	* @param statusDraft the status draft to search with
	* @param createdByUser the created by user to search with
	* @param language the language to search with
	* @return the matching v legal draft documents
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.vportal.portlet.vlegal.model.VLegalDraftDocument> findByP_S_U_L(
		long groupId, int statusDraft, long createdByUser,
		java.lang.String language)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Finds a range of all the v legal draft documents where groupId = &#63; and statusDraft = &#63; and createdByUser = &#63; and language = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param groupId the group id to search with
	* @param statusDraft the status draft to search with
	* @param createdByUser the created by user to search with
	* @param language the language to search with
	* @param start the lower bound of the range of v legal draft documents to return
	* @param end the upper bound of the range of v legal draft documents to return (not inclusive)
	* @return the range of matching v legal draft documents
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.vportal.portlet.vlegal.model.VLegalDraftDocument> findByP_S_U_L(
		long groupId, int statusDraft, long createdByUser,
		java.lang.String language, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Finds an ordered range of all the v legal draft documents where groupId = &#63; and statusDraft = &#63; and createdByUser = &#63; and language = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param groupId the group id to search with
	* @param statusDraft the status draft to search with
	* @param createdByUser the created by user to search with
	* @param language the language to search with
	* @param start the lower bound of the range of v legal draft documents to return
	* @param end the upper bound of the range of v legal draft documents to return (not inclusive)
	* @param orderByComparator the comparator to order the results by
	* @return the ordered range of matching v legal draft documents
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.vportal.portlet.vlegal.model.VLegalDraftDocument> findByP_S_U_L(
		long groupId, int statusDraft, long createdByUser,
		java.lang.String language, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Finds the first v legal draft document in the ordered set where groupId = &#63; and statusDraft = &#63; and createdByUser = &#63; and language = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param groupId the group id to search with
	* @param statusDraft the status draft to search with
	* @param createdByUser the created by user to search with
	* @param language the language to search with
	* @param orderByComparator the comparator to order the set by
	* @return the first matching v legal draft document
	* @throws com.vportal.portlet.vlegal.NoSuchVLegalDraftDocumentException if a matching v legal draft document could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.vportal.portlet.vlegal.model.VLegalDraftDocument findByP_S_U_L_First(
		long groupId, int statusDraft, long createdByUser,
		java.lang.String language,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vlegal.NoSuchVLegalDraftDocumentException;

	/**
	* Finds the last v legal draft document in the ordered set where groupId = &#63; and statusDraft = &#63; and createdByUser = &#63; and language = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param groupId the group id to search with
	* @param statusDraft the status draft to search with
	* @param createdByUser the created by user to search with
	* @param language the language to search with
	* @param orderByComparator the comparator to order the set by
	* @return the last matching v legal draft document
	* @throws com.vportal.portlet.vlegal.NoSuchVLegalDraftDocumentException if a matching v legal draft document could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.vportal.portlet.vlegal.model.VLegalDraftDocument findByP_S_U_L_Last(
		long groupId, int statusDraft, long createdByUser,
		java.lang.String language,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vlegal.NoSuchVLegalDraftDocumentException;

	/**
	* Finds the v legal draft documents before and after the current v legal draft document in the ordered set where groupId = &#63; and statusDraft = &#63; and createdByUser = &#63; and language = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param draftId the primary key of the current v legal draft document
	* @param groupId the group id to search with
	* @param statusDraft the status draft to search with
	* @param createdByUser the created by user to search with
	* @param language the language to search with
	* @param orderByComparator the comparator to order the set by
	* @return the previous, current, and next v legal draft document
	* @throws com.vportal.portlet.vlegal.NoSuchVLegalDraftDocumentException if a v legal draft document with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.vportal.portlet.vlegal.model.VLegalDraftDocument[] findByP_S_U_L_PrevAndNext(
		java.lang.String draftId, long groupId, int statusDraft,
		long createdByUser, java.lang.String language,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vlegal.NoSuchVLegalDraftDocumentException;

	/**
	* Finds all the v legal draft documents where docCode = &#63;.
	*
	* @param docCode the doc code to search with
	* @return the matching v legal draft documents
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.vportal.portlet.vlegal.model.VLegalDraftDocument> findByDocCode(
		java.lang.String docCode)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Finds a range of all the v legal draft documents where docCode = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param docCode the doc code to search with
	* @param start the lower bound of the range of v legal draft documents to return
	* @param end the upper bound of the range of v legal draft documents to return (not inclusive)
	* @return the range of matching v legal draft documents
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.vportal.portlet.vlegal.model.VLegalDraftDocument> findByDocCode(
		java.lang.String docCode, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Finds an ordered range of all the v legal draft documents where docCode = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param docCode the doc code to search with
	* @param start the lower bound of the range of v legal draft documents to return
	* @param end the upper bound of the range of v legal draft documents to return (not inclusive)
	* @param orderByComparator the comparator to order the results by
	* @return the ordered range of matching v legal draft documents
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.vportal.portlet.vlegal.model.VLegalDraftDocument> findByDocCode(
		java.lang.String docCode, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Finds the first v legal draft document in the ordered set where docCode = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param docCode the doc code to search with
	* @param orderByComparator the comparator to order the set by
	* @return the first matching v legal draft document
	* @throws com.vportal.portlet.vlegal.NoSuchVLegalDraftDocumentException if a matching v legal draft document could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.vportal.portlet.vlegal.model.VLegalDraftDocument findByDocCode_First(
		java.lang.String docCode,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vlegal.NoSuchVLegalDraftDocumentException;

	/**
	* Finds the last v legal draft document in the ordered set where docCode = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param docCode the doc code to search with
	* @param orderByComparator the comparator to order the set by
	* @return the last matching v legal draft document
	* @throws com.vportal.portlet.vlegal.NoSuchVLegalDraftDocumentException if a matching v legal draft document could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.vportal.portlet.vlegal.model.VLegalDraftDocument findByDocCode_Last(
		java.lang.String docCode,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vlegal.NoSuchVLegalDraftDocumentException;

	/**
	* Finds the v legal draft documents before and after the current v legal draft document in the ordered set where docCode = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param draftId the primary key of the current v legal draft document
	* @param docCode the doc code to search with
	* @param orderByComparator the comparator to order the set by
	* @return the previous, current, and next v legal draft document
	* @throws com.vportal.portlet.vlegal.NoSuchVLegalDraftDocumentException if a v legal draft document with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.vportal.portlet.vlegal.model.VLegalDraftDocument[] findByDocCode_PrevAndNext(
		java.lang.String draftId, java.lang.String docCode,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vlegal.NoSuchVLegalDraftDocumentException;

	/**
	* Finds all the v legal draft documents.
	*
	* @return the v legal draft documents
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.vportal.portlet.vlegal.model.VLegalDraftDocument> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Finds a range of all the v legal draft documents.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of v legal draft documents to return
	* @param end the upper bound of the range of v legal draft documents to return (not inclusive)
	* @return the range of v legal draft documents
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.vportal.portlet.vlegal.model.VLegalDraftDocument> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Finds an ordered range of all the v legal draft documents.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of v legal draft documents to return
	* @param end the upper bound of the range of v legal draft documents to return (not inclusive)
	* @param orderByComparator the comparator to order the results by
	* @return the ordered range of v legal draft documents
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.vportal.portlet.vlegal.model.VLegalDraftDocument> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the v legal draft documents where groupId = &#63; from the database.
	*
	* @param groupId the group id to search with
	* @throws SystemException if a system exception occurred
	*/
	public void removeByGroupId(long groupId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes the v legal draft document where groupId = &#63; and draftId = &#63; from the database.
	*
	* @param groupId the group id to search with
	* @param draftId the draft id to search with
	* @throws SystemException if a system exception occurred
	*/
	public void removeByG_D(long groupId, java.lang.String draftId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vlegal.NoSuchVLegalDraftDocumentException;

	/**
	* Removes all the v legal draft documents where groupId = &#63; and statusDraft = &#63; and docCode = &#63; from the database.
	*
	* @param groupId the group id to search with
	* @param statusDraft the status draft to search with
	* @param docCode the doc code to search with
	* @throws SystemException if a system exception occurred
	*/
	public void removeByP_S_D(long groupId, int statusDraft,
		java.lang.String docCode)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the v legal draft documents where groupId = &#63; and statusDraft = &#63; and fieldId = &#63; from the database.
	*
	* @param groupId the group id to search with
	* @param statusDraft the status draft to search with
	* @param fieldId the field id to search with
	* @throws SystemException if a system exception occurred
	*/
	public void removeByP_S_F(long groupId, int statusDraft,
		java.lang.String fieldId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the v legal draft documents where groupId = &#63; and statusDraft = &#63; and typeId = &#63; from the database.
	*
	* @param groupId the group id to search with
	* @param statusDraft the status draft to search with
	* @param typeId the type id to search with
	* @throws SystemException if a system exception occurred
	*/
	public void removeByP_S_T(long groupId, int statusDraft,
		java.lang.String typeId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the v legal draft documents where groupId = &#63; and statusDraft = &#63; and language = &#63; from the database.
	*
	* @param groupId the group id to search with
	* @param statusDraft the status draft to search with
	* @param language the language to search with
	* @throws SystemException if a system exception occurred
	*/
	public void removeByP_S_L(long groupId, int statusDraft,
		java.lang.String language)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the v legal draft documents where groupId = &#63; and language = &#63; from the database.
	*
	* @param groupId the group id to search with
	* @param language the language to search with
	* @throws SystemException if a system exception occurred
	*/
	public void removeByP_L(long groupId, java.lang.String language)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the v legal draft documents where groupId = &#63; and statusDraft = &#63; and createdByUser = &#63; and language = &#63; from the database.
	*
	* @param groupId the group id to search with
	* @param statusDraft the status draft to search with
	* @param createdByUser the created by user to search with
	* @param language the language to search with
	* @throws SystemException if a system exception occurred
	*/
	public void removeByP_S_U_L(long groupId, int statusDraft,
		long createdByUser, java.lang.String language)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the v legal draft documents where docCode = &#63; from the database.
	*
	* @param docCode the doc code to search with
	* @throws SystemException if a system exception occurred
	*/
	public void removeByDocCode(java.lang.String docCode)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the v legal draft documents from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Counts all the v legal draft documents where groupId = &#63;.
	*
	* @param groupId the group id to search with
	* @return the number of matching v legal draft documents
	* @throws SystemException if a system exception occurred
	*/
	public int countByGroupId(long groupId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Counts all the v legal draft documents where groupId = &#63; and draftId = &#63;.
	*
	* @param groupId the group id to search with
	* @param draftId the draft id to search with
	* @return the number of matching v legal draft documents
	* @throws SystemException if a system exception occurred
	*/
	public int countByG_D(long groupId, java.lang.String draftId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Counts all the v legal draft documents where groupId = &#63; and statusDraft = &#63; and docCode = &#63;.
	*
	* @param groupId the group id to search with
	* @param statusDraft the status draft to search with
	* @param docCode the doc code to search with
	* @return the number of matching v legal draft documents
	* @throws SystemException if a system exception occurred
	*/
	public int countByP_S_D(long groupId, int statusDraft,
		java.lang.String docCode)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Counts all the v legal draft documents where groupId = &#63; and statusDraft = &#63; and fieldId = &#63;.
	*
	* @param groupId the group id to search with
	* @param statusDraft the status draft to search with
	* @param fieldId the field id to search with
	* @return the number of matching v legal draft documents
	* @throws SystemException if a system exception occurred
	*/
	public int countByP_S_F(long groupId, int statusDraft,
		java.lang.String fieldId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Counts all the v legal draft documents where groupId = &#63; and statusDraft = &#63; and typeId = &#63;.
	*
	* @param groupId the group id to search with
	* @param statusDraft the status draft to search with
	* @param typeId the type id to search with
	* @return the number of matching v legal draft documents
	* @throws SystemException if a system exception occurred
	*/
	public int countByP_S_T(long groupId, int statusDraft,
		java.lang.String typeId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Counts all the v legal draft documents where groupId = &#63; and statusDraft = &#63; and language = &#63;.
	*
	* @param groupId the group id to search with
	* @param statusDraft the status draft to search with
	* @param language the language to search with
	* @return the number of matching v legal draft documents
	* @throws SystemException if a system exception occurred
	*/
	public int countByP_S_L(long groupId, int statusDraft,
		java.lang.String language)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Counts all the v legal draft documents where groupId = &#63; and language = &#63;.
	*
	* @param groupId the group id to search with
	* @param language the language to search with
	* @return the number of matching v legal draft documents
	* @throws SystemException if a system exception occurred
	*/
	public int countByP_L(long groupId, java.lang.String language)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Counts all the v legal draft documents where groupId = &#63; and statusDraft = &#63; and createdByUser = &#63; and language = &#63;.
	*
	* @param groupId the group id to search with
	* @param statusDraft the status draft to search with
	* @param createdByUser the created by user to search with
	* @param language the language to search with
	* @return the number of matching v legal draft documents
	* @throws SystemException if a system exception occurred
	*/
	public int countByP_S_U_L(long groupId, int statusDraft,
		long createdByUser, java.lang.String language)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Counts all the v legal draft documents where docCode = &#63;.
	*
	* @param docCode the doc code to search with
	* @return the number of matching v legal draft documents
	* @throws SystemException if a system exception occurred
	*/
	public int countByDocCode(java.lang.String docCode)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Counts all the v legal draft documents.
	*
	* @return the number of v legal draft documents
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}