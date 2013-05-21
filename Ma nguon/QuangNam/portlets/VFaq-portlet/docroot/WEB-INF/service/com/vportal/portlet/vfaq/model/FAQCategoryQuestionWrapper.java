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
 * This class is a wrapper for {@link FAQCategoryQuestion}.
 * </p>
 *
 * @author    HOAN
 * @see       FAQCategoryQuestion
 * @generated
 */
public class FAQCategoryQuestionWrapper implements FAQCategoryQuestion {
	public FAQCategoryQuestionWrapper(FAQCategoryQuestion faqCategoryQuestion) {
		_faqCategoryQuestion = faqCategoryQuestion;
	}

	public long getPrimaryKey() {
		return _faqCategoryQuestion.getPrimaryKey();
	}

	public void setPrimaryKey(long pk) {
		_faqCategoryQuestion.setPrimaryKey(pk);
	}

	public java.lang.String getUuid() {
		return _faqCategoryQuestion.getUuid();
	}

	public void setUuid(java.lang.String uuid) {
		_faqCategoryQuestion.setUuid(uuid);
	}

	public long getId() {
		return _faqCategoryQuestion.getId();
	}

	public void setId(long id) {
		_faqCategoryQuestion.setId(id);
	}

	public long getQuestionId() {
		return _faqCategoryQuestion.getQuestionId();
	}

	public void setQuestionId(long questionId) {
		_faqCategoryQuestion.setQuestionId(questionId);
	}

	public long getCategoryId() {
		return _faqCategoryQuestion.getCategoryId();
	}

	public void setCategoryId(long categoryId) {
		_faqCategoryQuestion.setCategoryId(categoryId);
	}

	public com.vportal.portlet.vfaq.model.FAQCategoryQuestion toEscapedModel() {
		return _faqCategoryQuestion.toEscapedModel();
	}

	public boolean isNew() {
		return _faqCategoryQuestion.isNew();
	}

	public void setNew(boolean n) {
		_faqCategoryQuestion.setNew(n);
	}

	public boolean isCachedModel() {
		return _faqCategoryQuestion.isCachedModel();
	}

	public void setCachedModel(boolean cachedModel) {
		_faqCategoryQuestion.setCachedModel(cachedModel);
	}

	public boolean isEscapedModel() {
		return _faqCategoryQuestion.isEscapedModel();
	}

	public void setEscapedModel(boolean escapedModel) {
		_faqCategoryQuestion.setEscapedModel(escapedModel);
	}

	public java.io.Serializable getPrimaryKeyObj() {
		return _faqCategoryQuestion.getPrimaryKeyObj();
	}

	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _faqCategoryQuestion.getExpandoBridge();
	}

	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_faqCategoryQuestion.setExpandoBridgeAttributes(serviceContext);
	}

	public java.lang.Object clone() {
		return _faqCategoryQuestion.clone();
	}

	public int compareTo(
		com.vportal.portlet.vfaq.model.FAQCategoryQuestion faqCategoryQuestion) {
		return _faqCategoryQuestion.compareTo(faqCategoryQuestion);
	}

	public int hashCode() {
		return _faqCategoryQuestion.hashCode();
	}

	public java.lang.String toString() {
		return _faqCategoryQuestion.toString();
	}

	public java.lang.String toXmlString() {
		return _faqCategoryQuestion.toXmlString();
	}

	public FAQCategoryQuestion getWrappedFAQCategoryQuestion() {
		return _faqCategoryQuestion;
	}

	private FAQCategoryQuestion _faqCategoryQuestion;
}