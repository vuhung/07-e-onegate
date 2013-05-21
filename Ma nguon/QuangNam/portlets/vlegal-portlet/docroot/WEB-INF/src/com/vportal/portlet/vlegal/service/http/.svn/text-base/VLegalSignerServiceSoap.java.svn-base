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

import com.vportal.portlet.vlegal.service.VLegalSignerServiceUtil;

import java.rmi.RemoteException;

/**
 * <p>
 * This class provides a SOAP utility for the
 * {@link com.vportal.portlet.vlegal.service.VLegalSignerServiceUtil} service utility. The
 * static methods of this class calls the same methods of the service utility.
 * However, the signatures are different because it is difficult for SOAP to
 * support certain types.
 * </p>
 *
 * <p>
 * ServiceBuilder follows certain rules in translating the methods. For example,
 * if the method in the service utility returns a {@link java.util.List}, that
 * is translated to an array of {@link com.vportal.portlet.vlegal.model.VLegalSignerSoap}.
 * If the method in the service utility returns a
 * {@link com.vportal.portlet.vlegal.model.VLegalSigner}, that is translated to a
 * {@link com.vportal.portlet.vlegal.model.VLegalSignerSoap}. Methods that SOAP cannot
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
 * @see       VLegalSignerServiceHttp
 * @see       com.vportal.portlet.vlegal.model.VLegalSignerSoap
 * @see       com.vportal.portlet.vlegal.service.VLegalSignerServiceUtil
 * @generated
 */
public class VLegalSignerServiceSoap {
	public static com.vportal.portlet.vlegal.model.VLegalSignerSoap updateSigner(
		long groupId, java.lang.String sigId, java.lang.String firstName,
		java.lang.String lastName, java.lang.String language,
		boolean statusSigner) throws RemoteException {
		try {
			com.vportal.portlet.vlegal.model.VLegalSigner returnValue = VLegalSignerServiceUtil.updateSigner(groupId,
					sigId, firstName, lastName, language, statusSigner);

			return com.vportal.portlet.vlegal.model.VLegalSignerSoap.toSoapModel(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static com.vportal.portlet.vlegal.model.VLegalSignerSoap updateSigner(
		com.vportal.portlet.vlegal.model.VLegalSigner vSigner)
		throws RemoteException {
		try {
			com.vportal.portlet.vlegal.model.VLegalSigner returnValue = VLegalSignerServiceUtil.updateSigner(vSigner);

			return com.vportal.portlet.vlegal.model.VLegalSignerSoap.toSoapModel(returnValue);
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
			VLegalSignerServiceUtil.addEntryResources(entryId,
				addCommunityPermissions, addGuestPermissions);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static void addEntryResources(
		com.vportal.portlet.vlegal.model.VLegalSigner entry,
		boolean addCommunityPermissions, boolean addGuestPermissions)
		throws RemoteException {
		try {
			VLegalSignerServiceUtil.addEntryResources(entry,
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
			VLegalSignerServiceUtil.addEntryResources(entryId,
				communityPermissions, guestPermissions);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static void addEntryResources(
		com.vportal.portlet.vlegal.model.VLegalSigner entry,
		java.lang.String[] communityPermissions,
		java.lang.String[] guestPermissions) throws RemoteException {
		try {
			VLegalSignerServiceUtil.addEntryResources(entry,
				communityPermissions, guestPermissions);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static com.vportal.portlet.vlegal.model.VLegalSignerSoap[] getSignerByGroupId(
		long groupId) throws RemoteException {
		try {
			java.util.List returnValue = VLegalSignerServiceUtil.getSignerByGroupId(groupId);

			return com.vportal.portlet.vlegal.model.VLegalSignerSoap.toSoapModels(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static com.vportal.portlet.vlegal.model.VLegalSignerSoap[] getSignerByGroupId(
		long groupId, int begin, int end) throws RemoteException {
		try {
			java.util.List returnValue = VLegalSignerServiceUtil.getSignerByGroupId(groupId,
					begin, end);

			return com.vportal.portlet.vlegal.model.VLegalSignerSoap.toSoapModels(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static int countSignerByGroupId(long groupId)
		throws RemoteException {
		try {
			int returnValue = VLegalSignerServiceUtil.countSignerByGroupId(groupId);

			return returnValue;
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static com.vportal.portlet.vlegal.model.VLegalSignerSoap[] getAllByG_L_S(
		long groupId, java.lang.String language, boolean statusSigner)
		throws RemoteException {
		try {
			java.util.List returnValue = VLegalSignerServiceUtil.getAllByG_L_S(groupId,
					language, statusSigner);

			return com.vportal.portlet.vlegal.model.VLegalSignerSoap.toSoapModels(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static com.vportal.portlet.vlegal.model.VLegalSignerSoap[] getAllSignerByG_L(
		long groupId, java.lang.String language) throws RemoteException {
		try {
			java.util.List returnValue = VLegalSignerServiceUtil.getAllSignerByG_L(groupId,
					language);

			return com.vportal.portlet.vlegal.model.VLegalSignerSoap.toSoapModels(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static com.vportal.portlet.vlegal.model.VLegalSignerSoap[] getAllSigner()
		throws RemoteException {
		try {
			java.util.List returnValue = VLegalSignerServiceUtil.getAllSigner();

			return com.vportal.portlet.vlegal.model.VLegalSignerSoap.toSoapModels(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static com.vportal.portlet.vlegal.model.VLegalSignerSoap getSigner(
		java.lang.String sigId) throws RemoteException {
		try {
			com.vportal.portlet.vlegal.model.VLegalSigner returnValue = VLegalSignerServiceUtil.getSigner(sigId);

			return com.vportal.portlet.vlegal.model.VLegalSignerSoap.toSoapModel(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static com.vportal.portlet.vlegal.model.VLegalSignerSoap getSigner(
		long groupId, java.lang.String sigId) throws RemoteException {
		try {
			com.vportal.portlet.vlegal.model.VLegalSigner returnValue = VLegalSignerServiceUtil.getSigner(groupId,
					sigId);

			return com.vportal.portlet.vlegal.model.VLegalSignerSoap.toSoapModel(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static void deleteSigner(java.lang.String sigId)
		throws RemoteException {
		try {
			VLegalSignerServiceUtil.deleteSigner(sigId);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static void _validator(java.lang.String firstName,
		java.lang.String lastName) throws RemoteException {
		try {
			VLegalSignerServiceUtil._validator(firstName, lastName);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	private static Log _log = LogFactoryUtil.getLog(VLegalSignerServiceSoap.class);
}