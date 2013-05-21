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

package com.vportal.portal.model;

/**
 * <p>
 * This class is a wrapper for {@link Attachment}.
 * </p>
 *
 * @author    HOAN
 * @see       Attachment
 * @generated
 */
public class AttachmentWrapper implements Attachment {
	public AttachmentWrapper(Attachment attachment) {
		_attachment = attachment;
	}

	public long getPrimaryKey() {
		return _attachment.getPrimaryKey();
	}

	public void setPrimaryKey(long pk) {
		_attachment.setPrimaryKey(pk);
	}

	public long getAttachmentId() {
		return _attachment.getAttachmentId();
	}

	public void setAttachmentId(long attachmentId) {
		_attachment.setAttachmentId(attachmentId);
	}

	public long getGroupId() {
		return _attachment.getGroupId();
	}

	public void setGroupId(long groupId) {
		_attachment.setGroupId(groupId);
	}

	public long getCompanyId() {
		return _attachment.getCompanyId();
	}

	public void setCompanyId(long companyId) {
		_attachment.setCompanyId(companyId);
	}

	public long getEntryId() {
		return _attachment.getEntryId();
	}

	public void setEntryId(long entryId) {
		_attachment.setEntryId(entryId);
	}

	public java.lang.String getEntryClass() {
		return _attachment.getEntryClass();
	}

	public void setEntryClass(java.lang.String entryClass) {
		_attachment.setEntryClass(entryClass);
	}

	public long getFileEntryId() {
		return _attachment.getFileEntryId();
	}

	public void setFileEntryId(long fileEntryId) {
		_attachment.setFileEntryId(fileEntryId);
	}

	public long getFolderId() {
		return _attachment.getFolderId();
	}

	public void setFolderId(long folderId) {
		_attachment.setFolderId(folderId);
	}

	public java.lang.String getFileName() {
		return _attachment.getFileName();
	}

	public void setFileName(java.lang.String fileName) {
		_attachment.setFileName(fileName);
	}

	public long getImageId() {
		return _attachment.getImageId();
	}

	public void setImageId(long imageId) {
		_attachment.setImageId(imageId);
	}

	public java.lang.String getExtension() {
		return _attachment.getExtension();
	}

	public void setExtension(java.lang.String extension) {
		_attachment.setExtension(extension);
	}

	public com.vportal.portal.model.Attachment toEscapedModel() {
		return _attachment.toEscapedModel();
	}

	public boolean isNew() {
		return _attachment.isNew();
	}

	public void setNew(boolean n) {
		_attachment.setNew(n);
	}

	public boolean isCachedModel() {
		return _attachment.isCachedModel();
	}

	public void setCachedModel(boolean cachedModel) {
		_attachment.setCachedModel(cachedModel);
	}

	public boolean isEscapedModel() {
		return _attachment.isEscapedModel();
	}

	public void setEscapedModel(boolean escapedModel) {
		_attachment.setEscapedModel(escapedModel);
	}

	public java.io.Serializable getPrimaryKeyObj() {
		return _attachment.getPrimaryKeyObj();
	}

	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _attachment.getExpandoBridge();
	}

	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_attachment.setExpandoBridgeAttributes(serviceContext);
	}

	public java.lang.Object clone() {
		return _attachment.clone();
	}

	public int compareTo(com.vportal.portal.model.Attachment attachment) {
		return _attachment.compareTo(attachment);
	}

	public int hashCode() {
		return _attachment.hashCode();
	}

	public java.lang.String toString() {
		return _attachment.toString();
	}

	public java.lang.String toXmlString() {
		return _attachment.toXmlString();
	}

	public Attachment getWrappedAttachment() {
		return _attachment;
	}

	private Attachment _attachment;
}