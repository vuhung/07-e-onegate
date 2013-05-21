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
 * The utility for the v legal attached message remote service. This utility wraps {@link com.vportal.portlet.vlegal.service.impl.VLegalAttachedMessageServiceImpl} and is the primary access point for service operations in application layer code running on a remote server.
 *
 * <p>
 * Never modify this class directly. Add custom service methods to {@link com.vportal.portlet.vlegal.service.impl.VLegalAttachedMessageServiceImpl} and rerun ServiceBuilder to regenerate this class.
 * </p>
 *
 * <p>
 * This is a remote service. Methods of this service are expected to have security checks based on the propagated JAAS credentials because this service can be accessed remotely.
 * </p>
 *
 * @author ACB
 * @see VLegalAttachedMessageService
 * @see com.vportal.portlet.vlegal.service.base.VLegalAttachedMessageServiceBaseImpl
 * @see com.vportal.portlet.vlegal.service.impl.VLegalAttachedMessageServiceImpl
 * @generated
 */
public class VLegalAttachedMessageServiceUtil {
	public static com.vportal.portlet.vlegal.model.VLegalAttachedMessage addMessage(
		long groupId, java.lang.String articleId, java.lang.String content,
		boolean read)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException, java.rmi.RemoteException {
		return getService().addMessage(groupId, articleId, content, read);
	}

	public static com.vportal.portlet.vlegal.model.VLegalAttachedMessage updateMessage(
		java.lang.String messageId, boolean read)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException, java.rmi.RemoteException {
		return getService().updateMessage(messageId, read);
	}

	public static com.vportal.portlet.vlegal.model.VLegalAttachedMessage updateMessage(
		com.vportal.portlet.vlegal.model.VLegalAttachedMessage message)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException, java.rmi.RemoteException {
		return getService().updateMessage(message);
	}

	public static void deleteMessage(java.lang.String messageId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException, java.rmi.RemoteException {
		getService().deleteMessage(messageId);
	}

	public static void deleteMessages(java.lang.String articleId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException, java.rmi.RemoteException {
		getService().deleteMessages(articleId);
	}

	public static java.util.List getAllMessageByStatus(long groupId,
		boolean read) throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getAllMessageByStatus(groupId, read);
	}

	public static com.vportal.portlet.vlegal.model.VLegalAttachedMessage getMessage(
		java.lang.String messageId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException, java.rmi.RemoteException {
		return getService().getMessage(messageId);
	}

	public static java.util.List getMessages(java.lang.String[] messageIds)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException, java.rmi.RemoteException {
		return getService().getMessages(messageIds);
	}

	public static java.util.List getMessages(java.lang.String articleId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException, java.rmi.RemoteException {
		return getService().getMessages(articleId);
	}

	public static java.util.List getMessages(java.lang.String articleId,
		boolean read)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException, java.rmi.RemoteException {
		return getService().getMessages(articleId, read);
	}

	public static java.util.List getMessagesByGroup(long groupId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException, java.rmi.RemoteException {
		return getService().getMessagesByGroup(groupId);
	}

	public static int count(java.lang.String articleId, boolean read)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException, java.rmi.RemoteException {
		return getService().count(articleId, read);
	}

	public static void clearService() {
		_service = null;
	}

	public static VLegalAttachedMessageService getService() {
		if (_service == null) {
			Object obj = PortletBeanLocatorUtil.locate(ClpSerializer.SERVLET_CONTEXT_NAME,
					VLegalAttachedMessageService.class.getName());
			ClassLoader portletClassLoader = (ClassLoader)PortletBeanLocatorUtil.locate(ClpSerializer.SERVLET_CONTEXT_NAME,
					"portletClassLoader");

			ClassLoaderProxy classLoaderProxy = new ClassLoaderProxy(obj,
					portletClassLoader);

			_service = new VLegalAttachedMessageServiceClp(classLoaderProxy);

			ClpSerializer.setClassLoader(portletClassLoader);
		}

		return _service;
	}

	public void setService(VLegalAttachedMessageService service) {
		_service = service;
	}

	private static VLegalAttachedMessageService _service;
}