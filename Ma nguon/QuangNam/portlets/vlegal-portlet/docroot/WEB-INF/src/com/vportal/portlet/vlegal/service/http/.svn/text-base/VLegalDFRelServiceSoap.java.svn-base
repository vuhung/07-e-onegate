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

import com.vportal.portlet.vlegal.service.VLegalDFRelServiceUtil;

import java.rmi.RemoteException;

/**
 * <p>
 * This class provides a SOAP utility for the
 * {@link com.vportal.portlet.vlegal.service.VLegalDFRelServiceUtil} service utility. The
 * static methods of this class calls the same methods of the service utility.
 * However, the signatures are different because it is difficult for SOAP to
 * support certain types.
 * </p>
 *
 * <p>
 * ServiceBuilder follows certain rules in translating the methods. For example,
 * if the method in the service utility returns a {@link java.util.List}, that
 * is translated to an array of {@link com.vportal.portlet.vlegal.model.VLegalDFRelSoap}.
 * If the method in the service utility returns a
 * {@link com.vportal.portlet.vlegal.model.VLegalDFRel}, that is translated to a
 * {@link com.vportal.portlet.vlegal.model.VLegalDFRelSoap}. Methods that SOAP cannot
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
 * @see       VLegalDFRelServiceHttp
 * @see       com.vportal.portlet.vlegal.model.VLegalDFRelSoap
 * @see       com.vportal.portlet.vlegal.service.VLegalDFRelServiceUtil
 * @generated
 */
public class VLegalDFRelServiceSoap {
	public static com.vportal.portlet.vlegal.model.VLegalDFRelSoap addRelation(
		java.lang.String docId, java.lang.String fieldId)
		throws RemoteException {
		try {
			com.vportal.portlet.vlegal.model.VLegalDFRel returnValue = VLegalDFRelServiceUtil.addRelation(docId,
					fieldId);

			return com.vportal.portlet.vlegal.model.VLegalDFRelSoap.toSoapModel(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static void deleteRelation(java.lang.String docId,
		java.lang.String fieldId) throws RemoteException {
		try {
			VLegalDFRelServiceUtil.deleteRelation(docId, fieldId);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static void deleteRelByField(java.lang.String fieldId)
		throws RemoteException {
		try {
			VLegalDFRelServiceUtil.deleteRelByField(fieldId);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static void deleteRelByDoc(java.lang.String docId)
		throws RemoteException {
		try {
			VLegalDFRelServiceUtil.deleteRelByDoc(docId);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static com.vportal.portlet.vlegal.model.VLegalDFRelSoap[] getRelByDoc(
		java.lang.String docId) throws RemoteException {
		try {
			java.util.List returnValue = VLegalDFRelServiceUtil.getRelByDoc(docId);

			return com.vportal.portlet.vlegal.model.VLegalDFRelSoap.toSoapModels(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static com.vportal.portlet.vlegal.model.VLegalDFRelSoap[] getRelByField(
		java.lang.String fieldId) throws RemoteException {
		try {
			java.util.List returnValue = VLegalDFRelServiceUtil.getRelByField(fieldId);

			return com.vportal.portlet.vlegal.model.VLegalDFRelSoap.toSoapModels(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static com.vportal.portlet.vlegal.model.VLegalDFRelSoap addRealation(
		java.lang.String arg0, java.lang.String arg1) throws RemoteException {
		try {
			com.vportal.portlet.vlegal.model.VLegalDFRel returnValue = VLegalDFRelServiceUtil.addRealation(arg0,
					arg1);

			return com.vportal.portlet.vlegal.model.VLegalDFRelSoap.toSoapModel(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	private static Log _log = LogFactoryUtil.getLog(VLegalDFRelServiceSoap.class);
}