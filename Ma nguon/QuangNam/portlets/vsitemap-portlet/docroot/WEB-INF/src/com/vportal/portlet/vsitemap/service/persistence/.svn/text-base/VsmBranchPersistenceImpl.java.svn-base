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

package com.vportal.portlet.vsitemap.service.persistence;

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

import com.vportal.portlet.vsitemap.NoSuchVsmBranchException;
import com.vportal.portlet.vsitemap.model.VsmBranch;
import com.vportal.portlet.vsitemap.model.impl.VsmBranchImpl;
import com.vportal.portlet.vsitemap.model.impl.VsmBranchModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The persistence implementation for the vsm branch service.
 *
 * <p>
 * Never modify or reference this class directly. Always use {@link VsmBranchUtil} to access the vsm branch persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
 * </p>
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author vietsoftware
 * @see VsmBranchPersistence
 * @see VsmBranchUtil
 * @generated
 */
public class VsmBranchPersistenceImpl extends BasePersistenceImpl<VsmBranch>
	implements VsmBranchPersistence {
	public static final String FINDER_CLASS_NAME_ENTITY = VsmBranchImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST = FINDER_CLASS_NAME_ENTITY +
		".List";
	public static final FinderPath FINDER_PATH_FIND_BY_PARENT = new FinderPath(VsmBranchModelImpl.ENTITY_CACHE_ENABLED,
			VsmBranchModelImpl.FINDER_CACHE_ENABLED, FINDER_CLASS_NAME_LIST,
			"findByParent",
			new String[] {
				Long.class.getName(),
				
			"java.lang.Integer", "java.lang.Integer",
				"com.liferay.portal.kernel.util.OrderByComparator"
			});
	public static final FinderPath FINDER_PATH_COUNT_BY_PARENT = new FinderPath(VsmBranchModelImpl.ENTITY_CACHE_ENABLED,
			VsmBranchModelImpl.FINDER_CACHE_ENABLED, FINDER_CLASS_NAME_LIST,
			"countByParent", new String[] { Long.class.getName() });
	public static final FinderPath FINDER_PATH_FIND_BY_G_L = new FinderPath(VsmBranchModelImpl.ENTITY_CACHE_ENABLED,
			VsmBranchModelImpl.FINDER_CACHE_ENABLED, FINDER_CLASS_NAME_LIST,
			"findByG_L",
			new String[] {
				Long.class.getName(), String.class.getName(),
				
			"java.lang.Integer", "java.lang.Integer",
				"com.liferay.portal.kernel.util.OrderByComparator"
			});
	public static final FinderPath FINDER_PATH_COUNT_BY_G_L = new FinderPath(VsmBranchModelImpl.ENTITY_CACHE_ENABLED,
			VsmBranchModelImpl.FINDER_CACHE_ENABLED, FINDER_CLASS_NAME_LIST,
			"countByG_L",
			new String[] { Long.class.getName(), String.class.getName() });
	public static final FinderPath FINDER_PATH_FIND_BY_G_L_P = new FinderPath(VsmBranchModelImpl.ENTITY_CACHE_ENABLED,
			VsmBranchModelImpl.FINDER_CACHE_ENABLED, FINDER_CLASS_NAME_LIST,
			"findByG_L_P",
			new String[] {
				Long.class.getName(), String.class.getName(),
				Long.class.getName(),
				
			"java.lang.Integer", "java.lang.Integer",
				"com.liferay.portal.kernel.util.OrderByComparator"
			});
	public static final FinderPath FINDER_PATH_COUNT_BY_G_L_P = new FinderPath(VsmBranchModelImpl.ENTITY_CACHE_ENABLED,
			VsmBranchModelImpl.FINDER_CACHE_ENABLED, FINDER_CLASS_NAME_LIST,
			"countByG_L_P",
			new String[] {
				Long.class.getName(), String.class.getName(),
				Long.class.getName()
			});
	public static final FinderPath FINDER_PATH_FIND_BY_ICON = new FinderPath(VsmBranchModelImpl.ENTITY_CACHE_ENABLED,
			VsmBranchModelImpl.FINDER_CACHE_ENABLED, FINDER_CLASS_NAME_LIST,
			"findByIcon",
			new String[] {
				Boolean.class.getName(),
				
			"java.lang.Integer", "java.lang.Integer",
				"com.liferay.portal.kernel.util.OrderByComparator"
			});
	public static final FinderPath FINDER_PATH_COUNT_BY_ICON = new FinderPath(VsmBranchModelImpl.ENTITY_CACHE_ENABLED,
			VsmBranchModelImpl.FINDER_CACHE_ENABLED, FINDER_CLASS_NAME_LIST,
			"countByIcon", new String[] { Boolean.class.getName() });
	public static final FinderPath FINDER_PATH_FIND_BY_LANGUAGE = new FinderPath(VsmBranchModelImpl.ENTITY_CACHE_ENABLED,
			VsmBranchModelImpl.FINDER_CACHE_ENABLED, FINDER_CLASS_NAME_LIST,
			"findByLanguage",
			new String[] {
				String.class.getName(),
				
			"java.lang.Integer", "java.lang.Integer",
				"com.liferay.portal.kernel.util.OrderByComparator"
			});
	public static final FinderPath FINDER_PATH_COUNT_BY_LANGUAGE = new FinderPath(VsmBranchModelImpl.ENTITY_CACHE_ENABLED,
			VsmBranchModelImpl.FINDER_CACHE_ENABLED, FINDER_CLASS_NAME_LIST,
			"countByLanguage", new String[] { String.class.getName() });
	public static final FinderPath FINDER_PATH_FIND_ALL = new FinderPath(VsmBranchModelImpl.ENTITY_CACHE_ENABLED,
			VsmBranchModelImpl.FINDER_CACHE_ENABLED, FINDER_CLASS_NAME_LIST,
			"findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(VsmBranchModelImpl.ENTITY_CACHE_ENABLED,
			VsmBranchModelImpl.FINDER_CACHE_ENABLED, FINDER_CLASS_NAME_LIST,
			"countAll", new String[0]);

	/**
	 * Caches the vsm branch in the entity cache if it is enabled.
	 *
	 * @param vsmBranch the vsm branch to cache
	 */
	public void cacheResult(VsmBranch vsmBranch) {
		EntityCacheUtil.putResult(VsmBranchModelImpl.ENTITY_CACHE_ENABLED,
			VsmBranchImpl.class, vsmBranch.getPrimaryKey(), vsmBranch);
	}

	/**
	 * Caches the vsm branchs in the entity cache if it is enabled.
	 *
	 * @param vsmBranchs the vsm branchs to cache
	 */
	public void cacheResult(List<VsmBranch> vsmBranchs) {
		for (VsmBranch vsmBranch : vsmBranchs) {
			if (EntityCacheUtil.getResult(
						VsmBranchModelImpl.ENTITY_CACHE_ENABLED,
						VsmBranchImpl.class, vsmBranch.getPrimaryKey(), this) == null) {
				cacheResult(vsmBranch);
			}
		}
	}

	/**
	 * Clears the cache for all vsm branchs.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	public void clearCache() {
		CacheRegistryUtil.clear(VsmBranchImpl.class.getName());
		EntityCacheUtil.clearCache(VsmBranchImpl.class.getName());
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST);
	}

	/**
	 * Clears the cache for the vsm branch.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	public void clearCache(VsmBranch vsmBranch) {
		EntityCacheUtil.removeResult(VsmBranchModelImpl.ENTITY_CACHE_ENABLED,
			VsmBranchImpl.class, vsmBranch.getPrimaryKey());
	}

	/**
	 * Creates a new vsm branch with the primary key. Does not add the vsm branch to the database.
	 *
	 * @param branchId the primary key for the new vsm branch
	 * @return the new vsm branch
	 */
	public VsmBranch create(long branchId) {
		VsmBranch vsmBranch = new VsmBranchImpl();

		vsmBranch.setNew(true);
		vsmBranch.setPrimaryKey(branchId);

		return vsmBranch;
	}

	/**
	 * Removes the vsm branch with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the vsm branch to remove
	 * @return the vsm branch that was removed
	 * @throws com.liferay.portal.NoSuchModelException if a vsm branch with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public VsmBranch remove(Serializable primaryKey)
		throws NoSuchModelException, SystemException {
		return remove(((Long)primaryKey).longValue());
	}

	/**
	 * Removes the vsm branch with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param branchId the primary key of the vsm branch to remove
	 * @return the vsm branch that was removed
	 * @throws com.vportal.portlet.vsitemap.NoSuchVsmBranchException if a vsm branch with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public VsmBranch remove(long branchId)
		throws NoSuchVsmBranchException, SystemException {
		Session session = null;

		try {
			session = openSession();

			VsmBranch vsmBranch = (VsmBranch)session.get(VsmBranchImpl.class,
					new Long(branchId));

			if (vsmBranch == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + branchId);
				}

				throw new NoSuchVsmBranchException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					branchId);
			}

			return remove(vsmBranch);
		}
		catch (NoSuchVsmBranchException nsee) {
			throw nsee;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected VsmBranch removeImpl(VsmBranch vsmBranch)
		throws SystemException {
		vsmBranch = toUnwrappedModel(vsmBranch);

		Session session = null;

		try {
			session = openSession();

			BatchSessionUtil.delete(session, vsmBranch);
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST);

		EntityCacheUtil.removeResult(VsmBranchModelImpl.ENTITY_CACHE_ENABLED,
			VsmBranchImpl.class, vsmBranch.getPrimaryKey());

		return vsmBranch;
	}

	public VsmBranch updateImpl(
		com.vportal.portlet.vsitemap.model.VsmBranch vsmBranch, boolean merge)
		throws SystemException {
		vsmBranch = toUnwrappedModel(vsmBranch);

		Session session = null;

		try {
			session = openSession();

			BatchSessionUtil.update(session, vsmBranch, merge);

			vsmBranch.setNew(false);
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST);

		EntityCacheUtil.putResult(VsmBranchModelImpl.ENTITY_CACHE_ENABLED,
			VsmBranchImpl.class, vsmBranch.getPrimaryKey(), vsmBranch);

		return vsmBranch;
	}

	protected VsmBranch toUnwrappedModel(VsmBranch vsmBranch) {
		if (vsmBranch instanceof VsmBranchImpl) {
			return vsmBranch;
		}

		VsmBranchImpl vsmBranchImpl = new VsmBranchImpl();

		vsmBranchImpl.setNew(vsmBranch.isNew());
		vsmBranchImpl.setPrimaryKey(vsmBranch.getPrimaryKey());

		vsmBranchImpl.setBranchId(vsmBranch.getBranchId());
		vsmBranchImpl.setGroupId(vsmBranch.getGroupId());
		vsmBranchImpl.setCompanyId(vsmBranch.getCompanyId());
		vsmBranchImpl.setCreatedDate(vsmBranch.getCreatedDate());
		vsmBranchImpl.setCreatedByUser(vsmBranch.getCreatedByUser());
		vsmBranchImpl.setModifiedDate(vsmBranch.getModifiedDate());
		vsmBranchImpl.setModifiedByUser(vsmBranch.getModifiedByUser());
		vsmBranchImpl.setParentId(vsmBranch.getParentId());
		vsmBranchImpl.setName(vsmBranch.getName());
		vsmBranchImpl.setDescription(vsmBranch.getDescription());
		vsmBranchImpl.setAnchored(vsmBranch.isAnchored());
		vsmBranchImpl.setHref(vsmBranch.getHref());
		vsmBranchImpl.setLanguage(vsmBranch.getLanguage());
		vsmBranchImpl.setHasIcon(vsmBranch.isHasIcon());
		vsmBranchImpl.setIcon(vsmBranch.getIcon());
		vsmBranchImpl.setPosition(vsmBranch.getPosition());

		return vsmBranchImpl;
	}

	/**
	 * Finds the vsm branch with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the vsm branch to find
	 * @return the vsm branch
	 * @throws com.liferay.portal.NoSuchModelException if a vsm branch with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public VsmBranch findByPrimaryKey(Serializable primaryKey)
		throws NoSuchModelException, SystemException {
		return findByPrimaryKey(((Long)primaryKey).longValue());
	}

	/**
	 * Finds the vsm branch with the primary key or throws a {@link com.vportal.portlet.vsitemap.NoSuchVsmBranchException} if it could not be found.
	 *
	 * @param branchId the primary key of the vsm branch to find
	 * @return the vsm branch
	 * @throws com.vportal.portlet.vsitemap.NoSuchVsmBranchException if a vsm branch with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public VsmBranch findByPrimaryKey(long branchId)
		throws NoSuchVsmBranchException, SystemException {
		VsmBranch vsmBranch = fetchByPrimaryKey(branchId);

		if (vsmBranch == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + branchId);
			}

			throw new NoSuchVsmBranchException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				branchId);
		}

		return vsmBranch;
	}

	/**
	 * Finds the vsm branch with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the vsm branch to find
	 * @return the vsm branch, or <code>null</code> if a vsm branch with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public VsmBranch fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		return fetchByPrimaryKey(((Long)primaryKey).longValue());
	}

	/**
	 * Finds the vsm branch with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param branchId the primary key of the vsm branch to find
	 * @return the vsm branch, or <code>null</code> if a vsm branch with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public VsmBranch fetchByPrimaryKey(long branchId) throws SystemException {
		VsmBranch vsmBranch = (VsmBranch)EntityCacheUtil.getResult(VsmBranchModelImpl.ENTITY_CACHE_ENABLED,
				VsmBranchImpl.class, branchId, this);

		if (vsmBranch == null) {
			Session session = null;

			try {
				session = openSession();

				vsmBranch = (VsmBranch)session.get(VsmBranchImpl.class,
						new Long(branchId));
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (vsmBranch != null) {
					cacheResult(vsmBranch);
				}

				closeSession(session);
			}
		}

		return vsmBranch;
	}

	/**
	 * Finds all the vsm branchs where parentId = &#63;.
	 *
	 * @param parentId the parent id to search with
	 * @return the matching vsm branchs
	 * @throws SystemException if a system exception occurred
	 */
	public List<VsmBranch> findByParent(long parentId)
		throws SystemException {
		return findByParent(parentId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Finds a range of all the vsm branchs where parentId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param parentId the parent id to search with
	 * @param start the lower bound of the range of vsm branchs to return
	 * @param end the upper bound of the range of vsm branchs to return (not inclusive)
	 * @return the range of matching vsm branchs
	 * @throws SystemException if a system exception occurred
	 */
	public List<VsmBranch> findByParent(long parentId, int start, int end)
		throws SystemException {
		return findByParent(parentId, start, end, null);
	}

	/**
	 * Finds an ordered range of all the vsm branchs where parentId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param parentId the parent id to search with
	 * @param start the lower bound of the range of vsm branchs to return
	 * @param end the upper bound of the range of vsm branchs to return (not inclusive)
	 * @param orderByComparator the comparator to order the results by
	 * @return the ordered range of matching vsm branchs
	 * @throws SystemException if a system exception occurred
	 */
	public List<VsmBranch> findByParent(long parentId, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		Object[] finderArgs = new Object[] {
				parentId,
				
				String.valueOf(start), String.valueOf(end),
				String.valueOf(orderByComparator)
			};

		List<VsmBranch> list = (List<VsmBranch>)FinderCacheUtil.getResult(FINDER_PATH_FIND_BY_PARENT,
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

			query.append(_SQL_SELECT_VSMBRANCH_WHERE);

			query.append(_FINDER_COLUMN_PARENT_PARENTID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}

			else {
				query.append(VsmBranchModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(parentId);

				list = (List<VsmBranch>)QueryUtil.list(q, getDialect(), start,
						end);
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (list == null) {
					FinderCacheUtil.removeResult(FINDER_PATH_FIND_BY_PARENT,
						finderArgs);
				}
				else {
					cacheResult(list);

					FinderCacheUtil.putResult(FINDER_PATH_FIND_BY_PARENT,
						finderArgs, list);
				}

				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Finds the first vsm branch in the ordered set where parentId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param parentId the parent id to search with
	 * @param orderByComparator the comparator to order the set by
	 * @return the first matching vsm branch
	 * @throws com.vportal.portlet.vsitemap.NoSuchVsmBranchException if a matching vsm branch could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public VsmBranch findByParent_First(long parentId,
		OrderByComparator orderByComparator)
		throws NoSuchVsmBranchException, SystemException {
		List<VsmBranch> list = findByParent(parentId, 0, 1, orderByComparator);

		if (list.isEmpty()) {
			StringBundler msg = new StringBundler(4);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("parentId=");
			msg.append(parentId);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			throw new NoSuchVsmBranchException(msg.toString());
		}
		else {
			return list.get(0);
		}
	}

	/**
	 * Finds the last vsm branch in the ordered set where parentId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param parentId the parent id to search with
	 * @param orderByComparator the comparator to order the set by
	 * @return the last matching vsm branch
	 * @throws com.vportal.portlet.vsitemap.NoSuchVsmBranchException if a matching vsm branch could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public VsmBranch findByParent_Last(long parentId,
		OrderByComparator orderByComparator)
		throws NoSuchVsmBranchException, SystemException {
		int count = countByParent(parentId);

		List<VsmBranch> list = findByParent(parentId, count - 1, count,
				orderByComparator);

		if (list.isEmpty()) {
			StringBundler msg = new StringBundler(4);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("parentId=");
			msg.append(parentId);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			throw new NoSuchVsmBranchException(msg.toString());
		}
		else {
			return list.get(0);
		}
	}

	/**
	 * Finds the vsm branchs before and after the current vsm branch in the ordered set where parentId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param branchId the primary key of the current vsm branch
	 * @param parentId the parent id to search with
	 * @param orderByComparator the comparator to order the set by
	 * @return the previous, current, and next vsm branch
	 * @throws com.vportal.portlet.vsitemap.NoSuchVsmBranchException if a vsm branch with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public VsmBranch[] findByParent_PrevAndNext(long branchId, long parentId,
		OrderByComparator orderByComparator)
		throws NoSuchVsmBranchException, SystemException {
		VsmBranch vsmBranch = findByPrimaryKey(branchId);

		Session session = null;

		try {
			session = openSession();

			VsmBranch[] array = new VsmBranchImpl[3];

			array[0] = getByParent_PrevAndNext(session, vsmBranch, parentId,
					orderByComparator, true);

			array[1] = vsmBranch;

			array[2] = getByParent_PrevAndNext(session, vsmBranch, parentId,
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

	protected VsmBranch getByParent_PrevAndNext(Session session,
		VsmBranch vsmBranch, long parentId,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_VSMBRANCH_WHERE);

		query.append(_FINDER_COLUMN_PARENT_PARENTID_2);

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
			query.append(VsmBranchModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(parentId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByValues(vsmBranch);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<VsmBranch> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Finds all the vsm branchs where groupId = &#63; and language = &#63;.
	 *
	 * @param groupId the group id to search with
	 * @param language the language to search with
	 * @return the matching vsm branchs
	 * @throws SystemException if a system exception occurred
	 */
	public List<VsmBranch> findByG_L(long groupId, String language)
		throws SystemException {
		return findByG_L(groupId, language, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Finds a range of all the vsm branchs where groupId = &#63; and language = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param groupId the group id to search with
	 * @param language the language to search with
	 * @param start the lower bound of the range of vsm branchs to return
	 * @param end the upper bound of the range of vsm branchs to return (not inclusive)
	 * @return the range of matching vsm branchs
	 * @throws SystemException if a system exception occurred
	 */
	public List<VsmBranch> findByG_L(long groupId, String language, int start,
		int end) throws SystemException {
		return findByG_L(groupId, language, start, end, null);
	}

	/**
	 * Finds an ordered range of all the vsm branchs where groupId = &#63; and language = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param groupId the group id to search with
	 * @param language the language to search with
	 * @param start the lower bound of the range of vsm branchs to return
	 * @param end the upper bound of the range of vsm branchs to return (not inclusive)
	 * @param orderByComparator the comparator to order the results by
	 * @return the ordered range of matching vsm branchs
	 * @throws SystemException if a system exception occurred
	 */
	public List<VsmBranch> findByG_L(long groupId, String language, int start,
		int end, OrderByComparator orderByComparator) throws SystemException {
		Object[] finderArgs = new Object[] {
				groupId, language,
				
				String.valueOf(start), String.valueOf(end),
				String.valueOf(orderByComparator)
			};

		List<VsmBranch> list = (List<VsmBranch>)FinderCacheUtil.getResult(FINDER_PATH_FIND_BY_G_L,
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

			query.append(_SQL_SELECT_VSMBRANCH_WHERE);

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
				query.append(VsmBranchModelImpl.ORDER_BY_JPQL);
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

				list = (List<VsmBranch>)QueryUtil.list(q, getDialect(), start,
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
	 * Finds the first vsm branch in the ordered set where groupId = &#63; and language = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param groupId the group id to search with
	 * @param language the language to search with
	 * @param orderByComparator the comparator to order the set by
	 * @return the first matching vsm branch
	 * @throws com.vportal.portlet.vsitemap.NoSuchVsmBranchException if a matching vsm branch could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public VsmBranch findByG_L_First(long groupId, String language,
		OrderByComparator orderByComparator)
		throws NoSuchVsmBranchException, SystemException {
		List<VsmBranch> list = findByG_L(groupId, language, 0, 1,
				orderByComparator);

		if (list.isEmpty()) {
			StringBundler msg = new StringBundler(6);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("groupId=");
			msg.append(groupId);

			msg.append(", language=");
			msg.append(language);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			throw new NoSuchVsmBranchException(msg.toString());
		}
		else {
			return list.get(0);
		}
	}

	/**
	 * Finds the last vsm branch in the ordered set where groupId = &#63; and language = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param groupId the group id to search with
	 * @param language the language to search with
	 * @param orderByComparator the comparator to order the set by
	 * @return the last matching vsm branch
	 * @throws com.vportal.portlet.vsitemap.NoSuchVsmBranchException if a matching vsm branch could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public VsmBranch findByG_L_Last(long groupId, String language,
		OrderByComparator orderByComparator)
		throws NoSuchVsmBranchException, SystemException {
		int count = countByG_L(groupId, language);

		List<VsmBranch> list = findByG_L(groupId, language, count - 1, count,
				orderByComparator);

		if (list.isEmpty()) {
			StringBundler msg = new StringBundler(6);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("groupId=");
			msg.append(groupId);

			msg.append(", language=");
			msg.append(language);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			throw new NoSuchVsmBranchException(msg.toString());
		}
		else {
			return list.get(0);
		}
	}

	/**
	 * Finds the vsm branchs before and after the current vsm branch in the ordered set where groupId = &#63; and language = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param branchId the primary key of the current vsm branch
	 * @param groupId the group id to search with
	 * @param language the language to search with
	 * @param orderByComparator the comparator to order the set by
	 * @return the previous, current, and next vsm branch
	 * @throws com.vportal.portlet.vsitemap.NoSuchVsmBranchException if a vsm branch with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public VsmBranch[] findByG_L_PrevAndNext(long branchId, long groupId,
		String language, OrderByComparator orderByComparator)
		throws NoSuchVsmBranchException, SystemException {
		VsmBranch vsmBranch = findByPrimaryKey(branchId);

		Session session = null;

		try {
			session = openSession();

			VsmBranch[] array = new VsmBranchImpl[3];

			array[0] = getByG_L_PrevAndNext(session, vsmBranch, groupId,
					language, orderByComparator, true);

			array[1] = vsmBranch;

			array[2] = getByG_L_PrevAndNext(session, vsmBranch, groupId,
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

	protected VsmBranch getByG_L_PrevAndNext(Session session,
		VsmBranch vsmBranch, long groupId, String language,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_VSMBRANCH_WHERE);

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
			query.append(VsmBranchModelImpl.ORDER_BY_JPQL);
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
			Object[] values = orderByComparator.getOrderByValues(vsmBranch);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<VsmBranch> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Finds all the vsm branchs where groupId = &#63; and language = &#63; and parentId = &#63;.
	 *
	 * @param groupId the group id to search with
	 * @param language the language to search with
	 * @param parentId the parent id to search with
	 * @return the matching vsm branchs
	 * @throws SystemException if a system exception occurred
	 */
	public List<VsmBranch> findByG_L_P(long groupId, String language,
		long parentId) throws SystemException {
		return findByG_L_P(groupId, language, parentId, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Finds a range of all the vsm branchs where groupId = &#63; and language = &#63; and parentId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param groupId the group id to search with
	 * @param language the language to search with
	 * @param parentId the parent id to search with
	 * @param start the lower bound of the range of vsm branchs to return
	 * @param end the upper bound of the range of vsm branchs to return (not inclusive)
	 * @return the range of matching vsm branchs
	 * @throws SystemException if a system exception occurred
	 */
	public List<VsmBranch> findByG_L_P(long groupId, String language,
		long parentId, int start, int end) throws SystemException {
		return findByG_L_P(groupId, language, parentId, start, end, null);
	}

	/**
	 * Finds an ordered range of all the vsm branchs where groupId = &#63; and language = &#63; and parentId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param groupId the group id to search with
	 * @param language the language to search with
	 * @param parentId the parent id to search with
	 * @param start the lower bound of the range of vsm branchs to return
	 * @param end the upper bound of the range of vsm branchs to return (not inclusive)
	 * @param orderByComparator the comparator to order the results by
	 * @return the ordered range of matching vsm branchs
	 * @throws SystemException if a system exception occurred
	 */
	public List<VsmBranch> findByG_L_P(long groupId, String language,
		long parentId, int start, int end, OrderByComparator orderByComparator)
		throws SystemException {
		Object[] finderArgs = new Object[] {
				groupId, language, parentId,
				
				String.valueOf(start), String.valueOf(end),
				String.valueOf(orderByComparator)
			};

		List<VsmBranch> list = (List<VsmBranch>)FinderCacheUtil.getResult(FINDER_PATH_FIND_BY_G_L_P,
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

			query.append(_SQL_SELECT_VSMBRANCH_WHERE);

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

			query.append(_FINDER_COLUMN_G_L_P_PARENTID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}

			else {
				query.append(VsmBranchModelImpl.ORDER_BY_JPQL);
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

				qPos.add(parentId);

				list = (List<VsmBranch>)QueryUtil.list(q, getDialect(), start,
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
	 * Finds the first vsm branch in the ordered set where groupId = &#63; and language = &#63; and parentId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param groupId the group id to search with
	 * @param language the language to search with
	 * @param parentId the parent id to search with
	 * @param orderByComparator the comparator to order the set by
	 * @return the first matching vsm branch
	 * @throws com.vportal.portlet.vsitemap.NoSuchVsmBranchException if a matching vsm branch could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public VsmBranch findByG_L_P_First(long groupId, String language,
		long parentId, OrderByComparator orderByComparator)
		throws NoSuchVsmBranchException, SystemException {
		List<VsmBranch> list = findByG_L_P(groupId, language, parentId, 0, 1,
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

			throw new NoSuchVsmBranchException(msg.toString());
		}
		else {
			return list.get(0);
		}
	}

	/**
	 * Finds the last vsm branch in the ordered set where groupId = &#63; and language = &#63; and parentId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param groupId the group id to search with
	 * @param language the language to search with
	 * @param parentId the parent id to search with
	 * @param orderByComparator the comparator to order the set by
	 * @return the last matching vsm branch
	 * @throws com.vportal.portlet.vsitemap.NoSuchVsmBranchException if a matching vsm branch could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public VsmBranch findByG_L_P_Last(long groupId, String language,
		long parentId, OrderByComparator orderByComparator)
		throws NoSuchVsmBranchException, SystemException {
		int count = countByG_L_P(groupId, language, parentId);

		List<VsmBranch> list = findByG_L_P(groupId, language, parentId,
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

			throw new NoSuchVsmBranchException(msg.toString());
		}
		else {
			return list.get(0);
		}
	}

	/**
	 * Finds the vsm branchs before and after the current vsm branch in the ordered set where groupId = &#63; and language = &#63; and parentId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param branchId the primary key of the current vsm branch
	 * @param groupId the group id to search with
	 * @param language the language to search with
	 * @param parentId the parent id to search with
	 * @param orderByComparator the comparator to order the set by
	 * @return the previous, current, and next vsm branch
	 * @throws com.vportal.portlet.vsitemap.NoSuchVsmBranchException if a vsm branch with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public VsmBranch[] findByG_L_P_PrevAndNext(long branchId, long groupId,
		String language, long parentId, OrderByComparator orderByComparator)
		throws NoSuchVsmBranchException, SystemException {
		VsmBranch vsmBranch = findByPrimaryKey(branchId);

		Session session = null;

		try {
			session = openSession();

			VsmBranch[] array = new VsmBranchImpl[3];

			array[0] = getByG_L_P_PrevAndNext(session, vsmBranch, groupId,
					language, parentId, orderByComparator, true);

			array[1] = vsmBranch;

			array[2] = getByG_L_P_PrevAndNext(session, vsmBranch, groupId,
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

	protected VsmBranch getByG_L_P_PrevAndNext(Session session,
		VsmBranch vsmBranch, long groupId, String language, long parentId,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_VSMBRANCH_WHERE);

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

		query.append(_FINDER_COLUMN_G_L_P_PARENTID_2);

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
			query.append(VsmBranchModelImpl.ORDER_BY_JPQL);
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

		qPos.add(parentId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByValues(vsmBranch);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<VsmBranch> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Finds all the vsm branchs where hasIcon = &#63;.
	 *
	 * @param hasIcon the has icon to search with
	 * @return the matching vsm branchs
	 * @throws SystemException if a system exception occurred
	 */
	public List<VsmBranch> findByIcon(boolean hasIcon)
		throws SystemException {
		return findByIcon(hasIcon, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Finds a range of all the vsm branchs where hasIcon = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param hasIcon the has icon to search with
	 * @param start the lower bound of the range of vsm branchs to return
	 * @param end the upper bound of the range of vsm branchs to return (not inclusive)
	 * @return the range of matching vsm branchs
	 * @throws SystemException if a system exception occurred
	 */
	public List<VsmBranch> findByIcon(boolean hasIcon, int start, int end)
		throws SystemException {
		return findByIcon(hasIcon, start, end, null);
	}

	/**
	 * Finds an ordered range of all the vsm branchs where hasIcon = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param hasIcon the has icon to search with
	 * @param start the lower bound of the range of vsm branchs to return
	 * @param end the upper bound of the range of vsm branchs to return (not inclusive)
	 * @param orderByComparator the comparator to order the results by
	 * @return the ordered range of matching vsm branchs
	 * @throws SystemException if a system exception occurred
	 */
	public List<VsmBranch> findByIcon(boolean hasIcon, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		Object[] finderArgs = new Object[] {
				hasIcon,
				
				String.valueOf(start), String.valueOf(end),
				String.valueOf(orderByComparator)
			};

		List<VsmBranch> list = (List<VsmBranch>)FinderCacheUtil.getResult(FINDER_PATH_FIND_BY_ICON,
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

			query.append(_SQL_SELECT_VSMBRANCH_WHERE);

			query.append(_FINDER_COLUMN_ICON_HASICON_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}

			else {
				query.append(VsmBranchModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(hasIcon);

				list = (List<VsmBranch>)QueryUtil.list(q, getDialect(), start,
						end);
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (list == null) {
					FinderCacheUtil.removeResult(FINDER_PATH_FIND_BY_ICON,
						finderArgs);
				}
				else {
					cacheResult(list);

					FinderCacheUtil.putResult(FINDER_PATH_FIND_BY_ICON,
						finderArgs, list);
				}

				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Finds the first vsm branch in the ordered set where hasIcon = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param hasIcon the has icon to search with
	 * @param orderByComparator the comparator to order the set by
	 * @return the first matching vsm branch
	 * @throws com.vportal.portlet.vsitemap.NoSuchVsmBranchException if a matching vsm branch could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public VsmBranch findByIcon_First(boolean hasIcon,
		OrderByComparator orderByComparator)
		throws NoSuchVsmBranchException, SystemException {
		List<VsmBranch> list = findByIcon(hasIcon, 0, 1, orderByComparator);

		if (list.isEmpty()) {
			StringBundler msg = new StringBundler(4);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("hasIcon=");
			msg.append(hasIcon);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			throw new NoSuchVsmBranchException(msg.toString());
		}
		else {
			return list.get(0);
		}
	}

	/**
	 * Finds the last vsm branch in the ordered set where hasIcon = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param hasIcon the has icon to search with
	 * @param orderByComparator the comparator to order the set by
	 * @return the last matching vsm branch
	 * @throws com.vportal.portlet.vsitemap.NoSuchVsmBranchException if a matching vsm branch could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public VsmBranch findByIcon_Last(boolean hasIcon,
		OrderByComparator orderByComparator)
		throws NoSuchVsmBranchException, SystemException {
		int count = countByIcon(hasIcon);

		List<VsmBranch> list = findByIcon(hasIcon, count - 1, count,
				orderByComparator);

		if (list.isEmpty()) {
			StringBundler msg = new StringBundler(4);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("hasIcon=");
			msg.append(hasIcon);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			throw new NoSuchVsmBranchException(msg.toString());
		}
		else {
			return list.get(0);
		}
	}

	/**
	 * Finds the vsm branchs before and after the current vsm branch in the ordered set where hasIcon = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param branchId the primary key of the current vsm branch
	 * @param hasIcon the has icon to search with
	 * @param orderByComparator the comparator to order the set by
	 * @return the previous, current, and next vsm branch
	 * @throws com.vportal.portlet.vsitemap.NoSuchVsmBranchException if a vsm branch with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public VsmBranch[] findByIcon_PrevAndNext(long branchId, boolean hasIcon,
		OrderByComparator orderByComparator)
		throws NoSuchVsmBranchException, SystemException {
		VsmBranch vsmBranch = findByPrimaryKey(branchId);

		Session session = null;

		try {
			session = openSession();

			VsmBranch[] array = new VsmBranchImpl[3];

			array[0] = getByIcon_PrevAndNext(session, vsmBranch, hasIcon,
					orderByComparator, true);

			array[1] = vsmBranch;

			array[2] = getByIcon_PrevAndNext(session, vsmBranch, hasIcon,
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

	protected VsmBranch getByIcon_PrevAndNext(Session session,
		VsmBranch vsmBranch, boolean hasIcon,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_VSMBRANCH_WHERE);

		query.append(_FINDER_COLUMN_ICON_HASICON_2);

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
			query.append(VsmBranchModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(hasIcon);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByValues(vsmBranch);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<VsmBranch> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Finds all the vsm branchs where language = &#63;.
	 *
	 * @param language the language to search with
	 * @return the matching vsm branchs
	 * @throws SystemException if a system exception occurred
	 */
	public List<VsmBranch> findByLanguage(String language)
		throws SystemException {
		return findByLanguage(language, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
			null);
	}

	/**
	 * Finds a range of all the vsm branchs where language = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param language the language to search with
	 * @param start the lower bound of the range of vsm branchs to return
	 * @param end the upper bound of the range of vsm branchs to return (not inclusive)
	 * @return the range of matching vsm branchs
	 * @throws SystemException if a system exception occurred
	 */
	public List<VsmBranch> findByLanguage(String language, int start, int end)
		throws SystemException {
		return findByLanguage(language, start, end, null);
	}

	/**
	 * Finds an ordered range of all the vsm branchs where language = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param language the language to search with
	 * @param start the lower bound of the range of vsm branchs to return
	 * @param end the upper bound of the range of vsm branchs to return (not inclusive)
	 * @param orderByComparator the comparator to order the results by
	 * @return the ordered range of matching vsm branchs
	 * @throws SystemException if a system exception occurred
	 */
	public List<VsmBranch> findByLanguage(String language, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		Object[] finderArgs = new Object[] {
				language,
				
				String.valueOf(start), String.valueOf(end),
				String.valueOf(orderByComparator)
			};

		List<VsmBranch> list = (List<VsmBranch>)FinderCacheUtil.getResult(FINDER_PATH_FIND_BY_LANGUAGE,
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

			query.append(_SQL_SELECT_VSMBRANCH_WHERE);

			if (language == null) {
				query.append(_FINDER_COLUMN_LANGUAGE_LANGUAGE_1);
			}
			else {
				if (language.equals(StringPool.BLANK)) {
					query.append(_FINDER_COLUMN_LANGUAGE_LANGUAGE_3);
				}
				else {
					query.append(_FINDER_COLUMN_LANGUAGE_LANGUAGE_2);
				}
			}

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}

			else {
				query.append(VsmBranchModelImpl.ORDER_BY_JPQL);
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

				list = (List<VsmBranch>)QueryUtil.list(q, getDialect(), start,
						end);
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (list == null) {
					FinderCacheUtil.removeResult(FINDER_PATH_FIND_BY_LANGUAGE,
						finderArgs);
				}
				else {
					cacheResult(list);

					FinderCacheUtil.putResult(FINDER_PATH_FIND_BY_LANGUAGE,
						finderArgs, list);
				}

				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Finds the first vsm branch in the ordered set where language = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param language the language to search with
	 * @param orderByComparator the comparator to order the set by
	 * @return the first matching vsm branch
	 * @throws com.vportal.portlet.vsitemap.NoSuchVsmBranchException if a matching vsm branch could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public VsmBranch findByLanguage_First(String language,
		OrderByComparator orderByComparator)
		throws NoSuchVsmBranchException, SystemException {
		List<VsmBranch> list = findByLanguage(language, 0, 1, orderByComparator);

		if (list.isEmpty()) {
			StringBundler msg = new StringBundler(4);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("language=");
			msg.append(language);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			throw new NoSuchVsmBranchException(msg.toString());
		}
		else {
			return list.get(0);
		}
	}

	/**
	 * Finds the last vsm branch in the ordered set where language = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param language the language to search with
	 * @param orderByComparator the comparator to order the set by
	 * @return the last matching vsm branch
	 * @throws com.vportal.portlet.vsitemap.NoSuchVsmBranchException if a matching vsm branch could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public VsmBranch findByLanguage_Last(String language,
		OrderByComparator orderByComparator)
		throws NoSuchVsmBranchException, SystemException {
		int count = countByLanguage(language);

		List<VsmBranch> list = findByLanguage(language, count - 1, count,
				orderByComparator);

		if (list.isEmpty()) {
			StringBundler msg = new StringBundler(4);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("language=");
			msg.append(language);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			throw new NoSuchVsmBranchException(msg.toString());
		}
		else {
			return list.get(0);
		}
	}

	/**
	 * Finds the vsm branchs before and after the current vsm branch in the ordered set where language = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param branchId the primary key of the current vsm branch
	 * @param language the language to search with
	 * @param orderByComparator the comparator to order the set by
	 * @return the previous, current, and next vsm branch
	 * @throws com.vportal.portlet.vsitemap.NoSuchVsmBranchException if a vsm branch with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public VsmBranch[] findByLanguage_PrevAndNext(long branchId,
		String language, OrderByComparator orderByComparator)
		throws NoSuchVsmBranchException, SystemException {
		VsmBranch vsmBranch = findByPrimaryKey(branchId);

		Session session = null;

		try {
			session = openSession();

			VsmBranch[] array = new VsmBranchImpl[3];

			array[0] = getByLanguage_PrevAndNext(session, vsmBranch, language,
					orderByComparator, true);

			array[1] = vsmBranch;

			array[2] = getByLanguage_PrevAndNext(session, vsmBranch, language,
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

	protected VsmBranch getByLanguage_PrevAndNext(Session session,
		VsmBranch vsmBranch, String language,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_VSMBRANCH_WHERE);

		if (language == null) {
			query.append(_FINDER_COLUMN_LANGUAGE_LANGUAGE_1);
		}
		else {
			if (language.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_LANGUAGE_LANGUAGE_3);
			}
			else {
				query.append(_FINDER_COLUMN_LANGUAGE_LANGUAGE_2);
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
			query.append(VsmBranchModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		if (language != null) {
			qPos.add(language);
		}

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByValues(vsmBranch);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<VsmBranch> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Finds all the vsm branchs.
	 *
	 * @return the vsm branchs
	 * @throws SystemException if a system exception occurred
	 */
	public List<VsmBranch> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Finds a range of all the vsm branchs.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param start the lower bound of the range of vsm branchs to return
	 * @param end the upper bound of the range of vsm branchs to return (not inclusive)
	 * @return the range of vsm branchs
	 * @throws SystemException if a system exception occurred
	 */
	public List<VsmBranch> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Finds an ordered range of all the vsm branchs.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param start the lower bound of the range of vsm branchs to return
	 * @param end the upper bound of the range of vsm branchs to return (not inclusive)
	 * @param orderByComparator the comparator to order the results by
	 * @return the ordered range of vsm branchs
	 * @throws SystemException if a system exception occurred
	 */
	public List<VsmBranch> findAll(int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		Object[] finderArgs = new Object[] {
				String.valueOf(start), String.valueOf(end),
				String.valueOf(orderByComparator)
			};

		List<VsmBranch> list = (List<VsmBranch>)FinderCacheUtil.getResult(FINDER_PATH_FIND_ALL,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_VSMBRANCH);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_VSMBRANCH.concat(VsmBranchModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (orderByComparator == null) {
					list = (List<VsmBranch>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);
				}
				else {
					list = (List<VsmBranch>)QueryUtil.list(q, getDialect(),
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
	 * Removes all the vsm branchs where parentId = &#63; from the database.
	 *
	 * @param parentId the parent id to search with
	 * @throws SystemException if a system exception occurred
	 */
	public void removeByParent(long parentId) throws SystemException {
		for (VsmBranch vsmBranch : findByParent(parentId)) {
			remove(vsmBranch);
		}
	}

	/**
	 * Removes all the vsm branchs where groupId = &#63; and language = &#63; from the database.
	 *
	 * @param groupId the group id to search with
	 * @param language the language to search with
	 * @throws SystemException if a system exception occurred
	 */
	public void removeByG_L(long groupId, String language)
		throws SystemException {
		for (VsmBranch vsmBranch : findByG_L(groupId, language)) {
			remove(vsmBranch);
		}
	}

	/**
	 * Removes all the vsm branchs where groupId = &#63; and language = &#63; and parentId = &#63; from the database.
	 *
	 * @param groupId the group id to search with
	 * @param language the language to search with
	 * @param parentId the parent id to search with
	 * @throws SystemException if a system exception occurred
	 */
	public void removeByG_L_P(long groupId, String language, long parentId)
		throws SystemException {
		for (VsmBranch vsmBranch : findByG_L_P(groupId, language, parentId)) {
			remove(vsmBranch);
		}
	}

	/**
	 * Removes all the vsm branchs where hasIcon = &#63; from the database.
	 *
	 * @param hasIcon the has icon to search with
	 * @throws SystemException if a system exception occurred
	 */
	public void removeByIcon(boolean hasIcon) throws SystemException {
		for (VsmBranch vsmBranch : findByIcon(hasIcon)) {
			remove(vsmBranch);
		}
	}

	/**
	 * Removes all the vsm branchs where language = &#63; from the database.
	 *
	 * @param language the language to search with
	 * @throws SystemException if a system exception occurred
	 */
	public void removeByLanguage(String language) throws SystemException {
		for (VsmBranch vsmBranch : findByLanguage(language)) {
			remove(vsmBranch);
		}
	}

	/**
	 * Removes all the vsm branchs from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	public void removeAll() throws SystemException {
		for (VsmBranch vsmBranch : findAll()) {
			remove(vsmBranch);
		}
	}

	/**
	 * Counts all the vsm branchs where parentId = &#63;.
	 *
	 * @param parentId the parent id to search with
	 * @return the number of matching vsm branchs
	 * @throws SystemException if a system exception occurred
	 */
	public int countByParent(long parentId) throws SystemException {
		Object[] finderArgs = new Object[] { parentId };

		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_BY_PARENT,
				finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_VSMBRANCH_WHERE);

			query.append(_FINDER_COLUMN_PARENT_PARENTID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(parentId);

				count = (Long)q.uniqueResult();
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (count == null) {
					count = Long.valueOf(0);
				}

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_PARENT,
					finderArgs, count);

				closeSession(session);
			}
		}

		return count.intValue();
	}

	/**
	 * Counts all the vsm branchs where groupId = &#63; and language = &#63;.
	 *
	 * @param groupId the group id to search with
	 * @param language the language to search with
	 * @return the number of matching vsm branchs
	 * @throws SystemException if a system exception occurred
	 */
	public int countByG_L(long groupId, String language)
		throws SystemException {
		Object[] finderArgs = new Object[] { groupId, language };

		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_BY_G_L,
				finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_VSMBRANCH_WHERE);

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
	 * Counts all the vsm branchs where groupId = &#63; and language = &#63; and parentId = &#63;.
	 *
	 * @param groupId the group id to search with
	 * @param language the language to search with
	 * @param parentId the parent id to search with
	 * @return the number of matching vsm branchs
	 * @throws SystemException if a system exception occurred
	 */
	public int countByG_L_P(long groupId, String language, long parentId)
		throws SystemException {
		Object[] finderArgs = new Object[] { groupId, language, parentId };

		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_BY_G_L_P,
				finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(4);

			query.append(_SQL_COUNT_VSMBRANCH_WHERE);

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

			query.append(_FINDER_COLUMN_G_L_P_PARENTID_2);

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

				qPos.add(parentId);

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
	 * Counts all the vsm branchs where hasIcon = &#63;.
	 *
	 * @param hasIcon the has icon to search with
	 * @return the number of matching vsm branchs
	 * @throws SystemException if a system exception occurred
	 */
	public int countByIcon(boolean hasIcon) throws SystemException {
		Object[] finderArgs = new Object[] { hasIcon };

		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_BY_ICON,
				finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_VSMBRANCH_WHERE);

			query.append(_FINDER_COLUMN_ICON_HASICON_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(hasIcon);

				count = (Long)q.uniqueResult();
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (count == null) {
					count = Long.valueOf(0);
				}

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_ICON,
					finderArgs, count);

				closeSession(session);
			}
		}

		return count.intValue();
	}

	/**
	 * Counts all the vsm branchs where language = &#63;.
	 *
	 * @param language the language to search with
	 * @return the number of matching vsm branchs
	 * @throws SystemException if a system exception occurred
	 */
	public int countByLanguage(String language) throws SystemException {
		Object[] finderArgs = new Object[] { language };

		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_BY_LANGUAGE,
				finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_VSMBRANCH_WHERE);

			if (language == null) {
				query.append(_FINDER_COLUMN_LANGUAGE_LANGUAGE_1);
			}
			else {
				if (language.equals(StringPool.BLANK)) {
					query.append(_FINDER_COLUMN_LANGUAGE_LANGUAGE_3);
				}
				else {
					query.append(_FINDER_COLUMN_LANGUAGE_LANGUAGE_2);
				}
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

				count = (Long)q.uniqueResult();
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (count == null) {
					count = Long.valueOf(0);
				}

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_LANGUAGE,
					finderArgs, count);

				closeSession(session);
			}
		}

		return count.intValue();
	}

	/**
	 * Counts all the vsm branchs.
	 *
	 * @return the number of vsm branchs
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

				Query q = session.createQuery(_SQL_COUNT_VSMBRANCH);

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
	 * Initializes the vsm branch persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.com.vportal.portlet.vsitemap.model.VsmBranch")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<VsmBranch>> listenersList = new ArrayList<ModelListener<VsmBranch>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<VsmBranch>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(VsmBranchImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST);
	}

	@BeanReference(type = VsmBranchPersistence.class)
	protected VsmBranchPersistence vsmBranchPersistence;
	@BeanReference(type = ResourcePersistence.class)
	protected ResourcePersistence resourcePersistence;
	@BeanReference(type = UserPersistence.class)
	protected UserPersistence userPersistence;
	private static final String _SQL_SELECT_VSMBRANCH = "SELECT vsmBranch FROM VsmBranch vsmBranch";
	private static final String _SQL_SELECT_VSMBRANCH_WHERE = "SELECT vsmBranch FROM VsmBranch vsmBranch WHERE ";
	private static final String _SQL_COUNT_VSMBRANCH = "SELECT COUNT(vsmBranch) FROM VsmBranch vsmBranch";
	private static final String _SQL_COUNT_VSMBRANCH_WHERE = "SELECT COUNT(vsmBranch) FROM VsmBranch vsmBranch WHERE ";
	private static final String _FINDER_COLUMN_PARENT_PARENTID_2 = "vsmBranch.parentId = ?";
	private static final String _FINDER_COLUMN_G_L_GROUPID_2 = "vsmBranch.groupId = ? AND ";
	private static final String _FINDER_COLUMN_G_L_LANGUAGE_1 = "vsmBranch.language IS NULL";
	private static final String _FINDER_COLUMN_G_L_LANGUAGE_2 = "vsmBranch.language = ?";
	private static final String _FINDER_COLUMN_G_L_LANGUAGE_3 = "(vsmBranch.language IS NULL OR vsmBranch.language = ?)";
	private static final String _FINDER_COLUMN_G_L_P_GROUPID_2 = "vsmBranch.groupId = ? AND ";
	private static final String _FINDER_COLUMN_G_L_P_LANGUAGE_1 = "vsmBranch.language IS NULL AND ";
	private static final String _FINDER_COLUMN_G_L_P_LANGUAGE_2 = "vsmBranch.language = ? AND ";
	private static final String _FINDER_COLUMN_G_L_P_LANGUAGE_3 = "(vsmBranch.language IS NULL OR vsmBranch.language = ?) AND ";
	private static final String _FINDER_COLUMN_G_L_P_PARENTID_2 = "vsmBranch.parentId = ?";
	private static final String _FINDER_COLUMN_ICON_HASICON_2 = "vsmBranch.hasIcon = ?";
	private static final String _FINDER_COLUMN_LANGUAGE_LANGUAGE_1 = "vsmBranch.language IS NULL";
	private static final String _FINDER_COLUMN_LANGUAGE_LANGUAGE_2 = "vsmBranch.language = ?";
	private static final String _FINDER_COLUMN_LANGUAGE_LANGUAGE_3 = "(vsmBranch.language IS NULL OR vsmBranch.language = ?)";
	private static final String _ORDER_BY_ENTITY_ALIAS = "vsmBranch.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No VsmBranch exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No VsmBranch exists with the key {";
	private static Log _log = LogFactoryUtil.getLog(VsmBranchPersistenceImpl.class);
}