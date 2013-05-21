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

package com.vportal.portlet.vsearch.service.http;

import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;

import com.vportal.portlet.vsearch.service.VConfigSearchServiceUtil;

import java.rmi.RemoteException;

/**
 * <p>
 * This class provides a SOAP utility for the
 * {@link com.vportal.portlet.vsearch.service.VConfigSearchServiceUtil} service utility. The
 * static methods of this class calls the same methods of the service utility.
 * However, the signatures are different because it is difficult for SOAP to
 * support certain types.
 * </p>
 *
 * <p>
 * ServiceBuilder follows certain rules in translating the methods. For example,
 * if the method in the service utility returns a {@link java.util.List}, that
 * is translated to an array of {@link com.vportal.portlet.vsearch.model.VConfigSearchSoap}.
 * If the method in the service utility returns a
 * {@link com.vportal.portlet.vsearch.model.VConfigSearch}, that is translated to a
 * {@link com.vportal.portlet.vsearch.model.VConfigSearchSoap}. Methods that SOAP cannot
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
 * @author    Ba
 * @see       VConfigSearchServiceHttp
 * @see       com.vportal.portlet.vsearch.model.VConfigSearchSoap
 * @see       com.vportal.portlet.vsearch.service.VConfigSearchServiceUtil
 * @generated
 */
public class VConfigSearchServiceSoap {
	public static com.vportal.portlet.vsearch.model.VConfigSearchSoap findByPortletId(
		java.lang.String portletId, long groupId) throws RemoteException {
		try {
			com.vportal.portlet.vsearch.model.VConfigSearch returnValue = VConfigSearchServiceUtil.findByPortletId(portletId,
					groupId);

			return com.vportal.portlet.vsearch.model.VConfigSearchSoap.toSoapModel(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static com.vportal.portlet.vsearch.model.VConfigSearchSoap[] findByPortlet(
		java.lang.String portletId, long groupId) throws RemoteException {
		try {
			java.util.List returnValue = VConfigSearchServiceUtil.findByPortlet(portletId,
					groupId);

			return com.vportal.portlet.vsearch.model.VConfigSearchSoap.toSoapModels(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static com.vportal.portlet.vsearch.model.VConfigSearchSoap deleteConfigSeach(
		long confisearchId) throws RemoteException {
		try {
			com.vportal.portlet.vsearch.model.VConfigSearch returnValue = VConfigSearchServiceUtil.deleteConfigSeach(confisearchId);

			return com.vportal.portlet.vsearch.model.VConfigSearchSoap.toSoapModel(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static com.vportal.portlet.vsearch.model.VConfigSearchSoap[] findByAll()
		throws RemoteException {
		try {
			java.util.List returnValue = VConfigSearchServiceUtil.findByAll();

			return com.vportal.portlet.vsearch.model.VConfigSearchSoap.toSoapModels(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static com.vportal.portlet.vsearch.model.VConfigSearchSoap addConfigSearch(
		long groupId, long companyId, long userId, java.lang.String userName,
		java.util.Date createDate, java.util.Date modifiedDate,
		java.lang.String languageId, long layoutId, java.lang.String portletId,
		java.lang.String portleturl) throws RemoteException {
		try {
			com.vportal.portlet.vsearch.model.VConfigSearch returnValue = VConfigSearchServiceUtil.addConfigSearch(groupId,
					companyId, userId, userName, createDate, modifiedDate,
					languageId, layoutId, portletId, portleturl);

			return com.vportal.portlet.vsearch.model.VConfigSearchSoap.toSoapModel(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static com.vportal.portlet.vsearch.model.VConfigSearchSoap updateConfigSearch(
		long confisearchId, long groupId, long companyId, long userId,
		java.lang.String userName, java.util.Date createDate,
		java.util.Date modifiedDate, java.lang.String languageId,
		long layoutId, java.lang.String portletId, java.lang.String portleturl)
		throws RemoteException {
		try {
			com.vportal.portlet.vsearch.model.VConfigSearch returnValue = VConfigSearchServiceUtil.updateConfigSearch(confisearchId,
					groupId, companyId, userId, userName, createDate,
					modifiedDate, languageId, layoutId, portletId, portleturl);

			return com.vportal.portlet.vsearch.model.VConfigSearchSoap.toSoapModel(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	private static Log _log = LogFactoryUtil.getLog(VConfigSearchServiceSoap.class);
}