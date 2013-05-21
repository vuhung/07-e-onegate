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
 * This class is a wrapper for {@link VLegalDSRelService}.
 * </p>
 *
 * @author    ACB
 * @see       VLegalDSRelService
 * @generated
 */
public class VLegalDSRelServiceWrapper implements VLegalDSRelService {
	public VLegalDSRelServiceWrapper(VLegalDSRelService vLegalDSRelService) {
		_vLegalDSRelService = vLegalDSRelService;
	}

	public com.vportal.portlet.vlegal.model.VLegalDSRel addRelation(
		java.lang.String docId, java.lang.String sigId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _vLegalDSRelService.addRelation(docId, sigId);
	}

	public void deleteRelation(java.lang.String docId, java.lang.String sigId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vlegal.NoSuchVLegalDSRelException {
		_vLegalDSRelService.deleteRelation(docId, sigId);
	}

	public void deleteRelBySigner(java.lang.String sigId)
		throws com.liferay.portal.kernel.exception.SystemException {
		_vLegalDSRelService.deleteRelBySigner(sigId);
	}

	public void deleteRelByDoc(java.lang.String docId)
		throws com.liferay.portal.kernel.exception.SystemException {
		_vLegalDSRelService.deleteRelByDoc(docId);
	}

	public java.util.List getRelByDoc(java.lang.String docId) {
		return _vLegalDSRelService.getRelByDoc(docId);
	}

	public java.util.List getRelByField(java.lang.String fieldId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _vLegalDSRelService.getRelByField(fieldId);
	}

	public VLegalDSRelService getWrappedVLegalDSRelService() {
		return _vLegalDSRelService;
	}

	private VLegalDSRelService _vLegalDSRelService;
}