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

import com.vportal.portlet.vlegal.service.VLegalDDRelServiceUtil;

import java.rmi.RemoteException;

/**
 * <p>
 * This class provides a SOAP utility for the
 * {@link com.vportal.portlet.vlegal.service.VLegalDDRelServiceUtil} service utility. The
 * static methods of this class calls the same methods of the service utility.
 * However, the signatures are different because it is difficult for SOAP to
 * support certain types.
 * </p>
 *
 * <p>
 * ServiceBuilder follows certain rules in translating the methods. For example,
 * if the method in the service utility returns a {@link java.util.List}, that
 * is translated to an array of {@link com.vportal.portlet.vlegal.model.VLegalDDRelSoap}.
 * If the method in the service utility returns a
 * {@link com.vportal.portlet.vlegal.model.VLegalDDRel}, that is translated to a
 * {@link com.vportal.portlet.vlegal.model.VLegalDDRelSoap}. Methods that SOAP cannot
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
 * @see       VLegalDDRelServiceHttp
 * @see       com.vportal.portlet.vlegal.model.VLegalDDRelSoap
 * @see       com.vportal.portlet.vlegal.service.VLegalDDRelServiceUtil
 * @generated
 */
public class VLegalDDRelServiceSoap {
	public static com.vportal.portlet.vlegal.model.VLegalDDRelSoap addRelation(
		long departmentId, java.lang.String docId) throws RemoteException {
		try {
			com.vportal.portlet.vlegal.model.VLegalDDRel returnValue = VLegalDDRelServiceUtil.addRelation(departmentId,
					docId);

			return com.vportal.portlet.vlegal.model.VLegalDDRelSoap.toSoapModel(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static void deleteRelation(long departmentId, java.lang.String docId)
		throws RemoteException {
		try {
			VLegalDDRelServiceUtil.deleteRelation(departmentId, docId);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static void deleteRelByDepartment(long departmentId)
		throws RemoteException {
		try {
			VLegalDDRelServiceUtil.deleteRelByDepartment(departmentId);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static void deleteRelByDoc(java.lang.String docId)
		throws RemoteException {
		try {
			VLegalDDRelServiceUtil.deleteRelByDoc(docId);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static com.vportal.portlet.vlegal.model.VLegalDDRelSoap[] getRelByDoc(
		java.lang.String docId) throws RemoteException {
		try {
			java.util.List returnValue = VLegalDDRelServiceUtil.getRelByDoc(docId);

			return com.vportal.portlet.vlegal.model.VLegalDDRelSoap.toSoapModels(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static com.vportal.portlet.vlegal.model.VLegalDDRelSoap[] getRelByDepartment(
		long departmentId) throws RemoteException {
		try {
			java.util.List returnValue = VLegalDDRelServiceUtil.getRelByDepartment(departmentId);

			return com.vportal.portlet.vlegal.model.VLegalDDRelSoap.toSoapModels(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	private static Log _log = LogFactoryUtil.getLog(VLegalDDRelServiceSoap.class);
}