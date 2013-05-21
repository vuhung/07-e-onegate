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
public class FAQQuestionServiceClp implements FAQQuestionService {
	public FAQQuestionServiceClp(ClassLoaderProxy classLoaderProxy) {
		_classLoaderProxy = classLoaderProxy;
	}

	public com.vportal.portlet.vfaq.model.FAQQuestion addQuestion(
		java.lang.String title, java.lang.String content,
		java.lang.String language, int questionOrder, java.util.Date sentDate,
		java.lang.String sentByUser, java.lang.String senderEmail,
		java.lang.String questionType, int hitCount, boolean isApproved,
		long plid, long userId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		Object returnObj = null;

		MethodHandler methodHandler = new MethodHandler(_addQuestionMethodKey0,
				title, content, language, questionOrder, sentDate, sentByUser,
				senderEmail, questionType, hitCount, isApproved, plid, userId);

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

		return (com.vportal.portlet.vfaq.model.FAQQuestion)ClpSerializer.translateOutput(returnObj);
	}

	public com.vportal.portlet.vfaq.model.FAQQuestion addQuestion(
		java.lang.String title, java.lang.String content,
		java.lang.String language, int questionOrder, java.util.Date sentDate,
		java.lang.String sentByUser, java.lang.String senderEmail,
		java.lang.String questionType, int hitCount, boolean isApproved,
		long plid, long userId, boolean addCommunityPermissions,
		boolean addGuestPermissions)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		Object returnObj = null;

		MethodHandler methodHandler = new MethodHandler(_addQuestionMethodKey1,
				title, content, language, questionOrder, sentDate, sentByUser,
				senderEmail, questionType, hitCount, isApproved, plid, userId,
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

		return (com.vportal.portlet.vfaq.model.FAQQuestion)ClpSerializer.translateOutput(returnObj);
	}

	public com.vportal.portlet.vfaq.model.FAQQuestion addQuestion(
		java.lang.String title, java.lang.String content,
		java.lang.String language, int questionOrder, java.util.Date sentDate,
		java.lang.String sentByUser, java.lang.String senderEmail,
		java.lang.String questionType, int hitCount, boolean isApproved,
		long plid, long userId, java.lang.String[] communityPermissions,
		java.lang.String[] guestPermissions)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		Object returnObj = null;

		MethodHandler methodHandler = new MethodHandler(_addQuestionMethodKey2,
				title, content, language, questionOrder, sentDate, sentByUser,
				senderEmail, questionType, hitCount, isApproved, plid, userId,
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

		return (com.vportal.portlet.vfaq.model.FAQQuestion)ClpSerializer.translateOutput(returnObj);
	}

	public com.vportal.portlet.vfaq.model.FAQQuestion updateQuestion(
		long questionId, java.lang.String title, java.lang.String content,
		java.lang.String language, int questionOrder,
		java.util.Date modifiedDate, java.lang.String modifiedByUser,
		java.lang.String questionType, int hitCount, boolean isApproved,
		long groupId, long userId, java.lang.String senderEmail,
		java.lang.String sentByUser)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		Object returnObj = null;

		MethodHandler methodHandler = new MethodHandler(_updateQuestionMethodKey3,
				questionId, title, content, language, questionOrder,
				modifiedDate, modifiedByUser, questionType, hitCount,
				isApproved, groupId, userId, senderEmail, sentByUser);

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

