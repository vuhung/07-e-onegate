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
public class VLegalOrgServiceClp implements VLegalOrgService {
	public VLegalOrgServiceClp(ClassLoaderProxy classLoaderProxy) {
		_classLoaderProxy = classLoaderProxy;
	}

	public com.vportal.portlet.vlegal.model.VLegalOrg addOrg(long groupId,
		java.lang.String name, java.lang.String description,
		java.lang.String language, boolean rssable, boolean status,
		java.lang.String[] communityPermissions,
		java.lang.String[] guestPermissions,
		com.liferay.portal.theme.ThemeDisplay themeDisplay)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			com.liferay.portal.security.auth.PrincipalException,
			java.rmi.RemoteException {
		Object returnObj = null;

		MethodHandler methodHandler = new MethodHandler(_addOrgMethodKey0,
				groupId, name, description, language, rssable, status,
				communityPermissions, guestPermissions, themeDisplay);

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

		return (com.vportal.portlet.vlegal.model.VLegalOrg)ClpSerializer.translateOutput(returnObj);
	}

	public com.vportal.portlet.vlegal.model.VLegalOrg addOrg(long groupId,
		java.lang.String name, java.lang.String description,
		java.lang.String language, boolean rssable, boolean status,
		java.lang.Boolean addCommunityPermissions,
		java.lang.Boolean addGuestPermissions,
		java.lang.String[] communityPermissions,
		java.lang.String[] guestPermissions,
		com.liferay.portal.theme.ThemeDisplay themeDisplay)
		throws com.liferay.portal.NoSuchUserException,
			com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			com.liferay.portal.security.auth.PrincipalException,
			java.rmi.RemoteException {
		Object returnObj = null;

		MethodHandler methodHandler = new MethodHandler(_addOrgMethodKey1,
				groupId, name, description, language, rssable, status,
				addCommunityPermissions, addGuestPermissions,
				communityPermissions, guestPermissions, themeDisplay);

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

		return (com.vportal.portlet.vlegal.model.VLegalOrg)ClpSerializer.translateOutput(returnObj);
	}

