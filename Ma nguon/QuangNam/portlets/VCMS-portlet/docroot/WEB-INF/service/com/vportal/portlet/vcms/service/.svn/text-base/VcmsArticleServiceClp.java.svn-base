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

package com.vportal.portlet.vcms.service;

import com.liferay.portal.kernel.util.ClassLoaderProxy;
import com.liferay.portal.kernel.util.MethodHandler;
import com.liferay.portal.kernel.util.MethodKey;

/**
 * @author HOAN
 */
public class VcmsArticleServiceClp implements VcmsArticleService {
	public VcmsArticleServiceClp(ClassLoaderProxy classLoaderProxy) {
		_classLoaderProxy = classLoaderProxy;
	}

	public com.vportal.portlet.vcms.model.VcmsArticle addArticle(
		javax.portlet.ActionRequest req,
		com.liferay.portal.kernel.upload.UploadPortletRequest upRequest,
		long groupId, long companyId, long plid, java.lang.String title,
		java.lang.String lead, java.lang.String content, boolean hasImage,
		java.lang.String imageTitle, java.lang.String image,
		java.lang.String language, boolean hasAttachment, boolean hasPoll,
		java.lang.String pollId, long status, java.lang.String author,
		java.lang.String source, java.lang.String[] communityPermissions,
		java.lang.String[] guestPermissions)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.rmi.RemoteException {
		Object returnObj = null;

		MethodHandler methodHandler = new MethodHandler(_addArticleMethodKey0,
				req, upRequest, groupId, companyId, plid, title, lead, content,
				hasImage, imageTitle, image, language, hasAttachment, hasPoll,
				pollId, status, author, source, communityPermissions,
				guestPermissions);

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

		return (com.vportal.portlet.vcms.model.VcmsArticle)ClpSerializer.translateOutput(returnObj);
	}

	public com.vportal.portlet.vcms.model.VcmsArticle addArticle(
		javax.portlet.ActionRequest req,
		com.liferay.portal.kernel.upload.UploadPortletRequest upRequest,
		long groupId, long companyId, long plid, java.lang.String title,
		java.lang.String lead, java.lang.String content, boolean hasImage,
		java.lang.String imageTitle, java.lang.String image,
		java.lang.String language, boolean hasAttachment, boolean hasPoll,
		java.lang.String pollId, long status, java.lang.String author,
		java.lang.String source, java.lang.Boolean addCommunityPermissions,
		java.lang.Boolean addGuestPermissions,
		java.lang.String[] communityPermissions,
		java.lang.String[] guestPermissions)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.rmi.RemoteException {
		Object returnObj = null;

		MethodHandler methodHandler = new MethodHandler(_addArticleMethodKey1,
				req, upRequest, groupId, companyId, plid, title, lead, content,
				hasImage, imageTitle, image, language, hasAttachment, hasPoll,
				pollId, status, author, source, addCommunityPermissions,
				addGuestPermissions, communityPermissions, guestPermissions);

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

		return (com.vportal.portlet.vcms.model.VcmsArticle)ClpSerializer.translateOutput(returnObj);
	}

	public void addArticleResources(java.lang.String articleId,
		boolean addCommunityPermissions, boolean addGuestPermissions)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		MethodHandler methodHandler = new MethodHandler(_addArticleResourcesMethodKey2,
				articleId, addCommunityPermissions, addGuestPermissions);

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

	public void addArticleResources(
		com.vportal.portlet.vcms.model.VcmsArticle article,
		boolean addCommunityPermissions, boolean addGuestPermissions)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		MethodHandler methodHandler = new MethodHandler(_addArticleResourcesMethodKey3,
				article, addCommunityPermissions, addGuestPermissions);

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

	public void addArticleResources(java.lang.String articleId,
		java.lang.String[] communityPermissions,
		java.lang.String[] guestPermissions)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		MethodHandler methodHandler = new MethodHandler(_addArticleResourcesMethodKey4,
				articleId, communityPermissions, guestPermissions);

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

	public void addArticleResources(
		com.vportal.portlet.vcms.model.VcmsArticle article,
		java.lang.String[] communityPermissions,
		java.lang.String[] guestPermissions)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		MethodHandler methodHandler = new MethodHandler(_addArticleResourcesMethodKey5,
				article, communityPermissions, guestPermissions);

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

	public com.vportal.portlet.vcms.model.VcmsArticle updateArticle(
		javax.portlet.ActionRequest req,
		com.liferay.portal.kernel.upload.UploadPortletRequest upRequest,
		long groupId, long companyId, java.lang.String articleId, long status,
		java.lang.String title, java.lang.String lead,
		java.lang.String content, boolean hasImage,
		java.lang.String imageTitle, java.lang.String image,
		java.lang.String language, boolean discussible, boolean hasAttachment,
		boolean hasPoll, java.lang.String pollId, boolean sticky,
		boolean stickyNeverExpired, java.util.Date stickyExpireDate)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.rmi.RemoteException {
		Object returnObj = null;

		MethodHandler methodHandler = new MethodHandler(_updateArticleMethodKey6,
				req, upRequest, groupId, companyId, articleId, status, title,
				lead, content, hasImage, imageTitle, image, language,
				discussible, hasAttachment, hasPoll, pollId, sticky,
				stickyNeverExpired, stickyExpireDate);

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

		return (com.vportal.portlet.vcms.model.VcmsArticle)ClpSerializer.translateOutput(returnObj);
	}

	public com.vportal.portlet.vcms.model.VcmsArticle updateArticle(
		javax.portlet.ActionRequest req,
		com.liferay.portal.kernel.upload.UploadPortletRequest upRequest,
		com.vportal.portlet.vcms.model.VcmsArticle article)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.rmi.RemoteException {
		Object returnObj = null;

		MethodHandler methodHandler = new MethodHandler(_updateArticleMethodKey7,
				req, upRequest, article);

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

		return (com.vportal.portlet.vcms.model.VcmsArticle)ClpSerializer.translateOutput(returnObj);
	}

	public com.vportal.portlet.vcms.model.VcmsArticle updateArticle(
		com.vportal.portlet.vcms.model.VcmsArticle article,
		com.liferay.portal.kernel.upload.UploadPortletRequest upRequest)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.rmi.RemoteException {
		Object returnObj = null;

		MethodHandler methodHandler = new MethodHandler(_updateArticleMethodKey8,
				article, upRequest);

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

		return (com.vportal.portlet.vcms.model.VcmsArticle)ClpSerializer.translateOutput(returnObj);
	}

