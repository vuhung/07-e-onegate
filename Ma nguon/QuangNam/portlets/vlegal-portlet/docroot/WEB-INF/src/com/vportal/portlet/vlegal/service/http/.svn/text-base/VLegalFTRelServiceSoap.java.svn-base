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

import com.vportal.portlet.vlegal.service.VLegalFTRelServiceUtil;

import java.rmi.RemoteException;

/**
 * <p>
 * This class provides a SOAP utility for the
 * {@link com.vportal.portlet.vlegal.service.VLegalFTRelServiceUtil} service utility. The
 * static methods of this class calls the same methods of the service utility.
 * However, the signatures are different because it is difficult for SOAP to
 * support certain types.
 * </p>
 *
 * <p>
 * ServiceBuilder follows certain rules in translating the methods. For example,
 * if the method in the service utility returns a {@link java.util.List}, that
 * is translated to an array of {@link com.vportal.portlet.vlegal.model.VLegalFTRelSoap}.
 * If the method in the service utility returns a
 * {@link com.vportal.portlet.vlegal.model.VLegalFTRel}, that is translated to a
 * {@link com.vportal.portlet.vlegal.model.VLegalFTRelSoap}. Methods that SOAP cannot
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
 * @see       VLegalFTRelServiceHttp
 * @see       com.vportal.portlet.vlegal.model.VLegalFTRelSoap
 * @see       com.vportal.portlet.vlegal.service.VLegalFTRelServiceUtil
 * @generated
 */
public class VLegalFTRelServiceSoap {
	public static com.vportal.portlet.vlegal.model.VLegalFTRelSoap addRelation(
		java.lang.String fieldId, java.lang.String typeId)
		throws RemoteException {
		try {
			com.vportal.portlet.vlegal.model.VLegalFTRel returnValue = VLegalFTRelServiceUtil.addRelation(fieldId,
					typeId);

			return com.vportal.portlet.vlegal.model.VLegalFTRelSoap.toSoapModel(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static void deleteRelation(java.lang.String fieldId,
		java.lang.String typeId) throws RemoteException {
		try {
			VLegalFTRelServiceUtil.deleteRelation(fieldId, typeId);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static void deleteRelByField(java.lang.String fieldId)
		throws RemoteException {
		try {
			VLegalFTRelServiceUtil.deleteRelByField(fieldId);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static void deleteRelByType(java.lang.String typeId)
		throws RemoteException {
		try {
			VLegalFTRelServiceUtil.deleteRelByType(typeId);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static com.vportal.portlet.vlegal.model.VLegalFTRelSoap[] getRelByType(
		java.lang.String typeId) throws RemoteException {
		try {
			java.util.List returnValue = VLegalFTRelServiceUtil.getRelByType(typeId);

			return com.vportal.portlet.vlegal.model.VLegalFTRelSoap.toSoapModels(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static com.vportal.portlet.vlegal.model.VLegalFTRelSoap[] getRelByField(
		java.lang.String fieldId) throws RemoteException {
		try {
			java.util.List returnValue = VLegalFTRelServiceUtil.getRelByField(fieldId);

			return com.vportal.portlet.vlegal.model.VLegalFTRelSoap.toSoapModels(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	private static Log _log = LogFactoryUtil.getLog(VLegalFTRelServiceSoap.class);
}