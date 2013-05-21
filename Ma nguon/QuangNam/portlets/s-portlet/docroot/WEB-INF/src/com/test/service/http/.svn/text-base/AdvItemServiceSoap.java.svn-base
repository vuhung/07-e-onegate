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

import com.test.service.AdvItemServiceUtil;

import java.rmi.RemoteException;

/**
 * <p>
 * This class provides a SOAP utility for the
 * {@link com.test.service.AdvItemServiceUtil} service utility. The
 * static methods of this class calls the same methods of the service utility.
 * However, the signatures are different because it is difficult for SOAP to
 * support certain types.
 * </p>
 *
 * <p>
 * ServiceBuilder follows certain rules in translating the methods. For example,
 * if the method in the service utility returns a {@link java.util.List}, that
 * is translated to an array of {@link com.test.model.AdvItemSoap}.
 * If the method in the service utility returns a
 * {@link com.test.model.AdvItem}, that is translated to a
 * {@link com.test.model.AdvItemSoap}. Methods that SOAP cannot
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
 * @see       AdvItemServiceHttp
 * @see       com.test.model.AdvItemSoap
 * @see       com.test.service.AdvItemServiceUtil
 * @generated
 */
public class AdvItemServiceSoap {
	public static com.test.model.AdvItemSoap addItem(long groupId,
		long companyId, long plid, java.lang.String name,
		java.lang.String description, java.lang.String url,
		boolean isTargetBlank, java.lang.String txtMouseOver, boolean status,
		long typeId, long folderId, java.util.Date expriedDate,
		java.lang.String[] communityPermissions,
		java.lang.String[] guestPermissions) throws RemoteException {
		try {
			com.test.model.AdvItem returnValue = AdvItemServiceUtil.addItem(groupId,
					companyId, plid, name, description, url, isTargetBlank,
					txtMouseOver, status, typeId, folderId, expriedDate,
					communityPermissions, guestPermissions);

			return com.test.model.AdvItemSoap.toSoapModel(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static com.test.model.AdvItemSoap addItem(long groupId,
		long companyId, long plid, java.lang.String name,
		java.lang.String description, java.lang.String url,
		boolean isTargetBlank, java.lang.String txtMouseOver, boolean status,
		long typeId, long folderId, java.util.Date expriedDate,
		java.lang.Boolean addCommunityPermissions,
		java.lang.Boolean addGuestPermissions,
		java.lang.String[] communityPermissions,
		java.lang.String[] guestPermissions) throws RemoteException {
		try {
			com.test.model.AdvItem returnValue = AdvItemServiceUtil.addItem(groupId,
					companyId, plid, name, description, url, isTargetBlank,
					txtMouseOver, status, typeId, folderId, expriedDate,
					addCommunityPermissions, addGuestPermissions,
					communityPermissions, guestPermissions);

			return com.test.model.AdvItemSoap.toSoapModel(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static com.test.model.AdvItemSoap updateItem(long itemId,
		long groupId, long companyId, java.lang.String name,
		java.lang.String description, java.lang.String url,
		boolean isTargetBlank, java.lang.String txtMouseOver, boolean status,
		long typeId, long folderId, java.util.Date expriedDate)
		throws RemoteException {
		try {
			com.test.model.AdvItem returnValue = AdvItemServiceUtil.updateItem(itemId,
					groupId, companyId, name, description, url, isTargetBlank,
					txtMouseOver, status, typeId, folderId, expriedDate);

			return com.test.model.AdvItemSoap.toSoapModel(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static com.test.model.AdvItemSoap updateItem(
		com.test.model.AdvItem advItem) throws RemoteException {
		try {
			com.test.model.AdvItem returnValue = AdvItemServiceUtil.updateItem(advItem);

			return com.test.model.AdvItemSoap.toSoapModel(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static void deleteItem(long itemId) throws RemoteException {
		try {
			AdvItemServiceUtil.deleteItem(itemId);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static void deleteItembyType(long typeId) throws RemoteException {
		try {
			AdvItemServiceUtil.deleteItembyType(typeId);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static com.test.model.AdvItemSoap getItem(long itemId)
		throws RemoteException {
		try {
			com.test.model.AdvItem returnValue = AdvItemServiceUtil.getItem(itemId);

			return com.test.model.AdvItemSoap.toSoapModel(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static com.test.model.AdvItemSoap[] getAllbyType(long typeId)
		throws RemoteException {
		try {
			java.util.List returnValue = AdvItemServiceUtil.getAllbyType(typeId);

			return com.test.model.AdvItemSoap.toSoapModels(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static com.test.model.AdvItemSoap[] getItemByG(long groupId)
		throws RemoteException {
		try {
			java.util.List returnValue = AdvItemServiceUtil.getItemByG(groupId);

			return com.test.model.AdvItemSoap.toSoapModels(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static com.test.model.AdvItemSoap[] getItemByG(long groupId,
		int start, int end) throws RemoteException {
		try {
			java.util.List returnValue = AdvItemServiceUtil.getItemByG(groupId,
					start, end);

			return com.test.model.AdvItemSoap.toSoapModels(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static int countItemByG(long groupId) throws RemoteException {
		try {
			int returnValue = AdvItemServiceUtil.countItemByG(groupId);

			return returnValue;
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static com.test.model.AdvItemSoap[] getItemByG_S(long groupId,
		boolean status) throws RemoteException {
		try {
			java.util.List returnValue = AdvItemServiceUtil.getItemByG_S(groupId,
					status);

			return com.test.model.AdvItemSoap.toSoapModels(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static com.test.model.AdvItemSoap[] getItemByG_S(long groupId,
		boolean status, int start, int end) throws RemoteException {
		try {
			java.util.List returnValue = AdvItemServiceUtil.getItemByG_S(groupId,
					status, start, end);

			return com.test.model.AdvItemSoap.toSoapModels(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static int countItemByG_S(long groupId, boolean status)
		throws RemoteException {
		try {
			int returnValue = AdvItemServiceUtil.countItemByG_S(groupId, status);

			return returnValue;
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static com.test.model.AdvItemSoap[] getItemByG_T_S(long groupId,
		long typeId, boolean status) throws RemoteException {
		try {
			java.util.List returnValue = AdvItemServiceUtil.getItemByG_T_S(groupId,
					typeId, status);

			return com.test.model.AdvItemSoap.toSoapModels(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static com.test.model.AdvItemSoap[] getItemByG_T_S(long groupId,
		long typeId, boolean status, int begin, int end)
		throws RemoteException {
		try {
			java.util.List returnValue = AdvItemServiceUtil.getItemByG_T_S(groupId,
					typeId, status, begin, end);

			return com.test.model.AdvItemSoap.toSoapModels(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static int countItemByG_T_S(long groupId, long typeId, boolean status)
		throws RemoteException {
		try {
			int returnValue = AdvItemServiceUtil.countItemByG_T_S(groupId,
					typeId, status);

			return returnValue;
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static int countItemByG_T(long groupId, long typeId)
		throws RemoteException {
		try {
			int returnValue = AdvItemServiceUtil.countItemByG_T(groupId, typeId);

			return returnValue;
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static void addAdvItemResources(long itemId,
		boolean addCommunityPermissions, boolean addGuestPermissions)
		throws RemoteException {
		try {
			AdvItemServiceUtil.addAdvItemResources(itemId,
				addCommunityPermissions, addGuestPermissions);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static void addAdvItemResources(com.test.model.AdvItem item,
		boolean addCommunityPermissions, boolean addGuestPermissions)
		throws RemoteException {
		try {
			AdvItemServiceUtil.addAdvItemResources(item,
				addCommunityPermissions, addGuestPermissions);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static void addAdvItemResources(long itemId,
		java.lang.String[] communityPermissions,
		java.lang.String[] guestPermissions) throws RemoteException {
		try {
			AdvItemServiceUtil.addAdvItemResources(itemId,
				communityPermissions, guestPermissions);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static void addAdvItemResources(com.test.model.AdvItem item,
		java.lang.String[] communityPermissions,
		java.lang.String[] guestPermissions) throws RemoteException {
		try {
			AdvItemServiceUtil.addAdvItemResources(item, communityPermissions,
				guestPermissions);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static com.test.model.AdvItemSoap[] getItemByParam(long groupId,
		java.lang.String description, long typeId, int status, int begin,
		int end) throws RemoteException {
		try {
			java.util.List returnValue = AdvItemServiceUtil.getItemByParam(groupId,
					description, typeId, status, begin, end);

			return com.test.model.AdvItemSoap.toSoapModels(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static int countItemByParam(long groupId,
		java.lang.String description, long typeId, int status)
		throws RemoteException {
		try {
			int returnValue = AdvItemServiceUtil.countItemByParam(groupId,
					description, typeId, status);

			return returnValue;
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	private static Log _log = LogFactoryUtil.getLog(AdvItemServiceSoap.class);
}