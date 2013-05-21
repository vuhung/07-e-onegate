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
 * This class is a wrapper for {@link VLegalDFRelService}.
 * </p>
 *
 * @author    ACB
 * @see       VLegalDFRelService
 * @generated
 */
public class VLegalDFRelServiceWrapper implements VLegalDFRelService {
	public VLegalDFRelServiceWrapper(VLegalDFRelService vLegalDFRelService) {
		_vLegalDFRelService = vLegalDFRelService;
	}

	public com.vportal.portlet.vlegal.model.VLegalDFRel addRelation(
		java.lang.String docId, java.lang.String fieldId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.rmi.RemoteException {
		return _vLegalDFRelService.addRelation(docId, fieldId);
	}

	public void deleteRelation(java.lang.String docId, java.lang.String fieldId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vlegal.NoSuchVLegalDFRelException {
		_vLegalDFRelService.deleteRelation(docId, fieldId);
	}

	public void deleteRelByField(java.lang.String fieldId)
		throws com.liferay.portal.kernel.exception.SystemException {
		_vLegalDFRelService.deleteRelByField(fieldId);
	}

	public void deleteRelByDoc(java.lang.String docId)
		throws com.liferay.portal.kernel.exception.SystemException {
		_vLegalDFRelService.deleteRelByDoc(docId);
	}

	public java.util.List getRelByDoc(java.lang.String docId) {
		return _vLegalDFRelService.getRelByDoc(docId);
	}

	public java.util.List getRelByField(java.lang.String fieldId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _vLegalDFRelService.getRelByField(fieldId);
	}

	public com.vportal.portlet.vlegal.model.VLegalDFRel addRealation(
		java.lang.String arg0, java.lang.String arg1)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _vLegalDFRelService.addRealation(arg0, arg1);
	}

	public VLegalDFRelService getWrappedVLegalDFRelService() {
		return _vLegalDFRelService;
	}

	private VLegalDFRelService _vLegalDFRelService;
}