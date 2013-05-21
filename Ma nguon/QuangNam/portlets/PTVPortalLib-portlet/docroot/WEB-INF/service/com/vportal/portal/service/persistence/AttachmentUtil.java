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

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.service.ServiceContext;

import com.vportal.portal.model.Attachment;

import java.util.List;

/**
 * The persistence utility for the attachment service. This utility wraps {@link AttachmentPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Never modify this class directly. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
 * </p>
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author HOAN
 * @see AttachmentPersistence
 * @see AttachmentPersistenceImpl
 * @generated
 */
public class AttachmentUtil {
	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#clearCache()
	 */
	public static void clearCache() {
		getPersistence().clearCache();
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#clearCache(com.liferay.portal.model.BaseModel)
	 */
	public static void clearCache(Attachment attachment) {
		getPersistence().clearCache(attachment);
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
	public static List<Attachment> findWithDynamicQuery(
		DynamicQuery dynamicQuery) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<Attachment> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<Attachment> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#remove(com.liferay.portal.model.BaseModel)
	 */
	public static Attachment remove(Attachment attachment)
		throws SystemException {
		return getPersistence().remove(attachment);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, boolean)
	 */
	public static Attachment update(Attachment attachment, boolean merge)
		throws SystemException {
		return getPersistence().update(attachment, merge);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, boolean, ServiceContext)
	 */
	public static Attachment update(Attachment attachment, boolean merge,
		ServiceContext serviceContext) throws SystemException {
		return getPersistence().update(attachment, merge, serviceContext);
	}

	/**
	* Caches the attachment in the entity cache if it is enabled.
	*
	* @param attachment the attachment to cache
	*/
	public static void cacheResult(
		com.vportal.portal.model.Attachment attachment) {
		getPersistence().cacheResult(attachment);
	}

	/**
	* Caches the attachments in the entity cache if it is enabled.
	*
	* @param attachments the attachments to cache
	*/
	public static void cacheResult(
		java.util.List<com.vportal.portal.model.Attachment> attachments) {
		getPersistence().cacheResult(attachments);
	}

	/**
	* Creates a new attachment with the primary key. Does not add the attachment to the database.
	*
	* @param attachmentId the primary key for the new attachment
	* @return the new attachment
	*/
	public static com.vportal.portal.model.Attachment create(long attachmentId) {
		return getPersistence().create(attachmentId);
	}

	/**
	* Removes the attachment with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param attachmentId the primary key of the attachment to remove
	* @return the attachment that was removed
	* @throws com.vportal.portal.NoSuchAttachmentException if a attachment with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.vportal.portal.model.Attachment remove(long attachmentId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portal.NoSuchAttachmentException {
		return getPersistence().remove(attachmentId);
	}

	public static com.vportal.portal.model.Attachment updateImpl(
		com.vportal.portal.model.Attachment attachment, boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(attachment, merge);
	}

	/**
	* Finds the attachment with the primary key or throws a {@link com.vportal.portal.NoSuchAttachmentException} if it could not be found.
	*
	* @param attachmentId the primary key of the attachment to find
	* @return the attachment
	* @throws com.vportal.portal.NoSuchAttachmentException if a attachment with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.vportal.portal.model.Attachment findByPrimaryKey(
		long attachmentId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portal.NoSuchAttachmentException {
		return getPersistence().findByPrimaryKey(attachmentId);
	}

	/**
	* Finds the attachment with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param attachmentId the primary key of the attachment to find
	* @return the attachment, or <code>null</code> if a attachment with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.vportal.portal.model.Attachment fetchByPrimaryKey(
		long attachmentId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(attachmentId);
	}

	/**
	* Finds all the attachments where entryId = &#63; and entryClass = &#63;.
	*
	* @param entryId the entry id to search with
	* @param entryClass the entry class to search with
	* @return the matching attachments
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.vportal.portal.model.Attachment> findByEntry(
		long entryId, java.lang.String entryClass)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByEntry(entryId, entryClass);
	}

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
	public static java.util.List<com.vportal.portal.model.Attachment> findByEntry(
		long entryId, java.lang.String entryClass, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByEntry(entryId, entryClass, start, end);
	}

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
	public static java.util.List<com.vportal.portal.model.Attachment> findByEntry(
		long entryId, java.lang.String entryClass, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByEntry(entryId, entryClass, start, end,
			orderByComparator);
	}

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
	public static com.vportal.portal.model.Attachment findByEntry_First(
		long entryId, java.lang.String entryClass,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portal.NoSuchAttachmentException {
		return getPersistence()
				   .findByEntry_First(entryId, entryClass, orderByComparator);
	}

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
	public static com.vportal.portal.model.Attachment findByEntry_Last(
		long entryId, java.lang.String entryClass,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portal.NoSuchAttachmentException {
		return getPersistence()
				   .findByEntry_Last(entryId, entryClass, orderByComparator);
	}

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
	public static com.vportal.portal.model.Attachment[] findByEntry_PrevAndNext(
		long attachmentId, long entryId, java.lang.String entryClass,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portal.NoSuchAttachmentException {
		return getPersistence()
				   .findByEntry_PrevAndNext(attachmentId, entryId, entryClass,
			orderByComparator);
	}

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
	public static com.vportal.portal.model.Attachment findByC_F_N(
		java.lang.String entryClass, long folderId, java.lang.String fileName)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portal.NoSuchAttachmentException {
		return getPersistence().findByC_F_N(entryClass, folderId, fileName);
	}

	/**
	* Finds the attachment where entryClass = &#63; and folderId = &#63; and fileName = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param entryClass the entry class to search with
	* @param folderId the folder id to search with
	* @param fileName the file name to search with
	* @return the matching attachment, or <code>null</code> if a matching attachment could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.vportal.portal.model.Attachment fetchByC_F_N(
		java.lang.String entryClass, long folderId, java.lang.String fileName)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByC_F_N(entryClass, folderId, fileName);
	}

	/**
	* Finds the attachment where entryClass = &#63; and folderId = &#63; and fileName = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param entryClass the entry class to search with
	* @param folderId the folder id to search with
	* @param fileName the file name to search with
	* @return the matching attachment, or <code>null</code> if a matching attachment could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.vportal.portal.model.Attachment fetchByC_F_N(
		java.lang.String entryClass, long folderId, java.lang.String fileName,
		boolean retrieveFromCache)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByC_F_N(entryClass, folderId, fileName,
			retrieveFromCache);
	}

	/**
	* Finds all the attachments.
	*
	* @return the attachments
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.vportal.portal.model.Attachment> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
	}

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
	public static java.util.List<com.vportal.portal.model.Attachment> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

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
	public static java.util.List<com.vportal.portal.model.Attachment> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the attachments where entryId = &#63; and entryClass = &#63; from the database.
	*
	* @param entryId the entry id to search with
	* @param entryClass the entry class to search with
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByEntry(long entryId, java.lang.String entryClass)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByEntry(entryId, entryClass);
	}

	/**
	* Removes the attachment where entryClass = &#63; and folderId = &#63; and fileName = &#63; from the database.
	*
	* @param entryClass the entry class to search with
	* @param folderId the folder id to search with
	* @param fileName the file name to search with
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByC_F_N(java.lang.String entryClass,
		long folderId, java.lang.String fileName)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portal.NoSuchAttachmentException {
		getPersistence().removeByC_F_N(entryClass, folderId, fileName);
	}

	/**
	* Removes all the attachments from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Counts all the attachments where entryId = &#63; and entryClass = &#63;.
	*
	* @param entryId the entry id to search with
	* @param entryClass the entry class to search with
	* @return the number of matching attachments
	* @throws SystemException if a system exception occurred
	*/
	public static int countByEntry(long entryId, java.lang.String entryClass)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByEntry(entryId, entryClass);
	}

	/**
	* Counts all the attachments where entryClass = &#63; and folderId = &#63; and fileName = &#63;.
	*
	* @param entryClass the entry class to search with
	* @param folderId the folder id to search with
	* @param fileName the file name to search with
	* @return the number of matching attachments
	* @throws SystemException if a system exception occurred
	*/
	public static int countByC_F_N(java.lang.String entryClass, long folderId,
		java.lang.String fileName)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByC_F_N(entryClass, folderId, fileName);
	}

	/**
	* Counts all the attachments.
	*
	* @return the number of attachments
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static AttachmentPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (AttachmentPersistence)PortletBeanLocatorUtil.locate(com.vportal.portal.service.ClpSerializer.SERVLET_CONTEXT_NAME,
					AttachmentPersistence.class.getName());
		}

		return _persistence;
	}

	public void setPersistence(AttachmentPersistence persistence) {
		_persistence = persistence;
	}

	private static AttachmentPersistence _persistence;
}