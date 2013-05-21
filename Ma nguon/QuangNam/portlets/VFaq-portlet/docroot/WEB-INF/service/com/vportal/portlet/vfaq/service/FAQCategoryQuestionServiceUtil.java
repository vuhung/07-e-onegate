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
 * The utility for the f a q category question remote service. This utility wraps {@link com.vportal.portlet.vfaq.service.impl.FAQCategoryQuestionServiceImpl} and is the primary access point for service operations in application layer code running on a remote server.
 *
 * <p>
 * Never modify this class directly. Add custom service methods to {@link com.vportal.portlet.vfaq.service.impl.FAQCategoryQuestionServiceImpl} and rerun ServiceBuilder to regenerate this class.
 * </p>
 *
 * <p>
 * This is a remote service. Methods of this service are expected to have security checks based on the propagated JAAS credentials because this service can be accessed remotely.
 * </p>
 *
 * @author HOAN
 * @see FAQCategoryQuestionService
 * @see com.vportal.portlet.vfaq.service.base.FAQCategoryQuestionServiceBaseImpl
 * @see com.vportal.portlet.vfaq.service.impl.FAQCategoryQuestionServiceImpl
 * @generated
 */
public class FAQCategoryQuestionServiceUtil {
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

	public static FAQCategoryQuestionService getService() {
		if (_service == null) {
			Object obj = PortletBeanLocatorUtil.locate(ClpSerializer.SERVLET_CONTEXT_NAME,
					FAQCategoryQuestionService.class.getName());
			ClassLoader portletClassLoader = (ClassLoader)PortletBeanLocatorUtil.locate(ClpSerializer.SERVLET_CONTEXT_NAME,
					"portletClassLoader");

			ClassLoaderProxy classLoaderProxy = new ClassLoaderProxy(obj,
					portletClassLoader);

			_service = new FAQCategoryQuestionServiceClp(classLoaderProxy);

			ClpSerializer.setClassLoader(portletClassLoader);
		}

		return _service;
	}

	public void setService(FAQCategoryQuestionService service) {
		_service = service;
	}

	private static FAQCategoryQuestionService _service;
}