	public void deleteArticle(java.lang.String articleId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.rmi.RemoteException {
		MethodHandler methodHandler = new MethodHandler(_deleteArticleMethodKey9,
				articleId);

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

	public void deleteArticles(java.lang.String[] articleIds)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.rmi.RemoteException {
		MethodHandler methodHandler = new MethodHandler(_deleteArticlesMethodKey10,
				articleIds);

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

	public com.vportal.portlet.vcms.model.VcmsArticle getArticle(
		java.lang.String articleId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.rmi.RemoteException {
		Object returnObj = null;

		MethodHandler methodHandler = new MethodHandler(_getArticleMethodKey11,
				articleId);

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

		return (com.vportal.portlet.vcms.model.VcmsArticle)ClpSerializer.translateOutput(returnObj);
	}

	public java.util.List getArticles(java.lang.String[] articleIds)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.rmi.RemoteException {
		Object returnObj = null;

		MethodHandler methodHandler = new MethodHandler(_getArticlesMethodKey12,
				articleIds);

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

	public java.util.List getArticlesByU_L_S(long groupId,
		java.lang.String userId, int status, java.lang.String language)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.rmi.RemoteException {
		Object returnObj = null;

		MethodHandler methodHandler = new MethodHandler(_getArticlesByU_L_SMethodKey13,
				groupId, userId, status, language);

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

	public java.util.List getArticlesByU_L_S(long groupId,
		java.lang.String userId, int status, java.lang.String language,
		com.liferay.portal.kernel.util.OrderByComparator obc)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.rmi.RemoteException {
		Object returnObj = null;

		MethodHandler methodHandler = new MethodHandler(_getArticlesByU_L_SMethodKey14,
				groupId, userId, status, language, obc);

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

	public java.util.List getArticlesByL_S(long groupId,
		java.lang.String language, long statusId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.rmi.RemoteException {
		Object returnObj = null;

		MethodHandler methodHandler = new MethodHandler(_getArticlesByL_SMethodKey15,
				groupId, language, statusId);

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

	public java.util.List getArticlesByL_S(long groupId,
		java.lang.String language, long statusId, int start, int end)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.rmi.RemoteException {
		Object returnObj = null;

		MethodHandler methodHandler = new MethodHandler(_getArticlesByL_SMethodKey16,
				groupId, language, statusId, start, end);

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

	public int countArticlesByL_S(long groupId, java.lang.String language,
		long statusId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.rmi.RemoteException {
		Object returnObj = null;

		MethodHandler methodHandler = new MethodHandler(_countArticlesByL_SMethodKey17,
				groupId, language, statusId);

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

	public java.util.List getArticlesByG_L_S_U(long groupId,
		java.lang.String language, long statusId,
		java.lang.String createdByUser, int start, int end)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.rmi.RemoteException {
		Object returnObj = null;

		MethodHandler methodHandler = new MethodHandler(_getArticlesByG_L_S_UMethodKey18,
				groupId, language, statusId, createdByUser, start, end);

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

	public int countArticlesByG_L_S_U(long groupId, java.lang.String language,
		long statusId, java.lang.String createdByUser)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.rmi.RemoteException {
		Object returnObj = null;

		MethodHandler methodHandler = new MethodHandler(_countArticlesByG_L_S_UMethodKey19,
				groupId, language, statusId, createdByUser);

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

	public java.util.List getArticlesByL_S(long groupId,
		java.lang.String language, int status,
		com.liferay.portal.kernel.util.OrderByComparator obc)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.rmi.RemoteException {
		Object returnObj = null;

		MethodHandler methodHandler = new MethodHandler(_getArticlesByL_SMethodKey20,
				groupId, language, status, obc);

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

	public java.util.List getArticlesByL_S_S(long groupId,
		java.lang.String language, long statusId, boolean sticky)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.rmi.RemoteException {
		Object returnObj = null;

		MethodHandler methodHandler = new MethodHandler(_getArticlesByL_S_SMethodKey21,
				groupId, language, statusId, sticky);

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

	public java.util.List getArticlesNewByL_S_S(long groupId,
		java.lang.String language, long statusId, boolean sticky, int end)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.rmi.RemoteException {
		Object returnObj = null;

		MethodHandler methodHandler = new MethodHandler(_getArticlesNewByL_S_SMethodKey22,
				groupId, language, statusId, sticky, end);

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

	public int countArticlesByL_S_S(long groupId, java.lang.String language,
		long statusId, boolean sticky)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.rmi.RemoteException {
		Object returnObj = null;

		MethodHandler methodHandler = new MethodHandler(_countArticlesByL_S_SMethodKey23,
				groupId, language, statusId, sticky);

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

	public java.util.List getArticlesByL_S_S(long groupId,
		java.lang.String language, int statusId, boolean sticky,
		com.liferay.portal.kernel.util.OrderByComparator obc)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.rmi.RemoteException {
		Object returnObj = null;

		MethodHandler methodHandler = new MethodHandler(_getArticlesByL_S_SMethodKey24,
				groupId, language, statusId, sticky, obc);

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

	public java.util.List getArticleByP_L_S_D(long groupId,
		java.lang.String language, long statusId, boolean discussible)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.rmi.RemoteException {
		Object returnObj = null;

		MethodHandler methodHandler = new MethodHandler(_getArticleByP_L_S_DMethodKey25,
				groupId, language, statusId, discussible);

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

	public java.util.List getArticleByC_P_L_S(java.lang.String categoryId,
		long groupId, java.lang.String language, long statusId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.rmi.RemoteException {
		Object returnObj = null;

		MethodHandler methodHandler = new MethodHandler(_getArticleByC_P_L_SMethodKey26,
				categoryId, groupId, language, statusId);

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

	public java.util.List getArticleByC_P_L_S(java.lang.String categoryId,
		long groupId, java.lang.String language, long statusId, int start,
		int end)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.rmi.RemoteException {
		Object returnObj = null;

		MethodHandler methodHandler = new MethodHandler(_getArticleByC_P_L_SMethodKey27,
				categoryId, groupId, language, statusId, start, end);

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

	public int countArticleByC_P_L_S(java.lang.String categoryId, long groupId,
		java.lang.String language, long statusId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.rmi.RemoteException {
		Object returnObj = null;

		MethodHandler methodHandler = new MethodHandler(_countArticleByC_P_L_SMethodKey28,
				categoryId, groupId, language, statusId);

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

	public java.util.List getArticleByP_P_L_S(java.lang.String portionId,
		long groupId, java.lang.String language, long statusId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.rmi.RemoteException {
		Object returnObj = null;

		MethodHandler methodHandler = new MethodHandler(_getArticleByP_P_L_SMethodKey29,
				portionId, groupId, language, statusId);

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

	public int countArticleByP_P_L_S(java.lang.String portionId, long groupId,
		java.lang.String language, long statusId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.rmi.RemoteException {
		Object returnObj = null;

		MethodHandler methodHandler = new MethodHandler(_countArticleByP_P_L_SMethodKey30,
				portionId, groupId, language, statusId);

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

	public java.util.List getArticleByP_P_L_S(java.lang.String portionId,
		long groupId, java.lang.String language, long statusId, int start,
		int end)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.rmi.RemoteException {
		Object returnObj = null;

		MethodHandler methodHandler = new MethodHandler(_getArticleByP_P_L_SMethodKey31,
				portionId, groupId, language, statusId, start, end);

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

	public java.util.List getArticleByT_P_L_S(java.lang.String threadId,
		long groupId, java.lang.String language, long statusId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.rmi.RemoteException {
		Object returnObj = null;

		MethodHandler methodHandler = new MethodHandler(_getArticleByT_P_L_SMethodKey32,
				threadId, groupId, language, statusId);

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

	public java.util.List getArticleByT_P_L_S(java.lang.String threadId,
		long groupId, java.lang.String language, long statusId, int start,
		int end)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.rmi.RemoteException {
		Object returnObj = null;

		MethodHandler methodHandler = new MethodHandler(_getArticleByT_P_L_SMethodKey33,
				threadId, groupId, language, statusId, start, end);

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

	public int countArticleByT_P_L_S(java.lang.String threadId, long groupId,
		java.lang.String language, long statusId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.rmi.RemoteException {
		Object returnObj = null;

		MethodHandler methodHandler = new MethodHandler(_countArticleByT_P_L_SMethodKey34,
				threadId, groupId, language, statusId);

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

	public int countByStatus(long groupId, java.lang.String language,
		long statusId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.rmi.RemoteException {
		Object returnObj = null;

		MethodHandler methodHandler = new MethodHandler(_countByStatusMethodKey35,
				groupId, language, statusId);

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

	public int countByStatus(long statusId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.rmi.RemoteException {
		Object returnObj = null;

		MethodHandler methodHandler = new MethodHandler(_countByStatusMethodKey36,
				statusId);

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

	public java.util.List getTopNewArticles(long groupId,
		java.lang.String language, java.lang.String portionId,
		java.lang.String categoryId, long statusId, int quantity)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.rmi.RemoteException {
		Object returnObj = null;

		MethodHandler methodHandler = new MethodHandler(_getTopNewArticlesMethodKey37,
				groupId, language, portionId, categoryId, statusId, quantity);

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

	public java.util.List getHotNewArticles(long groupId,
		java.lang.String language, java.lang.String portionId,
		java.lang.String categoryId, long statusId, int quantity)
		throws com.liferay.portal.kernel.exception.SystemException {
		Object returnObj = null;

		MethodHandler methodHandler = new MethodHandler(_getHotNewArticlesMethodKey38,
				groupId, language, portionId, categoryId, statusId, quantity);

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

		return (java.util.List)ClpSerializer.translateOutput(returnObj);
	}

	public java.util.List getTopNewArticles(long groupId,
		java.lang.String language, java.lang.String portionId,
		java.lang.String categoryId, long statusId, boolean sticky, int quantity)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.rmi.RemoteException {
		Object returnObj = null;

		MethodHandler methodHandler = new MethodHandler(_getTopNewArticlesMethodKey39,
				groupId, language, portionId, categoryId, statusId, sticky,
				quantity);

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

	public java.util.List getTopNewArticles(long groupId,
		java.lang.String language, long statusId, boolean sticky, int quantity)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.rmi.RemoteException {
		Object returnObj = null;

		MethodHandler methodHandler = new MethodHandler(_getTopNewArticlesMethodKey40,
				groupId, language, statusId, sticky, quantity);

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

	public java.util.List getTopNewArticles(long groupId,
		java.lang.String language, java.lang.String categoryId, long statusId,
		boolean sticky, int quantity)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.rmi.RemoteException {
		Object returnObj = null;

		MethodHandler methodHandler = new MethodHandler(_getTopNewArticlesMethodKey41,
				groupId, language, categoryId, statusId, sticky, quantity);

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

	public java.util.List getTopNewArticles(long groupId,
		java.lang.String language, java.lang.String categoryId, long statusId,
		int quantity, com.liferay.portal.kernel.util.OrderByComparator obc)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.rmi.RemoteException {
		Object returnObj = null;

		MethodHandler methodHandler = new MethodHandler(_getTopNewArticlesMethodKey42,
				groupId, language, categoryId, statusId, quantity, obc);

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

	public java.util.List getAllCategoryArticles(long groupId,
		java.lang.String language, java.lang.String categoryId, long statusId,
		int begin, int end)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.rmi.RemoteException {
		Object returnObj = null;

		MethodHandler methodHandler = new MethodHandler(_getAllCategoryArticlesMethodKey43,
				groupId, language, categoryId, statusId, begin, end);

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

	public int countAllCategoryArticles(long groupId,
		java.lang.String language, java.lang.String categoryId, long statusId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.rmi.RemoteException {
		Object returnObj = null;

		MethodHandler methodHandler = new MethodHandler(_countAllCategoryArticlesMethodKey44,
				groupId, language, categoryId, statusId);

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

	public java.util.List getArticlesInThread(long groupId,
		java.lang.String language, java.lang.String threadId, long statusId)
		throws com.liferay.portal.kernel.exception.SystemException,
			java.rmi.RemoteException {
		Object returnObj = null;

		MethodHandler methodHandler = new MethodHandler(_getArticlesInThreadMethodKey45,
				groupId, language, threadId, statusId);

		try {
			returnObj = _classLoaderProxy.invoke(methodHandler);
		}
		catch (Throwable t) {
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

	public java.util.List getArticlesInThread(long groupId,
		java.lang.String language, java.lang.String threadId, long statusId,
		int quantity)
		throws com.liferay.portal.kernel.exception.SystemException,
			java.rmi.RemoteException {
		Object returnObj = null;

		MethodHandler methodHandler = new MethodHandler(_getArticlesInThreadMethodKey46,
				groupId, language, threadId, statusId, quantity);

		try {
			returnObj = _classLoaderProxy.invoke(methodHandler);
		}
		catch (Throwable t) {
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

	public java.util.List getArticlesInThread(long groupId,
		java.lang.String language, java.lang.String[] threadIds, long statusId,
		int quantity)
		throws com.liferay.portal.kernel.exception.SystemException,
			java.rmi.RemoteException {
		Object returnObj = null;

		MethodHandler methodHandler = new MethodHandler(_getArticlesInThreadMethodKey47,
				groupId, language, threadIds, statusId, quantity);

		try {
			returnObj = _classLoaderProxy.invoke(methodHandler);
		}
		catch (Throwable t) {
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

	public java.util.List getOlderArticles(long groupId,
		java.lang.String language, java.lang.String portionId,
		java.lang.String categoryId, java.lang.String articleId, long statusId,
		int quantity)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.rmi.RemoteException {
		Object returnObj = null;

		MethodHandler methodHandler = new MethodHandler(_getOlderArticlesMethodKey48,
				groupId, language, portionId, categoryId, articleId, statusId,
				quantity);

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

	public java.util.List getNewArticles(long groupId,
		java.lang.String language, java.lang.String portionId,
		java.lang.String categoryId, java.lang.String articleId, long statusId,
		int quantity)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.rmi.RemoteException {
		Object returnObj = null;

		MethodHandler methodHandler = new MethodHandler(_getNewArticlesMethodKey49,
				groupId, language, portionId, categoryId, articleId, statusId,
				quantity);

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

	public int countByC_P_L_S_D(java.lang.String categoryId, long groupId,
		java.lang.String language, long statusId, java.util.Date fromDate,
		java.util.Date toDate, java.lang.String byUser)
		throws com.liferay.portal.kernel.exception.SystemException {
		Object returnObj = null;

		MethodHandler methodHandler = new MethodHandler(_countByC_P_L_S_DMethodKey50,
				categoryId, groupId, language, statusId, fromDate, toDate,
				byUser);

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

	public int countByP_L_S_D(long groupId, java.lang.String language,
		long statusId, java.util.Date fromDate, java.util.Date toDate,
		java.lang.String byUser)
		throws com.liferay.portal.kernel.exception.SystemException {
		Object returnObj = null;

		MethodHandler methodHandler = new MethodHandler(_countByP_L_S_DMethodKey51,
				groupId, language, statusId, fromDate, toDate, byUser);

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

	public java.util.List listReportByDate(long groupId,
		java.lang.String language, long statusId, java.util.Date fromDate,
		java.util.Date toDate, java.lang.String byUser, long typeId, int begin,
		int end) throws com.liferay.portal.kernel.exception.SystemException {
		Object returnObj = null;

		MethodHandler methodHandler = new MethodHandler(_listReportByDateMethodKey52,
				groupId, language, statusId, fromDate, toDate, byUser, typeId,
				begin, end);

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

		return (java.util.List)ClpSerializer.translateOutput(returnObj);
	}

	public java.util.List listReportByDateNotType(long groupId,
		java.lang.String language, long statusId, java.util.Date fromDate,
		java.util.Date toDate, java.lang.String byUser, int begin, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		Object returnObj = null;

		MethodHandler methodHandler = new MethodHandler(_listReportByDateNotTypeMethodKey53,
				groupId, language, statusId, fromDate, toDate, byUser, begin,
				end);

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

		return (java.util.List)ClpSerializer.translateOutput(returnObj);
	}

	public int countByDate(long groupId, java.lang.String language,
		long statusId, java.util.Date fromDate, java.util.Date toDate,
		java.lang.String byUser, long typeId)
		throws com.liferay.portal.kernel.exception.SystemException {
		Object returnObj = null;

		MethodHandler methodHandler = new MethodHandler(_countByDateMethodKey54,
				groupId, language, statusId, fromDate, toDate, byUser, typeId);

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

	public int countByDateNotType(long groupId, java.lang.String language,
		long statusId, java.util.Date fromDate, java.util.Date toDate,
		java.lang.String byUser)
		throws com.liferay.portal.kernel.exception.SystemException {
		Object returnObj = null;

		MethodHandler methodHandler = new MethodHandler(_countByDateNotTypeMethodKey55,
				groupId, language, statusId, fromDate, toDate, byUser);

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

	public java.util.List listArticleByDateTypes(long groupId,
		java.lang.String language, long statusId, java.util.Date fromDate,
		java.util.Date toDate, java.lang.String byUser,
		java.lang.String[] strType, int begin, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		Object returnObj = null;

		MethodHandler methodHandler = new MethodHandler(_listArticleByDateTypesMethodKey56,
				groupId, language, statusId, fromDate, toDate, byUser, strType,
				begin, end);

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

		return (java.util.List)ClpSerializer.translateOutput(returnObj);
	}

	public int countArticleByDateTypes(long groupId, java.lang.String language,
		long statusId, java.util.Date fromDate, java.util.Date toDate,
		java.lang.String byUser, java.lang.String[] strType)
		throws com.liferay.portal.kernel.exception.SystemException {
		Object returnObj = null;

		MethodHandler methodHandler = new MethodHandler(_countArticleByDateTypesMethodKey57,
				groupId, language, statusId, fromDate, toDate, byUser, strType);

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

	public int countByType(long groupId, java.lang.String language,
		long statusId, long typeId, java.util.Date fromDate,
		java.util.Date toDate, java.lang.String byUser)
		throws com.liferay.portal.kernel.exception.SystemException,
			java.rmi.RemoteException {
		Object returnObj = null;

		MethodHandler methodHandler = new MethodHandler(_countByTypeMethodKey58,
				groupId, language, statusId, typeId, fromDate, toDate, byUser);

		try {
			returnObj = _classLoaderProxy.invoke(methodHandler);
		}
		catch (Throwable t) {
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

	public int countByUser(long groupId, java.lang.String language,
		java.lang.String categoryId, long statusId, long typeId,
		java.util.Date fromDate, java.util.Date toDate, java.lang.String byUser)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.rmi.RemoteException {
		Object returnObj = null;

		MethodHandler methodHandler = new MethodHandler(_countByUserMethodKey59,
				groupId, language, categoryId, statusId, typeId, fromDate,
				toDate, byUser);

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

	public int countArticleNotInType(long groupId, java.lang.String language,
		java.lang.String categoryId, long statusId, java.util.Date fromDate,
		java.util.Date toDate, java.lang.String byUser)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.rmi.RemoteException {
		Object returnObj = null;

		MethodHandler methodHandler = new MethodHandler(_countArticleNotInTypeMethodKey60,
				groupId, language, categoryId, statusId, fromDate, toDate,
				byUser);

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

	public int countArticleAllCatNotInType(long groupId,
		java.lang.String language, long statusId, java.util.Date fromDate,
		java.util.Date toDate, java.lang.String byUser)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.rmi.RemoteException {
		Object returnObj = null;

		MethodHandler methodHandler = new MethodHandler(_countArticleAllCatNotInTypeMethodKey61,
				groupId, language, statusId, fromDate, toDate, byUser);

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

	public java.util.List getArticlesBySearchContainer(
		java.lang.String keyword, long groupId, java.lang.String language,
		java.lang.String portionId, java.lang.String parentId, boolean isTitle,
		boolean isLead, boolean isContent, boolean isDate,
		java.util.Date fromDate, java.util.Date toDate, long statusId,
		java.lang.String select)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.rmi.RemoteException {
		Object returnObj = null;

		MethodHandler methodHandler = new MethodHandler(_getArticlesBySearchContainerMethodKey62,
				keyword, groupId, language, portionId, parentId, isTitle,
				isLead, isContent, isDate, fromDate, toDate, statusId, select);

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

	public java.util.List getArticlesBySearchContainer(
		java.lang.String keyword, long groupId, java.lang.String language,
		java.lang.String portionId, java.lang.String parentId, long typeId,
		boolean isTitle, boolean isLead, boolean isContent, boolean isDate,
		java.util.Date fromDate, java.util.Date toDate, long statusId,
		java.lang.String select, int start, int end)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.rmi.RemoteException {
		Object returnObj = null;

		MethodHandler methodHandler = new MethodHandler(_getArticlesBySearchContainerMethodKey63,
				keyword, groupId, language, portionId, parentId, typeId,
				isTitle, isLead, isContent, isDate, fromDate, toDate, statusId,
				select, start, end);

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

	public int countArticlesBySearchContainer(java.lang.String keyword,
		long groupId, java.lang.String language, java.lang.String portionId,
		java.lang.String parentId, long typeId, boolean isTitle,
		boolean isLead, boolean isContent, boolean isDate,
		java.util.Date fromDate, java.util.Date toDate, long statusId,
		java.lang.String select)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.rmi.RemoteException {
		Object returnObj = null;

		MethodHandler methodHandler = new MethodHandler(_countArticlesBySearchContainerMethodKey64,
				keyword, groupId, language, portionId, parentId, typeId,
				isTitle, isLead, isContent, isDate, fromDate, toDate, statusId,
				select);

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

	public java.util.List getArticlesBySearchContainer_T(
		java.lang.String categoryId, long typeId, java.lang.String keyword,
		long groupId, java.lang.String language, java.lang.String threadId,
		boolean isTitle, boolean isLead, boolean isContent, boolean isDate,
		java.util.Date fromDate, java.util.Date toDate, long statusId,
		java.lang.String select, int start, int end)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.rmi.RemoteException {
		Object returnObj = null;

		MethodHandler methodHandler = new MethodHandler(_getArticlesBySearchContainer_TMethodKey65,
				categoryId, typeId, keyword, groupId, language, threadId,
				isTitle, isLead, isContent, isDate, fromDate, toDate, statusId,
				select, start, end);

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

	public int countArticlesBySearchContainer_T(java.lang.String categoryId,
		long typeId, java.lang.String keyword, long groupId,
		java.lang.String language, java.lang.String threadId, boolean isTitle,
		boolean isLead, boolean isContent, boolean isDate,
		java.util.Date fromDate, java.util.Date toDate, long statusId,
		java.lang.String select)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.rmi.RemoteException {
		Object returnObj = null;

		MethodHandler methodHandler = new MethodHandler(_countArticlesBySearchContainer_TMethodKey66,
				categoryId, typeId, keyword, groupId, language, threadId,
				isTitle, isLead, isContent, isDate, fromDate, toDate, statusId,
				select);

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

	public java.util.List getArticleByG_L_C_S_T(long groupId,
		java.lang.String language, java.lang.String categoryId, long statusId,
		long typeId, int begin, int end)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.rmi.RemoteException {
		Object returnObj = null;

		MethodHandler methodHandler = new MethodHandler(_getArticleByG_L_C_S_TMethodKey67,
				groupId, language, categoryId, statusId, typeId, begin, end);

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

	public int countArticleByG_L_C_S_T(long groupId, java.lang.String language,
		java.lang.String categoryId, long statusId, long typeId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.rmi.RemoteException {
		Object returnObj = null;

		MethodHandler methodHandler = new MethodHandler(_countArticleByG_L_C_S_TMethodKey68,
				groupId, language, categoryId, statusId, typeId);

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

	public java.util.List getArticleByG_L_S_T(long groupId,
		java.lang.String language, long statusId, long typeId, int begin,
		int end)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.rmi.RemoteException {
		Object returnObj = null;

		MethodHandler methodHandler = new MethodHandler(_getArticleByG_L_S_TMethodKey69,
				groupId, language, statusId, typeId, begin, end);

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

	public int countArticleByG_L_S_T(long groupId, java.lang.String language,
		long statusId, long typeId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.rmi.RemoteException {
		Object returnObj = null;

		MethodHandler methodHandler = new MethodHandler(_countArticleByG_L_S_TMethodKey70,
				groupId, language, statusId, typeId);

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

	public int countArticleByG_L_S_C_D(long groupId, java.lang.String language,
		long statusId, java.lang.String categoryId, java.util.Date fromDate,
		java.util.Date toDate)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.rmi.RemoteException {
		Object returnObj = null;

		MethodHandler methodHandler = new MethodHandler(_countArticleByG_L_S_C_DMethodKey71,
				groupId, language, statusId, categoryId, fromDate, toDate);

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

	public java.util.List getArticleByG_L_S_C_D(long groupId,
		java.lang.String language, long statusId, java.lang.String categoryId,
		java.util.Date fromDate, java.util.Date toDate, int begin, int end)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.rmi.RemoteException {
		Object returnObj = null;

		MethodHandler methodHandler = new MethodHandler(_getArticleByG_L_S_C_DMethodKey72,
				groupId, language, statusId, categoryId, fromDate, toDate,
				begin, end);

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

	public int countOtherArticle(long groupId, java.lang.String language,
		long statusId, java.lang.String categoryId, java.lang.String articleId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.rmi.RemoteException {
		Object returnObj = null;

		MethodHandler methodHandler = new MethodHandler(_countOtherArticleMethodKey73,
				groupId, language, statusId, categoryId, articleId);

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

	public java.util.List getOtherArticle(long groupId,
		java.lang.String language, long statusId, java.lang.String categoryId,
		java.lang.String articleId, int begin, int end)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.rmi.RemoteException {
		Object returnObj = null;

		MethodHandler methodHandler = new MethodHandler(_getOtherArticleMethodKey74,
				groupId, language, statusId, categoryId, articleId, begin, end);

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

	public void removeExpiredStickyArticles(
		com.liferay.portal.kernel.upload.UploadPortletRequest upRequest)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.rmi.RemoteException {
		MethodHandler methodHandler = new MethodHandler(_removeExpiredStickyArticlesMethodKey75,
				upRequest);

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

	public void reIndex(java.lang.String[] ids)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.rmi.RemoteException {
		MethodHandler methodHandler = new MethodHandler(_reIndexMethodKey76, ids);

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

		MethodHandler methodHandler = new MethodHandler(_searchMethodKey77,
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

	public void restoreArticleVersion(long articleVersionId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.rmi.RemoteException {
		MethodHandler methodHandler = new MethodHandler(_restoreArticleVersionMethodKey78,
				articleVersionId);

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

	public long getStatusIdOfPublishedArticles(long companyId, long groupId,
		boolean active) throws java.lang.Exception {
		Object returnObj = null;

		MethodHandler methodHandler = new MethodHandler(_getStatusIdOfPublishedArticlesMethodKey79,
				companyId, groupId, active);

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

		return ((Long)returnObj).longValue();
	}

	public long getStatusIdOfPublishedArticles(boolean active)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.rmi.RemoteException {
		Object returnObj = null;

		MethodHandler methodHandler = new MethodHandler(_getStatusIdOfPublishedArticlesMethodKey80,
				active);

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

		return ((Long)returnObj).longValue();
	}

	public void saveImage(javax.portlet.ActionRequest req,
		com.liferay.portal.kernel.upload.UploadPortletRequest uploadReq,
		com.vportal.portlet.vcms.model.VcmsArticle article,
		java.lang.String image, java.lang.String imageTitle, long companyId)
		throws java.lang.Exception {
		MethodHandler methodHandler = new MethodHandler(_saveImageMethodKey81,
				req, uploadReq, article, image, imageTitle, companyId);

		try {
			_classLoaderProxy.invoke(methodHandler);
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
	}

	public ClassLoaderProxy getClassLoaderProxy() {
		return _classLoaderProxy;
	}

	private ClassLoaderProxy _classLoaderProxy;
	private MethodKey _addArticleMethodKey0 = new MethodKey(_classLoaderProxy.getClassName(),
			"addArticle", javax.portlet.ActionRequest.class,
			com.liferay.portal.kernel.upload.UploadPortletRequest.class,
			long.class, long.class, long.class, java.lang.String.class,
			java.lang.String.class, java.lang.String.class, boolean.class,
			java.lang.String.class, java.lang.String.class,
			java.lang.String.class, boolean.class, boolean.class,
			java.lang.String.class, long.class, java.lang.String.class,
			java.lang.String.class, java.lang.String[].class,
			java.lang.String[].class);
	private MethodKey _addArticleMethodKey1 = new MethodKey(_classLoaderProxy.getClassName(),
			"addArticle", javax.portlet.ActionRequest.class,
			com.liferay.portal.kernel.upload.UploadPortletRequest.class,
			long.class, long.class, long.class, java.lang.String.class,
			java.lang.String.class, java.lang.String.class, boolean.class,
			java.lang.String.class, java.lang.String.class,
			java.lang.String.class, boolean.class, boolean.class,
			java.lang.String.class, long.class, java.lang.String.class,
			java.lang.String.class, java.lang.Boolean.class,
			java.lang.Boolean.class, java.lang.String[].class,
			java.lang.String[].class);
	private MethodKey _addArticleResourcesMethodKey2 = new MethodKey(_classLoaderProxy.getClassName(),
			"addArticleResources", java.lang.String.class, boolean.class,
			boolean.class);
	private MethodKey _addArticleResourcesMethodKey3 = new MethodKey(_classLoaderProxy.getClassName(),
			"addArticleResources",
			com.vportal.portlet.vcms.model.VcmsArticle.class, boolean.class,
			boolean.class);
	private MethodKey _addArticleResourcesMethodKey4 = new MethodKey(_classLoaderProxy.getClassName(),
			"addArticleResources", java.lang.String.class,
			java.lang.String[].class, java.lang.String[].class);
	private MethodKey _addArticleResourcesMethodKey5 = new MethodKey(_classLoaderProxy.getClassName(),
			"addArticleResources",
			com.vportal.portlet.vcms.model.VcmsArticle.class,
			java.lang.String[].class, java.lang.String[].class);
	private MethodKey _updateArticleMethodKey6 = new MethodKey(_classLoaderProxy.getClassName(),
			"updateArticle", javax.portlet.ActionRequest.class,
			com.liferay.portal.kernel.upload.UploadPortletRequest.class,
			long.class, long.class, java.lang.String.class, long.class,
			java.lang.String.class, java.lang.String.class,
			java.lang.String.class, boolean.class, java.lang.String.class,
			java.lang.String.class, java.lang.String.class, boolean.class,
			boolean.class, boolean.class, java.lang.String.class,
			boolean.class, boolean.class, java.util.Date.class);
	private MethodKey _updateArticleMethodKey7 = new MethodKey(_classLoaderProxy.getClassName(),
			"updateArticle", javax.portlet.ActionRequest.class,
			com.liferay.portal.kernel.upload.UploadPortletRequest.class,
			com.vportal.portlet.vcms.model.VcmsArticle.class);
	private MethodKey _updateArticleMethodKey8 = new MethodKey(_classLoaderProxy.getClassName(),
			"updateArticle", com.vportal.portlet.vcms.model.VcmsArticle.class,
			com.liferay.portal.kernel.upload.UploadPortletRequest.class);
	private MethodKey _deleteArticleMethodKey9 = new MethodKey(_classLoaderProxy.getClassName(),
			"deleteArticle", java.lang.String.class);
	private MethodKey _deleteArticlesMethodKey10 = new MethodKey(_classLoaderProxy.getClassName(),
			"deleteArticles", java.lang.String[].class);
	private MethodKey _getArticleMethodKey11 = new MethodKey(_classLoaderProxy.getClassName(),
			"getArticle", java.lang.String.class);
	private MethodKey _getArticlesMethodKey12 = new MethodKey(_classLoaderProxy.getClassName(),
			"getArticles", java.lang.String[].class);
	private MethodKey _getArticlesByU_L_SMethodKey13 = new MethodKey(_classLoaderProxy.getClassName(),
			"getArticlesByU_L_S", long.class, java.lang.String.class,
			int.class, java.lang.String.class);
	private MethodKey _getArticlesByU_L_SMethodKey14 = new MethodKey(_classLoaderProxy.getClassName(),
			"getArticlesByU_L_S", long.class, java.lang.String.class,
			int.class, java.lang.String.class,
			com.liferay.portal.kernel.util.OrderByComparator.class);
	private MethodKey _getArticlesByL_SMethodKey15 = new MethodKey(_classLoaderProxy.getClassName(),
			"getArticlesByL_S", long.class, java.lang.String.class, long.class);
	private MethodKey _getArticlesByL_SMethodKey16 = new MethodKey(_classLoaderProxy.getClassName(),
			"getArticlesByL_S", long.class, java.lang.String.class, long.class,
			int.class, int.class);
	private MethodKey _countArticlesByL_SMethodKey17 = new MethodKey(_classLoaderProxy.getClassName(),
			"countArticlesByL_S", long.class, java.lang.String.class, long.class);
	private MethodKey _getArticlesByG_L_S_UMethodKey18 = new MethodKey(_classLoaderProxy.getClassName(),
			"getArticlesByG_L_S_U", long.class, java.lang.String.class,
			long.class, java.lang.String.class, int.class, int.class);
	private MethodKey _countArticlesByG_L_S_UMethodKey19 = new MethodKey(_classLoaderProxy.getClassName(),
			"countArticlesByG_L_S_U", long.class, java.lang.String.class,
			long.class, java.lang.String.class);
	private MethodKey _getArticlesByL_SMethodKey20 = new MethodKey(_classLoaderProxy.getClassName(),
			"getArticlesByL_S", long.class, java.lang.String.class, int.class,
			com.liferay.portal.kernel.util.OrderByComparator.class);
	private MethodKey _getArticlesByL_S_SMethodKey21 = new MethodKey(_classLoaderProxy.getClassName(),
			"getArticlesByL_S_S", long.class, java.lang.String.class,
			long.class, boolean.class);
	private MethodKey _getArticlesNewByL_S_SMethodKey22 = new MethodKey(_classLoaderProxy.getClassName(),
			"getArticlesNewByL_S_S", long.class, java.lang.String.class,
			long.class, boolean.class, int.class);
	private MethodKey _countArticlesByL_S_SMethodKey23 = new MethodKey(_classLoaderProxy.getClassName(),
			"countArticlesByL_S_S", long.class, java.lang.String.class,
			long.class, boolean.class);
	private MethodKey _getArticlesByL_S_SMethodKey24 = new MethodKey(_classLoaderProxy.getClassName(),
			"getArticlesByL_S_S", long.class, java.lang.String.class,
			int.class, boolean.class,
			com.liferay.portal.kernel.util.OrderByComparator.class);
	private MethodKey _getArticleByP_L_S_DMethodKey25 = new MethodKey(_classLoaderProxy.getClassName(),
			"getArticleByP_L_S_D", long.class, java.lang.String.class,
			long.class, boolean.class);
	private MethodKey _getArticleByC_P_L_SMethodKey26 = new MethodKey(_classLoaderProxy.getClassName(),
			"getArticleByC_P_L_S", java.lang.String.class, long.class,
			java.lang.String.class, long.class);
	private MethodKey _getArticleByC_P_L_SMethodKey27 = new MethodKey(_classLoaderProxy.getClassName(),
			"getArticleByC_P_L_S", java.lang.String.class, long.class,
			java.lang.String.class, long.class, int.class, int.class);
	private MethodKey _countArticleByC_P_L_SMethodKey28 = new MethodKey(_classLoaderProxy.getClassName(),
			"countArticleByC_P_L_S", java.lang.String.class, long.class,
			java.lang.String.class, long.class);
	private MethodKey _getArticleByP_P_L_SMethodKey29 = new MethodKey(_classLoaderProxy.getClassName(),
			"getArticleByP_P_L_S", java.lang.String.class, long.class,
			java.lang.String.class, long.class);
	private MethodKey _countArticleByP_P_L_SMethodKey30 = new MethodKey(_classLoaderProxy.getClassName(),
			"countArticleByP_P_L_S", java.lang.String.class, long.class,
			java.lang.String.class, long.class);
	private MethodKey _getArticleByP_P_L_SMethodKey31 = new MethodKey(_classLoaderProxy.getClassName(),
			"getArticleByP_P_L_S", java.lang.String.class, long.class,
			java.lang.String.class, long.class, int.class, int.class);
	private MethodKey _getArticleByT_P_L_SMethodKey32 = new MethodKey(_classLoaderProxy.getClassName(),
			"getArticleByT_P_L_S", java.lang.String.class, long.class,
			java.lang.String.class, long.class);
	private MethodKey _getArticleByT_P_L_SMethodKey33 = new MethodKey(_classLoaderProxy.getClassName(),
			"getArticleByT_P_L_S", java.lang.String.class, long.class,
			java.lang.String.class, long.class, int.class, int.class);
	private MethodKey _countArticleByT_P_L_SMethodKey34 = new MethodKey(_classLoaderProxy.getClassName(),
			"countArticleByT_P_L_S", java.lang.String.class, long.class,
			java.lang.String.class, long.class);
	private MethodKey _countByStatusMethodKey35 = new MethodKey(_classLoaderProxy.getClassName(),
			"countByStatus", long.class, java.lang.String.class, long.class);
	private MethodKey _countByStatusMethodKey36 = new MethodKey(_classLoaderProxy.getClassName(),
			"countByStatus", long.class);
	private MethodKey _getTopNewArticlesMethodKey37 = new MethodKey(_classLoaderProxy.getClassName(),
			"getTopNewArticles", long.class, java.lang.String.class,
			java.lang.String.class, java.lang.String.class, long.class,
			int.class);
	private MethodKey _getHotNewArticlesMethodKey38 = new MethodKey(_classLoaderProxy.getClassName(),
			"getHotNewArticles", long.class, java.lang.String.class,
			java.lang.String.class, java.lang.String.class, long.class,
			int.class);
	private MethodKey _getTopNewArticlesMethodKey39 = new MethodKey(_classLoaderProxy.getClassName(),
			"getTopNewArticles", long.class, java.lang.String.class,
			java.lang.String.class, java.lang.String.class, long.class,
			boolean.class, int.class);
	private MethodKey _getTopNewArticlesMethodKey40 = new MethodKey(_classLoaderProxy.getClassName(),
			"getTopNewArticles", long.class, java.lang.String.class,
			long.class, boolean.class, int.class);
	private MethodKey _getTopNewArticlesMethodKey41 = new MethodKey(_classLoaderProxy.getClassName(),
			"getTopNewArticles", long.class, java.lang.String.class,
			java.lang.String.class, long.class, boolean.class, int.class);
	private MethodKey _getTopNewArticlesMethodKey42 = new MethodKey(_classLoaderProxy.getClassName(),
			"getTopNewArticles", long.class, java.lang.String.class,
			java.lang.String.class, long.class, int.class,
			com.liferay.portal.kernel.util.OrderByComparator.class);
	private MethodKey _getAllCategoryArticlesMethodKey43 = new MethodKey(_classLoaderProxy.getClassName(),
			"getAllCategoryArticles", long.class, java.lang.String.class,
			java.lang.String.class, long.class, int.class, int.class);
	private MethodKey _countAllCategoryArticlesMethodKey44 = new MethodKey(_classLoaderProxy.getClassName(),
			"countAllCategoryArticles", long.class, java.lang.String.class,
			java.lang.String.class, long.class);
	private MethodKey _getArticlesInThreadMethodKey45 = new MethodKey(_classLoaderProxy.getClassName(),
			"getArticlesInThread", long.class, java.lang.String.class,
			java.lang.String.class, long.class);
	private MethodKey _getArticlesInThreadMethodKey46 = new MethodKey(_classLoaderProxy.getClassName(),
			"getArticlesInThread", long.class, java.lang.String.class,
			java.lang.String.class, long.class, int.class);
	private MethodKey _getArticlesInThreadMethodKey47 = new MethodKey(_classLoaderProxy.getClassName(),
			"getArticlesInThread", long.class, java.lang.String.class,
			java.lang.String[].class, long.class, int.class);
	private MethodKey _getOlderArticlesMethodKey48 = new MethodKey(_classLoaderProxy.getClassName(),
			"getOlderArticles", long.class, java.lang.String.class,
			java.lang.String.class, java.lang.String.class,
			java.lang.String.class, long.class, int.class);
	private MethodKey _getNewArticlesMethodKey49 = new MethodKey(_classLoaderProxy.getClassName(),
			"getNewArticles", long.class, java.lang.String.class,
			java.lang.String.class, java.lang.String.class,
			java.lang.String.class, long.class, int.class);
	private MethodKey _countByC_P_L_S_DMethodKey50 = new MethodKey(_classLoaderProxy.getClassName(),
			"countByC_P_L_S_D", java.lang.String.class, long.class,
			java.lang.String.class, long.class, java.util.Date.class,
			java.util.Date.class, java.lang.String.class);
	private MethodKey _countByP_L_S_DMethodKey51 = new MethodKey(_classLoaderProxy.getClassName(),
			"countByP_L_S_D", long.class, java.lang.String.class, long.class,
			java.util.Date.class, java.util.Date.class, java.lang.String.class);
	private MethodKey _listReportByDateMethodKey52 = new MethodKey(_classLoaderProxy.getClassName(),
			"listReportByDate", long.class, java.lang.String.class, long.class,
			java.util.Date.class, java.util.Date.class, java.lang.String.class,
			long.class, int.class, int.class);
	private MethodKey _listReportByDateNotTypeMethodKey53 = new MethodKey(_classLoaderProxy.getClassName(),
			"listReportByDateNotType", long.class, java.lang.String.class,
			long.class, java.util.Date.class, java.util.Date.class,
			java.lang.String.class, int.class, int.class);
	private MethodKey _countByDateMethodKey54 = new MethodKey(_classLoaderProxy.getClassName(),
			"countByDate", long.class, java.lang.String.class, long.class,
			java.util.Date.class, java.util.Date.class, java.lang.String.class,
			long.class);
	private MethodKey _countByDateNotTypeMethodKey55 = new MethodKey(_classLoaderProxy.getClassName(),
			"countByDateNotType", long.class, java.lang.String.class,
			long.class, java.util.Date.class, java.util.Date.class,
			java.lang.String.class);
	private MethodKey _listArticleByDateTypesMethodKey56 = new MethodKey(_classLoaderProxy.getClassName(),
			"listArticleByDateTypes", long.class, java.lang.String.class,
			long.class, java.util.Date.class, java.util.Date.class,
			java.lang.String.class, java.lang.String[].class, int.class,
			int.class);
	private MethodKey _countArticleByDateTypesMethodKey57 = new MethodKey(_classLoaderProxy.getClassName(),
			"countArticleByDateTypes", long.class, java.lang.String.class,
			long.class, java.util.Date.class, java.util.Date.class,
			java.lang.String.class, java.lang.String[].class);
	private MethodKey _countByTypeMethodKey58 = new MethodKey(_classLoaderProxy.getClassName(),
			"countByType", long.class, java.lang.String.class, long.class,
			long.class, java.util.Date.class, java.util.Date.class,
			java.lang.String.class);
	private MethodKey _countByUserMethodKey59 = new MethodKey(_classLoaderProxy.getClassName(),
			"countByUser", long.class, java.lang.String.class,
			java.lang.String.class, long.class, long.class,
			java.util.Date.class, java.util.Date.class, java.lang.String.class);
	private MethodKey _countArticleNotInTypeMethodKey60 = new MethodKey(_classLoaderProxy.getClassName(),
			"countArticleNotInType", long.class, java.lang.String.class,
			java.lang.String.class, long.class, java.util.Date.class,
			java.util.Date.class, java.lang.String.class);
	private MethodKey _countArticleAllCatNotInTypeMethodKey61 = new MethodKey(_classLoaderProxy.getClassName(),
			"countArticleAllCatNotInType", long.class, java.lang.String.class,
			long.class, java.util.Date.class, java.util.Date.class,
			java.lang.String.class);
	private MethodKey _getArticlesBySearchContainerMethodKey62 = new MethodKey(_classLoaderProxy.getClassName(),
			"getArticlesBySearchContainer", java.lang.String.class, long.class,
			java.lang.String.class, java.lang.String.class,
			java.lang.String.class, boolean.class, boolean.class,
			boolean.class, boolean.class, java.util.Date.class,
			java.util.Date.class, long.class, java.lang.String.class);
	private MethodKey _getArticlesBySearchContainerMethodKey63 = new MethodKey(_classLoaderProxy.getClassName(),
			"getArticlesBySearchContainer", java.lang.String.class, long.class,
			java.lang.String.class, java.lang.String.class,
			java.lang.String.class, long.class, boolean.class, boolean.class,
			boolean.class, boolean.class, java.util.Date.class,
			java.util.Date.class, long.class, java.lang.String.class,
			int.class, int.class);
	private MethodKey _countArticlesBySearchContainerMethodKey64 = new MethodKey(_classLoaderProxy.getClassName(),
			"countArticlesBySearchContainer", java.lang.String.class,
			long.class, java.lang.String.class, java.lang.String.class,
			java.lang.String.class, long.class, boolean.class, boolean.class,
			boolean.class, boolean.class, java.util.Date.class,
			java.util.Date.class, long.class, java.lang.String.class);
	private MethodKey _getArticlesBySearchContainer_TMethodKey65 = new MethodKey(_classLoaderProxy.getClassName(),
			"getArticlesBySearchContainer_T", java.lang.String.class,
			long.class, java.lang.String.class, long.class,
			java.lang.String.class, java.lang.String.class, boolean.class,
			boolean.class, boolean.class, boolean.class, java.util.Date.class,
			java.util.Date.class, long.class, java.lang.String.class,
			int.class, int.class);
	private MethodKey _countArticlesBySearchContainer_TMethodKey66 = new MethodKey(_classLoaderProxy.getClassName(),
			"countArticlesBySearchContainer_T", java.lang.String.class,
			long.class, java.lang.String.class, long.class,
			java.lang.String.class, java.lang.String.class, boolean.class,
			boolean.class, boolean.class, boolean.class, java.util.Date.class,
			java.util.Date.class, long.class, java.lang.String.class);
	private MethodKey _getArticleByG_L_C_S_TMethodKey67 = new MethodKey(_classLoaderProxy.getClassName(),
			"getArticleByG_L_C_S_T", long.class, java.lang.String.class,
			java.lang.String.class, long.class, long.class, int.class, int.class);
	private MethodKey _countArticleByG_L_C_S_TMethodKey68 = new MethodKey(_classLoaderProxy.getClassName(),
			"countArticleByG_L_C_S_T", long.class, java.lang.String.class,
			java.lang.String.class, long.class, long.class);
	private MethodKey _getArticleByG_L_S_TMethodKey69 = new MethodKey(_classLoaderProxy.getClassName(),
			"getArticleByG_L_S_T", long.class, java.lang.String.class,
			long.class, long.class, int.class, int.class);
	private MethodKey _countArticleByG_L_S_TMethodKey70 = new MethodKey(_classLoaderProxy.getClassName(),
			"countArticleByG_L_S_T", long.class, java.lang.String.class,
			long.class, long.class);
	private MethodKey _countArticleByG_L_S_C_DMethodKey71 = new MethodKey(_classLoaderProxy.getClassName(),
			"countArticleByG_L_S_C_D", long.class, java.lang.String.class,
			long.class, java.lang.String.class, java.util.Date.class,
			java.util.Date.class);
	private MethodKey _getArticleByG_L_S_C_DMethodKey72 = new MethodKey(_classLoaderProxy.getClassName(),
			"getArticleByG_L_S_C_D", long.class, java.lang.String.class,
			long.class, java.lang.String.class, java.util.Date.class,
			java.util.Date.class, int.class, int.class);
	private MethodKey _countOtherArticleMethodKey73 = new MethodKey(_classLoaderProxy.getClassName(),
			"countOtherArticle", long.class, java.lang.String.class,
			long.class, java.lang.String.class, java.lang.String.class);
	private MethodKey _getOtherArticleMethodKey74 = new MethodKey(_classLoaderProxy.getClassName(),
			"getOtherArticle", long.class, java.lang.String.class, long.class,
			java.lang.String.class, java.lang.String.class, int.class, int.class);
	private MethodKey _removeExpiredStickyArticlesMethodKey75 = new MethodKey(_classLoaderProxy.getClassName(),
			"removeExpiredStickyArticles",
			com.liferay.portal.kernel.upload.UploadPortletRequest.class);
	private MethodKey _reIndexMethodKey76 = new MethodKey(_classLoaderProxy.getClassName(),
			"reIndex", java.lang.String[].class);
	private MethodKey _searchMethodKey77 = new MethodKey(_classLoaderProxy.getClassName(),
			"search", long.class, long.class, long.class,
			java.lang.String.class, int.class, int.class);
	private MethodKey _restoreArticleVersionMethodKey78 = new MethodKey(_classLoaderProxy.getClassName(),
			"restoreArticleVersion", long.class);
	private MethodKey _getStatusIdOfPublishedArticlesMethodKey79 = new MethodKey(_classLoaderProxy.getClassName(),
			"getStatusIdOfPublishedArticles", long.class, long.class,
			boolean.class);
	private MethodKey _getStatusIdOfPublishedArticlesMethodKey80 = new MethodKey(_classLoaderProxy.getClassName(),
			"getStatusIdOfPublishedArticles", boolean.class);
	private MethodKey _saveImageMethodKey81 = new MethodKey(_classLoaderProxy.getClassName(),
			"saveImage", javax.portlet.ActionRequest.class,
			com.liferay.portal.kernel.upload.UploadPortletRequest.class,
			com.vportal.portlet.vcms.model.VcmsArticle.class,
			java.lang.String.class, java.lang.String.class, long.class);
}