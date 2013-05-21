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

import com.vportal.portlet.vlegal.model.VLegalAttachedMessage;

/**
 * The persistence interface for the v legal attached message service.
 *
 * <p>
 * Never modify or reference this interface directly. Always use {@link VLegalAttachedMessageUtil} to access the v legal attached message persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
 * </p>
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author ACB
 * @see VLegalAttachedMessagePersistenceImpl
 * @see VLegalAttachedMessageUtil
 * @generated
 */
public interface VLegalAttachedMessagePersistence extends BasePersistence<VLegalAttachedMessage> {
	/**
	* Caches the v legal attached message in the entity cache if it is enabled.
	*
	* @param vLegalAttachedMessage the v legal attached message to cache
	*/
	public void cacheResult(
		com.vportal.portlet.vlegal.model.VLegalAttachedMessage vLegalAttachedMessage);

	/**
	* Caches the v legal attached messages in the entity cache if it is enabled.
	*
	* @param vLegalAttachedMessages the v legal attached messages to cache
	*/
	public void cacheResult(
		java.util.List<com.vportal.portlet.vlegal.model.VLegalAttachedMessage> vLegalAttachedMessages);

	/**
	* Creates a new v legal attached message with the primary key. Does not add the v legal attached message to the database.
	*
	* @param messageId the primary key for the new v legal attached message
	* @return the new v legal attached message
	*/
	public com.vportal.portlet.vlegal.model.VLegalAttachedMessage create(
		java.lang.String messageId);

