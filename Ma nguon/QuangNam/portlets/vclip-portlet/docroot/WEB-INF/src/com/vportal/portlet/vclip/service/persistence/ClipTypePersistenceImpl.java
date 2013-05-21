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

package com.vportal.portlet.vclip.service.persistence;

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

import com.vportal.portlet.vclip.NoSuchClipTypeException;
import com.vportal.portlet.vclip.model.ClipType;
import com.vportal.portlet.vclip.model.impl.ClipTypeImpl;
import com.vportal.portlet.vclip.model.impl.ClipTypeModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The persistence implementation for the clip type service.
 *
 * <p>
 * Never modify or reference this class directly. Always use {@link ClipTypeUtil} to access the clip type persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
 * </p>
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see ClipTypePersistence
 * @see ClipTypeUtil
 * @generated
 */
public class ClipTypePersistenceImpl extends BasePersistenceImpl<ClipType>
	implements ClipTypePersistence {
	public static final String FINDER_CLASS_NAME_ENTITY = ClipTypeImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST = FINDER_CLASS_NAME_ENTITY +
		".List";
	public static final FinderPath FINDER_PATH_FIND_BY_LANGUAGE = new FinderPath(ClipTypeModelImpl.ENTITY_CACHE_ENABLED,
			ClipTypeModelImpl.FINDER_CACHE_ENABLED, FINDER_CLASS_NAME_LIST,
			"findByLanguage",
			new String[] {
				String.class.getName(), Boolean.class.getName(),
				
			"java.lang.Integer", "java.lang.Integer",
				"com.liferay.portal.kernel.util.OrderByComparator"
			});
	public static final FinderPath FINDER_PATH_COUNT_BY_LANGUAGE = new FinderPath(ClipTypeModelImpl.ENTITY_CACHE_ENABLED,
			ClipTypeModelImpl.FINDER_CACHE_ENABLED, FINDER_CLASS_NAME_LIST,
			"countByLanguage",
			new String[] { String.class.getName(), Boolean.class.getName() });
	public static final FinderPath FINDER_PATH_FIND_ALL = new FinderPath(ClipTypeModelImpl.ENTITY_CACHE_ENABLED,
			ClipTypeModelImpl.FINDER_CACHE_ENABLED, FINDER_CLASS_NAME_LIST,
			"findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(ClipTypeModelImpl.ENTITY_CACHE_ENABLED,
			ClipTypeModelImpl.FINDER_CACHE_ENABLED, FINDER_CLASS_NAME_LIST,
			"countAll", new String[0]);

	/**
	 * Caches the clip type in the entity cache if it is enabled.
	 *
	 * @param clipType the clip type to cache
	 */
	public void cacheResult(ClipType clipType) {
		EntityCacheUtil.putResult(ClipTypeModelImpl.ENTITY_CACHE_ENABLED,
			ClipTypeImpl.class, clipType.getPrimaryKey(), clipType);
	}

	/**
	 * Caches the clip types in the entity cache if it is enabled.
	 *
	 * @param clipTypes the clip types to cache
	 */
	public void cacheResult(List<ClipType> clipTypes) {
		for (ClipType clipType : clipTypes) {
			if (EntityCacheUtil.getResult(
						ClipTypeModelImpl.ENTITY_CACHE_ENABLED,
						ClipTypeImpl.class, clipType.getPrimaryKey(), this) == null) {
				cacheResult(clipType);
			}
		}
	}

	/**
	 * Clears the cache for all clip types.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	public void clearCache() {
		CacheRegistryUtil.clear(ClipTypeImpl.class.getName());
		EntityCacheUtil.clearCache(ClipTypeImpl.class.getName());
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST);
	}

	/**
	 * Clears the cache for the clip type.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	public void clearCache(ClipType clipType) {
		EntityCacheUtil.removeResult(ClipTypeModelImpl.ENTITY_CACHE_ENABLED,
			ClipTypeImpl.class, clipType.getPrimaryKey());
	}

	/**
	 * Creates a new clip type with the primary key. Does not add the clip type to the database.
	 *
	 * @param id the primary key for the new clip type
	 * @return the new clip type
	 */
	public ClipType create(String id) {
		ClipType clipType = new ClipTypeImpl();

		clipType.setNew(true);
		clipType.setPrimaryKey(id);

		return clipType;
	}

	/**
	 * Removes the clip type with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the clip type to remove
	 * @return the clip type that was removed
	 * @throws com.liferay.portal.NoSuchModelException if a clip type with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public ClipType remove(Serializable primaryKey)
		throws NoSuchModelException, SystemException {
		return remove((String)primaryKey);
	}

	/**
	 * Removes the clip type with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the clip type to remove
	 * @return the clip type that was removed
	 * @throws com.vportal.portlet.vclip.NoSuchClipTypeException if a clip type with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public ClipType remove(String id)
		throws NoSuchClipTypeException, SystemException {
		Session session = null;

		try {
			session = openSession();

			ClipType clipType = (ClipType)session.get(ClipTypeImpl.class, id);

			if (clipType == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + id);
				}

				throw new NoSuchClipTypeException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					id);
			}

			return remove(clipType);
		}
		catch (NoSuchClipTypeException nsee) {
			throw nsee;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected ClipType removeImpl(ClipType clipType) throws SystemException {
		clipType = toUnwrappedModel(clipType);

		Session session = null;

		try {
			session = openSession();

			BatchSessionUtil.delete(session, clipType);
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST);

		EntityCacheUtil.removeResult(ClipTypeModelImpl.ENTITY_CACHE_ENABLED,
			ClipTypeImpl.class, clipType.getPrimaryKey());

		return clipType;
	}

	public ClipType updateImpl(
		com.vportal.portlet.vclip.model.ClipType clipType, boolean merge)
		throws SystemException {
		clipType = toUnwrappedModel(clipType);

		Session session = null;

		try {
			session = openSession();

			BatchSessionUtil.update(session, clipType, merge);

			clipType.setNew(false);
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST);

		EntityCacheUtil.putResult(ClipTypeModelImpl.ENTITY_CACHE_ENABLED,
			ClipTypeImpl.class, clipType.getPrimaryKey(), clipType);

		return clipType;
	}

	protected ClipType toUnwrappedModel(ClipType clipType) {
		if (clipType instanceof ClipTypeImpl) {
			return clipType;
		}

		ClipTypeImpl clipTypeImpl = new ClipTypeImpl();

		clipTypeImpl.setNew(clipType.isNew());
		clipTypeImpl.setPrimaryKey(clipType.getPrimaryKey());

		clipTypeImpl.setId(clipType.getId());
		clipTypeImpl.setGroupId(clipType.getGroupId());
		clipTypeImpl.setCompanyId(clipType.getCompanyId());
		clipTypeImpl.setUserId(clipType.getUserId());
		clipTypeImpl.setCreatedDate(clipType.getCreatedDate());
		clipTypeImpl.setModifiedDate(clipType.getModifiedDate());
		clipTypeImpl.setTitle(clipType.getTitle());
		clipTypeImpl.setName(clipType.getName());
		clipTypeImpl.setDescription(clipType.getDescription());
		clipTypeImpl.setActive(clipType.isActive());
		clipTypeImpl.setLanguage(clipType.getLanguage());

		return clipTypeImpl;
	}

	/**
	 * Finds the clip type with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the clip type to find
	 * @return the clip type
	 * @throws com.liferay.portal.NoSuchModelException if a clip type with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public ClipType findByPrimaryKey(Serializable primaryKey)
		throws NoSuchModelException, SystemException {
		return findByPrimaryKey((String)primaryKey);
	}

	/**
	 * Finds the clip type with the primary key or throws a {@link com.vportal.portlet.vclip.NoSuchClipTypeException} if it could not be found.
	 *
	 * @param id the primary key of the clip type to find
	 * @return the clip type
	 * @throws com.vportal.portlet.vclip.NoSuchClipTypeException if a clip type with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public ClipType findByPrimaryKey(String id)
		throws NoSuchClipTypeException, SystemException {
		ClipType clipType = fetchByPrimaryKey(id);

		if (clipType == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + id);
			}

			throw new NoSuchClipTypeException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				id);
		}

		return clipType;
	}

	/**
	 * Finds the clip type with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the clip type to find
	 * @return the clip type, or <code>null</code> if a clip type with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public ClipType fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		return fetchByPrimaryKey((String)primaryKey);
	}

	/**
	 * Finds the clip type with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the clip type to find
	 * @return the clip type, or <code>null</code> if a clip type with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public ClipType fetchByPrimaryKey(String id) throws SystemException {
		ClipType clipType = (ClipType)EntityCacheUtil.getResult(ClipTypeModelImpl.ENTITY_CACHE_ENABLED,
				ClipTypeImpl.class, id, this);

		if (clipType == null) {
			Session session = null;

			try {
				session = openSession();

				clipType = (ClipType)session.get(ClipTypeImpl.class, id);
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (clipType != null) {
					cacheResult(clipType);
				}

				closeSession(session);
			}
		}

		return clipType;
	}

	/**
	 * Finds all the clip types where language = &#63; and active = &#63;.
	 *
	 * @param language the language to search with
	 * @param active the active to search with
	 * @return the matching clip types
	 * @throws SystemException if a system exception occurred
	 */
	public List<ClipType> findByLanguage(String language, boolean active)
		throws SystemException {
		return findByLanguage(language, active, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Finds a range of all the clip types where language = &#63; and active = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param language the language to search with
	 * @param active the active to search with
	 * @param start the lower bound of the range of clip types to return
	 * @param end the upper bound of the range of clip types to return (not inclusive)
	 * @return the range of matching clip types
	 * @throws SystemException if a system exception occurred
	 */
	public List<ClipType> findByLanguage(String language, boolean active,
		int start, int end) throws SystemException {
		return findByLanguage(language, active, start, end, null);
	}

	/**
	 * Finds an ordered range of all the clip types where language = &#63; and active = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param language the language to search with
	 * @param active the active to search with
	 * @param start the lower bound of the range of clip types to return
	 * @param end the upper bound of the range of clip types to return (not inclusive)
	 * @param orderByComparator the comparator to order the results by
	 * @return the ordered range of matching clip types
	 * @throws SystemException if a system exception occurred
	 */
	public List<ClipType> findByLanguage(String language, boolean active,
		int start, int end, OrderByComparator orderByComparator)
		throws SystemException {
		Object[] finderArgs = new Object[] {
				language, active,
				
				String.valueOf(start), String.valueOf(end),
				String.valueOf(orderByComparator)
			};

		List<ClipType> list = (List<ClipType>)FinderCacheUtil.getResult(FINDER_PATH_FIND_BY_LANGUAGE,
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

			query.append(_SQL_SELECT_CLIPTYPE_WHERE);

			if (language == null) {
				query.append(_FINDER_COLUMN_LANGUAGE_LANGUAGE_1);
			}
			else {
				if (language.equals(StringPool.BLANK)) {
					query.append(_FINDER_COLUMN_LANGUAGE_LANGUAGE_3);
				}
				else {
					query.append(_FINDER_COLUMN_LANGUAGE_LANGUAGE_2);
				}
			}

			query.append(_FINDER_COLUMN_LANGUAGE_ACTIVE_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}

			else {
				query.append(ClipTypeModelImpl.ORDER_BY_JPQL);
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

				qPos.add(active);

				list = (List<ClipType>)QueryUtil.list(q, getDialect(), start,
						end);
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (list == null) {
					FinderCacheUtil.removeResult(FINDER_PATH_FIND_BY_LANGUAGE,
						finderArgs);
				}
				else {
					cacheResult(list);

					FinderCacheUtil.putResult(FINDER_PATH_FIND_BY_LANGUAGE,
						finderArgs, list);
				}

				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Finds the first clip type in the ordered set where language = &#63; and active = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param language the language to search with
	 * @param active the active to search with
	 * @param orderByComparator the comparator to order the set by
	 * @return the first matching clip type
	 * @throws com.vportal.portlet.vclip.NoSuchClipTypeException if a matching clip type could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public ClipType findByLanguage_First(String language, boolean active,
		OrderByComparator orderByComparator)
		throws NoSuchClipTypeException, SystemException {
		List<ClipType> list = findByLanguage(language, active, 0, 1,
				orderByComparator);

		if (list.isEmpty()) {
			StringBundler msg = new StringBundler(6);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("language=");
			msg.append(language);

			msg.append(", active=");
			msg.append(active);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			throw new NoSuchClipTypeException(msg.toString());
		}
		else {
			return list.get(0);
		}
	}

	/**
	 * Finds the last clip type in the ordered set where language = &#63; and active = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param language the language to search with
	 * @param active the active to search with
	 * @param orderByComparator the comparator to order the set by
	 * @return the last matching clip type
	 * @throws com.vportal.portlet.vclip.NoSuchClipTypeException if a matching clip type could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public ClipType findByLanguage_Last(String language, boolean active,
		OrderByComparator orderByComparator)
		throws NoSuchClipTypeException, SystemException {
		int count = countByLanguage(language, active);

		List<ClipType> list = findByLanguage(language, active, count - 1,
				count, orderByComparator);

		if (list.isEmpty()) {
			StringBundler msg = new StringBundler(6);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("language=");
			msg.append(language);

			msg.append(", active=");
			msg.append(active);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			throw new NoSuchClipTypeException(msg.toString());
		}
		else {
			return list.get(0);
		}
	}

	/**
	 * Finds the clip types before and after the current clip type in the ordered set where language = &#63; and active = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param id the primary key of the current clip type
	 * @param language the language to search with
	 * @param active the active to search with
	 * @param orderByComparator the comparator to order the set by
	 * @return the previous, current, and next clip type
	 * @throws com.vportal.portlet.vclip.NoSuchClipTypeException if a clip type with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public ClipType[] findByLanguage_PrevAndNext(String id, String language,
		boolean active, OrderByComparator orderByComparator)
		throws NoSuchClipTypeException, SystemException {
		ClipType clipType = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			ClipType[] array = new ClipTypeImpl[3];

			array[0] = getByLanguage_PrevAndNext(session, clipType, language,
					active, orderByComparator, true);

			array[1] = clipType;

			array[2] = getByLanguage_PrevAndNext(session, clipType, language,
					active, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected ClipType getByLanguage_PrevAndNext(Session session,
		ClipType clipType, String language, boolean active,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_CLIPTYPE_WHERE);

		if (language == null) {
			query.append(_FINDER_COLUMN_LANGUAGE_LANGUAGE_1);
		}
		else {
			if (language.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_LANGUAGE_LANGUAGE_3);
			}
			else {
				query.append(_FINDER_COLUMN_LANGUAGE_LANGUAGE_2);
			}
		}

		query.append(_FINDER_COLUMN_LANGUAGE_ACTIVE_2);

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
			query.append(ClipTypeModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		if (language != null) {
			qPos.add(language);
		}

		qPos.add(active);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByValues(clipType);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<ClipType> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Finds all the clip types.
	 *
	 * @return the clip types
	 * @throws SystemException if a system exception occurred
	 */
	public List<ClipType> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Finds a range of all the clip types.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param start the lower bound of the range of clip types to return
	 * @param end the upper bound of the range of clip types to return (not inclusive)
	 * @return the range of clip types
	 * @throws SystemException if a system exception occurred
	 */
	public List<ClipType> findAll(int start, int end) throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Finds an ordered range of all the clip types.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param start the lower bound of the range of clip types to return
	 * @param end the upper bound of the range of clip types to return (not inclusive)
	 * @param orderByComparator the comparator to order the results by
	 * @return the ordered range of clip types
	 * @throws SystemException if a system exception occurred
	 */
	public List<ClipType> findAll(int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		Object[] finderArgs = new Object[] {
				String.valueOf(start), String.valueOf(end),
				String.valueOf(orderByComparator)
			};

		List<ClipType> list = (List<ClipType>)FinderCacheUtil.getResult(FINDER_PATH_FIND_ALL,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_CLIPTYPE);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_CLIPTYPE.concat(ClipTypeModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (orderByComparator == null) {
					list = (List<ClipType>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);
				}
				else {
					list = (List<ClipType>)QueryUtil.list(q, getDialect(),
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
	 * Removes all the clip types where language = &#63; and active = &#63; from the database.
	 *
	 * @param language the language to search with
	 * @param active the active to search with
	 * @throws SystemException if a system exception occurred
	 */
	public void removeByLanguage(String language, boolean active)
		throws SystemException {
		for (ClipType clipType : findByLanguage(language, active)) {
			remove(clipType);
		}
	}

	/**
	 * Removes all the clip types from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	public void removeAll() throws SystemException {
		for (ClipType clipType : findAll()) {
			remove(clipType);
		}
	}

	/**
	 * Counts all the clip types where language = &#63; and active = &#63;.
	 *
	 * @param language the language to search with
	 * @param active the active to search with
	 * @return the number of matching clip types
	 * @throws SystemException if a system exception occurred
	 */
	public int countByLanguage(String language, boolean active)
		throws SystemException {
		Object[] finderArgs = new Object[] { language, active };

		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_BY_LANGUAGE,
				finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_CLIPTYPE_WHERE);

			if (language == null) {
				query.append(_FINDER_COLUMN_LANGUAGE_LANGUAGE_1);
			}
			else {
				if (language.equals(StringPool.BLANK)) {
					query.append(_FINDER_COLUMN_LANGUAGE_LANGUAGE_3);
				}
				else {
					query.append(_FINDER_COLUMN_LANGUAGE_LANGUAGE_2);
				}
			}

			query.append(_FINDER_COLUMN_LANGUAGE_ACTIVE_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (language != null) {
					qPos.add(language);
				}

				qPos.add(active);

				count = (Long)q.uniqueResult();
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (count == null) {
					count = Long.valueOf(0);
				}

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_LANGUAGE,
					finderArgs, count);

				closeSession(session);
			}
		}

		return count.intValue();
	}

	/**
	 * Counts all the clip types.
	 *
	 * @return the number of clip types
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

				Query q = session.createQuery(_SQL_COUNT_CLIPTYPE);

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
	 * Initializes the clip type persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.com.vportal.portlet.vclip.model.ClipType")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<ClipType>> listenersList = new ArrayList<ModelListener<ClipType>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<ClipType>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(ClipTypeImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST);
	}

	@BeanReference(type = ClipTypePersistence.class)
	protected ClipTypePersistence clipTypePersistence;
	@BeanReference(type = ClipPersistence.class)
	protected ClipPersistence clipPersistence;
	@BeanReference(type = ResourcePersistence.class)
	protected ResourcePersistence resourcePersistence;
	@BeanReference(type = UserPersistence.class)
	protected UserPersistence userPersistence;
	private static final String _SQL_SELECT_CLIPTYPE = "SELECT clipType FROM ClipType clipType";
	private static final String _SQL_SELECT_CLIPTYPE_WHERE = "SELECT clipType FROM ClipType clipType WHERE ";
	private static final String _SQL_COUNT_CLIPTYPE = "SELECT COUNT(clipType) FROM ClipType clipType";
	private static final String _SQL_COUNT_CLIPTYPE_WHERE = "SELECT COUNT(clipType) FROM ClipType clipType WHERE ";
	private static final String _FINDER_COLUMN_LANGUAGE_LANGUAGE_1 = "clipType.language IS NULL AND ";
	private static final String _FINDER_COLUMN_LANGUAGE_LANGUAGE_2 = "clipType.language = ? AND ";
	private static final String _FINDER_COLUMN_LANGUAGE_LANGUAGE_3 = "(clipType.language IS NULL OR clipType.language = ?) AND ";
	private static final String _FINDER_COLUMN_LANGUAGE_ACTIVE_2 = "clipType.active = ?";
	private static final String _ORDER_BY_ENTITY_ALIAS = "clipType.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No ClipType exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No ClipType exists with the key {";
	private static Log _log = LogFactoryUtil.getLog(ClipTypePersistenceImpl.class);
}