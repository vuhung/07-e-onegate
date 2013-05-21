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

package com.vportal.portal.service.persistence;

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
import com.liferay.portal.kernel.util.CalendarUtil;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.InstanceFactory;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelListener;
import com.liferay.portal.service.persistence.BatchSessionUtil;
import com.liferay.portal.service.persistence.ResourcePersistence;
import com.liferay.portal.service.persistence.UserPersistence;
import com.liferay.portal.service.persistence.impl.BasePersistenceImpl;

import com.vportal.portal.NoSuchAccessCounterException;
import com.vportal.portal.model.AccessCounter;
import com.vportal.portal.model.impl.AccessCounterImpl;
import com.vportal.portal.model.impl.AccessCounterModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;

/**
 * The persistence implementation for the access counter service.
 *
 * <p>
 * Never modify or reference this class directly. Always use {@link AccessCounterUtil} to access the access counter persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
 * </p>
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author HOAN
 * @see AccessCounterPersistence
 * @see AccessCounterUtil
 * @generated
 */
public class AccessCounterPersistenceImpl extends BasePersistenceImpl<AccessCounter>
	implements AccessCounterPersistence {
	public static final String FINDER_CLASS_NAME_ENTITY = AccessCounterImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST = FINDER_CLASS_NAME_ENTITY +
		".List";
	public static final FinderPath FINDER_PATH_FETCH_BY_ACCESSDATE = new FinderPath(AccessCounterModelImpl.ENTITY_CACHE_ENABLED,
			AccessCounterModelImpl.FINDER_CACHE_ENABLED,
			FINDER_CLASS_NAME_ENTITY, "fetchByAccessDate",
			new String[] { Long.class.getName(), Date.class.getName() });
	public static final FinderPath FINDER_PATH_COUNT_BY_ACCESSDATE = new FinderPath(AccessCounterModelImpl.ENTITY_CACHE_ENABLED,
			AccessCounterModelImpl.FINDER_CACHE_ENABLED,
			FINDER_CLASS_NAME_LIST, "countByAccessDate",
			new String[] { Long.class.getName(), Date.class.getName() });
	public static final FinderPath FINDER_PATH_FIND_BY_COMPANYID = new FinderPath(AccessCounterModelImpl.ENTITY_CACHE_ENABLED,
			AccessCounterModelImpl.FINDER_CACHE_ENABLED,
			FINDER_CLASS_NAME_LIST, "findByCompanyId",
			new String[] {
				Long.class.getName(),
				
			"java.lang.Integer", "java.lang.Integer",
				"com.liferay.portal.kernel.util.OrderByComparator"
			});
	public static final FinderPath FINDER_PATH_COUNT_BY_COMPANYID = new FinderPath(AccessCounterModelImpl.ENTITY_CACHE_ENABLED,
			AccessCounterModelImpl.FINDER_CACHE_ENABLED,
			FINDER_CLASS_NAME_LIST, "countByCompanyId",
			new String[] { Long.class.getName() });
	public static final FinderPath FINDER_PATH_FIND_ALL = new FinderPath(AccessCounterModelImpl.ENTITY_CACHE_ENABLED,
			AccessCounterModelImpl.FINDER_CACHE_ENABLED,
			FINDER_CLASS_NAME_LIST, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(AccessCounterModelImpl.ENTITY_CACHE_ENABLED,
			AccessCounterModelImpl.FINDER_CACHE_ENABLED,
			FINDER_CLASS_NAME_LIST, "countAll", new String[0]);

	/**
	 * Caches the access counter in the entity cache if it is enabled.
	 *
	 * @param accessCounter the access counter to cache
	 */
	public void cacheResult(AccessCounter accessCounter) {
		EntityCacheUtil.putResult(AccessCounterModelImpl.ENTITY_CACHE_ENABLED,
			AccessCounterImpl.class, accessCounter.getPrimaryKey(),
			accessCounter);

		FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_ACCESSDATE,
			new Object[] {
				new Long(accessCounter.getCompanyId()),
				
			accessCounter.getAccessDate()
			}, accessCounter);
	}

	/**
	 * Caches the access counters in the entity cache if it is enabled.
	 *
	 * @param accessCounters the access counters to cache
	 */
	public void cacheResult(List<AccessCounter> accessCounters) {
		for (AccessCounter accessCounter : accessCounters) {
			if (EntityCacheUtil.getResult(
						AccessCounterModelImpl.ENTITY_CACHE_ENABLED,
						AccessCounterImpl.class, accessCounter.getPrimaryKey(),
						this) == null) {
				cacheResult(accessCounter);
			}
		}
	}

	/**
	 * Clears the cache for all access counters.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	public void clearCache() {
		CacheRegistryUtil.clear(AccessCounterImpl.class.getName());
		EntityCacheUtil.clearCache(AccessCounterImpl.class.getName());
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST);
	}

	/**
	 * Clears the cache for the access counter.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	public void clearCache(AccessCounter accessCounter) {
		EntityCacheUtil.removeResult(AccessCounterModelImpl.ENTITY_CACHE_ENABLED,
			AccessCounterImpl.class, accessCounter.getPrimaryKey());

		FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_ACCESSDATE,
			new Object[] {
				new Long(accessCounter.getCompanyId()),
				
			accessCounter.getAccessDate()
			});
	}

	/**
	 * Creates a new access counter with the primary key. Does not add the access counter to the database.
	 *
	 * @param id the primary key for the new access counter
	 * @return the new access counter
	 */
	public AccessCounter create(long id) {
		AccessCounter accessCounter = new AccessCounterImpl();

		accessCounter.setNew(true);
		accessCounter.setPrimaryKey(id);

		return accessCounter;
	}

	/**
	 * Removes the access counter with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the access counter to remove
	 * @return the access counter that was removed
	 * @throws com.liferay.portal.NoSuchModelException if a access counter with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public AccessCounter remove(Serializable primaryKey)
		throws NoSuchModelException, SystemException {
		return remove(((Long)primaryKey).longValue());
	}

	/**
	 * Removes the access counter with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the access counter to remove
	 * @return the access counter that was removed
	 * @throws com.vportal.portal.NoSuchAccessCounterException if a access counter with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public AccessCounter remove(long id)
		throws NoSuchAccessCounterException, SystemException {
		Session session = null;

		try {
			session = openSession();

			AccessCounter accessCounter = (AccessCounter)session.get(AccessCounterImpl.class,
					new Long(id));

			if (accessCounter == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + id);
				}

				throw new NoSuchAccessCounterException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					id);
			}

			return remove(accessCounter);
		}
		catch (NoSuchAccessCounterException nsee) {
			throw nsee;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected AccessCounter removeImpl(AccessCounter accessCounter)
		throws SystemException {
		accessCounter = toUnwrappedModel(accessCounter);

		Session session = null;

		try {
			session = openSession();

			BatchSessionUtil.delete(session, accessCounter);
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST);

		AccessCounterModelImpl accessCounterModelImpl = (AccessCounterModelImpl)accessCounter;

		FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_ACCESSDATE,
			new Object[] {
				new Long(accessCounterModelImpl.getCompanyId()),
				
			accessCounterModelImpl.getAccessDate()
			});

		EntityCacheUtil.removeResult(AccessCounterModelImpl.ENTITY_CACHE_ENABLED,
			AccessCounterImpl.class, accessCounter.getPrimaryKey());

		return accessCounter;
	}

	public AccessCounter updateImpl(
		com.vportal.portal.model.AccessCounter accessCounter, boolean merge)
		throws SystemException {
		accessCounter = toUnwrappedModel(accessCounter);

		boolean isNew = accessCounter.isNew();

		AccessCounterModelImpl accessCounterModelImpl = (AccessCounterModelImpl)accessCounter;

		Session session = null;

		try {
			session = openSession();

			BatchSessionUtil.update(session, accessCounter, merge);

			accessCounter.setNew(false);
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST);

		EntityCacheUtil.putResult(AccessCounterModelImpl.ENTITY_CACHE_ENABLED,
			AccessCounterImpl.class, accessCounter.getPrimaryKey(),
			accessCounter);

		if (!isNew &&
				((accessCounter.getCompanyId() != accessCounterModelImpl.getOriginalCompanyId()) ||
				!Validator.equals(accessCounter.getAccessDate(),
					accessCounterModelImpl.getOriginalAccessDate()))) {
			FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_ACCESSDATE,
				new Object[] {
					new Long(accessCounterModelImpl.getOriginalCompanyId()),
					
				accessCounterModelImpl.getOriginalAccessDate()
				});
		}

		if (isNew ||
				((accessCounter.getCompanyId() != accessCounterModelImpl.getOriginalCompanyId()) ||
				!Validator.equals(accessCounter.getAccessDate(),
					accessCounterModelImpl.getOriginalAccessDate()))) {
			FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_ACCESSDATE,
				new Object[] {
					new Long(accessCounter.getCompanyId()),
					
				accessCounter.getAccessDate()
				}, accessCounter);
		}

		return accessCounter;
	}

	protected AccessCounter toUnwrappedModel(AccessCounter accessCounter) {
		if (accessCounter instanceof AccessCounterImpl) {
			return accessCounter;
		}

		AccessCounterImpl accessCounterImpl = new AccessCounterImpl();

		accessCounterImpl.setNew(accessCounter.isNew());
		accessCounterImpl.setPrimaryKey(accessCounter.getPrimaryKey());

		accessCounterImpl.setId(accessCounter.getId());
		accessCounterImpl.setCompanyId(accessCounter.getCompanyId());
		accessCounterImpl.setAccessDate(accessCounter.getAccessDate());
		accessCounterImpl.setAccessCount(accessCounter.getAccessCount());

		return accessCounterImpl;
	}

	/**
	 * Finds the access counter with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the access counter to find
	 * @return the access counter
	 * @throws com.liferay.portal.NoSuchModelException if a access counter with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public AccessCounter findByPrimaryKey(Serializable primaryKey)
		throws NoSuchModelException, SystemException {
		return findByPrimaryKey(((Long)primaryKey).longValue());
	}

	/**
	 * Finds the access counter with the primary key or throws a {@link com.vportal.portal.NoSuchAccessCounterException} if it could not be found.
	 *
	 * @param id the primary key of the access counter to find
	 * @return the access counter
	 * @throws com.vportal.portal.NoSuchAccessCounterException if a access counter with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public AccessCounter findByPrimaryKey(long id)
		throws NoSuchAccessCounterException, SystemException {
		AccessCounter accessCounter = fetchByPrimaryKey(id);

		if (accessCounter == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + id);
			}

			throw new NoSuchAccessCounterException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				id);
		}

		return accessCounter;
	}

	/**
	 * Finds the access counter with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the access counter to find
	 * @return the access counter, or <code>null</code> if a access counter with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public AccessCounter fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		return fetchByPrimaryKey(((Long)primaryKey).longValue());
	}

	/**
	 * Finds the access counter with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the access counter to find
	 * @return the access counter, or <code>null</code> if a access counter with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public AccessCounter fetchByPrimaryKey(long id) throws SystemException {
		AccessCounter accessCounter = (AccessCounter)EntityCacheUtil.getResult(AccessCounterModelImpl.ENTITY_CACHE_ENABLED,
				AccessCounterImpl.class, id, this);

		if (accessCounter == null) {
			Session session = null;

			try {
				session = openSession();

				accessCounter = (AccessCounter)session.get(AccessCounterImpl.class,
						new Long(id));
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (accessCounter != null) {
					cacheResult(accessCounter);
				}

				closeSession(session);
			}
		}

		return accessCounter;
	}

	/**
	 * Finds the access counter where companyId = &#63; and accessDate = &#63; or throws a {@link com.vportal.portal.NoSuchAccessCounterException} if it could not be found.
	 *
	 * @param companyId the company id to search with
	 * @param accessDate the access date to search with
	 * @return the matching access counter
	 * @throws com.vportal.portal.NoSuchAccessCounterException if a matching access counter could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public AccessCounter findByAccessDate(long companyId, Date accessDate)
		throws NoSuchAccessCounterException, SystemException {
		AccessCounter accessCounter = fetchByAccessDate(companyId, accessDate);

		if (accessCounter == null) {
			StringBundler msg = new StringBundler(6);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("companyId=");
			msg.append(companyId);

			msg.append(", accessDate=");
			msg.append(accessDate);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			if (_log.isWarnEnabled()) {
				_log.warn(msg.toString());
			}

			throw new NoSuchAccessCounterException(msg.toString());
		}

		return accessCounter;
	}

	/**
	 * Finds the access counter where companyId = &#63; and accessDate = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param companyId the company id to search with
	 * @param accessDate the access date to search with
	 * @return the matching access counter, or <code>null</code> if a matching access counter could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public AccessCounter fetchByAccessDate(long companyId, Date accessDate)
		throws SystemException {
		return fetchByAccessDate(companyId, accessDate, true);
	}

	/**
	 * Finds the access counter where companyId = &#63; and accessDate = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param companyId the company id to search with
	 * @param accessDate the access date to search with
	 * @return the matching access counter, or <code>null</code> if a matching access counter could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public AccessCounter fetchByAccessDate(long companyId, Date accessDate,
		boolean retrieveFromCache) throws SystemException {
		Object[] finderArgs = new Object[] { companyId, accessDate };

		Object result = null;

		if (retrieveFromCache) {
			result = FinderCacheUtil.getResult(FINDER_PATH_FETCH_BY_ACCESSDATE,
					finderArgs, this);
		}

		if (result == null) {
			StringBundler query = new StringBundler(4);

			query.append(_SQL_SELECT_ACCESSCOUNTER_WHERE);

			query.append(_FINDER_COLUMN_ACCESSDATE_COMPANYID_2);

			if (accessDate == null) {
				query.append(_FINDER_COLUMN_ACCESSDATE_ACCESSDATE_1);
			}
			else {
				query.append(_FINDER_COLUMN_ACCESSDATE_ACCESSDATE_2);
			}

			query.append(AccessCounterModelImpl.ORDER_BY_JPQL);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(companyId);

				if (accessDate != null) {
					qPos.add(CalendarUtil.getTimestamp(accessDate));
				}

				List<AccessCounter> list = q.list();

				result = list;

				AccessCounter accessCounter = null;

				if (list.isEmpty()) {
					FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_ACCESSDATE,
						finderArgs, list);
				}
				else {
					accessCounter = list.get(0);

					cacheResult(accessCounter);

					if ((accessCounter.getCompanyId() != companyId) ||
							(accessCounter.getAccessDate() == null) ||
							!accessCounter.getAccessDate().equals(accessDate)) {
						FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_ACCESSDATE,
							finderArgs, accessCounter);
					}
				}

				return accessCounter;
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (result == null) {
					FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_ACCESSDATE,
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
				return (AccessCounter)result;
			}
		}
	}

	/**
	 * Finds all the access counters where companyId = &#63;.
	 *
	 * @param companyId the company id to search with
	 * @return the matching access counters
	 * @throws SystemException if a system exception occurred
	 */
	public List<AccessCounter> findByCompanyId(long companyId)
		throws SystemException {
		return findByCompanyId(companyId, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
			null);
	}

	/**
	 * Finds a range of all the access counters where companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param companyId the company id to search with
	 * @param start the lower bound of the range of access counters to return
	 * @param end the upper bound of the range of access counters to return (not inclusive)
	 * @return the range of matching access counters
	 * @throws SystemException if a system exception occurred
	 */
	public List<AccessCounter> findByCompanyId(long companyId, int start,
		int end) throws SystemException {
		return findByCompanyId(companyId, start, end, null);
	}

	/**
	 * Finds an ordered range of all the access counters where companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param companyId the company id to search with
	 * @param start the lower bound of the range of access counters to return
	 * @param end the upper bound of the range of access counters to return (not inclusive)
	 * @param orderByComparator the comparator to order the results by
	 * @return the ordered range of matching access counters
	 * @throws SystemException if a system exception occurred
	 */
	public List<AccessCounter> findByCompanyId(long companyId, int start,
		int end, OrderByComparator orderByComparator) throws SystemException {
		Object[] finderArgs = new Object[] {
				companyId,
				
				String.valueOf(start), String.valueOf(end),
				String.valueOf(orderByComparator)
			};

		List<AccessCounter> list = (List<AccessCounter>)FinderCacheUtil.getResult(FINDER_PATH_FIND_BY_COMPANYID,
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

			query.append(_SQL_SELECT_ACCESSCOUNTER_WHERE);

			query.append(_FINDER_COLUMN_COMPANYID_COMPANYID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}

			else {
				query.append(AccessCounterModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(companyId);

				list = (List<AccessCounter>)QueryUtil.list(q, getDialect(),
						start, end);
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
	 * Finds the first access counter in the ordered set where companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param companyId the company id to search with
	 * @param orderByComparator the comparator to order the set by
	 * @return the first matching access counter
	 * @throws com.vportal.portal.NoSuchAccessCounterException if a matching access counter could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public AccessCounter findByCompanyId_First(long companyId,
		OrderByComparator orderByComparator)
		throws NoSuchAccessCounterException, SystemException {
		List<AccessCounter> list = findByCompanyId(companyId, 0, 1,
				orderByComparator);

		if (list.isEmpty()) {
			StringBundler msg = new StringBundler(4);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("companyId=");
			msg.append(companyId);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			throw new NoSuchAccessCounterException(msg.toString());
		}
		else {
			return list.get(0);
		}
	}

	/**
	 * Finds the last access counter in the ordered set where companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param companyId the company id to search with
	 * @param orderByComparator the comparator to order the set by
	 * @return the last matching access counter
	 * @throws com.vportal.portal.NoSuchAccessCounterException if a matching access counter could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public AccessCounter findByCompanyId_Last(long companyId,
		OrderByComparator orderByComparator)
		throws NoSuchAccessCounterException, SystemException {
		int count = countByCompanyId(companyId);

		List<AccessCounter> list = findByCompanyId(companyId, count - 1, count,
				orderByComparator);

		if (list.isEmpty()) {
			StringBundler msg = new StringBundler(4);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("companyId=");
			msg.append(companyId);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			throw new NoSuchAccessCounterException(msg.toString());
		}
		else {
			return list.get(0);
		}
	}

	/**
	 * Finds the access counters before and after the current access counter in the ordered set where companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param id the primary key of the current access counter
	 * @param companyId the company id to search with
	 * @param orderByComparator the comparator to order the set by
	 * @return the previous, current, and next access counter
	 * @throws com.vportal.portal.NoSuchAccessCounterException if a access counter with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public AccessCounter[] findByCompanyId_PrevAndNext(long id, long companyId,
		OrderByComparator orderByComparator)
		throws NoSuchAccessCounterException, SystemException {
		AccessCounter accessCounter = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			AccessCounter[] array = new AccessCounterImpl[3];

			array[0] = getByCompanyId_PrevAndNext(session, accessCounter,
					companyId, orderByComparator, true);

			array[1] = accessCounter;

			array[2] = getByCompanyId_PrevAndNext(session, accessCounter,
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

	protected AccessCounter getByCompanyId_PrevAndNext(Session session,
		AccessCounter accessCounter, long companyId,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_ACCESSCOUNTER_WHERE);

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
			query.append(AccessCounterModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(companyId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByValues(accessCounter);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<AccessCounter> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Finds all the access counters.
	 *
	 * @return the access counters
	 * @throws SystemException if a system exception occurred
	 */
	public List<AccessCounter> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Finds a range of all the access counters.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param start the lower bound of the range of access counters to return
	 * @param end the upper bound of the range of access counters to return (not inclusive)
	 * @return the range of access counters
	 * @throws SystemException if a system exception occurred
	 */
	public List<AccessCounter> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Finds an ordered range of all the access counters.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param start the lower bound of the range of access counters to return
	 * @param end the upper bound of the range of access counters to return (not inclusive)
	 * @param orderByComparator the comparator to order the results by
	 * @return the ordered range of access counters
	 * @throws SystemException if a system exception occurred
	 */
	public List<AccessCounter> findAll(int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		Object[] finderArgs = new Object[] {
				String.valueOf(start), String.valueOf(end),
				String.valueOf(orderByComparator)
			};

		List<AccessCounter> list = (List<AccessCounter>)FinderCacheUtil.getResult(FINDER_PATH_FIND_ALL,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_ACCESSCOUNTER);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_ACCESSCOUNTER.concat(AccessCounterModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (orderByComparator == null) {
					list = (List<AccessCounter>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);
				}
				else {
					list = (List<AccessCounter>)QueryUtil.list(q, getDialect(),
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
	 * Removes the access counter where companyId = &#63; and accessDate = &#63; from the database.
	 *
	 * @param companyId the company id to search with
	 * @param accessDate the access date to search with
	 * @throws SystemException if a system exception occurred
	 */
	public void removeByAccessDate(long companyId, Date accessDate)
		throws NoSuchAccessCounterException, SystemException {
		AccessCounter accessCounter = findByAccessDate(companyId, accessDate);

		remove(accessCounter);
	}

	/**
	 * Removes all the access counters where companyId = &#63; from the database.
	 *
	 * @param companyId the company id to search with
	 * @throws SystemException if a system exception occurred
	 */
	public void removeByCompanyId(long companyId) throws SystemException {
		for (AccessCounter accessCounter : findByCompanyId(companyId)) {
			remove(accessCounter);
		}
	}

	/**
	 * Removes all the access counters from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	public void removeAll() throws SystemException {
		for (AccessCounter accessCounter : findAll()) {
			remove(accessCounter);
		}
	}

	/**
	 * Counts all the access counters where companyId = &#63; and accessDate = &#63;.
	 *
	 * @param companyId the company id to search with
	 * @param accessDate the access date to search with
	 * @return the number of matching access counters
	 * @throws SystemException if a system exception occurred
	 */
	public int countByAccessDate(long companyId, Date accessDate)
		throws SystemException {
		Object[] finderArgs = new Object[] { companyId, accessDate };

		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_BY_ACCESSDATE,
				finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_ACCESSCOUNTER_WHERE);

			query.append(_FINDER_COLUMN_ACCESSDATE_COMPANYID_2);

			if (accessDate == null) {
				query.append(_FINDER_COLUMN_ACCESSDATE_ACCESSDATE_1);
			}
			else {
				query.append(_FINDER_COLUMN_ACCESSDATE_ACCESSDATE_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(companyId);

				if (accessDate != null) {
					qPos.add(CalendarUtil.getTimestamp(accessDate));
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

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_ACCESSDATE,
					finderArgs, count);

				closeSession(session);
			}
		}

		return count.intValue();
	}

	/**
	 * Counts all the access counters where companyId = &#63;.
	 *
	 * @param companyId the company id to search with
	 * @return the number of matching access counters
	 * @throws SystemException if a system exception occurred
	 */
	public int countByCompanyId(long companyId) throws SystemException {
		Object[] finderArgs = new Object[] { companyId };

		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_BY_COMPANYID,
				finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_ACCESSCOUNTER_WHERE);

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
	 * Counts all the access counters.
	 *
	 * @return the number of access counters
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

				Query q = session.createQuery(_SQL_COUNT_ACCESSCOUNTER);

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
	 * Initializes the access counter persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.com.vportal.portal.model.AccessCounter")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<AccessCounter>> listenersList = new ArrayList<ModelListener<AccessCounter>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<AccessCounter>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(AccessCounterImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST);
	}

	@BeanReference(type = AttachmentPersistence.class)
	protected AttachmentPersistence attachmentPersistence;
	@BeanReference(type = AccessCounterPersistence.class)
	protected AccessCounterPersistence accessCounterPersistence;
	@BeanReference(type = PortletFolderPersistence.class)
	protected PortletFolderPersistence portletFolderPersistence;
	@BeanReference(type = ResourcePersistence.class)
	protected ResourcePersistence resourcePersistence;
	@BeanReference(type = UserPersistence.class)
	protected UserPersistence userPersistence;
	private static final String _SQL_SELECT_ACCESSCOUNTER = "SELECT accessCounter FROM AccessCounter accessCounter";
	private static final String _SQL_SELECT_ACCESSCOUNTER_WHERE = "SELECT accessCounter FROM AccessCounter accessCounter WHERE ";
	private static final String _SQL_COUNT_ACCESSCOUNTER = "SELECT COUNT(accessCounter) FROM AccessCounter accessCounter";
	private static final String _SQL_COUNT_ACCESSCOUNTER_WHERE = "SELECT COUNT(accessCounter) FROM AccessCounter accessCounter WHERE ";
	private static final String _FINDER_COLUMN_ACCESSDATE_COMPANYID_2 = "accessCounter.companyId = ? AND ";
	private static final String _FINDER_COLUMN_ACCESSDATE_ACCESSDATE_1 = "accessCounter.accessDate IS NULL";
	private static final String _FINDER_COLUMN_ACCESSDATE_ACCESSDATE_2 = "accessCounter.accessDate = ?";
	private static final String _FINDER_COLUMN_COMPANYID_COMPANYID_2 = "accessCounter.companyId = ?";
	private static final String _ORDER_BY_ENTITY_ALIAS = "accessCounter.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No AccessCounter exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No AccessCounter exists with the key {";
	private static Log _log = LogFactoryUtil.getLog(AccessCounterPersistenceImpl.class);
}