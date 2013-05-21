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

package com.vportal.portlet.vlegal.service.persistence;

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

import com.vportal.portlet.vlegal.NoSuchVLegalLoggerException;
import com.vportal.portlet.vlegal.model.VLegalLogger;
import com.vportal.portlet.vlegal.model.impl.VLegalLoggerImpl;
import com.vportal.portlet.vlegal.model.impl.VLegalLoggerModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;

/**
 * The persistence implementation for the v legal logger service.
 *
 * <p>
 * Never modify or reference this class directly. Always use {@link VLegalLoggerUtil} to access the v legal logger persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
 * </p>
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author ACB
 * @see VLegalLoggerPersistence
 * @see VLegalLoggerUtil
 * @generated
 */
public class VLegalLoggerPersistenceImpl extends BasePersistenceImpl<VLegalLogger>
	implements VLegalLoggerPersistence {
	public static final String FINDER_CLASS_NAME_ENTITY = VLegalLoggerImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST = FINDER_CLASS_NAME_ENTITY +
		".List";
	public static final FinderPath FINDER_PATH_FETCH_BY_G_L = new FinderPath(VLegalLoggerModelImpl.ENTITY_CACHE_ENABLED,
			VLegalLoggerModelImpl.FINDER_CACHE_ENABLED,
			FINDER_CLASS_NAME_ENTITY, "fetchByG_L",
			new String[] { Long.class.getName(), String.class.getName() });
	public static final FinderPath FINDER_PATH_COUNT_BY_G_L = new FinderPath(VLegalLoggerModelImpl.ENTITY_CACHE_ENABLED,
			VLegalLoggerModelImpl.FINDER_CACHE_ENABLED, FINDER_CLASS_NAME_LIST,
			"countByG_L",
			new String[] { Long.class.getName(), String.class.getName() });
	public static final FinderPath FINDER_PATH_FIND_BY_U_D = new FinderPath(VLegalLoggerModelImpl.ENTITY_CACHE_ENABLED,
			VLegalLoggerModelImpl.FINDER_CACHE_ENABLED, FINDER_CLASS_NAME_LIST,
			"findByU_D",
			new String[] {
				Long.class.getName(), Long.class.getName(), Date.class.getName(),
				
			"java.lang.Integer", "java.lang.Integer",
				"com.liferay.portal.kernel.util.OrderByComparator"
			});
	public static final FinderPath FINDER_PATH_COUNT_BY_U_D = new FinderPath(VLegalLoggerModelImpl.ENTITY_CACHE_ENABLED,
			VLegalLoggerModelImpl.FINDER_CACHE_ENABLED, FINDER_CLASS_NAME_LIST,
			"countByU_D",
			new String[] {
				Long.class.getName(), Long.class.getName(), Date.class.getName()
			});
	public static final FinderPath FINDER_PATH_FIND_BY_GROUPID = new FinderPath(VLegalLoggerModelImpl.ENTITY_CACHE_ENABLED,
			VLegalLoggerModelImpl.FINDER_CACHE_ENABLED, FINDER_CLASS_NAME_LIST,
			"findByGroupId",
			new String[] {
				Long.class.getName(),
				
			"java.lang.Integer", "java.lang.Integer",
				"com.liferay.portal.kernel.util.OrderByComparator"
			});
	public static final FinderPath FINDER_PATH_COUNT_BY_GROUPID = new FinderPath(VLegalLoggerModelImpl.ENTITY_CACHE_ENABLED,
			VLegalLoggerModelImpl.FINDER_CACHE_ENABLED, FINDER_CLASS_NAME_LIST,
			"countByGroupId", new String[] { Long.class.getName() });
	public static final FinderPath FINDER_PATH_FIND_ALL = new FinderPath(VLegalLoggerModelImpl.ENTITY_CACHE_ENABLED,
			VLegalLoggerModelImpl.FINDER_CACHE_ENABLED, FINDER_CLASS_NAME_LIST,
			"findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(VLegalLoggerModelImpl.ENTITY_CACHE_ENABLED,
			VLegalLoggerModelImpl.FINDER_CACHE_ENABLED, FINDER_CLASS_NAME_LIST,
			"countAll", new String[0]);

	/**
	 * Caches the v legal logger in the entity cache if it is enabled.
	 *
	 * @param vLegalLogger the v legal logger to cache
	 */
	public void cacheResult(VLegalLogger vLegalLogger) {
		EntityCacheUtil.putResult(VLegalLoggerModelImpl.ENTITY_CACHE_ENABLED,
			VLegalLoggerImpl.class, vLegalLogger.getPrimaryKey(), vLegalLogger);

		FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_G_L,
			new Object[] {
				new Long(vLegalLogger.getGroupId()),
				
			vLegalLogger.getLoggerId()
			}, vLegalLogger);
	}

	/**
	 * Caches the v legal loggers in the entity cache if it is enabled.
	 *
	 * @param vLegalLoggers the v legal loggers to cache
	 */
	public void cacheResult(List<VLegalLogger> vLegalLoggers) {
		for (VLegalLogger vLegalLogger : vLegalLoggers) {
			if (EntityCacheUtil.getResult(
						VLegalLoggerModelImpl.ENTITY_CACHE_ENABLED,
						VLegalLoggerImpl.class, vLegalLogger.getPrimaryKey(),
						this) == null) {
				cacheResult(vLegalLogger);
			}
		}
	}

	/**
	 * Clears the cache for all v legal loggers.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	public void clearCache() {
		CacheRegistryUtil.clear(VLegalLoggerImpl.class.getName());
		EntityCacheUtil.clearCache(VLegalLoggerImpl.class.getName());
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST);
	}

	/**
	 * Clears the cache for the v legal logger.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	public void clearCache(VLegalLogger vLegalLogger) {
		EntityCacheUtil.removeResult(VLegalLoggerModelImpl.ENTITY_CACHE_ENABLED,
			VLegalLoggerImpl.class, vLegalLogger.getPrimaryKey());

		FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_G_L,
			new Object[] {
				new Long(vLegalLogger.getGroupId()),
				
			vLegalLogger.getLoggerId()
			});
	}

	/**
	 * Creates a new v legal logger with the primary key. Does not add the v legal logger to the database.
	 *
	 * @param loggerId the primary key for the new v legal logger
	 * @return the new v legal logger
	 */
	public VLegalLogger create(String loggerId) {
		VLegalLogger vLegalLogger = new VLegalLoggerImpl();

		vLegalLogger.setNew(true);
		vLegalLogger.setPrimaryKey(loggerId);

		return vLegalLogger;
	}

	/**
	 * Removes the v legal logger with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the v legal logger to remove
	 * @return the v legal logger that was removed
	 * @throws com.liferay.portal.NoSuchModelException if a v legal logger with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public VLegalLogger remove(Serializable primaryKey)
		throws NoSuchModelException, SystemException {
		return remove((String)primaryKey);
	}

	/**
	 * Removes the v legal logger with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param loggerId the primary key of the v legal logger to remove
	 * @return the v legal logger that was removed
	 * @throws com.vportal.portlet.vlegal.NoSuchVLegalLoggerException if a v legal logger with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public VLegalLogger remove(String loggerId)
		throws NoSuchVLegalLoggerException, SystemException {
		Session session = null;

		try {
			session = openSession();

			VLegalLogger vLegalLogger = (VLegalLogger)session.get(VLegalLoggerImpl.class,
					loggerId);

			if (vLegalLogger == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + loggerId);
				}

				throw new NoSuchVLegalLoggerException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					loggerId);
			}

			return remove(vLegalLogger);
		}
		catch (NoSuchVLegalLoggerException nsee) {
			throw nsee;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected VLegalLogger removeImpl(VLegalLogger vLegalLogger)
		throws SystemException {
		vLegalLogger = toUnwrappedModel(vLegalLogger);

		Session session = null;

		try {
			session = openSession();

			BatchSessionUtil.delete(session, vLegalLogger);
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST);

		VLegalLoggerModelImpl vLegalLoggerModelImpl = (VLegalLoggerModelImpl)vLegalLogger;

		FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_G_L,
			new Object[] {
				new Long(vLegalLoggerModelImpl.getGroupId()),
				
			vLegalLoggerModelImpl.getLoggerId()
			});

		EntityCacheUtil.removeResult(VLegalLoggerModelImpl.ENTITY_CACHE_ENABLED,
			VLegalLoggerImpl.class, vLegalLogger.getPrimaryKey());

		return vLegalLogger;
	}

	public VLegalLogger updateImpl(
		com.vportal.portlet.vlegal.model.VLegalLogger vLegalLogger,
		boolean merge) throws SystemException {
		vLegalLogger = toUnwrappedModel(vLegalLogger);

		boolean isNew = vLegalLogger.isNew();

		VLegalLoggerModelImpl vLegalLoggerModelImpl = (VLegalLoggerModelImpl)vLegalLogger;

		Session session = null;

		try {
			session = openSession();

			BatchSessionUtil.update(session, vLegalLogger, merge);

			vLegalLogger.setNew(false);
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST);

		EntityCacheUtil.putResult(VLegalLoggerModelImpl.ENTITY_CACHE_ENABLED,
			VLegalLoggerImpl.class, vLegalLogger.getPrimaryKey(), vLegalLogger);

		if (!isNew &&
				((vLegalLogger.getGroupId() != vLegalLoggerModelImpl.getOriginalGroupId()) ||
				!Validator.equals(vLegalLogger.getLoggerId(),
					vLegalLoggerModelImpl.getOriginalLoggerId()))) {
			FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_G_L,
				new Object[] {
					new Long(vLegalLoggerModelImpl.getOriginalGroupId()),
					
				vLegalLoggerModelImpl.getOriginalLoggerId()
				});
		}

		if (isNew ||
				((vLegalLogger.getGroupId() != vLegalLoggerModelImpl.getOriginalGroupId()) ||
				!Validator.equals(vLegalLogger.getLoggerId(),
					vLegalLoggerModelImpl.getOriginalLoggerId()))) {
			FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_G_L,
				new Object[] {
					new Long(vLegalLogger.getGroupId()),
					
				vLegalLogger.getLoggerId()
				}, vLegalLogger);
		}

		return vLegalLogger;
	}

	protected VLegalLogger toUnwrappedModel(VLegalLogger vLegalLogger) {
		if (vLegalLogger instanceof VLegalLoggerImpl) {
			return vLegalLogger;
		}

		VLegalLoggerImpl vLegalLoggerImpl = new VLegalLoggerImpl();

		vLegalLoggerImpl.setNew(vLegalLogger.isNew());
		vLegalLoggerImpl.setPrimaryKey(vLegalLogger.getPrimaryKey());

		vLegalLoggerImpl.setLoggerId(vLegalLogger.getLoggerId());
		vLegalLoggerImpl.setGroupId(vLegalLogger.getGroupId());
		vLegalLoggerImpl.setCompanyId(vLegalLogger.getCompanyId());
		vLegalLoggerImpl.setUserId(vLegalLogger.getUserId());
		vLegalLoggerImpl.setCreatedDate(vLegalLogger.getCreatedDate());
		vLegalLoggerImpl.setCreatedByUser(vLegalLogger.getCreatedByUser());
		vLegalLoggerImpl.setContent(vLegalLogger.getContent());

		return vLegalLoggerImpl;
	}

	/**
	 * Finds the v legal logger with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the v legal logger to find
	 * @return the v legal logger
	 * @throws com.liferay.portal.NoSuchModelException if a v legal logger with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public VLegalLogger findByPrimaryKey(Serializable primaryKey)
		throws NoSuchModelException, SystemException {
		return findByPrimaryKey((String)primaryKey);
	}

	/**
	 * Finds the v legal logger with the primary key or throws a {@link com.vportal.portlet.vlegal.NoSuchVLegalLoggerException} if it could not be found.
	 *
	 * @param loggerId the primary key of the v legal logger to find
	 * @return the v legal logger
	 * @throws com.vportal.portlet.vlegal.NoSuchVLegalLoggerException if a v legal logger with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public VLegalLogger findByPrimaryKey(String loggerId)
		throws NoSuchVLegalLoggerException, SystemException {
		VLegalLogger vLegalLogger = fetchByPrimaryKey(loggerId);

		if (vLegalLogger == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + loggerId);
			}

			throw new NoSuchVLegalLoggerException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				loggerId);
		}

		return vLegalLogger;
	}

	/**
	 * Finds the v legal logger with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the v legal logger to find
	 * @return the v legal logger, or <code>null</code> if a v legal logger with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public VLegalLogger fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		return fetchByPrimaryKey((String)primaryKey);
	}

	/**
	 * Finds the v legal logger with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param loggerId the primary key of the v legal logger to find
	 * @return the v legal logger, or <code>null</code> if a v legal logger with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public VLegalLogger fetchByPrimaryKey(String loggerId)
		throws SystemException {
		VLegalLogger vLegalLogger = (VLegalLogger)EntityCacheUtil.getResult(VLegalLoggerModelImpl.ENTITY_CACHE_ENABLED,
				VLegalLoggerImpl.class, loggerId, this);

		if (vLegalLogger == null) {
			Session session = null;

			try {
				session = openSession();

				vLegalLogger = (VLegalLogger)session.get(VLegalLoggerImpl.class,
						loggerId);
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (vLegalLogger != null) {
					cacheResult(vLegalLogger);
				}

				closeSession(session);
			}
		}

		return vLegalLogger;
	}

	/**
	 * Finds the v legal logger where groupId = &#63; and loggerId = &#63; or throws a {@link com.vportal.portlet.vlegal.NoSuchVLegalLoggerException} if it could not be found.
	 *
	 * @param groupId the group id to search with
	 * @param loggerId the logger id to search with
	 * @return the matching v legal logger
	 * @throws com.vportal.portlet.vlegal.NoSuchVLegalLoggerException if a matching v legal logger could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public VLegalLogger findByG_L(long groupId, String loggerId)
		throws NoSuchVLegalLoggerException, SystemException {
		VLegalLogger vLegalLogger = fetchByG_L(groupId, loggerId);

		if (vLegalLogger == null) {
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

			throw new NoSuchVLegalLoggerException(msg.toString());
		}

		return vLegalLogger;
	}

	/**
	 * Finds the v legal logger where groupId = &#63; and loggerId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param groupId the group id to search with
	 * @param loggerId the logger id to search with
	 * @return the matching v legal logger, or <code>null</code> if a matching v legal logger could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public VLegalLogger fetchByG_L(long groupId, String loggerId)
		throws SystemException {
		return fetchByG_L(groupId, loggerId, true);
	}

	/**
	 * Finds the v legal logger where groupId = &#63; and loggerId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param groupId the group id to search with
	 * @param loggerId the logger id to search with
	 * @return the matching v legal logger, or <code>null</code> if a matching v legal logger could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public VLegalLogger fetchByG_L(long groupId, String loggerId,
		boolean retrieveFromCache) throws SystemException {
		Object[] finderArgs = new Object[] { groupId, loggerId };

		Object result = null;

		if (retrieveFromCache) {
			result = FinderCacheUtil.getResult(FINDER_PATH_FETCH_BY_G_L,
					finderArgs, this);
		}

		if (result == null) {
			StringBundler query = new StringBundler(4);

			query.append(_SQL_SELECT_VLEGALLOGGER_WHERE);

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

			query.append(VLegalLoggerModelImpl.ORDER_BY_JPQL);

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

				List<VLegalLogger> list = q.list();

				result = list;

				VLegalLogger vLegalLogger = null;

				if (list.isEmpty()) {
					FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_G_L,
						finderArgs, list);
				}
				else {
					vLegalLogger = list.get(0);

					cacheResult(vLegalLogger);

					if ((vLegalLogger.getGroupId() != groupId) ||
							(vLegalLogger.getLoggerId() == null) ||
							!vLegalLogger.getLoggerId().equals(loggerId)) {
						FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_G_L,
							finderArgs, vLegalLogger);
					}
				}

				return vLegalLogger;
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
				return (VLegalLogger)result;
			}
		}
	}

	/**
	 * Finds all the v legal loggers where groupId = &#63; and createdByUser = &#63; and createdDate = &#63;.
	 *
	 * @param groupId the group id to search with
	 * @param createdByUser the created by user to search with
	 * @param createdDate the created date to search with
	 * @return the matching v legal loggers
	 * @throws SystemException if a system exception occurred
	 */
	public List<VLegalLogger> findByU_D(long groupId, long createdByUser,
		Date createdDate) throws SystemException {
		return findByU_D(groupId, createdByUser, createdDate,
			QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Finds a range of all the v legal loggers where groupId = &#63; and createdByUser = &#63; and createdDate = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param groupId the group id to search with
	 * @param createdByUser the created by user to search with
	 * @param createdDate the created date to search with
	 * @param start the lower bound of the range of v legal loggers to return
	 * @param end the upper bound of the range of v legal loggers to return (not inclusive)
	 * @return the range of matching v legal loggers
	 * @throws SystemException if a system exception occurred
	 */
	public List<VLegalLogger> findByU_D(long groupId, long createdByUser,
		Date createdDate, int start, int end) throws SystemException {
		return findByU_D(groupId, createdByUser, createdDate, start, end, null);
	}

	/**
	 * Finds an ordered range of all the v legal loggers where groupId = &#63; and createdByUser = &#63; and createdDate = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param groupId the group id to search with
	 * @param createdByUser the created by user to search with
	 * @param createdDate the created date to search with
	 * @param start the lower bound of the range of v legal loggers to return
	 * @param end the upper bound of the range of v legal loggers to return (not inclusive)
	 * @param orderByComparator the comparator to order the results by
	 * @return the ordered range of matching v legal loggers
	 * @throws SystemException if a system exception occurred
	 */
	public List<VLegalLogger> findByU_D(long groupId, long createdByUser,
		Date createdDate, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		Object[] finderArgs = new Object[] {
				groupId, createdByUser, createdDate,
				
				String.valueOf(start), String.valueOf(end),
				String.valueOf(orderByComparator)
			};

		List<VLegalLogger> list = (List<VLegalLogger>)FinderCacheUtil.getResult(FINDER_PATH_FIND_BY_U_D,
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

			query.append(_SQL_SELECT_VLEGALLOGGER_WHERE);

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
				query.append(VLegalLoggerModelImpl.ORDER_BY_JPQL);
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

				list = (List<VLegalLogger>)QueryUtil.list(q, getDialect(),
						start, end);
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
	 * Finds the first v legal logger in the ordered set where groupId = &#63; and createdByUser = &#63; and createdDate = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param groupId the group id to search with
	 * @param createdByUser the created by user to search with
	 * @param createdDate the created date to search with
	 * @param orderByComparator the comparator to order the set by
	 * @return the first matching v legal logger
	 * @throws com.vportal.portlet.vlegal.NoSuchVLegalLoggerException if a matching v legal logger could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public VLegalLogger findByU_D_First(long groupId, long createdByUser,
		Date createdDate, OrderByComparator orderByComparator)
		throws NoSuchVLegalLoggerException, SystemException {
		List<VLegalLogger> list = findByU_D(groupId, createdByUser,
				createdDate, 0, 1, orderByComparator);

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

			throw new NoSuchVLegalLoggerException(msg.toString());
		}
		else {
			return list.get(0);
		}
	}

	/**
	 * Finds the last v legal logger in the ordered set where groupId = &#63; and createdByUser = &#63; and createdDate = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param groupId the group id to search with
	 * @param createdByUser the created by user to search with
	 * @param createdDate the created date to search with
	 * @param orderByComparator the comparator to order the set by
	 * @return the last matching v legal logger
	 * @throws com.vportal.portlet.vlegal.NoSuchVLegalLoggerException if a matching v legal logger could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public VLegalLogger findByU_D_Last(long groupId, long createdByUser,
		Date createdDate, OrderByComparator orderByComparator)
		throws NoSuchVLegalLoggerException, SystemException {
		int count = countByU_D(groupId, createdByUser, createdDate);

		List<VLegalLogger> list = findByU_D(groupId, createdByUser,
				createdDate, count - 1, count, orderByComparator);

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

			throw new NoSuchVLegalLoggerException(msg.toString());
		}
		else {
			return list.get(0);
		}
	}

	/**
	 * Finds the v legal loggers before and after the current v legal logger in the ordered set where groupId = &#63; and createdByUser = &#63; and createdDate = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param loggerId the primary key of the current v legal logger
	 * @param groupId the group id to search with
	 * @param createdByUser the created by user to search with
	 * @param createdDate the created date to search with
	 * @param orderByComparator the comparator to order the set by
	 * @return the previous, current, and next v legal logger
	 * @throws com.vportal.portlet.vlegal.NoSuchVLegalLoggerException if a v legal logger with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public VLegalLogger[] findByU_D_PrevAndNext(String loggerId, long groupId,
		long createdByUser, Date createdDate,
		OrderByComparator orderByComparator)
		throws NoSuchVLegalLoggerException, SystemException {
		VLegalLogger vLegalLogger = findByPrimaryKey(loggerId);

		Session session = null;

		try {
			session = openSession();

			VLegalLogger[] array = new VLegalLoggerImpl[3];

			array[0] = getByU_D_PrevAndNext(session, vLegalLogger, groupId,
					createdByUser, createdDate, orderByComparator, true);

			array[1] = vLegalLogger;

			array[2] = getByU_D_PrevAndNext(session, vLegalLogger, groupId,
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

	protected VLegalLogger getByU_D_PrevAndNext(Session session,
		VLegalLogger vLegalLogger, long groupId, long createdByUser,
		Date createdDate, OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_VLEGALLOGGER_WHERE);

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
			query.append(VLegalLoggerModelImpl.ORDER_BY_JPQL);
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
			Object[] values = orderByComparator.getOrderByValues(vLegalLogger);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<VLegalLogger> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Finds all the v legal loggers where groupId = &#63;.
	 *
	 * @param groupId the group id to search with
	 * @return the matching v legal loggers
	 * @throws SystemException if a system exception occurred
	 */
	public List<VLegalLogger> findByGroupId(long groupId)
		throws SystemException {
		return findByGroupId(groupId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Finds a range of all the v legal loggers where groupId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param groupId the group id to search with
	 * @param start the lower bound of the range of v legal loggers to return
	 * @param end the upper bound of the range of v legal loggers to return (not inclusive)
	 * @return the range of matching v legal loggers
	 * @throws SystemException if a system exception occurred
	 */
	public List<VLegalLogger> findByGroupId(long groupId, int start, int end)
		throws SystemException {
		return findByGroupId(groupId, start, end, null);
	}

	/**
	 * Finds an ordered range of all the v legal loggers where groupId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param groupId the group id to search with
	 * @param start the lower bound of the range of v legal loggers to return
	 * @param end the upper bound of the range of v legal loggers to return (not inclusive)
	 * @param orderByComparator the comparator to order the results by
	 * @return the ordered range of matching v legal loggers
	 * @throws SystemException if a system exception occurred
	 */
	public List<VLegalLogger> findByGroupId(long groupId, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		Object[] finderArgs = new Object[] {
				groupId,
				
				String.valueOf(start), String.valueOf(end),
				String.valueOf(orderByComparator)
			};

		List<VLegalLogger> list = (List<VLegalLogger>)FinderCacheUtil.getResult(FINDER_PATH_FIND_BY_GROUPID,
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

			query.append(_SQL_SELECT_VLEGALLOGGER_WHERE);

			query.append(_FINDER_COLUMN_GROUPID_GROUPID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}

			else {
				query.append(VLegalLoggerModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(groupId);

				list = (List<VLegalLogger>)QueryUtil.list(q, getDialect(),
						start, end);
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
	 * Finds the first v legal logger in the ordered set where groupId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param groupId the group id to search with
	 * @param orderByComparator the comparator to order the set by
	 * @return the first matching v legal logger
	 * @throws com.vportal.portlet.vlegal.NoSuchVLegalLoggerException if a matching v legal logger could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public VLegalLogger findByGroupId_First(long groupId,
		OrderByComparator orderByComparator)
		throws NoSuchVLegalLoggerException, SystemException {
		List<VLegalLogger> list = findByGroupId(groupId, 0, 1, orderByComparator);

		if (list.isEmpty()) {
			StringBundler msg = new StringBundler(4);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("groupId=");
			msg.append(groupId);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			throw new NoSuchVLegalLoggerException(msg.toString());
		}
		else {
			return list.get(0);
		}
	}

	/**
	 * Finds the last v legal logger in the ordered set where groupId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param groupId the group id to search with
	 * @param orderByComparator the comparator to order the set by
	 * @return the last matching v legal logger
	 * @throws com.vportal.portlet.vlegal.NoSuchVLegalLoggerException if a matching v legal logger could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public VLegalLogger findByGroupId_Last(long groupId,
		OrderByComparator orderByComparator)
		throws NoSuchVLegalLoggerException, SystemException {
		int count = countByGroupId(groupId);

		List<VLegalLogger> list = findByGroupId(groupId, count - 1, count,
				orderByComparator);

		if (list.isEmpty()) {
			StringBundler msg = new StringBundler(4);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("groupId=");
			msg.append(groupId);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			throw new NoSuchVLegalLoggerException(msg.toString());
		}
		else {
			return list.get(0);
		}
	}

	/**
	 * Finds the v legal loggers before and after the current v legal logger in the ordered set where groupId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param loggerId the primary key of the current v legal logger
	 * @param groupId the group id to search with
	 * @param orderByComparator the comparator to order the set by
	 * @return the previous, current, and next v legal logger
	 * @throws com.vportal.portlet.vlegal.NoSuchVLegalLoggerException if a v legal logger with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public VLegalLogger[] findByGroupId_PrevAndNext(String loggerId,
		long groupId, OrderByComparator orderByComparator)
		throws NoSuchVLegalLoggerException, SystemException {
		VLegalLogger vLegalLogger = findByPrimaryKey(loggerId);

		Session session = null;

		try {
			session = openSession();

			VLegalLogger[] array = new VLegalLoggerImpl[3];

			array[0] = getByGroupId_PrevAndNext(session, vLegalLogger, groupId,
					orderByComparator, true);

			array[1] = vLegalLogger;

			array[2] = getByGroupId_PrevAndNext(session, vLegalLogger, groupId,
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

	protected VLegalLogger getByGroupId_PrevAndNext(Session session,
		VLegalLogger vLegalLogger, long groupId,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_VLEGALLOGGER_WHERE);

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
			query.append(VLegalLoggerModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(groupId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByValues(vLegalLogger);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<VLegalLogger> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Finds all the v legal loggers.
	 *
	 * @return the v legal loggers
	 * @throws SystemException if a system exception occurred
	 */
	public List<VLegalLogger> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Finds a range of all the v legal loggers.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param start the lower bound of the range of v legal loggers to return
	 * @param end the upper bound of the range of v legal loggers to return (not inclusive)
	 * @return the range of v legal loggers
	 * @throws SystemException if a system exception occurred
	 */
	public List<VLegalLogger> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Finds an ordered range of all the v legal loggers.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param start the lower bound of the range of v legal loggers to return
	 * @param end the upper bound of the range of v legal loggers to return (not inclusive)
	 * @param orderByComparator the comparator to order the results by
	 * @return the ordered range of v legal loggers
	 * @throws SystemException if a system exception occurred
	 */
	public List<VLegalLogger> findAll(int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		Object[] finderArgs = new Object[] {
				String.valueOf(start), String.valueOf(end),
				String.valueOf(orderByComparator)
			};

		List<VLegalLogger> list = (List<VLegalLogger>)FinderCacheUtil.getResult(FINDER_PATH_FIND_ALL,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_VLEGALLOGGER);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_VLEGALLOGGER.concat(VLegalLoggerModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (orderByComparator == null) {
					list = (List<VLegalLogger>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);
				}
				else {
					list = (List<VLegalLogger>)QueryUtil.list(q, getDialect(),
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
	 * Removes the v legal logger where groupId = &#63; and loggerId = &#63; from the database.
	 *
	 * @param groupId the group id to search with
	 * @param loggerId the logger id to search with
	 * @throws SystemException if a system exception occurred
	 */
	public void removeByG_L(long groupId, String loggerId)
		throws NoSuchVLegalLoggerException, SystemException {
		VLegalLogger vLegalLogger = findByG_L(groupId, loggerId);

		remove(vLegalLogger);
	}

	/**
	 * Removes all the v legal loggers where groupId = &#63; and createdByUser = &#63; and createdDate = &#63; from the database.
	 *
	 * @param groupId the group id to search with
	 * @param createdByUser the created by user to search with
	 * @param createdDate the created date to search with
	 * @throws SystemException if a system exception occurred
	 */
	public void removeByU_D(long groupId, long createdByUser, Date createdDate)
		throws SystemException {
		for (VLegalLogger vLegalLogger : findByU_D(groupId, createdByUser,
				createdDate)) {
			remove(vLegalLogger);
		}
	}

	/**
	 * Removes all the v legal loggers where groupId = &#63; from the database.
	 *
	 * @param groupId the group id to search with
	 * @throws SystemException if a system exception occurred
	 */
	public void removeByGroupId(long groupId) throws SystemException {
		for (VLegalLogger vLegalLogger : findByGroupId(groupId)) {
			remove(vLegalLogger);
		}
	}

	/**
	 * Removes all the v legal loggers from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	public void removeAll() throws SystemException {
		for (VLegalLogger vLegalLogger : findAll()) {
			remove(vLegalLogger);
		}
	}

	/**
	 * Counts all the v legal loggers where groupId = &#63; and loggerId = &#63;.
	 *
	 * @param groupId the group id to search with
	 * @param loggerId the logger id to search with
	 * @return the number of matching v legal loggers
	 * @throws SystemException if a system exception occurred
	 */
	public int countByG_L(long groupId, String loggerId)
		throws SystemException {
		Object[] finderArgs = new Object[] { groupId, loggerId };

		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_BY_G_L,
				finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_VLEGALLOGGER_WHERE);

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
	 * Counts all the v legal loggers where groupId = &#63; and createdByUser = &#63; and createdDate = &#63;.
	 *
	 * @param groupId the group id to search with
	 * @param createdByUser the created by user to search with
	 * @param createdDate the created date to search with
	 * @return the number of matching v legal loggers
	 * @throws SystemException if a system exception occurred
	 */
	public int countByU_D(long groupId, long createdByUser, Date createdDate)
		throws SystemException {
		Object[] finderArgs = new Object[] { groupId, createdByUser, createdDate };

		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_BY_U_D,
				finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(4);

			query.append(_SQL_COUNT_VLEGALLOGGER_WHERE);

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
	 * Counts all the v legal loggers where groupId = &#63;.
	 *
	 * @param groupId the group id to search with
	 * @return the number of matching v legal loggers
	 * @throws SystemException if a system exception occurred
	 */
	public int countByGroupId(long groupId) throws SystemException {
		Object[] finderArgs = new Object[] { groupId };

		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_BY_GROUPID,
				finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_VLEGALLOGGER_WHERE);

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
	 * Counts all the v legal loggers.
	 *
	 * @return the number of v legal loggers
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

				Query q = session.createQuery(_SQL_COUNT_VLEGALLOGGER);

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
	 * Initializes the v legal logger persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.com.vportal.portlet.vlegal.model.VLegalLogger")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<VLegalLogger>> listenersList = new ArrayList<ModelListener<VLegalLogger>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<VLegalLogger>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(VLegalLoggerImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST);
	}

	@BeanReference(type = VLegalDocumentPersistence.class)
	protected VLegalDocumentPersistence vLegalDocumentPersistence;
	@BeanReference(type = VLegalFieldPersistence.class)
	protected VLegalFieldPersistence vLegalFieldPersistence;
	@BeanReference(type = VLegalTypePersistence.class)
	protected VLegalTypePersistence vLegalTypePersistence;
	@BeanReference(type = VLegalDraftDocumentPersistence.class)
	protected VLegalDraftDocumentPersistence vLegalDraftDocumentPersistence;
	@BeanReference(type = VLegalSuggestDocumentPersistence.class)
	protected VLegalSuggestDocumentPersistence vLegalSuggestDocumentPersistence;
	@BeanReference(type = VLegalAttachedMessagePersistence.class)
	protected VLegalAttachedMessagePersistence vLegalAttachedMessagePersistence;
	@BeanReference(type = VLegalOrgPersistence.class)
	protected VLegalOrgPersistence vLegalOrgPersistence;
	@BeanReference(type = VLegalSignerPersistence.class)
	protected VLegalSignerPersistence vLegalSignerPersistence;
	@BeanReference(type = VLegalTagsPersistence.class)
	protected VLegalTagsPersistence vLegalTagsPersistence;
	@BeanReference(type = VLegalFORelPersistence.class)
	protected VLegalFORelPersistence vLegalFORelPersistence;
	@BeanReference(type = VLegalFTRelPersistence.class)
	protected VLegalFTRelPersistence vLegalFTRelPersistence;
	@BeanReference(type = VLegalDFRelPersistence.class)
	protected VLegalDFRelPersistence vLegalDFRelPersistence;
	@BeanReference(type = VLegalDDRelPersistence.class)
	protected VLegalDDRelPersistence vLegalDDRelPersistence;
	@BeanReference(type = VLegalDURelPersistence.class)
	protected VLegalDURelPersistence vLegalDURelPersistence;
	@BeanReference(type = VLegalDSRelPersistence.class)
	protected VLegalDSRelPersistence vLegalDSRelPersistence;
	@BeanReference(type = VLegalTDRelPersistence.class)
	protected VLegalTDRelPersistence vLegalTDRelPersistence;
	@BeanReference(type = VLegalLoggerPersistence.class)
	protected VLegalLoggerPersistence vLegalLoggerPersistence;
	@BeanReference(type = ResourcePersistence.class)
	protected ResourcePersistence resourcePersistence;
	@BeanReference(type = UserPersistence.class)
	protected UserPersistence userPersistence;
	private static final String _SQL_SELECT_VLEGALLOGGER = "SELECT vLegalLogger FROM VLegalLogger vLegalLogger";
	private static final String _SQL_SELECT_VLEGALLOGGER_WHERE = "SELECT vLegalLogger FROM VLegalLogger vLegalLogger WHERE ";
	private static final String _SQL_COUNT_VLEGALLOGGER = "SELECT COUNT(vLegalLogger) FROM VLegalLogger vLegalLogger";
	private static final String _SQL_COUNT_VLEGALLOGGER_WHERE = "SELECT COUNT(vLegalLogger) FROM VLegalLogger vLegalLogger WHERE ";
	private static final String _FINDER_COLUMN_G_L_GROUPID_2 = "vLegalLogger.groupId = ? AND ";
	private static final String _FINDER_COLUMN_G_L_LOGGERID_1 = "vLegalLogger.loggerId IS NULL";
	private static final String _FINDER_COLUMN_G_L_LOGGERID_2 = "vLegalLogger.loggerId = ?";
	private static final String _FINDER_COLUMN_G_L_LOGGERID_3 = "(vLegalLogger.loggerId IS NULL OR vLegalLogger.loggerId = ?)";
	private static final String _FINDER_COLUMN_U_D_GROUPID_2 = "vLegalLogger.groupId = ? AND ";
	private static final String _FINDER_COLUMN_U_D_CREATEDBYUSER_2 = "vLegalLogger.createdByUser = ? AND ";
	private static final String _FINDER_COLUMN_U_D_CREATEDDATE_1 = "vLegalLogger.createdDate IS NULL";
	private static final String _FINDER_COLUMN_U_D_CREATEDDATE_2 = "vLegalLogger.createdDate = ?";
	private static final String _FINDER_COLUMN_GROUPID_GROUPID_2 = "vLegalLogger.groupId = ?";
	private static final String _ORDER_BY_ENTITY_ALIAS = "vLegalLogger.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No VLegalLogger exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No VLegalLogger exists with the key {";
	private static Log _log = LogFactoryUtil.getLog(VLegalLoggerPersistenceImpl.class);
}