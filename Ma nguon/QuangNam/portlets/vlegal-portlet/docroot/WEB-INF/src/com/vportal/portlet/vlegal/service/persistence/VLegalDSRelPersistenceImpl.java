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

import com.vportal.portlet.vlegal.NoSuchVLegalDSRelException;
import com.vportal.portlet.vlegal.model.VLegalDSRel;
import com.vportal.portlet.vlegal.model.impl.VLegalDSRelImpl;
import com.vportal.portlet.vlegal.model.impl.VLegalDSRelModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The persistence implementation for the v legal d s rel service.
 *
 * <p>
 * Never modify or reference this class directly. Always use {@link VLegalDSRelUtil} to access the v legal d s rel persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
 * </p>
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author ACB
 * @see VLegalDSRelPersistence
 * @see VLegalDSRelUtil
 * @generated
 */
public class VLegalDSRelPersistenceImpl extends BasePersistenceImpl<VLegalDSRel>
	implements VLegalDSRelPersistence {
	public static final String FINDER_CLASS_NAME_ENTITY = VLegalDSRelImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST = FINDER_CLASS_NAME_ENTITY +
		".List";
	public static final FinderPath FINDER_PATH_FIND_BY_SIGNER = new FinderPath(VLegalDSRelModelImpl.ENTITY_CACHE_ENABLED,
			VLegalDSRelModelImpl.FINDER_CACHE_ENABLED, FINDER_CLASS_NAME_LIST,
			"findBySigner",
			new String[] {
				String.class.getName(),
				
			"java.lang.Integer", "java.lang.Integer",
				"com.liferay.portal.kernel.util.OrderByComparator"
			});
	public static final FinderPath FINDER_PATH_COUNT_BY_SIGNER = new FinderPath(VLegalDSRelModelImpl.ENTITY_CACHE_ENABLED,
			VLegalDSRelModelImpl.FINDER_CACHE_ENABLED, FINDER_CLASS_NAME_LIST,
			"countBySigner", new String[] { String.class.getName() });
	public static final FinderPath FINDER_PATH_FIND_BY_DOC = new FinderPath(VLegalDSRelModelImpl.ENTITY_CACHE_ENABLED,
			VLegalDSRelModelImpl.FINDER_CACHE_ENABLED, FINDER_CLASS_NAME_LIST,
			"findByDoc",
			new String[] {
				String.class.getName(),
				
			"java.lang.Integer", "java.lang.Integer",
				"com.liferay.portal.kernel.util.OrderByComparator"
			});
	public static final FinderPath FINDER_PATH_COUNT_BY_DOC = new FinderPath(VLegalDSRelModelImpl.ENTITY_CACHE_ENABLED,
			VLegalDSRelModelImpl.FINDER_CACHE_ENABLED, FINDER_CLASS_NAME_LIST,
			"countByDoc", new String[] { String.class.getName() });
	public static final FinderPath FINDER_PATH_FIND_ALL = new FinderPath(VLegalDSRelModelImpl.ENTITY_CACHE_ENABLED,
			VLegalDSRelModelImpl.FINDER_CACHE_ENABLED, FINDER_CLASS_NAME_LIST,
			"findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(VLegalDSRelModelImpl.ENTITY_CACHE_ENABLED,
			VLegalDSRelModelImpl.FINDER_CACHE_ENABLED, FINDER_CLASS_NAME_LIST,
			"countAll", new String[0]);

	/**
	 * Caches the v legal d s rel in the entity cache if it is enabled.
	 *
	 * @param vLegalDSRel the v legal d s rel to cache
	 */
	public void cacheResult(VLegalDSRel vLegalDSRel) {
		EntityCacheUtil.putResult(VLegalDSRelModelImpl.ENTITY_CACHE_ENABLED,
			VLegalDSRelImpl.class, vLegalDSRel.getPrimaryKey(), vLegalDSRel);
	}

	/**
	 * Caches the v legal d s rels in the entity cache if it is enabled.
	 *
	 * @param vLegalDSRels the v legal d s rels to cache
	 */
	public void cacheResult(List<VLegalDSRel> vLegalDSRels) {
		for (VLegalDSRel vLegalDSRel : vLegalDSRels) {
			if (EntityCacheUtil.getResult(
						VLegalDSRelModelImpl.ENTITY_CACHE_ENABLED,
						VLegalDSRelImpl.class, vLegalDSRel.getPrimaryKey(), this) == null) {
				cacheResult(vLegalDSRel);
			}
		}
	}

	/**
	 * Clears the cache for all v legal d s rels.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	public void clearCache() {
		CacheRegistryUtil.clear(VLegalDSRelImpl.class.getName());
		EntityCacheUtil.clearCache(VLegalDSRelImpl.class.getName());
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST);
	}

	/**
	 * Clears the cache for the v legal d s rel.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	public void clearCache(VLegalDSRel vLegalDSRel) {
		EntityCacheUtil.removeResult(VLegalDSRelModelImpl.ENTITY_CACHE_ENABLED,
			VLegalDSRelImpl.class, vLegalDSRel.getPrimaryKey());
	}

	/**
	 * Creates a new v legal d s rel with the primary key. Does not add the v legal d s rel to the database.
	 *
	 * @param vLegalDSRelPK the primary key for the new v legal d s rel
	 * @return the new v legal d s rel
	 */
	public VLegalDSRel create(VLegalDSRelPK vLegalDSRelPK) {
		VLegalDSRel vLegalDSRel = new VLegalDSRelImpl();

		vLegalDSRel.setNew(true);
		vLegalDSRel.setPrimaryKey(vLegalDSRelPK);

		return vLegalDSRel;
	}

	/**
	 * Removes the v legal d s rel with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the v legal d s rel to remove
	 * @return the v legal d s rel that was removed
	 * @throws com.liferay.portal.NoSuchModelException if a v legal d s rel with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public VLegalDSRel remove(Serializable primaryKey)
		throws NoSuchModelException, SystemException {
		return remove((VLegalDSRelPK)primaryKey);
	}

	/**
	 * Removes the v legal d s rel with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param vLegalDSRelPK the primary key of the v legal d s rel to remove
	 * @return the v legal d s rel that was removed
	 * @throws com.vportal.portlet.vlegal.NoSuchVLegalDSRelException if a v legal d s rel with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public VLegalDSRel remove(VLegalDSRelPK vLegalDSRelPK)
		throws NoSuchVLegalDSRelException, SystemException {
		Session session = null;

		try {
			session = openSession();

			VLegalDSRel vLegalDSRel = (VLegalDSRel)session.get(VLegalDSRelImpl.class,
					vLegalDSRelPK);

			if (vLegalDSRel == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + vLegalDSRelPK);
				}

				throw new NoSuchVLegalDSRelException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					vLegalDSRelPK);
			}

			return remove(vLegalDSRel);
		}
		catch (NoSuchVLegalDSRelException nsee) {
			throw nsee;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected VLegalDSRel removeImpl(VLegalDSRel vLegalDSRel)
		throws SystemException {
		vLegalDSRel = toUnwrappedModel(vLegalDSRel);

		Session session = null;

		try {
			session = openSession();

			BatchSessionUtil.delete(session, vLegalDSRel);
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST);

		EntityCacheUtil.removeResult(VLegalDSRelModelImpl.ENTITY_CACHE_ENABLED,
			VLegalDSRelImpl.class, vLegalDSRel.getPrimaryKey());

		return vLegalDSRel;
	}

	public VLegalDSRel updateImpl(
		com.vportal.portlet.vlegal.model.VLegalDSRel vLegalDSRel, boolean merge)
		throws SystemException {
		vLegalDSRel = toUnwrappedModel(vLegalDSRel);

		Session session = null;

		try {
			session = openSession();

			BatchSessionUtil.update(session, vLegalDSRel, merge);

			vLegalDSRel.setNew(false);
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST);

		EntityCacheUtil.putResult(VLegalDSRelModelImpl.ENTITY_CACHE_ENABLED,
			VLegalDSRelImpl.class, vLegalDSRel.getPrimaryKey(), vLegalDSRel);

		return vLegalDSRel;
	}

	protected VLegalDSRel toUnwrappedModel(VLegalDSRel vLegalDSRel) {
		if (vLegalDSRel instanceof VLegalDSRelImpl) {
			return vLegalDSRel;
		}

		VLegalDSRelImpl vLegalDSRelImpl = new VLegalDSRelImpl();

		vLegalDSRelImpl.setNew(vLegalDSRel.isNew());
		vLegalDSRelImpl.setPrimaryKey(vLegalDSRel.getPrimaryKey());

		vLegalDSRelImpl.setSigId(vLegalDSRel.getSigId());
		vLegalDSRelImpl.setDocId(vLegalDSRel.getDocId());

		return vLegalDSRelImpl;
	}

	/**
	 * Finds the v legal d s rel with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the v legal d s rel to find
	 * @return the v legal d s rel
	 * @throws com.liferay.portal.NoSuchModelException if a v legal d s rel with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public VLegalDSRel findByPrimaryKey(Serializable primaryKey)
		throws NoSuchModelException, SystemException {
		return findByPrimaryKey((VLegalDSRelPK)primaryKey);
	}

	/**
	 * Finds the v legal d s rel with the primary key or throws a {@link com.vportal.portlet.vlegal.NoSuchVLegalDSRelException} if it could not be found.
	 *
	 * @param vLegalDSRelPK the primary key of the v legal d s rel to find
	 * @return the v legal d s rel
	 * @throws com.vportal.portlet.vlegal.NoSuchVLegalDSRelException if a v legal d s rel with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public VLegalDSRel findByPrimaryKey(VLegalDSRelPK vLegalDSRelPK)
		throws NoSuchVLegalDSRelException, SystemException {
		VLegalDSRel vLegalDSRel = fetchByPrimaryKey(vLegalDSRelPK);

		if (vLegalDSRel == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + vLegalDSRelPK);
			}

			throw new NoSuchVLegalDSRelException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				vLegalDSRelPK);
		}

		return vLegalDSRel;
	}

	/**
	 * Finds the v legal d s rel with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the v legal d s rel to find
	 * @return the v legal d s rel, or <code>null</code> if a v legal d s rel with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public VLegalDSRel fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		return fetchByPrimaryKey((VLegalDSRelPK)primaryKey);
	}

	/**
	 * Finds the v legal d s rel with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param vLegalDSRelPK the primary key of the v legal d s rel to find
	 * @return the v legal d s rel, or <code>null</code> if a v legal d s rel with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public VLegalDSRel fetchByPrimaryKey(VLegalDSRelPK vLegalDSRelPK)
		throws SystemException {
		VLegalDSRel vLegalDSRel = (VLegalDSRel)EntityCacheUtil.getResult(VLegalDSRelModelImpl.ENTITY_CACHE_ENABLED,
				VLegalDSRelImpl.class, vLegalDSRelPK, this);

		if (vLegalDSRel == null) {
			Session session = null;

			try {
				session = openSession();

				vLegalDSRel = (VLegalDSRel)session.get(VLegalDSRelImpl.class,
						vLegalDSRelPK);
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (vLegalDSRel != null) {
					cacheResult(vLegalDSRel);
				}

				closeSession(session);
			}
		}

		return vLegalDSRel;
	}

	/**
	 * Finds all the v legal d s rels where sigId = &#63;.
	 *
	 * @param sigId the sig id to search with
	 * @return the matching v legal d s rels
	 * @throws SystemException if a system exception occurred
	 */
	public List<VLegalDSRel> findBySigner(String sigId)
		throws SystemException {
		return findBySigner(sigId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Finds a range of all the v legal d s rels where sigId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param sigId the sig id to search with
	 * @param start the lower bound of the range of v legal d s rels to return
	 * @param end the upper bound of the range of v legal d s rels to return (not inclusive)
	 * @return the range of matching v legal d s rels
	 * @throws SystemException if a system exception occurred
	 */
	public List<VLegalDSRel> findBySigner(String sigId, int start, int end)
		throws SystemException {
		return findBySigner(sigId, start, end, null);
	}

	/**
	 * Finds an ordered range of all the v legal d s rels where sigId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param sigId the sig id to search with
	 * @param start the lower bound of the range of v legal d s rels to return
	 * @param end the upper bound of the range of v legal d s rels to return (not inclusive)
	 * @param orderByComparator the comparator to order the results by
	 * @return the ordered range of matching v legal d s rels
	 * @throws SystemException if a system exception occurred
	 */
	public List<VLegalDSRel> findBySigner(String sigId, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		Object[] finderArgs = new Object[] {
				sigId,
				
				String.valueOf(start), String.valueOf(end),
				String.valueOf(orderByComparator)
			};

		List<VLegalDSRel> list = (List<VLegalDSRel>)FinderCacheUtil.getResult(FINDER_PATH_FIND_BY_SIGNER,
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

			query.append(_SQL_SELECT_VLEGALDSREL_WHERE);

			if (sigId == null) {
				query.append(_FINDER_COLUMN_SIGNER_SIGID_1);
			}
			else {
				if (sigId.equals(StringPool.BLANK)) {
					query.append(_FINDER_COLUMN_SIGNER_SIGID_3);
				}
				else {
					query.append(_FINDER_COLUMN_SIGNER_SIGID_2);
				}
			}

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}

			else {
				query.append(VLegalDSRelModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (sigId != null) {
					qPos.add(sigId);
				}

				list = (List<VLegalDSRel>)QueryUtil.list(q, getDialect(),
						start, end);
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (list == null) {
					FinderCacheUtil.removeResult(FINDER_PATH_FIND_BY_SIGNER,
						finderArgs);
				}
				else {
					cacheResult(list);

					FinderCacheUtil.putResult(FINDER_PATH_FIND_BY_SIGNER,
						finderArgs, list);
				}

				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Finds the first v legal d s rel in the ordered set where sigId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param sigId the sig id to search with
	 * @param orderByComparator the comparator to order the set by
	 * @return the first matching v legal d s rel
	 * @throws com.vportal.portlet.vlegal.NoSuchVLegalDSRelException if a matching v legal d s rel could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public VLegalDSRel findBySigner_First(String sigId,
		OrderByComparator orderByComparator)
		throws NoSuchVLegalDSRelException, SystemException {
		List<VLegalDSRel> list = findBySigner(sigId, 0, 1, orderByComparator);

		if (list.isEmpty()) {
			StringBundler msg = new StringBundler(4);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("sigId=");
			msg.append(sigId);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			throw new NoSuchVLegalDSRelException(msg.toString());
		}
		else {
			return list.get(0);
		}
	}

	/**
	 * Finds the last v legal d s rel in the ordered set where sigId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param sigId the sig id to search with
	 * @param orderByComparator the comparator to order the set by
	 * @return the last matching v legal d s rel
	 * @throws com.vportal.portlet.vlegal.NoSuchVLegalDSRelException if a matching v legal d s rel could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public VLegalDSRel findBySigner_Last(String sigId,
		OrderByComparator orderByComparator)
		throws NoSuchVLegalDSRelException, SystemException {
		int count = countBySigner(sigId);

		List<VLegalDSRel> list = findBySigner(sigId, count - 1, count,
				orderByComparator);

		if (list.isEmpty()) {
			StringBundler msg = new StringBundler(4);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("sigId=");
			msg.append(sigId);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			throw new NoSuchVLegalDSRelException(msg.toString());
		}
		else {
			return list.get(0);
		}
	}

	/**
	 * Finds the v legal d s rels before and after the current v legal d s rel in the ordered set where sigId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param vLegalDSRelPK the primary key of the current v legal d s rel
	 * @param sigId the sig id to search with
	 * @param orderByComparator the comparator to order the set by
	 * @return the previous, current, and next v legal d s rel
	 * @throws com.vportal.portlet.vlegal.NoSuchVLegalDSRelException if a v legal d s rel with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public VLegalDSRel[] findBySigner_PrevAndNext(VLegalDSRelPK vLegalDSRelPK,
		String sigId, OrderByComparator orderByComparator)
		throws NoSuchVLegalDSRelException, SystemException {
		VLegalDSRel vLegalDSRel = findByPrimaryKey(vLegalDSRelPK);

		Session session = null;

		try {
			session = openSession();

			VLegalDSRel[] array = new VLegalDSRelImpl[3];

			array[0] = getBySigner_PrevAndNext(session, vLegalDSRel, sigId,
					orderByComparator, true);

			array[1] = vLegalDSRel;

			array[2] = getBySigner_PrevAndNext(session, vLegalDSRel, sigId,
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

	protected VLegalDSRel getBySigner_PrevAndNext(Session session,
		VLegalDSRel vLegalDSRel, String sigId,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_VLEGALDSREL_WHERE);

		if (sigId == null) {
			query.append(_FINDER_COLUMN_SIGNER_SIGID_1);
		}
		else {
			if (sigId.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_SIGNER_SIGID_3);
			}
			else {
				query.append(_FINDER_COLUMN_SIGNER_SIGID_2);
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
			query.append(VLegalDSRelModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		if (sigId != null) {
			qPos.add(sigId);
		}

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByValues(vLegalDSRel);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<VLegalDSRel> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Finds all the v legal d s rels where docId = &#63;.
	 *
	 * @param docId the doc id to search with
	 * @return the matching v legal d s rels
	 * @throws SystemException if a system exception occurred
	 */
	public List<VLegalDSRel> findByDoc(String docId) throws SystemException {
		return findByDoc(docId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Finds a range of all the v legal d s rels where docId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param docId the doc id to search with
	 * @param start the lower bound of the range of v legal d s rels to return
	 * @param end the upper bound of the range of v legal d s rels to return (not inclusive)
	 * @return the range of matching v legal d s rels
	 * @throws SystemException if a system exception occurred
	 */
	public List<VLegalDSRel> findByDoc(String docId, int start, int end)
		throws SystemException {
		return findByDoc(docId, start, end, null);
	}

	/**
	 * Finds an ordered range of all the v legal d s rels where docId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param docId the doc id to search with
	 * @param start the lower bound of the range of v legal d s rels to return
	 * @param end the upper bound of the range of v legal d s rels to return (not inclusive)
	 * @param orderByComparator the comparator to order the results by
	 * @return the ordered range of matching v legal d s rels
	 * @throws SystemException if a system exception occurred
	 */
	public List<VLegalDSRel> findByDoc(String docId, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		Object[] finderArgs = new Object[] {
				docId,
				
				String.valueOf(start), String.valueOf(end),
				String.valueOf(orderByComparator)
			};

		List<VLegalDSRel> list = (List<VLegalDSRel>)FinderCacheUtil.getResult(FINDER_PATH_FIND_BY_DOC,
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

			query.append(_SQL_SELECT_VLEGALDSREL_WHERE);

			if (docId == null) {
				query.append(_FINDER_COLUMN_DOC_DOCID_1);
			}
			else {
				if (docId.equals(StringPool.BLANK)) {
					query.append(_FINDER_COLUMN_DOC_DOCID_3);
				}
				else {
					query.append(_FINDER_COLUMN_DOC_DOCID_2);
				}
			}

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}

			else {
				query.append(VLegalDSRelModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (docId != null) {
					qPos.add(docId);
				}

				list = (List<VLegalDSRel>)QueryUtil.list(q, getDialect(),
						start, end);
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (list == null) {
					FinderCacheUtil.removeResult(FINDER_PATH_FIND_BY_DOC,
						finderArgs);
				}
				else {
					cacheResult(list);

					FinderCacheUtil.putResult(FINDER_PATH_FIND_BY_DOC,
						finderArgs, list);
				}

				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Finds the first v legal d s rel in the ordered set where docId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param docId the doc id to search with
	 * @param orderByComparator the comparator to order the set by
	 * @return the first matching v legal d s rel
	 * @throws com.vportal.portlet.vlegal.NoSuchVLegalDSRelException if a matching v legal d s rel could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public VLegalDSRel findByDoc_First(String docId,
		OrderByComparator orderByComparator)
		throws NoSuchVLegalDSRelException, SystemException {
		List<VLegalDSRel> list = findByDoc(docId, 0, 1, orderByComparator);

		if (list.isEmpty()) {
			StringBundler msg = new StringBundler(4);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("docId=");
			msg.append(docId);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			throw new NoSuchVLegalDSRelException(msg.toString());
		}
		else {
			return list.get(0);
		}
	}

	/**
	 * Finds the last v legal d s rel in the ordered set where docId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param docId the doc id to search with
	 * @param orderByComparator the comparator to order the set by
	 * @return the last matching v legal d s rel
	 * @throws com.vportal.portlet.vlegal.NoSuchVLegalDSRelException if a matching v legal d s rel could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public VLegalDSRel findByDoc_Last(String docId,
		OrderByComparator orderByComparator)
		throws NoSuchVLegalDSRelException, SystemException {
		int count = countByDoc(docId);

		List<VLegalDSRel> list = findByDoc(docId, count - 1, count,
				orderByComparator);

		if (list.isEmpty()) {
			StringBundler msg = new StringBundler(4);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("docId=");
			msg.append(docId);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			throw new NoSuchVLegalDSRelException(msg.toString());
		}
		else {
			return list.get(0);
		}
	}

	/**
	 * Finds the v legal d s rels before and after the current v legal d s rel in the ordered set where docId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param vLegalDSRelPK the primary key of the current v legal d s rel
	 * @param docId the doc id to search with
	 * @param orderByComparator the comparator to order the set by
	 * @return the previous, current, and next v legal d s rel
	 * @throws com.vportal.portlet.vlegal.NoSuchVLegalDSRelException if a v legal d s rel with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public VLegalDSRel[] findByDoc_PrevAndNext(VLegalDSRelPK vLegalDSRelPK,
		String docId, OrderByComparator orderByComparator)
		throws NoSuchVLegalDSRelException, SystemException {
		VLegalDSRel vLegalDSRel = findByPrimaryKey(vLegalDSRelPK);

		Session session = null;

		try {
			session = openSession();

			VLegalDSRel[] array = new VLegalDSRelImpl[3];

			array[0] = getByDoc_PrevAndNext(session, vLegalDSRel, docId,
					orderByComparator, true);

			array[1] = vLegalDSRel;

			array[2] = getByDoc_PrevAndNext(session, vLegalDSRel, docId,
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

	protected VLegalDSRel getByDoc_PrevAndNext(Session session,
		VLegalDSRel vLegalDSRel, String docId,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_VLEGALDSREL_WHERE);

		if (docId == null) {
			query.append(_FINDER_COLUMN_DOC_DOCID_1);
		}
		else {
			if (docId.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_DOC_DOCID_3);
			}
			else {
				query.append(_FINDER_COLUMN_DOC_DOCID_2);
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
			query.append(VLegalDSRelModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		if (docId != null) {
			qPos.add(docId);
		}

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByValues(vLegalDSRel);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<VLegalDSRel> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Finds all the v legal d s rels.
	 *
	 * @return the v legal d s rels
	 * @throws SystemException if a system exception occurred
	 */
	public List<VLegalDSRel> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Finds a range of all the v legal d s rels.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param start the lower bound of the range of v legal d s rels to return
	 * @param end the upper bound of the range of v legal d s rels to return (not inclusive)
	 * @return the range of v legal d s rels
	 * @throws SystemException if a system exception occurred
	 */
	public List<VLegalDSRel> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Finds an ordered range of all the v legal d s rels.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param start the lower bound of the range of v legal d s rels to return
	 * @param end the upper bound of the range of v legal d s rels to return (not inclusive)
	 * @param orderByComparator the comparator to order the results by
	 * @return the ordered range of v legal d s rels
	 * @throws SystemException if a system exception occurred
	 */
	public List<VLegalDSRel> findAll(int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		Object[] finderArgs = new Object[] {
				String.valueOf(start), String.valueOf(end),
				String.valueOf(orderByComparator)
			};

		List<VLegalDSRel> list = (List<VLegalDSRel>)FinderCacheUtil.getResult(FINDER_PATH_FIND_ALL,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_VLEGALDSREL);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_VLEGALDSREL.concat(VLegalDSRelModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (orderByComparator == null) {
					list = (List<VLegalDSRel>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);
				}
				else {
					list = (List<VLegalDSRel>)QueryUtil.list(q, getDialect(),
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
	 * Removes all the v legal d s rels where sigId = &#63; from the database.
	 *
	 * @param sigId the sig id to search with
	 * @throws SystemException if a system exception occurred
	 */
	public void removeBySigner(String sigId) throws SystemException {
		for (VLegalDSRel vLegalDSRel : findBySigner(sigId)) {
			remove(vLegalDSRel);
		}
	}

	/**
	 * Removes all the v legal d s rels where docId = &#63; from the database.
	 *
	 * @param docId the doc id to search with
	 * @throws SystemException if a system exception occurred
	 */
	public void removeByDoc(String docId) throws SystemException {
		for (VLegalDSRel vLegalDSRel : findByDoc(docId)) {
			remove(vLegalDSRel);
		}
	}

	/**
	 * Removes all the v legal d s rels from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	public void removeAll() throws SystemException {
		for (VLegalDSRel vLegalDSRel : findAll()) {
			remove(vLegalDSRel);
		}
	}

	/**
	 * Counts all the v legal d s rels where sigId = &#63;.
	 *
	 * @param sigId the sig id to search with
	 * @return the number of matching v legal d s rels
	 * @throws SystemException if a system exception occurred
	 */
	public int countBySigner(String sigId) throws SystemException {
		Object[] finderArgs = new Object[] { sigId };

		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_BY_SIGNER,
				finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_VLEGALDSREL_WHERE);

			if (sigId == null) {
				query.append(_FINDER_COLUMN_SIGNER_SIGID_1);
			}
			else {
				if (sigId.equals(StringPool.BLANK)) {
					query.append(_FINDER_COLUMN_SIGNER_SIGID_3);
				}
				else {
					query.append(_FINDER_COLUMN_SIGNER_SIGID_2);
				}
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (sigId != null) {
					qPos.add(sigId);
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

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_SIGNER,
					finderArgs, count);

				closeSession(session);
			}
		}

		return count.intValue();
	}

	/**
	 * Counts all the v legal d s rels where docId = &#63;.
	 *
	 * @param docId the doc id to search with
	 * @return the number of matching v legal d s rels
	 * @throws SystemException if a system exception occurred
	 */
	public int countByDoc(String docId) throws SystemException {
		Object[] finderArgs = new Object[] { docId };

		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_BY_DOC,
				finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_VLEGALDSREL_WHERE);

			if (docId == null) {
				query.append(_FINDER_COLUMN_DOC_DOCID_1);
			}
			else {
				if (docId.equals(StringPool.BLANK)) {
					query.append(_FINDER_COLUMN_DOC_DOCID_3);
				}
				else {
					query.append(_FINDER_COLUMN_DOC_DOCID_2);
				}
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (docId != null) {
					qPos.add(docId);
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

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_DOC, finderArgs,
					count);

				closeSession(session);
			}
		}

		return count.intValue();
	}

	/**
	 * Counts all the v legal d s rels.
	 *
	 * @return the number of v legal d s rels
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

				Query q = session.createQuery(_SQL_COUNT_VLEGALDSREL);

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
	 * Initializes the v legal d s rel persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.com.vportal.portlet.vlegal.model.VLegalDSRel")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<VLegalDSRel>> listenersList = new ArrayList<ModelListener<VLegalDSRel>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<VLegalDSRel>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(VLegalDSRelImpl.class.getName());
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
	private static final String _SQL_SELECT_VLEGALDSREL = "SELECT vLegalDSRel FROM VLegalDSRel vLegalDSRel";
	private static final String _SQL_SELECT_VLEGALDSREL_WHERE = "SELECT vLegalDSRel FROM VLegalDSRel vLegalDSRel WHERE ";
	private static final String _SQL_COUNT_VLEGALDSREL = "SELECT COUNT(vLegalDSRel) FROM VLegalDSRel vLegalDSRel";
	private static final String _SQL_COUNT_VLEGALDSREL_WHERE = "SELECT COUNT(vLegalDSRel) FROM VLegalDSRel vLegalDSRel WHERE ";
	private static final String _FINDER_COLUMN_SIGNER_SIGID_1 = "vLegalDSRel.id.sigId IS NULL";
	private static final String _FINDER_COLUMN_SIGNER_SIGID_2 = "vLegalDSRel.id.sigId = ?";
	private static final String _FINDER_COLUMN_SIGNER_SIGID_3 = "(vLegalDSRel.id.sigId IS NULL OR vLegalDSRel.id.sigId = ?)";
	private static final String _FINDER_COLUMN_DOC_DOCID_1 = "vLegalDSRel.id.docId IS NULL";
	private static final String _FINDER_COLUMN_DOC_DOCID_2 = "vLegalDSRel.id.docId = ?";
	private static final String _FINDER_COLUMN_DOC_DOCID_3 = "(vLegalDSRel.id.docId IS NULL OR vLegalDSRel.id.docId = ?)";
	private static final String _ORDER_BY_ENTITY_ALIAS = "vLegalDSRel.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No VLegalDSRel exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No VLegalDSRel exists with the key {";
	private static Log _log = LogFactoryUtil.getLog(VLegalDSRelPersistenceImpl.class);
}