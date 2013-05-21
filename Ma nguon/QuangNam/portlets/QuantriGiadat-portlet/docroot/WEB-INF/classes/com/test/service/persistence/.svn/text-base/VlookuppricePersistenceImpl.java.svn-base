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

import com.test.NoSuchVlookuppriceException;

import com.test.model.Vlookupprice;
import com.test.model.impl.VlookuppriceImpl;
import com.test.model.impl.VlookuppriceModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The persistence implementation for the vlookupprice service.
 *
 * <p>
 * Never modify or reference this class directly. Always use {@link VlookuppriceUtil} to access the vlookupprice persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
 * </p>
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Long
 * @see VlookuppricePersistence
 * @see VlookuppriceUtil
 * @generated
 */
public class VlookuppricePersistenceImpl extends BasePersistenceImpl<Vlookupprice>
	implements VlookuppricePersistence {
	public static final String FINDER_CLASS_NAME_ENTITY = VlookuppriceImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST = FINDER_CLASS_NAME_ENTITY +
		".List";
	public static final FinderPath FINDER_PATH_FIND_BY_G_L_S_P = new FinderPath(VlookuppriceModelImpl.ENTITY_CACHE_ENABLED,
			VlookuppriceModelImpl.FINDER_CACHE_ENABLED, FINDER_CLASS_NAME_LIST,
			"findByG_L_S_P",
			new String[] {
				Long.class.getName(), String.class.getName(),
				Integer.class.getName(), String.class.getName(),
				
			"java.lang.Integer", "java.lang.Integer",
				"com.liferay.portal.kernel.util.OrderByComparator"
			});
	public static final FinderPath FINDER_PATH_COUNT_BY_G_L_S_P = new FinderPath(VlookuppriceModelImpl.ENTITY_CACHE_ENABLED,
			VlookuppriceModelImpl.FINDER_CACHE_ENABLED, FINDER_CLASS_NAME_LIST,
			"countByG_L_S_P",
			new String[] {
				Long.class.getName(), String.class.getName(),
				Integer.class.getName(), String.class.getName()
			});
	public static final FinderPath FINDER_PATH_FIND_BY_S_P = new FinderPath(VlookuppriceModelImpl.ENTITY_CACHE_ENABLED,
			VlookuppriceModelImpl.FINDER_CACHE_ENABLED, FINDER_CLASS_NAME_LIST,
			"findByS_P",
			new String[] {
				Integer.class.getName(), String.class.getName(),
				
			"java.lang.Integer", "java.lang.Integer",
				"com.liferay.portal.kernel.util.OrderByComparator"
			});
	public static final FinderPath FINDER_PATH_COUNT_BY_S_P = new FinderPath(VlookuppriceModelImpl.ENTITY_CACHE_ENABLED,
			VlookuppriceModelImpl.FINDER_CACHE_ENABLED, FINDER_CLASS_NAME_LIST,
			"countByS_P",
			new String[] { Integer.class.getName(), String.class.getName() });
	public static final FinderPath FINDER_PATH_FIND_ALL = new FinderPath(VlookuppriceModelImpl.ENTITY_CACHE_ENABLED,
			VlookuppriceModelImpl.FINDER_CACHE_ENABLED, FINDER_CLASS_NAME_LIST,
			"findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(VlookuppriceModelImpl.ENTITY_CACHE_ENABLED,
			VlookuppriceModelImpl.FINDER_CACHE_ENABLED, FINDER_CLASS_NAME_LIST,
			"countAll", new String[0]);

	/**
	 * Caches the vlookupprice in the entity cache if it is enabled.
	 *
	 * @param vlookupprice the vlookupprice to cache
	 */
	public void cacheResult(Vlookupprice vlookupprice) {
		EntityCacheUtil.putResult(VlookuppriceModelImpl.ENTITY_CACHE_ENABLED,
			VlookuppriceImpl.class, vlookupprice.getPrimaryKey(), vlookupprice);
	}

	/**
	 * Caches the vlookupprices in the entity cache if it is enabled.
	 *
	 * @param vlookupprices the vlookupprices to cache
	 */
	public void cacheResult(List<Vlookupprice> vlookupprices) {
		for (Vlookupprice vlookupprice : vlookupprices) {
			if (EntityCacheUtil.getResult(
						VlookuppriceModelImpl.ENTITY_CACHE_ENABLED,
						VlookuppriceImpl.class, vlookupprice.getPrimaryKey(),
						this) == null) {
				cacheResult(vlookupprice);
			}
		}
	}

	/**
	 * Clears the cache for all vlookupprices.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	public void clearCache() {
		CacheRegistryUtil.clear(VlookuppriceImpl.class.getName());
		EntityCacheUtil.clearCache(VlookuppriceImpl.class.getName());
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST);
	}

	/**
	 * Clears the cache for the vlookupprice.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	public void clearCache(Vlookupprice vlookupprice) {
		EntityCacheUtil.removeResult(VlookuppriceModelImpl.ENTITY_CACHE_ENABLED,
			VlookuppriceImpl.class, vlookupprice.getPrimaryKey());
	}

	/**
	 * Creates a new vlookupprice with the primary key. Does not add the vlookupprice to the database.
	 *
	 * @param lookuppriceId the primary key for the new vlookupprice
	 * @return the new vlookupprice
	 */
	public Vlookupprice create(String lookuppriceId) {
		Vlookupprice vlookupprice = new VlookuppriceImpl();

		vlookupprice.setNew(true);
		vlookupprice.setPrimaryKey(lookuppriceId);

		return vlookupprice;
	}

	/**
	 * Removes the vlookupprice with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the vlookupprice to remove
	 * @return the vlookupprice that was removed
	 * @throws com.liferay.portal.NoSuchModelException if a vlookupprice with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public Vlookupprice remove(Serializable primaryKey)
		throws NoSuchModelException, SystemException {
		return remove((String)primaryKey);
	}

	/**
	 * Removes the vlookupprice with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param lookuppriceId the primary key of the vlookupprice to remove
	 * @return the vlookupprice that was removed
	 * @throws com.test.NoSuchVlookuppriceException if a vlookupprice with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public Vlookupprice remove(String lookuppriceId)
		throws NoSuchVlookuppriceException, SystemException {
		Session session = null;

		try {
			session = openSession();

			Vlookupprice vlookupprice = (Vlookupprice)session.get(VlookuppriceImpl.class,
					lookuppriceId);

			if (vlookupprice == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + lookuppriceId);
				}

				throw new NoSuchVlookuppriceException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					lookuppriceId);
			}

			return remove(vlookupprice);
		}
		catch (NoSuchVlookuppriceException nsee) {
			throw nsee;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected Vlookupprice removeImpl(Vlookupprice vlookupprice)
		throws SystemException {
		vlookupprice = toUnwrappedModel(vlookupprice);

		Session session = null;

		try {
			session = openSession();

			BatchSessionUtil.delete(session, vlookupprice);
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST);

		EntityCacheUtil.removeResult(VlookuppriceModelImpl.ENTITY_CACHE_ENABLED,
			VlookuppriceImpl.class, vlookupprice.getPrimaryKey());

		return vlookupprice;
	}

	public Vlookupprice updateImpl(com.test.model.Vlookupprice vlookupprice,
		boolean merge) throws SystemException {
		vlookupprice = toUnwrappedModel(vlookupprice);

		Session session = null;

		try {
			session = openSession();

			BatchSessionUtil.update(session, vlookupprice, merge);

			vlookupprice.setNew(false);
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST);

		EntityCacheUtil.putResult(VlookuppriceModelImpl.ENTITY_CACHE_ENABLED,
			VlookuppriceImpl.class, vlookupprice.getPrimaryKey(), vlookupprice);

		return vlookupprice;
	}

	protected Vlookupprice toUnwrappedModel(Vlookupprice vlookupprice) {
		if (vlookupprice instanceof VlookuppriceImpl) {
			return vlookupprice;
		}

		VlookuppriceImpl vlookuppriceImpl = new VlookuppriceImpl();

		vlookuppriceImpl.setNew(vlookupprice.isNew());
		vlookuppriceImpl.setPrimaryKey(vlookupprice.getPrimaryKey());

		vlookuppriceImpl.setLookuppriceId(vlookupprice.getLookuppriceId());
		vlookuppriceImpl.setGroupId(vlookupprice.getGroupId());
		vlookuppriceImpl.setCompanyId(vlookupprice.getCompanyId());
		vlookuppriceImpl.setCreatedByUser(vlookupprice.getCreatedByUser());
		vlookuppriceImpl.setCreatedDate(vlookupprice.getCreatedDate());
		vlookuppriceImpl.setModifiedByUser(vlookupprice.getModifiedByUser());
		vlookuppriceImpl.setModifiedDate(vlookupprice.getModifiedDate());
		vlookuppriceImpl.setStatus(vlookupprice.getStatus());
		vlookuppriceImpl.setPrice(vlookupprice.getPrice());
		vlookuppriceImpl.setPosition1(vlookupprice.getPosition1());
		vlookuppriceImpl.setPosition2(vlookupprice.getPosition2());
		vlookuppriceImpl.setPosition3(vlookupprice.getPosition3());
		vlookuppriceImpl.setPosition4(vlookupprice.getPosition4());
		vlookuppriceImpl.setPosition5(vlookupprice.getPosition5());
		vlookuppriceImpl.setTitle(vlookupprice.getTitle());
		vlookuppriceImpl.setContent(vlookupprice.getContent());
		vlookuppriceImpl.setParentId(vlookupprice.getParentId());
		vlookuppriceImpl.setLanguage(vlookupprice.getLanguage());
		vlookuppriceImpl.setListParent(vlookupprice.getListParent());

		return vlookuppriceImpl;
	}

	/**
	 * Finds the vlookupprice with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the vlookupprice to find
	 * @return the vlookupprice
	 * @throws com.liferay.portal.NoSuchModelException if a vlookupprice with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public Vlookupprice findByPrimaryKey(Serializable primaryKey)
		throws NoSuchModelException, SystemException {
		return findByPrimaryKey((String)primaryKey);
	}

	/**
	 * Finds the vlookupprice with the primary key or throws a {@link com.test.NoSuchVlookuppriceException} if it could not be found.
	 *
	 * @param lookuppriceId the primary key of the vlookupprice to find
	 * @return the vlookupprice
	 * @throws com.test.NoSuchVlookuppriceException if a vlookupprice with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public Vlookupprice findByPrimaryKey(String lookuppriceId)
		throws NoSuchVlookuppriceException, SystemException {
		Vlookupprice vlookupprice = fetchByPrimaryKey(lookuppriceId);

		if (vlookupprice == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + lookuppriceId);
			}

			throw new NoSuchVlookuppriceException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				lookuppriceId);
		}

		return vlookupprice;
	}

	/**
	 * Finds the vlookupprice with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the vlookupprice to find
	 * @return the vlookupprice, or <code>null</code> if a vlookupprice with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public Vlookupprice fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		return fetchByPrimaryKey((String)primaryKey);
	}

	/**
	 * Finds the vlookupprice with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param lookuppriceId the primary key of the vlookupprice to find
	 * @return the vlookupprice, or <code>null</code> if a vlookupprice with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public Vlookupprice fetchByPrimaryKey(String lookuppriceId)
		throws SystemException {
		Vlookupprice vlookupprice = (Vlookupprice)EntityCacheUtil.getResult(VlookuppriceModelImpl.ENTITY_CACHE_ENABLED,
				VlookuppriceImpl.class, lookuppriceId, this);

		if (vlookupprice == null) {
			Session session = null;

			try {
				session = openSession();

				vlookupprice = (Vlookupprice)session.get(VlookuppriceImpl.class,
						lookuppriceId);
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (vlookupprice != null) {
					cacheResult(vlookupprice);
				}

				closeSession(session);
			}
		}

		return vlookupprice;
	}

	/**
	 * Finds all the vlookupprices where groupId = &#63; and language = &#63; and status = &#63; and parentId = &#63;.
	 *
	 * @param groupId the group id to search with
	 * @param language the language to search with
	 * @param status the status to search with
	 * @param parentId the parent id to search with
	 * @return the matching vlookupprices
	 * @throws SystemException if a system exception occurred
	 */
	public List<Vlookupprice> findByG_L_S_P(long groupId, String language,
		int status, String parentId) throws SystemException {
		return findByG_L_S_P(groupId, language, status, parentId,
			QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Finds a range of all the vlookupprices where groupId = &#63; and language = &#63; and status = &#63; and parentId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param groupId the group id to search with
	 * @param language the language to search with
	 * @param status the status to search with
	 * @param parentId the parent id to search with
	 * @param start the lower bound of the range of vlookupprices to return
	 * @param end the upper bound of the range of vlookupprices to return (not inclusive)
	 * @return the range of matching vlookupprices
	 * @throws SystemException if a system exception occurred
	 */
	public List<Vlookupprice> findByG_L_S_P(long groupId, String language,
		int status, String parentId, int start, int end)
		throws SystemException {
		return findByG_L_S_P(groupId, language, status, parentId, start, end,
			null);
	}

	/**
	 * Finds an ordered range of all the vlookupprices where groupId = &#63; and language = &#63; and status = &#63; and parentId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param groupId the group id to search with
	 * @param language the language to search with
	 * @param status the status to search with
	 * @param parentId the parent id to search with
	 * @param start the lower bound of the range of vlookupprices to return
	 * @param end the upper bound of the range of vlookupprices to return (not inclusive)
	 * @param orderByComparator the comparator to order the results by
	 * @return the ordered range of matching vlookupprices
	 * @throws SystemException if a system exception occurred
	 */
	public List<Vlookupprice> findByG_L_S_P(long groupId, String language,
		int status, String parentId, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		Object[] finderArgs = new Object[] {
				groupId, language, status, parentId,
				
				String.valueOf(start), String.valueOf(end),
				String.valueOf(orderByComparator)
			};

		List<Vlookupprice> list = (List<Vlookupprice>)FinderCacheUtil.getResult(FINDER_PATH_FIND_BY_G_L_S_P,
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

			query.append(_SQL_SELECT_VLOOKUPPRICE_WHERE);

			query.append(_FINDER_COLUMN_G_L_S_P_GROUPID_2);

			if (language == null) {
				query.append(_FINDER_COLUMN_G_L_S_P_LANGUAGE_1);
			}
			else {
				if (language.equals(StringPool.BLANK)) {
					query.append(_FINDER_COLUMN_G_L_S_P_LANGUAGE_3);
				}
				else {
					query.append(_FINDER_COLUMN_G_L_S_P_LANGUAGE_2);
				}
			}

			query.append(_FINDER_COLUMN_G_L_S_P_STATUS_2);

			if (parentId == null) {
				query.append(_FINDER_COLUMN_G_L_S_P_PARENTID_1);
			}
			else {
				if (parentId.equals(StringPool.BLANK)) {
					query.append(_FINDER_COLUMN_G_L_S_P_PARENTID_3);
				}
				else {
					query.append(_FINDER_COLUMN_G_L_S_P_PARENTID_2);
				}
			}

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}

			else {
				query.append(VlookuppriceModelImpl.ORDER_BY_JPQL);
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

				qPos.add(status);

				if (parentId != null) {
					qPos.add(parentId);
				}

				list = (List<Vlookupprice>)QueryUtil.list(q, getDialect(),
						start, end);
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (list == null) {
					FinderCacheUtil.removeResult(FINDER_PATH_FIND_BY_G_L_S_P,
						finderArgs);
				}
				else {
					cacheResult(list);

					FinderCacheUtil.putResult(FINDER_PATH_FIND_BY_G_L_S_P,
						finderArgs, list);
				}

				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Finds the first vlookupprice in the ordered set where groupId = &#63; and language = &#63; and status = &#63; and parentId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param groupId the group id to search with
	 * @param language the language to search with
	 * @param status the status to search with
	 * @param parentId the parent id to search with
	 * @param orderByComparator the comparator to order the set by
	 * @return the first matching vlookupprice
	 * @throws com.test.NoSuchVlookuppriceException if a matching vlookupprice could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public Vlookupprice findByG_L_S_P_First(long groupId, String language,
		int status, String parentId, OrderByComparator orderByComparator)
		throws NoSuchVlookuppriceException, SystemException {
		List<Vlookupprice> list = findByG_L_S_P(groupId, language, status,
				parentId, 0, 1, orderByComparator);

		if (list.isEmpty()) {
			StringBundler msg = new StringBundler(10);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("groupId=");
			msg.append(groupId);

			msg.append(", language=");
			msg.append(language);

			msg.append(", status=");
			msg.append(status);

			msg.append(", parentId=");
			msg.append(parentId);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			throw new NoSuchVlookuppriceException(msg.toString());
		}
		else {
			return list.get(0);
		}
	}

	/**
	 * Finds the last vlookupprice in the ordered set where groupId = &#63; and language = &#63; and status = &#63; and parentId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param groupId the group id to search with
	 * @param language the language to search with
	 * @param status the status to search with
	 * @param parentId the parent id to search with
	 * @param orderByComparator the comparator to order the set by
	 * @return the last matching vlookupprice
	 * @throws com.test.NoSuchVlookuppriceException if a matching vlookupprice could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public Vlookupprice findByG_L_S_P_Last(long groupId, String language,
		int status, String parentId, OrderByComparator orderByComparator)
		throws NoSuchVlookuppriceException, SystemException {
		int count = countByG_L_S_P(groupId, language, status, parentId);

		List<Vlookupprice> list = findByG_L_S_P(groupId, language, status,
				parentId, count - 1, count, orderByComparator);

		if (list.isEmpty()) {
			StringBundler msg = new StringBundler(10);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("groupId=");
			msg.append(groupId);

			msg.append(", language=");
			msg.append(language);

			msg.append(", status=");
			msg.append(status);

			msg.append(", parentId=");
			msg.append(parentId);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			throw new NoSuchVlookuppriceException(msg.toString());
		}
		else {
			return list.get(0);
		}
	}

	/**
	 * Finds the vlookupprices before and after the current vlookupprice in the ordered set where groupId = &#63; and language = &#63; and status = &#63; and parentId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param lookuppriceId the primary key of the current vlookupprice
	 * @param groupId the group id to search with
	 * @param language the language to search with
	 * @param status the status to search with
	 * @param parentId the parent id to search with
	 * @param orderByComparator the comparator to order the set by
	 * @return the previous, current, and next vlookupprice
	 * @throws com.test.NoSuchVlookuppriceException if a vlookupprice with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public Vlookupprice[] findByG_L_S_P_PrevAndNext(String lookuppriceId,
		long groupId, String language, int status, String parentId,
		OrderByComparator orderByComparator)
		throws NoSuchVlookuppriceException, SystemException {
		Vlookupprice vlookupprice = findByPrimaryKey(lookuppriceId);

		Session session = null;

		try {
			session = openSession();

			Vlookupprice[] array = new VlookuppriceImpl[3];

			array[0] = getByG_L_S_P_PrevAndNext(session, vlookupprice, groupId,
					language, status, parentId, orderByComparator, true);

			array[1] = vlookupprice;

			array[2] = getByG_L_S_P_PrevAndNext(session, vlookupprice, groupId,
					language, status, parentId, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected Vlookupprice getByG_L_S_P_PrevAndNext(Session session,
		Vlookupprice vlookupprice, long groupId, String language, int status,
		String parentId, OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_VLOOKUPPRICE_WHERE);

		query.append(_FINDER_COLUMN_G_L_S_P_GROUPID_2);

		if (language == null) {
			query.append(_FINDER_COLUMN_G_L_S_P_LANGUAGE_1);
		}
		else {
			if (language.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_G_L_S_P_LANGUAGE_3);
			}
			else {
				query.append(_FINDER_COLUMN_G_L_S_P_LANGUAGE_2);
			}
		}

		query.append(_FINDER_COLUMN_G_L_S_P_STATUS_2);

		if (parentId == null) {
			query.append(_FINDER_COLUMN_G_L_S_P_PARENTID_1);
		}
		else {
			if (parentId.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_G_L_S_P_PARENTID_3);
			}
			else {
				query.append(_FINDER_COLUMN_G_L_S_P_PARENTID_2);
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
			query.append(VlookuppriceModelImpl.ORDER_BY_JPQL);
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

		qPos.add(status);

		if (parentId != null) {
			qPos.add(parentId);
		}

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByValues(vlookupprice);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<Vlookupprice> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Finds all the vlookupprices where status = &#63; and parentId = &#63;.
	 *
	 * @param status the status to search with
	 * @param parentId the parent id to search with
	 * @return the matching vlookupprices
	 * @throws SystemException if a system exception occurred
	 */
	public List<Vlookupprice> findByS_P(int status, String parentId)
		throws SystemException {
		return findByS_P(status, parentId, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Finds a range of all the vlookupprices where status = &#63; and parentId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param status the status to search with
	 * @param parentId the parent id to search with
	 * @param start the lower bound of the range of vlookupprices to return
	 * @param end the upper bound of the range of vlookupprices to return (not inclusive)
	 * @return the range of matching vlookupprices
	 * @throws SystemException if a system exception occurred
	 */
	public List<Vlookupprice> findByS_P(int status, String parentId, int start,
		int end) throws SystemException {
		return findByS_P(status, parentId, start, end, null);
	}

	/**
	 * Finds an ordered range of all the vlookupprices where status = &#63; and parentId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param status the status to search with
	 * @param parentId the parent id to search with
	 * @param start the lower bound of the range of vlookupprices to return
	 * @param end the upper bound of the range of vlookupprices to return (not inclusive)
	 * @param orderByComparator the comparator to order the results by
	 * @return the ordered range of matching vlookupprices
	 * @throws SystemException if a system exception occurred
	 */
	public List<Vlookupprice> findByS_P(int status, String parentId, int start,
		int end, OrderByComparator orderByComparator) throws SystemException {
		Object[] finderArgs = new Object[] {
				status, parentId,
				
				String.valueOf(start), String.valueOf(end),
				String.valueOf(orderByComparator)
			};

		List<Vlookupprice> list = (List<Vlookupprice>)FinderCacheUtil.getResult(FINDER_PATH_FIND_BY_S_P,
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

			query.append(_SQL_SELECT_VLOOKUPPRICE_WHERE);

			query.append(_FINDER_COLUMN_S_P_STATUS_2);

			if (parentId == null) {
				query.append(_FINDER_COLUMN_S_P_PARENTID_1);
			}
			else {
				if (parentId.equals(StringPool.BLANK)) {
					query.append(_FINDER_COLUMN_S_P_PARENTID_3);
				}
				else {
					query.append(_FINDER_COLUMN_S_P_PARENTID_2);
				}
			}

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}

			else {
				query.append(VlookuppriceModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(status);

				if (parentId != null) {
					qPos.add(parentId);
				}

				list = (List<Vlookupprice>)QueryUtil.list(q, getDialect(),
						start, end);
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (list == null) {
					FinderCacheUtil.removeResult(FINDER_PATH_FIND_BY_S_P,
						finderArgs);
				}
				else {
					cacheResult(list);

					FinderCacheUtil.putResult(FINDER_PATH_FIND_BY_S_P,
						finderArgs, list);
				}

				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Finds the first vlookupprice in the ordered set where status = &#63; and parentId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param status the status to search with
	 * @param parentId the parent id to search with
	 * @param orderByComparator the comparator to order the set by
	 * @return the first matching vlookupprice
	 * @throws com.test.NoSuchVlookuppriceException if a matching vlookupprice could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public Vlookupprice findByS_P_First(int status, String parentId,
		OrderByComparator orderByComparator)
		throws NoSuchVlookuppriceException, SystemException {
		List<Vlookupprice> list = findByS_P(status, parentId, 0, 1,
				orderByComparator);

		if (list.isEmpty()) {
			StringBundler msg = new StringBundler(6);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("status=");
			msg.append(status);

			msg.append(", parentId=");
			msg.append(parentId);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			throw new NoSuchVlookuppriceException(msg.toString());
		}
		else {
			return list.get(0);
		}
	}

	/**
	 * Finds the last vlookupprice in the ordered set where status = &#63; and parentId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param status the status to search with
	 * @param parentId the parent id to search with
	 * @param orderByComparator the comparator to order the set by
	 * @return the last matching vlookupprice
	 * @throws com.test.NoSuchVlookuppriceException if a matching vlookupprice could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public Vlookupprice findByS_P_Last(int status, String parentId,
		OrderByComparator orderByComparator)
		throws NoSuchVlookuppriceException, SystemException {
		int count = countByS_P(status, parentId);

		List<Vlookupprice> list = findByS_P(status, parentId, count - 1, count,
				orderByComparator);

		if (list.isEmpty()) {
			StringBundler msg = new StringBundler(6);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("status=");
			msg.append(status);

			msg.append(", parentId=");
			msg.append(parentId);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			throw new NoSuchVlookuppriceException(msg.toString());
		}
		else {
			return list.get(0);
		}
	}

	/**
	 * Finds the vlookupprices before and after the current vlookupprice in the ordered set where status = &#63; and parentId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param lookuppriceId the primary key of the current vlookupprice
	 * @param status the status to search with
	 * @param parentId the parent id to search with
	 * @param orderByComparator the comparator to order the set by
	 * @return the previous, current, and next vlookupprice
	 * @throws com.test.NoSuchVlookuppriceException if a vlookupprice with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public Vlookupprice[] findByS_P_PrevAndNext(String lookuppriceId,
		int status, String parentId, OrderByComparator orderByComparator)
		throws NoSuchVlookuppriceException, SystemException {
		Vlookupprice vlookupprice = findByPrimaryKey(lookuppriceId);

		Session session = null;

		try {
			session = openSession();

			Vlookupprice[] array = new VlookuppriceImpl[3];

			array[0] = getByS_P_PrevAndNext(session, vlookupprice, status,
					parentId, orderByComparator, true);

			array[1] = vlookupprice;

			array[2] = getByS_P_PrevAndNext(session, vlookupprice, status,
					parentId, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected Vlookupprice getByS_P_PrevAndNext(Session session,
		Vlookupprice vlookupprice, int status, String parentId,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_VLOOKUPPRICE_WHERE);

		query.append(_FINDER_COLUMN_S_P_STATUS_2);

		if (parentId == null) {
			query.append(_FINDER_COLUMN_S_P_PARENTID_1);
		}
		else {
			if (parentId.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_S_P_PARENTID_3);
			}
			else {
				query.append(_FINDER_COLUMN_S_P_PARENTID_2);
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
			query.append(VlookuppriceModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(status);

		if (parentId != null) {
			qPos.add(parentId);
		}

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByValues(vlookupprice);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<Vlookupprice> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Finds all the vlookupprices.
	 *
	 * @return the vlookupprices
	 * @throws SystemException if a system exception occurred
	 */
	public List<Vlookupprice> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Finds a range of all the vlookupprices.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param start the lower bound of the range of vlookupprices to return
	 * @param end the upper bound of the range of vlookupprices to return (not inclusive)
	 * @return the range of vlookupprices
	 * @throws SystemException if a system exception occurred
	 */
	public List<Vlookupprice> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Finds an ordered range of all the vlookupprices.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param start the lower bound of the range of vlookupprices to return
	 * @param end the upper bound of the range of vlookupprices to return (not inclusive)
	 * @param orderByComparator the comparator to order the results by
	 * @return the ordered range of vlookupprices
	 * @throws SystemException if a system exception occurred
	 */
	public List<Vlookupprice> findAll(int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		Object[] finderArgs = new Object[] {
				String.valueOf(start), String.valueOf(end),
				String.valueOf(orderByComparator)
			};

		List<Vlookupprice> list = (List<Vlookupprice>)FinderCacheUtil.getResult(FINDER_PATH_FIND_ALL,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_VLOOKUPPRICE);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_VLOOKUPPRICE.concat(VlookuppriceModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (orderByComparator == null) {
					list = (List<Vlookupprice>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);
				}
				else {
					list = (List<Vlookupprice>)QueryUtil.list(q, getDialect(),
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
	 * Removes all the vlookupprices where groupId = &#63; and language = &#63; and status = &#63; and parentId = &#63; from the database.
	 *
	 * @param groupId the group id to search with
	 * @param language the language to search with
	 * @param status the status to search with
	 * @param parentId the parent id to search with
	 * @throws SystemException if a system exception occurred
	 */
	public void removeByG_L_S_P(long groupId, String language, int status,
		String parentId) throws SystemException {
		for (Vlookupprice vlookupprice : findByG_L_S_P(groupId, language,
				status, parentId)) {
			remove(vlookupprice);
		}
	}

	/**
	 * Removes all the vlookupprices where status = &#63; and parentId = &#63; from the database.
	 *
	 * @param status the status to search with
	 * @param parentId the parent id to search with
	 * @throws SystemException if a system exception occurred
	 */
	public void removeByS_P(int status, String parentId)
		throws SystemException {
		for (Vlookupprice vlookupprice : findByS_P(status, parentId)) {
			remove(vlookupprice);
		}
	}

	/**
	 * Removes all the vlookupprices from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	public void removeAll() throws SystemException {
		for (Vlookupprice vlookupprice : findAll()) {
			remove(vlookupprice);
		}
	}

	/**
	 * Counts all the vlookupprices where groupId = &#63; and language = &#63; and status = &#63; and parentId = &#63;.
	 *
	 * @param groupId the group id to search with
	 * @param language the language to search with
	 * @param status the status to search with
	 * @param parentId the parent id to search with
	 * @return the number of matching vlookupprices
	 * @throws SystemException if a system exception occurred
	 */
	public int countByG_L_S_P(long groupId, String language, int status,
		String parentId) throws SystemException {
		Object[] finderArgs = new Object[] { groupId, language, status, parentId };

		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_BY_G_L_S_P,
				finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(5);

			query.append(_SQL_COUNT_VLOOKUPPRICE_WHERE);

			query.append(_FINDER_COLUMN_G_L_S_P_GROUPID_2);

			if (language == null) {
				query.append(_FINDER_COLUMN_G_L_S_P_LANGUAGE_1);
			}
			else {
				if (language.equals(StringPool.BLANK)) {
					query.append(_FINDER_COLUMN_G_L_S_P_LANGUAGE_3);
				}
				else {
					query.append(_FINDER_COLUMN_G_L_S_P_LANGUAGE_2);
				}
			}

			query.append(_FINDER_COLUMN_G_L_S_P_STATUS_2);

			if (parentId == null) {
				query.append(_FINDER_COLUMN_G_L_S_P_PARENTID_1);
			}
			else {
				if (parentId.equals(StringPool.BLANK)) {
					query.append(_FINDER_COLUMN_G_L_S_P_PARENTID_3);
				}
				else {
					query.append(_FINDER_COLUMN_G_L_S_P_PARENTID_2);
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

				qPos.add(status);

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

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_G_L_S_P,
					finderArgs, count);

				closeSession(session);
			}
		}

		return count.intValue();
	}

	/**
	 * Counts all the vlookupprices where status = &#63; and parentId = &#63;.
	 *
	 * @param status the status to search with
	 * @param parentId the parent id to search with
	 * @return the number of matching vlookupprices
	 * @throws SystemException if a system exception occurred
	 */
	public int countByS_P(int status, String parentId)
		throws SystemException {
		Object[] finderArgs = new Object[] { status, parentId };

		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_BY_S_P,
				finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_VLOOKUPPRICE_WHERE);

			query.append(_FINDER_COLUMN_S_P_STATUS_2);

			if (parentId == null) {
				query.append(_FINDER_COLUMN_S_P_PARENTID_1);
			}
			else {
				if (parentId.equals(StringPool.BLANK)) {
					query.append(_FINDER_COLUMN_S_P_PARENTID_3);
				}
				else {
					query.append(_FINDER_COLUMN_S_P_PARENTID_2);
				}
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(status);

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

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_S_P, finderArgs,
					count);

				closeSession(session);
			}
		}

		return count.intValue();
	}

	/**
	 * Counts all the vlookupprices.
	 *
	 * @return the number of vlookupprices
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

				Query q = session.createQuery(_SQL_COUNT_VLOOKUPPRICE);

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
	 * Initializes the vlookupprice persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.com.test.model.Vlookupprice")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<Vlookupprice>> listenersList = new ArrayList<ModelListener<Vlookupprice>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<Vlookupprice>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(VlookuppriceImpl.class.getName());
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
	private static final String _SQL_SELECT_VLOOKUPPRICE = "SELECT vlookupprice FROM Vlookupprice vlookupprice";
	private static final String _SQL_SELECT_VLOOKUPPRICE_WHERE = "SELECT vlookupprice FROM Vlookupprice vlookupprice WHERE ";
	private static final String _SQL_COUNT_VLOOKUPPRICE = "SELECT COUNT(vlookupprice) FROM Vlookupprice vlookupprice";
	private static final String _SQL_COUNT_VLOOKUPPRICE_WHERE = "SELECT COUNT(vlookupprice) FROM Vlookupprice vlookupprice WHERE ";
	private static final String _FINDER_COLUMN_G_L_S_P_GROUPID_2 = "vlookupprice.groupId = ? AND ";
	private static final String _FINDER_COLUMN_G_L_S_P_LANGUAGE_1 = "vlookupprice.language IS NULL AND ";
	private static final String _FINDER_COLUMN_G_L_S_P_LANGUAGE_2 = "vlookupprice.language = ? AND ";
	private static final String _FINDER_COLUMN_G_L_S_P_LANGUAGE_3 = "(vlookupprice.language IS NULL OR vlookupprice.language = ?) AND ";
	private static final String _FINDER_COLUMN_G_L_S_P_STATUS_2 = "vlookupprice.status = ? AND ";
	private static final String _FINDER_COLUMN_G_L_S_P_PARENTID_1 = "vlookupprice.parentId IS NULL";
	private static final String _FINDER_COLUMN_G_L_S_P_PARENTID_2 = "vlookupprice.parentId = ?";
	private static final String _FINDER_COLUMN_G_L_S_P_PARENTID_3 = "(vlookupprice.parentId IS NULL OR vlookupprice.parentId = ?)";
	private static final String _FINDER_COLUMN_S_P_STATUS_2 = "vlookupprice.status = ? AND ";
	private static final String _FINDER_COLUMN_S_P_PARENTID_1 = "vlookupprice.parentId IS NULL";
	private static final String _FINDER_COLUMN_S_P_PARENTID_2 = "vlookupprice.parentId = ?";
	private static final String _FINDER_COLUMN_S_P_PARENTID_3 = "(vlookupprice.parentId IS NULL OR vlookupprice.parentId = ?)";
	private static final String _ORDER_BY_ENTITY_ALIAS = "vlookupprice.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No Vlookupprice exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No Vlookupprice exists with the key {";
	private static Log _log = LogFactoryUtil.getLog(VlookuppricePersistenceImpl.class);
}