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

import com.vportal.portlet.vlegal.service.VLegalFieldServiceUtil;

import java.rmi.RemoteException;

/**
 * <p>
 * This class provides a SOAP utility for the
 * {@link com.vportal.portlet.vlegal.service.VLegalFieldServiceUtil} service utility. The
 * static methods of this class calls the same methods of the service utility.
 * However, the signatures are different because it is difficult for SOAP to
 * support certain types.
 * </p>
 *
 * <p>
 * ServiceBuilder follows certain rules in translating the methods. For example,
 * if the method in the service utility returns a {@link java.util.List}, that
 * is translated to an array of {@link com.vportal.portlet.vlegal.model.VLegalFieldSoap}.
 * If the method in the service utility returns a
 * {@link com.vportal.portlet.vlegal.model.VLegalField}, that is translated to a
 * {@link com.vportal.portlet.vlegal.model.VLegalFieldSoap}. Methods that SOAP cannot
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
 * @see       VLegalFieldServiceHttp
 * @see       com.vportal.portlet.vlegal.model.VLegalFieldSoap
 * @see       com.vportal.portlet.vlegal.service.VLegalFieldServiceUtil
 * @generated
 */
public class VLegalFieldServiceSoap {
	public static com.vportal.portlet.vlegal.model.VLegalFieldSoap updateField(
		long groupId, java.lang.String fieldId, java.lang.String name,
		java.lang.String description, java.lang.String language,
		boolean status, boolean rss) throws RemoteException {
		try {
			com.vportal.portlet.vlegal.model.VLegalField returnValue = VLegalFieldServiceUtil.updateField(groupId,
					fieldId, name, description, language, status, rss);

			return com.vportal.portlet.vlegal.model.VLegalFieldSoap.toSoapModel(returnValue);
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
			VLegalFieldServiceUtil.addEntryResources(entryId,
				addCommunityPermissions, addGuestPermissions);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static void addEntryResources(
		com.vportal.portlet.vlegal.model.VLegalField entry,
		boolean addCommunityPermissions, boolean addGuestPermissions)
		throws RemoteException {
		try {
			VLegalFieldServiceUtil.addEntryResources(entry,
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
			VLegalFieldServiceUtil.addEntryResources(entryId,
				communityPermissions, guestPermissions);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static void addEntryResources(
		com.vportal.portlet.vlegal.model.VLegalField entry,
		java.lang.String[] communityPermissions,
		java.lang.String[] guestPermissions) throws RemoteException {
		try {
			VLegalFieldServiceUtil.addEntryResources(entry,
				communityPermissions, guestPermissions);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static void deleteField(java.lang.String fieldId)
		throws RemoteException {
		try {
			VLegalFieldServiceUtil.deleteField(fieldId);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static com.vportal.portlet.vlegal.model.VLegalFieldSoap getVField(
		java.lang.String fieldId) throws RemoteException {
		try {
			com.vportal.portlet.vlegal.model.VLegalField returnValue = VLegalFieldServiceUtil.getVField(fieldId);

			return com.vportal.portlet.vlegal.model.VLegalFieldSoap.toSoapModel(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static com.vportal.portlet.vlegal.model.VLegalFieldSoap getVField(
		long groupId, java.lang.String fieldId) throws RemoteException {
		try {
			com.vportal.portlet.vlegal.model.VLegalField returnValue = VLegalFieldServiceUtil.getVField(groupId,
					fieldId);

			return com.vportal.portlet.vlegal.model.VLegalFieldSoap.toSoapModel(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static com.vportal.portlet.vlegal.model.VLegalFieldSoap[] getAllFields()
		throws RemoteException {
		try {
			java.util.List returnValue = VLegalFieldServiceUtil.getAllFields();

			return com.vportal.portlet.vlegal.model.VLegalFieldSoap.toSoapModels(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static com.vportal.portlet.vlegal.model.VLegalFieldSoap[] getFieldByGroupId(
		long groupId) throws RemoteException {
		try {
			java.util.List returnValue = VLegalFieldServiceUtil.getFieldByGroupId(groupId);

			return com.vportal.portlet.vlegal.model.VLegalFieldSoap.toSoapModels(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static com.vportal.portlet.vlegal.model.VLegalFieldSoap[] getFieldByGroupId(
		long groupId, int begin, int end) throws RemoteException {
		try {
			java.util.List returnValue = VLegalFieldServiceUtil.getFieldByGroupId(groupId,
					begin, end);

			return com.vportal.portlet.vlegal.model.VLegalFieldSoap.toSoapModels(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static int countFieldByGroupId(long groupId)
		throws RemoteException {
		try {
			int returnValue = VLegalFieldServiceUtil.countFieldByGroupId(groupId);

			return returnValue;
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static com.vportal.portlet.vlegal.model.VLegalFieldSoap[] getVFieldByS_L(
		long groupId, boolean status, java.lang.String language)
		throws RemoteException {
		try {
			java.util.List returnValue = VLegalFieldServiceUtil.getVFieldByS_L(groupId,
					status, language);

			return com.vportal.portlet.vlegal.model.VLegalFieldSoap.toSoapModels(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static com.vportal.portlet.vlegal.model.VLegalFieldSoap[] getVFieldByS_L(
		java.lang.String language, boolean status) throws RemoteException {
		try {
			java.util.List returnValue = VLegalFieldServiceUtil.getVFieldByS_L(language,
					status);

			return com.vportal.portlet.vlegal.model.VLegalFieldSoap.toSoapModels(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static com.vportal.portlet.vlegal.model.VLegalFieldSoap[] getVFieldByS_Rss(
		long groupId, boolean status, boolean rssable)
		throws RemoteException {
		try {
			java.util.List returnValue = VLegalFieldServiceUtil.getVFieldByS_Rss(groupId,
					status, rssable);

			return com.vportal.portlet.vlegal.model.VLegalFieldSoap.toSoapModels(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static com.vportal.portlet.vlegal.model.VLegalFieldSoap[] getFieldByOrg(
		long groupId, java.lang.String orgId, java.lang.String language,
		java.lang.String status, int begin, int end) throws RemoteException {
		try {
			java.util.List returnValue = VLegalFieldServiceUtil.getFieldByOrg(groupId,
					orgId, language, status, begin, end);

			return com.vportal.portlet.vlegal.model.VLegalFieldSoap.toSoapModels(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static com.vportal.portlet.vlegal.model.VLegalFieldSoap[] getFieldByType(
		long groupId, java.lang.String typeId, java.lang.String language,
		java.lang.String status, int begin, int end) throws RemoteException {
		try {
			java.util.List returnValue = VLegalFieldServiceUtil.getFieldByType(groupId,
					typeId, language, status, begin, end);

			return com.vportal.portlet.vlegal.model.VLegalFieldSoap.toSoapModels(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static com.vportal.portlet.vlegal.model.VLegalFieldSoap[] getAllFieldByPS(
		long groupId, java.lang.String language) throws RemoteException {
		try {
			java.util.List returnValue = VLegalFieldServiceUtil.getAllFieldByPS(groupId,
					language);

			return com.vportal.portlet.vlegal.model.VLegalFieldSoap.toSoapModels(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static com.vportal.portlet.vlegal.model.VLegalFieldSoap[] getFieldRelDoc_T_O(
		long groupId, java.lang.String language, java.lang.String typeId,
		java.lang.String orgId) throws RemoteException {
		try {
			java.util.List returnValue = VLegalFieldServiceUtil.getFieldRelDoc_T_O(groupId,
					language, typeId, orgId);

			return com.vportal.portlet.vlegal.model.VLegalFieldSoap.toSoapModels(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static void _validate(java.lang.String name)
		throws RemoteException {
		try {
			VLegalFieldServiceUtil._validate(name);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	private static Log _log = LogFactoryUtil.getLog(VLegalFieldServiceSoap.class);
}