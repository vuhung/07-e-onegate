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

import com.vportal.portlet.vlegal.service.VLegalOrgServiceUtil;

import java.rmi.RemoteException;

/**
 * <p>
 * This class provides a SOAP utility for the
 * {@link com.vportal.portlet.vlegal.service.VLegalOrgServiceUtil} service utility. The
 * static methods of this class calls the same methods of the service utility.
 * However, the signatures are different because it is difficult for SOAP to
 * support certain types.
 * </p>
 *
 * <p>
 * ServiceBuilder follows certain rules in translating the methods. For example,
 * if the method in the service utility returns a {@link java.util.List}, that
 * is translated to an array of {@link com.vportal.portlet.vlegal.model.VLegalOrgSoap}.
 * If the method in the service utility returns a
 * {@link com.vportal.portlet.vlegal.model.VLegalOrg}, that is translated to a
 * {@link com.vportal.portlet.vlegal.model.VLegalOrgSoap}. Methods that SOAP cannot
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
 * @see       VLegalOrgServiceHttp
 * @see       com.vportal.portlet.vlegal.model.VLegalOrgSoap
 * @see       com.vportal.portlet.vlegal.service.VLegalOrgServiceUtil
 * @generated
 */
public class VLegalOrgServiceSoap {
	public static com.vportal.portlet.vlegal.model.VLegalOrgSoap updateOrg(
		long groupId, java.lang.String orgId, java.lang.String name,
		java.lang.String description, java.lang.String language,
		boolean rssable, boolean status, int position)
		throws RemoteException {
		try {
			com.vportal.portlet.vlegal.model.VLegalOrg returnValue = VLegalOrgServiceUtil.updateOrg(groupId,
					orgId, name, description, language, rssable, status,
					position);

			return com.vportal.portlet.vlegal.model.VLegalOrgSoap.toSoapModel(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static com.vportal.portlet.vlegal.model.VLegalOrgSoap updateOrg(
		com.vportal.portlet.vlegal.model.VLegalOrg vOrg)
		throws RemoteException {
		try {
			com.vportal.portlet.vlegal.model.VLegalOrg returnValue = VLegalOrgServiceUtil.updateOrg(vOrg);

			return com.vportal.portlet.vlegal.model.VLegalOrgSoap.toSoapModel(returnValue);
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
			VLegalOrgServiceUtil.addEntryResources(entryId,
				addCommunityPermissions, addGuestPermissions);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static void addEntryResources(
		com.vportal.portlet.vlegal.model.VLegalOrg entry,
		boolean addCommunityPermissions, boolean addGuestPermissions)
		throws RemoteException {
		try {
			VLegalOrgServiceUtil.addEntryResources(entry,
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
			VLegalOrgServiceUtil.addEntryResources(entryId,
				communityPermissions, guestPermissions);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static void addEntryResources(
		com.vportal.portlet.vlegal.model.VLegalOrg entry,
		java.lang.String[] communityPermissions,
		java.lang.String[] guestPermissions) throws RemoteException {
		try {
			VLegalOrgServiceUtil.addEntryResources(entry, communityPermissions,
				guestPermissions);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static com.vportal.portlet.vlegal.model.VLegalOrgSoap[] getAllOrg()
		throws RemoteException {
		try {
			java.util.List returnValue = VLegalOrgServiceUtil.getAllOrg();

			return com.vportal.portlet.vlegal.model.VLegalOrgSoap.toSoapModels(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static com.vportal.portlet.vlegal.model.VLegalOrgSoap[] getAllOrgByS_L(
		long groupId, boolean status, java.lang.String language)
		throws RemoteException {
		try {
			java.util.List returnValue = VLegalOrgServiceUtil.getAllOrgByS_L(groupId,
					status, language);

			return com.vportal.portlet.vlegal.model.VLegalOrgSoap.toSoapModels(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static com.vportal.portlet.vlegal.model.VLegalOrgSoap[] getAllOrgByS_Rss(
		long groupId, boolean status, boolean rssable)
		throws RemoteException {
		try {
			java.util.List returnValue = VLegalOrgServiceUtil.getAllOrgByS_Rss(groupId,
					status, rssable);

			return com.vportal.portlet.vlegal.model.VLegalOrgSoap.toSoapModels(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static com.vportal.portlet.vlegal.model.VLegalOrgSoap[] getOrgByGroupId(
		long groupId) throws RemoteException {
		try {
			java.util.List returnValue = VLegalOrgServiceUtil.getOrgByGroupId(groupId);

			return com.vportal.portlet.vlegal.model.VLegalOrgSoap.toSoapModels(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static com.vportal.portlet.vlegal.model.VLegalOrgSoap[] getOrgByGroupId(
		long groupId, int begin, int end) throws RemoteException {
		try {
			java.util.List returnValue = VLegalOrgServiceUtil.getOrgByGroupId(groupId,
					begin, end);

			return com.vportal.portlet.vlegal.model.VLegalOrgSoap.toSoapModels(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static int countOrgByGroupId(long groupId) throws RemoteException {
		try {
			int returnValue = VLegalOrgServiceUtil.countOrgByGroupId(groupId);

			return returnValue;
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static com.vportal.portlet.vlegal.model.VLegalOrgSoap getOrg(
		java.lang.String orgId) throws RemoteException {
		try {
			com.vportal.portlet.vlegal.model.VLegalOrg returnValue = VLegalOrgServiceUtil.getOrg(orgId);

			return com.vportal.portlet.vlegal.model.VLegalOrgSoap.toSoapModel(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static com.vportal.portlet.vlegal.model.VLegalOrgSoap getOrg(
		long groupId, java.lang.String orgId) throws RemoteException {
		try {
			com.vportal.portlet.vlegal.model.VLegalOrg returnValue = VLegalOrgServiceUtil.getOrg(groupId,
					orgId);

			return com.vportal.portlet.vlegal.model.VLegalOrgSoap.toSoapModel(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static void deleteOrg(java.lang.String orgId)
		throws RemoteException {
		try {
			VLegalOrgServiceUtil.deleteOrg(orgId);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static void _validator(java.lang.String name)
		throws RemoteException {
		try {
			VLegalOrgServiceUtil._validator(name);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static int countOrgByG_L(long arg0, java.lang.String arg1)
		throws RemoteException {
		try {
			int returnValue = VLegalOrgServiceUtil.countOrgByG_L(arg0, arg1);

			return returnValue;
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static int countOrgByG_L_P_S(long arg0, java.lang.String arg1,
		java.lang.String arg2, boolean arg3) throws RemoteException {
		try {
			int returnValue = VLegalOrgServiceUtil.countOrgByG_L_P_S(arg0,
					arg1, arg2, arg3);

			return returnValue;
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static int countOrgByG_L_S(long arg0, java.lang.String arg1,
		java.lang.String arg2) throws RemoteException {
		try {
			int returnValue = VLegalOrgServiceUtil.countOrgByG_L_S(arg0, arg1,
					arg2);

			return returnValue;
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static com.vportal.portlet.vlegal.model.VLegalOrgSoap[] getOrgByG_L(
		long arg0, java.lang.String arg1) throws RemoteException {
		try {
			java.util.List returnValue = VLegalOrgServiceUtil.getOrgByG_L(arg0,
					arg1);

			return com.vportal.portlet.vlegal.model.VLegalOrgSoap.toSoapModels(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static com.vportal.portlet.vlegal.model.VLegalOrgSoap[] getOrgByG_L(
		long arg0, java.lang.String arg1, int arg2, int arg3)
		throws RemoteException {
		try {
			java.util.List returnValue = VLegalOrgServiceUtil.getOrgByG_L(arg0,
					arg1, arg2, arg3);

			return com.vportal.portlet.vlegal.model.VLegalOrgSoap.toSoapModels(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static com.vportal.portlet.vlegal.model.VLegalOrgSoap[] getOrgByG_L_P(
		long arg0, java.lang.String arg1, java.lang.String arg2)
		throws RemoteException {
		try {
			java.util.List returnValue = VLegalOrgServiceUtil.getOrgByG_L_P(arg0,
					arg1, arg2);

			return com.vportal.portlet.vlegal.model.VLegalOrgSoap.toSoapModels(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static com.vportal.portlet.vlegal.model.VLegalOrgSoap[] getOrgByG_L_P(
		long arg0, java.lang.String arg1, java.lang.String arg2, int arg3,
		int arg4) throws RemoteException {
		try {
			java.util.List returnValue = VLegalOrgServiceUtil.getOrgByG_L_P(arg0,
					arg1, arg2, arg3, arg4);

			return com.vportal.portlet.vlegal.model.VLegalOrgSoap.toSoapModels(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static com.vportal.portlet.vlegal.model.VLegalOrgSoap[] getOrgByG_L_P_S(
		long arg0, java.lang.String arg1, java.lang.String arg2, boolean arg3)
		throws RemoteException {
		try {
			java.util.List returnValue = VLegalOrgServiceUtil.getOrgByG_L_P_S(arg0,
					arg1, arg2, arg3);

			return com.vportal.portlet.vlegal.model.VLegalOrgSoap.toSoapModels(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static com.vportal.portlet.vlegal.model.VLegalOrgSoap[] getOrgByG_L_P_S(
		long arg0, java.lang.String arg1, java.lang.String arg2, boolean arg3,
		int arg4, int arg5) throws RemoteException {
		try {
			java.util.List returnValue = VLegalOrgServiceUtil.getOrgByG_L_P_S(arg0,
					arg1, arg2, arg3, arg4, arg5);

			return com.vportal.portlet.vlegal.model.VLegalOrgSoap.toSoapModels(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static com.vportal.portlet.vlegal.model.VLegalOrgSoap updateOrg(
		long arg0, java.lang.String arg1, java.lang.String arg2,
		java.lang.String arg3, java.lang.String arg4, boolean arg5,
		boolean arg6, java.lang.String arg7, int arg8)
		throws RemoteException {
		try {
			com.vportal.portlet.vlegal.model.VLegalOrg returnValue = VLegalOrgServiceUtil.updateOrg(arg0,
					arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);

			return com.vportal.portlet.vlegal.model.VLegalOrgSoap.toSoapModel(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	private static Log _log = LogFactoryUtil.getLog(VLegalOrgServiceSoap.class);
}