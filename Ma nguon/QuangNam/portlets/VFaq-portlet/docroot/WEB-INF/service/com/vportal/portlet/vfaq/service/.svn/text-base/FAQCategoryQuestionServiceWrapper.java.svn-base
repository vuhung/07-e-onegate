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

package com.vportal.portlet.vfaq.service;

/**
 * <p>
 * This class is a wrapper for {@link FAQCategoryQuestionService}.
 * </p>
 *
 * @author    HOAN
 * @see       FAQCategoryQuestionService
 * @generated
 */
public class FAQCategoryQuestionServiceWrapper
	implements FAQCategoryQuestionService {
	public FAQCategoryQuestionServiceWrapper(
		FAQCategoryQuestionService faqCategoryQuestionService) {
		_faqCategoryQuestionService = faqCategoryQuestionService;
	}

	public com.vportal.portlet.vfaq.model.FAQCategoryQuestion addCategoryQuestion(
		long categoryId, long questionId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _faqCategoryQuestionService.addCategoryQuestion(categoryId,
			questionId);
	}

	public void deleteByQuestionId(long questionId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		_faqCategoryQuestionService.deleteByQuestionId(questionId);
	}

	public void deleteByCategoryId(long categoryId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		_faqCategoryQuestionService.deleteByCategoryId(categoryId);
	}

	public java.util.List getAll()
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _faqCategoryQuestionService.getAll();
	}

	public java.util.List getQuestionsInCategory(long categoryId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _faqCategoryQuestionService.getQuestionsInCategory(categoryId);
	}

	public java.util.List getCategoriesOfQuestion(long questionId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _faqCategoryQuestionService.getCategoriesOfQuestion(questionId);
	}

	public FAQCategoryQuestionService getWrappedFAQCategoryQuestionService() {
		return _faqCategoryQuestionService;
	}

	private FAQCategoryQuestionService _faqCategoryQuestionService;
}