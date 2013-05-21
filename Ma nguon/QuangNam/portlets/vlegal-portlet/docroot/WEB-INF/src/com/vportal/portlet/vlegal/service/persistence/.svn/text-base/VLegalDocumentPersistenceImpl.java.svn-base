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

package com.vportal.portlet.vlegal.service.persistence;

import com.liferay.portal.NoSuchModelException;
import com.liferay.portal.kernel.annotation.BeanReference;
import com.liferay.portal.kernel.cache.CacheRegistryUtil;
import com.liferay.portal.kernel.dao.orm.EntityCacheUtil;
import com.liferay.portal.kernel.dao.orm.FinderCacheUtil;
import com.liferay.portal.kernel.dao.orm.FinderPath;
import com.liferay.portal.kernel.dao.orm.Query;
import com.liferay.portal.kernel.dao.orm.QueryPos;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.CalendarUtil;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.InstanceFactory;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelListener;
import com.liferay.portal.service.persistence.BatchSessionUtil;
import com.liferay.portal.service.persistence.CompanyPersistence;
import com.liferay.portal.service.persistence.PortletPreferencesPersistence;
import com.liferay.portal.service.persistence.ResourcePersistence;
import com.liferay.portal.service.persistence.UserPersistence;
import com.liferay.portal.service.persistence.impl.BasePersistenceImpl;

import com.vportal.portlet.vlegal.NoSuchVLegalDocumentException;
import com.vportal.portlet.vlegal.model.VLegalDocument;
import com.vportal.portlet.vlegal.model.impl.VLegalDocumentImpl;
import com.vportal.portlet.vlegal.model.impl.VLegalDocumentModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;

/**
 * The persistence implementation for the v legal document service.
 *
 * <p>
 * Never modify or reference this class directly. Always use {@link VLegalDocumentUtil} to access the v legal document persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
 * </p>
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author ACB
 * @see VLegalDocumentPersistence
 * @see VLegalDocumentUtil
 * @generated
 */
public class VLegalDocumentPersistenceImpl extends BasePersistenceImpl<VLegalDocument>
	implements VLegalDocumentPersistence {
	public static final String FINDER_CLASS_NAME_ENTITY = VLegalDocumentImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST = FINDER_CLASS_NAME_ENTITY +
		".List";
	public static final FinderPath FINDER_PATH_FIND_BY_GROUPID = new FinderPath(VLegalDocumentModelImpl.ENTITY_CACHE_ENABLED,
			VLegalDocumentModelImpl.FINDER_CACHE_ENABLED,
			FINDER_CLASS_NAME_LIST, "findByGroupId",
			new String[] {
				Long.class.getName(),
				
			"java.lang.Integer", "java.lang.Integer",
				"com.liferay.portal.kernel.util.OrderByComparator"
			});
	public static final FinderPath FINDER_PATH_COUNT_BY_GROUPID = new FinderPath(VLegalDocumentModelImpl.ENTITY_CACHE_ENABLED,
			VLegalDocumentModelImpl.FINDER_CACHE_ENABLED,
			FINDER_CLASS_NAME_LIST, "countByGroupId",
			new String[] { Long.class.getName() });
	public static final FinderPath FINDER_PATH_FIND_BY_PROMULDATE = new FinderPath(VLegalDocumentModelImpl.ENTITY_CACHE_ENABLED,
			VLegalDocumentModelImpl.FINDER_CACHE_ENABLED,
			FINDER_CLASS_NAME_LIST, "findByPromulDate",
			new String[] {
				String.class.getName(), Date.class.getName(),
				Integer.class.getName(),
				
			"java.lang.Integer", "java.lang.Integer",
				"com.liferay.portal.kernel.util.OrderByComparator"
			});
	public static final FinderPath FINDER_PATH_COUNT_BY_PROMULDATE = new FinderPath(VLegalDocumentModelImpl.ENTITY_CACHE_ENABLED,
			VLegalDocumentModelImpl.FINDER_CACHE_ENABLED,
			FINDER_CLASS_NAME_LIST, "countByPromulDate",
			new String[] {
				String.class.getName(), Date.class.getName(),
				Integer.class.getName()
			});
	public static final FinderPath FINDER_PATH_FIND_BY_G_L = new FinderPath(VLegalDocumentModelImpl.ENTITY_CACHE_ENABLED,
			VLegalDocumentModelImpl.FINDER_CACHE_ENABLED,
			FINDER_CLASS_NAME_LIST, "findByG_L",
			new String[] {
				Long.class.getName(), String.class.getName(),
				
			"java.lang.Integer", "java.lang.Integer",
				"com.liferay.portal.kernel.util.OrderByComparator"
			});
	public static final FinderPath FINDER_PATH_COUNT_BY_G_L = new FinderPath(VLegalDocumentModelImpl.ENTITY_CACHE_ENABLED,
			VLegalDocumentModelImpl.FINDER_CACHE_ENABLED,
			FINDER_CLASS_NAME_LIST, "countByG_L",
			new String[] { Long.class.getName(), String.class.getName() });
	public static final FinderPath FINDER_PATH_FIND_BY_DOCSBYF_O_T_L_S = new FinderPath(VLegalDocumentModelImpl.ENTITY_CACHE_ENABLED,
			VLegalDocumentModelImpl.FINDER_CACHE_ENABLED,
			FINDER_CLASS_NAME_LIST, "findByDocsByF_O_T_L_S",
			new String[] {
				Long.class.getName(), String.class.getName(),
				String.class.getName(), String.class.getName(),
				String.class.getName(), Integer.class.getName(),
				
			"java.lang.Integer", "java.lang.Integer",
				"com.liferay.portal.kernel.util.OrderByComparator"
			});
	public static final FinderPath FINDER_PATH_COUNT_BY_DOCSBYF_O_T_L_S = new FinderPath(VLegalDocumentModelImpl.ENTITY_CACHE_ENABLED,
			VLegalDocumentModelImpl.FINDER_CACHE_ENABLED,
			FINDER_CLASS_NAME_LIST, "countByDocsByF_O_T_L_S",
			new String[] {
				Long.class.getName(), String.class.getName(),
				String.class.getName(), String.class.getName(),
				String.class.getName(), Integer.class.getName()
			});
	public static final FinderPath FINDER_PATH_FIND_BY_DOCSBYF_T_O_L_S = new FinderPath(VLegalDocumentModelImpl.ENTITY_CACHE_ENABLED,
			VLegalDocumentModelImpl.FINDER_CACHE_ENABLED,
			FINDER_CLASS_NAME_LIST, "findByDocsByF_T_O_L_S",
			new String[] {
				String.class.getName(), String.class.getName(),
				String.class.getName(), String.class.getName(),
				Integer.class.getName(),
				
			"java.lang.Integer", "java.lang.Integer",
				"com.liferay.portal.kernel.util.OrderByComparator"
			});
	public static final FinderPath FINDER_PATH_COUNT_BY_DOCSBYF_T_O_L_S = new FinderPath(VLegalDocumentModelImpl.ENTITY_CACHE_ENABLED,
			VLegalDocumentModelImpl.FINDER_CACHE_ENABLED,
			FINDER_CLASS_NAME_LIST, "countByDocsByF_T_O_L_S",
			new String[] {
				String.class.getName(), String.class.getName(),
				String.class.getName(), String.class.getName(),
				Integer.class.getName()
			});
	public static final FinderPath FINDER_PATH_FIND_BY_DOCSBYF_C_O_T_L_S = new FinderPath(VLegalDocumentModelImpl.ENTITY_CACHE_ENABLED,
			VLegalDocumentModelImpl.FINDER_CACHE_ENABLED,
			FINDER_CLASS_NAME_LIST, "findByDocsByF_C_O_T_L_S",
			new String[] {
				Long.class.getName(), String.class.getName(),
				String.class.getName(), String.class.getName(),
				String.class.getName(), Integer.class.getName(),
				
			"java.lang.Integer", "java.lang.Integer",
				"com.liferay.portal.kernel.util.OrderByComparator"
			});
	public static final FinderPath FINDER_PATH_COUNT_BY_DOCSBYF_C_O_T_L_S = new FinderPath(VLegalDocumentModelImpl.ENTITY_CACHE_ENABLED,
			VLegalDocumentModelImpl.FINDER_CACHE_ENABLED,
			FINDER_CLASS_NAME_LIST, "countByDocsByF_C_O_T_L_S",
			new String[] {
				Long.class.getName(), String.class.getName(),
				String.class.getName(), String.class.getName(),
				String.class.getName(), Integer.class.getName()
			});
	public static final FinderPath FINDER_PATH_FIND_BY_DOCSBYC_T_O = new FinderPath(VLegalDocumentModelImpl.ENTITY_CACHE_ENABLED,
			VLegalDocumentModelImpl.FINDER_CACHE_ENABLED,
			FINDER_CLASS_NAME_LIST, "findByDocsByC_T_O",
			new String[] {
				Long.class.getName(), String.class.getName(),
				String.class.getName(), String.class.getName(),
				String.class.getName(), Integer.class.getName(),
				
			"java.lang.Integer", "java.lang.Integer",
				"com.liferay.portal.kernel.util.OrderByComparator"
			});
	public static final FinderPath FINDER_PATH_COUNT_BY_DOCSBYC_T_O = new FinderPath(VLegalDocumentModelImpl.ENTITY_CACHE_ENABLED,
			VLegalDocumentModelImpl.FINDER_CACHE_ENABLED,
			FINDER_CLASS_NAME_LIST, "countByDocsByC_T_O",
			new String[] {
				Long.class.getName(), String.class.getName(),
				String.class.getName(), String.class.getName(),
				String.class.getName(), Integer.class.getName()
			});
	public static final FinderPath FINDER_PATH_FIND_BY_DOCSBYG_O_T_L_S = new FinderPath(VLegalDocumentModelImpl.ENTITY_CACHE_ENABLED,
			VLegalDocumentModelImpl.FINDER_CACHE_ENABLED,
			FINDER_CLASS_NAME_LIST, "findByDocsByG_O_T_L_S",
			new String[] {
				Long.class.getName(), String.class.getName(),
				String.class.getName(), String.class.getName(),
				Integer.class.getName(),
				
			"java.lang.Integer", "java.lang.Integer",
				"com.liferay.portal.kernel.util.OrderByComparator"
			});
	public static final FinderPath FINDER_PATH_COUNT_BY_DOCSBYG_O_T_L_S = new FinderPath(VLegalDocumentModelImpl.ENTITY_CACHE_ENABLED,
			VLegalDocumentModelImpl.FINDER_CACHE_ENABLED,
			FINDER_CLASS_NAME_LIST, "countByDocsByG_O_T_L_S",
			new String[] {
				Long.class.getName(), String.class.getName(),
				String.class.getName(), String.class.getName(),
				Integer.class.getName()
			});
	public static final FinderPath FINDER_PATH_FIND_BY_DOCSBYL_O_F_S = new FinderPath(VLegalDocumentModelImpl.ENTITY_CACHE_ENABLED,
			VLegalDocumentModelImpl.FINDER_CACHE_ENABLED,
			FINDER_CLASS_NAME_LIST, "findByDocsByL_O_F_S",
			new String[] {
				String.class.getName(), String.class.getName(),
				String.class.getName(), Integer.class.getName(),
				
			"java.lang.Integer", "java.lang.Integer",
				"com.liferay.portal.kernel.util.OrderByComparator"
			});
	public static final FinderPath FINDER_PATH_COUNT_BY_DOCSBYL_O_F_S = new FinderPath(VLegalDocumentModelImpl.ENTITY_CACHE_ENABLED,
			VLegalDocumentModelImpl.FINDER_CACHE_ENABLED,
			FINDER_CLASS_NAME_LIST, "countByDocsByL_O_F_S",
			new String[] {
				String.class.getName(), String.class.getName(),
				String.class.getName(), Integer.class.getName()
			});
	public static final FinderPath FINDER_PATH_FIND_BY_DOCSBYL_T_F_S = new FinderPath(VLegalDocumentModelImpl.ENTITY_CACHE_ENABLED,
			VLegalDocumentModelImpl.FINDER_CACHE_ENABLED,
			FINDER_CLASS_NAME_LIST, "findByDocsByL_T_F_S",
			new String[] {
				String.class.getName(), String.class.getName(),
				String.class.getName(), Integer.class.getName(),
				
			"java.lang.Integer", "java.lang.Integer",
				"com.liferay.portal.kernel.util.OrderByComparator"
			});
	public static final FinderPath FINDER_PATH_COUNT_BY_DOCSBYL_T_F_S = new FinderPath(VLegalDocumentModelImpl.ENTITY_CACHE_ENABLED,
			VLegalDocumentModelImpl.FINDER_CACHE_ENABLED,
			FINDER_CLASS_NAME_LIST, "countByDocsByL_T_F_S",
			new String[] {
				String.class.getName(), String.class.getName(),
				String.class.getName(), Integer.class.getName()
			});
	public static final FinderPath FINDER_PATH_FIND_BY_DOCSBYT_L = new FinderPath(VLegalDocumentModelImpl.ENTITY_CACHE_ENABLED,
			VLegalDocumentModelImpl.FINDER_CACHE_ENABLED,
			FINDER_CLASS_NAME_LIST, "findByDocsByT_L",
			new String[] {
				String.class.getName(), String.class.getName(),
				
			"java.lang.Integer", "java.lang.Integer",
				"com.liferay.portal.kernel.util.OrderByComparator"
			});
	public static final FinderPath FINDER_PATH_COUNT_BY_DOCSBYT_L = new FinderPath(VLegalDocumentModelImpl.ENTITY_CACHE_ENABLED,
			VLegalDocumentModelImpl.FINDER_CACHE_ENABLED,
			FINDER_CLASS_NAME_LIST, "countByDocsByT_L",
			new String[] { String.class.getName(), String.class.getName() });
	public static final FinderPath FINDER_PATH_FIND_BY_G_L_U_S = new FinderPath(VLegalDocumentModelImpl.ENTITY_CACHE_ENABLED,
			VLegalDocumentModelImpl.FINDER_CACHE_ENABLED,
			FINDER_CLASS_NAME_LIST, "findByG_L_U_S",
			new String[] {
				Long.class.getName(), String.class.getName(),
				Long.class.getName(), Integer.class.getName(),
				
			"java.lang.Integer", "java.lang.Integer",
				"com.liferay.portal.kernel.util.OrderByComparator"
			});
	public static final FinderPath FINDER_PATH_COUNT_BY_G_L_U_S = new FinderPath(VLegalDocumentModelImpl.ENTITY_CACHE_ENABLED,
			VLegalDocumentModelImpl.FINDER_CACHE_ENABLED,
			FINDER_CLASS_NAME_LIST, "countByG_L_U_S",
			new String[] {
				Long.class.getName(), String.class.getName(),
				Long.class.getName(), Integer.class.getName()
			});
	public static final FinderPath FINDER_PATH_FETCH_BY_G_D = new FinderPath(VLegalDocumentModelImpl.ENTITY_CACHE_ENABLED,
			VLegalDocumentModelImpl.FINDER_CACHE_ENABLED,
			FINDER_CLASS_NAME_ENTITY, "fetchByG_D",
			new String[] { Long.class.getName(), String.class.getName() });
	public static final FinderPath FINDER_PATH_COUNT_BY_G_D = new FinderPath(VLegalDocumentModelImpl.ENTITY_CACHE_ENABLED,
			VLegalDocumentModelImpl.FINDER_CACHE_ENABLED,
			FINDER_CLASS_NAME_LIST, "countByG_D",
			new String[] { Long.class.getName(), String.class.getName() });
	public static final FinderPath FINDER_PATH_FETCH_BY_P_N_S = new FinderPath(VLegalDocumentModelImpl.ENTITY_CACHE_ENABLED,
			VLegalDocumentModelImpl.FINDER_CACHE_ENABLED,
			FINDER_CLASS_NAME_ENTITY, "fetchByP_N_S",
			new String[] {
				Long.class.getName(), String.class.getName(),
				String.class.getName()
			});
	public static final FinderPath FINDER_PATH_COUNT_BY_P_N_S = new FinderPath(VLegalDocumentModelImpl.ENTITY_CACHE_ENABLED,
			VLegalDocumentModelImpl.FINDER_CACHE_ENABLED,
			FINDER_CLASS_NAME_LIST, "countByP_N_S",
			new String[] {
				Long.class.getName(), String.class.getName(),
				String.class.getName()
			});
	public static final FinderPath FINDER_PATH_FIND_BY_P_L_S = new FinderPath(VLegalDocumentModelImpl.ENTITY_CACHE_ENABLED,
			VLegalDocumentModelImpl.FINDER_CACHE_ENABLED,
			FINDER_CLASS_NAME_LIST, "findByP_L_S",
			new String[] {
				Long.class.getName(), String.class.getName(),
				Integer.class.getName(),
				
			"java.lang.Integer", "java.lang.Integer",
				"com.liferay.portal.kernel.util.OrderByComparator"
			});
	public static final FinderPath FINDER_PATH_COUNT_BY_P_L_S = new FinderPath(VLegalDocumentModelImpl.ENTITY_CACHE_ENABLED,
			VLegalDocumentModelImpl.FINDER_CACHE_ENABLED,
			FINDER_CLASS_NAME_LIST, "countByP_L_S",
			new String[] {
				Long.class.getName(), String.class.getName(),
				Integer.class.getName()
			});
	public static final FinderPath FINDER_PATH_FIND_BY_STATUSDOC = new FinderPath(VLegalDocumentModelImpl.ENTITY_CACHE_ENABLED,
			VLegalDocumentModelImpl.FINDER_CACHE_ENABLED,
			FINDER_CLASS_NAME_LIST, "findBystatusDoc",
			new String[] {
				Integer.class.getName(),
				
			"java.lang.Integer", "java.lang.Integer",
				"com.liferay.portal.kernel.util.OrderByComparator"
			});
	public static final FinderPath FINDER_PATH_COUNT_BY_STATUSDOC = new FinderPath(VLegalDocumentModelImpl.ENTITY_CACHE_ENABLED,
			VLegalDocumentModelImpl.FINDER_CACHE_ENABLED,
			FINDER_CLASS_NAME_LIST, "countBystatusDoc",
			new String[] { Integer.class.getName() });
	public static final FinderPath FINDER_PATH_FIND_BY_G_L_O_S = new FinderPath(VLegalDocumentModelImpl.ENTITY_CACHE_ENABLED,
			VLegalDocumentModelImpl.FINDER_CACHE_ENABLED,
			FINDER_CLASS_NAME_LIST, "findByG_L_O_S",
			new String[] {
				Long.class.getName(), String.class.getName(),
				String.class.getName(), Integer.class.getName(),
				
			"java.lang.Integer", "java.lang.Integer",
				"com.liferay.portal.kernel.util.OrderByComparator"
			});
	public static final FinderPath FINDER_PATH_COUNT_BY_G_L_O_S = new FinderPath(VLegalDocumentModelImpl.ENTITY_CACHE_ENABLED,
			VLegalDocumentModelImpl.FINDER_CACHE_ENABLED,
			FINDER_CLASS_NAME_LIST, "countByG_L_O_S",
			new String[] {
				Long.class.getName(), String.class.getName(),
				String.class.getName(), Integer.class.getName()
			});
	public static final FinderPath FINDER_PATH_FIND_BY_G_L_T_S = new FinderPath(VLegalDocumentModelImpl.ENTITY_CACHE_ENABLED,
			VLegalDocumentModelImpl.FINDER_CACHE_ENABLED,
			FINDER_CLASS_NAME_LIST, "findByG_L_T_S",
			new String[] {
				Long.class.getName(), String.class.getName(),
				String.class.getName(), Integer.class.getName(),
				
			"java.lang.Integer", "java.lang.Integer",
				"com.liferay.portal.kernel.util.OrderByComparator"
			});
	public static final FinderPath FINDER_PATH_COUNT_BY_G_L_T_S = new FinderPath(VLegalDocumentModelImpl.ENTITY_CACHE_ENABLED,
			VLegalDocumentModelImpl.FINDER_CACHE_ENABLED,
			FINDER_CLASS_NAME_LIST, "countByG_L_T_S",
			new String[] {
				Long.class.getName(), String.class.getName(),
				String.class.getName(), Integer.class.getName()
			});
	public static final FinderPath FINDER_PATH_FIND_BY_L_F_S = new FinderPath(VLegalDocumentModelImpl.ENTITY_CACHE_ENABLED,
			VLegalDocumentModelImpl.FINDER_CACHE_ENABLED,
			FINDER_CLASS_NAME_LIST, "findByL_F_S",
			new String[] {
				String.class.getName(), String.class.getName(),
				Integer.class.getName(),
				
			"java.lang.Integer", "java.lang.Integer",
				"com.liferay.portal.kernel.util.OrderByComparator"
			});
	public static final FinderPath FINDER_PATH_COUNT_BY_L_F_S = new FinderPath(VLegalDocumentModelImpl.ENTITY_CACHE_ENABLED,
			VLegalDocumentModelImpl.FINDER_CACHE_ENABLED,
			FINDER_CLASS_NAME_LIST, "countByL_F_S",
			new String[] {
				String.class.getName(), String.class.getName(),
				Integer.class.getName()
			});
	public static final FinderPath FINDER_PATH_FIND_BY_G_L_F_S = new FinderPath(VLegalDocumentModelImpl.ENTITY_CACHE_ENABLED,
			VLegalDocumentModelImpl.FINDER_CACHE_ENABLED,
			FINDER_CLASS_NAME_LIST, "findByG_L_F_S",
			new String[] {
				Long.class.getName(), String.class.getName(),
				String.class.getName(), Integer.class.getName(),
				
			"java.lang.Integer", "java.lang.Integer",
				"com.liferay.portal.kernel.util.OrderByComparator"
			});
	public static final FinderPath FINDER_PATH_COUNT_BY_G_L_F_S = new FinderPath(VLegalDocumentModelImpl.ENTITY_CACHE_ENABLED,
			VLegalDocumentModelImpl.FINDER_CACHE_ENABLED,
			FINDER_CLASS_NAME_LIST, "countByG_L_F_S",
			new String[] {
				Long.class.getName(), String.class.getName(),
				String.class.getName(), Integer.class.getName()
			});
	public static final FinderPath FINDER_PATH_FIND_BY_G_L_O = new FinderPath(VLegalDocumentModelImpl.ENTITY_CACHE_ENABLED,
			VLegalDocumentModelImpl.FINDER_CACHE_ENABLED,
			FINDER_CLASS_NAME_LIST, "findByG_L_O",
			new String[] {
				Long.class.getName(), String.class.getName(),
				String.class.getName(),
				
			"java.lang.Integer", "java.lang.Integer",
				"com.liferay.portal.kernel.util.OrderByComparator"
			});
	public static final FinderPath FINDER_PATH_COUNT_BY_G_L_O = new FinderPath(VLegalDocumentModelImpl.ENTITY_CACHE_ENABLED,
			VLegalDocumentModelImpl.FINDER_CACHE_ENABLED,
			FINDER_CLASS_NAME_LIST, "countByG_L_O",
			new String[] {
				Long.class.getName(), String.class.getName(),
				String.class.getName()
			});
	public static final FinderPath FINDER_PATH_FIND_BY_L_O = new FinderPath(VLegalDocumentModelImpl.ENTITY_CACHE_ENABLED,
			VLegalDocumentModelImpl.FINDER_CACHE_ENABLED,
			FINDER_CLASS_NAME_LIST, "findByL_O",
			new String[] {
				String.class.getName(), String.class.getName(),
				Integer.class.getName(),
				
			"java.lang.Integer", "java.lang.Integer",
				"com.liferay.portal.kernel.util.OrderByComparator"
			});
	public static final FinderPath FINDER_PATH_COUNT_BY_L_O = new FinderPath(VLegalDocumentModelImpl.ENTITY_CACHE_ENABLED,
			VLegalDocumentModelImpl.FINDER_CACHE_ENABLED,
			FINDER_CLASS_NAME_LIST, "countByL_O",
			new String[] {
				String.class.getName(), String.class.getName(),
				Integer.class.getName()
			});
	public static final FinderPath FINDER_PATH_FIND_BY_G_L_T = new FinderPath(VLegalDocumentModelImpl.ENTITY_CACHE_ENABLED,
			VLegalDocumentModelImpl.FINDER_CACHE_ENABLED,
			FINDER_CLASS_NAME_LIST, "findByG_L_T",
			new String[] {
				Long.class.getName(), String.class.getName(),
				String.class.getName(),
				
			"java.lang.Integer", "java.lang.Integer",
				"com.liferay.portal.kernel.util.OrderByComparator"
			});
	public static final FinderPath FINDER_PATH_COUNT_BY_G_L_T = new FinderPath(VLegalDocumentModelImpl.ENTITY_CACHE_ENABLED,
			VLegalDocumentModelImpl.FINDER_CACHE_ENABLED,
			FINDER_CLASS_NAME_LIST, "countByG_L_T",
			new String[] {
				Long.class.getName(), String.class.getName(),
				String.class.getName()
			});
	public static final FinderPath FINDER_PATH_FIND_BY_G_L_F = new FinderPath(VLegalDocumentModelImpl.ENTITY_CACHE_ENABLED,
			VLegalDocumentModelImpl.FINDER_CACHE_ENABLED,
			FINDER_CLASS_NAME_LIST, "findByG_L_F",
			new String[] {
				Long.class.getName(), String.class.getName(),
				String.class.getName(),
				
			"java.lang.Integer", "java.lang.Integer",
				"com.liferay.portal.kernel.util.OrderByComparator"
			});
	public static final FinderPath FINDER_PATH_COUNT_BY_G_L_F = new FinderPath(VLegalDocumentModelImpl.ENTITY_CACHE_ENABLED,
			VLegalDocumentModelImpl.FINDER_CACHE_ENABLED,
			FINDER_CLASS_NAME_LIST, "countByG_L_F",
			new String[] {
				Long.class.getName(), String.class.getName(),
				String.class.getName()
			});
	public static final FinderPath FINDER_PATH_FIND_BY_P_U_S = new FinderPath(VLegalDocumentModelImpl.ENTITY_CACHE_ENABLED,
			VLegalDocumentModelImpl.FINDER_CACHE_ENABLED,
			FINDER_CLASS_NAME_LIST, "findByP_U_S",
			new String[] {
				Long.class.getName(), Long.class.getName(),
				String.class.getName(), Integer.class.getName(),
				
			"java.lang.Integer", "java.lang.Integer",
				"com.liferay.portal.kernel.util.OrderByComparator"
			});
	public static final FinderPath FINDER_PATH_COUNT_BY_P_U_S = new FinderPath(VLegalDocumentModelImpl.ENTITY_CACHE_ENABLED,
			VLegalDocumentModelImpl.FINDER_CACHE_ENABLED,
			FINDER_CLASS_NAME_LIST, "countByP_U_S",
			new String[] {
				Long.class.getName(), Long.class.getName(),
				String.class.getName(), Integer.class.getName()
			});
	public static final FinderPath FINDER_PATH_FIND_BY_STATUS = new FinderPath(VLegalDocumentModelImpl.ENTITY_CACHE_ENABLED,
			VLegalDocumentModelImpl.FINDER_CACHE_ENABLED,
			FINDER_CLASS_NAME_LIST, "findByStatus",
			new String[] {
				Integer.class.getName(),
				
			"java.lang.Integer", "java.lang.Integer",
				"com.liferay.portal.kernel.util.OrderByComparator"
			});
	public static final FinderPath FINDER_PATH_COUNT_BY_STATUS = new FinderPath(VLegalDocumentModelImpl.ENTITY_CACHE_ENABLED,
			VLegalDocumentModelImpl.FINDER_CACHE_ENABLED,
			FINDER_CLASS_NAME_LIST, "countByStatus",
			new String[] { Integer.class.getName() });
	public static final FinderPath FINDER_PATH_FIND_BY_L_S = new FinderPath(VLegalDocumentModelImpl.ENTITY_CACHE_ENABLED,
			VLegalDocumentModelImpl.FINDER_CACHE_ENABLED,
			FINDER_CLASS_NAME_LIST, "findByL_S",
			new String[] {
				String.class.getName(), Integer.class.getName(),
				
			"java.lang.Integer", "java.lang.Integer",
				"com.liferay.portal.kernel.util.OrderByComparator"
			});
	public static final FinderPath FINDER_PATH_COUNT_BY_L_S = new FinderPath(VLegalDocumentModelImpl.ENTITY_CACHE_ENABLED,
			VLegalDocumentModelImpl.FINDER_CACHE_ENABLED,
			FINDER_CLASS_NAME_LIST, "countByL_S",
			new String[] { String.class.getName(), Integer.class.getName() });
	public static final FinderPath FINDER_PATH_FIND_ALL = new FinderPath(VLegalDocumentModelImpl.ENTITY_CACHE_ENABLED,
			VLegalDocumentModelImpl.FINDER_CACHE_ENABLED,
			FINDER_CLASS_NAME_LIST, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(VLegalDocumentModelImpl.ENTITY_CACHE_ENABLED,
			VLegalDocumentModelImpl.FINDER_CACHE_ENABLED,
			FINDER_CLASS_NAME_LIST, "countAll", new String[0]);

	/**
	 * Caches the v legal document in the entity cache if it is enabled.
	 *
	 * @param vLegalDocument the v legal document to cache
	 */
	public void cacheResult(VLegalDocument vLegalDocument) {
		EntityCacheUtil.putResult(VLegalDocumentModelImpl.ENTITY_CACHE_ENABLED,
			VLegalDocumentImpl.class, vLegalDocument.getPrimaryKey(),
			vLegalDocument);

		FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_G_D,
			new Object[] {
				new Long(vLegalDocument.getGroupId()),
				
			vLegalDocument.getDocId()
			}, vLegalDocument);

		FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_P_N_S,
			new Object[] {
				new Long(vLegalDocument.getGroupId()),
				
			vLegalDocument.getNum(),
				
			vLegalDocument.getSymbol()
			}, vLegalDocument);
	}

	/**
	 * Caches the v legal documents in the entity cache if it is enabled.
	 *
	 * @param vLegalDocuments the v legal documents to cache
	 */
	public void cacheResult(List<VLegalDocument> vLegalDocuments) {
		for (VLegalDocument vLegalDocument : vLegalDocuments) {
			if (EntityCacheUtil.getResult(
						VLegalDocumentModelImpl.ENTITY_CACHE_ENABLED,
						VLegalDocumentImpl.class,
						vLegalDocument.getPrimaryKey(), this) == null) {
				cacheResult(vLegalDocument);
			}
		}
	}

	/**
	 * Clears the cache for all v legal documents.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	public void clearCache() {
		CacheRegistryUtil.clear(VLegalDocumentImpl.class.getName());
		EntityCacheUtil.clearCache(VLegalDocumentImpl.class.getName());
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST);
	}

	/**
	 * Clears the cache for the v legal document.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	public void clearCache(VLegalDocument vLegalDocument) {
		EntityCacheUtil.removeResult(VLegalDocumentModelImpl.ENTITY_CACHE_ENABLED,
			VLegalDocumentImpl.class, vLegalDocument.getPrimaryKey());

		FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_G_D,
			new Object[] {
				new Long(vLegalDocument.getGroupId()),
				
			vLegalDocument.getDocId()
			});

		FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_P_N_S,
			new Object[] {
				new Long(vLegalDocument.getGroupId()),
				
			vLegalDocument.getNum(),
				
			vLegalDocument.getSymbol()
			});
	}

	/**
	 * Creates a new v legal document with the primary key. Does not add the v legal document to the database.
	 *
	 * @param docId the primary key for the new v legal document
	 * @return the new v legal document
	 */
	public VLegalDocument create(String docId) {
		VLegalDocument vLegalDocument = new VLegalDocumentImpl();

		vLegalDocument.setNew(true);
		vLegalDocument.setPrimaryKey(docId);

		return vLegalDocument;
	}

	/**
	 * Removes the v legal document with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the v legal document to remove
	 * @return the v legal document that was removed
	 * @throws com.liferay.portal.NoSuchModelException if a v legal document with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public VLegalDocument remove(Serializable primaryKey)
		throws NoSuchModelException, SystemException {
		return remove((String)primaryKey);
	}

	/**
	 * Removes the v legal document with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param docId the primary key of the v legal document to remove
	 * @return the v legal document that was removed
	 * @throws com.vportal.portlet.vlegal.NoSuchVLegalDocumentException if a v legal document with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public VLegalDocument remove(String docId)
		throws NoSuchVLegalDocumentException, SystemException {
		Session session = null;

		try {
			session = openSession();

			VLegalDocument vLegalDocument = (VLegalDocument)session.get(VLegalDocumentImpl.class,
					docId);

			if (vLegalDocument == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + docId);
				}

				throw new NoSuchVLegalDocumentException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					docId);
			}

			return remove(vLegalDocument);
		}
		catch (NoSuchVLegalDocumentException nsee) {
			throw nsee;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected VLegalDocument removeImpl(VLegalDocument vLegalDocument)
		throws SystemException {
		vLegalDocument = toUnwrappedModel(vLegalDocument);

		Session session = null;

		try {
			session = openSession();

			BatchSessionUtil.delete(session, vLegalDocument);
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST);

		VLegalDocumentModelImpl vLegalDocumentModelImpl = (VLegalDocumentModelImpl)vLegalDocument;

		FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_G_D,
			new Object[] {
				new Long(vLegalDocumentModelImpl.getGroupId()),
				
			vLegalDocumentModelImpl.getDocId()
			});

		FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_P_N_S,
			new Object[] {
				new Long(vLegalDocumentModelImpl.getGroupId()),
				
			vLegalDocumentModelImpl.getNum(),
				
			vLegalDocumentModelImpl.getSymbol()
			});

		EntityCacheUtil.removeResult(VLegalDocumentModelImpl.ENTITY_CACHE_ENABLED,
			VLegalDocumentImpl.class, vLegalDocument.getPrimaryKey());

		return vLegalDocument;
	}

	public VLegalDocument updateImpl(
		com.vportal.portlet.vlegal.model.VLegalDocument vLegalDocument,
		boolean merge) throws SystemException {
		vLegalDocument = toUnwrappedModel(vLegalDocument);

		boolean isNew = vLegalDocument.isNew();

		VLegalDocumentModelImpl vLegalDocumentModelImpl = (VLegalDocumentModelImpl)vLegalDocument;

		Session session = null;

		try {
			session = openSession();

			BatchSessionUtil.update(session, vLegalDocument, merge);

			vLegalDocument.setNew(false);
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST);

		EntityCacheUtil.putResult(VLegalDocumentModelImpl.ENTITY_CACHE_ENABLED,
			VLegalDocumentImpl.class, vLegalDocument.getPrimaryKey(),
			vLegalDocument);

		if (!isNew &&
				((vLegalDocument.getGroupId() != vLegalDocumentModelImpl.getOriginalGroupId()) ||
				!Validator.equals(vLegalDocument.getDocId(),
					vLegalDocumentModelImpl.getOriginalDocId()))) {
			FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_G_D,
				new Object[] {
					new Long(vLegalDocumentModelImpl.getOriginalGroupId()),
					
				vLegalDocumentModelImpl.getOriginalDocId()
				});
		}

		if (isNew ||
				((vLegalDocument.getGroupId() != vLegalDocumentModelImpl.getOriginalGroupId()) ||
				!Validator.equals(vLegalDocument.getDocId(),
					vLegalDocumentModelImpl.getOriginalDocId()))) {
			FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_G_D,
				new Object[] {
					new Long(vLegalDocument.getGroupId()),
					
				vLegalDocument.getDocId()
				}, vLegalDocument);
		}

		if (!isNew &&
				((vLegalDocument.getGroupId() != vLegalDocumentModelImpl.getOriginalGroupId()) ||
				!Validator.equals(vLegalDocument.getNum(),
					vLegalDocumentModelImpl.getOriginalNum()) ||
				!Validator.equals(vLegalDocument.getSymbol(),
					vLegalDocumentModelImpl.getOriginalSymbol()))) {
			FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_P_N_S,
				new Object[] {
					new Long(vLegalDocumentModelImpl.getOriginalGroupId()),
					
				vLegalDocumentModelImpl.getOriginalNum(),
					
				vLegalDocumentModelImpl.getOriginalSymbol()
				});
		}

		if (isNew ||
				((vLegalDocument.getGroupId() != vLegalDocumentModelImpl.getOriginalGroupId()) ||
				!Validator.equals(vLegalDocument.getNum(),
					vLegalDocumentModelImpl.getOriginalNum()) ||
				!Validator.equals(vLegalDocument.getSymbol(),
					vLegalDocumentModelImpl.getOriginalSymbol()))) {
			FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_P_N_S,
				new Object[] {
					new Long(vLegalDocument.getGroupId()),
					
				vLegalDocument.getNum(),
					
				vLegalDocument.getSymbol()
				}, vLegalDocument);
		}

		return vLegalDocument;
	}

	protected VLegalDocument toUnwrappedModel(VLegalDocument vLegalDocument) {
		if (vLegalDocument instanceof VLegalDocumentImpl) {
			return vLegalDocument;
		}

		VLegalDocumentImpl vLegalDocumentImpl = new VLegalDocumentImpl();

		vLegalDocumentImpl.setNew(vLegalDocument.isNew());
		vLegalDocumentImpl.setPrimaryKey(vLegalDocument.getPrimaryKey());

		vLegalDocumentImpl.setDocId(vLegalDocument.getDocId());
		vLegalDocumentImpl.setGroupId(vLegalDocument.getGroupId());
		vLegalDocumentImpl.setCompanyId(vLegalDocument.getCompanyId());
		vLegalDocumentImpl.setUserId(vLegalDocument.getUserId());
		vLegalDocumentImpl.setCreatedByUser(vLegalDocument.getCreatedByUser());
		vLegalDocumentImpl.setCreatedDate(vLegalDocument.getCreatedDate());
		vLegalDocumentImpl.setModifiedByUser(vLegalDocument.getModifiedByUser());
		vLegalDocumentImpl.setModifiedDate(vLegalDocument.getModifiedDate());
		vLegalDocumentImpl.setApprovedByUser(vLegalDocument.getApprovedByUser());
		vLegalDocumentImpl.setApprovedDate(vLegalDocument.getApprovedDate());
		vLegalDocumentImpl.setForwardedByUser(vLegalDocument.getForwardedByUser());
		vLegalDocumentImpl.setForwardedDate(vLegalDocument.getForwardedDate());
		vLegalDocumentImpl.setPublishedByUser(vLegalDocument.getPublishedByUser());
		vLegalDocumentImpl.setPublishedDate(vLegalDocument.getPublishedDate());
		vLegalDocumentImpl.setSymbol(vLegalDocument.getSymbol());
		vLegalDocumentImpl.setNum(vLegalDocument.getNum());
		vLegalDocumentImpl.setPromulDate(vLegalDocument.getPromulDate());
		vLegalDocumentImpl.setEffectivedDate(vLegalDocument.getEffectivedDate());
		vLegalDocumentImpl.setExpiredDate(vLegalDocument.getExpiredDate());
		vLegalDocumentImpl.setReplaceDoc(vLegalDocument.getReplaceDoc());
		vLegalDocumentImpl.setSummary(vLegalDocument.getSummary());
		vLegalDocumentImpl.setContent(vLegalDocument.getContent());
		vLegalDocumentImpl.setLanguage(vLegalDocument.getLanguage());
		vLegalDocumentImpl.setUserHit(vLegalDocument.getUserHit());
		vLegalDocumentImpl.setStatusDoc(vLegalDocument.getStatusDoc());
		vLegalDocumentImpl.setHasAttachment(vLegalDocument.isHasAttachment());
		vLegalDocumentImpl.setTypeDocId(vLegalDocument.getTypeDocId());
		vLegalDocumentImpl.setFieldId(vLegalDocument.getFieldId());
		vLegalDocumentImpl.setOrgId(vLegalDocument.getOrgId());
		vLegalDocumentImpl.setOrgRels(vLegalDocument.getOrgRels());
		vLegalDocumentImpl.setSignerRels(vLegalDocument.getSignerRels());
		vLegalDocumentImpl.setFieldRels(vLegalDocument.getFieldRels());
		vLegalDocumentImpl.setNumRels(vLegalDocument.getNumRels());
		vLegalDocumentImpl.setDocCode(vLegalDocument.getDocCode());
		vLegalDocumentImpl.setDepartmentRels(vLegalDocument.getDepartmentRels());

		return vLegalDocumentImpl;
	}

	/**
	 * Finds the v legal document with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the v legal document to find
	 * @return the v legal document
	 * @throws com.liferay.portal.NoSuchModelException if a v legal document with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public VLegalDocument findByPrimaryKey(Serializable primaryKey)
		throws NoSuchModelException, SystemException {
		return findByPrimaryKey((String)primaryKey);
	}

	/**
	 * Finds the v legal document with the primary key or throws a {@link com.vportal.portlet.vlegal.NoSuchVLegalDocumentException} if it could not be found.
	 *
	 * @param docId the primary key of the v legal document to find
	 * @return the v legal document
	 * @throws com.vportal.portlet.vlegal.NoSuchVLegalDocumentException if a v legal document with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public VLegalDocument findByPrimaryKey(String docId)
		throws NoSuchVLegalDocumentException, SystemException {
		VLegalDocument vLegalDocument = fetchByPrimaryKey(docId);

		if (vLegalDocument == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + docId);
			}

			throw new NoSuchVLegalDocumentException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				docId);
		}

		return vLegalDocument;
	}

	/**
	 * Finds the v legal document with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the v legal document to find
	 * @return the v legal document, or <code>null</code> if a v legal document with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public VLegalDocument fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		return fetchByPrimaryKey((String)primaryKey);
	}

	/**
	 * Finds the v legal document with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param docId the primary key of the v legal document to find
	 * @return the v legal document, or <code>null</code> if a v legal document with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public VLegalDocument fetchByPrimaryKey(String docId)
		throws SystemException {
		VLegalDocument vLegalDocument = (VLegalDocument)EntityCacheUtil.getResult(VLegalDocumentModelImpl.ENTITY_CACHE_ENABLED,
				VLegalDocumentImpl.class, docId, this);

		if (vLegalDocument == null) {
			Session session = null;

			try {
				session = openSession();

				vLegalDocument = (VLegalDocument)session.get(VLegalDocumentImpl.class,
						docId);
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (vLegalDocument != null) {
					cacheResult(vLegalDocument);
				}

				closeSession(session);
			}
		}

		return vLegalDocument;
	}

	/**
	 * Finds all the v legal documents where groupId = &#63;.
	 *
	 * @param groupId the group id to search with
	 * @return the matching v legal documents
	 * @throws SystemException if a system exception occurred
	 */
	public List<VLegalDocument> findByGroupId(long groupId)
		throws SystemException {
		return findByGroupId(groupId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Finds a range of all the v legal documents where groupId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param groupId the group id to search with
	 * @param start the lower bound of the range of v legal documents to return
	 * @param end the upper bound of the range of v legal documents to return (not inclusive)
	 * @return the range of matching v legal documents
	 * @throws SystemException if a system exception occurred
	 */
	public List<VLegalDocument> findByGroupId(long groupId, int start, int end)
		throws SystemException {
		return findByGroupId(groupId, start, end, null);
	}

	/**
	 * Finds an ordered range of all the v legal documents where groupId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param groupId the group id to search with
	 * @param start the lower bound of the range of v legal documents to return
	 * @param end the upper bound of the range of v legal documents to return (not inclusive)
	 * @param orderByComparator the comparator to order the results by
	 * @return the ordered range of matching v legal documents
	 * @throws SystemException if a system exception occurred
	 */
	public List<VLegalDocument> findByGroupId(long groupId, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		Object[] finderArgs = new Object[] {
				groupId,
				
				String.valueOf(start), String.valueOf(end),
				String.valueOf(orderByComparator)
			};

		List<VLegalDocument> list = (List<VLegalDocument>)FinderCacheUtil.getResult(FINDER_PATH_FIND_BY_GROUPID,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;

			if (orderByComparator != null) {
				query = new StringBundler(3 +
						(orderByComparator.getOrderByFields().length * 3));
			}
			else {
				query = new StringBundler(3);
			}

			query.append(_SQL_SELECT_VLEGALDOCUMENT_WHERE);

			query.append(_FINDER_COLUMN_GROUPID_GROUPID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}

			else {
				query.append(VLegalDocumentModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(groupId);

				list = (List<VLegalDocument>)QueryUtil.list(q, getDialect(),
						start, end);
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (list == null) {
					FinderCacheUtil.removeResult(FINDER_PATH_FIND_BY_GROUPID,
						finderArgs);
				}
				else {
					cacheResult(list);

					FinderCacheUtil.putResult(FINDER_PATH_FIND_BY_GROUPID,
						finderArgs, list);
				}

				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Finds the first v legal document in the ordered set where groupId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param groupId the group id to search with
	 * @param orderByComparator the comparator to order the set by
	 * @return the first matching v legal document
	 * @throws com.vportal.portlet.vlegal.NoSuchVLegalDocumentException if a matching v legal document could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public VLegalDocument findByGroupId_First(long groupId,
		OrderByComparator orderByComparator)
		throws NoSuchVLegalDocumentException, SystemException {
		List<VLegalDocument> list = findByGroupId(groupId, 0, 1,
				orderByComparator);

		if (list.isEmpty()) {
			StringBundler msg = new StringBundler(4);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("groupId=");
			msg.append(groupId);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			throw new NoSuchVLegalDocumentException(msg.toString());
		}
		else {
			return list.get(0);
		}
	}

	/**
	 * Finds the last v legal document in the ordered set where groupId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param groupId the group id to search with
	 * @param orderByComparator the comparator to order the set by
	 * @return the last matching v legal document
	 * @throws com.vportal.portlet.vlegal.NoSuchVLegalDocumentException if a matching v legal document could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public VLegalDocument findByGroupId_Last(long groupId,
		OrderByComparator orderByComparator)
		throws NoSuchVLegalDocumentException, SystemException {
		int count = countByGroupId(groupId);

		List<VLegalDocument> list = findByGroupId(groupId, count - 1, count,
				orderByComparator);

		if (list.isEmpty()) {
			StringBundler msg = new StringBundler(4);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("groupId=");
			msg.append(groupId);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			throw new NoSuchVLegalDocumentException(msg.toString());
		}
		else {
			return list.get(0);
		}
	}

	/**
	 * Finds the v legal documents before and after the current v legal document in the ordered set where groupId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param docId the primary key of the current v legal document
	 * @param groupId the group id to search with
	 * @param orderByComparator the comparator to order the set by
	 * @return the previous, current, and next v legal document
	 * @throws com.vportal.portlet.vlegal.NoSuchVLegalDocumentException if a v legal document with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public VLegalDocument[] findByGroupId_PrevAndNext(String docId,
		long groupId, OrderByComparator orderByComparator)
		throws NoSuchVLegalDocumentException, SystemException {
		VLegalDocument vLegalDocument = findByPrimaryKey(docId);

		Session session = null;

		try {
			session = openSession();

			VLegalDocument[] array = new VLegalDocumentImpl[3];

			array[0] = getByGroupId_PrevAndNext(session, vLegalDocument,
					groupId, orderByComparator, true);

			array[1] = vLegalDocument;

			array[2] = getByGroupId_PrevAndNext(session, vLegalDocument,
					groupId, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected VLegalDocument getByGroupId_PrevAndNext(Session session,
		VLegalDocument vLegalDocument, long groupId,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_VLEGALDOCUMENT_WHERE);

		query.append(_FINDER_COLUMN_GROUPID_GROUPID_2);

		if (orderByComparator != null) {
			String[] orderByFields = orderByComparator.getOrderByFields();

			if (orderByFields.length > 0) {
				query.append(WHERE_AND);
			}

			for (int i = 0; i < orderByFields.length; i++) {
				query.append(_ORDER_BY_ENTITY_ALIAS);
				query.append(orderByFields[i]);

				if ((i + 1) < orderByFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(WHERE_GREATER_THAN_HAS_NEXT);
					}
					else {
						query.append(WHERE_LESSER_THAN_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(WHERE_GREATER_THAN);
					}
					else {
						query.append(WHERE_LESSER_THAN);
					}
				}
			}

			query.append(ORDER_BY_CLAUSE);

			for (int i = 0; i < orderByFields.length; i++) {
				query.append(_ORDER_BY_ENTITY_ALIAS);
				query.append(orderByFields[i]);

				if ((i + 1) < orderByFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(ORDER_BY_ASC_HAS_NEXT);
					}
					else {
						query.append(ORDER_BY_DESC_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(ORDER_BY_ASC);
					}
					else {
						query.append(ORDER_BY_DESC);
					}
				}
			}
		}

		else {
			query.append(VLegalDocumentModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(groupId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByValues(vLegalDocument);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<VLegalDocument> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Finds all the v legal documents where language = &#63; and promulDate = &#63; and statusDoc = &#63;.
	 *
	 * @param language the language to search with
	 * @param promulDate the promul date to search with
	 * @param statusDoc the status doc to search with
	 * @return the matching v legal documents
	 * @throws SystemException if a system exception occurred
	 */
	public List<VLegalDocument> findByPromulDate(String language,
		Date promulDate, int statusDoc) throws SystemException {
		return findByPromulDate(language, promulDate, statusDoc,
			QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Finds a range of all the v legal documents where language = &#63; and promulDate = &#63; and statusDoc = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param language the language to search with
	 * @param promulDate the promul date to search with
	 * @param statusDoc the status doc to search with
	 * @param start the lower bound of the range of v legal documents to return
	 * @param end the upper bound of the range of v legal documents to return (not inclusive)
	 * @return the range of matching v legal documents
	 * @throws SystemException if a system exception occurred
	 */
	public List<VLegalDocument> findByPromulDate(String language,
		Date promulDate, int statusDoc, int start, int end)
		throws SystemException {
		return findByPromulDate(language, promulDate, statusDoc, start, end,
			null);
	}

	/**
	 * Finds an ordered range of all the v legal documents where language = &#63; and promulDate = &#63; and statusDoc = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param language the language to search with
	 * @param promulDate the promul date to search with
	 * @param statusDoc the status doc to search with
	 * @param start the lower bound of the range of v legal documents to return
	 * @param end the upper bound of the range of v legal documents to return (not inclusive)
	 * @param orderByComparator the comparator to order the results by
	 * @return the ordered range of matching v legal documents
	 * @throws SystemException if a system exception occurred
	 */
	public List<VLegalDocument> findByPromulDate(String language,
		Date promulDate, int statusDoc, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		Object[] finderArgs = new Object[] {
				language, promulDate, statusDoc,
				
				String.valueOf(start), String.valueOf(end),
				String.valueOf(orderByComparator)
			};

		List<VLegalDocument> list = (List<VLegalDocument>)FinderCacheUtil.getResult(FINDER_PATH_FIND_BY_PROMULDATE,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;

			if (orderByComparator != null) {
				query = new StringBundler(5 +
						(orderByComparator.getOrderByFields().length * 3));
			}
			else {
				query = new StringBundler(5);
			}

			query.append(_SQL_SELECT_VLEGALDOCUMENT_WHERE);

			if (language == null) {
				query.append(_FINDER_COLUMN_PROMULDATE_LANGUAGE_1);
			}
			else {
				if (language.equals(StringPool.BLANK)) {
					query.append(_FINDER_COLUMN_PROMULDATE_LANGUAGE_3);
				}
				else {
					query.append(_FINDER_COLUMN_PROMULDATE_LANGUAGE_2);
				}
			}

			if (promulDate == null) {
				query.append(_FINDER_COLUMN_PROMULDATE_PROMULDATE_1);
			}
			else {
				query.append(_FINDER_COLUMN_PROMULDATE_PROMULDATE_2);
			}

			query.append(_FINDER_COLUMN_PROMULDATE_STATUSDOC_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}

			else {
				query.append(VLegalDocumentModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (language != null) {
					qPos.add(language);
				}

				if (promulDate != null) {
					qPos.add(CalendarUtil.getTimestamp(promulDate));
				}

				qPos.add(statusDoc);

				list = (List<VLegalDocument>)QueryUtil.list(q, getDialect(),
						start, end);
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (list == null) {
					FinderCacheUtil.removeResult(FINDER_PATH_FIND_BY_PROMULDATE,
						finderArgs);
				}
				else {
					cacheResult(list);

					FinderCacheUtil.putResult(FINDER_PATH_FIND_BY_PROMULDATE,
						finderArgs, list);
				}

				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Finds the first v legal document in the ordered set where language = &#63; and promulDate = &#63; and statusDoc = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param language the language to search with
	 * @param promulDate the promul date to search with
	 * @param statusDoc the status doc to search with
	 * @param orderByComparator the comparator to order the set by
	 * @return the first matching v legal document
	 * @throws com.vportal.portlet.vlegal.NoSuchVLegalDocumentException if a matching v legal document could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public VLegalDocument findByPromulDate_First(String language,
		Date promulDate, int statusDoc, OrderByComparator orderByComparator)
		throws NoSuchVLegalDocumentException, SystemException {
		List<VLegalDocument> list = findByPromulDate(language, promulDate,
				statusDoc, 0, 1, orderByComparator);

		if (list.isEmpty()) {
			StringBundler msg = new StringBundler(8);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("language=");
			msg.append(language);

			msg.append(", promulDate=");
			msg.append(promulDate);

			msg.append(", statusDoc=");
			msg.append(statusDoc);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			throw new NoSuchVLegalDocumentException(msg.toString());
		}
		else {
			return list.get(0);
		}
	}

	/**
	 * Finds the last v legal document in the ordered set where language = &#63; and promulDate = &#63; and statusDoc = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param language the language to search with
	 * @param promulDate the promul date to search with
	 * @param statusDoc the status doc to search with
	 * @param orderByComparator the comparator to order the set by
	 * @return the last matching v legal document
	 * @throws com.vportal.portlet.vlegal.NoSuchVLegalDocumentException if a matching v legal document could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public VLegalDocument findByPromulDate_Last(String language,
		Date promulDate, int statusDoc, OrderByComparator orderByComparator)
		throws NoSuchVLegalDocumentException, SystemException {
		int count = countByPromulDate(language, promulDate, statusDoc);

		List<VLegalDocument> list = findByPromulDate(language, promulDate,
				statusDoc, count - 1, count, orderByComparator);

		if (list.isEmpty()) {
			StringBundler msg = new StringBundler(8);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("language=");
			msg.append(language);

			msg.append(", promulDate=");
			msg.append(promulDate);

			msg.append(", statusDoc=");
			msg.append(statusDoc);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			throw new NoSuchVLegalDocumentException(msg.toString());
		}
		else {
			return list.get(0);
		}
	}

	/**
	 * Finds the v legal documents before and after the current v legal document in the ordered set where language = &#63; and promulDate = &#63; and statusDoc = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param docId the primary key of the current v legal document
	 * @param language the language to search with
	 * @param promulDate the promul date to search with
	 * @param statusDoc the status doc to search with
	 * @param orderByComparator the comparator to order the set by
	 * @return the previous, current, and next v legal document
	 * @throws com.vportal.portlet.vlegal.NoSuchVLegalDocumentException if a v legal document with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public VLegalDocument[] findByPromulDate_PrevAndNext(String docId,
		String language, Date promulDate, int statusDoc,
		OrderByComparator orderByComparator)
		throws NoSuchVLegalDocumentException, SystemException {
		VLegalDocument vLegalDocument = findByPrimaryKey(docId);

		Session session = null;

		try {
			session = openSession();

			VLegalDocument[] array = new VLegalDocumentImpl[3];

			array[0] = getByPromulDate_PrevAndNext(session, vLegalDocument,
					language, promulDate, statusDoc, orderByComparator, true);

			array[1] = vLegalDocument;

			array[2] = getByPromulDate_PrevAndNext(session, vLegalDocument,
					language, promulDate, statusDoc, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected VLegalDocument getByPromulDate_PrevAndNext(Session session,
		VLegalDocument vLegalDocument, String language, Date promulDate,
		int statusDoc, OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_VLEGALDOCUMENT_WHERE);

		if (language == null) {
			query.append(_FINDER_COLUMN_PROMULDATE_LANGUAGE_1);
		}
		else {
			if (language.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_PROMULDATE_LANGUAGE_3);
			}
			else {
				query.append(_FINDER_COLUMN_PROMULDATE_LANGUAGE_2);
			}
		}

		if (promulDate == null) {
			query.append(_FINDER_COLUMN_PROMULDATE_PROMULDATE_1);
		}
		else {
			query.append(_FINDER_COLUMN_PROMULDATE_PROMULDATE_2);
		}

		query.append(_FINDER_COLUMN_PROMULDATE_STATUSDOC_2);

		if (orderByComparator != null) {
			String[] orderByFields = orderByComparator.getOrderByFields();

			if (orderByFields.length > 0) {
				query.append(WHERE_AND);
			}

			for (int i = 0; i < orderByFields.length; i++) {
				query.append(_ORDER_BY_ENTITY_ALIAS);
				query.append(orderByFields[i]);

				if ((i + 1) < orderByFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(WHERE_GREATER_THAN_HAS_NEXT);
					}
					else {
						query.append(WHERE_LESSER_THAN_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(WHERE_GREATER_THAN);
					}
					else {
						query.append(WHERE_LESSER_THAN);
					}
				}
			}

			query.append(ORDER_BY_CLAUSE);

			for (int i = 0; i < orderByFields.length; i++) {
				query.append(_ORDER_BY_ENTITY_ALIAS);
				query.append(orderByFields[i]);

				if ((i + 1) < orderByFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(ORDER_BY_ASC_HAS_NEXT);
					}
					else {
						query.append(ORDER_BY_DESC_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(ORDER_BY_ASC);
					}
					else {
						query.append(ORDER_BY_DESC);
					}
				}
			}
		}

		else {
			query.append(VLegalDocumentModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		if (language != null) {
			qPos.add(language);
		}

		if (promulDate != null) {
			qPos.add(CalendarUtil.getTimestamp(promulDate));
		}

		qPos.add(statusDoc);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByValues(vLegalDocument);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<VLegalDocument> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Finds all the v legal documents where groupId = &#63; and language = &#63;.
	 *
	 * @param groupId the group id to search with
	 * @param language the language to search with
	 * @return the matching v legal documents
	 * @throws SystemException if a system exception occurred
	 */
	public List<VLegalDocument> findByG_L(long groupId, String language)
		throws SystemException {
		return findByG_L(groupId, language, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Finds a range of all the v legal documents where groupId = &#63; and language = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param groupId the group id to search with
	 * @param language the language to search with
	 * @param start the lower bound of the range of v legal documents to return
	 * @param end the upper bound of the range of v legal documents to return (not inclusive)
	 * @return the range of matching v legal documents
	 * @throws SystemException if a system exception occurred
	 */
	public List<VLegalDocument> findByG_L(long groupId, String language,
		int start, int end) throws SystemException {
		return findByG_L(groupId, language, start, end, null);
	}

	/**
	 * Finds an ordered range of all the v legal documents where groupId = &#63; and language = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param groupId the group id to search with
	 * @param language the language to search with
	 * @param start the lower bound of the range of v legal documents to return
	 * @param end the upper bound of the range of v legal documents to return (not inclusive)
	 * @param orderByComparator the comparator to order the results by
	 * @return the ordered range of matching v legal documents
	 * @throws SystemException if a system exception occurred
	 */
	public List<VLegalDocument> findByG_L(long groupId, String language,
		int start, int end, OrderByComparator orderByComparator)
		throws SystemException {
		Object[] finderArgs = new Object[] {
				groupId, language,
				
				String.valueOf(start), String.valueOf(end),
				String.valueOf(orderByComparator)
			};

		List<VLegalDocument> list = (List<VLegalDocument>)FinderCacheUtil.getResult(FINDER_PATH_FIND_BY_G_L,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;

			if (orderByComparator != null) {
				query = new StringBundler(4 +
						(orderByComparator.getOrderByFields().length * 3));
			}
			else {
				query = new StringBundler(4);
			}

			query.append(_SQL_SELECT_VLEGALDOCUMENT_WHERE);

			query.append(_FINDER_COLUMN_G_L_GROUPID_2);

			if (language == null) {
				query.append(_FINDER_COLUMN_G_L_LANGUAGE_1);
			}
			else {
				if (language.equals(StringPool.BLANK)) {
					query.append(_FINDER_COLUMN_G_L_LANGUAGE_3);
				}
				else {
					query.append(_FINDER_COLUMN_G_L_LANGUAGE_2);
				}
			}

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}

			else {
				query.append(VLegalDocumentModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(groupId);

				if (language != null) {
					qPos.add(language);
				}

				list = (List<VLegalDocument>)QueryUtil.list(q, getDialect(),
						start, end);
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (list == null) {
					FinderCacheUtil.removeResult(FINDER_PATH_FIND_BY_G_L,
						finderArgs);
				}
				else {
					cacheResult(list);

					FinderCacheUtil.putResult(FINDER_PATH_FIND_BY_G_L,
						finderArgs, list);
				}

				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Finds the first v legal document in the ordered set where groupId = &#63; and language = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param groupId the group id to search with
	 * @param language the language to search with
	 * @param orderByComparator the comparator to order the set by
	 * @return the first matching v legal document
	 * @throws com.vportal.portlet.vlegal.NoSuchVLegalDocumentException if a matching v legal document could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public VLegalDocument findByG_L_First(long groupId, String language,
		OrderByComparator orderByComparator)
		throws NoSuchVLegalDocumentException, SystemException {
		List<VLegalDocument> list = findByG_L(groupId, language, 0, 1,
				orderByComparator);

		if (list.isEmpty()) {
			StringBundler msg = new StringBundler(6);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("groupId=");
			msg.append(groupId);

			msg.append(", language=");
			msg.append(language);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			throw new NoSuchVLegalDocumentException(msg.toString());
		}
		else {
			return list.get(0);
		}
	}

	/**
	 * Finds the last v legal document in the ordered set where groupId = &#63; and language = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param groupId the group id to search with
	 * @param language the language to search with
	 * @param orderByComparator the comparator to order the set by
	 * @return the last matching v legal document
	 * @throws com.vportal.portlet.vlegal.NoSuchVLegalDocumentException if a matching v legal document could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public VLegalDocument findByG_L_Last(long groupId, String language,
		OrderByComparator orderByComparator)
		throws NoSuchVLegalDocumentException, SystemException {
		int count = countByG_L(groupId, language);

		List<VLegalDocument> list = findByG_L(groupId, language, count - 1,
				count, orderByComparator);

		if (list.isEmpty()) {
			StringBundler msg = new StringBundler(6);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("groupId=");
			msg.append(groupId);

			msg.append(", language=");
			msg.append(language);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			throw new NoSuchVLegalDocumentException(msg.toString());
		}
		else {
			return list.get(0);
		}
	}

	/**
	 * Finds the v legal documents before and after the current v legal document in the ordered set where groupId = &#63; and language = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param docId the primary key of the current v legal document
	 * @param groupId the group id to search with
	 * @param language the language to search with
	 * @param orderByComparator the comparator to order the set by
	 * @return the previous, current, and next v legal document
	 * @throws com.vportal.portlet.vlegal.NoSuchVLegalDocumentException if a v legal document with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public VLegalDocument[] findByG_L_PrevAndNext(String docId, long groupId,
		String language, OrderByComparator orderByComparator)
		throws NoSuchVLegalDocumentException, SystemException {
		VLegalDocument vLegalDocument = findByPrimaryKey(docId);

		Session session = null;

		try {
			session = openSession();

			VLegalDocument[] array = new VLegalDocumentImpl[3];

			array[0] = getByG_L_PrevAndNext(session, vLegalDocument, groupId,
					language, orderByComparator, true);

			array[1] = vLegalDocument;

			array[2] = getByG_L_PrevAndNext(session, vLegalDocument, groupId,
					language, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected VLegalDocument getByG_L_PrevAndNext(Session session,
		VLegalDocument vLegalDocument, long groupId, String language,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_VLEGALDOCUMENT_WHERE);

		query.append(_FINDER_COLUMN_G_L_GROUPID_2);

		if (language == null) {
			query.append(_FINDER_COLUMN_G_L_LANGUAGE_1);
		}
		else {
			if (language.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_G_L_LANGUAGE_3);
			}
			else {
				query.append(_FINDER_COLUMN_G_L_LANGUAGE_2);
			}
		}

		if (orderByComparator != null) {
			String[] orderByFields = orderByComparator.getOrderByFields();

			if (orderByFields.length > 0) {
				query.append(WHERE_AND);
			}

			for (int i = 0; i < orderByFields.length; i++) {
				query.append(_ORDER_BY_ENTITY_ALIAS);
				query.append(orderByFields[i]);

				if ((i + 1) < orderByFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(WHERE_GREATER_THAN_HAS_NEXT);
					}
					else {
						query.append(WHERE_LESSER_THAN_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(WHERE_GREATER_THAN);
					}
					else {
						query.append(WHERE_LESSER_THAN);
					}
				}
			}

			query.append(ORDER_BY_CLAUSE);

			for (int i = 0; i < orderByFields.length; i++) {
				query.append(_ORDER_BY_ENTITY_ALIAS);
				query.append(orderByFields[i]);

				if ((i + 1) < orderByFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(ORDER_BY_ASC_HAS_NEXT);
					}
					else {
						query.append(ORDER_BY_DESC_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(ORDER_BY_ASC);
					}
					else {
						query.append(ORDER_BY_DESC);
					}
				}
			}
		}

		else {
			query.append(VLegalDocumentModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(groupId);

		if (language != null) {
			qPos.add(language);
		}

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByValues(vLegalDocument);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<VLegalDocument> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Finds all the v legal documents where groupId = &#63; and typeDocId = &#63; and orgId = &#63; and fieldId = &#63; and language = &#63; and statusDoc = &#63;.
	 *
	 * @param groupId the group id to search with
	 * @param typeDocId the type doc id to search with
	 * @param orgId the org id to search with
	 * @param fieldId the field id to search with
	 * @param language the language to search with
	 * @param statusDoc the status doc to search with
	 * @return the matching v legal documents
	 * @throws SystemException if a system exception occurred
	 */
	public List<VLegalDocument> findByDocsByF_O_T_L_S(long groupId,
		String typeDocId, String orgId, String fieldId, String language,
		int statusDoc) throws SystemException {
		return findByDocsByF_O_T_L_S(groupId, typeDocId, orgId, fieldId,
			language, statusDoc, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Finds a range of all the v legal documents where groupId = &#63; and typeDocId = &#63; and orgId = &#63; and fieldId = &#63; and language = &#63; and statusDoc = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param groupId the group id to search with
	 * @param typeDocId the type doc id to search with
	 * @param orgId the org id to search with
	 * @param fieldId the field id to search with
	 * @param language the language to search with
	 * @param statusDoc the status doc to search with
	 * @param start the lower bound of the range of v legal documents to return
	 * @param end the upper bound of the range of v legal documents to return (not inclusive)
	 * @return the range of matching v legal documents
	 * @throws SystemException if a system exception occurred
	 */
	public List<VLegalDocument> findByDocsByF_O_T_L_S(long groupId,
		String typeDocId, String orgId, String fieldId, String language,
		int statusDoc, int start, int end) throws SystemException {
		return findByDocsByF_O_T_L_S(groupId, typeDocId, orgId, fieldId,
			language, statusDoc, start, end, null);
	}

	/**
	 * Finds an ordered range of all the v legal documents where groupId = &#63; and typeDocId = &#63; and orgId = &#63; and fieldId = &#63; and language = &#63; and statusDoc = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param groupId the group id to search with
	 * @param typeDocId the type doc id to search with
	 * @param orgId the org id to search with
	 * @param fieldId the field id to search with
	 * @param language the language to search with
	 * @param statusDoc the status doc to search with
	 * @param start the lower bound of the range of v legal documents to return
	 * @param end the upper bound of the range of v legal documents to return (not inclusive)
	 * @param orderByComparator the comparator to order the results by
	 * @return the ordered range of matching v legal documents
	 * @throws SystemException if a system exception occurred
	 */
	public List<VLegalDocument> findByDocsByF_O_T_L_S(long groupId,
		String typeDocId, String orgId, String fieldId, String language,
		int statusDoc, int start, int end, OrderByComparator orderByComparator)
		throws SystemException {
		Object[] finderArgs = new Object[] {
				groupId, typeDocId, orgId, fieldId, language, statusDoc,
				
				String.valueOf(start), String.valueOf(end),
				String.valueOf(orderByComparator)
			};

		List<VLegalDocument> list = (List<VLegalDocument>)FinderCacheUtil.getResult(FINDER_PATH_FIND_BY_DOCSBYF_O_T_L_S,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;

			if (orderByComparator != null) {
				query = new StringBundler(8 +
						(orderByComparator.getOrderByFields().length * 3));
			}
			else {
				query = new StringBundler(8);
			}

			query.append(_SQL_SELECT_VLEGALDOCUMENT_WHERE);

			query.append(_FINDER_COLUMN_DOCSBYF_O_T_L_S_GROUPID_2);

			if (typeDocId == null) {
				query.append(_FINDER_COLUMN_DOCSBYF_O_T_L_S_TYPEDOCID_1);
			}
			else {
				if (typeDocId.equals(StringPool.BLANK)) {
					query.append(_FINDER_COLUMN_DOCSBYF_O_T_L_S_TYPEDOCID_3);
				}
				else {
					query.append(_FINDER_COLUMN_DOCSBYF_O_T_L_S_TYPEDOCID_2);
				}
			}

			if (orgId == null) {
				query.append(_FINDER_COLUMN_DOCSBYF_O_T_L_S_ORGID_1);
			}
			else {
				if (orgId.equals(StringPool.BLANK)) {
					query.append(_FINDER_COLUMN_DOCSBYF_O_T_L_S_ORGID_3);
				}
				else {
					query.append(_FINDER_COLUMN_DOCSBYF_O_T_L_S_ORGID_2);
				}
			}

			if (fieldId == null) {
				query.append(_FINDER_COLUMN_DOCSBYF_O_T_L_S_FIELDID_1);
			}
			else {
				if (fieldId.equals(StringPool.BLANK)) {
					query.append(_FINDER_COLUMN_DOCSBYF_O_T_L_S_FIELDID_3);
				}
				else {
					query.append(_FINDER_COLUMN_DOCSBYF_O_T_L_S_FIELDID_2);
				}
			}

			if (language == null) {
				query.append(_FINDER_COLUMN_DOCSBYF_O_T_L_S_LANGUAGE_1);
			}
			else {
				if (language.equals(StringPool.BLANK)) {
					query.append(_FINDER_COLUMN_DOCSBYF_O_T_L_S_LANGUAGE_3);
				}
				else {
					query.append(_FINDER_COLUMN_DOCSBYF_O_T_L_S_LANGUAGE_2);
				}
			}

			query.append(_FINDER_COLUMN_DOCSBYF_O_T_L_S_STATUSDOC_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}

			else {
				query.append(VLegalDocumentModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(groupId);

				if (typeDocId != null) {
					qPos.add(typeDocId);
				}

				if (orgId != null) {
					qPos.add(orgId);
				}

				if (fieldId != null) {
					qPos.add(fieldId);
				}

				if (language != null) {
					qPos.add(language);
				}

				qPos.add(statusDoc);

				list = (List<VLegalDocument>)QueryUtil.list(q, getDialect(),
						start, end);
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (list == null) {
					FinderCacheUtil.removeResult(FINDER_PATH_FIND_BY_DOCSBYF_O_T_L_S,
						finderArgs);
				}
				else {
					cacheResult(list);

					FinderCacheUtil.putResult(FINDER_PATH_FIND_BY_DOCSBYF_O_T_L_S,
						finderArgs, list);
				}

				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Finds the first v legal document in the ordered set where groupId = &#63; and typeDocId = &#63; and orgId = &#63; and fieldId = &#63; and language = &#63; and statusDoc = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param groupId the group id to search with
	 * @param typeDocId the type doc id to search with
	 * @param orgId the org id to search with
	 * @param fieldId the field id to search with
	 * @param language the language to search with
	 * @param statusDoc the status doc to search with
	 * @param orderByComparator the comparator to order the set by
	 * @return the first matching v legal document
	 * @throws com.vportal.portlet.vlegal.NoSuchVLegalDocumentException if a matching v legal document could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public VLegalDocument findByDocsByF_O_T_L_S_First(long groupId,
		String typeDocId, String orgId, String fieldId, String language,
		int statusDoc, OrderByComparator orderByComparator)
		throws NoSuchVLegalDocumentException, SystemException {
		List<VLegalDocument> list = findByDocsByF_O_T_L_S(groupId, typeDocId,
				orgId, fieldId, language, statusDoc, 0, 1, orderByComparator);

		if (list.isEmpty()) {
			StringBundler msg = new StringBundler(14);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("groupId=");
			msg.append(groupId);

			msg.append(", typeDocId=");
			msg.append(typeDocId);

			msg.append(", orgId=");
			msg.append(orgId);

			msg.append(", fieldId=");
			msg.append(fieldId);

			msg.append(", language=");
			msg.append(language);

			msg.append(", statusDoc=");
			msg.append(statusDoc);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			throw new NoSuchVLegalDocumentException(msg.toString());
		}
		else {
			return list.get(0);
		}
	}

	/**
	 * Finds the last v legal document in the ordered set where groupId = &#63; and typeDocId = &#63; and orgId = &#63; and fieldId = &#63; and language = &#63; and statusDoc = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param groupId the group id to search with
	 * @param typeDocId the type doc id to search with
	 * @param orgId the org id to search with
	 * @param fieldId the field id to search with
	 * @param language the language to search with
	 * @param statusDoc the status doc to search with
	 * @param orderByComparator the comparator to order the set by
	 * @return the last matching v legal document
	 * @throws com.vportal.portlet.vlegal.NoSuchVLegalDocumentException if a matching v legal document could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public VLegalDocument findByDocsByF_O_T_L_S_Last(long groupId,
		String typeDocId, String orgId, String fieldId, String language,
		int statusDoc, OrderByComparator orderByComparator)
		throws NoSuchVLegalDocumentException, SystemException {
		int count = countByDocsByF_O_T_L_S(groupId, typeDocId, orgId, fieldId,
				language, statusDoc);

		List<VLegalDocument> list = findByDocsByF_O_T_L_S(groupId, typeDocId,
				orgId, fieldId, language, statusDoc, count - 1, count,
				orderByComparator);

		if (list.isEmpty()) {
			StringBundler msg = new StringBundler(14);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("groupId=");
			msg.append(groupId);

			msg.append(", typeDocId=");
			msg.append(typeDocId);

			msg.append(", orgId=");
			msg.append(orgId);

			msg.append(", fieldId=");
			msg.append(fieldId);

			msg.append(", language=");
			msg.append(language);

			msg.append(", statusDoc=");
			msg.append(statusDoc);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			throw new NoSuchVLegalDocumentException(msg.toString());
		}
		else {
			return list.get(0);
		}
	}

	/**
	 * Finds the v legal documents before and after the current v legal document in the ordered set where groupId = &#63; and typeDocId = &#63; and orgId = &#63; and fieldId = &#63; and language = &#63; and statusDoc = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param docId the primary key of the current v legal document
	 * @param groupId the group id to search with
	 * @param typeDocId the type doc id to search with
	 * @param orgId the org id to search with
	 * @param fieldId the field id to search with
	 * @param language the language to search with
	 * @param statusDoc the status doc to search with
	 * @param orderByComparator the comparator to order the set by
	 * @return the previous, current, and next v legal document
	 * @throws com.vportal.portlet.vlegal.NoSuchVLegalDocumentException if a v legal document with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public VLegalDocument[] findByDocsByF_O_T_L_S_PrevAndNext(String docId,
		long groupId, String typeDocId, String orgId, String fieldId,
		String language, int statusDoc, OrderByComparator orderByComparator)
		throws NoSuchVLegalDocumentException, SystemException {
		VLegalDocument vLegalDocument = findByPrimaryKey(docId);

		Session session = null;

		try {
			session = openSession();

			VLegalDocument[] array = new VLegalDocumentImpl[3];

			array[0] = getByDocsByF_O_T_L_S_PrevAndNext(session,
					vLegalDocument, groupId, typeDocId, orgId, fieldId,
					language, statusDoc, orderByComparator, true);

			array[1] = vLegalDocument;

			array[2] = getByDocsByF_O_T_L_S_PrevAndNext(session,
					vLegalDocument, groupId, typeDocId, orgId, fieldId,
					language, statusDoc, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected VLegalDocument getByDocsByF_O_T_L_S_PrevAndNext(Session session,
		VLegalDocument vLegalDocument, long groupId, String typeDocId,
		String orgId, String fieldId, String language, int statusDoc,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_VLEGALDOCUMENT_WHERE);

		query.append(_FINDER_COLUMN_DOCSBYF_O_T_L_S_GROUPID_2);

		if (typeDocId == null) {
			query.append(_FINDER_COLUMN_DOCSBYF_O_T_L_S_TYPEDOCID_1);
		}
		else {
			if (typeDocId.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_DOCSBYF_O_T_L_S_TYPEDOCID_3);
			}
			else {
				query.append(_FINDER_COLUMN_DOCSBYF_O_T_L_S_TYPEDOCID_2);
			}
		}

		if (orgId == null) {
			query.append(_FINDER_COLUMN_DOCSBYF_O_T_L_S_ORGID_1);
		}
		else {
			if (orgId.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_DOCSBYF_O_T_L_S_ORGID_3);
			}
			else {
				query.append(_FINDER_COLUMN_DOCSBYF_O_T_L_S_ORGID_2);
			}
		}

		if (fieldId == null) {
			query.append(_FINDER_COLUMN_DOCSBYF_O_T_L_S_FIELDID_1);
		}
		else {
			if (fieldId.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_DOCSBYF_O_T_L_S_FIELDID_3);
			}
			else {
				query.append(_FINDER_COLUMN_DOCSBYF_O_T_L_S_FIELDID_2);
			}
		}

		if (language == null) {
			query.append(_FINDER_COLUMN_DOCSBYF_O_T_L_S_LANGUAGE_1);
		}
		else {
			if (language.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_DOCSBYF_O_T_L_S_LANGUAGE_3);
			}
			else {
				query.append(_FINDER_COLUMN_DOCSBYF_O_T_L_S_LANGUAGE_2);
			}
		}

		query.append(_FINDER_COLUMN_DOCSBYF_O_T_L_S_STATUSDOC_2);

		if (orderByComparator != null) {
			String[] orderByFields = orderByComparator.getOrderByFields();

			if (orderByFields.length > 0) {
				query.append(WHERE_AND);
			}

			for (int i = 0; i < orderByFields.length; i++) {
				query.append(_ORDER_BY_ENTITY_ALIAS);
				query.append(orderByFields[i]);

				if ((i + 1) < orderByFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(WHERE_GREATER_THAN_HAS_NEXT);
					}
					else {
						query.append(WHERE_LESSER_THAN_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(WHERE_GREATER_THAN);
					}
					else {
						query.append(WHERE_LESSER_THAN);
					}
				}
			}

			query.append(ORDER_BY_CLAUSE);

			for (int i = 0; i < orderByFields.length; i++) {
				query.append(_ORDER_BY_ENTITY_ALIAS);
				query.append(orderByFields[i]);

				if ((i + 1) < orderByFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(ORDER_BY_ASC_HAS_NEXT);
					}
					else {
						query.append(ORDER_BY_DESC_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(ORDER_BY_ASC);
					}
					else {
						query.append(ORDER_BY_DESC);
					}
				}
			}
		}

		else {
			query.append(VLegalDocumentModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(groupId);

		if (typeDocId != null) {
			qPos.add(typeDocId);
		}

		if (orgId != null) {
			qPos.add(orgId);
		}

		if (fieldId != null) {
			qPos.add(fieldId);
		}

		if (language != null) {
			qPos.add(language);
		}

		qPos.add(statusDoc);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByValues(vLegalDocument);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<VLegalDocument> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Finds all the v legal documents where typeDocId = &#63; and orgId = &#63; and fieldId = &#63; and language = &#63; and statusDoc = &#63;.
	 *
	 * @param typeDocId the type doc id to search with
	 * @param orgId the org id to search with
	 * @param fieldId the field id to search with
	 * @param language the language to search with
	 * @param statusDoc the status doc to search with
	 * @return the matching v legal documents
	 * @throws SystemException if a system exception occurred
	 */
	public List<VLegalDocument> findByDocsByF_T_O_L_S(String typeDocId,
		String orgId, String fieldId, String language, int statusDoc)
		throws SystemException {
		return findByDocsByF_T_O_L_S(typeDocId, orgId, fieldId, language,
			statusDoc, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Finds a range of all the v legal documents where typeDocId = &#63; and orgId = &#63; and fieldId = &#63; and language = &#63; and statusDoc = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param typeDocId the type doc id to search with
	 * @param orgId the org id to search with
	 * @param fieldId the field id to search with
	 * @param language the language to search with
	 * @param statusDoc the status doc to search with
	 * @param start the lower bound of the range of v legal documents to return
	 * @param end the upper bound of the range of v legal documents to return (not inclusive)
	 * @return the range of matching v legal documents
	 * @throws SystemException if a system exception occurred
	 */
	public List<VLegalDocument> findByDocsByF_T_O_L_S(String typeDocId,
		String orgId, String fieldId, String language, int statusDoc,
		int start, int end) throws SystemException {
		return findByDocsByF_T_O_L_S(typeDocId, orgId, fieldId, language,
			statusDoc, start, end, null);
	}

	/**
	 * Finds an ordered range of all the v legal documents where typeDocId = &#63; and orgId = &#63; and fieldId = &#63; and language = &#63; and statusDoc = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param typeDocId the type doc id to search with
	 * @param orgId the org id to search with
	 * @param fieldId the field id to search with
	 * @param language the language to search with
	 * @param statusDoc the status doc to search with
	 * @param start the lower bound of the range of v legal documents to return
	 * @param end the upper bound of the range of v legal documents to return (not inclusive)
	 * @param orderByComparator the comparator to order the results by
	 * @return the ordered range of matching v legal documents
	 * @throws SystemException if a system exception occurred
	 */
	public List<VLegalDocument> findByDocsByF_T_O_L_S(String typeDocId,
		String orgId, String fieldId, String language, int statusDoc,
		int start, int end, OrderByComparator orderByComparator)
		throws SystemException {
		Object[] finderArgs = new Object[] {
				typeDocId, orgId, fieldId, language, statusDoc,
				
				String.valueOf(start), String.valueOf(end),
				String.valueOf(orderByComparator)
			};

		List<VLegalDocument> list = (List<VLegalDocument>)FinderCacheUtil.getResult(FINDER_PATH_FIND_BY_DOCSBYF_T_O_L_S,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;

			if (orderByComparator != null) {
				query = new StringBundler(7 +
						(orderByComparator.getOrderByFields().length * 3));
			}
			else {
				query = new StringBundler(7);
			}

			query.append(_SQL_SELECT_VLEGALDOCUMENT_WHERE);

			if (typeDocId == null) {
				query.append(_FINDER_COLUMN_DOCSBYF_T_O_L_S_TYPEDOCID_1);
			}
			else {
				if (typeDocId.equals(StringPool.BLANK)) {
					query.append(_FINDER_COLUMN_DOCSBYF_T_O_L_S_TYPEDOCID_3);
				}
				else {
					query.append(_FINDER_COLUMN_DOCSBYF_T_O_L_S_TYPEDOCID_2);
				}
			}

			if (orgId == null) {
				query.append(_FINDER_COLUMN_DOCSBYF_T_O_L_S_ORGID_1);
			}
			else {
				if (orgId.equals(StringPool.BLANK)) {
					query.append(_FINDER_COLUMN_DOCSBYF_T_O_L_S_ORGID_3);
				}
				else {
					query.append(_FINDER_COLUMN_DOCSBYF_T_O_L_S_ORGID_2);
				}
			}

			if (fieldId == null) {
				query.append(_FINDER_COLUMN_DOCSBYF_T_O_L_S_FIELDID_1);
			}
			else {
				if (fieldId.equals(StringPool.BLANK)) {
					query.append(_FINDER_COLUMN_DOCSBYF_T_O_L_S_FIELDID_3);
				}
				else {
					query.append(_FINDER_COLUMN_DOCSBYF_T_O_L_S_FIELDID_2);
				}
			}

			if (language == null) {
				query.append(_FINDER_COLUMN_DOCSBYF_T_O_L_S_LANGUAGE_1);
			}
			else {
				if (language.equals(StringPool.BLANK)) {
					query.append(_FINDER_COLUMN_DOCSBYF_T_O_L_S_LANGUAGE_3);
				}
				else {
					query.append(_FINDER_COLUMN_DOCSBYF_T_O_L_S_LANGUAGE_2);
				}
			}

			query.append(_FINDER_COLUMN_DOCSBYF_T_O_L_S_STATUSDOC_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}

			else {
				query.append(VLegalDocumentModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (typeDocId != null) {
					qPos.add(typeDocId);
				}

				if (orgId != null) {
					qPos.add(orgId);
				}

				if (fieldId != null) {
					qPos.add(fieldId);
				}

				if (language != null) {
					qPos.add(language);
				}

				qPos.add(statusDoc);

				list = (List<VLegalDocument>)QueryUtil.list(q, getDialect(),
						start, end);
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (list == null) {
					FinderCacheUtil.removeResult(FINDER_PATH_FIND_BY_DOCSBYF_T_O_L_S,
						finderArgs);
				}
				else {
					cacheResult(list);

					FinderCacheUtil.putResult(FINDER_PATH_FIND_BY_DOCSBYF_T_O_L_S,
						finderArgs, list);
				}

				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Finds the first v legal document in the ordered set where typeDocId = &#63; and orgId = &#63; and fieldId = &#63; and language = &#63; and statusDoc = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param typeDocId the type doc id to search with
	 * @param orgId the org id to search with
	 * @param fieldId the field id to search with
	 * @param language the language to search with
	 * @param statusDoc the status doc to search with
	 * @param orderByComparator the comparator to order the set by
	 * @return the first matching v legal document
	 * @throws com.vportal.portlet.vlegal.NoSuchVLegalDocumentException if a matching v legal document could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public VLegalDocument findByDocsByF_T_O_L_S_First(String typeDocId,
		String orgId, String fieldId, String language, int statusDoc,
		OrderByComparator orderByComparator)
		throws NoSuchVLegalDocumentException, SystemException {
		List<VLegalDocument> list = findByDocsByF_T_O_L_S(typeDocId, orgId,
				fieldId, language, statusDoc, 0, 1, orderByComparator);

		if (list.isEmpty()) {
			StringBundler msg = new StringBundler(12);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("typeDocId=");
			msg.append(typeDocId);

			msg.append(", orgId=");
			msg.append(orgId);

			msg.append(", fieldId=");
			msg.append(fieldId);

			msg.append(", language=");
			msg.append(language);

			msg.append(", statusDoc=");
			msg.append(statusDoc);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			throw new NoSuchVLegalDocumentException(msg.toString());
		}
		else {
			return list.get(0);
		}
	}

	/**
	 * Finds the last v legal document in the ordered set where typeDocId = &#63; and orgId = &#63; and fieldId = &#63; and language = &#63; and statusDoc = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param typeDocId the type doc id to search with
	 * @param orgId the org id to search with
	 * @param fieldId the field id to search with
	 * @param language the language to search with
	 * @param statusDoc the status doc to search with
	 * @param orderByComparator the comparator to order the set by
	 * @return the last matching v legal document
	 * @throws com.vportal.portlet.vlegal.NoSuchVLegalDocumentException if a matching v legal document could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public VLegalDocument findByDocsByF_T_O_L_S_Last(String typeDocId,
		String orgId, String fieldId, String language, int statusDoc,
		OrderByComparator orderByComparator)
		throws NoSuchVLegalDocumentException, SystemException {
		int count = countByDocsByF_T_O_L_S(typeDocId, orgId, fieldId, language,
				statusDoc);

		List<VLegalDocument> list = findByDocsByF_T_O_L_S(typeDocId, orgId,
				fieldId, language, statusDoc, count - 1, count,
				orderByComparator);

		if (list.isEmpty()) {
			StringBundler msg = new StringBundler(12);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("typeDocId=");
			msg.append(typeDocId);

			msg.append(", orgId=");
			msg.append(orgId);

			msg.append(", fieldId=");
			msg.append(fieldId);

			msg.append(", language=");
			msg.append(language);

			msg.append(", statusDoc=");
			msg.append(statusDoc);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			throw new NoSuchVLegalDocumentException(msg.toString());
		}
		else {
			return list.get(0);
		}
	}

	/**
	 * Finds the v legal documents before and after the current v legal document in the ordered set where typeDocId = &#63; and orgId = &#63; and fieldId = &#63; and language = &#63; and statusDoc = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param docId the primary key of the current v legal document
	 * @param typeDocId the type doc id to search with
	 * @param orgId the org id to search with
	 * @param fieldId the field id to search with
	 * @param language the language to search with
	 * @param statusDoc the status doc to search with
	 * @param orderByComparator the comparator to order the set by
	 * @return the previous, current, and next v legal document
	 * @throws com.vportal.portlet.vlegal.NoSuchVLegalDocumentException if a v legal document with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public VLegalDocument[] findByDocsByF_T_O_L_S_PrevAndNext(String docId,
		String typeDocId, String orgId, String fieldId, String language,
		int statusDoc, OrderByComparator orderByComparator)
		throws NoSuchVLegalDocumentException, SystemException {
		VLegalDocument vLegalDocument = findByPrimaryKey(docId);

		Session session = null;

		try {
			session = openSession();

			VLegalDocument[] array = new VLegalDocumentImpl[3];

			array[0] = getByDocsByF_T_O_L_S_PrevAndNext(session,
					vLegalDocument, typeDocId, orgId, fieldId, language,
					statusDoc, orderByComparator, true);

			array[1] = vLegalDocument;

			array[2] = getByDocsByF_T_O_L_S_PrevAndNext(session,
					vLegalDocument, typeDocId, orgId, fieldId, language,
					statusDoc, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected VLegalDocument getByDocsByF_T_O_L_S_PrevAndNext(Session session,
		VLegalDocument vLegalDocument, String typeDocId, String orgId,
		String fieldId, String language, int statusDoc,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_VLEGALDOCUMENT_WHERE);

		if (typeDocId == null) {
			query.append(_FINDER_COLUMN_DOCSBYF_T_O_L_S_TYPEDOCID_1);
		}
		else {
			if (typeDocId.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_DOCSBYF_T_O_L_S_TYPEDOCID_3);
			}
			else {
				query.append(_FINDER_COLUMN_DOCSBYF_T_O_L_S_TYPEDOCID_2);
			}
		}

		if (orgId == null) {
			query.append(_FINDER_COLUMN_DOCSBYF_T_O_L_S_ORGID_1);
		}
		else {
			if (orgId.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_DOCSBYF_T_O_L_S_ORGID_3);
			}
			else {
				query.append(_FINDER_COLUMN_DOCSBYF_T_O_L_S_ORGID_2);
			}
		}

		if (fieldId == null) {
			query.append(_FINDER_COLUMN_DOCSBYF_T_O_L_S_FIELDID_1);
		}
		else {
			if (fieldId.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_DOCSBYF_T_O_L_S_FIELDID_3);
			}
			else {
				query.append(_FINDER_COLUMN_DOCSBYF_T_O_L_S_FIELDID_2);
			}
		}

		if (language == null) {
			query.append(_FINDER_COLUMN_DOCSBYF_T_O_L_S_LANGUAGE_1);
		}
		else {
			if (language.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_DOCSBYF_T_O_L_S_LANGUAGE_3);
			}
			else {
				query.append(_FINDER_COLUMN_DOCSBYF_T_O_L_S_LANGUAGE_2);
			}
		}

		query.append(_FINDER_COLUMN_DOCSBYF_T_O_L_S_STATUSDOC_2);

		if (orderByComparator != null) {
			String[] orderByFields = orderByComparator.getOrderByFields();

			if (orderByFields.length > 0) {
				query.append(WHERE_AND);
			}

			for (int i = 0; i < orderByFields.length; i++) {
				query.append(_ORDER_BY_ENTITY_ALIAS);
				query.append(orderByFields[i]);

				if ((i + 1) < orderByFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(WHERE_GREATER_THAN_HAS_NEXT);
					}
					else {
						query.append(WHERE_LESSER_THAN_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(WHERE_GREATER_THAN);
					}
					else {
						query.append(WHERE_LESSER_THAN);
					}
				}
			}

			query.append(ORDER_BY_CLAUSE);

			for (int i = 0; i < orderByFields.length; i++) {
				query.append(_ORDER_BY_ENTITY_ALIAS);
				query.append(orderByFields[i]);

				if ((i + 1) < orderByFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(ORDER_BY_ASC_HAS_NEXT);
					}
					else {
						query.append(ORDER_BY_DESC_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(ORDER_BY_ASC);
					}
					else {
						query.append(ORDER_BY_DESC);
					}
				}
			}
		}

		else {
			query.append(VLegalDocumentModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		if (typeDocId != null) {
			qPos.add(typeDocId);
		}

		if (orgId != null) {
			qPos.add(orgId);
		}

		if (fieldId != null) {
			qPos.add(fieldId);
		}

		if (language != null) {
			qPos.add(language);
		}

		qPos.add(statusDoc);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByValues(vLegalDocument);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<VLegalDocument> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Finds all the v legal documents where companyId = &#63; and typeDocId = &#63; and orgId = &#63; and fieldId = &#63; and language = &#63; and statusDoc = &#63;.
	 *
	 * @param companyId the company id to search with
	 * @param typeDocId the type doc id to search with
	 * @param orgId the org id to search with
	 * @param fieldId the field id to search with
	 * @param language the language to search with
	 * @param statusDoc the status doc to search with
	 * @return the matching v legal documents
	 * @throws SystemException if a system exception occurred
	 */
	public List<VLegalDocument> findByDocsByF_C_O_T_L_S(long companyId,
		String typeDocId, String orgId, String fieldId, String language,
		int statusDoc) throws SystemException {
		return findByDocsByF_C_O_T_L_S(companyId, typeDocId, orgId, fieldId,
			language, statusDoc, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Finds a range of all the v legal documents where companyId = &#63; and typeDocId = &#63; and orgId = &#63; and fieldId = &#63; and language = &#63; and statusDoc = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param companyId the company id to search with
	 * @param typeDocId the type doc id to search with
	 * @param orgId the org id to search with
	 * @param fieldId the field id to search with
	 * @param language the language to search with
	 * @param statusDoc the status doc to search with
	 * @param start the lower bound of the range of v legal documents to return
	 * @param end the upper bound of the range of v legal documents to return (not inclusive)
	 * @return the range of matching v legal documents
	 * @throws SystemException if a system exception occurred
	 */
	public List<VLegalDocument> findByDocsByF_C_O_T_L_S(long companyId,
		String typeDocId, String orgId, String fieldId, String language,
		int statusDoc, int start, int end) throws SystemException {
		return findByDocsByF_C_O_T_L_S(companyId, typeDocId, orgId, fieldId,
			language, statusDoc, start, end, null);
	}

	/**
	 * Finds an ordered range of all the v legal documents where companyId = &#63; and typeDocId = &#63; and orgId = &#63; and fieldId = &#63; and language = &#63; and statusDoc = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param companyId the company id to search with
	 * @param typeDocId the type doc id to search with
	 * @param orgId the org id to search with
	 * @param fieldId the field id to search with
	 * @param language the language to search with
	 * @param statusDoc the status doc to search with
	 * @param start the lower bound of the range of v legal documents to return
	 * @param end the upper bound of the range of v legal documents to return (not inclusive)
	 * @param orderByComparator the comparator to order the results by
	 * @return the ordered range of matching v legal documents
	 * @throws SystemException if a system exception occurred
	 */
	public List<VLegalDocument> findByDocsByF_C_O_T_L_S(long companyId,
		String typeDocId, String orgId, String fieldId, String language,
		int statusDoc, int start, int end, OrderByComparator orderByComparator)
		throws SystemException {
		Object[] finderArgs = new Object[] {
				companyId, typeDocId, orgId, fieldId, language, statusDoc,
				
				String.valueOf(start), String.valueOf(end),
				String.valueOf(orderByComparator)
			};

		List<VLegalDocument> list = (List<VLegalDocument>)FinderCacheUtil.getResult(FINDER_PATH_FIND_BY_DOCSBYF_C_O_T_L_S,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;

			if (orderByComparator != null) {
				query = new StringBundler(8 +
						(orderByComparator.getOrderByFields().length * 3));
			}
			else {
				query = new StringBundler(8);
			}

			query.append(_SQL_SELECT_VLEGALDOCUMENT_WHERE);

			query.append(_FINDER_COLUMN_DOCSBYF_C_O_T_L_S_COMPANYID_2);

			if (typeDocId == null) {
				query.append(_FINDER_COLUMN_DOCSBYF_C_O_T_L_S_TYPEDOCID_1);
			}
			else {
				if (typeDocId.equals(StringPool.BLANK)) {
					query.append(_FINDER_COLUMN_DOCSBYF_C_O_T_L_S_TYPEDOCID_3);
				}
				else {
					query.append(_FINDER_COLUMN_DOCSBYF_C_O_T_L_S_TYPEDOCID_2);
				}
			}

			if (orgId == null) {
				query.append(_FINDER_COLUMN_DOCSBYF_C_O_T_L_S_ORGID_1);
			}
			else {
				if (orgId.equals(StringPool.BLANK)) {
					query.append(_FINDER_COLUMN_DOCSBYF_C_O_T_L_S_ORGID_3);
				}
				else {
					query.append(_FINDER_COLUMN_DOCSBYF_C_O_T_L_S_ORGID_2);
				}
			}

			if (fieldId == null) {
				query.append(_FINDER_COLUMN_DOCSBYF_C_O_T_L_S_FIELDID_1);
			}
			else {
				if (fieldId.equals(StringPool.BLANK)) {
					query.append(_FINDER_COLUMN_DOCSBYF_C_O_T_L_S_FIELDID_3);
				}
				else {
					query.append(_FINDER_COLUMN_DOCSBYF_C_O_T_L_S_FIELDID_2);
				}
			}

			if (language == null) {
				query.append(_FINDER_COLUMN_DOCSBYF_C_O_T_L_S_LANGUAGE_1);
			}
			else {
				if (language.equals(StringPool.BLANK)) {
					query.append(_FINDER_COLUMN_DOCSBYF_C_O_T_L_S_LANGUAGE_3);
				}
				else {
					query.append(_FINDER_COLUMN_DOCSBYF_C_O_T_L_S_LANGUAGE_2);
				}
			}

			query.append(_FINDER_COLUMN_DOCSBYF_C_O_T_L_S_STATUSDOC_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}

			else {
				query.append(VLegalDocumentModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(companyId);

				if (typeDocId != null) {
					qPos.add(typeDocId);
				}

				if (orgId != null) {
					qPos.add(orgId);
				}

				if (fieldId != null) {
					qPos.add(fieldId);
				}

				if (language != null) {
					qPos.add(language);
				}

				qPos.add(statusDoc);

				list = (List<VLegalDocument>)QueryUtil.list(q, getDialect(),
						start, end);
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (list == null) {
					FinderCacheUtil.removeResult(FINDER_PATH_FIND_BY_DOCSBYF_C_O_T_L_S,
						finderArgs);
				}
				else {
					cacheResult(list);

					FinderCacheUtil.putResult(FINDER_PATH_FIND_BY_DOCSBYF_C_O_T_L_S,
						finderArgs, list);
				}

				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Finds the first v legal document in the ordered set where companyId = &#63; and typeDocId = &#63; and orgId = &#63; and fieldId = &#63; and language = &#63; and statusDoc = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param companyId the company id to search with
	 * @param typeDocId the type doc id to search with
	 * @param orgId the org id to search with
	 * @param fieldId the field id to search with
	 * @param language the language to search with
	 * @param statusDoc the status doc to search with
	 * @param orderByComparator the comparator to order the set by
	 * @return the first matching v legal document
	 * @throws com.vportal.portlet.vlegal.NoSuchVLegalDocumentException if a matching v legal document could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public VLegalDocument findByDocsByF_C_O_T_L_S_First(long companyId,
		String typeDocId, String orgId, String fieldId, String language,
		int statusDoc, OrderByComparator orderByComparator)
		throws NoSuchVLegalDocumentException, SystemException {
		List<VLegalDocument> list = findByDocsByF_C_O_T_L_S(companyId,
				typeDocId, orgId, fieldId, language, statusDoc, 0, 1,
				orderByComparator);

		if (list.isEmpty()) {
			StringBundler msg = new StringBundler(14);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("companyId=");
			msg.append(companyId);

			msg.append(", typeDocId=");
			msg.append(typeDocId);

			msg.append(", orgId=");
			msg.append(orgId);

			msg.append(", fieldId=");
			msg.append(fieldId);

			msg.append(", language=");
			msg.append(language);

			msg.append(", statusDoc=");
			msg.append(statusDoc);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			throw new NoSuchVLegalDocumentException(msg.toString());
		}
		else {
			return list.get(0);
		}
	}

	/**
	 * Finds the last v legal document in the ordered set where companyId = &#63; and typeDocId = &#63; and orgId = &#63; and fieldId = &#63; and language = &#63; and statusDoc = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param companyId the company id to search with
	 * @param typeDocId the type doc id to search with
	 * @param orgId the org id to search with
	 * @param fieldId the field id to search with
	 * @param language the language to search with
	 * @param statusDoc the status doc to search with
	 * @param orderByComparator the comparator to order the set by
	 * @return the last matching v legal document
	 * @throws com.vportal.portlet.vlegal.NoSuchVLegalDocumentException if a matching v legal document could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public VLegalDocument findByDocsByF_C_O_T_L_S_Last(long companyId,
		String typeDocId, String orgId, String fieldId, String language,
		int statusDoc, OrderByComparator orderByComparator)
		throws NoSuchVLegalDocumentException, SystemException {
		int count = countByDocsByF_C_O_T_L_S(companyId, typeDocId, orgId,
				fieldId, language, statusDoc);

		List<VLegalDocument> list = findByDocsByF_C_O_T_L_S(companyId,
				typeDocId, orgId, fieldId, language, statusDoc, count - 1,
				count, orderByComparator);

		if (list.isEmpty()) {
			StringBundler msg = new StringBundler(14);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("companyId=");
			msg.append(companyId);

			msg.append(", typeDocId=");
			msg.append(typeDocId);

			msg.append(", orgId=");
			msg.append(orgId);

			msg.append(", fieldId=");
			msg.append(fieldId);

			msg.append(", language=");
			msg.append(language);

			msg.append(", statusDoc=");
			msg.append(statusDoc);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			throw new NoSuchVLegalDocumentException(msg.toString());
		}
		else {
			return list.get(0);
		}
	}

	/**
	 * Finds the v legal documents before and after the current v legal document in the ordered set where companyId = &#63; and typeDocId = &#63; and orgId = &#63; and fieldId = &#63; and language = &#63; and statusDoc = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param docId the primary key of the current v legal document
	 * @param companyId the company id to search with
	 * @param typeDocId the type doc id to search with
	 * @param orgId the org id to search with
	 * @param fieldId the field id to search with
	 * @param language the language to search with
	 * @param statusDoc the status doc to search with
	 * @param orderByComparator the comparator to order the set by
	 * @return the previous, current, and next v legal document
	 * @throws com.vportal.portlet.vlegal.NoSuchVLegalDocumentException if a v legal document with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public VLegalDocument[] findByDocsByF_C_O_T_L_S_PrevAndNext(String docId,
		long companyId, String typeDocId, String orgId, String fieldId,
		String language, int statusDoc, OrderByComparator orderByComparator)
		throws NoSuchVLegalDocumentException, SystemException {
		VLegalDocument vLegalDocument = findByPrimaryKey(docId);

		Session session = null;

		try {
			session = openSession();

			VLegalDocument[] array = new VLegalDocumentImpl[3];

			array[0] = getByDocsByF_C_O_T_L_S_PrevAndNext(session,
					vLegalDocument, companyId, typeDocId, orgId, fieldId,
					language, statusDoc, orderByComparator, true);

			array[1] = vLegalDocument;

			array[2] = getByDocsByF_C_O_T_L_S_PrevAndNext(session,
					vLegalDocument, companyId, typeDocId, orgId, fieldId,
					language, statusDoc, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected VLegalDocument getByDocsByF_C_O_T_L_S_PrevAndNext(
		Session session, VLegalDocument vLegalDocument, long companyId,
		String typeDocId, String orgId, String fieldId, String language,
		int statusDoc, OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_VLEGALDOCUMENT_WHERE);

		query.append(_FINDER_COLUMN_DOCSBYF_C_O_T_L_S_COMPANYID_2);

		if (typeDocId == null) {
			query.append(_FINDER_COLUMN_DOCSBYF_C_O_T_L_S_TYPEDOCID_1);
		}
		else {
			if (typeDocId.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_DOCSBYF_C_O_T_L_S_TYPEDOCID_3);
			}
			else {
				query.append(_FINDER_COLUMN_DOCSBYF_C_O_T_L_S_TYPEDOCID_2);
			}
		}

		if (orgId == null) {
			query.append(_FINDER_COLUMN_DOCSBYF_C_O_T_L_S_ORGID_1);
		}
		else {
			if (orgId.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_DOCSBYF_C_O_T_L_S_ORGID_3);
			}
			else {
				query.append(_FINDER_COLUMN_DOCSBYF_C_O_T_L_S_ORGID_2);
			}
		}

		if (fieldId == null) {
			query.append(_FINDER_COLUMN_DOCSBYF_C_O_T_L_S_FIELDID_1);
		}
		else {
			if (fieldId.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_DOCSBYF_C_O_T_L_S_FIELDID_3);
			}
			else {
				query.append(_FINDER_COLUMN_DOCSBYF_C_O_T_L_S_FIELDID_2);
			}
		}

		if (language == null) {
			query.append(_FINDER_COLUMN_DOCSBYF_C_O_T_L_S_LANGUAGE_1);
		}
		else {
			if (language.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_DOCSBYF_C_O_T_L_S_LANGUAGE_3);
			}
			else {
				query.append(_FINDER_COLUMN_DOCSBYF_C_O_T_L_S_LANGUAGE_2);
			}
		}

		query.append(_FINDER_COLUMN_DOCSBYF_C_O_T_L_S_STATUSDOC_2);

		if (orderByComparator != null) {
			String[] orderByFields = orderByComparator.getOrderByFields();

			if (orderByFields.length > 0) {
				query.append(WHERE_AND);
			}

			for (int i = 0; i < orderByFields.length; i++) {
				query.append(_ORDER_BY_ENTITY_ALIAS);
				query.append(orderByFields[i]);

				if ((i + 1) < orderByFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(WHERE_GREATER_THAN_HAS_NEXT);
					}
					else {
						query.append(WHERE_LESSER_THAN_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(WHERE_GREATER_THAN);
					}
					else {
						query.append(WHERE_LESSER_THAN);
					}
				}
			}

			query.append(ORDER_BY_CLAUSE);

			for (int i = 0; i < orderByFields.length; i++) {
				query.append(_ORDER_BY_ENTITY_ALIAS);
				query.append(orderByFields[i]);

				if ((i + 1) < orderByFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(ORDER_BY_ASC_HAS_NEXT);
					}
					else {
						query.append(ORDER_BY_DESC_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(ORDER_BY_ASC);
					}
					else {
						query.append(ORDER_BY_DESC);
					}
				}
			}
		}

		else {
			query.append(VLegalDocumentModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(companyId);

		if (typeDocId != null) {
			qPos.add(typeDocId);
		}

		if (orgId != null) {
			qPos.add(orgId);
		}

		if (fieldId != null) {
			qPos.add(fieldId);
		}

		if (language != null) {
			qPos.add(language);
		}

		qPos.add(statusDoc);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByValues(vLegalDocument);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<VLegalDocument> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Finds all the v legal documents where companyId = &#63; and typeDocId = &#63; and orgId = &#63; and fieldId = &#63; and language = &#63; and statusDoc = &#63;.
	 *
	 * @param companyId the company id to search with
	 * @param typeDocId the type doc id to search with
	 * @param orgId the org id to search with
	 * @param fieldId the field id to search with
	 * @param language the language to search with
	 * @param statusDoc the status doc to search with
	 * @return the matching v legal documents
	 * @throws SystemException if a system exception occurred
	 */
	public List<VLegalDocument> findByDocsByC_T_O(long companyId,
		String typeDocId, String orgId, String fieldId, String language,
		int statusDoc) throws SystemException {
		return findByDocsByC_T_O(companyId, typeDocId, orgId, fieldId,
			language, statusDoc, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Finds a range of all the v legal documents where companyId = &#63; and typeDocId = &#63; and orgId = &#63; and fieldId = &#63; and language = &#63; and statusDoc = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param companyId the company id to search with
	 * @param typeDocId the type doc id to search with
	 * @param orgId the org id to search with
	 * @param fieldId the field id to search with
	 * @param language the language to search with
	 * @param statusDoc the status doc to search with
	 * @param start the lower bound of the range of v legal documents to return
	 * @param end the upper bound of the range of v legal documents to return (not inclusive)
	 * @return the range of matching v legal documents
	 * @throws SystemException if a system exception occurred
	 */
	public List<VLegalDocument> findByDocsByC_T_O(long companyId,
		String typeDocId, String orgId, String fieldId, String language,
		int statusDoc, int start, int end) throws SystemException {
		return findByDocsByC_T_O(companyId, typeDocId, orgId, fieldId,
			language, statusDoc, start, end, null);
	}

	/**
	 * Finds an ordered range of all the v legal documents where companyId = &#63; and typeDocId = &#63; and orgId = &#63; and fieldId = &#63; and language = &#63; and statusDoc = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param companyId the company id to search with
	 * @param typeDocId the type doc id to search with
	 * @param orgId the org id to search with
	 * @param fieldId the field id to search with
	 * @param language the language to search with
	 * @param statusDoc the status doc to search with
	 * @param start the lower bound of the range of v legal documents to return
	 * @param end the upper bound of the range of v legal documents to return (not inclusive)
	 * @param orderByComparator the comparator to order the results by
	 * @return the ordered range of matching v legal documents
	 * @throws SystemException if a system exception occurred
	 */
	public List<VLegalDocument> findByDocsByC_T_O(long companyId,
		String typeDocId, String orgId, String fieldId, String language,
		int statusDoc, int start, int end, OrderByComparator orderByComparator)
		throws SystemException {
		Object[] finderArgs = new Object[] {
				companyId, typeDocId, orgId, fieldId, language, statusDoc,
				
				String.valueOf(start), String.valueOf(end),
				String.valueOf(orderByComparator)
			};

		List<VLegalDocument> list = (List<VLegalDocument>)FinderCacheUtil.getResult(FINDER_PATH_FIND_BY_DOCSBYC_T_O,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;

			if (orderByComparator != null) {
				query = new StringBundler(8 +
						(orderByComparator.getOrderByFields().length * 3));
			}
			else {
				query = new StringBundler(8);
			}

			query.append(_SQL_SELECT_VLEGALDOCUMENT_WHERE);

			query.append(_FINDER_COLUMN_DOCSBYC_T_O_COMPANYID_2);

			if (typeDocId == null) {
				query.append(_FINDER_COLUMN_DOCSBYC_T_O_TYPEDOCID_1);
			}
			else {
				if (typeDocId.equals(StringPool.BLANK)) {
					query.append(_FINDER_COLUMN_DOCSBYC_T_O_TYPEDOCID_3);
				}
				else {
					query.append(_FINDER_COLUMN_DOCSBYC_T_O_TYPEDOCID_2);
				}
			}

			if (orgId == null) {
				query.append(_FINDER_COLUMN_DOCSBYC_T_O_ORGID_1);
			}
			else {
				if (orgId.equals(StringPool.BLANK)) {
					query.append(_FINDER_COLUMN_DOCSBYC_T_O_ORGID_3);
				}
				else {
					query.append(_FINDER_COLUMN_DOCSBYC_T_O_ORGID_2);
				}
			}

			if (fieldId == null) {
				query.append(_FINDER_COLUMN_DOCSBYC_T_O_FIELDID_1);
			}
			else {
				if (fieldId.equals(StringPool.BLANK)) {
					query.append(_FINDER_COLUMN_DOCSBYC_T_O_FIELDID_3);
				}
				else {
					query.append(_FINDER_COLUMN_DOCSBYC_T_O_FIELDID_2);
				}
			}

			if (language == null) {
				query.append(_FINDER_COLUMN_DOCSBYC_T_O_LANGUAGE_1);
			}
			else {
				if (language.equals(StringPool.BLANK)) {
					query.append(_FINDER_COLUMN_DOCSBYC_T_O_LANGUAGE_3);
				}
				else {
					query.append(_FINDER_COLUMN_DOCSBYC_T_O_LANGUAGE_2);
				}
			}

			query.append(_FINDER_COLUMN_DOCSBYC_T_O_STATUSDOC_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}

			else {
				query.append(VLegalDocumentModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(companyId);

				if (typeDocId != null) {
					qPos.add(typeDocId);
				}

				if (orgId != null) {
					qPos.add(orgId);
				}

				if (fieldId != null) {
					qPos.add(fieldId);
				}

				if (language != null) {
					qPos.add(language);
				}

				qPos.add(statusDoc);

				list = (List<VLegalDocument>)QueryUtil.list(q, getDialect(),
						start, end);
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (list == null) {
					FinderCacheUtil.removeResult(FINDER_PATH_FIND_BY_DOCSBYC_T_O,
						finderArgs);
				}
				else {
					cacheResult(list);

					FinderCacheUtil.putResult(FINDER_PATH_FIND_BY_DOCSBYC_T_O,
						finderArgs, list);
				}

				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Finds the first v legal document in the ordered set where companyId = &#63; and typeDocId = &#63; and orgId = &#63; and fieldId = &#63; and language = &#63; and statusDoc = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param companyId the company id to search with
	 * @param typeDocId the type doc id to search with
	 * @param orgId the org id to search with
	 * @param fieldId the field id to search with
	 * @param language the language to search with
	 * @param statusDoc the status doc to search with
	 * @param orderByComparator the comparator to order the set by
	 * @return the first matching v legal document
	 * @throws com.vportal.portlet.vlegal.NoSuchVLegalDocumentException if a matching v legal document could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public VLegalDocument findByDocsByC_T_O_First(long companyId,
		String typeDocId, String orgId, String fieldId, String language,
		int statusDoc, OrderByComparator orderByComparator)
		throws NoSuchVLegalDocumentException, SystemException {
		List<VLegalDocument> list = findByDocsByC_T_O(companyId, typeDocId,
				orgId, fieldId, language, statusDoc, 0, 1, orderByComparator);

		if (list.isEmpty()) {
			StringBundler msg = new StringBundler(14);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("companyId=");
			msg.append(companyId);

			msg.append(", typeDocId=");
			msg.append(typeDocId);

			msg.append(", orgId=");
			msg.append(orgId);

			msg.append(", fieldId=");
			msg.append(fieldId);

			msg.append(", language=");
			msg.append(language);

			msg.append(", statusDoc=");
			msg.append(statusDoc);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			throw new NoSuchVLegalDocumentException(msg.toString());
		}
		else {
			return list.get(0);
		}
	}

	/**
	 * Finds the last v legal document in the ordered set where companyId = &#63; and typeDocId = &#63; and orgId = &#63; and fieldId = &#63; and language = &#63; and statusDoc = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param companyId the company id to search with
	 * @param typeDocId the type doc id to search with
	 * @param orgId the org id to search with
	 * @param fieldId the field id to search with
	 * @param language the language to search with
	 * @param statusDoc the status doc to search with
	 * @param orderByComparator the comparator to order the set by
	 * @return the last matching v legal document
	 * @throws com.vportal.portlet.vlegal.NoSuchVLegalDocumentException if a matching v legal document could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public VLegalDocument findByDocsByC_T_O_Last(long companyId,
		String typeDocId, String orgId, String fieldId, String language,
		int statusDoc, OrderByComparator orderByComparator)
		throws NoSuchVLegalDocumentException, SystemException {
		int count = countByDocsByC_T_O(companyId, typeDocId, orgId, fieldId,
				language, statusDoc);

		List<VLegalDocument> list = findByDocsByC_T_O(companyId, typeDocId,
				orgId, fieldId, language, statusDoc, count - 1, count,
				orderByComparator);

		if (list.isEmpty()) {
			StringBundler msg = new StringBundler(14);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("companyId=");
			msg.append(companyId);

			msg.append(", typeDocId=");
			msg.append(typeDocId);

			msg.append(", orgId=");
			msg.append(orgId);

			msg.append(", fieldId=");
			msg.append(fieldId);

			msg.append(", language=");
			msg.append(language);

			msg.append(", statusDoc=");
			msg.append(statusDoc);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			throw new NoSuchVLegalDocumentException(msg.toString());
		}
		else {
			return list.get(0);
		}
	}

	/**
	 * Finds the v legal documents before and after the current v legal document in the ordered set where companyId = &#63; and typeDocId = &#63; and orgId = &#63; and fieldId = &#63; and language = &#63; and statusDoc = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param docId the primary key of the current v legal document
	 * @param companyId the company id to search with
	 * @param typeDocId the type doc id to search with
	 * @param orgId the org id to search with
	 * @param fieldId the field id to search with
	 * @param language the language to search with
	 * @param statusDoc the status doc to search with
	 * @param orderByComparator the comparator to order the set by
	 * @return the previous, current, and next v legal document
	 * @throws com.vportal.portlet.vlegal.NoSuchVLegalDocumentException if a v legal document with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public VLegalDocument[] findByDocsByC_T_O_PrevAndNext(String docId,
		long companyId, String typeDocId, String orgId, String fieldId,
		String language, int statusDoc, OrderByComparator orderByComparator)
		throws NoSuchVLegalDocumentException, SystemException {
		VLegalDocument vLegalDocument = findByPrimaryKey(docId);

		Session session = null;

		try {
			session = openSession();

			VLegalDocument[] array = new VLegalDocumentImpl[3];

			array[0] = getByDocsByC_T_O_PrevAndNext(session, vLegalDocument,
					companyId, typeDocId, orgId, fieldId, language, statusDoc,
					orderByComparator, true);

			array[1] = vLegalDocument;

			array[2] = getByDocsByC_T_O_PrevAndNext(session, vLegalDocument,
					companyId, typeDocId, orgId, fieldId, language, statusDoc,
					orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected VLegalDocument getByDocsByC_T_O_PrevAndNext(Session session,
		VLegalDocument vLegalDocument, long companyId, String typeDocId,
		String orgId, String fieldId, String language, int statusDoc,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_VLEGALDOCUMENT_WHERE);

		query.append(_FINDER_COLUMN_DOCSBYC_T_O_COMPANYID_2);

		if (typeDocId == null) {
			query.append(_FINDER_COLUMN_DOCSBYC_T_O_TYPEDOCID_1);
		}
		else {
			if (typeDocId.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_DOCSBYC_T_O_TYPEDOCID_3);
			}
			else {
				query.append(_FINDER_COLUMN_DOCSBYC_T_O_TYPEDOCID_2);
			}
		}

		if (orgId == null) {
			query.append(_FINDER_COLUMN_DOCSBYC_T_O_ORGID_1);
		}
		else {
			if (orgId.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_DOCSBYC_T_O_ORGID_3);
			}
			else {
				query.append(_FINDER_COLUMN_DOCSBYC_T_O_ORGID_2);
			}
		}

		if (fieldId == null) {
			query.append(_FINDER_COLUMN_DOCSBYC_T_O_FIELDID_1);
		}
		else {
			if (fieldId.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_DOCSBYC_T_O_FIELDID_3);
			}
			else {
				query.append(_FINDER_COLUMN_DOCSBYC_T_O_FIELDID_2);
			}
		}

		if (language == null) {
			query.append(_FINDER_COLUMN_DOCSBYC_T_O_LANGUAGE_1);
		}
		else {
			if (language.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_DOCSBYC_T_O_LANGUAGE_3);
			}
			else {
				query.append(_FINDER_COLUMN_DOCSBYC_T_O_LANGUAGE_2);
			}
		}

		query.append(_FINDER_COLUMN_DOCSBYC_T_O_STATUSDOC_2);

		if (orderByComparator != null) {
			String[] orderByFields = orderByComparator.getOrderByFields();

			if (orderByFields.length > 0) {
				query.append(WHERE_AND);
			}

			for (int i = 0; i < orderByFields.length; i++) {
				query.append(_ORDER_BY_ENTITY_ALIAS);
				query.append(orderByFields[i]);

				if ((i + 1) < orderByFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(WHERE_GREATER_THAN_HAS_NEXT);
					}
					else {
						query.append(WHERE_LESSER_THAN_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(WHERE_GREATER_THAN);
					}
					else {
						query.append(WHERE_LESSER_THAN);
					}
				}
			}

			query.append(ORDER_BY_CLAUSE);

			for (int i = 0; i < orderByFields.length; i++) {
				query.append(_ORDER_BY_ENTITY_ALIAS);
				query.append(orderByFields[i]);

				if ((i + 1) < orderByFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(ORDER_BY_ASC_HAS_NEXT);
					}
					else {
						query.append(ORDER_BY_DESC_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(ORDER_BY_ASC);
					}
					else {
						query.append(ORDER_BY_DESC);
					}
				}
			}
		}

		else {
			query.append(VLegalDocumentModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(companyId);

		if (typeDocId != null) {
			qPos.add(typeDocId);
		}

		if (orgId != null) {
			qPos.add(orgId);
		}

		if (fieldId != null) {
			qPos.add(fieldId);
		}

		if (language != null) {
			qPos.add(language);
		}

		qPos.add(statusDoc);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByValues(vLegalDocument);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<VLegalDocument> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Finds all the v legal documents where groupId = &#63; and orgId = &#63; and typeDocId = &#63; and language = &#63; and statusDoc = &#63;.
	 *
	 * @param groupId the group id to search with
	 * @param orgId the org id to search with
	 * @param typeDocId the type doc id to search with
	 * @param language the language to search with
	 * @param statusDoc the status doc to search with
	 * @return the matching v legal documents
	 * @throws SystemException if a system exception occurred
	 */
	public List<VLegalDocument> findByDocsByG_O_T_L_S(long groupId,
		String orgId, String typeDocId, String language, int statusDoc)
		throws SystemException {
		return findByDocsByG_O_T_L_S(groupId, orgId, typeDocId, language,
			statusDoc, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Finds a range of all the v legal documents where groupId = &#63; and orgId = &#63; and typeDocId = &#63; and language = &#63; and statusDoc = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param groupId the group id to search with
	 * @param orgId the org id to search with
	 * @param typeDocId the type doc id to search with
	 * @param language the language to search with
	 * @param statusDoc the status doc to search with
	 * @param start the lower bound of the range of v legal documents to return
	 * @param end the upper bound of the range of v legal documents to return (not inclusive)
	 * @return the range of matching v legal documents
	 * @throws SystemException if a system exception occurred
	 */
	public List<VLegalDocument> findByDocsByG_O_T_L_S(long groupId,
		String orgId, String typeDocId, String language, int statusDoc,
		int start, int end) throws SystemException {
		return findByDocsByG_O_T_L_S(groupId, orgId, typeDocId, language,
			statusDoc, start, end, null);
	}

	/**
	 * Finds an ordered range of all the v legal documents where groupId = &#63; and orgId = &#63; and typeDocId = &#63; and language = &#63; and statusDoc = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param groupId the group id to search with
	 * @param orgId the org id to search with
	 * @param typeDocId the type doc id to search with
	 * @param language the language to search with
	 * @param statusDoc the status doc to search with
	 * @param start the lower bound of the range of v legal documents to return
	 * @param end the upper bound of the range of v legal documents to return (not inclusive)
	 * @param orderByComparator the comparator to order the results by
	 * @return the ordered range of matching v legal documents
	 * @throws SystemException if a system exception occurred
	 */
	public List<VLegalDocument> findByDocsByG_O_T_L_S(long groupId,
		String orgId, String typeDocId, String language, int statusDoc,
		int start, int end, OrderByComparator orderByComparator)
		throws SystemException {
		Object[] finderArgs = new Object[] {
				groupId, orgId, typeDocId, language, statusDoc,
				
				String.valueOf(start), String.valueOf(end),
				String.valueOf(orderByComparator)
			};

		List<VLegalDocument> list = (List<VLegalDocument>)FinderCacheUtil.getResult(FINDER_PATH_FIND_BY_DOCSBYG_O_T_L_S,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;

			if (orderByComparator != null) {
				query = new StringBundler(7 +
						(orderByComparator.getOrderByFields().length * 3));
			}
			else {
				query = new StringBundler(7);
			}

			query.append(_SQL_SELECT_VLEGALDOCUMENT_WHERE);

			query.append(_FINDER_COLUMN_DOCSBYG_O_T_L_S_GROUPID_2);

			if (orgId == null) {
				query.append(_FINDER_COLUMN_DOCSBYG_O_T_L_S_ORGID_1);
			}
			else {
				if (orgId.equals(StringPool.BLANK)) {
					query.append(_FINDER_COLUMN_DOCSBYG_O_T_L_S_ORGID_3);
				}
				else {
					query.append(_FINDER_COLUMN_DOCSBYG_O_T_L_S_ORGID_2);
				}
			}

			if (typeDocId == null) {
				query.append(_FINDER_COLUMN_DOCSBYG_O_T_L_S_TYPEDOCID_1);
			}
			else {
				if (typeDocId.equals(StringPool.BLANK)) {
					query.append(_FINDER_COLUMN_DOCSBYG_O_T_L_S_TYPEDOCID_3);
				}
				else {
					query.append(_FINDER_COLUMN_DOCSBYG_O_T_L_S_TYPEDOCID_2);
				}
			}

			if (language == null) {
				query.append(_FINDER_COLUMN_DOCSBYG_O_T_L_S_LANGUAGE_1);
			}
			else {
				if (language.equals(StringPool.BLANK)) {
					query.append(_FINDER_COLUMN_DOCSBYG_O_T_L_S_LANGUAGE_3);
				}
				else {
					query.append(_FINDER_COLUMN_DOCSBYG_O_T_L_S_LANGUAGE_2);
				}
			}

			query.append(_FINDER_COLUMN_DOCSBYG_O_T_L_S_STATUSDOC_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}

			else {
				query.append(VLegalDocumentModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(groupId);

				if (orgId != null) {
					qPos.add(orgId);
				}

				if (typeDocId != null) {
					qPos.add(typeDocId);
				}

				if (language != null) {
					qPos.add(language);
				}

				qPos.add(statusDoc);

				list = (List<VLegalDocument>)QueryUtil.list(q, getDialect(),
						start, end);
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (list == null) {
					FinderCacheUtil.removeResult(FINDER_PATH_FIND_BY_DOCSBYG_O_T_L_S,
						finderArgs);
				}
				else {
					cacheResult(list);

					FinderCacheUtil.putResult(FINDER_PATH_FIND_BY_DOCSBYG_O_T_L_S,
						finderArgs, list);
				}

				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Finds the first v legal document in the ordered set where groupId = &#63; and orgId = &#63; and typeDocId = &#63; and language = &#63; and statusDoc = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param groupId the group id to search with
	 * @param orgId the org id to search with
	 * @param typeDocId the type doc id to search with
	 * @param language the language to search with
	 * @param statusDoc the status doc to search with
	 * @param orderByComparator the comparator to order the set by
	 * @return the first matching v legal document
	 * @throws com.vportal.portlet.vlegal.NoSuchVLegalDocumentException if a matching v legal document could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public VLegalDocument findByDocsByG_O_T_L_S_First(long groupId,
		String orgId, String typeDocId, String language, int statusDoc,
		OrderByComparator orderByComparator)
		throws NoSuchVLegalDocumentException, SystemException {
		List<VLegalDocument> list = findByDocsByG_O_T_L_S(groupId, orgId,
				typeDocId, language, statusDoc, 0, 1, orderByComparator);

		if (list.isEmpty()) {
			StringBundler msg = new StringBundler(12);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("groupId=");
			msg.append(groupId);

			msg.append(", orgId=");
			msg.append(orgId);

			msg.append(", typeDocId=");
			msg.append(typeDocId);

			msg.append(", language=");
			msg.append(language);

			msg.append(", statusDoc=");
			msg.append(statusDoc);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			throw new NoSuchVLegalDocumentException(msg.toString());
		}
		else {
			return list.get(0);
		}
	}

	/**
	 * Finds the last v legal document in the ordered set where groupId = &#63; and orgId = &#63; and typeDocId = &#63; and language = &#63; and statusDoc = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param groupId the group id to search with
	 * @param orgId the org id to search with
	 * @param typeDocId the type doc id to search with
	 * @param language the language to search with
	 * @param statusDoc the status doc to search with
	 * @param orderByComparator the comparator to order the set by
	 * @return the last matching v legal document
	 * @throws com.vportal.portlet.vlegal.NoSuchVLegalDocumentException if a matching v legal document could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public VLegalDocument findByDocsByG_O_T_L_S_Last(long groupId,
		String orgId, String typeDocId, String language, int statusDoc,
		OrderByComparator orderByComparator)
		throws NoSuchVLegalDocumentException, SystemException {
		int count = countByDocsByG_O_T_L_S(groupId, orgId, typeDocId, language,
				statusDoc);

		List<VLegalDocument> list = findByDocsByG_O_T_L_S(groupId, orgId,
				typeDocId, language, statusDoc, count - 1, count,
				orderByComparator);

		if (list.isEmpty()) {
			StringBundler msg = new StringBundler(12);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("groupId=");
			msg.append(groupId);

			msg.append(", orgId=");
			msg.append(orgId);

			msg.append(", typeDocId=");
			msg.append(typeDocId);

			msg.append(", language=");
			msg.append(language);

			msg.append(", statusDoc=");
			msg.append(statusDoc);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			throw new NoSuchVLegalDocumentException(msg.toString());
		}
		else {
			return list.get(0);
		}
	}

	/**
	 * Finds the v legal documents before and after the current v legal document in the ordered set where groupId = &#63; and orgId = &#63; and typeDocId = &#63; and language = &#63; and statusDoc = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param docId the primary key of the current v legal document
	 * @param groupId the group id to search with
	 * @param orgId the org id to search with
	 * @param typeDocId the type doc id to search with
	 * @param language the language to search with
	 * @param statusDoc the status doc to search with
	 * @param orderByComparator the comparator to order the set by
	 * @return the previous, current, and next v legal document
	 * @throws com.vportal.portlet.vlegal.NoSuchVLegalDocumentException if a v legal document with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public VLegalDocument[] findByDocsByG_O_T_L_S_PrevAndNext(String docId,
		long groupId, String orgId, String typeDocId, String language,
		int statusDoc, OrderByComparator orderByComparator)
		throws NoSuchVLegalDocumentException, SystemException {
		VLegalDocument vLegalDocument = findByPrimaryKey(docId);

		Session session = null;

		try {
			session = openSession();

			VLegalDocument[] array = new VLegalDocumentImpl[3];

			array[0] = getByDocsByG_O_T_L_S_PrevAndNext(session,
					vLegalDocument, groupId, orgId, typeDocId, language,
					statusDoc, orderByComparator, true);

			array[1] = vLegalDocument;

			array[2] = getByDocsByG_O_T_L_S_PrevAndNext(session,
					vLegalDocument, groupId, orgId, typeDocId, language,
					statusDoc, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected VLegalDocument getByDocsByG_O_T_L_S_PrevAndNext(Session session,
		VLegalDocument vLegalDocument, long groupId, String orgId,
		String typeDocId, String language, int statusDoc,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_VLEGALDOCUMENT_WHERE);

		query.append(_FINDER_COLUMN_DOCSBYG_O_T_L_S_GROUPID_2);

		if (orgId == null) {
			query.append(_FINDER_COLUMN_DOCSBYG_O_T_L_S_ORGID_1);
		}
		else {
			if (orgId.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_DOCSBYG_O_T_L_S_ORGID_3);
			}
			else {
				query.append(_FINDER_COLUMN_DOCSBYG_O_T_L_S_ORGID_2);
			}
		}

		if (typeDocId == null) {
			query.append(_FINDER_COLUMN_DOCSBYG_O_T_L_S_TYPEDOCID_1);
		}
		else {
			if (typeDocId.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_DOCSBYG_O_T_L_S_TYPEDOCID_3);
			}
			else {
				query.append(_FINDER_COLUMN_DOCSBYG_O_T_L_S_TYPEDOCID_2);
			}
		}

		if (language == null) {
			query.append(_FINDER_COLUMN_DOCSBYG_O_T_L_S_LANGUAGE_1);
		}
		else {
			if (language.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_DOCSBYG_O_T_L_S_LANGUAGE_3);
			}
			else {
				query.append(_FINDER_COLUMN_DOCSBYG_O_T_L_S_LANGUAGE_2);
			}
		}

		query.append(_FINDER_COLUMN_DOCSBYG_O_T_L_S_STATUSDOC_2);

		if (orderByComparator != null) {
			String[] orderByFields = orderByComparator.getOrderByFields();

			if (orderByFields.length > 0) {
				query.append(WHERE_AND);
			}

			for (int i = 0; i < orderByFields.length; i++) {
				query.append(_ORDER_BY_ENTITY_ALIAS);
				query.append(orderByFields[i]);

				if ((i + 1) < orderByFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(WHERE_GREATER_THAN_HAS_NEXT);
					}
					else {
						query.append(WHERE_LESSER_THAN_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(WHERE_GREATER_THAN);
					}
					else {
						query.append(WHERE_LESSER_THAN);
					}
				}
			}

			query.append(ORDER_BY_CLAUSE);

			for (int i = 0; i < orderByFields.length; i++) {
				query.append(_ORDER_BY_ENTITY_ALIAS);
				query.append(orderByFields[i]);

				if ((i + 1) < orderByFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(ORDER_BY_ASC_HAS_NEXT);
					}
					else {
						query.append(ORDER_BY_DESC_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(ORDER_BY_ASC);
					}
					else {
						query.append(ORDER_BY_DESC);
					}
				}
			}
		}

		else {
			query.append(VLegalDocumentModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(groupId);

		if (orgId != null) {
			qPos.add(orgId);
		}

		if (typeDocId != null) {
			qPos.add(typeDocId);
		}

		if (language != null) {
			qPos.add(language);
		}

		qPos.add(statusDoc);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByValues(vLegalDocument);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<VLegalDocument> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Finds all the v legal documents where language = &#63; and orgId = &#63; and fieldId = &#63; and statusDoc = &#63;.
	 *
	 * @param language the language to search with
	 * @param orgId the org id to search with
	 * @param fieldId the field id to search with
	 * @param statusDoc the status doc to search with
	 * @return the matching v legal documents
	 * @throws SystemException if a system exception occurred
	 */
	public List<VLegalDocument> findByDocsByL_O_F_S(String language,
		String orgId, String fieldId, int statusDoc) throws SystemException {
		return findByDocsByL_O_F_S(language, orgId, fieldId, statusDoc,
			QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Finds a range of all the v legal documents where language = &#63; and orgId = &#63; and fieldId = &#63; and statusDoc = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param language the language to search with
	 * @param orgId the org id to search with
	 * @param fieldId the field id to search with
	 * @param statusDoc the status doc to search with
	 * @param start the lower bound of the range of v legal documents to return
	 * @param end the upper bound of the range of v legal documents to return (not inclusive)
	 * @return the range of matching v legal documents
	 * @throws SystemException if a system exception occurred
	 */
	public List<VLegalDocument> findByDocsByL_O_F_S(String language,
		String orgId, String fieldId, int statusDoc, int start, int end)
		throws SystemException {
		return findByDocsByL_O_F_S(language, orgId, fieldId, statusDoc, start,
			end, null);
	}

	/**
	 * Finds an ordered range of all the v legal documents where language = &#63; and orgId = &#63; and fieldId = &#63; and statusDoc = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param language the language to search with
	 * @param orgId the org id to search with
	 * @param fieldId the field id to search with
	 * @param statusDoc the status doc to search with
	 * @param start the lower bound of the range of v legal documents to return
	 * @param end the upper bound of the range of v legal documents to return (not inclusive)
	 * @param orderByComparator the comparator to order the results by
	 * @return the ordered range of matching v legal documents
	 * @throws SystemException if a system exception occurred
	 */
	public List<VLegalDocument> findByDocsByL_O_F_S(String language,
		String orgId, String fieldId, int statusDoc, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		Object[] finderArgs = new Object[] {
				language, orgId, fieldId, statusDoc,
				
				String.valueOf(start), String.valueOf(end),
				String.valueOf(orderByComparator)
			};

		List<VLegalDocument> list = (List<VLegalDocument>)FinderCacheUtil.getResult(FINDER_PATH_FIND_BY_DOCSBYL_O_F_S,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;

			if (orderByComparator != null) {
				query = new StringBundler(6 +
						(orderByComparator.getOrderByFields().length * 3));
			}
			else {
				query = new StringBundler(6);
			}

			query.append(_SQL_SELECT_VLEGALDOCUMENT_WHERE);

			if (language == null) {
				query.append(_FINDER_COLUMN_DOCSBYL_O_F_S_LANGUAGE_1);
			}
			else {
				if (language.equals(StringPool.BLANK)) {
					query.append(_FINDER_COLUMN_DOCSBYL_O_F_S_LANGUAGE_3);
				}
				else {
					query.append(_FINDER_COLUMN_DOCSBYL_O_F_S_LANGUAGE_2);
				}
			}

			if (orgId == null) {
				query.append(_FINDER_COLUMN_DOCSBYL_O_F_S_ORGID_1);
			}
			else {
				if (orgId.equals(StringPool.BLANK)) {
					query.append(_FINDER_COLUMN_DOCSBYL_O_F_S_ORGID_3);
				}
				else {
					query.append(_FINDER_COLUMN_DOCSBYL_O_F_S_ORGID_2);
				}
			}

			if (fieldId == null) {
				query.append(_FINDER_COLUMN_DOCSBYL_O_F_S_FIELDID_1);
			}
			else {
				if (fieldId.equals(StringPool.BLANK)) {
					query.append(_FINDER_COLUMN_DOCSBYL_O_F_S_FIELDID_3);
				}
				else {
					query.append(_FINDER_COLUMN_DOCSBYL_O_F_S_FIELDID_2);
				}
			}

			query.append(_FINDER_COLUMN_DOCSBYL_O_F_S_STATUSDOC_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}

			else {
				query.append(VLegalDocumentModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (language != null) {
					qPos.add(language);
				}

				if (orgId != null) {
					qPos.add(orgId);
				}

				if (fieldId != null) {
					qPos.add(fieldId);
				}

				qPos.add(statusDoc);

				list = (List<VLegalDocument>)QueryUtil.list(q, getDialect(),
						start, end);
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (list == null) {
					FinderCacheUtil.removeResult(FINDER_PATH_FIND_BY_DOCSBYL_O_F_S,
						finderArgs);
				}
				else {
					cacheResult(list);

					FinderCacheUtil.putResult(FINDER_PATH_FIND_BY_DOCSBYL_O_F_S,
						finderArgs, list);
				}

				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Finds the first v legal document in the ordered set where language = &#63; and orgId = &#63; and fieldId = &#63; and statusDoc = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param language the language to search with
	 * @param orgId the org id to search with
	 * @param fieldId the field id to search with
	 * @param statusDoc the status doc to search with
	 * @param orderByComparator the comparator to order the set by
	 * @return the first matching v legal document
	 * @throws com.vportal.portlet.vlegal.NoSuchVLegalDocumentException if a matching v legal document could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public VLegalDocument findByDocsByL_O_F_S_First(String language,
		String orgId, String fieldId, int statusDoc,
		OrderByComparator orderByComparator)
		throws NoSuchVLegalDocumentException, SystemException {
		List<VLegalDocument> list = findByDocsByL_O_F_S(language, orgId,
				fieldId, statusDoc, 0, 1, orderByComparator);

		if (list.isEmpty()) {
			StringBundler msg = new StringBundler(10);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("language=");
			msg.append(language);

			msg.append(", orgId=");
			msg.append(orgId);

			msg.append(", fieldId=");
			msg.append(fieldId);

			msg.append(", statusDoc=");
			msg.append(statusDoc);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			throw new NoSuchVLegalDocumentException(msg.toString());
		}
		else {
			return list.get(0);
		}
	}

	/**
	 * Finds the last v legal document in the ordered set where language = &#63; and orgId = &#63; and fieldId = &#63; and statusDoc = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param language the language to search with
	 * @param orgId the org id to search with
	 * @param fieldId the field id to search with
	 * @param statusDoc the status doc to search with
	 * @param orderByComparator the comparator to order the set by
	 * @return the last matching v legal document
	 * @throws com.vportal.portlet.vlegal.NoSuchVLegalDocumentException if a matching v legal document could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public VLegalDocument findByDocsByL_O_F_S_Last(String language,
		String orgId, String fieldId, int statusDoc,
		OrderByComparator orderByComparator)
		throws NoSuchVLegalDocumentException, SystemException {
		int count = countByDocsByL_O_F_S(language, orgId, fieldId, statusDoc);

		List<VLegalDocument> list = findByDocsByL_O_F_S(language, orgId,
				fieldId, statusDoc, count - 1, count, orderByComparator);

		if (list.isEmpty()) {
			StringBundler msg = new StringBundler(10);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("language=");
			msg.append(language);

			msg.append(", orgId=");
			msg.append(orgId);

			msg.append(", fieldId=");
			msg.append(fieldId);

			msg.append(", statusDoc=");
			msg.append(statusDoc);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			throw new NoSuchVLegalDocumentException(msg.toString());
		}
		else {
			return list.get(0);
		}
	}

	/**
	 * Finds the v legal documents before and after the current v legal document in the ordered set where language = &#63; and orgId = &#63; and fieldId = &#63; and statusDoc = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param docId the primary key of the current v legal document
	 * @param language the language to search with
	 * @param orgId the org id to search with
	 * @param fieldId the field id to search with
	 * @param statusDoc the status doc to search with
	 * @param orderByComparator the comparator to order the set by
	 * @return the previous, current, and next v legal document
	 * @throws com.vportal.portlet.vlegal.NoSuchVLegalDocumentException if a v legal document with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public VLegalDocument[] findByDocsByL_O_F_S_PrevAndNext(String docId,
		String language, String orgId, String fieldId, int statusDoc,
		OrderByComparator orderByComparator)
		throws NoSuchVLegalDocumentException, SystemException {
		VLegalDocument vLegalDocument = findByPrimaryKey(docId);

		Session session = null;

		try {
			session = openSession();

			VLegalDocument[] array = new VLegalDocumentImpl[3];

			array[0] = getByDocsByL_O_F_S_PrevAndNext(session, vLegalDocument,
					language, orgId, fieldId, statusDoc, orderByComparator, true);

			array[1] = vLegalDocument;

			array[2] = getByDocsByL_O_F_S_PrevAndNext(session, vLegalDocument,
					language, orgId, fieldId, statusDoc, orderByComparator,
					false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected VLegalDocument getByDocsByL_O_F_S_PrevAndNext(Session session,
		VLegalDocument vLegalDocument, String language, String orgId,
		String fieldId, int statusDoc, OrderByComparator orderByComparator,
		boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_VLEGALDOCUMENT_WHERE);

		if (language == null) {
			query.append(_FINDER_COLUMN_DOCSBYL_O_F_S_LANGUAGE_1);
		}
		else {
			if (language.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_DOCSBYL_O_F_S_LANGUAGE_3);
			}
			else {
				query.append(_FINDER_COLUMN_DOCSBYL_O_F_S_LANGUAGE_2);
			}
		}

		if (orgId == null) {
			query.append(_FINDER_COLUMN_DOCSBYL_O_F_S_ORGID_1);
		}
		else {
			if (orgId.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_DOCSBYL_O_F_S_ORGID_3);
			}
			else {
				query.append(_FINDER_COLUMN_DOCSBYL_O_F_S_ORGID_2);
			}
		}

		if (fieldId == null) {
			query.append(_FINDER_COLUMN_DOCSBYL_O_F_S_FIELDID_1);
		}
		else {
			if (fieldId.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_DOCSBYL_O_F_S_FIELDID_3);
			}
			else {
				query.append(_FINDER_COLUMN_DOCSBYL_O_F_S_FIELDID_2);
			}
		}

		query.append(_FINDER_COLUMN_DOCSBYL_O_F_S_STATUSDOC_2);

		if (orderByComparator != null) {
			String[] orderByFields = orderByComparator.getOrderByFields();

			if (orderByFields.length > 0) {
				query.append(WHERE_AND);
			}

			for (int i = 0; i < orderByFields.length; i++) {
				query.append(_ORDER_BY_ENTITY_ALIAS);
				query.append(orderByFields[i]);

				if ((i + 1) < orderByFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(WHERE_GREATER_THAN_HAS_NEXT);
					}
					else {
						query.append(WHERE_LESSER_THAN_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(WHERE_GREATER_THAN);
					}
					else {
						query.append(WHERE_LESSER_THAN);
					}
				}
			}

			query.append(ORDER_BY_CLAUSE);

			for (int i = 0; i < orderByFields.length; i++) {
				query.append(_ORDER_BY_ENTITY_ALIAS);
				query.append(orderByFields[i]);

				if ((i + 1) < orderByFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(ORDER_BY_ASC_HAS_NEXT);
					}
					else {
						query.append(ORDER_BY_DESC_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(ORDER_BY_ASC);
					}
					else {
						query.append(ORDER_BY_DESC);
					}
				}
			}
		}

		else {
			query.append(VLegalDocumentModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		if (language != null) {
			qPos.add(language);
		}

		if (orgId != null) {
			qPos.add(orgId);
		}

		if (fieldId != null) {
			qPos.add(fieldId);
		}

		qPos.add(statusDoc);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByValues(vLegalDocument);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<VLegalDocument> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Finds all the v legal documents where language = &#63; and typeDocId = &#63; and fieldId = &#63; and statusDoc = &#63;.
	 *
	 * @param language the language to search with
	 * @param typeDocId the type doc id to search with
	 * @param fieldId the field id to search with
	 * @param statusDoc the status doc to search with
	 * @return the matching v legal documents
	 * @throws SystemException if a system exception occurred
	 */
	public List<VLegalDocument> findByDocsByL_T_F_S(String language,
		String typeDocId, String fieldId, int statusDoc)
		throws SystemException {
		return findByDocsByL_T_F_S(language, typeDocId, fieldId, statusDoc,
			QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Finds a range of all the v legal documents where language = &#63; and typeDocId = &#63; and fieldId = &#63; and statusDoc = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param language the language to search with
	 * @param typeDocId the type doc id to search with
	 * @param fieldId the field id to search with
	 * @param statusDoc the status doc to search with
	 * @param start the lower bound of the range of v legal documents to return
	 * @param end the upper bound of the range of v legal documents to return (not inclusive)
	 * @return the range of matching v legal documents
	 * @throws SystemException if a system exception occurred
	 */
	public List<VLegalDocument> findByDocsByL_T_F_S(String language,
		String typeDocId, String fieldId, int statusDoc, int start, int end)
		throws SystemException {
		return findByDocsByL_T_F_S(language, typeDocId, fieldId, statusDoc,
			start, end, null);
	}

	/**
	 * Finds an ordered range of all the v legal documents where language = &#63; and typeDocId = &#63; and fieldId = &#63; and statusDoc = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param language the language to search with
	 * @param typeDocId the type doc id to search with
	 * @param fieldId the field id to search with
	 * @param statusDoc the status doc to search with
	 * @param start the lower bound of the range of v legal documents to return
	 * @param end the upper bound of the range of v legal documents to return (not inclusive)
	 * @param orderByComparator the comparator to order the results by
	 * @return the ordered range of matching v legal documents
	 * @throws SystemException if a system exception occurred
	 */
	public List<VLegalDocument> findByDocsByL_T_F_S(String language,
		String typeDocId, String fieldId, int statusDoc, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		Object[] finderArgs = new Object[] {
				language, typeDocId, fieldId, statusDoc,
				
				String.valueOf(start), String.valueOf(end),
				String.valueOf(orderByComparator)
			};

		List<VLegalDocument> list = (List<VLegalDocument>)FinderCacheUtil.getResult(FINDER_PATH_FIND_BY_DOCSBYL_T_F_S,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;

			if (orderByComparator != null) {
				query = new StringBundler(6 +
						(orderByComparator.getOrderByFields().length * 3));
			}
			else {
				query = new StringBundler(6);
			}

			query.append(_SQL_SELECT_VLEGALDOCUMENT_WHERE);

			if (language == null) {
				query.append(_FINDER_COLUMN_DOCSBYL_T_F_S_LANGUAGE_1);
			}
			else {
				if (language.equals(StringPool.BLANK)) {
					query.append(_FINDER_COLUMN_DOCSBYL_T_F_S_LANGUAGE_3);
				}
				else {
					query.append(_FINDER_COLUMN_DOCSBYL_T_F_S_LANGUAGE_2);
				}
			}

			if (typeDocId == null) {
				query.append(_FINDER_COLUMN_DOCSBYL_T_F_S_TYPEDOCID_1);
			}
			else {
				if (typeDocId.equals(StringPool.BLANK)) {
					query.append(_FINDER_COLUMN_DOCSBYL_T_F_S_TYPEDOCID_3);
				}
				else {
					query.append(_FINDER_COLUMN_DOCSBYL_T_F_S_TYPEDOCID_2);
				}
			}

			if (fieldId == null) {
				query.append(_FINDER_COLUMN_DOCSBYL_T_F_S_FIELDID_1);
			}
			else {
				if (fieldId.equals(StringPool.BLANK)) {
					query.append(_FINDER_COLUMN_DOCSBYL_T_F_S_FIELDID_3);
				}
				else {
					query.append(_FINDER_COLUMN_DOCSBYL_T_F_S_FIELDID_2);
				}
			}

			query.append(_FINDER_COLUMN_DOCSBYL_T_F_S_STATUSDOC_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}

			else {
				query.append(VLegalDocumentModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (language != null) {
					qPos.add(language);
				}

				if (typeDocId != null) {
					qPos.add(typeDocId);
				}

				if (fieldId != null) {
					qPos.add(fieldId);
				}

				qPos.add(statusDoc);

				list = (List<VLegalDocument>)QueryUtil.list(q, getDialect(),
						start, end);
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (list == null) {
					FinderCacheUtil.removeResult(FINDER_PATH_FIND_BY_DOCSBYL_T_F_S,
						finderArgs);
				}
				else {
					cacheResult(list);

					FinderCacheUtil.putResult(FINDER_PATH_FIND_BY_DOCSBYL_T_F_S,
						finderArgs, list);
				}

				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Finds the first v legal document in the ordered set where language = &#63; and typeDocId = &#63; and fieldId = &#63; and statusDoc = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param language the language to search with
	 * @param typeDocId the type doc id to search with
	 * @param fieldId the field id to search with
	 * @param statusDoc the status doc to search with
	 * @param orderByComparator the comparator to order the set by
	 * @return the first matching v legal document
	 * @throws com.vportal.portlet.vlegal.NoSuchVLegalDocumentException if a matching v legal document could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public VLegalDocument findByDocsByL_T_F_S_First(String language,
		String typeDocId, String fieldId, int statusDoc,
		OrderByComparator orderByComparator)
		throws NoSuchVLegalDocumentException, SystemException {
		List<VLegalDocument> list = findByDocsByL_T_F_S(language, typeDocId,
				fieldId, statusDoc, 0, 1, orderByComparator);

		if (list.isEmpty()) {
			StringBundler msg = new StringBundler(10);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("language=");
			msg.append(language);

			msg.append(", typeDocId=");
			msg.append(typeDocId);

			msg.append(", fieldId=");
			msg.append(fieldId);

			msg.append(", statusDoc=");
			msg.append(statusDoc);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			throw new NoSuchVLegalDocumentException(msg.toString());
		}
		else {
			return list.get(0);
		}
	}

	/**
	 * Finds the last v legal document in the ordered set where language = &#63; and typeDocId = &#63; and fieldId = &#63; and statusDoc = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param language the language to search with
	 * @param typeDocId the type doc id to search with
	 * @param fieldId the field id to search with
	 * @param statusDoc the status doc to search with
	 * @param orderByComparator the comparator to order the set by
	 * @return the last matching v legal document
	 * @throws com.vportal.portlet.vlegal.NoSuchVLegalDocumentException if a matching v legal document could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public VLegalDocument findByDocsByL_T_F_S_Last(String language,
		String typeDocId, String fieldId, int statusDoc,
		OrderByComparator orderByComparator)
		throws NoSuchVLegalDocumentException, SystemException {
		int count = countByDocsByL_T_F_S(language, typeDocId, fieldId, statusDoc);

		List<VLegalDocument> list = findByDocsByL_T_F_S(language, typeDocId,
				fieldId, statusDoc, count - 1, count, orderByComparator);

		if (list.isEmpty()) {
			StringBundler msg = new StringBundler(10);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("language=");
			msg.append(language);

			msg.append(", typeDocId=");
			msg.append(typeDocId);

			msg.append(", fieldId=");
			msg.append(fieldId);

			msg.append(", statusDoc=");
			msg.append(statusDoc);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			throw new NoSuchVLegalDocumentException(msg.toString());
		}
		else {
			return list.get(0);
		}
	}

	/**
	 * Finds the v legal documents before and after the current v legal document in the ordered set where language = &#63; and typeDocId = &#63; and fieldId = &#63; and statusDoc = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param docId the primary key of the current v legal document
	 * @param language the language to search with
	 * @param typeDocId the type doc id to search with
	 * @param fieldId the field id to search with
	 * @param statusDoc the status doc to search with
	 * @param orderByComparator the comparator to order the set by
	 * @return the previous, current, and next v legal document
	 * @throws com.vportal.portlet.vlegal.NoSuchVLegalDocumentException if a v legal document with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public VLegalDocument[] findByDocsByL_T_F_S_PrevAndNext(String docId,
		String language, String typeDocId, String fieldId, int statusDoc,
		OrderByComparator orderByComparator)
		throws NoSuchVLegalDocumentException, SystemException {
		VLegalDocument vLegalDocument = findByPrimaryKey(docId);

		Session session = null;

		try {
			session = openSession();

			VLegalDocument[] array = new VLegalDocumentImpl[3];

			array[0] = getByDocsByL_T_F_S_PrevAndNext(session, vLegalDocument,
					language, typeDocId, fieldId, statusDoc, orderByComparator,
					true);

			array[1] = vLegalDocument;

			array[2] = getByDocsByL_T_F_S_PrevAndNext(session, vLegalDocument,
					language, typeDocId, fieldId, statusDoc, orderByComparator,
					false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected VLegalDocument getByDocsByL_T_F_S_PrevAndNext(Session session,
		VLegalDocument vLegalDocument, String language, String typeDocId,
		String fieldId, int statusDoc, OrderByComparator orderByComparator,
		boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_VLEGALDOCUMENT_WHERE);

		if (language == null) {
			query.append(_FINDER_COLUMN_DOCSBYL_T_F_S_LANGUAGE_1);
		}
		else {
			if (language.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_DOCSBYL_T_F_S_LANGUAGE_3);
			}
			else {
				query.append(_FINDER_COLUMN_DOCSBYL_T_F_S_LANGUAGE_2);
			}
		}

		if (typeDocId == null) {
			query.append(_FINDER_COLUMN_DOCSBYL_T_F_S_TYPEDOCID_1);
		}
		else {
			if (typeDocId.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_DOCSBYL_T_F_S_TYPEDOCID_3);
			}
			else {
				query.append(_FINDER_COLUMN_DOCSBYL_T_F_S_TYPEDOCID_2);
			}
		}

		if (fieldId == null) {
			query.append(_FINDER_COLUMN_DOCSBYL_T_F_S_FIELDID_1);
		}
		else {
			if (fieldId.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_DOCSBYL_T_F_S_FIELDID_3);
			}
			else {
				query.append(_FINDER_COLUMN_DOCSBYL_T_F_S_FIELDID_2);
			}
		}

		query.append(_FINDER_COLUMN_DOCSBYL_T_F_S_STATUSDOC_2);

		if (orderByComparator != null) {
			String[] orderByFields = orderByComparator.getOrderByFields();

			if (orderByFields.length > 0) {
				query.append(WHERE_AND);
			}

			for (int i = 0; i < orderByFields.length; i++) {
				query.append(_ORDER_BY_ENTITY_ALIAS);
				query.append(orderByFields[i]);

				if ((i + 1) < orderByFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(WHERE_GREATER_THAN_HAS_NEXT);
					}
					else {
						query.append(WHERE_LESSER_THAN_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(WHERE_GREATER_THAN);
					}
					else {
						query.append(WHERE_LESSER_THAN);
					}
				}
			}

			query.append(ORDER_BY_CLAUSE);

			for (int i = 0; i < orderByFields.length; i++) {
				query.append(_ORDER_BY_ENTITY_ALIAS);
				query.append(orderByFields[i]);

				if ((i + 1) < orderByFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(ORDER_BY_ASC_HAS_NEXT);
					}
					else {
						query.append(ORDER_BY_DESC_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(ORDER_BY_ASC);
					}
					else {
						query.append(ORDER_BY_DESC);
					}
				}
			}
		}

		else {
			query.append(VLegalDocumentModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		if (language != null) {
			qPos.add(language);
		}

		if (typeDocId != null) {
			qPos.add(typeDocId);
		}

		if (fieldId != null) {
			qPos.add(fieldId);
		}

		qPos.add(statusDoc);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByValues(vLegalDocument);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<VLegalDocument> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Finds all the v legal documents where typeDocId = &#63; and language = &#63;.
	 *
	 * @param typeDocId the type doc id to search with
	 * @param language the language to search with
	 * @return the matching v legal documents
	 * @throws SystemException if a system exception occurred
	 */
	public List<VLegalDocument> findByDocsByT_L(String typeDocId,
		String language) throws SystemException {
		return findByDocsByT_L(typeDocId, language, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Finds a range of all the v legal documents where typeDocId = &#63; and language = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param typeDocId the type doc id to search with
	 * @param language the language to search with
	 * @param start the lower bound of the range of v legal documents to return
	 * @param end the upper bound of the range of v legal documents to return (not inclusive)
	 * @return the range of matching v legal documents
	 * @throws SystemException if a system exception occurred
	 */
	public List<VLegalDocument> findByDocsByT_L(String typeDocId,
		String language, int start, int end) throws SystemException {
		return findByDocsByT_L(typeDocId, language, start, end, null);
	}

	/**
	 * Finds an ordered range of all the v legal documents where typeDocId = &#63; and language = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param typeDocId the type doc id to search with
	 * @param language the language to search with
	 * @param start the lower bound of the range of v legal documents to return
	 * @param end the upper bound of the range of v legal documents to return (not inclusive)
	 * @param orderByComparator the comparator to order the results by
	 * @return the ordered range of matching v legal documents
	 * @throws SystemException if a system exception occurred
	 */
	public List<VLegalDocument> findByDocsByT_L(String typeDocId,
		String language, int start, int end, OrderByComparator orderByComparator)
		throws SystemException {
		Object[] finderArgs = new Object[] {
				typeDocId, language,
				
				String.valueOf(start), String.valueOf(end),
				String.valueOf(orderByComparator)
			};

		List<VLegalDocument> list = (List<VLegalDocument>)FinderCacheUtil.getResult(FINDER_PATH_FIND_BY_DOCSBYT_L,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;

			if (orderByComparator != null) {
				query = new StringBundler(4 +
						(orderByComparator.getOrderByFields().length * 3));
			}
			else {
				query = new StringBundler(4);
			}

			query.append(_SQL_SELECT_VLEGALDOCUMENT_WHERE);

			if (typeDocId == null) {
				query.append(_FINDER_COLUMN_DOCSBYT_L_TYPEDOCID_1);
			}
			else {
				if (typeDocId.equals(StringPool.BLANK)) {
					query.append(_FINDER_COLUMN_DOCSBYT_L_TYPEDOCID_3);
				}
				else {
					query.append(_FINDER_COLUMN_DOCSBYT_L_TYPEDOCID_2);
				}
			}

			if (language == null) {
				query.append(_FINDER_COLUMN_DOCSBYT_L_LANGUAGE_1);
			}
			else {
				if (language.equals(StringPool.BLANK)) {
					query.append(_FINDER_COLUMN_DOCSBYT_L_LANGUAGE_3);
				}
				else {
					query.append(_FINDER_COLUMN_DOCSBYT_L_LANGUAGE_2);
				}
			}

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}

			else {
				query.append(VLegalDocumentModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (typeDocId != null) {
					qPos.add(typeDocId);
				}

				if (language != null) {
					qPos.add(language);
				}

				list = (List<VLegalDocument>)QueryUtil.list(q, getDialect(),
						start, end);
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (list == null) {
					FinderCacheUtil.removeResult(FINDER_PATH_FIND_BY_DOCSBYT_L,
						finderArgs);
				}
				else {
					cacheResult(list);

					FinderCacheUtil.putResult(FINDER_PATH_FIND_BY_DOCSBYT_L,
						finderArgs, list);
				}

				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Finds the first v legal document in the ordered set where typeDocId = &#63; and language = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param typeDocId the type doc id to search with
	 * @param language the language to search with
	 * @param orderByComparator the comparator to order the set by
	 * @return the first matching v legal document
	 * @throws com.vportal.portlet.vlegal.NoSuchVLegalDocumentException if a matching v legal document could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public VLegalDocument findByDocsByT_L_First(String typeDocId,
		String language, OrderByComparator orderByComparator)
		throws NoSuchVLegalDocumentException, SystemException {
		List<VLegalDocument> list = findByDocsByT_L(typeDocId, language, 0, 1,
				orderByComparator);

		if (list.isEmpty()) {
			StringBundler msg = new StringBundler(6);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("typeDocId=");
			msg.append(typeDocId);

			msg.append(", language=");
			msg.append(language);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			throw new NoSuchVLegalDocumentException(msg.toString());
		}
		else {
			return list.get(0);
		}
	}

	/**
	 * Finds the last v legal document in the ordered set where typeDocId = &#63; and language = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param typeDocId the type doc id to search with
	 * @param language the language to search with
	 * @param orderByComparator the comparator to order the set by
	 * @return the last matching v legal document
	 * @throws com.vportal.portlet.vlegal.NoSuchVLegalDocumentException if a matching v legal document could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public VLegalDocument findByDocsByT_L_Last(String typeDocId,
		String language, OrderByComparator orderByComparator)
		throws NoSuchVLegalDocumentException, SystemException {
		int count = countByDocsByT_L(typeDocId, language);

		List<VLegalDocument> list = findByDocsByT_L(typeDocId, language,
				count - 1, count, orderByComparator);

		if (list.isEmpty()) {
			StringBundler msg = new StringBundler(6);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("typeDocId=");
			msg.append(typeDocId);

			msg.append(", language=");
			msg.append(language);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			throw new NoSuchVLegalDocumentException(msg.toString());
		}
		else {
			return list.get(0);
		}
	}

	/**
	 * Finds the v legal documents before and after the current v legal document in the ordered set where typeDocId = &#63; and language = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param docId the primary key of the current v legal document
	 * @param typeDocId the type doc id to search with
	 * @param language the language to search with
	 * @param orderByComparator the comparator to order the set by
	 * @return the previous, current, and next v legal document
	 * @throws com.vportal.portlet.vlegal.NoSuchVLegalDocumentException if a v legal document with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public VLegalDocument[] findByDocsByT_L_PrevAndNext(String docId,
		String typeDocId, String language, OrderByComparator orderByComparator)
		throws NoSuchVLegalDocumentException, SystemException {
		VLegalDocument vLegalDocument = findByPrimaryKey(docId);

		Session session = null;

		try {
			session = openSession();

			VLegalDocument[] array = new VLegalDocumentImpl[3];

			array[0] = getByDocsByT_L_PrevAndNext(session, vLegalDocument,
					typeDocId, language, orderByComparator, true);

			array[1] = vLegalDocument;

			array[2] = getByDocsByT_L_PrevAndNext(session, vLegalDocument,
					typeDocId, language, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected VLegalDocument getByDocsByT_L_PrevAndNext(Session session,
		VLegalDocument vLegalDocument, String typeDocId, String language,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_VLEGALDOCUMENT_WHERE);

		if (typeDocId == null) {
			query.append(_FINDER_COLUMN_DOCSBYT_L_TYPEDOCID_1);
		}
		else {
			if (typeDocId.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_DOCSBYT_L_TYPEDOCID_3);
			}
			else {
				query.append(_FINDER_COLUMN_DOCSBYT_L_TYPEDOCID_2);
			}
		}

		if (language == null) {
			query.append(_FINDER_COLUMN_DOCSBYT_L_LANGUAGE_1);
		}
		else {
			if (language.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_DOCSBYT_L_LANGUAGE_3);
			}
			else {
				query.append(_FINDER_COLUMN_DOCSBYT_L_LANGUAGE_2);
			}
		}

		if (orderByComparator != null) {
			String[] orderByFields = orderByComparator.getOrderByFields();

			if (orderByFields.length > 0) {
				query.append(WHERE_AND);
			}

			for (int i = 0; i < orderByFields.length; i++) {
				query.append(_ORDER_BY_ENTITY_ALIAS);
				query.append(orderByFields[i]);

				if ((i + 1) < orderByFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(WHERE_GREATER_THAN_HAS_NEXT);
					}
					else {
						query.append(WHERE_LESSER_THAN_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(WHERE_GREATER_THAN);
					}
					else {
						query.append(WHERE_LESSER_THAN);
					}
				}
			}

			query.append(ORDER_BY_CLAUSE);

			for (int i = 0; i < orderByFields.length; i++) {
				query.append(_ORDER_BY_ENTITY_ALIAS);
				query.append(orderByFields[i]);

				if ((i + 1) < orderByFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(ORDER_BY_ASC_HAS_NEXT);
					}
					else {
						query.append(ORDER_BY_DESC_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(ORDER_BY_ASC);
					}
					else {
						query.append(ORDER_BY_DESC);
					}
				}
			}
		}

		else {
			query.append(VLegalDocumentModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		if (typeDocId != null) {
			qPos.add(typeDocId);
		}

		if (language != null) {
			qPos.add(language);
		}

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByValues(vLegalDocument);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<VLegalDocument> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Finds all the v legal documents where groupId = &#63; and language = &#63; and userId = &#63; and statusDoc = &#63;.
	 *
	 * @param groupId the group id to search with
	 * @param language the language to search with
	 * @param userId the user id to search with
	 * @param statusDoc the status doc to search with
	 * @return the matching v legal documents
	 * @throws SystemException if a system exception occurred
	 */
	public List<VLegalDocument> findByG_L_U_S(long groupId, String language,
		long userId, int statusDoc) throws SystemException {
		return findByG_L_U_S(groupId, language, userId, statusDoc,
			QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Finds a range of all the v legal documents where groupId = &#63; and language = &#63; and userId = &#63; and statusDoc = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param groupId the group id to search with
	 * @param language the language to search with
	 * @param userId the user id to search with
	 * @param statusDoc the status doc to search with
	 * @param start the lower bound of the range of v legal documents to return
	 * @param end the upper bound of the range of v legal documents to return (not inclusive)
	 * @return the range of matching v legal documents
	 * @throws SystemException if a system exception occurred
	 */
	public List<VLegalDocument> findByG_L_U_S(long groupId, String language,
		long userId, int statusDoc, int start, int end)
		throws SystemException {
		return findByG_L_U_S(groupId, language, userId, statusDoc, start, end,
			null);
	}

	/**
	 * Finds an ordered range of all the v legal documents where groupId = &#63; and language = &#63; and userId = &#63; and statusDoc = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param groupId the group id to search with
	 * @param language the language to search with
	 * @param userId the user id to search with
	 * @param statusDoc the status doc to search with
	 * @param start the lower bound of the range of v legal documents to return
	 * @param end the upper bound of the range of v legal documents to return (not inclusive)
	 * @param orderByComparator the comparator to order the results by
	 * @return the ordered range of matching v legal documents
	 * @throws SystemException if a system exception occurred
	 */
	public List<VLegalDocument> findByG_L_U_S(long groupId, String language,
		long userId, int statusDoc, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		Object[] finderArgs = new Object[] {
				groupId, language, userId, statusDoc,
				
				String.valueOf(start), String.valueOf(end),
				String.valueOf(orderByComparator)
			};

		List<VLegalDocument> list = (List<VLegalDocument>)FinderCacheUtil.getResult(FINDER_PATH_FIND_BY_G_L_U_S,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;

			if (orderByComparator != null) {
				query = new StringBundler(6 +
						(orderByComparator.getOrderByFields().length * 3));
			}
			else {
				query = new StringBundler(6);
			}

			query.append(_SQL_SELECT_VLEGALDOCUMENT_WHERE);

			query.append(_FINDER_COLUMN_G_L_U_S_GROUPID_2);

			if (language == null) {
				query.append(_FINDER_COLUMN_G_L_U_S_LANGUAGE_1);
			}
			else {
				if (language.equals(StringPool.BLANK)) {
					query.append(_FINDER_COLUMN_G_L_U_S_LANGUAGE_3);
				}
				else {
					query.append(_FINDER_COLUMN_G_L_U_S_LANGUAGE_2);
				}
			}

			query.append(_FINDER_COLUMN_G_L_U_S_USERID_2);

			query.append(_FINDER_COLUMN_G_L_U_S_STATUSDOC_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}

			else {
				query.append(VLegalDocumentModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(groupId);

				if (language != null) {
					qPos.add(language);
				}

				qPos.add(userId);

				qPos.add(statusDoc);

				list = (List<VLegalDocument>)QueryUtil.list(q, getDialect(),
						start, end);
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (list == null) {
					FinderCacheUtil.removeResult(FINDER_PATH_FIND_BY_G_L_U_S,
						finderArgs);
				}
				else {
					cacheResult(list);

					FinderCacheUtil.putResult(FINDER_PATH_FIND_BY_G_L_U_S,
						finderArgs, list);
				}

				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Finds the first v legal document in the ordered set where groupId = &#63; and language = &#63; and userId = &#63; and statusDoc = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param groupId the group id to search with
	 * @param language the language to search with
	 * @param userId the user id to search with
	 * @param statusDoc the status doc to search with
	 * @param orderByComparator the comparator to order the set by
	 * @return the first matching v legal document
	 * @throws com.vportal.portlet.vlegal.NoSuchVLegalDocumentException if a matching v legal document could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public VLegalDocument findByG_L_U_S_First(long groupId, String language,
		long userId, int statusDoc, OrderByComparator orderByComparator)
		throws NoSuchVLegalDocumentException, SystemException {
		List<VLegalDocument> list = findByG_L_U_S(groupId, language, userId,
				statusDoc, 0, 1, orderByComparator);

		if (list.isEmpty()) {
			StringBundler msg = new StringBundler(10);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("groupId=");
			msg.append(groupId);

			msg.append(", language=");
			msg.append(language);

			msg.append(", userId=");
			msg.append(userId);

			msg.append(", statusDoc=");
			msg.append(statusDoc);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			throw new NoSuchVLegalDocumentException(msg.toString());
		}
		else {
			return list.get(0);
		}
	}

	/**
	 * Finds the last v legal document in the ordered set where groupId = &#63; and language = &#63; and userId = &#63; and statusDoc = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param groupId the group id to search with
	 * @param language the language to search with
	 * @param userId the user id to search with
	 * @param statusDoc the status doc to search with
	 * @param orderByComparator the comparator to order the set by
	 * @return the last matching v legal document
	 * @throws com.vportal.portlet.vlegal.NoSuchVLegalDocumentException if a matching v legal document could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public VLegalDocument findByG_L_U_S_Last(long groupId, String language,
		long userId, int statusDoc, OrderByComparator orderByComparator)
		throws NoSuchVLegalDocumentException, SystemException {
		int count = countByG_L_U_S(groupId, language, userId, statusDoc);

		List<VLegalDocument> list = findByG_L_U_S(groupId, language, userId,
				statusDoc, count - 1, count, orderByComparator);

		if (list.isEmpty()) {
			StringBundler msg = new StringBundler(10);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("groupId=");
			msg.append(groupId);

			msg.append(", language=");
			msg.append(language);

			msg.append(", userId=");
			msg.append(userId);

			msg.append(", statusDoc=");
			msg.append(statusDoc);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			throw new NoSuchVLegalDocumentException(msg.toString());
		}
		else {
			return list.get(0);
		}
	}

	/**
	 * Finds the v legal documents before and after the current v legal document in the ordered set where groupId = &#63; and language = &#63; and userId = &#63; and statusDoc = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param docId the primary key of the current v legal document
	 * @param groupId the group id to search with
	 * @param language the language to search with
	 * @param userId the user id to search with
	 * @param statusDoc the status doc to search with
	 * @param orderByComparator the comparator to order the set by
	 * @return the previous, current, and next v legal document
	 * @throws com.vportal.portlet.vlegal.NoSuchVLegalDocumentException if a v legal document with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public VLegalDocument[] findByG_L_U_S_PrevAndNext(String docId,
		long groupId, String language, long userId, int statusDoc,
		OrderByComparator orderByComparator)
		throws NoSuchVLegalDocumentException, SystemException {
		VLegalDocument vLegalDocument = findByPrimaryKey(docId);

		Session session = null;

		try {
			session = openSession();

			VLegalDocument[] array = new VLegalDocumentImpl[3];

			array[0] = getByG_L_U_S_PrevAndNext(session, vLegalDocument,
					groupId, language, userId, statusDoc, orderByComparator,
					true);

			array[1] = vLegalDocument;

			array[2] = getByG_L_U_S_PrevAndNext(session, vLegalDocument,
					groupId, language, userId, statusDoc, orderByComparator,
					false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected VLegalDocument getByG_L_U_S_PrevAndNext(Session session,
		VLegalDocument vLegalDocument, long groupId, String language,
		long userId, int statusDoc, OrderByComparator orderByComparator,
		boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_VLEGALDOCUMENT_WHERE);

		query.append(_FINDER_COLUMN_G_L_U_S_GROUPID_2);

		if (language == null) {
			query.append(_FINDER_COLUMN_G_L_U_S_LANGUAGE_1);
		}
		else {
			if (language.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_G_L_U_S_LANGUAGE_3);
			}
			else {
				query.append(_FINDER_COLUMN_G_L_U_S_LANGUAGE_2);
			}
		}

		query.append(_FINDER_COLUMN_G_L_U_S_USERID_2);

		query.append(_FINDER_COLUMN_G_L_U_S_STATUSDOC_2);

		if (orderByComparator != null) {
			String[] orderByFields = orderByComparator.getOrderByFields();

			if (orderByFields.length > 0) {
				query.append(WHERE_AND);
			}

			for (int i = 0; i < orderByFields.length; i++) {
				query.append(_ORDER_BY_ENTITY_ALIAS);
				query.append(orderByFields[i]);

				if ((i + 1) < orderByFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(WHERE_GREATER_THAN_HAS_NEXT);
					}
					else {
						query.append(WHERE_LESSER_THAN_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(WHERE_GREATER_THAN);
					}
					else {
						query.append(WHERE_LESSER_THAN);
					}
				}
			}

			query.append(ORDER_BY_CLAUSE);

			for (int i = 0; i < orderByFields.length; i++) {
				query.append(_ORDER_BY_ENTITY_ALIAS);
				query.append(orderByFields[i]);

				if ((i + 1) < orderByFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(ORDER_BY_ASC_HAS_NEXT);
					}
					else {
						query.append(ORDER_BY_DESC_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(ORDER_BY_ASC);
					}
					else {
						query.append(ORDER_BY_DESC);
					}
				}
			}
		}

		else {
			query.append(VLegalDocumentModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(groupId);

		if (language != null) {
			qPos.add(language);
		}

		qPos.add(userId);

		qPos.add(statusDoc);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByValues(vLegalDocument);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<VLegalDocument> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Finds the v legal document where groupId = &#63; and docId = &#63; or throws a {@link com.vportal.portlet.vlegal.NoSuchVLegalDocumentException} if it could not be found.
	 *
	 * @param groupId the group id to search with
	 * @param docId the doc id to search with
	 * @return the matching v legal document
	 * @throws com.vportal.portlet.vlegal.NoSuchVLegalDocumentException if a matching v legal document could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public VLegalDocument findByG_D(long groupId, String docId)
		throws NoSuchVLegalDocumentException, SystemException {
		VLegalDocument vLegalDocument = fetchByG_D(groupId, docId);

		if (vLegalDocument == null) {
			StringBundler msg = new StringBundler(6);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("groupId=");
			msg.append(groupId);

			msg.append(", docId=");
			msg.append(docId);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			if (_log.isWarnEnabled()) {
				_log.warn(msg.toString());
			}

			throw new NoSuchVLegalDocumentException(msg.toString());
		}

		return vLegalDocument;
	}

	/**
	 * Finds the v legal document where groupId = &#63; and docId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param groupId the group id to search with
	 * @param docId the doc id to search with
	 * @return the matching v legal document, or <code>null</code> if a matching v legal document could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public VLegalDocument fetchByG_D(long groupId, String docId)
		throws SystemException {
		return fetchByG_D(groupId, docId, true);
	}

	/**
	 * Finds the v legal document where groupId = &#63; and docId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param groupId the group id to search with
	 * @param docId the doc id to search with
	 * @return the matching v legal document, or <code>null</code> if a matching v legal document could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public VLegalDocument fetchByG_D(long groupId, String docId,
		boolean retrieveFromCache) throws SystemException {
		Object[] finderArgs = new Object[] { groupId, docId };

		Object result = null;

		if (retrieveFromCache) {
			result = FinderCacheUtil.getResult(FINDER_PATH_FETCH_BY_G_D,
					finderArgs, this);
		}

		if (result == null) {
			StringBundler query = new StringBundler(4);

			query.append(_SQL_SELECT_VLEGALDOCUMENT_WHERE);

			query.append(_FINDER_COLUMN_G_D_GROUPID_2);

			if (docId == null) {
				query.append(_FINDER_COLUMN_G_D_DOCID_1);
			}
			else {
				if (docId.equals(StringPool.BLANK)) {
					query.append(_FINDER_COLUMN_G_D_DOCID_3);
				}
				else {
					query.append(_FINDER_COLUMN_G_D_DOCID_2);
				}
			}

			query.append(VLegalDocumentModelImpl.ORDER_BY_JPQL);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(groupId);

				if (docId != null) {
					qPos.add(docId);
				}

				List<VLegalDocument> list = q.list();

				result = list;

				VLegalDocument vLegalDocument = null;

				if (list.isEmpty()) {
					FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_G_D,
						finderArgs, list);
				}
				else {
					vLegalDocument = list.get(0);

					cacheResult(vLegalDocument);

					if ((vLegalDocument.getGroupId() != groupId) ||
							(vLegalDocument.getDocId() == null) ||
							!vLegalDocument.getDocId().equals(docId)) {
						FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_G_D,
							finderArgs, vLegalDocument);
					}
				}

				return vLegalDocument;
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (result == null) {
					FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_G_D,
						finderArgs);
				}

				closeSession(session);
			}
		}
		else {
			if (result instanceof List<?>) {
				return null;
			}
			else {
				return (VLegalDocument)result;
			}
		}
	}

	/**
	 * Finds the v legal document where groupId = &#63; and num = &#63; and symbol = &#63; or throws a {@link com.vportal.portlet.vlegal.NoSuchVLegalDocumentException} if it could not be found.
	 *
	 * @param groupId the group id to search with
	 * @param num the num to search with
	 * @param symbol the symbol to search with
	 * @return the matching v legal document
	 * @throws com.vportal.portlet.vlegal.NoSuchVLegalDocumentException if a matching v legal document could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public VLegalDocument findByP_N_S(long groupId, String num, String symbol)
		throws NoSuchVLegalDocumentException, SystemException {
		VLegalDocument vLegalDocument = fetchByP_N_S(groupId, num, symbol);

		if (vLegalDocument == null) {
			StringBundler msg = new StringBundler(8);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("groupId=");
			msg.append(groupId);

			msg.append(", num=");
			msg.append(num);

			msg.append(", symbol=");
			msg.append(symbol);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			if (_log.isWarnEnabled()) {
				_log.warn(msg.toString());
			}

			throw new NoSuchVLegalDocumentException(msg.toString());
		}

		return vLegalDocument;
	}

	/**
	 * Finds the v legal document where groupId = &#63; and num = &#63; and symbol = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param groupId the group id to search with
	 * @param num the num to search with
	 * @param symbol the symbol to search with
	 * @return the matching v legal document, or <code>null</code> if a matching v legal document could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public VLegalDocument fetchByP_N_S(long groupId, String num, String symbol)
		throws SystemException {
		return fetchByP_N_S(groupId, num, symbol, true);
	}

	/**
	 * Finds the v legal document where groupId = &#63; and num = &#63; and symbol = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param groupId the group id to search with
	 * @param num the num to search with
	 * @param symbol the symbol to search with
	 * @return the matching v legal document, or <code>null</code> if a matching v legal document could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public VLegalDocument fetchByP_N_S(long groupId, String num, String symbol,
		boolean retrieveFromCache) throws SystemException {
		Object[] finderArgs = new Object[] { groupId, num, symbol };

		Object result = null;

		if (retrieveFromCache) {
			result = FinderCacheUtil.getResult(FINDER_PATH_FETCH_BY_P_N_S,
					finderArgs, this);
		}

		if (result == null) {
			StringBundler query = new StringBundler(5);

			query.append(_SQL_SELECT_VLEGALDOCUMENT_WHERE);

			query.append(_FINDER_COLUMN_P_N_S_GROUPID_2);

			if (num == null) {
				query.append(_FINDER_COLUMN_P_N_S_NUM_1);
			}
			else {
				if (num.equals(StringPool.BLANK)) {
					query.append(_FINDER_COLUMN_P_N_S_NUM_3);
				}
				else {
					query.append(_FINDER_COLUMN_P_N_S_NUM_2);
				}
			}

			if (symbol == null) {
				query.append(_FINDER_COLUMN_P_N_S_SYMBOL_1);
			}
			else {
				if (symbol.equals(StringPool.BLANK)) {
					query.append(_FINDER_COLUMN_P_N_S_SYMBOL_3);
				}
				else {
					query.append(_FINDER_COLUMN_P_N_S_SYMBOL_2);
				}
			}

			query.append(VLegalDocumentModelImpl.ORDER_BY_JPQL);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(groupId);

				if (num != null) {
					qPos.add(num);
				}

				if (symbol != null) {
					qPos.add(symbol);
				}

				List<VLegalDocument> list = q.list();

				result = list;

				VLegalDocument vLegalDocument = null;

				if (list.isEmpty()) {
					FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_P_N_S,
						finderArgs, list);
				}
				else {
					vLegalDocument = list.get(0);

					cacheResult(vLegalDocument);

					if ((vLegalDocument.getGroupId() != groupId) ||
							(vLegalDocument.getNum() == null) ||
							!vLegalDocument.getNum().equals(num) ||
							(vLegalDocument.getSymbol() == null) ||
							!vLegalDocument.getSymbol().equals(symbol)) {
						FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_P_N_S,
							finderArgs, vLegalDocument);
					}
				}

				return vLegalDocument;
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (result == null) {
					FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_P_N_S,
						finderArgs);
				}

				closeSession(session);
			}
		}
		else {
			if (result instanceof List<?>) {
				return null;
			}
			else {
				return (VLegalDocument)result;
			}
		}
	}

	/**
	 * Finds all the v legal documents where groupId = &#63; and language = &#63; and statusDoc = &#63;.
	 *
	 * @param groupId the group id to search with
	 * @param language the language to search with
	 * @param statusDoc the status doc to search with
	 * @return the matching v legal documents
	 * @throws SystemException if a system exception occurred
	 */
	public List<VLegalDocument> findByP_L_S(long groupId, String language,
		int statusDoc) throws SystemException {
		return findByP_L_S(groupId, language, statusDoc, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Finds a range of all the v legal documents where groupId = &#63; and language = &#63; and statusDoc = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param groupId the group id to search with
	 * @param language the language to search with
	 * @param statusDoc the status doc to search with
	 * @param start the lower bound of the range of v legal documents to return
	 * @param end the upper bound of the range of v legal documents to return (not inclusive)
	 * @return the range of matching v legal documents
	 * @throws SystemException if a system exception occurred
	 */
	public List<VLegalDocument> findByP_L_S(long groupId, String language,
		int statusDoc, int start, int end) throws SystemException {
		return findByP_L_S(groupId, language, statusDoc, start, end, null);
	}

	/**
	 * Finds an ordered range of all the v legal documents where groupId = &#63; and language = &#63; and statusDoc = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param groupId the group id to search with
	 * @param language the language to search with
	 * @param statusDoc the status doc to search with
	 * @param start the lower bound of the range of v legal documents to return
	 * @param end the upper bound of the range of v legal documents to return (not inclusive)
	 * @param orderByComparator the comparator to order the results by
	 * @return the ordered range of matching v legal documents
	 * @throws SystemException if a system exception occurred
	 */
	public List<VLegalDocument> findByP_L_S(long groupId, String language,
		int statusDoc, int start, int end, OrderByComparator orderByComparator)
		throws SystemException {
		Object[] finderArgs = new Object[] {
				groupId, language, statusDoc,
				
				String.valueOf(start), String.valueOf(end),
				String.valueOf(orderByComparator)
			};

		List<VLegalDocument> list = (List<VLegalDocument>)FinderCacheUtil.getResult(FINDER_PATH_FIND_BY_P_L_S,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;

			if (orderByComparator != null) {
				query = new StringBundler(5 +
						(orderByComparator.getOrderByFields().length * 3));
			}
			else {
				query = new StringBundler(5);
			}

			query.append(_SQL_SELECT_VLEGALDOCUMENT_WHERE);

			query.append(_FINDER_COLUMN_P_L_S_GROUPID_2);

			if (language == null) {
				query.append(_FINDER_COLUMN_P_L_S_LANGUAGE_1);
			}
			else {
				if (language.equals(StringPool.BLANK)) {
					query.append(_FINDER_COLUMN_P_L_S_LANGUAGE_3);
				}
				else {
					query.append(_FINDER_COLUMN_P_L_S_LANGUAGE_2);
				}
			}

			query.append(_FINDER_COLUMN_P_L_S_STATUSDOC_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}

			else {
				query.append(VLegalDocumentModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(groupId);

				if (language != null) {
					qPos.add(language);
				}

				qPos.add(statusDoc);

				list = (List<VLegalDocument>)QueryUtil.list(q, getDialect(),
						start, end);
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (list == null) {
					FinderCacheUtil.removeResult(FINDER_PATH_FIND_BY_P_L_S,
						finderArgs);
				}
				else {
					cacheResult(list);

					FinderCacheUtil.putResult(FINDER_PATH_FIND_BY_P_L_S,
						finderArgs, list);
				}

				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Finds the first v legal document in the ordered set where groupId = &#63; and language = &#63; and statusDoc = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param groupId the group id to search with
	 * @param language the language to search with
	 * @param statusDoc the status doc to search with
	 * @param orderByComparator the comparator to order the set by
	 * @return the first matching v legal document
	 * @throws com.vportal.portlet.vlegal.NoSuchVLegalDocumentException if a matching v legal document could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public VLegalDocument findByP_L_S_First(long groupId, String language,
		int statusDoc, OrderByComparator orderByComparator)
		throws NoSuchVLegalDocumentException, SystemException {
		List<VLegalDocument> list = findByP_L_S(groupId, language, statusDoc,
				0, 1, orderByComparator);

		if (list.isEmpty()) {
			StringBundler msg = new StringBundler(8);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("groupId=");
			msg.append(groupId);

			msg.append(", language=");
			msg.append(language);

			msg.append(", statusDoc=");
			msg.append(statusDoc);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			throw new NoSuchVLegalDocumentException(msg.toString());
		}
		else {
			return list.get(0);
		}
	}

	/**
	 * Finds the last v legal document in the ordered set where groupId = &#63; and language = &#63; and statusDoc = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param groupId the group id to search with
	 * @param language the language to search with
	 * @param statusDoc the status doc to search with
	 * @param orderByComparator the comparator to order the set by
	 * @return the last matching v legal document
	 * @throws com.vportal.portlet.vlegal.NoSuchVLegalDocumentException if a matching v legal document could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public VLegalDocument findByP_L_S_Last(long groupId, String language,
		int statusDoc, OrderByComparator orderByComparator)
		throws NoSuchVLegalDocumentException, SystemException {
		int count = countByP_L_S(groupId, language, statusDoc);

		List<VLegalDocument> list = findByP_L_S(groupId, language, statusDoc,
				count - 1, count, orderByComparator);

		if (list.isEmpty()) {
			StringBundler msg = new StringBundler(8);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("groupId=");
			msg.append(groupId);

			msg.append(", language=");
			msg.append(language);

			msg.append(", statusDoc=");
			msg.append(statusDoc);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			throw new NoSuchVLegalDocumentException(msg.toString());
		}
		else {
			return list.get(0);
		}
	}

	/**
	 * Finds the v legal documents before and after the current v legal document in the ordered set where groupId = &#63; and language = &#63; and statusDoc = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param docId the primary key of the current v legal document
	 * @param groupId the group id to search with
	 * @param language the language to search with
	 * @param statusDoc the status doc to search with
	 * @param orderByComparator the comparator to order the set by
	 * @return the previous, current, and next v legal document
	 * @throws com.vportal.portlet.vlegal.NoSuchVLegalDocumentException if a v legal document with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public VLegalDocument[] findByP_L_S_PrevAndNext(String docId, long groupId,
		String language, int statusDoc, OrderByComparator orderByComparator)
		throws NoSuchVLegalDocumentException, SystemException {
		VLegalDocument vLegalDocument = findByPrimaryKey(docId);

		Session session = null;

		try {
			session = openSession();

			VLegalDocument[] array = new VLegalDocumentImpl[3];

			array[0] = getByP_L_S_PrevAndNext(session, vLegalDocument, groupId,
					language, statusDoc, orderByComparator, true);

			array[1] = vLegalDocument;

			array[2] = getByP_L_S_PrevAndNext(session, vLegalDocument, groupId,
					language, statusDoc, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected VLegalDocument getByP_L_S_PrevAndNext(Session session,
		VLegalDocument vLegalDocument, long groupId, String language,
		int statusDoc, OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_VLEGALDOCUMENT_WHERE);

		query.append(_FINDER_COLUMN_P_L_S_GROUPID_2);

		if (language == null) {
			query.append(_FINDER_COLUMN_P_L_S_LANGUAGE_1);
		}
		else {
			if (language.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_P_L_S_LANGUAGE_3);
			}
			else {
				query.append(_FINDER_COLUMN_P_L_S_LANGUAGE_2);
			}
		}

		query.append(_FINDER_COLUMN_P_L_S_STATUSDOC_2);

		if (orderByComparator != null) {
			String[] orderByFields = orderByComparator.getOrderByFields();

			if (orderByFields.length > 0) {
				query.append(WHERE_AND);
			}

			for (int i = 0; i < orderByFields.length; i++) {
				query.append(_ORDER_BY_ENTITY_ALIAS);
				query.append(orderByFields[i]);

				if ((i + 1) < orderByFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(WHERE_GREATER_THAN_HAS_NEXT);
					}
					else {
						query.append(WHERE_LESSER_THAN_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(WHERE_GREATER_THAN);
					}
					else {
						query.append(WHERE_LESSER_THAN);
					}
				}
			}

			query.append(ORDER_BY_CLAUSE);

			for (int i = 0; i < orderByFields.length; i++) {
				query.append(_ORDER_BY_ENTITY_ALIAS);
				query.append(orderByFields[i]);

				if ((i + 1) < orderByFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(ORDER_BY_ASC_HAS_NEXT);
					}
					else {
						query.append(ORDER_BY_DESC_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(ORDER_BY_ASC);
					}
					else {
						query.append(ORDER_BY_DESC);
					}
				}
			}
		}

		else {
			query.append(VLegalDocumentModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(groupId);

		if (language != null) {
			qPos.add(language);
		}

		qPos.add(statusDoc);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByValues(vLegalDocument);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<VLegalDocument> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Finds all the v legal documents where statusDoc = &#63;.
	 *
	 * @param statusDoc the status doc to search with
	 * @return the matching v legal documents
	 * @throws SystemException if a system exception occurred
	 */
	public List<VLegalDocument> findBystatusDoc(int statusDoc)
		throws SystemException {
		return findBystatusDoc(statusDoc, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
			null);
	}

	/**
	 * Finds a range of all the v legal documents where statusDoc = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param statusDoc the status doc to search with
	 * @param start the lower bound of the range of v legal documents to return
	 * @param end the upper bound of the range of v legal documents to return (not inclusive)
	 * @return the range of matching v legal documents
	 * @throws SystemException if a system exception occurred
	 */
	public List<VLegalDocument> findBystatusDoc(int statusDoc, int start,
		int end) throws SystemException {
		return findBystatusDoc(statusDoc, start, end, null);
	}

	/**
	 * Finds an ordered range of all the v legal documents where statusDoc = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param statusDoc the status doc to search with
	 * @param start the lower bound of the range of v legal documents to return
	 * @param end the upper bound of the range of v legal documents to return (not inclusive)
	 * @param orderByComparator the comparator to order the results by
	 * @return the ordered range of matching v legal documents
	 * @throws SystemException if a system exception occurred
	 */
	public List<VLegalDocument> findBystatusDoc(int statusDoc, int start,
		int end, OrderByComparator orderByComparator) throws SystemException {
		Object[] finderArgs = new Object[] {
				statusDoc,
				
				String.valueOf(start), String.valueOf(end),
				String.valueOf(orderByComparator)
			};

		List<VLegalDocument> list = (List<VLegalDocument>)FinderCacheUtil.getResult(FINDER_PATH_FIND_BY_STATUSDOC,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;

			if (orderByComparator != null) {
				query = new StringBundler(3 +
						(orderByComparator.getOrderByFields().length * 3));
			}
			else {
				query = new StringBundler(3);
			}

			query.append(_SQL_SELECT_VLEGALDOCUMENT_WHERE);

			query.append(_FINDER_COLUMN_STATUSDOC_STATUSDOC_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}

			else {
				query.append(VLegalDocumentModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(statusDoc);

				list = (List<VLegalDocument>)QueryUtil.list(q, getDialect(),
						start, end);
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (list == null) {
					FinderCacheUtil.removeResult(FINDER_PATH_FIND_BY_STATUSDOC,
						finderArgs);
				}
				else {
					cacheResult(list);

					FinderCacheUtil.putResult(FINDER_PATH_FIND_BY_STATUSDOC,
						finderArgs, list);
				}

				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Finds the first v legal document in the ordered set where statusDoc = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param statusDoc the status doc to search with
	 * @param orderByComparator the comparator to order the set by
	 * @return the first matching v legal document
	 * @throws com.vportal.portlet.vlegal.NoSuchVLegalDocumentException if a matching v legal document could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public VLegalDocument findBystatusDoc_First(int statusDoc,
		OrderByComparator orderByComparator)
		throws NoSuchVLegalDocumentException, SystemException {
		List<VLegalDocument> list = findBystatusDoc(statusDoc, 0, 1,
				orderByComparator);

		if (list.isEmpty()) {
			StringBundler msg = new StringBundler(4);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("statusDoc=");
			msg.append(statusDoc);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			throw new NoSuchVLegalDocumentException(msg.toString());
		}
		else {
			return list.get(0);
		}
	}

	/**
	 * Finds the last v legal document in the ordered set where statusDoc = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param statusDoc the status doc to search with
	 * @param orderByComparator the comparator to order the set by
	 * @return the last matching v legal document
	 * @throws com.vportal.portlet.vlegal.NoSuchVLegalDocumentException if a matching v legal document could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public VLegalDocument findBystatusDoc_Last(int statusDoc,
		OrderByComparator orderByComparator)
		throws NoSuchVLegalDocumentException, SystemException {
		int count = countBystatusDoc(statusDoc);

		List<VLegalDocument> list = findBystatusDoc(statusDoc, count - 1,
				count, orderByComparator);

		if (list.isEmpty()) {
			StringBundler msg = new StringBundler(4);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("statusDoc=");
			msg.append(statusDoc);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			throw new NoSuchVLegalDocumentException(msg.toString());
		}
		else {
			return list.get(0);
		}
	}

	/**
	 * Finds the v legal documents before and after the current v legal document in the ordered set where statusDoc = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param docId the primary key of the current v legal document
	 * @param statusDoc the status doc to search with
	 * @param orderByComparator the comparator to order the set by
	 * @return the previous, current, and next v legal document
	 * @throws com.vportal.portlet.vlegal.NoSuchVLegalDocumentException if a v legal document with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public VLegalDocument[] findBystatusDoc_PrevAndNext(String docId,
		int statusDoc, OrderByComparator orderByComparator)
		throws NoSuchVLegalDocumentException, SystemException {
		VLegalDocument vLegalDocument = findByPrimaryKey(docId);

		Session session = null;

		try {
			session = openSession();

			VLegalDocument[] array = new VLegalDocumentImpl[3];

			array[0] = getBystatusDoc_PrevAndNext(session, vLegalDocument,
					statusDoc, orderByComparator, true);

			array[1] = vLegalDocument;

			array[2] = getBystatusDoc_PrevAndNext(session, vLegalDocument,
					statusDoc, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected VLegalDocument getBystatusDoc_PrevAndNext(Session session,
		VLegalDocument vLegalDocument, int statusDoc,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_VLEGALDOCUMENT_WHERE);

		query.append(_FINDER_COLUMN_STATUSDOC_STATUSDOC_2);

		if (orderByComparator != null) {
			String[] orderByFields = orderByComparator.getOrderByFields();

			if (orderByFields.length > 0) {
				query.append(WHERE_AND);
			}

			for (int i = 0; i < orderByFields.length; i++) {
				query.append(_ORDER_BY_ENTITY_ALIAS);
				query.append(orderByFields[i]);

				if ((i + 1) < orderByFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(WHERE_GREATER_THAN_HAS_NEXT);
					}
					else {
						query.append(WHERE_LESSER_THAN_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(WHERE_GREATER_THAN);
					}
					else {
						query.append(WHERE_LESSER_THAN);
					}
				}
			}

			query.append(ORDER_BY_CLAUSE);

			for (int i = 0; i < orderByFields.length; i++) {
				query.append(_ORDER_BY_ENTITY_ALIAS);
				query.append(orderByFields[i]);

				if ((i + 1) < orderByFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(ORDER_BY_ASC_HAS_NEXT);
					}
					else {
						query.append(ORDER_BY_DESC_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(ORDER_BY_ASC);
					}
					else {
						query.append(ORDER_BY_DESC);
					}
				}
			}
		}

		else {
			query.append(VLegalDocumentModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(statusDoc);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByValues(vLegalDocument);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<VLegalDocument> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Finds all the v legal documents where groupId = &#63; and language = &#63; and orgId = &#63; and statusDoc = &#63;.
	 *
	 * @param groupId the group id to search with
	 * @param language the language to search with
	 * @param orgId the org id to search with
	 * @param statusDoc the status doc to search with
	 * @return the matching v legal documents
	 * @throws SystemException if a system exception occurred
	 */
	public List<VLegalDocument> findByG_L_O_S(long groupId, String language,
		String orgId, int statusDoc) throws SystemException {
		return findByG_L_O_S(groupId, language, orgId, statusDoc,
			QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Finds a range of all the v legal documents where groupId = &#63; and language = &#63; and orgId = &#63; and statusDoc = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param groupId the group id to search with
	 * @param language the language to search with
	 * @param orgId the org id to search with
	 * @param statusDoc the status doc to search with
	 * @param start the lower bound of the range of v legal documents to return
	 * @param end the upper bound of the range of v legal documents to return (not inclusive)
	 * @return the range of matching v legal documents
	 * @throws SystemException if a system exception occurred
	 */
	public List<VLegalDocument> findByG_L_O_S(long groupId, String language,
		String orgId, int statusDoc, int start, int end)
		throws SystemException {
		return findByG_L_O_S(groupId, language, orgId, statusDoc, start, end,
			null);
	}

	/**
	 * Finds an ordered range of all the v legal documents where groupId = &#63; and language = &#63; and orgId = &#63; and statusDoc = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param groupId the group id to search with
	 * @param language the language to search with
	 * @param orgId the org id to search with
	 * @param statusDoc the status doc to search with
	 * @param start the lower bound of the range of v legal documents to return
	 * @param end the upper bound of the range of v legal documents to return (not inclusive)
	 * @param orderByComparator the comparator to order the results by
	 * @return the ordered range of matching v legal documents
	 * @throws SystemException if a system exception occurred
	 */
	public List<VLegalDocument> findByG_L_O_S(long groupId, String language,
		String orgId, int statusDoc, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		Object[] finderArgs = new Object[] {
				groupId, language, orgId, statusDoc,
				
				String.valueOf(start), String.valueOf(end),
				String.valueOf(orderByComparator)
			};

		List<VLegalDocument> list = (List<VLegalDocument>)FinderCacheUtil.getResult(FINDER_PATH_FIND_BY_G_L_O_S,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;

			if (orderByComparator != null) {
				query = new StringBundler(6 +
						(orderByComparator.getOrderByFields().length * 3));
			}
			else {
				query = new StringBundler(6);
			}

			query.append(_SQL_SELECT_VLEGALDOCUMENT_WHERE);

			query.append(_FINDER_COLUMN_G_L_O_S_GROUPID_2);

			if (language == null) {
				query.append(_FINDER_COLUMN_G_L_O_S_LANGUAGE_1);
			}
			else {
				if (language.equals(StringPool.BLANK)) {
					query.append(_FINDER_COLUMN_G_L_O_S_LANGUAGE_3);
				}
				else {
					query.append(_FINDER_COLUMN_G_L_O_S_LANGUAGE_2);
				}
			}

			if (orgId == null) {
				query.append(_FINDER_COLUMN_G_L_O_S_ORGID_1);
			}
			else {
				if (orgId.equals(StringPool.BLANK)) {
					query.append(_FINDER_COLUMN_G_L_O_S_ORGID_3);
				}
				else {
					query.append(_FINDER_COLUMN_G_L_O_S_ORGID_2);
				}
			}

			query.append(_FINDER_COLUMN_G_L_O_S_STATUSDOC_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}

			else {
				query.append(VLegalDocumentModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(groupId);

				if (language != null) {
					qPos.add(language);
				}

				if (orgId != null) {
					qPos.add(orgId);
				}

				qPos.add(statusDoc);

				list = (List<VLegalDocument>)QueryUtil.list(q, getDialect(),
						start, end);
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (list == null) {
					FinderCacheUtil.removeResult(FINDER_PATH_FIND_BY_G_L_O_S,
						finderArgs);
				}
				else {
					cacheResult(list);

					FinderCacheUtil.putResult(FINDER_PATH_FIND_BY_G_L_O_S,
						finderArgs, list);
				}

				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Finds the first v legal document in the ordered set where groupId = &#63; and language = &#63; and orgId = &#63; and statusDoc = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param groupId the group id to search with
	 * @param language the language to search with
	 * @param orgId the org id to search with
	 * @param statusDoc the status doc to search with
	 * @param orderByComparator the comparator to order the set by
	 * @return the first matching v legal document
	 * @throws com.vportal.portlet.vlegal.NoSuchVLegalDocumentException if a matching v legal document could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public VLegalDocument findByG_L_O_S_First(long groupId, String language,
		String orgId, int statusDoc, OrderByComparator orderByComparator)
		throws NoSuchVLegalDocumentException, SystemException {
		List<VLegalDocument> list = findByG_L_O_S(groupId, language, orgId,
				statusDoc, 0, 1, orderByComparator);

		if (list.isEmpty()) {
			StringBundler msg = new StringBundler(10);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("groupId=");
			msg.append(groupId);

			msg.append(", language=");
			msg.append(language);

			msg.append(", orgId=");
			msg.append(orgId);

			msg.append(", statusDoc=");
			msg.append(statusDoc);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			throw new NoSuchVLegalDocumentException(msg.toString());
		}
		else {
			return list.get(0);
		}
	}

	/**
	 * Finds the last v legal document in the ordered set where groupId = &#63; and language = &#63; and orgId = &#63; and statusDoc = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param groupId the group id to search with
	 * @param language the language to search with
	 * @param orgId the org id to search with
	 * @param statusDoc the status doc to search with
	 * @param orderByComparator the comparator to order the set by
	 * @return the last matching v legal document
	 * @throws com.vportal.portlet.vlegal.NoSuchVLegalDocumentException if a matching v legal document could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public VLegalDocument findByG_L_O_S_Last(long groupId, String language,
		String orgId, int statusDoc, OrderByComparator orderByComparator)
		throws NoSuchVLegalDocumentException, SystemException {
		int count = countByG_L_O_S(groupId, language, orgId, statusDoc);

		List<VLegalDocument> list = findByG_L_O_S(groupId, language, orgId,
				statusDoc, count - 1, count, orderByComparator);

		if (list.isEmpty()) {
			StringBundler msg = new StringBundler(10);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("groupId=");
			msg.append(groupId);

			msg.append(", language=");
			msg.append(language);

			msg.append(", orgId=");
			msg.append(orgId);

			msg.append(", statusDoc=");
			msg.append(statusDoc);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			throw new NoSuchVLegalDocumentException(msg.toString());
		}
		else {
			return list.get(0);
		}
	}

	/**
	 * Finds the v legal documents before and after the current v legal document in the ordered set where groupId = &#63; and language = &#63; and orgId = &#63; and statusDoc = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param docId the primary key of the current v legal document
	 * @param groupId the group id to search with
	 * @param language the language to search with
	 * @param orgId the org id to search with
	 * @param statusDoc the status doc to search with
	 * @param orderByComparator the comparator to order the set by
	 * @return the previous, current, and next v legal document
	 * @throws com.vportal.portlet.vlegal.NoSuchVLegalDocumentException if a v legal document with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public VLegalDocument[] findByG_L_O_S_PrevAndNext(String docId,
		long groupId, String language, String orgId, int statusDoc,
		OrderByComparator orderByComparator)
		throws NoSuchVLegalDocumentException, SystemException {
		VLegalDocument vLegalDocument = findByPrimaryKey(docId);

		Session session = null;

		try {
			session = openSession();

			VLegalDocument[] array = new VLegalDocumentImpl[3];

			array[0] = getByG_L_O_S_PrevAndNext(session, vLegalDocument,
					groupId, language, orgId, statusDoc, orderByComparator, true);

			array[1] = vLegalDocument;

			array[2] = getByG_L_O_S_PrevAndNext(session, vLegalDocument,
					groupId, language, orgId, statusDoc, orderByComparator,
					false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected VLegalDocument getByG_L_O_S_PrevAndNext(Session session,
		VLegalDocument vLegalDocument, long groupId, String language,
		String orgId, int statusDoc, OrderByComparator orderByComparator,
		boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_VLEGALDOCUMENT_WHERE);

		query.append(_FINDER_COLUMN_G_L_O_S_GROUPID_2);

		if (language == null) {
			query.append(_FINDER_COLUMN_G_L_O_S_LANGUAGE_1);
		}
		else {
			if (language.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_G_L_O_S_LANGUAGE_3);
			}
			else {
				query.append(_FINDER_COLUMN_G_L_O_S_LANGUAGE_2);
			}
		}

		if (orgId == null) {
			query.append(_FINDER_COLUMN_G_L_O_S_ORGID_1);
		}
		else {
			if (orgId.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_G_L_O_S_ORGID_3);
			}
			else {
				query.append(_FINDER_COLUMN_G_L_O_S_ORGID_2);
			}
		}

		query.append(_FINDER_COLUMN_G_L_O_S_STATUSDOC_2);

		if (orderByComparator != null) {
			String[] orderByFields = orderByComparator.getOrderByFields();

			if (orderByFields.length > 0) {
				query.append(WHERE_AND);
			}

			for (int i = 0; i < orderByFields.length; i++) {
				query.append(_ORDER_BY_ENTITY_ALIAS);
				query.append(orderByFields[i]);

				if ((i + 1) < orderByFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(WHERE_GREATER_THAN_HAS_NEXT);
					}
					else {
						query.append(WHERE_LESSER_THAN_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(WHERE_GREATER_THAN);
					}
					else {
						query.append(WHERE_LESSER_THAN);
					}
				}
			}

			query.append(ORDER_BY_CLAUSE);

			for (int i = 0; i < orderByFields.length; i++) {
				query.append(_ORDER_BY_ENTITY_ALIAS);
				query.append(orderByFields[i]);

				if ((i + 1) < orderByFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(ORDER_BY_ASC_HAS_NEXT);
					}
					else {
						query.append(ORDER_BY_DESC_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(ORDER_BY_ASC);
					}
					else {
						query.append(ORDER_BY_DESC);
					}
				}
			}
		}

		else {
			query.append(VLegalDocumentModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(groupId);

		if (language != null) {
			qPos.add(language);
		}

		if (orgId != null) {
			qPos.add(orgId);
		}

		qPos.add(statusDoc);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByValues(vLegalDocument);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<VLegalDocument> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Finds all the v legal documents where groupId = &#63; and language = &#63; and typeDocId = &#63; and statusDoc = &#63;.
	 *
	 * @param groupId the group id to search with
	 * @param language the language to search with
	 * @param typeDocId the type doc id to search with
	 * @param statusDoc the status doc to search with
	 * @return the matching v legal documents
	 * @throws SystemException if a system exception occurred
	 */
	public List<VLegalDocument> findByG_L_T_S(long groupId, String language,
		String typeDocId, int statusDoc) throws SystemException {
		return findByG_L_T_S(groupId, language, typeDocId, statusDoc,
			QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Finds a range of all the v legal documents where groupId = &#63; and language = &#63; and typeDocId = &#63; and statusDoc = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param groupId the group id to search with
	 * @param language the language to search with
	 * @param typeDocId the type doc id to search with
	 * @param statusDoc the status doc to search with
	 * @param start the lower bound of the range of v legal documents to return
	 * @param end the upper bound of the range of v legal documents to return (not inclusive)
	 * @return the range of matching v legal documents
	 * @throws SystemException if a system exception occurred
	 */
	public List<VLegalDocument> findByG_L_T_S(long groupId, String language,
		String typeDocId, int statusDoc, int start, int end)
		throws SystemException {
		return findByG_L_T_S(groupId, language, typeDocId, statusDoc, start,
			end, null);
	}

	/**
	 * Finds an ordered range of all the v legal documents where groupId = &#63; and language = &#63; and typeDocId = &#63; and statusDoc = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param groupId the group id to search with
	 * @param language the language to search with
	 * @param typeDocId the type doc id to search with
	 * @param statusDoc the status doc to search with
	 * @param start the lower bound of the range of v legal documents to return
	 * @param end the upper bound of the range of v legal documents to return (not inclusive)
	 * @param orderByComparator the comparator to order the results by
	 * @return the ordered range of matching v legal documents
	 * @throws SystemException if a system exception occurred
	 */
	public List<VLegalDocument> findByG_L_T_S(long groupId, String language,
		String typeDocId, int statusDoc, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		Object[] finderArgs = new Object[] {
				groupId, language, typeDocId, statusDoc,
				
				String.valueOf(start), String.valueOf(end),
				String.valueOf(orderByComparator)
			};

		List<VLegalDocument> list = (List<VLegalDocument>)FinderCacheUtil.getResult(FINDER_PATH_FIND_BY_G_L_T_S,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;

			if (orderByComparator != null) {
				query = new StringBundler(6 +
						(orderByComparator.getOrderByFields().length * 3));
			}
			else {
				query = new StringBundler(6);
			}

			query.append(_SQL_SELECT_VLEGALDOCUMENT_WHERE);

			query.append(_FINDER_COLUMN_G_L_T_S_GROUPID_2);

			if (language == null) {
				query.append(_FINDER_COLUMN_G_L_T_S_LANGUAGE_1);
			}
			else {
				if (language.equals(StringPool.BLANK)) {
					query.append(_FINDER_COLUMN_G_L_T_S_LANGUAGE_3);
				}
				else {
					query.append(_FINDER_COLUMN_G_L_T_S_LANGUAGE_2);
				}
			}

			if (typeDocId == null) {
				query.append(_FINDER_COLUMN_G_L_T_S_TYPEDOCID_1);
			}
			else {
				if (typeDocId.equals(StringPool.BLANK)) {
					query.append(_FINDER_COLUMN_G_L_T_S_TYPEDOCID_3);
				}
				else {
					query.append(_FINDER_COLUMN_G_L_T_S_TYPEDOCID_2);
				}
			}

			query.append(_FINDER_COLUMN_G_L_T_S_STATUSDOC_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}

			else {
				query.append(VLegalDocumentModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(groupId);

				if (language != null) {
					qPos.add(language);
				}

				if (typeDocId != null) {
					qPos.add(typeDocId);
				}

				qPos.add(statusDoc);

				list = (List<VLegalDocument>)QueryUtil.list(q, getDialect(),
						start, end);
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (list == null) {
					FinderCacheUtil.removeResult(FINDER_PATH_FIND_BY_G_L_T_S,
						finderArgs);
				}
				else {
					cacheResult(list);

					FinderCacheUtil.putResult(FINDER_PATH_FIND_BY_G_L_T_S,
						finderArgs, list);
				}

				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Finds the first v legal document in the ordered set where groupId = &#63; and language = &#63; and typeDocId = &#63; and statusDoc = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param groupId the group id to search with
	 * @param language the language to search with
	 * @param typeDocId the type doc id to search with
	 * @param statusDoc the status doc to search with
	 * @param orderByComparator the comparator to order the set by
	 * @return the first matching v legal document
	 * @throws com.vportal.portlet.vlegal.NoSuchVLegalDocumentException if a matching v legal document could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public VLegalDocument findByG_L_T_S_First(long groupId, String language,
		String typeDocId, int statusDoc, OrderByComparator orderByComparator)
		throws NoSuchVLegalDocumentException, SystemException {
		List<VLegalDocument> list = findByG_L_T_S(groupId, language, typeDocId,
				statusDoc, 0, 1, orderByComparator);

		if (list.isEmpty()) {
			StringBundler msg = new StringBundler(10);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("groupId=");
			msg.append(groupId);

			msg.append(", language=");
			msg.append(language);

			msg.append(", typeDocId=");
			msg.append(typeDocId);

			msg.append(", statusDoc=");
			msg.append(statusDoc);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			throw new NoSuchVLegalDocumentException(msg.toString());
		}
		else {
			return list.get(0);
		}
	}

	/**
	 * Finds the last v legal document in the ordered set where groupId = &#63; and language = &#63; and typeDocId = &#63; and statusDoc = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param groupId the group id to search with
	 * @param language the language to search with
	 * @param typeDocId the type doc id to search with
	 * @param statusDoc the status doc to search with
	 * @param orderByComparator the comparator to order the set by
	 * @return the last matching v legal document
	 * @throws com.vportal.portlet.vlegal.NoSuchVLegalDocumentException if a matching v legal document could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public VLegalDocument findByG_L_T_S_Last(long groupId, String language,
		String typeDocId, int statusDoc, OrderByComparator orderByComparator)
		throws NoSuchVLegalDocumentException, SystemException {
		int count = countByG_L_T_S(groupId, language, typeDocId, statusDoc);

		List<VLegalDocument> list = findByG_L_T_S(groupId, language, typeDocId,
				statusDoc, count - 1, count, orderByComparator);

		if (list.isEmpty()) {
			StringBundler msg = new StringBundler(10);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("groupId=");
			msg.append(groupId);

			msg.append(", language=");
			msg.append(language);

			msg.append(", typeDocId=");
			msg.append(typeDocId);

			msg.append(", statusDoc=");
			msg.append(statusDoc);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			throw new NoSuchVLegalDocumentException(msg.toString());
		}
		else {
			return list.get(0);
		}
	}

	/**
	 * Finds the v legal documents before and after the current v legal document in the ordered set where groupId = &#63; and language = &#63; and typeDocId = &#63; and statusDoc = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param docId the primary key of the current v legal document
	 * @param groupId the group id to search with
	 * @param language the language to search with
	 * @param typeDocId the type doc id to search with
	 * @param statusDoc the status doc to search with
	 * @param orderByComparator the comparator to order the set by
	 * @return the previous, current, and next v legal document
	 * @throws com.vportal.portlet.vlegal.NoSuchVLegalDocumentException if a v legal document with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public VLegalDocument[] findByG_L_T_S_PrevAndNext(String docId,
		long groupId, String language, String typeDocId, int statusDoc,
		OrderByComparator orderByComparator)
		throws NoSuchVLegalDocumentException, SystemException {
		VLegalDocument vLegalDocument = findByPrimaryKey(docId);

		Session session = null;

		try {
			session = openSession();

			VLegalDocument[] array = new VLegalDocumentImpl[3];

			array[0] = getByG_L_T_S_PrevAndNext(session, vLegalDocument,
					groupId, language, typeDocId, statusDoc, orderByComparator,
					true);

			array[1] = vLegalDocument;

			array[2] = getByG_L_T_S_PrevAndNext(session, vLegalDocument,
					groupId, language, typeDocId, statusDoc, orderByComparator,
					false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected VLegalDocument getByG_L_T_S_PrevAndNext(Session session,
		VLegalDocument vLegalDocument, long groupId, String language,
		String typeDocId, int statusDoc, OrderByComparator orderByComparator,
		boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_VLEGALDOCUMENT_WHERE);

		query.append(_FINDER_COLUMN_G_L_T_S_GROUPID_2);

		if (language == null) {
			query.append(_FINDER_COLUMN_G_L_T_S_LANGUAGE_1);
		}
		else {
			if (language.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_G_L_T_S_LANGUAGE_3);
			}
			else {
				query.append(_FINDER_COLUMN_G_L_T_S_LANGUAGE_2);
			}
		}

		if (typeDocId == null) {
			query.append(_FINDER_COLUMN_G_L_T_S_TYPEDOCID_1);
		}
		else {
			if (typeDocId.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_G_L_T_S_TYPEDOCID_3);
			}
			else {
				query.append(_FINDER_COLUMN_G_L_T_S_TYPEDOCID_2);
			}
		}

		query.append(_FINDER_COLUMN_G_L_T_S_STATUSDOC_2);

		if (orderByComparator != null) {
			String[] orderByFields = orderByComparator.getOrderByFields();

			if (orderByFields.length > 0) {
				query.append(WHERE_AND);
			}

			for (int i = 0; i < orderByFields.length; i++) {
				query.append(_ORDER_BY_ENTITY_ALIAS);
				query.append(orderByFields[i]);

				if ((i + 1) < orderByFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(WHERE_GREATER_THAN_HAS_NEXT);
					}
					else {
						query.append(WHERE_LESSER_THAN_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(WHERE_GREATER_THAN);
					}
					else {
						query.append(WHERE_LESSER_THAN);
					}
				}
			}

			query.append(ORDER_BY_CLAUSE);

			for (int i = 0; i < orderByFields.length; i++) {
				query.append(_ORDER_BY_ENTITY_ALIAS);
				query.append(orderByFields[i]);

				if ((i + 1) < orderByFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(ORDER_BY_ASC_HAS_NEXT);
					}
					else {
						query.append(ORDER_BY_DESC_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(ORDER_BY_ASC);
					}
					else {
						query.append(ORDER_BY_DESC);
					}
				}
			}
		}

		else {
			query.append(VLegalDocumentModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(groupId);

		if (language != null) {
			qPos.add(language);
		}

		if (typeDocId != null) {
			qPos.add(typeDocId);
		}

		qPos.add(statusDoc);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByValues(vLegalDocument);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<VLegalDocument> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Finds all the v legal documents where language = &#63; and fieldId = &#63; and statusDoc = &#63;.
	 *
	 * @param language the language to search with
	 * @param fieldId the field id to search with
	 * @param statusDoc the status doc to search with
	 * @return the matching v legal documents
	 * @throws SystemException if a system exception occurred
	 */
	public List<VLegalDocument> findByL_F_S(String language, String fieldId,
		int statusDoc) throws SystemException {
		return findByL_F_S(language, fieldId, statusDoc, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Finds a range of all the v legal documents where language = &#63; and fieldId = &#63; and statusDoc = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param language the language to search with
	 * @param fieldId the field id to search with
	 * @param statusDoc the status doc to search with
	 * @param start the lower bound of the range of v legal documents to return
	 * @param end the upper bound of the range of v legal documents to return (not inclusive)
	 * @return the range of matching v legal documents
	 * @throws SystemException if a system exception occurred
	 */
	public List<VLegalDocument> findByL_F_S(String language, String fieldId,
		int statusDoc, int start, int end) throws SystemException {
		return findByL_F_S(language, fieldId, statusDoc, start, end, null);
	}

	/**
	 * Finds an ordered range of all the v legal documents where language = &#63; and fieldId = &#63; and statusDoc = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param language the language to search with
	 * @param fieldId the field id to search with
	 * @param statusDoc the status doc to search with
	 * @param start the lower bound of the range of v legal documents to return
	 * @param end the upper bound of the range of v legal documents to return (not inclusive)
	 * @param orderByComparator the comparator to order the results by
	 * @return the ordered range of matching v legal documents
	 * @throws SystemException if a system exception occurred
	 */
	public List<VLegalDocument> findByL_F_S(String language, String fieldId,
		int statusDoc, int start, int end, OrderByComparator orderByComparator)
		throws SystemException {
		Object[] finderArgs = new Object[] {
				language, fieldId, statusDoc,
				
				String.valueOf(start), String.valueOf(end),
				String.valueOf(orderByComparator)
			};

		List<VLegalDocument> list = (List<VLegalDocument>)FinderCacheUtil.getResult(FINDER_PATH_FIND_BY_L_F_S,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;

			if (orderByComparator != null) {
				query = new StringBundler(5 +
						(orderByComparator.getOrderByFields().length * 3));
			}
			else {
				query = new StringBundler(5);
			}

			query.append(_SQL_SELECT_VLEGALDOCUMENT_WHERE);

			if (language == null) {
				query.append(_FINDER_COLUMN_L_F_S_LANGUAGE_1);
			}
			else {
				if (language.equals(StringPool.BLANK)) {
					query.append(_FINDER_COLUMN_L_F_S_LANGUAGE_3);
				}
				else {
					query.append(_FINDER_COLUMN_L_F_S_LANGUAGE_2);
				}
			}

			if (fieldId == null) {
				query.append(_FINDER_COLUMN_L_F_S_FIELDID_1);
			}
			else {
				if (fieldId.equals(StringPool.BLANK)) {
					query.append(_FINDER_COLUMN_L_F_S_FIELDID_3);
				}
				else {
					query.append(_FINDER_COLUMN_L_F_S_FIELDID_2);
				}
			}

			query.append(_FINDER_COLUMN_L_F_S_STATUSDOC_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}

			else {
				query.append(VLegalDocumentModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (language != null) {
					qPos.add(language);
				}

				if (fieldId != null) {
					qPos.add(fieldId);
				}

				qPos.add(statusDoc);

				list = (List<VLegalDocument>)QueryUtil.list(q, getDialect(),
						start, end);
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (list == null) {
					FinderCacheUtil.removeResult(FINDER_PATH_FIND_BY_L_F_S,
						finderArgs);
				}
				else {
					cacheResult(list);

					FinderCacheUtil.putResult(FINDER_PATH_FIND_BY_L_F_S,
						finderArgs, list);
				}

				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Finds the first v legal document in the ordered set where language = &#63; and fieldId = &#63; and statusDoc = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param language the language to search with
	 * @param fieldId the field id to search with
	 * @param statusDoc the status doc to search with
	 * @param orderByComparator the comparator to order the set by
	 * @return the first matching v legal document
	 * @throws com.vportal.portlet.vlegal.NoSuchVLegalDocumentException if a matching v legal document could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public VLegalDocument findByL_F_S_First(String language, String fieldId,
		int statusDoc, OrderByComparator orderByComparator)
		throws NoSuchVLegalDocumentException, SystemException {
		List<VLegalDocument> list = findByL_F_S(language, fieldId, statusDoc,
				0, 1, orderByComparator);

		if (list.isEmpty()) {
			StringBundler msg = new StringBundler(8);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("language=");
			msg.append(language);

			msg.append(", fieldId=");
			msg.append(fieldId);

			msg.append(", statusDoc=");
			msg.append(statusDoc);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			throw new NoSuchVLegalDocumentException(msg.toString());
		}
		else {
			return list.get(0);
		}
	}

	/**
	 * Finds the last v legal document in the ordered set where language = &#63; and fieldId = &#63; and statusDoc = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param language the language to search with
	 * @param fieldId the field id to search with
	 * @param statusDoc the status doc to search with
	 * @param orderByComparator the comparator to order the set by
	 * @return the last matching v legal document
	 * @throws com.vportal.portlet.vlegal.NoSuchVLegalDocumentException if a matching v legal document could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public VLegalDocument findByL_F_S_Last(String language, String fieldId,
		int statusDoc, OrderByComparator orderByComparator)
		throws NoSuchVLegalDocumentException, SystemException {
		int count = countByL_F_S(language, fieldId, statusDoc);

		List<VLegalDocument> list = findByL_F_S(language, fieldId, statusDoc,
				count - 1, count, orderByComparator);

		if (list.isEmpty()) {
			StringBundler msg = new StringBundler(8);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("language=");
			msg.append(language);

			msg.append(", fieldId=");
			msg.append(fieldId);

			msg.append(", statusDoc=");
			msg.append(statusDoc);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			throw new NoSuchVLegalDocumentException(msg.toString());
		}
		else {
			return list.get(0);
		}
	}

	/**
	 * Finds the v legal documents before and after the current v legal document in the ordered set where language = &#63; and fieldId = &#63; and statusDoc = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param docId the primary key of the current v legal document
	 * @param language the language to search with
	 * @param fieldId the field id to search with
	 * @param statusDoc the status doc to search with
	 * @param orderByComparator the comparator to order the set by
	 * @return the previous, current, and next v legal document
	 * @throws com.vportal.portlet.vlegal.NoSuchVLegalDocumentException if a v legal document with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public VLegalDocument[] findByL_F_S_PrevAndNext(String docId,
		String language, String fieldId, int statusDoc,
		OrderByComparator orderByComparator)
		throws NoSuchVLegalDocumentException, SystemException {
		VLegalDocument vLegalDocument = findByPrimaryKey(docId);

		Session session = null;

		try {
			session = openSession();

			VLegalDocument[] array = new VLegalDocumentImpl[3];

			array[0] = getByL_F_S_PrevAndNext(session, vLegalDocument,
					language, fieldId, statusDoc, orderByComparator, true);

			array[1] = vLegalDocument;

			array[2] = getByL_F_S_PrevAndNext(session, vLegalDocument,
					language, fieldId, statusDoc, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected VLegalDocument getByL_F_S_PrevAndNext(Session session,
		VLegalDocument vLegalDocument, String language, String fieldId,
		int statusDoc, OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_VLEGALDOCUMENT_WHERE);

		if (language == null) {
			query.append(_FINDER_COLUMN_L_F_S_LANGUAGE_1);
		}
		else {
			if (language.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_L_F_S_LANGUAGE_3);
			}
			else {
				query.append(_FINDER_COLUMN_L_F_S_LANGUAGE_2);
			}
		}

		if (fieldId == null) {
			query.append(_FINDER_COLUMN_L_F_S_FIELDID_1);
		}
		else {
			if (fieldId.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_L_F_S_FIELDID_3);
			}
			else {
				query.append(_FINDER_COLUMN_L_F_S_FIELDID_2);
			}
		}

		query.append(_FINDER_COLUMN_L_F_S_STATUSDOC_2);

		if (orderByComparator != null) {
			String[] orderByFields = orderByComparator.getOrderByFields();

			if (orderByFields.length > 0) {
				query.append(WHERE_AND);
			}

			for (int i = 0; i < orderByFields.length; i++) {
				query.append(_ORDER_BY_ENTITY_ALIAS);
				query.append(orderByFields[i]);

				if ((i + 1) < orderByFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(WHERE_GREATER_THAN_HAS_NEXT);
					}
					else {
						query.append(WHERE_LESSER_THAN_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(WHERE_GREATER_THAN);
					}
					else {
						query.append(WHERE_LESSER_THAN);
					}
				}
			}

			query.append(ORDER_BY_CLAUSE);

			for (int i = 0; i < orderByFields.length; i++) {
				query.append(_ORDER_BY_ENTITY_ALIAS);
				query.append(orderByFields[i]);

				if ((i + 1) < orderByFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(ORDER_BY_ASC_HAS_NEXT);
					}
					else {
						query.append(ORDER_BY_DESC_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(ORDER_BY_ASC);
					}
					else {
						query.append(ORDER_BY_DESC);
					}
				}
			}
		}

		else {
			query.append(VLegalDocumentModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		if (language != null) {
			qPos.add(language);
		}

		if (fieldId != null) {
			qPos.add(fieldId);
		}

		qPos.add(statusDoc);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByValues(vLegalDocument);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<VLegalDocument> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Finds all the v legal documents where groupId = &#63; and language = &#63; and fieldId = &#63; and statusDoc = &#63;.
	 *
	 * @param groupId the group id to search with
	 * @param language the language to search with
	 * @param fieldId the field id to search with
	 * @param statusDoc the status doc to search with
	 * @return the matching v legal documents
	 * @throws SystemException if a system exception occurred
	 */
	public List<VLegalDocument> findByG_L_F_S(long groupId, String language,
		String fieldId, int statusDoc) throws SystemException {
		return findByG_L_F_S(groupId, language, fieldId, statusDoc,
			QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Finds a range of all the v legal documents where groupId = &#63; and language = &#63; and fieldId = &#63; and statusDoc = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param groupId the group id to search with
	 * @param language the language to search with
	 * @param fieldId the field id to search with
	 * @param statusDoc the status doc to search with
	 * @param start the lower bound of the range of v legal documents to return
	 * @param end the upper bound of the range of v legal documents to return (not inclusive)
	 * @return the range of matching v legal documents
	 * @throws SystemException if a system exception occurred
	 */
	public List<VLegalDocument> findByG_L_F_S(long groupId, String language,
		String fieldId, int statusDoc, int start, int end)
		throws SystemException {
		return findByG_L_F_S(groupId, language, fieldId, statusDoc, start, end,
			null);
	}

	/**
	 * Finds an ordered range of all the v legal documents where groupId = &#63; and language = &#63; and fieldId = &#63; and statusDoc = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param groupId the group id to search with
	 * @param language the language to search with
	 * @param fieldId the field id to search with
	 * @param statusDoc the status doc to search with
	 * @param start the lower bound of the range of v legal documents to return
	 * @param end the upper bound of the range of v legal documents to return (not inclusive)
	 * @param orderByComparator the comparator to order the results by
	 * @return the ordered range of matching v legal documents
	 * @throws SystemException if a system exception occurred
	 */
	public List<VLegalDocument> findByG_L_F_S(long groupId, String language,
		String fieldId, int statusDoc, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		Object[] finderArgs = new Object[] {
				groupId, language, fieldId, statusDoc,
				
				String.valueOf(start), String.valueOf(end),
				String.valueOf(orderByComparator)
			};

		List<VLegalDocument> list = (List<VLegalDocument>)FinderCacheUtil.getResult(FINDER_PATH_FIND_BY_G_L_F_S,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;

			if (orderByComparator != null) {
				query = new StringBundler(6 +
						(orderByComparator.getOrderByFields().length * 3));
			}
			else {
				query = new StringBundler(6);
			}

			query.append(_SQL_SELECT_VLEGALDOCUMENT_WHERE);

			query.append(_FINDER_COLUMN_G_L_F_S_GROUPID_2);

			if (language == null) {
				query.append(_FINDER_COLUMN_G_L_F_S_LANGUAGE_1);
			}
			else {
				if (language.equals(StringPool.BLANK)) {
					query.append(_FINDER_COLUMN_G_L_F_S_LANGUAGE_3);
				}
				else {
					query.append(_FINDER_COLUMN_G_L_F_S_LANGUAGE_2);
				}
			}

			if (fieldId == null) {
				query.append(_FINDER_COLUMN_G_L_F_S_FIELDID_1);
			}
			else {
				if (fieldId.equals(StringPool.BLANK)) {
					query.append(_FINDER_COLUMN_G_L_F_S_FIELDID_3);
				}
				else {
					query.append(_FINDER_COLUMN_G_L_F_S_FIELDID_2);
				}
			}

			query.append(_FINDER_COLUMN_G_L_F_S_STATUSDOC_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}

			else {
				query.append(VLegalDocumentModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(groupId);

				if (language != null) {
					qPos.add(language);
				}

				if (fieldId != null) {
					qPos.add(fieldId);
				}

				qPos.add(statusDoc);

				list = (List<VLegalDocument>)QueryUtil.list(q, getDialect(),
						start, end);
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (list == null) {
					FinderCacheUtil.removeResult(FINDER_PATH_FIND_BY_G_L_F_S,
						finderArgs);
				}
				else {
					cacheResult(list);

					FinderCacheUtil.putResult(FINDER_PATH_FIND_BY_G_L_F_S,
						finderArgs, list);
				}

				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Finds the first v legal document in the ordered set where groupId = &#63; and language = &#63; and fieldId = &#63; and statusDoc = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param groupId the group id to search with
	 * @param language the language to search with
	 * @param fieldId the field id to search with
	 * @param statusDoc the status doc to search with
	 * @param orderByComparator the comparator to order the set by
	 * @return the first matching v legal document
	 * @throws com.vportal.portlet.vlegal.NoSuchVLegalDocumentException if a matching v legal document could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public VLegalDocument findByG_L_F_S_First(long groupId, String language,
		String fieldId, int statusDoc, OrderByComparator orderByComparator)
		throws NoSuchVLegalDocumentException, SystemException {
		List<VLegalDocument> list = findByG_L_F_S(groupId, language, fieldId,
				statusDoc, 0, 1, orderByComparator);

		if (list.isEmpty()) {
			StringBundler msg = new StringBundler(10);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("groupId=");
			msg.append(groupId);

			msg.append(", language=");
			msg.append(language);

			msg.append(", fieldId=");
			msg.append(fieldId);

			msg.append(", statusDoc=");
			msg.append(statusDoc);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			throw new NoSuchVLegalDocumentException(msg.toString());
		}
		else {
			return list.get(0);
		}
	}

	/**
	 * Finds the last v legal document in the ordered set where groupId = &#63; and language = &#63; and fieldId = &#63; and statusDoc = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param groupId the group id to search with
	 * @param language the language to search with
	 * @param fieldId the field id to search with
	 * @param statusDoc the status doc to search with
	 * @param orderByComparator the comparator to order the set by
	 * @return the last matching v legal document
	 * @throws com.vportal.portlet.vlegal.NoSuchVLegalDocumentException if a matching v legal document could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public VLegalDocument findByG_L_F_S_Last(long groupId, String language,
		String fieldId, int statusDoc, OrderByComparator orderByComparator)
		throws NoSuchVLegalDocumentException, SystemException {
		int count = countByG_L_F_S(groupId, language, fieldId, statusDoc);

		List<VLegalDocument> list = findByG_L_F_S(groupId, language, fieldId,
				statusDoc, count - 1, count, orderByComparator);

		if (list.isEmpty()) {
			StringBundler msg = new StringBundler(10);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("groupId=");
			msg.append(groupId);

			msg.append(", language=");
			msg.append(language);

			msg.append(", fieldId=");
			msg.append(fieldId);

			msg.append(", statusDoc=");
			msg.append(statusDoc);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			throw new NoSuchVLegalDocumentException(msg.toString());
		}
		else {
			return list.get(0);
		}
	}

	/**
	 * Finds the v legal documents before and after the current v legal document in the ordered set where groupId = &#63; and language = &#63; and fieldId = &#63; and statusDoc = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param docId the primary key of the current v legal document
	 * @param groupId the group id to search with
	 * @param language the language to search with
	 * @param fieldId the field id to search with
	 * @param statusDoc the status doc to search with
	 * @param orderByComparator the comparator to order the set by
	 * @return the previous, current, and next v legal document
	 * @throws com.vportal.portlet.vlegal.NoSuchVLegalDocumentException if a v legal document with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public VLegalDocument[] findByG_L_F_S_PrevAndNext(String docId,
		long groupId, String language, String fieldId, int statusDoc,
		OrderByComparator orderByComparator)
		throws NoSuchVLegalDocumentException, SystemException {
		VLegalDocument vLegalDocument = findByPrimaryKey(docId);

		Session session = null;

		try {
			session = openSession();

			VLegalDocument[] array = new VLegalDocumentImpl[3];

			array[0] = getByG_L_F_S_PrevAndNext(session, vLegalDocument,
					groupId, language, fieldId, statusDoc, orderByComparator,
					true);

			array[1] = vLegalDocument;

			array[2] = getByG_L_F_S_PrevAndNext(session, vLegalDocument,
					groupId, language, fieldId, statusDoc, orderByComparator,
					false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected VLegalDocument getByG_L_F_S_PrevAndNext(Session session,
		VLegalDocument vLegalDocument, long groupId, String language,
		String fieldId, int statusDoc, OrderByComparator orderByComparator,
		boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_VLEGALDOCUMENT_WHERE);

		query.append(_FINDER_COLUMN_G_L_F_S_GROUPID_2);

		if (language == null) {
			query.append(_FINDER_COLUMN_G_L_F_S_LANGUAGE_1);
		}
		else {
			if (language.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_G_L_F_S_LANGUAGE_3);
			}
			else {
				query.append(_FINDER_COLUMN_G_L_F_S_LANGUAGE_2);
			}
		}

		if (fieldId == null) {
			query.append(_FINDER_COLUMN_G_L_F_S_FIELDID_1);
		}
		else {
			if (fieldId.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_G_L_F_S_FIELDID_3);
			}
			else {
				query.append(_FINDER_COLUMN_G_L_F_S_FIELDID_2);
			}
		}

		query.append(_FINDER_COLUMN_G_L_F_S_STATUSDOC_2);

		if (orderByComparator != null) {
			String[] orderByFields = orderByComparator.getOrderByFields();

			if (orderByFields.length > 0) {
				query.append(WHERE_AND);
			}

			for (int i = 0; i < orderByFields.length; i++) {
				query.append(_ORDER_BY_ENTITY_ALIAS);
				query.append(orderByFields[i]);

				if ((i + 1) < orderByFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(WHERE_GREATER_THAN_HAS_NEXT);
					}
					else {
						query.append(WHERE_LESSER_THAN_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(WHERE_GREATER_THAN);
					}
					else {
						query.append(WHERE_LESSER_THAN);
					}
				}
			}

			query.append(ORDER_BY_CLAUSE);

			for (int i = 0; i < orderByFields.length; i++) {
				query.append(_ORDER_BY_ENTITY_ALIAS);
				query.append(orderByFields[i]);

				if ((i + 1) < orderByFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(ORDER_BY_ASC_HAS_NEXT);
					}
					else {
						query.append(ORDER_BY_DESC_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(ORDER_BY_ASC);
					}
					else {
						query.append(ORDER_BY_DESC);
					}
				}
			}
		}

		else {
			query.append(VLegalDocumentModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(groupId);

		if (language != null) {
			qPos.add(language);
		}

		if (fieldId != null) {
			qPos.add(fieldId);
		}

		qPos.add(statusDoc);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByValues(vLegalDocument);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<VLegalDocument> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Finds all the v legal documents where groupId = &#63; and language = &#63; and orgId = &#63;.
	 *
	 * @param groupId the group id to search with
	 * @param language the language to search with
	 * @param orgId the org id to search with
	 * @return the matching v legal documents
	 * @throws SystemException if a system exception occurred
	 */
	public List<VLegalDocument> findByG_L_O(long groupId, String language,
		String orgId) throws SystemException {
		return findByG_L_O(groupId, language, orgId, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Finds a range of all the v legal documents where groupId = &#63; and language = &#63; and orgId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param groupId the group id to search with
	 * @param language the language to search with
	 * @param orgId the org id to search with
	 * @param start the lower bound of the range of v legal documents to return
	 * @param end the upper bound of the range of v legal documents to return (not inclusive)
	 * @return the range of matching v legal documents
	 * @throws SystemException if a system exception occurred
	 */
	public List<VLegalDocument> findByG_L_O(long groupId, String language,
		String orgId, int start, int end) throws SystemException {
		return findByG_L_O(groupId, language, orgId, start, end, null);
	}

	/**
	 * Finds an ordered range of all the v legal documents where groupId = &#63; and language = &#63; and orgId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param groupId the group id to search with
	 * @param language the language to search with
	 * @param orgId the org id to search with
	 * @param start the lower bound of the range of v legal documents to return
	 * @param end the upper bound of the range of v legal documents to return (not inclusive)
	 * @param orderByComparator the comparator to order the results by
	 * @return the ordered range of matching v legal documents
	 * @throws SystemException if a system exception occurred
	 */
	public List<VLegalDocument> findByG_L_O(long groupId, String language,
		String orgId, int start, int end, OrderByComparator orderByComparator)
		throws SystemException {
		Object[] finderArgs = new Object[] {
				groupId, language, orgId,
				
				String.valueOf(start), String.valueOf(end),
				String.valueOf(orderByComparator)
			};

		List<VLegalDocument> list = (List<VLegalDocument>)FinderCacheUtil.getResult(FINDER_PATH_FIND_BY_G_L_O,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;

			if (orderByComparator != null) {
				query = new StringBundler(5 +
						(orderByComparator.getOrderByFields().length * 3));
			}
			else {
				query = new StringBundler(5);
			}

			query.append(_SQL_SELECT_VLEGALDOCUMENT_WHERE);

			query.append(_FINDER_COLUMN_G_L_O_GROUPID_2);

			if (language == null) {
				query.append(_FINDER_COLUMN_G_L_O_LANGUAGE_1);
			}
			else {
				if (language.equals(StringPool.BLANK)) {
					query.append(_FINDER_COLUMN_G_L_O_LANGUAGE_3);
				}
				else {
					query.append(_FINDER_COLUMN_G_L_O_LANGUAGE_2);
				}
			}

			if (orgId == null) {
				query.append(_FINDER_COLUMN_G_L_O_ORGID_1);
			}
			else {
				if (orgId.equals(StringPool.BLANK)) {
					query.append(_FINDER_COLUMN_G_L_O_ORGID_3);
				}
				else {
					query.append(_FINDER_COLUMN_G_L_O_ORGID_2);
				}
			}

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}

			else {
				query.append(VLegalDocumentModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(groupId);

				if (language != null) {
					qPos.add(language);
				}

				if (orgId != null) {
					qPos.add(orgId);
				}

				list = (List<VLegalDocument>)QueryUtil.list(q, getDialect(),
						start, end);
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (list == null) {
					FinderCacheUtil.removeResult(FINDER_PATH_FIND_BY_G_L_O,
						finderArgs);
				}
				else {
					cacheResult(list);

					FinderCacheUtil.putResult(FINDER_PATH_FIND_BY_G_L_O,
						finderArgs, list);
				}

				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Finds the first v legal document in the ordered set where groupId = &#63; and language = &#63; and orgId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param groupId the group id to search with
	 * @param language the language to search with
	 * @param orgId the org id to search with
	 * @param orderByComparator the comparator to order the set by
	 * @return the first matching v legal document
	 * @throws com.vportal.portlet.vlegal.NoSuchVLegalDocumentException if a matching v legal document could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public VLegalDocument findByG_L_O_First(long groupId, String language,
		String orgId, OrderByComparator orderByComparator)
		throws NoSuchVLegalDocumentException, SystemException {
		List<VLegalDocument> list = findByG_L_O(groupId, language, orgId, 0, 1,
				orderByComparator);

		if (list.isEmpty()) {
			StringBundler msg = new StringBundler(8);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("groupId=");
			msg.append(groupId);

			msg.append(", language=");
			msg.append(language);

			msg.append(", orgId=");
			msg.append(orgId);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			throw new NoSuchVLegalDocumentException(msg.toString());
		}
		else {
			return list.get(0);
		}
	}

	/**
	 * Finds the last v legal document in the ordered set where groupId = &#63; and language = &#63; and orgId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param groupId the group id to search with
	 * @param language the language to search with
	 * @param orgId the org id to search with
	 * @param orderByComparator the comparator to order the set by
	 * @return the last matching v legal document
	 * @throws com.vportal.portlet.vlegal.NoSuchVLegalDocumentException if a matching v legal document could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public VLegalDocument findByG_L_O_Last(long groupId, String language,
		String orgId, OrderByComparator orderByComparator)
		throws NoSuchVLegalDocumentException, SystemException {
		int count = countByG_L_O(groupId, language, orgId);

		List<VLegalDocument> list = findByG_L_O(groupId, language, orgId,
				count - 1, count, orderByComparator);

		if (list.isEmpty()) {
			StringBundler msg = new StringBundler(8);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("groupId=");
			msg.append(groupId);

			msg.append(", language=");
			msg.append(language);

			msg.append(", orgId=");
			msg.append(orgId);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			throw new NoSuchVLegalDocumentException(msg.toString());
		}
		else {
			return list.get(0);
		}
	}

	/**
	 * Finds the v legal documents before and after the current v legal document in the ordered set where groupId = &#63; and language = &#63; and orgId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param docId the primary key of the current v legal document
	 * @param groupId the group id to search with
	 * @param language the language to search with
	 * @param orgId the org id to search with
	 * @param orderByComparator the comparator to order the set by
	 * @return the previous, current, and next v legal document
	 * @throws com.vportal.portlet.vlegal.NoSuchVLegalDocumentException if a v legal document with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public VLegalDocument[] findByG_L_O_PrevAndNext(String docId, long groupId,
		String language, String orgId, OrderByComparator orderByComparator)
		throws NoSuchVLegalDocumentException, SystemException {
		VLegalDocument vLegalDocument = findByPrimaryKey(docId);

		Session session = null;

		try {
			session = openSession();

			VLegalDocument[] array = new VLegalDocumentImpl[3];

			array[0] = getByG_L_O_PrevAndNext(session, vLegalDocument, groupId,
					language, orgId, orderByComparator, true);

			array[1] = vLegalDocument;

			array[2] = getByG_L_O_PrevAndNext(session, vLegalDocument, groupId,
					language, orgId, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected VLegalDocument getByG_L_O_PrevAndNext(Session session,
		VLegalDocument vLegalDocument, long groupId, String language,
		String orgId, OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_VLEGALDOCUMENT_WHERE);

		query.append(_FINDER_COLUMN_G_L_O_GROUPID_2);

		if (language == null) {
			query.append(_FINDER_COLUMN_G_L_O_LANGUAGE_1);
		}
		else {
			if (language.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_G_L_O_LANGUAGE_3);
			}
			else {
				query.append(_FINDER_COLUMN_G_L_O_LANGUAGE_2);
			}
		}

		if (orgId == null) {
			query.append(_FINDER_COLUMN_G_L_O_ORGID_1);
		}
		else {
			if (orgId.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_G_L_O_ORGID_3);
			}
			else {
				query.append(_FINDER_COLUMN_G_L_O_ORGID_2);
			}
		}

		if (orderByComparator != null) {
			String[] orderByFields = orderByComparator.getOrderByFields();

			if (orderByFields.length > 0) {
				query.append(WHERE_AND);
			}

			for (int i = 0; i < orderByFields.length; i++) {
				query.append(_ORDER_BY_ENTITY_ALIAS);
				query.append(orderByFields[i]);

				if ((i + 1) < orderByFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(WHERE_GREATER_THAN_HAS_NEXT);
					}
					else {
						query.append(WHERE_LESSER_THAN_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(WHERE_GREATER_THAN);
					}
					else {
						query.append(WHERE_LESSER_THAN);
					}
				}
			}

			query.append(ORDER_BY_CLAUSE);

			for (int i = 0; i < orderByFields.length; i++) {
				query.append(_ORDER_BY_ENTITY_ALIAS);
				query.append(orderByFields[i]);

				if ((i + 1) < orderByFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(ORDER_BY_ASC_HAS_NEXT);
					}
					else {
						query.append(ORDER_BY_DESC_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(ORDER_BY_ASC);
					}
					else {
						query.append(ORDER_BY_DESC);
					}
				}
			}
		}

		else {
			query.append(VLegalDocumentModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(groupId);

		if (language != null) {
			qPos.add(language);
		}

		if (orgId != null) {
			qPos.add(orgId);
		}

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByValues(vLegalDocument);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<VLegalDocument> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Finds all the v legal documents where language = &#63; and orgId = &#63; and statusDoc = &#63;.
	 *
	 * @param language the language to search with
	 * @param orgId the org id to search with
	 * @param statusDoc the status doc to search with
	 * @return the matching v legal documents
	 * @throws SystemException if a system exception occurred
	 */
	public List<VLegalDocument> findByL_O(String language, String orgId,
		int statusDoc) throws SystemException {
		return findByL_O(language, orgId, statusDoc, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Finds a range of all the v legal documents where language = &#63; and orgId = &#63; and statusDoc = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param language the language to search with
	 * @param orgId the org id to search with
	 * @param statusDoc the status doc to search with
	 * @param start the lower bound of the range of v legal documents to return
	 * @param end the upper bound of the range of v legal documents to return (not inclusive)
	 * @return the range of matching v legal documents
	 * @throws SystemException if a system exception occurred
	 */
	public List<VLegalDocument> findByL_O(String language, String orgId,
		int statusDoc, int start, int end) throws SystemException {
		return findByL_O(language, orgId, statusDoc, start, end, null);
	}

	/**
	 * Finds an ordered range of all the v legal documents where language = &#63; and orgId = &#63; and statusDoc = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param language the language to search with
	 * @param orgId the org id to search with
	 * @param statusDoc the status doc to search with
	 * @param start the lower bound of the range of v legal documents to return
	 * @param end the upper bound of the range of v legal documents to return (not inclusive)
	 * @param orderByComparator the comparator to order the results by
	 * @return the ordered range of matching v legal documents
	 * @throws SystemException if a system exception occurred
	 */
	public List<VLegalDocument> findByL_O(String language, String orgId,
		int statusDoc, int start, int end, OrderByComparator orderByComparator)
		throws SystemException {
		Object[] finderArgs = new Object[] {
				language, orgId, statusDoc,
				
				String.valueOf(start), String.valueOf(end),
				String.valueOf(orderByComparator)
			};

		List<VLegalDocument> list = (List<VLegalDocument>)FinderCacheUtil.getResult(FINDER_PATH_FIND_BY_L_O,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;

			if (orderByComparator != null) {
				query = new StringBundler(5 +
						(orderByComparator.getOrderByFields().length * 3));
			}
			else {
				query = new StringBundler(5);
			}

			query.append(_SQL_SELECT_VLEGALDOCUMENT_WHERE);

			if (language == null) {
				query.append(_FINDER_COLUMN_L_O_LANGUAGE_1);
			}
			else {
				if (language.equals(StringPool.BLANK)) {
					query.append(_FINDER_COLUMN_L_O_LANGUAGE_3);
				}
				else {
					query.append(_FINDER_COLUMN_L_O_LANGUAGE_2);
				}
			}

			if (orgId == null) {
				query.append(_FINDER_COLUMN_L_O_ORGID_1);
			}
			else {
				if (orgId.equals(StringPool.BLANK)) {
					query.append(_FINDER_COLUMN_L_O_ORGID_3);
				}
				else {
					query.append(_FINDER_COLUMN_L_O_ORGID_2);
				}
			}

			query.append(_FINDER_COLUMN_L_O_STATUSDOC_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}

			else {
				query.append(VLegalDocumentModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (language != null) {
					qPos.add(language);
				}

				if (orgId != null) {
					qPos.add(orgId);
				}

				qPos.add(statusDoc);

				list = (List<VLegalDocument>)QueryUtil.list(q, getDialect(),
						start, end);
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (list == null) {
					FinderCacheUtil.removeResult(FINDER_PATH_FIND_BY_L_O,
						finderArgs);
				}
				else {
					cacheResult(list);

					FinderCacheUtil.putResult(FINDER_PATH_FIND_BY_L_O,
						finderArgs, list);
				}

				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Finds the first v legal document in the ordered set where language = &#63; and orgId = &#63; and statusDoc = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param language the language to search with
	 * @param orgId the org id to search with
	 * @param statusDoc the status doc to search with
	 * @param orderByComparator the comparator to order the set by
	 * @return the first matching v legal document
	 * @throws com.vportal.portlet.vlegal.NoSuchVLegalDocumentException if a matching v legal document could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public VLegalDocument findByL_O_First(String language, String orgId,
		int statusDoc, OrderByComparator orderByComparator)
		throws NoSuchVLegalDocumentException, SystemException {
		List<VLegalDocument> list = findByL_O(language, orgId, statusDoc, 0, 1,
				orderByComparator);

		if (list.isEmpty()) {
			StringBundler msg = new StringBundler(8);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("language=");
			msg.append(language);

			msg.append(", orgId=");
			msg.append(orgId);

			msg.append(", statusDoc=");
			msg.append(statusDoc);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			throw new NoSuchVLegalDocumentException(msg.toString());
		}
		else {
			return list.get(0);
		}
	}

	/**
	 * Finds the last v legal document in the ordered set where language = &#63; and orgId = &#63; and statusDoc = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param language the language to search with
	 * @param orgId the org id to search with
	 * @param statusDoc the status doc to search with
	 * @param orderByComparator the comparator to order the set by
	 * @return the last matching v legal document
	 * @throws com.vportal.portlet.vlegal.NoSuchVLegalDocumentException if a matching v legal document could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public VLegalDocument findByL_O_Last(String language, String orgId,
		int statusDoc, OrderByComparator orderByComparator)
		throws NoSuchVLegalDocumentException, SystemException {
		int count = countByL_O(language, orgId, statusDoc);

		List<VLegalDocument> list = findByL_O(language, orgId, statusDoc,
				count - 1, count, orderByComparator);

		if (list.isEmpty()) {
			StringBundler msg = new StringBundler(8);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("language=");
			msg.append(language);

			msg.append(", orgId=");
			msg.append(orgId);

			msg.append(", statusDoc=");
			msg.append(statusDoc);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			throw new NoSuchVLegalDocumentException(msg.toString());
		}
		else {
			return list.get(0);
		}
	}

	/**
	 * Finds the v legal documents before and after the current v legal document in the ordered set where language = &#63; and orgId = &#63; and statusDoc = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param docId the primary key of the current v legal document
	 * @param language the language to search with
	 * @param orgId the org id to search with
	 * @param statusDoc the status doc to search with
	 * @param orderByComparator the comparator to order the set by
	 * @return the previous, current, and next v legal document
	 * @throws com.vportal.portlet.vlegal.NoSuchVLegalDocumentException if a v legal document with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public VLegalDocument[] findByL_O_PrevAndNext(String docId,
		String language, String orgId, int statusDoc,
		OrderByComparator orderByComparator)
		throws NoSuchVLegalDocumentException, SystemException {
		VLegalDocument vLegalDocument = findByPrimaryKey(docId);

		Session session = null;

		try {
			session = openSession();

			VLegalDocument[] array = new VLegalDocumentImpl[3];

			array[0] = getByL_O_PrevAndNext(session, vLegalDocument, language,
					orgId, statusDoc, orderByComparator, true);

			array[1] = vLegalDocument;

			array[2] = getByL_O_PrevAndNext(session, vLegalDocument, language,
					orgId, statusDoc, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected VLegalDocument getByL_O_PrevAndNext(Session session,
		VLegalDocument vLegalDocument, String language, String orgId,
		int statusDoc, OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_VLEGALDOCUMENT_WHERE);

		if (language == null) {
			query.append(_FINDER_COLUMN_L_O_LANGUAGE_1);
		}
		else {
			if (language.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_L_O_LANGUAGE_3);
			}
			else {
				query.append(_FINDER_COLUMN_L_O_LANGUAGE_2);
			}
		}

		if (orgId == null) {
			query.append(_FINDER_COLUMN_L_O_ORGID_1);
		}
		else {
			if (orgId.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_L_O_ORGID_3);
			}
			else {
				query.append(_FINDER_COLUMN_L_O_ORGID_2);
			}
		}

		query.append(_FINDER_COLUMN_L_O_STATUSDOC_2);

		if (orderByComparator != null) {
			String[] orderByFields = orderByComparator.getOrderByFields();

			if (orderByFields.length > 0) {
				query.append(WHERE_AND);
			}

			for (int i = 0; i < orderByFields.length; i++) {
				query.append(_ORDER_BY_ENTITY_ALIAS);
				query.append(orderByFields[i]);

				if ((i + 1) < orderByFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(WHERE_GREATER_THAN_HAS_NEXT);
					}
					else {
						query.append(WHERE_LESSER_THAN_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(WHERE_GREATER_THAN);
					}
					else {
						query.append(WHERE_LESSER_THAN);
					}
				}
			}

			query.append(ORDER_BY_CLAUSE);

			for (int i = 0; i < orderByFields.length; i++) {
				query.append(_ORDER_BY_ENTITY_ALIAS);
				query.append(orderByFields[i]);

				if ((i + 1) < orderByFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(ORDER_BY_ASC_HAS_NEXT);
					}
					else {
						query.append(ORDER_BY_DESC_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(ORDER_BY_ASC);
					}
					else {
						query.append(ORDER_BY_DESC);
					}
				}
			}
		}

		else {
			query.append(VLegalDocumentModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		if (language != null) {
			qPos.add(language);
		}

		if (orgId != null) {
			qPos.add(orgId);
		}

		qPos.add(statusDoc);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByValues(vLegalDocument);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<VLegalDocument> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Finds all the v legal documents where groupId = &#63; and language = &#63; and typeDocId = &#63;.
	 *
	 * @param groupId the group id to search with
	 * @param language the language to search with
	 * @param typeDocId the type doc id to search with
	 * @return the matching v legal documents
	 * @throws SystemException if a system exception occurred
	 */
	public List<VLegalDocument> findByG_L_T(long groupId, String language,
		String typeDocId) throws SystemException {
		return findByG_L_T(groupId, language, typeDocId, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Finds a range of all the v legal documents where groupId = &#63; and language = &#63; and typeDocId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param groupId the group id to search with
	 * @param language the language to search with
	 * @param typeDocId the type doc id to search with
	 * @param start the lower bound of the range of v legal documents to return
	 * @param end the upper bound of the range of v legal documents to return (not inclusive)
	 * @return the range of matching v legal documents
	 * @throws SystemException if a system exception occurred
	 */
	public List<VLegalDocument> findByG_L_T(long groupId, String language,
		String typeDocId, int start, int end) throws SystemException {
		return findByG_L_T(groupId, language, typeDocId, start, end, null);
	}

	/**
	 * Finds an ordered range of all the v legal documents where groupId = &#63; and language = &#63; and typeDocId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param groupId the group id to search with
	 * @param language the language to search with
	 * @param typeDocId the type doc id to search with
	 * @param start the lower bound of the range of v legal documents to return
	 * @param end the upper bound of the range of v legal documents to return (not inclusive)
	 * @param orderByComparator the comparator to order the results by
	 * @return the ordered range of matching v legal documents
	 * @throws SystemException if a system exception occurred
	 */
	public List<VLegalDocument> findByG_L_T(long groupId, String language,
		String typeDocId, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		Object[] finderArgs = new Object[] {
				groupId, language, typeDocId,
				
				String.valueOf(start), String.valueOf(end),
				String.valueOf(orderByComparator)
			};

		List<VLegalDocument> list = (List<VLegalDocument>)FinderCacheUtil.getResult(FINDER_PATH_FIND_BY_G_L_T,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;

			if (orderByComparator != null) {
				query = new StringBundler(5 +
						(orderByComparator.getOrderByFields().length * 3));
			}
			else {
				query = new StringBundler(5);
			}

			query.append(_SQL_SELECT_VLEGALDOCUMENT_WHERE);

			query.append(_FINDER_COLUMN_G_L_T_GROUPID_2);

			if (language == null) {
				query.append(_FINDER_COLUMN_G_L_T_LANGUAGE_1);
			}
			else {
				if (language.equals(StringPool.BLANK)) {
					query.append(_FINDER_COLUMN_G_L_T_LANGUAGE_3);
				}
				else {
					query.append(_FINDER_COLUMN_G_L_T_LANGUAGE_2);
				}
			}

			if (typeDocId == null) {
				query.append(_FINDER_COLUMN_G_L_T_TYPEDOCID_1);
			}
			else {
				if (typeDocId.equals(StringPool.BLANK)) {
					query.append(_FINDER_COLUMN_G_L_T_TYPEDOCID_3);
				}
				else {
					query.append(_FINDER_COLUMN_G_L_T_TYPEDOCID_2);
				}
			}

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}

			else {
				query.append(VLegalDocumentModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(groupId);

				if (language != null) {
					qPos.add(language);
				}

				if (typeDocId != null) {
					qPos.add(typeDocId);
				}

				list = (List<VLegalDocument>)QueryUtil.list(q, getDialect(),
						start, end);
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (list == null) {
					FinderCacheUtil.removeResult(FINDER_PATH_FIND_BY_G_L_T,
						finderArgs);
				}
				else {
					cacheResult(list);

					FinderCacheUtil.putResult(FINDER_PATH_FIND_BY_G_L_T,
						finderArgs, list);
				}

				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Finds the first v legal document in the ordered set where groupId = &#63; and language = &#63; and typeDocId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param groupId the group id to search with
	 * @param language the language to search with
	 * @param typeDocId the type doc id to search with
	 * @param orderByComparator the comparator to order the set by
	 * @return the first matching v legal document
	 * @throws com.vportal.portlet.vlegal.NoSuchVLegalDocumentException if a matching v legal document could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public VLegalDocument findByG_L_T_First(long groupId, String language,
		String typeDocId, OrderByComparator orderByComparator)
		throws NoSuchVLegalDocumentException, SystemException {
		List<VLegalDocument> list = findByG_L_T(groupId, language, typeDocId,
				0, 1, orderByComparator);

		if (list.isEmpty()) {
			StringBundler msg = new StringBundler(8);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("groupId=");
			msg.append(groupId);

			msg.append(", language=");
			msg.append(language);

			msg.append(", typeDocId=");
			msg.append(typeDocId);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			throw new NoSuchVLegalDocumentException(msg.toString());
		}
		else {
			return list.get(0);
		}
	}

	/**
	 * Finds the last v legal document in the ordered set where groupId = &#63; and language = &#63; and typeDocId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param groupId the group id to search with
	 * @param language the language to search with
	 * @param typeDocId the type doc id to search with
	 * @param orderByComparator the comparator to order the set by
	 * @return the last matching v legal document
	 * @throws com.vportal.portlet.vlegal.NoSuchVLegalDocumentException if a matching v legal document could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public VLegalDocument findByG_L_T_Last(long groupId, String language,
		String typeDocId, OrderByComparator orderByComparator)
		throws NoSuchVLegalDocumentException, SystemException {
		int count = countByG_L_T(groupId, language, typeDocId);

		List<VLegalDocument> list = findByG_L_T(groupId, language, typeDocId,
				count - 1, count, orderByComparator);

		if (list.isEmpty()) {
			StringBundler msg = new StringBundler(8);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("groupId=");
			msg.append(groupId);

			msg.append(", language=");
			msg.append(language);

			msg.append(", typeDocId=");
			msg.append(typeDocId);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			throw new NoSuchVLegalDocumentException(msg.toString());
		}
		else {
			return list.get(0);
		}
	}

	/**
	 * Finds the v legal documents before and after the current v legal document in the ordered set where groupId = &#63; and language = &#63; and typeDocId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param docId the primary key of the current v legal document
	 * @param groupId the group id to search with
	 * @param language the language to search with
	 * @param typeDocId the type doc id to search with
	 * @param orderByComparator the comparator to order the set by
	 * @return the previous, current, and next v legal document
	 * @throws com.vportal.portlet.vlegal.NoSuchVLegalDocumentException if a v legal document with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public VLegalDocument[] findByG_L_T_PrevAndNext(String docId, long groupId,
		String language, String typeDocId, OrderByComparator orderByComparator)
		throws NoSuchVLegalDocumentException, SystemException {
		VLegalDocument vLegalDocument = findByPrimaryKey(docId);

		Session session = null;

		try {
			session = openSession();

			VLegalDocument[] array = new VLegalDocumentImpl[3];

			array[0] = getByG_L_T_PrevAndNext(session, vLegalDocument, groupId,
					language, typeDocId, orderByComparator, true);

			array[1] = vLegalDocument;

			array[2] = getByG_L_T_PrevAndNext(session, vLegalDocument, groupId,
					language, typeDocId, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected VLegalDocument getByG_L_T_PrevAndNext(Session session,
		VLegalDocument vLegalDocument, long groupId, String language,
		String typeDocId, OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_VLEGALDOCUMENT_WHERE);

		query.append(_FINDER_COLUMN_G_L_T_GROUPID_2);

		if (language == null) {
			query.append(_FINDER_COLUMN_G_L_T_LANGUAGE_1);
		}
		else {
			if (language.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_G_L_T_LANGUAGE_3);
			}
			else {
				query.append(_FINDER_COLUMN_G_L_T_LANGUAGE_2);
			}
		}

		if (typeDocId == null) {
			query.append(_FINDER_COLUMN_G_L_T_TYPEDOCID_1);
		}
		else {
			if (typeDocId.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_G_L_T_TYPEDOCID_3);
			}
			else {
				query.append(_FINDER_COLUMN_G_L_T_TYPEDOCID_2);
			}
		}

		if (orderByComparator != null) {
			String[] orderByFields = orderByComparator.getOrderByFields();

			if (orderByFields.length > 0) {
				query.append(WHERE_AND);
			}

			for (int i = 0; i < orderByFields.length; i++) {
				query.append(_ORDER_BY_ENTITY_ALIAS);
				query.append(orderByFields[i]);

				if ((i + 1) < orderByFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(WHERE_GREATER_THAN_HAS_NEXT);
					}
					else {
						query.append(WHERE_LESSER_THAN_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(WHERE_GREATER_THAN);
					}
					else {
						query.append(WHERE_LESSER_THAN);
					}
				}
			}

			query.append(ORDER_BY_CLAUSE);

			for (int i = 0; i < orderByFields.length; i++) {
				query.append(_ORDER_BY_ENTITY_ALIAS);
				query.append(orderByFields[i]);

				if ((i + 1) < orderByFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(ORDER_BY_ASC_HAS_NEXT);
					}
					else {
						query.append(ORDER_BY_DESC_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(ORDER_BY_ASC);
					}
					else {
						query.append(ORDER_BY_DESC);
					}
				}
			}
		}

		else {
			query.append(VLegalDocumentModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(groupId);

		if (language != null) {
			qPos.add(language);
		}

		if (typeDocId != null) {
			qPos.add(typeDocId);
		}

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByValues(vLegalDocument);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<VLegalDocument> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Finds all the v legal documents where groupId = &#63; and language = &#63; and fieldId = &#63;.
	 *
	 * @param groupId the group id to search with
	 * @param language the language to search with
	 * @param fieldId the field id to search with
	 * @return the matching v legal documents
	 * @throws SystemException if a system exception occurred
	 */
	public List<VLegalDocument> findByG_L_F(long groupId, String language,
		String fieldId) throws SystemException {
		return findByG_L_F(groupId, language, fieldId, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Finds a range of all the v legal documents where groupId = &#63; and language = &#63; and fieldId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param groupId the group id to search with
	 * @param language the language to search with
	 * @param fieldId the field id to search with
	 * @param start the lower bound of the range of v legal documents to return
	 * @param end the upper bound of the range of v legal documents to return (not inclusive)
	 * @return the range of matching v legal documents
	 * @throws SystemException if a system exception occurred
	 */
	public List<VLegalDocument> findByG_L_F(long groupId, String language,
		String fieldId, int start, int end) throws SystemException {
		return findByG_L_F(groupId, language, fieldId, start, end, null);
	}

	/**
	 * Finds an ordered range of all the v legal documents where groupId = &#63; and language = &#63; and fieldId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param groupId the group id to search with
	 * @param language the language to search with
	 * @param fieldId the field id to search with
	 * @param start the lower bound of the range of v legal documents to return
	 * @param end the upper bound of the range of v legal documents to return (not inclusive)
	 * @param orderByComparator the comparator to order the results by
	 * @return the ordered range of matching v legal documents
	 * @throws SystemException if a system exception occurred
	 */
	public List<VLegalDocument> findByG_L_F(long groupId, String language,
		String fieldId, int start, int end, OrderByComparator orderByComparator)
		throws SystemException {
		Object[] finderArgs = new Object[] {
				groupId, language, fieldId,
				
				String.valueOf(start), String.valueOf(end),
				String.valueOf(orderByComparator)
			};

		List<VLegalDocument> list = (List<VLegalDocument>)FinderCacheUtil.getResult(FINDER_PATH_FIND_BY_G_L_F,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;

			if (orderByComparator != null) {
				query = new StringBundler(5 +
						(orderByComparator.getOrderByFields().length * 3));
			}
			else {
				query = new StringBundler(5);
			}

			query.append(_SQL_SELECT_VLEGALDOCUMENT_WHERE);

			query.append(_FINDER_COLUMN_G_L_F_GROUPID_2);

			if (language == null) {
				query.append(_FINDER_COLUMN_G_L_F_LANGUAGE_1);
			}
			else {
				if (language.equals(StringPool.BLANK)) {
					query.append(_FINDER_COLUMN_G_L_F_LANGUAGE_3);
				}
				else {
					query.append(_FINDER_COLUMN_G_L_F_LANGUAGE_2);
				}
			}

			if (fieldId == null) {
				query.append(_FINDER_COLUMN_G_L_F_FIELDID_1);
			}
			else {
				if (fieldId.equals(StringPool.BLANK)) {
					query.append(_FINDER_COLUMN_G_L_F_FIELDID_3);
				}
				else {
					query.append(_FINDER_COLUMN_G_L_F_FIELDID_2);
				}
			}

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}

			else {
				query.append(VLegalDocumentModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(groupId);

				if (language != null) {
					qPos.add(language);
				}

				if (fieldId != null) {
					qPos.add(fieldId);
				}

				list = (List<VLegalDocument>)QueryUtil.list(q, getDialect(),
						start, end);
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (list == null) {
					FinderCacheUtil.removeResult(FINDER_PATH_FIND_BY_G_L_F,
						finderArgs);
				}
				else {
					cacheResult(list);

					FinderCacheUtil.putResult(FINDER_PATH_FIND_BY_G_L_F,
						finderArgs, list);
				}

				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Finds the first v legal document in the ordered set where groupId = &#63; and language = &#63; and fieldId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param groupId the group id to search with
	 * @param language the language to search with
	 * @param fieldId the field id to search with
	 * @param orderByComparator the comparator to order the set by
	 * @return the first matching v legal document
	 * @throws com.vportal.portlet.vlegal.NoSuchVLegalDocumentException if a matching v legal document could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public VLegalDocument findByG_L_F_First(long groupId, String language,
		String fieldId, OrderByComparator orderByComparator)
		throws NoSuchVLegalDocumentException, SystemException {
		List<VLegalDocument> list = findByG_L_F(groupId, language, fieldId, 0,
				1, orderByComparator);

		if (list.isEmpty()) {
			StringBundler msg = new StringBundler(8);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("groupId=");
			msg.append(groupId);

			msg.append(", language=");
			msg.append(language);

			msg.append(", fieldId=");
			msg.append(fieldId);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			throw new NoSuchVLegalDocumentException(msg.toString());
		}
		else {
			return list.get(0);
		}
	}

	/**
	 * Finds the last v legal document in the ordered set where groupId = &#63; and language = &#63; and fieldId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param groupId the group id to search with
	 * @param language the language to search with
	 * @param fieldId the field id to search with
	 * @param orderByComparator the comparator to order the set by
	 * @return the last matching v legal document
	 * @throws com.vportal.portlet.vlegal.NoSuchVLegalDocumentException if a matching v legal document could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public VLegalDocument findByG_L_F_Last(long groupId, String language,
		String fieldId, OrderByComparator orderByComparator)
		throws NoSuchVLegalDocumentException, SystemException {
		int count = countByG_L_F(groupId, language, fieldId);

		List<VLegalDocument> list = findByG_L_F(groupId, language, fieldId,
				count - 1, count, orderByComparator);

		if (list.isEmpty()) {
			StringBundler msg = new StringBundler(8);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("groupId=");
			msg.append(groupId);

			msg.append(", language=");
			msg.append(language);

			msg.append(", fieldId=");
			msg.append(fieldId);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			throw new NoSuchVLegalDocumentException(msg.toString());
		}
		else {
			return list.get(0);
		}
	}

	/**
	 * Finds the v legal documents before and after the current v legal document in the ordered set where groupId = &#63; and language = &#63; and fieldId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param docId the primary key of the current v legal document
	 * @param groupId the group id to search with
	 * @param language the language to search with
	 * @param fieldId the field id to search with
	 * @param orderByComparator the comparator to order the set by
	 * @return the previous, current, and next v legal document
	 * @throws com.vportal.portlet.vlegal.NoSuchVLegalDocumentException if a v legal document with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public VLegalDocument[] findByG_L_F_PrevAndNext(String docId, long groupId,
		String language, String fieldId, OrderByComparator orderByComparator)
		throws NoSuchVLegalDocumentException, SystemException {
		VLegalDocument vLegalDocument = findByPrimaryKey(docId);

		Session session = null;

		try {
			session = openSession();

			VLegalDocument[] array = new VLegalDocumentImpl[3];

			array[0] = getByG_L_F_PrevAndNext(session, vLegalDocument, groupId,
					language, fieldId, orderByComparator, true);

			array[1] = vLegalDocument;

			array[2] = getByG_L_F_PrevAndNext(session, vLegalDocument, groupId,
					language, fieldId, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected VLegalDocument getByG_L_F_PrevAndNext(Session session,
		VLegalDocument vLegalDocument, long groupId, String language,
		String fieldId, OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_VLEGALDOCUMENT_WHERE);

		query.append(_FINDER_COLUMN_G_L_F_GROUPID_2);

		if (language == null) {
			query.append(_FINDER_COLUMN_G_L_F_LANGUAGE_1);
		}
		else {
			if (language.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_G_L_F_LANGUAGE_3);
			}
			else {
				query.append(_FINDER_COLUMN_G_L_F_LANGUAGE_2);
			}
		}

		if (fieldId == null) {
			query.append(_FINDER_COLUMN_G_L_F_FIELDID_1);
		}
		else {
			if (fieldId.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_G_L_F_FIELDID_3);
			}
			else {
				query.append(_FINDER_COLUMN_G_L_F_FIELDID_2);
			}
		}

		if (orderByComparator != null) {
			String[] orderByFields = orderByComparator.getOrderByFields();

			if (orderByFields.length > 0) {
				query.append(WHERE_AND);
			}

			for (int i = 0; i < orderByFields.length; i++) {
				query.append(_ORDER_BY_ENTITY_ALIAS);
				query.append(orderByFields[i]);

				if ((i + 1) < orderByFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(WHERE_GREATER_THAN_HAS_NEXT);
					}
					else {
						query.append(WHERE_LESSER_THAN_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(WHERE_GREATER_THAN);
					}
					else {
						query.append(WHERE_LESSER_THAN);
					}
				}
			}

			query.append(ORDER_BY_CLAUSE);

			for (int i = 0; i < orderByFields.length; i++) {
				query.append(_ORDER_BY_ENTITY_ALIAS);
				query.append(orderByFields[i]);

				if ((i + 1) < orderByFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(ORDER_BY_ASC_HAS_NEXT);
					}
					else {
						query.append(ORDER_BY_DESC_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(ORDER_BY_ASC);
					}
					else {
						query.append(ORDER_BY_DESC);
					}
				}
			}
		}

		else {
			query.append(VLegalDocumentModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(groupId);

		if (language != null) {
			qPos.add(language);
		}

		if (fieldId != null) {
			qPos.add(fieldId);
		}

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByValues(vLegalDocument);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<VLegalDocument> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Finds all the v legal documents where groupId = &#63; and createdByUser = &#63; and language = &#63; and statusDoc = &#63;.
	 *
	 * @param groupId the group id to search with
	 * @param createdByUser the created by user to search with
	 * @param language the language to search with
	 * @param statusDoc the status doc to search with
	 * @return the matching v legal documents
	 * @throws SystemException if a system exception occurred
	 */
	public List<VLegalDocument> findByP_U_S(long groupId, long createdByUser,
		String language, int statusDoc) throws SystemException {
		return findByP_U_S(groupId, createdByUser, language, statusDoc,
			QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Finds a range of all the v legal documents where groupId = &#63; and createdByUser = &#63; and language = &#63; and statusDoc = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param groupId the group id to search with
	 * @param createdByUser the created by user to search with
	 * @param language the language to search with
	 * @param statusDoc the status doc to search with
	 * @param start the lower bound of the range of v legal documents to return
	 * @param end the upper bound of the range of v legal documents to return (not inclusive)
	 * @return the range of matching v legal documents
	 * @throws SystemException if a system exception occurred
	 */
	public List<VLegalDocument> findByP_U_S(long groupId, long createdByUser,
		String language, int statusDoc, int start, int end)
		throws SystemException {
		return findByP_U_S(groupId, createdByUser, language, statusDoc, start,
			end, null);
	}

	/**
	 * Finds an ordered range of all the v legal documents where groupId = &#63; and createdByUser = &#63; and language = &#63; and statusDoc = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param groupId the group id to search with
	 * @param createdByUser the created by user to search with
	 * @param language the language to search with
	 * @param statusDoc the status doc to search with
	 * @param start the lower bound of the range of v legal documents to return
	 * @param end the upper bound of the range of v legal documents to return (not inclusive)
	 * @param orderByComparator the comparator to order the results by
	 * @return the ordered range of matching v legal documents
	 * @throws SystemException if a system exception occurred
	 */
	public List<VLegalDocument> findByP_U_S(long groupId, long createdByUser,
		String language, int statusDoc, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		Object[] finderArgs = new Object[] {
				groupId, createdByUser, language, statusDoc,
				
				String.valueOf(start), String.valueOf(end),
				String.valueOf(orderByComparator)
			};

		List<VLegalDocument> list = (List<VLegalDocument>)FinderCacheUtil.getResult(FINDER_PATH_FIND_BY_P_U_S,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;

			if (orderByComparator != null) {
				query = new StringBundler(6 +
						(orderByComparator.getOrderByFields().length * 3));
			}
			else {
				query = new StringBundler(6);
			}

			query.append(_SQL_SELECT_VLEGALDOCUMENT_WHERE);

			query.append(_FINDER_COLUMN_P_U_S_GROUPID_2);

			query.append(_FINDER_COLUMN_P_U_S_CREATEDBYUSER_2);

			if (language == null) {
				query.append(_FINDER_COLUMN_P_U_S_LANGUAGE_1);
			}
			else {
				if (language.equals(StringPool.BLANK)) {
					query.append(_FINDER_COLUMN_P_U_S_LANGUAGE_3);
				}
				else {
					query.append(_FINDER_COLUMN_P_U_S_LANGUAGE_2);
				}
			}

			query.append(_FINDER_COLUMN_P_U_S_STATUSDOC_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}

			else {
				query.append(VLegalDocumentModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(groupId);

				qPos.add(createdByUser);

				if (language != null) {
					qPos.add(language);
				}

				qPos.add(statusDoc);

				list = (List<VLegalDocument>)QueryUtil.list(q, getDialect(),
						start, end);
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (list == null) {
					FinderCacheUtil.removeResult(FINDER_PATH_FIND_BY_P_U_S,
						finderArgs);
				}
				else {
					cacheResult(list);

					FinderCacheUtil.putResult(FINDER_PATH_FIND_BY_P_U_S,
						finderArgs, list);
				}

				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Finds the first v legal document in the ordered set where groupId = &#63; and createdByUser = &#63; and language = &#63; and statusDoc = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param groupId the group id to search with
	 * @param createdByUser the created by user to search with
	 * @param language the language to search with
	 * @param statusDoc the status doc to search with
	 * @param orderByComparator the comparator to order the set by
	 * @return the first matching v legal document
	 * @throws com.vportal.portlet.vlegal.NoSuchVLegalDocumentException if a matching v legal document could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public VLegalDocument findByP_U_S_First(long groupId, long createdByUser,
		String language, int statusDoc, OrderByComparator orderByComparator)
		throws NoSuchVLegalDocumentException, SystemException {
		List<VLegalDocument> list = findByP_U_S(groupId, createdByUser,
				language, statusDoc, 0, 1, orderByComparator);

		if (list.isEmpty()) {
			StringBundler msg = new StringBundler(10);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("groupId=");
			msg.append(groupId);

			msg.append(", createdByUser=");
			msg.append(createdByUser);

			msg.append(", language=");
			msg.append(language);

			msg.append(", statusDoc=");
			msg.append(statusDoc);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			throw new NoSuchVLegalDocumentException(msg.toString());
		}
		else {
			return list.get(0);
		}
	}

	/**
	 * Finds the last v legal document in the ordered set where groupId = &#63; and createdByUser = &#63; and language = &#63; and statusDoc = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param groupId the group id to search with
	 * @param createdByUser the created by user to search with
	 * @param language the language to search with
	 * @param statusDoc the status doc to search with
	 * @param orderByComparator the comparator to order the set by
	 * @return the last matching v legal document
	 * @throws com.vportal.portlet.vlegal.NoSuchVLegalDocumentException if a matching v legal document could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public VLegalDocument findByP_U_S_Last(long groupId, long createdByUser,
		String language, int statusDoc, OrderByComparator orderByComparator)
		throws NoSuchVLegalDocumentException, SystemException {
		int count = countByP_U_S(groupId, createdByUser, language, statusDoc);

		List<VLegalDocument> list = findByP_U_S(groupId, createdByUser,
				language, statusDoc, count - 1, count, orderByComparator);

		if (list.isEmpty()) {
			StringBundler msg = new StringBundler(10);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("groupId=");
			msg.append(groupId);

			msg.append(", createdByUser=");
			msg.append(createdByUser);

			msg.append(", language=");
			msg.append(language);

			msg.append(", statusDoc=");
			msg.append(statusDoc);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			throw new NoSuchVLegalDocumentException(msg.toString());
		}
		else {
			return list.get(0);
		}
	}

	/**
	 * Finds the v legal documents before and after the current v legal document in the ordered set where groupId = &#63; and createdByUser = &#63; and language = &#63; and statusDoc = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param docId the primary key of the current v legal document
	 * @param groupId the group id to search with
	 * @param createdByUser the created by user to search with
	 * @param language the language to search with
	 * @param statusDoc the status doc to search with
	 * @param orderByComparator the comparator to order the set by
	 * @return the previous, current, and next v legal document
	 * @throws com.vportal.portlet.vlegal.NoSuchVLegalDocumentException if a v legal document with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public VLegalDocument[] findByP_U_S_PrevAndNext(String docId, long groupId,
		long createdByUser, String language, int statusDoc,
		OrderByComparator orderByComparator)
		throws NoSuchVLegalDocumentException, SystemException {
		VLegalDocument vLegalDocument = findByPrimaryKey(docId);

		Session session = null;

		try {
			session = openSession();

			VLegalDocument[] array = new VLegalDocumentImpl[3];

			array[0] = getByP_U_S_PrevAndNext(session, vLegalDocument, groupId,
					createdByUser, language, statusDoc, orderByComparator, true);

			array[1] = vLegalDocument;

			array[2] = getByP_U_S_PrevAndNext(session, vLegalDocument, groupId,
					createdByUser, language, statusDoc, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected VLegalDocument getByP_U_S_PrevAndNext(Session session,
		VLegalDocument vLegalDocument, long groupId, long createdByUser,
		String language, int statusDoc, OrderByComparator orderByComparator,
		boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_VLEGALDOCUMENT_WHERE);

		query.append(_FINDER_COLUMN_P_U_S_GROUPID_2);

		query.append(_FINDER_COLUMN_P_U_S_CREATEDBYUSER_2);

		if (language == null) {
			query.append(_FINDER_COLUMN_P_U_S_LANGUAGE_1);
		}
		else {
			if (language.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_P_U_S_LANGUAGE_3);
			}
			else {
				query.append(_FINDER_COLUMN_P_U_S_LANGUAGE_2);
			}
		}

		query.append(_FINDER_COLUMN_P_U_S_STATUSDOC_2);

		if (orderByComparator != null) {
			String[] orderByFields = orderByComparator.getOrderByFields();

			if (orderByFields.length > 0) {
				query.append(WHERE_AND);
			}

			for (int i = 0; i < orderByFields.length; i++) {
				query.append(_ORDER_BY_ENTITY_ALIAS);
				query.append(orderByFields[i]);

				if ((i + 1) < orderByFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(WHERE_GREATER_THAN_HAS_NEXT);
					}
					else {
						query.append(WHERE_LESSER_THAN_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(WHERE_GREATER_THAN);
					}
					else {
						query.append(WHERE_LESSER_THAN);
					}
				}
			}

			query.append(ORDER_BY_CLAUSE);

			for (int i = 0; i < orderByFields.length; i++) {
				query.append(_ORDER_BY_ENTITY_ALIAS);
				query.append(orderByFields[i]);

				if ((i + 1) < orderByFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(ORDER_BY_ASC_HAS_NEXT);
					}
					else {
						query.append(ORDER_BY_DESC_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(ORDER_BY_ASC);
					}
					else {
						query.append(ORDER_BY_DESC);
					}
				}
			}
		}

		else {
			query.append(VLegalDocumentModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(groupId);

		qPos.add(createdByUser);

		if (language != null) {
			qPos.add(language);
		}

		qPos.add(statusDoc);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByValues(vLegalDocument);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<VLegalDocument> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Finds all the v legal documents where statusDoc = &#63;.
	 *
	 * @param statusDoc the status doc to search with
	 * @return the matching v legal documents
	 * @throws SystemException if a system exception occurred
	 */
	public List<VLegalDocument> findByStatus(int statusDoc)
		throws SystemException {
		return findByStatus(statusDoc, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
			null);
	}

	/**
	 * Finds a range of all the v legal documents where statusDoc = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param statusDoc the status doc to search with
	 * @param start the lower bound of the range of v legal documents to return
	 * @param end the upper bound of the range of v legal documents to return (not inclusive)
	 * @return the range of matching v legal documents
	 * @throws SystemException if a system exception occurred
	 */
	public List<VLegalDocument> findByStatus(int statusDoc, int start, int end)
		throws SystemException {
		return findByStatus(statusDoc, start, end, null);
	}

	/**
	 * Finds an ordered range of all the v legal documents where statusDoc = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param statusDoc the status doc to search with
	 * @param start the lower bound of the range of v legal documents to return
	 * @param end the upper bound of the range of v legal documents to return (not inclusive)
	 * @param orderByComparator the comparator to order the results by
	 * @return the ordered range of matching v legal documents
	 * @throws SystemException if a system exception occurred
	 */
	public List<VLegalDocument> findByStatus(int statusDoc, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		Object[] finderArgs = new Object[] {
				statusDoc,
				
				String.valueOf(start), String.valueOf(end),
				String.valueOf(orderByComparator)
			};

		List<VLegalDocument> list = (List<VLegalDocument>)FinderCacheUtil.getResult(FINDER_PATH_FIND_BY_STATUS,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;

			if (orderByComparator != null) {
				query = new StringBundler(3 +
						(orderByComparator.getOrderByFields().length * 3));
			}
			else {
				query = new StringBundler(3);
			}

			query.append(_SQL_SELECT_VLEGALDOCUMENT_WHERE);

			query.append(_FINDER_COLUMN_STATUS_STATUSDOC_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}

			else {
				query.append(VLegalDocumentModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(statusDoc);

				list = (List<VLegalDocument>)QueryUtil.list(q, getDialect(),
						start, end);
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (list == null) {
					FinderCacheUtil.removeResult(FINDER_PATH_FIND_BY_STATUS,
						finderArgs);
				}
				else {
					cacheResult(list);

					FinderCacheUtil.putResult(FINDER_PATH_FIND_BY_STATUS,
						finderArgs, list);
				}

				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Finds the first v legal document in the ordered set where statusDoc = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param statusDoc the status doc to search with
	 * @param orderByComparator the comparator to order the set by
	 * @return the first matching v legal document
	 * @throws com.vportal.portlet.vlegal.NoSuchVLegalDocumentException if a matching v legal document could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public VLegalDocument findByStatus_First(int statusDoc,
		OrderByComparator orderByComparator)
		throws NoSuchVLegalDocumentException, SystemException {
		List<VLegalDocument> list = findByStatus(statusDoc, 0, 1,
				orderByComparator);

		if (list.isEmpty()) {
			StringBundler msg = new StringBundler(4);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("statusDoc=");
			msg.append(statusDoc);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			throw new NoSuchVLegalDocumentException(msg.toString());
		}
		else {
			return list.get(0);
		}
	}

	/**
	 * Finds the last v legal document in the ordered set where statusDoc = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param statusDoc the status doc to search with
	 * @param orderByComparator the comparator to order the set by
	 * @return the last matching v legal document
	 * @throws com.vportal.portlet.vlegal.NoSuchVLegalDocumentException if a matching v legal document could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public VLegalDocument findByStatus_Last(int statusDoc,
		OrderByComparator orderByComparator)
		throws NoSuchVLegalDocumentException, SystemException {
		int count = countByStatus(statusDoc);

		List<VLegalDocument> list = findByStatus(statusDoc, count - 1, count,
				orderByComparator);

		if (list.isEmpty()) {
			StringBundler msg = new StringBundler(4);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("statusDoc=");
			msg.append(statusDoc);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			throw new NoSuchVLegalDocumentException(msg.toString());
		}
		else {
			return list.get(0);
		}
	}

	/**
	 * Finds the v legal documents before and after the current v legal document in the ordered set where statusDoc = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param docId the primary key of the current v legal document
	 * @param statusDoc the status doc to search with
	 * @param orderByComparator the comparator to order the set by
	 * @return the previous, current, and next v legal document
	 * @throws com.vportal.portlet.vlegal.NoSuchVLegalDocumentException if a v legal document with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public VLegalDocument[] findByStatus_PrevAndNext(String docId,
		int statusDoc, OrderByComparator orderByComparator)
		throws NoSuchVLegalDocumentException, SystemException {
		VLegalDocument vLegalDocument = findByPrimaryKey(docId);

		Session session = null;

		try {
			session = openSession();

			VLegalDocument[] array = new VLegalDocumentImpl[3];

			array[0] = getByStatus_PrevAndNext(session, vLegalDocument,
					statusDoc, orderByComparator, true);

			array[1] = vLegalDocument;

			array[2] = getByStatus_PrevAndNext(session, vLegalDocument,
					statusDoc, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected VLegalDocument getByStatus_PrevAndNext(Session session,
		VLegalDocument vLegalDocument, int statusDoc,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_VLEGALDOCUMENT_WHERE);

		query.append(_FINDER_COLUMN_STATUS_STATUSDOC_2);

		if (orderByComparator != null) {
			String[] orderByFields = orderByComparator.getOrderByFields();

			if (orderByFields.length > 0) {
				query.append(WHERE_AND);
			}

			for (int i = 0; i < orderByFields.length; i++) {
				query.append(_ORDER_BY_ENTITY_ALIAS);
				query.append(orderByFields[i]);

				if ((i + 1) < orderByFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(WHERE_GREATER_THAN_HAS_NEXT);
					}
					else {
						query.append(WHERE_LESSER_THAN_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(WHERE_GREATER_THAN);
					}
					else {
						query.append(WHERE_LESSER_THAN);
					}
				}
			}

			query.append(ORDER_BY_CLAUSE);

			for (int i = 0; i < orderByFields.length; i++) {
				query.append(_ORDER_BY_ENTITY_ALIAS);
				query.append(orderByFields[i]);

				if ((i + 1) < orderByFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(ORDER_BY_ASC_HAS_NEXT);
					}
					else {
						query.append(ORDER_BY_DESC_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(ORDER_BY_ASC);
					}
					else {
						query.append(ORDER_BY_DESC);
					}
				}
			}
		}

		else {
			query.append(VLegalDocumentModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(statusDoc);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByValues(vLegalDocument);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<VLegalDocument> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Finds all the v legal documents where language = &#63; and statusDoc = &#63;.
	 *
	 * @param language the language to search with
	 * @param statusDoc the status doc to search with
	 * @return the matching v legal documents
	 * @throws SystemException if a system exception occurred
	 */
	public List<VLegalDocument> findByL_S(String language, int statusDoc)
		throws SystemException {
		return findByL_S(language, statusDoc, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Finds a range of all the v legal documents where language = &#63; and statusDoc = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param language the language to search with
	 * @param statusDoc the status doc to search with
	 * @param start the lower bound of the range of v legal documents to return
	 * @param end the upper bound of the range of v legal documents to return (not inclusive)
	 * @return the range of matching v legal documents
	 * @throws SystemException if a system exception occurred
	 */
	public List<VLegalDocument> findByL_S(String language, int statusDoc,
		int start, int end) throws SystemException {
		return findByL_S(language, statusDoc, start, end, null);
	}

	/**
	 * Finds an ordered range of all the v legal documents where language = &#63; and statusDoc = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param language the language to search with
	 * @param statusDoc the status doc to search with
	 * @param start the lower bound of the range of v legal documents to return
	 * @param end the upper bound of the range of v legal documents to return (not inclusive)
	 * @param orderByComparator the comparator to order the results by
	 * @return the ordered range of matching v legal documents
	 * @throws SystemException if a system exception occurred
	 */
	public List<VLegalDocument> findByL_S(String language, int statusDoc,
		int start, int end, OrderByComparator orderByComparator)
		throws SystemException {
		Object[] finderArgs = new Object[] {
				language, statusDoc,
				
				String.valueOf(start), String.valueOf(end),
				String.valueOf(orderByComparator)
			};

		List<VLegalDocument> list = (List<VLegalDocument>)FinderCacheUtil.getResult(FINDER_PATH_FIND_BY_L_S,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;

			if (orderByComparator != null) {
				query = new StringBundler(4 +
						(orderByComparator.getOrderByFields().length * 3));
			}
			else {
				query = new StringBundler(4);
			}

			query.append(_SQL_SELECT_VLEGALDOCUMENT_WHERE);

			if (language == null) {
				query.append(_FINDER_COLUMN_L_S_LANGUAGE_1);
			}
			else {
				if (language.equals(StringPool.BLANK)) {
					query.append(_FINDER_COLUMN_L_S_LANGUAGE_3);
				}
				else {
					query.append(_FINDER_COLUMN_L_S_LANGUAGE_2);
				}
			}

			query.append(_FINDER_COLUMN_L_S_STATUSDOC_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}

			else {
				query.append(VLegalDocumentModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (language != null) {
					qPos.add(language);
				}

				qPos.add(statusDoc);

				list = (List<VLegalDocument>)QueryUtil.list(q, getDialect(),
						start, end);
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (list == null) {
					FinderCacheUtil.removeResult(FINDER_PATH_FIND_BY_L_S,
						finderArgs);
				}
				else {
					cacheResult(list);

					FinderCacheUtil.putResult(FINDER_PATH_FIND_BY_L_S,
						finderArgs, list);
				}

				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Finds the first v legal document in the ordered set where language = &#63; and statusDoc = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param language the language to search with
	 * @param statusDoc the status doc to search with
	 * @param orderByComparator the comparator to order the set by
	 * @return the first matching v legal document
	 * @throws com.vportal.portlet.vlegal.NoSuchVLegalDocumentException if a matching v legal document could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public VLegalDocument findByL_S_First(String language, int statusDoc,
		OrderByComparator orderByComparator)
		throws NoSuchVLegalDocumentException, SystemException {
		List<VLegalDocument> list = findByL_S(language, statusDoc, 0, 1,
				orderByComparator);

		if (list.isEmpty()) {
			StringBundler msg = new StringBundler(6);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("language=");
			msg.append(language);

			msg.append(", statusDoc=");
			msg.append(statusDoc);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			throw new NoSuchVLegalDocumentException(msg.toString());
		}
		else {
			return list.get(0);
		}
	}

	/**
	 * Finds the last v legal document in the ordered set where language = &#63; and statusDoc = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param language the language to search with
	 * @param statusDoc the status doc to search with
	 * @param orderByComparator the comparator to order the set by
	 * @return the last matching v legal document
	 * @throws com.vportal.portlet.vlegal.NoSuchVLegalDocumentException if a matching v legal document could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public VLegalDocument findByL_S_Last(String language, int statusDoc,
		OrderByComparator orderByComparator)
		throws NoSuchVLegalDocumentException, SystemException {
		int count = countByL_S(language, statusDoc);

		List<VLegalDocument> list = findByL_S(language, statusDoc, count - 1,
				count, orderByComparator);

		if (list.isEmpty()) {
			StringBundler msg = new StringBundler(6);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("language=");
			msg.append(language);

			msg.append(", statusDoc=");
			msg.append(statusDoc);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			throw new NoSuchVLegalDocumentException(msg.toString());
		}
		else {
			return list.get(0);
		}
	}

	/**
	 * Finds the v legal documents before and after the current v legal document in the ordered set where language = &#63; and statusDoc = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param docId the primary key of the current v legal document
	 * @param language the language to search with
	 * @param statusDoc the status doc to search with
	 * @param orderByComparator the comparator to order the set by
	 * @return the previous, current, and next v legal document
	 * @throws com.vportal.portlet.vlegal.NoSuchVLegalDocumentException if a v legal document with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public VLegalDocument[] findByL_S_PrevAndNext(String docId,
		String language, int statusDoc, OrderByComparator orderByComparator)
		throws NoSuchVLegalDocumentException, SystemException {
		VLegalDocument vLegalDocument = findByPrimaryKey(docId);

		Session session = null;

		try {
			session = openSession();

			VLegalDocument[] array = new VLegalDocumentImpl[3];

			array[0] = getByL_S_PrevAndNext(session, vLegalDocument, language,
					statusDoc, orderByComparator, true);

			array[1] = vLegalDocument;

			array[2] = getByL_S_PrevAndNext(session, vLegalDocument, language,
					statusDoc, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected VLegalDocument getByL_S_PrevAndNext(Session session,
		VLegalDocument vLegalDocument, String language, int statusDoc,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_VLEGALDOCUMENT_WHERE);

		if (language == null) {
			query.append(_FINDER_COLUMN_L_S_LANGUAGE_1);
		}
		else {
			if (language.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_L_S_LANGUAGE_3);
			}
			else {
				query.append(_FINDER_COLUMN_L_S_LANGUAGE_2);
			}
		}

		query.append(_FINDER_COLUMN_L_S_STATUSDOC_2);

		if (orderByComparator != null) {
			String[] orderByFields = orderByComparator.getOrderByFields();

			if (orderByFields.length > 0) {
				query.append(WHERE_AND);
			}

			for (int i = 0; i < orderByFields.length; i++) {
				query.append(_ORDER_BY_ENTITY_ALIAS);
				query.append(orderByFields[i]);

				if ((i + 1) < orderByFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(WHERE_GREATER_THAN_HAS_NEXT);
					}
					else {
						query.append(WHERE_LESSER_THAN_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(WHERE_GREATER_THAN);
					}
					else {
						query.append(WHERE_LESSER_THAN);
					}
				}
			}

			query.append(ORDER_BY_CLAUSE);

			for (int i = 0; i < orderByFields.length; i++) {
				query.append(_ORDER_BY_ENTITY_ALIAS);
				query.append(orderByFields[i]);

				if ((i + 1) < orderByFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(ORDER_BY_ASC_HAS_NEXT);
					}
					else {
						query.append(ORDER_BY_DESC_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(ORDER_BY_ASC);
					}
					else {
						query.append(ORDER_BY_DESC);
					}
				}
			}
		}

		else {
			query.append(VLegalDocumentModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		if (language != null) {
			qPos.add(language);
		}

		qPos.add(statusDoc);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByValues(vLegalDocument);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<VLegalDocument> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Finds all the v legal documents.
	 *
	 * @return the v legal documents
	 * @throws SystemException if a system exception occurred
	 */
	public List<VLegalDocument> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Finds a range of all the v legal documents.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param start the lower bound of the range of v legal documents to return
	 * @param end the upper bound of the range of v legal documents to return (not inclusive)
	 * @return the range of v legal documents
	 * @throws SystemException if a system exception occurred
	 */
	public List<VLegalDocument> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Finds an ordered range of all the v legal documents.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param start the lower bound of the range of v legal documents to return
	 * @param end the upper bound of the range of v legal documents to return (not inclusive)
	 * @param orderByComparator the comparator to order the results by
	 * @return the ordered range of v legal documents
	 * @throws SystemException if a system exception occurred
	 */
	public List<VLegalDocument> findAll(int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		Object[] finderArgs = new Object[] {
				String.valueOf(start), String.valueOf(end),
				String.valueOf(orderByComparator)
			};

		List<VLegalDocument> list = (List<VLegalDocument>)FinderCacheUtil.getResult(FINDER_PATH_FIND_ALL,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_VLEGALDOCUMENT);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_VLEGALDOCUMENT.concat(VLegalDocumentModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (orderByComparator == null) {
					list = (List<VLegalDocument>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);
				}
				else {
					list = (List<VLegalDocument>)QueryUtil.list(q,
							getDialect(), start, end);
				}
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (list == null) {
					FinderCacheUtil.removeResult(FINDER_PATH_FIND_ALL,
						finderArgs);
				}
				else {
					cacheResult(list);

					FinderCacheUtil.putResult(FINDER_PATH_FIND_ALL, finderArgs,
						list);
				}

				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Removes all the v legal documents where groupId = &#63; from the database.
	 *
	 * @param groupId the group id to search with
	 * @throws SystemException if a system exception occurred
	 */
	public void removeByGroupId(long groupId) throws SystemException {
		for (VLegalDocument vLegalDocument : findByGroupId(groupId)) {
			remove(vLegalDocument);
		}
	}

	/**
	 * Removes all the v legal documents where language = &#63; and promulDate = &#63; and statusDoc = &#63; from the database.
	 *
	 * @param language the language to search with
	 * @param promulDate the promul date to search with
	 * @param statusDoc the status doc to search with
	 * @throws SystemException if a system exception occurred
	 */
	public void removeByPromulDate(String language, Date promulDate,
		int statusDoc) throws SystemException {
		for (VLegalDocument vLegalDocument : findByPromulDate(language,
				promulDate, statusDoc)) {
			remove(vLegalDocument);
		}
	}

	/**
	 * Removes all the v legal documents where groupId = &#63; and language = &#63; from the database.
	 *
	 * @param groupId the group id to search with
	 * @param language the language to search with
	 * @throws SystemException if a system exception occurred
	 */
	public void removeByG_L(long groupId, String language)
		throws SystemException {
		for (VLegalDocument vLegalDocument : findByG_L(groupId, language)) {
			remove(vLegalDocument);
		}
	}

	/**
	 * Removes all the v legal documents where groupId = &#63; and typeDocId = &#63; and orgId = &#63; and fieldId = &#63; and language = &#63; and statusDoc = &#63; from the database.
	 *
	 * @param groupId the group id to search with
	 * @param typeDocId the type doc id to search with
	 * @param orgId the org id to search with
	 * @param fieldId the field id to search with
	 * @param language the language to search with
	 * @param statusDoc the status doc to search with
	 * @throws SystemException if a system exception occurred
	 */
	public void removeByDocsByF_O_T_L_S(long groupId, String typeDocId,
		String orgId, String fieldId, String language, int statusDoc)
		throws SystemException {
		for (VLegalDocument vLegalDocument : findByDocsByF_O_T_L_S(groupId,
				typeDocId, orgId, fieldId, language, statusDoc)) {
			remove(vLegalDocument);
		}
	}

	/**
	 * Removes all the v legal documents where typeDocId = &#63; and orgId = &#63; and fieldId = &#63; and language = &#63; and statusDoc = &#63; from the database.
	 *
	 * @param typeDocId the type doc id to search with
	 * @param orgId the org id to search with
	 * @param fieldId the field id to search with
	 * @param language the language to search with
	 * @param statusDoc the status doc to search with
	 * @throws SystemException if a system exception occurred
	 */
	public void removeByDocsByF_T_O_L_S(String typeDocId, String orgId,
		String fieldId, String language, int statusDoc)
		throws SystemException {
		for (VLegalDocument vLegalDocument : findByDocsByF_T_O_L_S(typeDocId,
				orgId, fieldId, language, statusDoc)) {
			remove(vLegalDocument);
		}
	}

	/**
	 * Removes all the v legal documents where companyId = &#63; and typeDocId = &#63; and orgId = &#63; and fieldId = &#63; and language = &#63; and statusDoc = &#63; from the database.
	 *
	 * @param companyId the company id to search with
	 * @param typeDocId the type doc id to search with
	 * @param orgId the org id to search with
	 * @param fieldId the field id to search with
	 * @param language the language to search with
	 * @param statusDoc the status doc to search with
	 * @throws SystemException if a system exception occurred
	 */
	public void removeByDocsByF_C_O_T_L_S(long companyId, String typeDocId,
		String orgId, String fieldId, String language, int statusDoc)
		throws SystemException {
		for (VLegalDocument vLegalDocument : findByDocsByF_C_O_T_L_S(
				companyId, typeDocId, orgId, fieldId, language, statusDoc)) {
			remove(vLegalDocument);
		}
	}

	/**
	 * Removes all the v legal documents where companyId = &#63; and typeDocId = &#63; and orgId = &#63; and fieldId = &#63; and language = &#63; and statusDoc = &#63; from the database.
	 *
	 * @param companyId the company id to search with
	 * @param typeDocId the type doc id to search with
	 * @param orgId the org id to search with
	 * @param fieldId the field id to search with
	 * @param language the language to search with
	 * @param statusDoc the status doc to search with
	 * @throws SystemException if a system exception occurred
	 */
	public void removeByDocsByC_T_O(long companyId, String typeDocId,
		String orgId, String fieldId, String language, int statusDoc)
		throws SystemException {
		for (VLegalDocument vLegalDocument : findByDocsByC_T_O(companyId,
				typeDocId, orgId, fieldId, language, statusDoc)) {
			remove(vLegalDocument);
		}
	}

	/**
	 * Removes all the v legal documents where groupId = &#63; and orgId = &#63; and typeDocId = &#63; and language = &#63; and statusDoc = &#63; from the database.
	 *
	 * @param groupId the group id to search with
	 * @param orgId the org id to search with
	 * @param typeDocId the type doc id to search with
	 * @param language the language to search with
	 * @param statusDoc the status doc to search with
	 * @throws SystemException if a system exception occurred
	 */
	public void removeByDocsByG_O_T_L_S(long groupId, String orgId,
		String typeDocId, String language, int statusDoc)
		throws SystemException {
		for (VLegalDocument vLegalDocument : findByDocsByG_O_T_L_S(groupId,
				orgId, typeDocId, language, statusDoc)) {
			remove(vLegalDocument);
		}
	}

	/**
	 * Removes all the v legal documents where language = &#63; and orgId = &#63; and fieldId = &#63; and statusDoc = &#63; from the database.
	 *
	 * @param language the language to search with
	 * @param orgId the org id to search with
	 * @param fieldId the field id to search with
	 * @param statusDoc the status doc to search with
	 * @throws SystemException if a system exception occurred
	 */
	public void removeByDocsByL_O_F_S(String language, String orgId,
		String fieldId, int statusDoc) throws SystemException {
		for (VLegalDocument vLegalDocument : findByDocsByL_O_F_S(language,
				orgId, fieldId, statusDoc)) {
			remove(vLegalDocument);
		}
	}

	/**
	 * Removes all the v legal documents where language = &#63; and typeDocId = &#63; and fieldId = &#63; and statusDoc = &#63; from the database.
	 *
	 * @param language the language to search with
	 * @param typeDocId the type doc id to search with
	 * @param fieldId the field id to search with
	 * @param statusDoc the status doc to search with
	 * @throws SystemException if a system exception occurred
	 */
	public void removeByDocsByL_T_F_S(String language, String typeDocId,
		String fieldId, int statusDoc) throws SystemException {
		for (VLegalDocument vLegalDocument : findByDocsByL_T_F_S(language,
				typeDocId, fieldId, statusDoc)) {
			remove(vLegalDocument);
		}
	}

	/**
	 * Removes all the v legal documents where typeDocId = &#63; and language = &#63; from the database.
	 *
	 * @param typeDocId the type doc id to search with
	 * @param language the language to search with
	 * @throws SystemException if a system exception occurred
	 */
	public void removeByDocsByT_L(String typeDocId, String language)
		throws SystemException {
		for (VLegalDocument vLegalDocument : findByDocsByT_L(typeDocId, language)) {
			remove(vLegalDocument);
		}
	}

	/**
	 * Removes all the v legal documents where groupId = &#63; and language = &#63; and userId = &#63; and statusDoc = &#63; from the database.
	 *
	 * @param groupId the group id to search with
	 * @param language the language to search with
	 * @param userId the user id to search with
	 * @param statusDoc the status doc to search with
	 * @throws SystemException if a system exception occurred
	 */
	public void removeByG_L_U_S(long groupId, String language, long userId,
		int statusDoc) throws SystemException {
		for (VLegalDocument vLegalDocument : findByG_L_U_S(groupId, language,
				userId, statusDoc)) {
			remove(vLegalDocument);
		}
	}

	/**
	 * Removes the v legal document where groupId = &#63; and docId = &#63; from the database.
	 *
	 * @param groupId the group id to search with
	 * @param docId the doc id to search with
	 * @throws SystemException if a system exception occurred
	 */
	public void removeByG_D(long groupId, String docId)
		throws NoSuchVLegalDocumentException, SystemException {
		VLegalDocument vLegalDocument = findByG_D(groupId, docId);

		remove(vLegalDocument);
	}

	/**
	 * Removes the v legal document where groupId = &#63; and num = &#63; and symbol = &#63; from the database.
	 *
	 * @param groupId the group id to search with
	 * @param num the num to search with
	 * @param symbol the symbol to search with
	 * @throws SystemException if a system exception occurred
	 */
	public void removeByP_N_S(long groupId, String num, String symbol)
		throws NoSuchVLegalDocumentException, SystemException {
		VLegalDocument vLegalDocument = findByP_N_S(groupId, num, symbol);

		remove(vLegalDocument);
	}

	/**
	 * Removes all the v legal documents where groupId = &#63; and language = &#63; and statusDoc = &#63; from the database.
	 *
	 * @param groupId the group id to search with
	 * @param language the language to search with
	 * @param statusDoc the status doc to search with
	 * @throws SystemException if a system exception occurred
	 */
	public void removeByP_L_S(long groupId, String language, int statusDoc)
		throws SystemException {
		for (VLegalDocument vLegalDocument : findByP_L_S(groupId, language,
				statusDoc)) {
			remove(vLegalDocument);
		}
	}

	/**
	 * Removes all the v legal documents where statusDoc = &#63; from the database.
	 *
	 * @param statusDoc the status doc to search with
	 * @throws SystemException if a system exception occurred
	 */
	public void removeBystatusDoc(int statusDoc) throws SystemException {
		for (VLegalDocument vLegalDocument : findBystatusDoc(statusDoc)) {
			remove(vLegalDocument);
		}
	}

	/**
	 * Removes all the v legal documents where groupId = &#63; and language = &#63; and orgId = &#63; and statusDoc = &#63; from the database.
	 *
	 * @param groupId the group id to search with
	 * @param language the language to search with
	 * @param orgId the org id to search with
	 * @param statusDoc the status doc to search with
	 * @throws SystemException if a system exception occurred
	 */
	public void removeByG_L_O_S(long groupId, String language, String orgId,
		int statusDoc) throws SystemException {
		for (VLegalDocument vLegalDocument : findByG_L_O_S(groupId, language,
				orgId, statusDoc)) {
			remove(vLegalDocument);
		}
	}

	/**
	 * Removes all the v legal documents where groupId = &#63; and language = &#63; and typeDocId = &#63; and statusDoc = &#63; from the database.
	 *
	 * @param groupId the group id to search with
	 * @param language the language to search with
	 * @param typeDocId the type doc id to search with
	 * @param statusDoc the status doc to search with
	 * @throws SystemException if a system exception occurred
	 */
	public void removeByG_L_T_S(long groupId, String language,
		String typeDocId, int statusDoc) throws SystemException {
		for (VLegalDocument vLegalDocument : findByG_L_T_S(groupId, language,
				typeDocId, statusDoc)) {
			remove(vLegalDocument);
		}
	}

	/**
	 * Removes all the v legal documents where language = &#63; and fieldId = &#63; and statusDoc = &#63; from the database.
	 *
	 * @param language the language to search with
	 * @param fieldId the field id to search with
	 * @param statusDoc the status doc to search with
	 * @throws SystemException if a system exception occurred
	 */
	public void removeByL_F_S(String language, String fieldId, int statusDoc)
		throws SystemException {
		for (VLegalDocument vLegalDocument : findByL_F_S(language, fieldId,
				statusDoc)) {
			remove(vLegalDocument);
		}
	}

	/**
	 * Removes all the v legal documents where groupId = &#63; and language = &#63; and fieldId = &#63; and statusDoc = &#63; from the database.
	 *
	 * @param groupId the group id to search with
	 * @param language the language to search with
	 * @param fieldId the field id to search with
	 * @param statusDoc the status doc to search with
	 * @throws SystemException if a system exception occurred
	 */
	public void removeByG_L_F_S(long groupId, String language, String fieldId,
		int statusDoc) throws SystemException {
		for (VLegalDocument vLegalDocument : findByG_L_F_S(groupId, language,
				fieldId, statusDoc)) {
			remove(vLegalDocument);
		}
	}

	/**
	 * Removes all the v legal documents where groupId = &#63; and language = &#63; and orgId = &#63; from the database.
	 *
	 * @param groupId the group id to search with
	 * @param language the language to search with
	 * @param orgId the org id to search with
	 * @throws SystemException if a system exception occurred
	 */
	public void removeByG_L_O(long groupId, String language, String orgId)
		throws SystemException {
		for (VLegalDocument vLegalDocument : findByG_L_O(groupId, language,
				orgId)) {
			remove(vLegalDocument);
		}
	}

	/**
	 * Removes all the v legal documents where language = &#63; and orgId = &#63; and statusDoc = &#63; from the database.
	 *
	 * @param language the language to search with
	 * @param orgId the org id to search with
	 * @param statusDoc the status doc to search with
	 * @throws SystemException if a system exception occurred
	 */
	public void removeByL_O(String language, String orgId, int statusDoc)
		throws SystemException {
		for (VLegalDocument vLegalDocument : findByL_O(language, orgId,
				statusDoc)) {
			remove(vLegalDocument);
		}
	}

	/**
	 * Removes all the v legal documents where groupId = &#63; and language = &#63; and typeDocId = &#63; from the database.
	 *
	 * @param groupId the group id to search with
	 * @param language the language to search with
	 * @param typeDocId the type doc id to search with
	 * @throws SystemException if a system exception occurred
	 */
	public void removeByG_L_T(long groupId, String language, String typeDocId)
		throws SystemException {
		for (VLegalDocument vLegalDocument : findByG_L_T(groupId, language,
				typeDocId)) {
			remove(vLegalDocument);
		}
	}

	/**
	 * Removes all the v legal documents where groupId = &#63; and language = &#63; and fieldId = &#63; from the database.
	 *
	 * @param groupId the group id to search with
	 * @param language the language to search with
	 * @param fieldId the field id to search with
	 * @throws SystemException if a system exception occurred
	 */
	public void removeByG_L_F(long groupId, String language, String fieldId)
		throws SystemException {
		for (VLegalDocument vLegalDocument : findByG_L_F(groupId, language,
				fieldId)) {
			remove(vLegalDocument);
		}
	}

	/**
	 * Removes all the v legal documents where groupId = &#63; and createdByUser = &#63; and language = &#63; and statusDoc = &#63; from the database.
	 *
	 * @param groupId the group id to search with
	 * @param createdByUser the created by user to search with
	 * @param language the language to search with
	 * @param statusDoc the status doc to search with
	 * @throws SystemException if a system exception occurred
	 */
	public void removeByP_U_S(long groupId, long createdByUser,
		String language, int statusDoc) throws SystemException {
		for (VLegalDocument vLegalDocument : findByP_U_S(groupId,
				createdByUser, language, statusDoc)) {
			remove(vLegalDocument);
		}
	}

	/**
	 * Removes all the v legal documents where statusDoc = &#63; from the database.
	 *
	 * @param statusDoc the status doc to search with
	 * @throws SystemException if a system exception occurred
	 */
	public void removeByStatus(int statusDoc) throws SystemException {
		for (VLegalDocument vLegalDocument : findByStatus(statusDoc)) {
			remove(vLegalDocument);
		}
	}

	/**
	 * Removes all the v legal documents where language = &#63; and statusDoc = &#63; from the database.
	 *
	 * @param language the language to search with
	 * @param statusDoc the status doc to search with
	 * @throws SystemException if a system exception occurred
	 */
	public void removeByL_S(String language, int statusDoc)
		throws SystemException {
		for (VLegalDocument vLegalDocument : findByL_S(language, statusDoc)) {
			remove(vLegalDocument);
		}
	}

	/**
	 * Removes all the v legal documents from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	public void removeAll() throws SystemException {
		for (VLegalDocument vLegalDocument : findAll()) {
			remove(vLegalDocument);
		}
	}

	/**
	 * Counts all the v legal documents where groupId = &#63;.
	 *
	 * @param groupId the group id to search with
	 * @return the number of matching v legal documents
	 * @throws SystemException if a system exception occurred
	 */
	public int countByGroupId(long groupId) throws SystemException {
		Object[] finderArgs = new Object[] { groupId };

		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_BY_GROUPID,
				finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_VLEGALDOCUMENT_WHERE);

			query.append(_FINDER_COLUMN_GROUPID_GROUPID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(groupId);

				count = (Long)q.uniqueResult();
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (count == null) {
					count = Long.valueOf(0);
				}

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_GROUPID,
					finderArgs, count);

				closeSession(session);
			}
		}

		return count.intValue();
	}

	/**
	 * Counts all the v legal documents where language = &#63; and promulDate = &#63; and statusDoc = &#63;.
	 *
	 * @param language the language to search with
	 * @param promulDate the promul date to search with
	 * @param statusDoc the status doc to search with
	 * @return the number of matching v legal documents
	 * @throws SystemException if a system exception occurred
	 */
	public int countByPromulDate(String language, Date promulDate, int statusDoc)
		throws SystemException {
		Object[] finderArgs = new Object[] { language, promulDate, statusDoc };

		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_BY_PROMULDATE,
				finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(4);

			query.append(_SQL_COUNT_VLEGALDOCUMENT_WHERE);

			if (language == null) {
				query.append(_FINDER_COLUMN_PROMULDATE_LANGUAGE_1);
			}
			else {
				if (language.equals(StringPool.BLANK)) {
					query.append(_FINDER_COLUMN_PROMULDATE_LANGUAGE_3);
				}
				else {
					query.append(_FINDER_COLUMN_PROMULDATE_LANGUAGE_2);
				}
			}

			if (promulDate == null) {
				query.append(_FINDER_COLUMN_PROMULDATE_PROMULDATE_1);
			}
			else {
				query.append(_FINDER_COLUMN_PROMULDATE_PROMULDATE_2);
			}

			query.append(_FINDER_COLUMN_PROMULDATE_STATUSDOC_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (language != null) {
					qPos.add(language);
				}

				if (promulDate != null) {
					qPos.add(CalendarUtil.getTimestamp(promulDate));
				}

				qPos.add(statusDoc);

				count = (Long)q.uniqueResult();
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (count == null) {
					count = Long.valueOf(0);
				}

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_PROMULDATE,
					finderArgs, count);

				closeSession(session);
			}
		}

		return count.intValue();
	}

	/**
	 * Counts all the v legal documents where groupId = &#63; and language = &#63;.
	 *
	 * @param groupId the group id to search with
	 * @param language the language to search with
	 * @return the number of matching v legal documents
	 * @throws SystemException if a system exception occurred
	 */
	public int countByG_L(long groupId, String language)
		throws SystemException {
		Object[] finderArgs = new Object[] { groupId, language };

		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_BY_G_L,
				finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_VLEGALDOCUMENT_WHERE);

			query.append(_FINDER_COLUMN_G_L_GROUPID_2);

			if (language == null) {
				query.append(_FINDER_COLUMN_G_L_LANGUAGE_1);
			}
			else {
				if (language.equals(StringPool.BLANK)) {
					query.append(_FINDER_COLUMN_G_L_LANGUAGE_3);
				}
				else {
					query.append(_FINDER_COLUMN_G_L_LANGUAGE_2);
				}
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(groupId);

				if (language != null) {
					qPos.add(language);
				}

				count = (Long)q.uniqueResult();
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (count == null) {
					count = Long.valueOf(0);
				}

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_G_L, finderArgs,
					count);

				closeSession(session);
			}
		}

		return count.intValue();
	}

	/**
	 * Counts all the v legal documents where groupId = &#63; and typeDocId = &#63; and orgId = &#63; and fieldId = &#63; and language = &#63; and statusDoc = &#63;.
	 *
	 * @param groupId the group id to search with
	 * @param typeDocId the type doc id to search with
	 * @param orgId the org id to search with
	 * @param fieldId the field id to search with
	 * @param language the language to search with
	 * @param statusDoc the status doc to search with
	 * @return the number of matching v legal documents
	 * @throws SystemException if a system exception occurred
	 */
	public int countByDocsByF_O_T_L_S(long groupId, String typeDocId,
		String orgId, String fieldId, String language, int statusDoc)
		throws SystemException {
		Object[] finderArgs = new Object[] {
				groupId, typeDocId, orgId, fieldId, language, statusDoc
			};

		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_BY_DOCSBYF_O_T_L_S,
				finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(7);

			query.append(_SQL_COUNT_VLEGALDOCUMENT_WHERE);

			query.append(_FINDER_COLUMN_DOCSBYF_O_T_L_S_GROUPID_2);

			if (typeDocId == null) {
				query.append(_FINDER_COLUMN_DOCSBYF_O_T_L_S_TYPEDOCID_1);
			}
			else {
				if (typeDocId.equals(StringPool.BLANK)) {
					query.append(_FINDER_COLUMN_DOCSBYF_O_T_L_S_TYPEDOCID_3);
				}
				else {
					query.append(_FINDER_COLUMN_DOCSBYF_O_T_L_S_TYPEDOCID_2);
				}
			}

			if (orgId == null) {
				query.append(_FINDER_COLUMN_DOCSBYF_O_T_L_S_ORGID_1);
			}
			else {
				if (orgId.equals(StringPool.BLANK)) {
					query.append(_FINDER_COLUMN_DOCSBYF_O_T_L_S_ORGID_3);
				}
				else {
					query.append(_FINDER_COLUMN_DOCSBYF_O_T_L_S_ORGID_2);
				}
			}

			if (fieldId == null) {
				query.append(_FINDER_COLUMN_DOCSBYF_O_T_L_S_FIELDID_1);
			}
			else {
				if (fieldId.equals(StringPool.BLANK)) {
					query.append(_FINDER_COLUMN_DOCSBYF_O_T_L_S_FIELDID_3);
				}
				else {
					query.append(_FINDER_COLUMN_DOCSBYF_O_T_L_S_FIELDID_2);
				}
			}

			if (language == null) {
				query.append(_FINDER_COLUMN_DOCSBYF_O_T_L_S_LANGUAGE_1);
			}
			else {
				if (language.equals(StringPool.BLANK)) {
					query.append(_FINDER_COLUMN_DOCSBYF_O_T_L_S_LANGUAGE_3);
				}
				else {
					query.append(_FINDER_COLUMN_DOCSBYF_O_T_L_S_LANGUAGE_2);
				}
			}

			query.append(_FINDER_COLUMN_DOCSBYF_O_T_L_S_STATUSDOC_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(groupId);

				if (typeDocId != null) {
					qPos.add(typeDocId);
				}

				if (orgId != null) {
					qPos.add(orgId);
				}

				if (fieldId != null) {
					qPos.add(fieldId);
				}

				if (language != null) {
					qPos.add(language);
				}

				qPos.add(statusDoc);

				count = (Long)q.uniqueResult();
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (count == null) {
					count = Long.valueOf(0);
				}

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_DOCSBYF_O_T_L_S,
					finderArgs, count);

				closeSession(session);
			}
		}

		return count.intValue();
	}

	/**
	 * Counts all the v legal documents where typeDocId = &#63; and orgId = &#63; and fieldId = &#63; and language = &#63; and statusDoc = &#63;.
	 *
	 * @param typeDocId the type doc id to search with
	 * @param orgId the org id to search with
	 * @param fieldId the field id to search with
	 * @param language the language to search with
	 * @param statusDoc the status doc to search with
	 * @return the number of matching v legal documents
	 * @throws SystemException if a system exception occurred
	 */
	public int countByDocsByF_T_O_L_S(String typeDocId, String orgId,
		String fieldId, String language, int statusDoc)
		throws SystemException {
		Object[] finderArgs = new Object[] {
				typeDocId, orgId, fieldId, language, statusDoc
			};

		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_BY_DOCSBYF_T_O_L_S,
				finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(6);

			query.append(_SQL_COUNT_VLEGALDOCUMENT_WHERE);

			if (typeDocId == null) {
				query.append(_FINDER_COLUMN_DOCSBYF_T_O_L_S_TYPEDOCID_1);
			}
			else {
				if (typeDocId.equals(StringPool.BLANK)) {
					query.append(_FINDER_COLUMN_DOCSBYF_T_O_L_S_TYPEDOCID_3);
				}
				else {
					query.append(_FINDER_COLUMN_DOCSBYF_T_O_L_S_TYPEDOCID_2);
				}
			}

			if (orgId == null) {
				query.append(_FINDER_COLUMN_DOCSBYF_T_O_L_S_ORGID_1);
			}
			else {
				if (orgId.equals(StringPool.BLANK)) {
					query.append(_FINDER_COLUMN_DOCSBYF_T_O_L_S_ORGID_3);
				}
				else {
					query.append(_FINDER_COLUMN_DOCSBYF_T_O_L_S_ORGID_2);
				}
			}

			if (fieldId == null) {
				query.append(_FINDER_COLUMN_DOCSBYF_T_O_L_S_FIELDID_1);
			}
			else {
				if (fieldId.equals(StringPool.BLANK)) {
					query.append(_FINDER_COLUMN_DOCSBYF_T_O_L_S_FIELDID_3);
				}
				else {
					query.append(_FINDER_COLUMN_DOCSBYF_T_O_L_S_FIELDID_2);
				}
			}

			if (language == null) {
				query.append(_FINDER_COLUMN_DOCSBYF_T_O_L_S_LANGUAGE_1);
			}
			else {
				if (language.equals(StringPool.BLANK)) {
					query.append(_FINDER_COLUMN_DOCSBYF_T_O_L_S_LANGUAGE_3);
				}
				else {
					query.append(_FINDER_COLUMN_DOCSBYF_T_O_L_S_LANGUAGE_2);
				}
			}

			query.append(_FINDER_COLUMN_DOCSBYF_T_O_L_S_STATUSDOC_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (typeDocId != null) {
					qPos.add(typeDocId);
				}

				if (orgId != null) {
					qPos.add(orgId);
				}

				if (fieldId != null) {
					qPos.add(fieldId);
				}

				if (language != null) {
					qPos.add(language);
				}

				qPos.add(statusDoc);

				count = (Long)q.uniqueResult();
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (count == null) {
					count = Long.valueOf(0);
				}

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_DOCSBYF_T_O_L_S,
					finderArgs, count);

				closeSession(session);
			}
		}

		return count.intValue();
	}

	/**
	 * Counts all the v legal documents where companyId = &#63; and typeDocId = &#63; and orgId = &#63; and fieldId = &#63; and language = &#63; and statusDoc = &#63;.
	 *
	 * @param companyId the company id to search with
	 * @param typeDocId the type doc id to search with
	 * @param orgId the org id to search with
	 * @param fieldId the field id to search with
	 * @param language the language to search with
	 * @param statusDoc the status doc to search with
	 * @return the number of matching v legal documents
	 * @throws SystemException if a system exception occurred
	 */
	public int countByDocsByF_C_O_T_L_S(long companyId, String typeDocId,
		String orgId, String fieldId, String language, int statusDoc)
		throws SystemException {
		Object[] finderArgs = new Object[] {
				companyId, typeDocId, orgId, fieldId, language, statusDoc
			};

		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_BY_DOCSBYF_C_O_T_L_S,
				finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(7);

			query.append(_SQL_COUNT_VLEGALDOCUMENT_WHERE);

			query.append(_FINDER_COLUMN_DOCSBYF_C_O_T_L_S_COMPANYID_2);

			if (typeDocId == null) {
				query.append(_FINDER_COLUMN_DOCSBYF_C_O_T_L_S_TYPEDOCID_1);
			}
			else {
				if (typeDocId.equals(StringPool.BLANK)) {
					query.append(_FINDER_COLUMN_DOCSBYF_C_O_T_L_S_TYPEDOCID_3);
				}
				else {
					query.append(_FINDER_COLUMN_DOCSBYF_C_O_T_L_S_TYPEDOCID_2);
				}
			}

			if (orgId == null) {
				query.append(_FINDER_COLUMN_DOCSBYF_C_O_T_L_S_ORGID_1);
			}
			else {
				if (orgId.equals(StringPool.BLANK)) {
					query.append(_FINDER_COLUMN_DOCSBYF_C_O_T_L_S_ORGID_3);
				}
				else {
					query.append(_FINDER_COLUMN_DOCSBYF_C_O_T_L_S_ORGID_2);
				}
			}

			if (fieldId == null) {
				query.append(_FINDER_COLUMN_DOCSBYF_C_O_T_L_S_FIELDID_1);
			}
			else {
				if (fieldId.equals(StringPool.BLANK)) {
					query.append(_FINDER_COLUMN_DOCSBYF_C_O_T_L_S_FIELDID_3);
				}
				else {
					query.append(_FINDER_COLUMN_DOCSBYF_C_O_T_L_S_FIELDID_2);
				}
			}

			if (language == null) {
				query.append(_FINDER_COLUMN_DOCSBYF_C_O_T_L_S_LANGUAGE_1);
			}
			else {
				if (language.equals(StringPool.BLANK)) {
					query.append(_FINDER_COLUMN_DOCSBYF_C_O_T_L_S_LANGUAGE_3);
				}
				else {
					query.append(_FINDER_COLUMN_DOCSBYF_C_O_T_L_S_LANGUAGE_2);
				}
			}

			query.append(_FINDER_COLUMN_DOCSBYF_C_O_T_L_S_STATUSDOC_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(companyId);

				if (typeDocId != null) {
					qPos.add(typeDocId);
				}

				if (orgId != null) {
					qPos.add(orgId);
				}

				if (fieldId != null) {
					qPos.add(fieldId);
				}

				if (language != null) {
					qPos.add(language);
				}

				qPos.add(statusDoc);

				count = (Long)q.uniqueResult();
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (count == null) {
					count = Long.valueOf(0);
				}

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_DOCSBYF_C_O_T_L_S,
					finderArgs, count);

				closeSession(session);
			}
		}

		return count.intValue();
	}

	/**
	 * Counts all the v legal documents where companyId = &#63; and typeDocId = &#63; and orgId = &#63; and fieldId = &#63; and language = &#63; and statusDoc = &#63;.
	 *
	 * @param companyId the company id to search with
	 * @param typeDocId the type doc id to search with
	 * @param orgId the org id to search with
	 * @param fieldId the field id to search with
	 * @param language the language to search with
	 * @param statusDoc the status doc to search with
	 * @return the number of matching v legal documents
	 * @throws SystemException if a system exception occurred
	 */
	public int countByDocsByC_T_O(long companyId, String typeDocId,
		String orgId, String fieldId, String language, int statusDoc)
		throws SystemException {
		Object[] finderArgs = new Object[] {
				companyId, typeDocId, orgId, fieldId, language, statusDoc
			};

		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_BY_DOCSBYC_T_O,
				finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(7);

			query.append(_SQL_COUNT_VLEGALDOCUMENT_WHERE);

			query.append(_FINDER_COLUMN_DOCSBYC_T_O_COMPANYID_2);

			if (typeDocId == null) {
				query.append(_FINDER_COLUMN_DOCSBYC_T_O_TYPEDOCID_1);
			}
			else {
				if (typeDocId.equals(StringPool.BLANK)) {
					query.append(_FINDER_COLUMN_DOCSBYC_T_O_TYPEDOCID_3);
				}
				else {
					query.append(_FINDER_COLUMN_DOCSBYC_T_O_TYPEDOCID_2);
				}
			}

			if (orgId == null) {
				query.append(_FINDER_COLUMN_DOCSBYC_T_O_ORGID_1);
			}
			else {
				if (orgId.equals(StringPool.BLANK)) {
					query.append(_FINDER_COLUMN_DOCSBYC_T_O_ORGID_3);
				}
				else {
					query.append(_FINDER_COLUMN_DOCSBYC_T_O_ORGID_2);
				}
			}

			if (fieldId == null) {
				query.append(_FINDER_COLUMN_DOCSBYC_T_O_FIELDID_1);
			}
			else {
				if (fieldId.equals(StringPool.BLANK)) {
					query.append(_FINDER_COLUMN_DOCSBYC_T_O_FIELDID_3);
				}
				else {
					query.append(_FINDER_COLUMN_DOCSBYC_T_O_FIELDID_2);
				}
			}

			if (language == null) {
				query.append(_FINDER_COLUMN_DOCSBYC_T_O_LANGUAGE_1);
			}
			else {
				if (language.equals(StringPool.BLANK)) {
					query.append(_FINDER_COLUMN_DOCSBYC_T_O_LANGUAGE_3);
				}
				else {
					query.append(_FINDER_COLUMN_DOCSBYC_T_O_LANGUAGE_2);
				}
			}

			query.append(_FINDER_COLUMN_DOCSBYC_T_O_STATUSDOC_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(companyId);

				if (typeDocId != null) {
					qPos.add(typeDocId);
				}

				if (orgId != null) {
					qPos.add(orgId);
				}

				if (fieldId != null) {
					qPos.add(fieldId);
				}

				if (language != null) {
					qPos.add(language);
				}

				qPos.add(statusDoc);

				count = (Long)q.uniqueResult();
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (count == null) {
					count = Long.valueOf(0);
				}

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_DOCSBYC_T_O,
					finderArgs, count);

				closeSession(session);
			}
		}

		return count.intValue();
	}

	/**
	 * Counts all the v legal documents where groupId = &#63; and orgId = &#63; and typeDocId = &#63; and language = &#63; and statusDoc = &#63;.
	 *
	 * @param groupId the group id to search with
	 * @param orgId the org id to search with
	 * @param typeDocId the type doc id to search with
	 * @param language the language to search with
	 * @param statusDoc the status doc to search with
	 * @return the number of matching v legal documents
	 * @throws SystemException if a system exception occurred
	 */
	public int countByDocsByG_O_T_L_S(long groupId, String orgId,
		String typeDocId, String language, int statusDoc)
		throws SystemException {
		Object[] finderArgs = new Object[] {
				groupId, orgId, typeDocId, language, statusDoc
			};

		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_BY_DOCSBYG_O_T_L_S,
				finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(6);

			query.append(_SQL_COUNT_VLEGALDOCUMENT_WHERE);

			query.append(_FINDER_COLUMN_DOCSBYG_O_T_L_S_GROUPID_2);

			if (orgId == null) {
				query.append(_FINDER_COLUMN_DOCSBYG_O_T_L_S_ORGID_1);
			}
			else {
				if (orgId.equals(StringPool.BLANK)) {
					query.append(_FINDER_COLUMN_DOCSBYG_O_T_L_S_ORGID_3);
				}
				else {
					query.append(_FINDER_COLUMN_DOCSBYG_O_T_L_S_ORGID_2);
				}
			}

			if (typeDocId == null) {
				query.append(_FINDER_COLUMN_DOCSBYG_O_T_L_S_TYPEDOCID_1);
			}
			else {
				if (typeDocId.equals(StringPool.BLANK)) {
					query.append(_FINDER_COLUMN_DOCSBYG_O_T_L_S_TYPEDOCID_3);
				}
				else {
					query.append(_FINDER_COLUMN_DOCSBYG_O_T_L_S_TYPEDOCID_2);
				}
			}

			if (language == null) {
				query.append(_FINDER_COLUMN_DOCSBYG_O_T_L_S_LANGUAGE_1);
			}
			else {
				if (language.equals(StringPool.BLANK)) {
					query.append(_FINDER_COLUMN_DOCSBYG_O_T_L_S_LANGUAGE_3);
				}
				else {
					query.append(_FINDER_COLUMN_DOCSBYG_O_T_L_S_LANGUAGE_2);
				}
			}

			query.append(_FINDER_COLUMN_DOCSBYG_O_T_L_S_STATUSDOC_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(groupId);

				if (orgId != null) {
					qPos.add(orgId);
				}

				if (typeDocId != null) {
					qPos.add(typeDocId);
				}

				if (language != null) {
					qPos.add(language);
				}

				qPos.add(statusDoc);

				count = (Long)q.uniqueResult();
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (count == null) {
					count = Long.valueOf(0);
				}

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_DOCSBYG_O_T_L_S,
					finderArgs, count);

				closeSession(session);
			}
		}

		return count.intValue();
	}

	/**
	 * Counts all the v legal documents where language = &#63; and orgId = &#63; and fieldId = &#63; and statusDoc = &#63;.
	 *
	 * @param language the language to search with
	 * @param orgId the org id to search with
	 * @param fieldId the field id to search with
	 * @param statusDoc the status doc to search with
	 * @return the number of matching v legal documents
	 * @throws SystemException if a system exception occurred
	 */
	public int countByDocsByL_O_F_S(String language, String orgId,
		String fieldId, int statusDoc) throws SystemException {
		Object[] finderArgs = new Object[] { language, orgId, fieldId, statusDoc };

		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_BY_DOCSBYL_O_F_S,
				finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(5);

			query.append(_SQL_COUNT_VLEGALDOCUMENT_WHERE);

			if (language == null) {
				query.append(_FINDER_COLUMN_DOCSBYL_O_F_S_LANGUAGE_1);
			}
			else {
				if (language.equals(StringPool.BLANK)) {
					query.append(_FINDER_COLUMN_DOCSBYL_O_F_S_LANGUAGE_3);
				}
				else {
					query.append(_FINDER_COLUMN_DOCSBYL_O_F_S_LANGUAGE_2);
				}
			}

			if (orgId == null) {
				query.append(_FINDER_COLUMN_DOCSBYL_O_F_S_ORGID_1);
			}
			else {
				if (orgId.equals(StringPool.BLANK)) {
					query.append(_FINDER_COLUMN_DOCSBYL_O_F_S_ORGID_3);
				}
				else {
					query.append(_FINDER_COLUMN_DOCSBYL_O_F_S_ORGID_2);
				}
			}

			if (fieldId == null) {
				query.append(_FINDER_COLUMN_DOCSBYL_O_F_S_FIELDID_1);
			}
			else {
				if (fieldId.equals(StringPool.BLANK)) {
					query.append(_FINDER_COLUMN_DOCSBYL_O_F_S_FIELDID_3);
				}
				else {
					query.append(_FINDER_COLUMN_DOCSBYL_O_F_S_FIELDID_2);
				}
			}

			query.append(_FINDER_COLUMN_DOCSBYL_O_F_S_STATUSDOC_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (language != null) {
					qPos.add(language);
				}

				if (orgId != null) {
					qPos.add(orgId);
				}

				if (fieldId != null) {
					qPos.add(fieldId);
				}

				qPos.add(statusDoc);

				count = (Long)q.uniqueResult();
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (count == null) {
					count = Long.valueOf(0);
				}

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_DOCSBYL_O_F_S,
					finderArgs, count);

				closeSession(session);
			}
		}

		return count.intValue();
	}

	/**
	 * Counts all the v legal documents where language = &#63; and typeDocId = &#63; and fieldId = &#63; and statusDoc = &#63;.
	 *
	 * @param language the language to search with
	 * @param typeDocId the type doc id to search with
	 * @param fieldId the field id to search with
	 * @param statusDoc the status doc to search with
	 * @return the number of matching v legal documents
	 * @throws SystemException if a system exception occurred
	 */
	public int countByDocsByL_T_F_S(String language, String typeDocId,
		String fieldId, int statusDoc) throws SystemException {
		Object[] finderArgs = new Object[] {
				language, typeDocId, fieldId, statusDoc
			};

		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_BY_DOCSBYL_T_F_S,
				finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(5);

			query.append(_SQL_COUNT_VLEGALDOCUMENT_WHERE);

			if (language == null) {
				query.append(_FINDER_COLUMN_DOCSBYL_T_F_S_LANGUAGE_1);
			}
			else {
				if (language.equals(StringPool.BLANK)) {
					query.append(_FINDER_COLUMN_DOCSBYL_T_F_S_LANGUAGE_3);
				}
				else {
					query.append(_FINDER_COLUMN_DOCSBYL_T_F_S_LANGUAGE_2);
				}
			}

			if (typeDocId == null) {
				query.append(_FINDER_COLUMN_DOCSBYL_T_F_S_TYPEDOCID_1);
			}
			else {
				if (typeDocId.equals(StringPool.BLANK)) {
					query.append(_FINDER_COLUMN_DOCSBYL_T_F_S_TYPEDOCID_3);
				}
				else {
					query.append(_FINDER_COLUMN_DOCSBYL_T_F_S_TYPEDOCID_2);
				}
			}

			if (fieldId == null) {
				query.append(_FINDER_COLUMN_DOCSBYL_T_F_S_FIELDID_1);
			}
			else {
				if (fieldId.equals(StringPool.BLANK)) {
					query.append(_FINDER_COLUMN_DOCSBYL_T_F_S_FIELDID_3);
				}
				else {
					query.append(_FINDER_COLUMN_DOCSBYL_T_F_S_FIELDID_2);
				}
			}

			query.append(_FINDER_COLUMN_DOCSBYL_T_F_S_STATUSDOC_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (language != null) {
					qPos.add(language);
				}

				if (typeDocId != null) {
					qPos.add(typeDocId);
				}

				if (fieldId != null) {
					qPos.add(fieldId);
				}

				qPos.add(statusDoc);

				count = (Long)q.uniqueResult();
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (count == null) {
					count = Long.valueOf(0);
				}

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_DOCSBYL_T_F_S,
					finderArgs, count);

				closeSession(session);
			}
		}

		return count.intValue();
	}

	/**
	 * Counts all the v legal documents where typeDocId = &#63; and language = &#63;.
	 *
	 * @param typeDocId the type doc id to search with
	 * @param language the language to search with
	 * @return the number of matching v legal documents
	 * @throws SystemException if a system exception occurred
	 */
	public int countByDocsByT_L(String typeDocId, String language)
		throws SystemException {
		Object[] finderArgs = new Object[] { typeDocId, language };

		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_BY_DOCSBYT_L,
				finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_VLEGALDOCUMENT_WHERE);

			if (typeDocId == null) {
				query.append(_FINDER_COLUMN_DOCSBYT_L_TYPEDOCID_1);
			}
			else {
				if (typeDocId.equals(StringPool.BLANK)) {
					query.append(_FINDER_COLUMN_DOCSBYT_L_TYPEDOCID_3);
				}
				else {
					query.append(_FINDER_COLUMN_DOCSBYT_L_TYPEDOCID_2);
				}
			}

			if (language == null) {
				query.append(_FINDER_COLUMN_DOCSBYT_L_LANGUAGE_1);
			}
			else {
				if (language.equals(StringPool.BLANK)) {
					query.append(_FINDER_COLUMN_DOCSBYT_L_LANGUAGE_3);
				}
				else {
					query.append(_FINDER_COLUMN_DOCSBYT_L_LANGUAGE_2);
				}
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (typeDocId != null) {
					qPos.add(typeDocId);
				}

				if (language != null) {
					qPos.add(language);
				}

				count = (Long)q.uniqueResult();
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (count == null) {
					count = Long.valueOf(0);
				}

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_DOCSBYT_L,
					finderArgs, count);

				closeSession(session);
			}
		}

		return count.intValue();
	}

	/**
	 * Counts all the v legal documents where groupId = &#63; and language = &#63; and userId = &#63; and statusDoc = &#63;.
	 *
	 * @param groupId the group id to search with
	 * @param language the language to search with
	 * @param userId the user id to search with
	 * @param statusDoc the status doc to search with
	 * @return the number of matching v legal documents
	 * @throws SystemException if a system exception occurred
	 */
	public int countByG_L_U_S(long groupId, String language, long userId,
		int statusDoc) throws SystemException {
		Object[] finderArgs = new Object[] { groupId, language, userId, statusDoc };

		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_BY_G_L_U_S,
				finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(5);

			query.append(_SQL_COUNT_VLEGALDOCUMENT_WHERE);

			query.append(_FINDER_COLUMN_G_L_U_S_GROUPID_2);

			if (language == null) {
				query.append(_FINDER_COLUMN_G_L_U_S_LANGUAGE_1);
			}
			else {
				if (language.equals(StringPool.BLANK)) {
					query.append(_FINDER_COLUMN_G_L_U_S_LANGUAGE_3);
				}
				else {
					query.append(_FINDER_COLUMN_G_L_U_S_LANGUAGE_2);
				}
			}

			query.append(_FINDER_COLUMN_G_L_U_S_USERID_2);

			query.append(_FINDER_COLUMN_G_L_U_S_STATUSDOC_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(groupId);

				if (language != null) {
					qPos.add(language);
				}

				qPos.add(userId);

				qPos.add(statusDoc);

				count = (Long)q.uniqueResult();
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (count == null) {
					count = Long.valueOf(0);
				}

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_G_L_U_S,
					finderArgs, count);

				closeSession(session);
			}
		}

		return count.intValue();
	}

	/**
	 * Counts all the v legal documents where groupId = &#63; and docId = &#63;.
	 *
	 * @param groupId the group id to search with
	 * @param docId the doc id to search with
	 * @return the number of matching v legal documents
	 * @throws SystemException if a system exception occurred
	 */
	public int countByG_D(long groupId, String docId) throws SystemException {
		Object[] finderArgs = new Object[] { groupId, docId };

		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_BY_G_D,
				finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_VLEGALDOCUMENT_WHERE);

			query.append(_FINDER_COLUMN_G_D_GROUPID_2);

			if (docId == null) {
				query.append(_FINDER_COLUMN_G_D_DOCID_1);
			}
			else {
				if (docId.equals(StringPool.BLANK)) {
					query.append(_FINDER_COLUMN_G_D_DOCID_3);
				}
				else {
					query.append(_FINDER_COLUMN_G_D_DOCID_2);
				}
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(groupId);

				if (docId != null) {
					qPos.add(docId);
				}

				count = (Long)q.uniqueResult();
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (count == null) {
					count = Long.valueOf(0);
				}

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_G_D, finderArgs,
					count);

				closeSession(session);
			}
		}

		return count.intValue();
	}

	/**
	 * Counts all the v legal documents where groupId = &#63; and num = &#63; and symbol = &#63;.
	 *
	 * @param groupId the group id to search with
	 * @param num the num to search with
	 * @param symbol the symbol to search with
	 * @return the number of matching v legal documents
	 * @throws SystemException if a system exception occurred
	 */
	public int countByP_N_S(long groupId, String num, String symbol)
		throws SystemException {
		Object[] finderArgs = new Object[] { groupId, num, symbol };

		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_BY_P_N_S,
				finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(4);

			query.append(_SQL_COUNT_VLEGALDOCUMENT_WHERE);

			query.append(_FINDER_COLUMN_P_N_S_GROUPID_2);

			if (num == null) {
				query.append(_FINDER_COLUMN_P_N_S_NUM_1);
			}
			else {
				if (num.equals(StringPool.BLANK)) {
					query.append(_FINDER_COLUMN_P_N_S_NUM_3);
				}
				else {
					query.append(_FINDER_COLUMN_P_N_S_NUM_2);
				}
			}

			if (symbol == null) {
				query.append(_FINDER_COLUMN_P_N_S_SYMBOL_1);
			}
			else {
				if (symbol.equals(StringPool.BLANK)) {
					query.append(_FINDER_COLUMN_P_N_S_SYMBOL_3);
				}
				else {
					query.append(_FINDER_COLUMN_P_N_S_SYMBOL_2);
				}
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(groupId);

				if (num != null) {
					qPos.add(num);
				}

				if (symbol != null) {
					qPos.add(symbol);
				}

				count = (Long)q.uniqueResult();
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (count == null) {
					count = Long.valueOf(0);
				}

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_P_N_S,
					finderArgs, count);

				closeSession(session);
			}
		}

		return count.intValue();
	}

	/**
	 * Counts all the v legal documents where groupId = &#63; and language = &#63; and statusDoc = &#63;.
	 *
	 * @param groupId the group id to search with
	 * @param language the language to search with
	 * @param statusDoc the status doc to search with
	 * @return the number of matching v legal documents
	 * @throws SystemException if a system exception occurred
	 */
	public int countByP_L_S(long groupId, String language, int statusDoc)
		throws SystemException {
		Object[] finderArgs = new Object[] { groupId, language, statusDoc };

		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_BY_P_L_S,
				finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(4);

			query.append(_SQL_COUNT_VLEGALDOCUMENT_WHERE);

			query.append(_FINDER_COLUMN_P_L_S_GROUPID_2);

			if (language == null) {
				query.append(_FINDER_COLUMN_P_L_S_LANGUAGE_1);
			}
			else {
				if (language.equals(StringPool.BLANK)) {
					query.append(_FINDER_COLUMN_P_L_S_LANGUAGE_3);
				}
				else {
					query.append(_FINDER_COLUMN_P_L_S_LANGUAGE_2);
				}
			}

			query.append(_FINDER_COLUMN_P_L_S_STATUSDOC_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(groupId);

				if (language != null) {
					qPos.add(language);
				}

				qPos.add(statusDoc);

				count = (Long)q.uniqueResult();
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (count == null) {
					count = Long.valueOf(0);
				}

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_P_L_S,
					finderArgs, count);

				closeSession(session);
			}
		}

		return count.intValue();
	}

	/**
	 * Counts all the v legal documents where statusDoc = &#63;.
	 *
	 * @param statusDoc the status doc to search with
	 * @return the number of matching v legal documents
	 * @throws SystemException if a system exception occurred
	 */
	public int countBystatusDoc(int statusDoc) throws SystemException {
		Object[] finderArgs = new Object[] { statusDoc };

		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_BY_STATUSDOC,
				finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_VLEGALDOCUMENT_WHERE);

			query.append(_FINDER_COLUMN_STATUSDOC_STATUSDOC_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(statusDoc);

				count = (Long)q.uniqueResult();
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (count == null) {
					count = Long.valueOf(0);
				}

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_STATUSDOC,
					finderArgs, count);

				closeSession(session);
			}
		}

		return count.intValue();
	}

	/**
	 * Counts all the v legal documents where groupId = &#63; and language = &#63; and orgId = &#63; and statusDoc = &#63;.
	 *
	 * @param groupId the group id to search with
	 * @param language the language to search with
	 * @param orgId the org id to search with
	 * @param statusDoc the status doc to search with
	 * @return the number of matching v legal documents
	 * @throws SystemException if a system exception occurred
	 */
	public int countByG_L_O_S(long groupId, String language, String orgId,
		int statusDoc) throws SystemException {
		Object[] finderArgs = new Object[] { groupId, language, orgId, statusDoc };

		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_BY_G_L_O_S,
				finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(5);

			query.append(_SQL_COUNT_VLEGALDOCUMENT_WHERE);

			query.append(_FINDER_COLUMN_G_L_O_S_GROUPID_2);

			if (language == null) {
				query.append(_FINDER_COLUMN_G_L_O_S_LANGUAGE_1);
			}
			else {
				if (language.equals(StringPool.BLANK)) {
					query.append(_FINDER_COLUMN_G_L_O_S_LANGUAGE_3);
				}
				else {
					query.append(_FINDER_COLUMN_G_L_O_S_LANGUAGE_2);
				}
			}

			if (orgId == null) {
				query.append(_FINDER_COLUMN_G_L_O_S_ORGID_1);
			}
			else {
				if (orgId.equals(StringPool.BLANK)) {
					query.append(_FINDER_COLUMN_G_L_O_S_ORGID_3);
				}
				else {
					query.append(_FINDER_COLUMN_G_L_O_S_ORGID_2);
				}
			}

			query.append(_FINDER_COLUMN_G_L_O_S_STATUSDOC_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(groupId);

				if (language != null) {
					qPos.add(language);
				}

				if (orgId != null) {
					qPos.add(orgId);
				}

				qPos.add(statusDoc);

				count = (Long)q.uniqueResult();
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (count == null) {
					count = Long.valueOf(0);
				}

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_G_L_O_S,
					finderArgs, count);

				closeSession(session);
			}
		}

		return count.intValue();
	}

	/**
	 * Counts all the v legal documents where groupId = &#63; and language = &#63; and typeDocId = &#63; and statusDoc = &#63;.
	 *
	 * @param groupId the group id to search with
	 * @param language the language to search with
	 * @param typeDocId the type doc id to search with
	 * @param statusDoc the status doc to search with
	 * @return the number of matching v legal documents
	 * @throws SystemException if a system exception occurred
	 */
	public int countByG_L_T_S(long groupId, String language, String typeDocId,
		int statusDoc) throws SystemException {
		Object[] finderArgs = new Object[] {
				groupId, language, typeDocId, statusDoc
			};

		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_BY_G_L_T_S,
				finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(5);

			query.append(_SQL_COUNT_VLEGALDOCUMENT_WHERE);

			query.append(_FINDER_COLUMN_G_L_T_S_GROUPID_2);

			if (language == null) {
				query.append(_FINDER_COLUMN_G_L_T_S_LANGUAGE_1);
			}
			else {
				if (language.equals(StringPool.BLANK)) {
					query.append(_FINDER_COLUMN_G_L_T_S_LANGUAGE_3);
				}
				else {
					query.append(_FINDER_COLUMN_G_L_T_S_LANGUAGE_2);
				}
			}

			if (typeDocId == null) {
				query.append(_FINDER_COLUMN_G_L_T_S_TYPEDOCID_1);
			}
			else {
				if (typeDocId.equals(StringPool.BLANK)) {
					query.append(_FINDER_COLUMN_G_L_T_S_TYPEDOCID_3);
				}
				else {
					query.append(_FINDER_COLUMN_G_L_T_S_TYPEDOCID_2);
				}
			}

			query.append(_FINDER_COLUMN_G_L_T_S_STATUSDOC_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(groupId);

				if (language != null) {
					qPos.add(language);
				}

				if (typeDocId != null) {
					qPos.add(typeDocId);
				}

				qPos.add(statusDoc);

				count = (Long)q.uniqueResult();
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (count == null) {
					count = Long.valueOf(0);
				}

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_G_L_T_S,
					finderArgs, count);

				closeSession(session);
			}
		}

		return count.intValue();
	}

	/**
	 * Counts all the v legal documents where language = &#63; and fieldId = &#63; and statusDoc = &#63;.
	 *
	 * @param language the language to search with
	 * @param fieldId the field id to search with
	 * @param statusDoc the status doc to search with
	 * @return the number of matching v legal documents
	 * @throws SystemException if a system exception occurred
	 */
	public int countByL_F_S(String language, String fieldId, int statusDoc)
		throws SystemException {
		Object[] finderArgs = new Object[] { language, fieldId, statusDoc };

		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_BY_L_F_S,
				finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(4);

			query.append(_SQL_COUNT_VLEGALDOCUMENT_WHERE);

			if (language == null) {
				query.append(_FINDER_COLUMN_L_F_S_LANGUAGE_1);
			}
			else {
				if (language.equals(StringPool.BLANK)) {
					query.append(_FINDER_COLUMN_L_F_S_LANGUAGE_3);
				}
				else {
					query.append(_FINDER_COLUMN_L_F_S_LANGUAGE_2);
				}
			}

			if (fieldId == null) {
				query.append(_FINDER_COLUMN_L_F_S_FIELDID_1);
			}
			else {
				if (fieldId.equals(StringPool.BLANK)) {
					query.append(_FINDER_COLUMN_L_F_S_FIELDID_3);
				}
				else {
					query.append(_FINDER_COLUMN_L_F_S_FIELDID_2);
				}
			}

			query.append(_FINDER_COLUMN_L_F_S_STATUSDOC_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (language != null) {
					qPos.add(language);
				}

				if (fieldId != null) {
					qPos.add(fieldId);
				}

				qPos.add(statusDoc);

				count = (Long)q.uniqueResult();
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (count == null) {
					count = Long.valueOf(0);
				}

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_L_F_S,
					finderArgs, count);

				closeSession(session);
			}
		}

		return count.intValue();
	}

	/**
	 * Counts all the v legal documents where groupId = &#63; and language = &#63; and fieldId = &#63; and statusDoc = &#63;.
	 *
	 * @param groupId the group id to search with
	 * @param language the language to search with
	 * @param fieldId the field id to search with
	 * @param statusDoc the status doc to search with
	 * @return the number of matching v legal documents
	 * @throws SystemException if a system exception occurred
	 */
	public int countByG_L_F_S(long groupId, String language, String fieldId,
		int statusDoc) throws SystemException {
		Object[] finderArgs = new Object[] { groupId, language, fieldId, statusDoc };

		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_BY_G_L_F_S,
				finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(5);

			query.append(_SQL_COUNT_VLEGALDOCUMENT_WHERE);

			query.append(_FINDER_COLUMN_G_L_F_S_GROUPID_2);

			if (language == null) {
				query.append(_FINDER_COLUMN_G_L_F_S_LANGUAGE_1);
			}
			else {
				if (language.equals(StringPool.BLANK)) {
					query.append(_FINDER_COLUMN_G_L_F_S_LANGUAGE_3);
				}
				else {
					query.append(_FINDER_COLUMN_G_L_F_S_LANGUAGE_2);
				}
			}

			if (fieldId == null) {
				query.append(_FINDER_COLUMN_G_L_F_S_FIELDID_1);
			}
			else {
				if (fieldId.equals(StringPool.BLANK)) {
					query.append(_FINDER_COLUMN_G_L_F_S_FIELDID_3);
				}
				else {
					query.append(_FINDER_COLUMN_G_L_F_S_FIELDID_2);
				}
			}

			query.append(_FINDER_COLUMN_G_L_F_S_STATUSDOC_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(groupId);

				if (language != null) {
					qPos.add(language);
				}

				if (fieldId != null) {
					qPos.add(fieldId);
				}

				qPos.add(statusDoc);

				count = (Long)q.uniqueResult();
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (count == null) {
					count = Long.valueOf(0);
				}

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_G_L_F_S,
					finderArgs, count);

				closeSession(session);
			}
		}

		return count.intValue();
	}

	/**
	 * Counts all the v legal documents where groupId = &#63; and language = &#63; and orgId = &#63;.
	 *
	 * @param groupId the group id to search with
	 * @param language the language to search with
	 * @param orgId the org id to search with
	 * @return the number of matching v legal documents
	 * @throws SystemException if a system exception occurred
	 */
	public int countByG_L_O(long groupId, String language, String orgId)
		throws SystemException {
		Object[] finderArgs = new Object[] { groupId, language, orgId };

		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_BY_G_L_O,
				finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(4);

			query.append(_SQL_COUNT_VLEGALDOCUMENT_WHERE);

			query.append(_FINDER_COLUMN_G_L_O_GROUPID_2);

			if (language == null) {
				query.append(_FINDER_COLUMN_G_L_O_LANGUAGE_1);
			}
			else {
				if (language.equals(StringPool.BLANK)) {
					query.append(_FINDER_COLUMN_G_L_O_LANGUAGE_3);
				}
				else {
					query.append(_FINDER_COLUMN_G_L_O_LANGUAGE_2);
				}
			}

			if (orgId == null) {
				query.append(_FINDER_COLUMN_G_L_O_ORGID_1);
			}
			else {
				if (orgId.equals(StringPool.BLANK)) {
					query.append(_FINDER_COLUMN_G_L_O_ORGID_3);
				}
				else {
					query.append(_FINDER_COLUMN_G_L_O_ORGID_2);
				}
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(groupId);

				if (language != null) {
					qPos.add(language);
				}

				if (orgId != null) {
					qPos.add(orgId);
				}

				count = (Long)q.uniqueResult();
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (count == null) {
					count = Long.valueOf(0);
				}

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_G_L_O,
					finderArgs, count);

				closeSession(session);
			}
		}

		return count.intValue();
	}

	/**
	 * Counts all the v legal documents where language = &#63; and orgId = &#63; and statusDoc = &#63;.
	 *
	 * @param language the language to search with
	 * @param orgId the org id to search with
	 * @param statusDoc the status doc to search with
	 * @return the number of matching v legal documents
	 * @throws SystemException if a system exception occurred
	 */
	public int countByL_O(String language, String orgId, int statusDoc)
		throws SystemException {
		Object[] finderArgs = new Object[] { language, orgId, statusDoc };

		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_BY_L_O,
				finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(4);

			query.append(_SQL_COUNT_VLEGALDOCUMENT_WHERE);

			if (language == null) {
				query.append(_FINDER_COLUMN_L_O_LANGUAGE_1);
			}
			else {
				if (language.equals(StringPool.BLANK)) {
					query.append(_FINDER_COLUMN_L_O_LANGUAGE_3);
				}
				else {
					query.append(_FINDER_COLUMN_L_O_LANGUAGE_2);
				}
			}

			if (orgId == null) {
				query.append(_FINDER_COLUMN_L_O_ORGID_1);
			}
			else {
				if (orgId.equals(StringPool.BLANK)) {
					query.append(_FINDER_COLUMN_L_O_ORGID_3);
				}
				else {
					query.append(_FINDER_COLUMN_L_O_ORGID_2);
				}
			}

			query.append(_FINDER_COLUMN_L_O_STATUSDOC_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (language != null) {
					qPos.add(language);
				}

				if (orgId != null) {
					qPos.add(orgId);
				}

				qPos.add(statusDoc);

				count = (Long)q.uniqueResult();
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (count == null) {
					count = Long.valueOf(0);
				}

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_L_O, finderArgs,
					count);

				closeSession(session);
			}
		}

		return count.intValue();
	}

	/**
	 * Counts all the v legal documents where groupId = &#63; and language = &#63; and typeDocId = &#63;.
	 *
	 * @param groupId the group id to search with
	 * @param language the language to search with
	 * @param typeDocId the type doc id to search with
	 * @return the number of matching v legal documents
	 * @throws SystemException if a system exception occurred
	 */
	public int countByG_L_T(long groupId, String language, String typeDocId)
		throws SystemException {
		Object[] finderArgs = new Object[] { groupId, language, typeDocId };

		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_BY_G_L_T,
				finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(4);

			query.append(_SQL_COUNT_VLEGALDOCUMENT_WHERE);

			query.append(_FINDER_COLUMN_G_L_T_GROUPID_2);

			if (language == null) {
				query.append(_FINDER_COLUMN_G_L_T_LANGUAGE_1);
			}
			else {
				if (language.equals(StringPool.BLANK)) {
					query.append(_FINDER_COLUMN_G_L_T_LANGUAGE_3);
				}
				else {
					query.append(_FINDER_COLUMN_G_L_T_LANGUAGE_2);
				}
			}

			if (typeDocId == null) {
				query.append(_FINDER_COLUMN_G_L_T_TYPEDOCID_1);
			}
			else {
				if (typeDocId.equals(StringPool.BLANK)) {
					query.append(_FINDER_COLUMN_G_L_T_TYPEDOCID_3);
				}
				else {
					query.append(_FINDER_COLUMN_G_L_T_TYPEDOCID_2);
				}
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(groupId);

				if (language != null) {
					qPos.add(language);
				}

				if (typeDocId != null) {
					qPos.add(typeDocId);
				}

				count = (Long)q.uniqueResult();
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (count == null) {
					count = Long.valueOf(0);
				}

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_G_L_T,
					finderArgs, count);

				closeSession(session);
			}
		}

		return count.intValue();
	}

	/**
	 * Counts all the v legal documents where groupId = &#63; and language = &#63; and fieldId = &#63;.
	 *
	 * @param groupId the group id to search with
	 * @param language the language to search with
	 * @param fieldId the field id to search with
	 * @return the number of matching v legal documents
	 * @throws SystemException if a system exception occurred
	 */
	public int countByG_L_F(long groupId, String language, String fieldId)
		throws SystemException {
		Object[] finderArgs = new Object[] { groupId, language, fieldId };

		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_BY_G_L_F,
				finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(4);

			query.append(_SQL_COUNT_VLEGALDOCUMENT_WHERE);

			query.append(_FINDER_COLUMN_G_L_F_GROUPID_2);

			if (language == null) {
				query.append(_FINDER_COLUMN_G_L_F_LANGUAGE_1);
			}
			else {
				if (language.equals(StringPool.BLANK)) {
					query.append(_FINDER_COLUMN_G_L_F_LANGUAGE_3);
				}
				else {
					query.append(_FINDER_COLUMN_G_L_F_LANGUAGE_2);
				}
			}

			if (fieldId == null) {
				query.append(_FINDER_COLUMN_G_L_F_FIELDID_1);
			}
			else {
				if (fieldId.equals(StringPool.BLANK)) {
					query.append(_FINDER_COLUMN_G_L_F_FIELDID_3);
				}
				else {
					query.append(_FINDER_COLUMN_G_L_F_FIELDID_2);
				}
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(groupId);

				if (language != null) {
					qPos.add(language);
				}

				if (fieldId != null) {
					qPos.add(fieldId);
				}

				count = (Long)q.uniqueResult();
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (count == null) {
					count = Long.valueOf(0);
				}

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_G_L_F,
					finderArgs, count);

				closeSession(session);
			}
		}

		return count.intValue();
	}

	/**
	 * Counts all the v legal documents where groupId = &#63; and createdByUser = &#63; and language = &#63; and statusDoc = &#63;.
	 *
	 * @param groupId the group id to search with
	 * @param createdByUser the created by user to search with
	 * @param language the language to search with
	 * @param statusDoc the status doc to search with
	 * @return the number of matching v legal documents
	 * @throws SystemException if a system exception occurred
	 */
	public int countByP_U_S(long groupId, long createdByUser, String language,
		int statusDoc) throws SystemException {
		Object[] finderArgs = new Object[] {
				groupId, createdByUser, language, statusDoc
			};

		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_BY_P_U_S,
				finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(5);

			query.append(_SQL_COUNT_VLEGALDOCUMENT_WHERE);

			query.append(_FINDER_COLUMN_P_U_S_GROUPID_2);

			query.append(_FINDER_COLUMN_P_U_S_CREATEDBYUSER_2);

			if (language == null) {
				query.append(_FINDER_COLUMN_P_U_S_LANGUAGE_1);
			}
			else {
				if (language.equals(StringPool.BLANK)) {
					query.append(_FINDER_COLUMN_P_U_S_LANGUAGE_3);
				}
				else {
					query.append(_FINDER_COLUMN_P_U_S_LANGUAGE_2);
				}
			}

			query.append(_FINDER_COLUMN_P_U_S_STATUSDOC_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(groupId);

				qPos.add(createdByUser);

				if (language != null) {
					qPos.add(language);
				}

				qPos.add(statusDoc);

				count = (Long)q.uniqueResult();
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (count == null) {
					count = Long.valueOf(0);
				}

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_P_U_S,
					finderArgs, count);

				closeSession(session);
			}
		}

		return count.intValue();
	}

	/**
	 * Counts all the v legal documents where statusDoc = &#63;.
	 *
	 * @param statusDoc the status doc to search with
	 * @return the number of matching v legal documents
	 * @throws SystemException if a system exception occurred
	 */
	public int countByStatus(int statusDoc) throws SystemException {
		Object[] finderArgs = new Object[] { statusDoc };

		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_BY_STATUS,
				finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_VLEGALDOCUMENT_WHERE);

			query.append(_FINDER_COLUMN_STATUS_STATUSDOC_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(statusDoc);

				count = (Long)q.uniqueResult();
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (count == null) {
					count = Long.valueOf(0);
				}

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_STATUS,
					finderArgs, count);

				closeSession(session);
			}
		}

		return count.intValue();
	}

	/**
	 * Counts all the v legal documents where language = &#63; and statusDoc = &#63;.
	 *
	 * @param language the language to search with
	 * @param statusDoc the status doc to search with
	 * @return the number of matching v legal documents
	 * @throws SystemException if a system exception occurred
	 */
	public int countByL_S(String language, int statusDoc)
		throws SystemException {
		Object[] finderArgs = new Object[] { language, statusDoc };

		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_BY_L_S,
				finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_VLEGALDOCUMENT_WHERE);

			if (language == null) {
				query.append(_FINDER_COLUMN_L_S_LANGUAGE_1);
			}
			else {
				if (language.equals(StringPool.BLANK)) {
					query.append(_FINDER_COLUMN_L_S_LANGUAGE_3);
				}
				else {
					query.append(_FINDER_COLUMN_L_S_LANGUAGE_2);
				}
			}

			query.append(_FINDER_COLUMN_L_S_STATUSDOC_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (language != null) {
					qPos.add(language);
				}

				qPos.add(statusDoc);

				count = (Long)q.uniqueResult();
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (count == null) {
					count = Long.valueOf(0);
				}

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_L_S, finderArgs,
					count);

				closeSession(session);
			}
		}

		return count.intValue();
	}

	/**
	 * Counts all the v legal documents.
	 *
	 * @return the number of v legal documents
	 * @throws SystemException if a system exception occurred
	 */
	public int countAll() throws SystemException {
		Object[] finderArgs = new Object[0];

		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_ALL,
				finderArgs, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_VLEGALDOCUMENT);

				count = (Long)q.uniqueResult();
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (count == null) {
					count = Long.valueOf(0);
				}

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_ALL, finderArgs,
					count);

				closeSession(session);
			}
		}

		return count.intValue();
	}

	/**
	 * Initializes the v legal document persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.com.vportal.portlet.vlegal.model.VLegalDocument")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<VLegalDocument>> listenersList = new ArrayList<ModelListener<VLegalDocument>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<VLegalDocument>)InstanceFactory.newInstance(
							listenerClassName));
				}

				listeners = listenersList.toArray(new ModelListener[listenersList.size()]);
			}
			catch (Exception e) {
				_log.error(e);
			}
		}
	}

	public void destroy() {
		EntityCacheUtil.removeCache(VLegalDocumentImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST);
	}

	@BeanReference(type = VLegalDocumentPersistence.class)
	protected VLegalDocumentPersistence vLegalDocumentPersistence;
	@BeanReference(type = VLegalFieldPersistence.class)
	protected VLegalFieldPersistence vLegalFieldPersistence;
	@BeanReference(type = VLegalTypePersistence.class)
	protected VLegalTypePersistence vLegalTypePersistence;
	@BeanReference(type = VLegalDraftDocumentPersistence.class)
	protected VLegalDraftDocumentPersistence vLegalDraftDocumentPersistence;
	@BeanReference(type = VLegalSuggestDocumentPersistence.class)
	protected VLegalSuggestDocumentPersistence vLegalSuggestDocumentPersistence;
	@BeanReference(type = VLegalAttachedMessagePersistence.class)
	protected VLegalAttachedMessagePersistence vLegalAttachedMessagePersistence;
	@BeanReference(type = VLegalOrgPersistence.class)
	protected VLegalOrgPersistence vLegalOrgPersistence;
	@BeanReference(type = VLegalSignerPersistence.class)
	protected VLegalSignerPersistence vLegalSignerPersistence;
	@BeanReference(type = VLegalTagsPersistence.class)
	protected VLegalTagsPersistence vLegalTagsPersistence;
	@BeanReference(type = VLegalFORelPersistence.class)
	protected VLegalFORelPersistence vLegalFORelPersistence;
	@BeanReference(type = VLegalFTRelPersistence.class)
	protected VLegalFTRelPersistence vLegalFTRelPersistence;
	@BeanReference(type = VLegalDFRelPersistence.class)
	protected VLegalDFRelPersistence vLegalDFRelPersistence;
	@BeanReference(type = VLegalDDRelPersistence.class)
	protected VLegalDDRelPersistence vLegalDDRelPersistence;
	@BeanReference(type = VLegalDURelPersistence.class)
	protected VLegalDURelPersistence vLegalDURelPersistence;
	@BeanReference(type = VLegalDSRelPersistence.class)
	protected VLegalDSRelPersistence vLegalDSRelPersistence;
	@BeanReference(type = VLegalTDRelPersistence.class)
	protected VLegalTDRelPersistence vLegalTDRelPersistence;
	@BeanReference(type = VLegalLoggerPersistence.class)
	protected VLegalLoggerPersistence vLegalLoggerPersistence;
	@BeanReference(type = CompanyPersistence.class)
	protected CompanyPersistence companyPersistence;
	@BeanReference(type = PortletPreferencesPersistence.class)
	protected PortletPreferencesPersistence portletPreferencesPersistence;
	@BeanReference(type = ResourcePersistence.class)
	protected ResourcePersistence resourcePersistence;
	@BeanReference(type = UserPersistence.class)
	protected UserPersistence userPersistence;
	private static final String _SQL_SELECT_VLEGALDOCUMENT = "SELECT vLegalDocument FROM VLegalDocument vLegalDocument";
	private static final String _SQL_SELECT_VLEGALDOCUMENT_WHERE = "SELECT vLegalDocument FROM VLegalDocument vLegalDocument WHERE ";
	private static final String _SQL_COUNT_VLEGALDOCUMENT = "SELECT COUNT(vLegalDocument) FROM VLegalDocument vLegalDocument";
	private static final String _SQL_COUNT_VLEGALDOCUMENT_WHERE = "SELECT COUNT(vLegalDocument) FROM VLegalDocument vLegalDocument WHERE ";
	private static final String _FINDER_COLUMN_GROUPID_GROUPID_2 = "vLegalDocument.groupId = ?";
	private static final String _FINDER_COLUMN_PROMULDATE_LANGUAGE_1 = "vLegalDocument.language IS NULL AND ";
	private static final String _FINDER_COLUMN_PROMULDATE_LANGUAGE_2 = "vLegalDocument.language = ? AND ";
	private static final String _FINDER_COLUMN_PROMULDATE_LANGUAGE_3 = "(vLegalDocument.language IS NULL OR vLegalDocument.language = ?) AND ";
	private static final String _FINDER_COLUMN_PROMULDATE_PROMULDATE_1 = "vLegalDocument.promulDate IS NULL AND ";
	private static final String _FINDER_COLUMN_PROMULDATE_PROMULDATE_2 = "vLegalDocument.promulDate = ? AND ";
	private static final String _FINDER_COLUMN_PROMULDATE_STATUSDOC_2 = "vLegalDocument.statusDoc = ?";
	private static final String _FINDER_COLUMN_G_L_GROUPID_2 = "vLegalDocument.groupId = ? AND ";
	private static final String _FINDER_COLUMN_G_L_LANGUAGE_1 = "vLegalDocument.language IS NULL";
	private static final String _FINDER_COLUMN_G_L_LANGUAGE_2 = "vLegalDocument.language = ?";
	private static final String _FINDER_COLUMN_G_L_LANGUAGE_3 = "(vLegalDocument.language IS NULL OR vLegalDocument.language = ?)";
	private static final String _FINDER_COLUMN_DOCSBYF_O_T_L_S_GROUPID_2 = "vLegalDocument.groupId = ? AND ";
	private static final String _FINDER_COLUMN_DOCSBYF_O_T_L_S_TYPEDOCID_1 = "vLegalDocument.typeDocId IS NULL AND ";
	private static final String _FINDER_COLUMN_DOCSBYF_O_T_L_S_TYPEDOCID_2 = "vLegalDocument.typeDocId = ? AND ";
	private static final String _FINDER_COLUMN_DOCSBYF_O_T_L_S_TYPEDOCID_3 = "(vLegalDocument.typeDocId IS NULL OR vLegalDocument.typeDocId = ?) AND ";
	private static final String _FINDER_COLUMN_DOCSBYF_O_T_L_S_ORGID_1 = "vLegalDocument.orgId IS NULL AND ";
	private static final String _FINDER_COLUMN_DOCSBYF_O_T_L_S_ORGID_2 = "vLegalDocument.orgId = ? AND ";
	private static final String _FINDER_COLUMN_DOCSBYF_O_T_L_S_ORGID_3 = "(vLegalDocument.orgId IS NULL OR vLegalDocument.orgId = ?) AND ";
	private static final String _FINDER_COLUMN_DOCSBYF_O_T_L_S_FIELDID_1 = "vLegalDocument.fieldId IS NULL AND ";
	private static final String _FINDER_COLUMN_DOCSBYF_O_T_L_S_FIELDID_2 = "vLegalDocument.fieldId = ? AND ";
	private static final String _FINDER_COLUMN_DOCSBYF_O_T_L_S_FIELDID_3 = "(vLegalDocument.fieldId IS NULL OR vLegalDocument.fieldId = ?) AND ";
	private static final String _FINDER_COLUMN_DOCSBYF_O_T_L_S_LANGUAGE_1 = "vLegalDocument.language IS NULL AND ";
	private static final String _FINDER_COLUMN_DOCSBYF_O_T_L_S_LANGUAGE_2 = "vLegalDocument.language = ? AND ";
	private static final String _FINDER_COLUMN_DOCSBYF_O_T_L_S_LANGUAGE_3 = "(vLegalDocument.language IS NULL OR vLegalDocument.language = ?) AND ";
	private static final String _FINDER_COLUMN_DOCSBYF_O_T_L_S_STATUSDOC_2 = "vLegalDocument.statusDoc = ?";
	private static final String _FINDER_COLUMN_DOCSBYF_T_O_L_S_TYPEDOCID_1 = "vLegalDocument.typeDocId IS NULL AND ";
	private static final String _FINDER_COLUMN_DOCSBYF_T_O_L_S_TYPEDOCID_2 = "vLegalDocument.typeDocId = ? AND ";
	private static final String _FINDER_COLUMN_DOCSBYF_T_O_L_S_TYPEDOCID_3 = "(vLegalDocument.typeDocId IS NULL OR vLegalDocument.typeDocId = ?) AND ";
	private static final String _FINDER_COLUMN_DOCSBYF_T_O_L_S_ORGID_1 = "vLegalDocument.orgId IS NULL AND ";
	private static final String _FINDER_COLUMN_DOCSBYF_T_O_L_S_ORGID_2 = "vLegalDocument.orgId = ? AND ";
	private static final String _FINDER_COLUMN_DOCSBYF_T_O_L_S_ORGID_3 = "(vLegalDocument.orgId IS NULL OR vLegalDocument.orgId = ?) AND ";
	private static final String _FINDER_COLUMN_DOCSBYF_T_O_L_S_FIELDID_1 = "vLegalDocument.fieldId IS NULL AND ";
	private static final String _FINDER_COLUMN_DOCSBYF_T_O_L_S_FIELDID_2 = "vLegalDocument.fieldId = ? AND ";
	private static final String _FINDER_COLUMN_DOCSBYF_T_O_L_S_FIELDID_3 = "(vLegalDocument.fieldId IS NULL OR vLegalDocument.fieldId = ?) AND ";
	private static final String _FINDER_COLUMN_DOCSBYF_T_O_L_S_LANGUAGE_1 = "vLegalDocument.language IS NULL AND ";
	private static final String _FINDER_COLUMN_DOCSBYF_T_O_L_S_LANGUAGE_2 = "vLegalDocument.language = ? AND ";
	private static final String _FINDER_COLUMN_DOCSBYF_T_O_L_S_LANGUAGE_3 = "(vLegalDocument.language IS NULL OR vLegalDocument.language = ?) AND ";
	private static final String _FINDER_COLUMN_DOCSBYF_T_O_L_S_STATUSDOC_2 = "vLegalDocument.statusDoc = ?";
	private static final String _FINDER_COLUMN_DOCSBYF_C_O_T_L_S_COMPANYID_2 = "vLegalDocument.companyId = ? AND ";
	private static final String _FINDER_COLUMN_DOCSBYF_C_O_T_L_S_TYPEDOCID_1 = "vLegalDocument.typeDocId IS NULL AND ";
	private static final String _FINDER_COLUMN_DOCSBYF_C_O_T_L_S_TYPEDOCID_2 = "vLegalDocument.typeDocId = ? AND ";
	private static final String _FINDER_COLUMN_DOCSBYF_C_O_T_L_S_TYPEDOCID_3 = "(vLegalDocument.typeDocId IS NULL OR vLegalDocument.typeDocId = ?) AND ";
	private static final String _FINDER_COLUMN_DOCSBYF_C_O_T_L_S_ORGID_1 = "vLegalDocument.orgId IS NULL AND ";
	private static final String _FINDER_COLUMN_DOCSBYF_C_O_T_L_S_ORGID_2 = "vLegalDocument.orgId = ? AND ";
	private static final String _FINDER_COLUMN_DOCSBYF_C_O_T_L_S_ORGID_3 = "(vLegalDocument.orgId IS NULL OR vLegalDocument.orgId = ?) AND ";
	private static final String _FINDER_COLUMN_DOCSBYF_C_O_T_L_S_FIELDID_1 = "vLegalDocument.fieldId IS NULL AND ";
	private static final String _FINDER_COLUMN_DOCSBYF_C_O_T_L_S_FIELDID_2 = "vLegalDocument.fieldId = ? AND ";
	private static final String _FINDER_COLUMN_DOCSBYF_C_O_T_L_S_FIELDID_3 = "(vLegalDocument.fieldId IS NULL OR vLegalDocument.fieldId = ?) AND ";
	private static final String _FINDER_COLUMN_DOCSBYF_C_O_T_L_S_LANGUAGE_1 = "vLegalDocument.language IS NULL AND ";
	private static final String _FINDER_COLUMN_DOCSBYF_C_O_T_L_S_LANGUAGE_2 = "vLegalDocument.language = ? AND ";
	private static final String _FINDER_COLUMN_DOCSBYF_C_O_T_L_S_LANGUAGE_3 = "(vLegalDocument.language IS NULL OR vLegalDocument.language = ?) AND ";
	private static final String _FINDER_COLUMN_DOCSBYF_C_O_T_L_S_STATUSDOC_2 = "vLegalDocument.statusDoc = ?";
	private static final String _FINDER_COLUMN_DOCSBYC_T_O_COMPANYID_2 = "vLegalDocument.companyId = ? AND ";
	private static final String _FINDER_COLUMN_DOCSBYC_T_O_TYPEDOCID_1 = "vLegalDocument.typeDocId IS NULL AND ";
	private static final String _FINDER_COLUMN_DOCSBYC_T_O_TYPEDOCID_2 = "vLegalDocument.typeDocId = ? AND ";
	private static final String _FINDER_COLUMN_DOCSBYC_T_O_TYPEDOCID_3 = "(vLegalDocument.typeDocId IS NULL OR vLegalDocument.typeDocId = ?) AND ";
	private static final String _FINDER_COLUMN_DOCSBYC_T_O_ORGID_1 = "vLegalDocument.orgId IS NULL AND ";
	private static final String _FINDER_COLUMN_DOCSBYC_T_O_ORGID_2 = "vLegalDocument.orgId = ? AND ";
	private static final String _FINDER_COLUMN_DOCSBYC_T_O_ORGID_3 = "(vLegalDocument.orgId IS NULL OR vLegalDocument.orgId = ?) AND ";
	private static final String _FINDER_COLUMN_DOCSBYC_T_O_FIELDID_1 = "vLegalDocument.fieldId IS NULL AND ";
	private static final String _FINDER_COLUMN_DOCSBYC_T_O_FIELDID_2 = "vLegalDocument.fieldId = ? AND ";
	private static final String _FINDER_COLUMN_DOCSBYC_T_O_FIELDID_3 = "(vLegalDocument.fieldId IS NULL OR vLegalDocument.fieldId = ?) AND ";
	private static final String _FINDER_COLUMN_DOCSBYC_T_O_LANGUAGE_1 = "vLegalDocument.language IS NULL AND ";
	private static final String _FINDER_COLUMN_DOCSBYC_T_O_LANGUAGE_2 = "vLegalDocument.language = ? AND ";
	private static final String _FINDER_COLUMN_DOCSBYC_T_O_LANGUAGE_3 = "(vLegalDocument.language IS NULL OR vLegalDocument.language = ?) AND ";
	private static final String _FINDER_COLUMN_DOCSBYC_T_O_STATUSDOC_2 = "vLegalDocument.statusDoc = ?";
	private static final String _FINDER_COLUMN_DOCSBYG_O_T_L_S_GROUPID_2 = "vLegalDocument.groupId = ? AND ";
	private static final String _FINDER_COLUMN_DOCSBYG_O_T_L_S_ORGID_1 = "vLegalDocument.orgId IS NULL AND ";
	private static final String _FINDER_COLUMN_DOCSBYG_O_T_L_S_ORGID_2 = "vLegalDocument.orgId = ? AND ";
	private static final String _FINDER_COLUMN_DOCSBYG_O_T_L_S_ORGID_3 = "(vLegalDocument.orgId IS NULL OR vLegalDocument.orgId = ?) AND ";
	private static final String _FINDER_COLUMN_DOCSBYG_O_T_L_S_TYPEDOCID_1 = "vLegalDocument.typeDocId IS NULL AND ";
	private static final String _FINDER_COLUMN_DOCSBYG_O_T_L_S_TYPEDOCID_2 = "vLegalDocument.typeDocId = ? AND ";
	private static final String _FINDER_COLUMN_DOCSBYG_O_T_L_S_TYPEDOCID_3 = "(vLegalDocument.typeDocId IS NULL OR vLegalDocument.typeDocId = ?) AND ";
	private static final String _FINDER_COLUMN_DOCSBYG_O_T_L_S_LANGUAGE_1 = "vLegalDocument.language IS NULL AND ";
	private static final String _FINDER_COLUMN_DOCSBYG_O_T_L_S_LANGUAGE_2 = "vLegalDocument.language = ? AND ";
	private static final String _FINDER_COLUMN_DOCSBYG_O_T_L_S_LANGUAGE_3 = "(vLegalDocument.language IS NULL OR vLegalDocument.language = ?) AND ";
	private static final String _FINDER_COLUMN_DOCSBYG_O_T_L_S_STATUSDOC_2 = "vLegalDocument.statusDoc = ?";
	private static final String _FINDER_COLUMN_DOCSBYL_O_F_S_LANGUAGE_1 = "vLegalDocument.language IS NULL AND ";
	private static final String _FINDER_COLUMN_DOCSBYL_O_F_S_LANGUAGE_2 = "vLegalDocument.language = ? AND ";
	private static final String _FINDER_COLUMN_DOCSBYL_O_F_S_LANGUAGE_3 = "(vLegalDocument.language IS NULL OR vLegalDocument.language = ?) AND ";
	private static final String _FINDER_COLUMN_DOCSBYL_O_F_S_ORGID_1 = "vLegalDocument.orgId IS NULL AND ";
	private static final String _FINDER_COLUMN_DOCSBYL_O_F_S_ORGID_2 = "vLegalDocument.orgId = ? AND ";
	private static final String _FINDER_COLUMN_DOCSBYL_O_F_S_ORGID_3 = "(vLegalDocument.orgId IS NULL OR vLegalDocument.orgId = ?) AND ";
	private static final String _FINDER_COLUMN_DOCSBYL_O_F_S_FIELDID_1 = "vLegalDocument.fieldId IS NULL AND ";
	private static final String _FINDER_COLUMN_DOCSBYL_O_F_S_FIELDID_2 = "vLegalDocument.fieldId = ? AND ";
	private static final String _FINDER_COLUMN_DOCSBYL_O_F_S_FIELDID_3 = "(vLegalDocument.fieldId IS NULL OR vLegalDocument.fieldId = ?) AND ";
	private static final String _FINDER_COLUMN_DOCSBYL_O_F_S_STATUSDOC_2 = "vLegalDocument.statusDoc = ?";
	private static final String _FINDER_COLUMN_DOCSBYL_T_F_S_LANGUAGE_1 = "vLegalDocument.language IS NULL AND ";
	private static final String _FINDER_COLUMN_DOCSBYL_T_F_S_LANGUAGE_2 = "vLegalDocument.language = ? AND ";
	private static final String _FINDER_COLUMN_DOCSBYL_T_F_S_LANGUAGE_3 = "(vLegalDocument.language IS NULL OR vLegalDocument.language = ?) AND ";
	private static final String _FINDER_COLUMN_DOCSBYL_T_F_S_TYPEDOCID_1 = "vLegalDocument.typeDocId IS NULL AND ";
	private static final String _FINDER_COLUMN_DOCSBYL_T_F_S_TYPEDOCID_2 = "vLegalDocument.typeDocId = ? AND ";
	private static final String _FINDER_COLUMN_DOCSBYL_T_F_S_TYPEDOCID_3 = "(vLegalDocument.typeDocId IS NULL OR vLegalDocument.typeDocId = ?) AND ";
	private static final String _FINDER_COLUMN_DOCSBYL_T_F_S_FIELDID_1 = "vLegalDocument.fieldId IS NULL AND ";
	private static final String _FINDER_COLUMN_DOCSBYL_T_F_S_FIELDID_2 = "vLegalDocument.fieldId = ? AND ";
	private static final String _FINDER_COLUMN_DOCSBYL_T_F_S_FIELDID_3 = "(vLegalDocument.fieldId IS NULL OR vLegalDocument.fieldId = ?) AND ";
	private static final String _FINDER_COLUMN_DOCSBYL_T_F_S_STATUSDOC_2 = "vLegalDocument.statusDoc = ?";
	private static final String _FINDER_COLUMN_DOCSBYT_L_TYPEDOCID_1 = "vLegalDocument.typeDocId IS NULL AND ";
	private static final String _FINDER_COLUMN_DOCSBYT_L_TYPEDOCID_2 = "vLegalDocument.typeDocId = ? AND ";
	private static final String _FINDER_COLUMN_DOCSBYT_L_TYPEDOCID_3 = "(vLegalDocument.typeDocId IS NULL OR vLegalDocument.typeDocId = ?) AND ";
	private static final String _FINDER_COLUMN_DOCSBYT_L_LANGUAGE_1 = "vLegalDocument.language IS NULL";
	private static final String _FINDER_COLUMN_DOCSBYT_L_LANGUAGE_2 = "vLegalDocument.language = ?";
	private static final String _FINDER_COLUMN_DOCSBYT_L_LANGUAGE_3 = "(vLegalDocument.language IS NULL OR vLegalDocument.language = ?)";
	private static final String _FINDER_COLUMN_G_L_U_S_GROUPID_2 = "vLegalDocument.groupId = ? AND ";
	private static final String _FINDER_COLUMN_G_L_U_S_LANGUAGE_1 = "vLegalDocument.language IS NULL AND ";
	private static final String _FINDER_COLUMN_G_L_U_S_LANGUAGE_2 = "vLegalDocument.language = ? AND ";
	private static final String _FINDER_COLUMN_G_L_U_S_LANGUAGE_3 = "(vLegalDocument.language IS NULL OR vLegalDocument.language = ?) AND ";
	private static final String _FINDER_COLUMN_G_L_U_S_USERID_2 = "vLegalDocument.userId = ? AND ";
	private static final String _FINDER_COLUMN_G_L_U_S_STATUSDOC_2 = "vLegalDocument.statusDoc = ?";
	private static final String _FINDER_COLUMN_G_D_GROUPID_2 = "vLegalDocument.groupId = ? AND ";
	private static final String _FINDER_COLUMN_G_D_DOCID_1 = "vLegalDocument.docId IS NULL";
	private static final String _FINDER_COLUMN_G_D_DOCID_2 = "vLegalDocument.docId = ?";
	private static final String _FINDER_COLUMN_G_D_DOCID_3 = "(vLegalDocument.docId IS NULL OR vLegalDocument.docId = ?)";
	private static final String _FINDER_COLUMN_P_N_S_GROUPID_2 = "vLegalDocument.groupId = ? AND ";
	private static final String _FINDER_COLUMN_P_N_S_NUM_1 = "vLegalDocument.num IS NULL AND ";
	private static final String _FINDER_COLUMN_P_N_S_NUM_2 = "vLegalDocument.num = ? AND ";
	private static final String _FINDER_COLUMN_P_N_S_NUM_3 = "(vLegalDocument.num IS NULL OR vLegalDocument.num = ?) AND ";
	private static final String _FINDER_COLUMN_P_N_S_SYMBOL_1 = "vLegalDocument.symbol IS NULL";
	private static final String _FINDER_COLUMN_P_N_S_SYMBOL_2 = "vLegalDocument.symbol = ?";
	private static final String _FINDER_COLUMN_P_N_S_SYMBOL_3 = "(vLegalDocument.symbol IS NULL OR vLegalDocument.symbol = ?)";
	private static final String _FINDER_COLUMN_P_L_S_GROUPID_2 = "vLegalDocument.groupId = ? AND ";
	private static final String _FINDER_COLUMN_P_L_S_LANGUAGE_1 = "vLegalDocument.language IS NULL AND ";
	private static final String _FINDER_COLUMN_P_L_S_LANGUAGE_2 = "vLegalDocument.language = ? AND ";
	private static final String _FINDER_COLUMN_P_L_S_LANGUAGE_3 = "(vLegalDocument.language IS NULL OR vLegalDocument.language = ?) AND ";
	private static final String _FINDER_COLUMN_P_L_S_STATUSDOC_2 = "vLegalDocument.statusDoc = ?";
	private static final String _FINDER_COLUMN_STATUSDOC_STATUSDOC_2 = "vLegalDocument.statusDoc = ?";
	private static final String _FINDER_COLUMN_G_L_O_S_GROUPID_2 = "vLegalDocument.groupId = ? AND ";
	private static final String _FINDER_COLUMN_G_L_O_S_LANGUAGE_1 = "vLegalDocument.language IS NULL AND ";
	private static final String _FINDER_COLUMN_G_L_O_S_LANGUAGE_2 = "vLegalDocument.language = ? AND ";
	private static final String _FINDER_COLUMN_G_L_O_S_LANGUAGE_3 = "(vLegalDocument.language IS NULL OR vLegalDocument.language = ?) AND ";
	private static final String _FINDER_COLUMN_G_L_O_S_ORGID_1 = "vLegalDocument.orgId IS NULL AND ";
	private static final String _FINDER_COLUMN_G_L_O_S_ORGID_2 = "vLegalDocument.orgId = ? AND ";
	private static final String _FINDER_COLUMN_G_L_O_S_ORGID_3 = "(vLegalDocument.orgId IS NULL OR vLegalDocument.orgId = ?) AND ";
	private static final String _FINDER_COLUMN_G_L_O_S_STATUSDOC_2 = "vLegalDocument.statusDoc = ?";
	private static final String _FINDER_COLUMN_G_L_T_S_GROUPID_2 = "vLegalDocument.groupId = ? AND ";
	private static final String _FINDER_COLUMN_G_L_T_S_LANGUAGE_1 = "vLegalDocument.language IS NULL AND ";
	private static final String _FINDER_COLUMN_G_L_T_S_LANGUAGE_2 = "vLegalDocument.language = ? AND ";
	private static final String _FINDER_COLUMN_G_L_T_S_LANGUAGE_3 = "(vLegalDocument.language IS NULL OR vLegalDocument.language = ?) AND ";
	private static final String _FINDER_COLUMN_G_L_T_S_TYPEDOCID_1 = "vLegalDocument.typeDocId IS NULL AND ";
	private static final String _FINDER_COLUMN_G_L_T_S_TYPEDOCID_2 = "vLegalDocument.typeDocId = ? AND ";
	private static final String _FINDER_COLUMN_G_L_T_S_TYPEDOCID_3 = "(vLegalDocument.typeDocId IS NULL OR vLegalDocument.typeDocId = ?) AND ";
	private static final String _FINDER_COLUMN_G_L_T_S_STATUSDOC_2 = "vLegalDocument.statusDoc = ?";
	private static final String _FINDER_COLUMN_L_F_S_LANGUAGE_1 = "vLegalDocument.language IS NULL AND ";
	private static final String _FINDER_COLUMN_L_F_S_LANGUAGE_2 = "vLegalDocument.language = ? AND ";
	private static final String _FINDER_COLUMN_L_F_S_LANGUAGE_3 = "(vLegalDocument.language IS NULL OR vLegalDocument.language = ?) AND ";
	private static final String _FINDER_COLUMN_L_F_S_FIELDID_1 = "vLegalDocument.fieldId IS NULL AND ";
	private static final String _FINDER_COLUMN_L_F_S_FIELDID_2 = "vLegalDocument.fieldId = ? AND ";
	private static final String _FINDER_COLUMN_L_F_S_FIELDID_3 = "(vLegalDocument.fieldId IS NULL OR vLegalDocument.fieldId = ?) AND ";
	private static final String _FINDER_COLUMN_L_F_S_STATUSDOC_2 = "vLegalDocument.statusDoc = ?";
	private static final String _FINDER_COLUMN_G_L_F_S_GROUPID_2 = "vLegalDocument.groupId = ? AND ";
	private static final String _FINDER_COLUMN_G_L_F_S_LANGUAGE_1 = "vLegalDocument.language IS NULL AND ";
	private static final String _FINDER_COLUMN_G_L_F_S_LANGUAGE_2 = "vLegalDocument.language = ? AND ";
	private static final String _FINDER_COLUMN_G_L_F_S_LANGUAGE_3 = "(vLegalDocument.language IS NULL OR vLegalDocument.language = ?) AND ";
	private static final String _FINDER_COLUMN_G_L_F_S_FIELDID_1 = "vLegalDocument.fieldId IS NULL AND ";
	private static final String _FINDER_COLUMN_G_L_F_S_FIELDID_2 = "vLegalDocument.fieldId = ? AND ";
	private static final String _FINDER_COLUMN_G_L_F_S_FIELDID_3 = "(vLegalDocument.fieldId IS NULL OR vLegalDocument.fieldId = ?) AND ";
	private static final String _FINDER_COLUMN_G_L_F_S_STATUSDOC_2 = "vLegalDocument.statusDoc = ?";
	private static final String _FINDER_COLUMN_G_L_O_GROUPID_2 = "vLegalDocument.groupId = ? AND ";
	private static final String _FINDER_COLUMN_G_L_O_LANGUAGE_1 = "vLegalDocument.language IS NULL AND ";
	private static final String _FINDER_COLUMN_G_L_O_LANGUAGE_2 = "vLegalDocument.language = ? AND ";
	private static final String _FINDER_COLUMN_G_L_O_LANGUAGE_3 = "(vLegalDocument.language IS NULL OR vLegalDocument.language = ?) AND ";
	private static final String _FINDER_COLUMN_G_L_O_ORGID_1 = "vLegalDocument.orgId IS NULL";
	private static final String _FINDER_COLUMN_G_L_O_ORGID_2 = "vLegalDocument.orgId = ?";
	private static final String _FINDER_COLUMN_G_L_O_ORGID_3 = "(vLegalDocument.orgId IS NULL OR vLegalDocument.orgId = ?)";
	private static final String _FINDER_COLUMN_L_O_LANGUAGE_1 = "vLegalDocument.language IS NULL AND ";
	private static final String _FINDER_COLUMN_L_O_LANGUAGE_2 = "vLegalDocument.language = ? AND ";
	private static final String _FINDER_COLUMN_L_O_LANGUAGE_3 = "(vLegalDocument.language IS NULL OR vLegalDocument.language = ?) AND ";
	private static final String _FINDER_COLUMN_L_O_ORGID_1 = "vLegalDocument.orgId IS NULL AND ";
	private static final String _FINDER_COLUMN_L_O_ORGID_2 = "vLegalDocument.orgId = ? AND ";
	private static final String _FINDER_COLUMN_L_O_ORGID_3 = "(vLegalDocument.orgId IS NULL OR vLegalDocument.orgId = ?) AND ";
	private static final String _FINDER_COLUMN_L_O_STATUSDOC_2 = "vLegalDocument.statusDoc = ?";
	private static final String _FINDER_COLUMN_G_L_T_GROUPID_2 = "vLegalDocument.groupId = ? AND ";
	private static final String _FINDER_COLUMN_G_L_T_LANGUAGE_1 = "vLegalDocument.language IS NULL AND ";
	private static final String _FINDER_COLUMN_G_L_T_LANGUAGE_2 = "vLegalDocument.language = ? AND ";
	private static final String _FINDER_COLUMN_G_L_T_LANGUAGE_3 = "(vLegalDocument.language IS NULL OR vLegalDocument.language = ?) AND ";
	private static final String _FINDER_COLUMN_G_L_T_TYPEDOCID_1 = "vLegalDocument.typeDocId IS NULL";
	private static final String _FINDER_COLUMN_G_L_T_TYPEDOCID_2 = "vLegalDocument.typeDocId = ?";
	private static final String _FINDER_COLUMN_G_L_T_TYPEDOCID_3 = "(vLegalDocument.typeDocId IS NULL OR vLegalDocument.typeDocId = ?)";
	private static final String _FINDER_COLUMN_G_L_F_GROUPID_2 = "vLegalDocument.groupId = ? AND ";
	private static final String _FINDER_COLUMN_G_L_F_LANGUAGE_1 = "vLegalDocument.language IS NULL AND ";
	private static final String _FINDER_COLUMN_G_L_F_LANGUAGE_2 = "vLegalDocument.language = ? AND ";
	private static final String _FINDER_COLUMN_G_L_F_LANGUAGE_3 = "(vLegalDocument.language IS NULL OR vLegalDocument.language = ?) AND ";
	private static final String _FINDER_COLUMN_G_L_F_FIELDID_1 = "vLegalDocument.fieldId IS NULL";
	private static final String _FINDER_COLUMN_G_L_F_FIELDID_2 = "vLegalDocument.fieldId = ?";
	private static final String _FINDER_COLUMN_G_L_F_FIELDID_3 = "(vLegalDocument.fieldId IS NULL OR vLegalDocument.fieldId = ?)";
	private static final String _FINDER_COLUMN_P_U_S_GROUPID_2 = "vLegalDocument.groupId = ? AND ";
	private static final String _FINDER_COLUMN_P_U_S_CREATEDBYUSER_2 = "vLegalDocument.createdByUser = ? AND ";
	private static final String _FINDER_COLUMN_P_U_S_LANGUAGE_1 = "vLegalDocument.language IS NULL AND ";
	private static final String _FINDER_COLUMN_P_U_S_LANGUAGE_2 = "vLegalDocument.language = ? AND ";
	private static final String _FINDER_COLUMN_P_U_S_LANGUAGE_3 = "(vLegalDocument.language IS NULL OR vLegalDocument.language = ?) AND ";
	private static final String _FINDER_COLUMN_P_U_S_STATUSDOC_2 = "vLegalDocument.statusDoc = ?";
	private static final String _FINDER_COLUMN_STATUS_STATUSDOC_2 = "vLegalDocument.statusDoc = ?";
	private static final String _FINDER_COLUMN_L_S_LANGUAGE_1 = "vLegalDocument.language IS NULL AND ";
	private static final String _FINDER_COLUMN_L_S_LANGUAGE_2 = "vLegalDocument.language = ? AND ";
	private static final String _FINDER_COLUMN_L_S_LANGUAGE_3 = "(vLegalDocument.language IS NULL OR vLegalDocument.language = ?) AND ";
	private static final String _FINDER_COLUMN_L_S_STATUSDOC_2 = "vLegalDocument.statusDoc = ?";
	private static final String _ORDER_BY_ENTITY_ALIAS = "vLegalDocument.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No VLegalDocument exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No VLegalDocument exists with the key {";
	private static Log _log = LogFactoryUtil.getLog(VLegalDocumentPersistenceImpl.class);
}