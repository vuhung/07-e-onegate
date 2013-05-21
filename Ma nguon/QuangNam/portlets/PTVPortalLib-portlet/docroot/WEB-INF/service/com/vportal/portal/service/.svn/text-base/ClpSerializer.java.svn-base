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

package com.vportal.portal.service;

import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.model.BaseModel;

import com.vportal.portal.model.AccessCounterClp;
import com.vportal.portal.model.AttachmentClp;
import com.vportal.portal.model.PortletFolderClp;

import java.lang.reflect.Method;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @author Brian Wing Shun Chan
 */
public class ClpSerializer {
	public static final String SERVLET_CONTEXT_NAME = "PTVPortalLib-portlet";

	public static void setClassLoader(ClassLoader classLoader) {
		_classLoader = classLoader;
	}

	public static Object translateInput(BaseModel<?> oldModel) {
		Class<?> oldModelClass = oldModel.getClass();

		String oldModelClassName = oldModelClass.getName();

		if (oldModelClassName.equals(AttachmentClp.class.getName())) {
			AttachmentClp oldCplModel = (AttachmentClp)oldModel;

			ClassLoader contextClassLoader = Thread.currentThread()
												   .getContextClassLoader();

			try {
				Thread.currentThread().setContextClassLoader(_classLoader);

				try {
					Class<?> newModelClass = Class.forName("com.vportal.portal.model.impl.AttachmentImpl",
							true, _classLoader);

					Object newModel = newModelClass.newInstance();

					Method method0 = newModelClass.getMethod("setAttachmentId",
							new Class[] { Long.TYPE });

					Long value0 = new Long(oldCplModel.getAttachmentId());

					method0.invoke(newModel, value0);

					Method method1 = newModelClass.getMethod("setGroupId",
							new Class[] { Long.TYPE });

					Long value1 = new Long(oldCplModel.getGroupId());

					method1.invoke(newModel, value1);

					Method method2 = newModelClass.getMethod("setCompanyId",
							new Class[] { Long.TYPE });

					Long value2 = new Long(oldCplModel.getCompanyId());

					method2.invoke(newModel, value2);

					Method method3 = newModelClass.getMethod("setEntryId",
							new Class[] { Long.TYPE });

					Long value3 = new Long(oldCplModel.getEntryId());

					method3.invoke(newModel, value3);

					Method method4 = newModelClass.getMethod("setEntryClass",
							new Class[] { String.class });

					String value4 = oldCplModel.getEntryClass();

					method4.invoke(newModel, value4);

					Method method5 = newModelClass.getMethod("setFileEntryId",
							new Class[] { Long.TYPE });

					Long value5 = new Long(oldCplModel.getFileEntryId());

					method5.invoke(newModel, value5);

					Method method6 = newModelClass.getMethod("setFolderId",
							new Class[] { Long.TYPE });

					Long value6 = new Long(oldCplModel.getFolderId());

					method6.invoke(newModel, value6);

					Method method7 = newModelClass.getMethod("setFileName",
							new Class[] { String.class });

					String value7 = oldCplModel.getFileName();

					method7.invoke(newModel, value7);

					Method method8 = newModelClass.getMethod("setImageId",
							new Class[] { Long.TYPE });

					Long value8 = new Long(oldCplModel.getImageId());

					method8.invoke(newModel, value8);

					Method method9 = newModelClass.getMethod("setExtension",
							new Class[] { String.class });

					String value9 = oldCplModel.getExtension();

					method9.invoke(newModel, value9);

					return newModel;
				}
				catch (Exception e) {
					_log.error(e, e);
				}
			}
			finally {
				Thread.currentThread().setContextClassLoader(contextClassLoader);
			}
		}

		if (oldModelClassName.equals(AccessCounterClp.class.getName())) {
			AccessCounterClp oldCplModel = (AccessCounterClp)oldModel;

			ClassLoader contextClassLoader = Thread.currentThread()
												   .getContextClassLoader();

			try {
				Thread.currentThread().setContextClassLoader(_classLoader);

				try {
					Class<?> newModelClass = Class.forName("com.vportal.portal.model.impl.AccessCounterImpl",
							true, _classLoader);

					Object newModel = newModelClass.newInstance();

					Method method0 = newModelClass.getMethod("setId",
							new Class[] { Long.TYPE });

					Long value0 = new Long(oldCplModel.getId());

					method0.invoke(newModel, value0);

					Method method1 = newModelClass.getMethod("setCompanyId",
							new Class[] { Long.TYPE });

					Long value1 = new Long(oldCplModel.getCompanyId());

					method1.invoke(newModel, value1);

					Method method2 = newModelClass.getMethod("setAccessDate",
							new Class[] { Date.class });

					Date value2 = oldCplModel.getAccessDate();

					method2.invoke(newModel, value2);

					Method method3 = newModelClass.getMethod("setAccessCount",
							new Class[] { Integer.TYPE });

					Integer value3 = new Integer(oldCplModel.getAccessCount());

					method3.invoke(newModel, value3);

					return newModel;
				}
				catch (Exception e) {
					_log.error(e, e);
				}
			}
			finally {
				Thread.currentThread().setContextClassLoader(contextClassLoader);
			}
		}

		if (oldModelClassName.equals(PortletFolderClp.class.getName())) {
			PortletFolderClp oldCplModel = (PortletFolderClp)oldModel;

			ClassLoader contextClassLoader = Thread.currentThread()
												   .getContextClassLoader();

			try {
				Thread.currentThread().setContextClassLoader(_classLoader);

				try {
					Class<?> newModelClass = Class.forName("com.vportal.portal.model.impl.PortletFolderImpl",
							true, _classLoader);

					Object newModel = newModelClass.newInstance();

					Method method0 = newModelClass.getMethod("setId",
							new Class[] { Long.TYPE });

					Long value0 = new Long(oldCplModel.getId());

					method0.invoke(newModel, value0);

					Method method1 = newModelClass.getMethod("setPortletId",
							new Class[] { String.class });

					String value1 = oldCplModel.getPortletId();

					method1.invoke(newModel, value1);

					Method method2 = newModelClass.getMethod("setFolderId",
							new Class[] { Long.TYPE });

					Long value2 = new Long(oldCplModel.getFolderId());

					method2.invoke(newModel, value2);

					Method method3 = newModelClass.getMethod("setDescription",
							new Class[] { String.class });

					String value3 = oldCplModel.getDescription();

					method3.invoke(newModel, value3);

					return newModel;
				}
				catch (Exception e) {
					_log.error(e, e);
				}
			}
			finally {
				Thread.currentThread().setContextClassLoader(contextClassLoader);
			}
		}

		return oldModel;
	}

