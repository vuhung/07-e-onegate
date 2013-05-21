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

package com.vportal.portlet.vcomment.service.persistence;

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

import com.vportal.portlet.vcomment.NoSuchVCommentException;
import com.vportal.portlet.vcomment.model.VComment;
import com.vportal.portlet.vcomment.model.impl.VCommentImpl;
import com.vportal.portlet.vcomment.model.impl.VCommentModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The persistence implementation for the v comment service.
 *
 * <p>
 * Never modify or reference this class directly. Always use {@link VCommentUtil} to access the v comment persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
 * </p>
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author ACB
 * @see VCommentPersistence
 * @see VCommentUtil
 * @generated
 */
public class VCommentPersistenceImpl extends BasePersistenceImpl<VComment>
	implements VCommentPersistence {
	public static final String FINDER_CLASS_NAME_ENTITY = VCommentImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST = FINDER_CLASS_NAME_ENTITY +
		".List";
	public static final FinderPath FINDER_PATH_FIND_BY_STATUS = new FinderPath(VCommentModelImpl.ENTITY_CACHE_ENABLED,
			VCommentModelImpl.FINDER_CACHE_ENABLED, FINDER_CLASS_NAME_LIST,
			"findByStatus",
			new String[] {
				Integer.class.getName(),
				
			"java.lang.Integer", "java.lang.Integer",
				"com.liferay.portal.kernel.util.OrderByComparator"
			});
	public static final FinderPath FINDER_PATH_COUNT_BY_STATUS = new FinderPath(VCommentModelImpl.ENTITY_CACHE_ENABLED,
			VCommentModelImpl.FINDER_CACHE_ENABLED, FINDER_CLASS_NAME_LIST,
			"countByStatus", new String[] { Integer.class.getName() });
	public static final FinderPath FINDER_PATH_FIND_BY_G_S = new FinderPath(VCommentModelImpl.ENTITY_CACHE_ENABLED,
			VCommentModelImpl.FINDER_CACHE_ENABLED, FINDER_CLASS_NAME_LIST,
			"findByG_S",
			new String[] {
				Long.class.getName(), Integer.class.getName(),
				
			"java.lang.Integer", "java.lang.Integer",
				"com.liferay.portal.kernel.util.OrderByComparator"
			});
	public static final FinderPath FINDER_PATH_COUNT_BY_G_S = new FinderPath(VCommentModelImpl.ENTITY_CACHE_ENABLED,
			VCommentModelImpl.FINDER_CACHE_ENABLED, FINDER_CLASS_NAME_LIST,
			"countByG_S",
			new String[] { Long.class.getName(), Integer.class.getName() });
	public static final FinderPath FINDER_PATH_FIND_ALL = new FinderPath(VCommentModelImpl.ENTITY_CACHE_ENABLED,
			VCommentModelImpl.FINDER_CACHE_ENABLED, FINDER_CLASS_NAME_LIST,
			"findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(VCommentModelImpl.ENTITY_CACHE_ENABLED,
			VCommentModelImpl.FINDER_CACHE_ENABLED, FINDER_CLASS_NAME_LIST,
			"countAll", new String[0]);

	/**
	 * Caches the v comment in the entity cache if it is enabled.
	 *
	 * @param vComment the v comment to cache
	 */
	public void cacheResult(VComment vComment) {
		EntityCacheUtil.putResult(VCommentModelImpl.ENTITY_CACHE_ENABLED,
			VCommentImpl.class, vComment.getPrimaryKey(), vComment);
	}

	/**
	 * Caches the v comments in the entity cache if it is enabled.
	 *
	 * @param vComments the v comments to cache
	 */
	public void cacheResult(List<VComment> vComments) {
		for (VComment vComment : vComments) {
			if (EntityCacheUtil.getResult(
						VCommentModelImpl.ENTITY_CACHE_ENABLED,
						VCommentImpl.class, vComment.getPrimaryKey(), this) == null) {
				cacheResult(vComment);
			}
		}
	}

	/**
	 * Clears the cache for all v comments.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	public void clearCache() {
		CacheRegistryUtil.clear(VCommentImpl.class.getName());
		EntityCacheUtil.clearCache(VCommentImpl.class.getName());
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST);
	}

	/**
	 * Clears the cache for the v comment.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	public void clearCache(VComment vComment) {
		EntityCacheUtil.removeResult(VCommentModelImpl.ENTITY_CACHE_ENABLED,
			VCommentImpl.class, vComment.getPrimaryKey());
	}

	/**
	 * Creates a new v comment with the primary key. Does not add the v comment to the database.
	 *
	 * @param id the primary key for the new v comment
	 * @return the new v comment
	 */
	public VComment create(long id) {
		VComment vComment = new VCommentImpl();

		vComment.setNew(true);
		vComment.setPrimaryKey(id);

		return vComment;
	}

	/**
	 * Removes the v comment with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the v comment to remove
	 * @return the v comment that was removed
	 * @throws com.liferay.portal.NoSuchModelException if a v comment with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public VComment remove(Serializable primaryKey)
		throws NoSuchModelException, SystemException {
		return remove(((Long)primaryKey).longValue());
	}

	/**
	 * Removes the v comment with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the v comment to remove
	 * @return the v comment that was removed
	 * @throws com.vportal.portlet.vcomment.NoSuchVCommentException if a v comment with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public VComment remove(long id)
		throws NoSuchVCommentException, SystemException {
		Session session = null;

		try {
			session = openSession();

			VComment vComment = (VComment)session.get(VCommentImpl.class,
					new Long(id));

			if (vComment == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + id);
				}

				throw new NoSuchVCommentException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					id);
			}

			return remove(vComment);
		}
		catch (NoSuchVCommentException nsee) {
			throw nsee;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected VComment removeImpl(VComment vComment) throws SystemException {
		vComment = toUnwrappedModel(vComment);

		Session session = null;

		try {
			session = openSession();

			BatchSessionUtil.delete(session, vComment);
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST);

		EntityCacheUtil.removeResult(VCommentModelImpl.ENTITY_CACHE_ENABLED,
			VCommentImpl.class, vComment.getPrimaryKey());

		return vComment;
	}

	public VComment updateImpl(
		com.vportal.portlet.vcomment.model.VComment vComment, boolean merge)
		throws SystemException {
		vComment = toUnwrappedModel(vComment);

		Session session = null;

		try {
			session = openSession();

			BatchSessionUtil.update(session, vComment, merge);

			vComment.setNew(false);
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST);

		EntityCacheUtil.putResult(VCommentModelImpl.ENTITY_CACHE_ENABLED,
			VCommentImpl.class, vComment.getPrimaryKey(), vComment);

		return vComment;
	}

	protected VComment toUnwrappedModel(VComment vComment) {
		if (vComment instanceof VCommentImpl) {
			return vComment;
		}

		VCommentImpl vCommentImpl = new VCommentImpl();

		vCommentImpl.setNew(vComment.isNew());
		vCommentImpl.setPrimaryKey(vComment.getPrimaryKey());

		vCommentImpl.setId(vComment.getId());
		vCommentImpl.setGroupId(vComment.getGroupId());
		vCommentImpl.setCompanyId(vComment.getCompanyId());
		vCommentImpl.setCreatedDate(vComment.getCreatedDate());
		vCommentImpl.setModifiedDate(vComment.getModifiedDate());
		vCommentImpl.setGuestName(vComment.getGuestName());
		vCommentImpl.setEmail(vComment.getEmail());
		vCommentImpl.setTitle(vComment.getTitle());
		vCommentImpl.setAddress(vComment.getAddress());
		vCommentImpl.setPhone(vComment.getPhone());
		vCommentImpl.setFax(vComment.getFax());
		vCommentImpl.setContent(vComment.getContent());
		vCommentImpl.setHasAttach(vComment.isHasAttach());
		vCommentImpl.setStatus(vComment.getStatus());

		return vCommentImpl;
	}

	/**
	 * Finds the v comment with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the v comment to find
	 * @return the v comment
	 * @throws com.liferay.portal.NoSuchModelException if a v comment with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public VComment findByPrimaryKey(Serializable primaryKey)
		throws NoSuchModelException, SystemException {
		return findByPrimaryKey(((Long)primaryKey).longValue());
	}

	/**
	 * Finds the v comment with the primary key or throws a {@link com.vportal.portlet.vcomment.NoSuchVCommentException} if it could not be found.
	 *
	 * @param id the primary key of the v comment to find
	 * @return the v comment
	 * @throws com.vportal.portlet.vcomment.NoSuchVCommentException if a v comment with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public VComment findByPrimaryKey(long id)
		throws NoSuchVCommentException, SystemException {
		VComment vComment = fetchByPrimaryKey(id);

		if (vComment == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + id);
			}

			throw new NoSuchVCommentException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				id);
		}

		return vComment;
	}

	/**
	 * Finds the v comment with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the v comment to find
	 * @return the v comment, or <code>null</code> if a v comment with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public VComment fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		return fetchByPrimaryKey(((Long)primaryKey).longValue());
	}

	/**
	 * Finds the v comment with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the v comment to find
	 * @return the v comment, or <code>null</code> if a v comment with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public VComment fetchByPrimaryKey(long id) throws SystemException {
		VComment vComment = (VComment)EntityCacheUtil.getResult(VCommentModelImpl.ENTITY_CACHE_ENABLED,
				VCommentImpl.class, id, this);

		if (vComment == null) {
			Session session = null;

			try {
				session = openSession();

				vComment = (VComment)session.get(VCommentImpl.class,
						new Long(id));
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (vComment != null) {
					cacheResult(vComment);
				}

				closeSession(session);
			}
		}

		return vComment;
	}

	/**
	 * Finds all the v comments where status = &#63;.
	 *
	 * @param status the status to search with
	 * @return the matching v comments
	 * @throws SystemException if a system exception occurred
	 */
	public List<VComment> findByStatus(int status) throws SystemException {
		return findByStatus(status, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Finds a range of all the v comments where status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param status the status to search with
	 * @param start the lower bound of the range of v comments to return
	 * @param end the upper bound of the range of v comments to return (not inclusive)
	 * @return the range of matching v comments
	 * @throws SystemException if a system exception occurred
	 */
	public List<VComment> findByStatus(int status, int start, int end)
		throws SystemException {
		return findByStatus(status, start, end, null);
	}

	/**
	 * Finds an ordered range of all the v comments where status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param status the status to search with
	 * @param start the lower bound of the range of v comments to return
	 * @param end the upper bound of the range of v comments to return (not inclusive)
	 * @param orderByComparator the comparator to order the results by
	 * @return the ordered range of matching v comments
	 * @throws SystemException if a system exception occurred
	 */
	public List<VComment> findByStatus(int status, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		Object[] finderArgs = new Object[] {
				status,
				
				String.valueOf(start), String.valueOf(end),
				String.valueOf(orderByComparator)
			};

		List<VComment> list = (List<VComment>)FinderCacheUtil.getResult(FINDER_PATH_FIND_BY_STATUS,
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

			query.append(_SQL_SELECT_VCOMMENT_WHERE);

			query.append(_FINDER_COLUMN_STATUS_STATUS_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}

			else {
				query.append(VCommentModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(status);

				list = (List<VComment>)QueryUtil.list(q, getDialect(), start,
						end);
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (list == null) {
					FinderCacheUtil.removeResult(FINDER_PATH_FIND_BY_STATUS,
						finderArgs);
				}
				else {
					cacheResult(list);

					FinderCacheUtil.putResult(FINDER_PATH_FIND_BY_STATUS,
						finderArgs, list);
				}

				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Finds the first v comment in the ordered set where status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param status the status to search with
	 * @param orderByComparator the comparator to order the set by
	 * @return the first matching v comment
	 * @throws com.vportal.portlet.vcomment.NoSuchVCommentException if a matching v comment could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public VComment findByStatus_First(int status,
		OrderByComparator orderByComparator)
		throws NoSuchVCommentException, SystemException {
		List<VComment> list = findByStatus(status, 0, 1, orderByComparator);

		if (list.isEmpty()) {
			StringBundler msg = new StringBundler(4);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("status=");
			msg.append(status);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			throw new NoSuchVCommentException(msg.toString());
		}
		else {
			return list.get(0);
		}
	}

	/**
	 * Finds the last v comment in the ordered set where status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param status the status to search with
	 * @param orderByComparator the comparator to order the set by
	 * @return the last matching v comment
	 * @throws com.vportal.portlet.vcomment.NoSuchVCommentException if a matching v comment could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public VComment findByStatus_Last(int status,
		OrderByComparator orderByComparator)
		throws NoSuchVCommentException, SystemException {
		int count = countByStatus(status);

		List<VComment> list = findByStatus(status, count - 1, count,
				orderByComparator);

		if (list.isEmpty()) {
			StringBundler msg = new StringBundler(4);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("status=");
			msg.append(status);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			throw new NoSuchVCommentException(msg.toString());
		}
		else {
			return list.get(0);
		}
	}

	/**
	 * Finds the v comments before and after the current v comment in the ordered set where status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param id the primary key of the current v comment
	 * @param status the status to search with
	 * @param orderByComparator the comparator to order the set by
	 * @return the previous, current, and next v comment
	 * @throws com.vportal.portlet.vcomment.NoSuchVCommentException if a v comment with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public VComment[] findByStatus_PrevAndNext(long id, int status,
		OrderByComparator orderByComparator)
		throws NoSuchVCommentException, SystemException {
		VComment vComment = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			VComment[] array = new VCommentImpl[3];

			array[0] = getByStatus_PrevAndNext(session, vComment, status,
					orderByComparator, true);

			array[1] = vComment;

			array[2] = getByStatus_PrevAndNext(session, vComment, status,
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

	protected VComment getByStatus_PrevAndNext(Session session,
		VComment vComment, int status, OrderByComparator orderByComparator,
		boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_VCOMMENT_WHERE);

		query.append(_FINDER_COLUMN_STATUS_STATUS_2);

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
			query.append(VCommentModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(status);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByValues(vComment);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<VComment> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Finds all the v comments where groupId = &#63; and status = &#63;.
	 *
	 * @param groupId the group id to search with
	 * @param status the status to search with
	 * @return the matching v comments
	 * @throws SystemException if a system exception occurred
	 */
	public List<VComment> findByG_S(long groupId, int status)
		throws SystemException {
		return findByG_S(groupId, status, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
			null);
	}

	/**
	 * Finds a range of all the v comments where groupId = &#63; and status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param groupId the group id to search with
	 * @param status the status to search with
	 * @param start the lower bound of the range of v comments to return
	 * @param end the upper bound of the range of v comments to return (not inclusive)
	 * @return the range of matching v comments
	 * @throws SystemException if a system exception occurred
	 */
	public List<VComment> findByG_S(long groupId, int status, int start, int end)
		throws SystemException {
		return findByG_S(groupId, status, start, end, null);
	}

	/**
	 * Finds an ordered range of all the v comments where groupId = &#63; and status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param groupId the group id to search with
	 * @param status the status to search with
	 * @param start the lower bound of the range of v comments to return
	 * @param end the upper bound of the range of v comments to return (not inclusive)
	 * @param orderByComparator the comparator to order the results by
	 * @return the ordered range of matching v comments
	 * @throws SystemException if a system exception occurred
	 */
	public List<VComment> findByG_S(long groupId, int status, int start,
		int end, OrderByComparator orderByComparator) throws SystemException {
		Object[] finderArgs = new Object[] {
				groupId, status,
				
				String.valueOf(start), String.valueOf(end),
				String.valueOf(orderByComparator)
			};

		List<VComment> list = (List<VComment>)FinderCacheUtil.getResult(FINDER_PATH_FIND_BY_G_S,
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

			query.append(_SQL_SELECT_VCOMMENT_WHERE);

			query.append(_FINDER_COLUMN_G_S_GROUPID_2);

			query.append(_FINDER_COLUMN_G_S_STATUS_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}

			else {
				query.append(VCommentModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(groupId);

				qPos.add(status);

				list = (List<VComment>)QueryUtil.list(q, getDialect(), start,
						end);
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (list == null) {
					FinderCacheUtil.removeResult(FINDER_PATH_FIND_BY_G_S,
						finderArgs);
				}
				else {
					cacheResult(list);

					FinderCacheUtil.putResult(FINDER_PATH_FIND_BY_G_S,
						finderArgs, list);
				}

				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Finds the first v comment in the ordered set where groupId = &#63; and status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param groupId the group id to search with
	 * @param status the status to search with
	 * @param orderByComparator the comparator to order the set by
	 * @return the first matching v comment
	 * @throws com.vportal.portlet.vcomment.NoSuchVCommentException if a matching v comment could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public VComment findByG_S_First(long groupId, int status,
		OrderByComparator orderByComparator)
		throws NoSuchVCommentException, SystemException {
		List<VComment> list = findByG_S(groupId, status, 0, 1, orderByComparator);

		if (list.isEmpty()) {
			StringBundler msg = new StringBundler(6);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("groupId=");
			msg.append(groupId);

			msg.append(", status=");
			msg.append(status);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			throw new NoSuchVCommentException(msg.toString());
		}
		else {
			return list.get(0);
		}
	}

	/**
	 * Finds the last v comment in the ordered set where groupId = &#63; and status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param groupId the group id to search with
	 * @param status the status to search with
	 * @param orderByComparator the comparator to order the set by
	 * @return the last matching v comment
	 * @throws com.vportal.portlet.vcomment.NoSuchVCommentException if a matching v comment could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public VComment findByG_S_Last(long groupId, int status,
		OrderByComparator orderByComparator)
		throws NoSuchVCommentException, SystemException {
		int count = countByG_S(groupId, status);

		List<VComment> list = findByG_S(groupId, status, count - 1, count,
				orderByComparator);

		if (list.isEmpty()) {
			StringBundler msg = new StringBundler(6);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("groupId=");
			msg.append(groupId);

			msg.append(", status=");
			msg.append(status);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			throw new NoSuchVCommentException(msg.toString());
		}
		else {
			return list.get(0);
		}
	}

	/**
	 * Finds the v comments before and after the current v comment in the ordered set where groupId = &#63; and status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param id the primary key of the current v comment
	 * @param groupId the group id to search with
	 * @param status the status to search with
	 * @param orderByComparator the comparator to order the set by
	 * @return the previous, current, and next v comment
	 * @throws com.vportal.portlet.vcomment.NoSuchVCommentException if a v comment with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public VComment[] findByG_S_PrevAndNext(long id, long groupId, int status,
		OrderByComparator orderByComparator)
		throws NoSuchVCommentException, SystemException {
		VComment vComment = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			VComment[] array = new VCommentImpl[3];

			array[0] = getByG_S_PrevAndNext(session, vComment, groupId, status,
					orderByComparator, true);

			array[1] = vComment;

			array[2] = getByG_S_PrevAndNext(session, vComment, groupId, status,
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

	protected VComment getByG_S_PrevAndNext(Session session, VComment vComment,
		long groupId, int status, OrderByComparator orderByComparator,
		boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_VCOMMENT_WHERE);

		query.append(_FINDER_COLUMN_G_S_GROUPID_2);

		query.append(_FINDER_COLUMN_G_S_STATUS_2);

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
			query.append(VCommentModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(groupId);

		qPos.add(status);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByValues(vComment);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<VComment> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Finds all the v comments.
	 *
	 * @return the v comments
	 * @throws SystemException if a system exception occurred
	 */
	public List<VComment> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Finds a range of all the v comments.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param start the lower bound of the range of v comments to return
	 * @param end the upper bound of the range of v comments to return (not inclusive)
	 * @return the range of v comments
	 * @throws SystemException if a system exception occurred
	 */
	public List<VComment> findAll(int start, int end) throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Finds an ordered range of all the v comments.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param start the lower bound of the range of v comments to return
	 * @param end the upper bound of the range of v comments to return (not inclusive)
	 * @param orderByComparator the comparator to order the results by
	 * @return the ordered range of v comments
	 * @throws SystemException if a system exception occurred
	 */
	public List<VComment> findAll(int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		Object[] finderArgs = new Object[] {
				String.valueOf(start), String.valueOf(end),
				String.valueOf(orderByComparator)
			};

		List<VComment> list = (List<VComment>)FinderCacheUtil.getResult(FINDER_PATH_FIND_ALL,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_VCOMMENT);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_VCOMMENT.concat(VCommentModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (orderByComparator == null) {
					list = (List<VComment>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);
				}
				else {
					list = (List<VComment>)QueryUtil.list(q, getDialect(),
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
	 * Removes all the v comments where status = &#63; from the database.
	 *
	 * @param status the status to search with
	 * @throws SystemException if a system exception occurred
	 */
	public void removeByStatus(int status) throws SystemException {
		for (VComment vComment : findByStatus(status)) {
			remove(vComment);
		}
	}

	/**
	 * Removes all the v comments where groupId = &#63; and status = &#63; from the database.
	 *
	 * @param groupId the group id to search with
	 * @param status the status to search with
	 * @throws SystemException if a system exception occurred
	 */
	public void removeByG_S(long groupId, int status) throws SystemException {
		for (VComment vComment : findByG_S(groupId, status)) {
			remove(vComment);
		}
	}

	/**
	 * Removes all the v comments from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	public void removeAll() throws SystemException {
		for (VComment vComment : findAll()) {
			remove(vComment);
		}
	}

	/**
	 * Counts all the v comments where status = &#63;.
	 *
	 * @param status the status to search with
	 * @return the number of matching v comments
	 * @throws SystemException if a system exception occurred
	 */
	public int countByStatus(int status) throws SystemException {
		Object[] finderArgs = new Object[] { status };

		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_BY_STATUS,
				finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_VCOMMENT_WHERE);

			query.append(_FINDER_COLUMN_STATUS_STATUS_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(status);

				count = (Long)q.uniqueResult();
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (count == null) {
					count = Long.valueOf(0);
				}

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_STATUS,
					finderArgs, count);

				closeSession(session);
			}
		}

		return count.intValue();
	}

	/**
	 * Counts all the v comments where groupId = &#63; and status = &#63;.
	 *
	 * @param groupId the group id to search with
	 * @param status the status to search with
	 * @return the number of matching v comments
	 * @throws SystemException if a system exception occurred
	 */
	public int countByG_S(long groupId, int status) throws SystemException {
		Object[] finderArgs = new Object[] { groupId, status };

		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_BY_G_S,
				finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_VCOMMENT_WHERE);

			query.append(_FINDER_COLUMN_G_S_GROUPID_2);

			query.append(_FINDER_COLUMN_G_S_STATUS_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(groupId);

				qPos.add(status);

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
	 * Counts all the v comments.
	 *
	 * @return the number of v comments
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

				Query q = session.createQuery(_SQL_COUNT_VCOMMENT);

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
	 * Initializes the v comment persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.com.vportal.portlet.vcomment.model.VComment")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<VComment>> listenersList = new ArrayList<ModelListener<VComment>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<VComment>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(VCommentImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST);
	}

	@BeanReference(type = VCommentPersistence.class)
	protected VCommentPersistence vCommentPersistence;
	@BeanReference(type = ResourcePersistence.class)
	protected ResourcePersistence resourcePersistence;
	@BeanReference(type = UserPersistence.class)
	protected UserPersistence userPersistence;
	private static final String _SQL_SELECT_VCOMMENT = "SELECT vComment FROM VComment vComment";
	private static final String _SQL_SELECT_VCOMMENT_WHERE = "SELECT vComment FROM VComment vComment WHERE ";
	private static final String _SQL_COUNT_VCOMMENT = "SELECT COUNT(vComment) FROM VComment vComment";
	private static final String _SQL_COUNT_VCOMMENT_WHERE = "SELECT COUNT(vComment) FROM VComment vComment WHERE ";
	private static final String _FINDER_COLUMN_STATUS_STATUS_2 = "vComment.status = ?";
	private static final String _FINDER_COLUMN_G_S_GROUPID_2 = "vComment.groupId = ? AND ";
	private static final String _FINDER_COLUMN_G_S_STATUS_2 = "vComment.status = ?";
	private static final String _ORDER_BY_ENTITY_ALIAS = "vComment.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No VComment exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No VComment exists with the key {";
	private static Log _log = LogFactoryUtil.getLog(VCommentPersistenceImpl.class);
}