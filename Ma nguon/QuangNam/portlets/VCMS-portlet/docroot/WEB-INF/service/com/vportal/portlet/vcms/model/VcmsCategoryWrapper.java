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
 * This class is a wrapper for {@link VcmsCategory}.
 * </p>
 *
 * @author    HOAN
 * @see       VcmsCategory
 * @generated
 */
public class VcmsCategoryWrapper implements VcmsCategory {
	public VcmsCategoryWrapper(VcmsCategory vcmsCategory) {
		_vcmsCategory = vcmsCategory;
	}

	public java.lang.String getPrimaryKey() {
		return _vcmsCategory.getPrimaryKey();
	}

	public void setPrimaryKey(java.lang.String pk) {
		_vcmsCategory.setPrimaryKey(pk);
	}

	public java.lang.String getCategoryId() {
		return _vcmsCategory.getCategoryId();
	}

	public void setCategoryId(java.lang.String categoryId) {
		_vcmsCategory.setCategoryId(categoryId);
	}

	public long getGroupId() {
		return _vcmsCategory.getGroupId();
	}

	public void setGroupId(long groupId) {
		_vcmsCategory.setGroupId(groupId);
	}

	public long getCompanyId() {
		return _vcmsCategory.getCompanyId();
	}

	public void setCompanyId(long companyId) {
		_vcmsCategory.setCompanyId(companyId);
	}

	public java.util.Date getCreatedDate() {
		return _vcmsCategory.getCreatedDate();
	}

	public void setCreatedDate(java.util.Date createdDate) {
		_vcmsCategory.setCreatedDate(createdDate);
	}

	public java.lang.String getCreatedByUser() {
		return _vcmsCategory.getCreatedByUser();
	}

	public void setCreatedByUser(java.lang.String createdByUser) {
		_vcmsCategory.setCreatedByUser(createdByUser);
	}

	public java.util.Date getModifiedDate() {
		return _vcmsCategory.getModifiedDate();
	}

	public void setModifiedDate(java.util.Date modifiedDate) {
		_vcmsCategory.setModifiedDate(modifiedDate);
	}

	public java.lang.String getModifiedByUser() {
		return _vcmsCategory.getModifiedByUser();
	}

	public void setModifiedByUser(java.lang.String modifiedByUser) {
		_vcmsCategory.setModifiedByUser(modifiedByUser);
	}

	public java.lang.String getPortionId() {
		return _vcmsCategory.getPortionId();
	}

	public void setPortionId(java.lang.String portionId) {
		_vcmsCategory.setPortionId(portionId);
	}

	public java.lang.String getParentId() {
		return _vcmsCategory.getParentId();
	}

	public void setParentId(java.lang.String parentId) {
		_vcmsCategory.setParentId(parentId);
	}

	public java.lang.String getName() {
		return _vcmsCategory.getName();
	}

	public void setName(java.lang.String name) {
		_vcmsCategory.setName(name);
	}

	public java.lang.String getDescription() {
		return _vcmsCategory.getDescription();
	}

	public void setDescription(java.lang.String description) {
		_vcmsCategory.setDescription(description);
	}

	public boolean getAnchored() {
		return _vcmsCategory.getAnchored();
	}

	public boolean isAnchored() {
		return _vcmsCategory.isAnchored();
	}

	public void setAnchored(boolean anchored) {
		_vcmsCategory.setAnchored(anchored);
	}

	public java.lang.String getHref() {
		return _vcmsCategory.getHref();
	}

	public void setHref(java.lang.String href) {
		_vcmsCategory.setHref(href);
	}

	public java.lang.String getLanguage() {
		return _vcmsCategory.getLanguage();
	}

	public void setLanguage(java.lang.String language) {
		_vcmsCategory.setLanguage(language);
	}

	public boolean getHasImage() {
		return _vcmsCategory.getHasImage();
	}

	public boolean isHasImage() {
		return _vcmsCategory.isHasImage();
	}

	public void setHasImage(boolean hasImage) {
		_vcmsCategory.setHasImage(hasImage);
	}

	public java.lang.String getImage() {
		return _vcmsCategory.getImage();
	}

	public void setImage(java.lang.String image) {
		_vcmsCategory.setImage(image);
	}

	public int getPosition() {
		return _vcmsCategory.getPosition();
	}

	public void setPosition(int position) {
		_vcmsCategory.setPosition(position);
	}

	public int getUserHit() {
		return _vcmsCategory.getUserHit();
	}

	public void setUserHit(int userHit) {
		_vcmsCategory.setUserHit(userHit);
	}

	public boolean getRssable() {
		return _vcmsCategory.getRssable();
	}

	public boolean isRssable() {
		return _vcmsCategory.isRssable();
	}

	public void setRssable(boolean rssable) {
		_vcmsCategory.setRssable(rssable);
	}

	public VcmsCategory toEscapedModel() {
		return _vcmsCategory.toEscapedModel();
	}

	public boolean isNew() {
		return _vcmsCategory.isNew();
	}

	public void setNew(boolean n) {
		_vcmsCategory.setNew(n);
	}

	public boolean isCachedModel() {
		return _vcmsCategory.isCachedModel();
	}

	public void setCachedModel(boolean cachedModel) {
		_vcmsCategory.setCachedModel(cachedModel);
	}

	public boolean isEscapedModel() {
		return _vcmsCategory.isEscapedModel();
	}

	public void setEscapedModel(boolean escapedModel) {
		_vcmsCategory.setEscapedModel(escapedModel);
	}

	public java.io.Serializable getPrimaryKeyObj() {
		return _vcmsCategory.getPrimaryKeyObj();
	}

	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _vcmsCategory.getExpandoBridge();
	}

	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_vcmsCategory.setExpandoBridgeAttributes(serviceContext);
	}

	public java.lang.Object clone() {
		return _vcmsCategory.clone();
	}

	public int compareTo(VcmsCategory vcmsCategory) {
		return _vcmsCategory.compareTo(vcmsCategory);
	}

	public int hashCode() {
		return _vcmsCategory.hashCode();
	}

	public java.lang.String toString() {
		return _vcmsCategory.toString();
	}

	public java.lang.String toXmlString() {
		return _vcmsCategory.toXmlString();
	}

	public VcmsCategory getWrappedVcmsCategory() {
		return _vcmsCategory;
	}

	private VcmsCategory _vcmsCategory;
}