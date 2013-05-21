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

package com.vsi.advertisement.portlet.service.impl;

import com.liferay.counter.service.CounterLocalServiceUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQueryFactoryUtil;
import com.liferay.portal.kernel.dao.orm.PropertyFactoryUtil;
import com.liferay.portal.kernel.dao.orm.RestrictionsFactoryUtil;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.portlet.PortletClassLoaderUtil;
import com.liferay.portal.model.ResourceConstants;
import com.liferay.portal.service.ResourceLocalServiceUtil;
import com.vportal.portal.servlet.MainServlet;
import com.vsi.advertisement.portlet.NoSuchAdvItemException;
import com.vsi.advertisement.portlet.service.AdvItemLocalServiceUtil;
import com.vsi.advertisement.portlet.service.base.AdvItemLocalServiceBaseImpl;
import com.vsi.advertisement.portlet.model.AdvItem;

import java.util.Date;
import java.util.List;
/**
 * @author vinhnt
 * @see com.vsi.advertisement.portlet.service.base.AdvItemLocalServiceBaseImpl
 * @see com.vsi.advertisement.portlet.service.AdvItemLocalServiceUtil
 */
public class AdvItemLocalServiceImpl extends AdvItemLocalServiceBaseImpl {
	
	
	/**
	 * Lấy Item bằng Id
	 */
	public AdvItem getItemById(long itemId) throws NoSuchAdvItemException, SystemException{
		return advItemPersistence.findByPrimaryKey(itemId);
	}
	
	/**
	 * Lấy danh sách các Item bằng Keyword
	 */
	@SuppressWarnings("unchecked")
	public List<AdvItem> getItemByKeyWord(String keyWord) throws SystemException{
		DynamicQuery dyQuery = DynamicQueryFactoryUtil.forClass(AdvItem.class, PortletClassLoaderUtil.getClassLoader());
		dyQuery.add(RestrictionsFactoryUtil.ilike("description", "%"+keyWord+"%"));
		List<AdvItem> items = AdvItemLocalServiceUtil.dynamicQuery(dyQuery);
		return items;
	}
	
	/**
	 * Lấy danh sách các Item bằng kiểu Quảng cáo
	 */
	@SuppressWarnings("unchecked")
	public List<AdvItem> getItemByType(long typeId) throws SystemException{
		DynamicQuery dyQuery = DynamicQueryFactoryUtil.forClass(AdvItem.class, PortletClassLoaderUtil.getClassLoader());
		dyQuery.add(PropertyFactoryUtil.forName("typeId").eq(new Long(typeId)));
		List<AdvItem> items = AdvItemLocalServiceUtil.dynamicQuery(dyQuery);
		return items;
	}
	
	/**
	 * Lấy danh sách các Item bằng trạng thái Status
	 */
	@SuppressWarnings("unchecked")
	public List<AdvItem> getItemByStatus(boolean status) throws SystemException{
		DynamicQuery dyQuery = DynamicQueryFactoryUtil.forClass(AdvItem.class, PortletClassLoaderUtil.getClassLoader());
		dyQuery.add(PropertyFactoryUtil.forName("status").eq(new Boolean(status)));
		List<AdvItem> items = AdvItemLocalServiceUtil.dynamicQuery(dyQuery);
		return items;
	}
	
	/**
	 * Lấy danh sách các Item bằng Keyword và Kiểu quảng cáo
	 */
	@SuppressWarnings("unchecked")
	public List<AdvItem> getItemByKeywordType(String keyWord, long typeId) throws SystemException{
		DynamicQuery dyQuery = DynamicQueryFactoryUtil.forClass(AdvItem.class, PortletClassLoaderUtil.getClassLoader());
		dyQuery.add(RestrictionsFactoryUtil.ilike("description", "%"+keyWord+"%"));
		dyQuery.add(PropertyFactoryUtil.forName("typeId").eq(new Long(typeId)));
		List<AdvItem> items = AdvItemLocalServiceUtil.dynamicQuery(dyQuery);
		return items;
	}
	
	/**
	 * Lấy danh sách các Item bằng Keyword và trạng thái Status
	 */
	@SuppressWarnings("unchecked")
	public List<AdvItem> getItemByKeywordStatus(String keyWord, boolean status) throws SystemException{
		DynamicQuery dyQuery = DynamicQueryFactoryUtil.forClass(AdvItem.class, PortletClassLoaderUtil.getClassLoader());
		dyQuery.add(RestrictionsFactoryUtil.ilike("description", "%"+keyWord+"%"));
		dyQuery.add(PropertyFactoryUtil.forName("status").eq(new Boolean(status)));
		List<AdvItem> items = AdvItemLocalServiceUtil.dynamicQuery(dyQuery);
		return items;
	}
	
	/**
	 * Lấy danh sách các Item bằng Kiểu quảng cáo và trạng thái
	 */
	@SuppressWarnings("unchecked")
	public List<AdvItem> getItemByTypeStatus(long typeId, boolean status) throws SystemException{
		DynamicQuery dyQuery = DynamicQueryFactoryUtil.forClass(AdvItem.class, PortletClassLoaderUtil.getClassLoader());
		dyQuery.add(PropertyFactoryUtil.forName("typeId").eq(new Long(typeId)));
		dyQuery.add(PropertyFactoryUtil.forName("status").eq(new Boolean(status)));
		List<AdvItem> items = AdvItemLocalServiceUtil.dynamicQuery(dyQuery);
		return items;
	}
	