	public com.vportal.portlet.vlegal.model.VLegalOrg updateOrg(long groupId,
		java.lang.String orgId, java.lang.String name,
		java.lang.String description, java.lang.String language,
		boolean rssable, boolean status, int position)
		throws com.liferay.portal.NoSuchUserException,
			com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			com.liferay.portal.security.auth.PrincipalException,
			com.vportal.portlet.vlegal.NoSuchVLegalOrgException,
			java.rmi.RemoteException {
		Object returnObj = null;

		MethodHandler methodHandler = new MethodHandler(_updateOrgMethodKey2,
				groupId, orgId, name, description, language, rssable, status,
				position);

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

			if (t instanceof com.vportal.portlet.vlegal.NoSuchVLegalOrgException) {
				throw (com.vportal.portlet.vlegal.NoSuchVLegalOrgException)t;
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

		return (com.vportal.portlet.vlegal.model.VLegalOrg)ClpSerializer.translateOutput(returnObj);
	}

	public com.vportal.portlet.vlegal.model.VLegalOrg updateOrg(
		com.vportal.portlet.vlegal.model.VLegalOrg vOrg)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException, java.rmi.RemoteException {
		Object returnObj = null;

		MethodHandler methodHandler = new MethodHandler(_updateOrgMethodKey3,
				vOrg);

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

		return (com.vportal.portlet.vlegal.model.VLegalOrg)ClpSerializer.translateOutput(returnObj);
	}

	public void addEntryResources(long entryId,
		boolean addCommunityPermissions, boolean addGuestPermissions)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		MethodHandler methodHandler = new MethodHandler(_addEntryResourcesMethodKey4,
				entryId, addCommunityPermissions, addGuestPermissions);

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

	public void addEntryResources(
		com.vportal.portlet.vlegal.model.VLegalOrg entry,
		boolean addCommunityPermissions, boolean addGuestPermissions)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		MethodHandler methodHandler = new MethodHandler(_addEntryResourcesMethodKey5,
				entry, addCommunityPermissions, addGuestPermissions);

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

	public void addEntryResources(long entryId,
		java.lang.String[] communityPermissions,
		java.lang.String[] guestPermissions)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		MethodHandler methodHandler = new MethodHandler(_addEntryResourcesMethodKey6,
				entryId, communityPermissions, guestPermissions);

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

	public void addEntryResources(
		com.vportal.portlet.vlegal.model.VLegalOrg entry,
		java.lang.String[] communityPermissions,
		java.lang.String[] guestPermissions)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		MethodHandler methodHandler = new MethodHandler(_addEntryResourcesMethodKey7,
				entry, communityPermissions, guestPermissions);

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

	public java.util.List getAllOrg()
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException, java.rmi.RemoteException {
		Object returnObj = null;

		MethodHandler methodHandler = new MethodHandler(_getAllOrgMethodKey8);

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

	public java.util.List getAllOrgByS_L(long groupId, boolean status,
		java.lang.String language) {
		Object returnObj = null;

		MethodHandler methodHandler = new MethodHandler(_getAllOrgByS_LMethodKey9,
				groupId, status, language);

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

	public java.util.List getAllOrgByS_Rss(long groupId, boolean status,
		boolean rssable)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException, java.rmi.RemoteException {
		Object returnObj = null;

		MethodHandler methodHandler = new MethodHandler(_getAllOrgByS_RssMethodKey10,
				groupId, status, rssable);

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

	public java.util.List getOrgByGroupId(long groupId)
		throws com.liferay.portal.kernel.exception.SystemException {
		Object returnObj = null;

		MethodHandler methodHandler = new MethodHandler(_getOrgByGroupIdMethodKey11,
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

	public java.util.List getOrgByGroupId(long groupId, int begin, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		Object returnObj = null;

		MethodHandler methodHandler = new MethodHandler(_getOrgByGroupIdMethodKey12,
				groupId, begin, end);

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

	public int countOrgByGroupId(long groupId)
		throws com.liferay.portal.kernel.exception.SystemException {
		Object returnObj = null;

		MethodHandler methodHandler = new MethodHandler(_countOrgByGroupIdMethodKey13,
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

		return ((Integer)returnObj).intValue();
	}

	public com.vportal.portlet.vlegal.model.VLegalOrg getOrg(
		java.lang.String orgId) {
		Object returnObj = null;

		MethodHandler methodHandler = new MethodHandler(_getOrgMethodKey14,
				orgId);

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

		return (com.vportal.portlet.vlegal.model.VLegalOrg)ClpSerializer.translateOutput(returnObj);
	}

	public com.vportal.portlet.vlegal.model.VLegalOrg getOrg(long groupId,
		java.lang.String orgId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException, java.rmi.RemoteException {
		Object returnObj = null;

		MethodHandler methodHandler = new MethodHandler(_getOrgMethodKey15,
				groupId, orgId);

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

		return (com.vportal.portlet.vlegal.model.VLegalOrg)ClpSerializer.translateOutput(returnObj);
	}

	public void deleteOrg(java.lang.String orgId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException, java.rmi.RemoteException {
		MethodHandler methodHandler = new MethodHandler(_deleteOrgMethodKey16,
				orgId);

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

	public void _validator(java.lang.String name)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		MethodHandler methodHandler = new MethodHandler(__validatorMethodKey17,
				name);

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

	public com.vportal.portlet.vlegal.model.VLegalOrg addOrg(long arg0,
		java.lang.String arg1, java.lang.String arg2, java.lang.String arg3,
		boolean arg4, boolean arg5, java.lang.String arg6,
		com.liferay.portal.theme.ThemeDisplay arg7)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException, java.rmi.RemoteException {
		Object returnObj = null;

		MethodHandler methodHandler = new MethodHandler(_addOrgMethodKey18,
				arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7);

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

		return (com.vportal.portlet.vlegal.model.VLegalOrg)ClpSerializer.translateOutput(returnObj);
	}

	public com.vportal.portlet.vlegal.model.VLegalOrg addOrg(long arg0,
		long arg1, long arg2, java.lang.String arg3, java.lang.String arg4,
		java.lang.String arg5, boolean arg6, boolean arg7,
		java.lang.String arg8, com.liferay.portal.theme.ThemeDisplay arg9)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException, java.rmi.RemoteException {
		Object returnObj = null;

		MethodHandler methodHandler = new MethodHandler(_addOrgMethodKey19,
				arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9);

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

		return (com.vportal.portlet.vlegal.model.VLegalOrg)ClpSerializer.translateOutput(returnObj);
	}

	public int countOrgByG_L(long arg0, java.lang.String arg1)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException, java.rmi.RemoteException {
		Object returnObj = null;

		MethodHandler methodHandler = new MethodHandler(_countOrgByG_LMethodKey20,
				arg0, arg1);

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

	public int countOrgByG_L_P_S(long arg0, java.lang.String arg1,
		java.lang.String arg2, boolean arg3)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException, java.rmi.RemoteException {
		Object returnObj = null;

		MethodHandler methodHandler = new MethodHandler(_countOrgByG_L_P_SMethodKey21,
				arg0, arg1, arg2, arg3);

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

	public int countOrgByG_L_S(long arg0, java.lang.String arg1,
		java.lang.String arg2)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException, java.rmi.RemoteException {
		Object returnObj = null;

		MethodHandler methodHandler = new MethodHandler(_countOrgByG_L_SMethodKey22,
				arg0, arg1, arg2);

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

	public java.util.List getOrgByG_L(long arg0, java.lang.String arg1)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException, java.rmi.RemoteException {
		Object returnObj = null;

		MethodHandler methodHandler = new MethodHandler(_getOrgByG_LMethodKey23,
				arg0, arg1);

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

	public java.util.List getOrgByG_L(long arg0, java.lang.String arg1,
		int arg2, int arg3)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException, java.rmi.RemoteException {
		Object returnObj = null;

		MethodHandler methodHandler = new MethodHandler(_getOrgByG_LMethodKey24,
				arg0, arg1, arg2, arg3);

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

	public java.util.List getOrgByG_L_P(long arg0, java.lang.String arg1,
		java.lang.String arg2)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException, java.rmi.RemoteException {
		Object returnObj = null;

		MethodHandler methodHandler = new MethodHandler(_getOrgByG_L_PMethodKey25,
				arg0, arg1, arg2);

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

	public java.util.List getOrgByG_L_P(long arg0, java.lang.String arg1,
		java.lang.String arg2, int arg3, int arg4)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException, java.rmi.RemoteException {
		Object returnObj = null;

		MethodHandler methodHandler = new MethodHandler(_getOrgByG_L_PMethodKey26,
				arg0, arg1, arg2, arg3, arg4);

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

	public java.util.List getOrgByG_L_P_S(long arg0, java.lang.String arg1,
		java.lang.String arg2, boolean arg3)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException, java.rmi.RemoteException {
		Object returnObj = null;

		MethodHandler methodHandler = new MethodHandler(_getOrgByG_L_P_SMethodKey27,
				arg0, arg1, arg2, arg3);

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

	public java.util.List getOrgByG_L_P_S(long arg0, java.lang.String arg1,
		java.lang.String arg2, boolean arg3, int arg4, int arg5)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException, java.rmi.RemoteException {
		Object returnObj = null;

		MethodHandler methodHandler = new MethodHandler(_getOrgByG_L_P_SMethodKey28,
				arg0, arg1, arg2, arg3, arg4, arg5);

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

	public com.vportal.portlet.vlegal.model.VLegalOrg updateOrg(long arg0,
		java.lang.String arg1, java.lang.String arg2, java.lang.String arg3,
		java.lang.String arg4, boolean arg5, boolean arg6,
		java.lang.String arg7, int arg8)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException, java.rmi.RemoteException {
		Object returnObj = null;

		MethodHandler methodHandler = new MethodHandler(_updateOrgMethodKey29,
				arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);

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

		return (com.vportal.portlet.vlegal.model.VLegalOrg)ClpSerializer.translateOutput(returnObj);
	}

	public ClassLoaderProxy getClassLoaderProxy() {
		return _classLoaderProxy;
	}

	private ClassLoaderProxy _classLoaderProxy;
	private MethodKey _addOrgMethodKey0 = new MethodKey(_classLoaderProxy.getClassName(),
			"addOrg", long.class, java.lang.String.class,
			java.lang.String.class, java.lang.String.class, boolean.class,
			boolean.class, java.lang.String[].class, java.lang.String[].class,
			com.liferay.portal.theme.ThemeDisplay.class);
	private MethodKey _addOrgMethodKey1 = new MethodKey(_classLoaderProxy.getClassName(),
			"addOrg", long.class, java.lang.String.class,
			java.lang.String.class, java.lang.String.class, boolean.class,
			boolean.class, java.lang.Boolean.class, java.lang.Boolean.class,
			java.lang.String[].class, java.lang.String[].class,
			com.liferay.portal.theme.ThemeDisplay.class);
	private MethodKey _updateOrgMethodKey2 = new MethodKey(_classLoaderProxy.getClassName(),
			"updateOrg", long.class, java.lang.String.class,
			java.lang.String.class, java.lang.String.class,
			java.lang.String.class, boolean.class, boolean.class, int.class);
	private MethodKey _updateOrgMethodKey3 = new MethodKey(_classLoaderProxy.getClassName(),
			"updateOrg", com.vportal.portlet.vlegal.model.VLegalOrg.class);
	private MethodKey _addEntryResourcesMethodKey4 = new MethodKey(_classLoaderProxy.getClassName(),
			"addEntryResources", long.class, boolean.class, boolean.class);
	private MethodKey _addEntryResourcesMethodKey5 = new MethodKey(_classLoaderProxy.getClassName(),
			"addEntryResources",
			com.vportal.portlet.vlegal.model.VLegalOrg.class, boolean.class,
			boolean.class);
	private MethodKey _addEntryResourcesMethodKey6 = new MethodKey(_classLoaderProxy.getClassName(),
			"addEntryResources", long.class, java.lang.String[].class,
			java.lang.String[].class);
	private MethodKey _addEntryResourcesMethodKey7 = new MethodKey(_classLoaderProxy.getClassName(),
			"addEntryResources",
			com.vportal.portlet.vlegal.model.VLegalOrg.class,
			java.lang.String[].class, java.lang.String[].class);
	private MethodKey _getAllOrgMethodKey8 = new MethodKey(_classLoaderProxy.getClassName(),
			"getAllOrg");
	private MethodKey _getAllOrgByS_LMethodKey9 = new MethodKey(_classLoaderProxy.getClassName(),
			"getAllOrgByS_L", long.class, boolean.class, java.lang.String.class);
	private MethodKey _getAllOrgByS_RssMethodKey10 = new MethodKey(_classLoaderProxy.getClassName(),
			"getAllOrgByS_Rss", long.class, boolean.class, boolean.class);
	private MethodKey _getOrgByGroupIdMethodKey11 = new MethodKey(_classLoaderProxy.getClassName(),
			"getOrgByGroupId", long.class);
	private MethodKey _getOrgByGroupIdMethodKey12 = new MethodKey(_classLoaderProxy.getClassName(),
			"getOrgByGroupId", long.class, int.class, int.class);
	private MethodKey _countOrgByGroupIdMethodKey13 = new MethodKey(_classLoaderProxy.getClassName(),
			"countOrgByGroupId", long.class);
	private MethodKey _getOrgMethodKey14 = new MethodKey(_classLoaderProxy.getClassName(),
			"getOrg", java.lang.String.class);
	private MethodKey _getOrgMethodKey15 = new MethodKey(_classLoaderProxy.getClassName(),
			"getOrg", long.class, java.lang.String.class);
	private MethodKey _deleteOrgMethodKey16 = new MethodKey(_classLoaderProxy.getClassName(),
			"deleteOrg", java.lang.String.class);
	private MethodKey __validatorMethodKey17 = new MethodKey(_classLoaderProxy.getClassName(),
			"_validator", java.lang.String.class);
	private MethodKey _addOrgMethodKey18 = new MethodKey(_classLoaderProxy.getClassName(),
			"addOrg", long.class, java.lang.String.class,
			java.lang.String.class, java.lang.String.class, boolean.class,
			boolean.class, java.lang.String.class,
			com.liferay.portal.theme.ThemeDisplay.class);
	private MethodKey _addOrgMethodKey19 = new MethodKey(_classLoaderProxy.getClassName(),
			"addOrg", long.class, long.class, long.class,
			java.lang.String.class, java.lang.String.class,
			java.lang.String.class, boolean.class, boolean.class,
			java.lang.String.class, com.liferay.portal.theme.ThemeDisplay.class);
	private MethodKey _countOrgByG_LMethodKey20 = new MethodKey(_classLoaderProxy.getClassName(),
			"countOrgByG_L", long.class, java.lang.String.class);
	private MethodKey _countOrgByG_L_P_SMethodKey21 = new MethodKey(_classLoaderProxy.getClassName(),
			"countOrgByG_L_P_S", long.class, java.lang.String.class,
			java.lang.String.class, boolean.class);
	private MethodKey _countOrgByG_L_SMethodKey22 = new MethodKey(_classLoaderProxy.getClassName(),
			"countOrgByG_L_S", long.class, java.lang.String.class,
			java.lang.String.class);
	private MethodKey _getOrgByG_LMethodKey23 = new MethodKey(_classLoaderProxy.getClassName(),
			"getOrgByG_L", long.class, java.lang.String.class);
	private MethodKey _getOrgByG_LMethodKey24 = new MethodKey(_classLoaderProxy.getClassName(),
			"getOrgByG_L", long.class, java.lang.String.class, int.class,
			int.class);
	private MethodKey _getOrgByG_L_PMethodKey25 = new MethodKey(_classLoaderProxy.getClassName(),
			"getOrgByG_L_P", long.class, java.lang.String.class,
			java.lang.String.class);
	private MethodKey _getOrgByG_L_PMethodKey26 = new MethodKey(_classLoaderProxy.getClassName(),
			"getOrgByG_L_P", long.class, java.lang.String.class,
			java.lang.String.class, int.class, int.class);
	private MethodKey _getOrgByG_L_P_SMethodKey27 = new MethodKey(_classLoaderProxy.getClassName(),
			"getOrgByG_L_P_S", long.class, java.lang.String.class,
			java.lang.String.class, boolean.class);
	private MethodKey _getOrgByG_L_P_SMethodKey28 = new MethodKey(_classLoaderProxy.getClassName(),
			"getOrgByG_L_P_S", long.class, java.lang.String.class,
			java.lang.String.class, boolean.class, int.class, int.class);
	private MethodKey _updateOrgMethodKey29 = new MethodKey(_classLoaderProxy.getClassName(),
			"updateOrg", long.class, java.lang.String.class,
			java.lang.String.class, java.lang.String.class,
			java.lang.String.class, boolean.class, boolean.class,
			java.lang.String.class, int.class);
}