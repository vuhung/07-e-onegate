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
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.CalendarUtil;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.User;
import com.liferay.portal.security.auth.PrincipalException;
import com.liferay.portal.service.permission.PortletPermissionUtil;
import com.liferay.portal.theme.ThemeDisplay;
import com.vportal.portal.util.PortletKeysExt;
import com.vportal.portlet.vlegal.InvalidSuggestContentException;
import com.vportal.portlet.vlegal.InvalidSuggestTitleException;
import com.vportal.portlet.vlegal.InvalidSuggestVisAddressException;
import com.vportal.portlet.vlegal.InvalidSuggestVisEmailException;
import com.vportal.portlet.vlegal.InvalidSuggestVisNameException;
import com.vportal.portlet.vlegal.InvalidSuggestVisTelException;
import com.vportal.portlet.vlegal.NoSuchVLegalSuggestDocumentException;
import com.vportal.portlet.vlegal.NoSuchVLegalSuggestionException;
import com.vportal.portlet.vlegal.model.VLegalSuggestDocument;
import com.vportal.portlet.vlegal.service.VLegalLoggerServiceUtil;
import com.vportal.portlet.vlegal.service.base.VLegalSuggestDocumentServiceBaseImpl;
import com.vportal.portlet.vlegal.service.permission.VLegalSuggestPermission;
import com.vportal.portlet.vlegal.service.persistence.VLegalSuggestDocumentUtil;
import com.vportal.portlet.vlegal.util.permission.ActionKeysExt;


/**
 * The implementation of the v legal suggest document remote service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link com.vportal.portlet.vlegal.service.VLegalSuggestDocumentService} interface.
 * </p>
 *
 * <p>
 * Never reference this interface directly. Always use {@link com.vportal.portlet.vlegal.service.VLegalSuggestDocumentServiceUtil} to access the v legal suggest document remote service.
 * </p>
 *
 * <p>
 * This is a remote service. Methods of this service are expected to have security checks based on the propagated JAAS credentials because this service can be accessed remotely.
 * </p>
 *
 * @author ACB
 * @see com.vportal.portlet.vlegal.service.base.VLegalSuggestDocumentServiceBaseImpl
 * @see com.vportal.portlet.vlegal.service.VLegalSuggestDocumentServiceUtil
 */
