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

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.util.ClassLoaderProxy;

/**
 * The utility for the f a q category question local service. This utility wraps {@link com.vportal.portlet.vfaq.service.impl.FAQCategoryQuestionLocalServiceImpl} and is the primary access point for service operations in application layer code running on the local server.
 *
 * <p>
 * Never modify this class directly. Add custom service methods to {@link com.vportal.portlet.vfaq.service.impl.FAQCategoryQuestionLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
 * </p>
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author HOAN
 * @see FAQCategoryQuestionLocalService
 * @see com.vportal.portlet.vfaq.service.base.FAQCategoryQuestionLocalServiceBaseImpl
 * @see com.vportal.portlet.vfaq.service.impl.FAQCategoryQuestionLocalServiceImpl
 * @generated
 */
public class FAQCategoryQuestionLocalServiceUtil {
	/**
	* Adds the f a q category question to the database. Also notifies the appropriate model listeners.
	*
	* @param faqCategoryQuestion the f a q category question to add
	* @return the f a q category question that was added
	* @throws SystemException if a system exception occurred
	*/
	public static com.vportal.portlet.vfaq.model.FAQCategoryQuestion addFAQCategoryQuestion(
		com.vportal.portlet.vfaq.model.FAQCategoryQuestion faqCategoryQuestion)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().addFAQCategoryQuestion(faqCategoryQuestion);
	}

	/**
	* Creates a new f a q category question with the primary key. Does not add the f a q category question to the database.
	*
	* @param id the primary key for the new f a q category question
	* @return the new f a q category question
	*/
	public static com.vportal.portlet.vfaq.model.FAQCategoryQuestion createFAQCategoryQuestion(
		long id) {
		return getService().createFAQCategoryQuestion(id);
	}

	/**
	* Deletes the f a q category question with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the f a q category question to delete
	* @throws PortalException if a f a q category question with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static void deleteFAQCategoryQuestion(long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		getService().deleteFAQCategoryQuestion(id);
	}

	/**
	* Deletes the f a q category question from the database. Also notifies the appropriate model listeners.
	*
	* @param faqCategoryQuestion the f a q category question to delete
	* @throws SystemException if a system exception occurred
	*/
	public static void deleteFAQCategoryQuestion(
		com.vportal.portlet.vfaq.model.FAQCategoryQuestion faqCategoryQuestion)
		throws com.liferay.portal.kernel.exception.SystemException {
		getService().deleteFAQCategoryQuestion(faqCategoryQuestion);
	}

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query to search with
	* @return the matching rows
	* @throws SystemException if a system exception occurred
	*/
	@SuppressWarnings("rawtypes")
	public static java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().dynamicQuery(dynamicQuery);
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
	public static java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException {
		return getService().dynamicQuery(dynamicQuery, start, end);
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
	public static java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .dynamicQuery(dynamicQuery, start, end, orderByComparator);
	}

	/**
	* Counts the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query to search with
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	public static long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().dynamicQueryCount(dynamicQuery);
	}

	/**
	* Gets the f a q category question with the primary key.
	*
	* @param id the primary key of the f a q category question to get
	* @return the f a q category question
	* @throws PortalException if a f a q category question with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.vportal.portlet.vfaq.model.FAQCategoryQuestion getFAQCategoryQuestion(
		long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getFAQCategoryQuestion(id);
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
	public static java.util.List<com.vportal.portlet.vfaq.model.FAQCategoryQuestion> getFAQCategoryQuestions(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getFAQCategoryQuestions(start, end);
	}

	/**
	* Gets the number of f a q category questions.
	*
	* @return the number of f a q category questions
	* @throws SystemException if a system exception occurred
	*/
	public static int getFAQCategoryQuestionsCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getFAQCategoryQuestionsCount();
	}

	/**
	* Updates the f a q category question in the database. Also notifies the appropriate model listeners.
	*
	* @param faqCategoryQuestion the f a q category question to update
	* @return the f a q category question that was updated
	* @throws SystemException if a system exception occurred
	*/
	public static com.vportal.portlet.vfaq.model.FAQCategoryQuestion updateFAQCategoryQuestion(
		com.vportal.portlet.vfaq.model.FAQCategoryQuestion faqCategoryQuestion)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().updateFAQCategoryQuestion(faqCategoryQuestion);
	}

	/**
	* Updates the f a q category question in the database. Also notifies the appropriate model listeners.
	*
	* @param faqCategoryQuestion the f a q category question to update
	* @param merge whether to merge the f a q category question with the current session. See {@link com.liferay.portal.service.persistence.BatchSession#update(com.liferay.portal.kernel.dao.orm.Session, com.liferay.portal.model.BaseModel, boolean)} for an explanation.
	* @return the f a q category question that was updated
	* @throws SystemException if a system exception occurred
	*/
	public static com.vportal.portlet.vfaq.model.FAQCategoryQuestion updateFAQCategoryQuestion(
		com.vportal.portlet.vfaq.model.FAQCategoryQuestion faqCategoryQuestion,
		boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().updateFAQCategoryQuestion(faqCategoryQuestion, merge);
	}

	public static com.vportal.portlet.vfaq.model.FAQCategoryQuestion addCategoryQuestion(
		long categoryId, long questionId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().addCategoryQuestion(categoryId, questionId);
	}

	public static void deleteByQuestionId(long questionId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		getService().deleteByQuestionId(questionId);
	}

	public static void deleteByCategoryId(long categoryId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		getService().deleteByCategoryId(categoryId);
	}

	public static java.util.List getAll()
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getAll();
	}

	public static java.util.List getQuestionsInCategory(long categoryId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getQuestionsInCategory(categoryId);
	}

	public static java.util.List getCategoriesOfQuestion(long questionId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getCategoriesOfQuestion(questionId);
	}

	public static void clearService() {
		_service = null;
	}

	public static FAQCategoryQuestionLocalService getService() {
		if (_service == null) {
			Object obj = PortletBeanLocatorUtil.locate(ClpSerializer.SERVLET_CONTEXT_NAME,
					FAQCategoryQuestionLocalService.class.getName());
			ClassLoader portletClassLoader = (ClassLoader)PortletBeanLocatorUtil.locate(ClpSerializer.SERVLET_CONTEXT_NAME,
					"portletClassLoader");

			ClassLoaderProxy classLoaderProxy = new ClassLoaderProxy(obj,
					portletClassLoader);

			_service = new FAQCategoryQuestionLocalServiceClp(classLoaderProxy);

			ClpSerializer.setClassLoader(portletClassLoader);
		}

		return _service;
	}

	public void setService(FAQCategoryQuestionLocalService service) {
		_service = service;
	}

	private static FAQCategoryQuestionLocalService _service;
}