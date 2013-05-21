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

import com.vportal.portlet.vcms.NoSuchVcmsPARelationException;
import com.vportal.portlet.vcms.model.VcmsPARelation;
import com.vportal.portlet.vcms.model.impl.VcmsPARelationImpl;
import com.vportal.portlet.vcms.model.impl.VcmsPARelationModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The persistence implementation for the vcms p a relation service.
 *
 * <p>
 * Never modify or reference this class directly. Always use {@link VcmsPARelationUtil} to access the vcms p a relation persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
 * </p>
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author HOAN
 * @see VcmsPARelationPersistence
 * @see VcmsPARelationUtil
 * @generated
 */
public class VcmsPARelationPersistenceImpl extends BasePersistenceImpl<VcmsPARelation>
	implements VcmsPARelationPersistence {
	public static final String FINDER_CLASS_NAME_ENTITY = VcmsPARelationImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST = FINDER_CLASS_NAME_ENTITY +
		".List";
	public static final FinderPath FINDER_PATH_FIND_BY_PORTION = new FinderPath(VcmsPARelationModelImpl.ENTITY_CACHE_ENABLED,
			VcmsPARelationModelImpl.FINDER_CACHE_ENABLED,
			FINDER_CLASS_NAME_LIST, "findByPortion",
			new String[] {
				String.class.getName(),
				
			"java.lang.Integer", "java.lang.Integer",
				"com.liferay.portal.kernel.util.OrderByComparator"
			});
	public static final FinderPath FINDER_PATH_COUNT_BY_PORTION = new FinderPath(VcmsPARelationModelImpl.ENTITY_CACHE_ENABLED,
			VcmsPARelationModelImpl.FINDER_CACHE_ENABLED,
			FINDER_CLASS_NAME_LIST, "countByPortion",
			new String[] { String.class.getName() });
	public static final FinderPath FINDER_PATH_FIND_BY_ARTICLE = new FinderPath(VcmsPARelationModelImpl.ENTITY_CACHE_ENABLED,
			VcmsPARelationModelImpl.FINDER_CACHE_ENABLED,
			FINDER_CLASS_NAME_LIST, "findByArticle",
			new String[] {
				String.class.getName(),
				
			"java.lang.Integer", "java.lang.Integer",
				"com.liferay.portal.kernel.util.OrderByComparator"
			});
	public static final FinderPath FINDER_PATH_COUNT_BY_ARTICLE = new FinderPath(VcmsPARelationModelImpl.ENTITY_CACHE_ENABLED,
			VcmsPARelationModelImpl.FINDER_CACHE_ENABLED,
			FINDER_CLASS_NAME_LIST, "countByArticle",
			new String[] { String.class.getName() });
	public static final FinderPath FINDER_PATH_FIND_ALL = new FinderPath(VcmsPARelationModelImpl.ENTITY_CACHE_ENABLED,
			VcmsPARelationModelImpl.FINDER_CACHE_ENABLED,
			FINDER_CLASS_NAME_LIST, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(VcmsPARelationModelImpl.ENTITY_CACHE_ENABLED,
			VcmsPARelationModelImpl.FINDER_CACHE_ENABLED,
			FINDER_CLASS_NAME_LIST, "countAll", new String[0]);

	/**
	 * Caches the vcms p a relation in the entity cache if it is enabled.
	 *
	 * @param vcmsPARelation the vcms p a relation to cache
	 */
	public void cacheResult(VcmsPARelation vcmsPARelation) {
		EntityCacheUtil.putResult(VcmsPARelationModelImpl.ENTITY_CACHE_ENABLED,
			VcmsPARelationImpl.class, vcmsPARelation.getPrimaryKey(),
			vcmsPARelation);
	}

	/**
	 * Caches the vcms p a relations in the entity cache if it is enabled.
	 *
	 * @param vcmsPARelations the vcms p a relations to cache
	 */
	public void cacheResult(List<VcmsPARelation> vcmsPARelations) {
		for (VcmsPARelation vcmsPARelation : vcmsPARelations) {
			if (EntityCacheUtil.getResult(
						VcmsPARelationModelImpl.ENTITY_CACHE_ENABLED,
						VcmsPARelationImpl.class,
						vcmsPARelation.getPrimaryKey(), this) == null) {
				cacheResult(vcmsPARelation);
			}
		}
	}

	/**
	 * Clears the cache for all vcms p a relations.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	public void clearCache() {
		CacheRegistryUtil.clear(VcmsPARelationImpl.class.getName());
		EntityCacheUtil.clearCache(VcmsPARelationImpl.class.getName());
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST);
	}

	/**
	 * Clears the cache for the vcms p a relation.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	public void clearCache(VcmsPARelation vcmsPARelation) {
		EntityCacheUtil.removeResult(VcmsPARelationModelImpl.ENTITY_CACHE_ENABLED,
			VcmsPARelationImpl.class, vcmsPARelation.getPrimaryKey());
	}

	/**
	 * Creates a new vcms p a relation with the primary key. Does not add the vcms p a relation to the database.
	 *
	 * @param vcmsPARelationPK the primary key for the new vcms p a relation
	 * @return the new vcms p a relation
	 */
	public VcmsPARelation create(VcmsPARelationPK vcmsPARelationPK) {
		VcmsPARelation vcmsPARelation = new VcmsPARelationImpl();

		vcmsPARelation.setNew(true);
		vcmsPARelation.setPrimaryKey(vcmsPARelationPK);

		return vcmsPARelation;
	}

	/**
	 * Removes the vcms p a relation with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the vcms p a relation to remove
	 * @return the vcms p a relation that was removed
	 * @throws com.liferay.portal.NoSuchModelException if a vcms p a relation with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public VcmsPARelation remove(Serializable primaryKey)
		throws NoSuchModelException, SystemException {
		return remove((VcmsPARelationPK)primaryKey);
	}

	/**
	 * Removes the vcms p a relation with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param vcmsPARelationPK the primary key of the vcms p a relation to remove
	 * @return the vcms p a relation that was removed
	 * @throws com.vportal.portlet.vcms.NoSuchVcmsPARelationException if a vcms p a relation with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public VcmsPARelation remove(VcmsPARelationPK vcmsPARelationPK)
		throws NoSuchVcmsPARelationException, SystemException {
		Session session = null;

		try {
			session = openSession();

			VcmsPARelation vcmsPARelation = (VcmsPARelation)session.get(VcmsPARelationImpl.class,
					vcmsPARelationPK);

			if (vcmsPARelation == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
						vcmsPARelationPK);
				}

				throw new NoSuchVcmsPARelationException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					vcmsPARelationPK);
			}

			return remove(vcmsPARelation);
		}
		catch (NoSuchVcmsPARelationException nsee) {
			throw nsee;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected VcmsPARelation removeImpl(VcmsPARelation vcmsPARelation)
		throws SystemException {
		vcmsPARelation = toUnwrappedModel(vcmsPARelation);

		Session session = null;

		try {
			session = openSession();

			BatchSessionUtil.delete(session, vcmsPARelation);
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST);

		EntityCacheUtil.removeResult(VcmsPARelationModelImpl.ENTITY_CACHE_ENABLED,
			VcmsPARelationImpl.class, vcmsPARelation.getPrimaryKey());

		return vcmsPARelation;
	}

	public VcmsPARelation updateImpl(
		com.vportal.portlet.vcms.model.VcmsPARelation vcmsPARelation,
		boolean merge) throws SystemException {
		vcmsPARelation = toUnwrappedModel(vcmsPARelation);

		Session session = null;

		try {
			session = openSession();

			BatchSessionUtil.update(session, vcmsPARelation, merge);

			vcmsPARelation.setNew(false);
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST);

		EntityCacheUtil.putResult(VcmsPARelationModelImpl.ENTITY_CACHE_ENABLED,
			VcmsPARelationImpl.class, vcmsPARelation.getPrimaryKey(),
			vcmsPARelation);

		return vcmsPARelation;
	}

	protected VcmsPARelation toUnwrappedModel(VcmsPARelation vcmsPARelation) {
		if (vcmsPARelation instanceof VcmsPARelationImpl) {
			return vcmsPARelation;
		}

		VcmsPARelationImpl vcmsPARelationImpl = new VcmsPARelationImpl();

		vcmsPARelationImpl.setNew(vcmsPARelation.isNew());
		vcmsPARelationImpl.setPrimaryKey(vcmsPARelation.getPrimaryKey());

		vcmsPARelationImpl.setPortionId(vcmsPARelation.getPortionId());
		vcmsPARelationImpl.setArticleId(vcmsPARelation.getArticleId());

		return vcmsPARelationImpl;
	}

	/**
	 * Finds the vcms p a relation with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the vcms p a relation to find
	 * @return the vcms p a relation
	 * @throws com.liferay.portal.NoSuchModelException if a vcms p a relation with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public VcmsPARelation findByPrimaryKey(Serializable primaryKey)
		throws NoSuchModelException, SystemException {
		return findByPrimaryKey((VcmsPARelationPK)primaryKey);
	}

	/**
	 * Finds the vcms p a relation with the primary key or throws a {@link com.vportal.portlet.vcms.NoSuchVcmsPARelationException} if it could not be found.
	 *
	 * @param vcmsPARelationPK the primary key of the vcms p a relation to find
	 * @return the vcms p a relation
	 * @throws com.vportal.portlet.vcms.NoSuchVcmsPARelationException if a vcms p a relation with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public VcmsPARelation findByPrimaryKey(VcmsPARelationPK vcmsPARelationPK)
		throws NoSuchVcmsPARelationException, SystemException {
		VcmsPARelation vcmsPARelation = fetchByPrimaryKey(vcmsPARelationPK);

		if (vcmsPARelation == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + vcmsPARelationPK);
			}

			throw new NoSuchVcmsPARelationException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				vcmsPARelationPK);
		}

		return vcmsPARelation;
	}

	/**
	 * Finds the vcms p a relation with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the vcms p a relation to find
	 * @return the vcms p a relation, or <code>null</code> if a vcms p a relation with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public VcmsPARelation fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		return fetchByPrimaryKey((VcmsPARelationPK)primaryKey);
	}

	/**
	 * Finds the vcms p a relation with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param vcmsPARelationPK the primary key of the vcms p a relation to find
	 * @return the vcms p a relation, or <code>null</code> if a vcms p a relation with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public VcmsPARelation fetchByPrimaryKey(VcmsPARelationPK vcmsPARelationPK)
		throws SystemException {
		VcmsPARelation vcmsPARelation = (VcmsPARelation)EntityCacheUtil.getResult(VcmsPARelationModelImpl.ENTITY_CACHE_ENABLED,
				VcmsPARelationImpl.class, vcmsPARelationPK, this);

		if (vcmsPARelation == null) {
			Session session = null;

			try {
				session = openSession();

				vcmsPARelation = (VcmsPARelation)session.get(VcmsPARelationImpl.class,
						vcmsPARelationPK);
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (vcmsPARelation != null) {
					cacheResult(vcmsPARelation);
				}

				closeSession(session);
			}
		}

		return vcmsPARelation;
	}

	/**
	 * Finds all the vcms p a relations where portionId = &#63;.
	 *
	 * @param portionId the portion id to search with
	 * @return the matching vcms p a relations
	 * @throws SystemException if a system exception occurred
	 */
	public List<VcmsPARelation> findByPortion(String portionId)
		throws SystemException {
		return findByPortion(portionId, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
			null);
	}

	/**
	 * Finds a range of all the vcms p a relations where portionId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param portionId the portion id to search with
	 * @param start the lower bound of the range of vcms p a relations to return
	 * @param end the upper bound of the range of vcms p a relations to return (not inclusive)
	 * @return the range of matching vcms p a relations
	 * @throws SystemException if a system exception occurred
	 */
	public List<VcmsPARelation> findByPortion(String portionId, int start,
		int end) throws SystemException {
		return findByPortion(portionId, start, end, null);
	}

	/**
	 * Finds an ordered range of all the vcms p a relations where portionId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param portionId the portion id to search with
	 * @param start the lower bound of the range of vcms p a relations to return
	 * @param end the upper bound of the range of vcms p a relations to return (not inclusive)
	 * @param orderByComparator the comparator to order the results by
	 * @return the ordered range of matching vcms p a relations
	 * @throws SystemException if a system exception occurred
	 */
	public List<VcmsPARelation> findByPortion(String portionId, int start,
		int end, OrderByComparator orderByComparator) throws SystemException {
		Object[] finderArgs = new Object[] {
				portionId,
				
				String.valueOf(start), String.valueOf(end),
				String.valueOf(orderByComparator)
			};

		List<VcmsPARelation> list = (List<VcmsPARelation>)FinderCacheUtil.getResult(FINDER_PATH_FIND_BY_PORTION,
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

			query.append(_SQL_SELECT_VCMSPARELATION_WHERE);

			if (portionId == null) {
				query.append(_FINDER_COLUMN_PORTION_PORTIONID_1);
			}
			else {
				if (portionId.equals(StringPool.BLANK)) {
					query.append(_FINDER_COLUMN_PORTION_PORTIONID_3);
				}
				else {
					query.append(_FINDER_COLUMN_PORTION_PORTIONID_2);
				}
			}

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}

			else {
				query.append(VcmsPARelationModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (portionId != null) {
					qPos.add(portionId);
				}

				list = (List<VcmsPARelation>)QueryUtil.list(q, getDialect(),
						start, end);
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (list == null) {
					FinderCacheUtil.removeResult(FINDER_PATH_FIND_BY_PORTION,
						finderArgs);
				}
				else {
					cacheResult(list);

					FinderCacheUtil.putResult(FINDER_PATH_FIND_BY_PORTION,
						finderArgs, list);
				}

				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Finds the first vcms p a relation in the ordered set where portionId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param portionId the portion id to search with
	 * @param orderByComparator the comparator to order the set by
	 * @return the first matching vcms p a relation
	 * @throws com.vportal.portlet.vcms.NoSuchVcmsPARelationException if a matching vcms p a relation could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public VcmsPARelation findByPortion_First(String portionId,
		OrderByComparator orderByComparator)
		throws NoSuchVcmsPARelationException, SystemException {
		List<VcmsPARelation> list = findByPortion(portionId, 0, 1,
				orderByComparator);

		if (list.isEmpty()) {
			StringBundler msg = new StringBundler(4);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("portionId=");
			msg.append(portionId);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			throw new NoSuchVcmsPARelationException(msg.toString());
		}
		else {
			return list.get(0);
		}
	}

	/**
	 * Finds the last vcms p a relation in the ordered set where portionId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param portionId the portion id to search with
	 * @param orderByComparator the comparator to order the set by
	 * @return the last matching vcms p a relation
	 * @throws com.vportal.portlet.vcms.NoSuchVcmsPARelationException if a matching vcms p a relation could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public VcmsPARelation findByPortion_Last(String portionId,
		OrderByComparator orderByComparator)
		throws NoSuchVcmsPARelationException, SystemException {
		int count = countByPortion(portionId);

		List<VcmsPARelation> list = findByPortion(portionId, count - 1, count,
				orderByComparator);

		if (list.isEmpty()) {
			StringBundler msg = new StringBundler(4);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("portionId=");
			msg.append(portionId);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			throw new NoSuchVcmsPARelationException(msg.toString());
		}
		else {
			return list.get(0);
		}
	}

	/**
	 * Finds the vcms p a relations before and after the current vcms p a relation in the ordered set where portionId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param vcmsPARelationPK the primary key of the current vcms p a relation
	 * @param portionId the portion id to search with
	 * @param orderByComparator the comparator to order the set by
	 * @return the previous, current, and next vcms p a relation
	 * @throws com.vportal.portlet.vcms.NoSuchVcmsPARelationException if a vcms p a relation with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public VcmsPARelation[] findByPortion_PrevAndNext(
		VcmsPARelationPK vcmsPARelationPK, String portionId,
		OrderByComparator orderByComparator)
		throws NoSuchVcmsPARelationException, SystemException {
		VcmsPARelation vcmsPARelation = findByPrimaryKey(vcmsPARelationPK);

		Session session = null;

		try {
			session = openSession();

			VcmsPARelation[] array = new VcmsPARelationImpl[3];

			array[0] = getByPortion_PrevAndNext(session, vcmsPARelation,
					portionId, orderByComparator, true);

			array[1] = vcmsPARelation;

			array[2] = getByPortion_PrevAndNext(session, vcmsPARelation,
					portionId, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected VcmsPARelation getByPortion_PrevAndNext(Session session,
		VcmsPARelation vcmsPARelation, String portionId,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_VCMSPARELATION_WHERE);

		if (portionId == null) {
			query.append(_FINDER_COLUMN_PORTION_PORTIONID_1);
		}
		else {
			if (portionId.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_PORTION_PORTIONID_3);
			}
			else {
				query.append(_FINDER_COLUMN_PORTION_PORTIONID_2);
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
			query.append(VcmsPARelationModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		if (portionId != null) {
			qPos.add(portionId);
		}

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByValues(vcmsPARelation);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<VcmsPARelation> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Finds all the vcms p a relations where articleId = &#63;.
	 *
	 * @param articleId the article id to search with
	 * @return the matching vcms p a relations
	 * @throws SystemException if a system exception occurred
	 */
	public List<VcmsPARelation> findByArticle(String articleId)
		throws SystemException {
		return findByArticle(articleId, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
			null);
	}

	/**
	 * Finds a range of all the vcms p a relations where articleId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param articleId the article id to search with
	 * @param start the lower bound of the range of vcms p a relations to return
	 * @param end the upper bound of the range of vcms p a relations to return (not inclusive)
	 * @return the range of matching vcms p a relations
	 * @throws SystemException if a system exception occurred
	 */
	public List<VcmsPARelation> findByArticle(String articleId, int start,
		int end) throws SystemException {
		return findByArticle(articleId, start, end, null);
	}

	/**
	 * Finds an ordered range of all the vcms p a relations where articleId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param articleId the article id to search with
	 * @param start the lower bound of the range of vcms p a relations to return
	 * @param end the upper bound of the range of vcms p a relations to return (not inclusive)
	 * @param orderByComparator the comparator to order the results by
	 * @return the ordered range of matching vcms p a relations
	 * @throws SystemException if a system exception occurred
	 */
	public List<VcmsPARelation> findByArticle(String articleId, int start,
		int end, OrderByComparator orderByComparator) throws SystemException {
		Object[] finderArgs = new Object[] {
				articleId,
				
				String.valueOf(start), String.valueOf(end),
				String.valueOf(orderByComparator)
			};

		List<VcmsPARelation> list = (List<VcmsPARelation>)FinderCacheUtil.getResult(FINDER_PATH_FIND_BY_ARTICLE,
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

			query.append(_SQL_SELECT_VCMSPARELATION_WHERE);

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
				query.append(VcmsPARelationModelImpl.ORDER_BY_JPQL);
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

				list = (List<VcmsPARelation>)QueryUtil.list(q, getDialect(),
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
	 * Finds the first vcms p a relation in the ordered set where articleId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param articleId the article id to search with
	 * @param orderByComparator the comparator to order the set by
	 * @return the first matching vcms p a relation
	 * @throws com.vportal.portlet.vcms.NoSuchVcmsPARelationException if a matching vcms p a relation could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public VcmsPARelation findByArticle_First(String articleId,
		OrderByComparator orderByComparator)
		throws NoSuchVcmsPARelationException, SystemException {
		List<VcmsPARelation> list = findByArticle(articleId, 0, 1,
				orderByComparator);

		if (list.isEmpty()) {
			StringBundler msg = new StringBundler(4);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("articleId=");
			msg.append(articleId);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			throw new NoSuchVcmsPARelationException(msg.toString());
		}
		else {
			return list.get(0);
		}
	}

	/**
	 * Finds the last vcms p a relation in the ordered set where articleId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param articleId the article id to search with
	 * @param orderByComparator the comparator to order the set by
	 * @return the last matching vcms p a relation
	 * @throws com.vportal.portlet.vcms.NoSuchVcmsPARelationException if a matching vcms p a relation could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public VcmsPARelation findByArticle_Last(String articleId,
		OrderByComparator orderByComparator)
		throws NoSuchVcmsPARelationException, SystemException {
		int count = countByArticle(articleId);

		List<VcmsPARelation> list = findByArticle(articleId, count - 1, count,
				orderByComparator);

		if (list.isEmpty()) {
			StringBundler msg = new StringBundler(4);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("articleId=");
			msg.append(articleId);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			throw new NoSuchVcmsPARelationException(msg.toString());
		}
		else {
			return list.get(0);
		}
	}

	/**
	 * Finds the vcms p a relations before and after the current vcms p a relation in the ordered set where articleId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param vcmsPARelationPK the primary key of the current vcms p a relation
	 * @param articleId the article id to search with
	 * @param orderByComparator the comparator to order the set by
	 * @return the previous, current, and next vcms p a relation
	 * @throws com.vportal.portlet.vcms.NoSuchVcmsPARelationException if a vcms p a relation with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public VcmsPARelation[] findByArticle_PrevAndNext(
		VcmsPARelationPK vcmsPARelationPK, String articleId,
		OrderByComparator orderByComparator)
		throws NoSuchVcmsPARelationException, SystemException {
		VcmsPARelation vcmsPARelation = findByPrimaryKey(vcmsPARelationPK);

		Session session = null;

		try {
			session = openSession();

			VcmsPARelation[] array = new VcmsPARelationImpl[3];

			array[0] = getByArticle_PrevAndNext(session, vcmsPARelation,
					articleId, orderByComparator, true);

			array[1] = vcmsPARelation;

			array[2] = getByArticle_PrevAndNext(session, vcmsPARelation,
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

	protected VcmsPARelation getByArticle_PrevAndNext(Session session,
		VcmsPARelation vcmsPARelation, String articleId,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_VCMSPARELATION_WHERE);

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
			query.append(VcmsPARelationModelImpl.ORDER_BY_JPQL);
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
			Object[] values = orderByComparator.getOrderByValues(vcmsPARelation);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<VcmsPARelation> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Finds all the vcms p a relations.
	 *
	 * @return the vcms p a relations
	 * @throws SystemException if a system exception occurred
	 */
	public List<VcmsPARelation> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Finds a range of all the vcms p a relations.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param start the lower bound of the range of vcms p a relations to return
	 * @param end the upper bound of the range of vcms p a relations to return (not inclusive)
	 * @return the range of vcms p a relations
	 * @throws SystemException if a system exception occurred
	 */
	public List<VcmsPARelation> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Finds an ordered range of all the vcms p a relations.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param start the lower bound of the range of vcms p a relations to return
	 * @param end the upper bound of the range of vcms p a relations to return (not inclusive)
	 * @param orderByComparator the comparator to order the results by
	 * @return the ordered range of vcms p a relations
	 * @throws SystemException if a system exception occurred
	 */
	public List<VcmsPARelation> findAll(int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		Object[] finderArgs = new Object[] {
				String.valueOf(start), String.valueOf(end),
				String.valueOf(orderByComparator)
			};

		List<VcmsPARelation> list = (List<VcmsPARelation>)FinderCacheUtil.getResult(FINDER_PATH_FIND_ALL,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_VCMSPARELATION);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_VCMSPARELATION.concat(VcmsPARelationModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (orderByComparator == null) {
					list = (List<VcmsPARelation>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);
				}
				else {
					list = (List<VcmsPARelation>)QueryUtil.list(q,
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
	 * Removes all the vcms p a relations where portionId = &#63; from the database.
	 *
	 * @param portionId the portion id to search with
	 * @throws SystemException if a system exception occurred
	 */
	public void removeByPortion(String portionId) throws SystemException {
		for (VcmsPARelation vcmsPARelation : findByPortion(portionId)) {
			remove(vcmsPARelation);
		}
	}

	/**
	 * Removes all the vcms p a relations where articleId = &#63; from the database.
	 *
	 * @param articleId the article id to search with
	 * @throws SystemException if a system exception occurred
	 */
	public void removeByArticle(String articleId) throws SystemException {
		for (VcmsPARelation vcmsPARelation : findByArticle(articleId)) {
			remove(vcmsPARelation);
		}
	}

	/**
	 * Removes all the vcms p a relations from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	public void removeAll() throws SystemException {
		for (VcmsPARelation vcmsPARelation : findAll()) {
			remove(vcmsPARelation);
		}
	}

	/**
	 * Counts all the vcms p a relations where portionId = &#63;.
	 *
	 * @param portionId the portion id to search with
	 * @return the number of matching vcms p a relations
	 * @throws SystemException if a system exception occurred
	 */
	public int countByPortion(String portionId) throws SystemException {
		Object[] finderArgs = new Object[] { portionId };

		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_BY_PORTION,
				finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_VCMSPARELATION_WHERE);

			if (portionId == null) {
				query.append(_FINDER_COLUMN_PORTION_PORTIONID_1);
			}
			else {
				if (portionId.equals(StringPool.BLANK)) {
					query.append(_FINDER_COLUMN_PORTION_PORTIONID_3);
				}
				else {
					query.append(_FINDER_COLUMN_PORTION_PORTIONID_2);
				}
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (portionId != null) {
					qPos.add(portionId);
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

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_PORTION,
					finderArgs, count);

				closeSession(session);
			}
		}

		return count.intValue();
	}

	/**
	 * Counts all the vcms p a relations where articleId = &#63;.
	 *
	 * @param articleId the article id to search with
	 * @return the number of matching vcms p a relations
	 * @throws SystemException if a system exception occurred
	 */
	public int countByArticle(String articleId) throws SystemException {
		Object[] finderArgs = new Object[] { articleId };

		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_BY_ARTICLE,
				finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_VCMSPARELATION_WHERE);

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
	 * Counts all the vcms p a relations.
	 *
	 * @return the number of vcms p a relations
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

				Query q = session.createQuery(_SQL_COUNT_VCMSPARELATION);

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
	 * Initializes the vcms p a relation persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.com.vportal.portlet.vcms.model.VcmsPARelation")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<VcmsPARelation>> listenersList = new ArrayList<ModelListener<VcmsPARelation>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<VcmsPARelation>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(VcmsPARelationImpl.class.getName());
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
	private static final String _SQL_SELECT_VCMSPARELATION = "SELECT vcmsPARelation FROM VcmsPARelation vcmsPARelation";
	private static final String _SQL_SELECT_VCMSPARELATION_WHERE = "SELECT vcmsPARelation FROM VcmsPARelation vcmsPARelation WHERE ";
	private static final String _SQL_COUNT_VCMSPARELATION = "SELECT COUNT(vcmsPARelation) FROM VcmsPARelation vcmsPARelation";
	private static final String _SQL_COUNT_VCMSPARELATION_WHERE = "SELECT COUNT(vcmsPARelation) FROM VcmsPARelation vcmsPARelation WHERE ";
	private static final String _FINDER_COLUMN_PORTION_PORTIONID_1 = "vcmsPARelation.id.portionId IS NULL";
	private static final String _FINDER_COLUMN_PORTION_PORTIONID_2 = "vcmsPARelation.id.portionId = ?";
	private static final String _FINDER_COLUMN_PORTION_PORTIONID_3 = "(vcmsPARelation.id.portionId IS NULL OR vcmsPARelation.id.portionId = ?)";
	private static final String _FINDER_COLUMN_ARTICLE_ARTICLEID_1 = "vcmsPARelation.id.articleId IS NULL";
	private static final String _FINDER_COLUMN_ARTICLE_ARTICLEID_2 = "vcmsPARelation.id.articleId = ?";
	private static final String _FINDER_COLUMN_ARTICLE_ARTICLEID_3 = "(vcmsPARelation.id.articleId IS NULL OR vcmsPARelation.id.articleId = ?)";
	private static final String _ORDER_BY_ENTITY_ALIAS = "vcmsPARelation.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No VcmsPARelation exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No VcmsPARelation exists with the key {";
	private static Log _log = LogFactoryUtil.getLog(VcmsPARelationPersistenceImpl.class);
}