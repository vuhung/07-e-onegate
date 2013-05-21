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

import com.vportal.portlet.vlegal.model.VLegalAttachedMessage;

import java.util.List;

/**
 * The persistence utility for the v legal attached message service. This utility wraps {@link VLegalAttachedMessagePersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
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
 * @see VLegalAttachedMessagePersistence
 * @see VLegalAttachedMessagePersistenceImpl
 * @generated
 */
public class VLegalAttachedMessageUtil {
	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#clearCache()
	 */
	public static void clearCache() {
		getPersistence().clearCache();
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#clearCache(com.liferay.portal.model.BaseModel)
	 */
	public static void clearCache(VLegalAttachedMessage vLegalAttachedMessage) {
		getPersistence().clearCache(vLegalAttachedMessage);
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
	public static List<VLegalAttachedMessage> findWithDynamicQuery(
		DynamicQuery dynamicQuery) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<VLegalAttachedMessage> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<VLegalAttachedMessage> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#remove(com.liferay.portal.model.BaseModel)
	 */
	public static VLegalAttachedMessage remove(
		VLegalAttachedMessage vLegalAttachedMessage) throws SystemException {
		return getPersistence().remove(vLegalAttachedMessage);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, boolean)
	 */
	public static VLegalAttachedMessage update(
		VLegalAttachedMessage vLegalAttachedMessage, boolean merge)
		throws SystemException {
		return getPersistence().update(vLegalAttachedMessage, merge);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, boolean, ServiceContext)
	 */
	public static VLegalAttachedMessage update(
		VLegalAttachedMessage vLegalAttachedMessage, boolean merge,
		ServiceContext serviceContext) throws SystemException {
		return getPersistence()
				   .update(vLegalAttachedMessage, merge, serviceContext);
	}

	/**
	* Caches the v legal attached message in the entity cache if it is enabled.
	*
	* @param vLegalAttachedMessage the v legal attached message to cache
	*/
	public static void cacheResult(
		com.vportal.portlet.vlegal.model.VLegalAttachedMessage vLegalAttachedMessage) {
		getPersistence().cacheResult(vLegalAttachedMessage);
	}

	/**
	* Caches the v legal attached messages in the entity cache if it is enabled.
	*
	* @param vLegalAttachedMessages the v legal attached messages to cache
	*/
	public static void cacheResult(
		java.util.List<com.vportal.portlet.vlegal.model.VLegalAttachedMessage> vLegalAttachedMessages) {
		getPersistence().cacheResult(vLegalAttachedMessages);
	}

	/**
	* Creates a new v legal attached message with the primary key. Does not add the v legal attached message to the database.
	*
	* @param messageId the primary key for the new v legal attached message
	* @return the new v legal attached message
	*/
	public static com.vportal.portlet.vlegal.model.VLegalAttachedMessage create(
		java.lang.String messageId) {
		return getPersistence().create(messageId);
	}

	/**
	* Removes the v legal attached message with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param messageId the primary key of the v legal attached message to remove
	* @return the v legal attached message that was removed
	* @throws com.vportal.portlet.vlegal.NoSuchVLegalAttachedMessageException if a v legal attached message with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.vportal.portlet.vlegal.model.VLegalAttachedMessage remove(
		java.lang.String messageId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vlegal.NoSuchVLegalAttachedMessageException {
		return getPersistence().remove(messageId);
	}

	public static com.vportal.portlet.vlegal.model.VLegalAttachedMessage updateImpl(
		com.vportal.portlet.vlegal.model.VLegalAttachedMessage vLegalAttachedMessage,
		boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(vLegalAttachedMessage, merge);
	}

	/**
	* Finds the v legal attached message with the primary key or throws a {@link com.vportal.portlet.vlegal.NoSuchVLegalAttachedMessageException} if it could not be found.
	*
	* @param messageId the primary key of the v legal attached message to find
	* @return the v legal attached message
	* @throws com.vportal.portlet.vlegal.NoSuchVLegalAttachedMessageException if a v legal attached message with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.vportal.portlet.vlegal.model.VLegalAttachedMessage findByPrimaryKey(
		java.lang.String messageId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vlegal.NoSuchVLegalAttachedMessageException {
		return getPersistence().findByPrimaryKey(messageId);
	}

	/**
	* Finds the v legal attached message with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param messageId the primary key of the v legal attached message to find
	* @return the v legal attached message, or <code>null</code> if a v legal attached message with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.vportal.portlet.vlegal.model.VLegalAttachedMessage fetchByPrimaryKey(
		java.lang.String messageId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(messageId);
	}

	/**
	* Finds all the v legal attached messages where groupId = &#63;.
	*
	* @param groupId the group id to search with
	* @return the matching v legal attached messages
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.vportal.portlet.vlegal.model.VLegalAttachedMessage> findByGroupId(
		long groupId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByGroupId(groupId);
	}

	/**
	* Finds a range of all the v legal attached messages where groupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param groupId the group id to search with
	* @param start the lower bound of the range of v legal attached messages to return
	* @param end the upper bound of the range of v legal attached messages to return (not inclusive)
	* @return the range of matching v legal attached messages
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.vportal.portlet.vlegal.model.VLegalAttachedMessage> findByGroupId(
		long groupId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByGroupId(groupId, start, end);
	}

	/**
	* Finds an ordered range of all the v legal attached messages where groupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param groupId the group id to search with
	* @param start the lower bound of the range of v legal attached messages to return
	* @param end the upper bound of the range of v legal attached messages to return (not inclusive)
	* @param orderByComparator the comparator to order the results by
	* @return the ordered range of matching v legal attached messages
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.vportal.portlet.vlegal.model.VLegalAttachedMessage> findByGroupId(
		long groupId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByGroupId(groupId, start, end, orderByComparator);
	}

	/**
	* Finds the first v legal attached message in the ordered set where groupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param groupId the group id to search with
	* @param orderByComparator the comparator to order the set by
	* @return the first matching v legal attached message
	* @throws com.vportal.portlet.vlegal.NoSuchVLegalAttachedMessageException if a matching v legal attached message could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.vportal.portlet.vlegal.model.VLegalAttachedMessage findByGroupId_First(
		long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vlegal.NoSuchVLegalAttachedMessageException {
		return getPersistence().findByGroupId_First(groupId, orderByComparator);
	}

	/**
	* Finds the last v legal attached message in the ordered set where groupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param groupId the group id to search with
	* @param orderByComparator the comparator to order the set by
	* @return the last matching v legal attached message
	* @throws com.vportal.portlet.vlegal.NoSuchVLegalAttachedMessageException if a matching v legal attached message could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.vportal.portlet.vlegal.model.VLegalAttachedMessage findByGroupId_Last(
		long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vlegal.NoSuchVLegalAttachedMessageException {
		return getPersistence().findByGroupId_Last(groupId, orderByComparator);
	}

	/**
	* Finds the v legal attached messages before and after the current v legal attached message in the ordered set where groupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param messageId the primary key of the current v legal attached message
	* @param groupId the group id to search with
	* @param orderByComparator the comparator to order the set by
	* @return the previous, current, and next v legal attached message
	* @throws com.vportal.portlet.vlegal.NoSuchVLegalAttachedMessageException if a v legal attached message with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.vportal.portlet.vlegal.model.VLegalAttachedMessage[] findByGroupId_PrevAndNext(
		java.lang.String messageId, long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vlegal.NoSuchVLegalAttachedMessageException {
		return getPersistence()
				   .findByGroupId_PrevAndNext(messageId, groupId,
			orderByComparator);
	}

	/**
	* Finds all the v legal attached messages where articleId = &#63;.
	*
	* @param articleId the article id to search with
	* @return the matching v legal attached messages
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.vportal.portlet.vlegal.model.VLegalAttachedMessage> findByArticle(
		java.lang.String articleId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByArticle(articleId);
	}

	/**
	* Finds a range of all the v legal attached messages where articleId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param articleId the article id to search with
	* @param start the lower bound of the range of v legal attached messages to return
	* @param end the upper bound of the range of v legal attached messages to return (not inclusive)
	* @return the range of matching v legal attached messages
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.vportal.portlet.vlegal.model.VLegalAttachedMessage> findByArticle(
		java.lang.String articleId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByArticle(articleId, start, end);
	}

	/**
	* Finds an ordered range of all the v legal attached messages where articleId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param articleId the article id to search with
	* @param start the lower bound of the range of v legal attached messages to return
	* @param end the upper bound of the range of v legal attached messages to return (not inclusive)
	* @param orderByComparator the comparator to order the results by
	* @return the ordered range of matching v legal attached messages
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.vportal.portlet.vlegal.model.VLegalAttachedMessage> findByArticle(
		java.lang.String articleId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByArticle(articleId, start, end, orderByComparator);
	}

	/**
	* Finds the first v legal attached message in the ordered set where articleId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param articleId the article id to search with
	* @param orderByComparator the comparator to order the set by
	* @return the first matching v legal attached message
	* @throws com.vportal.portlet.vlegal.NoSuchVLegalAttachedMessageException if a matching v legal attached message could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.vportal.portlet.vlegal.model.VLegalAttachedMessage findByArticle_First(
		java.lang.String articleId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vlegal.NoSuchVLegalAttachedMessageException {
		return getPersistence().findByArticle_First(articleId, orderByComparator);
	}

	/**
	* Finds the last v legal attached message in the ordered set where articleId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param articleId the article id to search with
	* @param orderByComparator the comparator to order the set by
	* @return the last matching v legal attached message
	* @throws com.vportal.portlet.vlegal.NoSuchVLegalAttachedMessageException if a matching v legal attached message could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.vportal.portlet.vlegal.model.VLegalAttachedMessage findByArticle_Last(
		java.lang.String articleId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vlegal.NoSuchVLegalAttachedMessageException {
		return getPersistence().findByArticle_Last(articleId, orderByComparator);
	}

	/**
	* Finds the v legal attached messages before and after the current v legal attached message in the ordered set where articleId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param messageId the primary key of the current v legal attached message
	* @param articleId the article id to search with
	* @param orderByComparator the comparator to order the set by
	* @return the previous, current, and next v legal attached message
	* @throws com.vportal.portlet.vlegal.NoSuchVLegalAttachedMessageException if a v legal attached message with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.vportal.portlet.vlegal.model.VLegalAttachedMessage[] findByArticle_PrevAndNext(
		java.lang.String messageId, java.lang.String articleId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vlegal.NoSuchVLegalAttachedMessageException {
		return getPersistence()
				   .findByArticle_PrevAndNext(messageId, articleId,
			orderByComparator);
	}

	/**
	* Finds all the v legal attached messages where articleId = &#63; and readMessage = &#63;.
	*
	* @param articleId the article id to search with
	* @param readMessage the read message to search with
	* @return the matching v legal attached messages
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.vportal.portlet.vlegal.model.VLegalAttachedMessage> findByA_R(
		java.lang.String articleId, boolean readMessage)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByA_R(articleId, readMessage);
	}

	/**
	* Finds a range of all the v legal attached messages where articleId = &#63; and readMessage = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param articleId the article id to search with
	* @param readMessage the read message to search with
	* @param start the lower bound of the range of v legal attached messages to return
	* @param end the upper bound of the range of v legal attached messages to return (not inclusive)
	* @return the range of matching v legal attached messages
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.vportal.portlet.vlegal.model.VLegalAttachedMessage> findByA_R(
		java.lang.String articleId, boolean readMessage, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByA_R(articleId, readMessage, start, end);
	}

	/**
	* Finds an ordered range of all the v legal attached messages where articleId = &#63; and readMessage = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param articleId the article id to search with
	* @param readMessage the read message to search with
	* @param start the lower bound of the range of v legal attached messages to return
	* @param end the upper bound of the range of v legal attached messages to return (not inclusive)
	* @param orderByComparator the comparator to order the results by
	* @return the ordered range of matching v legal attached messages
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.vportal.portlet.vlegal.model.VLegalAttachedMessage> findByA_R(
		java.lang.String articleId, boolean readMessage, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByA_R(articleId, readMessage, start, end,
			orderByComparator);
	}

	/**
	* Finds the first v legal attached message in the ordered set where articleId = &#63; and readMessage = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param articleId the article id to search with
	* @param readMessage the read message to search with
	* @param orderByComparator the comparator to order the set by
	* @return the first matching v legal attached message
	* @throws com.vportal.portlet.vlegal.NoSuchVLegalAttachedMessageException if a matching v legal attached message could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.vportal.portlet.vlegal.model.VLegalAttachedMessage findByA_R_First(
		java.lang.String articleId, boolean readMessage,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vlegal.NoSuchVLegalAttachedMessageException {
		return getPersistence()
				   .findByA_R_First(articleId, readMessage, orderByComparator);
	}

	/**
	* Finds the last v legal attached message in the ordered set where articleId = &#63; and readMessage = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param articleId the article id to search with
	* @param readMessage the read message to search with
	* @param orderByComparator the comparator to order the set by
	* @return the last matching v legal attached message
	* @throws com.vportal.portlet.vlegal.NoSuchVLegalAttachedMessageException if a matching v legal attached message could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.vportal.portlet.vlegal.model.VLegalAttachedMessage findByA_R_Last(
		java.lang.String articleId, boolean readMessage,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vlegal.NoSuchVLegalAttachedMessageException {
		return getPersistence()
				   .findByA_R_Last(articleId, readMessage, orderByComparator);
	}

	/**
	* Finds the v legal attached messages before and after the current v legal attached message in the ordered set where articleId = &#63; and readMessage = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param messageId the primary key of the current v legal attached message
	* @param articleId the article id to search with
	* @param readMessage the read message to search with
	* @param orderByComparator the comparator to order the set by
	* @return the previous, current, and next v legal attached message
	* @throws com.vportal.portlet.vlegal.NoSuchVLegalAttachedMessageException if a v legal attached message with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.vportal.portlet.vlegal.model.VLegalAttachedMessage[] findByA_R_PrevAndNext(
		java.lang.String messageId, java.lang.String articleId,
		boolean readMessage,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vlegal.NoSuchVLegalAttachedMessageException {
		return getPersistence()
				   .findByA_R_PrevAndNext(messageId, articleId, readMessage,
			orderByComparator);
	}

	/**
	* Finds all the v legal attached messages where groupId = &#63; and readMessage = &#63;.
	*
	* @param groupId the group id to search with
	* @param readMessage the read message to search with
	* @return the matching v legal attached messages
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.vportal.portlet.vlegal.model.VLegalAttachedMessage> findByStatus(
		long groupId, boolean readMessage)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByStatus(groupId, readMessage);
	}

	/**
	* Finds a range of all the v legal attached messages where groupId = &#63; and readMessage = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param groupId the group id to search with
	* @param readMessage the read message to search with
	* @param start the lower bound of the range of v legal attached messages to return
	* @param end the upper bound of the range of v legal attached messages to return (not inclusive)
	* @return the range of matching v legal attached messages
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.vportal.portlet.vlegal.model.VLegalAttachedMessage> findByStatus(
		long groupId, boolean readMessage, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByStatus(groupId, readMessage, start, end);
	}

	/**
	* Finds an ordered range of all the v legal attached messages where groupId = &#63; and readMessage = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param groupId the group id to search with
	* @param readMessage the read message to search with
	* @param start the lower bound of the range of v legal attached messages to return
	* @param end the upper bound of the range of v legal attached messages to return (not inclusive)
	* @param orderByComparator the comparator to order the results by
	* @return the ordered range of matching v legal attached messages
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.vportal.portlet.vlegal.model.VLegalAttachedMessage> findByStatus(
		long groupId, boolean readMessage, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByStatus(groupId, readMessage, start, end,
			orderByComparator);
	}

	/**
	* Finds the first v legal attached message in the ordered set where groupId = &#63; and readMessage = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param groupId the group id to search with
	* @param readMessage the read message to search with
	* @param orderByComparator the comparator to order the set by
	* @return the first matching v legal attached message
	* @throws com.vportal.portlet.vlegal.NoSuchVLegalAttachedMessageException if a matching v legal attached message could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.vportal.portlet.vlegal.model.VLegalAttachedMessage findByStatus_First(
		long groupId, boolean readMessage,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vlegal.NoSuchVLegalAttachedMessageException {
		return getPersistence()
				   .findByStatus_First(groupId, readMessage, orderByComparator);
	}

	/**
	* Finds the last v legal attached message in the ordered set where groupId = &#63; and readMessage = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param groupId the group id to search with
	* @param readMessage the read message to search with
	* @param orderByComparator the comparator to order the set by
	* @return the last matching v legal attached message
	* @throws com.vportal.portlet.vlegal.NoSuchVLegalAttachedMessageException if a matching v legal attached message could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.vportal.portlet.vlegal.model.VLegalAttachedMessage findByStatus_Last(
		long groupId, boolean readMessage,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vlegal.NoSuchVLegalAttachedMessageException {
		return getPersistence()
				   .findByStatus_Last(groupId, readMessage, orderByComparator);
	}

	/**
	* Finds the v legal attached messages before and after the current v legal attached message in the ordered set where groupId = &#63; and readMessage = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param messageId the primary key of the current v legal attached message
	* @param groupId the group id to search with
	* @param readMessage the read message to search with
	* @param orderByComparator the comparator to order the set by
	* @return the previous, current, and next v legal attached message
	* @throws com.vportal.portlet.vlegal.NoSuchVLegalAttachedMessageException if a v legal attached message with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.vportal.portlet.vlegal.model.VLegalAttachedMessage[] findByStatus_PrevAndNext(
		java.lang.String messageId, long groupId, boolean readMessage,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vlegal.NoSuchVLegalAttachedMessageException {
		return getPersistence()
				   .findByStatus_PrevAndNext(messageId, groupId, readMessage,
			orderByComparator);
	}

	/**
	* Finds all the v legal attached messages.
	*
	* @return the v legal attached messages
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.vportal.portlet.vlegal.model.VLegalAttachedMessage> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
	}

	/**
	* Finds a range of all the v legal attached messages.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of v legal attached messages to return
	* @param end the upper bound of the range of v legal attached messages to return (not inclusive)
	* @return the range of v legal attached messages
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.vportal.portlet.vlegal.model.VLegalAttachedMessage> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

	/**
	* Finds an ordered range of all the v legal attached messages.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of v legal attached messages to return
	* @param end the upper bound of the range of v legal attached messages to return (not inclusive)
	* @param orderByComparator the comparator to order the results by
	* @return the ordered range of v legal attached messages
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.vportal.portlet.vlegal.model.VLegalAttachedMessage> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the v legal attached messages where groupId = &#63; from the database.
	*
	* @param groupId the group id to search with
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByGroupId(long groupId)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByGroupId(groupId);
	}

	/**
	* Removes all the v legal attached messages where articleId = &#63; from the database.
	*
	* @param articleId the article id to search with
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByArticle(java.lang.String articleId)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByArticle(articleId);
	}

	/**
	* Removes all the v legal attached messages where articleId = &#63; and readMessage = &#63; from the database.
	*
	* @param articleId the article id to search with
	* @param readMessage the read message to search with
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByA_R(java.lang.String articleId,
		boolean readMessage)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByA_R(articleId, readMessage);
	}

	/**
	* Removes all the v legal attached messages where groupId = &#63; and readMessage = &#63; from the database.
	*
	* @param groupId the group id to search with
	* @param readMessage the read message to search with
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByStatus(long groupId, boolean readMessage)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByStatus(groupId, readMessage);
	}

	/**
	* Removes all the v legal attached messages from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Counts all the v legal attached messages where groupId = &#63;.
	*
	* @param groupId the group id to search with
	* @return the number of matching v legal attached messages
	* @throws SystemException if a system exception occurred
	*/
	public static int countByGroupId(long groupId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByGroupId(groupId);
	}

	/**
	* Counts all the v legal attached messages where articleId = &#63;.
	*
	* @param articleId the article id to search with
	* @return the number of matching v legal attached messages
	* @throws SystemException if a system exception occurred
	*/
	public static int countByArticle(java.lang.String articleId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByArticle(articleId);
	}

	/**
	* Counts all the v legal attached messages where articleId = &#63; and readMessage = &#63;.
	*
	* @param articleId the article id to search with
	* @param readMessage the read message to search with
	* @return the number of matching v legal attached messages
	* @throws SystemException if a system exception occurred
	*/
	public static int countByA_R(java.lang.String articleId, boolean readMessage)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByA_R(articleId, readMessage);
	}

	/**
	* Counts all the v legal attached messages where groupId = &#63; and readMessage = &#63;.
	*
	* @param groupId the group id to search with
	* @param readMessage the read message to search with
	* @return the number of matching v legal attached messages
	* @throws SystemException if a system exception occurred
	*/
	public static int countByStatus(long groupId, boolean readMessage)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByStatus(groupId, readMessage);
	}

	/**
	* Counts all the v legal attached messages.
	*
	* @return the number of v legal attached messages
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static VLegalAttachedMessagePersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (VLegalAttachedMessagePersistence)PortletBeanLocatorUtil.locate(com.vportal.portlet.vlegal.service.ClpSerializer.SERVLET_CONTEXT_NAME,
					VLegalAttachedMessagePersistence.class.getName());
		}

		return _persistence;
	}

	public void setPersistence(VLegalAttachedMessagePersistence persistence) {
		_persistence = persistence;
	}

	private static VLegalAttachedMessagePersistence _persistence;
}