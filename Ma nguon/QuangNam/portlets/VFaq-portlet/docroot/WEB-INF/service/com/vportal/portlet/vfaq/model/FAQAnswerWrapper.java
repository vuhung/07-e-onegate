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

package com.vportal.portlet.vfaq.model;

/**
 * <p>
 * This class is a wrapper for {@link FAQAnswer}.
 * </p>
 *
 * @author    HOAN
 * @see       FAQAnswer
 * @generated
 */
public class FAQAnswerWrapper implements FAQAnswer {
	public FAQAnswerWrapper(FAQAnswer faqAnswer) {
		_faqAnswer = faqAnswer;
	}

	public long getPrimaryKey() {
		return _faqAnswer.getPrimaryKey();
	}

	public void setPrimaryKey(long pk) {
		_faqAnswer.setPrimaryKey(pk);
	}

	public java.lang.String getUuid() {
		return _faqAnswer.getUuid();
	}

	public void setUuid(java.lang.String uuid) {
		_faqAnswer.setUuid(uuid);
	}

	public long getId() {
		return _faqAnswer.getId();
	}

	public void setId(long id) {
		_faqAnswer.setId(id);
	}

	public long getQuestionid() {
		return _faqAnswer.getQuestionid();
	}

	public void setQuestionid(long questionid) {
		_faqAnswer.setQuestionid(questionid);
	}

	public java.lang.String getContent() {
		return _faqAnswer.getContent();
	}

	public void setContent(java.lang.String content) {
		_faqAnswer.setContent(content);
	}

	public int getAnswerOrder() {
		return _faqAnswer.getAnswerOrder();
	}

	public void setAnswerOrder(int answerOrder) {
		_faqAnswer.setAnswerOrder(answerOrder);
	}

	public java.lang.String getAnsweredByUser() {
		return _faqAnswer.getAnsweredByUser();
	}

	public void setAnsweredByUser(java.lang.String answeredByUser) {
		_faqAnswer.setAnsweredByUser(answeredByUser);
	}

	public java.util.Date getAnsweredDate() {
		return _faqAnswer.getAnsweredDate();
	}

	public void setAnsweredDate(java.util.Date answeredDate) {
		_faqAnswer.setAnsweredDate(answeredDate);
	}

	public java.lang.String getModifiedByUser() {
		return _faqAnswer.getModifiedByUser();
	}

	public void setModifiedByUser(java.lang.String modifiedByUser) {
		_faqAnswer.setModifiedByUser(modifiedByUser);
	}

	public java.lang.String getLanguage() {
		return _faqAnswer.getLanguage();
	}

	public void setLanguage(java.lang.String language) {
		_faqAnswer.setLanguage(language);
	}

	public java.util.Date getModifiedDate() {
		return _faqAnswer.getModifiedDate();
	}

	public void setModifiedDate(java.util.Date modifiedDate) {
		_faqAnswer.setModifiedDate(modifiedDate);
	}

	public boolean getApproved() {
		return _faqAnswer.getApproved();
	}

	public boolean isApproved() {
		return _faqAnswer.isApproved();
	}

	public void setApproved(boolean approved) {
		_faqAnswer.setApproved(approved);
	}

	public java.lang.String getApprovedByUser() {
		return _faqAnswer.getApprovedByUser();
	}

	public void setApprovedByUser(java.lang.String approvedByUser) {
		_faqAnswer.setApprovedByUser(approvedByUser);
	}

	public java.util.Date getApprovedDate() {
		return _faqAnswer.getApprovedDate();
	}

	public void setApprovedDate(java.util.Date approvedDate) {
		_faqAnswer.setApprovedDate(approvedDate);
	}

	public long getUserId() {
		return _faqAnswer.getUserId();
	}

	public void setUserId(long userId) {
		_faqAnswer.setUserId(userId);
	}

	public java.lang.String getUserUuid()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _faqAnswer.getUserUuid();
	}

	public void setUserUuid(java.lang.String userUuid) {
		_faqAnswer.setUserUuid(userUuid);
	}

	public java.lang.String getAttachName() {
		return _faqAnswer.getAttachName();
	}

	public void setAttachName(java.lang.String attachName) {
		_faqAnswer.setAttachName(attachName);
	}

	public long getFolderId() {
		return _faqAnswer.getFolderId();
	}

	public void setFolderId(long folderId) {
		_faqAnswer.setFolderId(folderId);
	}

	public com.vportal.portlet.vfaq.model.FAQAnswer toEscapedModel() {
		return _faqAnswer.toEscapedModel();
	}

	public boolean isNew() {
		return _faqAnswer.isNew();
	}

	public void setNew(boolean n) {
		_faqAnswer.setNew(n);
	}

	public boolean isCachedModel() {
		return _faqAnswer.isCachedModel();
	}

	public void setCachedModel(boolean cachedModel) {
		_faqAnswer.setCachedModel(cachedModel);
	}

	public boolean isEscapedModel() {
		return _faqAnswer.isEscapedModel();
	}

	public void setEscapedModel(boolean escapedModel) {
		_faqAnswer.setEscapedModel(escapedModel);
	}

	public java.io.Serializable getPrimaryKeyObj() {
		return _faqAnswer.getPrimaryKeyObj();
	}

	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _faqAnswer.getExpandoBridge();
	}

	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_faqAnswer.setExpandoBridgeAttributes(serviceContext);
	}

	public java.lang.Object clone() {
		return _faqAnswer.clone();
	}

	public int compareTo(com.vportal.portlet.vfaq.model.FAQAnswer faqAnswer) {
		return _faqAnswer.compareTo(faqAnswer);
	}

	public int hashCode() {
		return _faqAnswer.hashCode();
	}

	public java.lang.String toString() {
		return _faqAnswer.toString();
	}

	public java.lang.String toXmlString() {
		return _faqAnswer.toXmlString();
	}

	public FAQAnswer getWrappedFAQAnswer() {
		return _faqAnswer;
	}

	private FAQAnswer _faqAnswer;
}