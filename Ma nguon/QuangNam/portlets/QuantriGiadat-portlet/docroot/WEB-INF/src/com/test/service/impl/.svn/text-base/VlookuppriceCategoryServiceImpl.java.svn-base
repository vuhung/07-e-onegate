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
import com.test.NoSuchVlookuppriceCategoryException;
import com.test.model.VlookuppriceCategory;
import com.test.service.base.VlookuppriceCategoryServiceBaseImpl;


/**
 * The implementation of the vlookupprice category remote service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link com.test.service.VlookuppriceCategoryService} interface.
 * </p>
 *
 * <p>
 * Never reference this interface directly. Always use {@link com.test.service.VlookuppriceCategoryServiceUtil} to access the vlookupprice category remote service.
 * </p>
 *
 * <p>
 * This is a remote service. Methods of this service are expected to have security checks based on the propagated JAAS credentials because this service can be accessed remotely.
 * </p>
 *
 * @author Long
 * @see com.test.service.base.VlookuppriceCategoryServiceBaseImpl
 * @see com.test.service.VlookuppriceCategoryServiceUtil
 */
public class VlookuppriceCategoryServiceImpl
	extends VlookuppriceCategoryServiceBaseImpl {
	
	public VlookuppriceCategory addVlookuppriceCategory(String createdByUser,long groupId, long companyId,String parentId, String name, String description,String language)
		    throws com.liferay.portal.kernel.exception.SystemException{
			String categoryId = Long.toString(counterLocalService.increment());
		    Date date =new Date();
			VlookuppriceCategory vlookuppriceCategory = vlookuppriceCategoryPersistence.create(categoryId);
			vlookuppriceCategory.setCompanyId(companyId);
			vlookuppriceCategory.setCreatedByUser(createdByUser);
			vlookuppriceCategory.setDescription(description);
			vlookuppriceCategory.setGroupId(groupId);
			vlookuppriceCategory.setCreatedDate(date);
			vlookuppriceCategory.setLanguage(language);
			vlookuppriceCategory.setName(name);
			vlookuppriceCategory.setParentId(parentId);
			return vlookuppriceCategoryPersistence.update(vlookuppriceCategory,false);
		}
		public VlookuppriceCategory updateVlookuppriceCategory(String categoryId,String modifiedByUser,long groupId, long companyId,String parentId, String name, String description,String language)
		    throws NoSuchVlookuppriceCategoryException, com.liferay.portal.kernel.exception.SystemException{
			VlookuppriceCategory vlookuppriceCategory = vlookuppriceCategoryPersistence.findByPrimaryKey(categoryId);
			Date date =new Date();
			vlookuppriceCategory.setCompanyId(companyId);
			vlookuppriceCategory.setDescription(description);
			vlookuppriceCategory.setGroupId(groupId);
			vlookuppriceCategory.setLanguage(language);
			vlookuppriceCategory.setModifiedByUser(modifiedByUser);
			vlookuppriceCategory.setModifiedDate(date);
			vlookuppriceCategory.setName(name);
			vlookuppriceCategory.setParentId(parentId);
			return vlookuppriceCategoryPersistence.update(vlookuppriceCategory,false);
		}
		public VlookuppriceCategory deleteVlookuppriceCategory(String categoryId)
		    throws NoSuchVlookuppriceCategoryException, com.liferay.portal.kernel.exception.SystemException{
			return vlookuppriceCategoryPersistence.remove(categoryId);
		}
	
	public VlookuppriceCategory findById(String categoryId)throws NoSuchVlookuppriceCategoryException, com.liferay.portal.kernel.exception.SystemException{
		VlookuppriceCategory vlookuppriceCategory = vlookuppriceCategoryPersistence.findByPrimaryKey(categoryId);
		return vlookuppriceCategory;
	}
	public List findByP_P_L(long groupId,String parentId,String language)
	    throws NoSuchVlookuppriceCategoryException, com.liferay.portal.kernel.exception.SystemException{
		return vlookuppriceCategoryPersistence.findByP_P_L(groupId, parentId, language);
	}
	public List findByP_P_L(long groupId,String parentId,String language,int start,int end)
	    throws NoSuchVlookuppriceCategoryException, com.liferay.portal.kernel.exception.SystemException{
		return vlookuppriceCategoryPersistence.findByP_P_L(groupId, parentId, language,start,end);
	}
	public int countByP_P_L(long groupId,String parentId,String language)
	    throws NoSuchVlookuppriceCategoryException, com.liferay.portal.kernel.exception.SystemException{
		return vlookuppriceCategoryPersistence.countByP_P_L(groupId, parentId, language);
	}
	public List findByAll()throws com.liferay.portal.kernel.exception.SystemException{
		return vlookuppriceCategoryPersistence.findAll();
	}
	public List findByAll(int start,int end)throws com.liferay.portal.kernel.exception.SystemException{
		return vlookuppriceCategoryPersistence.findAll(start,end);
	}
	public int countByAll()throws com.liferay.portal.kernel.exception.SystemException{
		return vlookuppriceCategoryPersistence.countAll();
	}
	
}