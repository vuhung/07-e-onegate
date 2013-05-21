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
 * This class is a wrapper for {@link Links}.
 * </p>
 *
 * @author    hai
 * @see       Links
 * @generated
 */
public class LinksWrapper implements Links {
	public LinksWrapper(Links links) {
		_links = links;
	}

	public long getPrimaryKey() {
		return _links.getPrimaryKey();
	}

	public void setPrimaryKey(long pk) {
		_links.setPrimaryKey(pk);
	}

	public long getLinkId() {
		return _links.getLinkId();
	}

	public void setLinkId(long linkId) {
		_links.setLinkId(linkId);
	}

	public long getGroupId() {
		return _links.getGroupId();
	}

	public void setGroupId(long groupId) {
		_links.setGroupId(groupId);
	}

	public long getCompanyId() {
		return _links.getCompanyId();
	}

	public void setCompanyId(long companyId) {
		_links.setCompanyId(companyId);
	}

	public java.util.Date getCreatedDate() {
		return _links.getCreatedDate();
	}

	public void setCreatedDate(java.util.Date createdDate) {
		_links.setCreatedDate(createdDate);
	}

	public java.util.Date getModifiedDate() {
		return _links.getModifiedDate();
	}

	public void setModifiedDate(java.util.Date modifiedDate) {
		_links.setModifiedDate(modifiedDate);
	}

	public long getLinkgroupId() {
		return _links.getLinkgroupId();
	}

	public void setLinkgroupId(long linkgroupId) {
		_links.setLinkgroupId(linkgroupId);
	}

	public java.lang.String getName() {
		return _links.getName();
	}

	public void setName(java.lang.String name) {
		_links.setName(name);
	}

	public java.lang.String getDescription() {
		return _links.getDescription();
	}

	public void setDescription(java.lang.String description) {
		_links.setDescription(description);
	}

	public java.lang.String getUrl() {
		return _links.getUrl();
	}

	public void setUrl(java.lang.String url) {
		_links.setUrl(url);
	}

	public int getPosition() {
		return _links.getPosition();
	}

	public void setPosition(int position) {
		_links.setPosition(position);
	}

	public boolean getHasImage() {
		return _links.getHasImage();
	}

	public boolean isHasImage() {
		return _links.isHasImage();
	}

	public void setHasImage(boolean hasImage) {
		_links.setHasImage(hasImage);
	}

	public boolean getIsTargetBlank() {
		return _links.getIsTargetBlank();
	}

	public boolean isIsTargetBlank() {
		return _links.isIsTargetBlank();
	}

	public void setIsTargetBlank(boolean isTargetBlank) {
		_links.setIsTargetBlank(isTargetBlank);
	}

	public java.lang.String getImageName() {
		return _links.getImageName();
	}

	public void setImageName(java.lang.String imageName) {
		_links.setImageName(imageName);
	}

	public long getFolderId() {
		return _links.getFolderId();
	}

	public void setFolderId(long folderId) {
		_links.setFolderId(folderId);
	}

	public com.vportal.portlet.vlinksman.model.Links toEscapedModel() {
		return _links.toEscapedModel();
	}

	public boolean isNew() {
		return _links.isNew();
	}

	public void setNew(boolean n) {
		_links.setNew(n);
	}

	public boolean isCachedModel() {
		return _links.isCachedModel();
	}

	public void setCachedModel(boolean cachedModel) {
		_links.setCachedModel(cachedModel);
	}

	public boolean isEscapedModel() {
		return _links.isEscapedModel();
	}

	public void setEscapedModel(boolean escapedModel) {
		_links.setEscapedModel(escapedModel);
	}

	public java.io.Serializable getPrimaryKeyObj() {
		return _links.getPrimaryKeyObj();
	}

	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _links.getExpandoBridge();
	}

	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_links.setExpandoBridgeAttributes(serviceContext);
	}

	public java.lang.Object clone() {
		return _links.clone();
	}

	public int compareTo(com.vportal.portlet.vlinksman.model.Links links) {
		return _links.compareTo(links);
	}

	public int hashCode() {
		return _links.hashCode();
	}

	public java.lang.String toString() {
		return _links.toString();
	}

	public java.lang.String toXmlString() {
		return _links.toXmlString();
	}

	public Links getWrappedLinks() {
		return _links;
	}

	private Links _links;
}