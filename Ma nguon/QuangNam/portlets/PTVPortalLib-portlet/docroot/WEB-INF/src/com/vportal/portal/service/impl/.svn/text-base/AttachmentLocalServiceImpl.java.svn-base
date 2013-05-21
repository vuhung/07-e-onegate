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
import com.liferay.portlet.documentlibrary.model.DLFileEntry;
import com.liferay.portlet.imagegallery.model.IGImage;
import com.vportal.portal.model.Attachment;
import com.vportal.portal.model.impl.AttachmentImpl;
import com.vportal.portal.service.base.AttachmentLocalServiceBaseImpl;
import com.vportal.portal.service.persistence.AttachmentFinder;
import com.vportal.portal.service.persistence.AttachmentUtil;
import com.vportal.util.DLUtilExt;

/**
 * The implementation of the attachment local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link com.vportal.portal.service.AttachmentLocalService} interface.
 * </p>
 *
 * <p>
 * Never reference this interface directly. Always use {@link com.vportal.portal.service.AttachmentLocalServiceUtil} to access the attachment local service.
 * </p>
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author HOAN
 * @see com.vportal.portal.service.base.AttachmentLocalServiceBaseImpl
 * @see com.vportal.portal.service.AttachmentLocalServiceUtil
 */
public class AttachmentLocalServiceImpl extends AttachmentLocalServiceBaseImpl {
	public Attachment addAttachment(DLFileEntry entry, long companyId,
			long groupId, long entryId, Class entryClass, long folderId,
			String fileName, byte[] byteArray) throws PortalException,
			SystemException {

		// System.out.println("ADD ATTACHMENT");

		int pos = fileName.lastIndexOf(".");
		String extension = StringPool.BLANK;
		Attachment attachment = new AttachmentImpl();

		if (pos >= 0) {
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
			attachment.setFileEntryId(entry.getFileEntryId());

			AttachmentUtil.update(attachment, false);

		}

		return attachment;
	}

	public Attachment addAttachment(DLFileEntry entry, long companyId,
			long groupId, long entryId, Class entryClass, long folderId,
			String fileName)
			throws PortalException, SystemException {
		long attachmentId = CounterLocalServiceUtil.increment(Attachment.class
				.getName());
		Attachment attachment = AttachmentUtil.create(attachmentId);

		attachment.setCompanyId(companyId);
		attachment.setGroupId(groupId);
		attachment.setEntryId(entryId);
		attachment.setEntryClass(entryClass.getName());
		attachment.setFileName(fileName);
		attachment.setFolderId(folderId);
		attachment.setExtension(fileName.substring(
				fileName.lastIndexOf(".") + 1, fileName.length()));
		attachment.setFileEntryId(entry.getFileEntryId());

		AttachmentUtil.update(attachment, false);

		return attachment;
	}
	
	public Attachment addAttachment(IGImage entry, long companyId,
			long groupId, long entryId, Class entryClass, long folderId,
			String fileName)
			throws PortalException, SystemException {
		long attachmentId = CounterLocalServiceUtil.increment(Attachment.class
				.getName());
		Attachment attachment = AttachmentUtil.create(attachmentId);

		attachment.setCompanyId(companyId);
		attachment.setGroupId(groupId);
		attachment.setEntryId(entryId);
		attachment.setEntryClass(entryClass.getName());
		attachment.setFileName(fileName);
		attachment.setFolderId(folderId);
		attachment.setExtension(fileName.substring(
				fileName.lastIndexOf(".") + 1, fileName.length()));
		attachment.setFileEntryId(entry.getImageId());

		AttachmentUtil.update(attachment, false);

		return attachment;
	}

	public Attachment addAttachment(Class entryClass, long entryId,
			long fileEntryId) throws PortalException, SystemException {
		return addAttachment(entryClass, entryId, fileEntryId, false);

	}

	public Attachment addAttachment(Class entryClass, long entryId,
			long fileId, boolean isImage) throws PortalException,
			SystemException {
		long attachmentId = CounterLocalServiceUtil.increment(Attachment.class
				.getName());
		Attachment attachment = AttachmentUtil.create(attachmentId);

		attachment.setEntryId(entryId);
		attachment.setEntryClass(entryClass.getName());

		if (isImage) {
			attachment.setImageId(fileId);
		} else {
			attachment.setFileEntryId(fileId);
		}
		AttachmentUtil.update(attachment, false);

		return attachment;
	}

	public void deleteAttachment(long attachmentId) throws PortalException,
			SystemException {
		AttachmentUtil.remove(attachmentId);
	}

	public Attachment getAttachment(Class entryClass, long folderId,
			String fileName) throws PortalException, SystemException {

		Attachment attachment = AttachmentUtil.findByC_F_N(
				entryClass.getName(), folderId, fileName);

		return attachment;
	}

	public void deleteAttachments(Class entryClass, long entryId)
			throws PortalException, SystemException {

		if (entryClass == null) {
			return;
		}

		List attachments = AttachmentUtil.findByEntry(entryId, entryClass
				.getName());

		if (attachments == null) {
			return;
		}

		for (int i = 0; i < attachments.size(); i++) {
			Attachment attachment = (Attachment) attachments.get(i);
			deleteAttachment(attachment.getAttachmentId());
		}

	}

	public Attachment getAttachment(long attachmentId) throws PortalException,
			SystemException {

		return AttachmentUtil.findByPrimaryKey(attachmentId);
	}

	public List getAttachments(long entryId, Class entryClass)
			throws PortalException, SystemException {

		if (entryClass == null) {
			return new ArrayList();
		}

		return AttachmentUtil.findByEntry(entryId, entryClass.getName());
	}

	public List getDLFileEntries(Class entryClass, long entryId)
			throws PortalException, SystemException {
		return attachmentFinder.findDLFileEntries(entryClass, entryId);
	}

	public List getIGImages(Class entryClass, long entryId)
			throws PortalException, SystemException {
		return attachmentFinder.findIGImages(entryClass, entryId);
	}
	
}