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

import com.vportal.portlet.vfaq.service.FAQQuestionServiceUtil;

import java.rmi.RemoteException;

/**
 * <p>
 * This class provides a SOAP utility for the
 * {@link com.vportal.portlet.vfaq.service.FAQQuestionServiceUtil} service utility. The
 * static methods of this class calls the same methods of the service utility.
 * However, the signatures are different because it is difficult for SOAP to
 * support certain types.
 * </p>
 *
 * <p>
 * ServiceBuilder follows certain rules in translating the methods. For example,
 * if the method in the service utility returns a {@link java.util.List}, that
 * is translated to an array of {@link com.vportal.portlet.vfaq.model.FAQQuestionSoap}.
 * If the method in the service utility returns a
 * {@link com.vportal.portlet.vfaq.model.FAQQuestion}, that is translated to a
 * {@link com.vportal.portlet.vfaq.model.FAQQuestionSoap}. Methods that SOAP cannot
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
 * @see       FAQQuestionServiceHttp
 * @see       com.vportal.portlet.vfaq.model.FAQQuestionSoap
 * @see       com.vportal.portlet.vfaq.service.FAQQuestionServiceUtil
 * @generated
 */
public class FAQQuestionServiceSoap {
	public static com.vportal.portlet.vfaq.model.FAQQuestionSoap addQuestion(
		java.lang.String title, java.lang.String content,
		java.lang.String language, int questionOrder, java.util.Date sentDate,
		java.lang.String sentByUser, java.lang.String senderEmail,
		java.lang.String questionType, int hitCount, boolean isApproved,
		long plid, long userId) throws RemoteException {
		try {
			com.vportal.portlet.vfaq.model.FAQQuestion returnValue = FAQQuestionServiceUtil.addQuestion(title,
					content, language, questionOrder, sentDate, sentByUser,
					senderEmail, questionType, hitCount, isApproved, plid,
					userId);

			return com.vportal.portlet.vfaq.model.FAQQuestionSoap.toSoapModel(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static com.vportal.portlet.vfaq.model.FAQQuestionSoap addQuestion(
		java.lang.String title, java.lang.String content,
		java.lang.String language, int questionOrder, java.util.Date sentDate,
		java.lang.String sentByUser, java.lang.String senderEmail,
		java.lang.String questionType, int hitCount, boolean isApproved,
		long plid, long userId, boolean addCommunityPermissions,
		boolean addGuestPermissions) throws RemoteException {
		try {
			com.vportal.portlet.vfaq.model.FAQQuestion returnValue = FAQQuestionServiceUtil.addQuestion(title,
					content, language, questionOrder, sentDate, sentByUser,
					senderEmail, questionType, hitCount, isApproved, plid,
					userId, addCommunityPermissions, addGuestPermissions);

			return com.vportal.portlet.vfaq.model.FAQQuestionSoap.toSoapModel(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static com.vportal.portlet.vfaq.model.FAQQuestionSoap addQuestion(
		java.lang.String title, java.lang.String content,
		java.lang.String language, int questionOrder, java.util.Date sentDate,
		java.lang.String sentByUser, java.lang.String senderEmail,
		java.lang.String questionType, int hitCount, boolean isApproved,
		long plid, long userId, java.lang.String[] communityPermissions,
		java.lang.String[] guestPermissions) throws RemoteException {
		try {
			com.vportal.portlet.vfaq.model.FAQQuestion returnValue = FAQQuestionServiceUtil.addQuestion(title,
					content, language, questionOrder, sentDate, sentByUser,
					senderEmail, questionType, hitCount, isApproved, plid,
					userId, communityPermissions, guestPermissions);

			return com.vportal.portlet.vfaq.model.FAQQuestionSoap.toSoapModel(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static com.vportal.portlet.vfaq.model.FAQQuestionSoap updateQuestion(
		long questionId, java.lang.String title, java.lang.String content,
		java.lang.String language, int questionOrder,
		java.util.Date modifiedDate, java.lang.String modifiedByUser,
		java.lang.String questionType, int hitCount, boolean isApproved,
		long groupId, long userId, java.lang.String senderEmail,
		java.lang.String sentByUser) throws RemoteException {
		try {
			com.vportal.portlet.vfaq.model.FAQQuestion returnValue = FAQQuestionServiceUtil.updateQuestion(questionId,
					title, content, language, questionOrder, modifiedDate,
					modifiedByUser, questionType, hitCount, isApproved,
					groupId, userId, senderEmail, sentByUser);

			return com.vportal.portlet.vfaq.model.FAQQuestionSoap.toSoapModel(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static void deleteQuestion(long groupId, long questionId)
		throws RemoteException {
		try {
			FAQQuestionServiceUtil.deleteQuestion(groupId, questionId);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static com.vportal.portlet.vfaq.model.FAQQuestionSoap unapproveQuestion(
		long groupId, long questionId) throws RemoteException {
		try {
			com.vportal.portlet.vfaq.model.FAQQuestion returnValue = FAQQuestionServiceUtil.unapproveQuestion(groupId,
					questionId);

			return com.vportal.portlet.vfaq.model.FAQQuestionSoap.toSoapModel(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static com.vportal.portlet.vfaq.model.FAQQuestionSoap approveQuestion(
		long groupId, long questionId) throws RemoteException {
		try {
			com.vportal.portlet.vfaq.model.FAQQuestion returnValue = FAQQuestionServiceUtil.approveQuestion(groupId,
					questionId);

			return com.vportal.portlet.vfaq.model.FAQQuestionSoap.toSoapModel(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static com.vportal.portlet.vfaq.model.FAQQuestionSoap getQuestion(
		long groupId, long questionId) throws RemoteException {
		try {
			com.vportal.portlet.vfaq.model.FAQQuestion returnValue = FAQQuestionServiceUtil.getQuestion(groupId,
					questionId);

			return com.vportal.portlet.vfaq.model.FAQQuestionSoap.toSoapModel(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static com.vportal.portlet.vfaq.model.FAQQuestionSoap[] getQuestionApproveByCategory(
		long groupId, java.lang.String language, long categoryId,
		java.lang.String title, int begin, int end, boolean approved)
		throws RemoteException {
		try {
			java.util.List returnValue = FAQQuestionServiceUtil.getQuestionApproveByCategory(groupId,
					language, categoryId, title, begin, end, approved);

			return com.vportal.portlet.vfaq.model.FAQQuestionSoap.toSoapModels(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static com.vportal.portlet.vfaq.model.FAQQuestionSoap[] getQuestionApproveByCategory(
		long groupId, java.lang.String language, long categoryId,
		java.lang.String title, boolean approved) throws RemoteException {
		try {
			java.util.List returnValue = FAQQuestionServiceUtil.getQuestionApproveByCategory(groupId,
					language, categoryId, title, approved);

			return com.vportal.portlet.vfaq.model.FAQQuestionSoap.toSoapModels(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static int countQuestionApproveByCategory(long groupId,
		java.lang.String language, long categoryId, java.lang.String title,
		boolean approved) throws RemoteException {
		try {
			int returnValue = FAQQuestionServiceUtil.countQuestionApproveByCategory(groupId,
					language, categoryId, title, approved);

			return returnValue;
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static com.vportal.portlet.vfaq.model.FAQQuestionSoap[] getQuestionByParam(
		long groupId, java.lang.String language, long categoryId,
		java.lang.String title, boolean approved, int start, int end)
		throws RemoteException {
		try {
			java.util.List returnValue = FAQQuestionServiceUtil.getQuestionByParam(groupId,
					language, categoryId, title, approved, start, end);

			return com.vportal.portlet.vfaq.model.FAQQuestionSoap.toSoapModels(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static com.vportal.portlet.vfaq.model.FAQQuestionSoap[] getOrtherQuestionByParam(
		long groupId, java.lang.String language, long Id, long categoryId,
		boolean approved, int start, int end) throws RemoteException {
		try {
			java.util.List returnValue = FAQQuestionServiceUtil.getOrtherQuestionByParam(groupId,
					language, Id, categoryId, approved, start, end);

			return com.vportal.portlet.vfaq.model.FAQQuestionSoap.toSoapModels(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static int countQuestionByParam(long groupId,
		java.lang.String language, long categoryId, java.lang.String title,
		boolean approved) throws RemoteException {
		try {
			int returnValue = FAQQuestionServiceUtil.countQuestionByParam(groupId,
					language, categoryId, title, approved);

			return returnValue;
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static com.vportal.portlet.vfaq.model.FAQQuestionSoap[] getQuestionByG_L_S(
		long groupId, java.lang.String language, boolean approved, int start,
		int end) throws RemoteException {
		try {
			java.util.List returnValue = FAQQuestionServiceUtil.getQuestionByG_L_S(groupId,
					language, approved, start, end);

			return com.vportal.portlet.vfaq.model.FAQQuestionSoap.toSoapModels(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static int countQuestionByG_L_S(long groupId,
		java.lang.String language, boolean approved) throws RemoteException {
		try {
			int returnValue = FAQQuestionServiceUtil.countQuestionByG_L_S(groupId,
					language, approved);

			return returnValue;
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static com.vportal.portlet.vfaq.model.FAQQuestionSoap findByPrimaryKey(
		long id) throws RemoteException {
		try {
			com.vportal.portlet.vfaq.model.FAQQuestion returnValue = FAQQuestionServiceUtil.findByPrimaryKey(id);

			return com.vportal.portlet.vfaq.model.FAQQuestionSoap.toSoapModel(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static void reIndex(java.lang.String[] ids)
		throws RemoteException {
		try {
			FAQQuestionServiceUtil.reIndex(ids);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static com.liferay.portal.kernel.search.Hits search(long companyId,
		long groupId, long userId, java.lang.String keywords, int start, int end)
		throws RemoteException {
		try {
			com.liferay.portal.kernel.search.Hits returnValue = FAQQuestionServiceUtil.search(companyId,
					groupId, userId, keywords, start, end);

			return returnValue;
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	private static Log _log = LogFactoryUtil.getLog(FAQQuestionServiceSoap.class);
}