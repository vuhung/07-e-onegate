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
 * The utility for the v legal suggest document remote service. This utility wraps {@link com.vportal.portlet.vlegal.service.impl.VLegalSuggestDocumentServiceImpl} and is the primary access point for service operations in application layer code running on a remote server.
 *
 * <p>
 * Never modify this class directly. Add custom service methods to {@link com.vportal.portlet.vlegal.service.impl.VLegalSuggestDocumentServiceImpl} and rerun ServiceBuilder to regenerate this class.
 * </p>
 *
 * <p>
 * This is a remote service. Methods of this service are expected to have security checks based on the propagated JAAS credentials because this service can be accessed remotely.
 * </p>
 *
 * @author ACB
 * @see VLegalSuggestDocumentService
 * @see com.vportal.portlet.vlegal.service.base.VLegalSuggestDocumentServiceBaseImpl
 * @see com.vportal.portlet.vlegal.service.impl.VLegalSuggestDocumentServiceImpl
 * @generated
 */
public class VLegalSuggestDocumentServiceUtil {
	public static com.vportal.portlet.vlegal.model.VLegalSuggestDocument addSuggestion(
		java.lang.String title, java.lang.String content,
		java.lang.String language, java.lang.String visitorName,
		java.lang.String visitorEmail, java.lang.String visitorTel,
		java.lang.String visitorAddress, long groupId,
		java.lang.String draftId, boolean hasAttachment,
		java.lang.String[] communityPermissions,
		java.lang.String[] guestPermissions,
		com.liferay.portal.theme.ThemeDisplay themeDisplay)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			com.liferay.portal.security.auth.PrincipalException,
			java.rmi.RemoteException {
		return getService()
				   .addSuggestion(title, content, language, visitorName,
			visitorEmail, visitorTel, visitorAddress, groupId, draftId,
			hasAttachment, communityPermissions, guestPermissions, themeDisplay);
	}

	public static com.vportal.portlet.vlegal.model.VLegalSuggestDocument addSuggestion(
		java.lang.String title, java.lang.String content,
		java.lang.String language, java.lang.String visitorName,
		java.lang.String visitorEmail, java.lang.String visitorTel,
		java.lang.String visitorAddress, long groupId,
		java.lang.String draftId, boolean hasAttachment,
		java.lang.Boolean addCommunityPermissions,
		java.lang.Boolean addGuestPermissions,
		java.lang.String[] communityPermissions,
		java.lang.String[] guestPermissions,
		com.liferay.portal.theme.ThemeDisplay themeDisplay)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.rmi.RemoteException {
		return getService()
				   .addSuggestion(title, content, language, visitorName,
			visitorEmail, visitorTel, visitorAddress, groupId, draftId,
			hasAttachment, addCommunityPermissions, addGuestPermissions,
			communityPermissions, guestPermissions, themeDisplay);
	}

	public static com.vportal.portlet.vlegal.model.VLegalSuggestDocument updateSuggestion(
		java.lang.String suggestionId, java.lang.String draftId, long groupId,
		java.lang.String title, java.lang.String content,
		java.lang.String language, java.lang.String visitorName,
		java.lang.String visitorEmail, java.lang.String visitorTel,
		java.lang.String visitorAddress, boolean approved, boolean hasAttachment)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException, java.rmi.RemoteException {
		return getService()
				   .updateSuggestion(suggestionId, draftId, groupId, title,
			content, language, visitorName, visitorEmail, visitorTel,
			visitorAddress, approved, hasAttachment);
	}

