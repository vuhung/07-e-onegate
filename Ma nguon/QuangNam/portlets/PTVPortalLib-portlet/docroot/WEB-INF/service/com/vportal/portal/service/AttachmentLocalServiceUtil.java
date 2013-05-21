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

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.util.ClassLoaderProxy;

/**
 * The utility for the attachment local service. This utility wraps {@link com.vportal.portal.service.impl.AttachmentLocalServiceImpl} and is the primary access point for service operations in application layer code running on the local server.
 *
 * <p>
 * Never modify this class directly. Add custom service methods to {@link com.vportal.portal.service.impl.AttachmentLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
 * </p>
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author HOAN
 * @see AttachmentLocalService
 * @see com.vportal.portal.service.base.AttachmentLocalServiceBaseImpl
 * @see com.vportal.portal.service.impl.AttachmentLocalServiceImpl
 * @generated
 */
public class AttachmentLocalServiceUtil {
	/**
	* Adds the attachment to the database. Also notifies the appropriate model listeners.
	*
	* @param attachment the attachment to add
	* @return the attachment that was added
	* @throws SystemException if a system exception occurred
	*/
	public static com.vportal.portal.model.Attachment addAttachment(
		com.vportal.portal.model.Attachment attachment)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().addAttachment(attachment);
	}

	/**
	* Creates a new attachment with the primary key. Does not add the attachment to the database.
	*
	* @param attachmentId the primary key for the new attachment
	* @return the new attachment
	*/
	public static com.vportal.portal.model.Attachment createAttachment(
		long attachmentId) {
		return getService().createAttachment(attachmentId);
	}

	/**
	* Deletes the attachment with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param attachmentId the primary key of the attachment to delete
	* @throws PortalException if a attachment with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static void deleteAttachment(long attachmentId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		getService().deleteAttachment(attachmentId);
	}

	/**
	* Deletes the attachment from the database. Also notifies the appropriate model listeners.
	*
	* @param attachment the attachment to delete
	* @throws SystemException if a system exception occurred
	*/
	public static void deleteAttachment(
		com.vportal.portal.model.Attachment attachment)
		throws com.liferay.portal.kernel.exception.SystemException {
		getService().deleteAttachment(attachment);
	}

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query to search with
	* @return the matching rows
	* @throws SystemException if a system exception occurred
	*/
	@SuppressWarnings("rawtypes")
	public static java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().dynamicQuery(dynamicQuery);
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
	public static java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException {
		return getService().dynamicQuery(dynamicQuery, start, end);
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
	public static java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .dynamicQuery(dynamicQuery, start, end, orderByComparator);
	}

	/**
	* Counts the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query to search with
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	public static long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().dynamicQueryCount(dynamicQuery);
	}

	/**
	* Gets the attachment with the primary key.
	*
	* @param attachmentId the primary key of the attachment to get
	* @return the attachment
	* @throws PortalException if a attachment with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.vportal.portal.model.Attachment getAttachment(
		long attachmentId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getAttachment(attachmentId);
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
	public static java.util.List<com.vportal.portal.model.Attachment> getAttachments(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getAttachments(start, end);
	}

	/**
	* Gets the number of attachments.
	*
	* @return the number of attachments
	* @throws SystemException if a system exception occurred
	*/
	public static int getAttachmentsCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getAttachmentsCount();
	}

	/**
	* Updates the attachment in the database. Also notifies the appropriate model listeners.
	*
	* @param attachment the attachment to update
	* @return the attachment that was updated
	* @throws SystemException if a system exception occurred
	*/
	public static com.vportal.portal.model.Attachment updateAttachment(
		com.vportal.portal.model.Attachment attachment)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().updateAttachment(attachment);
	}

	/**
	* Updates the attachment in the database. Also notifies the appropriate model listeners.
	*
	* @param attachment the attachment to update
	* @param merge whether to merge the attachment with the current session. See {@link com.liferay.portal.service.persistence.BatchSession#update(com.liferay.portal.kernel.dao.orm.Session, com.liferay.portal.model.BaseModel, boolean)} for an explanation.
	* @return the attachment that was updated
	* @throws SystemException if a system exception occurred
	*/
	public static com.vportal.portal.model.Attachment updateAttachment(
		com.vportal.portal.model.Attachment attachment, boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().updateAttachment(attachment, merge);
	}

	public static com.vportal.portal.model.Attachment addAttachment(
		com.liferay.portlet.documentlibrary.model.DLFileEntry entry,
		long companyId, long groupId, long entryId, java.lang.Class entryClass,
		long folderId, java.lang.String fileName, byte[] byteArray)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .addAttachment(entry, companyId, groupId, entryId,
			entryClass, folderId, fileName, byteArray);
	}

	public static com.vportal.portal.model.Attachment addAttachment(
		com.liferay.portlet.documentlibrary.model.DLFileEntry entry,
		long companyId, long groupId, long entryId, java.lang.Class entryClass,
		long folderId, java.lang.String fileName)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .addAttachment(entry, companyId, groupId, entryId,
			entryClass, folderId, fileName);
	}

	public static com.vportal.portal.model.Attachment addAttachment(
		com.liferay.portlet.imagegallery.model.IGImage entry, long companyId,
		long groupId, long entryId, java.lang.Class entryClass, long folderId,
		java.lang.String fileName)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .addAttachment(entry, companyId, groupId, entryId,
			entryClass, folderId, fileName);
	}

	public static com.vportal.portal.model.Attachment addAttachment(
		java.lang.Class entryClass, long entryId, long fileEntryId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().addAttachment(entryClass, entryId, fileEntryId);
	}

	public static com.vportal.portal.model.Attachment addAttachment(
		java.lang.Class entryClass, long entryId, long fileId, boolean isImage)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().addAttachment(entryClass, entryId, fileId, isImage);
	}

	public static com.vportal.portal.model.Attachment getAttachment(
		java.lang.Class entryClass, long folderId, java.lang.String fileName)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getAttachment(entryClass, folderId, fileName);
	}

	public static void deleteAttachments(java.lang.Class entryClass,
		long entryId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		getService().deleteAttachments(entryClass, entryId);
	}

	public static java.util.List getAttachments(long entryId,
		java.lang.Class entryClass)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getAttachments(entryId, entryClass);
	}

	public static java.util.List getDLFileEntries(java.lang.Class entryClass,
		long entryId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getDLFileEntries(entryClass, entryId);
	}

	public static java.util.List getIGImages(java.lang.Class entryClass,
		long entryId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getIGImages(entryClass, entryId);
	}

	public static void clearService() {
		_service = null;
	}

	public static AttachmentLocalService getService() {
		if (_service == null) {
			Object obj = PortletBeanLocatorUtil.locate(ClpSerializer.SERVLET_CONTEXT_NAME,
					AttachmentLocalService.class.getName());
			ClassLoader portletClassLoader = (ClassLoader)PortletBeanLocatorUtil.locate(ClpSerializer.SERVLET_CONTEXT_NAME,
					"portletClassLoader");

			ClassLoaderProxy classLoaderProxy = new ClassLoaderProxy(obj,
					portletClassLoader);

			_service = new AttachmentLocalServiceClp(classLoaderProxy);

			ClpSerializer.setClassLoader(portletClassLoader);
		}

		return _service;
	}

	public void setService(AttachmentLocalService service) {
		_service = service;
	}

	private static AttachmentLocalService _service;
}