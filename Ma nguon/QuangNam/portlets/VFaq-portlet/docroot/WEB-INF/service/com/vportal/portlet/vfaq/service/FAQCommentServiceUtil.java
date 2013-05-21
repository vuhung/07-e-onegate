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

package com.vportal.portlet.vfaq.service;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.util.ClassLoaderProxy;

/**
 * The utility for the f a q comment remote service. This utility wraps {@link com.vportal.portlet.vfaq.service.impl.FAQCommentServiceImpl} and is the primary access point for service operations in application layer code running on a remote server.
 *
 * <p>
 * Never modify this class directly. Add custom service methods to {@link com.vportal.portlet.vfaq.service.impl.FAQCommentServiceImpl} and rerun ServiceBuilder to regenerate this class.
 * </p>
 *
 * <p>
 * This is a remote service. Methods of this service are expected to have security checks based on the propagated JAAS credentials because this service can be accessed remotely.
 * </p>
 *
 * @author HOAN
 * @see FAQCommentService
 * @see com.vportal.portlet.vfaq.service.base.FAQCommentServiceBaseImpl
 * @see com.vportal.portlet.vfaq.service.impl.FAQCommentServiceImpl
 * @generated
 */
public class FAQCommentServiceUtil {
	/**
	* Them 1 comment moi vao database
	*/
	public static com.vportal.portlet.vfaq.model.FAQComment addComment(
		long groupId, long answerId, java.lang.String content,
		java.lang.String commName, java.lang.String commEmail,
		boolean approved, java.lang.String approveByUser,
		java.util.Date approvedDate, java.util.Date commDate, long userId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .addComment(groupId, answerId, content, commName, commEmail,
			approved, approveByUser, approvedDate, commDate, userId);
	}

	/**
	* Them 1 comment moi vao database
	*/
	public static com.vportal.portlet.vfaq.model.FAQComment addComment(
		long groupId, long answerId, java.lang.String content,
		java.lang.String commName, java.lang.String commEmail,
		boolean approved, java.lang.String approveByUser,
		java.util.Date approvedDate, java.util.Date commDate, long userId,
		boolean addCommunityPermissions, boolean addGuestPermissions)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .addComment(groupId, answerId, content, commName, commEmail,
			approved, approveByUser, approvedDate, commDate, userId,
			addCommunityPermissions, addGuestPermissions);
	}

	/**
	* Them 1 comment moi vao database
	*/
	public static com.vportal.portlet.vfaq.model.FAQComment addComment(
		long groupId, long answerId, java.lang.String content,
		java.lang.String commName, java.lang.String commEmail,
		boolean approved, java.lang.String approveByUser,
		java.util.Date approvedDate, java.util.Date commDate, long userId,
		java.lang.String[] communityPermissions,
		java.lang.String[] guestPermissions)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .addComment(groupId, answerId, content, commName, commEmail,
			approved, approveByUser, approvedDate, commDate, userId,
			communityPermissions, guestPermissions);
	}

	/**
	* Sua 1 comment da co
	*/
	public static com.vportal.portlet.vfaq.model.FAQComment updateComment(
		long groupId, long commentId, java.lang.String content,
		boolean approved, java.lang.String approveByUser,
		java.util.Date approvedDate, long userId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .updateComment(groupId, commentId, content, approved,
			approveByUser, approvedDate, userId);
	}

	public static com.vportal.portlet.vfaq.model.FAQComment getComment(
		long groupId, long commentid)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getComment(groupId, commentid);
	}

	public static void removeComment(long groupId, long commentid)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		getService().removeComment(groupId, commentid);
	}

	public static com.vportal.portlet.vfaq.model.FAQComment unapproved(
		long groupId, long commentid)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().unapproved(groupId, commentid);
	}

	public static void clearService() {
		_service = null;
	}

	public static FAQCommentService getService() {
		if (_service == null) {
			Object obj = PortletBeanLocatorUtil.locate(ClpSerializer.SERVLET_CONTEXT_NAME,
					FAQCommentService.class.getName());
			ClassLoader portletClassLoader = (ClassLoader)PortletBeanLocatorUtil.locate(ClpSerializer.SERVLET_CONTEXT_NAME,
					"portletClassLoader");

			ClassLoaderProxy classLoaderProxy = new ClassLoaderProxy(obj,
					portletClassLoader);

			_service = new FAQCommentServiceClp(classLoaderProxy);

			ClpSerializer.setClassLoader(portletClassLoader);
		}

		return _service;
	}

	public void setService(FAQCommentService service) {
		_service = service;
	}

	private static FAQCommentService _service;
}