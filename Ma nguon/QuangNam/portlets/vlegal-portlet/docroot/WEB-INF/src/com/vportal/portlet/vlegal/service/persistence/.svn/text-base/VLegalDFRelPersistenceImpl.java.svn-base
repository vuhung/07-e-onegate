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

import com.vportal.portlet.vlegal.NoSuchVLegalDFRelException;
import com.vportal.portlet.vlegal.model.VLegalDFRel;
import com.vportal.portlet.vlegal.model.impl.VLegalDFRelImpl;
import com.vportal.portlet.vlegal.model.impl.VLegalDFRelModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The persistence implementation for the v legal d f rel service.
 *
 * <p>
 * Never modify or reference this class directly. Always use {@link VLegalDFRelUtil} to access the v legal d f rel persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
 * </p>
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author ACB
 * @see VLegalDFRelPersistence
 * @see VLegalDFRelUtil
 * @generated
 */
public class VLegalDFRelPersistenceImpl extends BasePersistenceImpl<VLegalDFRel>
	implements VLegalDFRelPersistence {
	public static final String FINDER_CLASS_NAME_ENTITY = VLegalDFRelImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST = FINDER_CLASS_NAME_ENTITY +
		".List";
	public static final FinderPath FINDER_PATH_FIND_BY_FIELD = new FinderPath(VLegalDFRelModelImpl.ENTITY_CACHE_ENABLED,
			VLegalDFRelModelImpl.FINDER_CACHE_ENABLED, FINDER_CLASS_NAME_LIST,
			"findByField",
			new String[] {
				String.class.getName(),
				
			"java.lang.Integer", "java.lang.Integer",
				"com.liferay.portal.kernel.util.OrderByComparator"
			});
	public static final FinderPath FINDER_PATH_COUNT_BY_FIELD = new FinderPath(VLegalDFRelModelImpl.ENTITY_CACHE_ENABLED,
			VLegalDFRelModelImpl.FINDER_CACHE_ENABLED, FINDER_CLASS_NAME_LIST,
			"countByField", new String[] { String.class.getName() });
	public static final FinderPath FINDER_PATH_FIND_BY_DOC = new FinderPath(VLegalDFRelModelImpl.ENTITY_CACHE_ENABLED,
			VLegalDFRelModelImpl.FINDER_CACHE_ENABLED, FINDER_CLASS_NAME_LIST,
			"findByDoc",
			new String[] {
				String.class.getName(),
				
			"java.lang.Integer", "java.lang.Integer",
				"com.liferay.portal.kernel.util.OrderByComparator"
			});
	public static final FinderPath FINDER_PATH_COUNT_BY_DOC = new FinderPath(VLegalDFRelModelImpl.ENTITY_CACHE_ENABLED,
			VLegalDFRelModelImpl.FINDER_CACHE_ENABLED, FINDER_CLASS_NAME_LIST,
			"countByDoc", new String[] { String.class.getName() });
	public static final FinderPath FINDER_PATH_FIND_ALL = new FinderPath(VLegalDFRelModelImpl.ENTITY_CACHE_ENABLED,
			VLegalDFRelModelImpl.FINDER_CACHE_ENABLED, FINDER_CLASS_NAME_LIST,
			"findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(VLegalDFRelModelImpl.ENTITY_CACHE_ENABLED,
			VLegalDFRelModelImpl.FINDER_CACHE_ENABLED, FINDER_CLASS_NAME_LIST,
			"countAll", new String[0]);

	/**
	 * Caches the v legal d f rel in the entity cache if it is enabled.
	 *
	 * @param vLegalDFRel the v legal d f rel to cache
	 */
	public void cacheResult(VLegalDFRel vLegalDFRel) {
		EntityCacheUtil.putResult(VLegalDFRelModelImpl.ENTITY_CACHE_ENABLED,
			VLegalDFRelImpl.class, vLegalDFRel.getPrimaryKey(), vLegalDFRel);
	}

	/**
	 * Caches the v legal d f rels in the entity cache if it is enabled.
	 *
	 * @param vLegalDFRels the v legal d f rels to cache
	 */
	public void cacheResult(List<VLegalDFRel> vLegalDFRels) {
		for (VLegalDFRel vLegalDFRel : vLegalDFRels) {
			if (EntityCacheUtil.getResult(
						VLegalDFRelModelImpl.ENTITY_CACHE_ENABLED,
						VLegalDFRelImpl.class, vLegalDFRel.getPrimaryKey(), this) == null) {
				cacheResult(vLegalDFRel);
			}
		}
	}

	/**
	 * Clears the cache for all v legal d f rels.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	public void clearCache() {
		CacheRegistryUtil.clear(VLegalDFRelImpl.class.getName());
		EntityCacheUtil.clearCache(VLegalDFRelImpl.class.getName());
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST);
	}

	/**
	 * Clears the cache for the v legal d f rel.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	public void clearCache(VLegalDFRel vLegalDFRel) {
		EntityCacheUtil.removeResult(VLegalDFRelModelImpl.ENTITY_CACHE_ENABLED,
			VLegalDFRelImpl.class, vLegalDFRel.getPrimaryKey());
	}

	/**
	 * Creates a new v legal d f rel with the primary key. Does not add the v legal d f rel to the database.
	 *
	 * @param vLegalDFRelPK the primary key for the new v legal d f rel
	 * @return the new v legal d f rel
	 */
	public VLegalDFRel create(VLegalDFRelPK vLegalDFRelPK) {
		VLegalDFRel vLegalDFRel = new VLegalDFRelImpl();

		vLegalDFRel.setNew(true);
		vLegalDFRel.setPrimaryKey(vLegalDFRelPK);

		return vLegalDFRel;
	}

	/**
	 * Removes the v legal d f rel with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the v legal d f rel to remove
	 * @return the v legal d f rel that was removed
	 * @throws com.liferay.portal.NoSuchModelException if a v legal d f rel with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public VLegalDFRel remove(Serializable primaryKey)
		throws NoSuchModelException, SystemException {
		return remove((VLegalDFRelPK)primaryKey);
	}

	/**
	 * Removes the v legal d f rel with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param vLegalDFRelPK the primary key of the v legal d f rel to remove
	 * @return the v legal d f rel that was removed
	 * @throws com.vportal.portlet.vlegal.NoSuchVLegalDFRelException if a v legal d f rel with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public VLegalDFRel remove(VLegalDFRelPK vLegalDFRelPK)
		throws NoSuchVLegalDFRelException, SystemException {
		Session session = null;

		try {
			session = openSession();

			VLegalDFRel vLegalDFRel = (VLegalDFRel)session.get(VLegalDFRelImpl.class,
					vLegalDFRelPK);

			if (vLegalDFRel == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + vLegalDFRelPK);
				}

				throw new NoSuchVLegalDFRelException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					vLegalDFRelPK);
			}

			return remove(vLegalDFRel);
		}
		catch (NoSuchVLegalDFRelException nsee) {
			throw nsee;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected VLegalDFRel removeImpl(VLegalDFRel vLegalDFRel)
		throws SystemException {
		vLegalDFRel = toUnwrappedModel(vLegalDFRel);

		Session session = null;

		try {
			session = openSession();

			BatchSessionUtil.delete(session, vLegalDFRel);
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST);

		EntityCacheUtil.removeResult(VLegalDFRelModelImpl.ENTITY_CACHE_ENABLED,
			VLegalDFRelImpl.class, vLegalDFRel.getPrimaryKey());

		return vLegalDFRel;
	}

	public VLegalDFRel updateImpl(
		com.vportal.portlet.vlegal.model.VLegalDFRel vLegalDFRel, boolean merge)
		throws SystemException {
		vLegalDFRel = toUnwrappedModel(vLegalDFRel);

		Session session = null;

		try {
			session = openSession();

			BatchSessionUtil.update(session, vLegalDFRel, merge);

			vLegalDFRel.setNew(false);
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST);

		EntityCacheUtil.putResult(VLegalDFRelModelImpl.ENTITY_CACHE_ENABLED,
			VLegalDFRelImpl.class, vLegalDFRel.getPrimaryKey(), vLegalDFRel);

		return vLegalDFRel;
	}

	protected VLegalDFRel toUnwrappedModel(VLegalDFRel vLegalDFRel) {
		if (vLegalDFRel instanceof VLegalDFRelImpl) {
			return vLegalDFRel;
		}

		VLegalDFRelImpl vLegalDFRelImpl = new VLegalDFRelImpl();

		vLegalDFRelImpl.setNew(vLegalDFRel.isNew());
		vLegalDFRelImpl.setPrimaryKey(vLegalDFRel.getPrimaryKey());

		vLegalDFRelImpl.setFieldId(vLegalDFRel.getFieldId());
		vLegalDFRelImpl.setDocId(vLegalDFRel.getDocId());

		return vLegalDFRelImpl;
	}

	/**
	 * Finds the v legal d f rel with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the v legal d f rel to find
	 * @return the v legal d f rel
	 * @throws com.liferay.portal.NoSuchModelException if a v legal d f rel with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public VLegalDFRel findByPrimaryKey(Serializable primaryKey)
		throws NoSuchModelException, SystemException {
		return findByPrimaryKey((VLegalDFRelPK)primaryKey);
	}

	/**
	 * Finds the v legal d f rel with the primary key or throws a {@link com.vportal.portlet.vlegal.NoSuchVLegalDFRelException} if it could not be found.
	 *
	 * @param vLegalDFRelPK the primary key of the v legal d f rel to find
	 * @return the v legal d f rel
	 * @throws com.vportal.portlet.vlegal.NoSuchVLegalDFRelException if a v legal d f rel with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public VLegalDFRel findByPrimaryKey(VLegalDFRelPK vLegalDFRelPK)
		throws NoSuchVLegalDFRelException, SystemException {
		VLegalDFRel vLegalDFRel = fetchByPrimaryKey(vLegalDFRelPK);

		if (vLegalDFRel == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + vLegalDFRelPK);
			}

			throw new NoSuchVLegalDFRelException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				vLegalDFRelPK);
		}

		return vLegalDFRel;
	}

	/**
	 * Finds the v legal d f rel with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the v legal d f rel to find
	 * @return the v legal d f rel, or <code>null</code> if a v legal d f rel with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public VLegalDFRel fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		return fetchByPrimaryKey((VLegalDFRelPK)primaryKey);
	}

	/**
	 * Finds the v legal d f rel with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param vLegalDFRelPK the primary key of the v legal d f rel to find
	 * @return the v legal d f rel, or <code>null</code> if a v legal d f rel with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public VLegalDFRel fetchByPrimaryKey(VLegalDFRelPK vLegalDFRelPK)
		throws SystemException {
		VLegalDFRel vLegalDFRel = (VLegalDFRel)EntityCacheUtil.getResult(VLegalDFRelModelImpl.ENTITY_CACHE_ENABLED,
				VLegalDFRelImpl.class, vLegalDFRelPK, this);

		if (vLegalDFRel == null) {
			Session session = null;

			try {
				session = openSession();

				vLegalDFRel = (VLegalDFRel)session.get(VLegalDFRelImpl.class,
						vLegalDFRelPK);
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (vLegalDFRel != null) {
					cacheResult(vLegalDFRel);
				}

				closeSession(session);
			}
		}

		return vLegalDFRel;
	}

	/**
	 * Finds all the v legal d f rels where fieldId = &#63;.
	 *
	 * @param fieldId the field id to search with
	 * @return the matching v legal d f rels
	 * @throws SystemException if a system exception occurred
	 */
	public List<VLegalDFRel> findByField(String fieldId)
		throws SystemException {
		return findByField(fieldId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Finds a range of all the v legal d f rels where fieldId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param fieldId the field id to search with
	 * @param start the lower bound of the range of v legal d f rels to return
	 * @param end the upper bound of the range of v legal d f rels to return (not inclusive)
	 * @return the range of matching v legal d f rels
	 * @throws SystemException if a system exception occurred
	 */
	public List<VLegalDFRel> findByField(String fieldId, int start, int end)
		throws SystemException {
		return findByField(fieldId, start, end, null);
	}

	/**
	 * Finds an ordered range of all the v legal d f rels where fieldId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param fieldId the field id to search with
	 * @param start the lower bound of the range of v legal d f rels to return
	 * @param end the upper bound of the range of v legal d f rels to return (not inclusive)
	 * @param orderByComparator the comparator to order the results by
	 * @return the ordered range of matching v legal d f rels
	 * @throws SystemException if a system exception occurred
	 */
	public List<VLegalDFRel> findByField(String fieldId, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		Object[] finderArgs = new Object[] {
				fieldId,
				
				String.valueOf(start), String.valueOf(end),
				String.valueOf(orderByComparator)
			};

		List<VLegalDFRel> list = (List<VLegalDFRel>)FinderCacheUtil.getResult(FINDER_PATH_FIND_BY_FIELD,
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

			query.append(_SQL_SELECT_VLEGALDFREL_WHERE);

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
				query.append(VLegalDFRelModelImpl.ORDER_BY_JPQL);
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

				list = (List<VLegalDFRel>)QueryUtil.list(q, getDialect(),
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
	 * Finds the first v legal d f rel in the ordered set where fieldId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param fieldId the field id to search with
	 * @param orderByComparator the comparator to order the set by
	 * @return the first matching v legal d f rel
	 * @throws com.vportal.portlet.vlegal.NoSuchVLegalDFRelException if a matching v legal d f rel could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public VLegalDFRel findByField_First(String fieldId,
		OrderByComparator orderByComparator)
		throws NoSuchVLegalDFRelException, SystemException {
		List<VLegalDFRel> list = findByField(fieldId, 0, 1, orderByComparator);

		if (list.isEmpty()) {
			StringBundler msg = new StringBundler(4);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("fieldId=");
			msg.append(fieldId);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			throw new NoSuchVLegalDFRelException(msg.toString());
		}
		else {
			return list.get(0);
		}
	}

	/**
	 * Finds the last v legal d f rel in the ordered set where fieldId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param fieldId the field id to search with
	 * @param orderByComparator the comparator to order the set by
	 * @return the last matching v legal d f rel
	 * @throws com.vportal.portlet.vlegal.NoSuchVLegalDFRelException if a matching v legal d f rel could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public VLegalDFRel findByField_Last(String fieldId,
		OrderByComparator orderByComparator)
		throws NoSuchVLegalDFRelException, SystemException {
		int count = countByField(fieldId);

		List<VLegalDFRel> list = findByField(fieldId, count - 1, count,
				orderByComparator);

		if (list.isEmpty()) {
			StringBundler msg = new StringBundler(4);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("fieldId=");
			msg.append(fieldId);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			throw new NoSuchVLegalDFRelException(msg.toString());
		}
		else {
			return list.get(0);
		}
	}

	/**
	 * Finds the v legal d f rels before and after the current v legal d f rel in the ordered set where fieldId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param vLegalDFRelPK the primary key of the current v legal d f rel
	 * @param fieldId the field id to search with
	 * @param orderByComparator the comparator to order the set by
	 * @return the previous, current, and next v legal d f rel
	 * @throws com.vportal.portlet.vlegal.NoSuchVLegalDFRelException if a v legal d f rel with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public VLegalDFRel[] findByField_PrevAndNext(VLegalDFRelPK vLegalDFRelPK,
		String fieldId, OrderByComparator orderByComparator)
		throws NoSuchVLegalDFRelException, SystemException {
		VLegalDFRel vLegalDFRel = findByPrimaryKey(vLegalDFRelPK);

		Session session = null;

		try {
			session = openSession();

			VLegalDFRel[] array = new VLegalDFRelImpl[3];

			array[0] = getByField_PrevAndNext(session, vLegalDFRel, fieldId,
					orderByComparator, true);

			array[1] = vLegalDFRel;

			array[2] = getByField_PrevAndNext(session, vLegalDFRel, fieldId,
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

	protected VLegalDFRel getByField_PrevAndNext(Session session,
		VLegalDFRel vLegalDFRel, String fieldId,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_VLEGALDFREL_WHERE);

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
			query.append(VLegalDFRelModelImpl.ORDER_BY_JPQL);
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
			Object[] values = orderByComparator.getOrderByValues(vLegalDFRel);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<VLegalDFRel> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Finds all the v legal d f rels where docId = &#63;.
	 *
	 * @param docId the doc id to search with
	 * @return the matching v legal d f rels
	 * @throws SystemException if a system exception occurred
	 */
	public List<VLegalDFRel> findByDoc(String docId) throws SystemException {
		return findByDoc(docId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Finds a range of all the v legal d f rels where docId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param docId the doc id to search with
	 * @param start the lower bound of the range of v legal d f rels to return
	 * @param end the upper bound of the range of v legal d f rels to return (not inclusive)
	 * @return the range of matching v legal d f rels
	 * @throws SystemException if a system exception occurred
	 */
	public List<VLegalDFRel> findByDoc(String docId, int start, int end)
		throws SystemException {
		return findByDoc(docId, start, end, null);
	}

	/**
	 * Finds an ordered range of all the v legal d f rels where docId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param docId the doc id to search with
	 * @param start the lower bound of the range of v legal d f rels to return
	 * @param end the upper bound of the range of v legal d f rels to return (not inclusive)
	 * @param orderByComparator the comparator to order the results by
	 * @return the ordered range of matching v legal d f rels
	 * @throws SystemException if a system exception occurred
	 */
	public List<VLegalDFRel> findByDoc(String docId, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		Object[] finderArgs = new Object[] {
				docId,
				
				String.valueOf(start), String.valueOf(end),
				String.valueOf(orderByComparator)
			};

		List<VLegalDFRel> list = (List<VLegalDFRel>)FinderCacheUtil.getResult(FINDER_PATH_FIND_BY_DOC,
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

			query.append(_SQL_SELECT_VLEGALDFREL_WHERE);

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
				query.append(VLegalDFRelModelImpl.ORDER_BY_JPQL);
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

				list = (List<VLegalDFRel>)QueryUtil.list(q, getDialect(),
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
	 * Finds the first v legal d f rel in the ordered set where docId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param docId the doc id to search with
	 * @param orderByComparator the comparator to order the set by
	 * @return the first matching v legal d f rel
	 * @throws com.vportal.portlet.vlegal.NoSuchVLegalDFRelException if a matching v legal d f rel could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public VLegalDFRel findByDoc_First(String docId,
		OrderByComparator orderByComparator)
		throws NoSuchVLegalDFRelException, SystemException {
		List<VLegalDFRel> list = findByDoc(docId, 0, 1, orderByComparator);

		if (list.isEmpty()) {
			StringBundler msg = new StringBundler(4);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("docId=");
			msg.append(docId);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			throw new NoSuchVLegalDFRelException(msg.toString());
		}
		else {
			return list.get(0);
		}
	}

	/**
	 * Finds the last v legal d f rel in the ordered set where docId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param docId the doc id to search with
	 * @param orderByComparator the comparator to order the set by
	 * @return the last matching v legal d f rel
	 * @throws com.vportal.portlet.vlegal.NoSuchVLegalDFRelException if a matching v legal d f rel could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public VLegalDFRel findByDoc_Last(String docId,
		OrderByComparator orderByComparator)
		throws NoSuchVLegalDFRelException, SystemException {
		int count = countByDoc(docId);

		List<VLegalDFRel> list = findByDoc(docId, count - 1, count,
				orderByComparator);

		if (list.isEmpty()) {
			StringBundler msg = new StringBundler(4);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("docId=");
			msg.append(docId);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			throw new NoSuchVLegalDFRelException(msg.toString());
		}
		else {
			return list.get(0);
		}
	}

	/**
	 * Finds the v legal d f rels before and after the current v legal d f rel in the ordered set where docId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param vLegalDFRelPK the primary key of the current v legal d f rel
	 * @param docId the doc id to search with
	 * @param orderByComparator the comparator to order the set by
	 * @return the previous, current, and next v legal d f rel
	 * @throws com.vportal.portlet.vlegal.NoSuchVLegalDFRelException if a v legal d f rel with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public VLegalDFRel[] findByDoc_PrevAndNext(VLegalDFRelPK vLegalDFRelPK,
		String docId, OrderByComparator orderByComparator)
		throws NoSuchVLegalDFRelException, SystemException {
		VLegalDFRel vLegalDFRel = findByPrimaryKey(vLegalDFRelPK);

		Session session = null;

		try {
			session = openSession();

			VLegalDFRel[] array = new VLegalDFRelImpl[3];

			array[0] = getByDoc_PrevAndNext(session, vLegalDFRel, docId,
					orderByComparator, true);

			array[1] = vLegalDFRel;

			array[2] = getByDoc_PrevAndNext(session, vLegalDFRel, docId,
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

	protected VLegalDFRel getByDoc_PrevAndNext(Session session,
		VLegalDFRel vLegalDFRel, String docId,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_VLEGALDFREL_WHERE);

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
			query.append(VLegalDFRelModelImpl.ORDER_BY_JPQL);
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
			Object[] values = orderByComparator.getOrderByValues(vLegalDFRel);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<VLegalDFRel> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Finds all the v legal d f rels.
	 *
	 * @return the v legal d f rels
	 * @throws SystemException if a system exception occurred
	 */
	public List<VLegalDFRel> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Finds a range of all the v legal d f rels.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param start the lower bound of the range of v legal d f rels to return
	 * @param end the upper bound of the range of v legal d f rels to return (not inclusive)
	 * @return the range of v legal d f rels
	 * @throws SystemException if a system exception occurred
	 */
	public List<VLegalDFRel> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Finds an ordered range of all the v legal d f rels.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param start the lower bound of the range of v legal d f rels to return
	 * @param end the upper bound of the range of v legal d f rels to return (not inclusive)
	 * @param orderByComparator the comparator to order the results by
	 * @return the ordered range of v legal d f rels
	 * @throws SystemException if a system exception occurred
	 */
	public List<VLegalDFRel> findAll(int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		Object[] finderArgs = new Object[] {
				String.valueOf(start), String.valueOf(end),
				String.valueOf(orderByComparator)
			};

		List<VLegalDFRel> list = (List<VLegalDFRel>)FinderCacheUtil.getResult(FINDER_PATH_FIND_ALL,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_VLEGALDFREL);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_VLEGALDFREL.concat(VLegalDFRelModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (orderByComparator == null) {
					list = (List<VLegalDFRel>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);
				}
				else {
					list = (List<VLegalDFRel>)QueryUtil.list(q, getDialect(),
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
	 * Removes all the v legal d f rels where fieldId = &#63; from the database.
	 *
	 * @param fieldId the field id to search with
	 * @throws SystemException if a system exception occurred
	 */
	public void removeByField(String fieldId) throws SystemException {
		for (VLegalDFRel vLegalDFRel : findByField(fieldId)) {
			remove(vLegalDFRel);
		}
	}

	/**
	 * Removes all the v legal d f rels where docId = &#63; from the database.
	 *
	 * @param docId the doc id to search with
	 * @throws SystemException if a system exception occurred
	 */
	public void removeByDoc(String docId) throws SystemException {
		for (VLegalDFRel vLegalDFRel : findByDoc(docId)) {
			remove(vLegalDFRel);
		}
	}

	/**
	 * Removes all the v legal d f rels from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	public void removeAll() throws SystemException {
		for (VLegalDFRel vLegalDFRel : findAll()) {
			remove(vLegalDFRel);
		}
	}

	/**
	 * Counts all the v legal d f rels where fieldId = &#63;.
	 *
	 * @param fieldId the field id to search with
	 * @return the number of matching v legal d f rels
	 * @throws SystemException if a system exception occurred
	 */
	public int countByField(String fieldId) throws SystemException {
		Object[] finderArgs = new Object[] { fieldId };

		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_BY_FIELD,
				finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_VLEGALDFREL_WHERE);

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
	 * Counts all the v legal d f rels where docId = &#63;.
	 *
	 * @param docId the doc id to search with
	 * @return the number of matching v legal d f rels
	 * @throws SystemException if a system exception occurred
	 */
	public int countByDoc(String docId) throws SystemException {
		Object[] finderArgs = new Object[] { docId };

		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_BY_DOC,
				finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_VLEGALDFREL_WHERE);

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
	 * Counts all the v legal d f rels.
	 *
	 * @return the number of v legal d f rels
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

				Query q = session.createQuery(_SQL_COUNT_VLEGALDFREL);

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
	 * Initializes the v legal d f rel persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.com.vportal.portlet.vlegal.model.VLegalDFRel")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<VLegalDFRel>> listenersList = new ArrayList<ModelListener<VLegalDFRel>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<VLegalDFRel>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(VLegalDFRelImpl.class.getName());
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
	private static final String _SQL_SELECT_VLEGALDFREL = "SELECT vLegalDFRel FROM VLegalDFRel vLegalDFRel";
	private static final String _SQL_SELECT_VLEGALDFREL_WHERE = "SELECT vLegalDFRel FROM VLegalDFRel vLegalDFRel WHERE ";
	private static final String _SQL_COUNT_VLEGALDFREL = "SELECT COUNT(vLegalDFRel) FROM VLegalDFRel vLegalDFRel";
	private static final String _SQL_COUNT_VLEGALDFREL_WHERE = "SELECT COUNT(vLegalDFRel) FROM VLegalDFRel vLegalDFRel WHERE ";
	private static final String _FINDER_COLUMN_FIELD_FIELDID_1 = "vLegalDFRel.id.fieldId IS NULL";
	private static final String _FINDER_COLUMN_FIELD_FIELDID_2 = "vLegalDFRel.id.fieldId = ?";
	private static final String _FINDER_COLUMN_FIELD_FIELDID_3 = "(vLegalDFRel.id.fieldId IS NULL OR vLegalDFRel.id.fieldId = ?)";
	private static final String _FINDER_COLUMN_DOC_DOCID_1 = "vLegalDFRel.id.docId IS NULL";
	private static final String _FINDER_COLUMN_DOC_DOCID_2 = "vLegalDFRel.id.docId = ?";
	private static final String _FINDER_COLUMN_DOC_DOCID_3 = "(vLegalDFRel.id.docId IS NULL OR vLegalDFRel.id.docId = ?)";
	private static final String _ORDER_BY_ENTITY_ALIAS = "vLegalDFRel.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No VLegalDFRel exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No VLegalDFRel exists with the key {";
	private static Log _log = LogFactoryUtil.getLog(VLegalDFRelPersistenceImpl.class);
}