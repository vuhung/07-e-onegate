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

package com.vportal.portal.service;

/**
 * <p>
 * This class is a wrapper for {@link AttachmentLocalService}.
 * </p>
 *
 * @author    HOAN
 * @see       AttachmentLocalService
 * @generated
 */
public class AttachmentLocalServiceWrapper implements AttachmentLocalService {
	public AttachmentLocalServiceWrapper(
		AttachmentLocalService attachmentLocalService) {
		_attachmentLocalService = attachmentLocalService;
	}

	/**
	* Adds the attachment to the database. Also notifies the appropriate model listeners.
	*
	* @param attachment the attachment to add
	* @return the attachment that was added
	* @throws SystemException if a system exception occurred
	*/
	public com.vportal.portal.model.Attachment addAttachment(
		com.vportal.portal.model.Attachment attachment)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _attachmentLocalService.addAttachment(attachment);
	}

	/**
	* Creates a new attachment with the primary key. Does not add the attachment to the database.
	*
	* @param attachmentId the primary key for the new attachment
	* @return the new attachment
	*/
	public com.vportal.portal.model.Attachment createAttachment(
		long attachmentId) {
		return _attachmentLocalService.createAttachment(attachmentId);
	}

	/**
	* Deletes the attachment with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param attachmentId the primary key of the attachment to delete
	* @throws PortalException if a attachment with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public void deleteAttachment(long attachmentId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		_attachmentLocalService.deleteAttachment(attachmentId);
	}

	/**
	* Deletes the attachment from the database. Also notifies the appropriate model listeners.
	*
	* @param attachment the attachment to delete
	* @throws SystemException if a system exception occurred
	*/
	public void deleteAttachment(com.vportal.portal.model.Attachment attachment)
		throws com.liferay.portal.kernel.exception.SystemException {
		_attachmentLocalService.deleteAttachment(attachment);
	}

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query to search with
	* @return the matching rows
	* @throws SystemException if a system exception occurred
	*/
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _attachmentLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param dynamicQuery the dynamic query to search with
	* @param start the lower bound of the range of model instances to return
	* @param end the upper bound of the range of model instances to return (not inclusive)
	* @return the range of matching rows
	* @throws SystemException if a system exception occurred
	*/
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException {
		return _attachmentLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param dynamicQuery the dynamic query to search with
	* @param start the lower bound of the range of model instances to return
	* @param end the upper bound of the range of model instances to return (not inclusive)
	* @param orderByComparator the comparator to order the results by
	* @return the ordered range of matching rows
	* @throws SystemException if a system exception occurred
	*/
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _attachmentLocalService.dynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	* Counts the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query to search with
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _attachmentLocalService.dynamicQueryCount(dynamicQuery);
	}

	/**
	* Gets the attachment with the primary key.
	*
	* @param attachmentId the primary key of the attachment to get
	* @return the attachment
	* @throws PortalException if a attachment with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.vportal.portal.model.Attachment getAttachment(long attachmentId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _attachmentLocalService.getAttachment(attachmentId);
	}

	/**
	* Gets a range of all the attachments.
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
	public java.util.List<com.vportal.portal.model.Attachment> getAttachments(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _attachmentLocalService.getAttachments(start, end);
	}

	/**
	* Gets the number of attachments.
	*
	* @return the number of attachments
	* @throws SystemException if a system exception occurred
	*/
	public int getAttachmentsCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _attachmentLocalService.getAttachmentsCount();
	}

	/**
	* Updates the attachment in the database. Also notifies the appropriate model listeners.
	*
	* @param attachment the attachment to update
	* @return the attachment that was updated
	* @throws SystemException if a system exception occurred
	*/
	public com.vportal.portal.model.Attachment updateAttachment(
		com.vportal.portal.model.Attachment attachment)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _attachmentLocalService.updateAttachment(attachment);
	}

	/**
	* Updates the attachment in the database. Also notifies the appropriate model listeners.
	*
	* @param attachment the attachment to update
	* @param merge whether to merge the attachment with the current session. See {@link com.liferay.portal.service.persistence.BatchSession#update(com.liferay.portal.kernel.dao.orm.Session, com.liferay.portal.model.BaseModel, boolean)} for an explanation.
	* @return the attachment that was updated
	* @throws SystemException if a system exception occurred
	*/
	public com.vportal.portal.model.Attachment updateAttachment(
		com.vportal.portal.model.Attachment attachment, boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _attachmentLocalService.updateAttachment(attachment, merge);
	}

	public com.vportal.portal.model.Attachment addAttachment(
		com.liferay.portlet.documentlibrary.model.DLFileEntry entry,
		long companyId, long groupId, long entryId, java.lang.Class entryClass,
		long folderId, java.lang.String fileName, byte[] byteArray)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _attachmentLocalService.addAttachment(entry, companyId, groupId,
			entryId, entryClass, folderId, fileName, byteArray);
	}

	public com.vportal.portal.model.Attachment addAttachment(
		com.liferay.portlet.documentlibrary.model.DLFileEntry entry,
		long companyId, long groupId, long entryId, java.lang.Class entryClass,
		long folderId, java.lang.String fileName)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _attachmentLocalService.addAttachment(entry, companyId, groupId,
			entryId, entryClass, folderId, fileName);
	}

	public com.vportal.portal.model.Attachment addAttachment(
		com.liferay.portlet.imagegallery.model.IGImage entry, long companyId,
		long groupId, long entryId, java.lang.Class entryClass, long folderId,
		java.lang.String fileName)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _attachmentLocalService.addAttachment(entry, companyId, groupId,
			entryId, entryClass, folderId, fileName);
	}

	public com.vportal.portal.model.Attachment addAttachment(
		java.lang.Class entryClass, long entryId, long fileEntryId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _attachmentLocalService.addAttachment(entryClass, entryId,
			fileEntryId);
	}

	public com.vportal.portal.model.Attachment addAttachment(
		java.lang.Class entryClass, long entryId, long fileId, boolean isImage)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _attachmentLocalService.addAttachment(entryClass, entryId,
			fileId, isImage);
	}

	public com.vportal.portal.model.Attachment getAttachment(
		java.lang.Class entryClass, long folderId, java.lang.String fileName)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _attachmentLocalService.getAttachment(entryClass, folderId,
			fileName);
	}

	public void deleteAttachments(java.lang.Class entryClass, long entryId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		_attachmentLocalService.deleteAttachments(entryClass, entryId);
	}

	public java.util.List getAttachments(long entryId,
		java.lang.Class entryClass)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _attachmentLocalService.getAttachments(entryId, entryClass);
	}

	public java.util.List getDLFileEntries(java.lang.Class entryClass,
		long entryId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _attachmentLocalService.getDLFileEntries(entryClass, entryId);
	}

	public java.util.List getIGImages(java.lang.Class entryClass, long entryId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _attachmentLocalService.getIGImages(entryClass, entryId);
	}

	public AttachmentLocalService getWrappedAttachmentLocalService() {
		return _attachmentLocalService;
	}

	private AttachmentLocalService _attachmentLocalService;
}