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

package com.vportal.portlet.vadvman.service.persistence;

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

import com.vportal.portlet.vadvman.NoSuchAdvItemException;
import com.vportal.portlet.vadvman.model.AdvItem;
import com.vportal.portlet.vadvman.model.impl.AdvItemImpl;
import com.vportal.portlet.vadvman.model.impl.AdvItemModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The persistence implementation for the adv item service.
 *
 * <p>
 * Never modify or reference this class directly. Always use {@link AdvItemUtil} to access the adv item persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
 * </p>
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author HOAN
 * @see AdvItemPersistence
 * @see AdvItemUtil
 * @generated
 */
public class AdvItemPersistenceImpl extends BasePersistenceImpl<AdvItem>
	implements AdvItemPersistence {
	public static final String FINDER_CLASS_NAME_ENTITY = AdvItemImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST = FINDER_CLASS_NAME_ENTITY +
		".List";
	public static final FinderPath FINDER_PATH_FIND_BY_G = new FinderPath(AdvItemModelImpl.ENTITY_CACHE_ENABLED,
			AdvItemModelImpl.FINDER_CACHE_ENABLED, FINDER_CLASS_NAME_LIST,
			"findByG",
			new String[] {
				Long.class.getName(),
				
			"java.lang.Integer", "java.lang.Integer",
				"com.liferay.portal.kernel.util.OrderByComparator"
			});
	public static final FinderPath FINDER_PATH_COUNT_BY_G = new FinderPath(AdvItemModelImpl.ENTITY_CACHE_ENABLED,
			AdvItemModelImpl.FINDER_CACHE_ENABLED, FINDER_CLASS_NAME_LIST,
			"countByG", new String[] { Long.class.getName() });
	public static final FinderPath FINDER_PATH_FIND_BY_T = new FinderPath(AdvItemModelImpl.ENTITY_CACHE_ENABLED,
			AdvItemModelImpl.FINDER_CACHE_ENABLED, FINDER_CLASS_NAME_LIST,
			"findByT",
			new String[] {
				Long.class.getName(),
				
			"java.lang.Integer", "java.lang.Integer",
				"com.liferay.portal.kernel.util.OrderByComparator"
			});
	public static final FinderPath FINDER_PATH_COUNT_BY_T = new FinderPath(AdvItemModelImpl.ENTITY_CACHE_ENABLED,
			AdvItemModelImpl.FINDER_CACHE_ENABLED, FINDER_CLASS_NAME_LIST,
			"countByT", new String[] { Long.class.getName() });
	public static final FinderPath FINDER_PATH_FIND_BY_G_T = new FinderPath(AdvItemModelImpl.ENTITY_CACHE_ENABLED,
			AdvItemModelImpl.FINDER_CACHE_ENABLED, FINDER_CLASS_NAME_LIST,
			"findByG_T",
			new String[] {
				Long.class.getName(), Long.class.getName(),
				
			"java.lang.Integer", "java.lang.Integer",
				"com.liferay.portal.kernel.util.OrderByComparator"
			});
	public static final FinderPath FINDER_PATH_COUNT_BY_G_T = new FinderPath(AdvItemModelImpl.ENTITY_CACHE_ENABLED,
			AdvItemModelImpl.FINDER_CACHE_ENABLED, FINDER_CLASS_NAME_LIST,
			"countByG_T",
			new String[] { Long.class.getName(), Long.class.getName() });
	public static final FinderPath FINDER_PATH_FIND_BY_G_S = new FinderPath(AdvItemModelImpl.ENTITY_CACHE_ENABLED,
			AdvItemModelImpl.FINDER_CACHE_ENABLED, FINDER_CLASS_NAME_LIST,
			"findByG_S",
			new String[] {
				Long.class.getName(), Boolean.class.getName(),
				
			"java.lang.Integer", "java.lang.Integer",
				"com.liferay.portal.kernel.util.OrderByComparator"
			});
	public static final FinderPath FINDER_PATH_COUNT_BY_G_S = new FinderPath(AdvItemModelImpl.ENTITY_CACHE_ENABLED,
			AdvItemModelImpl.FINDER_CACHE_ENABLED, FINDER_CLASS_NAME_LIST,
			"countByG_S",
			new String[] { Long.class.getName(), Boolean.class.getName() });
	public static final FinderPath FINDER_PATH_FIND_ALL = new FinderPath(AdvItemModelImpl.ENTITY_CACHE_ENABLED,
			AdvItemModelImpl.FINDER_CACHE_ENABLED, FINDER_CLASS_NAME_LIST,
			"findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(AdvItemModelImpl.ENTITY_CACHE_ENABLED,
			AdvItemModelImpl.FINDER_CACHE_ENABLED, FINDER_CLASS_NAME_LIST,
			"countAll", new String[0]);

	/**
	 * Caches the adv item in the entity cache if it is enabled.
	 *
	 * @param advItem the adv item to cache
	 */
	public void cacheResult(AdvItem advItem) {
		EntityCacheUtil.putResult(AdvItemModelImpl.ENTITY_CACHE_ENABLED,
			AdvItemImpl.class, advItem.getPrimaryKey(), advItem);
	}

	/**
	 * Caches the adv items in the entity cache if it is enabled.
	 *
	 * @param advItems the adv items to cache
	 */
	public void cacheResult(List<AdvItem> advItems) {
		for (AdvItem advItem : advItems) {
			if (EntityCacheUtil.getResult(
						AdvItemModelImpl.ENTITY_CACHE_ENABLED,
						AdvItemImpl.class, advItem.getPrimaryKey(), this) == null) {
				cacheResult(advItem);
			}
		}
	}

	/**
	 * Clears the cache for all adv items.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	public void clearCache() {
		CacheRegistryUtil.clear(AdvItemImpl.class.getName());
		EntityCacheUtil.clearCache(AdvItemImpl.class.getName());
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST);
	}

	/**
	 * Clears the cache for the adv item.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	public void clearCache(AdvItem advItem) {
		EntityCacheUtil.removeResult(AdvItemModelImpl.ENTITY_CACHE_ENABLED,
			AdvItemImpl.class, advItem.getPrimaryKey());
	}

	/**
	 * Creates a new adv item with the primary key. Does not add the adv item to the database.
	 *
	 * @param itemId the primary key for the new adv item
	 * @return the new adv item
	 */
	public AdvItem create(long itemId) {
		AdvItem advItem = new AdvItemImpl();

		advItem.setNew(true);
		advItem.setPrimaryKey(itemId);

		return advItem;
	}

	/**
	 * Removes the adv item with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the adv item to remove
	 * @return the adv item that was removed
	 * @throws com.liferay.portal.NoSuchModelException if a adv item with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public AdvItem remove(Serializable primaryKey)
		throws NoSuchModelException, SystemException {
		return remove(((Long)primaryKey).longValue());
	}

	/**
	 * Removes the adv item with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param itemId the primary key of the adv item to remove
	 * @return the adv item that was removed
	 * @throws com.vportal.portlet.vadvman.NoSuchAdvItemException if a adv item with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public AdvItem remove(long itemId)
		throws NoSuchAdvItemException, SystemException {
		Session session = null;

		try {
			session = openSession();

			AdvItem advItem = (AdvItem)session.get(AdvItemImpl.class,
					new Long(itemId));

			if (advItem == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + itemId);
				}

				throw new NoSuchAdvItemException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					itemId);
			}

			return remove(advItem);
		}
		catch (NoSuchAdvItemException nsee) {
			throw nsee;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected AdvItem removeImpl(AdvItem advItem) throws SystemException {
		advItem = toUnwrappedModel(advItem);

		Session session = null;

		try {
			session = openSession();

			BatchSessionUtil.delete(session, advItem);
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST);

		EntityCacheUtil.removeResult(AdvItemModelImpl.ENTITY_CACHE_ENABLED,
			AdvItemImpl.class, advItem.getPrimaryKey());

		return advItem;
	}

	public AdvItem updateImpl(
		com.vportal.portlet.vadvman.model.AdvItem advItem, boolean merge)
		throws SystemException {
		advItem = toUnwrappedModel(advItem);

		Session session = null;

		try {
			session = openSession();

			BatchSessionUtil.update(session, advItem, merge);

			advItem.setNew(false);
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST);

		EntityCacheUtil.putResult(AdvItemModelImpl.ENTITY_CACHE_ENABLED,
			AdvItemImpl.class, advItem.getPrimaryKey(), advItem);

		return advItem;
	}

	protected AdvItem toUnwrappedModel(AdvItem advItem) {
		if (advItem instanceof AdvItemImpl) {
			return advItem;
		}

		AdvItemImpl advItemImpl = new AdvItemImpl();

		advItemImpl.setNew(advItem.isNew());
		advItemImpl.setPrimaryKey(advItem.getPrimaryKey());

		advItemImpl.setItemId(advItem.getItemId());
		advItemImpl.setCreateDate(advItem.getCreateDate());
		advItemImpl.setModifiedDate(advItem.getModifiedDate());
		advItemImpl.setExpriedDate(advItem.getExpriedDate());
		advItemImpl.setGroupId(advItem.getGroupId());
		advItemImpl.setCompanyId(advItem.getCompanyId());
		advItemImpl.setName(advItem.getName());
		advItemImpl.setDescription(advItem.getDescription());
		advItemImpl.setUrl(advItem.getUrl());
		advItemImpl.setIsTargetBlank(advItem.isIsTargetBlank());
		advItemImpl.setTxtMouseOver(advItem.getTxtMouseOver());
		advItemImpl.setFolderId(advItem.getFolderId());
		advItemImpl.setStatus(advItem.isStatus());
		advItemImpl.setTypeId(advItem.getTypeId());

		return advItemImpl;
	}

	/**
	 * Finds the adv item with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the adv item to find
	 * @return the adv item
	 * @throws com.liferay.portal.NoSuchModelException if a adv item with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public AdvItem findByPrimaryKey(Serializable primaryKey)
		throws NoSuchModelException, SystemException {
		return findByPrimaryKey(((Long)primaryKey).longValue());
	}

	/**
	 * Finds the adv item with the primary key or throws a {@link com.vportal.portlet.vadvman.NoSuchAdvItemException} if it could not be found.
	 *
	 * @param itemId the primary key of the adv item to find
	 * @return the adv item
	 * @throws com.vportal.portlet.vadvman.NoSuchAdvItemException if a adv item with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public AdvItem findByPrimaryKey(long itemId)
		throws NoSuchAdvItemException, SystemException {
		AdvItem advItem = fetchByPrimaryKey(itemId);

		if (advItem == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + itemId);
			}

			throw new NoSuchAdvItemException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				itemId);
		}

		return advItem;
	}

	/**
	 * Finds the adv item with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the adv item to find
	 * @return the adv item, or <code>null</code> if a adv item with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public AdvItem fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		return fetchByPrimaryKey(((Long)primaryKey).longValue());
	}

	/**
	 * Finds the adv item with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param itemId the primary key of the adv item to find
	 * @return the adv item, or <code>null</code> if a adv item with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public AdvItem fetchByPrimaryKey(long itemId) throws SystemException {
		AdvItem advItem = (AdvItem)EntityCacheUtil.getResult(AdvItemModelImpl.ENTITY_CACHE_ENABLED,
				AdvItemImpl.class, itemId, this);

		if (advItem == null) {
			Session session = null;

			try {
				session = openSession();

				advItem = (AdvItem)session.get(AdvItemImpl.class,
						new Long(itemId));
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (advItem != null) {
					cacheResult(advItem);
				}

				closeSession(session);
			}
		}

		return advItem;
	}

	/**
	 * Finds all the adv items where groupId = &#63;.
	 *
	 * @param groupId the group id to search with
	 * @return the matching adv items
	 * @throws SystemException if a system exception occurred
	 */
	public List<AdvItem> findByG(long groupId) throws SystemException {
		return findByG(groupId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Finds a range of all the adv items where groupId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param groupId the group id to search with
	 * @param start the lower bound of the range of adv items to return
	 * @param end the upper bound of the range of adv items to return (not inclusive)
	 * @return the range of matching adv items
	 * @throws SystemException if a system exception occurred
	 */
	public List<AdvItem> findByG(long groupId, int start, int end)
		throws SystemException {
		return findByG(groupId, start, end, null);
	}

	/**
	 * Finds an ordered range of all the adv items where groupId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param groupId the group id to search with
	 * @param start the lower bound of the range of adv items to return
	 * @param end the upper bound of the range of adv items to return (not inclusive)
	 * @param orderByComparator the comparator to order the results by
	 * @return the ordered range of matching adv items
	 * @throws SystemException if a system exception occurred
	 */
	public List<AdvItem> findByG(long groupId, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		Object[] finderArgs = new Object[] {
				groupId,
				
				String.valueOf(start), String.valueOf(end),
				String.valueOf(orderByComparator)
			};

		List<AdvItem> list = (List<AdvItem>)FinderCacheUtil.getResult(FINDER_PATH_FIND_BY_G,
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

			query.append(_SQL_SELECT_ADVITEM_WHERE);

			query.append(_FINDER_COLUMN_G_GROUPID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}

			else {
				query.append(AdvItemModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(groupId);

				list = (List<AdvItem>)QueryUtil.list(q, getDialect(), start, end);
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (list == null) {
					FinderCacheUtil.removeResult(FINDER_PATH_FIND_BY_G,
						finderArgs);
				}
				else {
					cacheResult(list);

					FinderCacheUtil.putResult(FINDER_PATH_FIND_BY_G,
						finderArgs, list);
				}

				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Finds the first adv item in the ordered set where groupId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param groupId the group id to search with
	 * @param orderByComparator the comparator to order the set by
	 * @return the first matching adv item
	 * @throws com.vportal.portlet.vadvman.NoSuchAdvItemException if a matching adv item could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public AdvItem findByG_First(long groupId,
		OrderByComparator orderByComparator)
		throws NoSuchAdvItemException, SystemException {
		List<AdvItem> list = findByG(groupId, 0, 1, orderByComparator);

		if (list.isEmpty()) {
			StringBundler msg = new StringBundler(4);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("groupId=");
			msg.append(groupId);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			throw new NoSuchAdvItemException(msg.toString());
		}
		else {
			return list.get(0);
		}
	}

	/**
	 * Finds the last adv item in the ordered set where groupId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param groupId the group id to search with
	 * @param orderByComparator the comparator to order the set by
	 * @return the last matching adv item
	 * @throws com.vportal.portlet.vadvman.NoSuchAdvItemException if a matching adv item could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public AdvItem findByG_Last(long groupId,
		OrderByComparator orderByComparator)
		throws NoSuchAdvItemException, SystemException {
		int count = countByG(groupId);

		List<AdvItem> list = findByG(groupId, count - 1, count,
				orderByComparator);

		if (list.isEmpty()) {
			StringBundler msg = new StringBundler(4);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("groupId=");
			msg.append(groupId);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			throw new NoSuchAdvItemException(msg.toString());
		}
		else {
			return list.get(0);
		}
	}

	/**
	 * Finds the adv items before and after the current adv item in the ordered set where groupId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param itemId the primary key of the current adv item
	 * @param groupId the group id to search with
	 * @param orderByComparator the comparator to order the set by
	 * @return the previous, current, and next adv item
	 * @throws com.vportal.portlet.vadvman.NoSuchAdvItemException if a adv item with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public AdvItem[] findByG_PrevAndNext(long itemId, long groupId,
		OrderByComparator orderByComparator)
		throws NoSuchAdvItemException, SystemException {
		AdvItem advItem = findByPrimaryKey(itemId);

		Session session = null;

		try {
			session = openSession();

			AdvItem[] array = new AdvItemImpl[3];

			array[0] = getByG_PrevAndNext(session, advItem, groupId,
					orderByComparator, true);

			array[1] = advItem;

			array[2] = getByG_PrevAndNext(session, advItem, groupId,
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

	protected AdvItem getByG_PrevAndNext(Session session, AdvItem advItem,
		long groupId, OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_ADVITEM_WHERE);

		query.append(_FINDER_COLUMN_G_GROUPID_2);

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
			query.append(AdvItemModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(groupId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByValues(advItem);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<AdvItem> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Finds all the adv items where typeId = &#63;.
	 *
	 * @param typeId the type id to search with
	 * @return the matching adv items
	 * @throws SystemException if a system exception occurred
	 */
	public List<AdvItem> findByT(long typeId) throws SystemException {
		return findByT(typeId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Finds a range of all the adv items where typeId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param typeId the type id to search with
	 * @param start the lower bound of the range of adv items to return
	 * @param end the upper bound of the range of adv items to return (not inclusive)
	 * @return the range of matching adv items
	 * @throws SystemException if a system exception occurred
	 */
	public List<AdvItem> findByT(long typeId, int start, int end)
		throws SystemException {
		return findByT(typeId, start, end, null);
	}

	/**
	 * Finds an ordered range of all the adv items where typeId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param typeId the type id to search with
	 * @param start the lower bound of the range of adv items to return
	 * @param end the upper bound of the range of adv items to return (not inclusive)
	 * @param orderByComparator the comparator to order the results by
	 * @return the ordered range of matching adv items
	 * @throws SystemException if a system exception occurred
	 */
	public List<AdvItem> findByT(long typeId, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		Object[] finderArgs = new Object[] {
				typeId,
				
				String.valueOf(start), String.valueOf(end),
				String.valueOf(orderByComparator)
			};

		List<AdvItem> list = (List<AdvItem>)FinderCacheUtil.getResult(FINDER_PATH_FIND_BY_T,
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

			query.append(_SQL_SELECT_ADVITEM_WHERE);

			query.append(_FINDER_COLUMN_T_TYPEID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}

			else {
				query.append(AdvItemModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(typeId);

				list = (List<AdvItem>)QueryUtil.list(q, getDialect(), start, end);
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (list == null) {
					FinderCacheUtil.removeResult(FINDER_PATH_FIND_BY_T,
						finderArgs);
				}
				else {
					cacheResult(list);

					FinderCacheUtil.putResult(FINDER_PATH_FIND_BY_T,
						finderArgs, list);
				}

				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Finds the first adv item in the ordered set where typeId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param typeId the type id to search with
	 * @param orderByComparator the comparator to order the set by
	 * @return the first matching adv item
	 * @throws com.vportal.portlet.vadvman.NoSuchAdvItemException if a matching adv item could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public AdvItem findByT_First(long typeId,
		OrderByComparator orderByComparator)
		throws NoSuchAdvItemException, SystemException {
		List<AdvItem> list = findByT(typeId, 0, 1, orderByComparator);

		if (list.isEmpty()) {
			StringBundler msg = new StringBundler(4);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("typeId=");
			msg.append(typeId);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			throw new NoSuchAdvItemException(msg.toString());
		}
		else {
			return list.get(0);
		}
	}

	/**
	 * Finds the last adv item in the ordered set where typeId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param typeId the type id to search with
	 * @param orderByComparator the comparator to order the set by
	 * @return the last matching adv item
	 * @throws com.vportal.portlet.vadvman.NoSuchAdvItemException if a matching adv item could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public AdvItem findByT_Last(long typeId, OrderByComparator orderByComparator)
		throws NoSuchAdvItemException, SystemException {
		int count = countByT(typeId);

		List<AdvItem> list = findByT(typeId, count - 1, count, orderByComparator);

		if (list.isEmpty()) {
			StringBundler msg = new StringBundler(4);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("typeId=");
			msg.append(typeId);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			throw new NoSuchAdvItemException(msg.toString());
		}
		else {
			return list.get(0);
		}
	}

	/**
	 * Finds the adv items before and after the current adv item in the ordered set where typeId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param itemId the primary key of the current adv item
	 * @param typeId the type id to search with
	 * @param orderByComparator the comparator to order the set by
	 * @return the previous, current, and next adv item
	 * @throws com.vportal.portlet.vadvman.NoSuchAdvItemException if a adv item with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public AdvItem[] findByT_PrevAndNext(long itemId, long typeId,
		OrderByComparator orderByComparator)
		throws NoSuchAdvItemException, SystemException {
		AdvItem advItem = findByPrimaryKey(itemId);

		Session session = null;

		try {
			session = openSession();

			AdvItem[] array = new AdvItemImpl[3];

			array[0] = getByT_PrevAndNext(session, advItem, typeId,
					orderByComparator, true);

			array[1] = advItem;

			array[2] = getByT_PrevAndNext(session, advItem, typeId,
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

	protected AdvItem getByT_PrevAndNext(Session session, AdvItem advItem,
		long typeId, OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_ADVITEM_WHERE);

		query.append(_FINDER_COLUMN_T_TYPEID_2);

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
			query.append(AdvItemModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(typeId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByValues(advItem);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<AdvItem> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Finds all the adv items where groupId = &#63; and typeId = &#63;.
	 *
	 * @param groupId the group id to search with
	 * @param typeId the type id to search with
	 * @return the matching adv items
	 * @throws SystemException if a system exception occurred
	 */
	public List<AdvItem> findByG_T(long groupId, long typeId)
		throws SystemException {
		return findByG_T(groupId, typeId, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
			null);
	}

	/**
	 * Finds a range of all the adv items where groupId = &#63; and typeId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param groupId the group id to search with
	 * @param typeId the type id to search with
	 * @param start the lower bound of the range of adv items to return
	 * @param end the upper bound of the range of adv items to return (not inclusive)
	 * @return the range of matching adv items
	 * @throws SystemException if a system exception occurred
	 */
	public List<AdvItem> findByG_T(long groupId, long typeId, int start, int end)
		throws SystemException {
		return findByG_T(groupId, typeId, start, end, null);
	}

	/**
	 * Finds an ordered range of all the adv items where groupId = &#63; and typeId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param groupId the group id to search with
	 * @param typeId the type id to search with
	 * @param start the lower bound of the range of adv items to return
	 * @param end the upper bound of the range of adv items to return (not inclusive)
	 * @param orderByComparator the comparator to order the results by
	 * @return the ordered range of matching adv items
	 * @throws SystemException if a system exception occurred
	 */
	public List<AdvItem> findByG_T(long groupId, long typeId, int start,
		int end, OrderByComparator orderByComparator) throws SystemException {
		Object[] finderArgs = new Object[] {
				groupId, typeId,
				
				String.valueOf(start), String.valueOf(end),
				String.valueOf(orderByComparator)
			};

		List<AdvItem> list = (List<AdvItem>)FinderCacheUtil.getResult(FINDER_PATH_FIND_BY_G_T,
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

			query.append(_SQL_SELECT_ADVITEM_WHERE);

			query.append(_FINDER_COLUMN_G_T_GROUPID_2);

			query.append(_FINDER_COLUMN_G_T_TYPEID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}

			else {
				query.append(AdvItemModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(groupId);

				qPos.add(typeId);

				list = (List<AdvItem>)QueryUtil.list(q, getDialect(), start, end);
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (list == null) {
					FinderCacheUtil.removeResult(FINDER_PATH_FIND_BY_G_T,
						finderArgs);
				}
				else {
					cacheResult(list);

					FinderCacheUtil.putResult(FINDER_PATH_FIND_BY_G_T,
						finderArgs, list);
				}

				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Finds the first adv item in the ordered set where groupId = &#63; and typeId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param groupId the group id to search with
	 * @param typeId the type id to search with
	 * @param orderByComparator the comparator to order the set by
	 * @return the first matching adv item
	 * @throws com.vportal.portlet.vadvman.NoSuchAdvItemException if a matching adv item could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public AdvItem findByG_T_First(long groupId, long typeId,
		OrderByComparator orderByComparator)
		throws NoSuchAdvItemException, SystemException {
		List<AdvItem> list = findByG_T(groupId, typeId, 0, 1, orderByComparator);

		if (list.isEmpty()) {
			StringBundler msg = new StringBundler(6);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("groupId=");
			msg.append(groupId);

			msg.append(", typeId=");
			msg.append(typeId);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			throw new NoSuchAdvItemException(msg.toString());
		}
		else {
			return list.get(0);
		}
	}

	/**
	 * Finds the last adv item in the ordered set where groupId = &#63; and typeId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param groupId the group id to search with
	 * @param typeId the type id to search with
	 * @param orderByComparator the comparator to order the set by
	 * @return the last matching adv item
	 * @throws com.vportal.portlet.vadvman.NoSuchAdvItemException if a matching adv item could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public AdvItem findByG_T_Last(long groupId, long typeId,
		OrderByComparator orderByComparator)
		throws NoSuchAdvItemException, SystemException {
		int count = countByG_T(groupId, typeId);

		List<AdvItem> list = findByG_T(groupId, typeId, count - 1, count,
				orderByComparator);

		if (list.isEmpty()) {
			StringBundler msg = new StringBundler(6);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("groupId=");
			msg.append(groupId);

			msg.append(", typeId=");
			msg.append(typeId);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			throw new NoSuchAdvItemException(msg.toString());
		}
		else {
			return list.get(0);
		}
	}

	/**
	 * Finds the adv items before and after the current adv item in the ordered set where groupId = &#63; and typeId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param itemId the primary key of the current adv item
	 * @param groupId the group id to search with
	 * @param typeId the type id to search with
	 * @param orderByComparator the comparator to order the set by
	 * @return the previous, current, and next adv item
	 * @throws com.vportal.portlet.vadvman.NoSuchAdvItemException if a adv item with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public AdvItem[] findByG_T_PrevAndNext(long itemId, long groupId,
		long typeId, OrderByComparator orderByComparator)
		throws NoSuchAdvItemException, SystemException {
		AdvItem advItem = findByPrimaryKey(itemId);

		Session session = null;

		try {
			session = openSession();

			AdvItem[] array = new AdvItemImpl[3];

			array[0] = getByG_T_PrevAndNext(session, advItem, groupId, typeId,
					orderByComparator, true);

			array[1] = advItem;

			array[2] = getByG_T_PrevAndNext(session, advItem, groupId, typeId,
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

	protected AdvItem getByG_T_PrevAndNext(Session session, AdvItem advItem,
		long groupId, long typeId, OrderByComparator orderByComparator,
		boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_ADVITEM_WHERE);

		query.append(_FINDER_COLUMN_G_T_GROUPID_2);

		query.append(_FINDER_COLUMN_G_T_TYPEID_2);

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
			query.append(AdvItemModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(groupId);

		qPos.add(typeId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByValues(advItem);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<AdvItem> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Finds all the adv items where groupId = &#63; and status = &#63;.
	 *
	 * @param groupId the group id to search with
	 * @param status the status to search with
	 * @return the matching adv items
	 * @throws SystemException if a system exception occurred
	 */
	public List<AdvItem> findByG_S(long groupId, boolean status)
		throws SystemException {
		return findByG_S(groupId, status, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
			null);
	}

	/**
	 * Finds a range of all the adv items where groupId = &#63; and status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param groupId the group id to search with
	 * @param status the status to search with
	 * @param start the lower bound of the range of adv items to return
	 * @param end the upper bound of the range of adv items to return (not inclusive)
	 * @return the range of matching adv items
	 * @throws SystemException if a system exception occurred
	 */
	public List<AdvItem> findByG_S(long groupId, boolean status, int start,
		int end) throws SystemException {
		return findByG_S(groupId, status, start, end, null);
	}

	/**
	 * Finds an ordered range of all the adv items where groupId = &#63; and status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param groupId the group id to search with
	 * @param status the status to search with
	 * @param start the lower bound of the range of adv items to return
	 * @param end the upper bound of the range of adv items to return (not inclusive)
	 * @param orderByComparator the comparator to order the results by
	 * @return the ordered range of matching adv items
	 * @throws SystemException if a system exception occurred
	 */
	public List<AdvItem> findByG_S(long groupId, boolean status, int start,
		int end, OrderByComparator orderByComparator) throws SystemException {
		Object[] finderArgs = new Object[] {
				groupId, status,
				
				String.valueOf(start), String.valueOf(end),
				String.valueOf(orderByComparator)
			};

		List<AdvItem> list = (List<AdvItem>)FinderCacheUtil.getResult(FINDER_PATH_FIND_BY_G_S,
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

			query.append(_SQL_SELECT_ADVITEM_WHERE);

			query.append(_FINDER_COLUMN_G_S_GROUPID_2);

			query.append(_FINDER_COLUMN_G_S_STATUS_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}

			else {
				query.append(AdvItemModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(groupId);

				qPos.add(status);

				list = (List<AdvItem>)QueryUtil.list(q, getDialect(), start, end);
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (list == null) {
					FinderCacheUtil.removeResult(FINDER_PATH_FIND_BY_G_S,
						finderArgs);
				}
				else {
					cacheResult(list);

					FinderCacheUtil.putResult(FINDER_PATH_FIND_BY_G_S,
						finderArgs, list);
				}

				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Finds the first adv item in the ordered set where groupId = &#63; and status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param groupId the group id to search with
	 * @param status the status to search with
	 * @param orderByComparator the comparator to order the set by
	 * @return the first matching adv item
	 * @throws com.vportal.portlet.vadvman.NoSuchAdvItemException if a matching adv item could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public AdvItem findByG_S_First(long groupId, boolean status,
		OrderByComparator orderByComparator)
		throws NoSuchAdvItemException, SystemException {
		List<AdvItem> list = findByG_S(groupId, status, 0, 1, orderByComparator);

		if (list.isEmpty()) {
			StringBundler msg = new StringBundler(6);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("groupId=");
			msg.append(groupId);

			msg.append(", status=");
			msg.append(status);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			throw new NoSuchAdvItemException(msg.toString());
		}
		else {
			return list.get(0);
		}
	}

	/**
	 * Finds the last adv item in the ordered set where groupId = &#63; and status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param groupId the group id to search with
	 * @param status the status to search with
	 * @param orderByComparator the comparator to order the set by
	 * @return the last matching adv item
	 * @throws com.vportal.portlet.vadvman.NoSuchAdvItemException if a matching adv item could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public AdvItem findByG_S_Last(long groupId, boolean status,
		OrderByComparator orderByComparator)
		throws NoSuchAdvItemException, SystemException {
		int count = countByG_S(groupId, status);

		List<AdvItem> list = findByG_S(groupId, status, count - 1, count,
				orderByComparator);

		if (list.isEmpty()) {
			StringBundler msg = new StringBundler(6);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("groupId=");
			msg.append(groupId);

			msg.append(", status=");
			msg.append(status);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			throw new NoSuchAdvItemException(msg.toString());
		}
		else {
			return list.get(0);
		}
	}

	/**
	 * Finds the adv items before and after the current adv item in the ordered set where groupId = &#63; and status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param itemId the primary key of the current adv item
	 * @param groupId the group id to search with
	 * @param status the status to search with
	 * @param orderByComparator the comparator to order the set by
	 * @return the previous, current, and next adv item
	 * @throws com.vportal.portlet.vadvman.NoSuchAdvItemException if a adv item with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public AdvItem[] findByG_S_PrevAndNext(long itemId, long groupId,
		boolean status, OrderByComparator orderByComparator)
		throws NoSuchAdvItemException, SystemException {
		AdvItem advItem = findByPrimaryKey(itemId);

		Session session = null;

		try {
			session = openSession();

			AdvItem[] array = new AdvItemImpl[3];

			array[0] = getByG_S_PrevAndNext(session, advItem, groupId, status,
					orderByComparator, true);

			array[1] = advItem;

			array[2] = getByG_S_PrevAndNext(session, advItem, groupId, status,
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

	protected AdvItem getByG_S_PrevAndNext(Session session, AdvItem advItem,
		long groupId, boolean status, OrderByComparator orderByComparator,
		boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_ADVITEM_WHERE);

		query.append(_FINDER_COLUMN_G_S_GROUPID_2);

		query.append(_FINDER_COLUMN_G_S_STATUS_2);

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
			query.append(AdvItemModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(groupId);

		qPos.add(status);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByValues(advItem);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<AdvItem> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Finds all the adv items.
	 *
	 * @return the adv items
	 * @throws SystemException if a system exception occurred
	 */
	public List<AdvItem> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Finds a range of all the adv items.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param start the lower bound of the range of adv items to return
	 * @param end the upper bound of the range of adv items to return (not inclusive)
	 * @return the range of adv items
	 * @throws SystemException if a system exception occurred
	 */
	public List<AdvItem> findAll(int start, int end) throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Finds an ordered range of all the adv items.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param start the lower bound of the range of adv items to return
	 * @param end the upper bound of the range of adv items to return (not inclusive)
	 * @param orderByComparator the comparator to order the results by
	 * @return the ordered range of adv items
	 * @throws SystemException if a system exception occurred
	 */
	public List<AdvItem> findAll(int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		Object[] finderArgs = new Object[] {
				String.valueOf(start), String.valueOf(end),
				String.valueOf(orderByComparator)
			};

		List<AdvItem> list = (List<AdvItem>)FinderCacheUtil.getResult(FINDER_PATH_FIND_ALL,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_ADVITEM);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_ADVITEM.concat(AdvItemModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (orderByComparator == null) {
					list = (List<AdvItem>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);
				}
				else {
					list = (List<AdvItem>)QueryUtil.list(q, getDialect(),
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
	 * Removes all the adv items where groupId = &#63; from the database.
	 *
	 * @param groupId the group id to search with
	 * @throws SystemException if a system exception occurred
	 */
	public void removeByG(long groupId) throws SystemException {
		for (AdvItem advItem : findByG(groupId)) {
			remove(advItem);
		}
	}

	/**
	 * Removes all the adv items where typeId = &#63; from the database.
	 *
	 * @param typeId the type id to search with
	 * @throws SystemException if a system exception occurred
	 */
	public void removeByT(long typeId) throws SystemException {
		for (AdvItem advItem : findByT(typeId)) {
			remove(advItem);
		}
	}

	/**
	 * Removes all the adv items where groupId = &#63; and typeId = &#63; from the database.
	 *
	 * @param groupId the group id to search with
	 * @param typeId the type id to search with
	 * @throws SystemException if a system exception occurred
	 */
	public void removeByG_T(long groupId, long typeId)
		throws SystemException {
		for (AdvItem advItem : findByG_T(groupId, typeId)) {
			remove(advItem);
		}
	}

	/**
	 * Removes all the adv items where groupId = &#63; and status = &#63; from the database.
	 *
	 * @param groupId the group id to search with
	 * @param status the status to search with
	 * @throws SystemException if a system exception occurred
	 */
	public void removeByG_S(long groupId, boolean status)
		throws SystemException {
		for (AdvItem advItem : findByG_S(groupId, status)) {
			remove(advItem);
		}
	}

	/**
	 * Removes all the adv items from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	public void removeAll() throws SystemException {
		for (AdvItem advItem : findAll()) {
			remove(advItem);
		}
	}

	/**
	 * Counts all the adv items where groupId = &#63;.
	 *
	 * @param groupId the group id to search with
	 * @return the number of matching adv items
	 * @throws SystemException if a system exception occurred
	 */
	public int countByG(long groupId) throws SystemException {
		Object[] finderArgs = new Object[] { groupId };

		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_BY_G,
				finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_ADVITEM_WHERE);

			query.append(_FINDER_COLUMN_G_GROUPID_2);

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

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_G, finderArgs,
					count);

				closeSession(session);
			}
		}

		return count.intValue();
	}

	/**
	 * Counts all the adv items where typeId = &#63;.
	 *
	 * @param typeId the type id to search with
	 * @return the number of matching adv items
	 * @throws SystemException if a system exception occurred
	 */
	public int countByT(long typeId) throws SystemException {
		Object[] finderArgs = new Object[] { typeId };

		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_BY_T,
				finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_ADVITEM_WHERE);

			query.append(_FINDER_COLUMN_T_TYPEID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(typeId);

				count = (Long)q.uniqueResult();
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (count == null) {
					count = Long.valueOf(0);
				}

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_T, finderArgs,
					count);

				closeSession(session);
			}
		}

		return count.intValue();
	}

	/**
	 * Counts all the adv items where groupId = &#63; and typeId = &#63;.
	 *
	 * @param groupId the group id to search with
	 * @param typeId the type id to search with
	 * @return the number of matching adv items
	 * @throws SystemException if a system exception occurred
	 */
	public int countByG_T(long groupId, long typeId) throws SystemException {
		Object[] finderArgs = new Object[] { groupId, typeId };

		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_BY_G_T,
				finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_ADVITEM_WHERE);

			query.append(_FINDER_COLUMN_G_T_GROUPID_2);

			query.append(_FINDER_COLUMN_G_T_TYPEID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(groupId);

				qPos.add(typeId);

				count = (Long)q.uniqueResult();
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (count == null) {
					count = Long.valueOf(0);
				}

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_G_T, finderArgs,
					count);

				closeSession(session);
			}
		}

		return count.intValue();
	}

	/**
	 * Counts all the adv items where groupId = &#63; and status = &#63;.
	 *
	 * @param groupId the group id to search with
	 * @param status the status to search with
	 * @return the number of matching adv items
	 * @throws SystemException if a system exception occurred
	 */
	public int countByG_S(long groupId, boolean status)
		throws SystemException {
		Object[] finderArgs = new Object[] { groupId, status };

		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_BY_G_S,
				finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_ADVITEM_WHERE);

			query.append(_FINDER_COLUMN_G_S_GROUPID_2);

			query.append(_FINDER_COLUMN_G_S_STATUS_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(groupId);

				qPos.add(status);

				count = (Long)q.uniqueResult();
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (count == null) {
					count = Long.valueOf(0);
				}

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_G_S, finderArgs,
					count);

				closeSession(session);
			}
		}

		return count.intValue();
	}

	/**
	 * Counts all the adv items.
	 *
	 * @return the number of adv items
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

				Query q = session.createQuery(_SQL_COUNT_ADVITEM);

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
	 * Initializes the adv item persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.com.vportal.portlet.vadvman.model.AdvItem")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<AdvItem>> listenersList = new ArrayList<ModelListener<AdvItem>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<AdvItem>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(AdvItemImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST);
	}

	@BeanReference(type = AdvTypePersistence.class)
	protected AdvTypePersistence advTypePersistence;
	@BeanReference(type = AdvItemPersistence.class)
	protected AdvItemPersistence advItemPersistence;
	@BeanReference(type = ResourcePersistence.class)
	protected ResourcePersistence resourcePersistence;
	@BeanReference(type = UserPersistence.class)
	protected UserPersistence userPersistence;
	private static final String _SQL_SELECT_ADVITEM = "SELECT advItem FROM AdvItem advItem";
	private static final String _SQL_SELECT_ADVITEM_WHERE = "SELECT advItem FROM AdvItem advItem WHERE ";
	private static final String _SQL_COUNT_ADVITEM = "SELECT COUNT(advItem) FROM AdvItem advItem";
	private static final String _SQL_COUNT_ADVITEM_WHERE = "SELECT COUNT(advItem) FROM AdvItem advItem WHERE ";
	private static final String _FINDER_COLUMN_G_GROUPID_2 = "advItem.groupId = ?";
	private static final String _FINDER_COLUMN_T_TYPEID_2 = "advItem.typeId = ?";
	private static final String _FINDER_COLUMN_G_T_GROUPID_2 = "advItem.groupId = ? AND ";
	private static final String _FINDER_COLUMN_G_T_TYPEID_2 = "advItem.typeId = ?";
	private static final String _FINDER_COLUMN_G_S_GROUPID_2 = "advItem.groupId = ? AND ";
	private static final String _FINDER_COLUMN_G_S_STATUS_2 = "advItem.status = ?";
	private static final String _ORDER_BY_ENTITY_ALIAS = "advItem.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No AdvItem exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No AdvItem exists with the key {";
	private static Log _log = LogFactoryUtil.getLog(AdvItemPersistenceImpl.class);
}