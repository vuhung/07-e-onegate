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

package com.vportal.portlet.pollsadmin.service.http;

import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;

import com.vportal.portlet.pollsadmin.service.PollsQuestionServiceUtil;

import java.rmi.RemoteException;

/**
 * <p>
 * This class provides a SOAP utility for the
 * {@link com.vportal.portlet.pollsadmin.service.PollsQuestionServiceUtil} service utility. The
 * static methods of this class calls the same methods of the service utility.
 * However, the signatures are different because it is difficult for SOAP to
 * support certain types.
 * </p>
 *
 * <p>
 * ServiceBuilder follows certain rules in translating the methods. For example,
 * if the method in the service utility returns a {@link java.util.List}, that
 * is translated to an array of {@link com.vportal.portlet.pollsadmin.model.PollsQuestionSoap}.
 * If the method in the service utility returns a
 * {@link com.vportal.portlet.pollsadmin.model.PollsQuestion}, that is translated to a
 * {@link com.vportal.portlet.pollsadmin.model.PollsQuestionSoap}. Methods that SOAP cannot
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
 * @author    ACB
 * @see       PollsQuestionServiceHttp
 * @see       com.vportal.portlet.pollsadmin.model.PollsQuestionSoap
 * @see       com.vportal.portlet.pollsadmin.service.PollsQuestionServiceUtil
 * @generated
 */
public class PollsQuestionServiceSoap {
	public static com.vportal.portlet.pollsadmin.model.PollsQuestionSoap addQuestion(
		long plid, java.lang.String title, java.lang.String description,
		int expirationDateMonth, int expirationDateDay, int expirationDateYear,
		int expirationDateHour, int expirationDateMinute, boolean neverExpire,
		java.util.List<com.vportal.portlet.pollsadmin.model.PollsChoice> choices)
		throws RemoteException {
		try {
			com.vportal.portlet.pollsadmin.model.PollsQuestion returnValue = PollsQuestionServiceUtil.addQuestion(plid,
					title, description, expirationDateMonth, expirationDateDay,
					expirationDateYear, expirationDateHour,
					expirationDateMinute, neverExpire, choices);

			return com.vportal.portlet.pollsadmin.model.PollsQuestionSoap.toSoapModel(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static void deleteQuestion(long questionId)
		throws RemoteException {
		try {
			PollsQuestionServiceUtil.deleteQuestion(questionId);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static com.vportal.portlet.pollsadmin.model.PollsQuestionSoap getQuestion(
		long questionId) throws RemoteException {
		try {
			com.vportal.portlet.pollsadmin.model.PollsQuestion returnValue = PollsQuestionServiceUtil.getQuestion(questionId);

			return com.vportal.portlet.pollsadmin.model.PollsQuestionSoap.toSoapModel(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static com.vportal.portlet.pollsadmin.model.PollsQuestionSoap updateQuestion(
		long questionId, java.lang.String title, java.lang.String description,
		int expirationDateMonth, int expirationDateDay, int expirationDateYear,
		int expirationDateHour, int expirationDateMinute, boolean neverExpire,
		java.util.List<com.vportal.portlet.pollsadmin.model.PollsChoice> choices)
		throws RemoteException {
		try {
			com.vportal.portlet.pollsadmin.model.PollsQuestion returnValue = PollsQuestionServiceUtil.updateQuestion(questionId,
					title, description, expirationDateMonth, expirationDateDay,
					expirationDateYear, expirationDateHour,
					expirationDateMinute, neverExpire, choices);

			return com.vportal.portlet.pollsadmin.model.PollsQuestionSoap.toSoapModel(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	private static Log _log = LogFactoryUtil.getLog(PollsQuestionServiceSoap.class);
}