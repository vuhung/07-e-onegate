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

package com.vportal.portlet.vlegal.service;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.util.ClassLoaderProxy;

/**
 * The utility for the v legal d u rel remote service. This utility wraps {@link com.vportal.portlet.vlegal.service.impl.VLegalDURelServiceImpl} and is the primary access point for service operations in application layer code running on a remote server.
 *
 * <p>
 * Never modify this class directly. Add custom service methods to {@link com.vportal.portlet.vlegal.service.impl.VLegalDURelServiceImpl} and rerun ServiceBuilder to regenerate this class.
 * </p>
 *
 * <p>
 * This is a remote service. Methods of this service are expected to have security checks based on the propagated JAAS credentials because this service can be accessed remotely.
 * </p>
 *
 * @author ACB
 * @see VLegalDURelService
 * @see com.vportal.portlet.vlegal.service.base.VLegalDURelServiceBaseImpl
 * @see com.vportal.portlet.vlegal.service.impl.VLegalDURelServiceImpl
 * @generated
 */
public class VLegalDURelServiceUtil {
	public static com.vportal.portlet.vlegal.model.VLegalDURel addRelation(
		long departmentId, long userid)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.rmi.RemoteException {
		return getService().addRelation(departmentId, userid);
	}

	public static void deleteRelation(long departmentId, long userid)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.rmi.RemoteException {
		getService().deleteRelation(departmentId, userid);
	}

	public static void deleteRelByDepartment(long departmentId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.rmi.RemoteException {
		getService().deleteRelByDepartment(departmentId);
	}

	public static void deleteRelByUser(long userid)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.rmi.RemoteException {
		getService().deleteRelByUser(userid);
	}

	public static java.util.List getRelByDepartment(long departmentId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.rmi.RemoteException {
		return getService().getRelByDepartment(departmentId);
	}

	public static java.util.List getRelByUser(long userid)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.rmi.RemoteException {
		return getService().getRelByUser(userid);
	}

	public static com.vportal.portlet.vlegal.model.VLegalDURel getByUserId(
		long userid)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.rmi.RemoteException {
		return getService().getByUserId(userid);
	}

	public static void clearService() {
		_service = null;
	}

	public static VLegalDURelService getService() {
		if (_service == null) {
			Object obj = PortletBeanLocatorUtil.locate(ClpSerializer.SERVLET_CONTEXT_NAME,
					VLegalDURelService.class.getName());
			ClassLoader portletClassLoader = (ClassLoader)PortletBeanLocatorUtil.locate(ClpSerializer.SERVLET_CONTEXT_NAME,
					"portletClassLoader");

			ClassLoaderProxy classLoaderProxy = new ClassLoaderProxy(obj,
					portletClassLoader);

			_service = new VLegalDURelServiceClp(classLoaderProxy);

			ClpSerializer.setClassLoader(portletClassLoader);
		}

		return _service;
	}

	public void setService(VLegalDURelService service) {
		_service = service;
	}

	private static VLegalDURelService _service;
}