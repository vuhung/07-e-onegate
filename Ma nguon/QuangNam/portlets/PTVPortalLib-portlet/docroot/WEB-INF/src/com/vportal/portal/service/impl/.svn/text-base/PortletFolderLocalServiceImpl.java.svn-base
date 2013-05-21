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

package com.vportal.portal.service.impl;

import java.util.List;

import com.liferay.portal.kernel.exception.SystemException;
import com.vportal.portal.NoSuchPortletFolderException;
import com.vportal.portal.model.PortletFolder;
import com.vportal.portal.service.base.PortletFolderLocalServiceBaseImpl;

/**
 * The implementation of the portlet folder local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link com.vportal.portal.service.PortletFolderLocalService} interface.
 * </p>
 *
 * <p>
 * Never reference this interface directly. Always use {@link com.vportal.portal.service.PortletFolderLocalServiceUtil} to access the portlet folder local service.
 * </p>
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author HOAN
 * @see com.vportal.portal.service.base.PortletFolderLocalServiceBaseImpl
 * @see com.vportal.portal.service.PortletFolderLocalServiceUtil
 */
public class PortletFolderLocalServiceImpl
	extends PortletFolderLocalServiceBaseImpl {
	public PortletFolder addPortletFolder(String portletId, long folderId,
			String description) throws SystemException {
		long id = counterLocalService.increment();
		PortletFolder pf = portletFolderPersistence.create(id);
		pf.setPortletId(portletId);
		pf.setFolderId(folderId);
		pf.setDescription(description);

		portletFolderPersistence.update(pf, false);

		return pf;
	}

	public void removePortletFolder(long id) throws SystemException,
			NoSuchPortletFolderException {
		portletFolderPersistence.remove(id);
	}

	public List getByPortletId(String portletId) throws SystemException {
		return portletFolderPersistence.findByPortletId(portletId);
	}

	public List getByFolderId(long folderId) throws SystemException {
		return portletFolderPersistence.findByFolderId(folderId);
	}

	public List getDLFolder(long groupId, String portletId)
			throws SystemException {
		return portletFolderFinder.findDLFolder(groupId, portletId);
	}

	public PortletFolder getPortletFolder(String portletId, long folderId)
			throws SystemException, NoSuchPortletFolderException {
		return portletFolderPersistence.findByP_F(portletId, folderId);
	}
}