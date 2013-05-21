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

import com.vsi.edirectory.portlet.NoSuchEDFunctionDepartmentException;
import com.vsi.edirectory.portlet.model.EDFunctionDepartment;
import com.vsi.edirectory.portlet.model.impl.EDFunctionDepartmentImpl;
import com.vsi.edirectory.portlet.model.impl.EDFunctionDepartmentModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The persistence implementation for the e d function department service.
 *
 * <p>
 * Never modify or reference this class directly. Always use {@link EDFunctionDepartmentUtil} to access the e d function department persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
 * </p>
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author vinhnt
 * @see EDFunctionDepartmentPersistence
 * @see EDFunctionDepartmentUtil
 * @generated
 */
public class EDFunctionDepartmentPersistenceImpl extends BasePersistenceImpl<EDFunctionDepartment>
	implements EDFunctionDepartmentPersistence {
	public static final String FINDER_CLASS_NAME_ENTITY = EDFunctionDepartmentImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST = FINDER_CLASS_NAME_ENTITY +
		".List";
	public static final FinderPath FINDER_PATH_FIND_BY_FUNCTIONID = new FinderPath(EDFunctionDepartmentModelImpl.ENTITY_CACHE_ENABLED,
			EDFunctionDepartmentModelImpl.FINDER_CACHE_ENABLED,
			FINDER_CLASS_NAME_LIST, "findByFunctionId",
			new String[] {
				Long.class.getName(),
				
			"java.lang.Integer", "java.lang.Integer",
				"com.liferay.portal.kernel.util.OrderByComparator"
			});
	public static final FinderPath FINDER_PATH_COUNT_BY_FUNCTIONID = new FinderPath(EDFunctionDepartmentModelImpl.ENTITY_CACHE_ENABLED,
			EDFunctionDepartmentModelImpl.FINDER_CACHE_ENABLED,
			FINDER_CLASS_NAME_LIST, "countByFunctionId",
			new String[] { Long.class.getName() });
	public static final FinderPath FINDER_PATH_FIND_BY_DEPARTMENTID = new FinderPath(EDFunctionDepartmentModelImpl.ENTITY_CACHE_ENABLED,
			EDFunctionDepartmentModelImpl.FINDER_CACHE_ENABLED,
			FINDER_CLASS_NAME_LIST, "findByDepartmentId",
			new String[] {
				Long.class.getName(),
				
			"java.lang.Integer", "java.lang.Integer",
				"com.liferay.portal.kernel.util.OrderByComparator"
			});
	public static final FinderPath FINDER_PATH_COUNT_BY_DEPARTMENTID = new FinderPath(EDFunctionDepartmentModelImpl.ENTITY_CACHE_ENABLED,
			EDFunctionDepartmentModelImpl.FINDER_CACHE_ENABLED,
			FINDER_CLASS_NAME_LIST, "countByDepartmentId",
			new String[] { Long.class.getName() });
	public static final FinderPath FINDER_PATH_FIND_ALL = new FinderPath(EDFunctionDepartmentModelImpl.ENTITY_CACHE_ENABLED,
			EDFunctionDepartmentModelImpl.FINDER_CACHE_ENABLED,
			FINDER_CLASS_NAME_LIST, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(EDFunctionDepartmentModelImpl.ENTITY_CACHE_ENABLED,
			EDFunctionDepartmentModelImpl.FINDER_CACHE_ENABLED,
			FINDER_CLASS_NAME_LIST, "countAll", new String[0]);

	/**
	 * Caches the e d function department in the entity cache if it is enabled.
	 *
	 * @param edFunctionDepartment the e d function department to cache
	 */
	public void cacheResult(EDFunctionDepartment edFunctionDepartment) {
		EntityCacheUtil.putResult(EDFunctionDepartmentModelImpl.ENTITY_CACHE_ENABLED,
			EDFunctionDepartmentImpl.class,
			edFunctionDepartment.getPrimaryKey(), edFunctionDepartment);
	}

	/**
	 * Caches the e d function departments in the entity cache if it is enabled.
	 *
	 * @param edFunctionDepartments the e d function departments to cache
	 */
	public void cacheResult(List<EDFunctionDepartment> edFunctionDepartments) {
		for (EDFunctionDepartment edFunctionDepartment : edFunctionDepartments) {
			if (EntityCacheUtil.getResult(
						EDFunctionDepartmentModelImpl.ENTITY_CACHE_ENABLED,
						EDFunctionDepartmentImpl.class,
						edFunctionDepartment.getPrimaryKey(), this) == null) {
				cacheResult(edFunctionDepartment);
			}
		}
	}

	/**
	 * Clears the cache for all e d function departments.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	public void clearCache() {
		CacheRegistryUtil.clear(EDFunctionDepartmentImpl.class.getName());
		EntityCacheUtil.clearCache(EDFunctionDepartmentImpl.class.getName());
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST);
	}

	/**
	 * Clears the cache for the e d function department.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	public void clearCache(EDFunctionDepartment edFunctionDepartment) {
		EntityCacheUtil.removeResult(EDFunctionDepartmentModelImpl.ENTITY_CACHE_ENABLED,
			EDFunctionDepartmentImpl.class, edFunctionDepartment.getPrimaryKey());
	}

	/**
	 * Creates a new e d function department with the primary key. Does not add the e d function department to the database.
	 *
	 * @param id the primary key for the new e d function department
	 * @return the new e d function department
	 */
	public EDFunctionDepartment create(long id) {
		EDFunctionDepartment edFunctionDepartment = new EDFunctionDepartmentImpl();

		edFunctionDepartment.setNew(true);
		edFunctionDepartment.setPrimaryKey(id);

		return edFunctionDepartment;
	}

	/**
	 * Removes the e d function department with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the e d function department to remove
	 * @return the e d function department that was removed
	 * @throws com.liferay.portal.NoSuchModelException if a e d function department with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public EDFunctionDepartment remove(Serializable primaryKey)
		throws NoSuchModelException, SystemException {
		return remove(((Long)primaryKey).longValue());
	}

	/**
	 * Removes the e d function department with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the e d function department to remove
	 * @return the e d function department that was removed
	 * @throws com.vsi.edirectory.portlet.NoSuchEDFunctionDepartmentException if a e d function department with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public EDFunctionDepartment remove(long id)
		throws NoSuchEDFunctionDepartmentException, SystemException {
		Session session = null;

		try {
			session = openSession();

			EDFunctionDepartment edFunctionDepartment = (EDFunctionDepartment)session.get(EDFunctionDepartmentImpl.class,
					new Long(id));

			if (edFunctionDepartment == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + id);
				}

				throw new NoSuchEDFunctionDepartmentException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					id);
			}

			return remove(edFunctionDepartment);
		}
		catch (NoSuchEDFunctionDepartmentException nsee) {
			throw nsee;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected EDFunctionDepartment removeImpl(
		EDFunctionDepartment edFunctionDepartment) throws SystemException {
		edFunctionDepartment = toUnwrappedModel(edFunctionDepartment);

		Session session = null;

		try {
			session = openSession();

			BatchSessionUtil.delete(session, edFunctionDepartment);
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST);

		EntityCacheUtil.removeResult(EDFunctionDepartmentModelImpl.ENTITY_CACHE_ENABLED,
			EDFunctionDepartmentImpl.class, edFunctionDepartment.getPrimaryKey());

		return edFunctionDepartment;
	}

	public EDFunctionDepartment updateImpl(
		com.vsi.edirectory.portlet.model.EDFunctionDepartment edFunctionDepartment,
		boolean merge) throws SystemException {
		edFunctionDepartment = toUnwrappedModel(edFunctionDepartment);

		Session session = null;

		try {
			session = openSession();

			BatchSessionUtil.update(session, edFunctionDepartment, merge);

			edFunctionDepartment.setNew(false);
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST);

		EntityCacheUtil.putResult(EDFunctionDepartmentModelImpl.ENTITY_CACHE_ENABLED,
			EDFunctionDepartmentImpl.class,
			edFunctionDepartment.getPrimaryKey(), edFunctionDepartment);

		return edFunctionDepartment;
	}

	protected EDFunctionDepartment toUnwrappedModel(
		EDFunctionDepartment edFunctionDepartment) {
		if (edFunctionDepartment instanceof EDFunctionDepartmentImpl) {
			return edFunctionDepartment;
		}

		EDFunctionDepartmentImpl edFunctionDepartmentImpl = new EDFunctionDepartmentImpl();

		edFunctionDepartmentImpl.setNew(edFunctionDepartment.isNew());
		edFunctionDepartmentImpl.setPrimaryKey(edFunctionDepartment.getPrimaryKey());

		edFunctionDepartmentImpl.setId(edFunctionDepartment.getId());
		edFunctionDepartmentImpl.setFunctionId(edFunctionDepartment.getFunctionId());
		edFunctionDepartmentImpl.setDepartmentId(edFunctionDepartment.getDepartmentId());

		return edFunctionDepartmentImpl;
	}

	/**
	 * Finds the e d function department with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the e d function department to find
	 * @return the e d function department
	 * @throws com.liferay.portal.NoSuchModelException if a e d function department with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public EDFunctionDepartment findByPrimaryKey(Serializable primaryKey)
		throws NoSuchModelException, SystemException {
		return findByPrimaryKey(((Long)primaryKey).longValue());
	}

	/**
	 * Finds the e d function department with the primary key or throws a {@link com.vsi.edirectory.portlet.NoSuchEDFunctionDepartmentException} if it could not be found.
	 *
	 * @param id the primary key of the e d function department to find
	 * @return the e d function department
	 * @throws com.vsi.edirectory.portlet.NoSuchEDFunctionDepartmentException if a e d function department with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public EDFunctionDepartment findByPrimaryKey(long id)
		throws NoSuchEDFunctionDepartmentException, SystemException {
		EDFunctionDepartment edFunctionDepartment = fetchByPrimaryKey(id);

		if (edFunctionDepartment == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + id);
			}

			throw new NoSuchEDFunctionDepartmentException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				id);
		}

		return edFunctionDepartment;
	}

	/**
	 * Finds the e d function department with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the e d function department to find
	 * @return the e d function department, or <code>null</code> if a e d function department with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public EDFunctionDepartment fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		return fetchByPrimaryKey(((Long)primaryKey).longValue());
	}

	/**
	 * Finds the e d function department with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the e d function department to find
	 * @return the e d function department, or <code>null</code> if a e d function department with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public EDFunctionDepartment fetchByPrimaryKey(long id)
		throws SystemException {
		EDFunctionDepartment edFunctionDepartment = (EDFunctionDepartment)EntityCacheUtil.getResult(EDFunctionDepartmentModelImpl.ENTITY_CACHE_ENABLED,
				EDFunctionDepartmentImpl.class, id, this);

		if (edFunctionDepartment == null) {
			Session session = null;

			try {
				session = openSession();

				edFunctionDepartment = (EDFunctionDepartment)session.get(EDFunctionDepartmentImpl.class,
						new Long(id));
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (edFunctionDepartment != null) {
					cacheResult(edFunctionDepartment);
				}

				closeSession(session);
			}
		}

		return edFunctionDepartment;
	}

	/**
	 * Finds all the e d function departments where functionId = &#63;.
	 *
	 * @param functionId the function id to search with
	 * @return the matching e d function departments
	 * @throws SystemException if a system exception occurred
	 */
	public List<EDFunctionDepartment> findByFunctionId(long functionId)
		throws SystemException {
		return findByFunctionId(functionId, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Finds a range of all the e d function departments where functionId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param functionId the function id to search with
	 * @param start the lower bound of the range of e d function departments to return
	 * @param end the upper bound of the range of e d function departments to return (not inclusive)
	 * @return the range of matching e d function departments
	 * @throws SystemException if a system exception occurred
	 */
	public List<EDFunctionDepartment> findByFunctionId(long functionId,
		int start, int end) throws SystemException {
		return findByFunctionId(functionId, start, end, null);
	}

	/**
	 * Finds an ordered range of all the e d function departments where functionId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param functionId the function id to search with
	 * @param start the lower bound of the range of e d function departments to return
	 * @param end the upper bound of the range of e d function departments to return (not inclusive)
	 * @param orderByComparator the comparator to order the results by
	 * @return the ordered range of matching e d function departments
	 * @throws SystemException if a system exception occurred
	 */
	public List<EDFunctionDepartment> findByFunctionId(long functionId,
		int start, int end, OrderByComparator orderByComparator)
		throws SystemException {
		Object[] finderArgs = new Object[] {
				functionId,
				
				String.valueOf(start), String.valueOf(end),
				String.valueOf(orderByComparator)
			};

		List<EDFunctionDepartment> list = (List<EDFunctionDepartment>)FinderCacheUtil.getResult(FINDER_PATH_FIND_BY_FUNCTIONID,
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

			query.append(_SQL_SELECT_EDFUNCTIONDEPARTMENT_WHERE);

			query.append(_FINDER_COLUMN_FUNCTIONID_FUNCTIONID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}

			else {
				query.append(EDFunctionDepartmentModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(functionId);

				list = (List<EDFunctionDepartment>)QueryUtil.list(q,
						getDialect(), start, end);
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (list == null) {
					FinderCacheUtil.removeResult(FINDER_PATH_FIND_BY_FUNCTIONID,
						finderArgs);
				}
				else {
					cacheResult(list);

					FinderCacheUtil.putResult(FINDER_PATH_FIND_BY_FUNCTIONID,
						finderArgs, list);
				}

				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Finds the first e d function department in the ordered set where functionId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param functionId the function id to search with
	 * @param orderByComparator the comparator to order the set by
	 * @return the first matching e d function department
	 * @throws com.vsi.edirectory.portlet.NoSuchEDFunctionDepartmentException if a matching e d function department could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public EDFunctionDepartment findByFunctionId_First(long functionId,
		OrderByComparator orderByComparator)
		throws NoSuchEDFunctionDepartmentException, SystemException {
		List<EDFunctionDepartment> list = findByFunctionId(functionId, 0, 1,
				orderByComparator);

		if (list.isEmpty()) {
			StringBundler msg = new StringBundler(4);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("functionId=");
			msg.append(functionId);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			throw new NoSuchEDFunctionDepartmentException(msg.toString());
		}
		else {
			return list.get(0);
		}
	}

	/**
	 * Finds the last e d function department in the ordered set where functionId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param functionId the function id to search with
	 * @param orderByComparator the comparator to order the set by
	 * @return the last matching e d function department
	 * @throws com.vsi.edirectory.portlet.NoSuchEDFunctionDepartmentException if a matching e d function department could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public EDFunctionDepartment findByFunctionId_Last(long functionId,
		OrderByComparator orderByComparator)
		throws NoSuchEDFunctionDepartmentException, SystemException {
		int count = countByFunctionId(functionId);

		List<EDFunctionDepartment> list = findByFunctionId(functionId,
				count - 1, count, orderByComparator);

		if (list.isEmpty()) {
			StringBundler msg = new StringBundler(4);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("functionId=");
			msg.append(functionId);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			throw new NoSuchEDFunctionDepartmentException(msg.toString());
		}
		else {
			return list.get(0);
		}
	}

	/**
	 * Finds the e d function departments before and after the current e d function department in the ordered set where functionId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param id the primary key of the current e d function department
	 * @param functionId the function id to search with
	 * @param orderByComparator the comparator to order the set by
	 * @return the previous, current, and next e d function department
	 * @throws com.vsi.edirectory.portlet.NoSuchEDFunctionDepartmentException if a e d function department with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public EDFunctionDepartment[] findByFunctionId_PrevAndNext(long id,
		long functionId, OrderByComparator orderByComparator)
		throws NoSuchEDFunctionDepartmentException, SystemException {
		EDFunctionDepartment edFunctionDepartment = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			EDFunctionDepartment[] array = new EDFunctionDepartmentImpl[3];

			array[0] = getByFunctionId_PrevAndNext(session,
					edFunctionDepartment, functionId, orderByComparator, true);

			array[1] = edFunctionDepartment;

			array[2] = getByFunctionId_PrevAndNext(session,
					edFunctionDepartment, functionId, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected EDFunctionDepartment getByFunctionId_PrevAndNext(
		Session session, EDFunctionDepartment edFunctionDepartment,
		long functionId, OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_EDFUNCTIONDEPARTMENT_WHERE);

		query.append(_FINDER_COLUMN_FUNCTIONID_FUNCTIONID_2);

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
			query.append(EDFunctionDepartmentModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(functionId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByValues(edFunctionDepartment);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<EDFunctionDepartment> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Finds all the e d function departments where departmentId = &#63;.
	 *
	 * @param departmentId the department id to search with
	 * @return the matching e d function departments
	 * @throws SystemException if a system exception occurred
	 */
	public List<EDFunctionDepartment> findByDepartmentId(long departmentId)
		throws SystemException {
		return findByDepartmentId(departmentId, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Finds a range of all the e d function departments where departmentId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param departmentId the department id to search with
	 * @param start the lower bound of the range of e d function departments to return
	 * @param end the upper bound of the range of e d function departments to return (not inclusive)
	 * @return the range of matching e d function departments
	 * @throws SystemException if a system exception occurred
	 */
	public List<EDFunctionDepartment> findByDepartmentId(long departmentId,
		int start, int end) throws SystemException {
		return findByDepartmentId(departmentId, start, end, null);
	}

	/**
	 * Finds an ordered range of all the e d function departments where departmentId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param departmentId the department id to search with
	 * @param start the lower bound of the range of e d function departments to return
	 * @param end the upper bound of the range of e d function departments to return (not inclusive)
	 * @param orderByComparator the comparator to order the results by
	 * @return the ordered range of matching e d function departments
	 * @throws SystemException if a system exception occurred
	 */
	public List<EDFunctionDepartment> findByDepartmentId(long departmentId,
		int start, int end, OrderByComparator orderByComparator)
		throws SystemException {
		Object[] finderArgs = new Object[] {
				departmentId,
				
				String.valueOf(start), String.valueOf(end),
				String.valueOf(orderByComparator)
			};

		List<EDFunctionDepartment> list = (List<EDFunctionDepartment>)FinderCacheUtil.getResult(FINDER_PATH_FIND_BY_DEPARTMENTID,
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

			query.append(_SQL_SELECT_EDFUNCTIONDEPARTMENT_WHERE);

			query.append(_FINDER_COLUMN_DEPARTMENTID_DEPARTMENTID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}

			else {
				query.append(EDFunctionDepartmentModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(departmentId);

				list = (List<EDFunctionDepartment>)QueryUtil.list(q,
						getDialect(), start, end);
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (list == null) {
					FinderCacheUtil.removeResult(FINDER_PATH_FIND_BY_DEPARTMENTID,
						finderArgs);
				}
				else {
					cacheResult(list);

					FinderCacheUtil.putResult(FINDER_PATH_FIND_BY_DEPARTMENTID,
						finderArgs, list);
				}

				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Finds the first e d function department in the ordered set where departmentId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param departmentId the department id to search with
	 * @param orderByComparator the comparator to order the set by
	 * @return the first matching e d function department
	 * @throws com.vsi.edirectory.portlet.NoSuchEDFunctionDepartmentException if a matching e d function department could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public EDFunctionDepartment findByDepartmentId_First(long departmentId,
		OrderByComparator orderByComparator)
		throws NoSuchEDFunctionDepartmentException, SystemException {
		List<EDFunctionDepartment> list = findByDepartmentId(departmentId, 0,
				1, orderByComparator);

		if (list.isEmpty()) {
			StringBundler msg = new StringBundler(4);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("departmentId=");
			msg.append(departmentId);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			throw new NoSuchEDFunctionDepartmentException(msg.toString());
		}
		else {
			return list.get(0);
		}
	}

	/**
	 * Finds the last e d function department in the ordered set where departmentId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param departmentId the department id to search with
	 * @param orderByComparator the comparator to order the set by
	 * @return the last matching e d function department
	 * @throws com.vsi.edirectory.portlet.NoSuchEDFunctionDepartmentException if a matching e d function department could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public EDFunctionDepartment findByDepartmentId_Last(long departmentId,
		OrderByComparator orderByComparator)
		throws NoSuchEDFunctionDepartmentException, SystemException {
		int count = countByDepartmentId(departmentId);

		List<EDFunctionDepartment> list = findByDepartmentId(departmentId,
				count - 1, count, orderByComparator);

		if (list.isEmpty()) {
			StringBundler msg = new StringBundler(4);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("departmentId=");
			msg.append(departmentId);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			throw new NoSuchEDFunctionDepartmentException(msg.toString());
		}
		else {
			return list.get(0);
		}
	}

	/**
	 * Finds the e d function departments before and after the current e d function department in the ordered set where departmentId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param id the primary key of the current e d function department
	 * @param departmentId the department id to search with
	 * @param orderByComparator the comparator to order the set by
	 * @return the previous, current, and next e d function department
	 * @throws com.vsi.edirectory.portlet.NoSuchEDFunctionDepartmentException if a e d function department with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public EDFunctionDepartment[] findByDepartmentId_PrevAndNext(long id,
		long departmentId, OrderByComparator orderByComparator)
		throws NoSuchEDFunctionDepartmentException, SystemException {
		EDFunctionDepartment edFunctionDepartment = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			EDFunctionDepartment[] array = new EDFunctionDepartmentImpl[3];

			array[0] = getByDepartmentId_PrevAndNext(session,
					edFunctionDepartment, departmentId, orderByComparator, true);

			array[1] = edFunctionDepartment;

			array[2] = getByDepartmentId_PrevAndNext(session,
					edFunctionDepartment, departmentId, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected EDFunctionDepartment getByDepartmentId_PrevAndNext(
		Session session, EDFunctionDepartment edFunctionDepartment,
		long departmentId, OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_EDFUNCTIONDEPARTMENT_WHERE);

		query.append(_FINDER_COLUMN_DEPARTMENTID_DEPARTMENTID_2);

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
			query.append(EDFunctionDepartmentModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(departmentId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByValues(edFunctionDepartment);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<EDFunctionDepartment> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Finds all the e d function departments.
	 *
	 * @return the e d function departments
	 * @throws SystemException if a system exception occurred
	 */
	public List<EDFunctionDepartment> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Finds a range of all the e d function departments.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param start the lower bound of the range of e d function departments to return
	 * @param end the upper bound of the range of e d function departments to return (not inclusive)
	 * @return the range of e d function departments
	 * @throws SystemException if a system exception occurred
	 */
	public List<EDFunctionDepartment> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Finds an ordered range of all the e d function departments.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param start the lower bound of the range of e d function departments to return
	 * @param end the upper bound of the range of e d function departments to return (not inclusive)
	 * @param orderByComparator the comparator to order the results by
	 * @return the ordered range of e d function departments
	 * @throws SystemException if a system exception occurred
	 */
	public List<EDFunctionDepartment> findAll(int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		Object[] finderArgs = new Object[] {
				String.valueOf(start), String.valueOf(end),
				String.valueOf(orderByComparator)
			};

		List<EDFunctionDepartment> list = (List<EDFunctionDepartment>)FinderCacheUtil.getResult(FINDER_PATH_FIND_ALL,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_EDFUNCTIONDEPARTMENT);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_EDFUNCTIONDEPARTMENT.concat(EDFunctionDepartmentModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (orderByComparator == null) {
					list = (List<EDFunctionDepartment>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);
				}
				else {
					list = (List<EDFunctionDepartment>)QueryUtil.list(q,
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
	 * Removes all the e d function departments where functionId = &#63; from the database.
	 *
	 * @param functionId the function id to search with
	 * @throws SystemException if a system exception occurred
	 */
	public void removeByFunctionId(long functionId) throws SystemException {
		for (EDFunctionDepartment edFunctionDepartment : findByFunctionId(
				functionId)) {
			remove(edFunctionDepartment);
		}
	}

	/**
	 * Removes all the e d function departments where departmentId = &#63; from the database.
	 *
	 * @param departmentId the department id to search with
	 * @throws SystemException if a system exception occurred
	 */
	public void removeByDepartmentId(long departmentId)
		throws SystemException {
		for (EDFunctionDepartment edFunctionDepartment : findByDepartmentId(
				departmentId)) {
			remove(edFunctionDepartment);
		}
	}

	/**
	 * Removes all the e d function departments from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	public void removeAll() throws SystemException {
		for (EDFunctionDepartment edFunctionDepartment : findAll()) {
			remove(edFunctionDepartment);
		}
	}

	/**
	 * Counts all the e d function departments where functionId = &#63;.
	 *
	 * @param functionId the function id to search with
	 * @return the number of matching e d function departments
	 * @throws SystemException if a system exception occurred
	 */
	public int countByFunctionId(long functionId) throws SystemException {
		Object[] finderArgs = new Object[] { functionId };

		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_BY_FUNCTIONID,
				finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_EDFUNCTIONDEPARTMENT_WHERE);

			query.append(_FINDER_COLUMN_FUNCTIONID_FUNCTIONID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(functionId);

				count = (Long)q.uniqueResult();
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (count == null) {
					count = Long.valueOf(0);
				}

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_FUNCTIONID,
					finderArgs, count);

				closeSession(session);
			}
		}

		return count.intValue();
	}

	/**
	 * Counts all the e d function departments where departmentId = &#63;.
	 *
	 * @param departmentId the department id to search with
	 * @return the number of matching e d function departments
	 * @throws SystemException if a system exception occurred
	 */
	public int countByDepartmentId(long departmentId) throws SystemException {
		Object[] finderArgs = new Object[] { departmentId };

		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_BY_DEPARTMENTID,
				finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_EDFUNCTIONDEPARTMENT_WHERE);

			query.append(_FINDER_COLUMN_DEPARTMENTID_DEPARTMENTID_2);

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

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_DEPARTMENTID,
					finderArgs, count);

				closeSession(session);
			}
		}

		return count.intValue();
	}

	/**
	 * Counts all the e d function departments.
	 *
	 * @return the number of e d function departments
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

				Query q = session.createQuery(_SQL_COUNT_EDFUNCTIONDEPARTMENT);

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
	 * Initializes the e d function department persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.com.vsi.edirectory.portlet.model.EDFunctionDepartment")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<EDFunctionDepartment>> listenersList = new ArrayList<ModelListener<EDFunctionDepartment>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<EDFunctionDepartment>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(EDFunctionDepartmentImpl.class.getName());
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
	private static final String _SQL_SELECT_EDFUNCTIONDEPARTMENT = "SELECT edFunctionDepartment FROM EDFunctionDepartment edFunctionDepartment";
	private static final String _SQL_SELECT_EDFUNCTIONDEPARTMENT_WHERE = "SELECT edFunctionDepartment FROM EDFunctionDepartment edFunctionDepartment WHERE ";
	private static final String _SQL_COUNT_EDFUNCTIONDEPARTMENT = "SELECT COUNT(edFunctionDepartment) FROM EDFunctionDepartment edFunctionDepartment";
	private static final String _SQL_COUNT_EDFUNCTIONDEPARTMENT_WHERE = "SELECT COUNT(edFunctionDepartment) FROM EDFunctionDepartment edFunctionDepartment WHERE ";
	private static final String _FINDER_COLUMN_FUNCTIONID_FUNCTIONID_2 = "edFunctionDepartment.functionId = ?";
	private static final String _FINDER_COLUMN_DEPARTMENTID_DEPARTMENTID_2 = "edFunctionDepartment.departmentId = ?";
	private static final String _ORDER_BY_ENTITY_ALIAS = "edFunctionDepartment.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No EDFunctionDepartment exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No EDFunctionDepartment exists with the key {";
	private static Log _log = LogFactoryUtil.getLog(EDFunctionDepartmentPersistenceImpl.class);
}