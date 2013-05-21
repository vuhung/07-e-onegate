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
import java.util.List;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.model.ResourceConstants;
import com.liferay.portal.util.PortalUtil;
import com.vportal.portlet.vfaq.model.FAQAnswer;
import com.vportal.portlet.vfaq.service.base.FAQAnswerLocalServiceBaseImpl;

/**
 * The implementation of the f a q answer local service.
 * 
 * <p>
 * All custom service methods should be put in this class. Whenever methods are
 * added, rerun ServiceBuilder to copy their definitions into the
 * {@link com.vportal.portlet.vfaq.service.FAQAnswerLocalService} interface.
 * </p>
 * 
 * <p>
 * Never reference this interface directly. Always use
 * {@link com.vportal.portlet.vfaq.service.FAQAnswerLocalServiceUtil} to access
 * the f a q answer local service.
 * </p>
 * 
 * <p>
 * This is a local service. Methods of this service will not have security
 * checks based on the propagated JAAS credentials because this service can only
 * be accessed from within the same VM.
 * </p>
 * 
 * @author HOAN
 * @see com.vportal.portlet.vfaq.service.base.FAQAnswerLocalServiceBaseImpl
 * @see com.vportal.portlet.vfaq.service.FAQAnswerLocalServiceUtil
 */
public class FAQAnswerLocalServiceImpl extends FAQAnswerLocalServiceBaseImpl {
	/**
	 * Them 1 answer moi vao database
	 */
	public FAQAnswer addAnswer(long questionId, String content,
			int answerOrder, String answeredByUser, Date answeredDate,
			String language, boolean isApproved, String approvedByUser,
			Date approvedDate, long userId, String attachName, long folderId)
			throws PortalException, SystemException {
		long id = counterLocalService.increment();
		FAQAnswer answer = faqAnswerPersistence.create(id);
		answer.setQuestionid(questionId);
		answer.setContent(content);
		answer.setAnswerOrder(answerOrder);
		answer.setAnsweredByUser(answeredByUser);
		answer.setAnsweredDate(answeredDate);
		answer.setLanguage(language);
		answer.setApproved(isApproved);
		answer.setApprovedByUser(approvedByUser);
		answer.setApprovedDate(approvedDate);
		answer.setUserId(userId);
		answer.setAttachName(attachName);
		answer.setFolderId(folderId);
		faqAnswerPersistence.update(answer, false);

		return answer;

	}

	public FAQAnswer addAnswer(long questionId, String content,
			int answerOrder, String answeredByUser, Date answeredDate,
			String language, boolean isApproved, String approvedByUser,
			Date approvedDate, long userId, String attachName, long folderId,
			boolean addCommunityPermissions, boolean addGuestPermissions)
			throws PortalException, SystemException {
		return addAnswer(questionId, content, answerOrder, answeredByUser,
				answeredDate, language, isApproved, approvedByUser,
				approvedDate, userId, attachName, folderId, new Boolean(
						addCommunityPermissions), new Boolean(
						addGuestPermissions), null, null);
	}

	public FAQAnswer addAnswer(long questionId, String content,
			int answerOrder, String answeredByUser, Date answeredDate,
			String language, boolean isApproved, String approvedByUser,
			Date approvedDate, long userId, String attachName, long folderId,
			String[] communityPermissions, String[] guestPermissions)
			throws PortalException, SystemException {
		return addAnswer(questionId, content, answerOrder, answeredByUser,
				answeredDate, language, isApproved, approvedByUser,
				approvedDate, userId, attachName, folderId, null, null,
				communityPermissions, guestPermissions);
	}

