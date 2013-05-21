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
 * This class is a wrapper for {@link VLegalSigner}.
 * </p>
 *
 * @author    ACB
 * @see       VLegalSigner
 * @generated
 */
public class VLegalSignerWrapper implements VLegalSigner {
	public VLegalSignerWrapper(VLegalSigner vLegalSigner) {
		_vLegalSigner = vLegalSigner;
	}

	public java.lang.String getPrimaryKey() {
		return _vLegalSigner.getPrimaryKey();
	}

	public void setPrimaryKey(java.lang.String pk) {
		_vLegalSigner.setPrimaryKey(pk);
	}

	public java.lang.String getSigId() {
		return _vLegalSigner.getSigId();
	}

	public void setSigId(java.lang.String sigId) {
		_vLegalSigner.setSigId(sigId);
	}

	public long getGroupId() {
		return _vLegalSigner.getGroupId();
	}

	public void setGroupId(long groupId) {
		_vLegalSigner.setGroupId(groupId);
	}

	public long getCompanyId() {
		return _vLegalSigner.getCompanyId();
	}

	public void setCompanyId(long companyId) {
		_vLegalSigner.setCompanyId(companyId);
	}

	public long getUserId() {
		return _vLegalSigner.getUserId();
	}

	public void setUserId(long userId) {
		_vLegalSigner.setUserId(userId);
	}

	public java.lang.String getUserUuid()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _vLegalSigner.getUserUuid();
	}

	public void setUserUuid(java.lang.String userUuid) {
		_vLegalSigner.setUserUuid(userUuid);
	}

	public java.util.Date getCreatedDate() {
		return _vLegalSigner.getCreatedDate();
	}

	public void setCreatedDate(java.util.Date createdDate) {
		_vLegalSigner.setCreatedDate(createdDate);
	}

	public java.util.Date getModifiedDate() {
		return _vLegalSigner.getModifiedDate();
	}

	public void setModifiedDate(java.util.Date modifiedDate) {
		_vLegalSigner.setModifiedDate(modifiedDate);
	}

	public long getCreatedByUser() {
		return _vLegalSigner.getCreatedByUser();
	}

	public void setCreatedByUser(long createdByUser) {
		_vLegalSigner.setCreatedByUser(createdByUser);
	}

	public long getModifiedByUser() {
		return _vLegalSigner.getModifiedByUser();
	}

	public void setModifiedByUser(long modifiedByUser) {
		_vLegalSigner.setModifiedByUser(modifiedByUser);
	}

	public java.lang.String getFirstName() {
		return _vLegalSigner.getFirstName();
	}

	public void setFirstName(java.lang.String firstName) {
		_vLegalSigner.setFirstName(firstName);
	}

	public java.lang.String getLastName() {
		return _vLegalSigner.getLastName();
	}

	public void setLastName(java.lang.String lastName) {
		_vLegalSigner.setLastName(lastName);
	}

	public java.lang.String getLanguage() {
		return _vLegalSigner.getLanguage();
	}

	public void setLanguage(java.lang.String language) {
		_vLegalSigner.setLanguage(language);
	}

	public boolean getStatusSigner() {
		return _vLegalSigner.getStatusSigner();
	}

	public boolean isStatusSigner() {
		return _vLegalSigner.isStatusSigner();
	}

	public void setStatusSigner(boolean statusSigner) {
		_vLegalSigner.setStatusSigner(statusSigner);
	}

	public VLegalSigner toEscapedModel() {
		return _vLegalSigner.toEscapedModel();
	}

	public boolean isNew() {
		return _vLegalSigner.isNew();
	}

	public void setNew(boolean n) {
		_vLegalSigner.setNew(n);
	}

	public boolean isCachedModel() {
		return _vLegalSigner.isCachedModel();
	}

	public void setCachedModel(boolean cachedModel) {
		_vLegalSigner.setCachedModel(cachedModel);
	}

	public boolean isEscapedModel() {
		return _vLegalSigner.isEscapedModel();
	}

	public void setEscapedModel(boolean escapedModel) {
		_vLegalSigner.setEscapedModel(escapedModel);
	}

	public java.io.Serializable getPrimaryKeyObj() {
		return _vLegalSigner.getPrimaryKeyObj();
	}

	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _vLegalSigner.getExpandoBridge();
	}

	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_vLegalSigner.setExpandoBridgeAttributes(serviceContext);
	}

	public java.lang.Object clone() {
		return _vLegalSigner.clone();
	}

	public int compareTo(VLegalSigner vLegalSigner) {
		return _vLegalSigner.compareTo(vLegalSigner);
	}

	public int hashCode() {
		return _vLegalSigner.hashCode();
	}

	public java.lang.String toString() {
		return _vLegalSigner.toString();
	}

	public java.lang.String toXmlString() {
		return _vLegalSigner.toXmlString();
	}

	public VLegalSigner getWrappedVLegalSigner() {
		return _vLegalSigner;
	}

	private VLegalSigner _vLegalSigner;
}