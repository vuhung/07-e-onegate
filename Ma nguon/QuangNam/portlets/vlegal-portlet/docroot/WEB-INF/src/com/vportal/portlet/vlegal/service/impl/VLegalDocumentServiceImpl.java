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

package com.vportal.portlet.vlegal.service.impl;

import java.io.IOException;
import java.rmi.RemoteException;
import java.util.Date;
import java.util.List;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.search.BooleanClauseOccur;
import com.liferay.portal.kernel.search.BooleanQuery;
import com.liferay.portal.kernel.search.BooleanQueryFactoryUtil;
import com.liferay.portal.kernel.search.Field;
import com.liferay.portal.kernel.search.Hits;
import com.liferay.portal.kernel.search.SearchEngineUtil;
import com.liferay.portal.kernel.util.CalendarUtil;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.User;
import com.liferay.portal.security.permission.ActionKeys;
import com.liferay.portal.service.permission.PortletPermissionUtil;
import com.liferay.portal.theme.ThemeDisplay;
import com.vportal.portal.util.PortletKeysExt;
import com.vportal.portlet.vlegal.InvalidDocFieldException;
import com.vportal.portlet.vlegal.InvalidDocOrgException;
import com.vportal.portlet.vlegal.InvalidDocSummaryExceptionException;
import com.vportal.portlet.vlegal.InvalidDocSymbolExceptionException;
import com.vportal.portlet.vlegal.InvalidDocTypeException;
import com.vportal.portlet.vlegal.NoSuchVLegalDocumentException;
import com.vportal.portlet.vlegal.model.VLegalDocument;
import com.vportal.portlet.vlegal.service.VLegalDocumentServiceUtil;
import com.vportal.portlet.vlegal.service.VLegalLoggerServiceUtil;
import com.vportal.portlet.vlegal.service.VLegalTDRelServiceUtil;
import com.vportal.portlet.vlegal.service.base.VLegalDocumentServiceBaseImpl;
import com.vportal.portlet.vlegal.service.permission.VLegalDocumentPermission;
import com.vportal.portlet.vlegal.service.persistence.VLegalDocumentUtil;
import com.vportal.portlet.vlegal.util.SearchIndexer;
import com.vportal.portlet.vlegal.util.permission.ActionKeysExt;

/**
 * The implementation of the v legal document remote service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link com.vportal.portlet.vlegal.service.VLegalDocumentService} interface.
 * </p>
 *
 * <p>
 * Never reference this interface directly. Always use {@link com.vportal.portlet.vlegal.service.VLegalDocumentServiceUtil} to access the v legal document remote service.
 * </p>
 *
 * <p>
 * This is a remote service. Methods of this service are expected to have security checks based on the propagated JAAS credentials because this service can be accessed remotely.
 * </p>
 *
 * @author ACB
 * @see com.vportal.portlet.vlegal.service.base.VLegalDocumentServiceBaseImpl
 * @see com.vportal.portlet.vlegal.service.VLegalDocumentServiceUtil
 */
public class VLegalDocumentServiceImpl extends VLegalDocumentServiceBaseImpl {
	
	public static final int APPROVAL_PENDING = 0;

	public static final int PUBLISH_PENDING = 1;

	public static final int PUBLISHED = 2;

	public static final int FORWARDED = 3;

	public VLegalDocument addDocument(long groupId, String symbol, String num,
			String replaceDoc, String summary, String content, String language,
			Date promulDate, Date effectivedDate, Date expiredDate,
			String typeId, String fieldId, String orgId, String orgRels,
			String signerRels, String fieldRels, String numRels,
			String docCode, String departmentRels, boolean hasAttachment,
			String[] communityPermissions, String[] guestPermissions,
			ThemeDisplay themeDisplay) throws PortalException, SystemException,
			RemoteException {

		PortletPermissionUtil.check(getPermissionChecker(), themeDisplay
				.getLayout().getPlid(), PortletKeysExt.VLEGAL,
				ActionKeysExt.ADD_DOCUMENT);

		return addDocument(groupId, symbol, num, replaceDoc, summary, content,
				language, promulDate, effectivedDate, expiredDate, typeId,
				fieldId, orgId, orgRels, signerRels, fieldRels, numRels,
				docCode, departmentRels, hasAttachment, null, null,
				communityPermissions, guestPermissions, themeDisplay);

	}

