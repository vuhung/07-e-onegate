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

import com.vportal.portlet.vlegal.model.VLegalSuggestDocument;

import java.util.List;

/**
 * The persistence utility for the v legal suggest document service. This utility wraps {@link VLegalSuggestDocumentPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
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
 * @see VLegalSuggestDocumentPersistence
 * @see VLegalSuggestDocumentPersistenceImpl
 * @generated
 */
public class VLegalSuggestDocumentUtil {
	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#clearCache()
	 */
	public static void clearCache() {
		getPersistence().clearCache();
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#clearCache(com.liferay.portal.model.BaseModel)
	 */
	public static void clearCache(VLegalSuggestDocument vLegalSuggestDocument) {
		getPersistence().clearCache(vLegalSuggestDocument);
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
	public static List<VLegalSuggestDocument> findWithDynamicQuery(
		DynamicQuery dynamicQuery) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<VLegalSuggestDocument> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<VLegalSuggestDocument> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#remove(com.liferay.portal.model.BaseModel)
	 */
	public static VLegalSuggestDocument remove(
		VLegalSuggestDocument vLegalSuggestDocument) throws SystemException {
		return getPersistence().remove(vLegalSuggestDocument);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, boolean)
	 */
	public static VLegalSuggestDocument update(
		VLegalSuggestDocument vLegalSuggestDocument, boolean merge)
		throws SystemException {
		return getPersistence().update(vLegalSuggestDocument, merge);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, boolean, ServiceContext)
	 */
	public static VLegalSuggestDocument update(
		VLegalSuggestDocument vLegalSuggestDocument, boolean merge,
		ServiceContext serviceContext) throws SystemException {
		return getPersistence()
				   .update(vLegalSuggestDocument, merge, serviceContext);
	}

	/**
	* Caches the v legal suggest document in the entity cache if it is enabled.
	*
	* @param vLegalSuggestDocument the v legal suggest document to cache
	*/
	public static void cacheResult(
		com.vportal.portlet.vlegal.model.VLegalSuggestDocument vLegalSuggestDocument) {
		getPersistence().cacheResult(vLegalSuggestDocument);
	}

	/**
	* Caches the v legal suggest documents in the entity cache if it is enabled.
	*
	* @param vLegalSuggestDocuments the v legal suggest documents to cache
	*/
	public static void cacheResult(
		java.util.List<com.vportal.portlet.vlegal.model.VLegalSuggestDocument> vLegalSuggestDocuments) {
		getPersistence().cacheResult(vLegalSuggestDocuments);
	}

	/**
	* Creates a new v legal suggest document with the primary key. Does not add the v legal suggest document to the database.
	*
	* @param sugId the primary key for the new v legal suggest document
	* @return the new v legal suggest document
	*/
	public static com.vportal.portlet.vlegal.model.VLegalSuggestDocument create(
		java.lang.String sugId) {
		return getPersistence().create(sugId);
	}

	/**
	* Removes the v legal suggest document with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param sugId the primary key of the v legal suggest document to remove
	* @return the v legal suggest document that was removed
	* @throws com.vportal.portlet.vlegal.NoSuchVLegalSuggestDocumentException if a v legal suggest document with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.vportal.portlet.vlegal.model.VLegalSuggestDocument remove(
		java.lang.String sugId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vlegal.NoSuchVLegalSuggestDocumentException {
		return getPersistence().remove(sugId);
	}

	public static com.vportal.portlet.vlegal.model.VLegalSuggestDocument updateImpl(
		com.vportal.portlet.vlegal.model.VLegalSuggestDocument vLegalSuggestDocument,
		boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(vLegalSuggestDocument, merge);
	}

	/**
	* Finds the v legal suggest document with the primary key or throws a {@link com.vportal.portlet.vlegal.NoSuchVLegalSuggestDocumentException} if it could not be found.
	*
	* @param sugId the primary key of the v legal suggest document to find
	* @return the v legal suggest document
	* @throws com.vportal.portlet.vlegal.NoSuchVLegalSuggestDocumentException if a v legal suggest document with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.vportal.portlet.vlegal.model.VLegalSuggestDocument findByPrimaryKey(
		java.lang.String sugId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vlegal.NoSuchVLegalSuggestDocumentException {
		return getPersistence().findByPrimaryKey(sugId);
	}

	/**
	* Finds the v legal suggest document with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param sugId the primary key of the v legal suggest document to find
	* @return the v legal suggest document, or <code>null</code> if a v legal suggest document with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.vportal.portlet.vlegal.model.VLegalSuggestDocument fetchByPrimaryKey(
		java.lang.String sugId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(sugId);
	}

	/**
	* Finds all the v legal suggest documents where groupId = &#63;.
	*
	* @param groupId the group id to search with
	* @return the matching v legal suggest documents
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.vportal.portlet.vlegal.model.VLegalSuggestDocument> findByGroupId(
		long groupId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByGroupId(groupId);
	}

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
	public static java.util.List<com.vportal.portlet.vlegal.model.VLegalSuggestDocument> findByGroupId(
		long groupId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByGroupId(groupId, start, end);
	}

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
	public static java.util.List<com.vportal.portlet.vlegal.model.VLegalSuggestDocument> findByGroupId(
		long groupId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByGroupId(groupId, start, end, orderByComparator);
	}

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
	public static com.vportal.portlet.vlegal.model.VLegalSuggestDocument findByGroupId_First(
		long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vlegal.NoSuchVLegalSuggestDocumentException {
		return getPersistence().findByGroupId_First(groupId, orderByComparator);
	}

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
	public static com.vportal.portlet.vlegal.model.VLegalSuggestDocument findByGroupId_Last(
		long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vlegal.NoSuchVLegalSuggestDocumentException {
		return getPersistence().findByGroupId_Last(groupId, orderByComparator);
	}

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
	public static com.vportal.portlet.vlegal.model.VLegalSuggestDocument[] findByGroupId_PrevAndNext(
		java.lang.String sugId, long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vlegal.NoSuchVLegalSuggestDocumentException {
		return getPersistence()
				   .findByGroupId_PrevAndNext(sugId, groupId, orderByComparator);
	}

	/**
	* Finds all the v legal suggest documents where groupId = &#63; and approved = &#63;.
	*
	* @param groupId the group id to search with
	* @param approved the approved to search with
	* @return the matching v legal suggest documents
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.vportal.portlet.vlegal.model.VLegalSuggestDocument> findByP_A(
		long groupId, boolean approved)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByP_A(groupId, approved);
	}

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
	public static java.util.List<com.vportal.portlet.vlegal.model.VLegalSuggestDocument> findByP_A(
		long groupId, boolean approved, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByP_A(groupId, approved, start, end);
	}

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
	public static java.util.List<com.vportal.portlet.vlegal.model.VLegalSuggestDocument> findByP_A(
		long groupId, boolean approved, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByP_A(groupId, approved, start, end, orderByComparator);
	}

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
	public static com.vportal.portlet.vlegal.model.VLegalSuggestDocument findByP_A_First(
		long groupId, boolean approved,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vlegal.NoSuchVLegalSuggestDocumentException {
		return getPersistence()
				   .findByP_A_First(groupId, approved, orderByComparator);
	}

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
	public static com.vportal.portlet.vlegal.model.VLegalSuggestDocument findByP_A_Last(
		long groupId, boolean approved,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vlegal.NoSuchVLegalSuggestDocumentException {
		return getPersistence()
				   .findByP_A_Last(groupId, approved, orderByComparator);
	}

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
	public static com.vportal.portlet.vlegal.model.VLegalSuggestDocument[] findByP_A_PrevAndNext(
		java.lang.String sugId, long groupId, boolean approved,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vlegal.NoSuchVLegalSuggestDocumentException {
		return getPersistence()
				   .findByP_A_PrevAndNext(sugId, groupId, approved,
			orderByComparator);
	}

	/**
	* Finds the v legal suggest document where groupId = &#63; and sugId = &#63; or throws a {@link com.vportal.portlet.vlegal.NoSuchVLegalSuggestDocumentException} if it could not be found.
	*
	* @param groupId the group id to search with
	* @param sugId the sug id to search with
	* @return the matching v legal suggest document
	* @throws com.vportal.portlet.vlegal.NoSuchVLegalSuggestDocumentException if a matching v legal suggest document could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.vportal.portlet.vlegal.model.VLegalSuggestDocument findByG_S(
		long groupId, java.lang.String sugId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vlegal.NoSuchVLegalSuggestDocumentException {
		return getPersistence().findByG_S(groupId, sugId);
	}

	/**
	* Finds the v legal suggest document where groupId = &#63; and sugId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param groupId the group id to search with
	* @param sugId the sug id to search with
	* @return the matching v legal suggest document, or <code>null</code> if a matching v legal suggest document could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.vportal.portlet.vlegal.model.VLegalSuggestDocument fetchByG_S(
		long groupId, java.lang.String sugId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByG_S(groupId, sugId);
	}

	/**
	* Finds the v legal suggest document where groupId = &#63; and sugId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param groupId the group id to search with
	* @param sugId the sug id to search with
	* @return the matching v legal suggest document, or <code>null</code> if a matching v legal suggest document could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.vportal.portlet.vlegal.model.VLegalSuggestDocument fetchByG_S(
		long groupId, java.lang.String sugId, boolean retrieveFromCache)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByG_S(groupId, sugId, retrieveFromCache);
	}

	/**
	* Finds all the v legal suggest documents where groupId = &#63; and language = &#63;.
	*
	* @param groupId the group id to search with
	* @param language the language to search with
	* @return the matching v legal suggest documents
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.vportal.portlet.vlegal.model.VLegalSuggestDocument> findByP_L(
		long groupId, java.lang.String language)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByP_L(groupId, language);
	}

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
	public static java.util.List<com.vportal.portlet.vlegal.model.VLegalSuggestDocument> findByP_L(
		long groupId, java.lang.String language, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByP_L(groupId, language, start, end);
	}

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
	public static java.util.List<com.vportal.portlet.vlegal.model.VLegalSuggestDocument> findByP_L(
		long groupId, java.lang.String language, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByP_L(groupId, language, start, end, orderByComparator);
	}

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
	public static com.vportal.portlet.vlegal.model.VLegalSuggestDocument findByP_L_First(
		long groupId, java.lang.String language,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vlegal.NoSuchVLegalSuggestDocumentException {
		return getPersistence()
				   .findByP_L_First(groupId, language, orderByComparator);
	}

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
	public static com.vportal.portlet.vlegal.model.VLegalSuggestDocument findByP_L_Last(
		long groupId, java.lang.String language,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vlegal.NoSuchVLegalSuggestDocumentException {
		return getPersistence()
				   .findByP_L_Last(groupId, language, orderByComparator);
	}

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
	public static com.vportal.portlet.vlegal.model.VLegalSuggestDocument[] findByP_L_PrevAndNext(
		java.lang.String sugId, long groupId, java.lang.String language,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vlegal.NoSuchVLegalSuggestDocumentException {
		return getPersistence()
				   .findByP_L_PrevAndNext(sugId, groupId, language,
			orderByComparator);
	}

	/**
	* Finds all the v legal suggest documents where groupId = &#63; and language = &#63; and approved = &#63;.
	*
	* @param groupId the group id to search with
	* @param language the language to search with
	* @param approved the approved to search with
	* @return the matching v legal suggest documents
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.vportal.portlet.vlegal.model.VLegalSuggestDocument> findByP_L_A(
		long groupId, java.lang.String language, boolean approved)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByP_L_A(groupId, language, approved);
	}

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
	public static java.util.List<com.vportal.portlet.vlegal.model.VLegalSuggestDocument> findByP_L_A(
		long groupId, java.lang.String language, boolean approved, int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByP_L_A(groupId, language, approved, start, end);
	}

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
	public static java.util.List<com.vportal.portlet.vlegal.model.VLegalSuggestDocument> findByP_L_A(
		long groupId, java.lang.String language, boolean approved, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByP_L_A(groupId, language, approved, start, end,
			orderByComparator);
	}

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
	public static com.vportal.portlet.vlegal.model.VLegalSuggestDocument findByP_L_A_First(
		long groupId, java.lang.String language, boolean approved,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vlegal.NoSuchVLegalSuggestDocumentException {
		return getPersistence()
				   .findByP_L_A_First(groupId, language, approved,
			orderByComparator);
	}

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
	public static com.vportal.portlet.vlegal.model.VLegalSuggestDocument findByP_L_A_Last(
		long groupId, java.lang.String language, boolean approved,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vlegal.NoSuchVLegalSuggestDocumentException {
		return getPersistence()
				   .findByP_L_A_Last(groupId, language, approved,
			orderByComparator);
	}

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
	public static com.vportal.portlet.vlegal.model.VLegalSuggestDocument[] findByP_L_A_PrevAndNext(
		java.lang.String sugId, long groupId, java.lang.String language,
		boolean approved,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vlegal.NoSuchVLegalSuggestDocumentException {
		return getPersistence()
				   .findByP_L_A_PrevAndNext(sugId, groupId, language, approved,
			orderByComparator);
	}

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
	public static java.util.List<com.vportal.portlet.vlegal.model.VLegalSuggestDocument> findByP_L_A_D(
		long groupId, java.lang.String language, boolean approved,
		java.lang.String draftId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByP_L_A_D(groupId, language, approved, draftId);
	}

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
	public static java.util.List<com.vportal.portlet.vlegal.model.VLegalSuggestDocument> findByP_L_A_D(
		long groupId, java.lang.String language, boolean approved,
		java.lang.String draftId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByP_L_A_D(groupId, language, approved, draftId, start,
			end);
	}

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
	public static java.util.List<com.vportal.portlet.vlegal.model.VLegalSuggestDocument> findByP_L_A_D(
		long groupId, java.lang.String language, boolean approved,
		java.lang.String draftId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByP_L_A_D(groupId, language, approved, draftId, start,
			end, orderByComparator);
	}

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
	public static com.vportal.portlet.vlegal.model.VLegalSuggestDocument findByP_L_A_D_First(
		long groupId, java.lang.String language, boolean approved,
		java.lang.String draftId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vlegal.NoSuchVLegalSuggestDocumentException {
		return getPersistence()
				   .findByP_L_A_D_First(groupId, language, approved, draftId,
			orderByComparator);
	}

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
	public static com.vportal.portlet.vlegal.model.VLegalSuggestDocument findByP_L_A_D_Last(
		long groupId, java.lang.String language, boolean approved,
		java.lang.String draftId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vlegal.NoSuchVLegalSuggestDocumentException {
		return getPersistence()
				   .findByP_L_A_D_Last(groupId, language, approved, draftId,
			orderByComparator);
	}

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
	public static com.vportal.portlet.vlegal.model.VLegalSuggestDocument[] findByP_L_A_D_PrevAndNext(
		java.lang.String sugId, long groupId, java.lang.String language,
		boolean approved, java.lang.String draftId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vlegal.NoSuchVLegalSuggestDocumentException {
		return getPersistence()
				   .findByP_L_A_D_PrevAndNext(sugId, groupId, language,
			approved, draftId, orderByComparator);
	}

	/**
	* Finds all the v legal suggest documents where approved = &#63; and draftId = &#63;.
	*
	* @param approved the approved to search with
	* @param draftId the draft id to search with
	* @return the matching v legal suggest documents
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.vportal.portlet.vlegal.model.VLegalSuggestDocument> findByA_D(
		boolean approved, java.lang.String draftId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByA_D(approved, draftId);
	}

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
	public static java.util.List<com.vportal.portlet.vlegal.model.VLegalSuggestDocument> findByA_D(
		boolean approved, java.lang.String draftId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByA_D(approved, draftId, start, end);
	}

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
	public static java.util.List<com.vportal.portlet.vlegal.model.VLegalSuggestDocument> findByA_D(
		boolean approved, java.lang.String draftId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByA_D(approved, draftId, start, end, orderByComparator);
	}

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
	public static com.vportal.portlet.vlegal.model.VLegalSuggestDocument findByA_D_First(
		boolean approved, java.lang.String draftId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vlegal.NoSuchVLegalSuggestDocumentException {
		return getPersistence()
				   .findByA_D_First(approved, draftId, orderByComparator);
	}

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
	public static com.vportal.portlet.vlegal.model.VLegalSuggestDocument findByA_D_Last(
		boolean approved, java.lang.String draftId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vlegal.NoSuchVLegalSuggestDocumentException {
		return getPersistence()
				   .findByA_D_Last(approved, draftId, orderByComparator);
	}

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
	public static com.vportal.portlet.vlegal.model.VLegalSuggestDocument[] findByA_D_PrevAndNext(
		java.lang.String sugId, boolean approved, java.lang.String draftId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vlegal.NoSuchVLegalSuggestDocumentException {
		return getPersistence()
				   .findByA_D_PrevAndNext(sugId, approved, draftId,
			orderByComparator);
	}

	/**
	* Finds all the v legal suggest documents where draftId = &#63;.
	*
	* @param draftId the draft id to search with
	* @return the matching v legal suggest documents
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.vportal.portlet.vlegal.model.VLegalSuggestDocument> findBySuggByDraftId(
		java.lang.String draftId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findBySuggByDraftId(draftId);
	}

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
	public static java.util.List<com.vportal.portlet.vlegal.model.VLegalSuggestDocument> findBySuggByDraftId(
		java.lang.String draftId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findBySuggByDraftId(draftId, start, end);
	}

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
	public static java.util.List<com.vportal.portlet.vlegal.model.VLegalSuggestDocument> findBySuggByDraftId(
		java.lang.String draftId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findBySuggByDraftId(draftId, start, end, orderByComparator);
	}

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
	public static com.vportal.portlet.vlegal.model.VLegalSuggestDocument findBySuggByDraftId_First(
		java.lang.String draftId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vlegal.NoSuchVLegalSuggestDocumentException {
		return getPersistence()
				   .findBySuggByDraftId_First(draftId, orderByComparator);
	}

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
	public static com.vportal.portlet.vlegal.model.VLegalSuggestDocument findBySuggByDraftId_Last(
		java.lang.String draftId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vlegal.NoSuchVLegalSuggestDocumentException {
		return getPersistence()
				   .findBySuggByDraftId_Last(draftId, orderByComparator);
	}

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
	public static com.vportal.portlet.vlegal.model.VLegalSuggestDocument[] findBySuggByDraftId_PrevAndNext(
		java.lang.String sugId, java.lang.String draftId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vlegal.NoSuchVLegalSuggestDocumentException {
		return getPersistence()
				   .findBySuggByDraftId_PrevAndNext(sugId, draftId,
			orderByComparator);
	}

	/**
	* Finds all the v legal suggest documents.
	*
	* @return the v legal suggest documents
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.vportal.portlet.vlegal.model.VLegalSuggestDocument> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
	}

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
	public static java.util.List<com.vportal.portlet.vlegal.model.VLegalSuggestDocument> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

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
	public static java.util.List<com.vportal.portlet.vlegal.model.VLegalSuggestDocument> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the v legal suggest documents where groupId = &#63; from the database.
	*
	* @param groupId the group id to search with
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByGroupId(long groupId)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByGroupId(groupId);
	}

	/**
	* Removes all the v legal suggest documents where groupId = &#63; and approved = &#63; from the database.
	*
	* @param groupId the group id to search with
	* @param approved the approved to search with
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByP_A(long groupId, boolean approved)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByP_A(groupId, approved);
	}

	/**
	* Removes the v legal suggest document where groupId = &#63; and sugId = &#63; from the database.
	*
	* @param groupId the group id to search with
	* @param sugId the sug id to search with
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByG_S(long groupId, java.lang.String sugId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vlegal.NoSuchVLegalSuggestDocumentException {
		getPersistence().removeByG_S(groupId, sugId);
	}

	/**
	* Removes all the v legal suggest documents where groupId = &#63; and language = &#63; from the database.
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
	* Removes all the v legal suggest documents where groupId = &#63; and language = &#63; and approved = &#63; from the database.
	*
	* @param groupId the group id to search with
	* @param language the language to search with
	* @param approved the approved to search with
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByP_L_A(long groupId, java.lang.String language,
		boolean approved)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByP_L_A(groupId, language, approved);
	}

	/**
	* Removes all the v legal suggest documents where groupId = &#63; and language = &#63; and approved = &#63; and draftId = &#63; from the database.
	*
	* @param groupId the group id to search with
	* @param language the language to search with
	* @param approved the approved to search with
	* @param draftId the draft id to search with
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByP_L_A_D(long groupId, java.lang.String language,
		boolean approved, java.lang.String draftId)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByP_L_A_D(groupId, language, approved, draftId);
	}

	/**
	* Removes all the v legal suggest documents where approved = &#63; and draftId = &#63; from the database.
	*
	* @param approved the approved to search with
	* @param draftId the draft id to search with
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByA_D(boolean approved, java.lang.String draftId)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByA_D(approved, draftId);
	}

	/**
	* Removes all the v legal suggest documents where draftId = &#63; from the database.
	*
	* @param draftId the draft id to search with
	* @throws SystemException if a system exception occurred
	*/
	public static void removeBySuggByDraftId(java.lang.String draftId)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeBySuggByDraftId(draftId);
	}

	/**
	* Removes all the v legal suggest documents from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Counts all the v legal suggest documents where groupId = &#63;.
	*
	* @param groupId the group id to search with
	* @return the number of matching v legal suggest documents
	* @throws SystemException if a system exception occurred
	*/
	public static int countByGroupId(long groupId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByGroupId(groupId);
	}

	/**
	* Counts all the v legal suggest documents where groupId = &#63; and approved = &#63;.
	*
	* @param groupId the group id to search with
	* @param approved the approved to search with
	* @return the number of matching v legal suggest documents
	* @throws SystemException if a system exception occurred
	*/
	public static int countByP_A(long groupId, boolean approved)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByP_A(groupId, approved);
	}

