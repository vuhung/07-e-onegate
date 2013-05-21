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

import com.vportal.portlet.vlegal.model.VLegalDocument;

import java.util.List;

/**
 * The persistence utility for the v legal document service. This utility wraps {@link VLegalDocumentPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
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
 * @see VLegalDocumentPersistence
 * @see VLegalDocumentPersistenceImpl
 * @generated
 */
public class VLegalDocumentUtil {
	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#clearCache()
	 */
	public static void clearCache() {
		getPersistence().clearCache();
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#clearCache(com.liferay.portal.model.BaseModel)
	 */
	public static void clearCache(VLegalDocument vLegalDocument) {
		getPersistence().clearCache(vLegalDocument);
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
	public static List<VLegalDocument> findWithDynamicQuery(
		DynamicQuery dynamicQuery) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<VLegalDocument> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<VLegalDocument> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#remove(com.liferay.portal.model.BaseModel)
	 */
	public static VLegalDocument remove(VLegalDocument vLegalDocument)
		throws SystemException {
		return getPersistence().remove(vLegalDocument);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, boolean)
	 */
	public static VLegalDocument update(VLegalDocument vLegalDocument,
		boolean merge) throws SystemException {
		return getPersistence().update(vLegalDocument, merge);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, boolean, ServiceContext)
	 */
	public static VLegalDocument update(VLegalDocument vLegalDocument,
		boolean merge, ServiceContext serviceContext) throws SystemException {
		return getPersistence().update(vLegalDocument, merge, serviceContext);
	}

	/**
	* Caches the v legal document in the entity cache if it is enabled.
	*
	* @param vLegalDocument the v legal document to cache
	*/
	public static void cacheResult(
		com.vportal.portlet.vlegal.model.VLegalDocument vLegalDocument) {
		getPersistence().cacheResult(vLegalDocument);
	}

	/**
	* Caches the v legal documents in the entity cache if it is enabled.
	*
	* @param vLegalDocuments the v legal documents to cache
	*/
	public static void cacheResult(
		java.util.List<com.vportal.portlet.vlegal.model.VLegalDocument> vLegalDocuments) {
		getPersistence().cacheResult(vLegalDocuments);
	}

	/**
	* Creates a new v legal document with the primary key. Does not add the v legal document to the database.
	*
	* @param docId the primary key for the new v legal document
	* @return the new v legal document
	*/
	public static com.vportal.portlet.vlegal.model.VLegalDocument create(
		java.lang.String docId) {
		return getPersistence().create(docId);
	}

	/**
	* Removes the v legal document with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param docId the primary key of the v legal document to remove
	* @return the v legal document that was removed
	* @throws com.vportal.portlet.vlegal.NoSuchVLegalDocumentException if a v legal document with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.vportal.portlet.vlegal.model.VLegalDocument remove(
		java.lang.String docId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vlegal.NoSuchVLegalDocumentException {
		return getPersistence().remove(docId);
	}

	public static com.vportal.portlet.vlegal.model.VLegalDocument updateImpl(
		com.vportal.portlet.vlegal.model.VLegalDocument vLegalDocument,
		boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(vLegalDocument, merge);
	}

	/**
	* Finds the v legal document with the primary key or throws a {@link com.vportal.portlet.vlegal.NoSuchVLegalDocumentException} if it could not be found.
	*
	* @param docId the primary key of the v legal document to find
	* @return the v legal document
	* @throws com.vportal.portlet.vlegal.NoSuchVLegalDocumentException if a v legal document with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.vportal.portlet.vlegal.model.VLegalDocument findByPrimaryKey(
		java.lang.String docId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vlegal.NoSuchVLegalDocumentException {
		return getPersistence().findByPrimaryKey(docId);
	}

	/**
	* Finds the v legal document with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param docId the primary key of the v legal document to find
	* @return the v legal document, or <code>null</code> if a v legal document with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.vportal.portlet.vlegal.model.VLegalDocument fetchByPrimaryKey(
		java.lang.String docId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(docId);
	}

	/**
	* Finds all the v legal documents where groupId = &#63;.
	*
	* @param groupId the group id to search with
	* @return the matching v legal documents
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.vportal.portlet.vlegal.model.VLegalDocument> findByGroupId(
		long groupId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByGroupId(groupId);
	}

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
	public static java.util.List<com.vportal.portlet.vlegal.model.VLegalDocument> findByGroupId(
		long groupId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByGroupId(groupId, start, end);
	}

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
	public static java.util.List<com.vportal.portlet.vlegal.model.VLegalDocument> findByGroupId(
		long groupId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByGroupId(groupId, start, end, orderByComparator);
	}

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
	public static com.vportal.portlet.vlegal.model.VLegalDocument findByGroupId_First(
		long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vlegal.NoSuchVLegalDocumentException {
		return getPersistence().findByGroupId_First(groupId, orderByComparator);
	}

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
	public static com.vportal.portlet.vlegal.model.VLegalDocument findByGroupId_Last(
		long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vlegal.NoSuchVLegalDocumentException {
		return getPersistence().findByGroupId_Last(groupId, orderByComparator);
	}

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
	public static com.vportal.portlet.vlegal.model.VLegalDocument[] findByGroupId_PrevAndNext(
		java.lang.String docId, long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vlegal.NoSuchVLegalDocumentException {
		return getPersistence()
				   .findByGroupId_PrevAndNext(docId, groupId, orderByComparator);
	}

	/**
	* Finds all the v legal documents where language = &#63; and promulDate = &#63; and statusDoc = &#63;.
	*
	* @param language the language to search with
	* @param promulDate the promul date to search with
	* @param statusDoc the status doc to search with
	* @return the matching v legal documents
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.vportal.portlet.vlegal.model.VLegalDocument> findByPromulDate(
		java.lang.String language, java.util.Date promulDate, int statusDoc)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByPromulDate(language, promulDate, statusDoc);
	}

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
	public static java.util.List<com.vportal.portlet.vlegal.model.VLegalDocument> findByPromulDate(
		java.lang.String language, java.util.Date promulDate, int statusDoc,
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByPromulDate(language, promulDate, statusDoc, start, end);
	}

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
	public static java.util.List<com.vportal.portlet.vlegal.model.VLegalDocument> findByPromulDate(
		java.lang.String language, java.util.Date promulDate, int statusDoc,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByPromulDate(language, promulDate, statusDoc, start,
			end, orderByComparator);
	}

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
	public static com.vportal.portlet.vlegal.model.VLegalDocument findByPromulDate_First(
		java.lang.String language, java.util.Date promulDate, int statusDoc,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vlegal.NoSuchVLegalDocumentException {
		return getPersistence()
				   .findByPromulDate_First(language, promulDate, statusDoc,
			orderByComparator);
	}

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
	public static com.vportal.portlet.vlegal.model.VLegalDocument findByPromulDate_Last(
		java.lang.String language, java.util.Date promulDate, int statusDoc,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vlegal.NoSuchVLegalDocumentException {
		return getPersistence()
				   .findByPromulDate_Last(language, promulDate, statusDoc,
			orderByComparator);
	}

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
	public static com.vportal.portlet.vlegal.model.VLegalDocument[] findByPromulDate_PrevAndNext(
		java.lang.String docId, java.lang.String language,
		java.util.Date promulDate, int statusDoc,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vlegal.NoSuchVLegalDocumentException {
		return getPersistence()
				   .findByPromulDate_PrevAndNext(docId, language, promulDate,
			statusDoc, orderByComparator);
	}

	/**
	* Finds all the v legal documents where groupId = &#63; and language = &#63;.
	*
	* @param groupId the group id to search with
	* @param language the language to search with
	* @return the matching v legal documents
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.vportal.portlet.vlegal.model.VLegalDocument> findByG_L(
		long groupId, java.lang.String language)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByG_L(groupId, language);
	}

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
	public static java.util.List<com.vportal.portlet.vlegal.model.VLegalDocument> findByG_L(
		long groupId, java.lang.String language, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByG_L(groupId, language, start, end);
	}

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
	public static java.util.List<com.vportal.portlet.vlegal.model.VLegalDocument> findByG_L(
		long groupId, java.lang.String language, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByG_L(groupId, language, start, end, orderByComparator);
	}

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
	public static com.vportal.portlet.vlegal.model.VLegalDocument findByG_L_First(
		long groupId, java.lang.String language,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vlegal.NoSuchVLegalDocumentException {
		return getPersistence()
				   .findByG_L_First(groupId, language, orderByComparator);
	}

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
	public static com.vportal.portlet.vlegal.model.VLegalDocument findByG_L_Last(
		long groupId, java.lang.String language,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vlegal.NoSuchVLegalDocumentException {
		return getPersistence()
				   .findByG_L_Last(groupId, language, orderByComparator);
	}

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
	public static com.vportal.portlet.vlegal.model.VLegalDocument[] findByG_L_PrevAndNext(
		java.lang.String docId, long groupId, java.lang.String language,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vlegal.NoSuchVLegalDocumentException {
		return getPersistence()
				   .findByG_L_PrevAndNext(docId, groupId, language,
			orderByComparator);
	}

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
	public static java.util.List<com.vportal.portlet.vlegal.model.VLegalDocument> findByDocsByF_O_T_L_S(
		long groupId, java.lang.String typeDocId, java.lang.String orgId,
		java.lang.String fieldId, java.lang.String language, int statusDoc)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByDocsByF_O_T_L_S(groupId, typeDocId, orgId, fieldId,
			language, statusDoc);
	}

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
	public static java.util.List<com.vportal.portlet.vlegal.model.VLegalDocument> findByDocsByF_O_T_L_S(
		long groupId, java.lang.String typeDocId, java.lang.String orgId,
		java.lang.String fieldId, java.lang.String language, int statusDoc,
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByDocsByF_O_T_L_S(groupId, typeDocId, orgId, fieldId,
			language, statusDoc, start, end);
	}

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
	public static java.util.List<com.vportal.portlet.vlegal.model.VLegalDocument> findByDocsByF_O_T_L_S(
		long groupId, java.lang.String typeDocId, java.lang.String orgId,
		java.lang.String fieldId, java.lang.String language, int statusDoc,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByDocsByF_O_T_L_S(groupId, typeDocId, orgId, fieldId,
			language, statusDoc, start, end, orderByComparator);
	}

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
	public static com.vportal.portlet.vlegal.model.VLegalDocument findByDocsByF_O_T_L_S_First(
		long groupId, java.lang.String typeDocId, java.lang.String orgId,
		java.lang.String fieldId, java.lang.String language, int statusDoc,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vlegal.NoSuchVLegalDocumentException {
		return getPersistence()
				   .findByDocsByF_O_T_L_S_First(groupId, typeDocId, orgId,
			fieldId, language, statusDoc, orderByComparator);
	}

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
	public static com.vportal.portlet.vlegal.model.VLegalDocument findByDocsByF_O_T_L_S_Last(
		long groupId, java.lang.String typeDocId, java.lang.String orgId,
		java.lang.String fieldId, java.lang.String language, int statusDoc,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vlegal.NoSuchVLegalDocumentException {
		return getPersistence()
				   .findByDocsByF_O_T_L_S_Last(groupId, typeDocId, orgId,
			fieldId, language, statusDoc, orderByComparator);
	}

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
	public static com.vportal.portlet.vlegal.model.VLegalDocument[] findByDocsByF_O_T_L_S_PrevAndNext(
		java.lang.String docId, long groupId, java.lang.String typeDocId,
		java.lang.String orgId, java.lang.String fieldId,
		java.lang.String language, int statusDoc,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vlegal.NoSuchVLegalDocumentException {
		return getPersistence()
				   .findByDocsByF_O_T_L_S_PrevAndNext(docId, groupId,
			typeDocId, orgId, fieldId, language, statusDoc, orderByComparator);
	}

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
	public static java.util.List<com.vportal.portlet.vlegal.model.VLegalDocument> findByDocsByF_T_O_L_S(
		java.lang.String typeDocId, java.lang.String orgId,
		java.lang.String fieldId, java.lang.String language, int statusDoc)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByDocsByF_T_O_L_S(typeDocId, orgId, fieldId, language,
			statusDoc);
	}

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
	public static java.util.List<com.vportal.portlet.vlegal.model.VLegalDocument> findByDocsByF_T_O_L_S(
		java.lang.String typeDocId, java.lang.String orgId,
		java.lang.String fieldId, java.lang.String language, int statusDoc,
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByDocsByF_T_O_L_S(typeDocId, orgId, fieldId, language,
			statusDoc, start, end);
	}

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
	public static java.util.List<com.vportal.portlet.vlegal.model.VLegalDocument> findByDocsByF_T_O_L_S(
		java.lang.String typeDocId, java.lang.String orgId,
		java.lang.String fieldId, java.lang.String language, int statusDoc,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByDocsByF_T_O_L_S(typeDocId, orgId, fieldId, language,
			statusDoc, start, end, orderByComparator);
	}

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
	public static com.vportal.portlet.vlegal.model.VLegalDocument findByDocsByF_T_O_L_S_First(
		java.lang.String typeDocId, java.lang.String orgId,
		java.lang.String fieldId, java.lang.String language, int statusDoc,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vlegal.NoSuchVLegalDocumentException {
		return getPersistence()
				   .findByDocsByF_T_O_L_S_First(typeDocId, orgId, fieldId,
			language, statusDoc, orderByComparator);
	}

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
	public static com.vportal.portlet.vlegal.model.VLegalDocument findByDocsByF_T_O_L_S_Last(
		java.lang.String typeDocId, java.lang.String orgId,
		java.lang.String fieldId, java.lang.String language, int statusDoc,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vlegal.NoSuchVLegalDocumentException {
		return getPersistence()
				   .findByDocsByF_T_O_L_S_Last(typeDocId, orgId, fieldId,
			language, statusDoc, orderByComparator);
	}

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
	public static com.vportal.portlet.vlegal.model.VLegalDocument[] findByDocsByF_T_O_L_S_PrevAndNext(
		java.lang.String docId, java.lang.String typeDocId,
		java.lang.String orgId, java.lang.String fieldId,
		java.lang.String language, int statusDoc,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vlegal.NoSuchVLegalDocumentException {
		return getPersistence()
				   .findByDocsByF_T_O_L_S_PrevAndNext(docId, typeDocId, orgId,
			fieldId, language, statusDoc, orderByComparator);
	}

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
	public static java.util.List<com.vportal.portlet.vlegal.model.VLegalDocument> findByDocsByF_C_O_T_L_S(
		long companyId, java.lang.String typeDocId, java.lang.String orgId,
		java.lang.String fieldId, java.lang.String language, int statusDoc)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByDocsByF_C_O_T_L_S(companyId, typeDocId, orgId,
			fieldId, language, statusDoc);
	}

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
	public static java.util.List<com.vportal.portlet.vlegal.model.VLegalDocument> findByDocsByF_C_O_T_L_S(
		long companyId, java.lang.String typeDocId, java.lang.String orgId,
		java.lang.String fieldId, java.lang.String language, int statusDoc,
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByDocsByF_C_O_T_L_S(companyId, typeDocId, orgId,
			fieldId, language, statusDoc, start, end);
	}

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
	public static java.util.List<com.vportal.portlet.vlegal.model.VLegalDocument> findByDocsByF_C_O_T_L_S(
		long companyId, java.lang.String typeDocId, java.lang.String orgId,
		java.lang.String fieldId, java.lang.String language, int statusDoc,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByDocsByF_C_O_T_L_S(companyId, typeDocId, orgId,
			fieldId, language, statusDoc, start, end, orderByComparator);
	}

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
	public static com.vportal.portlet.vlegal.model.VLegalDocument findByDocsByF_C_O_T_L_S_First(
		long companyId, java.lang.String typeDocId, java.lang.String orgId,
		java.lang.String fieldId, java.lang.String language, int statusDoc,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vlegal.NoSuchVLegalDocumentException {
		return getPersistence()
				   .findByDocsByF_C_O_T_L_S_First(companyId, typeDocId, orgId,
			fieldId, language, statusDoc, orderByComparator);
	}

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
	public static com.vportal.portlet.vlegal.model.VLegalDocument findByDocsByF_C_O_T_L_S_Last(
		long companyId, java.lang.String typeDocId, java.lang.String orgId,
		java.lang.String fieldId, java.lang.String language, int statusDoc,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vlegal.NoSuchVLegalDocumentException {
		return getPersistence()
				   .findByDocsByF_C_O_T_L_S_Last(companyId, typeDocId, orgId,
			fieldId, language, statusDoc, orderByComparator);
	}

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
	public static com.vportal.portlet.vlegal.model.VLegalDocument[] findByDocsByF_C_O_T_L_S_PrevAndNext(
		java.lang.String docId, long companyId, java.lang.String typeDocId,
		java.lang.String orgId, java.lang.String fieldId,
		java.lang.String language, int statusDoc,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vlegal.NoSuchVLegalDocumentException {
		return getPersistence()
				   .findByDocsByF_C_O_T_L_S_PrevAndNext(docId, companyId,
			typeDocId, orgId, fieldId, language, statusDoc, orderByComparator);
	}

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
	public static java.util.List<com.vportal.portlet.vlegal.model.VLegalDocument> findByDocsByC_T_O(
		long companyId, java.lang.String typeDocId, java.lang.String orgId,
		java.lang.String fieldId, java.lang.String language, int statusDoc)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByDocsByC_T_O(companyId, typeDocId, orgId, fieldId,
			language, statusDoc);
	}

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
	public static java.util.List<com.vportal.portlet.vlegal.model.VLegalDocument> findByDocsByC_T_O(
		long companyId, java.lang.String typeDocId, java.lang.String orgId,
		java.lang.String fieldId, java.lang.String language, int statusDoc,
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByDocsByC_T_O(companyId, typeDocId, orgId, fieldId,
			language, statusDoc, start, end);
	}

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
	public static java.util.List<com.vportal.portlet.vlegal.model.VLegalDocument> findByDocsByC_T_O(
		long companyId, java.lang.String typeDocId, java.lang.String orgId,
		java.lang.String fieldId, java.lang.String language, int statusDoc,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByDocsByC_T_O(companyId, typeDocId, orgId, fieldId,
			language, statusDoc, start, end, orderByComparator);
	}

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
	public static com.vportal.portlet.vlegal.model.VLegalDocument findByDocsByC_T_O_First(
		long companyId, java.lang.String typeDocId, java.lang.String orgId,
		java.lang.String fieldId, java.lang.String language, int statusDoc,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vlegal.NoSuchVLegalDocumentException {
		return getPersistence()
				   .findByDocsByC_T_O_First(companyId, typeDocId, orgId,
			fieldId, language, statusDoc, orderByComparator);
	}

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
	public static com.vportal.portlet.vlegal.model.VLegalDocument findByDocsByC_T_O_Last(
		long companyId, java.lang.String typeDocId, java.lang.String orgId,
		java.lang.String fieldId, java.lang.String language, int statusDoc,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vlegal.NoSuchVLegalDocumentException {
		return getPersistence()
				   .findByDocsByC_T_O_Last(companyId, typeDocId, orgId,
			fieldId, language, statusDoc, orderByComparator);
	}

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
	public static com.vportal.portlet.vlegal.model.VLegalDocument[] findByDocsByC_T_O_PrevAndNext(
		java.lang.String docId, long companyId, java.lang.String typeDocId,
		java.lang.String orgId, java.lang.String fieldId,
		java.lang.String language, int statusDoc,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vlegal.NoSuchVLegalDocumentException {
		return getPersistence()
				   .findByDocsByC_T_O_PrevAndNext(docId, companyId, typeDocId,
			orgId, fieldId, language, statusDoc, orderByComparator);
	}

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
	public static java.util.List<com.vportal.portlet.vlegal.model.VLegalDocument> findByDocsByG_O_T_L_S(
		long groupId, java.lang.String orgId, java.lang.String typeDocId,
		java.lang.String language, int statusDoc)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByDocsByG_O_T_L_S(groupId, orgId, typeDocId, language,
			statusDoc);
	}

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
	public static java.util.List<com.vportal.portlet.vlegal.model.VLegalDocument> findByDocsByG_O_T_L_S(
		long groupId, java.lang.String orgId, java.lang.String typeDocId,
		java.lang.String language, int statusDoc, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByDocsByG_O_T_L_S(groupId, orgId, typeDocId, language,
			statusDoc, start, end);
	}

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
	public static java.util.List<com.vportal.portlet.vlegal.model.VLegalDocument> findByDocsByG_O_T_L_S(
		long groupId, java.lang.String orgId, java.lang.String typeDocId,
		java.lang.String language, int statusDoc, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByDocsByG_O_T_L_S(groupId, orgId, typeDocId, language,
			statusDoc, start, end, orderByComparator);
	}

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
	public static com.vportal.portlet.vlegal.model.VLegalDocument findByDocsByG_O_T_L_S_First(
		long groupId, java.lang.String orgId, java.lang.String typeDocId,
		java.lang.String language, int statusDoc,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vlegal.NoSuchVLegalDocumentException {
		return getPersistence()
				   .findByDocsByG_O_T_L_S_First(groupId, orgId, typeDocId,
			language, statusDoc, orderByComparator);
	}

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
	public static com.vportal.portlet.vlegal.model.VLegalDocument findByDocsByG_O_T_L_S_Last(
		long groupId, java.lang.String orgId, java.lang.String typeDocId,
		java.lang.String language, int statusDoc,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vlegal.NoSuchVLegalDocumentException {
		return getPersistence()
				   .findByDocsByG_O_T_L_S_Last(groupId, orgId, typeDocId,
			language, statusDoc, orderByComparator);
	}

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
	public static com.vportal.portlet.vlegal.model.VLegalDocument[] findByDocsByG_O_T_L_S_PrevAndNext(
		java.lang.String docId, long groupId, java.lang.String orgId,
		java.lang.String typeDocId, java.lang.String language, int statusDoc,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vlegal.NoSuchVLegalDocumentException {
		return getPersistence()
				   .findByDocsByG_O_T_L_S_PrevAndNext(docId, groupId, orgId,
			typeDocId, language, statusDoc, orderByComparator);
	}

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
	public static java.util.List<com.vportal.portlet.vlegal.model.VLegalDocument> findByDocsByL_O_F_S(
		java.lang.String language, java.lang.String orgId,
		java.lang.String fieldId, int statusDoc)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByDocsByL_O_F_S(language, orgId, fieldId, statusDoc);
	}

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
	public static java.util.List<com.vportal.portlet.vlegal.model.VLegalDocument> findByDocsByL_O_F_S(
		java.lang.String language, java.lang.String orgId,
		java.lang.String fieldId, int statusDoc, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByDocsByL_O_F_S(language, orgId, fieldId, statusDoc,
			start, end);
	}

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
	public static java.util.List<com.vportal.portlet.vlegal.model.VLegalDocument> findByDocsByL_O_F_S(
		java.lang.String language, java.lang.String orgId,
		java.lang.String fieldId, int statusDoc, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByDocsByL_O_F_S(language, orgId, fieldId, statusDoc,
			start, end, orderByComparator);
	}

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
	public static com.vportal.portlet.vlegal.model.VLegalDocument findByDocsByL_O_F_S_First(
		java.lang.String language, java.lang.String orgId,
		java.lang.String fieldId, int statusDoc,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vlegal.NoSuchVLegalDocumentException {
		return getPersistence()
				   .findByDocsByL_O_F_S_First(language, orgId, fieldId,
			statusDoc, orderByComparator);
	}

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
	public static com.vportal.portlet.vlegal.model.VLegalDocument findByDocsByL_O_F_S_Last(
		java.lang.String language, java.lang.String orgId,
		java.lang.String fieldId, int statusDoc,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vlegal.NoSuchVLegalDocumentException {
		return getPersistence()
				   .findByDocsByL_O_F_S_Last(language, orgId, fieldId,
			statusDoc, orderByComparator);
	}

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
	public static com.vportal.portlet.vlegal.model.VLegalDocument[] findByDocsByL_O_F_S_PrevAndNext(
		java.lang.String docId, java.lang.String language,
		java.lang.String orgId, java.lang.String fieldId, int statusDoc,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vlegal.NoSuchVLegalDocumentException {
		return getPersistence()
				   .findByDocsByL_O_F_S_PrevAndNext(docId, language, orgId,
			fieldId, statusDoc, orderByComparator);
	}

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
	public static java.util.List<com.vportal.portlet.vlegal.model.VLegalDocument> findByDocsByL_T_F_S(
		java.lang.String language, java.lang.String typeDocId,
		java.lang.String fieldId, int statusDoc)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByDocsByL_T_F_S(language, typeDocId, fieldId, statusDoc);
	}

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
	public static java.util.List<com.vportal.portlet.vlegal.model.VLegalDocument> findByDocsByL_T_F_S(
		java.lang.String language, java.lang.String typeDocId,
		java.lang.String fieldId, int statusDoc, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByDocsByL_T_F_S(language, typeDocId, fieldId,
			statusDoc, start, end);
	}

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
	public static java.util.List<com.vportal.portlet.vlegal.model.VLegalDocument> findByDocsByL_T_F_S(
		java.lang.String language, java.lang.String typeDocId,
		java.lang.String fieldId, int statusDoc, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByDocsByL_T_F_S(language, typeDocId, fieldId,
			statusDoc, start, end, orderByComparator);
	}

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
	public static com.vportal.portlet.vlegal.model.VLegalDocument findByDocsByL_T_F_S_First(
		java.lang.String language, java.lang.String typeDocId,
		java.lang.String fieldId, int statusDoc,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vlegal.NoSuchVLegalDocumentException {
		return getPersistence()
				   .findByDocsByL_T_F_S_First(language, typeDocId, fieldId,
			statusDoc, orderByComparator);
	}

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
	public static com.vportal.portlet.vlegal.model.VLegalDocument findByDocsByL_T_F_S_Last(
		java.lang.String language, java.lang.String typeDocId,
		java.lang.String fieldId, int statusDoc,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vlegal.NoSuchVLegalDocumentException {
		return getPersistence()
				   .findByDocsByL_T_F_S_Last(language, typeDocId, fieldId,
			statusDoc, orderByComparator);
	}

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
	public static com.vportal.portlet.vlegal.model.VLegalDocument[] findByDocsByL_T_F_S_PrevAndNext(
		java.lang.String docId, java.lang.String language,
		java.lang.String typeDocId, java.lang.String fieldId, int statusDoc,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vlegal.NoSuchVLegalDocumentException {
		return getPersistence()
				   .findByDocsByL_T_F_S_PrevAndNext(docId, language, typeDocId,
			fieldId, statusDoc, orderByComparator);
	}

	/**
	* Finds all the v legal documents where typeDocId = &#63; and language = &#63;.
	*
	* @param typeDocId the type doc id to search with
	* @param language the language to search with
	* @return the matching v legal documents
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.vportal.portlet.vlegal.model.VLegalDocument> findByDocsByT_L(
		java.lang.String typeDocId, java.lang.String language)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByDocsByT_L(typeDocId, language);
	}

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
	public static java.util.List<com.vportal.portlet.vlegal.model.VLegalDocument> findByDocsByT_L(
		java.lang.String typeDocId, java.lang.String language, int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByDocsByT_L(typeDocId, language, start, end);
	}

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
	public static java.util.List<com.vportal.portlet.vlegal.model.VLegalDocument> findByDocsByT_L(
		java.lang.String typeDocId, java.lang.String language, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByDocsByT_L(typeDocId, language, start, end,
			orderByComparator);
	}

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
	public static com.vportal.portlet.vlegal.model.VLegalDocument findByDocsByT_L_First(
		java.lang.String typeDocId, java.lang.String language,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vlegal.NoSuchVLegalDocumentException {
		return getPersistence()
				   .findByDocsByT_L_First(typeDocId, language, orderByComparator);
	}

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
	public static com.vportal.portlet.vlegal.model.VLegalDocument findByDocsByT_L_Last(
		java.lang.String typeDocId, java.lang.String language,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vlegal.NoSuchVLegalDocumentException {
		return getPersistence()
				   .findByDocsByT_L_Last(typeDocId, language, orderByComparator);
	}

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
	public static com.vportal.portlet.vlegal.model.VLegalDocument[] findByDocsByT_L_PrevAndNext(
		java.lang.String docId, java.lang.String typeDocId,
		java.lang.String language,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vlegal.NoSuchVLegalDocumentException {
		return getPersistence()
				   .findByDocsByT_L_PrevAndNext(docId, typeDocId, language,
			orderByComparator);
	}

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
	public static java.util.List<com.vportal.portlet.vlegal.model.VLegalDocument> findByG_L_U_S(
		long groupId, java.lang.String language, long userId, int statusDoc)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByG_L_U_S(groupId, language, userId, statusDoc);
	}

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
	public static java.util.List<com.vportal.portlet.vlegal.model.VLegalDocument> findByG_L_U_S(
		long groupId, java.lang.String language, long userId, int statusDoc,
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByG_L_U_S(groupId, language, userId, statusDoc, start,
			end);
	}

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
	public static java.util.List<com.vportal.portlet.vlegal.model.VLegalDocument> findByG_L_U_S(
		long groupId, java.lang.String language, long userId, int statusDoc,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByG_L_U_S(groupId, language, userId, statusDoc, start,
			end, orderByComparator);
	}

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
	public static com.vportal.portlet.vlegal.model.VLegalDocument findByG_L_U_S_First(
		long groupId, java.lang.String language, long userId, int statusDoc,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vlegal.NoSuchVLegalDocumentException {
		return getPersistence()
				   .findByG_L_U_S_First(groupId, language, userId, statusDoc,
			orderByComparator);
	}

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
	public static com.vportal.portlet.vlegal.model.VLegalDocument findByG_L_U_S_Last(
		long groupId, java.lang.String language, long userId, int statusDoc,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vlegal.NoSuchVLegalDocumentException {
		return getPersistence()
				   .findByG_L_U_S_Last(groupId, language, userId, statusDoc,
			orderByComparator);
	}

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
	public static com.vportal.portlet.vlegal.model.VLegalDocument[] findByG_L_U_S_PrevAndNext(
		java.lang.String docId, long groupId, java.lang.String language,
		long userId, int statusDoc,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vlegal.NoSuchVLegalDocumentException {
		return getPersistence()
				   .findByG_L_U_S_PrevAndNext(docId, groupId, language, userId,
			statusDoc, orderByComparator);
	}

	/**
	* Finds the v legal document where groupId = &#63; and docId = &#63; or throws a {@link com.vportal.portlet.vlegal.NoSuchVLegalDocumentException} if it could not be found.
	*
	* @param groupId the group id to search with
	* @param docId the doc id to search with
	* @return the matching v legal document
	* @throws com.vportal.portlet.vlegal.NoSuchVLegalDocumentException if a matching v legal document could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.vportal.portlet.vlegal.model.VLegalDocument findByG_D(
		long groupId, java.lang.String docId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vlegal.NoSuchVLegalDocumentException {
		return getPersistence().findByG_D(groupId, docId);
	}

	/**
	* Finds the v legal document where groupId = &#63; and docId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param groupId the group id to search with
	* @param docId the doc id to search with
	* @return the matching v legal document, or <code>null</code> if a matching v legal document could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.vportal.portlet.vlegal.model.VLegalDocument fetchByG_D(
		long groupId, java.lang.String docId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByG_D(groupId, docId);
	}

	/**
	* Finds the v legal document where groupId = &#63; and docId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param groupId the group id to search with
	* @param docId the doc id to search with
	* @return the matching v legal document, or <code>null</code> if a matching v legal document could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.vportal.portlet.vlegal.model.VLegalDocument fetchByG_D(
		long groupId, java.lang.String docId, boolean retrieveFromCache)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByG_D(groupId, docId, retrieveFromCache);
	}

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
	public static com.vportal.portlet.vlegal.model.VLegalDocument findByP_N_S(
		long groupId, java.lang.String num, java.lang.String symbol)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vlegal.NoSuchVLegalDocumentException {
		return getPersistence().findByP_N_S(groupId, num, symbol);
	}

	/**
	* Finds the v legal document where groupId = &#63; and num = &#63; and symbol = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param groupId the group id to search with
	* @param num the num to search with
	* @param symbol the symbol to search with
	* @return the matching v legal document, or <code>null</code> if a matching v legal document could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.vportal.portlet.vlegal.model.VLegalDocument fetchByP_N_S(
		long groupId, java.lang.String num, java.lang.String symbol)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByP_N_S(groupId, num, symbol);
	}

	/**
	* Finds the v legal document where groupId = &#63; and num = &#63; and symbol = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param groupId the group id to search with
	* @param num the num to search with
	* @param symbol the symbol to search with
	* @return the matching v legal document, or <code>null</code> if a matching v legal document could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.vportal.portlet.vlegal.model.VLegalDocument fetchByP_N_S(
		long groupId, java.lang.String num, java.lang.String symbol,
		boolean retrieveFromCache)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByP_N_S(groupId, num, symbol, retrieveFromCache);
	}

	/**
	* Finds all the v legal documents where groupId = &#63; and language = &#63; and statusDoc = &#63;.
	*
	* @param groupId the group id to search with
	* @param language the language to search with
	* @param statusDoc the status doc to search with
	* @return the matching v legal documents
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.vportal.portlet.vlegal.model.VLegalDocument> findByP_L_S(
		long groupId, java.lang.String language, int statusDoc)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByP_L_S(groupId, language, statusDoc);
	}

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
	public static java.util.List<com.vportal.portlet.vlegal.model.VLegalDocument> findByP_L_S(
		long groupId, java.lang.String language, int statusDoc, int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByP_L_S(groupId, language, statusDoc, start, end);
	}

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
	public static java.util.List<com.vportal.portlet.vlegal.model.VLegalDocument> findByP_L_S(
		long groupId, java.lang.String language, int statusDoc, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByP_L_S(groupId, language, statusDoc, start, end,
			orderByComparator);
	}

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
	public static com.vportal.portlet.vlegal.model.VLegalDocument findByP_L_S_First(
		long groupId, java.lang.String language, int statusDoc,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vlegal.NoSuchVLegalDocumentException {
		return getPersistence()
				   .findByP_L_S_First(groupId, language, statusDoc,
			orderByComparator);
	}

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
	public static com.vportal.portlet.vlegal.model.VLegalDocument findByP_L_S_Last(
		long groupId, java.lang.String language, int statusDoc,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vlegal.NoSuchVLegalDocumentException {
		return getPersistence()
				   .findByP_L_S_Last(groupId, language, statusDoc,
			orderByComparator);
	}

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
	public static com.vportal.portlet.vlegal.model.VLegalDocument[] findByP_L_S_PrevAndNext(
		java.lang.String docId, long groupId, java.lang.String language,
		int statusDoc,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vlegal.NoSuchVLegalDocumentException {
		return getPersistence()
				   .findByP_L_S_PrevAndNext(docId, groupId, language,
			statusDoc, orderByComparator);
	}

	/**
	* Finds all the v legal documents where statusDoc = &#63;.
	*
	* @param statusDoc the status doc to search with
	* @return the matching v legal documents
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.vportal.portlet.vlegal.model.VLegalDocument> findBystatusDoc(
		int statusDoc)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findBystatusDoc(statusDoc);
	}

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
	public static java.util.List<com.vportal.portlet.vlegal.model.VLegalDocument> findBystatusDoc(
		int statusDoc, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findBystatusDoc(statusDoc, start, end);
	}

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
	public static java.util.List<com.vportal.portlet.vlegal.model.VLegalDocument> findBystatusDoc(
		int statusDoc, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findBystatusDoc(statusDoc, start, end, orderByComparator);
	}

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
	public static com.vportal.portlet.vlegal.model.VLegalDocument findBystatusDoc_First(
		int statusDoc,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vlegal.NoSuchVLegalDocumentException {
		return getPersistence()
				   .findBystatusDoc_First(statusDoc, orderByComparator);
	}

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
	public static com.vportal.portlet.vlegal.model.VLegalDocument findBystatusDoc_Last(
		int statusDoc,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vlegal.NoSuchVLegalDocumentException {
		return getPersistence()
				   .findBystatusDoc_Last(statusDoc, orderByComparator);
	}

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
	public static com.vportal.portlet.vlegal.model.VLegalDocument[] findBystatusDoc_PrevAndNext(
		java.lang.String docId, int statusDoc,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vlegal.NoSuchVLegalDocumentException {
		return getPersistence()
				   .findBystatusDoc_PrevAndNext(docId, statusDoc,
			orderByComparator);
	}

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
	public static java.util.List<com.vportal.portlet.vlegal.model.VLegalDocument> findByG_L_O_S(
		long groupId, java.lang.String language, java.lang.String orgId,
		int statusDoc)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByG_L_O_S(groupId, language, orgId, statusDoc);
	}

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
	public static java.util.List<com.vportal.portlet.vlegal.model.VLegalDocument> findByG_L_O_S(
		long groupId, java.lang.String language, java.lang.String orgId,
		int statusDoc, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByG_L_O_S(groupId, language, orgId, statusDoc, start,
			end);
	}

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
	public static java.util.List<com.vportal.portlet.vlegal.model.VLegalDocument> findByG_L_O_S(
		long groupId, java.lang.String language, java.lang.String orgId,
		int statusDoc, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByG_L_O_S(groupId, language, orgId, statusDoc, start,
			end, orderByComparator);
	}

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
	public static com.vportal.portlet.vlegal.model.VLegalDocument findByG_L_O_S_First(
		long groupId, java.lang.String language, java.lang.String orgId,
		int statusDoc,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vlegal.NoSuchVLegalDocumentException {
		return getPersistence()
				   .findByG_L_O_S_First(groupId, language, orgId, statusDoc,
			orderByComparator);
	}

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
	public static com.vportal.portlet.vlegal.model.VLegalDocument findByG_L_O_S_Last(
		long groupId, java.lang.String language, java.lang.String orgId,
		int statusDoc,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vlegal.NoSuchVLegalDocumentException {
		return getPersistence()
				   .findByG_L_O_S_Last(groupId, language, orgId, statusDoc,
			orderByComparator);
	}

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
	public static com.vportal.portlet.vlegal.model.VLegalDocument[] findByG_L_O_S_PrevAndNext(
		java.lang.String docId, long groupId, java.lang.String language,
		java.lang.String orgId, int statusDoc,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vlegal.NoSuchVLegalDocumentException {
		return getPersistence()
				   .findByG_L_O_S_PrevAndNext(docId, groupId, language, orgId,
			statusDoc, orderByComparator);
	}

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
	public static java.util.List<com.vportal.portlet.vlegal.model.VLegalDocument> findByG_L_T_S(
		long groupId, java.lang.String language, java.lang.String typeDocId,
		int statusDoc)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByG_L_T_S(groupId, language, typeDocId, statusDoc);
	}

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
	public static java.util.List<com.vportal.portlet.vlegal.model.VLegalDocument> findByG_L_T_S(
		long groupId, java.lang.String language, java.lang.String typeDocId,
		int statusDoc, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByG_L_T_S(groupId, language, typeDocId, statusDoc,
			start, end);
	}

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
	public static java.util.List<com.vportal.portlet.vlegal.model.VLegalDocument> findByG_L_T_S(
		long groupId, java.lang.String language, java.lang.String typeDocId,
		int statusDoc, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByG_L_T_S(groupId, language, typeDocId, statusDoc,
			start, end, orderByComparator);
	}

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
	public static com.vportal.portlet.vlegal.model.VLegalDocument findByG_L_T_S_First(
		long groupId, java.lang.String language, java.lang.String typeDocId,
		int statusDoc,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vlegal.NoSuchVLegalDocumentException {
		return getPersistence()
				   .findByG_L_T_S_First(groupId, language, typeDocId,
			statusDoc, orderByComparator);
	}

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
	public static com.vportal.portlet.vlegal.model.VLegalDocument findByG_L_T_S_Last(
		long groupId, java.lang.String language, java.lang.String typeDocId,
		int statusDoc,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vlegal.NoSuchVLegalDocumentException {
		return getPersistence()
				   .findByG_L_T_S_Last(groupId, language, typeDocId, statusDoc,
			orderByComparator);
	}

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
	public static com.vportal.portlet.vlegal.model.VLegalDocument[] findByG_L_T_S_PrevAndNext(
		java.lang.String docId, long groupId, java.lang.String language,
		java.lang.String typeDocId, int statusDoc,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vlegal.NoSuchVLegalDocumentException {
		return getPersistence()
				   .findByG_L_T_S_PrevAndNext(docId, groupId, language,
			typeDocId, statusDoc, orderByComparator);
	}

	/**
	* Finds all the v legal documents where language = &#63; and fieldId = &#63; and statusDoc = &#63;.
	*
	* @param language the language to search with
	* @param fieldId the field id to search with
	* @param statusDoc the status doc to search with
	* @return the matching v legal documents
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.vportal.portlet.vlegal.model.VLegalDocument> findByL_F_S(
		java.lang.String language, java.lang.String fieldId, int statusDoc)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByL_F_S(language, fieldId, statusDoc);
	}

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
	public static java.util.List<com.vportal.portlet.vlegal.model.VLegalDocument> findByL_F_S(
		java.lang.String language, java.lang.String fieldId, int statusDoc,
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByL_F_S(language, fieldId, statusDoc, start, end);
	}

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
	public static java.util.List<com.vportal.portlet.vlegal.model.VLegalDocument> findByL_F_S(
		java.lang.String language, java.lang.String fieldId, int statusDoc,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByL_F_S(language, fieldId, statusDoc, start, end,
			orderByComparator);
	}

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
	public static com.vportal.portlet.vlegal.model.VLegalDocument findByL_F_S_First(
		java.lang.String language, java.lang.String fieldId, int statusDoc,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vlegal.NoSuchVLegalDocumentException {
		return getPersistence()
				   .findByL_F_S_First(language, fieldId, statusDoc,
			orderByComparator);
	}

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
	public static com.vportal.portlet.vlegal.model.VLegalDocument findByL_F_S_Last(
		java.lang.String language, java.lang.String fieldId, int statusDoc,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vlegal.NoSuchVLegalDocumentException {
		return getPersistence()
				   .findByL_F_S_Last(language, fieldId, statusDoc,
			orderByComparator);
	}

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
	public static com.vportal.portlet.vlegal.model.VLegalDocument[] findByL_F_S_PrevAndNext(
		java.lang.String docId, java.lang.String language,
		java.lang.String fieldId, int statusDoc,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vlegal.NoSuchVLegalDocumentException {
		return getPersistence()
				   .findByL_F_S_PrevAndNext(docId, language, fieldId,
			statusDoc, orderByComparator);
	}

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
	public static java.util.List<com.vportal.portlet.vlegal.model.VLegalDocument> findByG_L_F_S(
		long groupId, java.lang.String language, java.lang.String fieldId,
		int statusDoc)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByG_L_F_S(groupId, language, fieldId, statusDoc);
	}

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
	public static java.util.List<com.vportal.portlet.vlegal.model.VLegalDocument> findByG_L_F_S(
		long groupId, java.lang.String language, java.lang.String fieldId,
		int statusDoc, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByG_L_F_S(groupId, language, fieldId, statusDoc, start,
			end);
	}

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
	public static java.util.List<com.vportal.portlet.vlegal.model.VLegalDocument> findByG_L_F_S(
		long groupId, java.lang.String language, java.lang.String fieldId,
		int statusDoc, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByG_L_F_S(groupId, language, fieldId, statusDoc, start,
			end, orderByComparator);
	}

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
	public static com.vportal.portlet.vlegal.model.VLegalDocument findByG_L_F_S_First(
		long groupId, java.lang.String language, java.lang.String fieldId,
		int statusDoc,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vlegal.NoSuchVLegalDocumentException {
		return getPersistence()
				   .findByG_L_F_S_First(groupId, language, fieldId, statusDoc,
			orderByComparator);
	}

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
	public static com.vportal.portlet.vlegal.model.VLegalDocument findByG_L_F_S_Last(
		long groupId, java.lang.String language, java.lang.String fieldId,
		int statusDoc,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vlegal.NoSuchVLegalDocumentException {
		return getPersistence()
				   .findByG_L_F_S_Last(groupId, language, fieldId, statusDoc,
			orderByComparator);
	}

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
	public static com.vportal.portlet.vlegal.model.VLegalDocument[] findByG_L_F_S_PrevAndNext(
		java.lang.String docId, long groupId, java.lang.String language,
		java.lang.String fieldId, int statusDoc,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vlegal.NoSuchVLegalDocumentException {
		return getPersistence()
				   .findByG_L_F_S_PrevAndNext(docId, groupId, language,
			fieldId, statusDoc, orderByComparator);
	}

	/**
	* Finds all the v legal documents where groupId = &#63; and language = &#63; and orgId = &#63;.
	*
	* @param groupId the group id to search with
	* @param language the language to search with
	* @param orgId the org id to search with
	* @return the matching v legal documents
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.vportal.portlet.vlegal.model.VLegalDocument> findByG_L_O(
		long groupId, java.lang.String language, java.lang.String orgId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByG_L_O(groupId, language, orgId);
	}

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
	public static java.util.List<com.vportal.portlet.vlegal.model.VLegalDocument> findByG_L_O(
		long groupId, java.lang.String language, java.lang.String orgId,
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByG_L_O(groupId, language, orgId, start, end);
	}

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
	public static java.util.List<com.vportal.portlet.vlegal.model.VLegalDocument> findByG_L_O(
		long groupId, java.lang.String language, java.lang.String orgId,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByG_L_O(groupId, language, orgId, start, end,
			orderByComparator);
	}

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
	public static com.vportal.portlet.vlegal.model.VLegalDocument findByG_L_O_First(
		long groupId, java.lang.String language, java.lang.String orgId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vlegal.NoSuchVLegalDocumentException {
		return getPersistence()
				   .findByG_L_O_First(groupId, language, orgId,
			orderByComparator);
	}

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
	public static com.vportal.portlet.vlegal.model.VLegalDocument findByG_L_O_Last(
		long groupId, java.lang.String language, java.lang.String orgId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vlegal.NoSuchVLegalDocumentException {
		return getPersistence()
				   .findByG_L_O_Last(groupId, language, orgId, orderByComparator);
	}

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
	public static com.vportal.portlet.vlegal.model.VLegalDocument[] findByG_L_O_PrevAndNext(
		java.lang.String docId, long groupId, java.lang.String language,
		java.lang.String orgId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vlegal.NoSuchVLegalDocumentException {
		return getPersistence()
				   .findByG_L_O_PrevAndNext(docId, groupId, language, orgId,
			orderByComparator);
	}

	/**
	* Finds all the v legal documents where language = &#63; and orgId = &#63; and statusDoc = &#63;.
	*
	* @param language the language to search with
	* @param orgId the org id to search with
	* @param statusDoc the status doc to search with
	* @return the matching v legal documents
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.vportal.portlet.vlegal.model.VLegalDocument> findByL_O(
		java.lang.String language, java.lang.String orgId, int statusDoc)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByL_O(language, orgId, statusDoc);
	}

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
	public static java.util.List<com.vportal.portlet.vlegal.model.VLegalDocument> findByL_O(
		java.lang.String language, java.lang.String orgId, int statusDoc,
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByL_O(language, orgId, statusDoc, start, end);
	}

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
	public static java.util.List<com.vportal.portlet.vlegal.model.VLegalDocument> findByL_O(
		java.lang.String language, java.lang.String orgId, int statusDoc,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByL_O(language, orgId, statusDoc, start, end,
			orderByComparator);
	}

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
	public static com.vportal.portlet.vlegal.model.VLegalDocument findByL_O_First(
		java.lang.String language, java.lang.String orgId, int statusDoc,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vlegal.NoSuchVLegalDocumentException {
		return getPersistence()
				   .findByL_O_First(language, orgId, statusDoc,
			orderByComparator);
	}

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
	public static com.vportal.portlet.vlegal.model.VLegalDocument findByL_O_Last(
		java.lang.String language, java.lang.String orgId, int statusDoc,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vlegal.NoSuchVLegalDocumentException {
		return getPersistence()
				   .findByL_O_Last(language, orgId, statusDoc, orderByComparator);
	}

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
	public static com.vportal.portlet.vlegal.model.VLegalDocument[] findByL_O_PrevAndNext(
		java.lang.String docId, java.lang.String language,
		java.lang.String orgId, int statusDoc,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vlegal.NoSuchVLegalDocumentException {
		return getPersistence()
				   .findByL_O_PrevAndNext(docId, language, orgId, statusDoc,
			orderByComparator);
	}

	/**
	* Finds all the v legal documents where groupId = &#63; and language = &#63; and typeDocId = &#63;.
	*
	* @param groupId the group id to search with
	* @param language the language to search with
	* @param typeDocId the type doc id to search with
	* @return the matching v legal documents
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.vportal.portlet.vlegal.model.VLegalDocument> findByG_L_T(
		long groupId, java.lang.String language, java.lang.String typeDocId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByG_L_T(groupId, language, typeDocId);
	}

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
	public static java.util.List<com.vportal.portlet.vlegal.model.VLegalDocument> findByG_L_T(
		long groupId, java.lang.String language, java.lang.String typeDocId,
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByG_L_T(groupId, language, typeDocId, start, end);
	}

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
	public static java.util.List<com.vportal.portlet.vlegal.model.VLegalDocument> findByG_L_T(
		long groupId, java.lang.String language, java.lang.String typeDocId,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByG_L_T(groupId, language, typeDocId, start, end,
			orderByComparator);
	}

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
	public static com.vportal.portlet.vlegal.model.VLegalDocument findByG_L_T_First(
		long groupId, java.lang.String language, java.lang.String typeDocId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vlegal.NoSuchVLegalDocumentException {
		return getPersistence()
				   .findByG_L_T_First(groupId, language, typeDocId,
			orderByComparator);
	}

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
	public static com.vportal.portlet.vlegal.model.VLegalDocument findByG_L_T_Last(
		long groupId, java.lang.String language, java.lang.String typeDocId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vlegal.NoSuchVLegalDocumentException {
		return getPersistence()
				   .findByG_L_T_Last(groupId, language, typeDocId,
			orderByComparator);
	}

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
	public static com.vportal.portlet.vlegal.model.VLegalDocument[] findByG_L_T_PrevAndNext(
		java.lang.String docId, long groupId, java.lang.String language,
		java.lang.String typeDocId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vlegal.NoSuchVLegalDocumentException {
		return getPersistence()
				   .findByG_L_T_PrevAndNext(docId, groupId, language,
			typeDocId, orderByComparator);
	}

	/**
	* Finds all the v legal documents where groupId = &#63; and language = &#63; and fieldId = &#63;.
	*
	* @param groupId the group id to search with
	* @param language the language to search with
	* @param fieldId the field id to search with
	* @return the matching v legal documents
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.vportal.portlet.vlegal.model.VLegalDocument> findByG_L_F(
		long groupId, java.lang.String language, java.lang.String fieldId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByG_L_F(groupId, language, fieldId);
	}

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
	public static java.util.List<com.vportal.portlet.vlegal.model.VLegalDocument> findByG_L_F(
		long groupId, java.lang.String language, java.lang.String fieldId,
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByG_L_F(groupId, language, fieldId, start, end);
	}

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
	public static java.util.List<com.vportal.portlet.vlegal.model.VLegalDocument> findByG_L_F(
		long groupId, java.lang.String language, java.lang.String fieldId,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByG_L_F(groupId, language, fieldId, start, end,
			orderByComparator);
	}

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
	public static com.vportal.portlet.vlegal.model.VLegalDocument findByG_L_F_First(
		long groupId, java.lang.String language, java.lang.String fieldId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vlegal.NoSuchVLegalDocumentException {
		return getPersistence()
				   .findByG_L_F_First(groupId, language, fieldId,
			orderByComparator);
	}

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
	public static com.vportal.portlet.vlegal.model.VLegalDocument findByG_L_F_Last(
		long groupId, java.lang.String language, java.lang.String fieldId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vlegal.NoSuchVLegalDocumentException {
		return getPersistence()
				   .findByG_L_F_Last(groupId, language, fieldId,
			orderByComparator);
	}

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
	public static com.vportal.portlet.vlegal.model.VLegalDocument[] findByG_L_F_PrevAndNext(
		java.lang.String docId, long groupId, java.lang.String language,
		java.lang.String fieldId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vlegal.NoSuchVLegalDocumentException {
		return getPersistence()
				   .findByG_L_F_PrevAndNext(docId, groupId, language, fieldId,
			orderByComparator);
	}

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
	public static java.util.List<com.vportal.portlet.vlegal.model.VLegalDocument> findByP_U_S(
		long groupId, long createdByUser, java.lang.String language,
		int statusDoc)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByP_U_S(groupId, createdByUser, language, statusDoc);
	}

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
	public static java.util.List<com.vportal.portlet.vlegal.model.VLegalDocument> findByP_U_S(
		long groupId, long createdByUser, java.lang.String language,
		int statusDoc, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByP_U_S(groupId, createdByUser, language, statusDoc,
			start, end);
	}

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
	public static java.util.List<com.vportal.portlet.vlegal.model.VLegalDocument> findByP_U_S(
		long groupId, long createdByUser, java.lang.String language,
		int statusDoc, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByP_U_S(groupId, createdByUser, language, statusDoc,
			start, end, orderByComparator);
	}

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
	public static com.vportal.portlet.vlegal.model.VLegalDocument findByP_U_S_First(
		long groupId, long createdByUser, java.lang.String language,
		int statusDoc,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vlegal.NoSuchVLegalDocumentException {
		return getPersistence()
				   .findByP_U_S_First(groupId, createdByUser, language,
			statusDoc, orderByComparator);
	}

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
	public static com.vportal.portlet.vlegal.model.VLegalDocument findByP_U_S_Last(
		long groupId, long createdByUser, java.lang.String language,
		int statusDoc,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vlegal.NoSuchVLegalDocumentException {
		return getPersistence()
				   .findByP_U_S_Last(groupId, createdByUser, language,
			statusDoc, orderByComparator);
	}

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
	public static com.vportal.portlet.vlegal.model.VLegalDocument[] findByP_U_S_PrevAndNext(
		java.lang.String docId, long groupId, long createdByUser,
		java.lang.String language, int statusDoc,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vlegal.NoSuchVLegalDocumentException {
		return getPersistence()
				   .findByP_U_S_PrevAndNext(docId, groupId, createdByUser,
			language, statusDoc, orderByComparator);
	}

	/**
	* Finds all the v legal documents where statusDoc = &#63;.
	*
	* @param statusDoc the status doc to search with
	* @return the matching v legal documents
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.vportal.portlet.vlegal.model.VLegalDocument> findByStatus(
		int statusDoc)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByStatus(statusDoc);
	}

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
	public static java.util.List<com.vportal.portlet.vlegal.model.VLegalDocument> findByStatus(
		int statusDoc, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByStatus(statusDoc, start, end);
	}

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
	public static java.util.List<com.vportal.portlet.vlegal.model.VLegalDocument> findByStatus(
		int statusDoc, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByStatus(statusDoc, start, end, orderByComparator);
	}

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
	public static com.vportal.portlet.vlegal.model.VLegalDocument findByStatus_First(
		int statusDoc,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vlegal.NoSuchVLegalDocumentException {
		return getPersistence().findByStatus_First(statusDoc, orderByComparator);
	}

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
	public static com.vportal.portlet.vlegal.model.VLegalDocument findByStatus_Last(
		int statusDoc,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vlegal.NoSuchVLegalDocumentException {
		return getPersistence().findByStatus_Last(statusDoc, orderByComparator);
	}

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
	public static com.vportal.portlet.vlegal.model.VLegalDocument[] findByStatus_PrevAndNext(
		java.lang.String docId, int statusDoc,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vlegal.NoSuchVLegalDocumentException {
		return getPersistence()
				   .findByStatus_PrevAndNext(docId, statusDoc, orderByComparator);
	}

	/**
	* Finds all the v legal documents where language = &#63; and statusDoc = &#63;.
	*
	* @param language the language to search with
	* @param statusDoc the status doc to search with
	* @return the matching v legal documents
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.vportal.portlet.vlegal.model.VLegalDocument> findByL_S(
		java.lang.String language, int statusDoc)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByL_S(language, statusDoc);
	}

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
	public static java.util.List<com.vportal.portlet.vlegal.model.VLegalDocument> findByL_S(
		java.lang.String language, int statusDoc, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByL_S(language, statusDoc, start, end);
	}

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
	public static java.util.List<com.vportal.portlet.vlegal.model.VLegalDocument> findByL_S(
		java.lang.String language, int statusDoc, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByL_S(language, statusDoc, start, end, orderByComparator);
	}

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
	public static com.vportal.portlet.vlegal.model.VLegalDocument findByL_S_First(
		java.lang.String language, int statusDoc,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vlegal.NoSuchVLegalDocumentException {
		return getPersistence()
				   .findByL_S_First(language, statusDoc, orderByComparator);
	}

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
	public static com.vportal.portlet.vlegal.model.VLegalDocument findByL_S_Last(
		java.lang.String language, int statusDoc,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vlegal.NoSuchVLegalDocumentException {
		return getPersistence()
				   .findByL_S_Last(language, statusDoc, orderByComparator);
	}

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
	public static com.vportal.portlet.vlegal.model.VLegalDocument[] findByL_S_PrevAndNext(
		java.lang.String docId, java.lang.String language, int statusDoc,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vlegal.NoSuchVLegalDocumentException {
		return getPersistence()
				   .findByL_S_PrevAndNext(docId, language, statusDoc,
			orderByComparator);
	}

	/**
	* Finds all the v legal documents.
	*
	* @return the v legal documents
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.vportal.portlet.vlegal.model.VLegalDocument> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
	}

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
	public static java.util.List<com.vportal.portlet.vlegal.model.VLegalDocument> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

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
	public static java.util.List<com.vportal.portlet.vlegal.model.VLegalDocument> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the v legal documents where groupId = &#63; from the database.
	*
	* @param groupId the group id to search with
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByGroupId(long groupId)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByGroupId(groupId);
	}

	/**
	* Removes all the v legal documents where language = &#63; and promulDate = &#63; and statusDoc = &#63; from the database.
	*
	* @param language the language to search with
	* @param promulDate the promul date to search with
	* @param statusDoc the status doc to search with
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByPromulDate(java.lang.String language,
		java.util.Date promulDate, int statusDoc)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByPromulDate(language, promulDate, statusDoc);
	}

	/**
	* Removes all the v legal documents where groupId = &#63; and language = &#63; from the database.
	*
	* @param groupId the group id to search with
	* @param language the language to search with
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByG_L(long groupId, java.lang.String language)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByG_L(groupId, language);
	}

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
	public static void removeByDocsByF_O_T_L_S(long groupId,
		java.lang.String typeDocId, java.lang.String orgId,
		java.lang.String fieldId, java.lang.String language, int statusDoc)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence()
			.removeByDocsByF_O_T_L_S(groupId, typeDocId, orgId, fieldId,
			language, statusDoc);
	}

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
	public static void removeByDocsByF_T_O_L_S(java.lang.String typeDocId,
		java.lang.String orgId, java.lang.String fieldId,
		java.lang.String language, int statusDoc)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence()
			.removeByDocsByF_T_O_L_S(typeDocId, orgId, fieldId, language,
			statusDoc);
	}

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
	public static void removeByDocsByF_C_O_T_L_S(long companyId,
		java.lang.String typeDocId, java.lang.String orgId,
		java.lang.String fieldId, java.lang.String language, int statusDoc)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence()
			.removeByDocsByF_C_O_T_L_S(companyId, typeDocId, orgId, fieldId,
			language, statusDoc);
	}

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
	public static void removeByDocsByC_T_O(long companyId,
		java.lang.String typeDocId, java.lang.String orgId,
		java.lang.String fieldId, java.lang.String language, int statusDoc)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence()
			.removeByDocsByC_T_O(companyId, typeDocId, orgId, fieldId,
			language, statusDoc);
	}

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
	public static void removeByDocsByG_O_T_L_S(long groupId,
		java.lang.String orgId, java.lang.String typeDocId,
		java.lang.String language, int statusDoc)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence()
			.removeByDocsByG_O_T_L_S(groupId, orgId, typeDocId, language,
			statusDoc);
	}

	/**
	* Removes all the v legal documents where language = &#63; and orgId = &#63; and fieldId = &#63; and statusDoc = &#63; from the database.
	*
	* @param language the language to search with
	* @param orgId the org id to search with
	* @param fieldId the field id to search with
	* @param statusDoc the status doc to search with
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByDocsByL_O_F_S(java.lang.String language,
		java.lang.String orgId, java.lang.String fieldId, int statusDoc)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence()
			.removeByDocsByL_O_F_S(language, orgId, fieldId, statusDoc);
	}

	/**
	* Removes all the v legal documents where language = &#63; and typeDocId = &#63; and fieldId = &#63; and statusDoc = &#63; from the database.
	*
	* @param language the language to search with
	* @param typeDocId the type doc id to search with
	* @param fieldId the field id to search with
	* @param statusDoc the status doc to search with
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByDocsByL_T_F_S(java.lang.String language,
		java.lang.String typeDocId, java.lang.String fieldId, int statusDoc)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence()
			.removeByDocsByL_T_F_S(language, typeDocId, fieldId, statusDoc);
	}

	/**
	* Removes all the v legal documents where typeDocId = &#63; and language = &#63; from the database.
	*
	* @param typeDocId the type doc id to search with
	* @param language the language to search with
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByDocsByT_L(java.lang.String typeDocId,
		java.lang.String language)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByDocsByT_L(typeDocId, language);
	}

	/**
	* Removes all the v legal documents where groupId = &#63; and language = &#63; and userId = &#63; and statusDoc = &#63; from the database.
	*
	* @param groupId the group id to search with
	* @param language the language to search with
	* @param userId the user id to search with
	* @param statusDoc the status doc to search with
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByG_L_U_S(long groupId, java.lang.String language,
		long userId, int statusDoc)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByG_L_U_S(groupId, language, userId, statusDoc);
	}

	/**
	* Removes the v legal document where groupId = &#63; and docId = &#63; from the database.
	*
	* @param groupId the group id to search with
	* @param docId the doc id to search with
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByG_D(long groupId, java.lang.String docId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vlegal.NoSuchVLegalDocumentException {
		getPersistence().removeByG_D(groupId, docId);
	}

	/**
	* Removes the v legal document where groupId = &#63; and num = &#63; and symbol = &#63; from the database.
	*
	* @param groupId the group id to search with
	* @param num the num to search with
	* @param symbol the symbol to search with
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByP_N_S(long groupId, java.lang.String num,
		java.lang.String symbol)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vlegal.NoSuchVLegalDocumentException {
		getPersistence().removeByP_N_S(groupId, num, symbol);
	}

	/**
	* Removes all the v legal documents where groupId = &#63; and language = &#63; and statusDoc = &#63; from the database.
	*
	* @param groupId the group id to search with
	* @param language the language to search with
	* @param statusDoc the status doc to search with
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByP_L_S(long groupId, java.lang.String language,
		int statusDoc)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByP_L_S(groupId, language, statusDoc);
	}

	/**
	* Removes all the v legal documents where statusDoc = &#63; from the database.
	*
	* @param statusDoc the status doc to search with
	* @throws SystemException if a system exception occurred
	*/
	public static void removeBystatusDoc(int statusDoc)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeBystatusDoc(statusDoc);
	}

	/**
	* Removes all the v legal documents where groupId = &#63; and language = &#63; and orgId = &#63; and statusDoc = &#63; from the database.
	*
	* @param groupId the group id to search with
	* @param language the language to search with
	* @param orgId the org id to search with
	* @param statusDoc the status doc to search with
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByG_L_O_S(long groupId, java.lang.String language,
		java.lang.String orgId, int statusDoc)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByG_L_O_S(groupId, language, orgId, statusDoc);
	}

	/**
	* Removes all the v legal documents where groupId = &#63; and language = &#63; and typeDocId = &#63; and statusDoc = &#63; from the database.
	*
	* @param groupId the group id to search with
	* @param language the language to search with
	* @param typeDocId the type doc id to search with
	* @param statusDoc the status doc to search with
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByG_L_T_S(long groupId, java.lang.String language,
		java.lang.String typeDocId, int statusDoc)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByG_L_T_S(groupId, language, typeDocId, statusDoc);
	}

	/**
	* Removes all the v legal documents where language = &#63; and fieldId = &#63; and statusDoc = &#63; from the database.
	*
	* @param language the language to search with
	* @param fieldId the field id to search with
	* @param statusDoc the status doc to search with
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByL_F_S(java.lang.String language,
		java.lang.String fieldId, int statusDoc)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByL_F_S(language, fieldId, statusDoc);
	}

	/**
	* Removes all the v legal documents where groupId = &#63; and language = &#63; and fieldId = &#63; and statusDoc = &#63; from the database.
	*
	* @param groupId the group id to search with
	* @param language the language to search with
	* @param fieldId the field id to search with
	* @param statusDoc the status doc to search with
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByG_L_F_S(long groupId, java.lang.String language,
		java.lang.String fieldId, int statusDoc)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByG_L_F_S(groupId, language, fieldId, statusDoc);
	}

	/**
	* Removes all the v legal documents where groupId = &#63; and language = &#63; and orgId = &#63; from the database.
	*
	* @param groupId the group id to search with
	* @param language the language to search with
	* @param orgId the org id to search with
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByG_L_O(long groupId, java.lang.String language,
		java.lang.String orgId)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByG_L_O(groupId, language, orgId);
	}

	/**
	* Removes all the v legal documents where language = &#63; and orgId = &#63; and statusDoc = &#63; from the database.
	*
	* @param language the language to search with
	* @param orgId the org id to search with
	* @param statusDoc the status doc to search with
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByL_O(java.lang.String language,
		java.lang.String orgId, int statusDoc)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByL_O(language, orgId, statusDoc);
	}

	/**
	* Removes all the v legal documents where groupId = &#63; and language = &#63; and typeDocId = &#63; from the database.
	*
	* @param groupId the group id to search with
	* @param language the language to search with
	* @param typeDocId the type doc id to search with
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByG_L_T(long groupId, java.lang.String language,
		java.lang.String typeDocId)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByG_L_T(groupId, language, typeDocId);
	}

	/**
	* Removes all the v legal documents where groupId = &#63; and language = &#63; and fieldId = &#63; from the database.
	*
	* @param groupId the group id to search with
	* @param language the language to search with
	* @param fieldId the field id to search with
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByG_L_F(long groupId, java.lang.String language,
		java.lang.String fieldId)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByG_L_F(groupId, language, fieldId);
	}

	/**
	* Removes all the v legal documents where groupId = &#63; and createdByUser = &#63; and language = &#63; and statusDoc = &#63; from the database.
	*
	* @param groupId the group id to search with
	* @param createdByUser the created by user to search with
	* @param language the language to search with
	* @param statusDoc the status doc to search with
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByP_U_S(long groupId, long createdByUser,
		java.lang.String language, int statusDoc)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence()
			.removeByP_U_S(groupId, createdByUser, language, statusDoc);
	}

	/**
	* Removes all the v legal documents where statusDoc = &#63; from the database.
	*
	* @param statusDoc the status doc to search with
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByStatus(int statusDoc)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByStatus(statusDoc);
	}

	/**
	* Removes all the v legal documents where language = &#63; and statusDoc = &#63; from the database.
	*
	* @param language the language to search with
	* @param statusDoc the status doc to search with
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByL_S(java.lang.String language, int statusDoc)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByL_S(language, statusDoc);
	}

	/**
	* Removes all the v legal documents from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Counts all the v legal documents where groupId = &#63;.
	*
	* @param groupId the group id to search with
	* @return the number of matching v legal documents
	* @throws SystemException if a system exception occurred
	*/
	public static int countByGroupId(long groupId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByGroupId(groupId);
	}

	/**
	* Counts all the v legal documents where language = &#63; and promulDate = &#63; and statusDoc = &#63;.
	*
	* @param language the language to search with
	* @param promulDate the promul date to search with
	* @param statusDoc the status doc to search with
	* @return the number of matching v legal documents
	* @throws SystemException if a system exception occurred
	*/
	public static int countByPromulDate(java.lang.String language,
		java.util.Date promulDate, int statusDoc)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .countByPromulDate(language, promulDate, statusDoc);
	}

