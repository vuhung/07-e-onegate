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
import com.liferay.portal.kernel.search.BooleanClauseOccur;
import com.liferay.portal.kernel.search.BooleanQuery;
import com.liferay.portal.kernel.search.BooleanQueryFactoryUtil;
import com.liferay.portal.kernel.search.Field;
import com.liferay.portal.kernel.search.Hits;
import com.liferay.portal.kernel.search.SearchEngineUtil;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ResourceConstants;
import com.liferay.portal.model.User;
import com.liferay.portal.service.UserServiceUtil;
import com.liferay.portal.util.PortalUtil;
import com.liferay.portlet.documentlibrary.model.DLFileShortcut;
import com.vportal.portal.util.PortletKeysExt;
import com.vportal.portlet.vfaq.model.FAQQuestion;
import com.vportal.portlet.vfaq.service.FAQQuestionLocalServiceUtil;
import com.vportal.portlet.vfaq.service.base.FAQQuestionLocalServiceBaseImpl;
import com.vportal.portlet.vfaq.util.SearchQuestionIndexer;

/**
 * The implementation of the f a q question local service.
 * 
 * <p>
 * All custom service methods should be put in this class. Whenever methods are
 * added, rerun ServiceBuilder to copy their definitions into the
 * {@link com.vportal.portlet.vfaq.service.FAQQuestionLocalService} interface.
 * </p>
 * 
 * <p>
 * Never reference this interface directly. Always use
 * {@link com.vportal.portlet.vfaq.service.FAQQuestionLocalServiceUtil} to
 * access the f a q question local service.
 * </p>
 * 
 * <p>
 * This is a local service. Methods of this service will not have security
 * checks based on the propagated JAAS credentials because this service can only
 * be accessed from within the same VM.
 * </p>
 * 
 * @author HOAN
 * @see com.vportal.portlet.vfaq.service.base.FAQQuestionLocalServiceBaseImpl
 * @see com.vportal.portlet.vfaq.service.FAQQuestionLocalServiceUtil
 */
