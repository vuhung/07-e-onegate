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

package com.vportal.portlet.vlegal.service.http;

import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;

import com.vportal.portlet.vlegal.service.VLegalAttachedMessageServiceUtil;

import java.rmi.RemoteException;

/**
 * <p>
 * This class provides a SOAP utility for the
 * {@link com.vportal.portlet.vlegal.service.VLegalAttachedMessageServiceUtil} service utility. The
 * static methods of this class calls the same methods of the service utility.
 * However, the signatures are different because it is difficult for SOAP to
 * support certain types.
 * </p>
 *
 * <p>
 * ServiceBuilder follows certain rules in translating the methods. For example,
 * if the method in the service utility returns a {@link java.util.List}, that
 * is translated to an array of {@link com.vportal.portlet.vlegal.model.VLegalAttachedMessageSoap}.
 * If the method in the service utility returns a
 * {@link com.vportal.portlet.vlegal.model.VLegalAttachedMessage}, that is translated to a
 * {@link com.vportal.portlet.vlegal.model.VLegalAttachedMessageSoap}. Methods that SOAP cannot
 * safely wire are skipped.
 * </p>
 *
 * <p>
 * The benefits of using the SOAP utility is that it is cross platform
 * compatible. SOAP allows different languages like Java, .NET, C++, PHP, and
 * even Perl, to call the generated services. One drawback of SOAP is that it is
 * slow because it needs to serialize all calls into a text format (XML).
 * </p>
 *
 * <p>
 * You can see a list of services at
 * http://localhost:8080/tunnel-web/secure/axis. Set the property
 * <b>tunnel.servlet.hosts.allowed</b> in portal.properties to configure
 * security.
 * </p>
 *
 * <p>
 * The SOAP utility is only generated for remote services.
 * </p>
 *
 * @author    ACB
 * @see       VLegalAttachedMessageServiceHttp
 * @see       com.vportal.portlet.vlegal.model.VLegalAttachedMessageSoap
 * @see       com.vportal.portlet.vlegal.service.VLegalAttachedMessageServiceUtil
 * @generated
 */
public class VLegalAttachedMessageServiceSoap {
	public static com.vportal.portlet.vlegal.model.VLegalAttachedMessageSoap addMessage(
		long groupId, java.lang.String articleId, java.lang.String content,
		boolean read) throws RemoteException {
		try {
			com.vportal.portlet.vlegal.model.VLegalAttachedMessage returnValue = VLegalAttachedMessageServiceUtil.addMessage(groupId,
					articleId, content, read);

			return com.vportal.portlet.vlegal.model.VLegalAttachedMessageSoap.toSoapModel(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static com.vportal.portlet.vlegal.model.VLegalAttachedMessageSoap updateMessage(
		java.lang.String messageId, boolean read) throws RemoteException {
		try {
			com.vportal.portlet.vlegal.model.VLegalAttachedMessage returnValue = VLegalAttachedMessageServiceUtil.updateMessage(messageId,
					read);

			return com.vportal.portlet.vlegal.model.VLegalAttachedMessageSoap.toSoapModel(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static com.vportal.portlet.vlegal.model.VLegalAttachedMessageSoap updateMessage(
		com.vportal.portlet.vlegal.model.VLegalAttachedMessage message)
		throws RemoteException {
		try {
			com.vportal.portlet.vlegal.model.VLegalAttachedMessage returnValue = VLegalAttachedMessageServiceUtil.updateMessage(message);

			return com.vportal.portlet.vlegal.model.VLegalAttachedMessageSoap.toSoapModel(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static void deleteMessage(java.lang.String messageId)
		throws RemoteException {
		try {
			VLegalAttachedMessageServiceUtil.deleteMessage(messageId);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static void deleteMessages(java.lang.String articleId)
		throws RemoteException {
		try {
			VLegalAttachedMessageServiceUtil.deleteMessages(articleId);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static com.vportal.portlet.vlegal.model.VLegalAttachedMessageSoap[] getAllMessageByStatus(
		long groupId, boolean read) throws RemoteException {
		try {
			java.util.List returnValue = VLegalAttachedMessageServiceUtil.getAllMessageByStatus(groupId,
					read);

			return com.vportal.portlet.vlegal.model.VLegalAttachedMessageSoap.toSoapModels(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static com.vportal.portlet.vlegal.model.VLegalAttachedMessageSoap getMessage(
		java.lang.String messageId) throws RemoteException {
		try {
			com.vportal.portlet.vlegal.model.VLegalAttachedMessage returnValue = VLegalAttachedMessageServiceUtil.getMessage(messageId);

			return com.vportal.portlet.vlegal.model.VLegalAttachedMessageSoap.toSoapModel(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static com.vportal.portlet.vlegal.model.VLegalAttachedMessageSoap[] getMessages(
		java.lang.String[] messageIds) throws RemoteException {
		try {
			java.util.List returnValue = VLegalAttachedMessageServiceUtil.getMessages(messageIds);

			return com.vportal.portlet.vlegal.model.VLegalAttachedMessageSoap.toSoapModels(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static com.vportal.portlet.vlegal.model.VLegalAttachedMessageSoap[] getMessages(
		java.lang.String articleId) throws RemoteException {
		try {
			java.util.List returnValue = VLegalAttachedMessageServiceUtil.getMessages(articleId);

			return com.vportal.portlet.vlegal.model.VLegalAttachedMessageSoap.toSoapModels(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static com.vportal.portlet.vlegal.model.VLegalAttachedMessageSoap[] getMessages(
		java.lang.String articleId, boolean read) throws RemoteException {
		try {
			java.util.List returnValue = VLegalAttachedMessageServiceUtil.getMessages(articleId,
					read);

			return com.vportal.portlet.vlegal.model.VLegalAttachedMessageSoap.toSoapModels(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static com.vportal.portlet.vlegal.model.VLegalAttachedMessageSoap[] getMessagesByGroup(
		long groupId) throws RemoteException {
		try {
			java.util.List returnValue = VLegalAttachedMessageServiceUtil.getMessagesByGroup(groupId);

			return com.vportal.portlet.vlegal.model.VLegalAttachedMessageSoap.toSoapModels(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static int count(java.lang.String articleId, boolean read)
		throws RemoteException {
		try {
			int returnValue = VLegalAttachedMessageServiceUtil.count(articleId,
					read);

			return returnValue;
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	private static Log _log = LogFactoryUtil.getLog(VLegalAttachedMessageServiceSoap.class);
}