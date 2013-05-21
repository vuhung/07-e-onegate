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

package com.vportal.portal.service;

/**
 * <p>
 * This class is a wrapper for {@link AccessCounterService}.
 * </p>
 *
 * @author    HOAN
 * @see       AccessCounterService
 * @generated
 */
public class AccessCounterServiceWrapper implements AccessCounterService {
	public AccessCounterServiceWrapper(
		AccessCounterService accessCounterService) {
		_accessCounterService = accessCounterService;
	}

	public com.vportal.portal.model.AccessCounter getCounter(long companyId,
		java.util.Date date)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.rmi.RemoteException {
		return _accessCounterService.getCounter(companyId, date);
	}

	public com.vportal.portal.model.AccessCounter addCounter(long companyId,
		int hitIncrease)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.rmi.RemoteException {
		return _accessCounterService.addCounter(companyId, hitIncrease);
	}

	public com.vportal.portal.model.AccessCounter updateCounter(
		long companyId, java.util.Date date, int hitIncrease)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.rmi.RemoteException {
		return _accessCounterService.updateCounter(companyId, date, hitIncrease);
	}

	public int getTotalHits(long companyId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.rmi.RemoteException {
		return _accessCounterService.getTotalHits(companyId);
	}

	public int getHits(long companyId, java.util.Date date)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.rmi.RemoteException {
		return _accessCounterService.getHits(companyId, date);
	}

	public java.util.List getAccessCounter(long companyId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.rmi.RemoteException {
		return _accessCounterService.getAccessCounter(companyId);
	}

	public int getAccess(long companyId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.rmi.RemoteException {
		return _accessCounterService.getAccess(companyId);
	}

	public AccessCounterService getWrappedAccessCounterService() {
		return _accessCounterService;
	}

	private AccessCounterService _accessCounterService;
}