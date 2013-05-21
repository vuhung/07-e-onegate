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
 * This class is a wrapper for {@link VcmsPortion}.
 * </p>
 *
 * @author    HOAN
 * @see       VcmsPortion
 * @generated
 */
public class VcmsPortionWrapper implements VcmsPortion {
	public VcmsPortionWrapper(VcmsPortion vcmsPortion) {
		_vcmsPortion = vcmsPortion;
	}

	public java.lang.String getPrimaryKey() {
		return _vcmsPortion.getPrimaryKey();
	}

	public void setPrimaryKey(java.lang.String pk) {
		_vcmsPortion.setPrimaryKey(pk);
	}

	public java.lang.String getPortionId() {
		return _vcmsPortion.getPortionId();
	}

	public void setPortionId(java.lang.String portionId) {
		_vcmsPortion.setPortionId(portionId);
	}

	public long getGroupId() {
		return _vcmsPortion.getGroupId();
	}

	public void setGroupId(long groupId) {
		_vcmsPortion.setGroupId(groupId);
	}

	public long getCompanyId() {
		return _vcmsPortion.getCompanyId();
	}

	public void setCompanyId(long companyId) {
		_vcmsPortion.setCompanyId(companyId);
	}

	public java.util.Date getCreatedDate() {
		return _vcmsPortion.getCreatedDate();
	}

	public void setCreatedDate(java.util.Date createdDate) {
		_vcmsPortion.setCreatedDate(createdDate);
	}

	public java.lang.String getCreatedByUser() {
		return _vcmsPortion.getCreatedByUser();
	}

	public void setCreatedByUser(java.lang.String createdByUser) {
		_vcmsPortion.setCreatedByUser(createdByUser);
	}

	public java.util.Date getModifiedDate() {
		return _vcmsPortion.getModifiedDate();
	}

	public void setModifiedDate(java.util.Date modifiedDate) {
		_vcmsPortion.setModifiedDate(modifiedDate);
	}

	public java.lang.String getModifiedByUser() {
		return _vcmsPortion.getModifiedByUser();
	}

	public void setModifiedByUser(java.lang.String modifiedByUser) {
		_vcmsPortion.setModifiedByUser(modifiedByUser);
	}

	public java.lang.String getCode() {
		return _vcmsPortion.getCode();
	}

	public void setCode(java.lang.String code) {
		_vcmsPortion.setCode(code);
	}

	public java.lang.String getName() {
		return _vcmsPortion.getName();
	}

	public void setName(java.lang.String name) {
		_vcmsPortion.setName(name);
	}

	public java.lang.String getDescription() {
		return _vcmsPortion.getDescription();
	}

	public void setDescription(java.lang.String description) {
		_vcmsPortion.setDescription(description);
	}

	public boolean getCategorizable() {
		return _vcmsPortion.getCategorizable();
	}

	public boolean isCategorizable() {
		return _vcmsPortion.isCategorizable();
	}

	public void setCategorizable(boolean categorizable) {
		_vcmsPortion.setCategorizable(categorizable);
	}

	public java.lang.String getLanguage() {
		return _vcmsPortion.getLanguage();
	}

	public void setLanguage(java.lang.String language) {
		_vcmsPortion.setLanguage(language);
	}

	public VcmsPortion toEscapedModel() {
		return _vcmsPortion.toEscapedModel();
	}

	public boolean isNew() {
		return _vcmsPortion.isNew();
	}

	public void setNew(boolean n) {
		_vcmsPortion.setNew(n);
	}

	public boolean isCachedModel() {
		return _vcmsPortion.isCachedModel();
	}

	public void setCachedModel(boolean cachedModel) {
		_vcmsPortion.setCachedModel(cachedModel);
	}

	public boolean isEscapedModel() {
		return _vcmsPortion.isEscapedModel();
	}

	public void setEscapedModel(boolean escapedModel) {
		_vcmsPortion.setEscapedModel(escapedModel);
	}

	public java.io.Serializable getPrimaryKeyObj() {
		return _vcmsPortion.getPrimaryKeyObj();
	}

	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _vcmsPortion.getExpandoBridge();
	}

	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_vcmsPortion.setExpandoBridgeAttributes(serviceContext);
	}

	public java.lang.Object clone() {
		return _vcmsPortion.clone();
	}

	public int compareTo(VcmsPortion vcmsPortion) {
		return _vcmsPortion.compareTo(vcmsPortion);
	}

	public int hashCode() {
		return _vcmsPortion.hashCode();
	}

	public java.lang.String toString() {
		return _vcmsPortion.toString();
	}

	public java.lang.String toXmlString() {
		return _vcmsPortion.toXmlString();
	}

	public VcmsPortion getWrappedVcmsPortion() {
		return _vcmsPortion;
	}

	private VcmsPortion _vcmsPortion;
}