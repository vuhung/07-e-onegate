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
 * The utility for the v legal d f rel remote service. This utility wraps {@link com.vportal.portlet.vlegal.service.impl.VLegalDFRelServiceImpl} and is the primary access point for service operations in application layer code running on a remote server.
 *
 * <p>
 * Never modify this class directly. Add custom service methods to {@link com.vportal.portlet.vlegal.service.impl.VLegalDFRelServiceImpl} and rerun ServiceBuilder to regenerate this class.
 * </p>
 *
 * <p>
 * This is a remote service. Methods of this service are expected to have security checks based on the propagated JAAS credentials because this service can be accessed remotely.
 * </p>
 *
 * @author ACB
 * @see VLegalDFRelService
 * @see com.vportal.portlet.vlegal.service.base.VLegalDFRelServiceBaseImpl
 * @see com.vportal.portlet.vlegal.service.impl.VLegalDFRelServiceImpl
 * @generated
 */
public class VLegalDFRelServiceUtil {
	public static com.vportal.portlet.vlegal.model.VLegalDFRel addRelation(
		java.lang.String docId, java.lang.String fieldId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.rmi.RemoteException {
		return getService().addRelation(docId, fieldId);
	}

	public static void deleteRelation(java.lang.String docId,
		java.lang.String fieldId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vlegal.NoSuchVLegalDFRelException {
		getService().deleteRelation(docId, fieldId);
	}

	public static void deleteRelByField(java.lang.String fieldId)
		throws com.liferay.portal.kernel.exception.SystemException {
		getService().deleteRelByField(fieldId);
	}

	public static void deleteRelByDoc(java.lang.String docId)
		throws com.liferay.portal.kernel.exception.SystemException {
		getService().deleteRelByDoc(docId);
	}

	public static java.util.List getRelByDoc(java.lang.String docId) {
		return getService().getRelByDoc(docId);
	}

	public static java.util.List getRelByField(java.lang.String fieldId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getRelByField(fieldId);
	}

	public static com.vportal.portlet.vlegal.model.VLegalDFRel addRealation(
		java.lang.String arg0, java.lang.String arg1)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().addRealation(arg0, arg1);
	}

	public static void clearService() {
		_service = null;
	}

	public static VLegalDFRelService getService() {
		if (_service == null) {
			Object obj = PortletBeanLocatorUtil.locate(ClpSerializer.SERVLET_CONTEXT_NAME,
					VLegalDFRelService.class.getName());
			ClassLoader portletClassLoader = (ClassLoader)PortletBeanLocatorUtil.locate(ClpSerializer.SERVLET_CONTEXT_NAME,
					"portletClassLoader");

			ClassLoaderProxy classLoaderProxy = new ClassLoaderProxy(obj,
					portletClassLoader);

			_service = new VLegalDFRelServiceClp(classLoaderProxy);

			ClpSerializer.setClassLoader(portletClassLoader);
		}

		return _service;
	}

	public void setService(VLegalDFRelService service) {
		_service = service;
	}

	private static VLegalDFRelService _service;
}