	/**
	* Counts all the v legal documents where groupId = &#63; and language = &#63;.
	*
	* @param groupId the group id to search with
	* @param language the language to search with
	* @return the number of matching v legal documents
	* @throws SystemException if a system exception occurred
	*/
	public static int countByG_L(long groupId, java.lang.String language)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByG_L(groupId, language);
	}

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
	public static int countByDocsByF_O_T_L_S(long groupId,
		java.lang.String typeDocId, java.lang.String orgId,
		java.lang.String fieldId, java.lang.String language, int statusDoc)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .countByDocsByF_O_T_L_S(groupId, typeDocId, orgId, fieldId,
			language, statusDoc);
	}

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
	public static int countByDocsByF_T_O_L_S(java.lang.String typeDocId,
		java.lang.String orgId, java.lang.String fieldId,
		java.lang.String language, int statusDoc)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .countByDocsByF_T_O_L_S(typeDocId, orgId, fieldId, language,
			statusDoc);
	}

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
	public static int countByDocsByF_C_O_T_L_S(long companyId,
		java.lang.String typeDocId, java.lang.String orgId,
		java.lang.String fieldId, java.lang.String language, int statusDoc)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .countByDocsByF_C_O_T_L_S(companyId, typeDocId, orgId,
			fieldId, language, statusDoc);
	}

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
	public static int countByDocsByC_T_O(long companyId,
		java.lang.String typeDocId, java.lang.String orgId,
		java.lang.String fieldId, java.lang.String language, int statusDoc)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .countByDocsByC_T_O(companyId, typeDocId, orgId, fieldId,
			language, statusDoc);
	}

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
	public static int countByDocsByG_O_T_L_S(long groupId,
		java.lang.String orgId, java.lang.String typeDocId,
		java.lang.String language, int statusDoc)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .countByDocsByG_O_T_L_S(groupId, orgId, typeDocId, language,
			statusDoc);
	}

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
	public static int countByDocsByL_O_F_S(java.lang.String language,
		java.lang.String orgId, java.lang.String fieldId, int statusDoc)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .countByDocsByL_O_F_S(language, orgId, fieldId, statusDoc);
	}

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
	public static int countByDocsByL_T_F_S(java.lang.String language,
		java.lang.String typeDocId, java.lang.String fieldId, int statusDoc)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .countByDocsByL_T_F_S(language, typeDocId, fieldId, statusDoc);
	}

	/**
	* Counts all the v legal documents where typeDocId = &#63; and language = &#63;.
	*
	* @param typeDocId the type doc id to search with
	* @param language the language to search with
	* @return the number of matching v legal documents
	* @throws SystemException if a system exception occurred
	*/
	public static int countByDocsByT_L(java.lang.String typeDocId,
		java.lang.String language)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByDocsByT_L(typeDocId, language);
	}

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
	public static int countByG_L_U_S(long groupId, java.lang.String language,
		long userId, int statusDoc)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .countByG_L_U_S(groupId, language, userId, statusDoc);
	}

	/**
	* Counts all the v legal documents where groupId = &#63; and docId = &#63;.
	*
	* @param groupId the group id to search with
	* @param docId the doc id to search with
	* @return the number of matching v legal documents
	* @throws SystemException if a system exception occurred
	*/
	public static int countByG_D(long groupId, java.lang.String docId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByG_D(groupId, docId);
	}

	/**
	* Counts all the v legal documents where groupId = &#63; and num = &#63; and symbol = &#63;.
	*
	* @param groupId the group id to search with
	* @param num the num to search with
	* @param symbol the symbol to search with
	* @return the number of matching v legal documents
	* @throws SystemException if a system exception occurred
	*/
	public static int countByP_N_S(long groupId, java.lang.String num,
		java.lang.String symbol)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByP_N_S(groupId, num, symbol);
	}

	/**
	* Counts all the v legal documents where groupId = &#63; and language = &#63; and statusDoc = &#63;.
	*
	* @param groupId the group id to search with
	* @param language the language to search with
	* @param statusDoc the status doc to search with
	* @return the number of matching v legal documents
	* @throws SystemException if a system exception occurred
	*/
	public static int countByP_L_S(long groupId, java.lang.String language,
		int statusDoc)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByP_L_S(groupId, language, statusDoc);
	}

	/**
	* Counts all the v legal documents where statusDoc = &#63;.
	*
	* @param statusDoc the status doc to search with
	* @return the number of matching v legal documents
	* @throws SystemException if a system exception occurred
	*/
	public static int countBystatusDoc(int statusDoc)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countBystatusDoc(statusDoc);
	}

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
	public static int countByG_L_O_S(long groupId, java.lang.String language,
		java.lang.String orgId, int statusDoc)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .countByG_L_O_S(groupId, language, orgId, statusDoc);
	}

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
	public static int countByG_L_T_S(long groupId, java.lang.String language,
		java.lang.String typeDocId, int statusDoc)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .countByG_L_T_S(groupId, language, typeDocId, statusDoc);
	}

	/**
	* Counts all the v legal documents where language = &#63; and fieldId = &#63; and statusDoc = &#63;.
	*
	* @param language the language to search with
	* @param fieldId the field id to search with
	* @param statusDoc the status doc to search with
	* @return the number of matching v legal documents
	* @throws SystemException if a system exception occurred
	*/
	public static int countByL_F_S(java.lang.String language,
		java.lang.String fieldId, int statusDoc)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByL_F_S(language, fieldId, statusDoc);
	}

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
	public static int countByG_L_F_S(long groupId, java.lang.String language,
		java.lang.String fieldId, int statusDoc)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .countByG_L_F_S(groupId, language, fieldId, statusDoc);
	}

	/**
	* Counts all the v legal documents where groupId = &#63; and language = &#63; and orgId = &#63;.
	*
	* @param groupId the group id to search with
	* @param language the language to search with
	* @param orgId the org id to search with
	* @return the number of matching v legal documents
	* @throws SystemException if a system exception occurred
	*/
	public static int countByG_L_O(long groupId, java.lang.String language,
		java.lang.String orgId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByG_L_O(groupId, language, orgId);
	}

	/**
	* Counts all the v legal documents where language = &#63; and orgId = &#63; and statusDoc = &#63;.
	*
	* @param language the language to search with
	* @param orgId the org id to search with
	* @param statusDoc the status doc to search with
	* @return the number of matching v legal documents
	* @throws SystemException if a system exception occurred
	*/
	public static int countByL_O(java.lang.String language,
		java.lang.String orgId, int statusDoc)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByL_O(language, orgId, statusDoc);
	}

	/**
	* Counts all the v legal documents where groupId = &#63; and language = &#63; and typeDocId = &#63;.
	*
	* @param groupId the group id to search with
	* @param language the language to search with
	* @param typeDocId the type doc id to search with
	* @return the number of matching v legal documents
	* @throws SystemException if a system exception occurred
	*/
	public static int countByG_L_T(long groupId, java.lang.String language,
		java.lang.String typeDocId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByG_L_T(groupId, language, typeDocId);
	}

	/**
	* Counts all the v legal documents where groupId = &#63; and language = &#63; and fieldId = &#63;.
	*
	* @param groupId the group id to search with
	* @param language the language to search with
	* @param fieldId the field id to search with
	* @return the number of matching v legal documents
	* @throws SystemException if a system exception occurred
	*/
	public static int countByG_L_F(long groupId, java.lang.String language,
		java.lang.String fieldId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByG_L_F(groupId, language, fieldId);
	}

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
	public static int countByP_U_S(long groupId, long createdByUser,
		java.lang.String language, int statusDoc)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .countByP_U_S(groupId, createdByUser, language, statusDoc);
	}

	/**
	* Counts all the v legal documents where statusDoc = &#63;.
	*
	* @param statusDoc the status doc to search with
	* @return the number of matching v legal documents
	* @throws SystemException if a system exception occurred
	*/
	public static int countByStatus(int statusDoc)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByStatus(statusDoc);
	}

	/**
	* Counts all the v legal documents where language = &#63; and statusDoc = &#63;.
	*
	* @param language the language to search with
	* @param statusDoc the status doc to search with
	* @return the number of matching v legal documents
	* @throws SystemException if a system exception occurred
	*/
	public static int countByL_S(java.lang.String language, int statusDoc)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByL_S(language, statusDoc);
	}

	/**
	* Counts all the v legal documents.
	*
	* @return the number of v legal documents
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static VLegalDocumentPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (VLegalDocumentPersistence)PortletBeanLocatorUtil.locate(com.vportal.portlet.vlegal.service.ClpSerializer.SERVLET_CONTEXT_NAME,
					VLegalDocumentPersistence.class.getName());
		}

		return _persistence;
	}

	public void setPersistence(VLegalDocumentPersistence persistence) {
		_persistence = persistence;
	}

	private static VLegalDocumentPersistence _persistence;
}