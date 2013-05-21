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

package com.portlet.vdoc.service.persistence;

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

import com.portlet.vdoc.NoSuchvdocLoggerException;
import com.portlet.vdoc.model.impl.vdocLoggerImpl;
import com.portlet.vdoc.model.impl.vdocLoggerModelImpl;
import com.portlet.vdoc.model.vdocLogger;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;

/**
 * The persistence implementation for the vdoc logger service.
 *
 * <p>
 * Never modify or reference this class directly. Always use {@link vdocLoggerUtil} to access the vdoc logger persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
 * </p>
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author vinhnt
 * @see vdocLoggerPersistence
 * @see vdocLoggerUtil
 * @generated
 */
public class vdocLoggerPersistenceImpl extends BasePersistenceImpl<vdocLogger>
	implements vdocLoggerPersistence {
	public static final String FINDER_CLASS_NAME_ENTITY = vdocLoggerImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST = FINDER_CLASS_NAME_ENTITY +
		".List";
	public static final FinderPath FINDER_PATH_FETCH_BY_G_L = new FinderPath(vdocLoggerModelImpl.ENTITY_CACHE_ENABLED,
			vdocLoggerModelImpl.FINDER_CACHE_ENABLED, FINDER_CLASS_NAME_ENTITY,
			"fetchByG_L",
			new String[] { Long.class.getName(), String.class.getName() });
	public static final FinderPath FINDER_PATH_COUNT_BY_G_L = new FinderPath(vdocLoggerModelImpl.ENTITY_CACHE_ENABLED,
			vdocLoggerModelImpl.FINDER_CACHE_ENABLED, FINDER_CLASS_NAME_LIST,
			"countByG_L",
			new String[] { Long.class.getName(), String.class.getName() });
	public static final FinderPath FINDER_PATH_FIND_BY_U_D = new FinderPath(vdocLoggerModelImpl.ENTITY_CACHE_ENABLED,
			vdocLoggerModelImpl.FINDER_CACHE_ENABLED, FINDER_CLASS_NAME_LIST,
			"findByU_D",
			new String[] {
				Long.class.getName(), Long.class.getName(), Date.class.getName(),
				
			"java.lang.Integer", "java.lang.Integer",
				"com.liferay.portal.kernel.util.OrderByComparator"
			});
	public static final FinderPath FINDER_PATH_COUNT_BY_U_D = new FinderPath(vdocLoggerModelImpl.ENTITY_CACHE_ENABLED,
			vdocLoggerModelImpl.FINDER_CACHE_ENABLED, FINDER_CLASS_NAME_LIST,
			"countByU_D",
			new String[] {
				Long.class.getName(), Long.class.getName(), Date.class.getName()
			});
	public static final FinderPath FINDER_PATH_FIND_BY_GROUPID = new FinderPath(vdocLoggerModelImpl.ENTITY_CACHE_ENABLED,
			vdocLoggerModelImpl.FINDER_CACHE_ENABLED, FINDER_CLASS_NAME_LIST,
			"findByGroupId",
			new String[] {
				Long.class.getName(),
				
			"java.lang.Integer", "java.lang.Integer",
				"com.liferay.portal.kernel.util.OrderByComparator"
			});
	public static final FinderPath FINDER_PATH_COUNT_BY_GROUPID = new FinderPath(vdocLoggerModelImpl.ENTITY_CACHE_ENABLED,
			vdocLoggerModelImpl.FINDER_CACHE_ENABLED, FINDER_CLASS_NAME_LIST,
			"countByGroupId", new String[] { Long.class.getName() });
	public static final FinderPath FINDER_PATH_FIND_ALL = new FinderPath(vdocLoggerModelImpl.ENTITY_CACHE_ENABLED,
			vdocLoggerModelImpl.FINDER_CACHE_ENABLED, FINDER_CLASS_NAME_LIST,
			"findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(vdocLoggerModelImpl.ENTITY_CACHE_ENABLED,
			vdocLoggerModelImpl.FINDER_CACHE_ENABLED, FINDER_CLASS_NAME_LIST,
			"countAll", new String[0]);

	/**
	 * Caches the vdoc logger in the entity cache if it is enabled.
	 *
	 * @param vdocLogger the vdoc logger to cache
	 */
	public void cacheResult(vdocLogger vdocLogger) {
		EntityCacheUtil.putResult(vdocLoggerModelImpl.ENTITY_CACHE_ENABLED,
			vdocLoggerImpl.class, vdocLogger.getPrimaryKey(), vdocLogger);

		FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_G_L,
			new Object[] {
				new Long(vdocLogger.getGroupId()),
				
			vdocLogger.getLoggerId()
			}, vdocLogger);
	}

	/**
	 * Caches the vdoc loggers in the entity cache if it is enabled.
	 *
	 * @param vdocLoggers the vdoc loggers to cache
	 */
	public void cacheResult(List<vdocLogger> vdocLoggers) {
		for (vdocLogger vdocLogger : vdocLoggers) {
			if (EntityCacheUtil.getResult(
						vdocLoggerModelImpl.ENTITY_CACHE_ENABLED,
						vdocLoggerImpl.class, vdocLogger.getPrimaryKey(), this) == null) {
				cacheResult(vdocLogger);
			}
		}
	}

	/**
	 * Clears the cache for all vdoc loggers.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	public void clearCache() {
		CacheRegistryUtil.clear(vdocLoggerImpl.class.getName());
		EntityCacheUtil.clearCache(vdocLoggerImpl.class.getName());
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST);
	}

	/**
	 * Clears the cache for the vdoc logger.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	public void clearCache(vdocLogger vdocLogger) {
		EntityCacheUtil.removeResult(vdocLoggerModelImpl.ENTITY_CACHE_ENABLED,
			vdocLoggerImpl.class, vdocLogger.getPrimaryKey());

		FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_G_L,
			new Object[] {
				new Long(vdocLogger.getGroupId()),
				
			vdocLogger.getLoggerId()
			});
	}

	/**
	 * Creates a new vdoc logger with the primary key. Does not add the vdoc logger to the database.
	 *
	 * @param loggerId the primary key for the new vdoc logger
	 * @return the new vdoc logger
	 */
	public vdocLogger create(String loggerId) {
		vdocLogger vdocLogger = new vdocLoggerImpl();

		vdocLogger.setNew(true);
		vdocLogger.setPrimaryKey(loggerId);

		return vdocLogger;
	}

	/**
	 * Removes the vdoc logger with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the vdoc logger to remove
	 * @return the vdoc logger that was removed
	 * @throws com.liferay.portal.NoSuchModelException if a vdoc logger with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public vdocLogger remove(Serializable primaryKey)
		throws NoSuchModelException, SystemException {
		return remove((String)primaryKey);
	}

	/**
	 * Removes the vdoc logger with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param loggerId the primary key of the vdoc logger to remove
	 * @return the vdoc logger that was removed
	 * @throws com.portlet.vdoc.NoSuchvdocLoggerException if a vdoc logger with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public vdocLogger remove(String loggerId)
		throws NoSuchvdocLoggerException, SystemException {
		Session session = null;

		try {
			session = openSession();

			vdocLogger vdocLogger = (vdocLogger)session.get(vdocLoggerImpl.class,
					loggerId);

			if (vdocLogger == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + loggerId);
				}

				throw new NoSuchvdocLoggerException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					loggerId);
			}

			return remove(vdocLogger);
		}
		catch (NoSuchvdocLoggerException nsee) {
			throw nsee;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected vdocLogger removeImpl(vdocLogger vdocLogger)
		throws SystemException {
		vdocLogger = toUnwrappedModel(vdocLogger);

		Session session = null;

		try {
			session = openSession();

			BatchSessionUtil.delete(session, vdocLogger);
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST);

		vdocLoggerModelImpl vdocLoggerModelImpl = (vdocLoggerModelImpl)vdocLogger;

		FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_G_L,
			new Object[] {
				new Long(vdocLoggerModelImpl.getGroupId()),
				
			vdocLoggerModelImpl.getLoggerId()
			});

		EntityCacheUtil.removeResult(vdocLoggerModelImpl.ENTITY_CACHE_ENABLED,
			vdocLoggerImpl.class, vdocLogger.getPrimaryKey());

		return vdocLogger;
	}

	public vdocLogger updateImpl(com.portlet.vdoc.model.vdocLogger vdocLogger,
		boolean merge) throws SystemException {
		vdocLogger = toUnwrappedModel(vdocLogger);

		boolean isNew = vdocLogger.isNew();

		vdocLoggerModelImpl vdocLoggerModelImpl = (vdocLoggerModelImpl)vdocLogger;

		Session session = null;

		try {
			session = openSession();

			BatchSessionUtil.update(session, vdocLogger, merge);

			vdocLogger.setNew(false);
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST);

		EntityCacheUtil.putResult(vdocLoggerModelImpl.ENTITY_CACHE_ENABLED,
			vdocLoggerImpl.class, vdocLogger.getPrimaryKey(), vdocLogger);

		if (!isNew &&
				((vdocLogger.getGroupId() != vdocLoggerModelImpl.getOriginalGroupId()) ||
				!Validator.equals(vdocLogger.getLoggerId(),
					vdocLoggerModelImpl.getOriginalLoggerId()))) {
			FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_G_L,
				new Object[] {
					new Long(vdocLoggerModelImpl.getOriginalGroupId()),
					
				vdocLoggerModelImpl.getOriginalLoggerId()
				});
		}

		if (isNew ||
				((vdocLogger.getGroupId() != vdocLoggerModelImpl.getOriginalGroupId()) ||
				!Validator.equals(vdocLogger.getLoggerId(),
					vdocLoggerModelImpl.getOriginalLoggerId()))) {
			FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_G_L,
				new Object[] {
					new Long(vdocLogger.getGroupId()),
					
				vdocLogger.getLoggerId()
				}, vdocLogger);
		}

		return vdocLogger;
	}

	protected vdocLogger toUnwrappedModel(vdocLogger vdocLogger) {
		if (vdocLogger instanceof vdocLoggerImpl) {
			return vdocLogger;
		}

		vdocLoggerImpl vdocLoggerImpl = new vdocLoggerImpl();

		vdocLoggerImpl.setNew(vdocLogger.isNew());
		vdocLoggerImpl.setPrimaryKey(vdocLogger.getPrimaryKey());

		vdocLoggerImpl.setLoggerId(vdocLogger.getLoggerId());
		vdocLoggerImpl.setGroupId(vdocLogger.getGroupId());
		vdocLoggerImpl.setCompanyId(vdocLogger.getCompanyId());
		vdocLoggerImpl.setUserId(vdocLogger.getUserId());
		vdocLoggerImpl.setCreatedDate(vdocLogger.getCreatedDate());
		vdocLoggerImpl.setCreatedByUser(vdocLogger.getCreatedByUser());
		vdocLoggerImpl.setContent(vdocLogger.getContent());

		return vdocLoggerImpl;
	}

	/**
	 * Finds the vdoc logger with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the vdoc logger to find
	 * @return the vdoc logger
	 * @throws com.liferay.portal.NoSuchModelException if a vdoc logger with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public vdocLogger findByPrimaryKey(Serializable primaryKey)
		throws NoSuchModelException, SystemException {
		return findByPrimaryKey((String)primaryKey);
	}

	/**
	 * Finds the vdoc logger with the primary key or throws a {@link com.portlet.vdoc.NoSuchvdocLoggerException} if it could not be found.
	 *
	 * @param loggerId the primary key of the vdoc logger to find
	 * @return the vdoc logger
	 * @throws com.portlet.vdoc.NoSuchvdocLoggerException if a vdoc logger with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public vdocLogger findByPrimaryKey(String loggerId)
		throws NoSuchvdocLoggerException, SystemException {
		vdocLogger vdocLogger = fetchByPrimaryKey(loggerId);

		if (vdocLogger == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + loggerId);
			}

			throw new NoSuchvdocLoggerException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				loggerId);
		}

		return vdocLogger;
	}

	/**
	 * Finds the vdoc logger with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the vdoc logger to find
	 * @return the vdoc logger, or <code>null</code> if a vdoc logger with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public vdocLogger fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		return fetchByPrimaryKey((String)primaryKey);
	}

	/**
	 * Finds the vdoc logger with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param loggerId the primary key of the vdoc logger to find
	 * @return the vdoc logger, or <code>null</code> if a vdoc logger with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public vdocLogger fetchByPrimaryKey(String loggerId)
		throws SystemException {
		vdocLogger vdocLogger = (vdocLogger)EntityCacheUtil.getResult(vdocLoggerModelImpl.ENTITY_CACHE_ENABLED,
				vdocLoggerImpl.class, loggerId, this);

		if (vdocLogger == null) {
			Session session = null;

			try {
				session = openSession();

				vdocLogger = (vdocLogger)session.get(vdocLoggerImpl.class,
						loggerId);
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (vdocLogger != null) {
					cacheResult(vdocLogger);
				}

				closeSession(session);
			}
		}

		return vdocLogger;
	}

	/**
	 * Finds the vdoc logger where groupId = &#63; and loggerId = &#63; or throws a {@link com.portlet.vdoc.NoSuchvdocLoggerException} if it could not be found.
	 *
	 * @param groupId the group id to search with
	 * @param loggerId the logger id to search with
	 * @return the matching vdoc logger
	 * @throws com.portlet.vdoc.NoSuchvdocLoggerException if a matching vdoc logger could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public vdocLogger findByG_L(long groupId, String loggerId)
		throws NoSuchvdocLoggerException, SystemException {
		vdocLogger vdocLogger = fetchByG_L(groupId, loggerId);

		if (vdocLogger == null) {
			StringBundler msg = new StringBundler(6);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("groupId=");
			msg.append(groupId);

			msg.append(", loggerId=");
			msg.append(loggerId);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			if (_log.isWarnEnabled()) {
				_log.warn(msg.toString());
			}

			throw new NoSuchvdocLoggerException(msg.toString());
		}

		return vdocLogger;
	}

	/**
	 * Finds the vdoc logger where groupId = &#63; and loggerId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param groupId the group id to search with
	 * @param loggerId the logger id to search with
	 * @return the matching vdoc logger, or <code>null</code> if a matching vdoc logger could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public vdocLogger fetchByG_L(long groupId, String loggerId)
		throws SystemException {
		return fetchByG_L(groupId, loggerId, true);
	}

	/**
	 * Finds the vdoc logger where groupId = &#63; and loggerId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param groupId the group id to search with
	 * @param loggerId the logger id to search with
	 * @return the matching vdoc logger, or <code>null</code> if a matching vdoc logger could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public vdocLogger fetchByG_L(long groupId, String loggerId,
		boolean retrieveFromCache) throws SystemException {
		Object[] finderArgs = new Object[] { groupId, loggerId };

		Object result = null;

		if (retrieveFromCache) {
			result = FinderCacheUtil.getResult(FINDER_PATH_FETCH_BY_G_L,
					finderArgs, this);
		}

		if (result == null) {
			StringBundler query = new StringBundler(4);

			query.append(_SQL_SELECT_VDOCLOGGER_WHERE);

			query.append(_FINDER_COLUMN_G_L_GROUPID_2);

			if (loggerId == null) {
				query.append(_FINDER_COLUMN_G_L_LOGGERID_1);
			}
			else {
				if (loggerId.equals(StringPool.BLANK)) {
					query.append(_FINDER_COLUMN_G_L_LOGGERID_3);
				}
				else {
					query.append(_FINDER_COLUMN_G_L_LOGGERID_2);
				}
			}

			query.append(vdocLoggerModelImpl.ORDER_BY_JPQL);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(groupId);

				if (loggerId != null) {
					qPos.add(loggerId);
				}

				List<vdocLogger> list = q.list();

				result = list;

				vdocLogger vdocLogger = null;

				if (list.isEmpty()) {
					FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_G_L,
						finderArgs, list);
				}
				else {
					vdocLogger = list.get(0);

					cacheResult(vdocLogger);

					if ((vdocLogger.getGroupId() != groupId) ||
							(vdocLogger.getLoggerId() == null) ||
							!vdocLogger.getLoggerId().equals(loggerId)) {
						FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_G_L,
							finderArgs, vdocLogger);
					}
				}

				return vdocLogger;
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (result == null) {
					FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_G_L,
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
				return (vdocLogger)result;
			}
		}
	}

	/**
	 * Finds all the vdoc loggers where groupId = &#63; and createdByUser = &#63; and createdDate = &#63;.
	 *
	 * @param groupId the group id to search with
	 * @param createdByUser the created by user to search with
	 * @param createdDate the created date to search with
	 * @return the matching vdoc loggers
	 * @throws SystemException if a system exception occurred
	 */
	public List<vdocLogger> findByU_D(long groupId, long createdByUser,
		Date createdDate) throws SystemException {
		return findByU_D(groupId, createdByUser, createdDate,
			QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Finds a range of all the vdoc loggers where groupId = &#63; and createdByUser = &#63; and createdDate = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param groupId the group id to search with
	 * @param createdByUser the created by user to search with
	 * @param createdDate the created date to search with
	 * @param start the lower bound of the range of vdoc loggers to return
	 * @param end the upper bound of the range of vdoc loggers to return (not inclusive)
	 * @return the range of matching vdoc loggers
	 * @throws SystemException if a system exception occurred
	 */
	public List<vdocLogger> findByU_D(long groupId, long createdByUser,
		Date createdDate, int start, int end) throws SystemException {
		return findByU_D(groupId, createdByUser, createdDate, start, end, null);
	}

	/**
	 * Finds an ordered range of all the vdoc loggers where groupId = &#63; and createdByUser = &#63; and createdDate = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param groupId the group id to search with
	 * @param createdByUser the created by user to search with
	 * @param createdDate the created date to search with
	 * @param start the lower bound of the range of vdoc loggers to return
	 * @param end the upper bound of the range of vdoc loggers to return (not inclusive)
	 * @param orderByComparator the comparator to order the results by
	 * @return the ordered range of matching vdoc loggers
	 * @throws SystemException if a system exception occurred
	 */
	public List<vdocLogger> findByU_D(long groupId, long createdByUser,
		Date createdDate, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		Object[] finderArgs = new Object[] {
				groupId, createdByUser, createdDate,
				
				String.valueOf(start), String.valueOf(end),
				String.valueOf(orderByComparator)
			};

		List<vdocLogger> list = (List<vdocLogger>)FinderCacheUtil.getResult(FINDER_PATH_FIND_BY_U_D,
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

			query.append(_SQL_SELECT_VDOCLOGGER_WHERE);

			query.append(_FINDER_COLUMN_U_D_GROUPID_2);

			query.append(_FINDER_COLUMN_U_D_CREATEDBYUSER_2);

			if (createdDate == null) {
				query.append(_FINDER_COLUMN_U_D_CREATEDDATE_1);
			}
			else {
				query.append(_FINDER_COLUMN_U_D_CREATEDDATE_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}

			else {
				query.append(vdocLoggerModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(groupId);

				qPos.add(createdByUser);

				if (createdDate != null) {
					qPos.add(CalendarUtil.getTimestamp(createdDate));
				}

				list = (List<vdocLogger>)QueryUtil.list(q, getDialect(), start,
						end);
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (list == null) {
					FinderCacheUtil.removeResult(FINDER_PATH_FIND_BY_U_D,
						finderArgs);
				}
				else {
					cacheResult(list);

					FinderCacheUtil.putResult(FINDER_PATH_FIND_BY_U_D,
						finderArgs, list);
				}

				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Finds the first vdoc logger in the ordered set where groupId = &#63; and createdByUser = &#63; and createdDate = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param groupId the group id to search with
	 * @param createdByUser the created by user to search with
	 * @param createdDate the created date to search with
	 * @param orderByComparator the comparator to order the set by
	 * @return the first matching vdoc logger
	 * @throws com.portlet.vdoc.NoSuchvdocLoggerException if a matching vdoc logger could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public vdocLogger findByU_D_First(long groupId, long createdByUser,
		Date createdDate, OrderByComparator orderByComparator)
		throws NoSuchvdocLoggerException, SystemException {
		List<vdocLogger> list = findByU_D(groupId, createdByUser, createdDate,
				0, 1, orderByComparator);

		if (list.isEmpty()) {
			StringBundler msg = new StringBundler(8);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("groupId=");
			msg.append(groupId);

			msg.append(", createdByUser=");
			msg.append(createdByUser);

			msg.append(", createdDate=");
			msg.append(createdDate);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			throw new NoSuchvdocLoggerException(msg.toString());
		}
		else {
			return list.get(0);
		}
	}

	/**
	 * Finds the last vdoc logger in the ordered set where groupId = &#63; and createdByUser = &#63; and createdDate = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param groupId the group id to search with
	 * @param createdByUser the created by user to search with
	 * @param createdDate the created date to search with
	 * @param orderByComparator the comparator to order the set by
	 * @return the last matching vdoc logger
	 * @throws com.portlet.vdoc.NoSuchvdocLoggerException if a matching vdoc logger could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public vdocLogger findByU_D_Last(long groupId, long createdByUser,
		Date createdDate, OrderByComparator orderByComparator)
		throws NoSuchvdocLoggerException, SystemException {
		int count = countByU_D(groupId, createdByUser, createdDate);

		List<vdocLogger> list = findByU_D(groupId, createdByUser, createdDate,
				count - 1, count, orderByComparator);

		if (list.isEmpty()) {
			StringBundler msg = new StringBundler(8);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("groupId=");
			msg.append(groupId);

			msg.append(", createdByUser=");
			msg.append(createdByUser);

			msg.append(", createdDate=");
			msg.append(createdDate);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			throw new NoSuchvdocLoggerException(msg.toString());
		}
		else {
			return list.get(0);
		}
	}

	/**
	 * Finds the vdoc loggers before and after the current vdoc logger in the ordered set where groupId = &#63; and createdByUser = &#63; and createdDate = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param loggerId the primary key of the current vdoc logger
	 * @param groupId the group id to search with
	 * @param createdByUser the created by user to search with
	 * @param createdDate the created date to search with
	 * @param orderByComparator the comparator to order the set by
	 * @return the previous, current, and next vdoc logger
	 * @throws com.portlet.vdoc.NoSuchvdocLoggerException if a vdoc logger with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public vdocLogger[] findByU_D_PrevAndNext(String loggerId, long groupId,
		long createdByUser, Date createdDate,
		OrderByComparator orderByComparator)
		throws NoSuchvdocLoggerException, SystemException {
		vdocLogger vdocLogger = findByPrimaryKey(loggerId);

		Session session = null;

		try {
			session = openSession();

			vdocLogger[] array = new vdocLoggerImpl[3];

			array[0] = getByU_D_PrevAndNext(session, vdocLogger, groupId,
					createdByUser, createdDate, orderByComparator, true);

			array[1] = vdocLogger;

			array[2] = getByU_D_PrevAndNext(session, vdocLogger, groupId,
					createdByUser, createdDate, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected vdocLogger getByU_D_PrevAndNext(Session session,
		vdocLogger vdocLogger, long groupId, long createdByUser,
		Date createdDate, OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_VDOCLOGGER_WHERE);

		query.append(_FINDER_COLUMN_U_D_GROUPID_2);

		query.append(_FINDER_COLUMN_U_D_CREATEDBYUSER_2);

		if (createdDate == null) {
			query.append(_FINDER_COLUMN_U_D_CREATEDDATE_1);
		}
		else {
			query.append(_FINDER_COLUMN_U_D_CREATEDDATE_2);
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
			query.append(vdocLoggerModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(groupId);

		qPos.add(createdByUser);

		if (createdDate != null) {
			qPos.add(CalendarUtil.getTimestamp(createdDate));
		}

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByValues(vdocLogger);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<vdocLogger> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Finds all the vdoc loggers where groupId = &#63;.
	 *
	 * @param groupId the group id to search with
	 * @return the matching vdoc loggers
	 * @throws SystemException if a system exception occurred
	 */
	public List<vdocLogger> findByGroupId(long groupId)
		throws SystemException {
		return findByGroupId(groupId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Finds a range of all the vdoc loggers where groupId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param groupId the group id to search with
	 * @param start the lower bound of the range of vdoc loggers to return
	 * @param end the upper bound of the range of vdoc loggers to return (not inclusive)
	 * @return the range of matching vdoc loggers
	 * @throws SystemException if a system exception occurred
	 */
	public List<vdocLogger> findByGroupId(long groupId, int start, int end)
		throws SystemException {
		return findByGroupId(groupId, start, end, null);
	}

	/**
	 * Finds an ordered range of all the vdoc loggers where groupId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param groupId the group id to search with
	 * @param start the lower bound of the range of vdoc loggers to return
	 * @param end the upper bound of the range of vdoc loggers to return (not inclusive)
	 * @param orderByComparator the comparator to order the results by
	 * @return the ordered range of matching vdoc loggers
	 * @throws SystemException if a system exception occurred
	 */
	public List<vdocLogger> findByGroupId(long groupId, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		Object[] finderArgs = new Object[] {
				groupId,
				
				String.valueOf(start), String.valueOf(end),
				String.valueOf(orderByComparator)
			};

		List<vdocLogger> list = (List<vdocLogger>)FinderCacheUtil.getResult(FINDER_PATH_FIND_BY_GROUPID,
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

			query.append(_SQL_SELECT_VDOCLOGGER_WHERE);

			query.append(_FINDER_COLUMN_GROUPID_GROUPID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}

			else {
				query.append(vdocLoggerModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(groupId);

				list = (List<vdocLogger>)QueryUtil.list(q, getDialect(), start,
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
	 * Finds the first vdoc logger in the ordered set where groupId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param groupId the group id to search with
	 * @param orderByComparator the comparator to order the set by
	 * @return the first matching vdoc logger
	 * @throws com.portlet.vdoc.NoSuchvdocLoggerException if a matching vdoc logger could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public vdocLogger findByGroupId_First(long groupId,
		OrderByComparator orderByComparator)
		throws NoSuchvdocLoggerException, SystemException {
		List<vdocLogger> list = findByGroupId(groupId, 0, 1, orderByComparator);

		if (list.isEmpty()) {
			StringBundler msg = new StringBundler(4);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("groupId=");
			msg.append(groupId);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			throw new NoSuchvdocLoggerException(msg.toString());
		}
		else {
			return list.get(0);
		}
	}

	/**
	 * Finds the last vdoc logger in the ordered set where groupId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param groupId the group id to search with
	 * @param orderByComparator the comparator to order the set by
	 * @return the last matching vdoc logger
	 * @throws com.portlet.vdoc.NoSuchvdocLoggerException if a matching vdoc logger could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public vdocLogger findByGroupId_Last(long groupId,
		OrderByComparator orderByComparator)
		throws NoSuchvdocLoggerException, SystemException {
		int count = countByGroupId(groupId);

		List<vdocLogger> list = findByGroupId(groupId, count - 1, count,
				orderByComparator);

		if (list.isEmpty()) {
			StringBundler msg = new StringBundler(4);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("groupId=");
			msg.append(groupId);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			throw new NoSuchvdocLoggerException(msg.toString());
		}
		else {
			return list.get(0);
		}
	}

	/**
	 * Finds the vdoc loggers before and after the current vdoc logger in the ordered set where groupId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param loggerId the primary key of the current vdoc logger
	 * @param groupId the group id to search with
	 * @param orderByComparator the comparator to order the set by
	 * @return the previous, current, and next vdoc logger
	 * @throws com.portlet.vdoc.NoSuchvdocLoggerException if a vdoc logger with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public vdocLogger[] findByGroupId_PrevAndNext(String loggerId,
		long groupId, OrderByComparator orderByComparator)
		throws NoSuchvdocLoggerException, SystemException {
		vdocLogger vdocLogger = findByPrimaryKey(loggerId);

		Session session = null;

		try {
			session = openSession();

			vdocLogger[] array = new vdocLoggerImpl[3];

			array[0] = getByGroupId_PrevAndNext(session, vdocLogger, groupId,
					orderByComparator, true);

			array[1] = vdocLogger;

			array[2] = getByGroupId_PrevAndNext(session, vdocLogger, groupId,
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

	protected vdocLogger getByGroupId_PrevAndNext(Session session,
		vdocLogger vdocLogger, long groupId,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_VDOCLOGGER_WHERE);

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
			query.append(vdocLoggerModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(groupId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByValues(vdocLogger);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<vdocLogger> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Finds all the vdoc loggers.
	 *
	 * @return the vdoc loggers
	 * @throws SystemException if a system exception occurred
	 */
	public List<vdocLogger> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Finds a range of all the vdoc loggers.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param start the lower bound of the range of vdoc loggers to return
	 * @param end the upper bound of the range of vdoc loggers to return (not inclusive)
	 * @return the range of vdoc loggers
	 * @throws SystemException if a system exception occurred
	 */
	public List<vdocLogger> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Finds an ordered range of all the vdoc loggers.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param start the lower bound of the range of vdoc loggers to return
	 * @param end the upper bound of the range of vdoc loggers to return (not inclusive)
	 * @param orderByComparator the comparator to order the results by
	 * @return the ordered range of vdoc loggers
	 * @throws SystemException if a system exception occurred
	 */
	public List<vdocLogger> findAll(int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		Object[] finderArgs = new Object[] {
				String.valueOf(start), String.valueOf(end),
				String.valueOf(orderByComparator)
			};

		List<vdocLogger> list = (List<vdocLogger>)FinderCacheUtil.getResult(FINDER_PATH_FIND_ALL,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_VDOCLOGGER);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_VDOCLOGGER.concat(vdocLoggerModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (orderByComparator == null) {
					list = (List<vdocLogger>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);
				}
				else {
					list = (List<vdocLogger>)QueryUtil.list(q, getDialect(),
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
	 * Removes the vdoc logger where groupId = &#63; and loggerId = &#63; from the database.
	 *
	 * @param groupId the group id to search with
	 * @param loggerId the logger id to search with
	 * @throws SystemException if a system exception occurred
	 */
	public void removeByG_L(long groupId, String loggerId)
		throws NoSuchvdocLoggerException, SystemException {
		vdocLogger vdocLogger = findByG_L(groupId, loggerId);

		remove(vdocLogger);
	}

	/**
	 * Removes all the vdoc loggers where groupId = &#63; and createdByUser = &#63; and createdDate = &#63; from the database.
	 *
	 * @param groupId the group id to search with
	 * @param createdByUser the created by user to search with
	 * @param createdDate the created date to search with
	 * @throws SystemException if a system exception occurred
	 */
	public void removeByU_D(long groupId, long createdByUser, Date createdDate)
		throws SystemException {
		for (vdocLogger vdocLogger : findByU_D(groupId, createdByUser,
				createdDate)) {
			remove(vdocLogger);
		}
	}

	/**
	 * Removes all the vdoc loggers where groupId = &#63; from the database.
	 *
	 * @param groupId the group id to search with
	 * @throws SystemException if a system exception occurred
	 */
	public void removeByGroupId(long groupId) throws SystemException {
		for (vdocLogger vdocLogger : findByGroupId(groupId)) {
			remove(vdocLogger);
		}
	}

	/**
	 * Removes all the vdoc loggers from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	public void removeAll() throws SystemException {
		for (vdocLogger vdocLogger : findAll()) {
			remove(vdocLogger);
		}
	}

	/**
	 * Counts all the vdoc loggers where groupId = &#63; and loggerId = &#63;.
	 *
	 * @param groupId the group id to search with
	 * @param loggerId the logger id to search with
	 * @return the number of matching vdoc loggers
	 * @throws SystemException if a system exception occurred
	 */
	public int countByG_L(long groupId, String loggerId)
		throws SystemException {
		Object[] finderArgs = new Object[] { groupId, loggerId };

		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_BY_G_L,
				finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_VDOCLOGGER_WHERE);

			query.append(_FINDER_COLUMN_G_L_GROUPID_2);

			if (loggerId == null) {
				query.append(_FINDER_COLUMN_G_L_LOGGERID_1);
			}
			else {
				if (loggerId.equals(StringPool.BLANK)) {
					query.append(_FINDER_COLUMN_G_L_LOGGERID_3);
				}
				else {
					query.append(_FINDER_COLUMN_G_L_LOGGERID_2);
				}
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(groupId);

				if (loggerId != null) {
					qPos.add(loggerId);
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

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_G_L, finderArgs,
					count);

				closeSession(session);
			}
		}

		return count.intValue();
	}

	/**
	 * Counts all the vdoc loggers where groupId = &#63; and createdByUser = &#63; and createdDate = &#63;.
	 *
	 * @param groupId the group id to search with
	 * @param createdByUser the created by user to search with
	 * @param createdDate the created date to search with
	 * @return the number of matching vdoc loggers
	 * @throws SystemException if a system exception occurred
	 */
	public int countByU_D(long groupId, long createdByUser, Date createdDate)
		throws SystemException {
		Object[] finderArgs = new Object[] { groupId, createdByUser, createdDate };

		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_BY_U_D,
				finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(4);

			query.append(_SQL_COUNT_VDOCLOGGER_WHERE);

			query.append(_FINDER_COLUMN_U_D_GROUPID_2);

			query.append(_FINDER_COLUMN_U_D_CREATEDBYUSER_2);

			if (createdDate == null) {
				query.append(_FINDER_COLUMN_U_D_CREATEDDATE_1);
			}
			else {
				query.append(_FINDER_COLUMN_U_D_CREATEDDATE_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(groupId);

				qPos.add(createdByUser);

				if (createdDate != null) {
					qPos.add(CalendarUtil.getTimestamp(createdDate));
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

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_U_D, finderArgs,
					count);

				closeSession(session);
			}
		}

		return count.intValue();
	}

	/**
	 * Counts all the vdoc loggers where groupId = &#63;.
	 *
	 * @param groupId the group id to search with
	 * @return the number of matching vdoc loggers
	 * @throws SystemException if a system exception occurred
	 */
	public int countByGroupId(long groupId) throws SystemException {
		Object[] finderArgs = new Object[] { groupId };

		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_BY_GROUPID,
				finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_VDOCLOGGER_WHERE);

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
	 * Counts all the vdoc loggers.
	 *
	 * @return the number of vdoc loggers
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

				Query q = session.createQuery(_SQL_COUNT_VDOCLOGGER);

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
	 * Initializes the vdoc logger persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.com.portlet.vdoc.model.vdocLogger")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<vdocLogger>> listenersList = new ArrayList<ModelListener<vdocLogger>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<vdocLogger>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(vdocLoggerImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST);
	}

	@BeanReference(type = vdocDocumentPersistence.class)
	protected vdocDocumentPersistence vdocDocumentPersistence;
	@BeanReference(type = vdocFieldPersistence.class)
	protected vdocFieldPersistence vdocFieldPersistence;
	@BeanReference(type = vdocOrgPersistence.class)
	protected vdocOrgPersistence vdocOrgPersistence;
	@BeanReference(type = vdocDORelPersistence.class)
	protected vdocDORelPersistence vdocDORelPersistence;
	@BeanReference(type = vdocLoggerPersistence.class)
	protected vdocLoggerPersistence vdocLoggerPersistence;
	@BeanReference(type = ResourcePersistence.class)
	protected ResourcePersistence resourcePersistence;
	@BeanReference(type = UserPersistence.class)
	protected UserPersistence userPersistence;
	private static final String _SQL_SELECT_VDOCLOGGER = "SELECT vdocLogger FROM vdocLogger vdocLogger";
	private static final String _SQL_SELECT_VDOCLOGGER_WHERE = "SELECT vdocLogger FROM vdocLogger vdocLogger WHERE ";
	private static final String _SQL_COUNT_VDOCLOGGER = "SELECT COUNT(vdocLogger) FROM vdocLogger vdocLogger";
	private static final String _SQL_COUNT_VDOCLOGGER_WHERE = "SELECT COUNT(vdocLogger) FROM vdocLogger vdocLogger WHERE ";
	private static final String _FINDER_COLUMN_G_L_GROUPID_2 = "vdocLogger.groupId = ? AND ";
	private static final String _FINDER_COLUMN_G_L_LOGGERID_1 = "vdocLogger.loggerId IS NULL";
	private static final String _FINDER_COLUMN_G_L_LOGGERID_2 = "vdocLogger.loggerId = ?";
	private static final String _FINDER_COLUMN_G_L_LOGGERID_3 = "(vdocLogger.loggerId IS NULL OR vdocLogger.loggerId = ?)";
	private static final String _FINDER_COLUMN_U_D_GROUPID_2 = "vdocLogger.groupId = ? AND ";
	private static final String _FINDER_COLUMN_U_D_CREATEDBYUSER_2 = "vdocLogger.createdByUser = ? AND ";
	private static final String _FINDER_COLUMN_U_D_CREATEDDATE_1 = "vdocLogger.createdDate IS NULL";
	private static final String _FINDER_COLUMN_U_D_CREATEDDATE_2 = "vdocLogger.createdDate = ?";
	private static final String _FINDER_COLUMN_GROUPID_GROUPID_2 = "vdocLogger.groupId = ?";
	private static final String _ORDER_BY_ENTITY_ALIAS = "vdocLogger.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No vdocLogger exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No vdocLogger exists with the key {";
	private static Log _log = LogFactoryUtil.getLog(vdocLoggerPersistenceImpl.class);
}