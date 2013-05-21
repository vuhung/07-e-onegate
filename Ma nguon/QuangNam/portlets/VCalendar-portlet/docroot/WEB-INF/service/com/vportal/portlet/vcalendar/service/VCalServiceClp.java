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

import com.liferay.portal.kernel.util.ClassLoaderProxy;
import com.liferay.portal.kernel.util.MethodHandler;
import com.liferay.portal.kernel.util.MethodKey;

/**
 * @author Admin
 */
public class VCalServiceClp implements VCalService {
	public VCalServiceClp(ClassLoaderProxy classLoaderProxy) {
		_classLoaderProxy = classLoaderProxy;
	}

	public com.vportal.portlet.vcalendar.model.VCal addvCal(long groupId,
		long companyId, long userId, java.lang.String userName,
		java.util.Date createDate, java.util.Date modifiedDate,
		java.lang.String languageId, java.lang.String title,
		java.lang.String description, java.util.Date startDate,
		java.util.Date endDate, int status, long fileId,
		java.lang.String guest, java.lang.String location, java.lang.String time)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		Object returnObj = null;

		MethodHandler methodHandler = new MethodHandler(_addvCalMethodKey0,
				groupId, companyId, userId, userName, createDate, modifiedDate,
				languageId, title, description, startDate, endDate, status,
				fileId, guest, location, time);

		try {
			returnObj = _classLoaderProxy.invoke(methodHandler);
		}
		catch (Throwable t) {
			if (t instanceof com.liferay.portal.kernel.exception.PortalException) {
				throw (com.liferay.portal.kernel.exception.PortalException)t;
			}

			if (t instanceof com.liferay.portal.kernel.exception.SystemException) {
				throw (com.liferay.portal.kernel.exception.SystemException)t;
			}

			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}

