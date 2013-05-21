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
 * This class is a wrapper for {@link VcmsPortionService}.
 * </p>
 *
 * @author    HOAN
 * @see       VcmsPortionService
 * @generated
 */
public class VcmsPortionServiceWrapper implements VcmsPortionService {
	public VcmsPortionServiceWrapper(VcmsPortionService vcmsPortionService) {
		_vcmsPortionService = vcmsPortionService;
	}

	public com.vportal.portlet.vcms.model.VcmsPortion addPortion(long groupId,
		long companyId, long plid, java.lang.String code,
		java.lang.String name, java.lang.String description,
		boolean categorizable, java.lang.String language,
		java.lang.String[] communityPermissions,
		java.lang.String[] guestPermissions)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.rmi.RemoteException {
		return _vcmsPortionService.addPortion(groupId, companyId, plid, code,
			name, description, categorizable, language, communityPermissions,
			guestPermissions);
	}

	public com.vportal.portlet.vcms.model.VcmsPortion addPortion(long groupId,
		long companyId, long plid, java.lang.String code,
		java.lang.String name, java.lang.String description,
		boolean categorizable, java.lang.String language,
		java.lang.Boolean addCommunityPermissions,
		java.lang.Boolean addGuestPermissions,
		java.lang.String[] communityPermissions,
		java.lang.String[] guestPermissions)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.rmi.RemoteException {
		return _vcmsPortionService.addPortion(groupId, companyId, plid, code,
			name, description, categorizable, language,
			addCommunityPermissions, addGuestPermissions, communityPermissions,
			guestPermissions);
	}

	public void addPortionResources(java.lang.String portionId,
		boolean addCommunityPermissions, boolean addGuestPermissions)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.rmi.RemoteException {
		_vcmsPortionService.addPortionResources(portionId,
			addCommunityPermissions, addGuestPermissions);
	}

	public void addPortionResources(
		com.vportal.portlet.vcms.model.VcmsPortion portion,
		boolean addCommunityPermissions, boolean addGuestPermissions)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		_vcmsPortionService.addPortionResources(portion,
			addCommunityPermissions, addGuestPermissions);
	}

	public void addPortionResources(java.lang.String portionId,
		java.lang.String[] communityPermissions,
		java.lang.String[] guestPermissions)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.rmi.RemoteException {
		_vcmsPortionService.addPortionResources(portionId,
			communityPermissions, guestPermissions);
	}

	public void addPortionResources(
		com.vportal.portlet.vcms.model.VcmsPortion portion,
		java.lang.String[] communityPermissions,
		java.lang.String[] guestPermissions)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		_vcmsPortionService.addPortionResources(portion, communityPermissions,
			guestPermissions);
	}

	public com.vportal.portlet.vcms.model.VcmsPortion updatePortion(
		java.lang.String portionId, long groupId, long companyId,
		java.lang.String code, java.lang.String name,
		java.lang.String description, boolean categorizable,
		java.lang.String language)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.rmi.RemoteException {
		return _vcmsPortionService.updatePortion(portionId, groupId, companyId,
			code, name, description, categorizable, language);
	}

	public void deletePortion(java.lang.String portionId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.rmi.RemoteException {
		_vcmsPortionService.deletePortion(portionId);
	}

	public void deletePortions(java.lang.String[] portionIds)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.rmi.RemoteException {
		_vcmsPortionService.deletePortions(portionIds);
	}

	public com.vportal.portlet.vcms.model.VcmsPortion getPortion(
		java.lang.String portionId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.rmi.RemoteException {
		return _vcmsPortionService.getPortion(portionId);
	}

	public com.vportal.portlet.vcms.model.VcmsPortion getPortionByS_C(
		long groupId, java.lang.String code)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.rmi.RemoteException {
		return _vcmsPortionService.getPortionByS_C(groupId, code);
	}

	public java.util.List getPortionsByS_L(long groupId,
		java.lang.String language)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.rmi.RemoteException {
		return _vcmsPortionService.getPortionsByS_L(groupId, language);
	}

	public java.util.List getPortionsByS_L(long groupId,
		java.lang.String language, int start, int end)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.rmi.RemoteException {
		return _vcmsPortionService.getPortionsByS_L(groupId, language, start,
			end);
	}

	public int countPortionsByS_L(long groupId, java.lang.String language)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _vcmsPortionService.countPortionsByS_L(groupId, language);
	}

	public int countByCategorizable(long groupId, boolean categorizable)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.rmi.RemoteException {
		return _vcmsPortionService.countByCategorizable(groupId, categorizable);
	}

	public VcmsPortionService getWrappedVcmsPortionService() {
		return _vcmsPortionService;
	}

	private VcmsPortionService _vcmsPortionService;
}