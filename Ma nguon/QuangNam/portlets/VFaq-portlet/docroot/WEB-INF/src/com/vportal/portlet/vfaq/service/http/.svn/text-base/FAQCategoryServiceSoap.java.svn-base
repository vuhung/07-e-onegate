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

package com.vportal.portlet.vfaq.service.http;

import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;

import com.vportal.portlet.vfaq.service.FAQCategoryServiceUtil;

import java.rmi.RemoteException;

/**
 * <p>
 * This class provides a SOAP utility for the
 * {@link com.vportal.portlet.vfaq.service.FAQCategoryServiceUtil} service utility. The
 * static methods of this class calls the same methods of the service utility.
 * However, the signatures are different because it is difficult for SOAP to
 * support certain types.
 * </p>
 *
 * <p>
 * ServiceBuilder follows certain rules in translating the methods. For example,
 * if the method in the service utility returns a {@link java.util.List}, that
 * is translated to an array of {@link com.vportal.portlet.vfaq.model.FAQCategorySoap}.
 * If the method in the service utility returns a
 * {@link com.vportal.portlet.vfaq.model.FAQCategory}, that is translated to a
 * {@link com.vportal.portlet.vfaq.model.FAQCategorySoap}. Methods that SOAP cannot
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
 * @author    HOAN
 * @see       FAQCategoryServiceHttp
 * @see       com.vportal.portlet.vfaq.model.FAQCategorySoap
 * @see       com.vportal.portlet.vfaq.service.FAQCategoryServiceUtil
 * @generated
 */
public class FAQCategoryServiceSoap {
	public static com.vportal.portlet.vfaq.model.FAQCategorySoap addCategory(
		java.lang.String name, java.lang.String description,
		java.lang.String language, long parent, int catorder, int catlevel,
		java.lang.String image, java.lang.String createdByUser,
		java.util.Date createdDate, long plId, long userId)
		throws RemoteException {
		try {
			com.vportal.portlet.vfaq.model.FAQCategory returnValue = FAQCategoryServiceUtil.addCategory(name,
					description, language, parent, catorder, catlevel, image,
					createdByUser, createdDate, plId, userId);

			return com.vportal.portlet.vfaq.model.FAQCategorySoap.toSoapModel(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static com.vportal.portlet.vfaq.model.FAQCategorySoap addCategory(
		java.lang.String name, java.lang.String description,
		java.lang.String language, long parent, int catorder, int catlevel,
		java.lang.String image, java.lang.String createdByUser,
		java.util.Date createdDate, long plId, long userId,
		boolean addCommunityPermissions, boolean addGuestPermissions)
		throws RemoteException {
		try {
			com.vportal.portlet.vfaq.model.FAQCategory returnValue = FAQCategoryServiceUtil.addCategory(name,
					description, language, parent, catorder, catlevel, image,
					createdByUser, createdDate, plId, userId,
					addCommunityPermissions, addGuestPermissions);

			return com.vportal.portlet.vfaq.model.FAQCategorySoap.toSoapModel(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static com.vportal.portlet.vfaq.model.FAQCategorySoap addCategory(
		java.lang.String name, java.lang.String description,
		java.lang.String language, long parent, int catorder, int catlevel,
		java.lang.String image, java.lang.String createdByUser,
		java.util.Date createdDate, long plId, long userId,
		java.lang.String[] communityPermissions,
		java.lang.String[] guestPermissions) throws RemoteException {
		try {
			com.vportal.portlet.vfaq.model.FAQCategory returnValue = FAQCategoryServiceUtil.addCategory(name,
					description, language, parent, catorder, catlevel, image,
					createdByUser, createdDate, plId, userId,
					communityPermissions, guestPermissions);

			return com.vportal.portlet.vfaq.model.FAQCategorySoap.toSoapModel(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static com.vportal.portlet.vfaq.model.FAQCategorySoap updateCategory(
		long categoryId, java.lang.String name, java.lang.String description,
		java.lang.String language, long parent, int catorder, int catlevel,
		java.lang.String image, java.lang.String modifiedByUser,
		java.util.Date modifiedDate, long groupId, long userId)
		throws RemoteException {
		try {
			com.vportal.portlet.vfaq.model.FAQCategory returnValue = FAQCategoryServiceUtil.updateCategory(categoryId,
					name, description, language, parent, catorder, catlevel,
					image, modifiedByUser, modifiedDate, groupId, userId);

			return com.vportal.portlet.vfaq.model.FAQCategorySoap.toSoapModel(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static com.vportal.portlet.vfaq.model.FAQCategorySoap updateImage(
		long groupId, long categoryId, java.lang.String imageName)
		throws RemoteException {
		try {
			com.vportal.portlet.vfaq.model.FAQCategory returnValue = FAQCategoryServiceUtil.updateImage(groupId,
					categoryId, imageName);

			return com.vportal.portlet.vfaq.model.FAQCategorySoap.toSoapModel(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static void deleteCategory(long groupId, long categoryId)
		throws RemoteException {
		try {
			FAQCategoryServiceUtil.deleteCategory(groupId, categoryId);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static com.vportal.portlet.vfaq.model.FAQCategorySoap getCategory(
		long groupId, long categoryId) throws RemoteException {
		try {
			com.vportal.portlet.vfaq.model.FAQCategory returnValue = FAQCategoryServiceUtil.getCategory(groupId,
					categoryId);

			return com.vportal.portlet.vfaq.model.FAQCategorySoap.toSoapModel(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static com.vportal.portlet.vfaq.model.FAQCategorySoap[] getCategoriesByG_L(
		long groupId, java.lang.String language) throws RemoteException {
		try {
			java.util.List returnValue = FAQCategoryServiceUtil.getCategoriesByG_L(groupId,
					language);

			return com.vportal.portlet.vfaq.model.FAQCategorySoap.toSoapModels(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static com.vportal.portlet.vfaq.model.FAQCategorySoap[] findAll()
		throws RemoteException {
		try {
			java.util.List returnValue = FAQCategoryServiceUtil.findAll();

			return com.vportal.portlet.vfaq.model.FAQCategorySoap.toSoapModels(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static com.vportal.portlet.vfaq.model.FAQCategorySoap findByPrimaryKey(
		long id) throws RemoteException {
		try {
			com.vportal.portlet.vfaq.model.FAQCategory returnValue = FAQCategoryServiceUtil.findByPrimaryKey(id);

			return com.vportal.portlet.vfaq.model.FAQCategorySoap.toSoapModel(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static com.vportal.portlet.vfaq.model.FAQCategorySoap findFirst()
		throws RemoteException {
		try {
			com.vportal.portlet.vfaq.model.FAQCategory returnValue = FAQCategoryServiceUtil.findFirst();

			return com.vportal.portlet.vfaq.model.FAQCategorySoap.toSoapModel(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	private static Log _log = LogFactoryUtil.getLog(FAQCategoryServiceSoap.class);
}