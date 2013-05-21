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
 * This class is a wrapper for {@link VLegalTypeService}.
 * </p>
 *
 * @author    ACB
 * @see       VLegalTypeService
 * @generated
 */
public class VLegalTypeServiceWrapper implements VLegalTypeService {
	public VLegalTypeServiceWrapper(VLegalTypeService vLegalTypeService) {
		_vLegalTypeService = vLegalTypeService;
	}

	public com.vportal.portlet.vlegal.model.VLegalType addType(long groupId,
		java.lang.String name, java.lang.String description,
		java.lang.String language, boolean status, boolean rssable,
		java.lang.String[] communityPermissions,
		java.lang.String[] guestPermissions,
		com.liferay.portal.theme.ThemeDisplay themeDisplay)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			com.liferay.portal.security.auth.PrincipalException,
			java.rmi.RemoteException {
		return _vLegalTypeService.addType(groupId, name, description, language,
			status, rssable, communityPermissions, guestPermissions,
			themeDisplay);
	}

	public com.vportal.portlet.vlegal.model.VLegalType addType(long groupId,
		java.lang.String name, java.lang.String description,
		java.lang.String language, boolean status, boolean rssable,
		java.lang.Boolean addCommunityPermissions,
		java.lang.Boolean addGuestPermissions,
		java.lang.String[] communityPermissions,
		java.lang.String[] guestPermissions,
		com.liferay.portal.theme.ThemeDisplay themeDisplay)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException, java.rmi.RemoteException {
		return _vLegalTypeService.addType(groupId, name, description, language,
			status, rssable, addCommunityPermissions, addGuestPermissions,
			communityPermissions, guestPermissions, themeDisplay);
	}

	public com.vportal.portlet.vlegal.model.VLegalType updateType(
		long groupId, java.lang.String typeId, java.lang.String language,
		java.lang.String name, java.lang.String description, int position,
		boolean status, boolean rssable)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException, java.rmi.RemoteException {
		return _vLegalTypeService.updateType(groupId, typeId, language, name,
			description, position, status, rssable);
	}

	public com.vportal.portlet.vlegal.model.VLegalType updateType(
		com.vportal.portlet.vlegal.model.VLegalType lType)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException, java.rmi.RemoteException {
		return _vLegalTypeService.updateType(lType);
	}

	public void addEntryResources(long entryId,
		boolean addCommunityPermissions, boolean addGuestPermissions)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		_vLegalTypeService.addEntryResources(entryId, addCommunityPermissions,
			addGuestPermissions);
	}

	public void addEntryResources(
		com.vportal.portlet.vlegal.model.VLegalType entry,
		boolean addCommunityPermissions, boolean addGuestPermissions)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		_vLegalTypeService.addEntryResources(entry, addCommunityPermissions,
			addGuestPermissions);
	}

	public void addEntryResources(long entryId,
		java.lang.String[] communityPermissions,
		java.lang.String[] guestPermissions)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		_vLegalTypeService.addEntryResources(entryId, communityPermissions,
			guestPermissions);
	}

	public void addEntryResources(
		com.vportal.portlet.vlegal.model.VLegalType entry,
		java.lang.String[] communityPermissions,
		java.lang.String[] guestPermissions)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		_vLegalTypeService.addEntryResources(entry, communityPermissions,
			guestPermissions);
	}

	public void deleteType(java.lang.String typeId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException, java.rmi.RemoteException {
		_vLegalTypeService.deleteType(typeId);
	}

	public void deleteTypeAndDocs(java.lang.String typeId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException, java.rmi.RemoteException {
		_vLegalTypeService.deleteTypeAndDocs(typeId);
	}

	public com.vportal.portlet.vlegal.model.VLegalType getType(
		java.lang.String typeId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException, java.rmi.RemoteException {
		return _vLegalTypeService.getType(typeId);
	}

	public com.vportal.portlet.vlegal.model.VLegalType getType(long groupId,
		java.lang.String typeId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException, java.rmi.RemoteException {
		return _vLegalTypeService.getType(groupId, typeId);
	}

	public java.util.List getDocByType(java.lang.String typeId,
		java.lang.String language)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException, java.rmi.RemoteException {
		return _vLegalTypeService.getDocByType(typeId, language);
	}

	public java.util.List getAllTypes()
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException, java.rmi.RemoteException {
		return _vLegalTypeService.getAllTypes();
	}

	public java.util.List getTypeByGroupId(long groupId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException, java.rmi.RemoteException {
		return _vLegalTypeService.getTypeByGroupId(groupId);
	}

	public java.util.List getTypeByGroupId(long groupId, int begin, int end)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException, java.rmi.RemoteException {
		return _vLegalTypeService.getTypeByGroupId(groupId, begin, end);
	}

	public int countTypeByGroupId(long groupId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException, java.rmi.RemoteException {
		return _vLegalTypeService.countTypeByGroupId(groupId);
	}

	public java.util.List getTypesByL_S(long groupId,
		java.lang.String language, boolean status)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException, java.rmi.RemoteException {
		return _vLegalTypeService.getTypesByL_S(groupId, language, status);
	}

	public java.util.List getTypesByL_RSS(long groupId, boolean status,
		boolean rss)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException, java.rmi.RemoteException {
		return _vLegalTypeService.getTypesByL_RSS(groupId, status, rss);
	}

	public com.vportal.portlet.vlegal.model.VLegalType addTypeNew(long arg0,
		long arg1, long arg2, java.lang.String arg3, java.lang.String arg4,
		java.lang.String arg5, boolean arg6, boolean arg7,
		com.liferay.portal.theme.ThemeDisplay arg8)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException, java.rmi.RemoteException {
		return _vLegalTypeService.addTypeNew(arg0, arg1, arg2, arg3, arg4,
			arg5, arg6, arg7, arg8);
	}

	public java.util.List getDocByType(java.lang.String arg0,
		java.lang.String arg1, int arg2)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException, java.rmi.RemoteException {
		return _vLegalTypeService.getDocByType(arg0, arg1, arg2);
	}

	public com.vportal.portlet.vlegal.model.VLegalType updateTypeNew(
		long arg0, long arg1, java.lang.String arg2, java.lang.String arg3,
		java.lang.String arg4, java.lang.String arg5, int arg6, boolean arg7,
		boolean arg8)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException, java.rmi.RemoteException {
		return _vLegalTypeService.updateTypeNew(arg0, arg1, arg2, arg3, arg4,
			arg5, arg6, arg7, arg8);
	}

	public VLegalTypeService getWrappedVLegalTypeService() {
		return _vLegalTypeService;
	}

	private VLegalTypeService _vLegalTypeService;
}