public class FAQQuestionLocalServiceImpl extends
		FAQQuestionLocalServiceBaseImpl {
	public FAQQuestion addQuestion(String title, String content,
			String language, int questionOrder, Date sentDate,
			String sentByUser, String senderEmail, String questionType,
			int hitCount, boolean isApproved, long groupId, long userId)
			throws PortalException, SystemException {

		// Question
		long questionId = counterLocalService.increment();
		FAQQuestion question = faqQuestionPersistence.create(questionId);
		question.setTitle(title);
		question.setContent(content);
		question.setLanguage(language);
		question.setQuestionOrder(questionOrder);
		question.setSentDate(sentDate);
		question.setSentByUser(sentByUser);
		question.setSenderEmail(senderEmail);
		question.setQuestionType(questionType);
		question.setHitCount(hitCount);
		question.setApproved(isApproved);
		question.setUserId(userId);
		question.setGroupId(groupId);

		faqQuestionPersistence.update(question, false);
		try {
			User user = UserServiceUtil.getUserById(userId);
			SearchQuestionIndexer.addQuestion(groupId, user.getCompanyId(),
					Long.toString(question.getId()), title, content);

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return question;
	}

	public FAQQuestion addQuestion(String title, String content,
			String language, int questionOrder, Date sentDate,
			String sentByUser, String senderEmail, String questionType,
			int hitCount, boolean isApproved, long groupId, long userId,
			boolean addCommunityPermissions, boolean addGuestPermissions)
			throws PortalException, SystemException {
		return addQuestion(title, content, language, questionOrder, sentDate,
				sentByUser, senderEmail, questionType, hitCount, isApproved,
				groupId, userId, new Boolean(addCommunityPermissions),
				new Boolean(addGuestPermissions), null, null);
	}

	public FAQQuestion addQuestion(String title, String content,
			String language, int questionOrder, Date sentDate,
			String sentByUser, String senderEmail, String questionType,
			int hitCount, boolean isApproved, long groupId, long userId,
			String[] communityPermissions, String[] guestPermissions)
			throws PortalException, SystemException {
		return addQuestion(title, content, language, questionOrder, sentDate,
				sentByUser, senderEmail, questionType, hitCount, isApproved,
				groupId, userId, null, null, communityPermissions,
				guestPermissions);
	}

	public FAQQuestion addQuestion(String title, String content,
			String language, int questionOrder, Date sentDate,
			String sentByUser, String senderEmail, String questionType,
			int hitCount, boolean isApproved, long groupId, long userId,
			Boolean addCommunityPermissions, Boolean addGuestPermissions,
			String[] communityPermissions, String[] guestPermissions)
			throws PortalException, SystemException {

		// Question
		long questionId = counterLocalService.increment();
		FAQQuestion question = faqQuestionPersistence.create(questionId);
		question.setTitle(title);
		question.setContent(content);
		question.setLanguage(language);
		question.setQuestionOrder(questionOrder);
		question.setSentDate(sentDate);
		question.setSentByUser(sentByUser);
		question.setSenderEmail(senderEmail);
		question.setQuestionType(questionType);
		question.setHitCount(hitCount);
		question.setApproved(isApproved);
		question.setUserId(userId);
		question.setGroupId(groupId);

		faqQuestionPersistence.update(question, false);

		// Resourse
		if ((addCommunityPermissions != null) && (addGuestPermissions != null)) {

			addQuestionResources(question,
					addCommunityPermissions.booleanValue(),
					addGuestPermissions.booleanValue());
		} else {
			addQuestionResources(question, communityPermissions,
					guestPermissions);
		}

		// Category
		// set category here

		return question;
	}

	public FAQQuestion updateQuestion(long questionId, String title,
			String content, String language, int questionOrder,
			Date modifiedDate, String modifiedByUser, String questionType,
			int hitCount, boolean isApproved, long groupId, long userId,
			String senderEmail, String sentByUser) throws PortalException,
			SystemException {

		FAQQuestion question = faqQuestionPersistence
				.findByPrimaryKey(questionId);

		question.setId(questionId);
		question.setTitle(title);
		question.setContent(content);
		question.setLanguage(language);
		question.setQuestionOrder(questionOrder);
		question.setModifiedDate(modifiedDate);
		question.setModifiedByUser(modifiedByUser);
		question.setQuestionType(questionType);
		question.setHitCount(hitCount);
		question.setApproved(isApproved);
		question.setUserId(userId);
		question.setGroupId(groupId);
		question.setSenderEmail(senderEmail);
		question.setSentByUser(sentByUser);

		faqQuestionPersistence.update(question, false);
		try {
			User user = UserServiceUtil.getUserById(userId);
			SearchQuestionIndexer.updateQuestion(groupId, user.getCompanyId(),
					Long.toString(question.getId()), title, content);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return question;
	}

	public void deleteQuestion(long groupId, long questionId)
			throws PortalException, SystemException {

		FAQQuestion question = FAQQuestionLocalServiceUtil
				.getFAQQuestion(questionId);

		faqQuestionPersistence.remove(question);

		// FAQQuestion faqQuestion = faqQuestionPersistence.remove(questionId);
		// User user = UserServiceUtil.getUserById(faqQuestion.getUserId());
		// SearchQuestionIndexer.deleteQuestion(user.getCompanyId(), Long
		// .toString(questionId));

		// Delete Resources
		resourceLocalService.deleteResource(PortalUtil.getDefaultCompanyId(),
				FAQQuestion.class.getName(),
				ResourceConstants.SCOPE_INDIVIDUAL, question.getId());
		// Delete Question

	}

	public void deleteQuestion(long questionId) throws PortalException,
			SystemException {

		faqQuestionPersistence.remove(questionId);

	}

	public FAQQuestion increaseHitCount(long questionId)
			throws PortalException, SystemException {

		FAQQuestion question = faqQuestionPersistence
				.findByPrimaryKey(questionId);
		int hitCount = question.getHitCount();
		++hitCount;
		question.setHitCount(hitCount);

		faqQuestionPersistence.update(question, false);

		return question;
	}

	public FAQQuestion unapproveQuestion(long groupId, long questionId)
			throws PortalException, SystemException {

		FAQQuestion question = faqQuestionPersistence.findByG_Q(groupId,
				questionId);
		return unapproveQuestion(question.getId());
	}

	public FAQQuestion unapproveQuestion(long questionId)
			throws PortalException, SystemException {

		FAQQuestion question = faqQuestionPersistence
				.findByPrimaryKey(questionId);
		boolean isApproved = question.getApproved();
		if (isApproved) {
			question.setApproved(false);
			faqQuestionPersistence.update(question, false);
		}

		return question;
	}

	public FAQQuestion approveQuestion(long groupId, long questionId)
			throws PortalException, SystemException {
		FAQQuestion question = faqQuestionPersistence.findByG_Q(groupId,
				questionId);
		return approveQuestion(question.getId());
	}

	public FAQQuestion approveQuestion(long questionId) throws PortalException,
			SystemException {
		FAQQuestion question = faqQuestionPersistence
				.findByPrimaryKey(questionId);
		boolean isApproved = question.getApproved();
		if (!isApproved) {
			question.setApproved(true);
			faqQuestionPersistence.update(question, false);
		}
		return question;
	}

	public List getAll() throws PortalException, SystemException {
		return faqQuestionPersistence.findAll();
	}

	public List getAll(long groupId) throws PortalException, SystemException {
		return faqQuestionPersistence.findByGroupId(groupId);
	}

	public List getAll(long groupId, int start, int end)
			throws PortalException, SystemException {
		return faqQuestionPersistence.findByGroupId(groupId, start, end);
	}

	public int countAll(long groupId) throws PortalException, SystemException {
		return faqQuestionPersistence.countByGroupId(groupId);
	}

	public List getApprovedQuestions(long groupId) throws PortalException,
			SystemException {
		return faqQuestionPersistence.findByG_A(groupId, true);
	}

	public List getApprovedQuestions(long groupId, int start, int end)
			throws PortalException, SystemException {
		return faqQuestionPersistence.findByG_A(groupId, true, start, end);
	}

	public int countApprovedQuestions(long groupId) throws PortalException,
			SystemException {
		return faqQuestionPersistence.countByG_A(groupId, true);
	}

	public List getUnapprovedQuestions(long groupId) throws PortalException,
			SystemException {
		return faqQuestionPersistence.findByG_A(groupId, false);
	}

	public FAQQuestion getQuestion(long groupId, long questionId)
			throws PortalException, SystemException {
		return faqQuestionPersistence.findByG_Q(groupId, questionId);
	}

	public FAQQuestion getQuestion(long questionId) throws PortalException,
			SystemException {
		return faqQuestionPersistence.findByPrimaryKey(questionId);
	}

	public List getByGroupId(long groupId) throws PortalException,
			SystemException {
		return faqQuestionPersistence.findByGroupId(groupId);
	}

	// get top question cuongnv
	public List getTopQuestion(long groupId, String language, int quantity,
			boolean approved) throws PortalException, SystemException {
		return faqQuestionFinder.findByG_Q_A(groupId, language, quantity,
				approved);
	}

	// get list by quantity
	public List getOtherQuestion(long groupId, String language,
			boolean approved, int begin, int end) throws PortalException,
			SystemException {
		return faqQuestionPersistence.findByG_L_A(groupId, language, approved,
				begin, end);
	}

	public List getQuestionsInCategory(long groupId, String language,
			long categoryId) throws SystemException, PortalException {
		return faqQuestionFinder
				.findByCategoryId(groupId, language, categoryId);
	}

	public void addQuestionResources(long questionId,
			boolean addCommunityPermissions, boolean addGuestPermissions)
			throws PortalException, SystemException {

		FAQQuestion question = faqQuestionPersistence
				.findByPrimaryKey(questionId);

		addQuestionResources(question, addCommunityPermissions,
				addGuestPermissions);
	}

	public void addQuestionResources(FAQQuestion question,
			boolean addCommunityPermissions, boolean addGuestPermissions)
			throws PortalException, SystemException {

		resourceLocalService.addResources(PortalUtil.getDefaultCompanyId(),
				question.getGroupId(), question.getUserId(),
				FAQQuestion.class.getName(), question.getId(), false,
				addCommunityPermissions, addGuestPermissions);
	}

	public void addQuestionResources(long questionId,
			String[] communityPermissions, String[] guestPermissions)
			throws PortalException, SystemException {

		FAQQuestion question = faqQuestionPersistence
				.findByPrimaryKey(questionId);

		addQuestionResources(question, communityPermissions, guestPermissions);

	}

	public void addQuestionResources(FAQQuestion question,
			String[] communityPermissions, String[] guestPermissions)
			throws PortalException, SystemException {

		resourceLocalService.addModelResources(PortalUtil.getDefaultCompanyId(),
				question.getGroupId(), question.getUserId(),
				DLFileShortcut.class.getName(), question.getId(),
				communityPermissions, guestPermissions);
	}

	public Hits search(long companyId, long groupId, long userId,
			String keywords, int start, int end) throws SystemException {
		try {
			BooleanQuery contextQuery = BooleanQueryFactoryUtil.create();

			contextQuery.addRequiredTerm(Field.PORTLET_ID,
					PortletKeysExt.FAQ_QUESTION);

			if (groupId > 0) {
				contextQuery.addRequiredTerm(Field.GROUP_ID, groupId);
			}

			if (userId > 0) {
				contextQuery.addRequiredTerm(Field.USER_ID, userId);
			}

			BooleanQuery searchQuery = BooleanQueryFactoryUtil.create();

			if (Validator.isNotNull(keywords)) {
				searchQuery.addTerm(Field.TITLE, keywords);
				searchQuery.addTerm(Field.CONTENT, keywords);
				/*searchQuery.addTerm(Field.TAGS_ENTRIES, keywords);*/
			}

			BooleanQuery fullQuery = BooleanQueryFactoryUtil.create();

			fullQuery.add(contextQuery, BooleanClauseOccur.MUST);

			if (searchQuery.clauses().size() > 0) {
				fullQuery.add(searchQuery, BooleanClauseOccur.MUST);
			}

			return SearchEngineUtil.search(companyId, fullQuery, start, end);
		} catch (Exception e) {
			throw new SystemException(e);
		}
	}
}