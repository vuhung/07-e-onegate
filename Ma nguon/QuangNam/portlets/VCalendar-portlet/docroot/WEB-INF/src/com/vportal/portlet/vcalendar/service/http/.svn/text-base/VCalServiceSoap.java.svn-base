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

import com.vportal.portlet.vcalendar.service.VCalServiceUtil;

import java.rmi.RemoteException;

/**
 * <p>
 * This class provides a SOAP utility for the
 * {@link com.vportal.portlet.vcalendar.service.VCalServiceUtil} service utility. The
 * static methods of this class calls the same methods of the service utility.
 * However, the signatures are different because it is difficult for SOAP to
 * support certain types.
 * </p>
 *
 * <p>
 * ServiceBuilder follows certain rules in translating the methods. For example,
 * if the method in the service utility returns a {@link java.util.List}, that
 * is translated to an array of {@link com.vportal.portlet.vcalendar.model.VCalSoap}.
 * If the method in the service utility returns a
 * {@link com.vportal.portlet.vcalendar.model.VCal}, that is translated to a
 * {@link com.vportal.portlet.vcalendar.model.VCalSoap}. Methods that SOAP cannot
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
 * @see       VCalServiceHttp
 * @see       com.vportal.portlet.vcalendar.model.VCalSoap
 * @see       com.vportal.portlet.vcalendar.service.VCalServiceUtil
 * @generated
 */
