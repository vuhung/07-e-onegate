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
 * This class is a wrapper for {@link AttachmentService}.
 * </p>
 *
 * @author    HOAN
 * @see       AttachmentService
 * @generated
 */
public class AttachmentServiceWrapper implements AttachmentService {
	public AttachmentServiceWrapper(AttachmentService attachmentService) {
		_attachmentService = attachmentService;
	}

	public com.vportal.portal.model.Attachment addAttachment(long companyId,
		long groupId, long entryId, java.lang.Class entryClass, long folderId,
		java.lang.String fileName, byte[] byteArray)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _attachmentService.addAttachment(companyId, groupId, entryId,
			entryClass, folderId, fileName, byteArray);
	}

	public java.util.List getAttachments(long entryId,
		java.lang.Class entryClass)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _attachmentService.getAttachments(entryId, entryClass);
	}

	public java.util.List searchAttachments(long folderId,
		java.lang.String keywords)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _attachmentService.searchAttachments(folderId, keywords);
	}

	public void deleteAttachment(long attachmentId, long companyId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		_attachmentService.deleteAttachment(attachmentId, companyId);
	}

	public void deleteAttachments(java.lang.Class entryClass, long entryId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		_attachmentService.deleteAttachments(entryClass, entryId);
	}

	public AttachmentService getWrappedAttachmentService() {
		return _attachmentService;
	}

	private AttachmentService _attachmentService;
}