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
 * This class is a wrapper for {@link VcmsPARelationService}.
 * </p>
 *
 * @author    HOAN
 * @see       VcmsPARelationService
 * @generated
 */
public class VcmsPARelationServiceWrapper implements VcmsPARelationService {
	public VcmsPARelationServiceWrapper(
		VcmsPARelationService vcmsPARelationService) {
		_vcmsPARelationService = vcmsPARelationService;
	}

	public com.vportal.portlet.vcms.model.VcmsPARelation addRelation(
		java.lang.String portionId, java.lang.String articleId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.rmi.RemoteException {
		return _vcmsPARelationService.addRelation(portionId, articleId);
	}

	public void deleteRelation(java.lang.String portionId,
		java.lang.String articleId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.rmi.RemoteException {
		_vcmsPARelationService.deleteRelation(portionId, articleId);
	}

	public void deleteRelationsByPortion(java.lang.String portionId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.rmi.RemoteException {
		_vcmsPARelationService.deleteRelationsByPortion(portionId);
	}

	public void deleteRelationsByArticle(java.lang.String articleId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.rmi.RemoteException {
		_vcmsPARelationService.deleteRelationsByArticle(articleId);
	}

	public java.util.List getRelationsByPortion(java.lang.String portionId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.rmi.RemoteException {
		return _vcmsPARelationService.getRelationsByPortion(portionId);
	}

	public java.util.List getRelationsByArticle(java.lang.String articleId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.rmi.RemoteException {
		return _vcmsPARelationService.getRelationsByArticle(articleId);
	}

	public VcmsPARelationService getWrappedVcmsPARelationService() {
		return _vcmsPARelationService;
	}

	private VcmsPARelationService _vcmsPARelationService;
}