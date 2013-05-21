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

package com.vsi.lienketwebsite.service.impl;

import java.rmi.RemoteException;
import java.util.Date;
import java.util.List;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.Validator;
import com.vsi.lienketwebsite.model.LinkGroup;
import com.vsi.lienketwebsite.model.Links;
import com.vsi.lienketwebsite.service.base.LinkGroupServiceBaseImpl;
import com.vsi.lienketwebsite.service.persistence.LinkGroupUtil;


public class LinkGroupServiceImpl extends LinkGroupServiceBaseImpl 
{
	
	public LinkGroup addLinkGroup(LinkGroup newLinkGroup) throws SystemException, PortalException
	{	
		LinkGroup linkGroup = linkGroupPersistence.create(counterLocalService.increment(LinkGroup.class.getName()));
		linkGroup.setName(newLinkGroup.getName());
		linkGroup.setDescription(newLinkGroup.getDescription());
		linkGroup.setCompanyId(newLinkGroup.getCompanyId());
		linkGroup.setGroupId(newLinkGroup.getGroupId());
		linkGroup.setCreatedDate(newLinkGroup.getCreatedDate());
		linkGroup.setModifiedDate(newLinkGroup.getModifiedDate());
		
		//thieu resource
	//	resourceLocalService.addResources(newLinkGroup.getCompanyId(), newLinkGroup.getGroupId(), LinkGroup.class.getName(), false);
		
		return linkGroupPersistence.update(linkGroup, false);
	}
	
	//tra ve mot danh sach cac nhom lien ket
	public List<LinkGroup> getLinkGroups(long groupId)
            throws SystemException {

            List<LinkGroup> products =
               linkGroupPersistence.findBygroupId(groupId);
            return products;
        }
	
	//tra ve mot doi tuong LinkGroup
	public LinkGroup getLinkGroup(long linkGroupId) throws SystemException
	{
		return LinkGroupUtil.fetchByPrimaryKey(linkGroupId);
	}
	
	public LinkGroup updateLinkGroup(long linkgroupId, long groupId,
			long companyId, String name, String description)
			throws PortalException, SystemException, RemoteException {

	//	LinkGroupPermission.check(getPermissionChecker(), linkgroupId,
		//		ActionKeysExt.UPDATE);

		LinkGroup linkGroup = LinkGroupUtil.findByPrimaryKey(linkgroupId);
		linkGroup.setCompanyId(companyId);
		linkGroup.setGroupId(groupId);

		linkGroup.setName(name);
		linkGroup.setDescription(description);		
		linkGroup.setModifiedDate(new Date());

		linkGroupPersistence.update(linkGroup, false);
		return linkGroup;
	}
	
	//update
	public LinkGroup updateLinkGroup(LinkGroup linkGroup)
			throws PortalException, SystemException, RemoteException {

		return updateLinkGroup(linkGroup.getLinkgroupId(), linkGroup
				.getGroupId(), linkGroup.getCompanyId(), linkGroup.getName(),
				linkGroup.getDescription());
	}
	//delete
	public void deleteLinkGroup(long linkgroupId) throws PortalException,
	SystemException, RemoteException {

	try {

	//LinkGroupPermission.check(getPermissionChecker(), linkgroupId,
	//		ActionKeysExt.DELETE);

	LinkGroup linkGroup = linkGroupPersistence
			.findByPrimaryKey(linkgroupId);

	List linkByGroup = linksPersistence.findBylinkgroupId(linkGroup
			.getLinkgroupId());

	if (Validator.isNotNull(linkByGroup) && linkByGroup.size() > 0) {
		//throw new DeleteLinkGroupException();
		System.out.println("Delete Link Group error!");
	}
	//ResourceLocalServiceUtil.deleteResource(linkGroup.getCompanyId(),
		//	LinkGroup.class.getName(),
		//	ResourceConstants.SCOPE_INDIVIDUAL, linkGroup
			//		.getLinkgroupId());

	linkGroupPersistence.remove(linkGroup);
	//on delete cascade
	for(int i = 0; i<linkByGroup.size();i++)
	{
		Links links = (Links)linkByGroup.get(i);
		linksPersistence.remove(links.getLinkId());
	}

} catch (Exception e) {
	// TODO: handle exception
	//throw new DeleteLinkGroupException();
	System.out.println("Delete Link Group error!");
}
}
	
}