	public static Object translateInput(List<Object> oldList) {
		List<Object> newList = new ArrayList<Object>(oldList.size());

		for (int i = 0; i < oldList.size(); i++) {
			Object curObj = oldList.get(i);

			newList.add(translateInput(curObj));
		}

		return newList;
	}

	public static Object translateInput(Object obj) {
		if (obj instanceof BaseModel<?>) {
			return translateInput((BaseModel<?>)obj);
		}
		else if (obj instanceof List<?>) {
			return translateInput((List<Object>)obj);
		}
		else {
			return obj;
		}
	}

	public static Object translateOutput(BaseModel<?> oldModel) {
		Class<?> oldModelClass = oldModel.getClass();

		String oldModelClassName = oldModelClass.getName();

		if (oldModelClassName.equals(
					"com.vportal.portal.model.impl.AttachmentImpl")) {
			ClassLoader contextClassLoader = Thread.currentThread()
												   .getContextClassLoader();

			try {
				Thread.currentThread().setContextClassLoader(_classLoader);

				try {
					AttachmentClp newModel = new AttachmentClp();

					Method method0 = oldModelClass.getMethod("getAttachmentId");

					Long value0 = (Long)method0.invoke(oldModel, (Object[])null);

					newModel.setAttachmentId(value0);

					Method method1 = oldModelClass.getMethod("getGroupId");

					Long value1 = (Long)method1.invoke(oldModel, (Object[])null);

					newModel.setGroupId(value1);

					Method method2 = oldModelClass.getMethod("getCompanyId");

					Long value2 = (Long)method2.invoke(oldModel, (Object[])null);

					newModel.setCompanyId(value2);

					Method method3 = oldModelClass.getMethod("getEntryId");

					Long value3 = (Long)method3.invoke(oldModel, (Object[])null);

					newModel.setEntryId(value3);

					Method method4 = oldModelClass.getMethod("getEntryClass");

					String value4 = (String)method4.invoke(oldModel,
							(Object[])null);

					newModel.setEntryClass(value4);

					Method method5 = oldModelClass.getMethod("getFileEntryId");

					Long value5 = (Long)method5.invoke(oldModel, (Object[])null);

					newModel.setFileEntryId(value5);

					Method method6 = oldModelClass.getMethod("getFolderId");

					Long value6 = (Long)method6.invoke(oldModel, (Object[])null);

					newModel.setFolderId(value6);

					Method method7 = oldModelClass.getMethod("getFileName");

					String value7 = (String)method7.invoke(oldModel,
							(Object[])null);

					newModel.setFileName(value7);

					Method method8 = oldModelClass.getMethod("getImageId");

					Long value8 = (Long)method8.invoke(oldModel, (Object[])null);

					newModel.setImageId(value8);

					Method method9 = oldModelClass.getMethod("getExtension");

					String value9 = (String)method9.invoke(oldModel,
							(Object[])null);

					newModel.setExtension(value9);

					return newModel;
				}
				catch (Exception e) {
					_log.error(e, e);
				}
			}
			finally {
				Thread.currentThread().setContextClassLoader(contextClassLoader);
			}
		}

		if (oldModelClassName.equals(
					"com.vportal.portal.model.impl.AccessCounterImpl")) {
			ClassLoader contextClassLoader = Thread.currentThread()
												   .getContextClassLoader();

			try {
				Thread.currentThread().setContextClassLoader(_classLoader);

				try {
					AccessCounterClp newModel = new AccessCounterClp();

					Method method0 = oldModelClass.getMethod("getId");

					Long value0 = (Long)method0.invoke(oldModel, (Object[])null);

					newModel.setId(value0);

					Method method1 = oldModelClass.getMethod("getCompanyId");

					Long value1 = (Long)method1.invoke(oldModel, (Object[])null);

					newModel.setCompanyId(value1);

					Method method2 = oldModelClass.getMethod("getAccessDate");

					Date value2 = (Date)method2.invoke(oldModel, (Object[])null);

					newModel.setAccessDate(value2);

					Method method3 = oldModelClass.getMethod("getAccessCount");

					Integer value3 = (Integer)method3.invoke(oldModel,
							(Object[])null);

					newModel.setAccessCount(value3);

					return newModel;
				}
				catch (Exception e) {
					_log.error(e, e);
				}
			}
			finally {
				Thread.currentThread().setContextClassLoader(contextClassLoader);
			}
		}

		if (oldModelClassName.equals(
					"com.vportal.portal.model.impl.PortletFolderImpl")) {
			ClassLoader contextClassLoader = Thread.currentThread()
												   .getContextClassLoader();

			try {
				Thread.currentThread().setContextClassLoader(_classLoader);

				try {
					PortletFolderClp newModel = new PortletFolderClp();

					Method method0 = oldModelClass.getMethod("getId");

					Long value0 = (Long)method0.invoke(oldModel, (Object[])null);

					newModel.setId(value0);

					Method method1 = oldModelClass.getMethod("getPortletId");

					String value1 = (String)method1.invoke(oldModel,
							(Object[])null);

					newModel.setPortletId(value1);

					Method method2 = oldModelClass.getMethod("getFolderId");

					Long value2 = (Long)method2.invoke(oldModel, (Object[])null);

					newModel.setFolderId(value2);

					Method method3 = oldModelClass.getMethod("getDescription");

					String value3 = (String)method3.invoke(oldModel,
							(Object[])null);

					newModel.setDescription(value3);

					return newModel;
				}
				catch (Exception e) {
					_log.error(e, e);
				}
			}
			finally {
				Thread.currentThread().setContextClassLoader(contextClassLoader);
			}
		}

		return oldModel;
	}

	public static Object translateOutput(List<Object> oldList) {
		List<Object> newList = new ArrayList<Object>(oldList.size());

		for (int i = 0; i < oldList.size(); i++) {
			Object curObj = oldList.get(i);

			newList.add(translateOutput(curObj));
		}

		return newList;
	}

	public static Object translateOutput(Object obj) {
		if (obj instanceof BaseModel<?>) {
			return translateOutput((BaseModel<?>)obj);
		}
		else if (obj instanceof List<?>) {
			return translateOutput((List<Object>)obj);
		}
		else {
			return obj;
		}
	}

	private static Log _log = LogFactoryUtil.getLog(ClpSerializer.class);
	private static ClassLoader _classLoader;
}