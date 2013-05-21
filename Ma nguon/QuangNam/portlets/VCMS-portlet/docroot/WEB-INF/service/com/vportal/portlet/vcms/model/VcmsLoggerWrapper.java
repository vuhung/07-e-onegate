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
 * This class is a wrapper for {@link VcmsLogger}.
 * </p>
 *
 * @author    HOAN
 * @see       VcmsLogger
 * @generated
 */
public class VcmsLoggerWrapper implements VcmsLogger {
	public VcmsLoggerWrapper(VcmsLogger vcmsLogger) {
		_vcmsLogger = vcmsLogger;
	}

	public java.lang.String getPrimaryKey() {
		return _vcmsLogger.getPrimaryKey();
	}

	public void setPrimaryKey(java.lang.String pk) {
		_vcmsLogger.setPrimaryKey(pk);
	}

	public java.lang.String getLoggerId() {
		return _vcmsLogger.getLoggerId();
	}

	public void setLoggerId(java.lang.String loggerId) {
		_vcmsLogger.setLoggerId(loggerId);
	}

	public long getGroupId() {
		return _vcmsLogger.getGroupId();
	}

	public void setGroupId(long groupId) {
		_vcmsLogger.setGroupId(groupId);
	}

	public long getCompanyId() {
		return _vcmsLogger.getCompanyId();
	}

	public void setCompanyId(long companyId) {
		_vcmsLogger.setCompanyId(companyId);
	}

	public java.util.Date getCreatedDate() {
		return _vcmsLogger.getCreatedDate();
	}

	public void setCreatedDate(java.util.Date createdDate) {
		_vcmsLogger.setCreatedDate(createdDate);
	}

	public java.lang.String getCreatedByUser() {
		return _vcmsLogger.getCreatedByUser();
	}

	public void setCreatedByUser(java.lang.String createdByUser) {
		_vcmsLogger.setCreatedByUser(createdByUser);
	}

	public java.lang.String getContent() {
		return _vcmsLogger.getContent();
	}

	public void setContent(java.lang.String content) {
		_vcmsLogger.setContent(content);
	}

	public VcmsLogger toEscapedModel() {
		return _vcmsLogger.toEscapedModel();
	}

	public boolean isNew() {
		return _vcmsLogger.isNew();
	}

	public void setNew(boolean n) {
		_vcmsLogger.setNew(n);
	}

	public boolean isCachedModel() {
		return _vcmsLogger.isCachedModel();
	}

	public void setCachedModel(boolean cachedModel) {
		_vcmsLogger.setCachedModel(cachedModel);
	}

	public boolean isEscapedModel() {
		return _vcmsLogger.isEscapedModel();
	}

	public void setEscapedModel(boolean escapedModel) {
		_vcmsLogger.setEscapedModel(escapedModel);
	}

	public java.io.Serializable getPrimaryKeyObj() {
		return _vcmsLogger.getPrimaryKeyObj();
	}

	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _vcmsLogger.getExpandoBridge();
	}

	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_vcmsLogger.setExpandoBridgeAttributes(serviceContext);
	}

	public java.lang.Object clone() {
		return _vcmsLogger.clone();
	}

	public int compareTo(VcmsLogger vcmsLogger) {
		return _vcmsLogger.compareTo(vcmsLogger);
	}

	public int hashCode() {
		return _vcmsLogger.hashCode();
	}

	public java.lang.String toString() {
		return _vcmsLogger.toString();
	}

	public java.lang.String toXmlString() {
		return _vcmsLogger.toXmlString();
	}

	public VcmsLogger getWrappedVcmsLogger() {
		return _vcmsLogger;
	}

	private VcmsLogger _vcmsLogger;
}