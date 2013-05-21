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

package com.vportal.portlet.vlegal.service.http;

import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;

import com.vportal.portlet.vlegal.service.VLegalSuggestDocumentServiceUtil;

import java.rmi.RemoteException;

/**
 * <p>
 * This class provides a SOAP utility for the
 * {@link com.vportal.portlet.vlegal.service.VLegalSuggestDocumentServiceUtil} service utility. The
 * static methods of this class calls the same methods of the service utility.
 * However, the signatures are different because it is difficult for SOAP to
 * support certain types.
 * </p>
 *
 * <p>
 * ServiceBuilder follows certain rules in translating the methods. For example,
 * if the method in the service utility returns a {@link java.util.List}, that
 * is translated to an array of {@link com.vportal.portlet.vlegal.model.VLegalSuggestDocumentSoap}.
 * If the method in the service utility returns a
 * {@link com.vportal.portlet.vlegal.model.VLegalSuggestDocument}, that is translated to a
 * {@link com.vportal.portlet.vlegal.model.VLegalSuggestDocumentSoap}. Methods that SOAP cannot
 * safely wire are skipped.
 * </p>
 *
 * <p>
 * The benefits of using the SOAP utility is that it is cross platform
 * compatible. SOAP allows different languages like Java, .NET, C++, PHP, and
 * even Perl, to call the generated services. One drawback of SOAP is that it is
 * slow because it needs to serialize all calls into a text format (XML).
 * </p>
 *
 * <p>
 * You can see a list of services at
 * http://localhost:8080/tunnel-web/secure/axis. Set the property
 * <b>tunnel.servlet.hosts.allowed</b> in portal.properties to configure
 * security.
 * </p>
 *
 * <p>
 * The SOAP utility is only generated for remote services.
 * </p>
 *
 * @author    ACB
 * @see       VLegalSuggestDocumentServiceHttp
 * @see       com.vportal.portlet.vlegal.model.VLegalSuggestDocumentSoap
 * @see       com.vportal.portlet.vlegal.service.VLegalSuggestDocumentServiceUtil
 * @generated
 */
