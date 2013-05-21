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

import com.vportal.portlet.vlegal.service.VLegalDSRelServiceUtil;

import java.rmi.RemoteException;

/**
 * <p>
 * This class provides a SOAP utility for the
 * {@link com.vportal.portlet.vlegal.service.VLegalDSRelServiceUtil} service utility. The
 * static methods of this class calls the same methods of the service utility.
 * However, the signatures are different because it is difficult for SOAP to
 * support certain types.
 * </p>
 *
 * <p>
 * ServiceBuilder follows certain rules in translating the methods. For example,
 * if the method in the service utility returns a {@link java.util.List}, that
 * is translated to an array of {@link com.vportal.portlet.vlegal.model.VLegalDSRelSoap}.
 * If the method in the service utility returns a
 * {@link com.vportal.portlet.vlegal.model.VLegalDSRel}, that is translated to a
 * {@link com.vportal.portlet.vlegal.model.VLegalDSRelSoap}. Methods that SOAP cannot
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
 * @see       VLegalDSRelServiceHttp
 * @see       com.vportal.portlet.vlegal.model.VLegalDSRelSoap
 * @see       com.vportal.portlet.vlegal.service.VLegalDSRelServiceUtil
 * @generated
 */
public class VLegalDSRelServiceSoap {
	public static com.vportal.portlet.vlegal.model.VLegalDSRelSoap addRelation(
		java.lang.String docId, java.lang.String sigId)
		throws RemoteException {
		try {
			com.vportal.portlet.vlegal.model.VLegalDSRel returnValue = VLegalDSRelServiceUtil.addRelation(docId,
					sigId);

			return com.vportal.portlet.vlegal.model.VLegalDSRelSoap.toSoapModel(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static void deleteRelation(java.lang.String docId,
		java.lang.String sigId) throws RemoteException {
		try {
			VLegalDSRelServiceUtil.deleteRelation(docId, sigId);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static void deleteRelBySigner(java.lang.String sigId)
		throws RemoteException {
		try {
			VLegalDSRelServiceUtil.deleteRelBySigner(sigId);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static void deleteRelByDoc(java.lang.String docId)
		throws RemoteException {
		try {
			VLegalDSRelServiceUtil.deleteRelByDoc(docId);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static com.vportal.portlet.vlegal.model.VLegalDSRelSoap[] getRelByDoc(
		java.lang.String docId) throws RemoteException {
		try {
			java.util.List returnValue = VLegalDSRelServiceUtil.getRelByDoc(docId);

			return com.vportal.portlet.vlegal.model.VLegalDSRelSoap.toSoapModels(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static com.vportal.portlet.vlegal.model.VLegalDSRelSoap[] getRelByField(
		java.lang.String fieldId) throws RemoteException {
		try {
			java.util.List returnValue = VLegalDSRelServiceUtil.getRelByField(fieldId);

			return com.vportal.portlet.vlegal.model.VLegalDSRelSoap.toSoapModels(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	private static Log _log = LogFactoryUtil.getLog(VLegalDSRelServiceSoap.class);
}