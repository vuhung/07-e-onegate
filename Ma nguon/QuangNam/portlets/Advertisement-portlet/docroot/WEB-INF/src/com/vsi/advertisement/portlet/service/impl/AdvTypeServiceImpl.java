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


import java.util.Date;
import java.util.List;

import com.liferay.counter.service.CounterLocalServiceUtil;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.model.ResourceConstants;
import com.vsi.advertisement.portlet.NoSuchAdvTypeException;
import com.vsi.advertisement.portlet.service.base.AdvTypeServiceBaseImpl;
import com.vsi.advertisement.portlet.model.AdvType;

/**
 * The implementation of the adv type remote service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link com.vsi.advertisement.portlet.service.AdvTypeService} interface.
 * </p>
 *
 * <p>
 * Never reference this interface directly. Always use {@link com.vsi.advertisement.portlet.service.AdvTypeServiceUtil} to access the adv type remote service.
 * </p>
 *
 * <p>
 * This is a remote service. Methods of this service are expected to have security checks based on the propagated JAAS credentials because this service can be accessed remotely.
 * </p>
 *
 * @author vinhnt
 * @see com.vsi.advertisement.portlet.service.base.AdvTypeServiceBaseImpl
 * @see com.vsi.advertisement.portlet.service.AdvTypeServiceUtil
 */
public class AdvTypeServiceImpl extends AdvTypeServiceBaseImpl {
	
	/**
	 * 
	 */
	public List<AdvType> getAllType() throws SystemException{
		return advTypePersistence.findAll();
	}
	
	/**
	 * 
	 */
	public AdvType getType(long typeId) throws NoSuchAdvTypeException, SystemException{
		return advTypePersistence.findByPrimaryKey(typeId);
	}
	
	/**
	 * 
	 */
	public AdvType addType(long groupId, long companyId, long userId, String name, String description) throws SystemException, PortalException{
		long typeId = CounterLocalServiceUtil.increment(AdvType.class.getName());
		AdvType type = advTypePersistence.create(typeId);
		
		type.setGroupId(groupId);
		type.setCompanyId(companyId);
		type.setName(name);
		type.setDescription(description);
		type.setCreateDate(new Date());
		type.setModifiedDate(new Date());
		resourceLocalService.addResources(companyId, groupId, userId, AdvType.class.getName(), type.getPrimaryKey(), 
				false, true, true);
		advTypePersistence.update(type, false);
		return type;
	}
	
	/**
	 * 
	 */
	public void deleteType(long type) throws SystemException, PortalException{
		AdvType advType = advTypePersistence.findByPrimaryKey(type);
		deleteType(advType);
	}
	
	/**
	 * 
	 */
	public void deleteType(AdvType advType) throws PortalException, SystemException{
		resourceLocalService.deleteResource(advType.getCompanyId(), AdvType.class.getName(),
				ResourceConstants.SCOPE_INDIVIDUAL, advType.getPrimaryKey());
		advTypePersistence.remove(advType);
	}
	
	/**
	 * 
	 */
	public void updateType(AdvType type){
		try {
			advTypePersistence.update(type, true);
		} catch (SystemException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}