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
 * The utility for the f a q question remote service. This utility wraps {@link com.vportal.portlet.vfaq.service.impl.FAQQuestionServiceImpl} and is the primary access point for service operations in application layer code running on a remote server.
 *
 * <p>
 * Never modify this class directly. Add custom service methods to {@link com.vportal.portlet.vfaq.service.impl.FAQQuestionServiceImpl} and rerun ServiceBuilder to regenerate this class.
 * </p>
 *
 * <p>
 * This is a remote service. Methods of this service are expected to have security checks based on the propagated JAAS credentials because this service can be accessed remotely.
 * </p>
 *
 * @author HOAN
 * @see FAQQuestionService
 * @see com.vportal.portlet.vfaq.service.base.FAQQuestionServiceBaseImpl
 * @see com.vportal.portlet.vfaq.service.impl.FAQQuestionServiceImpl
 * @generated
 */
public class FAQQuestionServiceUtil {
	public static com.vportal.portlet.vfaq.model.FAQQuestion addQuestion(
		java.lang.String title, java.lang.String content,
		java.lang.String language, int questionOrder, java.util.Date sentDate,
		java.lang.String sentByUser, java.lang.String senderEmail,
		java.lang.String questionType, int hitCount, boolean isApproved,
		long plid, long userId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .addQuestion(title, content, language, questionOrder,
			sentDate, sentByUser, senderEmail, questionType, hitCount,
			isApproved, plid, userId);
	}

	public static com.vportal.portlet.vfaq.model.FAQQuestion addQuestion(
		java.lang.String title, java.lang.String content,
		java.lang.String language, int questionOrder, java.util.Date sentDate,
		java.lang.String sentByUser, java.lang.String senderEmail,
		java.lang.String questionType, int hitCount, boolean isApproved,
		long plid, long userId, boolean addCommunityPermissions,
		boolean addGuestPermissions)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .addQuestion(title, content, language, questionOrder,
			sentDate, sentByUser, senderEmail, questionType, hitCount,
			isApproved, plid, userId, addCommunityPermissions,
			addGuestPermissions);
	}

	public static com.vportal.portlet.vfaq.model.FAQQuestion addQuestion(
		java.lang.String title, java.lang.String content,
		java.lang.String language, int questionOrder, java.util.Date sentDate,
		java.lang.String sentByUser, java.lang.String senderEmail,
		java.lang.String questionType, int hitCount, boolean isApproved,
		long plid, long userId, java.lang.String[] communityPermissions,
		java.lang.String[] guestPermissions)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .addQuestion(title, content, language, questionOrder,
			sentDate, sentByUser, senderEmail, questionType, hitCount,
			isApproved, plid, userId, communityPermissions, guestPermissions);
	}

	public static com.vportal.portlet.vfaq.model.FAQQuestion updateQuestion(
		long questionId, java.lang.String title, java.lang.String content,
		java.lang.String language, int questionOrder,
		java.util.Date modifiedDate, java.lang.String modifiedByUser,
		java.lang.String questionType, int hitCount, boolean isApproved,
		long groupId, long userId, java.lang.String senderEmail,
		java.lang.String sentByUser)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .updateQuestion(questionId, title, content, language,
			questionOrder, modifiedDate, modifiedByUser, questionType,
			hitCount, isApproved, groupId, userId, senderEmail, sentByUser);
	}

	public static void deleteQuestion(long groupId, long questionId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		getService().deleteQuestion(groupId, questionId);
	}

	public static com.vportal.portlet.vfaq.model.FAQQuestion unapproveQuestion(
		long groupId, long questionId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().unapproveQuestion(groupId, questionId);
	}

	public static com.vportal.portlet.vfaq.model.FAQQuestion approveQuestion(
		long groupId, long questionId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().approveQuestion(groupId, questionId);
	}

	public static com.vportal.portlet.vfaq.model.FAQQuestion getQuestion(
		long groupId, long questionId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getQuestion(groupId, questionId);
	}

	public static java.util.List getQuestionApproveByCategory(long groupId,
		java.lang.String language, long categoryId, java.lang.String title,
		int begin, int end, boolean approved)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.rmi.RemoteException {
		return getService()
				   .getQuestionApproveByCategory(groupId, language, categoryId,
			title, begin, end, approved);
	}

	public static java.util.List getQuestionApproveByCategory(long groupId,
		java.lang.String language, long categoryId, java.lang.String title,
		boolean approved)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.rmi.RemoteException {
		return getService()
				   .getQuestionApproveByCategory(groupId, language, categoryId,
			title, approved);
	}

	public static int countQuestionApproveByCategory(long groupId,
		java.lang.String language, long categoryId, java.lang.String title,
		boolean approved)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.rmi.RemoteException {
		return getService()
				   .countQuestionApproveByCategory(groupId, language,
			categoryId, title, approved);
	}

	public static java.util.List getQuestionByParam(long groupId,
		java.lang.String language, long categoryId, java.lang.String title,
		boolean approved, int start, int end)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.rmi.RemoteException {
		return getService()
				   .getQuestionByParam(groupId, language, categoryId, title,
			approved, start, end);
	}

	public static java.util.List getOrtherQuestionByParam(long groupId,
		java.lang.String language, long Id, long categoryId, boolean approved,
		int start, int end)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.rmi.RemoteException {
		return getService()
				   .getOrtherQuestionByParam(groupId, language, Id, categoryId,
			approved, start, end);
	}

	public static int countQuestionByParam(long groupId,
		java.lang.String language, long categoryId, java.lang.String title,
		boolean approved)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.rmi.RemoteException {
		return getService()
				   .countQuestionByParam(groupId, language, categoryId, title,
			approved);
	}

	public static java.util.List getQuestionByG_L_S(long groupId,
		java.lang.String language, boolean approved, int start, int end)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.rmi.RemoteException {
		return getService()
				   .getQuestionByG_L_S(groupId, language, approved, start, end);
	}

	public static int countQuestionByG_L_S(long groupId,
		java.lang.String language, boolean approved)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.rmi.RemoteException {
		return getService().countQuestionByG_L_S(groupId, language, approved);
	}

	public static com.vportal.portlet.vfaq.model.FAQQuestion findByPrimaryKey(
		long id) throws java.lang.Exception {
		return getService().findByPrimaryKey(id);
	}

	public static void reIndex(java.lang.String[] ids)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.rmi.RemoteException {
		getService().reIndex(ids);
	}

	public static com.liferay.portal.kernel.search.Hits search(long companyId,
		long groupId, long userId, java.lang.String keywords, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .search(companyId, groupId, userId, keywords, start, end);
	}

	public static void clearService() {
		_service = null;
	}

	public static FAQQuestionService getService() {
		if (_service == null) {
			Object obj = PortletBeanLocatorUtil.locate(ClpSerializer.SERVLET_CONTEXT_NAME,
					FAQQuestionService.class.getName());
			ClassLoader portletClassLoader = (ClassLoader)PortletBeanLocatorUtil.locate(ClpSerializer.SERVLET_CONTEXT_NAME,
					"portletClassLoader");

			ClassLoaderProxy classLoaderProxy = new ClassLoaderProxy(obj,
					portletClassLoader);

			_service = new FAQQuestionServiceClp(classLoaderProxy);

			ClpSerializer.setClassLoader(portletClassLoader);
		}

		return _service;
	}

	public void setService(FAQQuestionService service) {
		_service = service;
	}

	private static FAQQuestionService _service;
}