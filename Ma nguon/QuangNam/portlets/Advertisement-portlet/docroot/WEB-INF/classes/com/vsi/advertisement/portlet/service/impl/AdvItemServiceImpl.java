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

import java.util.List;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQueryFactoryUtil;
import com.liferay.portal.kernel.dao.orm.PropertyFactoryUtil;
import com.liferay.portal.kernel.dao.orm.RestrictionsFactoryUtil;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.portlet.PortletClassLoaderUtil;
import com.vsi.advertisement.portlet.service.AdvItemLocalServiceUtil;
import com.vsi.advertisement.portlet.service.AdvItemServiceUtil;
import com.vsi.advertisement.portlet.service.base.AdvItemServiceBaseImpl;
import com.vsi.advertisement.portlet.model.AdvItem;
/**
 * The implementation of the adv item remote service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link com.vsi.advertisement.portlet.service.AdvItemService} interface.
 * </p>
 *
 * <p>
 * Never reference this interface directly. Always use {@link com.vsi.advertisement.portlet.service.AdvItemServiceUtil} to access the adv item remote service.
 * </p>
 *
 * <p>
 * This is a remote service. Methods of this service are expected to have security checks based on the propagated JAAS credentials because this service can be accessed remotely.
 * </p>
 *
 * @author vinhnt
 * @see com.vsi.advertisement.portlet.service.base.AdvItemServiceBaseImpl
 * @see com.vsi.advertisement.portlet.service.AdvItemServiceUtil
 */
public class AdvItemServiceImpl extends AdvItemServiceBaseImpl {
	
	public List<AdvItem> getAllItem() throws SystemException{
		return advItemPersistence.findAll();
	}
	
	public AdvItem getAdvItemById(long itemId) throws SystemException{
		return advItemPersistence.fetchByPrimaryKey(itemId);
	}
	
	public List<AdvItem> getItemByType(long typeId) throws SystemException{
		return advItemPersistence.findByType(typeId);
	}
	
	public List<AdvItem> getItemByStatus(boolean status) throws SystemException{
		return advItemPersistence.findByStatus(status);
	}
	
	public List<AdvItem> getItemByTypeStatus(long typeId, boolean status) throws SystemException{
		return advItemPersistence.findByType_Status(typeId, status);
	}
	
	public List<AdvItem> getItemByKeyword(String keyWord) throws SystemException{
		return AdvItemLocalServiceUtil.getItemByKeyWord(keyWord);
	}
	
	public List<AdvItem> getItemByKeywordType(String keyWord, long typeId) throws SystemException{
		return AdvItemLocalServiceUtil.getItemByKeywordType(keyWord, typeId);
	}
	
	public List<AdvItem> getItemByKeywordTypeStatus(String keyWord, long typeId, boolean status) throws SystemException{
		return AdvItemLocalServiceUtil.getItemByKeywordTypeStatus(keyWord, typeId, status);
	}
	
}



