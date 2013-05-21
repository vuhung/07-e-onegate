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

import com.vportal.portlet.vlegal.NoSuchVLegalTDRelException;
import com.vportal.portlet.vlegal.model.VLegalTDRel;
import com.vportal.portlet.vlegal.model.impl.VLegalTDRelImpl;
import com.vportal.portlet.vlegal.model.impl.VLegalTDRelModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The persistence implementation for the v legal t d rel service.
 *
 * <p>
 * Never modify or reference this class directly. Always use {@link VLegalTDRelUtil} to access the v legal t d rel persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
 * </p>
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author ACB
 * @see VLegalTDRelPersistence
 * @see VLegalTDRelUtil
 * @generated
 */
public class VLegalTDRelPersistenceImpl extends BasePersistenceImpl<VLegalTDRel>
	implements VLegalTDRelPersistence {
	public static final String FINDER_CLASS_NAME_ENTITY = VLegalTDRelImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST = FINDER_CLASS_NAME_ENTITY +
		".List";
	public static final FinderPath FINDER_PATH_FIND_BY_DOCUMENT = new FinderPath(VLegalTDRelModelImpl.ENTITY_CACHE_ENABLED,
			VLegalTDRelModelImpl.FINDER_CACHE_ENABLED, FINDER_CLASS_NAME_LIST,
			"findByDocument",
			new String[] {
				String.class.getName(),
				
			"java.lang.Integer", "java.lang.Integer",
				"com.liferay.portal.kernel.util.OrderByComparator"
			});
	public static final FinderPath FINDER_PATH_COUNT_BY_DOCUMENT = new FinderPath(VLegalTDRelModelImpl.ENTITY_CACHE_ENABLED,
			VLegalTDRelModelImpl.FINDER_CACHE_ENABLED, FINDER_CLASS_NAME_LIST,
			"countByDocument", new String[] { String.class.getName() });
	public static final FinderPath FINDER_PATH_FIND_BY_TAG = new FinderPath(VLegalTDRelModelImpl.ENTITY_CACHE_ENABLED,
			VLegalTDRelModelImpl.FINDER_CACHE_ENABLED, FINDER_CLASS_NAME_LIST,
			"findByTag",
			new String[] {
				String.class.getName(),
				
			"java.lang.Integer", "java.lang.Integer",
				"com.liferay.portal.kernel.util.OrderByComparator"
			});
	public static final FinderPath FINDER_PATH_COUNT_BY_TAG = new FinderPath(VLegalTDRelModelImpl.ENTITY_CACHE_ENABLED,
			VLegalTDRelModelImpl.FINDER_CACHE_ENABLED, FINDER_CLASS_NAME_LIST,
			"countByTag", new String[] { String.class.getName() });
	public static final FinderPath FINDER_PATH_FIND_ALL = new FinderPath(VLegalTDRelModelImpl.ENTITY_CACHE_ENABLED,
			VLegalTDRelModelImpl.FINDER_CACHE_ENABLED, FINDER_CLASS_NAME_LIST,
			"findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(VLegalTDRelModelImpl.ENTITY_CACHE_ENABLED,
			VLegalTDRelModelImpl.FINDER_CACHE_ENABLED, FINDER_CLASS_NAME_LIST,
			"countAll", new String[0]);

	/**
	 * Caches the v legal t d rel in the entity cache if it is enabled.
	 *
	 * @param vLegalTDRel the v legal t d rel to cache
	 */
	public void cacheResult(VLegalTDRel vLegalTDRel) {
		EntityCacheUtil.putResult(VLegalTDRelModelImpl.ENTITY_CACHE_ENABLED,
			VLegalTDRelImpl.class, vLegalTDRel.getPrimaryKey(), vLegalTDRel);
	}

	/**
	 * Caches the v legal t d rels in the entity cache if it is enabled.
	 *
	 * @param vLegalTDRels the v legal t d rels to cache
	 */
	public void cacheResult(List<VLegalTDRel> vLegalTDRels) {
		for (VLegalTDRel vLegalTDRel : vLegalTDRels) {
			if (EntityCacheUtil.getResult(
						VLegalTDRelModelImpl.ENTITY_CACHE_ENABLED,
						VLegalTDRelImpl.class, vLegalTDRel.getPrimaryKey(), this) == null) {
				cacheResult(vLegalTDRel);
			}
		}
	}

	/**
	 * Clears the cache for all v legal t d rels.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	public void clearCache() {
		CacheRegistryUtil.clear(VLegalTDRelImpl.class.getName());
		EntityCacheUtil.clearCache(VLegalTDRelImpl.class.getName());
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST);
	}

	/**
	 * Clears the cache for the v legal t d rel.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	public void clearCache(VLegalTDRel vLegalTDRel) {
		EntityCacheUtil.removeResult(VLegalTDRelModelImpl.ENTITY_CACHE_ENABLED,
			VLegalTDRelImpl.class, vLegalTDRel.getPrimaryKey());
	}

	/**
	 * Creates a new v legal t d rel with the primary key. Does not add the v legal t d rel to the database.
	 *
	 * @param vLegalTDRelPK the primary key for the new v legal t d rel
	 * @return the new v legal t d rel
	 */
	public VLegalTDRel create(VLegalTDRelPK vLegalTDRelPK) {
		VLegalTDRel vLegalTDRel = new VLegalTDRelImpl();

		vLegalTDRel.setNew(true);
		vLegalTDRel.setPrimaryKey(vLegalTDRelPK);

		return vLegalTDRel;
	}

	/**
	 * Removes the v legal t d rel with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the v legal t d rel to remove
	 * @return the v legal t d rel that was removed
	 * @throws com.liferay.portal.NoSuchModelException if a v legal t d rel with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public VLegalTDRel remove(Serializable primaryKey)
		throws NoSuchModelException, SystemException {
		return remove((VLegalTDRelPK)primaryKey);
	}

	/**
	 * Removes the v legal t d rel with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param vLegalTDRelPK the primary key of the v legal t d rel to remove
	 * @return the v legal t d rel that was removed
	 * @throws com.vportal.portlet.vlegal.NoSuchVLegalTDRelException if a v legal t d rel with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public VLegalTDRel remove(VLegalTDRelPK vLegalTDRelPK)
		throws NoSuchVLegalTDRelException, SystemException {
		Session session = null;

		try {
			session = openSession();

			VLegalTDRel vLegalTDRel = (VLegalTDRel)session.get(VLegalTDRelImpl.class,
					vLegalTDRelPK);

			if (vLegalTDRel == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + vLegalTDRelPK);
				}

				throw new NoSuchVLegalTDRelException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					vLegalTDRelPK);
			}

			return remove(vLegalTDRel);
		}
		catch (NoSuchVLegalTDRelException nsee) {
			throw nsee;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected VLegalTDRel removeImpl(VLegalTDRel vLegalTDRel)
		throws SystemException {
		vLegalTDRel = toUnwrappedModel(vLegalTDRel);

		Session session = null;

		try {
			session = openSession();

			BatchSessionUtil.delete(session, vLegalTDRel);
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST);

		EntityCacheUtil.removeResult(VLegalTDRelModelImpl.ENTITY_CACHE_ENABLED,
			VLegalTDRelImpl.class, vLegalTDRel.getPrimaryKey());

		return vLegalTDRel;
	}

	public VLegalTDRel updateImpl(
		com.vportal.portlet.vlegal.model.VLegalTDRel vLegalTDRel, boolean merge)
		throws SystemException {
		vLegalTDRel = toUnwrappedModel(vLegalTDRel);

		Session session = null;

		try {
			session = openSession();

			BatchSessionUtil.update(session, vLegalTDRel, merge);

			vLegalTDRel.setNew(false);
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST);

		EntityCacheUtil.putResult(VLegalTDRelModelImpl.ENTITY_CACHE_ENABLED,
			VLegalTDRelImpl.class, vLegalTDRel.getPrimaryKey(), vLegalTDRel);

		return vLegalTDRel;
	}

	protected VLegalTDRel toUnwrappedModel(VLegalTDRel vLegalTDRel) {
		if (vLegalTDRel instanceof VLegalTDRelImpl) {
			return vLegalTDRel;
		}

		VLegalTDRelImpl vLegalTDRelImpl = new VLegalTDRelImpl();

		vLegalTDRelImpl.setNew(vLegalTDRel.isNew());
		vLegalTDRelImpl.setPrimaryKey(vLegalTDRel.getPrimaryKey());

		vLegalTDRelImpl.setDocId(vLegalTDRel.getDocId());
		vLegalTDRelImpl.setTagId(vLegalTDRel.getTagId());

		return vLegalTDRelImpl;
	}

	/**
	 * Finds the v legal t d rel with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the v legal t d rel to find
	 * @return the v legal t d rel
	 * @throws com.liferay.portal.NoSuchModelException if a v legal t d rel with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public VLegalTDRel findByPrimaryKey(Serializable primaryKey)
		throws NoSuchModelException, SystemException {
		return findByPrimaryKey((VLegalTDRelPK)primaryKey);
	}

	/**
	 * Finds the v legal t d rel with the primary key or throws a {@link com.vportal.portlet.vlegal.NoSuchVLegalTDRelException} if it could not be found.
	 *
	 * @param vLegalTDRelPK the primary key of the v legal t d rel to find
	 * @return the v legal t d rel
	 * @throws com.vportal.portlet.vlegal.NoSuchVLegalTDRelException if a v legal t d rel with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public VLegalTDRel findByPrimaryKey(VLegalTDRelPK vLegalTDRelPK)
		throws NoSuchVLegalTDRelException, SystemException {
		VLegalTDRel vLegalTDRel = fetchByPrimaryKey(vLegalTDRelPK);

		if (vLegalTDRel == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + vLegalTDRelPK);
			}

			throw new NoSuchVLegalTDRelException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				vLegalTDRelPK);
		}

		return vLegalTDRel;
	}

	/**
	 * Finds the v legal t d rel with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the v legal t d rel to find
	 * @return the v legal t d rel, or <code>null</code> if a v legal t d rel with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public VLegalTDRel fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		return fetchByPrimaryKey((VLegalTDRelPK)primaryKey);
	}

	/**
	 * Finds the v legal t d rel with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param vLegalTDRelPK the primary key of the v legal t d rel to find
	 * @return the v legal t d rel, or <code>null</code> if a v legal t d rel with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public VLegalTDRel fetchByPrimaryKey(VLegalTDRelPK vLegalTDRelPK)
		throws SystemException {
		VLegalTDRel vLegalTDRel = (VLegalTDRel)EntityCacheUtil.getResult(VLegalTDRelModelImpl.ENTITY_CACHE_ENABLED,
				VLegalTDRelImpl.class, vLegalTDRelPK, this);

		if (vLegalTDRel == null) {
			Session session = null;

			try {
				session = openSession();

				vLegalTDRel = (VLegalTDRel)session.get(VLegalTDRelImpl.class,
						vLegalTDRelPK);
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (vLegalTDRel != null) {
					cacheResult(vLegalTDRel);
				}

				closeSession(session);
			}
		}

		return vLegalTDRel;
	}

	/**
	 * Finds all the v legal t d rels where docId = &#63;.
	 *
	 * @param docId the doc id to search with
	 * @return the matching v legal t d rels
	 * @throws SystemException if a system exception occurred
	 */
	public List<VLegalTDRel> findByDocument(String docId)
		throws SystemException {
		return findByDocument(docId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Finds a range of all the v legal t d rels where docId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param docId the doc id to search with
	 * @param start the lower bound of the range of v legal t d rels to return
	 * @param end the upper bound of the range of v legal t d rels to return (not inclusive)
	 * @return the range of matching v legal t d rels
	 * @throws SystemException if a system exception occurred
	 */
	public List<VLegalTDRel> findByDocument(String docId, int start, int end)
		throws SystemException {
		return findByDocument(docId, start, end, null);
	}

	/**
	 * Finds an ordered range of all the v legal t d rels where docId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param docId the doc id to search with
	 * @param start the lower bound of the range of v legal t d rels to return
	 * @param end the upper bound of the range of v legal t d rels to return (not inclusive)
	 * @param orderByComparator the comparator to order the results by
	 * @return the ordered range of matching v legal t d rels
	 * @throws SystemException if a system exception occurred
	 */
	public List<VLegalTDRel> findByDocument(String docId, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		Object[] finderArgs = new Object[] {
				docId,
				
				String.valueOf(start), String.valueOf(end),
				String.valueOf(orderByComparator)
			};

		List<VLegalTDRel> list = (List<VLegalTDRel>)FinderCacheUtil.getResult(FINDER_PATH_FIND_BY_DOCUMENT,
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

			query.append(_SQL_SELECT_VLEGALTDREL_WHERE);

			if (docId == null) {
				query.append(_FINDER_COLUMN_DOCUMENT_DOCID_1);
			}
			else {
				if (docId.equals(StringPool.BLANK)) {
					query.append(_FINDER_COLUMN_DOCUMENT_DOCID_3);
				}
				else {
					query.append(_FINDER_COLUMN_DOCUMENT_DOCID_2);
				}
			}

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}

			else {
				query.append(VLegalTDRelModelImpl.ORDER_BY_JPQL);
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

				list = (List<VLegalTDRel>)QueryUtil.list(q, getDialect(),
						start, end);
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (list == null) {
					FinderCacheUtil.removeResult(FINDER_PATH_FIND_BY_DOCUMENT,
						finderArgs);
				}
				else {
					cacheResult(list);

					FinderCacheUtil.putResult(FINDER_PATH_FIND_BY_DOCUMENT,
						finderArgs, list);
				}

				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Finds the first v legal t d rel in the ordered set where docId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param docId the doc id to search with
	 * @param orderByComparator the comparator to order the set by
	 * @return the first matching v legal t d rel
	 * @throws com.vportal.portlet.vlegal.NoSuchVLegalTDRelException if a matching v legal t d rel could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public VLegalTDRel findByDocument_First(String docId,
		OrderByComparator orderByComparator)
		throws NoSuchVLegalTDRelException, SystemException {
		List<VLegalTDRel> list = findByDocument(docId, 0, 1, orderByComparator);

		if (list.isEmpty()) {
			StringBundler msg = new StringBundler(4);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("docId=");
			msg.append(docId);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			throw new NoSuchVLegalTDRelException(msg.toString());
		}
		else {
			return list.get(0);
		}
	}

	/**
	 * Finds the last v legal t d rel in the ordered set where docId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param docId the doc id to search with
	 * @param orderByComparator the comparator to order the set by
	 * @return the last matching v legal t d rel
	 * @throws com.vportal.portlet.vlegal.NoSuchVLegalTDRelException if a matching v legal t d rel could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public VLegalTDRel findByDocument_Last(String docId,
		OrderByComparator orderByComparator)
		throws NoSuchVLegalTDRelException, SystemException {
		int count = countByDocument(docId);

		List<VLegalTDRel> list = findByDocument(docId, count - 1, count,
				orderByComparator);

		if (list.isEmpty()) {
			StringBundler msg = new StringBundler(4);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("docId=");
			msg.append(docId);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			throw new NoSuchVLegalTDRelException(msg.toString());
		}
		else {
			return list.get(0);
		}
	}

	/**
	 * Finds the v legal t d rels before and after the current v legal t d rel in the ordered set where docId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param vLegalTDRelPK the primary key of the current v legal t d rel
	 * @param docId the doc id to search with
	 * @param orderByComparator the comparator to order the set by
	 * @return the previous, current, and next v legal t d rel
	 * @throws com.vportal.portlet.vlegal.NoSuchVLegalTDRelException if a v legal t d rel with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public VLegalTDRel[] findByDocument_PrevAndNext(
		VLegalTDRelPK vLegalTDRelPK, String docId,
		OrderByComparator orderByComparator)
		throws NoSuchVLegalTDRelException, SystemException {
		VLegalTDRel vLegalTDRel = findByPrimaryKey(vLegalTDRelPK);

		Session session = null;

		try {
			session = openSession();

			VLegalTDRel[] array = new VLegalTDRelImpl[3];

			array[0] = getByDocument_PrevAndNext(session, vLegalTDRel, docId,
					orderByComparator, true);

			array[1] = vLegalTDRel;

			array[2] = getByDocument_PrevAndNext(session, vLegalTDRel, docId,
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

	protected VLegalTDRel getByDocument_PrevAndNext(Session session,
		VLegalTDRel vLegalTDRel, String docId,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_VLEGALTDREL_WHERE);

		if (docId == null) {
			query.append(_FINDER_COLUMN_DOCUMENT_DOCID_1);
		}
		else {
			if (docId.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_DOCUMENT_DOCID_3);
			}
			else {
				query.append(_FINDER_COLUMN_DOCUMENT_DOCID_2);
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
			query.append(VLegalTDRelModelImpl.ORDER_BY_JPQL);
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
			Object[] values = orderByComparator.getOrderByValues(vLegalTDRel);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<VLegalTDRel> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Finds all the v legal t d rels where tagId = &#63;.
	 *
	 * @param tagId the tag id to search with
	 * @return the matching v legal t d rels
	 * @throws SystemException if a system exception occurred
	 */
	public List<VLegalTDRel> findByTag(String tagId) throws SystemException {
		return findByTag(tagId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Finds a range of all the v legal t d rels where tagId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param tagId the tag id to search with
	 * @param start the lower bound of the range of v legal t d rels to return
	 * @param end the upper bound of the range of v legal t d rels to return (not inclusive)
	 * @return the range of matching v legal t d rels
	 * @throws SystemException if a system exception occurred
	 */
	public List<VLegalTDRel> findByTag(String tagId, int start, int end)
		throws SystemException {
		return findByTag(tagId, start, end, null);
	}

	/**
	 * Finds an ordered range of all the v legal t d rels where tagId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param tagId the tag id to search with
	 * @param start the lower bound of the range of v legal t d rels to return
	 * @param end the upper bound of the range of v legal t d rels to return (not inclusive)
	 * @param orderByComparator the comparator to order the results by
	 * @return the ordered range of matching v legal t d rels
	 * @throws SystemException if a system exception occurred
	 */
	public List<VLegalTDRel> findByTag(String tagId, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		Object[] finderArgs = new Object[] {
				tagId,
				
				String.valueOf(start), String.valueOf(end),
				String.valueOf(orderByComparator)
			};

		List<VLegalTDRel> list = (List<VLegalTDRel>)FinderCacheUtil.getResult(FINDER_PATH_FIND_BY_TAG,
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

			query.append(_SQL_SELECT_VLEGALTDREL_WHERE);

			if (tagId == null) {
				query.append(_FINDER_COLUMN_TAG_TAGID_1);
			}
			else {
				if (tagId.equals(StringPool.BLANK)) {
					query.append(_FINDER_COLUMN_TAG_TAGID_3);
				}
				else {
					query.append(_FINDER_COLUMN_TAG_TAGID_2);
				}
			}

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}

			else {
				query.append(VLegalTDRelModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (tagId != null) {
					qPos.add(tagId);
				}

				list = (List<VLegalTDRel>)QueryUtil.list(q, getDialect(),
						start, end);
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (list == null) {
					FinderCacheUtil.removeResult(FINDER_PATH_FIND_BY_TAG,
						finderArgs);
				}
				else {
					cacheResult(list);

					FinderCacheUtil.putResult(FINDER_PATH_FIND_BY_TAG,
						finderArgs, list);
				}

				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Finds the first v legal t d rel in the ordered set where tagId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param tagId the tag id to search with
	 * @param orderByComparator the comparator to order the set by
	 * @return the first matching v legal t d rel
	 * @throws com.vportal.portlet.vlegal.NoSuchVLegalTDRelException if a matching v legal t d rel could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public VLegalTDRel findByTag_First(String tagId,
		OrderByComparator orderByComparator)
		throws NoSuchVLegalTDRelException, SystemException {
		List<VLegalTDRel> list = findByTag(tagId, 0, 1, orderByComparator);

		if (list.isEmpty()) {
			StringBundler msg = new StringBundler(4);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("tagId=");
			msg.append(tagId);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			throw new NoSuchVLegalTDRelException(msg.toString());
		}
		else {
			return list.get(0);
		}
	}

	/**
	 * Finds the last v legal t d rel in the ordered set where tagId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param tagId the tag id to search with
	 * @param orderByComparator the comparator to order the set by
	 * @return the last matching v legal t d rel
	 * @throws com.vportal.portlet.vlegal.NoSuchVLegalTDRelException if a matching v legal t d rel could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public VLegalTDRel findByTag_Last(String tagId,
		OrderByComparator orderByComparator)
		throws NoSuchVLegalTDRelException, SystemException {
		int count = countByTag(tagId);

		List<VLegalTDRel> list = findByTag(tagId, count - 1, count,
				orderByComparator);

		if (list.isEmpty()) {
			StringBundler msg = new StringBundler(4);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("tagId=");
			msg.append(tagId);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			throw new NoSuchVLegalTDRelException(msg.toString());
		}
		else {
			return list.get(0);
		}
	}

	/**
	 * Finds the v legal t d rels before and after the current v legal t d rel in the ordered set where tagId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param vLegalTDRelPK the primary key of the current v legal t d rel
	 * @param tagId the tag id to search with
	 * @param orderByComparator the comparator to order the set by
	 * @return the previous, current, and next v legal t d rel
	 * @throws com.vportal.portlet.vlegal.NoSuchVLegalTDRelException if a v legal t d rel with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public VLegalTDRel[] findByTag_PrevAndNext(VLegalTDRelPK vLegalTDRelPK,
		String tagId, OrderByComparator orderByComparator)
		throws NoSuchVLegalTDRelException, SystemException {
		VLegalTDRel vLegalTDRel = findByPrimaryKey(vLegalTDRelPK);

		Session session = null;

		try {
			session = openSession();

			VLegalTDRel[] array = new VLegalTDRelImpl[3];

			array[0] = getByTag_PrevAndNext(session, vLegalTDRel, tagId,
					orderByComparator, true);

			array[1] = vLegalTDRel;

			array[2] = getByTag_PrevAndNext(session, vLegalTDRel, tagId,
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

	protected VLegalTDRel getByTag_PrevAndNext(Session session,
		VLegalTDRel vLegalTDRel, String tagId,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_VLEGALTDREL_WHERE);

		if (tagId == null) {
			query.append(_FINDER_COLUMN_TAG_TAGID_1);
		}
		else {
			if (tagId.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_TAG_TAGID_3);
			}
			else {
				query.append(_FINDER_COLUMN_TAG_TAGID_2);
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
			query.append(VLegalTDRelModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		if (tagId != null) {
			qPos.add(tagId);
		}

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByValues(vLegalTDRel);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<VLegalTDRel> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Finds all the v legal t d rels.
	 *
	 * @return the v legal t d rels
	 * @throws SystemException if a system exception occurred
	 */
	public List<VLegalTDRel> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Finds a range of all the v legal t d rels.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param start the lower bound of the range of v legal t d rels to return
	 * @param end the upper bound of the range of v legal t d rels to return (not inclusive)
	 * @return the range of v legal t d rels
	 * @throws SystemException if a system exception occurred
	 */
	public List<VLegalTDRel> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Finds an ordered range of all the v legal t d rels.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param start the lower bound of the range of v legal t d rels to return
	 * @param end the upper bound of the range of v legal t d rels to return (not inclusive)
	 * @param orderByComparator the comparator to order the results by
	 * @return the ordered range of v legal t d rels
	 * @throws SystemException if a system exception occurred
	 */
	public List<VLegalTDRel> findAll(int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		Object[] finderArgs = new Object[] {
				String.valueOf(start), String.valueOf(end),
				String.valueOf(orderByComparator)
			};

		List<VLegalTDRel> list = (List<VLegalTDRel>)FinderCacheUtil.getResult(FINDER_PATH_FIND_ALL,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_VLEGALTDREL);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_VLEGALTDREL.concat(VLegalTDRelModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (orderByComparator == null) {
					list = (List<VLegalTDRel>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);
				}
				else {
					list = (List<VLegalTDRel>)QueryUtil.list(q, getDialect(),
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
	 * Removes all the v legal t d rels where docId = &#63; from the database.
	 *
	 * @param docId the doc id to search with
	 * @throws SystemException if a system exception occurred
	 */
	public void removeByDocument(String docId) throws SystemException {
		for (VLegalTDRel vLegalTDRel : findByDocument(docId)) {
			remove(vLegalTDRel);
		}
	}

	/**
	 * Removes all the v legal t d rels where tagId = &#63; from the database.
	 *
	 * @param tagId the tag id to search with
	 * @throws SystemException if a system exception occurred
	 */
	public void removeByTag(String tagId) throws SystemException {
		for (VLegalTDRel vLegalTDRel : findByTag(tagId)) {
			remove(vLegalTDRel);
		}
	}

	/**
	 * Removes all the v legal t d rels from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	public void removeAll() throws SystemException {
		for (VLegalTDRel vLegalTDRel : findAll()) {
			remove(vLegalTDRel);
		}
	}

	/**
	 * Counts all the v legal t d rels where docId = &#63;.
	 *
	 * @param docId the doc id to search with
	 * @return the number of matching v legal t d rels
	 * @throws SystemException if a system exception occurred
	 */
	public int countByDocument(String docId) throws SystemException {
		Object[] finderArgs = new Object[] { docId };

		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_BY_DOCUMENT,
				finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_VLEGALTDREL_WHERE);

			if (docId == null) {
				query.append(_FINDER_COLUMN_DOCUMENT_DOCID_1);
			}
			else {
				if (docId.equals(StringPool.BLANK)) {
					query.append(_FINDER_COLUMN_DOCUMENT_DOCID_3);
				}
				else {
					query.append(_FINDER_COLUMN_DOCUMENT_DOCID_2);
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

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_DOCUMENT,
					finderArgs, count);

				closeSession(session);
			}
		}

		return count.intValue();
	}

	/**
	 * Counts all the v legal t d rels where tagId = &#63;.
	 *
	 * @param tagId the tag id to search with
	 * @return the number of matching v legal t d rels
	 * @throws SystemException if a system exception occurred
	 */
	public int countByTag(String tagId) throws SystemException {
		Object[] finderArgs = new Object[] { tagId };

		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_BY_TAG,
				finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_VLEGALTDREL_WHERE);

			if (tagId == null) {
				query.append(_FINDER_COLUMN_TAG_TAGID_1);
			}
			else {
				if (tagId.equals(StringPool.BLANK)) {
					query.append(_FINDER_COLUMN_TAG_TAGID_3);
				}
				else {
					query.append(_FINDER_COLUMN_TAG_TAGID_2);
				}
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (tagId != null) {
					qPos.add(tagId);
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

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_TAG, finderArgs,
					count);

				closeSession(session);
			}
		}

		return count.intValue();
	}

	/**
	 * Counts all the v legal t d rels.
	 *
	 * @return the number of v legal t d rels
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

				Query q = session.createQuery(_SQL_COUNT_VLEGALTDREL);

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
	 * Initializes the v legal t d rel persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.com.vportal.portlet.vlegal.model.VLegalTDRel")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<VLegalTDRel>> listenersList = new ArrayList<ModelListener<VLegalTDRel>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<VLegalTDRel>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(VLegalTDRelImpl.class.getName());
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
	private static final String _SQL_SELECT_VLEGALTDREL = "SELECT vLegalTDRel FROM VLegalTDRel vLegalTDRel";
	private static final String _SQL_SELECT_VLEGALTDREL_WHERE = "SELECT vLegalTDRel FROM VLegalTDRel vLegalTDRel WHERE ";
	private static final String _SQL_COUNT_VLEGALTDREL = "SELECT COUNT(vLegalTDRel) FROM VLegalTDRel vLegalTDRel";
	private static final String _SQL_COUNT_VLEGALTDREL_WHERE = "SELECT COUNT(vLegalTDRel) FROM VLegalTDRel vLegalTDRel WHERE ";
	private static final String _FINDER_COLUMN_DOCUMENT_DOCID_1 = "vLegalTDRel.id.docId IS NULL";
	private static final String _FINDER_COLUMN_DOCUMENT_DOCID_2 = "vLegalTDRel.id.docId = ?";
	private static final String _FINDER_COLUMN_DOCUMENT_DOCID_3 = "(vLegalTDRel.id.docId IS NULL OR vLegalTDRel.id.docId = ?)";
	private static final String _FINDER_COLUMN_TAG_TAGID_1 = "vLegalTDRel.id.tagId IS NULL";
	private static final String _FINDER_COLUMN_TAG_TAGID_2 = "vLegalTDRel.id.tagId = ?";
	private static final String _FINDER_COLUMN_TAG_TAGID_3 = "(vLegalTDRel.id.tagId IS NULL OR vLegalTDRel.id.tagId = ?)";
	private static final String _ORDER_BY_ENTITY_ALIAS = "vLegalTDRel.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No VLegalTDRel exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No VLegalTDRel exists with the key {";
	private static Log _log = LogFactoryUtil.getLog(VLegalTDRelPersistenceImpl.class);
}