public class VLegalSuggestDocumentServiceSoap {
	public static com.vportal.portlet.vlegal.model.VLegalSuggestDocumentSoap updateSuggestion(
		java.lang.String suggestionId, java.lang.String draftId, long groupId,
		java.lang.String title, java.lang.String content,
		java.lang.String language, java.lang.String visitorName,
		java.lang.String visitorEmail, java.lang.String visitorTel,
		java.lang.String visitorAddress, boolean approved, boolean hasAttachment)
		throws RemoteException {
		try {
			com.vportal.portlet.vlegal.model.VLegalSuggestDocument returnValue = VLegalSuggestDocumentServiceUtil.updateSuggestion(suggestionId,
					draftId, groupId, title, content, language, visitorName,
					visitorEmail, visitorTel, visitorAddress, approved,
					hasAttachment);

			return com.vportal.portlet.vlegal.model.VLegalSuggestDocumentSoap.toSoapModel(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static com.vportal.portlet.vlegal.model.VLegalSuggestDocumentSoap updateSuggestion(
		com.vportal.portlet.vlegal.model.VLegalSuggestDocument suggestion)
		throws RemoteException {
		try {
			com.vportal.portlet.vlegal.model.VLegalSuggestDocument returnValue = VLegalSuggestDocumentServiceUtil.updateSuggestion(suggestion);

			return com.vportal.portlet.vlegal.model.VLegalSuggestDocumentSoap.toSoapModel(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static void addEntryResources(long entryId,
		boolean addCommunityPermissions, boolean addGuestPermissions)
		throws RemoteException {
		try {
			VLegalSuggestDocumentServiceUtil.addEntryResources(entryId,
				addCommunityPermissions, addGuestPermissions);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static void addEntryResources(
		com.vportal.portlet.vlegal.model.VLegalSuggestDocument entry,
		boolean addCommunityPermissions, boolean addGuestPermissions)
		throws RemoteException {
		try {
			VLegalSuggestDocumentServiceUtil.addEntryResources(entry,
				addCommunityPermissions, addGuestPermissions);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static void addEntryResources(long entryId,
		java.lang.String[] communityPermissions,
		java.lang.String[] guestPermissions) throws RemoteException {
		try {
			VLegalSuggestDocumentServiceUtil.addEntryResources(entryId,
				communityPermissions, guestPermissions);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static void addEntryResources(
		com.vportal.portlet.vlegal.model.VLegalSuggestDocument entry,
		java.lang.String[] communityPermissions,
		java.lang.String[] guestPermissions) throws RemoteException {
		try {
			VLegalSuggestDocumentServiceUtil.addEntryResources(entry,
				communityPermissions, guestPermissions);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static void deleteSuggestion(java.lang.String suggestionId)
		throws RemoteException {
		try {
			VLegalSuggestDocumentServiceUtil.deleteSuggestion(suggestionId);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static void deleteSuggestions(java.lang.String[] suggestionIds)
		throws RemoteException {
		try {
			VLegalSuggestDocumentServiceUtil.deleteSuggestions(suggestionIds);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static void deleteSuggestions(java.lang.String draftId)
		throws RemoteException {
		try {
			VLegalSuggestDocumentServiceUtil.deleteSuggestions(draftId);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static void deleteSuggestions(java.lang.String draftId,
		boolean approved) throws RemoteException {
		try {
			VLegalSuggestDocumentServiceUtil.deleteSuggestions(draftId, approved);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static com.vportal.portlet.vlegal.model.VLegalSuggestDocumentSoap getSuggestion(
		java.lang.String suggestionId) throws RemoteException {
		try {
			com.vportal.portlet.vlegal.model.VLegalSuggestDocument returnValue = VLegalSuggestDocumentServiceUtil.getSuggestion(suggestionId);

			return com.vportal.portlet.vlegal.model.VLegalSuggestDocumentSoap.toSoapModel(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static com.vportal.portlet.vlegal.model.VLegalSuggestDocumentSoap getSuggestion(
		long groupId, java.lang.String suggestionId) throws RemoteException {
		try {
			com.vportal.portlet.vlegal.model.VLegalSuggestDocument returnValue = VLegalSuggestDocumentServiceUtil.getSuggestion(groupId,
					suggestionId);

			return com.vportal.portlet.vlegal.model.VLegalSuggestDocumentSoap.toSoapModel(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static com.vportal.portlet.vlegal.model.VLegalSuggestDocumentSoap[] getSuggestions(
		java.lang.String draftId) throws RemoteException {
		try {
			java.util.List returnValue = VLegalSuggestDocumentServiceUtil.getSuggestions(draftId);

			return com.vportal.portlet.vlegal.model.VLegalSuggestDocumentSoap.toSoapModels(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static com.vportal.portlet.vlegal.model.VLegalSuggestDocumentSoap[] getSuggestions(
		boolean approved, java.lang.String draftId) throws RemoteException {
		try {
			java.util.List returnValue = VLegalSuggestDocumentServiceUtil.getSuggestions(approved,
					draftId);

			return com.vportal.portlet.vlegal.model.VLegalSuggestDocumentSoap.toSoapModels(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static com.vportal.portlet.vlegal.model.VLegalSuggestDocumentSoap[] getSuggestionsByP_L(
		long groupId, java.lang.String language) throws RemoteException {
		try {
			java.util.List returnValue = VLegalSuggestDocumentServiceUtil.getSuggestionsByP_L(groupId,
					language);

			return com.vportal.portlet.vlegal.model.VLegalSuggestDocumentSoap.toSoapModels(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static com.vportal.portlet.vlegal.model.VLegalSuggestDocumentSoap[] getSuggestionsByP_L_A(
		long groupId, java.lang.String language, boolean approved)
		throws RemoteException {
		try {
			java.util.List returnValue = VLegalSuggestDocumentServiceUtil.getSuggestionsByP_L_A(groupId,
					language, approved);

			return com.vportal.portlet.vlegal.model.VLegalSuggestDocumentSoap.toSoapModels(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static com.vportal.portlet.vlegal.model.VLegalSuggestDocumentSoap[] getSuggestionsByP_L_A_D(
		long groupId, java.lang.String language, boolean approved,
		java.lang.String draftId) throws RemoteException {
		try {
			java.util.List returnValue = VLegalSuggestDocumentServiceUtil.getSuggestionsByP_L_A_D(groupId,
					language, approved, draftId);

			return com.vportal.portlet.vlegal.model.VLegalSuggestDocumentSoap.toSoapModels(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static com.vportal.portlet.vlegal.model.VLegalSuggestDocumentSoap[] getSuggestionsByP_L_A_D(
		long groupId, java.lang.String language, boolean approved,
		java.lang.String draftId, int begin, int end) throws RemoteException {
		try {
			java.util.List returnValue = VLegalSuggestDocumentServiceUtil.getSuggestionsByP_L_A_D(groupId,
					language, approved, draftId, begin, end);

			return com.vportal.portlet.vlegal.model.VLegalSuggestDocumentSoap.toSoapModels(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static int countSuggestionsByP_L_A_D(long groupId,
		java.lang.String language, boolean approved, java.lang.String draftId)
		throws RemoteException {
		try {
			int returnValue = VLegalSuggestDocumentServiceUtil.countSuggestionsByP_L_A_D(groupId,
					language, approved, draftId);

			return returnValue;
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static com.vportal.portlet.vlegal.model.VLegalSuggestDocumentSoap updateSuggestions(
		com.vportal.portlet.vlegal.model.VLegalSuggestDocument arg0)
		throws RemoteException {
		try {
			com.vportal.portlet.vlegal.model.VLegalSuggestDocument returnValue = VLegalSuggestDocumentServiceUtil.updateSuggestions(arg0);

			return com.vportal.portlet.vlegal.model.VLegalSuggestDocumentSoap.toSoapModel(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static com.vportal.portlet.vlegal.model.VLegalSuggestDocumentSoap updateSuggestions(
		java.lang.String arg0, java.lang.String arg1, long arg2,
		java.lang.String arg3, java.lang.String arg4, java.lang.String arg5,
		java.lang.String arg6, java.lang.String arg7, java.lang.String arg8,
		boolean arg9, boolean arg10) throws RemoteException {
		try {
			com.vportal.portlet.vlegal.model.VLegalSuggestDocument returnValue = VLegalSuggestDocumentServiceUtil.updateSuggestions(arg0,
					arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10);

			return com.vportal.portlet.vlegal.model.VLegalSuggestDocumentSoap.toSoapModel(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	private static Log _log = LogFactoryUtil.getLog(VLegalSuggestDocumentServiceSoap.class);
}