	public VLegalDocument addDocument(long groupId, String symbol, String num,
			String replaceDoc, String summary, String content, String language,
			Date promulDate, Date effectivedDate, Date expiredDate,
			String typeId, String fieldId, String orgId, String orgRels,
			String signerRels, String fieldRels, String numRels,
			String docCode, String departmentRels, boolean hasAttachment,
			Boolean addCommunityPermissions, Boolean addGuestPermissions,
			String[] communityPermissions, String[] guestPermissions,
			ThemeDisplay themeDisplay) throws PortalException, SystemException,
			RemoteException {

		_validate(symbol, num, summary, fieldId, orgId, typeId, signerRels);

		String docId = String.valueOf(counterLocalService.increment());
		Date now = new Date();

		long userId = getUserId();
		User user = userPersistence.findByPrimaryKey(userId);
		VLegalDocument vDoc = vLegalDocumentPersistence.create(docId);

		int userHit = 0;

		vDoc.setGroupId(groupId);
		vDoc.setCompanyId(user.getCompanyId());
		vDoc.setSymbol(symbol);
		vDoc.setNum(num);

		vDoc.setPromulDate(promulDate);
		vDoc.setEffectivedDate(effectivedDate);
		vDoc.setExpiredDate(expiredDate);

		vDoc.setReplaceDoc(replaceDoc);
		vDoc.setSummary(summary);
		vDoc.setContent(content);
		vDoc.setLanguage(language);
		vDoc.setUserHit(userHit);
		vDoc.setStatusDoc(APPROVAL_PENDING);

		vDoc.setFieldId(fieldId);
		vDoc.setTypeDocId(typeId);
		vDoc.setOrgRels(orgRels);
		vDoc.setSignerRels(signerRels);
		vDoc.setFieldRels(fieldRels);
		vDoc.setNumRels(numRels);
		vDoc.setOrgId(orgId);

		vDoc.setDocCode(docCode);
		vDoc.setDepartmentRels(departmentRels);
		vDoc.setHasAttachment(hasAttachment);

		vDoc.setCreatedDate(now);
		vDoc.setCreatedByUser(userId);
		vDoc.setModifiedDate(now);
		vDoc.setModifiedByUser(userId);
		vDoc.setUserId(userId);

		vDoc.setApprovedDate(null);
		vDoc.setApprovedByUser(0);
		vDoc.setPublishedDate(null);
		vDoc.setPublishedByUser(0);

		vLegalDocumentPersistence.update(vDoc,false);

		// Logging...
		VLegalLoggerServiceUtil.log(groupId, CalendarUtil.getTimestamp(now)
				+ " -- CREATE: [vlegal] -> document [" + num + "/" + symbol
				+ "] by " + user.getScreenName());

		// Resources

		if ((addCommunityPermissions != null) && (addGuestPermissions != null)) {

			addEntryResources(vDoc, addCommunityPermissions.booleanValue(),
					addGuestPermissions.booleanValue());
		} else {
			addEntryResources(vDoc, communityPermissions, guestPermissions);
		}

		return vDoc;
	}

	public void addEntryResources(long entryId,
			boolean addCommunityPermissions, boolean addGuestPermissions)
			throws PortalException, SystemException {

		VLegalDocument entry = vLegalDocumentPersistence
				.findByPrimaryKey(String.valueOf(entryId));

		addEntryResources(entry, addCommunityPermissions, addGuestPermissions);
	}

	public void addEntryResources(VLegalDocument entry,
			boolean addCommunityPermissions, boolean addGuestPermissions)
			throws PortalException, SystemException {

		resourceLocalService.addResources(entry.getCompanyId(), entry
				.getGroupId(), entry.getUserId(), VLegalDocument.class
				.getName(), entry.getDocId(), false, addCommunityPermissions,
				addGuestPermissions);
	}

	public void addEntryResources(long entryId, String[] communityPermissions,
			String[] guestPermissions) throws PortalException, SystemException {

		VLegalDocument entry = vLegalDocumentPersistence
				.findByPrimaryKey(String.valueOf(entryId));

		addEntryResources(entry, communityPermissions, guestPermissions);
	}

	public void addEntryResources(VLegalDocument entry,
			String[] communityPermissions, String[] guestPermissions)
			throws PortalException, SystemException {

		resourceLocalService.addModelResources(entry.getCompanyId(), entry
				.getGroupId(), entry.getUserId(), VLegalDocument.class
				.getName(), entry.getDocId(), communityPermissions,
				guestPermissions);
	}

