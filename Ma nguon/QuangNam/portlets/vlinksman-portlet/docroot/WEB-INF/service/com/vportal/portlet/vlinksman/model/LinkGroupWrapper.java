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

package com.vportal.portlet.vlinksman.model;

/**
 * <p>
 * This class is a wrapper for {@link LinkGroup}.
 * </p>
 *
 * @author    hai
 * @see       LinkGroup
 * @generated
 */
public class LinkGroupWrapper implements LinkGroup {
	public LinkGroupWrapper(LinkGroup linkGroup) {
		_linkGroup = linkGroup;
	}

	public long getPrimaryKey() {
		return _linkGroup.getPrimaryKey();
	}

	public void setPrimaryKey(long pk) {
		_linkGroup.setPrimaryKey(pk);
	}

	public long getLinkgroupId() {
		return _linkGroup.getLinkgroupId();
	}

	public void setLinkgroupId(long linkgroupId) {
		_linkGroup.setLinkgroupId(linkgroupId);
	}

	public long getGroupId() {
		return _linkGroup.getGroupId();
	}

	public void setGroupId(long groupId) {
		_linkGroup.setGroupId(groupId);
	}

	public long getCompanyId() {
		return _linkGroup.getCompanyId();
	}

	public void setCompanyId(long companyId) {
		_linkGroup.setCompanyId(companyId);
	}

	public java.util.Date getCreatedDate() {
		return _linkGroup.getCreatedDate();
	}

	public void setCreatedDate(java.util.Date createdDate) {
		_linkGroup.setCreatedDate(createdDate);
	}

	public java.util.Date getModifiedDate() {
		return _linkGroup.getModifiedDate();
	}

	public void setModifiedDate(java.util.Date modifiedDate) {
		_linkGroup.setModifiedDate(modifiedDate);
	}

	public java.lang.String getName() {
		return _linkGroup.getName();
	}

	public void setName(java.lang.String name) {
		_linkGroup.setName(name);
	}

	public java.lang.String getDescription() {
		return _linkGroup.getDescription();
	}

	public void setDescription(java.lang.String description) {
		_linkGroup.setDescription(description);
	}

	public com.vportal.portlet.vlinksman.model.LinkGroup toEscapedModel() {
		return _linkGroup.toEscapedModel();
	}

	public boolean isNew() {
		return _linkGroup.isNew();
	}

	public void setNew(boolean n) {
		_linkGroup.setNew(n);
	}

	public boolean isCachedModel() {
		return _linkGroup.isCachedModel();
	}

	public void setCachedModel(boolean cachedModel) {
		_linkGroup.setCachedModel(cachedModel);
	}

	public boolean isEscapedModel() {
		return _linkGroup.isEscapedModel();
	}

	public void setEscapedModel(boolean escapedModel) {
		_linkGroup.setEscapedModel(escapedModel);
	}

	public java.io.Serializable getPrimaryKeyObj() {
		return _linkGroup.getPrimaryKeyObj();
	}

	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _linkGroup.getExpandoBridge();
	}

	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_linkGroup.setExpandoBridgeAttributes(serviceContext);
	}

	public java.lang.Object clone() {
		return _linkGroup.clone();
	}

	public int compareTo(
		com.vportal.portlet.vlinksman.model.LinkGroup linkGroup) {
		return _linkGroup.compareTo(linkGroup);
	}

	public int hashCode() {
		return _linkGroup.hashCode();
	}

	public java.lang.String toString() {
		return _linkGroup.toString();
	}

	public java.lang.String toXmlString() {
		return _linkGroup.toXmlString();
	}

	public LinkGroup getWrappedLinkGroup() {
		return _linkGroup;
	}

	private LinkGroup _linkGroup;
}