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
public class VFileServiceClp implements VFileService {
	public VFileServiceClp(ClassLoaderProxy classLoaderProxy) {
		_classLoaderProxy = classLoaderProxy;
	}

	public com.vportal.portlet.vcalendar.model.VFile addVFile(
		java.lang.String fullname, java.lang.String phone,
		java.lang.String address, java.lang.String position,
		java.util.Date birthday, int status)
		throws com.liferay.portal.kernel.exception.SystemException {
		Object returnObj = null;

		MethodHandler methodHandler = new MethodHandler(_addVFileMethodKey0,
				fullname, phone, address, position, birthday, status);

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

		return (com.vportal.portlet.vcalendar.model.VFile)ClpSerializer.translateOutput(returnObj);
	}

	public com.vportal.portlet.vcalendar.model.VFile updateVFile(long fileId,
		java.lang.String fullname, java.lang.String phone,
		java.lang.String address, java.lang.String position,
		java.util.Date birthday, int status)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vcalendar.NoSuchVFileException {
		Object returnObj = null;

		MethodHandler methodHandler = new MethodHandler(_updateVFileMethodKey1,
				fileId, fullname, phone, address, position, birthday, status);

		try {
			returnObj = _classLoaderProxy.invoke(methodHandler);
		}
		catch (Throwable t) {
			if (t instanceof com.liferay.portal.kernel.exception.SystemException) {
				throw (com.liferay.portal.kernel.exception.SystemException)t;
			}

			if (t instanceof com.vportal.portlet.vcalendar.NoSuchVFileException) {
				throw (com.vportal.portlet.vcalendar.NoSuchVFileException)t;
			}

			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}

		return (com.vportal.portlet.vcalendar.model.VFile)ClpSerializer.translateOutput(returnObj);
	}

	public com.vportal.portlet.vcalendar.model.VFile deleteVFile(long fileId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vcalendar.NoSuchVFileException {
		Object returnObj = null;

		MethodHandler methodHandler = new MethodHandler(_deleteVFileMethodKey2,
				fileId);

		try {
			returnObj = _classLoaderProxy.invoke(methodHandler);
		}
		catch (Throwable t) {
			if (t instanceof com.liferay.portal.kernel.exception.SystemException) {
				throw (com.liferay.portal.kernel.exception.SystemException)t;
			}

			if (t instanceof com.vportal.portlet.vcalendar.NoSuchVFileException) {
				throw (com.vportal.portlet.vcalendar.NoSuchVFileException)t;
			}

			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}

		return (com.vportal.portlet.vcalendar.model.VFile)ClpSerializer.translateOutput(returnObj);
	}

	public com.vportal.portlet.vcalendar.model.VFile findById(long fileId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vcalendar.NoSuchVFileException {
		Object returnObj = null;

		MethodHandler methodHandler = new MethodHandler(_findByIdMethodKey3,
				fileId);

		try {
			returnObj = _classLoaderProxy.invoke(methodHandler);
		}
		catch (Throwable t) {
			if (t instanceof com.liferay.portal.kernel.exception.SystemException) {
				throw (com.liferay.portal.kernel.exception.SystemException)t;
			}

			if (t instanceof com.vportal.portlet.vcalendar.NoSuchVFileException) {
				throw (com.vportal.portlet.vcalendar.NoSuchVFileException)t;
			}

			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}

		return (com.vportal.portlet.vcalendar.model.VFile)ClpSerializer.translateOutput(returnObj);
	}

	public java.util.List findByAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		Object returnObj = null;

		MethodHandler methodHandler = new MethodHandler(_findByAllMethodKey4);

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

	public java.util.List findByAll(int begin, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		Object returnObj = null;

		MethodHandler methodHandler = new MethodHandler(_findByAllMethodKey5,
				begin, end);

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

	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		Object returnObj = null;

		MethodHandler methodHandler = new MethodHandler(_countAllMethodKey6);

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

	public java.util.List findByGroupId(int status)
		throws com.liferay.portal.kernel.exception.SystemException {
		Object returnObj = null;

		MethodHandler methodHandler = new MethodHandler(_findByGroupIdMethodKey7,
				status);

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

	public java.util.List findByGroupId(int status, int begin, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		Object returnObj = null;

		MethodHandler methodHandler = new MethodHandler(_findByGroupIdMethodKey8,
				status, begin, end);

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

	public int countByGroupId(int status)
		throws com.liferay.portal.kernel.exception.SystemException {
		Object returnObj = null;

		MethodHandler methodHandler = new MethodHandler(_countByGroupIdMethodKey9,
				status);

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

	public ClassLoaderProxy getClassLoaderProxy() {
		return _classLoaderProxy;
	}

	private ClassLoaderProxy _classLoaderProxy;
	private MethodKey _addVFileMethodKey0 = new MethodKey(_classLoaderProxy.getClassName(),
			"addVFile", java.lang.String.class, java.lang.String.class,
			java.lang.String.class, java.lang.String.class,
			java.util.Date.class, int.class);
	private MethodKey _updateVFileMethodKey1 = new MethodKey(_classLoaderProxy.getClassName(),
			"updateVFile", long.class, java.lang.String.class,
			java.lang.String.class, java.lang.String.class,
			java.lang.String.class, java.util.Date.class, int.class);
	private MethodKey _deleteVFileMethodKey2 = new MethodKey(_classLoaderProxy.getClassName(),
			"deleteVFile", long.class);
	private MethodKey _findByIdMethodKey3 = new MethodKey(_classLoaderProxy.getClassName(),
			"findById", long.class);
	private MethodKey _findByAllMethodKey4 = new MethodKey(_classLoaderProxy.getClassName(),
			"findByAll");
	private MethodKey _findByAllMethodKey5 = new MethodKey(_classLoaderProxy.getClassName(),
			"findByAll", int.class, int.class);
	private MethodKey _countAllMethodKey6 = new MethodKey(_classLoaderProxy.getClassName(),
			"countAll");
	private MethodKey _findByGroupIdMethodKey7 = new MethodKey(_classLoaderProxy.getClassName(),
			"findByGroupId", int.class);
	private MethodKey _findByGroupIdMethodKey8 = new MethodKey(_classLoaderProxy.getClassName(),
			"findByGroupId", int.class, int.class, int.class);
	private MethodKey _countByGroupIdMethodKey9 = new MethodKey(_classLoaderProxy.getClassName(),
			"countByGroupId", int.class);
}