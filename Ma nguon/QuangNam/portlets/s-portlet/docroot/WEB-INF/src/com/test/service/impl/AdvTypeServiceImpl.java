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
import com.test.DeleteTypeException;
import com.test.NoSuchAdvTypeException;
import com.test.model.AdvType;
import com.test.service.AdvItemServiceUtil;
import com.test.service.base.AdvTypeServiceBaseImpl;
import com.test.service.permission.AdvTypePermission;




/**
 * The implementation of the adv type remote service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link com.test.service.AdvTypeService} interface.
 * </p>
 *
 * <p>
 * Never reference this interface directly. Always use {@link com.test.service.AdvTypeServiceUtil} to access the adv type remote service.
 * </p>
 *
 * <p>
 * This is a remote service. Methods of this service are expected to have security checks based on the propagated JAAS credentials because this service can be accessed remotely.
 * </p>
 *
 * @author Long
 * @see com.test.service.base.AdvTypeServiceBaseImpl
 * @see com.test.service.AdvTypeServiceUtil
 */
public class AdvTypeServiceImpl extends AdvTypeServiceBaseImpl {
	public AdvType addType(long groupId, long companyId, long plid,
			String name, String description, String[] communityPermissions,
			String[] guestPermissions) throws RemoteException, PrincipalException, com.liferay.portal.kernel.exception.PortalException, com.liferay.portal.kernel.exception.SystemException {
		long typeId = CounterLocalServiceUtil
				.increment(AdvType.class.getName());

		AdvType type = advTypePersistence.create(typeId);

		type.setCompanyId(companyId);
		type.setGroupId(groupId);
		type.setCreateDate(new Date());
		type.setModifiedDate(new Date());
		type.setName(name);
		type.setDescription(description);

		advTypePersistence.update(type, false);
		return type;
	}

	public AdvType addType(long groupId, long companyId, long plid,
			String name, String description, Boolean addCommunityPermissions,
			Boolean addGuestPermissions, String[] communityPermissions,
			String[] guestPermissions) throws RemoteException, PrincipalException, com.liferay.portal.kernel.exception.PortalException, com.liferay.portal.kernel.exception.SystemException {

		PortletPermissionUtil.check(getPermissionChecker(), plid,
				PortletKeysExt.VADVMAN, com.portlat.security.ActionKeysExt.ADD_TYPE);

		long typeId = CounterLocalServiceUtil
				.increment(AdvType.class.getName());

		AdvType type = advTypePersistence.create(typeId);

		type.setCompanyId(companyId);
		type.setGroupId(groupId);
		type.setCreateDate(new Date());
		type.setModifiedDate(new Date());
		type.setName(name);
		type.setDescription(description);

		advTypePersistence.update(type, false);

		// Add to common resources
		if ((addCommunityPermissions != null) && (addGuestPermissions != null)) {

			addAdvTypeResources(type, addCommunityPermissions.booleanValue(),
					addGuestPermissions.booleanValue());

		} else {

			addAdvTypeResources(type, communityPermissions, guestPermissions);
		}

		return type;
	}

	public AdvType updateType(long typeId, long groupId, long companyId,
			long plid, String name, String description) throws PortalException,
			RemoteException, NoSuchAdvTypeException, PrincipalException, com.liferay.portal.kernel.exception.SystemException {

		AdvTypePermission.check(getPermissionChecker(), typeId,
				ActionKeys.UPDATE);

		AdvType type = advTypePersistence.findByPrimaryKey(typeId);

		type.setCompanyId(companyId);
		type.setGroupId(groupId);
		type.setModifiedDate(new Date());
		type.setName(name);
		type.setDescription(description);

		advTypePersistence.update(type, false);
		return type;
	}

	// Delete Type
	public void deleteType(long typeId) throws PortalException,
			SystemException, RemoteException, DeleteTypeException {

		try {
			AdvType type = advTypePersistence.findByPrimaryKey(typeId);

			List listItem = (List) AdvItemServiceUtil.getAllbyType(type
					.getTypeId());

			if (Validator.isNotNull(listItem) && listItem.size() > 0) {
				throw new DeleteTypeException();
			}

			// Delete resource
			ResourceLocalServiceUtil.deleteResource(type.getCompanyId(),
					AdvType.class.getName(),
					ResourceConstants.SCOPE_INDIVIDUAL, type.getTypeId());

			advTypePersistence.remove(type);
		} catch (Exception e) {

			throw new DeleteTypeException();
		}

	}

	public void deleteType(AdvType type) throws PortalException,
			RemoteException, com.liferay.portal.kernel.exception.SystemException, NoSuchAdvTypeException {
		List listItem = AdvItemServiceUtil.getAllbyType(type.getTypeId());
		if (listItem != null) {
			AdvItemServiceUtil.deleteItembyType(type.getTypeId());
		}

		advTypePersistence.remove(type.getTypeId());
	}

	
	public AdvType getType(long typeId) throws PortalException,
	RemoteException, NoSuchAdvTypeException, com.liferay.portal.kernel.exception.SystemException {
return advTypePersistence.findByPrimaryKey(typeId);
}

public int getItemCount(long typeId) throws PortalException,
	RemoteException, com.liferay.portal.kernel.exception.SystemException {
return advTypePersistence.countAll();
}

public List getTypeByG(long groupId) throws PortalException,
	RemoteException, com.liferay.portal.kernel.exception.SystemException {
return advTypePersistence.findByG(groupId);
}

public List getTypeByG(long groupId, int start, int end)
	throws PortalException, RemoteException, com.liferay.portal.kernel.exception.SystemException {
return advTypePersistence.findByG(groupId, start, end);
}

public int countTypeByG(long groupId) throws PortalException,
	RemoteException, com.liferay.portal.kernel.exception.SystemException {
return advTypePersistence.countByG(groupId);
}
public void addAdvTypeResources(long typeId,
		boolean addCommunityPermissions, boolean addGuestPermissions)
		throws com.liferay.portal.kernel.exception.SystemException, PrincipalException, com.liferay.portal.kernel.exception.PortalException {

	AdvType type = advTypePersistence.findByPrimaryKey(typeId);
	addAdvTypeResources(type, addCommunityPermissions, addGuestPermissions);
}

public void addAdvTypeResources(AdvType type,
		boolean addCommunityPermissions, boolean addGuestPermissions)
		throws PrincipalException, com.liferay.portal.kernel.exception.PortalException, com.liferay.portal.kernel.exception.SystemException {

	ResourceLocalServiceUtil.addResources(MainServlet.DEFAULT_COMPANY_ID,
			0, getUserId(), AdvType.class.getName(), type.getPrimaryKey(),
			false, addCommunityPermissions, addGuestPermissions);

}

public void addAdvTypeResources(long typeId, String[] communityPermissions,
		String[] guestPermissions) throws com.liferay.portal.kernel.exception.SystemException, PrincipalException, com.liferay.portal.kernel.exception.PortalException {

	AdvType type = advTypePersistence.findByPrimaryKey(typeId);
	addAdvTypeResources(type, communityPermissions, guestPermissions);
}

public void addAdvTypeResources(AdvType type,
		String[] communityPermissions, String[] guestPermissions)
		throws PrincipalException, com.liferay.portal.kernel.exception.PortalException, com.liferay.portal.kernel.exception.SystemException {

	ResourceLocalServiceUtil.addModelResources(
			MainServlet.DEFAULT_COMPANY_ID, 0, getUserId(),
			AdvType.class.getName(), type.getPrimaryKey(),
			communityPermissions, guestPermissions);
}
}