		return (com.vportal.portlet.vfaq.model.FAQQuestion)ClpSerializer.translateOutput(returnObj);
	}

	public void deleteQuestion(long groupId, long questionId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		MethodHandler methodHandler = new MethodHandler(_deleteQuestionMethodKey4,
				groupId, questionId);

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

	public com.vportal.portlet.vfaq.model.FAQQuestion unapproveQuestion(
		long groupId, long questionId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		Object returnObj = null;

		MethodHandler methodHandler = new MethodHandler(_unapproveQuestionMethodKey5,
				groupId, questionId);

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

		return (com.vportal.portlet.vfaq.model.FAQQuestion)ClpSerializer.translateOutput(returnObj);
	}

	public com.vportal.portlet.vfaq.model.FAQQuestion approveQuestion(
		long groupId, long questionId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		Object returnObj = null;

		MethodHandler methodHandler = new MethodHandler(_approveQuestionMethodKey6,
				groupId, questionId);

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

		return (com.vportal.portlet.vfaq.model.FAQQuestion)ClpSerializer.translateOutput(returnObj);
	}

	public com.vportal.portlet.vfaq.model.FAQQuestion getQuestion(
		long groupId, long questionId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		Object returnObj = null;

		MethodHandler methodHandler = new MethodHandler(_getQuestionMethodKey7,
				groupId, questionId);

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

		return (com.vportal.portlet.vfaq.model.FAQQuestion)ClpSerializer.translateOutput(returnObj);
	}

	public java.util.List getQuestionApproveByCategory(long groupId,
		java.lang.String language, long categoryId, java.lang.String title,
		int begin, int end, boolean approved)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.rmi.RemoteException {
		Object returnObj = null;

		MethodHandler methodHandler = new MethodHandler(_getQuestionApproveByCategoryMethodKey8,
				groupId, language, categoryId, title, begin, end, approved);

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

			if (t instanceof java.rmi.RemoteException) {
				throw (java.rmi.RemoteException)t;
			}

			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}

		return (java.util.List)ClpSerializer.translateOutput(returnObj);
	}

	public java.util.List getQuestionApproveByCategory(long groupId,
		java.lang.String language, long categoryId, java.lang.String title,
		boolean approved)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.rmi.RemoteException {
		Object returnObj = null;

		MethodHandler methodHandler = new MethodHandler(_getQuestionApproveByCategoryMethodKey9,
				groupId, language, categoryId, title, approved);

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

			if (t instanceof java.rmi.RemoteException) {
				throw (java.rmi.RemoteException)t;
			}

			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}

		return (java.util.List)ClpSerializer.translateOutput(returnObj);
	}

	public int countQuestionApproveByCategory(long groupId,
		java.lang.String language, long categoryId, java.lang.String title,
		boolean approved)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.rmi.RemoteException {
		Object returnObj = null;

		MethodHandler methodHandler = new MethodHandler(_countQuestionApproveByCategoryMethodKey10,
				groupId, language, categoryId, title, approved);

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

			if (t instanceof java.rmi.RemoteException) {
				throw (java.rmi.RemoteException)t;
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

	public java.util.List getQuestionByParam(long groupId,
		java.lang.String language, long categoryId, java.lang.String title,
		boolean approved, int start, int end)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.rmi.RemoteException {
		Object returnObj = null;

		MethodHandler methodHandler = new MethodHandler(_getQuestionByParamMethodKey11,
				groupId, language, categoryId, title, approved, start, end);

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

			if (t instanceof java.rmi.RemoteException) {
				throw (java.rmi.RemoteException)t;
			}

			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}

		return (java.util.List)ClpSerializer.translateOutput(returnObj);
	}

	public java.util.List getOrtherQuestionByParam(long groupId,
		java.lang.String language, long Id, long categoryId, boolean approved,
		int start, int end)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.rmi.RemoteException {
		Object returnObj = null;

		MethodHandler methodHandler = new MethodHandler(_getOrtherQuestionByParamMethodKey12,
				groupId, language, Id, categoryId, approved, start, end);

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

			if (t instanceof java.rmi.RemoteException) {
				throw (java.rmi.RemoteException)t;
			}

			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}

		return (java.util.List)ClpSerializer.translateOutput(returnObj);
	}

	public int countQuestionByParam(long groupId, java.lang.String language,
		long categoryId, java.lang.String title, boolean approved)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.rmi.RemoteException {
		Object returnObj = null;

		MethodHandler methodHandler = new MethodHandler(_countQuestionByParamMethodKey13,
				groupId, language, categoryId, title, approved);

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

			if (t instanceof java.rmi.RemoteException) {
				throw (java.rmi.RemoteException)t;
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

	public java.util.List getQuestionByG_L_S(long groupId,
		java.lang.String language, boolean approved, int start, int end)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.rmi.RemoteException {
		Object returnObj = null;

		MethodHandler methodHandler = new MethodHandler(_getQuestionByG_L_SMethodKey14,
				groupId, language, approved, start, end);

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

			if (t instanceof java.rmi.RemoteException) {
				throw (java.rmi.RemoteException)t;
			}

			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}

		return (java.util.List)ClpSerializer.translateOutput(returnObj);
	}

	public int countQuestionByG_L_S(long groupId, java.lang.String language,
		boolean approved)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.rmi.RemoteException {
		Object returnObj = null;

		MethodHandler methodHandler = new MethodHandler(_countQuestionByG_L_SMethodKey15,
				groupId, language, approved);

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

			if (t instanceof java.rmi.RemoteException) {
				throw (java.rmi.RemoteException)t;
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

	public com.vportal.portlet.vfaq.model.FAQQuestion findByPrimaryKey(long id)
		throws java.lang.Exception {
		Object returnObj = null;

		MethodHandler methodHandler = new MethodHandler(_findByPrimaryKeyMethodKey16,
				id);

		try {
			returnObj = _classLoaderProxy.invoke(methodHandler);
		}
		catch (Throwable t) {
			if (t instanceof java.lang.Exception) {
				throw (java.lang.Exception)t;
			}

			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}

		return (com.vportal.portlet.vfaq.model.FAQQuestion)ClpSerializer.translateOutput(returnObj);
	}

	public void reIndex(java.lang.String[] ids)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.rmi.RemoteException {
		MethodHandler methodHandler = new MethodHandler(_reIndexMethodKey17, ids);

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

			if (t instanceof java.rmi.RemoteException) {
				throw (java.rmi.RemoteException)t;
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

	public com.liferay.portal.kernel.search.Hits search(long companyId,
		long groupId, long userId, java.lang.String keywords, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		Object returnObj = null;

		MethodHandler methodHandler = new MethodHandler(_searchMethodKey18,
				companyId, groupId, userId, keywords, start, end);

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

		return (com.liferay.portal.kernel.search.Hits)ClpSerializer.translateOutput(returnObj);
	}

	public ClassLoaderProxy getClassLoaderProxy() {
		return _classLoaderProxy;
	}

	private ClassLoaderProxy _classLoaderProxy;
	private MethodKey _addQuestionMethodKey0 = new MethodKey(_classLoaderProxy.getClassName(),
			"addQuestion", java.lang.String.class, java.lang.String.class,
			java.lang.String.class, int.class, java.util.Date.class,
			java.lang.String.class, java.lang.String.class,
			java.lang.String.class, int.class, boolean.class, long.class,
			long.class);
	private MethodKey _addQuestionMethodKey1 = new MethodKey(_classLoaderProxy.getClassName(),
			"addQuestion", java.lang.String.class, java.lang.String.class,
			java.lang.String.class, int.class, java.util.Date.class,
			java.lang.String.class, java.lang.String.class,
			java.lang.String.class, int.class, boolean.class, long.class,
			long.class, boolean.class, boolean.class);
	private MethodKey _addQuestionMethodKey2 = new MethodKey(_classLoaderProxy.getClassName(),
			"addQuestion", java.lang.String.class, java.lang.String.class,
			java.lang.String.class, int.class, java.util.Date.class,
			java.lang.String.class, java.lang.String.class,
			java.lang.String.class, int.class, boolean.class, long.class,
			long.class, java.lang.String[].class, java.lang.String[].class);
	private MethodKey _updateQuestionMethodKey3 = new MethodKey(_classLoaderProxy.getClassName(),
			"updateQuestion", long.class, java.lang.String.class,
			java.lang.String.class, java.lang.String.class, int.class,
			java.util.Date.class, java.lang.String.class,
			java.lang.String.class, int.class, boolean.class, long.class,
			long.class, java.lang.String.class, java.lang.String.class);
	private MethodKey _deleteQuestionMethodKey4 = new MethodKey(_classLoaderProxy.getClassName(),
			"deleteQuestion", long.class, long.class);
	private MethodKey _unapproveQuestionMethodKey5 = new MethodKey(_classLoaderProxy.getClassName(),
			"unapproveQuestion", long.class, long.class);
	private MethodKey _approveQuestionMethodKey6 = new MethodKey(_classLoaderProxy.getClassName(),
			"approveQuestion", long.class, long.class);
	private MethodKey _getQuestionMethodKey7 = new MethodKey(_classLoaderProxy.getClassName(),
			"getQuestion", long.class, long.class);
	private MethodKey _getQuestionApproveByCategoryMethodKey8 = new MethodKey(_classLoaderProxy.getClassName(),
			"getQuestionApproveByCategory", long.class, java.lang.String.class,
			long.class, java.lang.String.class, int.class, int.class,
			boolean.class);
	private MethodKey _getQuestionApproveByCategoryMethodKey9 = new MethodKey(_classLoaderProxy.getClassName(),
			"getQuestionApproveByCategory", long.class, java.lang.String.class,
			long.class, java.lang.String.class, boolean.class);
	private MethodKey _countQuestionApproveByCategoryMethodKey10 = new MethodKey(_classLoaderProxy.getClassName(),
			"countQuestionApproveByCategory", long.class,
			java.lang.String.class, long.class, java.lang.String.class,
			boolean.class);
	private MethodKey _getQuestionByParamMethodKey11 = new MethodKey(_classLoaderProxy.getClassName(),
			"getQuestionByParam", long.class, java.lang.String.class,
			long.class, java.lang.String.class, boolean.class, int.class,
			int.class);
	private MethodKey _getOrtherQuestionByParamMethodKey12 = new MethodKey(_classLoaderProxy.getClassName(),
			"getOrtherQuestionByParam", long.class, java.lang.String.class,
			long.class, long.class, boolean.class, int.class, int.class);
	private MethodKey _countQuestionByParamMethodKey13 = new MethodKey(_classLoaderProxy.getClassName(),
			"countQuestionByParam", long.class, java.lang.String.class,
			long.class, java.lang.String.class, boolean.class);
	private MethodKey _getQuestionByG_L_SMethodKey14 = new MethodKey(_classLoaderProxy.getClassName(),
			"getQuestionByG_L_S", long.class, java.lang.String.class,
			boolean.class, int.class, int.class);
	private MethodKey _countQuestionByG_L_SMethodKey15 = new MethodKey(_classLoaderProxy.getClassName(),
			"countQuestionByG_L_S", long.class, java.lang.String.class,
			boolean.class);
	private MethodKey _findByPrimaryKeyMethodKey16 = new MethodKey(_classLoaderProxy.getClassName(),
			"findByPrimaryKey", long.class);
	private MethodKey _reIndexMethodKey17 = new MethodKey(_classLoaderProxy.getClassName(),
			"reIndex", java.lang.String[].class);
	private MethodKey _searchMethodKey18 = new MethodKey(_classLoaderProxy.getClassName(),
			"search", long.class, long.class, long.class,
			java.lang.String.class, int.class, int.class);
}