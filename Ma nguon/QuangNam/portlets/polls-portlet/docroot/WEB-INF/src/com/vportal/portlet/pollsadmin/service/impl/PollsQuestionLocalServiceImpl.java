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

package com.vportal.portlet.pollsadmin.service.impl;

import java.util.Date;
import java.util.List;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ResourceConstants;
import com.liferay.portal.model.User;
import com.liferay.portal.util.PortalUtil;
import com.vportal.portlet.pollsadmin.QuestionChoiceException;
import com.vportal.portlet.pollsadmin.QuestionDescriptionException;
import com.vportal.portlet.pollsadmin.QuestionExpirationDateException;
import com.vportal.portlet.pollsadmin.QuestionTitleException;
import com.vportal.portlet.pollsadmin.model.PollsChoice;
import com.vportal.portlet.pollsadmin.model.PollsQuestion;
import com.vportal.portlet.pollsadmin.service.base.PollsQuestionLocalServiceBaseImpl;

/**
 * The implementation of the polls question local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link com.vportal.portlet.pollsadmin.service.PollsQuestionLocalService} interface.
 * </p>
 *
 * <p>
 * Never reference this interface directly. Always use {@link com.vportal.portlet.pollsadmin.service.PollsQuestionLocalServiceUtil} to access the polls question local service.
 * </p>
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author ACB
 * @see com.vportal.portlet.pollsadmin.service.base.PollsQuestionLocalServiceBaseImpl
 * @see com.vportal.portlet.pollsadmin.service.PollsQuestionLocalServiceUtil
 */
