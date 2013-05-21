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

import com.vportal.portlet.vcms.NoSuchVcmsTypeException;
import com.vportal.portlet.vcms.model.VcmsType;
import com.vportal.portlet.vcms.model.impl.VcmsTypeImpl;
import com.vportal.portlet.vcms.model.impl.VcmsTypeModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The persistence implementation for the vcms type service.
 *
 * <p>
 * Never modify or reference this class directly. Always use {@link VcmsTypeUtil} to access the vcms type persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
 * </p>
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author HOAN
 * @see VcmsTypePersistence
 * @see VcmsTypeUtil
 * @generated
 */
public class VcmsTypePersistenceImpl extends BasePersistenceImpl<VcmsType>
	implements VcmsTypePersistence {
	public static final String FINDER_CLASS_NAME_ENTITY = VcmsTypeImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST = FINDER_CLASS_NAME_ENTITY +
		".List";
	public static final FinderPath FINDER_PATH_FETCH_BY_S_C = new FinderPath(VcmsTypeModelImpl.ENTITY_CACHE_ENABLED,
			VcmsTypeModelImpl.FINDER_CACHE_ENABLED, FINDER_CLASS_NAME_ENTITY,
			"fetchByS_C",
			new String[] { Long.class.getName(), String.class.getName() });
	public static final FinderPath FINDER_PATH_COUNT_BY_S_C = new FinderPath(VcmsTypeModelImpl.ENTITY_CACHE_ENABLED,
			VcmsTypeModelImpl.FINDER_CACHE_ENABLED, FINDER_CLASS_NAME_LIST,
			"countByS_C",
			new String[] { Long.class.getName(), String.class.getName() });
	public static final FinderPath FINDER_PATH_FIND_BY_S_L = new FinderPath(VcmsTypeModelImpl.ENTITY_CACHE_ENABLED,
			VcmsTypeModelImpl.FINDER_CACHE_ENABLED, FINDER_CLASS_NAME_LIST,
			"findByS_L",
			new String[] {
				Long.class.getName(), String.class.getName(),
				
			"java.lang.Integer", "java.lang.Integer",
				"com.liferay.portal.kernel.util.OrderByComparator"
			});
	public static final FinderPath FINDER_PATH_COUNT_BY_S_L = new FinderPath(VcmsTypeModelImpl.ENTITY_CACHE_ENABLED,
			VcmsTypeModelImpl.FINDER_CACHE_ENABLED, FINDER_CLASS_NAME_LIST,
			"countByS_L",
			new String[] { Long.class.getName(), String.class.getName() });
	public static final FinderPath FINDER_PATH_FIND_ALL = new FinderPath(VcmsTypeModelImpl.ENTITY_CACHE_ENABLED,
			VcmsTypeModelImpl.FINDER_CACHE_ENABLED, FINDER_CLASS_NAME_LIST,
			"findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(VcmsTypeModelImpl.ENTITY_CACHE_ENABLED,
			VcmsTypeModelImpl.FINDER_CACHE_ENABLED, FINDER_CLASS_NAME_LIST,
			"countAll", new String[0]);

	/**
	 * Caches the vcms type in the entity cache if it is enabled.
	 *
	 * @param vcmsType the vcms type to cache
	 */
	public void cacheResult(VcmsType vcmsType) {
		EntityCacheUtil.putResult(VcmsTypeModelImpl.ENTITY_CACHE_ENABLED,
			VcmsTypeImpl.class, vcmsType.getPrimaryKey(), vcmsType);

		FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_S_C,
			new Object[] { new Long(vcmsType.getGroupId()), vcmsType.getCode() },
			vcmsType);
	}

	/**
	 * Caches the vcms types in the entity cache if it is enabled.
	 *
	 * @param vcmsTypes the vcms types to cache
	 */
	public void cacheResult(List<VcmsType> vcmsTypes) {
		for (VcmsType vcmsType : vcmsTypes) {
			if (EntityCacheUtil.getResult(
						VcmsTypeModelImpl.ENTITY_CACHE_ENABLED,
						VcmsTypeImpl.class, vcmsType.getPrimaryKey(), this) == null) {
				cacheResult(vcmsType);
			}
		}
	}

	/**
	 * Clears the cache for all vcms types.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	public void clearCache() {
		CacheRegistryUtil.clear(VcmsTypeImpl.class.getName());
		EntityCacheUtil.clearCache(VcmsTypeImpl.class.getName());
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST);
	}

	/**
	 * Clears the cache for the vcms type.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	public void clearCache(VcmsType vcmsType) {
		EntityCacheUtil.removeResult(VcmsTypeModelImpl.ENTITY_CACHE_ENABLED,
			VcmsTypeImpl.class, vcmsType.getPrimaryKey());

		FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_S_C,
			new Object[] { new Long(vcmsType.getGroupId()), vcmsType.getCode() });
	}

	/**
	 * Creates a new vcms type with the primary key. Does not add the vcms type to the database.
	 *
	 * @param typeId the primary key for the new vcms type
	 * @return the new vcms type
	 */
	public VcmsType create(String typeId) {
		VcmsType vcmsType = new VcmsTypeImpl();

		vcmsType.setNew(true);
		vcmsType.setPrimaryKey(typeId);

		return vcmsType;
	}

	/**
	 * Removes the vcms type with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the vcms type to remove
	 * @return the vcms type that was removed
	 * @throws com.liferay.portal.NoSuchModelException if a vcms type with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public VcmsType remove(Serializable primaryKey)
		throws NoSuchModelException, SystemException {
		return remove((String)primaryKey);
	}

	/**
	 * Removes the vcms type with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param typeId the primary key of the vcms type to remove
	 * @return the vcms type that was removed
	 * @throws com.vportal.portlet.vcms.NoSuchVcmsTypeException if a vcms type with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public VcmsType remove(String typeId)
		throws NoSuchVcmsTypeException, SystemException {
		Session session = null;

		try {
			session = openSession();

			VcmsType vcmsType = (VcmsType)session.get(VcmsTypeImpl.class, typeId);

			if (vcmsType == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + typeId);
				}

				throw new NoSuchVcmsTypeException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					typeId);
			}

			return remove(vcmsType);
		}
		catch (NoSuchVcmsTypeException nsee) {
			throw nsee;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected VcmsType removeImpl(VcmsType vcmsType) throws SystemException {
		vcmsType = toUnwrappedModel(vcmsType);

		Session session = null;

		try {
			session = openSession();

			BatchSessionUtil.delete(session, vcmsType);
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST);

		VcmsTypeModelImpl vcmsTypeModelImpl = (VcmsTypeModelImpl)vcmsType;

		FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_S_C,
			new Object[] {
				new Long(vcmsTypeModelImpl.getGroupId()),
				
			vcmsTypeModelImpl.getCode()
			});

		EntityCacheUtil.removeResult(VcmsTypeModelImpl.ENTITY_CACHE_ENABLED,
			VcmsTypeImpl.class, vcmsType.getPrimaryKey());

		return vcmsType;
	}

	public VcmsType updateImpl(
		com.vportal.portlet.vcms.model.VcmsType vcmsType, boolean merge)
		throws SystemException {
		vcmsType = toUnwrappedModel(vcmsType);

		boolean isNew = vcmsType.isNew();

		VcmsTypeModelImpl vcmsTypeModelImpl = (VcmsTypeModelImpl)vcmsType;

		Session session = null;

		try {
			session = openSession();

			BatchSessionUtil.update(session, vcmsType, merge);

			vcmsType.setNew(false);
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST);

		EntityCacheUtil.putResult(VcmsTypeModelImpl.ENTITY_CACHE_ENABLED,
			VcmsTypeImpl.class, vcmsType.getPrimaryKey(), vcmsType);

		if (!isNew &&
				((vcmsType.getGroupId() != vcmsTypeModelImpl.getOriginalGroupId()) ||
				!Validator.equals(vcmsType.getCode(),
					vcmsTypeModelImpl.getOriginalCode()))) {
			FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_S_C,
				new Object[] {
					new Long(vcmsTypeModelImpl.getOriginalGroupId()),
					
				vcmsTypeModelImpl.getOriginalCode()
				});
		}

		if (isNew ||
				((vcmsType.getGroupId() != vcmsTypeModelImpl.getOriginalGroupId()) ||
				!Validator.equals(vcmsType.getCode(),
					vcmsTypeModelImpl.getOriginalCode()))) {
			FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_S_C,
				new Object[] { new Long(vcmsType.getGroupId()), vcmsType.getCode() },
				vcmsType);
		}

		return vcmsType;
	}

	protected VcmsType toUnwrappedModel(VcmsType vcmsType) {
		if (vcmsType instanceof VcmsTypeImpl) {
			return vcmsType;
		}

		VcmsTypeImpl vcmsTypeImpl = new VcmsTypeImpl();

		vcmsTypeImpl.setNew(vcmsType.isNew());
		vcmsTypeImpl.setPrimaryKey(vcmsType.getPrimaryKey());

		vcmsTypeImpl.setTypeId(vcmsType.getTypeId());
		vcmsTypeImpl.setGroupId(vcmsType.getGroupId());
		vcmsTypeImpl.setCompanyId(vcmsType.getCompanyId());
		vcmsTypeImpl.setCreatedDate(vcmsType.getCreatedDate());
		vcmsTypeImpl.setCreatedByUser(vcmsType.getCreatedByUser());
		vcmsTypeImpl.setModifiedDate(vcmsType.getModifiedDate());
		vcmsTypeImpl.setModifiedByUser(vcmsType.getModifiedByUser());
		vcmsTypeImpl.setCode(vcmsType.getCode());
		vcmsTypeImpl.setName(vcmsType.getName());
		vcmsTypeImpl.setDescription(vcmsType.getDescription());
		vcmsTypeImpl.setLanguage(vcmsType.getLanguage());

		return vcmsTypeImpl;
	}

	/**
	 * Finds the vcms type with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the vcms type to find
	 * @return the vcms type
	 * @throws com.liferay.portal.NoSuchModelException if a vcms type with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public VcmsType findByPrimaryKey(Serializable primaryKey)
		throws NoSuchModelException, SystemException {
		return findByPrimaryKey((String)primaryKey);
	}

	/**
	 * Finds the vcms type with the primary key or throws a {@link com.vportal.portlet.vcms.NoSuchVcmsTypeException} if it could not be found.
	 *
	 * @param typeId the primary key of the vcms type to find
	 * @return the vcms type
	 * @throws com.vportal.portlet.vcms.NoSuchVcmsTypeException if a vcms type with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public VcmsType findByPrimaryKey(String typeId)
		throws NoSuchVcmsTypeException, SystemException {
		VcmsType vcmsType = fetchByPrimaryKey(typeId);

		if (vcmsType == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + typeId);
			}

			throw new NoSuchVcmsTypeException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				typeId);
		}

		return vcmsType;
	}

	/**
	 * Finds the vcms type with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the vcms type to find
	 * @return the vcms type, or <code>null</code> if a vcms type with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public VcmsType fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		return fetchByPrimaryKey((String)primaryKey);
	}

	/**
	 * Finds the vcms type with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param typeId the primary key of the vcms type to find
	 * @return the vcms type, or <code>null</code> if a vcms type with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public VcmsType fetchByPrimaryKey(String typeId) throws SystemException {
		VcmsType vcmsType = (VcmsType)EntityCacheUtil.getResult(VcmsTypeModelImpl.ENTITY_CACHE_ENABLED,
				VcmsTypeImpl.class, typeId, this);

		if (vcmsType == null) {
			Session session = null;

			try {
				session = openSession();

				vcmsType = (VcmsType)session.get(VcmsTypeImpl.class, typeId);
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (vcmsType != null) {
					cacheResult(vcmsType);
				}

				closeSession(session);
			}
		}

		return vcmsType;
	}

	/**
	 * Finds the vcms type where groupId = &#63; and code = &#63; or throws a {@link com.vportal.portlet.vcms.NoSuchVcmsTypeException} if it could not be found.
	 *
	 * @param groupId the group id to search with
	 * @param code the code to search with
	 * @return the matching vcms type
	 * @throws com.vportal.portlet.vcms.NoSuchVcmsTypeException if a matching vcms type could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public VcmsType findByS_C(long groupId, String code)
		throws NoSuchVcmsTypeException, SystemException {
		VcmsType vcmsType = fetchByS_C(groupId, code);

		if (vcmsType == null) {
			StringBundler msg = new StringBundler(6);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("groupId=");
			msg.append(groupId);

			msg.append(", code=");
			msg.append(code);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			if (_log.isWarnEnabled()) {
				_log.warn(msg.toString());
			}

			throw new NoSuchVcmsTypeException(msg.toString());
		}

		return vcmsType;
	}

	/**
	 * Finds the vcms type where groupId = &#63; and code = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param groupId the group id to search with
	 * @param code the code to search with
	 * @return the matching vcms type, or <code>null</code> if a matching vcms type could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public VcmsType fetchByS_C(long groupId, String code)
		throws SystemException {
		return fetchByS_C(groupId, code, true);
	}

	/**
	 * Finds the vcms type where groupId = &#63; and code = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param groupId the group id to search with
	 * @param code the code to search with
	 * @return the matching vcms type, or <code>null</code> if a matching vcms type could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public VcmsType fetchByS_C(long groupId, String code,
		boolean retrieveFromCache) throws SystemException {
		Object[] finderArgs = new Object[] { groupId, code };

		Object result = null;

		if (retrieveFromCache) {
			result = FinderCacheUtil.getResult(FINDER_PATH_FETCH_BY_S_C,
					finderArgs, this);
		}

		if (result == null) {
			StringBundler query = new StringBundler(4);

			query.append(_SQL_SELECT_VCMSTYPE_WHERE);

			query.append(_FINDER_COLUMN_S_C_GROUPID_2);

			if (code == null) {
				query.append(_FINDER_COLUMN_S_C_CODE_1);
			}
			else {
				if (code.equals(StringPool.BLANK)) {
					query.append(_FINDER_COLUMN_S_C_CODE_3);
				}
				else {
					query.append(_FINDER_COLUMN_S_C_CODE_2);
				}
			}

			query.append(VcmsTypeModelImpl.ORDER_BY_JPQL);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(groupId);

				if (code != null) {
					qPos.add(code);
				}

				List<VcmsType> list = q.list();

				result = list;

				VcmsType vcmsType = null;

				if (list.isEmpty()) {
					FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_S_C,
						finderArgs, list);
				}
				else {
					vcmsType = list.get(0);

					cacheResult(vcmsType);

					if ((vcmsType.getGroupId() != groupId) ||
							(vcmsType.getCode() == null) ||
							!vcmsType.getCode().equals(code)) {
						FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_S_C,
							finderArgs, vcmsType);
					}
				}

				return vcmsType;
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (result == null) {
					FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_S_C,
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
				return (VcmsType)result;
			}
		}
	}

	/**
	 * Finds all the vcms types where groupId = &#63; and language = &#63;.
	 *
	 * @param groupId the group id to search with
	 * @param language the language to search with
	 * @return the matching vcms types
	 * @throws SystemException if a system exception occurred
	 */
	public List<VcmsType> findByS_L(long groupId, String language)
		throws SystemException {
		return findByS_L(groupId, language, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Finds a range of all the vcms types where groupId = &#63; and language = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param groupId the group id to search with
	 * @param language the language to search with
	 * @param start the lower bound of the range of vcms types to return
	 * @param end the upper bound of the range of vcms types to return (not inclusive)
	 * @return the range of matching vcms types
	 * @throws SystemException if a system exception occurred
	 */
	public List<VcmsType> findByS_L(long groupId, String language, int start,
		int end) throws SystemException {
		return findByS_L(groupId, language, start, end, null);
	}

	/**
	 * Finds an ordered range of all the vcms types where groupId = &#63; and language = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param groupId the group id to search with
	 * @param language the language to search with
	 * @param start the lower bound of the range of vcms types to return
	 * @param end the upper bound of the range of vcms types to return (not inclusive)
	 * @param orderByComparator the comparator to order the results by
	 * @return the ordered range of matching vcms types
	 * @throws SystemException if a system exception occurred
	 */
	public List<VcmsType> findByS_L(long groupId, String language, int start,
		int end, OrderByComparator orderByComparator) throws SystemException {
		Object[] finderArgs = new Object[] {
				groupId, language,
				
				String.valueOf(start), String.valueOf(end),
				String.valueOf(orderByComparator)
			};

		List<VcmsType> list = (List<VcmsType>)FinderCacheUtil.getResult(FINDER_PATH_FIND_BY_S_L,
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

			query.append(_SQL_SELECT_VCMSTYPE_WHERE);

			query.append(_FINDER_COLUMN_S_L_GROUPID_2);

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
				query.append(VcmsTypeModelImpl.ORDER_BY_JPQL);
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

				list = (List<VcmsType>)QueryUtil.list(q, getDialect(), start,
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
	 * Finds the first vcms type in the ordered set where groupId = &#63; and language = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param groupId the group id to search with
	 * @param language the language to search with
	 * @param orderByComparator the comparator to order the set by
	 * @return the first matching vcms type
	 * @throws com.vportal.portlet.vcms.NoSuchVcmsTypeException if a matching vcms type could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public VcmsType findByS_L_First(long groupId, String language,
		OrderByComparator orderByComparator)
		throws NoSuchVcmsTypeException, SystemException {
		List<VcmsType> list = findByS_L(groupId, language, 0, 1,
				orderByComparator);

		if (list.isEmpty()) {
			StringBundler msg = new StringBundler(6);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("groupId=");
			msg.append(groupId);

			msg.append(", language=");
			msg.append(language);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			throw new NoSuchVcmsTypeException(msg.toString());
		}
		else {
			return list.get(0);
		}
	}

	/**
	 * Finds the last vcms type in the ordered set where groupId = &#63; and language = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param groupId the group id to search with
	 * @param language the language to search with
	 * @param orderByComparator the comparator to order the set by
	 * @return the last matching vcms type
	 * @throws com.vportal.portlet.vcms.NoSuchVcmsTypeException if a matching vcms type could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public VcmsType findByS_L_Last(long groupId, String language,
		OrderByComparator orderByComparator)
		throws NoSuchVcmsTypeException, SystemException {
		int count = countByS_L(groupId, language);

		List<VcmsType> list = findByS_L(groupId, language, count - 1, count,
				orderByComparator);

		if (list.isEmpty()) {
			StringBundler msg = new StringBundler(6);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("groupId=");
			msg.append(groupId);

			msg.append(", language=");
			msg.append(language);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			throw new NoSuchVcmsTypeException(msg.toString());
		}
		else {
			return list.get(0);
		}
	}

	/**
	 * Finds the vcms types before and after the current vcms type in the ordered set where groupId = &#63; and language = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param typeId the primary key of the current vcms type
	 * @param groupId the group id to search with
	 * @param language the language to search with
	 * @param orderByComparator the comparator to order the set by
	 * @return the previous, current, and next vcms type
	 * @throws com.vportal.portlet.vcms.NoSuchVcmsTypeException if a vcms type with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public VcmsType[] findByS_L_PrevAndNext(String typeId, long groupId,
		String language, OrderByComparator orderByComparator)
		throws NoSuchVcmsTypeException, SystemException {
		VcmsType vcmsType = findByPrimaryKey(typeId);

		Session session = null;

		try {
			session = openSession();

			VcmsType[] array = new VcmsTypeImpl[3];

			array[0] = getByS_L_PrevAndNext(session, vcmsType, groupId,
					language, orderByComparator, true);

			array[1] = vcmsType;

			array[2] = getByS_L_PrevAndNext(session, vcmsType, groupId,
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

	protected VcmsType getByS_L_PrevAndNext(Session session, VcmsType vcmsType,
		long groupId, String language, OrderByComparator orderByComparator,
		boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_VCMSTYPE_WHERE);

		query.append(_FINDER_COLUMN_S_L_GROUPID_2);

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
			query.append(VcmsTypeModelImpl.ORDER_BY_JPQL);
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
			Object[] values = orderByComparator.getOrderByValues(vcmsType);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<VcmsType> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Finds all the vcms types.
	 *
	 * @return the vcms types
	 * @throws SystemException if a system exception occurred
	 */
	public List<VcmsType> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Finds a range of all the vcms types.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param start the lower bound of the range of vcms types to return
	 * @param end the upper bound of the range of vcms types to return (not inclusive)
	 * @return the range of vcms types
	 * @throws SystemException if a system exception occurred
	 */
	public List<VcmsType> findAll(int start, int end) throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Finds an ordered range of all the vcms types.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param start the lower bound of the range of vcms types to return
	 * @param end the upper bound of the range of vcms types to return (not inclusive)
	 * @param orderByComparator the comparator to order the results by
	 * @return the ordered range of vcms types
	 * @throws SystemException if a system exception occurred
	 */
	public List<VcmsType> findAll(int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		Object[] finderArgs = new Object[] {
				String.valueOf(start), String.valueOf(end),
				String.valueOf(orderByComparator)
			};

		List<VcmsType> list = (List<VcmsType>)FinderCacheUtil.getResult(FINDER_PATH_FIND_ALL,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_VCMSTYPE);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_VCMSTYPE.concat(VcmsTypeModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (orderByComparator == null) {
					list = (List<VcmsType>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);
				}
				else {
					list = (List<VcmsType>)QueryUtil.list(q, getDialect(),
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
	 * Removes the vcms type where groupId = &#63; and code = &#63; from the database.
	 *
	 * @param groupId the group id to search with
	 * @param code the code to search with
	 * @throws SystemException if a system exception occurred
	 */
	public void removeByS_C(long groupId, String code)
		throws NoSuchVcmsTypeException, SystemException {
		VcmsType vcmsType = findByS_C(groupId, code);

		remove(vcmsType);
	}

	/**
	 * Removes all the vcms types where groupId = &#63; and language = &#63; from the database.
	 *
	 * @param groupId the group id to search with
	 * @param language the language to search with
	 * @throws SystemException if a system exception occurred
	 */
	public void removeByS_L(long groupId, String language)
		throws SystemException {
		for (VcmsType vcmsType : findByS_L(groupId, language)) {
			remove(vcmsType);
		}
	}

	/**
	 * Removes all the vcms types from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	public void removeAll() throws SystemException {
		for (VcmsType vcmsType : findAll()) {
			remove(vcmsType);
		}
	}

	/**
	 * Counts all the vcms types where groupId = &#63; and code = &#63;.
	 *
	 * @param groupId the group id to search with
	 * @param code the code to search with
	 * @return the number of matching vcms types
	 * @throws SystemException if a system exception occurred
	 */
	public int countByS_C(long groupId, String code) throws SystemException {
		Object[] finderArgs = new Object[] { groupId, code };

		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_BY_S_C,
				finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_VCMSTYPE_WHERE);

			query.append(_FINDER_COLUMN_S_C_GROUPID_2);

			if (code == null) {
				query.append(_FINDER_COLUMN_S_C_CODE_1);
			}
			else {
				if (code.equals(StringPool.BLANK)) {
					query.append(_FINDER_COLUMN_S_C_CODE_3);
				}
				else {
					query.append(_FINDER_COLUMN_S_C_CODE_2);
				}
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(groupId);

				if (code != null) {
					qPos.add(code);
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

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_S_C, finderArgs,
					count);

				closeSession(session);
			}
		}

		return count.intValue();
	}

	/**
	 * Counts all the vcms types where groupId = &#63; and language = &#63;.
	 *
	 * @param groupId the group id to search with
	 * @param language the language to search with
	 * @return the number of matching vcms types
	 * @throws SystemException if a system exception occurred
	 */
	public int countByS_L(long groupId, String language)
		throws SystemException {
		Object[] finderArgs = new Object[] { groupId, language };

		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_BY_S_L,
				finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_VCMSTYPE_WHERE);

			query.append(_FINDER_COLUMN_S_L_GROUPID_2);

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
	 * Counts all the vcms types.
	 *
	 * @return the number of vcms types
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

				Query q = session.createQuery(_SQL_COUNT_VCMSTYPE);

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
	 * Initializes the vcms type persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.com.vportal.portlet.vcms.model.VcmsType")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<VcmsType>> listenersList = new ArrayList<ModelListener<VcmsType>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<VcmsType>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(VcmsTypeImpl.class.getName());
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
	private static final String _SQL_SELECT_VCMSTYPE = "SELECT vcmsType FROM VcmsType vcmsType";
	private static final String _SQL_SELECT_VCMSTYPE_WHERE = "SELECT vcmsType FROM VcmsType vcmsType WHERE ";
	private static final String _SQL_COUNT_VCMSTYPE = "SELECT COUNT(vcmsType) FROM VcmsType vcmsType";
	private static final String _SQL_COUNT_VCMSTYPE_WHERE = "SELECT COUNT(vcmsType) FROM VcmsType vcmsType WHERE ";
	private static final String _FINDER_COLUMN_S_C_GROUPID_2 = "vcmsType.groupId = ? AND ";
	private static final String _FINDER_COLUMN_S_C_CODE_1 = "vcmsType.code IS NULL";
	private static final String _FINDER_COLUMN_S_C_CODE_2 = "vcmsType.code = ?";
	private static final String _FINDER_COLUMN_S_C_CODE_3 = "(vcmsType.code IS NULL OR vcmsType.code = ?)";
	private static final String _FINDER_COLUMN_S_L_GROUPID_2 = "vcmsType.groupId = ? AND ";
	private static final String _FINDER_COLUMN_S_L_LANGUAGE_1 = "vcmsType.language IS NULL";
	private static final String _FINDER_COLUMN_S_L_LANGUAGE_2 = "vcmsType.language = ?";
	private static final String _FINDER_COLUMN_S_L_LANGUAGE_3 = "(vcmsType.language IS NULL OR vcmsType.language = ?)";
	private static final String _ORDER_BY_ENTITY_ALIAS = "vcmsType.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No VcmsType exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No VcmsType exists with the key {";
	private static Log _log = LogFactoryUtil.getLog(VcmsTypePersistenceImpl.class);
}