	public VLegalDocument updateDocument(String docId, long groupId,
			String symbol, String num, String replaceDoc, String summary,
			String content, String language, int status, Date promulDate,
			Date effectivedDate, Date expiredDate, String typeId,
			String fieldId, String orgId, String orgRels, String signerRels,
			String fieldRels, String numRels, String departmentRels,
			boolean hasAttachment) throws PortalException, SystemException,
			RemoteException, IOException {

		VLegalDocumentPermission.check(getPermissionChecker(), docId,
				ActionKeysExt.UPDATE);

		_validate(symbol, num, summary, fieldId, orgId, typeId, signerRels);

		VLegalDocument vDoc = vLegalDocumentPersistence.findByPrimaryKey(docId);

		Date now = new Date();
		long userId = getUserId();
		User user = userPersistence.findByPrimaryKey(userId);

		vDoc.setGroupId(groupId);
		vDoc.setSymbol(symbol);
		vDoc.setNum(num);

		vDoc.setPromulDate(promulDate);
		vDoc.setEffectivedDate(effectivedDate);
		vDoc.setExpiredDate(expiredDate);

		vDoc.setReplaceDoc(replaceDoc);
		vDoc.setSummary(summary);
		vDoc.setContent(content);
		vDoc.setLanguage(language);

		vDoc.setFieldId(fieldId);
		vDoc.setTypeDocId(typeId);
		vDoc.setOrgRels(orgRels);
		vDoc.setSignerRels(signerRels);
		vDoc.setFieldRels(fieldRels);
		vDoc.setNumRels(numRels);
		vDoc.setDepartmentRels(departmentRels);
		vDoc.setOrgId(orgId);

		vDoc.setDocCode(null);
		vDoc.setHasAttachment(hasAttachment);
		vDoc.setModifiedDate(now);
		vDoc.setModifiedByUser(userId);

		if (vDoc.getStatusDoc() != status) {

			if (status == PUBLISH_PENDING) {

				VLegalDocumentPermission.check(getPermissionChecker(), docId,
						ActionKeysExt.APPROVE_DOCUMENT);

				vDoc.setApprovedDate(now);
				vDoc.setApprovedByUser(userId);

				vDoc.setPublishedDate(null);
				vDoc.setPublishedByUser(0);

				VLegalLoggerServiceUtil.log(groupId, CalendarUtil
						.getTimestamp(now)
						+ " -- APPROVE: [vlegal] -> document ["
						+ num
						+ "/"
						+ symbol + "] by " + user.getScreenName());

			} else if (status == PUBLISHED) {

				VLegalDocumentPermission.check(getPermissionChecker(), docId,
						ActionKeysExt.PUBLISH_DOCUMENT);

				vDoc.setPublishedDate(now);
				vDoc.setPublishedByUser(userId);

				VLegalLoggerServiceUtil.log(groupId, CalendarUtil
						.getTimestamp(now)
						+ " -- PUBLISH: [vlegal] -> document ["
						+ num
						+ "/"
						+ symbol + "] by " + user.getScreenName());

				// UPDATE LUCENE CONTENT
//				SearchIndexer.updateDocument(vDoc.getDocId(), vDoc
//						.getCompanyId());

			} else if (status == FORWARDED) {

				VLegalDocumentPermission.check(getPermissionChecker(), docId,
						ActionKeysExt.FORWARD_DOCUMENT);

				vDoc.setForwardedDate(now);
				vDoc.setForwardedByUser(userId);

				VLegalLoggerServiceUtil.log(groupId, CalendarUtil
						.getTimestamp(now)
						+ " -- FORWARD: [vlegal] -> document ["
						+ num
						+ "/"
						+ symbol + "] by " + user.getScreenName());

				// UPDATE LUCENE CONTENT
//				SearchIndexer.updateDocument(vDoc.getDocId(), vDoc
//						.getCompanyId());

			} else if (status == APPROVAL_PENDING) {

				vDoc.setApprovedDate(null);
				vDoc.setApprovedByUser(0);

				vDoc.setPublishedDate(null);
				vDoc.setPublishedByUser(0);

				if (vDoc.getStatusDoc() != status) {

					VLegalLoggerServiceUtil
							.log(
									groupId,
									CalendarUtil.getTimestamp(now)
											+ " -- "
											+ ((vDoc.getStatusDoc() == PUBLISHED) ? "CANCEL PUBLISHED"
													: "CANCEL APPROVED")
											+ ": [vlegal] -> document [" + num
											+ "/" + symbol + "] by "
											+ user.getScreenName());

				}
			}

			// Update status to the document
			vDoc.setStatusDoc(status);
		} else {

			VLegalLoggerServiceUtil.log(groupId, CalendarUtil.getTimestamp(now)
					+ " - UPDATE: [vlegal] -> document [" + num + "/" + symbol
					+ "] by " + user.getScreenName());

		}

		vLegalDocumentPersistence.update(vDoc,false);

		return vDoc;
	}