public class PollsQuestionLocalServiceImpl
	extends PollsQuestionLocalServiceBaseImpl {

	public PollsQuestion addQuestion(
			long userId, long plid, String title, String description,
			int expirationDateMonth, int expirationDateDay,
			int expirationDateYear, int expirationDateHour,
			int expirationDateMinute, boolean neverExpire)
		throws PortalException, SystemException {

		return addQuestion(
			null, userId, plid, title, description, expirationDateMonth,
			expirationDateDay, expirationDateYear, expirationDateHour,
			expirationDateMinute, neverExpire, null);
	}

	public PollsQuestion addQuestion(
			String uuid, long userId, long plid, String title,
			String description, int expirationDateMonth, int expirationDateDay,
			int expirationDateYear, int expirationDateHour,
			int expirationDateMinute, boolean neverExpire)
		throws PortalException, SystemException {

		return addQuestion(
			uuid, userId, plid, title, description, expirationDateMonth,
			expirationDateDay, expirationDateYear, expirationDateHour,
			expirationDateMinute, neverExpire, null);
	}



	public PollsQuestion addQuestion(
			long userId, long plid, String title, String description,
			int expirationDateMonth, int expirationDateDay,
			int expirationDateYear, int expirationDateHour,
			int expirationDateMinute, boolean neverExpire,
			List<PollsChoice> choices)
		throws PortalException, SystemException {

		return addQuestion(
			null, userId, plid, title, description, expirationDateMonth,
			expirationDateDay, expirationDateYear, expirationDateHour,
			expirationDateMinute, neverExpire, choices);
	}


	public PollsQuestion addQuestion(
			String uuid, long userId, long plid, String title,
			String description, int expirationDateMonth, int expirationDateDay,
			int expirationDateYear, int expirationDateHour,
			int expirationDateMinute, boolean neverExpire,
			List<PollsChoice> choices)
		throws PortalException, SystemException {

		// Question

		User user = userPersistence.findByPrimaryKey(userId);
		long groupId = PortalUtil.getScopeGroupId(plid);

		Date expirationDate = null;

		if (!neverExpire) {
			expirationDate = PortalUtil.getDate(
				expirationDateMonth, expirationDateDay, expirationDateYear,
				expirationDateHour, expirationDateMinute, user.getTimeZone(),
				new QuestionExpirationDateException());
		}

		Date now = new Date();

		validate(title, description, choices);

		long questionId = counterLocalService.increment();

		PollsQuestion question = pollsQuestionPersistence.create(questionId);

		question.setUuid(uuid);
		question.setGroupId(groupId);
		question.setCompanyId(user.getCompanyId());
		question.setUserId(user.getUserId());
		question.setUserName(user.getFullName());
		question.setCreateDate(now);
		question.setModifiedDate(now);
		question.setTitle(title);
		question.setDescription(description);
		question.setExpirationDate(expirationDate);

		pollsQuestionPersistence.update(question, false);

		// Resources

//		if ((addCommunityPermissions != null) &&
//			(addGuestPermissions != null)) {
//
//			addQuestionResources(
//				question, addCommunityPermissions.booleanValue(),
//				addGuestPermissions.booleanValue());
//		}
//		else {
//			addQuestionResources(
//				question, communityPermissions, guestPermissions);
//		}

		// Choices

		if (choices != null) {
			for (PollsChoice choice : choices) {
				pollsChoiceLocalService.addChoice(
					questionId, choice.getName(), choice.getDescription());
			}
		}

		return question;
	}

	public void addQuestionResources(
			long questionId, boolean addCommunityPermissions,
			boolean addGuestPermissions)
		throws PortalException, SystemException {

		PollsQuestion question = pollsQuestionPersistence.findByPrimaryKey(
			questionId);

		addQuestionResources(
			question, addCommunityPermissions, addGuestPermissions);
	}

	public void addQuestionResources(
			PollsQuestion question, boolean addCommunityPermissions,
			boolean addGuestPermissions)
		throws PortalException, SystemException {

		resourceLocalService.addResources(
			question.getCompanyId(), question.getGroupId(),
			question.getUserId(), PollsQuestion.class.getName(),
			question.getQuestionId(), false, addCommunityPermissions,
			addGuestPermissions);
	}

	public void addQuestionResources(
			long questionId, String[] communityPermissions,
			String[] guestPermissions)
		throws PortalException, SystemException {

		PollsQuestion question = pollsQuestionPersistence.findByPrimaryKey(
			questionId);

		addQuestionResources(question, communityPermissions, guestPermissions);
	}

	public void addQuestionResources(
			PollsQuestion question, String[] communityPermissions,
			String[] guestPermissions)
		throws PortalException, SystemException {

		resourceLocalService.addModelResources(
			question.getCompanyId(), question.getGroupId(),
			question.getUserId(), PollsQuestion.class.getName(),
			question.getQuestionId(), communityPermissions, guestPermissions);
	}

	public void deleteQuestion(long questionId)
		throws PortalException, SystemException {

		PollsQuestion question = pollsQuestionPersistence.findByPrimaryKey(
			questionId);

		deleteQuestion(question);
	}

	public void deleteQuestion(PollsQuestion question)
		throws PortalException, SystemException {

		// Votes

		pollsVotePersistence.removeByQuestionId(question.getQuestionId());

		// Choices

		pollsChoicePersistence.removeByQuestionId(question.getQuestionId());

		// Resources

		resourceLocalService.deleteResource(
			question.getCompanyId(), PollsQuestion.class.getName(),
			ResourceConstants.SCOPE_INDIVIDUAL, question.getQuestionId());

		// Question

		pollsQuestionPersistence.remove(question);
	}

	public void deleteQuestions(long groupId)
		throws PortalException, SystemException {

		for (PollsQuestion question :
				pollsQuestionPersistence.findByGroupId(groupId)) {

			deleteQuestion(question);
		}
	}

	public PollsQuestion getQuestion(long questionId)
		throws PortalException, SystemException {

		return pollsQuestionPersistence.findByPrimaryKey(questionId);
	}

	public List<PollsQuestion> getQuestions(long groupId)
		throws SystemException {

		return pollsQuestionPersistence.findByGroupId(groupId);
	}

	public List<PollsQuestion> getQuestions(long groupId, int start, int end)
		throws SystemException {

		return pollsQuestionPersistence.findByGroupId(groupId, start, end);
	}

	public int getQuestionsCount(long groupId) throws SystemException {
		return pollsQuestionPersistence.countByGroupId(groupId);
	}

	public PollsQuestion updateQuestion(
			long userId, long questionId, String title, String description,
			int expirationDateMonth, int expirationDateDay,
			int expirationDateYear, int expirationDateHour,
			int expirationDateMinute, boolean neverExpire)
		throws PortalException, SystemException {

		return updateQuestion(
			userId, questionId, title, description, expirationDateMonth,
			expirationDateDay, expirationDateYear, expirationDateHour,
			expirationDateMinute, neverExpire, null);
	}

	public PollsQuestion updateQuestion(
			long userId, long questionId, String title, String description,
			int expirationDateMonth, int expirationDateDay,
			int expirationDateYear, int expirationDateHour,
			int expirationDateMinute, boolean neverExpire,
			List<PollsChoice> choices)
		throws PortalException, SystemException {

		// Question

		User user = userPersistence.findByPrimaryKey(userId);

		Date expirationDate = null;

		if (!neverExpire) {
			expirationDate = PortalUtil.getDate(
				expirationDateMonth, expirationDateDay, expirationDateYear,
				expirationDateHour, expirationDateMinute, user.getTimeZone(),
				new QuestionExpirationDateException());
		}

		validate(title, description, choices);

		PollsQuestion question = pollsQuestionPersistence.findByPrimaryKey(
			questionId);

		question.setModifiedDate(new Date());
		question.setTitle(title);
		question.setDescription(description);
		question.setExpirationDate(expirationDate);

		pollsQuestionPersistence.update(question, false);

		// Choices

		int oldChoicesCount = pollsChoicePersistence.countByQuestionId(
			questionId);

		if (oldChoicesCount > choices.size()) {
			throw new QuestionChoiceException();
		}

		for (PollsChoice choice : choices) {
			String choiceName = choice.getName();
			String choiceDescription = choice.getDescription();

			choice = pollsChoicePersistence.fetchByQ_N(questionId, choiceName);

			if (choice == null) {
				pollsChoiceLocalService.addChoice(
					questionId, choiceName, choiceDescription);
			}
			else {
				pollsChoiceLocalService.updateChoice(
					choice.getChoiceId(), questionId, choiceName,
					choiceDescription);
			}
		}

		return question;
	}

	protected void validate(
			String title, String description, List<PollsChoice> choices)
		throws PortalException {

		if (Validator.isNull(title)) {
			throw new QuestionTitleException();
		}
		else if (Validator.isNull(description)) {
			throw new QuestionDescriptionException();
		}

		if (choices != null && choices.size() < 2) {
			throw new QuestionChoiceException();
		}
	}
}