	public FAQAnswer addAnswer(long questionId, String content,
			int answerOrder, String answeredByUser, Date answeredDate,
			String language, boolean isApproved, String approvedByUser,
			Date approvedDate, long userId, String attachName, long folderId,
			Boolean addCommunityPermissions, Boolean addGuestPermissions,
			String[] communityPermissions, String[] guestPermissions)
			throws PortalException, SystemException {

		// Answer
		long id = counterLocalService.increment();
		FAQAnswer answer = faqAnswerPersistence.create(id);
		answer.setQuestionid(questionId);
		answer.setContent(content);
		answer.setAnswerOrder(answerOrder);
		answer.setAnsweredByUser(answeredByUser);
		answer.setAnsweredDate(answeredDate);
		answer.setLanguage(language);
		answer.setApproved(isApproved);
		answer.setApprovedByUser(approvedByUser);
		answer.setApprovedDate(approvedDate);
		answer.setUserId(userId);
		answer.setAttachName(attachName);
		answer.setFolderId(folderId);
		faqAnswerPersistence.update(answer, false);

		// Resources
		if ((addCommunityPermissions != null) && (addGuestPermissions != null)) {

			addAnswerResources(answer, addCommunityPermissions.booleanValue(),
					addGuestPermissions.booleanValue());
		} else {
			addAnswerResources(answer, communityPermissions, guestPermissions);
		}

		return answer;
	}

	/**
	 * Sua 1 answer da co
	 */
	public FAQAnswer updateAnswer(long answerId, String content,
			int answerOrder, String answeredByUser, Date answeredDate,
			String language, boolean isApproved, String approvedByUser,
			Date approvedDate, long userId, String attachName, long folderId)
			throws PortalException, SystemException {
		FAQAnswer answer = faqAnswerPersistence.findByPrimaryKey(answerId);
		answer.setContent(content);
		answer.setAnswerOrder(answerOrder);
		answer.setAnsweredByUser(answeredByUser);
		answer.setAnsweredDate(answeredDate);
		answer.setLanguage(language);
		answer.setApproved(isApproved);
		answer.setApprovedByUser(approvedByUser);
		answer.setApprovedDate(approvedDate);
		answer.setUserId(userId);
		answer.setAttachName(attachName);
		answer.setFolderId(folderId);
		faqAnswerPersistence.update(answer, false);

		return answer;
	}

	/**
	 * Xoa 1 answer
	 */
	public void deleteAnswer(long answerid) throws PortalException,
			SystemException {
		// Get Answer
		FAQAnswer answer = faqAnswerPersistence.findByPrimaryKey(answerid);

		// Delete Resources
		/*
		 * resourceLocalService.deleteResource(MainServlet.DEFAULT_COMPANY_ID,
		 * FAQAnswer.class.getName(), ResourceConstants.SCOPE_INDIVIDUAL,
		 * answer.getId());
		 */
		resourceLocalService.deleteResource(PortalUtil.getDefaultCompanyId(),
				FAQAnswer.class.getName(), ResourceConstants.SCOPE_INDIVIDUAL,
				answer.getId());

		// Delete Answer
		faqAnswerPersistence.remove(answerid);
	}

	public FAQAnswer approveAnswer(long answerId, String approvedByUser)
			throws PortalException, SystemException {
		FAQAnswer answer = faqAnswerPersistence.findByPrimaryKey(answerId);
		if (!answer.isApproved()) {
			answer.setApproved(true);
			answer.setApprovedByUser(approvedByUser);
			faqAnswerPersistence.update(answer, false);
		}
		return answer;
	}

	/**
	 * Huy viec hien thi 1 answer
	 */
	public FAQAnswer unapproveAnswer(long answerId, String approvedByUser)
			throws PortalException, SystemException {
		FAQAnswer answer = faqAnswerPersistence.findByPrimaryKey(answerId);
		if (answer.isApproved()) {
			answer.setApproved(false);
			answer.setApprovedByUser(approvedByUser);
			faqAnswerPersistence.update(answer, false);
		}
		return answer;
	}

	/**
	 * Tim answer voi questionid
	 */
	public List getByQuestion(long questionId) throws PortalException,
			SystemException {
		return faqAnswerPersistence.findByQuestionId(questionId);
	}

	public int countQuestion(long questionid) throws SystemException {
		return faqAnswerPersistence.countByQuestionId(questionid);
	}

	/**
	 * Tim nhung answer thong qua trang thai duyet (approve) cua answer
	 */
	public List getByApprove(boolean approved) throws PortalException,
			SystemException {
		return faqAnswerPersistence.findByApproved(approved);
	}

