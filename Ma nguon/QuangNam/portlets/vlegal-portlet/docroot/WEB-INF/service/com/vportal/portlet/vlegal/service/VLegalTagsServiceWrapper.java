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
 * This class is a wrapper for {@link VLegalTagsService}.
 * </p>
 *
 * @author    ACB
 * @see       VLegalTagsService
 * @generated
 */
public class VLegalTagsServiceWrapper implements VLegalTagsService {
	public VLegalTagsServiceWrapper(VLegalTagsService vLegalTagsService) {
		_vLegalTagsService = vLegalTagsService;
	}

	public com.vportal.portlet.vlegal.model.VLegalTags addTag(long groupId,
		java.lang.String name, boolean status,
		java.lang.String[] communityPermissions,
		java.lang.String[] guestPermissions,
		com.liferay.portal.theme.ThemeDisplay themeDisplay)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			com.liferay.portal.security.auth.PrincipalException,
			java.rmi.RemoteException {
		return _vLegalTagsService.addTag(groupId, name, status,
			communityPermissions, guestPermissions, themeDisplay);
	}

	public com.vportal.portlet.vlegal.model.VLegalTags addTag(long groupId,
		java.lang.String name, boolean status,
		java.lang.Boolean addCommunityPermissions,
		java.lang.Boolean addGuestPermissions,
		java.lang.String[] communityPermissions,
		java.lang.String[] guestPermissions,
		com.liferay.portal.theme.ThemeDisplay themeDisplay)
		throws com.liferay.portal.NoSuchUserException,
			com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			com.liferay.portal.security.auth.PrincipalException,
			com.vportal.portlet.vlegal.NoSuchVLegalTagsException,
			java.rmi.RemoteException {
		return _vLegalTagsService.addTag(groupId, name, status,
			addCommunityPermissions, addGuestPermissions, communityPermissions,
			guestPermissions, themeDisplay);
	}

	public void addEntryResources(
		com.vportal.portlet.vlegal.model.VLegalTags vTag,
		java.lang.String[] communityPermissions,
		java.lang.String[] guestPermissions)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vlegal.NoSuchVLegalTagsException {
		_vLegalTagsService.addEntryResources(vTag, communityPermissions,
			guestPermissions);
	}

	public void addEntryResources(
		com.vportal.portlet.vlegal.model.VLegalTags vTag,
		boolean addCommunityPermissions, boolean addGuestPermissions)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vlegal.NoSuchVLegalTagsException {
		_vLegalTagsService.addEntryResources(vTag, addCommunityPermissions,
			addGuestPermissions);
	}

	public void addEntryResources(long entryId,
		boolean addCommunityPermissions, boolean addGuestPermissions)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vlegal.NoSuchVLegalTagsException {
		_vLegalTagsService.addEntryResources(entryId, addCommunityPermissions,
			addGuestPermissions);
	}

	public void addEntryResources(long entryId,
		java.lang.String[] communityPermissions,
		java.lang.String[] guestPermissions)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vlegal.NoSuchVLegalTagsException {
		_vLegalTagsService.addEntryResources(entryId, communityPermissions,
			guestPermissions);
	}

	public com.vportal.portlet.vlegal.model.VLegalTags getTag(
		java.lang.String tagId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vlegal.NoSuchVLegalTagsException {
		return _vLegalTagsService.getTag(tagId);
	}

	public void deleteTag(java.lang.String tagId) {
		_vLegalTagsService.deleteTag(tagId);
	}

	public void deleteTags(java.lang.String[] tagId) {
		_vLegalTagsService.deleteTags(tagId);
	}

	public java.util.List getTag_Status(long groupId, boolean status) {
		return _vLegalTagsService.getTag_Status(groupId, status);
	}

	public java.util.List getTags(long groupId, java.lang.String name,
		java.lang.String status, boolean dup, int begin, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _vLegalTagsService.getTags(groupId, name, status, dup, begin, end);
	}

	public java.util.List getTagsByGroupId(long groupId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _vLegalTagsService.getTagsByGroupId(groupId);
	}

	public java.util.List getTag_Status(long groupId, boolean status,
		com.liferay.portal.kernel.util.OrderByComparator obc)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.rmi.RemoteException {
		return _vLegalTagsService.getTag_Status(groupId, status, obc);
	}

	public void _validator(long groupId, java.lang.String name)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		_vLegalTagsService._validator(groupId, name);
	}

	public VLegalTagsService getWrappedVLegalTagsService() {
		return _vLegalTagsService;
	}

	private VLegalTagsService _vLegalTagsService;
}