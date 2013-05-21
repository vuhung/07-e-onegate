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

import com.liferay.portal.kernel.annotation.Isolation;
import com.liferay.portal.kernel.annotation.Propagation;
import com.liferay.portal.kernel.annotation.Transactional;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;

/**
 * The interface for the v legal field remote service.
 *
 * <p>
 * Never modify or reference this interface directly. Always use {@link VLegalFieldServiceUtil} to access the v legal field remote service. Add custom service methods to {@link com.vportal.portlet.vlegal.service.impl.VLegalFieldServiceImpl} and rerun ServiceBuilder to automatically copy the method declarations to this interface.
 * </p>
 *
 * <p>
 * This is a remote service. Methods of this service are expected to have security checks based on the propagated JAAS credentials because this service can be accessed remotely.
 * </p>
 *
 * @author ACB
 * @see VLegalFieldServiceUtil
 * @see com.vportal.portlet.vlegal.service.base.VLegalFieldServiceBaseImpl
 * @see com.vportal.portlet.vlegal.service.impl.VLegalFieldServiceImpl
 * @generated
 */
@Transactional(isolation = Isolation.PORTAL, rollbackFor =  {
	PortalException.class, SystemException.class})
public interface VLegalFieldService {
	public com.vportal.portlet.vlegal.model.VLegalField addField(long groupId,
		java.lang.String name, java.lang.String description,
		java.lang.String language, boolean status, boolean rssable,
		java.lang.String[] communityPermissions,
		java.lang.String[] guestPermissions,
		com.liferay.portal.theme.ThemeDisplay themeDisplay)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			com.liferay.portal.security.auth.PrincipalException,
			java.rmi.RemoteException;

	public com.vportal.portlet.vlegal.model.VLegalField addField(long groupId,
		java.lang.String name, java.lang.String description,
		java.lang.String language, boolean status, boolean rssable,
		java.lang.Boolean addCommunityPermissions,
		java.lang.Boolean addGuestPermissions,
		java.lang.String[] communityPermissions,
		java.lang.String[] guestPermissions,
		com.liferay.portal.theme.ThemeDisplay themeDisplay)
		throws com.liferay.portal.NoSuchUserException,
			com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			com.liferay.portal.security.auth.PrincipalException,
			java.rmi.RemoteException;

	public com.vportal.portlet.vlegal.model.VLegalField updateField(
		long groupId, java.lang.String fieldId, java.lang.String name,
		java.lang.String description, java.lang.String language,
		boolean status, boolean rss)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException, java.rmi.RemoteException;

	public void addEntryResources(long entryId,
		boolean addCommunityPermissions, boolean addGuestPermissions)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException;

	public void addEntryResources(
		com.vportal.portlet.vlegal.model.VLegalField entry,
		boolean addCommunityPermissions, boolean addGuestPermissions)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException;

	public void addEntryResources(long entryId,
		java.lang.String[] communityPermissions,
		java.lang.String[] guestPermissions)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException;

	public void addEntryResources(
		com.vportal.portlet.vlegal.model.VLegalField entry,
		java.lang.String[] communityPermissions,
		java.lang.String[] guestPermissions)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException;

	public void deleteField(java.lang.String fieldId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException, java.rmi.RemoteException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public com.vportal.portlet.vlegal.model.VLegalField getVField(
		java.lang.String fieldId);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public com.vportal.portlet.vlegal.model.VLegalField getVField(
		long groupId, java.lang.String fieldId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException, java.rmi.RemoteException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public java.util.List getAllFields()
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException, java.rmi.RemoteException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public java.util.List getFieldByGroupId(long groupId)
		throws com.liferay.portal.kernel.exception.SystemException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public java.util.List getFieldByGroupId(long groupId, int begin, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	public int countFieldByGroupId(long groupId)
		throws com.liferay.portal.kernel.exception.SystemException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public java.util.List getVFieldByS_L(long groupId, boolean status,
		java.lang.String language)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException, java.rmi.RemoteException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public java.util.List getVFieldByS_L(java.lang.String language,
		boolean status)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException, java.rmi.RemoteException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public java.util.List getVFieldByS_Rss(long groupId, boolean status,
		boolean rssable)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException, java.rmi.RemoteException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public java.util.List getFieldByOrg(long groupId, java.lang.String orgId,
		java.lang.String language, java.lang.String status, int begin, int end)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public java.util.List getFieldByType(long groupId, java.lang.String typeId,
		java.lang.String language, java.lang.String status, int begin, int end)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public java.util.List getAllFieldByPS(long groupId,
		java.lang.String language)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public java.util.List getFieldRelDoc_T_O(long groupId,
		java.lang.String language, java.lang.String typeId,
		java.lang.String orgId) throws com.liferay.portal.kernel.exception.SystemException;

	public void _validate(java.lang.String name)
		throws com.liferay.portal.kernel.exception.PortalException;

	public com.vportal.portlet.vlegal.model.VLegalField addField(long arg0,
		java.lang.String arg1, java.lang.String arg2, java.lang.String arg3,
		boolean arg4, boolean arg5, com.liferay.portal.theme.ThemeDisplay arg6)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException, java.rmi.RemoteException;

	public com.vportal.portlet.vlegal.model.VLegalField addField(long arg0,
		long arg1, long arg2, java.lang.String arg3, java.lang.String arg4,
		java.lang.String arg5, boolean arg6, boolean arg7,
		com.liferay.portal.theme.ThemeDisplay arg8)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException, java.rmi.RemoteException;
}