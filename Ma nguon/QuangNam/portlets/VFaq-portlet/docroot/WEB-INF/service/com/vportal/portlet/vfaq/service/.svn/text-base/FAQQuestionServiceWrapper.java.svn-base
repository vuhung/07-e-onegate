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
 * This class is a wrapper for {@link FAQQuestionService}.
 * </p>
 *
 * @author    HOAN
 * @see       FAQQuestionService
 * @generated
 */
public class FAQQuestionServiceWrapper implements FAQQuestionService {
	public FAQQuestionServiceWrapper(FAQQuestionService faqQuestionService) {
		_faqQuestionService = faqQuestionService;
	}

	public com.vportal.portlet.vfaq.model.FAQQuestion addQuestion(
		java.lang.String title, java.lang.String content,
		java.lang.String language, int questionOrder, java.util.Date sentDate,
		java.lang.String sentByUser, java.lang.String senderEmail,
		java.lang.String questionType, int hitCount, boolean isApproved,
		long plid, long userId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _faqQuestionService.addQuestion(title, content, language,
			questionOrder, sentDate, sentByUser, senderEmail, questionType,
			hitCount, isApproved, plid, userId);
	}

	public com.vportal.portlet.vfaq.model.FAQQuestion addQuestion(
		java.lang.String title, java.lang.String content,
		java.lang.String language, int questionOrder, java.util.Date sentDate,
		java.lang.String sentByUser, java.lang.String senderEmail,
		java.lang.String questionType, int hitCount, boolean isApproved,
		long plid, long userId, boolean addCommunityPermissions,
		boolean addGuestPermissions)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _faqQuestionService.addQuestion(title, content, language,
			questionOrder, sentDate, sentByUser, senderEmail, questionType,
			hitCount, isApproved, plid, userId, addCommunityPermissions,
			addGuestPermissions);
	}

	public com.vportal.portlet.vfaq.model.FAQQuestion addQuestion(
		java.lang.String title, java.lang.String content,
		java.lang.String language, int questionOrder, java.util.Date sentDate,
		java.lang.String sentByUser, java.lang.String senderEmail,
		java.lang.String questionType, int hitCount, boolean isApproved,
		long plid, long userId, java.lang.String[] communityPermissions,
		java.lang.String[] guestPermissions)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _faqQuestionService.addQuestion(title, content, language,
			questionOrder, sentDate, sentByUser, senderEmail, questionType,
			hitCount, isApproved, plid, userId, communityPermissions,
			guestPermissions);
	}

	public com.vportal.portlet.vfaq.model.FAQQuestion updateQuestion(
		long questionId, java.lang.String title, java.lang.String content,
		java.lang.String language, int questionOrder,
		java.util.Date modifiedDate, java.lang.String modifiedByUser,
		java.lang.String questionType, int hitCount, boolean isApproved,
		long groupId, long userId, java.lang.String senderEmail,
		java.lang.String sentByUser)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _faqQuestionService.updateQuestion(questionId, title, content,
			language, questionOrder, modifiedDate, modifiedByUser,
			questionType, hitCount, isApproved, groupId, userId, senderEmail,
			sentByUser);
	}

	public void deleteQuestion(long groupId, long questionId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		_faqQuestionService.deleteQuestion(groupId, questionId);
	}

	public com.vportal.portlet.vfaq.model.FAQQuestion unapproveQuestion(
		long groupId, long questionId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _faqQuestionService.unapproveQuestion(groupId, questionId);
	}

	public com.vportal.portlet.vfaq.model.FAQQuestion approveQuestion(
		long groupId, long questionId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _faqQuestionService.approveQuestion(groupId, questionId);
	}

	public com.vportal.portlet.vfaq.model.FAQQuestion getQuestion(
		long groupId, long questionId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _faqQuestionService.getQuestion(groupId, questionId);
	}

	public java.util.List getQuestionApproveByCategory(long groupId,
		java.lang.String language, long categoryId, java.lang.String title,
		int begin, int end, boolean approved)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.rmi.RemoteException {
		return _faqQuestionService.getQuestionApproveByCategory(groupId,
			language, categoryId, title, begin, end, approved);
	}

	public java.util.List getQuestionApproveByCategory(long groupId,
		java.lang.String language, long categoryId, java.lang.String title,
		boolean approved)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.rmi.RemoteException {
		return _faqQuestionService.getQuestionApproveByCategory(groupId,
			language, categoryId, title, approved);
	}

	public int countQuestionApproveByCategory(long groupId,
		java.lang.String language, long categoryId, java.lang.String title,
		boolean approved)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.rmi.RemoteException {
		return _faqQuestionService.countQuestionApproveByCategory(groupId,
			language, categoryId, title, approved);
	}

	public java.util.List getQuestionByParam(long groupId,
		java.lang.String language, long categoryId, java.lang.String title,
		boolean approved, int start, int end)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.rmi.RemoteException {
		return _faqQuestionService.getQuestionByParam(groupId, language,
			categoryId, title, approved, start, end);
	}

	public java.util.List getOrtherQuestionByParam(long groupId,
		java.lang.String language, long Id, long categoryId, boolean approved,
		int start, int end)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.rmi.RemoteException {
		return _faqQuestionService.getOrtherQuestionByParam(groupId, language,
			Id, categoryId, approved, start, end);
	}

	public int countQuestionByParam(long groupId, java.lang.String language,
		long categoryId, java.lang.String title, boolean approved)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.rmi.RemoteException {
		return _faqQuestionService.countQuestionByParam(groupId, language,
			categoryId, title, approved);
	}

	public java.util.List getQuestionByG_L_S(long groupId,
		java.lang.String language, boolean approved, int start, int end)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.rmi.RemoteException {
		return _faqQuestionService.getQuestionByG_L_S(groupId, language,
			approved, start, end);
	}

	public int countQuestionByG_L_S(long groupId, java.lang.String language,
		boolean approved)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.rmi.RemoteException {
		return _faqQuestionService.countQuestionByG_L_S(groupId, language,
			approved);
	}

	public com.vportal.portlet.vfaq.model.FAQQuestion findByPrimaryKey(long id)
		throws java.lang.Exception {
		return _faqQuestionService.findByPrimaryKey(id);
	}

	public void reIndex(java.lang.String[] ids)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.rmi.RemoteException {
		_faqQuestionService.reIndex(ids);
	}

	public com.liferay.portal.kernel.search.Hits search(long companyId,
		long groupId, long userId, java.lang.String keywords, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _faqQuestionService.search(companyId, groupId, userId, keywords,
			start, end);
	}

	public FAQQuestionService getWrappedFAQQuestionService() {
		return _faqQuestionService;
	}

	private FAQQuestionService _faqQuestionService;
}