	public List getByLanguage(String language) throws PortalException,
			SystemException {
		return faqAnswerPersistence.findByLanguage(language);
	}

	public FAQAnswer getAnswer(long answerId) throws PortalException,
			SystemException {
		return faqAnswerPersistence.findByPrimaryKey(answerId);
	}

	public List getAll() throws PortalException, SystemException {
		return faqAnswerPersistence.findAll();
	}

	public List getByGroupId(long groupId) throws PortalException,
			SystemException {
		return faqAnswerFinder.findByGroupId(groupId);
	}

	public List getByGroupId(long groupId, int start, int end)
			throws PortalException, SystemException {
		return faqAnswerFinder.findByGroupId(groupId, start, end);
	}

	public int countByGroupId(long groupId) throws PortalException,
			SystemException {
		return faqAnswerFinder.countByGroupId(groupId);
	}

	public List getByGroupId(long groupId, String language)
			throws PortalException, SystemException {
		return faqAnswerFinder.findByG_L(groupId, language);
	}

	public List getByG_L_S(long groupId, String language, boolean approved,
			int start, int end) throws PortalException, SystemException {
		return faqAnswerFinder.getByG_L_S(groupId, language, approved, start,
				end);
	}

	public int countByG_L_S(long groupId, String language, boolean approved)
			throws PortalException, SystemException {
		return faqAnswerFinder.countByG_L_S(groupId, language, approved);
	}

	public int countByG_L_S_Q(long groupId, String language, boolean approved,
			long questionId) throws PortalException, SystemException {
		return faqAnswerFinder.countByG_L_S_Q(groupId, language, approved,
				questionId);
	}

	public List getByParam(long groupId, String language, boolean approved,
			String title, long categoryId, int start, int end)
			throws PortalException, SystemException {
		return faqAnswerFinder.getByParam(groupId, language, approved, title,
				categoryId, start, end);
	}

	public int countByParam(long groupId, String language, boolean approved,
			String title, long categoryId) throws PortalException,
			SystemException {
		return faqAnswerFinder.countByParam(groupId, language, approved, title,
				categoryId);
	}

	public void addAnswerResources(long answerId,
			boolean addCommunityPermissions, boolean addGuestPermissions)
			throws PortalException, SystemException {

		FAQAnswer answer = faqAnswerPersistence.findByPrimaryKey(answerId);

		addAnswerResources(answer, addCommunityPermissions, addGuestPermissions);
	}

	public void addAnswerResources(FAQAnswer answer,
			boolean addCommunityPermissions, boolean addGuestPermissions)
			throws PortalException, SystemException {

		/*
		 * resourceLocalService.addResources(MainServlet.DEFAULT_COMPANY_ID, 0,
		 * answer.getUserId(), FAQAnswer.class.getName(), answer.getId(), false,
		 * addCommunityPermissions, addGuestPermissions);
		 */
		resourceLocalService.addResources(PortalUtil.getDefaultCompanyId(), 0,
				answer.getUserId(), FAQAnswer.class.getName(), answer.getId(),
				false, addCommunityPermissions, addGuestPermissions);
	}

	public void addAnswerResources(long answerId,
			String[] communityPermissions, String[] guestPermissions)
			throws PortalException, SystemException {

		FAQAnswer answer = faqAnswerPersistence.findByPrimaryKey(answerId);

		addAnswerResources(answer, communityPermissions, guestPermissions);

	}

	public void addAnswerResources(FAQAnswer answer,
			String[] communityPermissions, String[] guestPermissions)
			throws PortalException, SystemException {

		/*
		 * resourceLocalService.addModelResources(MainServlet.DEFAULT_COMPANY_ID,
		 * 0, answer.getUserId(), FAQAnswer.class.getName(), answer .getId(),
		 * communityPermissions, guestPermissions);
		 */
		resourceLocalService.addModelResources(
				PortalUtil.getDefaultCompanyId(), 0, answer.getUserId(),
				FAQAnswer.class.getName(), answer.getId(),
				communityPermissions, guestPermissions);
	}
}