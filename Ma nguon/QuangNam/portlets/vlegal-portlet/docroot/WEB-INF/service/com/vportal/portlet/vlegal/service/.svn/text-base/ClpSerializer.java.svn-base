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

package com.vportal.portlet.vlegal.service;

import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.model.BaseModel;

import com.vportal.portlet.vlegal.model.VLegalAttachedMessageClp;
import com.vportal.portlet.vlegal.model.VLegalDDRelClp;
import com.vportal.portlet.vlegal.model.VLegalDFRelClp;
import com.vportal.portlet.vlegal.model.VLegalDSRelClp;
import com.vportal.portlet.vlegal.model.VLegalDURelClp;
import com.vportal.portlet.vlegal.model.VLegalDocumentClp;
import com.vportal.portlet.vlegal.model.VLegalDraftDocumentClp;
import com.vportal.portlet.vlegal.model.VLegalFORelClp;
import com.vportal.portlet.vlegal.model.VLegalFTRelClp;
import com.vportal.portlet.vlegal.model.VLegalFieldClp;
import com.vportal.portlet.vlegal.model.VLegalLoggerClp;
import com.vportal.portlet.vlegal.model.VLegalOrgClp;
import com.vportal.portlet.vlegal.model.VLegalSignerClp;
import com.vportal.portlet.vlegal.model.VLegalSuggestDocumentClp;
import com.vportal.portlet.vlegal.model.VLegalTDRelClp;
import com.vportal.portlet.vlegal.model.VLegalTagsClp;
import com.vportal.portlet.vlegal.model.VLegalTypeClp;

import java.lang.reflect.Method;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @author Brian Wing Shun Chan
 */
public class ClpSerializer {
	public static final String SERVLET_CONTEXT_NAME = "vlegal-portlet";

	public static void setClassLoader(ClassLoader classLoader) {
		_classLoader = classLoader;
	}

