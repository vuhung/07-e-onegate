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

package com.vportal.portlet.vcms.service.persistence;

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

import com.vportal.portlet.vcms.NoSuchVcmsTARelationException;
import com.vportal.portlet.vcms.model.VcmsTARelation;
import com.vportal.portlet.vcms.model.impl.VcmsTARelationImpl;
import com.vportal.portlet.vcms.model.impl.VcmsTARelationModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The persistence implementation for the vcms t a relation service.
 *
 * <p>
 * Never modify or reference this class directly. Always use {@link VcmsTARelationUtil} to access the vcms t a relation persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
 * </p>
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author HOAN
 * @see VcmsTARelationPersistence
 * @see VcmsTARelationUtil
 * @generated
 */
public class VcmsTARelationPersistenceImpl extends BasePersistenceImpl<VcmsTARelation>
	implements VcmsTARelationPersistence {
	public static final String FINDER_CLASS_NAME_ENTITY = VcmsTARelationImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST = FINDER_CLASS_NAME_ENTITY +
		".List";
	public static final FinderPath FINDER_PATH_FIND_BY_THREAD = new FinderPath(VcmsTARelationModelImpl.ENTITY_CACHE_ENABLED,
			VcmsTARelationModelImpl.FINDER_CACHE_ENABLED,
			FINDER_CLASS_NAME_LIST, "findByThread",
			new String[] {
				String.class.getName(),
				
			"java.lang.Integer", "java.lang.Integer",
				"com.liferay.portal.kernel.util.OrderByComparator"
			});
	public static final FinderPath FINDER_PATH_COUNT_BY_THREAD = new FinderPath(VcmsTARelationModelImpl.ENTITY_CACHE_ENABLED,
			VcmsTARelationModelImpl.FINDER_CACHE_ENABLED,
			FINDER_CLASS_NAME_LIST, "countByThread",
			new String[] { String.class.getName() });
	public static final FinderPath FINDER_PATH_FIND_BY_ARTICLE = new FinderPath(VcmsTARelationModelImpl.ENTITY_CACHE_ENABLED,
			VcmsTARelationModelImpl.FINDER_CACHE_ENABLED,
			FINDER_CLASS_NAME_LIST, "findByArticle",
			new String[] {
				String.class.getName(),
				
			"java.lang.Integer", "java.lang.Integer",
				"com.liferay.portal.kernel.util.OrderByComparator"
			});
	public static final FinderPath FINDER_PATH_COUNT_BY_ARTICLE = new FinderPath(VcmsTARelationModelImpl.ENTITY_CACHE_ENABLED,
			VcmsTARelationModelImpl.FINDER_CACHE_ENABLED,
			FINDER_CLASS_NAME_LIST, "countByArticle",
			new String[] { String.class.getName() });
	public static final FinderPath FINDER_PATH_FIND_ALL = new FinderPath(VcmsTARelationModelImpl.ENTITY_CACHE_ENABLED,
			VcmsTARelationModelImpl.FINDER_CACHE_ENABLED,
			FINDER_CLASS_NAME_LIST, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(VcmsTARelationModelImpl.ENTITY_CACHE_ENABLED,
			VcmsTARelationModelImpl.FINDER_CACHE_ENABLED,
			FINDER_CLASS_NAME_LIST, "countAll", new String[0]);

	/**
	 * Caches the vcms t a relation in the entity cache if it is enabled.
	 *
	 * @param vcmsTARelation the vcms t a relation to cache
	 */
	public void cacheResult(VcmsTARelation vcmsTARelation) {
		EntityCacheUtil.putResult(VcmsTARelationModelImpl.ENTITY_CACHE_ENABLED,
			VcmsTARelationImpl.class, vcmsTARelation.getPrimaryKey(),
			vcmsTARelation);
	}

	/**
	 * Caches the vcms t a relations in the entity cache if it is enabled.
	 *
	 * @param vcmsTARelations the vcms t a relations to cache
	 */
	public void cacheResult(List<VcmsTARelation> vcmsTARelations) {
		for (VcmsTARelation vcmsTARelation : vcmsTARelations) {
			if (EntityCacheUtil.getResult(
						VcmsTARelationModelImpl.ENTITY_CACHE_ENABLED,
						VcmsTARelationImpl.class,
						vcmsTARelation.getPrimaryKey(), this) == null) {
				cacheResult(vcmsTARelation);
			}
		}
	}

	/**
	 * Clears the cache for all vcms t a relations.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	public void clearCache() {
		CacheRegistryUtil.clear(VcmsTARelationImpl.class.getName());
		EntityCacheUtil.clearCache(VcmsTARelationImpl.class.getName());
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST);
	}

	/**
	 * Clears the cache for the vcms t a relation.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	public void clearCache(VcmsTARelation vcmsTARelation) {
		EntityCacheUtil.removeResult(VcmsTARelationModelImpl.ENTITY_CACHE_ENABLED,
			VcmsTARelationImpl.class, vcmsTARelation.getPrimaryKey());
	}

	/**
	 * Creates a new vcms t a relation with the primary key. Does not add the vcms t a relation to the database.
	 *
	 * @param vcmsTARelationPK the primary key for the new vcms t a relation
	 * @return the new vcms t a relation
	 */
	public VcmsTARelation create(VcmsTARelationPK vcmsTARelationPK) {
		VcmsTARelation vcmsTARelation = new VcmsTARelationImpl();

		vcmsTARelation.setNew(true);
		vcmsTARelation.setPrimaryKey(vcmsTARelationPK);

		return vcmsTARelation;
	}

	/**
	 * Removes the vcms t a relation with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the vcms t a relation to remove
	 * @return the vcms t a relation that was removed
	 * @throws com.liferay.portal.NoSuchModelException if a vcms t a relation with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public VcmsTARelation remove(Serializable primaryKey)
		throws NoSuchModelException, SystemException {
		return remove((VcmsTARelationPK)primaryKey);
	}

	/**
	 * Removes the vcms t a relation with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param vcmsTARelationPK the primary key of the vcms t a relation to remove
	 * @return the vcms t a relation that was removed
	 * @throws com.vportal.portlet.vcms.NoSuchVcmsTARelationException if a vcms t a relation with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public VcmsTARelation remove(VcmsTARelationPK vcmsTARelationPK)
		throws NoSuchVcmsTARelationException, SystemException {
		Session session = null;

		try {
			session = openSession();

			VcmsTARelation vcmsTARelation = (VcmsTARelation)session.get(VcmsTARelationImpl.class,
					vcmsTARelationPK);

			if (vcmsTARelation == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
						vcmsTARelationPK);
				}

				throw new NoSuchVcmsTARelationException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					vcmsTARelationPK);
			}

			return remove(vcmsTARelation);
		}
		catch (NoSuchVcmsTARelationException nsee) {
			throw nsee;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected VcmsTARelation removeImpl(VcmsTARelation vcmsTARelation)
		throws SystemException {
		vcmsTARelation = toUnwrappedModel(vcmsTARelation);

		Session session = null;

		try {
			session = openSession();

			BatchSessionUtil.delete(session, vcmsTARelation);
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST);

		EntityCacheUtil.removeResult(VcmsTARelationModelImpl.ENTITY_CACHE_ENABLED,
			VcmsTARelationImpl.class, vcmsTARelation.getPrimaryKey());

		return vcmsTARelation;
	}

	public VcmsTARelation updateImpl(
		com.vportal.portlet.vcms.model.VcmsTARelation vcmsTARelation,
		boolean merge) throws SystemException {
		vcmsTARelation = toUnwrappedModel(vcmsTARelation);

		Session session = null;

		try {
			session = openSession();

			BatchSessionUtil.update(session, vcmsTARelation, merge);

			vcmsTARelation.setNew(false);
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST);

		EntityCacheUtil.putResult(VcmsTARelationModelImpl.ENTITY_CACHE_ENABLED,
			VcmsTARelationImpl.class, vcmsTARelation.getPrimaryKey(),
			vcmsTARelation);

		return vcmsTARelation;
	}

	protected VcmsTARelation toUnwrappedModel(VcmsTARelation vcmsTARelation) {
		if (vcmsTARelation instanceof VcmsTARelationImpl) {
			return vcmsTARelation;
		}

		VcmsTARelationImpl vcmsTARelationImpl = new VcmsTARelationImpl();

		vcmsTARelationImpl.setNew(vcmsTARelation.isNew());
		vcmsTARelationImpl.setPrimaryKey(vcmsTARelation.getPrimaryKey());

		vcmsTARelationImpl.setThreadId(vcmsTARelation.getThreadId());
		vcmsTARelationImpl.setArticleId(vcmsTARelation.getArticleId());

		return vcmsTARelationImpl;
	}

	/**
	 * Finds the vcms t a relation with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the vcms t a relation to find
	 * @return the vcms t a relation
	 * @throws com.liferay.portal.NoSuchModelException if a vcms t a relation with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public VcmsTARelation findByPrimaryKey(Serializable primaryKey)
		throws NoSuchModelException, SystemException {
		return findByPrimaryKey((VcmsTARelationPK)primaryKey);
	}

	/**
	 * Finds the vcms t a relation with the primary key or throws a {@link com.vportal.portlet.vcms.NoSuchVcmsTARelationException} if it could not be found.
	 *
	 * @param vcmsTARelationPK the primary key of the vcms t a relation to find
	 * @return the vcms t a relation
	 * @throws com.vportal.portlet.vcms.NoSuchVcmsTARelationException if a vcms t a relation with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public VcmsTARelation findByPrimaryKey(VcmsTARelationPK vcmsTARelationPK)
		throws NoSuchVcmsTARelationException, SystemException {
		VcmsTARelation vcmsTARelation = fetchByPrimaryKey(vcmsTARelationPK);

		if (vcmsTARelation == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + vcmsTARelationPK);
			}

			throw new NoSuchVcmsTARelationException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				vcmsTARelationPK);
		}

		return vcmsTARelation;
	}

	/**
	 * Finds the vcms t a relation with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the vcms t a relation to find
	 * @return the vcms t a relation, or <code>null</code> if a vcms t a relation with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public VcmsTARelation fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		return fetchByPrimaryKey((VcmsTARelationPK)primaryKey);
	}

	/**
	 * Finds the vcms t a relation with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param vcmsTARelationPK the primary key of the vcms t a relation to find
	 * @return the vcms t a relation, or <code>null</code> if a vcms t a relation with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public VcmsTARelation fetchByPrimaryKey(VcmsTARelationPK vcmsTARelationPK)
		throws SystemException {
		VcmsTARelation vcmsTARelation = (VcmsTARelation)EntityCacheUtil.getResult(VcmsTARelationModelImpl.ENTITY_CACHE_ENABLED,
				VcmsTARelationImpl.class, vcmsTARelationPK, this);

		if (vcmsTARelation == null) {
			Session session = null;

			try {
				session = openSession();

				vcmsTARelation = (VcmsTARelation)session.get(VcmsTARelationImpl.class,
						vcmsTARelationPK);
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (vcmsTARelation != null) {
					cacheResult(vcmsTARelation);
				}

				closeSession(session);
			}
		}

		return vcmsTARelation;
	}

	/**
	 * Finds all the vcms t a relations where threadId = &#63;.
	 *
	 * @param threadId the thread id to search with
	 * @return the matching vcms t a relations
	 * @throws SystemException if a system exception occurred
	 */
	public List<VcmsTARelation> findByThread(String threadId)
		throws SystemException {
		return findByThread(threadId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Finds a range of all the vcms t a relations where threadId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param threadId the thread id to search with
	 * @param start the lower bound of the range of vcms t a relations to return
	 * @param end the upper bound of the range of vcms t a relations to return (not inclusive)
	 * @return the range of matching vcms t a relations
	 * @throws SystemException if a system exception occurred
	 */
	public List<VcmsTARelation> findByThread(String threadId, int start, int end)
		throws SystemException {
		return findByThread(threadId, start, end, null);
	}

	/**
	 * Finds an ordered range of all the vcms t a relations where threadId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param threadId the thread id to search with
	 * @param start the lower bound of the range of vcms t a relations to return
	 * @param end the upper bound of the range of vcms t a relations to return (not inclusive)
	 * @param orderByComparator the comparator to order the results by
	 * @return the ordered range of matching vcms t a relations
	 * @throws SystemException if a system exception occurred
	 */
	public List<VcmsTARelation> findByThread(String threadId, int start,
		int end, OrderByComparator orderByComparator) throws SystemException {
		Object[] finderArgs = new Object[] {
				threadId,
				
				String.valueOf(start), String.valueOf(end),
				String.valueOf(orderByComparator)
			};

		List<VcmsTARelation> list = (List<VcmsTARelation>)FinderCacheUtil.getResult(FINDER_PATH_FIND_BY_THREAD,
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

			query.append(_SQL_SELECT_VCMSTARELATION_WHERE);

			if (threadId == null) {
				query.append(_FINDER_COLUMN_THREAD_THREADID_1);
			}
			else {
				if (threadId.equals(StringPool.BLANK)) {
					query.append(_FINDER_COLUMN_THREAD_THREADID_3);
				}
				else {
					query.append(_FINDER_COLUMN_THREAD_THREADID_2);
				}
			}

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}

			else {
				query.append(VcmsTARelationModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (threadId != null) {
					qPos.add(threadId);
				}

				list = (List<VcmsTARelation>)QueryUtil.list(q, getDialect(),
						start, end);
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (list == null) {
					FinderCacheUtil.removeResult(FINDER_PATH_FIND_BY_THREAD,
						finderArgs);
				}
				else {
					cacheResult(list);

					FinderCacheUtil.putResult(FINDER_PATH_FIND_BY_THREAD,
						finderArgs, list);
				}

				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Finds the first vcms t a relation in the ordered set where threadId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param threadId the thread id to search with
	 * @param orderByComparator the comparator to order the set by
	 * @return the first matching vcms t a relation
	 * @throws com.vportal.portlet.vcms.NoSuchVcmsTARelationException if a matching vcms t a relation could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public VcmsTARelation findByThread_First(String threadId,
		OrderByComparator orderByComparator)
		throws NoSuchVcmsTARelationException, SystemException {
		List<VcmsTARelation> list = findByThread(threadId, 0, 1,
				orderByComparator);

		if (list.isEmpty()) {
			StringBundler msg = new StringBundler(4);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("threadId=");
			msg.append(threadId);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			throw new NoSuchVcmsTARelationException(msg.toString());
		}
		else {
			return list.get(0);
		}
	}

	/**
	 * Finds the last vcms t a relation in the ordered set where threadId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param threadId the thread id to search with
	 * @param orderByComparator the comparator to order the set by
	 * @return the last matching vcms t a relation
	 * @throws com.vportal.portlet.vcms.NoSuchVcmsTARelationException if a matching vcms t a relation could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public VcmsTARelation findByThread_Last(String threadId,
		OrderByComparator orderByComparator)
		throws NoSuchVcmsTARelationException, SystemException {
		int count = countByThread(threadId);

		List<VcmsTARelation> list = findByThread(threadId, count - 1, count,
				orderByComparator);

		if (list.isEmpty()) {
			StringBundler msg = new StringBundler(4);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("threadId=");
			msg.append(threadId);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			throw new NoSuchVcmsTARelationException(msg.toString());
		}
		else {
			return list.get(0);
		}
	}

	/**
	 * Finds the vcms t a relations before and after the current vcms t a relation in the ordered set where threadId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param vcmsTARelationPK the primary key of the current vcms t a relation
	 * @param threadId the thread id to search with
	 * @param orderByComparator the comparator to order the set by
	 * @return the previous, current, and next vcms t a relation
	 * @throws com.vportal.portlet.vcms.NoSuchVcmsTARelationException if a vcms t a relation with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public VcmsTARelation[] findByThread_PrevAndNext(
		VcmsTARelationPK vcmsTARelationPK, String threadId,
		OrderByComparator orderByComparator)
		throws NoSuchVcmsTARelationException, SystemException {
		VcmsTARelation vcmsTARelation = findByPrimaryKey(vcmsTARelationPK);

		Session session = null;

		try {
			session = openSession();

			VcmsTARelation[] array = new VcmsTARelationImpl[3];

			array[0] = getByThread_PrevAndNext(session, vcmsTARelation,
					threadId, orderByComparator, true);

			array[1] = vcmsTARelation;

			array[2] = getByThread_PrevAndNext(session, vcmsTARelation,
					threadId, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected VcmsTARelation getByThread_PrevAndNext(Session session,
		VcmsTARelation vcmsTARelation, String threadId,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_VCMSTARELATION_WHERE);

		if (threadId == null) {
			query.append(_FINDER_COLUMN_THREAD_THREADID_1);
		}
		else {
			if (threadId.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_THREAD_THREADID_3);
			}
			else {
				query.append(_FINDER_COLUMN_THREAD_THREADID_2);
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
			query.append(VcmsTARelationModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		if (threadId != null) {
			qPos.add(threadId);
		}

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByValues(vcmsTARelation);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<VcmsTARelation> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Finds all the vcms t a relations where articleId = &#63;.
	 *
	 * @param articleId the article id to search with
	 * @return the matching vcms t a relations
	 * @throws SystemException if a system exception occurred
	 */
	public List<VcmsTARelation> findByArticle(String articleId)
		throws SystemException {
		return findByArticle(articleId, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
			null);
	}

	/**
	 * Finds a range of all the vcms t a relations where articleId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param articleId the article id to search with
	 * @param start the lower bound of the range of vcms t a relations to return
	 * @param end the upper bound of the range of vcms t a relations to return (not inclusive)
	 * @return the range of matching vcms t a relations
	 * @throws SystemException if a system exception occurred
	 */
	public List<VcmsTARelation> findByArticle(String articleId, int start,
		int end) throws SystemException {
		return findByArticle(articleId, start, end, null);
	}

	/**
	 * Finds an ordered range of all the vcms t a relations where articleId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param articleId the article id to search with
	 * @param start the lower bound of the range of vcms t a relations to return
	 * @param end the upper bound of the range of vcms t a relations to return (not inclusive)
	 * @param orderByComparator the comparator to order the results by
	 * @return the ordered range of matching vcms t a relations
	 * @throws SystemException if a system exception occurred
	 */
	public List<VcmsTARelation> findByArticle(String articleId, int start,
		int end, OrderByComparator orderByComparator) throws SystemException {
		Object[] finderArgs = new Object[] {
				articleId,
				
				String.valueOf(start), String.valueOf(end),
				String.valueOf(orderByComparator)
			};

		List<VcmsTARelation> list = (List<VcmsTARelation>)FinderCacheUtil.getResult(FINDER_PATH_FIND_BY_ARTICLE,
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

			query.append(_SQL_SELECT_VCMSTARELATION_WHERE);

			if (articleId == null) {
				query.append(_FINDER_COLUMN_ARTICLE_ARTICLEID_1);
			}
			else {
				if (articleId.equals(StringPool.BLANK)) {
					query.append(_FINDER_COLUMN_ARTICLE_ARTICLEID_3);
				}
				else {
					query.append(_FINDER_COLUMN_ARTICLE_ARTICLEID_2);
				}
			}

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}

			else {
				query.append(VcmsTARelationModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (articleId != null) {
					qPos.add(articleId);
				}

				list = (List<VcmsTARelation>)QueryUtil.list(q, getDialect(),
						start, end);
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (list == null) {
					FinderCacheUtil.removeResult(FINDER_PATH_FIND_BY_ARTICLE,
						finderArgs);
				}
				else {
					cacheResult(list);

					FinderCacheUtil.putResult(FINDER_PATH_FIND_BY_ARTICLE,
						finderArgs, list);
				}

				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Finds the first vcms t a relation in the ordered set where articleId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param articleId the article id to search with
	 * @param orderByComparator the comparator to order the set by
	 * @return the first matching vcms t a relation
	 * @throws com.vportal.portlet.vcms.NoSuchVcmsTARelationException if a matching vcms t a relation could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public VcmsTARelation findByArticle_First(String articleId,
		OrderByComparator orderByComparator)
		throws NoSuchVcmsTARelationException, SystemException {
		List<VcmsTARelation> list = findByArticle(articleId, 0, 1,
				orderByComparator);

		if (list.isEmpty()) {
			StringBundler msg = new StringBundler(4);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("articleId=");
			msg.append(articleId);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			throw new NoSuchVcmsTARelationException(msg.toString());
		}
		else {
			return list.get(0);
		}
	}

	/**
	 * Finds the last vcms t a relation in the ordered set where articleId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param articleId the article id to search with
	 * @param orderByComparator the comparator to order the set by
	 * @return the last matching vcms t a relation
	 * @throws com.vportal.portlet.vcms.NoSuchVcmsTARelationException if a matching vcms t a relation could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public VcmsTARelation findByArticle_Last(String articleId,
		OrderByComparator orderByComparator)
		throws NoSuchVcmsTARelationException, SystemException {
		int count = countByArticle(articleId);

		List<VcmsTARelation> list = findByArticle(articleId, count - 1, count,
				orderByComparator);

		if (list.isEmpty()) {
			StringBundler msg = new StringBundler(4);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("articleId=");
			msg.append(articleId);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			throw new NoSuchVcmsTARelationException(msg.toString());
		}
		else {
			return list.get(0);
		}
	}

	/**
	 * Finds the vcms t a relations before and after the current vcms t a relation in the ordered set where articleId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param vcmsTARelationPK the primary key of the current vcms t a relation
	 * @param articleId the article id to search with
	 * @param orderByComparator the comparator to order the set by
	 * @return the previous, current, and next vcms t a relation
	 * @throws com.vportal.portlet.vcms.NoSuchVcmsTARelationException if a vcms t a relation with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public VcmsTARelation[] findByArticle_PrevAndNext(
		VcmsTARelationPK vcmsTARelationPK, String articleId,
		OrderByComparator orderByComparator)
		throws NoSuchVcmsTARelationException, SystemException {
		VcmsTARelation vcmsTARelation = findByPrimaryKey(vcmsTARelationPK);

		Session session = null;

		try {
			session = openSession();

			VcmsTARelation[] array = new VcmsTARelationImpl[3];

			array[0] = getByArticle_PrevAndNext(session, vcmsTARelation,
					articleId, orderByComparator, true);

			array[1] = vcmsTARelation;

			array[2] = getByArticle_PrevAndNext(session, vcmsTARelation,
					articleId, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected VcmsTARelation getByArticle_PrevAndNext(Session session,
		VcmsTARelation vcmsTARelation, String articleId,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_VCMSTARELATION_WHERE);

		if (articleId == null) {
			query.append(_FINDER_COLUMN_ARTICLE_ARTICLEID_1);
		}
		else {
			if (articleId.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_ARTICLE_ARTICLEID_3);
			}
			else {
				query.append(_FINDER_COLUMN_ARTICLE_ARTICLEID_2);
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
			query.append(VcmsTARelationModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		if (articleId != null) {
			qPos.add(articleId);
		}

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByValues(vcmsTARelation);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<VcmsTARelation> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Finds all the vcms t a relations.
	 *
	 * @return the vcms t a relations
	 * @throws SystemException if a system exception occurred
	 */
	public List<VcmsTARelation> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Finds a range of all the vcms t a relations.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param start the lower bound of the range of vcms t a relations to return
	 * @param end the upper bound of the range of vcms t a relations to return (not inclusive)
	 * @return the range of vcms t a relations
	 * @throws SystemException if a system exception occurred
	 */
	public List<VcmsTARelation> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Finds an ordered range of all the vcms t a relations.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param start the lower bound of the range of vcms t a relations to return
	 * @param end the upper bound of the range of vcms t a relations to return (not inclusive)
	 * @param orderByComparator the comparator to order the results by
	 * @return the ordered range of vcms t a relations
	 * @throws SystemException if a system exception occurred
	 */
	public List<VcmsTARelation> findAll(int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		Object[] finderArgs = new Object[] {
				String.valueOf(start), String.valueOf(end),
				String.valueOf(orderByComparator)
			};

		List<VcmsTARelation> list = (List<VcmsTARelation>)FinderCacheUtil.getResult(FINDER_PATH_FIND_ALL,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_VCMSTARELATION);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_VCMSTARELATION.concat(VcmsTARelationModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (orderByComparator == null) {
					list = (List<VcmsTARelation>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);
				}
				else {
					list = (List<VcmsTARelation>)QueryUtil.list(q,
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
	 * Removes all the vcms t a relations where threadId = &#63; from the database.
	 *
	 * @param threadId the thread id to search with
	 * @throws SystemException if a system exception occurred
	 */
	public void removeByThread(String threadId) throws SystemException {
		for (VcmsTARelation vcmsTARelation : findByThread(threadId)) {
			remove(vcmsTARelation);
		}
	}

	/**
	 * Removes all the vcms t a relations where articleId = &#63; from the database.
	 *
	 * @param articleId the article id to search with
	 * @throws SystemException if a system exception occurred
	 */
	public void removeByArticle(String articleId) throws SystemException {
		for (VcmsTARelation vcmsTARelation : findByArticle(articleId)) {
			remove(vcmsTARelation);
		}
	}

	/**
	 * Removes all the vcms t a relations from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	public void removeAll() throws SystemException {
		for (VcmsTARelation vcmsTARelation : findAll()) {
			remove(vcmsTARelation);
		}
	}

	/**
	 * Counts all the vcms t a relations where threadId = &#63;.
	 *
	 * @param threadId the thread id to search with
	 * @return the number of matching vcms t a relations
	 * @throws SystemException if a system exception occurred
	 */
	public int countByThread(String threadId) throws SystemException {
		Object[] finderArgs = new Object[] { threadId };

		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_BY_THREAD,
				finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_VCMSTARELATION_WHERE);

			if (threadId == null) {
				query.append(_FINDER_COLUMN_THREAD_THREADID_1);
			}
			else {
				if (threadId.equals(StringPool.BLANK)) {
					query.append(_FINDER_COLUMN_THREAD_THREADID_3);
				}
				else {
					query.append(_FINDER_COLUMN_THREAD_THREADID_2);
				}
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (threadId != null) {
					qPos.add(threadId);
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

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_THREAD,
					finderArgs, count);

				closeSession(session);
			}
		}

		return count.intValue();
	}

	/**
	 * Counts all the vcms t a relations where articleId = &#63;.
	 *
	 * @param articleId the article id to search with
	 * @return the number of matching vcms t a relations
	 * @throws SystemException if a system exception occurred
	 */
	public int countByArticle(String articleId) throws SystemException {
		Object[] finderArgs = new Object[] { articleId };

		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_BY_ARTICLE,
				finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_VCMSTARELATION_WHERE);

			if (articleId == null) {
				query.append(_FINDER_COLUMN_ARTICLE_ARTICLEID_1);
			}
			else {
				if (articleId.equals(StringPool.BLANK)) {
					query.append(_FINDER_COLUMN_ARTICLE_ARTICLEID_3);
				}
				else {
					query.append(_FINDER_COLUMN_ARTICLE_ARTICLEID_2);
				}
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (articleId != null) {
					qPos.add(articleId);
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

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_ARTICLE,
					finderArgs, count);

				closeSession(session);
			}
		}

		return count.intValue();
	}

	/**
	 * Counts all the vcms t a relations.
	 *
	 * @return the number of vcms t a relations
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

				Query q = session.createQuery(_SQL_COUNT_VCMSTARELATION);

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
	 * Initializes the vcms t a relation persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.com.vportal.portlet.vcms.model.VcmsTARelation")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<VcmsTARelation>> listenersList = new ArrayList<ModelListener<VcmsTARelation>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<VcmsTARelation>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(VcmsTARelationImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST);
	}

	@BeanReference(type = VcmsTypePersistence.class)
	protected VcmsTypePersistence vcmsTypePersistence;
	@BeanReference(type = VcmsPortionPersistence.class)
	protected VcmsPortionPersistence vcmsPortionPersistence;
	@BeanReference(type = VcmsCategoryPersistence.class)
	protected VcmsCategoryPersistence vcmsCategoryPersistence;
	@BeanReference(type = VcmsArticlePersistence.class)
	protected VcmsArticlePersistence vcmsArticlePersistence;
	@BeanReference(type = VcmsStatusPersistence.class)
	protected VcmsStatusPersistence vcmsStatusPersistence;
	@BeanReference(type = VcmsArticleVersionPersistence.class)
	protected VcmsArticleVersionPersistence vcmsArticleVersionPersistence;
	@BeanReference(type = VcmsArticleStatusPersistence.class)
	protected VcmsArticleStatusPersistence vcmsArticleStatusPersistence;
	@BeanReference(type = VcmsArticleTypePersistence.class)
	protected VcmsArticleTypePersistence vcmsArticleTypePersistence;
	@BeanReference(type = VcmsAttachedMessagePersistence.class)
	protected VcmsAttachedMessagePersistence vcmsAttachedMessagePersistence;
	@BeanReference(type = VcmsThreadPersistence.class)
	protected VcmsThreadPersistence vcmsThreadPersistence;
	@BeanReference(type = VcmsDiscussionPersistence.class)
	protected VcmsDiscussionPersistence vcmsDiscussionPersistence;
	@BeanReference(type = VcmsPARelationPersistence.class)
	protected VcmsPARelationPersistence vcmsPARelationPersistence;
	@BeanReference(type = VcmsCARelationPersistence.class)
	protected VcmsCARelationPersistence vcmsCARelationPersistence;
	@BeanReference(type = VcmsTARelationPersistence.class)
	protected VcmsTARelationPersistence vcmsTARelationPersistence;
	@BeanReference(type = VcmsLoggerPersistence.class)
	protected VcmsLoggerPersistence vcmsLoggerPersistence;
	@BeanReference(type = ResourcePersistence.class)
	protected ResourcePersistence resourcePersistence;
	@BeanReference(type = UserPersistence.class)
	protected UserPersistence userPersistence;
	private static final String _SQL_SELECT_VCMSTARELATION = "SELECT vcmsTARelation FROM VcmsTARelation vcmsTARelation";
	private static final String _SQL_SELECT_VCMSTARELATION_WHERE = "SELECT vcmsTARelation FROM VcmsTARelation vcmsTARelation WHERE ";
	private static final String _SQL_COUNT_VCMSTARELATION = "SELECT COUNT(vcmsTARelation) FROM VcmsTARelation vcmsTARelation";
	private static final String _SQL_COUNT_VCMSTARELATION_WHERE = "SELECT COUNT(vcmsTARelation) FROM VcmsTARelation vcmsTARelation WHERE ";
	private static final String _FINDER_COLUMN_THREAD_THREADID_1 = "vcmsTARelation.id.threadId IS NULL";
	private static final String _FINDER_COLUMN_THREAD_THREADID_2 = "vcmsTARelation.id.threadId = ?";
	private static final String _FINDER_COLUMN_THREAD_THREADID_3 = "(vcmsTARelation.id.threadId IS NULL OR vcmsTARelation.id.threadId = ?)";
	private static final String _FINDER_COLUMN_ARTICLE_ARTICLEID_1 = "vcmsTARelation.id.articleId IS NULL";
	private static final String _FINDER_COLUMN_ARTICLE_ARTICLEID_2 = "vcmsTARelation.id.articleId = ?";
	private static final String _FINDER_COLUMN_ARTICLE_ARTICLEID_3 = "(vcmsTARelation.id.articleId IS NULL OR vcmsTARelation.id.articleId = ?)";
	private static final String _ORDER_BY_ENTITY_ALIAS = "vcmsTARelation.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No VcmsTARelation exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No VcmsTARelation exists with the key {";
	private static Log _log = LogFactoryUtil.getLog(VcmsTARelationPersistenceImpl.class);
}