	public void updateDocument(String docId, String docCode)
			throws PortalException, SystemException, RemoteException {
		VLegalDocument vDoc = VLegalDocumentUtil.findByPrimaryKey(docId);

		vDoc.setDocCode(docCode);
		VLegalDocumentUtil.update(vDoc,false);

	}

	public VLegalDocument updateDocument(VLegalDocument vDoc)
			throws PortalException, SystemException, RemoteException,
			IOException {
		return updateDocument(vDoc.getDocId(), vDoc.getGroupId(), vDoc
				.getSymbol(), vDoc.getNum(), vDoc.getReplaceDoc(), vDoc
				.getSummary(), vDoc.getContent(), vDoc.getLanguage(), vDoc
				.getStatusDoc(), vDoc.getPromulDate(),
				vDoc.getEffectivedDate(), vDoc.getExpiredDate(), vDoc
						.getTypeDocId(), vDoc.getFieldId(), vDoc.getOrgId(),
				vDoc.getOrgRels(), vDoc.getSignerRels(), vDoc.getFieldRels(),
				vDoc.getNumRels(), vDoc.getDepartmentRels(), vDoc
						.getHasAttachment());
	}

	public void deleteDocument(String docId, long companyId)

	throws PortalException, SystemException, RemoteException, IOException {

		VLegalDocument vDoct = vLegalDocumentPersistence
				.findByPrimaryKey(docId);

		VLegalDocumentPermission.check(getPermissionChecker(), vDoct,
				ActionKeys.DELETE);

		if (Validator.isNull(docId)) {
			throw new NoSuchVLegalDocumentException();
		}

		long userId = getUserId();

		User user = userPersistence.findByPrimaryKey(userId);

		VLegalDocument vDoc = getDocument(docId);

		VLegalDocumentUtil.remove(docId);

		// Delete all Tag relation with this legal document
		VLegalTDRelServiceUtil.deleteRelByDoc(docId);

		VLegalLoggerServiceUtil.log(0, CalendarUtil.getTimestamp(new Date())
				+ " - DELETE: [vlegal] -> document [" + vDoc.getNum() + "/"
				+ vDoc.getSymbol() + "] by " + user.getScreenName());

		// Delete Lucene content
		SearchIndexer.deleteDocument(docId, vDoc.getCompanyId());
	}

/*	public void deleteDocuments(String[] docIds, long companyId)
			throws SystemException, PortalException, RemoteException,
			IOException {

		if (Validator.isNull(docIds) || docIds.length <= 0) {
			return;
		}

		for (int i = 0; i < docIds.length; i++) {
			this.deleteDocument(docIds[i], companyId);
		}

	}*/

	public VLegalDocument getDocument(String docId) throws SystemException,
			PortalException {
		if (Validator.isNull(docId)) {
			throw new NoSuchVLegalDocumentException();
		}
		return VLegalDocumentUtil.findByPrimaryKey(docId);
	}

	public VLegalDocument getDocument(long groupId, String docId)
			throws SystemException, PortalException {
		if (Validator.isNull(docId)) {
			throw new NoSuchVLegalDocumentException();
		}
		return VLegalDocumentUtil.findByG_D(groupId, docId);
	}

	public List getAllDocument() throws SystemException, PortalException {
		return VLegalDocumentUtil.findAll();
	}
	
	public List getDocumentByLS(String language, int status) throws SystemException
	{
		return vLegalDocumentPersistence.findByL_S(language, PUBLISHED);
	}

	public VLegalDocument getDocumentByNS(long groupId, String num,
			String symbol) throws SystemException, PortalException {
		return VLegalDocumentUtil.findByP_N_S(groupId, num, symbol);
	}

	public List getDocumentByG_L(long groupId, String language)
			throws SystemException, PortalException {
		return VLegalDocumentUtil.findByG_L(groupId, language);
	}

	public List getDocumentByP_L_S(long groupId, String language, int status)
			throws SystemException, PortalException {
		return VLegalDocumentUtil.findByP_L_S(groupId, language, status);
	}

	public int countDocumentByP_L_S(long groupId, String language, int status)
			throws SystemException, PortalException {
		return VLegalDocumentUtil.countByP_L_S(groupId, language, status);
	}
	
	public int countDocumentByP_L_S(String language, int status)
			throws SystemException, PortalException {
		return VLegalDocumentUtil.countByL_S(language, status);
	}
	
	public List countDocumentByL_S(String language, int status)
			throws SystemException, PortalException {
		return VLegalDocumentUtil.findByL_S(language, status);
	}

