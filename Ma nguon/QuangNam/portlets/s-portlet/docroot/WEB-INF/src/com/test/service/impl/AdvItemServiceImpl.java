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

package com.test.service.impl;

import java.rmi.RemoteException;
import java.util.Date;
import java.util.List;

import com.liferay.counter.service.CounterLocalServiceUtil;
import com.liferay.portal.PortalException;
import com.liferay.portal.SystemException;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ResourceConstants;
import com.liferay.portal.security.auth.PrincipalException;
import com.liferay.portal.security.permission.ActionKeys;
import com.liferay.portal.service.ResourceLocalServiceUtil;
import com.liferay.portal.service.permission.PortletPermissionUtil;
import com.portlat.servlet.MainServlet;
import com.portlat.util.PortletKeysExt;
import com.test.InvalidItemDescriptionException;
import com.test.ItemExpirationDateException;
import com.test.NoSuchAdvItemException;
import com.test.model.AdvItem;
import com.test.model.AdvType;
import com.test.service.base.AdvItemServiceBaseImpl;
import com.test.service.permission.AdvItemPermission;




/**
 * The implementation of the adv item remote service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link com.test.service.AdvItemService} interface.
 * </p>
 *
 * <p>
 * Never reference this interface directly. Always use {@link com.test.service.AdvItemServiceUtil} to access the adv item remote service.
 * </p>
 *
 * <p>
 * This is a remote service. Methods of this service are expected to have security checks based on the propagated JAAS credentials because this service can be accessed remotely.
 * </p>
 *
 * @author Long
 * @see com.test.service.base.AdvItemServiceBaseImpl
 * @see com.test.service.AdvItemServiceUtil
 */
public class AdvItemServiceImpl extends AdvItemServiceBaseImpl {
	
	public AdvItem addItem(long groupId, long companyId, long plid,
			String name, String description, String url, boolean isTargetBlank,
			String txtMouseOver, boolean status, long typeId, long folderId,
			Date expriedDate, String[] communityPermissions,
			String[] guestPermissions) throws RemoteException, PrincipalException, com.liferay.portal.kernel.exception.PortalException, com.liferay.portal.kernel.exception.SystemException {
		long itemId = CounterLocalServiceUtil
				.increment(AdvItem.class.getName());
		AdvItem item = advItemPersistence.create(itemId);

		item.setGroupId(groupId);
		item.setCompanyId(companyId);
		item.setCreateDate(new Date());
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
		
		return item; 
	}

	public AdvItem addItem(long groupId, long companyId, long plid,
			String name, String description, String url, boolean isTargetBlank,
			String txtMouseOver, boolean status, long typeId, long folderId,
			Date expriedDate, Boolean addCommunityPermissions,
			Boolean addGuestPermissions, String[] communityPermissions,
			String[] guestPermissions) throws RemoteException, PrincipalException, com.liferay.portal.kernel.exception.PortalException, com.liferay.portal.kernel.exception.SystemException {

		PortletPermissionUtil.check(getPermissionChecker(), plid,
				PortletKeysExt.VADVMAN, ActionKeys.ADD_ITEM);

		validate(description, expriedDate);

		long itemId = CounterLocalServiceUtil
				.increment(AdvItem.class.getName());
		AdvItem item = advItemPersistence.create(itemId);

		item.setGroupId(groupId);
		item.setCompanyId(companyId);
		item.setCreateDate(new Date());
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

		// Add to common resources
		if ((addCommunityPermissions != null) && (addGuestPermissions != null)) {

			addAdvItemResources(item, addCommunityPermissions.booleanValue(),
					addGuestPermissions.booleanValue());

		} else {

			addAdvItemResources(item, communityPermissions, guestPermissions);
		}

		return item;
	}

	public AdvItem updateItem(long itemId, long groupId, long companyId,
			String name, String description, String url, boolean isTargetBlank,
			String txtMouseOver, boolean status, long typeId, long folderId,
			Date expriedDate) throws PortalException, RemoteException, NoSuchAdvItemException, PrincipalException, com.liferay.portal.kernel.exception.SystemException, InvalidItemDescriptionException, ItemExpirationDateException {

		AdvItemPermission.check(getPermissionChecker(), itemId,
				ActionKeys.UPDATE);

		validate(description, expriedDate);

		AdvItem item = advItemPersistence.findByPrimaryKey(itemId);

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
		return item;
	}

	public AdvItem updateItem(AdvItem advItem) throws PortalException,
			RemoteException, NoSuchAdvItemException, PrincipalException, InvalidItemDescriptionException, ItemExpirationDateException, com.liferay.portal.kernel.exception.SystemException {

		return updateItem(advItem.getItemId(), advItem.getGroupId(),
				advItem.getCompanyId(), advItem.getName(),
				advItem.getDescription(), advItem.getUrl(),
				advItem.getIsTargetBlank(), advItem.getTxtMouseOver(),
				advItem.getStatus(), advItem.getTypeId(),
				advItem.getFolderId(), advItem.getExpriedDate());

	}

	public void deleteItem(long itemId) throws RemoteException, com.liferay.portal.kernel.exception.SystemException, com.liferay.portal.kernel.exception.PortalException {
		AdvItemPermission.check(getPermissionChecker(), itemId,
				ActionKeys.DELETE);

		AdvItem item = advItemPersistence.findByPrimaryKey(itemId);
		ResourceLocalServiceUtil.deleteResource(item.getCompanyId(),
				AdvItem.class.getName(), ResourceConstants.SCOPE_INDIVIDUAL,
				item.getItemId());

		advItemPersistence.remove(item);
	}

