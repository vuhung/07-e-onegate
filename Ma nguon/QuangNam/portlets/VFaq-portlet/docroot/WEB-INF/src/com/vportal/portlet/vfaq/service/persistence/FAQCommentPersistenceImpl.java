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

package com.vportal.portlet.vfaq.service.persistence;

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
import com.liferay.portal.kernel.uuid.PortalUUIDUtil;
import com.liferay.portal.model.ModelListener;
import com.liferay.portal.service.persistence.BatchSessionUtil;
import com.liferay.portal.service.persistence.ResourcePersistence;
import com.liferay.portal.service.persistence.UserPersistence;
import com.liferay.portal.service.persistence.impl.BasePersistenceImpl;

import com.vportal.portlet.vfaq.NoSuchFAQCommentException;
import com.vportal.portlet.vfaq.model.FAQComment;
import com.vportal.portlet.vfaq.model.impl.FAQCommentImpl;
import com.vportal.portlet.vfaq.model.impl.FAQCommentModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The persistence implementation for the f a q comment service.
 *
 * <p>
 * Never modify or reference this class directly. Always use {@link FAQCommentUtil} to access the f a q comment persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
 * </p>
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author HOAN
 * @see FAQCommentPersistence
 * @see FAQCommentUtil
 * @generated
 */
