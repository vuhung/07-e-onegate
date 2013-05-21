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
 * This class is a wrapper for {@link FAQCategoryQuestionLocalService}.
 * </p>
 *
 * @author    HOAN
 * @see       FAQCategoryQuestionLocalService
 * @generated
 */
public class FAQCategoryQuestionLocalServiceWrapper
	implements FAQCategoryQuestionLocalService {
	public FAQCategoryQuestionLocalServiceWrapper(
		FAQCategoryQuestionLocalService faqCategoryQuestionLocalService) {
		_faqCategoryQuestionLocalService = faqCategoryQuestionLocalService;
	}

	/**
	* Adds the f a q category question to the database. Also notifies the appropriate model listeners.
	*
	* @param faqCategoryQuestion the f a q category question to add
	* @return the f a q category question that was added
	* @throws SystemException if a system exception occurred
	*/
	public com.vportal.portlet.vfaq.model.FAQCategoryQuestion addFAQCategoryQuestion(
		com.vportal.portlet.vfaq.model.FAQCategoryQuestion faqCategoryQuestion)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _faqCategoryQuestionLocalService.addFAQCategoryQuestion(faqCategoryQuestion);
	}

	/**
	* Creates a new f a q category question with the primary key. Does not add the f a q category question to the database.
	*
	* @param id the primary key for the new f a q category question
	* @return the new f a q category question
	*/
	public com.vportal.portlet.vfaq.model.FAQCategoryQuestion createFAQCategoryQuestion(
		long id) {
		return _faqCategoryQuestionLocalService.createFAQCategoryQuestion(id);
	}

	/**
	* Deletes the f a q category question with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the f a q category question to delete
	* @throws PortalException if a f a q category question with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public void deleteFAQCategoryQuestion(long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		_faqCategoryQuestionLocalService.deleteFAQCategoryQuestion(id);
	}

	/**
	* Deletes the f a q category question from the database. Also notifies the appropriate model listeners.
	*
	* @param faqCategoryQuestion the f a q category question to delete
	* @throws SystemException if a system exception occurred
	*/
	public void deleteFAQCategoryQuestion(
		com.vportal.portlet.vfaq.model.FAQCategoryQuestion faqCategoryQuestion)
		throws com.liferay.portal.kernel.exception.SystemException {
		_faqCategoryQuestionLocalService.deleteFAQCategoryQuestion(faqCategoryQuestion);
	}

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query to search with
	* @return the matching rows
	* @throws SystemException if a system exception occurred
	*/
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _faqCategoryQuestionLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param dynamicQuery the dynamic query to search with
	* @param start the lower bound of the range of model instances to return
	* @param end the upper bound of the range of model instances to return (not inclusive)
	* @return the range of matching rows
	* @throws SystemException if a system exception occurred
	*/
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException {
		return _faqCategoryQuestionLocalService.dynamicQuery(dynamicQuery,
			start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param dynamicQuery the dynamic query to search with
	* @param start the lower bound of the range of model instances to return
	* @param end the upper bound of the range of model instances to return (not inclusive)
	* @param orderByComparator the comparator to order the results by
	* @return the ordered range of matching rows
	* @throws SystemException if a system exception occurred
	*/
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _faqCategoryQuestionLocalService.dynamicQuery(dynamicQuery,
			start, end, orderByComparator);
	}

	/**
	* Counts the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query to search with
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _faqCategoryQuestionLocalService.dynamicQueryCount(dynamicQuery);
	}

	/**
	* Gets the f a q category question with the primary key.
	*
	* @param id the primary key of the f a q category question to get
	* @return the f a q category question
	* @throws PortalException if a f a q category question with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.vportal.portlet.vfaq.model.FAQCategoryQuestion getFAQCategoryQuestion(
		long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _faqCategoryQuestionLocalService.getFAQCategoryQuestion(id);
	}

	/**
	* Gets a range of all the f a q category questions.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of f a q category questions to return
	* @param end the upper bound of the range of f a q category questions to return (not inclusive)
	* @return the range of f a q category questions
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.vportal.portlet.vfaq.model.FAQCategoryQuestion> getFAQCategoryQuestions(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _faqCategoryQuestionLocalService.getFAQCategoryQuestions(start,
			end);
	}

	/**
	* Gets the number of f a q category questions.
	*
	* @return the number of f a q category questions
	* @throws SystemException if a system exception occurred
	*/
	public int getFAQCategoryQuestionsCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _faqCategoryQuestionLocalService.getFAQCategoryQuestionsCount();
	}

	/**
	* Updates the f a q category question in the database. Also notifies the appropriate model listeners.
	*
	* @param faqCategoryQuestion the f a q category question to update
	* @return the f a q category question that was updated
	* @throws SystemException if a system exception occurred
	*/
	public com.vportal.portlet.vfaq.model.FAQCategoryQuestion updateFAQCategoryQuestion(
		com.vportal.portlet.vfaq.model.FAQCategoryQuestion faqCategoryQuestion)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _faqCategoryQuestionLocalService.updateFAQCategoryQuestion(faqCategoryQuestion);
	}

	/**
	* Updates the f a q category question in the database. Also notifies the appropriate model listeners.
	*
	* @param faqCategoryQuestion the f a q category question to update
	* @param merge whether to merge the f a q category question with the current session. See {@link com.liferay.portal.service.persistence.BatchSession#update(com.liferay.portal.kernel.dao.orm.Session, com.liferay.portal.model.BaseModel, boolean)} for an explanation.
	* @return the f a q category question that was updated
	* @throws SystemException if a system exception occurred
	*/
	public com.vportal.portlet.vfaq.model.FAQCategoryQuestion updateFAQCategoryQuestion(
		com.vportal.portlet.vfaq.model.FAQCategoryQuestion faqCategoryQuestion,
		boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _faqCategoryQuestionLocalService.updateFAQCategoryQuestion(faqCategoryQuestion,
			merge);
	}

	public com.vportal.portlet.vfaq.model.FAQCategoryQuestion addCategoryQuestion(
		long categoryId, long questionId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _faqCategoryQuestionLocalService.addCategoryQuestion(categoryId,
			questionId);
	}

	public void deleteByQuestionId(long questionId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		_faqCategoryQuestionLocalService.deleteByQuestionId(questionId);
	}

	public void deleteByCategoryId(long categoryId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		_faqCategoryQuestionLocalService.deleteByCategoryId(categoryId);
	}

	public java.util.List getAll()
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _faqCategoryQuestionLocalService.getAll();
	}

	public java.util.List getQuestionsInCategory(long categoryId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _faqCategoryQuestionLocalService.getQuestionsInCategory(categoryId);
	}

	public java.util.List getCategoriesOfQuestion(long questionId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _faqCategoryQuestionLocalService.getCategoriesOfQuestion(questionId);
	}

	public FAQCategoryQuestionLocalService getWrappedFAQCategoryQuestionLocalService() {
		return _faqCategoryQuestionLocalService;
	}

	private FAQCategoryQuestionLocalService _faqCategoryQuestionLocalService;
}