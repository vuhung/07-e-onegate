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
 * This class is a wrapper for {@link VLegalDDRel}.
 * </p>
 *
 * @author    ACB
 * @see       VLegalDDRel
 * @generated
 */
public class VLegalDDRelWrapper implements VLegalDDRel {
	public VLegalDDRelWrapper(VLegalDDRel vLegalDDRel) {
		_vLegalDDRel = vLegalDDRel;
	}

	public com.vportal.portlet.vlegal.service.persistence.VLegalDDRelPK getPrimaryKey() {
		return _vLegalDDRel.getPrimaryKey();
	}

	public void setPrimaryKey(
		com.vportal.portlet.vlegal.service.persistence.VLegalDDRelPK pk) {
		_vLegalDDRel.setPrimaryKey(pk);
	}

	public long getDepartmentId() {
		return _vLegalDDRel.getDepartmentId();
	}

	public void setDepartmentId(long departmentId) {
		_vLegalDDRel.setDepartmentId(departmentId);
	}

	public java.lang.String getDocId() {
		return _vLegalDDRel.getDocId();
	}

	public void setDocId(java.lang.String docId) {
		_vLegalDDRel.setDocId(docId);
	}

	public VLegalDDRel toEscapedModel() {
		return _vLegalDDRel.toEscapedModel();
	}

	public boolean isNew() {
		return _vLegalDDRel.isNew();
	}

	public void setNew(boolean n) {
		_vLegalDDRel.setNew(n);
	}

	public boolean isCachedModel() {
		return _vLegalDDRel.isCachedModel();
	}

	public void setCachedModel(boolean cachedModel) {
		_vLegalDDRel.setCachedModel(cachedModel);
	}

	public boolean isEscapedModel() {
		return _vLegalDDRel.isEscapedModel();
	}

	public void setEscapedModel(boolean escapedModel) {
		_vLegalDDRel.setEscapedModel(escapedModel);
	}

	public java.io.Serializable getPrimaryKeyObj() {
		return _vLegalDDRel.getPrimaryKeyObj();
	}

	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _vLegalDDRel.getExpandoBridge();
	}

	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_vLegalDDRel.setExpandoBridgeAttributes(serviceContext);
	}

	public java.lang.Object clone() {
		return _vLegalDDRel.clone();
	}

	public int compareTo(VLegalDDRel vLegalDDRel) {
		return _vLegalDDRel.compareTo(vLegalDDRel);
	}

	public int hashCode() {
		return _vLegalDDRel.hashCode();
	}

	public java.lang.String toString() {
		return _vLegalDDRel.toString();
	}

	public java.lang.String toXmlString() {
		return _vLegalDDRel.toXmlString();
	}

	public VLegalDDRel getWrappedVLegalDDRel() {
		return _vLegalDDRel;
	}

	private VLegalDDRel _vLegalDDRel;
}