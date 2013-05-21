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
public class FAQAnswerServiceClp implements FAQAnswerService {
	public FAQAnswerServiceClp(ClassLoaderProxy classLoaderProxy) {
		_classLoaderProxy = classLoaderProxy;
	}

	public com.vportal.portlet.vfaq.model.FAQAnswer addAnswer(long groupId,
		long questionId, java.lang.String content, int answerOrder,
		java.lang.String answeredByUser, java.util.Date answeredDate,
		java.lang.String language, boolean isApproved,
		java.lang.String approvedByUser, java.util.Date approvedDate,
		long userId, java.lang.String attachName, long folderId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		Object returnObj = null;

		MethodHandler methodHandler = new MethodHandler(_addAnswerMethodKey0,
				groupId, questionId, content, answerOrder, answeredByUser,
				answeredDate, language, isApproved, approvedByUser,
				approvedDate, userId, attachName, folderId);

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

		return (com.vportal.portlet.vfaq.model.FAQAnswer)ClpSerializer.translateOutput(returnObj);
	}

	public com.vportal.portlet.vfaq.model.FAQAnswer addAnswer(long groupId,
		long questionId, java.lang.String content, int answerOrder,
		java.lang.String answeredByUser, java.util.Date answeredDate,
		java.lang.String language, boolean isApproved,
		java.lang.String approvedByUser, java.util.Date approvedDate,
		long userId, java.lang.String attachName, long folderId,
		boolean addCommunityPermissions, boolean addGuestPermissions)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		Object returnObj = null;

		MethodHandler methodHandler = new MethodHandler(_addAnswerMethodKey1,
				groupId, questionId, content, answerOrder, answeredByUser,
				answeredDate, language, isApproved, approvedByUser,
				approvedDate, userId, attachName, folderId,
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

		return (com.vportal.portlet.vfaq.model.FAQAnswer)ClpSerializer.translateOutput(returnObj);
	}

	public com.vportal.portlet.vfaq.model.FAQAnswer addAnswer(long groupId,
		long questionId, java.lang.String content, int answerOrder,
		java.lang.String answeredByUser, java.util.Date answeredDate,
		java.lang.String language, boolean isApproved,
		java.lang.String approvedByUser, java.util.Date approvedDate,
		long userId, java.lang.String attachName, long folderId,
		java.lang.String[] communityPermissions,
		java.lang.String[] guestPermissions)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		Object returnObj = null;

		MethodHandler methodHandler = new MethodHandler(_addAnswerMethodKey2,
				groupId, questionId, content, answerOrder, answeredByUser,
				answeredDate, language, isApproved, approvedByUser,
				approvedDate, userId, attachName, folderId,
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

		return (com.vportal.portlet.vfaq.model.FAQAnswer)ClpSerializer.translateOutput(returnObj);
	}

	public com.vportal.portlet.vfaq.model.FAQAnswer updateAnswer(long groupId,
		long answerId, java.lang.String content, int answerOrder,
		java.lang.String answeredByUser, java.util.Date answeredDate,
		java.lang.String language, boolean isApproved,
		java.lang.String approvedByUser, java.util.Date approvedDate,
		long userId, java.lang.String attachName, long folderId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		Object returnObj = null;

		MethodHandler methodHandler = new MethodHandler(_updateAnswerMethodKey3,
				groupId, answerId, content, answerOrder, answeredByUser,
				answeredDate, language, isApproved, approvedByUser,
				approvedDate, userId, attachName, folderId);

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

		return (com.vportal.portlet.vfaq.model.FAQAnswer)ClpSerializer.translateOutput(returnObj);
	}

	public void deleteAnswer(long groupId, long answerid)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		MethodHandler methodHandler = new MethodHandler(_deleteAnswerMethodKey4,
				groupId, answerid);

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

	public com.vportal.portlet.vfaq.model.FAQAnswer approveAnswer(
		long groupId, long answerId, java.lang.String approvedByUser)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		Object returnObj = null;

		MethodHandler methodHandler = new MethodHandler(_approveAnswerMethodKey5,
				groupId, answerId, approvedByUser);

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

