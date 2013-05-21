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
 * This class is a wrapper for {@link VLegalDFRel}.
 * </p>
 *
 * @author    ACB
 * @see       VLegalDFRel
 * @generated
 */
public class VLegalDFRelWrapper implements VLegalDFRel {
	public VLegalDFRelWrapper(VLegalDFRel vLegalDFRel) {
		_vLegalDFRel = vLegalDFRel;
	}

	public com.vportal.portlet.vlegal.service.persistence.VLegalDFRelPK getPrimaryKey() {
		return _vLegalDFRel.getPrimaryKey();
	}

	public void setPrimaryKey(
		com.vportal.portlet.vlegal.service.persistence.VLegalDFRelPK pk) {
		_vLegalDFRel.setPrimaryKey(pk);
	}

	public java.lang.String getFieldId() {
		return _vLegalDFRel.getFieldId();
	}

	public void setFieldId(java.lang.String fieldId) {
		_vLegalDFRel.setFieldId(fieldId);
	}

	public java.lang.String getDocId() {
		return _vLegalDFRel.getDocId();
	}

	public void setDocId(java.lang.String docId) {
		_vLegalDFRel.setDocId(docId);
	}

	public VLegalDFRel toEscapedModel() {
		return _vLegalDFRel.toEscapedModel();
	}

	public boolean isNew() {
		return _vLegalDFRel.isNew();
	}

	public void setNew(boolean n) {
		_vLegalDFRel.setNew(n);
	}

	public boolean isCachedModel() {
		return _vLegalDFRel.isCachedModel();
	}

	public void setCachedModel(boolean cachedModel) {
		_vLegalDFRel.setCachedModel(cachedModel);
	}

	public boolean isEscapedModel() {
		return _vLegalDFRel.isEscapedModel();
	}

	public void setEscapedModel(boolean escapedModel) {
		_vLegalDFRel.setEscapedModel(escapedModel);
	}

	public java.io.Serializable getPrimaryKeyObj() {
		return _vLegalDFRel.getPrimaryKeyObj();
	}

	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _vLegalDFRel.getExpandoBridge();
	}

	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_vLegalDFRel.setExpandoBridgeAttributes(serviceContext);
	}

	public java.lang.Object clone() {
		return _vLegalDFRel.clone();
	}

	public int compareTo(VLegalDFRel vLegalDFRel) {
		return _vLegalDFRel.compareTo(vLegalDFRel);
	}

	public int hashCode() {
		return _vLegalDFRel.hashCode();
	}

	public java.lang.String toString() {
		return _vLegalDFRel.toString();
	}

	public java.lang.String toXmlString() {
		return _vLegalDFRel.toXmlString();
	}

	public VLegalDFRel getWrappedVLegalDFRel() {
		return _vLegalDFRel;
	}

	private VLegalDFRel _vLegalDFRel;
}