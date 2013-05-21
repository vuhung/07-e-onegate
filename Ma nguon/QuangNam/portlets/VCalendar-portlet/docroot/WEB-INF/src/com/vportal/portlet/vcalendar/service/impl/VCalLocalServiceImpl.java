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
import com.sun.org.apache.regexp.internal.RE;
import com.vportal.portlet.vcalendar.NoSuchVCalException;
import com.vportal.portlet.vcalendar.model.VCal;
import com.vportal.portlet.vcalendar.service.base.VCalLocalServiceBaseImpl;



/**
 * The implementation of the v cal local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link com.vportal.portlet.vcalendar.service.VCalLocalService} interface.
 * </p>
 *
 * <p>
 * Never reference this interface directly. Always use {@link com.vportal.portlet.vcalendar.service.VCalLocalServiceUtil} to access the v cal local service.
 * </p>
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author Admin
 * @see com.vportal.portlet.vcalendar.service.base.VCalLocalServiceBaseImpl
 * @see com.vportal.portlet.vcalendar.service.VCalLocalServiceUtil
 */
public class VCalLocalServiceImpl extends VCalLocalServiceBaseImpl {
	public VCal addvCal(long groupId,long companyId,long userId
			,String userName,Date createDate,Date modifiedDate,
			String languageId,String title,
			String description,Date startDate,Date endDate,
			int status,long fileId,String guest,String location,String time)throws SystemException,PortalException{
		long id = counterLocalService.increment();
		VCal vCal = vCalPersistence.create(id);
		vCal.setCompanyId(companyId);
		vCal.setCreateDate(createDate);
		vCal.setDescription(description);
		vCal.setEndDate(endDate);
		vCal.setGroupId(groupId);
		vCal.setLanguageId(languageId);
		vCal.setModifiedDate(modifiedDate);
		vCal.setStartDate(startDate);
		vCal.setStatus(status);
		vCal.setTitle(title);
		vCal.setUserId(userId);
		vCal.setUserName(userName);
		vCal.setFileId(fileId);
		vCal.setGuest(guest);
		vCal.setLocation(location);
		vCal.setTime(time);
		return vCalPersistence.update(vCal,false);
	}
	public VCal updatevCal(long calId,long groupId,long companyId,long userId
			,String userName,Date createDate,Date modifiedDate,
			String languageId,String title,
			String description,int status,long fileId,String guest,String location,String time)throws SystemException,PortalException{
		VCal vCal = vCalPersistence.findByPrimaryKey(calId);
		vCal.setCompanyId(companyId);
		vCal.setCreateDate(createDate);
		vCal.setDescription(description);
		vCal.setGroupId(groupId);
		vCal.setLanguageId(languageId);
		vCal.setModifiedDate(modifiedDate);
		vCal.setStatus(status);
		vCal.setTitle(title);
		vCal.setUserId(userId);
		vCal.setUserName(userName);
		vCal.setFileId(fileId);
		vCal.setGuest(guest);
		vCal.setLocation(location);
		vCal.setTime(time);
		return vCalPersistence.update(vCal,false);
	}
	public VCal deletevCal(long calId)throws SystemException,PortalException{
		
		return vCalPersistence.remove(calId);
	}
	public List findByD_S_G(Date startDate,int status,long groupId) throws SystemException{
		return vCalPersistence.findByD_S_G(startDate, status, groupId);
	}
	public List findByD_S_G(Date startDate,int status,long groupId,int begin,int end) throws SystemException{
		return vCalPersistence.findByD_S_G(startDate, status, groupId,begin,end);
	}
	public int countByD_S_G(Date startDate,int status,long groupId) throws SystemException{
		return vCalPersistence.countByD_S_G(startDate, status, groupId);
	}
	public List findByU_D_S(long userId,int status ,Date startDate) throws SystemException{
		return vCalPersistence.findByU_D_S(userId,startDate, status);
	}
	public List findByU_D_S(long userId,Date startDate,int status,int begin,int end) throws SystemException{
		return vCalPersistence.findByU_D_S(userId,startDate, status,begin,end);
	}
	public int countByU_D_S(long userId,Date startDate,int status) throws SystemException{
		return vCalPersistence.countByU_D_S(userId,startDate, status);
	}
	public List findByD_S(Date startDate,int status) throws SystemException{
		return vCalPersistence.findByD_S(startDate, status);
	}
	public List findByD_S(Date startDate,int status,int begin,int end) throws SystemException{
		return vCalPersistence.findByD_S(startDate, status, begin,end);
	}
	public int countByD_S(Date startDate,int status) throws SystemException{
		return vCalPersistence.countByD_S(startDate, status);
	}
	public VCal findById(long calId ) throws  SystemException, NoSuchVCalException{
		return vCalPersistence.findByPrimaryKey(calId);
	}
	public List findByUser(long calId , Date startDate  , long groupId) throws  SystemException, NoSuchVCalException{
		return vCalPersistence.findByUser(calId, startDate, groupId);
	}
	public List findByUserGroup(long groupId) throws  SystemException, NoSuchVCalException{
		return vCalPersistence.findByUserGroup(groupId);
	}
	public List findByGroupOrg() throws SystemException , NoSuchVCalException
	{
		return vCalFinder.findByGroupOrg();
	}
	public List findByF_D_G_T(long userId,Date startDate,long groupId,int status) throws SystemException{
		return vCalPersistence.findByF_D_G_T(userId, startDate, groupId, status);
	}
	public List findByF(long fileId) throws SystemException{
		return vCalPersistence.findByFileId(fileId);
	}
	
	
	
	
	
	
	
	
	
	
	
}