	public List getDocumentByP_L_S(long groupId, String language, int status,
			OrderByComparator obc) throws SystemException, PortalException {

		int count = VLegalDocumentUtil.countByP_L_S(groupId, language, status);
		return VLegalDocumentUtil.findByP_L_S(groupId, language, status, 0,
				count, obc);
	}

	public List getDocumentByP_L_S(long groupId, String language, int status,
			int begin, int end) throws SystemException, PortalException {
		return VLegalDocumentUtil.findByP_L_S(groupId, language, status, begin,
				end);
	}
	
	public List getDocumentByP_L_S(String language, int status,
			int begin, int end) throws SystemException, PortalException {
		return VLegalDocumentUtil.findByL_S(language, status, begin, end);
	}

	public List getDocumentByP_U_S(long groupId, long createdByUser,
			int status, String language) throws SystemException,
			PortalException {
		int count = VLegalDocumentUtil.countByP_U_S(groupId, createdByUser,
				language, status);
		return VLegalDocumentUtil.findByP_U_S(groupId, createdByUser, language,
				status);
	}

	/*public List getDocumentByF_O_T(long groupId, String typeDocId,
			String orgId, String fieldId, String language, String summary,
			Date proDateFrom, Date proDateTo, int status, int begin, int end)
			throws SystemException, PortalException {
		return vLegalDocumentFinder.findByDocsByF_O_T_L_S(groupId, typeDocId,
				orgId, fieldId, language, summary, proDateFrom, proDateTo,
				null, status, begin, end);
	}*/

	public List getDocumentByP_U_S(long groupId, long createdByUser,
			int status, String language, OrderByComparator obc)
			throws SystemException, PortalException {
		int count = VLegalDocumentUtil.countByP_U_S(groupId, createdByUser,
				language, status);
		return VLegalDocumentUtil.findByP_U_S(groupId, createdByUser, language,
				status, 0, count, obc);
	}

	@SuppressWarnings("rawtypes")
	public List getDocumentByG_O_T_L_S(long groupId, String orgId,
			String typeDocId, String language, int status)
			throws SystemException {
		return VLegalDocumentUtil.findByDocsByG_O_T_L_S(groupId, orgId,
				typeDocId, language, status);

	}

	@SuppressWarnings("rawtypes")
	public List getDocumentBySummary(long groupId, String language, int status,
			String summary, long departId) throws SystemException {
		List listSearch = null;

		listSearch = (List) vLegalDocumentFinder.findBySummary(groupId,
				language, status, summary, departId);

		return listSearch;
	}

	@SuppressWarnings("rawtypes")
	public List getDocumentByStatus(long groupId, String language, long userId,
			int status) throws SystemException {
		return vLegalDocumentPersistence.findByG_L_U_S(groupId, language,
				userId, status);
	}

	@SuppressWarnings("rawtypes")
	public List getAllDocumentByStatus(long groupId, String language,
			long userId, int status, int start, int end) throws SystemException {
		return vLegalDocumentPersistence.findByG_L_U_S(groupId, language,
				userId, status, start, end);
	}

	public int countDocumentByStatus(long groupId, String language,
			long userId, int status) throws SystemException {
		return vLegalDocumentPersistence.countByG_L_U_S(groupId, language,
				userId, status);
	}

	public List getDocByStatus(long groupId, String language, long userId,
			int statusDoc) throws SystemException {
		return vLegalDocumentPersistence.findByG_L_U_S(groupId, language,
				userId, statusDoc);
	}

	// List Document by OrgId
	public List getDocumentByG_L_O_S(long groupId, String language,
			String orgId, int status) throws SystemException {
		return vLegalDocumentPersistence.findByG_L_O_S(groupId, language,
				orgId, status);
	}

	public List getDocumentByG_L_O_S(long groupId, String language,
			String orgId, int status, int start, int end)
			throws SystemException {
		return vLegalDocumentPersistence.findByG_L_O_S(groupId, language,
				orgId, status, start, end);
	}

	public int countDocumentByG_L_O_S(long groupId, String language,
			String orgId, int status) throws SystemException {
		return vLegalDocumentPersistence.countByG_L_O_S(groupId, language,
				orgId, status);
	}

	// List Document by TypeDocId
	public List getDocumentByG_L_T_S(long groupId, String language,
			String typeDocId, int status) throws SystemException {

		return vLegalDocumentPersistence.findByG_L_T_S(groupId, language,
				typeDocId, status);

	}

