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
 * This class is a wrapper for {@link FAQAnswerService}.
 * </p>
 *
 * @author    HOAN
 * @see       FAQAnswerService
 * @generated
 */
public class FAQAnswerServiceWrapper implements FAQAnswerService {
	public FAQAnswerServiceWrapper(FAQAnswerService faqAnswerService) {
		_faqAnswerService = faqAnswerService;
	}

	/**
	* Them 1 answer moi vao database
	*/
	public com.vportal.portlet.vfaq.model.FAQAnswer addAnswer(long groupId,
		long questionId, java.lang.String content, int answerOrder,
		java.lang.String answeredByUser, java.util.Date answeredDate,
		java.lang.String language, boolean isApproved,
		java.lang.String approvedByUser, java.util.Date approvedDate,
		long userId, java.lang.String attachName, long folderId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _faqAnswerService.addAnswer(groupId, questionId, content,
			answerOrder, answeredByUser, answeredDate, language, isApproved,
			approvedByUser, approvedDate, userId, attachName, folderId);
	}

	/**
	* Them 1 answer moi vao database
	*/
	public com.vportal.portlet.vfaq.model.FAQAnswer addAnswer(long groupId,
		long questionId, java.lang.String content, int answerOrder,
		java.lang.String answeredByUser, java.util.Date answeredDate,
		java.lang.String language, boolean isApproved,
		java.lang.String approvedByUser, java.util.Date approvedDate,
		long userId, java.lang.String attachName, long folderId,
		boolean addCommunityPermissions, boolean addGuestPermissions)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _faqAnswerService.addAnswer(groupId, questionId, content,
			answerOrder, answeredByUser, answeredDate, language, isApproved,
			approvedByUser, approvedDate, userId, attachName, folderId,
			addCommunityPermissions, addGuestPermissions);
	}

	/**
	* Them 1 answer moi vao database
	*/
	public com.vportal.portlet.vfaq.model.FAQAnswer addAnswer(long groupId,
		long questionId, java.lang.String content, int answerOrder,
		java.lang.String answeredByUser, java.util.Date answeredDate,
		java.lang.String language, boolean isApproved,
		java.lang.String approvedByUser, java.util.Date approvedDate,
		long userId, java.lang.String attachName, long folderId,
		java.lang.String[] communityPermissions,
		java.lang.String[] guestPermissions)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _faqAnswerService.addAnswer(groupId, questionId, content,
			answerOrder, answeredByUser, answeredDate, language, isApproved,
			approvedByUser, approvedDate, userId, attachName, folderId,
			communityPermissions, guestPermissions);
	}

	/**
	* Sua 1 answer da co
	*/
	public com.vportal.portlet.vfaq.model.FAQAnswer updateAnswer(long groupId,
		long answerId, java.lang.String content, int answerOrder,
		java.lang.String answeredByUser, java.util.Date answeredDate,
		java.lang.String language, boolean isApproved,
		java.lang.String approvedByUser, java.util.Date approvedDate,
		long userId, java.lang.String attachName, long folderId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _faqAnswerService.updateAnswer(groupId, answerId, content,
			answerOrder, answeredByUser, answeredDate, language, isApproved,
			approvedByUser, approvedDate, userId, attachName, folderId);
	}

	/**
	* Xoa 1 answer
	*/
	public void deleteAnswer(long groupId, long answerid)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		_faqAnswerService.deleteAnswer(groupId, answerid);
	}

	public com.vportal.portlet.vfaq.model.FAQAnswer approveAnswer(
		long groupId, long answerId, java.lang.String approvedByUser)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _faqAnswerService.approveAnswer(groupId, answerId, approvedByUser);
	}

	/**
	* Huy viec hien thi 1 answer
	*/
	public com.vportal.portlet.vfaq.model.FAQAnswer unapproveAnswer(
		long groupId, long answerId, java.lang.String approvedByUser)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _faqAnswerService.unapproveAnswer(groupId, answerId,
			approvedByUser);
	}

	public com.vportal.portlet.vfaq.model.FAQAnswer getAnswer(long groupId,
		long answerId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _faqAnswerService.getAnswer(groupId, answerId);
	}

	public int countQuestion(long questionid)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _faqAnswerService.countQuestion(questionid);
	}

	public FAQAnswerService getWrappedFAQAnswerService() {
		return _faqAnswerService;
	}

	private FAQAnswerService _faqAnswerService;
}