public class FAQCommentPersistenceImpl extends BasePersistenceImpl<FAQComment>
	implements FAQCommentPersistence {
	public static final String FINDER_CLASS_NAME_ENTITY = FAQCommentImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST = FINDER_CLASS_NAME_ENTITY +
		".List";
	public static final FinderPath FINDER_PATH_FIND_BY_UUID = new FinderPath(FAQCommentModelImpl.ENTITY_CACHE_ENABLED,
			FAQCommentModelImpl.FINDER_CACHE_ENABLED, FINDER_CLASS_NAME_LIST,
			"findByUuid",
			new String[] {
				String.class.getName(),
				
			"java.lang.Integer", "java.lang.Integer",
				"com.liferay.portal.kernel.util.OrderByComparator"
			});
	public static final FinderPath FINDER_PATH_COUNT_BY_UUID = new FinderPath(FAQCommentModelImpl.ENTITY_CACHE_ENABLED,
			FAQCommentModelImpl.FINDER_CACHE_ENABLED, FINDER_CLASS_NAME_LIST,
			"countByUuid", new String[] { String.class.getName() });
	public static final FinderPath FINDER_PATH_FIND_BY_APPROVED = new FinderPath(FAQCommentModelImpl.ENTITY_CACHE_ENABLED,
			FAQCommentModelImpl.FINDER_CACHE_ENABLED, FINDER_CLASS_NAME_LIST,
			"findByApproved",
			new String[] {
				Boolean.class.getName(),
				
			"java.lang.Integer", "java.lang.Integer",
				"com.liferay.portal.kernel.util.OrderByComparator"
			});
	public static final FinderPath FINDER_PATH_COUNT_BY_APPROVED = new FinderPath(FAQCommentModelImpl.ENTITY_CACHE_ENABLED,
			FAQCommentModelImpl.FINDER_CACHE_ENABLED, FINDER_CLASS_NAME_LIST,
			"countByApproved", new String[] { Boolean.class.getName() });
	public static final FinderPath FINDER_PATH_FIND_BY_ANSWERID = new FinderPath(FAQCommentModelImpl.ENTITY_CACHE_ENABLED,
			FAQCommentModelImpl.FINDER_CACHE_ENABLED, FINDER_CLASS_NAME_LIST,
			"findByAnswerid",
			new String[] {
				Long.class.getName(),
				
			"java.lang.Integer", "java.lang.Integer",
				"com.liferay.portal.kernel.util.OrderByComparator"
			});
	public static final FinderPath FINDER_PATH_COUNT_BY_ANSWERID = new FinderPath(FAQCommentModelImpl.ENTITY_CACHE_ENABLED,
			FAQCommentModelImpl.FINDER_CACHE_ENABLED, FINDER_CLASS_NAME_LIST,
			"countByAnswerid", new String[] { Long.class.getName() });
	public static final FinderPath FINDER_PATH_FIND_ALL = new FinderPath(FAQCommentModelImpl.ENTITY_CACHE_ENABLED,
			FAQCommentModelImpl.FINDER_CACHE_ENABLED, FINDER_CLASS_NAME_LIST,
			"findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(FAQCommentModelImpl.ENTITY_CACHE_ENABLED,
			FAQCommentModelImpl.FINDER_CACHE_ENABLED, FINDER_CLASS_NAME_LIST,
			"countAll", new String[0]);

	/**
	 * Caches the f a q comment in the entity cache if it is enabled.
	 *
	 * @param faqComment the f a q comment to cache
	 */
	public void cacheResult(FAQComment faqComment) {
		EntityCacheUtil.putResult(FAQCommentModelImpl.ENTITY_CACHE_ENABLED,
			FAQCommentImpl.class, faqComment.getPrimaryKey(), faqComment);
	}

	/**
	 * Caches the f a q comments in the entity cache if it is enabled.
	 *
	 * @param faqComments the f a q comments to cache
	 */
	public void cacheResult(List<FAQComment> faqComments) {
		for (FAQComment faqComment : faqComments) {
			if (EntityCacheUtil.getResult(
						FAQCommentModelImpl.ENTITY_CACHE_ENABLED,
						FAQCommentImpl.class, faqComment.getPrimaryKey(), this) == null) {
				cacheResult(faqComment);
			}
		}
	}

	/**
	 * Clears the cache for all f a q comments.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	public void clearCache() {
		CacheRegistryUtil.clear(FAQCommentImpl.class.getName());
		EntityCacheUtil.clearCache(FAQCommentImpl.class.getName());
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST);
	}

	/**
	 * Clears the cache for the f a q comment.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	public void clearCache(FAQComment faqComment) {
		EntityCacheUtil.removeResult(FAQCommentModelImpl.ENTITY_CACHE_ENABLED,
			FAQCommentImpl.class, faqComment.getPrimaryKey());
	}

	/**
	 * Creates a new f a q comment with the primary key. Does not add the f a q comment to the database.
	 *
	 * @param id the primary key for the new f a q comment
	 * @return the new f a q comment
	 */
	public FAQComment create(long id) {
		FAQComment faqComment = new FAQCommentImpl();

		faqComment.setNew(true);
		faqComment.setPrimaryKey(id);

		String uuid = PortalUUIDUtil.generate();

		faqComment.setUuid(uuid);

		return faqComment;
	}

	/**
	 * Removes the f a q comment with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the f a q comment to remove
	 * @return the f a q comment that was removed
	 * @throws com.liferay.portal.NoSuchModelException if a f a q comment with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public FAQComment remove(Serializable primaryKey)
		throws NoSuchModelException, SystemException {
		return remove(((Long)primaryKey).longValue());
	}

	/**
	 * Removes the f a q comment with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the f a q comment to remove
	 * @return the f a q comment that was removed
	 * @throws com.vportal.portlet.vfaq.NoSuchFAQCommentException if a f a q comment with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public FAQComment remove(long id)
		throws NoSuchFAQCommentException, SystemException {
		Session session = null;

		try {
			session = openSession();

			FAQComment faqComment = (FAQComment)session.get(FAQCommentImpl.class,
					new Long(id));

			if (faqComment == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + id);
				}

				throw new NoSuchFAQCommentException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					id);
			}

			return remove(faqComment);
		}
		catch (NoSuchFAQCommentException nsee) {
			throw nsee;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected FAQComment removeImpl(FAQComment faqComment)
		throws SystemException {
		faqComment = toUnwrappedModel(faqComment);

		Session session = null;

		try {
			session = openSession();

			BatchSessionUtil.delete(session, faqComment);
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST);

		EntityCacheUtil.removeResult(FAQCommentModelImpl.ENTITY_CACHE_ENABLED,
			FAQCommentImpl.class, faqComment.getPrimaryKey());

		return faqComment;
	}

	public FAQComment updateImpl(
		com.vportal.portlet.vfaq.model.FAQComment faqComment, boolean merge)
		throws SystemException {
		faqComment = toUnwrappedModel(faqComment);

		if (Validator.isNull(faqComment.getUuid())) {
			String uuid = PortalUUIDUtil.generate();

			faqComment.setUuid(uuid);
		}

		Session session = null;

		try {
			session = openSession();

			BatchSessionUtil.update(session, faqComment, merge);

			faqComment.setNew(false);
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST);

		EntityCacheUtil.putResult(FAQCommentModelImpl.ENTITY_CACHE_ENABLED,
			FAQCommentImpl.class, faqComment.getPrimaryKey(), faqComment);

		return faqComment;
	}

	protected FAQComment toUnwrappedModel(FAQComment faqComment) {
		if (faqComment instanceof FAQCommentImpl) {
			return faqComment;
		}

		FAQCommentImpl faqCommentImpl = new FAQCommentImpl();

		faqCommentImpl.setNew(faqComment.isNew());
		faqCommentImpl.setPrimaryKey(faqComment.getPrimaryKey());

		faqCommentImpl.setUuid(faqComment.getUuid());
		faqCommentImpl.setId(faqComment.getId());
		faqCommentImpl.setAnswerid(faqComment.getAnswerid());
		faqCommentImpl.setContent(faqComment.getContent());
		faqCommentImpl.setCommName(faqComment.getCommName());
		faqCommentImpl.setCommEmail(faqComment.getCommEmail());
		faqCommentImpl.setApproved(faqComment.isApproved());
		faqCommentImpl.setApproveByUser(faqComment.getApproveByUser());
		faqCommentImpl.setApprovedDate(faqComment.getApprovedDate());
		faqCommentImpl.setCommDate(faqComment.getCommDate());
		faqCommentImpl.setUserId(faqComment.getUserId());

		return faqCommentImpl;
	}

	/**
	 * Finds the f a q comment with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the f a q comment to find
	 * @return the f a q comment
	 * @throws com.liferay.portal.NoSuchModelException if a f a q comment with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public FAQComment findByPrimaryKey(Serializable primaryKey)
		throws NoSuchModelException, SystemException {
		return findByPrimaryKey(((Long)primaryKey).longValue());
	}

	/**
	 * Finds the f a q comment with the primary key or throws a {@link com.vportal.portlet.vfaq.NoSuchFAQCommentException} if it could not be found.
	 *
	 * @param id the primary key of the f a q comment to find
	 * @return the f a q comment
	 * @throws com.vportal.portlet.vfaq.NoSuchFAQCommentException if a f a q comment with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public FAQComment findByPrimaryKey(long id)
		throws NoSuchFAQCommentException, SystemException {
		FAQComment faqComment = fetchByPrimaryKey(id);

		if (faqComment == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + id);
			}

			throw new NoSuchFAQCommentException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				id);
		}

		return faqComment;
	}

	/**
	 * Finds the f a q comment with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the f a q comment to find
	 * @return the f a q comment, or <code>null</code> if a f a q comment with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public FAQComment fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		return fetchByPrimaryKey(((Long)primaryKey).longValue());
	}

	/**
	 * Finds the f a q comment with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the f a q comment to find
	 * @return the f a q comment, or <code>null</code> if a f a q comment with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public FAQComment fetchByPrimaryKey(long id) throws SystemException {
		FAQComment faqComment = (FAQComment)EntityCacheUtil.getResult(FAQCommentModelImpl.ENTITY_CACHE_ENABLED,
				FAQCommentImpl.class, id, this);

		if (faqComment == null) {
			Session session = null;

			try {
				session = openSession();

				faqComment = (FAQComment)session.get(FAQCommentImpl.class,
						new Long(id));
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (faqComment != null) {
					cacheResult(faqComment);
				}

				closeSession(session);
			}
		}

		return faqComment;
	}

	/**
	 * Finds all the f a q comments where uuid = &#63;.
	 *
	 * @param uuid the uuid to search with
	 * @return the matching f a q comments
	 * @throws SystemException if a system exception occurred
	 */
	public List<FAQComment> findByUuid(String uuid) throws SystemException {
		return findByUuid(uuid, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Finds a range of all the f a q comments where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param uuid the uuid to search with
	 * @param start the lower bound of the range of f a q comments to return
	 * @param end the upper bound of the range of f a q comments to return (not inclusive)
	 * @return the range of matching f a q comments
	 * @throws SystemException if a system exception occurred
	 */
	public List<FAQComment> findByUuid(String uuid, int start, int end)
		throws SystemException {
		return findByUuid(uuid, start, end, null);
	}

	/**
	 * Finds an ordered range of all the f a q comments where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param uuid the uuid to search with
	 * @param start the lower bound of the range of f a q comments to return
	 * @param end the upper bound of the range of f a q comments to return (not inclusive)
	 * @param orderByComparator the comparator to order the results by
	 * @return the ordered range of matching f a q comments
	 * @throws SystemException if a system exception occurred
	 */
	public List<FAQComment> findByUuid(String uuid, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		Object[] finderArgs = new Object[] {
				uuid,
				
				String.valueOf(start), String.valueOf(end),
				String.valueOf(orderByComparator)
			};

		List<FAQComment> list = (List<FAQComment>)FinderCacheUtil.getResult(FINDER_PATH_FIND_BY_UUID,
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

			query.append(_SQL_SELECT_FAQCOMMENT_WHERE);

			if (uuid == null) {
				query.append(_FINDER_COLUMN_UUID_UUID_1);
			}
			else {
				if (uuid.equals(StringPool.BLANK)) {
					query.append(_FINDER_COLUMN_UUID_UUID_3);
				}
				else {
					query.append(_FINDER_COLUMN_UUID_UUID_2);
				}
			}

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}

			else {
				query.append(FAQCommentModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (uuid != null) {
					qPos.add(uuid);
				}

				list = (List<FAQComment>)QueryUtil.list(q, getDialect(), start,
						end);
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (list == null) {
					FinderCacheUtil.removeResult(FINDER_PATH_FIND_BY_UUID,
						finderArgs);
				}
				else {
					cacheResult(list);

					FinderCacheUtil.putResult(FINDER_PATH_FIND_BY_UUID,
						finderArgs, list);
				}

				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Finds the first f a q comment in the ordered set where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param uuid the uuid to search with
	 * @param orderByComparator the comparator to order the set by
	 * @return the first matching f a q comment
	 * @throws com.vportal.portlet.vfaq.NoSuchFAQCommentException if a matching f a q comment could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public FAQComment findByUuid_First(String uuid,
		OrderByComparator orderByComparator)
		throws NoSuchFAQCommentException, SystemException {
		List<FAQComment> list = findByUuid(uuid, 0, 1, orderByComparator);

		if (list.isEmpty()) {
			StringBundler msg = new StringBundler(4);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("uuid=");
			msg.append(uuid);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			throw new NoSuchFAQCommentException(msg.toString());
		}
		else {
			return list.get(0);
		}
	}

	/**
	 * Finds the last f a q comment in the ordered set where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param uuid the uuid to search with
	 * @param orderByComparator the comparator to order the set by
	 * @return the last matching f a q comment
	 * @throws com.vportal.portlet.vfaq.NoSuchFAQCommentException if a matching f a q comment could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public FAQComment findByUuid_Last(String uuid,
		OrderByComparator orderByComparator)
		throws NoSuchFAQCommentException, SystemException {
		int count = countByUuid(uuid);

		List<FAQComment> list = findByUuid(uuid, count - 1, count,
				orderByComparator);

		if (list.isEmpty()) {
			StringBundler msg = new StringBundler(4);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("uuid=");
			msg.append(uuid);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			throw new NoSuchFAQCommentException(msg.toString());
		}
		else {
			return list.get(0);
		}
	}

	/**
	 * Finds the f a q comments before and after the current f a q comment in the ordered set where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param id the primary key of the current f a q comment
	 * @param uuid the uuid to search with
	 * @param orderByComparator the comparator to order the set by
	 * @return the previous, current, and next f a q comment
	 * @throws com.vportal.portlet.vfaq.NoSuchFAQCommentException if a f a q comment with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public FAQComment[] findByUuid_PrevAndNext(long id, String uuid,
		OrderByComparator orderByComparator)
		throws NoSuchFAQCommentException, SystemException {
		FAQComment faqComment = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			FAQComment[] array = new FAQCommentImpl[3];

			array[0] = getByUuid_PrevAndNext(session, faqComment, uuid,
					orderByComparator, true);

			array[1] = faqComment;

			array[2] = getByUuid_PrevAndNext(session, faqComment, uuid,
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

	protected FAQComment getByUuid_PrevAndNext(Session session,
		FAQComment faqComment, String uuid,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_FAQCOMMENT_WHERE);

		if (uuid == null) {
			query.append(_FINDER_COLUMN_UUID_UUID_1);
		}
		else {
			if (uuid.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_UUID_UUID_3);
			}
			else {
				query.append(_FINDER_COLUMN_UUID_UUID_2);
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
			query.append(FAQCommentModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		if (uuid != null) {
			qPos.add(uuid);
		}

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByValues(faqComment);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<FAQComment> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Finds all the f a q comments where approved = &#63;.
	 *
	 * @param approved the approved to search with
	 * @return the matching f a q comments
	 * @throws SystemException if a system exception occurred
	 */
	public List<FAQComment> findByApproved(boolean approved)
		throws SystemException {
		return findByApproved(approved, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
			null);
	}

	/**
	 * Finds a range of all the f a q comments where approved = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param approved the approved to search with
	 * @param start the lower bound of the range of f a q comments to return
	 * @param end the upper bound of the range of f a q comments to return (not inclusive)
	 * @return the range of matching f a q comments
	 * @throws SystemException if a system exception occurred
	 */
	public List<FAQComment> findByApproved(boolean approved, int start, int end)
		throws SystemException {
		return findByApproved(approved, start, end, null);
	}

	/**
	 * Finds an ordered range of all the f a q comments where approved = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param approved the approved to search with
	 * @param start the lower bound of the range of f a q comments to return
	 * @param end the upper bound of the range of f a q comments to return (not inclusive)
	 * @param orderByComparator the comparator to order the results by
	 * @return the ordered range of matching f a q comments
	 * @throws SystemException if a system exception occurred
	 */
	public List<FAQComment> findByApproved(boolean approved, int start,
		int end, OrderByComparator orderByComparator) throws SystemException {
		Object[] finderArgs = new Object[] {
				approved,
				
				String.valueOf(start), String.valueOf(end),
				String.valueOf(orderByComparator)
			};

		List<FAQComment> list = (List<FAQComment>)FinderCacheUtil.getResult(FINDER_PATH_FIND_BY_APPROVED,
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

			query.append(_SQL_SELECT_FAQCOMMENT_WHERE);

			query.append(_FINDER_COLUMN_APPROVED_APPROVED_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}

			else {
				query.append(FAQCommentModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(approved);

				list = (List<FAQComment>)QueryUtil.list(q, getDialect(), start,
						end);
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (list == null) {
					FinderCacheUtil.removeResult(FINDER_PATH_FIND_BY_APPROVED,
						finderArgs);
				}
				else {
					cacheResult(list);

					FinderCacheUtil.putResult(FINDER_PATH_FIND_BY_APPROVED,
						finderArgs, list);
				}

				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Finds the first f a q comment in the ordered set where approved = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param approved the approved to search with
	 * @param orderByComparator the comparator to order the set by
	 * @return the first matching f a q comment
	 * @throws com.vportal.portlet.vfaq.NoSuchFAQCommentException if a matching f a q comment could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public FAQComment findByApproved_First(boolean approved,
		OrderByComparator orderByComparator)
		throws NoSuchFAQCommentException, SystemException {
		List<FAQComment> list = findByApproved(approved, 0, 1, orderByComparator);

		if (list.isEmpty()) {
			StringBundler msg = new StringBundler(4);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("approved=");
			msg.append(approved);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			throw new NoSuchFAQCommentException(msg.toString());
		}
		else {
			return list.get(0);
		}
	}

	/**
	 * Finds the last f a q comment in the ordered set where approved = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param approved the approved to search with
	 * @param orderByComparator the comparator to order the set by
	 * @return the last matching f a q comment
	 * @throws com.vportal.portlet.vfaq.NoSuchFAQCommentException if a matching f a q comment could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public FAQComment findByApproved_Last(boolean approved,
		OrderByComparator orderByComparator)
		throws NoSuchFAQCommentException, SystemException {
		int count = countByApproved(approved);

		List<FAQComment> list = findByApproved(approved, count - 1, count,
				orderByComparator);

		if (list.isEmpty()) {
			StringBundler msg = new StringBundler(4);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("approved=");
			msg.append(approved);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			throw new NoSuchFAQCommentException(msg.toString());
		}
		else {
			return list.get(0);
		}
	}

	/**
	 * Finds the f a q comments before and after the current f a q comment in the ordered set where approved = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param id the primary key of the current f a q comment
	 * @param approved the approved to search with
	 * @param orderByComparator the comparator to order the set by
	 * @return the previous, current, and next f a q comment
	 * @throws com.vportal.portlet.vfaq.NoSuchFAQCommentException if a f a q comment with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public FAQComment[] findByApproved_PrevAndNext(long id, boolean approved,
		OrderByComparator orderByComparator)
		throws NoSuchFAQCommentException, SystemException {
		FAQComment faqComment = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			FAQComment[] array = new FAQCommentImpl[3];

			array[0] = getByApproved_PrevAndNext(session, faqComment, approved,
					orderByComparator, true);

			array[1] = faqComment;

			array[2] = getByApproved_PrevAndNext(session, faqComment, approved,
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

	protected FAQComment getByApproved_PrevAndNext(Session session,
		FAQComment faqComment, boolean approved,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_FAQCOMMENT_WHERE);

		query.append(_FINDER_COLUMN_APPROVED_APPROVED_2);

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
			query.append(FAQCommentModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(approved);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByValues(faqComment);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<FAQComment> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Finds all the f a q comments where answerid = &#63;.
	 *
	 * @param answerid the answerid to search with
	 * @return the matching f a q comments
	 * @throws SystemException if a system exception occurred
	 */
	public List<FAQComment> findByAnswerid(long answerid)
		throws SystemException {
		return findByAnswerid(answerid, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
			null);
	}

	/**
	 * Finds a range of all the f a q comments where answerid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param answerid the answerid to search with
	 * @param start the lower bound of the range of f a q comments to return
	 * @param end the upper bound of the range of f a q comments to return (not inclusive)
	 * @return the range of matching f a q comments
	 * @throws SystemException if a system exception occurred
	 */
	public List<FAQComment> findByAnswerid(long answerid, int start, int end)
		throws SystemException {
		return findByAnswerid(answerid, start, end, null);
	}

	/**
	 * Finds an ordered range of all the f a q comments where answerid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param answerid the answerid to search with
	 * @param start the lower bound of the range of f a q comments to return
	 * @param end the upper bound of the range of f a q comments to return (not inclusive)
	 * @param orderByComparator the comparator to order the results by
	 * @return the ordered range of matching f a q comments
	 * @throws SystemException if a system exception occurred
	 */
	public List<FAQComment> findByAnswerid(long answerid, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		Object[] finderArgs = new Object[] {
				answerid,
				
				String.valueOf(start), String.valueOf(end),
				String.valueOf(orderByComparator)
			};

		List<FAQComment> list = (List<FAQComment>)FinderCacheUtil.getResult(FINDER_PATH_FIND_BY_ANSWERID,
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

			query.append(_SQL_SELECT_FAQCOMMENT_WHERE);

			query.append(_FINDER_COLUMN_ANSWERID_ANSWERID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}

			else {
				query.append(FAQCommentModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(answerid);

				list = (List<FAQComment>)QueryUtil.list(q, getDialect(), start,
						end);
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (list == null) {
					FinderCacheUtil.removeResult(FINDER_PATH_FIND_BY_ANSWERID,
						finderArgs);
				}
				else {
					cacheResult(list);

					FinderCacheUtil.putResult(FINDER_PATH_FIND_BY_ANSWERID,
						finderArgs, list);
				}

				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Finds the first f a q comment in the ordered set where answerid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param answerid the answerid to search with
	 * @param orderByComparator the comparator to order the set by
	 * @return the first matching f a q comment
	 * @throws com.vportal.portlet.vfaq.NoSuchFAQCommentException if a matching f a q comment could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public FAQComment findByAnswerid_First(long answerid,
		OrderByComparator orderByComparator)
		throws NoSuchFAQCommentException, SystemException {
		List<FAQComment> list = findByAnswerid(answerid, 0, 1, orderByComparator);

		if (list.isEmpty()) {
			StringBundler msg = new StringBundler(4);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("answerid=");
			msg.append(answerid);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			throw new NoSuchFAQCommentException(msg.toString());
		}
		else {
			return list.get(0);
		}
	}

	/**
	 * Finds the last f a q comment in the ordered set where answerid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param answerid the answerid to search with
	 * @param orderByComparator the comparator to order the set by
	 * @return the last matching f a q comment
	 * @throws com.vportal.portlet.vfaq.NoSuchFAQCommentException if a matching f a q comment could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public FAQComment findByAnswerid_Last(long answerid,
		OrderByComparator orderByComparator)
		throws NoSuchFAQCommentException, SystemException {
		int count = countByAnswerid(answerid);

		List<FAQComment> list = findByAnswerid(answerid, count - 1, count,
				orderByComparator);

		if (list.isEmpty()) {
			StringBundler msg = new StringBundler(4);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("answerid=");
			msg.append(answerid);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			throw new NoSuchFAQCommentException(msg.toString());
		}
		else {
			return list.get(0);
		}
	}

	/**
	 * Finds the f a q comments before and after the current f a q comment in the ordered set where answerid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param id the primary key of the current f a q comment
	 * @param answerid the answerid to search with
	 * @param orderByComparator the comparator to order the set by
	 * @return the previous, current, and next f a q comment
	 * @throws com.vportal.portlet.vfaq.NoSuchFAQCommentException if a f a q comment with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public FAQComment[] findByAnswerid_PrevAndNext(long id, long answerid,
		OrderByComparator orderByComparator)
		throws NoSuchFAQCommentException, SystemException {
		FAQComment faqComment = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			FAQComment[] array = new FAQCommentImpl[3];

			array[0] = getByAnswerid_PrevAndNext(session, faqComment, answerid,
					orderByComparator, true);

			array[1] = faqComment;

			array[2] = getByAnswerid_PrevAndNext(session, faqComment, answerid,
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

	protected FAQComment getByAnswerid_PrevAndNext(Session session,
		FAQComment faqComment, long answerid,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_FAQCOMMENT_WHERE);

		query.append(_FINDER_COLUMN_ANSWERID_ANSWERID_2);

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
			query.append(FAQCommentModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(answerid);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByValues(faqComment);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<FAQComment> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Finds all the f a q comments.
	 *
	 * @return the f a q comments
	 * @throws SystemException if a system exception occurred
	 */
	public List<FAQComment> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Finds a range of all the f a q comments.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param start the lower bound of the range of f a q comments to return
	 * @param end the upper bound of the range of f a q comments to return (not inclusive)
	 * @return the range of f a q comments
	 * @throws SystemException if a system exception occurred
	 */
	public List<FAQComment> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Finds an ordered range of all the f a q comments.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param start the lower bound of the range of f a q comments to return
	 * @param end the upper bound of the range of f a q comments to return (not inclusive)
	 * @param orderByComparator the comparator to order the results by
	 * @return the ordered range of f a q comments
	 * @throws SystemException if a system exception occurred
	 */
	public List<FAQComment> findAll(int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		Object[] finderArgs = new Object[] {
				String.valueOf(start), String.valueOf(end),
				String.valueOf(orderByComparator)
			};

		List<FAQComment> list = (List<FAQComment>)FinderCacheUtil.getResult(FINDER_PATH_FIND_ALL,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_FAQCOMMENT);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_FAQCOMMENT.concat(FAQCommentModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (orderByComparator == null) {
					list = (List<FAQComment>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);
				}
				else {
					list = (List<FAQComment>)QueryUtil.list(q, getDialect(),
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
	 * Removes all the f a q comments where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid to search with
	 * @throws SystemException if a system exception occurred
	 */
	public void removeByUuid(String uuid) throws SystemException {
		for (FAQComment faqComment : findByUuid(uuid)) {
			remove(faqComment);
		}
	}

	/**
	 * Removes all the f a q comments where approved = &#63; from the database.
	 *
	 * @param approved the approved to search with
	 * @throws SystemException if a system exception occurred
	 */
	public void removeByApproved(boolean approved) throws SystemException {
		for (FAQComment faqComment : findByApproved(approved)) {
			remove(faqComment);
		}
	}

	/**
	 * Removes all the f a q comments where answerid = &#63; from the database.
	 *
	 * @param answerid the answerid to search with
	 * @throws SystemException if a system exception occurred
	 */
	public void removeByAnswerid(long answerid) throws SystemException {
		for (FAQComment faqComment : findByAnswerid(answerid)) {
			remove(faqComment);
		}
	}

	/**
	 * Removes all the f a q comments from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	public void removeAll() throws SystemException {
		for (FAQComment faqComment : findAll()) {
			remove(faqComment);
		}
	}

	/**
	 * Counts all the f a q comments where uuid = &#63;.
	 *
	 * @param uuid the uuid to search with
	 * @return the number of matching f a q comments
	 * @throws SystemException if a system exception occurred
	 */
	public int countByUuid(String uuid) throws SystemException {
		Object[] finderArgs = new Object[] { uuid };

		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_BY_UUID,
				finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_FAQCOMMENT_WHERE);

			if (uuid == null) {
				query.append(_FINDER_COLUMN_UUID_UUID_1);
			}
			else {
				if (uuid.equals(StringPool.BLANK)) {
					query.append(_FINDER_COLUMN_UUID_UUID_3);
				}
				else {
					query.append(_FINDER_COLUMN_UUID_UUID_2);
				}
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (uuid != null) {
					qPos.add(uuid);
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

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_UUID,
					finderArgs, count);

				closeSession(session);
			}
		}

		return count.intValue();
	}

	/**
	 * Counts all the f a q comments where approved = &#63;.
	 *
	 * @param approved the approved to search with
	 * @return the number of matching f a q comments
	 * @throws SystemException if a system exception occurred
	 */
	public int countByApproved(boolean approved) throws SystemException {
		Object[] finderArgs = new Object[] { approved };

		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_BY_APPROVED,
				finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_FAQCOMMENT_WHERE);

			query.append(_FINDER_COLUMN_APPROVED_APPROVED_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(approved);

				count = (Long)q.uniqueResult();
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (count == null) {
					count = Long.valueOf(0);
				}

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_APPROVED,
					finderArgs, count);

				closeSession(session);
			}
		}

		return count.intValue();
	}

	/**
	 * Counts all the f a q comments where answerid = &#63;.
	 *
	 * @param answerid the answerid to search with
	 * @return the number of matching f a q comments
	 * @throws SystemException if a system exception occurred
	 */
	public int countByAnswerid(long answerid) throws SystemException {
		Object[] finderArgs = new Object[] { answerid };

		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_BY_ANSWERID,
				finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_FAQCOMMENT_WHERE);

			query.append(_FINDER_COLUMN_ANSWERID_ANSWERID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(answerid);

				count = (Long)q.uniqueResult();
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (count == null) {
					count = Long.valueOf(0);
				}

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_ANSWERID,
					finderArgs, count);

				closeSession(session);
			}
		}

		return count.intValue();
	}

	/**
	 * Counts all the f a q comments.
	 *
	 * @return the number of f a q comments
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

				Query q = session.createQuery(_SQL_COUNT_FAQCOMMENT);

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
	 * Initializes the f a q comment persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.com.vportal.portlet.vfaq.model.FAQComment")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<FAQComment>> listenersList = new ArrayList<ModelListener<FAQComment>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<FAQComment>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(FAQCommentImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST);
	}

	@BeanReference(type = FAQCategoryPersistence.class)
	protected FAQCategoryPersistence faqCategoryPersistence;
	@BeanReference(type = FAQQuestionPersistence.class)
	protected FAQQuestionPersistence faqQuestionPersistence;
	@BeanReference(type = FAQCategoryQuestionPersistence.class)
	protected FAQCategoryQuestionPersistence faqCategoryQuestionPersistence;
	@BeanReference(type = FAQAnswerPersistence.class)
	protected FAQAnswerPersistence faqAnswerPersistence;
	@BeanReference(type = FAQCommentPersistence.class)
	protected FAQCommentPersistence faqCommentPersistence;
	@BeanReference(type = ResourcePersistence.class)
	protected ResourcePersistence resourcePersistence;
	@BeanReference(type = UserPersistence.class)
	protected UserPersistence userPersistence;
	private static final String _SQL_SELECT_FAQCOMMENT = "SELECT faqComment FROM FAQComment faqComment";
	private static final String _SQL_SELECT_FAQCOMMENT_WHERE = "SELECT faqComment FROM FAQComment faqComment WHERE ";
	private static final String _SQL_COUNT_FAQCOMMENT = "SELECT COUNT(faqComment) FROM FAQComment faqComment";
	private static final String _SQL_COUNT_FAQCOMMENT_WHERE = "SELECT COUNT(faqComment) FROM FAQComment faqComment WHERE ";
	private static final String _FINDER_COLUMN_UUID_UUID_1 = "faqComment.uuid IS NULL";
	private static final String _FINDER_COLUMN_UUID_UUID_2 = "faqComment.uuid = ?";
	private static final String _FINDER_COLUMN_UUID_UUID_3 = "(faqComment.uuid IS NULL OR faqComment.uuid = ?)";
	private static final String _FINDER_COLUMN_APPROVED_APPROVED_2 = "faqComment.approved = ?";
	private static final String _FINDER_COLUMN_ANSWERID_ANSWERID_2 = "faqComment.answerid = ?";
	private static final String _ORDER_BY_ENTITY_ALIAS = "faqComment.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No FAQComment exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No FAQComment exists with the key {";
	private static Log _log = LogFactoryUtil.getLog(FAQCommentPersistenceImpl.class);
}