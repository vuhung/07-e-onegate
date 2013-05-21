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

package com.vportal.portlet.vlinksman.service;

import com.liferay.portal.kernel.util.ClassLoaderProxy;
import com.liferay.portal.kernel.util.MethodHandler;
import com.liferay.portal.kernel.util.MethodKey;

/**
 * @author hai
 */
public class LinksServiceClp implements LinksService {
	public LinksServiceClp(ClassLoaderProxy classLoaderProxy) {
		_classLoaderProxy = classLoaderProxy;
	}

	public com.vportal.portlet.vlinksman.model.Links addLinks(long groupId,
		long companyId, long plid, long linkgroupId, java.lang.String name,
		java.lang.String description, java.lang.String url, int position,
		long userId, java.lang.String[] communityPermissions,
		java.lang.String[] guestPermissions)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.rmi.RemoteException {
		Object returnObj = null;

		MethodHandler methodHandler = new MethodHandler(_addLinksMethodKey0,
				groupId, companyId, plid, linkgroupId, name, description, url,
				position, userId, communityPermissions, guestPermissions);

		try {
			returnObj = _classLoaderProxy.invoke(methodHandler);
		}
		catch (Throwable t) {
			if (t instanceof com.liferay.portal.kernel.exception.PortalException) {
				throw (com.liferay.portal.kernel.exception.PortalException)t;
			}

			if (t instanceof com.liferay.portal.kernel.exception.SystemException) {
				throw (com.liferay.portal.kernel.exception.SystemException)t;
			}

			if (t instanceof java.rmi.RemoteException) {
				throw (java.rmi.RemoteException)t;
			}

			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}

		return (com.vportal.portlet.vlinksman.model.Links)ClpSerializer.translateOutput(returnObj);
	}

	public com.vportal.portlet.vlinksman.model.Links addLinks(long groupId,
		long companyId, long plid, long linkgroupId, java.lang.String name,
		java.lang.String description, java.lang.String url, int position,
		long userId, java.lang.Boolean addCommunityPermissions,
		java.lang.Boolean addGuestPermissions,
		java.lang.String[] communityPermissions,
		java.lang.String[] guestPermissions)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.rmi.RemoteException {
		Object returnObj = null;

		MethodHandler methodHandler = new MethodHandler(_addLinksMethodKey1,
				groupId, companyId, plid, linkgroupId, name, description, url,
				position, userId, addCommunityPermissions, addGuestPermissions,
				communityPermissions, guestPermissions);

		try {
			returnObj = _classLoaderProxy.invoke(methodHandler);
		}
		catch (Throwable t) {
			if (t instanceof com.liferay.portal.kernel.exception.PortalException) {
				throw (com.liferay.portal.kernel.exception.PortalException)t;
			}

			if (t instanceof com.liferay.portal.kernel.exception.SystemException) {
				throw (com.liferay.portal.kernel.exception.SystemException)t;
			}

			if (t instanceof java.rmi.RemoteException) {
				throw (java.rmi.RemoteException)t;
			}

			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}

		return (com.vportal.portlet.vlinksman.model.Links)ClpSerializer.translateOutput(returnObj);
	}

	public com.vportal.portlet.vlinksman.model.Links addLinks(long groupId,
		long companyId, long plid, long linkgroupId, java.lang.String name,
		java.lang.String description, java.lang.String url, int position,
		long userId, java.lang.Boolean hasImage,
		java.lang.Boolean isTargetBlank, java.lang.String imageName,
		java.lang.String[] communityPermissions,
		java.lang.String[] guestPermissions)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.rmi.RemoteException {
		Object returnObj = null;

		MethodHandler methodHandler = new MethodHandler(_addLinksMethodKey2,
				groupId, companyId, plid, linkgroupId, name, description, url,
				position, userId, hasImage, isTargetBlank, imageName,
				communityPermissions, guestPermissions);

		try {
			returnObj = _classLoaderProxy.invoke(methodHandler);
		}
		catch (Throwable t) {
			if (t instanceof com.liferay.portal.kernel.exception.PortalException) {
				throw (com.liferay.portal.kernel.exception.PortalException)t;
			}

			if (t instanceof com.liferay.portal.kernel.exception.SystemException) {
				throw (com.liferay.portal.kernel.exception.SystemException)t;
			}

			if (t instanceof java.rmi.RemoteException) {
				throw (java.rmi.RemoteException)t;
			}

			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}

		return (com.vportal.portlet.vlinksman.model.Links)ClpSerializer.translateOutput(returnObj);
	}