		return (com.vportal.portlet.vcalendar.model.VCal)ClpSerializer.translateOutput(returnObj);
	}

	public com.vportal.portlet.vcalendar.model.VCal updatevCal(long calId,
		long groupId, long companyId, long userId, java.lang.String userName,
		java.util.Date createDate, java.util.Date modifiedDate,
		java.lang.String languageId, java.lang.String title,
		java.lang.String description, int status, long fileId,
		java.lang.String guest, java.lang.String location, java.lang.String time)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		Object returnObj = null;

		MethodHandler methodHandler = new MethodHandler(_updatevCalMethodKey1,
				calId, groupId, companyId, userId, userName, createDate,
				modifiedDate, languageId, title, description, status, fileId,
				guest, location, time);

		try {
			returnObj = _classLoaderProxy.invoke(methodHandler);
		}
		catch (Throwable t) {
			if (t instanceof com.liferay.portal.kernel.exception.PortalException) {
				throw (com.liferay.portal.kernel.exception.PortalException)t;
			}

			if (t instanceof com.liferay.portal.kernel.exception.SystemException) {
				throw (com.liferay.portal.kernel.exception.SystemException)t;
			}

			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}

		return (com.vportal.portlet.vcalendar.model.VCal)ClpSerializer.translateOutput(returnObj);
	}

	public com.vportal.portlet.vcalendar.model.VCal deletevCal(long calId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		Object returnObj = null;

		MethodHandler methodHandler = new MethodHandler(_deletevCalMethodKey2,
				calId);

		try {
			returnObj = _classLoaderProxy.invoke(methodHandler);
		}
		catch (Throwable t) {
			if (t instanceof com.liferay.portal.kernel.exception.PortalException) {
				throw (com.liferay.portal.kernel.exception.PortalException)t;
			}

			if (t instanceof com.liferay.portal.kernel.exception.SystemException) {
				throw (com.liferay.portal.kernel.exception.SystemException)t;
			}

			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}

		return (com.vportal.portlet.vcalendar.model.VCal)ClpSerializer.translateOutput(returnObj);
	}

	public java.util.List findByD_S_G(java.util.Date startDate, int status,
		long groupId)
		throws com.liferay.portal.kernel.exception.SystemException {
		Object returnObj = null;

		MethodHandler methodHandler = new MethodHandler(_findByD_S_GMethodKey3,
				startDate, status, groupId);

		try {
			returnObj = _classLoaderProxy.invoke(methodHandler);
		}
		catch (Throwable t) {
			if (t instanceof com.liferay.portal.kernel.exception.SystemException) {
				throw (com.liferay.portal.kernel.exception.SystemException)t;
			}

			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}

		return (java.util.List)ClpSerializer.translateOutput(returnObj);
	}

	public java.util.List findByD_S_G(java.util.Date startDate, int status,
		long groupId, int begin, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		Object returnObj = null;

		MethodHandler methodHandler = new MethodHandler(_findByD_S_GMethodKey4,
				startDate, status, groupId, begin, end);

		try {
			returnObj = _classLoaderProxy.invoke(methodHandler);
		}
		catch (Throwable t) {
			if (t instanceof com.liferay.portal.kernel.exception.SystemException) {
				throw (com.liferay.portal.kernel.exception.SystemException)t;
			}

			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}

		return (java.util.List)ClpSerializer.translateOutput(returnObj);
	}

	public int countByD_S_G(java.util.Date startDate, int status, long groupId)
		throws com.liferay.portal.kernel.exception.SystemException {
		Object returnObj = null;

		MethodHandler methodHandler = new MethodHandler(_countByD_S_GMethodKey5,
				startDate, status, groupId);

		try {
			returnObj = _classLoaderProxy.invoke(methodHandler);
		}
		catch (Throwable t) {
			if (t instanceof com.liferay.portal.kernel.exception.SystemException) {
				throw (com.liferay.portal.kernel.exception.SystemException)t;
			}

			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}

		return ((Integer)returnObj).intValue();
	}

	public java.util.List findByU_D_S(long userId, int status,
		java.util.Date startDate)
		throws com.liferay.portal.kernel.exception.SystemException {
		Object returnObj = null;

		MethodHandler methodHandler = new MethodHandler(_findByU_D_SMethodKey6,
				userId, status, startDate);

		try {
			returnObj = _classLoaderProxy.invoke(methodHandler);
		}
		catch (Throwable t) {
			if (t instanceof com.liferay.portal.kernel.exception.SystemException) {
				throw (com.liferay.portal.kernel.exception.SystemException)t;
			}

			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}

		return (java.util.List)ClpSerializer.translateOutput(returnObj);
	}

	public java.util.List findByU_D_S(long userId, java.util.Date startDate,
		int status, int begin, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		Object returnObj = null;

		MethodHandler methodHandler = new MethodHandler(_findByU_D_SMethodKey7,
				userId, startDate, status, begin, end);

		try {
			returnObj = _classLoaderProxy.invoke(methodHandler);
		}
		catch (Throwable t) {
			if (t instanceof com.liferay.portal.kernel.exception.SystemException) {
				throw (com.liferay.portal.kernel.exception.SystemException)t;
			}

			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}

		return (java.util.List)ClpSerializer.translateOutput(returnObj);
	}

	public int countByU_D_S(long userId, java.util.Date startDate, int status)
		throws com.liferay.portal.kernel.exception.SystemException {
		Object returnObj = null;

		MethodHandler methodHandler = new MethodHandler(_countByU_D_SMethodKey8,
				userId, startDate, status);

		try {
			returnObj = _classLoaderProxy.invoke(methodHandler);
		}
		catch (Throwable t) {
			if (t instanceof com.liferay.portal.kernel.exception.SystemException) {
				throw (com.liferay.portal.kernel.exception.SystemException)t;
			}

			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}

		return ((Integer)returnObj).intValue();
	}

	public java.util.List findByD_S(java.util.Date startDate, int status)
		throws com.liferay.portal.kernel.exception.SystemException {
		Object returnObj = null;

		MethodHandler methodHandler = new MethodHandler(_findByD_SMethodKey9,
				startDate, status);

		try {
			returnObj = _classLoaderProxy.invoke(methodHandler);
		}
		catch (Throwable t) {
			if (t instanceof com.liferay.portal.kernel.exception.SystemException) {
				throw (com.liferay.portal.kernel.exception.SystemException)t;
			}

			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}

		return (java.util.List)ClpSerializer.translateOutput(returnObj);
	}

	public java.util.List findByD_S(java.util.Date startDate, int status,
		int begin, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		Object returnObj = null;

		MethodHandler methodHandler = new MethodHandler(_findByD_SMethodKey10,
				startDate, status, begin, end);

		try {
			returnObj = _classLoaderProxy.invoke(methodHandler);
		}
		catch (Throwable t) {
			if (t instanceof com.liferay.portal.kernel.exception.SystemException) {
				throw (com.liferay.portal.kernel.exception.SystemException)t;
			}

			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}

		return (java.util.List)ClpSerializer.translateOutput(returnObj);
	}

	public int countByD_S(java.util.Date startDate, int status)
		throws com.liferay.portal.kernel.exception.SystemException {
		Object returnObj = null;

		MethodHandler methodHandler = new MethodHandler(_countByD_SMethodKey11,
				startDate, status);

		try {
			returnObj = _classLoaderProxy.invoke(methodHandler);
		}
		catch (Throwable t) {
			if (t instanceof com.liferay.portal.kernel.exception.SystemException) {
				throw (com.liferay.portal.kernel.exception.SystemException)t;
			}

			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}

		return ((Integer)returnObj).intValue();
	}

	public com.vportal.portlet.vcalendar.model.VCal findById(long calId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vcalendar.NoSuchVCalException {
		Object returnObj = null;

		MethodHandler methodHandler = new MethodHandler(_findByIdMethodKey12,
				calId);

		try {
			returnObj = _classLoaderProxy.invoke(methodHandler);
		}
		catch (Throwable t) {
			if (t instanceof com.liferay.portal.kernel.exception.SystemException) {
				throw (com.liferay.portal.kernel.exception.SystemException)t;
			}

			if (t instanceof com.vportal.portlet.vcalendar.NoSuchVCalException) {
				throw (com.vportal.portlet.vcalendar.NoSuchVCalException)t;
			}

			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}

		return (com.vportal.portlet.vcalendar.model.VCal)ClpSerializer.translateOutput(returnObj);
	}

	public java.util.List findByUser(long calId, java.util.Date startDate,
		long groupId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vcalendar.NoSuchVCalException {
		Object returnObj = null;

		MethodHandler methodHandler = new MethodHandler(_findByUserMethodKey13,
				calId, startDate, groupId);

		try {
			returnObj = _classLoaderProxy.invoke(methodHandler);
		}
		catch (Throwable t) {
			if (t instanceof com.liferay.portal.kernel.exception.SystemException) {
				throw (com.liferay.portal.kernel.exception.SystemException)t;
			}

			if (t instanceof com.vportal.portlet.vcalendar.NoSuchVCalException) {
				throw (com.vportal.portlet.vcalendar.NoSuchVCalException)t;
			}

			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}

		return (java.util.List)ClpSerializer.translateOutput(returnObj);
	}

	public java.util.List findByUserGroup(long groupId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vcalendar.NoSuchVCalException {
		Object returnObj = null;

		MethodHandler methodHandler = new MethodHandler(_findByUserGroupMethodKey14,
				groupId);

		try {
			returnObj = _classLoaderProxy.invoke(methodHandler);
		}
		catch (Throwable t) {
			if (t instanceof com.liferay.portal.kernel.exception.SystemException) {
				throw (com.liferay.portal.kernel.exception.SystemException)t;
			}

			if (t instanceof com.vportal.portlet.vcalendar.NoSuchVCalException) {
				throw (com.vportal.portlet.vcalendar.NoSuchVCalException)t;
			}

			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}

		return (java.util.List)ClpSerializer.translateOutput(returnObj);
	}

	public java.util.List findByGroupOrg()
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vcalendar.NoSuchVCalException {
		Object returnObj = null;

		MethodHandler methodHandler = new MethodHandler(_findByGroupOrgMethodKey15);

		try {
			returnObj = _classLoaderProxy.invoke(methodHandler);
		}
		catch (Throwable t) {
			if (t instanceof com.liferay.portal.kernel.exception.SystemException) {
				throw (com.liferay.portal.kernel.exception.SystemException)t;
			}

			if (t instanceof com.vportal.portlet.vcalendar.NoSuchVCalException) {
				throw (com.vportal.portlet.vcalendar.NoSuchVCalException)t;
			}

			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}

		return (java.util.List)ClpSerializer.translateOutput(returnObj);
	}

	public java.util.List findByF_D_G_T(long userId, java.util.Date startDate,
		long groupId, int status)
		throws com.liferay.portal.kernel.exception.SystemException {
		Object returnObj = null;

		MethodHandler methodHandler = new MethodHandler(_findByF_D_G_TMethodKey16,
				userId, startDate, groupId, status);

		try {
			returnObj = _classLoaderProxy.invoke(methodHandler);
		}
		catch (Throwable t) {
			if (t instanceof com.liferay.portal.kernel.exception.SystemException) {
				throw (com.liferay.portal.kernel.exception.SystemException)t;
			}

			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}

		return (java.util.List)ClpSerializer.translateOutput(returnObj);
	}

	public java.util.List findByF(long fileId)
		throws com.liferay.portal.kernel.exception.SystemException {
		Object returnObj = null;

		MethodHandler methodHandler = new MethodHandler(_findByFMethodKey17,
				fileId);

		try {
			returnObj = _classLoaderProxy.invoke(methodHandler);
		}
		catch (Throwable t) {
			if (t instanceof com.liferay.portal.kernel.exception.SystemException) {
				throw (com.liferay.portal.kernel.exception.SystemException)t;
			}

			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}

		return (java.util.List)ClpSerializer.translateOutput(returnObj);
	}

	public ClassLoaderProxy getClassLoaderProxy() {
		return _classLoaderProxy;
	}

	private ClassLoaderProxy _classLoaderProxy;
	private MethodKey _addvCalMethodKey0 = new MethodKey(_classLoaderProxy.getClassName(),
			"addvCal", long.class, long.class, long.class,
			java.lang.String.class, java.util.Date.class, java.util.Date.class,
			java.lang.String.class, java.lang.String.class,
			java.lang.String.class, java.util.Date.class, java.util.Date.class,
			int.class, long.class, java.lang.String.class,
			java.lang.String.class, java.lang.String.class);
	private MethodKey _updatevCalMethodKey1 = new MethodKey(_classLoaderProxy.getClassName(),
			"updatevCal", long.class, long.class, long.class, long.class,
			java.lang.String.class, java.util.Date.class, java.util.Date.class,
			java.lang.String.class, java.lang.String.class,
			java.lang.String.class, int.class, long.class,
			java.lang.String.class, java.lang.String.class,
			java.lang.String.class);
	private MethodKey _deletevCalMethodKey2 = new MethodKey(_classLoaderProxy.getClassName(),
			"deletevCal", long.class);
	private MethodKey _findByD_S_GMethodKey3 = new MethodKey(_classLoaderProxy.getClassName(),
			"findByD_S_G", java.util.Date.class, int.class, long.class);
	private MethodKey _findByD_S_GMethodKey4 = new MethodKey(_classLoaderProxy.getClassName(),
			"findByD_S_G", java.util.Date.class, int.class, long.class,
			int.class, int.class);
	private MethodKey _countByD_S_GMethodKey5 = new MethodKey(_classLoaderProxy.getClassName(),
			"countByD_S_G", java.util.Date.class, int.class, long.class);
	private MethodKey _findByU_D_SMethodKey6 = new MethodKey(_classLoaderProxy.getClassName(),
			"findByU_D_S", long.class, int.class, java.util.Date.class);
	private MethodKey _findByU_D_SMethodKey7 = new MethodKey(_classLoaderProxy.getClassName(),
			"findByU_D_S", long.class, java.util.Date.class, int.class,
			int.class, int.class);
	private MethodKey _countByU_D_SMethodKey8 = new MethodKey(_classLoaderProxy.getClassName(),
			"countByU_D_S", long.class, java.util.Date.class, int.class);
	private MethodKey _findByD_SMethodKey9 = new MethodKey(_classLoaderProxy.getClassName(),
			"findByD_S", java.util.Date.class, int.class);
	private MethodKey _findByD_SMethodKey10 = new MethodKey(_classLoaderProxy.getClassName(),
			"findByD_S", java.util.Date.class, int.class, int.class, int.class);
	private MethodKey _countByD_SMethodKey11 = new MethodKey(_classLoaderProxy.getClassName(),
			"countByD_S", java.util.Date.class, int.class);
	private MethodKey _findByIdMethodKey12 = new MethodKey(_classLoaderProxy.getClassName(),
			"findById", long.class);
	private MethodKey _findByUserMethodKey13 = new MethodKey(_classLoaderProxy.getClassName(),
			"findByUser", long.class, java.util.Date.class, long.class);
	private MethodKey _findByUserGroupMethodKey14 = new MethodKey(_classLoaderProxy.getClassName(),
			"findByUserGroup", long.class);
	private MethodKey _findByGroupOrgMethodKey15 = new MethodKey(_classLoaderProxy.getClassName(),
			"findByGroupOrg");
	private MethodKey _findByF_D_G_TMethodKey16 = new MethodKey(_classLoaderProxy.getClassName(),
			"findByF_D_G_T", long.class, java.util.Date.class, long.class,
			int.class);
	private MethodKey _findByFMethodKey17 = new MethodKey(_classLoaderProxy.getClassName(),
			"findByF", long.class);
}