	public List getDocumentByG_L_T_S(long groupId, String language,
			String typeDocId, int status, int start, int end)
			throws SystemException {

		return vLegalDocumentPersistence.findByG_L_T_S(groupId, language,
				typeDocId, status, start, end);

	}

	public int countDocumentByG_L_T_S(long groupId, String language,
			String typeDocId, int status) throws SystemException {
		return vLegalDocumentPersistence.countByG_L_T_S(groupId, language,
				typeDocId, status);
	}

	// List Document by FieldId
	public List getDocumentByG_L_F_S(long groupId, String language,
			String fieldId, int status) throws SystemException {
		return vLegalDocumentPersistence.findByG_L_F_S(groupId, language,
				fieldId, status);
	}

	public int countDocumentByG_L_F_S(long groupId, String language,
			String fieldId, int status) throws SystemException {
		return vLegalDocumentPersistence.countByG_L_F_S(groupId, language,
				fieldId, status);
	}
	
	public int countDocumentByL_F_S(String language, String fieldId, int status) throws SystemException, RemoteException
	{
		return vLegalDocumentPersistence.countByL_F_S(language, fieldId, status);
	}

	public int countByStatus(long groupId, String language, int status)
			throws SystemException {
		return vLegalDocumentPersistence
				.countByP_L_S(groupId, language, status);
	}

	// List Document by TypeId, OrgId, FieldId
	public List getDocumentByF_O_T(long groupId, String typeDocId,
			String orgId, String fieldId, String language, int begin, int end)
			throws SystemException, PortalException {
		return vLegalDocumentPersistence.findByDocsByF_O_T_L_S(groupId,
				typeDocId, orgId, fieldId, language,
				VLegalDocumentServiceImpl.PUBLISH_PENDING, begin, end);
	}

	public int countDocumentByF_O_T(long groupId, String typeDocId,
			String orgId, String fieldId, String language)
			throws SystemException, PortalException {
		return vLegalDocumentPersistence.countByDocsByF_O_T_L_S(groupId,
				typeDocId, orgId, fieldId, language,
				VLegalDocumentServiceImpl.PUBLISH_PENDING);
	}

	public List getDocByPromulDate(long groupId, String language,
			Date proDateFrom, Date proDateTo, int status, int quantity)
			throws SystemException {

		List listDocument = null;

		listDocument = (List) vLegalDocumentFinder.findDocsByPromulDate(
				groupId, language, proDateFrom, proDateTo, status, quantity);

		return listDocument;
	}

	// Search Advanced
	public List searchAdvanceDocument(long groupId, String language,
			String fieldId, Date proDateFrom, Date proDateTo, String summary,
			String num, String symbol, Date expDateFrom, Date expDateTo,
			String[] typeIds, String[] orgIds, String[] sigIds, String content,
			int status) throws SystemException {

		List listDocument = null;

		listDocument = (List) vLegalDocumentFinder.findAdvanceDocument(groupId,
				language, fieldId, proDateFrom, proDateTo, summary, num,
				symbol, expDateFrom, expDateTo, typeIds, orgIds, sigIds,
				content, VLegalDocumentServiceImpl.PUBLISHED);

		return listDocument;
	}

	// Search Basic
	public List getDocument_Basic(long groupId, String language, String number,
			String symbol, String fieldId, String orgId, String typeId,
			Date proDateFrom, Date proDateTo, String summary, int status)
			throws SystemException, PortalException {
		return vLegalDocumentFinder.findBasicDocument(groupId, language,
				number, symbol, fieldId, orgId, typeId, proDateFrom, proDateTo,
				summary, VLegalDocumentServiceImpl.PUBLISHED);
	}

	public List getDocument_Basic(long groupId, String language, String number,
			String symbol, String fieldId, String orgId, String typeId,
			Date proDateFrom, Date proDateTo, String summary, int status,
			int start, int end) throws SystemException, PortalException {

		return vLegalDocumentFinder.findBasicDocument(groupId, language,
				number, symbol, fieldId, orgId, typeId, proDateFrom, proDateTo,
				summary, VLegalDocumentServiceImpl.PUBLISHED, start, end);
	}
	
	public List getDocument_Basic(String language, String number,
			String symbol, String fieldId, String orgId, String typeId,
			Date proDateFrom, Date proDateTo, String summary, int status,
			int start, int end) throws SystemException, PortalException {

		return vLegalDocumentFinder.findBasicDocument(language,
				number, symbol, fieldId, orgId, typeId, proDateFrom, proDateTo,
				summary, VLegalDocumentServiceImpl.PUBLISHED, start, end);
	}

