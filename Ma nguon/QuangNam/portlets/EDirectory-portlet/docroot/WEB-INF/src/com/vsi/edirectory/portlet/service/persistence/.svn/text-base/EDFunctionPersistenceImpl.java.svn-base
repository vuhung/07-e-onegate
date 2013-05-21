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

package com.vsi.edirectory.portlet.service.persistence;

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

import com.vsi.edirectory.portlet.NoSuchEDFunctionException;
import com.vsi.edirectory.portlet.model.EDFunction;
import com.vsi.edirectory.portlet.model.impl.EDFunctionImpl;
import com.vsi.edirectory.portlet.model.impl.EDFunctionModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The persistence implementation for the e d function service.
 *
 * <p>
 * Never modify or reference this class directly. Always use {@link EDFunctionUtil} to access the e d function persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
 * </p>
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author vinhnt
 * @see EDFunctionPersistence
 * @see EDFunctionUtil
 * @generated
 */
public class EDFunctionPersistenceImpl extends BasePersistenceImpl<EDFunction>
	implements EDFunctionPersistence {
	public static final String FINDER_CLASS_NAME_ENTITY = EDFunctionImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST = FINDER_CLASS_NAME_ENTITY +
		".List";
	public static final FinderPath FINDER_PATH_FIND_BY_ISSHOWED = new FinderPath(EDFunctionModelImpl.ENTITY_CACHE_ENABLED,
			EDFunctionModelImpl.FINDER_CACHE_ENABLED, FINDER_CLASS_NAME_LIST,
			"findByIsShowed",
			new String[] {
				Boolean.class.getName(),
				
			"java.lang.Integer", "java.lang.Integer",
				"com.liferay.portal.kernel.util.OrderByComparator"
			});
	public static final FinderPath FINDER_PATH_COUNT_BY_ISSHOWED = new FinderPath(EDFunctionModelImpl.ENTITY_CACHE_ENABLED,
			EDFunctionModelImpl.FINDER_CACHE_ENABLED, FINDER_CLASS_NAME_LIST,
			"countByIsShowed", new String[] { Boolean.class.getName() });
	public static final FinderPath FINDER_PATH_FIND_BY_G_L = new FinderPath(EDFunctionModelImpl.ENTITY_CACHE_ENABLED,
			EDFunctionModelImpl.FINDER_CACHE_ENABLED, FINDER_CLASS_NAME_LIST,
			"findByG_L",
			new String[] {
				Long.class.getName(), String.class.getName(),
				
			"java.lang.Integer", "java.lang.Integer",
				"com.liferay.portal.kernel.util.OrderByComparator"
			});
	public static final FinderPath FINDER_PATH_COUNT_BY_G_L = new FinderPath(EDFunctionModelImpl.ENTITY_CACHE_ENABLED,
			EDFunctionModelImpl.FINDER_CACHE_ENABLED, FINDER_CLASS_NAME_LIST,
			"countByG_L",
			new String[] { Long.class.getName(), String.class.getName() });
	public static final FinderPath FINDER_PATH_FETCH_BY_F_G = new FinderPath(EDFunctionModelImpl.ENTITY_CACHE_ENABLED,
			EDFunctionModelImpl.FINDER_CACHE_ENABLED, FINDER_CLASS_NAME_ENTITY,
			"fetchByF_G",
			new String[] { Long.class.getName(), Long.class.getName() });
	public static final FinderPath FINDER_PATH_COUNT_BY_F_G = new FinderPath(EDFunctionModelImpl.ENTITY_CACHE_ENABLED,
			EDFunctionModelImpl.FINDER_CACHE_ENABLED, FINDER_CLASS_NAME_LIST,
			"countByF_G",
			new String[] { Long.class.getName(), Long.class.getName() });
	public static final FinderPath FINDER_PATH_FIND_ALL = new FinderPath(EDFunctionModelImpl.ENTITY_CACHE_ENABLED,
			EDFunctionModelImpl.FINDER_CACHE_ENABLED, FINDER_CLASS_NAME_LIST,
			"findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(EDFunctionModelImpl.ENTITY_CACHE_ENABLED,
			EDFunctionModelImpl.FINDER_CACHE_ENABLED, FINDER_CLASS_NAME_LIST,
			"countAll", new String[0]);

	/**
	 * Caches the e d function in the entity cache if it is enabled.
	 *
	 * @param edFunction the e d function to cache
	 */
	public void cacheResult(EDFunction edFunction) {
		EntityCacheUtil.putResult(EDFunctionModelImpl.ENTITY_CACHE_ENABLED,
			EDFunctionImpl.class, edFunction.getPrimaryKey(), edFunction);

		FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_F_G,
			new Object[] {
				new Long(edFunction.getId()), new Long(edFunction.getGroupId())
			}, edFunction);
	}

	/**
	 * Caches the e d functions in the entity cache if it is enabled.
	 *
	 * @param edFunctions the e d functions to cache
	 */
	public void cacheResult(List<EDFunction> edFunctions) {
		for (EDFunction edFunction : edFunctions) {
			if (EntityCacheUtil.getResult(
						EDFunctionModelImpl.ENTITY_CACHE_ENABLED,
						EDFunctionImpl.class, edFunction.getPrimaryKey(), this) == null) {
				cacheResult(edFunction);
			}
		}
	}

	/**
	 * Clears the cache for all e d functions.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	public void clearCache() {
		CacheRegistryUtil.clear(EDFunctionImpl.class.getName());
		EntityCacheUtil.clearCache(EDFunctionImpl.class.getName());
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST);
	}

	/**
	 * Clears the cache for the e d function.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	public void clearCache(EDFunction edFunction) {
		EntityCacheUtil.removeResult(EDFunctionModelImpl.ENTITY_CACHE_ENABLED,
			EDFunctionImpl.class, edFunction.getPrimaryKey());

		FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_F_G,
			new Object[] {
				new Long(edFunction.getId()), new Long(edFunction.getGroupId())
			});
	}

	/**
	 * Creates a new e d function with the primary key. Does not add the e d function to the database.
	 *
	 * @param id the primary key for the new e d function
	 * @return the new e d function
	 */
	public EDFunction create(long id) {
		EDFunction edFunction = new EDFunctionImpl();

		edFunction.setNew(true);
		edFunction.setPrimaryKey(id);

		return edFunction;
	}

	/**
	 * Removes the e d function with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the e d function to remove
	 * @return the e d function that was removed
	 * @throws com.liferay.portal.NoSuchModelException if a e d function with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public EDFunction remove(Serializable primaryKey)
		throws NoSuchModelException, SystemException {
		return remove(((Long)primaryKey).longValue());
	}

	/**
	 * Removes the e d function with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the e d function to remove
	 * @return the e d function that was removed
	 * @throws com.vsi.edirectory.portlet.NoSuchEDFunctionException if a e d function with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public EDFunction remove(long id)
		throws NoSuchEDFunctionException, SystemException {
		Session session = null;

		try {
			session = openSession();

			EDFunction edFunction = (EDFunction)session.get(EDFunctionImpl.class,
					new Long(id));

			if (edFunction == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + id);
				}

				throw new NoSuchEDFunctionException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					id);
			}

			return remove(edFunction);
		}
		catch (NoSuchEDFunctionException nsee) {
			throw nsee;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected EDFunction removeImpl(EDFunction edFunction)
		throws SystemException {
		edFunction = toUnwrappedModel(edFunction);

		Session session = null;

		try {
			session = openSession();

			BatchSessionUtil.delete(session, edFunction);
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST);

		EDFunctionModelImpl edFunctionModelImpl = (EDFunctionModelImpl)edFunction;

		FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_F_G,
			new Object[] {
				new Long(edFunctionModelImpl.getId()),
				new Long(edFunctionModelImpl.getGroupId())
			});

		EntityCacheUtil.removeResult(EDFunctionModelImpl.ENTITY_CACHE_ENABLED,
			EDFunctionImpl.class, edFunction.getPrimaryKey());

		return edFunction;
	}

	public EDFunction updateImpl(
		com.vsi.edirectory.portlet.model.EDFunction edFunction, boolean merge)
		throws SystemException {
		edFunction = toUnwrappedModel(edFunction);

		boolean isNew = edFunction.isNew();

		EDFunctionModelImpl edFunctionModelImpl = (EDFunctionModelImpl)edFunction;

		Session session = null;

		try {
			session = openSession();

			BatchSessionUtil.update(session, edFunction, merge);

			edFunction.setNew(false);
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST);

		EntityCacheUtil.putResult(EDFunctionModelImpl.ENTITY_CACHE_ENABLED,
			EDFunctionImpl.class, edFunction.getPrimaryKey(), edFunction);

		if (!isNew &&
				((edFunction.getId() != edFunctionModelImpl.getOriginalId()) ||
				(edFunction.getGroupId() != edFunctionModelImpl.getOriginalGroupId()))) {
			FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_F_G,
				new Object[] {
					new Long(edFunctionModelImpl.getOriginalId()),
					new Long(edFunctionModelImpl.getOriginalGroupId())
				});
		}

		if (isNew ||
				((edFunction.getId() != edFunctionModelImpl.getOriginalId()) ||
				(edFunction.getGroupId() != edFunctionModelImpl.getOriginalGroupId()))) {
			FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_F_G,
				new Object[] {
					new Long(edFunction.getId()),
					new Long(edFunction.getGroupId())
				}, edFunction);
		}

		return edFunction;
	}

	protected EDFunction toUnwrappedModel(EDFunction edFunction) {
		if (edFunction instanceof EDFunctionImpl) {
			return edFunction;
		}

		EDFunctionImpl edFunctionImpl = new EDFunctionImpl();

		edFunctionImpl.setNew(edFunction.isNew());
		edFunctionImpl.setPrimaryKey(edFunction.getPrimaryKey());

		edFunctionImpl.setId(edFunction.getId());
		edFunctionImpl.setCreatedDate(edFunction.getCreatedDate());
		edFunctionImpl.setName(edFunction.getName());
		edFunctionImpl.setLevelEd(edFunction.getLevelEd());
		edFunctionImpl.setIsShowTree(edFunction.isIsShowTree());
		edFunctionImpl.setDescription(edFunction.getDescription());
		edFunctionImpl.setGroupId(edFunction.getGroupId());
		edFunctionImpl.setUserId(edFunction.getUserId());
		edFunctionImpl.setCompanyId(edFunction.getCompanyId());
		edFunctionImpl.setLanguageId(edFunction.getLanguageId());

		return edFunctionImpl;
	}

	/**
	 * Finds the e d function with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the e d function to find
	 * @return the e d function
	 * @throws com.liferay.portal.NoSuchModelException if a e d function with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public EDFunction findByPrimaryKey(Serializable primaryKey)
		throws NoSuchModelException, SystemException {
		return findByPrimaryKey(((Long)primaryKey).longValue());
	}

	/**
	 * Finds the e d function with the primary key or throws a {@link com.vsi.edirectory.portlet.NoSuchEDFunctionException} if it could not be found.
	 *
	 * @param id the primary key of the e d function to find
	 * @return the e d function
	 * @throws com.vsi.edirectory.portlet.NoSuchEDFunctionException if a e d function with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public EDFunction findByPrimaryKey(long id)
		throws NoSuchEDFunctionException, SystemException {
		EDFunction edFunction = fetchByPrimaryKey(id);

		if (edFunction == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + id);
			}

			throw new NoSuchEDFunctionException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				id);
		}

		return edFunction;
	}

	/**
	 * Finds the e d function with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the e d function to find
	 * @return the e d function, or <code>null</code> if a e d function with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public EDFunction fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		return fetchByPrimaryKey(((Long)primaryKey).longValue());
	}

	/**
	 * Finds the e d function with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the e d function to find
	 * @return the e d function, or <code>null</code> if a e d function with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public EDFunction fetchByPrimaryKey(long id) throws SystemException {
		EDFunction edFunction = (EDFunction)EntityCacheUtil.getResult(EDFunctionModelImpl.ENTITY_CACHE_ENABLED,
				EDFunctionImpl.class, id, this);

		if (edFunction == null) {
			Session session = null;

			try {
				session = openSession();

				edFunction = (EDFunction)session.get(EDFunctionImpl.class,
						new Long(id));
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (edFunction != null) {
					cacheResult(edFunction);
				}

				closeSession(session);
			}
		}

		return edFunction;
	}

	/**
	 * Finds all the e d functions where isShowTree = &#63;.
	 *
	 * @param isShowTree the is show tree to search with
	 * @return the matching e d functions
	 * @throws SystemException if a system exception occurred
	 */
	public List<EDFunction> findByIsShowed(boolean isShowTree)
		throws SystemException {
		return findByIsShowed(isShowTree, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
			null);
	}

	/**
	 * Finds a range of all the e d functions where isShowTree = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param isShowTree the is show tree to search with
	 * @param start the lower bound of the range of e d functions to return
	 * @param end the upper bound of the range of e d functions to return (not inclusive)
	 * @return the range of matching e d functions
	 * @throws SystemException if a system exception occurred
	 */
	public List<EDFunction> findByIsShowed(boolean isShowTree, int start,
		int end) throws SystemException {
		return findByIsShowed(isShowTree, start, end, null);
	}

	/**
	 * Finds an ordered range of all the e d functions where isShowTree = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param isShowTree the is show tree to search with
	 * @param start the lower bound of the range of e d functions to return
	 * @param end the upper bound of the range of e d functions to return (not inclusive)
	 * @param orderByComparator the comparator to order the results by
	 * @return the ordered range of matching e d functions
	 * @throws SystemException if a system exception occurred
	 */
	public List<EDFunction> findByIsShowed(boolean isShowTree, int start,
		int end, OrderByComparator orderByComparator) throws SystemException {
		Object[] finderArgs = new Object[] {
				isShowTree,
				
				String.valueOf(start), String.valueOf(end),
				String.valueOf(orderByComparator)
			};

		List<EDFunction> list = (List<EDFunction>)FinderCacheUtil.getResult(FINDER_PATH_FIND_BY_ISSHOWED,
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

			query.append(_SQL_SELECT_EDFUNCTION_WHERE);

			query.append(_FINDER_COLUMN_ISSHOWED_ISSHOWTREE_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}

			else {
				query.append(EDFunctionModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(isShowTree);

				list = (List<EDFunction>)QueryUtil.list(q, getDialect(), start,
						end);
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (list == null) {
					FinderCacheUtil.removeResult(FINDER_PATH_FIND_BY_ISSHOWED,
						finderArgs);
				}
				else {
					cacheResult(list);

					FinderCacheUtil.putResult(FINDER_PATH_FIND_BY_ISSHOWED,
						finderArgs, list);
				}

				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Finds the first e d function in the ordered set where isShowTree = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param isShowTree the is show tree to search with
	 * @param orderByComparator the comparator to order the set by
	 * @return the first matching e d function
	 * @throws com.vsi.edirectory.portlet.NoSuchEDFunctionException if a matching e d function could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public EDFunction findByIsShowed_First(boolean isShowTree,
		OrderByComparator orderByComparator)
		throws NoSuchEDFunctionException, SystemException {
		List<EDFunction> list = findByIsShowed(isShowTree, 0, 1,
				orderByComparator);

		if (list.isEmpty()) {
			StringBundler msg = new StringBundler(4);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("isShowTree=");
			msg.append(isShowTree);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			throw new NoSuchEDFunctionException(msg.toString());
		}
		else {
			return list.get(0);
		}
	}

	/**
	 * Finds the last e d function in the ordered set where isShowTree = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param isShowTree the is show tree to search with
	 * @param orderByComparator the comparator to order the set by
	 * @return the last matching e d function
	 * @throws com.vsi.edirectory.portlet.NoSuchEDFunctionException if a matching e d function could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public EDFunction findByIsShowed_Last(boolean isShowTree,
		OrderByComparator orderByComparator)
		throws NoSuchEDFunctionException, SystemException {
		int count = countByIsShowed(isShowTree);

		List<EDFunction> list = findByIsShowed(isShowTree, count - 1, count,
				orderByComparator);

		if (list.isEmpty()) {
			StringBundler msg = new StringBundler(4);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("isShowTree=");
			msg.append(isShowTree);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			throw new NoSuchEDFunctionException(msg.toString());
		}
		else {
			return list.get(0);
		}
	}

	/**
	 * Finds the e d functions before and after the current e d function in the ordered set where isShowTree = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param id the primary key of the current e d function
	 * @param isShowTree the is show tree to search with
	 * @param orderByComparator the comparator to order the set by
	 * @return the previous, current, and next e d function
	 * @throws com.vsi.edirectory.portlet.NoSuchEDFunctionException if a e d function with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public EDFunction[] findByIsShowed_PrevAndNext(long id, boolean isShowTree,
		OrderByComparator orderByComparator)
		throws NoSuchEDFunctionException, SystemException {
		EDFunction edFunction = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			EDFunction[] array = new EDFunctionImpl[3];

			array[0] = getByIsShowed_PrevAndNext(session, edFunction,
					isShowTree, orderByComparator, true);

			array[1] = edFunction;

			array[2] = getByIsShowed_PrevAndNext(session, edFunction,
					isShowTree, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected EDFunction getByIsShowed_PrevAndNext(Session session,
		EDFunction edFunction, boolean isShowTree,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_EDFUNCTION_WHERE);

		query.append(_FINDER_COLUMN_ISSHOWED_ISSHOWTREE_2);

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
			query.append(EDFunctionModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(isShowTree);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByValues(edFunction);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<EDFunction> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Finds all the e d functions where groupId = &#63; and languageId = &#63;.
	 *
	 * @param groupId the group id to search with
	 * @param languageId the language id to search with
	 * @return the matching e d functions
	 * @throws SystemException if a system exception occurred
	 */
	public List<EDFunction> findByG_L(long groupId, String languageId)
		throws SystemException {
		return findByG_L(groupId, languageId, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Finds a range of all the e d functions where groupId = &#63; and languageId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param groupId the group id to search with
	 * @param languageId the language id to search with
	 * @param start the lower bound of the range of e d functions to return
	 * @param end the upper bound of the range of e d functions to return (not inclusive)
	 * @return the range of matching e d functions
	 * @throws SystemException if a system exception occurred
	 */
	public List<EDFunction> findByG_L(long groupId, String languageId,
		int start, int end) throws SystemException {
		return findByG_L(groupId, languageId, start, end, null);
	}

	/**
	 * Finds an ordered range of all the e d functions where groupId = &#63; and languageId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param groupId the group id to search with
	 * @param languageId the language id to search with
	 * @param start the lower bound of the range of e d functions to return
	 * @param end the upper bound of the range of e d functions to return (not inclusive)
	 * @param orderByComparator the comparator to order the results by
	 * @return the ordered range of matching e d functions
	 * @throws SystemException if a system exception occurred
	 */
	public List<EDFunction> findByG_L(long groupId, String languageId,
		int start, int end, OrderByComparator orderByComparator)
		throws SystemException {
		Object[] finderArgs = new Object[] {
				groupId, languageId,
				
				String.valueOf(start), String.valueOf(end),
				String.valueOf(orderByComparator)
			};

		List<EDFunction> list = (List<EDFunction>)FinderCacheUtil.getResult(FINDER_PATH_FIND_BY_G_L,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;

			if (orderByComparator != null) {
				query = new StringBundler(4 +
						(orderByComparator.getOrderByFields().length * 3));
			}
			else {
				query = new StringBundler(4);
			}

			query.append(_SQL_SELECT_EDFUNCTION_WHERE);

			query.append(_FINDER_COLUMN_G_L_GROUPID_2);

			if (languageId == null) {
				query.append(_FINDER_COLUMN_G_L_LANGUAGEID_1);
			}
			else {
				if (languageId.equals(StringPool.BLANK)) {
					query.append(_FINDER_COLUMN_G_L_LANGUAGEID_3);
				}
				else {
					query.append(_FINDER_COLUMN_G_L_LANGUAGEID_2);
				}
			}

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}

			else {
				query.append(EDFunctionModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(groupId);

				if (languageId != null) {
					qPos.add(languageId);
				}

				list = (List<EDFunction>)QueryUtil.list(q, getDialect(), start,
						end);
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (list == null) {
					FinderCacheUtil.removeResult(FINDER_PATH_FIND_BY_G_L,
						finderArgs);
				}
				else {
					cacheResult(list);

					FinderCacheUtil.putResult(FINDER_PATH_FIND_BY_G_L,
						finderArgs, list);
				}

				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Finds the first e d function in the ordered set where groupId = &#63; and languageId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param groupId the group id to search with
	 * @param languageId the language id to search with
	 * @param orderByComparator the comparator to order the set by
	 * @return the first matching e d function
	 * @throws com.vsi.edirectory.portlet.NoSuchEDFunctionException if a matching e d function could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public EDFunction findByG_L_First(long groupId, String languageId,
		OrderByComparator orderByComparator)
		throws NoSuchEDFunctionException, SystemException {
		List<EDFunction> list = findByG_L(groupId, languageId, 0, 1,
				orderByComparator);

		if (list.isEmpty()) {
			StringBundler msg = new StringBundler(6);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("groupId=");
			msg.append(groupId);

			msg.append(", languageId=");
			msg.append(languageId);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			throw new NoSuchEDFunctionException(msg.toString());
		}
		else {
			return list.get(0);
		}
	}

	/**
	 * Finds the last e d function in the ordered set where groupId = &#63; and languageId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param groupId the group id to search with
	 * @param languageId the language id to search with
	 * @param orderByComparator the comparator to order the set by
	 * @return the last matching e d function
	 * @throws com.vsi.edirectory.portlet.NoSuchEDFunctionException if a matching e d function could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public EDFunction findByG_L_Last(long groupId, String languageId,
		OrderByComparator orderByComparator)
		throws NoSuchEDFunctionException, SystemException {
		int count = countByG_L(groupId, languageId);

		List<EDFunction> list = findByG_L(groupId, languageId, count - 1,
				count, orderByComparator);

		if (list.isEmpty()) {
			StringBundler msg = new StringBundler(6);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("groupId=");
			msg.append(groupId);

			msg.append(", languageId=");
			msg.append(languageId);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			throw new NoSuchEDFunctionException(msg.toString());
		}
		else {
			return list.get(0);
		}
	}

	/**
	 * Finds the e d functions before and after the current e d function in the ordered set where groupId = &#63; and languageId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param id the primary key of the current e d function
	 * @param groupId the group id to search with
	 * @param languageId the language id to search with
	 * @param orderByComparator the comparator to order the set by
	 * @return the previous, current, and next e d function
	 * @throws com.vsi.edirectory.portlet.NoSuchEDFunctionException if a e d function with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public EDFunction[] findByG_L_PrevAndNext(long id, long groupId,
		String languageId, OrderByComparator orderByComparator)
		throws NoSuchEDFunctionException, SystemException {
		EDFunction edFunction = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			EDFunction[] array = new EDFunctionImpl[3];

			array[0] = getByG_L_PrevAndNext(session, edFunction, groupId,
					languageId, orderByComparator, true);

			array[1] = edFunction;

			array[2] = getByG_L_PrevAndNext(session, edFunction, groupId,
					languageId, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected EDFunction getByG_L_PrevAndNext(Session session,
		EDFunction edFunction, long groupId, String languageId,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_EDFUNCTION_WHERE);

		query.append(_FINDER_COLUMN_G_L_GROUPID_2);

		if (languageId == null) {
			query.append(_FINDER_COLUMN_G_L_LANGUAGEID_1);
		}
		else {
			if (languageId.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_G_L_LANGUAGEID_3);
			}
			else {
				query.append(_FINDER_COLUMN_G_L_LANGUAGEID_2);
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
			query.append(EDFunctionModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(groupId);

		if (languageId != null) {
			qPos.add(languageId);
		}

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByValues(edFunction);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<EDFunction> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Finds the e d function where id = &#63; and groupId = &#63; or throws a {@link com.vsi.edirectory.portlet.NoSuchEDFunctionException} if it could not be found.
	 *
	 * @param id the id to search with
	 * @param groupId the group id to search with
	 * @return the matching e d function
	 * @throws com.vsi.edirectory.portlet.NoSuchEDFunctionException if a matching e d function could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public EDFunction findByF_G(long id, long groupId)
		throws NoSuchEDFunctionException, SystemException {
		EDFunction edFunction = fetchByF_G(id, groupId);

		if (edFunction == null) {
			StringBundler msg = new StringBundler(6);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("id=");
			msg.append(id);

			msg.append(", groupId=");
			msg.append(groupId);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			if (_log.isWarnEnabled()) {
				_log.warn(msg.toString());
			}

			throw new NoSuchEDFunctionException(msg.toString());
		}

		return edFunction;
	}

	/**
	 * Finds the e d function where id = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param id the id to search with
	 * @param groupId the group id to search with
	 * @return the matching e d function, or <code>null</code> if a matching e d function could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public EDFunction fetchByF_G(long id, long groupId)
		throws SystemException {
		return fetchByF_G(id, groupId, true);
	}

	/**
	 * Finds the e d function where id = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param id the id to search with
	 * @param groupId the group id to search with
	 * @return the matching e d function, or <code>null</code> if a matching e d function could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public EDFunction fetchByF_G(long id, long groupId,
		boolean retrieveFromCache) throws SystemException {
		Object[] finderArgs = new Object[] { id, groupId };

		Object result = null;

		if (retrieveFromCache) {
			result = FinderCacheUtil.getResult(FINDER_PATH_FETCH_BY_F_G,
					finderArgs, this);
		}

		if (result == null) {
			StringBundler query = new StringBundler(4);

			query.append(_SQL_SELECT_EDFUNCTION_WHERE);

			query.append(_FINDER_COLUMN_F_G_ID_2);

			query.append(_FINDER_COLUMN_F_G_GROUPID_2);

			query.append(EDFunctionModelImpl.ORDER_BY_JPQL);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(id);

				qPos.add(groupId);

				List<EDFunction> list = q.list();

				result = list;

				EDFunction edFunction = null;

				if (list.isEmpty()) {
					FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_F_G,
						finderArgs, list);
				}
				else {
					edFunction = list.get(0);

					cacheResult(edFunction);

					if ((edFunction.getId() != id) ||
							(edFunction.getGroupId() != groupId)) {
						FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_F_G,
							finderArgs, edFunction);
					}
				}

				return edFunction;
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (result == null) {
					FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_F_G,
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
				return (EDFunction)result;
			}
		}
	}

	/**
	 * Finds all the e d functions.
	 *
	 * @return the e d functions
	 * @throws SystemException if a system exception occurred
	 */
	public List<EDFunction> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Finds a range of all the e d functions.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param start the lower bound of the range of e d functions to return
	 * @param end the upper bound of the range of e d functions to return (not inclusive)
	 * @return the range of e d functions
	 * @throws SystemException if a system exception occurred
	 */
	public List<EDFunction> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Finds an ordered range of all the e d functions.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param start the lower bound of the range of e d functions to return
	 * @param end the upper bound of the range of e d functions to return (not inclusive)
	 * @param orderByComparator the comparator to order the results by
	 * @return the ordered range of e d functions
	 * @throws SystemException if a system exception occurred
	 */
	public List<EDFunction> findAll(int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		Object[] finderArgs = new Object[] {
				String.valueOf(start), String.valueOf(end),
				String.valueOf(orderByComparator)
			};

		List<EDFunction> list = (List<EDFunction>)FinderCacheUtil.getResult(FINDER_PATH_FIND_ALL,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_EDFUNCTION);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_EDFUNCTION.concat(EDFunctionModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (orderByComparator == null) {
					list = (List<EDFunction>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);
				}
				else {
					list = (List<EDFunction>)QueryUtil.list(q, getDialect(),
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
	 * Removes all the e d functions where isShowTree = &#63; from the database.
	 *
	 * @param isShowTree the is show tree to search with
	 * @throws SystemException if a system exception occurred
	 */
	public void removeByIsShowed(boolean isShowTree) throws SystemException {
		for (EDFunction edFunction : findByIsShowed(isShowTree)) {
			remove(edFunction);
		}
	}

	/**
	 * Removes all the e d functions where groupId = &#63; and languageId = &#63; from the database.
	 *
	 * @param groupId the group id to search with
	 * @param languageId the language id to search with
	 * @throws SystemException if a system exception occurred
	 */
	public void removeByG_L(long groupId, String languageId)
		throws SystemException {
		for (EDFunction edFunction : findByG_L(groupId, languageId)) {
			remove(edFunction);
		}
	}

	/**
	 * Removes the e d function where id = &#63; and groupId = &#63; from the database.
	 *
	 * @param id the id to search with
	 * @param groupId the group id to search with
	 * @throws SystemException if a system exception occurred
	 */
	public void removeByF_G(long id, long groupId)
		throws NoSuchEDFunctionException, SystemException {
		EDFunction edFunction = findByF_G(id, groupId);

		remove(edFunction);
	}

	/**
	 * Removes all the e d functions from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	public void removeAll() throws SystemException {
		for (EDFunction edFunction : findAll()) {
			remove(edFunction);
		}
	}

	/**
	 * Counts all the e d functions where isShowTree = &#63;.
	 *
	 * @param isShowTree the is show tree to search with
	 * @return the number of matching e d functions
	 * @throws SystemException if a system exception occurred
	 */
	public int countByIsShowed(boolean isShowTree) throws SystemException {
		Object[] finderArgs = new Object[] { isShowTree };

		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_BY_ISSHOWED,
				finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_EDFUNCTION_WHERE);

			query.append(_FINDER_COLUMN_ISSHOWED_ISSHOWTREE_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(isShowTree);

				count = (Long)q.uniqueResult();
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (count == null) {
					count = Long.valueOf(0);
				}

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_ISSHOWED,
					finderArgs, count);

				closeSession(session);
			}
		}

		return count.intValue();
	}

	/**
	 * Counts all the e d functions where groupId = &#63; and languageId = &#63;.
	 *
	 * @param groupId the group id to search with
	 * @param languageId the language id to search with
	 * @return the number of matching e d functions
	 * @throws SystemException if a system exception occurred
	 */
	public int countByG_L(long groupId, String languageId)
		throws SystemException {
		Object[] finderArgs = new Object[] { groupId, languageId };

		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_BY_G_L,
				finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_EDFUNCTION_WHERE);

			query.append(_FINDER_COLUMN_G_L_GROUPID_2);

			if (languageId == null) {
				query.append(_FINDER_COLUMN_G_L_LANGUAGEID_1);
			}
			else {
				if (languageId.equals(StringPool.BLANK)) {
					query.append(_FINDER_COLUMN_G_L_LANGUAGEID_3);
				}
				else {
					query.append(_FINDER_COLUMN_G_L_LANGUAGEID_2);
				}
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(groupId);

				if (languageId != null) {
					qPos.add(languageId);
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
	 * Counts all the e d functions where id = &#63; and groupId = &#63;.
	 *
	 * @param id the id to search with
	 * @param groupId the group id to search with
	 * @return the number of matching e d functions
	 * @throws SystemException if a system exception occurred
	 */
	public int countByF_G(long id, long groupId) throws SystemException {
		Object[] finderArgs = new Object[] { id, groupId };

		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_BY_F_G,
				finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_EDFUNCTION_WHERE);

			query.append(_FINDER_COLUMN_F_G_ID_2);

			query.append(_FINDER_COLUMN_F_G_GROUPID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(id);

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

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_F_G, finderArgs,
					count);

				closeSession(session);
			}
		}

		return count.intValue();
	}

	/**
	 * Counts all the e d functions.
	 *
	 * @return the number of e d functions
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

				Query q = session.createQuery(_SQL_COUNT_EDFUNCTION);

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
	 * Initializes the e d function persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.com.vsi.edirectory.portlet.model.EDFunction")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<EDFunction>> listenersList = new ArrayList<ModelListener<EDFunction>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<EDFunction>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(EDFunctionImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST);
	}

	@BeanReference(type = EDEmployeePersistence.class)
	protected EDEmployeePersistence edEmployeePersistence;
	@BeanReference(type = EDDepartmentPersistence.class)
	protected EDDepartmentPersistence edDepartmentPersistence;
	@BeanReference(type = EDFunctionPersistence.class)
	protected EDFunctionPersistence edFunctionPersistence;
	@BeanReference(type = EDFunctionDepartmentPersistence.class)
	protected EDFunctionDepartmentPersistence edFunctionDepartmentPersistence;
	@BeanReference(type = EDFunctionEmployeePersistence.class)
	protected EDFunctionEmployeePersistence edFunctionEmployeePersistence;
	@BeanReference(type = ResourcePersistence.class)
	protected ResourcePersistence resourcePersistence;
	@BeanReference(type = UserPersistence.class)
	protected UserPersistence userPersistence;
	private static final String _SQL_SELECT_EDFUNCTION = "SELECT edFunction FROM EDFunction edFunction";
	private static final String _SQL_SELECT_EDFUNCTION_WHERE = "SELECT edFunction FROM EDFunction edFunction WHERE ";
	private static final String _SQL_COUNT_EDFUNCTION = "SELECT COUNT(edFunction) FROM EDFunction edFunction";
	private static final String _SQL_COUNT_EDFUNCTION_WHERE = "SELECT COUNT(edFunction) FROM EDFunction edFunction WHERE ";
	private static final String _FINDER_COLUMN_ISSHOWED_ISSHOWTREE_2 = "edFunction.isShowTree = ?";
	private static final String _FINDER_COLUMN_G_L_GROUPID_2 = "edFunction.groupId = ? AND ";
	private static final String _FINDER_COLUMN_G_L_LANGUAGEID_1 = "edFunction.languageId IS NULL";
	private static final String _FINDER_COLUMN_G_L_LANGUAGEID_2 = "edFunction.languageId = ?";
	private static final String _FINDER_COLUMN_G_L_LANGUAGEID_3 = "(edFunction.languageId IS NULL OR edFunction.languageId = ?)";
	private static final String _FINDER_COLUMN_F_G_ID_2 = "edFunction.id = ? AND ";
	private static final String _FINDER_COLUMN_F_G_GROUPID_2 = "edFunction.groupId = ?";
	private static final String _ORDER_BY_ENTITY_ALIAS = "edFunction.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No EDFunction exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No EDFunction exists with the key {";
	private static Log _log = LogFactoryUtil.getLog(EDFunctionPersistenceImpl.class);
}