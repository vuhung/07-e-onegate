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

import com.vportal.portlet.vlegal.service.VLegalDURelServiceUtil;

import java.rmi.RemoteException;

/**
 * <p>
 * This class provides a SOAP utility for the
 * {@link com.vportal.portlet.vlegal.service.VLegalDURelServiceUtil} service utility. The
 * static methods of this class calls the same methods of the service utility.
 * However, the signatures are different because it is difficult for SOAP to
 * support certain types.
 * </p>
 *
 * <p>
 * ServiceBuilder follows certain rules in translating the methods. For example,
 * if the method in the service utility returns a {@link java.util.List}, that
 * is translated to an array of {@link com.vportal.portlet.vlegal.model.VLegalDURelSoap}.
 * If the method in the service utility returns a
 * {@link com.vportal.portlet.vlegal.model.VLegalDURel}, that is translated to a
 * {@link com.vportal.portlet.vlegal.model.VLegalDURelSoap}. Methods that SOAP cannot
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
 * @see       VLegalDURelServiceHttp
 * @see       com.vportal.portlet.vlegal.model.VLegalDURelSoap
 * @see       com.vportal.portlet.vlegal.service.VLegalDURelServiceUtil
 * @generated
 */
public class VLegalDURelServiceSoap {
	public static com.vportal.portlet.vlegal.model.VLegalDURelSoap addRelation(
		long departmentId, long userid) throws RemoteException {
		try {
			com.vportal.portlet.vlegal.model.VLegalDURel returnValue = VLegalDURelServiceUtil.addRelation(departmentId,
					userid);

			return com.vportal.portlet.vlegal.model.VLegalDURelSoap.toSoapModel(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static void deleteRelation(long departmentId, long userid)
		throws RemoteException {
		try {
			VLegalDURelServiceUtil.deleteRelation(departmentId, userid);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static void deleteRelByDepartment(long departmentId)
		throws RemoteException {
		try {
			VLegalDURelServiceUtil.deleteRelByDepartment(departmentId);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static void deleteRelByUser(long userid) throws RemoteException {
		try {
			VLegalDURelServiceUtil.deleteRelByUser(userid);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static com.vportal.portlet.vlegal.model.VLegalDURelSoap[] getRelByDepartment(
		long departmentId) throws RemoteException {
		try {
			java.util.List returnValue = VLegalDURelServiceUtil.getRelByDepartment(departmentId);

			return com.vportal.portlet.vlegal.model.VLegalDURelSoap.toSoapModels(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static com.vportal.portlet.vlegal.model.VLegalDURelSoap[] getRelByUser(
		long userid) throws RemoteException {
		try {
			java.util.List returnValue = VLegalDURelServiceUtil.getRelByUser(userid);

			return com.vportal.portlet.vlegal.model.VLegalDURelSoap.toSoapModels(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static com.vportal.portlet.vlegal.model.VLegalDURelSoap getByUserId(
		long userid) throws RemoteException {
		try {
			com.vportal.portlet.vlegal.model.VLegalDURel returnValue = VLegalDURelServiceUtil.getByUserId(userid);

			return com.vportal.portlet.vlegal.model.VLegalDURelSoap.toSoapModel(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	private static Log _log = LogFactoryUtil.getLog(VLegalDURelServiceSoap.class);
}