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

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.service.ServiceContext;

import com.vportal.portlet.vcms.model.VcmsArticle;

import java.util.List;

/**
 * The persistence utility for the vcms article service. This utility wraps {@link VcmsArticlePersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Never modify this class directly. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
 * </p>
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author HOAN
 * @see VcmsArticlePersistence
 * @see VcmsArticlePersistenceImpl
 * @generated
 */
public class VcmsArticleUtil {
	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#clearCache()
	 */
	public static void clearCache() {
		getPersistence().clearCache();
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#clearCache(com.liferay.portal.model.BaseModel)
	 */
	public static void clearCache(VcmsArticle vcmsArticle) {
		getPersistence().clearCache(vcmsArticle);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#countWithDynamicQuery(DynamicQuery)
	 */
	public long countWithDynamicQuery(DynamicQuery dynamicQuery)
		throws SystemException {
		return getPersistence().countWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<VcmsArticle> findWithDynamicQuery(
		DynamicQuery dynamicQuery) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<VcmsArticle> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<VcmsArticle> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#remove(com.liferay.portal.model.BaseModel)
	 */
	public static VcmsArticle remove(VcmsArticle vcmsArticle)
		throws SystemException {
		return getPersistence().remove(vcmsArticle);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, boolean)
	 */
	public static VcmsArticle update(VcmsArticle vcmsArticle, boolean merge)
		throws SystemException {
		return getPersistence().update(vcmsArticle, merge);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, boolean, ServiceContext)
	 */
	public static VcmsArticle update(VcmsArticle vcmsArticle, boolean merge,
		ServiceContext serviceContext) throws SystemException {
		return getPersistence().update(vcmsArticle, merge, serviceContext);
	}

	/**
	* Caches the vcms article in the entity cache if it is enabled.
	*
	* @param vcmsArticle the vcms article to cache
	*/
	public static void cacheResult(
		com.vportal.portlet.vcms.model.VcmsArticle vcmsArticle) {
		getPersistence().cacheResult(vcmsArticle);
	}

	/**
	* Caches the vcms articles in the entity cache if it is enabled.
	*
	* @param vcmsArticles the vcms articles to cache
	*/
	public static void cacheResult(
		java.util.List<com.vportal.portlet.vcms.model.VcmsArticle> vcmsArticles) {
		getPersistence().cacheResult(vcmsArticles);
	}

	/**
	* Creates a new vcms article with the primary key. Does not add the vcms article to the database.
	*
	* @param articleId the primary key for the new vcms article
	* @return the new vcms article
	*/
	public static com.vportal.portlet.vcms.model.VcmsArticle create(
		java.lang.String articleId) {
		return getPersistence().create(articleId);
	}

	/**
	* Removes the vcms article with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param articleId the primary key of the vcms article to remove
	* @return the vcms article that was removed
	* @throws com.vportal.portlet.vcms.NoSuchVcmsArticleException if a vcms article with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.vportal.portlet.vcms.model.VcmsArticle remove(
		java.lang.String articleId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vcms.NoSuchVcmsArticleException {
		return getPersistence().remove(articleId);
	}

	public static com.vportal.portlet.vcms.model.VcmsArticle updateImpl(
		com.vportal.portlet.vcms.model.VcmsArticle vcmsArticle, boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(vcmsArticle, merge);
	}

	/**
	* Finds the vcms article with the primary key or throws a {@link com.vportal.portlet.vcms.NoSuchVcmsArticleException} if it could not be found.
	*
	* @param articleId the primary key of the vcms article to find
	* @return the vcms article
	* @throws com.vportal.portlet.vcms.NoSuchVcmsArticleException if a vcms article with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.vportal.portlet.vcms.model.VcmsArticle findByPrimaryKey(
		java.lang.String articleId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vcms.NoSuchVcmsArticleException {
		return getPersistence().findByPrimaryKey(articleId);
	}

	/**
	* Finds the vcms article with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param articleId the primary key of the vcms article to find
	* @return the vcms article, or <code>null</code> if a vcms article with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.vportal.portlet.vcms.model.VcmsArticle fetchByPrimaryKey(
		java.lang.String articleId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(articleId);
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
	public static java.util.List<com.vportal.portlet.vcms.model.VcmsArticle> findByL_S(
		long groupId, java.lang.String language, long status)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByL_S(groupId, language, status);
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
	public static java.util.List<com.vportal.portlet.vcms.model.VcmsArticle> findByL_S(
		long groupId, java.lang.String language, long status, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByL_S(groupId, language, status, start, end);
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
	public static java.util.List<com.vportal.portlet.vcms.model.VcmsArticle> findByL_S(
		long groupId, java.lang.String language, long status, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByL_S(groupId, language, status, start, end,
			orderByComparator);
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
	public static com.vportal.portlet.vcms.model.VcmsArticle findByL_S_First(
		long groupId, java.lang.String language, long status,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vcms.NoSuchVcmsArticleException {
		return getPersistence()
				   .findByL_S_First(groupId, language, status, orderByComparator);
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
	public static com.vportal.portlet.vcms.model.VcmsArticle findByL_S_Last(
		long groupId, java.lang.String language, long status,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vcms.NoSuchVcmsArticleException {
		return getPersistence()
				   .findByL_S_Last(groupId, language, status, orderByComparator);
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
	public static com.vportal.portlet.vcms.model.VcmsArticle[] findByL_S_PrevAndNext(
		java.lang.String articleId, long groupId, java.lang.String language,
		long status,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vcms.NoSuchVcmsArticleException {
		return getPersistence()
				   .findByL_S_PrevAndNext(articleId, groupId, language, status,
			orderByComparator);
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
	public static java.util.List<com.vportal.portlet.vcms.model.VcmsArticle> findByG_L_S_U(
		long groupId, java.lang.String language, long status,
		java.lang.String createdByUser)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByG_L_S_U(groupId, language, status, createdByUser);
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
	public static java.util.List<com.vportal.portlet.vcms.model.VcmsArticle> findByG_L_S_U(
		long groupId, java.lang.String language, long status,
		java.lang.String createdByUser, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByG_L_S_U(groupId, language, status, createdByUser,
			start, end);
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
	public static java.util.List<com.vportal.portlet.vcms.model.VcmsArticle> findByG_L_S_U(
		long groupId, java.lang.String language, long status,
		java.lang.String createdByUser, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByG_L_S_U(groupId, language, status, createdByUser,
			start, end, orderByComparator);
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
	public static com.vportal.portlet.vcms.model.VcmsArticle findByG_L_S_U_First(
		long groupId, java.lang.String language, long status,
		java.lang.String createdByUser,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vcms.NoSuchVcmsArticleException {
		return getPersistence()
				   .findByG_L_S_U_First(groupId, language, status,
			createdByUser, orderByComparator);
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
	public static com.vportal.portlet.vcms.model.VcmsArticle findByG_L_S_U_Last(
		long groupId, java.lang.String language, long status,
		java.lang.String createdByUser,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vcms.NoSuchVcmsArticleException {
		return getPersistence()
				   .findByG_L_S_U_Last(groupId, language, status,
			createdByUser, orderByComparator);
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
	public static com.vportal.portlet.vcms.model.VcmsArticle[] findByG_L_S_U_PrevAndNext(
		java.lang.String articleId, long groupId, java.lang.String language,
		long status, java.lang.String createdByUser,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vcms.NoSuchVcmsArticleException {
		return getPersistence()
				   .findByG_L_S_U_PrevAndNext(articleId, groupId, language,
			status, createdByUser, orderByComparator);
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
	public static java.util.List<com.vportal.portlet.vcms.model.VcmsArticle> findByL_S_S(
		long groupId, java.lang.String language, long status, boolean sticky)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByL_S_S(groupId, language, status, sticky);
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
	public static java.util.List<com.vportal.portlet.vcms.model.VcmsArticle> findByL_S_S(
		long groupId, java.lang.String language, long status, boolean sticky,
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByL_S_S(groupId, language, status, sticky, start, end);
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
	public static java.util.List<com.vportal.portlet.vcms.model.VcmsArticle> findByL_S_S(
		long groupId, java.lang.String language, long status, boolean sticky,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByL_S_S(groupId, language, status, sticky, start, end,
			orderByComparator);
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
	public static com.vportal.portlet.vcms.model.VcmsArticle findByL_S_S_First(
		long groupId, java.lang.String language, long status, boolean sticky,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vcms.NoSuchVcmsArticleException {
		return getPersistence()
				   .findByL_S_S_First(groupId, language, status, sticky,
			orderByComparator);
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
	public static com.vportal.portlet.vcms.model.VcmsArticle findByL_S_S_Last(
		long groupId, java.lang.String language, long status, boolean sticky,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vcms.NoSuchVcmsArticleException {
		return getPersistence()
				   .findByL_S_S_Last(groupId, language, status, sticky,
			orderByComparator);
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
	public static com.vportal.portlet.vcms.model.VcmsArticle[] findByL_S_S_PrevAndNext(
		java.lang.String articleId, long groupId, java.lang.String language,
		long status, boolean sticky,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vcms.NoSuchVcmsArticleException {
		return getPersistence()
				   .findByL_S_S_PrevAndNext(articleId, groupId, language,
			status, sticky, orderByComparator);
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
	public static java.util.List<com.vportal.portlet.vcms.model.VcmsArticle> findByU_L(
		long groupId, java.lang.String createdByUser, java.lang.String language)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByU_L(groupId, createdByUser, language);
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
	public static java.util.List<com.vportal.portlet.vcms.model.VcmsArticle> findByU_L(
		long groupId, java.lang.String createdByUser,
		java.lang.String language, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByU_L(groupId, createdByUser, language, start, end);
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
	public static java.util.List<com.vportal.portlet.vcms.model.VcmsArticle> findByU_L(
		long groupId, java.lang.String createdByUser,
		java.lang.String language, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByU_L(groupId, createdByUser, language, start, end,
			orderByComparator);
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
	public static com.vportal.portlet.vcms.model.VcmsArticle findByU_L_First(
		long groupId, java.lang.String createdByUser,
		java.lang.String language,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vcms.NoSuchVcmsArticleException {
		return getPersistence()
				   .findByU_L_First(groupId, createdByUser, language,
			orderByComparator);
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
	public static com.vportal.portlet.vcms.model.VcmsArticle findByU_L_Last(
		long groupId, java.lang.String createdByUser,
		java.lang.String language,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vcms.NoSuchVcmsArticleException {
		return getPersistence()
				   .findByU_L_Last(groupId, createdByUser, language,
			orderByComparator);
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
	public static com.vportal.portlet.vcms.model.VcmsArticle[] findByU_L_PrevAndNext(
		java.lang.String articleId, long groupId,
		java.lang.String createdByUser, java.lang.String language,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vcms.NoSuchVcmsArticleException {
		return getPersistence()
				   .findByU_L_PrevAndNext(articleId, groupId, createdByUser,
			language, orderByComparator);
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
	public static java.util.List<com.vportal.portlet.vcms.model.VcmsArticle> findByU_L_S(
		long groupId, java.lang.String createdByUser,
		java.lang.String language, long status)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByU_L_S(groupId, createdByUser, language, status);
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
	public static java.util.List<com.vportal.portlet.vcms.model.VcmsArticle> findByU_L_S(
		long groupId, java.lang.String createdByUser,
		java.lang.String language, long status, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByU_L_S(groupId, createdByUser, language, status,
			start, end);
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
	public static java.util.List<com.vportal.portlet.vcms.model.VcmsArticle> findByU_L_S(
		long groupId, java.lang.String createdByUser,
		java.lang.String language, long status, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByU_L_S(groupId, createdByUser, language, status,
			start, end, orderByComparator);
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
	public static com.vportal.portlet.vcms.model.VcmsArticle findByU_L_S_First(
		long groupId, java.lang.String createdByUser,
		java.lang.String language, long status,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vcms.NoSuchVcmsArticleException {
		return getPersistence()
				   .findByU_L_S_First(groupId, createdByUser, language, status,
			orderByComparator);
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
	public static com.vportal.portlet.vcms.model.VcmsArticle findByU_L_S_Last(
		long groupId, java.lang.String createdByUser,
		java.lang.String language, long status,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vcms.NoSuchVcmsArticleException {
		return getPersistence()
				   .findByU_L_S_Last(groupId, createdByUser, language, status,
			orderByComparator);
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
	public static com.vportal.portlet.vcms.model.VcmsArticle[] findByU_L_S_PrevAndNext(
		java.lang.String articleId, long groupId,
		java.lang.String createdByUser, java.lang.String language, long status,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vcms.NoSuchVcmsArticleException {
		return getPersistence()
				   .findByU_L_S_PrevAndNext(articleId, groupId, createdByUser,
			language, status, orderByComparator);
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
	public static java.util.List<com.vportal.portlet.vcms.model.VcmsArticle> findByP_L_S_D(
		long groupId, java.lang.String language, long status,
		boolean discussible)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByP_L_S_D(groupId, language, status, discussible);
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
	public static java.util.List<com.vportal.portlet.vcms.model.VcmsArticle> findByP_L_S_D(
		long groupId, java.lang.String language, long status,
		boolean discussible, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByP_L_S_D(groupId, language, status, discussible,
			start, end);
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
	public static java.util.List<com.vportal.portlet.vcms.model.VcmsArticle> findByP_L_S_D(
		long groupId, java.lang.String language, long status,
		boolean discussible, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByP_L_S_D(groupId, language, status, discussible,
			start, end, orderByComparator);
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
	public static com.vportal.portlet.vcms.model.VcmsArticle findByP_L_S_D_First(
		long groupId, java.lang.String language, long status,
		boolean discussible,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vcms.NoSuchVcmsArticleException {
		return getPersistence()
				   .findByP_L_S_D_First(groupId, language, status, discussible,
			orderByComparator);
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
	public static com.vportal.portlet.vcms.model.VcmsArticle findByP_L_S_D_Last(
		long groupId, java.lang.String language, long status,
		boolean discussible,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vcms.NoSuchVcmsArticleException {
		return getPersistence()
				   .findByP_L_S_D_Last(groupId, language, status, discussible,
			orderByComparator);
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
	public static com.vportal.portlet.vcms.model.VcmsArticle[] findByP_L_S_D_PrevAndNext(
		java.lang.String articleId, long groupId, java.lang.String language,
		long status, boolean discussible,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vcms.NoSuchVcmsArticleException {
		return getPersistence()
				   .findByP_L_S_D_PrevAndNext(articleId, groupId, language,
			status, discussible, orderByComparator);
	}

	/**
	* Finds all the vcms articles where status = &#63;.
	*
	* @param status the status to search with
	* @return the matching vcms articles
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.vportal.portlet.vcms.model.VcmsArticle> findByStatus(
		long status) throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByStatus(status);
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
	public static java.util.List<com.vportal.portlet.vcms.model.VcmsArticle> findByStatus(
		long status, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByStatus(status, start, end);
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
	public static java.util.List<com.vportal.portlet.vcms.model.VcmsArticle> findByStatus(
		long status, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByStatus(status, start, end, orderByComparator);
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
	public static com.vportal.portlet.vcms.model.VcmsArticle findByStatus_First(
		long status,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vcms.NoSuchVcmsArticleException {
		return getPersistence().findByStatus_First(status, orderByComparator);
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
	public static com.vportal.portlet.vcms.model.VcmsArticle findByStatus_Last(
		long status,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vcms.NoSuchVcmsArticleException {
		return getPersistence().findByStatus_Last(status, orderByComparator);
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
	public static com.vportal.portlet.vcms.model.VcmsArticle[] findByStatus_PrevAndNext(
		java.lang.String articleId, long status,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vcms.NoSuchVcmsArticleException {
		return getPersistence()
				   .findByStatus_PrevAndNext(articleId, status,
			orderByComparator);
	}

	/**
	* Finds all the vcms articles.
	*
	* @return the vcms articles
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.vportal.portlet.vcms.model.VcmsArticle> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
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
	public static java.util.List<com.vportal.portlet.vcms.model.VcmsArticle> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
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
	public static java.util.List<com.vportal.portlet.vcms.model.VcmsArticle> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the vcms articles where groupId = &#63; and language = &#63; and status = &#63; from the database.
	*
	* @param groupId the group id to search with
	* @param language the language to search with
	* @param status the status to search with
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByL_S(long groupId, java.lang.String language,
		long status) throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByL_S(groupId, language, status);
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
	public static void removeByG_L_S_U(long groupId, java.lang.String language,
		long status, java.lang.String createdByUser)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence()
			.removeByG_L_S_U(groupId, language, status, createdByUser);
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
	public static void removeByL_S_S(long groupId, java.lang.String language,
		long status, boolean sticky)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByL_S_S(groupId, language, status, sticky);
	}

	/**
	* Removes all the vcms articles where groupId = &#63; and createdByUser = &#63; and language = &#63; from the database.
	*
	* @param groupId the group id to search with
	* @param createdByUser the created by user to search with
	* @param language the language to search with
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByU_L(long groupId,
		java.lang.String createdByUser, java.lang.String language)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByU_L(groupId, createdByUser, language);
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
	public static void removeByU_L_S(long groupId,
		java.lang.String createdByUser, java.lang.String language, long status)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByU_L_S(groupId, createdByUser, language, status);
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
	public static void removeByP_L_S_D(long groupId, java.lang.String language,
		long status, boolean discussible)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByP_L_S_D(groupId, language, status, discussible);
	}

	/**
	* Removes all the vcms articles where status = &#63; from the database.
	*
	* @param status the status to search with
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByStatus(long status)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByStatus(status);
	}

	/**
	* Removes all the vcms articles from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
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
	public static int countByL_S(long groupId, java.lang.String language,
		long status) throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByL_S(groupId, language, status);
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
	public static int countByG_L_S_U(long groupId, java.lang.String language,
		long status, java.lang.String createdByUser)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .countByG_L_S_U(groupId, language, status, createdByUser);
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
	public static int countByL_S_S(long groupId, java.lang.String language,
		long status, boolean sticky)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByL_S_S(groupId, language, status, sticky);
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
	public static int countByU_L(long groupId, java.lang.String createdByUser,
		java.lang.String language)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByU_L(groupId, createdByUser, language);
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
	public static int countByU_L_S(long groupId,
		java.lang.String createdByUser, java.lang.String language, long status)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .countByU_L_S(groupId, createdByUser, language, status);
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
	public static int countByP_L_S_D(long groupId, java.lang.String language,
		long status, boolean discussible)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .countByP_L_S_D(groupId, language, status, discussible);
	}

	/**
	* Counts all the vcms articles where status = &#63;.
	*
	* @param status the status to search with
	* @return the number of matching vcms articles
	* @throws SystemException if a system exception occurred
	*/
	public static int countByStatus(long status)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByStatus(status);
	}

	/**
	* Counts all the vcms articles.
	*
	* @return the number of vcms articles
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static VcmsArticlePersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (VcmsArticlePersistence)PortletBeanLocatorUtil.locate(com.vportal.portlet.vcms.service.ClpSerializer.SERVLET_CONTEXT_NAME,
					VcmsArticlePersistence.class.getName());
		}

		return _persistence;
	}

	public void setPersistence(VcmsArticlePersistence persistence) {
		_persistence = persistence;
	}

	private static VcmsArticlePersistence _persistence;
}