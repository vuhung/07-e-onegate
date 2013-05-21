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

import com.vportal.portlet.vlegal.service.VLegalTagsServiceUtil;

import java.rmi.RemoteException;

/**
 * <p>
 * This class provides a SOAP utility for the
 * {@link com.vportal.portlet.vlegal.service.VLegalTagsServiceUtil} service utility. The
 * static methods of this class calls the same methods of the service utility.
 * However, the signatures are different because it is difficult for SOAP to
 * support certain types.
 * </p>
 *
 * <p>
 * ServiceBuilder follows certain rules in translating the methods. For example,
 * if the method in the service utility returns a {@link java.util.List}, that
 * is translated to an array of {@link com.vportal.portlet.vlegal.model.VLegalTagsSoap}.
 * If the method in the service utility returns a
 * {@link com.vportal.portlet.vlegal.model.VLegalTags}, that is translated to a
 * {@link com.vportal.portlet.vlegal.model.VLegalTagsSoap}. Methods that SOAP cannot
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
 * @see       VLegalTagsServiceHttp
 * @see       com.vportal.portlet.vlegal.model.VLegalTagsSoap
 * @see       com.vportal.portlet.vlegal.service.VLegalTagsServiceUtil
 * @generated
 */
public class VLegalTagsServiceSoap {
	public static void addEntryResources(
		com.vportal.portlet.vlegal.model.VLegalTags vTag,
		java.lang.String[] communityPermissions,
		java.lang.String[] guestPermissions) throws RemoteException {
		try {
			VLegalTagsServiceUtil.addEntryResources(vTag, communityPermissions,
				guestPermissions);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static void addEntryResources(
		com.vportal.portlet.vlegal.model.VLegalTags vTag,
		boolean addCommunityPermissions, boolean addGuestPermissions)
		throws RemoteException {
		try {
			VLegalTagsServiceUtil.addEntryResources(vTag,
				addCommunityPermissions, addGuestPermissions);
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
			VLegalTagsServiceUtil.addEntryResources(entryId,
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
			VLegalTagsServiceUtil.addEntryResources(entryId,
				communityPermissions, guestPermissions);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static com.vportal.portlet.vlegal.model.VLegalTagsSoap getTag(
		java.lang.String tagId) throws RemoteException {
		try {
			com.vportal.portlet.vlegal.model.VLegalTags returnValue = VLegalTagsServiceUtil.getTag(tagId);

			return com.vportal.portlet.vlegal.model.VLegalTagsSoap.toSoapModel(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static void deleteTag(java.lang.String tagId)
		throws RemoteException {
		try {
			VLegalTagsServiceUtil.deleteTag(tagId);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static void deleteTags(java.lang.String[] tagId)
		throws RemoteException {
		try {
			VLegalTagsServiceUtil.deleteTags(tagId);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static com.vportal.portlet.vlegal.model.VLegalTagsSoap[] getTag_Status(
		long groupId, boolean status) throws RemoteException {
		try {
			java.util.List returnValue = VLegalTagsServiceUtil.getTag_Status(groupId,
					status);

			return com.vportal.portlet.vlegal.model.VLegalTagsSoap.toSoapModels(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static com.vportal.portlet.vlegal.model.VLegalTagsSoap[] getTags(
		long groupId, java.lang.String name, java.lang.String status,
		boolean dup, int begin, int end) throws RemoteException {
		try {
			java.util.List returnValue = VLegalTagsServiceUtil.getTags(groupId,
					name, status, dup, begin, end);

			return com.vportal.portlet.vlegal.model.VLegalTagsSoap.toSoapModels(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static com.vportal.portlet.vlegal.model.VLegalTagsSoap[] getTagsByGroupId(
		long groupId) throws RemoteException {
		try {
			java.util.List returnValue = VLegalTagsServiceUtil.getTagsByGroupId(groupId);

			return com.vportal.portlet.vlegal.model.VLegalTagsSoap.toSoapModels(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static com.vportal.portlet.vlegal.model.VLegalTagsSoap[] getTag_Status(
		long groupId, boolean status,
		com.liferay.portal.kernel.util.OrderByComparator obc)
		throws RemoteException {
		try {
			java.util.List returnValue = VLegalTagsServiceUtil.getTag_Status(groupId,
					status, obc);

			return com.vportal.portlet.vlegal.model.VLegalTagsSoap.toSoapModels(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static void _validator(long groupId, java.lang.String name)
		throws RemoteException {
		try {
			VLegalTagsServiceUtil._validator(groupId, name);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	private static Log _log = LogFactoryUtil.getLog(VLegalTagsServiceSoap.class);
}