	public static Object translateInput(BaseModel<?> oldModel) {
		Class<?> oldModelClass = oldModel.getClass();

		String oldModelClassName = oldModelClass.getName();

		if (oldModelClassName.equals(VLegalDocumentClp.class.getName())) {
			VLegalDocumentClp oldCplModel = (VLegalDocumentClp)oldModel;

			ClassLoader contextClassLoader = Thread.currentThread()
												   .getContextClassLoader();

			try {
				Thread.currentThread().setContextClassLoader(_classLoader);

				try {
					Class<?> newModelClass = Class.forName("com.vportal.portlet.vlegal.model.impl.VLegalDocumentImpl",
							true, _classLoader);

					Object newModel = newModelClass.newInstance();

					Method method0 = newModelClass.getMethod("setDocId",
							new Class[] { String.class });

					String value0 = oldCplModel.getDocId();

					method0.invoke(newModel, value0);

					Method method1 = newModelClass.getMethod("setGroupId",
							new Class[] { Long.TYPE });

					Long value1 = new Long(oldCplModel.getGroupId());

					method1.invoke(newModel, value1);

					Method method2 = newModelClass.getMethod("setCompanyId",
							new Class[] { Long.TYPE });

					Long value2 = new Long(oldCplModel.getCompanyId());

					method2.invoke(newModel, value2);

					Method method3 = newModelClass.getMethod("setUserId",
							new Class[] { Long.TYPE });

					Long value3 = new Long(oldCplModel.getUserId());

					method3.invoke(newModel, value3);

					Method method4 = newModelClass.getMethod("setCreatedByUser",
							new Class[] { Long.TYPE });

					Long value4 = new Long(oldCplModel.getCreatedByUser());

					method4.invoke(newModel, value4);

					Method method5 = newModelClass.getMethod("setCreatedDate",
							new Class[] { Date.class });

					Date value5 = oldCplModel.getCreatedDate();

					method5.invoke(newModel, value5);

					Method method6 = newModelClass.getMethod("setModifiedByUser",
							new Class[] { Long.TYPE });

					Long value6 = new Long(oldCplModel.getModifiedByUser());

					method6.invoke(newModel, value6);

					Method method7 = newModelClass.getMethod("setModifiedDate",
							new Class[] { Date.class });

					Date value7 = oldCplModel.getModifiedDate();

					method7.invoke(newModel, value7);

					Method method8 = newModelClass.getMethod("setApprovedByUser",
							new Class[] { Long.TYPE });

					Long value8 = new Long(oldCplModel.getApprovedByUser());

					method8.invoke(newModel, value8);

					Method method9 = newModelClass.getMethod("setApprovedDate",
							new Class[] { Date.class });

					Date value9 = oldCplModel.getApprovedDate();

					method9.invoke(newModel, value9);

					Method method10 = newModelClass.getMethod("setForwardedByUser",
							new Class[] { Long.TYPE });

					Long value10 = new Long(oldCplModel.getForwardedByUser());

					method10.invoke(newModel, value10);

					Method method11 = newModelClass.getMethod("setForwardedDate",
							new Class[] { Date.class });

					Date value11 = oldCplModel.getForwardedDate();

					method11.invoke(newModel, value11);

					Method method12 = newModelClass.getMethod("setPublishedByUser",
							new Class[] { Long.TYPE });

					Long value12 = new Long(oldCplModel.getPublishedByUser());

					method12.invoke(newModel, value12);

					Method method13 = newModelClass.getMethod("setPublishedDate",
							new Class[] { Date.class });

					Date value13 = oldCplModel.getPublishedDate();

					method13.invoke(newModel, value13);

					Method method14 = newModelClass.getMethod("setSymbol",
							new Class[] { String.class });

					String value14 = oldCplModel.getSymbol();

					method14.invoke(newModel, value14);

					Method method15 = newModelClass.getMethod("setNum",
							new Class[] { String.class });

					String value15 = oldCplModel.getNum();

					method15.invoke(newModel, value15);

					Method method16 = newModelClass.getMethod("setPromulDate",
							new Class[] { Date.class });

					Date value16 = oldCplModel.getPromulDate();

					method16.invoke(newModel, value16);

					Method method17 = newModelClass.getMethod("setEffectivedDate",
							new Class[] { Date.class });

					Date value17 = oldCplModel.getEffectivedDate();

					method17.invoke(newModel, value17);

					Method method18 = newModelClass.getMethod("setExpiredDate",
							new Class[] { Date.class });

					Date value18 = oldCplModel.getExpiredDate();

					method18.invoke(newModel, value18);

					Method method19 = newModelClass.getMethod("setReplaceDoc",
							new Class[] { String.class });

					String value19 = oldCplModel.getReplaceDoc();

					method19.invoke(newModel, value19);

					Method method20 = newModelClass.getMethod("setSummary",
							new Class[] { String.class });

					String value20 = oldCplModel.getSummary();

					method20.invoke(newModel, value20);

					Method method21 = newModelClass.getMethod("setContent",
							new Class[] { String.class });

					String value21 = oldCplModel.getContent();

					method21.invoke(newModel, value21);

					Method method22 = newModelClass.getMethod("setLanguage",
							new Class[] { String.class });

					String value22 = oldCplModel.getLanguage();

					method22.invoke(newModel, value22);

					Method method23 = newModelClass.getMethod("setUserHit",
							new Class[] { Integer.TYPE });

					Integer value23 = new Integer(oldCplModel.getUserHit());

					method23.invoke(newModel, value23);

					Method method24 = newModelClass.getMethod("setStatusDoc",
							new Class[] { Integer.TYPE });

					Integer value24 = new Integer(oldCplModel.getStatusDoc());

					method24.invoke(newModel, value24);

					Method method25 = newModelClass.getMethod("setHasAttachment",
							new Class[] { Boolean.TYPE });

					Boolean value25 = new Boolean(oldCplModel.getHasAttachment());

					method25.invoke(newModel, value25);

					Method method26 = newModelClass.getMethod("setTypeDocId",
							new Class[] { String.class });

					String value26 = oldCplModel.getTypeDocId();

					method26.invoke(newModel, value26);

					Method method27 = newModelClass.getMethod("setFieldId",
							new Class[] { String.class });

					String value27 = oldCplModel.getFieldId();

					method27.invoke(newModel, value27);

					Method method28 = newModelClass.getMethod("setOrgId",
							new Class[] { String.class });

					String value28 = oldCplModel.getOrgId();

					method28.invoke(newModel, value28);

					Method method29 = newModelClass.getMethod("setOrgRels",
							new Class[] { String.class });

					String value29 = oldCplModel.getOrgRels();

					method29.invoke(newModel, value29);

					Method method30 = newModelClass.getMethod("setSignerRels",
							new Class[] { String.class });

					String value30 = oldCplModel.getSignerRels();

					method30.invoke(newModel, value30);

					Method method31 = newModelClass.getMethod("setFieldRels",
							new Class[] { String.class });

					String value31 = oldCplModel.getFieldRels();

					method31.invoke(newModel, value31);

					Method method32 = newModelClass.getMethod("setNumRels",
							new Class[] { String.class });

					String value32 = oldCplModel.getNumRels();

					method32.invoke(newModel, value32);

					Method method33 = newModelClass.getMethod("setDocCode",
							new Class[] { String.class });

					String value33 = oldCplModel.getDocCode();

					method33.invoke(newModel, value33);

					Method method34 = newModelClass.getMethod("setDepartmentRels",
							new Class[] { String.class });

					String value34 = oldCplModel.getDepartmentRels();

					method34.invoke(newModel, value34);

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

		if (oldModelClassName.equals(VLegalFieldClp.class.getName())) {
			VLegalFieldClp oldCplModel = (VLegalFieldClp)oldModel;

			ClassLoader contextClassLoader = Thread.currentThread()
												   .getContextClassLoader();

			try {
				Thread.currentThread().setContextClassLoader(_classLoader);

				try {
					Class<?> newModelClass = Class.forName("com.vportal.portlet.vlegal.model.impl.VLegalFieldImpl",
							true, _classLoader);

					Object newModel = newModelClass.newInstance();

					Method method0 = newModelClass.getMethod("setFieldId",
							new Class[] { String.class });

					String value0 = oldCplModel.getFieldId();

					method0.invoke(newModel, value0);

					Method method1 = newModelClass.getMethod("setGroupId",
							new Class[] { Long.TYPE });

					Long value1 = new Long(oldCplModel.getGroupId());

					method1.invoke(newModel, value1);

					Method method2 = newModelClass.getMethod("setCompanyId",
							new Class[] { Long.TYPE });

					Long value2 = new Long(oldCplModel.getCompanyId());

					method2.invoke(newModel, value2);

					Method method3 = newModelClass.getMethod("setUserId",
							new Class[] { Long.TYPE });

					Long value3 = new Long(oldCplModel.getUserId());

					method3.invoke(newModel, value3);

					Method method4 = newModelClass.getMethod("setCreatedDate",
							new Class[] { Date.class });

					Date value4 = oldCplModel.getCreatedDate();

					method4.invoke(newModel, value4);

					Method method5 = newModelClass.getMethod("setModifiedDate",
							new Class[] { Date.class });

					Date value5 = oldCplModel.getModifiedDate();

					method5.invoke(newModel, value5);

					Method method6 = newModelClass.getMethod("setCreatedByUser",
							new Class[] { Long.TYPE });

					Long value6 = new Long(oldCplModel.getCreatedByUser());

					method6.invoke(newModel, value6);

					Method method7 = newModelClass.getMethod("setModifiedByUser",
							new Class[] { Long.TYPE });

					Long value7 = new Long(oldCplModel.getModifiedByUser());

					method7.invoke(newModel, value7);

					Method method8 = newModelClass.getMethod("setName",
							new Class[] { String.class });

					String value8 = oldCplModel.getName();

					method8.invoke(newModel, value8);

					Method method9 = newModelClass.getMethod("setDescription",
							new Class[] { String.class });

					String value9 = oldCplModel.getDescription();

					method9.invoke(newModel, value9);

					Method method10 = newModelClass.getMethod("setLanguage",
							new Class[] { String.class });

					String value10 = oldCplModel.getLanguage();

					method10.invoke(newModel, value10);

					Method method11 = newModelClass.getMethod("setStatusField",
							new Class[] { Boolean.TYPE });

					Boolean value11 = new Boolean(oldCplModel.getStatusField());

					method11.invoke(newModel, value11);

					Method method12 = newModelClass.getMethod("setRssable",
							new Class[] { Boolean.TYPE });

					Boolean value12 = new Boolean(oldCplModel.getRssable());

					method12.invoke(newModel, value12);

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

		if (oldModelClassName.equals(VLegalTypeClp.class.getName())) {
			VLegalTypeClp oldCplModel = (VLegalTypeClp)oldModel;

			ClassLoader contextClassLoader = Thread.currentThread()
												   .getContextClassLoader();

			try {
				Thread.currentThread().setContextClassLoader(_classLoader);

				try {
					Class<?> newModelClass = Class.forName("com.vportal.portlet.vlegal.model.impl.VLegalTypeImpl",
							true, _classLoader);

					Object newModel = newModelClass.newInstance();

					Method method0 = newModelClass.getMethod("setTypeId",
							new Class[] { String.class });

					String value0 = oldCplModel.getTypeId();

					method0.invoke(newModel, value0);

					Method method1 = newModelClass.getMethod("setGroupId",
							new Class[] { Long.TYPE });

					Long value1 = new Long(oldCplModel.getGroupId());

					method1.invoke(newModel, value1);

					Method method2 = newModelClass.getMethod("setCompanyId",
							new Class[] { Long.TYPE });

					Long value2 = new Long(oldCplModel.getCompanyId());

					method2.invoke(newModel, value2);

					Method method3 = newModelClass.getMethod("setUserId",
							new Class[] { Long.TYPE });

					Long value3 = new Long(oldCplModel.getUserId());

					method3.invoke(newModel, value3);

					Method method4 = newModelClass.getMethod("setCreatedDate",
							new Class[] { Date.class });

					Date value4 = oldCplModel.getCreatedDate();

					method4.invoke(newModel, value4);

					Method method5 = newModelClass.getMethod("setModifiedDate",
							new Class[] { Date.class });

					Date value5 = oldCplModel.getModifiedDate();

					method5.invoke(newModel, value5);

					Method method6 = newModelClass.getMethod("setCreatedByUser",
							new Class[] { Long.TYPE });

					Long value6 = new Long(oldCplModel.getCreatedByUser());

					method6.invoke(newModel, value6);

					Method method7 = newModelClass.getMethod("setModifiedByUser",
							new Class[] { Long.TYPE });

					Long value7 = new Long(oldCplModel.getModifiedByUser());

					method7.invoke(newModel, value7);

					Method method8 = newModelClass.getMethod("setName",
							new Class[] { String.class });

					String value8 = oldCplModel.getName();

					method8.invoke(newModel, value8);

					Method method9 = newModelClass.getMethod("setDescription",
							new Class[] { String.class });

					String value9 = oldCplModel.getDescription();

					method9.invoke(newModel, value9);

					Method method10 = newModelClass.getMethod("setLanguage",
							new Class[] { String.class });

					String value10 = oldCplModel.getLanguage();

					method10.invoke(newModel, value10);

					Method method11 = newModelClass.getMethod("setStatusType",
							new Class[] { Boolean.TYPE });

					Boolean value11 = new Boolean(oldCplModel.getStatusType());

					method11.invoke(newModel, value11);

					Method method12 = newModelClass.getMethod("setRssable",
							new Class[] { Boolean.TYPE });

					Boolean value12 = new Boolean(oldCplModel.getRssable());

					method12.invoke(newModel, value12);

					Method method13 = newModelClass.getMethod("setPosition",
							new Class[] { Integer.TYPE });

					Integer value13 = new Integer(oldCplModel.getPosition());

					method13.invoke(newModel, value13);

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

		if (oldModelClassName.equals(VLegalDraftDocumentClp.class.getName())) {
			VLegalDraftDocumentClp oldCplModel = (VLegalDraftDocumentClp)oldModel;

			ClassLoader contextClassLoader = Thread.currentThread()
												   .getContextClassLoader();

			try {
				Thread.currentThread().setContextClassLoader(_classLoader);

				try {
					Class<?> newModelClass = Class.forName("com.vportal.portlet.vlegal.model.impl.VLegalDraftDocumentImpl",
							true, _classLoader);

					Object newModel = newModelClass.newInstance();

					Method method0 = newModelClass.getMethod("setDraftId",
							new Class[] { String.class });

					String value0 = oldCplModel.getDraftId();

					method0.invoke(newModel, value0);

					Method method1 = newModelClass.getMethod("setGroupId",
							new Class[] { Long.TYPE });

					Long value1 = new Long(oldCplModel.getGroupId());

					method1.invoke(newModel, value1);

					Method method2 = newModelClass.getMethod("setCompanyId",
							new Class[] { Long.TYPE });

					Long value2 = new Long(oldCplModel.getCompanyId());

					method2.invoke(newModel, value2);

					Method method3 = newModelClass.getMethod("setUserId",
							new Class[] { Long.TYPE });

					Long value3 = new Long(oldCplModel.getUserId());

					method3.invoke(newModel, value3);

					Method method4 = newModelClass.getMethod("setCreatedByUser",
							new Class[] { Long.TYPE });

					Long value4 = new Long(oldCplModel.getCreatedByUser());

					method4.invoke(newModel, value4);

					Method method5 = newModelClass.getMethod("setCreatedDate",
							new Class[] { Date.class });

					Date value5 = oldCplModel.getCreatedDate();

					method5.invoke(newModel, value5);

					Method method6 = newModelClass.getMethod("setModifiedByUser",
							new Class[] { Long.TYPE });

					Long value6 = new Long(oldCplModel.getModifiedByUser());

					method6.invoke(newModel, value6);

					Method method7 = newModelClass.getMethod("setModifiedDate",
							new Class[] { Date.class });

					Date value7 = oldCplModel.getModifiedDate();

					method7.invoke(newModel, value7);

					Method method8 = newModelClass.getMethod("setApprovedByUser",
							new Class[] { Long.TYPE });

					Long value8 = new Long(oldCplModel.getApprovedByUser());

					method8.invoke(newModel, value8);

					Method method9 = newModelClass.getMethod("setApprovedDate",
							new Class[] { Date.class });

					Date value9 = oldCplModel.getApprovedDate();

					method9.invoke(newModel, value9);

					Method method10 = newModelClass.getMethod("setPublishedByUser",
							new Class[] { Long.TYPE });

					Long value10 = new Long(oldCplModel.getPublishedByUser());

					method10.invoke(newModel, value10);

					Method method11 = newModelClass.getMethod("setPublishedDate",
							new Class[] { Date.class });

					Date value11 = oldCplModel.getPublishedDate();

					method11.invoke(newModel, value11);

					Method method12 = newModelClass.getMethod("setTitle",
							new Class[] { String.class });

					String value12 = oldCplModel.getTitle();

					method12.invoke(newModel, value12);

					Method method13 = newModelClass.getMethod("setExpiredDate",
							new Class[] { Date.class });

					Date value13 = oldCplModel.getExpiredDate();

					method13.invoke(newModel, value13);

					Method method14 = newModelClass.getMethod("setLanguage",
							new Class[] { String.class });

					String value14 = oldCplModel.getLanguage();

					method14.invoke(newModel, value14);

					Method method15 = newModelClass.getMethod("setContent",
							new Class[] { String.class });

					String value15 = oldCplModel.getContent();

					method15.invoke(newModel, value15);

					Method method16 = newModelClass.getMethod("setTypeId",
							new Class[] { String.class });

					String value16 = oldCplModel.getTypeId();

					method16.invoke(newModel, value16);

					Method method17 = newModelClass.getMethod("setFieldId",
							new Class[] { String.class });

					String value17 = oldCplModel.getFieldId();

					method17.invoke(newModel, value17);

					Method method18 = newModelClass.getMethod("setHasAttachment",
							new Class[] { Boolean.TYPE });

					Boolean value18 = new Boolean(oldCplModel.getHasAttachment());

					method18.invoke(newModel, value18);

					Method method19 = newModelClass.getMethod("setDraftLevel",
							new Class[] { Integer.TYPE });

					Integer value19 = new Integer(oldCplModel.getDraftLevel());

					method19.invoke(newModel, value19);

					Method method20 = newModelClass.getMethod("setDocCode",
							new Class[] { String.class });

					String value20 = oldCplModel.getDocCode();

					method20.invoke(newModel, value20);

					Method method21 = newModelClass.getMethod("setStatusDraft",
							new Class[] { Integer.TYPE });

					Integer value21 = new Integer(oldCplModel.getStatusDraft());

					method21.invoke(newModel, value21);

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

		if (oldModelClassName.equals(VLegalSuggestDocumentClp.class.getName())) {
			VLegalSuggestDocumentClp oldCplModel = (VLegalSuggestDocumentClp)oldModel;

			ClassLoader contextClassLoader = Thread.currentThread()
												   .getContextClassLoader();

			try {
				Thread.currentThread().setContextClassLoader(_classLoader);

				try {
					Class<?> newModelClass = Class.forName("com.vportal.portlet.vlegal.model.impl.VLegalSuggestDocumentImpl",
							true, _classLoader);

					Object newModel = newModelClass.newInstance();

					Method method0 = newModelClass.getMethod("setSugId",
							new Class[] { String.class });

					String value0 = oldCplModel.getSugId();

					method0.invoke(newModel, value0);

					Method method1 = newModelClass.getMethod("setGroupId",
							new Class[] { Long.TYPE });

					Long value1 = new Long(oldCplModel.getGroupId());

					method1.invoke(newModel, value1);

					Method method2 = newModelClass.getMethod("setCompanyId",
							new Class[] { Long.TYPE });

					Long value2 = new Long(oldCplModel.getCompanyId());

					method2.invoke(newModel, value2);

					Method method3 = newModelClass.getMethod("setUserId",
							new Class[] { Long.TYPE });

					Long value3 = new Long(oldCplModel.getUserId());

					method3.invoke(newModel, value3);

					Method method4 = newModelClass.getMethod("setCreatedDate",
							new Class[] { Date.class });

					Date value4 = oldCplModel.getCreatedDate();

					method4.invoke(newModel, value4);

					Method method5 = newModelClass.getMethod("setModifiedDate",
							new Class[] { Date.class });

					Date value5 = oldCplModel.getModifiedDate();

					method5.invoke(newModel, value5);

					Method method6 = newModelClass.getMethod("setModifiedByUser",
							new Class[] { Long.TYPE });

					Long value6 = new Long(oldCplModel.getModifiedByUser());

					method6.invoke(newModel, value6);

					Method method7 = newModelClass.getMethod("setApproved",
							new Class[] { Boolean.TYPE });

					Boolean value7 = new Boolean(oldCplModel.getApproved());

					method7.invoke(newModel, value7);

					Method method8 = newModelClass.getMethod("setApprovedByUser",
							new Class[] { Long.TYPE });

					Long value8 = new Long(oldCplModel.getApprovedByUser());

					method8.invoke(newModel, value8);

					Method method9 = newModelClass.getMethod("setApprovedDate",
							new Class[] { Date.class });

					Date value9 = oldCplModel.getApprovedDate();

					method9.invoke(newModel, value9);

					Method method10 = newModelClass.getMethod("setTitle",
							new Class[] { String.class });

					String value10 = oldCplModel.getTitle();

					method10.invoke(newModel, value10);

					Method method11 = newModelClass.getMethod("setContent",
							new Class[] { String.class });

					String value11 = oldCplModel.getContent();

					method11.invoke(newModel, value11);

					Method method12 = newModelClass.getMethod("setLanguage",
							new Class[] { String.class });

					String value12 = oldCplModel.getLanguage();

					method12.invoke(newModel, value12);

					Method method13 = newModelClass.getMethod("setVisitorName",
							new Class[] { String.class });

					String value13 = oldCplModel.getVisitorName();

					method13.invoke(newModel, value13);

					Method method14 = newModelClass.getMethod("setVisitorEmail",
							new Class[] { String.class });

					String value14 = oldCplModel.getVisitorEmail();

					method14.invoke(newModel, value14);

					Method method15 = newModelClass.getMethod("setVisitorTel",
							new Class[] { String.class });

					String value15 = oldCplModel.getVisitorTel();

					method15.invoke(newModel, value15);

					Method method16 = newModelClass.getMethod("setVisitorAddress",
							new Class[] { String.class });

					String value16 = oldCplModel.getVisitorAddress();

					method16.invoke(newModel, value16);

					Method method17 = newModelClass.getMethod("setDraftId",
							new Class[] { String.class });

					String value17 = oldCplModel.getDraftId();

					method17.invoke(newModel, value17);

					Method method18 = newModelClass.getMethod("setHasAttachment",
							new Class[] { Boolean.TYPE });

					Boolean value18 = new Boolean(oldCplModel.getHasAttachment());

					method18.invoke(newModel, value18);

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

		if (oldModelClassName.equals(VLegalAttachedMessageClp.class.getName())) {
			VLegalAttachedMessageClp oldCplModel = (VLegalAttachedMessageClp)oldModel;

			ClassLoader contextClassLoader = Thread.currentThread()
												   .getContextClassLoader();

			try {
				Thread.currentThread().setContextClassLoader(_classLoader);

				try {
					Class<?> newModelClass = Class.forName("com.vportal.portlet.vlegal.model.impl.VLegalAttachedMessageImpl",
							true, _classLoader);

					Object newModel = newModelClass.newInstance();

					Method method0 = newModelClass.getMethod("setMessageId",
							new Class[] { String.class });

					String value0 = oldCplModel.getMessageId();

					method0.invoke(newModel, value0);

					Method method1 = newModelClass.getMethod("setGroupId",
							new Class[] { Long.TYPE });

					Long value1 = new Long(oldCplModel.getGroupId());

					method1.invoke(newModel, value1);

					Method method2 = newModelClass.getMethod("setCompanyId",
							new Class[] { Long.TYPE });

					Long value2 = new Long(oldCplModel.getCompanyId());

					method2.invoke(newModel, value2);

					Method method3 = newModelClass.getMethod("setUserId",
							new Class[] { Long.TYPE });

					Long value3 = new Long(oldCplModel.getUserId());

					method3.invoke(newModel, value3);

					Method method4 = newModelClass.getMethod("setCreatedDate",
							new Class[] { Date.class });

					Date value4 = oldCplModel.getCreatedDate();

					method4.invoke(newModel, value4);

					Method method5 = newModelClass.getMethod("setCreatedByUser",
							new Class[] { Long.TYPE });

					Long value5 = new Long(oldCplModel.getCreatedByUser());

					method5.invoke(newModel, value5);

					Method method6 = newModelClass.getMethod("setArticleId",
							new Class[] { String.class });

					String value6 = oldCplModel.getArticleId();

					method6.invoke(newModel, value6);

					Method method7 = newModelClass.getMethod("setContent",
							new Class[] { String.class });

					String value7 = oldCplModel.getContent();

					method7.invoke(newModel, value7);

					Method method8 = newModelClass.getMethod("setReadMessage",
							new Class[] { Boolean.TYPE });

					Boolean value8 = new Boolean(oldCplModel.getReadMessage());

					method8.invoke(newModel, value8);

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

		if (oldModelClassName.equals(VLegalOrgClp.class.getName())) {
			VLegalOrgClp oldCplModel = (VLegalOrgClp)oldModel;

			ClassLoader contextClassLoader = Thread.currentThread()
												   .getContextClassLoader();

			try {
				Thread.currentThread().setContextClassLoader(_classLoader);

				try {
					Class<?> newModelClass = Class.forName("com.vportal.portlet.vlegal.model.impl.VLegalOrgImpl",
							true, _classLoader);

					Object newModel = newModelClass.newInstance();

					Method method0 = newModelClass.getMethod("setOrgId",
							new Class[] { String.class });

					String value0 = oldCplModel.getOrgId();

					method0.invoke(newModel, value0);

					Method method1 = newModelClass.getMethod("setGroupId",
							new Class[] { Long.TYPE });

					Long value1 = new Long(oldCplModel.getGroupId());

					method1.invoke(newModel, value1);

					Method method2 = newModelClass.getMethod("setCompanyId",
							new Class[] { Long.TYPE });

					Long value2 = new Long(oldCplModel.getCompanyId());

					method2.invoke(newModel, value2);

					Method method3 = newModelClass.getMethod("setUserId",
							new Class[] { Long.TYPE });

					Long value3 = new Long(oldCplModel.getUserId());

					method3.invoke(newModel, value3);

					Method method4 = newModelClass.getMethod("setCreatedDate",
							new Class[] { Date.class });

					Date value4 = oldCplModel.getCreatedDate();

					method4.invoke(newModel, value4);

					Method method5 = newModelClass.getMethod("setModifiedDate",
							new Class[] { Date.class });

					Date value5 = oldCplModel.getModifiedDate();

					method5.invoke(newModel, value5);

					Method method6 = newModelClass.getMethod("setCreatedByUser",
							new Class[] { Long.TYPE });

					Long value6 = new Long(oldCplModel.getCreatedByUser());

					method6.invoke(newModel, value6);

					Method method7 = newModelClass.getMethod("setModifiedByUser",
							new Class[] { Long.TYPE });

					Long value7 = new Long(oldCplModel.getModifiedByUser());

					method7.invoke(newModel, value7);

					Method method8 = newModelClass.getMethod("setName",
							new Class[] { String.class });

					String value8 = oldCplModel.getName();

					method8.invoke(newModel, value8);

					Method method9 = newModelClass.getMethod("setDescription",
							new Class[] { String.class });

					String value9 = oldCplModel.getDescription();

					method9.invoke(newModel, value9);

					Method method10 = newModelClass.getMethod("setParentId",
							new Class[] { String.class });

					String value10 = oldCplModel.getParentId();

					method10.invoke(newModel, value10);

					Method method11 = newModelClass.getMethod("setLanguage",
							new Class[] { String.class });

					String value11 = oldCplModel.getLanguage();

					method11.invoke(newModel, value11);

					Method method12 = newModelClass.getMethod("setStatusOrg",
							new Class[] { Boolean.TYPE });

					Boolean value12 = new Boolean(oldCplModel.getStatusOrg());

					method12.invoke(newModel, value12);

					Method method13 = newModelClass.getMethod("setRssable",
							new Class[] { Boolean.TYPE });

					Boolean value13 = new Boolean(oldCplModel.getRssable());

					method13.invoke(newModel, value13);

					Method method14 = newModelClass.getMethod("setPosition",
							new Class[] { Integer.TYPE });

					Integer value14 = new Integer(oldCplModel.getPosition());

					method14.invoke(newModel, value14);

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

		if (oldModelClassName.equals(VLegalSignerClp.class.getName())) {
			VLegalSignerClp oldCplModel = (VLegalSignerClp)oldModel;

			ClassLoader contextClassLoader = Thread.currentThread()
												   .getContextClassLoader();

			try {
				Thread.currentThread().setContextClassLoader(_classLoader);

				try {
					Class<?> newModelClass = Class.forName("com.vportal.portlet.vlegal.model.impl.VLegalSignerImpl",
							true, _classLoader);

					Object newModel = newModelClass.newInstance();

					Method method0 = newModelClass.getMethod("setSigId",
							new Class[] { String.class });

					String value0 = oldCplModel.getSigId();

					method0.invoke(newModel, value0);

					Method method1 = newModelClass.getMethod("setGroupId",
							new Class[] { Long.TYPE });

					Long value1 = new Long(oldCplModel.getGroupId());

					method1.invoke(newModel, value1);

					Method method2 = newModelClass.getMethod("setCompanyId",
							new Class[] { Long.TYPE });

					Long value2 = new Long(oldCplModel.getCompanyId());

					method2.invoke(newModel, value2);

					Method method3 = newModelClass.getMethod("setUserId",
							new Class[] { Long.TYPE });

					Long value3 = new Long(oldCplModel.getUserId());

					method3.invoke(newModel, value3);

					Method method4 = newModelClass.getMethod("setCreatedDate",
							new Class[] { Date.class });

					Date value4 = oldCplModel.getCreatedDate();

					method4.invoke(newModel, value4);

					Method method5 = newModelClass.getMethod("setModifiedDate",
							new Class[] { Date.class });

					Date value5 = oldCplModel.getModifiedDate();

					method5.invoke(newModel, value5);

					Method method6 = newModelClass.getMethod("setCreatedByUser",
							new Class[] { Long.TYPE });

					Long value6 = new Long(oldCplModel.getCreatedByUser());

					method6.invoke(newModel, value6);

					Method method7 = newModelClass.getMethod("setModifiedByUser",
							new Class[] { Long.TYPE });

					Long value7 = new Long(oldCplModel.getModifiedByUser());

					method7.invoke(newModel, value7);

					Method method8 = newModelClass.getMethod("setFirstName",
							new Class[] { String.class });

					String value8 = oldCplModel.getFirstName();

					method8.invoke(newModel, value8);

					Method method9 = newModelClass.getMethod("setLastName",
							new Class[] { String.class });

					String value9 = oldCplModel.getLastName();

					method9.invoke(newModel, value9);

					Method method10 = newModelClass.getMethod("setLanguage",
							new Class[] { String.class });

					String value10 = oldCplModel.getLanguage();

					method10.invoke(newModel, value10);

					Method method11 = newModelClass.getMethod("setStatusSigner",
							new Class[] { Boolean.TYPE });

					Boolean value11 = new Boolean(oldCplModel.getStatusSigner());

					method11.invoke(newModel, value11);

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

		if (oldModelClassName.equals(VLegalTagsClp.class.getName())) {
			VLegalTagsClp oldCplModel = (VLegalTagsClp)oldModel;

			ClassLoader contextClassLoader = Thread.currentThread()
												   .getContextClassLoader();

			try {
				Thread.currentThread().setContextClassLoader(_classLoader);

				try {
					Class<?> newModelClass = Class.forName("com.vportal.portlet.vlegal.model.impl.VLegalTagsImpl",
							true, _classLoader);

					Object newModel = newModelClass.newInstance();

					Method method0 = newModelClass.getMethod("setTagId",
							new Class[] { String.class });

					String value0 = oldCplModel.getTagId();

					method0.invoke(newModel, value0);

					Method method1 = newModelClass.getMethod("setGroupId",
							new Class[] { Long.TYPE });

					Long value1 = new Long(oldCplModel.getGroupId());

					method1.invoke(newModel, value1);

					Method method2 = newModelClass.getMethod("setCompanyId",
							new Class[] { Long.TYPE });

					Long value2 = new Long(oldCplModel.getCompanyId());

					method2.invoke(newModel, value2);

					Method method3 = newModelClass.getMethod("setUserId",
							new Class[] { Long.TYPE });

					Long value3 = new Long(oldCplModel.getUserId());

					method3.invoke(newModel, value3);

					Method method4 = newModelClass.getMethod("setCreatedDate",
							new Class[] { Date.class });

					Date value4 = oldCplModel.getCreatedDate();

					method4.invoke(newModel, value4);

					Method method5 = newModelClass.getMethod("setModifiedDate",
							new Class[] { Date.class });

					Date value5 = oldCplModel.getModifiedDate();

					method5.invoke(newModel, value5);

					Method method6 = newModelClass.getMethod("setName",
							new Class[] { String.class });

					String value6 = oldCplModel.getName();

					method6.invoke(newModel, value6);

					Method method7 = newModelClass.getMethod("setStatusTags",
							new Class[] { Boolean.TYPE });

					Boolean value7 = new Boolean(oldCplModel.getStatusTags());

					method7.invoke(newModel, value7);

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

		if (oldModelClassName.equals(VLegalFORelClp.class.getName())) {
			VLegalFORelClp oldCplModel = (VLegalFORelClp)oldModel;

			ClassLoader contextClassLoader = Thread.currentThread()
												   .getContextClassLoader();

			try {
				Thread.currentThread().setContextClassLoader(_classLoader);

				try {
					Class<?> newModelClass = Class.forName("com.vportal.portlet.vlegal.model.impl.VLegalFORelImpl",
							true, _classLoader);

					Object newModel = newModelClass.newInstance();

					Method method0 = newModelClass.getMethod("setFieldId",
							new Class[] { String.class });

					String value0 = oldCplModel.getFieldId();

					method0.invoke(newModel, value0);

					Method method1 = newModelClass.getMethod("setOrgId",
							new Class[] { String.class });

					String value1 = oldCplModel.getOrgId();

					method1.invoke(newModel, value1);

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

		if (oldModelClassName.equals(VLegalFTRelClp.class.getName())) {
			VLegalFTRelClp oldCplModel = (VLegalFTRelClp)oldModel;

			ClassLoader contextClassLoader = Thread.currentThread()
												   .getContextClassLoader();

			try {
				Thread.currentThread().setContextClassLoader(_classLoader);

				try {
					Class<?> newModelClass = Class.forName("com.vportal.portlet.vlegal.model.impl.VLegalFTRelImpl",
							true, _classLoader);

					Object newModel = newModelClass.newInstance();

					Method method0 = newModelClass.getMethod("setFieldId",
							new Class[] { String.class });

					String value0 = oldCplModel.getFieldId();

					method0.invoke(newModel, value0);

					Method method1 = newModelClass.getMethod("setTypeId",
							new Class[] { String.class });

					String value1 = oldCplModel.getTypeId();

					method1.invoke(newModel, value1);

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

		if (oldModelClassName.equals(VLegalDFRelClp.class.getName())) {
			VLegalDFRelClp oldCplModel = (VLegalDFRelClp)oldModel;

			ClassLoader contextClassLoader = Thread.currentThread()
												   .getContextClassLoader();

			try {
				Thread.currentThread().setContextClassLoader(_classLoader);

				try {
					Class<?> newModelClass = Class.forName("com.vportal.portlet.vlegal.model.impl.VLegalDFRelImpl",
							true, _classLoader);

					Object newModel = newModelClass.newInstance();

					Method method0 = newModelClass.getMethod("setFieldId",
							new Class[] { String.class });

					String value0 = oldCplModel.getFieldId();

					method0.invoke(newModel, value0);

					Method method1 = newModelClass.getMethod("setDocId",
							new Class[] { String.class });

					String value1 = oldCplModel.getDocId();

					method1.invoke(newModel, value1);

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

		if (oldModelClassName.equals(VLegalDDRelClp.class.getName())) {
			VLegalDDRelClp oldCplModel = (VLegalDDRelClp)oldModel;

			ClassLoader contextClassLoader = Thread.currentThread()
												   .getContextClassLoader();

			try {
				Thread.currentThread().setContextClassLoader(_classLoader);

				try {
					Class<?> newModelClass = Class.forName("com.vportal.portlet.vlegal.model.impl.VLegalDDRelImpl",
							true, _classLoader);

					Object newModel = newModelClass.newInstance();

					Method method0 = newModelClass.getMethod("setDepartmentId",
							new Class[] { Long.TYPE });

					Long value0 = new Long(oldCplModel.getDepartmentId());

					method0.invoke(newModel, value0);

					Method method1 = newModelClass.getMethod("setDocId",
							new Class[] { String.class });

					String value1 = oldCplModel.getDocId();

					method1.invoke(newModel, value1);

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

		if (oldModelClassName.equals(VLegalDURelClp.class.getName())) {
			VLegalDURelClp oldCplModel = (VLegalDURelClp)oldModel;

			ClassLoader contextClassLoader = Thread.currentThread()
												   .getContextClassLoader();

			try {
				Thread.currentThread().setContextClassLoader(_classLoader);

				try {
					Class<?> newModelClass = Class.forName("com.vportal.portlet.vlegal.model.impl.VLegalDURelImpl",
							true, _classLoader);

					Object newModel = newModelClass.newInstance();

					Method method0 = newModelClass.getMethod("setDepartmentId",
							new Class[] { Long.TYPE });

					Long value0 = new Long(oldCplModel.getDepartmentId());

					method0.invoke(newModel, value0);

					Method method1 = newModelClass.getMethod("setUserid",
							new Class[] { Long.TYPE });

					Long value1 = new Long(oldCplModel.getUserid());

					method1.invoke(newModel, value1);

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

		if (oldModelClassName.equals(VLegalDSRelClp.class.getName())) {
			VLegalDSRelClp oldCplModel = (VLegalDSRelClp)oldModel;

			ClassLoader contextClassLoader = Thread.currentThread()
												   .getContextClassLoader();

			try {
				Thread.currentThread().setContextClassLoader(_classLoader);

				try {
					Class<?> newModelClass = Class.forName("com.vportal.portlet.vlegal.model.impl.VLegalDSRelImpl",
							true, _classLoader);

					Object newModel = newModelClass.newInstance();

					Method method0 = newModelClass.getMethod("setSigId",
							new Class[] { String.class });

					String value0 = oldCplModel.getSigId();

					method0.invoke(newModel, value0);

					Method method1 = newModelClass.getMethod("setDocId",
							new Class[] { String.class });

					String value1 = oldCplModel.getDocId();

					method1.invoke(newModel, value1);

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

		if (oldModelClassName.equals(VLegalTDRelClp.class.getName())) {
			VLegalTDRelClp oldCplModel = (VLegalTDRelClp)oldModel;

			ClassLoader contextClassLoader = Thread.currentThread()
												   .getContextClassLoader();

			try {
				Thread.currentThread().setContextClassLoader(_classLoader);

				try {
					Class<?> newModelClass = Class.forName("com.vportal.portlet.vlegal.model.impl.VLegalTDRelImpl",
							true, _classLoader);

					Object newModel = newModelClass.newInstance();

					Method method0 = newModelClass.getMethod("setDocId",
							new Class[] { String.class });

					String value0 = oldCplModel.getDocId();

					method0.invoke(newModel, value0);

					Method method1 = newModelClass.getMethod("setTagId",
							new Class[] { String.class });

					String value1 = oldCplModel.getTagId();

					method1.invoke(newModel, value1);

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

		if (oldModelClassName.equals(VLegalLoggerClp.class.getName())) {
			VLegalLoggerClp oldCplModel = (VLegalLoggerClp)oldModel;

			ClassLoader contextClassLoader = Thread.currentThread()
												   .getContextClassLoader();

			try {
				Thread.currentThread().setContextClassLoader(_classLoader);

				try {
					Class<?> newModelClass = Class.forName("com.vportal.portlet.vlegal.model.impl.VLegalLoggerImpl",
							true, _classLoader);

					Object newModel = newModelClass.newInstance();

					Method method0 = newModelClass.getMethod("setLoggerId",
							new Class[] { String.class });

					String value0 = oldCplModel.getLoggerId();

					method0.invoke(newModel, value0);

					Method method1 = newModelClass.getMethod("setGroupId",
							new Class[] { Long.TYPE });

					Long value1 = new Long(oldCplModel.getGroupId());

					method1.invoke(newModel, value1);

					Method method2 = newModelClass.getMethod("setCompanyId",
							new Class[] { Long.TYPE });

					Long value2 = new Long(oldCplModel.getCompanyId());

					method2.invoke(newModel, value2);

					Method method3 = newModelClass.getMethod("setUserId",
							new Class[] { Long.TYPE });

					Long value3 = new Long(oldCplModel.getUserId());

					method3.invoke(newModel, value3);

					Method method4 = newModelClass.getMethod("setCreatedDate",
							new Class[] { Date.class });

					Date value4 = oldCplModel.getCreatedDate();

					method4.invoke(newModel, value4);

					Method method5 = newModelClass.getMethod("setCreatedByUser",
							new Class[] { Long.TYPE });

					Long value5 = new Long(oldCplModel.getCreatedByUser());

					method5.invoke(newModel, value5);

					Method method6 = newModelClass.getMethod("setContent",
							new Class[] { String.class });

					String value6 = oldCplModel.getContent();

					method6.invoke(newModel, value6);

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
					"com.vportal.portlet.vlegal.model.impl.VLegalDocumentImpl")) {
			ClassLoader contextClassLoader = Thread.currentThread()
												   .getContextClassLoader();

			try {
				Thread.currentThread().setContextClassLoader(_classLoader);

				try {
					VLegalDocumentClp newModel = new VLegalDocumentClp();

					Method method0 = oldModelClass.getMethod("getDocId");

					String value0 = (String)method0.invoke(oldModel,
							(Object[])null);

					newModel.setDocId(value0);

					Method method1 = oldModelClass.getMethod("getGroupId");

					Long value1 = (Long)method1.invoke(oldModel, (Object[])null);

					newModel.setGroupId(value1);

					Method method2 = oldModelClass.getMethod("getCompanyId");

					Long value2 = (Long)method2.invoke(oldModel, (Object[])null);

					newModel.setCompanyId(value2);

					Method method3 = oldModelClass.getMethod("getUserId");

					Long value3 = (Long)method3.invoke(oldModel, (Object[])null);

					newModel.setUserId(value3);

					Method method4 = oldModelClass.getMethod("getCreatedByUser");

					Long value4 = (Long)method4.invoke(oldModel, (Object[])null);

					newModel.setCreatedByUser(value4);

					Method method5 = oldModelClass.getMethod("getCreatedDate");

					Date value5 = (Date)method5.invoke(oldModel, (Object[])null);

					newModel.setCreatedDate(value5);

					Method method6 = oldModelClass.getMethod(
							"getModifiedByUser");

					Long value6 = (Long)method6.invoke(oldModel, (Object[])null);

					newModel.setModifiedByUser(value6);

					Method method7 = oldModelClass.getMethod("getModifiedDate");

					Date value7 = (Date)method7.invoke(oldModel, (Object[])null);

					newModel.setModifiedDate(value7);

					Method method8 = oldModelClass.getMethod(
							"getApprovedByUser");

					Long value8 = (Long)method8.invoke(oldModel, (Object[])null);

					newModel.setApprovedByUser(value8);

					Method method9 = oldModelClass.getMethod("getApprovedDate");

					Date value9 = (Date)method9.invoke(oldModel, (Object[])null);

					newModel.setApprovedDate(value9);

					Method method10 = oldModelClass.getMethod(
							"getForwardedByUser");

					Long value10 = (Long)method10.invoke(oldModel,
							(Object[])null);

					newModel.setForwardedByUser(value10);

					Method method11 = oldModelClass.getMethod(
							"getForwardedDate");

					Date value11 = (Date)method11.invoke(oldModel,
							(Object[])null);

					newModel.setForwardedDate(value11);

					Method method12 = oldModelClass.getMethod(
							"getPublishedByUser");

					Long value12 = (Long)method12.invoke(oldModel,
							(Object[])null);

					newModel.setPublishedByUser(value12);

					Method method13 = oldModelClass.getMethod(
							"getPublishedDate");

					Date value13 = (Date)method13.invoke(oldModel,
							(Object[])null);

					newModel.setPublishedDate(value13);

					Method method14 = oldModelClass.getMethod("getSymbol");

					String value14 = (String)method14.invoke(oldModel,
							(Object[])null);

					newModel.setSymbol(value14);

					Method method15 = oldModelClass.getMethod("getNum");

					String value15 = (String)method15.invoke(oldModel,
							(Object[])null);

					newModel.setNum(value15);

					Method method16 = oldModelClass.getMethod("getPromulDate");

					Date value16 = (Date)method16.invoke(oldModel,
							(Object[])null);

					newModel.setPromulDate(value16);

					Method method17 = oldModelClass.getMethod(
							"getEffectivedDate");

					Date value17 = (Date)method17.invoke(oldModel,
							(Object[])null);

					newModel.setEffectivedDate(value17);

					Method method18 = oldModelClass.getMethod("getExpiredDate");

					Date value18 = (Date)method18.invoke(oldModel,
							(Object[])null);

					newModel.setExpiredDate(value18);

					Method method19 = oldModelClass.getMethod("getReplaceDoc");

					String value19 = (String)method19.invoke(oldModel,
							(Object[])null);

					newModel.setReplaceDoc(value19);

					Method method20 = oldModelClass.getMethod("getSummary");

					String value20 = (String)method20.invoke(oldModel,
							(Object[])null);

					newModel.setSummary(value20);

					Method method21 = oldModelClass.getMethod("getContent");

					String value21 = (String)method21.invoke(oldModel,
							(Object[])null);

					newModel.setContent(value21);

					Method method22 = oldModelClass.getMethod("getLanguage");

					String value22 = (String)method22.invoke(oldModel,
							(Object[])null);

					newModel.setLanguage(value22);

					Method method23 = oldModelClass.getMethod("getUserHit");

					Integer value23 = (Integer)method23.invoke(oldModel,
							(Object[])null);

					newModel.setUserHit(value23);

					Method method24 = oldModelClass.getMethod("getStatusDoc");

					Integer value24 = (Integer)method24.invoke(oldModel,
							(Object[])null);

					newModel.setStatusDoc(value24);

					Method method25 = oldModelClass.getMethod(
							"getHasAttachment");

					Boolean value25 = (Boolean)method25.invoke(oldModel,
							(Object[])null);

					newModel.setHasAttachment(value25);

					Method method26 = oldModelClass.getMethod("getTypeDocId");

					String value26 = (String)method26.invoke(oldModel,
							(Object[])null);

					newModel.setTypeDocId(value26);

					Method method27 = oldModelClass.getMethod("getFieldId");

					String value27 = (String)method27.invoke(oldModel,
							(Object[])null);

					newModel.setFieldId(value27);

					Method method28 = oldModelClass.getMethod("getOrgId");

					String value28 = (String)method28.invoke(oldModel,
							(Object[])null);

					newModel.setOrgId(value28);

					Method method29 = oldModelClass.getMethod("getOrgRels");

					String value29 = (String)method29.invoke(oldModel,
							(Object[])null);

					newModel.setOrgRels(value29);

					Method method30 = oldModelClass.getMethod("getSignerRels");

					String value30 = (String)method30.invoke(oldModel,
							(Object[])null);

					newModel.setSignerRels(value30);

					Method method31 = oldModelClass.getMethod("getFieldRels");

					String value31 = (String)method31.invoke(oldModel,
							(Object[])null);

					newModel.setFieldRels(value31);

					Method method32 = oldModelClass.getMethod("getNumRels");

					String value32 = (String)method32.invoke(oldModel,
							(Object[])null);

					newModel.setNumRels(value32);

					Method method33 = oldModelClass.getMethod("getDocCode");

					String value33 = (String)method33.invoke(oldModel,
							(Object[])null);

					newModel.setDocCode(value33);

					Method method34 = oldModelClass.getMethod(
							"getDepartmentRels");

					String value34 = (String)method34.invoke(oldModel,
							(Object[])null);

					newModel.setDepartmentRels(value34);

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
					"com.vportal.portlet.vlegal.model.impl.VLegalFieldImpl")) {
			ClassLoader contextClassLoader = Thread.currentThread()
												   .getContextClassLoader();

			try {
				Thread.currentThread().setContextClassLoader(_classLoader);

				try {
					VLegalFieldClp newModel = new VLegalFieldClp();

					Method method0 = oldModelClass.getMethod("getFieldId");

					String value0 = (String)method0.invoke(oldModel,
							(Object[])null);

					newModel.setFieldId(value0);

					Method method1 = oldModelClass.getMethod("getGroupId");

					Long value1 = (Long)method1.invoke(oldModel, (Object[])null);

					newModel.setGroupId(value1);

					Method method2 = oldModelClass.getMethod("getCompanyId");

					Long value2 = (Long)method2.invoke(oldModel, (Object[])null);

					newModel.setCompanyId(value2);

					Method method3 = oldModelClass.getMethod("getUserId");

					Long value3 = (Long)method3.invoke(oldModel, (Object[])null);

					newModel.setUserId(value3);

					Method method4 = oldModelClass.getMethod("getCreatedDate");

					Date value4 = (Date)method4.invoke(oldModel, (Object[])null);

					newModel.setCreatedDate(value4);

					Method method5 = oldModelClass.getMethod("getModifiedDate");

					Date value5 = (Date)method5.invoke(oldModel, (Object[])null);

					newModel.setModifiedDate(value5);

					Method method6 = oldModelClass.getMethod("getCreatedByUser");

					Long value6 = (Long)method6.invoke(oldModel, (Object[])null);

					newModel.setCreatedByUser(value6);

					Method method7 = oldModelClass.getMethod(
							"getModifiedByUser");

					Long value7 = (Long)method7.invoke(oldModel, (Object[])null);

					newModel.setModifiedByUser(value7);

					Method method8 = oldModelClass.getMethod("getName");

					String value8 = (String)method8.invoke(oldModel,
							(Object[])null);

					newModel.setName(value8);

					Method method9 = oldModelClass.getMethod("getDescription");

					String value9 = (String)method9.invoke(oldModel,
							(Object[])null);

					newModel.setDescription(value9);

					Method method10 = oldModelClass.getMethod("getLanguage");

					String value10 = (String)method10.invoke(oldModel,
							(Object[])null);

					newModel.setLanguage(value10);

					Method method11 = oldModelClass.getMethod("getStatusField");

					Boolean value11 = (Boolean)method11.invoke(oldModel,
							(Object[])null);

					newModel.setStatusField(value11);

					Method method12 = oldModelClass.getMethod("getRssable");

					Boolean value12 = (Boolean)method12.invoke(oldModel,
							(Object[])null);

					newModel.setRssable(value12);

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
					"com.vportal.portlet.vlegal.model.impl.VLegalTypeImpl")) {
			ClassLoader contextClassLoader = Thread.currentThread()
												   .getContextClassLoader();

			try {
				Thread.currentThread().setContextClassLoader(_classLoader);

				try {
					VLegalTypeClp newModel = new VLegalTypeClp();

					Method method0 = oldModelClass.getMethod("getTypeId");

					String value0 = (String)method0.invoke(oldModel,
							(Object[])null);

					newModel.setTypeId(value0);

					Method method1 = oldModelClass.getMethod("getGroupId");

					Long value1 = (Long)method1.invoke(oldModel, (Object[])null);

					newModel.setGroupId(value1);

					Method method2 = oldModelClass.getMethod("getCompanyId");

					Long value2 = (Long)method2.invoke(oldModel, (Object[])null);

					newModel.setCompanyId(value2);

					Method method3 = oldModelClass.getMethod("getUserId");

					Long value3 = (Long)method3.invoke(oldModel, (Object[])null);

					newModel.setUserId(value3);

					Method method4 = oldModelClass.getMethod("getCreatedDate");

					Date value4 = (Date)method4.invoke(oldModel, (Object[])null);

					newModel.setCreatedDate(value4);

					Method method5 = oldModelClass.getMethod("getModifiedDate");

					Date value5 = (Date)method5.invoke(oldModel, (Object[])null);

					newModel.setModifiedDate(value5);

					Method method6 = oldModelClass.getMethod("getCreatedByUser");

					Long value6 = (Long)method6.invoke(oldModel, (Object[])null);

					newModel.setCreatedByUser(value6);

					Method method7 = oldModelClass.getMethod(
							"getModifiedByUser");

					Long value7 = (Long)method7.invoke(oldModel, (Object[])null);

					newModel.setModifiedByUser(value7);

					Method method8 = oldModelClass.getMethod("getName");

					String value8 = (String)method8.invoke(oldModel,
							(Object[])null);

					newModel.setName(value8);

					Method method9 = oldModelClass.getMethod("getDescription");

					String value9 = (String)method9.invoke(oldModel,
							(Object[])null);

					newModel.setDescription(value9);

					Method method10 = oldModelClass.getMethod("getLanguage");

					String value10 = (String)method10.invoke(oldModel,
							(Object[])null);

					newModel.setLanguage(value10);

					Method method11 = oldModelClass.getMethod("getStatusType");

					Boolean value11 = (Boolean)method11.invoke(oldModel,
							(Object[])null);

					newModel.setStatusType(value11);

					Method method12 = oldModelClass.getMethod("getRssable");

					Boolean value12 = (Boolean)method12.invoke(oldModel,
							(Object[])null);

					newModel.setRssable(value12);

					Method method13 = oldModelClass.getMethod("getPosition");

					Integer value13 = (Integer)method13.invoke(oldModel,
							(Object[])null);

					newModel.setPosition(value13);

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
					"com.vportal.portlet.vlegal.model.impl.VLegalDraftDocumentImpl")) {
			ClassLoader contextClassLoader = Thread.currentThread()
												   .getContextClassLoader();

			try {
				Thread.currentThread().setContextClassLoader(_classLoader);

				try {
					VLegalDraftDocumentClp newModel = new VLegalDraftDocumentClp();

					Method method0 = oldModelClass.getMethod("getDraftId");

					String value0 = (String)method0.invoke(oldModel,
							(Object[])null);

					newModel.setDraftId(value0);

					Method method1 = oldModelClass.getMethod("getGroupId");

					Long value1 = (Long)method1.invoke(oldModel, (Object[])null);

					newModel.setGroupId(value1);

					Method method2 = oldModelClass.getMethod("getCompanyId");

					Long value2 = (Long)method2.invoke(oldModel, (Object[])null);

					newModel.setCompanyId(value2);

					Method method3 = oldModelClass.getMethod("getUserId");

					Long value3 = (Long)method3.invoke(oldModel, (Object[])null);

					newModel.setUserId(value3);

					Method method4 = oldModelClass.getMethod("getCreatedByUser");

					Long value4 = (Long)method4.invoke(oldModel, (Object[])null);

					newModel.setCreatedByUser(value4);

					Method method5 = oldModelClass.getMethod("getCreatedDate");

					Date value5 = (Date)method5.invoke(oldModel, (Object[])null);

					newModel.setCreatedDate(value5);

					Method method6 = oldModelClass.getMethod(
							"getModifiedByUser");

					Long value6 = (Long)method6.invoke(oldModel, (Object[])null);

					newModel.setModifiedByUser(value6);

					Method method7 = oldModelClass.getMethod("getModifiedDate");

					Date value7 = (Date)method7.invoke(oldModel, (Object[])null);

					newModel.setModifiedDate(value7);

					Method method8 = oldModelClass.getMethod(
							"getApprovedByUser");

					Long value8 = (Long)method8.invoke(oldModel, (Object[])null);

					newModel.setApprovedByUser(value8);

					Method method9 = oldModelClass.getMethod("getApprovedDate");

					Date value9 = (Date)method9.invoke(oldModel, (Object[])null);

					newModel.setApprovedDate(value9);

					Method method10 = oldModelClass.getMethod(
							"getPublishedByUser");

					Long value10 = (Long)method10.invoke(oldModel,
							(Object[])null);

					newModel.setPublishedByUser(value10);

					Method method11 = oldModelClass.getMethod(
							"getPublishedDate");

					Date value11 = (Date)method11.invoke(oldModel,
							(Object[])null);

					newModel.setPublishedDate(value11);

					Method method12 = oldModelClass.getMethod("getTitle");

					String value12 = (String)method12.invoke(oldModel,
							(Object[])null);

					newModel.setTitle(value12);

					Method method13 = oldModelClass.getMethod("getExpiredDate");

					Date value13 = (Date)method13.invoke(oldModel,
							(Object[])null);

					newModel.setExpiredDate(value13);

					Method method14 = oldModelClass.getMethod("getLanguage");

					String value14 = (String)method14.invoke(oldModel,
							(Object[])null);

					newModel.setLanguage(value14);

					Method method15 = oldModelClass.getMethod("getContent");

					String value15 = (String)method15.invoke(oldModel,
							(Object[])null);

					newModel.setContent(value15);

					Method method16 = oldModelClass.getMethod("getTypeId");

					String value16 = (String)method16.invoke(oldModel,
							(Object[])null);

					newModel.setTypeId(value16);

					Method method17 = oldModelClass.getMethod("getFieldId");

					String value17 = (String)method17.invoke(oldModel,
							(Object[])null);

					newModel.setFieldId(value17);

					Method method18 = oldModelClass.getMethod(
							"getHasAttachment");

					Boolean value18 = (Boolean)method18.invoke(oldModel,
							(Object[])null);

					newModel.setHasAttachment(value18);

					Method method19 = oldModelClass.getMethod("getDraftLevel");

					Integer value19 = (Integer)method19.invoke(oldModel,
							(Object[])null);

					newModel.setDraftLevel(value19);

					Method method20 = oldModelClass.getMethod("getDocCode");

					String value20 = (String)method20.invoke(oldModel,
							(Object[])null);

					newModel.setDocCode(value20);

					Method method21 = oldModelClass.getMethod("getStatusDraft");

					Integer value21 = (Integer)method21.invoke(oldModel,
							(Object[])null);

					newModel.setStatusDraft(value21);

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
					"com.vportal.portlet.vlegal.model.impl.VLegalSuggestDocumentImpl")) {
			ClassLoader contextClassLoader = Thread.currentThread()
												   .getContextClassLoader();

			try {
				Thread.currentThread().setContextClassLoader(_classLoader);

				try {
					VLegalSuggestDocumentClp newModel = new VLegalSuggestDocumentClp();

					Method method0 = oldModelClass.getMethod("getSugId");

					String value0 = (String)method0.invoke(oldModel,
							(Object[])null);

					newModel.setSugId(value0);

					Method method1 = oldModelClass.getMethod("getGroupId");

					Long value1 = (Long)method1.invoke(oldModel, (Object[])null);

					newModel.setGroupId(value1);

					Method method2 = oldModelClass.getMethod("getCompanyId");

					Long value2 = (Long)method2.invoke(oldModel, (Object[])null);

					newModel.setCompanyId(value2);

					Method method3 = oldModelClass.getMethod("getUserId");

					Long value3 = (Long)method3.invoke(oldModel, (Object[])null);

					newModel.setUserId(value3);

					Method method4 = oldModelClass.getMethod("getCreatedDate");

					Date value4 = (Date)method4.invoke(oldModel, (Object[])null);

					newModel.setCreatedDate(value4);

					Method method5 = oldModelClass.getMethod("getModifiedDate");

					Date value5 = (Date)method5.invoke(oldModel, (Object[])null);

					newModel.setModifiedDate(value5);

					Method method6 = oldModelClass.getMethod(
							"getModifiedByUser");

					Long value6 = (Long)method6.invoke(oldModel, (Object[])null);

					newModel.setModifiedByUser(value6);

					Method method7 = oldModelClass.getMethod("getApproved");

					Boolean value7 = (Boolean)method7.invoke(oldModel,
							(Object[])null);

					newModel.setApproved(value7);

					Method method8 = oldModelClass.getMethod(
							"getApprovedByUser");

					Long value8 = (Long)method8.invoke(oldModel, (Object[])null);

					newModel.setApprovedByUser(value8);

					Method method9 = oldModelClass.getMethod("getApprovedDate");

					Date value9 = (Date)method9.invoke(oldModel, (Object[])null);

					newModel.setApprovedDate(value9);

					Method method10 = oldModelClass.getMethod("getTitle");

					String value10 = (String)method10.invoke(oldModel,
							(Object[])null);

					newModel.setTitle(value10);

					Method method11 = oldModelClass.getMethod("getContent");

					String value11 = (String)method11.invoke(oldModel,
							(Object[])null);

					newModel.setContent(value11);

					Method method12 = oldModelClass.getMethod("getLanguage");

					String value12 = (String)method12.invoke(oldModel,
							(Object[])null);

					newModel.setLanguage(value12);

					Method method13 = oldModelClass.getMethod("getVisitorName");

					String value13 = (String)method13.invoke(oldModel,
							(Object[])null);

					newModel.setVisitorName(value13);

					Method method14 = oldModelClass.getMethod("getVisitorEmail");

					String value14 = (String)method14.invoke(oldModel,
							(Object[])null);

					newModel.setVisitorEmail(value14);

					Method method15 = oldModelClass.getMethod("getVisitorTel");

					String value15 = (String)method15.invoke(oldModel,
							(Object[])null);

					newModel.setVisitorTel(value15);

					Method method16 = oldModelClass.getMethod(
							"getVisitorAddress");

					String value16 = (String)method16.invoke(oldModel,
							(Object[])null);

					newModel.setVisitorAddress(value16);

					Method method17 = oldModelClass.getMethod("getDraftId");

					String value17 = (String)method17.invoke(oldModel,
							(Object[])null);

					newModel.setDraftId(value17);

					Method method18 = oldModelClass.getMethod(
							"getHasAttachment");

					Boolean value18 = (Boolean)method18.invoke(oldModel,
							(Object[])null);

					newModel.setHasAttachment(value18);

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
					"com.vportal.portlet.vlegal.model.impl.VLegalAttachedMessageImpl")) {
			ClassLoader contextClassLoader = Thread.currentThread()
												   .getContextClassLoader();

			try {
				Thread.currentThread().setContextClassLoader(_classLoader);

				try {
					VLegalAttachedMessageClp newModel = new VLegalAttachedMessageClp();

					Method method0 = oldModelClass.getMethod("getMessageId");

					String value0 = (String)method0.invoke(oldModel,
							(Object[])null);

					newModel.setMessageId(value0);

					Method method1 = oldModelClass.getMethod("getGroupId");

					Long value1 = (Long)method1.invoke(oldModel, (Object[])null);

					newModel.setGroupId(value1);

					Method method2 = oldModelClass.getMethod("getCompanyId");

					Long value2 = (Long)method2.invoke(oldModel, (Object[])null);

					newModel.setCompanyId(value2);

					Method method3 = oldModelClass.getMethod("getUserId");

					Long value3 = (Long)method3.invoke(oldModel, (Object[])null);

					newModel.setUserId(value3);

					Method method4 = oldModelClass.getMethod("getCreatedDate");

					Date value4 = (Date)method4.invoke(oldModel, (Object[])null);

					newModel.setCreatedDate(value4);

					Method method5 = oldModelClass.getMethod("getCreatedByUser");

					Long value5 = (Long)method5.invoke(oldModel, (Object[])null);

					newModel.setCreatedByUser(value5);

					Method method6 = oldModelClass.getMethod("getArticleId");

					String value6 = (String)method6.invoke(oldModel,
							(Object[])null);

					newModel.setArticleId(value6);

					Method method7 = oldModelClass.getMethod("getContent");

					String value7 = (String)method7.invoke(oldModel,
							(Object[])null);

					newModel.setContent(value7);

					Method method8 = oldModelClass.getMethod("getReadMessage");

					Boolean value8 = (Boolean)method8.invoke(oldModel,
							(Object[])null);

					newModel.setReadMessage(value8);

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
					"com.vportal.portlet.vlegal.model.impl.VLegalOrgImpl")) {
			ClassLoader contextClassLoader = Thread.currentThread()
												   .getContextClassLoader();

			try {
				Thread.currentThread().setContextClassLoader(_classLoader);

				try {
					VLegalOrgClp newModel = new VLegalOrgClp();

					Method method0 = oldModelClass.getMethod("getOrgId");

					String value0 = (String)method0.invoke(oldModel,
							(Object[])null);

					newModel.setOrgId(value0);

					Method method1 = oldModelClass.getMethod("getGroupId");

					Long value1 = (Long)method1.invoke(oldModel, (Object[])null);

					newModel.setGroupId(value1);

					Method method2 = oldModelClass.getMethod("getCompanyId");

					Long value2 = (Long)method2.invoke(oldModel, (Object[])null);

					newModel.setCompanyId(value2);

					Method method3 = oldModelClass.getMethod("getUserId");

					Long value3 = (Long)method3.invoke(oldModel, (Object[])null);

					newModel.setUserId(value3);

					Method method4 = oldModelClass.getMethod("getCreatedDate");

					Date value4 = (Date)method4.invoke(oldModel, (Object[])null);

					newModel.setCreatedDate(value4);

					Method method5 = oldModelClass.getMethod("getModifiedDate");

					Date value5 = (Date)method5.invoke(oldModel, (Object[])null);

					newModel.setModifiedDate(value5);

					Method method6 = oldModelClass.getMethod("getCreatedByUser");

					Long value6 = (Long)method6.invoke(oldModel, (Object[])null);

					newModel.setCreatedByUser(value6);

					Method method7 = oldModelClass.getMethod(
							"getModifiedByUser");

					Long value7 = (Long)method7.invoke(oldModel, (Object[])null);

					newModel.setModifiedByUser(value7);

					Method method8 = oldModelClass.getMethod("getName");

					String value8 = (String)method8.invoke(oldModel,
							(Object[])null);

					newModel.setName(value8);

					Method method9 = oldModelClass.getMethod("getDescription");

					String value9 = (String)method9.invoke(oldModel,
							(Object[])null);

					newModel.setDescription(value9);

					Method method10 = oldModelClass.getMethod("getParentId");

					String value10 = (String)method10.invoke(oldModel,
							(Object[])null);

					newModel.setParentId(value10);

					Method method11 = oldModelClass.getMethod("getLanguage");

					String value11 = (String)method11.invoke(oldModel,
							(Object[])null);

					newModel.setLanguage(value11);

					Method method12 = oldModelClass.getMethod("getStatusOrg");

					Boolean value12 = (Boolean)method12.invoke(oldModel,
							(Object[])null);

					newModel.setStatusOrg(value12);

					Method method13 = oldModelClass.getMethod("getRssable");

					Boolean value13 = (Boolean)method13.invoke(oldModel,
							(Object[])null);

					newModel.setRssable(value13);

					Method method14 = oldModelClass.getMethod("getPosition");

					Integer value14 = (Integer)method14.invoke(oldModel,
							(Object[])null);

					newModel.setPosition(value14);

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
					"com.vportal.portlet.vlegal.model.impl.VLegalSignerImpl")) {
			ClassLoader contextClassLoader = Thread.currentThread()
												   .getContextClassLoader();

			try {
				Thread.currentThread().setContextClassLoader(_classLoader);

				try {
					VLegalSignerClp newModel = new VLegalSignerClp();

					Method method0 = oldModelClass.getMethod("getSigId");

					String value0 = (String)method0.invoke(oldModel,
							(Object[])null);

					newModel.setSigId(value0);

					Method method1 = oldModelClass.getMethod("getGroupId");

					Long value1 = (Long)method1.invoke(oldModel, (Object[])null);

					newModel.setGroupId(value1);

					Method method2 = oldModelClass.getMethod("getCompanyId");

					Long value2 = (Long)method2.invoke(oldModel, (Object[])null);

					newModel.setCompanyId(value2);

					Method method3 = oldModelClass.getMethod("getUserId");

					Long value3 = (Long)method3.invoke(oldModel, (Object[])null);

					newModel.setUserId(value3);

					Method method4 = oldModelClass.getMethod("getCreatedDate");

					Date value4 = (Date)method4.invoke(oldModel, (Object[])null);

					newModel.setCreatedDate(value4);

					Method method5 = oldModelClass.getMethod("getModifiedDate");

					Date value5 = (Date)method5.invoke(oldModel, (Object[])null);

					newModel.setModifiedDate(value5);

					Method method6 = oldModelClass.getMethod("getCreatedByUser");

					Long value6 = (Long)method6.invoke(oldModel, (Object[])null);

					newModel.setCreatedByUser(value6);

					Method method7 = oldModelClass.getMethod(
							"getModifiedByUser");

					Long value7 = (Long)method7.invoke(oldModel, (Object[])null);

					newModel.setModifiedByUser(value7);

					Method method8 = oldModelClass.getMethod("getFirstName");

					String value8 = (String)method8.invoke(oldModel,
							(Object[])null);

					newModel.setFirstName(value8);

					Method method9 = oldModelClass.getMethod("getLastName");

					String value9 = (String)method9.invoke(oldModel,
							(Object[])null);

					newModel.setLastName(value9);

					Method method10 = oldModelClass.getMethod("getLanguage");

					String value10 = (String)method10.invoke(oldModel,
							(Object[])null);

					newModel.setLanguage(value10);

					Method method11 = oldModelClass.getMethod("getStatusSigner");

					Boolean value11 = (Boolean)method11.invoke(oldModel,
							(Object[])null);

					newModel.setStatusSigner(value11);

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
					"com.vportal.portlet.vlegal.model.impl.VLegalTagsImpl")) {
			ClassLoader contextClassLoader = Thread.currentThread()
												   .getContextClassLoader();

			try {
				Thread.currentThread().setContextClassLoader(_classLoader);

				try {
					VLegalTagsClp newModel = new VLegalTagsClp();

					Method method0 = oldModelClass.getMethod("getTagId");

					String value0 = (String)method0.invoke(oldModel,
							(Object[])null);

					newModel.setTagId(value0);

					Method method1 = oldModelClass.getMethod("getGroupId");

					Long value1 = (Long)method1.invoke(oldModel, (Object[])null);

					newModel.setGroupId(value1);

					Method method2 = oldModelClass.getMethod("getCompanyId");

					Long value2 = (Long)method2.invoke(oldModel, (Object[])null);

					newModel.setCompanyId(value2);

					Method method3 = oldModelClass.getMethod("getUserId");

					Long value3 = (Long)method3.invoke(oldModel, (Object[])null);

					newModel.setUserId(value3);

					Method method4 = oldModelClass.getMethod("getCreatedDate");

					Date value4 = (Date)method4.invoke(oldModel, (Object[])null);

					newModel.setCreatedDate(value4);

					Method method5 = oldModelClass.getMethod("getModifiedDate");

					Date value5 = (Date)method5.invoke(oldModel, (Object[])null);

					newModel.setModifiedDate(value5);

					Method method6 = oldModelClass.getMethod("getName");

					String value6 = (String)method6.invoke(oldModel,
							(Object[])null);

					newModel.setName(value6);

					Method method7 = oldModelClass.getMethod("getStatusTags");

					Boolean value7 = (Boolean)method7.invoke(oldModel,
							(Object[])null);

					newModel.setStatusTags(value7);

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
					"com.vportal.portlet.vlegal.model.impl.VLegalFORelImpl")) {
			ClassLoader contextClassLoader = Thread.currentThread()
												   .getContextClassLoader();

			try {
				Thread.currentThread().setContextClassLoader(_classLoader);

				try {
					VLegalFORelClp newModel = new VLegalFORelClp();

					Method method0 = oldModelClass.getMethod("getFieldId");

					String value0 = (String)method0.invoke(oldModel,
							(Object[])null);

					newModel.setFieldId(value0);

					Method method1 = oldModelClass.getMethod("getOrgId");

					String value1 = (String)method1.invoke(oldModel,
							(Object[])null);

					newModel.setOrgId(value1);

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
					"com.vportal.portlet.vlegal.model.impl.VLegalFTRelImpl")) {
			ClassLoader contextClassLoader = Thread.currentThread()
												   .getContextClassLoader();

			try {
				Thread.currentThread().setContextClassLoader(_classLoader);

				try {
					VLegalFTRelClp newModel = new VLegalFTRelClp();

					Method method0 = oldModelClass.getMethod("getFieldId");

					String value0 = (String)method0.invoke(oldModel,
							(Object[])null);

					newModel.setFieldId(value0);

					Method method1 = oldModelClass.getMethod("getTypeId");

					String value1 = (String)method1.invoke(oldModel,
							(Object[])null);

					newModel.setTypeId(value1);

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
					"com.vportal.portlet.vlegal.model.impl.VLegalDFRelImpl")) {
			ClassLoader contextClassLoader = Thread.currentThread()
												   .getContextClassLoader();

			try {
				Thread.currentThread().setContextClassLoader(_classLoader);

				try {
					VLegalDFRelClp newModel = new VLegalDFRelClp();

					Method method0 = oldModelClass.getMethod("getFieldId");

					String value0 = (String)method0.invoke(oldModel,
							(Object[])null);

					newModel.setFieldId(value0);

					Method method1 = oldModelClass.getMethod("getDocId");

					String value1 = (String)method1.invoke(oldModel,
							(Object[])null);

					newModel.setDocId(value1);

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
					"com.vportal.portlet.vlegal.model.impl.VLegalDDRelImpl")) {
			ClassLoader contextClassLoader = Thread.currentThread()
												   .getContextClassLoader();

			try {
				Thread.currentThread().setContextClassLoader(_classLoader);

				try {
					VLegalDDRelClp newModel = new VLegalDDRelClp();

					Method method0 = oldModelClass.getMethod("getDepartmentId");

					Long value0 = (Long)method0.invoke(oldModel, (Object[])null);

					newModel.setDepartmentId(value0);

					Method method1 = oldModelClass.getMethod("getDocId");

					String value1 = (String)method1.invoke(oldModel,
							(Object[])null);

					newModel.setDocId(value1);

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
					"com.vportal.portlet.vlegal.model.impl.VLegalDURelImpl")) {
			ClassLoader contextClassLoader = Thread.currentThread()
												   .getContextClassLoader();

			try {
				Thread.currentThread().setContextClassLoader(_classLoader);

				try {
					VLegalDURelClp newModel = new VLegalDURelClp();

					Method method0 = oldModelClass.getMethod("getDepartmentId");

					Long value0 = (Long)method0.invoke(oldModel, (Object[])null);

					newModel.setDepartmentId(value0);

					Method method1 = oldModelClass.getMethod("getUserid");

					Long value1 = (Long)method1.invoke(oldModel, (Object[])null);

					newModel.setUserid(value1);

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
					"com.vportal.portlet.vlegal.model.impl.VLegalDSRelImpl")) {
			ClassLoader contextClassLoader = Thread.currentThread()
												   .getContextClassLoader();

			try {
				Thread.currentThread().setContextClassLoader(_classLoader);

				try {
					VLegalDSRelClp newModel = new VLegalDSRelClp();

					Method method0 = oldModelClass.getMethod("getSigId");

					String value0 = (String)method0.invoke(oldModel,
							(Object[])null);

					newModel.setSigId(value0);

					Method method1 = oldModelClass.getMethod("getDocId");

					String value1 = (String)method1.invoke(oldModel,
							(Object[])null);

					newModel.setDocId(value1);

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
					"com.vportal.portlet.vlegal.model.impl.VLegalTDRelImpl")) {
			ClassLoader contextClassLoader = Thread.currentThread()
												   .getContextClassLoader();

			try {
				Thread.currentThread().setContextClassLoader(_classLoader);

				try {
					VLegalTDRelClp newModel = new VLegalTDRelClp();

					Method method0 = oldModelClass.getMethod("getDocId");

					String value0 = (String)method0.invoke(oldModel,
							(Object[])null);

					newModel.setDocId(value0);

					Method method1 = oldModelClass.getMethod("getTagId");

					String value1 = (String)method1.invoke(oldModel,
							(Object[])null);

					newModel.setTagId(value1);

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
					"com.vportal.portlet.vlegal.model.impl.VLegalLoggerImpl")) {
			ClassLoader contextClassLoader = Thread.currentThread()
												   .getContextClassLoader();

			try {
				Thread.currentThread().setContextClassLoader(_classLoader);

				try {
					VLegalLoggerClp newModel = new VLegalLoggerClp();

					Method method0 = oldModelClass.getMethod("getLoggerId");

					String value0 = (String)method0.invoke(oldModel,
							(Object[])null);

					newModel.setLoggerId(value0);

					Method method1 = oldModelClass.getMethod("getGroupId");

					Long value1 = (Long)method1.invoke(oldModel, (Object[])null);

					newModel.setGroupId(value1);

					Method method2 = oldModelClass.getMethod("getCompanyId");

					Long value2 = (Long)method2.invoke(oldModel, (Object[])null);

					newModel.setCompanyId(value2);

					Method method3 = oldModelClass.getMethod("getUserId");

					Long value3 = (Long)method3.invoke(oldModel, (Object[])null);

					newModel.setUserId(value3);

					Method method4 = oldModelClass.getMethod("getCreatedDate");

					Date value4 = (Date)method4.invoke(oldModel, (Object[])null);

					newModel.setCreatedDate(value4);

					Method method5 = oldModelClass.getMethod("getCreatedByUser");

					Long value5 = (Long)method5.invoke(oldModel, (Object[])null);

					newModel.setCreatedByUser(value5);

					Method method6 = oldModelClass.getMethod("getContent");

					String value6 = (String)method6.invoke(oldModel,
							(Object[])null);

					newModel.setContent(value6);

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