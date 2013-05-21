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
import java.util.Date;
import java.util.List;

import com.liferay.counter.service.CounterLocalServiceUtil;
import com.liferay.portal.NoSuchUserException;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.CalendarUtil;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.security.auth.PrincipalException;
import com.liferay.portal.service.permission.PortletPermissionUtil;
import com.liferay.portal.theme.ThemeDisplay;
import com.vportal.portlet.vlegal.NoSuchVLegalTagsException;
import com.vportal.portlet.vlegal.model.VLegalTags;
import com.vportal.portlet.vlegal.service.VLegalLoggerServiceUtil;
import com.vportal.portlet.vlegal.service.VLegalTagsService;
import com.vportal.portlet.vlegal.service.VLegalTagsServiceUtil;
import com.vportal.portlet.vlegal.service.base.VLegalTagsServiceBaseImpl;
import com.vportal.portlet.vlegal.service.persistence.VLegalTagsUtil;
import com.vportal.portlet.vlegal.util.PortletKeysExt;
import com.vportal.portlet.vlegal.util.permission.ActionKeysExt;

/**
 * @author ACB
 * @see com.vportal.portlet.vlegal.service.base.VLegalTagsServiceBaseImpl
 * @see com.vportal.portlet.vlegal.service.VLegalTagsServiceUtil
 */
public class VLegalTagsServiceImpl extends VLegalTagsServiceBaseImpl {
	
		public VLegalTags addTag(long groupId, String name, boolean status,
				String[] communityPermissions, String[] guestPermissions,
				ThemeDisplay themeDisplay) throws PrincipalException, com.liferay.portal.kernel.exception.PortalException, com.liferay.portal.kernel.exception.SystemException, RemoteException
		{
	
			PortletPermissionUtil.check(getPermissionChecker(), themeDisplay
					.getLayout().getPlid(), PortletKeysExt.VLEGAL,
					ActionKeysExt.ADD);
	
			return addTag(groupId, name, status, null, null, communityPermissions,
					guestPermissions, themeDisplay);
		}
	
	
		// Add Tag
		public VLegalTags addTag(long groupId, String name, boolean status,
			Boolean addCommunityPermissions, Boolean addGuestPermissions, String[] communityPermissions,
			String[] guestPermissions, ThemeDisplay themeDisplay) throws PortalException, com.liferay.portal.kernel.exception.SystemException, NoSuchVLegalTagsException, NoSuchUserException, PrincipalException, RemoteException {
		// TODO Auto-generated method stub
			
			_validator(groupId, name);
			String tagId = Long.toString(CounterLocalServiceUtil
					.increment(VLegalTags.class.getName()));
			
			Date now = new Date();
			
			VLegalTags vTag = VLegalTagsUtil.create(tagId);
			
			vTag.setName(name);
			vTag.setGroupId(groupId);
			vTag.setStatusTags(true);
			
			VLegalTagsUtil.update(vTag, false);
			
			if((addCommunityPermissions != null) && (addGuestPermissions != null))
			{
				addEntryResources(vTag, addCommunityPermissions.booleanValue(), 
						addGuestPermissions.booleanValue());
			}
			else
			{
				addEntryResources(vTag, communityPermissions, guestPermissions);
			}
			
			// Logging...
			VLegalLoggerServiceUtil.log(groupId, CalendarUtil.getTimestamp(now)
					+ " -- CREATE: [vlegal] -> tag ["
					+ name
					+ "] by "
					+ userPersistence.findByPrimaryKey(getUserId())
					.getScreenName());
			
			return vTag;
		}
		
		
	public void addEntryResources(VLegalTags vTag,
				String[] communityPermissions, String[] guestPermissions) throws NoSuchVLegalTagsException, com.liferay.portal.kernel.exception.SystemException {
			// TODO Auto-generated method stub
			VLegalTags entry = vLegalTagsPersistence.findByPrimaryKey(String.valueOf(vTag));
			
			addEntryResources(entry, communityPermissions, guestPermissions);
		}


