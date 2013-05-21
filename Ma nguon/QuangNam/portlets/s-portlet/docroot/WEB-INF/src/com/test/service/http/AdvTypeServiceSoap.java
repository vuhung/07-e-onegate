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

package com.test.service.http;

import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;

import com.test.service.AdvTypeServiceUtil;

import java.rmi.RemoteException;

/**
 * <p>
 * This class provides a SOAP utility for the
 * {@link com.test.service.AdvTypeServiceUtil} service utility. The
 * static methods of this class calls the same methods of the service utility.
 * However, the signatures are different because it is difficult for SOAP to
 * support certain types.
 * </p>
 *
 * <p>
 * ServiceBuilder follows certain rules in translating the methods. For example,
 * if the method in the service utility returns a {@link java.util.List}, that
 * is translated to an array of {@link com.test.model.AdvTypeSoap}.
 * If the method in the service utility returns a
 * {@link com.test.model.AdvType}, that is translated to a
 * {@link com.test.model.AdvTypeSoap}. Methods that SOAP cannot
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
 * @author    Long
 * @see       AdvTypeServiceHttp
 * @see       com.test.model.AdvTypeSoap
 * @see       com.test.service.AdvTypeServiceUtil
 * @generated
 */
public class AdvTypeServiceSoap {
	public static com.test.model.AdvTypeSoap addType(long groupId,
		long companyId, long plid, java.lang.String name,
		java.lang.String description, java.lang.String[] communityPermissions,
		java.lang.String[] guestPermissions) throws RemoteException {
		try {
			com.test.model.AdvType returnValue = AdvTypeServiceUtil.addType(groupId,
					companyId, plid, name, description, communityPermissions,
					guestPermissions);

			return com.test.model.AdvTypeSoap.toSoapModel(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static com.test.model.AdvTypeSoap addType(long groupId,
		long companyId, long plid, java.lang.String name,
		java.lang.String description,
		java.lang.Boolean addCommunityPermissions,
		java.lang.Boolean addGuestPermissions,
		java.lang.String[] communityPermissions,
		java.lang.String[] guestPermissions) throws RemoteException {
		try {
			com.test.model.AdvType returnValue = AdvTypeServiceUtil.addType(groupId,
					companyId, plid, name, description,
					addCommunityPermissions, addGuestPermissions,
					communityPermissions, guestPermissions);

			return com.test.model.AdvTypeSoap.toSoapModel(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static com.test.model.AdvTypeSoap updateType(long typeId,
		long groupId, long companyId, long plid, java.lang.String name,
		java.lang.String description) throws RemoteException {
		try {
			com.test.model.AdvType returnValue = AdvTypeServiceUtil.updateType(typeId,
					groupId, companyId, plid, name, description);

			return com.test.model.AdvTypeSoap.toSoapModel(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static void deleteType(long typeId) throws RemoteException {
		try {
			AdvTypeServiceUtil.deleteType(typeId);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static void deleteType(com.test.model.AdvType type)
		throws RemoteException {
		try {
			AdvTypeServiceUtil.deleteType(type);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static com.test.model.AdvTypeSoap getType(long typeId)
		throws RemoteException {
		try {
			com.test.model.AdvType returnValue = AdvTypeServiceUtil.getType(typeId);

			return com.test.model.AdvTypeSoap.toSoapModel(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static int getItemCount(long typeId) throws RemoteException {
		try {
			int returnValue = AdvTypeServiceUtil.getItemCount(typeId);

			return returnValue;
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static com.test.model.AdvTypeSoap[] getTypeByG(long groupId)
		throws RemoteException {
		try {
			java.util.List returnValue = AdvTypeServiceUtil.getTypeByG(groupId);

			return com.test.model.AdvTypeSoap.toSoapModels(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static com.test.model.AdvTypeSoap[] getTypeByG(long groupId,
		int start, int end) throws RemoteException {
		try {
			java.util.List returnValue = AdvTypeServiceUtil.getTypeByG(groupId,
					start, end);

			return com.test.model.AdvTypeSoap.toSoapModels(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static int countTypeByG(long groupId) throws RemoteException {
		try {
			int returnValue = AdvTypeServiceUtil.countTypeByG(groupId);

			return returnValue;
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static void addAdvTypeResources(long typeId,
		boolean addCommunityPermissions, boolean addGuestPermissions)
		throws RemoteException {
		try {
			AdvTypeServiceUtil.addAdvTypeResources(typeId,
				addCommunityPermissions, addGuestPermissions);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static void addAdvTypeResources(com.test.model.AdvType type,
		boolean addCommunityPermissions, boolean addGuestPermissions)
		throws RemoteException {
		try {
			AdvTypeServiceUtil.addAdvTypeResources(type,
				addCommunityPermissions, addGuestPermissions);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static void addAdvTypeResources(long typeId,
		java.lang.String[] communityPermissions,
		java.lang.String[] guestPermissions) throws RemoteException {
		try {
			AdvTypeServiceUtil.addAdvTypeResources(typeId,
				communityPermissions, guestPermissions);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static void addAdvTypeResources(com.test.model.AdvType type,
		java.lang.String[] communityPermissions,
		java.lang.String[] guestPermissions) throws RemoteException {
		try {
			AdvTypeServiceUtil.addAdvTypeResources(type, communityPermissions,
				guestPermissions);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	private static Log _log = LogFactoryUtil.getLog(AdvTypeServiceSoap.class);
}