	public static com.vportal.portlet.vlegal.model.VLegalSuggestDocument updateSuggestion(
		com.vportal.portlet.vlegal.model.VLegalSuggestDocument suggestion)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException, java.rmi.RemoteException {
		return getService().updateSuggestion(suggestion);
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
		com.vportal.portlet.vlegal.model.VLegalSuggestDocument entry,
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
		com.vportal.portlet.vlegal.model.VLegalSuggestDocument entry,
		java.lang.String[] communityPermissions,
		java.lang.String[] guestPermissions)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		getService()
			.addEntryResources(entry, communityPermissions, guestPermissions);
	}

	public static void deleteSuggestion(java.lang.String suggestionId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException, java.rmi.RemoteException {
		getService().deleteSuggestion(suggestionId);
	}

	public static void deleteSuggestions(java.lang.String[] suggestionIds)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException, java.rmi.RemoteException {
		getService().deleteSuggestions(suggestionIds);
	}

	public static void deleteSuggestions(java.lang.String draftId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException, java.rmi.RemoteException {
		getService().deleteSuggestions(draftId);
	}

	public static void deleteSuggestions(java.lang.String draftId,
		boolean approved)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException, java.rmi.RemoteException {
		getService().deleteSuggestions(draftId, approved);
	}

	public static com.vportal.portlet.vlegal.model.VLegalSuggestDocument getSuggestion(
		java.lang.String suggestionId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException, java.rmi.RemoteException {
		return getService().getSuggestion(suggestionId);
	}

	public static com.vportal.portlet.vlegal.model.VLegalSuggestDocument getSuggestion(
		long groupId, java.lang.String suggestionId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException, java.rmi.RemoteException {
		return getService().getSuggestion(groupId, suggestionId);
	}

	public static java.util.List getSuggestions(java.lang.String draftId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException, java.rmi.RemoteException {
		return getService().getSuggestions(draftId);
	}

	public static java.util.List getSuggestions(boolean approved,
		java.lang.String draftId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException, java.rmi.RemoteException {
		return getService().getSuggestions(approved, draftId);
	}

	public static java.util.List getSuggestionsByP_L(long groupId,
		java.lang.String language)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException, java.rmi.RemoteException {
		return getService().getSuggestionsByP_L(groupId, language);
	}

	public static java.util.List getSuggestionsByP_L_A(long groupId,
		java.lang.String language, boolean approved)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException, java.rmi.RemoteException {
		return getService().getSuggestionsByP_L_A(groupId, language, approved);
	}

	public static java.util.List getSuggestionsByP_L_A_D(long groupId,
		java.lang.String language, boolean approved, java.lang.String draftId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException, java.rmi.RemoteException {
		return getService()
				   .getSuggestionsByP_L_A_D(groupId, language, approved, draftId);
	}

	public static java.util.List getSuggestionsByP_L_A_D(long groupId,
		java.lang.String language, boolean approved, java.lang.String draftId,
		int begin, int end)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException, java.rmi.RemoteException {
		return getService()
				   .getSuggestionsByP_L_A_D(groupId, language, approved,
			draftId, begin, end);
	}

	public static int countSuggestionsByP_L_A_D(long groupId,
		java.lang.String language, boolean approved, java.lang.String draftId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException, java.rmi.RemoteException {
		return getService()
				   .countSuggestionsByP_L_A_D(groupId, language, approved,
			draftId);
	}

	public static com.vportal.portlet.vlegal.model.VLegalSuggestDocument addSuggestion(
		java.lang.String arg0, java.lang.String arg1, java.lang.String arg2,
		java.lang.String arg3, java.lang.String arg4, java.lang.String arg5,
		java.lang.String arg6, long arg7, java.lang.String arg8, boolean arg9,
		long arg10, long arg11, java.lang.String[] arg12,
		java.lang.String[] arg13, com.liferay.portal.theme.ThemeDisplay arg14)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException, java.rmi.RemoteException {
		return getService()
				   .addSuggestion(arg0, arg1, arg2, arg3, arg4, arg5, arg6,
			arg7, arg8, arg9, arg10, arg11, arg12, arg13, arg14);
	}

	public static com.vportal.portlet.vlegal.model.VLegalSuggestDocument addSuggestion(
		java.lang.String arg0, java.lang.String arg1, java.lang.String arg2,
		java.lang.String arg3, java.lang.String arg4, java.lang.String arg5,
		java.lang.String arg6, long arg7, java.lang.String arg8, boolean arg9,
		long arg10, long arg11, java.lang.Boolean arg12,
		java.lang.Boolean arg13, java.lang.String[] arg14,
		java.lang.String[] arg15, com.liferay.portal.theme.ThemeDisplay arg16)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException, java.rmi.RemoteException {
		return getService()
				   .addSuggestion(arg0, arg1, arg2, arg3, arg4, arg5, arg6,
			arg7, arg8, arg9, arg10, arg11, arg12, arg13, arg14, arg15, arg16);
	}

	public static com.vportal.portlet.vlegal.model.VLegalSuggestDocument updateSuggestions(
		com.vportal.portlet.vlegal.model.VLegalSuggestDocument arg0)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException, java.rmi.RemoteException {
		return getService().updateSuggestions(arg0);
	}

	public static com.vportal.portlet.vlegal.model.VLegalSuggestDocument updateSuggestions(
		java.lang.String arg0, java.lang.String arg1, long arg2,
		java.lang.String arg3, java.lang.String arg4, java.lang.String arg5,
		java.lang.String arg6, java.lang.String arg7, java.lang.String arg8,
		boolean arg9, boolean arg10)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException, java.rmi.RemoteException {
		return getService()
				   .updateSuggestions(arg0, arg1, arg2, arg3, arg4, arg5, arg6,
			arg7, arg8, arg9, arg10);
	}

	public static void clearService() {
		_service = null;
	}

	public static VLegalSuggestDocumentService getService() {
		if (_service == null) {
			Object obj = PortletBeanLocatorUtil.locate(ClpSerializer.SERVLET_CONTEXT_NAME,
					VLegalSuggestDocumentService.class.getName());
			ClassLoader portletClassLoader = (ClassLoader)PortletBeanLocatorUtil.locate(ClpSerializer.SERVLET_CONTEXT_NAME,
					"portletClassLoader");

			ClassLoaderProxy classLoaderProxy = new ClassLoaderProxy(obj,
					portletClassLoader);

			_service = new VLegalSuggestDocumentServiceClp(classLoaderProxy);

			ClpSerializer.setClassLoader(portletClassLoader);
		}

		return _service;
	}

	public void setService(VLegalSuggestDocumentService service) {
		_service = service;
	}

	private static VLegalSuggestDocumentService _service;
}