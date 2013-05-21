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
 * The utility for the f a q answer remote service. This utility wraps {@link com.vportal.portlet.vfaq.service.impl.FAQAnswerServiceImpl} and is the primary access point for service operations in application layer code running on a remote server.
 *
 * <p>
 * Never modify this class directly. Add custom service methods to {@link com.vportal.portlet.vfaq.service.impl.FAQAnswerServiceImpl} and rerun ServiceBuilder to regenerate this class.
 * </p>
 *
 * <p>
 * This is a remote service. Methods of this service are expected to have security checks based on the propagated JAAS credentials because this service can be accessed remotely.
 * </p>
 *
 * @author HOAN
 * @see FAQAnswerService
 * @see com.vportal.portlet.vfaq.service.base.FAQAnswerServiceBaseImpl
 * @see com.vportal.portlet.vfaq.service.impl.FAQAnswerServiceImpl
 * @generated
 */
public class FAQAnswerServiceUtil {
	/**
	* Them 1 answer moi vao database
	*/
	public static com.vportal.portlet.vfaq.model.FAQAnswer addAnswer(
		long groupId, long questionId, java.lang.String content,
		int answerOrder, java.lang.String answeredByUser,
		java.util.Date answeredDate, java.lang.String language,
		boolean isApproved, java.lang.String approvedByUser,
		java.util.Date approvedDate, long userId, java.lang.String attachName,
		long folderId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .addAnswer(groupId, questionId, content, answerOrder,
			answeredByUser, answeredDate, language, isApproved, approvedByUser,
			approvedDate, userId, attachName, folderId);
	}

	/**
	* Them 1 answer moi vao database
	*/
	public static com.vportal.portlet.vfaq.model.FAQAnswer addAnswer(
		long groupId, long questionId, java.lang.String content,
		int answerOrder, java.lang.String answeredByUser,
		java.util.Date answeredDate, java.lang.String language,
		boolean isApproved, java.lang.String approvedByUser,
		java.util.Date approvedDate, long userId, java.lang.String attachName,
		long folderId, boolean addCommunityPermissions,
		boolean addGuestPermissions)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .addAnswer(groupId, questionId, content, answerOrder,
			answeredByUser, answeredDate, language, isApproved, approvedByUser,
			approvedDate, userId, attachName, folderId,
			addCommunityPermissions, addGuestPermissions);
	}

	/**
	* Them 1 answer moi vao database
	*/
	public static com.vportal.portlet.vfaq.model.FAQAnswer addAnswer(
		long groupId, long questionId, java.lang.String content,
		int answerOrder, java.lang.String answeredByUser,
		java.util.Date answeredDate, java.lang.String language,
		boolean isApproved, java.lang.String approvedByUser,
		java.util.Date approvedDate, long userId, java.lang.String attachName,
		long folderId, java.lang.String[] communityPermissions,
		java.lang.String[] guestPermissions)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .addAnswer(groupId, questionId, content, answerOrder,
			answeredByUser, answeredDate, language, isApproved, approvedByUser,
			approvedDate, userId, attachName, folderId, communityPermissions,
			guestPermissions);
	}

	/**
	* Sua 1 answer da co
	*/
	public static com.vportal.portlet.vfaq.model.FAQAnswer updateAnswer(
		long groupId, long answerId, java.lang.String content, int answerOrder,
		java.lang.String answeredByUser, java.util.Date answeredDate,
		java.lang.String language, boolean isApproved,
		java.lang.String approvedByUser, java.util.Date approvedDate,
		long userId, java.lang.String attachName, long folderId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .updateAnswer(groupId, answerId, content, answerOrder,
			answeredByUser, answeredDate, language, isApproved, approvedByUser,
			approvedDate, userId, attachName, folderId);
	}

	/**
	* Xoa 1 answer
	*/
	public static void deleteAnswer(long groupId, long answerid)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		getService().deleteAnswer(groupId, answerid);
	}

	public static com.vportal.portlet.vfaq.model.FAQAnswer approveAnswer(
		long groupId, long answerId, java.lang.String approvedByUser)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().approveAnswer(groupId, answerId, approvedByUser);
	}

	/**
	* Huy viec hien thi 1 answer
	*/
	public static com.vportal.portlet.vfaq.model.FAQAnswer unapproveAnswer(
		long groupId, long answerId, java.lang.String approvedByUser)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().unapproveAnswer(groupId, answerId, approvedByUser);
	}

	public static com.vportal.portlet.vfaq.model.FAQAnswer getAnswer(
		long groupId, long answerId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getAnswer(groupId, answerId);
	}

	public static int countQuestion(long questionid)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().countQuestion(questionid);
	}

	public static void clearService() {
		_service = null;
	}

	public static FAQAnswerService getService() {
		if (_service == null) {
			Object obj = PortletBeanLocatorUtil.locate(ClpSerializer.SERVLET_CONTEXT_NAME,
					FAQAnswerService.class.getName());
			ClassLoader portletClassLoader = (ClassLoader)PortletBeanLocatorUtil.locate(ClpSerializer.SERVLET_CONTEXT_NAME,
					"portletClassLoader");

			ClassLoaderProxy classLoaderProxy = new ClassLoaderProxy(obj,
					portletClassLoader);

			_service = new FAQAnswerServiceClp(classLoaderProxy);

			ClpSerializer.setClassLoader(portletClassLoader);
		}

		return _service;
	}

	public void setService(FAQAnswerService service) {
		_service = service;
	}

	private static FAQAnswerService _service;
}