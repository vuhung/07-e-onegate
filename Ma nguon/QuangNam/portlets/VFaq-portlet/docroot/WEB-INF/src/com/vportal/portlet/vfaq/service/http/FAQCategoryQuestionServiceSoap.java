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

package com.vportal.portlet.vfaq.service.http;

import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;

import com.vportal.portlet.vfaq.service.FAQCategoryQuestionServiceUtil;

import java.rmi.RemoteException;

/**
 * <p>
 * This class provides a SOAP utility for the
 * {@link com.vportal.portlet.vfaq.service.FAQCategoryQuestionServiceUtil} service utility. The
 * static methods of this class calls the same methods of the service utility.
 * However, the signatures are different because it is difficult for SOAP to
 * support certain types.
 * </p>
 *
 * <p>
 * ServiceBuilder follows certain rules in translating the methods. For example,
 * if the method in the service utility returns a {@link java.util.List}, that
 * is translated to an array of {@link com.vportal.portlet.vfaq.model.FAQCategoryQuestionSoap}.
 * If the method in the service utility returns a
 * {@link com.vportal.portlet.vfaq.model.FAQCategoryQuestion}, that is translated to a
 * {@link com.vportal.portlet.vfaq.model.FAQCategoryQuestionSoap}. Methods that SOAP cannot
 * safely wire are skipped.
 * </p>
 *
 * <p>
 * The benefits of using the SOAP utility is that it is cross platform
 * compatible. SOAP allows different languages like Java, .NET, C++, PHP, and
 * even Perl, to call the generated services. One drawback of SOAP is that it is
 * slow because it needs to serialize all calls into a text format (XML).
 * </p>
 *
 * <p>
 * You can see a list of services at
 * http://localhost:8080/tunnel-web/secure/axis. Set the property
 * <b>tunnel.servlet.hosts.allowed</b> in portal.properties to configure
 * security.
 * </p>
 *
 * <p>
 * The SOAP utility is only generated for remote services.
 * </p>
 *
 * @author    HOAN
 * @see       FAQCategoryQuestionServiceHttp
 * @see       com.vportal.portlet.vfaq.model.FAQCategoryQuestionSoap
 * @see       com.vportal.portlet.vfaq.service.FAQCategoryQuestionServiceUtil
 * @generated
 */
public class FAQCategoryQuestionServiceSoap {
	public static com.vportal.portlet.vfaq.model.FAQCategoryQuestionSoap addCategoryQuestion(
		long categoryId, long questionId) throws RemoteException {
		try {
			com.vportal.portlet.vfaq.model.FAQCategoryQuestion returnValue = FAQCategoryQuestionServiceUtil.addCategoryQuestion(categoryId,
					questionId);

			return com.vportal.portlet.vfaq.model.FAQCategoryQuestionSoap.toSoapModel(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static void deleteByQuestionId(long questionId)
		throws RemoteException {
		try {
			FAQCategoryQuestionServiceUtil.deleteByQuestionId(questionId);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static void deleteByCategoryId(long categoryId)
		throws RemoteException {
		try {
			FAQCategoryQuestionServiceUtil.deleteByCategoryId(categoryId);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static com.vportal.portlet.vfaq.model.FAQCategoryQuestionSoap[] getAll()
		throws RemoteException {
		try {
			java.util.List returnValue = FAQCategoryQuestionServiceUtil.getAll();

			return com.vportal.portlet.vfaq.model.FAQCategoryQuestionSoap.toSoapModels(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static com.vportal.portlet.vfaq.model.FAQCategoryQuestionSoap[] getQuestionsInCategory(
		long categoryId) throws RemoteException {
		try {
			java.util.List returnValue = FAQCategoryQuestionServiceUtil.getQuestionsInCategory(categoryId);

			return com.vportal.portlet.vfaq.model.FAQCategoryQuestionSoap.toSoapModels(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static com.vportal.portlet.vfaq.model.FAQCategoryQuestionSoap[] getCategoriesOfQuestion(
		long questionId) throws RemoteException {
		try {
			java.util.List returnValue = FAQCategoryQuestionServiceUtil.getCategoriesOfQuestion(questionId);

			return com.vportal.portlet.vfaq.model.FAQCategoryQuestionSoap.toSoapModels(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	private static Log _log = LogFactoryUtil.getLog(FAQCategoryQuestionServiceSoap.class);
}