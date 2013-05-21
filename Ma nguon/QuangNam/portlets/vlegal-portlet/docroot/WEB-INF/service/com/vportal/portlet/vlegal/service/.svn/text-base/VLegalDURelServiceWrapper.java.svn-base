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
 * This class is a wrapper for {@link VLegalDURelService}.
 * </p>
 *
 * @author    ACB
 * @see       VLegalDURelService
 * @generated
 */
public class VLegalDURelServiceWrapper implements VLegalDURelService {
	public VLegalDURelServiceWrapper(VLegalDURelService vLegalDURelService) {
		_vLegalDURelService = vLegalDURelService;
	}

	public com.vportal.portlet.vlegal.model.VLegalDURel addRelation(
		long departmentId, long userid)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.rmi.RemoteException {
		return _vLegalDURelService.addRelation(departmentId, userid);
	}

	public void deleteRelation(long departmentId, long userid)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.rmi.RemoteException {
		_vLegalDURelService.deleteRelation(departmentId, userid);
	}

	public void deleteRelByDepartment(long departmentId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.rmi.RemoteException {
		_vLegalDURelService.deleteRelByDepartment(departmentId);
	}

	public void deleteRelByUser(long userid)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.rmi.RemoteException {
		_vLegalDURelService.deleteRelByUser(userid);
	}

	public java.util.List getRelByDepartment(long departmentId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.rmi.RemoteException {
		return _vLegalDURelService.getRelByDepartment(departmentId);
	}

	public java.util.List getRelByUser(long userid)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.rmi.RemoteException {
		return _vLegalDURelService.getRelByUser(userid);
	}

	public com.vportal.portlet.vlegal.model.VLegalDURel getByUserId(long userid)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.rmi.RemoteException {
		return _vLegalDURelService.getByUserId(userid);
	}

	public VLegalDURelService getWrappedVLegalDURelService() {
		return _vLegalDURelService;
	}

	private VLegalDURelService _vLegalDURelService;
}