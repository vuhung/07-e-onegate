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
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.InstanceFactory;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelListener;
import com.liferay.portal.service.persistence.BatchSessionUtil;
import com.liferay.portal.service.persistence.ResourcePersistence;
import com.liferay.portal.service.persistence.UserPersistence;
import com.liferay.portal.service.persistence.impl.BasePersistenceImpl;

import com.vportal.portlet.vlegal.NoSuchVLegalOrgException;
import com.vportal.portlet.vlegal.model.VLegalOrg;
import com.vportal.portlet.vlegal.model.impl.VLegalOrgImpl;
import com.vportal.portlet.vlegal.model.impl.VLegalOrgModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The persistence implementation for the v legal org service.
 *
 * <p>
 * Never modify or reference this class directly. Always use {@link VLegalOrgUtil} to access the v legal org persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
 * </p>
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author ACB
 * @see VLegalOrgPersistence
 * @see VLegalOrgUtil
 * @generated
 */
public class VLegalOrgPersistenceImpl extends BasePersistenceImpl<VLegalOrg>
	implements VLegalOrgPersistence {
	public static final String FINDER_CLASS_NAME_ENTITY = VLegalOrgImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST = FINDER_CLASS_NAME_ENTITY +
		".List";
	public static final FinderPath FINDER_PATH_FIND_BY_GROUPID = new FinderPath(VLegalOrgModelImpl.ENTITY_CACHE_ENABLED,
			VLegalOrgModelImpl.FINDER_CACHE_ENABLED, FINDER_CLASS_NAME_LIST,
			"findByGroupId",
			new String[] {
				Long.class.getName(),
				
			"java.lang.Integer", "java.lang.Integer",
				"com.liferay.portal.kernel.util.OrderByComparator"
			});
	public static final FinderPath FINDER_PATH_COUNT_BY_GROUPID = new FinderPath(VLegalOrgModelImpl.ENTITY_CACHE_ENABLED,
			VLegalOrgModelImpl.FINDER_CACHE_ENABLED, FINDER_CLASS_NAME_LIST,
			"countByGroupId", new String[] { Long.class.getName() });
	public static final FinderPath FINDER_PATH_FIND_BY_G_L = new FinderPath(VLegalOrgModelImpl.ENTITY_CACHE_ENABLED,
			VLegalOrgModelImpl.FINDER_CACHE_ENABLED, FINDER_CLASS_NAME_LIST,
			"findByG_L",
			new String[] {
				Long.class.getName(), String.class.getName(),
				
			"java.lang.Integer", "java.lang.Integer",
				"com.liferay.portal.kernel.util.OrderByComparator"
			});
	public static final FinderPath FINDER_PATH_COUNT_BY_G_L = new FinderPath(VLegalOrgModelImpl.ENTITY_CACHE_ENABLED,
			VLegalOrgModelImpl.FINDER_CACHE_ENABLED, FINDER_CLASS_NAME_LIST,
			"countByG_L",
			new String[] { Long.class.getName(), String.class.getName() });
	public static final FinderPath FINDER_PATH_FETCH_BY_G_O = new FinderPath(VLegalOrgModelImpl.ENTITY_CACHE_ENABLED,
			VLegalOrgModelImpl.FINDER_CACHE_ENABLED, FINDER_CLASS_NAME_ENTITY,
			"fetchByG_O",
			new String[] { Long.class.getName(), String.class.getName() });
	public static final FinderPath FINDER_PATH_COUNT_BY_G_O = new FinderPath(VLegalOrgModelImpl.ENTITY_CACHE_ENABLED,
			VLegalOrgModelImpl.FINDER_CACHE_ENABLED, FINDER_CLASS_NAME_LIST,
			"countByG_O",
			new String[] { Long.class.getName(), String.class.getName() });
	public static final FinderPath FINDER_PATH_FIND_BY_S_L = new FinderPath(VLegalOrgModelImpl.ENTITY_CACHE_ENABLED,
			VLegalOrgModelImpl.FINDER_CACHE_ENABLED, FINDER_CLASS_NAME_LIST,
			"findByS_L",
			new String[] {
				Long.class.getName(), Boolean.class.getName(),
				String.class.getName(),
				
			"java.lang.Integer", "java.lang.Integer",
				"com.liferay.portal.kernel.util.OrderByComparator"
			});
	public static final FinderPath FINDER_PATH_COUNT_BY_S_L = new FinderPath(VLegalOrgModelImpl.ENTITY_CACHE_ENABLED,
			VLegalOrgModelImpl.FINDER_CACHE_ENABLED, FINDER_CLASS_NAME_LIST,
			"countByS_L",
			new String[] {
				Long.class.getName(), Boolean.class.getName(),
				String.class.getName()
			});
	public static final FinderPath FINDER_PATH_FIND_BY_S_RSS = new FinderPath(VLegalOrgModelImpl.ENTITY_CACHE_ENABLED,
			VLegalOrgModelImpl.FINDER_CACHE_ENABLED, FINDER_CLASS_NAME_LIST,
			"findByS_Rss",
			new String[] {
				Long.class.getName(), Boolean.class.getName(),
				Boolean.class.getName(),
				
			"java.lang.Integer", "java.lang.Integer",
				"com.liferay.portal.kernel.util.OrderByComparator"
			});
	public static final FinderPath FINDER_PATH_COUNT_BY_S_RSS = new FinderPath(VLegalOrgModelImpl.ENTITY_CACHE_ENABLED,
			VLegalOrgModelImpl.FINDER_CACHE_ENABLED, FINDER_CLASS_NAME_LIST,
			"countByS_Rss",
			new String[] {
				Long.class.getName(), Boolean.class.getName(),
				Boolean.class.getName()
			});
	public static final FinderPath FINDER_PATH_FIND_BY_G_L_P = new FinderPath(VLegalOrgModelImpl.ENTITY_CACHE_ENABLED,
			VLegalOrgModelImpl.FINDER_CACHE_ENABLED, FINDER_CLASS_NAME_LIST,
			"findByG_L_P",
			new String[] {
				Long.class.getName(), String.class.getName(),
				String.class.getName(),
				
			"java.lang.Integer", "java.lang.Integer",
				"com.liferay.portal.kernel.util.OrderByComparator"
			});
	public static final FinderPath FINDER_PATH_COUNT_BY_G_L_P = new FinderPath(VLegalOrgModelImpl.ENTITY_CACHE_ENABLED,
			VLegalOrgModelImpl.FINDER_CACHE_ENABLED, FINDER_CLASS_NAME_LIST,
			"countByG_L_P",
			new String[] {
				Long.class.getName(), String.class.getName(),
				String.class.getName()
			});
	public static final FinderPath FINDER_PATH_FIND_BY_G_L_P_S = new FinderPath(VLegalOrgModelImpl.ENTITY_CACHE_ENABLED,
			VLegalOrgModelImpl.FINDER_CACHE_ENABLED, FINDER_CLASS_NAME_LIST,
			"findByG_L_P_S",
			new String[] {
				Long.class.getName(), String.class.getName(),
				String.class.getName(), Boolean.class.getName(),
				
			"java.lang.Integer", "java.lang.Integer",
				"com.liferay.portal.kernel.util.OrderByComparator"
			});
	public static final FinderPath FINDER_PATH_COUNT_BY_G_L_P_S = new FinderPath(VLegalOrgModelImpl.ENTITY_CACHE_ENABLED,
			VLegalOrgModelImpl.FINDER_CACHE_ENABLED, FINDER_CLASS_NAME_LIST,
			"countByG_L_P_S",
			new String[] {
				Long.class.getName(), String.class.getName(),
				String.class.getName(), Boolean.class.getName()
			});
	public static final FinderPath FINDER_PATH_FIND_ALL = new FinderPath(VLegalOrgModelImpl.ENTITY_CACHE_ENABLED,
			VLegalOrgModelImpl.FINDER_CACHE_ENABLED, FINDER_CLASS_NAME_LIST,
			"findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(VLegalOrgModelImpl.ENTITY_CACHE_ENABLED,
			VLegalOrgModelImpl.FINDER_CACHE_ENABLED, FINDER_CLASS_NAME_LIST,
			"countAll", new String[0]);

	/**
	 * Caches the v legal org in the entity cache if it is enabled.
	 *
	 * @param vLegalOrg the v legal org to cache
	 */
	public void cacheResult(VLegalOrg vLegalOrg) {
		EntityCacheUtil.putResult(VLegalOrgModelImpl.ENTITY_CACHE_ENABLED,
			VLegalOrgImpl.class, vLegalOrg.getPrimaryKey(), vLegalOrg);

		FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_G_O,
			new Object[] { new Long(vLegalOrg.getGroupId()), vLegalOrg.getOrgId() },
			vLegalOrg);
	}

	/**
	 * Caches the v legal orgs in the entity cache if it is enabled.
	 *
	 * @param vLegalOrgs the v legal orgs to cache
	 */
	public void cacheResult(List<VLegalOrg> vLegalOrgs) {
		for (VLegalOrg vLegalOrg : vLegalOrgs) {
			if (EntityCacheUtil.getResult(
						VLegalOrgModelImpl.ENTITY_CACHE_ENABLED,
						VLegalOrgImpl.class, vLegalOrg.getPrimaryKey(), this) == null) {
				cacheResult(vLegalOrg);
			}
		}
	}

	/**
	 * Clears the cache for all v legal orgs.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	public void clearCache() {
		CacheRegistryUtil.clear(VLegalOrgImpl.class.getName());
		EntityCacheUtil.clearCache(VLegalOrgImpl.class.getName());
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST);
	}

	/**
	 * Clears the cache for the v legal org.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	public void clearCache(VLegalOrg vLegalOrg) {
		EntityCacheUtil.removeResult(VLegalOrgModelImpl.ENTITY_CACHE_ENABLED,
			VLegalOrgImpl.class, vLegalOrg.getPrimaryKey());

		FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_G_O,
			new Object[] { new Long(vLegalOrg.getGroupId()), vLegalOrg.getOrgId() });
	}

	/**
	 * Creates a new v legal org with the primary key. Does not add the v legal org to the database.
	 *
	 * @param orgId the primary key for the new v legal org
	 * @return the new v legal org
	 */
	public VLegalOrg create(String orgId) {
		VLegalOrg vLegalOrg = new VLegalOrgImpl();

		vLegalOrg.setNew(true);
		vLegalOrg.setPrimaryKey(orgId);

		return vLegalOrg;
	}

	/**
	 * Removes the v legal org with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the v legal org to remove
	 * @return the v legal org that was removed
	 * @throws com.liferay.portal.NoSuchModelException if a v legal org with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public VLegalOrg remove(Serializable primaryKey)
		throws NoSuchModelException, SystemException {
		return remove((String)primaryKey);
	}

	/**
	 * Removes the v legal org with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param orgId the primary key of the v legal org to remove
	 * @return the v legal org that was removed
	 * @throws com.vportal.portlet.vlegal.NoSuchVLegalOrgException if a v legal org with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public VLegalOrg remove(String orgId)
		throws NoSuchVLegalOrgException, SystemException {
		Session session = null;

		try {
			session = openSession();

			VLegalOrg vLegalOrg = (VLegalOrg)session.get(VLegalOrgImpl.class,
					orgId);

			if (vLegalOrg == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + orgId);
				}

				throw new NoSuchVLegalOrgException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					orgId);
			}

			return remove(vLegalOrg);
		}
		catch (NoSuchVLegalOrgException nsee) {
			throw nsee;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected VLegalOrg removeImpl(VLegalOrg vLegalOrg)
		throws SystemException {
		vLegalOrg = toUnwrappedModel(vLegalOrg);

		Session session = null;

		try {
			session = openSession();

			BatchSessionUtil.delete(session, vLegalOrg);
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST);

		VLegalOrgModelImpl vLegalOrgModelImpl = (VLegalOrgModelImpl)vLegalOrg;

		FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_G_O,
			new Object[] {
				new Long(vLegalOrgModelImpl.getGroupId()),
				
			vLegalOrgModelImpl.getOrgId()
			});

		EntityCacheUtil.removeResult(VLegalOrgModelImpl.ENTITY_CACHE_ENABLED,
			VLegalOrgImpl.class, vLegalOrg.getPrimaryKey());

		return vLegalOrg;
	}

	public VLegalOrg updateImpl(
		com.vportal.portlet.vlegal.model.VLegalOrg vLegalOrg, boolean merge)
		throws SystemException {
		vLegalOrg = toUnwrappedModel(vLegalOrg);

		boolean isNew = vLegalOrg.isNew();

		VLegalOrgModelImpl vLegalOrgModelImpl = (VLegalOrgModelImpl)vLegalOrg;

		Session session = null;

		try {
			session = openSession();

			BatchSessionUtil.update(session, vLegalOrg, merge);

			vLegalOrg.setNew(false);
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST);

		EntityCacheUtil.putResult(VLegalOrgModelImpl.ENTITY_CACHE_ENABLED,
			VLegalOrgImpl.class, vLegalOrg.getPrimaryKey(), vLegalOrg);

		if (!isNew &&
				((vLegalOrg.getGroupId() != vLegalOrgModelImpl.getOriginalGroupId()) ||
				!Validator.equals(vLegalOrg.getOrgId(),
					vLegalOrgModelImpl.getOriginalOrgId()))) {
			FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_G_O,
				new Object[] {
					new Long(vLegalOrgModelImpl.getOriginalGroupId()),
					
				vLegalOrgModelImpl.getOriginalOrgId()
				});
		}

		if (isNew ||
				((vLegalOrg.getGroupId() != vLegalOrgModelImpl.getOriginalGroupId()) ||
				!Validator.equals(vLegalOrg.getOrgId(),
					vLegalOrgModelImpl.getOriginalOrgId()))) {
			FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_G_O,
				new Object[] {
					new Long(vLegalOrg.getGroupId()),
					
				vLegalOrg.getOrgId()
				}, vLegalOrg);
		}

		return vLegalOrg;
	}

	protected VLegalOrg toUnwrappedModel(VLegalOrg vLegalOrg) {
		if (vLegalOrg instanceof VLegalOrgImpl) {
			return vLegalOrg;
		}

		VLegalOrgImpl vLegalOrgImpl = new VLegalOrgImpl();

		vLegalOrgImpl.setNew(vLegalOrg.isNew());
		vLegalOrgImpl.setPrimaryKey(vLegalOrg.getPrimaryKey());

		vLegalOrgImpl.setOrgId(vLegalOrg.getOrgId());
		vLegalOrgImpl.setGroupId(vLegalOrg.getGroupId());
		vLegalOrgImpl.setCompanyId(vLegalOrg.getCompanyId());
		vLegalOrgImpl.setUserId(vLegalOrg.getUserId());
		vLegalOrgImpl.setCreatedDate(vLegalOrg.getCreatedDate());
		vLegalOrgImpl.setModifiedDate(vLegalOrg.getModifiedDate());
		vLegalOrgImpl.setCreatedByUser(vLegalOrg.getCreatedByUser());
		vLegalOrgImpl.setModifiedByUser(vLegalOrg.getModifiedByUser());
		vLegalOrgImpl.setName(vLegalOrg.getName());
		vLegalOrgImpl.setDescription(vLegalOrg.getDescription());
		vLegalOrgImpl.setParentId(vLegalOrg.getParentId());
		vLegalOrgImpl.setLanguage(vLegalOrg.getLanguage());
		vLegalOrgImpl.setStatusOrg(vLegalOrg.isStatusOrg());
		vLegalOrgImpl.setRssable(vLegalOrg.isRssable());
		vLegalOrgImpl.setPosition(vLegalOrg.getPosition());

		return vLegalOrgImpl;
	}

	/**
	 * Finds the v legal org with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the v legal org to find
	 * @return the v legal org
	 * @throws com.liferay.portal.NoSuchModelException if a v legal org with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public VLegalOrg findByPrimaryKey(Serializable primaryKey)
		throws NoSuchModelException, SystemException {
		return findByPrimaryKey((String)primaryKey);
	}

	/**
	 * Finds the v legal org with the primary key or throws a {@link com.vportal.portlet.vlegal.NoSuchVLegalOrgException} if it could not be found.
	 *
	 * @param orgId the primary key of the v legal org to find
	 * @return the v legal org
	 * @throws com.vportal.portlet.vlegal.NoSuchVLegalOrgException if a v legal org with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public VLegalOrg findByPrimaryKey(String orgId)
		throws NoSuchVLegalOrgException, SystemException {
		VLegalOrg vLegalOrg = fetchByPrimaryKey(orgId);

		if (vLegalOrg == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + orgId);
			}

			throw new NoSuchVLegalOrgException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				orgId);
		}

		return vLegalOrg;
	}

	/**
	 * Finds the v legal org with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the v legal org to find
	 * @return the v legal org, or <code>null</code> if a v legal org with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public VLegalOrg fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		return fetchByPrimaryKey((String)primaryKey);
	}

	/**
	 * Finds the v legal org with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param orgId the primary key of the v legal org to find
	 * @return the v legal org, or <code>null</code> if a v legal org with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public VLegalOrg fetchByPrimaryKey(String orgId) throws SystemException {
		VLegalOrg vLegalOrg = (VLegalOrg)EntityCacheUtil.getResult(VLegalOrgModelImpl.ENTITY_CACHE_ENABLED,
				VLegalOrgImpl.class, orgId, this);

		if (vLegalOrg == null) {
			Session session = null;

			try {
				session = openSession();

				vLegalOrg = (VLegalOrg)session.get(VLegalOrgImpl.class, orgId);
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (vLegalOrg != null) {
					cacheResult(vLegalOrg);
				}

				closeSession(session);
			}
		}

		return vLegalOrg;
	}

	/**
	 * Finds all the v legal orgs where groupId = &#63;.
	 *
	 * @param groupId the group id to search with
	 * @return the matching v legal orgs
	 * @throws SystemException if a system exception occurred
	 */
	public List<VLegalOrg> findByGroupId(long groupId)
		throws SystemException {
		return findByGroupId(groupId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Finds a range of all the v legal orgs where groupId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param groupId the group id to search with
	 * @param start the lower bound of the range of v legal orgs to return
	 * @param end the upper bound of the range of v legal orgs to return (not inclusive)
	 * @return the range of matching v legal orgs
	 * @throws SystemException if a system exception occurred
	 */
	public List<VLegalOrg> findByGroupId(long groupId, int start, int end)
		throws SystemException {
		return findByGroupId(groupId, start, end, null);
	}

	/**
	 * Finds an ordered range of all the v legal orgs where groupId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param groupId the group id to search with
	 * @param start the lower bound of the range of v legal orgs to return
	 * @param end the upper bound of the range of v legal orgs to return (not inclusive)
	 * @param orderByComparator the comparator to order the results by
	 * @return the ordered range of matching v legal orgs
	 * @throws SystemException if a system exception occurred
	 */
	public List<VLegalOrg> findByGroupId(long groupId, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		Object[] finderArgs = new Object[] {
				groupId,
				
				String.valueOf(start), String.valueOf(end),
				String.valueOf(orderByComparator)
			};

		List<VLegalOrg> list = (List<VLegalOrg>)FinderCacheUtil.getResult(FINDER_PATH_FIND_BY_GROUPID,
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

			query.append(_SQL_SELECT_VLEGALORG_WHERE);

			query.append(_FINDER_COLUMN_GROUPID_GROUPID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}

			else {
				query.append(VLegalOrgModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(groupId);

				list = (List<VLegalOrg>)QueryUtil.list(q, getDialect(), start,
						end);
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
	 * Finds the first v legal org in the ordered set where groupId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param groupId the group id to search with
	 * @param orderByComparator the comparator to order the set by
	 * @return the first matching v legal org
	 * @throws com.vportal.portlet.vlegal.NoSuchVLegalOrgException if a matching v legal org could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public VLegalOrg findByGroupId_First(long groupId,
		OrderByComparator orderByComparator)
		throws NoSuchVLegalOrgException, SystemException {
		List<VLegalOrg> list = findByGroupId(groupId, 0, 1, orderByComparator);

		if (list.isEmpty()) {
			StringBundler msg = new StringBundler(4);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("groupId=");
			msg.append(groupId);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			throw new NoSuchVLegalOrgException(msg.toString());
		}
		else {
			return list.get(0);
		}
	}

	/**
	 * Finds the last v legal org in the ordered set where groupId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param groupId the group id to search with
	 * @param orderByComparator the comparator to order the set by
	 * @return the last matching v legal org
	 * @throws com.vportal.portlet.vlegal.NoSuchVLegalOrgException if a matching v legal org could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public VLegalOrg findByGroupId_Last(long groupId,
		OrderByComparator orderByComparator)
		throws NoSuchVLegalOrgException, SystemException {
		int count = countByGroupId(groupId);

		List<VLegalOrg> list = findByGroupId(groupId, count - 1, count,
				orderByComparator);

		if (list.isEmpty()) {
			StringBundler msg = new StringBundler(4);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("groupId=");
			msg.append(groupId);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			throw new NoSuchVLegalOrgException(msg.toString());
		}
		else {
			return list.get(0);
		}
	}

	/**
	 * Finds the v legal orgs before and after the current v legal org in the ordered set where groupId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param orgId the primary key of the current v legal org
	 * @param groupId the group id to search with
	 * @param orderByComparator the comparator to order the set by
	 * @return the previous, current, and next v legal org
	 * @throws com.vportal.portlet.vlegal.NoSuchVLegalOrgException if a v legal org with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public VLegalOrg[] findByGroupId_PrevAndNext(String orgId, long groupId,
		OrderByComparator orderByComparator)
		throws NoSuchVLegalOrgException, SystemException {
		VLegalOrg vLegalOrg = findByPrimaryKey(orgId);

		Session session = null;

		try {
			session = openSession();

			VLegalOrg[] array = new VLegalOrgImpl[3];

			array[0] = getByGroupId_PrevAndNext(session, vLegalOrg, groupId,
					orderByComparator, true);

			array[1] = vLegalOrg;

			array[2] = getByGroupId_PrevAndNext(session, vLegalOrg, groupId,
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

	protected VLegalOrg getByGroupId_PrevAndNext(Session session,
		VLegalOrg vLegalOrg, long groupId, OrderByComparator orderByComparator,
		boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_VLEGALORG_WHERE);

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
			query.append(VLegalOrgModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(groupId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByValues(vLegalOrg);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<VLegalOrg> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Finds all the v legal orgs where groupId = &#63; and language = &#63;.
	 *
	 * @param groupId the group id to search with
	 * @param language the language to search with
	 * @return the matching v legal orgs
	 * @throws SystemException if a system exception occurred
	 */
	public List<VLegalOrg> findByG_L(long groupId, String language)
		throws SystemException {
		return findByG_L(groupId, language, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Finds a range of all the v legal orgs where groupId = &#63; and language = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param groupId the group id to search with
	 * @param language the language to search with
	 * @param start the lower bound of the range of v legal orgs to return
	 * @param end the upper bound of the range of v legal orgs to return (not inclusive)
	 * @return the range of matching v legal orgs
	 * @throws SystemException if a system exception occurred
	 */
	public List<VLegalOrg> findByG_L(long groupId, String language, int start,
		int end) throws SystemException {
		return findByG_L(groupId, language, start, end, null);
	}

	/**
	 * Finds an ordered range of all the v legal orgs where groupId = &#63; and language = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param groupId the group id to search with
	 * @param language the language to search with
	 * @param start the lower bound of the range of v legal orgs to return
	 * @param end the upper bound of the range of v legal orgs to return (not inclusive)
	 * @param orderByComparator the comparator to order the results by
	 * @return the ordered range of matching v legal orgs
	 * @throws SystemException if a system exception occurred
	 */
	public List<VLegalOrg> findByG_L(long groupId, String language, int start,
		int end, OrderByComparator orderByComparator) throws SystemException {
		Object[] finderArgs = new Object[] {
				groupId, language,
				
				String.valueOf(start), String.valueOf(end),
				String.valueOf(orderByComparator)
			};

		List<VLegalOrg> list = (List<VLegalOrg>)FinderCacheUtil.getResult(FINDER_PATH_FIND_BY_G_L,
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

			query.append(_SQL_SELECT_VLEGALORG_WHERE);

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
				query.append(VLegalOrgModelImpl.ORDER_BY_JPQL);
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

				list = (List<VLegalOrg>)QueryUtil.list(q, getDialect(), start,
						end);
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
	 * Finds the first v legal org in the ordered set where groupId = &#63; and language = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param groupId the group id to search with
	 * @param language the language to search with
	 * @param orderByComparator the comparator to order the set by
	 * @return the first matching v legal org
	 * @throws com.vportal.portlet.vlegal.NoSuchVLegalOrgException if a matching v legal org could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public VLegalOrg findByG_L_First(long groupId, String language,
		OrderByComparator orderByComparator)
		throws NoSuchVLegalOrgException, SystemException {
		List<VLegalOrg> list = findByG_L(groupId, language, 0, 1,
				orderByComparator);

		if (list.isEmpty()) {
			StringBundler msg = new StringBundler(6);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("groupId=");
			msg.append(groupId);

			msg.append(", language=");
			msg.append(language);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			throw new NoSuchVLegalOrgException(msg.toString());
		}
		else {
			return list.get(0);
		}
	}

	/**
	 * Finds the last v legal org in the ordered set where groupId = &#63; and language = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param groupId the group id to search with
	 * @param language the language to search with
	 * @param orderByComparator the comparator to order the set by
	 * @return the last matching v legal org
	 * @throws com.vportal.portlet.vlegal.NoSuchVLegalOrgException if a matching v legal org could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public VLegalOrg findByG_L_Last(long groupId, String language,
		OrderByComparator orderByComparator)
		throws NoSuchVLegalOrgException, SystemException {
		int count = countByG_L(groupId, language);

		List<VLegalOrg> list = findByG_L(groupId, language, count - 1, count,
				orderByComparator);

		if (list.isEmpty()) {
			StringBundler msg = new StringBundler(6);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("groupId=");
			msg.append(groupId);

			msg.append(", language=");
			msg.append(language);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			throw new NoSuchVLegalOrgException(msg.toString());
		}
		else {
			return list.get(0);
		}
	}

	/**
	 * Finds the v legal orgs before and after the current v legal org in the ordered set where groupId = &#63; and language = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param orgId the primary key of the current v legal org
	 * @param groupId the group id to search with
	 * @param language the language to search with
	 * @param orderByComparator the comparator to order the set by
	 * @return the previous, current, and next v legal org
	 * @throws com.vportal.portlet.vlegal.NoSuchVLegalOrgException if a v legal org with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public VLegalOrg[] findByG_L_PrevAndNext(String orgId, long groupId,
		String language, OrderByComparator orderByComparator)
		throws NoSuchVLegalOrgException, SystemException {
		VLegalOrg vLegalOrg = findByPrimaryKey(orgId);

		Session session = null;

		try {
			session = openSession();

			VLegalOrg[] array = new VLegalOrgImpl[3];

			array[0] = getByG_L_PrevAndNext(session, vLegalOrg, groupId,
					language, orderByComparator, true);

			array[1] = vLegalOrg;

			array[2] = getByG_L_PrevAndNext(session, vLegalOrg, groupId,
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

	protected VLegalOrg getByG_L_PrevAndNext(Session session,
		VLegalOrg vLegalOrg, long groupId, String language,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_VLEGALORG_WHERE);

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
			query.append(VLegalOrgModelImpl.ORDER_BY_JPQL);
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
			Object[] values = orderByComparator.getOrderByValues(vLegalOrg);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<VLegalOrg> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Finds the v legal org where groupId = &#63; and orgId = &#63; or throws a {@link com.vportal.portlet.vlegal.NoSuchVLegalOrgException} if it could not be found.
	 *
	 * @param groupId the group id to search with
	 * @param orgId the org id to search with
	 * @return the matching v legal org
	 * @throws com.vportal.portlet.vlegal.NoSuchVLegalOrgException if a matching v legal org could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public VLegalOrg findByG_O(long groupId, String orgId)
		throws NoSuchVLegalOrgException, SystemException {
		VLegalOrg vLegalOrg = fetchByG_O(groupId, orgId);

		if (vLegalOrg == null) {
			StringBundler msg = new StringBundler(6);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("groupId=");
			msg.append(groupId);

			msg.append(", orgId=");
			msg.append(orgId);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			if (_log.isWarnEnabled()) {
				_log.warn(msg.toString());
			}

			throw new NoSuchVLegalOrgException(msg.toString());
		}

		return vLegalOrg;
	}

	/**
	 * Finds the v legal org where groupId = &#63; and orgId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param groupId the group id to search with
	 * @param orgId the org id to search with
	 * @return the matching v legal org, or <code>null</code> if a matching v legal org could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public VLegalOrg fetchByG_O(long groupId, String orgId)
		throws SystemException {
		return fetchByG_O(groupId, orgId, true);
	}

	/**
	 * Finds the v legal org where groupId = &#63; and orgId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param groupId the group id to search with
	 * @param orgId the org id to search with
	 * @return the matching v legal org, or <code>null</code> if a matching v legal org could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public VLegalOrg fetchByG_O(long groupId, String orgId,
		boolean retrieveFromCache) throws SystemException {
		Object[] finderArgs = new Object[] { groupId, orgId };

		Object result = null;

		if (retrieveFromCache) {
			result = FinderCacheUtil.getResult(FINDER_PATH_FETCH_BY_G_O,
					finderArgs, this);
		}

		if (result == null) {
			StringBundler query = new StringBundler(4);

			query.append(_SQL_SELECT_VLEGALORG_WHERE);

			query.append(_FINDER_COLUMN_G_O_GROUPID_2);

			if (orgId == null) {
				query.append(_FINDER_COLUMN_G_O_ORGID_1);
			}
			else {
				if (orgId.equals(StringPool.BLANK)) {
					query.append(_FINDER_COLUMN_G_O_ORGID_3);
				}
				else {
					query.append(_FINDER_COLUMN_G_O_ORGID_2);
				}
			}

			query.append(VLegalOrgModelImpl.ORDER_BY_JPQL);

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

				List<VLegalOrg> list = q.list();

				result = list;

				VLegalOrg vLegalOrg = null;

				if (list.isEmpty()) {
					FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_G_O,
						finderArgs, list);
				}
				else {
					vLegalOrg = list.get(0);

					cacheResult(vLegalOrg);

					if ((vLegalOrg.getGroupId() != groupId) ||
							(vLegalOrg.getOrgId() == null) ||
							!vLegalOrg.getOrgId().equals(orgId)) {
						FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_G_O,
							finderArgs, vLegalOrg);
					}
				}

				return vLegalOrg;
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (result == null) {
					FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_G_O,
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
				return (VLegalOrg)result;
			}
		}
	}

	/**
	 * Finds all the v legal orgs where groupId = &#63; and statusOrg = &#63; and language = &#63;.
	 *
	 * @param groupId the group id to search with
	 * @param statusOrg the status org to search with
	 * @param language the language to search with
	 * @return the matching v legal orgs
	 * @throws SystemException if a system exception occurred
	 */
	public List<VLegalOrg> findByS_L(long groupId, boolean statusOrg,
		String language) throws SystemException {
		return findByS_L(groupId, statusOrg, language, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Finds a range of all the v legal orgs where groupId = &#63; and statusOrg = &#63; and language = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param groupId the group id to search with
	 * @param statusOrg the status org to search with
	 * @param language the language to search with
	 * @param start the lower bound of the range of v legal orgs to return
	 * @param end the upper bound of the range of v legal orgs to return (not inclusive)
	 * @return the range of matching v legal orgs
	 * @throws SystemException if a system exception occurred
	 */
	public List<VLegalOrg> findByS_L(long groupId, boolean statusOrg,
		String language, int start, int end) throws SystemException {
		return findByS_L(groupId, statusOrg, language, start, end, null);
	}

	/**
	 * Finds an ordered range of all the v legal orgs where groupId = &#63; and statusOrg = &#63; and language = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param groupId the group id to search with
	 * @param statusOrg the status org to search with
	 * @param language the language to search with
	 * @param start the lower bound of the range of v legal orgs to return
	 * @param end the upper bound of the range of v legal orgs to return (not inclusive)
	 * @param orderByComparator the comparator to order the results by
	 * @return the ordered range of matching v legal orgs
	 * @throws SystemException if a system exception occurred
	 */
	public List<VLegalOrg> findByS_L(long groupId, boolean statusOrg,
		String language, int start, int end, OrderByComparator orderByComparator)
		throws SystemException {
		Object[] finderArgs = new Object[] {
				groupId, statusOrg, language,
				
				String.valueOf(start), String.valueOf(end),
				String.valueOf(orderByComparator)
			};

		List<VLegalOrg> list = (List<VLegalOrg>)FinderCacheUtil.getResult(FINDER_PATH_FIND_BY_S_L,
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

			query.append(_SQL_SELECT_VLEGALORG_WHERE);

			query.append(_FINDER_COLUMN_S_L_GROUPID_2);

			query.append(_FINDER_COLUMN_S_L_STATUSORG_2);

			if (language == null) {
				query.append(_FINDER_COLUMN_S_L_LANGUAGE_1);
			}
			else {
				if (language.equals(StringPool.BLANK)) {
					query.append(_FINDER_COLUMN_S_L_LANGUAGE_3);
				}
				else {
					query.append(_FINDER_COLUMN_S_L_LANGUAGE_2);
				}
			}

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}

			else {
				query.append(VLegalOrgModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(groupId);

				qPos.add(statusOrg);

				if (language != null) {
					qPos.add(language);
				}

				list = (List<VLegalOrg>)QueryUtil.list(q, getDialect(), start,
						end);
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (list == null) {
					FinderCacheUtil.removeResult(FINDER_PATH_FIND_BY_S_L,
						finderArgs);
				}
				else {
					cacheResult(list);

					FinderCacheUtil.putResult(FINDER_PATH_FIND_BY_S_L,
						finderArgs, list);
				}

				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Finds the first v legal org in the ordered set where groupId = &#63; and statusOrg = &#63; and language = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param groupId the group id to search with
	 * @param statusOrg the status org to search with
	 * @param language the language to search with
	 * @param orderByComparator the comparator to order the set by
	 * @return the first matching v legal org
	 * @throws com.vportal.portlet.vlegal.NoSuchVLegalOrgException if a matching v legal org could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public VLegalOrg findByS_L_First(long groupId, boolean statusOrg,
		String language, OrderByComparator orderByComparator)
		throws NoSuchVLegalOrgException, SystemException {
		List<VLegalOrg> list = findByS_L(groupId, statusOrg, language, 0, 1,
				orderByComparator);

		if (list.isEmpty()) {
			StringBundler msg = new StringBundler(8);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("groupId=");
			msg.append(groupId);

			msg.append(", statusOrg=");
			msg.append(statusOrg);

			msg.append(", language=");
			msg.append(language);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			throw new NoSuchVLegalOrgException(msg.toString());
		}
		else {
			return list.get(0);
		}
	}

	/**
	 * Finds the last v legal org in the ordered set where groupId = &#63; and statusOrg = &#63; and language = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param groupId the group id to search with
	 * @param statusOrg the status org to search with
	 * @param language the language to search with
	 * @param orderByComparator the comparator to order the set by
	 * @return the last matching v legal org
	 * @throws com.vportal.portlet.vlegal.NoSuchVLegalOrgException if a matching v legal org could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public VLegalOrg findByS_L_Last(long groupId, boolean statusOrg,
		String language, OrderByComparator orderByComparator)
		throws NoSuchVLegalOrgException, SystemException {
		int count = countByS_L(groupId, statusOrg, language);

		List<VLegalOrg> list = findByS_L(groupId, statusOrg, language,
				count - 1, count, orderByComparator);

		if (list.isEmpty()) {
			StringBundler msg = new StringBundler(8);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("groupId=");
			msg.append(groupId);

			msg.append(", statusOrg=");
			msg.append(statusOrg);

			msg.append(", language=");
			msg.append(language);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			throw new NoSuchVLegalOrgException(msg.toString());
		}
		else {
			return list.get(0);
		}
	}

	/**
	 * Finds the v legal orgs before and after the current v legal org in the ordered set where groupId = &#63; and statusOrg = &#63; and language = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param orgId the primary key of the current v legal org
	 * @param groupId the group id to search with
	 * @param statusOrg the status org to search with
	 * @param language the language to search with
	 * @param orderByComparator the comparator to order the set by
	 * @return the previous, current, and next v legal org
	 * @throws com.vportal.portlet.vlegal.NoSuchVLegalOrgException if a v legal org with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public VLegalOrg[] findByS_L_PrevAndNext(String orgId, long groupId,
		boolean statusOrg, String language, OrderByComparator orderByComparator)
		throws NoSuchVLegalOrgException, SystemException {
		VLegalOrg vLegalOrg = findByPrimaryKey(orgId);

		Session session = null;

		try {
			session = openSession();

			VLegalOrg[] array = new VLegalOrgImpl[3];

			array[0] = getByS_L_PrevAndNext(session, vLegalOrg, groupId,
					statusOrg, language, orderByComparator, true);

			array[1] = vLegalOrg;

			array[2] = getByS_L_PrevAndNext(session, vLegalOrg, groupId,
					statusOrg, language, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected VLegalOrg getByS_L_PrevAndNext(Session session,
		VLegalOrg vLegalOrg, long groupId, boolean statusOrg, String language,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_VLEGALORG_WHERE);

		query.append(_FINDER_COLUMN_S_L_GROUPID_2);

		query.append(_FINDER_COLUMN_S_L_STATUSORG_2);

		if (language == null) {
			query.append(_FINDER_COLUMN_S_L_LANGUAGE_1);
		}
		else {
			if (language.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_S_L_LANGUAGE_3);
			}
			else {
				query.append(_FINDER_COLUMN_S_L_LANGUAGE_2);
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
			query.append(VLegalOrgModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(groupId);

		qPos.add(statusOrg);

		if (language != null) {
			qPos.add(language);
		}

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByValues(vLegalOrg);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<VLegalOrg> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Finds all the v legal orgs where groupId = &#63; and statusOrg = &#63; and rssable = &#63;.
	 *
	 * @param groupId the group id to search with
	 * @param statusOrg the status org to search with
	 * @param rssable the rssable to search with
	 * @return the matching v legal orgs
	 * @throws SystemException if a system exception occurred
	 */
	public List<VLegalOrg> findByS_Rss(long groupId, boolean statusOrg,
		boolean rssable) throws SystemException {
		return findByS_Rss(groupId, statusOrg, rssable, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Finds a range of all the v legal orgs where groupId = &#63; and statusOrg = &#63; and rssable = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param groupId the group id to search with
	 * @param statusOrg the status org to search with
	 * @param rssable the rssable to search with
	 * @param start the lower bound of the range of v legal orgs to return
	 * @param end the upper bound of the range of v legal orgs to return (not inclusive)
	 * @return the range of matching v legal orgs
	 * @throws SystemException if a system exception occurred
	 */
	public List<VLegalOrg> findByS_Rss(long groupId, boolean statusOrg,
		boolean rssable, int start, int end) throws SystemException {
		return findByS_Rss(groupId, statusOrg, rssable, start, end, null);
	}

	/**
	 * Finds an ordered range of all the v legal orgs where groupId = &#63; and statusOrg = &#63; and rssable = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param groupId the group id to search with
	 * @param statusOrg the status org to search with
	 * @param rssable the rssable to search with
	 * @param start the lower bound of the range of v legal orgs to return
	 * @param end the upper bound of the range of v legal orgs to return (not inclusive)
	 * @param orderByComparator the comparator to order the results by
	 * @return the ordered range of matching v legal orgs
	 * @throws SystemException if a system exception occurred
	 */
	public List<VLegalOrg> findByS_Rss(long groupId, boolean statusOrg,
		boolean rssable, int start, int end, OrderByComparator orderByComparator)
		throws SystemException {
		Object[] finderArgs = new Object[] {
				groupId, statusOrg, rssable,
				
				String.valueOf(start), String.valueOf(end),
				String.valueOf(orderByComparator)
			};

		List<VLegalOrg> list = (List<VLegalOrg>)FinderCacheUtil.getResult(FINDER_PATH_FIND_BY_S_RSS,
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

			query.append(_SQL_SELECT_VLEGALORG_WHERE);

			query.append(_FINDER_COLUMN_S_RSS_GROUPID_2);

			query.append(_FINDER_COLUMN_S_RSS_STATUSORG_2);

			query.append(_FINDER_COLUMN_S_RSS_RSSABLE_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}

			else {
				query.append(VLegalOrgModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(groupId);

				qPos.add(statusOrg);

				qPos.add(rssable);

				list = (List<VLegalOrg>)QueryUtil.list(q, getDialect(), start,
						end);
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (list == null) {
					FinderCacheUtil.removeResult(FINDER_PATH_FIND_BY_S_RSS,
						finderArgs);
				}
				else {
					cacheResult(list);

					FinderCacheUtil.putResult(FINDER_PATH_FIND_BY_S_RSS,
						finderArgs, list);
				}

				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Finds the first v legal org in the ordered set where groupId = &#63; and statusOrg = &#63; and rssable = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param groupId the group id to search with
	 * @param statusOrg the status org to search with
	 * @param rssable the rssable to search with
	 * @param orderByComparator the comparator to order the set by
	 * @return the first matching v legal org
	 * @throws com.vportal.portlet.vlegal.NoSuchVLegalOrgException if a matching v legal org could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public VLegalOrg findByS_Rss_First(long groupId, boolean statusOrg,
		boolean rssable, OrderByComparator orderByComparator)
		throws NoSuchVLegalOrgException, SystemException {
		List<VLegalOrg> list = findByS_Rss(groupId, statusOrg, rssable, 0, 1,
				orderByComparator);

		if (list.isEmpty()) {
			StringBundler msg = new StringBundler(8);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("groupId=");
			msg.append(groupId);

			msg.append(", statusOrg=");
			msg.append(statusOrg);

			msg.append(", rssable=");
			msg.append(rssable);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			throw new NoSuchVLegalOrgException(msg.toString());
		}
		else {
			return list.get(0);
		}
	}

	/**
	 * Finds the last v legal org in the ordered set where groupId = &#63; and statusOrg = &#63; and rssable = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param groupId the group id to search with
	 * @param statusOrg the status org to search with
	 * @param rssable the rssable to search with
	 * @param orderByComparator the comparator to order the set by
	 * @return the last matching v legal org
	 * @throws com.vportal.portlet.vlegal.NoSuchVLegalOrgException if a matching v legal org could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public VLegalOrg findByS_Rss_Last(long groupId, boolean statusOrg,
		boolean rssable, OrderByComparator orderByComparator)
		throws NoSuchVLegalOrgException, SystemException {
		int count = countByS_Rss(groupId, statusOrg, rssable);

		List<VLegalOrg> list = findByS_Rss(groupId, statusOrg, rssable,
				count - 1, count, orderByComparator);

		if (list.isEmpty()) {
			StringBundler msg = new StringBundler(8);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("groupId=");
			msg.append(groupId);

			msg.append(", statusOrg=");
			msg.append(statusOrg);

			msg.append(", rssable=");
			msg.append(rssable);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			throw new NoSuchVLegalOrgException(msg.toString());
		}
		else {
			return list.get(0);
		}
	}

	/**
	 * Finds the v legal orgs before and after the current v legal org in the ordered set where groupId = &#63; and statusOrg = &#63; and rssable = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param orgId the primary key of the current v legal org
	 * @param groupId the group id to search with
	 * @param statusOrg the status org to search with
	 * @param rssable the rssable to search with
	 * @param orderByComparator the comparator to order the set by
	 * @return the previous, current, and next v legal org
	 * @throws com.vportal.portlet.vlegal.NoSuchVLegalOrgException if a v legal org with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public VLegalOrg[] findByS_Rss_PrevAndNext(String orgId, long groupId,
		boolean statusOrg, boolean rssable, OrderByComparator orderByComparator)
		throws NoSuchVLegalOrgException, SystemException {
		VLegalOrg vLegalOrg = findByPrimaryKey(orgId);

		Session session = null;

		try {
			session = openSession();

			VLegalOrg[] array = new VLegalOrgImpl[3];

			array[0] = getByS_Rss_PrevAndNext(session, vLegalOrg, groupId,
					statusOrg, rssable, orderByComparator, true);

			array[1] = vLegalOrg;

			array[2] = getByS_Rss_PrevAndNext(session, vLegalOrg, groupId,
					statusOrg, rssable, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected VLegalOrg getByS_Rss_PrevAndNext(Session session,
		VLegalOrg vLegalOrg, long groupId, boolean statusOrg, boolean rssable,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_VLEGALORG_WHERE);

		query.append(_FINDER_COLUMN_S_RSS_GROUPID_2);

		query.append(_FINDER_COLUMN_S_RSS_STATUSORG_2);

		query.append(_FINDER_COLUMN_S_RSS_RSSABLE_2);

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
			query.append(VLegalOrgModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(groupId);

		qPos.add(statusOrg);

		qPos.add(rssable);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByValues(vLegalOrg);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<VLegalOrg> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Finds all the v legal orgs where groupId = &#63; and language = &#63; and parentId = &#63;.
	 *
	 * @param groupId the group id to search with
	 * @param language the language to search with
	 * @param parentId the parent id to search with
	 * @return the matching v legal orgs
	 * @throws SystemException if a system exception occurred
	 */
	public List<VLegalOrg> findByG_L_P(long groupId, String language,
		String parentId) throws SystemException {
		return findByG_L_P(groupId, language, parentId, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Finds a range of all the v legal orgs where groupId = &#63; and language = &#63; and parentId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param groupId the group id to search with
	 * @param language the language to search with
	 * @param parentId the parent id to search with
	 * @param start the lower bound of the range of v legal orgs to return
	 * @param end the upper bound of the range of v legal orgs to return (not inclusive)
	 * @return the range of matching v legal orgs
	 * @throws SystemException if a system exception occurred
	 */
	public List<VLegalOrg> findByG_L_P(long groupId, String language,
		String parentId, int start, int end) throws SystemException {
		return findByG_L_P(groupId, language, parentId, start, end, null);
	}

	/**
	 * Finds an ordered range of all the v legal orgs where groupId = &#63; and language = &#63; and parentId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param groupId the group id to search with
	 * @param language the language to search with
	 * @param parentId the parent id to search with
	 * @param start the lower bound of the range of v legal orgs to return
	 * @param end the upper bound of the range of v legal orgs to return (not inclusive)
	 * @param orderByComparator the comparator to order the results by
	 * @return the ordered range of matching v legal orgs
	 * @throws SystemException if a system exception occurred
	 */
	public List<VLegalOrg> findByG_L_P(long groupId, String language,
		String parentId, int start, int end, OrderByComparator orderByComparator)
		throws SystemException {
		Object[] finderArgs = new Object[] {
				groupId, language, parentId,
				
				String.valueOf(start), String.valueOf(end),
				String.valueOf(orderByComparator)
			};

		List<VLegalOrg> list = (List<VLegalOrg>)FinderCacheUtil.getResult(FINDER_PATH_FIND_BY_G_L_P,
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

			query.append(_SQL_SELECT_VLEGALORG_WHERE);

			query.append(_FINDER_COLUMN_G_L_P_GROUPID_2);

			if (language == null) {
				query.append(_FINDER_COLUMN_G_L_P_LANGUAGE_1);
			}
			else {
				if (language.equals(StringPool.BLANK)) {
					query.append(_FINDER_COLUMN_G_L_P_LANGUAGE_3);
				}
				else {
					query.append(_FINDER_COLUMN_G_L_P_LANGUAGE_2);
				}
			}

			if (parentId == null) {
				query.append(_FINDER_COLUMN_G_L_P_PARENTID_1);
			}
			else {
				if (parentId.equals(StringPool.BLANK)) {
					query.append(_FINDER_COLUMN_G_L_P_PARENTID_3);
				}
				else {
					query.append(_FINDER_COLUMN_G_L_P_PARENTID_2);
				}
			}

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}

			else {
				query.append(VLegalOrgModelImpl.ORDER_BY_JPQL);
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

				if (parentId != null) {
					qPos.add(parentId);
				}

				list = (List<VLegalOrg>)QueryUtil.list(q, getDialect(), start,
						end);
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (list == null) {
					FinderCacheUtil.removeResult(FINDER_PATH_FIND_BY_G_L_P,
						finderArgs);
				}
				else {
					cacheResult(list);

					FinderCacheUtil.putResult(FINDER_PATH_FIND_BY_G_L_P,
						finderArgs, list);
				}

				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Finds the first v legal org in the ordered set where groupId = &#63; and language = &#63; and parentId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param groupId the group id to search with
	 * @param language the language to search with
	 * @param parentId the parent id to search with
	 * @param orderByComparator the comparator to order the set by
	 * @return the first matching v legal org
	 * @throws com.vportal.portlet.vlegal.NoSuchVLegalOrgException if a matching v legal org could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public VLegalOrg findByG_L_P_First(long groupId, String language,
		String parentId, OrderByComparator orderByComparator)
		throws NoSuchVLegalOrgException, SystemException {
		List<VLegalOrg> list = findByG_L_P(groupId, language, parentId, 0, 1,
				orderByComparator);

		if (list.isEmpty()) {
			StringBundler msg = new StringBundler(8);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("groupId=");
			msg.append(groupId);

			msg.append(", language=");
			msg.append(language);

			msg.append(", parentId=");
			msg.append(parentId);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			throw new NoSuchVLegalOrgException(msg.toString());
		}
		else {
			return list.get(0);
		}
	}

	/**
	 * Finds the last v legal org in the ordered set where groupId = &#63; and language = &#63; and parentId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param groupId the group id to search with
	 * @param language the language to search with
	 * @param parentId the parent id to search with
	 * @param orderByComparator the comparator to order the set by
	 * @return the last matching v legal org
	 * @throws com.vportal.portlet.vlegal.NoSuchVLegalOrgException if a matching v legal org could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public VLegalOrg findByG_L_P_Last(long groupId, String language,
		String parentId, OrderByComparator orderByComparator)
		throws NoSuchVLegalOrgException, SystemException {
		int count = countByG_L_P(groupId, language, parentId);

		List<VLegalOrg> list = findByG_L_P(groupId, language, parentId,
				count - 1, count, orderByComparator);

		if (list.isEmpty()) {
			StringBundler msg = new StringBundler(8);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("groupId=");
			msg.append(groupId);

			msg.append(", language=");
			msg.append(language);

			msg.append(", parentId=");
			msg.append(parentId);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			throw new NoSuchVLegalOrgException(msg.toString());
		}
		else {
			return list.get(0);
		}
	}

	/**
	 * Finds the v legal orgs before and after the current v legal org in the ordered set where groupId = &#63; and language = &#63; and parentId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param orgId the primary key of the current v legal org
	 * @param groupId the group id to search with
	 * @param language the language to search with
	 * @param parentId the parent id to search with
	 * @param orderByComparator the comparator to order the set by
	 * @return the previous, current, and next v legal org
	 * @throws com.vportal.portlet.vlegal.NoSuchVLegalOrgException if a v legal org with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public VLegalOrg[] findByG_L_P_PrevAndNext(String orgId, long groupId,
		String language, String parentId, OrderByComparator orderByComparator)
		throws NoSuchVLegalOrgException, SystemException {
		VLegalOrg vLegalOrg = findByPrimaryKey(orgId);

		Session session = null;

		try {
			session = openSession();

			VLegalOrg[] array = new VLegalOrgImpl[3];

			array[0] = getByG_L_P_PrevAndNext(session, vLegalOrg, groupId,
					language, parentId, orderByComparator, true);

			array[1] = vLegalOrg;

			array[2] = getByG_L_P_PrevAndNext(session, vLegalOrg, groupId,
					language, parentId, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected VLegalOrg getByG_L_P_PrevAndNext(Session session,
		VLegalOrg vLegalOrg, long groupId, String language, String parentId,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_VLEGALORG_WHERE);

		query.append(_FINDER_COLUMN_G_L_P_GROUPID_2);

		if (language == null) {
			query.append(_FINDER_COLUMN_G_L_P_LANGUAGE_1);
		}
		else {
			if (language.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_G_L_P_LANGUAGE_3);
			}
			else {
				query.append(_FINDER_COLUMN_G_L_P_LANGUAGE_2);
			}
		}

		if (parentId == null) {
			query.append(_FINDER_COLUMN_G_L_P_PARENTID_1);
		}
		else {
			if (parentId.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_G_L_P_PARENTID_3);
			}
			else {
				query.append(_FINDER_COLUMN_G_L_P_PARENTID_2);
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
			query.append(VLegalOrgModelImpl.ORDER_BY_JPQL);
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

		if (parentId != null) {
			qPos.add(parentId);
		}

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByValues(vLegalOrg);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<VLegalOrg> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Finds all the v legal orgs where groupId = &#63; and language = &#63; and parentId = &#63; and statusOrg = &#63;.
	 *
	 * @param groupId the group id to search with
	 * @param language the language to search with
	 * @param parentId the parent id to search with
	 * @param statusOrg the status org to search with
	 * @return the matching v legal orgs
	 * @throws SystemException if a system exception occurred
	 */
	public List<VLegalOrg> findByG_L_P_S(long groupId, String language,
		String parentId, boolean statusOrg) throws SystemException {
		return findByG_L_P_S(groupId, language, parentId, statusOrg,
			QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Finds a range of all the v legal orgs where groupId = &#63; and language = &#63; and parentId = &#63; and statusOrg = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param groupId the group id to search with
	 * @param language the language to search with
	 * @param parentId the parent id to search with
	 * @param statusOrg the status org to search with
	 * @param start the lower bound of the range of v legal orgs to return
	 * @param end the upper bound of the range of v legal orgs to return (not inclusive)
	 * @return the range of matching v legal orgs
	 * @throws SystemException if a system exception occurred
	 */
	public List<VLegalOrg> findByG_L_P_S(long groupId, String language,
		String parentId, boolean statusOrg, int start, int end)
		throws SystemException {
		return findByG_L_P_S(groupId, language, parentId, statusOrg, start,
			end, null);
	}

	/**
	 * Finds an ordered range of all the v legal orgs where groupId = &#63; and language = &#63; and parentId = &#63; and statusOrg = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param groupId the group id to search with
	 * @param language the language to search with
	 * @param parentId the parent id to search with
	 * @param statusOrg the status org to search with
	 * @param start the lower bound of the range of v legal orgs to return
	 * @param end the upper bound of the range of v legal orgs to return (not inclusive)
	 * @param orderByComparator the comparator to order the results by
	 * @return the ordered range of matching v legal orgs
	 * @throws SystemException if a system exception occurred
	 */
	public List<VLegalOrg> findByG_L_P_S(long groupId, String language,
		String parentId, boolean statusOrg, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		Object[] finderArgs = new Object[] {
				groupId, language, parentId, statusOrg,
				
				String.valueOf(start), String.valueOf(end),
				String.valueOf(orderByComparator)
			};

		List<VLegalOrg> list = (List<VLegalOrg>)FinderCacheUtil.getResult(FINDER_PATH_FIND_BY_G_L_P_S,
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

			query.append(_SQL_SELECT_VLEGALORG_WHERE);

			query.append(_FINDER_COLUMN_G_L_P_S_GROUPID_2);

			if (language == null) {
				query.append(_FINDER_COLUMN_G_L_P_S_LANGUAGE_1);
			}
			else {
				if (language.equals(StringPool.BLANK)) {
					query.append(_FINDER_COLUMN_G_L_P_S_LANGUAGE_3);
				}
				else {
					query.append(_FINDER_COLUMN_G_L_P_S_LANGUAGE_2);
				}
			}

			if (parentId == null) {
				query.append(_FINDER_COLUMN_G_L_P_S_PARENTID_1);
			}
			else {
				if (parentId.equals(StringPool.BLANK)) {
					query.append(_FINDER_COLUMN_G_L_P_S_PARENTID_3);
				}
				else {
					query.append(_FINDER_COLUMN_G_L_P_S_PARENTID_2);
				}
			}

			query.append(_FINDER_COLUMN_G_L_P_S_STATUSORG_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}

			else {
				query.append(VLegalOrgModelImpl.ORDER_BY_JPQL);
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

				if (parentId != null) {
					qPos.add(parentId);
				}

				qPos.add(statusOrg);

				list = (List<VLegalOrg>)QueryUtil.list(q, getDialect(), start,
						end);
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (list == null) {
					FinderCacheUtil.removeResult(FINDER_PATH_FIND_BY_G_L_P_S,
						finderArgs);
				}
				else {
					cacheResult(list);

					FinderCacheUtil.putResult(FINDER_PATH_FIND_BY_G_L_P_S,
						finderArgs, list);
				}

				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Finds the first v legal org in the ordered set where groupId = &#63; and language = &#63; and parentId = &#63; and statusOrg = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param groupId the group id to search with
	 * @param language the language to search with
	 * @param parentId the parent id to search with
	 * @param statusOrg the status org to search with
	 * @param orderByComparator the comparator to order the set by
	 * @return the first matching v legal org
	 * @throws com.vportal.portlet.vlegal.NoSuchVLegalOrgException if a matching v legal org could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public VLegalOrg findByG_L_P_S_First(long groupId, String language,
		String parentId, boolean statusOrg, OrderByComparator orderByComparator)
		throws NoSuchVLegalOrgException, SystemException {
		List<VLegalOrg> list = findByG_L_P_S(groupId, language, parentId,
				statusOrg, 0, 1, orderByComparator);

		if (list.isEmpty()) {
			StringBundler msg = new StringBundler(10);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("groupId=");
			msg.append(groupId);

			msg.append(", language=");
			msg.append(language);

			msg.append(", parentId=");
			msg.append(parentId);

			msg.append(", statusOrg=");
			msg.append(statusOrg);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			throw new NoSuchVLegalOrgException(msg.toString());
		}
		else {
			return list.get(0);
		}
	}

	/**
	 * Finds the last v legal org in the ordered set where groupId = &#63; and language = &#63; and parentId = &#63; and statusOrg = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param groupId the group id to search with
	 * @param language the language to search with
	 * @param parentId the parent id to search with
	 * @param statusOrg the status org to search with
	 * @param orderByComparator the comparator to order the set by
	 * @return the last matching v legal org
	 * @throws com.vportal.portlet.vlegal.NoSuchVLegalOrgException if a matching v legal org could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public VLegalOrg findByG_L_P_S_Last(long groupId, String language,
		String parentId, boolean statusOrg, OrderByComparator orderByComparator)
		throws NoSuchVLegalOrgException, SystemException {
		int count = countByG_L_P_S(groupId, language, parentId, statusOrg);

		List<VLegalOrg> list = findByG_L_P_S(groupId, language, parentId,
				statusOrg, count - 1, count, orderByComparator);

		if (list.isEmpty()) {
			StringBundler msg = new StringBundler(10);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("groupId=");
			msg.append(groupId);

			msg.append(", language=");
			msg.append(language);

			msg.append(", parentId=");
			msg.append(parentId);

			msg.append(", statusOrg=");
			msg.append(statusOrg);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			throw new NoSuchVLegalOrgException(msg.toString());
		}
		else {
			return list.get(0);
		}
	}

	/**
	 * Finds the v legal orgs before and after the current v legal org in the ordered set where groupId = &#63; and language = &#63; and parentId = &#63; and statusOrg = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param orgId the primary key of the current v legal org
	 * @param groupId the group id to search with
	 * @param language the language to search with
	 * @param parentId the parent id to search with
	 * @param statusOrg the status org to search with
	 * @param orderByComparator the comparator to order the set by
	 * @return the previous, current, and next v legal org
	 * @throws com.vportal.portlet.vlegal.NoSuchVLegalOrgException if a v legal org with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public VLegalOrg[] findByG_L_P_S_PrevAndNext(String orgId, long groupId,
		String language, String parentId, boolean statusOrg,
		OrderByComparator orderByComparator)
		throws NoSuchVLegalOrgException, SystemException {
		VLegalOrg vLegalOrg = findByPrimaryKey(orgId);

		Session session = null;

		try {
			session = openSession();

			VLegalOrg[] array = new VLegalOrgImpl[3];

			array[0] = getByG_L_P_S_PrevAndNext(session, vLegalOrg, groupId,
					language, parentId, statusOrg, orderByComparator, true);

			array[1] = vLegalOrg;

			array[2] = getByG_L_P_S_PrevAndNext(session, vLegalOrg, groupId,
					language, parentId, statusOrg, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected VLegalOrg getByG_L_P_S_PrevAndNext(Session session,
		VLegalOrg vLegalOrg, long groupId, String language, String parentId,
		boolean statusOrg, OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_VLEGALORG_WHERE);

		query.append(_FINDER_COLUMN_G_L_P_S_GROUPID_2);

		if (language == null) {
			query.append(_FINDER_COLUMN_G_L_P_S_LANGUAGE_1);
		}
		else {
			if (language.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_G_L_P_S_LANGUAGE_3);
			}
			else {
				query.append(_FINDER_COLUMN_G_L_P_S_LANGUAGE_2);
			}
		}

		if (parentId == null) {
			query.append(_FINDER_COLUMN_G_L_P_S_PARENTID_1);
		}
		else {
			if (parentId.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_G_L_P_S_PARENTID_3);
			}
			else {
				query.append(_FINDER_COLUMN_G_L_P_S_PARENTID_2);
			}
		}

		query.append(_FINDER_COLUMN_G_L_P_S_STATUSORG_2);

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
			query.append(VLegalOrgModelImpl.ORDER_BY_JPQL);
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

		if (parentId != null) {
			qPos.add(parentId);
		}

		qPos.add(statusOrg);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByValues(vLegalOrg);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<VLegalOrg> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Finds all the v legal orgs.
	 *
	 * @return the v legal orgs
	 * @throws SystemException if a system exception occurred
	 */
	public List<VLegalOrg> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Finds a range of all the v legal orgs.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param start the lower bound of the range of v legal orgs to return
	 * @param end the upper bound of the range of v legal orgs to return (not inclusive)
	 * @return the range of v legal orgs
	 * @throws SystemException if a system exception occurred
	 */
	public List<VLegalOrg> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Finds an ordered range of all the v legal orgs.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param start the lower bound of the range of v legal orgs to return
	 * @param end the upper bound of the range of v legal orgs to return (not inclusive)
	 * @param orderByComparator the comparator to order the results by
	 * @return the ordered range of v legal orgs
	 * @throws SystemException if a system exception occurred
	 */
	public List<VLegalOrg> findAll(int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		Object[] finderArgs = new Object[] {
				String.valueOf(start), String.valueOf(end),
				String.valueOf(orderByComparator)
			};

		List<VLegalOrg> list = (List<VLegalOrg>)FinderCacheUtil.getResult(FINDER_PATH_FIND_ALL,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_VLEGALORG);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_VLEGALORG.concat(VLegalOrgModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (orderByComparator == null) {
					list = (List<VLegalOrg>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);
				}
				else {
					list = (List<VLegalOrg>)QueryUtil.list(q, getDialect(),
							start, end);
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
	 * Removes all the v legal orgs where groupId = &#63; from the database.
	 *
	 * @param groupId the group id to search with
	 * @throws SystemException if a system exception occurred
	 */
	public void removeByGroupId(long groupId) throws SystemException {
		for (VLegalOrg vLegalOrg : findByGroupId(groupId)) {
			remove(vLegalOrg);
		}
	}

	/**
	 * Removes all the v legal orgs where groupId = &#63; and language = &#63; from the database.
	 *
	 * @param groupId the group id to search with
	 * @param language the language to search with
	 * @throws SystemException if a system exception occurred
	 */
	public void removeByG_L(long groupId, String language)
		throws SystemException {
		for (VLegalOrg vLegalOrg : findByG_L(groupId, language)) {
			remove(vLegalOrg);
		}
	}

	/**
	 * Removes the v legal org where groupId = &#63; and orgId = &#63; from the database.
	 *
	 * @param groupId the group id to search with
	 * @param orgId the org id to search with
	 * @throws SystemException if a system exception occurred
	 */
	public void removeByG_O(long groupId, String orgId)
		throws NoSuchVLegalOrgException, SystemException {
		VLegalOrg vLegalOrg = findByG_O(groupId, orgId);

		remove(vLegalOrg);
	}

	/**
	 * Removes all the v legal orgs where groupId = &#63; and statusOrg = &#63; and language = &#63; from the database.
	 *
	 * @param groupId the group id to search with
	 * @param statusOrg the status org to search with
	 * @param language the language to search with
	 * @throws SystemException if a system exception occurred
	 */
	public void removeByS_L(long groupId, boolean statusOrg, String language)
		throws SystemException {
		for (VLegalOrg vLegalOrg : findByS_L(groupId, statusOrg, language)) {
			remove(vLegalOrg);
		}
	}

	/**
	 * Removes all the v legal orgs where groupId = &#63; and statusOrg = &#63; and rssable = &#63; from the database.
	 *
	 * @param groupId the group id to search with
	 * @param statusOrg the status org to search with
	 * @param rssable the rssable to search with
	 * @throws SystemException if a system exception occurred
	 */
	public void removeByS_Rss(long groupId, boolean statusOrg, boolean rssable)
		throws SystemException {
		for (VLegalOrg vLegalOrg : findByS_Rss(groupId, statusOrg, rssable)) {
			remove(vLegalOrg);
		}
	}

	/**
	 * Removes all the v legal orgs where groupId = &#63; and language = &#63; and parentId = &#63; from the database.
	 *
	 * @param groupId the group id to search with
	 * @param language the language to search with
	 * @param parentId the parent id to search with
	 * @throws SystemException if a system exception occurred
	 */
	public void removeByG_L_P(long groupId, String language, String parentId)
		throws SystemException {
		for (VLegalOrg vLegalOrg : findByG_L_P(groupId, language, parentId)) {
			remove(vLegalOrg);
		}
	}

	/**
	 * Removes all the v legal orgs where groupId = &#63; and language = &#63; and parentId = &#63; and statusOrg = &#63; from the database.
	 *
	 * @param groupId the group id to search with
	 * @param language the language to search with
	 * @param parentId the parent id to search with
	 * @param statusOrg the status org to search with
	 * @throws SystemException if a system exception occurred
	 */
	public void removeByG_L_P_S(long groupId, String language, String parentId,
		boolean statusOrg) throws SystemException {
		for (VLegalOrg vLegalOrg : findByG_L_P_S(groupId, language, parentId,
				statusOrg)) {
			remove(vLegalOrg);
		}
	}

	/**
	 * Removes all the v legal orgs from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	public void removeAll() throws SystemException {
		for (VLegalOrg vLegalOrg : findAll()) {
			remove(vLegalOrg);
		}
	}

	/**
	 * Counts all the v legal orgs where groupId = &#63;.
	 *
	 * @param groupId the group id to search with
	 * @return the number of matching v legal orgs
	 * @throws SystemException if a system exception occurred
	 */
	public int countByGroupId(long groupId) throws SystemException {
		Object[] finderArgs = new Object[] { groupId };

		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_BY_GROUPID,
				finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_VLEGALORG_WHERE);

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
	 * Counts all the v legal orgs where groupId = &#63; and language = &#63;.
	 *
	 * @param groupId the group id to search with
	 * @param language the language to search with
	 * @return the number of matching v legal orgs
	 * @throws SystemException if a system exception occurred
	 */
	public int countByG_L(long groupId, String language)
		throws SystemException {
		Object[] finderArgs = new Object[] { groupId, language };

		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_BY_G_L,
				finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_VLEGALORG_WHERE);

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
	 * Counts all the v legal orgs where groupId = &#63; and orgId = &#63;.
	 *
	 * @param groupId the group id to search with
	 * @param orgId the org id to search with
	 * @return the number of matching v legal orgs
	 * @throws SystemException if a system exception occurred
	 */
	public int countByG_O(long groupId, String orgId) throws SystemException {
		Object[] finderArgs = new Object[] { groupId, orgId };

		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_BY_G_O,
				finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_VLEGALORG_WHERE);

			query.append(_FINDER_COLUMN_G_O_GROUPID_2);

			if (orgId == null) {
				query.append(_FINDER_COLUMN_G_O_ORGID_1);
			}
			else {
				if (orgId.equals(StringPool.BLANK)) {
					query.append(_FINDER_COLUMN_G_O_ORGID_3);
				}
				else {
					query.append(_FINDER_COLUMN_G_O_ORGID_2);
				}
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

				count = (Long)q.uniqueResult();
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (count == null) {
					count = Long.valueOf(0);
				}

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_G_O, finderArgs,
					count);

				closeSession(session);
			}
		}

		return count.intValue();
	}

	/**
	 * Counts all the v legal orgs where groupId = &#63; and statusOrg = &#63; and language = &#63;.
	 *
	 * @param groupId the group id to search with
	 * @param statusOrg the status org to search with
	 * @param language the language to search with
	 * @return the number of matching v legal orgs
	 * @throws SystemException if a system exception occurred
	 */
	public int countByS_L(long groupId, boolean statusOrg, String language)
		throws SystemException {
		Object[] finderArgs = new Object[] { groupId, statusOrg, language };

		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_BY_S_L,
				finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(4);

			query.append(_SQL_COUNT_VLEGALORG_WHERE);

			query.append(_FINDER_COLUMN_S_L_GROUPID_2);

			query.append(_FINDER_COLUMN_S_L_STATUSORG_2);

			if (language == null) {
				query.append(_FINDER_COLUMN_S_L_LANGUAGE_1);
			}
			else {
				if (language.equals(StringPool.BLANK)) {
					query.append(_FINDER_COLUMN_S_L_LANGUAGE_3);
				}
				else {
					query.append(_FINDER_COLUMN_S_L_LANGUAGE_2);
				}
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(groupId);

				qPos.add(statusOrg);

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

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_S_L, finderArgs,
					count);

				closeSession(session);
			}
		}

		return count.intValue();
	}

	/**
	 * Counts all the v legal orgs where groupId = &#63; and statusOrg = &#63; and rssable = &#63;.
	 *
	 * @param groupId the group id to search with
	 * @param statusOrg the status org to search with
	 * @param rssable the rssable to search with
	 * @return the number of matching v legal orgs
	 * @throws SystemException if a system exception occurred
	 */
	public int countByS_Rss(long groupId, boolean statusOrg, boolean rssable)
		throws SystemException {
		Object[] finderArgs = new Object[] { groupId, statusOrg, rssable };

		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_BY_S_RSS,
				finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(4);

			query.append(_SQL_COUNT_VLEGALORG_WHERE);

			query.append(_FINDER_COLUMN_S_RSS_GROUPID_2);

			query.append(_FINDER_COLUMN_S_RSS_STATUSORG_2);

			query.append(_FINDER_COLUMN_S_RSS_RSSABLE_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(groupId);

				qPos.add(statusOrg);

				qPos.add(rssable);

				count = (Long)q.uniqueResult();
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (count == null) {
					count = Long.valueOf(0);
				}

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_S_RSS,
					finderArgs, count);

				closeSession(session);
			}
		}

		return count.intValue();
	}

	/**
	 * Counts all the v legal orgs where groupId = &#63; and language = &#63; and parentId = &#63;.
	 *
	 * @param groupId the group id to search with
	 * @param language the language to search with
	 * @param parentId the parent id to search with
	 * @return the number of matching v legal orgs
	 * @throws SystemException if a system exception occurred
	 */
	public int countByG_L_P(long groupId, String language, String parentId)
		throws SystemException {
		Object[] finderArgs = new Object[] { groupId, language, parentId };

		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_BY_G_L_P,
				finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(4);

			query.append(_SQL_COUNT_VLEGALORG_WHERE);

			query.append(_FINDER_COLUMN_G_L_P_GROUPID_2);

			if (language == null) {
				query.append(_FINDER_COLUMN_G_L_P_LANGUAGE_1);
			}
			else {
				if (language.equals(StringPool.BLANK)) {
					query.append(_FINDER_COLUMN_G_L_P_LANGUAGE_3);
				}
				else {
					query.append(_FINDER_COLUMN_G_L_P_LANGUAGE_2);
				}
			}

			if (parentId == null) {
				query.append(_FINDER_COLUMN_G_L_P_PARENTID_1);
			}
			else {
				if (parentId.equals(StringPool.BLANK)) {
					query.append(_FINDER_COLUMN_G_L_P_PARENTID_3);
				}
				else {
					query.append(_FINDER_COLUMN_G_L_P_PARENTID_2);
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

				if (parentId != null) {
					qPos.add(parentId);
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

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_G_L_P,
					finderArgs, count);

				closeSession(session);
			}
		}

		return count.intValue();
	}

	/**
	 * Counts all the v legal orgs where groupId = &#63; and language = &#63; and parentId = &#63; and statusOrg = &#63;.
	 *
	 * @param groupId the group id to search with
	 * @param language the language to search with
	 * @param parentId the parent id to search with
	 * @param statusOrg the status org to search with
	 * @return the number of matching v legal orgs
	 * @throws SystemException if a system exception occurred
	 */
	public int countByG_L_P_S(long groupId, String language, String parentId,
		boolean statusOrg) throws SystemException {
		Object[] finderArgs = new Object[] {
				groupId, language, parentId, statusOrg
			};

		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_BY_G_L_P_S,
				finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(5);

			query.append(_SQL_COUNT_VLEGALORG_WHERE);

			query.append(_FINDER_COLUMN_G_L_P_S_GROUPID_2);

			if (language == null) {
				query.append(_FINDER_COLUMN_G_L_P_S_LANGUAGE_1);
			}
			else {
				if (language.equals(StringPool.BLANK)) {
					query.append(_FINDER_COLUMN_G_L_P_S_LANGUAGE_3);
				}
				else {
					query.append(_FINDER_COLUMN_G_L_P_S_LANGUAGE_2);
				}
			}

			if (parentId == null) {
				query.append(_FINDER_COLUMN_G_L_P_S_PARENTID_1);
			}
			else {
				if (parentId.equals(StringPool.BLANK)) {
					query.append(_FINDER_COLUMN_G_L_P_S_PARENTID_3);
				}
				else {
					query.append(_FINDER_COLUMN_G_L_P_S_PARENTID_2);
				}
			}

			query.append(_FINDER_COLUMN_G_L_P_S_STATUSORG_2);

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

				if (parentId != null) {
					qPos.add(parentId);
				}

				qPos.add(statusOrg);

				count = (Long)q.uniqueResult();
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (count == null) {
					count = Long.valueOf(0);
				}

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_G_L_P_S,
					finderArgs, count);

				closeSession(session);
			}
		}

		return count.intValue();
	}

	/**
	 * Counts all the v legal orgs.
	 *
	 * @return the number of v legal orgs
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

				Query q = session.createQuery(_SQL_COUNT_VLEGALORG);

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
	 * Initializes the v legal org persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.com.vportal.portlet.vlegal.model.VLegalOrg")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<VLegalOrg>> listenersList = new ArrayList<ModelListener<VLegalOrg>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<VLegalOrg>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(VLegalOrgImpl.class.getName());
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
	@BeanReference(type = ResourcePersistence.class)
	protected ResourcePersistence resourcePersistence;
	@BeanReference(type = UserPersistence.class)
	protected UserPersistence userPersistence;
	private static final String _SQL_SELECT_VLEGALORG = "SELECT vLegalOrg FROM VLegalOrg vLegalOrg";
	private static final String _SQL_SELECT_VLEGALORG_WHERE = "SELECT vLegalOrg FROM VLegalOrg vLegalOrg WHERE ";
	private static final String _SQL_COUNT_VLEGALORG = "SELECT COUNT(vLegalOrg) FROM VLegalOrg vLegalOrg";
	private static final String _SQL_COUNT_VLEGALORG_WHERE = "SELECT COUNT(vLegalOrg) FROM VLegalOrg vLegalOrg WHERE ";
	private static final String _FINDER_COLUMN_GROUPID_GROUPID_2 = "vLegalOrg.groupId = ?";
	private static final String _FINDER_COLUMN_G_L_GROUPID_2 = "vLegalOrg.groupId = ? AND ";
	private static final String _FINDER_COLUMN_G_L_LANGUAGE_1 = "vLegalOrg.language IS NULL";
	private static final String _FINDER_COLUMN_G_L_LANGUAGE_2 = "vLegalOrg.language = ?";
	private static final String _FINDER_COLUMN_G_L_LANGUAGE_3 = "(vLegalOrg.language IS NULL OR vLegalOrg.language = ?)";
	private static final String _FINDER_COLUMN_G_O_GROUPID_2 = "vLegalOrg.groupId = ? AND ";
	private static final String _FINDER_COLUMN_G_O_ORGID_1 = "vLegalOrg.orgId IS NULL";
	private static final String _FINDER_COLUMN_G_O_ORGID_2 = "vLegalOrg.orgId = ?";
	private static final String _FINDER_COLUMN_G_O_ORGID_3 = "(vLegalOrg.orgId IS NULL OR vLegalOrg.orgId = ?)";
	private static final String _FINDER_COLUMN_S_L_GROUPID_2 = "vLegalOrg.groupId = ? AND ";
	private static final String _FINDER_COLUMN_S_L_STATUSORG_2 = "vLegalOrg.statusOrg = ? AND ";
	private static final String _FINDER_COLUMN_S_L_LANGUAGE_1 = "vLegalOrg.language IS NULL";
	private static final String _FINDER_COLUMN_S_L_LANGUAGE_2 = "vLegalOrg.language = ?";
	private static final String _FINDER_COLUMN_S_L_LANGUAGE_3 = "(vLegalOrg.language IS NULL OR vLegalOrg.language = ?)";
	private static final String _FINDER_COLUMN_S_RSS_GROUPID_2 = "vLegalOrg.groupId = ? AND ";
	private static final String _FINDER_COLUMN_S_RSS_STATUSORG_2 = "vLegalOrg.statusOrg = ? AND ";
	private static final String _FINDER_COLUMN_S_RSS_RSSABLE_2 = "vLegalOrg.rssable = ?";
	private static final String _FINDER_COLUMN_G_L_P_GROUPID_2 = "vLegalOrg.groupId = ? AND ";
	private static final String _FINDER_COLUMN_G_L_P_LANGUAGE_1 = "vLegalOrg.language IS NULL AND ";
	private static final String _FINDER_COLUMN_G_L_P_LANGUAGE_2 = "vLegalOrg.language = ? AND ";
	private static final String _FINDER_COLUMN_G_L_P_LANGUAGE_3 = "(vLegalOrg.language IS NULL OR vLegalOrg.language = ?) AND ";
	private static final String _FINDER_COLUMN_G_L_P_PARENTID_1 = "vLegalOrg.parentId IS NULL";
	private static final String _FINDER_COLUMN_G_L_P_PARENTID_2 = "vLegalOrg.parentId = ?";
	private static final String _FINDER_COLUMN_G_L_P_PARENTID_3 = "(vLegalOrg.parentId IS NULL OR vLegalOrg.parentId = ?)";
	private static final String _FINDER_COLUMN_G_L_P_S_GROUPID_2 = "vLegalOrg.groupId = ? AND ";
	private static final String _FINDER_COLUMN_G_L_P_S_LANGUAGE_1 = "vLegalOrg.language IS NULL AND ";
	private static final String _FINDER_COLUMN_G_L_P_S_LANGUAGE_2 = "vLegalOrg.language = ? AND ";
	private static final String _FINDER_COLUMN_G_L_P_S_LANGUAGE_3 = "(vLegalOrg.language IS NULL OR vLegalOrg.language = ?) AND ";
	private static final String _FINDER_COLUMN_G_L_P_S_PARENTID_1 = "vLegalOrg.parentId IS NULL AND ";
	private static final String _FINDER_COLUMN_G_L_P_S_PARENTID_2 = "vLegalOrg.parentId = ? AND ";
	private static final String _FINDER_COLUMN_G_L_P_S_PARENTID_3 = "(vLegalOrg.parentId IS NULL OR vLegalOrg.parentId = ?) AND ";
	private static final String _FINDER_COLUMN_G_L_P_S_STATUSORG_2 = "vLegalOrg.statusOrg = ?";
	private static final String _ORDER_BY_ENTITY_ALIAS = "vLegalOrg.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No VLegalOrg exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No VLegalOrg exists with the key {";
	private static Log _log = LogFactoryUtil.getLog(VLegalOrgPersistenceImpl.class);
}