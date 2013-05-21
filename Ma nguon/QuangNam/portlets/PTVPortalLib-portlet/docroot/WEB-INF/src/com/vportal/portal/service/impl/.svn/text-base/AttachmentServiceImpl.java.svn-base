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

package com.vportal.portal.service.impl;

import java.util.ArrayList;
import java.util.List;

import com.liferay.counter.service.CounterLocalServiceUtil;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.kernel.util.Validator;
import com.vportal.portal.model.Attachment;
import com.vportal.portal.model.impl.AttachmentImpl;
import com.vportal.portal.service.base.AttachmentServiceBaseImpl;
import com.vportal.portal.service.persistence.AttachmentFinder;
import com.vportal.portal.service.persistence.AttachmentUtil;
import com.vportal.util.DLUtilExt;

/**
 * The implementation of the attachment remote service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link com.vportal.portal.service.AttachmentService} interface.
 * </p>
 *
 * <p>
 * Never reference this interface directly. Always use {@link com.vportal.portal.service.AttachmentServiceUtil} to access the attachment remote service.
 * </p>
 *
 * <p>
 * This is a remote service. Methods of this service are expected to have security checks based on the propagated JAAS credentials because this service can be accessed remotely.
 * </p>
 *
 * @author HOAN
 * @see com.vportal.portal.service.base.AttachmentServiceBaseImpl
 * @see com.vportal.portal.service.AttachmentServiceUtil
 */
public class AttachmentServiceImpl extends AttachmentServiceBaseImpl {
	public Attachment addAttachment(long companyId, long groupId, long entryId,
			Class entryClass, long folderId, String fileName, byte[] byteArray)
			throws PortalException, SystemException {

		// System.out.println("ADD ATTACHMENT");

		int pos = fileName.lastIndexOf(".");
		String extension = StringPool.BLANK;
		Attachment attachment = new AttachmentImpl();

		if (pos > 0) {
			extension = fileName.substring(pos + 1);
		}

		// fileName = fileName + extension;

		if (byteArray == null) {
			return attachment;
		}

		// Add file to the repository

		if (DLUtilExt.addFile(companyId, groupId, fileName, byteArray, folderId, null)) {
			long attachmentId = CounterLocalServiceUtil
					.increment(Attachment.class.getName());

			attachment = AttachmentUtil.create(attachmentId);

			attachment.setCompanyId(companyId);
			attachment.setGroupId(groupId);
			attachment.setEntryId(entryId);
			attachment.setEntryClass(entryClass.getName());
			attachment.setFileName(fileName);
			attachment.setFolderId(folderId);
			attachment.setExtension(extension);

			AttachmentUtil.update(attachment, false);

		}

		return attachment;
	}

	public List getAttachments(long entryId, Class entryClass)
			throws PortalException, SystemException {

		if (entryClass == null) {
			return new ArrayList();
		}

		return AttachmentUtil.findByEntry(entryId, entryClass.getName());
	}

	public List searchAttachments(long folderId, String keywords)
			throws PortalException, SystemException {

		if (Validator.isNull(keywords)) {
			return null;
		}

		return attachmentFinder.searchFileEntries(folderId, keywords);
	}

	public void deleteAttachment(long attachmentId, long companyId)
			throws PortalException, SystemException {
		Attachment attachment = AttachmentUtil.findByPrimaryKey(attachmentId);

		String fileName = attachment.getFileName();
		// Delete the file entry off the repositories first
		if (DLUtilExt.deleteFile(companyId, fileName)) {
			// Delete the attachment entry
			AttachmentUtil.remove(attachmentId);
		}
	}

	public void deleteAttachments(Class entryClass, long entryId)
			throws PortalException, SystemException {

		attachmentLocalService.deleteAttachments(entryClass, entryId);

	}
}