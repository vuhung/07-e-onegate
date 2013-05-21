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

import com.vsi.lienketwebsite.service.LinkGroupServiceUtil;

import java.rmi.RemoteException;

/**
 * <p>
 * This class provides a SOAP utility for the
 * {@link com.vsi.lienketwebsite.service.LinkGroupServiceUtil} service utility. The
 * static methods of this class calls the same methods of the service utility.
 * However, the signatures are different because it is difficult for SOAP to
 * support certain types.
 * </p>
 *
 * <p>
 * ServiceBuilder follows certain rules in translating the methods. For example,
 * if the method in the service utility returns a {@link java.util.List}, that
 * is translated to an array of {@link com.vsi.lienketwebsite.model.LinkGroupSoap}.
 * If the method in the service utility returns a
 * {@link com.vsi.lienketwebsite.model.LinkGroup}, that is translated to a
 * {@link com.vsi.lienketwebsite.model.LinkGroupSoap}. Methods that SOAP cannot
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
 * @see       LinkGroupServiceHttp
 * @see       com.vsi.lienketwebsite.model.LinkGroupSoap
 * @see       com.vsi.lienketwebsite.service.LinkGroupServiceUtil
 * @generated
 */
public class LinkGroupServiceSoap {
	public static com.vsi.lienketwebsite.model.LinkGroupSoap addLinkGroup(
		com.vsi.lienketwebsite.model.LinkGroup newLinkGroup)
		throws RemoteException {
		try {
			com.vsi.lienketwebsite.model.LinkGroup returnValue = LinkGroupServiceUtil.addLinkGroup(newLinkGroup);

			return com.vsi.lienketwebsite.model.LinkGroupSoap.toSoapModel(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static com.vsi.lienketwebsite.model.LinkGroupSoap[] getLinkGroups(
		long groupId) throws RemoteException {
		try {
			java.util.List<com.vsi.lienketwebsite.model.LinkGroup> returnValue = LinkGroupServiceUtil.getLinkGroups(groupId);

			return com.vsi.lienketwebsite.model.LinkGroupSoap.toSoapModels(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static com.vsi.lienketwebsite.model.LinkGroupSoap getLinkGroup(
		long linkGroupId) throws RemoteException {
		try {
			com.vsi.lienketwebsite.model.LinkGroup returnValue = LinkGroupServiceUtil.getLinkGroup(linkGroupId);

			return com.vsi.lienketwebsite.model.LinkGroupSoap.toSoapModel(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static com.vsi.lienketwebsite.model.LinkGroupSoap updateLinkGroup(
		long linkgroupId, long groupId, long companyId, java.lang.String name,
		java.lang.String description) throws RemoteException {
		try {
			com.vsi.lienketwebsite.model.LinkGroup returnValue = LinkGroupServiceUtil.updateLinkGroup(linkgroupId,
					groupId, companyId, name, description);

			return com.vsi.lienketwebsite.model.LinkGroupSoap.toSoapModel(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static com.vsi.lienketwebsite.model.LinkGroupSoap updateLinkGroup(
		com.vsi.lienketwebsite.model.LinkGroup linkGroup)
		throws RemoteException {
		try {
			com.vsi.lienketwebsite.model.LinkGroup returnValue = LinkGroupServiceUtil.updateLinkGroup(linkGroup);

			return com.vsi.lienketwebsite.model.LinkGroupSoap.toSoapModel(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static void deleteLinkGroup(long linkgroupId)
		throws RemoteException {
		try {
			LinkGroupServiceUtil.deleteLinkGroup(linkgroupId);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	private static Log _log = LogFactoryUtil.getLog(LinkGroupServiceSoap.class);
}