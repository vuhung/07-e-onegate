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

package com.vsi.lienketwebsite.service.http;

import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;

import com.vsi.lienketwebsite.service.LinksServiceUtil;

import java.rmi.RemoteException;

/**
 * <p>
 * This class provides a SOAP utility for the
 * {@link com.vsi.lienketwebsite.service.LinksServiceUtil} service utility. The
 * static methods of this class calls the same methods of the service utility.
 * However, the signatures are different because it is difficult for SOAP to
 * support certain types.
 * </p>
 *
 * <p>
 * ServiceBuilder follows certain rules in translating the methods. For example,
 * if the method in the service utility returns a {@link java.util.List}, that
 * is translated to an array of {@link com.vsi.lienketwebsite.model.LinksSoap}.
 * If the method in the service utility returns a
 * {@link com.vsi.lienketwebsite.model.Links}, that is translated to a
 * {@link com.vsi.lienketwebsite.model.LinksSoap}. Methods that SOAP cannot
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
 * @author    Administrator
 * @see       LinksServiceHttp
 * @see       com.vsi.lienketwebsite.model.LinksSoap
 * @see       com.vsi.lienketwebsite.service.LinksServiceUtil
 * @generated
 */
public class LinksServiceSoap {
	public static com.vsi.lienketwebsite.model.LinksSoap addLink(
		com.vsi.lienketwebsite.model.Links newLink) throws RemoteException {
		try {
			com.vsi.lienketwebsite.model.Links returnValue = LinksServiceUtil.addLink(newLink);

			return com.vsi.lienketwebsite.model.LinksSoap.toSoapModel(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static com.vsi.lienketwebsite.model.LinksSoap[] getLinks(
		long groupId) throws RemoteException {
		try {
			java.util.List<com.vsi.lienketwebsite.model.Links> returnValue = LinksServiceUtil.getLinks(groupId);

			return com.vsi.lienketwebsite.model.LinksSoap.toSoapModels(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static com.vsi.lienketwebsite.model.LinksSoap getLink(long linkId)
		throws RemoteException {
		try {
			com.vsi.lienketwebsite.model.Links returnValue = LinksServiceUtil.getLink(linkId);

			return com.vsi.lienketwebsite.model.LinksSoap.toSoapModel(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static com.vsi.lienketwebsite.model.LinksSoap updateLinks(
		long linkId, long groupId, long companyId, long linkgroupId,
		java.lang.String name, java.lang.String description,
		java.lang.String url, int position) throws RemoteException {
		try {
			com.vsi.lienketwebsite.model.Links returnValue = LinksServiceUtil.updateLinks(linkId,
					groupId, companyId, linkgroupId, name, description, url,
					position);

			return com.vsi.lienketwebsite.model.LinksSoap.toSoapModel(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static com.vsi.lienketwebsite.model.LinksSoap updateLinks(
		com.vsi.lienketwebsite.model.Links links) throws RemoteException {
		try {
			com.vsi.lienketwebsite.model.Links returnValue = LinksServiceUtil.updateLinks(links);

			return com.vsi.lienketwebsite.model.LinksSoap.toSoapModel(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static void deleteLinks(long linkId) throws RemoteException {
		try {
			LinksServiceUtil.deleteLinks(linkId);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static com.vsi.lienketwebsite.model.LinksSoap[] getLinkBylinkgroupId(
		long linkgroupId) throws RemoteException {
		try {
			java.util.List<com.vsi.lienketwebsite.model.Links> returnValue = LinksServiceUtil.getLinkBylinkgroupId(linkgroupId);

			return com.vsi.lienketwebsite.model.LinksSoap.toSoapModels(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	private static Log _log = LogFactoryUtil.getLog(LinksServiceSoap.class);
}