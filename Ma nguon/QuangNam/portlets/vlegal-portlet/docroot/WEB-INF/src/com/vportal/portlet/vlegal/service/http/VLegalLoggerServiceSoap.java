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

import com.vportal.portlet.vlegal.service.VLegalLoggerServiceUtil;

import java.rmi.RemoteException;

/**
 * <p>
 * This class provides a SOAP utility for the
 * {@link com.vportal.portlet.vlegal.service.VLegalLoggerServiceUtil} service utility. The
 * static methods of this class calls the same methods of the service utility.
 * However, the signatures are different because it is difficult for SOAP to
 * support certain types.
 * </p>
 *
 * <p>
 * ServiceBuilder follows certain rules in translating the methods. For example,
 * if the method in the service utility returns a {@link java.util.List}, that
 * is translated to an array of {@link com.vportal.portlet.vlegal.model.VLegalLoggerSoap}.
 * If the method in the service utility returns a
 * {@link com.vportal.portlet.vlegal.model.VLegalLogger}, that is translated to a
 * {@link com.vportal.portlet.vlegal.model.VLegalLoggerSoap}. Methods that SOAP cannot
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
 * @see       VLegalLoggerServiceHttp
 * @see       com.vportal.portlet.vlegal.model.VLegalLoggerSoap
 * @see       com.vportal.portlet.vlegal.service.VLegalLoggerServiceUtil
 * @generated
 */
public class VLegalLoggerServiceSoap {
	public static com.vportal.portlet.vlegal.model.VLegalLoggerSoap log(
		long groupId, java.lang.String content) throws RemoteException {
		try {
			com.vportal.portlet.vlegal.model.VLegalLogger returnValue = VLegalLoggerServiceUtil.log(groupId,
					content);

			return com.vportal.portlet.vlegal.model.VLegalLoggerSoap.toSoapModel(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static com.vportal.portlet.vlegal.model.VLegalLoggerSoap[] findLogsByUser(
		java.lang.String userId) throws RemoteException {
		try {
			java.util.List returnValue = VLegalLoggerServiceUtil.findLogsByUser(userId);

			return com.vportal.portlet.vlegal.model.VLegalLoggerSoap.toSoapModels(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static com.vportal.portlet.vlegal.model.VLegalLoggerSoap[] findLogs(
		java.util.Date from, java.util.Date to) throws RemoteException {
		try {
			java.util.List returnValue = VLegalLoggerServiceUtil.findLogs(from,
					to);

			return com.vportal.portlet.vlegal.model.VLegalLoggerSoap.toSoapModels(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static void removeLogs(java.lang.String loggerId)
		throws RemoteException {
		try {
			VLegalLoggerServiceUtil.removeLogs(loggerId);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static com.vportal.portlet.vlegal.model.VLegalLoggerSoap[] findLogs()
		throws RemoteException {
		try {
			java.util.List returnValue = VLegalLoggerServiceUtil.findLogs();

			return com.vportal.portlet.vlegal.model.VLegalLoggerSoap.toSoapModels(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static com.vportal.portlet.vlegal.model.VLegalLoggerSoap[] findLogs(
		int begin, int end) throws RemoteException {
		try {
			java.util.List returnValue = VLegalLoggerServiceUtil.findLogs(begin,
					end);

			return com.vportal.portlet.vlegal.model.VLegalLoggerSoap.toSoapModels(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static int countLogs() throws RemoteException {
		try {
			int returnValue = VLegalLoggerServiceUtil.countLogs();

			return returnValue;
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static void removeLogs(java.util.Date from, java.util.Date to)
		throws RemoteException {
		try {
			VLegalLoggerServiceUtil.removeLogs(from, to);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static void addEntryResources(long entryId,
		boolean addCommunityPermissions, boolean addGuestPermissions)
		throws RemoteException {
		try {
			VLegalLoggerServiceUtil.addEntryResources(entryId,
				addCommunityPermissions, addGuestPermissions);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static void addEntryResources(
		com.vportal.portlet.vlegal.model.VLegalLogger entry,
		boolean addCommunityPermissions, boolean addGuestPermissions)
		throws RemoteException {
		try {
			VLegalLoggerServiceUtil.addEntryResources(entry,
				addCommunityPermissions, addGuestPermissions);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static void addEntryResources(long entryId,
		java.lang.String[] communityPermissions,
		java.lang.String[] guestPermissions) throws RemoteException {
		try {
			VLegalLoggerServiceUtil.addEntryResources(entryId,
				communityPermissions, guestPermissions);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static void addEntryResources(
		com.vportal.portlet.vlegal.model.VLegalLogger entry,
		java.lang.String[] communityPermissions,
		java.lang.String[] guestPermissions) throws RemoteException {
		try {
			VLegalLoggerServiceUtil.addEntryResources(entry,
				communityPermissions, guestPermissions);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	private static Log _log = LogFactoryUtil.getLog(VLegalLoggerServiceSoap.class);
}