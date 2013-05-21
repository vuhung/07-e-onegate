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

package com.vportal.portlet.vsearch.service.persistence;

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
import com.liferay.portal.service.persistence.CompanyPersistence;
import com.liferay.portal.service.persistence.PortletPreferencesPersistence;
import com.liferay.portal.service.persistence.ResourcePersistence;
import com.liferay.portal.service.persistence.UserPersistence;
import com.liferay.portal.service.persistence.impl.BasePersistenceImpl;

import com.vportal.portlet.vsearch.NoSuchVConfigSearchException;
import com.vportal.portlet.vsearch.model.VConfigSearch;
import com.vportal.portlet.vsearch.model.impl.VConfigSearchImpl;
import com.vportal.portlet.vsearch.model.impl.VConfigSearchModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The persistence implementation for the v config search service.
 *
 * <p>
 * Never modify or reference this class directly. Always use {@link VConfigSearchUtil} to access the v config search persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
 * </p>
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Ba
 * @see VConfigSearchPersistence
 * @see VConfigSearchUtil
 * @generated
 */
public class VConfigSearchPersistenceImpl extends BasePersistenceImpl<VConfigSearch>
	implements VConfigSearchPersistence {
	public static final String FINDER_CLASS_NAME_ENTITY = VConfigSearchImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST = FINDER_CLASS_NAME_ENTITY +
		".List";
	public static final FinderPath FINDER_PATH_FETCH_BY_PORTLETID = new FinderPath(VConfigSearchModelImpl.ENTITY_CACHE_ENABLED,
			VConfigSearchModelImpl.FINDER_CACHE_ENABLED,
			FINDER_CLASS_NAME_ENTITY, "fetchByPortletId",
			new String[] { String.class.getName(), Long.class.getName() });
	public static final FinderPath FINDER_PATH_COUNT_BY_PORTLETID = new FinderPath(VConfigSearchModelImpl.ENTITY_CACHE_ENABLED,
			VConfigSearchModelImpl.FINDER_CACHE_ENABLED,
			FINDER_CLASS_NAME_LIST, "countByPortletId",
			new String[] { String.class.getName(), Long.class.getName() });
	public static final FinderPath FINDER_PATH_FIND_BY_PORTLET = new FinderPath(VConfigSearchModelImpl.ENTITY_CACHE_ENABLED,
			VConfigSearchModelImpl.FINDER_CACHE_ENABLED,
			FINDER_CLASS_NAME_LIST, "findByPortlet",
			new String[] {
				String.class.getName(), Long.class.getName(),
				
			"java.lang.Integer", "java.lang.Integer",
				"com.liferay.portal.kernel.util.OrderByComparator"
			});
	public static final FinderPath FINDER_PATH_COUNT_BY_PORTLET = new FinderPath(VConfigSearchModelImpl.ENTITY_CACHE_ENABLED,
			VConfigSearchModelImpl.FINDER_CACHE_ENABLED,
			FINDER_CLASS_NAME_LIST, "countByPortlet",
			new String[] { String.class.getName(), Long.class.getName() });
	public static final FinderPath FINDER_PATH_FIND_ALL = new FinderPath(VConfigSearchModelImpl.ENTITY_CACHE_ENABLED,
			VConfigSearchModelImpl.FINDER_CACHE_ENABLED,
			FINDER_CLASS_NAME_LIST, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(VConfigSearchModelImpl.ENTITY_CACHE_ENABLED,
			VConfigSearchModelImpl.FINDER_CACHE_ENABLED,
			FINDER_CLASS_NAME_LIST, "countAll", new String[0]);

	/**
	 * Caches the v config search in the entity cache if it is enabled.
	 *
	 * @param vConfigSearch the v config search to cache
	 */
	public void cacheResult(VConfigSearch vConfigSearch) {
		EntityCacheUtil.putResult(VConfigSearchModelImpl.ENTITY_CACHE_ENABLED,
			VConfigSearchImpl.class, vConfigSearch.getPrimaryKey(),
			vConfigSearch);

		FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_PORTLETID,
			new Object[] {
				vConfigSearch.getPortletId(),
				new Long(vConfigSearch.getGroupId())
			}, vConfigSearch);
	}

	/**
	 * Caches the v config searchs in the entity cache if it is enabled.
	 *
	 * @param vConfigSearchs the v config searchs to cache
	 */
	public void cacheResult(List<VConfigSearch> vConfigSearchs) {
		for (VConfigSearch vConfigSearch : vConfigSearchs) {
			if (EntityCacheUtil.getResult(
						VConfigSearchModelImpl.ENTITY_CACHE_ENABLED,
						VConfigSearchImpl.class, vConfigSearch.getPrimaryKey(),
						this) == null) {
				cacheResult(vConfigSearch);
			}
		}
	}

	/**
	 * Clears the cache for all v config searchs.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	public void clearCache() {
		CacheRegistryUtil.clear(VConfigSearchImpl.class.getName());
		EntityCacheUtil.clearCache(VConfigSearchImpl.class.getName());
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST);
	}

	/**
	 * Clears the cache for the v config search.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	public void clearCache(VConfigSearch vConfigSearch) {
		EntityCacheUtil.removeResult(VConfigSearchModelImpl.ENTITY_CACHE_ENABLED,
			VConfigSearchImpl.class, vConfigSearch.getPrimaryKey());

		FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_PORTLETID,
			new Object[] {
				vConfigSearch.getPortletId(),
				new Long(vConfigSearch.getGroupId())
			});
	}

	/**
	 * Creates a new v config search with the primary key. Does not add the v config search to the database.
	 *
	 * @param confisearchId the primary key for the new v config search
	 * @return the new v config search
	 */
	public VConfigSearch create(long confisearchId) {
		VConfigSearch vConfigSearch = new VConfigSearchImpl();

		vConfigSearch.setNew(true);
		vConfigSearch.setPrimaryKey(confisearchId);

		return vConfigSearch;
	}

	/**
	 * Removes the v config search with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the v config search to remove
	 * @return the v config search that was removed
	 * @throws com.liferay.portal.NoSuchModelException if a v config search with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public VConfigSearch remove(Serializable primaryKey)
		throws NoSuchModelException, SystemException {
		return remove(((Long)primaryKey).longValue());
	}

	/**
	 * Removes the v config search with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param confisearchId the primary key of the v config search to remove
	 * @return the v config search that was removed
	 * @throws com.vportal.portlet.vsearch.NoSuchVConfigSearchException if a v config search with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public VConfigSearch remove(long confisearchId)
		throws NoSuchVConfigSearchException, SystemException {
		Session session = null;

		try {
			session = openSession();

			VConfigSearch vConfigSearch = (VConfigSearch)session.get(VConfigSearchImpl.class,
					new Long(confisearchId));

			if (vConfigSearch == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + confisearchId);
				}

				throw new NoSuchVConfigSearchException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					confisearchId);
			}

			return remove(vConfigSearch);
		}
		catch (NoSuchVConfigSearchException nsee) {
			throw nsee;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected VConfigSearch removeImpl(VConfigSearch vConfigSearch)
		throws SystemException {
		vConfigSearch = toUnwrappedModel(vConfigSearch);

		Session session = null;

		try {
			session = openSession();

			BatchSessionUtil.delete(session, vConfigSearch);
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST);

		VConfigSearchModelImpl vConfigSearchModelImpl = (VConfigSearchModelImpl)vConfigSearch;

		FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_PORTLETID,
			new Object[] {
				vConfigSearchModelImpl.getPortletId(),
				new Long(vConfigSearchModelImpl.getGroupId())
			});

		EntityCacheUtil.removeResult(VConfigSearchModelImpl.ENTITY_CACHE_ENABLED,
			VConfigSearchImpl.class, vConfigSearch.getPrimaryKey());

		return vConfigSearch;
	}

	public VConfigSearch updateImpl(
		com.vportal.portlet.vsearch.model.VConfigSearch vConfigSearch,
		boolean merge) throws SystemException {
		vConfigSearch = toUnwrappedModel(vConfigSearch);

		boolean isNew = vConfigSearch.isNew();

		VConfigSearchModelImpl vConfigSearchModelImpl = (VConfigSearchModelImpl)vConfigSearch;

		Session session = null;

		try {
			session = openSession();

			BatchSessionUtil.update(session, vConfigSearch, merge);

			vConfigSearch.setNew(false);
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST);

		EntityCacheUtil.putResult(VConfigSearchModelImpl.ENTITY_CACHE_ENABLED,
			VConfigSearchImpl.class, vConfigSearch.getPrimaryKey(),
			vConfigSearch);

		if (!isNew &&
				(!Validator.equals(vConfigSearch.getPortletId(),
					vConfigSearchModelImpl.getOriginalPortletId()) ||
				(vConfigSearch.getGroupId() != vConfigSearchModelImpl.getOriginalGroupId()))) {
			FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_PORTLETID,
				new Object[] {
					vConfigSearchModelImpl.getOriginalPortletId(),
					new Long(vConfigSearchModelImpl.getOriginalGroupId())
				});
		}

		if (isNew ||
				(!Validator.equals(vConfigSearch.getPortletId(),
					vConfigSearchModelImpl.getOriginalPortletId()) ||
				(vConfigSearch.getGroupId() != vConfigSearchModelImpl.getOriginalGroupId()))) {
			FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_PORTLETID,
				new Object[] {
					vConfigSearch.getPortletId(),
					new Long(vConfigSearch.getGroupId())
				}, vConfigSearch);
		}

		return vConfigSearch;
	}

	protected VConfigSearch toUnwrappedModel(VConfigSearch vConfigSearch) {
		if (vConfigSearch instanceof VConfigSearchImpl) {
			return vConfigSearch;
		}

		VConfigSearchImpl vConfigSearchImpl = new VConfigSearchImpl();

		vConfigSearchImpl.setNew(vConfigSearch.isNew());
		vConfigSearchImpl.setPrimaryKey(vConfigSearch.getPrimaryKey());

		vConfigSearchImpl.setConfisearchId(vConfigSearch.getConfisearchId());
		vConfigSearchImpl.setGroupId(vConfigSearch.getGroupId());
		vConfigSearchImpl.setCompanyId(vConfigSearch.getCompanyId());
		vConfigSearchImpl.setUserId(vConfigSearch.getUserId());
		vConfigSearchImpl.setUserName(vConfigSearch.getUserName());
		vConfigSearchImpl.setCreateDate(vConfigSearch.getCreateDate());
		vConfigSearchImpl.setModifiedDate(vConfigSearch.getModifiedDate());
		vConfigSearchImpl.setModifiedByUser(vConfigSearch.getModifiedByUser());
		vConfigSearchImpl.setLanguageId(vConfigSearch.getLanguageId());
		vConfigSearchImpl.setLayoutId(vConfigSearch.getLayoutId());
		vConfigSearchImpl.setPortletId(vConfigSearch.getPortletId());
		vConfigSearchImpl.setPortleturl(vConfigSearch.getPortleturl());

		return vConfigSearchImpl;
	}

	/**
	 * Finds the v config search with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the v config search to find
	 * @return the v config search
	 * @throws com.liferay.portal.NoSuchModelException if a v config search with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public VConfigSearch findByPrimaryKey(Serializable primaryKey)
		throws NoSuchModelException, SystemException {
		return findByPrimaryKey(((Long)primaryKey).longValue());
	}

	/**
	 * Finds the v config search with the primary key or throws a {@link com.vportal.portlet.vsearch.NoSuchVConfigSearchException} if it could not be found.
	 *
	 * @param confisearchId the primary key of the v config search to find
	 * @return the v config search
	 * @throws com.vportal.portlet.vsearch.NoSuchVConfigSearchException if a v config search with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public VConfigSearch findByPrimaryKey(long confisearchId)
		throws NoSuchVConfigSearchException, SystemException {
		VConfigSearch vConfigSearch = fetchByPrimaryKey(confisearchId);

		if (vConfigSearch == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + confisearchId);
			}

			throw new NoSuchVConfigSearchException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				confisearchId);
		}

		return vConfigSearch;
	}

	/**
	 * Finds the v config search with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the v config search to find
	 * @return the v config search, or <code>null</code> if a v config search with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public VConfigSearch fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		return fetchByPrimaryKey(((Long)primaryKey).longValue());
	}

	/**
	 * Finds the v config search with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param confisearchId the primary key of the v config search to find
	 * @return the v config search, or <code>null</code> if a v config search with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public VConfigSearch fetchByPrimaryKey(long confisearchId)
		throws SystemException {
		VConfigSearch vConfigSearch = (VConfigSearch)EntityCacheUtil.getResult(VConfigSearchModelImpl.ENTITY_CACHE_ENABLED,
				VConfigSearchImpl.class, confisearchId, this);

		if (vConfigSearch == null) {
			Session session = null;

			try {
				session = openSession();

				vConfigSearch = (VConfigSearch)session.get(VConfigSearchImpl.class,
						new Long(confisearchId));
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (vConfigSearch != null) {
					cacheResult(vConfigSearch);
				}

				closeSession(session);
			}
		}

		return vConfigSearch;
	}

	/**
	 * Finds the v config search where portletId = &#63; and groupId = &#63; or throws a {@link com.vportal.portlet.vsearch.NoSuchVConfigSearchException} if it could not be found.
	 *
	 * @param portletId the portlet id to search with
	 * @param groupId the group id to search with
	 * @return the matching v config search
	 * @throws com.vportal.portlet.vsearch.NoSuchVConfigSearchException if a matching v config search could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public VConfigSearch findByPortletId(String portletId, long groupId)
		throws NoSuchVConfigSearchException, SystemException {
		VConfigSearch vConfigSearch = fetchByPortletId(portletId, groupId);

		if (vConfigSearch == null) {
			StringBundler msg = new StringBundler(6);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("portletId=");
			msg.append(portletId);

			msg.append(", groupId=");
			msg.append(groupId);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			if (_log.isWarnEnabled()) {
				_log.warn(msg.toString());
			}

			throw new NoSuchVConfigSearchException(msg.toString());
		}

		return vConfigSearch;
	}

	/**
	 * Finds the v config search where portletId = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param portletId the portlet id to search with
	 * @param groupId the group id to search with
	 * @return the matching v config search, or <code>null</code> if a matching v config search could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public VConfigSearch fetchByPortletId(String portletId, long groupId)
		throws SystemException {
		return fetchByPortletId(portletId, groupId, true);
	}

	/**
	 * Finds the v config search where portletId = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param portletId the portlet id to search with
	 * @param groupId the group id to search with
	 * @return the matching v config search, or <code>null</code> if a matching v config search could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public VConfigSearch fetchByPortletId(String portletId, long groupId,
		boolean retrieveFromCache) throws SystemException {
		Object[] finderArgs = new Object[] { portletId, groupId };

		Object result = null;

		if (retrieveFromCache) {
			result = FinderCacheUtil.getResult(FINDER_PATH_FETCH_BY_PORTLETID,
					finderArgs, this);
		}

		if (result == null) {
			StringBundler query = new StringBundler(4);

			query.append(_SQL_SELECT_VCONFIGSEARCH_WHERE);

			if (portletId == null) {
				query.append(_FINDER_COLUMN_PORTLETID_PORTLETID_1);
			}
			else {
				if (portletId.equals(StringPool.BLANK)) {
					query.append(_FINDER_COLUMN_PORTLETID_PORTLETID_3);
				}
				else {
					query.append(_FINDER_COLUMN_PORTLETID_PORTLETID_2);
				}
			}

			query.append(_FINDER_COLUMN_PORTLETID_GROUPID_2);

			query.append(VConfigSearchModelImpl.ORDER_BY_JPQL);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (portletId != null) {
					qPos.add(portletId);
				}

				qPos.add(groupId);

				List<VConfigSearch> list = q.list();

				result = list;

				VConfigSearch vConfigSearch = null;

				if (list.isEmpty()) {
					FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_PORTLETID,
						finderArgs, list);
				}
				else {
					vConfigSearch = list.get(0);

					cacheResult(vConfigSearch);

					if ((vConfigSearch.getPortletId() == null) ||
							!vConfigSearch.getPortletId().equals(portletId) ||
							(vConfigSearch.getGroupId() != groupId)) {
						FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_PORTLETID,
							finderArgs, vConfigSearch);
					}
				}

				return vConfigSearch;
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (result == null) {
					FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_PORTLETID,
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
				return (VConfigSearch)result;
			}
		}
	}

	/**
	 * Finds all the v config searchs where portletId = &#63; and groupId = &#63;.
	 *
	 * @param portletId the portlet id to search with
	 * @param groupId the group id to search with
	 * @return the matching v config searchs
	 * @throws SystemException if a system exception occurred
	 */
	public List<VConfigSearch> findByPortlet(String portletId, long groupId)
		throws SystemException {
		return findByPortlet(portletId, groupId, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Finds a range of all the v config searchs where portletId = &#63; and groupId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param portletId the portlet id to search with
	 * @param groupId the group id to search with
	 * @param start the lower bound of the range of v config searchs to return
	 * @param end the upper bound of the range of v config searchs to return (not inclusive)
	 * @return the range of matching v config searchs
	 * @throws SystemException if a system exception occurred
	 */
	public List<VConfigSearch> findByPortlet(String portletId, long groupId,
		int start, int end) throws SystemException {
		return findByPortlet(portletId, groupId, start, end, null);
	}

	/**
	 * Finds an ordered range of all the v config searchs where portletId = &#63; and groupId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param portletId the portlet id to search with
	 * @param groupId the group id to search with
	 * @param start the lower bound of the range of v config searchs to return
	 * @param end the upper bound of the range of v config searchs to return (not inclusive)
	 * @param orderByComparator the comparator to order the results by
	 * @return the ordered range of matching v config searchs
	 * @throws SystemException if a system exception occurred
	 */
	public List<VConfigSearch> findByPortlet(String portletId, long groupId,
		int start, int end, OrderByComparator orderByComparator)
		throws SystemException {
		Object[] finderArgs = new Object[] {
				portletId, groupId,
				
				String.valueOf(start), String.valueOf(end),
				String.valueOf(orderByComparator)
			};

		List<VConfigSearch> list = (List<VConfigSearch>)FinderCacheUtil.getResult(FINDER_PATH_FIND_BY_PORTLET,
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

			query.append(_SQL_SELECT_VCONFIGSEARCH_WHERE);

			if (portletId == null) {
				query.append(_FINDER_COLUMN_PORTLET_PORTLETID_1);
			}
			else {
				if (portletId.equals(StringPool.BLANK)) {
					query.append(_FINDER_COLUMN_PORTLET_PORTLETID_3);
				}
				else {
					query.append(_FINDER_COLUMN_PORTLET_PORTLETID_2);
				}
			}

			query.append(_FINDER_COLUMN_PORTLET_GROUPID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}

			else {
				query.append(VConfigSearchModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (portletId != null) {
					qPos.add(portletId);
				}

				qPos.add(groupId);

				list = (List<VConfigSearch>)QueryUtil.list(q, getDialect(),
						start, end);
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (list == null) {
					FinderCacheUtil.removeResult(FINDER_PATH_FIND_BY_PORTLET,
						finderArgs);
				}
				else {
					cacheResult(list);

					FinderCacheUtil.putResult(FINDER_PATH_FIND_BY_PORTLET,
						finderArgs, list);
				}

				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Finds the first v config search in the ordered set where portletId = &#63; and groupId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param portletId the portlet id to search with
	 * @param groupId the group id to search with
	 * @param orderByComparator the comparator to order the set by
	 * @return the first matching v config search
	 * @throws com.vportal.portlet.vsearch.NoSuchVConfigSearchException if a matching v config search could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public VConfigSearch findByPortlet_First(String portletId, long groupId,
		OrderByComparator orderByComparator)
		throws NoSuchVConfigSearchException, SystemException {
		List<VConfigSearch> list = findByPortlet(portletId, groupId, 0, 1,
				orderByComparator);

		if (list.isEmpty()) {
			StringBundler msg = new StringBundler(6);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("portletId=");
			msg.append(portletId);

			msg.append(", groupId=");
			msg.append(groupId);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			throw new NoSuchVConfigSearchException(msg.toString());
		}
		else {
			return list.get(0);
		}
	}

	/**
	 * Finds the last v config search in the ordered set where portletId = &#63; and groupId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param portletId the portlet id to search with
	 * @param groupId the group id to search with
	 * @param orderByComparator the comparator to order the set by
	 * @return the last matching v config search
	 * @throws com.vportal.portlet.vsearch.NoSuchVConfigSearchException if a matching v config search could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public VConfigSearch findByPortlet_Last(String portletId, long groupId,
		OrderByComparator orderByComparator)
		throws NoSuchVConfigSearchException, SystemException {
		int count = countByPortlet(portletId, groupId);

		List<VConfigSearch> list = findByPortlet(portletId, groupId, count - 1,
				count, orderByComparator);

		if (list.isEmpty()) {
			StringBundler msg = new StringBundler(6);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("portletId=");
			msg.append(portletId);

			msg.append(", groupId=");
			msg.append(groupId);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			throw new NoSuchVConfigSearchException(msg.toString());
		}
		else {
			return list.get(0);
		}
	}

	/**
	 * Finds the v config searchs before and after the current v config search in the ordered set where portletId = &#63; and groupId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param confisearchId the primary key of the current v config search
	 * @param portletId the portlet id to search with
	 * @param groupId the group id to search with
	 * @param orderByComparator the comparator to order the set by
	 * @return the previous, current, and next v config search
	 * @throws com.vportal.portlet.vsearch.NoSuchVConfigSearchException if a v config search with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public VConfigSearch[] findByPortlet_PrevAndNext(long confisearchId,
		String portletId, long groupId, OrderByComparator orderByComparator)
		throws NoSuchVConfigSearchException, SystemException {
		VConfigSearch vConfigSearch = findByPrimaryKey(confisearchId);

		Session session = null;

		try {
			session = openSession();

			VConfigSearch[] array = new VConfigSearchImpl[3];

			array[0] = getByPortlet_PrevAndNext(session, vConfigSearch,
					portletId, groupId, orderByComparator, true);

			array[1] = vConfigSearch;

			array[2] = getByPortlet_PrevAndNext(session, vConfigSearch,
					portletId, groupId, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected VConfigSearch getByPortlet_PrevAndNext(Session session,
		VConfigSearch vConfigSearch, String portletId, long groupId,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_VCONFIGSEARCH_WHERE);

		if (portletId == null) {
			query.append(_FINDER_COLUMN_PORTLET_PORTLETID_1);
		}
		else {
			if (portletId.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_PORTLET_PORTLETID_3);
			}
			else {
				query.append(_FINDER_COLUMN_PORTLET_PORTLETID_2);
			}
		}

		query.append(_FINDER_COLUMN_PORTLET_GROUPID_2);

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
			query.append(VConfigSearchModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		if (portletId != null) {
			qPos.add(portletId);
		}

		qPos.add(groupId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByValues(vConfigSearch);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<VConfigSearch> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Finds all the v config searchs.
	 *
	 * @return the v config searchs
	 * @throws SystemException if a system exception occurred
	 */
	public List<VConfigSearch> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Finds a range of all the v config searchs.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param start the lower bound of the range of v config searchs to return
	 * @param end the upper bound of the range of v config searchs to return (not inclusive)
	 * @return the range of v config searchs
	 * @throws SystemException if a system exception occurred
	 */
	public List<VConfigSearch> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Finds an ordered range of all the v config searchs.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param start the lower bound of the range of v config searchs to return
	 * @param end the upper bound of the range of v config searchs to return (not inclusive)
	 * @param orderByComparator the comparator to order the results by
	 * @return the ordered range of v config searchs
	 * @throws SystemException if a system exception occurred
	 */
	public List<VConfigSearch> findAll(int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		Object[] finderArgs = new Object[] {
				String.valueOf(start), String.valueOf(end),
				String.valueOf(orderByComparator)
			};

		List<VConfigSearch> list = (List<VConfigSearch>)FinderCacheUtil.getResult(FINDER_PATH_FIND_ALL,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_VCONFIGSEARCH);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_VCONFIGSEARCH.concat(VConfigSearchModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (orderByComparator == null) {
					list = (List<VConfigSearch>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);
				}
				else {
					list = (List<VConfigSearch>)QueryUtil.list(q, getDialect(),
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
	 * Removes the v config search where portletId = &#63; and groupId = &#63; from the database.
	 *
	 * @param portletId the portlet id to search with
	 * @param groupId the group id to search with
	 * @throws SystemException if a system exception occurred
	 */
	public void removeByPortletId(String portletId, long groupId)
		throws NoSuchVConfigSearchException, SystemException {
		VConfigSearch vConfigSearch = findByPortletId(portletId, groupId);

		remove(vConfigSearch);
	}

	/**
	 * Removes all the v config searchs where portletId = &#63; and groupId = &#63; from the database.
	 *
	 * @param portletId the portlet id to search with
	 * @param groupId the group id to search with
	 * @throws SystemException if a system exception occurred
	 */
	public void removeByPortlet(String portletId, long groupId)
		throws SystemException {
		for (VConfigSearch vConfigSearch : findByPortlet(portletId, groupId)) {
			remove(vConfigSearch);
		}
	}

	/**
	 * Removes all the v config searchs from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	public void removeAll() throws SystemException {
		for (VConfigSearch vConfigSearch : findAll()) {
			remove(vConfigSearch);
		}
	}

	/**
	 * Counts all the v config searchs where portletId = &#63; and groupId = &#63;.
	 *
	 * @param portletId the portlet id to search with
	 * @param groupId the group id to search with
	 * @return the number of matching v config searchs
	 * @throws SystemException if a system exception occurred
	 */
	public int countByPortletId(String portletId, long groupId)
		throws SystemException {
		Object[] finderArgs = new Object[] { portletId, groupId };

		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_BY_PORTLETID,
				finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_VCONFIGSEARCH_WHERE);

			if (portletId == null) {
				query.append(_FINDER_COLUMN_PORTLETID_PORTLETID_1);
			}
			else {
				if (portletId.equals(StringPool.BLANK)) {
					query.append(_FINDER_COLUMN_PORTLETID_PORTLETID_3);
				}
				else {
					query.append(_FINDER_COLUMN_PORTLETID_PORTLETID_2);
				}
			}

			query.append(_FINDER_COLUMN_PORTLETID_GROUPID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (portletId != null) {
					qPos.add(portletId);
				}

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

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_PORTLETID,
					finderArgs, count);

				closeSession(session);
			}
		}

		return count.intValue();
	}

	/**
	 * Counts all the v config searchs where portletId = &#63; and groupId = &#63;.
	 *
	 * @param portletId the portlet id to search with
	 * @param groupId the group id to search with
	 * @return the number of matching v config searchs
	 * @throws SystemException if a system exception occurred
	 */
	public int countByPortlet(String portletId, long groupId)
		throws SystemException {
		Object[] finderArgs = new Object[] { portletId, groupId };

		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_BY_PORTLET,
				finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_VCONFIGSEARCH_WHERE);

			if (portletId == null) {
				query.append(_FINDER_COLUMN_PORTLET_PORTLETID_1);
			}
			else {
				if (portletId.equals(StringPool.BLANK)) {
					query.append(_FINDER_COLUMN_PORTLET_PORTLETID_3);
				}
				else {
					query.append(_FINDER_COLUMN_PORTLET_PORTLETID_2);
				}
			}

			query.append(_FINDER_COLUMN_PORTLET_GROUPID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (portletId != null) {
					qPos.add(portletId);
				}

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

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_PORTLET,
					finderArgs, count);

				closeSession(session);
			}
		}

		return count.intValue();
	}

	/**
	 * Counts all the v config searchs.
	 *
	 * @return the number of v config searchs
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

				Query q = session.createQuery(_SQL_COUNT_VCONFIGSEARCH);

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
	 * Initializes the v config search persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.com.vportal.portlet.vsearch.model.VConfigSearch")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<VConfigSearch>> listenersList = new ArrayList<ModelListener<VConfigSearch>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<VConfigSearch>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(VConfigSearchImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST);
	}

	@BeanReference(type = VConfigSearchPersistence.class)
	protected VConfigSearchPersistence vConfigSearchPersistence;
	@BeanReference(type = CompanyPersistence.class)
	protected CompanyPersistence companyPersistence;
	@BeanReference(type = PortletPreferencesPersistence.class)
	protected PortletPreferencesPersistence portletPreferencesPersistence;
	@BeanReference(type = ResourcePersistence.class)
	protected ResourcePersistence resourcePersistence;
	@BeanReference(type = UserPersistence.class)
	protected UserPersistence userPersistence;
	private static final String _SQL_SELECT_VCONFIGSEARCH = "SELECT vConfigSearch FROM VConfigSearch vConfigSearch";
	private static final String _SQL_SELECT_VCONFIGSEARCH_WHERE = "SELECT vConfigSearch FROM VConfigSearch vConfigSearch WHERE ";
	private static final String _SQL_COUNT_VCONFIGSEARCH = "SELECT COUNT(vConfigSearch) FROM VConfigSearch vConfigSearch";
	private static final String _SQL_COUNT_VCONFIGSEARCH_WHERE = "SELECT COUNT(vConfigSearch) FROM VConfigSearch vConfigSearch WHERE ";
	private static final String _FINDER_COLUMN_PORTLETID_PORTLETID_1 = "vConfigSearch.portletId IS NULL AND ";
	private static final String _FINDER_COLUMN_PORTLETID_PORTLETID_2 = "vConfigSearch.portletId = ? AND ";
	private static final String _FINDER_COLUMN_PORTLETID_PORTLETID_3 = "(vConfigSearch.portletId IS NULL OR vConfigSearch.portletId = ?) AND ";
	private static final String _FINDER_COLUMN_PORTLETID_GROUPID_2 = "vConfigSearch.groupId = ?";
	private static final String _FINDER_COLUMN_PORTLET_PORTLETID_1 = "vConfigSearch.portletId IS NULL AND ";
	private static final String _FINDER_COLUMN_PORTLET_PORTLETID_2 = "vConfigSearch.portletId = ? AND ";
	private static final String _FINDER_COLUMN_PORTLET_PORTLETID_3 = "(vConfigSearch.portletId IS NULL OR vConfigSearch.portletId = ?) AND ";
	private static final String _FINDER_COLUMN_PORTLET_GROUPID_2 = "vConfigSearch.groupId = ?";
	private static final String _ORDER_BY_ENTITY_ALIAS = "vConfigSearch.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No VConfigSearch exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No VConfigSearch exists with the key {";
	private static Log _log = LogFactoryUtil.getLog(VConfigSearchPersistenceImpl.class);
}