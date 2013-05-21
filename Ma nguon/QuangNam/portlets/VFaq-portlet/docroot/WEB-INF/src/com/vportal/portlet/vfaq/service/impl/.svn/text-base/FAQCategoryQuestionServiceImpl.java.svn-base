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

package com.vportal.portlet.vfaq.service.impl;

import java.util.List;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.vportal.portlet.vfaq.model.FAQCategoryQuestion;
import com.vportal.portlet.vfaq.service.base.FAQCategoryQuestionServiceBaseImpl;

/**
 * The implementation of the f a q category question remote service.
 * 
 * <p>
 * All custom service methods should be put in this class. Whenever methods are
 * added, rerun ServiceBuilder to copy their definitions into the
 * {@link com.vportal.portlet.vfaq.service.FAQCategoryQuestionService}
 * interface.
 * </p>
 * 
 * <p>
 * Never reference this interface directly. Always use
 * {@link com.vportal.portlet.vfaq.service.FAQCategoryQuestionServiceUtil} to
 * access the f a q category question remote service.
 * </p>
 * 
 * <p>
 * This is a remote service. Methods of this service are expected to have
 * security checks based on the propagated JAAS credentials because this service
 * can be accessed remotely.
 * </p>
 * 
 * @author HOAN
 * @see com.vportal.portlet.vfaq.service.base.FAQCategoryQuestionServiceBaseImpl
 * @see com.vportal.portlet.vfaq.service.FAQCategoryQuestionServiceUtil
 */
public class FAQCategoryQuestionServiceImpl extends
		FAQCategoryQuestionServiceBaseImpl {
	public FAQCategoryQuestion addCategoryQuestion(long categoryId,
			long questionId) throws PortalException, SystemException {
		return faqCategoryQuestionLocalService.addCategoryQuestion(categoryId,
				questionId);
	}

	public void deleteByQuestionId(long questionId) throws PortalException,
			SystemException {
		faqCategoryQuestionLocalService.deleteByCategoryId(questionId);
	}

	public void deleteByCategoryId(long categoryId) throws PortalException,
			SystemException {
		faqCategoryQuestionLocalService.deleteByCategoryId(categoryId);
	}

	public List getAll() throws PortalException, SystemException {
		return faqCategoryQuestionLocalService.getAll();
	}

	public List getQuestionsInCategory(long categoryId) throws PortalException,
			SystemException {
		return faqCategoryQuestionLocalService
				.getQuestionsInCategory(categoryId);
	}

	public List getCategoriesOfQuestion(long questionId)
			throws PortalException, SystemException {
		return faqCategoryQuestionLocalService
				.getCategoriesOfQuestion(questionId);
	}

	private void _validate(long categoryId, long questionId)
			throws PortalException, SystemException {
		// if (Validator.isNull(categoryId) || categoryId.length() > 25) {
		// throw new FAQQuestionCategoryException();
		// }
		// if (Validator.isNull(categoryId) || categoryId.length() > 25) {
		// throw new FAQQuestionCategoryException();
		// }
	}
}