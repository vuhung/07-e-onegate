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
public class VLegalDocumentServiceClp implements VLegalDocumentService {
	public VLegalDocumentServiceClp(ClassLoaderProxy classLoaderProxy) {
		_classLoaderProxy = classLoaderProxy;
	}

	public com.vportal.portlet.vlegal.model.VLegalDocument addDocument(
		long groupId, java.lang.String symbol, java.lang.String num,
		java.lang.String replaceDoc, java.lang.String summary,
		java.lang.String content, java.lang.String language,
		java.util.Date promulDate, java.util.Date effectivedDate,
		java.util.Date expiredDate, java.lang.String typeId,
		java.lang.String fieldId, java.lang.String orgId,
		java.lang.String orgRels, java.lang.String signerRels,
		java.lang.String fieldRels, java.lang.String numRels,
		java.lang.String docCode, java.lang.String departmentRels,
		boolean hasAttachment, java.lang.String[] communityPermissions,
		java.lang.String[] guestPermissions,
		com.liferay.portal.theme.ThemeDisplay themeDisplay)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.rmi.RemoteException {
		Object returnObj = null;

		MethodHandler methodHandler = new MethodHandler(_addDocumentMethodKey0,
				groupId, symbol, num, replaceDoc, summary, content, language,
				promulDate, effectivedDate, expiredDate, typeId, fieldId,
				orgId, orgRels, signerRels, fieldRels, numRels, docCode,
				departmentRels, hasAttachment, communityPermissions,
				guestPermissions, themeDisplay);

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

		return (com.vportal.portlet.vlegal.model.VLegalDocument)ClpSerializer.translateOutput(returnObj);
	}

