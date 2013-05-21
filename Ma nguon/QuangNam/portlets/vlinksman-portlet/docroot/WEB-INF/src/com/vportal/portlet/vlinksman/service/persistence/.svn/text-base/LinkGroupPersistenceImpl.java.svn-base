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

package com.vportal.portlet.vlinksman.service.persistence;

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

import com.vportal.portlet.vlinksman.NoSuchLinkGroupException;
import com.vportal.portlet.vlinksman.model.LinkGroup;
import com.vportal.portlet.vlinksman.model.impl.LinkGroupImpl;
import com.vportal.portlet.vlinksman.model.impl.LinkGroupModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The persistence implementation for the link group service.
 *
 * <p>
 * Never modify or reference this class directly. Always use {@link LinkGroupUtil} to access the link group persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
 * </p>
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author hai
 * @see LinkGroupPersistence
 * @see LinkGroupUtil
 * @generated
 */
public class LinkGroupPersistenceImpl extends BasePersistenceImpl<LinkGroup>
	implements LinkGroupPersistence {
	public static final String FINDER_CLASS_NAME_ENTITY = LinkGroupImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST = FINDER_CLASS_NAME_ENTITY +
		".List";
	public static final FinderPath FINDER_PATH_FIND_BY_GROUPID = new FinderPath(LinkGroupModelImpl.ENTITY_CACHE_ENABLED,
			LinkGroupModelImpl.FINDER_CACHE_ENABLED, FINDER_CLASS_NAME_LIST,
			"findBygroupId",
			new String[] {
				Long.class.getName(),
				
			"java.lang.Integer", "java.lang.Integer",
				"com.liferay.portal.kernel.util.OrderByComparator"
			});
	public static final FinderPath FINDER_PATH_COUNT_BY_GROUPID = new FinderPath(LinkGroupModelImpl.ENTITY_CACHE_ENABLED,
			LinkGroupModelImpl.FINDER_CACHE_ENABLED, FINDER_CLASS_NAME_LIST,
			"countBygroupId", new String[] { Long.class.getName() });
	public static final FinderPath FINDER_PATH_FIND_ALL = new FinderPath(LinkGroupModelImpl.ENTITY_CACHE_ENABLED,
			LinkGroupModelImpl.FINDER_CACHE_ENABLED, FINDER_CLASS_NAME_LIST,
			"findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(LinkGroupModelImpl.ENTITY_CACHE_ENABLED,
			LinkGroupModelImpl.FINDER_CACHE_ENABLED, FINDER_CLASS_NAME_LIST,
			"countAll", new String[0]);

	/**
	 * Caches the link group in the entity cache if it is enabled.
	 *
	 * @param linkGroup the link group to cache
	 */
	public void cacheResult(LinkGroup linkGroup) {
		EntityCacheUtil.putResult(LinkGroupModelImpl.ENTITY_CACHE_ENABLED,
			LinkGroupImpl.class, linkGroup.getPrimaryKey(), linkGroup);
	}

	/**
	 * Caches the link groups in the entity cache if it is enabled.
	 *
	 * @param linkGroups the link groups to cache
	 */
	public void cacheResult(List<LinkGroup> linkGroups) {
		for (LinkGroup linkGroup : linkGroups) {
			if (EntityCacheUtil.getResult(
						LinkGroupModelImpl.ENTITY_CACHE_ENABLED,
						LinkGroupImpl.class, linkGroup.getPrimaryKey(), this) == null) {
				cacheResult(linkGroup);
			}
		}
	}

	/**
	 * Clears the cache for all link groups.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	public void clearCache() {
		CacheRegistryUtil.clear(LinkGroupImpl.class.getName());
		EntityCacheUtil.clearCache(LinkGroupImpl.class.getName());
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST);
	}

	/**
	 * Clears the cache for the link group.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	public void clearCache(LinkGroup linkGroup) {
		EntityCacheUtil.removeResult(LinkGroupModelImpl.ENTITY_CACHE_ENABLED,
			LinkGroupImpl.class, linkGroup.getPrimaryKey());
	}

	/**
	 * Creates a new link group with the primary key. Does not add the link group to the database.
	 *
	 * @param linkgroupId the primary key for the new link group
	 * @return the new link group
	 */
	public LinkGroup create(long linkgroupId) {
		LinkGroup linkGroup = new LinkGroupImpl();

		linkGroup.setNew(true);
		linkGroup.setPrimaryKey(linkgroupId);

		return linkGroup;
	}

	/**
	 * Removes the link group with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the link group to remove
	 * @return the link group that was removed
	 * @throws com.liferay.portal.NoSuchModelException if a link group with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public LinkGroup remove(Serializable primaryKey)
		throws NoSuchModelException, SystemException {
		return remove(((Long)primaryKey).longValue());
	}

	/**
	 * Removes the link group with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param linkgroupId the primary key of the link group to remove
	 * @return the link group that was removed
	 * @throws com.vportal.portlet.vlinksman.NoSuchLinkGroupException if a link group with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public LinkGroup remove(long linkgroupId)
		throws NoSuchLinkGroupException, SystemException {
		Session session = null;

		try {
			session = openSession();

			LinkGroup linkGroup = (LinkGroup)session.get(LinkGroupImpl.class,
					new Long(linkgroupId));

			if (linkGroup == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + linkgroupId);
				}

				throw new NoSuchLinkGroupException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					linkgroupId);
			}

			return remove(linkGroup);
		}
		catch (NoSuchLinkGroupException nsee) {
			throw nsee;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected LinkGroup removeImpl(LinkGroup linkGroup)
		throws SystemException {
		linkGroup = toUnwrappedModel(linkGroup);

		Session session = null;

		try {
			session = openSession();

			BatchSessionUtil.delete(session, linkGroup);
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST);

		EntityCacheUtil.removeResult(LinkGroupModelImpl.ENTITY_CACHE_ENABLED,
			LinkGroupImpl.class, linkGroup.getPrimaryKey());

		return linkGroup;
	}

	public LinkGroup updateImpl(
		com.vportal.portlet.vlinksman.model.LinkGroup linkGroup, boolean merge)
		throws SystemException {
		linkGroup = toUnwrappedModel(linkGroup);

		Session session = null;

		try {
			session = openSession();

			BatchSessionUtil.update(session, linkGroup, merge);

			linkGroup.setNew(false);
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST);

		EntityCacheUtil.putResult(LinkGroupModelImpl.ENTITY_CACHE_ENABLED,
			LinkGroupImpl.class, linkGroup.getPrimaryKey(), linkGroup);

		return linkGroup;
	}

	protected LinkGroup toUnwrappedModel(LinkGroup linkGroup) {
		if (linkGroup instanceof LinkGroupImpl) {
			return linkGroup;
		}

		LinkGroupImpl linkGroupImpl = new LinkGroupImpl();

		linkGroupImpl.setNew(linkGroup.isNew());
		linkGroupImpl.setPrimaryKey(linkGroup.getPrimaryKey());

		linkGroupImpl.setLinkgroupId(linkGroup.getLinkgroupId());
		linkGroupImpl.setGroupId(linkGroup.getGroupId());
		linkGroupImpl.setCompanyId(linkGroup.getCompanyId());
		linkGroupImpl.setCreatedDate(linkGroup.getCreatedDate());
		linkGroupImpl.setModifiedDate(linkGroup.getModifiedDate());
		linkGroupImpl.setName(linkGroup.getName());
		linkGroupImpl.setDescription(linkGroup.getDescription());

		return linkGroupImpl;
	}

	/**
	 * Finds the link group with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the link group to find
	 * @return the link group
	 * @throws com.liferay.portal.NoSuchModelException if a link group with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public LinkGroup findByPrimaryKey(Serializable primaryKey)
		throws NoSuchModelException, SystemException {
		return findByPrimaryKey(((Long)primaryKey).longValue());
	}

	/**
	 * Finds the link group with the primary key or throws a {@link com.vportal.portlet.vlinksman.NoSuchLinkGroupException} if it could not be found.
	 *
	 * @param linkgroupId the primary key of the link group to find
	 * @return the link group
	 * @throws com.vportal.portlet.vlinksman.NoSuchLinkGroupException if a link group with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public LinkGroup findByPrimaryKey(long linkgroupId)
		throws NoSuchLinkGroupException, SystemException {
		LinkGroup linkGroup = fetchByPrimaryKey(linkgroupId);

		if (linkGroup == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + linkgroupId);
			}

			throw new NoSuchLinkGroupException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				linkgroupId);
		}

		return linkGroup;
	}

	/**
	 * Finds the link group with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the link group to find
	 * @return the link group, or <code>null</code> if a link group with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public LinkGroup fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		return fetchByPrimaryKey(((Long)primaryKey).longValue());
	}

	/**
	 * Finds the link group with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param linkgroupId the primary key of the link group to find
	 * @return the link group, or <code>null</code> if a link group with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public LinkGroup fetchByPrimaryKey(long linkgroupId)
		throws SystemException {
		LinkGroup linkGroup = (LinkGroup)EntityCacheUtil.getResult(LinkGroupModelImpl.ENTITY_CACHE_ENABLED,
				LinkGroupImpl.class, linkgroupId, this);

		if (linkGroup == null) {
			Session session = null;

			try {
				session = openSession();

				linkGroup = (LinkGroup)session.get(LinkGroupImpl.class,
						new Long(linkgroupId));
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (linkGroup != null) {
					cacheResult(linkGroup);
				}

				closeSession(session);
			}
		}

		return linkGroup;
	}

	/**
	 * Finds all the link groups where groupId = &#63;.
	 *
	 * @param groupId the group id to search with
	 * @return the matching link groups
	 * @throws SystemException if a system exception occurred
	 */
	public List<LinkGroup> findBygroupId(long groupId)
		throws SystemException {
		return findBygroupId(groupId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Finds a range of all the link groups where groupId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param groupId the group id to search with
	 * @param start the lower bound of the range of link groups to return
	 * @param end the upper bound of the range of link groups to return (not inclusive)
	 * @return the range of matching link groups
	 * @throws SystemException if a system exception occurred
	 */
	public List<LinkGroup> findBygroupId(long groupId, int start, int end)
		throws SystemException {
		return findBygroupId(groupId, start, end, null);
	}

	/**
	 * Finds an ordered range of all the link groups where groupId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param groupId the group id to search with
	 * @param start the lower bound of the range of link groups to return
	 * @param end the upper bound of the range of link groups to return (not inclusive)
	 * @param orderByComparator the comparator to order the results by
	 * @return the ordered range of matching link groups
	 * @throws SystemException if a system exception occurred
	 */
	public List<LinkGroup> findBygroupId(long groupId, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		Object[] finderArgs = new Object[] {
				groupId,
				
				String.valueOf(start), String.valueOf(end),
				String.valueOf(orderByComparator)
			};

		List<LinkGroup> list = (List<LinkGroup>)FinderCacheUtil.getResult(FINDER_PATH_FIND_BY_GROUPID,
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

			query.append(_SQL_SELECT_LINKGROUP_WHERE);

			query.append(_FINDER_COLUMN_GROUPID_GROUPID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}

			else {
				query.append(LinkGroupModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(groupId);

				list = (List<LinkGroup>)QueryUtil.list(q, getDialect(), start,
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
	 * Finds the first link group in the ordered set where groupId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param groupId the group id to search with
	 * @param orderByComparator the comparator to order the set by
	 * @return the first matching link group
	 * @throws com.vportal.portlet.vlinksman.NoSuchLinkGroupException if a matching link group could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public LinkGroup findBygroupId_First(long groupId,
		OrderByComparator orderByComparator)
		throws NoSuchLinkGroupException, SystemException {
		List<LinkGroup> list = findBygroupId(groupId, 0, 1, orderByComparator);

		if (list.isEmpty()) {
			StringBundler msg = new StringBundler(4);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("groupId=");
			msg.append(groupId);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			throw new NoSuchLinkGroupException(msg.toString());
		}
		else {
			return list.get(0);
		}
	}

	/**
	 * Finds the last link group in the ordered set where groupId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param groupId the group id to search with
	 * @param orderByComparator the comparator to order the set by
	 * @return the last matching link group
	 * @throws com.vportal.portlet.vlinksman.NoSuchLinkGroupException if a matching link group could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public LinkGroup findBygroupId_Last(long groupId,
		OrderByComparator orderByComparator)
		throws NoSuchLinkGroupException, SystemException {
		int count = countBygroupId(groupId);

		List<LinkGroup> list = findBygroupId(groupId, count - 1, count,
				orderByComparator);

		if (list.isEmpty()) {
			StringBundler msg = new StringBundler(4);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("groupId=");
			msg.append(groupId);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			throw new NoSuchLinkGroupException(msg.toString());
		}
		else {
			return list.get(0);
		}
	}

	/**
	 * Finds the link groups before and after the current link group in the ordered set where groupId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param linkgroupId the primary key of the current link group
	 * @param groupId the group id to search with
	 * @param orderByComparator the comparator to order the set by
	 * @return the previous, current, and next link group
	 * @throws com.vportal.portlet.vlinksman.NoSuchLinkGroupException if a link group with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public LinkGroup[] findBygroupId_PrevAndNext(long linkgroupId,
		long groupId, OrderByComparator orderByComparator)
		throws NoSuchLinkGroupException, SystemException {
		LinkGroup linkGroup = findByPrimaryKey(linkgroupId);

		Session session = null;

		try {
			session = openSession();

			LinkGroup[] array = new LinkGroupImpl[3];

			array[0] = getBygroupId_PrevAndNext(session, linkGroup, groupId,
					orderByComparator, true);

			array[1] = linkGroup;

			array[2] = getBygroupId_PrevAndNext(session, linkGroup, groupId,
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

	protected LinkGroup getBygroupId_PrevAndNext(Session session,
		LinkGroup linkGroup, long groupId, OrderByComparator orderByComparator,
		boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_LINKGROUP_WHERE);

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
			query.append(LinkGroupModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(groupId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByValues(linkGroup);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<LinkGroup> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Finds all the link groups.
	 *
	 * @return the link groups
	 * @throws SystemException if a system exception occurred
	 */
	public List<LinkGroup> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Finds a range of all the link groups.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param start the lower bound of the range of link groups to return
	 * @param end the upper bound of the range of link groups to return (not inclusive)
	 * @return the range of link groups
	 * @throws SystemException if a system exception occurred
	 */
	public List<LinkGroup> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Finds an ordered range of all the link groups.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param start the lower bound of the range of link groups to return
	 * @param end the upper bound of the range of link groups to return (not inclusive)
	 * @param orderByComparator the comparator to order the results by
	 * @return the ordered range of link groups
	 * @throws SystemException if a system exception occurred
	 */
	public List<LinkGroup> findAll(int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		Object[] finderArgs = new Object[] {
				String.valueOf(start), String.valueOf(end),
				String.valueOf(orderByComparator)
			};

		List<LinkGroup> list = (List<LinkGroup>)FinderCacheUtil.getResult(FINDER_PATH_FIND_ALL,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_LINKGROUP);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_LINKGROUP.concat(LinkGroupModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (orderByComparator == null) {
					list = (List<LinkGroup>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);
				}
				else {
					list = (List<LinkGroup>)QueryUtil.list(q, getDialect(),
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
	 * Removes all the link groups where groupId = &#63; from the database.
	 *
	 * @param groupId the group id to search with
	 * @throws SystemException if a system exception occurred
	 */
	public void removeBygroupId(long groupId) throws SystemException {
		for (LinkGroup linkGroup : findBygroupId(groupId)) {
			remove(linkGroup);
		}
	}

	/**
	 * Removes all the link groups from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	public void removeAll() throws SystemException {
		for (LinkGroup linkGroup : findAll()) {
			remove(linkGroup);
		}
	}

	/**
	 * Counts all the link groups where groupId = &#63;.
	 *
	 * @param groupId the group id to search with
	 * @return the number of matching link groups
	 * @throws SystemException if a system exception occurred
	 */
	public int countBygroupId(long groupId) throws SystemException {
		Object[] finderArgs = new Object[] { groupId };

		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_BY_GROUPID,
				finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_LINKGROUP_WHERE);

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
	 * Counts all the link groups.
	 *
	 * @return the number of link groups
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

				Query q = session.createQuery(_SQL_COUNT_LINKGROUP);

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
	 * Initializes the link group persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.com.vportal.portlet.vlinksman.model.LinkGroup")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<LinkGroup>> listenersList = new ArrayList<ModelListener<LinkGroup>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<LinkGroup>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(LinkGroupImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST);
	}

	@BeanReference(type = LinkGroupPersistence.class)
	protected LinkGroupPersistence linkGroupPersistence;
	@BeanReference(type = LinksPersistence.class)
	protected LinksPersistence linksPersistence;
	@BeanReference(type = ResourcePersistence.class)
	protected ResourcePersistence resourcePersistence;
	@BeanReference(type = UserPersistence.class)
	protected UserPersistence userPersistence;
	private static final String _SQL_SELECT_LINKGROUP = "SELECT linkGroup FROM LinkGroup linkGroup";
	private static final String _SQL_SELECT_LINKGROUP_WHERE = "SELECT linkGroup FROM LinkGroup linkGroup WHERE ";
	private static final String _SQL_COUNT_LINKGROUP = "SELECT COUNT(linkGroup) FROM LinkGroup linkGroup";
	private static final String _SQL_COUNT_LINKGROUP_WHERE = "SELECT COUNT(linkGroup) FROM LinkGroup linkGroup WHERE ";
	private static final String _FINDER_COLUMN_GROUPID_GROUPID_2 = "linkGroup.groupId = ?";
	private static final String _ORDER_BY_ENTITY_ALIAS = "linkGroup.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No LinkGroup exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No LinkGroup exists with the key {";
	private static Log _log = LogFactoryUtil.getLog(LinkGroupPersistenceImpl.class);
}