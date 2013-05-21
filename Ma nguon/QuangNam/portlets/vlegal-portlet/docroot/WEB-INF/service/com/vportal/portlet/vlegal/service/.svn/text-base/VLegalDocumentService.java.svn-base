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
 * The interface for the v legal document remote service.
 *
 * <p>
 * Never modify or reference this interface directly. Always use {@link VLegalDocumentServiceUtil} to access the v legal document remote service. Add custom service methods to {@link com.vportal.portlet.vlegal.service.impl.VLegalDocumentServiceImpl} and rerun ServiceBuilder to automatically copy the method declarations to this interface.
 * </p>
 *
 * <p>
 * This is a remote service. Methods of this service are expected to have security checks based on the propagated JAAS credentials because this service can be accessed remotely.
 * </p>
 *
 * @author ACB
 * @see VLegalDocumentServiceUtil
 * @see com.vportal.portlet.vlegal.service.base.VLegalDocumentServiceBaseImpl
 * @see com.vportal.portlet.vlegal.service.impl.VLegalDocumentServiceImpl
 * @generated
 */
@Transactional(isolation = Isolation.PORTAL, rollbackFor =  {
	PortalException.class, SystemException.class})
public interface VLegalDocumentService {
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
			java.rmi.RemoteException;

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
			java.rmi.RemoteException;

	public void addEntryResources(long entryId,
		boolean addCommunityPermissions, boolean addGuestPermissions)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException;

	public void addEntryResources(
		com.vportal.portlet.vlegal.model.VLegalDocument entry,
		boolean addCommunityPermissions, boolean addGuestPermissions)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException;

	public void addEntryResources(long entryId,
		java.lang.String[] communityPermissions,
		java.lang.String[] guestPermissions)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException;

	public void addEntryResources(
		com.vportal.portlet.vlegal.model.VLegalDocument entry,
		java.lang.String[] communityPermissions,
		java.lang.String[] guestPermissions)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException;

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
			java.io.IOException, java.rmi.RemoteException;

	public void updateDocument(java.lang.String docId, java.lang.String docCode)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.rmi.RemoteException;

	public com.vportal.portlet.vlegal.model.VLegalDocument updateDocument(
		com.vportal.portlet.vlegal.model.VLegalDocument vDoc)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.io.IOException, java.rmi.RemoteException;

