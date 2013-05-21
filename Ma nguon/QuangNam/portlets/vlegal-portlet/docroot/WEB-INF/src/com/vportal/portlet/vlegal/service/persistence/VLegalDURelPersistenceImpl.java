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

import com.vportal.portlet.vlegal.NoSuchVLegalDURelException;
import com.vportal.portlet.vlegal.model.VLegalDURel;
import com.vportal.portlet.vlegal.model.impl.VLegalDURelImpl;
import com.vportal.portlet.vlegal.model.impl.VLegalDURelModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The persistence implementation for the v legal d u rel service.
 *
 * <p>
 * Never modify or reference this class directly. Always use {@link VLegalDURelUtil} to access the v legal d u rel persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
 * </p>
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author ACB
 * @see VLegalDURelPersistence
 * @see VLegalDURelUtil
 * @generated
 */
public class VLegalDURelPersistenceImpl extends BasePersistenceImpl<VLegalDURel>
	implements VLegalDURelPersistence {
	public static final String FINDER_CLASS_NAME_ENTITY = VLegalDURelImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST = FINDER_CLASS_NAME_ENTITY +
		".List";
	public static final FinderPath FINDER_PATH_FIND_BY_DEPARTAMENT = new FinderPath(VLegalDURelModelImpl.ENTITY_CACHE_ENABLED,
			VLegalDURelModelImpl.FINDER_CACHE_ENABLED, FINDER_CLASS_NAME_LIST,
			"findByDepartament",
			new String[] {
				Long.class.getName(),
				
			"java.lang.Integer", "java.lang.Integer",
				"com.liferay.portal.kernel.util.OrderByComparator"
			});
	public static final FinderPath FINDER_PATH_COUNT_BY_DEPARTAMENT = new FinderPath(VLegalDURelModelImpl.ENTITY_CACHE_ENABLED,
			VLegalDURelModelImpl.FINDER_CACHE_ENABLED, FINDER_CLASS_NAME_LIST,
			"countByDepartament", new String[] { Long.class.getName() });
	public static final FinderPath FINDER_PATH_FIND_BY_USER = new FinderPath(VLegalDURelModelImpl.ENTITY_CACHE_ENABLED,
			VLegalDURelModelImpl.FINDER_CACHE_ENABLED, FINDER_CLASS_NAME_LIST,
			"findByUser",
			new String[] {
				Long.class.getName(),
				
			"java.lang.Integer", "java.lang.Integer",
				"com.liferay.portal.kernel.util.OrderByComparator"
			});
	public static final FinderPath FINDER_PATH_COUNT_BY_USER = new FinderPath(VLegalDURelModelImpl.ENTITY_CACHE_ENABLED,
			VLegalDURelModelImpl.FINDER_CACHE_ENABLED, FINDER_CLASS_NAME_LIST,
			"countByUser", new String[] { Long.class.getName() });
	public static final FinderPath FINDER_PATH_FETCH_BY_USERID = new FinderPath(VLegalDURelModelImpl.ENTITY_CACHE_ENABLED,
			VLegalDURelModelImpl.FINDER_CACHE_ENABLED,
			FINDER_CLASS_NAME_ENTITY, "fetchByUserId",
			new String[] { Long.class.getName() });
	public static final FinderPath FINDER_PATH_COUNT_BY_USERID = new FinderPath(VLegalDURelModelImpl.ENTITY_CACHE_ENABLED,
			VLegalDURelModelImpl.FINDER_CACHE_ENABLED, FINDER_CLASS_NAME_LIST,
			"countByUserId", new String[] { Long.class.getName() });
	public static final FinderPath FINDER_PATH_FIND_ALL = new FinderPath(VLegalDURelModelImpl.ENTITY_CACHE_ENABLED,
			VLegalDURelModelImpl.FINDER_CACHE_ENABLED, FINDER_CLASS_NAME_LIST,
			"findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(VLegalDURelModelImpl.ENTITY_CACHE_ENABLED,
			VLegalDURelModelImpl.FINDER_CACHE_ENABLED, FINDER_CLASS_NAME_LIST,
			"countAll", new String[0]);

	/**
	 * Caches the v legal d u rel in the entity cache if it is enabled.
	 *
	 * @param vLegalDURel the v legal d u rel to cache
	 */
	public void cacheResult(VLegalDURel vLegalDURel) {
		EntityCacheUtil.putResult(VLegalDURelModelImpl.ENTITY_CACHE_ENABLED,
			VLegalDURelImpl.class, vLegalDURel.getPrimaryKey(), vLegalDURel);

		FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_USERID,
			new Object[] { new Long(vLegalDURel.getUserid()) }, vLegalDURel);
	}

	/**
	 * Caches the v legal d u rels in the entity cache if it is enabled.
	 *
	 * @param vLegalDURels the v legal d u rels to cache
	 */
	public void cacheResult(List<VLegalDURel> vLegalDURels) {
		for (VLegalDURel vLegalDURel : vLegalDURels) {
			if (EntityCacheUtil.getResult(
						VLegalDURelModelImpl.ENTITY_CACHE_ENABLED,
						VLegalDURelImpl.class, vLegalDURel.getPrimaryKey(), this) == null) {
				cacheResult(vLegalDURel);
			}
		}
	}

	/**
	 * Clears the cache for all v legal d u rels.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	public void clearCache() {
		CacheRegistryUtil.clear(VLegalDURelImpl.class.getName());
		EntityCacheUtil.clearCache(VLegalDURelImpl.class.getName());
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST);
	}

	/**
	 * Clears the cache for the v legal d u rel.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	public void clearCache(VLegalDURel vLegalDURel) {
		EntityCacheUtil.removeResult(VLegalDURelModelImpl.ENTITY_CACHE_ENABLED,
			VLegalDURelImpl.class, vLegalDURel.getPrimaryKey());

		FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_USERID,
			new Object[] { new Long(vLegalDURel.getUserid()) });
	}

	/**
	 * Creates a new v legal d u rel with the primary key. Does not add the v legal d u rel to the database.
	 *
	 * @param vLegalDURelPK the primary key for the new v legal d u rel
	 * @return the new v legal d u rel
	 */
	public VLegalDURel create(VLegalDURelPK vLegalDURelPK) {
		VLegalDURel vLegalDURel = new VLegalDURelImpl();

		vLegalDURel.setNew(true);
		vLegalDURel.setPrimaryKey(vLegalDURelPK);

		return vLegalDURel;
	}

	/**
	 * Removes the v legal d u rel with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the v legal d u rel to remove
	 * @return the v legal d u rel that was removed
	 * @throws com.liferay.portal.NoSuchModelException if a v legal d u rel with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public VLegalDURel remove(Serializable primaryKey)
		throws NoSuchModelException, SystemException {
		return remove((VLegalDURelPK)primaryKey);
	}

	/**
	 * Removes the v legal d u rel with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param vLegalDURelPK the primary key of the v legal d u rel to remove
	 * @return the v legal d u rel that was removed
	 * @throws com.vportal.portlet.vlegal.NoSuchVLegalDURelException if a v legal d u rel with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public VLegalDURel remove(VLegalDURelPK vLegalDURelPK)
		throws NoSuchVLegalDURelException, SystemException {
		Session session = null;

		try {
			session = openSession();

			VLegalDURel vLegalDURel = (VLegalDURel)session.get(VLegalDURelImpl.class,
					vLegalDURelPK);

			if (vLegalDURel == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + vLegalDURelPK);
				}

				throw new NoSuchVLegalDURelException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					vLegalDURelPK);
			}

			return remove(vLegalDURel);
		}
		catch (NoSuchVLegalDURelException nsee) {
			throw nsee;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected VLegalDURel removeImpl(VLegalDURel vLegalDURel)
		throws SystemException {
		vLegalDURel = toUnwrappedModel(vLegalDURel);

		Session session = null;

		try {
			session = openSession();

			BatchSessionUtil.delete(session, vLegalDURel);
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST);

		VLegalDURelModelImpl vLegalDURelModelImpl = (VLegalDURelModelImpl)vLegalDURel;

		FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_USERID,
			new Object[] { new Long(vLegalDURelModelImpl.getUserid()) });

		EntityCacheUtil.removeResult(VLegalDURelModelImpl.ENTITY_CACHE_ENABLED,
			VLegalDURelImpl.class, vLegalDURel.getPrimaryKey());

		return vLegalDURel;
	}

	public VLegalDURel updateImpl(
		com.vportal.portlet.vlegal.model.VLegalDURel vLegalDURel, boolean merge)
		throws SystemException {
		vLegalDURel = toUnwrappedModel(vLegalDURel);

		boolean isNew = vLegalDURel.isNew();

		VLegalDURelModelImpl vLegalDURelModelImpl = (VLegalDURelModelImpl)vLegalDURel;

		Session session = null;

		try {
			session = openSession();

			BatchSessionUtil.update(session, vLegalDURel, merge);

			vLegalDURel.setNew(false);
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST);

		EntityCacheUtil.putResult(VLegalDURelModelImpl.ENTITY_CACHE_ENABLED,
			VLegalDURelImpl.class, vLegalDURel.getPrimaryKey(), vLegalDURel);

		if (!isNew &&
				(vLegalDURel.getUserid() != vLegalDURelModelImpl.getOriginalUserid())) {
			FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_USERID,
				new Object[] { new Long(vLegalDURelModelImpl.getOriginalUserid()) });
		}

		if (isNew ||
				(vLegalDURel.getUserid() != vLegalDURelModelImpl.getOriginalUserid())) {
			FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_USERID,
				new Object[] { new Long(vLegalDURel.getUserid()) }, vLegalDURel);
		}

		return vLegalDURel;
	}

	protected VLegalDURel toUnwrappedModel(VLegalDURel vLegalDURel) {
		if (vLegalDURel instanceof VLegalDURelImpl) {
			return vLegalDURel;
		}

		VLegalDURelImpl vLegalDURelImpl = new VLegalDURelImpl();

		vLegalDURelImpl.setNew(vLegalDURel.isNew());
		vLegalDURelImpl.setPrimaryKey(vLegalDURel.getPrimaryKey());

		vLegalDURelImpl.setDepartmentId(vLegalDURel.getDepartmentId());
		vLegalDURelImpl.setUserid(vLegalDURel.getUserid());

		return vLegalDURelImpl;
	}

	/**
	 * Finds the v legal d u rel with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the v legal d u rel to find
	 * @return the v legal d u rel
	 * @throws com.liferay.portal.NoSuchModelException if a v legal d u rel with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public VLegalDURel findByPrimaryKey(Serializable primaryKey)
		throws NoSuchModelException, SystemException {
		return findByPrimaryKey((VLegalDURelPK)primaryKey);
	}

	/**
	 * Finds the v legal d u rel with the primary key or throws a {@link com.vportal.portlet.vlegal.NoSuchVLegalDURelException} if it could not be found.
	 *
	 * @param vLegalDURelPK the primary key of the v legal d u rel to find
	 * @return the v legal d u rel
	 * @throws com.vportal.portlet.vlegal.NoSuchVLegalDURelException if a v legal d u rel with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public VLegalDURel findByPrimaryKey(VLegalDURelPK vLegalDURelPK)
		throws NoSuchVLegalDURelException, SystemException {
		VLegalDURel vLegalDURel = fetchByPrimaryKey(vLegalDURelPK);

		if (vLegalDURel == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + vLegalDURelPK);
			}

			throw new NoSuchVLegalDURelException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				vLegalDURelPK);
		}

		return vLegalDURel;
	}

	/**
	 * Finds the v legal d u rel with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the v legal d u rel to find
	 * @return the v legal d u rel, or <code>null</code> if a v legal d u rel with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public VLegalDURel fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		return fetchByPrimaryKey((VLegalDURelPK)primaryKey);
	}

	/**
	 * Finds the v legal d u rel with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param vLegalDURelPK the primary key of the v legal d u rel to find
	 * @return the v legal d u rel, or <code>null</code> if a v legal d u rel with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public VLegalDURel fetchByPrimaryKey(VLegalDURelPK vLegalDURelPK)
		throws SystemException {
		VLegalDURel vLegalDURel = (VLegalDURel)EntityCacheUtil.getResult(VLegalDURelModelImpl.ENTITY_CACHE_ENABLED,
				VLegalDURelImpl.class, vLegalDURelPK, this);

		if (vLegalDURel == null) {
			Session session = null;

			try {
				session = openSession();

				vLegalDURel = (VLegalDURel)session.get(VLegalDURelImpl.class,
						vLegalDURelPK);
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (vLegalDURel != null) {
					cacheResult(vLegalDURel);
				}

				closeSession(session);
			}
		}

		return vLegalDURel;
	}

	/**
	 * Finds all the v legal d u rels where departmentId = &#63;.
	 *
	 * @param departmentId the department id to search with
	 * @return the matching v legal d u rels
	 * @throws SystemException if a system exception occurred
	 */
	public List<VLegalDURel> findByDepartament(long departmentId)
		throws SystemException {
		return findByDepartament(departmentId, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Finds a range of all the v legal d u rels where departmentId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param departmentId the department id to search with
	 * @param start the lower bound of the range of v legal d u rels to return
	 * @param end the upper bound of the range of v legal d u rels to return (not inclusive)
	 * @return the range of matching v legal d u rels
	 * @throws SystemException if a system exception occurred
	 */
	public List<VLegalDURel> findByDepartament(long departmentId, int start,
		int end) throws SystemException {
		return findByDepartament(departmentId, start, end, null);
	}

	/**
	 * Finds an ordered range of all the v legal d u rels where departmentId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param departmentId the department id to search with
	 * @param start the lower bound of the range of v legal d u rels to return
	 * @param end the upper bound of the range of v legal d u rels to return (not inclusive)
	 * @param orderByComparator the comparator to order the results by
	 * @return the ordered range of matching v legal d u rels
	 * @throws SystemException if a system exception occurred
	 */
	public List<VLegalDURel> findByDepartament(long departmentId, int start,
		int end, OrderByComparator orderByComparator) throws SystemException {
		Object[] finderArgs = new Object[] {
				departmentId,
				
				String.valueOf(start), String.valueOf(end),
				String.valueOf(orderByComparator)
			};

		List<VLegalDURel> list = (List<VLegalDURel>)FinderCacheUtil.getResult(FINDER_PATH_FIND_BY_DEPARTAMENT,
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

			query.append(_SQL_SELECT_VLEGALDUREL_WHERE);

			query.append(_FINDER_COLUMN_DEPARTAMENT_DEPARTMENTID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}

			else {
				query.append(VLegalDURelModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(departmentId);

				list = (List<VLegalDURel>)QueryUtil.list(q, getDialect(),
						start, end);
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (list == null) {
					FinderCacheUtil.removeResult(FINDER_PATH_FIND_BY_DEPARTAMENT,
						finderArgs);
				}
				else {
					cacheResult(list);

					FinderCacheUtil.putResult(FINDER_PATH_FIND_BY_DEPARTAMENT,
						finderArgs, list);
				}

				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Finds the first v legal d u rel in the ordered set where departmentId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param departmentId the department id to search with
	 * @param orderByComparator the comparator to order the set by
	 * @return the first matching v legal d u rel
	 * @throws com.vportal.portlet.vlegal.NoSuchVLegalDURelException if a matching v legal d u rel could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public VLegalDURel findByDepartament_First(long departmentId,
		OrderByComparator orderByComparator)
		throws NoSuchVLegalDURelException, SystemException {
		List<VLegalDURel> list = findByDepartament(departmentId, 0, 1,
				orderByComparator);

		if (list.isEmpty()) {
			StringBundler msg = new StringBundler(4);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("departmentId=");
			msg.append(departmentId);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			throw new NoSuchVLegalDURelException(msg.toString());
		}
		else {
			return list.get(0);
		}
	}

	/**
	 * Finds the last v legal d u rel in the ordered set where departmentId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param departmentId the department id to search with
	 * @param orderByComparator the comparator to order the set by
	 * @return the last matching v legal d u rel
	 * @throws com.vportal.portlet.vlegal.NoSuchVLegalDURelException if a matching v legal d u rel could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public VLegalDURel findByDepartament_Last(long departmentId,
		OrderByComparator orderByComparator)
		throws NoSuchVLegalDURelException, SystemException {
		int count = countByDepartament(departmentId);

		List<VLegalDURel> list = findByDepartament(departmentId, count - 1,
				count, orderByComparator);

		if (list.isEmpty()) {
			StringBundler msg = new StringBundler(4);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("departmentId=");
			msg.append(departmentId);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			throw new NoSuchVLegalDURelException(msg.toString());
		}
		else {
			return list.get(0);
		}
	}

	/**
	 * Finds the v legal d u rels before and after the current v legal d u rel in the ordered set where departmentId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param vLegalDURelPK the primary key of the current v legal d u rel
	 * @param departmentId the department id to search with
	 * @param orderByComparator the comparator to order the set by
	 * @return the previous, current, and next v legal d u rel
	 * @throws com.vportal.portlet.vlegal.NoSuchVLegalDURelException if a v legal d u rel with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public VLegalDURel[] findByDepartament_PrevAndNext(
		VLegalDURelPK vLegalDURelPK, long departmentId,
		OrderByComparator orderByComparator)
		throws NoSuchVLegalDURelException, SystemException {
		VLegalDURel vLegalDURel = findByPrimaryKey(vLegalDURelPK);

		Session session = null;

		try {
			session = openSession();

			VLegalDURel[] array = new VLegalDURelImpl[3];

			array[0] = getByDepartament_PrevAndNext(session, vLegalDURel,
					departmentId, orderByComparator, true);

			array[1] = vLegalDURel;

			array[2] = getByDepartament_PrevAndNext(session, vLegalDURel,
					departmentId, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected VLegalDURel getByDepartament_PrevAndNext(Session session,
		VLegalDURel vLegalDURel, long departmentId,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_VLEGALDUREL_WHERE);

		query.append(_FINDER_COLUMN_DEPARTAMENT_DEPARTMENTID_2);

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
			query.append(VLegalDURelModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(departmentId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByValues(vLegalDURel);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<VLegalDURel> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Finds all the v legal d u rels where userid = &#63;.
	 *
	 * @param userid the userid to search with
	 * @return the matching v legal d u rels
	 * @throws SystemException if a system exception occurred
	 */
	public List<VLegalDURel> findByUser(long userid) throws SystemException {
		return findByUser(userid, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Finds a range of all the v legal d u rels where userid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param userid the userid to search with
	 * @param start the lower bound of the range of v legal d u rels to return
	 * @param end the upper bound of the range of v legal d u rels to return (not inclusive)
	 * @return the range of matching v legal d u rels
	 * @throws SystemException if a system exception occurred
	 */
	public List<VLegalDURel> findByUser(long userid, int start, int end)
		throws SystemException {
		return findByUser(userid, start, end, null);
	}

	/**
	 * Finds an ordered range of all the v legal d u rels where userid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param userid the userid to search with
	 * @param start the lower bound of the range of v legal d u rels to return
	 * @param end the upper bound of the range of v legal d u rels to return (not inclusive)
	 * @param orderByComparator the comparator to order the results by
	 * @return the ordered range of matching v legal d u rels
	 * @throws SystemException if a system exception occurred
	 */
	public List<VLegalDURel> findByUser(long userid, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		Object[] finderArgs = new Object[] {
				userid,
				
				String.valueOf(start), String.valueOf(end),
				String.valueOf(orderByComparator)
			};

		List<VLegalDURel> list = (List<VLegalDURel>)FinderCacheUtil.getResult(FINDER_PATH_FIND_BY_USER,
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

			query.append(_SQL_SELECT_VLEGALDUREL_WHERE);

			query.append(_FINDER_COLUMN_USER_USERID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}

			else {
				query.append(VLegalDURelModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(userid);

				list = (List<VLegalDURel>)QueryUtil.list(q, getDialect(),
						start, end);
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (list == null) {
					FinderCacheUtil.removeResult(FINDER_PATH_FIND_BY_USER,
						finderArgs);
				}
				else {
					cacheResult(list);

					FinderCacheUtil.putResult(FINDER_PATH_FIND_BY_USER,
						finderArgs, list);
				}

				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Finds the first v legal d u rel in the ordered set where userid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param userid the userid to search with
	 * @param orderByComparator the comparator to order the set by
	 * @return the first matching v legal d u rel
	 * @throws com.vportal.portlet.vlegal.NoSuchVLegalDURelException if a matching v legal d u rel could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public VLegalDURel findByUser_First(long userid,
		OrderByComparator orderByComparator)
		throws NoSuchVLegalDURelException, SystemException {
		List<VLegalDURel> list = findByUser(userid, 0, 1, orderByComparator);

		if (list.isEmpty()) {
			StringBundler msg = new StringBundler(4);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("userid=");
			msg.append(userid);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			throw new NoSuchVLegalDURelException(msg.toString());
		}
		else {
			return list.get(0);
		}
	}

	/**
	 * Finds the last v legal d u rel in the ordered set where userid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param userid the userid to search with
	 * @param orderByComparator the comparator to order the set by
	 * @return the last matching v legal d u rel
	 * @throws com.vportal.portlet.vlegal.NoSuchVLegalDURelException if a matching v legal d u rel could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public VLegalDURel findByUser_Last(long userid,
		OrderByComparator orderByComparator)
		throws NoSuchVLegalDURelException, SystemException {
		int count = countByUser(userid);

		List<VLegalDURel> list = findByUser(userid, count - 1, count,
				orderByComparator);

		if (list.isEmpty()) {
			StringBundler msg = new StringBundler(4);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("userid=");
			msg.append(userid);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			throw new NoSuchVLegalDURelException(msg.toString());
		}
		else {
			return list.get(0);
		}
	}

	/**
	 * Finds the v legal d u rels before and after the current v legal d u rel in the ordered set where userid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param vLegalDURelPK the primary key of the current v legal d u rel
	 * @param userid the userid to search with
	 * @param orderByComparator the comparator to order the set by
	 * @return the previous, current, and next v legal d u rel
	 * @throws com.vportal.portlet.vlegal.NoSuchVLegalDURelException if a v legal d u rel with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public VLegalDURel[] findByUser_PrevAndNext(VLegalDURelPK vLegalDURelPK,
		long userid, OrderByComparator orderByComparator)
		throws NoSuchVLegalDURelException, SystemException {
		VLegalDURel vLegalDURel = findByPrimaryKey(vLegalDURelPK);

		Session session = null;

		try {
			session = openSession();

			VLegalDURel[] array = new VLegalDURelImpl[3];

			array[0] = getByUser_PrevAndNext(session, vLegalDURel, userid,
					orderByComparator, true);

			array[1] = vLegalDURel;

			array[2] = getByUser_PrevAndNext(session, vLegalDURel, userid,
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

	protected VLegalDURel getByUser_PrevAndNext(Session session,
		VLegalDURel vLegalDURel, long userid,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_VLEGALDUREL_WHERE);

		query.append(_FINDER_COLUMN_USER_USERID_2);

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
			query.append(VLegalDURelModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(userid);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByValues(vLegalDURel);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<VLegalDURel> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Finds the v legal d u rel where userid = &#63; or throws a {@link com.vportal.portlet.vlegal.NoSuchVLegalDURelException} if it could not be found.
	 *
	 * @param userid the userid to search with
	 * @return the matching v legal d u rel
	 * @throws com.vportal.portlet.vlegal.NoSuchVLegalDURelException if a matching v legal d u rel could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public VLegalDURel findByUserId(long userid)
		throws NoSuchVLegalDURelException, SystemException {
		VLegalDURel vLegalDURel = fetchByUserId(userid);

		if (vLegalDURel == null) {
			StringBundler msg = new StringBundler(4);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("userid=");
			msg.append(userid);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			if (_log.isWarnEnabled()) {
				_log.warn(msg.toString());
			}

			throw new NoSuchVLegalDURelException(msg.toString());
		}

		return vLegalDURel;
	}

	/**
	 * Finds the v legal d u rel where userid = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param userid the userid to search with
	 * @return the matching v legal d u rel, or <code>null</code> if a matching v legal d u rel could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public VLegalDURel fetchByUserId(long userid) throws SystemException {
		return fetchByUserId(userid, true);
	}

	/**
	 * Finds the v legal d u rel where userid = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param userid the userid to search with
	 * @return the matching v legal d u rel, or <code>null</code> if a matching v legal d u rel could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public VLegalDURel fetchByUserId(long userid, boolean retrieveFromCache)
		throws SystemException {
		Object[] finderArgs = new Object[] { userid };

		Object result = null;

		if (retrieveFromCache) {
			result = FinderCacheUtil.getResult(FINDER_PATH_FETCH_BY_USERID,
					finderArgs, this);
		}

		if (result == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_SELECT_VLEGALDUREL_WHERE);

			query.append(_FINDER_COLUMN_USERID_USERID_2);

			query.append(VLegalDURelModelImpl.ORDER_BY_JPQL);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(userid);

				List<VLegalDURel> list = q.list();

				result = list;

				VLegalDURel vLegalDURel = null;

				if (list.isEmpty()) {
					FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_USERID,
						finderArgs, list);
				}
				else {
					vLegalDURel = list.get(0);

					cacheResult(vLegalDURel);

					if ((vLegalDURel.getUserid() != userid)) {
						FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_USERID,
							finderArgs, vLegalDURel);
					}
				}

				return vLegalDURel;
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (result == null) {
					FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_USERID,
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
				return (VLegalDURel)result;
			}
		}
	}

	/**
	 * Finds all the v legal d u rels.
	 *
	 * @return the v legal d u rels
	 * @throws SystemException if a system exception occurred
	 */
	public List<VLegalDURel> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Finds a range of all the v legal d u rels.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param start the lower bound of the range of v legal d u rels to return
	 * @param end the upper bound of the range of v legal d u rels to return (not inclusive)
	 * @return the range of v legal d u rels
	 * @throws SystemException if a system exception occurred
	 */
	public List<VLegalDURel> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Finds an ordered range of all the v legal d u rels.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param start the lower bound of the range of v legal d u rels to return
	 * @param end the upper bound of the range of v legal d u rels to return (not inclusive)
	 * @param orderByComparator the comparator to order the results by
	 * @return the ordered range of v legal d u rels
	 * @throws SystemException if a system exception occurred
	 */
	public List<VLegalDURel> findAll(int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		Object[] finderArgs = new Object[] {
				String.valueOf(start), String.valueOf(end),
				String.valueOf(orderByComparator)
			};

		List<VLegalDURel> list = (List<VLegalDURel>)FinderCacheUtil.getResult(FINDER_PATH_FIND_ALL,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_VLEGALDUREL);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_VLEGALDUREL.concat(VLegalDURelModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (orderByComparator == null) {
					list = (List<VLegalDURel>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);
				}
				else {
					list = (List<VLegalDURel>)QueryUtil.list(q, getDialect(),
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
	 * Removes all the v legal d u rels where departmentId = &#63; from the database.
	 *
	 * @param departmentId the department id to search with
	 * @throws SystemException if a system exception occurred
	 */
	public void removeByDepartament(long departmentId)
		throws SystemException {
		for (VLegalDURel vLegalDURel : findByDepartament(departmentId)) {
			remove(vLegalDURel);
		}
	}

	/**
	 * Removes all the v legal d u rels where userid = &#63; from the database.
	 *
	 * @param userid the userid to search with
	 * @throws SystemException if a system exception occurred
	 */
	public void removeByUser(long userid) throws SystemException {
		for (VLegalDURel vLegalDURel : findByUser(userid)) {
			remove(vLegalDURel);
		}
	}

	/**
	 * Removes the v legal d u rel where userid = &#63; from the database.
	 *
	 * @param userid the userid to search with
	 * @throws SystemException if a system exception occurred
	 */
	public void removeByUserId(long userid)
		throws NoSuchVLegalDURelException, SystemException {
		VLegalDURel vLegalDURel = findByUserId(userid);

		remove(vLegalDURel);
	}

	/**
	 * Removes all the v legal d u rels from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	public void removeAll() throws SystemException {
		for (VLegalDURel vLegalDURel : findAll()) {
			remove(vLegalDURel);
		}
	}

	/**
	 * Counts all the v legal d u rels where departmentId = &#63;.
	 *
	 * @param departmentId the department id to search with
	 * @return the number of matching v legal d u rels
	 * @throws SystemException if a system exception occurred
	 */
	public int countByDepartament(long departmentId) throws SystemException {
		Object[] finderArgs = new Object[] { departmentId };

		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_BY_DEPARTAMENT,
				finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_VLEGALDUREL_WHERE);

			query.append(_FINDER_COLUMN_DEPARTAMENT_DEPARTMENTID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(departmentId);

				count = (Long)q.uniqueResult();
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (count == null) {
					count = Long.valueOf(0);
				}

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_DEPARTAMENT,
					finderArgs, count);

				closeSession(session);
			}
		}

		return count.intValue();
	}

	/**
	 * Counts all the v legal d u rels where userid = &#63;.
	 *
	 * @param userid the userid to search with
	 * @return the number of matching v legal d u rels
	 * @throws SystemException if a system exception occurred
	 */
	public int countByUser(long userid) throws SystemException {
		Object[] finderArgs = new Object[] { userid };

		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_BY_USER,
				finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_VLEGALDUREL_WHERE);

			query.append(_FINDER_COLUMN_USER_USERID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(userid);

				count = (Long)q.uniqueResult();
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (count == null) {
					count = Long.valueOf(0);
				}

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_USER,
					finderArgs, count);

				closeSession(session);
			}
		}

		return count.intValue();
	}

	/**
	 * Counts all the v legal d u rels where userid = &#63;.
	 *
	 * @param userid the userid to search with
	 * @return the number of matching v legal d u rels
	 * @throws SystemException if a system exception occurred
	 */
	public int countByUserId(long userid) throws SystemException {
		Object[] finderArgs = new Object[] { userid };

		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_BY_USERID,
				finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_VLEGALDUREL_WHERE);

			query.append(_FINDER_COLUMN_USERID_USERID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(userid);

				count = (Long)q.uniqueResult();
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (count == null) {
					count = Long.valueOf(0);
				}

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_USERID,
					finderArgs, count);

				closeSession(session);
			}
		}

		return count.intValue();
	}

	/**
	 * Counts all the v legal d u rels.
	 *
	 * @return the number of v legal d u rels
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

				Query q = session.createQuery(_SQL_COUNT_VLEGALDUREL);

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
	 * Initializes the v legal d u rel persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.com.vportal.portlet.vlegal.model.VLegalDURel")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<VLegalDURel>> listenersList = new ArrayList<ModelListener<VLegalDURel>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<VLegalDURel>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(VLegalDURelImpl.class.getName());
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
	private static final String _SQL_SELECT_VLEGALDUREL = "SELECT vLegalDURel FROM VLegalDURel vLegalDURel";
	private static final String _SQL_SELECT_VLEGALDUREL_WHERE = "SELECT vLegalDURel FROM VLegalDURel vLegalDURel WHERE ";
	private static final String _SQL_COUNT_VLEGALDUREL = "SELECT COUNT(vLegalDURel) FROM VLegalDURel vLegalDURel";
	private static final String _SQL_COUNT_VLEGALDUREL_WHERE = "SELECT COUNT(vLegalDURel) FROM VLegalDURel vLegalDURel WHERE ";
	private static final String _FINDER_COLUMN_DEPARTAMENT_DEPARTMENTID_2 = "vLegalDURel.id.departmentId = ?";
	private static final String _FINDER_COLUMN_USER_USERID_2 = "vLegalDURel.id.userid = ?";
	private static final String _FINDER_COLUMN_USERID_USERID_2 = "vLegalDURel.id.userid = ?";
	private static final String _ORDER_BY_ENTITY_ALIAS = "vLegalDURel.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No VLegalDURel exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No VLegalDURel exists with the key {";
	private static Log _log = LogFactoryUtil.getLog(VLegalDURelPersistenceImpl.class);
}