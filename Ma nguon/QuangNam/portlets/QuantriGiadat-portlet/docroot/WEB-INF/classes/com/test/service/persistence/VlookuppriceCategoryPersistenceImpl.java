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

package com.test.service.persistence;

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

import com.test.NoSuchVlookuppriceCategoryException;

import com.test.model.VlookuppriceCategory;
import com.test.model.impl.VlookuppriceCategoryImpl;
import com.test.model.impl.VlookuppriceCategoryModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The persistence implementation for the vlookupprice category service.
 *
 * <p>
 * Never modify or reference this class directly. Always use {@link VlookuppriceCategoryUtil} to access the vlookupprice category persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
 * </p>
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Long
 * @see VlookuppriceCategoryPersistence
 * @see VlookuppriceCategoryUtil
 * @generated
 */
public class VlookuppriceCategoryPersistenceImpl extends BasePersistenceImpl<VlookuppriceCategory>
	implements VlookuppriceCategoryPersistence {
	public static final String FINDER_CLASS_NAME_ENTITY = VlookuppriceCategoryImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST = FINDER_CLASS_NAME_ENTITY +
		".List";
	public static final FinderPath FINDER_PATH_FIND_BY_P_P_L = new FinderPath(VlookuppriceCategoryModelImpl.ENTITY_CACHE_ENABLED,
			VlookuppriceCategoryModelImpl.FINDER_CACHE_ENABLED,
			FINDER_CLASS_NAME_LIST, "findByP_P_L",
			new String[] {
				Long.class.getName(), String.class.getName(),
				String.class.getName(),
				
			"java.lang.Integer", "java.lang.Integer",
				"com.liferay.portal.kernel.util.OrderByComparator"
			});
	public static final FinderPath FINDER_PATH_COUNT_BY_P_P_L = new FinderPath(VlookuppriceCategoryModelImpl.ENTITY_CACHE_ENABLED,
			VlookuppriceCategoryModelImpl.FINDER_CACHE_ENABLED,
			FINDER_CLASS_NAME_LIST, "countByP_P_L",
			new String[] {
				Long.class.getName(), String.class.getName(),
				String.class.getName()
			});
	public static final FinderPath FINDER_PATH_FIND_ALL = new FinderPath(VlookuppriceCategoryModelImpl.ENTITY_CACHE_ENABLED,
			VlookuppriceCategoryModelImpl.FINDER_CACHE_ENABLED,
			FINDER_CLASS_NAME_LIST, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(VlookuppriceCategoryModelImpl.ENTITY_CACHE_ENABLED,
			VlookuppriceCategoryModelImpl.FINDER_CACHE_ENABLED,
			FINDER_CLASS_NAME_LIST, "countAll", new String[0]);

	/**
	 * Caches the vlookupprice category in the entity cache if it is enabled.
	 *
	 * @param vlookuppriceCategory the vlookupprice category to cache
	 */
	public void cacheResult(VlookuppriceCategory vlookuppriceCategory) {
		EntityCacheUtil.putResult(VlookuppriceCategoryModelImpl.ENTITY_CACHE_ENABLED,
			VlookuppriceCategoryImpl.class,
			vlookuppriceCategory.getPrimaryKey(), vlookuppriceCategory);
	}

	/**
	 * Caches the vlookupprice categories in the entity cache if it is enabled.
	 *
	 * @param vlookuppriceCategories the vlookupprice categories to cache
	 */
	public void cacheResult(List<VlookuppriceCategory> vlookuppriceCategories) {
		for (VlookuppriceCategory vlookuppriceCategory : vlookuppriceCategories) {
			if (EntityCacheUtil.getResult(
						VlookuppriceCategoryModelImpl.ENTITY_CACHE_ENABLED,
						VlookuppriceCategoryImpl.class,
						vlookuppriceCategory.getPrimaryKey(), this) == null) {
				cacheResult(vlookuppriceCategory);
			}
		}
	}

	/**
	 * Clears the cache for all vlookupprice categories.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	public void clearCache() {
		CacheRegistryUtil.clear(VlookuppriceCategoryImpl.class.getName());
		EntityCacheUtil.clearCache(VlookuppriceCategoryImpl.class.getName());
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST);
	}

	/**
	 * Clears the cache for the vlookupprice category.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	public void clearCache(VlookuppriceCategory vlookuppriceCategory) {
		EntityCacheUtil.removeResult(VlookuppriceCategoryModelImpl.ENTITY_CACHE_ENABLED,
			VlookuppriceCategoryImpl.class, vlookuppriceCategory.getPrimaryKey());
	}

	/**
	 * Creates a new vlookupprice category with the primary key. Does not add the vlookupprice category to the database.
	 *
	 * @param categoryId the primary key for the new vlookupprice category
	 * @return the new vlookupprice category
	 */
	public VlookuppriceCategory create(String categoryId) {
		VlookuppriceCategory vlookuppriceCategory = new VlookuppriceCategoryImpl();

		vlookuppriceCategory.setNew(true);
		vlookuppriceCategory.setPrimaryKey(categoryId);

		return vlookuppriceCategory;
	}

	/**
	 * Removes the vlookupprice category with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the vlookupprice category to remove
	 * @return the vlookupprice category that was removed
	 * @throws com.liferay.portal.NoSuchModelException if a vlookupprice category with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public VlookuppriceCategory remove(Serializable primaryKey)
		throws NoSuchModelException, SystemException {
		return remove((String)primaryKey);
	}

	/**
	 * Removes the vlookupprice category with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param categoryId the primary key of the vlookupprice category to remove
	 * @return the vlookupprice category that was removed
	 * @throws com.test.NoSuchVlookuppriceCategoryException if a vlookupprice category with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public VlookuppriceCategory remove(String categoryId)
		throws NoSuchVlookuppriceCategoryException, SystemException {
		Session session = null;

		try {
			session = openSession();

			VlookuppriceCategory vlookuppriceCategory = (VlookuppriceCategory)session.get(VlookuppriceCategoryImpl.class,
					categoryId);

			if (vlookuppriceCategory == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + categoryId);
				}

				throw new NoSuchVlookuppriceCategoryException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					categoryId);
			}

			return remove(vlookuppriceCategory);
		}
		catch (NoSuchVlookuppriceCategoryException nsee) {
			throw nsee;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected VlookuppriceCategory removeImpl(
		VlookuppriceCategory vlookuppriceCategory) throws SystemException {
		vlookuppriceCategory = toUnwrappedModel(vlookuppriceCategory);

		Session session = null;

		try {
			session = openSession();

			BatchSessionUtil.delete(session, vlookuppriceCategory);
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST);

		EntityCacheUtil.removeResult(VlookuppriceCategoryModelImpl.ENTITY_CACHE_ENABLED,
			VlookuppriceCategoryImpl.class, vlookuppriceCategory.getPrimaryKey());

		return vlookuppriceCategory;
	}

	public VlookuppriceCategory updateImpl(
		com.test.model.VlookuppriceCategory vlookuppriceCategory, boolean merge)
		throws SystemException {
		vlookuppriceCategory = toUnwrappedModel(vlookuppriceCategory);

		Session session = null;

		try {
			session = openSession();

			BatchSessionUtil.update(session, vlookuppriceCategory, merge);

			vlookuppriceCategory.setNew(false);
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST);

		EntityCacheUtil.putResult(VlookuppriceCategoryModelImpl.ENTITY_CACHE_ENABLED,
			VlookuppriceCategoryImpl.class,
			vlookuppriceCategory.getPrimaryKey(), vlookuppriceCategory);

		return vlookuppriceCategory;
	}

	protected VlookuppriceCategory toUnwrappedModel(
		VlookuppriceCategory vlookuppriceCategory) {
		if (vlookuppriceCategory instanceof VlookuppriceCategoryImpl) {
			return vlookuppriceCategory;
		}

		VlookuppriceCategoryImpl vlookuppriceCategoryImpl = new VlookuppriceCategoryImpl();

		vlookuppriceCategoryImpl.setNew(vlookuppriceCategory.isNew());
		vlookuppriceCategoryImpl.setPrimaryKey(vlookuppriceCategory.getPrimaryKey());

		vlookuppriceCategoryImpl.setCategoryId(vlookuppriceCategory.getCategoryId());
		vlookuppriceCategoryImpl.setGroupId(vlookuppriceCategory.getGroupId());
		vlookuppriceCategoryImpl.setCompanyId(vlookuppriceCategory.getCompanyId());
		vlookuppriceCategoryImpl.setCreatedDate(vlookuppriceCategory.getCreatedDate());
		vlookuppriceCategoryImpl.setCreatedByUser(vlookuppriceCategory.getCreatedByUser());
		vlookuppriceCategoryImpl.setModifiedDate(vlookuppriceCategory.getModifiedDate());
		vlookuppriceCategoryImpl.setModifiedByUser(vlookuppriceCategory.getModifiedByUser());
		vlookuppriceCategoryImpl.setParentId(vlookuppriceCategory.getParentId());
		vlookuppriceCategoryImpl.setName(vlookuppriceCategory.getName());
		vlookuppriceCategoryImpl.setDescription(vlookuppriceCategory.getDescription());
		vlookuppriceCategoryImpl.setLanguage(vlookuppriceCategory.getLanguage());

		return vlookuppriceCategoryImpl;
	}

	/**
	 * Finds the vlookupprice category with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the vlookupprice category to find
	 * @return the vlookupprice category
	 * @throws com.liferay.portal.NoSuchModelException if a vlookupprice category with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public VlookuppriceCategory findByPrimaryKey(Serializable primaryKey)
		throws NoSuchModelException, SystemException {
		return findByPrimaryKey((String)primaryKey);
	}

	/**
	 * Finds the vlookupprice category with the primary key or throws a {@link com.test.NoSuchVlookuppriceCategoryException} if it could not be found.
	 *
	 * @param categoryId the primary key of the vlookupprice category to find
	 * @return the vlookupprice category
	 * @throws com.test.NoSuchVlookuppriceCategoryException if a vlookupprice category with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public VlookuppriceCategory findByPrimaryKey(String categoryId)
		throws NoSuchVlookuppriceCategoryException, SystemException {
		VlookuppriceCategory vlookuppriceCategory = fetchByPrimaryKey(categoryId);

		if (vlookuppriceCategory == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + categoryId);
			}

			throw new NoSuchVlookuppriceCategoryException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				categoryId);
		}

		return vlookuppriceCategory;
	}

	/**
	 * Finds the vlookupprice category with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the vlookupprice category to find
	 * @return the vlookupprice category, or <code>null</code> if a vlookupprice category with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public VlookuppriceCategory fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		return fetchByPrimaryKey((String)primaryKey);
	}

	/**
	 * Finds the vlookupprice category with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param categoryId the primary key of the vlookupprice category to find
	 * @return the vlookupprice category, or <code>null</code> if a vlookupprice category with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public VlookuppriceCategory fetchByPrimaryKey(String categoryId)
		throws SystemException {
		VlookuppriceCategory vlookuppriceCategory = (VlookuppriceCategory)EntityCacheUtil.getResult(VlookuppriceCategoryModelImpl.ENTITY_CACHE_ENABLED,
				VlookuppriceCategoryImpl.class, categoryId, this);

		if (vlookuppriceCategory == null) {
			Session session = null;

			try {
				session = openSession();

				vlookuppriceCategory = (VlookuppriceCategory)session.get(VlookuppriceCategoryImpl.class,
						categoryId);
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (vlookuppriceCategory != null) {
					cacheResult(vlookuppriceCategory);
				}

				closeSession(session);
			}
		}

		return vlookuppriceCategory;
	}

	/**
	 * Finds all the vlookupprice categories where groupId = &#63; and parentId = &#63; and language = &#63;.
	 *
	 * @param groupId the group id to search with
	 * @param parentId the parent id to search with
	 * @param language the language to search with
	 * @return the matching vlookupprice categories
	 * @throws SystemException if a system exception occurred
	 */
	public List<VlookuppriceCategory> findByP_P_L(long groupId,
		String parentId, String language) throws SystemException {
		return findByP_P_L(groupId, parentId, language, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Finds a range of all the vlookupprice categories where groupId = &#63; and parentId = &#63; and language = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param groupId the group id to search with
	 * @param parentId the parent id to search with
	 * @param language the language to search with
	 * @param start the lower bound of the range of vlookupprice categories to return
	 * @param end the upper bound of the range of vlookupprice categories to return (not inclusive)
	 * @return the range of matching vlookupprice categories
	 * @throws SystemException if a system exception occurred
	 */
	public List<VlookuppriceCategory> findByP_P_L(long groupId,
		String parentId, String language, int start, int end)
		throws SystemException {
		return findByP_P_L(groupId, parentId, language, start, end, null);
	}

	/**
	 * Finds an ordered range of all the vlookupprice categories where groupId = &#63; and parentId = &#63; and language = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param groupId the group id to search with
	 * @param parentId the parent id to search with
	 * @param language the language to search with
	 * @param start the lower bound of the range of vlookupprice categories to return
	 * @param end the upper bound of the range of vlookupprice categories to return (not inclusive)
	 * @param orderByComparator the comparator to order the results by
	 * @return the ordered range of matching vlookupprice categories
	 * @throws SystemException if a system exception occurred
	 */
	public List<VlookuppriceCategory> findByP_P_L(long groupId,
		String parentId, String language, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		Object[] finderArgs = new Object[] {
				groupId, parentId, language,
				
				String.valueOf(start), String.valueOf(end),
				String.valueOf(orderByComparator)
			};

		List<VlookuppriceCategory> list = (List<VlookuppriceCategory>)FinderCacheUtil.getResult(FINDER_PATH_FIND_BY_P_P_L,
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

			query.append(_SQL_SELECT_VLOOKUPPRICECATEGORY_WHERE);

			query.append(_FINDER_COLUMN_P_P_L_GROUPID_2);

			if (parentId == null) {
				query.append(_FINDER_COLUMN_P_P_L_PARENTID_1);
			}
			else {
				if (parentId.equals(StringPool.BLANK)) {
					query.append(_FINDER_COLUMN_P_P_L_PARENTID_3);
				}
				else {
					query.append(_FINDER_COLUMN_P_P_L_PARENTID_2);
				}
			}

			if (language == null) {
				query.append(_FINDER_COLUMN_P_P_L_LANGUAGE_1);
			}
			else {
				if (language.equals(StringPool.BLANK)) {
					query.append(_FINDER_COLUMN_P_P_L_LANGUAGE_3);
				}
				else {
					query.append(_FINDER_COLUMN_P_P_L_LANGUAGE_2);
				}
			}

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}

			else {
				query.append(VlookuppriceCategoryModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(groupId);

				if (parentId != null) {
					qPos.add(parentId);
				}

				if (language != null) {
					qPos.add(language);
				}

				list = (List<VlookuppriceCategory>)QueryUtil.list(q,
						getDialect(), start, end);
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (list == null) {
					FinderCacheUtil.removeResult(FINDER_PATH_FIND_BY_P_P_L,
						finderArgs);
				}
				else {
					cacheResult(list);

					FinderCacheUtil.putResult(FINDER_PATH_FIND_BY_P_P_L,
						finderArgs, list);
				}

				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Finds the first vlookupprice category in the ordered set where groupId = &#63; and parentId = &#63; and language = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param groupId the group id to search with
	 * @param parentId the parent id to search with
	 * @param language the language to search with
	 * @param orderByComparator the comparator to order the set by
	 * @return the first matching vlookupprice category
	 * @throws com.test.NoSuchVlookuppriceCategoryException if a matching vlookupprice category could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public VlookuppriceCategory findByP_P_L_First(long groupId,
		String parentId, String language, OrderByComparator orderByComparator)
		throws NoSuchVlookuppriceCategoryException, SystemException {
		List<VlookuppriceCategory> list = findByP_P_L(groupId, parentId,
				language, 0, 1, orderByComparator);

		if (list.isEmpty()) {
			StringBundler msg = new StringBundler(8);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("groupId=");
			msg.append(groupId);

			msg.append(", parentId=");
			msg.append(parentId);

			msg.append(", language=");
			msg.append(language);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			throw new NoSuchVlookuppriceCategoryException(msg.toString());
		}
		else {
			return list.get(0);
		}
	}

	/**
	 * Finds the last vlookupprice category in the ordered set where groupId = &#63; and parentId = &#63; and language = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param groupId the group id to search with
	 * @param parentId the parent id to search with
	 * @param language the language to search with
	 * @param orderByComparator the comparator to order the set by
	 * @return the last matching vlookupprice category
	 * @throws com.test.NoSuchVlookuppriceCategoryException if a matching vlookupprice category could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public VlookuppriceCategory findByP_P_L_Last(long groupId, String parentId,
		String language, OrderByComparator orderByComparator)
		throws NoSuchVlookuppriceCategoryException, SystemException {
		int count = countByP_P_L(groupId, parentId, language);

		List<VlookuppriceCategory> list = findByP_P_L(groupId, parentId,
				language, count - 1, count, orderByComparator);

		if (list.isEmpty()) {
			StringBundler msg = new StringBundler(8);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("groupId=");
			msg.append(groupId);

			msg.append(", parentId=");
			msg.append(parentId);

			msg.append(", language=");
			msg.append(language);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			throw new NoSuchVlookuppriceCategoryException(msg.toString());
		}
		else {
			return list.get(0);
		}
	}

	/**
	 * Finds the vlookupprice categories before and after the current vlookupprice category in the ordered set where groupId = &#63; and parentId = &#63; and language = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param categoryId the primary key of the current vlookupprice category
	 * @param groupId the group id to search with
	 * @param parentId the parent id to search with
	 * @param language the language to search with
	 * @param orderByComparator the comparator to order the set by
	 * @return the previous, current, and next vlookupprice category
	 * @throws com.test.NoSuchVlookuppriceCategoryException if a vlookupprice category with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public VlookuppriceCategory[] findByP_P_L_PrevAndNext(String categoryId,
		long groupId, String parentId, String language,
		OrderByComparator orderByComparator)
		throws NoSuchVlookuppriceCategoryException, SystemException {
		VlookuppriceCategory vlookuppriceCategory = findByPrimaryKey(categoryId);

		Session session = null;

		try {
			session = openSession();

			VlookuppriceCategory[] array = new VlookuppriceCategoryImpl[3];

			array[0] = getByP_P_L_PrevAndNext(session, vlookuppriceCategory,
					groupId, parentId, language, orderByComparator, true);

			array[1] = vlookuppriceCategory;

			array[2] = getByP_P_L_PrevAndNext(session, vlookuppriceCategory,
					groupId, parentId, language, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected VlookuppriceCategory getByP_P_L_PrevAndNext(Session session,
		VlookuppriceCategory vlookuppriceCategory, long groupId,
		String parentId, String language, OrderByComparator orderByComparator,
		boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_VLOOKUPPRICECATEGORY_WHERE);

		query.append(_FINDER_COLUMN_P_P_L_GROUPID_2);

		if (parentId == null) {
			query.append(_FINDER_COLUMN_P_P_L_PARENTID_1);
		}
		else {
			if (parentId.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_P_P_L_PARENTID_3);
			}
			else {
				query.append(_FINDER_COLUMN_P_P_L_PARENTID_2);
			}
		}

		if (language == null) {
			query.append(_FINDER_COLUMN_P_P_L_LANGUAGE_1);
		}
		else {
			if (language.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_P_P_L_LANGUAGE_3);
			}
			else {
				query.append(_FINDER_COLUMN_P_P_L_LANGUAGE_2);
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
			query.append(VlookuppriceCategoryModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(groupId);

		if (parentId != null) {
			qPos.add(parentId);
		}

		if (language != null) {
			qPos.add(language);
		}

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByValues(vlookuppriceCategory);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<VlookuppriceCategory> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Finds all the vlookupprice categories.
	 *
	 * @return the vlookupprice categories
	 * @throws SystemException if a system exception occurred
	 */
	public List<VlookuppriceCategory> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Finds a range of all the vlookupprice categories.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param start the lower bound of the range of vlookupprice categories to return
	 * @param end the upper bound of the range of vlookupprice categories to return (not inclusive)
	 * @return the range of vlookupprice categories
	 * @throws SystemException if a system exception occurred
	 */
	public List<VlookuppriceCategory> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Finds an ordered range of all the vlookupprice categories.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param start the lower bound of the range of vlookupprice categories to return
	 * @param end the upper bound of the range of vlookupprice categories to return (not inclusive)
	 * @param orderByComparator the comparator to order the results by
	 * @return the ordered range of vlookupprice categories
	 * @throws SystemException if a system exception occurred
	 */
	public List<VlookuppriceCategory> findAll(int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		Object[] finderArgs = new Object[] {
				String.valueOf(start), String.valueOf(end),
				String.valueOf(orderByComparator)
			};

		List<VlookuppriceCategory> list = (List<VlookuppriceCategory>)FinderCacheUtil.getResult(FINDER_PATH_FIND_ALL,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_VLOOKUPPRICECATEGORY);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_VLOOKUPPRICECATEGORY.concat(VlookuppriceCategoryModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (orderByComparator == null) {
					list = (List<VlookuppriceCategory>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);
				}
				else {
					list = (List<VlookuppriceCategory>)QueryUtil.list(q,
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
	 * Removes all the vlookupprice categories where groupId = &#63; and parentId = &#63; and language = &#63; from the database.
	 *
	 * @param groupId the group id to search with
	 * @param parentId the parent id to search with
	 * @param language the language to search with
	 * @throws SystemException if a system exception occurred
	 */
	public void removeByP_P_L(long groupId, String parentId, String language)
		throws SystemException {
		for (VlookuppriceCategory vlookuppriceCategory : findByP_P_L(groupId,
				parentId, language)) {
			remove(vlookuppriceCategory);
		}
	}

	/**
	 * Removes all the vlookupprice categories from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	public void removeAll() throws SystemException {
		for (VlookuppriceCategory vlookuppriceCategory : findAll()) {
			remove(vlookuppriceCategory);
		}
	}

	/**
	 * Counts all the vlookupprice categories where groupId = &#63; and parentId = &#63; and language = &#63;.
	 *
	 * @param groupId the group id to search with
	 * @param parentId the parent id to search with
	 * @param language the language to search with
	 * @return the number of matching vlookupprice categories
	 * @throws SystemException if a system exception occurred
	 */
	public int countByP_P_L(long groupId, String parentId, String language)
		throws SystemException {
		Object[] finderArgs = new Object[] { groupId, parentId, language };

		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_BY_P_P_L,
				finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(4);

			query.append(_SQL_COUNT_VLOOKUPPRICECATEGORY_WHERE);

			query.append(_FINDER_COLUMN_P_P_L_GROUPID_2);

			if (parentId == null) {
				query.append(_FINDER_COLUMN_P_P_L_PARENTID_1);
			}
			else {
				if (parentId.equals(StringPool.BLANK)) {
					query.append(_FINDER_COLUMN_P_P_L_PARENTID_3);
				}
				else {
					query.append(_FINDER_COLUMN_P_P_L_PARENTID_2);
				}
			}

			if (language == null) {
				query.append(_FINDER_COLUMN_P_P_L_LANGUAGE_1);
			}
			else {
				if (language.equals(StringPool.BLANK)) {
					query.append(_FINDER_COLUMN_P_P_L_LANGUAGE_3);
				}
				else {
					query.append(_FINDER_COLUMN_P_P_L_LANGUAGE_2);
				}
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(groupId);

				if (parentId != null) {
					qPos.add(parentId);
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

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_P_P_L,
					finderArgs, count);

				closeSession(session);
			}
		}

		return count.intValue();
	}

	/**
	 * Counts all the vlookupprice categories.
	 *
	 * @return the number of vlookupprice categories
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

				Query q = session.createQuery(_SQL_COUNT_VLOOKUPPRICECATEGORY);

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
	 * Initializes the vlookupprice category persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.com.test.model.VlookuppriceCategory")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<VlookuppriceCategory>> listenersList = new ArrayList<ModelListener<VlookuppriceCategory>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<VlookuppriceCategory>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(VlookuppriceCategoryImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST);
	}

	@BeanReference(type = VlookuppriceCategoryPersistence.class)
	protected VlookuppriceCategoryPersistence vlookuppriceCategoryPersistence;
	@BeanReference(type = VlookuppricePersistence.class)
	protected VlookuppricePersistence vlookuppricePersistence;
	@BeanReference(type = ResourcePersistence.class)
	protected ResourcePersistence resourcePersistence;
	@BeanReference(type = UserPersistence.class)
	protected UserPersistence userPersistence;
	private static final String _SQL_SELECT_VLOOKUPPRICECATEGORY = "SELECT vlookuppriceCategory FROM VlookuppriceCategory vlookuppriceCategory";
	private static final String _SQL_SELECT_VLOOKUPPRICECATEGORY_WHERE = "SELECT vlookuppriceCategory FROM VlookuppriceCategory vlookuppriceCategory WHERE ";
	private static final String _SQL_COUNT_VLOOKUPPRICECATEGORY = "SELECT COUNT(vlookuppriceCategory) FROM VlookuppriceCategory vlookuppriceCategory";
	private static final String _SQL_COUNT_VLOOKUPPRICECATEGORY_WHERE = "SELECT COUNT(vlookuppriceCategory) FROM VlookuppriceCategory vlookuppriceCategory WHERE ";
	private static final String _FINDER_COLUMN_P_P_L_GROUPID_2 = "vlookuppriceCategory.groupId = ? AND ";
	private static final String _FINDER_COLUMN_P_P_L_PARENTID_1 = "vlookuppriceCategory.parentId IS NULL AND ";
	private static final String _FINDER_COLUMN_P_P_L_PARENTID_2 = "vlookuppriceCategory.parentId = ? AND ";
	private static final String _FINDER_COLUMN_P_P_L_PARENTID_3 = "(vlookuppriceCategory.parentId IS NULL OR vlookuppriceCategory.parentId = ?) AND ";
	private static final String _FINDER_COLUMN_P_P_L_LANGUAGE_1 = "vlookuppriceCategory.language IS NULL";
	private static final String _FINDER_COLUMN_P_P_L_LANGUAGE_2 = "vlookuppriceCategory.language = ?";
	private static final String _FINDER_COLUMN_P_P_L_LANGUAGE_3 = "(vlookuppriceCategory.language IS NULL OR vlookuppriceCategory.language = ?)";
	private static final String _ORDER_BY_ENTITY_ALIAS = "vlookuppriceCategory.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No VlookuppriceCategory exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No VlookuppriceCategory exists with the key {";
	private static Log _log = LogFactoryUtil.getLog(VlookuppriceCategoryPersistenceImpl.class);
}