	/**
	* Counts all the v legal suggest documents where groupId = &#63; and sugId = &#63;.
	*
	* @param groupId the group id to search with
	* @param sugId the sug id to search with
	* @return the number of matching v legal suggest documents
	* @throws SystemException if a system exception occurred
	*/
	public static int countByG_S(long groupId, java.lang.String sugId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByG_S(groupId, sugId);
	}

	/**
	* Counts all the v legal suggest documents where groupId = &#63; and language = &#63;.
	*
	* @param groupId the group id to search with
	* @param language the language to search with
	* @return the number of matching v legal suggest documents
	* @throws SystemException if a system exception occurred
	*/
	public static int countByP_L(long groupId, java.lang.String language)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByP_L(groupId, language);
	}

	/**
	* Counts all the v legal suggest documents where groupId = &#63; and language = &#63; and approved = &#63;.
	*
	* @param groupId the group id to search with
	* @param language the language to search with
	* @param approved the approved to search with
	* @return the number of matching v legal suggest documents
	* @throws SystemException if a system exception occurred
	*/
	public static int countByP_L_A(long groupId, java.lang.String language,
		boolean approved)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByP_L_A(groupId, language, approved);
	}

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
	public static int countByP_L_A_D(long groupId, java.lang.String language,
		boolean approved, java.lang.String draftId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .countByP_L_A_D(groupId, language, approved, draftId);
	}

	/**
	* Counts all the v legal suggest documents where approved = &#63; and draftId = &#63;.
	*
	* @param approved the approved to search with
	* @param draftId the draft id to search with
	* @return the number of matching v legal suggest documents
	* @throws SystemException if a system exception occurred
	*/
	public static int countByA_D(boolean approved, java.lang.String draftId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByA_D(approved, draftId);
	}

	/**
	* Counts all the v legal suggest documents where draftId = &#63;.
	*
	* @param draftId the draft id to search with
	* @return the number of matching v legal suggest documents
	* @throws SystemException if a system exception occurred
	*/
	public static int countBySuggByDraftId(java.lang.String draftId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countBySuggByDraftId(draftId);
	}

	/**
	* Counts all the v legal suggest documents.
	*
	* @return the number of v legal suggest documents
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static VLegalSuggestDocumentPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (VLegalSuggestDocumentPersistence)PortletBeanLocatorUtil.locate(com.vportal.portlet.vlegal.service.ClpSerializer.SERVLET_CONTEXT_NAME,
					VLegalSuggestDocumentPersistence.class.getName());
		}

		return _persistence;
	}

	public void setPersistence(VLegalSuggestDocumentPersistence persistence) {
		_persistence = persistence;
	}

	private static VLegalSuggestDocumentPersistence _persistence;
}