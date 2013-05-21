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
 * The interface for the v cal remote service.
 *
 * <p>
 * Never modify or reference this interface directly. Always use {@link VCalServiceUtil} to access the v cal remote service. Add custom service methods to {@link com.vportal.portlet.vcalendar.service.impl.VCalServiceImpl} and rerun ServiceBuilder to automatically copy the method declarations to this interface.
 * </p>
 *
 * <p>
 * This is a remote service. Methods of this service are expected to have security checks based on the propagated JAAS credentials because this service can be accessed remotely.
 * </p>
 *
 * @author Admin
 * @see VCalServiceUtil
 * @see com.vportal.portlet.vcalendar.service.base.VCalServiceBaseImpl
 * @see com.vportal.portlet.vcalendar.service.impl.VCalServiceImpl
 * @generated
 */
@Transactional(isolation = Isolation.PORTAL, rollbackFor =  {
	PortalException.class, SystemException.class})
public interface VCalService {
	public com.vportal.portlet.vcalendar.model.VCal addvCal(long groupId,
		long companyId, long userId, java.lang.String userName,
		java.util.Date createDate, java.util.Date modifiedDate,
		java.lang.String languageId, java.lang.String title,
		java.lang.String description, java.util.Date startDate,
		java.util.Date endDate, int status, long fileId,
		java.lang.String guest, java.lang.String location, java.lang.String time)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException;

	public com.vportal.portlet.vcalendar.model.VCal updatevCal(long calId,
		long groupId, long companyId, long userId, java.lang.String userName,
		java.util.Date createDate, java.util.Date modifiedDate,
		java.lang.String languageId, java.lang.String title,
		java.lang.String description, int status, long fileId,
		java.lang.String guest, java.lang.String location, java.lang.String time)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException;

	public com.vportal.portlet.vcalendar.model.VCal deletevCal(long calId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException;

	public java.util.List findByD_S_G(java.util.Date startDate, int status,
		long groupId)
		throws com.liferay.portal.kernel.exception.SystemException;

	public java.util.List findByD_S_G(java.util.Date startDate, int status,
		long groupId, int begin, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	public int countByD_S_G(java.util.Date startDate, int status, long groupId)
		throws com.liferay.portal.kernel.exception.SystemException;

	public java.util.List findByU_D_S(long userId, int status,
		java.util.Date startDate)
		throws com.liferay.portal.kernel.exception.SystemException;

	public java.util.List findByU_D_S(long userId, java.util.Date startDate,
		int status, int begin, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	public int countByU_D_S(long userId, java.util.Date startDate, int status)
		throws com.liferay.portal.kernel.exception.SystemException;

	public java.util.List findByD_S(java.util.Date startDate, int status)
		throws com.liferay.portal.kernel.exception.SystemException;

	public java.util.List findByD_S(java.util.Date startDate, int status,
		int begin, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	public int countByD_S(java.util.Date startDate, int status)
		throws com.liferay.portal.kernel.exception.SystemException;

	public com.vportal.portlet.vcalendar.model.VCal findById(long calId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vcalendar.NoSuchVCalException;

	public java.util.List findByUser(long calId, java.util.Date startDate,
		long groupId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vcalendar.NoSuchVCalException;

	public java.util.List findByUserGroup(long groupId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vcalendar.NoSuchVCalException;

	public java.util.List findByGroupOrg()
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vcalendar.NoSuchVCalException;

	public java.util.List findByF_D_G_T(long userId, java.util.Date startDate,
		long groupId, int status)
		throws com.liferay.portal.kernel.exception.SystemException;

	public java.util.List findByF(long fileId)
		throws com.liferay.portal.kernel.exception.SystemException;
}