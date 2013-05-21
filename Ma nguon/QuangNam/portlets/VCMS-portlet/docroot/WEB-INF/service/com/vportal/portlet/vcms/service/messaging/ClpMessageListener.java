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

package com.vportal.portlet.vcms.service.messaging;

import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.messaging.Message;
import com.liferay.portal.kernel.messaging.MessageListener;

import com.vportal.portlet.vcms.service.ClpSerializer;
import com.vportal.portlet.vcms.service.VcmsArticleServiceUtil;
import com.vportal.portlet.vcms.service.VcmsArticleStatusLocalServiceUtil;
import com.vportal.portlet.vcms.service.VcmsArticleTypeLocalServiceUtil;
import com.vportal.portlet.vcms.service.VcmsArticleVersionServiceUtil;
import com.vportal.portlet.vcms.service.VcmsAttachedMessageServiceUtil;
import com.vportal.portlet.vcms.service.VcmsCARelationServiceUtil;
import com.vportal.portlet.vcms.service.VcmsCategoryServiceUtil;
import com.vportal.portlet.vcms.service.VcmsDiscussionServiceUtil;
import com.vportal.portlet.vcms.service.VcmsLoggerServiceUtil;
import com.vportal.portlet.vcms.service.VcmsPARelationServiceUtil;
import com.vportal.portlet.vcms.service.VcmsPortionServiceUtil;
import com.vportal.portlet.vcms.service.VcmsStatusLocalServiceUtil;
import com.vportal.portlet.vcms.service.VcmsTARelationServiceUtil;
import com.vportal.portlet.vcms.service.VcmsThreadServiceUtil;
import com.vportal.portlet.vcms.service.VcmsTypeServiceUtil;

/**
 * @author Brian Wing Shun Chan
 */
public class ClpMessageListener implements MessageListener {
	public static final String SERVLET_CONTEXT_NAME = ClpSerializer.SERVLET_CONTEXT_NAME;

	public void receive(Message message) {
		try {
			doReceive(message);
		}
		catch (Exception e) {
			_log.error("Unable to process message " + message, e);
		}
	}

	protected void doReceive(Message message) throws Exception {
		String command = message.getString("command");
		String servletContextName = message.getString("servletContextName");

		if (command.equals("undeploy") &&
				servletContextName.equals(SERVLET_CONTEXT_NAME)) {
			VcmsTypeServiceUtil.clearService();

			VcmsPortionServiceUtil.clearService();

			VcmsCategoryServiceUtil.clearService();

			VcmsArticleServiceUtil.clearService();
			VcmsStatusLocalServiceUtil.clearService();

			VcmsArticleVersionServiceUtil.clearService();
			VcmsArticleStatusLocalServiceUtil.clearService();

			VcmsArticleTypeLocalServiceUtil.clearService();

			VcmsAttachedMessageServiceUtil.clearService();

			VcmsThreadServiceUtil.clearService();

			VcmsDiscussionServiceUtil.clearService();

			VcmsPARelationServiceUtil.clearService();

			VcmsCARelationServiceUtil.clearService();

			VcmsTARelationServiceUtil.clearService();

			VcmsLoggerServiceUtil.clearService();
		}
	}

	private static Log _log = LogFactoryUtil.getLog(ClpMessageListener.class);
}