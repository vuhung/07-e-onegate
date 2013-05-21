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

package com.vportal.portlet.vfaq.service.impl;

import java.util.Date;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.vportal.portlet.vfaq.model.FAQAnswer;
import com.vportal.portlet.vfaq.service.base.FAQAnswerServiceBaseImpl;

/**
 * The implementation of the f a q answer remote service.
 * 
 * <p>
 * All custom service methods should be put in this class. Whenever methods are
 * added, rerun ServiceBuilder to copy their definitions into the
 * {@link com.vportal.portlet.vfaq.service.FAQAnswerService} interface.
 * </p>
 * 
 * <p>
 * Never reference this interface directly. Always use
 * {@link com.vportal.portlet.vfaq.service.FAQAnswerServiceUtil} to access the f
 * a q answer remote service.
 * </p>
 * 
 * <p>
 * This is a remote service. Methods of this service are expected to have
 * security checks based on the propagated JAAS credentials because this service
 * can be accessed remotely.
 * </p>
 * 
 * @author HOAN
 * @see com.vportal.portlet.vfaq.service.base.FAQAnswerServiceBaseImpl
 * @see com.vportal.portlet.vfaq.service.FAQAnswerServiceUtil
 */
public class FAQAnswerServiceImpl extends FAQAnswerServiceBaseImpl {
	/**
	 * Them 1 answer moi vao database
	 */
	public FAQAnswer addAnswer(long groupId, long questionId, String content,
			int answerOrder, String answeredByUser, Date answeredDate,
			String language, boolean isApproved, String approvedByUser,
			Date approvedDate, long userId, String attachName, long folderId)
			throws PortalException, SystemException {

		/*
		 * FAQQuestionPermission.check(getPermissionChecker(), groupId,
		 * questionId, ActionKeysExt.ADD_ANSWER);
		 */

		return faqAnswerLocalService.addAnswer(questionId, content,
				answerOrder, answeredByUser, answeredDate, language,
				isApproved, approvedByUser, approvedDate, userId, attachName,
				folderId);
	}

	/**
	 * Them 1 answer moi vao database
	 */
	public FAQAnswer addAnswer(long groupId, long questionId, String content,
			int answerOrder, String answeredByUser, Date answeredDate,
			String language, boolean isApproved, String approvedByUser,
			Date approvedDate, long userId, String attachName, long folderId,
			boolean addCommunityPermissions, boolean addGuestPermissions)
			throws PortalException, SystemException {

		/*
		 * FAQQuestionPermission.check(getPermissionChecker(), groupId,
		 * questionId, ActionKeysExt.ADD_ANSWER);
		 */

		return faqAnswerLocalService.addAnswer(questionId, content,
				answerOrder, answeredByUser, answeredDate, language,
				isApproved, approvedByUser, approvedDate, userId, attachName,
				folderId, addCommunityPermissions, addGuestPermissions);
	}

	/**
	 * Them 1 answer moi vao database
	 */
	public FAQAnswer addAnswer(long groupId, long questionId, String content,
			int answerOrder, String answeredByUser, Date answeredDate,
			String language, boolean isApproved, String approvedByUser,
			Date approvedDate, long userId, String attachName, long folderId,
			String[] communityPermissions, String[] guestPermissions)
			throws PortalException, SystemException {

		/*
		 * FAQQuestionPermission.check(getPermissionChecker(), groupId,
		 * questionId, ActionKeysExt.ADD_ANSWER);
		 */

		return faqAnswerLocalService.addAnswer(questionId, content,
				answerOrder, answeredByUser, answeredDate, language,
				isApproved, approvedByUser, approvedDate, userId, attachName,
				folderId, communityPermissions, guestPermissions);
	}

	/**
	 * Sua 1 answer da co
	 */
	public FAQAnswer updateAnswer(long groupId, long answerId, String content,
			int answerOrder, String answeredByUser, Date answeredDate,
			String language, boolean isApproved, String approvedByUser,
			Date approvedDate, long userId, String attachName, long folderId)
			throws PortalException, SystemException {

		/*
		 * FAQAnswerPermission.check(getPermissionChecker(), groupId, answerId,
		 * ActionKeys.UPDATE);
		 */

		return faqAnswerLocalService.updateAnswer(answerId, content,
				answerOrder, answeredByUser, answeredDate, language,
				isApproved, approvedByUser, approvedDate, userId, attachName,
				folderId);

	}

	/**
	 * Xoa 1 answer
	 */
	public void deleteAnswer(long groupId, long answerid)
			throws PortalException, SystemException {

		/*
		 * FAQAnswerPermission.check(getPermissionChecker(), groupId, answerid,
		 * ActionKeys.DELETE);
		 */

		faqAnswerLocalService.deleteAnswer(answerid);

	}

	public FAQAnswer approveAnswer(long groupId, long answerId,
			String approvedByUser) throws PortalException, SystemException {

		/*
		 * FAQAnswerPermission.check(getPermissionChecker(), groupId, answerId,
		 * ActionKeysExt.APPROVE_ANSWER);
		 */

		return faqAnswerLocalService.approveAnswer(answerId, approvedByUser);
	}

	/**
	 * Huy viec hien thi 1 answer
	 */
	public FAQAnswer unapproveAnswer(long groupId, long answerId,
			String approvedByUser) throws PortalException, SystemException {

		/*
		 * FAQAnswerPermission.check(getPermissionChecker(), groupId, answerId,
		 * ActionKeysExt.UNAPPROVE_ANSWER);
		 */

		return faqAnswerLocalService.unapproveAnswer(answerId, approvedByUser);

	}

	public FAQAnswer getAnswer(long groupId, long answerId)
			throws PortalException, SystemException {

		/*
		 * FAQAnswerPermission.check(getPermissionChecker(), groupId, answerId,
		 * ActionKeys.VIEW);
		 */

		return faqAnswerLocalService.getAnswer(answerId);

	}

	public int countQuestion(long questionid) throws SystemException {
		return faqAnswerLocalService.countQuestion(questionid);
	}
}