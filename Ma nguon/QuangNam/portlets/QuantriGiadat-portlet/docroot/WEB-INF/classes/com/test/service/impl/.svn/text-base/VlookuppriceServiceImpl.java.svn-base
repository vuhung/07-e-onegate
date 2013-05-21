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

import java.util.Date;
import java.util.List;

import com.liferay.portal.SystemException;
import com.test.NoSuchVlookuppriceException;
import com.test.model.Vlookupprice;
import com.test.service.base.VlookuppriceServiceBaseImpl;


/**
 * The implementation of the vlookupprice remote service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link com.test.service.VlookuppriceService} interface.
 * </p>
 *
 * <p>
 * Never reference this interface directly. Always use {@link com.test.service.VlookuppriceServiceUtil} to access the vlookupprice remote service.
 * </p>
 *
 * <p>
 * This is a remote service. Methods of this service are expected to have security checks based on the propagated JAAS credentials because this service can be accessed remotely.
 * </p>
 *
 * @author Long
 * @see com.test.service.base.VlookuppriceServiceBaseImpl
 * @see com.test.service.VlookuppriceServiceUtil
 */
public class VlookuppriceServiceImpl extends VlookuppriceServiceBaseImpl {
	
	public Vlookupprice addvlookupprice(long companyId,String content,String createdByUser,
			 long groupId,String language,String parentId,int status,int price,String title,String listParent,String position1,String position2,String position3,String position4,String position5)throws com.liferay.portal.kernel.exception.SystemException{
		String lookuppriceId = Long.toString(counterLocalService.increment());
		Vlookupprice vlookupprice = vlookuppricePersistence.create(lookuppriceId);
		Date createdDate = new Date();
		vlookupprice.setCompanyId(companyId);
		vlookupprice.setContent(content);
		vlookupprice.setCreatedByUser(createdByUser);
		vlookupprice.setCreatedDate(createdDate);
		vlookupprice.setGroupId(groupId);
		vlookupprice.setLanguage(language);
		vlookupprice.setParentId(parentId);
		vlookupprice.setPrice(price);
		vlookupprice.setStatus(status);
		vlookupprice.setTitle(title);
		vlookupprice.setListParent(listParent);
		vlookupprice.setPosition1(position1);
		vlookupprice.setPosition2(position2);
		vlookupprice.setPosition3(position3);
		vlookupprice.setPosition4(position4);
		vlookupprice.setPosition5(position5);
		return vlookuppricePersistence.update(vlookupprice,false);
	}
	public Vlookupprice updatevlookupprice(String lookuppriceId,long companyId,String content,String createdByUser,
			 long groupId,String language,String parentId,int status,int price,String title,String listParent,String position1,String position2,String position3,String position4,String position5)throws NoSuchVlookuppriceException, com.liferay.portal.kernel.exception.SystemException{
		Vlookupprice vlookupprice = vlookuppricePersistence.findByPrimaryKey(lookuppriceId);
		Date createdDate = new Date();
		vlookupprice.setCompanyId(companyId);
		vlookupprice.setContent(content);
		vlookupprice.setCreatedByUser(createdByUser);
		vlookupprice.setCreatedDate(createdDate);
		vlookupprice.setGroupId(groupId);
		vlookupprice.setLanguage(language);
		vlookupprice.setParentId(parentId);
		vlookupprice.setPrice(price);
		vlookupprice.setStatus(status);
		vlookupprice.setTitle(title);
		vlookupprice.setListParent(listParent);
		vlookupprice.setPosition1(position1);
		vlookupprice.setPosition2(position2);
		vlookupprice.setPosition3(position3);
		vlookupprice.setPosition4(position4);
		vlookupprice.setPosition5(position5);
		return vlookuppricePersistence.update(vlookupprice,false);
	}
	public Vlookupprice deletevlookupprice(String lookuppriceId)throws NoSuchVlookuppriceException, com.liferay.portal.kernel.exception.SystemException{
		
		return vlookuppricePersistence.remove(lookuppriceId);
	}
	public Vlookupprice findById(String lookuppriceId)throws NoSuchVlookuppriceException, com.liferay.portal.kernel.exception.SystemException{
		
		return vlookuppricePersistence.findByPrimaryKey(lookuppriceId);
	}
  public List findByS_P(int status,String parentId)throws NoSuchVlookuppriceException, com.liferay.portal.kernel.exception.SystemException{
		return vlookuppricePersistence.findByS_P(status, parentId);
  }
  public List findByS_P(int status,String parentId,int start,int end)throws NoSuchVlookuppriceException, com.liferay.portal.kernel.exception.SystemException{
		return vlookuppricePersistence.findByS_P(status, parentId,start,end);
  }
  public int countByS_P(int status,String parentId)throws NoSuchVlookuppriceException, com.liferay.portal.kernel.exception.SystemException{
		return vlookuppricePersistence.countByS_P(status, parentId);
  }
  public List findByG_L_S_P(long groupId,String language,int status,String parentId)throws NoSuchVlookuppriceException, com.liferay.portal.kernel.exception.SystemException{
		return vlookuppricePersistence.findByG_L_S_P(groupId,language,status, parentId);
 }
 public List findByG_L_S_P(long groupId,String language,int status,String parentId,int start,int end)throws NoSuchVlookuppriceException, com.liferay.portal.kernel.exception.SystemException{
		return vlookuppricePersistence.findByG_L_S_P(groupId,language,status, parentId,start,end);
 }

 public int countByG_L_S_P(long groupId,String language,int status,String parentId)throws NoSuchVlookuppriceException, com.liferay.portal.kernel.exception.SystemException{
		return vlookuppricePersistence.countByG_L_S_P(groupId,language,status, parentId);
 }
 public List findByAll()throws com.liferay.portal.kernel.exception.SystemException{
	  return vlookuppricePersistence.findAll();
 }
 public List findByAll(int start,int end)throws com.liferay.portal.kernel.exception.SystemException{
	  return vlookuppricePersistence.findAll(start, end);
 }
 public int countByAll()throws com.liferay.portal.kernel.exception.SystemException{
	  return vlookuppricePersistence.countAll();
 }
 public Vlookupprice getLookuppriceId(String lookuppriceId)throws com.liferay.portal.kernel.exception.SystemException, NoSuchVlookuppriceException{
	return vlookuppricePersistence.findByPrimaryKey(lookuppriceId);
 }
 
 public List findByParents(String listParent,int start,int end) throws SystemException{
	  return vlookuppriceFinder.findByParents(listParent, start, end);
 }
 public int countByParents(String listParent) throws SystemException{
	  return vlookuppriceFinder.countByParents(listParent);
 }
 public List findByprice(String title,String listParent,int formPrice,int toPrice,int start,int end) throws SystemException{
	  return vlookuppriceFinder.findByPrice(title, listParent, formPrice, toPrice, start, end);
 }
 public int countByprice(String title,String listParent,int formPrice,int toPrice) throws SystemException{
	  return vlookuppriceFinder.countByPrice(title, listParent, formPrice, toPrice);
 }
 
}