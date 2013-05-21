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

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.util.ClassLoaderProxy;

/**
 * The utility for the v legal draft document remote service. This utility wraps {@link com.vportal.portlet.vlegal.service.impl.VLegalDraftDocumentServiceImpl} and is the primary access point for service operations in application layer code running on a remote server.
 *
 * <p>
 * Never modify this class directly. Add custom service methods to {@link com.vportal.portlet.vlegal.service.impl.VLegalDraftDocumentServiceImpl} and rerun ServiceBuilder to regenerate this class.
 * </p>
 *
 * <p>
 * This is a remote service. Methods of this service are expected to have security checks based on the propagated JAAS credentials because this service can be accessed remotely.
 * </p>
 *
 * @author ACB
 * @see VLegalDraftDocumentService
 * @see com.vportal.portlet.vlegal.service.base.VLegalDraftDocumentServiceBaseImpl
 * @see com.vportal.portlet.vlegal.service.impl.VLegalDraftDocumentServiceImpl
 * @generated
 */
public class VLegalDraftDocumentServiceUtil {
	public static com.vportal.portlet.vlegal.model.VLegalDraftDocument addDraft(
		long groupId, java.lang.String title, java.lang.String content,
		java.lang.String language, java.lang.String typeId,
		java.lang.String fieldId, int highlevel, java.lang.String docCode,
		java.util.Date expiredDate, boolean hasAttachment,
		java.lang.String[] communityPermissions,
		java.lang.String[] guestPermissions,
		com.liferay.portal.theme.ThemeDisplay themeDisplay)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException, java.rmi.RemoteException {
		return getService()
				   .addDraft(groupId, title, content, language, typeId,
			fieldId, highlevel, docCode, expiredDate, hasAttachment,
			communityPermissions, guestPermissions, themeDisplay);
	}

	public static com.vportal.portlet.vlegal.model.VLegalDraftDocument addDraft(
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
			com.liferay.portal.kernel.exception.SystemException, java.rmi.RemoteException {
		return getService()
				   .addDraft(groupId, title, content, language, typeId,
			fieldId, highlevel, docCode, expiredDate, hasAttachment,
			addCommunityPermissions, addGuestPermissions, communityPermissions,
			guestPermissions, themeDisplay);
	}

	public static com.vportal.portlet.vlegal.model.VLegalDraftDocument updateDraft(
		java.lang.String draftId, long groupId, java.lang.String title,
		java.lang.String content, java.lang.String language,
		java.lang.String typeId, java.lang.String fieldId,
		java.util.Date expiredDate, int status, boolean hasAttachment)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException, java.rmi.RemoteException {
		return getService()
				   .updateDraft(draftId, groupId, title, content, language,
			typeId, fieldId, expiredDate, status, hasAttachment);
	}

	public static com.vportal.portlet.vlegal.model.VLegalDraftDocument updateDraft(
		com.vportal.portlet.vlegal.model.VLegalDraftDocument draft)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException, java.rmi.RemoteException {
		return getService().updateDraft(draft);
	}

	public static void addEntryResources(long entryId,
		boolean addCommunityPermissions, boolean addGuestPermissions)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		getService()
			.addEntryResources(entryId, addCommunityPermissions,
			addGuestPermissions);
	}

