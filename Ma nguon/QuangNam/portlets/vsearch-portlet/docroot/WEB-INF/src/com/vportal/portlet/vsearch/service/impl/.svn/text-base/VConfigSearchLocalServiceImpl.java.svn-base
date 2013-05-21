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
import com.vportal.portlet.vsearch.NoSuchVConfigSearchException;
import com.vportal.portlet.vsearch.model.VConfigSearch;
import com.vportal.portlet.vsearch.service.base.VConfigSearchLocalServiceBaseImpl;

/**
 * The implementation of the v config search local service.
 * 
 * <p>
 * All custom service methods should be put in this class. Whenever methods are
 * added, rerun ServiceBuilder to copy their definitions into the
 * {@link com.vportal.portlet.vsearch.service.VConfigSearchLocalService}
 * interface.
 * </p>
 * 
 * <p>
 * Never reference this interface directly. Always use
 * {@link com.vportal.portlet.vsearch.service.VConfigSearchLocalServiceUtil} to
 * access the v config search local service.
 * </p>
 * 
 * <p>
 * This is a local service. Methods of this service will not have security
 * checks based on the propagated JAAS credentials because this service can only
 * be accessed from within the same VM.
 * </p>
 * 
 * @author Ba
 * @see com.vportal.portlet.vsearch.service.base.VConfigSearchLocalServiceBaseImpl
 * @see com.vportal.portlet.vsearch.service.VConfigSearchLocalServiceUtil
 */
public class VConfigSearchLocalServiceImpl extends
		VConfigSearchLocalServiceBaseImpl {
	public VConfigSearch findByPortletId(String portletId, long groupId)
			throws NoSuchVConfigSearchException, SystemException {
		return vConfigSearchPersistence.findByPortletId(portletId, groupId);

	}

	public List findByAll() throws SystemException {
		return vConfigSearchPersistence.findAll();
	}

	public VConfigSearch deleteConfigSeach(long confisearchId)
			throws NoSuchVConfigSearchException, SystemException {
		return vConfigSearchPersistence.remove(confisearchId);

	}

	public List findByPortlet(String portletId, long groupId)
			throws SystemException {
		return vConfigSearchPersistence.findByPortlet(portletId, groupId);
	}

	public VConfigSearch addConfigSearch(long groupId, long companyId,
			long userId, String userName, Date createDate, Date modifiedDate,
			String languageId, long layoutId, String portletId,
			String portleturl) throws SystemException {

		long confisearchId = counterLocalService.increment();

		VConfigSearch configSearch = vConfigSearchPersistence
				.create(confisearchId);

		configSearch.setCompanyId(companyId);
		configSearch.setCreateDate(createDate);
		configSearch.setGroupId(groupId);
		configSearch.setLanguageId(languageId);
		configSearch.setModifiedDate(modifiedDate);
		configSearch.setUserId(userId);
		configSearch.setUserName(userName);
		configSearch.setLayoutId(layoutId);
		configSearch.setPortletId(portletId);
		configSearch.setPortleturl(portleturl);

		return vConfigSearchPersistence.update(configSearch, false);

	}

	public VConfigSearch updateConfigSearch(long confisearchId, long groupId,
			long companyId, long userId, String userName, Date createDate,
			Date modifiedDate, String languageId, long layoutId,
			String portletId, String portleturl) throws NoSuchVConfigSearchException, SystemException {
		
		VConfigSearch configSearch=vConfigSearchPersistence.findByPrimaryKey(confisearchId);
		
		configSearch.setCompanyId(companyId);
		configSearch.setCreateDate(createDate);
		configSearch.setGroupId(groupId);
		configSearch.setLanguageId(languageId);
		configSearch.setModifiedDate(modifiedDate);
		configSearch.setUserId(userId);
		configSearch.setUserName(userName);
		configSearch.setLayoutId(layoutId);
		configSearch.setPortletId(portletId);
		configSearch.setPortleturl(portleturl);
		
		return vConfigSearchPersistence.update(configSearch, false);

	}

}