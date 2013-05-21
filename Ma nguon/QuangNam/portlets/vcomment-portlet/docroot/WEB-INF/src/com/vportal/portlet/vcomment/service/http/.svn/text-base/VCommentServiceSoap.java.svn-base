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

package com.vportal.portlet.vcomment.service.http;

import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;

import com.vportal.portlet.vcomment.service.VCommentServiceUtil;

import java.rmi.RemoteException;

/**
 * <p>
 * This class provides a SOAP utility for the
 * {@link com.vportal.portlet.vcomment.service.VCommentServiceUtil} service utility. The
 * static methods of this class calls the same methods of the service utility.
 * However, the signatures are different because it is difficult for SOAP to
 * support certain types.
 * </p>
 *
 * <p>
 * ServiceBuilder follows certain rules in translating the methods. For example,
 * if the method in the service utility returns a {@link java.util.List}, that
 * is translated to an array of {@link com.vportal.portlet.vcomment.model.VCommentSoap}.
 * If the method in the service utility returns a
 * {@link com.vportal.portlet.vcomment.model.VComment}, that is translated to a
 * {@link com.vportal.portlet.vcomment.model.VCommentSoap}. Methods that SOAP cannot
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
 * @see       VCommentServiceHttp
 * @see       com.vportal.portlet.vcomment.model.VCommentSoap
 * @see       com.vportal.portlet.vcomment.service.VCommentServiceUtil
 * @generated
 */
public class VCommentServiceSoap {
	public static com.vportal.portlet.vcomment.model.VCommentSoap addComment(
		long groupId, long companyId, long plid, java.lang.String guestName,
		java.lang.String email, java.lang.String title,
		java.lang.String address, java.lang.String phone, java.lang.String fax,
		java.lang.String content, boolean hasAttach, int status, long userId)
		throws RemoteException {
		try {
			com.vportal.portlet.vcomment.model.VComment returnValue = VCommentServiceUtil.addComment(groupId,
					companyId, plid, guestName, email, title, address, phone,
					fax, content, hasAttach, status, userId);

			return com.vportal.portlet.vcomment.model.VCommentSoap.toSoapModel(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static com.vportal.portlet.vcomment.model.VCommentSoap updateContact(
		long Id, long groupId, long companyId, java.lang.String guestName,
		java.lang.String email, java.lang.String title,
		java.lang.String address, java.lang.String phone, java.lang.String fax,
		java.lang.String content, boolean hasAttach, int status)
		throws RemoteException {
		try {
			com.vportal.portlet.vcomment.model.VComment returnValue = VCommentServiceUtil.updateContact(Id,
					groupId, companyId, guestName, email, title, address,
					phone, fax, content, hasAttach, status);

			return com.vportal.portlet.vcomment.model.VCommentSoap.toSoapModel(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static com.vportal.portlet.vcomment.model.VCommentSoap updateContact(
		com.vportal.portlet.vcomment.model.VComment contact)
		throws RemoteException {
		try {
			com.vportal.portlet.vcomment.model.VComment returnValue = VCommentServiceUtil.updateContact(contact);

			return com.vportal.portlet.vcomment.model.VCommentSoap.toSoapModel(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static void deleteContact(long Id) throws RemoteException {
		try {
			VCommentServiceUtil.deleteContact(Id);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static com.vportal.portlet.vcomment.model.VCommentSoap[] getAll()
		throws RemoteException {
		try {
			java.util.List returnValue = VCommentServiceUtil.getAll();

			return com.vportal.portlet.vcomment.model.VCommentSoap.toSoapModels(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static com.vportal.portlet.vcomment.model.VCommentSoap[] getByStatus(
		int status) throws RemoteException {
		try {
			java.util.List returnValue = VCommentServiceUtil.getByStatus(status);

			return com.vportal.portlet.vcomment.model.VCommentSoap.toSoapModels(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static com.vportal.portlet.vcomment.model.VCommentSoap[] getByG_S(
		long groupId, int status) throws RemoteException {
		try {
			java.util.List returnValue = VCommentServiceUtil.getByG_S(groupId,
					status);

			return com.vportal.portlet.vcomment.model.VCommentSoap.toSoapModels(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static com.vportal.portlet.vcomment.model.VCommentSoap[] getByG_S(
		long groupId, int status, int start, int end) throws RemoteException {
		try {
			java.util.List returnValue = VCommentServiceUtil.getByG_S(groupId,
					status, start, end);

			return com.vportal.portlet.vcomment.model.VCommentSoap.toSoapModels(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static com.vportal.portlet.vcomment.model.VCommentSoap getContact(
		long Id) throws RemoteException {
		try {
			com.vportal.portlet.vcomment.model.VComment returnValue = VCommentServiceUtil.getContact(Id);

			return com.vportal.portlet.vcomment.model.VCommentSoap.toSoapModel(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static com.vportal.portlet.vcomment.model.VCommentSoap addContact(
		long arg0, long arg1, long arg2, java.lang.String arg3,
		java.lang.String arg4, java.lang.String arg5, java.lang.String arg6,
		java.lang.String arg7, java.lang.String arg8, java.lang.String arg9,
		boolean arg10, int arg11, long arg12, java.lang.String[] arg13,
		java.lang.String[] arg14) throws RemoteException {
		try {
			com.vportal.portlet.vcomment.model.VComment returnValue = VCommentServiceUtil.addContact(arg0,
					arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9,
					arg10, arg11, arg12, arg13, arg14);

			return com.vportal.portlet.vcomment.model.VCommentSoap.toSoapModel(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static com.vportal.portlet.vcomment.model.VCommentSoap addContact(
		long arg0, long arg1, long arg2, java.lang.String arg3,
		java.lang.String arg4, java.lang.String arg5, java.lang.String arg6,
		java.lang.String arg7, java.lang.String arg8, java.lang.String arg9,
		boolean arg10, int arg11, long arg12, java.lang.Boolean arg13,
		java.lang.Boolean arg14, java.lang.String[] arg15,
		java.lang.String[] arg16) throws RemoteException {
		try {
			com.vportal.portlet.vcomment.model.VComment returnValue = VCommentServiceUtil.addContact(arg0,
					arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9,
					arg10, arg11, arg12, arg13, arg14, arg15, arg16);

			return com.vportal.portlet.vcomment.model.VCommentSoap.toSoapModel(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	private static Log _log = LogFactoryUtil.getLog(VCommentServiceSoap.class);
}