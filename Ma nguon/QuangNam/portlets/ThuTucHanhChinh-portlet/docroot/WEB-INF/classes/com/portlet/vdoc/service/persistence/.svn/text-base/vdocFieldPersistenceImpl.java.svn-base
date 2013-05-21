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

package com.portlet.vdoc.service.persistence;

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

import com.portlet.vdoc.NoSuchvdocFieldException;
import com.portlet.vdoc.model.impl.vdocFieldImpl;
import com.portlet.vdoc.model.impl.vdocFieldModelImpl;
import com.portlet.vdoc.model.vdocField;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The persistence implementation for the vdoc field service.
 *
 * <p>
 * Never modify or reference this class directly. Always use {@link vdocFieldUtil} to access the vdoc field persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
 * </p>
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author vinhnt
 * @see vdocFieldPersistence
 * @see vdocFieldUtil
 * @generated
 */
public class vdocFieldPersistenceImpl extends BasePersistenceImpl<vdocField>
	implements vdocFieldPersistence {
	public static final String FINDER_CLASS_NAME_ENTITY = vdocFieldImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST = FINDER_CLASS_NAME_ENTITY +
		".List";
	public static final FinderPath FINDER_PATH_FIND_BY_PARENTID = new FinderPath(vdocFieldModelImpl.ENTITY_CACHE_ENABLED,
			vdocFieldModelImpl.FINDER_CACHE_ENABLED, FINDER_CLASS_NAME_LIST,
			"findByParentId",
			new String[] {
				String.class.getName(),
				
			"java.lang.Integer", "java.lang.Integer",
				"com.liferay.portal.kernel.util.OrderByComparator"
			});
	public static final FinderPath FINDER_PATH_COUNT_BY_PARENTID = new FinderPath(vdocFieldModelImpl.ENTITY_CACHE_ENABLED,
			vdocFieldModelImpl.FINDER_CACHE_ENABLED, FINDER_CLASS_NAME_LIST,
			"countByParentId", new String[] { String.class.getName() });
	public static final FinderPath FINDER_PATH_FIND_BY_G_L = new FinderPath(vdocFieldModelImpl.ENTITY_CACHE_ENABLED,
			vdocFieldModelImpl.FINDER_CACHE_ENABLED, FINDER_CLASS_NAME_LIST,
			"findByG_L",
			new String[] {
				Long.class.getName(), String.class.getName(),
				
			"java.lang.Integer", "java.lang.Integer",
				"com.liferay.portal.kernel.util.OrderByComparator"
			});
	public static final FinderPath FINDER_PATH_COUNT_BY_G_L = new FinderPath(vdocFieldModelImpl.ENTITY_CACHE_ENABLED,
			vdocFieldModelImpl.FINDER_CACHE_ENABLED, FINDER_CLASS_NAME_LIST,
			"countByG_L",
			new String[] { Long.class.getName(), String.class.getName() });
	public static final FinderPath FINDER_PATH_FIND_BY_G_L_P = new FinderPath(vdocFieldModelImpl.ENTITY_CACHE_ENABLED,
			vdocFieldModelImpl.FINDER_CACHE_ENABLED, FINDER_CLASS_NAME_LIST,
			"findByG_L_P",
			new String[] {
				Long.class.getName(), String.class.getName(),
				String.class.getName(),
				
			"java.lang.Integer", "java.lang.Integer",
				"com.liferay.portal.kernel.util.OrderByComparator"
			});
	public static final FinderPath FINDER_PATH_COUNT_BY_G_L_P = new FinderPath(vdocFieldModelImpl.ENTITY_CACHE_ENABLED,
			vdocFieldModelImpl.FINDER_CACHE_ENABLED, FINDER_CLASS_NAME_LIST,
			"countByG_L_P",
			new String[] {
				Long.class.getName(), String.class.getName(),
				String.class.getName()
			});
	public static final FinderPath FINDER_PATH_FIND_ALL = new FinderPath(vdocFieldModelImpl.ENTITY_CACHE_ENABLED,
			vdocFieldModelImpl.FINDER_CACHE_ENABLED, FINDER_CLASS_NAME_LIST,
			"findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(vdocFieldModelImpl.ENTITY_CACHE_ENABLED,
			vdocFieldModelImpl.FINDER_CACHE_ENABLED, FINDER_CLASS_NAME_LIST,
			"countAll", new String[0]);

	/**
	 * Caches the vdoc field in the entity cache if it is enabled.
	 *
	 * @param vdocField the vdoc field to cache
	 */
	public void cacheResult(vdocField vdocField) {
		EntityCacheUtil.putResult(vdocFieldModelImpl.ENTITY_CACHE_ENABLED,
			vdocFieldImpl.class, vdocField.getPrimaryKey(), vdocField);
	}

	/**
	 * Caches the vdoc fields in the entity cache if it is enabled.
	 *
	 * @param vdocFields the vdoc fields to cache
	 */
	public void cacheResult(List<vdocField> vdocFields) {
		for (vdocField vdocField : vdocFields) {
			if (EntityCacheUtil.getResult(
						vdocFieldModelImpl.ENTITY_CACHE_ENABLED,
						vdocFieldImpl.class, vdocField.getPrimaryKey(), this) == null) {
				cacheResult(vdocField);
			}
		}
	}

	/**
	 * Clears the cache for all vdoc fields.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	public void clearCache() {
		CacheRegistryUtil.clear(vdocFieldImpl.class.getName());
		EntityCacheUtil.clearCache(vdocFieldImpl.class.getName());
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST);
	}

	/**
	 * Clears the cache for the vdoc field.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	public void clearCache(vdocField vdocField) {
		EntityCacheUtil.removeResult(vdocFieldModelImpl.ENTITY_CACHE_ENABLED,
			vdocFieldImpl.class, vdocField.getPrimaryKey());
	}

	/**
	 * Creates a new vdoc field with the primary key. Does not add the vdoc field to the database.
	 *
	 * @param fieldId the primary key for the new vdoc field
	 * @return the new vdoc field
	 */
	public vdocField create(String fieldId) {
		vdocField vdocField = new vdocFieldImpl();

		vdocField.setNew(true);
		vdocField.setPrimaryKey(fieldId);

		return vdocField;
	}

	/**
	 * Removes the vdoc field with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the vdoc field to remove
	 * @return the vdoc field that was removed
	 * @throws com.liferay.portal.NoSuchModelException if a vdoc field with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public vdocField remove(Serializable primaryKey)
		throws NoSuchModelException, SystemException {
		return remove((String)primaryKey);
	}

	/**
	 * Removes the vdoc field with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param fieldId the primary key of the vdoc field to remove
	 * @return the vdoc field that was removed
	 * @throws com.portlet.vdoc.NoSuchvdocFieldException if a vdoc field with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public vdocField remove(String fieldId)
		throws NoSuchvdocFieldException, SystemException {
		Session session = null;

		try {
			session = openSession();

			vdocField vdocField = (vdocField)session.get(vdocFieldImpl.class,
					fieldId);

			if (vdocField == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + fieldId);
				}

				throw new NoSuchvdocFieldException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					fieldId);
			}

			return remove(vdocField);
		}
		catch (NoSuchvdocFieldException nsee) {
			throw nsee;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected vdocField removeImpl(vdocField vdocField)
		throws SystemException {
		vdocField = toUnwrappedModel(vdocField);

		Session session = null;

		try {
			session = openSession();

			BatchSessionUtil.delete(session, vdocField);
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST);

		EntityCacheUtil.removeResult(vdocFieldModelImpl.ENTITY_CACHE_ENABLED,
			vdocFieldImpl.class, vdocField.getPrimaryKey());

		return vdocField;
	}

	public vdocField updateImpl(com.portlet.vdoc.model.vdocField vdocField,
		boolean merge) throws SystemException {
		vdocField = toUnwrappedModel(vdocField);

		Session session = null;

		try {
			session = openSession();

			BatchSessionUtil.update(session, vdocField, merge);

			vdocField.setNew(false);
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST);

		EntityCacheUtil.putResult(vdocFieldModelImpl.ENTITY_CACHE_ENABLED,
			vdocFieldImpl.class, vdocField.getPrimaryKey(), vdocField);

		return vdocField;
	}

	protected vdocField toUnwrappedModel(vdocField vdocField) {
		if (vdocField instanceof vdocFieldImpl) {
			return vdocField;
		}

		vdocFieldImpl vdocFieldImpl = new vdocFieldImpl();

		vdocFieldImpl.setNew(vdocField.isNew());
		vdocFieldImpl.setPrimaryKey(vdocField.getPrimaryKey());

		vdocFieldImpl.setFieldId(vdocField.getFieldId());
		vdocFieldImpl.setGroupId(vdocField.getGroupId());
		vdocFieldImpl.setCompanyId(vdocField.getCompanyId());
		vdocFieldImpl.setUserId(vdocField.getUserId());
		vdocFieldImpl.setCreatedDate(vdocField.getCreatedDate());
		vdocFieldImpl.setModifiedDate(vdocField.getModifiedDate());
		vdocFieldImpl.setCreatedByUser(vdocField.getCreatedByUser());
		vdocFieldImpl.setModifiedByUser(vdocField.getModifiedByUser());
		vdocFieldImpl.setParentId(vdocField.getParentId());
		vdocFieldImpl.setName(vdocField.getName());
		vdocFieldImpl.setDescription(vdocField.getDescription());
		vdocFieldImpl.setLanguage(vdocField.getLanguage());
		vdocFieldImpl.setStatusField(vdocField.isStatusField());
		vdocFieldImpl.setPosition(vdocField.getPosition());
		vdocFieldImpl.setListparent(vdocField.getListparent());

		return vdocFieldImpl;
	}

	/**
	 * Finds the vdoc field with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the vdoc field to find
	 * @return the vdoc field
	 * @throws com.liferay.portal.NoSuchModelException if a vdoc field with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public vdocField findByPrimaryKey(Serializable primaryKey)
		throws NoSuchModelException, SystemException {
		return findByPrimaryKey((String)primaryKey);
	}

	/**
	 * Finds the vdoc field with the primary key or throws a {@link com.portlet.vdoc.NoSuchvdocFieldException} if it could not be found.
	 *
	 * @param fieldId the primary key of the vdoc field to find
	 * @return the vdoc field
	 * @throws com.portlet.vdoc.NoSuchvdocFieldException if a vdoc field with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public vdocField findByPrimaryKey(String fieldId)
		throws NoSuchvdocFieldException, SystemException {
		vdocField vdocField = fetchByPrimaryKey(fieldId);

		if (vdocField == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + fieldId);
			}

			throw new NoSuchvdocFieldException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				fieldId);
		}

		return vdocField;
	}

	/**
	 * Finds the vdoc field with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the vdoc field to find
	 * @return the vdoc field, or <code>null</code> if a vdoc field with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public vdocField fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		return fetchByPrimaryKey((String)primaryKey);
	}

	/**
	 * Finds the vdoc field with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param fieldId the primary key of the vdoc field to find
	 * @return the vdoc field, or <code>null</code> if a vdoc field with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public vdocField fetchByPrimaryKey(String fieldId)
		throws SystemException {
		vdocField vdocField = (vdocField)EntityCacheUtil.getResult(vdocFieldModelImpl.ENTITY_CACHE_ENABLED,
				vdocFieldImpl.class, fieldId, this);

		if (vdocField == null) {
			Session session = null;

			try {
				session = openSession();

				vdocField = (vdocField)session.get(vdocFieldImpl.class, fieldId);
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (vdocField != null) {
					cacheResult(vdocField);
				}

				closeSession(session);
			}
		}

		return vdocField;
	}

	/**
	 * Finds all the vdoc fields where parentId = &#63;.
	 *
	 * @param parentId the parent id to search with
	 * @return the matching vdoc fields
	 * @throws SystemException if a system exception occurred
	 */
	public List<vdocField> findByParentId(String parentId)
		throws SystemException {
		return findByParentId(parentId, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
			null);
	}

	/**
	 * Finds a range of all the vdoc fields where parentId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param parentId the parent id to search with
	 * @param start the lower bound of the range of vdoc fields to return
	 * @param end the upper bound of the range of vdoc fields to return (not inclusive)
	 * @return the range of matching vdoc fields
	 * @throws SystemException if a system exception occurred
	 */
	public List<vdocField> findByParentId(String parentId, int start, int end)
		throws SystemException {
		return findByParentId(parentId, start, end, null);
	}

	/**
	 * Finds an ordered range of all the vdoc fields where parentId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param parentId the parent id to search with
	 * @param start the lower bound of the range of vdoc fields to return
	 * @param end the upper bound of the range of vdoc fields to return (not inclusive)
	 * @param orderByComparator the comparator to order the results by
	 * @return the ordered range of matching vdoc fields
	 * @throws SystemException if a system exception occurred
	 */
	public List<vdocField> findByParentId(String parentId, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		Object[] finderArgs = new Object[] {
				parentId,
				
				String.valueOf(start), String.valueOf(end),
				String.valueOf(orderByComparator)
			};

		List<vdocField> list = (List<vdocField>)FinderCacheUtil.getResult(FINDER_PATH_FIND_BY_PARENTID,
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

			query.append(_SQL_SELECT_VDOCFIELD_WHERE);

			if (parentId == null) {
				query.append(_FINDER_COLUMN_PARENTID_PARENTID_1);
			}
			else {
				if (parentId.equals(StringPool.BLANK)) {
					query.append(_FINDER_COLUMN_PARENTID_PARENTID_3);
				}
				else {
					query.append(_FINDER_COLUMN_PARENTID_PARENTID_2);
				}
			}

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}

			else {
				query.append(vdocFieldModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (parentId != null) {
					qPos.add(parentId);
				}

				list = (List<vdocField>)QueryUtil.list(q, getDialect(), start,
						end);
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (list == null) {
					FinderCacheUtil.removeResult(FINDER_PATH_FIND_BY_PARENTID,
						finderArgs);
				}
				else {
					cacheResult(list);

					FinderCacheUtil.putResult(FINDER_PATH_FIND_BY_PARENTID,
						finderArgs, list);
				}

				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Finds the first vdoc field in the ordered set where parentId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param parentId the parent id to search with
	 * @param orderByComparator the comparator to order the set by
	 * @return the first matching vdoc field
	 * @throws com.portlet.vdoc.NoSuchvdocFieldException if a matching vdoc field could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public vdocField findByParentId_First(String parentId,
		OrderByComparator orderByComparator)
		throws NoSuchvdocFieldException, SystemException {
		List<vdocField> list = findByParentId(parentId, 0, 1, orderByComparator);

		if (list.isEmpty()) {
			StringBundler msg = new StringBundler(4);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("parentId=");
			msg.append(parentId);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			throw new NoSuchvdocFieldException(msg.toString());
		}
		else {
			return list.get(0);
		}
	}

	/**
	 * Finds the last vdoc field in the ordered set where parentId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param parentId the parent id to search with
	 * @param orderByComparator the comparator to order the set by
	 * @return the last matching vdoc field
	 * @throws com.portlet.vdoc.NoSuchvdocFieldException if a matching vdoc field could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public vdocField findByParentId_Last(String parentId,
		OrderByComparator orderByComparator)
		throws NoSuchvdocFieldException, SystemException {
		int count = countByParentId(parentId);

		List<vdocField> list = findByParentId(parentId, count - 1, count,
				orderByComparator);

		if (list.isEmpty()) {
			StringBundler msg = new StringBundler(4);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("parentId=");
			msg.append(parentId);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			throw new NoSuchvdocFieldException(msg.toString());
		}
		else {
			return list.get(0);
		}
	}

	/**
	 * Finds the vdoc fields before and after the current vdoc field in the ordered set where parentId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param fieldId the primary key of the current vdoc field
	 * @param parentId the parent id to search with
	 * @param orderByComparator the comparator to order the set by
	 * @return the previous, current, and next vdoc field
	 * @throws com.portlet.vdoc.NoSuchvdocFieldException if a vdoc field with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public vdocField[] findByParentId_PrevAndNext(String fieldId,
		String parentId, OrderByComparator orderByComparator)
		throws NoSuchvdocFieldException, SystemException {
		vdocField vdocField = findByPrimaryKey(fieldId);

		Session session = null;

		try {
			session = openSession();

			vdocField[] array = new vdocFieldImpl[3];

			array[0] = getByParentId_PrevAndNext(session, vdocField, parentId,
					orderByComparator, true);

			array[1] = vdocField;

			array[2] = getByParentId_PrevAndNext(session, vdocField, parentId,
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

	protected vdocField getByParentId_PrevAndNext(Session session,
		vdocField vdocField, String parentId,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_VDOCFIELD_WHERE);

		if (parentId == null) {
			query.append(_FINDER_COLUMN_PARENTID_PARENTID_1);
		}
		else {
			if (parentId.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_PARENTID_PARENTID_3);
			}
			else {
				query.append(_FINDER_COLUMN_PARENTID_PARENTID_2);
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
			query.append(vdocFieldModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		if (parentId != null) {
			qPos.add(parentId);
		}

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByValues(vdocField);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<vdocField> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Finds all the vdoc fields where groupId = &#63; and language = &#63;.
	 *
	 * @param groupId the group id to search with
	 * @param language the language to search with
	 * @return the matching vdoc fields
	 * @throws SystemException if a system exception occurred
	 */
	public List<vdocField> findByG_L(long groupId, String language)
		throws SystemException {
		return findByG_L(groupId, language, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Finds a range of all the vdoc fields where groupId = &#63; and language = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param groupId the group id to search with
	 * @param language the language to search with
	 * @param start the lower bound of the range of vdoc fields to return
	 * @param end the upper bound of the range of vdoc fields to return (not inclusive)
	 * @return the range of matching vdoc fields
	 * @throws SystemException if a system exception occurred
	 */
	public List<vdocField> findByG_L(long groupId, String language, int start,
		int end) throws SystemException {
		return findByG_L(groupId, language, start, end, null);
	}

	/**
	 * Finds an ordered range of all the vdoc fields where groupId = &#63; and language = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param groupId the group id to search with
	 * @param language the language to search with
	 * @param start the lower bound of the range of vdoc fields to return
	 * @param end the upper bound of the range of vdoc fields to return (not inclusive)
	 * @param orderByComparator the comparator to order the results by
	 * @return the ordered range of matching vdoc fields
	 * @throws SystemException if a system exception occurred
	 */
	public List<vdocField> findByG_L(long groupId, String language, int start,
		int end, OrderByComparator orderByComparator) throws SystemException {
		Object[] finderArgs = new Object[] {
				groupId, language,
				
				String.valueOf(start), String.valueOf(end),
				String.valueOf(orderByComparator)
			};

		List<vdocField> list = (List<vdocField>)FinderCacheUtil.getResult(FINDER_PATH_FIND_BY_G_L,
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

			query.append(_SQL_SELECT_VDOCFIELD_WHERE);

			query.append(_FINDER_COLUMN_G_L_GROUPID_2);

			if (language == null) {
				query.append(_FINDER_COLUMN_G_L_LANGUAGE_1);
			}
			else {
				if (language.equals(StringPool.BLANK)) {
					query.append(_FINDER_COLUMN_G_L_LANGUAGE_3);
				}
				else {
					query.append(_FINDER_COLUMN_G_L_LANGUAGE_2);
				}
			}

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}

			else {
				query.append(vdocFieldModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(groupId);

				if (language != null) {
					qPos.add(language);
				}

				list = (List<vdocField>)QueryUtil.list(q, getDialect(), start,
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
	 * Finds the first vdoc field in the ordered set where groupId = &#63; and language = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param groupId the group id to search with
	 * @param language the language to search with
	 * @param orderByComparator the comparator to order the set by
	 * @return the first matching vdoc field
	 * @throws com.portlet.vdoc.NoSuchvdocFieldException if a matching vdoc field could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public vdocField findByG_L_First(long groupId, String language,
		OrderByComparator orderByComparator)
		throws NoSuchvdocFieldException, SystemException {
		List<vdocField> list = findByG_L(groupId, language, 0, 1,
				orderByComparator);

		if (list.isEmpty()) {
			StringBundler msg = new StringBundler(6);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("groupId=");
			msg.append(groupId);

			msg.append(", language=");
			msg.append(language);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			throw new NoSuchvdocFieldException(msg.toString());
		}
		else {
			return list.get(0);
		}
	}

	/**
	 * Finds the last vdoc field in the ordered set where groupId = &#63; and language = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param groupId the group id to search with
	 * @param language the language to search with
	 * @param orderByComparator the comparator to order the set by
	 * @return the last matching vdoc field
	 * @throws com.portlet.vdoc.NoSuchvdocFieldException if a matching vdoc field could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public vdocField findByG_L_Last(long groupId, String language,
		OrderByComparator orderByComparator)
		throws NoSuchvdocFieldException, SystemException {
		int count = countByG_L(groupId, language);

		List<vdocField> list = findByG_L(groupId, language, count - 1, count,
				orderByComparator);

		if (list.isEmpty()) {
			StringBundler msg = new StringBundler(6);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("groupId=");
			msg.append(groupId);

			msg.append(", language=");
			msg.append(language);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			throw new NoSuchvdocFieldException(msg.toString());
		}
		else {
			return list.get(0);
		}
	}

	/**
	 * Finds the vdoc fields before and after the current vdoc field in the ordered set where groupId = &#63; and language = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param fieldId the primary key of the current vdoc field
	 * @param groupId the group id to search with
	 * @param language the language to search with
	 * @param orderByComparator the comparator to order the set by
	 * @return the previous, current, and next vdoc field
	 * @throws com.portlet.vdoc.NoSuchvdocFieldException if a vdoc field with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public vdocField[] findByG_L_PrevAndNext(String fieldId, long groupId,
		String language, OrderByComparator orderByComparator)
		throws NoSuchvdocFieldException, SystemException {
		vdocField vdocField = findByPrimaryKey(fieldId);

		Session session = null;

		try {
			session = openSession();

			vdocField[] array = new vdocFieldImpl[3];

			array[0] = getByG_L_PrevAndNext(session, vdocField, groupId,
					language, orderByComparator, true);

			array[1] = vdocField;

			array[2] = getByG_L_PrevAndNext(session, vdocField, groupId,
					language, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected vdocField getByG_L_PrevAndNext(Session session,
		vdocField vdocField, long groupId, String language,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_VDOCFIELD_WHERE);

		query.append(_FINDER_COLUMN_G_L_GROUPID_2);

		if (language == null) {
			query.append(_FINDER_COLUMN_G_L_LANGUAGE_1);
		}
		else {
			if (language.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_G_L_LANGUAGE_3);
			}
			else {
				query.append(_FINDER_COLUMN_G_L_LANGUAGE_2);
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
			query.append(vdocFieldModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(groupId);

		if (language != null) {
			qPos.add(language);
		}

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByValues(vdocField);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<vdocField> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Finds all the vdoc fields where groupId = &#63; and language = &#63; and parentId = &#63;.
	 *
	 * @param groupId the group id to search with
	 * @param language the language to search with
	 * @param parentId the parent id to search with
	 * @return the matching vdoc fields
	 * @throws SystemException if a system exception occurred
	 */
	public List<vdocField> findByG_L_P(long groupId, String language,
		String parentId) throws SystemException {
		return findByG_L_P(groupId, language, parentId, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Finds a range of all the vdoc fields where groupId = &#63; and language = &#63; and parentId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param groupId the group id to search with
	 * @param language the language to search with
	 * @param parentId the parent id to search with
	 * @param start the lower bound of the range of vdoc fields to return
	 * @param end the upper bound of the range of vdoc fields to return (not inclusive)
	 * @return the range of matching vdoc fields
	 * @throws SystemException if a system exception occurred
	 */
	public List<vdocField> findByG_L_P(long groupId, String language,
		String parentId, int start, int end) throws SystemException {
		return findByG_L_P(groupId, language, parentId, start, end, null);
	}

	/**
	 * Finds an ordered range of all the vdoc fields where groupId = &#63; and language = &#63; and parentId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param groupId the group id to search with
	 * @param language the language to search with
	 * @param parentId the parent id to search with
	 * @param start the lower bound of the range of vdoc fields to return
	 * @param end the upper bound of the range of vdoc fields to return (not inclusive)
	 * @param orderByComparator the comparator to order the results by
	 * @return the ordered range of matching vdoc fields
	 * @throws SystemException if a system exception occurred
	 */
	public List<vdocField> findByG_L_P(long groupId, String language,
		String parentId, int start, int end, OrderByComparator orderByComparator)
		throws SystemException {
		Object[] finderArgs = new Object[] {
				groupId, language, parentId,
				
				String.valueOf(start), String.valueOf(end),
				String.valueOf(orderByComparator)
			};

		List<vdocField> list = (List<vdocField>)FinderCacheUtil.getResult(FINDER_PATH_FIND_BY_G_L_P,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;

			if (orderByComparator != null) {
				query = new StringBundler(5 +
						(orderByComparator.getOrderByFields().length * 3));
			}
			else {
				query = new StringBundler(5);
			}

			query.append(_SQL_SELECT_VDOCFIELD_WHERE);

			query.append(_FINDER_COLUMN_G_L_P_GROUPID_2);

			if (language == null) {
				query.append(_FINDER_COLUMN_G_L_P_LANGUAGE_1);
			}
			else {
				if (language.equals(StringPool.BLANK)) {
					query.append(_FINDER_COLUMN_G_L_P_LANGUAGE_3);
				}
				else {
					query.append(_FINDER_COLUMN_G_L_P_LANGUAGE_2);
				}
			}

			if (parentId == null) {
				query.append(_FINDER_COLUMN_G_L_P_PARENTID_1);
			}
			else {
				if (parentId.equals(StringPool.BLANK)) {
					query.append(_FINDER_COLUMN_G_L_P_PARENTID_3);
				}
				else {
					query.append(_FINDER_COLUMN_G_L_P_PARENTID_2);
				}
			}

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}

			else {
				query.append(vdocFieldModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(groupId);

				if (language != null) {
					qPos.add(language);
				}

				if (parentId != null) {
					qPos.add(parentId);
				}

				list = (List<vdocField>)QueryUtil.list(q, getDialect(), start,
						end);
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (list == null) {
					FinderCacheUtil.removeResult(FINDER_PATH_FIND_BY_G_L_P,
						finderArgs);
				}
				else {
					cacheResult(list);

					FinderCacheUtil.putResult(FINDER_PATH_FIND_BY_G_L_P,
						finderArgs, list);
				}

				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Finds the first vdoc field in the ordered set where groupId = &#63; and language = &#63; and parentId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param groupId the group id to search with
	 * @param language the language to search with
	 * @param parentId the parent id to search with
	 * @param orderByComparator the comparator to order the set by
	 * @return the first matching vdoc field
	 * @throws com.portlet.vdoc.NoSuchvdocFieldException if a matching vdoc field could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public vdocField findByG_L_P_First(long groupId, String language,
		String parentId, OrderByComparator orderByComparator)
		throws NoSuchvdocFieldException, SystemException {
		List<vdocField> list = findByG_L_P(groupId, language, parentId, 0, 1,
				orderByComparator);

		if (list.isEmpty()) {
			StringBundler msg = new StringBundler(8);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("groupId=");
			msg.append(groupId);

			msg.append(", language=");
			msg.append(language);

			msg.append(", parentId=");
			msg.append(parentId);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			throw new NoSuchvdocFieldException(msg.toString());
		}
		else {
			return list.get(0);
		}
	}

	/**
	 * Finds the last vdoc field in the ordered set where groupId = &#63; and language = &#63; and parentId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param groupId the group id to search with
	 * @param language the language to search with
	 * @param parentId the parent id to search with
	 * @param orderByComparator the comparator to order the set by
	 * @return the last matching vdoc field
	 * @throws com.portlet.vdoc.NoSuchvdocFieldException if a matching vdoc field could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public vdocField findByG_L_P_Last(long groupId, String language,
		String parentId, OrderByComparator orderByComparator)
		throws NoSuchvdocFieldException, SystemException {
		int count = countByG_L_P(groupId, language, parentId);

		List<vdocField> list = findByG_L_P(groupId, language, parentId,
				count - 1, count, orderByComparator);

		if (list.isEmpty()) {
			StringBundler msg = new StringBundler(8);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("groupId=");
			msg.append(groupId);

			msg.append(", language=");
			msg.append(language);

			msg.append(", parentId=");
			msg.append(parentId);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			throw new NoSuchvdocFieldException(msg.toString());
		}
		else {
			return list.get(0);
		}
	}

	/**
	 * Finds the vdoc fields before and after the current vdoc field in the ordered set where groupId = &#63; and language = &#63; and parentId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param fieldId the primary key of the current vdoc field
	 * @param groupId the group id to search with
	 * @param language the language to search with
	 * @param parentId the parent id to search with
	 * @param orderByComparator the comparator to order the set by
	 * @return the previous, current, and next vdoc field
	 * @throws com.portlet.vdoc.NoSuchvdocFieldException if a vdoc field with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public vdocField[] findByG_L_P_PrevAndNext(String fieldId, long groupId,
		String language, String parentId, OrderByComparator orderByComparator)
		throws NoSuchvdocFieldException, SystemException {
		vdocField vdocField = findByPrimaryKey(fieldId);

		Session session = null;

		try {
			session = openSession();

			vdocField[] array = new vdocFieldImpl[3];

			array[0] = getByG_L_P_PrevAndNext(session, vdocField, groupId,
					language, parentId, orderByComparator, true);

			array[1] = vdocField;

			array[2] = getByG_L_P_PrevAndNext(session, vdocField, groupId,
					language, parentId, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected vdocField getByG_L_P_PrevAndNext(Session session,
		vdocField vdocField, long groupId, String language, String parentId,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_VDOCFIELD_WHERE);

		query.append(_FINDER_COLUMN_G_L_P_GROUPID_2);

		if (language == null) {
			query.append(_FINDER_COLUMN_G_L_P_LANGUAGE_1);
		}
		else {
			if (language.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_G_L_P_LANGUAGE_3);
			}
			else {
				query.append(_FINDER_COLUMN_G_L_P_LANGUAGE_2);
			}
		}

		if (parentId == null) {
			query.append(_FINDER_COLUMN_G_L_P_PARENTID_1);
		}
		else {
			if (parentId.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_G_L_P_PARENTID_3);
			}
			else {
				query.append(_FINDER_COLUMN_G_L_P_PARENTID_2);
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
			query.append(vdocFieldModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(groupId);

		if (language != null) {
			qPos.add(language);
		}

		if (parentId != null) {
			qPos.add(parentId);
		}

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByValues(vdocField);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<vdocField> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Finds all the vdoc fields.
	 *
	 * @return the vdoc fields
	 * @throws SystemException if a system exception occurred
	 */
	public List<vdocField> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Finds a range of all the vdoc fields.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param start the lower bound of the range of vdoc fields to return
	 * @param end the upper bound of the range of vdoc fields to return (not inclusive)
	 * @return the range of vdoc fields
	 * @throws SystemException if a system exception occurred
	 */
	public List<vdocField> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Finds an ordered range of all the vdoc fields.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param start the lower bound of the range of vdoc fields to return
	 * @param end the upper bound of the range of vdoc fields to return (not inclusive)
	 * @param orderByComparator the comparator to order the results by
	 * @return the ordered range of vdoc fields
	 * @throws SystemException if a system exception occurred
	 */
	public List<vdocField> findAll(int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		Object[] finderArgs = new Object[] {
				String.valueOf(start), String.valueOf(end),
				String.valueOf(orderByComparator)
			};

		List<vdocField> list = (List<vdocField>)FinderCacheUtil.getResult(FINDER_PATH_FIND_ALL,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_VDOCFIELD);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_VDOCFIELD.concat(vdocFieldModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (orderByComparator == null) {
					list = (List<vdocField>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);
				}
				else {
					list = (List<vdocField>)QueryUtil.list(q, getDialect(),
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
	 * Removes all the vdoc fields where parentId = &#63; from the database.
	 *
	 * @param parentId the parent id to search with
	 * @throws SystemException if a system exception occurred
	 */
	public void removeByParentId(String parentId) throws SystemException {
		for (vdocField vdocField : findByParentId(parentId)) {
			remove(vdocField);
		}
	}

	/**
	 * Removes all the vdoc fields where groupId = &#63; and language = &#63; from the database.
	 *
	 * @param groupId the group id to search with
	 * @param language the language to search with
	 * @throws SystemException if a system exception occurred
	 */
	public void removeByG_L(long groupId, String language)
		throws SystemException {
		for (vdocField vdocField : findByG_L(groupId, language)) {
			remove(vdocField);
		}
	}

	/**
	 * Removes all the vdoc fields where groupId = &#63; and language = &#63; and parentId = &#63; from the database.
	 *
	 * @param groupId the group id to search with
	 * @param language the language to search with
	 * @param parentId the parent id to search with
	 * @throws SystemException if a system exception occurred
	 */
	public void removeByG_L_P(long groupId, String language, String parentId)
		throws SystemException {
		for (vdocField vdocField : findByG_L_P(groupId, language, parentId)) {
			remove(vdocField);
		}
	}

	/**
	 * Removes all the vdoc fields from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	public void removeAll() throws SystemException {
		for (vdocField vdocField : findAll()) {
			remove(vdocField);
		}
	}

	/**
	 * Counts all the vdoc fields where parentId = &#63;.
	 *
	 * @param parentId the parent id to search with
	 * @return the number of matching vdoc fields
	 * @throws SystemException if a system exception occurred
	 */
	public int countByParentId(String parentId) throws SystemException {
		Object[] finderArgs = new Object[] { parentId };

		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_BY_PARENTID,
				finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_VDOCFIELD_WHERE);

			if (parentId == null) {
				query.append(_FINDER_COLUMN_PARENTID_PARENTID_1);
			}
			else {
				if (parentId.equals(StringPool.BLANK)) {
					query.append(_FINDER_COLUMN_PARENTID_PARENTID_3);
				}
				else {
					query.append(_FINDER_COLUMN_PARENTID_PARENTID_2);
				}
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (parentId != null) {
					qPos.add(parentId);
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

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_PARENTID,
					finderArgs, count);

				closeSession(session);
			}
		}

		return count.intValue();
	}

	/**
	 * Counts all the vdoc fields where groupId = &#63; and language = &#63;.
	 *
	 * @param groupId the group id to search with
	 * @param language the language to search with
	 * @return the number of matching vdoc fields
	 * @throws SystemException if a system exception occurred
	 */
	public int countByG_L(long groupId, String language)
		throws SystemException {
		Object[] finderArgs = new Object[] { groupId, language };

		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_BY_G_L,
				finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_VDOCFIELD_WHERE);

			query.append(_FINDER_COLUMN_G_L_GROUPID_2);

			if (language == null) {
				query.append(_FINDER_COLUMN_G_L_LANGUAGE_1);
			}
			else {
				if (language.equals(StringPool.BLANK)) {
					query.append(_FINDER_COLUMN_G_L_LANGUAGE_3);
				}
				else {
					query.append(_FINDER_COLUMN_G_L_LANGUAGE_2);
				}
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(groupId);

				if (language != null) {
					qPos.add(language);
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
	 * Counts all the vdoc fields where groupId = &#63; and language = &#63; and parentId = &#63;.
	 *
	 * @param groupId the group id to search with
	 * @param language the language to search with
	 * @param parentId the parent id to search with
	 * @return the number of matching vdoc fields
	 * @throws SystemException if a system exception occurred
	 */
	public int countByG_L_P(long groupId, String language, String parentId)
		throws SystemException {
		Object[] finderArgs = new Object[] { groupId, language, parentId };

		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_BY_G_L_P,
				finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(4);

			query.append(_SQL_COUNT_VDOCFIELD_WHERE);

			query.append(_FINDER_COLUMN_G_L_P_GROUPID_2);

			if (language == null) {
				query.append(_FINDER_COLUMN_G_L_P_LANGUAGE_1);
			}
			else {
				if (language.equals(StringPool.BLANK)) {
					query.append(_FINDER_COLUMN_G_L_P_LANGUAGE_3);
				}
				else {
					query.append(_FINDER_COLUMN_G_L_P_LANGUAGE_2);
				}
			}

			if (parentId == null) {
				query.append(_FINDER_COLUMN_G_L_P_PARENTID_1);
			}
			else {
				if (parentId.equals(StringPool.BLANK)) {
					query.append(_FINDER_COLUMN_G_L_P_PARENTID_3);
				}
				else {
					query.append(_FINDER_COLUMN_G_L_P_PARENTID_2);
				}
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(groupId);

				if (language != null) {
					qPos.add(language);
				}

				if (parentId != null) {
					qPos.add(parentId);
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

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_G_L_P,
					finderArgs, count);

				closeSession(session);
			}
		}

		return count.intValue();
	}

	/**
	 * Counts all the vdoc fields.
	 *
	 * @return the number of vdoc fields
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

				Query q = session.createQuery(_SQL_COUNT_VDOCFIELD);

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
	 * Initializes the vdoc field persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.com.portlet.vdoc.model.vdocField")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<vdocField>> listenersList = new ArrayList<ModelListener<vdocField>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<vdocField>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(vdocFieldImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST);
	}

	@BeanReference(type = vdocDocumentPersistence.class)
	protected vdocDocumentPersistence vdocDocumentPersistence;
	@BeanReference(type = vdocFieldPersistence.class)
	protected vdocFieldPersistence vdocFieldPersistence;
	@BeanReference(type = vdocOrgPersistence.class)
	protected vdocOrgPersistence vdocOrgPersistence;
	@BeanReference(type = vdocDORelPersistence.class)
	protected vdocDORelPersistence vdocDORelPersistence;
	@BeanReference(type = vdocLoggerPersistence.class)
	protected vdocLoggerPersistence vdocLoggerPersistence;
	@BeanReference(type = ResourcePersistence.class)
	protected ResourcePersistence resourcePersistence;
	@BeanReference(type = UserPersistence.class)
	protected UserPersistence userPersistence;
	private static final String _SQL_SELECT_VDOCFIELD = "SELECT vdocField FROM vdocField vdocField";
	private static final String _SQL_SELECT_VDOCFIELD_WHERE = "SELECT vdocField FROM vdocField vdocField WHERE ";
	private static final String _SQL_COUNT_VDOCFIELD = "SELECT COUNT(vdocField) FROM vdocField vdocField";
	private static final String _SQL_COUNT_VDOCFIELD_WHERE = "SELECT COUNT(vdocField) FROM vdocField vdocField WHERE ";
	private static final String _FINDER_COLUMN_PARENTID_PARENTID_1 = "vdocField.parentId IS NULL";
	private static final String _FINDER_COLUMN_PARENTID_PARENTID_2 = "vdocField.parentId = ?";
	private static final String _FINDER_COLUMN_PARENTID_PARENTID_3 = "(vdocField.parentId IS NULL OR vdocField.parentId = ?)";
	private static final String _FINDER_COLUMN_G_L_GROUPID_2 = "vdocField.groupId = ? AND ";
	private static final String _FINDER_COLUMN_G_L_LANGUAGE_1 = "vdocField.language IS NULL";
	private static final String _FINDER_COLUMN_G_L_LANGUAGE_2 = "vdocField.language = ?";
	private static final String _FINDER_COLUMN_G_L_LANGUAGE_3 = "(vdocField.language IS NULL OR vdocField.language = ?)";
	private static final String _FINDER_COLUMN_G_L_P_GROUPID_2 = "vdocField.groupId = ? AND ";
	private static final String _FINDER_COLUMN_G_L_P_LANGUAGE_1 = "vdocField.language IS NULL AND ";
	private static final String _FINDER_COLUMN_G_L_P_LANGUAGE_2 = "vdocField.language = ? AND ";
	private static final String _FINDER_COLUMN_G_L_P_LANGUAGE_3 = "(vdocField.language IS NULL OR vdocField.language = ?) AND ";
	private static final String _FINDER_COLUMN_G_L_P_PARENTID_1 = "vdocField.parentId IS NULL";
	private static final String _FINDER_COLUMN_G_L_P_PARENTID_2 = "vdocField.parentId = ?";
	private static final String _FINDER_COLUMN_G_L_P_PARENTID_3 = "(vdocField.parentId IS NULL OR vdocField.parentId = ?)";
	private static final String _ORDER_BY_ENTITY_ALIAS = "vdocField.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No vdocField exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No vdocField exists with the key {";
	private static Log _log = LogFactoryUtil.getLog(vdocFieldPersistenceImpl.class);
}