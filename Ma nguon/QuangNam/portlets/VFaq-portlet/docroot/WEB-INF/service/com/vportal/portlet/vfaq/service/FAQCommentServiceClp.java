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

import com.liferay.portal.kernel.util.ClassLoaderProxy;
import com.liferay.portal.kernel.util.MethodHandler;
import com.liferay.portal.kernel.util.MethodKey;

/**
 * @author HOAN
 */
public class FAQCommentServiceClp implements FAQCommentService {
	public FAQCommentServiceClp(ClassLoaderProxy classLoaderProxy) {
		_classLoaderProxy = classLoaderProxy;
	}

	public com.vportal.portlet.vfaq.model.FAQComment addComment(long groupId,
		long answerId, java.lang.String content, java.lang.String commName,
		java.lang.String commEmail, boolean approved,
		java.lang.String approveByUser, java.util.Date approvedDate,
		java.util.Date commDate, long userId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		Object returnObj = null;

		MethodHandler methodHandler = new MethodHandler(_addCommentMethodKey0,
				groupId, answerId, content, commName, commEmail, approved,
				approveByUser, approvedDate, commDate, userId);

		try {
			returnObj = _classLoaderProxy.invoke(methodHandler);
		}
		catch (Throwable t) {
			if (t instanceof com.liferay.portal.kernel.exception.PortalException) {
				throw (com.liferay.portal.kernel.exception.PortalException)t;
			}

			if (t instanceof com.liferay.portal.kernel.exception.SystemException) {
				throw (com.liferay.portal.kernel.exception.SystemException)t;
			}

			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}

		return (com.vportal.portlet.vfaq.model.FAQComment)ClpSerializer.translateOutput(returnObj);
	}

	public com.vportal.portlet.vfaq.model.FAQComment addComment(long groupId,
		long answerId, java.lang.String content, java.lang.String commName,
		java.lang.String commEmail, boolean approved,
		java.lang.String approveByUser, java.util.Date approvedDate,
		java.util.Date commDate, long userId, boolean addCommunityPermissions,
		boolean addGuestPermissions)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		Object returnObj = null;

		MethodHandler methodHandler = new MethodHandler(_addCommentMethodKey1,
				groupId, answerId, content, commName, commEmail, approved,
				approveByUser, approvedDate, commDate, userId,
				addCommunityPermissions, addGuestPermissions);

		try {
			returnObj = _classLoaderProxy.invoke(methodHandler);
		}
		catch (Throwable t) {
			if (t instanceof com.liferay.portal.kernel.exception.PortalException) {
				throw (com.liferay.portal.kernel.exception.PortalException)t;
			}

			if (t instanceof com.liferay.portal.kernel.exception.SystemException) {
				throw (com.liferay.portal.kernel.exception.SystemException)t;
			}

			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}

