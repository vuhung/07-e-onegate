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

package com.vportal.portlet.vadvman.model;

/**
 * <p>
 * This class is a wrapper for {@link AdvType}.
 * </p>
 *
 * @author    HOAN
 * @see       AdvType
 * @generated
 */
public class AdvTypeWrapper implements AdvType {
	public AdvTypeWrapper(AdvType advType) {
		_advType = advType;
	}

	public long getPrimaryKey() {
		return _advType.getPrimaryKey();
	}

	public void setPrimaryKey(long pk) {
		_advType.setPrimaryKey(pk);
	}

	public long getTypeId() {
		return _advType.getTypeId();
	}

	public void setTypeId(long typeId) {
		_advType.setTypeId(typeId);
	}

	public java.util.Date getCreateDate() {
		return _advType.getCreateDate();
	}

	public void setCreateDate(java.util.Date createDate) {
		_advType.setCreateDate(createDate);
	}

	public java.util.Date getModifiedDate() {
		return _advType.getModifiedDate();
	}

	public void setModifiedDate(java.util.Date modifiedDate) {
		_advType.setModifiedDate(modifiedDate);
	}

	public long getGroupId() {
		return _advType.getGroupId();
	}

	public void setGroupId(long groupId) {
		_advType.setGroupId(groupId);
	}

	public long getCompanyId() {
		return _advType.getCompanyId();
	}

	public void setCompanyId(long companyId) {
		_advType.setCompanyId(companyId);
	}

	public java.lang.String getName() {
		return _advType.getName();
	}

	public void setName(java.lang.String name) {
		_advType.setName(name);
	}

	public java.lang.String getDescription() {
		return _advType.getDescription();
	}

	public void setDescription(java.lang.String description) {
		_advType.setDescription(description);
	}

	public com.vportal.portlet.vadvman.model.AdvType toEscapedModel() {
		return _advType.toEscapedModel();
	}

	public boolean isNew() {
		return _advType.isNew();
	}

	public void setNew(boolean n) {
		_advType.setNew(n);
	}

	public boolean isCachedModel() {
		return _advType.isCachedModel();
	}

	public void setCachedModel(boolean cachedModel) {
		_advType.setCachedModel(cachedModel);
	}

	public boolean isEscapedModel() {
		return _advType.isEscapedModel();
	}

	public void setEscapedModel(boolean escapedModel) {
		_advType.setEscapedModel(escapedModel);
	}

	public java.io.Serializable getPrimaryKeyObj() {
		return _advType.getPrimaryKeyObj();
	}

	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _advType.getExpandoBridge();
	}

	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_advType.setExpandoBridgeAttributes(serviceContext);
	}

	public java.lang.Object clone() {
		return _advType.clone();
	}

	public int compareTo(com.vportal.portlet.vadvman.model.AdvType advType) {
		return _advType.compareTo(advType);
	}

	public int hashCode() {
		return _advType.hashCode();
	}

	public java.lang.String toString() {
		return _advType.toString();
	}

	public java.lang.String toXmlString() {
		return _advType.toXmlString();
	}

	public AdvType getWrappedAdvType() {
		return _advType;
	}

	private AdvType _advType;
}