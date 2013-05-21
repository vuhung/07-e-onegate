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

import com.vportal.portlet.vlegal.NoSuchVLegalDDRelException;
import com.vportal.portlet.vlegal.model.VLegalDDRel;
import com.vportal.portlet.vlegal.model.impl.VLegalDDRelImpl;
import com.vportal.portlet.vlegal.model.impl.VLegalDDRelModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The persistence implementation for the v legal d d rel service.
 *
 * <p>
 * Never modify or reference this class directly. Always use {@link VLegalDDRelUtil} to access the v legal d d rel persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
 * </p>
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author ACB
 * @see VLegalDDRelPersistence
 * @see VLegalDDRelUtil
 * @generated
 */
public class VLegalDDRelPersistenceImpl extends BasePersistenceImpl<VLegalDDRel>
	implements VLegalDDRelPersistence {
	public static final String FINDER_CLASS_NAME_ENTITY = VLegalDDRelImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST = FINDER_CLASS_NAME_ENTITY +
		".List";
	public static final FinderPath FINDER_PATH_FIND_BY_DEPARTAMENT = new FinderPath(VLegalDDRelModelImpl.ENTITY_CACHE_ENABLED,
			VLegalDDRelModelImpl.FINDER_CACHE_ENABLED, FINDER_CLASS_NAME_LIST,
			"findByDepartament",
			new String[] {
				Long.class.getName(),
				
			"java.lang.Integer", "java.lang.Integer",
				"com.liferay.portal.kernel.util.OrderByComparator"
			});
	public static final FinderPath FINDER_PATH_COUNT_BY_DEPARTAMENT = new FinderPath(VLegalDDRelModelImpl.ENTITY_CACHE_ENABLED,
			VLegalDDRelModelImpl.FINDER_CACHE_ENABLED, FINDER_CLASS_NAME_LIST,
			"countByDepartament", new String[] { Long.class.getName() });
	public static final FinderPath FINDER_PATH_FIND_BY_DOC = new FinderPath(VLegalDDRelModelImpl.ENTITY_CACHE_ENABLED,
			VLegalDDRelModelImpl.FINDER_CACHE_ENABLED, FINDER_CLASS_NAME_LIST,
			"findByDoc",
			new String[] {
				String.class.getName(),
				
			"java.lang.Integer", "java.lang.Integer",
				"com.liferay.portal.kernel.util.OrderByComparator"
			});
	public static final FinderPath FINDER_PATH_COUNT_BY_DOC = new FinderPath(VLegalDDRelModelImpl.ENTITY_CACHE_ENABLED,
			VLegalDDRelModelImpl.FINDER_CACHE_ENABLED, FINDER_CLASS_NAME_LIST,
			"countByDoc", new String[] { String.class.getName() });
	public static final FinderPath FINDER_PATH_FIND_ALL = new FinderPath(VLegalDDRelModelImpl.ENTITY_CACHE_ENABLED,
			VLegalDDRelModelImpl.FINDER_CACHE_ENABLED, FINDER_CLASS_NAME_LIST,
			"findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(VLegalDDRelModelImpl.ENTITY_CACHE_ENABLED,
			VLegalDDRelModelImpl.FINDER_CACHE_ENABLED, FINDER_CLASS_NAME_LIST,
			"countAll", new String[0]);

	/**
	 * Caches the v legal d d rel in the entity cache if it is enabled.
	 *
	 * @param vLegalDDRel the v legal d d rel to cache
	 */
	public void cacheResult(VLegalDDRel vLegalDDRel) {
		EntityCacheUtil.putResult(VLegalDDRelModelImpl.ENTITY_CACHE_ENABLED,
			VLegalDDRelImpl.class, vLegalDDRel.getPrimaryKey(), vLegalDDRel);
	}

	/**
	 * Caches the v legal d d rels in the entity cache if it is enabled.
	 *
	 * @param vLegalDDRels the v legal d d rels to cache
	 */
	public void cacheResult(List<VLegalDDRel> vLegalDDRels) {
		for (VLegalDDRel vLegalDDRel : vLegalDDRels) {
			if (EntityCacheUtil.getResult(
						VLegalDDRelModelImpl.ENTITY_CACHE_ENABLED,
						VLegalDDRelImpl.class, vLegalDDRel.getPrimaryKey(), this) == null) {
				cacheResult(vLegalDDRel);
			}
		}
	}

	/**
	 * Clears the cache for all v legal d d rels.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	public void clearCache() {
		CacheRegistryUtil.clear(VLegalDDRelImpl.class.getName());
		EntityCacheUtil.clearCache(VLegalDDRelImpl.class.getName());
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST);
	}

	/**
	 * Clears the cache for the v legal d d rel.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	public void clearCache(VLegalDDRel vLegalDDRel) {
		EntityCacheUtil.removeResult(VLegalDDRelModelImpl.ENTITY_CACHE_ENABLED,
			VLegalDDRelImpl.class, vLegalDDRel.getPrimaryKey());
	}

	/**
	 * Creates a new v legal d d rel with the primary key. Does not add the v legal d d rel to the database.
	 *
	 * @param vLegalDDRelPK the primary key for the new v legal d d rel
	 * @return the new v legal d d rel
	 */
	public VLegalDDRel create(VLegalDDRelPK vLegalDDRelPK) {
		VLegalDDRel vLegalDDRel = new VLegalDDRelImpl();

		vLegalDDRel.setNew(true);
		vLegalDDRel.setPrimaryKey(vLegalDDRelPK);

		return vLegalDDRel;
	}

	/**
	 * Removes the v legal d d rel with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the v legal d d rel to remove
	 * @return the v legal d d rel that was removed
	 * @throws com.liferay.portal.NoSuchModelException if a v legal d d rel with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public VLegalDDRel remove(Serializable primaryKey)
		throws NoSuchModelException, SystemException {
		return remove((VLegalDDRelPK)primaryKey);
	}

	/**
	 * Removes the v legal d d rel with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param vLegalDDRelPK the primary key of the v legal d d rel to remove
	 * @return the v legal d d rel that was removed
	 * @throws com.vportal.portlet.vlegal.NoSuchVLegalDDRelException if a v legal d d rel with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public VLegalDDRel remove(VLegalDDRelPK vLegalDDRelPK)
		throws NoSuchVLegalDDRelException, SystemException {
		Session session = null;

		try {
			session = openSession();

			VLegalDDRel vLegalDDRel = (VLegalDDRel)session.get(VLegalDDRelImpl.class,
					vLegalDDRelPK);

			if (vLegalDDRel == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + vLegalDDRelPK);
				}

				throw new NoSuchVLegalDDRelException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					vLegalDDRelPK);
			}

			return remove(vLegalDDRel);
		}
		catch (NoSuchVLegalDDRelException nsee) {
			throw nsee;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected VLegalDDRel removeImpl(VLegalDDRel vLegalDDRel)
		throws SystemException {
		vLegalDDRel = toUnwrappedModel(vLegalDDRel);

		Session session = null;

		try {
			session = openSession();

			BatchSessionUtil.delete(session, vLegalDDRel);
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST);

		EntityCacheUtil.removeResult(VLegalDDRelModelImpl.ENTITY_CACHE_ENABLED,
			VLegalDDRelImpl.class, vLegalDDRel.getPrimaryKey());

		return vLegalDDRel;
	}

	public VLegalDDRel updateImpl(
		com.vportal.portlet.vlegal.model.VLegalDDRel vLegalDDRel, boolean merge)
		throws SystemException {
		vLegalDDRel = toUnwrappedModel(vLegalDDRel);

		Session session = null;

		try {
			session = openSession();

			BatchSessionUtil.update(session, vLegalDDRel, merge);

			vLegalDDRel.setNew(false);
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST);

		EntityCacheUtil.putResult(VLegalDDRelModelImpl.ENTITY_CACHE_ENABLED,
			VLegalDDRelImpl.class, vLegalDDRel.getPrimaryKey(), vLegalDDRel);

		return vLegalDDRel;
	}

	protected VLegalDDRel toUnwrappedModel(VLegalDDRel vLegalDDRel) {
		if (vLegalDDRel instanceof VLegalDDRelImpl) {
			return vLegalDDRel;
		}

		VLegalDDRelImpl vLegalDDRelImpl = new VLegalDDRelImpl();

		vLegalDDRelImpl.setNew(vLegalDDRel.isNew());
		vLegalDDRelImpl.setPrimaryKey(vLegalDDRel.getPrimaryKey());

		vLegalDDRelImpl.setDepartmentId(vLegalDDRel.getDepartmentId());
		vLegalDDRelImpl.setDocId(vLegalDDRel.getDocId());

		return vLegalDDRelImpl;
	}

	/**
	 * Finds the v legal d d rel with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the v legal d d rel to find
	 * @return the v legal d d rel
	 * @throws com.liferay.portal.NoSuchModelException if a v legal d d rel with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public VLegalDDRel findByPrimaryKey(Serializable primaryKey)
		throws NoSuchModelException, SystemException {
		return findByPrimaryKey((VLegalDDRelPK)primaryKey);
	}

	/**
	 * Finds the v legal d d rel with the primary key or throws a {@link com.vportal.portlet.vlegal.NoSuchVLegalDDRelException} if it could not be found.
	 *
	 * @param vLegalDDRelPK the primary key of the v legal d d rel to find
	 * @return the v legal d d rel
	 * @throws com.vportal.portlet.vlegal.NoSuchVLegalDDRelException if a v legal d d rel with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public VLegalDDRel findByPrimaryKey(VLegalDDRelPK vLegalDDRelPK)
		throws NoSuchVLegalDDRelException, SystemException {
		VLegalDDRel vLegalDDRel = fetchByPrimaryKey(vLegalDDRelPK);

		if (vLegalDDRel == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + vLegalDDRelPK);
			}

			throw new NoSuchVLegalDDRelException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				vLegalDDRelPK);
		}

		return vLegalDDRel;
	}

	/**
	 * Finds the v legal d d rel with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the v legal d d rel to find
	 * @return the v legal d d rel, or <code>null</code> if a v legal d d rel with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public VLegalDDRel fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		return fetchByPrimaryKey((VLegalDDRelPK)primaryKey);
	}

	/**
	 * Finds the v legal d d rel with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param vLegalDDRelPK the primary key of the v legal d d rel to find
	 * @return the v legal d d rel, or <code>null</code> if a v legal d d rel with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public VLegalDDRel fetchByPrimaryKey(VLegalDDRelPK vLegalDDRelPK)
		throws SystemException {
		VLegalDDRel vLegalDDRel = (VLegalDDRel)EntityCacheUtil.getResult(VLegalDDRelModelImpl.ENTITY_CACHE_ENABLED,
				VLegalDDRelImpl.class, vLegalDDRelPK, this);

		if (vLegalDDRel == null) {
			Session session = null;

			try {
				session = openSession();

				vLegalDDRel = (VLegalDDRel)session.get(VLegalDDRelImpl.class,
						vLegalDDRelPK);
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (vLegalDDRel != null) {
					cacheResult(vLegalDDRel);
				}

				closeSession(session);
			}
		}

		return vLegalDDRel;
	}

	/**
	 * Finds all the v legal d d rels where departmentId = &#63;.
	 *
	 * @param departmentId the department id to search with
	 * @return the matching v legal d d rels
	 * @throws SystemException if a system exception occurred
	 */
	public List<VLegalDDRel> findByDepartament(long departmentId)
		throws SystemException {
		return findByDepartament(departmentId, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Finds a range of all the v legal d d rels where departmentId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param departmentId the department id to search with
	 * @param start the lower bound of the range of v legal d d rels to return
	 * @param end the upper bound of the range of v legal d d rels to return (not inclusive)
	 * @return the range of matching v legal d d rels
	 * @throws SystemException if a system exception occurred
	 */
	public List<VLegalDDRel> findByDepartament(long departmentId, int start,
		int end) throws SystemException {
		return findByDepartament(departmentId, start, end, null);
	}

	/**
	 * Finds an ordered range of all the v legal d d rels where departmentId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param departmentId the department id to search with
	 * @param start the lower bound of the range of v legal d d rels to return
	 * @param end the upper bound of the range of v legal d d rels to return (not inclusive)
	 * @param orderByComparator the comparator to order the results by
	 * @return the ordered range of matching v legal d d rels
	 * @throws SystemException if a system exception occurred
	 */
	public List<VLegalDDRel> findByDepartament(long departmentId, int start,
		int end, OrderByComparator orderByComparator) throws SystemException {
		Object[] finderArgs = new Object[] {
				departmentId,
				
				String.valueOf(start), String.valueOf(end),
				String.valueOf(orderByComparator)
			};

		List<VLegalDDRel> list = (List<VLegalDDRel>)FinderCacheUtil.getResult(FINDER_PATH_FIND_BY_DEPARTAMENT,
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

			query.append(_SQL_SELECT_VLEGALDDREL_WHERE);

			query.append(_FINDER_COLUMN_DEPARTAMENT_DEPARTMENTID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}

			else {
				query.append(VLegalDDRelModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(departmentId);

				list = (List<VLegalDDRel>)QueryUtil.list(q, getDialect(),
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
	 * Finds the first v legal d d rel in the ordered set where departmentId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param departmentId the department id to search with
	 * @param orderByComparator the comparator to order the set by
	 * @return the first matching v legal d d rel
	 * @throws com.vportal.portlet.vlegal.NoSuchVLegalDDRelException if a matching v legal d d rel could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public VLegalDDRel findByDepartament_First(long departmentId,
		OrderByComparator orderByComparator)
		throws NoSuchVLegalDDRelException, SystemException {
		List<VLegalDDRel> list = findByDepartament(departmentId, 0, 1,
				orderByComparator);

		if (list.isEmpty()) {
			StringBundler msg = new StringBundler(4);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("departmentId=");
			msg.append(departmentId);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			throw new NoSuchVLegalDDRelException(msg.toString());
		}
		else {
			return list.get(0);
		}
	}

	/**
	 * Finds the last v legal d d rel in the ordered set where departmentId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param departmentId the department id to search with
	 * @param orderByComparator the comparator to order the set by
	 * @return the last matching v legal d d rel
	 * @throws com.vportal.portlet.vlegal.NoSuchVLegalDDRelException if a matching v legal d d rel could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public VLegalDDRel findByDepartament_Last(long departmentId,
		OrderByComparator orderByComparator)
		throws NoSuchVLegalDDRelException, SystemException {
		int count = countByDepartament(departmentId);

		List<VLegalDDRel> list = findByDepartament(departmentId, count - 1,
				count, orderByComparator);

		if (list.isEmpty()) {
			StringBundler msg = new StringBundler(4);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("departmentId=");
			msg.append(departmentId);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			throw new NoSuchVLegalDDRelException(msg.toString());
		}
		else {
			return list.get(0);
		}
	}

	/**
	 * Finds the v legal d d rels before and after the current v legal d d rel in the ordered set where departmentId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param vLegalDDRelPK the primary key of the current v legal d d rel
	 * @param departmentId the department id to search with
	 * @param orderByComparator the comparator to order the set by
	 * @return the previous, current, and next v legal d d rel
	 * @throws com.vportal.portlet.vlegal.NoSuchVLegalDDRelException if a v legal d d rel with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public VLegalDDRel[] findByDepartament_PrevAndNext(
		VLegalDDRelPK vLegalDDRelPK, long departmentId,
		OrderByComparator orderByComparator)
		throws NoSuchVLegalDDRelException, SystemException {
		VLegalDDRel vLegalDDRel = findByPrimaryKey(vLegalDDRelPK);

		Session session = null;

		try {
			session = openSession();

			VLegalDDRel[] array = new VLegalDDRelImpl[3];

			array[0] = getByDepartament_PrevAndNext(session, vLegalDDRel,
					departmentId, orderByComparator, true);

			array[1] = vLegalDDRel;

			array[2] = getByDepartament_PrevAndNext(session, vLegalDDRel,
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

	protected VLegalDDRel getByDepartament_PrevAndNext(Session session,
		VLegalDDRel vLegalDDRel, long departmentId,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_VLEGALDDREL_WHERE);

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
			query.append(VLegalDDRelModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(departmentId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByValues(vLegalDDRel);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<VLegalDDRel> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Finds all the v legal d d rels where docId = &#63;.
	 *
	 * @param docId the doc id to search with
	 * @return the matching v legal d d rels
	 * @throws SystemException if a system exception occurred
	 */
	public List<VLegalDDRel> findByDoc(String docId) throws SystemException {
		return findByDoc(docId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Finds a range of all the v legal d d rels where docId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param docId the doc id to search with
	 * @param start the lower bound of the range of v legal d d rels to return
	 * @param end the upper bound of the range of v legal d d rels to return (not inclusive)
	 * @return the range of matching v legal d d rels
	 * @throws SystemException if a system exception occurred
	 */
	public List<VLegalDDRel> findByDoc(String docId, int start, int end)
		throws SystemException {
		return findByDoc(docId, start, end, null);
	}

	/**
	 * Finds an ordered range of all the v legal d d rels where docId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param docId the doc id to search with
	 * @param start the lower bound of the range of v legal d d rels to return
	 * @param end the upper bound of the range of v legal d d rels to return (not inclusive)
	 * @param orderByComparator the comparator to order the results by
	 * @return the ordered range of matching v legal d d rels
	 * @throws SystemException if a system exception occurred
	 */
	public List<VLegalDDRel> findByDoc(String docId, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		Object[] finderArgs = new Object[] {
				docId,
				
				String.valueOf(start), String.valueOf(end),
				String.valueOf(orderByComparator)
			};

		List<VLegalDDRel> list = (List<VLegalDDRel>)FinderCacheUtil.getResult(FINDER_PATH_FIND_BY_DOC,
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

			query.append(_SQL_SELECT_VLEGALDDREL_WHERE);

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
				query.append(VLegalDDRelModelImpl.ORDER_BY_JPQL);
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

				list = (List<VLegalDDRel>)QueryUtil.list(q, getDialect(),
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
	 * Finds the first v legal d d rel in the ordered set where docId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param docId the doc id to search with
	 * @param orderByComparator the comparator to order the set by
	 * @return the first matching v legal d d rel
	 * @throws com.vportal.portlet.vlegal.NoSuchVLegalDDRelException if a matching v legal d d rel could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public VLegalDDRel findByDoc_First(String docId,
		OrderByComparator orderByComparator)
		throws NoSuchVLegalDDRelException, SystemException {
		List<VLegalDDRel> list = findByDoc(docId, 0, 1, orderByComparator);

		if (list.isEmpty()) {
			StringBundler msg = new StringBundler(4);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("docId=");
			msg.append(docId);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			throw new NoSuchVLegalDDRelException(msg.toString());
		}
		else {
			return list.get(0);
		}
	}

	/**
	 * Finds the last v legal d d rel in the ordered set where docId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param docId the doc id to search with
	 * @param orderByComparator the comparator to order the set by
	 * @return the last matching v legal d d rel
	 * @throws com.vportal.portlet.vlegal.NoSuchVLegalDDRelException if a matching v legal d d rel could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public VLegalDDRel findByDoc_Last(String docId,
		OrderByComparator orderByComparator)
		throws NoSuchVLegalDDRelException, SystemException {
		int count = countByDoc(docId);

		List<VLegalDDRel> list = findByDoc(docId, count - 1, count,
				orderByComparator);

		if (list.isEmpty()) {
			StringBundler msg = new StringBundler(4);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("docId=");
			msg.append(docId);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			throw new NoSuchVLegalDDRelException(msg.toString());
		}
		else {
			return list.get(0);
		}
	}

	/**
	 * Finds the v legal d d rels before and after the current v legal d d rel in the ordered set where docId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param vLegalDDRelPK the primary key of the current v legal d d rel
	 * @param docId the doc id to search with
	 * @param orderByComparator the comparator to order the set by
	 * @return the previous, current, and next v legal d d rel
	 * @throws com.vportal.portlet.vlegal.NoSuchVLegalDDRelException if a v legal d d rel with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public VLegalDDRel[] findByDoc_PrevAndNext(VLegalDDRelPK vLegalDDRelPK,
		String docId, OrderByComparator orderByComparator)
		throws NoSuchVLegalDDRelException, SystemException {
		VLegalDDRel vLegalDDRel = findByPrimaryKey(vLegalDDRelPK);

		Session session = null;

		try {
			session = openSession();

			VLegalDDRel[] array = new VLegalDDRelImpl[3];

			array[0] = getByDoc_PrevAndNext(session, vLegalDDRel, docId,
					orderByComparator, true);

			array[1] = vLegalDDRel;

			array[2] = getByDoc_PrevAndNext(session, vLegalDDRel, docId,
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

	protected VLegalDDRel getByDoc_PrevAndNext(Session session,
		VLegalDDRel vLegalDDRel, String docId,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_VLEGALDDREL_WHERE);

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
			query.append(VLegalDDRelModelImpl.ORDER_BY_JPQL);
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
			Object[] values = orderByComparator.getOrderByValues(vLegalDDRel);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<VLegalDDRel> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Finds all the v legal d d rels.
	 *
	 * @return the v legal d d rels
	 * @throws SystemException if a system exception occurred
	 */
	public List<VLegalDDRel> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Finds a range of all the v legal d d rels.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param start the lower bound of the range of v legal d d rels to return
	 * @param end the upper bound of the range of v legal d d rels to return (not inclusive)
	 * @return the range of v legal d d rels
	 * @throws SystemException if a system exception occurred
	 */
	public List<VLegalDDRel> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Finds an ordered range of all the v legal d d rels.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param start the lower bound of the range of v legal d d rels to return
	 * @param end the upper bound of the range of v legal d d rels to return (not inclusive)
	 * @param orderByComparator the comparator to order the results by
	 * @return the ordered range of v legal d d rels
	 * @throws SystemException if a system exception occurred
	 */
	public List<VLegalDDRel> findAll(int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		Object[] finderArgs = new Object[] {
				String.valueOf(start), String.valueOf(end),
				String.valueOf(orderByComparator)
			};

		List<VLegalDDRel> list = (List<VLegalDDRel>)FinderCacheUtil.getResult(FINDER_PATH_FIND_ALL,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_VLEGALDDREL);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_VLEGALDDREL.concat(VLegalDDRelModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (orderByComparator == null) {
					list = (List<VLegalDDRel>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);
				}
				else {
					list = (List<VLegalDDRel>)QueryUtil.list(q, getDialect(),
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
	 * Removes all the v legal d d rels where departmentId = &#63; from the database.
	 *
	 * @param departmentId the department id to search with
	 * @throws SystemException if a system exception occurred
	 */
	public void removeByDepartament(long departmentId)
		throws SystemException {
		for (VLegalDDRel vLegalDDRel : findByDepartament(departmentId)) {
			remove(vLegalDDRel);
		}
	}

	/**
	 * Removes all the v legal d d rels where docId = &#63; from the database.
	 *
	 * @param docId the doc id to search with
	 * @throws SystemException if a system exception occurred
	 */
	public void removeByDoc(String docId) throws SystemException {
		for (VLegalDDRel vLegalDDRel : findByDoc(docId)) {
			remove(vLegalDDRel);
		}
	}

	/**
	 * Removes all the v legal d d rels from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	public void removeAll() throws SystemException {
		for (VLegalDDRel vLegalDDRel : findAll()) {
			remove(vLegalDDRel);
		}
	}

	/**
	 * Counts all the v legal d d rels where departmentId = &#63;.
	 *
	 * @param departmentId the department id to search with
	 * @return the number of matching v legal d d rels
	 * @throws SystemException if a system exception occurred
	 */
	public int countByDepartament(long departmentId) throws SystemException {
		Object[] finderArgs = new Object[] { departmentId };

		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_BY_DEPARTAMENT,
				finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_VLEGALDDREL_WHERE);

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
	 * Counts all the v legal d d rels where docId = &#63;.
	 *
	 * @param docId the doc id to search with
	 * @return the number of matching v legal d d rels
	 * @throws SystemException if a system exception occurred
	 */
	public int countByDoc(String docId) throws SystemException {
		Object[] finderArgs = new Object[] { docId };

		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_BY_DOC,
				finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_VLEGALDDREL_WHERE);

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
	 * Counts all the v legal d d rels.
	 *
	 * @return the number of v legal d d rels
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

				Query q = session.createQuery(_SQL_COUNT_VLEGALDDREL);

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
	 * Initializes the v legal d d rel persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.com.vportal.portlet.vlegal.model.VLegalDDRel")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<VLegalDDRel>> listenersList = new ArrayList<ModelListener<VLegalDDRel>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<VLegalDDRel>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(VLegalDDRelImpl.class.getName());
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
	private static final String _SQL_SELECT_VLEGALDDREL = "SELECT vLegalDDRel FROM VLegalDDRel vLegalDDRel";
	private static final String _SQL_SELECT_VLEGALDDREL_WHERE = "SELECT vLegalDDRel FROM VLegalDDRel vLegalDDRel WHERE ";
	private static final String _SQL_COUNT_VLEGALDDREL = "SELECT COUNT(vLegalDDRel) FROM VLegalDDRel vLegalDDRel";
	private static final String _SQL_COUNT_VLEGALDDREL_WHERE = "SELECT COUNT(vLegalDDRel) FROM VLegalDDRel vLegalDDRel WHERE ";
	private static final String _FINDER_COLUMN_DEPARTAMENT_DEPARTMENTID_2 = "vLegalDDRel.id.departmentId = ?";
	private static final String _FINDER_COLUMN_DOC_DOCID_1 = "vLegalDDRel.id.docId IS NULL";
	private static final String _FINDER_COLUMN_DOC_DOCID_2 = "vLegalDDRel.id.docId = ?";
	private static final String _FINDER_COLUMN_DOC_DOCID_3 = "(vLegalDDRel.id.docId IS NULL OR vLegalDDRel.id.docId = ?)";
	private static final String _ORDER_BY_ENTITY_ALIAS = "vLegalDDRel.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No VLegalDDRel exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No VLegalDDRel exists with the key {";
	private static Log _log = LogFactoryUtil.getLog(VLegalDDRelPersistenceImpl.class);
}