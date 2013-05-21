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

import com.vportal.portlet.vlegal.NoSuchVLegalTypeException;
import com.vportal.portlet.vlegal.model.VLegalType;
import com.vportal.portlet.vlegal.model.impl.VLegalTypeImpl;
import com.vportal.portlet.vlegal.model.impl.VLegalTypeModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The persistence implementation for the v legal type service.
 *
 * <p>
 * Never modify or reference this class directly. Always use {@link VLegalTypeUtil} to access the v legal type persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
 * </p>
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author ACB
 * @see VLegalTypePersistence
 * @see VLegalTypeUtil
 * @generated
 */
public class VLegalTypePersistenceImpl extends BasePersistenceImpl<VLegalType>
	implements VLegalTypePersistence {
	public static final String FINDER_CLASS_NAME_ENTITY = VLegalTypeImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST = FINDER_CLASS_NAME_ENTITY +
		".List";
	public static final FinderPath FINDER_PATH_FIND_BY_GROUPID = new FinderPath(VLegalTypeModelImpl.ENTITY_CACHE_ENABLED,
			VLegalTypeModelImpl.FINDER_CACHE_ENABLED, FINDER_CLASS_NAME_LIST,
			"findByGroupId",
			new String[] {
				Long.class.getName(),
				
			"java.lang.Integer", "java.lang.Integer",
				"com.liferay.portal.kernel.util.OrderByComparator"
			});
	public static final FinderPath FINDER_PATH_COUNT_BY_GROUPID = new FinderPath(VLegalTypeModelImpl.ENTITY_CACHE_ENABLED,
			VLegalTypeModelImpl.FINDER_CACHE_ENABLED, FINDER_CLASS_NAME_LIST,
			"countByGroupId", new String[] { Long.class.getName() });
	public static final FinderPath FINDER_PATH_FETCH_BY_G_T = new FinderPath(VLegalTypeModelImpl.ENTITY_CACHE_ENABLED,
			VLegalTypeModelImpl.FINDER_CACHE_ENABLED, FINDER_CLASS_NAME_ENTITY,
			"fetchByG_T",
			new String[] { Long.class.getName(), String.class.getName() });
	public static final FinderPath FINDER_PATH_COUNT_BY_G_T = new FinderPath(VLegalTypeModelImpl.ENTITY_CACHE_ENABLED,
			VLegalTypeModelImpl.FINDER_CACHE_ENABLED, FINDER_CLASS_NAME_LIST,
			"countByG_T",
			new String[] { Long.class.getName(), String.class.getName() });
	public static final FinderPath FINDER_PATH_FIND_BY_S_L = new FinderPath(VLegalTypeModelImpl.ENTITY_CACHE_ENABLED,
			VLegalTypeModelImpl.FINDER_CACHE_ENABLED, FINDER_CLASS_NAME_LIST,
			"findByS_L",
			new String[] {
				Long.class.getName(), Boolean.class.getName(),
				String.class.getName(),
				
			"java.lang.Integer", "java.lang.Integer",
				"com.liferay.portal.kernel.util.OrderByComparator"
			});
	public static final FinderPath FINDER_PATH_COUNT_BY_S_L = new FinderPath(VLegalTypeModelImpl.ENTITY_CACHE_ENABLED,
			VLegalTypeModelImpl.FINDER_CACHE_ENABLED, FINDER_CLASS_NAME_LIST,
			"countByS_L",
			new String[] {
				Long.class.getName(), Boolean.class.getName(),
				String.class.getName()
			});
	public static final FinderPath FINDER_PATH_FIND_BY_S_RSS = new FinderPath(VLegalTypeModelImpl.ENTITY_CACHE_ENABLED,
			VLegalTypeModelImpl.FINDER_CACHE_ENABLED, FINDER_CLASS_NAME_LIST,
			"findByS_Rss",
			new String[] {
				Long.class.getName(), Boolean.class.getName(),
				Boolean.class.getName(),
				
			"java.lang.Integer", "java.lang.Integer",
				"com.liferay.portal.kernel.util.OrderByComparator"
			});
	public static final FinderPath FINDER_PATH_COUNT_BY_S_RSS = new FinderPath(VLegalTypeModelImpl.ENTITY_CACHE_ENABLED,
			VLegalTypeModelImpl.FINDER_CACHE_ENABLED, FINDER_CLASS_NAME_LIST,
			"countByS_Rss",
			new String[] {
				Long.class.getName(), Boolean.class.getName(),
				Boolean.class.getName()
			});
	public static final FinderPath FINDER_PATH_FIND_ALL = new FinderPath(VLegalTypeModelImpl.ENTITY_CACHE_ENABLED,
			VLegalTypeModelImpl.FINDER_CACHE_ENABLED, FINDER_CLASS_NAME_LIST,
			"findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(VLegalTypeModelImpl.ENTITY_CACHE_ENABLED,
			VLegalTypeModelImpl.FINDER_CACHE_ENABLED, FINDER_CLASS_NAME_LIST,
			"countAll", new String[0]);

	/**
	 * Caches the v legal type in the entity cache if it is enabled.
	 *
	 * @param vLegalType the v legal type to cache
	 */
	public void cacheResult(VLegalType vLegalType) {
		EntityCacheUtil.putResult(VLegalTypeModelImpl.ENTITY_CACHE_ENABLED,
			VLegalTypeImpl.class, vLegalType.getPrimaryKey(), vLegalType);

		FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_G_T,
			new Object[] {
				new Long(vLegalType.getGroupId()),
				
			vLegalType.getTypeId()
			}, vLegalType);
	}

	/**
	 * Caches the v legal types in the entity cache if it is enabled.
	 *
	 * @param vLegalTypes the v legal types to cache
	 */
	public void cacheResult(List<VLegalType> vLegalTypes) {
		for (VLegalType vLegalType : vLegalTypes) {
			if (EntityCacheUtil.getResult(
						VLegalTypeModelImpl.ENTITY_CACHE_ENABLED,
						VLegalTypeImpl.class, vLegalType.getPrimaryKey(), this) == null) {
				cacheResult(vLegalType);
			}
		}
	}

	/**
	 * Clears the cache for all v legal types.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	public void clearCache() {
		CacheRegistryUtil.clear(VLegalTypeImpl.class.getName());
		EntityCacheUtil.clearCache(VLegalTypeImpl.class.getName());
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST);
	}

	/**
	 * Clears the cache for the v legal type.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	public void clearCache(VLegalType vLegalType) {
		EntityCacheUtil.removeResult(VLegalTypeModelImpl.ENTITY_CACHE_ENABLED,
			VLegalTypeImpl.class, vLegalType.getPrimaryKey());

		FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_G_T,
			new Object[] {
				new Long(vLegalType.getGroupId()),
				
			vLegalType.getTypeId()
			});
	}

	/**
	 * Creates a new v legal type with the primary key. Does not add the v legal type to the database.
	 *
	 * @param typeId the primary key for the new v legal type
	 * @return the new v legal type
	 */
	public VLegalType create(String typeId) {
		VLegalType vLegalType = new VLegalTypeImpl();

		vLegalType.setNew(true);
		vLegalType.setPrimaryKey(typeId);

		return vLegalType;
	}

	/**
	 * Removes the v legal type with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the v legal type to remove
	 * @return the v legal type that was removed
	 * @throws com.liferay.portal.NoSuchModelException if a v legal type with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public VLegalType remove(Serializable primaryKey)
		throws NoSuchModelException, SystemException {
		return remove((String)primaryKey);
	}

	/**
	 * Removes the v legal type with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param typeId the primary key of the v legal type to remove
	 * @return the v legal type that was removed
	 * @throws com.vportal.portlet.vlegal.NoSuchVLegalTypeException if a v legal type with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public VLegalType remove(String typeId)
		throws NoSuchVLegalTypeException, SystemException {
		Session session = null;

		try {
			session = openSession();

			VLegalType vLegalType = (VLegalType)session.get(VLegalTypeImpl.class,
					typeId);

			if (vLegalType == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + typeId);
				}

				throw new NoSuchVLegalTypeException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					typeId);
			}

			return remove(vLegalType);
		}
		catch (NoSuchVLegalTypeException nsee) {
			throw nsee;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected VLegalType removeImpl(VLegalType vLegalType)
		throws SystemException {
		vLegalType = toUnwrappedModel(vLegalType);

		Session session = null;

		try {
			session = openSession();

			BatchSessionUtil.delete(session, vLegalType);
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST);

		VLegalTypeModelImpl vLegalTypeModelImpl = (VLegalTypeModelImpl)vLegalType;

		FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_G_T,
			new Object[] {
				new Long(vLegalTypeModelImpl.getGroupId()),
				
			vLegalTypeModelImpl.getTypeId()
			});

		EntityCacheUtil.removeResult(VLegalTypeModelImpl.ENTITY_CACHE_ENABLED,
			VLegalTypeImpl.class, vLegalType.getPrimaryKey());

		return vLegalType;
	}

	public VLegalType updateImpl(
		com.vportal.portlet.vlegal.model.VLegalType vLegalType, boolean merge)
		throws SystemException {
		vLegalType = toUnwrappedModel(vLegalType);

		boolean isNew = vLegalType.isNew();

		VLegalTypeModelImpl vLegalTypeModelImpl = (VLegalTypeModelImpl)vLegalType;

		Session session = null;

		try {
			session = openSession();

			BatchSessionUtil.update(session, vLegalType, merge);

			vLegalType.setNew(false);
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST);

		EntityCacheUtil.putResult(VLegalTypeModelImpl.ENTITY_CACHE_ENABLED,
			VLegalTypeImpl.class, vLegalType.getPrimaryKey(), vLegalType);

		if (!isNew &&
				((vLegalType.getGroupId() != vLegalTypeModelImpl.getOriginalGroupId()) ||
				!Validator.equals(vLegalType.getTypeId(),
					vLegalTypeModelImpl.getOriginalTypeId()))) {
			FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_G_T,
				new Object[] {
					new Long(vLegalTypeModelImpl.getOriginalGroupId()),
					
				vLegalTypeModelImpl.getOriginalTypeId()
				});
		}

		if (isNew ||
				((vLegalType.getGroupId() != vLegalTypeModelImpl.getOriginalGroupId()) ||
				!Validator.equals(vLegalType.getTypeId(),
					vLegalTypeModelImpl.getOriginalTypeId()))) {
			FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_G_T,
				new Object[] {
					new Long(vLegalType.getGroupId()),
					
				vLegalType.getTypeId()
				}, vLegalType);
		}

		return vLegalType;
	}

	protected VLegalType toUnwrappedModel(VLegalType vLegalType) {
		if (vLegalType instanceof VLegalTypeImpl) {
			return vLegalType;
		}

		VLegalTypeImpl vLegalTypeImpl = new VLegalTypeImpl();

		vLegalTypeImpl.setNew(vLegalType.isNew());
		vLegalTypeImpl.setPrimaryKey(vLegalType.getPrimaryKey());

		vLegalTypeImpl.setTypeId(vLegalType.getTypeId());
		vLegalTypeImpl.setGroupId(vLegalType.getGroupId());
		vLegalTypeImpl.setCompanyId(vLegalType.getCompanyId());
		vLegalTypeImpl.setUserId(vLegalType.getUserId());
		vLegalTypeImpl.setCreatedDate(vLegalType.getCreatedDate());
		vLegalTypeImpl.setModifiedDate(vLegalType.getModifiedDate());
		vLegalTypeImpl.setCreatedByUser(vLegalType.getCreatedByUser());
		vLegalTypeImpl.setModifiedByUser(vLegalType.getModifiedByUser());
		vLegalTypeImpl.setName(vLegalType.getName());
		vLegalTypeImpl.setDescription(vLegalType.getDescription());
		vLegalTypeImpl.setLanguage(vLegalType.getLanguage());
		vLegalTypeImpl.setStatusType(vLegalType.isStatusType());
		vLegalTypeImpl.setRssable(vLegalType.isRssable());
		vLegalTypeImpl.setPosition(vLegalType.getPosition());

		return vLegalTypeImpl;
	}

	/**
	 * Finds the v legal type with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the v legal type to find
	 * @return the v legal type
	 * @throws com.liferay.portal.NoSuchModelException if a v legal type with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public VLegalType findByPrimaryKey(Serializable primaryKey)
		throws NoSuchModelException, SystemException {
		return findByPrimaryKey((String)primaryKey);
	}

	/**
	 * Finds the v legal type with the primary key or throws a {@link com.vportal.portlet.vlegal.NoSuchVLegalTypeException} if it could not be found.
	 *
	 * @param typeId the primary key of the v legal type to find
	 * @return the v legal type
	 * @throws com.vportal.portlet.vlegal.NoSuchVLegalTypeException if a v legal type with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public VLegalType findByPrimaryKey(String typeId)
		throws NoSuchVLegalTypeException, SystemException {
		VLegalType vLegalType = fetchByPrimaryKey(typeId);

		if (vLegalType == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + typeId);
			}

			throw new NoSuchVLegalTypeException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				typeId);
		}

		return vLegalType;
	}

	/**
	 * Finds the v legal type with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the v legal type to find
	 * @return the v legal type, or <code>null</code> if a v legal type with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public VLegalType fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		return fetchByPrimaryKey((String)primaryKey);
	}

	/**
	 * Finds the v legal type with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param typeId the primary key of the v legal type to find
	 * @return the v legal type, or <code>null</code> if a v legal type with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public VLegalType fetchByPrimaryKey(String typeId)
		throws SystemException {
		VLegalType vLegalType = (VLegalType)EntityCacheUtil.getResult(VLegalTypeModelImpl.ENTITY_CACHE_ENABLED,
				VLegalTypeImpl.class, typeId, this);

		if (vLegalType == null) {
			Session session = null;

			try {
				session = openSession();

				vLegalType = (VLegalType)session.get(VLegalTypeImpl.class,
						typeId);
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (vLegalType != null) {
					cacheResult(vLegalType);
				}

				closeSession(session);
			}
		}

		return vLegalType;
	}

	/**
	 * Finds all the v legal types where groupId = &#63;.
	 *
	 * @param groupId the group id to search with
	 * @return the matching v legal types
	 * @throws SystemException if a system exception occurred
	 */
	public List<VLegalType> findByGroupId(long groupId)
		throws SystemException {
		return findByGroupId(groupId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Finds a range of all the v legal types where groupId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param groupId the group id to search with
	 * @param start the lower bound of the range of v legal types to return
	 * @param end the upper bound of the range of v legal types to return (not inclusive)
	 * @return the range of matching v legal types
	 * @throws SystemException if a system exception occurred
	 */
	public List<VLegalType> findByGroupId(long groupId, int start, int end)
		throws SystemException {
		return findByGroupId(groupId, start, end, null);
	}

	/**
	 * Finds an ordered range of all the v legal types where groupId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param groupId the group id to search with
	 * @param start the lower bound of the range of v legal types to return
	 * @param end the upper bound of the range of v legal types to return (not inclusive)
	 * @param orderByComparator the comparator to order the results by
	 * @return the ordered range of matching v legal types
	 * @throws SystemException if a system exception occurred
	 */
	public List<VLegalType> findByGroupId(long groupId, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		Object[] finderArgs = new Object[] {
				groupId,
				
				String.valueOf(start), String.valueOf(end),
				String.valueOf(orderByComparator)
			};

		List<VLegalType> list = (List<VLegalType>)FinderCacheUtil.getResult(FINDER_PATH_FIND_BY_GROUPID,
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

			query.append(_SQL_SELECT_VLEGALTYPE_WHERE);

			query.append(_FINDER_COLUMN_GROUPID_GROUPID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}

			else {
				query.append(VLegalTypeModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(groupId);

				list = (List<VLegalType>)QueryUtil.list(q, getDialect(), start,
						end);
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
	 * Finds the first v legal type in the ordered set where groupId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param groupId the group id to search with
	 * @param orderByComparator the comparator to order the set by
	 * @return the first matching v legal type
	 * @throws com.vportal.portlet.vlegal.NoSuchVLegalTypeException if a matching v legal type could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public VLegalType findByGroupId_First(long groupId,
		OrderByComparator orderByComparator)
		throws NoSuchVLegalTypeException, SystemException {
		List<VLegalType> list = findByGroupId(groupId, 0, 1, orderByComparator);

		if (list.isEmpty()) {
			StringBundler msg = new StringBundler(4);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("groupId=");
			msg.append(groupId);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			throw new NoSuchVLegalTypeException(msg.toString());
		}
		else {
			return list.get(0);
		}
	}

	/**
	 * Finds the last v legal type in the ordered set where groupId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param groupId the group id to search with
	 * @param orderByComparator the comparator to order the set by
	 * @return the last matching v legal type
	 * @throws com.vportal.portlet.vlegal.NoSuchVLegalTypeException if a matching v legal type could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public VLegalType findByGroupId_Last(long groupId,
		OrderByComparator orderByComparator)
		throws NoSuchVLegalTypeException, SystemException {
		int count = countByGroupId(groupId);

		List<VLegalType> list = findByGroupId(groupId, count - 1, count,
				orderByComparator);

		if (list.isEmpty()) {
			StringBundler msg = new StringBundler(4);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("groupId=");
			msg.append(groupId);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			throw new NoSuchVLegalTypeException(msg.toString());
		}
		else {
			return list.get(0);
		}
	}

	/**
	 * Finds the v legal types before and after the current v legal type in the ordered set where groupId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param typeId the primary key of the current v legal type
	 * @param groupId the group id to search with
	 * @param orderByComparator the comparator to order the set by
	 * @return the previous, current, and next v legal type
	 * @throws com.vportal.portlet.vlegal.NoSuchVLegalTypeException if a v legal type with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public VLegalType[] findByGroupId_PrevAndNext(String typeId, long groupId,
		OrderByComparator orderByComparator)
		throws NoSuchVLegalTypeException, SystemException {
		VLegalType vLegalType = findByPrimaryKey(typeId);

		Session session = null;

		try {
			session = openSession();

			VLegalType[] array = new VLegalTypeImpl[3];

			array[0] = getByGroupId_PrevAndNext(session, vLegalType, groupId,
					orderByComparator, true);

			array[1] = vLegalType;

			array[2] = getByGroupId_PrevAndNext(session, vLegalType, groupId,
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

	protected VLegalType getByGroupId_PrevAndNext(Session session,
		VLegalType vLegalType, long groupId,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_VLEGALTYPE_WHERE);

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
			query.append(VLegalTypeModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(groupId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByValues(vLegalType);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<VLegalType> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Finds the v legal type where groupId = &#63; and typeId = &#63; or throws a {@link com.vportal.portlet.vlegal.NoSuchVLegalTypeException} if it could not be found.
	 *
	 * @param groupId the group id to search with
	 * @param typeId the type id to search with
	 * @return the matching v legal type
	 * @throws com.vportal.portlet.vlegal.NoSuchVLegalTypeException if a matching v legal type could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public VLegalType findByG_T(long groupId, String typeId)
		throws NoSuchVLegalTypeException, SystemException {
		VLegalType vLegalType = fetchByG_T(groupId, typeId);

		if (vLegalType == null) {
			StringBundler msg = new StringBundler(6);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("groupId=");
			msg.append(groupId);

			msg.append(", typeId=");
			msg.append(typeId);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			if (_log.isWarnEnabled()) {
				_log.warn(msg.toString());
			}

			throw new NoSuchVLegalTypeException(msg.toString());
		}

		return vLegalType;
	}

	/**
	 * Finds the v legal type where groupId = &#63; and typeId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param groupId the group id to search with
	 * @param typeId the type id to search with
	 * @return the matching v legal type, or <code>null</code> if a matching v legal type could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public VLegalType fetchByG_T(long groupId, String typeId)
		throws SystemException {
		return fetchByG_T(groupId, typeId, true);
	}

	/**
	 * Finds the v legal type where groupId = &#63; and typeId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param groupId the group id to search with
	 * @param typeId the type id to search with
	 * @return the matching v legal type, or <code>null</code> if a matching v legal type could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public VLegalType fetchByG_T(long groupId, String typeId,
		boolean retrieveFromCache) throws SystemException {
		Object[] finderArgs = new Object[] { groupId, typeId };

		Object result = null;

		if (retrieveFromCache) {
			result = FinderCacheUtil.getResult(FINDER_PATH_FETCH_BY_G_T,
					finderArgs, this);
		}

		if (result == null) {
			StringBundler query = new StringBundler(4);

			query.append(_SQL_SELECT_VLEGALTYPE_WHERE);

			query.append(_FINDER_COLUMN_G_T_GROUPID_2);

			if (typeId == null) {
				query.append(_FINDER_COLUMN_G_T_TYPEID_1);
			}
			else {
				if (typeId.equals(StringPool.BLANK)) {
					query.append(_FINDER_COLUMN_G_T_TYPEID_3);
				}
				else {
					query.append(_FINDER_COLUMN_G_T_TYPEID_2);
				}
			}

			query.append(VLegalTypeModelImpl.ORDER_BY_JPQL);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(groupId);

				if (typeId != null) {
					qPos.add(typeId);
				}

				List<VLegalType> list = q.list();

				result = list;

				VLegalType vLegalType = null;

				if (list.isEmpty()) {
					FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_G_T,
						finderArgs, list);
				}
				else {
					vLegalType = list.get(0);

					cacheResult(vLegalType);

					if ((vLegalType.getGroupId() != groupId) ||
							(vLegalType.getTypeId() == null) ||
							!vLegalType.getTypeId().equals(typeId)) {
						FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_G_T,
							finderArgs, vLegalType);
					}
				}

				return vLegalType;
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (result == null) {
					FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_G_T,
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
				return (VLegalType)result;
			}
		}
	}

	/**
	 * Finds all the v legal types where groupId = &#63; and statusType = &#63; and language = &#63;.
	 *
	 * @param groupId the group id to search with
	 * @param statusType the status type to search with
	 * @param language the language to search with
	 * @return the matching v legal types
	 * @throws SystemException if a system exception occurred
	 */
	public List<VLegalType> findByS_L(long groupId, boolean statusType,
		String language) throws SystemException {
		return findByS_L(groupId, statusType, language, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Finds a range of all the v legal types where groupId = &#63; and statusType = &#63; and language = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param groupId the group id to search with
	 * @param statusType the status type to search with
	 * @param language the language to search with
	 * @param start the lower bound of the range of v legal types to return
	 * @param end the upper bound of the range of v legal types to return (not inclusive)
	 * @return the range of matching v legal types
	 * @throws SystemException if a system exception occurred
	 */
	public List<VLegalType> findByS_L(long groupId, boolean statusType,
		String language, int start, int end) throws SystemException {
		return findByS_L(groupId, statusType, language, start, end, null);
	}

	/**
	 * Finds an ordered range of all the v legal types where groupId = &#63; and statusType = &#63; and language = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param groupId the group id to search with
	 * @param statusType the status type to search with
	 * @param language the language to search with
	 * @param start the lower bound of the range of v legal types to return
	 * @param end the upper bound of the range of v legal types to return (not inclusive)
	 * @param orderByComparator the comparator to order the results by
	 * @return the ordered range of matching v legal types
	 * @throws SystemException if a system exception occurred
	 */
	public List<VLegalType> findByS_L(long groupId, boolean statusType,
		String language, int start, int end, OrderByComparator orderByComparator)
		throws SystemException {
		Object[] finderArgs = new Object[] {
				groupId, statusType, language,
				
				String.valueOf(start), String.valueOf(end),
				String.valueOf(orderByComparator)
			};

		List<VLegalType> list = (List<VLegalType>)FinderCacheUtil.getResult(FINDER_PATH_FIND_BY_S_L,
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

			query.append(_SQL_SELECT_VLEGALTYPE_WHERE);

			query.append(_FINDER_COLUMN_S_L_GROUPID_2);

			query.append(_FINDER_COLUMN_S_L_STATUSTYPE_2);

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
				query.append(VLegalTypeModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(groupId);

				qPos.add(statusType);

				if (language != null) {
					qPos.add(language);
				}

				list = (List<VLegalType>)QueryUtil.list(q, getDialect(), start,
						end);
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
	 * Finds the first v legal type in the ordered set where groupId = &#63; and statusType = &#63; and language = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param groupId the group id to search with
	 * @param statusType the status type to search with
	 * @param language the language to search with
	 * @param orderByComparator the comparator to order the set by
	 * @return the first matching v legal type
	 * @throws com.vportal.portlet.vlegal.NoSuchVLegalTypeException if a matching v legal type could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public VLegalType findByS_L_First(long groupId, boolean statusType,
		String language, OrderByComparator orderByComparator)
		throws NoSuchVLegalTypeException, SystemException {
		List<VLegalType> list = findByS_L(groupId, statusType, language, 0, 1,
				orderByComparator);

		if (list.isEmpty()) {
			StringBundler msg = new StringBundler(8);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("groupId=");
			msg.append(groupId);

			msg.append(", statusType=");
			msg.append(statusType);

			msg.append(", language=");
			msg.append(language);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			throw new NoSuchVLegalTypeException(msg.toString());
		}
		else {
			return list.get(0);
		}
	}

	/**
	 * Finds the last v legal type in the ordered set where groupId = &#63; and statusType = &#63; and language = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param groupId the group id to search with
	 * @param statusType the status type to search with
	 * @param language the language to search with
	 * @param orderByComparator the comparator to order the set by
	 * @return the last matching v legal type
	 * @throws com.vportal.portlet.vlegal.NoSuchVLegalTypeException if a matching v legal type could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public VLegalType findByS_L_Last(long groupId, boolean statusType,
		String language, OrderByComparator orderByComparator)
		throws NoSuchVLegalTypeException, SystemException {
		int count = countByS_L(groupId, statusType, language);

		List<VLegalType> list = findByS_L(groupId, statusType, language,
				count - 1, count, orderByComparator);

		if (list.isEmpty()) {
			StringBundler msg = new StringBundler(8);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("groupId=");
			msg.append(groupId);

			msg.append(", statusType=");
			msg.append(statusType);

			msg.append(", language=");
			msg.append(language);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			throw new NoSuchVLegalTypeException(msg.toString());
		}
		else {
			return list.get(0);
		}
	}

	/**
	 * Finds the v legal types before and after the current v legal type in the ordered set where groupId = &#63; and statusType = &#63; and language = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param typeId the primary key of the current v legal type
	 * @param groupId the group id to search with
	 * @param statusType the status type to search with
	 * @param language the language to search with
	 * @param orderByComparator the comparator to order the set by
	 * @return the previous, current, and next v legal type
	 * @throws com.vportal.portlet.vlegal.NoSuchVLegalTypeException if a v legal type with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public VLegalType[] findByS_L_PrevAndNext(String typeId, long groupId,
		boolean statusType, String language, OrderByComparator orderByComparator)
		throws NoSuchVLegalTypeException, SystemException {
		VLegalType vLegalType = findByPrimaryKey(typeId);

		Session session = null;

		try {
			session = openSession();

			VLegalType[] array = new VLegalTypeImpl[3];

			array[0] = getByS_L_PrevAndNext(session, vLegalType, groupId,
					statusType, language, orderByComparator, true);

			array[1] = vLegalType;

			array[2] = getByS_L_PrevAndNext(session, vLegalType, groupId,
					statusType, language, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected VLegalType getByS_L_PrevAndNext(Session session,
		VLegalType vLegalType, long groupId, boolean statusType,
		String language, OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_VLEGALTYPE_WHERE);

		query.append(_FINDER_COLUMN_S_L_GROUPID_2);

		query.append(_FINDER_COLUMN_S_L_STATUSTYPE_2);

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
			query.append(VLegalTypeModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(groupId);

		qPos.add(statusType);

		if (language != null) {
			qPos.add(language);
		}

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByValues(vLegalType);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<VLegalType> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Finds all the v legal types where groupId = &#63; and statusType = &#63; and rssable = &#63;.
	 *
	 * @param groupId the group id to search with
	 * @param statusType the status type to search with
	 * @param rssable the rssable to search with
	 * @return the matching v legal types
	 * @throws SystemException if a system exception occurred
	 */
	public List<VLegalType> findByS_Rss(long groupId, boolean statusType,
		boolean rssable) throws SystemException {
		return findByS_Rss(groupId, statusType, rssable, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Finds a range of all the v legal types where groupId = &#63; and statusType = &#63; and rssable = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param groupId the group id to search with
	 * @param statusType the status type to search with
	 * @param rssable the rssable to search with
	 * @param start the lower bound of the range of v legal types to return
	 * @param end the upper bound of the range of v legal types to return (not inclusive)
	 * @return the range of matching v legal types
	 * @throws SystemException if a system exception occurred
	 */
	public List<VLegalType> findByS_Rss(long groupId, boolean statusType,
		boolean rssable, int start, int end) throws SystemException {
		return findByS_Rss(groupId, statusType, rssable, start, end, null);
	}

	/**
	 * Finds an ordered range of all the v legal types where groupId = &#63; and statusType = &#63; and rssable = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param groupId the group id to search with
	 * @param statusType the status type to search with
	 * @param rssable the rssable to search with
	 * @param start the lower bound of the range of v legal types to return
	 * @param end the upper bound of the range of v legal types to return (not inclusive)
	 * @param orderByComparator the comparator to order the results by
	 * @return the ordered range of matching v legal types
	 * @throws SystemException if a system exception occurred
	 */
	public List<VLegalType> findByS_Rss(long groupId, boolean statusType,
		boolean rssable, int start, int end, OrderByComparator orderByComparator)
		throws SystemException {
		Object[] finderArgs = new Object[] {
				groupId, statusType, rssable,
				
				String.valueOf(start), String.valueOf(end),
				String.valueOf(orderByComparator)
			};

		List<VLegalType> list = (List<VLegalType>)FinderCacheUtil.getResult(FINDER_PATH_FIND_BY_S_RSS,
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

			query.append(_SQL_SELECT_VLEGALTYPE_WHERE);

			query.append(_FINDER_COLUMN_S_RSS_GROUPID_2);

			query.append(_FINDER_COLUMN_S_RSS_STATUSTYPE_2);

			query.append(_FINDER_COLUMN_S_RSS_RSSABLE_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}

			else {
				query.append(VLegalTypeModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(groupId);

				qPos.add(statusType);

				qPos.add(rssable);

				list = (List<VLegalType>)QueryUtil.list(q, getDialect(), start,
						end);
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
	 * Finds the first v legal type in the ordered set where groupId = &#63; and statusType = &#63; and rssable = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param groupId the group id to search with
	 * @param statusType the status type to search with
	 * @param rssable the rssable to search with
	 * @param orderByComparator the comparator to order the set by
	 * @return the first matching v legal type
	 * @throws com.vportal.portlet.vlegal.NoSuchVLegalTypeException if a matching v legal type could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public VLegalType findByS_Rss_First(long groupId, boolean statusType,
		boolean rssable, OrderByComparator orderByComparator)
		throws NoSuchVLegalTypeException, SystemException {
		List<VLegalType> list = findByS_Rss(groupId, statusType, rssable, 0, 1,
				orderByComparator);

		if (list.isEmpty()) {
			StringBundler msg = new StringBundler(8);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("groupId=");
			msg.append(groupId);

			msg.append(", statusType=");
			msg.append(statusType);

			msg.append(", rssable=");
			msg.append(rssable);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			throw new NoSuchVLegalTypeException(msg.toString());
		}
		else {
			return list.get(0);
		}
	}

	/**
	 * Finds the last v legal type in the ordered set where groupId = &#63; and statusType = &#63; and rssable = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param groupId the group id to search with
	 * @param statusType the status type to search with
	 * @param rssable the rssable to search with
	 * @param orderByComparator the comparator to order the set by
	 * @return the last matching v legal type
	 * @throws com.vportal.portlet.vlegal.NoSuchVLegalTypeException if a matching v legal type could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public VLegalType findByS_Rss_Last(long groupId, boolean statusType,
		boolean rssable, OrderByComparator orderByComparator)
		throws NoSuchVLegalTypeException, SystemException {
		int count = countByS_Rss(groupId, statusType, rssable);

		List<VLegalType> list = findByS_Rss(groupId, statusType, rssable,
				count - 1, count, orderByComparator);

		if (list.isEmpty()) {
			StringBundler msg = new StringBundler(8);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("groupId=");
			msg.append(groupId);

			msg.append(", statusType=");
			msg.append(statusType);

			msg.append(", rssable=");
			msg.append(rssable);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			throw new NoSuchVLegalTypeException(msg.toString());
		}
		else {
			return list.get(0);
		}
	}

	/**
	 * Finds the v legal types before and after the current v legal type in the ordered set where groupId = &#63; and statusType = &#63; and rssable = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param typeId the primary key of the current v legal type
	 * @param groupId the group id to search with
	 * @param statusType the status type to search with
	 * @param rssable the rssable to search with
	 * @param orderByComparator the comparator to order the set by
	 * @return the previous, current, and next v legal type
	 * @throws com.vportal.portlet.vlegal.NoSuchVLegalTypeException if a v legal type with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public VLegalType[] findByS_Rss_PrevAndNext(String typeId, long groupId,
		boolean statusType, boolean rssable, OrderByComparator orderByComparator)
		throws NoSuchVLegalTypeException, SystemException {
		VLegalType vLegalType = findByPrimaryKey(typeId);

		Session session = null;

		try {
			session = openSession();

			VLegalType[] array = new VLegalTypeImpl[3];

			array[0] = getByS_Rss_PrevAndNext(session, vLegalType, groupId,
					statusType, rssable, orderByComparator, true);

			array[1] = vLegalType;

			array[2] = getByS_Rss_PrevAndNext(session, vLegalType, groupId,
					statusType, rssable, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected VLegalType getByS_Rss_PrevAndNext(Session session,
		VLegalType vLegalType, long groupId, boolean statusType,
		boolean rssable, OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_VLEGALTYPE_WHERE);

		query.append(_FINDER_COLUMN_S_RSS_GROUPID_2);

		query.append(_FINDER_COLUMN_S_RSS_STATUSTYPE_2);

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
			query.append(VLegalTypeModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(groupId);

		qPos.add(statusType);

		qPos.add(rssable);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByValues(vLegalType);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<VLegalType> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Finds all the v legal types.
	 *
	 * @return the v legal types
	 * @throws SystemException if a system exception occurred
	 */
	public List<VLegalType> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Finds a range of all the v legal types.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param start the lower bound of the range of v legal types to return
	 * @param end the upper bound of the range of v legal types to return (not inclusive)
	 * @return the range of v legal types
	 * @throws SystemException if a system exception occurred
	 */
	public List<VLegalType> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Finds an ordered range of all the v legal types.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param start the lower bound of the range of v legal types to return
	 * @param end the upper bound of the range of v legal types to return (not inclusive)
	 * @param orderByComparator the comparator to order the results by
	 * @return the ordered range of v legal types
	 * @throws SystemException if a system exception occurred
	 */
	public List<VLegalType> findAll(int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		Object[] finderArgs = new Object[] {
				String.valueOf(start), String.valueOf(end),
				String.valueOf(orderByComparator)
			};

		List<VLegalType> list = (List<VLegalType>)FinderCacheUtil.getResult(FINDER_PATH_FIND_ALL,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_VLEGALTYPE);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_VLEGALTYPE.concat(VLegalTypeModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (orderByComparator == null) {
					list = (List<VLegalType>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);
				}
				else {
					list = (List<VLegalType>)QueryUtil.list(q, getDialect(),
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
	 * Removes all the v legal types where groupId = &#63; from the database.
	 *
	 * @param groupId the group id to search with
	 * @throws SystemException if a system exception occurred
	 */
	public void removeByGroupId(long groupId) throws SystemException {
		for (VLegalType vLegalType : findByGroupId(groupId)) {
			remove(vLegalType);
		}
	}

	/**
	 * Removes the v legal type where groupId = &#63; and typeId = &#63; from the database.
	 *
	 * @param groupId the group id to search with
	 * @param typeId the type id to search with
	 * @throws SystemException if a system exception occurred
	 */
	public void removeByG_T(long groupId, String typeId)
		throws NoSuchVLegalTypeException, SystemException {
		VLegalType vLegalType = findByG_T(groupId, typeId);

		remove(vLegalType);
	}

	/**
	 * Removes all the v legal types where groupId = &#63; and statusType = &#63; and language = &#63; from the database.
	 *
	 * @param groupId the group id to search with
	 * @param statusType the status type to search with
	 * @param language the language to search with
	 * @throws SystemException if a system exception occurred
	 */
	public void removeByS_L(long groupId, boolean statusType, String language)
		throws SystemException {
		for (VLegalType vLegalType : findByS_L(groupId, statusType, language)) {
			remove(vLegalType);
		}
	}

	/**
	 * Removes all the v legal types where groupId = &#63; and statusType = &#63; and rssable = &#63; from the database.
	 *
	 * @param groupId the group id to search with
	 * @param statusType the status type to search with
	 * @param rssable the rssable to search with
	 * @throws SystemException if a system exception occurred
	 */
	public void removeByS_Rss(long groupId, boolean statusType, boolean rssable)
		throws SystemException {
		for (VLegalType vLegalType : findByS_Rss(groupId, statusType, rssable)) {
			remove(vLegalType);
		}
	}

	/**
	 * Removes all the v legal types from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	public void removeAll() throws SystemException {
		for (VLegalType vLegalType : findAll()) {
			remove(vLegalType);
		}
	}

	/**
	 * Counts all the v legal types where groupId = &#63;.
	 *
	 * @param groupId the group id to search with
	 * @return the number of matching v legal types
	 * @throws SystemException if a system exception occurred
	 */
	public int countByGroupId(long groupId) throws SystemException {
		Object[] finderArgs = new Object[] { groupId };

		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_BY_GROUPID,
				finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_VLEGALTYPE_WHERE);

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
	 * Counts all the v legal types where groupId = &#63; and typeId = &#63;.
	 *
	 * @param groupId the group id to search with
	 * @param typeId the type id to search with
	 * @return the number of matching v legal types
	 * @throws SystemException if a system exception occurred
	 */
	public int countByG_T(long groupId, String typeId)
		throws SystemException {
		Object[] finderArgs = new Object[] { groupId, typeId };

		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_BY_G_T,
				finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_VLEGALTYPE_WHERE);

			query.append(_FINDER_COLUMN_G_T_GROUPID_2);

			if (typeId == null) {
				query.append(_FINDER_COLUMN_G_T_TYPEID_1);
			}
			else {
				if (typeId.equals(StringPool.BLANK)) {
					query.append(_FINDER_COLUMN_G_T_TYPEID_3);
				}
				else {
					query.append(_FINDER_COLUMN_G_T_TYPEID_2);
				}
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(groupId);

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

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_G_T, finderArgs,
					count);

				closeSession(session);
			}
		}

		return count.intValue();
	}

	/**
	 * Counts all the v legal types where groupId = &#63; and statusType = &#63; and language = &#63;.
	 *
	 * @param groupId the group id to search with
	 * @param statusType the status type to search with
	 * @param language the language to search with
	 * @return the number of matching v legal types
	 * @throws SystemException if a system exception occurred
	 */
	public int countByS_L(long groupId, boolean statusType, String language)
		throws SystemException {
		Object[] finderArgs = new Object[] { groupId, statusType, language };

		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_BY_S_L,
				finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(4);

			query.append(_SQL_COUNT_VLEGALTYPE_WHERE);

			query.append(_FINDER_COLUMN_S_L_GROUPID_2);

			query.append(_FINDER_COLUMN_S_L_STATUSTYPE_2);

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

				qPos.add(statusType);

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
	 * Counts all the v legal types where groupId = &#63; and statusType = &#63; and rssable = &#63;.
	 *
	 * @param groupId the group id to search with
	 * @param statusType the status type to search with
	 * @param rssable the rssable to search with
	 * @return the number of matching v legal types
	 * @throws SystemException if a system exception occurred
	 */
	public int countByS_Rss(long groupId, boolean statusType, boolean rssable)
		throws SystemException {
		Object[] finderArgs = new Object[] { groupId, statusType, rssable };

		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_BY_S_RSS,
				finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(4);

			query.append(_SQL_COUNT_VLEGALTYPE_WHERE);

			query.append(_FINDER_COLUMN_S_RSS_GROUPID_2);

			query.append(_FINDER_COLUMN_S_RSS_STATUSTYPE_2);

			query.append(_FINDER_COLUMN_S_RSS_RSSABLE_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(groupId);

				qPos.add(statusType);

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
	 * Counts all the v legal types.
	 *
	 * @return the number of v legal types
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

				Query q = session.createQuery(_SQL_COUNT_VLEGALTYPE);

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
	 * Initializes the v legal type persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.com.vportal.portlet.vlegal.model.VLegalType")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<VLegalType>> listenersList = new ArrayList<ModelListener<VLegalType>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<VLegalType>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(VLegalTypeImpl.class.getName());
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
	private static final String _SQL_SELECT_VLEGALTYPE = "SELECT vLegalType FROM VLegalType vLegalType";
	private static final String _SQL_SELECT_VLEGALTYPE_WHERE = "SELECT vLegalType FROM VLegalType vLegalType WHERE ";
	private static final String _SQL_COUNT_VLEGALTYPE = "SELECT COUNT(vLegalType) FROM VLegalType vLegalType";
	private static final String _SQL_COUNT_VLEGALTYPE_WHERE = "SELECT COUNT(vLegalType) FROM VLegalType vLegalType WHERE ";
	private static final String _FINDER_COLUMN_GROUPID_GROUPID_2 = "vLegalType.groupId = ?";
	private static final String _FINDER_COLUMN_G_T_GROUPID_2 = "vLegalType.groupId = ? AND ";
	private static final String _FINDER_COLUMN_G_T_TYPEID_1 = "vLegalType.typeId IS NULL";
	private static final String _FINDER_COLUMN_G_T_TYPEID_2 = "vLegalType.typeId = ?";
	private static final String _FINDER_COLUMN_G_T_TYPEID_3 = "(vLegalType.typeId IS NULL OR vLegalType.typeId = ?)";
	private static final String _FINDER_COLUMN_S_L_GROUPID_2 = "vLegalType.groupId = ? AND ";
	private static final String _FINDER_COLUMN_S_L_STATUSTYPE_2 = "vLegalType.statusType = ? AND ";
	private static final String _FINDER_COLUMN_S_L_LANGUAGE_1 = "vLegalType.language IS NULL";
	private static final String _FINDER_COLUMN_S_L_LANGUAGE_2 = "vLegalType.language = ?";
	private static final String _FINDER_COLUMN_S_L_LANGUAGE_3 = "(vLegalType.language IS NULL OR vLegalType.language = ?)";
	private static final String _FINDER_COLUMN_S_RSS_GROUPID_2 = "vLegalType.groupId = ? AND ";
	private static final String _FINDER_COLUMN_S_RSS_STATUSTYPE_2 = "vLegalType.statusType = ? AND ";
	private static final String _FINDER_COLUMN_S_RSS_RSSABLE_2 = "vLegalType.rssable = ?";
	private static final String _ORDER_BY_ENTITY_ALIAS = "vLegalType.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No VLegalType exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No VLegalType exists with the key {";
	private static Log _log = LogFactoryUtil.getLog(VLegalTypePersistenceImpl.class);
}