	public int countDocument_Basic(long groupId, String language,
			String number, String symbol, String fieldId, String orgId,
			String typeId, Date proDateFrom, Date proDateTo, String summary,
			int status) throws SystemException, PortalException {
		return vLegalDocumentFinder.countBasicDocument(groupId, language,
				number, symbol, fieldId, orgId, typeId, proDateFrom, proDateTo,
				summary, VLegalDocumentServiceImpl.PUBLISHED);
	}
	
	public int countDocument_Basic(String language,
			String number, String symbol, String fieldId, String orgId,
			String typeId, Date proDateFrom, Date proDateTo, String summary,
			int status) throws SystemException, PortalException {
		return vLegalDocumentFinder.countBasicDocument(language,
				number, symbol, fieldId, orgId, typeId, proDateFrom, proDateTo,
				summary, VLegalDocumentServiceImpl.PUBLISHED);
	}

	// Search Document by Parameter
		public List searchDocumentByParam(long groupId, String language,
				String keyword, String orgId, String typeDocId, String fieldId,
				String sigId, boolean isNum, boolean isSymbol, boolean isSummary,
				boolean isContent, boolean isPromulDate, Date promulDateFrom,
				Date promulDateTo, boolean isEffectiveDate, Date effectiveDateFrom,
				Date effectiveDateTo, boolean isExpiredDate, Date expireDateFrom,
				Date expireDateTo, int statusDoc, String select)
				throws SystemException {

			List listSearch = null;

			listSearch = (List) vLegalDocumentFinder.searchDocument(groupId,
					language, keyword, orgId, typeDocId, fieldId, sigId, isNum,
					isSymbol, isSummary, isContent, isPromulDate, promulDateFrom,
					promulDateTo, isEffectiveDate, effectiveDateFrom,
					effectiveDateTo, isExpiredDate, expireDateFrom, expireDateTo,
					statusDoc, select);

			return listSearch;
		}

		public List searchDocumentByParam(long groupId, String language,
				String keyword, String orgId, String typeDocId, String fieldId,
				String sigId, boolean isNum, boolean isSymbol, boolean isSummary,
				boolean isContent, boolean isPromulDate, Date promulDateFrom,
				Date promulDateTo, boolean isEffectiveDate, Date effectiveDateFrom,
				Date effectiveDateTo, boolean isExpiredDate, Date expireDateFrom,
				Date expireDateTo, int statusDoc, String select, int start, int end)
				throws SystemException {
			return vLegalDocumentFinder.searchDocument(groupId, language, keyword,
					orgId, typeDocId, fieldId, sigId, isNum, isSymbol, isSummary,
					isContent, isPromulDate, promulDateFrom, promulDateTo,
					isEffectiveDate, effectiveDateFrom, effectiveDateTo,
					isExpiredDate, expireDateFrom, expireDateTo, statusDoc, select,
					start, end);

		}

	public int countSearchDocumentByParam(long groupId, String language,
			String keyword, String orgId, String typeDocId, String fieldId,
			String sigId, boolean isNum, boolean isSymbol, boolean isSummary,
			boolean isContent, boolean isPromulDate, Date promulDateFrom,
			Date promulDateTo, boolean isEffectiveDate, Date effectiveDateFrom,
			Date effectiveDateTo, boolean isExpiredDate, Date expireDateFrom,
			Date expireDateTo, int statusDoc, String select)
			throws SystemException {
		return vLegalDocumentFinder.countSearchDocument(groupId, language,
				keyword, orgId, typeDocId, fieldId, sigId, isNum, isSymbol,
				isSummary, isContent, isPromulDate, promulDateFrom,
				promulDateTo, isEffectiveDate, effectiveDateFrom,
				effectiveDateTo, isExpiredDate, expireDateFrom, expireDateTo,
				statusDoc, select);
	}

	public List getContDocumentByF_O_T(long groupId, String typeDocId,
			String orgId, String fieldId, String language, Date fromDate,
			String begDocId, int begin, int end) throws SystemException,
			PortalException {

		return vLegalDocumentFinder.findByDocsByF_O_T_L_S(groupId, typeDocId,
				orgId, fieldId, language, null, fromDate, null, begDocId,
				VLegalDocumentServiceImpl.PUBLISHED, begin, end);
	}
	
	public List getContDocumentByF_O_T(String language, String typeDocId,
			String orgId, String fieldId, Date fromDate,
			String begDocId, int begin, int end) throws SystemException,
			PortalException {
		return vLegalDocumentFinder.findByDocsByF_O_T_L_S(language, typeDocId,
				orgId, fieldId, null, fromDate, null, begDocId,
				VLegalDocumentServiceImpl.PUBLISHED, begin, end);
		
	}
	