	public com.vportal.portlet.vlegal.model.VLegalDocument addDocument(
		long groupId, java.lang.String symbol, java.lang.String num,
		java.lang.String replaceDoc, java.lang.String summary,
		java.lang.String content, java.lang.String language,
		java.util.Date promulDate, java.util.Date effectivedDate,
		java.util.Date expiredDate, java.lang.String typeId,
		java.lang.String fieldId, java.lang.String orgId,
		java.lang.String orgRels, java.lang.String signerRels,
		java.lang.String fieldRels, java.lang.String numRels,
		java.lang.String docCode, java.lang.String departmentRels,
		boolean hasAttachment, java.lang.Boolean addCommunityPermissions,
		java.lang.Boolean addGuestPermissions,
		java.lang.String[] communityPermissions,
		java.lang.String[] guestPermissions,
		com.liferay.portal.theme.ThemeDisplay themeDisplay)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.rmi.RemoteException {
		Object returnObj = null;

		MethodHandler methodHandler = new MethodHandler(_addDocumentMethodKey1,
				groupId, symbol, num, replaceDoc, summary, content, language,
				promulDate, effectivedDate, expiredDate, typeId, fieldId,
				orgId, orgRels, signerRels, fieldRels, numRels, docCode,
				departmentRels, hasAttachment, addCommunityPermissions,
				addGuestPermissions, communityPermissions, guestPermissions,
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

		return (com.vportal.portlet.vlegal.model.VLegalDocument)ClpSerializer.translateOutput(returnObj);
	}

	public void addEntryResources(long entryId,
		boolean addCommunityPermissions, boolean addGuestPermissions)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		MethodHandler methodHandler = new MethodHandler(_addEntryResourcesMethodKey2,
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
		com.vportal.portlet.vlegal.model.VLegalDocument entry,
		boolean addCommunityPermissions, boolean addGuestPermissions)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		MethodHandler methodHandler = new MethodHandler(_addEntryResourcesMethodKey3,
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
		MethodHandler methodHandler = new MethodHandler(_addEntryResourcesMethodKey4,
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
		com.vportal.portlet.vlegal.model.VLegalDocument entry,
		java.lang.String[] communityPermissions,
		java.lang.String[] guestPermissions)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		MethodHandler methodHandler = new MethodHandler(_addEntryResourcesMethodKey5,
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

	public com.vportal.portlet.vlegal.model.VLegalDocument updateDocument(
		java.lang.String docId, long groupId, java.lang.String symbol,
		java.lang.String num, java.lang.String replaceDoc,
		java.lang.String summary, java.lang.String content,
		java.lang.String language, int status, java.util.Date promulDate,
		java.util.Date effectivedDate, java.util.Date expiredDate,
		java.lang.String typeId, java.lang.String fieldId,
		java.lang.String orgId, java.lang.String orgRels,
		java.lang.String signerRels, java.lang.String fieldRels,
		java.lang.String numRels, java.lang.String departmentRels,
		boolean hasAttachment)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.io.IOException, java.rmi.RemoteException {
		Object returnObj = null;

		MethodHandler methodHandler = new MethodHandler(_updateDocumentMethodKey6,
				docId, groupId, symbol, num, replaceDoc, summary, content,
				language, status, promulDate, effectivedDate, expiredDate,
				typeId, fieldId, orgId, orgRels, signerRels, fieldRels,
				numRels, departmentRels, hasAttachment);

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

			if (t instanceof java.io.IOException) {
				throw (java.io.IOException)t;
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

		return (com.vportal.portlet.vlegal.model.VLegalDocument)ClpSerializer.translateOutput(returnObj);
	}

	public void updateDocument(java.lang.String docId, java.lang.String docCode)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.rmi.RemoteException {
		MethodHandler methodHandler = new MethodHandler(_updateDocumentMethodKey7,
				docId, docCode);

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

	public com.vportal.portlet.vlegal.model.VLegalDocument updateDocument(
		com.vportal.portlet.vlegal.model.VLegalDocument vDoc)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.io.IOException, java.rmi.RemoteException {
		Object returnObj = null;

		MethodHandler methodHandler = new MethodHandler(_updateDocumentMethodKey8,
				vDoc);

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

			if (t instanceof java.io.IOException) {
				throw (java.io.IOException)t;
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

		return (com.vportal.portlet.vlegal.model.VLegalDocument)ClpSerializer.translateOutput(returnObj);
	}

	public void deleteDocument(java.lang.String docId, long companyId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.io.IOException, java.rmi.RemoteException {
		MethodHandler methodHandler = new MethodHandler(_deleteDocumentMethodKey9,
				docId, companyId);

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

			if (t instanceof java.io.IOException) {
				throw (java.io.IOException)t;
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

	public com.vportal.portlet.vlegal.model.VLegalDocument getDocument(
		java.lang.String docId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		Object returnObj = null;

		MethodHandler methodHandler = new MethodHandler(_getDocumentMethodKey10,
				docId);

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

			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}

		return (com.vportal.portlet.vlegal.model.VLegalDocument)ClpSerializer.translateOutput(returnObj);
	}

	public com.vportal.portlet.vlegal.model.VLegalDocument getDocument(
		long groupId, java.lang.String docId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		Object returnObj = null;

		MethodHandler methodHandler = new MethodHandler(_getDocumentMethodKey11,
				groupId, docId);

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

			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}

		return (com.vportal.portlet.vlegal.model.VLegalDocument)ClpSerializer.translateOutput(returnObj);
	}

	public java.util.List getAllDocument()
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		Object returnObj = null;

		MethodHandler methodHandler = new MethodHandler(_getAllDocumentMethodKey12);

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

	public java.util.List getDocumentByLS(java.lang.String language, int status)
		throws com.liferay.portal.kernel.exception.SystemException {
		Object returnObj = null;

		MethodHandler methodHandler = new MethodHandler(_getDocumentByLSMethodKey13,
				language, status);

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

	public com.vportal.portlet.vlegal.model.VLegalDocument getDocumentByNS(
		long groupId, java.lang.String num, java.lang.String symbol)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		Object returnObj = null;

		MethodHandler methodHandler = new MethodHandler(_getDocumentByNSMethodKey14,
				groupId, num, symbol);

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

			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}

		return (com.vportal.portlet.vlegal.model.VLegalDocument)ClpSerializer.translateOutput(returnObj);
	}

	public java.util.List getDocumentByG_L(long groupId,
		java.lang.String language)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		Object returnObj = null;

		MethodHandler methodHandler = new MethodHandler(_getDocumentByG_LMethodKey15,
				groupId, language);

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

	public java.util.List getDocumentByP_L_S(long groupId,
		java.lang.String language, int status)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		Object returnObj = null;

		MethodHandler methodHandler = new MethodHandler(_getDocumentByP_L_SMethodKey16,
				groupId, language, status);

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

	public int countDocumentByP_L_S(long groupId, java.lang.String language,
		int status)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		Object returnObj = null;

		MethodHandler methodHandler = new MethodHandler(_countDocumentByP_L_SMethodKey17,
				groupId, language, status);

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

	public int countDocumentByP_L_S(java.lang.String language, int status)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		Object returnObj = null;

		MethodHandler methodHandler = new MethodHandler(_countDocumentByP_L_SMethodKey18,
				language, status);

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

	public java.util.List countDocumentByL_S(java.lang.String language,
		int status)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		Object returnObj = null;

		MethodHandler methodHandler = new MethodHandler(_countDocumentByL_SMethodKey19,
				language, status);

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

	public java.util.List getDocumentByP_L_S(long groupId,
		java.lang.String language, int status,
		com.liferay.portal.kernel.util.OrderByComparator obc)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		Object returnObj = null;

		MethodHandler methodHandler = new MethodHandler(_getDocumentByP_L_SMethodKey20,
				groupId, language, status, obc);

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

	public java.util.List getDocumentByP_L_S(long groupId,
		java.lang.String language, int status, int begin, int end)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		Object returnObj = null;

		MethodHandler methodHandler = new MethodHandler(_getDocumentByP_L_SMethodKey21,
				groupId, language, status, begin, end);

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

	public java.util.List getDocumentByP_L_S(java.lang.String language,
		int status, int begin, int end)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		Object returnObj = null;

		MethodHandler methodHandler = new MethodHandler(_getDocumentByP_L_SMethodKey22,
				language, status, begin, end);

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

	public java.util.List getDocumentByP_U_S(long groupId, long createdByUser,
		int status, java.lang.String language)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		Object returnObj = null;

		MethodHandler methodHandler = new MethodHandler(_getDocumentByP_U_SMethodKey23,
				groupId, createdByUser, status, language);

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

	public java.util.List getDocumentByP_U_S(long groupId, long createdByUser,
		int status, java.lang.String language,
		com.liferay.portal.kernel.util.OrderByComparator obc)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		Object returnObj = null;

		MethodHandler methodHandler = new MethodHandler(_getDocumentByP_U_SMethodKey24,
				groupId, createdByUser, status, language, obc);

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

	public java.util.List getDocumentByG_O_T_L_S(long groupId,
		java.lang.String orgId, java.lang.String typeDocId,
		java.lang.String language, int status)
		throws com.liferay.portal.kernel.exception.SystemException {
		Object returnObj = null;

		MethodHandler methodHandler = new MethodHandler(_getDocumentByG_O_T_L_SMethodKey25,
				groupId, orgId, typeDocId, language, status);

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

	public java.util.List getDocumentBySummary(long groupId,
		java.lang.String language, int status, java.lang.String summary,
		long departId)
		throws com.liferay.portal.kernel.exception.SystemException {
		Object returnObj = null;

		MethodHandler methodHandler = new MethodHandler(_getDocumentBySummaryMethodKey26,
				groupId, language, status, summary, departId);

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

	public java.util.List getDocumentByStatus(long groupId,
		java.lang.String language, long userId, int status)
		throws com.liferay.portal.kernel.exception.SystemException {
		Object returnObj = null;

		MethodHandler methodHandler = new MethodHandler(_getDocumentByStatusMethodKey27,
				groupId, language, userId, status);

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

	public java.util.List getAllDocumentByStatus(long groupId,
		java.lang.String language, long userId, int status, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		Object returnObj = null;

		MethodHandler methodHandler = new MethodHandler(_getAllDocumentByStatusMethodKey28,
				groupId, language, userId, status, start, end);

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

	public int countDocumentByStatus(long groupId, java.lang.String language,
		long userId, int status)
		throws com.liferay.portal.kernel.exception.SystemException {
		Object returnObj = null;

		MethodHandler methodHandler = new MethodHandler(_countDocumentByStatusMethodKey29,
				groupId, language, userId, status);

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

	public java.util.List getDocByStatus(long groupId,
		java.lang.String language, long userId, int statusDoc)
		throws com.liferay.portal.kernel.exception.SystemException {
		Object returnObj = null;

		MethodHandler methodHandler = new MethodHandler(_getDocByStatusMethodKey30,
				groupId, language, userId, statusDoc);

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

	public java.util.List getDocumentByG_L_O_S(long groupId,
		java.lang.String language, java.lang.String orgId, int status)
		throws com.liferay.portal.kernel.exception.SystemException {
		Object returnObj = null;

		MethodHandler methodHandler = new MethodHandler(_getDocumentByG_L_O_SMethodKey31,
				groupId, language, orgId, status);

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

	public java.util.List getDocumentByG_L_O_S(long groupId,
		java.lang.String language, java.lang.String orgId, int status,
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		Object returnObj = null;

		MethodHandler methodHandler = new MethodHandler(_getDocumentByG_L_O_SMethodKey32,
				groupId, language, orgId, status, start, end);

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

	public int countDocumentByG_L_O_S(long groupId, java.lang.String language,
		java.lang.String orgId, int status)
		throws com.liferay.portal.kernel.exception.SystemException {
		Object returnObj = null;

		MethodHandler methodHandler = new MethodHandler(_countDocumentByG_L_O_SMethodKey33,
				groupId, language, orgId, status);

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

	public java.util.List getDocumentByG_L_T_S(long groupId,
		java.lang.String language, java.lang.String typeDocId, int status)
		throws com.liferay.portal.kernel.exception.SystemException {
		Object returnObj = null;

		MethodHandler methodHandler = new MethodHandler(_getDocumentByG_L_T_SMethodKey34,
				groupId, language, typeDocId, status);

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

	public java.util.List getDocumentByG_L_T_S(long groupId,
		java.lang.String language, java.lang.String typeDocId, int status,
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		Object returnObj = null;

		MethodHandler methodHandler = new MethodHandler(_getDocumentByG_L_T_SMethodKey35,
				groupId, language, typeDocId, status, start, end);

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

	public int countDocumentByG_L_T_S(long groupId, java.lang.String language,
		java.lang.String typeDocId, int status)
		throws com.liferay.portal.kernel.exception.SystemException {
		Object returnObj = null;

		MethodHandler methodHandler = new MethodHandler(_countDocumentByG_L_T_SMethodKey36,
				groupId, language, typeDocId, status);

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

	public java.util.List getDocumentByG_L_F_S(long groupId,
		java.lang.String language, java.lang.String fieldId, int status)
		throws com.liferay.portal.kernel.exception.SystemException {
		Object returnObj = null;

		MethodHandler methodHandler = new MethodHandler(_getDocumentByG_L_F_SMethodKey37,
				groupId, language, fieldId, status);

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

	public int countDocumentByG_L_F_S(long groupId, java.lang.String language,
		java.lang.String fieldId, int status)
		throws com.liferay.portal.kernel.exception.SystemException {
		Object returnObj = null;

		MethodHandler methodHandler = new MethodHandler(_countDocumentByG_L_F_SMethodKey38,
				groupId, language, fieldId, status);

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

	public int countDocumentByL_F_S(java.lang.String language,
		java.lang.String fieldId, int status)
		throws com.liferay.portal.kernel.exception.SystemException,
			java.rmi.RemoteException {
		Object returnObj = null;

		MethodHandler methodHandler = new MethodHandler(_countDocumentByL_F_SMethodKey39,
				language, fieldId, status);

		try {
			returnObj = _classLoaderProxy.invoke(methodHandler);
		}
		catch (Throwable t) {
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

	public int countByStatus(long groupId, java.lang.String language, int status)
		throws com.liferay.portal.kernel.exception.SystemException {
		Object returnObj = null;

		MethodHandler methodHandler = new MethodHandler(_countByStatusMethodKey40,
				groupId, language, status);

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

	public java.util.List getDocumentByF_O_T(long groupId,
		java.lang.String typeDocId, java.lang.String orgId,
		java.lang.String fieldId, java.lang.String language, int begin, int end)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		Object returnObj = null;

		MethodHandler methodHandler = new MethodHandler(_getDocumentByF_O_TMethodKey41,
				groupId, typeDocId, orgId, fieldId, language, begin, end);

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

	public int countDocumentByF_O_T(long groupId, java.lang.String typeDocId,
		java.lang.String orgId, java.lang.String fieldId,
		java.lang.String language)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		Object returnObj = null;

		MethodHandler methodHandler = new MethodHandler(_countDocumentByF_O_TMethodKey42,
				groupId, typeDocId, orgId, fieldId, language);

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

	public java.util.List getDocByPromulDate(long groupId,
		java.lang.String language, java.util.Date proDateFrom,
		java.util.Date proDateTo, int status, int quantity)
		throws com.liferay.portal.kernel.exception.SystemException {
		Object returnObj = null;

		MethodHandler methodHandler = new MethodHandler(_getDocByPromulDateMethodKey43,
				groupId, language, proDateFrom, proDateTo, status, quantity);

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

	public java.util.List searchAdvanceDocument(long groupId,
		java.lang.String language, java.lang.String fieldId,
		java.util.Date proDateFrom, java.util.Date proDateTo,
		java.lang.String summary, java.lang.String num,
		java.lang.String symbol, java.util.Date expDateFrom,
		java.util.Date expDateTo, java.lang.String[] typeIds,
		java.lang.String[] orgIds, java.lang.String[] sigIds,
		java.lang.String content, int status)
		throws com.liferay.portal.kernel.exception.SystemException {
		Object returnObj = null;

		MethodHandler methodHandler = new MethodHandler(_searchAdvanceDocumentMethodKey44,
				groupId, language, fieldId, proDateFrom, proDateTo, summary,
				num, symbol, expDateFrom, expDateTo, typeIds, orgIds, sigIds,
				content, status);

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

	public java.util.List getDocument_Basic(long groupId,
		java.lang.String language, java.lang.String number,
		java.lang.String symbol, java.lang.String fieldId,
		java.lang.String orgId, java.lang.String typeId,
		java.util.Date proDateFrom, java.util.Date proDateTo,
		java.lang.String summary, int status)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		Object returnObj = null;

		MethodHandler methodHandler = new MethodHandler(_getDocument_BasicMethodKey45,
				groupId, language, number, symbol, fieldId, orgId, typeId,
				proDateFrom, proDateTo, summary, status);

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

	public java.util.List getDocument_Basic(long groupId,
		java.lang.String language, java.lang.String number,
		java.lang.String symbol, java.lang.String fieldId,
		java.lang.String orgId, java.lang.String typeId,
		java.util.Date proDateFrom, java.util.Date proDateTo,
		java.lang.String summary, int status, int start, int end)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		Object returnObj = null;

		MethodHandler methodHandler = new MethodHandler(_getDocument_BasicMethodKey46,
				groupId, language, number, symbol, fieldId, orgId, typeId,
				proDateFrom, proDateTo, summary, status, start, end);

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

	public java.util.List getDocument_Basic(java.lang.String language,
		java.lang.String number, java.lang.String symbol,
		java.lang.String fieldId, java.lang.String orgId,
		java.lang.String typeId, java.util.Date proDateFrom,
		java.util.Date proDateTo, java.lang.String summary, int status,
		int start, int end)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		Object returnObj = null;

		MethodHandler methodHandler = new MethodHandler(_getDocument_BasicMethodKey47,
				language, number, symbol, fieldId, orgId, typeId, proDateFrom,
				proDateTo, summary, status, start, end);

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

	public int countDocument_Basic(long groupId, java.lang.String language,
		java.lang.String number, java.lang.String symbol,
		java.lang.String fieldId, java.lang.String orgId,
		java.lang.String typeId, java.util.Date proDateFrom,
		java.util.Date proDateTo, java.lang.String summary, int status)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		Object returnObj = null;

		MethodHandler methodHandler = new MethodHandler(_countDocument_BasicMethodKey48,
				groupId, language, number, symbol, fieldId, orgId, typeId,
				proDateFrom, proDateTo, summary, status);

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

	public int countDocument_Basic(java.lang.String language,
		java.lang.String number, java.lang.String symbol,
		java.lang.String fieldId, java.lang.String orgId,
		java.lang.String typeId, java.util.Date proDateFrom,
		java.util.Date proDateTo, java.lang.String summary, int status)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		Object returnObj = null;

		MethodHandler methodHandler = new MethodHandler(_countDocument_BasicMethodKey49,
				language, number, symbol, fieldId, orgId, typeId, proDateFrom,
				proDateTo, summary, status);

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

	public java.util.List searchDocumentByParam(long groupId,
		java.lang.String language, java.lang.String keyword,
		java.lang.String orgId, java.lang.String typeDocId,
		java.lang.String fieldId, java.lang.String sigId, boolean isNum,
		boolean isSymbol, boolean isSummary, boolean isContent,
		boolean isPromulDate, java.util.Date promulDateFrom,
		java.util.Date promulDateTo, boolean isEffectiveDate,
		java.util.Date effectiveDateFrom, java.util.Date effectiveDateTo,
		boolean isExpiredDate, java.util.Date expireDateFrom,
		java.util.Date expireDateTo, int statusDoc, java.lang.String select)
		throws com.liferay.portal.kernel.exception.SystemException {
		Object returnObj = null;

		MethodHandler methodHandler = new MethodHandler(_searchDocumentByParamMethodKey50,
				groupId, language, keyword, orgId, typeDocId, fieldId, sigId,
				isNum, isSymbol, isSummary, isContent, isPromulDate,
				promulDateFrom, promulDateTo, isEffectiveDate,
				effectiveDateFrom, effectiveDateTo, isExpiredDate,
				expireDateFrom, expireDateTo, statusDoc, select);

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

	public java.util.List searchDocumentByParam(long groupId,
		java.lang.String language, java.lang.String keyword,
		java.lang.String orgId, java.lang.String typeDocId,
		java.lang.String fieldId, java.lang.String sigId, boolean isNum,
		boolean isSymbol, boolean isSummary, boolean isContent,
		boolean isPromulDate, java.util.Date promulDateFrom,
		java.util.Date promulDateTo, boolean isEffectiveDate,
		java.util.Date effectiveDateFrom, java.util.Date effectiveDateTo,
		boolean isExpiredDate, java.util.Date expireDateFrom,
		java.util.Date expireDateTo, int statusDoc, java.lang.String select,
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		Object returnObj = null;

		MethodHandler methodHandler = new MethodHandler(_searchDocumentByParamMethodKey51,
				groupId, language, keyword, orgId, typeDocId, fieldId, sigId,
				isNum, isSymbol, isSummary, isContent, isPromulDate,
				promulDateFrom, promulDateTo, isEffectiveDate,
				effectiveDateFrom, effectiveDateTo, isExpiredDate,
				expireDateFrom, expireDateTo, statusDoc, select, start, end);

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

	public int countSearchDocumentByParam(long groupId,
		java.lang.String language, java.lang.String keyword,
		java.lang.String orgId, java.lang.String typeDocId,
		java.lang.String fieldId, java.lang.String sigId, boolean isNum,
		boolean isSymbol, boolean isSummary, boolean isContent,
		boolean isPromulDate, java.util.Date promulDateFrom,
		java.util.Date promulDateTo, boolean isEffectiveDate,
		java.util.Date effectiveDateFrom, java.util.Date effectiveDateTo,
		boolean isExpiredDate, java.util.Date expireDateFrom,
		java.util.Date expireDateTo, int statusDoc, java.lang.String select)
		throws com.liferay.portal.kernel.exception.SystemException {
		Object returnObj = null;

		MethodHandler methodHandler = new MethodHandler(_countSearchDocumentByParamMethodKey52,
				groupId, language, keyword, orgId, typeDocId, fieldId, sigId,
				isNum, isSymbol, isSummary, isContent, isPromulDate,
				promulDateFrom, promulDateTo, isEffectiveDate,
				effectiveDateFrom, effectiveDateTo, isExpiredDate,
				expireDateFrom, expireDateTo, statusDoc, select);

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

	public java.util.List getContDocumentByF_O_T(long groupId,
		java.lang.String typeDocId, java.lang.String orgId,
		java.lang.String fieldId, java.lang.String language,
		java.util.Date fromDate, java.lang.String begDocId, int begin, int end)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		Object returnObj = null;

		MethodHandler methodHandler = new MethodHandler(_getContDocumentByF_O_TMethodKey53,
				groupId, typeDocId, orgId, fieldId, language, fromDate,
				begDocId, begin, end);

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

	public java.util.List getContDocumentByF_O_T(java.lang.String language,
		java.lang.String typeDocId, java.lang.String orgId,
		java.lang.String fieldId, java.util.Date fromDate,
		java.lang.String begDocId, int begin, int end)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		Object returnObj = null;

		MethodHandler methodHandler = new MethodHandler(_getContDocumentByF_O_TMethodKey54,
				language, typeDocId, orgId, fieldId, fromDate, begDocId, begin,
				end);

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

	public java.util.List searchDocument(long groupId,
		java.lang.String language, java.lang.String num,
		java.lang.String symbol, int begin, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		Object returnObj = null;

		MethodHandler methodHandler = new MethodHandler(_searchDocumentMethodKey55,
				groupId, language, num, symbol, begin, end);

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

	public java.util.List findDocOrther(long groupId,
		java.lang.String language, java.lang.String documentId, int status)
		throws java.lang.Exception {
		Object returnObj = null;

		MethodHandler methodHandler = new MethodHandler(_findDocOrtherMethodKey56,
				groupId, language, documentId, status);

		try {
			returnObj = _classLoaderProxy.invoke(methodHandler);
		}
		catch (Throwable t) {
			if (t instanceof java.lang.Exception) {
				throw (java.lang.Exception)t;
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

	public int countDocOrther(long groupId, java.lang.String language,
		java.lang.String documentId, int status) throws java.lang.Exception {
		Object returnObj = null;

		MethodHandler methodHandler = new MethodHandler(_countDocOrtherMethodKey57,
				groupId, language, documentId, status);

		try {
			returnObj = _classLoaderProxy.invoke(methodHandler);
		}
		catch (Throwable t) {
			if (t instanceof java.lang.Exception) {
				throw (java.lang.Exception)t;
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

	public java.util.List getDocByExpiredDate(long groupId,
		java.lang.String language, java.lang.String documentId,
		java.lang.String summary, java.lang.String num,
		java.lang.String symbol, int status) throws java.lang.Exception {
		Object returnObj = null;

		MethodHandler methodHandler = new MethodHandler(_getDocByExpiredDateMethodKey58,
				groupId, language, documentId, summary, num, symbol, status);

		try {
			returnObj = _classLoaderProxy.invoke(methodHandler);
		}
		catch (Throwable t) {
			if (t instanceof java.lang.Exception) {
				throw (java.lang.Exception)t;
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

	public int countDocByExpiredDate(long groupId, java.lang.String language,
		java.lang.String documentId, java.lang.String summary,
		java.lang.String num, java.lang.String symbol, int status)
		throws java.lang.Exception {
		Object returnObj = null;

		MethodHandler methodHandler = new MethodHandler(_countDocByExpiredDateMethodKey59,
				groupId, language, documentId, summary, num, symbol, status);

		try {
			returnObj = _classLoaderProxy.invoke(methodHandler);
		}
		catch (Throwable t) {
			if (t instanceof java.lang.Exception) {
				throw (java.lang.Exception)t;
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

	public java.util.List getDocByG_L_F(long groupId,
		java.lang.String language, java.lang.String fieldId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.rmi.RemoteException {
		Object returnObj = null;

		MethodHandler methodHandler = new MethodHandler(_getDocByG_L_FMethodKey60,
				groupId, language, fieldId);

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

	public java.util.List getDocByG_L_T(long groupId,
		java.lang.String language, java.lang.String typeId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.rmi.RemoteException {
		Object returnObj = null;

		MethodHandler methodHandler = new MethodHandler(_getDocByG_L_TMethodKey61,
				groupId, language, typeId);

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

	public java.util.List getDocByG_L_O(long groupId,
		java.lang.String language, java.lang.String orgId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.rmi.RemoteException {
		Object returnObj = null;

		MethodHandler methodHandler = new MethodHandler(_getDocByG_L_OMethodKey62,
				groupId, language, orgId);

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

	public void reIndex(java.lang.String[] ids)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.rmi.RemoteException {
		MethodHandler methodHandler = new MethodHandler(_reIndexMethodKey63, ids);

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

	public void _validate(java.lang.String symbol, java.lang.String num,
		java.lang.String summary, java.lang.String fieldId,
		java.lang.String orgId, java.lang.String typeId,
		java.lang.String signers)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.rmi.RemoteException {
		MethodHandler methodHandler = new MethodHandler(__validateMethodKey64,
				symbol, num, summary, fieldId, orgId, typeId, signers);

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

	public com.liferay.portal.kernel.search.Hits search(long companyId,
		long groupId, long userId, java.lang.String keywords, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		Object returnObj = null;

		MethodHandler methodHandler = new MethodHandler(_searchMethodKey65,
				companyId, groupId, userId, keywords, start, end);

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

		return (com.liferay.portal.kernel.search.Hits)ClpSerializer.translateOutput(returnObj);
	}

	public ClassLoaderProxy getClassLoaderProxy() {
		return _classLoaderProxy;
	}

	private ClassLoaderProxy _classLoaderProxy;
	private MethodKey _addDocumentMethodKey0 = new MethodKey(_classLoaderProxy.getClassName(),
			"addDocument", long.class, java.lang.String.class,
			java.lang.String.class, java.lang.String.class,
			java.lang.String.class, java.lang.String.class,
			java.lang.String.class, java.util.Date.class, java.util.Date.class,
			java.util.Date.class, java.lang.String.class,
			java.lang.String.class, java.lang.String.class,
			java.lang.String.class, java.lang.String.class,
			java.lang.String.class, java.lang.String.class,
			java.lang.String.class, java.lang.String.class, boolean.class,
			java.lang.String[].class, java.lang.String[].class,
			com.liferay.portal.theme.ThemeDisplay.class);
	private MethodKey _addDocumentMethodKey1 = new MethodKey(_classLoaderProxy.getClassName(),
			"addDocument", long.class, java.lang.String.class,
			java.lang.String.class, java.lang.String.class,
			java.lang.String.class, java.lang.String.class,
			java.lang.String.class, java.util.Date.class, java.util.Date.class,
			java.util.Date.class, java.lang.String.class,
			java.lang.String.class, java.lang.String.class,
			java.lang.String.class, java.lang.String.class,
			java.lang.String.class, java.lang.String.class,
			java.lang.String.class, java.lang.String.class, boolean.class,
			java.lang.Boolean.class, java.lang.Boolean.class,
			java.lang.String[].class, java.lang.String[].class,
			com.liferay.portal.theme.ThemeDisplay.class);
	private MethodKey _addEntryResourcesMethodKey2 = new MethodKey(_classLoaderProxy.getClassName(),
			"addEntryResources", long.class, boolean.class, boolean.class);
	private MethodKey _addEntryResourcesMethodKey3 = new MethodKey(_classLoaderProxy.getClassName(),
			"addEntryResources",
			com.vportal.portlet.vlegal.model.VLegalDocument.class,
			boolean.class, boolean.class);
	private MethodKey _addEntryResourcesMethodKey4 = new MethodKey(_classLoaderProxy.getClassName(),
			"addEntryResources", long.class, java.lang.String[].class,
			java.lang.String[].class);
	private MethodKey _addEntryResourcesMethodKey5 = new MethodKey(_classLoaderProxy.getClassName(),
			"addEntryResources",
			com.vportal.portlet.vlegal.model.VLegalDocument.class,
			java.lang.String[].class, java.lang.String[].class);
	private MethodKey _updateDocumentMethodKey6 = new MethodKey(_classLoaderProxy.getClassName(),
			"updateDocument", java.lang.String.class, long.class,
			java.lang.String.class, java.lang.String.class,
			java.lang.String.class, java.lang.String.class,
			java.lang.String.class, java.lang.String.class, int.class,
			java.util.Date.class, java.util.Date.class, java.util.Date.class,
			java.lang.String.class, java.lang.String.class,
			java.lang.String.class, java.lang.String.class,
			java.lang.String.class, java.lang.String.class,
			java.lang.String.class, java.lang.String.class, boolean.class);
	private MethodKey _updateDocumentMethodKey7 = new MethodKey(_classLoaderProxy.getClassName(),
			"updateDocument", java.lang.String.class, java.lang.String.class);
	private MethodKey _updateDocumentMethodKey8 = new MethodKey(_classLoaderProxy.getClassName(),
			"updateDocument",
			com.vportal.portlet.vlegal.model.VLegalDocument.class);
	private MethodKey _deleteDocumentMethodKey9 = new MethodKey(_classLoaderProxy.getClassName(),
			"deleteDocument", java.lang.String.class, long.class);
	private MethodKey _getDocumentMethodKey10 = new MethodKey(_classLoaderProxy.getClassName(),
			"getDocument", java.lang.String.class);
	private MethodKey _getDocumentMethodKey11 = new MethodKey(_classLoaderProxy.getClassName(),
			"getDocument", long.class, java.lang.String.class);
	private MethodKey _getAllDocumentMethodKey12 = new MethodKey(_classLoaderProxy.getClassName(),
			"getAllDocument");
	private MethodKey _getDocumentByLSMethodKey13 = new MethodKey(_classLoaderProxy.getClassName(),
			"getDocumentByLS", java.lang.String.class, int.class);
	private MethodKey _getDocumentByNSMethodKey14 = new MethodKey(_classLoaderProxy.getClassName(),
			"getDocumentByNS", long.class, java.lang.String.class,
			java.lang.String.class);
	private MethodKey _getDocumentByG_LMethodKey15 = new MethodKey(_classLoaderProxy.getClassName(),
			"getDocumentByG_L", long.class, java.lang.String.class);
	private MethodKey _getDocumentByP_L_SMethodKey16 = new MethodKey(_classLoaderProxy.getClassName(),
			"getDocumentByP_L_S", long.class, java.lang.String.class, int.class);
	private MethodKey _countDocumentByP_L_SMethodKey17 = new MethodKey(_classLoaderProxy.getClassName(),
			"countDocumentByP_L_S", long.class, java.lang.String.class,
			int.class);
	private MethodKey _countDocumentByP_L_SMethodKey18 = new MethodKey(_classLoaderProxy.getClassName(),
			"countDocumentByP_L_S", java.lang.String.class, int.class);
	private MethodKey _countDocumentByL_SMethodKey19 = new MethodKey(_classLoaderProxy.getClassName(),
			"countDocumentByL_S", java.lang.String.class, int.class);
	private MethodKey _getDocumentByP_L_SMethodKey20 = new MethodKey(_classLoaderProxy.getClassName(),
			"getDocumentByP_L_S", long.class, java.lang.String.class,
			int.class, com.liferay.portal.kernel.util.OrderByComparator.class);
	private MethodKey _getDocumentByP_L_SMethodKey21 = new MethodKey(_classLoaderProxy.getClassName(),
			"getDocumentByP_L_S", long.class, java.lang.String.class,
			int.class, int.class, int.class);
	private MethodKey _getDocumentByP_L_SMethodKey22 = new MethodKey(_classLoaderProxy.getClassName(),
			"getDocumentByP_L_S", java.lang.String.class, int.class, int.class,
			int.class);
	private MethodKey _getDocumentByP_U_SMethodKey23 = new MethodKey(_classLoaderProxy.getClassName(),
			"getDocumentByP_U_S", long.class, long.class, int.class,
			java.lang.String.class);
	private MethodKey _getDocumentByP_U_SMethodKey24 = new MethodKey(_classLoaderProxy.getClassName(),
			"getDocumentByP_U_S", long.class, long.class, int.class,
			java.lang.String.class,
			com.liferay.portal.kernel.util.OrderByComparator.class);
	private MethodKey _getDocumentByG_O_T_L_SMethodKey25 = new MethodKey(_classLoaderProxy.getClassName(),
			"getDocumentByG_O_T_L_S", long.class, java.lang.String.class,
			java.lang.String.class, java.lang.String.class, int.class);
	private MethodKey _getDocumentBySummaryMethodKey26 = new MethodKey(_classLoaderProxy.getClassName(),
			"getDocumentBySummary", long.class, java.lang.String.class,
			int.class, java.lang.String.class, long.class);
	private MethodKey _getDocumentByStatusMethodKey27 = new MethodKey(_classLoaderProxy.getClassName(),
			"getDocumentByStatus", long.class, java.lang.String.class,
			long.class, int.class);
	private MethodKey _getAllDocumentByStatusMethodKey28 = new MethodKey(_classLoaderProxy.getClassName(),
			"getAllDocumentByStatus", long.class, java.lang.String.class,
			long.class, int.class, int.class, int.class);
	private MethodKey _countDocumentByStatusMethodKey29 = new MethodKey(_classLoaderProxy.getClassName(),
			"countDocumentByStatus", long.class, java.lang.String.class,
			long.class, int.class);
	private MethodKey _getDocByStatusMethodKey30 = new MethodKey(_classLoaderProxy.getClassName(),
			"getDocByStatus", long.class, java.lang.String.class, long.class,
			int.class);
	private MethodKey _getDocumentByG_L_O_SMethodKey31 = new MethodKey(_classLoaderProxy.getClassName(),
			"getDocumentByG_L_O_S", long.class, java.lang.String.class,
			java.lang.String.class, int.class);
	private MethodKey _getDocumentByG_L_O_SMethodKey32 = new MethodKey(_classLoaderProxy.getClassName(),
			"getDocumentByG_L_O_S", long.class, java.lang.String.class,
			java.lang.String.class, int.class, int.class, int.class);
	private MethodKey _countDocumentByG_L_O_SMethodKey33 = new MethodKey(_classLoaderProxy.getClassName(),
			"countDocumentByG_L_O_S", long.class, java.lang.String.class,
			java.lang.String.class, int.class);
	private MethodKey _getDocumentByG_L_T_SMethodKey34 = new MethodKey(_classLoaderProxy.getClassName(),
			"getDocumentByG_L_T_S", long.class, java.lang.String.class,
			java.lang.String.class, int.class);
	private MethodKey _getDocumentByG_L_T_SMethodKey35 = new MethodKey(_classLoaderProxy.getClassName(),
			"getDocumentByG_L_T_S", long.class, java.lang.String.class,
			java.lang.String.class, int.class, int.class, int.class);
	private MethodKey _countDocumentByG_L_T_SMethodKey36 = new MethodKey(_classLoaderProxy.getClassName(),
			"countDocumentByG_L_T_S", long.class, java.lang.String.class,
			java.lang.String.class, int.class);
	private MethodKey _getDocumentByG_L_F_SMethodKey37 = new MethodKey(_classLoaderProxy.getClassName(),
			"getDocumentByG_L_F_S", long.class, java.lang.String.class,
			java.lang.String.class, int.class);
	private MethodKey _countDocumentByG_L_F_SMethodKey38 = new MethodKey(_classLoaderProxy.getClassName(),
			"countDocumentByG_L_F_S", long.class, java.lang.String.class,
			java.lang.String.class, int.class);
	private MethodKey _countDocumentByL_F_SMethodKey39 = new MethodKey(_classLoaderProxy.getClassName(),
			"countDocumentByL_F_S", java.lang.String.class,
			java.lang.String.class, int.class);
	private MethodKey _countByStatusMethodKey40 = new MethodKey(_classLoaderProxy.getClassName(),
			"countByStatus", long.class, java.lang.String.class, int.class);
	private MethodKey _getDocumentByF_O_TMethodKey41 = new MethodKey(_classLoaderProxy.getClassName(),
			"getDocumentByF_O_T", long.class, java.lang.String.class,
			java.lang.String.class, java.lang.String.class,
			java.lang.String.class, int.class, int.class);
	private MethodKey _countDocumentByF_O_TMethodKey42 = new MethodKey(_classLoaderProxy.getClassName(),
			"countDocumentByF_O_T", long.class, java.lang.String.class,
			java.lang.String.class, java.lang.String.class,
			java.lang.String.class);
	private MethodKey _getDocByPromulDateMethodKey43 = new MethodKey(_classLoaderProxy.getClassName(),
			"getDocByPromulDate", long.class, java.lang.String.class,
			java.util.Date.class, java.util.Date.class, int.class, int.class);
	private MethodKey _searchAdvanceDocumentMethodKey44 = new MethodKey(_classLoaderProxy.getClassName(),
			"searchAdvanceDocument", long.class, java.lang.String.class,
			java.lang.String.class, java.util.Date.class, java.util.Date.class,
			java.lang.String.class, java.lang.String.class,
			java.lang.String.class, java.util.Date.class, java.util.Date.class,
			java.lang.String[].class, java.lang.String[].class,
			java.lang.String[].class, java.lang.String.class, int.class);
	private MethodKey _getDocument_BasicMethodKey45 = new MethodKey(_classLoaderProxy.getClassName(),
			"getDocument_Basic", long.class, java.lang.String.class,
			java.lang.String.class, java.lang.String.class,
			java.lang.String.class, java.lang.String.class,
			java.lang.String.class, java.util.Date.class, java.util.Date.class,
			java.lang.String.class, int.class);
	private MethodKey _getDocument_BasicMethodKey46 = new MethodKey(_classLoaderProxy.getClassName(),
			"getDocument_Basic", long.class, java.lang.String.class,
			java.lang.String.class, java.lang.String.class,
			java.lang.String.class, java.lang.String.class,
			java.lang.String.class, java.util.Date.class, java.util.Date.class,
			java.lang.String.class, int.class, int.class, int.class);
	private MethodKey _getDocument_BasicMethodKey47 = new MethodKey(_classLoaderProxy.getClassName(),
			"getDocument_Basic", java.lang.String.class,
			java.lang.String.class, java.lang.String.class,
			java.lang.String.class, java.lang.String.class,
			java.lang.String.class, java.util.Date.class, java.util.Date.class,
			java.lang.String.class, int.class, int.class, int.class);
	private MethodKey _countDocument_BasicMethodKey48 = new MethodKey(_classLoaderProxy.getClassName(),
			"countDocument_Basic", long.class, java.lang.String.class,
			java.lang.String.class, java.lang.String.class,
			java.lang.String.class, java.lang.String.class,
			java.lang.String.class, java.util.Date.class, java.util.Date.class,
			java.lang.String.class, int.class);
	private MethodKey _countDocument_BasicMethodKey49 = new MethodKey(_classLoaderProxy.getClassName(),
			"countDocument_Basic", java.lang.String.class,
			java.lang.String.class, java.lang.String.class,
			java.lang.String.class, java.lang.String.class,
			java.lang.String.class, java.util.Date.class, java.util.Date.class,
			java.lang.String.class, int.class);
	private MethodKey _searchDocumentByParamMethodKey50 = new MethodKey(_classLoaderProxy.getClassName(),
			"searchDocumentByParam", long.class, java.lang.String.class,
			java.lang.String.class, java.lang.String.class,
			java.lang.String.class, java.lang.String.class,
			java.lang.String.class, boolean.class, boolean.class,
			boolean.class, boolean.class, boolean.class, java.util.Date.class,
			java.util.Date.class, boolean.class, java.util.Date.class,
			java.util.Date.class, boolean.class, java.util.Date.class,
			java.util.Date.class, int.class, java.lang.String.class);
	private MethodKey _searchDocumentByParamMethodKey51 = new MethodKey(_classLoaderProxy.getClassName(),
			"searchDocumentByParam", long.class, java.lang.String.class,
			java.lang.String.class, java.lang.String.class,
			java.lang.String.class, java.lang.String.class,
			java.lang.String.class, boolean.class, boolean.class,
			boolean.class, boolean.class, boolean.class, java.util.Date.class,
			java.util.Date.class, boolean.class, java.util.Date.class,
			java.util.Date.class, boolean.class, java.util.Date.class,
			java.util.Date.class, int.class, java.lang.String.class, int.class,
			int.class);
	private MethodKey _countSearchDocumentByParamMethodKey52 = new MethodKey(_classLoaderProxy.getClassName(),
			"countSearchDocumentByParam", long.class, java.lang.String.class,
			java.lang.String.class, java.lang.String.class,
			java.lang.String.class, java.lang.String.class,
			java.lang.String.class, boolean.class, boolean.class,
			boolean.class, boolean.class, boolean.class, java.util.Date.class,
			java.util.Date.class, boolean.class, java.util.Date.class,
			java.util.Date.class, boolean.class, java.util.Date.class,
			java.util.Date.class, int.class, java.lang.String.class);
	private MethodKey _getContDocumentByF_O_TMethodKey53 = new MethodKey(_classLoaderProxy.getClassName(),
			"getContDocumentByF_O_T", long.class, java.lang.String.class,
			java.lang.String.class, java.lang.String.class,
			java.lang.String.class, java.util.Date.class,
			java.lang.String.class, int.class, int.class);
	private MethodKey _getContDocumentByF_O_TMethodKey54 = new MethodKey(_classLoaderProxy.getClassName(),
			"getContDocumentByF_O_T", java.lang.String.class,
			java.lang.String.class, java.lang.String.class,
			java.lang.String.class, java.util.Date.class,
			java.lang.String.class, int.class, int.class);
	private MethodKey _searchDocumentMethodKey55 = new MethodKey(_classLoaderProxy.getClassName(),
			"searchDocument", long.class, java.lang.String.class,
			java.lang.String.class, java.lang.String.class, int.class, int.class);
	private MethodKey _findDocOrtherMethodKey56 = new MethodKey(_classLoaderProxy.getClassName(),
			"findDocOrther", long.class, java.lang.String.class,
			java.lang.String.class, int.class);
	private MethodKey _countDocOrtherMethodKey57 = new MethodKey(_classLoaderProxy.getClassName(),
			"countDocOrther", long.class, java.lang.String.class,
			java.lang.String.class, int.class);
	private MethodKey _getDocByExpiredDateMethodKey58 = new MethodKey(_classLoaderProxy.getClassName(),
			"getDocByExpiredDate", long.class, java.lang.String.class,
			java.lang.String.class, java.lang.String.class,
			java.lang.String.class, java.lang.String.class, int.class);
	private MethodKey _countDocByExpiredDateMethodKey59 = new MethodKey(_classLoaderProxy.getClassName(),
			"countDocByExpiredDate", long.class, java.lang.String.class,
			java.lang.String.class, java.lang.String.class,
			java.lang.String.class, java.lang.String.class, int.class);
	private MethodKey _getDocByG_L_FMethodKey60 = new MethodKey(_classLoaderProxy.getClassName(),
			"getDocByG_L_F", long.class, java.lang.String.class,
			java.lang.String.class);
	private MethodKey _getDocByG_L_TMethodKey61 = new MethodKey(_classLoaderProxy.getClassName(),
			"getDocByG_L_T", long.class, java.lang.String.class,
			java.lang.String.class);
	private MethodKey _getDocByG_L_OMethodKey62 = new MethodKey(_classLoaderProxy.getClassName(),
			"getDocByG_L_O", long.class, java.lang.String.class,
			java.lang.String.class);
	private MethodKey _reIndexMethodKey63 = new MethodKey(_classLoaderProxy.getClassName(),
			"reIndex", java.lang.String[].class);
	private MethodKey __validateMethodKey64 = new MethodKey(_classLoaderProxy.getClassName(),
			"_validate", java.lang.String.class, java.lang.String.class,
			java.lang.String.class, java.lang.String.class,
			java.lang.String.class, java.lang.String.class,
			java.lang.String.class);
	private MethodKey _searchMethodKey65 = new MethodKey(_classLoaderProxy.getClassName(),
			"search", long.class, long.class, long.class,
			java.lang.String.class, int.class, int.class);
}