		return (com.vportal.portlet.vfaq.model.FAQAnswer)ClpSerializer.translateOutput(returnObj);
	}

	public com.vportal.portlet.vfaq.model.FAQAnswer unapproveAnswer(
		long groupId, long answerId, java.lang.String approvedByUser)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		Object returnObj = null;

		MethodHandler methodHandler = new MethodHandler(_unapproveAnswerMethodKey6,
				groupId, answerId, approvedByUser);

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

		return (com.vportal.portlet.vfaq.model.FAQAnswer)ClpSerializer.translateOutput(returnObj);
	}

	public com.vportal.portlet.vfaq.model.FAQAnswer getAnswer(long groupId,
		long answerId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		Object returnObj = null;

		MethodHandler methodHandler = new MethodHandler(_getAnswerMethodKey7,
				groupId, answerId);

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

		return (com.vportal.portlet.vfaq.model.FAQAnswer)ClpSerializer.translateOutput(returnObj);
	}

	public int countQuestion(long questionid)
		throws com.liferay.portal.kernel.exception.SystemException {
		Object returnObj = null;

		MethodHandler methodHandler = new MethodHandler(_countQuestionMethodKey8,
				questionid);

		try {
			returnObj = _classLoaderProxy.invoke(methodHandler);
		}
		catch (Throwable t) {
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

		return ((Integer)returnObj).intValue();
	}

	public ClassLoaderProxy getClassLoaderProxy() {
		return _classLoaderProxy;
	}

	private ClassLoaderProxy _classLoaderProxy;
	private MethodKey _addAnswerMethodKey0 = new MethodKey(_classLoaderProxy.getClassName(),
			"addAnswer", long.class, long.class, java.lang.String.class,
			int.class, java.lang.String.class, java.util.Date.class,
			java.lang.String.class, boolean.class, java.lang.String.class,
			java.util.Date.class, long.class, java.lang.String.class, long.class);
	private MethodKey _addAnswerMethodKey1 = new MethodKey(_classLoaderProxy.getClassName(),
			"addAnswer", long.class, long.class, java.lang.String.class,
			int.class, java.lang.String.class, java.util.Date.class,
			java.lang.String.class, boolean.class, java.lang.String.class,
			java.util.Date.class, long.class, java.lang.String.class,
			long.class, boolean.class, boolean.class);
	private MethodKey _addAnswerMethodKey2 = new MethodKey(_classLoaderProxy.getClassName(),
			"addAnswer", long.class, long.class, java.lang.String.class,
			int.class, java.lang.String.class, java.util.Date.class,
			java.lang.String.class, boolean.class, java.lang.String.class,
			java.util.Date.class, long.class, java.lang.String.class,
			long.class, java.lang.String[].class, java.lang.String[].class);
	private MethodKey _updateAnswerMethodKey3 = new MethodKey(_classLoaderProxy.getClassName(),
			"updateAnswer", long.class, long.class, java.lang.String.class,
			int.class, java.lang.String.class, java.util.Date.class,
			java.lang.String.class, boolean.class, java.lang.String.class,
			java.util.Date.class, long.class, java.lang.String.class, long.class);
	private MethodKey _deleteAnswerMethodKey4 = new MethodKey(_classLoaderProxy.getClassName(),
			"deleteAnswer", long.class, long.class);
	private MethodKey _approveAnswerMethodKey5 = new MethodKey(_classLoaderProxy.getClassName(),
			"approveAnswer", long.class, long.class, java.lang.String.class);
	private MethodKey _unapproveAnswerMethodKey6 = new MethodKey(_classLoaderProxy.getClassName(),
			"unapproveAnswer", long.class, long.class, java.lang.String.class);
	private MethodKey _getAnswerMethodKey7 = new MethodKey(_classLoaderProxy.getClassName(),
			"getAnswer", long.class, long.class);
	private MethodKey _countQuestionMethodKey8 = new MethodKey(_classLoaderProxy.getClassName(),
			"countQuestion", long.class);
}