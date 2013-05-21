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

package com.vportal.portlet.polls.service;

/**
 * <p>
 * This class is a wrapper for {@link PollsQuestionExtService}.
 * </p>
 *
 * @author    HOAN
 * @see       PollsQuestionExtService
 * @generated
 */
public class PollsQuestionExtServiceWrapper implements PollsQuestionExtService {
	public PollsQuestionExtServiceWrapper(
		PollsQuestionExtService pollsQuestionExtService) {
		_pollsQuestionExtService = pollsQuestionExtService;
	}

	public java.util.List getPollsQuestions()
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.rmi.RemoteException {
		return _pollsQuestionExtService.getPollsQuestions();
	}

	public PollsQuestionExtService getWrappedPollsQuestionExtService() {
		return _pollsQuestionExtService;
	}

	private PollsQuestionExtService _pollsQuestionExtService;
}