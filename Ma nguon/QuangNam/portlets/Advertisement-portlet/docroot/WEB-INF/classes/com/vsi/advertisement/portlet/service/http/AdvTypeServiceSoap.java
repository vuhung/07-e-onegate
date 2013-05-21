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

package com.vsi.advertisement.portlet.service.http;

import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;

import com.vsi.advertisement.portlet.service.AdvTypeServiceUtil;

import java.rmi.RemoteException;

/**
 * <p>
 * This class provides a SOAP utility for the
 * {@link com.vsi.advertisement.portlet.service.AdvTypeServiceUtil} service utility. The
 * static methods of this class calls the same methods of the service utility.
 * However, the signatures are different because it is difficult for SOAP to
 * support certain types.
 * </p>
 *
 * <p>
 * ServiceBuilder follows certain rules in translating the methods. For example,
 * if the method in the service utility returns a {@link java.util.List}, that
 * is translated to an array of {@link com.vsi.advertisement.portlet.model.AdvTypeSoap}.
 * If the method in the service utility returns a
 * {@link com.vsi.advertisement.portlet.model.AdvType}, that is translated to a
 * {@link com.vsi.advertisement.portlet.model.AdvTypeSoap}. Methods that SOAP cannot
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
 * @author    vinhnt
 * @see       AdvTypeServiceHttp
 * @see       com.vsi.advertisement.portlet.model.AdvTypeSoap
 * @see       com.vsi.advertisement.portlet.service.AdvTypeServiceUtil
 * @generated
 */
public class AdvTypeServiceSoap {
	public static com.vsi.advertisement.portlet.model.AdvTypeSoap[] getAllType()
		throws RemoteException {
		try {
			java.util.List<com.vsi.advertisement.portlet.model.AdvType> returnValue =
				AdvTypeServiceUtil.getAllType();

			return com.vsi.advertisement.portlet.model.AdvTypeSoap.toSoapModels(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static com.vsi.advertisement.portlet.model.AdvTypeSoap getType(
		long typeId) throws RemoteException {
		try {
			com.vsi.advertisement.portlet.model.AdvType returnValue = AdvTypeServiceUtil.getType(typeId);

			return com.vsi.advertisement.portlet.model.AdvTypeSoap.toSoapModel(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static com.vsi.advertisement.portlet.model.AdvTypeSoap addType(
		long groupId, long companyId, long userId, java.lang.String name,
		java.lang.String description) throws RemoteException {
		try {
			com.vsi.advertisement.portlet.model.AdvType returnValue = AdvTypeServiceUtil.addType(groupId,
					companyId, userId, name, description);

			return com.vsi.advertisement.portlet.model.AdvTypeSoap.toSoapModel(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static void deleteType(long type) throws RemoteException {
		try {
			AdvTypeServiceUtil.deleteType(type);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static void deleteType(
		com.vsi.advertisement.portlet.model.AdvType advType)
		throws RemoteException {
		try {
			AdvTypeServiceUtil.deleteType(advType);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static void updateType(
		com.vsi.advertisement.portlet.model.AdvType type)
		throws RemoteException {
		try {
			AdvTypeServiceUtil.updateType(type);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	private static Log _log = LogFactoryUtil.getLog(AdvTypeServiceSoap.class);
}