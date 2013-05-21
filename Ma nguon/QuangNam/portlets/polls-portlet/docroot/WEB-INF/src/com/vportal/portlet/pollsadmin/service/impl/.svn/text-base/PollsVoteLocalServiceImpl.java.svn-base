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
import com.liferay.portlet.polls.DuplicateVoteException;
import com.liferay.portlet.polls.NoSuchQuestionException;
import com.liferay.portlet.polls.QuestionExpiredException;
import com.vportal.portlet.pollsadmin.model.PollsChoice;
import com.vportal.portlet.pollsadmin.model.PollsQuestion;
import com.vportal.portlet.pollsadmin.model.PollsVote;
import com.vportal.portlet.pollsadmin.service.base.PollsVoteLocalServiceBaseImpl;

/**
 * The implementation of the polls vote local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link com.vportal.portlet.pollsadmin.service.PollsVoteLocalService} interface.
 * </p>
 *
 * <p>
 * Never reference this interface directly. Always use {@link com.vportal.portlet.pollsadmin.service.PollsVoteLocalServiceUtil} to access the polls vote local service.
 * </p>
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author ACB
 * @see com.vportal.portlet.pollsadmin.service.base.PollsVoteLocalServiceBaseImpl
 * @see com.vportal.portlet.pollsadmin.service.PollsVoteLocalServiceUtil
 */
public class PollsVoteLocalServiceImpl extends PollsVoteLocalServiceBaseImpl {
	public PollsVote addVote(long userId, long questionId, long choiceId,
			boolean guestVote) throws PortalException, SystemException {

		// Choice

		Date now = new Date();

		PollsChoice choice = pollsChoicePersistence.findByPrimaryKey(choiceId);

		if (choice.getQuestionId() != questionId) {
			throw new NoSuchQuestionException();
		}

		// Question

		PollsQuestion question = pollsQuestionPersistence
				.findByPrimaryKey(questionId);

//		if (question.isExpired()) {
//			throw new QuestionExpiredException();
//		}

		question.setLastVoteDate(now);

		pollsQuestionPersistence.update(question, false);

		// Vote

		PollsVote vote = pollsVotePersistence.fetchByQ_U(questionId, userId);

		if (!guestVote) {
			if (vote != null) {
				throw new DuplicateVoteException();
			} else {
				long voteId = counterLocalService.increment();

				vote = pollsVotePersistence.create(voteId);

				vote.setUserId(userId);
				vote.setQuestionId(questionId);
				vote.setChoiceId(choiceId);
				vote.setVoteDate(now);

				pollsVotePersistence.update(vote, false);
			}
		} else {

			long voteId = counterLocalService.increment();

			vote = pollsVotePersistence.create(voteId);

			vote.setUserId(userId);
			vote.setQuestionId(questionId);
			vote.setChoiceId(choiceId);
			vote.setVoteDate(now);

			pollsVotePersistence.update(vote, false);

		}

		return vote;
	}

	public List<PollsVote> getChoiceVotes(long choiceId, int start, int end)
			throws SystemException {

		return pollsVotePersistence.findByChoiceId(choiceId, start, end);
	}

	public int getChoiceVotesCount(long choiceId) throws SystemException {
		return pollsVotePersistence.countByChoiceId(choiceId);
	}

	public PollsVote getVote(long questionId, long userId)
			throws PortalException, SystemException {

		return pollsVotePersistence.findByQ_U(questionId, userId);
	}

	public List<PollsVote> getQuestionVotes(long questionId, int start, int end)
			throws SystemException {

		return pollsVotePersistence.findByQuestionId(questionId, start, end);
	}

	public int getQuestionVotesCount(long questionId) throws SystemException {
		return pollsVotePersistence.countByQuestionId(questionId);
	}

	public PollsVote addVote(long arg0, long arg1, long arg2)
			throws PortalException, SystemException {
		// TODO Auto-generated method stub
		return null;
	}

}