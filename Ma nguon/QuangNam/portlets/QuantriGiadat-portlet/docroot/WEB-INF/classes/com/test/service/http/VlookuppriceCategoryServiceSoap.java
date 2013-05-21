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

import com.test.service.VlookuppriceCategoryServiceUtil;

import java.rmi.RemoteException;

/**
 * <p>
 * This class provides a SOAP utility for the
 * {@link com.test.service.VlookuppriceCategoryServiceUtil} service utility. The
 * static methods of this class calls the same methods of the service utility.
 * However, the signatures are different because it is difficult for SOAP to
 * support certain types.
 * </p>
 *
 * <p>
 * ServiceBuilder follows certain rules in translating the methods. For example,
 * if the method in the service utility returns a {@link java.util.List}, that
 * is translated to an array of {@link com.test.model.VlookuppriceCategorySoap}.
 * If the method in the service utility returns a
 * {@link com.test.model.VlookuppriceCategory}, that is translated to a
 * {@link com.test.model.VlookuppriceCategorySoap}. Methods that SOAP cannot
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
 * @see       VlookuppriceCategoryServiceHttp
 * @see       com.test.model.VlookuppriceCategorySoap
 * @see       com.test.service.VlookuppriceCategoryServiceUtil
 * @generated
 */
public class VlookuppriceCategoryServiceSoap {
	public static com.test.model.VlookuppriceCategorySoap addVlookuppriceCategory(
		java.lang.String createdByUser, long groupId, long companyId,
		java.lang.String parentId, java.lang.String name,
		java.lang.String description, java.lang.String language)
		throws RemoteException {
		try {
			com.test.model.VlookuppriceCategory returnValue = VlookuppriceCategoryServiceUtil.addVlookuppriceCategory(createdByUser,
					groupId, companyId, parentId, name, description, language);

			return com.test.model.VlookuppriceCategorySoap.toSoapModel(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static com.test.model.VlookuppriceCategorySoap updateVlookuppriceCategory(
		java.lang.String categoryId, java.lang.String modifiedByUser,
		long groupId, long companyId, java.lang.String parentId,
		java.lang.String name, java.lang.String description,
		java.lang.String language) throws RemoteException {
		try {
			com.test.model.VlookuppriceCategory returnValue = VlookuppriceCategoryServiceUtil.updateVlookuppriceCategory(categoryId,
					modifiedByUser, groupId, companyId, parentId, name,
					description, language);

			return com.test.model.VlookuppriceCategorySoap.toSoapModel(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static com.test.model.VlookuppriceCategorySoap deleteVlookuppriceCategory(
		java.lang.String categoryId) throws RemoteException {
		try {
			com.test.model.VlookuppriceCategory returnValue = VlookuppriceCategoryServiceUtil.deleteVlookuppriceCategory(categoryId);

			return com.test.model.VlookuppriceCategorySoap.toSoapModel(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static com.test.model.VlookuppriceCategorySoap findById(
		java.lang.String categoryId) throws RemoteException {
		try {
			com.test.model.VlookuppriceCategory returnValue = VlookuppriceCategoryServiceUtil.findById(categoryId);

			return com.test.model.VlookuppriceCategorySoap.toSoapModel(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static com.test.model.VlookuppriceCategorySoap[] findByP_P_L(
		long groupId, java.lang.String parentId, java.lang.String language)
		throws RemoteException {
		try {
			java.util.List returnValue = VlookuppriceCategoryServiceUtil.findByP_P_L(groupId,
					parentId, language);

			return com.test.model.VlookuppriceCategorySoap.toSoapModels(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static com.test.model.VlookuppriceCategorySoap[] findByP_P_L(
		long groupId, java.lang.String parentId, java.lang.String language,
		int start, int end) throws RemoteException {
		try {
			java.util.List returnValue = VlookuppriceCategoryServiceUtil.findByP_P_L(groupId,
					parentId, language, start, end);

			return com.test.model.VlookuppriceCategorySoap.toSoapModels(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static int countByP_P_L(long groupId, java.lang.String parentId,
		java.lang.String language) throws RemoteException {
		try {
			int returnValue = VlookuppriceCategoryServiceUtil.countByP_P_L(groupId,
					parentId, language);

			return returnValue;
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static com.test.model.VlookuppriceCategorySoap[] findByAll()
		throws RemoteException {
		try {
			java.util.List returnValue = VlookuppriceCategoryServiceUtil.findByAll();

			return com.test.model.VlookuppriceCategorySoap.toSoapModels(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static com.test.model.VlookuppriceCategorySoap[] findByAll(
		int start, int end) throws RemoteException {
		try {
			java.util.List returnValue = VlookuppriceCategoryServiceUtil.findByAll(start,
					end);

			return com.test.model.VlookuppriceCategorySoap.toSoapModels(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static int countByAll() throws RemoteException {
		try {
			int returnValue = VlookuppriceCategoryServiceUtil.countByAll();

			return returnValue;
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	private static Log _log = LogFactoryUtil.getLog(VlookuppriceCategoryServiceSoap.class);
}