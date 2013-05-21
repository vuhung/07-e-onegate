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

package com.vportal.portlet.vcalendar.service;

import com.liferay.portal.kernel.annotation.Isolation;
import com.liferay.portal.kernel.annotation.Transactional;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;

/**
 * The interface for the v file remote service.
 *
 * <p>
 * Never modify or reference this interface directly. Always use {@link VFileServiceUtil} to access the v file remote service. Add custom service methods to {@link com.vportal.portlet.vcalendar.service.impl.VFileServiceImpl} and rerun ServiceBuilder to automatically copy the method declarations to this interface.
 * </p>
 *
 * <p>
 * This is a remote service. Methods of this service are expected to have security checks based on the propagated JAAS credentials because this service can be accessed remotely.
 * </p>
 *
 * @author Admin
 * @see VFileServiceUtil
 * @see com.vportal.portlet.vcalendar.service.base.VFileServiceBaseImpl
 * @see com.vportal.portlet.vcalendar.service.impl.VFileServiceImpl
 * @generated
 */
@Transactional(isolation = Isolation.PORTAL, rollbackFor =  {
	PortalException.class, SystemException.class})
public interface VFileService {
	public com.vportal.portlet.vcalendar.model.VFile addVFile(
		java.lang.String fullname, java.lang.String phone,
		java.lang.String address, java.lang.String position,
		java.util.Date birthday, int status)
		throws com.liferay.portal.kernel.exception.SystemException;

	public com.vportal.portlet.vcalendar.model.VFile updateVFile(long fileId,
		java.lang.String fullname, java.lang.String phone,
		java.lang.String address, java.lang.String position,
		java.util.Date birthday, int status)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vcalendar.NoSuchVFileException;

	public com.vportal.portlet.vcalendar.model.VFile deleteVFile(long fileId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vcalendar.NoSuchVFileException;

	public com.vportal.portlet.vcalendar.model.VFile findById(long fileId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vcalendar.NoSuchVFileException;

	public java.util.List findByAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	public java.util.List findByAll(int begin, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	public java.util.List findByGroupId(int status)
		throws com.liferay.portal.kernel.exception.SystemException;

	public java.util.List findByGroupId(int status, int begin, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	public int countByGroupId(int status)
		throws com.liferay.portal.kernel.exception.SystemException;
}