	public void deleteItembyType(long typeId) throws PortalException,
			RemoteException, com.liferay.portal.kernel.exception.SystemException {
		advItemPersistence.removeByT(typeId);
	}
	
	
	public AdvItem getItem(long itemId) throws PortalException,
	RemoteException, NoSuchAdvItemException, com.liferay.portal.kernel.exception.SystemException {
return advItemPersistence.findByPrimaryKey(itemId);
}

public List getAllbyType(long typeId) throws PortalException,
	RemoteException, com.liferay.portal.kernel.exception.SystemException {
return advItemPersistence.findByT(typeId);
}

public List getItemByG(long groupId) throws PortalException,
	RemoteException, com.liferay.portal.kernel.exception.SystemException {
return advItemPersistence.findByG(groupId);
}

public List getItemByG(long groupId, int start, int end)
	throws PortalException, RemoteException, com.liferay.portal.kernel.exception.SystemException {
return advItemPersistence.findByG(groupId, start, end);
}

public int countItemByG(long groupId) throws PortalException,
	RemoteException, com.liferay.portal.kernel.exception.SystemException {
return advItemPersistence.countByG(groupId);
}

public List getItemByG_S(long groupId, boolean status)
	throws PortalException, RemoteException, com.liferay.portal.kernel.exception.SystemException {
return advItemPersistence.findByG_S(groupId, status);
}

public List getItemByG_S(long groupId, boolean status, int start, int end)
	throws PortalException, RemoteException, com.liferay.portal.kernel.exception.SystemException {
return advItemPersistence.findByG_S(groupId, status, start, end);
}

public int countItemByG_S(long groupId, boolean status)
	throws PortalException, RemoteException, com.liferay.portal.kernel.exception.SystemException {
return advItemPersistence.countByG_S(groupId, status);
}

public List getItemByG_T_S(long groupId, long typeId, boolean status)
	throws PortalException, RemoteException, com.liferay.portal.kernel.exception.SystemException {
return advItemPersistence.findByG_T_S(groupId, typeId, status);
}

public List getItemByG_T_S(long groupId, long typeId, boolean status,
	int begin, int end) throws PortalException, RemoteException, com.liferay.portal.kernel.exception.SystemException {
return advItemPersistence.findByG_T_S(groupId, typeId, status, begin,
		end);
}

public int countItemByG_T_S(long groupId, long typeId, boolean status)
	throws PortalException, RemoteException, com.liferay.portal.kernel.exception.SystemException {
return advItemPersistence.countByG_T_S(groupId, typeId, status);
}

public int countItemByG_T(long groupId, long typeId)
	throws PortalException, RemoteException, com.liferay.portal.kernel.exception.SystemException {
return advItemPersistence.countByG_T(groupId, typeId);
}

public void addAdvItemResources(long itemId,
		boolean addCommunityPermissions, boolean addGuestPermissions)
		throws com.liferay.portal.kernel.exception.SystemException, PrincipalException, com.liferay.portal.kernel.exception.PortalException {

	AdvItem item = advItemPersistence.findByPrimaryKey(itemId);
	addAdvItemResources(item, addCommunityPermissions, addGuestPermissions);
}

public void addAdvItemResources(AdvItem item,
		boolean addCommunityPermissions, boolean addGuestPermissions)
		throws PrincipalException, com.liferay.portal.kernel.exception.PortalException, com.liferay.portal.kernel.exception.SystemException {

	ResourceLocalServiceUtil.addResources(MainServlet.DEFAULT_COMPANY_ID,
			0, getUserId(), AdvItem.class.getName(), item.getPrimaryKey(),
			false, addCommunityPermissions, addGuestPermissions);

}

public void addAdvItemResources(long itemId, String[] communityPermissions,
		String[] guestPermissions) throws com.liferay.portal.kernel.exception.SystemException, PrincipalException, com.liferay.portal.kernel.exception.PortalException {

	AdvItem item = advItemPersistence.findByPrimaryKey(itemId);
	addAdvItemResources(item, communityPermissions, guestPermissions);
}

public void addAdvItemResources(AdvItem item,
		String[] communityPermissions, String[] guestPermissions)
		throws PrincipalException, com.liferay.portal.kernel.exception.PortalException, com.liferay.portal.kernel.exception.SystemException {

	ResourceLocalServiceUtil.addModelResources(
			MainServlet.DEFAULT_COMPANY_ID, 0, getUserId(),
			AdvType.class.getName(), item.getPrimaryKey(),
			communityPermissions, guestPermissions);
}

public List getItemByParam(long groupId, String description, long typeId,
		int status, int begin, int end) throws PortalException,
		SystemException {

	return advItemFinder.getItemByParam(groupId, description, typeId,
			status, begin, end);
}

public int countItemByParam(long groupId, String description, long typeId,
		int status) throws PortalException, SystemException {

	return advItemFinder.countItemByParam(groupId, description, typeId,
			status);
}



private void validate(String description, Date expriedDate)
		throws PortalException, SystemException, InvalidItemDescriptionException, ItemExpirationDateException {

	Date now = new Date();

	if (Validator.isNull(description)) {
		throw new InvalidItemDescriptionException();
	}

	if (Validator.isNotNull(expriedDate)) {
		if (expriedDate.before(now)) {
			throw new ItemExpirationDateException();
		}
	}

}


}