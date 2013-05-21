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

import com.test.service.VlookuppriceServiceUtil;

import java.rmi.RemoteException;

/**
 * <p>
 * This class provides a SOAP utility for the
 * {@link com.test.service.VlookuppriceServiceUtil} service utility. The
 * static methods of this class calls the same methods of the service utility.
 * However, the signatures are different because it is difficult for SOAP to
 * support certain types.
 * </p>
 *
 * <p>
 * ServiceBuilder follows certain rules in translating the methods. For example,
 * if the method in the service utility returns a {@link java.util.List}, that
 * is translated to an array of {@link com.test.model.VlookuppriceSoap}.
 * If the method in the service utility returns a
 * {@link com.test.model.Vlookupprice}, that is translated to a
 * {@link com.test.model.VlookuppriceSoap}. Methods that SOAP cannot
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
 * @see       VlookuppriceServiceHttp
 * @see       com.test.model.VlookuppriceSoap
 * @see       com.test.service.VlookuppriceServiceUtil
 * @generated
 */
public class VlookuppriceServiceSoap {
	public static com.test.model.VlookuppriceSoap addvlookupprice(
		long companyId, java.lang.String content,
		java.lang.String createdByUser, long groupId,
		java.lang.String language, java.lang.String parentId, int status,
		int price, java.lang.String title, java.lang.String listParent,
		java.lang.String position1, java.lang.String position2,
		java.lang.String position3, java.lang.String position4,
		java.lang.String position5) throws RemoteException {
		try {
			com.test.model.Vlookupprice returnValue = VlookuppriceServiceUtil.addvlookupprice(companyId,
					content, createdByUser, groupId, language, parentId,
					status, price, title, listParent, position1, position2,
					position3, position4, position5);

			return com.test.model.VlookuppriceSoap.toSoapModel(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static com.test.model.VlookuppriceSoap updatevlookupprice(
		java.lang.String lookuppriceId, long companyId,
		java.lang.String content, java.lang.String createdByUser, long groupId,
		java.lang.String language, java.lang.String parentId, int status,
		int price, java.lang.String title, java.lang.String listParent,
		java.lang.String position1, java.lang.String position2,
		java.lang.String position3, java.lang.String position4,
		java.lang.String position5) throws RemoteException {
		try {
			com.test.model.Vlookupprice returnValue = VlookuppriceServiceUtil.updatevlookupprice(lookuppriceId,
					companyId, content, createdByUser, groupId, language,
					parentId, status, price, title, listParent, position1,
					position2, position3, position4, position5);

			return com.test.model.VlookuppriceSoap.toSoapModel(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static com.test.model.VlookuppriceSoap deletevlookupprice(
		java.lang.String lookuppriceId) throws RemoteException {
		try {
			com.test.model.Vlookupprice returnValue = VlookuppriceServiceUtil.deletevlookupprice(lookuppriceId);

			return com.test.model.VlookuppriceSoap.toSoapModel(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static com.test.model.VlookuppriceSoap findById(
		java.lang.String lookuppriceId) throws RemoteException {
		try {
			com.test.model.Vlookupprice returnValue = VlookuppriceServiceUtil.findById(lookuppriceId);

			return com.test.model.VlookuppriceSoap.toSoapModel(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static com.test.model.VlookuppriceSoap[] findByS_P(int status,
		java.lang.String parentId) throws RemoteException {
		try {
			java.util.List returnValue = VlookuppriceServiceUtil.findByS_P(status,
					parentId);

			return com.test.model.VlookuppriceSoap.toSoapModels(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static com.test.model.VlookuppriceSoap[] findByS_P(int status,
		java.lang.String parentId, int start, int end)
		throws RemoteException {
		try {
			java.util.List returnValue = VlookuppriceServiceUtil.findByS_P(status,
					parentId, start, end);

			return com.test.model.VlookuppriceSoap.toSoapModels(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static int countByS_P(int status, java.lang.String parentId)
		throws RemoteException {
		try {
			int returnValue = VlookuppriceServiceUtil.countByS_P(status,
					parentId);

			return returnValue;
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static com.test.model.VlookuppriceSoap[] findByG_L_S_P(
		long groupId, java.lang.String language, int status,
		java.lang.String parentId) throws RemoteException {
		try {
			java.util.List returnValue = VlookuppriceServiceUtil.findByG_L_S_P(groupId,
					language, status, parentId);

			return com.test.model.VlookuppriceSoap.toSoapModels(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static com.test.model.VlookuppriceSoap[] findByG_L_S_P(
		long groupId, java.lang.String language, int status,
		java.lang.String parentId, int start, int end)
		throws RemoteException {
		try {
			java.util.List returnValue = VlookuppriceServiceUtil.findByG_L_S_P(groupId,
					language, status, parentId, start, end);

			return com.test.model.VlookuppriceSoap.toSoapModels(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static int countByG_L_S_P(long groupId, java.lang.String language,
		int status, java.lang.String parentId) throws RemoteException {
		try {
			int returnValue = VlookuppriceServiceUtil.countByG_L_S_P(groupId,
					language, status, parentId);

			return returnValue;
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static com.test.model.VlookuppriceSoap[] findByAll()
		throws RemoteException {
		try {
			java.util.List returnValue = VlookuppriceServiceUtil.findByAll();

			return com.test.model.VlookuppriceSoap.toSoapModels(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static com.test.model.VlookuppriceSoap[] findByAll(int start, int end)
		throws RemoteException {
		try {
			java.util.List returnValue = VlookuppriceServiceUtil.findByAll(start,
					end);

			return com.test.model.VlookuppriceSoap.toSoapModels(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static int countByAll() throws RemoteException {
		try {
			int returnValue = VlookuppriceServiceUtil.countByAll();

			return returnValue;
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static com.test.model.VlookuppriceSoap getLookuppriceId(
		java.lang.String lookuppriceId) throws RemoteException {
		try {
			com.test.model.Vlookupprice returnValue = VlookuppriceServiceUtil.getLookuppriceId(lookuppriceId);

			return com.test.model.VlookuppriceSoap.toSoapModel(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static com.test.model.VlookuppriceSoap[] findByParents(
		java.lang.String listParent, int start, int end)
		throws RemoteException {
		try {
			java.util.List returnValue = VlookuppriceServiceUtil.findByParents(listParent,
					start, end);

			return com.test.model.VlookuppriceSoap.toSoapModels(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static int countByParents(java.lang.String listParent)
		throws RemoteException {
		try {
			int returnValue = VlookuppriceServiceUtil.countByParents(listParent);

			return returnValue;
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static com.test.model.VlookuppriceSoap[] findByprice(
		java.lang.String title, java.lang.String listParent, int formPrice,
		int toPrice, int start, int end) throws RemoteException {
		try {
			java.util.List returnValue = VlookuppriceServiceUtil.findByprice(title,
					listParent, formPrice, toPrice, start, end);

			return com.test.model.VlookuppriceSoap.toSoapModels(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static int countByprice(java.lang.String title,
		java.lang.String listParent, int formPrice, int toPrice)
		throws RemoteException {
		try {
			int returnValue = VlookuppriceServiceUtil.countByprice(title,
					listParent, formPrice, toPrice);

			return returnValue;
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	private static Log _log = LogFactoryUtil.getLog(VlookuppriceServiceSoap.class);
}