	public com.vportal.portlet.vlinksman.model.Links addLinks(long groupId,
		long companyId, long plid, long linkgroupId, java.lang.String name,
		java.lang.String description, java.lang.String url, int position,
		long userId, java.lang.Boolean hasImage,
		java.lang.Boolean isTargetBlank, java.lang.String imageName,
		java.lang.Boolean addCommunityPermissions,
		java.lang.Boolean addGuestPermissions,
		java.lang.String[] communityPermissions,
		java.lang.String[] guestPermissions)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.rmi.RemoteException {
		Object returnObj = null;

		MethodHandler methodHandler = new MethodHandler(_addLinksMethodKey3,
				groupId, companyId, plid, linkgroupId, name, description, url,
				position, userId, hasImage, isTargetBlank, imageName,
				addCommunityPermissions, addGuestPermissions,
				communityPermissions, guestPermissions);

		try {
			returnObj = _classLoaderProxy.invoke(methodHandler);
		}
		catch (Throwable t) {
			if (t instanceof com.liferay.portal.kernel.exception.PortalException) {
				throw (com.liferay.portal.kernel.exception.PortalException)t;
			}

			if (t instanceof com.liferay.portal.kernel.exception.SystemException) {
				throw (com.liferay.portal.kernel.exception.SystemException)t;
			}

			if (t instanceof java.rmi.RemoteException) {
				throw (java.rmi.RemoteException)t;
			}

			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}

		return (com.vportal.portlet.vlinksman.model.Links)ClpSerializer.translateOutput(returnObj);
	}

	public com.vportal.portlet.vlinksman.model.Links addLinks(long groupId,
		long companyId, long plid, long linkgroupId, java.lang.String name,
		java.lang.String description, java.lang.String url, int position,
		long userId, java.lang.Boolean hasImage,
		java.lang.Boolean isTargetBlank, java.lang.String imageName,
		long folderId, java.lang.String[] communityPermissions,
		java.lang.String[] guestPermissions)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.rmi.RemoteException {
		Object returnObj = null;

		MethodHandler methodHandler = new MethodHandler(_addLinksMethodKey4,
				groupId, companyId, plid, linkgroupId, name, description, url,
				position, userId, hasImage, isTargetBlank, imageName, folderId,
				communityPermissions, guestPermissions);

		try {
			returnObj = _classLoaderProxy.invoke(methodHandler);
		}
		catch (Throwable t) {
			if (t instanceof com.liferay.portal.kernel.exception.PortalException) {
				throw (com.liferay.portal.kernel.exception.PortalException)t;
			}

			if (t instanceof com.liferay.portal.kernel.exception.SystemException) {
				throw (com.liferay.portal.kernel.exception.SystemException)t;
			}

			if (t instanceof java.rmi.RemoteException) {
				throw (java.rmi.RemoteException)t;
			}

			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}

		return (com.vportal.portlet.vlinksman.model.Links)ClpSerializer.translateOutput(returnObj);
	}

	public com.vportal.portlet.vlinksman.model.Links addLinks(long groupId,
		long companyId, long plid, long linkgroupId, java.lang.String name,
		java.lang.String description, java.lang.String url, int position,
		long userId, java.lang.Boolean hasImage,
		java.lang.Boolean isTargetBlank, java.lang.String imageName,
		long folderId, java.lang.Boolean addCommunityPermissions,
		java.lang.Boolean addGuestPermissions,
		java.lang.String[] communityPermissions,
		java.lang.String[] guestPermissions)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.rmi.RemoteException {
		Object returnObj = null;

		MethodHandler methodHandler = new MethodHandler(_addLinksMethodKey5,
				groupId, companyId, plid, linkgroupId, name, description, url,
				position, userId, hasImage, isTargetBlank, imageName, folderId,
				addCommunityPermissions, addGuestPermissions,
				communityPermissions, guestPermissions);

		try {
			returnObj = _classLoaderProxy.invoke(methodHandler);
		}
		catch (Throwable t) {
			if (t instanceof com.liferay.portal.kernel.exception.PortalException) {
				throw (com.liferay.portal.kernel.exception.PortalException)t;
			}

			if (t instanceof com.liferay.portal.kernel.exception.SystemException) {
				throw (com.liferay.portal.kernel.exception.SystemException)t;
			}

			if (t instanceof java.rmi.RemoteException) {
				throw (java.rmi.RemoteException)t;
			}

			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}

		return (com.vportal.portlet.vlinksman.model.Links)ClpSerializer.translateOutput(returnObj);
	}

