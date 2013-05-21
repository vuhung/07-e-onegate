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
 * The utility for the v legal t d rel remote service. This utility wraps {@link com.vportal.portlet.vlegal.service.impl.VLegalTDRelServiceImpl} and is the primary access point for service operations in application layer code running on a remote server.
 *
 * <p>
 * Never modify this class directly. Add custom service methods to {@link com.vportal.portlet.vlegal.service.impl.VLegalTDRelServiceImpl} and rerun ServiceBuilder to regenerate this class.
 * </p>
 *
 * <p>
 * This is a remote service. Methods of this service are expected to have security checks based on the propagated JAAS credentials because this service can be accessed remotely.
 * </p>
 *
 * @author ACB
 * @see VLegalTDRelService
 * @see com.vportal.portlet.vlegal.service.base.VLegalTDRelServiceBaseImpl
 * @see com.vportal.portlet.vlegal.service.impl.VLegalTDRelServiceImpl
 * @generated
 */
public class VLegalTDRelServiceUtil {
	public static com.vportal.portlet.vlegal.model.VLegalTDRel addRelation(
		java.lang.String docId, java.lang.String tagId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException, java.rmi.RemoteException {
		return getService().addRelation(docId, tagId);
	}

	public static void deleteRelation(java.lang.String docId,
		java.lang.String tagId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException, java.rmi.RemoteException {
		getService().deleteRelation(docId, tagId);
	}

	public static void deleteRelByDoc(java.lang.String docId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException, java.rmi.RemoteException {
		getService().deleteRelByDoc(docId);
	}

	public static void deleteRelByTag(java.lang.String tagId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException, java.rmi.RemoteException {
		getService().deleteRelByTag(tagId);
	}

	public static java.util.List getRelByDoc(java.lang.String docId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException, java.rmi.RemoteException {
		return getService().getRelByDoc(docId);
	}

	public static java.util.List getRelByTag(java.lang.String tagId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException, java.rmi.RemoteException {
		return getService().getRelByTag(tagId);
	}

	public static void clearService() {
		_service = null;
	}

	public static VLegalTDRelService getService() {
		if (_service == null) {
			Object obj = PortletBeanLocatorUtil.locate(ClpSerializer.SERVLET_CONTEXT_NAME,
					VLegalTDRelService.class.getName());
			ClassLoader portletClassLoader = (ClassLoader)PortletBeanLocatorUtil.locate(ClpSerializer.SERVLET_CONTEXT_NAME,
					"portletClassLoader");

			ClassLoaderProxy classLoaderProxy = new ClassLoaderProxy(obj,
					portletClassLoader);

			_service = new VLegalTDRelServiceClp(classLoaderProxy);

			ClpSerializer.setClassLoader(portletClassLoader);
		}

		return _service;
	}

	public void setService(VLegalTDRelService service) {
		_service = service;
	}

	private static VLegalTDRelService _service;
}