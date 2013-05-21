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

import com.vportal.portlet.vlegal.service.VLegalTypeServiceUtil;

import java.rmi.RemoteException;

/**
 * <p>
 * This class provides a SOAP utility for the
 * {@link com.vportal.portlet.vlegal.service.VLegalTypeServiceUtil} service utility. The
 * static methods of this class calls the same methods of the service utility.
 * However, the signatures are different because it is difficult for SOAP to
 * support certain types.
 * </p>
 *
 * <p>
 * ServiceBuilder follows certain rules in translating the methods. For example,
 * if the method in the service utility returns a {@link java.util.List}, that
 * is translated to an array of {@link com.vportal.portlet.vlegal.model.VLegalTypeSoap}.
 * If the method in the service utility returns a
 * {@link com.vportal.portlet.vlegal.model.VLegalType}, that is translated to a
 * {@link com.vportal.portlet.vlegal.model.VLegalTypeSoap}. Methods that SOAP cannot
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
 * @see       VLegalTypeServiceHttp
 * @see       com.vportal.portlet.vlegal.model.VLegalTypeSoap
 * @see       com.vportal.portlet.vlegal.service.VLegalTypeServiceUtil
 * @generated
 */
public class VLegalTypeServiceSoap {
	public static com.vportal.portlet.vlegal.model.VLegalTypeSoap updateType(
		long groupId, java.lang.String typeId, java.lang.String language,
		java.lang.String name, java.lang.String description, int position,
		boolean status, boolean rssable) throws RemoteException {
		try {
			com.vportal.portlet.vlegal.model.VLegalType returnValue = VLegalTypeServiceUtil.updateType(groupId,
					typeId, language, name, description, position, status,
					rssable);

			return com.vportal.portlet.vlegal.model.VLegalTypeSoap.toSoapModel(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static com.vportal.portlet.vlegal.model.VLegalTypeSoap updateType(
		com.vportal.portlet.vlegal.model.VLegalType lType)
		throws RemoteException {
		try {
			com.vportal.portlet.vlegal.model.VLegalType returnValue = VLegalTypeServiceUtil.updateType(lType);

			return com.vportal.portlet.vlegal.model.VLegalTypeSoap.toSoapModel(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static void addEntryResources(long entryId,
		boolean addCommunityPermissions, boolean addGuestPermissions)
		throws RemoteException {
		try {
			VLegalTypeServiceUtil.addEntryResources(entryId,
				addCommunityPermissions, addGuestPermissions);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static void addEntryResources(
		com.vportal.portlet.vlegal.model.VLegalType entry,
		boolean addCommunityPermissions, boolean addGuestPermissions)
		throws RemoteException {
		try {
			VLegalTypeServiceUtil.addEntryResources(entry,
				addCommunityPermissions, addGuestPermissions);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static void addEntryResources(long entryId,
		java.lang.String[] communityPermissions,
		java.lang.String[] guestPermissions) throws RemoteException {
		try {
			VLegalTypeServiceUtil.addEntryResources(entryId,
				communityPermissions, guestPermissions);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static void addEntryResources(
		com.vportal.portlet.vlegal.model.VLegalType entry,
		java.lang.String[] communityPermissions,
		java.lang.String[] guestPermissions) throws RemoteException {
		try {
			VLegalTypeServiceUtil.addEntryResources(entry,
				communityPermissions, guestPermissions);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static void deleteType(java.lang.String typeId)
		throws RemoteException {
		try {
			VLegalTypeServiceUtil.deleteType(typeId);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static void deleteTypeAndDocs(java.lang.String typeId)
		throws RemoteException {
		try {
			VLegalTypeServiceUtil.deleteTypeAndDocs(typeId);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static com.vportal.portlet.vlegal.model.VLegalTypeSoap getType(
		java.lang.String typeId) throws RemoteException {
		try {
			com.vportal.portlet.vlegal.model.VLegalType returnValue = VLegalTypeServiceUtil.getType(typeId);

			return com.vportal.portlet.vlegal.model.VLegalTypeSoap.toSoapModel(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static com.vportal.portlet.vlegal.model.VLegalTypeSoap getType(
		long groupId, java.lang.String typeId) throws RemoteException {
		try {
			com.vportal.portlet.vlegal.model.VLegalType returnValue = VLegalTypeServiceUtil.getType(groupId,
					typeId);

			return com.vportal.portlet.vlegal.model.VLegalTypeSoap.toSoapModel(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static com.vportal.portlet.vlegal.model.VLegalTypeSoap[] getDocByType(
		java.lang.String typeId, java.lang.String language)
		throws RemoteException {
		try {
			java.util.List returnValue = VLegalTypeServiceUtil.getDocByType(typeId,
					language);

			return com.vportal.portlet.vlegal.model.VLegalTypeSoap.toSoapModels(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static com.vportal.portlet.vlegal.model.VLegalTypeSoap[] getAllTypes()
		throws RemoteException {
		try {
			java.util.List returnValue = VLegalTypeServiceUtil.getAllTypes();

			return com.vportal.portlet.vlegal.model.VLegalTypeSoap.toSoapModels(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static com.vportal.portlet.vlegal.model.VLegalTypeSoap[] getTypeByGroupId(
		long groupId) throws RemoteException {
		try {
			java.util.List returnValue = VLegalTypeServiceUtil.getTypeByGroupId(groupId);

			return com.vportal.portlet.vlegal.model.VLegalTypeSoap.toSoapModels(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static com.vportal.portlet.vlegal.model.VLegalTypeSoap[] getTypeByGroupId(
		long groupId, int begin, int end) throws RemoteException {
		try {
			java.util.List returnValue = VLegalTypeServiceUtil.getTypeByGroupId(groupId,
					begin, end);

			return com.vportal.portlet.vlegal.model.VLegalTypeSoap.toSoapModels(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static int countTypeByGroupId(long groupId)
		throws RemoteException {
		try {
			int returnValue = VLegalTypeServiceUtil.countTypeByGroupId(groupId);

			return returnValue;
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static com.vportal.portlet.vlegal.model.VLegalTypeSoap[] getTypesByL_S(
		long groupId, java.lang.String language, boolean status)
		throws RemoteException {
		try {
			java.util.List returnValue = VLegalTypeServiceUtil.getTypesByL_S(groupId,
					language, status);

			return com.vportal.portlet.vlegal.model.VLegalTypeSoap.toSoapModels(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static com.vportal.portlet.vlegal.model.VLegalTypeSoap[] getTypesByL_RSS(
		long groupId, boolean status, boolean rss) throws RemoteException {
		try {
			java.util.List returnValue = VLegalTypeServiceUtil.getTypesByL_RSS(groupId,
					status, rss);

			return com.vportal.portlet.vlegal.model.VLegalTypeSoap.toSoapModels(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static com.vportal.portlet.vlegal.model.VLegalTypeSoap[] getDocByType(
		java.lang.String arg0, java.lang.String arg1, int arg2)
		throws RemoteException {
		try {
			java.util.List returnValue = VLegalTypeServiceUtil.getDocByType(arg0,
					arg1, arg2);

			return com.vportal.portlet.vlegal.model.VLegalTypeSoap.toSoapModels(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static com.vportal.portlet.vlegal.model.VLegalTypeSoap updateTypeNew(
		long arg0, long arg1, java.lang.String arg2, java.lang.String arg3,
		java.lang.String arg4, java.lang.String arg5, int arg6, boolean arg7,
		boolean arg8) throws RemoteException {
		try {
			com.vportal.portlet.vlegal.model.VLegalType returnValue = VLegalTypeServiceUtil.updateTypeNew(arg0,
					arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);

			return com.vportal.portlet.vlegal.model.VLegalTypeSoap.toSoapModel(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	private static Log _log = LogFactoryUtil.getLog(VLegalTypeServiceSoap.class);
}