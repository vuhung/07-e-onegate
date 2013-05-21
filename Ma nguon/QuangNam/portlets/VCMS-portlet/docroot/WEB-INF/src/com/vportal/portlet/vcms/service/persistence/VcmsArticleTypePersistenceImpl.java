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

package com.vportal.portlet.vcms.service.persistence;

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

import com.vportal.portlet.vcms.NoSuchVcmsArticleTypeException;
import com.vportal.portlet.vcms.model.VcmsArticleType;
import com.vportal.portlet.vcms.model.impl.VcmsArticleTypeImpl;
import com.vportal.portlet.vcms.model.impl.VcmsArticleTypeModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The persistence implementation for the vcms article type service.
 *
 * <p>
 * Never modify or reference this class directly. Always use {@link VcmsArticleTypeUtil} to access the vcms article type persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
 * </p>
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author HOAN
 * @see VcmsArticleTypePersistence
 * @see VcmsArticleTypeUtil
 * @generated
 */
public class VcmsArticleTypePersistenceImpl extends BasePersistenceImpl<VcmsArticleType>
	implements VcmsArticleTypePersistence {
	public static final String FINDER_CLASS_NAME_ENTITY = VcmsArticleTypeImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST = FINDER_CLASS_NAME_ENTITY +
		".List";
	public static final FinderPath FINDER_PATH_FIND_BY_TYPE = new FinderPath(VcmsArticleTypeModelImpl.ENTITY_CACHE_ENABLED,
			VcmsArticleTypeModelImpl.FINDER_CACHE_ENABLED,
			FINDER_CLASS_NAME_LIST, "findByType",
			new String[] {
				Long.class.getName(),
				
			"java.lang.Integer", "java.lang.Integer",
				"com.liferay.portal.kernel.util.OrderByComparator"
			});
	public static final FinderPath FINDER_PATH_COUNT_BY_TYPE = new FinderPath(VcmsArticleTypeModelImpl.ENTITY_CACHE_ENABLED,
			VcmsArticleTypeModelImpl.FINDER_CACHE_ENABLED,
			FINDER_CLASS_NAME_LIST, "countByType",
			new String[] { Long.class.getName() });
	public static final FinderPath FINDER_PATH_FIND_BY_ARTICLE = new FinderPath(VcmsArticleTypeModelImpl.ENTITY_CACHE_ENABLED,
			VcmsArticleTypeModelImpl.FINDER_CACHE_ENABLED,
			FINDER_CLASS_NAME_LIST, "findByArticle",
			new String[] {
				String.class.getName(),
				
			"java.lang.Integer", "java.lang.Integer",
				"com.liferay.portal.kernel.util.OrderByComparator"
			});
	public static final FinderPath FINDER_PATH_COUNT_BY_ARTICLE = new FinderPath(VcmsArticleTypeModelImpl.ENTITY_CACHE_ENABLED,
			VcmsArticleTypeModelImpl.FINDER_CACHE_ENABLED,
			FINDER_CLASS_NAME_LIST, "countByArticle",
			new String[] { String.class.getName() });
	public static final FinderPath FINDER_PATH_FETCH_BY_ARTICLEBYTYPE = new FinderPath(VcmsArticleTypeModelImpl.ENTITY_CACHE_ENABLED,
			VcmsArticleTypeModelImpl.FINDER_CACHE_ENABLED,
			FINDER_CLASS_NAME_ENTITY, "fetchByArticleByType",
			new String[] { Long.class.getName(), String.class.getName() });
	public static final FinderPath FINDER_PATH_COUNT_BY_ARTICLEBYTYPE = new FinderPath(VcmsArticleTypeModelImpl.ENTITY_CACHE_ENABLED,
			VcmsArticleTypeModelImpl.FINDER_CACHE_ENABLED,
			FINDER_CLASS_NAME_LIST, "countByArticleByType",
			new String[] { Long.class.getName(), String.class.getName() });
	public static final FinderPath FINDER_PATH_FIND_ALL = new FinderPath(VcmsArticleTypeModelImpl.ENTITY_CACHE_ENABLED,
			VcmsArticleTypeModelImpl.FINDER_CACHE_ENABLED,
			FINDER_CLASS_NAME_LIST, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(VcmsArticleTypeModelImpl.ENTITY_CACHE_ENABLED,
			VcmsArticleTypeModelImpl.FINDER_CACHE_ENABLED,
			FINDER_CLASS_NAME_LIST, "countAll", new String[0]);

	/**
	 * Caches the vcms article type in the entity cache if it is enabled.
	 *
	 * @param vcmsArticleType the vcms article type to cache
	 */
	public void cacheResult(VcmsArticleType vcmsArticleType) {
		EntityCacheUtil.putResult(VcmsArticleTypeModelImpl.ENTITY_CACHE_ENABLED,
			VcmsArticleTypeImpl.class, vcmsArticleType.getPrimaryKey(),
			vcmsArticleType);

		FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_ARTICLEBYTYPE,
			new Object[] {
				new Long(vcmsArticleType.getTypeId()),
				
			vcmsArticleType.getArticleId()
			}, vcmsArticleType);
	}

	/**
	 * Caches the vcms article types in the entity cache if it is enabled.
	 *
	 * @param vcmsArticleTypes the vcms article types to cache
	 */
	public void cacheResult(List<VcmsArticleType> vcmsArticleTypes) {
		for (VcmsArticleType vcmsArticleType : vcmsArticleTypes) {
			if (EntityCacheUtil.getResult(
						VcmsArticleTypeModelImpl.ENTITY_CACHE_ENABLED,
						VcmsArticleTypeImpl.class,
						vcmsArticleType.getPrimaryKey(), this) == null) {
				cacheResult(vcmsArticleType);
			}
		}
	}

	/**
	 * Clears the cache for all vcms article types.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	public void clearCache() {
		CacheRegistryUtil.clear(VcmsArticleTypeImpl.class.getName());
		EntityCacheUtil.clearCache(VcmsArticleTypeImpl.class.getName());
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST);
	}

	/**
	 * Clears the cache for the vcms article type.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	public void clearCache(VcmsArticleType vcmsArticleType) {
		EntityCacheUtil.removeResult(VcmsArticleTypeModelImpl.ENTITY_CACHE_ENABLED,
			VcmsArticleTypeImpl.class, vcmsArticleType.getPrimaryKey());

		FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_ARTICLEBYTYPE,
			new Object[] {
				new Long(vcmsArticleType.getTypeId()),
				
			vcmsArticleType.getArticleId()
			});
	}

	/**
	 * Creates a new vcms article type with the primary key. Does not add the vcms article type to the database.
	 *
	 * @param vcmsArticleTypePK the primary key for the new vcms article type
	 * @return the new vcms article type
	 */
	public VcmsArticleType create(VcmsArticleTypePK vcmsArticleTypePK) {
		VcmsArticleType vcmsArticleType = new VcmsArticleTypeImpl();

		vcmsArticleType.setNew(true);
		vcmsArticleType.setPrimaryKey(vcmsArticleTypePK);

		return vcmsArticleType;
	}

	/**
	 * Removes the vcms article type with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the vcms article type to remove
	 * @return the vcms article type that was removed
	 * @throws com.liferay.portal.NoSuchModelException if a vcms article type with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public VcmsArticleType remove(Serializable primaryKey)
		throws NoSuchModelException, SystemException {
		return remove((VcmsArticleTypePK)primaryKey);
	}

	/**
	 * Removes the vcms article type with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param vcmsArticleTypePK the primary key of the vcms article type to remove
	 * @return the vcms article type that was removed
	 * @throws com.vportal.portlet.vcms.NoSuchVcmsArticleTypeException if a vcms article type with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public VcmsArticleType remove(VcmsArticleTypePK vcmsArticleTypePK)
		throws NoSuchVcmsArticleTypeException, SystemException {
		Session session = null;

		try {
			session = openSession();

			VcmsArticleType vcmsArticleType = (VcmsArticleType)session.get(VcmsArticleTypeImpl.class,
					vcmsArticleTypePK);

			if (vcmsArticleType == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
						vcmsArticleTypePK);
				}

				throw new NoSuchVcmsArticleTypeException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					vcmsArticleTypePK);
			}

			return remove(vcmsArticleType);
		}
		catch (NoSuchVcmsArticleTypeException nsee) {
			throw nsee;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected VcmsArticleType removeImpl(VcmsArticleType vcmsArticleType)
		throws SystemException {
		vcmsArticleType = toUnwrappedModel(vcmsArticleType);

		Session session = null;

		try {
			session = openSession();

			BatchSessionUtil.delete(session, vcmsArticleType);
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST);

		VcmsArticleTypeModelImpl vcmsArticleTypeModelImpl = (VcmsArticleTypeModelImpl)vcmsArticleType;

		FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_ARTICLEBYTYPE,
			new Object[] {
				new Long(vcmsArticleTypeModelImpl.getTypeId()),
				
			vcmsArticleTypeModelImpl.getArticleId()
			});

		EntityCacheUtil.removeResult(VcmsArticleTypeModelImpl.ENTITY_CACHE_ENABLED,
			VcmsArticleTypeImpl.class, vcmsArticleType.getPrimaryKey());

		return vcmsArticleType;
	}

	public VcmsArticleType updateImpl(
		com.vportal.portlet.vcms.model.VcmsArticleType vcmsArticleType,
		boolean merge) throws SystemException {
		vcmsArticleType = toUnwrappedModel(vcmsArticleType);

		boolean isNew = vcmsArticleType.isNew();

		VcmsArticleTypeModelImpl vcmsArticleTypeModelImpl = (VcmsArticleTypeModelImpl)vcmsArticleType;

		Session session = null;

		try {
			session = openSession();

			BatchSessionUtil.update(session, vcmsArticleType, merge);

			vcmsArticleType.setNew(false);
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST);

		EntityCacheUtil.putResult(VcmsArticleTypeModelImpl.ENTITY_CACHE_ENABLED,
			VcmsArticleTypeImpl.class, vcmsArticleType.getPrimaryKey(),
			vcmsArticleType);

		if (!isNew &&
				((vcmsArticleType.getTypeId() != vcmsArticleTypeModelImpl.getOriginalTypeId()) ||
				!Validator.equals(vcmsArticleType.getArticleId(),
					vcmsArticleTypeModelImpl.getOriginalArticleId()))) {
			FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_ARTICLEBYTYPE,
				new Object[] {
					new Long(vcmsArticleTypeModelImpl.getOriginalTypeId()),
					
				vcmsArticleTypeModelImpl.getOriginalArticleId()
				});
		}

		if (isNew ||
				((vcmsArticleType.getTypeId() != vcmsArticleTypeModelImpl.getOriginalTypeId()) ||
				!Validator.equals(vcmsArticleType.getArticleId(),
					vcmsArticleTypeModelImpl.getOriginalArticleId()))) {
			FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_ARTICLEBYTYPE,
				new Object[] {
					new Long(vcmsArticleType.getTypeId()),
					
				vcmsArticleType.getArticleId()
				}, vcmsArticleType);
		}

		return vcmsArticleType;
	}

	protected VcmsArticleType toUnwrappedModel(VcmsArticleType vcmsArticleType) {
		if (vcmsArticleType instanceof VcmsArticleTypeImpl) {
			return vcmsArticleType;
		}

		VcmsArticleTypeImpl vcmsArticleTypeImpl = new VcmsArticleTypeImpl();

		vcmsArticleTypeImpl.setNew(vcmsArticleType.isNew());
		vcmsArticleTypeImpl.setPrimaryKey(vcmsArticleType.getPrimaryKey());

		vcmsArticleTypeImpl.setTypeId(vcmsArticleType.getTypeId());
		vcmsArticleTypeImpl.setArticleId(vcmsArticleType.getArticleId());
		vcmsArticleTypeImpl.setPosition(vcmsArticleType.getPosition());

		return vcmsArticleTypeImpl;
	}

	/**
	 * Finds the vcms article type with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the vcms article type to find
	 * @return the vcms article type
	 * @throws com.liferay.portal.NoSuchModelException if a vcms article type with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public VcmsArticleType findByPrimaryKey(Serializable primaryKey)
		throws NoSuchModelException, SystemException {
		return findByPrimaryKey((VcmsArticleTypePK)primaryKey);
	}

	/**
	 * Finds the vcms article type with the primary key or throws a {@link com.vportal.portlet.vcms.NoSuchVcmsArticleTypeException} if it could not be found.
	 *
	 * @param vcmsArticleTypePK the primary key of the vcms article type to find
	 * @return the vcms article type
	 * @throws com.vportal.portlet.vcms.NoSuchVcmsArticleTypeException if a vcms article type with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public VcmsArticleType findByPrimaryKey(VcmsArticleTypePK vcmsArticleTypePK)
		throws NoSuchVcmsArticleTypeException, SystemException {
		VcmsArticleType vcmsArticleType = fetchByPrimaryKey(vcmsArticleTypePK);

		if (vcmsArticleType == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + vcmsArticleTypePK);
			}

			throw new NoSuchVcmsArticleTypeException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				vcmsArticleTypePK);
		}

		return vcmsArticleType;
	}

	/**
	 * Finds the vcms article type with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the vcms article type to find
	 * @return the vcms article type, or <code>null</code> if a vcms article type with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public VcmsArticleType fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		return fetchByPrimaryKey((VcmsArticleTypePK)primaryKey);
	}

	/**
	 * Finds the vcms article type with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param vcmsArticleTypePK the primary key of the vcms article type to find
	 * @return the vcms article type, or <code>null</code> if a vcms article type with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public VcmsArticleType fetchByPrimaryKey(
		VcmsArticleTypePK vcmsArticleTypePK) throws SystemException {
		VcmsArticleType vcmsArticleType = (VcmsArticleType)EntityCacheUtil.getResult(VcmsArticleTypeModelImpl.ENTITY_CACHE_ENABLED,
				VcmsArticleTypeImpl.class, vcmsArticleTypePK, this);

		if (vcmsArticleType == null) {
			Session session = null;

			try {
				session = openSession();

				vcmsArticleType = (VcmsArticleType)session.get(VcmsArticleTypeImpl.class,
						vcmsArticleTypePK);
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (vcmsArticleType != null) {
					cacheResult(vcmsArticleType);
				}

				closeSession(session);
			}
		}

		return vcmsArticleType;
	}

	/**
	 * Finds all the vcms article types where typeId = &#63;.
	 *
	 * @param typeId the type id to search with
	 * @return the matching vcms article types
	 * @throws SystemException if a system exception occurred
	 */
	public List<VcmsArticleType> findByType(long typeId)
		throws SystemException {
		return findByType(typeId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Finds a range of all the vcms article types where typeId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param typeId the type id to search with
	 * @param start the lower bound of the range of vcms article types to return
	 * @param end the upper bound of the range of vcms article types to return (not inclusive)
	 * @return the range of matching vcms article types
	 * @throws SystemException if a system exception occurred
	 */
	public List<VcmsArticleType> findByType(long typeId, int start, int end)
		throws SystemException {
		return findByType(typeId, start, end, null);
	}

	/**
	 * Finds an ordered range of all the vcms article types where typeId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param typeId the type id to search with
	 * @param start the lower bound of the range of vcms article types to return
	 * @param end the upper bound of the range of vcms article types to return (not inclusive)
	 * @param orderByComparator the comparator to order the results by
	 * @return the ordered range of matching vcms article types
	 * @throws SystemException if a system exception occurred
	 */
	public List<VcmsArticleType> findByType(long typeId, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		Object[] finderArgs = new Object[] {
				typeId,
				
				String.valueOf(start), String.valueOf(end),
				String.valueOf(orderByComparator)
			};

		List<VcmsArticleType> list = (List<VcmsArticleType>)FinderCacheUtil.getResult(FINDER_PATH_FIND_BY_TYPE,
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

			query.append(_SQL_SELECT_VCMSARTICLETYPE_WHERE);

			query.append(_FINDER_COLUMN_TYPE_TYPEID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}

			else {
				query.append(VcmsArticleTypeModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(typeId);

				list = (List<VcmsArticleType>)QueryUtil.list(q, getDialect(),
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
	 * Finds the first vcms article type in the ordered set where typeId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param typeId the type id to search with
	 * @param orderByComparator the comparator to order the set by
	 * @return the first matching vcms article type
	 * @throws com.vportal.portlet.vcms.NoSuchVcmsArticleTypeException if a matching vcms article type could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public VcmsArticleType findByType_First(long typeId,
		OrderByComparator orderByComparator)
		throws NoSuchVcmsArticleTypeException, SystemException {
		List<VcmsArticleType> list = findByType(typeId, 0, 1, orderByComparator);

		if (list.isEmpty()) {
			StringBundler msg = new StringBundler(4);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("typeId=");
			msg.append(typeId);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			throw new NoSuchVcmsArticleTypeException(msg.toString());
		}
		else {
			return list.get(0);
		}
	}

	/**
	 * Finds the last vcms article type in the ordered set where typeId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param typeId the type id to search with
	 * @param orderByComparator the comparator to order the set by
	 * @return the last matching vcms article type
	 * @throws com.vportal.portlet.vcms.NoSuchVcmsArticleTypeException if a matching vcms article type could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public VcmsArticleType findByType_Last(long typeId,
		OrderByComparator orderByComparator)
		throws NoSuchVcmsArticleTypeException, SystemException {
		int count = countByType(typeId);

		List<VcmsArticleType> list = findByType(typeId, count - 1, count,
				orderByComparator);

		if (list.isEmpty()) {
			StringBundler msg = new StringBundler(4);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("typeId=");
			msg.append(typeId);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			throw new NoSuchVcmsArticleTypeException(msg.toString());
		}
		else {
			return list.get(0);
		}
	}

	/**
	 * Finds the vcms article types before and after the current vcms article type in the ordered set where typeId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param vcmsArticleTypePK the primary key of the current vcms article type
	 * @param typeId the type id to search with
	 * @param orderByComparator the comparator to order the set by
	 * @return the previous, current, and next vcms article type
	 * @throws com.vportal.portlet.vcms.NoSuchVcmsArticleTypeException if a vcms article type with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public VcmsArticleType[] findByType_PrevAndNext(
		VcmsArticleTypePK vcmsArticleTypePK, long typeId,
		OrderByComparator orderByComparator)
		throws NoSuchVcmsArticleTypeException, SystemException {
		VcmsArticleType vcmsArticleType = findByPrimaryKey(vcmsArticleTypePK);

		Session session = null;

		try {
			session = openSession();

			VcmsArticleType[] array = new VcmsArticleTypeImpl[3];

			array[0] = getByType_PrevAndNext(session, vcmsArticleType, typeId,
					orderByComparator, true);

			array[1] = vcmsArticleType;

			array[2] = getByType_PrevAndNext(session, vcmsArticleType, typeId,
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

	protected VcmsArticleType getByType_PrevAndNext(Session session,
		VcmsArticleType vcmsArticleType, long typeId,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_VCMSARTICLETYPE_WHERE);

		query.append(_FINDER_COLUMN_TYPE_TYPEID_2);

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
			query.append(VcmsArticleTypeModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(typeId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByValues(vcmsArticleType);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<VcmsArticleType> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Finds all the vcms article types where articleId = &#63;.
	 *
	 * @param articleId the article id to search with
	 * @return the matching vcms article types
	 * @throws SystemException if a system exception occurred
	 */
	public List<VcmsArticleType> findByArticle(String articleId)
		throws SystemException {
		return findByArticle(articleId, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
			null);
	}

	/**
	 * Finds a range of all the vcms article types where articleId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param articleId the article id to search with
	 * @param start the lower bound of the range of vcms article types to return
	 * @param end the upper bound of the range of vcms article types to return (not inclusive)
	 * @return the range of matching vcms article types
	 * @throws SystemException if a system exception occurred
	 */
	public List<VcmsArticleType> findByArticle(String articleId, int start,
		int end) throws SystemException {
		return findByArticle(articleId, start, end, null);
	}

	/**
	 * Finds an ordered range of all the vcms article types where articleId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param articleId the article id to search with
	 * @param start the lower bound of the range of vcms article types to return
	 * @param end the upper bound of the range of vcms article types to return (not inclusive)
	 * @param orderByComparator the comparator to order the results by
	 * @return the ordered range of matching vcms article types
	 * @throws SystemException if a system exception occurred
	 */
	public List<VcmsArticleType> findByArticle(String articleId, int start,
		int end, OrderByComparator orderByComparator) throws SystemException {
		Object[] finderArgs = new Object[] {
				articleId,
				
				String.valueOf(start), String.valueOf(end),
				String.valueOf(orderByComparator)
			};

		List<VcmsArticleType> list = (List<VcmsArticleType>)FinderCacheUtil.getResult(FINDER_PATH_FIND_BY_ARTICLE,
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

			query.append(_SQL_SELECT_VCMSARTICLETYPE_WHERE);

			if (articleId == null) {
				query.append(_FINDER_COLUMN_ARTICLE_ARTICLEID_1);
			}
			else {
				if (articleId.equals(StringPool.BLANK)) {
					query.append(_FINDER_COLUMN_ARTICLE_ARTICLEID_3);
				}
				else {
					query.append(_FINDER_COLUMN_ARTICLE_ARTICLEID_2);
				}
			}

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}

			else {
				query.append(VcmsArticleTypeModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (articleId != null) {
					qPos.add(articleId);
				}

				list = (List<VcmsArticleType>)QueryUtil.list(q, getDialect(),
						start, end);
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (list == null) {
					FinderCacheUtil.removeResult(FINDER_PATH_FIND_BY_ARTICLE,
						finderArgs);
				}
				else {
					cacheResult(list);

					FinderCacheUtil.putResult(FINDER_PATH_FIND_BY_ARTICLE,
						finderArgs, list);
				}

				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Finds the first vcms article type in the ordered set where articleId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param articleId the article id to search with
	 * @param orderByComparator the comparator to order the set by
	 * @return the first matching vcms article type
	 * @throws com.vportal.portlet.vcms.NoSuchVcmsArticleTypeException if a matching vcms article type could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public VcmsArticleType findByArticle_First(String articleId,
		OrderByComparator orderByComparator)
		throws NoSuchVcmsArticleTypeException, SystemException {
		List<VcmsArticleType> list = findByArticle(articleId, 0, 1,
				orderByComparator);

		if (list.isEmpty()) {
			StringBundler msg = new StringBundler(4);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("articleId=");
			msg.append(articleId);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			throw new NoSuchVcmsArticleTypeException(msg.toString());
		}
		else {
			return list.get(0);
		}
	}

	/**
	 * Finds the last vcms article type in the ordered set where articleId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param articleId the article id to search with
	 * @param orderByComparator the comparator to order the set by
	 * @return the last matching vcms article type
	 * @throws com.vportal.portlet.vcms.NoSuchVcmsArticleTypeException if a matching vcms article type could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public VcmsArticleType findByArticle_Last(String articleId,
		OrderByComparator orderByComparator)
		throws NoSuchVcmsArticleTypeException, SystemException {
		int count = countByArticle(articleId);

		List<VcmsArticleType> list = findByArticle(articleId, count - 1, count,
				orderByComparator);

		if (list.isEmpty()) {
			StringBundler msg = new StringBundler(4);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("articleId=");
			msg.append(articleId);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			throw new NoSuchVcmsArticleTypeException(msg.toString());
		}
		else {
			return list.get(0);
		}
	}

	/**
	 * Finds the vcms article types before and after the current vcms article type in the ordered set where articleId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param vcmsArticleTypePK the primary key of the current vcms article type
	 * @param articleId the article id to search with
	 * @param orderByComparator the comparator to order the set by
	 * @return the previous, current, and next vcms article type
	 * @throws com.vportal.portlet.vcms.NoSuchVcmsArticleTypeException if a vcms article type with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public VcmsArticleType[] findByArticle_PrevAndNext(
		VcmsArticleTypePK vcmsArticleTypePK, String articleId,
		OrderByComparator orderByComparator)
		throws NoSuchVcmsArticleTypeException, SystemException {
		VcmsArticleType vcmsArticleType = findByPrimaryKey(vcmsArticleTypePK);

		Session session = null;

		try {
			session = openSession();

			VcmsArticleType[] array = new VcmsArticleTypeImpl[3];

			array[0] = getByArticle_PrevAndNext(session, vcmsArticleType,
					articleId, orderByComparator, true);

			array[1] = vcmsArticleType;

			array[2] = getByArticle_PrevAndNext(session, vcmsArticleType,
					articleId, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected VcmsArticleType getByArticle_PrevAndNext(Session session,
		VcmsArticleType vcmsArticleType, String articleId,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_VCMSARTICLETYPE_WHERE);

		if (articleId == null) {
			query.append(_FINDER_COLUMN_ARTICLE_ARTICLEID_1);
		}
		else {
			if (articleId.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_ARTICLE_ARTICLEID_3);
			}
			else {
				query.append(_FINDER_COLUMN_ARTICLE_ARTICLEID_2);
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
			query.append(VcmsArticleTypeModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		if (articleId != null) {
			qPos.add(articleId);
		}

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByValues(vcmsArticleType);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<VcmsArticleType> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Finds the vcms article type where typeId = &#63; and articleId = &#63; or throws a {@link com.vportal.portlet.vcms.NoSuchVcmsArticleTypeException} if it could not be found.
	 *
	 * @param typeId the type id to search with
	 * @param articleId the article id to search with
	 * @return the matching vcms article type
	 * @throws com.vportal.portlet.vcms.NoSuchVcmsArticleTypeException if a matching vcms article type could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public VcmsArticleType findByArticleByType(long typeId, String articleId)
		throws NoSuchVcmsArticleTypeException, SystemException {
		VcmsArticleType vcmsArticleType = fetchByArticleByType(typeId, articleId);

		if (vcmsArticleType == null) {
			StringBundler msg = new StringBundler(6);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("typeId=");
			msg.append(typeId);

			msg.append(", articleId=");
			msg.append(articleId);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			if (_log.isWarnEnabled()) {
				_log.warn(msg.toString());
			}

			throw new NoSuchVcmsArticleTypeException(msg.toString());
		}

		return vcmsArticleType;
	}

	/**
	 * Finds the vcms article type where typeId = &#63; and articleId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param typeId the type id to search with
	 * @param articleId the article id to search with
	 * @return the matching vcms article type, or <code>null</code> if a matching vcms article type could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public VcmsArticleType fetchByArticleByType(long typeId, String articleId)
		throws SystemException {
		return fetchByArticleByType(typeId, articleId, true);
	}

	/**
	 * Finds the vcms article type where typeId = &#63; and articleId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param typeId the type id to search with
	 * @param articleId the article id to search with
	 * @return the matching vcms article type, or <code>null</code> if a matching vcms article type could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public VcmsArticleType fetchByArticleByType(long typeId, String articleId,
		boolean retrieveFromCache) throws SystemException {
		Object[] finderArgs = new Object[] { typeId, articleId };

		Object result = null;

		if (retrieveFromCache) {
			result = FinderCacheUtil.getResult(FINDER_PATH_FETCH_BY_ARTICLEBYTYPE,
					finderArgs, this);
		}

		if (result == null) {
			StringBundler query = new StringBundler(4);

			query.append(_SQL_SELECT_VCMSARTICLETYPE_WHERE);

			query.append(_FINDER_COLUMN_ARTICLEBYTYPE_TYPEID_2);

			if (articleId == null) {
				query.append(_FINDER_COLUMN_ARTICLEBYTYPE_ARTICLEID_1);
			}
			else {
				if (articleId.equals(StringPool.BLANK)) {
					query.append(_FINDER_COLUMN_ARTICLEBYTYPE_ARTICLEID_3);
				}
				else {
					query.append(_FINDER_COLUMN_ARTICLEBYTYPE_ARTICLEID_2);
				}
			}

			query.append(VcmsArticleTypeModelImpl.ORDER_BY_JPQL);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(typeId);

				if (articleId != null) {
					qPos.add(articleId);
				}

				List<VcmsArticleType> list = q.list();

				result = list;

				VcmsArticleType vcmsArticleType = null;

				if (list.isEmpty()) {
					FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_ARTICLEBYTYPE,
						finderArgs, list);
				}
				else {
					vcmsArticleType = list.get(0);

					cacheResult(vcmsArticleType);

					if ((vcmsArticleType.getTypeId() != typeId) ||
							(vcmsArticleType.getArticleId() == null) ||
							!vcmsArticleType.getArticleId().equals(articleId)) {
						FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_ARTICLEBYTYPE,
							finderArgs, vcmsArticleType);
					}
				}

				return vcmsArticleType;
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (result == null) {
					FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_ARTICLEBYTYPE,
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
				return (VcmsArticleType)result;
			}
		}
	}

	/**
	 * Finds all the vcms article types.
	 *
	 * @return the vcms article types
	 * @throws SystemException if a system exception occurred
	 */
	public List<VcmsArticleType> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Finds a range of all the vcms article types.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param start the lower bound of the range of vcms article types to return
	 * @param end the upper bound of the range of vcms article types to return (not inclusive)
	 * @return the range of vcms article types
	 * @throws SystemException if a system exception occurred
	 */
	public List<VcmsArticleType> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Finds an ordered range of all the vcms article types.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param start the lower bound of the range of vcms article types to return
	 * @param end the upper bound of the range of vcms article types to return (not inclusive)
	 * @param orderByComparator the comparator to order the results by
	 * @return the ordered range of vcms article types
	 * @throws SystemException if a system exception occurred
	 */
	public List<VcmsArticleType> findAll(int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		Object[] finderArgs = new Object[] {
				String.valueOf(start), String.valueOf(end),
				String.valueOf(orderByComparator)
			};

		List<VcmsArticleType> list = (List<VcmsArticleType>)FinderCacheUtil.getResult(FINDER_PATH_FIND_ALL,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_VCMSARTICLETYPE);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_VCMSARTICLETYPE.concat(VcmsArticleTypeModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (orderByComparator == null) {
					list = (List<VcmsArticleType>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);
				}
				else {
					list = (List<VcmsArticleType>)QueryUtil.list(q,
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
	 * Removes all the vcms article types where typeId = &#63; from the database.
	 *
	 * @param typeId the type id to search with
	 * @throws SystemException if a system exception occurred
	 */
	public void removeByType(long typeId) throws SystemException {
		for (VcmsArticleType vcmsArticleType : findByType(typeId)) {
			remove(vcmsArticleType);
		}
	}

	/**
	 * Removes all the vcms article types where articleId = &#63; from the database.
	 *
	 * @param articleId the article id to search with
	 * @throws SystemException if a system exception occurred
	 */
	public void removeByArticle(String articleId) throws SystemException {
		for (VcmsArticleType vcmsArticleType : findByArticle(articleId)) {
			remove(vcmsArticleType);
		}
	}

	/**
	 * Removes the vcms article type where typeId = &#63; and articleId = &#63; from the database.
	 *
	 * @param typeId the type id to search with
	 * @param articleId the article id to search with
	 * @throws SystemException if a system exception occurred
	 */
	public void removeByArticleByType(long typeId, String articleId)
		throws NoSuchVcmsArticleTypeException, SystemException {
		VcmsArticleType vcmsArticleType = findByArticleByType(typeId, articleId);

		remove(vcmsArticleType);
	}

	/**
	 * Removes all the vcms article types from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	public void removeAll() throws SystemException {
		for (VcmsArticleType vcmsArticleType : findAll()) {
			remove(vcmsArticleType);
		}
	}

	/**
	 * Counts all the vcms article types where typeId = &#63;.
	 *
	 * @param typeId the type id to search with
	 * @return the number of matching vcms article types
	 * @throws SystemException if a system exception occurred
	 */
	public int countByType(long typeId) throws SystemException {
		Object[] finderArgs = new Object[] { typeId };

		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_BY_TYPE,
				finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_VCMSARTICLETYPE_WHERE);

			query.append(_FINDER_COLUMN_TYPE_TYPEID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(typeId);

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
	 * Counts all the vcms article types where articleId = &#63;.
	 *
	 * @param articleId the article id to search with
	 * @return the number of matching vcms article types
	 * @throws SystemException if a system exception occurred
	 */
	public int countByArticle(String articleId) throws SystemException {
		Object[] finderArgs = new Object[] { articleId };

		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_BY_ARTICLE,
				finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_VCMSARTICLETYPE_WHERE);

			if (articleId == null) {
				query.append(_FINDER_COLUMN_ARTICLE_ARTICLEID_1);
			}
			else {
				if (articleId.equals(StringPool.BLANK)) {
					query.append(_FINDER_COLUMN_ARTICLE_ARTICLEID_3);
				}
				else {
					query.append(_FINDER_COLUMN_ARTICLE_ARTICLEID_2);
				}
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (articleId != null) {
					qPos.add(articleId);
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

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_ARTICLE,
					finderArgs, count);

				closeSession(session);
			}
		}

		return count.intValue();
	}

	/**
	 * Counts all the vcms article types where typeId = &#63; and articleId = &#63;.
	 *
	 * @param typeId the type id to search with
	 * @param articleId the article id to search with
	 * @return the number of matching vcms article types
	 * @throws SystemException if a system exception occurred
	 */
	public int countByArticleByType(long typeId, String articleId)
		throws SystemException {
		Object[] finderArgs = new Object[] { typeId, articleId };

		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_BY_ARTICLEBYTYPE,
				finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_VCMSARTICLETYPE_WHERE);

			query.append(_FINDER_COLUMN_ARTICLEBYTYPE_TYPEID_2);

			if (articleId == null) {
				query.append(_FINDER_COLUMN_ARTICLEBYTYPE_ARTICLEID_1);
			}
			else {
				if (articleId.equals(StringPool.BLANK)) {
					query.append(_FINDER_COLUMN_ARTICLEBYTYPE_ARTICLEID_3);
				}
				else {
					query.append(_FINDER_COLUMN_ARTICLEBYTYPE_ARTICLEID_2);
				}
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(typeId);

				if (articleId != null) {
					qPos.add(articleId);
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

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_ARTICLEBYTYPE,
					finderArgs, count);

				closeSession(session);
			}
		}

		return count.intValue();
	}

	/**
	 * Counts all the vcms article types.
	 *
	 * @return the number of vcms article types
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

				Query q = session.createQuery(_SQL_COUNT_VCMSARTICLETYPE);

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
	 * Initializes the vcms article type persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.com.vportal.portlet.vcms.model.VcmsArticleType")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<VcmsArticleType>> listenersList = new ArrayList<ModelListener<VcmsArticleType>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<VcmsArticleType>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(VcmsArticleTypeImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST);
	}

	@BeanReference(type = VcmsTypePersistence.class)
	protected VcmsTypePersistence vcmsTypePersistence;
	@BeanReference(type = VcmsPortionPersistence.class)
	protected VcmsPortionPersistence vcmsPortionPersistence;
	@BeanReference(type = VcmsCategoryPersistence.class)
	protected VcmsCategoryPersistence vcmsCategoryPersistence;
	@BeanReference(type = VcmsArticlePersistence.class)
	protected VcmsArticlePersistence vcmsArticlePersistence;
	@BeanReference(type = VcmsStatusPersistence.class)
	protected VcmsStatusPersistence vcmsStatusPersistence;
	@BeanReference(type = VcmsArticleVersionPersistence.class)
	protected VcmsArticleVersionPersistence vcmsArticleVersionPersistence;
	@BeanReference(type = VcmsArticleStatusPersistence.class)
	protected VcmsArticleStatusPersistence vcmsArticleStatusPersistence;
	@BeanReference(type = VcmsArticleTypePersistence.class)
	protected VcmsArticleTypePersistence vcmsArticleTypePersistence;
	@BeanReference(type = VcmsAttachedMessagePersistence.class)
	protected VcmsAttachedMessagePersistence vcmsAttachedMessagePersistence;
	@BeanReference(type = VcmsThreadPersistence.class)
	protected VcmsThreadPersistence vcmsThreadPersistence;
	@BeanReference(type = VcmsDiscussionPersistence.class)
	protected VcmsDiscussionPersistence vcmsDiscussionPersistence;
	@BeanReference(type = VcmsPARelationPersistence.class)
	protected VcmsPARelationPersistence vcmsPARelationPersistence;
	@BeanReference(type = VcmsCARelationPersistence.class)
	protected VcmsCARelationPersistence vcmsCARelationPersistence;
	@BeanReference(type = VcmsTARelationPersistence.class)
	protected VcmsTARelationPersistence vcmsTARelationPersistence;
	@BeanReference(type = VcmsLoggerPersistence.class)
	protected VcmsLoggerPersistence vcmsLoggerPersistence;
	@BeanReference(type = ResourcePersistence.class)
	protected ResourcePersistence resourcePersistence;
	@BeanReference(type = UserPersistence.class)
	protected UserPersistence userPersistence;
	private static final String _SQL_SELECT_VCMSARTICLETYPE = "SELECT vcmsArticleType FROM VcmsArticleType vcmsArticleType";
	private static final String _SQL_SELECT_VCMSARTICLETYPE_WHERE = "SELECT vcmsArticleType FROM VcmsArticleType vcmsArticleType WHERE ";
	private static final String _SQL_COUNT_VCMSARTICLETYPE = "SELECT COUNT(vcmsArticleType) FROM VcmsArticleType vcmsArticleType";
	private static final String _SQL_COUNT_VCMSARTICLETYPE_WHERE = "SELECT COUNT(vcmsArticleType) FROM VcmsArticleType vcmsArticleType WHERE ";
	private static final String _FINDER_COLUMN_TYPE_TYPEID_2 = "vcmsArticleType.id.typeId = ?";
	private static final String _FINDER_COLUMN_ARTICLE_ARTICLEID_1 = "vcmsArticleType.id.articleId IS NULL";
	private static final String _FINDER_COLUMN_ARTICLE_ARTICLEID_2 = "vcmsArticleType.id.articleId = ?";
	private static final String _FINDER_COLUMN_ARTICLE_ARTICLEID_3 = "(vcmsArticleType.id.articleId IS NULL OR vcmsArticleType.id.articleId = ?)";
	private static final String _FINDER_COLUMN_ARTICLEBYTYPE_TYPEID_2 = "vcmsArticleType.id.typeId = ? AND ";
	private static final String _FINDER_COLUMN_ARTICLEBYTYPE_ARTICLEID_1 = "vcmsArticleType.id.articleId IS NULL";
	private static final String _FINDER_COLUMN_ARTICLEBYTYPE_ARTICLEID_2 = "vcmsArticleType.id.articleId = ?";
	private static final String _FINDER_COLUMN_ARTICLEBYTYPE_ARTICLEID_3 = "(vcmsArticleType.id.articleId IS NULL OR vcmsArticleType.id.articleId = ?)";
	private static final String _ORDER_BY_ENTITY_ALIAS = "vcmsArticleType.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No VcmsArticleType exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No VcmsArticleType exists with the key {";
	private static Log _log = LogFactoryUtil.getLog(VcmsArticleTypePersistenceImpl.class);
}