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

package com.vsi.advertisement.portlet.service.persistence;

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

import com.vsi.advertisement.portlet.NoSuchAdvTypeException;
import com.vsi.advertisement.portlet.model.AdvType;
import com.vsi.advertisement.portlet.model.impl.AdvTypeImpl;
import com.vsi.advertisement.portlet.model.impl.AdvTypeModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The persistence implementation for the adv type service.
 *
 * <p>
 * Never modify or reference this class directly. Always use {@link AdvTypeUtil} to access the adv type persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
 * </p>
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author vinhnt
 * @see AdvTypePersistence
 * @see AdvTypeUtil
 * @generated
 */
public class AdvTypePersistenceImpl extends BasePersistenceImpl<AdvType>
	implements AdvTypePersistence {
	public static final String FINDER_CLASS_NAME_ENTITY = AdvTypeImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST = FINDER_CLASS_NAME_ENTITY +
		".List";
	public static final FinderPath FINDER_PATH_FIND_BY_G = new FinderPath(AdvTypeModelImpl.ENTITY_CACHE_ENABLED,
			AdvTypeModelImpl.FINDER_CACHE_ENABLED, FINDER_CLASS_NAME_LIST,
			"findByG",
			new String[] {
				Long.class.getName(),
				
			"java.lang.Integer", "java.lang.Integer",
				"com.liferay.portal.kernel.util.OrderByComparator"
			});
	public static final FinderPath FINDER_PATH_COUNT_BY_G = new FinderPath(AdvTypeModelImpl.ENTITY_CACHE_ENABLED,
			AdvTypeModelImpl.FINDER_CACHE_ENABLED, FINDER_CLASS_NAME_LIST,
			"countByG", new String[] { Long.class.getName() });
	public static final FinderPath FINDER_PATH_FIND_ALL = new FinderPath(AdvTypeModelImpl.ENTITY_CACHE_ENABLED,
			AdvTypeModelImpl.FINDER_CACHE_ENABLED, FINDER_CLASS_NAME_LIST,
			"findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(AdvTypeModelImpl.ENTITY_CACHE_ENABLED,
			AdvTypeModelImpl.FINDER_CACHE_ENABLED, FINDER_CLASS_NAME_LIST,
			"countAll", new String[0]);

	/**
	 * Caches the adv type in the entity cache if it is enabled.
	 *
	 * @param advType the adv type to cache
	 */
	public void cacheResult(AdvType advType) {
		EntityCacheUtil.putResult(AdvTypeModelImpl.ENTITY_CACHE_ENABLED,
			AdvTypeImpl.class, advType.getPrimaryKey(), advType);
	}

	/**
	 * Caches the adv types in the entity cache if it is enabled.
	 *
	 * @param advTypes the adv types to cache
	 */
	public void cacheResult(List<AdvType> advTypes) {
		for (AdvType advType : advTypes) {
			if (EntityCacheUtil.getResult(
						AdvTypeModelImpl.ENTITY_CACHE_ENABLED,
						AdvTypeImpl.class, advType.getPrimaryKey(), this) == null) {
				cacheResult(advType);
			}
		}
	}

	/**
	 * Clears the cache for all adv types.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	public void clearCache() {
		CacheRegistryUtil.clear(AdvTypeImpl.class.getName());
		EntityCacheUtil.clearCache(AdvTypeImpl.class.getName());
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST);
	}

	/**
	 * Clears the cache for the adv type.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	public void clearCache(AdvType advType) {
		EntityCacheUtil.removeResult(AdvTypeModelImpl.ENTITY_CACHE_ENABLED,
			AdvTypeImpl.class, advType.getPrimaryKey());
	}

	/**
	 * Creates a new adv type with the primary key. Does not add the adv type to the database.
	 *
	 * @param typeId the primary key for the new adv type
	 * @return the new adv type
	 */
	public AdvType create(long typeId) {
		AdvType advType = new AdvTypeImpl();

		advType.setNew(true);
		advType.setPrimaryKey(typeId);

		return advType;
	}

	/**
	 * Removes the adv type with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the adv type to remove
	 * @return the adv type that was removed
	 * @throws com.liferay.portal.NoSuchModelException if a adv type with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public AdvType remove(Serializable primaryKey)
		throws NoSuchModelException, SystemException {
		return remove(((Long)primaryKey).longValue());
	}

	/**
	 * Removes the adv type with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param typeId the primary key of the adv type to remove
	 * @return the adv type that was removed
	 * @throws com.vsi.advertisement.portlet.NoSuchAdvTypeException if a adv type with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public AdvType remove(long typeId)
		throws NoSuchAdvTypeException, SystemException {
		Session session = null;

		try {
			session = openSession();

			AdvType advType = (AdvType)session.get(AdvTypeImpl.class,
					new Long(typeId));

			if (advType == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + typeId);
				}

				throw new NoSuchAdvTypeException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					typeId);
			}

			return remove(advType);
		}
		catch (NoSuchAdvTypeException nsee) {
			throw nsee;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected AdvType removeImpl(AdvType advType) throws SystemException {
		advType = toUnwrappedModel(advType);

		Session session = null;

		try {
			session = openSession();

			BatchSessionUtil.delete(session, advType);
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST);

		EntityCacheUtil.removeResult(AdvTypeModelImpl.ENTITY_CACHE_ENABLED,
			AdvTypeImpl.class, advType.getPrimaryKey());

		return advType;
	}

	public AdvType updateImpl(
		com.vsi.advertisement.portlet.model.AdvType advType, boolean merge)
		throws SystemException {
		advType = toUnwrappedModel(advType);

		Session session = null;

		try {
			session = openSession();

			BatchSessionUtil.update(session, advType, merge);

			advType.setNew(false);
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST);

		EntityCacheUtil.putResult(AdvTypeModelImpl.ENTITY_CACHE_ENABLED,
			AdvTypeImpl.class, advType.getPrimaryKey(), advType);

		return advType;
	}

	protected AdvType toUnwrappedModel(AdvType advType) {
		if (advType instanceof AdvTypeImpl) {
			return advType;
		}

		AdvTypeImpl advTypeImpl = new AdvTypeImpl();

		advTypeImpl.setNew(advType.isNew());
		advTypeImpl.setPrimaryKey(advType.getPrimaryKey());

		advTypeImpl.setTypeId(advType.getTypeId());
		advTypeImpl.setCreateDate(advType.getCreateDate());
		advTypeImpl.setModifiedDate(advType.getModifiedDate());
		advTypeImpl.setGroupId(advType.getGroupId());
		advTypeImpl.setCompanyId(advType.getCompanyId());
		advTypeImpl.setName(advType.getName());
		advTypeImpl.setDescription(advType.getDescription());

		return advTypeImpl;
	}

	/**
	 * Finds the adv type with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the adv type to find
	 * @return the adv type
	 * @throws com.liferay.portal.NoSuchModelException if a adv type with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public AdvType findByPrimaryKey(Serializable primaryKey)
		throws NoSuchModelException, SystemException {
		return findByPrimaryKey(((Long)primaryKey).longValue());
	}

	/**
	 * Finds the adv type with the primary key or throws a {@link com.vsi.advertisement.portlet.NoSuchAdvTypeException} if it could not be found.
	 *
	 * @param typeId the primary key of the adv type to find
	 * @return the adv type
	 * @throws com.vsi.advertisement.portlet.NoSuchAdvTypeException if a adv type with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public AdvType findByPrimaryKey(long typeId)
		throws NoSuchAdvTypeException, SystemException {
		AdvType advType = fetchByPrimaryKey(typeId);

		if (advType == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + typeId);
			}

			throw new NoSuchAdvTypeException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				typeId);
		}

		return advType;
	}

	/**
	 * Finds the adv type with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the adv type to find
	 * @return the adv type, or <code>null</code> if a adv type with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public AdvType fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		return fetchByPrimaryKey(((Long)primaryKey).longValue());
	}

	/**
	 * Finds the adv type with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param typeId the primary key of the adv type to find
	 * @return the adv type, or <code>null</code> if a adv type with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public AdvType fetchByPrimaryKey(long typeId) throws SystemException {
		AdvType advType = (AdvType)EntityCacheUtil.getResult(AdvTypeModelImpl.ENTITY_CACHE_ENABLED,
				AdvTypeImpl.class, typeId, this);

		if (advType == null) {
			Session session = null;

			try {
				session = openSession();

				advType = (AdvType)session.get(AdvTypeImpl.class,
						new Long(typeId));
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (advType != null) {
					cacheResult(advType);
				}

				closeSession(session);
			}
		}

		return advType;
	}

	/**
	 * Finds all the adv types where groupId = &#63;.
	 *
	 * @param groupId the group id to search with
	 * @return the matching adv types
	 * @throws SystemException if a system exception occurred
	 */
	public List<AdvType> findByG(long groupId) throws SystemException {
		return findByG(groupId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Finds a range of all the adv types where groupId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param groupId the group id to search with
	 * @param start the lower bound of the range of adv types to return
	 * @param end the upper bound of the range of adv types to return (not inclusive)
	 * @return the range of matching adv types
	 * @throws SystemException if a system exception occurred
	 */
	public List<AdvType> findByG(long groupId, int start, int end)
		throws SystemException {
		return findByG(groupId, start, end, null);
	}

	/**
	 * Finds an ordered range of all the adv types where groupId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param groupId the group id to search with
	 * @param start the lower bound of the range of adv types to return
	 * @param end the upper bound of the range of adv types to return (not inclusive)
	 * @param orderByComparator the comparator to order the results by
	 * @return the ordered range of matching adv types
	 * @throws SystemException if a system exception occurred
	 */
	public List<AdvType> findByG(long groupId, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		Object[] finderArgs = new Object[] {
				groupId,
				
				String.valueOf(start), String.valueOf(end),
				String.valueOf(orderByComparator)
			};

		List<AdvType> list = (List<AdvType>)FinderCacheUtil.getResult(FINDER_PATH_FIND_BY_G,
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

			query.append(_SQL_SELECT_ADVTYPE_WHERE);

			query.append(_FINDER_COLUMN_G_GROUPID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}

			else {
				query.append(AdvTypeModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(groupId);

				list = (List<AdvType>)QueryUtil.list(q, getDialect(), start, end);
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
	 * Finds the first adv type in the ordered set where groupId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param groupId the group id to search with
	 * @param orderByComparator the comparator to order the set by
	 * @return the first matching adv type
	 * @throws com.vsi.advertisement.portlet.NoSuchAdvTypeException if a matching adv type could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public AdvType findByG_First(long groupId,
		OrderByComparator orderByComparator)
		throws NoSuchAdvTypeException, SystemException {
		List<AdvType> list = findByG(groupId, 0, 1, orderByComparator);

		if (list.isEmpty()) {
			StringBundler msg = new StringBundler(4);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("groupId=");
			msg.append(groupId);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			throw new NoSuchAdvTypeException(msg.toString());
		}
		else {
			return list.get(0);
		}
	}

	/**
	 * Finds the last adv type in the ordered set where groupId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param groupId the group id to search with
	 * @param orderByComparator the comparator to order the set by
	 * @return the last matching adv type
	 * @throws com.vsi.advertisement.portlet.NoSuchAdvTypeException if a matching adv type could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public AdvType findByG_Last(long groupId,
		OrderByComparator orderByComparator)
		throws NoSuchAdvTypeException, SystemException {
		int count = countByG(groupId);

		List<AdvType> list = findByG(groupId, count - 1, count,
				orderByComparator);

		if (list.isEmpty()) {
			StringBundler msg = new StringBundler(4);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("groupId=");
			msg.append(groupId);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			throw new NoSuchAdvTypeException(msg.toString());
		}
		else {
			return list.get(0);
		}
	}

	/**
	 * Finds the adv types before and after the current adv type in the ordered set where groupId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param typeId the primary key of the current adv type
	 * @param groupId the group id to search with
	 * @param orderByComparator the comparator to order the set by
	 * @return the previous, current, and next adv type
	 * @throws com.vsi.advertisement.portlet.NoSuchAdvTypeException if a adv type with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public AdvType[] findByG_PrevAndNext(long typeId, long groupId,
		OrderByComparator orderByComparator)
		throws NoSuchAdvTypeException, SystemException {
		AdvType advType = findByPrimaryKey(typeId);

		Session session = null;

		try {
			session = openSession();

			AdvType[] array = new AdvTypeImpl[3];

			array[0] = getByG_PrevAndNext(session, advType, groupId,
					orderByComparator, true);

			array[1] = advType;

			array[2] = getByG_PrevAndNext(session, advType, groupId,
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

	protected AdvType getByG_PrevAndNext(Session session, AdvType advType,
		long groupId, OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_ADVTYPE_WHERE);

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
			query.append(AdvTypeModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(groupId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByValues(advType);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<AdvType> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Finds all the adv types.
	 *
	 * @return the adv types
	 * @throws SystemException if a system exception occurred
	 */
	public List<AdvType> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Finds a range of all the adv types.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param start the lower bound of the range of adv types to return
	 * @param end the upper bound of the range of adv types to return (not inclusive)
	 * @return the range of adv types
	 * @throws SystemException if a system exception occurred
	 */
	public List<AdvType> findAll(int start, int end) throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Finds an ordered range of all the adv types.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param start the lower bound of the range of adv types to return
	 * @param end the upper bound of the range of adv types to return (not inclusive)
	 * @param orderByComparator the comparator to order the results by
	 * @return the ordered range of adv types
	 * @throws SystemException if a system exception occurred
	 */
	public List<AdvType> findAll(int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		Object[] finderArgs = new Object[] {
				String.valueOf(start), String.valueOf(end),
				String.valueOf(orderByComparator)
			};

		List<AdvType> list = (List<AdvType>)FinderCacheUtil.getResult(FINDER_PATH_FIND_ALL,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_ADVTYPE);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_ADVTYPE.concat(AdvTypeModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (orderByComparator == null) {
					list = (List<AdvType>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);
				}
				else {
					list = (List<AdvType>)QueryUtil.list(q, getDialect(),
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
	 * Removes all the adv types where groupId = &#63; from the database.
	 *
	 * @param groupId the group id to search with
	 * @throws SystemException if a system exception occurred
	 */
	public void removeByG(long groupId) throws SystemException {
		for (AdvType advType : findByG(groupId)) {
			remove(advType);
		}
	}

	/**
	 * Removes all the adv types from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	public void removeAll() throws SystemException {
		for (AdvType advType : findAll()) {
			remove(advType);
		}
	}

	/**
	 * Counts all the adv types where groupId = &#63;.
	 *
	 * @param groupId the group id to search with
	 * @return the number of matching adv types
	 * @throws SystemException if a system exception occurred
	 */
	public int countByG(long groupId) throws SystemException {
		Object[] finderArgs = new Object[] { groupId };

		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_BY_G,
				finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_ADVTYPE_WHERE);

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
	 * Counts all the adv types.
	 *
	 * @return the number of adv types
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

				Query q = session.createQuery(_SQL_COUNT_ADVTYPE);

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
	 * Initializes the adv type persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.com.vsi.advertisement.portlet.model.AdvType")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<AdvType>> listenersList = new ArrayList<ModelListener<AdvType>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<AdvType>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(AdvTypeImpl.class.getName());
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
	private static final String _SQL_SELECT_ADVTYPE = "SELECT advType FROM AdvType advType";
	private static final String _SQL_SELECT_ADVTYPE_WHERE = "SELECT advType FROM AdvType advType WHERE ";
	private static final String _SQL_COUNT_ADVTYPE = "SELECT COUNT(advType) FROM AdvType advType";
	private static final String _SQL_COUNT_ADVTYPE_WHERE = "SELECT COUNT(advType) FROM AdvType advType WHERE ";
	private static final String _FINDER_COLUMN_G_GROUPID_2 = "advType.groupId = ?";
	private static final String _ORDER_BY_ENTITY_ALIAS = "advType.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No AdvType exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No AdvType exists with the key {";
	private static Log _log = LogFactoryUtil.getLog(AdvTypePersistenceImpl.class);
}