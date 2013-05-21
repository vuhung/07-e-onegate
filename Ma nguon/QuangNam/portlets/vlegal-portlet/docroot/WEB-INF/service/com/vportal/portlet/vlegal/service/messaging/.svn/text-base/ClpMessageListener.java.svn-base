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

package com.vportal.portlet.vlegal.service.messaging;

import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.messaging.Message;
import com.liferay.portal.kernel.messaging.MessageListener;

import com.vportal.portlet.vlegal.service.ClpSerializer;
import com.vportal.portlet.vlegal.service.VLegalAttachedMessageServiceUtil;
import com.vportal.portlet.vlegal.service.VLegalDDRelServiceUtil;
import com.vportal.portlet.vlegal.service.VLegalDFRelServiceUtil;
import com.vportal.portlet.vlegal.service.VLegalDSRelServiceUtil;
import com.vportal.portlet.vlegal.service.VLegalDURelServiceUtil;
import com.vportal.portlet.vlegal.service.VLegalDocumentServiceUtil;
import com.vportal.portlet.vlegal.service.VLegalDraftDocumentServiceUtil;
import com.vportal.portlet.vlegal.service.VLegalFORelServiceUtil;
import com.vportal.portlet.vlegal.service.VLegalFTRelServiceUtil;
import com.vportal.portlet.vlegal.service.VLegalFieldServiceUtil;
import com.vportal.portlet.vlegal.service.VLegalLoggerServiceUtil;
import com.vportal.portlet.vlegal.service.VLegalOrgServiceUtil;
import com.vportal.portlet.vlegal.service.VLegalSignerServiceUtil;
import com.vportal.portlet.vlegal.service.VLegalSuggestDocumentServiceUtil;
import com.vportal.portlet.vlegal.service.VLegalTDRelServiceUtil;
import com.vportal.portlet.vlegal.service.VLegalTagsServiceUtil;
import com.vportal.portlet.vlegal.service.VLegalTypeServiceUtil;

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
			VLegalDocumentServiceUtil.clearService();

			VLegalFieldServiceUtil.clearService();

			VLegalTypeServiceUtil.clearService();

			VLegalDraftDocumentServiceUtil.clearService();

			VLegalSuggestDocumentServiceUtil.clearService();

			VLegalAttachedMessageServiceUtil.clearService();

			VLegalOrgServiceUtil.clearService();

			VLegalSignerServiceUtil.clearService();

			VLegalTagsServiceUtil.clearService();

			VLegalFORelServiceUtil.clearService();

			VLegalFTRelServiceUtil.clearService();

			VLegalDFRelServiceUtil.clearService();

			VLegalDDRelServiceUtil.clearService();

			VLegalDURelServiceUtil.clearService();

			VLegalDSRelServiceUtil.clearService();

			VLegalTDRelServiceUtil.clearService();

			VLegalLoggerServiceUtil.clearService();
		}
	}

	private static Log _log = LogFactoryUtil.getLog(ClpMessageListener.class);
}