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

package com.vportal.portlet.vimagegallery.service.persistence;

import com.liferay.portal.NoSuchModelException;
import com.liferay.portal.kernel.annotation.BeanReference;
import com.liferay.portal.kernel.cache.CacheRegistryUtil;
import com.liferay.portal.kernel.dao.orm.EntityCacheUtil;
import com.liferay.portal.kernel.dao.orm.FinderCacheUtil;
import com.liferay.portal.kernel.dao.orm.FinderPath;
import com.liferay.portal.kernel.dao.orm.Query;
import com.liferay.portal.kernel.dao.orm.QueryPos;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.dao.orm.SQLQuery;
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
import com.liferay.portal.security.permission.InlineSQLHelperUtil;
import com.liferay.portal.service.persistence.BatchSessionUtil;
import com.liferay.portal.service.persistence.ResourcePersistence;
import com.liferay.portal.service.persistence.UserPersistence;
import com.liferay.portal.service.persistence.impl.BasePersistenceImpl;

import com.vportal.portlet.vimagegallery.NoSuchTFCategoryException;
import com.vportal.portlet.vimagegallery.model.TFCategory;
import com.vportal.portlet.vimagegallery.model.impl.TFCategoryImpl;
import com.vportal.portlet.vimagegallery.model.impl.TFCategoryModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The persistence implementation for the t f category service.
 *
 * <p>
 * Never modify or reference this class directly. Always use {@link TFCategoryUtil} to access the t f category persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
 * </p>
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author PhungNH
 * @see TFCategoryPersistence
 * @see TFCategoryUtil
 * @generated
 */