	/**
	* Removes the v legal attached message with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param messageId the primary key of the v legal attached message to remove
	* @return the v legal attached message that was removed
	* @throws com.vportal.portlet.vlegal.NoSuchVLegalAttachedMessageException if a v legal attached message with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.vportal.portlet.vlegal.model.VLegalAttachedMessage remove(
		java.lang.String messageId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vlegal.NoSuchVLegalAttachedMessageException;

	public com.vportal.portlet.vlegal.model.VLegalAttachedMessage updateImpl(
		com.vportal.portlet.vlegal.model.VLegalAttachedMessage vLegalAttachedMessage,
		boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Finds the v legal attached message with the primary key or throws a {@link com.vportal.portlet.vlegal.NoSuchVLegalAttachedMessageException} if it could not be found.
	*
	* @param messageId the primary key of the v legal attached message to find
	* @return the v legal attached message
	* @throws com.vportal.portlet.vlegal.NoSuchVLegalAttachedMessageException if a v legal attached message with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.vportal.portlet.vlegal.model.VLegalAttachedMessage findByPrimaryKey(
		java.lang.String messageId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vlegal.NoSuchVLegalAttachedMessageException;

	/**
	* Finds the v legal attached message with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param messageId the primary key of the v legal attached message to find
	* @return the v legal attached message, or <code>null</code> if a v legal attached message with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.vportal.portlet.vlegal.model.VLegalAttachedMessage fetchByPrimaryKey(
		java.lang.String messageId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Finds all the v legal attached messages where groupId = &#63;.
	*
	* @param groupId the group id to search with
	* @return the matching v legal attached messages
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.vportal.portlet.vlegal.model.VLegalAttachedMessage> findByGroupId(
		long groupId)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.vportal.portlet.vlegal.model.VLegalAttachedMessage> findByGroupId(
		long groupId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.vportal.portlet.vlegal.model.VLegalAttachedMessage> findByGroupId(
		long groupId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public com.vportal.portlet.vlegal.model.VLegalAttachedMessage findByGroupId_First(
		long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vlegal.NoSuchVLegalAttachedMessageException;

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
	public com.vportal.portlet.vlegal.model.VLegalAttachedMessage findByGroupId_Last(
		long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vlegal.NoSuchVLegalAttachedMessageException;

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
	public com.vportal.portlet.vlegal.model.VLegalAttachedMessage[] findByGroupId_PrevAndNext(
		java.lang.String messageId, long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vlegal.NoSuchVLegalAttachedMessageException;

	/**
	* Finds all the v legal attached messages where articleId = &#63;.
	*
	* @param articleId the article id to search with
	* @return the matching v legal attached messages
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.vportal.portlet.vlegal.model.VLegalAttachedMessage> findByArticle(
		java.lang.String articleId)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.vportal.portlet.vlegal.model.VLegalAttachedMessage> findByArticle(
		java.lang.String articleId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.vportal.portlet.vlegal.model.VLegalAttachedMessage> findByArticle(
		java.lang.String articleId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public com.vportal.portlet.vlegal.model.VLegalAttachedMessage findByArticle_First(
		java.lang.String articleId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vlegal.NoSuchVLegalAttachedMessageException;

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
	public com.vportal.portlet.vlegal.model.VLegalAttachedMessage findByArticle_Last(
		java.lang.String articleId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vlegal.NoSuchVLegalAttachedMessageException;

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
	public com.vportal.portlet.vlegal.model.VLegalAttachedMessage[] findByArticle_PrevAndNext(
		java.lang.String messageId, java.lang.String articleId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vlegal.NoSuchVLegalAttachedMessageException;

	/**
	* Finds all the v legal attached messages where articleId = &#63; and readMessage = &#63;.
	*
	* @param articleId the article id to search with
	* @param readMessage the read message to search with
	* @return the matching v legal attached messages
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.vportal.portlet.vlegal.model.VLegalAttachedMessage> findByA_R(
		java.lang.String articleId, boolean readMessage)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.vportal.portlet.vlegal.model.VLegalAttachedMessage> findByA_R(
		java.lang.String articleId, boolean readMessage, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.vportal.portlet.vlegal.model.VLegalAttachedMessage> findByA_R(
		java.lang.String articleId, boolean readMessage, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public com.vportal.portlet.vlegal.model.VLegalAttachedMessage findByA_R_First(
		java.lang.String articleId, boolean readMessage,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vlegal.NoSuchVLegalAttachedMessageException;

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
	public com.vportal.portlet.vlegal.model.VLegalAttachedMessage findByA_R_Last(
		java.lang.String articleId, boolean readMessage,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vlegal.NoSuchVLegalAttachedMessageException;

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
	public com.vportal.portlet.vlegal.model.VLegalAttachedMessage[] findByA_R_PrevAndNext(
		java.lang.String messageId, java.lang.String articleId,
		boolean readMessage,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vlegal.NoSuchVLegalAttachedMessageException;

	/**
	* Finds all the v legal attached messages where groupId = &#63; and readMessage = &#63;.
	*
	* @param groupId the group id to search with
	* @param readMessage the read message to search with
	* @return the matching v legal attached messages
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.vportal.portlet.vlegal.model.VLegalAttachedMessage> findByStatus(
		long groupId, boolean readMessage)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.vportal.portlet.vlegal.model.VLegalAttachedMessage> findByStatus(
		long groupId, boolean readMessage, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.vportal.portlet.vlegal.model.VLegalAttachedMessage> findByStatus(
		long groupId, boolean readMessage, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public com.vportal.portlet.vlegal.model.VLegalAttachedMessage findByStatus_First(
		long groupId, boolean readMessage,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vlegal.NoSuchVLegalAttachedMessageException;

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
	public com.vportal.portlet.vlegal.model.VLegalAttachedMessage findByStatus_Last(
		long groupId, boolean readMessage,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vlegal.NoSuchVLegalAttachedMessageException;

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
	public com.vportal.portlet.vlegal.model.VLegalAttachedMessage[] findByStatus_PrevAndNext(
		java.lang.String messageId, long groupId, boolean readMessage,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vlegal.NoSuchVLegalAttachedMessageException;

	/**
	* Finds all the v legal attached messages.
	*
	* @return the v legal attached messages
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.vportal.portlet.vlegal.model.VLegalAttachedMessage> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.vportal.portlet.vlegal.model.VLegalAttachedMessage> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.vportal.portlet.vlegal.model.VLegalAttachedMessage> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the v legal attached messages where groupId = &#63; from the database.
	*
	* @param groupId the group id to search with
	* @throws SystemException if a system exception occurred
	*/
	public void removeByGroupId(long groupId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the v legal attached messages where articleId = &#63; from the database.
	*
	* @param articleId the article id to search with
	* @throws SystemException if a system exception occurred
	*/
	public void removeByArticle(java.lang.String articleId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the v legal attached messages where articleId = &#63; and readMessage = &#63; from the database.
	*
	* @param articleId the article id to search with
	* @param readMessage the read message to search with
	* @throws SystemException if a system exception occurred
	*/
	public void removeByA_R(java.lang.String articleId, boolean readMessage)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the v legal attached messages where groupId = &#63; and readMessage = &#63; from the database.
	*
	* @param groupId the group id to search with
	* @param readMessage the read message to search with
	* @throws SystemException if a system exception occurred
	*/
	public void removeByStatus(long groupId, boolean readMessage)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the v legal attached messages from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Counts all the v legal attached messages where groupId = &#63;.
	*
	* @param groupId the group id to search with
	* @return the number of matching v legal attached messages
	* @throws SystemException if a system exception occurred
	*/
	public int countByGroupId(long groupId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Counts all the v legal attached messages where articleId = &#63;.
	*
	* @param articleId the article id to search with
	* @return the number of matching v legal attached messages
	* @throws SystemException if a system exception occurred
	*/
	public int countByArticle(java.lang.String articleId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Counts all the v legal attached messages where articleId = &#63; and readMessage = &#63;.
	*
	* @param articleId the article id to search with
	* @param readMessage the read message to search with
	* @return the number of matching v legal attached messages
	* @throws SystemException if a system exception occurred
	*/
	public int countByA_R(java.lang.String articleId, boolean readMessage)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Counts all the v legal attached messages where groupId = &#63; and readMessage = &#63;.
	*
	* @param groupId the group id to search with
	* @param readMessage the read message to search with
	* @return the number of matching v legal attached messages
	* @throws SystemException if a system exception occurred
	*/
	public int countByStatus(long groupId, boolean readMessage)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Counts all the v legal attached messages.
	*
	* @return the number of v legal attached messages
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}