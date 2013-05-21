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

package com.vsi.advertisement.portlet.service.http;

import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;

import com.vsi.advertisement.portlet.service.AdvItemServiceUtil;

import java.rmi.RemoteException;

/**
 * <p>
 * This class provides a SOAP utility for the
 * {@link com.vsi.advertisement.portlet.service.AdvItemServiceUtil} service utility. The
 * static methods of this class calls the same methods of the service utility.
 * However, the signatures are different because it is difficult for SOAP to
 * support certain types.
 * </p>
 *
 * <p>
 * ServiceBuilder follows certain rules in translating the methods. For example,
 * if the method in the service utility returns a {@link java.util.List}, that
 * is translated to an array of {@link com.vsi.advertisement.portlet.model.AdvItemSoap}.
 * If the method in the service utility returns a
 * {@link com.vsi.advertisement.portlet.model.AdvItem}, that is translated to a
 * {@link com.vsi.advertisement.portlet.model.AdvItemSoap}. Methods that SOAP cannot
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
 * @author    vinhnt
 * @see       AdvItemServiceHttp
 * @see       com.vsi.advertisement.portlet.model.AdvItemSoap
 * @see       com.vsi.advertisement.portlet.service.AdvItemServiceUtil
 * @generated
 */
public class AdvItemServiceSoap {
	public static com.vsi.advertisement.portlet.model.AdvItemSoap[] getAllItem()
		throws RemoteException {
		try {
			java.util.List<com.vsi.advertisement.portlet.model.AdvItem> returnValue =
				AdvItemServiceUtil.getAllItem();

			return com.vsi.advertisement.portlet.model.AdvItemSoap.toSoapModels(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static com.vsi.advertisement.portlet.model.AdvItemSoap getAdvItemById(
		long itemId) throws RemoteException {
		try {
			com.vsi.advertisement.portlet.model.AdvItem returnValue = AdvItemServiceUtil.getAdvItemById(itemId);

			return com.vsi.advertisement.portlet.model.AdvItemSoap.toSoapModel(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static com.vsi.advertisement.portlet.model.AdvItemSoap[] getItemByType(
		long typeId) throws RemoteException {
		try {
			java.util.List<com.vsi.advertisement.portlet.model.AdvItem> returnValue =
				AdvItemServiceUtil.getItemByType(typeId);

			return com.vsi.advertisement.portlet.model.AdvItemSoap.toSoapModels(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static com.vsi.advertisement.portlet.model.AdvItemSoap[] getItemByStatus(
		boolean status) throws RemoteException {
		try {
			java.util.List<com.vsi.advertisement.portlet.model.AdvItem> returnValue =
				AdvItemServiceUtil.getItemByStatus(status);

			return com.vsi.advertisement.portlet.model.AdvItemSoap.toSoapModels(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static com.vsi.advertisement.portlet.model.AdvItemSoap[] getItemByTypeStatus(
		long typeId, boolean status) throws RemoteException {
		try {
			java.util.List<com.vsi.advertisement.portlet.model.AdvItem> returnValue =
				AdvItemServiceUtil.getItemByTypeStatus(typeId, status);

			return com.vsi.advertisement.portlet.model.AdvItemSoap.toSoapModels(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static com.vsi.advertisement.portlet.model.AdvItemSoap[] getItemByKeyword(
		java.lang.String keyWord) throws RemoteException {
		try {
			java.util.List<com.vsi.advertisement.portlet.model.AdvItem> returnValue =
				AdvItemServiceUtil.getItemByKeyword(keyWord);

			return com.vsi.advertisement.portlet.model.AdvItemSoap.toSoapModels(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static com.vsi.advertisement.portlet.model.AdvItemSoap[] getItemByKeywordType(
		java.lang.String keyWord, long typeId) throws RemoteException {
		try {
			java.util.List<com.vsi.advertisement.portlet.model.AdvItem> returnValue =
				AdvItemServiceUtil.getItemByKeywordType(keyWord, typeId);

			return com.vsi.advertisement.portlet.model.AdvItemSoap.toSoapModels(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static com.vsi.advertisement.portlet.model.AdvItemSoap[] getItemByKeywordTypeStatus(
		java.lang.String keyWord, long typeId, boolean status)
		throws RemoteException {
		try {
			java.util.List<com.vsi.advertisement.portlet.model.AdvItem> returnValue =
				AdvItemServiceUtil.getItemByKeywordTypeStatus(keyWord, typeId,
					status);

			return com.vsi.advertisement.portlet.model.AdvItemSoap.toSoapModels(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	private static Log _log = LogFactoryUtil.getLog(AdvItemServiceSoap.class);
}