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

import com.vportal.portlet.vlegal.service.VLegalDocumentServiceUtil;

import java.rmi.RemoteException;

/**
 * <p>
 * This class provides a SOAP utility for the
 * {@link com.vportal.portlet.vlegal.service.VLegalDocumentServiceUtil} service utility. The
 * static methods of this class calls the same methods of the service utility.
 * However, the signatures are different because it is difficult for SOAP to
 * support certain types.
 * </p>
 *
 * <p>
 * ServiceBuilder follows certain rules in translating the methods. For example,
 * if the method in the service utility returns a {@link java.util.List}, that
 * is translated to an array of {@link com.vportal.portlet.vlegal.model.VLegalDocumentSoap}.
 * If the method in the service utility returns a
 * {@link com.vportal.portlet.vlegal.model.VLegalDocument}, that is translated to a
 * {@link com.vportal.portlet.vlegal.model.VLegalDocumentSoap}. Methods that SOAP cannot
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
 * @see       VLegalDocumentServiceHttp
 * @see       com.vportal.portlet.vlegal.model.VLegalDocumentSoap
 * @see       com.vportal.portlet.vlegal.service.VLegalDocumentServiceUtil
 * @generated
 */
public class VLegalDocumentServiceSoap {
	public static void addEntryResources(long entryId,
		boolean addCommunityPermissions, boolean addGuestPermissions)
		throws RemoteException {
		try {
			VLegalDocumentServiceUtil.addEntryResources(entryId,
				addCommunityPermissions, addGuestPermissions);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static void addEntryResources(
		com.vportal.portlet.vlegal.model.VLegalDocument entry,
		boolean addCommunityPermissions, boolean addGuestPermissions)
		throws RemoteException {
		try {
			VLegalDocumentServiceUtil.addEntryResources(entry,
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
			VLegalDocumentServiceUtil.addEntryResources(entryId,
				communityPermissions, guestPermissions);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static void addEntryResources(
		com.vportal.portlet.vlegal.model.VLegalDocument entry,
		java.lang.String[] communityPermissions,
		java.lang.String[] guestPermissions) throws RemoteException {
		try {
			VLegalDocumentServiceUtil.addEntryResources(entry,
				communityPermissions, guestPermissions);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static com.vportal.portlet.vlegal.model.VLegalDocumentSoap updateDocument(
		java.lang.String docId, long groupId, java.lang.String symbol,
		java.lang.String num, java.lang.String replaceDoc,
		java.lang.String summary, java.lang.String content,
		java.lang.String language, int status, java.util.Date promulDate,
		java.util.Date effectivedDate, java.util.Date expiredDate,
		java.lang.String typeId, java.lang.String fieldId,
		java.lang.String orgId, java.lang.String orgRels,
		java.lang.String signerRels, java.lang.String fieldRels,
		java.lang.String numRels, java.lang.String departmentRels,
		boolean hasAttachment) throws RemoteException {
		try {
			com.vportal.portlet.vlegal.model.VLegalDocument returnValue = VLegalDocumentServiceUtil.updateDocument(docId,
					groupId, symbol, num, replaceDoc, summary, content,
					language, status, promulDate, effectivedDate, expiredDate,
					typeId, fieldId, orgId, orgRels, signerRels, fieldRels,
					numRels, departmentRels, hasAttachment);

			return com.vportal.portlet.vlegal.model.VLegalDocumentSoap.toSoapModel(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static void updateDocument(java.lang.String docId,
		java.lang.String docCode) throws RemoteException {
		try {
			VLegalDocumentServiceUtil.updateDocument(docId, docCode);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static com.vportal.portlet.vlegal.model.VLegalDocumentSoap updateDocument(
		com.vportal.portlet.vlegal.model.VLegalDocument vDoc)
		throws RemoteException {
		try {
			com.vportal.portlet.vlegal.model.VLegalDocument returnValue = VLegalDocumentServiceUtil.updateDocument(vDoc);

			return com.vportal.portlet.vlegal.model.VLegalDocumentSoap.toSoapModel(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static void deleteDocument(java.lang.String docId, long companyId)
		throws RemoteException {
		try {
			VLegalDocumentServiceUtil.deleteDocument(docId, companyId);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static com.vportal.portlet.vlegal.model.VLegalDocumentSoap getDocument(
		java.lang.String docId) throws RemoteException {
		try {
			com.vportal.portlet.vlegal.model.VLegalDocument returnValue = VLegalDocumentServiceUtil.getDocument(docId);

			return com.vportal.portlet.vlegal.model.VLegalDocumentSoap.toSoapModel(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static com.vportal.portlet.vlegal.model.VLegalDocumentSoap getDocument(
		long groupId, java.lang.String docId) throws RemoteException {
		try {
			com.vportal.portlet.vlegal.model.VLegalDocument returnValue = VLegalDocumentServiceUtil.getDocument(groupId,
					docId);

			return com.vportal.portlet.vlegal.model.VLegalDocumentSoap.toSoapModel(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static com.vportal.portlet.vlegal.model.VLegalDocumentSoap[] getAllDocument()
		throws RemoteException {
		try {
			java.util.List returnValue = VLegalDocumentServiceUtil.getAllDocument();

			return com.vportal.portlet.vlegal.model.VLegalDocumentSoap.toSoapModels(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static com.vportal.portlet.vlegal.model.VLegalDocumentSoap[] getDocumentByLS(
		java.lang.String language, int status) throws RemoteException {
		try {
			java.util.List returnValue = VLegalDocumentServiceUtil.getDocumentByLS(language,
					status);

			return com.vportal.portlet.vlegal.model.VLegalDocumentSoap.toSoapModels(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static com.vportal.portlet.vlegal.model.VLegalDocumentSoap getDocumentByNS(
		long groupId, java.lang.String num, java.lang.String symbol)
		throws RemoteException {
		try {
			com.vportal.portlet.vlegal.model.VLegalDocument returnValue = VLegalDocumentServiceUtil.getDocumentByNS(groupId,
					num, symbol);

			return com.vportal.portlet.vlegal.model.VLegalDocumentSoap.toSoapModel(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static com.vportal.portlet.vlegal.model.VLegalDocumentSoap[] getDocumentByG_L(
		long groupId, java.lang.String language) throws RemoteException {
		try {
			java.util.List returnValue = VLegalDocumentServiceUtil.getDocumentByG_L(groupId,
					language);

			return com.vportal.portlet.vlegal.model.VLegalDocumentSoap.toSoapModels(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static com.vportal.portlet.vlegal.model.VLegalDocumentSoap[] getDocumentByP_L_S(
		long groupId, java.lang.String language, int status)
		throws RemoteException {
		try {
			java.util.List returnValue = VLegalDocumentServiceUtil.getDocumentByP_L_S(groupId,
					language, status);

			return com.vportal.portlet.vlegal.model.VLegalDocumentSoap.toSoapModels(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static int countDocumentByP_L_S(long groupId,
		java.lang.String language, int status) throws RemoteException {
		try {
			int returnValue = VLegalDocumentServiceUtil.countDocumentByP_L_S(groupId,
					language, status);

			return returnValue;
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static int countDocumentByP_L_S(java.lang.String language, int status)
		throws RemoteException {
		try {
			int returnValue = VLegalDocumentServiceUtil.countDocumentByP_L_S(language,
					status);

			return returnValue;
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static com.vportal.portlet.vlegal.model.VLegalDocumentSoap[] countDocumentByL_S(
		java.lang.String language, int status) throws RemoteException {
		try {
			java.util.List returnValue = VLegalDocumentServiceUtil.countDocumentByL_S(language,
					status);

			return com.vportal.portlet.vlegal.model.VLegalDocumentSoap.toSoapModels(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static com.vportal.portlet.vlegal.model.VLegalDocumentSoap[] getDocumentByP_L_S(
		long groupId, java.lang.String language, int status,
		com.liferay.portal.kernel.util.OrderByComparator obc)
		throws RemoteException {
		try {
			java.util.List returnValue = VLegalDocumentServiceUtil.getDocumentByP_L_S(groupId,
					language, status, obc);

			return com.vportal.portlet.vlegal.model.VLegalDocumentSoap.toSoapModels(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static com.vportal.portlet.vlegal.model.VLegalDocumentSoap[] getDocumentByP_L_S(
		long groupId, java.lang.String language, int status, int begin, int end)
		throws RemoteException {
		try {
			java.util.List returnValue = VLegalDocumentServiceUtil.getDocumentByP_L_S(groupId,
					language, status, begin, end);

			return com.vportal.portlet.vlegal.model.VLegalDocumentSoap.toSoapModels(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static com.vportal.portlet.vlegal.model.VLegalDocumentSoap[] getDocumentByP_L_S(
		java.lang.String language, int status, int begin, int end)
		throws RemoteException {
		try {
			java.util.List returnValue = VLegalDocumentServiceUtil.getDocumentByP_L_S(language,
					status, begin, end);

			return com.vportal.portlet.vlegal.model.VLegalDocumentSoap.toSoapModels(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static com.vportal.portlet.vlegal.model.VLegalDocumentSoap[] getDocumentByP_U_S(
		long groupId, long createdByUser, int status, java.lang.String language)
		throws RemoteException {
		try {
			java.util.List returnValue = VLegalDocumentServiceUtil.getDocumentByP_U_S(groupId,
					createdByUser, status, language);

			return com.vportal.portlet.vlegal.model.VLegalDocumentSoap.toSoapModels(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static com.vportal.portlet.vlegal.model.VLegalDocumentSoap[] getDocumentByP_U_S(
		long groupId, long createdByUser, int status,
		java.lang.String language,
		com.liferay.portal.kernel.util.OrderByComparator obc)
		throws RemoteException {
		try {
			java.util.List returnValue = VLegalDocumentServiceUtil.getDocumentByP_U_S(groupId,
					createdByUser, status, language, obc);

			return com.vportal.portlet.vlegal.model.VLegalDocumentSoap.toSoapModels(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static com.vportal.portlet.vlegal.model.VLegalDocumentSoap[] getDocumentByG_O_T_L_S(
		long groupId, java.lang.String orgId, java.lang.String typeDocId,
		java.lang.String language, int status) throws RemoteException {
		try {
			java.util.List returnValue = VLegalDocumentServiceUtil.getDocumentByG_O_T_L_S(groupId,
					orgId, typeDocId, language, status);

			return com.vportal.portlet.vlegal.model.VLegalDocumentSoap.toSoapModels(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static com.vportal.portlet.vlegal.model.VLegalDocumentSoap[] getDocumentBySummary(
		long groupId, java.lang.String language, int status,
		java.lang.String summary, long departId) throws RemoteException {
		try {
			java.util.List returnValue = VLegalDocumentServiceUtil.getDocumentBySummary(groupId,
					language, status, summary, departId);

			return com.vportal.portlet.vlegal.model.VLegalDocumentSoap.toSoapModels(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static com.vportal.portlet.vlegal.model.VLegalDocumentSoap[] getDocumentByStatus(
		long groupId, java.lang.String language, long userId, int status)
		throws RemoteException {
		try {
			java.util.List returnValue = VLegalDocumentServiceUtil.getDocumentByStatus(groupId,
					language, userId, status);

			return com.vportal.portlet.vlegal.model.VLegalDocumentSoap.toSoapModels(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static com.vportal.portlet.vlegal.model.VLegalDocumentSoap[] getAllDocumentByStatus(
		long groupId, java.lang.String language, long userId, int status,
		int start, int end) throws RemoteException {
		try {
			java.util.List returnValue = VLegalDocumentServiceUtil.getAllDocumentByStatus(groupId,
					language, userId, status, start, end);

			return com.vportal.portlet.vlegal.model.VLegalDocumentSoap.toSoapModels(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static int countDocumentByStatus(long groupId,
		java.lang.String language, long userId, int status)
		throws RemoteException {
		try {
			int returnValue = VLegalDocumentServiceUtil.countDocumentByStatus(groupId,
					language, userId, status);

			return returnValue;
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static com.vportal.portlet.vlegal.model.VLegalDocumentSoap[] getDocByStatus(
		long groupId, java.lang.String language, long userId, int statusDoc)
		throws RemoteException {
		try {
			java.util.List returnValue = VLegalDocumentServiceUtil.getDocByStatus(groupId,
					language, userId, statusDoc);

			return com.vportal.portlet.vlegal.model.VLegalDocumentSoap.toSoapModels(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static com.vportal.portlet.vlegal.model.VLegalDocumentSoap[] getDocumentByG_L_O_S(
		long groupId, java.lang.String language, java.lang.String orgId,
		int status) throws RemoteException {
		try {
			java.util.List returnValue = VLegalDocumentServiceUtil.getDocumentByG_L_O_S(groupId,
					language, orgId, status);

			return com.vportal.portlet.vlegal.model.VLegalDocumentSoap.toSoapModels(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static com.vportal.portlet.vlegal.model.VLegalDocumentSoap[] getDocumentByG_L_O_S(
		long groupId, java.lang.String language, java.lang.String orgId,
		int status, int start, int end) throws RemoteException {
		try {
			java.util.List returnValue = VLegalDocumentServiceUtil.getDocumentByG_L_O_S(groupId,
					language, orgId, status, start, end);

			return com.vportal.portlet.vlegal.model.VLegalDocumentSoap.toSoapModels(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static int countDocumentByG_L_O_S(long groupId,
		java.lang.String language, java.lang.String orgId, int status)
		throws RemoteException {
		try {
			int returnValue = VLegalDocumentServiceUtil.countDocumentByG_L_O_S(groupId,
					language, orgId, status);

			return returnValue;
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static com.vportal.portlet.vlegal.model.VLegalDocumentSoap[] getDocumentByG_L_T_S(
		long groupId, java.lang.String language, java.lang.String typeDocId,
		int status) throws RemoteException {
		try {
			java.util.List returnValue = VLegalDocumentServiceUtil.getDocumentByG_L_T_S(groupId,
					language, typeDocId, status);

			return com.vportal.portlet.vlegal.model.VLegalDocumentSoap.toSoapModels(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static com.vportal.portlet.vlegal.model.VLegalDocumentSoap[] getDocumentByG_L_T_S(
		long groupId, java.lang.String language, java.lang.String typeDocId,
		int status, int start, int end) throws RemoteException {
		try {
			java.util.List returnValue = VLegalDocumentServiceUtil.getDocumentByG_L_T_S(groupId,
					language, typeDocId, status, start, end);

			return com.vportal.portlet.vlegal.model.VLegalDocumentSoap.toSoapModels(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static int countDocumentByG_L_T_S(long groupId,
		java.lang.String language, java.lang.String typeDocId, int status)
		throws RemoteException {
		try {
			int returnValue = VLegalDocumentServiceUtil.countDocumentByG_L_T_S(groupId,
					language, typeDocId, status);

			return returnValue;
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static com.vportal.portlet.vlegal.model.VLegalDocumentSoap[] getDocumentByG_L_F_S(
		long groupId, java.lang.String language, java.lang.String fieldId,
		int status) throws RemoteException {
		try {
			java.util.List returnValue = VLegalDocumentServiceUtil.getDocumentByG_L_F_S(groupId,
					language, fieldId, status);

			return com.vportal.portlet.vlegal.model.VLegalDocumentSoap.toSoapModels(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static int countDocumentByG_L_F_S(long groupId,
		java.lang.String language, java.lang.String fieldId, int status)
		throws RemoteException {
		try {
			int returnValue = VLegalDocumentServiceUtil.countDocumentByG_L_F_S(groupId,
					language, fieldId, status);

			return returnValue;
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static int countDocumentByL_F_S(java.lang.String language,
		java.lang.String fieldId, int status) throws RemoteException {
		try {
			int returnValue = VLegalDocumentServiceUtil.countDocumentByL_F_S(language,
					fieldId, status);

			return returnValue;
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static int countByStatus(long groupId, java.lang.String language,
		int status) throws RemoteException {
		try {
			int returnValue = VLegalDocumentServiceUtil.countByStatus(groupId,
					language, status);

			return returnValue;
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static com.vportal.portlet.vlegal.model.VLegalDocumentSoap[] getDocumentByF_O_T(
		long groupId, java.lang.String typeDocId, java.lang.String orgId,
		java.lang.String fieldId, java.lang.String language, int begin, int end)
		throws RemoteException {
		try {
			java.util.List returnValue = VLegalDocumentServiceUtil.getDocumentByF_O_T(groupId,
					typeDocId, orgId, fieldId, language, begin, end);

			return com.vportal.portlet.vlegal.model.VLegalDocumentSoap.toSoapModels(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static int countDocumentByF_O_T(long groupId,
		java.lang.String typeDocId, java.lang.String orgId,
		java.lang.String fieldId, java.lang.String language)
		throws RemoteException {
		try {
			int returnValue = VLegalDocumentServiceUtil.countDocumentByF_O_T(groupId,
					typeDocId, orgId, fieldId, language);

			return returnValue;
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static com.vportal.portlet.vlegal.model.VLegalDocumentSoap[] getDocByPromulDate(
		long groupId, java.lang.String language, java.util.Date proDateFrom,
		java.util.Date proDateTo, int status, int quantity)
		throws RemoteException {
		try {
			java.util.List returnValue = VLegalDocumentServiceUtil.getDocByPromulDate(groupId,
					language, proDateFrom, proDateTo, status, quantity);

			return com.vportal.portlet.vlegal.model.VLegalDocumentSoap.toSoapModels(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static com.vportal.portlet.vlegal.model.VLegalDocumentSoap[] searchAdvanceDocument(
		long groupId, java.lang.String language, java.lang.String fieldId,
		java.util.Date proDateFrom, java.util.Date proDateTo,
		java.lang.String summary, java.lang.String num,
		java.lang.String symbol, java.util.Date expDateFrom,
		java.util.Date expDateTo, java.lang.String[] typeIds,
		java.lang.String[] orgIds, java.lang.String[] sigIds,
		java.lang.String content, int status) throws RemoteException {
		try {
			java.util.List returnValue = VLegalDocumentServiceUtil.searchAdvanceDocument(groupId,
					language, fieldId, proDateFrom, proDateTo, summary, num,
					symbol, expDateFrom, expDateTo, typeIds, orgIds, sigIds,
					content, status);

			return com.vportal.portlet.vlegal.model.VLegalDocumentSoap.toSoapModels(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static com.vportal.portlet.vlegal.model.VLegalDocumentSoap[] getDocument_Basic(
		long groupId, java.lang.String language, java.lang.String number,
		java.lang.String symbol, java.lang.String fieldId,
		java.lang.String orgId, java.lang.String typeId,
		java.util.Date proDateFrom, java.util.Date proDateTo,
		java.lang.String summary, int status) throws RemoteException {
		try {
			java.util.List returnValue = VLegalDocumentServiceUtil.getDocument_Basic(groupId,
					language, number, symbol, fieldId, orgId, typeId,
					proDateFrom, proDateTo, summary, status);

			return com.vportal.portlet.vlegal.model.VLegalDocumentSoap.toSoapModels(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static com.vportal.portlet.vlegal.model.VLegalDocumentSoap[] getDocument_Basic(
		long groupId, java.lang.String language, java.lang.String number,
		java.lang.String symbol, java.lang.String fieldId,
		java.lang.String orgId, java.lang.String typeId,
		java.util.Date proDateFrom, java.util.Date proDateTo,
		java.lang.String summary, int status, int start, int end)
		throws RemoteException {
		try {
			java.util.List returnValue = VLegalDocumentServiceUtil.getDocument_Basic(groupId,
					language, number, symbol, fieldId, orgId, typeId,
					proDateFrom, proDateTo, summary, status, start, end);

			return com.vportal.portlet.vlegal.model.VLegalDocumentSoap.toSoapModels(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static com.vportal.portlet.vlegal.model.VLegalDocumentSoap[] getDocument_Basic(
		java.lang.String language, java.lang.String number,
		java.lang.String symbol, java.lang.String fieldId,
		java.lang.String orgId, java.lang.String typeId,
		java.util.Date proDateFrom, java.util.Date proDateTo,
		java.lang.String summary, int status, int start, int end)
		throws RemoteException {
		try {
			java.util.List returnValue = VLegalDocumentServiceUtil.getDocument_Basic(language,
					number, symbol, fieldId, orgId, typeId, proDateFrom,
					proDateTo, summary, status, start, end);

			return com.vportal.portlet.vlegal.model.VLegalDocumentSoap.toSoapModels(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static int countDocument_Basic(long groupId,
		java.lang.String language, java.lang.String number,
		java.lang.String symbol, java.lang.String fieldId,
		java.lang.String orgId, java.lang.String typeId,
		java.util.Date proDateFrom, java.util.Date proDateTo,
		java.lang.String summary, int status) throws RemoteException {
		try {
			int returnValue = VLegalDocumentServiceUtil.countDocument_Basic(groupId,
					language, number, symbol, fieldId, orgId, typeId,
					proDateFrom, proDateTo, summary, status);

			return returnValue;
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static int countDocument_Basic(java.lang.String language,
		java.lang.String number, java.lang.String symbol,
		java.lang.String fieldId, java.lang.String orgId,
		java.lang.String typeId, java.util.Date proDateFrom,
		java.util.Date proDateTo, java.lang.String summary, int status)
		throws RemoteException {
		try {
			int returnValue = VLegalDocumentServiceUtil.countDocument_Basic(language,
					number, symbol, fieldId, orgId, typeId, proDateFrom,
					proDateTo, summary, status);

			return returnValue;
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static com.vportal.portlet.vlegal.model.VLegalDocumentSoap[] searchDocumentByParam(
		long groupId, java.lang.String language, java.lang.String keyword,
		java.lang.String orgId, java.lang.String typeDocId,
		java.lang.String fieldId, java.lang.String sigId, boolean isNum,
		boolean isSymbol, boolean isSummary, boolean isContent,
		boolean isPromulDate, java.util.Date promulDateFrom,
		java.util.Date promulDateTo, boolean isEffectiveDate,
		java.util.Date effectiveDateFrom, java.util.Date effectiveDateTo,
		boolean isExpiredDate, java.util.Date expireDateFrom,
		java.util.Date expireDateTo, int statusDoc, java.lang.String select)
		throws RemoteException {
		try {
			java.util.List returnValue = VLegalDocumentServiceUtil.searchDocumentByParam(groupId,
					language, keyword, orgId, typeDocId, fieldId, sigId, isNum,
					isSymbol, isSummary, isContent, isPromulDate,
					promulDateFrom, promulDateTo, isEffectiveDate,
					effectiveDateFrom, effectiveDateTo, isExpiredDate,
					expireDateFrom, expireDateTo, statusDoc, select);

			return com.vportal.portlet.vlegal.model.VLegalDocumentSoap.toSoapModels(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static com.vportal.portlet.vlegal.model.VLegalDocumentSoap[] searchDocumentByParam(
		long groupId, java.lang.String language, java.lang.String keyword,
		java.lang.String orgId, java.lang.String typeDocId,
		java.lang.String fieldId, java.lang.String sigId, boolean isNum,
		boolean isSymbol, boolean isSummary, boolean isContent,
		boolean isPromulDate, java.util.Date promulDateFrom,
		java.util.Date promulDateTo, boolean isEffectiveDate,
		java.util.Date effectiveDateFrom, java.util.Date effectiveDateTo,
		boolean isExpiredDate, java.util.Date expireDateFrom,
		java.util.Date expireDateTo, int statusDoc, java.lang.String select,
		int start, int end) throws RemoteException {
		try {
			java.util.List returnValue = VLegalDocumentServiceUtil.searchDocumentByParam(groupId,
					language, keyword, orgId, typeDocId, fieldId, sigId, isNum,
					isSymbol, isSummary, isContent, isPromulDate,
					promulDateFrom, promulDateTo, isEffectiveDate,
					effectiveDateFrom, effectiveDateTo, isExpiredDate,
					expireDateFrom, expireDateTo, statusDoc, select, start, end);

			return com.vportal.portlet.vlegal.model.VLegalDocumentSoap.toSoapModels(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static int countSearchDocumentByParam(long groupId,
		java.lang.String language, java.lang.String keyword,
		java.lang.String orgId, java.lang.String typeDocId,
		java.lang.String fieldId, java.lang.String sigId, boolean isNum,
		boolean isSymbol, boolean isSummary, boolean isContent,
		boolean isPromulDate, java.util.Date promulDateFrom,
		java.util.Date promulDateTo, boolean isEffectiveDate,
		java.util.Date effectiveDateFrom, java.util.Date effectiveDateTo,
		boolean isExpiredDate, java.util.Date expireDateFrom,
		java.util.Date expireDateTo, int statusDoc, java.lang.String select)
		throws RemoteException {
		try {
			int returnValue = VLegalDocumentServiceUtil.countSearchDocumentByParam(groupId,
					language, keyword, orgId, typeDocId, fieldId, sigId, isNum,
					isSymbol, isSummary, isContent, isPromulDate,
					promulDateFrom, promulDateTo, isEffectiveDate,
					effectiveDateFrom, effectiveDateTo, isExpiredDate,
					expireDateFrom, expireDateTo, statusDoc, select);

			return returnValue;
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static com.vportal.portlet.vlegal.model.VLegalDocumentSoap[] getContDocumentByF_O_T(
		long groupId, java.lang.String typeDocId, java.lang.String orgId,
		java.lang.String fieldId, java.lang.String language,
		java.util.Date fromDate, java.lang.String begDocId, int begin, int end)
		throws RemoteException {
		try {
			java.util.List returnValue = VLegalDocumentServiceUtil.getContDocumentByF_O_T(groupId,
					typeDocId, orgId, fieldId, language, fromDate, begDocId,
					begin, end);

			return com.vportal.portlet.vlegal.model.VLegalDocumentSoap.toSoapModels(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static com.vportal.portlet.vlegal.model.VLegalDocumentSoap[] getContDocumentByF_O_T(
		java.lang.String language, java.lang.String typeDocId,
		java.lang.String orgId, java.lang.String fieldId,
		java.util.Date fromDate, java.lang.String begDocId, int begin, int end)
		throws RemoteException {
		try {
			java.util.List returnValue = VLegalDocumentServiceUtil.getContDocumentByF_O_T(language,
					typeDocId, orgId, fieldId, fromDate, begDocId, begin, end);

			return com.vportal.portlet.vlegal.model.VLegalDocumentSoap.toSoapModels(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static com.vportal.portlet.vlegal.model.VLegalDocumentSoap[] searchDocument(
		long groupId, java.lang.String language, java.lang.String num,
		java.lang.String symbol, int begin, int end) throws RemoteException {
		try {
			java.util.List returnValue = VLegalDocumentServiceUtil.searchDocument(groupId,
					language, num, symbol, begin, end);

			return com.vportal.portlet.vlegal.model.VLegalDocumentSoap.toSoapModels(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static com.vportal.portlet.vlegal.model.VLegalDocumentSoap[] findDocOrther(
		long groupId, java.lang.String language, java.lang.String documentId,
		int status) throws RemoteException {
		try {
			java.util.List returnValue = VLegalDocumentServiceUtil.findDocOrther(groupId,
					language, documentId, status);

			return com.vportal.portlet.vlegal.model.VLegalDocumentSoap.toSoapModels(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static int countDocOrther(long groupId, java.lang.String language,
		java.lang.String documentId, int status) throws RemoteException {
		try {
			int returnValue = VLegalDocumentServiceUtil.countDocOrther(groupId,
					language, documentId, status);

			return returnValue;
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static com.vportal.portlet.vlegal.model.VLegalDocumentSoap[] getDocByExpiredDate(
		long groupId, java.lang.String language, java.lang.String documentId,
		java.lang.String summary, java.lang.String num,
		java.lang.String symbol, int status) throws RemoteException {
		try {
			java.util.List returnValue = VLegalDocumentServiceUtil.getDocByExpiredDate(groupId,
					language, documentId, summary, num, symbol, status);

			return com.vportal.portlet.vlegal.model.VLegalDocumentSoap.toSoapModels(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static int countDocByExpiredDate(long groupId,
		java.lang.String language, java.lang.String documentId,
		java.lang.String summary, java.lang.String num,
		java.lang.String symbol, int status) throws RemoteException {
		try {
			int returnValue = VLegalDocumentServiceUtil.countDocByExpiredDate(groupId,
					language, documentId, summary, num, symbol, status);

			return returnValue;
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static com.vportal.portlet.vlegal.model.VLegalDocumentSoap[] getDocByG_L_F(
		long groupId, java.lang.String language, java.lang.String fieldId)
		throws RemoteException {
		try {
			java.util.List returnValue = VLegalDocumentServiceUtil.getDocByG_L_F(groupId,
					language, fieldId);

			return com.vportal.portlet.vlegal.model.VLegalDocumentSoap.toSoapModels(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static com.vportal.portlet.vlegal.model.VLegalDocumentSoap[] getDocByG_L_T(
		long groupId, java.lang.String language, java.lang.String typeId)
		throws RemoteException {
		try {
			java.util.List returnValue = VLegalDocumentServiceUtil.getDocByG_L_T(groupId,
					language, typeId);

			return com.vportal.portlet.vlegal.model.VLegalDocumentSoap.toSoapModels(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static com.vportal.portlet.vlegal.model.VLegalDocumentSoap[] getDocByG_L_O(
		long groupId, java.lang.String language, java.lang.String orgId)
		throws RemoteException {
		try {
			java.util.List returnValue = VLegalDocumentServiceUtil.getDocByG_L_O(groupId,
					language, orgId);

			return com.vportal.portlet.vlegal.model.VLegalDocumentSoap.toSoapModels(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static void reIndex(java.lang.String[] ids)
		throws RemoteException {
		try {
			VLegalDocumentServiceUtil.reIndex(ids);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static void _validate(java.lang.String symbol, java.lang.String num,
		java.lang.String summary, java.lang.String fieldId,
		java.lang.String orgId, java.lang.String typeId,
		java.lang.String signers) throws RemoteException {
		try {
			VLegalDocumentServiceUtil._validate(symbol, num, summary, fieldId,
				orgId, typeId, signers);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static com.liferay.portal.kernel.search.Hits search(long companyId,
		long groupId, long userId, java.lang.String keywords, int start, int end)
		throws RemoteException {
		try {
			com.liferay.portal.kernel.search.Hits returnValue = VLegalDocumentServiceUtil.search(companyId,
					groupId, userId, keywords, start, end);

			return returnValue;
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	private static Log _log = LogFactoryUtil.getLog(VLegalDocumentServiceSoap.class);
}