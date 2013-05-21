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

import com.vportal.portlet.vlegal.NoSuchVLegalSignerException;
import com.vportal.portlet.vlegal.model.VLegalSigner;
import com.vportal.portlet.vlegal.model.impl.VLegalSignerImpl;
import com.vportal.portlet.vlegal.model.impl.VLegalSignerModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The persistence implementation for the v legal signer service.
 *
 * <p>
 * Never modify or reference this class directly. Always use {@link VLegalSignerUtil} to access the v legal signer persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
 * </p>
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author ACB
 * @see VLegalSignerPersistence
 * @see VLegalSignerUtil
 * @generated
 */
public class VLegalSignerPersistenceImpl extends BasePersistenceImpl<VLegalSigner>
	implements VLegalSignerPersistence {
	public static final String FINDER_CLASS_NAME_ENTITY = VLegalSignerImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST = FINDER_CLASS_NAME_ENTITY +
		".List";
	public static final FinderPath FINDER_PATH_FIND_BY_GROUPID = new FinderPath(VLegalSignerModelImpl.ENTITY_CACHE_ENABLED,
			VLegalSignerModelImpl.FINDER_CACHE_ENABLED, FINDER_CLASS_NAME_LIST,
			"findByGroupId",
			new String[] {
				Long.class.getName(),
				
			"java.lang.Integer", "java.lang.Integer",
				"com.liferay.portal.kernel.util.OrderByComparator"
			});
	public static final FinderPath FINDER_PATH_COUNT_BY_GROUPID = new FinderPath(VLegalSignerModelImpl.ENTITY_CACHE_ENABLED,
			VLegalSignerModelImpl.FINDER_CACHE_ENABLED, FINDER_CLASS_NAME_LIST,
			"countByGroupId", new String[] { Long.class.getName() });
	public static final FinderPath FINDER_PATH_FETCH_BY_G_S = new FinderPath(VLegalSignerModelImpl.ENTITY_CACHE_ENABLED,
			VLegalSignerModelImpl.FINDER_CACHE_ENABLED,
			FINDER_CLASS_NAME_ENTITY, "fetchByG_S",
			new String[] { Long.class.getName(), String.class.getName() });
	public static final FinderPath FINDER_PATH_COUNT_BY_G_S = new FinderPath(VLegalSignerModelImpl.ENTITY_CACHE_ENABLED,
			VLegalSignerModelImpl.FINDER_CACHE_ENABLED, FINDER_CLASS_NAME_LIST,
			"countByG_S",
			new String[] { Long.class.getName(), String.class.getName() });
	public static final FinderPath FINDER_PATH_FIND_BY_GROUP_LANG = new FinderPath(VLegalSignerModelImpl.ENTITY_CACHE_ENABLED,
			VLegalSignerModelImpl.FINDER_CACHE_ENABLED, FINDER_CLASS_NAME_LIST,
			"findByGroup_Lang",
			new String[] {
				Long.class.getName(), String.class.getName(),
				
			"java.lang.Integer", "java.lang.Integer",
				"com.liferay.portal.kernel.util.OrderByComparator"
			});
	public static final FinderPath FINDER_PATH_COUNT_BY_GROUP_LANG = new FinderPath(VLegalSignerModelImpl.ENTITY_CACHE_ENABLED,
			VLegalSignerModelImpl.FINDER_CACHE_ENABLED, FINDER_CLASS_NAME_LIST,
			"countByGroup_Lang",
			new String[] { Long.class.getName(), String.class.getName() });
	public static final FinderPath FINDER_PATH_FIND_BY_G_L_S = new FinderPath(VLegalSignerModelImpl.ENTITY_CACHE_ENABLED,
			VLegalSignerModelImpl.FINDER_CACHE_ENABLED, FINDER_CLASS_NAME_LIST,
			"findByG_L_S",
			new String[] {
				Long.class.getName(), String.class.getName(),
				Boolean.class.getName(),
				
			"java.lang.Integer", "java.lang.Integer",
				"com.liferay.portal.kernel.util.OrderByComparator"
			});
	public static final FinderPath FINDER_PATH_COUNT_BY_G_L_S = new FinderPath(VLegalSignerModelImpl.ENTITY_CACHE_ENABLED,
			VLegalSignerModelImpl.FINDER_CACHE_ENABLED, FINDER_CLASS_NAME_LIST,
			"countByG_L_S",
			new String[] {
				Long.class.getName(), String.class.getName(),
				Boolean.class.getName()
			});
	public static final FinderPath FINDER_PATH_FIND_ALL = new FinderPath(VLegalSignerModelImpl.ENTITY_CACHE_ENABLED,
			VLegalSignerModelImpl.FINDER_CACHE_ENABLED, FINDER_CLASS_NAME_LIST,
			"findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(VLegalSignerModelImpl.ENTITY_CACHE_ENABLED,
			VLegalSignerModelImpl.FINDER_CACHE_ENABLED, FINDER_CLASS_NAME_LIST,
			"countAll", new String[0]);

	/**
	 * Caches the v legal signer in the entity cache if it is enabled.
	 *
	 * @param vLegalSigner the v legal signer to cache
	 */
	public void cacheResult(VLegalSigner vLegalSigner) {
		EntityCacheUtil.putResult(VLegalSignerModelImpl.ENTITY_CACHE_ENABLED,
			VLegalSignerImpl.class, vLegalSigner.getPrimaryKey(), vLegalSigner);

		FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_G_S,
			new Object[] {
				new Long(vLegalSigner.getGroupId()),
				
			vLegalSigner.getSigId()
			}, vLegalSigner);
	}

	/**
	 * Caches the v legal signers in the entity cache if it is enabled.
	 *
	 * @param vLegalSigners the v legal signers to cache
	 */
	public void cacheResult(List<VLegalSigner> vLegalSigners) {
		for (VLegalSigner vLegalSigner : vLegalSigners) {
			if (EntityCacheUtil.getResult(
						VLegalSignerModelImpl.ENTITY_CACHE_ENABLED,
						VLegalSignerImpl.class, vLegalSigner.getPrimaryKey(),
						this) == null) {
				cacheResult(vLegalSigner);
			}
		}
	}

	/**
	 * Clears the cache for all v legal signers.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	public void clearCache() {
		CacheRegistryUtil.clear(VLegalSignerImpl.class.getName());
		EntityCacheUtil.clearCache(VLegalSignerImpl.class.getName());
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST);
	}

	/**
	 * Clears the cache for the v legal signer.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	public void clearCache(VLegalSigner vLegalSigner) {
		EntityCacheUtil.removeResult(VLegalSignerModelImpl.ENTITY_CACHE_ENABLED,
			VLegalSignerImpl.class, vLegalSigner.getPrimaryKey());

		FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_G_S,
			new Object[] {
				new Long(vLegalSigner.getGroupId()),
				
			vLegalSigner.getSigId()
			});
	}

	/**
	 * Creates a new v legal signer with the primary key. Does not add the v legal signer to the database.
	 *
	 * @param sigId the primary key for the new v legal signer
	 * @return the new v legal signer
	 */
	public VLegalSigner create(String sigId) {
		VLegalSigner vLegalSigner = new VLegalSignerImpl();

		vLegalSigner.setNew(true);
		vLegalSigner.setPrimaryKey(sigId);

		return vLegalSigner;
	}

	/**
	 * Removes the v legal signer with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the v legal signer to remove
	 * @return the v legal signer that was removed
	 * @throws com.liferay.portal.NoSuchModelException if a v legal signer with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public VLegalSigner remove(Serializable primaryKey)
		throws NoSuchModelException, SystemException {
		return remove((String)primaryKey);
	}

	/**
	 * Removes the v legal signer with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param sigId the primary key of the v legal signer to remove
	 * @return the v legal signer that was removed
	 * @throws com.vportal.portlet.vlegal.NoSuchVLegalSignerException if a v legal signer with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public VLegalSigner remove(String sigId)
		throws NoSuchVLegalSignerException, SystemException {
		Session session = null;

		try {
			session = openSession();

			VLegalSigner vLegalSigner = (VLegalSigner)session.get(VLegalSignerImpl.class,
					sigId);

			if (vLegalSigner == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + sigId);
				}

				throw new NoSuchVLegalSignerException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					sigId);
			}

			return remove(vLegalSigner);
		}
		catch (NoSuchVLegalSignerException nsee) {
			throw nsee;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected VLegalSigner removeImpl(VLegalSigner vLegalSigner)
		throws SystemException {
		vLegalSigner = toUnwrappedModel(vLegalSigner);

		Session session = null;

		try {
			session = openSession();

			BatchSessionUtil.delete(session, vLegalSigner);
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST);

		VLegalSignerModelImpl vLegalSignerModelImpl = (VLegalSignerModelImpl)vLegalSigner;

		FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_G_S,
			new Object[] {
				new Long(vLegalSignerModelImpl.getGroupId()),
				
			vLegalSignerModelImpl.getSigId()
			});

		EntityCacheUtil.removeResult(VLegalSignerModelImpl.ENTITY_CACHE_ENABLED,
			VLegalSignerImpl.class, vLegalSigner.getPrimaryKey());

		return vLegalSigner;
	}

	public VLegalSigner updateImpl(
		com.vportal.portlet.vlegal.model.VLegalSigner vLegalSigner,
		boolean merge) throws SystemException {
		vLegalSigner = toUnwrappedModel(vLegalSigner);

		boolean isNew = vLegalSigner.isNew();

		VLegalSignerModelImpl vLegalSignerModelImpl = (VLegalSignerModelImpl)vLegalSigner;

		Session session = null;

		try {
			session = openSession();

			BatchSessionUtil.update(session, vLegalSigner, merge);

			vLegalSigner.setNew(false);
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST);

		EntityCacheUtil.putResult(VLegalSignerModelImpl.ENTITY_CACHE_ENABLED,
			VLegalSignerImpl.class, vLegalSigner.getPrimaryKey(), vLegalSigner);

		if (!isNew &&
				((vLegalSigner.getGroupId() != vLegalSignerModelImpl.getOriginalGroupId()) ||
				!Validator.equals(vLegalSigner.getSigId(),
					vLegalSignerModelImpl.getOriginalSigId()))) {
			FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_G_S,
				new Object[] {
					new Long(vLegalSignerModelImpl.getOriginalGroupId()),
					
				vLegalSignerModelImpl.getOriginalSigId()
				});
		}

		if (isNew ||
				((vLegalSigner.getGroupId() != vLegalSignerModelImpl.getOriginalGroupId()) ||
				!Validator.equals(vLegalSigner.getSigId(),
					vLegalSignerModelImpl.getOriginalSigId()))) {
			FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_G_S,
				new Object[] {
					new Long(vLegalSigner.getGroupId()),
					
				vLegalSigner.getSigId()
				}, vLegalSigner);
		}

		return vLegalSigner;
	}

	protected VLegalSigner toUnwrappedModel(VLegalSigner vLegalSigner) {
		if (vLegalSigner instanceof VLegalSignerImpl) {
			return vLegalSigner;
		}

		VLegalSignerImpl vLegalSignerImpl = new VLegalSignerImpl();

		vLegalSignerImpl.setNew(vLegalSigner.isNew());
		vLegalSignerImpl.setPrimaryKey(vLegalSigner.getPrimaryKey());

		vLegalSignerImpl.setSigId(vLegalSigner.getSigId());
		vLegalSignerImpl.setGroupId(vLegalSigner.getGroupId());
		vLegalSignerImpl.setCompanyId(vLegalSigner.getCompanyId());
		vLegalSignerImpl.setUserId(vLegalSigner.getUserId());
		vLegalSignerImpl.setCreatedDate(vLegalSigner.getCreatedDate());
		vLegalSignerImpl.setModifiedDate(vLegalSigner.getModifiedDate());
		vLegalSignerImpl.setCreatedByUser(vLegalSigner.getCreatedByUser());
		vLegalSignerImpl.setModifiedByUser(vLegalSigner.getModifiedByUser());
		vLegalSignerImpl.setFirstName(vLegalSigner.getFirstName());
		vLegalSignerImpl.setLastName(vLegalSigner.getLastName());
		vLegalSignerImpl.setLanguage(vLegalSigner.getLanguage());
		vLegalSignerImpl.setStatusSigner(vLegalSigner.isStatusSigner());

		return vLegalSignerImpl;
	}

	/**
	 * Finds the v legal signer with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the v legal signer to find
	 * @return the v legal signer
	 * @throws com.liferay.portal.NoSuchModelException if a v legal signer with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public VLegalSigner findByPrimaryKey(Serializable primaryKey)
		throws NoSuchModelException, SystemException {
		return findByPrimaryKey((String)primaryKey);
	}

	/**
	 * Finds the v legal signer with the primary key or throws a {@link com.vportal.portlet.vlegal.NoSuchVLegalSignerException} if it could not be found.
	 *
	 * @param sigId the primary key of the v legal signer to find
	 * @return the v legal signer
	 * @throws com.vportal.portlet.vlegal.NoSuchVLegalSignerException if a v legal signer with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public VLegalSigner findByPrimaryKey(String sigId)
		throws NoSuchVLegalSignerException, SystemException {
		VLegalSigner vLegalSigner = fetchByPrimaryKey(sigId);

		if (vLegalSigner == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + sigId);
			}

			throw new NoSuchVLegalSignerException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				sigId);
		}

		return vLegalSigner;
	}

	/**
	 * Finds the v legal signer with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the v legal signer to find
	 * @return the v legal signer, or <code>null</code> if a v legal signer with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public VLegalSigner fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		return fetchByPrimaryKey((String)primaryKey);
	}

	/**
	 * Finds the v legal signer with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param sigId the primary key of the v legal signer to find
	 * @return the v legal signer, or <code>null</code> if a v legal signer with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public VLegalSigner fetchByPrimaryKey(String sigId)
		throws SystemException {
		VLegalSigner vLegalSigner = (VLegalSigner)EntityCacheUtil.getResult(VLegalSignerModelImpl.ENTITY_CACHE_ENABLED,
				VLegalSignerImpl.class, sigId, this);

		if (vLegalSigner == null) {
			Session session = null;

			try {
				session = openSession();

				vLegalSigner = (VLegalSigner)session.get(VLegalSignerImpl.class,
						sigId);
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (vLegalSigner != null) {
					cacheResult(vLegalSigner);
				}

				closeSession(session);
			}
		}

		return vLegalSigner;
	}

	/**
	 * Finds all the v legal signers where groupId = &#63;.
	 *
	 * @param groupId the group id to search with
	 * @return the matching v legal signers
	 * @throws SystemException if a system exception occurred
	 */
	public List<VLegalSigner> findByGroupId(long groupId)
		throws SystemException {
		return findByGroupId(groupId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Finds a range of all the v legal signers where groupId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param groupId the group id to search with
	 * @param start the lower bound of the range of v legal signers to return
	 * @param end the upper bound of the range of v legal signers to return (not inclusive)
	 * @return the range of matching v legal signers
	 * @throws SystemException if a system exception occurred
	 */
	public List<VLegalSigner> findByGroupId(long groupId, int start, int end)
		throws SystemException {
		return findByGroupId(groupId, start, end, null);
	}

	/**
	 * Finds an ordered range of all the v legal signers where groupId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param groupId the group id to search with
	 * @param start the lower bound of the range of v legal signers to return
	 * @param end the upper bound of the range of v legal signers to return (not inclusive)
	 * @param orderByComparator the comparator to order the results by
	 * @return the ordered range of matching v legal signers
	 * @throws SystemException if a system exception occurred
	 */
	public List<VLegalSigner> findByGroupId(long groupId, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		Object[] finderArgs = new Object[] {
				groupId,
				
				String.valueOf(start), String.valueOf(end),
				String.valueOf(orderByComparator)
			};

		List<VLegalSigner> list = (List<VLegalSigner>)FinderCacheUtil.getResult(FINDER_PATH_FIND_BY_GROUPID,
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

			query.append(_SQL_SELECT_VLEGALSIGNER_WHERE);

			query.append(_FINDER_COLUMN_GROUPID_GROUPID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}

			else {
				query.append(VLegalSignerModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(groupId);

				list = (List<VLegalSigner>)QueryUtil.list(q, getDialect(),
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
	 * Finds the first v legal signer in the ordered set where groupId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param groupId the group id to search with
	 * @param orderByComparator the comparator to order the set by
	 * @return the first matching v legal signer
	 * @throws com.vportal.portlet.vlegal.NoSuchVLegalSignerException if a matching v legal signer could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public VLegalSigner findByGroupId_First(long groupId,
		OrderByComparator orderByComparator)
		throws NoSuchVLegalSignerException, SystemException {
		List<VLegalSigner> list = findByGroupId(groupId, 0, 1, orderByComparator);

		if (list.isEmpty()) {
			StringBundler msg = new StringBundler(4);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("groupId=");
			msg.append(groupId);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			throw new NoSuchVLegalSignerException(msg.toString());
		}
		else {
			return list.get(0);
		}
	}

	/**
	 * Finds the last v legal signer in the ordered set where groupId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param groupId the group id to search with
	 * @param orderByComparator the comparator to order the set by
	 * @return the last matching v legal signer
	 * @throws com.vportal.portlet.vlegal.NoSuchVLegalSignerException if a matching v legal signer could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public VLegalSigner findByGroupId_Last(long groupId,
		OrderByComparator orderByComparator)
		throws NoSuchVLegalSignerException, SystemException {
		int count = countByGroupId(groupId);

		List<VLegalSigner> list = findByGroupId(groupId, count - 1, count,
				orderByComparator);

		if (list.isEmpty()) {
			StringBundler msg = new StringBundler(4);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("groupId=");
			msg.append(groupId);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			throw new NoSuchVLegalSignerException(msg.toString());
		}
		else {
			return list.get(0);
		}
	}

	/**
	 * Finds the v legal signers before and after the current v legal signer in the ordered set where groupId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param sigId the primary key of the current v legal signer
	 * @param groupId the group id to search with
	 * @param orderByComparator the comparator to order the set by
	 * @return the previous, current, and next v legal signer
	 * @throws com.vportal.portlet.vlegal.NoSuchVLegalSignerException if a v legal signer with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public VLegalSigner[] findByGroupId_PrevAndNext(String sigId, long groupId,
		OrderByComparator orderByComparator)
		throws NoSuchVLegalSignerException, SystemException {
		VLegalSigner vLegalSigner = findByPrimaryKey(sigId);

		Session session = null;

		try {
			session = openSession();

			VLegalSigner[] array = new VLegalSignerImpl[3];

			array[0] = getByGroupId_PrevAndNext(session, vLegalSigner, groupId,
					orderByComparator, true);

			array[1] = vLegalSigner;

			array[2] = getByGroupId_PrevAndNext(session, vLegalSigner, groupId,
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

	protected VLegalSigner getByGroupId_PrevAndNext(Session session,
		VLegalSigner vLegalSigner, long groupId,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_VLEGALSIGNER_WHERE);

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
			query.append(VLegalSignerModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(groupId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByValues(vLegalSigner);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<VLegalSigner> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Finds the v legal signer where groupId = &#63; and sigId = &#63; or throws a {@link com.vportal.portlet.vlegal.NoSuchVLegalSignerException} if it could not be found.
	 *
	 * @param groupId the group id to search with
	 * @param sigId the sig id to search with
	 * @return the matching v legal signer
	 * @throws com.vportal.portlet.vlegal.NoSuchVLegalSignerException if a matching v legal signer could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public VLegalSigner findByG_S(long groupId, String sigId)
		throws NoSuchVLegalSignerException, SystemException {
		VLegalSigner vLegalSigner = fetchByG_S(groupId, sigId);

		if (vLegalSigner == null) {
			StringBundler msg = new StringBundler(6);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("groupId=");
			msg.append(groupId);

			msg.append(", sigId=");
			msg.append(sigId);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			if (_log.isWarnEnabled()) {
				_log.warn(msg.toString());
			}

			throw new NoSuchVLegalSignerException(msg.toString());
		}

		return vLegalSigner;
	}

	/**
	 * Finds the v legal signer where groupId = &#63; and sigId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param groupId the group id to search with
	 * @param sigId the sig id to search with
	 * @return the matching v legal signer, or <code>null</code> if a matching v legal signer could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public VLegalSigner fetchByG_S(long groupId, String sigId)
		throws SystemException {
		return fetchByG_S(groupId, sigId, true);
	}

	/**
	 * Finds the v legal signer where groupId = &#63; and sigId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param groupId the group id to search with
	 * @param sigId the sig id to search with
	 * @return the matching v legal signer, or <code>null</code> if a matching v legal signer could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public VLegalSigner fetchByG_S(long groupId, String sigId,
		boolean retrieveFromCache) throws SystemException {
		Object[] finderArgs = new Object[] { groupId, sigId };

		Object result = null;

		if (retrieveFromCache) {
			result = FinderCacheUtil.getResult(FINDER_PATH_FETCH_BY_G_S,
					finderArgs, this);
		}

		if (result == null) {
			StringBundler query = new StringBundler(4);

			query.append(_SQL_SELECT_VLEGALSIGNER_WHERE);

			query.append(_FINDER_COLUMN_G_S_GROUPID_2);

			if (sigId == null) {
				query.append(_FINDER_COLUMN_G_S_SIGID_1);
			}
			else {
				if (sigId.equals(StringPool.BLANK)) {
					query.append(_FINDER_COLUMN_G_S_SIGID_3);
				}
				else {
					query.append(_FINDER_COLUMN_G_S_SIGID_2);
				}
			}

			query.append(VLegalSignerModelImpl.ORDER_BY_JPQL);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(groupId);

				if (sigId != null) {
					qPos.add(sigId);
				}

				List<VLegalSigner> list = q.list();

				result = list;

				VLegalSigner vLegalSigner = null;

				if (list.isEmpty()) {
					FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_G_S,
						finderArgs, list);
				}
				else {
					vLegalSigner = list.get(0);

					cacheResult(vLegalSigner);

					if ((vLegalSigner.getGroupId() != groupId) ||
							(vLegalSigner.getSigId() == null) ||
							!vLegalSigner.getSigId().equals(sigId)) {
						FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_G_S,
							finderArgs, vLegalSigner);
					}
				}

				return vLegalSigner;
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (result == null) {
					FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_G_S,
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
				return (VLegalSigner)result;
			}
		}
	}

	/**
	 * Finds all the v legal signers where groupId = &#63; and language = &#63;.
	 *
	 * @param groupId the group id to search with
	 * @param language the language to search with
	 * @return the matching v legal signers
	 * @throws SystemException if a system exception occurred
	 */
	public List<VLegalSigner> findByGroup_Lang(long groupId, String language)
		throws SystemException {
		return findByGroup_Lang(groupId, language, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Finds a range of all the v legal signers where groupId = &#63; and language = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param groupId the group id to search with
	 * @param language the language to search with
	 * @param start the lower bound of the range of v legal signers to return
	 * @param end the upper bound of the range of v legal signers to return (not inclusive)
	 * @return the range of matching v legal signers
	 * @throws SystemException if a system exception occurred
	 */
	public List<VLegalSigner> findByGroup_Lang(long groupId, String language,
		int start, int end) throws SystemException {
		return findByGroup_Lang(groupId, language, start, end, null);
	}

	/**
	 * Finds an ordered range of all the v legal signers where groupId = &#63; and language = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param groupId the group id to search with
	 * @param language the language to search with
	 * @param start the lower bound of the range of v legal signers to return
	 * @param end the upper bound of the range of v legal signers to return (not inclusive)
	 * @param orderByComparator the comparator to order the results by
	 * @return the ordered range of matching v legal signers
	 * @throws SystemException if a system exception occurred
	 */
	public List<VLegalSigner> findByGroup_Lang(long groupId, String language,
		int start, int end, OrderByComparator orderByComparator)
		throws SystemException {
		Object[] finderArgs = new Object[] {
				groupId, language,
				
				String.valueOf(start), String.valueOf(end),
				String.valueOf(orderByComparator)
			};

		List<VLegalSigner> list = (List<VLegalSigner>)FinderCacheUtil.getResult(FINDER_PATH_FIND_BY_GROUP_LANG,
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

			query.append(_SQL_SELECT_VLEGALSIGNER_WHERE);

			query.append(_FINDER_COLUMN_GROUP_LANG_GROUPID_2);

			if (language == null) {
				query.append(_FINDER_COLUMN_GROUP_LANG_LANGUAGE_1);
			}
			else {
				if (language.equals(StringPool.BLANK)) {
					query.append(_FINDER_COLUMN_GROUP_LANG_LANGUAGE_3);
				}
				else {
					query.append(_FINDER_COLUMN_GROUP_LANG_LANGUAGE_2);
				}
			}

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}

			else {
				query.append(VLegalSignerModelImpl.ORDER_BY_JPQL);
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

				list = (List<VLegalSigner>)QueryUtil.list(q, getDialect(),
						start, end);
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (list == null) {
					FinderCacheUtil.removeResult(FINDER_PATH_FIND_BY_GROUP_LANG,
						finderArgs);
				}
				else {
					cacheResult(list);

					FinderCacheUtil.putResult(FINDER_PATH_FIND_BY_GROUP_LANG,
						finderArgs, list);
				}

				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Finds the first v legal signer in the ordered set where groupId = &#63; and language = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param groupId the group id to search with
	 * @param language the language to search with
	 * @param orderByComparator the comparator to order the set by
	 * @return the first matching v legal signer
	 * @throws com.vportal.portlet.vlegal.NoSuchVLegalSignerException if a matching v legal signer could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public VLegalSigner findByGroup_Lang_First(long groupId, String language,
		OrderByComparator orderByComparator)
		throws NoSuchVLegalSignerException, SystemException {
		List<VLegalSigner> list = findByGroup_Lang(groupId, language, 0, 1,
				orderByComparator);

		if (list.isEmpty()) {
			StringBundler msg = new StringBundler(6);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("groupId=");
			msg.append(groupId);

			msg.append(", language=");
			msg.append(language);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			throw new NoSuchVLegalSignerException(msg.toString());
		}
		else {
			return list.get(0);
		}
	}

	/**
	 * Finds the last v legal signer in the ordered set where groupId = &#63; and language = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param groupId the group id to search with
	 * @param language the language to search with
	 * @param orderByComparator the comparator to order the set by
	 * @return the last matching v legal signer
	 * @throws com.vportal.portlet.vlegal.NoSuchVLegalSignerException if a matching v legal signer could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public VLegalSigner findByGroup_Lang_Last(long groupId, String language,
		OrderByComparator orderByComparator)
		throws NoSuchVLegalSignerException, SystemException {
		int count = countByGroup_Lang(groupId, language);

		List<VLegalSigner> list = findByGroup_Lang(groupId, language,
				count - 1, count, orderByComparator);

		if (list.isEmpty()) {
			StringBundler msg = new StringBundler(6);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("groupId=");
			msg.append(groupId);

			msg.append(", language=");
			msg.append(language);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			throw new NoSuchVLegalSignerException(msg.toString());
		}
		else {
			return list.get(0);
		}
	}

	/**
	 * Finds the v legal signers before and after the current v legal signer in the ordered set where groupId = &#63; and language = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param sigId the primary key of the current v legal signer
	 * @param groupId the group id to search with
	 * @param language the language to search with
	 * @param orderByComparator the comparator to order the set by
	 * @return the previous, current, and next v legal signer
	 * @throws com.vportal.portlet.vlegal.NoSuchVLegalSignerException if a v legal signer with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public VLegalSigner[] findByGroup_Lang_PrevAndNext(String sigId,
		long groupId, String language, OrderByComparator orderByComparator)
		throws NoSuchVLegalSignerException, SystemException {
		VLegalSigner vLegalSigner = findByPrimaryKey(sigId);

		Session session = null;

		try {
			session = openSession();

			VLegalSigner[] array = new VLegalSignerImpl[3];

			array[0] = getByGroup_Lang_PrevAndNext(session, vLegalSigner,
					groupId, language, orderByComparator, true);

			array[1] = vLegalSigner;

			array[2] = getByGroup_Lang_PrevAndNext(session, vLegalSigner,
					groupId, language, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected VLegalSigner getByGroup_Lang_PrevAndNext(Session session,
		VLegalSigner vLegalSigner, long groupId, String language,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_VLEGALSIGNER_WHERE);

		query.append(_FINDER_COLUMN_GROUP_LANG_GROUPID_2);

		if (language == null) {
			query.append(_FINDER_COLUMN_GROUP_LANG_LANGUAGE_1);
		}
		else {
			if (language.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_GROUP_LANG_LANGUAGE_3);
			}
			else {
				query.append(_FINDER_COLUMN_GROUP_LANG_LANGUAGE_2);
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
			query.append(VLegalSignerModelImpl.ORDER_BY_JPQL);
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
			Object[] values = orderByComparator.getOrderByValues(vLegalSigner);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<VLegalSigner> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Finds all the v legal signers where groupId = &#63; and language = &#63; and statusSigner = &#63;.
	 *
	 * @param groupId the group id to search with
	 * @param language the language to search with
	 * @param statusSigner the status signer to search with
	 * @return the matching v legal signers
	 * @throws SystemException if a system exception occurred
	 */
	public List<VLegalSigner> findByG_L_S(long groupId, String language,
		boolean statusSigner) throws SystemException {
		return findByG_L_S(groupId, language, statusSigner, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Finds a range of all the v legal signers where groupId = &#63; and language = &#63; and statusSigner = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param groupId the group id to search with
	 * @param language the language to search with
	 * @param statusSigner the status signer to search with
	 * @param start the lower bound of the range of v legal signers to return
	 * @param end the upper bound of the range of v legal signers to return (not inclusive)
	 * @return the range of matching v legal signers
	 * @throws SystemException if a system exception occurred
	 */
	public List<VLegalSigner> findByG_L_S(long groupId, String language,
		boolean statusSigner, int start, int end) throws SystemException {
		return findByG_L_S(groupId, language, statusSigner, start, end, null);
	}

	/**
	 * Finds an ordered range of all the v legal signers where groupId = &#63; and language = &#63; and statusSigner = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param groupId the group id to search with
	 * @param language the language to search with
	 * @param statusSigner the status signer to search with
	 * @param start the lower bound of the range of v legal signers to return
	 * @param end the upper bound of the range of v legal signers to return (not inclusive)
	 * @param orderByComparator the comparator to order the results by
	 * @return the ordered range of matching v legal signers
	 * @throws SystemException if a system exception occurred
	 */
	public List<VLegalSigner> findByG_L_S(long groupId, String language,
		boolean statusSigner, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		Object[] finderArgs = new Object[] {
				groupId, language, statusSigner,
				
				String.valueOf(start), String.valueOf(end),
				String.valueOf(orderByComparator)
			};

		List<VLegalSigner> list = (List<VLegalSigner>)FinderCacheUtil.getResult(FINDER_PATH_FIND_BY_G_L_S,
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

			query.append(_SQL_SELECT_VLEGALSIGNER_WHERE);

			query.append(_FINDER_COLUMN_G_L_S_GROUPID_2);

			if (language == null) {
				query.append(_FINDER_COLUMN_G_L_S_LANGUAGE_1);
			}
			else {
				if (language.equals(StringPool.BLANK)) {
					query.append(_FINDER_COLUMN_G_L_S_LANGUAGE_3);
				}
				else {
					query.append(_FINDER_COLUMN_G_L_S_LANGUAGE_2);
				}
			}

			query.append(_FINDER_COLUMN_G_L_S_STATUSSIGNER_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}

			else {
				query.append(VLegalSignerModelImpl.ORDER_BY_JPQL);
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

				qPos.add(statusSigner);

				list = (List<VLegalSigner>)QueryUtil.list(q, getDialect(),
						start, end);
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (list == null) {
					FinderCacheUtil.removeResult(FINDER_PATH_FIND_BY_G_L_S,
						finderArgs);
				}
				else {
					cacheResult(list);

					FinderCacheUtil.putResult(FINDER_PATH_FIND_BY_G_L_S,
						finderArgs, list);
				}

				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Finds the first v legal signer in the ordered set where groupId = &#63; and language = &#63; and statusSigner = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param groupId the group id to search with
	 * @param language the language to search with
	 * @param statusSigner the status signer to search with
	 * @param orderByComparator the comparator to order the set by
	 * @return the first matching v legal signer
	 * @throws com.vportal.portlet.vlegal.NoSuchVLegalSignerException if a matching v legal signer could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public VLegalSigner findByG_L_S_First(long groupId, String language,
		boolean statusSigner, OrderByComparator orderByComparator)
		throws NoSuchVLegalSignerException, SystemException {
		List<VLegalSigner> list = findByG_L_S(groupId, language, statusSigner,
				0, 1, orderByComparator);

		if (list.isEmpty()) {
			StringBundler msg = new StringBundler(8);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("groupId=");
			msg.append(groupId);

			msg.append(", language=");
			msg.append(language);

			msg.append(", statusSigner=");
			msg.append(statusSigner);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			throw new NoSuchVLegalSignerException(msg.toString());
		}
		else {
			return list.get(0);
		}
	}

	/**
	 * Finds the last v legal signer in the ordered set where groupId = &#63; and language = &#63; and statusSigner = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param groupId the group id to search with
	 * @param language the language to search with
	 * @param statusSigner the status signer to search with
	 * @param orderByComparator the comparator to order the set by
	 * @return the last matching v legal signer
	 * @throws com.vportal.portlet.vlegal.NoSuchVLegalSignerException if a matching v legal signer could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public VLegalSigner findByG_L_S_Last(long groupId, String language,
		boolean statusSigner, OrderByComparator orderByComparator)
		throws NoSuchVLegalSignerException, SystemException {
		int count = countByG_L_S(groupId, language, statusSigner);

		List<VLegalSigner> list = findByG_L_S(groupId, language, statusSigner,
				count - 1, count, orderByComparator);

		if (list.isEmpty()) {
			StringBundler msg = new StringBundler(8);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("groupId=");
			msg.append(groupId);

			msg.append(", language=");
			msg.append(language);

			msg.append(", statusSigner=");
			msg.append(statusSigner);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			throw new NoSuchVLegalSignerException(msg.toString());
		}
		else {
			return list.get(0);
		}
	}

	/**
	 * Finds the v legal signers before and after the current v legal signer in the ordered set where groupId = &#63; and language = &#63; and statusSigner = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param sigId the primary key of the current v legal signer
	 * @param groupId the group id to search with
	 * @param language the language to search with
	 * @param statusSigner the status signer to search with
	 * @param orderByComparator the comparator to order the set by
	 * @return the previous, current, and next v legal signer
	 * @throws com.vportal.portlet.vlegal.NoSuchVLegalSignerException if a v legal signer with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public VLegalSigner[] findByG_L_S_PrevAndNext(String sigId, long groupId,
		String language, boolean statusSigner,
		OrderByComparator orderByComparator)
		throws NoSuchVLegalSignerException, SystemException {
		VLegalSigner vLegalSigner = findByPrimaryKey(sigId);

		Session session = null;

		try {
			session = openSession();

			VLegalSigner[] array = new VLegalSignerImpl[3];

			array[0] = getByG_L_S_PrevAndNext(session, vLegalSigner, groupId,
					language, statusSigner, orderByComparator, true);

			array[1] = vLegalSigner;

			array[2] = getByG_L_S_PrevAndNext(session, vLegalSigner, groupId,
					language, statusSigner, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected VLegalSigner getByG_L_S_PrevAndNext(Session session,
		VLegalSigner vLegalSigner, long groupId, String language,
		boolean statusSigner, OrderByComparator orderByComparator,
		boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_VLEGALSIGNER_WHERE);

		query.append(_FINDER_COLUMN_G_L_S_GROUPID_2);

		if (language == null) {
			query.append(_FINDER_COLUMN_G_L_S_LANGUAGE_1);
		}
		else {
			if (language.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_G_L_S_LANGUAGE_3);
			}
			else {
				query.append(_FINDER_COLUMN_G_L_S_LANGUAGE_2);
			}
		}

		query.append(_FINDER_COLUMN_G_L_S_STATUSSIGNER_2);

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
			query.append(VLegalSignerModelImpl.ORDER_BY_JPQL);
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

		qPos.add(statusSigner);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByValues(vLegalSigner);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<VLegalSigner> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Finds all the v legal signers.
	 *
	 * @return the v legal signers
	 * @throws SystemException if a system exception occurred
	 */
	public List<VLegalSigner> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Finds a range of all the v legal signers.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param start the lower bound of the range of v legal signers to return
	 * @param end the upper bound of the range of v legal signers to return (not inclusive)
	 * @return the range of v legal signers
	 * @throws SystemException if a system exception occurred
	 */
	public List<VLegalSigner> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Finds an ordered range of all the v legal signers.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param start the lower bound of the range of v legal signers to return
	 * @param end the upper bound of the range of v legal signers to return (not inclusive)
	 * @param orderByComparator the comparator to order the results by
	 * @return the ordered range of v legal signers
	 * @throws SystemException if a system exception occurred
	 */
	public List<VLegalSigner> findAll(int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		Object[] finderArgs = new Object[] {
				String.valueOf(start), String.valueOf(end),
				String.valueOf(orderByComparator)
			};

		List<VLegalSigner> list = (List<VLegalSigner>)FinderCacheUtil.getResult(FINDER_PATH_FIND_ALL,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_VLEGALSIGNER);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_VLEGALSIGNER.concat(VLegalSignerModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (orderByComparator == null) {
					list = (List<VLegalSigner>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);
				}
				else {
					list = (List<VLegalSigner>)QueryUtil.list(q, getDialect(),
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
	 * Removes all the v legal signers where groupId = &#63; from the database.
	 *
	 * @param groupId the group id to search with
	 * @throws SystemException if a system exception occurred
	 */
	public void removeByGroupId(long groupId) throws SystemException {
		for (VLegalSigner vLegalSigner : findByGroupId(groupId)) {
			remove(vLegalSigner);
		}
	}

	/**
	 * Removes the v legal signer where groupId = &#63; and sigId = &#63; from the database.
	 *
	 * @param groupId the group id to search with
	 * @param sigId the sig id to search with
	 * @throws SystemException if a system exception occurred
	 */
	public void removeByG_S(long groupId, String sigId)
		throws NoSuchVLegalSignerException, SystemException {
		VLegalSigner vLegalSigner = findByG_S(groupId, sigId);

		remove(vLegalSigner);
	}

	/**
	 * Removes all the v legal signers where groupId = &#63; and language = &#63; from the database.
	 *
	 * @param groupId the group id to search with
	 * @param language the language to search with
	 * @throws SystemException if a system exception occurred
	 */
	public void removeByGroup_Lang(long groupId, String language)
		throws SystemException {
		for (VLegalSigner vLegalSigner : findByGroup_Lang(groupId, language)) {
			remove(vLegalSigner);
		}
	}

	/**
	 * Removes all the v legal signers where groupId = &#63; and language = &#63; and statusSigner = &#63; from the database.
	 *
	 * @param groupId the group id to search with
	 * @param language the language to search with
	 * @param statusSigner the status signer to search with
	 * @throws SystemException if a system exception occurred
	 */
	public void removeByG_L_S(long groupId, String language,
		boolean statusSigner) throws SystemException {
		for (VLegalSigner vLegalSigner : findByG_L_S(groupId, language,
				statusSigner)) {
			remove(vLegalSigner);
		}
	}

	/**
	 * Removes all the v legal signers from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	public void removeAll() throws SystemException {
		for (VLegalSigner vLegalSigner : findAll()) {
			remove(vLegalSigner);
		}
	}

	/**
	 * Counts all the v legal signers where groupId = &#63;.
	 *
	 * @param groupId the group id to search with
	 * @return the number of matching v legal signers
	 * @throws SystemException if a system exception occurred
	 */
	public int countByGroupId(long groupId) throws SystemException {
		Object[] finderArgs = new Object[] { groupId };

		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_BY_GROUPID,
				finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_VLEGALSIGNER_WHERE);

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
	 * Counts all the v legal signers where groupId = &#63; and sigId = &#63;.
	 *
	 * @param groupId the group id to search with
	 * @param sigId the sig id to search with
	 * @return the number of matching v legal signers
	 * @throws SystemException if a system exception occurred
	 */
	public int countByG_S(long groupId, String sigId) throws SystemException {
		Object[] finderArgs = new Object[] { groupId, sigId };

		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_BY_G_S,
				finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_VLEGALSIGNER_WHERE);

			query.append(_FINDER_COLUMN_G_S_GROUPID_2);

			if (sigId == null) {
				query.append(_FINDER_COLUMN_G_S_SIGID_1);
			}
			else {
				if (sigId.equals(StringPool.BLANK)) {
					query.append(_FINDER_COLUMN_G_S_SIGID_3);
				}
				else {
					query.append(_FINDER_COLUMN_G_S_SIGID_2);
				}
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(groupId);

				if (sigId != null) {
					qPos.add(sigId);
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

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_G_S, finderArgs,
					count);

				closeSession(session);
			}
		}

		return count.intValue();
	}

	/**
	 * Counts all the v legal signers where groupId = &#63; and language = &#63;.
	 *
	 * @param groupId the group id to search with
	 * @param language the language to search with
	 * @return the number of matching v legal signers
	 * @throws SystemException if a system exception occurred
	 */
	public int countByGroup_Lang(long groupId, String language)
		throws SystemException {
		Object[] finderArgs = new Object[] { groupId, language };

		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_BY_GROUP_LANG,
				finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_VLEGALSIGNER_WHERE);

			query.append(_FINDER_COLUMN_GROUP_LANG_GROUPID_2);

			if (language == null) {
				query.append(_FINDER_COLUMN_GROUP_LANG_LANGUAGE_1);
			}
			else {
				if (language.equals(StringPool.BLANK)) {
					query.append(_FINDER_COLUMN_GROUP_LANG_LANGUAGE_3);
				}
				else {
					query.append(_FINDER_COLUMN_GROUP_LANG_LANGUAGE_2);
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

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_GROUP_LANG,
					finderArgs, count);

				closeSession(session);
			}
		}

		return count.intValue();
	}

	/**
	 * Counts all the v legal signers where groupId = &#63; and language = &#63; and statusSigner = &#63;.
	 *
	 * @param groupId the group id to search with
	 * @param language the language to search with
	 * @param statusSigner the status signer to search with
	 * @return the number of matching v legal signers
	 * @throws SystemException if a system exception occurred
	 */
	public int countByG_L_S(long groupId, String language, boolean statusSigner)
		throws SystemException {
		Object[] finderArgs = new Object[] { groupId, language, statusSigner };

		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_BY_G_L_S,
				finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(4);

			query.append(_SQL_COUNT_VLEGALSIGNER_WHERE);

			query.append(_FINDER_COLUMN_G_L_S_GROUPID_2);

			if (language == null) {
				query.append(_FINDER_COLUMN_G_L_S_LANGUAGE_1);
			}
			else {
				if (language.equals(StringPool.BLANK)) {
					query.append(_FINDER_COLUMN_G_L_S_LANGUAGE_3);
				}
				else {
					query.append(_FINDER_COLUMN_G_L_S_LANGUAGE_2);
				}
			}

			query.append(_FINDER_COLUMN_G_L_S_STATUSSIGNER_2);

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

				qPos.add(statusSigner);

				count = (Long)q.uniqueResult();
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (count == null) {
					count = Long.valueOf(0);
				}

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_G_L_S,
					finderArgs, count);

				closeSession(session);
			}
		}

		return count.intValue();
	}

	/**
	 * Counts all the v legal signers.
	 *
	 * @return the number of v legal signers
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

				Query q = session.createQuery(_SQL_COUNT_VLEGALSIGNER);

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
	 * Initializes the v legal signer persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.com.vportal.portlet.vlegal.model.VLegalSigner")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<VLegalSigner>> listenersList = new ArrayList<ModelListener<VLegalSigner>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<VLegalSigner>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(VLegalSignerImpl.class.getName());
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
	private static final String _SQL_SELECT_VLEGALSIGNER = "SELECT vLegalSigner FROM VLegalSigner vLegalSigner";
	private static final String _SQL_SELECT_VLEGALSIGNER_WHERE = "SELECT vLegalSigner FROM VLegalSigner vLegalSigner WHERE ";
	private static final String _SQL_COUNT_VLEGALSIGNER = "SELECT COUNT(vLegalSigner) FROM VLegalSigner vLegalSigner";
	private static final String _SQL_COUNT_VLEGALSIGNER_WHERE = "SELECT COUNT(vLegalSigner) FROM VLegalSigner vLegalSigner WHERE ";
	private static final String _FINDER_COLUMN_GROUPID_GROUPID_2 = "vLegalSigner.groupId = ?";
	private static final String _FINDER_COLUMN_G_S_GROUPID_2 = "vLegalSigner.groupId = ? AND ";
	private static final String _FINDER_COLUMN_G_S_SIGID_1 = "vLegalSigner.sigId IS NULL";
	private static final String _FINDER_COLUMN_G_S_SIGID_2 = "vLegalSigner.sigId = ?";
	private static final String _FINDER_COLUMN_G_S_SIGID_3 = "(vLegalSigner.sigId IS NULL OR vLegalSigner.sigId = ?)";
	private static final String _FINDER_COLUMN_GROUP_LANG_GROUPID_2 = "vLegalSigner.groupId = ? AND ";
	private static final String _FINDER_COLUMN_GROUP_LANG_LANGUAGE_1 = "vLegalSigner.language IS NULL";
	private static final String _FINDER_COLUMN_GROUP_LANG_LANGUAGE_2 = "vLegalSigner.language = ?";
	private static final String _FINDER_COLUMN_GROUP_LANG_LANGUAGE_3 = "(vLegalSigner.language IS NULL OR vLegalSigner.language = ?)";
	private static final String _FINDER_COLUMN_G_L_S_GROUPID_2 = "vLegalSigner.groupId = ? AND ";
	private static final String _FINDER_COLUMN_G_L_S_LANGUAGE_1 = "vLegalSigner.language IS NULL AND ";
	private static final String _FINDER_COLUMN_G_L_S_LANGUAGE_2 = "vLegalSigner.language = ? AND ";
	private static final String _FINDER_COLUMN_G_L_S_LANGUAGE_3 = "(vLegalSigner.language IS NULL OR vLegalSigner.language = ?) AND ";
	private static final String _FINDER_COLUMN_G_L_S_STATUSSIGNER_2 = "vLegalSigner.statusSigner = ?";
	private static final String _ORDER_BY_ENTITY_ALIAS = "vLegalSigner.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No VLegalSigner exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No VLegalSigner exists with the key {";
	private static Log _log = LogFactoryUtil.getLog(VLegalSignerPersistenceImpl.class);
}