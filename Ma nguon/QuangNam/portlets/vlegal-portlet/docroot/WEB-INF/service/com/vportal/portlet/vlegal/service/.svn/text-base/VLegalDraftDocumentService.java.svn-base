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
 * The interface for the v legal draft document remote service.
 *
 * <p>
 * Never modify or reference this interface directly. Always use {@link VLegalDraftDocumentServiceUtil} to access the v legal draft document remote service. Add custom service methods to {@link com.vportal.portlet.vlegal.service.impl.VLegalDraftDocumentServiceImpl} and rerun ServiceBuilder to automatically copy the method declarations to this interface.
 * </p>
 *
 * <p>
 * This is a remote service. Methods of this service are expected to have security checks based on the propagated JAAS credentials because this service can be accessed remotely.
 * </p>
 *
 * @author ACB
 * @see VLegalDraftDocumentServiceUtil
 * @see com.vportal.portlet.vlegal.service.base.VLegalDraftDocumentServiceBaseImpl
 * @see com.vportal.portlet.vlegal.service.impl.VLegalDraftDocumentServiceImpl
 * @generated
 */
@Transactional(isolation = Isolation.PORTAL, rollbackFor =  {
	PortalException.class, SystemException.class})
public interface VLegalDraftDocumentService {
	public com.vportal.portlet.vlegal.model.VLegalDraftDocument addDraft(
		long groupId, java.lang.String title, java.lang.String content,
		java.lang.String language, java.lang.String typeId,
		java.lang.String fieldId, int highlevel, java.lang.String docCode,
		java.util.Date expiredDate, boolean hasAttachment,
		java.lang.String[] communityPermissions,
		java.lang.String[] guestPermissions,
		com.liferay.portal.theme.ThemeDisplay themeDisplay)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException, java.rmi.RemoteException;

	public com.vportal.portlet.vlegal.model.VLegalDraftDocument addDraft(
		long groupId, java.lang.String title, java.lang.String content,
		java.lang.String language, java.lang.String typeId,
		java.lang.String fieldId, int highlevel, java.lang.String docCode,
		java.util.Date expiredDate, boolean hasAttachment,
		java.lang.Boolean addCommunityPermissions,
		java.lang.Boolean addGuestPermissions,
		java.lang.String[] communityPermissions,
		java.lang.String[] guestPermissions,
		com.liferay.portal.theme.ThemeDisplay themeDisplay)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException, java.rmi.RemoteException;

	public com.vportal.portlet.vlegal.model.VLegalDraftDocument updateDraft(
		java.lang.String draftId, long groupId, java.lang.String title,
		java.lang.String content, java.lang.String language,
		java.lang.String typeId, java.lang.String fieldId,
		java.util.Date expiredDate, int status, boolean hasAttachment)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException, java.rmi.RemoteException;

	public com.vportal.portlet.vlegal.model.VLegalDraftDocument updateDraft(
		com.vportal.portlet.vlegal.model.VLegalDraftDocument draft)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException, java.rmi.RemoteException;

	public void addEntryResources(long entryId,
		boolean addCommunityPermissions, boolean addGuestPermissions)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException;

	public void addEntryResources(
		com.vportal.portlet.vlegal.model.VLegalDraftDocument entry,
		boolean addCommunityPermissions, boolean addGuestPermissions)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException;

	public void addEntryResources(long entryId,
		java.lang.String[] communityPermissions,
		java.lang.String[] guestPermissions)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException;

	public void addEntryResources(
		com.vportal.portlet.vlegal.model.VLegalDraftDocument entry,
		java.lang.String[] communityPermissions,
		java.lang.String[] guestPermissions)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException;

	public void deleteDraft(java.lang.String draftId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException, java.rmi.RemoteException;

	public void deleteDrafts(java.lang.String[] draftIds)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException, java.rmi.RemoteException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public com.vportal.portlet.vlegal.model.VLegalDraftDocument getDraft(
		java.lang.String draftId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException, java.rmi.RemoteException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public com.vportal.portlet.vlegal.model.VLegalDraftDocument getDraft(
		long groupId, java.lang.String draftId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException, java.rmi.RemoteException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public java.util.List getDrafts(java.lang.String[] draftIds)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException, java.rmi.RemoteException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public java.util.List getDraftsByDocCode(java.lang.String docCode)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException, java.rmi.RemoteException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public java.util.List getDraftsByP_L_S(long groupId,
		java.lang.String language, int status)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException, java.rmi.RemoteException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public java.util.List getDraftsByP_L_S(long groupId,
		java.lang.String language, int status, int start, int end)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException, java.rmi.RemoteException;

	public int countDraftsByP_L_S(long groupId, java.lang.String language,
		int status)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException, java.rmi.RemoteException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public java.util.List getDraftsByP_L_S_E(long groupId,
		java.lang.String language, int status)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException, java.rmi.RemoteException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public java.util.List getDraftsByP_S_U_L(long groupId, int status,
		long createdByUser, java.lang.String language)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException, java.rmi.RemoteException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public java.util.List getDraftsByP_S_D(long groupId, int status,
		java.lang.String docCode)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException, java.rmi.RemoteException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public java.util.List getDraftsByP_S_F(long groupId, int status,
		java.lang.String fieldId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException, java.rmi.RemoteException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public java.util.List getDraftsByP_S_T(long groupId, int status,
		java.lang.String typeId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException, java.rmi.RemoteException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public java.util.List getDraftsExpiredDateByP_L_S(long groupId,
		java.lang.String language, int status)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException, java.rmi.RemoteException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public java.util.List getDraftsExpiredDateByP_L_S(long groupId,
		java.lang.String language, int status, int start, int end)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException, java.rmi.RemoteException;

	public int countDraftsExpiredDateByP_L_S(long groupId,
		java.lang.String language, int status)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException, java.rmi.RemoteException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public java.util.List getDratfsbyP_S(long groupId, java.lang.String language)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException, java.rmi.RemoteException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public java.util.List getTopNewDrafts(long groupId,
		java.lang.String language, int status, int quantity)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException, java.rmi.RemoteException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public java.util.List getTopNewDrafts(java.lang.String fieldId,
		long groupId, java.lang.String language, int status, int quantity)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException, java.rmi.RemoteException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public java.util.List getOlderDrafts(java.lang.String fieldId,
		java.lang.String draftId, long groupId, java.lang.String language,
		int status, int quantity)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException, java.rmi.RemoteException;

	public int countByStatus(long groupId, java.lang.String language, int status)
		throws com.liferay.portal.kernel.exception.SystemException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public java.util.List getDraftByParam(long groupId,
		java.lang.String language, java.lang.String fieldId,
		java.lang.String typeId, int status, java.lang.String title,
		java.lang.String content, int start, int end)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException, java.rmi.RemoteException;

	public int countDraftByParam(long groupId, java.lang.String language,
		java.lang.String fieldId, java.lang.String typeId, int status,
		java.lang.String title, java.lang.String content)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException, java.rmi.RemoteException;

	public int countDraftsByP_L_S_E(long arg0, java.lang.String arg1, int arg2)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException, java.rmi.RemoteException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public java.util.List getDraftsByP_L_S_E(long arg0, java.lang.String arg1,
		int arg2, int arg3, int arg4)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException, java.rmi.RemoteException;
}