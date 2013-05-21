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

import com.vportal.portlet.vcms.NoSuchVcmsArticleException;
import com.vportal.portlet.vcms.model.VcmsArticle;
import com.vportal.portlet.vcms.model.impl.VcmsArticleImpl;
import com.vportal.portlet.vcms.model.impl.VcmsArticleModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The persistence implementation for the vcms article service.
 *
 * <p>
 * Never modify or reference this class directly. Always use {@link VcmsArticleUtil} to access the vcms article persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
 * </p>
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author HOAN
 * @see VcmsArticlePersistence
 * @see VcmsArticleUtil
 * @generated
 */
public class VcmsArticlePersistenceImpl extends BasePersistenceImpl<VcmsArticle>
	implements VcmsArticlePersistence {
	public static final String FINDER_CLASS_NAME_ENTITY = VcmsArticleImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST = FINDER_CLASS_NAME_ENTITY +
		".List";
	public static final FinderPath FINDER_PATH_FIND_BY_L_S = new FinderPath(VcmsArticleModelImpl.ENTITY_CACHE_ENABLED,
			VcmsArticleModelImpl.FINDER_CACHE_ENABLED, FINDER_CLASS_NAME_LIST,
			"findByL_S",
			new String[] {
				Long.class.getName(), String.class.getName(),
				Long.class.getName(),
				
			"java.lang.Integer", "java.lang.Integer",
				"com.liferay.portal.kernel.util.OrderByComparator"
			});
	public static final FinderPath FINDER_PATH_COUNT_BY_L_S = new FinderPath(VcmsArticleModelImpl.ENTITY_CACHE_ENABLED,
			VcmsArticleModelImpl.FINDER_CACHE_ENABLED, FINDER_CLASS_NAME_LIST,
			"countByL_S",
			new String[] {
				Long.class.getName(), String.class.getName(),
				Long.class.getName()
			});
	public static final FinderPath FINDER_PATH_FIND_BY_G_L_S_U = new FinderPath(VcmsArticleModelImpl.ENTITY_CACHE_ENABLED,
			VcmsArticleModelImpl.FINDER_CACHE_ENABLED, FINDER_CLASS_NAME_LIST,
			"findByG_L_S_U",
			new String[] {
				Long.class.getName(), String.class.getName(),
				Long.class.getName(), String.class.getName(),
				
			"java.lang.Integer", "java.lang.Integer",
				"com.liferay.portal.kernel.util.OrderByComparator"
			});
	public static final FinderPath FINDER_PATH_COUNT_BY_G_L_S_U = new FinderPath(VcmsArticleModelImpl.ENTITY_CACHE_ENABLED,
			VcmsArticleModelImpl.FINDER_CACHE_ENABLED, FINDER_CLASS_NAME_LIST,
			"countByG_L_S_U",
			new String[] {
				Long.class.getName(), String.class.getName(),
				Long.class.getName(), String.class.getName()
			});
	public static final FinderPath FINDER_PATH_FIND_BY_L_S_S = new FinderPath(VcmsArticleModelImpl.ENTITY_CACHE_ENABLED,
			VcmsArticleModelImpl.FINDER_CACHE_ENABLED, FINDER_CLASS_NAME_LIST,
			"findByL_S_S",
			new String[] {
				Long.class.getName(), String.class.getName(),
				Long.class.getName(), Boolean.class.getName(),
				
			"java.lang.Integer", "java.lang.Integer",
				"com.liferay.portal.kernel.util.OrderByComparator"
			});
	public static final FinderPath FINDER_PATH_COUNT_BY_L_S_S = new FinderPath(VcmsArticleModelImpl.ENTITY_CACHE_ENABLED,
			VcmsArticleModelImpl.FINDER_CACHE_ENABLED, FINDER_CLASS_NAME_LIST,
			"countByL_S_S",
			new String[] {
				Long.class.getName(), String.class.getName(),
				Long.class.getName(), Boolean.class.getName()
			});
	public static final FinderPath FINDER_PATH_FIND_BY_U_L = new FinderPath(VcmsArticleModelImpl.ENTITY_CACHE_ENABLED,
			VcmsArticleModelImpl.FINDER_CACHE_ENABLED, FINDER_CLASS_NAME_LIST,
			"findByU_L",
			new String[] {
				Long.class.getName(), String.class.getName(),
				String.class.getName(),
				
			"java.lang.Integer", "java.lang.Integer",
				"com.liferay.portal.kernel.util.OrderByComparator"
			});
	public static final FinderPath FINDER_PATH_COUNT_BY_U_L = new FinderPath(VcmsArticleModelImpl.ENTITY_CACHE_ENABLED,
			VcmsArticleModelImpl.FINDER_CACHE_ENABLED, FINDER_CLASS_NAME_LIST,
			"countByU_L",
			new String[] {
				Long.class.getName(), String.class.getName(),
				String.class.getName()
			});
	public static final FinderPath FINDER_PATH_FIND_BY_U_L_S = new FinderPath(VcmsArticleModelImpl.ENTITY_CACHE_ENABLED,
			VcmsArticleModelImpl.FINDER_CACHE_ENABLED, FINDER_CLASS_NAME_LIST,
			"findByU_L_S",
			new String[] {
				Long.class.getName(), String.class.getName(),
				String.class.getName(), Long.class.getName(),
				
			"java.lang.Integer", "java.lang.Integer",
				"com.liferay.portal.kernel.util.OrderByComparator"
			});
	public static final FinderPath FINDER_PATH_COUNT_BY_U_L_S = new FinderPath(VcmsArticleModelImpl.ENTITY_CACHE_ENABLED,
			VcmsArticleModelImpl.FINDER_CACHE_ENABLED, FINDER_CLASS_NAME_LIST,
			"countByU_L_S",
			new String[] {
				Long.class.getName(), String.class.getName(),
				String.class.getName(), Long.class.getName()
			});
	public static final FinderPath FINDER_PATH_FIND_BY_P_L_S_D = new FinderPath(VcmsArticleModelImpl.ENTITY_CACHE_ENABLED,
			VcmsArticleModelImpl.FINDER_CACHE_ENABLED, FINDER_CLASS_NAME_LIST,
			"findByP_L_S_D",
			new String[] {
				Long.class.getName(), String.class.getName(),
				Long.class.getName(), Boolean.class.getName(),
				
			"java.lang.Integer", "java.lang.Integer",
				"com.liferay.portal.kernel.util.OrderByComparator"
			});
	public static final FinderPath FINDER_PATH_COUNT_BY_P_L_S_D = new FinderPath(VcmsArticleModelImpl.ENTITY_CACHE_ENABLED,
			VcmsArticleModelImpl.FINDER_CACHE_ENABLED, FINDER_CLASS_NAME_LIST,
			"countByP_L_S_D",
			new String[] {
				Long.class.getName(), String.class.getName(),
				Long.class.getName(), Boolean.class.getName()
			});
	public static final FinderPath FINDER_PATH_FIND_BY_STATUS = new FinderPath(VcmsArticleModelImpl.ENTITY_CACHE_ENABLED,
			VcmsArticleModelImpl.FINDER_CACHE_ENABLED, FINDER_CLASS_NAME_LIST,
			"findByStatus",
			new String[] {
				Long.class.getName(),
				
			"java.lang.Integer", "java.lang.Integer",
				"com.liferay.portal.kernel.util.OrderByComparator"
			});
	public static final FinderPath FINDER_PATH_COUNT_BY_STATUS = new FinderPath(VcmsArticleModelImpl.ENTITY_CACHE_ENABLED,
			VcmsArticleModelImpl.FINDER_CACHE_ENABLED, FINDER_CLASS_NAME_LIST,
			"countByStatus", new String[] { Long.class.getName() });
	public static final FinderPath FINDER_PATH_FIND_ALL = new FinderPath(VcmsArticleModelImpl.ENTITY_CACHE_ENABLED,
			VcmsArticleModelImpl.FINDER_CACHE_ENABLED, FINDER_CLASS_NAME_LIST,
			"findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(VcmsArticleModelImpl.ENTITY_CACHE_ENABLED,
			VcmsArticleModelImpl.FINDER_CACHE_ENABLED, FINDER_CLASS_NAME_LIST,
			"countAll", new String[0]);

	/**
	 * Caches the vcms article in the entity cache if it is enabled.
	 *
	 * @param vcmsArticle the vcms article to cache
	 */
	public void cacheResult(VcmsArticle vcmsArticle) {
		EntityCacheUtil.putResult(VcmsArticleModelImpl.ENTITY_CACHE_ENABLED,
			VcmsArticleImpl.class, vcmsArticle.getPrimaryKey(), vcmsArticle);
	}

	/**
	 * Caches the vcms articles in the entity cache if it is enabled.
	 *
	 * @param vcmsArticles the vcms articles to cache
	 */
	public void cacheResult(List<VcmsArticle> vcmsArticles) {
		for (VcmsArticle vcmsArticle : vcmsArticles) {
			if (EntityCacheUtil.getResult(
						VcmsArticleModelImpl.ENTITY_CACHE_ENABLED,
						VcmsArticleImpl.class, vcmsArticle.getPrimaryKey(), this) == null) {
				cacheResult(vcmsArticle);
			}
		}
	}

	/**
	 * Clears the cache for all vcms articles.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	public void clearCache() {
		CacheRegistryUtil.clear(VcmsArticleImpl.class.getName());
		EntityCacheUtil.clearCache(VcmsArticleImpl.class.getName());
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST);
	}

	/**
	 * Clears the cache for the vcms article.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	public void clearCache(VcmsArticle vcmsArticle) {
		EntityCacheUtil.removeResult(VcmsArticleModelImpl.ENTITY_CACHE_ENABLED,
			VcmsArticleImpl.class, vcmsArticle.getPrimaryKey());
	}

	/**
	 * Creates a new vcms article with the primary key. Does not add the vcms article to the database.
	 *
	 * @param articleId the primary key for the new vcms article
	 * @return the new vcms article
	 */
	public VcmsArticle create(String articleId) {
		VcmsArticle vcmsArticle = new VcmsArticleImpl();

		vcmsArticle.setNew(true);
		vcmsArticle.setPrimaryKey(articleId);

		return vcmsArticle;
	}

	/**
	 * Removes the vcms article with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the vcms article to remove
	 * @return the vcms article that was removed
	 * @throws com.liferay.portal.NoSuchModelException if a vcms article with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public VcmsArticle remove(Serializable primaryKey)
		throws NoSuchModelException, SystemException {
		return remove((String)primaryKey);
	}

	/**
	 * Removes the vcms article with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param articleId the primary key of the vcms article to remove
	 * @return the vcms article that was removed
	 * @throws com.vportal.portlet.vcms.NoSuchVcmsArticleException if a vcms article with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public VcmsArticle remove(String articleId)
		throws NoSuchVcmsArticleException, SystemException {
		Session session = null;

		try {
			session = openSession();

			VcmsArticle vcmsArticle = (VcmsArticle)session.get(VcmsArticleImpl.class,
					articleId);

			if (vcmsArticle == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + articleId);
				}

				throw new NoSuchVcmsArticleException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					articleId);
			}

			return remove(vcmsArticle);
		}
		catch (NoSuchVcmsArticleException nsee) {
			throw nsee;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected VcmsArticle removeImpl(VcmsArticle vcmsArticle)
		throws SystemException {
		vcmsArticle = toUnwrappedModel(vcmsArticle);

		Session session = null;

		try {
			session = openSession();

			BatchSessionUtil.delete(session, vcmsArticle);
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST);

		EntityCacheUtil.removeResult(VcmsArticleModelImpl.ENTITY_CACHE_ENABLED,
			VcmsArticleImpl.class, vcmsArticle.getPrimaryKey());

		return vcmsArticle;
	}

	public VcmsArticle updateImpl(
		com.vportal.portlet.vcms.model.VcmsArticle vcmsArticle, boolean merge)
		throws SystemException {
		vcmsArticle = toUnwrappedModel(vcmsArticle);

		Session session = null;

		try {
			session = openSession();

			BatchSessionUtil.update(session, vcmsArticle, merge);

			vcmsArticle.setNew(false);
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST);

		EntityCacheUtil.putResult(VcmsArticleModelImpl.ENTITY_CACHE_ENABLED,
			VcmsArticleImpl.class, vcmsArticle.getPrimaryKey(), vcmsArticle);

		return vcmsArticle;
	}

	protected VcmsArticle toUnwrappedModel(VcmsArticle vcmsArticle) {
		if (vcmsArticle instanceof VcmsArticleImpl) {
			return vcmsArticle;
		}

		VcmsArticleImpl vcmsArticleImpl = new VcmsArticleImpl();

		vcmsArticleImpl.setNew(vcmsArticle.isNew());
		vcmsArticleImpl.setPrimaryKey(vcmsArticle.getPrimaryKey());

		vcmsArticleImpl.setArticleId(vcmsArticle.getArticleId());
		vcmsArticleImpl.setGroupId(vcmsArticle.getGroupId());
		vcmsArticleImpl.setCompanyId(vcmsArticle.getCompanyId());
		vcmsArticleImpl.setCreatedByUser(vcmsArticle.getCreatedByUser());
		vcmsArticleImpl.setCreatedDate(vcmsArticle.getCreatedDate());
		vcmsArticleImpl.setModifiedByUser(vcmsArticle.getModifiedByUser());
		vcmsArticleImpl.setModifiedDate(vcmsArticle.getModifiedDate());
		vcmsArticleImpl.setApprovedByUser(vcmsArticle.getApprovedByUser());
		vcmsArticleImpl.setApprovedDate(vcmsArticle.getApprovedDate());
		vcmsArticleImpl.setPublishedByUser(vcmsArticle.getPublishedByUser());
		vcmsArticleImpl.setPublishedDate(vcmsArticle.getPublishedDate());
		vcmsArticleImpl.setStatus(vcmsArticle.getStatus());
		vcmsArticleImpl.setTitle(vcmsArticle.getTitle());
		vcmsArticleImpl.setLead(vcmsArticle.getLead());
		vcmsArticleImpl.setContent(vcmsArticle.getContent());
		vcmsArticleImpl.setHasImage(vcmsArticle.isHasImage());
		vcmsArticleImpl.setImageTitle(vcmsArticle.getImageTitle());
		vcmsArticleImpl.setImage(vcmsArticle.getImage());
		vcmsArticleImpl.setAuthor(vcmsArticle.getAuthor());
		vcmsArticleImpl.setSource(vcmsArticle.getSource());
		vcmsArticleImpl.setLanguage(vcmsArticle.getLanguage());
		vcmsArticleImpl.setUserHit(vcmsArticle.getUserHit());
		vcmsArticleImpl.setDiscussible(vcmsArticle.isDiscussible());
		vcmsArticleImpl.setHasAttachment(vcmsArticle.isHasAttachment());
		vcmsArticleImpl.setHasPoll(vcmsArticle.isHasPoll());
		vcmsArticleImpl.setPollId(vcmsArticle.getPollId());
		vcmsArticleImpl.setEffectiveDate(vcmsArticle.getEffectiveDate());
		vcmsArticleImpl.setExpireDate(vcmsArticle.getExpireDate());
		vcmsArticleImpl.setSticky(vcmsArticle.isSticky());
		vcmsArticleImpl.setStickyNeverExpired(vcmsArticle.isStickyNeverExpired());
		vcmsArticleImpl.setStickyExpireDate(vcmsArticle.getStickyExpireDate());

		return vcmsArticleImpl;
	}

	/**
	 * Finds the vcms article with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the vcms article to find
	 * @return the vcms article
	 * @throws com.liferay.portal.NoSuchModelException if a vcms article with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public VcmsArticle findByPrimaryKey(Serializable primaryKey)
		throws NoSuchModelException, SystemException {
		return findByPrimaryKey((String)primaryKey);
	}

	/**
	 * Finds the vcms article with the primary key or throws a {@link com.vportal.portlet.vcms.NoSuchVcmsArticleException} if it could not be found.
	 *
	 * @param articleId the primary key of the vcms article to find
	 * @return the vcms article
	 * @throws com.vportal.portlet.vcms.NoSuchVcmsArticleException if a vcms article with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public VcmsArticle findByPrimaryKey(String articleId)
		throws NoSuchVcmsArticleException, SystemException {
		VcmsArticle vcmsArticle = fetchByPrimaryKey(articleId);

		if (vcmsArticle == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + articleId);
			}

			throw new NoSuchVcmsArticleException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				articleId);
		}

		return vcmsArticle;
	}

	/**
	 * Finds the vcms article with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the vcms article to find
	 * @return the vcms article, or <code>null</code> if a vcms article with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public VcmsArticle fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		return fetchByPrimaryKey((String)primaryKey);
	}

	/**
	 * Finds the vcms article with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param articleId the primary key of the vcms article to find
	 * @return the vcms article, or <code>null</code> if a vcms article with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public VcmsArticle fetchByPrimaryKey(String articleId)
		throws SystemException {
		VcmsArticle vcmsArticle = (VcmsArticle)EntityCacheUtil.getResult(VcmsArticleModelImpl.ENTITY_CACHE_ENABLED,
				VcmsArticleImpl.class, articleId, this);

		if (vcmsArticle == null) {
			Session session = null;

			try {
				session = openSession();

				vcmsArticle = (VcmsArticle)session.get(VcmsArticleImpl.class,
						articleId);
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (vcmsArticle != null) {
					cacheResult(vcmsArticle);
				}

				closeSession(session);
			}
		}

		return vcmsArticle;
	}

	/**
	 * Finds all the vcms articles where groupId = &#63; and language = &#63; and status = &#63;.
	 *
	 * @param groupId the group id to search with
	 * @param language the language to search with
	 * @param status the status to search with
	 * @return the matching vcms articles
	 * @throws SystemException if a system exception occurred
	 */
	public List<VcmsArticle> findByL_S(long groupId, String language,
		long status) throws SystemException {
		return findByL_S(groupId, language, status, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Finds a range of all the vcms articles where groupId = &#63; and language = &#63; and status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param groupId the group id to search with
	 * @param language the language to search with
	 * @param status the status to search with
	 * @param start the lower bound of the range of vcms articles to return
	 * @param end the upper bound of the range of vcms articles to return (not inclusive)
	 * @return the range of matching vcms articles
	 * @throws SystemException if a system exception occurred
	 */
	public List<VcmsArticle> findByL_S(long groupId, String language,
		long status, int start, int end) throws SystemException {
		return findByL_S(groupId, language, status, start, end, null);
	}

	/**
	 * Finds an ordered range of all the vcms articles where groupId = &#63; and language = &#63; and status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param groupId the group id to search with
	 * @param language the language to search with
	 * @param status the status to search with
	 * @param start the lower bound of the range of vcms articles to return
	 * @param end the upper bound of the range of vcms articles to return (not inclusive)
	 * @param orderByComparator the comparator to order the results by
	 * @return the ordered range of matching vcms articles
	 * @throws SystemException if a system exception occurred
	 */
	public List<VcmsArticle> findByL_S(long groupId, String language,
		long status, int start, int end, OrderByComparator orderByComparator)
		throws SystemException {
		Object[] finderArgs = new Object[] {
				groupId, language, status,
				
				String.valueOf(start), String.valueOf(end),
				String.valueOf(orderByComparator)
			};

		List<VcmsArticle> list = (List<VcmsArticle>)FinderCacheUtil.getResult(FINDER_PATH_FIND_BY_L_S,
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

			query.append(_SQL_SELECT_VCMSARTICLE_WHERE);

			query.append(_FINDER_COLUMN_L_S_GROUPID_2);

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

			query.append(_FINDER_COLUMN_L_S_STATUS_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}

			else {
				query.append(VcmsArticleModelImpl.ORDER_BY_JPQL);
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

				qPos.add(status);

				list = (List<VcmsArticle>)QueryUtil.list(q, getDialect(),
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
	 * Finds the first vcms article in the ordered set where groupId = &#63; and language = &#63; and status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param groupId the group id to search with
	 * @param language the language to search with
	 * @param status the status to search with
	 * @param orderByComparator the comparator to order the set by
	 * @return the first matching vcms article
	 * @throws com.vportal.portlet.vcms.NoSuchVcmsArticleException if a matching vcms article could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public VcmsArticle findByL_S_First(long groupId, String language,
		long status, OrderByComparator orderByComparator)
		throws NoSuchVcmsArticleException, SystemException {
		List<VcmsArticle> list = findByL_S(groupId, language, status, 0, 1,
				orderByComparator);

		if (list.isEmpty()) {
			StringBundler msg = new StringBundler(8);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("groupId=");
			msg.append(groupId);

			msg.append(", language=");
			msg.append(language);

			msg.append(", status=");
			msg.append(status);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			throw new NoSuchVcmsArticleException(msg.toString());
		}
		else {
			return list.get(0);
		}
	}

	/**
	 * Finds the last vcms article in the ordered set where groupId = &#63; and language = &#63; and status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param groupId the group id to search with
	 * @param language the language to search with
	 * @param status the status to search with
	 * @param orderByComparator the comparator to order the set by
	 * @return the last matching vcms article
	 * @throws com.vportal.portlet.vcms.NoSuchVcmsArticleException if a matching vcms article could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public VcmsArticle findByL_S_Last(long groupId, String language,
		long status, OrderByComparator orderByComparator)
		throws NoSuchVcmsArticleException, SystemException {
		int count = countByL_S(groupId, language, status);

		List<VcmsArticle> list = findByL_S(groupId, language, status,
				count - 1, count, orderByComparator);

		if (list.isEmpty()) {
			StringBundler msg = new StringBundler(8);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("groupId=");
			msg.append(groupId);

			msg.append(", language=");
			msg.append(language);

			msg.append(", status=");
			msg.append(status);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			throw new NoSuchVcmsArticleException(msg.toString());
		}
		else {
			return list.get(0);
		}
	}

	/**
	 * Finds the vcms articles before and after the current vcms article in the ordered set where groupId = &#63; and language = &#63; and status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param articleId the primary key of the current vcms article
	 * @param groupId the group id to search with
	 * @param language the language to search with
	 * @param status the status to search with
	 * @param orderByComparator the comparator to order the set by
	 * @return the previous, current, and next vcms article
	 * @throws com.vportal.portlet.vcms.NoSuchVcmsArticleException if a vcms article with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public VcmsArticle[] findByL_S_PrevAndNext(String articleId, long groupId,
		String language, long status, OrderByComparator orderByComparator)
		throws NoSuchVcmsArticleException, SystemException {
		VcmsArticle vcmsArticle = findByPrimaryKey(articleId);

		Session session = null;

		try {
			session = openSession();

			VcmsArticle[] array = new VcmsArticleImpl[3];

			array[0] = getByL_S_PrevAndNext(session, vcmsArticle, groupId,
					language, status, orderByComparator, true);

			array[1] = vcmsArticle;

			array[2] = getByL_S_PrevAndNext(session, vcmsArticle, groupId,
					language, status, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected VcmsArticle getByL_S_PrevAndNext(Session session,
		VcmsArticle vcmsArticle, long groupId, String language, long status,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_VCMSARTICLE_WHERE);

		query.append(_FINDER_COLUMN_L_S_GROUPID_2);

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

		query.append(_FINDER_COLUMN_L_S_STATUS_2);

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
			query.append(VcmsArticleModelImpl.ORDER_BY_JPQL);
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

		qPos.add(status);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByValues(vcmsArticle);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<VcmsArticle> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Finds all the vcms articles where groupId = &#63; and language = &#63; and status = &#63; and createdByUser = &#63;.
	 *
	 * @param groupId the group id to search with
	 * @param language the language to search with
	 * @param status the status to search with
	 * @param createdByUser the created by user to search with
	 * @return the matching vcms articles
	 * @throws SystemException if a system exception occurred
	 */
	public List<VcmsArticle> findByG_L_S_U(long groupId, String language,
		long status, String createdByUser) throws SystemException {
		return findByG_L_S_U(groupId, language, status, createdByUser,
			QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Finds a range of all the vcms articles where groupId = &#63; and language = &#63; and status = &#63; and createdByUser = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param groupId the group id to search with
	 * @param language the language to search with
	 * @param status the status to search with
	 * @param createdByUser the created by user to search with
	 * @param start the lower bound of the range of vcms articles to return
	 * @param end the upper bound of the range of vcms articles to return (not inclusive)
	 * @return the range of matching vcms articles
	 * @throws SystemException if a system exception occurred
	 */
	public List<VcmsArticle> findByG_L_S_U(long groupId, String language,
		long status, String createdByUser, int start, int end)
		throws SystemException {
		return findByG_L_S_U(groupId, language, status, createdByUser, start,
			end, null);
	}

	/**
	 * Finds an ordered range of all the vcms articles where groupId = &#63; and language = &#63; and status = &#63; and createdByUser = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param groupId the group id to search with
	 * @param language the language to search with
	 * @param status the status to search with
	 * @param createdByUser the created by user to search with
	 * @param start the lower bound of the range of vcms articles to return
	 * @param end the upper bound of the range of vcms articles to return (not inclusive)
	 * @param orderByComparator the comparator to order the results by
	 * @return the ordered range of matching vcms articles
	 * @throws SystemException if a system exception occurred
	 */
	public List<VcmsArticle> findByG_L_S_U(long groupId, String language,
		long status, String createdByUser, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		Object[] finderArgs = new Object[] {
				groupId, language, status, createdByUser,
				
				String.valueOf(start), String.valueOf(end),
				String.valueOf(orderByComparator)
			};

		List<VcmsArticle> list = (List<VcmsArticle>)FinderCacheUtil.getResult(FINDER_PATH_FIND_BY_G_L_S_U,
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

			query.append(_SQL_SELECT_VCMSARTICLE_WHERE);

			query.append(_FINDER_COLUMN_G_L_S_U_GROUPID_2);

			if (language == null) {
				query.append(_FINDER_COLUMN_G_L_S_U_LANGUAGE_1);
			}
			else {
				if (language.equals(StringPool.BLANK)) {
					query.append(_FINDER_COLUMN_G_L_S_U_LANGUAGE_3);
				}
				else {
					query.append(_FINDER_COLUMN_G_L_S_U_LANGUAGE_2);
				}
			}

			query.append(_FINDER_COLUMN_G_L_S_U_STATUS_2);

			if (createdByUser == null) {
				query.append(_FINDER_COLUMN_G_L_S_U_CREATEDBYUSER_1);
			}
			else {
				if (createdByUser.equals(StringPool.BLANK)) {
					query.append(_FINDER_COLUMN_G_L_S_U_CREATEDBYUSER_3);
				}
				else {
					query.append(_FINDER_COLUMN_G_L_S_U_CREATEDBYUSER_2);
				}
			}

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}

			else {
				query.append(VcmsArticleModelImpl.ORDER_BY_JPQL);
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

				qPos.add(status);

				if (createdByUser != null) {
					qPos.add(createdByUser);
				}

				list = (List<VcmsArticle>)QueryUtil.list(q, getDialect(),
						start, end);
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (list == null) {
					FinderCacheUtil.removeResult(FINDER_PATH_FIND_BY_G_L_S_U,
						finderArgs);
				}
				else {
					cacheResult(list);

					FinderCacheUtil.putResult(FINDER_PATH_FIND_BY_G_L_S_U,
						finderArgs, list);
				}

				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Finds the first vcms article in the ordered set where groupId = &#63; and language = &#63; and status = &#63; and createdByUser = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param groupId the group id to search with
	 * @param language the language to search with
	 * @param status the status to search with
	 * @param createdByUser the created by user to search with
	 * @param orderByComparator the comparator to order the set by
	 * @return the first matching vcms article
	 * @throws com.vportal.portlet.vcms.NoSuchVcmsArticleException if a matching vcms article could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public VcmsArticle findByG_L_S_U_First(long groupId, String language,
		long status, String createdByUser, OrderByComparator orderByComparator)
		throws NoSuchVcmsArticleException, SystemException {
		List<VcmsArticle> list = findByG_L_S_U(groupId, language, status,
				createdByUser, 0, 1, orderByComparator);

		if (list.isEmpty()) {
			StringBundler msg = new StringBundler(10);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("groupId=");
			msg.append(groupId);

			msg.append(", language=");
			msg.append(language);

			msg.append(", status=");
			msg.append(status);

			msg.append(", createdByUser=");
			msg.append(createdByUser);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			throw new NoSuchVcmsArticleException(msg.toString());
		}
		else {
			return list.get(0);
		}
	}

	/**
	 * Finds the last vcms article in the ordered set where groupId = &#63; and language = &#63; and status = &#63; and createdByUser = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param groupId the group id to search with
	 * @param language the language to search with
	 * @param status the status to search with
	 * @param createdByUser the created by user to search with
	 * @param orderByComparator the comparator to order the set by
	 * @return the last matching vcms article
	 * @throws com.vportal.portlet.vcms.NoSuchVcmsArticleException if a matching vcms article could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public VcmsArticle findByG_L_S_U_Last(long groupId, String language,
		long status, String createdByUser, OrderByComparator orderByComparator)
		throws NoSuchVcmsArticleException, SystemException {
		int count = countByG_L_S_U(groupId, language, status, createdByUser);

		List<VcmsArticle> list = findByG_L_S_U(groupId, language, status,
				createdByUser, count - 1, count, orderByComparator);

		if (list.isEmpty()) {
			StringBundler msg = new StringBundler(10);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("groupId=");
			msg.append(groupId);

			msg.append(", language=");
			msg.append(language);

			msg.append(", status=");
			msg.append(status);

			msg.append(", createdByUser=");
			msg.append(createdByUser);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			throw new NoSuchVcmsArticleException(msg.toString());
		}
		else {
			return list.get(0);
		}
	}

	/**
	 * Finds the vcms articles before and after the current vcms article in the ordered set where groupId = &#63; and language = &#63; and status = &#63; and createdByUser = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param articleId the primary key of the current vcms article
	 * @param groupId the group id to search with
	 * @param language the language to search with
	 * @param status the status to search with
	 * @param createdByUser the created by user to search with
	 * @param orderByComparator the comparator to order the set by
	 * @return the previous, current, and next vcms article
	 * @throws com.vportal.portlet.vcms.NoSuchVcmsArticleException if a vcms article with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public VcmsArticle[] findByG_L_S_U_PrevAndNext(String articleId,
		long groupId, String language, long status, String createdByUser,
		OrderByComparator orderByComparator)
		throws NoSuchVcmsArticleException, SystemException {
		VcmsArticle vcmsArticle = findByPrimaryKey(articleId);

		Session session = null;

		try {
			session = openSession();

			VcmsArticle[] array = new VcmsArticleImpl[3];

			array[0] = getByG_L_S_U_PrevAndNext(session, vcmsArticle, groupId,
					language, status, createdByUser, orderByComparator, true);

			array[1] = vcmsArticle;

			array[2] = getByG_L_S_U_PrevAndNext(session, vcmsArticle, groupId,
					language, status, createdByUser, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected VcmsArticle getByG_L_S_U_PrevAndNext(Session session,
		VcmsArticle vcmsArticle, long groupId, String language, long status,
		String createdByUser, OrderByComparator orderByComparator,
		boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_VCMSARTICLE_WHERE);

		query.append(_FINDER_COLUMN_G_L_S_U_GROUPID_2);

		if (language == null) {
			query.append(_FINDER_COLUMN_G_L_S_U_LANGUAGE_1);
		}
		else {
			if (language.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_G_L_S_U_LANGUAGE_3);
			}
			else {
				query.append(_FINDER_COLUMN_G_L_S_U_LANGUAGE_2);
			}
		}

		query.append(_FINDER_COLUMN_G_L_S_U_STATUS_2);

		if (createdByUser == null) {
			query.append(_FINDER_COLUMN_G_L_S_U_CREATEDBYUSER_1);
		}
		else {
			if (createdByUser.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_G_L_S_U_CREATEDBYUSER_3);
			}
			else {
				query.append(_FINDER_COLUMN_G_L_S_U_CREATEDBYUSER_2);
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
			query.append(VcmsArticleModelImpl.ORDER_BY_JPQL);
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

		qPos.add(status);

		if (createdByUser != null) {
			qPos.add(createdByUser);
		}

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByValues(vcmsArticle);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<VcmsArticle> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Finds all the vcms articles where groupId = &#63; and language = &#63; and status = &#63; and sticky = &#63;.
	 *
	 * @param groupId the group id to search with
	 * @param language the language to search with
	 * @param status the status to search with
	 * @param sticky the sticky to search with
	 * @return the matching vcms articles
	 * @throws SystemException if a system exception occurred
	 */
	public List<VcmsArticle> findByL_S_S(long groupId, String language,
		long status, boolean sticky) throws SystemException {
		return findByL_S_S(groupId, language, status, sticky,
			QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Finds a range of all the vcms articles where groupId = &#63; and language = &#63; and status = &#63; and sticky = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param groupId the group id to search with
	 * @param language the language to search with
	 * @param status the status to search with
	 * @param sticky the sticky to search with
	 * @param start the lower bound of the range of vcms articles to return
	 * @param end the upper bound of the range of vcms articles to return (not inclusive)
	 * @return the range of matching vcms articles
	 * @throws SystemException if a system exception occurred
	 */
	public List<VcmsArticle> findByL_S_S(long groupId, String language,
		long status, boolean sticky, int start, int end)
		throws SystemException {
		return findByL_S_S(groupId, language, status, sticky, start, end, null);
	}

	/**
	 * Finds an ordered range of all the vcms articles where groupId = &#63; and language = &#63; and status = &#63; and sticky = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param groupId the group id to search with
	 * @param language the language to search with
	 * @param status the status to search with
	 * @param sticky the sticky to search with
	 * @param start the lower bound of the range of vcms articles to return
	 * @param end the upper bound of the range of vcms articles to return (not inclusive)
	 * @param orderByComparator the comparator to order the results by
	 * @return the ordered range of matching vcms articles
	 * @throws SystemException if a system exception occurred
	 */
	public List<VcmsArticle> findByL_S_S(long groupId, String language,
		long status, boolean sticky, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		Object[] finderArgs = new Object[] {
				groupId, language, status, sticky,
				
				String.valueOf(start), String.valueOf(end),
				String.valueOf(orderByComparator)
			};

		List<VcmsArticle> list = (List<VcmsArticle>)FinderCacheUtil.getResult(FINDER_PATH_FIND_BY_L_S_S,
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

			query.append(_SQL_SELECT_VCMSARTICLE_WHERE);

			query.append(_FINDER_COLUMN_L_S_S_GROUPID_2);

			if (language == null) {
				query.append(_FINDER_COLUMN_L_S_S_LANGUAGE_1);
			}
			else {
				if (language.equals(StringPool.BLANK)) {
					query.append(_FINDER_COLUMN_L_S_S_LANGUAGE_3);
				}
				else {
					query.append(_FINDER_COLUMN_L_S_S_LANGUAGE_2);
				}
			}

			query.append(_FINDER_COLUMN_L_S_S_STATUS_2);

			query.append(_FINDER_COLUMN_L_S_S_STICKY_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}

			else {
				query.append(VcmsArticleModelImpl.ORDER_BY_JPQL);
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

				qPos.add(status);

				qPos.add(sticky);

				list = (List<VcmsArticle>)QueryUtil.list(q, getDialect(),
						start, end);
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (list == null) {
					FinderCacheUtil.removeResult(FINDER_PATH_FIND_BY_L_S_S,
						finderArgs);
				}
				else {
					cacheResult(list);

					FinderCacheUtil.putResult(FINDER_PATH_FIND_BY_L_S_S,
						finderArgs, list);
				}

				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Finds the first vcms article in the ordered set where groupId = &#63; and language = &#63; and status = &#63; and sticky = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param groupId the group id to search with
	 * @param language the language to search with
	 * @param status the status to search with
	 * @param sticky the sticky to search with
	 * @param orderByComparator the comparator to order the set by
	 * @return the first matching vcms article
	 * @throws com.vportal.portlet.vcms.NoSuchVcmsArticleException if a matching vcms article could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public VcmsArticle findByL_S_S_First(long groupId, String language,
		long status, boolean sticky, OrderByComparator orderByComparator)
		throws NoSuchVcmsArticleException, SystemException {
		List<VcmsArticle> list = findByL_S_S(groupId, language, status, sticky,
				0, 1, orderByComparator);

		if (list.isEmpty()) {
			StringBundler msg = new StringBundler(10);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("groupId=");
			msg.append(groupId);

			msg.append(", language=");
			msg.append(language);

			msg.append(", status=");
			msg.append(status);

			msg.append(", sticky=");
			msg.append(sticky);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			throw new NoSuchVcmsArticleException(msg.toString());
		}
		else {
			return list.get(0);
		}
	}

	/**
	 * Finds the last vcms article in the ordered set where groupId = &#63; and language = &#63; and status = &#63; and sticky = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param groupId the group id to search with
	 * @param language the language to search with
	 * @param status the status to search with
	 * @param sticky the sticky to search with
	 * @param orderByComparator the comparator to order the set by
	 * @return the last matching vcms article
	 * @throws com.vportal.portlet.vcms.NoSuchVcmsArticleException if a matching vcms article could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public VcmsArticle findByL_S_S_Last(long groupId, String language,
		long status, boolean sticky, OrderByComparator orderByComparator)
		throws NoSuchVcmsArticleException, SystemException {
		int count = countByL_S_S(groupId, language, status, sticky);

		List<VcmsArticle> list = findByL_S_S(groupId, language, status, sticky,
				count - 1, count, orderByComparator);

		if (list.isEmpty()) {
			StringBundler msg = new StringBundler(10);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("groupId=");
			msg.append(groupId);

			msg.append(", language=");
			msg.append(language);

			msg.append(", status=");
			msg.append(status);

			msg.append(", sticky=");
			msg.append(sticky);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			throw new NoSuchVcmsArticleException(msg.toString());
		}
		else {
			return list.get(0);
		}
	}

	/**
	 * Finds the vcms articles before and after the current vcms article in the ordered set where groupId = &#63; and language = &#63; and status = &#63; and sticky = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param articleId the primary key of the current vcms article
	 * @param groupId the group id to search with
	 * @param language the language to search with
	 * @param status the status to search with
	 * @param sticky the sticky to search with
	 * @param orderByComparator the comparator to order the set by
	 * @return the previous, current, and next vcms article
	 * @throws com.vportal.portlet.vcms.NoSuchVcmsArticleException if a vcms article with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public VcmsArticle[] findByL_S_S_PrevAndNext(String articleId,
		long groupId, String language, long status, boolean sticky,
		OrderByComparator orderByComparator)
		throws NoSuchVcmsArticleException, SystemException {
		VcmsArticle vcmsArticle = findByPrimaryKey(articleId);

		Session session = null;

		try {
			session = openSession();

			VcmsArticle[] array = new VcmsArticleImpl[3];

			array[0] = getByL_S_S_PrevAndNext(session, vcmsArticle, groupId,
					language, status, sticky, orderByComparator, true);

			array[1] = vcmsArticle;

			array[2] = getByL_S_S_PrevAndNext(session, vcmsArticle, groupId,
					language, status, sticky, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected VcmsArticle getByL_S_S_PrevAndNext(Session session,
		VcmsArticle vcmsArticle, long groupId, String language, long status,
		boolean sticky, OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_VCMSARTICLE_WHERE);

		query.append(_FINDER_COLUMN_L_S_S_GROUPID_2);

		if (language == null) {
			query.append(_FINDER_COLUMN_L_S_S_LANGUAGE_1);
		}
		else {
			if (language.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_L_S_S_LANGUAGE_3);
			}
			else {
				query.append(_FINDER_COLUMN_L_S_S_LANGUAGE_2);
			}
		}

		query.append(_FINDER_COLUMN_L_S_S_STATUS_2);

		query.append(_FINDER_COLUMN_L_S_S_STICKY_2);

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
			query.append(VcmsArticleModelImpl.ORDER_BY_JPQL);
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

		qPos.add(status);

		qPos.add(sticky);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByValues(vcmsArticle);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<VcmsArticle> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Finds all the vcms articles where groupId = &#63; and createdByUser = &#63; and language = &#63;.
	 *
	 * @param groupId the group id to search with
	 * @param createdByUser the created by user to search with
	 * @param language the language to search with
	 * @return the matching vcms articles
	 * @throws SystemException if a system exception occurred
	 */
	public List<VcmsArticle> findByU_L(long groupId, String createdByUser,
		String language) throws SystemException {
		return findByU_L(groupId, createdByUser, language, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Finds a range of all the vcms articles where groupId = &#63; and createdByUser = &#63; and language = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param groupId the group id to search with
	 * @param createdByUser the created by user to search with
	 * @param language the language to search with
	 * @param start the lower bound of the range of vcms articles to return
	 * @param end the upper bound of the range of vcms articles to return (not inclusive)
	 * @return the range of matching vcms articles
	 * @throws SystemException if a system exception occurred
	 */
	public List<VcmsArticle> findByU_L(long groupId, String createdByUser,
		String language, int start, int end) throws SystemException {
		return findByU_L(groupId, createdByUser, language, start, end, null);
	}

	/**
	 * Finds an ordered range of all the vcms articles where groupId = &#63; and createdByUser = &#63; and language = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param groupId the group id to search with
	 * @param createdByUser the created by user to search with
	 * @param language the language to search with
	 * @param start the lower bound of the range of vcms articles to return
	 * @param end the upper bound of the range of vcms articles to return (not inclusive)
	 * @param orderByComparator the comparator to order the results by
	 * @return the ordered range of matching vcms articles
	 * @throws SystemException if a system exception occurred
	 */
	public List<VcmsArticle> findByU_L(long groupId, String createdByUser,
		String language, int start, int end, OrderByComparator orderByComparator)
		throws SystemException {
		Object[] finderArgs = new Object[] {
				groupId, createdByUser, language,
				
				String.valueOf(start), String.valueOf(end),
				String.valueOf(orderByComparator)
			};

		List<VcmsArticle> list = (List<VcmsArticle>)FinderCacheUtil.getResult(FINDER_PATH_FIND_BY_U_L,
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

			query.append(_SQL_SELECT_VCMSARTICLE_WHERE);

			query.append(_FINDER_COLUMN_U_L_GROUPID_2);

			if (createdByUser == null) {
				query.append(_FINDER_COLUMN_U_L_CREATEDBYUSER_1);
			}
			else {
				if (createdByUser.equals(StringPool.BLANK)) {
					query.append(_FINDER_COLUMN_U_L_CREATEDBYUSER_3);
				}
				else {
					query.append(_FINDER_COLUMN_U_L_CREATEDBYUSER_2);
				}
			}

			if (language == null) {
				query.append(_FINDER_COLUMN_U_L_LANGUAGE_1);
			}
			else {
				if (language.equals(StringPool.BLANK)) {
					query.append(_FINDER_COLUMN_U_L_LANGUAGE_3);
				}
				else {
					query.append(_FINDER_COLUMN_U_L_LANGUAGE_2);
				}
			}

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}

			else {
				query.append(VcmsArticleModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(groupId);

				if (createdByUser != null) {
					qPos.add(createdByUser);
				}

				if (language != null) {
					qPos.add(language);
				}

				list = (List<VcmsArticle>)QueryUtil.list(q, getDialect(),
						start, end);
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (list == null) {
					FinderCacheUtil.removeResult(FINDER_PATH_FIND_BY_U_L,
						finderArgs);
				}
				else {
					cacheResult(list);

					FinderCacheUtil.putResult(FINDER_PATH_FIND_BY_U_L,
						finderArgs, list);
				}

				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Finds the first vcms article in the ordered set where groupId = &#63; and createdByUser = &#63; and language = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param groupId the group id to search with
	 * @param createdByUser the created by user to search with
	 * @param language the language to search with
	 * @param orderByComparator the comparator to order the set by
	 * @return the first matching vcms article
	 * @throws com.vportal.portlet.vcms.NoSuchVcmsArticleException if a matching vcms article could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public VcmsArticle findByU_L_First(long groupId, String createdByUser,
		String language, OrderByComparator orderByComparator)
		throws NoSuchVcmsArticleException, SystemException {
		List<VcmsArticle> list = findByU_L(groupId, createdByUser, language, 0,
				1, orderByComparator);

		if (list.isEmpty()) {
			StringBundler msg = new StringBundler(8);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("groupId=");
			msg.append(groupId);

			msg.append(", createdByUser=");
			msg.append(createdByUser);

			msg.append(", language=");
			msg.append(language);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			throw new NoSuchVcmsArticleException(msg.toString());
		}
		else {
			return list.get(0);
		}
	}

	/**
	 * Finds the last vcms article in the ordered set where groupId = &#63; and createdByUser = &#63; and language = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param groupId the group id to search with
	 * @param createdByUser the created by user to search with
	 * @param language the language to search with
	 * @param orderByComparator the comparator to order the set by
	 * @return the last matching vcms article
	 * @throws com.vportal.portlet.vcms.NoSuchVcmsArticleException if a matching vcms article could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public VcmsArticle findByU_L_Last(long groupId, String createdByUser,
		String language, OrderByComparator orderByComparator)
		throws NoSuchVcmsArticleException, SystemException {
		int count = countByU_L(groupId, createdByUser, language);

		List<VcmsArticle> list = findByU_L(groupId, createdByUser, language,
				count - 1, count, orderByComparator);

		if (list.isEmpty()) {
			StringBundler msg = new StringBundler(8);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("groupId=");
			msg.append(groupId);

			msg.append(", createdByUser=");
			msg.append(createdByUser);

			msg.append(", language=");
			msg.append(language);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			throw new NoSuchVcmsArticleException(msg.toString());
		}
		else {
			return list.get(0);
		}
	}

	/**
	 * Finds the vcms articles before and after the current vcms article in the ordered set where groupId = &#63; and createdByUser = &#63; and language = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param articleId the primary key of the current vcms article
	 * @param groupId the group id to search with
	 * @param createdByUser the created by user to search with
	 * @param language the language to search with
	 * @param orderByComparator the comparator to order the set by
	 * @return the previous, current, and next vcms article
	 * @throws com.vportal.portlet.vcms.NoSuchVcmsArticleException if a vcms article with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public VcmsArticle[] findByU_L_PrevAndNext(String articleId, long groupId,
		String createdByUser, String language,
		OrderByComparator orderByComparator)
		throws NoSuchVcmsArticleException, SystemException {
		VcmsArticle vcmsArticle = findByPrimaryKey(articleId);

		Session session = null;

		try {
			session = openSession();

			VcmsArticle[] array = new VcmsArticleImpl[3];

			array[0] = getByU_L_PrevAndNext(session, vcmsArticle, groupId,
					createdByUser, language, orderByComparator, true);

			array[1] = vcmsArticle;

			array[2] = getByU_L_PrevAndNext(session, vcmsArticle, groupId,
					createdByUser, language, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected VcmsArticle getByU_L_PrevAndNext(Session session,
		VcmsArticle vcmsArticle, long groupId, String createdByUser,
		String language, OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_VCMSARTICLE_WHERE);

		query.append(_FINDER_COLUMN_U_L_GROUPID_2);

		if (createdByUser == null) {
			query.append(_FINDER_COLUMN_U_L_CREATEDBYUSER_1);
		}
		else {
			if (createdByUser.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_U_L_CREATEDBYUSER_3);
			}
			else {
				query.append(_FINDER_COLUMN_U_L_CREATEDBYUSER_2);
			}
		}

		if (language == null) {
			query.append(_FINDER_COLUMN_U_L_LANGUAGE_1);
		}
		else {
			if (language.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_U_L_LANGUAGE_3);
			}
			else {
				query.append(_FINDER_COLUMN_U_L_LANGUAGE_2);
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
			query.append(VcmsArticleModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(groupId);

		if (createdByUser != null) {
			qPos.add(createdByUser);
		}

		if (language != null) {
			qPos.add(language);
		}

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByValues(vcmsArticle);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<VcmsArticle> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Finds all the vcms articles where groupId = &#63; and createdByUser = &#63; and language = &#63; and status = &#63;.
	 *
	 * @param groupId the group id to search with
	 * @param createdByUser the created by user to search with
	 * @param language the language to search with
	 * @param status the status to search with
	 * @return the matching vcms articles
	 * @throws SystemException if a system exception occurred
	 */
	public List<VcmsArticle> findByU_L_S(long groupId, String createdByUser,
		String language, long status) throws SystemException {
		return findByU_L_S(groupId, createdByUser, language, status,
			QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Finds a range of all the vcms articles where groupId = &#63; and createdByUser = &#63; and language = &#63; and status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param groupId the group id to search with
	 * @param createdByUser the created by user to search with
	 * @param language the language to search with
	 * @param status the status to search with
	 * @param start the lower bound of the range of vcms articles to return
	 * @param end the upper bound of the range of vcms articles to return (not inclusive)
	 * @return the range of matching vcms articles
	 * @throws SystemException if a system exception occurred
	 */
	public List<VcmsArticle> findByU_L_S(long groupId, String createdByUser,
		String language, long status, int start, int end)
		throws SystemException {
		return findByU_L_S(groupId, createdByUser, language, status, start,
			end, null);
	}

	/**
	 * Finds an ordered range of all the vcms articles where groupId = &#63; and createdByUser = &#63; and language = &#63; and status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param groupId the group id to search with
	 * @param createdByUser the created by user to search with
	 * @param language the language to search with
	 * @param status the status to search with
	 * @param start the lower bound of the range of vcms articles to return
	 * @param end the upper bound of the range of vcms articles to return (not inclusive)
	 * @param orderByComparator the comparator to order the results by
	 * @return the ordered range of matching vcms articles
	 * @throws SystemException if a system exception occurred
	 */
	public List<VcmsArticle> findByU_L_S(long groupId, String createdByUser,
		String language, long status, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		Object[] finderArgs = new Object[] {
				groupId, createdByUser, language, status,
				
				String.valueOf(start), String.valueOf(end),
				String.valueOf(orderByComparator)
			};

		List<VcmsArticle> list = (List<VcmsArticle>)FinderCacheUtil.getResult(FINDER_PATH_FIND_BY_U_L_S,
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

			query.append(_SQL_SELECT_VCMSARTICLE_WHERE);

			query.append(_FINDER_COLUMN_U_L_S_GROUPID_2);

			if (createdByUser == null) {
				query.append(_FINDER_COLUMN_U_L_S_CREATEDBYUSER_1);
			}
			else {
				if (createdByUser.equals(StringPool.BLANK)) {
					query.append(_FINDER_COLUMN_U_L_S_CREATEDBYUSER_3);
				}
				else {
					query.append(_FINDER_COLUMN_U_L_S_CREATEDBYUSER_2);
				}
			}

			if (language == null) {
				query.append(_FINDER_COLUMN_U_L_S_LANGUAGE_1);
			}
			else {
				if (language.equals(StringPool.BLANK)) {
					query.append(_FINDER_COLUMN_U_L_S_LANGUAGE_3);
				}
				else {
					query.append(_FINDER_COLUMN_U_L_S_LANGUAGE_2);
				}
			}

			query.append(_FINDER_COLUMN_U_L_S_STATUS_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}

			else {
				query.append(VcmsArticleModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(groupId);

				if (createdByUser != null) {
					qPos.add(createdByUser);
				}

				if (language != null) {
					qPos.add(language);
				}

				qPos.add(status);

				list = (List<VcmsArticle>)QueryUtil.list(q, getDialect(),
						start, end);
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (list == null) {
					FinderCacheUtil.removeResult(FINDER_PATH_FIND_BY_U_L_S,
						finderArgs);
				}
				else {
					cacheResult(list);

					FinderCacheUtil.putResult(FINDER_PATH_FIND_BY_U_L_S,
						finderArgs, list);
				}

				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Finds the first vcms article in the ordered set where groupId = &#63; and createdByUser = &#63; and language = &#63; and status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param groupId the group id to search with
	 * @param createdByUser the created by user to search with
	 * @param language the language to search with
	 * @param status the status to search with
	 * @param orderByComparator the comparator to order the set by
	 * @return the first matching vcms article
	 * @throws com.vportal.portlet.vcms.NoSuchVcmsArticleException if a matching vcms article could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public VcmsArticle findByU_L_S_First(long groupId, String createdByUser,
		String language, long status, OrderByComparator orderByComparator)
		throws NoSuchVcmsArticleException, SystemException {
		List<VcmsArticle> list = findByU_L_S(groupId, createdByUser, language,
				status, 0, 1, orderByComparator);

		if (list.isEmpty()) {
			StringBundler msg = new StringBundler(10);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("groupId=");
			msg.append(groupId);

			msg.append(", createdByUser=");
			msg.append(createdByUser);

			msg.append(", language=");
			msg.append(language);

			msg.append(", status=");
			msg.append(status);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			throw new NoSuchVcmsArticleException(msg.toString());
		}
		else {
			return list.get(0);
		}
	}

	/**
	 * Finds the last vcms article in the ordered set where groupId = &#63; and createdByUser = &#63; and language = &#63; and status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param groupId the group id to search with
	 * @param createdByUser the created by user to search with
	 * @param language the language to search with
	 * @param status the status to search with
	 * @param orderByComparator the comparator to order the set by
	 * @return the last matching vcms article
	 * @throws com.vportal.portlet.vcms.NoSuchVcmsArticleException if a matching vcms article could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public VcmsArticle findByU_L_S_Last(long groupId, String createdByUser,
		String language, long status, OrderByComparator orderByComparator)
		throws NoSuchVcmsArticleException, SystemException {
		int count = countByU_L_S(groupId, createdByUser, language, status);

		List<VcmsArticle> list = findByU_L_S(groupId, createdByUser, language,
				status, count - 1, count, orderByComparator);

		if (list.isEmpty()) {
			StringBundler msg = new StringBundler(10);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("groupId=");
			msg.append(groupId);

			msg.append(", createdByUser=");
			msg.append(createdByUser);

			msg.append(", language=");
			msg.append(language);

			msg.append(", status=");
			msg.append(status);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			throw new NoSuchVcmsArticleException(msg.toString());
		}
		else {
			return list.get(0);
		}
	}

	/**
	 * Finds the vcms articles before and after the current vcms article in the ordered set where groupId = &#63; and createdByUser = &#63; and language = &#63; and status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param articleId the primary key of the current vcms article
	 * @param groupId the group id to search with
	 * @param createdByUser the created by user to search with
	 * @param language the language to search with
	 * @param status the status to search with
	 * @param orderByComparator the comparator to order the set by
	 * @return the previous, current, and next vcms article
	 * @throws com.vportal.portlet.vcms.NoSuchVcmsArticleException if a vcms article with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public VcmsArticle[] findByU_L_S_PrevAndNext(String articleId,
		long groupId, String createdByUser, String language, long status,
		OrderByComparator orderByComparator)
		throws NoSuchVcmsArticleException, SystemException {
		VcmsArticle vcmsArticle = findByPrimaryKey(articleId);

		Session session = null;

		try {
			session = openSession();

			VcmsArticle[] array = new VcmsArticleImpl[3];

			array[0] = getByU_L_S_PrevAndNext(session, vcmsArticle, groupId,
					createdByUser, language, status, orderByComparator, true);

			array[1] = vcmsArticle;

			array[2] = getByU_L_S_PrevAndNext(session, vcmsArticle, groupId,
					createdByUser, language, status, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected VcmsArticle getByU_L_S_PrevAndNext(Session session,
		VcmsArticle vcmsArticle, long groupId, String createdByUser,
		String language, long status, OrderByComparator orderByComparator,
		boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_VCMSARTICLE_WHERE);

		query.append(_FINDER_COLUMN_U_L_S_GROUPID_2);

		if (createdByUser == null) {
			query.append(_FINDER_COLUMN_U_L_S_CREATEDBYUSER_1);
		}
		else {
			if (createdByUser.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_U_L_S_CREATEDBYUSER_3);
			}
			else {
				query.append(_FINDER_COLUMN_U_L_S_CREATEDBYUSER_2);
			}
		}

		if (language == null) {
			query.append(_FINDER_COLUMN_U_L_S_LANGUAGE_1);
		}
		else {
			if (language.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_U_L_S_LANGUAGE_3);
			}
			else {
				query.append(_FINDER_COLUMN_U_L_S_LANGUAGE_2);
			}
		}

		query.append(_FINDER_COLUMN_U_L_S_STATUS_2);

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
			query.append(VcmsArticleModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(groupId);

		if (createdByUser != null) {
			qPos.add(createdByUser);
		}

		if (language != null) {
			qPos.add(language);
		}

		qPos.add(status);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByValues(vcmsArticle);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<VcmsArticle> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Finds all the vcms articles where groupId = &#63; and language = &#63; and status = &#63; and discussible = &#63;.
	 *
	 * @param groupId the group id to search with
	 * @param language the language to search with
	 * @param status the status to search with
	 * @param discussible the discussible to search with
	 * @return the matching vcms articles
	 * @throws SystemException if a system exception occurred
	 */
	public List<VcmsArticle> findByP_L_S_D(long groupId, String language,
		long status, boolean discussible) throws SystemException {
		return findByP_L_S_D(groupId, language, status, discussible,
			QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Finds a range of all the vcms articles where groupId = &#63; and language = &#63; and status = &#63; and discussible = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param groupId the group id to search with
	 * @param language the language to search with
	 * @param status the status to search with
	 * @param discussible the discussible to search with
	 * @param start the lower bound of the range of vcms articles to return
	 * @param end the upper bound of the range of vcms articles to return (not inclusive)
	 * @return the range of matching vcms articles
	 * @throws SystemException if a system exception occurred
	 */
	public List<VcmsArticle> findByP_L_S_D(long groupId, String language,
		long status, boolean discussible, int start, int end)
		throws SystemException {
		return findByP_L_S_D(groupId, language, status, discussible, start,
			end, null);
	}

	/**
	 * Finds an ordered range of all the vcms articles where groupId = &#63; and language = &#63; and status = &#63; and discussible = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param groupId the group id to search with
	 * @param language the language to search with
	 * @param status the status to search with
	 * @param discussible the discussible to search with
	 * @param start the lower bound of the range of vcms articles to return
	 * @param end the upper bound of the range of vcms articles to return (not inclusive)
	 * @param orderByComparator the comparator to order the results by
	 * @return the ordered range of matching vcms articles
	 * @throws SystemException if a system exception occurred
	 */
	public List<VcmsArticle> findByP_L_S_D(long groupId, String language,
		long status, boolean discussible, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		Object[] finderArgs = new Object[] {
				groupId, language, status, discussible,
				
				String.valueOf(start), String.valueOf(end),
				String.valueOf(orderByComparator)
			};

		List<VcmsArticle> list = (List<VcmsArticle>)FinderCacheUtil.getResult(FINDER_PATH_FIND_BY_P_L_S_D,
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

			query.append(_SQL_SELECT_VCMSARTICLE_WHERE);

			query.append(_FINDER_COLUMN_P_L_S_D_GROUPID_2);

			if (language == null) {
				query.append(_FINDER_COLUMN_P_L_S_D_LANGUAGE_1);
			}
			else {
				if (language.equals(StringPool.BLANK)) {
					query.append(_FINDER_COLUMN_P_L_S_D_LANGUAGE_3);
				}
				else {
					query.append(_FINDER_COLUMN_P_L_S_D_LANGUAGE_2);
				}
			}

			query.append(_FINDER_COLUMN_P_L_S_D_STATUS_2);

			query.append(_FINDER_COLUMN_P_L_S_D_DISCUSSIBLE_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}

			else {
				query.append(VcmsArticleModelImpl.ORDER_BY_JPQL);
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

				qPos.add(status);

				qPos.add(discussible);

				list = (List<VcmsArticle>)QueryUtil.list(q, getDialect(),
						start, end);
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (list == null) {
					FinderCacheUtil.removeResult(FINDER_PATH_FIND_BY_P_L_S_D,
						finderArgs);
				}
				else {
					cacheResult(list);

					FinderCacheUtil.putResult(FINDER_PATH_FIND_BY_P_L_S_D,
						finderArgs, list);
				}

				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Finds the first vcms article in the ordered set where groupId = &#63; and language = &#63; and status = &#63; and discussible = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param groupId the group id to search with
	 * @param language the language to search with
	 * @param status the status to search with
	 * @param discussible the discussible to search with
	 * @param orderByComparator the comparator to order the set by
	 * @return the first matching vcms article
	 * @throws com.vportal.portlet.vcms.NoSuchVcmsArticleException if a matching vcms article could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public VcmsArticle findByP_L_S_D_First(long groupId, String language,
		long status, boolean discussible, OrderByComparator orderByComparator)
		throws NoSuchVcmsArticleException, SystemException {
		List<VcmsArticle> list = findByP_L_S_D(groupId, language, status,
				discussible, 0, 1, orderByComparator);

		if (list.isEmpty()) {
			StringBundler msg = new StringBundler(10);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("groupId=");
			msg.append(groupId);

			msg.append(", language=");
			msg.append(language);

			msg.append(", status=");
			msg.append(status);

			msg.append(", discussible=");
			msg.append(discussible);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			throw new NoSuchVcmsArticleException(msg.toString());
		}
		else {
			return list.get(0);
		}
	}

	/**
	 * Finds the last vcms article in the ordered set where groupId = &#63; and language = &#63; and status = &#63; and discussible = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param groupId the group id to search with
	 * @param language the language to search with
	 * @param status the status to search with
	 * @param discussible the discussible to search with
	 * @param orderByComparator the comparator to order the set by
	 * @return the last matching vcms article
	 * @throws com.vportal.portlet.vcms.NoSuchVcmsArticleException if a matching vcms article could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public VcmsArticle findByP_L_S_D_Last(long groupId, String language,
		long status, boolean discussible, OrderByComparator orderByComparator)
		throws NoSuchVcmsArticleException, SystemException {
		int count = countByP_L_S_D(groupId, language, status, discussible);

		List<VcmsArticle> list = findByP_L_S_D(groupId, language, status,
				discussible, count - 1, count, orderByComparator);

		if (list.isEmpty()) {
			StringBundler msg = new StringBundler(10);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("groupId=");
			msg.append(groupId);

			msg.append(", language=");
			msg.append(language);

			msg.append(", status=");
			msg.append(status);

			msg.append(", discussible=");
			msg.append(discussible);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			throw new NoSuchVcmsArticleException(msg.toString());
		}
		else {
			return list.get(0);
		}
	}

	/**
	 * Finds the vcms articles before and after the current vcms article in the ordered set where groupId = &#63; and language = &#63; and status = &#63; and discussible = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param articleId the primary key of the current vcms article
	 * @param groupId the group id to search with
	 * @param language the language to search with
	 * @param status the status to search with
	 * @param discussible the discussible to search with
	 * @param orderByComparator the comparator to order the set by
	 * @return the previous, current, and next vcms article
	 * @throws com.vportal.portlet.vcms.NoSuchVcmsArticleException if a vcms article with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public VcmsArticle[] findByP_L_S_D_PrevAndNext(String articleId,
		long groupId, String language, long status, boolean discussible,
		OrderByComparator orderByComparator)
		throws NoSuchVcmsArticleException, SystemException {
		VcmsArticle vcmsArticle = findByPrimaryKey(articleId);

		Session session = null;

		try {
			session = openSession();

			VcmsArticle[] array = new VcmsArticleImpl[3];

			array[0] = getByP_L_S_D_PrevAndNext(session, vcmsArticle, groupId,
					language, status, discussible, orderByComparator, true);

			array[1] = vcmsArticle;

			array[2] = getByP_L_S_D_PrevAndNext(session, vcmsArticle, groupId,
					language, status, discussible, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected VcmsArticle getByP_L_S_D_PrevAndNext(Session session,
		VcmsArticle vcmsArticle, long groupId, String language, long status,
		boolean discussible, OrderByComparator orderByComparator,
		boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_VCMSARTICLE_WHERE);

		query.append(_FINDER_COLUMN_P_L_S_D_GROUPID_2);

		if (language == null) {
			query.append(_FINDER_COLUMN_P_L_S_D_LANGUAGE_1);
		}
		else {
			if (language.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_P_L_S_D_LANGUAGE_3);
			}
			else {
				query.append(_FINDER_COLUMN_P_L_S_D_LANGUAGE_2);
			}
		}

		query.append(_FINDER_COLUMN_P_L_S_D_STATUS_2);

		query.append(_FINDER_COLUMN_P_L_S_D_DISCUSSIBLE_2);

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
			query.append(VcmsArticleModelImpl.ORDER_BY_JPQL);
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

		qPos.add(status);

		qPos.add(discussible);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByValues(vcmsArticle);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<VcmsArticle> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Finds all the vcms articles where status = &#63;.
	 *
	 * @param status the status to search with
	 * @return the matching vcms articles
	 * @throws SystemException if a system exception occurred
	 */
	public List<VcmsArticle> findByStatus(long status)
		throws SystemException {
		return findByStatus(status, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Finds a range of all the vcms articles where status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param status the status to search with
	 * @param start the lower bound of the range of vcms articles to return
	 * @param end the upper bound of the range of vcms articles to return (not inclusive)
	 * @return the range of matching vcms articles
	 * @throws SystemException if a system exception occurred
	 */
	public List<VcmsArticle> findByStatus(long status, int start, int end)
		throws SystemException {
		return findByStatus(status, start, end, null);
	}

	/**
	 * Finds an ordered range of all the vcms articles where status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param status the status to search with
	 * @param start the lower bound of the range of vcms articles to return
	 * @param end the upper bound of the range of vcms articles to return (not inclusive)
	 * @param orderByComparator the comparator to order the results by
	 * @return the ordered range of matching vcms articles
	 * @throws SystemException if a system exception occurred
	 */
	public List<VcmsArticle> findByStatus(long status, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		Object[] finderArgs = new Object[] {
				status,
				
				String.valueOf(start), String.valueOf(end),
				String.valueOf(orderByComparator)
			};

		List<VcmsArticle> list = (List<VcmsArticle>)FinderCacheUtil.getResult(FINDER_PATH_FIND_BY_STATUS,
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

			query.append(_SQL_SELECT_VCMSARTICLE_WHERE);

			query.append(_FINDER_COLUMN_STATUS_STATUS_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}

			else {
				query.append(VcmsArticleModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(status);

				list = (List<VcmsArticle>)QueryUtil.list(q, getDialect(),
						start, end);
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
	 * Finds the first vcms article in the ordered set where status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param status the status to search with
	 * @param orderByComparator the comparator to order the set by
	 * @return the first matching vcms article
	 * @throws com.vportal.portlet.vcms.NoSuchVcmsArticleException if a matching vcms article could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public VcmsArticle findByStatus_First(long status,
		OrderByComparator orderByComparator)
		throws NoSuchVcmsArticleException, SystemException {
		List<VcmsArticle> list = findByStatus(status, 0, 1, orderByComparator);

		if (list.isEmpty()) {
			StringBundler msg = new StringBundler(4);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("status=");
			msg.append(status);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			throw new NoSuchVcmsArticleException(msg.toString());
		}
		else {
			return list.get(0);
		}
	}

	/**
	 * Finds the last vcms article in the ordered set where status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param status the status to search with
	 * @param orderByComparator the comparator to order the set by
	 * @return the last matching vcms article
	 * @throws com.vportal.portlet.vcms.NoSuchVcmsArticleException if a matching vcms article could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public VcmsArticle findByStatus_Last(long status,
		OrderByComparator orderByComparator)
		throws NoSuchVcmsArticleException, SystemException {
		int count = countByStatus(status);

		List<VcmsArticle> list = findByStatus(status, count - 1, count,
				orderByComparator);

		if (list.isEmpty()) {
			StringBundler msg = new StringBundler(4);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("status=");
			msg.append(status);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			throw new NoSuchVcmsArticleException(msg.toString());
		}
		else {
			return list.get(0);
		}
	}

	/**
	 * Finds the vcms articles before and after the current vcms article in the ordered set where status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param articleId the primary key of the current vcms article
	 * @param status the status to search with
	 * @param orderByComparator the comparator to order the set by
	 * @return the previous, current, and next vcms article
	 * @throws com.vportal.portlet.vcms.NoSuchVcmsArticleException if a vcms article with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public VcmsArticle[] findByStatus_PrevAndNext(String articleId,
		long status, OrderByComparator orderByComparator)
		throws NoSuchVcmsArticleException, SystemException {
		VcmsArticle vcmsArticle = findByPrimaryKey(articleId);

		Session session = null;

		try {
			session = openSession();

			VcmsArticle[] array = new VcmsArticleImpl[3];

			array[0] = getByStatus_PrevAndNext(session, vcmsArticle, status,
					orderByComparator, true);

			array[1] = vcmsArticle;

			array[2] = getByStatus_PrevAndNext(session, vcmsArticle, status,
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

	protected VcmsArticle getByStatus_PrevAndNext(Session session,
		VcmsArticle vcmsArticle, long status,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_VCMSARTICLE_WHERE);

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
			query.append(VcmsArticleModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(status);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByValues(vcmsArticle);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<VcmsArticle> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Finds all the vcms articles.
	 *
	 * @return the vcms articles
	 * @throws SystemException if a system exception occurred
	 */
	public List<VcmsArticle> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Finds a range of all the vcms articles.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param start the lower bound of the range of vcms articles to return
	 * @param end the upper bound of the range of vcms articles to return (not inclusive)
	 * @return the range of vcms articles
	 * @throws SystemException if a system exception occurred
	 */
	public List<VcmsArticle> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Finds an ordered range of all the vcms articles.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param start the lower bound of the range of vcms articles to return
	 * @param end the upper bound of the range of vcms articles to return (not inclusive)
	 * @param orderByComparator the comparator to order the results by
	 * @return the ordered range of vcms articles
	 * @throws SystemException if a system exception occurred
	 */
	public List<VcmsArticle> findAll(int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		Object[] finderArgs = new Object[] {
				String.valueOf(start), String.valueOf(end),
				String.valueOf(orderByComparator)
			};

		List<VcmsArticle> list = (List<VcmsArticle>)FinderCacheUtil.getResult(FINDER_PATH_FIND_ALL,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_VCMSARTICLE);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_VCMSARTICLE.concat(VcmsArticleModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (orderByComparator == null) {
					list = (List<VcmsArticle>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);
				}
				else {
					list = (List<VcmsArticle>)QueryUtil.list(q, getDialect(),
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
	 * Removes all the vcms articles where groupId = &#63; and language = &#63; and status = &#63; from the database.
	 *
	 * @param groupId the group id to search with
	 * @param language the language to search with
	 * @param status the status to search with
	 * @throws SystemException if a system exception occurred
	 */
	public void removeByL_S(long groupId, String language, long status)
		throws SystemException {
		for (VcmsArticle vcmsArticle : findByL_S(groupId, language, status)) {
			remove(vcmsArticle);
		}
	}

	/**
	 * Removes all the vcms articles where groupId = &#63; and language = &#63; and status = &#63; and createdByUser = &#63; from the database.
	 *
	 * @param groupId the group id to search with
	 * @param language the language to search with
	 * @param status the status to search with
	 * @param createdByUser the created by user to search with
	 * @throws SystemException if a system exception occurred
	 */
	public void removeByG_L_S_U(long groupId, String language, long status,
		String createdByUser) throws SystemException {
		for (VcmsArticle vcmsArticle : findByG_L_S_U(groupId, language, status,
				createdByUser)) {
			remove(vcmsArticle);
		}
	}

	/**
	 * Removes all the vcms articles where groupId = &#63; and language = &#63; and status = &#63; and sticky = &#63; from the database.
	 *
	 * @param groupId the group id to search with
	 * @param language the language to search with
	 * @param status the status to search with
	 * @param sticky the sticky to search with
	 * @throws SystemException if a system exception occurred
	 */
	public void removeByL_S_S(long groupId, String language, long status,
		boolean sticky) throws SystemException {
		for (VcmsArticle vcmsArticle : findByL_S_S(groupId, language, status,
				sticky)) {
			remove(vcmsArticle);
		}
	}

	/**
	 * Removes all the vcms articles where groupId = &#63; and createdByUser = &#63; and language = &#63; from the database.
	 *
	 * @param groupId the group id to search with
	 * @param createdByUser the created by user to search with
	 * @param language the language to search with
	 * @throws SystemException if a system exception occurred
	 */
	public void removeByU_L(long groupId, String createdByUser, String language)
		throws SystemException {
		for (VcmsArticle vcmsArticle : findByU_L(groupId, createdByUser,
				language)) {
			remove(vcmsArticle);
		}
	}

	/**
	 * Removes all the vcms articles where groupId = &#63; and createdByUser = &#63; and language = &#63; and status = &#63; from the database.
	 *
	 * @param groupId the group id to search with
	 * @param createdByUser the created by user to search with
	 * @param language the language to search with
	 * @param status the status to search with
	 * @throws SystemException if a system exception occurred
	 */
	public void removeByU_L_S(long groupId, String createdByUser,
		String language, long status) throws SystemException {
		for (VcmsArticle vcmsArticle : findByU_L_S(groupId, createdByUser,
				language, status)) {
			remove(vcmsArticle);
		}
	}

	/**
	 * Removes all the vcms articles where groupId = &#63; and language = &#63; and status = &#63; and discussible = &#63; from the database.
	 *
	 * @param groupId the group id to search with
	 * @param language the language to search with
	 * @param status the status to search with
	 * @param discussible the discussible to search with
	 * @throws SystemException if a system exception occurred
	 */
	public void removeByP_L_S_D(long groupId, String language, long status,
		boolean discussible) throws SystemException {
		for (VcmsArticle vcmsArticle : findByP_L_S_D(groupId, language, status,
				discussible)) {
			remove(vcmsArticle);
		}
	}

	/**
	 * Removes all the vcms articles where status = &#63; from the database.
	 *
	 * @param status the status to search with
	 * @throws SystemException if a system exception occurred
	 */
	public void removeByStatus(long status) throws SystemException {
		for (VcmsArticle vcmsArticle : findByStatus(status)) {
			remove(vcmsArticle);
		}
	}

	/**
	 * Removes all the vcms articles from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	public void removeAll() throws SystemException {
		for (VcmsArticle vcmsArticle : findAll()) {
			remove(vcmsArticle);
		}
	}

	/**
	 * Counts all the vcms articles where groupId = &#63; and language = &#63; and status = &#63;.
	 *
	 * @param groupId the group id to search with
	 * @param language the language to search with
	 * @param status the status to search with
	 * @return the number of matching vcms articles
	 * @throws SystemException if a system exception occurred
	 */
	public int countByL_S(long groupId, String language, long status)
		throws SystemException {
		Object[] finderArgs = new Object[] { groupId, language, status };

		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_BY_L_S,
				finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(4);

			query.append(_SQL_COUNT_VCMSARTICLE_WHERE);

			query.append(_FINDER_COLUMN_L_S_GROUPID_2);

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

			query.append(_FINDER_COLUMN_L_S_STATUS_2);

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

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_L_S, finderArgs,
					count);

				closeSession(session);
			}
		}

		return count.intValue();
	}

	/**
	 * Counts all the vcms articles where groupId = &#63; and language = &#63; and status = &#63; and createdByUser = &#63;.
	 *
	 * @param groupId the group id to search with
	 * @param language the language to search with
	 * @param status the status to search with
	 * @param createdByUser the created by user to search with
	 * @return the number of matching vcms articles
	 * @throws SystemException if a system exception occurred
	 */
	public int countByG_L_S_U(long groupId, String language, long status,
		String createdByUser) throws SystemException {
		Object[] finderArgs = new Object[] {
				groupId, language, status, createdByUser
			};

		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_BY_G_L_S_U,
				finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(5);

			query.append(_SQL_COUNT_VCMSARTICLE_WHERE);

			query.append(_FINDER_COLUMN_G_L_S_U_GROUPID_2);

			if (language == null) {
				query.append(_FINDER_COLUMN_G_L_S_U_LANGUAGE_1);
			}
			else {
				if (language.equals(StringPool.BLANK)) {
					query.append(_FINDER_COLUMN_G_L_S_U_LANGUAGE_3);
				}
				else {
					query.append(_FINDER_COLUMN_G_L_S_U_LANGUAGE_2);
				}
			}

			query.append(_FINDER_COLUMN_G_L_S_U_STATUS_2);

			if (createdByUser == null) {
				query.append(_FINDER_COLUMN_G_L_S_U_CREATEDBYUSER_1);
			}
			else {
				if (createdByUser.equals(StringPool.BLANK)) {
					query.append(_FINDER_COLUMN_G_L_S_U_CREATEDBYUSER_3);
				}
				else {
					query.append(_FINDER_COLUMN_G_L_S_U_CREATEDBYUSER_2);
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

				qPos.add(status);

				if (createdByUser != null) {
					qPos.add(createdByUser);
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

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_G_L_S_U,
					finderArgs, count);

				closeSession(session);
			}
		}

		return count.intValue();
	}

	/**
	 * Counts all the vcms articles where groupId = &#63; and language = &#63; and status = &#63; and sticky = &#63;.
	 *
	 * @param groupId the group id to search with
	 * @param language the language to search with
	 * @param status the status to search with
	 * @param sticky the sticky to search with
	 * @return the number of matching vcms articles
	 * @throws SystemException if a system exception occurred
	 */
	public int countByL_S_S(long groupId, String language, long status,
		boolean sticky) throws SystemException {
		Object[] finderArgs = new Object[] { groupId, language, status, sticky };

		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_BY_L_S_S,
				finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(5);

			query.append(_SQL_COUNT_VCMSARTICLE_WHERE);

			query.append(_FINDER_COLUMN_L_S_S_GROUPID_2);

			if (language == null) {
				query.append(_FINDER_COLUMN_L_S_S_LANGUAGE_1);
			}
			else {
				if (language.equals(StringPool.BLANK)) {
					query.append(_FINDER_COLUMN_L_S_S_LANGUAGE_3);
				}
				else {
					query.append(_FINDER_COLUMN_L_S_S_LANGUAGE_2);
				}
			}

			query.append(_FINDER_COLUMN_L_S_S_STATUS_2);

			query.append(_FINDER_COLUMN_L_S_S_STICKY_2);

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

				qPos.add(status);

				qPos.add(sticky);

				count = (Long)q.uniqueResult();
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (count == null) {
					count = Long.valueOf(0);
				}

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_L_S_S,
					finderArgs, count);

				closeSession(session);
			}
		}

		return count.intValue();
	}

	/**
	 * Counts all the vcms articles where groupId = &#63; and createdByUser = &#63; and language = &#63;.
	 *
	 * @param groupId the group id to search with
	 * @param createdByUser the created by user to search with
	 * @param language the language to search with
	 * @return the number of matching vcms articles
	 * @throws SystemException if a system exception occurred
	 */
	public int countByU_L(long groupId, String createdByUser, String language)
		throws SystemException {
		Object[] finderArgs = new Object[] { groupId, createdByUser, language };

		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_BY_U_L,
				finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(4);

			query.append(_SQL_COUNT_VCMSARTICLE_WHERE);

			query.append(_FINDER_COLUMN_U_L_GROUPID_2);

			if (createdByUser == null) {
				query.append(_FINDER_COLUMN_U_L_CREATEDBYUSER_1);
			}
			else {
				if (createdByUser.equals(StringPool.BLANK)) {
					query.append(_FINDER_COLUMN_U_L_CREATEDBYUSER_3);
				}
				else {
					query.append(_FINDER_COLUMN_U_L_CREATEDBYUSER_2);
				}
			}

			if (language == null) {
				query.append(_FINDER_COLUMN_U_L_LANGUAGE_1);
			}
			else {
				if (language.equals(StringPool.BLANK)) {
					query.append(_FINDER_COLUMN_U_L_LANGUAGE_3);
				}
				else {
					query.append(_FINDER_COLUMN_U_L_LANGUAGE_2);
				}
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(groupId);

				if (createdByUser != null) {
					qPos.add(createdByUser);
				}

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

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_U_L, finderArgs,
					count);

				closeSession(session);
			}
		}

		return count.intValue();
	}

	/**
	 * Counts all the vcms articles where groupId = &#63; and createdByUser = &#63; and language = &#63; and status = &#63;.
	 *
	 * @param groupId the group id to search with
	 * @param createdByUser the created by user to search with
	 * @param language the language to search with
	 * @param status the status to search with
	 * @return the number of matching vcms articles
	 * @throws SystemException if a system exception occurred
	 */
	public int countByU_L_S(long groupId, String createdByUser,
		String language, long status) throws SystemException {
		Object[] finderArgs = new Object[] {
				groupId, createdByUser, language, status
			};

		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_BY_U_L_S,
				finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(5);

			query.append(_SQL_COUNT_VCMSARTICLE_WHERE);

			query.append(_FINDER_COLUMN_U_L_S_GROUPID_2);

			if (createdByUser == null) {
				query.append(_FINDER_COLUMN_U_L_S_CREATEDBYUSER_1);
			}
			else {
				if (createdByUser.equals(StringPool.BLANK)) {
					query.append(_FINDER_COLUMN_U_L_S_CREATEDBYUSER_3);
				}
				else {
					query.append(_FINDER_COLUMN_U_L_S_CREATEDBYUSER_2);
				}
			}

			if (language == null) {
				query.append(_FINDER_COLUMN_U_L_S_LANGUAGE_1);
			}
			else {
				if (language.equals(StringPool.BLANK)) {
					query.append(_FINDER_COLUMN_U_L_S_LANGUAGE_3);
				}
				else {
					query.append(_FINDER_COLUMN_U_L_S_LANGUAGE_2);
				}
			}

			query.append(_FINDER_COLUMN_U_L_S_STATUS_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(groupId);

				if (createdByUser != null) {
					qPos.add(createdByUser);
				}

				if (language != null) {
					qPos.add(language);
				}

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

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_U_L_S,
					finderArgs, count);

				closeSession(session);
			}
		}

		return count.intValue();
	}

	/**
	 * Counts all the vcms articles where groupId = &#63; and language = &#63; and status = &#63; and discussible = &#63;.
	 *
	 * @param groupId the group id to search with
	 * @param language the language to search with
	 * @param status the status to search with
	 * @param discussible the discussible to search with
	 * @return the number of matching vcms articles
	 * @throws SystemException if a system exception occurred
	 */
	public int countByP_L_S_D(long groupId, String language, long status,
		boolean discussible) throws SystemException {
		Object[] finderArgs = new Object[] {
				groupId, language, status, discussible
			};

		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_BY_P_L_S_D,
				finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(5);

			query.append(_SQL_COUNT_VCMSARTICLE_WHERE);

			query.append(_FINDER_COLUMN_P_L_S_D_GROUPID_2);

			if (language == null) {
				query.append(_FINDER_COLUMN_P_L_S_D_LANGUAGE_1);
			}
			else {
				if (language.equals(StringPool.BLANK)) {
					query.append(_FINDER_COLUMN_P_L_S_D_LANGUAGE_3);
				}
				else {
					query.append(_FINDER_COLUMN_P_L_S_D_LANGUAGE_2);
				}
			}

			query.append(_FINDER_COLUMN_P_L_S_D_STATUS_2);

			query.append(_FINDER_COLUMN_P_L_S_D_DISCUSSIBLE_2);

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

				qPos.add(status);

				qPos.add(discussible);

				count = (Long)q.uniqueResult();
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (count == null) {
					count = Long.valueOf(0);
				}

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_P_L_S_D,
					finderArgs, count);

				closeSession(session);
			}
		}

		return count.intValue();
	}

	/**
	 * Counts all the vcms articles where status = &#63;.
	 *
	 * @param status the status to search with
	 * @return the number of matching vcms articles
	 * @throws SystemException if a system exception occurred
	 */
	public int countByStatus(long status) throws SystemException {
		Object[] finderArgs = new Object[] { status };

		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_BY_STATUS,
				finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_VCMSARTICLE_WHERE);

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
	 * Counts all the vcms articles.
	 *
	 * @return the number of vcms articles
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

				Query q = session.createQuery(_SQL_COUNT_VCMSARTICLE);

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
	 * Initializes the vcms article persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.com.vportal.portlet.vcms.model.VcmsArticle")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<VcmsArticle>> listenersList = new ArrayList<ModelListener<VcmsArticle>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<VcmsArticle>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(VcmsArticleImpl.class.getName());
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
	private static final String _SQL_SELECT_VCMSARTICLE = "SELECT vcmsArticle FROM VcmsArticle vcmsArticle";
	private static final String _SQL_SELECT_VCMSARTICLE_WHERE = "SELECT vcmsArticle FROM VcmsArticle vcmsArticle WHERE ";
	private static final String _SQL_COUNT_VCMSARTICLE = "SELECT COUNT(vcmsArticle) FROM VcmsArticle vcmsArticle";
	private static final String _SQL_COUNT_VCMSARTICLE_WHERE = "SELECT COUNT(vcmsArticle) FROM VcmsArticle vcmsArticle WHERE ";
	private static final String _FINDER_COLUMN_L_S_GROUPID_2 = "vcmsArticle.groupId = ? AND ";
	private static final String _FINDER_COLUMN_L_S_LANGUAGE_1 = "vcmsArticle.language IS NULL AND ";
	private static final String _FINDER_COLUMN_L_S_LANGUAGE_2 = "vcmsArticle.language = ? AND ";
	private static final String _FINDER_COLUMN_L_S_LANGUAGE_3 = "(vcmsArticle.language IS NULL OR vcmsArticle.language = ?) AND ";
	private static final String _FINDER_COLUMN_L_S_STATUS_2 = "vcmsArticle.status = ?";
	private static final String _FINDER_COLUMN_G_L_S_U_GROUPID_2 = "vcmsArticle.groupId = ? AND ";
	private static final String _FINDER_COLUMN_G_L_S_U_LANGUAGE_1 = "vcmsArticle.language IS NULL AND ";
	private static final String _FINDER_COLUMN_G_L_S_U_LANGUAGE_2 = "vcmsArticle.language = ? AND ";
	private static final String _FINDER_COLUMN_G_L_S_U_LANGUAGE_3 = "(vcmsArticle.language IS NULL OR vcmsArticle.language = ?) AND ";
	private static final String _FINDER_COLUMN_G_L_S_U_STATUS_2 = "vcmsArticle.status = ? AND ";
	private static final String _FINDER_COLUMN_G_L_S_U_CREATEDBYUSER_1 = "vcmsArticle.createdByUser IS NULL";
	private static final String _FINDER_COLUMN_G_L_S_U_CREATEDBYUSER_2 = "vcmsArticle.createdByUser = ?";
	private static final String _FINDER_COLUMN_G_L_S_U_CREATEDBYUSER_3 = "(vcmsArticle.createdByUser IS NULL OR vcmsArticle.createdByUser = ?)";
	private static final String _FINDER_COLUMN_L_S_S_GROUPID_2 = "vcmsArticle.groupId = ? AND ";
	private static final String _FINDER_COLUMN_L_S_S_LANGUAGE_1 = "vcmsArticle.language IS NULL AND ";
	private static final String _FINDER_COLUMN_L_S_S_LANGUAGE_2 = "vcmsArticle.language = ? AND ";
	private static final String _FINDER_COLUMN_L_S_S_LANGUAGE_3 = "(vcmsArticle.language IS NULL OR vcmsArticle.language = ?) AND ";
	private static final String _FINDER_COLUMN_L_S_S_STATUS_2 = "vcmsArticle.status = ? AND ";
	private static final String _FINDER_COLUMN_L_S_S_STICKY_2 = "vcmsArticle.sticky = ?";
	private static final String _FINDER_COLUMN_U_L_GROUPID_2 = "vcmsArticle.groupId = ? AND ";
	private static final String _FINDER_COLUMN_U_L_CREATEDBYUSER_1 = "vcmsArticle.createdByUser IS NULL AND ";
	private static final String _FINDER_COLUMN_U_L_CREATEDBYUSER_2 = "vcmsArticle.createdByUser = ? AND ";
	private static final String _FINDER_COLUMN_U_L_CREATEDBYUSER_3 = "(vcmsArticle.createdByUser IS NULL OR vcmsArticle.createdByUser = ?) AND ";
	private static final String _FINDER_COLUMN_U_L_LANGUAGE_1 = "vcmsArticle.language IS NULL";
	private static final String _FINDER_COLUMN_U_L_LANGUAGE_2 = "vcmsArticle.language = ?";
	private static final String _FINDER_COLUMN_U_L_LANGUAGE_3 = "(vcmsArticle.language IS NULL OR vcmsArticle.language = ?)";
	private static final String _FINDER_COLUMN_U_L_S_GROUPID_2 = "vcmsArticle.groupId = ? AND ";
	private static final String _FINDER_COLUMN_U_L_S_CREATEDBYUSER_1 = "vcmsArticle.createdByUser IS NULL AND ";
	private static final String _FINDER_COLUMN_U_L_S_CREATEDBYUSER_2 = "vcmsArticle.createdByUser = ? AND ";
	private static final String _FINDER_COLUMN_U_L_S_CREATEDBYUSER_3 = "(vcmsArticle.createdByUser IS NULL OR vcmsArticle.createdByUser = ?) AND ";
	private static final String _FINDER_COLUMN_U_L_S_LANGUAGE_1 = "vcmsArticle.language IS NULL AND ";
	private static final String _FINDER_COLUMN_U_L_S_LANGUAGE_2 = "vcmsArticle.language = ? AND ";
	private static final String _FINDER_COLUMN_U_L_S_LANGUAGE_3 = "(vcmsArticle.language IS NULL OR vcmsArticle.language = ?) AND ";
	private static final String _FINDER_COLUMN_U_L_S_STATUS_2 = "vcmsArticle.status = ?";
	private static final String _FINDER_COLUMN_P_L_S_D_GROUPID_2 = "vcmsArticle.groupId = ? AND ";
	private static final String _FINDER_COLUMN_P_L_S_D_LANGUAGE_1 = "vcmsArticle.language IS NULL AND ";
	private static final String _FINDER_COLUMN_P_L_S_D_LANGUAGE_2 = "vcmsArticle.language = ? AND ";
	private static final String _FINDER_COLUMN_P_L_S_D_LANGUAGE_3 = "(vcmsArticle.language IS NULL OR vcmsArticle.language = ?) AND ";
	private static final String _FINDER_COLUMN_P_L_S_D_STATUS_2 = "vcmsArticle.status = ? AND ";
	private static final String _FINDER_COLUMN_P_L_S_D_DISCUSSIBLE_2 = "vcmsArticle.discussible = ?";
	private static final String _FINDER_COLUMN_STATUS_STATUS_2 = "vcmsArticle.status = ?";
	private static final String _ORDER_BY_ENTITY_ALIAS = "vcmsArticle.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No VcmsArticle exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No VcmsArticle exists with the key {";
	private static Log _log = LogFactoryUtil.getLog(VcmsArticlePersistenceImpl.class);
}