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

import com.vportal.portlet.vlegal.service.VLegalDraftDocumentServiceUtil;

import java.rmi.RemoteException;

/**
 * <p>
 * This class provides a SOAP utility for the
 * {@link com.vportal.portlet.vlegal.service.VLegalDraftDocumentServiceUtil} service utility. The
 * static methods of this class calls the same methods of the service utility.
 * However, the signatures are different because it is difficult for SOAP to
 * support certain types.
 * </p>
 *
 * <p>
 * ServiceBuilder follows certain rules in translating the methods. For example,
 * if the method in the service utility returns a {@link java.util.List}, that
 * is translated to an array of {@link com.vportal.portlet.vlegal.model.VLegalDraftDocumentSoap}.
 * If the method in the service utility returns a
 * {@link com.vportal.portlet.vlegal.model.VLegalDraftDocument}, that is translated to a
 * {@link com.vportal.portlet.vlegal.model.VLegalDraftDocumentSoap}. Methods that SOAP cannot
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
 * @see       VLegalDraftDocumentServiceHttp
 * @see       com.vportal.portlet.vlegal.model.VLegalDraftDocumentSoap
 * @see       com.vportal.portlet.vlegal.service.VLegalDraftDocumentServiceUtil
 * @generated
 */
public class VLegalDraftDocumentServiceSoap {
	public static com.vportal.portlet.vlegal.model.VLegalDraftDocumentSoap updateDraft(
		java.lang.String draftId, long groupId, java.lang.String title,
		java.lang.String content, java.lang.String language,
		java.lang.String typeId, java.lang.String fieldId,
		java.util.Date expiredDate, int status, boolean hasAttachment)
		throws RemoteException {
		try {
			com.vportal.portlet.vlegal.model.VLegalDraftDocument returnValue = VLegalDraftDocumentServiceUtil.updateDraft(draftId,
					groupId, title, content, language, typeId, fieldId,
					expiredDate, status, hasAttachment);

			return com.vportal.portlet.vlegal.model.VLegalDraftDocumentSoap.toSoapModel(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static com.vportal.portlet.vlegal.model.VLegalDraftDocumentSoap updateDraft(
		com.vportal.portlet.vlegal.model.VLegalDraftDocument draft)
		throws RemoteException {
		try {
			com.vportal.portlet.vlegal.model.VLegalDraftDocument returnValue = VLegalDraftDocumentServiceUtil.updateDraft(draft);

			return com.vportal.portlet.vlegal.model.VLegalDraftDocumentSoap.toSoapModel(returnValue);
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
			VLegalDraftDocumentServiceUtil.addEntryResources(entryId,
				addCommunityPermissions, addGuestPermissions);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static void addEntryResources(
		com.vportal.portlet.vlegal.model.VLegalDraftDocument entry,
		boolean addCommunityPermissions, boolean addGuestPermissions)
		throws RemoteException {
		try {
			VLegalDraftDocumentServiceUtil.addEntryResources(entry,
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
			VLegalDraftDocumentServiceUtil.addEntryResources(entryId,
				communityPermissions, guestPermissions);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static void addEntryResources(
		com.vportal.portlet.vlegal.model.VLegalDraftDocument entry,
		java.lang.String[] communityPermissions,
		java.lang.String[] guestPermissions) throws RemoteException {
		try {
			VLegalDraftDocumentServiceUtil.addEntryResources(entry,
				communityPermissions, guestPermissions);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static void deleteDraft(java.lang.String draftId)
		throws RemoteException {
		try {
			VLegalDraftDocumentServiceUtil.deleteDraft(draftId);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static void deleteDrafts(java.lang.String[] draftIds)
		throws RemoteException {
		try {
			VLegalDraftDocumentServiceUtil.deleteDrafts(draftIds);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static com.vportal.portlet.vlegal.model.VLegalDraftDocumentSoap getDraft(
		java.lang.String draftId) throws RemoteException {
		try {
			com.vportal.portlet.vlegal.model.VLegalDraftDocument returnValue = VLegalDraftDocumentServiceUtil.getDraft(draftId);

			return com.vportal.portlet.vlegal.model.VLegalDraftDocumentSoap.toSoapModel(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static com.vportal.portlet.vlegal.model.VLegalDraftDocumentSoap getDraft(
		long groupId, java.lang.String draftId) throws RemoteException {
		try {
			com.vportal.portlet.vlegal.model.VLegalDraftDocument returnValue = VLegalDraftDocumentServiceUtil.getDraft(groupId,
					draftId);

			return com.vportal.portlet.vlegal.model.VLegalDraftDocumentSoap.toSoapModel(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static com.vportal.portlet.vlegal.model.VLegalDraftDocumentSoap[] getDrafts(
		java.lang.String[] draftIds) throws RemoteException {
		try {
			java.util.List returnValue = VLegalDraftDocumentServiceUtil.getDrafts(draftIds);

			return com.vportal.portlet.vlegal.model.VLegalDraftDocumentSoap.toSoapModels(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static com.vportal.portlet.vlegal.model.VLegalDraftDocumentSoap[] getDraftsByDocCode(
		java.lang.String docCode) throws RemoteException {
		try {
			java.util.List returnValue = VLegalDraftDocumentServiceUtil.getDraftsByDocCode(docCode);

			return com.vportal.portlet.vlegal.model.VLegalDraftDocumentSoap.toSoapModels(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static com.vportal.portlet.vlegal.model.VLegalDraftDocumentSoap[] getDraftsByP_L_S(
		long groupId, java.lang.String language, int status)
		throws RemoteException {
		try {
			java.util.List returnValue = VLegalDraftDocumentServiceUtil.getDraftsByP_L_S(groupId,
					language, status);

			return com.vportal.portlet.vlegal.model.VLegalDraftDocumentSoap.toSoapModels(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static com.vportal.portlet.vlegal.model.VLegalDraftDocumentSoap[] getDraftsByP_L_S(
		long groupId, java.lang.String language, int status, int start, int end)
		throws RemoteException {
		try {
			java.util.List returnValue = VLegalDraftDocumentServiceUtil.getDraftsByP_L_S(groupId,
					language, status, start, end);

			return com.vportal.portlet.vlegal.model.VLegalDraftDocumentSoap.toSoapModels(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static int countDraftsByP_L_S(long groupId,
		java.lang.String language, int status) throws RemoteException {
		try {
			int returnValue = VLegalDraftDocumentServiceUtil.countDraftsByP_L_S(groupId,
					language, status);

			return returnValue;
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static com.vportal.portlet.vlegal.model.VLegalDraftDocumentSoap[] getDraftsByP_L_S_E(
		long groupId, java.lang.String language, int status)
		throws RemoteException {
		try {
			java.util.List returnValue = VLegalDraftDocumentServiceUtil.getDraftsByP_L_S_E(groupId,
					language, status);

			return com.vportal.portlet.vlegal.model.VLegalDraftDocumentSoap.toSoapModels(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static com.vportal.portlet.vlegal.model.VLegalDraftDocumentSoap[] getDraftsByP_S_U_L(
		long groupId, int status, long createdByUser, java.lang.String language)
		throws RemoteException {
		try {
			java.util.List returnValue = VLegalDraftDocumentServiceUtil.getDraftsByP_S_U_L(groupId,
					status, createdByUser, language);

			return com.vportal.portlet.vlegal.model.VLegalDraftDocumentSoap.toSoapModels(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static com.vportal.portlet.vlegal.model.VLegalDraftDocumentSoap[] getDraftsByP_S_D(
		long groupId, int status, java.lang.String docCode)
		throws RemoteException {
		try {
			java.util.List returnValue = VLegalDraftDocumentServiceUtil.getDraftsByP_S_D(groupId,
					status, docCode);

			return com.vportal.portlet.vlegal.model.VLegalDraftDocumentSoap.toSoapModels(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static com.vportal.portlet.vlegal.model.VLegalDraftDocumentSoap[] getDraftsByP_S_F(
		long groupId, int status, java.lang.String fieldId)
		throws RemoteException {
		try {
			java.util.List returnValue = VLegalDraftDocumentServiceUtil.getDraftsByP_S_F(groupId,
					status, fieldId);

			return com.vportal.portlet.vlegal.model.VLegalDraftDocumentSoap.toSoapModels(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static com.vportal.portlet.vlegal.model.VLegalDraftDocumentSoap[] getDraftsByP_S_T(
		long groupId, int status, java.lang.String typeId)
		throws RemoteException {
		try {
			java.util.List returnValue = VLegalDraftDocumentServiceUtil.getDraftsByP_S_T(groupId,
					status, typeId);

			return com.vportal.portlet.vlegal.model.VLegalDraftDocumentSoap.toSoapModels(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static com.vportal.portlet.vlegal.model.VLegalDraftDocumentSoap[] getDraftsExpiredDateByP_L_S(
		long groupId, java.lang.String language, int status)
		throws RemoteException {
		try {
			java.util.List returnValue = VLegalDraftDocumentServiceUtil.getDraftsExpiredDateByP_L_S(groupId,
					language, status);

			return com.vportal.portlet.vlegal.model.VLegalDraftDocumentSoap.toSoapModels(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static com.vportal.portlet.vlegal.model.VLegalDraftDocumentSoap[] getDraftsExpiredDateByP_L_S(
		long groupId, java.lang.String language, int status, int start, int end)
		throws RemoteException {
		try {
			java.util.List returnValue = VLegalDraftDocumentServiceUtil.getDraftsExpiredDateByP_L_S(groupId,
					language, status, start, end);

			return com.vportal.portlet.vlegal.model.VLegalDraftDocumentSoap.toSoapModels(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static int countDraftsExpiredDateByP_L_S(long groupId,
		java.lang.String language, int status) throws RemoteException {
		try {
			int returnValue = VLegalDraftDocumentServiceUtil.countDraftsExpiredDateByP_L_S(groupId,
					language, status);

			return returnValue;
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static com.vportal.portlet.vlegal.model.VLegalDraftDocumentSoap[] getDratfsbyP_S(
		long groupId, java.lang.String language) throws RemoteException {
		try {
			java.util.List returnValue = VLegalDraftDocumentServiceUtil.getDratfsbyP_S(groupId,
					language);

			return com.vportal.portlet.vlegal.model.VLegalDraftDocumentSoap.toSoapModels(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static com.vportal.portlet.vlegal.model.VLegalDraftDocumentSoap[] getTopNewDrafts(
		long groupId, java.lang.String language, int status, int quantity)
		throws RemoteException {
		try {
			java.util.List returnValue = VLegalDraftDocumentServiceUtil.getTopNewDrafts(groupId,
					language, status, quantity);

			return com.vportal.portlet.vlegal.model.VLegalDraftDocumentSoap.toSoapModels(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static com.vportal.portlet.vlegal.model.VLegalDraftDocumentSoap[] getTopNewDrafts(
		java.lang.String fieldId, long groupId, java.lang.String language,
		int status, int quantity) throws RemoteException {
		try {
			java.util.List returnValue = VLegalDraftDocumentServiceUtil.getTopNewDrafts(fieldId,
					groupId, language, status, quantity);

			return com.vportal.portlet.vlegal.model.VLegalDraftDocumentSoap.toSoapModels(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static com.vportal.portlet.vlegal.model.VLegalDraftDocumentSoap[] getOlderDrafts(
		java.lang.String fieldId, java.lang.String draftId, long groupId,
		java.lang.String language, int status, int quantity)
		throws RemoteException {
		try {
			java.util.List returnValue = VLegalDraftDocumentServiceUtil.getOlderDrafts(fieldId,
					draftId, groupId, language, status, quantity);

			return com.vportal.portlet.vlegal.model.VLegalDraftDocumentSoap.toSoapModels(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static int countByStatus(long groupId, java.lang.String language,
		int status) throws RemoteException {
		try {
			int returnValue = VLegalDraftDocumentServiceUtil.countByStatus(groupId,
					language, status);

			return returnValue;
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static com.vportal.portlet.vlegal.model.VLegalDraftDocumentSoap[] getDraftByParam(
		long groupId, java.lang.String language, java.lang.String fieldId,
		java.lang.String typeId, int status, java.lang.String title,
		java.lang.String content, int start, int end) throws RemoteException {
		try {
			java.util.List returnValue = VLegalDraftDocumentServiceUtil.getDraftByParam(groupId,
					language, fieldId, typeId, status, title, content, start,
					end);

			return com.vportal.portlet.vlegal.model.VLegalDraftDocumentSoap.toSoapModels(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static int countDraftByParam(long groupId,
		java.lang.String language, java.lang.String fieldId,
		java.lang.String typeId, int status, java.lang.String title,
		java.lang.String content) throws RemoteException {
		try {
			int returnValue = VLegalDraftDocumentServiceUtil.countDraftByParam(groupId,
					language, fieldId, typeId, status, title, content);

			return returnValue;
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static int countDraftsByP_L_S_E(long arg0, java.lang.String arg1,
		int arg2) throws RemoteException {
		try {
			int returnValue = VLegalDraftDocumentServiceUtil.countDraftsByP_L_S_E(arg0,
					arg1, arg2);

			return returnValue;
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static com.vportal.portlet.vlegal.model.VLegalDraftDocumentSoap[] getDraftsByP_L_S_E(
		long arg0, java.lang.String arg1, int arg2, int arg3, int arg4)
		throws RemoteException {
		try {
			java.util.List returnValue = VLegalDraftDocumentServiceUtil.getDraftsByP_L_S_E(arg0,
					arg1, arg2, arg3, arg4);

			return com.vportal.portlet.vlegal.model.VLegalDraftDocumentSoap.toSoapModels(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	private static Log _log = LogFactoryUtil.getLog(VLegalDraftDocumentServiceSoap.class);
}