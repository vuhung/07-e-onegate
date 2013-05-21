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
import com.liferay.portal.model.ModelListener;
import com.liferay.portal.service.persistence.BatchSessionUtil;
import com.liferay.portal.service.persistence.ResourcePersistence;
import com.liferay.portal.service.persistence.UserPersistence;
import com.liferay.portal.service.persistence.impl.BasePersistenceImpl;

import com.vportal.portlet.vcms.NoSuchVcmsDiscussionException;
import com.vportal.portlet.vcms.model.VcmsDiscussion;
import com.vportal.portlet.vcms.model.impl.VcmsDiscussionImpl;
import com.vportal.portlet.vcms.model.impl.VcmsDiscussionModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The persistence implementation for the vcms discussion service.
 *
 * <p>
 * Never modify or reference this class directly. Always use {@link VcmsDiscussionUtil} to access the vcms discussion persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
 * </p>
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author HOAN
 * @see VcmsDiscussionPersistence
 * @see VcmsDiscussionUtil
 * @generated
 */
public class VcmsDiscussionPersistenceImpl extends BasePersistenceImpl<VcmsDiscussion>
	implements VcmsDiscussionPersistence {
	public static final String FINDER_CLASS_NAME_ENTITY = VcmsDiscussionImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST = FINDER_CLASS_NAME_ENTITY +
		".List";
	public static final FinderPath FINDER_PATH_FIND_BY_P_L = new FinderPath(VcmsDiscussionModelImpl.ENTITY_CACHE_ENABLED,
			VcmsDiscussionModelImpl.FINDER_CACHE_ENABLED,
			FINDER_CLASS_NAME_LIST, "findByP_L",
			new String[] {
				Long.class.getName(), String.class.getName(),
				
			"java.lang.Integer", "java.lang.Integer",
				"com.liferay.portal.kernel.util.OrderByComparator"
			});
	public static final FinderPath FINDER_PATH_COUNT_BY_P_L = new FinderPath(VcmsDiscussionModelImpl.ENTITY_CACHE_ENABLED,
			VcmsDiscussionModelImpl.FINDER_CACHE_ENABLED,
			FINDER_CLASS_NAME_LIST, "countByP_L",
			new String[] { Long.class.getName(), String.class.getName() });
	public static final FinderPath FINDER_PATH_FIND_BY_P_L_A = new FinderPath(VcmsDiscussionModelImpl.ENTITY_CACHE_ENABLED,
			VcmsDiscussionModelImpl.FINDER_CACHE_ENABLED,
			FINDER_CLASS_NAME_LIST, "findByP_L_A",
			new String[] {
				Long.class.getName(), String.class.getName(),
				Boolean.class.getName(),
				
			"java.lang.Integer", "java.lang.Integer",
				"com.liferay.portal.kernel.util.OrderByComparator"
			});
	public static final FinderPath FINDER_PATH_COUNT_BY_P_L_A = new FinderPath(VcmsDiscussionModelImpl.ENTITY_CACHE_ENABLED,
			VcmsDiscussionModelImpl.FINDER_CACHE_ENABLED,
			FINDER_CLASS_NAME_LIST, "countByP_L_A",
			new String[] {
				Long.class.getName(), String.class.getName(),
				Boolean.class.getName()
			});
	public static final FinderPath FINDER_PATH_FIND_BY_A_P_L_A = new FinderPath(VcmsDiscussionModelImpl.ENTITY_CACHE_ENABLED,
			VcmsDiscussionModelImpl.FINDER_CACHE_ENABLED,
			FINDER_CLASS_NAME_LIST, "findByA_P_L_A",
			new String[] {
				String.class.getName(), Long.class.getName(),
				String.class.getName(), Boolean.class.getName(),
				
			"java.lang.Integer", "java.lang.Integer",
				"com.liferay.portal.kernel.util.OrderByComparator"
			});
	public static final FinderPath FINDER_PATH_COUNT_BY_A_P_L_A = new FinderPath(VcmsDiscussionModelImpl.ENTITY_CACHE_ENABLED,
			VcmsDiscussionModelImpl.FINDER_CACHE_ENABLED,
			FINDER_CLASS_NAME_LIST, "countByA_P_L_A",
			new String[] {
				String.class.getName(), Long.class.getName(),
				String.class.getName(), Boolean.class.getName()
			});
	public static final FinderPath FINDER_PATH_FIND_BY_A_A = new FinderPath(VcmsDiscussionModelImpl.ENTITY_CACHE_ENABLED,
			VcmsDiscussionModelImpl.FINDER_CACHE_ENABLED,
			FINDER_CLASS_NAME_LIST, "findByA_A",
			new String[] {
				String.class.getName(), Boolean.class.getName(),
				
			"java.lang.Integer", "java.lang.Integer",
				"com.liferay.portal.kernel.util.OrderByComparator"
			});
	public static final FinderPath FINDER_PATH_COUNT_BY_A_A = new FinderPath(VcmsDiscussionModelImpl.ENTITY_CACHE_ENABLED,
			VcmsDiscussionModelImpl.FINDER_CACHE_ENABLED,
			FINDER_CLASS_NAME_LIST, "countByA_A",
			new String[] { String.class.getName(), Boolean.class.getName() });
	public static final FinderPath FINDER_PATH_FIND_BY_ARTICLE = new FinderPath(VcmsDiscussionModelImpl.ENTITY_CACHE_ENABLED,
			VcmsDiscussionModelImpl.FINDER_CACHE_ENABLED,
			FINDER_CLASS_NAME_LIST, "findByArticle",
			new String[] {
				String.class.getName(),
				
			"java.lang.Integer", "java.lang.Integer",
				"com.liferay.portal.kernel.util.OrderByComparator"
			});
	public static final FinderPath FINDER_PATH_COUNT_BY_ARTICLE = new FinderPath(VcmsDiscussionModelImpl.ENTITY_CACHE_ENABLED,
			VcmsDiscussionModelImpl.FINDER_CACHE_ENABLED,
			FINDER_CLASS_NAME_LIST, "countByArticle",
			new String[] { String.class.getName() });
	public static final FinderPath FINDER_PATH_FIND_ALL = new FinderPath(VcmsDiscussionModelImpl.ENTITY_CACHE_ENABLED,
			VcmsDiscussionModelImpl.FINDER_CACHE_ENABLED,
			FINDER_CLASS_NAME_LIST, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(VcmsDiscussionModelImpl.ENTITY_CACHE_ENABLED,
			VcmsDiscussionModelImpl.FINDER_CACHE_ENABLED,
			FINDER_CLASS_NAME_LIST, "countAll", new String[0]);

	/**
	 * Caches the vcms discussion in the entity cache if it is enabled.
	 *
	 * @param vcmsDiscussion the vcms discussion to cache
	 */
	public void cacheResult(VcmsDiscussion vcmsDiscussion) {
		EntityCacheUtil.putResult(VcmsDiscussionModelImpl.ENTITY_CACHE_ENABLED,
			VcmsDiscussionImpl.class, vcmsDiscussion.getPrimaryKey(),
			vcmsDiscussion);
	}

	/**
	 * Caches the vcms discussions in the entity cache if it is enabled.
	 *
	 * @param vcmsDiscussions the vcms discussions to cache
	 */
	public void cacheResult(List<VcmsDiscussion> vcmsDiscussions) {
		for (VcmsDiscussion vcmsDiscussion : vcmsDiscussions) {
			if (EntityCacheUtil.getResult(
						VcmsDiscussionModelImpl.ENTITY_CACHE_ENABLED,
						VcmsDiscussionImpl.class,
						vcmsDiscussion.getPrimaryKey(), this) == null) {
				cacheResult(vcmsDiscussion);
			}
		}
	}

	/**
	 * Clears the cache for all vcms discussions.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	public void clearCache() {
		CacheRegistryUtil.clear(VcmsDiscussionImpl.class.getName());
		EntityCacheUtil.clearCache(VcmsDiscussionImpl.class.getName());
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST);
	}

	/**
	 * Clears the cache for the vcms discussion.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	public void clearCache(VcmsDiscussion vcmsDiscussion) {
		EntityCacheUtil.removeResult(VcmsDiscussionModelImpl.ENTITY_CACHE_ENABLED,
			VcmsDiscussionImpl.class, vcmsDiscussion.getPrimaryKey());
	}

	/**
	 * Creates a new vcms discussion with the primary key. Does not add the vcms discussion to the database.
	 *
	 * @param discussionId the primary key for the new vcms discussion
	 * @return the new vcms discussion
	 */
	public VcmsDiscussion create(String discussionId) {
		VcmsDiscussion vcmsDiscussion = new VcmsDiscussionImpl();

		vcmsDiscussion.setNew(true);
		vcmsDiscussion.setPrimaryKey(discussionId);

		return vcmsDiscussion;
	}

	/**
	 * Removes the vcms discussion with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the vcms discussion to remove
	 * @return the vcms discussion that was removed
	 * @throws com.liferay.portal.NoSuchModelException if a vcms discussion with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public VcmsDiscussion remove(Serializable primaryKey)
		throws NoSuchModelException, SystemException {
		return remove((String)primaryKey);
	}

	/**
	 * Removes the vcms discussion with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param discussionId the primary key of the vcms discussion to remove
	 * @return the vcms discussion that was removed
	 * @throws com.vportal.portlet.vcms.NoSuchVcmsDiscussionException if a vcms discussion with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public VcmsDiscussion remove(String discussionId)
		throws NoSuchVcmsDiscussionException, SystemException {
		Session session = null;

		try {
			session = openSession();

			VcmsDiscussion vcmsDiscussion = (VcmsDiscussion)session.get(VcmsDiscussionImpl.class,
					discussionId);

			if (vcmsDiscussion == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + discussionId);
				}

				throw new NoSuchVcmsDiscussionException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					discussionId);
			}

			return remove(vcmsDiscussion);
		}
		catch (NoSuchVcmsDiscussionException nsee) {
			throw nsee;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected VcmsDiscussion removeImpl(VcmsDiscussion vcmsDiscussion)
		throws SystemException {
		vcmsDiscussion = toUnwrappedModel(vcmsDiscussion);

		Session session = null;

		try {
			session = openSession();

			BatchSessionUtil.delete(session, vcmsDiscussion);
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST);

		EntityCacheUtil.removeResult(VcmsDiscussionModelImpl.ENTITY_CACHE_ENABLED,
			VcmsDiscussionImpl.class, vcmsDiscussion.getPrimaryKey());

		return vcmsDiscussion;
	}

	public VcmsDiscussion updateImpl(
		com.vportal.portlet.vcms.model.VcmsDiscussion vcmsDiscussion,
		boolean merge) throws SystemException {
		vcmsDiscussion = toUnwrappedModel(vcmsDiscussion);

		Session session = null;

		try {
			session = openSession();

			BatchSessionUtil.update(session, vcmsDiscussion, merge);

			vcmsDiscussion.setNew(false);
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST);

		EntityCacheUtil.putResult(VcmsDiscussionModelImpl.ENTITY_CACHE_ENABLED,
			VcmsDiscussionImpl.class, vcmsDiscussion.getPrimaryKey(),
			vcmsDiscussion);

		return vcmsDiscussion;
	}

	protected VcmsDiscussion toUnwrappedModel(VcmsDiscussion vcmsDiscussion) {
		if (vcmsDiscussion instanceof VcmsDiscussionImpl) {
			return vcmsDiscussion;
		}

		VcmsDiscussionImpl vcmsDiscussionImpl = new VcmsDiscussionImpl();

		vcmsDiscussionImpl.setNew(vcmsDiscussion.isNew());
		vcmsDiscussionImpl.setPrimaryKey(vcmsDiscussion.getPrimaryKey());

		vcmsDiscussionImpl.setDiscussionId(vcmsDiscussion.getDiscussionId());
		vcmsDiscussionImpl.setGroupId(vcmsDiscussion.getGroupId());
		vcmsDiscussionImpl.setCompanyId(vcmsDiscussion.getCompanyId());
		vcmsDiscussionImpl.setVisitorName(vcmsDiscussion.getVisitorName());
		vcmsDiscussionImpl.setVisitorEmail(vcmsDiscussion.getVisitorEmail());
		vcmsDiscussionImpl.setVisitorPhone(vcmsDiscussion.getVisitorPhone());
		vcmsDiscussionImpl.setPostedDate(vcmsDiscussion.getPostedDate());
		vcmsDiscussionImpl.setApproved(vcmsDiscussion.isApproved());
		vcmsDiscussionImpl.setApprovedByUser(vcmsDiscussion.getApprovedByUser());
		vcmsDiscussionImpl.setApprovedDate(vcmsDiscussion.getApprovedDate());
		vcmsDiscussionImpl.setArticleId(vcmsDiscussion.getArticleId());
		vcmsDiscussionImpl.setTitle(vcmsDiscussion.getTitle());
		vcmsDiscussionImpl.setContent(vcmsDiscussion.getContent());
		vcmsDiscussionImpl.setLanguage(vcmsDiscussion.getLanguage());
		vcmsDiscussionImpl.setHasAttachment(vcmsDiscussion.isHasAttachment());

		return vcmsDiscussionImpl;
	}

	/**
	 * Finds the vcms discussion with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the vcms discussion to find
	 * @return the vcms discussion
	 * @throws com.liferay.portal.NoSuchModelException if a vcms discussion with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public VcmsDiscussion findByPrimaryKey(Serializable primaryKey)
		throws NoSuchModelException, SystemException {
		return findByPrimaryKey((String)primaryKey);
	}

	/**
	 * Finds the vcms discussion with the primary key or throws a {@link com.vportal.portlet.vcms.NoSuchVcmsDiscussionException} if it could not be found.
	 *
	 * @param discussionId the primary key of the vcms discussion to find
	 * @return the vcms discussion
	 * @throws com.vportal.portlet.vcms.NoSuchVcmsDiscussionException if a vcms discussion with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public VcmsDiscussion findByPrimaryKey(String discussionId)
		throws NoSuchVcmsDiscussionException, SystemException {
		VcmsDiscussion vcmsDiscussion = fetchByPrimaryKey(discussionId);

		if (vcmsDiscussion == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + discussionId);
			}

			throw new NoSuchVcmsDiscussionException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				discussionId);
		}

		return vcmsDiscussion;
	}

	/**
	 * Finds the vcms discussion with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the vcms discussion to find
	 * @return the vcms discussion, or <code>null</code> if a vcms discussion with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public VcmsDiscussion fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		return fetchByPrimaryKey((String)primaryKey);
	}

	/**
	 * Finds the vcms discussion with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param discussionId the primary key of the vcms discussion to find
	 * @return the vcms discussion, or <code>null</code> if a vcms discussion with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public VcmsDiscussion fetchByPrimaryKey(String discussionId)
		throws SystemException {
		VcmsDiscussion vcmsDiscussion = (VcmsDiscussion)EntityCacheUtil.getResult(VcmsDiscussionModelImpl.ENTITY_CACHE_ENABLED,
				VcmsDiscussionImpl.class, discussionId, this);

		if (vcmsDiscussion == null) {
			Session session = null;

			try {
				session = openSession();

				vcmsDiscussion = (VcmsDiscussion)session.get(VcmsDiscussionImpl.class,
						discussionId);
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (vcmsDiscussion != null) {
					cacheResult(vcmsDiscussion);
				}

				closeSession(session);
			}
		}

		return vcmsDiscussion;
	}

	/**
	 * Finds all the vcms discussions where groupId = &#63; and language = &#63;.
	 *
	 * @param groupId the group id to search with
	 * @param language the language to search with
	 * @return the matching vcms discussions
	 * @throws SystemException if a system exception occurred
	 */
	public List<VcmsDiscussion> findByP_L(long groupId, String language)
		throws SystemException {
		return findByP_L(groupId, language, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Finds a range of all the vcms discussions where groupId = &#63; and language = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param groupId the group id to search with
	 * @param language the language to search with
	 * @param start the lower bound of the range of vcms discussions to return
	 * @param end the upper bound of the range of vcms discussions to return (not inclusive)
	 * @return the range of matching vcms discussions
	 * @throws SystemException if a system exception occurred
	 */
	public List<VcmsDiscussion> findByP_L(long groupId, String language,
		int start, int end) throws SystemException {
		return findByP_L(groupId, language, start, end, null);
	}

	/**
	 * Finds an ordered range of all the vcms discussions where groupId = &#63; and language = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param groupId the group id to search with
	 * @param language the language to search with
	 * @param start the lower bound of the range of vcms discussions to return
	 * @param end the upper bound of the range of vcms discussions to return (not inclusive)
	 * @param orderByComparator the comparator to order the results by
	 * @return the ordered range of matching vcms discussions
	 * @throws SystemException if a system exception occurred
	 */
	public List<VcmsDiscussion> findByP_L(long groupId, String language,
		int start, int end, OrderByComparator orderByComparator)
		throws SystemException {
		Object[] finderArgs = new Object[] {
				groupId, language,
				
				String.valueOf(start), String.valueOf(end),
				String.valueOf(orderByComparator)
			};

		List<VcmsDiscussion> list = (List<VcmsDiscussion>)FinderCacheUtil.getResult(FINDER_PATH_FIND_BY_P_L,
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

			query.append(_SQL_SELECT_VCMSDISCUSSION_WHERE);

			query.append(_FINDER_COLUMN_P_L_GROUPID_2);

			if (language == null) {
				query.append(_FINDER_COLUMN_P_L_LANGUAGE_1);
			}
			else {
				if (language.equals(StringPool.BLANK)) {
					query.append(_FINDER_COLUMN_P_L_LANGUAGE_3);
				}
				else {
					query.append(_FINDER_COLUMN_P_L_LANGUAGE_2);
				}
			}

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}

			else {
				query.append(VcmsDiscussionModelImpl.ORDER_BY_JPQL);
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

				list = (List<VcmsDiscussion>)QueryUtil.list(q, getDialect(),
						start, end);
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (list == null) {
					FinderCacheUtil.removeResult(FINDER_PATH_FIND_BY_P_L,
						finderArgs);
				}
				else {
					cacheResult(list);

					FinderCacheUtil.putResult(FINDER_PATH_FIND_BY_P_L,
						finderArgs, list);
				}

				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Finds the first vcms discussion in the ordered set where groupId = &#63; and language = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param groupId the group id to search with
	 * @param language the language to search with
	 * @param orderByComparator the comparator to order the set by
	 * @return the first matching vcms discussion
	 * @throws com.vportal.portlet.vcms.NoSuchVcmsDiscussionException if a matching vcms discussion could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public VcmsDiscussion findByP_L_First(long groupId, String language,
		OrderByComparator orderByComparator)
		throws NoSuchVcmsDiscussionException, SystemException {
		List<VcmsDiscussion> list = findByP_L(groupId, language, 0, 1,
				orderByComparator);

		if (list.isEmpty()) {
			StringBundler msg = new StringBundler(6);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("groupId=");
			msg.append(groupId);

			msg.append(", language=");
			msg.append(language);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			throw new NoSuchVcmsDiscussionException(msg.toString());
		}
		else {
			return list.get(0);
		}
	}

	/**
	 * Finds the last vcms discussion in the ordered set where groupId = &#63; and language = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param groupId the group id to search with
	 * @param language the language to search with
	 * @param orderByComparator the comparator to order the set by
	 * @return the last matching vcms discussion
	 * @throws com.vportal.portlet.vcms.NoSuchVcmsDiscussionException if a matching vcms discussion could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public VcmsDiscussion findByP_L_Last(long groupId, String language,
		OrderByComparator orderByComparator)
		throws NoSuchVcmsDiscussionException, SystemException {
		int count = countByP_L(groupId, language);

		List<VcmsDiscussion> list = findByP_L(groupId, language, count - 1,
				count, orderByComparator);

		if (list.isEmpty()) {
			StringBundler msg = new StringBundler(6);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("groupId=");
			msg.append(groupId);

			msg.append(", language=");
			msg.append(language);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			throw new NoSuchVcmsDiscussionException(msg.toString());
		}
		else {
			return list.get(0);
		}
	}

	/**
	 * Finds the vcms discussions before and after the current vcms discussion in the ordered set where groupId = &#63; and language = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param discussionId the primary key of the current vcms discussion
	 * @param groupId the group id to search with
	 * @param language the language to search with
	 * @param orderByComparator the comparator to order the set by
	 * @return the previous, current, and next vcms discussion
	 * @throws com.vportal.portlet.vcms.NoSuchVcmsDiscussionException if a vcms discussion with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public VcmsDiscussion[] findByP_L_PrevAndNext(String discussionId,
		long groupId, String language, OrderByComparator orderByComparator)
		throws NoSuchVcmsDiscussionException, SystemException {
		VcmsDiscussion vcmsDiscussion = findByPrimaryKey(discussionId);

		Session session = null;

		try {
			session = openSession();

			VcmsDiscussion[] array = new VcmsDiscussionImpl[3];

			array[0] = getByP_L_PrevAndNext(session, vcmsDiscussion, groupId,
					language, orderByComparator, true);

			array[1] = vcmsDiscussion;

			array[2] = getByP_L_PrevAndNext(session, vcmsDiscussion, groupId,
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

	protected VcmsDiscussion getByP_L_PrevAndNext(Session session,
		VcmsDiscussion vcmsDiscussion, long groupId, String language,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_VCMSDISCUSSION_WHERE);

		query.append(_FINDER_COLUMN_P_L_GROUPID_2);

		if (language == null) {
			query.append(_FINDER_COLUMN_P_L_LANGUAGE_1);
		}
		else {
			if (language.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_P_L_LANGUAGE_3);
			}
			else {
				query.append(_FINDER_COLUMN_P_L_LANGUAGE_2);
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
			query.append(VcmsDiscussionModelImpl.ORDER_BY_JPQL);
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
			Object[] values = orderByComparator.getOrderByValues(vcmsDiscussion);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<VcmsDiscussion> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Finds all the vcms discussions where groupId = &#63; and language = &#63; and approved = &#63;.
	 *
	 * @param groupId the group id to search with
	 * @param language the language to search with
	 * @param approved the approved to search with
	 * @return the matching vcms discussions
	 * @throws SystemException if a system exception occurred
	 */
	public List<VcmsDiscussion> findByP_L_A(long groupId, String language,
		boolean approved) throws SystemException {
		return findByP_L_A(groupId, language, approved, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Finds a range of all the vcms discussions where groupId = &#63; and language = &#63; and approved = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param groupId the group id to search with
	 * @param language the language to search with
	 * @param approved the approved to search with
	 * @param start the lower bound of the range of vcms discussions to return
	 * @param end the upper bound of the range of vcms discussions to return (not inclusive)
	 * @return the range of matching vcms discussions
	 * @throws SystemException if a system exception occurred
	 */
	public List<VcmsDiscussion> findByP_L_A(long groupId, String language,
		boolean approved, int start, int end) throws SystemException {
		return findByP_L_A(groupId, language, approved, start, end, null);
	}

	/**
	 * Finds an ordered range of all the vcms discussions where groupId = &#63; and language = &#63; and approved = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param groupId the group id to search with
	 * @param language the language to search with
	 * @param approved the approved to search with
	 * @param start the lower bound of the range of vcms discussions to return
	 * @param end the upper bound of the range of vcms discussions to return (not inclusive)
	 * @param orderByComparator the comparator to order the results by
	 * @return the ordered range of matching vcms discussions
	 * @throws SystemException if a system exception occurred
	 */
	public List<VcmsDiscussion> findByP_L_A(long groupId, String language,
		boolean approved, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		Object[] finderArgs = new Object[] {
				groupId, language, approved,
				
				String.valueOf(start), String.valueOf(end),
				String.valueOf(orderByComparator)
			};

		List<VcmsDiscussion> list = (List<VcmsDiscussion>)FinderCacheUtil.getResult(FINDER_PATH_FIND_BY_P_L_A,
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

			query.append(_SQL_SELECT_VCMSDISCUSSION_WHERE);

			query.append(_FINDER_COLUMN_P_L_A_GROUPID_2);

			if (language == null) {
				query.append(_FINDER_COLUMN_P_L_A_LANGUAGE_1);
			}
			else {
				if (language.equals(StringPool.BLANK)) {
					query.append(_FINDER_COLUMN_P_L_A_LANGUAGE_3);
				}
				else {
					query.append(_FINDER_COLUMN_P_L_A_LANGUAGE_2);
				}
			}

			query.append(_FINDER_COLUMN_P_L_A_APPROVED_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}

			else {
				query.append(VcmsDiscussionModelImpl.ORDER_BY_JPQL);
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

				qPos.add(approved);

				list = (List<VcmsDiscussion>)QueryUtil.list(q, getDialect(),
						start, end);
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (list == null) {
					FinderCacheUtil.removeResult(FINDER_PATH_FIND_BY_P_L_A,
						finderArgs);
				}
				else {
					cacheResult(list);

					FinderCacheUtil.putResult(FINDER_PATH_FIND_BY_P_L_A,
						finderArgs, list);
				}

				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Finds the first vcms discussion in the ordered set where groupId = &#63; and language = &#63; and approved = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param groupId the group id to search with
	 * @param language the language to search with
	 * @param approved the approved to search with
	 * @param orderByComparator the comparator to order the set by
	 * @return the first matching vcms discussion
	 * @throws com.vportal.portlet.vcms.NoSuchVcmsDiscussionException if a matching vcms discussion could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public VcmsDiscussion findByP_L_A_First(long groupId, String language,
		boolean approved, OrderByComparator orderByComparator)
		throws NoSuchVcmsDiscussionException, SystemException {
		List<VcmsDiscussion> list = findByP_L_A(groupId, language, approved, 0,
				1, orderByComparator);

		if (list.isEmpty()) {
			StringBundler msg = new StringBundler(8);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("groupId=");
			msg.append(groupId);

			msg.append(", language=");
			msg.append(language);

			msg.append(", approved=");
			msg.append(approved);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			throw new NoSuchVcmsDiscussionException(msg.toString());
		}
		else {
			return list.get(0);
		}
	}

	/**
	 * Finds the last vcms discussion in the ordered set where groupId = &#63; and language = &#63; and approved = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param groupId the group id to search with
	 * @param language the language to search with
	 * @param approved the approved to search with
	 * @param orderByComparator the comparator to order the set by
	 * @return the last matching vcms discussion
	 * @throws com.vportal.portlet.vcms.NoSuchVcmsDiscussionException if a matching vcms discussion could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public VcmsDiscussion findByP_L_A_Last(long groupId, String language,
		boolean approved, OrderByComparator orderByComparator)
		throws NoSuchVcmsDiscussionException, SystemException {
		int count = countByP_L_A(groupId, language, approved);

		List<VcmsDiscussion> list = findByP_L_A(groupId, language, approved,
				count - 1, count, orderByComparator);

		if (list.isEmpty()) {
			StringBundler msg = new StringBundler(8);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("groupId=");
			msg.append(groupId);

			msg.append(", language=");
			msg.append(language);

			msg.append(", approved=");
			msg.append(approved);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			throw new NoSuchVcmsDiscussionException(msg.toString());
		}
		else {
			return list.get(0);
		}
	}

	/**
	 * Finds the vcms discussions before and after the current vcms discussion in the ordered set where groupId = &#63; and language = &#63; and approved = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param discussionId the primary key of the current vcms discussion
	 * @param groupId the group id to search with
	 * @param language the language to search with
	 * @param approved the approved to search with
	 * @param orderByComparator the comparator to order the set by
	 * @return the previous, current, and next vcms discussion
	 * @throws com.vportal.portlet.vcms.NoSuchVcmsDiscussionException if a vcms discussion with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public VcmsDiscussion[] findByP_L_A_PrevAndNext(String discussionId,
		long groupId, String language, boolean approved,
		OrderByComparator orderByComparator)
		throws NoSuchVcmsDiscussionException, SystemException {
		VcmsDiscussion vcmsDiscussion = findByPrimaryKey(discussionId);

		Session session = null;

		try {
			session = openSession();

			VcmsDiscussion[] array = new VcmsDiscussionImpl[3];

			array[0] = getByP_L_A_PrevAndNext(session, vcmsDiscussion, groupId,
					language, approved, orderByComparator, true);

			array[1] = vcmsDiscussion;

			array[2] = getByP_L_A_PrevAndNext(session, vcmsDiscussion, groupId,
					language, approved, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected VcmsDiscussion getByP_L_A_PrevAndNext(Session session,
		VcmsDiscussion vcmsDiscussion, long groupId, String language,
		boolean approved, OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_VCMSDISCUSSION_WHERE);

		query.append(_FINDER_COLUMN_P_L_A_GROUPID_2);

		if (language == null) {
			query.append(_FINDER_COLUMN_P_L_A_LANGUAGE_1);
		}
		else {
			if (language.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_P_L_A_LANGUAGE_3);
			}
			else {
				query.append(_FINDER_COLUMN_P_L_A_LANGUAGE_2);
			}
		}

		query.append(_FINDER_COLUMN_P_L_A_APPROVED_2);

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
			query.append(VcmsDiscussionModelImpl.ORDER_BY_JPQL);
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

		qPos.add(approved);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByValues(vcmsDiscussion);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<VcmsDiscussion> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Finds all the vcms discussions where articleId = &#63; and groupId = &#63; and language = &#63; and approved = &#63;.
	 *
	 * @param articleId the article id to search with
	 * @param groupId the group id to search with
	 * @param language the language to search with
	 * @param approved the approved to search with
	 * @return the matching vcms discussions
	 * @throws SystemException if a system exception occurred
	 */
	public List<VcmsDiscussion> findByA_P_L_A(String articleId, long groupId,
		String language, boolean approved) throws SystemException {
		return findByA_P_L_A(articleId, groupId, language, approved,
			QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Finds a range of all the vcms discussions where articleId = &#63; and groupId = &#63; and language = &#63; and approved = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param articleId the article id to search with
	 * @param groupId the group id to search with
	 * @param language the language to search with
	 * @param approved the approved to search with
	 * @param start the lower bound of the range of vcms discussions to return
	 * @param end the upper bound of the range of vcms discussions to return (not inclusive)
	 * @return the range of matching vcms discussions
	 * @throws SystemException if a system exception occurred
	 */
	public List<VcmsDiscussion> findByA_P_L_A(String articleId, long groupId,
		String language, boolean approved, int start, int end)
		throws SystemException {
		return findByA_P_L_A(articleId, groupId, language, approved, start,
			end, null);
	}

	/**
	 * Finds an ordered range of all the vcms discussions where articleId = &#63; and groupId = &#63; and language = &#63; and approved = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param articleId the article id to search with
	 * @param groupId the group id to search with
	 * @param language the language to search with
	 * @param approved the approved to search with
	 * @param start the lower bound of the range of vcms discussions to return
	 * @param end the upper bound of the range of vcms discussions to return (not inclusive)
	 * @param orderByComparator the comparator to order the results by
	 * @return the ordered range of matching vcms discussions
	 * @throws SystemException if a system exception occurred
	 */
	public List<VcmsDiscussion> findByA_P_L_A(String articleId, long groupId,
		String language, boolean approved, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		Object[] finderArgs = new Object[] {
				articleId, groupId, language, approved,
				
				String.valueOf(start), String.valueOf(end),
				String.valueOf(orderByComparator)
			};

		List<VcmsDiscussion> list = (List<VcmsDiscussion>)FinderCacheUtil.getResult(FINDER_PATH_FIND_BY_A_P_L_A,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;

			if (orderByComparator != null) {
				query = new StringBundler(6 +
						(orderByComparator.getOrderByFields().length * 3));
			}
			else {
				query = new StringBundler(6);
			}

			query.append(_SQL_SELECT_VCMSDISCUSSION_WHERE);

			if (articleId == null) {
				query.append(_FINDER_COLUMN_A_P_L_A_ARTICLEID_1);
			}
			else {
				if (articleId.equals(StringPool.BLANK)) {
					query.append(_FINDER_COLUMN_A_P_L_A_ARTICLEID_3);
				}
				else {
					query.append(_FINDER_COLUMN_A_P_L_A_ARTICLEID_2);
				}
			}

			query.append(_FINDER_COLUMN_A_P_L_A_GROUPID_2);

			if (language == null) {
				query.append(_FINDER_COLUMN_A_P_L_A_LANGUAGE_1);
			}
			else {
				if (language.equals(StringPool.BLANK)) {
					query.append(_FINDER_COLUMN_A_P_L_A_LANGUAGE_3);
				}
				else {
					query.append(_FINDER_COLUMN_A_P_L_A_LANGUAGE_2);
				}
			}

			query.append(_FINDER_COLUMN_A_P_L_A_APPROVED_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}

			else {
				query.append(VcmsDiscussionModelImpl.ORDER_BY_JPQL);
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

				qPos.add(groupId);

				if (language != null) {
					qPos.add(language);
				}

				qPos.add(approved);

				list = (List<VcmsDiscussion>)QueryUtil.list(q, getDialect(),
						start, end);
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (list == null) {
					FinderCacheUtil.removeResult(FINDER_PATH_FIND_BY_A_P_L_A,
						finderArgs);
				}
				else {
					cacheResult(list);

					FinderCacheUtil.putResult(FINDER_PATH_FIND_BY_A_P_L_A,
						finderArgs, list);
				}

				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Finds the first vcms discussion in the ordered set where articleId = &#63; and groupId = &#63; and language = &#63; and approved = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param articleId the article id to search with
	 * @param groupId the group id to search with
	 * @param language the language to search with
	 * @param approved the approved to search with
	 * @param orderByComparator the comparator to order the set by
	 * @return the first matching vcms discussion
	 * @throws com.vportal.portlet.vcms.NoSuchVcmsDiscussionException if a matching vcms discussion could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public VcmsDiscussion findByA_P_L_A_First(String articleId, long groupId,
		String language, boolean approved, OrderByComparator orderByComparator)
		throws NoSuchVcmsDiscussionException, SystemException {
		List<VcmsDiscussion> list = findByA_P_L_A(articleId, groupId, language,
				approved, 0, 1, orderByComparator);

		if (list.isEmpty()) {
			StringBundler msg = new StringBundler(10);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("articleId=");
			msg.append(articleId);

			msg.append(", groupId=");
			msg.append(groupId);

			msg.append(", language=");
			msg.append(language);

			msg.append(", approved=");
			msg.append(approved);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			throw new NoSuchVcmsDiscussionException(msg.toString());
		}
		else {
			return list.get(0);
		}
	}

	/**
	 * Finds the last vcms discussion in the ordered set where articleId = &#63; and groupId = &#63; and language = &#63; and approved = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param articleId the article id to search with
	 * @param groupId the group id to search with
	 * @param language the language to search with
	 * @param approved the approved to search with
	 * @param orderByComparator the comparator to order the set by
	 * @return the last matching vcms discussion
	 * @throws com.vportal.portlet.vcms.NoSuchVcmsDiscussionException if a matching vcms discussion could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public VcmsDiscussion findByA_P_L_A_Last(String articleId, long groupId,
		String language, boolean approved, OrderByComparator orderByComparator)
		throws NoSuchVcmsDiscussionException, SystemException {
		int count = countByA_P_L_A(articleId, groupId, language, approved);

		List<VcmsDiscussion> list = findByA_P_L_A(articleId, groupId, language,
				approved, count - 1, count, orderByComparator);

		if (list.isEmpty()) {
			StringBundler msg = new StringBundler(10);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("articleId=");
			msg.append(articleId);

			msg.append(", groupId=");
			msg.append(groupId);

			msg.append(", language=");
			msg.append(language);

			msg.append(", approved=");
			msg.append(approved);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			throw new NoSuchVcmsDiscussionException(msg.toString());
		}
		else {
			return list.get(0);
		}
	}

	/**
	 * Finds the vcms discussions before and after the current vcms discussion in the ordered set where articleId = &#63; and groupId = &#63; and language = &#63; and approved = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param discussionId the primary key of the current vcms discussion
	 * @param articleId the article id to search with
	 * @param groupId the group id to search with
	 * @param language the language to search with
	 * @param approved the approved to search with
	 * @param orderByComparator the comparator to order the set by
	 * @return the previous, current, and next vcms discussion
	 * @throws com.vportal.portlet.vcms.NoSuchVcmsDiscussionException if a vcms discussion with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public VcmsDiscussion[] findByA_P_L_A_PrevAndNext(String discussionId,
		String articleId, long groupId, String language, boolean approved,
		OrderByComparator orderByComparator)
		throws NoSuchVcmsDiscussionException, SystemException {
		VcmsDiscussion vcmsDiscussion = findByPrimaryKey(discussionId);

		Session session = null;

		try {
			session = openSession();

			VcmsDiscussion[] array = new VcmsDiscussionImpl[3];

			array[0] = getByA_P_L_A_PrevAndNext(session, vcmsDiscussion,
					articleId, groupId, language, approved, orderByComparator,
					true);

			array[1] = vcmsDiscussion;

			array[2] = getByA_P_L_A_PrevAndNext(session, vcmsDiscussion,
					articleId, groupId, language, approved, orderByComparator,
					false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected VcmsDiscussion getByA_P_L_A_PrevAndNext(Session session,
		VcmsDiscussion vcmsDiscussion, String articleId, long groupId,
		String language, boolean approved, OrderByComparator orderByComparator,
		boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_VCMSDISCUSSION_WHERE);

		if (articleId == null) {
			query.append(_FINDER_COLUMN_A_P_L_A_ARTICLEID_1);
		}
		else {
			if (articleId.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_A_P_L_A_ARTICLEID_3);
			}
			else {
				query.append(_FINDER_COLUMN_A_P_L_A_ARTICLEID_2);
			}
		}

		query.append(_FINDER_COLUMN_A_P_L_A_GROUPID_2);

		if (language == null) {
			query.append(_FINDER_COLUMN_A_P_L_A_LANGUAGE_1);
		}
		else {
			if (language.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_A_P_L_A_LANGUAGE_3);
			}
			else {
				query.append(_FINDER_COLUMN_A_P_L_A_LANGUAGE_2);
			}
		}

		query.append(_FINDER_COLUMN_A_P_L_A_APPROVED_2);

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
			query.append(VcmsDiscussionModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		if (articleId != null) {
			qPos.add(articleId);
		}

		qPos.add(groupId);

		if (language != null) {
			qPos.add(language);
		}

		qPos.add(approved);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByValues(vcmsDiscussion);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<VcmsDiscussion> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Finds all the vcms discussions where articleId = &#63; and approved = &#63;.
	 *
	 * @param articleId the article id to search with
	 * @param approved the approved to search with
	 * @return the matching vcms discussions
	 * @throws SystemException if a system exception occurred
	 */
	public List<VcmsDiscussion> findByA_A(String articleId, boolean approved)
		throws SystemException {
		return findByA_A(articleId, approved, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Finds a range of all the vcms discussions where articleId = &#63; and approved = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param articleId the article id to search with
	 * @param approved the approved to search with
	 * @param start the lower bound of the range of vcms discussions to return
	 * @param end the upper bound of the range of vcms discussions to return (not inclusive)
	 * @return the range of matching vcms discussions
	 * @throws SystemException if a system exception occurred
	 */
	public List<VcmsDiscussion> findByA_A(String articleId, boolean approved,
		int start, int end) throws SystemException {
		return findByA_A(articleId, approved, start, end, null);
	}

	/**
	 * Finds an ordered range of all the vcms discussions where articleId = &#63; and approved = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param articleId the article id to search with
	 * @param approved the approved to search with
	 * @param start the lower bound of the range of vcms discussions to return
	 * @param end the upper bound of the range of vcms discussions to return (not inclusive)
	 * @param orderByComparator the comparator to order the results by
	 * @return the ordered range of matching vcms discussions
	 * @throws SystemException if a system exception occurred
	 */
	public List<VcmsDiscussion> findByA_A(String articleId, boolean approved,
		int start, int end, OrderByComparator orderByComparator)
		throws SystemException {
		Object[] finderArgs = new Object[] {
				articleId, approved,
				
				String.valueOf(start), String.valueOf(end),
				String.valueOf(orderByComparator)
			};

		List<VcmsDiscussion> list = (List<VcmsDiscussion>)FinderCacheUtil.getResult(FINDER_PATH_FIND_BY_A_A,
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

			query.append(_SQL_SELECT_VCMSDISCUSSION_WHERE);

			if (articleId == null) {
				query.append(_FINDER_COLUMN_A_A_ARTICLEID_1);
			}
			else {
				if (articleId.equals(StringPool.BLANK)) {
					query.append(_FINDER_COLUMN_A_A_ARTICLEID_3);
				}
				else {
					query.append(_FINDER_COLUMN_A_A_ARTICLEID_2);
				}
			}

			query.append(_FINDER_COLUMN_A_A_APPROVED_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}

			else {
				query.append(VcmsDiscussionModelImpl.ORDER_BY_JPQL);
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

				qPos.add(approved);

				list = (List<VcmsDiscussion>)QueryUtil.list(q, getDialect(),
						start, end);
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (list == null) {
					FinderCacheUtil.removeResult(FINDER_PATH_FIND_BY_A_A,
						finderArgs);
				}
				else {
					cacheResult(list);

					FinderCacheUtil.putResult(FINDER_PATH_FIND_BY_A_A,
						finderArgs, list);
				}

				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Finds the first vcms discussion in the ordered set where articleId = &#63; and approved = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param articleId the article id to search with
	 * @param approved the approved to search with
	 * @param orderByComparator the comparator to order the set by
	 * @return the first matching vcms discussion
	 * @throws com.vportal.portlet.vcms.NoSuchVcmsDiscussionException if a matching vcms discussion could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public VcmsDiscussion findByA_A_First(String articleId, boolean approved,
		OrderByComparator orderByComparator)
		throws NoSuchVcmsDiscussionException, SystemException {
		List<VcmsDiscussion> list = findByA_A(articleId, approved, 0, 1,
				orderByComparator);

		if (list.isEmpty()) {
			StringBundler msg = new StringBundler(6);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("articleId=");
			msg.append(articleId);

			msg.append(", approved=");
			msg.append(approved);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			throw new NoSuchVcmsDiscussionException(msg.toString());
		}
		else {
			return list.get(0);
		}
	}

	/**
	 * Finds the last vcms discussion in the ordered set where articleId = &#63; and approved = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param articleId the article id to search with
	 * @param approved the approved to search with
	 * @param orderByComparator the comparator to order the set by
	 * @return the last matching vcms discussion
	 * @throws com.vportal.portlet.vcms.NoSuchVcmsDiscussionException if a matching vcms discussion could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public VcmsDiscussion findByA_A_Last(String articleId, boolean approved,
		OrderByComparator orderByComparator)
		throws NoSuchVcmsDiscussionException, SystemException {
		int count = countByA_A(articleId, approved);

		List<VcmsDiscussion> list = findByA_A(articleId, approved, count - 1,
				count, orderByComparator);

		if (list.isEmpty()) {
			StringBundler msg = new StringBundler(6);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("articleId=");
			msg.append(articleId);

			msg.append(", approved=");
			msg.append(approved);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			throw new NoSuchVcmsDiscussionException(msg.toString());
		}
		else {
			return list.get(0);
		}
	}

	/**
	 * Finds the vcms discussions before and after the current vcms discussion in the ordered set where articleId = &#63; and approved = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param discussionId the primary key of the current vcms discussion
	 * @param articleId the article id to search with
	 * @param approved the approved to search with
	 * @param orderByComparator the comparator to order the set by
	 * @return the previous, current, and next vcms discussion
	 * @throws com.vportal.portlet.vcms.NoSuchVcmsDiscussionException if a vcms discussion with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public VcmsDiscussion[] findByA_A_PrevAndNext(String discussionId,
		String articleId, boolean approved, OrderByComparator orderByComparator)
		throws NoSuchVcmsDiscussionException, SystemException {
		VcmsDiscussion vcmsDiscussion = findByPrimaryKey(discussionId);

		Session session = null;

		try {
			session = openSession();

			VcmsDiscussion[] array = new VcmsDiscussionImpl[3];

			array[0] = getByA_A_PrevAndNext(session, vcmsDiscussion, articleId,
					approved, orderByComparator, true);

			array[1] = vcmsDiscussion;

			array[2] = getByA_A_PrevAndNext(session, vcmsDiscussion, articleId,
					approved, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected VcmsDiscussion getByA_A_PrevAndNext(Session session,
		VcmsDiscussion vcmsDiscussion, String articleId, boolean approved,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_VCMSDISCUSSION_WHERE);

		if (articleId == null) {
			query.append(_FINDER_COLUMN_A_A_ARTICLEID_1);
		}
		else {
			if (articleId.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_A_A_ARTICLEID_3);
			}
			else {
				query.append(_FINDER_COLUMN_A_A_ARTICLEID_2);
			}
		}

		query.append(_FINDER_COLUMN_A_A_APPROVED_2);

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
			query.append(VcmsDiscussionModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		if (articleId != null) {
			qPos.add(articleId);
		}

		qPos.add(approved);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByValues(vcmsDiscussion);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<VcmsDiscussion> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Finds all the vcms discussions where articleId = &#63;.
	 *
	 * @param articleId the article id to search with
	 * @return the matching vcms discussions
	 * @throws SystemException if a system exception occurred
	 */
	public List<VcmsDiscussion> findByArticle(String articleId)
		throws SystemException {
		return findByArticle(articleId, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
			null);
	}

	/**
	 * Finds a range of all the vcms discussions where articleId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param articleId the article id to search with
	 * @param start the lower bound of the range of vcms discussions to return
	 * @param end the upper bound of the range of vcms discussions to return (not inclusive)
	 * @return the range of matching vcms discussions
	 * @throws SystemException if a system exception occurred
	 */
	public List<VcmsDiscussion> findByArticle(String articleId, int start,
		int end) throws SystemException {
		return findByArticle(articleId, start, end, null);
	}

	/**
	 * Finds an ordered range of all the vcms discussions where articleId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param articleId the article id to search with
	 * @param start the lower bound of the range of vcms discussions to return
	 * @param end the upper bound of the range of vcms discussions to return (not inclusive)
	 * @param orderByComparator the comparator to order the results by
	 * @return the ordered range of matching vcms discussions
	 * @throws SystemException if a system exception occurred
	 */
	public List<VcmsDiscussion> findByArticle(String articleId, int start,
		int end, OrderByComparator orderByComparator) throws SystemException {
		Object[] finderArgs = new Object[] {
				articleId,
				
				String.valueOf(start), String.valueOf(end),
				String.valueOf(orderByComparator)
			};

		List<VcmsDiscussion> list = (List<VcmsDiscussion>)FinderCacheUtil.getResult(FINDER_PATH_FIND_BY_ARTICLE,
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

			query.append(_SQL_SELECT_VCMSDISCUSSION_WHERE);

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
				query.append(VcmsDiscussionModelImpl.ORDER_BY_JPQL);
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

				list = (List<VcmsDiscussion>)QueryUtil.list(q, getDialect(),
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
	 * Finds the first vcms discussion in the ordered set where articleId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param articleId the article id to search with
	 * @param orderByComparator the comparator to order the set by
	 * @return the first matching vcms discussion
	 * @throws com.vportal.portlet.vcms.NoSuchVcmsDiscussionException if a matching vcms discussion could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public VcmsDiscussion findByArticle_First(String articleId,
		OrderByComparator orderByComparator)
		throws NoSuchVcmsDiscussionException, SystemException {
		List<VcmsDiscussion> list = findByArticle(articleId, 0, 1,
				orderByComparator);

		if (list.isEmpty()) {
			StringBundler msg = new StringBundler(4);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("articleId=");
			msg.append(articleId);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			throw new NoSuchVcmsDiscussionException(msg.toString());
		}
		else {
			return list.get(0);
		}
	}

	/**
	 * Finds the last vcms discussion in the ordered set where articleId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param articleId the article id to search with
	 * @param orderByComparator the comparator to order the set by
	 * @return the last matching vcms discussion
	 * @throws com.vportal.portlet.vcms.NoSuchVcmsDiscussionException if a matching vcms discussion could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public VcmsDiscussion findByArticle_Last(String articleId,
		OrderByComparator orderByComparator)
		throws NoSuchVcmsDiscussionException, SystemException {
		int count = countByArticle(articleId);

		List<VcmsDiscussion> list = findByArticle(articleId, count - 1, count,
				orderByComparator);

		if (list.isEmpty()) {
			StringBundler msg = new StringBundler(4);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("articleId=");
			msg.append(articleId);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			throw new NoSuchVcmsDiscussionException(msg.toString());
		}
		else {
			return list.get(0);
		}
	}

	/**
	 * Finds the vcms discussions before and after the current vcms discussion in the ordered set where articleId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param discussionId the primary key of the current vcms discussion
	 * @param articleId the article id to search with
	 * @param orderByComparator the comparator to order the set by
	 * @return the previous, current, and next vcms discussion
	 * @throws com.vportal.portlet.vcms.NoSuchVcmsDiscussionException if a vcms discussion with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public VcmsDiscussion[] findByArticle_PrevAndNext(String discussionId,
		String articleId, OrderByComparator orderByComparator)
		throws NoSuchVcmsDiscussionException, SystemException {
		VcmsDiscussion vcmsDiscussion = findByPrimaryKey(discussionId);

		Session session = null;

		try {
			session = openSession();

			VcmsDiscussion[] array = new VcmsDiscussionImpl[3];

			array[0] = getByArticle_PrevAndNext(session, vcmsDiscussion,
					articleId, orderByComparator, true);

			array[1] = vcmsDiscussion;

			array[2] = getByArticle_PrevAndNext(session, vcmsDiscussion,
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

	protected VcmsDiscussion getByArticle_PrevAndNext(Session session,
		VcmsDiscussion vcmsDiscussion, String articleId,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_VCMSDISCUSSION_WHERE);

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
			query.append(VcmsDiscussionModelImpl.ORDER_BY_JPQL);
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
			Object[] values = orderByComparator.getOrderByValues(vcmsDiscussion);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<VcmsDiscussion> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Finds all the vcms discussions.
	 *
	 * @return the vcms discussions
	 * @throws SystemException if a system exception occurred
	 */
	public List<VcmsDiscussion> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Finds a range of all the vcms discussions.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param start the lower bound of the range of vcms discussions to return
	 * @param end the upper bound of the range of vcms discussions to return (not inclusive)
	 * @return the range of vcms discussions
	 * @throws SystemException if a system exception occurred
	 */
	public List<VcmsDiscussion> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Finds an ordered range of all the vcms discussions.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param start the lower bound of the range of vcms discussions to return
	 * @param end the upper bound of the range of vcms discussions to return (not inclusive)
	 * @param orderByComparator the comparator to order the results by
	 * @return the ordered range of vcms discussions
	 * @throws SystemException if a system exception occurred
	 */
	public List<VcmsDiscussion> findAll(int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		Object[] finderArgs = new Object[] {
				String.valueOf(start), String.valueOf(end),
				String.valueOf(orderByComparator)
			};

		List<VcmsDiscussion> list = (List<VcmsDiscussion>)FinderCacheUtil.getResult(FINDER_PATH_FIND_ALL,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_VCMSDISCUSSION);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_VCMSDISCUSSION.concat(VcmsDiscussionModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (orderByComparator == null) {
					list = (List<VcmsDiscussion>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);
				}
				else {
					list = (List<VcmsDiscussion>)QueryUtil.list(q,
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
	 * Removes all the vcms discussions where groupId = &#63; and language = &#63; from the database.
	 *
	 * @param groupId the group id to search with
	 * @param language the language to search with
	 * @throws SystemException if a system exception occurred
	 */
	public void removeByP_L(long groupId, String language)
		throws SystemException {
		for (VcmsDiscussion vcmsDiscussion : findByP_L(groupId, language)) {
			remove(vcmsDiscussion);
		}
	}

	/**
	 * Removes all the vcms discussions where groupId = &#63; and language = &#63; and approved = &#63; from the database.
	 *
	 * @param groupId the group id to search with
	 * @param language the language to search with
	 * @param approved the approved to search with
	 * @throws SystemException if a system exception occurred
	 */
	public void removeByP_L_A(long groupId, String language, boolean approved)
		throws SystemException {
		for (VcmsDiscussion vcmsDiscussion : findByP_L_A(groupId, language,
				approved)) {
			remove(vcmsDiscussion);
		}
	}

	/**
	 * Removes all the vcms discussions where articleId = &#63; and groupId = &#63; and language = &#63; and approved = &#63; from the database.
	 *
	 * @param articleId the article id to search with
	 * @param groupId the group id to search with
	 * @param language the language to search with
	 * @param approved the approved to search with
	 * @throws SystemException if a system exception occurred
	 */
	public void removeByA_P_L_A(String articleId, long groupId,
		String language, boolean approved) throws SystemException {
		for (VcmsDiscussion vcmsDiscussion : findByA_P_L_A(articleId, groupId,
				language, approved)) {
			remove(vcmsDiscussion);
		}
	}

	/**
	 * Removes all the vcms discussions where articleId = &#63; and approved = &#63; from the database.
	 *
	 * @param articleId the article id to search with
	 * @param approved the approved to search with
	 * @throws SystemException if a system exception occurred
	 */
	public void removeByA_A(String articleId, boolean approved)
		throws SystemException {
		for (VcmsDiscussion vcmsDiscussion : findByA_A(articleId, approved)) {
			remove(vcmsDiscussion);
		}
	}

	/**
	 * Removes all the vcms discussions where articleId = &#63; from the database.
	 *
	 * @param articleId the article id to search with
	 * @throws SystemException if a system exception occurred
	 */
	public void removeByArticle(String articleId) throws SystemException {
		for (VcmsDiscussion vcmsDiscussion : findByArticle(articleId)) {
			remove(vcmsDiscussion);
		}
	}

	/**
	 * Removes all the vcms discussions from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	public void removeAll() throws SystemException {
		for (VcmsDiscussion vcmsDiscussion : findAll()) {
			remove(vcmsDiscussion);
		}
	}

	/**
	 * Counts all the vcms discussions where groupId = &#63; and language = &#63;.
	 *
	 * @param groupId the group id to search with
	 * @param language the language to search with
	 * @return the number of matching vcms discussions
	 * @throws SystemException if a system exception occurred
	 */
	public int countByP_L(long groupId, String language)
		throws SystemException {
		Object[] finderArgs = new Object[] { groupId, language };

		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_BY_P_L,
				finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_VCMSDISCUSSION_WHERE);

			query.append(_FINDER_COLUMN_P_L_GROUPID_2);

			if (language == null) {
				query.append(_FINDER_COLUMN_P_L_LANGUAGE_1);
			}
			else {
				if (language.equals(StringPool.BLANK)) {
					query.append(_FINDER_COLUMN_P_L_LANGUAGE_3);
				}
				else {
					query.append(_FINDER_COLUMN_P_L_LANGUAGE_2);
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

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_P_L, finderArgs,
					count);

				closeSession(session);
			}
		}

		return count.intValue();
	}

	/**
	 * Counts all the vcms discussions where groupId = &#63; and language = &#63; and approved = &#63;.
	 *
	 * @param groupId the group id to search with
	 * @param language the language to search with
	 * @param approved the approved to search with
	 * @return the number of matching vcms discussions
	 * @throws SystemException if a system exception occurred
	 */
	public int countByP_L_A(long groupId, String language, boolean approved)
		throws SystemException {
		Object[] finderArgs = new Object[] { groupId, language, approved };

		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_BY_P_L_A,
				finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(4);

			query.append(_SQL_COUNT_VCMSDISCUSSION_WHERE);

			query.append(_FINDER_COLUMN_P_L_A_GROUPID_2);

			if (language == null) {
				query.append(_FINDER_COLUMN_P_L_A_LANGUAGE_1);
			}
			else {
				if (language.equals(StringPool.BLANK)) {
					query.append(_FINDER_COLUMN_P_L_A_LANGUAGE_3);
				}
				else {
					query.append(_FINDER_COLUMN_P_L_A_LANGUAGE_2);
				}
			}

			query.append(_FINDER_COLUMN_P_L_A_APPROVED_2);

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

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_P_L_A,
					finderArgs, count);

				closeSession(session);
			}
		}

		return count.intValue();
	}

	/**
	 * Counts all the vcms discussions where articleId = &#63; and groupId = &#63; and language = &#63; and approved = &#63;.
	 *
	 * @param articleId the article id to search with
	 * @param groupId the group id to search with
	 * @param language the language to search with
	 * @param approved the approved to search with
	 * @return the number of matching vcms discussions
	 * @throws SystemException if a system exception occurred
	 */
	public int countByA_P_L_A(String articleId, long groupId, String language,
		boolean approved) throws SystemException {
		Object[] finderArgs = new Object[] {
				articleId, groupId, language, approved
			};

		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_BY_A_P_L_A,
				finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(5);

			query.append(_SQL_COUNT_VCMSDISCUSSION_WHERE);

			if (articleId == null) {
				query.append(_FINDER_COLUMN_A_P_L_A_ARTICLEID_1);
			}
			else {
				if (articleId.equals(StringPool.BLANK)) {
					query.append(_FINDER_COLUMN_A_P_L_A_ARTICLEID_3);
				}
				else {
					query.append(_FINDER_COLUMN_A_P_L_A_ARTICLEID_2);
				}
			}

			query.append(_FINDER_COLUMN_A_P_L_A_GROUPID_2);

			if (language == null) {
				query.append(_FINDER_COLUMN_A_P_L_A_LANGUAGE_1);
			}
			else {
				if (language.equals(StringPool.BLANK)) {
					query.append(_FINDER_COLUMN_A_P_L_A_LANGUAGE_3);
				}
				else {
					query.append(_FINDER_COLUMN_A_P_L_A_LANGUAGE_2);
				}
			}

			query.append(_FINDER_COLUMN_A_P_L_A_APPROVED_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (articleId != null) {
					qPos.add(articleId);
				}

				qPos.add(groupId);

				if (language != null) {
					qPos.add(language);
				}

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

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_A_P_L_A,
					finderArgs, count);

				closeSession(session);
			}
		}

		return count.intValue();
	}

	/**
	 * Counts all the vcms discussions where articleId = &#63; and approved = &#63;.
	 *
	 * @param articleId the article id to search with
	 * @param approved the approved to search with
	 * @return the number of matching vcms discussions
	 * @throws SystemException if a system exception occurred
	 */
	public int countByA_A(String articleId, boolean approved)
		throws SystemException {
		Object[] finderArgs = new Object[] { articleId, approved };

		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_BY_A_A,
				finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_VCMSDISCUSSION_WHERE);

			if (articleId == null) {
				query.append(_FINDER_COLUMN_A_A_ARTICLEID_1);
			}
			else {
				if (articleId.equals(StringPool.BLANK)) {
					query.append(_FINDER_COLUMN_A_A_ARTICLEID_3);
				}
				else {
					query.append(_FINDER_COLUMN_A_A_ARTICLEID_2);
				}
			}

			query.append(_FINDER_COLUMN_A_A_APPROVED_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (articleId != null) {
					qPos.add(articleId);
				}

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

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_A_A, finderArgs,
					count);

				closeSession(session);
			}
		}

		return count.intValue();
	}

	/**
	 * Counts all the vcms discussions where articleId = &#63;.
	 *
	 * @param articleId the article id to search with
	 * @return the number of matching vcms discussions
	 * @throws SystemException if a system exception occurred
	 */
	public int countByArticle(String articleId) throws SystemException {
		Object[] finderArgs = new Object[] { articleId };

		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_BY_ARTICLE,
				finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_VCMSDISCUSSION_WHERE);

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
	 * Counts all the vcms discussions.
	 *
	 * @return the number of vcms discussions
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

				Query q = session.createQuery(_SQL_COUNT_VCMSDISCUSSION);

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
	 * Initializes the vcms discussion persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.com.vportal.portlet.vcms.model.VcmsDiscussion")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<VcmsDiscussion>> listenersList = new ArrayList<ModelListener<VcmsDiscussion>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<VcmsDiscussion>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(VcmsDiscussionImpl.class.getName());
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
	private static final String _SQL_SELECT_VCMSDISCUSSION = "SELECT vcmsDiscussion FROM VcmsDiscussion vcmsDiscussion";
	private static final String _SQL_SELECT_VCMSDISCUSSION_WHERE = "SELECT vcmsDiscussion FROM VcmsDiscussion vcmsDiscussion WHERE ";
	private static final String _SQL_COUNT_VCMSDISCUSSION = "SELECT COUNT(vcmsDiscussion) FROM VcmsDiscussion vcmsDiscussion";
	private static final String _SQL_COUNT_VCMSDISCUSSION_WHERE = "SELECT COUNT(vcmsDiscussion) FROM VcmsDiscussion vcmsDiscussion WHERE ";
	private static final String _FINDER_COLUMN_P_L_GROUPID_2 = "vcmsDiscussion.groupId = ? AND ";
	private static final String _FINDER_COLUMN_P_L_LANGUAGE_1 = "vcmsDiscussion.language IS NULL";
	private static final String _FINDER_COLUMN_P_L_LANGUAGE_2 = "vcmsDiscussion.language = ?";
	private static final String _FINDER_COLUMN_P_L_LANGUAGE_3 = "(vcmsDiscussion.language IS NULL OR vcmsDiscussion.language = ?)";
	private static final String _FINDER_COLUMN_P_L_A_GROUPID_2 = "vcmsDiscussion.groupId = ? AND ";
	private static final String _FINDER_COLUMN_P_L_A_LANGUAGE_1 = "vcmsDiscussion.language IS NULL AND ";
	private static final String _FINDER_COLUMN_P_L_A_LANGUAGE_2 = "vcmsDiscussion.language = ? AND ";
	private static final String _FINDER_COLUMN_P_L_A_LANGUAGE_3 = "(vcmsDiscussion.language IS NULL OR vcmsDiscussion.language = ?) AND ";
	private static final String _FINDER_COLUMN_P_L_A_APPROVED_2 = "vcmsDiscussion.approved = ?";
	private static final String _FINDER_COLUMN_A_P_L_A_ARTICLEID_1 = "vcmsDiscussion.articleId IS NULL AND ";
	private static final String _FINDER_COLUMN_A_P_L_A_ARTICLEID_2 = "vcmsDiscussion.articleId = ? AND ";
	private static final String _FINDER_COLUMN_A_P_L_A_ARTICLEID_3 = "(vcmsDiscussion.articleId IS NULL OR vcmsDiscussion.articleId = ?) AND ";
	private static final String _FINDER_COLUMN_A_P_L_A_GROUPID_2 = "vcmsDiscussion.groupId = ? AND ";
	private static final String _FINDER_COLUMN_A_P_L_A_LANGUAGE_1 = "vcmsDiscussion.language IS NULL AND ";
	private static final String _FINDER_COLUMN_A_P_L_A_LANGUAGE_2 = "vcmsDiscussion.language = ? AND ";
	private static final String _FINDER_COLUMN_A_P_L_A_LANGUAGE_3 = "(vcmsDiscussion.language IS NULL OR vcmsDiscussion.language = ?) AND ";
	private static final String _FINDER_COLUMN_A_P_L_A_APPROVED_2 = "vcmsDiscussion.approved = ?";
	private static final String _FINDER_COLUMN_A_A_ARTICLEID_1 = "vcmsDiscussion.articleId IS NULL AND ";
	private static final String _FINDER_COLUMN_A_A_ARTICLEID_2 = "vcmsDiscussion.articleId = ? AND ";
	private static final String _FINDER_COLUMN_A_A_ARTICLEID_3 = "(vcmsDiscussion.articleId IS NULL OR vcmsDiscussion.articleId = ?) AND ";
	private static final String _FINDER_COLUMN_A_A_APPROVED_2 = "vcmsDiscussion.approved = ?";
	private static final String _FINDER_COLUMN_ARTICLE_ARTICLEID_1 = "vcmsDiscussion.articleId IS NULL";
	private static final String _FINDER_COLUMN_ARTICLE_ARTICLEID_2 = "vcmsDiscussion.articleId = ?";
	private static final String _FINDER_COLUMN_ARTICLE_ARTICLEID_3 = "(vcmsDiscussion.articleId IS NULL OR vcmsDiscussion.articleId = ?)";
	private static final String _ORDER_BY_ENTITY_ALIAS = "vcmsDiscussion.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No VcmsDiscussion exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No VcmsDiscussion exists with the key {";
	private static Log _log = LogFactoryUtil.getLog(VcmsDiscussionPersistenceImpl.class);
}