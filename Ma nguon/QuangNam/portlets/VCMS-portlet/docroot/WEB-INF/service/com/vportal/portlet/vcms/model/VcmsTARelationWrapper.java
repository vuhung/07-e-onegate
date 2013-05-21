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
 * This class is a wrapper for {@link VcmsTARelation}.
 * </p>
 *
 * @author    HOAN
 * @see       VcmsTARelation
 * @generated
 */
public class VcmsTARelationWrapper implements VcmsTARelation {
	public VcmsTARelationWrapper(VcmsTARelation vcmsTARelation) {
		_vcmsTARelation = vcmsTARelation;
	}

	public com.vportal.portlet.vcms.service.persistence.VcmsTARelationPK getPrimaryKey() {
		return _vcmsTARelation.getPrimaryKey();
	}

	public void setPrimaryKey(
		com.vportal.portlet.vcms.service.persistence.VcmsTARelationPK pk) {
		_vcmsTARelation.setPrimaryKey(pk);
	}

	public java.lang.String getThreadId() {
		return _vcmsTARelation.getThreadId();
	}

	public void setThreadId(java.lang.String threadId) {
		_vcmsTARelation.setThreadId(threadId);
	}

	public java.lang.String getArticleId() {
		return _vcmsTARelation.getArticleId();
	}

	public void setArticleId(java.lang.String articleId) {
		_vcmsTARelation.setArticleId(articleId);
	}

	public VcmsTARelation toEscapedModel() {
		return _vcmsTARelation.toEscapedModel();
	}

	public boolean isNew() {
		return _vcmsTARelation.isNew();
	}

	public void setNew(boolean n) {
		_vcmsTARelation.setNew(n);
	}

	public boolean isCachedModel() {
		return _vcmsTARelation.isCachedModel();
	}

	public void setCachedModel(boolean cachedModel) {
		_vcmsTARelation.setCachedModel(cachedModel);
	}

	public boolean isEscapedModel() {
		return _vcmsTARelation.isEscapedModel();
	}

	public void setEscapedModel(boolean escapedModel) {
		_vcmsTARelation.setEscapedModel(escapedModel);
	}

	public java.io.Serializable getPrimaryKeyObj() {
		return _vcmsTARelation.getPrimaryKeyObj();
	}

	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _vcmsTARelation.getExpandoBridge();
	}

	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_vcmsTARelation.setExpandoBridgeAttributes(serviceContext);
	}

	public java.lang.Object clone() {
		return _vcmsTARelation.clone();
	}

	public int compareTo(VcmsTARelation vcmsTARelation) {
		return _vcmsTARelation.compareTo(vcmsTARelation);
	}

	public int hashCode() {
		return _vcmsTARelation.hashCode();
	}

	public java.lang.String toString() {
		return _vcmsTARelation.toString();
	}

	public java.lang.String toXmlString() {
		return _vcmsTARelation.toXmlString();
	}

	public VcmsTARelation getWrappedVcmsTARelation() {
		return _vcmsTARelation;
	}

	private VcmsTARelation _vcmsTARelation;
}