		return (com.vportal.portlet.vfaq.model.FAQComment)ClpSerializer.translateOutput(returnObj);
	}

	public com.vportal.portlet.vfaq.model.FAQComment addComment(long groupId,
		long answerId, java.lang.String content, java.lang.String commName,
		java.lang.String commEmail, boolean approved,
		java.lang.String approveByUser, java.util.Date approvedDate,
		java.util.Date commDate, long userId,
		java.lang.String[] communityPermissions,
		java.lang.String[] guestPermissions)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		Object returnObj = null;

		MethodHandler methodHandler = new MethodHandler(_addCommentMethodKey2,
				groupId, answerId, content, commName, commEmail, approved,
				approveByUser, approvedDate, commDate, userId,
				communityPermissions, guestPermissions);

		try {
			returnObj = _classLoaderProxy.invoke(methodHandler);
		}
		catch (Throwable t) {
			if (t instanceof com.liferay.portal.kernel.exception.PortalException) {
				throw (com.liferay.portal.kernel.exception.PortalException)t;
			}

			if (t instanceof com.liferay.portal.kernel.exception.SystemException) {
				throw (com.liferay.portal.kernel.exception.SystemException)t;
			}

			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}

		return (com.vportal.portlet.vfaq.model.FAQComment)ClpSerializer.translateOutput(returnObj);
	}

	public com.vportal.portlet.vfaq.model.FAQComment updateComment(
		long groupId, long commentId, java.lang.String content,
		boolean approved, java.lang.String approveByUser,
		java.util.Date approvedDate, long userId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		Object returnObj = null;

		MethodHandler methodHandler = new MethodHandler(_updateCommentMethodKey3,
				groupId, commentId, content, approved, approveByUser,
				approvedDate, userId);

		try {
			returnObj = _classLoaderProxy.invoke(methodHandler);
		}
		catch (Throwable t) {
			if (t instanceof com.liferay.portal.kernel.exception.PortalException) {
				throw (com.liferay.portal.kernel.exception.PortalException)t;
			}

			if (t instanceof com.liferay.portal.kernel.exception.SystemException) {
				throw (com.liferay.portal.kernel.exception.SystemException)t;
			}

			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}

		return (com.vportal.portlet.vfaq.model.FAQComment)ClpSerializer.translateOutput(returnObj);
	}

	public com.vportal.portlet.vfaq.model.FAQComment getComment(long groupId,
		long commentid)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		Object returnObj = null;

		MethodHandler methodHandler = new MethodHandler(_getCommentMethodKey4,
				groupId, commentid);

		try {
			returnObj = _classLoaderProxy.invoke(methodHandler);
		}
		catch (Throwable t) {
			if (t instanceof com.liferay.portal.kernel.exception.PortalException) {
				throw (com.liferay.portal.kernel.exception.PortalException)t;
			}

			if (t instanceof com.liferay.portal.kernel.exception.SystemException) {
				throw (com.liferay.portal.kernel.exception.SystemException)t;
			}

			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}

		return (com.vportal.portlet.vfaq.model.FAQComment)ClpSerializer.translateOutput(returnObj);
	}

	public void removeComment(long groupId, long commentid)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		MethodHandler methodHandler = new MethodHandler(_removeCommentMethodKey5,
				groupId, commentid);

		try {
			_classLoaderProxy.invoke(methodHandler);
		}
		catch (Throwable t) {
			if (t instanceof com.liferay.portal.kernel.exception.PortalException) {
				throw (com.liferay.portal.kernel.exception.PortalException)t;
			}

			if (t instanceof com.liferay.portal.kernel.exception.SystemException) {
				throw (com.liferay.portal.kernel.exception.SystemException)t;
			}

			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}
	}

	public com.vportal.portlet.vfaq.model.FAQComment unapproved(long groupId,
		long commentid)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		Object returnObj = null;

		MethodHandler methodHandler = new MethodHandler(_unapprovedMethodKey6,
				groupId, commentid);

		try {
			returnObj = _classLoaderProxy.invoke(methodHandler);
		}
		catch (Throwable t) {
			if (t instanceof com.liferay.portal.kernel.exception.PortalException) {
				throw (com.liferay.portal.kernel.exception.PortalException)t;
			}

			if (t instanceof com.liferay.portal.kernel.exception.SystemException) {
				throw (com.liferay.portal.kernel.exception.SystemException)t;
			}

			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}

		return (com.vportal.portlet.vfaq.model.FAQComment)ClpSerializer.translateOutput(returnObj);
	}

	public ClassLoaderProxy getClassLoaderProxy() {
		return _classLoaderProxy;
	}

	private ClassLoaderProxy _classLoaderProxy;
	private MethodKey _addCommentMethodKey0 = new MethodKey(_classLoaderProxy.getClassName(),
			"addComment", long.class, long.class, java.lang.String.class,
			java.lang.String.class, java.lang.String.class, boolean.class,
			java.lang.String.class, java.util.Date.class, java.util.Date.class,
			long.class);
	private MethodKey _addCommentMethodKey1 = new MethodKey(_classLoaderProxy.getClassName(),
			"addComment", long.class, long.class, java.lang.String.class,
			java.lang.String.class, java.lang.String.class, boolean.class,
			java.lang.String.class, java.util.Date.class, java.util.Date.class,
			long.class, boolean.class, boolean.class);
	private MethodKey _addCommentMethodKey2 = new MethodKey(_classLoaderProxy.getClassName(),
			"addComment", long.class, long.class, java.lang.String.class,
			java.lang.String.class, java.lang.String.class, boolean.class,
			java.lang.String.class, java.util.Date.class, java.util.Date.class,
			long.class, java.lang.String[].class, java.lang.String[].class);
	private MethodKey _updateCommentMethodKey3 = new MethodKey(_classLoaderProxy.getClassName(),
			"updateComment", long.class, long.class, java.lang.String.class,
			boolean.class, java.lang.String.class, java.util.Date.class,
			long.class);
	private MethodKey _getCommentMethodKey4 = new MethodKey(_classLoaderProxy.getClassName(),
			"getComment", long.class, long.class);
	private MethodKey _removeCommentMethodKey5 = new MethodKey(_classLoaderProxy.getClassName(),
			"removeComment", long.class, long.class);
	private MethodKey _unapprovedMethodKey6 = new MethodKey(_classLoaderProxy.getClassName(),
			"unapproved", long.class, long.class);
}