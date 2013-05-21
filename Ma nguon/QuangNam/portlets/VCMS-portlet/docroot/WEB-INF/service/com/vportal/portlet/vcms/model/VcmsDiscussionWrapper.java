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
 * This class is a wrapper for {@link VcmsDiscussion}.
 * </p>
 *
 * @author    HOAN
 * @see       VcmsDiscussion
 * @generated
 */
public class VcmsDiscussionWrapper implements VcmsDiscussion {
	public VcmsDiscussionWrapper(VcmsDiscussion vcmsDiscussion) {
		_vcmsDiscussion = vcmsDiscussion;
	}

	public java.lang.String getPrimaryKey() {
		return _vcmsDiscussion.getPrimaryKey();
	}

	public void setPrimaryKey(java.lang.String pk) {
		_vcmsDiscussion.setPrimaryKey(pk);
	}

	public java.lang.String getDiscussionId() {
		return _vcmsDiscussion.getDiscussionId();
	}

	public void setDiscussionId(java.lang.String discussionId) {
		_vcmsDiscussion.setDiscussionId(discussionId);
	}

	public long getGroupId() {
		return _vcmsDiscussion.getGroupId();
	}

	public void setGroupId(long groupId) {
		_vcmsDiscussion.setGroupId(groupId);
	}

	public long getCompanyId() {
		return _vcmsDiscussion.getCompanyId();
	}

	public void setCompanyId(long companyId) {
		_vcmsDiscussion.setCompanyId(companyId);
	}

	public java.lang.String getVisitorName() {
		return _vcmsDiscussion.getVisitorName();
	}

	public void setVisitorName(java.lang.String visitorName) {
		_vcmsDiscussion.setVisitorName(visitorName);
	}

	public java.lang.String getVisitorEmail() {
		return _vcmsDiscussion.getVisitorEmail();
	}

	public void setVisitorEmail(java.lang.String visitorEmail) {
		_vcmsDiscussion.setVisitorEmail(visitorEmail);
	}

	public java.lang.String getVisitorPhone() {
		return _vcmsDiscussion.getVisitorPhone();
	}

	public void setVisitorPhone(java.lang.String visitorPhone) {
		_vcmsDiscussion.setVisitorPhone(visitorPhone);
	}

	public java.util.Date getPostedDate() {
		return _vcmsDiscussion.getPostedDate();
	}

	public void setPostedDate(java.util.Date postedDate) {
		_vcmsDiscussion.setPostedDate(postedDate);
	}

	public boolean getApproved() {
		return _vcmsDiscussion.getApproved();
	}

	public boolean isApproved() {
		return _vcmsDiscussion.isApproved();
	}

	public void setApproved(boolean approved) {
		_vcmsDiscussion.setApproved(approved);
	}

	public java.lang.String getApprovedByUser() {
		return _vcmsDiscussion.getApprovedByUser();
	}

	public void setApprovedByUser(java.lang.String approvedByUser) {
		_vcmsDiscussion.setApprovedByUser(approvedByUser);
	}

	public java.util.Date getApprovedDate() {
		return _vcmsDiscussion.getApprovedDate();
	}

	public void setApprovedDate(java.util.Date approvedDate) {
		_vcmsDiscussion.setApprovedDate(approvedDate);
	}

	public java.lang.String getArticleId() {
		return _vcmsDiscussion.getArticleId();
	}

	public void setArticleId(java.lang.String articleId) {
		_vcmsDiscussion.setArticleId(articleId);
	}

	public java.lang.String getTitle() {
		return _vcmsDiscussion.getTitle();
	}

	public void setTitle(java.lang.String title) {
		_vcmsDiscussion.setTitle(title);
	}

	public java.lang.String getContent() {
		return _vcmsDiscussion.getContent();
	}

	public void setContent(java.lang.String content) {
		_vcmsDiscussion.setContent(content);
	}

	public java.lang.String getLanguage() {
		return _vcmsDiscussion.getLanguage();
	}

	public void setLanguage(java.lang.String language) {
		_vcmsDiscussion.setLanguage(language);
	}

	public boolean getHasAttachment() {
		return _vcmsDiscussion.getHasAttachment();
	}

	public boolean isHasAttachment() {
		return _vcmsDiscussion.isHasAttachment();
	}

	public void setHasAttachment(boolean hasAttachment) {
		_vcmsDiscussion.setHasAttachment(hasAttachment);
	}

	public VcmsDiscussion toEscapedModel() {
		return _vcmsDiscussion.toEscapedModel();
	}

	public boolean isNew() {
		return _vcmsDiscussion.isNew();
	}

	public void setNew(boolean n) {
		_vcmsDiscussion.setNew(n);
	}

	public boolean isCachedModel() {
		return _vcmsDiscussion.isCachedModel();
	}

	public void setCachedModel(boolean cachedModel) {
		_vcmsDiscussion.setCachedModel(cachedModel);
	}

	public boolean isEscapedModel() {
		return _vcmsDiscussion.isEscapedModel();
	}

	public void setEscapedModel(boolean escapedModel) {
		_vcmsDiscussion.setEscapedModel(escapedModel);
	}

	public java.io.Serializable getPrimaryKeyObj() {
		return _vcmsDiscussion.getPrimaryKeyObj();
	}

	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _vcmsDiscussion.getExpandoBridge();
	}

	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_vcmsDiscussion.setExpandoBridgeAttributes(serviceContext);
	}

	public java.lang.Object clone() {
		return _vcmsDiscussion.clone();
	}

	public int compareTo(VcmsDiscussion vcmsDiscussion) {
		return _vcmsDiscussion.compareTo(vcmsDiscussion);
	}

	public int hashCode() {
		return _vcmsDiscussion.hashCode();
	}

	public java.lang.String toString() {
		return _vcmsDiscussion.toString();
	}

	public java.lang.String toXmlString() {
		return _vcmsDiscussion.toXmlString();
	}

	public VcmsDiscussion getWrappedVcmsDiscussion() {
		return _vcmsDiscussion;
	}

	private VcmsDiscussion _vcmsDiscussion;
}