	public com.vportal.portlet.vlinksman.model.Links addLinks(
		com.vportal.portlet.vlinksman.model.Links link, long plid,
		java.lang.Boolean addCommunityPermissions,
		java.lang.Boolean addGuestPermissions,
		java.lang.String[] communityPermissions,
		java.lang.String[] guestPermissions)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			com.liferay.portal.security.auth.PrincipalException {
		Object returnObj = null;

		MethodHandler methodHandler = new MethodHandler(_addLinksMethodKey6,
				link, plid, addCommunityPermissions, addGuestPermissions,
				communityPermissions, guestPermissions);

		try {
			returnObj = _classLoaderProxy.invoke(methodHandler);
		}
		catch (Throwable t) {
			if (t instanceof com.liferay.portal.kernel.exception.PortalException) {
				throw (com.liferay.portal.kernel.exception.PortalException)t;
			}

			if (t instanceof com.liferay.portal.kernel.exception.SystemException) {
				throw (com.liferay.portal.kernel.exception.SystemException)t;
			}

			if (t instanceof com.liferay.portal.security.auth.PrincipalException) {
				throw (com.liferay.portal.security.auth.PrincipalException)t;
			}

			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}

		return (com.vportal.portlet.vlinksman.model.Links)ClpSerializer.translateOutput(returnObj);
	}

	public com.vportal.portlet.vlinksman.model.Links updateLinks(
		com.vportal.portlet.vlinksman.model.Links link)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			com.liferay.portal.security.auth.PrincipalException,
			java.rmi.RemoteException {
		Object returnObj = null;

		MethodHandler methodHandler = new MethodHandler(_updateLinksMethodKey7,
				link);

		try {
			returnObj = _classLoaderProxy.invoke(methodHandler);
		}
		catch (Throwable t) {
			if (t instanceof com.liferay.portal.kernel.exception.PortalException) {
				throw (com.liferay.portal.kernel.exception.PortalException)t;
			}

			if (t instanceof com.liferay.portal.kernel.exception.SystemException) {
				throw (com.liferay.portal.kernel.exception.SystemException)t;
			}

			if (t instanceof com.liferay.portal.security.auth.PrincipalException) {
				throw (com.liferay.portal.security.auth.PrincipalException)t;
			}

			if (t instanceof java.rmi.RemoteException) {
				throw (java.rmi.RemoteException)t;
			}

			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}

		return (com.vportal.portlet.vlinksman.model.Links)ClpSerializer.translateOutput(returnObj);
	}

	public com.vportal.portlet.vlinksman.model.Links updateLinks(long linkId,
		long groupId, long companyId, long linkgroupId, java.lang.String name,
		java.lang.String description, java.lang.String url, int position)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.rmi.RemoteException {
		Object returnObj = null;

		MethodHandler methodHandler = new MethodHandler(_updateLinksMethodKey8,
				linkId, groupId, companyId, linkgroupId, name, description,
				url, position);

		try {
			returnObj = _classLoaderProxy.invoke(methodHandler);
		}
		catch (Throwable t) {
			if (t instanceof com.liferay.portal.kernel.exception.PortalException) {
				throw (com.liferay.portal.kernel.exception.PortalException)t;
			}

			if (t instanceof com.liferay.portal.kernel.exception.SystemException) {
				throw (com.liferay.portal.kernel.exception.SystemException)t;
			}

			if (t instanceof java.rmi.RemoteException) {
				throw (java.rmi.RemoteException)t;
			}

			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}

		return (com.vportal.portlet.vlinksman.model.Links)ClpSerializer.translateOutput(returnObj);
	}

	public com.vportal.portlet.vlinksman.model.Links updateLink(
		com.vportal.portlet.vlinksman.model.Links link)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.rmi.RemoteException {
		Object returnObj = null;

		MethodHandler methodHandler = new MethodHandler(_updateLinkMethodKey9,
				link);

		try {
			returnObj = _classLoaderProxy.invoke(methodHandler);
		}
		catch (Throwable t) {
			if (t instanceof com.liferay.portal.kernel.exception.PortalException) {
				throw (com.liferay.portal.kernel.exception.PortalException)t;
			}

			if (t instanceof com.liferay.portal.kernel.exception.SystemException) {
				throw (com.liferay.portal.kernel.exception.SystemException)t;
			}

			if (t instanceof java.rmi.RemoteException) {
				throw (java.rmi.RemoteException)t;
			}

			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}

		return (com.vportal.portlet.vlinksman.model.Links)ClpSerializer.translateOutput(returnObj);
	}

