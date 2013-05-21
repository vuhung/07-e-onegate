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

import java.util.List;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.security.permission.ActionKeys;
import com.liferay.portal.service.permission.PortletPermissionUtil;
import com.liferay.portal.util.PortletKeys;
import com.vportal.portlet.pollsadmin.model.PollsChoice;
import com.vportal.portlet.pollsadmin.model.PollsQuestion;
import com.vportal.portlet.pollsadmin.service.base.PollsQuestionServiceBaseImpl;

/**
 * The implementation of the polls question remote service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link com.vportal.portlet.pollsadmin.service.PollsQuestionService} interface.
 * </p>
 *
 * <p>
 * Never reference this interface directly. Always use {@link com.vportal.portlet.pollsadmin.service.PollsQuestionServiceUtil} to access the polls question remote service.
 * </p>
 *
 * <p>
 * This is a remote service. Methods of this service are expected to have security checks based on the propagated JAAS credentials because this service can be accessed remotely.
 * </p>
 *
 * @author ACB
 * @see com.vportal.portlet.pollsadmin.service.base.PollsQuestionServiceBaseImpl
 * @see com.vportal.portlet.pollsadmin.service.PollsQuestionServiceUtil
 */
public class PollsQuestionServiceImpl extends PollsQuestionServiceBaseImpl {

	public PollsQuestion addQuestion(
			long plid, String title, String description,
			int expirationDateMonth, int expirationDateDay,
			int expirationDateYear, int expirationDateHour,
			int expirationDateMinute, boolean neverExpire,
			List<PollsChoice> choices)
		throws PortalException, SystemException {

//		PortletPermissionUtil.check(
//			getPermissionChecker(), plid, PortletKeys.POLLS,
//			ActionKeys.ADD_QUESTION);

		return pollsQuestionLocalService.addQuestion(
			getUserId(), plid, title, description, expirationDateMonth,
			expirationDateDay, expirationDateYear, expirationDateHour,
			expirationDateMinute, neverExpire, choices);
	}


	public void deleteQuestion(long questionId)
		throws PortalException, SystemException {

//		PollsQuestionPermission.check(
//			getPermissionChecker(), questionId, ActionKeys.DELETE);

		pollsQuestionLocalService.deleteQuestion(questionId);
	}

	public PollsQuestion getQuestion(long questionId)
		throws PortalException, SystemException {

//		PollsQuestionPermission.check(
//			getPermissionChecker(), questionId, ActionKeys.VIEW);

		return pollsQuestionLocalService.getQuestion(questionId);
	}

	public PollsQuestion updateQuestion(
			long questionId, String title, String description,
			int expirationDateMonth, int expirationDateDay,
			int expirationDateYear, int expirationDateHour,
			int expirationDateMinute, boolean neverExpire,
			List<PollsChoice> choices)
		throws PortalException, SystemException {

//		PollsQuestionPermission.check(
//			getPermissionChecker(), questionId, ActionKeys.UPDATE);

		return pollsQuestionLocalService.updateQuestion(
			getUserId(), questionId, title, description, expirationDateMonth,
			expirationDateDay, expirationDateYear, expirationDateHour,
			expirationDateMinute, neverExpire, choices);
	}

}