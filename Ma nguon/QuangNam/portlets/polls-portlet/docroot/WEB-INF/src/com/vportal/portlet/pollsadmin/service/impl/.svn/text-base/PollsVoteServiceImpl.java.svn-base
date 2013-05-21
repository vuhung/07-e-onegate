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

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.security.auth.PrincipalException;
import com.liferay.portal.security.permission.ActionKeys;
import com.vportal.portlet.pollsadmin.model.PollsVote;
import com.vportal.portlet.pollsadmin.service.base.PollsVoteServiceBaseImpl;

/**
 * The implementation of the polls vote remote service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link com.vportal.portlet.pollsadmin.service.PollsVoteService} interface.
 * </p>
 *
 * <p>
 * Never reference this interface directly. Always use {@link com.vportal.portlet.pollsadmin.service.PollsVoteServiceUtil} to access the polls vote remote service.
 * </p>
 *
 * <p>
 * This is a remote service. Methods of this service are expected to have security checks based on the propagated JAAS credentials because this service can be accessed remotely.
 * </p>
 *
 * @author ACB
 * @see com.vportal.portlet.pollsadmin.service.base.PollsVoteServiceBaseImpl
 * @see com.vportal.portlet.pollsadmin.service.PollsVoteServiceUtil
 */
public class PollsVoteServiceImpl extends PollsVoteServiceBaseImpl {
	public PollsVote addVote(long questionId, long choiceId, boolean guestVote)
			throws PortalException, SystemException {

		long userId = 0;

		try {
			userId = getUserId();
		} catch (PrincipalException pe) {
			userId = counterLocalService.increment();
		}

//		if (!guestVote) {
//			PollsQuestionPermission.check(getPermissionChecker(), questionId,
//					ActionKeys.ADD_VOTE);
//		}

		return pollsVoteLocalService.addVote(userId, questionId, choiceId,
				guestVote);
	}
}