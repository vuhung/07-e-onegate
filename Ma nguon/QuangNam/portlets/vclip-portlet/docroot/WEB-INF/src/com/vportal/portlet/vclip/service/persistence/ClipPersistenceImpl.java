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

import com.vportal.portlet.vclip.NoSuchClipException;
import com.vportal.portlet.vclip.model.Clip;
import com.vportal.portlet.vclip.model.impl.ClipImpl;
import com.vportal.portlet.vclip.model.impl.ClipModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The persistence implementation for the clip service.
 *
 * <p>
 * Never modify or reference this class directly. Always use {@link ClipUtil} to access the clip persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
 * </p>
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see ClipPersistence
 * @see ClipUtil
 * @generated
 */
public class ClipPersistenceImpl extends BasePersistenceImpl<Clip>
	implements ClipPersistence {
	public static final String FINDER_CLASS_NAME_ENTITY = ClipImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST = FINDER_CLASS_NAME_ENTITY +
		".List";
	public static final FinderPath FINDER_PATH_FIND_BY_LANGUAGE = new FinderPath(ClipModelImpl.ENTITY_CACHE_ENABLED,
			ClipModelImpl.FINDER_CACHE_ENABLED, FINDER_CLASS_NAME_LIST,
			"findByLanguage",
			new String[] {
				String.class.getName(), Boolean.class.getName(),
				
			"java.lang.Integer", "java.lang.Integer",
				"com.liferay.portal.kernel.util.OrderByComparator"
			});
	public static final FinderPath FINDER_PATH_COUNT_BY_LANGUAGE = new FinderPath(ClipModelImpl.ENTITY_CACHE_ENABLED,
			ClipModelImpl.FINDER_CACHE_ENABLED, FINDER_CLASS_NAME_LIST,
			"countByLanguage",
			new String[] { String.class.getName(), Boolean.class.getName() });
	public static final FinderPath FINDER_PATH_FIND_BY_CLIPTYPEID = new FinderPath(ClipModelImpl.ENTITY_CACHE_ENABLED,
			ClipModelImpl.FINDER_CACHE_ENABLED, FINDER_CLASS_NAME_LIST,
			"findByClipTypeId",
			new String[] {
				String.class.getName(),
				
			"java.lang.Integer", "java.lang.Integer",
				"com.liferay.portal.kernel.util.OrderByComparator"
			});
	public static final FinderPath FINDER_PATH_COUNT_BY_CLIPTYPEID = new FinderPath(ClipModelImpl.ENTITY_CACHE_ENABLED,
			ClipModelImpl.FINDER_CACHE_ENABLED, FINDER_CLASS_NAME_LIST,
			"countByClipTypeId", new String[] { String.class.getName() });
	public static final FinderPath FINDER_PATH_FIND_ALL = new FinderPath(ClipModelImpl.ENTITY_CACHE_ENABLED,
			ClipModelImpl.FINDER_CACHE_ENABLED, FINDER_CLASS_NAME_LIST,
			"findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(ClipModelImpl.ENTITY_CACHE_ENABLED,
			ClipModelImpl.FINDER_CACHE_ENABLED, FINDER_CLASS_NAME_LIST,
			"countAll", new String[0]);

	/**
	 * Caches the clip in the entity cache if it is enabled.
	 *
	 * @param clip the clip to cache
	 */
	public void cacheResult(Clip clip) {
		EntityCacheUtil.putResult(ClipModelImpl.ENTITY_CACHE_ENABLED,
			ClipImpl.class, clip.getPrimaryKey(), clip);
	}

	/**
	 * Caches the clips in the entity cache if it is enabled.
	 *
	 * @param clips the clips to cache
	 */
	public void cacheResult(List<Clip> clips) {
		for (Clip clip : clips) {
			if (EntityCacheUtil.getResult(ClipModelImpl.ENTITY_CACHE_ENABLED,
						ClipImpl.class, clip.getPrimaryKey(), this) == null) {
				cacheResult(clip);
			}
		}
	}

	/**
	 * Clears the cache for all clips.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	public void clearCache() {
		CacheRegistryUtil.clear(ClipImpl.class.getName());
		EntityCacheUtil.clearCache(ClipImpl.class.getName());
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST);
	}

	/**
	 * Clears the cache for the clip.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	public void clearCache(Clip clip) {
		EntityCacheUtil.removeResult(ClipModelImpl.ENTITY_CACHE_ENABLED,
			ClipImpl.class, clip.getPrimaryKey());
	}

	/**
	 * Creates a new clip with the primary key. Does not add the clip to the database.
	 *
	 * @param id the primary key for the new clip
	 * @return the new clip
	 */
	public Clip create(String id) {
		Clip clip = new ClipImpl();

		clip.setNew(true);
		clip.setPrimaryKey(id);

		return clip;
	}

	/**
	 * Removes the clip with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the clip to remove
	 * @return the clip that was removed
	 * @throws com.liferay.portal.NoSuchModelException if a clip with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public Clip remove(Serializable primaryKey)
		throws NoSuchModelException, SystemException {
		return remove((String)primaryKey);
	}

	/**
	 * Removes the clip with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the clip to remove
	 * @return the clip that was removed
	 * @throws com.vportal.portlet.vclip.NoSuchClipException if a clip with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public Clip remove(String id) throws NoSuchClipException, SystemException {
		Session session = null;

		try {
			session = openSession();

			Clip clip = (Clip)session.get(ClipImpl.class, id);

			if (clip == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + id);
				}

				throw new NoSuchClipException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					id);
			}

			return remove(clip);
		}
		catch (NoSuchClipException nsee) {
			throw nsee;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected Clip removeImpl(Clip clip) throws SystemException {
		clip = toUnwrappedModel(clip);

		Session session = null;

		try {
			session = openSession();

			BatchSessionUtil.delete(session, clip);
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST);

		EntityCacheUtil.removeResult(ClipModelImpl.ENTITY_CACHE_ENABLED,
			ClipImpl.class, clip.getPrimaryKey());

		return clip;
	}

	public Clip updateImpl(com.vportal.portlet.vclip.model.Clip clip,
		boolean merge) throws SystemException {
		clip = toUnwrappedModel(clip);

		Session session = null;

		try {
			session = openSession();

			BatchSessionUtil.update(session, clip, merge);

			clip.setNew(false);
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST);

		EntityCacheUtil.putResult(ClipModelImpl.ENTITY_CACHE_ENABLED,
			ClipImpl.class, clip.getPrimaryKey(), clip);

		return clip;
	}

	protected Clip toUnwrappedModel(Clip clip) {
		if (clip instanceof ClipImpl) {
			return clip;
		}

		ClipImpl clipImpl = new ClipImpl();

		clipImpl.setNew(clip.isNew());
		clipImpl.setPrimaryKey(clip.getPrimaryKey());

		clipImpl.setId(clip.getId());
		clipImpl.setClipTypeId(clip.getClipTypeId());
		clipImpl.setGroupId(clip.getGroupId());
		clipImpl.setCompanyId(clip.getCompanyId());
		clipImpl.setUserId(clip.getUserId());
		clipImpl.setCreatedDate(clip.getCreatedDate());
		clipImpl.setModifiedDate(clip.getModifiedDate());
		clipImpl.setUrl(clip.getUrl());
		clipImpl.setName(clip.getName());
		clipImpl.setTitle(clip.getTitle());
		clipImpl.setImage(clip.getImage());
		clipImpl.setDescription(clip.getDescription());
		clipImpl.setActive(clip.isActive());
		clipImpl.setLanguage(clip.getLanguage());
		clipImpl.setHitcount(clip.getHitcount());
		clipImpl.setHitcountview(clip.getHitcountview());

		return clipImpl;
	}

	/**
	 * Finds the clip with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the clip to find
	 * @return the clip
	 * @throws com.liferay.portal.NoSuchModelException if a clip with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public Clip findByPrimaryKey(Serializable primaryKey)
		throws NoSuchModelException, SystemException {
		return findByPrimaryKey((String)primaryKey);
	}

	/**
	 * Finds the clip with the primary key or throws a {@link com.vportal.portlet.vclip.NoSuchClipException} if it could not be found.
	 *
	 * @param id the primary key of the clip to find
	 * @return the clip
	 * @throws com.vportal.portlet.vclip.NoSuchClipException if a clip with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public Clip findByPrimaryKey(String id)
		throws NoSuchClipException, SystemException {
		Clip clip = fetchByPrimaryKey(id);

		if (clip == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + id);
			}

			throw new NoSuchClipException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				id);
		}

		return clip;
	}

	/**
	 * Finds the clip with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the clip to find
	 * @return the clip, or <code>null</code> if a clip with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public Clip fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		return fetchByPrimaryKey((String)primaryKey);
	}

	/**
	 * Finds the clip with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the clip to find
	 * @return the clip, or <code>null</code> if a clip with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public Clip fetchByPrimaryKey(String id) throws SystemException {
		Clip clip = (Clip)EntityCacheUtil.getResult(ClipModelImpl.ENTITY_CACHE_ENABLED,
				ClipImpl.class, id, this);

		if (clip == null) {
			Session session = null;

			try {
				session = openSession();

				clip = (Clip)session.get(ClipImpl.class, id);
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (clip != null) {
					cacheResult(clip);
				}

				closeSession(session);
			}
		}

		return clip;
	}

	/**
	 * Finds all the clips where language = &#63; and active = &#63;.
	 *
	 * @param language the language to search with
	 * @param active the active to search with
	 * @return the matching clips
	 * @throws SystemException if a system exception occurred
	 */
	public List<Clip> findByLanguage(String language, boolean active)
		throws SystemException {
		return findByLanguage(language, active, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Finds a range of all the clips where language = &#63; and active = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param language the language to search with
	 * @param active the active to search with
	 * @param start the lower bound of the range of clips to return
	 * @param end the upper bound of the range of clips to return (not inclusive)
	 * @return the range of matching clips
	 * @throws SystemException if a system exception occurred
	 */
	public List<Clip> findByLanguage(String language, boolean active,
		int start, int end) throws SystemException {
		return findByLanguage(language, active, start, end, null);
	}

	/**
	 * Finds an ordered range of all the clips where language = &#63; and active = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param language the language to search with
	 * @param active the active to search with
	 * @param start the lower bound of the range of clips to return
	 * @param end the upper bound of the range of clips to return (not inclusive)
	 * @param orderByComparator the comparator to order the results by
	 * @return the ordered range of matching clips
	 * @throws SystemException if a system exception occurred
	 */
	public List<Clip> findByLanguage(String language, boolean active,
		int start, int end, OrderByComparator orderByComparator)
		throws SystemException {
		Object[] finderArgs = new Object[] {
				language, active,
				
				String.valueOf(start), String.valueOf(end),
				String.valueOf(orderByComparator)
			};

		List<Clip> list = (List<Clip>)FinderCacheUtil.getResult(FINDER_PATH_FIND_BY_LANGUAGE,
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

			query.append(_SQL_SELECT_CLIP_WHERE);

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
				query.append(ClipModelImpl.ORDER_BY_JPQL);
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

				list = (List<Clip>)QueryUtil.list(q, getDialect(), start, end);
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
	 * Finds the first clip in the ordered set where language = &#63; and active = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param language the language to search with
	 * @param active the active to search with
	 * @param orderByComparator the comparator to order the set by
	 * @return the first matching clip
	 * @throws com.vportal.portlet.vclip.NoSuchClipException if a matching clip could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public Clip findByLanguage_First(String language, boolean active,
		OrderByComparator orderByComparator)
		throws NoSuchClipException, SystemException {
		List<Clip> list = findByLanguage(language, active, 0, 1,
				orderByComparator);

		if (list.isEmpty()) {
			StringBundler msg = new StringBundler(6);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("language=");
			msg.append(language);

			msg.append(", active=");
			msg.append(active);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			throw new NoSuchClipException(msg.toString());
		}
		else {
			return list.get(0);
		}
	}

	/**
	 * Finds the last clip in the ordered set where language = &#63; and active = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param language the language to search with
	 * @param active the active to search with
	 * @param orderByComparator the comparator to order the set by
	 * @return the last matching clip
	 * @throws com.vportal.portlet.vclip.NoSuchClipException if a matching clip could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public Clip findByLanguage_Last(String language, boolean active,
		OrderByComparator orderByComparator)
		throws NoSuchClipException, SystemException {
		int count = countByLanguage(language, active);

		List<Clip> list = findByLanguage(language, active, count - 1, count,
				orderByComparator);

		if (list.isEmpty()) {
			StringBundler msg = new StringBundler(6);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("language=");
			msg.append(language);

			msg.append(", active=");
			msg.append(active);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			throw new NoSuchClipException(msg.toString());
		}
		else {
			return list.get(0);
		}
	}

	/**
	 * Finds the clips before and after the current clip in the ordered set where language = &#63; and active = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param id the primary key of the current clip
	 * @param language the language to search with
	 * @param active the active to search with
	 * @param orderByComparator the comparator to order the set by
	 * @return the previous, current, and next clip
	 * @throws com.vportal.portlet.vclip.NoSuchClipException if a clip with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public Clip[] findByLanguage_PrevAndNext(String id, String language,
		boolean active, OrderByComparator orderByComparator)
		throws NoSuchClipException, SystemException {
		Clip clip = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			Clip[] array = new ClipImpl[3];

			array[0] = getByLanguage_PrevAndNext(session, clip, language,
					active, orderByComparator, true);

			array[1] = clip;

			array[2] = getByLanguage_PrevAndNext(session, clip, language,
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

	protected Clip getByLanguage_PrevAndNext(Session session, Clip clip,
		String language, boolean active, OrderByComparator orderByComparator,
		boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_CLIP_WHERE);

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
			query.append(ClipModelImpl.ORDER_BY_JPQL);
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
			Object[] values = orderByComparator.getOrderByValues(clip);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<Clip> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Finds all the clips where clipTypeId = &#63;.
	 *
	 * @param clipTypeId the clip type id to search with
	 * @return the matching clips
	 * @throws SystemException if a system exception occurred
	 */
	public List<Clip> findByClipTypeId(String clipTypeId)
		throws SystemException {
		return findByClipTypeId(clipTypeId, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Finds a range of all the clips where clipTypeId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param clipTypeId the clip type id to search with
	 * @param start the lower bound of the range of clips to return
	 * @param end the upper bound of the range of clips to return (not inclusive)
	 * @return the range of matching clips
	 * @throws SystemException if a system exception occurred
	 */
	public List<Clip> findByClipTypeId(String clipTypeId, int start, int end)
		throws SystemException {
		return findByClipTypeId(clipTypeId, start, end, null);
	}

	/**
	 * Finds an ordered range of all the clips where clipTypeId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param clipTypeId the clip type id to search with
	 * @param start the lower bound of the range of clips to return
	 * @param end the upper bound of the range of clips to return (not inclusive)
	 * @param orderByComparator the comparator to order the results by
	 * @return the ordered range of matching clips
	 * @throws SystemException if a system exception occurred
	 */
	public List<Clip> findByClipTypeId(String clipTypeId, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		Object[] finderArgs = new Object[] {
				clipTypeId,
				
				String.valueOf(start), String.valueOf(end),
				String.valueOf(orderByComparator)
			};

		List<Clip> list = (List<Clip>)FinderCacheUtil.getResult(FINDER_PATH_FIND_BY_CLIPTYPEID,
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

			query.append(_SQL_SELECT_CLIP_WHERE);

			if (clipTypeId == null) {
				query.append(_FINDER_COLUMN_CLIPTYPEID_CLIPTYPEID_1);
			}
			else {
				if (clipTypeId.equals(StringPool.BLANK)) {
					query.append(_FINDER_COLUMN_CLIPTYPEID_CLIPTYPEID_3);
				}
				else {
					query.append(_FINDER_COLUMN_CLIPTYPEID_CLIPTYPEID_2);
				}
			}

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}

			else {
				query.append(ClipModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (clipTypeId != null) {
					qPos.add(clipTypeId);
				}

				list = (List<Clip>)QueryUtil.list(q, getDialect(), start, end);
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (list == null) {
					FinderCacheUtil.removeResult(FINDER_PATH_FIND_BY_CLIPTYPEID,
						finderArgs);
				}
				else {
					cacheResult(list);

					FinderCacheUtil.putResult(FINDER_PATH_FIND_BY_CLIPTYPEID,
						finderArgs, list);
				}

				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Finds the first clip in the ordered set where clipTypeId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param clipTypeId the clip type id to search with
	 * @param orderByComparator the comparator to order the set by
	 * @return the first matching clip
	 * @throws com.vportal.portlet.vclip.NoSuchClipException if a matching clip could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public Clip findByClipTypeId_First(String clipTypeId,
		OrderByComparator orderByComparator)
		throws NoSuchClipException, SystemException {
		List<Clip> list = findByClipTypeId(clipTypeId, 0, 1, orderByComparator);

		if (list.isEmpty()) {
			StringBundler msg = new StringBundler(4);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("clipTypeId=");
			msg.append(clipTypeId);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			throw new NoSuchClipException(msg.toString());
		}
		else {
			return list.get(0);
		}
	}

	/**
	 * Finds the last clip in the ordered set where clipTypeId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param clipTypeId the clip type id to search with
	 * @param orderByComparator the comparator to order the set by
	 * @return the last matching clip
	 * @throws com.vportal.portlet.vclip.NoSuchClipException if a matching clip could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public Clip findByClipTypeId_Last(String clipTypeId,
		OrderByComparator orderByComparator)
		throws NoSuchClipException, SystemException {
		int count = countByClipTypeId(clipTypeId);

		List<Clip> list = findByClipTypeId(clipTypeId, count - 1, count,
				orderByComparator);

		if (list.isEmpty()) {
			StringBundler msg = new StringBundler(4);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("clipTypeId=");
			msg.append(clipTypeId);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			throw new NoSuchClipException(msg.toString());
		}
		else {
			return list.get(0);
		}
	}

	/**
	 * Finds the clips before and after the current clip in the ordered set where clipTypeId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param id the primary key of the current clip
	 * @param clipTypeId the clip type id to search with
	 * @param orderByComparator the comparator to order the set by
	 * @return the previous, current, and next clip
	 * @throws com.vportal.portlet.vclip.NoSuchClipException if a clip with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public Clip[] findByClipTypeId_PrevAndNext(String id, String clipTypeId,
		OrderByComparator orderByComparator)
		throws NoSuchClipException, SystemException {
		Clip clip = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			Clip[] array = new ClipImpl[3];

			array[0] = getByClipTypeId_PrevAndNext(session, clip, clipTypeId,
					orderByComparator, true);

			array[1] = clip;

			array[2] = getByClipTypeId_PrevAndNext(session, clip, clipTypeId,
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

	protected Clip getByClipTypeId_PrevAndNext(Session session, Clip clip,
		String clipTypeId, OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_CLIP_WHERE);

		if (clipTypeId == null) {
			query.append(_FINDER_COLUMN_CLIPTYPEID_CLIPTYPEID_1);
		}
		else {
			if (clipTypeId.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_CLIPTYPEID_CLIPTYPEID_3);
			}
			else {
				query.append(_FINDER_COLUMN_CLIPTYPEID_CLIPTYPEID_2);
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
			query.append(ClipModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		if (clipTypeId != null) {
			qPos.add(clipTypeId);
		}

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByValues(clip);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<Clip> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Finds all the clips.
	 *
	 * @return the clips
	 * @throws SystemException if a system exception occurred
	 */
	public List<Clip> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Finds a range of all the clips.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param start the lower bound of the range of clips to return
	 * @param end the upper bound of the range of clips to return (not inclusive)
	 * @return the range of clips
	 * @throws SystemException if a system exception occurred
	 */
	public List<Clip> findAll(int start, int end) throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Finds an ordered range of all the clips.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param start the lower bound of the range of clips to return
	 * @param end the upper bound of the range of clips to return (not inclusive)
	 * @param orderByComparator the comparator to order the results by
	 * @return the ordered range of clips
	 * @throws SystemException if a system exception occurred
	 */
	public List<Clip> findAll(int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		Object[] finderArgs = new Object[] {
				String.valueOf(start), String.valueOf(end),
				String.valueOf(orderByComparator)
			};

		List<Clip> list = (List<Clip>)FinderCacheUtil.getResult(FINDER_PATH_FIND_ALL,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_CLIP);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_CLIP.concat(ClipModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (orderByComparator == null) {
					list = (List<Clip>)QueryUtil.list(q, getDialect(), start,
							end, false);

					Collections.sort(list);
				}
				else {
					list = (List<Clip>)QueryUtil.list(q, getDialect(), start,
							end);
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
	 * Removes all the clips where language = &#63; and active = &#63; from the database.
	 *
	 * @param language the language to search with
	 * @param active the active to search with
	 * @throws SystemException if a system exception occurred
	 */
	public void removeByLanguage(String language, boolean active)
		throws SystemException {
		for (Clip clip : findByLanguage(language, active)) {
			remove(clip);
		}
	}

	/**
	 * Removes all the clips where clipTypeId = &#63; from the database.
	 *
	 * @param clipTypeId the clip type id to search with
	 * @throws SystemException if a system exception occurred
	 */
	public void removeByClipTypeId(String clipTypeId) throws SystemException {
		for (Clip clip : findByClipTypeId(clipTypeId)) {
			remove(clip);
		}
	}

	/**
	 * Removes all the clips from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	public void removeAll() throws SystemException {
		for (Clip clip : findAll()) {
			remove(clip);
		}
	}

	/**
	 * Counts all the clips where language = &#63; and active = &#63;.
	 *
	 * @param language the language to search with
	 * @param active the active to search with
	 * @return the number of matching clips
	 * @throws SystemException if a system exception occurred
	 */
	public int countByLanguage(String language, boolean active)
		throws SystemException {
		Object[] finderArgs = new Object[] { language, active };

		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_BY_LANGUAGE,
				finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_CLIP_WHERE);

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
	 * Counts all the clips where clipTypeId = &#63;.
	 *
	 * @param clipTypeId the clip type id to search with
	 * @return the number of matching clips
	 * @throws SystemException if a system exception occurred
	 */
	public int countByClipTypeId(String clipTypeId) throws SystemException {
		Object[] finderArgs = new Object[] { clipTypeId };

		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_BY_CLIPTYPEID,
				finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_CLIP_WHERE);

			if (clipTypeId == null) {
				query.append(_FINDER_COLUMN_CLIPTYPEID_CLIPTYPEID_1);
			}
			else {
				if (clipTypeId.equals(StringPool.BLANK)) {
					query.append(_FINDER_COLUMN_CLIPTYPEID_CLIPTYPEID_3);
				}
				else {
					query.append(_FINDER_COLUMN_CLIPTYPEID_CLIPTYPEID_2);
				}
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (clipTypeId != null) {
					qPos.add(clipTypeId);
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

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_CLIPTYPEID,
					finderArgs, count);

				closeSession(session);
			}
		}

		return count.intValue();
	}

	/**
	 * Counts all the clips.
	 *
	 * @return the number of clips
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

				Query q = session.createQuery(_SQL_COUNT_CLIP);

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
	 * Initializes the clip persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.com.vportal.portlet.vclip.model.Clip")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<Clip>> listenersList = new ArrayList<ModelListener<Clip>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<Clip>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(ClipImpl.class.getName());
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
	private static final String _SQL_SELECT_CLIP = "SELECT clip FROM Clip clip";
	private static final String _SQL_SELECT_CLIP_WHERE = "SELECT clip FROM Clip clip WHERE ";
	private static final String _SQL_COUNT_CLIP = "SELECT COUNT(clip) FROM Clip clip";
	private static final String _SQL_COUNT_CLIP_WHERE = "SELECT COUNT(clip) FROM Clip clip WHERE ";
	private static final String _FINDER_COLUMN_LANGUAGE_LANGUAGE_1 = "clip.language IS NULL AND ";
	private static final String _FINDER_COLUMN_LANGUAGE_LANGUAGE_2 = "clip.language = ? AND ";
	private static final String _FINDER_COLUMN_LANGUAGE_LANGUAGE_3 = "(clip.language IS NULL OR clip.language = ?) AND ";
	private static final String _FINDER_COLUMN_LANGUAGE_ACTIVE_2 = "clip.active = ?";
	private static final String _FINDER_COLUMN_CLIPTYPEID_CLIPTYPEID_1 = "clip.clipTypeId IS NULL";
	private static final String _FINDER_COLUMN_CLIPTYPEID_CLIPTYPEID_2 = "clip.clipTypeId = ?";
	private static final String _FINDER_COLUMN_CLIPTYPEID_CLIPTYPEID_3 = "(clip.clipTypeId IS NULL OR clip.clipTypeId = ?)";
	private static final String _ORDER_BY_ENTITY_ALIAS = "clip.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No Clip exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No Clip exists with the key {";
	private static Log _log = LogFactoryUtil.getLog(ClipPersistenceImpl.class);
}