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

import com.liferay.portal.service.persistence.BasePersistence;

import com.vportal.portlet.vcms.model.VcmsArticle;

/**
 * The persistence interface for the vcms article service.
 *
 * <p>
 * Never modify or reference this interface directly. Always use {@link VcmsArticleUtil} to access the vcms article persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
 * </p>
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author HOAN
 * @see VcmsArticlePersistenceImpl
 * @see VcmsArticleUtil
 * @generated
 */
public interface VcmsArticlePersistence extends BasePersistence<VcmsArticle> {
	/**
	* Caches the vcms article in the entity cache if it is enabled.
	*
	* @param vcmsArticle the vcms article to cache
	*/
	public void cacheResult(
		com.vportal.portlet.vcms.model.VcmsArticle vcmsArticle);

	/**
	* Caches the vcms articles in the entity cache if it is enabled.
	*
	* @param vcmsArticles the vcms articles to cache
	*/
	public void cacheResult(
		java.util.List<com.vportal.portlet.vcms.model.VcmsArticle> vcmsArticles);

	/**
	* Creates a new vcms article with the primary key. Does not add the vcms article to the database.
	*
	* @param articleId the primary key for the new vcms article
	* @return the new vcms article
	*/
	public com.vportal.portlet.vcms.model.VcmsArticle create(
		java.lang.String articleId);