	public List searchDocument(long groupId, String language, String num,
			String symbol, int begin, int end) throws SystemException {
		return vLegalDocumentFinder.findDocument(groupId, language, "N/A", num,
				symbol, VLegalDocumentServiceImpl.PUBLISHED, begin, end);
	}

	public List findDocOrther(long groupId, String language, String documentId,
			int status) throws Exception {

		return vLegalDocumentFinder.findDocOrther(groupId, language,
				documentId, status);

	}

	public int countDocOrther(long groupId, String language, String documentId,
			int status) throws Exception {

		return vLegalDocumentFinder.countDocOrther(groupId, language,
				documentId, status);
	}

	public List getDocByExpiredDate(long groupId, String language,
			String documentId, String summary, String num, String symbol,
			int status) throws Exception {
		return vLegalDocumentFinder.findDocByExpiredDate(groupId, language,
				documentId, summary, num, symbol, status);
	}

	public int countDocByExpiredDate(long groupId, String language,
			String documentId, String summary, String num, String symbol,
			int status) throws Exception {

		return vLegalDocumentFinder.countDocByExpiredDate(groupId, language,
				documentId, summary, num, symbol, status);
	}

	public List getDocByG_L_F(long groupId, String language, String fieldId)
			throws PortalException, SystemException, RemoteException {
		return vLegalDocumentPersistence
				.findByG_L_F(groupId, language, fieldId);
	}

	public List getDocByG_L_T(long groupId, String language, String typeId)
			throws PortalException, SystemException, RemoteException {
		return vLegalDocumentPersistence.findByG_L_T(groupId, language, typeId);
	}

	public List getDocByG_L_O(long groupId, String language, String orgId)
			throws PortalException, SystemException, RemoteException {
		return vLegalDocumentPersistence.findByG_L_O(groupId, language, orgId);
	}

	public void reIndex(String[] ids) throws SystemException, PortalException,
			RemoteException {
		List listDocument = vLegalDocumentPersistence.findByStatus(PUBLISHED);

			for (int i = 0; i < listDocument.size(); i++) {
				VLegalDocument document = (VLegalDocument) listDocument.get(i);
	               try{
					SearchIndexer.updateDocument(document.getDocId(), document
							.getCompanyId());
	               }catch (Exception e) {
					// TODO: handle exception
	            	   e.printStackTrace();
				}
			}
	}

	// Validate document
	public void _validate(String symbol, String num, String summary,
			String fieldId, String orgId, String typeId, String signers)
			throws PortalException, SystemException, RemoteException {

		// if (Validator.isNull(num) || !Validator.isNumber(num)) {
		// throw new InvalidDocNumExceptionException();
		//		}

		if (Validator.isNull(symbol)) {
			throw new InvalidDocSymbolExceptionException();
		}

		if (Validator.isNull(summary)) {
			throw new InvalidDocSummaryExceptionException();
		}

		if (Validator.isNull(fieldId)) {
			throw new InvalidDocFieldException();
		}

		if (Validator.isNull(orgId)) {
			throw new InvalidDocOrgException();
		}

		if (Validator.isNull(typeId)) {
			throw new InvalidDocTypeException();
		}


		VLegalDocument vDoc = null;
	}

	// search
	public Hits search(long companyId, long groupId, long userId,
			String keywords, int start, int end) throws SystemException {
		try {
			BooleanQuery contextQuery = BooleanQueryFactoryUtil.create();

			contextQuery.addRequiredTerm(Field.PORTLET_ID,
					PortletKeysExt.VLEGAL);

			if (groupId > 0) {
				contextQuery.addRequiredTerm(Field.GROUP_ID, groupId);
			}

			if (userId > 0) {
				contextQuery.addRequiredTerm(Field.USER_ID, userId);
			}

			BooleanQuery searchQuery = BooleanQueryFactoryUtil.create();

			if (Validator.isNotNull(keywords)) {
				searchQuery.addTerm(Field.TITLE, keywords);
				searchQuery.addTerm(Field.CONTENT, keywords);
				searchQuery.addTerm(Field.ASSET_TAG_NAMES, keywords);
			}

			BooleanQuery fullQuery = BooleanQueryFactoryUtil.create();

			fullQuery.add(contextQuery, BooleanClauseOccur.MUST);

			if (searchQuery.clauses().size() > 0) {
				fullQuery.add(searchQuery, BooleanClauseOccur.MUST);
			}

			return SearchEngineUtil.search(companyId, fullQuery, start, end);
		} catch (Exception e) {
			throw new SystemException(e);
		}
	}
	
}