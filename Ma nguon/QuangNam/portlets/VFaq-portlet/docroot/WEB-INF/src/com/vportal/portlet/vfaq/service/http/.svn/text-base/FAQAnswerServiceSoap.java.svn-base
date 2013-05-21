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

import com.vportal.portlet.vfaq.service.FAQAnswerServiceUtil;

import java.rmi.RemoteException;

/**
 * <p>
 * This class provides a SOAP utility for the
 * {@link com.vportal.portlet.vfaq.service.FAQAnswerServiceUtil} service utility. The
 * static methods of this class calls the same methods of the service utility.
 * However, the signatures are different because it is difficult for SOAP to
 * support certain types.
 * </p>
 *
 * <p>
 * ServiceBuilder follows certain rules in translating the methods. For example,
 * if the method in the service utility returns a {@link java.util.List}, that
 * is translated to an array of {@link com.vportal.portlet.vfaq.model.FAQAnswerSoap}.
 * If the method in the service utility returns a
 * {@link com.vportal.portlet.vfaq.model.FAQAnswer}, that is translated to a
 * {@link com.vportal.portlet.vfaq.model.FAQAnswerSoap}. Methods that SOAP cannot
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
 * @see       FAQAnswerServiceHttp
 * @see       com.vportal.portlet.vfaq.model.FAQAnswerSoap
 * @see       com.vportal.portlet.vfaq.service.FAQAnswerServiceUtil
 * @generated
 */
public class FAQAnswerServiceSoap {
	public static com.vportal.portlet.vfaq.model.FAQAnswerSoap addAnswer(
		long groupId, long questionId, java.lang.String content,
		int answerOrder, java.lang.String answeredByUser,
		java.util.Date answeredDate, java.lang.String language,
		boolean isApproved, java.lang.String approvedByUser,
		java.util.Date approvedDate, long userId, java.lang.String attachName,
		long folderId) throws RemoteException {
		try {
			com.vportal.portlet.vfaq.model.FAQAnswer returnValue = FAQAnswerServiceUtil.addAnswer(groupId,
					questionId, content, answerOrder, answeredByUser,
					answeredDate, language, isApproved, approvedByUser,
					approvedDate, userId, attachName, folderId);

			return com.vportal.portlet.vfaq.model.FAQAnswerSoap.toSoapModel(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static com.vportal.portlet.vfaq.model.FAQAnswerSoap addAnswer(
		long groupId, long questionId, java.lang.String content,
		int answerOrder, java.lang.String answeredByUser,
		java.util.Date answeredDate, java.lang.String language,
		boolean isApproved, java.lang.String approvedByUser,
		java.util.Date approvedDate, long userId, java.lang.String attachName,
		long folderId, boolean addCommunityPermissions,
		boolean addGuestPermissions) throws RemoteException {
		try {
			com.vportal.portlet.vfaq.model.FAQAnswer returnValue = FAQAnswerServiceUtil.addAnswer(groupId,
					questionId, content, answerOrder, answeredByUser,
					answeredDate, language, isApproved, approvedByUser,
					approvedDate, userId, attachName, folderId,
					addCommunityPermissions, addGuestPermissions);

			return com.vportal.portlet.vfaq.model.FAQAnswerSoap.toSoapModel(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static com.vportal.portlet.vfaq.model.FAQAnswerSoap addAnswer(
		long groupId, long questionId, java.lang.String content,
		int answerOrder, java.lang.String answeredByUser,
		java.util.Date answeredDate, java.lang.String language,
		boolean isApproved, java.lang.String approvedByUser,
		java.util.Date approvedDate, long userId, java.lang.String attachName,
		long folderId, java.lang.String[] communityPermissions,
		java.lang.String[] guestPermissions) throws RemoteException {
		try {
			com.vportal.portlet.vfaq.model.FAQAnswer returnValue = FAQAnswerServiceUtil.addAnswer(groupId,
					questionId, content, answerOrder, answeredByUser,
					answeredDate, language, isApproved, approvedByUser,
					approvedDate, userId, attachName, folderId,
					communityPermissions, guestPermissions);

			return com.vportal.portlet.vfaq.model.FAQAnswerSoap.toSoapModel(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static com.vportal.portlet.vfaq.model.FAQAnswerSoap updateAnswer(
		long groupId, long answerId, java.lang.String content, int answerOrder,
		java.lang.String answeredByUser, java.util.Date answeredDate,
		java.lang.String language, boolean isApproved,
		java.lang.String approvedByUser, java.util.Date approvedDate,
		long userId, java.lang.String attachName, long folderId)
		throws RemoteException {
		try {
			com.vportal.portlet.vfaq.model.FAQAnswer returnValue = FAQAnswerServiceUtil.updateAnswer(groupId,
					answerId, content, answerOrder, answeredByUser,
					answeredDate, language, isApproved, approvedByUser,
					approvedDate, userId, attachName, folderId);

			return com.vportal.portlet.vfaq.model.FAQAnswerSoap.toSoapModel(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static void deleteAnswer(long groupId, long answerid)
		throws RemoteException {
		try {
			FAQAnswerServiceUtil.deleteAnswer(groupId, answerid);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static com.vportal.portlet.vfaq.model.FAQAnswerSoap approveAnswer(
		long groupId, long answerId, java.lang.String approvedByUser)
		throws RemoteException {
		try {
			com.vportal.portlet.vfaq.model.FAQAnswer returnValue = FAQAnswerServiceUtil.approveAnswer(groupId,
					answerId, approvedByUser);

			return com.vportal.portlet.vfaq.model.FAQAnswerSoap.toSoapModel(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static com.vportal.portlet.vfaq.model.FAQAnswerSoap unapproveAnswer(
		long groupId, long answerId, java.lang.String approvedByUser)
		throws RemoteException {
		try {
			com.vportal.portlet.vfaq.model.FAQAnswer returnValue = FAQAnswerServiceUtil.unapproveAnswer(groupId,
					answerId, approvedByUser);

			return com.vportal.portlet.vfaq.model.FAQAnswerSoap.toSoapModel(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static com.vportal.portlet.vfaq.model.FAQAnswerSoap getAnswer(
		long groupId, long answerId) throws RemoteException {
		try {
			com.vportal.portlet.vfaq.model.FAQAnswer returnValue = FAQAnswerServiceUtil.getAnswer(groupId,
					answerId);

			return com.vportal.portlet.vfaq.model.FAQAnswerSoap.toSoapModel(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static int countQuestion(long questionid) throws RemoteException {
		try {
			int returnValue = FAQAnswerServiceUtil.countQuestion(questionid);

			return returnValue;
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	private static Log _log = LogFactoryUtil.getLog(FAQAnswerServiceSoap.class);
}