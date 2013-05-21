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

import com.vportal.portlet.vlegal.NoSuchVLegalFORelException;
import com.vportal.portlet.vlegal.model.VLegalFORel;
import com.vportal.portlet.vlegal.model.impl.VLegalFORelImpl;
import com.vportal.portlet.vlegal.model.impl.VLegalFORelModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The persistence implementation for the v legal f o rel service.
 *
 * <p>
 * Never modify or reference this class directly. Always use {@link VLegalFORelUtil} to access the v legal f o rel persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
 * </p>
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author ACB
 * @see VLegalFORelPersistence
 * @see VLegalFORelUtil
 * @generated
 */
public class VLegalFORelPersistenceImpl extends BasePersistenceImpl<VLegalFORel>
	implements VLegalFORelPersistence {
	public static final String FINDER_CLASS_NAME_ENTITY = VLegalFORelImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST = FINDER_CLASS_NAME_ENTITY +
		".List";
	public static final FinderPath FINDER_PATH_FIND_BY_FIELD = new FinderPath(VLegalFORelModelImpl.ENTITY_CACHE_ENABLED,
			VLegalFORelModelImpl.FINDER_CACHE_ENABLED, FINDER_CLASS_NAME_LIST,
			"findByField",
			new String[] {
				String.class.getName(),
				
			"java.lang.Integer", "java.lang.Integer",
				"com.liferay.portal.kernel.util.OrderByComparator"
			});
	public static final FinderPath FINDER_PATH_COUNT_BY_FIELD = new FinderPath(VLegalFORelModelImpl.ENTITY_CACHE_ENABLED,
			VLegalFORelModelImpl.FINDER_CACHE_ENABLED, FINDER_CLASS_NAME_LIST,
			"countByField", new String[] { String.class.getName() });
	public static final FinderPath FINDER_PATH_FIND_BY_ORG = new FinderPath(VLegalFORelModelImpl.ENTITY_CACHE_ENABLED,
			VLegalFORelModelImpl.FINDER_CACHE_ENABLED, FINDER_CLASS_NAME_LIST,
			"findByOrg",
			new String[] {
				String.class.getName(),
				
			"java.lang.Integer", "java.lang.Integer",
				"com.liferay.portal.kernel.util.OrderByComparator"
			});
	public static final FinderPath FINDER_PATH_COUNT_BY_ORG = new FinderPath(VLegalFORelModelImpl.ENTITY_CACHE_ENABLED,
			VLegalFORelModelImpl.FINDER_CACHE_ENABLED, FINDER_CLASS_NAME_LIST,
			"countByOrg", new String[] { String.class.getName() });
	public static final FinderPath FINDER_PATH_FIND_ALL = new FinderPath(VLegalFORelModelImpl.ENTITY_CACHE_ENABLED,
			VLegalFORelModelImpl.FINDER_CACHE_ENABLED, FINDER_CLASS_NAME_LIST,
			"findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(VLegalFORelModelImpl.ENTITY_CACHE_ENABLED,
			VLegalFORelModelImpl.FINDER_CACHE_ENABLED, FINDER_CLASS_NAME_LIST,
			"countAll", new String[0]);

	/**
	 * Caches the v legal f o rel in the entity cache if it is enabled.
	 *
	 * @param vLegalFORel the v legal f o rel to cache
	 */
	public void cacheResult(VLegalFORel vLegalFORel) {
		EntityCacheUtil.putResult(VLegalFORelModelImpl.ENTITY_CACHE_ENABLED,
			VLegalFORelImpl.class, vLegalFORel.getPrimaryKey(), vLegalFORel);
	}

	/**
	 * Caches the v legal f o rels in the entity cache if it is enabled.
	 *
	 * @param vLegalFORels the v legal f o rels to cache
	 */
	public void cacheResult(List<VLegalFORel> vLegalFORels) {
		for (VLegalFORel vLegalFORel : vLegalFORels) {
			if (EntityCacheUtil.getResult(
						VLegalFORelModelImpl.ENTITY_CACHE_ENABLED,
						VLegalFORelImpl.class, vLegalFORel.getPrimaryKey(), this) == null) {
				cacheResult(vLegalFORel);
			}
		}
	}

	/**
	 * Clears the cache for all v legal f o rels.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	public void clearCache() {
		CacheRegistryUtil.clear(VLegalFORelImpl.class.getName());
		EntityCacheUtil.clearCache(VLegalFORelImpl.class.getName());
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST);
	}

	/**
	 * Clears the cache for the v legal f o rel.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	public void clearCache(VLegalFORel vLegalFORel) {
		EntityCacheUtil.removeResult(VLegalFORelModelImpl.ENTITY_CACHE_ENABLED,
			VLegalFORelImpl.class, vLegalFORel.getPrimaryKey());
	}

	/**
	 * Creates a new v legal f o rel with the primary key. Does not add the v legal f o rel to the database.
	 *
	 * @param vLegalFORelPK the primary key for the new v legal f o rel
	 * @return the new v legal f o rel
	 */
	public VLegalFORel create(VLegalFORelPK vLegalFORelPK) {
		VLegalFORel vLegalFORel = new VLegalFORelImpl();

		vLegalFORel.setNew(true);
		vLegalFORel.setPrimaryKey(vLegalFORelPK);

		return vLegalFORel;
	}

	/**
	 * Removes the v legal f o rel with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the v legal f o rel to remove
	 * @return the v legal f o rel that was removed
	 * @throws com.liferay.portal.NoSuchModelException if a v legal f o rel with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public VLegalFORel remove(Serializable primaryKey)
		throws NoSuchModelException, SystemException {
		return remove((VLegalFORelPK)primaryKey);
	}

	/**
	 * Removes the v legal f o rel with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param vLegalFORelPK the primary key of the v legal f o rel to remove
	 * @return the v legal f o rel that was removed
	 * @throws com.vportal.portlet.vlegal.NoSuchVLegalFORelException if a v legal f o rel with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public VLegalFORel remove(VLegalFORelPK vLegalFORelPK)
		throws NoSuchVLegalFORelException, SystemException {
		Session session = null;

		try {
			session = openSession();

			VLegalFORel vLegalFORel = (VLegalFORel)session.get(VLegalFORelImpl.class,
					vLegalFORelPK);

			if (vLegalFORel == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + vLegalFORelPK);
				}

				throw new NoSuchVLegalFORelException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					vLegalFORelPK);
			}

			return remove(vLegalFORel);
		}
		catch (NoSuchVLegalFORelException nsee) {
			throw nsee;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected VLegalFORel removeImpl(VLegalFORel vLegalFORel)
		throws SystemException {
		vLegalFORel = toUnwrappedModel(vLegalFORel);

		Session session = null;

		try {
			session = openSession();

			BatchSessionUtil.delete(session, vLegalFORel);
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST);

		EntityCacheUtil.removeResult(VLegalFORelModelImpl.ENTITY_CACHE_ENABLED,
			VLegalFORelImpl.class, vLegalFORel.getPrimaryKey());

		return vLegalFORel;
	}

	public VLegalFORel updateImpl(
		com.vportal.portlet.vlegal.model.VLegalFORel vLegalFORel, boolean merge)
		throws SystemException {
		vLegalFORel = toUnwrappedModel(vLegalFORel);

		Session session = null;

		try {
			session = openSession();

			BatchSessionUtil.update(session, vLegalFORel, merge);

			vLegalFORel.setNew(false);
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST);

		EntityCacheUtil.putResult(VLegalFORelModelImpl.ENTITY_CACHE_ENABLED,
			VLegalFORelImpl.class, vLegalFORel.getPrimaryKey(), vLegalFORel);

		return vLegalFORel;
	}

	protected VLegalFORel toUnwrappedModel(VLegalFORel vLegalFORel) {
		if (vLegalFORel instanceof VLegalFORelImpl) {
			return vLegalFORel;
		}

		VLegalFORelImpl vLegalFORelImpl = new VLegalFORelImpl();

		vLegalFORelImpl.setNew(vLegalFORel.isNew());
		vLegalFORelImpl.setPrimaryKey(vLegalFORel.getPrimaryKey());

		vLegalFORelImpl.setFieldId(vLegalFORel.getFieldId());
		vLegalFORelImpl.setOrgId(vLegalFORel.getOrgId());

		return vLegalFORelImpl;
	}

	/**
	 * Finds the v legal f o rel with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the v legal f o rel to find
	 * @return the v legal f o rel
	 * @throws com.liferay.portal.NoSuchModelException if a v legal f o rel with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public VLegalFORel findByPrimaryKey(Serializable primaryKey)
		throws NoSuchModelException, SystemException {
		return findByPrimaryKey((VLegalFORelPK)primaryKey);
	}

	/**
	 * Finds the v legal f o rel with the primary key or throws a {@link com.vportal.portlet.vlegal.NoSuchVLegalFORelException} if it could not be found.
	 *
	 * @param vLegalFORelPK the primary key of the v legal f o rel to find
	 * @return the v legal f o rel
	 * @throws com.vportal.portlet.vlegal.NoSuchVLegalFORelException if a v legal f o rel with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public VLegalFORel findByPrimaryKey(VLegalFORelPK vLegalFORelPK)
		throws NoSuchVLegalFORelException, SystemException {
		VLegalFORel vLegalFORel = fetchByPrimaryKey(vLegalFORelPK);

		if (vLegalFORel == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + vLegalFORelPK);
			}

			throw new NoSuchVLegalFORelException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				vLegalFORelPK);
		}

		return vLegalFORel;
	}

	/**
	 * Finds the v legal f o rel with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the v legal f o rel to find
	 * @return the v legal f o rel, or <code>null</code> if a v legal f o rel with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public VLegalFORel fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		return fetchByPrimaryKey((VLegalFORelPK)primaryKey);
	}

	/**
	 * Finds the v legal f o rel with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param vLegalFORelPK the primary key of the v legal f o rel to find
	 * @return the v legal f o rel, or <code>null</code> if a v legal f o rel with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public VLegalFORel fetchByPrimaryKey(VLegalFORelPK vLegalFORelPK)
		throws SystemException {
		VLegalFORel vLegalFORel = (VLegalFORel)EntityCacheUtil.getResult(VLegalFORelModelImpl.ENTITY_CACHE_ENABLED,
				VLegalFORelImpl.class, vLegalFORelPK, this);

		if (vLegalFORel == null) {
			Session session = null;

			try {
				session = openSession();

				vLegalFORel = (VLegalFORel)session.get(VLegalFORelImpl.class,
						vLegalFORelPK);
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (vLegalFORel != null) {
					cacheResult(vLegalFORel);
				}

				closeSession(session);
			}
		}

		return vLegalFORel;
	}

	/**
	 * Finds all the v legal f o rels where fieldId = &#63;.
	 *
	 * @param fieldId the field id to search with
	 * @return the matching v legal f o rels
	 * @throws SystemException if a system exception occurred
	 */
	public List<VLegalFORel> findByField(String fieldId)
		throws SystemException {
		return findByField(fieldId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Finds a range of all the v legal f o rels where fieldId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param fieldId the field id to search with
	 * @param start the lower bound of the range of v legal f o rels to return
	 * @param end the upper bound of the range of v legal f o rels to return (not inclusive)
	 * @return the range of matching v legal f o rels
	 * @throws SystemException if a system exception occurred
	 */
	public List<VLegalFORel> findByField(String fieldId, int start, int end)
		throws SystemException {
		return findByField(fieldId, start, end, null);
	}

	/**
	 * Finds an ordered range of all the v legal f o rels where fieldId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param fieldId the field id to search with
	 * @param start the lower bound of the range of v legal f o rels to return
	 * @param end the upper bound of the range of v legal f o rels to return (not inclusive)
	 * @param orderByComparator the comparator to order the results by
	 * @return the ordered range of matching v legal f o rels
	 * @throws SystemException if a system exception occurred
	 */
	public List<VLegalFORel> findByField(String fieldId, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		Object[] finderArgs = new Object[] {
				fieldId,
				
				String.valueOf(start), String.valueOf(end),
				String.valueOf(orderByComparator)
			};

		List<VLegalFORel> list = (List<VLegalFORel>)FinderCacheUtil.getResult(FINDER_PATH_FIND_BY_FIELD,
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

			query.append(_SQL_SELECT_VLEGALFOREL_WHERE);

			if (fieldId == null) {
				query.append(_FINDER_COLUMN_FIELD_FIELDID_1);
			}
			else {
				if (fieldId.equals(StringPool.BLANK)) {
					query.append(_FINDER_COLUMN_FIELD_FIELDID_3);
				}
				else {
					query.append(_FINDER_COLUMN_FIELD_FIELDID_2);
				}
			}

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}

			else {
				query.append(VLegalFORelModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (fieldId != null) {
					qPos.add(fieldId);
				}

				list = (List<VLegalFORel>)QueryUtil.list(q, getDialect(),
						start, end);
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (list == null) {
					FinderCacheUtil.removeResult(FINDER_PATH_FIND_BY_FIELD,
						finderArgs);
				}
				else {
					cacheResult(list);

					FinderCacheUtil.putResult(FINDER_PATH_FIND_BY_FIELD,
						finderArgs, list);
				}

				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Finds the first v legal f o rel in the ordered set where fieldId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param fieldId the field id to search with
	 * @param orderByComparator the comparator to order the set by
	 * @return the first matching v legal f o rel
	 * @throws com.vportal.portlet.vlegal.NoSuchVLegalFORelException if a matching v legal f o rel could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public VLegalFORel findByField_First(String fieldId,
		OrderByComparator orderByComparator)
		throws NoSuchVLegalFORelException, SystemException {
		List<VLegalFORel> list = findByField(fieldId, 0, 1, orderByComparator);

		if (list.isEmpty()) {
			StringBundler msg = new StringBundler(4);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("fieldId=");
			msg.append(fieldId);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			throw new NoSuchVLegalFORelException(msg.toString());
		}
		else {
			return list.get(0);
		}
	}

	/**
	 * Finds the last v legal f o rel in the ordered set where fieldId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param fieldId the field id to search with
	 * @param orderByComparator the comparator to order the set by
	 * @return the last matching v legal f o rel
	 * @throws com.vportal.portlet.vlegal.NoSuchVLegalFORelException if a matching v legal f o rel could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public VLegalFORel findByField_Last(String fieldId,
		OrderByComparator orderByComparator)
		throws NoSuchVLegalFORelException, SystemException {
		int count = countByField(fieldId);

		List<VLegalFORel> list = findByField(fieldId, count - 1, count,
				orderByComparator);

		if (list.isEmpty()) {
			StringBundler msg = new StringBundler(4);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("fieldId=");
			msg.append(fieldId);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			throw new NoSuchVLegalFORelException(msg.toString());
		}
		else {
			return list.get(0);
		}
	}

	/**
	 * Finds the v legal f o rels before and after the current v legal f o rel in the ordered set where fieldId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param vLegalFORelPK the primary key of the current v legal f o rel
	 * @param fieldId the field id to search with
	 * @param orderByComparator the comparator to order the set by
	 * @return the previous, current, and next v legal f o rel
	 * @throws com.vportal.portlet.vlegal.NoSuchVLegalFORelException if a v legal f o rel with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public VLegalFORel[] findByField_PrevAndNext(VLegalFORelPK vLegalFORelPK,
		String fieldId, OrderByComparator orderByComparator)
		throws NoSuchVLegalFORelException, SystemException {
		VLegalFORel vLegalFORel = findByPrimaryKey(vLegalFORelPK);

		Session session = null;

		try {
			session = openSession();

			VLegalFORel[] array = new VLegalFORelImpl[3];

			array[0] = getByField_PrevAndNext(session, vLegalFORel, fieldId,
					orderByComparator, true);

			array[1] = vLegalFORel;

			array[2] = getByField_PrevAndNext(session, vLegalFORel, fieldId,
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

	protected VLegalFORel getByField_PrevAndNext(Session session,
		VLegalFORel vLegalFORel, String fieldId,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_VLEGALFOREL_WHERE);

		if (fieldId == null) {
			query.append(_FINDER_COLUMN_FIELD_FIELDID_1);
		}
		else {
			if (fieldId.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_FIELD_FIELDID_3);
			}
			else {
				query.append(_FINDER_COLUMN_FIELD_FIELDID_2);
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
			query.append(VLegalFORelModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		if (fieldId != null) {
			qPos.add(fieldId);
		}

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByValues(vLegalFORel);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<VLegalFORel> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Finds all the v legal f o rels where orgId = &#63;.
	 *
	 * @param orgId the org id to search with
	 * @return the matching v legal f o rels
	 * @throws SystemException if a system exception occurred
	 */
	public List<VLegalFORel> findByOrg(String orgId) throws SystemException {
		return findByOrg(orgId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Finds a range of all the v legal f o rels where orgId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param orgId the org id to search with
	 * @param start the lower bound of the range of v legal f o rels to return
	 * @param end the upper bound of the range of v legal f o rels to return (not inclusive)
	 * @return the range of matching v legal f o rels
	 * @throws SystemException if a system exception occurred
	 */
	public List<VLegalFORel> findByOrg(String orgId, int start, int end)
		throws SystemException {
		return findByOrg(orgId, start, end, null);
	}

	/**
	 * Finds an ordered range of all the v legal f o rels where orgId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param orgId the org id to search with
	 * @param start the lower bound of the range of v legal f o rels to return
	 * @param end the upper bound of the range of v legal f o rels to return (not inclusive)
	 * @param orderByComparator the comparator to order the results by
	 * @return the ordered range of matching v legal f o rels
	 * @throws SystemException if a system exception occurred
	 */
	public List<VLegalFORel> findByOrg(String orgId, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		Object[] finderArgs = new Object[] {
				orgId,
				
				String.valueOf(start), String.valueOf(end),
				String.valueOf(orderByComparator)
			};

		List<VLegalFORel> list = (List<VLegalFORel>)FinderCacheUtil.getResult(FINDER_PATH_FIND_BY_ORG,
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

			query.append(_SQL_SELECT_VLEGALFOREL_WHERE);

			if (orgId == null) {
				query.append(_FINDER_COLUMN_ORG_ORGID_1);
			}
			else {
				if (orgId.equals(StringPool.BLANK)) {
					query.append(_FINDER_COLUMN_ORG_ORGID_3);
				}
				else {
					query.append(_FINDER_COLUMN_ORG_ORGID_2);
				}
			}

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}

			else {
				query.append(VLegalFORelModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (orgId != null) {
					qPos.add(orgId);
				}

				list = (List<VLegalFORel>)QueryUtil.list(q, getDialect(),
						start, end);
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (list == null) {
					FinderCacheUtil.removeResult(FINDER_PATH_FIND_BY_ORG,
						finderArgs);
				}
				else {
					cacheResult(list);

					FinderCacheUtil.putResult(FINDER_PATH_FIND_BY_ORG,
						finderArgs, list);
				}

				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Finds the first v legal f o rel in the ordered set where orgId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param orgId the org id to search with
	 * @param orderByComparator the comparator to order the set by
	 * @return the first matching v legal f o rel
	 * @throws com.vportal.portlet.vlegal.NoSuchVLegalFORelException if a matching v legal f o rel could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public VLegalFORel findByOrg_First(String orgId,
		OrderByComparator orderByComparator)
		throws NoSuchVLegalFORelException, SystemException {
		List<VLegalFORel> list = findByOrg(orgId, 0, 1, orderByComparator);

		if (list.isEmpty()) {
			StringBundler msg = new StringBundler(4);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("orgId=");
			msg.append(orgId);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			throw new NoSuchVLegalFORelException(msg.toString());
		}
		else {
			return list.get(0);
		}
	}

	/**
	 * Finds the last v legal f o rel in the ordered set where orgId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param orgId the org id to search with
	 * @param orderByComparator the comparator to order the set by
	 * @return the last matching v legal f o rel
	 * @throws com.vportal.portlet.vlegal.NoSuchVLegalFORelException if a matching v legal f o rel could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public VLegalFORel findByOrg_Last(String orgId,
		OrderByComparator orderByComparator)
		throws NoSuchVLegalFORelException, SystemException {
		int count = countByOrg(orgId);

		List<VLegalFORel> list = findByOrg(orgId, count - 1, count,
				orderByComparator);

		if (list.isEmpty()) {
			StringBundler msg = new StringBundler(4);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("orgId=");
			msg.append(orgId);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			throw new NoSuchVLegalFORelException(msg.toString());
		}
		else {
			return list.get(0);
		}
	}

	/**
	 * Finds the v legal f o rels before and after the current v legal f o rel in the ordered set where orgId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param vLegalFORelPK the primary key of the current v legal f o rel
	 * @param orgId the org id to search with
	 * @param orderByComparator the comparator to order the set by
	 * @return the previous, current, and next v legal f o rel
	 * @throws com.vportal.portlet.vlegal.NoSuchVLegalFORelException if a v legal f o rel with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public VLegalFORel[] findByOrg_PrevAndNext(VLegalFORelPK vLegalFORelPK,
		String orgId, OrderByComparator orderByComparator)
		throws NoSuchVLegalFORelException, SystemException {
		VLegalFORel vLegalFORel = findByPrimaryKey(vLegalFORelPK);

		Session session = null;

		try {
			session = openSession();

			VLegalFORel[] array = new VLegalFORelImpl[3];

			array[0] = getByOrg_PrevAndNext(session, vLegalFORel, orgId,
					orderByComparator, true);

			array[1] = vLegalFORel;

			array[2] = getByOrg_PrevAndNext(session, vLegalFORel, orgId,
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

	protected VLegalFORel getByOrg_PrevAndNext(Session session,
		VLegalFORel vLegalFORel, String orgId,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_VLEGALFOREL_WHERE);

		if (orgId == null) {
			query.append(_FINDER_COLUMN_ORG_ORGID_1);
		}
		else {
			if (orgId.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_ORG_ORGID_3);
			}
			else {
				query.append(_FINDER_COLUMN_ORG_ORGID_2);
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
			query.append(VLegalFORelModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		if (orgId != null) {
			qPos.add(orgId);
		}

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByValues(vLegalFORel);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<VLegalFORel> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Finds all the v legal f o rels.
	 *
	 * @return the v legal f o rels
	 * @throws SystemException if a system exception occurred
	 */
	public List<VLegalFORel> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Finds a range of all the v legal f o rels.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param start the lower bound of the range of v legal f o rels to return
	 * @param end the upper bound of the range of v legal f o rels to return (not inclusive)
	 * @return the range of v legal f o rels
	 * @throws SystemException if a system exception occurred
	 */
	public List<VLegalFORel> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Finds an ordered range of all the v legal f o rels.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param start the lower bound of the range of v legal f o rels to return
	 * @param end the upper bound of the range of v legal f o rels to return (not inclusive)
	 * @param orderByComparator the comparator to order the results by
	 * @return the ordered range of v legal f o rels
	 * @throws SystemException if a system exception occurred
	 */
	public List<VLegalFORel> findAll(int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		Object[] finderArgs = new Object[] {
				String.valueOf(start), String.valueOf(end),
				String.valueOf(orderByComparator)
			};

		List<VLegalFORel> list = (List<VLegalFORel>)FinderCacheUtil.getResult(FINDER_PATH_FIND_ALL,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_VLEGALFOREL);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_VLEGALFOREL.concat(VLegalFORelModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (orderByComparator == null) {
					list = (List<VLegalFORel>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);
				}
				else {
					list = (List<VLegalFORel>)QueryUtil.list(q, getDialect(),
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
	 * Removes all the v legal f o rels where fieldId = &#63; from the database.
	 *
	 * @param fieldId the field id to search with
	 * @throws SystemException if a system exception occurred
	 */
	public void removeByField(String fieldId) throws SystemException {
		for (VLegalFORel vLegalFORel : findByField(fieldId)) {
			remove(vLegalFORel);
		}
	}

	/**
	 * Removes all the v legal f o rels where orgId = &#63; from the database.
	 *
	 * @param orgId the org id to search with
	 * @throws SystemException if a system exception occurred
	 */
	public void removeByOrg(String orgId) throws SystemException {
		for (VLegalFORel vLegalFORel : findByOrg(orgId)) {
			remove(vLegalFORel);
		}
	}

	/**
	 * Removes all the v legal f o rels from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	public void removeAll() throws SystemException {
		for (VLegalFORel vLegalFORel : findAll()) {
			remove(vLegalFORel);
		}
	}

	/**
	 * Counts all the v legal f o rels where fieldId = &#63;.
	 *
	 * @param fieldId the field id to search with
	 * @return the number of matching v legal f o rels
	 * @throws SystemException if a system exception occurred
	 */
	public int countByField(String fieldId) throws SystemException {
		Object[] finderArgs = new Object[] { fieldId };

		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_BY_FIELD,
				finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_VLEGALFOREL_WHERE);

			if (fieldId == null) {
				query.append(_FINDER_COLUMN_FIELD_FIELDID_1);
			}
			else {
				if (fieldId.equals(StringPool.BLANK)) {
					query.append(_FINDER_COLUMN_FIELD_FIELDID_3);
				}
				else {
					query.append(_FINDER_COLUMN_FIELD_FIELDID_2);
				}
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (fieldId != null) {
					qPos.add(fieldId);
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

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_FIELD,
					finderArgs, count);

				closeSession(session);
			}
		}

		return count.intValue();
	}

	/**
	 * Counts all the v legal f o rels where orgId = &#63;.
	 *
	 * @param orgId the org id to search with
	 * @return the number of matching v legal f o rels
	 * @throws SystemException if a system exception occurred
	 */
	public int countByOrg(String orgId) throws SystemException {
		Object[] finderArgs = new Object[] { orgId };

		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_BY_ORG,
				finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_VLEGALFOREL_WHERE);

			if (orgId == null) {
				query.append(_FINDER_COLUMN_ORG_ORGID_1);
			}
			else {
				if (orgId.equals(StringPool.BLANK)) {
					query.append(_FINDER_COLUMN_ORG_ORGID_3);
				}
				else {
					query.append(_FINDER_COLUMN_ORG_ORGID_2);
				}
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (orgId != null) {
					qPos.add(orgId);
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

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_ORG, finderArgs,
					count);

				closeSession(session);
			}
		}

		return count.intValue();
	}

	/**
	 * Counts all the v legal f o rels.
	 *
	 * @return the number of v legal f o rels
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

				Query q = session.createQuery(_SQL_COUNT_VLEGALFOREL);

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
	 * Initializes the v legal f o rel persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.com.vportal.portlet.vlegal.model.VLegalFORel")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<VLegalFORel>> listenersList = new ArrayList<ModelListener<VLegalFORel>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<VLegalFORel>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(VLegalFORelImpl.class.getName());
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
	private static final String _SQL_SELECT_VLEGALFOREL = "SELECT vLegalFORel FROM VLegalFORel vLegalFORel";
	private static final String _SQL_SELECT_VLEGALFOREL_WHERE = "SELECT vLegalFORel FROM VLegalFORel vLegalFORel WHERE ";
	private static final String _SQL_COUNT_VLEGALFOREL = "SELECT COUNT(vLegalFORel) FROM VLegalFORel vLegalFORel";
	private static final String _SQL_COUNT_VLEGALFOREL_WHERE = "SELECT COUNT(vLegalFORel) FROM VLegalFORel vLegalFORel WHERE ";
	private static final String _FINDER_COLUMN_FIELD_FIELDID_1 = "vLegalFORel.id.fieldId IS NULL";
	private static final String _FINDER_COLUMN_FIELD_FIELDID_2 = "vLegalFORel.id.fieldId = ?";
	private static final String _FINDER_COLUMN_FIELD_FIELDID_3 = "(vLegalFORel.id.fieldId IS NULL OR vLegalFORel.id.fieldId = ?)";
	private static final String _FINDER_COLUMN_ORG_ORGID_1 = "vLegalFORel.id.orgId IS NULL";
	private static final String _FINDER_COLUMN_ORG_ORGID_2 = "vLegalFORel.id.orgId = ?";
	private static final String _FINDER_COLUMN_ORG_ORGID_3 = "(vLegalFORel.id.orgId IS NULL OR vLegalFORel.id.orgId = ?)";
	private static final String _ORDER_BY_ENTITY_ALIAS = "vLegalFORel.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No VLegalFORel exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No VLegalFORel exists with the key {";
	private static Log _log = LogFactoryUtil.getLog(VLegalFORelPersistenceImpl.class);
}