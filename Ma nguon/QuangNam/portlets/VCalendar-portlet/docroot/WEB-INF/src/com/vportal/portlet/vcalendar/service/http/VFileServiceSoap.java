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

package com.vportal.portlet.vcalendar.service.http;

import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;

import com.vportal.portlet.vcalendar.service.VFileServiceUtil;

import java.rmi.RemoteException;

/**
 * <p>
 * This class provides a SOAP utility for the
 * {@link com.vportal.portlet.vcalendar.service.VFileServiceUtil} service utility. The
 * static methods of this class calls the same methods of the service utility.
 * However, the signatures are different because it is difficult for SOAP to
 * support certain types.
 * </p>
 *
 * <p>
 * ServiceBuilder follows certain rules in translating the methods. For example,
 * if the method in the service utility returns a {@link java.util.List}, that
 * is translated to an array of {@link com.vportal.portlet.vcalendar.model.VFileSoap}.
 * If the method in the service utility returns a
 * {@link com.vportal.portlet.vcalendar.model.VFile}, that is translated to a
 * {@link com.vportal.portlet.vcalendar.model.VFileSoap}. Methods that SOAP cannot
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
 * @author    Admin
 * @see       VFileServiceHttp
 * @see       com.vportal.portlet.vcalendar.model.VFileSoap
 * @see       com.vportal.portlet.vcalendar.service.VFileServiceUtil
 * @generated
 */
public class VFileServiceSoap {
	public static com.vportal.portlet.vcalendar.model.VFileSoap addVFile(
		java.lang.String fullname, java.lang.String phone,
		java.lang.String address, java.lang.String position,
		java.util.Date birthday, int status) throws RemoteException {
		try {
			com.vportal.portlet.vcalendar.model.VFile returnValue = VFileServiceUtil.addVFile(fullname,
					phone, address, position, birthday, status);

			return com.vportal.portlet.vcalendar.model.VFileSoap.toSoapModel(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static com.vportal.portlet.vcalendar.model.VFileSoap updateVFile(
		long fileId, java.lang.String fullname, java.lang.String phone,
		java.lang.String address, java.lang.String position,
		java.util.Date birthday, int status) throws RemoteException {
		try {
			com.vportal.portlet.vcalendar.model.VFile returnValue = VFileServiceUtil.updateVFile(fileId,
					fullname, phone, address, position, birthday, status);

			return com.vportal.portlet.vcalendar.model.VFileSoap.toSoapModel(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static com.vportal.portlet.vcalendar.model.VFileSoap deleteVFile(
		long fileId) throws RemoteException {
		try {
			com.vportal.portlet.vcalendar.model.VFile returnValue = VFileServiceUtil.deleteVFile(fileId);

			return com.vportal.portlet.vcalendar.model.VFileSoap.toSoapModel(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static com.vportal.portlet.vcalendar.model.VFileSoap findById(
		long fileId) throws RemoteException {
		try {
			com.vportal.portlet.vcalendar.model.VFile returnValue = VFileServiceUtil.findById(fileId);

			return com.vportal.portlet.vcalendar.model.VFileSoap.toSoapModel(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static com.vportal.portlet.vcalendar.model.VFileSoap[] findByAll()
		throws RemoteException {
		try {
			java.util.List returnValue = VFileServiceUtil.findByAll();

			return com.vportal.portlet.vcalendar.model.VFileSoap.toSoapModels(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static com.vportal.portlet.vcalendar.model.VFileSoap[] findByAll(
		int begin, int end) throws RemoteException {
		try {
			java.util.List returnValue = VFileServiceUtil.findByAll(begin, end);

			return com.vportal.portlet.vcalendar.model.VFileSoap.toSoapModels(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static int countAll() throws RemoteException {
		try {
			int returnValue = VFileServiceUtil.countAll();

			return returnValue;
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static com.vportal.portlet.vcalendar.model.VFileSoap[] findByGroupId(
		int status) throws RemoteException {
		try {
			java.util.List returnValue = VFileServiceUtil.findByGroupId(status);

			return com.vportal.portlet.vcalendar.model.VFileSoap.toSoapModels(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static com.vportal.portlet.vcalendar.model.VFileSoap[] findByGroupId(
		int status, int begin, int end) throws RemoteException {
		try {
			java.util.List returnValue = VFileServiceUtil.findByGroupId(status,
					begin, end);

			return com.vportal.portlet.vcalendar.model.VFileSoap.toSoapModels(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static int countByGroupId(int status) throws RemoteException {
		try {
			int returnValue = VFileServiceUtil.countByGroupId(status);

			return returnValue;
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	private static Log _log = LogFactoryUtil.getLog(VFileServiceSoap.class);
}