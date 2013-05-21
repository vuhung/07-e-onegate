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
import com.vsi.lienketwebsite.service.base.LinksServiceBaseImpl;
import com.vsi.lienketwebsite.service.persistence.LinkGroupUtil;
import com.vsi.lienketwebsite.service.persistence.LinksUtil;


public class LinksServiceImpl extends LinksServiceBaseImpl {
	
	//cac chuc nang cua module them lien ket
	
		public Links addLink(Links newLink) throws SystemException, PortalException
		{	
			Links links = linksPersistence.create(counterLocalService.increment(Links.class.getName()));
			links.setLinkgroupId(newLink.getLinkgroupId());
			links.setName(newLink.getName());
			links.setDescription(newLink.getDescription());
			links.setUrl(newLink.getUrl());
			links.setPosition(1);
			links.setCompanyId(newLink.getCompanyId());
			links.setGroupId(newLink.getGroupId());
			links.setCreatedDate(newLink.getCreatedDate());
			links.setModifiedDate(newLink.getModifiedDate());
			
			//thieu resource
		//	resourceLocalService.addResources(newLinkGroup.getCompanyId(), newLinkGroup.getGroupId(), LinkGroup.class.getName(), false);
			
			return linksPersistence.update(links, false);
		}
		
		//tra ve mot danh sach tat ca cac lien ket
			public List<Links> getLinks(long groupId)
		            throws SystemException {

		            List<Links> links =
		               linksPersistence.findByGroupId(groupId);
		            return links;
		        }		
			
			
			public Links getLink(long linkId) throws SystemException
			{
				return LinksUtil.fetchByPrimaryKey(linkId);
				
			}
			
			
			public Links updateLinks(long linkId, long groupId,
					long companyId, long linkgroupId, String name, String description, String url, int position)
					throws PortalException, SystemException, RemoteException {

			//	LinkGroupPermission.check(getPermissionChecker(), linkgroupId,
				//		ActionKeysExt.UPDATE);

				Links links = LinksUtil.findByPrimaryKey(linkId);
				links.setCompanyId(companyId);
				links.setGroupId(groupId);
				links.setLinkgroupId(linkgroupId);
				links.setName(name);
				links.setDescription(description);
				links.setUrl(url);
				links.setPosition(position);
				links.setModifiedDate(new Date());				

				linksPersistence.update(links, false);
				return links;
			}
			
			//update
			public Links updateLinks(Links links)
					throws PortalException, SystemException, RemoteException {

				return updateLinks(links.getLinkId(), links.getGroupId(),
						 links.getCompanyId(), links.getLinkgroupId(),links.getName(),
						links.getDescription(),links.getUrl(), links.getPosition());
			}
			
			//delete
			public void deleteLinks(long linkId) throws PortalException,
			SystemException, RemoteException {

			try {

			//LinkGroupPermission.check(getPermissionChecker(), linkgroupId,
			//		ActionKeysExt.DELETE);
			
			Links links = linksPersistence.findByPrimaryKey(linkId);
			
			linksPersistence.remove(linkId);

		} catch (Exception e) {
			// TODO: handle exception
			//throw new DeleteLinkGroupException();
			System.out.println("Delete Link Group error!");
		}
		}
			public List<Links> getLinkBylinkgroupId(long linkgroupId)
		            throws SystemException {

		            List<Links> links =
		               linksPersistence.findBylinkgroupId(linkgroupId);
		            return links;
		        }	
			
			
}