	public void deleteDocument(java.lang.String docId, long companyId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.io.IOException, java.rmi.RemoteException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public com.vportal.portlet.vlegal.model.VLegalDocument getDocument(
		java.lang.String docId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public com.vportal.portlet.vlegal.model.VLegalDocument getDocument(
		long groupId, java.lang.String docId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public java.util.List getAllDocument()
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public java.util.List getDocumentByLS(java.lang.String language, int status)
		throws com.liferay.portal.kernel.exception.SystemException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public com.vportal.portlet.vlegal.model.VLegalDocument getDocumentByNS(
		long groupId, java.lang.String num, java.lang.String symbol)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public java.util.List getDocumentByG_L(long groupId,
		java.lang.String language)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public java.util.List getDocumentByP_L_S(long groupId,
		java.lang.String language, int status)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException;

	public int countDocumentByP_L_S(long groupId, java.lang.String language,
		int status)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException;

	public int countDocumentByP_L_S(java.lang.String language, int status)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException;

	public java.util.List countDocumentByL_S(java.lang.String language,
		int status)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public java.util.List getDocumentByP_L_S(long groupId,
		java.lang.String language, int status,
		com.liferay.portal.kernel.util.OrderByComparator obc)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public java.util.List getDocumentByP_L_S(long groupId,
		java.lang.String language, int status, int begin, int end)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public java.util.List getDocumentByP_L_S(java.lang.String language,
		int status, int begin, int end)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public java.util.List getDocumentByP_U_S(long groupId, long createdByUser,
		int status, java.lang.String language)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public java.util.List getDocumentByP_U_S(long groupId, long createdByUser,
		int status, java.lang.String language,
		com.liferay.portal.kernel.util.OrderByComparator obc)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public java.util.List getDocumentByG_O_T_L_S(long groupId,
		java.lang.String orgId, java.lang.String typeDocId,
		java.lang.String language, int status)
		throws com.liferay.portal.kernel.exception.SystemException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public java.util.List getDocumentBySummary(long groupId,
		java.lang.String language, int status, java.lang.String summary,
		long departId)
		throws com.liferay.portal.kernel.exception.SystemException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public java.util.List getDocumentByStatus(long groupId,
		java.lang.String language, long userId, int status)
		throws com.liferay.portal.kernel.exception.SystemException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public java.util.List getAllDocumentByStatus(long groupId,
		java.lang.String language, long userId, int status, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	public int countDocumentByStatus(long groupId, java.lang.String language,
		long userId, int status)
		throws com.liferay.portal.kernel.exception.SystemException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public java.util.List getDocByStatus(long groupId,
		java.lang.String language, long userId, int statusDoc)
		throws com.liferay.portal.kernel.exception.SystemException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public java.util.List getDocumentByG_L_O_S(long groupId,
		java.lang.String language, java.lang.String orgId, int status)
		throws com.liferay.portal.kernel.exception.SystemException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public java.util.List getDocumentByG_L_O_S(long groupId,
		java.lang.String language, java.lang.String orgId, int status,
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	public int countDocumentByG_L_O_S(long groupId, java.lang.String language,
		java.lang.String orgId, int status)
		throws com.liferay.portal.kernel.exception.SystemException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public java.util.List getDocumentByG_L_T_S(long groupId,
		java.lang.String language, java.lang.String typeDocId, int status)
		throws com.liferay.portal.kernel.exception.SystemException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public java.util.List getDocumentByG_L_T_S(long groupId,
		java.lang.String language, java.lang.String typeDocId, int status,
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	public int countDocumentByG_L_T_S(long groupId, java.lang.String language,
		java.lang.String typeDocId, int status)
		throws com.liferay.portal.kernel.exception.SystemException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public java.util.List getDocumentByG_L_F_S(long groupId,
		java.lang.String language, java.lang.String fieldId, int status)
		throws com.liferay.portal.kernel.exception.SystemException;

	public int countDocumentByG_L_F_S(long groupId, java.lang.String language,
		java.lang.String fieldId, int status)
		throws com.liferay.portal.kernel.exception.SystemException;

	public int countDocumentByL_F_S(java.lang.String language,
		java.lang.String fieldId, int status)
		throws com.liferay.portal.kernel.exception.SystemException,
			java.rmi.RemoteException;

	public int countByStatus(long groupId, java.lang.String language, int status)
		throws com.liferay.portal.kernel.exception.SystemException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public java.util.List getDocumentByF_O_T(long groupId,
		java.lang.String typeDocId, java.lang.String orgId,
		java.lang.String fieldId, java.lang.String language, int begin, int end)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException;

	public int countDocumentByF_O_T(long groupId, java.lang.String typeDocId,
		java.lang.String orgId, java.lang.String fieldId,
		java.lang.String language)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public java.util.List getDocByPromulDate(long groupId,
		java.lang.String language, java.util.Date proDateFrom,
		java.util.Date proDateTo, int status, int quantity)
		throws com.liferay.portal.kernel.exception.SystemException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public java.util.List searchAdvanceDocument(long groupId,
		java.lang.String language, java.lang.String fieldId,
		java.util.Date proDateFrom, java.util.Date proDateTo,
		java.lang.String summary, java.lang.String num,
		java.lang.String symbol, java.util.Date expDateFrom,
		java.util.Date expDateTo, java.lang.String[] typeIds,
		java.lang.String[] orgIds, java.lang.String[] sigIds,
		java.lang.String content, int status)
		throws com.liferay.portal.kernel.exception.SystemException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public java.util.List getDocument_Basic(long groupId,
		java.lang.String language, java.lang.String number,
		java.lang.String symbol, java.lang.String fieldId,
		java.lang.String orgId, java.lang.String typeId,
		java.util.Date proDateFrom, java.util.Date proDateTo,
		java.lang.String summary, int status)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public java.util.List getDocument_Basic(long groupId,
		java.lang.String language, java.lang.String number,
		java.lang.String symbol, java.lang.String fieldId,
		java.lang.String orgId, java.lang.String typeId,
		java.util.Date proDateFrom, java.util.Date proDateTo,
		java.lang.String summary, int status, int start, int end)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public java.util.List getDocument_Basic(java.lang.String language,
		java.lang.String number, java.lang.String symbol,
		java.lang.String fieldId, java.lang.String orgId,
		java.lang.String typeId, java.util.Date proDateFrom,
		java.util.Date proDateTo, java.lang.String summary, int status,
		int start, int end)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException;

	public int countDocument_Basic(long groupId, java.lang.String language,
		java.lang.String number, java.lang.String symbol,
		java.lang.String fieldId, java.lang.String orgId,
		java.lang.String typeId, java.util.Date proDateFrom,
		java.util.Date proDateTo, java.lang.String summary, int status)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException;

	public int countDocument_Basic(java.lang.String language,
		java.lang.String number, java.lang.String symbol,
		java.lang.String fieldId, java.lang.String orgId,
		java.lang.String typeId, java.util.Date proDateFrom,
		java.util.Date proDateTo, java.lang.String summary, int status)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
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
		throws com.liferay.portal.kernel.exception.SystemException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
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
		throws com.liferay.portal.kernel.exception.SystemException;

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
		throws com.liferay.portal.kernel.exception.SystemException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public java.util.List getContDocumentByF_O_T(long groupId,
		java.lang.String typeDocId, java.lang.String orgId,
		java.lang.String fieldId, java.lang.String language,
		java.util.Date fromDate, java.lang.String begDocId, int begin, int end)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public java.util.List getContDocumentByF_O_T(java.lang.String language,
		java.lang.String typeDocId, java.lang.String orgId,
		java.lang.String fieldId, java.util.Date fromDate,
		java.lang.String begDocId, int begin, int end)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public java.util.List searchDocument(long groupId,
		java.lang.String language, java.lang.String num,
		java.lang.String symbol, int begin, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	public java.util.List findDocOrther(long groupId,
		java.lang.String language, java.lang.String documentId, int status)
		throws java.lang.Exception;

	public int countDocOrther(long groupId, java.lang.String language,
		java.lang.String documentId, int status) throws java.lang.Exception;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public java.util.List getDocByExpiredDate(long groupId,
		java.lang.String language, java.lang.String documentId,
		java.lang.String summary, java.lang.String num,
		java.lang.String symbol, int status) throws java.lang.Exception;

	public int countDocByExpiredDate(long groupId, java.lang.String language,
		java.lang.String documentId, java.lang.String summary,
		java.lang.String num, java.lang.String symbol, int status)
		throws java.lang.Exception;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public java.util.List getDocByG_L_F(long groupId,
		java.lang.String language, java.lang.String fieldId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.rmi.RemoteException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public java.util.List getDocByG_L_T(long groupId,
		java.lang.String language, java.lang.String typeId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.rmi.RemoteException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public java.util.List getDocByG_L_O(long groupId,
		java.lang.String language, java.lang.String orgId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.rmi.RemoteException;

	public void reIndex(java.lang.String[] ids)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.rmi.RemoteException;

	public void _validate(java.lang.String symbol, java.lang.String num,
		java.lang.String summary, java.lang.String fieldId,
		java.lang.String orgId, java.lang.String typeId,
		java.lang.String signers)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.rmi.RemoteException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public com.liferay.portal.kernel.search.Hits search(long companyId,
		long groupId, long userId, java.lang.String keywords, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;
}