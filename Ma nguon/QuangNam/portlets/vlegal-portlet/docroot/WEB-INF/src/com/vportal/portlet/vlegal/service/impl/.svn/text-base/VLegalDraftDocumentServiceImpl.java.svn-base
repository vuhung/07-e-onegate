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

import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.annotation.Propagation;
import com.liferay.portal.kernel.annotation.Transactional;
import com.liferay.portal.kernel.util.CalendarUtil;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.User;
import com.liferay.portal.security.auth.PrincipalException;
import com.liferay.portal.service.permission.PortletPermissionUtil;
import com.liferay.portal.theme.ThemeDisplay;
import com.vportal.portal.util.PortletKeysExt;
import com.vportal.portlet.vlegal.InvalidDraftContentException;
import com.vportal.portlet.vlegal.InvalidDraftTitleException;
import com.vportal.portlet.vlegal.NoSuchVLegalDraftDocumentException;
import com.vportal.portlet.vlegal.model.VLegalDraftDocument;
import com.vportal.portlet.vlegal.service.VLegalLoggerServiceUtil;
import com.vportal.portlet.vlegal.service.base.VLegalDraftDocumentServiceBaseImpl;
import com.vportal.portlet.vlegal.service.permission.VLegalDraftPermission;
import com.vportal.portlet.vlegal.service.persistence.VLegalDraftDocumentUtil;
import com.vportal.portlet.vlegal.service.persistence.VLegalSuggestDocumentUtil;
import com.vportal.portlet.vlegal.util.permission.ActionKeysExt;

/**
 * The implementation of the v legal draft document remote service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link com.vportal.portlet.vlegal.service.VLegalDraftDocumentService} interface.
 * </p>
 *
 * <p>
 * Never reference this interface directly. Always use {@link com.vportal.portlet.vlegal.service.VLegalDraftDocumentServiceUtil} to access the v legal draft document remote service.
 * </p>
 *
 * <p>
 * This is a remote service. Methods of this service are expected to have security checks based on the propagated JAAS credentials because this service can be accessed remotely.
 * </p>
 *
 * @author ACB
 * @see com.vportal.portlet.vlegal.service.base.VLegalDraftDocumentServiceBaseImpl
 * @see com.vportal.portlet.vlegal.service.VLegalDraftDocumentServiceUtil
 */
