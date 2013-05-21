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

package com.vportal.portlet.vcontact.service;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.util.ClassLoaderProxy;

/**
 * The utility for the v contact remote service. This utility wraps {@link com.vportal.portlet.vcontact.service.impl.VContactServiceImpl} and is the primary access point for service operations in application layer code running on a remote server.
 *
 * <p>
 * Never modify this class directly. Add custom service methods to {@link com.vportal.portlet.vcontact.service.impl.VContactServiceImpl} and rerun ServiceBuilder to regenerate this class.
 * </p>
 *
 * <p>
 * This is a remote service. Methods of this service are expected to have security checks based on the propagated JAAS credentials because this service can be accessed remotely.
 * </p>
 *
 * @author Admin
 * @see VContactService
 * @see com.vportal.portlet.vcontact.service.base.VContactServiceBaseImpl
 * @see com.vportal.portlet.vcontact.service.impl.VContactServiceImpl
 * @generated
 */
public class VContactServiceUtil {
	public static com.vportal.portlet.vcontact.model.VContact addContact(
		long groupId, long companyId, long plid, java.lang.String guestName,
		java.lang.String email, java.lang.String title,
		java.lang.String address, java.lang.String phone, java.lang.String fax,
		java.lang.String content, boolean hasAttach, int status, long userId,
		java.lang.String[] communityPermissions,
		java.lang.String[] guestPermissions)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.rmi.RemoteException {
		return getService()
				   .addContact(groupId, companyId, plid, guestName, email,
			title, address, phone, fax, content, hasAttach, status, userId,
			communityPermissions, guestPermissions);
	}

	public static com.vportal.portlet.vcontact.model.VContact addContact(
		long groupId, long companyId, long plid, java.lang.String guestName,
		java.lang.String email, java.lang.String title,
		java.lang.String address, java.lang.String phone, java.lang.String fax,
		java.lang.String content, boolean hasAttach, int status, long userId,
		java.lang.Boolean addCommunityPermissions,
		java.lang.Boolean addGuestPermissions,
		java.lang.String[] communityPermissions,
		java.lang.String[] guestPermissions)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.rmi.RemoteException {
		return getService()
				   .addContact(groupId, companyId, plid, guestName, email,
			title, address, phone, fax, content, hasAttach, status, userId,
			addCommunityPermissions, addGuestPermissions, communityPermissions,
			guestPermissions);
	}

	public static com.vportal.portlet.vcontact.model.VContact updateContact(
		long Id, long groupId, long companyId, java.lang.String guestName,
		java.lang.String email, java.lang.String title,
		java.lang.String address, java.lang.String phone, java.lang.String fax,
		java.lang.String content, boolean hasAttach, int status)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.rmi.RemoteException {
		return getService()
				   .updateContact(Id, groupId, companyId, guestName, email,
			title, address, phone, fax, content, hasAttach, status);
	}

	public static com.vportal.portlet.vcontact.model.VContact updateContact(
		com.vportal.portlet.vcontact.model.VContact contact)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.rmi.RemoteException {
		return getService().updateContact(contact);
	}

	public static void deleteContact(long Id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.rmi.RemoteException {
		getService().deleteContact(Id);
	}

	public static java.util.List getAll()
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.rmi.RemoteException {
		return getService().getAll();
	}

	public static java.util.List getByStatus(int status)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.rmi.RemoteException {
		return getService().getByStatus(status);
	}

	public static java.util.List getByG_S(long groupId, int status)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.rmi.RemoteException {
		return getService().getByG_S(groupId, status);
	}

	public static java.util.List getByG_S(long groupId, int status, int start,
		int end)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.rmi.RemoteException {
		return getService().getByG_S(groupId, status, start, end);
	}

	public static com.vportal.portlet.vcontact.model.VContact getContact(
		long Id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.rmi.RemoteException {
		return getService().getContact(Id);
	}

	public static void clearService() {
		_service = null;
	}

	public static VContactService getService() {
		if (_service == null) {
			Object obj = PortletBeanLocatorUtil.locate(ClpSerializer.SERVLET_CONTEXT_NAME,
					VContactService.class.getName());
			ClassLoader portletClassLoader = (ClassLoader)PortletBeanLocatorUtil.locate(ClpSerializer.SERVLET_CONTEXT_NAME,
					"portletClassLoader");

			ClassLoaderProxy classLoaderProxy = new ClassLoaderProxy(obj,
					portletClassLoader);

			_service = new VContactServiceClp(classLoaderProxy);

			ClpSerializer.setClassLoader(portletClassLoader);
		}

		return _service;
	}

	public void setService(VContactService service) {
		_service = service;
	}

	private static VContactService _service;
}