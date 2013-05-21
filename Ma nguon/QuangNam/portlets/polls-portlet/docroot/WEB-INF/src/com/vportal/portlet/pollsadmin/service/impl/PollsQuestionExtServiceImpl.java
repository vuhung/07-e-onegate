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

import java.rmi.RemoteException;
import java.util.List;

import com.liferay.portal.PortalException;
import com.liferay.portal.SystemException;
import com.liferay.portlet.polls.service.persistence.PollsQuestionUtil;
import com.vportal.portlet.pollsadmin.service.base.PollsQuestionExtServiceBaseImpl;

public class PollsQuestionExtServiceImpl extends PollsQuestionExtServiceBaseImpl {
	
	public List getPollsQuestions(long groupId) throws PortalException,
	SystemException, RemoteException {

try {
	return PollsQuestionUtil.findByGroupId(groupId);
} catch (com.liferay.portal.kernel.exception.SystemException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
return null;
}
}