public class VLegalSuggestDocumentServiceImpl
	extends VLegalSuggestDocumentServiceBaseImpl {
	public VLegalSuggestDocument addSuggestion(String title, String content,
			String language, String visitorName, String visitorEmail,
			String visitorTel, String visitorAddress, long groupId,
			String draftId, boolean hasAttachment,
			String[] communityPermissions, String[] guestPermissions,
			ThemeDisplay themeDisplay) throws RemoteException, PrincipalException, com.liferay.portal.kernel.exception.PortalException, com.liferay.portal.kernel.exception.SystemException {

		PortletPermissionUtil.check(getPermissionChecker(), themeDisplay
				.getLayout().getPlid(), PortletKeysExt.VLEGAL,
				ActionKeysExt.ADD);

		return addSuggestion(title, content, language, visitorName,
				visitorEmail, visitorTel, visitorAddress, groupId, draftId,
				hasAttachment, null, null, communityPermissions,
				guestPermissions, themeDisplay);

	}

	// ADD NEW SUGGESTION
	@SuppressWarnings("deprecation")
	public VLegalSuggestDocument addSuggestion(String title, String content,
			String language, String visitorName, String visitorEmail,
			String visitorTel, String visitorAddress, long groupId,
			String draftId, boolean hasAttachment,
			Boolean addCommunityPermissions, Boolean addGuestPermissions,
			String[] communityPermissions, String[] guestPermissions,
			ThemeDisplay themeDisplay) throws PortalException, RemoteException, com.liferay.portal.kernel.exception.SystemException {
		// Validate information of Visitor and Suggestion
		// _validate(title, content, visitorName, visitorEmail, visitorTel,
		// visitorAddress);

		Date now = new Date();

		String suggestionId = String.valueOf(counterLocalService.increment());

		VLegalSuggestDocument lsuggestion = vLegalSuggestDocumentPersistence
				.create(suggestionId);

		lsuggestion.setCreatedDate(now);
		lsuggestion.setModifiedDate(now);

		// Suggestion Information...
		lsuggestion.setTitle(title);
		lsuggestion.setContent(content);
		lsuggestion.setLanguage(language);

		// Visitor Information...
		lsuggestion.setVisitorName(visitorName);
		lsuggestion.setVisitorEmail(visitorEmail);
		lsuggestion.setVisitorAddress(visitorAddress);
		lsuggestion.setVisitorTel(visitorTel);

		lsuggestion.setGroupId(groupId);
		lsuggestion.setDraftId(draftId);

		lsuggestion.setHasAttachment(hasAttachment);
		// Set approved for suggestion when suggestion is inserted
		lsuggestion.setApproved(false);
		lsuggestion.setApprovedByUser(0);
		lsuggestion.setApprovedDate(null);

		vLegalSuggestDocumentPersistence.update(lsuggestion, false);

		// Logging...
		VLegalLoggerServiceUtil.log(groupId, CalendarUtil.getTimestamp(now)
				+ " -- SEND SUGGESTION : [vlegal] -> suggestion [" + title
				+ "] by " + visitorName);

		// Resources

		// if ((addCommunityPermissions != null) && (addGuestPermissions !=
		// null)) {
		//
		// addEntryResources(lsuggestion, addCommunityPermissions
		// .booleanValue(), addGuestPermissions.booleanValue());
		// } else {
		// addEntryResources(lsuggestion, communityPermissions,
		// guestPermissions);
		// }

		return lsuggestion;
	}

	// UPDATE SUGGESTION

	@SuppressWarnings("deprecation")
	public VLegalSuggestDocument updateSuggestion(String suggestionId,
			String draftId, long groupId, String title, String content,
			String language, String visitorName, String visitorEmail,
			String visitorTel, String visitorAddress, boolean approved,
			boolean hasAttachment) throws PortalException, SystemException,
			RemoteException {

		try 
		{
			VLegalSuggestPermission.check(getPermissionChecker(), suggestionId,
						ActionKeysExt.UPDATE);
	
			_validate(title, content, visitorName, visitorEmail, visitorTel,
					visitorAddress);
	
			VLegalSuggestDocument lsuggestion = vLegalSuggestDocumentPersistence
					.findByPrimaryKey(suggestionId);
	
			Date now = new Date();
			long userId = getUserId();
	
			lsuggestion.setModifiedByUser(userId);
			lsuggestion.setModifiedDate(now);
	
			if (approved == true) {
				lsuggestion.setApproved(true);
				lsuggestion.setApprovedByUser(userId);
				lsuggestion.setApprovedDate(now);
			} else {
				lsuggestion.setApproved(false);
				lsuggestion.setApprovedByUser(0);
				lsuggestion.setApprovedDate(null);
			}
	
			// Update information of Suggestion...
			lsuggestion.setTitle(title);
			lsuggestion.setContent(content);
			lsuggestion.setDraftId(draftId);
			lsuggestion.setGroupId(groupId);
			lsuggestion.setHasAttachment(hasAttachment);
	
			// Update Visitor information...
			lsuggestion.setVisitorName(visitorName);
			lsuggestion.setVisitorAddress(visitorAddress);
			lsuggestion.setVisitorEmail(visitorEmail);
			lsuggestion.setVisitorTel(visitorTel);
	
			vLegalSuggestDocumentPersistence.update(lsuggestion, false);
	
			// Logging...
			VLegalLoggerServiceUtil.log(groupId, CalendarUtil.getTimestamp(now)
					+ " -- UPDATE SUGGESTION : [vlegal] -> suggestion [" + title
					+ "] by " + userId);
	
			return lsuggestion;
		}catch(Exception ex)
		{
			
		}
		return null;
	}

	@SuppressWarnings("deprecation")
	public VLegalSuggestDocument updateSuggestion(
			VLegalSuggestDocument suggestion) throws PortalException,
			SystemException, RemoteException {

		return updateSuggestion(suggestion.getSugId(), suggestion.getDraftId(),
				suggestion.getGroupId(), suggestion.getTitle(), suggestion
						.getContent(), suggestion.getLanguage(), suggestion
						.getVisitorName(), suggestion.getVisitorEmail(),
				suggestion.getVisitorTel(), suggestion.getVisitorAddress(),
				suggestion.getApproved(), suggestion.getHasAttachment());
	}

	@SuppressWarnings("deprecation")
	public void addEntryResources(long entryId,
			boolean addCommunityPermissions, boolean addGuestPermissions)
			throws PortalException, SystemException {

		VLegalSuggestDocument entry;
		try {
			entry = vLegalSuggestDocumentPersistence
					.findByPrimaryKey(String.valueOf(entryId));
			
			addEntryResources(entry, addCommunityPermissions, addGuestPermissions);
		} catch (NoSuchVLegalSuggestDocumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (com.liferay.portal.kernel.exception.SystemException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@SuppressWarnings("deprecation")
	public void addEntryResources(VLegalSuggestDocument entry,
			boolean addCommunityPermissions, boolean addGuestPermissions)
			throws PortalException, SystemException {

		try {
			resourceLocalService.addResources(entry.getCompanyId(), entry
					.getGroupId(), entry.getUserId(), VLegalSuggestDocument.class
					.getName(), entry.getSugId(), false, addCommunityPermissions,
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

		VLegalSuggestDocument entry;
		try {
			entry = vLegalSuggestDocumentPersistence
					.findByPrimaryKey(String.valueOf(entryId));
			
			addEntryResources(entry, communityPermissions, guestPermissions);
		} catch (NoSuchVLegalSuggestDocumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (com.liferay.portal.kernel.exception.SystemException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@SuppressWarnings("deprecation")
	public void addEntryResources(VLegalSuggestDocument entry,
			String[] communityPermissions, String[] guestPermissions)
			throws PortalException, SystemException {

		try {
			resourceLocalService.addModelResources(entry.getCompanyId(), entry
					.getGroupId(), entry.getUserId(), VLegalSuggestDocument.class
					.getName(), entry.getSugId(), communityPermissions,
					guestPermissions);
		} catch (com.liferay.portal.kernel.exception.PortalException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (com.liferay.portal.kernel.exception.SystemException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	// DELETE SUGGESTION BY SUGGESSTION_ID
	@SuppressWarnings("deprecation")
	public void deleteSuggestion(String suggestionId) throws PortalException,
			SystemException, RemoteException {

		try
		{
			VLegalSuggestPermission.check(getPermissionChecker(), suggestionId,
					ActionKeysExt.DELETE);
	
			if (Validator.isNull(suggestionId)
					|| Validator.equals(suggestionId, "")) {
				return;
			}
	
			Date now = new Date();
			long userId = getUserId();
			User user = userPersistence.findByPrimaryKey(userId);
			VLegalSuggestDocument lsuggestion = VLegalSuggestDocumentUtil
					.findByPrimaryKey(suggestionId);
			String title = lsuggestion.getTitle();
	
			VLegalSuggestDocumentUtil.remove(suggestionId);
	
			// Logging...
			VLegalLoggerServiceUtil.log(0, CalendarUtil.getTimestamp(now)
					+ " -- DELETE SUGGESTION : [vlegal] -> suggestion [" + title
					+ "] by " + user.getScreenName());
		}catch(Exception ex)
		{
			
		}

	}

	// DELETE SUGGESTION BY SUGGESTIONID ARRAY
	@SuppressWarnings("deprecation")
	public void deleteSuggestions(String[] suggestionIds)
			throws PortalException, SystemException, RemoteException {
		if (Validator.isNull(suggestionIds) || suggestionIds.length < 0) {
			return;
		}
		for (int i = 0; i < suggestionIds.length; i++) {
			deleteSuggestion(suggestionIds[i]);
		}
	}

	// DELETE SUGGESTION BY DRAFTID
	@SuppressWarnings("deprecation")
	public void deleteSuggestions(String draftId) throws PortalException,
			SystemException, RemoteException {
		if (Validator.isNull(draftId)) {
			return;
		}

		try {
			VLegalSuggestDocumentUtil.removeBySuggByDraftId(draftId);
		} catch (com.liferay.portal.kernel.exception.SystemException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	// DELETE SUGGESTION BY DRAFTID AND APPROVED
	@SuppressWarnings("deprecation")
	public void deleteSuggestions(String draftId, boolean approved)
			throws PortalException, SystemException, RemoteException {
		if (Validator.isNull(draftId)) {
			return;
		}

		try {
			VLegalSuggestDocumentUtil.removeByA_D(approved, draftId);
		} catch (com.liferay.portal.kernel.exception.SystemException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@SuppressWarnings("deprecation")
	public VLegalSuggestDocument getSuggestion(String suggestionId)
			throws PortalException, SystemException, RemoteException {
		if (Validator.isNull(suggestionId)) {
			try {
				throw new NoSuchVLegalSuggestionException();
			} catch (NoSuchVLegalSuggestionException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		VLegalSuggestDocument lsuggestion;
		try {
			lsuggestion = VLegalSuggestDocumentUtil
					.findByPrimaryKey(suggestionId);
			
			return lsuggestion;
		} catch (NoSuchVLegalSuggestDocumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (com.liferay.portal.kernel.exception.SystemException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return null;
	}

	@SuppressWarnings("deprecation")
	public VLegalSuggestDocument getSuggestion(long groupId, String suggestionId)
			throws PortalException, SystemException, RemoteException {
		if (Validator.isNull(suggestionId)) {
			try {
				throw new NoSuchVLegalSuggestionException();
			} catch (NoSuchVLegalSuggestionException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		VLegalSuggestDocument lsuggestion;
		try {
			lsuggestion = VLegalSuggestDocumentUtil
					.findByG_S(groupId, suggestionId);
			
			return lsuggestion;
		} catch (NoSuchVLegalSuggestDocumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (com.liferay.portal.kernel.exception.SystemException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return null;
	}

	@SuppressWarnings({ "rawtypes", "deprecation" })
	public List getSuggestions(String draftId) throws PortalException,
			SystemException, RemoteException {
		List listSuggestion = new ArrayList();

		if (Validator.isNull(draftId)) {
			return listSuggestion;
		}

		try {
			listSuggestion = VLegalSuggestDocumentUtil.findBySuggByDraftId(draftId);
		} catch (com.liferay.portal.kernel.exception.SystemException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return listSuggestion;
	}

	@SuppressWarnings({ "rawtypes", "deprecation" })
	public List getSuggestions(boolean approved, String draftId)
			throws PortalException, SystemException, RemoteException {

		List listSuggestion = new ArrayList();

		if (Validator.isNull(draftId)) {
			return listSuggestion;
		}

		try {
			listSuggestion = VLegalSuggestDocumentUtil.findByA_D(approved, draftId);
		} catch (com.liferay.portal.kernel.exception.SystemException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return listSuggestion;
	}

	@SuppressWarnings({ "rawtypes", "deprecation" })
	public List getSuggestionsByP_L(long groupId, String language)
			throws PortalException, SystemException, RemoteException {

		try {
			return VLegalSuggestDocumentUtil.findByP_L(groupId, language);
		} catch (com.liferay.portal.kernel.exception.SystemException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	@SuppressWarnings("rawtypes")
	public List getSuggestionsByP_L_A(long groupId, String language,
			boolean approved) throws PortalException, SystemException,
			RemoteException {

		try {
			return VLegalSuggestDocumentUtil.findByP_L_A(groupId, language,
					approved);
		} catch (com.liferay.portal.kernel.exception.SystemException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	@SuppressWarnings({ "rawtypes", "deprecation" })
	public List getSuggestionsByP_L_A_D(long groupId, String language,
			boolean approved, String draftId) throws PortalException,
			SystemException, RemoteException {

		try {
			return vLegalSuggestDocumentPersistence.findByP_L_A_D(groupId,
					language, approved, draftId);
		} catch (com.liferay.portal.kernel.exception.SystemException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	@SuppressWarnings({ "rawtypes", "deprecation" })
	public List getSuggestionsByP_L_A_D(long groupId, String language,
			boolean approved, String draftId, int begin, int end)
			throws PortalException, SystemException, RemoteException {

		try {
			return vLegalSuggestDocumentPersistence.findByP_L_A_D(groupId,
					language, approved, draftId, begin, end);
		} catch (com.liferay.portal.kernel.exception.SystemException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	@SuppressWarnings("deprecation")
	public int countSuggestionsByP_L_A_D(long groupId, String language,
			boolean approved, String draftId) throws PortalException,
			SystemException, RemoteException {
		try {
			return vLegalSuggestDocumentPersistence.countByP_L_A_D(groupId,
					language, approved, draftId);
		} catch (com.liferay.portal.kernel.exception.SystemException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return 0;
	}

	// Validate data with visitor information (Name , Email , Telephone ,
	// Address...)
	@SuppressWarnings("deprecation")
	private void _validate(String title, String content, String visitorName,
			String visitorEmail, String visitorTel, String visitorAddress)
			throws PortalException, SystemException, RemoteException, InvalidSuggestTitleException, InvalidSuggestContentException, InvalidSuggestVisNameException, InvalidSuggestVisEmailException, InvalidSuggestVisTelException, InvalidSuggestVisAddressException {
		if (Validator.isNull(title) || Validator.equals(title, "")) {
			throw new InvalidSuggestTitleException();
		} else if (Validator.isNull(content) || Validator.equals(content, "")) {
			throw new InvalidSuggestContentException();
		} else if (Validator.isNull(visitorName)
				|| Validator.equals(visitorName, "")) {
			throw new InvalidSuggestVisNameException();
		} else if (Validator.isNull(visitorEmail)
				|| Validator.equals(visitorEmail, "")) {
			throw new InvalidSuggestVisEmailException();
		} else if (Validator.isNull(visitorTel)
				|| Validator.equals(visitorTel, "")) {
			throw new InvalidSuggestVisTelException();
		} else if (Validator.isNull(visitorAddress)
				|| Validator.equals(visitorAddress, "")) {
			throw new InvalidSuggestVisAddressException();
		} else if (Validator.isNotNull(visitorEmail)
				&& visitorEmail.length() > 0) {
			validateEmailFormat(visitorEmail);
		}
	}

	// VALIDATE FORMAT EMAIL ADDRESS
	@SuppressWarnings("deprecation")
	private void validateEmailFormat(String Email) throws PortalException,
			SystemException, RemoteException, InvalidSuggestVisEmailException {

		Pattern p = Pattern.compile(".+@.+\\.[a-z]+");
		// Match the given string with the pattern
		Matcher m = p.matcher(Email);
		// check whether match is found
		boolean matchFound = m.matches();
		if (!matchFound) {
			throw new InvalidSuggestVisEmailException();
		}
	}

	@SuppressWarnings("deprecation")
	@Override
	public VLegalSuggestDocument addSuggestion(String arg0, String arg1,
			String arg2, String arg3, String arg4, String arg5, String arg6,
			long arg7, String arg8, boolean arg9, long arg10, long arg11,
			String[] arg12, String[] arg13, ThemeDisplay arg14)
			throws PortalException, SystemException, RemoteException {
		// TODO Auto-generated method stub
		return null;
	}

	@SuppressWarnings("deprecation")
	@Override
	public VLegalSuggestDocument addSuggestion(String arg0, String arg1,
			String arg2, String arg3, String arg4, String arg5, String arg6,
			long arg7, String arg8, boolean arg9, long arg10, long arg11,
			Boolean arg12, Boolean arg13, String[] arg14, String[] arg15,
			ThemeDisplay arg16) throws PortalException, SystemException,
			RemoteException {
		// TODO Auto-generated method stub
		return null;
	}

	@SuppressWarnings("deprecation")
	@Override
	public VLegalSuggestDocument updateSuggestions(VLegalSuggestDocument arg0)
			throws PortalException, SystemException, RemoteException {
		// TODO Auto-generated method stub
		return null;
	}

	@SuppressWarnings("deprecation")
	@Override
	public VLegalSuggestDocument updateSuggestions(String arg0, String arg1,
			long arg2, String arg3, String arg4, String arg5, String arg6,
			String arg7, String arg8, boolean arg9, boolean arg10)
			throws PortalException, SystemException, RemoteException {
		// TODO Auto-generated method stub
		return null;
	}
	
}