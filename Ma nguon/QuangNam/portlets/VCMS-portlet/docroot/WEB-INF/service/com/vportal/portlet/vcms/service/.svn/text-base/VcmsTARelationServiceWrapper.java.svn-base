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

/**
 * <p>
 * This class is a wrapper for {@link VcmsTARelationService}.
 * </p>
 *
 * @author    HOAN
 * @see       VcmsTARelationService
 * @generated
 */
public class VcmsTARelationServiceWrapper implements VcmsTARelationService {
	public VcmsTARelationServiceWrapper(
		VcmsTARelationService vcmsTARelationService) {
		_vcmsTARelationService = vcmsTARelationService;
	}

	public com.vportal.portlet.vcms.model.VcmsTARelation addRelation(
		java.lang.String threadId, java.lang.String articleId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.rmi.RemoteException {
		return _vcmsTARelationService.addRelation(threadId, articleId);
	}

	public void deleteRelation(java.lang.String threadId,
		java.lang.String articleId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.rmi.RemoteException {
		_vcmsTARelationService.deleteRelation(threadId, articleId);
	}

	public void deleteRelationsByArticle(java.lang.String articleId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.rmi.RemoteException {
		_vcmsTARelationService.deleteRelationsByArticle(articleId);
	}

	public void deleteRelationsByThread(java.lang.String threadId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.rmi.RemoteException {
		_vcmsTARelationService.deleteRelationsByThread(threadId);
	}

	public java.util.List getRelationsByArticle(java.lang.String articleId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.rmi.RemoteException {
		return _vcmsTARelationService.getRelationsByArticle(articleId);
	}

	public java.util.List getRelationsByThread(java.lang.String threadId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.rmi.RemoteException {
		return _vcmsTARelationService.getRelationsByThread(threadId);
	}

	public int countArticlesOfThread(java.lang.String threadId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.rmi.RemoteException {
		return _vcmsTARelationService.countArticlesOfThread(threadId);
	}

	public int countRelationByThread(java.lang.String threadId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.rmi.RemoteException {
		return _vcmsTARelationService.countRelationByThread(threadId);
	}

	public VcmsTARelationService getWrappedVcmsTARelationService() {
		return _vcmsTARelationService;
	}

	private VcmsTARelationService _vcmsTARelationService;
}