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

import java.rmi.RemoteException;
import java.util.Date;
import java.util.List;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.search.Hits;
import com.liferay.portal.model.User;
import com.liferay.portal.security.permission.ActionKeys;
import com.liferay.portal.service.UserServiceUtil;
import com.liferay.portal.util.PortalUtil;
import com.vportal.portlet.vfaq.model.FAQQuestion;
import com.vportal.portlet.vfaq.service.base.FAQQuestionServiceBaseImpl;
import com.vportal.portlet.vfaq.service.permission.FAQQuestionPermission;
import com.vportal.portlet.vfaq.service.persistence.FAQQuestionUtil;
import com.vportal.portlet.vfaq.util.SearchQuestionIndexer;

/**
 * The implementation of the f a q question remote service.
 * 
 * <p>
 * All custom service methods should be put in this class. Whenever methods are
 * added, rerun ServiceBuilder to copy their definitions into the
 * {@link com.vportal.portlet.vfaq.service.FAQQuestionService} interface.
 * </p>
 * 
 * <p>
 * Never reference this interface directly. Always use
 * {@link com.vportal.portlet.vfaq.service.FAQQuestionServiceUtil} to access the
 * f a q question remote service.
 * </p>
 * 
 * <p>
 * This is a remote service. Methods of this service are expected to have
 * security checks based on the propagated JAAS credentials because this service
 * can be accessed remotely.
 * </p>
 * 
 * @author HOAN
 * @see com.vportal.portlet.vfaq.service.base.FAQQuestionServiceBaseImpl
 * @see com.vportal.portlet.vfaq.service.FAQQuestionServiceUtil
 */
public class FAQQuestionServiceImpl extends FAQQuestionServiceBaseImpl {
	public FAQQuestion addQuestion(String title, String content,
			String language, int questionOrder, Date sentDate,
			String sentByUser, String senderEmail, String questionType,
			int hitCount, boolean isApproved, long plid, long userId)
			throws PortalException, SystemException {

		/*
		 * PortletPermissionUtil.check(getPermissionChecker(), plid,
		 * WebKeysExt.VFAQ, ActionKeysExt.ADD_QUESTION);
		 */

		long groupId = PortalUtil.getScopeGroupId(plid);

		return faqQuestionLocalService.addQuestion(title, content, language,
				questionOrder, sentDate, sentByUser, senderEmail, questionType,
				hitCount, isApproved, groupId, userId);
	}

	public FAQQuestion addQuestion(String title, String content,
			String language, int questionOrder, Date sentDate,
			String sentByUser, String senderEmail, String questionType,
			int hitCount, boolean isApproved, long plid, long userId,
			boolean addCommunityPermissions, boolean addGuestPermissions)
			throws PortalException, SystemException {

		/*
		 * PortletPermissionUtil.check(getPermissionChecker(), plid,
		 * WebKeysExt.VFAQ, ActionKeysExt.ADD_QUESTION);
		 */

		long groupId = PortalUtil.getScopeGroupId(plid);

		return faqQuestionLocalService.addQuestion(title, content, language,
				questionOrder, sentDate, sentByUser, senderEmail, questionType,
				hitCount, isApproved, groupId, userId, addCommunityPermissions,
				addGuestPermissions);
	}

	public FAQQuestion addQuestion(String title, String content,
			String language, int questionOrder, Date sentDate,
			String sentByUser, String senderEmail, String questionType,
			int hitCount, boolean isApproved, long plid, long userId,
			String[] communityPermissions, String[] guestPermissions)
			throws PortalException, SystemException {

		/*
		 * PortletPermissionUtil.check(getPermissionChecker(), plid,
		 * WebKeysExt.VFAQ, ActionKeysExt.ADD_QUESTION);
		 */

		long groupId = PortalUtil.getScopeGroupId(plid);

		return faqQuestionLocalService.addQuestion(title, content, language,
				questionOrder, sentDate, sentByUser, senderEmail, questionType,
				hitCount, isApproved, groupId, userId, communityPermissions,
				guestPermissions);
	}

	public FAQQuestion updateQuestion(long questionId, String title,
			String content, String language, int questionOrder,
			Date modifiedDate, String modifiedByUser, String questionType,
			int hitCount, boolean isApproved, long groupId, long userId,
			String senderEmail, String sentByUser) throws PortalException,
			SystemException {

		/*
		 * FAQQuestionPermission.check(getPermissionChecker(), groupId,
		 * questionId, ActionKeys.UPDATE);
		 */
		return faqQuestionLocalService.updateQuestion(questionId, title,
				content, language, questionOrder, modifiedDate, modifiedByUser,
				questionType, hitCount, isApproved, groupId, userId,
				senderEmail, sentByUser);
	}