	/**
	* Removes the vcms article with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param articleId the primary key of the vcms article to remove
	* @return the vcms article that was removed
	* @throws com.vportal.portlet.vcms.NoSuchVcmsArticleException if a vcms article with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.vportal.portlet.vcms.model.VcmsArticle remove(
		java.lang.String articleId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vcms.NoSuchVcmsArticleException;

	public com.vportal.portlet.vcms.model.VcmsArticle updateImpl(
		com.vportal.portlet.vcms.model.VcmsArticle vcmsArticle, boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Finds the vcms article with the primary key or throws a {@link com.vportal.portlet.vcms.NoSuchVcmsArticleException} if it could not be found.
	*
	* @param articleId the primary key of the vcms article to find
	* @return the vcms article
	* @throws com.vportal.portlet.vcms.NoSuchVcmsArticleException if a vcms article with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.vportal.portlet.vcms.model.VcmsArticle findByPrimaryKey(
		java.lang.String articleId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vcms.NoSuchVcmsArticleException;

	/**
	* Finds the vcms article with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param articleId the primary key of the vcms article to find
	* @return the vcms article, or <code>null</code> if a vcms article with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.vportal.portlet.vcms.model.VcmsArticle fetchByPrimaryKey(
		java.lang.String articleId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Finds all the vcms articles where groupId = &#63; and language = &#63; and status = &#63;.
	*
	* @param groupId the group id to search with
	* @param language the language to search with
	* @param status the status to search with
	* @return the matching vcms articles
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.vportal.portlet.vcms.model.VcmsArticle> findByL_S(
		long groupId, java.lang.String language, long status)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.vportal.portlet.vcms.model.VcmsArticle> findByL_S(
		long groupId, java.lang.String language, long status, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.vportal.portlet.vcms.model.VcmsArticle> findByL_S(
		long groupId, java.lang.String language, long status, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public com.vportal.portlet.vcms.model.VcmsArticle findByL_S_First(
		long groupId, java.lang.String language, long status,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vcms.NoSuchVcmsArticleException;

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
	public com.vportal.portlet.vcms.model.VcmsArticle findByL_S_Last(
		long groupId, java.lang.String language, long status,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vcms.NoSuchVcmsArticleException;

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
	public com.vportal.portlet.vcms.model.VcmsArticle[] findByL_S_PrevAndNext(
		java.lang.String articleId, long groupId, java.lang.String language,
		long status,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vcms.NoSuchVcmsArticleException;

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
	public java.util.List<com.vportal.portlet.vcms.model.VcmsArticle> findByG_L_S_U(
		long groupId, java.lang.String language, long status,
		java.lang.String createdByUser)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.vportal.portlet.vcms.model.VcmsArticle> findByG_L_S_U(
		long groupId, java.lang.String language, long status,
		java.lang.String createdByUser, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.vportal.portlet.vcms.model.VcmsArticle> findByG_L_S_U(
		long groupId, java.lang.String language, long status,
		java.lang.String createdByUser, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public com.vportal.portlet.vcms.model.VcmsArticle findByG_L_S_U_First(
		long groupId, java.lang.String language, long status,
		java.lang.String createdByUser,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vcms.NoSuchVcmsArticleException;

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
	public com.vportal.portlet.vcms.model.VcmsArticle findByG_L_S_U_Last(
		long groupId, java.lang.String language, long status,
		java.lang.String createdByUser,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vcms.NoSuchVcmsArticleException;

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
	public com.vportal.portlet.vcms.model.VcmsArticle[] findByG_L_S_U_PrevAndNext(
		java.lang.String articleId, long groupId, java.lang.String language,
		long status, java.lang.String createdByUser,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vcms.NoSuchVcmsArticleException;

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
	public java.util.List<com.vportal.portlet.vcms.model.VcmsArticle> findByL_S_S(
		long groupId, java.lang.String language, long status, boolean sticky)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.vportal.portlet.vcms.model.VcmsArticle> findByL_S_S(
		long groupId, java.lang.String language, long status, boolean sticky,
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.vportal.portlet.vcms.model.VcmsArticle> findByL_S_S(
		long groupId, java.lang.String language, long status, boolean sticky,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public com.vportal.portlet.vcms.model.VcmsArticle findByL_S_S_First(
		long groupId, java.lang.String language, long status, boolean sticky,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vcms.NoSuchVcmsArticleException;

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
	public com.vportal.portlet.vcms.model.VcmsArticle findByL_S_S_Last(
		long groupId, java.lang.String language, long status, boolean sticky,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vcms.NoSuchVcmsArticleException;

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
	public com.vportal.portlet.vcms.model.VcmsArticle[] findByL_S_S_PrevAndNext(
		java.lang.String articleId, long groupId, java.lang.String language,
		long status, boolean sticky,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vcms.NoSuchVcmsArticleException;

	/**
	* Finds all the vcms articles where groupId = &#63; and createdByUser = &#63; and language = &#63;.
	*
	* @param groupId the group id to search with
	* @param createdByUser the created by user to search with
	* @param language the language to search with
	* @return the matching vcms articles
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.vportal.portlet.vcms.model.VcmsArticle> findByU_L(
		long groupId, java.lang.String createdByUser, java.lang.String language)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.vportal.portlet.vcms.model.VcmsArticle> findByU_L(
		long groupId, java.lang.String createdByUser,
		java.lang.String language, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.vportal.portlet.vcms.model.VcmsArticle> findByU_L(
		long groupId, java.lang.String createdByUser,
		java.lang.String language, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public com.vportal.portlet.vcms.model.VcmsArticle findByU_L_First(
		long groupId, java.lang.String createdByUser,
		java.lang.String language,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vcms.NoSuchVcmsArticleException;

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
	public com.vportal.portlet.vcms.model.VcmsArticle findByU_L_Last(
		long groupId, java.lang.String createdByUser,
		java.lang.String language,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vcms.NoSuchVcmsArticleException;

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
	public com.vportal.portlet.vcms.model.VcmsArticle[] findByU_L_PrevAndNext(
		java.lang.String articleId, long groupId,
		java.lang.String createdByUser, java.lang.String language,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vcms.NoSuchVcmsArticleException;

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
	public java.util.List<com.vportal.portlet.vcms.model.VcmsArticle> findByU_L_S(
		long groupId, java.lang.String createdByUser,
		java.lang.String language, long status)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.vportal.portlet.vcms.model.VcmsArticle> findByU_L_S(
		long groupId, java.lang.String createdByUser,
		java.lang.String language, long status, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.vportal.portlet.vcms.model.VcmsArticle> findByU_L_S(
		long groupId, java.lang.String createdByUser,
		java.lang.String language, long status, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public com.vportal.portlet.vcms.model.VcmsArticle findByU_L_S_First(
		long groupId, java.lang.String createdByUser,
		java.lang.String language, long status,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vcms.NoSuchVcmsArticleException;

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
	public com.vportal.portlet.vcms.model.VcmsArticle findByU_L_S_Last(
		long groupId, java.lang.String createdByUser,
		java.lang.String language, long status,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vcms.NoSuchVcmsArticleException;

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
	public com.vportal.portlet.vcms.model.VcmsArticle[] findByU_L_S_PrevAndNext(
		java.lang.String articleId, long groupId,
		java.lang.String createdByUser, java.lang.String language, long status,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vcms.NoSuchVcmsArticleException;

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
	public java.util.List<com.vportal.portlet.vcms.model.VcmsArticle> findByP_L_S_D(
		long groupId, java.lang.String language, long status,
		boolean discussible)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.vportal.portlet.vcms.model.VcmsArticle> findByP_L_S_D(
		long groupId, java.lang.String language, long status,
		boolean discussible, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.vportal.portlet.vcms.model.VcmsArticle> findByP_L_S_D(
		long groupId, java.lang.String language, long status,
		boolean discussible, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public com.vportal.portlet.vcms.model.VcmsArticle findByP_L_S_D_First(
		long groupId, java.lang.String language, long status,
		boolean discussible,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vcms.NoSuchVcmsArticleException;

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
	public com.vportal.portlet.vcms.model.VcmsArticle findByP_L_S_D_Last(
		long groupId, java.lang.String language, long status,
		boolean discussible,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vcms.NoSuchVcmsArticleException;

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
	public com.vportal.portlet.vcms.model.VcmsArticle[] findByP_L_S_D_PrevAndNext(
		java.lang.String articleId, long groupId, java.lang.String language,
		long status, boolean discussible,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vcms.NoSuchVcmsArticleException;

	/**
	* Finds all the vcms articles where status = &#63;.
	*
	* @param status the status to search with
	* @return the matching vcms articles
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.vportal.portlet.vcms.model.VcmsArticle> findByStatus(
		long status) throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.vportal.portlet.vcms.model.VcmsArticle> findByStatus(
		long status, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.vportal.portlet.vcms.model.VcmsArticle> findByStatus(
		long status, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public com.vportal.portlet.vcms.model.VcmsArticle findByStatus_First(
		long status,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vcms.NoSuchVcmsArticleException;

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
	public com.vportal.portlet.vcms.model.VcmsArticle findByStatus_Last(
		long status,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vcms.NoSuchVcmsArticleException;

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
	public com.vportal.portlet.vcms.model.VcmsArticle[] findByStatus_PrevAndNext(
		java.lang.String articleId, long status,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vcms.NoSuchVcmsArticleException;

	/**
	* Finds all the vcms articles.
	*
	* @return the vcms articles
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.vportal.portlet.vcms.model.VcmsArticle> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.vportal.portlet.vcms.model.VcmsArticle> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.vportal.portlet.vcms.model.VcmsArticle> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the vcms articles where groupId = &#63; and language = &#63; and status = &#63; from the database.
	*
	* @param groupId the group id to search with
	* @param language the language to search with
	* @param status the status to search with
	* @throws SystemException if a system exception occurred
	*/
	public void removeByL_S(long groupId, java.lang.String language, long status)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the vcms articles where groupId = &#63; and language = &#63; and status = &#63; and createdByUser = &#63; from the database.
	*
	* @param groupId the group id to search with
	* @param language the language to search with
	* @param status the status to search with
	* @param createdByUser the created by user to search with
	* @throws SystemException if a system exception occurred
	*/
	public void removeByG_L_S_U(long groupId, java.lang.String language,
		long status, java.lang.String createdByUser)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the vcms articles where groupId = &#63; and language = &#63; and status = &#63; and sticky = &#63; from the database.
	*
	* @param groupId the group id to search with
	* @param language the language to search with
	* @param status the status to search with
	* @param sticky the sticky to search with
	* @throws SystemException if a system exception occurred
	*/
	public void removeByL_S_S(long groupId, java.lang.String language,
		long status, boolean sticky)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the vcms articles where groupId = &#63; and createdByUser = &#63; and language = &#63; from the database.
	*
	* @param groupId the group id to search with
	* @param createdByUser the created by user to search with
	* @param language the language to search with
	* @throws SystemException if a system exception occurred
	*/
	public void removeByU_L(long groupId, java.lang.String createdByUser,
		java.lang.String language)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the vcms articles where groupId = &#63; and createdByUser = &#63; and language = &#63; and status = &#63; from the database.
	*
	* @param groupId the group id to search with
	* @param createdByUser the created by user to search with
	* @param language the language to search with
	* @param status the status to search with
	* @throws SystemException if a system exception occurred
	*/
	public void removeByU_L_S(long groupId, java.lang.String createdByUser,
		java.lang.String language, long status)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the vcms articles where groupId = &#63; and language = &#63; and status = &#63; and discussible = &#63; from the database.
	*
	* @param groupId the group id to search with
	* @param language the language to search with
	* @param status the status to search with
	* @param discussible the discussible to search with
	* @throws SystemException if a system exception occurred
	*/
	public void removeByP_L_S_D(long groupId, java.lang.String language,
		long status, boolean discussible)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the vcms articles where status = &#63; from the database.
	*
	* @param status the status to search with
	* @throws SystemException if a system exception occurred
	*/
	public void removeByStatus(long status)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the vcms articles from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Counts all the vcms articles where groupId = &#63; and language = &#63; and status = &#63;.
	*
	* @param groupId the group id to search with
	* @param language the language to search with
	* @param status the status to search with
	* @return the number of matching vcms articles
	* @throws SystemException if a system exception occurred
	*/
	public int countByL_S(long groupId, java.lang.String language, long status)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public int countByG_L_S_U(long groupId, java.lang.String language,
		long status, java.lang.String createdByUser)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public int countByL_S_S(long groupId, java.lang.String language,
		long status, boolean sticky)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Counts all the vcms articles where groupId = &#63; and createdByUser = &#63; and language = &#63;.
	*
	* @param groupId the group id to search with
	* @param createdByUser the created by user to search with
	* @param language the language to search with
	* @return the number of matching vcms articles
	* @throws SystemException if a system exception occurred
	*/
	public int countByU_L(long groupId, java.lang.String createdByUser,
		java.lang.String language)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public int countByU_L_S(long groupId, java.lang.String createdByUser,
		java.lang.String language, long status)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public int countByP_L_S_D(long groupId, java.lang.String language,
		long status, boolean discussible)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Counts all the vcms articles where status = &#63;.
	*
	* @param status the status to search with
	* @return the number of matching vcms articles
	* @throws SystemException if a system exception occurred
	*/
	public int countByStatus(long status)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Counts all the vcms articles.
	*
	* @return the number of vcms articles
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}