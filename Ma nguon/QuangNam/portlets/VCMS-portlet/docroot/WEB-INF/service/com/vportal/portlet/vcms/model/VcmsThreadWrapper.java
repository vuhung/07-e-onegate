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

package com.vportal.portlet.vcms.model;

/**
 * <p>
 * This class is a wrapper for {@link VcmsThread}.
 * </p>
 *
 * @author    HOAN
 * @see       VcmsThread
 * @generated
 */
public class VcmsThreadWrapper implements VcmsThread {
	public VcmsThreadWrapper(VcmsThread vcmsThread) {
		_vcmsThread = vcmsThread;
	}

	public java.lang.String getPrimaryKey() {
		return _vcmsThread.getPrimaryKey();
	}

	public void setPrimaryKey(java.lang.String pk) {
		_vcmsThread.setPrimaryKey(pk);
	}

	public java.lang.String getThreadId() {
		return _vcmsThread.getThreadId();
	}

	public void setThreadId(java.lang.String threadId) {
		_vcmsThread.setThreadId(threadId);
	}

	public long getGroupId() {
		return _vcmsThread.getGroupId();
	}

	public void setGroupId(long groupId) {
		_vcmsThread.setGroupId(groupId);
	}

	public long getCompanyId() {
		return _vcmsThread.getCompanyId();
	}

	public void setCompanyId(long companyId) {
		_vcmsThread.setCompanyId(companyId);
	}

	public java.util.Date getCreatedDate() {
		return _vcmsThread.getCreatedDate();
	}

	public void setCreatedDate(java.util.Date createdDate) {
		_vcmsThread.setCreatedDate(createdDate);
	}

	public java.lang.String getCreatedByUser() {
		return _vcmsThread.getCreatedByUser();
	}

	public void setCreatedByUser(java.lang.String createdByUser) {
		_vcmsThread.setCreatedByUser(createdByUser);
	}

	public java.util.Date getModifiedDate() {
		return _vcmsThread.getModifiedDate();
	}

	public void setModifiedDate(java.util.Date modifiedDate) {
		_vcmsThread.setModifiedDate(modifiedDate);
	}

	public java.lang.String getModifiedByUser() {
		return _vcmsThread.getModifiedByUser();
	}

	public void setModifiedByUser(java.lang.String modifiedByUser) {
		_vcmsThread.setModifiedByUser(modifiedByUser);
	}

	public java.lang.String getTitle() {
		return _vcmsThread.getTitle();
	}

	public void setTitle(java.lang.String title) {
		_vcmsThread.setTitle(title);
	}

	public java.lang.String getDescription() {
		return _vcmsThread.getDescription();
	}

	public void setDescription(java.lang.String description) {
		_vcmsThread.setDescription(description);
	}

	public boolean getHasImage() {
		return _vcmsThread.getHasImage();
	}

	public boolean isHasImage() {
		return _vcmsThread.isHasImage();
	}

	public void setHasImage(boolean hasImage) {
		_vcmsThread.setHasImage(hasImage);
	}

	public java.lang.String getImage() {
		return _vcmsThread.getImage();
	}

	public void setImage(java.lang.String image) {
		_vcmsThread.setImage(image);
	}

	public java.lang.String getLanguage() {
		return _vcmsThread.getLanguage();
	}

	public void setLanguage(java.lang.String language) {
		_vcmsThread.setLanguage(language);
	}

	public VcmsThread toEscapedModel() {
		return _vcmsThread.toEscapedModel();
	}

	public boolean isNew() {
		return _vcmsThread.isNew();
	}

	public void setNew(boolean n) {
		_vcmsThread.setNew(n);
	}

	public boolean isCachedModel() {
		return _vcmsThread.isCachedModel();
	}

	public void setCachedModel(boolean cachedModel) {
		_vcmsThread.setCachedModel(cachedModel);
	}

	public boolean isEscapedModel() {
		return _vcmsThread.isEscapedModel();
	}

	public void setEscapedModel(boolean escapedModel) {
		_vcmsThread.setEscapedModel(escapedModel);
	}

	public java.io.Serializable getPrimaryKeyObj() {
		return _vcmsThread.getPrimaryKeyObj();
	}

	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _vcmsThread.getExpandoBridge();
	}

	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_vcmsThread.setExpandoBridgeAttributes(serviceContext);
	}

	public java.lang.Object clone() {
		return _vcmsThread.clone();
	}

	public int compareTo(VcmsThread vcmsThread) {
		return _vcmsThread.compareTo(vcmsThread);
	}

	public int hashCode() {
		return _vcmsThread.hashCode();
	}

	public java.lang.String toString() {
		return _vcmsThread.toString();
	}

	public java.lang.String toXmlString() {
		return _vcmsThread.toXmlString();
	}

	public VcmsThread getWrappedVcmsThread() {
		return _vcmsThread;
	}

	private VcmsThread _vcmsThread;
}