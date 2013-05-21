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

package com.vportal.portlet.vcalendar.service.impl;

import java.util.Date;
import java.util.List;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.vportal.portlet.vcalendar.NoSuchVCalException;
import com.vportal.portlet.vcalendar.model.VCal;
import com.vportal.portlet.vcalendar.service.VCalLocalService;
import com.vportal.portlet.vcalendar.service.base.VCalServiceBaseImpl;




/**
 * The implementation of the v cal remote service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link com.vportal.portlet.vcalendar.service.VCalService} interface.
 * </p>
 *
 * <p>
 * Never reference this interface directly. Always use {@link com.vportal.portlet.vcalendar.service.VCalServiceUtil} to access the v cal remote service.
 * </p>
 *
 * <p>
 * This is a remote service. Methods of this service are expected to have security checks based on the propagated JAAS credentials because this service can be accessed remotely.
 * </p>
 *
 * @author Admin
 * @see com.vportal.portlet.vcalendar.service.base.VCalServiceBaseImpl
 * @see com.vportal.portlet.vcalendar.service.VCalServiceUtil
 */
public class VCalServiceImpl extends VCalServiceBaseImpl {
	public VCal addvCal(long groupId,long companyId,long userId
			,String userName,Date createDate,Date modifiedDate,
			String languageId,String title,
			String description,Date startDate,Date endDate,
			int status,long fileId,String guest,String location,String time)throws SystemException,PortalException{
		return  vCalLocalService.addvCal(groupId,companyId,userId
				,userName,createDate,modifiedDate,
				languageId,title,
				description,startDate,endDate,status,fileId,guest,location,time);
	   }
	
	public VCal updatevCal(long calId,long groupId,long companyId,long userId
			,String userName,Date createDate,Date modifiedDate,
			String languageId,String title,
			String description,
			int status,long fileId,String guest,String location,String time)throws SystemException,PortalException{
		return  vCalLocalService.updatevCal(calId,groupId,companyId,userId
				,userName,createDate,modifiedDate,
				languageId,title,
				description,status,fileId,guest,location,time);
	}
	public VCal deletevCal(long calId)throws SystemException,PortalException{
		
		return  vCalLocalService.deletevCal(calId);
	}

	public List findByD_S_G(Date startDate,int status,long groupId) throws SystemException{
		return  vCalLocalService.findByD_S_G(startDate, status, groupId);
	}
	public List findByD_S_G(Date startDate,int status,long groupId,int begin,int end) throws SystemException{
		return  vCalLocalService.findByD_S_G(startDate, status, groupId,begin,end);
	}
	public int countByD_S_G(Date startDate,int status,long groupId) throws SystemException{
		return  vCalLocalService.countByD_S_G(startDate, status, groupId);
	}
	public List findByU_D_S(long userId,int status ,Date startDate) throws SystemException{
		return vCalLocalService.findByU_D_S(userId,status , startDate);
	}
	public List findByU_D_S(long userId,Date startDate,int status,int begin,int end) throws SystemException{
		return  vCalLocalService.findByU_D_S(userId,startDate, status,begin,end);
	}
	public int countByU_D_S(long userId,Date startDate,int status) throws SystemException{
		return  vCalLocalService.countByU_D_S(userId,startDate, status);
	}
	public List findByD_S(Date startDate,int status) throws SystemException{
		return vCalLocalService.findByD_S(startDate, status);
	}
	public List findByD_S(Date startDate,int status,int begin,int end) throws SystemException{
		return vCalLocalService.findByD_S(startDate, status, begin,end);
	}
	public int countByD_S(Date startDate,int status) throws SystemException{
		return  vCalLocalService.countByD_S(startDate, status);
	}
	public VCal findById(long calId) throws SystemException, NoSuchVCalException{
		return  vCalLocalService.findById(calId);
	}
	public List findByUser(long calId , Date startDate  , long groupId) throws  SystemException, NoSuchVCalException{
		return vCalLocalService.findByUser(calId, startDate, groupId);
	}
	public List findByUserGroup(long groupId) throws  SystemException, NoSuchVCalException{
		
		return vCalLocalService.findByUserGroup(groupId);
	}
	public List findByGroupOrg() throws NoSuchVCalException, SystemException {
		return vCalLocalService.findByGroupOrg();
	}
	public List findByF_D_G_T(long userId,Date startDate,long groupId,int status) throws SystemException{
		return vCalLocalService.findByF_D_G_T(userId, startDate, groupId, status);
	}
	public List findByF(long fileId) throws SystemException{
		return vCalLocalService.findByF(fileId);
	}
	
	
	
	
	
	
	
	
	
	
	
	
}