public class VLegalDraftDocumentServiceImpl
	extends VLegalDraftDocumentServiceBaseImpl {

	public static final int APPROVAL_PENDING = 0;

	public static final int PUBLISH_PENDING = 1;

	public static final int PUBLISHED = 2;

	@SuppressWarnings("deprecation")
	public VLegalDraftDocument addDraft(long groupId, String title,
			String content, String language, String typeId, String fieldId,
			int highlevel, String docCode, Date expiredDate,
			boolean hasAttachment, String[] communityPermissions,
			String[] guestPermissions, ThemeDisplay themeDisplay)
			throws PortalException, SystemException, RemoteException {

		try {
			PortletPermissionUtil.check(getPermissionChecker(), themeDisplay
					.getLayout().getPlid(), PortletKeysExt.VLEGAL,
					ActionKeysExt.ADD_DRAFT);
		} catch (PrincipalException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (com.liferay.portal.kernel.exception.PortalException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (com.liferay.portal.kernel.exception.SystemException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return addDraft(groupId, title, content, language, typeId, fieldId,
				highlevel, docCode, expiredDate, hasAttachment, null, null,
				communityPermissions, guestPermissions, themeDisplay);
	}

	// Add new draft...
	@SuppressWarnings({ "deprecation", "unused" })
	public VLegalDraftDocument addDraft(long groupId, String title,
			String content, String language, String typeId, String fieldId,
			int highlevel, String docCode, Date expiredDate,
			boolean hasAttachment, Boolean addCommunityPermissions,
			Boolean addGuestPermissions, String[] communityPermissions,
			String[] guestPermissions, ThemeDisplay themeDisplay)
			throws PortalException, SystemException, RemoteException {

		try
		{
			_validate(title, content);
	
			long userId = getUserId();
			User user = userPersistence.findByPrimaryKey(userId);
	
			long id = counterLocalService.increment();
	
			Date now = new Date();
	
			// int highlevel = 1;//this.getDraftsByDocCode(docCode).size();
			if (highlevel == 0) {
				highlevel = 1;
			}
	
			String draftId = String.valueOf(counterLocalService.increment());
	
			if (docCode == null) {
				docCode = VLegalDraftDocument.class.getName() + "_" + draftId;
			}
	
			VLegalDraftDocument draftEntry = vLegalDraftDocumentPersistence
					.create(draftId);
	
			draftEntry.setCreatedByUser(userId);
			draftEntry.setCreatedDate(now);
			draftEntry.setModifiedByUser(userId);
			draftEntry.setModifiedDate(now);
			draftEntry.setUserId(userId);
	
			draftEntry.setGroupId(groupId);
			draftEntry.setCompanyId(user.getCompanyId());
			draftEntry.setTitle(title);
			draftEntry.setContent(content);
			draftEntry.setLanguage(language);
			draftEntry.setDocCode(docCode);
	
			draftEntry.setDraftLevel(highlevel);
			draftEntry.setTypeId(typeId);
			draftEntry.setFieldId(fieldId);
			draftEntry.setHasAttachment(hasAttachment);
	
			draftEntry.setApprovedByUser(0);
			draftEntry.setApprovedByUser(0);
			draftEntry.setPublishedByUser(0);
			draftEntry.setPublishedDate(null);
	
			draftEntry.setExpiredDate(expiredDate);
			draftEntry.setStatusDraft(APPROVAL_PENDING);
	
			vLegalDraftDocumentPersistence.update(draftEntry, false);
	
			// Resources
	
			if ((addCommunityPermissions != null) && (addGuestPermissions != null)) {
	
				addEntryResources(draftEntry, addCommunityPermissions
						.booleanValue(), addGuestPermissions.booleanValue());
			} else {
				addEntryResources(draftEntry, communityPermissions,
						guestPermissions);
			}
	
			// Logging...
			VLegalLoggerServiceUtil.log(groupId, String.valueOf(CalendarUtil
					.getTimestamp(now))
					+ " -- CREATE : [vlegal] -> draft ["
					+ title
					+ "] by "
					+ user.getScreenName());
	
			return draftEntry;
		}catch(Exception ex)
		{
			
		}
		return null;
	}

	@SuppressWarnings("deprecation")
	public VLegalDraftDocument updateDraft(String draftId, long groupId,
			String title, String content, String language, String typeId,
			String fieldId, Date expiredDate, int status, boolean hasAttachment)
			throws PortalException, SystemException, RemoteException {
		try
		{
			VLegalDraftPermission.check(getPermissionChecker(), draftId,
					ActionKeysExt.UPDATE);
	
			_validate(title, content);
	
			Date now = new Date();
			long userId = getUserId();
	
			VLegalDraftDocument draft = vLegalDraftDocumentPersistence
					.findByPrimaryKey(draftId);
	
			draft.setTitle(title);
			draft.setContent(content);
			draft.setLanguage(language);
	
			draft.setGroupId(groupId);
			draft.setTypeId(typeId);
			draft.setFieldId(fieldId);
			draft.setHasAttachment(hasAttachment);
			draft.setExpiredDate(expiredDate);
	
			draft.setModifiedByUser(userId);
			draft.setModifiedDate(now);
	
			int oldstatus = draft.getStatusDraft();
	
			if (oldstatus != status) {
				// This Draft is approved...but not published
				if (status == PUBLISH_PENDING) {
	
					VLegalDraftPermission.check(getPermissionChecker(), draftId,
							ActionKeysExt.APPROVE_DRAFT);
	
					draft.setApprovedByUser(userId);
					draft.setApprovedDate(now);
	
					draft.setPublishedDate(null);
					draft.setPublishedByUser(0);
	
					// Logging...
					VLegalLoggerServiceUtil.log(groupId, CalendarUtil
							.getTimestamp(now)
							+ " -- APPROVED: [vlegal] -> draft ["
							+ title
							+ "] by "
							+ userId);
	
					// This Draft is published...
				} else if (status == PUBLISHED) {
	
					VLegalDraftPermission.check(getPermissionChecker(), draftId,
							ActionKeysExt.PUBLISH_DRAFT);
	
					draft.setPublishedDate(now);
					draft.setPublishedByUser(userId);
	
					// Logging...
					VLegalLoggerServiceUtil.log(groupId, CalendarUtil
							.getTimestamp(now)
							+ " -- PUBLISH: [vlegal] -> draft ["
							+ title
							+ "] by "
							+ userId);
	
					// This Draft have been cancel approved and published
				} else if (status == APPROVAL_PENDING) {
	
					draft.setApprovedByUser(0);
					draft.setApprovedDate(null);
	
					draft.setPublishedDate(null);
					draft.setPublishedByUser(0);
	
					// Logging...
					VLegalLoggerServiceUtil.log(groupId, CalendarUtil
							.getTimestamp(now)
							+ " -- "
							+ ((oldstatus == PUBLISHED) ? "CANCEL PUBLISHED"
									: "CANCEL APPROVED")
							+ " [vlegal] -> draft ["
							+ title + "] by " + userId);
				}
	
				// Set new status...
				draft.setStatusDraft(status);
			} else {
	
				// Logging...
				VLegalLoggerServiceUtil.log(groupId, CalendarUtil.getTimestamp(now)
						+ " -- UPDATE: [vlegal] -> draft [" + title + "] by "
						+ userId);
			}
			// draft.setDocCode(docCode);
	
			vLegalDraftDocumentPersistence.update(draft, false);
	
			return draft;
		}catch(Exception ex)
		{
			
		}
		return null;
	}

	public VLegalDraftDocument updateDraft(VLegalDraftDocument draft)
			throws PortalException, SystemException, RemoteException {

		return updateDraft(draft.getDraftId(), draft.getGroupId(), draft
				.getTitle(), draft.getContent(), draft.getLanguage(), draft
				.getTypeId(), draft.getFieldId(), draft.getExpiredDate(), draft
				.getStatusDraft(), draft.getHasAttachment());
	}

	@SuppressWarnings("deprecation")
	public void addEntryResources(long entryId,
			boolean addCommunityPermissions, boolean addGuestPermissions)
			throws PortalException, SystemException {

		VLegalDraftDocument entry;
		try {
			entry = vLegalDraftDocumentPersistence
					.findByPrimaryKey(String.valueOf(entryId));
			
			addEntryResources(entry, addCommunityPermissions, addGuestPermissions);
		} catch (NoSuchVLegalDraftDocumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (com.liferay.portal.kernel.exception.SystemException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
	}

	@SuppressWarnings("deprecation")
	public void addEntryResources(VLegalDraftDocument entry,
			boolean addCommunityPermissions, boolean addGuestPermissions)
			throws PortalException, SystemException {

		try 
		{
			resourceLocalService.addResources(entry.getCompanyId(), entry
					.getGroupId(), entry.getUserId(), VLegalDraftDocument.class
					.getName(), entry.getDraftId(), false, addCommunityPermissions,
					addGuestPermissions);
		} catch (com.liferay.portal.kernel.exception.PortalException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (com.liferay.portal.kernel.exception.SystemException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@SuppressWarnings("deprecation")
	public void addEntryResources(long entryId, String[] communityPermissions,
			String[] guestPermissions) throws PortalException, SystemException {

		VLegalDraftDocument entry;
		try 
		{
			entry = vLegalDraftDocumentPersistence
					.findByPrimaryKey(String.valueOf(entryId));
		
			addEntryResources(entry, communityPermissions, guestPermissions);
		} catch (NoSuchVLegalDraftDocumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (com.liferay.portal.kernel.exception.SystemException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@SuppressWarnings("deprecation")
	public void addEntryResources(VLegalDraftDocument entry,
			String[] communityPermissions, String[] guestPermissions)
			throws PortalException, SystemException {

		try {
			resourceLocalService.addModelResources(entry.getCompanyId(), entry
					.getGroupId(), entry.getUserId(), VLegalDraftDocument.class
					.getName(), entry.getDraftId(), communityPermissions,
					guestPermissions);
		} catch (com.liferay.portal.kernel.exception.PortalException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (com.liferay.portal.kernel.exception.SystemException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@SuppressWarnings("deprecation")
	public void deleteDraft(String draftId) throws PortalException,
			SystemException, RemoteException {

		try
		{
		VLegalDraftPermission.check(getPermissionChecker(), draftId,
				ActionKeysExt.DELETE);

		if (Validator.isNull(draftId) || Validator.equals(draftId, "")) {
			return;
		}

		Date now = new Date();
		long userId = getUserId();
		VLegalDraftDocument ldraft = VLegalDraftDocumentUtil
				.findByPrimaryKey(draftId);

		// Remove draft by draftId
		vLegalDraftDocumentPersistence.remove(draftId);

		// Remove suggestion by draftId
		VLegalSuggestDocumentUtil.removeBySuggByDraftId(draftId);

		// Logging...
		VLegalLoggerServiceUtil.log(0, CalendarUtil.getTimestamp(now)
				+ " -- DELETE DRAFT : [vlegal] -> draft [" + ldraft.getTitle()
				+ "] by "
				+ userPersistence.findByPrimaryKey(userId).getScreenName());
		}catch(Exception ex)
		{
			
		}
	}

	@SuppressWarnings("deprecation")
	public void deleteDrafts(String[] draftIds) throws PortalException,
			SystemException, RemoteException {

		if (Validator.isNull(draftIds) || draftIds.length < 0) {
			return;
		}

		for (int i = 0; i < draftIds.length; i++) {
			deleteDraft(draftIds[i]);
		}
	}

	@SuppressWarnings("deprecation")
	public VLegalDraftDocument getDraft(String draftId) throws PortalException,
			SystemException, RemoteException {
		if (Validator.isNull(draftId) || Validator.equals(draftId, "")) {
			try {
				throw new NoSuchVLegalDraftDocumentException();
			} catch (NoSuchVLegalDraftDocumentException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		try {
			return vLegalDraftDocumentPersistence.findByPrimaryKey(draftId);
		} catch (NoSuchVLegalDraftDocumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (com.liferay.portal.kernel.exception.SystemException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	@SuppressWarnings("deprecation")
	public VLegalDraftDocument getDraft(long groupId, String draftId)
			throws PortalException, SystemException, RemoteException {
		if (Validator.isNull(draftId) || Validator.equals(draftId, "")) {
			try {
				throw new NoSuchVLegalDraftDocumentException();
			} catch (NoSuchVLegalDraftDocumentException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		try {
			return vLegalDraftDocumentPersistence.findByG_D(groupId, draftId);
		} catch (NoSuchVLegalDraftDocumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (com.liferay.portal.kernel.exception.SystemException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	@SuppressWarnings({ "rawtypes", "unchecked", "deprecation" })
	public List getDrafts(String[] draftIds) throws PortalException,
			SystemException, RemoteException {

		if (Validator.isNull(draftIds) || draftIds.length < 0) {
			try {
				throw new NoSuchVLegalDraftDocumentException();
			} catch (NoSuchVLegalDraftDocumentException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		List listDraft = new ArrayList();

		for (int i = 0; i < draftIds.length; i++) {
			listDraft.add(getDraft(draftIds[i]));
		}

		return listDraft;
	}

	@SuppressWarnings({ "rawtypes", "deprecation" })
	public List getDraftsByDocCode(String docCode) throws PortalException,
			SystemException, RemoteException {

		List listDraft = new ArrayList();
		if (Validator.isNull(docCode) || Validator.equals(docCode, "")) {
			return listDraft;
		}

		try {
			listDraft = vLegalDraftDocumentPersistence.findByDocCode(docCode);
		} catch (com.liferay.portal.kernel.exception.SystemException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return listDraft;
	}

	@SuppressWarnings({ "rawtypes", "deprecation" })
	public List getDraftsByP_L_S(long groupId, String language, int status)
			throws PortalException, SystemException, RemoteException {
		try {
			return vLegalDraftDocumentPersistence.findByP_S_L(groupId, status,
					language);
		} catch (com.liferay.portal.kernel.exception.SystemException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	@SuppressWarnings("rawtypes")
	public List getDraftsByP_L_S(long groupId, String language, int status,
			int start, int end) throws PortalException, SystemException,
			RemoteException {
		try {
			return vLegalDraftDocumentPersistence.findByP_S_L(groupId, status,
					language, start, end);
		} catch (com.liferay.portal.kernel.exception.SystemException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	@SuppressWarnings("deprecation")
	public int countDraftsByP_L_S(long groupId, String language, int status)
			throws PortalException, SystemException, RemoteException {
		try {
			return vLegalDraftDocumentPersistence.countByP_S_L(groupId, status,
					language);
		} catch (com.liferay.portal.kernel.exception.SystemException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return 0;
	}

	@SuppressWarnings({ "rawtypes", "deprecation" })
	public List getDraftsByP_L_S_E(long groupId, String language, int status)
			throws PortalException, SystemException, RemoteException {
		return vLegalDraftDocumentFinder.findDraftsByP_L_S_E(groupId, language,
				status);
	}

	@SuppressWarnings({ "rawtypes", "deprecation" })
	public List getDraftsByP_S_U_L(long groupId, int status,
			long createdByUser, String language) throws PortalException,
			SystemException, RemoteException {
		try {
			return vLegalDraftDocumentPersistence.findByP_S_U_L(groupId, status,
					createdByUser, language);
		} catch (com.liferay.portal.kernel.exception.SystemException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	@SuppressWarnings({ "rawtypes", "deprecation" })
	public List getDraftsByP_S_D(long groupId, int status, String docCode)
			throws PortalException, SystemException, RemoteException {

		try {
			return vLegalDraftDocumentPersistence.findByP_S_D(groupId, status,
					docCode);
		} catch (com.liferay.portal.kernel.exception.SystemException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	@SuppressWarnings({ "rawtypes", "deprecation" })
	public List getDraftsByP_S_F(long groupId, int status, String fieldId)
			throws PortalException, SystemException, RemoteException {

		try {
			return vLegalDraftDocumentPersistence.findByP_S_F(groupId, status,
					fieldId);
		} catch (com.liferay.portal.kernel.exception.SystemException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return null;
	}

	@SuppressWarnings({ "rawtypes", "deprecation" })
	public List getDraftsByP_S_T(long groupId, int status, String typeId)
			throws PortalException, SystemException, RemoteException {

		try {
			return vLegalDraftDocumentPersistence.findByP_S_T(groupId, status,
					typeId);
		} catch (com.liferay.portal.kernel.exception.SystemException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	@SuppressWarnings({ "rawtypes", "deprecation" })
	public List getDraftsExpiredDateByP_L_S(long groupId, String language,
			int status) throws PortalException, SystemException,
			RemoteException {
		return vLegalDraftDocumentFinder.findByDraftsExpiredDateByP_L_S(
				groupId, language, status);
	}

	@SuppressWarnings({ "rawtypes", "deprecation" })
	public List getDraftsExpiredDateByP_L_S(long groupId, String language,
			int status, int start, int end) throws PortalException,
			SystemException, RemoteException {
		return vLegalDraftDocumentFinder.findByDraftsExpiredDateByP_L_S(
				groupId, language, status, start, end);
	}

	@SuppressWarnings("deprecation")
	public int countDraftsExpiredDateByP_L_S(long groupId, String language,
			int status) throws PortalException, SystemException,
			RemoteException {
		return vLegalDraftDocumentFinder.countByDraftsExpiredDateByP_L_S(
				groupId, language, status);
	}

	@SuppressWarnings({ "rawtypes", "deprecation" })
	public List getDratfsbyP_S(long groupId, String language)
			throws PortalException, SystemException, RemoteException {
		try {
			return vLegalDraftDocumentPersistence.findByP_L(groupId, language);
		} catch (com.liferay.portal.kernel.exception.SystemException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	@SuppressWarnings({ "rawtypes", "deprecation" })
	public List getTopNewDrafts(long groupId, String language, int status,
			int quantity) throws PortalException, SystemException,
			RemoteException {

		return (List) vLegalDraftDocumentFinder.findByP_L_S(groupId, language,
				status, quantity);

	}

	@SuppressWarnings({ "rawtypes", "deprecation" })
	public List getTopNewDrafts(String fieldId, long groupId, String language,
			int status, int quantity) throws PortalException, SystemException,
			RemoteException {

		return (List) vLegalDraftDocumentFinder.findByF_P_L_S(fieldId, groupId,
				language, status, quantity);
	}

	@SuppressWarnings({ "rawtypes", "deprecation" })
	public List getOlderDrafts(String fieldId, String draftId, long groupId,
			String language, int status, int quantity) throws PortalException,
			SystemException, RemoteException {

		VLegalDraftDocument legalDraft = null;
		try {
			legalDraft = vLegalDraftDocumentPersistence
					.findByPrimaryKey(draftId);
		} catch (Exception ex) {
			ex.printStackTrace();
		}

		return (List) vLegalDraftDocumentFinder.findByAfterD_G_L_S(fieldId,
				groupId, language, status, quantity, legalDraft
						.getPublishedDate());

	}

	@SuppressWarnings("deprecation")
	public int countByStatus(long groupId, String language, int status)
			throws SystemException {
		try {
			return vLegalDraftDocumentPersistence.countByP_S_L(groupId, status,
					language);
		} catch (com.liferay.portal.kernel.exception.SystemException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return 0;
	}

	@SuppressWarnings({ "rawtypes", "deprecation" })
	public List getDraftByParam(long groupId, String language, String fieldId,
			String typeId, int status, String title, String content, int start,
			int end) throws PortalException, SystemException, RemoteException {
		return vLegalDraftDocumentFinder.findDraftByParam(groupId, language,
				fieldId, typeId, status, title, content, start, end);
	}

	@SuppressWarnings("deprecation")
	public int countDraftByParam(long groupId, String language, String fieldId,
			String typeId, int status, String title, String content)
			throws PortalException, SystemException, RemoteException {
		return vLegalDraftDocumentFinder.countDraftByParam(groupId, language,
				fieldId, typeId, status, title, content);
	}

	@SuppressWarnings("deprecation")
	private void _validate(String title, String content)
			throws PortalException, SystemException, InvalidDraftTitleException, InvalidDraftContentException {

		if (Validator.isNull(title) || (title.length() > 255)) {
			throw new InvalidDraftTitleException();
		}

		if (Validator.isNull(content) || Validator.equals(content, "")) {
			throw new InvalidDraftContentException();
		}
	}

	@SuppressWarnings("deprecation")
	@Override
	public int countDraftsByP_L_S_E(long arg0, String arg1, int arg2)
			throws PortalException, SystemException, RemoteException {
		// TODO Auto-generated method stub
		return 0;
	}

	@SuppressWarnings({ "rawtypes", "deprecation" })
	@Override
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List getDraftsByP_L_S_E(long arg0, String arg1, int arg2, int arg3,
			int arg4) throws PortalException, SystemException, RemoteException {
		// TODO Auto-generated method stub
		return null;
	}

}