	public void addEntryResources(VLegalTags vTag, boolean addCommunityPermissions,
				boolean addGuestPermissions) throws NoSuchVLegalTagsException, com.liferay.portal.kernel.exception.SystemException {
			// TODO Auto-generated method stub
			VLegalTags entry = vLegalTagsPersistence.findByPrimaryKey(String.valueOf(vTag));
			
			addEntryResources(entry, addCommunityPermissions, addGuestPermissions);
		}

	public void addEntryResources(long entryId, boolean addCommunityPermissions, 
			boolean addGuestPermissions) throws NoSuchVLegalTagsException, com.liferay.portal.kernel.exception.SystemException
	{
		VLegalTags entry = vLegalTagsPersistence.findByPrimaryKey(String.valueOf(entryId));
		
		addEntryResources(entry, addCommunityPermissions, addGuestPermissions);
	}
	
	public void addEntryResources(long entryId, String[] communityPermissions,
			String[] guestPermissions) throws NoSuchVLegalTagsException, com.liferay.portal.kernel.exception.SystemException {

		VLegalTags entry = vLegalTagsPersistence.findByPrimaryKey(String
				.valueOf(entryId));

		addEntryResources(entry, communityPermissions, guestPermissions);
	}
	
	// Get a Tag
	public VLegalTags getTag(String tagId) throws NoSuchVLegalTagsException, com.liferay.portal.kernel.exception.SystemException {
		if (Validator.isNull(tagId)) {
//				throw new NoSuchTagsException();
		}
		return VLegalTagsUtil.findByPrimaryKey(tagId);
	}

	// Delete Tag
	public void deleteTag(String tagId) {
		try
		{
			if (Validator.isNull(tagId)) {
	//			throw new NoSuchTagsException();
			}
			String name = VLegalTagsServiceUtil.getTag(tagId).getName();
			VLegalTagsUtil.remove(tagId);
	//		 Logging...
			VLegalLoggerServiceUtil.log(0, CalendarUtil.getTimestamp(new Date())
					+ " -- DELETE: [vlegal] -> tag [" + name + "] by "
					+ getUserId());
		}catch(Exception ex)
		{
			
		}
	}

	public void deleteTags(String[] tagId){
		if (Validator.isNotNull(tagId) || tagId.length <= 0) {
			return;
		}

		for (int i = 0; i < tagId.length; i++) {
			this.deleteTag(tagId[i]);
		}
	}

	// Get tags by...
	@SuppressWarnings("rawtypes")
	public List getTag_Status(long groupId, boolean status)
	{
		List<VLegalTags> vTags = null;
		try 
		{
			vTags = VLegalTagsUtil.findByP_S(groupId, status);
		} catch (com.liferay.portal.kernel.exception.SystemException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return vTags;
	}

	@SuppressWarnings({ "rawtypes", "deprecation" })
	public List getTags(long groupId, String name, String status, boolean dup,
			int begin, int end) throws SystemException{
		return vLegalTagsFinder.findVLegalTagsByName(groupId, name, status,
				dup, begin, end);
	}

	@SuppressWarnings("rawtypes")
	public List getTagsByGroupId(long groupId) throws com.liferay.portal.kernel.exception.SystemException {
		return VLegalTagsUtil.findByGroupId(groupId);
	}

	@SuppressWarnings({ "rawtypes", "deprecation" })
	public List getTag_Status(long groupId, boolean status,
			OrderByComparator obc) throws PortalException, RemoteException, com.liferay.portal.kernel.exception.SystemException {
		int count = VLegalTagsUtil.countByP_S(groupId, status);
		return VLegalTagsUtil.findByP_S(groupId, status, 0, count, obc);
	}
	
	@SuppressWarnings("deprecation")
	public void _validator(long groupId, String name) throws PortalException, SystemException
	{
		if(Validator.isNull(name))
		{
//			throw new InvalidTagsNameExceptionException();
		}
		else
		{
			//Check Duplicate
			List dTagList = vLegalTagsFinder.findVLegalTagsByName(groupId, 
					name, "TRUE", true, 0, 0);
			if(dTagList.size() <= 0)
			{
//				throw new DuplicateTagsNameExceptionException();
			}
		}
	}
}