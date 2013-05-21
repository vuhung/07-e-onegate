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

package com.vportal.portlet.vsearch.service.impl;

import java.util.Date;
import java.util.List;

import com.liferay.portal.kernel.exception.SystemException;
import com.sun.org.apache.bcel.internal.generic.RETURN;
import com.vportal.portlet.vsearch.NoSuchVConfigSearchException;
import com.vportal.portlet.vsearch.model.VConfigSearch;
import com.vportal.portlet.vsearch.service.base.VConfigSearchServiceBaseImpl;

/**
 * The implementation of the v config search remote service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link com.vportal.portlet.vsearch.service.VConfigSearchService} interface.
 * </p>
 *
 * <p>
 * Never reference this interface directly. Always use {@link com.vportal.portlet.vsearch.service.VConfigSearchServiceUtil} to access the v config search remote service.
 * </p>
 *
 * <p>
 * This is a remote service. Methods of this service are expected to have security checks based on the propagated JAAS credentials because this service can be accessed remotely.
 * </p>
 *
 * @author Ba
 * @see com.vportal.portlet.vsearch.service.base.VConfigSearchServiceBaseImpl
 * @see com.vportal.portlet.vsearch.service.VConfigSearchServiceUtil
 */
public class VConfigSearchServiceImpl extends VConfigSearchServiceBaseImpl {
	
	public VConfigSearch findByPortletId(String portletId,long groupId) throws NoSuchVConfigSearchException, SystemException{
		
		return vConfigSearchLocalService.findByPortletId(portletId, groupId);
		
	}
	
	public List findByPortlet(String portletId,long groupId) throws SystemException{
		
		return vConfigSearchLocalService.findByPortlet(portletId, groupId);
	}
	
	public VConfigSearch deleteConfigSeach(long confisearchId) throws NoSuchVConfigSearchException, SystemException{
		
		return vConfigSearchLocalService.deleteConfigSeach(confisearchId);
		
	}
	public List findByAll() throws SystemException{
		return vConfigSearchLocalService.findByAll();
	}
	
	public VConfigSearch addConfigSearch(long groupId,long companyId,long userId
			,String userName,Date createDate,Date modifiedDate,
			String languageId,long layoutId,String portletId,String portleturl) throws SystemException{
		
		return vConfigSearchLocalService.addConfigSearch(groupId, companyId, userId, userName, createDate, modifiedDate, languageId, layoutId, portletId, portleturl);
	}
	
	public VConfigSearch updateConfigSearch(long confisearchId,long groupId,long companyId,long userId
			,String userName,Date createDate,Date modifiedDate,
			String languageId,long layoutId,String portletId,String portleturl) throws NoSuchVConfigSearchException, SystemException{
		
		return vConfigSearchLocalService.updateConfigSearch(confisearchId, groupId, companyId, userId, userName, createDate, modifiedDate, languageId, layoutId, portletId, portleturl);
		
	}
	
}