	/**
	 * Lấy danh sách các Item bằng Keyword, kiểu quảng cáo và trạng thái
	 */
	@SuppressWarnings("unchecked")
	public List<AdvItem> getItemByKeywordTypeStatus(String keyWord, long typeId, boolean status) throws SystemException{
		DynamicQuery dyQuery = DynamicQueryFactoryUtil.forClass(AdvItem.class, PortletClassLoaderUtil.getClassLoader());
		dyQuery.add(RestrictionsFactoryUtil.ilike("description", "%"+keyWord+"%"));
		dyQuery.add(PropertyFactoryUtil.forName("typeId").eq(new Long(typeId)));
		dyQuery.add(PropertyFactoryUtil.forName("status").eq(new Boolean(status)));
		List<AdvItem> items = AdvItemLocalServiceUtil.dynamicQuery(dyQuery);
		return items;
	}
	
	/**
	 * Thêm Item
	 */
	public AdvItem addItem(long typeId,String name, String description, String url, String tooltip, Date expiredDay,
			boolean isTargetBlank, boolean status, long groupId,long companyId,long folderId, long userId, 
			Boolean addCommunityPermissions, Boolean addGuestPermissions, 
			String[] communityPermissions, String[] guestPermissions) throws SystemException, PortalException{
		
		AdvItem item = advItemPersistence.create(CounterLocalServiceUtil.increment(AdvItem.class.getName()));
		item.setTypeId(typeId);
		item.setName(name);
		item.setDescription(description);
		item.setUrl(url);
		item.setTxtMouseOver(tooltip);
		item.setStatus(status);
		item.setExpriedDate(expiredDay);
		item.setIsTargetBlank(isTargetBlank);
		item.setGroupId(groupId);
		item.setCompanyId(companyId);
		item.setCreateDate(new Date());
		item.setFolderId(folderId);
		
		advItemPersistence.update(item, false);
		
		// Add to common resources
				if ((addCommunityPermissions != null) && (addGuestPermissions != null)) {
					addAdvItemResources(item, addCommunityPermissions.booleanValue(),
							addGuestPermissions.booleanValue(), userId);
				} else {
					addAdvItemResources(item, communityPermissions, guestPermissions, userId);
				}
		
//		resourceLocalService.addResources(item.getCompanyId(), item.getGroupId(), userId, AdvItem.class.getName(),
//				item.getPrimaryKey(), false, true, true);
		
		return item;
	}
	
	public AdvItem updateItem(AdvItem item) throws PortalException, SystemException{
		return updateItem(item.getItemId(), item.getGroupId(), item.getCompanyId(),item.getName(), item.getDescription(),
				item.getUrl(), item.getIsTargetBlank(), item.getTxtMouseOver(), item.getStatus(),
				item.getTypeId(), item.getFolderId(), item.getExpriedDate());
	}
	
	public AdvItem updateItem(long itemId, long groupId, long companyId, String name,
			String description, String url, boolean isTargetBlank, String txtMouseOver, 
			boolean status, long typeId, long folderId, Date expriedDate) throws PortalException, SystemException{
		
//		AdvItemPermission.check(getPermissionChecker(), itemId,
//				ActionKeysExt.UPDATE);
//		validate(description, expriedDate);
		AdvItem item = advItemPersistence.findByPrimaryKey(itemId);
		/*System.out.println("URL OLD: " + item.getUrl());*/
		
		item.setGroupId(groupId);
		item.setCompanyId(companyId);
		item.setModifiedDate(new Date());
		item.setName(name);
		item.setDescription(description);
		item.setUrl(url);
		item.setIsTargetBlank(isTargetBlank);
		item.setTxtMouseOver(txtMouseOver);
		item.setStatus(status);
		item.setTypeId(typeId);
		item.setFolderId(folderId);
		item.setExpriedDate(expriedDate);

		advItemPersistence.update(item, false);
		System.out.println("URL NEW: " + item.getUrl());
		return item;
	}
	
	/**
	 * 	Xóa Item
	 */
	public void deleteItem(long itemId) throws SystemException, PortalException{
		AdvItem item = advItemPersistence.findByPrimaryKey(itemId);
		deleteItem(item);
	}
	
	/**
	 * 	Xóa Item
	 */
	public void deleteItem(AdvItem item) throws PortalException, SystemException{
		resourceLocalService.deleteResource(item.getCompanyId(), AdvItem.class.getName(), ResourceConstants.SCOPE_INDIVIDUAL, item.getPrimaryKey());
		advItemPersistence.remove(item);
	}
	
	// Adding Resource
		public void addAdvItemResources(long itemId,
				boolean addCommunityPermissions, boolean addGuestPermissions, long userId)
				throws PortalException, SystemException {

			AdvItem item = advItemPersistence.findByPrimaryKey(itemId);
			addAdvItemResources(item, addCommunityPermissions, addGuestPermissions,  userId);
		}

		public void addAdvItemResources(AdvItem item,
				boolean addCommunityPermissions, boolean addGuestPermissions, long userId)
				throws PortalException, SystemException {

			ResourceLocalServiceUtil.addResources( item.getCompanyId(),
					0, userId, AdvItem.class.getName(), item.getPrimaryKey(),
					false, addCommunityPermissions, addGuestPermissions);

		}

		public void addAdvItemResources(long itemId, String[] communityPermissions,
				String[] guestPermissions, long userId) throws PortalException, SystemException {

			AdvItem item = advItemPersistence.findByPrimaryKey(itemId);
			addAdvItemResources(item, communityPermissions, guestPermissions, userId);
		}

		public void addAdvItemResources(AdvItem item,
				String[] communityPermissions, String[] guestPermissions, long userId)
				throws PortalException, SystemException {

			ResourceLocalServiceUtil.addModelResources(
					item.getCompanyId(), 0, userId, AdvItem.class
							.getName(), item.getPrimaryKey(), communityPermissions,
					guestPermissions);
		}
}























