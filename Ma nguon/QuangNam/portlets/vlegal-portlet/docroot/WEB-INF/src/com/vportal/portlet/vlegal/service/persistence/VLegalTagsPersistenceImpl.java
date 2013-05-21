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
import com.liferay.portal.model.ModelListener;
import com.liferay.portal.service.persistence.BatchSessionUtil;
import com.liferay.portal.service.persistence.ResourcePersistence;
import com.liferay.portal.service.persistence.UserPersistence;
import com.liferay.portal.service.persistence.impl.BasePersistenceImpl;

import com.vportal.portlet.vlegal.NoSuchVLegalTagsException;
import com.vportal.portlet.vlegal.model.VLegalTags;
import com.vportal.portlet.vlegal.model.impl.VLegalTagsImpl;
import com.vportal.portlet.vlegal.model.impl.VLegalTagsModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The persistence implementation for the v legal tags service.
 *
 * <p>
 * Never modify or reference this class directly. Always use {@link VLegalTagsUtil} to access the v legal tags persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
 * </p>
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author ACB
 * @see VLegalTagsPersistence
 * @see VLegalTagsUtil
 * @generated
 */
public class VLegalTagsPersistenceImpl extends BasePersistenceImpl<VLegalTags>
	implements VLegalTagsPersistence {
	public static final String FINDER_CLASS_NAME_ENTITY = VLegalTagsImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST = FINDER_CLASS_NAME_ENTITY +
		".List";
	public static final FinderPath FINDER_PATH_FIND_BY_GROUPID = new FinderPath(VLegalTagsModelImpl.ENTITY_CACHE_ENABLED,
			VLegalTagsModelImpl.FINDER_CACHE_ENABLED, FINDER_CLASS_NAME_LIST,
			"findByGroupId",
			new String[] {
				Long.class.getName(),
				
			"java.lang.Integer", "java.lang.Integer",
				"com.liferay.portal.kernel.util.OrderByComparator"
			});
	public static final FinderPath FINDER_PATH_COUNT_BY_GROUPID = new FinderPath(VLegalTagsModelImpl.ENTITY_CACHE_ENABLED,
			VLegalTagsModelImpl.FINDER_CACHE_ENABLED, FINDER_CLASS_NAME_LIST,
			"countByGroupId", new String[] { Long.class.getName() });
	public static final FinderPath FINDER_PATH_FIND_BY_P_S = new FinderPath(VLegalTagsModelImpl.ENTITY_CACHE_ENABLED,
			VLegalTagsModelImpl.FINDER_CACHE_ENABLED, FINDER_CLASS_NAME_LIST,
			"findByP_S",
			new String[] {
				Long.class.getName(), Boolean.class.getName(),
				
			"java.lang.Integer", "java.lang.Integer",
				"com.liferay.portal.kernel.util.OrderByComparator"
			});
	public static final FinderPath FINDER_PATH_COUNT_BY_P_S = new FinderPath(VLegalTagsModelImpl.ENTITY_CACHE_ENABLED,
			VLegalTagsModelImpl.FINDER_CACHE_ENABLED, FINDER_CLASS_NAME_LIST,
			"countByP_S",
			new String[] { Long.class.getName(), Boolean.class.getName() });
	public static final FinderPath FINDER_PATH_FIND_ALL = new FinderPath(VLegalTagsModelImpl.ENTITY_CACHE_ENABLED,
			VLegalTagsModelImpl.FINDER_CACHE_ENABLED, FINDER_CLASS_NAME_LIST,
			"findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(VLegalTagsModelImpl.ENTITY_CACHE_ENABLED,
			VLegalTagsModelImpl.FINDER_CACHE_ENABLED, FINDER_CLASS_NAME_LIST,
			"countAll", new String[0]);

	/**
	 * Caches the v legal tags in the entity cache if it is enabled.
	 *
	 * @param vLegalTags the v legal tags to cache
	 */
	public void cacheResult(VLegalTags vLegalTags) {
		EntityCacheUtil.putResult(VLegalTagsModelImpl.ENTITY_CACHE_ENABLED,
			VLegalTagsImpl.class, vLegalTags.getPrimaryKey(), vLegalTags);
	}

	/**
	 * Caches the v legal tagses in the entity cache if it is enabled.
	 *
	 * @param vLegalTagses the v legal tagses to cache
	 */
	public void cacheResult(List<VLegalTags> vLegalTagses) {
		for (VLegalTags vLegalTags : vLegalTagses) {
			if (EntityCacheUtil.getResult(
						VLegalTagsModelImpl.ENTITY_CACHE_ENABLED,
						VLegalTagsImpl.class, vLegalTags.getPrimaryKey(), this) == null) {
				cacheResult(vLegalTags);
			}
		}
	}

	/**
	 * Clears the cache for all v legal tagses.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	public void clearCache() {
		CacheRegistryUtil.clear(VLegalTagsImpl.class.getName());
		EntityCacheUtil.clearCache(VLegalTagsImpl.class.getName());
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST);
	}

	/**
	 * Clears the cache for the v legal tags.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	public void clearCache(VLegalTags vLegalTags) {
		EntityCacheUtil.removeResult(VLegalTagsModelImpl.ENTITY_CACHE_ENABLED,
			VLegalTagsImpl.class, vLegalTags.getPrimaryKey());
	}

	/**
	 * Creates a new v legal tags with the primary key. Does not add the v legal tags to the database.
	 *
	 * @param tagId the primary key for the new v legal tags
	 * @return the new v legal tags
	 */
	public VLegalTags create(String tagId) {
		VLegalTags vLegalTags = new VLegalTagsImpl();

		vLegalTags.setNew(true);
		vLegalTags.setPrimaryKey(tagId);

		return vLegalTags;
	}

	/**
	 * Removes the v legal tags with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the v legal tags to remove
	 * @return the v legal tags that was removed
	 * @throws com.liferay.portal.NoSuchModelException if a v legal tags with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public VLegalTags remove(Serializable primaryKey)
		throws NoSuchModelException, SystemException {
		return remove((String)primaryKey);
	}

	/**
	 * Removes the v legal tags with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param tagId the primary key of the v legal tags to remove
	 * @return the v legal tags that was removed
	 * @throws com.vportal.portlet.vlegal.NoSuchVLegalTagsException if a v legal tags with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public VLegalTags remove(String tagId)
		throws NoSuchVLegalTagsException, SystemException {
		Session session = null;

		try {
			session = openSession();

			VLegalTags vLegalTags = (VLegalTags)session.get(VLegalTagsImpl.class,
					tagId);

			if (vLegalTags == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + tagId);
				}

				throw new NoSuchVLegalTagsException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					tagId);
			}

			return remove(vLegalTags);
		}
		catch (NoSuchVLegalTagsException nsee) {
			throw nsee;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected VLegalTags removeImpl(VLegalTags vLegalTags)
		throws SystemException {
		vLegalTags = toUnwrappedModel(vLegalTags);

		Session session = null;

		try {
			session = openSession();

			BatchSessionUtil.delete(session, vLegalTags);
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST);

		EntityCacheUtil.removeResult(VLegalTagsModelImpl.ENTITY_CACHE_ENABLED,
			VLegalTagsImpl.class, vLegalTags.getPrimaryKey());

		return vLegalTags;
	}

	public VLegalTags updateImpl(
		com.vportal.portlet.vlegal.model.VLegalTags vLegalTags, boolean merge)
		throws SystemException {
		vLegalTags = toUnwrappedModel(vLegalTags);

		Session session = null;

		try {
			session = openSession();

			BatchSessionUtil.update(session, vLegalTags, merge);

			vLegalTags.setNew(false);
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST);

		EntityCacheUtil.putResult(VLegalTagsModelImpl.ENTITY_CACHE_ENABLED,
			VLegalTagsImpl.class, vLegalTags.getPrimaryKey(), vLegalTags);

		return vLegalTags;
	}

	protected VLegalTags toUnwrappedModel(VLegalTags vLegalTags) {
		if (vLegalTags instanceof VLegalTagsImpl) {
			return vLegalTags;
		}

		VLegalTagsImpl vLegalTagsImpl = new VLegalTagsImpl();

		vLegalTagsImpl.setNew(vLegalTags.isNew());
		vLegalTagsImpl.setPrimaryKey(vLegalTags.getPrimaryKey());

		vLegalTagsImpl.setTagId(vLegalTags.getTagId());
		vLegalTagsImpl.setGroupId(vLegalTags.getGroupId());
		vLegalTagsImpl.setCompanyId(vLegalTags.getCompanyId());
		vLegalTagsImpl.setUserId(vLegalTags.getUserId());
		vLegalTagsImpl.setCreatedDate(vLegalTags.getCreatedDate());
		vLegalTagsImpl.setModifiedDate(vLegalTags.getModifiedDate());
		vLegalTagsImpl.setName(vLegalTags.getName());
		vLegalTagsImpl.setStatusTags(vLegalTags.isStatusTags());

		return vLegalTagsImpl;
	}

	/**
	 * Finds the v legal tags with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the v legal tags to find
	 * @return the v legal tags
	 * @throws com.liferay.portal.NoSuchModelException if a v legal tags with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public VLegalTags findByPrimaryKey(Serializable primaryKey)
		throws NoSuchModelException, SystemException {
		return findByPrimaryKey((String)primaryKey);
	}

	/**
	 * Finds the v legal tags with the primary key or throws a {@link com.vportal.portlet.vlegal.NoSuchVLegalTagsException} if it could not be found.
	 *
	 * @param tagId the primary key of the v legal tags to find
	 * @return the v legal tags
	 * @throws com.vportal.portlet.vlegal.NoSuchVLegalTagsException if a v legal tags with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public VLegalTags findByPrimaryKey(String tagId)
		throws NoSuchVLegalTagsException, SystemException {
		VLegalTags vLegalTags = fetchByPrimaryKey(tagId);

		if (vLegalTags == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + tagId);
			}

			throw new NoSuchVLegalTagsException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				tagId);
		}

		return vLegalTags;
	}

	/**
	 * Finds the v legal tags with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the v legal tags to find
	 * @return the v legal tags, or <code>null</code> if a v legal tags with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public VLegalTags fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		return fetchByPrimaryKey((String)primaryKey);
	}

	/**
	 * Finds the v legal tags with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param tagId the primary key of the v legal tags to find
	 * @return the v legal tags, or <code>null</code> if a v legal tags with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public VLegalTags fetchByPrimaryKey(String tagId) throws SystemException {
		VLegalTags vLegalTags = (VLegalTags)EntityCacheUtil.getResult(VLegalTagsModelImpl.ENTITY_CACHE_ENABLED,
				VLegalTagsImpl.class, tagId, this);

		if (vLegalTags == null) {
			Session session = null;

			try {
				session = openSession();

				vLegalTags = (VLegalTags)session.get(VLegalTagsImpl.class, tagId);
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (vLegalTags != null) {
					cacheResult(vLegalTags);
				}

				closeSession(session);
			}
		}

		return vLegalTags;
	}

	/**
	 * Finds all the v legal tagses where groupId = &#63;.
	 *
	 * @param groupId the group id to search with
	 * @return the matching v legal tagses
	 * @throws SystemException if a system exception occurred
	 */
	public List<VLegalTags> findByGroupId(long groupId)
		throws SystemException {
		return findByGroupId(groupId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Finds a range of all the v legal tagses where groupId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param groupId the group id to search with
	 * @param start the lower bound of the range of v legal tagses to return
	 * @param end the upper bound of the range of v legal tagses to return (not inclusive)
	 * @return the range of matching v legal tagses
	 * @throws SystemException if a system exception occurred
	 */
	public List<VLegalTags> findByGroupId(long groupId, int start, int end)
		throws SystemException {
		return findByGroupId(groupId, start, end, null);
	}

	/**
	 * Finds an ordered range of all the v legal tagses where groupId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param groupId the group id to search with
	 * @param start the lower bound of the range of v legal tagses to return
	 * @param end the upper bound of the range of v legal tagses to return (not inclusive)
	 * @param orderByComparator the comparator to order the results by
	 * @return the ordered range of matching v legal tagses
	 * @throws SystemException if a system exception occurred
	 */
	public List<VLegalTags> findByGroupId(long groupId, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		Object[] finderArgs = new Object[] {
				groupId,
				
				String.valueOf(start), String.valueOf(end),
				String.valueOf(orderByComparator)
			};

		List<VLegalTags> list = (List<VLegalTags>)FinderCacheUtil.getResult(FINDER_PATH_FIND_BY_GROUPID,
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

			query.append(_SQL_SELECT_VLEGALTAGS_WHERE);

			query.append(_FINDER_COLUMN_GROUPID_GROUPID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}

			else {
				query.append(VLegalTagsModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(groupId);

				list = (List<VLegalTags>)QueryUtil.list(q, getDialect(), start,
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
	 * Finds the first v legal tags in the ordered set where groupId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param groupId the group id to search with
	 * @param orderByComparator the comparator to order the set by
	 * @return the first matching v legal tags
	 * @throws com.vportal.portlet.vlegal.NoSuchVLegalTagsException if a matching v legal tags could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public VLegalTags findByGroupId_First(long groupId,
		OrderByComparator orderByComparator)
		throws NoSuchVLegalTagsException, SystemException {
		List<VLegalTags> list = findByGroupId(groupId, 0, 1, orderByComparator);

		if (list.isEmpty()) {
			StringBundler msg = new StringBundler(4);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("groupId=");
			msg.append(groupId);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			throw new NoSuchVLegalTagsException(msg.toString());
		}
		else {
			return list.get(0);
		}
	}

	/**
	 * Finds the last v legal tags in the ordered set where groupId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param groupId the group id to search with
	 * @param orderByComparator the comparator to order the set by
	 * @return the last matching v legal tags
	 * @throws com.vportal.portlet.vlegal.NoSuchVLegalTagsException if a matching v legal tags could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public VLegalTags findByGroupId_Last(long groupId,
		OrderByComparator orderByComparator)
		throws NoSuchVLegalTagsException, SystemException {
		int count = countByGroupId(groupId);

		List<VLegalTags> list = findByGroupId(groupId, count - 1, count,
				orderByComparator);

		if (list.isEmpty()) {
			StringBundler msg = new StringBundler(4);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("groupId=");
			msg.append(groupId);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			throw new NoSuchVLegalTagsException(msg.toString());
		}
		else {
			return list.get(0);
		}
	}

	/**
	 * Finds the v legal tagses before and after the current v legal tags in the ordered set where groupId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param tagId the primary key of the current v legal tags
	 * @param groupId the group id to search with
	 * @param orderByComparator the comparator to order the set by
	 * @return the previous, current, and next v legal tags
	 * @throws com.vportal.portlet.vlegal.NoSuchVLegalTagsException if a v legal tags with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public VLegalTags[] findByGroupId_PrevAndNext(String tagId, long groupId,
		OrderByComparator orderByComparator)
		throws NoSuchVLegalTagsException, SystemException {
		VLegalTags vLegalTags = findByPrimaryKey(tagId);

		Session session = null;

		try {
			session = openSession();

			VLegalTags[] array = new VLegalTagsImpl[3];

			array[0] = getByGroupId_PrevAndNext(session, vLegalTags, groupId,
					orderByComparator, true);

			array[1] = vLegalTags;

			array[2] = getByGroupId_PrevAndNext(session, vLegalTags, groupId,
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

	protected VLegalTags getByGroupId_PrevAndNext(Session session,
		VLegalTags vLegalTags, long groupId,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_VLEGALTAGS_WHERE);

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
			query.append(VLegalTagsModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(groupId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByValues(vLegalTags);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<VLegalTags> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Finds all the v legal tagses where groupId = &#63; and statusTags = &#63;.
	 *
	 * @param groupId the group id to search with
	 * @param statusTags the status tags to search with
	 * @return the matching v legal tagses
	 * @throws SystemException if a system exception occurred
	 */
	public List<VLegalTags> findByP_S(long groupId, boolean statusTags)
		throws SystemException {
		return findByP_S(groupId, statusTags, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Finds a range of all the v legal tagses where groupId = &#63; and statusTags = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param groupId the group id to search with
	 * @param statusTags the status tags to search with
	 * @param start the lower bound of the range of v legal tagses to return
	 * @param end the upper bound of the range of v legal tagses to return (not inclusive)
	 * @return the range of matching v legal tagses
	 * @throws SystemException if a system exception occurred
	 */
	public List<VLegalTags> findByP_S(long groupId, boolean statusTags,
		int start, int end) throws SystemException {
		return findByP_S(groupId, statusTags, start, end, null);
	}

	/**
	 * Finds an ordered range of all the v legal tagses where groupId = &#63; and statusTags = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param groupId the group id to search with
	 * @param statusTags the status tags to search with
	 * @param start the lower bound of the range of v legal tagses to return
	 * @param end the upper bound of the range of v legal tagses to return (not inclusive)
	 * @param orderByComparator the comparator to order the results by
	 * @return the ordered range of matching v legal tagses
	 * @throws SystemException if a system exception occurred
	 */
	public List<VLegalTags> findByP_S(long groupId, boolean statusTags,
		int start, int end, OrderByComparator orderByComparator)
		throws SystemException {
		Object[] finderArgs = new Object[] {
				groupId, statusTags,
				
				String.valueOf(start), String.valueOf(end),
				String.valueOf(orderByComparator)
			};

		List<VLegalTags> list = (List<VLegalTags>)FinderCacheUtil.getResult(FINDER_PATH_FIND_BY_P_S,
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

			query.append(_SQL_SELECT_VLEGALTAGS_WHERE);

			query.append(_FINDER_COLUMN_P_S_GROUPID_2);

			query.append(_FINDER_COLUMN_P_S_STATUSTAGS_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}

			else {
				query.append(VLegalTagsModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(groupId);

				qPos.add(statusTags);

				list = (List<VLegalTags>)QueryUtil.list(q, getDialect(), start,
						end);
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (list == null) {
					FinderCacheUtil.removeResult(FINDER_PATH_FIND_BY_P_S,
						finderArgs);
				}
				else {
					cacheResult(list);

					FinderCacheUtil.putResult(FINDER_PATH_FIND_BY_P_S,
						finderArgs, list);
				}

				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Finds the first v legal tags in the ordered set where groupId = &#63; and statusTags = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param groupId the group id to search with
	 * @param statusTags the status tags to search with
	 * @param orderByComparator the comparator to order the set by
	 * @return the first matching v legal tags
	 * @throws com.vportal.portlet.vlegal.NoSuchVLegalTagsException if a matching v legal tags could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public VLegalTags findByP_S_First(long groupId, boolean statusTags,
		OrderByComparator orderByComparator)
		throws NoSuchVLegalTagsException, SystemException {
		List<VLegalTags> list = findByP_S(groupId, statusTags, 0, 1,
				orderByComparator);

		if (list.isEmpty()) {
			StringBundler msg = new StringBundler(6);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("groupId=");
			msg.append(groupId);

			msg.append(", statusTags=");
			msg.append(statusTags);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			throw new NoSuchVLegalTagsException(msg.toString());
		}
		else {
			return list.get(0);
		}
	}

	/**
	 * Finds the last v legal tags in the ordered set where groupId = &#63; and statusTags = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param groupId the group id to search with
	 * @param statusTags the status tags to search with
	 * @param orderByComparator the comparator to order the set by
	 * @return the last matching v legal tags
	 * @throws com.vportal.portlet.vlegal.NoSuchVLegalTagsException if a matching v legal tags could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public VLegalTags findByP_S_Last(long groupId, boolean statusTags,
		OrderByComparator orderByComparator)
		throws NoSuchVLegalTagsException, SystemException {
		int count = countByP_S(groupId, statusTags);

		List<VLegalTags> list = findByP_S(groupId, statusTags, count - 1,
				count, orderByComparator);

		if (list.isEmpty()) {
			StringBundler msg = new StringBundler(6);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("groupId=");
			msg.append(groupId);

			msg.append(", statusTags=");
			msg.append(statusTags);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			throw new NoSuchVLegalTagsException(msg.toString());
		}
		else {
			return list.get(0);
		}
	}

	/**
	 * Finds the v legal tagses before and after the current v legal tags in the ordered set where groupId = &#63; and statusTags = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param tagId the primary key of the current v legal tags
	 * @param groupId the group id to search with
	 * @param statusTags the status tags to search with
	 * @param orderByComparator the comparator to order the set by
	 * @return the previous, current, and next v legal tags
	 * @throws com.vportal.portlet.vlegal.NoSuchVLegalTagsException if a v legal tags with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public VLegalTags[] findByP_S_PrevAndNext(String tagId, long groupId,
		boolean statusTags, OrderByComparator orderByComparator)
		throws NoSuchVLegalTagsException, SystemException {
		VLegalTags vLegalTags = findByPrimaryKey(tagId);

		Session session = null;

		try {
			session = openSession();

			VLegalTags[] array = new VLegalTagsImpl[3];

			array[0] = getByP_S_PrevAndNext(session, vLegalTags, groupId,
					statusTags, orderByComparator, true);

			array[1] = vLegalTags;

			array[2] = getByP_S_PrevAndNext(session, vLegalTags, groupId,
					statusTags, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected VLegalTags getByP_S_PrevAndNext(Session session,
		VLegalTags vLegalTags, long groupId, boolean statusTags,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_VLEGALTAGS_WHERE);

		query.append(_FINDER_COLUMN_P_S_GROUPID_2);

		query.append(_FINDER_COLUMN_P_S_STATUSTAGS_2);

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
			query.append(VLegalTagsModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(groupId);

		qPos.add(statusTags);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByValues(vLegalTags);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<VLegalTags> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Finds all the v legal tagses.
	 *
	 * @return the v legal tagses
	 * @throws SystemException if a system exception occurred
	 */
	public List<VLegalTags> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Finds a range of all the v legal tagses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param start the lower bound of the range of v legal tagses to return
	 * @param end the upper bound of the range of v legal tagses to return (not inclusive)
	 * @return the range of v legal tagses
	 * @throws SystemException if a system exception occurred
	 */
	public List<VLegalTags> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Finds an ordered range of all the v legal tagses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param start the lower bound of the range of v legal tagses to return
	 * @param end the upper bound of the range of v legal tagses to return (not inclusive)
	 * @param orderByComparator the comparator to order the results by
	 * @return the ordered range of v legal tagses
	 * @throws SystemException if a system exception occurred
	 */
	public List<VLegalTags> findAll(int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		Object[] finderArgs = new Object[] {
				String.valueOf(start), String.valueOf(end),
				String.valueOf(orderByComparator)
			};

		List<VLegalTags> list = (List<VLegalTags>)FinderCacheUtil.getResult(FINDER_PATH_FIND_ALL,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_VLEGALTAGS);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_VLEGALTAGS.concat(VLegalTagsModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (orderByComparator == null) {
					list = (List<VLegalTags>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);
				}
				else {
					list = (List<VLegalTags>)QueryUtil.list(q, getDialect(),
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
	 * Removes all the v legal tagses where groupId = &#63; from the database.
	 *
	 * @param groupId the group id to search with
	 * @throws SystemException if a system exception occurred
	 */
	public void removeByGroupId(long groupId) throws SystemException {
		for (VLegalTags vLegalTags : findByGroupId(groupId)) {
			remove(vLegalTags);
		}
	}

	/**
	 * Removes all the v legal tagses where groupId = &#63; and statusTags = &#63; from the database.
	 *
	 * @param groupId the group id to search with
	 * @param statusTags the status tags to search with
	 * @throws SystemException if a system exception occurred
	 */
	public void removeByP_S(long groupId, boolean statusTags)
		throws SystemException {
		for (VLegalTags vLegalTags : findByP_S(groupId, statusTags)) {
			remove(vLegalTags);
		}
	}

	/**
	 * Removes all the v legal tagses from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	public void removeAll() throws SystemException {
		for (VLegalTags vLegalTags : findAll()) {
			remove(vLegalTags);
		}
	}

	/**
	 * Counts all the v legal tagses where groupId = &#63;.
	 *
	 * @param groupId the group id to search with
	 * @return the number of matching v legal tagses
	 * @throws SystemException if a system exception occurred
	 */
	public int countByGroupId(long groupId) throws SystemException {
		Object[] finderArgs = new Object[] { groupId };

		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_BY_GROUPID,
				finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_VLEGALTAGS_WHERE);

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
	 * Counts all the v legal tagses where groupId = &#63; and statusTags = &#63;.
	 *
	 * @param groupId the group id to search with
	 * @param statusTags the status tags to search with
	 * @return the number of matching v legal tagses
	 * @throws SystemException if a system exception occurred
	 */
	public int countByP_S(long groupId, boolean statusTags)
		throws SystemException {
		Object[] finderArgs = new Object[] { groupId, statusTags };

		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_BY_P_S,
				finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_VLEGALTAGS_WHERE);

			query.append(_FINDER_COLUMN_P_S_GROUPID_2);

			query.append(_FINDER_COLUMN_P_S_STATUSTAGS_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(groupId);

				qPos.add(statusTags);

				count = (Long)q.uniqueResult();
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (count == null) {
					count = Long.valueOf(0);
				}

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_P_S, finderArgs,
					count);

				closeSession(session);
			}
		}

		return count.intValue();
	}

	/**
	 * Counts all the v legal tagses.
	 *
	 * @return the number of v legal tagses
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

				Query q = session.createQuery(_SQL_COUNT_VLEGALTAGS);

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
	 * Initializes the v legal tags persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.com.vportal.portlet.vlegal.model.VLegalTags")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<VLegalTags>> listenersList = new ArrayList<ModelListener<VLegalTags>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<VLegalTags>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(VLegalTagsImpl.class.getName());
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
	private static final String _SQL_SELECT_VLEGALTAGS = "SELECT vLegalTags FROM VLegalTags vLegalTags";
	private static final String _SQL_SELECT_VLEGALTAGS_WHERE = "SELECT vLegalTags FROM VLegalTags vLegalTags WHERE ";
	private static final String _SQL_COUNT_VLEGALTAGS = "SELECT COUNT(vLegalTags) FROM VLegalTags vLegalTags";
	private static final String _SQL_COUNT_VLEGALTAGS_WHERE = "SELECT COUNT(vLegalTags) FROM VLegalTags vLegalTags WHERE ";
	private static final String _FINDER_COLUMN_GROUPID_GROUPID_2 = "vLegalTags.groupId = ?";
	private static final String _FINDER_COLUMN_P_S_GROUPID_2 = "vLegalTags.groupId = ? AND ";
	private static final String _FINDER_COLUMN_P_S_STATUSTAGS_2 = "vLegalTags.statusTags = ?";
	private static final String _ORDER_BY_ENTITY_ALIAS = "vLegalTags.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No VLegalTags exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No VLegalTags exists with the key {";
	private static Log _log = LogFactoryUtil.getLog(VLegalTagsPersistenceImpl.class);
}