public class TFCategoryPersistenceImpl extends BasePersistenceImpl<TFCategory>
	implements TFCategoryPersistence {
	public static final String FINDER_CLASS_NAME_ENTITY = TFCategoryImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST = FINDER_CLASS_NAME_ENTITY +
		".List";
	public static final FinderPath FINDER_PATH_FIND_BY_GROUPID = new FinderPath(TFCategoryModelImpl.ENTITY_CACHE_ENABLED,
			TFCategoryModelImpl.FINDER_CACHE_ENABLED, FINDER_CLASS_NAME_LIST,
			"findByGroupId",
			new String[] {
				Long.class.getName(),
				
			"java.lang.Integer", "java.lang.Integer",
				"com.liferay.portal.kernel.util.OrderByComparator"
			});
	public static final FinderPath FINDER_PATH_COUNT_BY_GROUPID = new FinderPath(TFCategoryModelImpl.ENTITY_CACHE_ENABLED,
			TFCategoryModelImpl.FINDER_CACHE_ENABLED, FINDER_CLASS_NAME_LIST,
			"countByGroupId", new String[] { Long.class.getName() });
	public static final FinderPath FINDER_PATH_FIND_BY_COMPANYID = new FinderPath(TFCategoryModelImpl.ENTITY_CACHE_ENABLED,
			TFCategoryModelImpl.FINDER_CACHE_ENABLED, FINDER_CLASS_NAME_LIST,
			"findByCompanyId",
			new String[] {
				Long.class.getName(),
				
			"java.lang.Integer", "java.lang.Integer",
				"com.liferay.portal.kernel.util.OrderByComparator"
			});
	public static final FinderPath FINDER_PATH_COUNT_BY_COMPANYID = new FinderPath(TFCategoryModelImpl.ENTITY_CACHE_ENABLED,
			TFCategoryModelImpl.FINDER_CACHE_ENABLED, FINDER_CLASS_NAME_LIST,
			"countByCompanyId", new String[] { Long.class.getName() });
	public static final FinderPath FINDER_PATH_FIND_ALL = new FinderPath(TFCategoryModelImpl.ENTITY_CACHE_ENABLED,
			TFCategoryModelImpl.FINDER_CACHE_ENABLED, FINDER_CLASS_NAME_LIST,
			"findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(TFCategoryModelImpl.ENTITY_CACHE_ENABLED,
			TFCategoryModelImpl.FINDER_CACHE_ENABLED, FINDER_CLASS_NAME_LIST,
			"countAll", new String[0]);

	/**
	 * Caches the t f category in the entity cache if it is enabled.
	 *
	 * @param tfCategory the t f category to cache
	 */
	public void cacheResult(TFCategory tfCategory) {
		EntityCacheUtil.putResult(TFCategoryModelImpl.ENTITY_CACHE_ENABLED,
			TFCategoryImpl.class, tfCategory.getPrimaryKey(), tfCategory);
	}

	/**
	 * Caches the t f categories in the entity cache if it is enabled.
	 *
	 * @param tfCategories the t f categories to cache
	 */
	public void cacheResult(List<TFCategory> tfCategories) {
		for (TFCategory tfCategory : tfCategories) {
			if (EntityCacheUtil.getResult(
						TFCategoryModelImpl.ENTITY_CACHE_ENABLED,
						TFCategoryImpl.class, tfCategory.getPrimaryKey(), this) == null) {
				cacheResult(tfCategory);
			}
		}
	}

	/**
	 * Clears the cache for all t f categories.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	public void clearCache() {
		CacheRegistryUtil.clear(TFCategoryImpl.class.getName());
		EntityCacheUtil.clearCache(TFCategoryImpl.class.getName());
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST);
	}

	/**
	 * Clears the cache for the t f category.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	public void clearCache(TFCategory tfCategory) {
		EntityCacheUtil.removeResult(TFCategoryModelImpl.ENTITY_CACHE_ENABLED,
			TFCategoryImpl.class, tfCategory.getPrimaryKey());
	}

	/**
	 * Creates a new t f category with the primary key. Does not add the t f category to the database.
	 *
	 * @param id the primary key for the new t f category
	 * @return the new t f category
	 */
	public TFCategory create(long id) {
		TFCategory tfCategory = new TFCategoryImpl();

		tfCategory.setNew(true);
		tfCategory.setPrimaryKey(id);

		return tfCategory;
	}

	/**
	 * Removes the t f category with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the t f category to remove
	 * @return the t f category that was removed
	 * @throws com.liferay.portal.NoSuchModelException if a t f category with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public TFCategory remove(Serializable primaryKey)
		throws NoSuchModelException, SystemException {
		return remove(((Long)primaryKey).longValue());
	}

	/**
	 * Removes the t f category with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the t f category to remove
	 * @return the t f category that was removed
	 * @throws com.vportal.portlet.vimagegallery.NoSuchTFCategoryException if a t f category with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public TFCategory remove(long id)
		throws NoSuchTFCategoryException, SystemException {
		Session session = null;

		try {
			session = openSession();

			TFCategory tfCategory = (TFCategory)session.get(TFCategoryImpl.class,
					new Long(id));

			if (tfCategory == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + id);
				}

				throw new NoSuchTFCategoryException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					id);
			}

			return remove(tfCategory);
		}
		catch (NoSuchTFCategoryException nsee) {
			throw nsee;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected TFCategory removeImpl(TFCategory tfCategory)
		throws SystemException {
		tfCategory = toUnwrappedModel(tfCategory);

		Session session = null;

		try {
			session = openSession();

			BatchSessionUtil.delete(session, tfCategory);
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST);

		EntityCacheUtil.removeResult(TFCategoryModelImpl.ENTITY_CACHE_ENABLED,
			TFCategoryImpl.class, tfCategory.getPrimaryKey());

		return tfCategory;
	}

	public TFCategory updateImpl(
		com.vportal.portlet.vimagegallery.model.TFCategory tfCategory,
		boolean merge) throws SystemException {
		tfCategory = toUnwrappedModel(tfCategory);

		Session session = null;

		try {
			session = openSession();

			BatchSessionUtil.update(session, tfCategory, merge);

			tfCategory.setNew(false);
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST);

		EntityCacheUtil.putResult(TFCategoryModelImpl.ENTITY_CACHE_ENABLED,
			TFCategoryImpl.class, tfCategory.getPrimaryKey(), tfCategory);

		return tfCategory;
	}

	protected TFCategory toUnwrappedModel(TFCategory tfCategory) {
		if (tfCategory instanceof TFCategoryImpl) {
			return tfCategory;
		}

		TFCategoryImpl tfCategoryImpl = new TFCategoryImpl();

		tfCategoryImpl.setNew(tfCategory.isNew());
		tfCategoryImpl.setPrimaryKey(tfCategory.getPrimaryKey());

		tfCategoryImpl.setId(tfCategory.getId());
		tfCategoryImpl.setGroupId(tfCategory.getGroupId());
		tfCategoryImpl.setCompanyId(tfCategory.getCompanyId());
		tfCategoryImpl.setUserId(tfCategory.getUserId());
		tfCategoryImpl.setCreateDate(tfCategory.getCreateDate());
		tfCategoryImpl.setModifiedDate(tfCategory.getModifiedDate());
		tfCategoryImpl.setName(tfCategory.getName());
		tfCategoryImpl.setDescription(tfCategory.getDescription());
		tfCategoryImpl.setImage(tfCategory.getImage());

		return tfCategoryImpl;
	}

	/**
	 * Finds the t f category with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the t f category to find
	 * @return the t f category
	 * @throws com.liferay.portal.NoSuchModelException if a t f category with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public TFCategory findByPrimaryKey(Serializable primaryKey)
		throws NoSuchModelException, SystemException {
		return findByPrimaryKey(((Long)primaryKey).longValue());
	}

	/**
	 * Finds the t f category with the primary key or throws a {@link com.vportal.portlet.vimagegallery.NoSuchTFCategoryException} if it could not be found.
	 *
	 * @param id the primary key of the t f category to find
	 * @return the t f category
	 * @throws com.vportal.portlet.vimagegallery.NoSuchTFCategoryException if a t f category with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public TFCategory findByPrimaryKey(long id)
		throws NoSuchTFCategoryException, SystemException {
		TFCategory tfCategory = fetchByPrimaryKey(id);

		if (tfCategory == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + id);
			}

			throw new NoSuchTFCategoryException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				id);
		}

		return tfCategory;
	}

	/**
	 * Finds the t f category with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the t f category to find
	 * @return the t f category, or <code>null</code> if a t f category with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public TFCategory fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		return fetchByPrimaryKey(((Long)primaryKey).longValue());
	}

	/**
	 * Finds the t f category with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the t f category to find
	 * @return the t f category, or <code>null</code> if a t f category with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public TFCategory fetchByPrimaryKey(long id) throws SystemException {
		TFCategory tfCategory = (TFCategory)EntityCacheUtil.getResult(TFCategoryModelImpl.ENTITY_CACHE_ENABLED,
				TFCategoryImpl.class, id, this);

		if (tfCategory == null) {
			Session session = null;

			try {
				session = openSession();

				tfCategory = (TFCategory)session.get(TFCategoryImpl.class,
						new Long(id));
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (tfCategory != null) {
					cacheResult(tfCategory);
				}

				closeSession(session);
			}
		}

		return tfCategory;
	}

	/**
	 * Finds all the t f categories where groupId = &#63;.
	 *
	 * @param groupId the group id to search with
	 * @return the matching t f categories
	 * @throws SystemException if a system exception occurred
	 */
	public List<TFCategory> findByGroupId(long groupId)
		throws SystemException {
		return findByGroupId(groupId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Finds a range of all the t f categories where groupId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param groupId the group id to search with
	 * @param start the lower bound of the range of t f categories to return
	 * @param end the upper bound of the range of t f categories to return (not inclusive)
	 * @return the range of matching t f categories
	 * @throws SystemException if a system exception occurred
	 */
	public List<TFCategory> findByGroupId(long groupId, int start, int end)
		throws SystemException {
		return findByGroupId(groupId, start, end, null);
	}

	/**
	 * Finds an ordered range of all the t f categories where groupId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param groupId the group id to search with
	 * @param start the lower bound of the range of t f categories to return
	 * @param end the upper bound of the range of t f categories to return (not inclusive)
	 * @param orderByComparator the comparator to order the results by
	 * @return the ordered range of matching t f categories
	 * @throws SystemException if a system exception occurred
	 */
	public List<TFCategory> findByGroupId(long groupId, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		Object[] finderArgs = new Object[] {
				groupId,
				
				String.valueOf(start), String.valueOf(end),
				String.valueOf(orderByComparator)
			};

		List<TFCategory> list = (List<TFCategory>)FinderCacheUtil.getResult(FINDER_PATH_FIND_BY_GROUPID,
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

			query.append(_SQL_SELECT_TFCATEGORY_WHERE);

			query.append(_FINDER_COLUMN_GROUPID_GROUPID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}

			else {
				query.append(TFCategoryModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(groupId);

				list = (List<TFCategory>)QueryUtil.list(q, getDialect(), start,
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
	 * Finds the first t f category in the ordered set where groupId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param groupId the group id to search with
	 * @param orderByComparator the comparator to order the set by
	 * @return the first matching t f category
	 * @throws com.vportal.portlet.vimagegallery.NoSuchTFCategoryException if a matching t f category could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public TFCategory findByGroupId_First(long groupId,
		OrderByComparator orderByComparator)
		throws NoSuchTFCategoryException, SystemException {
		List<TFCategory> list = findByGroupId(groupId, 0, 1, orderByComparator);

		if (list.isEmpty()) {
			StringBundler msg = new StringBundler(4);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("groupId=");
			msg.append(groupId);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			throw new NoSuchTFCategoryException(msg.toString());
		}
		else {
			return list.get(0);
		}
	}

	/**
	 * Finds the last t f category in the ordered set where groupId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param groupId the group id to search with
	 * @param orderByComparator the comparator to order the set by
	 * @return the last matching t f category
	 * @throws com.vportal.portlet.vimagegallery.NoSuchTFCategoryException if a matching t f category could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public TFCategory findByGroupId_Last(long groupId,
		OrderByComparator orderByComparator)
		throws NoSuchTFCategoryException, SystemException {
		int count = countByGroupId(groupId);

		List<TFCategory> list = findByGroupId(groupId, count - 1, count,
				orderByComparator);

		if (list.isEmpty()) {
			StringBundler msg = new StringBundler(4);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("groupId=");
			msg.append(groupId);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			throw new NoSuchTFCategoryException(msg.toString());
		}
		else {
			return list.get(0);
		}
	}

	/**
	 * Finds the t f categories before and after the current t f category in the ordered set where groupId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param id the primary key of the current t f category
	 * @param groupId the group id to search with
	 * @param orderByComparator the comparator to order the set by
	 * @return the previous, current, and next t f category
	 * @throws com.vportal.portlet.vimagegallery.NoSuchTFCategoryException if a t f category with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public TFCategory[] findByGroupId_PrevAndNext(long id, long groupId,
		OrderByComparator orderByComparator)
		throws NoSuchTFCategoryException, SystemException {
		TFCategory tfCategory = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			TFCategory[] array = new TFCategoryImpl[3];

			array[0] = getByGroupId_PrevAndNext(session, tfCategory, groupId,
					orderByComparator, true);

			array[1] = tfCategory;

			array[2] = getByGroupId_PrevAndNext(session, tfCategory, groupId,
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

	protected TFCategory getByGroupId_PrevAndNext(Session session,
		TFCategory tfCategory, long groupId,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_TFCATEGORY_WHERE);

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
			query.append(TFCategoryModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(groupId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByValues(tfCategory);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<TFCategory> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Filters by the user's permissions and finds all the t f categories where groupId = &#63;.
	 *
	 * @param groupId the group id to search with
	 * @return the matching t f categories that the user has permission to view
	 * @throws SystemException if a system exception occurred
	 */
	public List<TFCategory> filterFindByGroupId(long groupId)
		throws SystemException {
		return filterFindByGroupId(groupId, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Filters by the user's permissions and finds a range of all the t f categories where groupId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param groupId the group id to search with
	 * @param start the lower bound of the range of t f categories to return
	 * @param end the upper bound of the range of t f categories to return (not inclusive)
	 * @return the range of matching t f categories that the user has permission to view
	 * @throws SystemException if a system exception occurred
	 */
	public List<TFCategory> filterFindByGroupId(long groupId, int start, int end)
		throws SystemException {
		return filterFindByGroupId(groupId, start, end, null);
	}

	/**
	 * Filters by the user's permissions and finds an ordered range of all the t f categories where groupId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param groupId the group id to search with
	 * @param start the lower bound of the range of t f categories to return
	 * @param end the upper bound of the range of t f categories to return (not inclusive)
	 * @param orderByComparator the comparator to order the results by
	 * @return the ordered range of matching t f categories that the user has permission to view
	 * @throws SystemException if a system exception occurred
	 */
	public List<TFCategory> filterFindByGroupId(long groupId, int start,
		int end, OrderByComparator orderByComparator) throws SystemException {
		if (!InlineSQLHelperUtil.isEnabled(groupId)) {
			return findByGroupId(groupId, start, end, orderByComparator);
		}

		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(3 +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			query = new StringBundler(3);
		}

		if (getDB().isSupportsInlineDistinct()) {
			query.append(_FILTER_SQL_SELECT_TFCATEGORY_WHERE);
		}
		else {
			query.append(_FILTER_SQL_SELECT_TFCATEGORY_NO_INLINE_DISTINCT_WHERE_1);
		}

		query.append(_FINDER_COLUMN_GROUPID_GROUPID_2);

		if (!getDB().isSupportsInlineDistinct()) {
			query.append(_FILTER_SQL_SELECT_TFCATEGORY_NO_INLINE_DISTINCT_WHERE_2);
		}

		if (orderByComparator != null) {
			if (getDB().isSupportsInlineDistinct()) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_TABLE,
					orderByComparator);
			}
		}

		else {
			if (getDB().isSupportsInlineDistinct()) {
				query.append(TFCategoryModelImpl.ORDER_BY_JPQL);
			}
			else {
				query.append(TFCategoryModelImpl.ORDER_BY_SQL);
			}
		}

		String sql = InlineSQLHelperUtil.replacePermissionCheck(query.toString(),
				TFCategory.class.getName(), _FILTER_COLUMN_PK,
				_FILTER_COLUMN_USERID, groupId);

		Session session = null;

		try {
			session = openSession();

			SQLQuery q = session.createSQLQuery(sql);

			if (getDB().isSupportsInlineDistinct()) {
				q.addEntity(_FILTER_ENTITY_ALIAS, TFCategoryImpl.class);
			}
			else {
				q.addEntity(_FILTER_ENTITY_TABLE, TFCategoryImpl.class);
			}

			QueryPos qPos = QueryPos.getInstance(q);

			qPos.add(groupId);

			return (List<TFCategory>)QueryUtil.list(q, getDialect(), start, end);
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	/**
	 * Finds all the t f categories where companyId = &#63;.
	 *
	 * @param companyId the company id to search with
	 * @return the matching t f categories
	 * @throws SystemException if a system exception occurred
	 */
	public List<TFCategory> findByCompanyId(long companyId)
		throws SystemException {
		return findByCompanyId(companyId, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
			null);
	}

	/**
	 * Finds a range of all the t f categories where companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param companyId the company id to search with
	 * @param start the lower bound of the range of t f categories to return
	 * @param end the upper bound of the range of t f categories to return (not inclusive)
	 * @return the range of matching t f categories
	 * @throws SystemException if a system exception occurred
	 */
	public List<TFCategory> findByCompanyId(long companyId, int start, int end)
		throws SystemException {
		return findByCompanyId(companyId, start, end, null);
	}

	/**
	 * Finds an ordered range of all the t f categories where companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param companyId the company id to search with
	 * @param start the lower bound of the range of t f categories to return
	 * @param end the upper bound of the range of t f categories to return (not inclusive)
	 * @param orderByComparator the comparator to order the results by
	 * @return the ordered range of matching t f categories
	 * @throws SystemException if a system exception occurred
	 */
	public List<TFCategory> findByCompanyId(long companyId, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		Object[] finderArgs = new Object[] {
				companyId,
				
				String.valueOf(start), String.valueOf(end),
				String.valueOf(orderByComparator)
			};

		List<TFCategory> list = (List<TFCategory>)FinderCacheUtil.getResult(FINDER_PATH_FIND_BY_COMPANYID,
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

			query.append(_SQL_SELECT_TFCATEGORY_WHERE);

			query.append(_FINDER_COLUMN_COMPANYID_COMPANYID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}

			else {
				query.append(TFCategoryModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(companyId);

				list = (List<TFCategory>)QueryUtil.list(q, getDialect(), start,
						end);
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (list == null) {
					FinderCacheUtil.removeResult(FINDER_PATH_FIND_BY_COMPANYID,
						finderArgs);
				}
				else {
					cacheResult(list);

					FinderCacheUtil.putResult(FINDER_PATH_FIND_BY_COMPANYID,
						finderArgs, list);
				}

				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Finds the first t f category in the ordered set where companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param companyId the company id to search with
	 * @param orderByComparator the comparator to order the set by
	 * @return the first matching t f category
	 * @throws com.vportal.portlet.vimagegallery.NoSuchTFCategoryException if a matching t f category could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public TFCategory findByCompanyId_First(long companyId,
		OrderByComparator orderByComparator)
		throws NoSuchTFCategoryException, SystemException {
		List<TFCategory> list = findByCompanyId(companyId, 0, 1,
				orderByComparator);

		if (list.isEmpty()) {
			StringBundler msg = new StringBundler(4);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("companyId=");
			msg.append(companyId);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			throw new NoSuchTFCategoryException(msg.toString());
		}
		else {
			return list.get(0);
		}
	}

	/**
	 * Finds the last t f category in the ordered set where companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param companyId the company id to search with
	 * @param orderByComparator the comparator to order the set by
	 * @return the last matching t f category
	 * @throws com.vportal.portlet.vimagegallery.NoSuchTFCategoryException if a matching t f category could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public TFCategory findByCompanyId_Last(long companyId,
		OrderByComparator orderByComparator)
		throws NoSuchTFCategoryException, SystemException {
		int count = countByCompanyId(companyId);

		List<TFCategory> list = findByCompanyId(companyId, count - 1, count,
				orderByComparator);

		if (list.isEmpty()) {
			StringBundler msg = new StringBundler(4);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("companyId=");
			msg.append(companyId);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			throw new NoSuchTFCategoryException(msg.toString());
		}
		else {
			return list.get(0);
		}
	}

	/**
	 * Finds the t f categories before and after the current t f category in the ordered set where companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param id the primary key of the current t f category
	 * @param companyId the company id to search with
	 * @param orderByComparator the comparator to order the set by
	 * @return the previous, current, and next t f category
	 * @throws com.vportal.portlet.vimagegallery.NoSuchTFCategoryException if a t f category with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public TFCategory[] findByCompanyId_PrevAndNext(long id, long companyId,
		OrderByComparator orderByComparator)
		throws NoSuchTFCategoryException, SystemException {
		TFCategory tfCategory = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			TFCategory[] array = new TFCategoryImpl[3];

			array[0] = getByCompanyId_PrevAndNext(session, tfCategory,
					companyId, orderByComparator, true);

			array[1] = tfCategory;

			array[2] = getByCompanyId_PrevAndNext(session, tfCategory,
					companyId, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected TFCategory getByCompanyId_PrevAndNext(Session session,
		TFCategory tfCategory, long companyId,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_TFCATEGORY_WHERE);

		query.append(_FINDER_COLUMN_COMPANYID_COMPANYID_2);

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
			query.append(TFCategoryModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(companyId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByValues(tfCategory);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<TFCategory> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Finds all the t f categories.
	 *
	 * @return the t f categories
	 * @throws SystemException if a system exception occurred
	 */
	public List<TFCategory> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Finds a range of all the t f categories.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param start the lower bound of the range of t f categories to return
	 * @param end the upper bound of the range of t f categories to return (not inclusive)
	 * @return the range of t f categories
	 * @throws SystemException if a system exception occurred
	 */
	public List<TFCategory> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Finds an ordered range of all the t f categories.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param start the lower bound of the range of t f categories to return
	 * @param end the upper bound of the range of t f categories to return (not inclusive)
	 * @param orderByComparator the comparator to order the results by
	 * @return the ordered range of t f categories
	 * @throws SystemException if a system exception occurred
	 */
	public List<TFCategory> findAll(int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		Object[] finderArgs = new Object[] {
				String.valueOf(start), String.valueOf(end),
				String.valueOf(orderByComparator)
			};

		List<TFCategory> list = (List<TFCategory>)FinderCacheUtil.getResult(FINDER_PATH_FIND_ALL,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_TFCATEGORY);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_TFCATEGORY.concat(TFCategoryModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (orderByComparator == null) {
					list = (List<TFCategory>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);
				}
				else {
					list = (List<TFCategory>)QueryUtil.list(q, getDialect(),
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
	 * Removes all the t f categories where groupId = &#63; from the database.
	 *
	 * @param groupId the group id to search with
	 * @throws SystemException if a system exception occurred
	 */
	public void removeByGroupId(long groupId) throws SystemException {
		for (TFCategory tfCategory : findByGroupId(groupId)) {
			remove(tfCategory);
		}
	}

	/**
	 * Removes all the t f categories where companyId = &#63; from the database.
	 *
	 * @param companyId the company id to search with
	 * @throws SystemException if a system exception occurred
	 */
	public void removeByCompanyId(long companyId) throws SystemException {
		for (TFCategory tfCategory : findByCompanyId(companyId)) {
			remove(tfCategory);
		}
	}

	/**
	 * Removes all the t f categories from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	public void removeAll() throws SystemException {
		for (TFCategory tfCategory : findAll()) {
			remove(tfCategory);
		}
	}

	/**
	 * Counts all the t f categories where groupId = &#63;.
	 *
	 * @param groupId the group id to search with
	 * @return the number of matching t f categories
	 * @throws SystemException if a system exception occurred
	 */
	public int countByGroupId(long groupId) throws SystemException {
		Object[] finderArgs = new Object[] { groupId };

		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_BY_GROUPID,
				finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_TFCATEGORY_WHERE);

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
	 * Filters by the user's permissions and counts all the t f categories where groupId = &#63;.
	 *
	 * @param groupId the group id to search with
	 * @return the number of matching t f categories that the user has permission to view
	 * @throws SystemException if a system exception occurred
	 */
	public int filterCountByGroupId(long groupId) throws SystemException {
		if (!InlineSQLHelperUtil.isEnabled(groupId)) {
			return countByGroupId(groupId);
		}

		StringBundler query = new StringBundler(2);

		query.append(_FILTER_SQL_COUNT_TFCATEGORY_WHERE);

		query.append(_FINDER_COLUMN_GROUPID_GROUPID_2);

		String sql = InlineSQLHelperUtil.replacePermissionCheck(query.toString(),
				TFCategory.class.getName(), _FILTER_COLUMN_PK,
				_FILTER_COLUMN_USERID, groupId);

		Session session = null;

		try {
			session = openSession();

			SQLQuery q = session.createSQLQuery(sql);

			q.addScalar(COUNT_COLUMN_NAME,
				com.liferay.portal.kernel.dao.orm.Type.LONG);

			QueryPos qPos = QueryPos.getInstance(q);

			qPos.add(groupId);

			Long count = (Long)q.uniqueResult();

			return count.intValue();
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	/**
	 * Counts all the t f categories where companyId = &#63;.
	 *
	 * @param companyId the company id to search with
	 * @return the number of matching t f categories
	 * @throws SystemException if a system exception occurred
	 */
	public int countByCompanyId(long companyId) throws SystemException {
		Object[] finderArgs = new Object[] { companyId };

		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_BY_COMPANYID,
				finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_TFCATEGORY_WHERE);

			query.append(_FINDER_COLUMN_COMPANYID_COMPANYID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(companyId);

				count = (Long)q.uniqueResult();
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (count == null) {
					count = Long.valueOf(0);
				}

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_COMPANYID,
					finderArgs, count);

				closeSession(session);
			}
		}

		return count.intValue();
	}

	/**
	 * Counts all the t f categories.
	 *
	 * @return the number of t f categories
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

				Query q = session.createQuery(_SQL_COUNT_TFCATEGORY);

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
	 * Initializes the t f category persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.com.vportal.portlet.vimagegallery.model.TFCategory")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<TFCategory>> listenersList = new ArrayList<ModelListener<TFCategory>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<TFCategory>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(TFCategoryImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST);
	}

	@BeanReference(type = TFCategoryPersistence.class)
	protected TFCategoryPersistence tfCategoryPersistence;
	@BeanReference(type = TFImagePersistence.class)
	protected TFImagePersistence tfImagePersistence;
	@BeanReference(type = ResourcePersistence.class)
	protected ResourcePersistence resourcePersistence;
	@BeanReference(type = UserPersistence.class)
	protected UserPersistence userPersistence;
	private static final String _SQL_SELECT_TFCATEGORY = "SELECT tfCategory FROM TFCategory tfCategory";
	private static final String _SQL_SELECT_TFCATEGORY_WHERE = "SELECT tfCategory FROM TFCategory tfCategory WHERE ";
	private static final String _SQL_COUNT_TFCATEGORY = "SELECT COUNT(tfCategory) FROM TFCategory tfCategory";
	private static final String _SQL_COUNT_TFCATEGORY_WHERE = "SELECT COUNT(tfCategory) FROM TFCategory tfCategory WHERE ";
	private static final String _FINDER_COLUMN_GROUPID_GROUPID_2 = "tfCategory.groupId = ?";
	private static final String _FINDER_COLUMN_COMPANYID_COMPANYID_2 = "tfCategory.companyId = ?";
	private static final String _FILTER_SQL_SELECT_TFCATEGORY_WHERE = "SELECT DISTINCT {tfCategory.*} FROM TFCategory tfCategory WHERE ";
	private static final String _FILTER_SQL_SELECT_TFCATEGORY_NO_INLINE_DISTINCT_WHERE_1 =
		"SELECT {TFCategory.*} FROM (SELECT DISTINCT tfCategory.id FROM TFCategory tfCategory WHERE ";
	private static final String _FILTER_SQL_SELECT_TFCATEGORY_NO_INLINE_DISTINCT_WHERE_2 =
		") TEMP_TABLE INNER JOIN TFCategory ON TEMP_TABLE.id = TFCategory.id";
	private static final String _FILTER_SQL_COUNT_TFCATEGORY_WHERE = "SELECT COUNT(DISTINCT tfCategory.id) AS COUNT_VALUE FROM TFCategory tfCategory WHERE ";
	private static final String _FILTER_COLUMN_PK = "tfCategory.id";
	private static final String _FILTER_COLUMN_USERID = "tfCategory.userId";
	private static final String _FILTER_ENTITY_ALIAS = "tfCategory";
	private static final String _FILTER_ENTITY_TABLE = "TFCategory";
	private static final String _ORDER_BY_ENTITY_ALIAS = "tfCategory.";
	private static final String _ORDER_BY_ENTITY_TABLE = "TFCategory.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No TFCategory exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No TFCategory exists with the key {";
	private static Log _log = LogFactoryUtil.getLog(TFCategoryPersistenceImpl.class);
}