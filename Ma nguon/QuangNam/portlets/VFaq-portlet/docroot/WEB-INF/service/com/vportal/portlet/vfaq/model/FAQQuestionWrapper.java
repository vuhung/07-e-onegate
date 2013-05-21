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
 * This class is a wrapper for {@link FAQQuestion}.
 * </p>
 *
 * @author    HOAN
 * @see       FAQQuestion
 * @generated
 */
public class FAQQuestionWrapper implements FAQQuestion {
	public FAQQuestionWrapper(FAQQuestion faqQuestion) {
		_faqQuestion = faqQuestion;
	}

	public long getPrimaryKey() {
		return _faqQuestion.getPrimaryKey();
	}

	public void setPrimaryKey(long pk) {
		_faqQuestion.setPrimaryKey(pk);
	}

	public java.lang.String getUuid() {
		return _faqQuestion.getUuid();
	}

	public void setUuid(java.lang.String uuid) {
		_faqQuestion.setUuid(uuid);
	}

	public long getId() {
		return _faqQuestion.getId();
	}

	public void setId(long id) {
		_faqQuestion.setId(id);
	}

	public java.lang.String getTitle() {
		return _faqQuestion.getTitle();
	}

	public void setTitle(java.lang.String title) {
		_faqQuestion.setTitle(title);
	}

	public java.lang.String getContent() {
		return _faqQuestion.getContent();
	}

	public void setContent(java.lang.String content) {
		_faqQuestion.setContent(content);
	}

	public java.lang.String getLanguage() {
		return _faqQuestion.getLanguage();
	}

	public void setLanguage(java.lang.String language) {
		_faqQuestion.setLanguage(language);
	}

	public int getQuestionOrder() {
		return _faqQuestion.getQuestionOrder();
	}

	public void setQuestionOrder(int questionOrder) {
		_faqQuestion.setQuestionOrder(questionOrder);
	}

	public java.util.Date getSentDate() {
		return _faqQuestion.getSentDate();
	}

	public void setSentDate(java.util.Date sentDate) {
		_faqQuestion.setSentDate(sentDate);
	}

	public java.lang.String getSentByUser() {
		return _faqQuestion.getSentByUser();
	}

	public void setSentByUser(java.lang.String sentByUser) {
		_faqQuestion.setSentByUser(sentByUser);
	}

	public java.lang.String getSenderEmail() {
		return _faqQuestion.getSenderEmail();
	}

	public void setSenderEmail(java.lang.String senderEmail) {
		_faqQuestion.setSenderEmail(senderEmail);
	}

	public java.lang.String getQuestionType() {
		return _faqQuestion.getQuestionType();
	}

	public void setQuestionType(java.lang.String questionType) {
		_faqQuestion.setQuestionType(questionType);
	}

	public java.lang.String getModifiedByUser() {
		return _faqQuestion.getModifiedByUser();
	}

	public void setModifiedByUser(java.lang.String modifiedByUser) {
		_faqQuestion.setModifiedByUser(modifiedByUser);
	}

	public java.util.Date getModifiedDate() {
		return _faqQuestion.getModifiedDate();
	}

	public void setModifiedDate(java.util.Date modifiedDate) {
		_faqQuestion.setModifiedDate(modifiedDate);
	}

	public int getHitCount() {
		return _faqQuestion.getHitCount();
	}

	public void setHitCount(int hitCount) {
		_faqQuestion.setHitCount(hitCount);
	}

	public boolean getApproved() {
		return _faqQuestion.getApproved();
	}

	public boolean isApproved() {
		return _faqQuestion.isApproved();
	}

	public void setApproved(boolean approved) {
		_faqQuestion.setApproved(approved);
	}

	public long getGroupId() {
		return _faqQuestion.getGroupId();
	}

	public void setGroupId(long groupId) {
		_faqQuestion.setGroupId(groupId);
	}

	public long getUserId() {
		return _faqQuestion.getUserId();
	}

	public void setUserId(long userId) {
		_faqQuestion.setUserId(userId);
	}

	public java.lang.String getUserUuid()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _faqQuestion.getUserUuid();
	}

	public void setUserUuid(java.lang.String userUuid) {
		_faqQuestion.setUserUuid(userUuid);
	}

	public com.vportal.portlet.vfaq.model.FAQQuestion toEscapedModel() {
		return _faqQuestion.toEscapedModel();
	}

	public boolean isNew() {
		return _faqQuestion.isNew();
	}

	public void setNew(boolean n) {
		_faqQuestion.setNew(n);
	}

	public boolean isCachedModel() {
		return _faqQuestion.isCachedModel();
	}

	public void setCachedModel(boolean cachedModel) {
		_faqQuestion.setCachedModel(cachedModel);
	}

	public boolean isEscapedModel() {
		return _faqQuestion.isEscapedModel();
	}

	public void setEscapedModel(boolean escapedModel) {
		_faqQuestion.setEscapedModel(escapedModel);
	}

	public java.io.Serializable getPrimaryKeyObj() {
		return _faqQuestion.getPrimaryKeyObj();
	}

	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _faqQuestion.getExpandoBridge();
	}

	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_faqQuestion.setExpandoBridgeAttributes(serviceContext);
	}

	public java.lang.Object clone() {
		return _faqQuestion.clone();
	}

	public int compareTo(com.vportal.portlet.vfaq.model.FAQQuestion faqQuestion) {
		return _faqQuestion.compareTo(faqQuestion);
	}

	public int hashCode() {
		return _faqQuestion.hashCode();
	}

	public java.lang.String toString() {
		return _faqQuestion.toString();
	}

	public java.lang.String toXmlString() {
		return _faqQuestion.toXmlString();
	}

	public FAQQuestion getWrappedFAQQuestion() {
		return _faqQuestion;
	}

	private FAQQuestion _faqQuestion;
}