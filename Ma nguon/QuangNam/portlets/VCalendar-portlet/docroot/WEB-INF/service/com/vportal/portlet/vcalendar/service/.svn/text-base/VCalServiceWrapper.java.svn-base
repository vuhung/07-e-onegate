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

package com.vportal.portlet.vcalendar.service;

/**
 * <p>
 * This class is a wrapper for {@link VCalService}.
 * </p>
 *
 * @author    Admin
 * @see       VCalService
 * @generated
 */
public class VCalServiceWrapper implements VCalService {
	public VCalServiceWrapper(VCalService vCalService) {
		_vCalService = vCalService;
	}

	public com.vportal.portlet.vcalendar.model.VCal addvCal(long groupId,
		long companyId, long userId, java.lang.String userName,
		java.util.Date createDate, java.util.Date modifiedDate,
		java.lang.String languageId, java.lang.String title,
		java.lang.String description, java.util.Date startDate,
		java.util.Date endDate, int status, long fileId,
		java.lang.String guest, java.lang.String location, java.lang.String time)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _vCalService.addvCal(groupId, companyId, userId, userName,
			createDate, modifiedDate, languageId, title, description,
			startDate, endDate, status, fileId, guest, location, time);
	}

	public com.vportal.portlet.vcalendar.model.VCal updatevCal(long calId,
		long groupId, long companyId, long userId, java.lang.String userName,
		java.util.Date createDate, java.util.Date modifiedDate,
		java.lang.String languageId, java.lang.String title,
		java.lang.String description, int status, long fileId,
		java.lang.String guest, java.lang.String location, java.lang.String time)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _vCalService.updatevCal(calId, groupId, companyId, userId,
			userName, createDate, modifiedDate, languageId, title, description,
			status, fileId, guest, location, time);
	}

	public com.vportal.portlet.vcalendar.model.VCal deletevCal(long calId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _vCalService.deletevCal(calId);
	}

	public java.util.List findByD_S_G(java.util.Date startDate, int status,
		long groupId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _vCalService.findByD_S_G(startDate, status, groupId);
	}

	public java.util.List findByD_S_G(java.util.Date startDate, int status,
		long groupId, int begin, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _vCalService.findByD_S_G(startDate, status, groupId, begin, end);
	}

	public int countByD_S_G(java.util.Date startDate, int status, long groupId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _vCalService.countByD_S_G(startDate, status, groupId);
	}

	public java.util.List findByU_D_S(long userId, int status,
		java.util.Date startDate)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _vCalService.findByU_D_S(userId, status, startDate);
	}

	public java.util.List findByU_D_S(long userId, java.util.Date startDate,
		int status, int begin, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _vCalService.findByU_D_S(userId, startDate, status, begin, end);
	}

	public int countByU_D_S(long userId, java.util.Date startDate, int status)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _vCalService.countByU_D_S(userId, startDate, status);
	}

	public java.util.List findByD_S(java.util.Date startDate, int status)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _vCalService.findByD_S(startDate, status);
	}

	public java.util.List findByD_S(java.util.Date startDate, int status,
		int begin, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _vCalService.findByD_S(startDate, status, begin, end);
	}

	public int countByD_S(java.util.Date startDate, int status)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _vCalService.countByD_S(startDate, status);
	}

	public com.vportal.portlet.vcalendar.model.VCal findById(long calId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vcalendar.NoSuchVCalException {
		return _vCalService.findById(calId);
	}

	public java.util.List findByUser(long calId, java.util.Date startDate,
		long groupId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vcalendar.NoSuchVCalException {
		return _vCalService.findByUser(calId, startDate, groupId);
	}

	public java.util.List findByUserGroup(long groupId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vcalendar.NoSuchVCalException {
		return _vCalService.findByUserGroup(groupId);
	}

	public java.util.List findByGroupOrg()
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vcalendar.NoSuchVCalException {
		return _vCalService.findByGroupOrg();
	}

	public java.util.List findByF_D_G_T(long userId, java.util.Date startDate,
		long groupId, int status)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _vCalService.findByF_D_G_T(userId, startDate, groupId, status);
	}

	public java.util.List findByF(long fileId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _vCalService.findByF(fileId);
	}

	public VCalService getWrappedVCalService() {
		return _vCalService;
	}

	private VCalService _vCalService;
}