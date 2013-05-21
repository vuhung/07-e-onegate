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
 * This class is a wrapper for {@link VLegalDDRelService}.
 * </p>
 *
 * @author    ACB
 * @see       VLegalDDRelService
 * @generated
 */
public class VLegalDDRelServiceWrapper implements VLegalDDRelService {
	public VLegalDDRelServiceWrapper(VLegalDDRelService vLegalDDRelService) {
		_vLegalDDRelService = vLegalDDRelService;
	}

	public com.vportal.portlet.vlegal.model.VLegalDDRel addRelation(
		long departmentId, java.lang.String docId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.rmi.RemoteException {
		return _vLegalDDRelService.addRelation(departmentId, docId);
	}

	public void deleteRelation(long departmentId, java.lang.String docId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.rmi.RemoteException {
		_vLegalDDRelService.deleteRelation(departmentId, docId);
	}

	public void deleteRelByDepartment(long departmentId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.rmi.RemoteException {
		_vLegalDDRelService.deleteRelByDepartment(departmentId);
	}

	public void deleteRelByDoc(java.lang.String docId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.rmi.RemoteException {
		_vLegalDDRelService.deleteRelByDoc(docId);
	}

	public java.util.List getRelByDoc(java.lang.String docId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.rmi.RemoteException {
		return _vLegalDDRelService.getRelByDoc(docId);
	}

	public java.util.List getRelByDepartment(long departmentId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.rmi.RemoteException {
		return _vLegalDDRelService.getRelByDepartment(departmentId);
	}

	public VLegalDDRelService getWrappedVLegalDDRelService() {
		return _vLegalDDRelService;
	}

	private VLegalDDRelService _vLegalDDRelService;
}