	public static void addEntryResources(
		com.vportal.portlet.vlegal.model.VLegalDraftDocument entry,
		boolean addCommunityPermissions, boolean addGuestPermissions)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		getService()
			.addEntryResources(entry, addCommunityPermissions,
			addGuestPermissions);
	}

	public static void addEntryResources(long entryId,
		java.lang.String[] communityPermissions,
		java.lang.String[] guestPermissions)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		getService()
			.addEntryResources(entryId, communityPermissions, guestPermissions);
	}

	public static void addEntryResources(
		com.vportal.portlet.vlegal.model.VLegalDraftDocument entry,
		java.lang.String[] communityPermissions,
		java.lang.String[] guestPermissions)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		getService()
			.addEntryResources(entry, communityPermissions, guestPermissions);
	}

	public static void deleteDraft(java.lang.String draftId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException, java.rmi.RemoteException {
		getService().deleteDraft(draftId);
	}

	public static void deleteDrafts(java.lang.String[] draftIds)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException, java.rmi.RemoteException {
		getService().deleteDrafts(draftIds);
	}

	public static com.vportal.portlet.vlegal.model.VLegalDraftDocument getDraft(
		java.lang.String draftId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException, java.rmi.RemoteException {
		return getService().getDraft(draftId);
	}

	public static com.vportal.portlet.vlegal.model.VLegalDraftDocument getDraft(
		long groupId, java.lang.String draftId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException, java.rmi.RemoteException {
		return getService().getDraft(groupId, draftId);
	}

	public static java.util.List getDrafts(java.lang.String[] draftIds)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException, java.rmi.RemoteException {
		return getService().getDrafts(draftIds);
	}

	public static java.util.List getDraftsByDocCode(java.lang.String docCode)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException, java.rmi.RemoteException {
		return getService().getDraftsByDocCode(docCode);
	}

	public static java.util.List getDraftsByP_L_S(long groupId,
		java.lang.String language, int status)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException, java.rmi.RemoteException {
		return getService().getDraftsByP_L_S(groupId, language, status);
	}

	public static java.util.List getDraftsByP_L_S(long groupId,
		java.lang.String language, int status, int start, int end)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException, java.rmi.RemoteException {
		return getService()
				   .getDraftsByP_L_S(groupId, language, status, start, end);
	}

	public static int countDraftsByP_L_S(long groupId,
		java.lang.String language, int status)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException, java.rmi.RemoteException {
		return getService().countDraftsByP_L_S(groupId, language, status);
	}

	public static java.util.List getDraftsByP_L_S_E(long groupId,
		java.lang.String language, int status)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException, java.rmi.RemoteException {
		return getService().getDraftsByP_L_S_E(groupId, language, status);
	}

	public static java.util.List getDraftsByP_S_U_L(long groupId, int status,
		long createdByUser, java.lang.String language)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException, java.rmi.RemoteException {
		return getService()
				   .getDraftsByP_S_U_L(groupId, status, createdByUser, language);
	}

	public static java.util.List getDraftsByP_S_D(long groupId, int status,
		java.lang.String docCode)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException, java.rmi.RemoteException {
		return getService().getDraftsByP_S_D(groupId, status, docCode);
	}

	public static java.util.List getDraftsByP_S_F(long groupId, int status,
		java.lang.String fieldId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException, java.rmi.RemoteException {
		return getService().getDraftsByP_S_F(groupId, status, fieldId);
	}

	public static java.util.List getDraftsByP_S_T(long groupId, int status,
		java.lang.String typeId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException, java.rmi.RemoteException {
		return getService().getDraftsByP_S_T(groupId, status, typeId);
	}

	public static java.util.List getDraftsExpiredDateByP_L_S(long groupId,
		java.lang.String language, int status)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException, java.rmi.RemoteException {
		return getService()
				   .getDraftsExpiredDateByP_L_S(groupId, language, status);
	}

	public static java.util.List getDraftsExpiredDateByP_L_S(long groupId,
		java.lang.String language, int status, int start, int end)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException, java.rmi.RemoteException {
		return getService()
				   .getDraftsExpiredDateByP_L_S(groupId, language, status,
			start, end);
	}

	public static int countDraftsExpiredDateByP_L_S(long groupId,
		java.lang.String language, int status)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException, java.rmi.RemoteException {
		return getService()
				   .countDraftsExpiredDateByP_L_S(groupId, language, status);
	}

	public static java.util.List getDratfsbyP_S(long groupId,
		java.lang.String language)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException, java.rmi.RemoteException {
		return getService().getDratfsbyP_S(groupId, language);
	}

	public static java.util.List getTopNewDrafts(long groupId,
		java.lang.String language, int status, int quantity)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException, java.rmi.RemoteException {
		return getService().getTopNewDrafts(groupId, language, status, quantity);
	}

	public static java.util.List getTopNewDrafts(java.lang.String fieldId,
		long groupId, java.lang.String language, int status, int quantity)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException, java.rmi.RemoteException {
		return getService()
				   .getTopNewDrafts(fieldId, groupId, language, status, quantity);
	}

	public static java.util.List getOlderDrafts(java.lang.String fieldId,
		java.lang.String draftId, long groupId, java.lang.String language,
		int status, int quantity)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException, java.rmi.RemoteException {
		return getService()
				   .getOlderDrafts(fieldId, draftId, groupId, language, status,
			quantity);
	}

	public static int countByStatus(long groupId, java.lang.String language,
		int status) throws com.liferay.portal.kernel.exception.SystemException {
		return getService().countByStatus(groupId, language, status);
	}

	public static java.util.List getDraftByParam(long groupId,
		java.lang.String language, java.lang.String fieldId,
		java.lang.String typeId, int status, java.lang.String title,
		java.lang.String content, int start, int end)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException, java.rmi.RemoteException {
		return getService()
				   .getDraftByParam(groupId, language, fieldId, typeId, status,
			title, content, start, end);
	}

	public static int countDraftByParam(long groupId,
		java.lang.String language, java.lang.String fieldId,
		java.lang.String typeId, int status, java.lang.String title,
		java.lang.String content)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException, java.rmi.RemoteException {
		return getService()
				   .countDraftByParam(groupId, language, fieldId, typeId,
			status, title, content);
	}

	public static int countDraftsByP_L_S_E(long arg0, java.lang.String arg1,
		int arg2)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException, java.rmi.RemoteException {
		return getService().countDraftsByP_L_S_E(arg0, arg1, arg2);
	}

	public static java.util.List getDraftsByP_L_S_E(long arg0,
		java.lang.String arg1, int arg2, int arg3, int arg4)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException, java.rmi.RemoteException {
		return getService().getDraftsByP_L_S_E(arg0, arg1, arg2, arg3, arg4);
	}

	public static void clearService() {
		_service = null;
	}

	public static VLegalDraftDocumentService getService() {
		if (_service == null) {
			Object obj = PortletBeanLocatorUtil.locate(ClpSerializer.SERVLET_CONTEXT_NAME,
					VLegalDraftDocumentService.class.getName());
			ClassLoader portletClassLoader = (ClassLoader)PortletBeanLocatorUtil.locate(ClpSerializer.SERVLET_CONTEXT_NAME,
					"portletClassLoader");

			ClassLoaderProxy classLoaderProxy = new ClassLoaderProxy(obj,
					portletClassLoader);

			_service = new VLegalDraftDocumentServiceClp(classLoaderProxy);

			ClpSerializer.setClassLoader(portletClassLoader);
		}

		return _service;
	}

	public void setService(VLegalDraftDocumentService service) {
		_service = service;
	}

	private static VLegalDraftDocumentService _service;
}