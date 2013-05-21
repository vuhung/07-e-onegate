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

package com.vportal.portal.service;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.util.ClassLoaderProxy;

/**
 * The utility for the attachment remote service. This utility wraps {@link com.vportal.portal.service.impl.AttachmentServiceImpl} and is the primary access point for service operations in application layer code running on a remote server.
 *
 * <p>
 * Never modify this class directly. Add custom service methods to {@link com.vportal.portal.service.impl.AttachmentServiceImpl} and rerun ServiceBuilder to regenerate this class.
 * </p>
 *
 * <p>
 * This is a remote service. Methods of this service are expected to have security checks based on the propagated JAAS credentials because this service can be accessed remotely.
 * </p>
 *
 * @author HOAN
 * @see AttachmentService
 * @see com.vportal.portal.service.base.AttachmentServiceBaseImpl
 * @see com.vportal.portal.service.impl.AttachmentServiceImpl
 * @generated
 */
public class AttachmentServiceUtil {
	public static com.vportal.portal.model.Attachment addAttachment(
		long companyId, long groupId, long entryId, java.lang.Class entryClass,
		long folderId, java.lang.String fileName, byte[] byteArray)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .addAttachment(companyId, groupId, entryId, entryClass,
			folderId, fileName, byteArray);
	}

	public static java.util.List getAttachments(long entryId,
		java.lang.Class entryClass)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getAttachments(entryId, entryClass);
	}

	public static java.util.List searchAttachments(long folderId,
		java.lang.String keywords)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().searchAttachments(folderId, keywords);
	}

	public static void deleteAttachment(long attachmentId, long companyId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		getService().deleteAttachment(attachmentId, companyId);
	}

	public static void deleteAttachments(java.lang.Class entryClass,
		long entryId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		getService().deleteAttachments(entryClass, entryId);
	}

	public static void clearService() {
		_service = null;
	}

	public static AttachmentService getService() {
		if (_service == null) {
			Object obj = PortletBeanLocatorUtil.locate(ClpSerializer.SERVLET_CONTEXT_NAME,
					AttachmentService.class.getName());
			ClassLoader portletClassLoader = (ClassLoader)PortletBeanLocatorUtil.locate(ClpSerializer.SERVLET_CONTEXT_NAME,
					"portletClassLoader");

			ClassLoaderProxy classLoaderProxy = new ClassLoaderProxy(obj,
					portletClassLoader);

			_service = new AttachmentServiceClp(classLoaderProxy);

			ClpSerializer.setClassLoader(portletClassLoader);
		}

		return _service;
	}

	public void setService(AttachmentService service) {
		_service = service;
	}

	private static AttachmentService _service;
}