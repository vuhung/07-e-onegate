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

import com.vportal.portlet.vlegal.NoSuchVLegalFTRelException;
import com.vportal.portlet.vlegal.model.VLegalFTRel;
import com.vportal.portlet.vlegal.model.impl.VLegalFTRelImpl;
import com.vportal.portlet.vlegal.model.impl.VLegalFTRelModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The persistence implementation for the v legal f t rel service.
 *
 * <p>
 * Never modify or reference this class directly. Always use {@link VLegalFTRelUtil} to access the v legal f t rel persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
 * </p>
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author ACB
 * @see VLegalFTRelPersistence
 * @see VLegalFTRelUtil
 * @generated
 */
public class VLegalFTRelPersistenceImpl extends BasePersistenceImpl<VLegalFTRel>
	implements VLegalFTRelPersistence {
	public static final String FINDER_CLASS_NAME_ENTITY = VLegalFTRelImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST = FINDER_CLASS_NAME_ENTITY +
		".List";
	public static final FinderPath FINDER_PATH_FIND_BY_FIELD = new FinderPath(VLegalFTRelModelImpl.ENTITY_CACHE_ENABLED,
			VLegalFTRelModelImpl.FINDER_CACHE_ENABLED, FINDER_CLASS_NAME_LIST,
			"findByField",
			new String[] {
				String.class.getName(),
				
			"java.lang.Integer", "java.lang.Integer",
				"com.liferay.portal.kernel.util.OrderByComparator"
			});
	public static final FinderPath FINDER_PATH_COUNT_BY_FIELD = new FinderPath(VLegalFTRelModelImpl.ENTITY_CACHE_ENABLED,
			VLegalFTRelModelImpl.FINDER_CACHE_ENABLED, FINDER_CLASS_NAME_LIST,
			"countByField", new String[] { String.class.getName() });
	public static final FinderPath FINDER_PATH_FIND_BY_TYPE = new FinderPath(VLegalFTRelModelImpl.ENTITY_CACHE_ENABLED,
			VLegalFTRelModelImpl.FINDER_CACHE_ENABLED, FINDER_CLASS_NAME_LIST,
			"findByType",
			new String[] {
				String.class.getName(),
				
			"java.lang.Integer", "java.lang.Integer",
				"com.liferay.portal.kernel.util.OrderByComparator"
			});
	public static final FinderPath FINDER_PATH_COUNT_BY_TYPE = new FinderPath(VLegalFTRelModelImpl.ENTITY_CACHE_ENABLED,
			VLegalFTRelModelImpl.FINDER_CACHE_ENABLED, FINDER_CLASS_NAME_LIST,
			"countByType", new String[] { String.class.getName() });
	public static final FinderPath FINDER_PATH_FIND_ALL = new FinderPath(VLegalFTRelModelImpl.ENTITY_CACHE_ENABLED,
			VLegalFTRelModelImpl.FINDER_CACHE_ENABLED, FINDER_CLASS_NAME_LIST,
			"findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(VLegalFTRelModelImpl.ENTITY_CACHE_ENABLED,
			VLegalFTRelModelImpl.FINDER_CACHE_ENABLED, FINDER_CLASS_NAME_LIST,
			"countAll", new String[0]);

	/**
	 * Caches the v legal f t rel in the entity cache if it is enabled.
	 *
	 * @param vLegalFTRel the v legal f t rel to cache
	 */
	public void cacheResult(VLegalFTRel vLegalFTRel) {
		EntityCacheUtil.putResult(VLegalFTRelModelImpl.ENTITY_CACHE_ENABLED,
			VLegalFTRelImpl.class, vLegalFTRel.getPrimaryKey(), vLegalFTRel);
	}

	/**
	 * Caches the v legal f t rels in the entity cache if it is enabled.
	 *
	 * @param vLegalFTRels the v legal f t rels to cache
	 */
	public void cacheResult(List<VLegalFTRel> vLegalFTRels) {
		for (VLegalFTRel vLegalFTRel : vLegalFTRels) {
			if (EntityCacheUtil.getResult(
						VLegalFTRelModelImpl.ENTITY_CACHE_ENABLED,
						VLegalFTRelImpl.class, vLegalFTRel.getPrimaryKey(), this) == null) {
				cacheResult(vLegalFTRel);
			}
		}
	}

	/**
	 * Clears the cache for all v legal f t rels.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	public void clearCache() {
		CacheRegistryUtil.clear(VLegalFTRelImpl.class.getName());
		EntityCacheUtil.clearCache(VLegalFTRelImpl.class.getName());
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST);
	}

	/**
	 * Clears the cache for the v legal f t rel.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	public void clearCache(VLegalFTRel vLegalFTRel) {
		EntityCacheUtil.removeResult(VLegalFTRelModelImpl.ENTITY_CACHE_ENABLED,
			VLegalFTRelImpl.class, vLegalFTRel.getPrimaryKey());
	}

	/**
	 * Creates a new v legal f t rel with the primary key. Does not add the v legal f t rel to the database.
	 *
	 * @param vLegalFTRelPK the primary key for the new v legal f t rel
	 * @return the new v legal f t rel
	 */
	public VLegalFTRel create(VLegalFTRelPK vLegalFTRelPK) {
		VLegalFTRel vLegalFTRel = new VLegalFTRelImpl();

		vLegalFTRel.setNew(true);
		vLegalFTRel.setPrimaryKey(vLegalFTRelPK);

		return vLegalFTRel;
	}

	/**
	 * Removes the v legal f t rel with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the v legal f t rel to remove
	 * @return the v legal f t rel that was removed
	 * @throws com.liferay.portal.NoSuchModelException if a v legal f t rel with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public VLegalFTRel remove(Serializable primaryKey)
		throws NoSuchModelException, SystemException {
		return remove((VLegalFTRelPK)primaryKey);
	}

	/**
	 * Removes the v legal f t rel with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param vLegalFTRelPK the primary key of the v legal f t rel to remove
	 * @return the v legal f t rel that was removed
	 * @throws com.vportal.portlet.vlegal.NoSuchVLegalFTRelException if a v legal f t rel with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public VLegalFTRel remove(VLegalFTRelPK vLegalFTRelPK)
		throws NoSuchVLegalFTRelException, SystemException {
		Session session = null;

		try {
			session = openSession();

			VLegalFTRel vLegalFTRel = (VLegalFTRel)session.get(VLegalFTRelImpl.class,
					vLegalFTRelPK);

			if (vLegalFTRel == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + vLegalFTRelPK);
				}

				throw new NoSuchVLegalFTRelException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					vLegalFTRelPK);
			}

			return remove(vLegalFTRel);
		}
		catch (NoSuchVLegalFTRelException nsee) {
			throw nsee;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected VLegalFTRel removeImpl(VLegalFTRel vLegalFTRel)
		throws SystemException {
		vLegalFTRel = toUnwrappedModel(vLegalFTRel);

		Session session = null;

		try {
			session = openSession();

			BatchSessionUtil.delete(session, vLegalFTRel);
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST);

		EntityCacheUtil.removeResult(VLegalFTRelModelImpl.ENTITY_CACHE_ENABLED,
			VLegalFTRelImpl.class, vLegalFTRel.getPrimaryKey());

		return vLegalFTRel;
	}

	public VLegalFTRel updateImpl(
		com.vportal.portlet.vlegal.model.VLegalFTRel vLegalFTRel, boolean merge)
		throws SystemException {
		vLegalFTRel = toUnwrappedModel(vLegalFTRel);

		Session session = null;

		try {
			session = openSession();

			BatchSessionUtil.update(session, vLegalFTRel, merge);

			vLegalFTRel.setNew(false);
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST);

		EntityCacheUtil.putResult(VLegalFTRelModelImpl.ENTITY_CACHE_ENABLED,
			VLegalFTRelImpl.class, vLegalFTRel.getPrimaryKey(), vLegalFTRel);

		return vLegalFTRel;
	}

	protected VLegalFTRel toUnwrappedModel(VLegalFTRel vLegalFTRel) {
		if (vLegalFTRel instanceof VLegalFTRelImpl) {
			return vLegalFTRel;
		}

		VLegalFTRelImpl vLegalFTRelImpl = new VLegalFTRelImpl();

		vLegalFTRelImpl.setNew(vLegalFTRel.isNew());
		vLegalFTRelImpl.setPrimaryKey(vLegalFTRel.getPrimaryKey());

		vLegalFTRelImpl.setFieldId(vLegalFTRel.getFieldId());
		vLegalFTRelImpl.setTypeId(vLegalFTRel.getTypeId());

		return vLegalFTRelImpl;
	}

	/**
	 * Finds the v legal f t rel with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the v legal f t rel to find
	 * @return the v legal f t rel
	 * @throws com.liferay.portal.NoSuchModelException if a v legal f t rel with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public VLegalFTRel findByPrimaryKey(Serializable primaryKey)
		throws NoSuchModelException, SystemException {
		return findByPrimaryKey((VLegalFTRelPK)primaryKey);
	}

	/**
	 * Finds the v legal f t rel with the primary key or throws a {@link com.vportal.portlet.vlegal.NoSuchVLegalFTRelException} if it could not be found.
	 *
	 * @param vLegalFTRelPK the primary key of the v legal f t rel to find
	 * @return the v legal f t rel
	 * @throws com.vportal.portlet.vlegal.NoSuchVLegalFTRelException if a v legal f t rel with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public VLegalFTRel findByPrimaryKey(VLegalFTRelPK vLegalFTRelPK)
		throws NoSuchVLegalFTRelException, SystemException {
		VLegalFTRel vLegalFTRel = fetchByPrimaryKey(vLegalFTRelPK);

		if (vLegalFTRel == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + vLegalFTRelPK);
			}

			throw new NoSuchVLegalFTRelException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				vLegalFTRelPK);
		}

		return vLegalFTRel;
	}

	/**
	 * Finds the v legal f t rel with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the v legal f t rel to find
	 * @return the v legal f t rel, or <code>null</code> if a v legal f t rel with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public VLegalFTRel fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		return fetchByPrimaryKey((VLegalFTRelPK)primaryKey);
	}

	/**
	 * Finds the v legal f t rel with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param vLegalFTRelPK the primary key of the v legal f t rel to find
	 * @return the v legal f t rel, or <code>null</code> if a v legal f t rel with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public VLegalFTRel fetchByPrimaryKey(VLegalFTRelPK vLegalFTRelPK)
		throws SystemException {
		VLegalFTRel vLegalFTRel = (VLegalFTRel)EntityCacheUtil.getResult(VLegalFTRelModelImpl.ENTITY_CACHE_ENABLED,
				VLegalFTRelImpl.class, vLegalFTRelPK, this);

		if (vLegalFTRel == null) {
			Session session = null;

			try {
				session = openSession();

				vLegalFTRel = (VLegalFTRel)session.get(VLegalFTRelImpl.class,
						vLegalFTRelPK);
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (vLegalFTRel != null) {
					cacheResult(vLegalFTRel);
				}

				closeSession(session);
			}
		}

		return vLegalFTRel;
	}

	/**
	 * Finds all the v legal f t rels where fieldId = &#63;.
	 *
	 * @param fieldId the field id to search with
	 * @return the matching v legal f t rels
	 * @throws SystemException if a system exception occurred
	 */
	public List<VLegalFTRel> findByField(String fieldId)
		throws SystemException {
		return findByField(fieldId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Finds a range of all the v legal f t rels where fieldId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param fieldId the field id to search with
	 * @param start the lower bound of the range of v legal f t rels to return
	 * @param end the upper bound of the range of v legal f t rels to return (not inclusive)
	 * @return the range of matching v legal f t rels
	 * @throws SystemException if a system exception occurred
	 */
	public List<VLegalFTRel> findByField(String fieldId, int start, int end)
		throws SystemException {
		return findByField(fieldId, start, end, null);
	}

	/**
	 * Finds an ordered range of all the v legal f t rels where fieldId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param fieldId the field id to search with
	 * @param start the lower bound of the range of v legal f t rels to return
	 * @param end the upper bound of the range of v legal f t rels to return (not inclusive)
	 * @param orderByComparator the comparator to order the results by
	 * @return the ordered range of matching v legal f t rels
	 * @throws SystemException if a system exception occurred
	 */
	public List<VLegalFTRel> findByField(String fieldId, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		Object[] finderArgs = new Object[] {
				fieldId,
				
				String.valueOf(start), String.valueOf(end),
				String.valueOf(orderByComparator)
			};

		List<VLegalFTRel> list = (List<VLegalFTRel>)FinderCacheUtil.getResult(FINDER_PATH_FIND_BY_FIELD,
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

			query.append(_SQL_SELECT_VLEGALFTREL_WHERE);

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
				query.append(VLegalFTRelModelImpl.ORDER_BY_JPQL);
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

				list = (List<VLegalFTRel>)QueryUtil.list(q, getDialect(),
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
	 * Finds the first v legal f t rel in the ordered set where fieldId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param fieldId the field id to search with
	 * @param orderByComparator the comparator to order the set by
	 * @return the first matching v legal f t rel
	 * @throws com.vportal.portlet.vlegal.NoSuchVLegalFTRelException if a matching v legal f t rel could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public VLegalFTRel findByField_First(String fieldId,
		OrderByComparator orderByComparator)
		throws NoSuchVLegalFTRelException, SystemException {
		List<VLegalFTRel> list = findByField(fieldId, 0, 1, orderByComparator);

		if (list.isEmpty()) {
			StringBundler msg = new StringBundler(4);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("fieldId=");
			msg.append(fieldId);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			throw new NoSuchVLegalFTRelException(msg.toString());
		}
		else {
			return list.get(0);
		}
	}

	/**
	 * Finds the last v legal f t rel in the ordered set where fieldId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param fieldId the field id to search with
	 * @param orderByComparator the comparator to order the set by
	 * @return the last matching v legal f t rel
	 * @throws com.vportal.portlet.vlegal.NoSuchVLegalFTRelException if a matching v legal f t rel could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public VLegalFTRel findByField_Last(String fieldId,
		OrderByComparator orderByComparator)
		throws NoSuchVLegalFTRelException, SystemException {
		int count = countByField(fieldId);

		List<VLegalFTRel> list = findByField(fieldId, count - 1, count,
				orderByComparator);

		if (list.isEmpty()) {
			StringBundler msg = new StringBundler(4);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("fieldId=");
			msg.append(fieldId);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			throw new NoSuchVLegalFTRelException(msg.toString());
		}
		else {
			return list.get(0);
		}
	}

	/**
	 * Finds the v legal f t rels before and after the current v legal f t rel in the ordered set where fieldId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param vLegalFTRelPK the primary key of the current v legal f t rel
	 * @param fieldId the field id to search with
	 * @param orderByComparator the comparator to order the set by
	 * @return the previous, current, and next v legal f t rel
	 * @throws com.vportal.portlet.vlegal.NoSuchVLegalFTRelException if a v legal f t rel with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public VLegalFTRel[] findByField_PrevAndNext(VLegalFTRelPK vLegalFTRelPK,
		String fieldId, OrderByComparator orderByComparator)
		throws NoSuchVLegalFTRelException, SystemException {
		VLegalFTRel vLegalFTRel = findByPrimaryKey(vLegalFTRelPK);

		Session session = null;

		try {
			session = openSession();

			VLegalFTRel[] array = new VLegalFTRelImpl[3];

			array[0] = getByField_PrevAndNext(session, vLegalFTRel, fieldId,
					orderByComparator, true);

			array[1] = vLegalFTRel;

			array[2] = getByField_PrevAndNext(session, vLegalFTRel, fieldId,
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

	protected VLegalFTRel getByField_PrevAndNext(Session session,
		VLegalFTRel vLegalFTRel, String fieldId,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_VLEGALFTREL_WHERE);

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
			query.append(VLegalFTRelModelImpl.ORDER_BY_JPQL);
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
			Object[] values = orderByComparator.getOrderByValues(vLegalFTRel);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<VLegalFTRel> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Finds all the v legal f t rels where typeId = &#63;.
	 *
	 * @param typeId the type id to search with
	 * @return the matching v legal f t rels
	 * @throws SystemException if a system exception occurred
	 */
	public List<VLegalFTRel> findByType(String typeId)
		throws SystemException {
		return findByType(typeId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Finds a range of all the v legal f t rels where typeId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param typeId the type id to search with
	 * @param start the lower bound of the range of v legal f t rels to return
	 * @param end the upper bound of the range of v legal f t rels to return (not inclusive)
	 * @return the range of matching v legal f t rels
	 * @throws SystemException if a system exception occurred
	 */
	public List<VLegalFTRel> findByType(String typeId, int start, int end)
		throws SystemException {
		return findByType(typeId, start, end, null);
	}

	/**
	 * Finds an ordered range of all the v legal f t rels where typeId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param typeId the type id to search with
	 * @param start the lower bound of the range of v legal f t rels to return
	 * @param end the upper bound of the range of v legal f t rels to return (not inclusive)
	 * @param orderByComparator the comparator to order the results by
	 * @return the ordered range of matching v legal f t rels
	 * @throws SystemException if a system exception occurred
	 */
	public List<VLegalFTRel> findByType(String typeId, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		Object[] finderArgs = new Object[] {
				typeId,
				
				String.valueOf(start), String.valueOf(end),
				String.valueOf(orderByComparator)
			};

		List<VLegalFTRel> list = (List<VLegalFTRel>)FinderCacheUtil.getResult(FINDER_PATH_FIND_BY_TYPE,
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

			query.append(_SQL_SELECT_VLEGALFTREL_WHERE);

			if (typeId == null) {
				query.append(_FINDER_COLUMN_TYPE_TYPEID_1);
			}
			else {
				if (typeId.equals(StringPool.BLANK)) {
					query.append(_FINDER_COLUMN_TYPE_TYPEID_3);
				}
				else {
					query.append(_FINDER_COLUMN_TYPE_TYPEID_2);
				}
			}

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}

			else {
				query.append(VLegalFTRelModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (typeId != null) {
					qPos.add(typeId);
				}

				list = (List<VLegalFTRel>)QueryUtil.list(q, getDialect(),
						start, end);
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (list == null) {
					FinderCacheUtil.removeResult(FINDER_PATH_FIND_BY_TYPE,
						finderArgs);
				}
				else {
					cacheResult(list);

					FinderCacheUtil.putResult(FINDER_PATH_FIND_BY_TYPE,
						finderArgs, list);
				}

				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Finds the first v legal f t rel in the ordered set where typeId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param typeId the type id to search with
	 * @param orderByComparator the comparator to order the set by
	 * @return the first matching v legal f t rel
	 * @throws com.vportal.portlet.vlegal.NoSuchVLegalFTRelException if a matching v legal f t rel could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public VLegalFTRel findByType_First(String typeId,
		OrderByComparator orderByComparator)
		throws NoSuchVLegalFTRelException, SystemException {
		List<VLegalFTRel> list = findByType(typeId, 0, 1, orderByComparator);

		if (list.isEmpty()) {
			StringBundler msg = new StringBundler(4);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("typeId=");
			msg.append(typeId);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			throw new NoSuchVLegalFTRelException(msg.toString());
		}
		else {
			return list.get(0);
		}
	}

	/**
	 * Finds the last v legal f t rel in the ordered set where typeId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param typeId the type id to search with
	 * @param orderByComparator the comparator to order the set by
	 * @return the last matching v legal f t rel
	 * @throws com.vportal.portlet.vlegal.NoSuchVLegalFTRelException if a matching v legal f t rel could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public VLegalFTRel findByType_Last(String typeId,
		OrderByComparator orderByComparator)
		throws NoSuchVLegalFTRelException, SystemException {
		int count = countByType(typeId);

		List<VLegalFTRel> list = findByType(typeId, count - 1, count,
				orderByComparator);

		if (list.isEmpty()) {
			StringBundler msg = new StringBundler(4);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("typeId=");
			msg.append(typeId);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			throw new NoSuchVLegalFTRelException(msg.toString());
		}
		else {
			return list.get(0);
		}
	}

	/**
	 * Finds the v legal f t rels before and after the current v legal f t rel in the ordered set where typeId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param vLegalFTRelPK the primary key of the current v legal f t rel
	 * @param typeId the type id to search with
	 * @param orderByComparator the comparator to order the set by
	 * @return the previous, current, and next v legal f t rel
	 * @throws com.vportal.portlet.vlegal.NoSuchVLegalFTRelException if a v legal f t rel with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public VLegalFTRel[] findByType_PrevAndNext(VLegalFTRelPK vLegalFTRelPK,
		String typeId, OrderByComparator orderByComparator)
		throws NoSuchVLegalFTRelException, SystemException {
		VLegalFTRel vLegalFTRel = findByPrimaryKey(vLegalFTRelPK);

		Session session = null;

		try {
			session = openSession();

			VLegalFTRel[] array = new VLegalFTRelImpl[3];

			array[0] = getByType_PrevAndNext(session, vLegalFTRel, typeId,
					orderByComparator, true);

			array[1] = vLegalFTRel;

			array[2] = getByType_PrevAndNext(session, vLegalFTRel, typeId,
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

	protected VLegalFTRel getByType_PrevAndNext(Session session,
		VLegalFTRel vLegalFTRel, String typeId,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_VLEGALFTREL_WHERE);

		if (typeId == null) {
			query.append(_FINDER_COLUMN_TYPE_TYPEID_1);
		}
		else {
			if (typeId.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_TYPE_TYPEID_3);
			}
			else {
				query.append(_FINDER_COLUMN_TYPE_TYPEID_2);
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
			query.append(VLegalFTRelModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		if (typeId != null) {
			qPos.add(typeId);
		}

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByValues(vLegalFTRel);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<VLegalFTRel> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Finds all the v legal f t rels.
	 *
	 * @return the v legal f t rels
	 * @throws SystemException if a system exception occurred
	 */
	public List<VLegalFTRel> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Finds a range of all the v legal f t rels.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param start the lower bound of the range of v legal f t rels to return
	 * @param end the upper bound of the range of v legal f t rels to return (not inclusive)
	 * @return the range of v legal f t rels
	 * @throws SystemException if a system exception occurred
	 */
	public List<VLegalFTRel> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Finds an ordered range of all the v legal f t rels.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param start the lower bound of the range of v legal f t rels to return
	 * @param end the upper bound of the range of v legal f t rels to return (not inclusive)
	 * @param orderByComparator the comparator to order the results by
	 * @return the ordered range of v legal f t rels
	 * @throws SystemException if a system exception occurred
	 */
	public List<VLegalFTRel> findAll(int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		Object[] finderArgs = new Object[] {
				String.valueOf(start), String.valueOf(end),
				String.valueOf(orderByComparator)
			};

		List<VLegalFTRel> list = (List<VLegalFTRel>)FinderCacheUtil.getResult(FINDER_PATH_FIND_ALL,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_VLEGALFTREL);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_VLEGALFTREL.concat(VLegalFTRelModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (orderByComparator == null) {
					list = (List<VLegalFTRel>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);
				}
				else {
					list = (List<VLegalFTRel>)QueryUtil.list(q, getDialect(),
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
	 * Removes all the v legal f t rels where fieldId = &#63; from the database.
	 *
	 * @param fieldId the field id to search with
	 * @throws SystemException if a system exception occurred
	 */
	public void removeByField(String fieldId) throws SystemException {
		for (VLegalFTRel vLegalFTRel : findByField(fieldId)) {
			remove(vLegalFTRel);
		}
	}

	/**
	 * Removes all the v legal f t rels where typeId = &#63; from the database.
	 *
	 * @param typeId the type id to search with
	 * @throws SystemException if a system exception occurred
	 */
	public void removeByType(String typeId) throws SystemException {
		for (VLegalFTRel vLegalFTRel : findByType(typeId)) {
			remove(vLegalFTRel);
		}
	}

	/**
	 * Removes all the v legal f t rels from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	public void removeAll() throws SystemException {
		for (VLegalFTRel vLegalFTRel : findAll()) {
			remove(vLegalFTRel);
		}
	}

	/**
	 * Counts all the v legal f t rels where fieldId = &#63;.
	 *
	 * @param fieldId the field id to search with
	 * @return the number of matching v legal f t rels
	 * @throws SystemException if a system exception occurred
	 */
	public int countByField(String fieldId) throws SystemException {
		Object[] finderArgs = new Object[] { fieldId };

		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_BY_FIELD,
				finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_VLEGALFTREL_WHERE);

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
	 * Counts all the v legal f t rels where typeId = &#63;.
	 *
	 * @param typeId the type id to search with
	 * @return the number of matching v legal f t rels
	 * @throws SystemException if a system exception occurred
	 */
	public int countByType(String typeId) throws SystemException {
		Object[] finderArgs = new Object[] { typeId };

		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_BY_TYPE,
				finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_VLEGALFTREL_WHERE);

			if (typeId == null) {
				query.append(_FINDER_COLUMN_TYPE_TYPEID_1);
			}
			else {
				if (typeId.equals(StringPool.BLANK)) {
					query.append(_FINDER_COLUMN_TYPE_TYPEID_3);
				}
				else {
					query.append(_FINDER_COLUMN_TYPE_TYPEID_2);
				}
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (typeId != null) {
					qPos.add(typeId);
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

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_TYPE,
					finderArgs, count);

				closeSession(session);
			}
		}

		return count.intValue();
	}

	/**
	 * Counts all the v legal f t rels.
	 *
	 * @return the number of v legal f t rels
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

				Query q = session.createQuery(_SQL_COUNT_VLEGALFTREL);

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
	 * Initializes the v legal f t rel persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.com.vportal.portlet.vlegal.model.VLegalFTRel")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<VLegalFTRel>> listenersList = new ArrayList<ModelListener<VLegalFTRel>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<VLegalFTRel>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(VLegalFTRelImpl.class.getName());
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
	private static final String _SQL_SELECT_VLEGALFTREL = "SELECT vLegalFTRel FROM VLegalFTRel vLegalFTRel";
	private static final String _SQL_SELECT_VLEGALFTREL_WHERE = "SELECT vLegalFTRel FROM VLegalFTRel vLegalFTRel WHERE ";
	private static final String _SQL_COUNT_VLEGALFTREL = "SELECT COUNT(vLegalFTRel) FROM VLegalFTRel vLegalFTRel";
	private static final String _SQL_COUNT_VLEGALFTREL_WHERE = "SELECT COUNT(vLegalFTRel) FROM VLegalFTRel vLegalFTRel WHERE ";
	private static final String _FINDER_COLUMN_FIELD_FIELDID_1 = "vLegalFTRel.id.fieldId IS NULL";
	private static final String _FINDER_COLUMN_FIELD_FIELDID_2 = "vLegalFTRel.id.fieldId = ?";
	private static final String _FINDER_COLUMN_FIELD_FIELDID_3 = "(vLegalFTRel.id.fieldId IS NULL OR vLegalFTRel.id.fieldId = ?)";
	private static final String _FINDER_COLUMN_TYPE_TYPEID_1 = "vLegalFTRel.id.typeId IS NULL";
	private static final String _FINDER_COLUMN_TYPE_TYPEID_2 = "vLegalFTRel.id.typeId = ?";
	private static final String _FINDER_COLUMN_TYPE_TYPEID_3 = "(vLegalFTRel.id.typeId IS NULL OR vLegalFTRel.id.typeId = ?)";
	private static final String _ORDER_BY_ENTITY_ALIAS = "vLegalFTRel.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No VLegalFTRel exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No VLegalFTRel exists with the key {";
	private static Log _log = LogFactoryUtil.getLog(VLegalFTRelPersistenceImpl.class);
}