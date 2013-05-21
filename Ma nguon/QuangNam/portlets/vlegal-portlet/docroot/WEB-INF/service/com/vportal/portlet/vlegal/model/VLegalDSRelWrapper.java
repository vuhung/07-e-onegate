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
 * This class is a wrapper for {@link VLegalDSRel}.
 * </p>
 *
 * @author    ACB
 * @see       VLegalDSRel
 * @generated
 */
public class VLegalDSRelWrapper implements VLegalDSRel {
	public VLegalDSRelWrapper(VLegalDSRel vLegalDSRel) {
		_vLegalDSRel = vLegalDSRel;
	}

	public com.vportal.portlet.vlegal.service.persistence.VLegalDSRelPK getPrimaryKey() {
		return _vLegalDSRel.getPrimaryKey();
	}

	public void setPrimaryKey(
		com.vportal.portlet.vlegal.service.persistence.VLegalDSRelPK pk) {
		_vLegalDSRel.setPrimaryKey(pk);
	}

	public java.lang.String getSigId() {
		return _vLegalDSRel.getSigId();
	}

	public void setSigId(java.lang.String sigId) {
		_vLegalDSRel.setSigId(sigId);
	}

	public java.lang.String getDocId() {
		return _vLegalDSRel.getDocId();
	}

	public void setDocId(java.lang.String docId) {
		_vLegalDSRel.setDocId(docId);
	}

	public VLegalDSRel toEscapedModel() {
		return _vLegalDSRel.toEscapedModel();
	}

	public boolean isNew() {
		return _vLegalDSRel.isNew();
	}

	public void setNew(boolean n) {
		_vLegalDSRel.setNew(n);
	}

	public boolean isCachedModel() {
		return _vLegalDSRel.isCachedModel();
	}

	public void setCachedModel(boolean cachedModel) {
		_vLegalDSRel.setCachedModel(cachedModel);
	}

	public boolean isEscapedModel() {
		return _vLegalDSRel.isEscapedModel();
	}

	public void setEscapedModel(boolean escapedModel) {
		_vLegalDSRel.setEscapedModel(escapedModel);
	}

	public java.io.Serializable getPrimaryKeyObj() {
		return _vLegalDSRel.getPrimaryKeyObj();
	}

	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _vLegalDSRel.getExpandoBridge();
	}

	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_vLegalDSRel.setExpandoBridgeAttributes(serviceContext);
	}

	public java.lang.Object clone() {
		return _vLegalDSRel.clone();
	}

	public int compareTo(VLegalDSRel vLegalDSRel) {
		return _vLegalDSRel.compareTo(vLegalDSRel);
	}

	public int hashCode() {
		return _vLegalDSRel.hashCode();
	}

	public java.lang.String toString() {
		return _vLegalDSRel.toString();
	}

	public java.lang.String toXmlString() {
		return _vLegalDSRel.toXmlString();
	}

	public VLegalDSRel getWrappedVLegalDSRel() {
		return _vLegalDSRel;
	}

	private VLegalDSRel _vLegalDSRel;
}