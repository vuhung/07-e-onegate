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

package com.vportal.portal.service.persistence;

import com.liferay.portal.service.persistence.BasePersistence;

import com.vportal.portal.model.Attachment;

/**
 * The persistence interface for the attachment service.
 *
 * <p>
 * Never modify or reference this interface directly. Always use {@link AttachmentUtil} to access the attachment persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
 * </p>
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author HOAN
 * @see AttachmentPersistenceImpl
 * @see AttachmentUtil
 * @generated
 */
public interface AttachmentPersistence extends BasePersistence<Attachment> {
	/**
	* Caches the attachment in the entity cache if it is enabled.
	*
	* @param attachment the attachment to cache
	*/
	public void cacheResult(com.vportal.portal.model.Attachment attachment);

	/**
	* Caches the attachments in the entity cache if it is enabled.
	*
	* @param attachments the attachments to cache
	*/
	public void cacheResult(
		java.util.List<com.vportal.portal.model.Attachment> attachments);

	/**
	* Creates a new attachment with the primary key. Does not add the attachment to the database.
	*
	* @param attachmentId the primary key for the new attachment
	* @return the new attachment
	*/
	public com.vportal.portal.model.Attachment create(long attachmentId);

	/**
	* Removes the attachment with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param attachmentId the primary key of the attachment to remove
	* @return the attachment that was removed
	* @throws com.vportal.portal.NoSuchAttachmentException if a attachment with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.vportal.portal.model.Attachment remove(long attachmentId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portal.NoSuchAttachmentException;

	public com.vportal.portal.model.Attachment updateImpl(
		com.vportal.portal.model.Attachment attachment, boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Finds the attachment with the primary key or throws a {@link com.vportal.portal.NoSuchAttachmentException} if it could not be found.
	*
	* @param attachmentId the primary key of the attachment to find
	* @return the attachment
	* @throws com.vportal.portal.NoSuchAttachmentException if a attachment with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.vportal.portal.model.Attachment findByPrimaryKey(
		long attachmentId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portal.NoSuchAttachmentException;

	/**
	* Finds the attachment with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param attachmentId the primary key of the attachment to find
	* @return the attachment, or <code>null</code> if a attachment with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.vportal.portal.model.Attachment fetchByPrimaryKey(
		long attachmentId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Finds all the attachments where entryId = &#63; and entryClass = &#63;.
	*
	* @param entryId the entry id to search with
	* @param entryClass the entry class to search with
	* @return the matching attachments
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.vportal.portal.model.Attachment> findByEntry(
		long entryId, java.lang.String entryClass)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Finds a range of all the attachments where entryId = &#63; and entryClass = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param entryId the entry id to search with
	* @param entryClass the entry class to search with
	* @param start the lower bound of the range of attachments to return
	* @param end the upper bound of the range of attachments to return (not inclusive)
	* @return the range of matching attachments
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.vportal.portal.model.Attachment> findByEntry(
		long entryId, java.lang.String entryClass, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Finds an ordered range of all the attachments where entryId = &#63; and entryClass = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param entryId the entry id to search with
	* @param entryClass the entry class to search with
	* @param start the lower bound of the range of attachments to return
	* @param end the upper bound of the range of attachments to return (not inclusive)
	* @param orderByComparator the comparator to order the results by
	* @return the ordered range of matching attachments
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.vportal.portal.model.Attachment> findByEntry(
		long entryId, java.lang.String entryClass, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Finds the first attachment in the ordered set where entryId = &#63; and entryClass = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param entryId the entry id to search with
	* @param entryClass the entry class to search with
	* @param orderByComparator the comparator to order the set by
	* @return the first matching attachment
	* @throws com.vportal.portal.NoSuchAttachmentException if a matching attachment could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.vportal.portal.model.Attachment findByEntry_First(long entryId,
		java.lang.String entryClass,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portal.NoSuchAttachmentException;

	/**
	* Finds the last attachment in the ordered set where entryId = &#63; and entryClass = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param entryId the entry id to search with
	* @param entryClass the entry class to search with
	* @param orderByComparator the comparator to order the set by
	* @return the last matching attachment
	* @throws com.vportal.portal.NoSuchAttachmentException if a matching attachment could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.vportal.portal.model.Attachment findByEntry_Last(long entryId,
		java.lang.String entryClass,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portal.NoSuchAttachmentException;

	/**
	* Finds the attachments before and after the current attachment in the ordered set where entryId = &#63; and entryClass = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param attachmentId the primary key of the current attachment
	* @param entryId the entry id to search with
	* @param entryClass the entry class to search with
	* @param orderByComparator the comparator to order the set by
	* @return the previous, current, and next attachment
	* @throws com.vportal.portal.NoSuchAttachmentException if a attachment with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.vportal.portal.model.Attachment[] findByEntry_PrevAndNext(
		long attachmentId, long entryId, java.lang.String entryClass,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portal.NoSuchAttachmentException;

	/**
	* Finds the attachment where entryClass = &#63; and folderId = &#63; and fileName = &#63; or throws a {@link com.vportal.portal.NoSuchAttachmentException} if it could not be found.
	*
	* @param entryClass the entry class to search with
	* @param folderId the folder id to search with
	* @param fileName the file name to search with
	* @return the matching attachment
	* @throws com.vportal.portal.NoSuchAttachmentException if a matching attachment could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.vportal.portal.model.Attachment findByC_F_N(
		java.lang.String entryClass, long folderId, java.lang.String fileName)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portal.NoSuchAttachmentException;

	/**
	* Finds the attachment where entryClass = &#63; and folderId = &#63; and fileName = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param entryClass the entry class to search with
	* @param folderId the folder id to search with
	* @param fileName the file name to search with
	* @return the matching attachment, or <code>null</code> if a matching attachment could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.vportal.portal.model.Attachment fetchByC_F_N(
		java.lang.String entryClass, long folderId, java.lang.String fileName)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Finds the attachment where entryClass = &#63; and folderId = &#63; and fileName = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param entryClass the entry class to search with
	* @param folderId the folder id to search with
	* @param fileName the file name to search with
	* @return the matching attachment, or <code>null</code> if a matching attachment could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.vportal.portal.model.Attachment fetchByC_F_N(
		java.lang.String entryClass, long folderId, java.lang.String fileName,
		boolean retrieveFromCache)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Finds all the attachments.
	*
	* @return the attachments
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.vportal.portal.model.Attachment> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Finds a range of all the attachments.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of attachments to return
	* @param end the upper bound of the range of attachments to return (not inclusive)
	* @return the range of attachments
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.vportal.portal.model.Attachment> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Finds an ordered range of all the attachments.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of attachments to return
	* @param end the upper bound of the range of attachments to return (not inclusive)
	* @param orderByComparator the comparator to order the results by
	* @return the ordered range of attachments
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.vportal.portal.model.Attachment> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the attachments where entryId = &#63; and entryClass = &#63; from the database.
	*
	* @param entryId the entry id to search with
	* @param entryClass the entry class to search with
	* @throws SystemException if a system exception occurred
	*/
	public void removeByEntry(long entryId, java.lang.String entryClass)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes the attachment where entryClass = &#63; and folderId = &#63; and fileName = &#63; from the database.
	*
	* @param entryClass the entry class to search with
	* @param folderId the folder id to search with
	* @param fileName the file name to search with
	* @throws SystemException if a system exception occurred
	*/
	public void removeByC_F_N(java.lang.String entryClass, long folderId,
		java.lang.String fileName)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portal.NoSuchAttachmentException;

	/**
	* Removes all the attachments from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Counts all the attachments where entryId = &#63; and entryClass = &#63;.
	*
	* @param entryId the entry id to search with
	* @param entryClass the entry class to search with
	* @return the number of matching attachments
	* @throws SystemException if a system exception occurred
	*/
	public int countByEntry(long entryId, java.lang.String entryClass)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Counts all the attachments where entryClass = &#63; and folderId = &#63; and fileName = &#63;.
	*
	* @param entryClass the entry class to search with
	* @param folderId the folder id to search with
	* @param fileName the file name to search with
	* @return the number of matching attachments
	* @throws SystemException if a system exception occurred
	*/
	public int countByC_F_N(java.lang.String entryClass, long folderId,
		java.lang.String fileName)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Counts all the attachments.
	*
	* @return the number of attachments
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}