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

package com.vportal.portlet.vlegal.model;

/**
 * <p>
 * This class is a wrapper for {@link VLegalTags}.
 * </p>
 *
 * @author    ACB
 * @see       VLegalTags
 * @generated
 */
public class VLegalTagsWrapper implements VLegalTags {
	public VLegalTagsWrapper(VLegalTags vLegalTags) {
		_vLegalTags = vLegalTags;
	}

	public java.lang.String getPrimaryKey() {
		return _vLegalTags.getPrimaryKey();
	}

	public void setPrimaryKey(java.lang.String pk) {
		_vLegalTags.setPrimaryKey(pk);
	}

	public java.lang.String getTagId() {
		return _vLegalTags.getTagId();
	}

	public void setTagId(java.lang.String tagId) {
		_vLegalTags.setTagId(tagId);
	}

	public long getGroupId() {
		return _vLegalTags.getGroupId();
	}

	public void setGroupId(long groupId) {
		_vLegalTags.setGroupId(groupId);
	}

	public long getCompanyId() {
		return _vLegalTags.getCompanyId();
	}

	public void setCompanyId(long companyId) {
		_vLegalTags.setCompanyId(companyId);
	}

	public long getUserId() {
		return _vLegalTags.getUserId();
	}

	public void setUserId(long userId) {
		_vLegalTags.setUserId(userId);
	}

	public java.lang.String getUserUuid()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _vLegalTags.getUserUuid();
	}

	public void setUserUuid(java.lang.String userUuid) {
		_vLegalTags.setUserUuid(userUuid);
	}

	public java.util.Date getCreatedDate() {
		return _vLegalTags.getCreatedDate();
	}

	public void setCreatedDate(java.util.Date createdDate) {
		_vLegalTags.setCreatedDate(createdDate);
	}

	public java.util.Date getModifiedDate() {
		return _vLegalTags.getModifiedDate();
	}

	public void setModifiedDate(java.util.Date modifiedDate) {
		_vLegalTags.setModifiedDate(modifiedDate);
	}

	public java.lang.String getName() {
		return _vLegalTags.getName();
	}

	public void setName(java.lang.String name) {
		_vLegalTags.setName(name);
	}

	public boolean getStatusTags() {
		return _vLegalTags.getStatusTags();
	}

	public boolean isStatusTags() {
		return _vLegalTags.isStatusTags();
	}

	public void setStatusTags(boolean statusTags) {
		_vLegalTags.setStatusTags(statusTags);
	}

	public VLegalTags toEscapedModel() {
		return _vLegalTags.toEscapedModel();
	}

	public boolean isNew() {
		return _vLegalTags.isNew();
	}

	public void setNew(boolean n) {
		_vLegalTags.setNew(n);
	}

	public boolean isCachedModel() {
		return _vLegalTags.isCachedModel();
	}

	public void setCachedModel(boolean cachedModel) {
		_vLegalTags.setCachedModel(cachedModel);
	}

	public boolean isEscapedModel() {
		return _vLegalTags.isEscapedModel();
	}

	public void setEscapedModel(boolean escapedModel) {
		_vLegalTags.setEscapedModel(escapedModel);
	}

	public java.io.Serializable getPrimaryKeyObj() {
		return _vLegalTags.getPrimaryKeyObj();
	}

	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _vLegalTags.getExpandoBridge();
	}

	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_vLegalTags.setExpandoBridgeAttributes(serviceContext);
	}

	public java.lang.Object clone() {
		return _vLegalTags.clone();
	}

	public int compareTo(VLegalTags vLegalTags) {
		return _vLegalTags.compareTo(vLegalTags);
	}

	public int hashCode() {
		return _vLegalTags.hashCode();
	}

	public java.lang.String toString() {
		return _vLegalTags.toString();
	}

	public java.lang.String toXmlString() {
		return _vLegalTags.toXmlString();
	}

	public VLegalTags getWrappedVLegalTags() {
		return _vLegalTags;
	}

	private VLegalTags _vLegalTags;
}