	public com.vportal.portlet.vlinksman.model.Links updateLinks(long linkId,
		long groupId, long companyId, long linkgroupId, java.lang.String name,
		java.lang.String description, java.lang.String url, int position,
		java.lang.Boolean hasImage, java.lang.Boolean isTargetBlank,
		java.lang.String imageName)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.rmi.RemoteException {
		Object returnObj = null;

		MethodHandler methodHandler = new MethodHandler(_updateLinksMethodKey10,
				linkId, groupId, companyId, linkgroupId, name, description,
				url, position, hasImage, isTargetBlank, imageName);

		try {
			returnObj = _classLoaderProxy.invoke(methodHandler);
		}
		catch (Throwable t) {
			if (t instanceof com.liferay.portal.kernel.exception.PortalException) {
				throw (com.liferay.portal.kernel.exception.PortalException)t;
			}

			if (t instanceof com.liferay.portal.kernel.exception.SystemException) {
				throw (com.liferay.portal.kernel.exception.SystemException)t;
			}

			if (t instanceof java.rmi.RemoteException) {
				throw (java.rmi.RemoteException)t;
			}

			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}

		return (com.vportal.portlet.vlinksman.model.Links)ClpSerializer.translateOutput(returnObj);
	}

	public com.vportal.portlet.vlinksman.model.Links updateLinks(long linkId,
		long groupId, long companyId, long linkgroupId, java.lang.String name,
		java.lang.String description, java.lang.String url, int position,
		java.lang.Boolean hasImage, java.lang.Boolean isTargetBlank,
		java.lang.String imageName, long folderId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.rmi.RemoteException {
		Object returnObj = null;

		MethodHandler methodHandler = new MethodHandler(_updateLinksMethodKey11,
				linkId, groupId, companyId, linkgroupId, name, description,
				url, position, hasImage, isTargetBlank, imageName, folderId);

		try {
			returnObj = _classLoaderProxy.invoke(methodHandler);
		}
		catch (Throwable t) {
			if (t instanceof com.liferay.portal.kernel.exception.PortalException) {
				throw (com.liferay.portal.kernel.exception.PortalException)t;
			}

			if (t instanceof com.liferay.portal.kernel.exception.SystemException) {
				throw (com.liferay.portal.kernel.exception.SystemException)t;
			}

			if (t instanceof java.rmi.RemoteException) {
				throw (java.rmi.RemoteException)t;
			}

			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}

		return (com.vportal.portlet.vlinksman.model.Links)ClpSerializer.translateOutput(returnObj);
	}

	public com.vportal.portlet.vlinksman.model.Links updateLink2(
		com.vportal.portlet.vlinksman.model.Links link)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.rmi.RemoteException {
		Object returnObj = null;

		MethodHandler methodHandler = new MethodHandler(_updateLink2MethodKey12,
				link);

		try {
			returnObj = _classLoaderProxy.invoke(methodHandler);
		}
		catch (Throwable t) {
			if (t instanceof com.liferay.portal.kernel.exception.PortalException) {
				throw (com.liferay.portal.kernel.exception.PortalException)t;
			}

			if (t instanceof com.liferay.portal.kernel.exception.SystemException) {
				throw (com.liferay.portal.kernel.exception.SystemException)t;
			}

			if (t instanceof java.rmi.RemoteException) {
				throw (java.rmi.RemoteException)t;
			}

			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}

		return (com.vportal.portlet.vlinksman.model.Links)ClpSerializer.translateOutput(returnObj);
	}

	public com.vportal.portlet.vlinksman.model.Links updateLink3(
		com.vportal.portlet.vlinksman.model.Links link)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.rmi.RemoteException {
		Object returnObj = null;

		MethodHandler methodHandler = new MethodHandler(_updateLink3MethodKey13,
				link);

		try {
			returnObj = _classLoaderProxy.invoke(methodHandler);
		}
		catch (Throwable t) {
			if (t instanceof com.liferay.portal.kernel.exception.PortalException) {
				throw (com.liferay.portal.kernel.exception.PortalException)t;
			}

			if (t instanceof com.liferay.portal.kernel.exception.SystemException) {
				throw (com.liferay.portal.kernel.exception.SystemException)t;
			}

			if (t instanceof java.rmi.RemoteException) {
				throw (java.rmi.RemoteException)t;
			}

			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}

		return (com.vportal.portlet.vlinksman.model.Links)ClpSerializer.translateOutput(returnObj);
	}

	public void deleteLink(long linkId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.rmi.RemoteException {
		MethodHandler methodHandler = new MethodHandler(_deleteLinkMethodKey14,
				linkId);

		try {
			_classLoaderProxy.invoke(methodHandler);
		}
		catch (Throwable t) {
			if (t instanceof com.liferay.portal.kernel.exception.PortalException) {
				throw (com.liferay.portal.kernel.exception.PortalException)t;
			}

			if (t instanceof com.liferay.portal.kernel.exception.SystemException) {
				throw (com.liferay.portal.kernel.exception.SystemException)t;
			}

			if (t instanceof java.rmi.RemoteException) {
				throw (java.rmi.RemoteException)t;
			}

			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}
	}

	public java.util.List getAll()
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.rmi.RemoteException {
		Object returnObj = null;

		MethodHandler methodHandler = new MethodHandler(_getAllMethodKey15);

		try {
			returnObj = _classLoaderProxy.invoke(methodHandler);
		}
		catch (Throwable t) {
			if (t instanceof com.liferay.portal.kernel.exception.PortalException) {
				throw (com.liferay.portal.kernel.exception.PortalException)t;
			}

			if (t instanceof com.liferay.portal.kernel.exception.SystemException) {
				throw (com.liferay.portal.kernel.exception.SystemException)t;
			}

			if (t instanceof java.rmi.RemoteException) {
				throw (java.rmi.RemoteException)t;
			}

			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}

		return (java.util.List)ClpSerializer.translateOutput(returnObj);
	}

	public java.util.List getByLinkGroupId(long linkGroupId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.rmi.RemoteException {
		Object returnObj = null;

		MethodHandler methodHandler = new MethodHandler(_getByLinkGroupIdMethodKey16,
				linkGroupId);

		try {
			returnObj = _classLoaderProxy.invoke(methodHandler);
		}
		catch (Throwable t) {
			if (t instanceof com.liferay.portal.kernel.exception.PortalException) {
				throw (com.liferay.portal.kernel.exception.PortalException)t;
			}

			if (t instanceof com.liferay.portal.kernel.exception.SystemException) {
				throw (com.liferay.portal.kernel.exception.SystemException)t;
			}

			if (t instanceof java.rmi.RemoteException) {
				throw (java.rmi.RemoteException)t;
			}

			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}

		return (java.util.List)ClpSerializer.translateOutput(returnObj);
	}

	public java.util.List getByGroupId(long groupId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.rmi.RemoteException {
		Object returnObj = null;

		MethodHandler methodHandler = new MethodHandler(_getByGroupIdMethodKey17,
				groupId);

		try {
			returnObj = _classLoaderProxy.invoke(methodHandler);
		}
		catch (Throwable t) {
			if (t instanceof com.liferay.portal.kernel.exception.PortalException) {
				throw (com.liferay.portal.kernel.exception.PortalException)t;
			}

			if (t instanceof com.liferay.portal.kernel.exception.SystemException) {
				throw (com.liferay.portal.kernel.exception.SystemException)t;
			}

			if (t instanceof java.rmi.RemoteException) {
				throw (java.rmi.RemoteException)t;
			}

			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}

		return (java.util.List)ClpSerializer.translateOutput(returnObj);
	}

	public java.util.List getByGroupId(long groupId, int start, int end)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.rmi.RemoteException {
		Object returnObj = null;

		MethodHandler methodHandler = new MethodHandler(_getByGroupIdMethodKey18,
				groupId, start, end);

		try {
			returnObj = _classLoaderProxy.invoke(methodHandler);
		}
		catch (Throwable t) {
			if (t instanceof com.liferay.portal.kernel.exception.PortalException) {
				throw (com.liferay.portal.kernel.exception.PortalException)t;
			}

			if (t instanceof com.liferay.portal.kernel.exception.SystemException) {
				throw (com.liferay.portal.kernel.exception.SystemException)t;
			}

			if (t instanceof java.rmi.RemoteException) {
				throw (java.rmi.RemoteException)t;
			}

			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}

		return (java.util.List)ClpSerializer.translateOutput(returnObj);
	}

	public int countByGroupId(long groupId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.rmi.RemoteException {
		Object returnObj = null;

		MethodHandler methodHandler = new MethodHandler(_countByGroupIdMethodKey19,
				groupId);

		try {
			returnObj = _classLoaderProxy.invoke(methodHandler);
		}
		catch (Throwable t) {
			if (t instanceof com.liferay.portal.kernel.exception.PortalException) {
				throw (com.liferay.portal.kernel.exception.PortalException)t;
			}

			if (t instanceof com.liferay.portal.kernel.exception.SystemException) {
				throw (com.liferay.portal.kernel.exception.SystemException)t;
			}

			if (t instanceof java.rmi.RemoteException) {
				throw (java.rmi.RemoteException)t;
			}

			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}

		return ((Integer)returnObj).intValue();
	}

	public java.util.List getByLinkG_GL(long groupId, long linkGroupId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.rmi.RemoteException {
		Object returnObj = null;

		MethodHandler methodHandler = new MethodHandler(_getByLinkG_GLMethodKey20,
				groupId, linkGroupId);

		try {
			returnObj = _classLoaderProxy.invoke(methodHandler);
		}
		catch (Throwable t) {
			if (t instanceof com.liferay.portal.kernel.exception.PortalException) {
				throw (com.liferay.portal.kernel.exception.PortalException)t;
			}

			if (t instanceof com.liferay.portal.kernel.exception.SystemException) {
				throw (com.liferay.portal.kernel.exception.SystemException)t;
			}

			if (t instanceof java.rmi.RemoteException) {
				throw (java.rmi.RemoteException)t;
			}

			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}

		return (java.util.List)ClpSerializer.translateOutput(returnObj);
	}

	public java.util.List getByLinkG_GL(long groupId, long linkGroupId,
		int start, int end)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.rmi.RemoteException {
		Object returnObj = null;

		MethodHandler methodHandler = new MethodHandler(_getByLinkG_GLMethodKey21,
				groupId, linkGroupId, start, end);

		try {
			returnObj = _classLoaderProxy.invoke(methodHandler);
		}
		catch (Throwable t) {
			if (t instanceof com.liferay.portal.kernel.exception.PortalException) {
				throw (com.liferay.portal.kernel.exception.PortalException)t;
			}

			if (t instanceof com.liferay.portal.kernel.exception.SystemException) {
				throw (com.liferay.portal.kernel.exception.SystemException)t;
			}

			if (t instanceof java.rmi.RemoteException) {
				throw (java.rmi.RemoteException)t;
			}

			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}

		return (java.util.List)ClpSerializer.translateOutput(returnObj);
	}

	public com.vportal.portlet.vlinksman.model.Links getLinks(long linkId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.rmi.RemoteException {
		Object returnObj = null;

		MethodHandler methodHandler = new MethodHandler(_getLinksMethodKey22,
				linkId);

		try {
			returnObj = _classLoaderProxy.invoke(methodHandler);
		}
		catch (Throwable t) {
			if (t instanceof com.liferay.portal.kernel.exception.PortalException) {
				throw (com.liferay.portal.kernel.exception.PortalException)t;
			}

			if (t instanceof com.liferay.portal.kernel.exception.SystemException) {
				throw (com.liferay.portal.kernel.exception.SystemException)t;
			}

			if (t instanceof java.rmi.RemoteException) {
				throw (java.rmi.RemoteException)t;
			}

			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}

		return (com.vportal.portlet.vlinksman.model.Links)ClpSerializer.translateOutput(returnObj);
	}

	public void addLinksResources(long linkId, boolean addCommunityPermissions,
		boolean addGuestPermissions)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		MethodHandler methodHandler = new MethodHandler(_addLinksResourcesMethodKey23,
				linkId, addCommunityPermissions, addGuestPermissions);

		try {
			_classLoaderProxy.invoke(methodHandler);
		}
		catch (Throwable t) {
			if (t instanceof com.liferay.portal.kernel.exception.PortalException) {
				throw (com.liferay.portal.kernel.exception.PortalException)t;
			}

			if (t instanceof com.liferay.portal.kernel.exception.SystemException) {
				throw (com.liferay.portal.kernel.exception.SystemException)t;
			}

			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}
	}

	public void addLinksResources(
		com.vportal.portlet.vlinksman.model.Links link,
		boolean addCommunityPermissions, boolean addGuestPermissions)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		MethodHandler methodHandler = new MethodHandler(_addLinksResourcesMethodKey24,
				link, addCommunityPermissions, addGuestPermissions);

		try {
			_classLoaderProxy.invoke(methodHandler);
		}
		catch (Throwable t) {
			if (t instanceof com.liferay.portal.kernel.exception.PortalException) {
				throw (com.liferay.portal.kernel.exception.PortalException)t;
			}

			if (t instanceof com.liferay.portal.kernel.exception.SystemException) {
				throw (com.liferay.portal.kernel.exception.SystemException)t;
			}

			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}
	}

	public void addLinksResources(long linkId,
		java.lang.String[] communityPermissions,
		java.lang.String[] guestPermissions)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		MethodHandler methodHandler = new MethodHandler(_addLinksResourcesMethodKey25,
				linkId, communityPermissions, guestPermissions);

		try {
			_classLoaderProxy.invoke(methodHandler);
		}
		catch (Throwable t) {
			if (t instanceof com.liferay.portal.kernel.exception.PortalException) {
				throw (com.liferay.portal.kernel.exception.PortalException)t;
			}

			if (t instanceof com.liferay.portal.kernel.exception.SystemException) {
				throw (com.liferay.portal.kernel.exception.SystemException)t;
			}

			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}
	}

	public void addLinksResources(
		com.vportal.portlet.vlinksman.model.Links link,
		java.lang.String[] communityPermissions,
		java.lang.String[] guestPermissions)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		MethodHandler methodHandler = new MethodHandler(_addLinksResourcesMethodKey26,
				link, communityPermissions, guestPermissions);

		try {
			_classLoaderProxy.invoke(methodHandler);
		}
		catch (Throwable t) {
			if (t instanceof com.liferay.portal.kernel.exception.PortalException) {
				throw (com.liferay.portal.kernel.exception.PortalException)t;
			}

			if (t instanceof com.liferay.portal.kernel.exception.SystemException) {
				throw (com.liferay.portal.kernel.exception.SystemException)t;
			}

			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}
	}

	public void _validate(java.lang.String name, java.lang.String url)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.rmi.RemoteException {
		MethodHandler methodHandler = new MethodHandler(__validateMethodKey27,
				name, url);

		try {
			_classLoaderProxy.invoke(methodHandler);
		}
		catch (Throwable t) {
			if (t instanceof com.liferay.portal.kernel.exception.PortalException) {
				throw (com.liferay.portal.kernel.exception.PortalException)t;
			}

			if (t instanceof com.liferay.portal.kernel.exception.SystemException) {
				throw (com.liferay.portal.kernel.exception.SystemException)t;
			}

			if (t instanceof java.rmi.RemoteException) {
				throw (java.rmi.RemoteException)t;
			}

			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}
	}

	public ClassLoaderProxy getClassLoaderProxy() {
		return _classLoaderProxy;
	}

	private ClassLoaderProxy _classLoaderProxy;
	private MethodKey _addLinksMethodKey0 = new MethodKey(_classLoaderProxy.getClassName(),
			"addLinks", long.class, long.class, long.class, long.class,
			java.lang.String.class, java.lang.String.class,
			java.lang.String.class, int.class, long.class,
			java.lang.String[].class, java.lang.String[].class);
	private MethodKey _addLinksMethodKey1 = new MethodKey(_classLoaderProxy.getClassName(),
			"addLinks", long.class, long.class, long.class, long.class,
			java.lang.String.class, java.lang.String.class,
			java.lang.String.class, int.class, long.class,
			java.lang.Boolean.class, java.lang.Boolean.class,
			java.lang.String[].class, java.lang.String[].class);
	private MethodKey _addLinksMethodKey2 = new MethodKey(_classLoaderProxy.getClassName(),
			"addLinks", long.class, long.class, long.class, long.class,
			java.lang.String.class, java.lang.String.class,
			java.lang.String.class, int.class, long.class,
			java.lang.Boolean.class, java.lang.Boolean.class,
			java.lang.String.class, java.lang.String[].class,
			java.lang.String[].class);
	private MethodKey _addLinksMethodKey3 = new MethodKey(_classLoaderProxy.getClassName(),
			"addLinks", long.class, long.class, long.class, long.class,
			java.lang.String.class, java.lang.String.class,
			java.lang.String.class, int.class, long.class,
			java.lang.Boolean.class, java.lang.Boolean.class,
			java.lang.String.class, java.lang.Boolean.class,
			java.lang.Boolean.class, java.lang.String[].class,
			java.lang.String[].class);
	private MethodKey _addLinksMethodKey4 = new MethodKey(_classLoaderProxy.getClassName(),
			"addLinks", long.class, long.class, long.class, long.class,
			java.lang.String.class, java.lang.String.class,
			java.lang.String.class, int.class, long.class,
			java.lang.Boolean.class, java.lang.Boolean.class,
			java.lang.String.class, long.class, java.lang.String[].class,
			java.lang.String[].class);
	private MethodKey _addLinksMethodKey5 = new MethodKey(_classLoaderProxy.getClassName(),
			"addLinks", long.class, long.class, long.class, long.class,
			java.lang.String.class, java.lang.String.class,
			java.lang.String.class, int.class, long.class,
			java.lang.Boolean.class, java.lang.Boolean.class,
			java.lang.String.class, long.class, java.lang.Boolean.class,
			java.lang.Boolean.class, java.lang.String[].class,
			java.lang.String[].class);
	private MethodKey _addLinksMethodKey6 = new MethodKey(_classLoaderProxy.getClassName(),
			"addLinks", com.vportal.portlet.vlinksman.model.Links.class,
			long.class, java.lang.Boolean.class, java.lang.Boolean.class,
			java.lang.String[].class, java.lang.String[].class);
	private MethodKey _updateLinksMethodKey7 = new MethodKey(_classLoaderProxy.getClassName(),
			"updateLinks", com.vportal.portlet.vlinksman.model.Links.class);
	private MethodKey _updateLinksMethodKey8 = new MethodKey(_classLoaderProxy.getClassName(),
			"updateLinks", long.class, long.class, long.class, long.class,
			java.lang.String.class, java.lang.String.class,
			java.lang.String.class, int.class);
	private MethodKey _updateLinkMethodKey9 = new MethodKey(_classLoaderProxy.getClassName(),
			"updateLink", com.vportal.portlet.vlinksman.model.Links.class);
	private MethodKey _updateLinksMethodKey10 = new MethodKey(_classLoaderProxy.getClassName(),
			"updateLinks", long.class, long.class, long.class, long.class,
			java.lang.String.class, java.lang.String.class,
			java.lang.String.class, int.class, java.lang.Boolean.class,
			java.lang.Boolean.class, java.lang.String.class);
	private MethodKey _updateLinksMethodKey11 = new MethodKey(_classLoaderProxy.getClassName(),
			"updateLinks", long.class, long.class, long.class, long.class,
			java.lang.String.class, java.lang.String.class,
			java.lang.String.class, int.class, java.lang.Boolean.class,
			java.lang.Boolean.class, java.lang.String.class, long.class);
	private MethodKey _updateLink2MethodKey12 = new MethodKey(_classLoaderProxy.getClassName(),
			"updateLink2", com.vportal.portlet.vlinksman.model.Links.class);
	private MethodKey _updateLink3MethodKey13 = new MethodKey(_classLoaderProxy.getClassName(),
			"updateLink3", com.vportal.portlet.vlinksman.model.Links.class);
	private MethodKey _deleteLinkMethodKey14 = new MethodKey(_classLoaderProxy.getClassName(),
			"deleteLink", long.class);
	private MethodKey _getAllMethodKey15 = new MethodKey(_classLoaderProxy.getClassName(),
			"getAll");
	private MethodKey _getByLinkGroupIdMethodKey16 = new MethodKey(_classLoaderProxy.getClassName(),
			"getByLinkGroupId", long.class);
	private MethodKey _getByGroupIdMethodKey17 = new MethodKey(_classLoaderProxy.getClassName(),
			"getByGroupId", long.class);
	private MethodKey _getByGroupIdMethodKey18 = new MethodKey(_classLoaderProxy.getClassName(),
			"getByGroupId", long.class, int.class, int.class);
	private MethodKey _countByGroupIdMethodKey19 = new MethodKey(_classLoaderProxy.getClassName(),
			"countByGroupId", long.class);
	private MethodKey _getByLinkG_GLMethodKey20 = new MethodKey(_classLoaderProxy.getClassName(),
			"getByLinkG_GL", long.class, long.class);
	private MethodKey _getByLinkG_GLMethodKey21 = new MethodKey(_classLoaderProxy.getClassName(),
			"getByLinkG_GL", long.class, long.class, int.class, int.class);
	private MethodKey _getLinksMethodKey22 = new MethodKey(_classLoaderProxy.getClassName(),
			"getLinks", long.class);
	private MethodKey _addLinksResourcesMethodKey23 = new MethodKey(_classLoaderProxy.getClassName(),
			"addLinksResources", long.class, boolean.class, boolean.class);
	private MethodKey _addLinksResourcesMethodKey24 = new MethodKey(_classLoaderProxy.getClassName(),
			"addLinksResources",
			com.vportal.portlet.vlinksman.model.Links.class, boolean.class,
			boolean.class);
	private MethodKey _addLinksResourcesMethodKey25 = new MethodKey(_classLoaderProxy.getClassName(),
			"addLinksResources", long.class, java.lang.String[].class,
			java.lang.String[].class);
	private MethodKey _addLinksResourcesMethodKey26 = new MethodKey(_classLoaderProxy.getClassName(),
			"addLinksResources",
			com.vportal.portlet.vlinksman.model.Links.class,
			java.lang.String[].class, java.lang.String[].class);
	private MethodKey __validateMethodKey27 = new MethodKey(_classLoaderProxy.getClassName(),
			"_validate", java.lang.String.class, java.lang.String.class);
}