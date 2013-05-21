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

package com.vportal.portal.service.http;

import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;

import com.vportal.portal.service.AccessCounterServiceUtil;

import java.rmi.RemoteException;

/**
 * <p>
 * This class provides a SOAP utility for the
 * {@link com.vportal.portal.service.AccessCounterServiceUtil} service utility. The
 * static methods of this class calls the same methods of the service utility.
 * However, the signatures are different because it is difficult for SOAP to
 * support certain types.
 * </p>
 *
 * <p>
 * ServiceBuilder follows certain rules in translating the methods. For example,
 * if the method in the service utility returns a {@link java.util.List}, that
 * is translated to an array of {@link com.vportal.portal.model.AccessCounterSoap}.
 * If the method in the service utility returns a
 * {@link com.vportal.portal.model.AccessCounter}, that is translated to a
 * {@link com.vportal.portal.model.AccessCounterSoap}. Methods that SOAP cannot
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
 * @author    HOAN
 * @see       AccessCounterServiceHttp
 * @see       com.vportal.portal.model.AccessCounterSoap
 * @see       com.vportal.portal.service.AccessCounterServiceUtil
 * @generated
 */
public class AccessCounterServiceSoap {
	public static com.vportal.portal.model.AccessCounterSoap getCounter(
		long companyId, java.util.Date date) throws RemoteException {
		try {
			com.vportal.portal.model.AccessCounter returnValue = AccessCounterServiceUtil.getCounter(companyId,
					date);

			return com.vportal.portal.model.AccessCounterSoap.toSoapModel(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static com.vportal.portal.model.AccessCounterSoap addCounter(
		long companyId, int hitIncrease) throws RemoteException {
		try {
			com.vportal.portal.model.AccessCounter returnValue = AccessCounterServiceUtil.addCounter(companyId,
					hitIncrease);

			return com.vportal.portal.model.AccessCounterSoap.toSoapModel(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static com.vportal.portal.model.AccessCounterSoap updateCounter(
		long companyId, java.util.Date date, int hitIncrease)
		throws RemoteException {
		try {
			com.vportal.portal.model.AccessCounter returnValue = AccessCounterServiceUtil.updateCounter(companyId,
					date, hitIncrease);

			return com.vportal.portal.model.AccessCounterSoap.toSoapModel(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static int getTotalHits(long companyId) throws RemoteException {
		try {
			int returnValue = AccessCounterServiceUtil.getTotalHits(companyId);

			return returnValue;
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static int getHits(long companyId, java.util.Date date)
		throws RemoteException {
		try {
			int returnValue = AccessCounterServiceUtil.getHits(companyId, date);

			return returnValue;
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static com.vportal.portal.model.AccessCounterSoap[] getAccessCounter(
		long companyId) throws RemoteException {
		try {
			java.util.List returnValue = AccessCounterServiceUtil.getAccessCounter(companyId);

			return com.vportal.portal.model.AccessCounterSoap.toSoapModels(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static int getAccess(long companyId) throws RemoteException {
		try {
			int returnValue = AccessCounterServiceUtil.getAccess(companyId);

			return returnValue;
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	private static Log _log = LogFactoryUtil.getLog(AccessCounterServiceSoap.class);
}