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

/**
 * <p>
 * This class is a wrapper for {@link VLegalTDRelService}.
 * </p>
 *
 * @author    ACB
 * @see       VLegalTDRelService
 * @generated
 */
public class VLegalTDRelServiceWrapper implements VLegalTDRelService {
	public VLegalTDRelServiceWrapper(VLegalTDRelService vLegalTDRelService) {
		_vLegalTDRelService = vLegalTDRelService;
	}

	public com.vportal.portlet.vlegal.model.VLegalTDRel addRelation(
		java.lang.String docId, java.lang.String tagId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException, java.rmi.RemoteException {
		return _vLegalTDRelService.addRelation(docId, tagId);
	}

	public void deleteRelation(java.lang.String docId, java.lang.String tagId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException, java.rmi.RemoteException {
		_vLegalTDRelService.deleteRelation(docId, tagId);
	}

	public void deleteRelByDoc(java.lang.String docId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException, java.rmi.RemoteException {
		_vLegalTDRelService.deleteRelByDoc(docId);
	}

	public void deleteRelByTag(java.lang.String tagId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException, java.rmi.RemoteException {
		_vLegalTDRelService.deleteRelByTag(tagId);
	}

	public java.util.List getRelByDoc(java.lang.String docId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException, java.rmi.RemoteException {
		return _vLegalTDRelService.getRelByDoc(docId);
	}

	public java.util.List getRelByTag(java.lang.String tagId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException, java.rmi.RemoteException {
		return _vLegalTDRelService.getRelByTag(tagId);
	}

	public VLegalTDRelService getWrappedVLegalTDRelService() {
		return _vLegalTDRelService;
	}

	private VLegalTDRelService _vLegalTDRelService;
}