public class VCalServiceSoap {
	public static com.vportal.portlet.vcalendar.model.VCalSoap addvCal(
		long groupId, long companyId, long userId, java.lang.String userName,
		java.util.Date createDate, java.util.Date modifiedDate,
		java.lang.String languageId, java.lang.String title,
		java.lang.String description, java.util.Date startDate,
		java.util.Date endDate, int status, long fileId,
		java.lang.String guest, java.lang.String location, java.lang.String time)
		throws RemoteException {
		try {
			com.vportal.portlet.vcalendar.model.VCal returnValue = VCalServiceUtil.addvCal(groupId,
					companyId, userId, userName, createDate, modifiedDate,
					languageId, title, description, startDate, endDate, status,
					fileId, guest, location, time);

			return com.vportal.portlet.vcalendar.model.VCalSoap.toSoapModel(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static com.vportal.portlet.vcalendar.model.VCalSoap updatevCal(
		long calId, long groupId, long companyId, long userId,
		java.lang.String userName, java.util.Date createDate,
		java.util.Date modifiedDate, java.lang.String languageId,
		java.lang.String title, java.lang.String description, int status,
		long fileId, java.lang.String guest, java.lang.String location,
		java.lang.String time) throws RemoteException {
		try {
			com.vportal.portlet.vcalendar.model.VCal returnValue = VCalServiceUtil.updatevCal(calId,
					groupId, companyId, userId, userName, createDate,
					modifiedDate, languageId, title, description, status,
					fileId, guest, location, time);

			return com.vportal.portlet.vcalendar.model.VCalSoap.toSoapModel(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static com.vportal.portlet.vcalendar.model.VCalSoap deletevCal(
		long calId) throws RemoteException {
		try {
			com.vportal.portlet.vcalendar.model.VCal returnValue = VCalServiceUtil.deletevCal(calId);

			return com.vportal.portlet.vcalendar.model.VCalSoap.toSoapModel(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static com.vportal.portlet.vcalendar.model.VCalSoap[] findByD_S_G(
		java.util.Date startDate, int status, long groupId)
		throws RemoteException {
		try {
			java.util.List returnValue = VCalServiceUtil.findByD_S_G(startDate,
					status, groupId);

			return com.vportal.portlet.vcalendar.model.VCalSoap.toSoapModels(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static com.vportal.portlet.vcalendar.model.VCalSoap[] findByD_S_G(
		java.util.Date startDate, int status, long groupId, int begin, int end)
		throws RemoteException {
		try {
			java.util.List returnValue = VCalServiceUtil.findByD_S_G(startDate,
					status, groupId, begin, end);

			return com.vportal.portlet.vcalendar.model.VCalSoap.toSoapModels(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static int countByD_S_G(java.util.Date startDate, int status,
		long groupId) throws RemoteException {
		try {
			int returnValue = VCalServiceUtil.countByD_S_G(startDate, status,
					groupId);

			return returnValue;
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static com.vportal.portlet.vcalendar.model.VCalSoap[] findByU_D_S(
		long userId, int status, java.util.Date startDate)
		throws RemoteException {
		try {
			java.util.List returnValue = VCalServiceUtil.findByU_D_S(userId,
					status, startDate);

			return com.vportal.portlet.vcalendar.model.VCalSoap.toSoapModels(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static com.vportal.portlet.vcalendar.model.VCalSoap[] findByU_D_S(
		long userId, java.util.Date startDate, int status, int begin, int end)
		throws RemoteException {
		try {
			java.util.List returnValue = VCalServiceUtil.findByU_D_S(userId,
					startDate, status, begin, end);

			return com.vportal.portlet.vcalendar.model.VCalSoap.toSoapModels(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static int countByU_D_S(long userId, java.util.Date startDate,
		int status) throws RemoteException {
		try {
			int returnValue = VCalServiceUtil.countByU_D_S(userId, startDate,
					status);

			return returnValue;
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static com.vportal.portlet.vcalendar.model.VCalSoap[] findByD_S(
		java.util.Date startDate, int status) throws RemoteException {
		try {
			java.util.List returnValue = VCalServiceUtil.findByD_S(startDate,
					status);

			return com.vportal.portlet.vcalendar.model.VCalSoap.toSoapModels(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static com.vportal.portlet.vcalendar.model.VCalSoap[] findByD_S(
		java.util.Date startDate, int status, int begin, int end)
		throws RemoteException {
		try {
			java.util.List returnValue = VCalServiceUtil.findByD_S(startDate,
					status, begin, end);

			return com.vportal.portlet.vcalendar.model.VCalSoap.toSoapModels(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static int countByD_S(java.util.Date startDate, int status)
		throws RemoteException {
		try {
			int returnValue = VCalServiceUtil.countByD_S(startDate, status);

			return returnValue;
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static com.vportal.portlet.vcalendar.model.VCalSoap findById(
		long calId) throws RemoteException {
		try {
			com.vportal.portlet.vcalendar.model.VCal returnValue = VCalServiceUtil.findById(calId);

			return com.vportal.portlet.vcalendar.model.VCalSoap.toSoapModel(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static com.vportal.portlet.vcalendar.model.VCalSoap[] findByUser(
		long calId, java.util.Date startDate, long groupId)
		throws RemoteException {
		try {
			java.util.List returnValue = VCalServiceUtil.findByUser(calId,
					startDate, groupId);

			return com.vportal.portlet.vcalendar.model.VCalSoap.toSoapModels(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static com.vportal.portlet.vcalendar.model.VCalSoap[] findByUserGroup(
		long groupId) throws RemoteException {
		try {
			java.util.List returnValue = VCalServiceUtil.findByUserGroup(groupId);

			return com.vportal.portlet.vcalendar.model.VCalSoap.toSoapModels(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static com.vportal.portlet.vcalendar.model.VCalSoap[] findByGroupOrg()
		throws RemoteException {
		try {
			java.util.List returnValue = VCalServiceUtil.findByGroupOrg();

			return com.vportal.portlet.vcalendar.model.VCalSoap.toSoapModels(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static com.vportal.portlet.vcalendar.model.VCalSoap[] findByF_D_G_T(
		long userId, java.util.Date startDate, long groupId, int status)
		throws RemoteException {
		try {
			java.util.List returnValue = VCalServiceUtil.findByF_D_G_T(userId,
					startDate, groupId, status);

			return com.vportal.portlet.vcalendar.model.VCalSoap.toSoapModels(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static com.vportal.portlet.vcalendar.model.VCalSoap[] findByF(
		long fileId) throws RemoteException {
		try {
			java.util.List returnValue = VCalServiceUtil.findByF(fileId);

			return com.vportal.portlet.vcalendar.model.VCalSoap.toSoapModels(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	private static Log _log = LogFactoryUtil.getLog(VCalServiceSoap.class);
}