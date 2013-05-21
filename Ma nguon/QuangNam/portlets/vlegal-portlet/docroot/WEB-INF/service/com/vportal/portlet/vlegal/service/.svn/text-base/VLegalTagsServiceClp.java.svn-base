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

import com.liferay.portal.kernel.util.ClassLoaderProxy;
import com.liferay.portal.kernel.util.MethodHandler;
import com.liferay.portal.kernel.util.MethodKey;

/**
 * @author ACB
 */
public class VLegalTagsServiceClp implements VLegalTagsService {
	public VLegalTagsServiceClp(ClassLoaderProxy classLoaderProxy) {
		_classLoaderProxy = classLoaderProxy;
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
		Object returnObj = null;

		MethodHandler methodHandler = new MethodHandler(_addTagMethodKey0,
				groupId, name, status, communityPermissions, guestPermissions,
				themeDisplay);

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

		return (com.vportal.portlet.vlegal.model.VLegalTags)ClpSerializer.translateOutput(returnObj);
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
		Object returnObj = null;

		MethodHandler methodHandler = new MethodHandler(_addTagMethodKey1,
				groupId, name, status, addCommunityPermissions,
				addGuestPermissions, communityPermissions, guestPermissions,
				themeDisplay);

		try {
			returnObj = _classLoaderProxy.invoke(methodHandler);
		}
		catch (Throwable t) {
			if (t instanceof com.liferay.portal.NoSuchUserException) {
				throw (com.liferay.portal.NoSuchUserException)t;
			}

			if (t instanceof com.liferay.portal.kernel.exception.PortalException) {
				throw (com.liferay.portal.kernel.exception.PortalException)t;
			}

			if (t instanceof com.liferay.portal.kernel.exception.SystemException) {
				throw (com.liferay.portal.kernel.exception.SystemException)t;
			}

			if (t instanceof com.liferay.portal.security.auth.PrincipalException) {
				throw (com.liferay.portal.security.auth.PrincipalException)t;
			}

			if (t instanceof com.vportal.portlet.vlegal.NoSuchVLegalTagsException) {
				throw (com.vportal.portlet.vlegal.NoSuchVLegalTagsException)t;
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

		return (com.vportal.portlet.vlegal.model.VLegalTags)ClpSerializer.translateOutput(returnObj);
	}

	public void addEntryResources(
		com.vportal.portlet.vlegal.model.VLegalTags vTag,
		java.lang.String[] communityPermissions,
		java.lang.String[] guestPermissions)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vlegal.NoSuchVLegalTagsException {
		MethodHandler methodHandler = new MethodHandler(_addEntryResourcesMethodKey2,
				vTag, communityPermissions, guestPermissions);

		try {
			_classLoaderProxy.invoke(methodHandler);
		}
		catch (Throwable t) {
			if (t instanceof com.liferay.portal.kernel.exception.SystemException) {
				throw (com.liferay.portal.kernel.exception.SystemException)t;
			}

			if (t instanceof com.vportal.portlet.vlegal.NoSuchVLegalTagsException) {
				throw (com.vportal.portlet.vlegal.NoSuchVLegalTagsException)t;
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

	public void addEntryResources(
		com.vportal.portlet.vlegal.model.VLegalTags vTag,
		boolean addCommunityPermissions, boolean addGuestPermissions)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vlegal.NoSuchVLegalTagsException {
		MethodHandler methodHandler = new MethodHandler(_addEntryResourcesMethodKey3,
				vTag, addCommunityPermissions, addGuestPermissions);

		try {
			_classLoaderProxy.invoke(methodHandler);
		}
		catch (Throwable t) {
			if (t instanceof com.liferay.portal.kernel.exception.SystemException) {
				throw (com.liferay.portal.kernel.exception.SystemException)t;
			}

			if (t instanceof com.vportal.portlet.vlegal.NoSuchVLegalTagsException) {
				throw (com.vportal.portlet.vlegal.NoSuchVLegalTagsException)t;
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

	public void addEntryResources(long entryId,
		boolean addCommunityPermissions, boolean addGuestPermissions)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vlegal.NoSuchVLegalTagsException {
		MethodHandler methodHandler = new MethodHandler(_addEntryResourcesMethodKey4,
				entryId, addCommunityPermissions, addGuestPermissions);

		try {
			_classLoaderProxy.invoke(methodHandler);
		}
		catch (Throwable t) {
			if (t instanceof com.liferay.portal.kernel.exception.SystemException) {
				throw (com.liferay.portal.kernel.exception.SystemException)t;
			}

			if (t instanceof com.vportal.portlet.vlegal.NoSuchVLegalTagsException) {
				throw (com.vportal.portlet.vlegal.NoSuchVLegalTagsException)t;
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

	public void addEntryResources(long entryId,
		java.lang.String[] communityPermissions,
		java.lang.String[] guestPermissions)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vlegal.NoSuchVLegalTagsException {
		MethodHandler methodHandler = new MethodHandler(_addEntryResourcesMethodKey5,
				entryId, communityPermissions, guestPermissions);

		try {
			_classLoaderProxy.invoke(methodHandler);
		}
		catch (Throwable t) {
			if (t instanceof com.liferay.portal.kernel.exception.SystemException) {
				throw (com.liferay.portal.kernel.exception.SystemException)t;
			}

			if (t instanceof com.vportal.portlet.vlegal.NoSuchVLegalTagsException) {
				throw (com.vportal.portlet.vlegal.NoSuchVLegalTagsException)t;
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

	public com.vportal.portlet.vlegal.model.VLegalTags getTag(
		java.lang.String tagId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vlegal.NoSuchVLegalTagsException {
		Object returnObj = null;

		MethodHandler methodHandler = new MethodHandler(_getTagMethodKey6, tagId);

		try {
			returnObj = _classLoaderProxy.invoke(methodHandler);
		}
		catch (Throwable t) {
			if (t instanceof com.liferay.portal.kernel.exception.SystemException) {
				throw (com.liferay.portal.kernel.exception.SystemException)t;
			}

			if (t instanceof com.vportal.portlet.vlegal.NoSuchVLegalTagsException) {
				throw (com.vportal.portlet.vlegal.NoSuchVLegalTagsException)t;
			}

			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}

		return (com.vportal.portlet.vlegal.model.VLegalTags)ClpSerializer.translateOutput(returnObj);
	}

	public void deleteTag(java.lang.String tagId) {
		MethodHandler methodHandler = new MethodHandler(_deleteTagMethodKey7,
				tagId);

		try {
			_classLoaderProxy.invoke(methodHandler);
		}
		catch (Throwable t) {
			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}
	}

	public void deleteTags(java.lang.String[] tagId) {
		MethodHandler methodHandler = new MethodHandler(_deleteTagsMethodKey8,
				tagId);

		try {
			_classLoaderProxy.invoke(methodHandler);
		}
		catch (Throwable t) {
			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}
	}

	public java.util.List getTag_Status(long groupId, boolean status) {
		Object returnObj = null;

		MethodHandler methodHandler = new MethodHandler(_getTag_StatusMethodKey9,
				groupId, status);

		try {
			returnObj = _classLoaderProxy.invoke(methodHandler);
		}
		catch (Throwable t) {
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

	public java.util.List getTags(long groupId, java.lang.String name,
		java.lang.String status, boolean dup, int begin, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		Object returnObj = null;

		MethodHandler methodHandler = new MethodHandler(_getTagsMethodKey10,
				groupId, name, status, dup, begin, end);

		try {
			returnObj = _classLoaderProxy.invoke(methodHandler);
		}
		catch (Throwable t) {
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

		return (java.util.List)ClpSerializer.translateOutput(returnObj);
	}

	public java.util.List getTagsByGroupId(long groupId)
		throws com.liferay.portal.kernel.exception.SystemException {
		Object returnObj = null;

		MethodHandler methodHandler = new MethodHandler(_getTagsByGroupIdMethodKey11,
				groupId);

		try {
			returnObj = _classLoaderProxy.invoke(methodHandler);
		}
		catch (Throwable t) {
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

		return (java.util.List)ClpSerializer.translateOutput(returnObj);
	}

	public java.util.List getTag_Status(long groupId, boolean status,
		com.liferay.portal.kernel.util.OrderByComparator obc)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.rmi.RemoteException {
		Object returnObj = null;

		MethodHandler methodHandler = new MethodHandler(_getTag_StatusMethodKey12,
				groupId, status, obc);

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

	public void _validator(long groupId, java.lang.String name)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		MethodHandler methodHandler = new MethodHandler(__validatorMethodKey13,
				groupId, name);

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

	public ClassLoaderProxy getClassLoaderProxy() {
		return _classLoaderProxy;
	}

	private ClassLoaderProxy _classLoaderProxy;
	private MethodKey _addTagMethodKey0 = new MethodKey(_classLoaderProxy.getClassName(),
			"addTag", long.class, java.lang.String.class, boolean.class,
			java.lang.String[].class, java.lang.String[].class,
			com.liferay.portal.theme.ThemeDisplay.class);
	private MethodKey _addTagMethodKey1 = new MethodKey(_classLoaderProxy.getClassName(),
			"addTag", long.class, java.lang.String.class, boolean.class,
			java.lang.Boolean.class, java.lang.Boolean.class,
			java.lang.String[].class, java.lang.String[].class,
			com.liferay.portal.theme.ThemeDisplay.class);
	private MethodKey _addEntryResourcesMethodKey2 = new MethodKey(_classLoaderProxy.getClassName(),
			"addEntryResources",
			com.vportal.portlet.vlegal.model.VLegalTags.class,
			java.lang.String[].class, java.lang.String[].class);
	private MethodKey _addEntryResourcesMethodKey3 = new MethodKey(_classLoaderProxy.getClassName(),
			"addEntryResources",
			com.vportal.portlet.vlegal.model.VLegalTags.class, boolean.class,
			boolean.class);
	private MethodKey _addEntryResourcesMethodKey4 = new MethodKey(_classLoaderProxy.getClassName(),
			"addEntryResources", long.class, boolean.class, boolean.class);
	private MethodKey _addEntryResourcesMethodKey5 = new MethodKey(_classLoaderProxy.getClassName(),
			"addEntryResources", long.class, java.lang.String[].class,
			java.lang.String[].class);
	private MethodKey _getTagMethodKey6 = new MethodKey(_classLoaderProxy.getClassName(),
			"getTag", java.lang.String.class);
	private MethodKey _deleteTagMethodKey7 = new MethodKey(_classLoaderProxy.getClassName(),
			"deleteTag", java.lang.String.class);
	private MethodKey _deleteTagsMethodKey8 = new MethodKey(_classLoaderProxy.getClassName(),
			"deleteTags", java.lang.String[].class);
	private MethodKey _getTag_StatusMethodKey9 = new MethodKey(_classLoaderProxy.getClassName(),
			"getTag_Status", long.class, boolean.class);
	private MethodKey _getTagsMethodKey10 = new MethodKey(_classLoaderProxy.getClassName(),
			"getTags", long.class, java.lang.String.class,
			java.lang.String.class, boolean.class, int.class, int.class);
	private MethodKey _getTagsByGroupIdMethodKey11 = new MethodKey(_classLoaderProxy.getClassName(),
			"getTagsByGroupId", long.class);
	private MethodKey _getTag_StatusMethodKey12 = new MethodKey(_classLoaderProxy.getClassName(),
			"getTag_Status", long.class, boolean.class,
			com.liferay.portal.kernel.util.OrderByComparator.class);
	private MethodKey __validatorMethodKey13 = new MethodKey(_classLoaderProxy.getClassName(),
			"_validator", long.class, java.lang.String.class);
}