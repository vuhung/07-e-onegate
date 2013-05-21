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

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.service.ServiceContext;

import com.vportal.portlet.vlegal.model.VLegalDraftDocument;

import java.util.List;

/**
 * The persistence utility for the v legal draft document service. This utility wraps {@link VLegalDraftDocumentPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Never modify this class directly. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
 * </p>
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author ACB
 * @see VLegalDraftDocumentPersistence
 * @see VLegalDraftDocumentPersistenceImpl
 * @generated
 */
public class VLegalDraftDocumentUtil {
	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#clearCache()
	 */
	public static void clearCache() {
		getPersistence().clearCache();
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#clearCache(com.liferay.portal.model.BaseModel)
	 */
	public static void clearCache(VLegalDraftDocument vLegalDraftDocument) {
		getPersistence().clearCache(vLegalDraftDocument);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#countWithDynamicQuery(DynamicQuery)
	 */
	public long countWithDynamicQuery(DynamicQuery dynamicQuery)
		throws SystemException {
		return getPersistence().countWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<VLegalDraftDocument> findWithDynamicQuery(
		DynamicQuery dynamicQuery) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<VLegalDraftDocument> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<VLegalDraftDocument> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#remove(com.liferay.portal.model.BaseModel)
	 */
	public static VLegalDraftDocument remove(
		VLegalDraftDocument vLegalDraftDocument) throws SystemException {
		return getPersistence().remove(vLegalDraftDocument);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, boolean)
	 */
	public static VLegalDraftDocument update(
		VLegalDraftDocument vLegalDraftDocument, boolean merge)
		throws SystemException {
		return getPersistence().update(vLegalDraftDocument, merge);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, boolean, ServiceContext)
	 */
	public static VLegalDraftDocument update(
		VLegalDraftDocument vLegalDraftDocument, boolean merge,
		ServiceContext serviceContext) throws SystemException {
		return getPersistence()
				   .update(vLegalDraftDocument, merge, serviceContext);
	}

	/**
	* Caches the v legal draft document in the entity cache if it is enabled.
	*
	* @param vLegalDraftDocument the v legal draft document to cache
	*/
	public static void cacheResult(
		com.vportal.portlet.vlegal.model.VLegalDraftDocument vLegalDraftDocument) {
		getPersistence().cacheResult(vLegalDraftDocument);
	}

	/**
	* Caches the v legal draft documents in the entity cache if it is enabled.
	*
	* @param vLegalDraftDocuments the v legal draft documents to cache
	*/
	public static void cacheResult(
		java.util.List<com.vportal.portlet.vlegal.model.VLegalDraftDocument> vLegalDraftDocuments) {
		getPersistence().cacheResult(vLegalDraftDocuments);
	}

	/**
	* Creates a new v legal draft document with the primary key. Does not add the v legal draft document to the database.
	*
	* @param draftId the primary key for the new v legal draft document
	* @return the new v legal draft document
	*/
	public static com.vportal.portlet.vlegal.model.VLegalDraftDocument create(
		java.lang.String draftId) {
		return getPersistence().create(draftId);
	}

	/**
	* Removes the v legal draft document with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param draftId the primary key of the v legal draft document to remove
	* @return the v legal draft document that was removed
	* @throws com.vportal.portlet.vlegal.NoSuchVLegalDraftDocumentException if a v legal draft document with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.vportal.portlet.vlegal.model.VLegalDraftDocument remove(
		java.lang.String draftId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vlegal.NoSuchVLegalDraftDocumentException {
		return getPersistence().remove(draftId);
	}

	public static com.vportal.portlet.vlegal.model.VLegalDraftDocument updateImpl(
		com.vportal.portlet.vlegal.model.VLegalDraftDocument vLegalDraftDocument,
		boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(vLegalDraftDocument, merge);
	}

	/**
	* Finds the v legal draft document with the primary key or throws a {@link com.vportal.portlet.vlegal.NoSuchVLegalDraftDocumentException} if it could not be found.
	*
	* @param draftId the primary key of the v legal draft document to find
	* @return the v legal draft document
	* @throws com.vportal.portlet.vlegal.NoSuchVLegalDraftDocumentException if a v legal draft document with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.vportal.portlet.vlegal.model.VLegalDraftDocument findByPrimaryKey(
		java.lang.String draftId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vlegal.NoSuchVLegalDraftDocumentException {
		return getPersistence().findByPrimaryKey(draftId);
	}

	/**
	* Finds the v legal draft document with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param draftId the primary key of the v legal draft document to find
	* @return the v legal draft document, or <code>null</code> if a v legal draft document with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.vportal.portlet.vlegal.model.VLegalDraftDocument fetchByPrimaryKey(
		java.lang.String draftId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(draftId);
	}

	/**
	* Finds all the v legal draft documents where groupId = &#63;.
	*
	* @param groupId the group id to search with
	* @return the matching v legal draft documents
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.vportal.portlet.vlegal.model.VLegalDraftDocument> findByGroupId(
		long groupId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByGroupId(groupId);
	}

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
	public static java.util.List<com.vportal.portlet.vlegal.model.VLegalDraftDocument> findByGroupId(
		long groupId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByGroupId(groupId, start, end);
	}

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
	public static java.util.List<com.vportal.portlet.vlegal.model.VLegalDraftDocument> findByGroupId(
		long groupId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByGroupId(groupId, start, end, orderByComparator);
	}

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
	public static com.vportal.portlet.vlegal.model.VLegalDraftDocument findByGroupId_First(
		long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vlegal.NoSuchVLegalDraftDocumentException {
		return getPersistence().findByGroupId_First(groupId, orderByComparator);
	}

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
	public static com.vportal.portlet.vlegal.model.VLegalDraftDocument findByGroupId_Last(
		long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vlegal.NoSuchVLegalDraftDocumentException {
		return getPersistence().findByGroupId_Last(groupId, orderByComparator);
	}

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
	public static com.vportal.portlet.vlegal.model.VLegalDraftDocument[] findByGroupId_PrevAndNext(
		java.lang.String draftId, long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vlegal.NoSuchVLegalDraftDocumentException {
		return getPersistence()
				   .findByGroupId_PrevAndNext(draftId, groupId,
			orderByComparator);
	}

	/**
	* Finds the v legal draft document where groupId = &#63; and draftId = &#63; or throws a {@link com.vportal.portlet.vlegal.NoSuchVLegalDraftDocumentException} if it could not be found.
	*
	* @param groupId the group id to search with
	* @param draftId the draft id to search with
	* @return the matching v legal draft document
	* @throws com.vportal.portlet.vlegal.NoSuchVLegalDraftDocumentException if a matching v legal draft document could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.vportal.portlet.vlegal.model.VLegalDraftDocument findByG_D(
		long groupId, java.lang.String draftId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vlegal.NoSuchVLegalDraftDocumentException {
		return getPersistence().findByG_D(groupId, draftId);
	}

	/**
	* Finds the v legal draft document where groupId = &#63; and draftId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param groupId the group id to search with
	* @param draftId the draft id to search with
	* @return the matching v legal draft document, or <code>null</code> if a matching v legal draft document could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.vportal.portlet.vlegal.model.VLegalDraftDocument fetchByG_D(
		long groupId, java.lang.String draftId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByG_D(groupId, draftId);
	}

	/**
	* Finds the v legal draft document where groupId = &#63; and draftId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param groupId the group id to search with
	* @param draftId the draft id to search with
	* @return the matching v legal draft document, or <code>null</code> if a matching v legal draft document could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.vportal.portlet.vlegal.model.VLegalDraftDocument fetchByG_D(
		long groupId, java.lang.String draftId, boolean retrieveFromCache)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByG_D(groupId, draftId, retrieveFromCache);
	}

	/**
	* Finds all the v legal draft documents where groupId = &#63; and statusDraft = &#63; and docCode = &#63;.
	*
	* @param groupId the group id to search with
	* @param statusDraft the status draft to search with
	* @param docCode the doc code to search with
	* @return the matching v legal draft documents
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.vportal.portlet.vlegal.model.VLegalDraftDocument> findByP_S_D(
		long groupId, int statusDraft, java.lang.String docCode)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByP_S_D(groupId, statusDraft, docCode);
	}

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
	public static java.util.List<com.vportal.portlet.vlegal.model.VLegalDraftDocument> findByP_S_D(
		long groupId, int statusDraft, java.lang.String docCode, int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByP_S_D(groupId, statusDraft, docCode, start, end);
	}

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
	public static java.util.List<com.vportal.portlet.vlegal.model.VLegalDraftDocument> findByP_S_D(
		long groupId, int statusDraft, java.lang.String docCode, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByP_S_D(groupId, statusDraft, docCode, start, end,
			orderByComparator);
	}

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
	public static com.vportal.portlet.vlegal.model.VLegalDraftDocument findByP_S_D_First(
		long groupId, int statusDraft, java.lang.String docCode,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vlegal.NoSuchVLegalDraftDocumentException {
		return getPersistence()
				   .findByP_S_D_First(groupId, statusDraft, docCode,
			orderByComparator);
	}

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
	public static com.vportal.portlet.vlegal.model.VLegalDraftDocument findByP_S_D_Last(
		long groupId, int statusDraft, java.lang.String docCode,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vlegal.NoSuchVLegalDraftDocumentException {
		return getPersistence()
				   .findByP_S_D_Last(groupId, statusDraft, docCode,
			orderByComparator);
	}

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
	public static com.vportal.portlet.vlegal.model.VLegalDraftDocument[] findByP_S_D_PrevAndNext(
		java.lang.String draftId, long groupId, int statusDraft,
		java.lang.String docCode,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vlegal.NoSuchVLegalDraftDocumentException {
		return getPersistence()
				   .findByP_S_D_PrevAndNext(draftId, groupId, statusDraft,
			docCode, orderByComparator);
	}

	/**
	* Finds all the v legal draft documents where groupId = &#63; and statusDraft = &#63; and fieldId = &#63;.
	*
	* @param groupId the group id to search with
	* @param statusDraft the status draft to search with
	* @param fieldId the field id to search with
	* @return the matching v legal draft documents
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.vportal.portlet.vlegal.model.VLegalDraftDocument> findByP_S_F(
		long groupId, int statusDraft, java.lang.String fieldId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByP_S_F(groupId, statusDraft, fieldId);
	}

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
	public static java.util.List<com.vportal.portlet.vlegal.model.VLegalDraftDocument> findByP_S_F(
		long groupId, int statusDraft, java.lang.String fieldId, int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByP_S_F(groupId, statusDraft, fieldId, start, end);
	}

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
	public static java.util.List<com.vportal.portlet.vlegal.model.VLegalDraftDocument> findByP_S_F(
		long groupId, int statusDraft, java.lang.String fieldId, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByP_S_F(groupId, statusDraft, fieldId, start, end,
			orderByComparator);
	}

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
	public static com.vportal.portlet.vlegal.model.VLegalDraftDocument findByP_S_F_First(
		long groupId, int statusDraft, java.lang.String fieldId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vlegal.NoSuchVLegalDraftDocumentException {
		return getPersistence()
				   .findByP_S_F_First(groupId, statusDraft, fieldId,
			orderByComparator);
	}

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
	public static com.vportal.portlet.vlegal.model.VLegalDraftDocument findByP_S_F_Last(
		long groupId, int statusDraft, java.lang.String fieldId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vlegal.NoSuchVLegalDraftDocumentException {
		return getPersistence()
				   .findByP_S_F_Last(groupId, statusDraft, fieldId,
			orderByComparator);
	}

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
	public static com.vportal.portlet.vlegal.model.VLegalDraftDocument[] findByP_S_F_PrevAndNext(
		java.lang.String draftId, long groupId, int statusDraft,
		java.lang.String fieldId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vlegal.NoSuchVLegalDraftDocumentException {
		return getPersistence()
				   .findByP_S_F_PrevAndNext(draftId, groupId, statusDraft,
			fieldId, orderByComparator);
	}

	/**
	* Finds all the v legal draft documents where groupId = &#63; and statusDraft = &#63; and typeId = &#63;.
	*
	* @param groupId the group id to search with
	* @param statusDraft the status draft to search with
	* @param typeId the type id to search with
	* @return the matching v legal draft documents
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.vportal.portlet.vlegal.model.VLegalDraftDocument> findByP_S_T(
		long groupId, int statusDraft, java.lang.String typeId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByP_S_T(groupId, statusDraft, typeId);
	}

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
	public static java.util.List<com.vportal.portlet.vlegal.model.VLegalDraftDocument> findByP_S_T(
		long groupId, int statusDraft, java.lang.String typeId, int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByP_S_T(groupId, statusDraft, typeId, start, end);
	}

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
	public static java.util.List<com.vportal.portlet.vlegal.model.VLegalDraftDocument> findByP_S_T(
		long groupId, int statusDraft, java.lang.String typeId, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByP_S_T(groupId, statusDraft, typeId, start, end,
			orderByComparator);
	}

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
	public static com.vportal.portlet.vlegal.model.VLegalDraftDocument findByP_S_T_First(
		long groupId, int statusDraft, java.lang.String typeId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vlegal.NoSuchVLegalDraftDocumentException {
		return getPersistence()
				   .findByP_S_T_First(groupId, statusDraft, typeId,
			orderByComparator);
	}

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
	public static com.vportal.portlet.vlegal.model.VLegalDraftDocument findByP_S_T_Last(
		long groupId, int statusDraft, java.lang.String typeId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vlegal.NoSuchVLegalDraftDocumentException {
		return getPersistence()
				   .findByP_S_T_Last(groupId, statusDraft, typeId,
			orderByComparator);
	}

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
	public static com.vportal.portlet.vlegal.model.VLegalDraftDocument[] findByP_S_T_PrevAndNext(
		java.lang.String draftId, long groupId, int statusDraft,
		java.lang.String typeId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vlegal.NoSuchVLegalDraftDocumentException {
		return getPersistence()
				   .findByP_S_T_PrevAndNext(draftId, groupId, statusDraft,
			typeId, orderByComparator);
	}

	/**
	* Finds all the v legal draft documents where groupId = &#63; and statusDraft = &#63; and language = &#63;.
	*
	* @param groupId the group id to search with
	* @param statusDraft the status draft to search with
	* @param language the language to search with
	* @return the matching v legal draft documents
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.vportal.portlet.vlegal.model.VLegalDraftDocument> findByP_S_L(
		long groupId, int statusDraft, java.lang.String language)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByP_S_L(groupId, statusDraft, language);
	}

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
	public static java.util.List<com.vportal.portlet.vlegal.model.VLegalDraftDocument> findByP_S_L(
		long groupId, int statusDraft, java.lang.String language, int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByP_S_L(groupId, statusDraft, language, start, end);
	}

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
	public static java.util.List<com.vportal.portlet.vlegal.model.VLegalDraftDocument> findByP_S_L(
		long groupId, int statusDraft, java.lang.String language, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByP_S_L(groupId, statusDraft, language, start, end,
			orderByComparator);
	}

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
	public static com.vportal.portlet.vlegal.model.VLegalDraftDocument findByP_S_L_First(
		long groupId, int statusDraft, java.lang.String language,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vlegal.NoSuchVLegalDraftDocumentException {
		return getPersistence()
				   .findByP_S_L_First(groupId, statusDraft, language,
			orderByComparator);
	}

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
	public static com.vportal.portlet.vlegal.model.VLegalDraftDocument findByP_S_L_Last(
		long groupId, int statusDraft, java.lang.String language,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vlegal.NoSuchVLegalDraftDocumentException {
		return getPersistence()
				   .findByP_S_L_Last(groupId, statusDraft, language,
			orderByComparator);
	}

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
	public static com.vportal.portlet.vlegal.model.VLegalDraftDocument[] findByP_S_L_PrevAndNext(
		java.lang.String draftId, long groupId, int statusDraft,
		java.lang.String language,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vlegal.NoSuchVLegalDraftDocumentException {
		return getPersistence()
				   .findByP_S_L_PrevAndNext(draftId, groupId, statusDraft,
			language, orderByComparator);
	}

	/**
	* Finds all the v legal draft documents where groupId = &#63; and language = &#63;.
	*
	* @param groupId the group id to search with
	* @param language the language to search with
	* @return the matching v legal draft documents
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.vportal.portlet.vlegal.model.VLegalDraftDocument> findByP_L(
		long groupId, java.lang.String language)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByP_L(groupId, language);
	}

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
	public static java.util.List<com.vportal.portlet.vlegal.model.VLegalDraftDocument> findByP_L(
		long groupId, java.lang.String language, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByP_L(groupId, language, start, end);
	}

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
	public static java.util.List<com.vportal.portlet.vlegal.model.VLegalDraftDocument> findByP_L(
		long groupId, java.lang.String language, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByP_L(groupId, language, start, end, orderByComparator);
	}

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
	public static com.vportal.portlet.vlegal.model.VLegalDraftDocument findByP_L_First(
		long groupId, java.lang.String language,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vlegal.NoSuchVLegalDraftDocumentException {
		return getPersistence()
				   .findByP_L_First(groupId, language, orderByComparator);
	}

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
	public static com.vportal.portlet.vlegal.model.VLegalDraftDocument findByP_L_Last(
		long groupId, java.lang.String language,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vlegal.NoSuchVLegalDraftDocumentException {
		return getPersistence()
				   .findByP_L_Last(groupId, language, orderByComparator);
	}

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
	public static com.vportal.portlet.vlegal.model.VLegalDraftDocument[] findByP_L_PrevAndNext(
		java.lang.String draftId, long groupId, java.lang.String language,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vlegal.NoSuchVLegalDraftDocumentException {
		return getPersistence()
				   .findByP_L_PrevAndNext(draftId, groupId, language,
			orderByComparator);
	}

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
	public static java.util.List<com.vportal.portlet.vlegal.model.VLegalDraftDocument> findByP_S_U_L(
		long groupId, int statusDraft, long createdByUser,
		java.lang.String language)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByP_S_U_L(groupId, statusDraft, createdByUser, language);
	}

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
	public static java.util.List<com.vportal.portlet.vlegal.model.VLegalDraftDocument> findByP_S_U_L(
		long groupId, int statusDraft, long createdByUser,
		java.lang.String language, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByP_S_U_L(groupId, statusDraft, createdByUser,
			language, start, end);
	}

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
	public static java.util.List<com.vportal.portlet.vlegal.model.VLegalDraftDocument> findByP_S_U_L(
		long groupId, int statusDraft, long createdByUser,
		java.lang.String language, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByP_S_U_L(groupId, statusDraft, createdByUser,
			language, start, end, orderByComparator);
	}

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
	public static com.vportal.portlet.vlegal.model.VLegalDraftDocument findByP_S_U_L_First(
		long groupId, int statusDraft, long createdByUser,
		java.lang.String language,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vlegal.NoSuchVLegalDraftDocumentException {
		return getPersistence()
				   .findByP_S_U_L_First(groupId, statusDraft, createdByUser,
			language, orderByComparator);
	}

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
	public static com.vportal.portlet.vlegal.model.VLegalDraftDocument findByP_S_U_L_Last(
		long groupId, int statusDraft, long createdByUser,
		java.lang.String language,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vlegal.NoSuchVLegalDraftDocumentException {
		return getPersistence()
				   .findByP_S_U_L_Last(groupId, statusDraft, createdByUser,
			language, orderByComparator);
	}

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
	public static com.vportal.portlet.vlegal.model.VLegalDraftDocument[] findByP_S_U_L_PrevAndNext(
		java.lang.String draftId, long groupId, int statusDraft,
		long createdByUser, java.lang.String language,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vlegal.NoSuchVLegalDraftDocumentException {
		return getPersistence()
				   .findByP_S_U_L_PrevAndNext(draftId, groupId, statusDraft,
			createdByUser, language, orderByComparator);
	}

	/**
	* Finds all the v legal draft documents where docCode = &#63;.
	*
	* @param docCode the doc code to search with
	* @return the matching v legal draft documents
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.vportal.portlet.vlegal.model.VLegalDraftDocument> findByDocCode(
		java.lang.String docCode)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByDocCode(docCode);
	}

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
	public static java.util.List<com.vportal.portlet.vlegal.model.VLegalDraftDocument> findByDocCode(
		java.lang.String docCode, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByDocCode(docCode, start, end);
	}

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
	public static java.util.List<com.vportal.portlet.vlegal.model.VLegalDraftDocument> findByDocCode(
		java.lang.String docCode, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByDocCode(docCode, start, end, orderByComparator);
	}

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
	public static com.vportal.portlet.vlegal.model.VLegalDraftDocument findByDocCode_First(
		java.lang.String docCode,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vlegal.NoSuchVLegalDraftDocumentException {
		return getPersistence().findByDocCode_First(docCode, orderByComparator);
	}

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
	public static com.vportal.portlet.vlegal.model.VLegalDraftDocument findByDocCode_Last(
		java.lang.String docCode,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vlegal.NoSuchVLegalDraftDocumentException {
		return getPersistence().findByDocCode_Last(docCode, orderByComparator);
	}

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
	public static com.vportal.portlet.vlegal.model.VLegalDraftDocument[] findByDocCode_PrevAndNext(
		java.lang.String draftId, java.lang.String docCode,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vlegal.NoSuchVLegalDraftDocumentException {
		return getPersistence()
				   .findByDocCode_PrevAndNext(draftId, docCode,
			orderByComparator);
	}

	/**
	* Finds all the v legal draft documents.
	*
	* @return the v legal draft documents
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.vportal.portlet.vlegal.model.VLegalDraftDocument> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
	}

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
	public static java.util.List<com.vportal.portlet.vlegal.model.VLegalDraftDocument> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

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
	public static java.util.List<com.vportal.portlet.vlegal.model.VLegalDraftDocument> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the v legal draft documents where groupId = &#63; from the database.
	*
	* @param groupId the group id to search with
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByGroupId(long groupId)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByGroupId(groupId);
	}

	/**
	* Removes the v legal draft document where groupId = &#63; and draftId = &#63; from the database.
	*
	* @param groupId the group id to search with
	* @param draftId the draft id to search with
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByG_D(long groupId, java.lang.String draftId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vlegal.NoSuchVLegalDraftDocumentException {
		getPersistence().removeByG_D(groupId, draftId);
	}

	/**
	* Removes all the v legal draft documents where groupId = &#63; and statusDraft = &#63; and docCode = &#63; from the database.
	*
	* @param groupId the group id to search with
	* @param statusDraft the status draft to search with
	* @param docCode the doc code to search with
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByP_S_D(long groupId, int statusDraft,
		java.lang.String docCode)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByP_S_D(groupId, statusDraft, docCode);
	}

	/**
	* Removes all the v legal draft documents where groupId = &#63; and statusDraft = &#63; and fieldId = &#63; from the database.
	*
	* @param groupId the group id to search with
	* @param statusDraft the status draft to search with
	* @param fieldId the field id to search with
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByP_S_F(long groupId, int statusDraft,
		java.lang.String fieldId)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByP_S_F(groupId, statusDraft, fieldId);
	}

	/**
	* Removes all the v legal draft documents where groupId = &#63; and statusDraft = &#63; and typeId = &#63; from the database.
	*
	* @param groupId the group id to search with
	* @param statusDraft the status draft to search with
	* @param typeId the type id to search with
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByP_S_T(long groupId, int statusDraft,
		java.lang.String typeId)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByP_S_T(groupId, statusDraft, typeId);
	}

	/**
	* Removes all the v legal draft documents where groupId = &#63; and statusDraft = &#63; and language = &#63; from the database.
	*
	* @param groupId the group id to search with
	* @param statusDraft the status draft to search with
	* @param language the language to search with
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByP_S_L(long groupId, int statusDraft,
		java.lang.String language)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByP_S_L(groupId, statusDraft, language);
	}

	/**
	* Removes all the v legal draft documents where groupId = &#63; and language = &#63; from the database.
	*
	* @param groupId the group id to search with
	* @param language the language to search with
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByP_L(long groupId, java.lang.String language)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByP_L(groupId, language);
	}

	/**
	* Removes all the v legal draft documents where groupId = &#63; and statusDraft = &#63; and createdByUser = &#63; and language = &#63; from the database.
	*
	* @param groupId the group id to search with
	* @param statusDraft the status draft to search with
	* @param createdByUser the created by user to search with
	* @param language the language to search with
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByP_S_U_L(long groupId, int statusDraft,
		long createdByUser, java.lang.String language)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence()
			.removeByP_S_U_L(groupId, statusDraft, createdByUser, language);
	}

	/**
	* Removes all the v legal draft documents where docCode = &#63; from the database.
	*
	* @param docCode the doc code to search with
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByDocCode(java.lang.String docCode)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByDocCode(docCode);
	}

	/**
	* Removes all the v legal draft documents from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Counts all the v legal draft documents where groupId = &#63;.
	*
	* @param groupId the group id to search with
	* @return the number of matching v legal draft documents
	* @throws SystemException if a system exception occurred
	*/
	public static int countByGroupId(long groupId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByGroupId(groupId);
	}

	/**
	* Counts all the v legal draft documents where groupId = &#63; and draftId = &#63;.
	*
	* @param groupId the group id to search with
	* @param draftId the draft id to search with
	* @return the number of matching v legal draft documents
	* @throws SystemException if a system exception occurred
	*/
	public static int countByG_D(long groupId, java.lang.String draftId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByG_D(groupId, draftId);
	}

	/**
	* Counts all the v legal draft documents where groupId = &#63; and statusDraft = &#63; and docCode = &#63;.
	*
	* @param groupId the group id to search with
	* @param statusDraft the status draft to search with
	* @param docCode the doc code to search with
	* @return the number of matching v legal draft documents
	* @throws SystemException if a system exception occurred
	*/
	public static int countByP_S_D(long groupId, int statusDraft,
		java.lang.String docCode)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByP_S_D(groupId, statusDraft, docCode);
	}

	/**
	* Counts all the v legal draft documents where groupId = &#63; and statusDraft = &#63; and fieldId = &#63;.
	*
	* @param groupId the group id to search with
	* @param statusDraft the status draft to search with
	* @param fieldId the field id to search with
	* @return the number of matching v legal draft documents
	* @throws SystemException if a system exception occurred
	*/
	public static int countByP_S_F(long groupId, int statusDraft,
		java.lang.String fieldId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByP_S_F(groupId, statusDraft, fieldId);
	}

	/**
	* Counts all the v legal draft documents where groupId = &#63; and statusDraft = &#63; and typeId = &#63;.
	*
	* @param groupId the group id to search with
	* @param statusDraft the status draft to search with
	* @param typeId the type id to search with
	* @return the number of matching v legal draft documents
	* @throws SystemException if a system exception occurred
	*/
	public static int countByP_S_T(long groupId, int statusDraft,
		java.lang.String typeId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByP_S_T(groupId, statusDraft, typeId);
	}

	/**
	* Counts all the v legal draft documents where groupId = &#63; and statusDraft = &#63; and language = &#63;.
	*
	* @param groupId the group id to search with
	* @param statusDraft the status draft to search with
	* @param language the language to search with
	* @return the number of matching v legal draft documents
	* @throws SystemException if a system exception occurred
	*/
	public static int countByP_S_L(long groupId, int statusDraft,
		java.lang.String language)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByP_S_L(groupId, statusDraft, language);
	}

	/**
	* Counts all the v legal draft documents where groupId = &#63; and language = &#63;.
	*
	* @param groupId the group id to search with
	* @param language the language to search with
	* @return the number of matching v legal draft documents
	* @throws SystemException if a system exception occurred
	*/
	public static int countByP_L(long groupId, java.lang.String language)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByP_L(groupId, language);
	}

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
	public static int countByP_S_U_L(long groupId, int statusDraft,
		long createdByUser, java.lang.String language)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .countByP_S_U_L(groupId, statusDraft, createdByUser, language);
	}

	/**
	* Counts all the v legal draft documents where docCode = &#63;.
	*
	* @param docCode the doc code to search with
	* @return the number of matching v legal draft documents
	* @throws SystemException if a system exception occurred
	*/
	public static int countByDocCode(java.lang.String docCode)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByDocCode(docCode);
	}

	/**
	* Counts all the v legal draft documents.
	*
	* @return the number of v legal draft documents
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static VLegalDraftDocumentPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (VLegalDraftDocumentPersistence)PortletBeanLocatorUtil.locate(com.vportal.portlet.vlegal.service.ClpSerializer.SERVLET_CONTEXT_NAME,
					VLegalDraftDocumentPersistence.class.getName());
		}

		return _persistence;
	}

	public void setPersistence(VLegalDraftDocumentPersistence persistence) {
		_persistence = persistence;
	}

	private static VLegalDraftDocumentPersistence _persistence;
}