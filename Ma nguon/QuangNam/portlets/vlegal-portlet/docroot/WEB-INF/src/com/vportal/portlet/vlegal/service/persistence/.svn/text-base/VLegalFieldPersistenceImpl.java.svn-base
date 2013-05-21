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
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelListener;
import com.liferay.portal.service.persistence.BatchSessionUtil;
import com.liferay.portal.service.persistence.ResourcePersistence;
import com.liferay.portal.service.persistence.UserPersistence;
import com.liferay.portal.service.persistence.impl.BasePersistenceImpl;

import com.vportal.portlet.vlegal.NoSuchVLegalFieldException;
import com.vportal.portlet.vlegal.model.VLegalField;
import com.vportal.portlet.vlegal.model.impl.VLegalFieldImpl;
import com.vportal.portlet.vlegal.model.impl.VLegalFieldModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The persistence implementation for the v legal field service.
 *
 * <p>
 * Never modify or reference this class directly. Always use {@link VLegalFieldUtil} to access the v legal field persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
 * </p>
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author ACB
 * @see VLegalFieldPersistence
 * @see VLegalFieldUtil
 * @generated
 */
public class VLegalFieldPersistenceImpl extends BasePersistenceImpl<VLegalField>
	implements VLegalFieldPersistence {
	public static final String FINDER_CLASS_NAME_ENTITY = VLegalFieldImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST = FINDER_CLASS_NAME_ENTITY +
		".List";
	public static final FinderPath FINDER_PATH_FIND_BY_GROUPID = new FinderPath(VLegalFieldModelImpl.ENTITY_CACHE_ENABLED,
			VLegalFieldModelImpl.FINDER_CACHE_ENABLED, FINDER_CLASS_NAME_LIST,
			"findByGroupId",
			new String[] {
				Long.class.getName(),
				
			"java.lang.Integer", "java.lang.Integer",
				"com.liferay.portal.kernel.util.OrderByComparator"
			});
	public static final FinderPath FINDER_PATH_COUNT_BY_GROUPID = new FinderPath(VLegalFieldModelImpl.ENTITY_CACHE_ENABLED,
			VLegalFieldModelImpl.FINDER_CACHE_ENABLED, FINDER_CLASS_NAME_LIST,
			"countByGroupId", new String[] { Long.class.getName() });
	public static final FinderPath FINDER_PATH_FETCH_BY_G_F = new FinderPath(VLegalFieldModelImpl.ENTITY_CACHE_ENABLED,
			VLegalFieldModelImpl.FINDER_CACHE_ENABLED,
			FINDER_CLASS_NAME_ENTITY, "fetchByG_F",
			new String[] { Long.class.getName(), String.class.getName() });
	public static final FinderPath FINDER_PATH_COUNT_BY_G_F = new FinderPath(VLegalFieldModelImpl.ENTITY_CACHE_ENABLED,
			VLegalFieldModelImpl.FINDER_CACHE_ENABLED, FINDER_CLASS_NAME_LIST,
			"countByG_F",
			new String[] { Long.class.getName(), String.class.getName() });
	public static final FinderPath FINDER_PATH_FIND_BY_S_L = new FinderPath(VLegalFieldModelImpl.ENTITY_CACHE_ENABLED,
			VLegalFieldModelImpl.FINDER_CACHE_ENABLED, FINDER_CLASS_NAME_LIST,
			"findByS_L",
			new String[] {
				Long.class.getName(), Boolean.class.getName(),
				String.class.getName(),
				
			"java.lang.Integer", "java.lang.Integer",
				"com.liferay.portal.kernel.util.OrderByComparator"
			});
	public static final FinderPath FINDER_PATH_COUNT_BY_S_L = new FinderPath(VLegalFieldModelImpl.ENTITY_CACHE_ENABLED,
			VLegalFieldModelImpl.FINDER_CACHE_ENABLED, FINDER_CLASS_NAME_LIST,
			"countByS_L",
			new String[] {
				Long.class.getName(), Boolean.class.getName(),
				String.class.getName()
			});
	public static final FinderPath FINDER_PATH_FIND_BY_L_S = new FinderPath(VLegalFieldModelImpl.ENTITY_CACHE_ENABLED,
			VLegalFieldModelImpl.FINDER_CACHE_ENABLED, FINDER_CLASS_NAME_LIST,
			"findByL_S",
			new String[] {
				String.class.getName(), Boolean.class.getName(),
				
			"java.lang.Integer", "java.lang.Integer",
				"com.liferay.portal.kernel.util.OrderByComparator"
			});
	public static final FinderPath FINDER_PATH_COUNT_BY_L_S = new FinderPath(VLegalFieldModelImpl.ENTITY_CACHE_ENABLED,
			VLegalFieldModelImpl.FINDER_CACHE_ENABLED, FINDER_CLASS_NAME_LIST,
			"countByL_S",
			new String[] { String.class.getName(), Boolean.class.getName() });
	public static final FinderPath FINDER_PATH_FIND_BY_S_RSS = new FinderPath(VLegalFieldModelImpl.ENTITY_CACHE_ENABLED,
			VLegalFieldModelImpl.FINDER_CACHE_ENABLED, FINDER_CLASS_NAME_LIST,
			"findByS_Rss",
			new String[] {
				Long.class.getName(), Boolean.class.getName(),
				Boolean.class.getName(),
				
			"java.lang.Integer", "java.lang.Integer",
				"com.liferay.portal.kernel.util.OrderByComparator"
			});
	public static final FinderPath FINDER_PATH_COUNT_BY_S_RSS = new FinderPath(VLegalFieldModelImpl.ENTITY_CACHE_ENABLED,
			VLegalFieldModelImpl.FINDER_CACHE_ENABLED, FINDER_CLASS_NAME_LIST,
			"countByS_Rss",
			new String[] {
				Long.class.getName(), Boolean.class.getName(),
				Boolean.class.getName()
			});
	public static final FinderPath FINDER_PATH_FIND_ALL = new FinderPath(VLegalFieldModelImpl.ENTITY_CACHE_ENABLED,
			VLegalFieldModelImpl.FINDER_CACHE_ENABLED, FINDER_CLASS_NAME_LIST,
			"findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(VLegalFieldModelImpl.ENTITY_CACHE_ENABLED,
			VLegalFieldModelImpl.FINDER_CACHE_ENABLED, FINDER_CLASS_NAME_LIST,
			"countAll", new String[0]);

	/**
	 * Caches the v legal field in the entity cache if it is enabled.
	 *
	 * @param vLegalField the v legal field to cache
	 */
	public void cacheResult(VLegalField vLegalField) {
		EntityCacheUtil.putResult(VLegalFieldModelImpl.ENTITY_CACHE_ENABLED,
			VLegalFieldImpl.class, vLegalField.getPrimaryKey(), vLegalField);

		FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_G_F,
			new Object[] {
				new Long(vLegalField.getGroupId()),
				
			vLegalField.getFieldId()
			}, vLegalField);
	}

	/**
	 * Caches the v legal fields in the entity cache if it is enabled.
	 *
	 * @param vLegalFields the v legal fields to cache
	 */
	public void cacheResult(List<VLegalField> vLegalFields) {
		for (VLegalField vLegalField : vLegalFields) {
			if (EntityCacheUtil.getResult(
						VLegalFieldModelImpl.ENTITY_CACHE_ENABLED,
						VLegalFieldImpl.class, vLegalField.getPrimaryKey(), this) == null) {
				cacheResult(vLegalField);
			}
		}
	}

	/**
	 * Clears the cache for all v legal fields.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	public void clearCache() {
		CacheRegistryUtil.clear(VLegalFieldImpl.class.getName());
		EntityCacheUtil.clearCache(VLegalFieldImpl.class.getName());
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST);
	}

	/**
	 * Clears the cache for the v legal field.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	public void clearCache(VLegalField vLegalField) {
		EntityCacheUtil.removeResult(VLegalFieldModelImpl.ENTITY_CACHE_ENABLED,
			VLegalFieldImpl.class, vLegalField.getPrimaryKey());

		FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_G_F,
			new Object[] {
				new Long(vLegalField.getGroupId()),
				
			vLegalField.getFieldId()
			});
	}

	/**
	 * Creates a new v legal field with the primary key. Does not add the v legal field to the database.
	 *
	 * @param fieldId the primary key for the new v legal field
	 * @return the new v legal field
	 */
	public VLegalField create(String fieldId) {
		VLegalField vLegalField = new VLegalFieldImpl();

		vLegalField.setNew(true);
		vLegalField.setPrimaryKey(fieldId);

		return vLegalField;
	}

	/**
	 * Removes the v legal field with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the v legal field to remove
	 * @return the v legal field that was removed
	 * @throws com.liferay.portal.NoSuchModelException if a v legal field with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public VLegalField remove(Serializable primaryKey)
		throws NoSuchModelException, SystemException {
		return remove((String)primaryKey);
	}

	/**
	 * Removes the v legal field with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param fieldId the primary key of the v legal field to remove
	 * @return the v legal field that was removed
	 * @throws com.vportal.portlet.vlegal.NoSuchVLegalFieldException if a v legal field with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public VLegalField remove(String fieldId)
		throws NoSuchVLegalFieldException, SystemException {
		Session session = null;

		try {
			session = openSession();

			VLegalField vLegalField = (VLegalField)session.get(VLegalFieldImpl.class,
					fieldId);

			if (vLegalField == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + fieldId);
				}

				throw new NoSuchVLegalFieldException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					fieldId);
			}

			return remove(vLegalField);
		}
		catch (NoSuchVLegalFieldException nsee) {
			throw nsee;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected VLegalField removeImpl(VLegalField vLegalField)
		throws SystemException {
		vLegalField = toUnwrappedModel(vLegalField);

		Session session = null;

		try {
			session = openSession();

			BatchSessionUtil.delete(session, vLegalField);
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST);

		VLegalFieldModelImpl vLegalFieldModelImpl = (VLegalFieldModelImpl)vLegalField;

		FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_G_F,
			new Object[] {
				new Long(vLegalFieldModelImpl.getGroupId()),
				
			vLegalFieldModelImpl.getFieldId()
			});

		EntityCacheUtil.removeResult(VLegalFieldModelImpl.ENTITY_CACHE_ENABLED,
			VLegalFieldImpl.class, vLegalField.getPrimaryKey());

		return vLegalField;
	}

	public VLegalField updateImpl(
		com.vportal.portlet.vlegal.model.VLegalField vLegalField, boolean merge)
		throws SystemException {
		vLegalField = toUnwrappedModel(vLegalField);

		boolean isNew = vLegalField.isNew();

		VLegalFieldModelImpl vLegalFieldModelImpl = (VLegalFieldModelImpl)vLegalField;

		Session session = null;

		try {
			session = openSession();

			BatchSessionUtil.update(session, vLegalField, merge);

			vLegalField.setNew(false);
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST);

		EntityCacheUtil.putResult(VLegalFieldModelImpl.ENTITY_CACHE_ENABLED,
			VLegalFieldImpl.class, vLegalField.getPrimaryKey(), vLegalField);

		if (!isNew &&
				((vLegalField.getGroupId() != vLegalFieldModelImpl.getOriginalGroupId()) ||
				!Validator.equals(vLegalField.getFieldId(),
					vLegalFieldModelImpl.getOriginalFieldId()))) {
			FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_G_F,
				new Object[] {
					new Long(vLegalFieldModelImpl.getOriginalGroupId()),
					
				vLegalFieldModelImpl.getOriginalFieldId()
				});
		}

		if (isNew ||
				((vLegalField.getGroupId() != vLegalFieldModelImpl.getOriginalGroupId()) ||
				!Validator.equals(vLegalField.getFieldId(),
					vLegalFieldModelImpl.getOriginalFieldId()))) {
			FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_G_F,
				new Object[] {
					new Long(vLegalField.getGroupId()),
					
				vLegalField.getFieldId()
				}, vLegalField);
		}

		return vLegalField;
	}

	protected VLegalField toUnwrappedModel(VLegalField vLegalField) {
		if (vLegalField instanceof VLegalFieldImpl) {
			return vLegalField;
		}

		VLegalFieldImpl vLegalFieldImpl = new VLegalFieldImpl();

		vLegalFieldImpl.setNew(vLegalField.isNew());
		vLegalFieldImpl.setPrimaryKey(vLegalField.getPrimaryKey());

		vLegalFieldImpl.setFieldId(vLegalField.getFieldId());
		vLegalFieldImpl.setGroupId(vLegalField.getGroupId());
		vLegalFieldImpl.setCompanyId(vLegalField.getCompanyId());
		vLegalFieldImpl.setUserId(vLegalField.getUserId());
		vLegalFieldImpl.setCreatedDate(vLegalField.getCreatedDate());
		vLegalFieldImpl.setModifiedDate(vLegalField.getModifiedDate());
		vLegalFieldImpl.setCreatedByUser(vLegalField.getCreatedByUser());
		vLegalFieldImpl.setModifiedByUser(vLegalField.getModifiedByUser());
		vLegalFieldImpl.setName(vLegalField.getName());
		vLegalFieldImpl.setDescription(vLegalField.getDescription());
		vLegalFieldImpl.setLanguage(vLegalField.getLanguage());
		vLegalFieldImpl.setStatusField(vLegalField.isStatusField());
		vLegalFieldImpl.setRssable(vLegalField.isRssable());

		return vLegalFieldImpl;
	}

	/**
	 * Finds the v legal field with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the v legal field to find
	 * @return the v legal field
	 * @throws com.liferay.portal.NoSuchModelException if a v legal field with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public VLegalField findByPrimaryKey(Serializable primaryKey)
		throws NoSuchModelException, SystemException {
		return findByPrimaryKey((String)primaryKey);
	}

	/**
	 * Finds the v legal field with the primary key or throws a {@link com.vportal.portlet.vlegal.NoSuchVLegalFieldException} if it could not be found.
	 *
	 * @param fieldId the primary key of the v legal field to find
	 * @return the v legal field
	 * @throws com.vportal.portlet.vlegal.NoSuchVLegalFieldException if a v legal field with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public VLegalField findByPrimaryKey(String fieldId)
		throws NoSuchVLegalFieldException, SystemException {
		VLegalField vLegalField = fetchByPrimaryKey(fieldId);

		if (vLegalField == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + fieldId);
			}

			throw new NoSuchVLegalFieldException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				fieldId);
		}

		return vLegalField;
	}

	/**
	 * Finds the v legal field with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the v legal field to find
	 * @return the v legal field, or <code>null</code> if a v legal field with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public VLegalField fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		return fetchByPrimaryKey((String)primaryKey);
	}

	/**
	 * Finds the v legal field with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param fieldId the primary key of the v legal field to find
	 * @return the v legal field, or <code>null</code> if a v legal field with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public VLegalField fetchByPrimaryKey(String fieldId)
		throws SystemException {
		VLegalField vLegalField = (VLegalField)EntityCacheUtil.getResult(VLegalFieldModelImpl.ENTITY_CACHE_ENABLED,
				VLegalFieldImpl.class, fieldId, this);

		if (vLegalField == null) {
			Session session = null;

			try {
				session = openSession();

				vLegalField = (VLegalField)session.get(VLegalFieldImpl.class,
						fieldId);
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (vLegalField != null) {
					cacheResult(vLegalField);
				}

				closeSession(session);
			}
		}

		return vLegalField;
	}

	/**
	 * Finds all the v legal fields where groupId = &#63;.
	 *
	 * @param groupId the group id to search with
	 * @return the matching v legal fields
	 * @throws SystemException if a system exception occurred
	 */
	public List<VLegalField> findByGroupId(long groupId)
		throws SystemException {
		return findByGroupId(groupId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Finds a range of all the v legal fields where groupId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param groupId the group id to search with
	 * @param start the lower bound of the range of v legal fields to return
	 * @param end the upper bound of the range of v legal fields to return (not inclusive)
	 * @return the range of matching v legal fields
	 * @throws SystemException if a system exception occurred
	 */
	public List<VLegalField> findByGroupId(long groupId, int start, int end)
		throws SystemException {
		return findByGroupId(groupId, start, end, null);
	}

	/**
	 * Finds an ordered range of all the v legal fields where groupId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param groupId the group id to search with
	 * @param start the lower bound of the range of v legal fields to return
	 * @param end the upper bound of the range of v legal fields to return (not inclusive)
	 * @param orderByComparator the comparator to order the results by
	 * @return the ordered range of matching v legal fields
	 * @throws SystemException if a system exception occurred
	 */
	public List<VLegalField> findByGroupId(long groupId, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		Object[] finderArgs = new Object[] {
				groupId,
				
				String.valueOf(start), String.valueOf(end),
				String.valueOf(orderByComparator)
			};

		List<VLegalField> list = (List<VLegalField>)FinderCacheUtil.getResult(FINDER_PATH_FIND_BY_GROUPID,
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

			query.append(_SQL_SELECT_VLEGALFIELD_WHERE);

			query.append(_FINDER_COLUMN_GROUPID_GROUPID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}

			else {
				query.append(VLegalFieldModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(groupId);

				list = (List<VLegalField>)QueryUtil.list(q, getDialect(),
						start, end);
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (list == null) {
					FinderCacheUtil.removeResult(FINDER_PATH_FIND_BY_GROUPID,
						finderArgs);
				}
				else {
					cacheResult(list);

					FinderCacheUtil.putResult(FINDER_PATH_FIND_BY_GROUPID,
						finderArgs, list);
				}

				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Finds the first v legal field in the ordered set where groupId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param groupId the group id to search with
	 * @param orderByComparator the comparator to order the set by
	 * @return the first matching v legal field
	 * @throws com.vportal.portlet.vlegal.NoSuchVLegalFieldException if a matching v legal field could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public VLegalField findByGroupId_First(long groupId,
		OrderByComparator orderByComparator)
		throws NoSuchVLegalFieldException, SystemException {
		List<VLegalField> list = findByGroupId(groupId, 0, 1, orderByComparator);

		if (list.isEmpty()) {
			StringBundler msg = new StringBundler(4);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("groupId=");
			msg.append(groupId);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			throw new NoSuchVLegalFieldException(msg.toString());
		}
		else {
			return list.get(0);
		}
	}

	/**
	 * Finds the last v legal field in the ordered set where groupId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param groupId the group id to search with
	 * @param orderByComparator the comparator to order the set by
	 * @return the last matching v legal field
	 * @throws com.vportal.portlet.vlegal.NoSuchVLegalFieldException if a matching v legal field could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public VLegalField findByGroupId_Last(long groupId,
		OrderByComparator orderByComparator)
		throws NoSuchVLegalFieldException, SystemException {
		int count = countByGroupId(groupId);

		List<VLegalField> list = findByGroupId(groupId, count - 1, count,
				orderByComparator);

		if (list.isEmpty()) {
			StringBundler msg = new StringBundler(4);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("groupId=");
			msg.append(groupId);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			throw new NoSuchVLegalFieldException(msg.toString());
		}
		else {
			return list.get(0);
		}
	}

	/**
	 * Finds the v legal fields before and after the current v legal field in the ordered set where groupId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param fieldId the primary key of the current v legal field
	 * @param groupId the group id to search with
	 * @param orderByComparator the comparator to order the set by
	 * @return the previous, current, and next v legal field
	 * @throws com.vportal.portlet.vlegal.NoSuchVLegalFieldException if a v legal field with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public VLegalField[] findByGroupId_PrevAndNext(String fieldId,
		long groupId, OrderByComparator orderByComparator)
		throws NoSuchVLegalFieldException, SystemException {
		VLegalField vLegalField = findByPrimaryKey(fieldId);

		Session session = null;

		try {
			session = openSession();

			VLegalField[] array = new VLegalFieldImpl[3];

			array[0] = getByGroupId_PrevAndNext(session, vLegalField, groupId,
					orderByComparator, true);

			array[1] = vLegalField;

			array[2] = getByGroupId_PrevAndNext(session, vLegalField, groupId,
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

	protected VLegalField getByGroupId_PrevAndNext(Session session,
		VLegalField vLegalField, long groupId,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_VLEGALFIELD_WHERE);

		query.append(_FINDER_COLUMN_GROUPID_GROUPID_2);

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
			query.append(VLegalFieldModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(groupId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByValues(vLegalField);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<VLegalField> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Finds the v legal field where groupId = &#63; and fieldId = &#63; or throws a {@link com.vportal.portlet.vlegal.NoSuchVLegalFieldException} if it could not be found.
	 *
	 * @param groupId the group id to search with
	 * @param fieldId the field id to search with
	 * @return the matching v legal field
	 * @throws com.vportal.portlet.vlegal.NoSuchVLegalFieldException if a matching v legal field could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public VLegalField findByG_F(long groupId, String fieldId)
		throws NoSuchVLegalFieldException, SystemException {
		VLegalField vLegalField = fetchByG_F(groupId, fieldId);

		if (vLegalField == null) {
			StringBundler msg = new StringBundler(6);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("groupId=");
			msg.append(groupId);

			msg.append(", fieldId=");
			msg.append(fieldId);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			if (_log.isWarnEnabled()) {
				_log.warn(msg.toString());
			}

			throw new NoSuchVLegalFieldException(msg.toString());
		}

		return vLegalField;
	}

	/**
	 * Finds the v legal field where groupId = &#63; and fieldId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param groupId the group id to search with
	 * @param fieldId the field id to search with
	 * @return the matching v legal field, or <code>null</code> if a matching v legal field could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public VLegalField fetchByG_F(long groupId, String fieldId)
		throws SystemException {
		return fetchByG_F(groupId, fieldId, true);
	}

	/**
	 * Finds the v legal field where groupId = &#63; and fieldId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param groupId the group id to search with
	 * @param fieldId the field id to search with
	 * @return the matching v legal field, or <code>null</code> if a matching v legal field could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public VLegalField fetchByG_F(long groupId, String fieldId,
		boolean retrieveFromCache) throws SystemException {
		Object[] finderArgs = new Object[] { groupId, fieldId };

		Object result = null;

		if (retrieveFromCache) {
			result = FinderCacheUtil.getResult(FINDER_PATH_FETCH_BY_G_F,
					finderArgs, this);
		}

		if (result == null) {
			StringBundler query = new StringBundler(4);

			query.append(_SQL_SELECT_VLEGALFIELD_WHERE);

			query.append(_FINDER_COLUMN_G_F_GROUPID_2);

			if (fieldId == null) {
				query.append(_FINDER_COLUMN_G_F_FIELDID_1);
			}
			else {
				if (fieldId.equals(StringPool.BLANK)) {
					query.append(_FINDER_COLUMN_G_F_FIELDID_3);
				}
				else {
					query.append(_FINDER_COLUMN_G_F_FIELDID_2);
				}
			}

			query.append(VLegalFieldModelImpl.ORDER_BY_JPQL);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(groupId);

				if (fieldId != null) {
					qPos.add(fieldId);
				}

				List<VLegalField> list = q.list();

				result = list;

				VLegalField vLegalField = null;

				if (list.isEmpty()) {
					FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_G_F,
						finderArgs, list);
				}
				else {
					vLegalField = list.get(0);

					cacheResult(vLegalField);

					if ((vLegalField.getGroupId() != groupId) ||
							(vLegalField.getFieldId() == null) ||
							!vLegalField.getFieldId().equals(fieldId)) {
						FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_G_F,
							finderArgs, vLegalField);
					}
				}

				return vLegalField;
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (result == null) {
					FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_G_F,
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
				return (VLegalField)result;
			}
		}
	}

	/**
	 * Finds all the v legal fields where groupId = &#63; and statusField = &#63; and language = &#63;.
	 *
	 * @param groupId the group id to search with
	 * @param statusField the status field to search with
	 * @param language the language to search with
	 * @return the matching v legal fields
	 * @throws SystemException if a system exception occurred
	 */
	public List<VLegalField> findByS_L(long groupId, boolean statusField,
		String language) throws SystemException {
		return findByS_L(groupId, statusField, language, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Finds a range of all the v legal fields where groupId = &#63; and statusField = &#63; and language = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param groupId the group id to search with
	 * @param statusField the status field to search with
	 * @param language the language to search with
	 * @param start the lower bound of the range of v legal fields to return
	 * @param end the upper bound of the range of v legal fields to return (not inclusive)
	 * @return the range of matching v legal fields
	 * @throws SystemException if a system exception occurred
	 */
	public List<VLegalField> findByS_L(long groupId, boolean statusField,
		String language, int start, int end) throws SystemException {
		return findByS_L(groupId, statusField, language, start, end, null);
	}

	/**
	 * Finds an ordered range of all the v legal fields where groupId = &#63; and statusField = &#63; and language = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param groupId the group id to search with
	 * @param statusField the status field to search with
	 * @param language the language to search with
	 * @param start the lower bound of the range of v legal fields to return
	 * @param end the upper bound of the range of v legal fields to return (not inclusive)
	 * @param orderByComparator the comparator to order the results by
	 * @return the ordered range of matching v legal fields
	 * @throws SystemException if a system exception occurred
	 */
	public List<VLegalField> findByS_L(long groupId, boolean statusField,
		String language, int start, int end, OrderByComparator orderByComparator)
		throws SystemException {
		Object[] finderArgs = new Object[] {
				groupId, statusField, language,
				
				String.valueOf(start), String.valueOf(end),
				String.valueOf(orderByComparator)
			};

		List<VLegalField> list = (List<VLegalField>)FinderCacheUtil.getResult(FINDER_PATH_FIND_BY_S_L,
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

			query.append(_SQL_SELECT_VLEGALFIELD_WHERE);

			query.append(_FINDER_COLUMN_S_L_GROUPID_2);

			query.append(_FINDER_COLUMN_S_L_STATUSFIELD_2);

			if (language == null) {
				query.append(_FINDER_COLUMN_S_L_LANGUAGE_1);
			}
			else {
				if (language.equals(StringPool.BLANK)) {
					query.append(_FINDER_COLUMN_S_L_LANGUAGE_3);
				}
				else {
					query.append(_FINDER_COLUMN_S_L_LANGUAGE_2);
				}
			}

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}

			else {
				query.append(VLegalFieldModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(groupId);

				qPos.add(statusField);

				if (language != null) {
					qPos.add(language);
				}

				list = (List<VLegalField>)QueryUtil.list(q, getDialect(),
						start, end);
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (list == null) {
					FinderCacheUtil.removeResult(FINDER_PATH_FIND_BY_S_L,
						finderArgs);
				}
				else {
					cacheResult(list);

					FinderCacheUtil.putResult(FINDER_PATH_FIND_BY_S_L,
						finderArgs, list);
				}

				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Finds the first v legal field in the ordered set where groupId = &#63; and statusField = &#63; and language = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param groupId the group id to search with
	 * @param statusField the status field to search with
	 * @param language the language to search with
	 * @param orderByComparator the comparator to order the set by
	 * @return the first matching v legal field
	 * @throws com.vportal.portlet.vlegal.NoSuchVLegalFieldException if a matching v legal field could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public VLegalField findByS_L_First(long groupId, boolean statusField,
		String language, OrderByComparator orderByComparator)
		throws NoSuchVLegalFieldException, SystemException {
		List<VLegalField> list = findByS_L(groupId, statusField, language, 0,
				1, orderByComparator);

		if (list.isEmpty()) {
			StringBundler msg = new StringBundler(8);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("groupId=");
			msg.append(groupId);

			msg.append(", statusField=");
			msg.append(statusField);

			msg.append(", language=");
			msg.append(language);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			throw new NoSuchVLegalFieldException(msg.toString());
		}
		else {
			return list.get(0);
		}
	}

	/**
	 * Finds the last v legal field in the ordered set where groupId = &#63; and statusField = &#63; and language = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param groupId the group id to search with
	 * @param statusField the status field to search with
	 * @param language the language to search with
	 * @param orderByComparator the comparator to order the set by
	 * @return the last matching v legal field
	 * @throws com.vportal.portlet.vlegal.NoSuchVLegalFieldException if a matching v legal field could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public VLegalField findByS_L_Last(long groupId, boolean statusField,
		String language, OrderByComparator orderByComparator)
		throws NoSuchVLegalFieldException, SystemException {
		int count = countByS_L(groupId, statusField, language);

		List<VLegalField> list = findByS_L(groupId, statusField, language,
				count - 1, count, orderByComparator);

		if (list.isEmpty()) {
			StringBundler msg = new StringBundler(8);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("groupId=");
			msg.append(groupId);

			msg.append(", statusField=");
			msg.append(statusField);

			msg.append(", language=");
			msg.append(language);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			throw new NoSuchVLegalFieldException(msg.toString());
		}
		else {
			return list.get(0);
		}
	}

	/**
	 * Finds the v legal fields before and after the current v legal field in the ordered set where groupId = &#63; and statusField = &#63; and language = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param fieldId the primary key of the current v legal field
	 * @param groupId the group id to search with
	 * @param statusField the status field to search with
	 * @param language the language to search with
	 * @param orderByComparator the comparator to order the set by
	 * @return the previous, current, and next v legal field
	 * @throws com.vportal.portlet.vlegal.NoSuchVLegalFieldException if a v legal field with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public VLegalField[] findByS_L_PrevAndNext(String fieldId, long groupId,
		boolean statusField, String language,
		OrderByComparator orderByComparator)
		throws NoSuchVLegalFieldException, SystemException {
		VLegalField vLegalField = findByPrimaryKey(fieldId);

		Session session = null;

		try {
			session = openSession();

			VLegalField[] array = new VLegalFieldImpl[3];

			array[0] = getByS_L_PrevAndNext(session, vLegalField, groupId,
					statusField, language, orderByComparator, true);

			array[1] = vLegalField;

			array[2] = getByS_L_PrevAndNext(session, vLegalField, groupId,
					statusField, language, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected VLegalField getByS_L_PrevAndNext(Session session,
		VLegalField vLegalField, long groupId, boolean statusField,
		String language, OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_VLEGALFIELD_WHERE);

		query.append(_FINDER_COLUMN_S_L_GROUPID_2);

		query.append(_FINDER_COLUMN_S_L_STATUSFIELD_2);

		if (language == null) {
			query.append(_FINDER_COLUMN_S_L_LANGUAGE_1);
		}
		else {
			if (language.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_S_L_LANGUAGE_3);
			}
			else {
				query.append(_FINDER_COLUMN_S_L_LANGUAGE_2);
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
			query.append(VLegalFieldModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(groupId);

		qPos.add(statusField);

		if (language != null) {
			qPos.add(language);
		}

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByValues(vLegalField);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<VLegalField> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Finds all the v legal fields where language = &#63; and statusField = &#63;.
	 *
	 * @param language the language to search with
	 * @param statusField the status field to search with
	 * @return the matching v legal fields
	 * @throws SystemException if a system exception occurred
	 */
	public List<VLegalField> findByL_S(String language, boolean statusField)
		throws SystemException {
		return findByL_S(language, statusField, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Finds a range of all the v legal fields where language = &#63; and statusField = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param language the language to search with
	 * @param statusField the status field to search with
	 * @param start the lower bound of the range of v legal fields to return
	 * @param end the upper bound of the range of v legal fields to return (not inclusive)
	 * @return the range of matching v legal fields
	 * @throws SystemException if a system exception occurred
	 */
	public List<VLegalField> findByL_S(String language, boolean statusField,
		int start, int end) throws SystemException {
		return findByL_S(language, statusField, start, end, null);
	}

	/**
	 * Finds an ordered range of all the v legal fields where language = &#63; and statusField = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param language the language to search with
	 * @param statusField the status field to search with
	 * @param start the lower bound of the range of v legal fields to return
	 * @param end the upper bound of the range of v legal fields to return (not inclusive)
	 * @param orderByComparator the comparator to order the results by
	 * @return the ordered range of matching v legal fields
	 * @throws SystemException if a system exception occurred
	 */
	public List<VLegalField> findByL_S(String language, boolean statusField,
		int start, int end, OrderByComparator orderByComparator)
		throws SystemException {
		Object[] finderArgs = new Object[] {
				language, statusField,
				
				String.valueOf(start), String.valueOf(end),
				String.valueOf(orderByComparator)
			};

		List<VLegalField> list = (List<VLegalField>)FinderCacheUtil.getResult(FINDER_PATH_FIND_BY_L_S,
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

			query.append(_SQL_SELECT_VLEGALFIELD_WHERE);

			if (language == null) {
				query.append(_FINDER_COLUMN_L_S_LANGUAGE_1);
			}
			else {
				if (language.equals(StringPool.BLANK)) {
					query.append(_FINDER_COLUMN_L_S_LANGUAGE_3);
				}
				else {
					query.append(_FINDER_COLUMN_L_S_LANGUAGE_2);
				}
			}

			query.append(_FINDER_COLUMN_L_S_STATUSFIELD_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}

			else {
				query.append(VLegalFieldModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (language != null) {
					qPos.add(language);
				}

				qPos.add(statusField);

				list = (List<VLegalField>)QueryUtil.list(q, getDialect(),
						start, end);
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (list == null) {
					FinderCacheUtil.removeResult(FINDER_PATH_FIND_BY_L_S,
						finderArgs);
				}
				else {
					cacheResult(list);

					FinderCacheUtil.putResult(FINDER_PATH_FIND_BY_L_S,
						finderArgs, list);
				}

				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Finds the first v legal field in the ordered set where language = &#63; and statusField = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param language the language to search with
	 * @param statusField the status field to search with
	 * @param orderByComparator the comparator to order the set by
	 * @return the first matching v legal field
	 * @throws com.vportal.portlet.vlegal.NoSuchVLegalFieldException if a matching v legal field could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public VLegalField findByL_S_First(String language, boolean statusField,
		OrderByComparator orderByComparator)
		throws NoSuchVLegalFieldException, SystemException {
		List<VLegalField> list = findByL_S(language, statusField, 0, 1,
				orderByComparator);

		if (list.isEmpty()) {
			StringBundler msg = new StringBundler(6);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("language=");
			msg.append(language);

			msg.append(", statusField=");
			msg.append(statusField);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			throw new NoSuchVLegalFieldException(msg.toString());
		}
		else {
			return list.get(0);
		}
	}

	/**
	 * Finds the last v legal field in the ordered set where language = &#63; and statusField = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param language the language to search with
	 * @param statusField the status field to search with
	 * @param orderByComparator the comparator to order the set by
	 * @return the last matching v legal field
	 * @throws com.vportal.portlet.vlegal.NoSuchVLegalFieldException if a matching v legal field could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public VLegalField findByL_S_Last(String language, boolean statusField,
		OrderByComparator orderByComparator)
		throws NoSuchVLegalFieldException, SystemException {
		int count = countByL_S(language, statusField);

		List<VLegalField> list = findByL_S(language, statusField, count - 1,
				count, orderByComparator);

		if (list.isEmpty()) {
			StringBundler msg = new StringBundler(6);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("language=");
			msg.append(language);

			msg.append(", statusField=");
			msg.append(statusField);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			throw new NoSuchVLegalFieldException(msg.toString());
		}
		else {
			return list.get(0);
		}
	}

	/**
	 * Finds the v legal fields before and after the current v legal field in the ordered set where language = &#63; and statusField = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param fieldId the primary key of the current v legal field
	 * @param language the language to search with
	 * @param statusField the status field to search with
	 * @param orderByComparator the comparator to order the set by
	 * @return the previous, current, and next v legal field
	 * @throws com.vportal.portlet.vlegal.NoSuchVLegalFieldException if a v legal field with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public VLegalField[] findByL_S_PrevAndNext(String fieldId, String language,
		boolean statusField, OrderByComparator orderByComparator)
		throws NoSuchVLegalFieldException, SystemException {
		VLegalField vLegalField = findByPrimaryKey(fieldId);

		Session session = null;

		try {
			session = openSession();

			VLegalField[] array = new VLegalFieldImpl[3];

			array[0] = getByL_S_PrevAndNext(session, vLegalField, language,
					statusField, orderByComparator, true);

			array[1] = vLegalField;

			array[2] = getByL_S_PrevAndNext(session, vLegalField, language,
					statusField, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected VLegalField getByL_S_PrevAndNext(Session session,
		VLegalField vLegalField, String language, boolean statusField,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_VLEGALFIELD_WHERE);

		if (language == null) {
			query.append(_FINDER_COLUMN_L_S_LANGUAGE_1);
		}
		else {
			if (language.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_L_S_LANGUAGE_3);
			}
			else {
				query.append(_FINDER_COLUMN_L_S_LANGUAGE_2);
			}
		}

		query.append(_FINDER_COLUMN_L_S_STATUSFIELD_2);

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
			query.append(VLegalFieldModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		if (language != null) {
			qPos.add(language);
		}

		qPos.add(statusField);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByValues(vLegalField);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<VLegalField> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Finds all the v legal fields where groupId = &#63; and statusField = &#63; and rssable = &#63;.
	 *
	 * @param groupId the group id to search with
	 * @param statusField the status field to search with
	 * @param rssable the rssable to search with
	 * @return the matching v legal fields
	 * @throws SystemException if a system exception occurred
	 */
	public List<VLegalField> findByS_Rss(long groupId, boolean statusField,
		boolean rssable) throws SystemException {
		return findByS_Rss(groupId, statusField, rssable, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Finds a range of all the v legal fields where groupId = &#63; and statusField = &#63; and rssable = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param groupId the group id to search with
	 * @param statusField the status field to search with
	 * @param rssable the rssable to search with
	 * @param start the lower bound of the range of v legal fields to return
	 * @param end the upper bound of the range of v legal fields to return (not inclusive)
	 * @return the range of matching v legal fields
	 * @throws SystemException if a system exception occurred
	 */
	public List<VLegalField> findByS_Rss(long groupId, boolean statusField,
		boolean rssable, int start, int end) throws SystemException {
		return findByS_Rss(groupId, statusField, rssable, start, end, null);
	}

	/**
	 * Finds an ordered range of all the v legal fields where groupId = &#63; and statusField = &#63; and rssable = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param groupId the group id to search with
	 * @param statusField the status field to search with
	 * @param rssable the rssable to search with
	 * @param start the lower bound of the range of v legal fields to return
	 * @param end the upper bound of the range of v legal fields to return (not inclusive)
	 * @param orderByComparator the comparator to order the results by
	 * @return the ordered range of matching v legal fields
	 * @throws SystemException if a system exception occurred
	 */
	public List<VLegalField> findByS_Rss(long groupId, boolean statusField,
		boolean rssable, int start, int end, OrderByComparator orderByComparator)
		throws SystemException {
		Object[] finderArgs = new Object[] {
				groupId, statusField, rssable,
				
				String.valueOf(start), String.valueOf(end),
				String.valueOf(orderByComparator)
			};

		List<VLegalField> list = (List<VLegalField>)FinderCacheUtil.getResult(FINDER_PATH_FIND_BY_S_RSS,
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

			query.append(_SQL_SELECT_VLEGALFIELD_WHERE);

			query.append(_FINDER_COLUMN_S_RSS_GROUPID_2);

			query.append(_FINDER_COLUMN_S_RSS_STATUSFIELD_2);

			query.append(_FINDER_COLUMN_S_RSS_RSSABLE_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}

			else {
				query.append(VLegalFieldModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(groupId);

				qPos.add(statusField);

				qPos.add(rssable);

				list = (List<VLegalField>)QueryUtil.list(q, getDialect(),
						start, end);
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (list == null) {
					FinderCacheUtil.removeResult(FINDER_PATH_FIND_BY_S_RSS,
						finderArgs);
				}
				else {
					cacheResult(list);

					FinderCacheUtil.putResult(FINDER_PATH_FIND_BY_S_RSS,
						finderArgs, list);
				}

				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Finds the first v legal field in the ordered set where groupId = &#63; and statusField = &#63; and rssable = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param groupId the group id to search with
	 * @param statusField the status field to search with
	 * @param rssable the rssable to search with
	 * @param orderByComparator the comparator to order the set by
	 * @return the first matching v legal field
	 * @throws com.vportal.portlet.vlegal.NoSuchVLegalFieldException if a matching v legal field could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public VLegalField findByS_Rss_First(long groupId, boolean statusField,
		boolean rssable, OrderByComparator orderByComparator)
		throws NoSuchVLegalFieldException, SystemException {
		List<VLegalField> list = findByS_Rss(groupId, statusField, rssable, 0,
				1, orderByComparator);

		if (list.isEmpty()) {
			StringBundler msg = new StringBundler(8);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("groupId=");
			msg.append(groupId);

			msg.append(", statusField=");
			msg.append(statusField);

			msg.append(", rssable=");
			msg.append(rssable);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			throw new NoSuchVLegalFieldException(msg.toString());
		}
		else {
			return list.get(0);
		}
	}

	/**
	 * Finds the last v legal field in the ordered set where groupId = &#63; and statusField = &#63; and rssable = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param groupId the group id to search with
	 * @param statusField the status field to search with
	 * @param rssable the rssable to search with
	 * @param orderByComparator the comparator to order the set by
	 * @return the last matching v legal field
	 * @throws com.vportal.portlet.vlegal.NoSuchVLegalFieldException if a matching v legal field could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public VLegalField findByS_Rss_Last(long groupId, boolean statusField,
		boolean rssable, OrderByComparator orderByComparator)
		throws NoSuchVLegalFieldException, SystemException {
		int count = countByS_Rss(groupId, statusField, rssable);

		List<VLegalField> list = findByS_Rss(groupId, statusField, rssable,
				count - 1, count, orderByComparator);

		if (list.isEmpty()) {
			StringBundler msg = new StringBundler(8);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("groupId=");
			msg.append(groupId);

			msg.append(", statusField=");
			msg.append(statusField);

			msg.append(", rssable=");
			msg.append(rssable);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			throw new NoSuchVLegalFieldException(msg.toString());
		}
		else {
			return list.get(0);
		}
	}

	/**
	 * Finds the v legal fields before and after the current v legal field in the ordered set where groupId = &#63; and statusField = &#63; and rssable = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param fieldId the primary key of the current v legal field
	 * @param groupId the group id to search with
	 * @param statusField the status field to search with
	 * @param rssable the rssable to search with
	 * @param orderByComparator the comparator to order the set by
	 * @return the previous, current, and next v legal field
	 * @throws com.vportal.portlet.vlegal.NoSuchVLegalFieldException if a v legal field with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public VLegalField[] findByS_Rss_PrevAndNext(String fieldId, long groupId,
		boolean statusField, boolean rssable,
		OrderByComparator orderByComparator)
		throws NoSuchVLegalFieldException, SystemException {
		VLegalField vLegalField = findByPrimaryKey(fieldId);

		Session session = null;

		try {
			session = openSession();

			VLegalField[] array = new VLegalFieldImpl[3];

			array[0] = getByS_Rss_PrevAndNext(session, vLegalField, groupId,
					statusField, rssable, orderByComparator, true);

			array[1] = vLegalField;

			array[2] = getByS_Rss_PrevAndNext(session, vLegalField, groupId,
					statusField, rssable, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected VLegalField getByS_Rss_PrevAndNext(Session session,
		VLegalField vLegalField, long groupId, boolean statusField,
		boolean rssable, OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_VLEGALFIELD_WHERE);

		query.append(_FINDER_COLUMN_S_RSS_GROUPID_2);

		query.append(_FINDER_COLUMN_S_RSS_STATUSFIELD_2);

		query.append(_FINDER_COLUMN_S_RSS_RSSABLE_2);

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
			query.append(VLegalFieldModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(groupId);

		qPos.add(statusField);

		qPos.add(rssable);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByValues(vLegalField);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<VLegalField> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Finds all the v legal fields.
	 *
	 * @return the v legal fields
	 * @throws SystemException if a system exception occurred
	 */
	public List<VLegalField> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Finds a range of all the v legal fields.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param start the lower bound of the range of v legal fields to return
	 * @param end the upper bound of the range of v legal fields to return (not inclusive)
	 * @return the range of v legal fields
	 * @throws SystemException if a system exception occurred
	 */
	public List<VLegalField> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Finds an ordered range of all the v legal fields.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param start the lower bound of the range of v legal fields to return
	 * @param end the upper bound of the range of v legal fields to return (not inclusive)
	 * @param orderByComparator the comparator to order the results by
	 * @return the ordered range of v legal fields
	 * @throws SystemException if a system exception occurred
	 */
	public List<VLegalField> findAll(int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		Object[] finderArgs = new Object[] {
				String.valueOf(start), String.valueOf(end),
				String.valueOf(orderByComparator)
			};

		List<VLegalField> list = (List<VLegalField>)FinderCacheUtil.getResult(FINDER_PATH_FIND_ALL,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_VLEGALFIELD);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_VLEGALFIELD.concat(VLegalFieldModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (orderByComparator == null) {
					list = (List<VLegalField>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);
				}
				else {
					list = (List<VLegalField>)QueryUtil.list(q, getDialect(),
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
	 * Removes all the v legal fields where groupId = &#63; from the database.
	 *
	 * @param groupId the group id to search with
	 * @throws SystemException if a system exception occurred
	 */
	public void removeByGroupId(long groupId) throws SystemException {
		for (VLegalField vLegalField : findByGroupId(groupId)) {
			remove(vLegalField);
		}
	}

	/**
	 * Removes the v legal field where groupId = &#63; and fieldId = &#63; from the database.
	 *
	 * @param groupId the group id to search with
	 * @param fieldId the field id to search with
	 * @throws SystemException if a system exception occurred
	 */
	public void removeByG_F(long groupId, String fieldId)
		throws NoSuchVLegalFieldException, SystemException {
		VLegalField vLegalField = findByG_F(groupId, fieldId);

		remove(vLegalField);
	}

	/**
	 * Removes all the v legal fields where groupId = &#63; and statusField = &#63; and language = &#63; from the database.
	 *
	 * @param groupId the group id to search with
	 * @param statusField the status field to search with
	 * @param language the language to search with
	 * @throws SystemException if a system exception occurred
	 */
	public void removeByS_L(long groupId, boolean statusField, String language)
		throws SystemException {
		for (VLegalField vLegalField : findByS_L(groupId, statusField, language)) {
			remove(vLegalField);
		}
	}

	/**
	 * Removes all the v legal fields where language = &#63; and statusField = &#63; from the database.
	 *
	 * @param language the language to search with
	 * @param statusField the status field to search with
	 * @throws SystemException if a system exception occurred
	 */
	public void removeByL_S(String language, boolean statusField)
		throws SystemException {
		for (VLegalField vLegalField : findByL_S(language, statusField)) {
			remove(vLegalField);
		}
	}

	/**
	 * Removes all the v legal fields where groupId = &#63; and statusField = &#63; and rssable = &#63; from the database.
	 *
	 * @param groupId the group id to search with
	 * @param statusField the status field to search with
	 * @param rssable the rssable to search with
	 * @throws SystemException if a system exception occurred
	 */
	public void removeByS_Rss(long groupId, boolean statusField, boolean rssable)
		throws SystemException {
		for (VLegalField vLegalField : findByS_Rss(groupId, statusField, rssable)) {
			remove(vLegalField);
		}
	}

	/**
	 * Removes all the v legal fields from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	public void removeAll() throws SystemException {
		for (VLegalField vLegalField : findAll()) {
			remove(vLegalField);
		}
	}

	/**
	 * Counts all the v legal fields where groupId = &#63;.
	 *
	 * @param groupId the group id to search with
	 * @return the number of matching v legal fields
	 * @throws SystemException if a system exception occurred
	 */
	public int countByGroupId(long groupId) throws SystemException {
		Object[] finderArgs = new Object[] { groupId };

		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_BY_GROUPID,
				finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_VLEGALFIELD_WHERE);

			query.append(_FINDER_COLUMN_GROUPID_GROUPID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

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

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_GROUPID,
					finderArgs, count);

				closeSession(session);
			}
		}

		return count.intValue();
	}

	/**
	 * Counts all the v legal fields where groupId = &#63; and fieldId = &#63;.
	 *
	 * @param groupId the group id to search with
	 * @param fieldId the field id to search with
	 * @return the number of matching v legal fields
	 * @throws SystemException if a system exception occurred
	 */
	public int countByG_F(long groupId, String fieldId)
		throws SystemException {
		Object[] finderArgs = new Object[] { groupId, fieldId };

		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_BY_G_F,
				finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_VLEGALFIELD_WHERE);

			query.append(_FINDER_COLUMN_G_F_GROUPID_2);

			if (fieldId == null) {
				query.append(_FINDER_COLUMN_G_F_FIELDID_1);
			}
			else {
				if (fieldId.equals(StringPool.BLANK)) {
					query.append(_FINDER_COLUMN_G_F_FIELDID_3);
				}
				else {
					query.append(_FINDER_COLUMN_G_F_FIELDID_2);
				}
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(groupId);

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

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_G_F, finderArgs,
					count);

				closeSession(session);
			}
		}

		return count.intValue();
	}

	/**
	 * Counts all the v legal fields where groupId = &#63; and statusField = &#63; and language = &#63;.
	 *
	 * @param groupId the group id to search with
	 * @param statusField the status field to search with
	 * @param language the language to search with
	 * @return the number of matching v legal fields
	 * @throws SystemException if a system exception occurred
	 */
	public int countByS_L(long groupId, boolean statusField, String language)
		throws SystemException {
		Object[] finderArgs = new Object[] { groupId, statusField, language };

		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_BY_S_L,
				finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(4);

			query.append(_SQL_COUNT_VLEGALFIELD_WHERE);

			query.append(_FINDER_COLUMN_S_L_GROUPID_2);

			query.append(_FINDER_COLUMN_S_L_STATUSFIELD_2);

			if (language == null) {
				query.append(_FINDER_COLUMN_S_L_LANGUAGE_1);
			}
			else {
				if (language.equals(StringPool.BLANK)) {
					query.append(_FINDER_COLUMN_S_L_LANGUAGE_3);
				}
				else {
					query.append(_FINDER_COLUMN_S_L_LANGUAGE_2);
				}
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(groupId);

				qPos.add(statusField);

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

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_S_L, finderArgs,
					count);

				closeSession(session);
			}
		}

		return count.intValue();
	}

	/**
	 * Counts all the v legal fields where language = &#63; and statusField = &#63;.
	 *
	 * @param language the language to search with
	 * @param statusField the status field to search with
	 * @return the number of matching v legal fields
	 * @throws SystemException if a system exception occurred
	 */
	public int countByL_S(String language, boolean statusField)
		throws SystemException {
		Object[] finderArgs = new Object[] { language, statusField };

		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_BY_L_S,
				finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_VLEGALFIELD_WHERE);

			if (language == null) {
				query.append(_FINDER_COLUMN_L_S_LANGUAGE_1);
			}
			else {
				if (language.equals(StringPool.BLANK)) {
					query.append(_FINDER_COLUMN_L_S_LANGUAGE_3);
				}
				else {
					query.append(_FINDER_COLUMN_L_S_LANGUAGE_2);
				}
			}

			query.append(_FINDER_COLUMN_L_S_STATUSFIELD_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (language != null) {
					qPos.add(language);
				}

				qPos.add(statusField);

				count = (Long)q.uniqueResult();
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (count == null) {
					count = Long.valueOf(0);
				}

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_L_S, finderArgs,
					count);

				closeSession(session);
			}
		}

		return count.intValue();
	}

	/**
	 * Counts all the v legal fields where groupId = &#63; and statusField = &#63; and rssable = &#63;.
	 *
	 * @param groupId the group id to search with
	 * @param statusField the status field to search with
	 * @param rssable the rssable to search with
	 * @return the number of matching v legal fields
	 * @throws SystemException if a system exception occurred
	 */
	public int countByS_Rss(long groupId, boolean statusField, boolean rssable)
		throws SystemException {
		Object[] finderArgs = new Object[] { groupId, statusField, rssable };

		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_BY_S_RSS,
				finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(4);

			query.append(_SQL_COUNT_VLEGALFIELD_WHERE);

			query.append(_FINDER_COLUMN_S_RSS_GROUPID_2);

			query.append(_FINDER_COLUMN_S_RSS_STATUSFIELD_2);

			query.append(_FINDER_COLUMN_S_RSS_RSSABLE_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(groupId);

				qPos.add(statusField);

				qPos.add(rssable);

				count = (Long)q.uniqueResult();
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (count == null) {
					count = Long.valueOf(0);
				}

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_S_RSS,
					finderArgs, count);

				closeSession(session);
			}
		}

		return count.intValue();
	}

	/**
	 * Counts all the v legal fields.
	 *
	 * @return the number of v legal fields
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

				Query q = session.createQuery(_SQL_COUNT_VLEGALFIELD);

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
	 * Initializes the v legal field persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.com.vportal.portlet.vlegal.model.VLegalField")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<VLegalField>> listenersList = new ArrayList<ModelListener<VLegalField>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<VLegalField>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(VLegalFieldImpl.class.getName());
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
	private static final String _SQL_SELECT_VLEGALFIELD = "SELECT vLegalField FROM VLegalField vLegalField";
	private static final String _SQL_SELECT_VLEGALFIELD_WHERE = "SELECT vLegalField FROM VLegalField vLegalField WHERE ";
	private static final String _SQL_COUNT_VLEGALFIELD = "SELECT COUNT(vLegalField) FROM VLegalField vLegalField";
	private static final String _SQL_COUNT_VLEGALFIELD_WHERE = "SELECT COUNT(vLegalField) FROM VLegalField vLegalField WHERE ";
	private static final String _FINDER_COLUMN_GROUPID_GROUPID_2 = "vLegalField.groupId = ?";
	private static final String _FINDER_COLUMN_G_F_GROUPID_2 = "vLegalField.groupId = ? AND ";
	private static final String _FINDER_COLUMN_G_F_FIELDID_1 = "vLegalField.fieldId IS NULL";
	private static final String _FINDER_COLUMN_G_F_FIELDID_2 = "vLegalField.fieldId = ?";
	private static final String _FINDER_COLUMN_G_F_FIELDID_3 = "(vLegalField.fieldId IS NULL OR vLegalField.fieldId = ?)";
	private static final String _FINDER_COLUMN_S_L_GROUPID_2 = "vLegalField.groupId = ? AND ";
	private static final String _FINDER_COLUMN_S_L_STATUSFIELD_2 = "vLegalField.statusField = ? AND ";
	private static final String _FINDER_COLUMN_S_L_LANGUAGE_1 = "vLegalField.language IS NULL";
	private static final String _FINDER_COLUMN_S_L_LANGUAGE_2 = "vLegalField.language = ?";
	private static final String _FINDER_COLUMN_S_L_LANGUAGE_3 = "(vLegalField.language IS NULL OR vLegalField.language = ?)";
	private static final String _FINDER_COLUMN_L_S_LANGUAGE_1 = "vLegalField.language IS NULL AND ";
	private static final String _FINDER_COLUMN_L_S_LANGUAGE_2 = "vLegalField.language = ? AND ";
	private static final String _FINDER_COLUMN_L_S_LANGUAGE_3 = "(vLegalField.language IS NULL OR vLegalField.language = ?) AND ";
	private static final String _FINDER_COLUMN_L_S_STATUSFIELD_2 = "vLegalField.statusField = ?";
	private static final String _FINDER_COLUMN_S_RSS_GROUPID_2 = "vLegalField.groupId = ? AND ";
	private static final String _FINDER_COLUMN_S_RSS_STATUSFIELD_2 = "vLegalField.statusField = ? AND ";
	private static final String _FINDER_COLUMN_S_RSS_RSSABLE_2 = "vLegalField.rssable = ?";
	private static final String _ORDER_BY_ENTITY_ALIAS = "vLegalField.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No VLegalField exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No VLegalField exists with the key {";
	private static Log _log = LogFactoryUtil.getLog(VLegalFieldPersistenceImpl.class);
}