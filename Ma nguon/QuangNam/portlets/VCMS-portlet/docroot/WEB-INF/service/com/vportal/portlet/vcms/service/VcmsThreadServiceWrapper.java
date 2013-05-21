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
 * This class is a wrapper for {@link VcmsThreadService}.
 * </p>
 *
 * @author    HOAN
 * @see       VcmsThreadService
 * @generated
 */
public class VcmsThreadServiceWrapper implements VcmsThreadService {
	public VcmsThreadServiceWrapper(VcmsThreadService vcmsThreadService) {
		_vcmsThreadService = vcmsThreadService;
	}

	public com.vportal.portlet.vcms.model.VcmsThread addThread(long groupId,
		long companyId, long plid, java.lang.String title,
		java.lang.String description, boolean hasImage, java.lang.String image,
		java.lang.String language, java.lang.String[] communityPermissions,
		java.lang.String[] guestPermissions)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.rmi.RemoteException {
		return _vcmsThreadService.addThread(groupId, companyId, plid, title,
			description, hasImage, image, language, communityPermissions,
			guestPermissions);
	}

	public com.vportal.portlet.vcms.model.VcmsThread addThread(long groupId,
		long companyId, long plid, java.lang.String title,
		java.lang.String description, boolean hasImage, java.lang.String image,
		java.lang.String language, java.lang.Boolean addCommunityPermissions,
		java.lang.Boolean addGuestPermissions,
		java.lang.String[] communityPermissions,
		java.lang.String[] guestPermissions)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.rmi.RemoteException {
		return _vcmsThreadService.addThread(groupId, companyId, plid, title,
			description, hasImage, image, language, addCommunityPermissions,
			addGuestPermissions, communityPermissions, guestPermissions);
	}

	public void addThreadResources(java.lang.String threadId,
		boolean addCommunityPermissions, boolean addGuestPermissions)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		_vcmsThreadService.addThreadResources(threadId,
			addCommunityPermissions, addGuestPermissions);
	}

	public void addThreadResources(
		com.vportal.portlet.vcms.model.VcmsThread thread,
		boolean addCommunityPermissions, boolean addGuestPermissions)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		_vcmsThreadService.addThreadResources(thread, addCommunityPermissions,
			addGuestPermissions);
	}

	public void addThreadResources(java.lang.String threadId,
		java.lang.String[] communityPermissions,
		java.lang.String[] guestPermissions)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		_vcmsThreadService.addThreadResources(threadId, communityPermissions,
			guestPermissions);
	}

	public void addThreadResources(
		com.vportal.portlet.vcms.model.VcmsThread thread,
		java.lang.String[] communityPermissions,
		java.lang.String[] guestPermissions)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		_vcmsThreadService.addThreadResources(thread, communityPermissions,
			guestPermissions);
	}

	public com.vportal.portlet.vcms.model.VcmsThread updateThread(
		java.lang.String threadId, long groupId, long companyId,
		java.lang.String title, java.lang.String description, boolean hasImage,
		java.lang.String image, java.lang.String language)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.rmi.RemoteException {
		return _vcmsThreadService.updateThread(threadId, groupId, companyId,
			title, description, hasImage, image, language);
	}

	public com.vportal.portlet.vcms.model.VcmsThread updateThread(
		com.vportal.portlet.vcms.model.VcmsThread thread)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.rmi.RemoteException {
		return _vcmsThreadService.updateThread(thread);
	}

	public void deleteThread(java.lang.String threadId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.rmi.RemoteException {
		_vcmsThreadService.deleteThread(threadId);
	}

	public com.vportal.portlet.vcms.model.VcmsThread getThread(
		java.lang.String threadId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.rmi.RemoteException {
		return _vcmsThreadService.getThread(threadId);
	}

	public java.util.List getThreads(java.lang.String[] threadIds)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.rmi.RemoteException {
		return _vcmsThreadService.getThreads(threadIds);
	}

	public java.util.List getThreadsByP_L(long groupId,
		java.lang.String language)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.rmi.RemoteException {
		return _vcmsThreadService.getThreadsByP_L(groupId, language);
	}

	public java.util.List getThreadsByP_L(long groupId,
		java.lang.String language, int begin, int end)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.rmi.RemoteException {
		return _vcmsThreadService.getThreadsByP_L(groupId, language, begin, end);
	}

	public int countThreadsByP_L(long groupId, java.lang.String language)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.rmi.RemoteException {
		return _vcmsThreadService.countThreadsByP_L(groupId, language);
	}

	public VcmsThreadService getWrappedVcmsThreadService() {
		return _vcmsThreadService;
	}

	private VcmsThreadService _vcmsThreadService;
}