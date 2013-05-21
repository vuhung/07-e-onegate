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

import com.vportal.portlet.vlegal.model.VLegalDocument;

/**
 * The persistence interface for the v legal document service.
 *
 * <p>
 * Never modify or reference this interface directly. Always use {@link VLegalDocumentUtil} to access the v legal document persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
 * </p>
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author ACB
 * @see VLegalDocumentPersistenceImpl
 * @see VLegalDocumentUtil
 * @generated
 */
public interface VLegalDocumentPersistence extends BasePersistence<VLegalDocument> {
	/**
	* Caches the v legal document in the entity cache if it is enabled.
	*
	* @param vLegalDocument the v legal document to cache
	*/
	public void cacheResult(
		com.vportal.portlet.vlegal.model.VLegalDocument vLegalDocument);

	/**
	* Caches the v legal documents in the entity cache if it is enabled.
	*
	* @param vLegalDocuments the v legal documents to cache
	*/
	public void cacheResult(
		java.util.List<com.vportal.portlet.vlegal.model.VLegalDocument> vLegalDocuments);

	/**
	* Creates a new v legal document with the primary key. Does not add the v legal document to the database.
	*
	* @param docId the primary key for the new v legal document
	* @return the new v legal document
	*/
	public com.vportal.portlet.vlegal.model.VLegalDocument create(
		java.lang.String docId);