	public void deleteQuestion(long groupId, long questionId)
			throws PortalException, SystemException {

		/*
		 * FAQQuestionPermission.check(getPermissionChecker(), groupId,
		 * questionId, ActionKeys.DELETE);
		 */

		faqQuestionLocalService.deleteQuestion(groupId, questionId);
	}

	public FAQQuestion unapproveQuestion(long groupId, long questionId)
			throws PortalException, SystemException {

		/*
		 * FAQQuestionPermission.check(getPermissionChecker(), groupId,
		 * questionId, ActionKeysExt.UNAPPROVE_QUESTION);
		 */

		return faqQuestionLocalService.unapproveQuestion(groupId, questionId);
	}

	public FAQQuestion approveQuestion(long groupId, long questionId)
			throws PortalException, SystemException {

		/*
		 * FAQQuestionPermission.check(getPermissionChecker(), groupId,
		 * questionId, ActionKeysExt.APPROVE_QUESTION);
		 */

		return faqQuestionLocalService.approveQuestion(groupId, questionId);
	}

	public FAQQuestion getQuestion(long groupId, long questionId)
			throws PortalException, SystemException {

		FAQQuestionPermission.check(getPermissionChecker(), groupId,
				questionId, ActionKeys.VIEW);

		return faqQuestionLocalService.getQuestion(groupId, questionId);
	}

	// get question by category Cuongnv
	public List getQuestionApproveByCategory(long groupId, String language,
			long categoryId, String title, int begin, int end, boolean approved)
			throws PortalException, SystemException, RemoteException {
		return faqQuestionFinder.findByC_S(groupId, language, categoryId,
				title, begin, end, approved);

	}

	public List getQuestionApproveByCategory(long groupId, String language,
			long categoryId, String title, boolean approved)
			throws PortalException, SystemException, RemoteException {
		return faqQuestionFinder.findByC_S(groupId, language, categoryId,
				title, approved);

	}

	public int countQuestionApproveByCategory(long groupId, String language,
			long categoryId, String title, boolean approved)
			throws PortalException, SystemException, RemoteException {
		return faqQuestionFinder.countByC_S(groupId, language, categoryId,
				title, approved);
	}

	public List getQuestionByParam(long groupId, String language,
			long categoryId, String title, boolean approved, int start, int end)
			throws PortalException, SystemException, RemoteException {
		return faqQuestionFinder.findQuestionByParam(groupId, language,
				categoryId, title, approved, start, end);

	}

	public List getOrtherQuestionByParam(long groupId, String language,
			long Id, long categoryId, boolean approved, int start, int end)
			throws PortalException, SystemException, RemoteException {
		return faqQuestionFinder.findOtherQuestionByParam(groupId, language,
				Id, categoryId, approved, start, end);

	}

	public int countQuestionByParam(long groupId, String language,
			long categoryId, String title, boolean approved)
			throws PortalException, SystemException, RemoteException {
		return faqQuestionFinder.countQuestionByParam(groupId, language,
				categoryId, title, approved);
	}

	public List getQuestionByG_L_S(long groupId, String language,
			boolean approved, int start, int end) throws PortalException,
			SystemException, RemoteException {
		return faqQuestionPersistence.findByG_L_A(groupId, language, approved,
				start, end);
	}

	public int countQuestionByG_L_S(long groupId, String language,
			boolean approved) throws PortalException, SystemException,
			RemoteException {
		return faqQuestionPersistence.countByG_L_A(groupId, language, approved);
	}

	public FAQQuestion findByPrimaryKey(long id) throws Exception {
		return FAQQuestionUtil.findByPrimaryKey(id);
	}

	// search
	public void reIndex(String[] ids) throws PortalException, SystemException,
			RemoteException {
		List question = faqQuestionPersistence.findAll();

		if ((question == null) || (question.size() <= 0)) {
			return;
		}

		try {

			for (int i = 0; i < question.size(); i++) {
				FAQQuestion faqQuestion = (FAQQuestion) question.get(i);
				User user = UserServiceUtil
						.getUserById(faqQuestion.getUserId());
				SearchQuestionIndexer.updateQuestion(faqQuestion.getGroupId(),
						user.getCompanyId(),
						Long.toString(faqQuestion.getId()),
						faqQuestion.getTitle(), faqQuestion.getContent());
			}

		} catch (Exception ex) {
			// Ignore...
		}
	}

	public Hits search(long companyId, long groupId, long userId,
			String keywords, int start, int end) throws SystemException {
		return faqQuestionLocalService.search(companyId, groupId, userId,
				keywords, start, end);
	}
}