	/**
	* Removes the v legal document with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param docId the primary key of the v legal document to remove
	* @return the v legal document that was removed
	* @throws com.vportal.portlet.vlegal.NoSuchVLegalDocumentException if a v legal document with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.vportal.portlet.vlegal.model.VLegalDocument remove(
		java.lang.String docId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vlegal.NoSuchVLegalDocumentException;

	public com.vportal.portlet.vlegal.model.VLegalDocument updateImpl(
		com.vportal.portlet.vlegal.model.VLegalDocument vLegalDocument,
		boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Finds the v legal document with the primary key or throws a {@link com.vportal.portlet.vlegal.NoSuchVLegalDocumentException} if it could not be found.
	*
	* @param docId the primary key of the v legal document to find
	* @return the v legal document
	* @throws com.vportal.portlet.vlegal.NoSuchVLegalDocumentException if a v legal document with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.vportal.portlet.vlegal.model.VLegalDocument findByPrimaryKey(
		java.lang.String docId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vlegal.NoSuchVLegalDocumentException;

	/**
	* Finds the v legal document with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param docId the primary key of the v legal document to find
	* @return the v legal document, or <code>null</code> if a v legal document with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.vportal.portlet.vlegal.model.VLegalDocument fetchByPrimaryKey(
		java.lang.String docId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Finds all the v legal documents where groupId = &#63;.
	*
	* @param groupId the group id to search with
	* @return the matching v legal documents
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.vportal.portlet.vlegal.model.VLegalDocument> findByGroupId(
		long groupId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Finds a range of all the v legal documents where groupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param groupId the group id to search with
	* @param start the lower bound of the range of v legal documents to return
	* @param end the upper bound of the range of v legal documents to return (not inclusive)
	* @return the range of matching v legal documents
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.vportal.portlet.vlegal.model.VLegalDocument> findByGroupId(
		long groupId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Finds an ordered range of all the v legal documents where groupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param groupId the group id to search with
	* @param start the lower bound of the range of v legal documents to return
	* @param end the upper bound of the range of v legal documents to return (not inclusive)
	* @param orderByComparator the comparator to order the results by
	* @return the ordered range of matching v legal documents
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.vportal.portlet.vlegal.model.VLegalDocument> findByGroupId(
		long groupId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Finds the first v legal document in the ordered set where groupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param groupId the group id to search with
	* @param orderByComparator the comparator to order the set by
	* @return the first matching v legal document
	* @throws com.vportal.portlet.vlegal.NoSuchVLegalDocumentException if a matching v legal document could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.vportal.portlet.vlegal.model.VLegalDocument findByGroupId_First(
		long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vlegal.NoSuchVLegalDocumentException;

	/**
	* Finds the last v legal document in the ordered set where groupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param groupId the group id to search with
	* @param orderByComparator the comparator to order the set by
	* @return the last matching v legal document
	* @throws com.vportal.portlet.vlegal.NoSuchVLegalDocumentException if a matching v legal document could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.vportal.portlet.vlegal.model.VLegalDocument findByGroupId_Last(
		long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vlegal.NoSuchVLegalDocumentException;

	/**
	* Finds the v legal documents before and after the current v legal document in the ordered set where groupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param docId the primary key of the current v legal document
	* @param groupId the group id to search with
	* @param orderByComparator the comparator to order the set by
	* @return the previous, current, and next v legal document
	* @throws com.vportal.portlet.vlegal.NoSuchVLegalDocumentException if a v legal document with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.vportal.portlet.vlegal.model.VLegalDocument[] findByGroupId_PrevAndNext(
		java.lang.String docId, long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vlegal.NoSuchVLegalDocumentException;

	/**
	* Finds all the v legal documents where language = &#63; and promulDate = &#63; and statusDoc = &#63;.
	*
	* @param language the language to search with
	* @param promulDate the promul date to search with
	* @param statusDoc the status doc to search with
	* @return the matching v legal documents
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.vportal.portlet.vlegal.model.VLegalDocument> findByPromulDate(
		java.lang.String language, java.util.Date promulDate, int statusDoc)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Finds a range of all the v legal documents where language = &#63; and promulDate = &#63; and statusDoc = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param language the language to search with
	* @param promulDate the promul date to search with
	* @param statusDoc the status doc to search with
	* @param start the lower bound of the range of v legal documents to return
	* @param end the upper bound of the range of v legal documents to return (not inclusive)
	* @return the range of matching v legal documents
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.vportal.portlet.vlegal.model.VLegalDocument> findByPromulDate(
		java.lang.String language, java.util.Date promulDate, int statusDoc,
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Finds an ordered range of all the v legal documents where language = &#63; and promulDate = &#63; and statusDoc = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param language the language to search with
	* @param promulDate the promul date to search with
	* @param statusDoc the status doc to search with
	* @param start the lower bound of the range of v legal documents to return
	* @param end the upper bound of the range of v legal documents to return (not inclusive)
	* @param orderByComparator the comparator to order the results by
	* @return the ordered range of matching v legal documents
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.vportal.portlet.vlegal.model.VLegalDocument> findByPromulDate(
		java.lang.String language, java.util.Date promulDate, int statusDoc,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Finds the first v legal document in the ordered set where language = &#63; and promulDate = &#63; and statusDoc = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param language the language to search with
	* @param promulDate the promul date to search with
	* @param statusDoc the status doc to search with
	* @param orderByComparator the comparator to order the set by
	* @return the first matching v legal document
	* @throws com.vportal.portlet.vlegal.NoSuchVLegalDocumentException if a matching v legal document could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.vportal.portlet.vlegal.model.VLegalDocument findByPromulDate_First(
		java.lang.String language, java.util.Date promulDate, int statusDoc,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vlegal.NoSuchVLegalDocumentException;

	/**
	* Finds the last v legal document in the ordered set where language = &#63; and promulDate = &#63; and statusDoc = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param language the language to search with
	* @param promulDate the promul date to search with
	* @param statusDoc the status doc to search with
	* @param orderByComparator the comparator to order the set by
	* @return the last matching v legal document
	* @throws com.vportal.portlet.vlegal.NoSuchVLegalDocumentException if a matching v legal document could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.vportal.portlet.vlegal.model.VLegalDocument findByPromulDate_Last(
		java.lang.String language, java.util.Date promulDate, int statusDoc,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vlegal.NoSuchVLegalDocumentException;

	/**
	* Finds the v legal documents before and after the current v legal document in the ordered set where language = &#63; and promulDate = &#63; and statusDoc = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param docId the primary key of the current v legal document
	* @param language the language to search with
	* @param promulDate the promul date to search with
	* @param statusDoc the status doc to search with
	* @param orderByComparator the comparator to order the set by
	* @return the previous, current, and next v legal document
	* @throws com.vportal.portlet.vlegal.NoSuchVLegalDocumentException if a v legal document with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.vportal.portlet.vlegal.model.VLegalDocument[] findByPromulDate_PrevAndNext(
		java.lang.String docId, java.lang.String language,
		java.util.Date promulDate, int statusDoc,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vlegal.NoSuchVLegalDocumentException;

	/**
	* Finds all the v legal documents where groupId = &#63; and language = &#63;.
	*
	* @param groupId the group id to search with
	* @param language the language to search with
	* @return the matching v legal documents
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.vportal.portlet.vlegal.model.VLegalDocument> findByG_L(
		long groupId, java.lang.String language)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Finds a range of all the v legal documents where groupId = &#63; and language = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param groupId the group id to search with
	* @param language the language to search with
	* @param start the lower bound of the range of v legal documents to return
	* @param end the upper bound of the range of v legal documents to return (not inclusive)
	* @return the range of matching v legal documents
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.vportal.portlet.vlegal.model.VLegalDocument> findByG_L(
		long groupId, java.lang.String language, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Finds an ordered range of all the v legal documents where groupId = &#63; and language = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param groupId the group id to search with
	* @param language the language to search with
	* @param start the lower bound of the range of v legal documents to return
	* @param end the upper bound of the range of v legal documents to return (not inclusive)
	* @param orderByComparator the comparator to order the results by
	* @return the ordered range of matching v legal documents
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.vportal.portlet.vlegal.model.VLegalDocument> findByG_L(
		long groupId, java.lang.String language, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Finds the first v legal document in the ordered set where groupId = &#63; and language = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param groupId the group id to search with
	* @param language the language to search with
	* @param orderByComparator the comparator to order the set by
	* @return the first matching v legal document
	* @throws com.vportal.portlet.vlegal.NoSuchVLegalDocumentException if a matching v legal document could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.vportal.portlet.vlegal.model.VLegalDocument findByG_L_First(
		long groupId, java.lang.String language,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vlegal.NoSuchVLegalDocumentException;

	/**
	* Finds the last v legal document in the ordered set where groupId = &#63; and language = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param groupId the group id to search with
	* @param language the language to search with
	* @param orderByComparator the comparator to order the set by
	* @return the last matching v legal document
	* @throws com.vportal.portlet.vlegal.NoSuchVLegalDocumentException if a matching v legal document could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.vportal.portlet.vlegal.model.VLegalDocument findByG_L_Last(
		long groupId, java.lang.String language,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vlegal.NoSuchVLegalDocumentException;

	/**
	* Finds the v legal documents before and after the current v legal document in the ordered set where groupId = &#63; and language = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param docId the primary key of the current v legal document
	* @param groupId the group id to search with
	* @param language the language to search with
	* @param orderByComparator the comparator to order the set by
	* @return the previous, current, and next v legal document
	* @throws com.vportal.portlet.vlegal.NoSuchVLegalDocumentException if a v legal document with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.vportal.portlet.vlegal.model.VLegalDocument[] findByG_L_PrevAndNext(
		java.lang.String docId, long groupId, java.lang.String language,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vlegal.NoSuchVLegalDocumentException;

	/**
	* Finds all the v legal documents where groupId = &#63; and typeDocId = &#63; and orgId = &#63; and fieldId = &#63; and language = &#63; and statusDoc = &#63;.
	*
	* @param groupId the group id to search with
	* @param typeDocId the type doc id to search with
	* @param orgId the org id to search with
	* @param fieldId the field id to search with
	* @param language the language to search with
	* @param statusDoc the status doc to search with
	* @return the matching v legal documents
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.vportal.portlet.vlegal.model.VLegalDocument> findByDocsByF_O_T_L_S(
		long groupId, java.lang.String typeDocId, java.lang.String orgId,
		java.lang.String fieldId, java.lang.String language, int statusDoc)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Finds a range of all the v legal documents where groupId = &#63; and typeDocId = &#63; and orgId = &#63; and fieldId = &#63; and language = &#63; and statusDoc = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param groupId the group id to search with
	* @param typeDocId the type doc id to search with
	* @param orgId the org id to search with
	* @param fieldId the field id to search with
	* @param language the language to search with
	* @param statusDoc the status doc to search with
	* @param start the lower bound of the range of v legal documents to return
	* @param end the upper bound of the range of v legal documents to return (not inclusive)
	* @return the range of matching v legal documents
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.vportal.portlet.vlegal.model.VLegalDocument> findByDocsByF_O_T_L_S(
		long groupId, java.lang.String typeDocId, java.lang.String orgId,
		java.lang.String fieldId, java.lang.String language, int statusDoc,
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Finds an ordered range of all the v legal documents where groupId = &#63; and typeDocId = &#63; and orgId = &#63; and fieldId = &#63; and language = &#63; and statusDoc = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param groupId the group id to search with
	* @param typeDocId the type doc id to search with
	* @param orgId the org id to search with
	* @param fieldId the field id to search with
	* @param language the language to search with
	* @param statusDoc the status doc to search with
	* @param start the lower bound of the range of v legal documents to return
	* @param end the upper bound of the range of v legal documents to return (not inclusive)
	* @param orderByComparator the comparator to order the results by
	* @return the ordered range of matching v legal documents
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.vportal.portlet.vlegal.model.VLegalDocument> findByDocsByF_O_T_L_S(
		long groupId, java.lang.String typeDocId, java.lang.String orgId,
		java.lang.String fieldId, java.lang.String language, int statusDoc,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Finds the first v legal document in the ordered set where groupId = &#63; and typeDocId = &#63; and orgId = &#63; and fieldId = &#63; and language = &#63; and statusDoc = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param groupId the group id to search with
	* @param typeDocId the type doc id to search with
	* @param orgId the org id to search with
	* @param fieldId the field id to search with
	* @param language the language to search with
	* @param statusDoc the status doc to search with
	* @param orderByComparator the comparator to order the set by
	* @return the first matching v legal document
	* @throws com.vportal.portlet.vlegal.NoSuchVLegalDocumentException if a matching v legal document could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.vportal.portlet.vlegal.model.VLegalDocument findByDocsByF_O_T_L_S_First(
		long groupId, java.lang.String typeDocId, java.lang.String orgId,
		java.lang.String fieldId, java.lang.String language, int statusDoc,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vlegal.NoSuchVLegalDocumentException;

	/**
	* Finds the last v legal document in the ordered set where groupId = &#63; and typeDocId = &#63; and orgId = &#63; and fieldId = &#63; and language = &#63; and statusDoc = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param groupId the group id to search with
	* @param typeDocId the type doc id to search with
	* @param orgId the org id to search with
	* @param fieldId the field id to search with
	* @param language the language to search with
	* @param statusDoc the status doc to search with
	* @param orderByComparator the comparator to order the set by
	* @return the last matching v legal document
	* @throws com.vportal.portlet.vlegal.NoSuchVLegalDocumentException if a matching v legal document could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.vportal.portlet.vlegal.model.VLegalDocument findByDocsByF_O_T_L_S_Last(
		long groupId, java.lang.String typeDocId, java.lang.String orgId,
		java.lang.String fieldId, java.lang.String language, int statusDoc,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vlegal.NoSuchVLegalDocumentException;

	/**
	* Finds the v legal documents before and after the current v legal document in the ordered set where groupId = &#63; and typeDocId = &#63; and orgId = &#63; and fieldId = &#63; and language = &#63; and statusDoc = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param docId the primary key of the current v legal document
	* @param groupId the group id to search with
	* @param typeDocId the type doc id to search with
	* @param orgId the org id to search with
	* @param fieldId the field id to search with
	* @param language the language to search with
	* @param statusDoc the status doc to search with
	* @param orderByComparator the comparator to order the set by
	* @return the previous, current, and next v legal document
	* @throws com.vportal.portlet.vlegal.NoSuchVLegalDocumentException if a v legal document with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.vportal.portlet.vlegal.model.VLegalDocument[] findByDocsByF_O_T_L_S_PrevAndNext(
		java.lang.String docId, long groupId, java.lang.String typeDocId,
		java.lang.String orgId, java.lang.String fieldId,
		java.lang.String language, int statusDoc,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vlegal.NoSuchVLegalDocumentException;

	/**
	* Finds all the v legal documents where typeDocId = &#63; and orgId = &#63; and fieldId = &#63; and language = &#63; and statusDoc = &#63;.
	*
	* @param typeDocId the type doc id to search with
	* @param orgId the org id to search with
	* @param fieldId the field id to search with
	* @param language the language to search with
	* @param statusDoc the status doc to search with
	* @return the matching v legal documents
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.vportal.portlet.vlegal.model.VLegalDocument> findByDocsByF_T_O_L_S(
		java.lang.String typeDocId, java.lang.String orgId,
		java.lang.String fieldId, java.lang.String language, int statusDoc)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Finds a range of all the v legal documents where typeDocId = &#63; and orgId = &#63; and fieldId = &#63; and language = &#63; and statusDoc = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param typeDocId the type doc id to search with
	* @param orgId the org id to search with
	* @param fieldId the field id to search with
	* @param language the language to search with
	* @param statusDoc the status doc to search with
	* @param start the lower bound of the range of v legal documents to return
	* @param end the upper bound of the range of v legal documents to return (not inclusive)
	* @return the range of matching v legal documents
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.vportal.portlet.vlegal.model.VLegalDocument> findByDocsByF_T_O_L_S(
		java.lang.String typeDocId, java.lang.String orgId,
		java.lang.String fieldId, java.lang.String language, int statusDoc,
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Finds an ordered range of all the v legal documents where typeDocId = &#63; and orgId = &#63; and fieldId = &#63; and language = &#63; and statusDoc = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param typeDocId the type doc id to search with
	* @param orgId the org id to search with
	* @param fieldId the field id to search with
	* @param language the language to search with
	* @param statusDoc the status doc to search with
	* @param start the lower bound of the range of v legal documents to return
	* @param end the upper bound of the range of v legal documents to return (not inclusive)
	* @param orderByComparator the comparator to order the results by
	* @return the ordered range of matching v legal documents
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.vportal.portlet.vlegal.model.VLegalDocument> findByDocsByF_T_O_L_S(
		java.lang.String typeDocId, java.lang.String orgId,
		java.lang.String fieldId, java.lang.String language, int statusDoc,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Finds the first v legal document in the ordered set where typeDocId = &#63; and orgId = &#63; and fieldId = &#63; and language = &#63; and statusDoc = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param typeDocId the type doc id to search with
	* @param orgId the org id to search with
	* @param fieldId the field id to search with
	* @param language the language to search with
	* @param statusDoc the status doc to search with
	* @param orderByComparator the comparator to order the set by
	* @return the first matching v legal document
	* @throws com.vportal.portlet.vlegal.NoSuchVLegalDocumentException if a matching v legal document could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.vportal.portlet.vlegal.model.VLegalDocument findByDocsByF_T_O_L_S_First(
		java.lang.String typeDocId, java.lang.String orgId,
		java.lang.String fieldId, java.lang.String language, int statusDoc,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vlegal.NoSuchVLegalDocumentException;

	/**
	* Finds the last v legal document in the ordered set where typeDocId = &#63; and orgId = &#63; and fieldId = &#63; and language = &#63; and statusDoc = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param typeDocId the type doc id to search with
	* @param orgId the org id to search with
	* @param fieldId the field id to search with
	* @param language the language to search with
	* @param statusDoc the status doc to search with
	* @param orderByComparator the comparator to order the set by
	* @return the last matching v legal document
	* @throws com.vportal.portlet.vlegal.NoSuchVLegalDocumentException if a matching v legal document could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.vportal.portlet.vlegal.model.VLegalDocument findByDocsByF_T_O_L_S_Last(
		java.lang.String typeDocId, java.lang.String orgId,
		java.lang.String fieldId, java.lang.String language, int statusDoc,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vlegal.NoSuchVLegalDocumentException;

	/**
	* Finds the v legal documents before and after the current v legal document in the ordered set where typeDocId = &#63; and orgId = &#63; and fieldId = &#63; and language = &#63; and statusDoc = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param docId the primary key of the current v legal document
	* @param typeDocId the type doc id to search with
	* @param orgId the org id to search with
	* @param fieldId the field id to search with
	* @param language the language to search with
	* @param statusDoc the status doc to search with
	* @param orderByComparator the comparator to order the set by
	* @return the previous, current, and next v legal document
	* @throws com.vportal.portlet.vlegal.NoSuchVLegalDocumentException if a v legal document with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.vportal.portlet.vlegal.model.VLegalDocument[] findByDocsByF_T_O_L_S_PrevAndNext(
		java.lang.String docId, java.lang.String typeDocId,
		java.lang.String orgId, java.lang.String fieldId,
		java.lang.String language, int statusDoc,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vlegal.NoSuchVLegalDocumentException;

	/**
	* Finds all the v legal documents where companyId = &#63; and typeDocId = &#63; and orgId = &#63; and fieldId = &#63; and language = &#63; and statusDoc = &#63;.
	*
	* @param companyId the company id to search with
	* @param typeDocId the type doc id to search with
	* @param orgId the org id to search with
	* @param fieldId the field id to search with
	* @param language the language to search with
	* @param statusDoc the status doc to search with
	* @return the matching v legal documents
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.vportal.portlet.vlegal.model.VLegalDocument> findByDocsByF_C_O_T_L_S(
		long companyId, java.lang.String typeDocId, java.lang.String orgId,
		java.lang.String fieldId, java.lang.String language, int statusDoc)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Finds a range of all the v legal documents where companyId = &#63; and typeDocId = &#63; and orgId = &#63; and fieldId = &#63; and language = &#63; and statusDoc = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param companyId the company id to search with
	* @param typeDocId the type doc id to search with
	* @param orgId the org id to search with
	* @param fieldId the field id to search with
	* @param language the language to search with
	* @param statusDoc the status doc to search with
	* @param start the lower bound of the range of v legal documents to return
	* @param end the upper bound of the range of v legal documents to return (not inclusive)
	* @return the range of matching v legal documents
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.vportal.portlet.vlegal.model.VLegalDocument> findByDocsByF_C_O_T_L_S(
		long companyId, java.lang.String typeDocId, java.lang.String orgId,
		java.lang.String fieldId, java.lang.String language, int statusDoc,
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Finds an ordered range of all the v legal documents where companyId = &#63; and typeDocId = &#63; and orgId = &#63; and fieldId = &#63; and language = &#63; and statusDoc = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param companyId the company id to search with
	* @param typeDocId the type doc id to search with
	* @param orgId the org id to search with
	* @param fieldId the field id to search with
	* @param language the language to search with
	* @param statusDoc the status doc to search with
	* @param start the lower bound of the range of v legal documents to return
	* @param end the upper bound of the range of v legal documents to return (not inclusive)
	* @param orderByComparator the comparator to order the results by
	* @return the ordered range of matching v legal documents
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.vportal.portlet.vlegal.model.VLegalDocument> findByDocsByF_C_O_T_L_S(
		long companyId, java.lang.String typeDocId, java.lang.String orgId,
		java.lang.String fieldId, java.lang.String language, int statusDoc,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Finds the first v legal document in the ordered set where companyId = &#63; and typeDocId = &#63; and orgId = &#63; and fieldId = &#63; and language = &#63; and statusDoc = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param companyId the company id to search with
	* @param typeDocId the type doc id to search with
	* @param orgId the org id to search with
	* @param fieldId the field id to search with
	* @param language the language to search with
	* @param statusDoc the status doc to search with
	* @param orderByComparator the comparator to order the set by
	* @return the first matching v legal document
	* @throws com.vportal.portlet.vlegal.NoSuchVLegalDocumentException if a matching v legal document could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.vportal.portlet.vlegal.model.VLegalDocument findByDocsByF_C_O_T_L_S_First(
		long companyId, java.lang.String typeDocId, java.lang.String orgId,
		java.lang.String fieldId, java.lang.String language, int statusDoc,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vlegal.NoSuchVLegalDocumentException;

	/**
	* Finds the last v legal document in the ordered set where companyId = &#63; and typeDocId = &#63; and orgId = &#63; and fieldId = &#63; and language = &#63; and statusDoc = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param companyId the company id to search with
	* @param typeDocId the type doc id to search with
	* @param orgId the org id to search with
	* @param fieldId the field id to search with
	* @param language the language to search with
	* @param statusDoc the status doc to search with
	* @param orderByComparator the comparator to order the set by
	* @return the last matching v legal document
	* @throws com.vportal.portlet.vlegal.NoSuchVLegalDocumentException if a matching v legal document could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.vportal.portlet.vlegal.model.VLegalDocument findByDocsByF_C_O_T_L_S_Last(
		long companyId, java.lang.String typeDocId, java.lang.String orgId,
		java.lang.String fieldId, java.lang.String language, int statusDoc,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vlegal.NoSuchVLegalDocumentException;

	/**
	* Finds the v legal documents before and after the current v legal document in the ordered set where companyId = &#63; and typeDocId = &#63; and orgId = &#63; and fieldId = &#63; and language = &#63; and statusDoc = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param docId the primary key of the current v legal document
	* @param companyId the company id to search with
	* @param typeDocId the type doc id to search with
	* @param orgId the org id to search with
	* @param fieldId the field id to search with
	* @param language the language to search with
	* @param statusDoc the status doc to search with
	* @param orderByComparator the comparator to order the set by
	* @return the previous, current, and next v legal document
	* @throws com.vportal.portlet.vlegal.NoSuchVLegalDocumentException if a v legal document with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.vportal.portlet.vlegal.model.VLegalDocument[] findByDocsByF_C_O_T_L_S_PrevAndNext(
		java.lang.String docId, long companyId, java.lang.String typeDocId,
		java.lang.String orgId, java.lang.String fieldId,
		java.lang.String language, int statusDoc,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vlegal.NoSuchVLegalDocumentException;

	/**
	* Finds all the v legal documents where companyId = &#63; and typeDocId = &#63; and orgId = &#63; and fieldId = &#63; and language = &#63; and statusDoc = &#63;.
	*
	* @param companyId the company id to search with
	* @param typeDocId the type doc id to search with
	* @param orgId the org id to search with
	* @param fieldId the field id to search with
	* @param language the language to search with
	* @param statusDoc the status doc to search with
	* @return the matching v legal documents
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.vportal.portlet.vlegal.model.VLegalDocument> findByDocsByC_T_O(
		long companyId, java.lang.String typeDocId, java.lang.String orgId,
		java.lang.String fieldId, java.lang.String language, int statusDoc)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Finds a range of all the v legal documents where companyId = &#63; and typeDocId = &#63; and orgId = &#63; and fieldId = &#63; and language = &#63; and statusDoc = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param companyId the company id to search with
	* @param typeDocId the type doc id to search with
	* @param orgId the org id to search with
	* @param fieldId the field id to search with
	* @param language the language to search with
	* @param statusDoc the status doc to search with
	* @param start the lower bound of the range of v legal documents to return
	* @param end the upper bound of the range of v legal documents to return (not inclusive)
	* @return the range of matching v legal documents
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.vportal.portlet.vlegal.model.VLegalDocument> findByDocsByC_T_O(
		long companyId, java.lang.String typeDocId, java.lang.String orgId,
		java.lang.String fieldId, java.lang.String language, int statusDoc,
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Finds an ordered range of all the v legal documents where companyId = &#63; and typeDocId = &#63; and orgId = &#63; and fieldId = &#63; and language = &#63; and statusDoc = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param companyId the company id to search with
	* @param typeDocId the type doc id to search with
	* @param orgId the org id to search with
	* @param fieldId the field id to search with
	* @param language the language to search with
	* @param statusDoc the status doc to search with
	* @param start the lower bound of the range of v legal documents to return
	* @param end the upper bound of the range of v legal documents to return (not inclusive)
	* @param orderByComparator the comparator to order the results by
	* @return the ordered range of matching v legal documents
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.vportal.portlet.vlegal.model.VLegalDocument> findByDocsByC_T_O(
		long companyId, java.lang.String typeDocId, java.lang.String orgId,
		java.lang.String fieldId, java.lang.String language, int statusDoc,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Finds the first v legal document in the ordered set where companyId = &#63; and typeDocId = &#63; and orgId = &#63; and fieldId = &#63; and language = &#63; and statusDoc = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param companyId the company id to search with
	* @param typeDocId the type doc id to search with
	* @param orgId the org id to search with
	* @param fieldId the field id to search with
	* @param language the language to search with
	* @param statusDoc the status doc to search with
	* @param orderByComparator the comparator to order the set by
	* @return the first matching v legal document
	* @throws com.vportal.portlet.vlegal.NoSuchVLegalDocumentException if a matching v legal document could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.vportal.portlet.vlegal.model.VLegalDocument findByDocsByC_T_O_First(
		long companyId, java.lang.String typeDocId, java.lang.String orgId,
		java.lang.String fieldId, java.lang.String language, int statusDoc,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vlegal.NoSuchVLegalDocumentException;

	/**
	* Finds the last v legal document in the ordered set where companyId = &#63; and typeDocId = &#63; and orgId = &#63; and fieldId = &#63; and language = &#63; and statusDoc = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param companyId the company id to search with
	* @param typeDocId the type doc id to search with
	* @param orgId the org id to search with
	* @param fieldId the field id to search with
	* @param language the language to search with
	* @param statusDoc the status doc to search with
	* @param orderByComparator the comparator to order the set by
	* @return the last matching v legal document
	* @throws com.vportal.portlet.vlegal.NoSuchVLegalDocumentException if a matching v legal document could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.vportal.portlet.vlegal.model.VLegalDocument findByDocsByC_T_O_Last(
		long companyId, java.lang.String typeDocId, java.lang.String orgId,
		java.lang.String fieldId, java.lang.String language, int statusDoc,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vlegal.NoSuchVLegalDocumentException;

	/**
	* Finds the v legal documents before and after the current v legal document in the ordered set where companyId = &#63; and typeDocId = &#63; and orgId = &#63; and fieldId = &#63; and language = &#63; and statusDoc = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param docId the primary key of the current v legal document
	* @param companyId the company id to search with
	* @param typeDocId the type doc id to search with
	* @param orgId the org id to search with
	* @param fieldId the field id to search with
	* @param language the language to search with
	* @param statusDoc the status doc to search with
	* @param orderByComparator the comparator to order the set by
	* @return the previous, current, and next v legal document
	* @throws com.vportal.portlet.vlegal.NoSuchVLegalDocumentException if a v legal document with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.vportal.portlet.vlegal.model.VLegalDocument[] findByDocsByC_T_O_PrevAndNext(
		java.lang.String docId, long companyId, java.lang.String typeDocId,
		java.lang.String orgId, java.lang.String fieldId,
		java.lang.String language, int statusDoc,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vlegal.NoSuchVLegalDocumentException;

	/**
	* Finds all the v legal documents where groupId = &#63; and orgId = &#63; and typeDocId = &#63; and language = &#63; and statusDoc = &#63;.
	*
	* @param groupId the group id to search with
	* @param orgId the org id to search with
	* @param typeDocId the type doc id to search with
	* @param language the language to search with
	* @param statusDoc the status doc to search with
	* @return the matching v legal documents
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.vportal.portlet.vlegal.model.VLegalDocument> findByDocsByG_O_T_L_S(
		long groupId, java.lang.String orgId, java.lang.String typeDocId,
		java.lang.String language, int statusDoc)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Finds a range of all the v legal documents where groupId = &#63; and orgId = &#63; and typeDocId = &#63; and language = &#63; and statusDoc = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param groupId the group id to search with
	* @param orgId the org id to search with
	* @param typeDocId the type doc id to search with
	* @param language the language to search with
	* @param statusDoc the status doc to search with
	* @param start the lower bound of the range of v legal documents to return
	* @param end the upper bound of the range of v legal documents to return (not inclusive)
	* @return the range of matching v legal documents
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.vportal.portlet.vlegal.model.VLegalDocument> findByDocsByG_O_T_L_S(
		long groupId, java.lang.String orgId, java.lang.String typeDocId,
		java.lang.String language, int statusDoc, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Finds an ordered range of all the v legal documents where groupId = &#63; and orgId = &#63; and typeDocId = &#63; and language = &#63; and statusDoc = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param groupId the group id to search with
	* @param orgId the org id to search with
	* @param typeDocId the type doc id to search with
	* @param language the language to search with
	* @param statusDoc the status doc to search with
	* @param start the lower bound of the range of v legal documents to return
	* @param end the upper bound of the range of v legal documents to return (not inclusive)
	* @param orderByComparator the comparator to order the results by
	* @return the ordered range of matching v legal documents
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.vportal.portlet.vlegal.model.VLegalDocument> findByDocsByG_O_T_L_S(
		long groupId, java.lang.String orgId, java.lang.String typeDocId,
		java.lang.String language, int statusDoc, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Finds the first v legal document in the ordered set where groupId = &#63; and orgId = &#63; and typeDocId = &#63; and language = &#63; and statusDoc = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param groupId the group id to search with
	* @param orgId the org id to search with
	* @param typeDocId the type doc id to search with
	* @param language the language to search with
	* @param statusDoc the status doc to search with
	* @param orderByComparator the comparator to order the set by
	* @return the first matching v legal document
	* @throws com.vportal.portlet.vlegal.NoSuchVLegalDocumentException if a matching v legal document could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.vportal.portlet.vlegal.model.VLegalDocument findByDocsByG_O_T_L_S_First(
		long groupId, java.lang.String orgId, java.lang.String typeDocId,
		java.lang.String language, int statusDoc,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vlegal.NoSuchVLegalDocumentException;

	/**
	* Finds the last v legal document in the ordered set where groupId = &#63; and orgId = &#63; and typeDocId = &#63; and language = &#63; and statusDoc = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param groupId the group id to search with
	* @param orgId the org id to search with
	* @param typeDocId the type doc id to search with
	* @param language the language to search with
	* @param statusDoc the status doc to search with
	* @param orderByComparator the comparator to order the set by
	* @return the last matching v legal document
	* @throws com.vportal.portlet.vlegal.NoSuchVLegalDocumentException if a matching v legal document could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.vportal.portlet.vlegal.model.VLegalDocument findByDocsByG_O_T_L_S_Last(
		long groupId, java.lang.String orgId, java.lang.String typeDocId,
		java.lang.String language, int statusDoc,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vlegal.NoSuchVLegalDocumentException;

	/**
	* Finds the v legal documents before and after the current v legal document in the ordered set where groupId = &#63; and orgId = &#63; and typeDocId = &#63; and language = &#63; and statusDoc = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param docId the primary key of the current v legal document
	* @param groupId the group id to search with
	* @param orgId the org id to search with
	* @param typeDocId the type doc id to search with
	* @param language the language to search with
	* @param statusDoc the status doc to search with
	* @param orderByComparator the comparator to order the set by
	* @return the previous, current, and next v legal document
	* @throws com.vportal.portlet.vlegal.NoSuchVLegalDocumentException if a v legal document with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.vportal.portlet.vlegal.model.VLegalDocument[] findByDocsByG_O_T_L_S_PrevAndNext(
		java.lang.String docId, long groupId, java.lang.String orgId,
		java.lang.String typeDocId, java.lang.String language, int statusDoc,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vlegal.NoSuchVLegalDocumentException;

	/**
	* Finds all the v legal documents where language = &#63; and orgId = &#63; and fieldId = &#63; and statusDoc = &#63;.
	*
	* @param language the language to search with
	* @param orgId the org id to search with
	* @param fieldId the field id to search with
	* @param statusDoc the status doc to search with
	* @return the matching v legal documents
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.vportal.portlet.vlegal.model.VLegalDocument> findByDocsByL_O_F_S(
		java.lang.String language, java.lang.String orgId,
		java.lang.String fieldId, int statusDoc)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Finds a range of all the v legal documents where language = &#63; and orgId = &#63; and fieldId = &#63; and statusDoc = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param language the language to search with
	* @param orgId the org id to search with
	* @param fieldId the field id to search with
	* @param statusDoc the status doc to search with
	* @param start the lower bound of the range of v legal documents to return
	* @param end the upper bound of the range of v legal documents to return (not inclusive)
	* @return the range of matching v legal documents
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.vportal.portlet.vlegal.model.VLegalDocument> findByDocsByL_O_F_S(
		java.lang.String language, java.lang.String orgId,
		java.lang.String fieldId, int statusDoc, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Finds an ordered range of all the v legal documents where language = &#63; and orgId = &#63; and fieldId = &#63; and statusDoc = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param language the language to search with
	* @param orgId the org id to search with
	* @param fieldId the field id to search with
	* @param statusDoc the status doc to search with
	* @param start the lower bound of the range of v legal documents to return
	* @param end the upper bound of the range of v legal documents to return (not inclusive)
	* @param orderByComparator the comparator to order the results by
	* @return the ordered range of matching v legal documents
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.vportal.portlet.vlegal.model.VLegalDocument> findByDocsByL_O_F_S(
		java.lang.String language, java.lang.String orgId,
		java.lang.String fieldId, int statusDoc, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Finds the first v legal document in the ordered set where language = &#63; and orgId = &#63; and fieldId = &#63; and statusDoc = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param language the language to search with
	* @param orgId the org id to search with
	* @param fieldId the field id to search with
	* @param statusDoc the status doc to search with
	* @param orderByComparator the comparator to order the set by
	* @return the first matching v legal document
	* @throws com.vportal.portlet.vlegal.NoSuchVLegalDocumentException if a matching v legal document could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.vportal.portlet.vlegal.model.VLegalDocument findByDocsByL_O_F_S_First(
		java.lang.String language, java.lang.String orgId,
		java.lang.String fieldId, int statusDoc,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vlegal.NoSuchVLegalDocumentException;

	/**
	* Finds the last v legal document in the ordered set where language = &#63; and orgId = &#63; and fieldId = &#63; and statusDoc = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param language the language to search with
	* @param orgId the org id to search with
	* @param fieldId the field id to search with
	* @param statusDoc the status doc to search with
	* @param orderByComparator the comparator to order the set by
	* @return the last matching v legal document
	* @throws com.vportal.portlet.vlegal.NoSuchVLegalDocumentException if a matching v legal document could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.vportal.portlet.vlegal.model.VLegalDocument findByDocsByL_O_F_S_Last(
		java.lang.String language, java.lang.String orgId,
		java.lang.String fieldId, int statusDoc,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vlegal.NoSuchVLegalDocumentException;

	/**
	* Finds the v legal documents before and after the current v legal document in the ordered set where language = &#63; and orgId = &#63; and fieldId = &#63; and statusDoc = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param docId the primary key of the current v legal document
	* @param language the language to search with
	* @param orgId the org id to search with
	* @param fieldId the field id to search with
	* @param statusDoc the status doc to search with
	* @param orderByComparator the comparator to order the set by
	* @return the previous, current, and next v legal document
	* @throws com.vportal.portlet.vlegal.NoSuchVLegalDocumentException if a v legal document with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.vportal.portlet.vlegal.model.VLegalDocument[] findByDocsByL_O_F_S_PrevAndNext(
		java.lang.String docId, java.lang.String language,
		java.lang.String orgId, java.lang.String fieldId, int statusDoc,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vlegal.NoSuchVLegalDocumentException;

	/**
	* Finds all the v legal documents where language = &#63; and typeDocId = &#63; and fieldId = &#63; and statusDoc = &#63;.
	*
	* @param language the language to search with
	* @param typeDocId the type doc id to search with
	* @param fieldId the field id to search with
	* @param statusDoc the status doc to search with
	* @return the matching v legal documents
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.vportal.portlet.vlegal.model.VLegalDocument> findByDocsByL_T_F_S(
		java.lang.String language, java.lang.String typeDocId,
		java.lang.String fieldId, int statusDoc)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Finds a range of all the v legal documents where language = &#63; and typeDocId = &#63; and fieldId = &#63; and statusDoc = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param language the language to search with
	* @param typeDocId the type doc id to search with
	* @param fieldId the field id to search with
	* @param statusDoc the status doc to search with
	* @param start the lower bound of the range of v legal documents to return
	* @param end the upper bound of the range of v legal documents to return (not inclusive)
	* @return the range of matching v legal documents
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.vportal.portlet.vlegal.model.VLegalDocument> findByDocsByL_T_F_S(
		java.lang.String language, java.lang.String typeDocId,
		java.lang.String fieldId, int statusDoc, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Finds an ordered range of all the v legal documents where language = &#63; and typeDocId = &#63; and fieldId = &#63; and statusDoc = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param language the language to search with
	* @param typeDocId the type doc id to search with
	* @param fieldId the field id to search with
	* @param statusDoc the status doc to search with
	* @param start the lower bound of the range of v legal documents to return
	* @param end the upper bound of the range of v legal documents to return (not inclusive)
	* @param orderByComparator the comparator to order the results by
	* @return the ordered range of matching v legal documents
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.vportal.portlet.vlegal.model.VLegalDocument> findByDocsByL_T_F_S(
		java.lang.String language, java.lang.String typeDocId,
		java.lang.String fieldId, int statusDoc, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Finds the first v legal document in the ordered set where language = &#63; and typeDocId = &#63; and fieldId = &#63; and statusDoc = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param language the language to search with
	* @param typeDocId the type doc id to search with
	* @param fieldId the field id to search with
	* @param statusDoc the status doc to search with
	* @param orderByComparator the comparator to order the set by
	* @return the first matching v legal document
	* @throws com.vportal.portlet.vlegal.NoSuchVLegalDocumentException if a matching v legal document could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.vportal.portlet.vlegal.model.VLegalDocument findByDocsByL_T_F_S_First(
		java.lang.String language, java.lang.String typeDocId,
		java.lang.String fieldId, int statusDoc,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vlegal.NoSuchVLegalDocumentException;

	/**
	* Finds the last v legal document in the ordered set where language = &#63; and typeDocId = &#63; and fieldId = &#63; and statusDoc = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param language the language to search with
	* @param typeDocId the type doc id to search with
	* @param fieldId the field id to search with
	* @param statusDoc the status doc to search with
	* @param orderByComparator the comparator to order the set by
	* @return the last matching v legal document
	* @throws com.vportal.portlet.vlegal.NoSuchVLegalDocumentException if a matching v legal document could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.vportal.portlet.vlegal.model.VLegalDocument findByDocsByL_T_F_S_Last(
		java.lang.String language, java.lang.String typeDocId,
		java.lang.String fieldId, int statusDoc,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vlegal.NoSuchVLegalDocumentException;

	/**
	* Finds the v legal documents before and after the current v legal document in the ordered set where language = &#63; and typeDocId = &#63; and fieldId = &#63; and statusDoc = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param docId the primary key of the current v legal document
	* @param language the language to search with
	* @param typeDocId the type doc id to search with
	* @param fieldId the field id to search with
	* @param statusDoc the status doc to search with
	* @param orderByComparator the comparator to order the set by
	* @return the previous, current, and next v legal document
	* @throws com.vportal.portlet.vlegal.NoSuchVLegalDocumentException if a v legal document with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.vportal.portlet.vlegal.model.VLegalDocument[] findByDocsByL_T_F_S_PrevAndNext(
		java.lang.String docId, java.lang.String language,
		java.lang.String typeDocId, java.lang.String fieldId, int statusDoc,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vlegal.NoSuchVLegalDocumentException;

	/**
	* Finds all the v legal documents where typeDocId = &#63; and language = &#63;.
	*
	* @param typeDocId the type doc id to search with
	* @param language the language to search with
	* @return the matching v legal documents
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.vportal.portlet.vlegal.model.VLegalDocument> findByDocsByT_L(
		java.lang.String typeDocId, java.lang.String language)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Finds a range of all the v legal documents where typeDocId = &#63; and language = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param typeDocId the type doc id to search with
	* @param language the language to search with
	* @param start the lower bound of the range of v legal documents to return
	* @param end the upper bound of the range of v legal documents to return (not inclusive)
	* @return the range of matching v legal documents
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.vportal.portlet.vlegal.model.VLegalDocument> findByDocsByT_L(
		java.lang.String typeDocId, java.lang.String language, int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Finds an ordered range of all the v legal documents where typeDocId = &#63; and language = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param typeDocId the type doc id to search with
	* @param language the language to search with
	* @param start the lower bound of the range of v legal documents to return
	* @param end the upper bound of the range of v legal documents to return (not inclusive)
	* @param orderByComparator the comparator to order the results by
	* @return the ordered range of matching v legal documents
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.vportal.portlet.vlegal.model.VLegalDocument> findByDocsByT_L(
		java.lang.String typeDocId, java.lang.String language, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Finds the first v legal document in the ordered set where typeDocId = &#63; and language = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param typeDocId the type doc id to search with
	* @param language the language to search with
	* @param orderByComparator the comparator to order the set by
	* @return the first matching v legal document
	* @throws com.vportal.portlet.vlegal.NoSuchVLegalDocumentException if a matching v legal document could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.vportal.portlet.vlegal.model.VLegalDocument findByDocsByT_L_First(
		java.lang.String typeDocId, java.lang.String language,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vlegal.NoSuchVLegalDocumentException;

	/**
	* Finds the last v legal document in the ordered set where typeDocId = &#63; and language = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param typeDocId the type doc id to search with
	* @param language the language to search with
	* @param orderByComparator the comparator to order the set by
	* @return the last matching v legal document
	* @throws com.vportal.portlet.vlegal.NoSuchVLegalDocumentException if a matching v legal document could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.vportal.portlet.vlegal.model.VLegalDocument findByDocsByT_L_Last(
		java.lang.String typeDocId, java.lang.String language,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vlegal.NoSuchVLegalDocumentException;

	/**
	* Finds the v legal documents before and after the current v legal document in the ordered set where typeDocId = &#63; and language = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param docId the primary key of the current v legal document
	* @param typeDocId the type doc id to search with
	* @param language the language to search with
	* @param orderByComparator the comparator to order the set by
	* @return the previous, current, and next v legal document
	* @throws com.vportal.portlet.vlegal.NoSuchVLegalDocumentException if a v legal document with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.vportal.portlet.vlegal.model.VLegalDocument[] findByDocsByT_L_PrevAndNext(
		java.lang.String docId, java.lang.String typeDocId,
		java.lang.String language,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vlegal.NoSuchVLegalDocumentException;

	/**
	* Finds all the v legal documents where groupId = &#63; and language = &#63; and userId = &#63; and statusDoc = &#63;.
	*
	* @param groupId the group id to search with
	* @param language the language to search with
	* @param userId the user id to search with
	* @param statusDoc the status doc to search with
	* @return the matching v legal documents
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.vportal.portlet.vlegal.model.VLegalDocument> findByG_L_U_S(
		long groupId, java.lang.String language, long userId, int statusDoc)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Finds a range of all the v legal documents where groupId = &#63; and language = &#63; and userId = &#63; and statusDoc = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param groupId the group id to search with
	* @param language the language to search with
	* @param userId the user id to search with
	* @param statusDoc the status doc to search with
	* @param start the lower bound of the range of v legal documents to return
	* @param end the upper bound of the range of v legal documents to return (not inclusive)
	* @return the range of matching v legal documents
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.vportal.portlet.vlegal.model.VLegalDocument> findByG_L_U_S(
		long groupId, java.lang.String language, long userId, int statusDoc,
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Finds an ordered range of all the v legal documents where groupId = &#63; and language = &#63; and userId = &#63; and statusDoc = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param groupId the group id to search with
	* @param language the language to search with
	* @param userId the user id to search with
	* @param statusDoc the status doc to search with
	* @param start the lower bound of the range of v legal documents to return
	* @param end the upper bound of the range of v legal documents to return (not inclusive)
	* @param orderByComparator the comparator to order the results by
	* @return the ordered range of matching v legal documents
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.vportal.portlet.vlegal.model.VLegalDocument> findByG_L_U_S(
		long groupId, java.lang.String language, long userId, int statusDoc,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Finds the first v legal document in the ordered set where groupId = &#63; and language = &#63; and userId = &#63; and statusDoc = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param groupId the group id to search with
	* @param language the language to search with
	* @param userId the user id to search with
	* @param statusDoc the status doc to search with
	* @param orderByComparator the comparator to order the set by
	* @return the first matching v legal document
	* @throws com.vportal.portlet.vlegal.NoSuchVLegalDocumentException if a matching v legal document could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.vportal.portlet.vlegal.model.VLegalDocument findByG_L_U_S_First(
		long groupId, java.lang.String language, long userId, int statusDoc,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vlegal.NoSuchVLegalDocumentException;

	/**
	* Finds the last v legal document in the ordered set where groupId = &#63; and language = &#63; and userId = &#63; and statusDoc = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param groupId the group id to search with
	* @param language the language to search with
	* @param userId the user id to search with
	* @param statusDoc the status doc to search with
	* @param orderByComparator the comparator to order the set by
	* @return the last matching v legal document
	* @throws com.vportal.portlet.vlegal.NoSuchVLegalDocumentException if a matching v legal document could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.vportal.portlet.vlegal.model.VLegalDocument findByG_L_U_S_Last(
		long groupId, java.lang.String language, long userId, int statusDoc,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vlegal.NoSuchVLegalDocumentException;

	/**
	* Finds the v legal documents before and after the current v legal document in the ordered set where groupId = &#63; and language = &#63; and userId = &#63; and statusDoc = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param docId the primary key of the current v legal document
	* @param groupId the group id to search with
	* @param language the language to search with
	* @param userId the user id to search with
	* @param statusDoc the status doc to search with
	* @param orderByComparator the comparator to order the set by
	* @return the previous, current, and next v legal document
	* @throws com.vportal.portlet.vlegal.NoSuchVLegalDocumentException if a v legal document with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.vportal.portlet.vlegal.model.VLegalDocument[] findByG_L_U_S_PrevAndNext(
		java.lang.String docId, long groupId, java.lang.String language,
		long userId, int statusDoc,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vlegal.NoSuchVLegalDocumentException;

	/**
	* Finds the v legal document where groupId = &#63; and docId = &#63; or throws a {@link com.vportal.portlet.vlegal.NoSuchVLegalDocumentException} if it could not be found.
	*
	* @param groupId the group id to search with
	* @param docId the doc id to search with
	* @return the matching v legal document
	* @throws com.vportal.portlet.vlegal.NoSuchVLegalDocumentException if a matching v legal document could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.vportal.portlet.vlegal.model.VLegalDocument findByG_D(
		long groupId, java.lang.String docId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vlegal.NoSuchVLegalDocumentException;

	/**
	* Finds the v legal document where groupId = &#63; and docId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param groupId the group id to search with
	* @param docId the doc id to search with
	* @return the matching v legal document, or <code>null</code> if a matching v legal document could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.vportal.portlet.vlegal.model.VLegalDocument fetchByG_D(
		long groupId, java.lang.String docId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Finds the v legal document where groupId = &#63; and docId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param groupId the group id to search with
	* @param docId the doc id to search with
	* @return the matching v legal document, or <code>null</code> if a matching v legal document could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.vportal.portlet.vlegal.model.VLegalDocument fetchByG_D(
		long groupId, java.lang.String docId, boolean retrieveFromCache)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Finds the v legal document where groupId = &#63; and num = &#63; and symbol = &#63; or throws a {@link com.vportal.portlet.vlegal.NoSuchVLegalDocumentException} if it could not be found.
	*
	* @param groupId the group id to search with
	* @param num the num to search with
	* @param symbol the symbol to search with
	* @return the matching v legal document
	* @throws com.vportal.portlet.vlegal.NoSuchVLegalDocumentException if a matching v legal document could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.vportal.portlet.vlegal.model.VLegalDocument findByP_N_S(
		long groupId, java.lang.String num, java.lang.String symbol)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vlegal.NoSuchVLegalDocumentException;

	/**
	* Finds the v legal document where groupId = &#63; and num = &#63; and symbol = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param groupId the group id to search with
	* @param num the num to search with
	* @param symbol the symbol to search with
	* @return the matching v legal document, or <code>null</code> if a matching v legal document could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.vportal.portlet.vlegal.model.VLegalDocument fetchByP_N_S(
		long groupId, java.lang.String num, java.lang.String symbol)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Finds the v legal document where groupId = &#63; and num = &#63; and symbol = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param groupId the group id to search with
	* @param num the num to search with
	* @param symbol the symbol to search with
	* @return the matching v legal document, or <code>null</code> if a matching v legal document could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.vportal.portlet.vlegal.model.VLegalDocument fetchByP_N_S(
		long groupId, java.lang.String num, java.lang.String symbol,
		boolean retrieveFromCache)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Finds all the v legal documents where groupId = &#63; and language = &#63; and statusDoc = &#63;.
	*
	* @param groupId the group id to search with
	* @param language the language to search with
	* @param statusDoc the status doc to search with
	* @return the matching v legal documents
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.vportal.portlet.vlegal.model.VLegalDocument> findByP_L_S(
		long groupId, java.lang.String language, int statusDoc)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Finds a range of all the v legal documents where groupId = &#63; and language = &#63; and statusDoc = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param groupId the group id to search with
	* @param language the language to search with
	* @param statusDoc the status doc to search with
	* @param start the lower bound of the range of v legal documents to return
	* @param end the upper bound of the range of v legal documents to return (not inclusive)
	* @return the range of matching v legal documents
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.vportal.portlet.vlegal.model.VLegalDocument> findByP_L_S(
		long groupId, java.lang.String language, int statusDoc, int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Finds an ordered range of all the v legal documents where groupId = &#63; and language = &#63; and statusDoc = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param groupId the group id to search with
	* @param language the language to search with
	* @param statusDoc the status doc to search with
	* @param start the lower bound of the range of v legal documents to return
	* @param end the upper bound of the range of v legal documents to return (not inclusive)
	* @param orderByComparator the comparator to order the results by
	* @return the ordered range of matching v legal documents
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.vportal.portlet.vlegal.model.VLegalDocument> findByP_L_S(
		long groupId, java.lang.String language, int statusDoc, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Finds the first v legal document in the ordered set where groupId = &#63; and language = &#63; and statusDoc = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param groupId the group id to search with
	* @param language the language to search with
	* @param statusDoc the status doc to search with
	* @param orderByComparator the comparator to order the set by
	* @return the first matching v legal document
	* @throws com.vportal.portlet.vlegal.NoSuchVLegalDocumentException if a matching v legal document could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.vportal.portlet.vlegal.model.VLegalDocument findByP_L_S_First(
		long groupId, java.lang.String language, int statusDoc,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vlegal.NoSuchVLegalDocumentException;

	/**
	* Finds the last v legal document in the ordered set where groupId = &#63; and language = &#63; and statusDoc = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param groupId the group id to search with
	* @param language the language to search with
	* @param statusDoc the status doc to search with
	* @param orderByComparator the comparator to order the set by
	* @return the last matching v legal document
	* @throws com.vportal.portlet.vlegal.NoSuchVLegalDocumentException if a matching v legal document could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.vportal.portlet.vlegal.model.VLegalDocument findByP_L_S_Last(
		long groupId, java.lang.String language, int statusDoc,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vlegal.NoSuchVLegalDocumentException;

	/**
	* Finds the v legal documents before and after the current v legal document in the ordered set where groupId = &#63; and language = &#63; and statusDoc = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param docId the primary key of the current v legal document
	* @param groupId the group id to search with
	* @param language the language to search with
	* @param statusDoc the status doc to search with
	* @param orderByComparator the comparator to order the set by
	* @return the previous, current, and next v legal document
	* @throws com.vportal.portlet.vlegal.NoSuchVLegalDocumentException if a v legal document with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.vportal.portlet.vlegal.model.VLegalDocument[] findByP_L_S_PrevAndNext(
		java.lang.String docId, long groupId, java.lang.String language,
		int statusDoc,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vlegal.NoSuchVLegalDocumentException;

	/**
	* Finds all the v legal documents where statusDoc = &#63;.
	*
	* @param statusDoc the status doc to search with
	* @return the matching v legal documents
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.vportal.portlet.vlegal.model.VLegalDocument> findBystatusDoc(
		int statusDoc)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Finds a range of all the v legal documents where statusDoc = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param statusDoc the status doc to search with
	* @param start the lower bound of the range of v legal documents to return
	* @param end the upper bound of the range of v legal documents to return (not inclusive)
	* @return the range of matching v legal documents
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.vportal.portlet.vlegal.model.VLegalDocument> findBystatusDoc(
		int statusDoc, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Finds an ordered range of all the v legal documents where statusDoc = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param statusDoc the status doc to search with
	* @param start the lower bound of the range of v legal documents to return
	* @param end the upper bound of the range of v legal documents to return (not inclusive)
	* @param orderByComparator the comparator to order the results by
	* @return the ordered range of matching v legal documents
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.vportal.portlet.vlegal.model.VLegalDocument> findBystatusDoc(
		int statusDoc, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Finds the first v legal document in the ordered set where statusDoc = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param statusDoc the status doc to search with
	* @param orderByComparator the comparator to order the set by
	* @return the first matching v legal document
	* @throws com.vportal.portlet.vlegal.NoSuchVLegalDocumentException if a matching v legal document could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.vportal.portlet.vlegal.model.VLegalDocument findBystatusDoc_First(
		int statusDoc,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vlegal.NoSuchVLegalDocumentException;

	/**
	* Finds the last v legal document in the ordered set where statusDoc = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param statusDoc the status doc to search with
	* @param orderByComparator the comparator to order the set by
	* @return the last matching v legal document
	* @throws com.vportal.portlet.vlegal.NoSuchVLegalDocumentException if a matching v legal document could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.vportal.portlet.vlegal.model.VLegalDocument findBystatusDoc_Last(
		int statusDoc,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vlegal.NoSuchVLegalDocumentException;

	/**
	* Finds the v legal documents before and after the current v legal document in the ordered set where statusDoc = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param docId the primary key of the current v legal document
	* @param statusDoc the status doc to search with
	* @param orderByComparator the comparator to order the set by
	* @return the previous, current, and next v legal document
	* @throws com.vportal.portlet.vlegal.NoSuchVLegalDocumentException if a v legal document with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.vportal.portlet.vlegal.model.VLegalDocument[] findBystatusDoc_PrevAndNext(
		java.lang.String docId, int statusDoc,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vlegal.NoSuchVLegalDocumentException;

	/**
	* Finds all the v legal documents where groupId = &#63; and language = &#63; and orgId = &#63; and statusDoc = &#63;.
	*
	* @param groupId the group id to search with
	* @param language the language to search with
	* @param orgId the org id to search with
	* @param statusDoc the status doc to search with
	* @return the matching v legal documents
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.vportal.portlet.vlegal.model.VLegalDocument> findByG_L_O_S(
		long groupId, java.lang.String language, java.lang.String orgId,
		int statusDoc)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Finds a range of all the v legal documents where groupId = &#63; and language = &#63; and orgId = &#63; and statusDoc = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param groupId the group id to search with
	* @param language the language to search with
	* @param orgId the org id to search with
	* @param statusDoc the status doc to search with
	* @param start the lower bound of the range of v legal documents to return
	* @param end the upper bound of the range of v legal documents to return (not inclusive)
	* @return the range of matching v legal documents
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.vportal.portlet.vlegal.model.VLegalDocument> findByG_L_O_S(
		long groupId, java.lang.String language, java.lang.String orgId,
		int statusDoc, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Finds an ordered range of all the v legal documents where groupId = &#63; and language = &#63; and orgId = &#63; and statusDoc = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param groupId the group id to search with
	* @param language the language to search with
	* @param orgId the org id to search with
	* @param statusDoc the status doc to search with
	* @param start the lower bound of the range of v legal documents to return
	* @param end the upper bound of the range of v legal documents to return (not inclusive)
	* @param orderByComparator the comparator to order the results by
	* @return the ordered range of matching v legal documents
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.vportal.portlet.vlegal.model.VLegalDocument> findByG_L_O_S(
		long groupId, java.lang.String language, java.lang.String orgId,
		int statusDoc, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Finds the first v legal document in the ordered set where groupId = &#63; and language = &#63; and orgId = &#63; and statusDoc = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param groupId the group id to search with
	* @param language the language to search with
	* @param orgId the org id to search with
	* @param statusDoc the status doc to search with
	* @param orderByComparator the comparator to order the set by
	* @return the first matching v legal document
	* @throws com.vportal.portlet.vlegal.NoSuchVLegalDocumentException if a matching v legal document could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.vportal.portlet.vlegal.model.VLegalDocument findByG_L_O_S_First(
		long groupId, java.lang.String language, java.lang.String orgId,
		int statusDoc,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vlegal.NoSuchVLegalDocumentException;

	/**
	* Finds the last v legal document in the ordered set where groupId = &#63; and language = &#63; and orgId = &#63; and statusDoc = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param groupId the group id to search with
	* @param language the language to search with
	* @param orgId the org id to search with
	* @param statusDoc the status doc to search with
	* @param orderByComparator the comparator to order the set by
	* @return the last matching v legal document
	* @throws com.vportal.portlet.vlegal.NoSuchVLegalDocumentException if a matching v legal document could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.vportal.portlet.vlegal.model.VLegalDocument findByG_L_O_S_Last(
		long groupId, java.lang.String language, java.lang.String orgId,
		int statusDoc,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vlegal.NoSuchVLegalDocumentException;

	/**
	* Finds the v legal documents before and after the current v legal document in the ordered set where groupId = &#63; and language = &#63; and orgId = &#63; and statusDoc = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param docId the primary key of the current v legal document
	* @param groupId the group id to search with
	* @param language the language to search with
	* @param orgId the org id to search with
	* @param statusDoc the status doc to search with
	* @param orderByComparator the comparator to order the set by
	* @return the previous, current, and next v legal document
	* @throws com.vportal.portlet.vlegal.NoSuchVLegalDocumentException if a v legal document with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.vportal.portlet.vlegal.model.VLegalDocument[] findByG_L_O_S_PrevAndNext(
		java.lang.String docId, long groupId, java.lang.String language,
		java.lang.String orgId, int statusDoc,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vlegal.NoSuchVLegalDocumentException;

	/**
	* Finds all the v legal documents where groupId = &#63; and language = &#63; and typeDocId = &#63; and statusDoc = &#63;.
	*
	* @param groupId the group id to search with
	* @param language the language to search with
	* @param typeDocId the type doc id to search with
	* @param statusDoc the status doc to search with
	* @return the matching v legal documents
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.vportal.portlet.vlegal.model.VLegalDocument> findByG_L_T_S(
		long groupId, java.lang.String language, java.lang.String typeDocId,
		int statusDoc)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Finds a range of all the v legal documents where groupId = &#63; and language = &#63; and typeDocId = &#63; and statusDoc = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param groupId the group id to search with
	* @param language the language to search with
	* @param typeDocId the type doc id to search with
	* @param statusDoc the status doc to search with
	* @param start the lower bound of the range of v legal documents to return
	* @param end the upper bound of the range of v legal documents to return (not inclusive)
	* @return the range of matching v legal documents
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.vportal.portlet.vlegal.model.VLegalDocument> findByG_L_T_S(
		long groupId, java.lang.String language, java.lang.String typeDocId,
		int statusDoc, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Finds an ordered range of all the v legal documents where groupId = &#63; and language = &#63; and typeDocId = &#63; and statusDoc = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param groupId the group id to search with
	* @param language the language to search with
	* @param typeDocId the type doc id to search with
	* @param statusDoc the status doc to search with
	* @param start the lower bound of the range of v legal documents to return
	* @param end the upper bound of the range of v legal documents to return (not inclusive)
	* @param orderByComparator the comparator to order the results by
	* @return the ordered range of matching v legal documents
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.vportal.portlet.vlegal.model.VLegalDocument> findByG_L_T_S(
		long groupId, java.lang.String language, java.lang.String typeDocId,
		int statusDoc, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Finds the first v legal document in the ordered set where groupId = &#63; and language = &#63; and typeDocId = &#63; and statusDoc = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param groupId the group id to search with
	* @param language the language to search with
	* @param typeDocId the type doc id to search with
	* @param statusDoc the status doc to search with
	* @param orderByComparator the comparator to order the set by
	* @return the first matching v legal document
	* @throws com.vportal.portlet.vlegal.NoSuchVLegalDocumentException if a matching v legal document could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.vportal.portlet.vlegal.model.VLegalDocument findByG_L_T_S_First(
		long groupId, java.lang.String language, java.lang.String typeDocId,
		int statusDoc,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vlegal.NoSuchVLegalDocumentException;

	/**
	* Finds the last v legal document in the ordered set where groupId = &#63; and language = &#63; and typeDocId = &#63; and statusDoc = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param groupId the group id to search with
	* @param language the language to search with
	* @param typeDocId the type doc id to search with
	* @param statusDoc the status doc to search with
	* @param orderByComparator the comparator to order the set by
	* @return the last matching v legal document
	* @throws com.vportal.portlet.vlegal.NoSuchVLegalDocumentException if a matching v legal document could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.vportal.portlet.vlegal.model.VLegalDocument findByG_L_T_S_Last(
		long groupId, java.lang.String language, java.lang.String typeDocId,
		int statusDoc,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vlegal.NoSuchVLegalDocumentException;

	/**
	* Finds the v legal documents before and after the current v legal document in the ordered set where groupId = &#63; and language = &#63; and typeDocId = &#63; and statusDoc = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param docId the primary key of the current v legal document
	* @param groupId the group id to search with
	* @param language the language to search with
	* @param typeDocId the type doc id to search with
	* @param statusDoc the status doc to search with
	* @param orderByComparator the comparator to order the set by
	* @return the previous, current, and next v legal document
	* @throws com.vportal.portlet.vlegal.NoSuchVLegalDocumentException if a v legal document with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.vportal.portlet.vlegal.model.VLegalDocument[] findByG_L_T_S_PrevAndNext(
		java.lang.String docId, long groupId, java.lang.String language,
		java.lang.String typeDocId, int statusDoc,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vlegal.NoSuchVLegalDocumentException;

	/**
	* Finds all the v legal documents where language = &#63; and fieldId = &#63; and statusDoc = &#63;.
	*
	* @param language the language to search with
	* @param fieldId the field id to search with
	* @param statusDoc the status doc to search with
	* @return the matching v legal documents
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.vportal.portlet.vlegal.model.VLegalDocument> findByL_F_S(
		java.lang.String language, java.lang.String fieldId, int statusDoc)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Finds a range of all the v legal documents where language = &#63; and fieldId = &#63; and statusDoc = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param language the language to search with
	* @param fieldId the field id to search with
	* @param statusDoc the status doc to search with
	* @param start the lower bound of the range of v legal documents to return
	* @param end the upper bound of the range of v legal documents to return (not inclusive)
	* @return the range of matching v legal documents
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.vportal.portlet.vlegal.model.VLegalDocument> findByL_F_S(
		java.lang.String language, java.lang.String fieldId, int statusDoc,
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Finds an ordered range of all the v legal documents where language = &#63; and fieldId = &#63; and statusDoc = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param language the language to search with
	* @param fieldId the field id to search with
	* @param statusDoc the status doc to search with
	* @param start the lower bound of the range of v legal documents to return
	* @param end the upper bound of the range of v legal documents to return (not inclusive)
	* @param orderByComparator the comparator to order the results by
	* @return the ordered range of matching v legal documents
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.vportal.portlet.vlegal.model.VLegalDocument> findByL_F_S(
		java.lang.String language, java.lang.String fieldId, int statusDoc,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Finds the first v legal document in the ordered set where language = &#63; and fieldId = &#63; and statusDoc = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param language the language to search with
	* @param fieldId the field id to search with
	* @param statusDoc the status doc to search with
	* @param orderByComparator the comparator to order the set by
	* @return the first matching v legal document
	* @throws com.vportal.portlet.vlegal.NoSuchVLegalDocumentException if a matching v legal document could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.vportal.portlet.vlegal.model.VLegalDocument findByL_F_S_First(
		java.lang.String language, java.lang.String fieldId, int statusDoc,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vlegal.NoSuchVLegalDocumentException;

	/**
	* Finds the last v legal document in the ordered set where language = &#63; and fieldId = &#63; and statusDoc = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param language the language to search with
	* @param fieldId the field id to search with
	* @param statusDoc the status doc to search with
	* @param orderByComparator the comparator to order the set by
	* @return the last matching v legal document
	* @throws com.vportal.portlet.vlegal.NoSuchVLegalDocumentException if a matching v legal document could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.vportal.portlet.vlegal.model.VLegalDocument findByL_F_S_Last(
		java.lang.String language, java.lang.String fieldId, int statusDoc,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vlegal.NoSuchVLegalDocumentException;

	/**
	* Finds the v legal documents before and after the current v legal document in the ordered set where language = &#63; and fieldId = &#63; and statusDoc = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param docId the primary key of the current v legal document
	* @param language the language to search with
	* @param fieldId the field id to search with
	* @param statusDoc the status doc to search with
	* @param orderByComparator the comparator to order the set by
	* @return the previous, current, and next v legal document
	* @throws com.vportal.portlet.vlegal.NoSuchVLegalDocumentException if a v legal document with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.vportal.portlet.vlegal.model.VLegalDocument[] findByL_F_S_PrevAndNext(
		java.lang.String docId, java.lang.String language,
		java.lang.String fieldId, int statusDoc,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vlegal.NoSuchVLegalDocumentException;

	/**
	* Finds all the v legal documents where groupId = &#63; and language = &#63; and fieldId = &#63; and statusDoc = &#63;.
	*
	* @param groupId the group id to search with
	* @param language the language to search with
	* @param fieldId the field id to search with
	* @param statusDoc the status doc to search with
	* @return the matching v legal documents
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.vportal.portlet.vlegal.model.VLegalDocument> findByG_L_F_S(
		long groupId, java.lang.String language, java.lang.String fieldId,
		int statusDoc)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Finds a range of all the v legal documents where groupId = &#63; and language = &#63; and fieldId = &#63; and statusDoc = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param groupId the group id to search with
	* @param language the language to search with
	* @param fieldId the field id to search with
	* @param statusDoc the status doc to search with
	* @param start the lower bound of the range of v legal documents to return
	* @param end the upper bound of the range of v legal documents to return (not inclusive)
	* @return the range of matching v legal documents
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.vportal.portlet.vlegal.model.VLegalDocument> findByG_L_F_S(
		long groupId, java.lang.String language, java.lang.String fieldId,
		int statusDoc, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Finds an ordered range of all the v legal documents where groupId = &#63; and language = &#63; and fieldId = &#63; and statusDoc = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param groupId the group id to search with
	* @param language the language to search with
	* @param fieldId the field id to search with
	* @param statusDoc the status doc to search with
	* @param start the lower bound of the range of v legal documents to return
	* @param end the upper bound of the range of v legal documents to return (not inclusive)
	* @param orderByComparator the comparator to order the results by
	* @return the ordered range of matching v legal documents
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.vportal.portlet.vlegal.model.VLegalDocument> findByG_L_F_S(
		long groupId, java.lang.String language, java.lang.String fieldId,
		int statusDoc, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Finds the first v legal document in the ordered set where groupId = &#63; and language = &#63; and fieldId = &#63; and statusDoc = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param groupId the group id to search with
	* @param language the language to search with
	* @param fieldId the field id to search with
	* @param statusDoc the status doc to search with
	* @param orderByComparator the comparator to order the set by
	* @return the first matching v legal document
	* @throws com.vportal.portlet.vlegal.NoSuchVLegalDocumentException if a matching v legal document could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.vportal.portlet.vlegal.model.VLegalDocument findByG_L_F_S_First(
		long groupId, java.lang.String language, java.lang.String fieldId,
		int statusDoc,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vlegal.NoSuchVLegalDocumentException;

	/**
	* Finds the last v legal document in the ordered set where groupId = &#63; and language = &#63; and fieldId = &#63; and statusDoc = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param groupId the group id to search with
	* @param language the language to search with
	* @param fieldId the field id to search with
	* @param statusDoc the status doc to search with
	* @param orderByComparator the comparator to order the set by
	* @return the last matching v legal document
	* @throws com.vportal.portlet.vlegal.NoSuchVLegalDocumentException if a matching v legal document could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.vportal.portlet.vlegal.model.VLegalDocument findByG_L_F_S_Last(
		long groupId, java.lang.String language, java.lang.String fieldId,
		int statusDoc,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vlegal.NoSuchVLegalDocumentException;

	/**
	* Finds the v legal documents before and after the current v legal document in the ordered set where groupId = &#63; and language = &#63; and fieldId = &#63; and statusDoc = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param docId the primary key of the current v legal document
	* @param groupId the group id to search with
	* @param language the language to search with
	* @param fieldId the field id to search with
	* @param statusDoc the status doc to search with
	* @param orderByComparator the comparator to order the set by
	* @return the previous, current, and next v legal document
	* @throws com.vportal.portlet.vlegal.NoSuchVLegalDocumentException if a v legal document with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.vportal.portlet.vlegal.model.VLegalDocument[] findByG_L_F_S_PrevAndNext(
		java.lang.String docId, long groupId, java.lang.String language,
		java.lang.String fieldId, int statusDoc,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vlegal.NoSuchVLegalDocumentException;

	/**
	* Finds all the v legal documents where groupId = &#63; and language = &#63; and orgId = &#63;.
	*
	* @param groupId the group id to search with
	* @param language the language to search with
	* @param orgId the org id to search with
	* @return the matching v legal documents
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.vportal.portlet.vlegal.model.VLegalDocument> findByG_L_O(
		long groupId, java.lang.String language, java.lang.String orgId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Finds a range of all the v legal documents where groupId = &#63; and language = &#63; and orgId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param groupId the group id to search with
	* @param language the language to search with
	* @param orgId the org id to search with
	* @param start the lower bound of the range of v legal documents to return
	* @param end the upper bound of the range of v legal documents to return (not inclusive)
	* @return the range of matching v legal documents
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.vportal.portlet.vlegal.model.VLegalDocument> findByG_L_O(
		long groupId, java.lang.String language, java.lang.String orgId,
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Finds an ordered range of all the v legal documents where groupId = &#63; and language = &#63; and orgId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param groupId the group id to search with
	* @param language the language to search with
	* @param orgId the org id to search with
	* @param start the lower bound of the range of v legal documents to return
	* @param end the upper bound of the range of v legal documents to return (not inclusive)
	* @param orderByComparator the comparator to order the results by
	* @return the ordered range of matching v legal documents
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.vportal.portlet.vlegal.model.VLegalDocument> findByG_L_O(
		long groupId, java.lang.String language, java.lang.String orgId,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Finds the first v legal document in the ordered set where groupId = &#63; and language = &#63; and orgId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param groupId the group id to search with
	* @param language the language to search with
	* @param orgId the org id to search with
	* @param orderByComparator the comparator to order the set by
	* @return the first matching v legal document
	* @throws com.vportal.portlet.vlegal.NoSuchVLegalDocumentException if a matching v legal document could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.vportal.portlet.vlegal.model.VLegalDocument findByG_L_O_First(
		long groupId, java.lang.String language, java.lang.String orgId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vlegal.NoSuchVLegalDocumentException;

	/**
	* Finds the last v legal document in the ordered set where groupId = &#63; and language = &#63; and orgId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param groupId the group id to search with
	* @param language the language to search with
	* @param orgId the org id to search with
	* @param orderByComparator the comparator to order the set by
	* @return the last matching v legal document
	* @throws com.vportal.portlet.vlegal.NoSuchVLegalDocumentException if a matching v legal document could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.vportal.portlet.vlegal.model.VLegalDocument findByG_L_O_Last(
		long groupId, java.lang.String language, java.lang.String orgId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vlegal.NoSuchVLegalDocumentException;

	/**
	* Finds the v legal documents before and after the current v legal document in the ordered set where groupId = &#63; and language = &#63; and orgId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param docId the primary key of the current v legal document
	* @param groupId the group id to search with
	* @param language the language to search with
	* @param orgId the org id to search with
	* @param orderByComparator the comparator to order the set by
	* @return the previous, current, and next v legal document
	* @throws com.vportal.portlet.vlegal.NoSuchVLegalDocumentException if a v legal document with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.vportal.portlet.vlegal.model.VLegalDocument[] findByG_L_O_PrevAndNext(
		java.lang.String docId, long groupId, java.lang.String language,
		java.lang.String orgId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vlegal.NoSuchVLegalDocumentException;

	/**
	* Finds all the v legal documents where language = &#63; and orgId = &#63; and statusDoc = &#63;.
	*
	* @param language the language to search with
	* @param orgId the org id to search with
	* @param statusDoc the status doc to search with
	* @return the matching v legal documents
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.vportal.portlet.vlegal.model.VLegalDocument> findByL_O(
		java.lang.String language, java.lang.String orgId, int statusDoc)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Finds a range of all the v legal documents where language = &#63; and orgId = &#63; and statusDoc = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param language the language to search with
	* @param orgId the org id to search with
	* @param statusDoc the status doc to search with
	* @param start the lower bound of the range of v legal documents to return
	* @param end the upper bound of the range of v legal documents to return (not inclusive)
	* @return the range of matching v legal documents
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.vportal.portlet.vlegal.model.VLegalDocument> findByL_O(
		java.lang.String language, java.lang.String orgId, int statusDoc,
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Finds an ordered range of all the v legal documents where language = &#63; and orgId = &#63; and statusDoc = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param language the language to search with
	* @param orgId the org id to search with
	* @param statusDoc the status doc to search with
	* @param start the lower bound of the range of v legal documents to return
	* @param end the upper bound of the range of v legal documents to return (not inclusive)
	* @param orderByComparator the comparator to order the results by
	* @return the ordered range of matching v legal documents
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.vportal.portlet.vlegal.model.VLegalDocument> findByL_O(
		java.lang.String language, java.lang.String orgId, int statusDoc,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Finds the first v legal document in the ordered set where language = &#63; and orgId = &#63; and statusDoc = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param language the language to search with
	* @param orgId the org id to search with
	* @param statusDoc the status doc to search with
	* @param orderByComparator the comparator to order the set by
	* @return the first matching v legal document
	* @throws com.vportal.portlet.vlegal.NoSuchVLegalDocumentException if a matching v legal document could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.vportal.portlet.vlegal.model.VLegalDocument findByL_O_First(
		java.lang.String language, java.lang.String orgId, int statusDoc,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vlegal.NoSuchVLegalDocumentException;

	/**
	* Finds the last v legal document in the ordered set where language = &#63; and orgId = &#63; and statusDoc = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param language the language to search with
	* @param orgId the org id to search with
	* @param statusDoc the status doc to search with
	* @param orderByComparator the comparator to order the set by
	* @return the last matching v legal document
	* @throws com.vportal.portlet.vlegal.NoSuchVLegalDocumentException if a matching v legal document could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.vportal.portlet.vlegal.model.VLegalDocument findByL_O_Last(
		java.lang.String language, java.lang.String orgId, int statusDoc,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vlegal.NoSuchVLegalDocumentException;

	/**
	* Finds the v legal documents before and after the current v legal document in the ordered set where language = &#63; and orgId = &#63; and statusDoc = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param docId the primary key of the current v legal document
	* @param language the language to search with
	* @param orgId the org id to search with
	* @param statusDoc the status doc to search with
	* @param orderByComparator the comparator to order the set by
	* @return the previous, current, and next v legal document
	* @throws com.vportal.portlet.vlegal.NoSuchVLegalDocumentException if a v legal document with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.vportal.portlet.vlegal.model.VLegalDocument[] findByL_O_PrevAndNext(
		java.lang.String docId, java.lang.String language,
		java.lang.String orgId, int statusDoc,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vlegal.NoSuchVLegalDocumentException;

	/**
	* Finds all the v legal documents where groupId = &#63; and language = &#63; and typeDocId = &#63;.
	*
	* @param groupId the group id to search with
	* @param language the language to search with
	* @param typeDocId the type doc id to search with
	* @return the matching v legal documents
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.vportal.portlet.vlegal.model.VLegalDocument> findByG_L_T(
		long groupId, java.lang.String language, java.lang.String typeDocId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Finds a range of all the v legal documents where groupId = &#63; and language = &#63; and typeDocId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param groupId the group id to search with
	* @param language the language to search with
	* @param typeDocId the type doc id to search with
	* @param start the lower bound of the range of v legal documents to return
	* @param end the upper bound of the range of v legal documents to return (not inclusive)
	* @return the range of matching v legal documents
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.vportal.portlet.vlegal.model.VLegalDocument> findByG_L_T(
		long groupId, java.lang.String language, java.lang.String typeDocId,
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Finds an ordered range of all the v legal documents where groupId = &#63; and language = &#63; and typeDocId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param groupId the group id to search with
	* @param language the language to search with
	* @param typeDocId the type doc id to search with
	* @param start the lower bound of the range of v legal documents to return
	* @param end the upper bound of the range of v legal documents to return (not inclusive)
	* @param orderByComparator the comparator to order the results by
	* @return the ordered range of matching v legal documents
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.vportal.portlet.vlegal.model.VLegalDocument> findByG_L_T(
		long groupId, java.lang.String language, java.lang.String typeDocId,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Finds the first v legal document in the ordered set where groupId = &#63; and language = &#63; and typeDocId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param groupId the group id to search with
	* @param language the language to search with
	* @param typeDocId the type doc id to search with
	* @param orderByComparator the comparator to order the set by
	* @return the first matching v legal document
	* @throws com.vportal.portlet.vlegal.NoSuchVLegalDocumentException if a matching v legal document could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.vportal.portlet.vlegal.model.VLegalDocument findByG_L_T_First(
		long groupId, java.lang.String language, java.lang.String typeDocId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vlegal.NoSuchVLegalDocumentException;

	/**
	* Finds the last v legal document in the ordered set where groupId = &#63; and language = &#63; and typeDocId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param groupId the group id to search with
	* @param language the language to search with
	* @param typeDocId the type doc id to search with
	* @param orderByComparator the comparator to order the set by
	* @return the last matching v legal document
	* @throws com.vportal.portlet.vlegal.NoSuchVLegalDocumentException if a matching v legal document could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.vportal.portlet.vlegal.model.VLegalDocument findByG_L_T_Last(
		long groupId, java.lang.String language, java.lang.String typeDocId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vlegal.NoSuchVLegalDocumentException;

	/**
	* Finds the v legal documents before and after the current v legal document in the ordered set where groupId = &#63; and language = &#63; and typeDocId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param docId the primary key of the current v legal document
	* @param groupId the group id to search with
	* @param language the language to search with
	* @param typeDocId the type doc id to search with
	* @param orderByComparator the comparator to order the set by
	* @return the previous, current, and next v legal document
	* @throws com.vportal.portlet.vlegal.NoSuchVLegalDocumentException if a v legal document with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.vportal.portlet.vlegal.model.VLegalDocument[] findByG_L_T_PrevAndNext(
		java.lang.String docId, long groupId, java.lang.String language,
		java.lang.String typeDocId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vlegal.NoSuchVLegalDocumentException;

	/**
	* Finds all the v legal documents where groupId = &#63; and language = &#63; and fieldId = &#63;.
	*
	* @param groupId the group id to search with
	* @param language the language to search with
	* @param fieldId the field id to search with
	* @return the matching v legal documents
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.vportal.portlet.vlegal.model.VLegalDocument> findByG_L_F(
		long groupId, java.lang.String language, java.lang.String fieldId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Finds a range of all the v legal documents where groupId = &#63; and language = &#63; and fieldId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param groupId the group id to search with
	* @param language the language to search with
	* @param fieldId the field id to search with
	* @param start the lower bound of the range of v legal documents to return
	* @param end the upper bound of the range of v legal documents to return (not inclusive)
	* @return the range of matching v legal documents
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.vportal.portlet.vlegal.model.VLegalDocument> findByG_L_F(
		long groupId, java.lang.String language, java.lang.String fieldId,
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Finds an ordered range of all the v legal documents where groupId = &#63; and language = &#63; and fieldId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param groupId the group id to search with
	* @param language the language to search with
	* @param fieldId the field id to search with
	* @param start the lower bound of the range of v legal documents to return
	* @param end the upper bound of the range of v legal documents to return (not inclusive)
	* @param orderByComparator the comparator to order the results by
	* @return the ordered range of matching v legal documents
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.vportal.portlet.vlegal.model.VLegalDocument> findByG_L_F(
		long groupId, java.lang.String language, java.lang.String fieldId,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Finds the first v legal document in the ordered set where groupId = &#63; and language = &#63; and fieldId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param groupId the group id to search with
	* @param language the language to search with
	* @param fieldId the field id to search with
	* @param orderByComparator the comparator to order the set by
	* @return the first matching v legal document
	* @throws com.vportal.portlet.vlegal.NoSuchVLegalDocumentException if a matching v legal document could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.vportal.portlet.vlegal.model.VLegalDocument findByG_L_F_First(
		long groupId, java.lang.String language, java.lang.String fieldId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vlegal.NoSuchVLegalDocumentException;

	/**
	* Finds the last v legal document in the ordered set where groupId = &#63; and language = &#63; and fieldId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param groupId the group id to search with
	* @param language the language to search with
	* @param fieldId the field id to search with
	* @param orderByComparator the comparator to order the set by
	* @return the last matching v legal document
	* @throws com.vportal.portlet.vlegal.NoSuchVLegalDocumentException if a matching v legal document could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.vportal.portlet.vlegal.model.VLegalDocument findByG_L_F_Last(
		long groupId, java.lang.String language, java.lang.String fieldId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vlegal.NoSuchVLegalDocumentException;

	/**
	* Finds the v legal documents before and after the current v legal document in the ordered set where groupId = &#63; and language = &#63; and fieldId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param docId the primary key of the current v legal document
	* @param groupId the group id to search with
	* @param language the language to search with
	* @param fieldId the field id to search with
	* @param orderByComparator the comparator to order the set by
	* @return the previous, current, and next v legal document
	* @throws com.vportal.portlet.vlegal.NoSuchVLegalDocumentException if a v legal document with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.vportal.portlet.vlegal.model.VLegalDocument[] findByG_L_F_PrevAndNext(
		java.lang.String docId, long groupId, java.lang.String language,
		java.lang.String fieldId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vlegal.NoSuchVLegalDocumentException;

	/**
	* Finds all the v legal documents where groupId = &#63; and createdByUser = &#63; and language = &#63; and statusDoc = &#63;.
	*
	* @param groupId the group id to search with
	* @param createdByUser the created by user to search with
	* @param language the language to search with
	* @param statusDoc the status doc to search with
	* @return the matching v legal documents
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.vportal.portlet.vlegal.model.VLegalDocument> findByP_U_S(
		long groupId, long createdByUser, java.lang.String language,
		int statusDoc)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Finds a range of all the v legal documents where groupId = &#63; and createdByUser = &#63; and language = &#63; and statusDoc = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param groupId the group id to search with
	* @param createdByUser the created by user to search with
	* @param language the language to search with
	* @param statusDoc the status doc to search with
	* @param start the lower bound of the range of v legal documents to return
	* @param end the upper bound of the range of v legal documents to return (not inclusive)
	* @return the range of matching v legal documents
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.vportal.portlet.vlegal.model.VLegalDocument> findByP_U_S(
		long groupId, long createdByUser, java.lang.String language,
		int statusDoc, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Finds an ordered range of all the v legal documents where groupId = &#63; and createdByUser = &#63; and language = &#63; and statusDoc = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param groupId the group id to search with
	* @param createdByUser the created by user to search with
	* @param language the language to search with
	* @param statusDoc the status doc to search with
	* @param start the lower bound of the range of v legal documents to return
	* @param end the upper bound of the range of v legal documents to return (not inclusive)
	* @param orderByComparator the comparator to order the results by
	* @return the ordered range of matching v legal documents
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.vportal.portlet.vlegal.model.VLegalDocument> findByP_U_S(
		long groupId, long createdByUser, java.lang.String language,
		int statusDoc, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Finds the first v legal document in the ordered set where groupId = &#63; and createdByUser = &#63; and language = &#63; and statusDoc = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param groupId the group id to search with
	* @param createdByUser the created by user to search with
	* @param language the language to search with
	* @param statusDoc the status doc to search with
	* @param orderByComparator the comparator to order the set by
	* @return the first matching v legal document
	* @throws com.vportal.portlet.vlegal.NoSuchVLegalDocumentException if a matching v legal document could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.vportal.portlet.vlegal.model.VLegalDocument findByP_U_S_First(
		long groupId, long createdByUser, java.lang.String language,
		int statusDoc,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vlegal.NoSuchVLegalDocumentException;

	/**
	* Finds the last v legal document in the ordered set where groupId = &#63; and createdByUser = &#63; and language = &#63; and statusDoc = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param groupId the group id to search with
	* @param createdByUser the created by user to search with
	* @param language the language to search with
	* @param statusDoc the status doc to search with
	* @param orderByComparator the comparator to order the set by
	* @return the last matching v legal document
	* @throws com.vportal.portlet.vlegal.NoSuchVLegalDocumentException if a matching v legal document could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.vportal.portlet.vlegal.model.VLegalDocument findByP_U_S_Last(
		long groupId, long createdByUser, java.lang.String language,
		int statusDoc,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vlegal.NoSuchVLegalDocumentException;

	/**
	* Finds the v legal documents before and after the current v legal document in the ordered set where groupId = &#63; and createdByUser = &#63; and language = &#63; and statusDoc = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param docId the primary key of the current v legal document
	* @param groupId the group id to search with
	* @param createdByUser the created by user to search with
	* @param language the language to search with
	* @param statusDoc the status doc to search with
	* @param orderByComparator the comparator to order the set by
	* @return the previous, current, and next v legal document
	* @throws com.vportal.portlet.vlegal.NoSuchVLegalDocumentException if a v legal document with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.vportal.portlet.vlegal.model.VLegalDocument[] findByP_U_S_PrevAndNext(
		java.lang.String docId, long groupId, long createdByUser,
		java.lang.String language, int statusDoc,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vlegal.NoSuchVLegalDocumentException;

	/**
	* Finds all the v legal documents where statusDoc = &#63;.
	*
	* @param statusDoc the status doc to search with
	* @return the matching v legal documents
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.vportal.portlet.vlegal.model.VLegalDocument> findByStatus(
		int statusDoc)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Finds a range of all the v legal documents where statusDoc = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param statusDoc the status doc to search with
	* @param start the lower bound of the range of v legal documents to return
	* @param end the upper bound of the range of v legal documents to return (not inclusive)
	* @return the range of matching v legal documents
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.vportal.portlet.vlegal.model.VLegalDocument> findByStatus(
		int statusDoc, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Finds an ordered range of all the v legal documents where statusDoc = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param statusDoc the status doc to search with
	* @param start the lower bound of the range of v legal documents to return
	* @param end the upper bound of the range of v legal documents to return (not inclusive)
	* @param orderByComparator the comparator to order the results by
	* @return the ordered range of matching v legal documents
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.vportal.portlet.vlegal.model.VLegalDocument> findByStatus(
		int statusDoc, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Finds the first v legal document in the ordered set where statusDoc = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param statusDoc the status doc to search with
	* @param orderByComparator the comparator to order the set by
	* @return the first matching v legal document
	* @throws com.vportal.portlet.vlegal.NoSuchVLegalDocumentException if a matching v legal document could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.vportal.portlet.vlegal.model.VLegalDocument findByStatus_First(
		int statusDoc,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vlegal.NoSuchVLegalDocumentException;

	/**
	* Finds the last v legal document in the ordered set where statusDoc = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param statusDoc the status doc to search with
	* @param orderByComparator the comparator to order the set by
	* @return the last matching v legal document
	* @throws com.vportal.portlet.vlegal.NoSuchVLegalDocumentException if a matching v legal document could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.vportal.portlet.vlegal.model.VLegalDocument findByStatus_Last(
		int statusDoc,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vlegal.NoSuchVLegalDocumentException;

	/**
	* Finds the v legal documents before and after the current v legal document in the ordered set where statusDoc = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param docId the primary key of the current v legal document
	* @param statusDoc the status doc to search with
	* @param orderByComparator the comparator to order the set by
	* @return the previous, current, and next v legal document
	* @throws com.vportal.portlet.vlegal.NoSuchVLegalDocumentException if a v legal document with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.vportal.portlet.vlegal.model.VLegalDocument[] findByStatus_PrevAndNext(
		java.lang.String docId, int statusDoc,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vlegal.NoSuchVLegalDocumentException;

	/**
	* Finds all the v legal documents where language = &#63; and statusDoc = &#63;.
	*
	* @param language the language to search with
	* @param statusDoc the status doc to search with
	* @return the matching v legal documents
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.vportal.portlet.vlegal.model.VLegalDocument> findByL_S(
		java.lang.String language, int statusDoc)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Finds a range of all the v legal documents where language = &#63; and statusDoc = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param language the language to search with
	* @param statusDoc the status doc to search with
	* @param start the lower bound of the range of v legal documents to return
	* @param end the upper bound of the range of v legal documents to return (not inclusive)
	* @return the range of matching v legal documents
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.vportal.portlet.vlegal.model.VLegalDocument> findByL_S(
		java.lang.String language, int statusDoc, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Finds an ordered range of all the v legal documents where language = &#63; and statusDoc = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param language the language to search with
	* @param statusDoc the status doc to search with
	* @param start the lower bound of the range of v legal documents to return
	* @param end the upper bound of the range of v legal documents to return (not inclusive)
	* @param orderByComparator the comparator to order the results by
	* @return the ordered range of matching v legal documents
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.vportal.portlet.vlegal.model.VLegalDocument> findByL_S(
		java.lang.String language, int statusDoc, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Finds the first v legal document in the ordered set where language = &#63; and statusDoc = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param language the language to search with
	* @param statusDoc the status doc to search with
	* @param orderByComparator the comparator to order the set by
	* @return the first matching v legal document
	* @throws com.vportal.portlet.vlegal.NoSuchVLegalDocumentException if a matching v legal document could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.vportal.portlet.vlegal.model.VLegalDocument findByL_S_First(
		java.lang.String language, int statusDoc,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vlegal.NoSuchVLegalDocumentException;

	/**
	* Finds the last v legal document in the ordered set where language = &#63; and statusDoc = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param language the language to search with
	* @param statusDoc the status doc to search with
	* @param orderByComparator the comparator to order the set by
	* @return the last matching v legal document
	* @throws com.vportal.portlet.vlegal.NoSuchVLegalDocumentException if a matching v legal document could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.vportal.portlet.vlegal.model.VLegalDocument findByL_S_Last(
		java.lang.String language, int statusDoc,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vlegal.NoSuchVLegalDocumentException;

	/**
	* Finds the v legal documents before and after the current v legal document in the ordered set where language = &#63; and statusDoc = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param docId the primary key of the current v legal document
	* @param language the language to search with
	* @param statusDoc the status doc to search with
	* @param orderByComparator the comparator to order the set by
	* @return the previous, current, and next v legal document
	* @throws com.vportal.portlet.vlegal.NoSuchVLegalDocumentException if a v legal document with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.vportal.portlet.vlegal.model.VLegalDocument[] findByL_S_PrevAndNext(
		java.lang.String docId, java.lang.String language, int statusDoc,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vlegal.NoSuchVLegalDocumentException;

	/**
	* Finds all the v legal documents.
	*
	* @return the v legal documents
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.vportal.portlet.vlegal.model.VLegalDocument> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Finds a range of all the v legal documents.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of v legal documents to return
	* @param end the upper bound of the range of v legal documents to return (not inclusive)
	* @return the range of v legal documents
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.vportal.portlet.vlegal.model.VLegalDocument> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Finds an ordered range of all the v legal documents.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of v legal documents to return
	* @param end the upper bound of the range of v legal documents to return (not inclusive)
	* @param orderByComparator the comparator to order the results by
	* @return the ordered range of v legal documents
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.vportal.portlet.vlegal.model.VLegalDocument> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the v legal documents where groupId = &#63; from the database.
	*
	* @param groupId the group id to search with
	* @throws SystemException if a system exception occurred
	*/
	public void removeByGroupId(long groupId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the v legal documents where language = &#63; and promulDate = &#63; and statusDoc = &#63; from the database.
	*
	* @param language the language to search with
	* @param promulDate the promul date to search with
	* @param statusDoc the status doc to search with
	* @throws SystemException if a system exception occurred
	*/
	public void removeByPromulDate(java.lang.String language,
		java.util.Date promulDate, int statusDoc)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the v legal documents where groupId = &#63; and language = &#63; from the database.
	*
	* @param groupId the group id to search with
	* @param language the language to search with
	* @throws SystemException if a system exception occurred
	*/
	public void removeByG_L(long groupId, java.lang.String language)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the v legal documents where groupId = &#63; and typeDocId = &#63; and orgId = &#63; and fieldId = &#63; and language = &#63; and statusDoc = &#63; from the database.
	*
	* @param groupId the group id to search with
	* @param typeDocId the type doc id to search with
	* @param orgId the org id to search with
	* @param fieldId the field id to search with
	* @param language the language to search with
	* @param statusDoc the status doc to search with
	* @throws SystemException if a system exception occurred
	*/
	public void removeByDocsByF_O_T_L_S(long groupId,
		java.lang.String typeDocId, java.lang.String orgId,
		java.lang.String fieldId, java.lang.String language, int statusDoc)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the v legal documents where typeDocId = &#63; and orgId = &#63; and fieldId = &#63; and language = &#63; and statusDoc = &#63; from the database.
	*
	* @param typeDocId the type doc id to search with
	* @param orgId the org id to search with
	* @param fieldId the field id to search with
	* @param language the language to search with
	* @param statusDoc the status doc to search with
	* @throws SystemException if a system exception occurred
	*/
	public void removeByDocsByF_T_O_L_S(java.lang.String typeDocId,
		java.lang.String orgId, java.lang.String fieldId,
		java.lang.String language, int statusDoc)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the v legal documents where companyId = &#63; and typeDocId = &#63; and orgId = &#63; and fieldId = &#63; and language = &#63; and statusDoc = &#63; from the database.
	*
	* @param companyId the company id to search with
	* @param typeDocId the type doc id to search with
	* @param orgId the org id to search with
	* @param fieldId the field id to search with
	* @param language the language to search with
	* @param statusDoc the status doc to search with
	* @throws SystemException if a system exception occurred
	*/
	public void removeByDocsByF_C_O_T_L_S(long companyId,
		java.lang.String typeDocId, java.lang.String orgId,
		java.lang.String fieldId, java.lang.String language, int statusDoc)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the v legal documents where companyId = &#63; and typeDocId = &#63; and orgId = &#63; and fieldId = &#63; and language = &#63; and statusDoc = &#63; from the database.
	*
	* @param companyId the company id to search with
	* @param typeDocId the type doc id to search with
	* @param orgId the org id to search with
	* @param fieldId the field id to search with
	* @param language the language to search with
	* @param statusDoc the status doc to search with
	* @throws SystemException if a system exception occurred
	*/
	public void removeByDocsByC_T_O(long companyId, java.lang.String typeDocId,
		java.lang.String orgId, java.lang.String fieldId,
		java.lang.String language, int statusDoc)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the v legal documents where groupId = &#63; and orgId = &#63; and typeDocId = &#63; and language = &#63; and statusDoc = &#63; from the database.
	*
	* @param groupId the group id to search with
	* @param orgId the org id to search with
	* @param typeDocId the type doc id to search with
	* @param language the language to search with
	* @param statusDoc the status doc to search with
	* @throws SystemException if a system exception occurred
	*/
	public void removeByDocsByG_O_T_L_S(long groupId, java.lang.String orgId,
		java.lang.String typeDocId, java.lang.String language, int statusDoc)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the v legal documents where language = &#63; and orgId = &#63; and fieldId = &#63; and statusDoc = &#63; from the database.
	*
	* @param language the language to search with
	* @param orgId the org id to search with
	* @param fieldId the field id to search with
	* @param statusDoc the status doc to search with
	* @throws SystemException if a system exception occurred
	*/
	public void removeByDocsByL_O_F_S(java.lang.String language,
		java.lang.String orgId, java.lang.String fieldId, int statusDoc)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the v legal documents where language = &#63; and typeDocId = &#63; and fieldId = &#63; and statusDoc = &#63; from the database.
	*
	* @param language the language to search with
	* @param typeDocId the type doc id to search with
	* @param fieldId the field id to search with
	* @param statusDoc the status doc to search with
	* @throws SystemException if a system exception occurred
	*/
	public void removeByDocsByL_T_F_S(java.lang.String language,
		java.lang.String typeDocId, java.lang.String fieldId, int statusDoc)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the v legal documents where typeDocId = &#63; and language = &#63; from the database.
	*
	* @param typeDocId the type doc id to search with
	* @param language the language to search with
	* @throws SystemException if a system exception occurred
	*/
	public void removeByDocsByT_L(java.lang.String typeDocId,
		java.lang.String language)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the v legal documents where groupId = &#63; and language = &#63; and userId = &#63; and statusDoc = &#63; from the database.
	*
	* @param groupId the group id to search with
	* @param language the language to search with
	* @param userId the user id to search with
	* @param statusDoc the status doc to search with
	* @throws SystemException if a system exception occurred
	*/
	public void removeByG_L_U_S(long groupId, java.lang.String language,
		long userId, int statusDoc)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes the v legal document where groupId = &#63; and docId = &#63; from the database.
	*
	* @param groupId the group id to search with
	* @param docId the doc id to search with
	* @throws SystemException if a system exception occurred
	*/
	public void removeByG_D(long groupId, java.lang.String docId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vlegal.NoSuchVLegalDocumentException;

	/**
	* Removes the v legal document where groupId = &#63; and num = &#63; and symbol = &#63; from the database.
	*
	* @param groupId the group id to search with
	* @param num the num to search with
	* @param symbol the symbol to search with
	* @throws SystemException if a system exception occurred
	*/
	public void removeByP_N_S(long groupId, java.lang.String num,
		java.lang.String symbol)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vlegal.NoSuchVLegalDocumentException;

	/**
	* Removes all the v legal documents where groupId = &#63; and language = &#63; and statusDoc = &#63; from the database.
	*
	* @param groupId the group id to search with
	* @param language the language to search with
	* @param statusDoc the status doc to search with
	* @throws SystemException if a system exception occurred
	*/
	public void removeByP_L_S(long groupId, java.lang.String language,
		int statusDoc)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the v legal documents where statusDoc = &#63; from the database.
	*
	* @param statusDoc the status doc to search with
	* @throws SystemException if a system exception occurred
	*/
	public void removeBystatusDoc(int statusDoc)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the v legal documents where groupId = &#63; and language = &#63; and orgId = &#63; and statusDoc = &#63; from the database.
	*
	* @param groupId the group id to search with
	* @param language the language to search with
	* @param orgId the org id to search with
	* @param statusDoc the status doc to search with
	* @throws SystemException if a system exception occurred
	*/
	public void removeByG_L_O_S(long groupId, java.lang.String language,
		java.lang.String orgId, int statusDoc)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the v legal documents where groupId = &#63; and language = &#63; and typeDocId = &#63; and statusDoc = &#63; from the database.
	*
	* @param groupId the group id to search with
	* @param language the language to search with
	* @param typeDocId the type doc id to search with
	* @param statusDoc the status doc to search with
	* @throws SystemException if a system exception occurred
	*/
	public void removeByG_L_T_S(long groupId, java.lang.String language,
		java.lang.String typeDocId, int statusDoc)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the v legal documents where language = &#63; and fieldId = &#63; and statusDoc = &#63; from the database.
	*
	* @param language the language to search with
	* @param fieldId the field id to search with
	* @param statusDoc the status doc to search with
	* @throws SystemException if a system exception occurred
	*/
	public void removeByL_F_S(java.lang.String language,
		java.lang.String fieldId, int statusDoc)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the v legal documents where groupId = &#63; and language = &#63; and fieldId = &#63; and statusDoc = &#63; from the database.
	*
	* @param groupId the group id to search with
	* @param language the language to search with
	* @param fieldId the field id to search with
	* @param statusDoc the status doc to search with
	* @throws SystemException if a system exception occurred
	*/
	public void removeByG_L_F_S(long groupId, java.lang.String language,
		java.lang.String fieldId, int statusDoc)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the v legal documents where groupId = &#63; and language = &#63; and orgId = &#63; from the database.
	*
	* @param groupId the group id to search with
	* @param language the language to search with
	* @param orgId the org id to search with
	* @throws SystemException if a system exception occurred
	*/
	public void removeByG_L_O(long groupId, java.lang.String language,
		java.lang.String orgId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the v legal documents where language = &#63; and orgId = &#63; and statusDoc = &#63; from the database.
	*
	* @param language the language to search with
	* @param orgId the org id to search with
	* @param statusDoc the status doc to search with
	* @throws SystemException if a system exception occurred
	*/
	public void removeByL_O(java.lang.String language, java.lang.String orgId,
		int statusDoc)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the v legal documents where groupId = &#63; and language = &#63; and typeDocId = &#63; from the database.
	*
	* @param groupId the group id to search with
	* @param language the language to search with
	* @param typeDocId the type doc id to search with
	* @throws SystemException if a system exception occurred
	*/
	public void removeByG_L_T(long groupId, java.lang.String language,
		java.lang.String typeDocId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the v legal documents where groupId = &#63; and language = &#63; and fieldId = &#63; from the database.
	*
	* @param groupId the group id to search with
	* @param language the language to search with
	* @param fieldId the field id to search with
	* @throws SystemException if a system exception occurred
	*/
	public void removeByG_L_F(long groupId, java.lang.String language,
		java.lang.String fieldId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the v legal documents where groupId = &#63; and createdByUser = &#63; and language = &#63; and statusDoc = &#63; from the database.
	*
	* @param groupId the group id to search with
	* @param createdByUser the created by user to search with
	* @param language the language to search with
	* @param statusDoc the status doc to search with
	* @throws SystemException if a system exception occurred
	*/
	public void removeByP_U_S(long groupId, long createdByUser,
		java.lang.String language, int statusDoc)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the v legal documents where statusDoc = &#63; from the database.
	*
	* @param statusDoc the status doc to search with
	* @throws SystemException if a system exception occurred
	*/
	public void removeByStatus(int statusDoc)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the v legal documents where language = &#63; and statusDoc = &#63; from the database.
	*
	* @param language the language to search with
	* @param statusDoc the status doc to search with
	* @throws SystemException if a system exception occurred
	*/
	public void removeByL_S(java.lang.String language, int statusDoc)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the v legal documents from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Counts all the v legal documents where groupId = &#63;.
	*
	* @param groupId the group id to search with
	* @return the number of matching v legal documents
	* @throws SystemException if a system exception occurred
	*/
	public int countByGroupId(long groupId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Counts all the v legal documents where language = &#63; and promulDate = &#63; and statusDoc = &#63;.
	*
	* @param language the language to search with
	* @param promulDate the promul date to search with
	* @param statusDoc the status doc to search with
	* @return the number of matching v legal documents
	* @throws SystemException if a system exception occurred
	*/
	public int countByPromulDate(java.lang.String language,
		java.util.Date promulDate, int statusDoc)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Counts all the v legal documents where groupId = &#63; and language = &#63;.
	*
	* @param groupId the group id to search with
	* @param language the language to search with
	* @return the number of matching v legal documents
	* @throws SystemException if a system exception occurred
	*/
	public int countByG_L(long groupId, java.lang.String language)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Counts all the v legal documents where groupId = &#63; and typeDocId = &#63; and orgId = &#63; and fieldId = &#63; and language = &#63; and statusDoc = &#63;.
	*
	* @param groupId the group id to search with
	* @param typeDocId the type doc id to search with
	* @param orgId the org id to search with
	* @param fieldId the field id to search with
	* @param language the language to search with
	* @param statusDoc the status doc to search with
	* @return the number of matching v legal documents
	* @throws SystemException if a system exception occurred
	*/
	public int countByDocsByF_O_T_L_S(long groupId, java.lang.String typeDocId,
		java.lang.String orgId, java.lang.String fieldId,
		java.lang.String language, int statusDoc)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Counts all the v legal documents where typeDocId = &#63; and orgId = &#63; and fieldId = &#63; and language = &#63; and statusDoc = &#63;.
	*
	* @param typeDocId the type doc id to search with
	* @param orgId the org id to search with
	* @param fieldId the field id to search with
	* @param language the language to search with
	* @param statusDoc the status doc to search with
	* @return the number of matching v legal documents
	* @throws SystemException if a system exception occurred
	*/
	public int countByDocsByF_T_O_L_S(java.lang.String typeDocId,
		java.lang.String orgId, java.lang.String fieldId,
		java.lang.String language, int statusDoc)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Counts all the v legal documents where companyId = &#63; and typeDocId = &#63; and orgId = &#63; and fieldId = &#63; and language = &#63; and statusDoc = &#63;.
	*
	* @param companyId the company id to search with
	* @param typeDocId the type doc id to search with
	* @param orgId the org id to search with
	* @param fieldId the field id to search with
	* @param language the language to search with
	* @param statusDoc the status doc to search with
	* @return the number of matching v legal documents
	* @throws SystemException if a system exception occurred
	*/
	public int countByDocsByF_C_O_T_L_S(long companyId,
		java.lang.String typeDocId, java.lang.String orgId,
		java.lang.String fieldId, java.lang.String language, int statusDoc)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Counts all the v legal documents where companyId = &#63; and typeDocId = &#63; and orgId = &#63; and fieldId = &#63; and language = &#63; and statusDoc = &#63;.
	*
	* @param companyId the company id to search with
	* @param typeDocId the type doc id to search with
	* @param orgId the org id to search with
	* @param fieldId the field id to search with
	* @param language the language to search with
	* @param statusDoc the status doc to search with
	* @return the number of matching v legal documents
	* @throws SystemException if a system exception occurred
	*/
	public int countByDocsByC_T_O(long companyId, java.lang.String typeDocId,
		java.lang.String orgId, java.lang.String fieldId,
		java.lang.String language, int statusDoc)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Counts all the v legal documents where groupId = &#63; and orgId = &#63; and typeDocId = &#63; and language = &#63; and statusDoc = &#63;.
	*
	* @param groupId the group id to search with
	* @param orgId the org id to search with
	* @param typeDocId the type doc id to search with
	* @param language the language to search with
	* @param statusDoc the status doc to search with
	* @return the number of matching v legal documents
	* @throws SystemException if a system exception occurred
	*/
	public int countByDocsByG_O_T_L_S(long groupId, java.lang.String orgId,
		java.lang.String typeDocId, java.lang.String language, int statusDoc)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Counts all the v legal documents where language = &#63; and orgId = &#63; and fieldId = &#63; and statusDoc = &#63;.
	*
	* @param language the language to search with
	* @param orgId the org id to search with
	* @param fieldId the field id to search with
	* @param statusDoc the status doc to search with
	* @return the number of matching v legal documents
	* @throws SystemException if a system exception occurred
	*/
	public int countByDocsByL_O_F_S(java.lang.String language,
		java.lang.String orgId, java.lang.String fieldId, int statusDoc)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Counts all the v legal documents where language = &#63; and typeDocId = &#63; and fieldId = &#63; and statusDoc = &#63;.
	*
	* @param language the language to search with
	* @param typeDocId the type doc id to search with
	* @param fieldId the field id to search with
	* @param statusDoc the status doc to search with
	* @return the number of matching v legal documents
	* @throws SystemException if a system exception occurred
	*/
	public int countByDocsByL_T_F_S(java.lang.String language,
		java.lang.String typeDocId, java.lang.String fieldId, int statusDoc)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Counts all the v legal documents where typeDocId = &#63; and language = &#63;.
	*
	* @param typeDocId the type doc id to search with
	* @param language the language to search with
	* @return the number of matching v legal documents
	* @throws SystemException if a system exception occurred
	*/
	public int countByDocsByT_L(java.lang.String typeDocId,
		java.lang.String language)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Counts all the v legal documents where groupId = &#63; and language = &#63; and userId = &#63; and statusDoc = &#63;.
	*
	* @param groupId the group id to search with
	* @param language the language to search with
	* @param userId the user id to search with
	* @param statusDoc the status doc to search with
	* @return the number of matching v legal documents
	* @throws SystemException if a system exception occurred
	*/
	public int countByG_L_U_S(long groupId, java.lang.String language,
		long userId, int statusDoc)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Counts all the v legal documents where groupId = &#63; and docId = &#63;.
	*
	* @param groupId the group id to search with
	* @param docId the doc id to search with
	* @return the number of matching v legal documents
	* @throws SystemException if a system exception occurred
	*/
	public int countByG_D(long groupId, java.lang.String docId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Counts all the v legal documents where groupId = &#63; and num = &#63; and symbol = &#63;.
	*
	* @param groupId the group id to search with
	* @param num the num to search with
	* @param symbol the symbol to search with
	* @return the number of matching v legal documents
	* @throws SystemException if a system exception occurred
	*/
	public int countByP_N_S(long groupId, java.lang.String num,
		java.lang.String symbol)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Counts all the v legal documents where groupId = &#63; and language = &#63; and statusDoc = &#63;.
	*
	* @param groupId the group id to search with
	* @param language the language to search with
	* @param statusDoc the status doc to search with
	* @return the number of matching v legal documents
	* @throws SystemException if a system exception occurred
	*/
	public int countByP_L_S(long groupId, java.lang.String language,
		int statusDoc)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Counts all the v legal documents where statusDoc = &#63;.
	*
	* @param statusDoc the status doc to search with
	* @return the number of matching v legal documents
	* @throws SystemException if a system exception occurred
	*/
	public int countBystatusDoc(int statusDoc)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Counts all the v legal documents where groupId = &#63; and language = &#63; and orgId = &#63; and statusDoc = &#63;.
	*
	* @param groupId the group id to search with
	* @param language the language to search with
	* @param orgId the org id to search with
	* @param statusDoc the status doc to search with
	* @return the number of matching v legal documents
	* @throws SystemException if a system exception occurred
	*/
	public int countByG_L_O_S(long groupId, java.lang.String language,
		java.lang.String orgId, int statusDoc)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Counts all the v legal documents where groupId = &#63; and language = &#63; and typeDocId = &#63; and statusDoc = &#63;.
	*
	* @param groupId the group id to search with
	* @param language the language to search with
	* @param typeDocId the type doc id to search with
	* @param statusDoc the status doc to search with
	* @return the number of matching v legal documents
	* @throws SystemException if a system exception occurred
	*/
	public int countByG_L_T_S(long groupId, java.lang.String language,
		java.lang.String typeDocId, int statusDoc)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Counts all the v legal documents where language = &#63; and fieldId = &#63; and statusDoc = &#63;.
	*
	* @param language the language to search with
	* @param fieldId the field id to search with
	* @param statusDoc the status doc to search with
	* @return the number of matching v legal documents
	* @throws SystemException if a system exception occurred
	*/
	public int countByL_F_S(java.lang.String language,
		java.lang.String fieldId, int statusDoc)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Counts all the v legal documents where groupId = &#63; and language = &#63; and fieldId = &#63; and statusDoc = &#63;.
	*
	* @param groupId the group id to search with
	* @param language the language to search with
	* @param fieldId the field id to search with
	* @param statusDoc the status doc to search with
	* @return the number of matching v legal documents
	* @throws SystemException if a system exception occurred
	*/
	public int countByG_L_F_S(long groupId, java.lang.String language,
		java.lang.String fieldId, int statusDoc)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Counts all the v legal documents where groupId = &#63; and language = &#63; and orgId = &#63;.
	*
	* @param groupId the group id to search with
	* @param language the language to search with
	* @param orgId the org id to search with
	* @return the number of matching v legal documents
	* @throws SystemException if a system exception occurred
	*/
	public int countByG_L_O(long groupId, java.lang.String language,
		java.lang.String orgId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Counts all the v legal documents where language = &#63; and orgId = &#63; and statusDoc = &#63;.
	*
	* @param language the language to search with
	* @param orgId the org id to search with
	* @param statusDoc the status doc to search with
	* @return the number of matching v legal documents
	* @throws SystemException if a system exception occurred
	*/
	public int countByL_O(java.lang.String language, java.lang.String orgId,
		int statusDoc)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Counts all the v legal documents where groupId = &#63; and language = &#63; and typeDocId = &#63;.
	*
	* @param groupId the group id to search with
	* @param language the language to search with
	* @param typeDocId the type doc id to search with
	* @return the number of matching v legal documents
	* @throws SystemException if a system exception occurred
	*/
	public int countByG_L_T(long groupId, java.lang.String language,
		java.lang.String typeDocId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Counts all the v legal documents where groupId = &#63; and language = &#63; and fieldId = &#63;.
	*
	* @param groupId the group id to search with
	* @param language the language to search with
	* @param fieldId the field id to search with
	* @return the number of matching v legal documents
	* @throws SystemException if a system exception occurred
	*/
	public int countByG_L_F(long groupId, java.lang.String language,
		java.lang.String fieldId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Counts all the v legal documents where groupId = &#63; and createdByUser = &#63; and language = &#63; and statusDoc = &#63;.
	*
	* @param groupId the group id to search with
	* @param createdByUser the created by user to search with
	* @param language the language to search with
	* @param statusDoc the status doc to search with
	* @return the number of matching v legal documents
	* @throws SystemException if a system exception occurred
	*/
	public int countByP_U_S(long groupId, long createdByUser,
		java.lang.String language, int statusDoc)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Counts all the v legal documents where statusDoc = &#63;.
	*
	* @param statusDoc the status doc to search with
	* @return the number of matching v legal documents
	* @throws SystemException if a system exception occurred
	*/
	public int countByStatus(int statusDoc)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Counts all the v legal documents where language = &#63; and statusDoc = &#63;.
	*
	* @param language the language to search with
	* @param statusDoc the status doc to search with
	* @return the number of matching v legal documents
	* @throws SystemException if a system exception occurred
	*/
	public int countByL_S(java.lang.String language, int statusDoc)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Counts all the v legal documents.
	*
	* @return the number of v legal documents
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}