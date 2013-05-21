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

import com.liferay.portal.service.persistence.BasePersistence;

import com.vportal.portlet.vlegal.model.VLegalOrg;

/**
 * The persistence interface for the v legal org service.
 *
 * <p>
 * Never modify or reference this interface directly. Always use {@link VLegalOrgUtil} to access the v legal org persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
 * </p>
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author ACB
 * @see VLegalOrgPersistenceImpl
 * @see VLegalOrgUtil
 * @generated
 */
public interface VLegalOrgPersistence extends BasePersistence<VLegalOrg> {
	/**
	* Caches the v legal org in the entity cache if it is enabled.
	*
	* @param vLegalOrg the v legal org to cache
	*/
	public void cacheResult(
		com.vportal.portlet.vlegal.model.VLegalOrg vLegalOrg);

	/**
	* Caches the v legal orgs in the entity cache if it is enabled.
	*
	* @param vLegalOrgs the v legal orgs to cache
	*/
	public void cacheResult(
		java.util.List<com.vportal.portlet.vlegal.model.VLegalOrg> vLegalOrgs);

	/**
	* Creates a new v legal org with the primary key. Does not add the v legal org to the database.
	*
	* @param orgId the primary key for the new v legal org
	* @return the new v legal org
	*/
	public com.vportal.portlet.vlegal.model.VLegalOrg create(
		java.lang.String orgId);

	/**
	* Removes the v legal org with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param orgId the primary key of the v legal org to remove
	* @return the v legal org that was removed
	* @throws com.vportal.portlet.vlegal.NoSuchVLegalOrgException if a v legal org with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.vportal.portlet.vlegal.model.VLegalOrg remove(
		java.lang.String orgId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vlegal.NoSuchVLegalOrgException;

	public com.vportal.portlet.vlegal.model.VLegalOrg updateImpl(
		com.vportal.portlet.vlegal.model.VLegalOrg vLegalOrg, boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Finds the v legal org with the primary key or throws a {@link com.vportal.portlet.vlegal.NoSuchVLegalOrgException} if it could not be found.
	*
	* @param orgId the primary key of the v legal org to find
	* @return the v legal org
	* @throws com.vportal.portlet.vlegal.NoSuchVLegalOrgException if a v legal org with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.vportal.portlet.vlegal.model.VLegalOrg findByPrimaryKey(
		java.lang.String orgId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vlegal.NoSuchVLegalOrgException;

	/**
	* Finds the v legal org with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param orgId the primary key of the v legal org to find
	* @return the v legal org, or <code>null</code> if a v legal org with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.vportal.portlet.vlegal.model.VLegalOrg fetchByPrimaryKey(
		java.lang.String orgId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Finds all the v legal orgs where groupId = &#63;.
	*
	* @param groupId the group id to search with
	* @return the matching v legal orgs
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.vportal.portlet.vlegal.model.VLegalOrg> findByGroupId(
		long groupId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Finds a range of all the v legal orgs where groupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param groupId the group id to search with
	* @param start the lower bound of the range of v legal orgs to return
	* @param end the upper bound of the range of v legal orgs to return (not inclusive)
	* @return the range of matching v legal orgs
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.vportal.portlet.vlegal.model.VLegalOrg> findByGroupId(
		long groupId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Finds an ordered range of all the v legal orgs where groupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param groupId the group id to search with
	* @param start the lower bound of the range of v legal orgs to return
	* @param end the upper bound of the range of v legal orgs to return (not inclusive)
	* @param orderByComparator the comparator to order the results by
	* @return the ordered range of matching v legal orgs
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.vportal.portlet.vlegal.model.VLegalOrg> findByGroupId(
		long groupId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Finds the first v legal org in the ordered set where groupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param groupId the group id to search with
	* @param orderByComparator the comparator to order the set by
	* @return the first matching v legal org
	* @throws com.vportal.portlet.vlegal.NoSuchVLegalOrgException if a matching v legal org could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.vportal.portlet.vlegal.model.VLegalOrg findByGroupId_First(
		long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vlegal.NoSuchVLegalOrgException;

	/**
	* Finds the last v legal org in the ordered set where groupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param groupId the group id to search with
	* @param orderByComparator the comparator to order the set by
	* @return the last matching v legal org
	* @throws com.vportal.portlet.vlegal.NoSuchVLegalOrgException if a matching v legal org could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.vportal.portlet.vlegal.model.VLegalOrg findByGroupId_Last(
		long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vlegal.NoSuchVLegalOrgException;

	/**
	* Finds the v legal orgs before and after the current v legal org in the ordered set where groupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param orgId the primary key of the current v legal org
	* @param groupId the group id to search with
	* @param orderByComparator the comparator to order the set by
	* @return the previous, current, and next v legal org
	* @throws com.vportal.portlet.vlegal.NoSuchVLegalOrgException if a v legal org with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.vportal.portlet.vlegal.model.VLegalOrg[] findByGroupId_PrevAndNext(
		java.lang.String orgId, long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vlegal.NoSuchVLegalOrgException;

	/**
	* Finds all the v legal orgs where groupId = &#63; and language = &#63;.
	*
	* @param groupId the group id to search with
	* @param language the language to search with
	* @return the matching v legal orgs
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.vportal.portlet.vlegal.model.VLegalOrg> findByG_L(
		long groupId, java.lang.String language)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Finds a range of all the v legal orgs where groupId = &#63; and language = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param groupId the group id to search with
	* @param language the language to search with
	* @param start the lower bound of the range of v legal orgs to return
	* @param end the upper bound of the range of v legal orgs to return (not inclusive)
	* @return the range of matching v legal orgs
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.vportal.portlet.vlegal.model.VLegalOrg> findByG_L(
		long groupId, java.lang.String language, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Finds an ordered range of all the v legal orgs where groupId = &#63; and language = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param groupId the group id to search with
	* @param language the language to search with
	* @param start the lower bound of the range of v legal orgs to return
	* @param end the upper bound of the range of v legal orgs to return (not inclusive)
	* @param orderByComparator the comparator to order the results by
	* @return the ordered range of matching v legal orgs
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.vportal.portlet.vlegal.model.VLegalOrg> findByG_L(
		long groupId, java.lang.String language, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Finds the first v legal org in the ordered set where groupId = &#63; and language = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param groupId the group id to search with
	* @param language the language to search with
	* @param orderByComparator the comparator to order the set by
	* @return the first matching v legal org
	* @throws com.vportal.portlet.vlegal.NoSuchVLegalOrgException if a matching v legal org could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.vportal.portlet.vlegal.model.VLegalOrg findByG_L_First(
		long groupId, java.lang.String language,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vlegal.NoSuchVLegalOrgException;

	/**
	* Finds the last v legal org in the ordered set where groupId = &#63; and language = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param groupId the group id to search with
	* @param language the language to search with
	* @param orderByComparator the comparator to order the set by
	* @return the last matching v legal org
	* @throws com.vportal.portlet.vlegal.NoSuchVLegalOrgException if a matching v legal org could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.vportal.portlet.vlegal.model.VLegalOrg findByG_L_Last(
		long groupId, java.lang.String language,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vlegal.NoSuchVLegalOrgException;

	/**
	* Finds the v legal orgs before and after the current v legal org in the ordered set where groupId = &#63; and language = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param orgId the primary key of the current v legal org
	* @param groupId the group id to search with
	* @param language the language to search with
	* @param orderByComparator the comparator to order the set by
	* @return the previous, current, and next v legal org
	* @throws com.vportal.portlet.vlegal.NoSuchVLegalOrgException if a v legal org with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.vportal.portlet.vlegal.model.VLegalOrg[] findByG_L_PrevAndNext(
		java.lang.String orgId, long groupId, java.lang.String language,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vlegal.NoSuchVLegalOrgException;

	/**
	* Finds the v legal org where groupId = &#63; and orgId = &#63; or throws a {@link com.vportal.portlet.vlegal.NoSuchVLegalOrgException} if it could not be found.
	*
	* @param groupId the group id to search with
	* @param orgId the org id to search with
	* @return the matching v legal org
	* @throws com.vportal.portlet.vlegal.NoSuchVLegalOrgException if a matching v legal org could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.vportal.portlet.vlegal.model.VLegalOrg findByG_O(long groupId,
		java.lang.String orgId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vlegal.NoSuchVLegalOrgException;

	/**
	* Finds the v legal org where groupId = &#63; and orgId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param groupId the group id to search with
	* @param orgId the org id to search with
	* @return the matching v legal org, or <code>null</code> if a matching v legal org could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.vportal.portlet.vlegal.model.VLegalOrg fetchByG_O(long groupId,
		java.lang.String orgId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Finds the v legal org where groupId = &#63; and orgId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param groupId the group id to search with
	* @param orgId the org id to search with
	* @return the matching v legal org, or <code>null</code> if a matching v legal org could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.vportal.portlet.vlegal.model.VLegalOrg fetchByG_O(long groupId,
		java.lang.String orgId, boolean retrieveFromCache)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Finds all the v legal orgs where groupId = &#63; and statusOrg = &#63; and language = &#63;.
	*
	* @param groupId the group id to search with
	* @param statusOrg the status org to search with
	* @param language the language to search with
	* @return the matching v legal orgs
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.vportal.portlet.vlegal.model.VLegalOrg> findByS_L(
		long groupId, boolean statusOrg, java.lang.String language)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Finds a range of all the v legal orgs where groupId = &#63; and statusOrg = &#63; and language = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param groupId the group id to search with
	* @param statusOrg the status org to search with
	* @param language the language to search with
	* @param start the lower bound of the range of v legal orgs to return
	* @param end the upper bound of the range of v legal orgs to return (not inclusive)
	* @return the range of matching v legal orgs
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.vportal.portlet.vlegal.model.VLegalOrg> findByS_L(
		long groupId, boolean statusOrg, java.lang.String language, int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Finds an ordered range of all the v legal orgs where groupId = &#63; and statusOrg = &#63; and language = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param groupId the group id to search with
	* @param statusOrg the status org to search with
	* @param language the language to search with
	* @param start the lower bound of the range of v legal orgs to return
	* @param end the upper bound of the range of v legal orgs to return (not inclusive)
	* @param orderByComparator the comparator to order the results by
	* @return the ordered range of matching v legal orgs
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.vportal.portlet.vlegal.model.VLegalOrg> findByS_L(
		long groupId, boolean statusOrg, java.lang.String language, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Finds the first v legal org in the ordered set where groupId = &#63; and statusOrg = &#63; and language = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param groupId the group id to search with
	* @param statusOrg the status org to search with
	* @param language the language to search with
	* @param orderByComparator the comparator to order the set by
	* @return the first matching v legal org
	* @throws com.vportal.portlet.vlegal.NoSuchVLegalOrgException if a matching v legal org could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.vportal.portlet.vlegal.model.VLegalOrg findByS_L_First(
		long groupId, boolean statusOrg, java.lang.String language,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vlegal.NoSuchVLegalOrgException;

	/**
	* Finds the last v legal org in the ordered set where groupId = &#63; and statusOrg = &#63; and language = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param groupId the group id to search with
	* @param statusOrg the status org to search with
	* @param language the language to search with
	* @param orderByComparator the comparator to order the set by
	* @return the last matching v legal org
	* @throws com.vportal.portlet.vlegal.NoSuchVLegalOrgException if a matching v legal org could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.vportal.portlet.vlegal.model.VLegalOrg findByS_L_Last(
		long groupId, boolean statusOrg, java.lang.String language,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vlegal.NoSuchVLegalOrgException;

	/**
	* Finds the v legal orgs before and after the current v legal org in the ordered set where groupId = &#63; and statusOrg = &#63; and language = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param orgId the primary key of the current v legal org
	* @param groupId the group id to search with
	* @param statusOrg the status org to search with
	* @param language the language to search with
	* @param orderByComparator the comparator to order the set by
	* @return the previous, current, and next v legal org
	* @throws com.vportal.portlet.vlegal.NoSuchVLegalOrgException if a v legal org with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.vportal.portlet.vlegal.model.VLegalOrg[] findByS_L_PrevAndNext(
		java.lang.String orgId, long groupId, boolean statusOrg,
		java.lang.String language,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vlegal.NoSuchVLegalOrgException;

	/**
	* Finds all the v legal orgs where groupId = &#63; and statusOrg = &#63; and rssable = &#63;.
	*
	* @param groupId the group id to search with
	* @param statusOrg the status org to search with
	* @param rssable the rssable to search with
	* @return the matching v legal orgs
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.vportal.portlet.vlegal.model.VLegalOrg> findByS_Rss(
		long groupId, boolean statusOrg, boolean rssable)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Finds a range of all the v legal orgs where groupId = &#63; and statusOrg = &#63; and rssable = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param groupId the group id to search with
	* @param statusOrg the status org to search with
	* @param rssable the rssable to search with
	* @param start the lower bound of the range of v legal orgs to return
	* @param end the upper bound of the range of v legal orgs to return (not inclusive)
	* @return the range of matching v legal orgs
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.vportal.portlet.vlegal.model.VLegalOrg> findByS_Rss(
		long groupId, boolean statusOrg, boolean rssable, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Finds an ordered range of all the v legal orgs where groupId = &#63; and statusOrg = &#63; and rssable = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param groupId the group id to search with
	* @param statusOrg the status org to search with
	* @param rssable the rssable to search with
	* @param start the lower bound of the range of v legal orgs to return
	* @param end the upper bound of the range of v legal orgs to return (not inclusive)
	* @param orderByComparator the comparator to order the results by
	* @return the ordered range of matching v legal orgs
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.vportal.portlet.vlegal.model.VLegalOrg> findByS_Rss(
		long groupId, boolean statusOrg, boolean rssable, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Finds the first v legal org in the ordered set where groupId = &#63; and statusOrg = &#63; and rssable = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param groupId the group id to search with
	* @param statusOrg the status org to search with
	* @param rssable the rssable to search with
	* @param orderByComparator the comparator to order the set by
	* @return the first matching v legal org
	* @throws com.vportal.portlet.vlegal.NoSuchVLegalOrgException if a matching v legal org could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.vportal.portlet.vlegal.model.VLegalOrg findByS_Rss_First(
		long groupId, boolean statusOrg, boolean rssable,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vlegal.NoSuchVLegalOrgException;

	/**
	* Finds the last v legal org in the ordered set where groupId = &#63; and statusOrg = &#63; and rssable = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param groupId the group id to search with
	* @param statusOrg the status org to search with
	* @param rssable the rssable to search with
	* @param orderByComparator the comparator to order the set by
	* @return the last matching v legal org
	* @throws com.vportal.portlet.vlegal.NoSuchVLegalOrgException if a matching v legal org could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.vportal.portlet.vlegal.model.VLegalOrg findByS_Rss_Last(
		long groupId, boolean statusOrg, boolean rssable,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vlegal.NoSuchVLegalOrgException;

	/**
	* Finds the v legal orgs before and after the current v legal org in the ordered set where groupId = &#63; and statusOrg = &#63; and rssable = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param orgId the primary key of the current v legal org
	* @param groupId the group id to search with
	* @param statusOrg the status org to search with
	* @param rssable the rssable to search with
	* @param orderByComparator the comparator to order the set by
	* @return the previous, current, and next v legal org
	* @throws com.vportal.portlet.vlegal.NoSuchVLegalOrgException if a v legal org with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.vportal.portlet.vlegal.model.VLegalOrg[] findByS_Rss_PrevAndNext(
		java.lang.String orgId, long groupId, boolean statusOrg,
		boolean rssable,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vlegal.NoSuchVLegalOrgException;

	/**
	* Finds all the v legal orgs where groupId = &#63; and language = &#63; and parentId = &#63;.
	*
	* @param groupId the group id to search with
	* @param language the language to search with
	* @param parentId the parent id to search with
	* @return the matching v legal orgs
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.vportal.portlet.vlegal.model.VLegalOrg> findByG_L_P(
		long groupId, java.lang.String language, java.lang.String parentId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Finds a range of all the v legal orgs where groupId = &#63; and language = &#63; and parentId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param groupId the group id to search with
	* @param language the language to search with
	* @param parentId the parent id to search with
	* @param start the lower bound of the range of v legal orgs to return
	* @param end the upper bound of the range of v legal orgs to return (not inclusive)
	* @return the range of matching v legal orgs
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.vportal.portlet.vlegal.model.VLegalOrg> findByG_L_P(
		long groupId, java.lang.String language, java.lang.String parentId,
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Finds an ordered range of all the v legal orgs where groupId = &#63; and language = &#63; and parentId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param groupId the group id to search with
	* @param language the language to search with
	* @param parentId the parent id to search with
	* @param start the lower bound of the range of v legal orgs to return
	* @param end the upper bound of the range of v legal orgs to return (not inclusive)
	* @param orderByComparator the comparator to order the results by
	* @return the ordered range of matching v legal orgs
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.vportal.portlet.vlegal.model.VLegalOrg> findByG_L_P(
		long groupId, java.lang.String language, java.lang.String parentId,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Finds the first v legal org in the ordered set where groupId = &#63; and language = &#63; and parentId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param groupId the group id to search with
	* @param language the language to search with
	* @param parentId the parent id to search with
	* @param orderByComparator the comparator to order the set by
	* @return the first matching v legal org
	* @throws com.vportal.portlet.vlegal.NoSuchVLegalOrgException if a matching v legal org could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.vportal.portlet.vlegal.model.VLegalOrg findByG_L_P_First(
		long groupId, java.lang.String language, java.lang.String parentId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vlegal.NoSuchVLegalOrgException;

	/**
	* Finds the last v legal org in the ordered set where groupId = &#63; and language = &#63; and parentId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param groupId the group id to search with
	* @param language the language to search with
	* @param parentId the parent id to search with
	* @param orderByComparator the comparator to order the set by
	* @return the last matching v legal org
	* @throws com.vportal.portlet.vlegal.NoSuchVLegalOrgException if a matching v legal org could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.vportal.portlet.vlegal.model.VLegalOrg findByG_L_P_Last(
		long groupId, java.lang.String language, java.lang.String parentId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vlegal.NoSuchVLegalOrgException;

	/**
	* Finds the v legal orgs before and after the current v legal org in the ordered set where groupId = &#63; and language = &#63; and parentId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param orgId the primary key of the current v legal org
	* @param groupId the group id to search with
	* @param language the language to search with
	* @param parentId the parent id to search with
	* @param orderByComparator the comparator to order the set by
	* @return the previous, current, and next v legal org
	* @throws com.vportal.portlet.vlegal.NoSuchVLegalOrgException if a v legal org with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.vportal.portlet.vlegal.model.VLegalOrg[] findByG_L_P_PrevAndNext(
		java.lang.String orgId, long groupId, java.lang.String language,
		java.lang.String parentId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vlegal.NoSuchVLegalOrgException;

	/**
	* Finds all the v legal orgs where groupId = &#63; and language = &#63; and parentId = &#63; and statusOrg = &#63;.
	*
	* @param groupId the group id to search with
	* @param language the language to search with
	* @param parentId the parent id to search with
	* @param statusOrg the status org to search with
	* @return the matching v legal orgs
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.vportal.portlet.vlegal.model.VLegalOrg> findByG_L_P_S(
		long groupId, java.lang.String language, java.lang.String parentId,
		boolean statusOrg)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Finds a range of all the v legal orgs where groupId = &#63; and language = &#63; and parentId = &#63; and statusOrg = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param groupId the group id to search with
	* @param language the language to search with
	* @param parentId the parent id to search with
	* @param statusOrg the status org to search with
	* @param start the lower bound of the range of v legal orgs to return
	* @param end the upper bound of the range of v legal orgs to return (not inclusive)
	* @return the range of matching v legal orgs
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.vportal.portlet.vlegal.model.VLegalOrg> findByG_L_P_S(
		long groupId, java.lang.String language, java.lang.String parentId,
		boolean statusOrg, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Finds an ordered range of all the v legal orgs where groupId = &#63; and language = &#63; and parentId = &#63; and statusOrg = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param groupId the group id to search with
	* @param language the language to search with
	* @param parentId the parent id to search with
	* @param statusOrg the status org to search with
	* @param start the lower bound of the range of v legal orgs to return
	* @param end the upper bound of the range of v legal orgs to return (not inclusive)
	* @param orderByComparator the comparator to order the results by
	* @return the ordered range of matching v legal orgs
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.vportal.portlet.vlegal.model.VLegalOrg> findByG_L_P_S(
		long groupId, java.lang.String language, java.lang.String parentId,
		boolean statusOrg, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Finds the first v legal org in the ordered set where groupId = &#63; and language = &#63; and parentId = &#63; and statusOrg = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param groupId the group id to search with
	* @param language the language to search with
	* @param parentId the parent id to search with
	* @param statusOrg the status org to search with
	* @param orderByComparator the comparator to order the set by
	* @return the first matching v legal org
	* @throws com.vportal.portlet.vlegal.NoSuchVLegalOrgException if a matching v legal org could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.vportal.portlet.vlegal.model.VLegalOrg findByG_L_P_S_First(
		long groupId, java.lang.String language, java.lang.String parentId,
		boolean statusOrg,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vlegal.NoSuchVLegalOrgException;

	/**
	* Finds the last v legal org in the ordered set where groupId = &#63; and language = &#63; and parentId = &#63; and statusOrg = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param groupId the group id to search with
	* @param language the language to search with
	* @param parentId the parent id to search with
	* @param statusOrg the status org to search with
	* @param orderByComparator the comparator to order the set by
	* @return the last matching v legal org
	* @throws com.vportal.portlet.vlegal.NoSuchVLegalOrgException if a matching v legal org could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.vportal.portlet.vlegal.model.VLegalOrg findByG_L_P_S_Last(
		long groupId, java.lang.String language, java.lang.String parentId,
		boolean statusOrg,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vlegal.NoSuchVLegalOrgException;

	/**
	* Finds the v legal orgs before and after the current v legal org in the ordered set where groupId = &#63; and language = &#63; and parentId = &#63; and statusOrg = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param orgId the primary key of the current v legal org
	* @param groupId the group id to search with
	* @param language the language to search with
	* @param parentId the parent id to search with
	* @param statusOrg the status org to search with
	* @param orderByComparator the comparator to order the set by
	* @return the previous, current, and next v legal org
	* @throws com.vportal.portlet.vlegal.NoSuchVLegalOrgException if a v legal org with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.vportal.portlet.vlegal.model.VLegalOrg[] findByG_L_P_S_PrevAndNext(
		java.lang.String orgId, long groupId, java.lang.String language,
		java.lang.String parentId, boolean statusOrg,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vlegal.NoSuchVLegalOrgException;

	/**
	* Finds all the v legal orgs.
	*
	* @return the v legal orgs
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.vportal.portlet.vlegal.model.VLegalOrg> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Finds a range of all the v legal orgs.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of v legal orgs to return
	* @param end the upper bound of the range of v legal orgs to return (not inclusive)
	* @return the range of v legal orgs
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.vportal.portlet.vlegal.model.VLegalOrg> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Finds an ordered range of all the v legal orgs.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of v legal orgs to return
	* @param end the upper bound of the range of v legal orgs to return (not inclusive)
	* @param orderByComparator the comparator to order the results by
	* @return the ordered range of v legal orgs
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.vportal.portlet.vlegal.model.VLegalOrg> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the v legal orgs where groupId = &#63; from the database.
	*
	* @param groupId the group id to search with
	* @throws SystemException if a system exception occurred
	*/
	public void removeByGroupId(long groupId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the v legal orgs where groupId = &#63; and language = &#63; from the database.
	*
	* @param groupId the group id to search with
	* @param language the language to search with
	* @throws SystemException if a system exception occurred
	*/
	public void removeByG_L(long groupId, java.lang.String language)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes the v legal org where groupId = &#63; and orgId = &#63; from the database.
	*
	* @param groupId the group id to search with
	* @param orgId the org id to search with
	* @throws SystemException if a system exception occurred
	*/
	public void removeByG_O(long groupId, java.lang.String orgId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vlegal.NoSuchVLegalOrgException;

	/**
	* Removes all the v legal orgs where groupId = &#63; and statusOrg = &#63; and language = &#63; from the database.
	*
	* @param groupId the group id to search with
	* @param statusOrg the status org to search with
	* @param language the language to search with
	* @throws SystemException if a system exception occurred
	*/
	public void removeByS_L(long groupId, boolean statusOrg,
		java.lang.String language)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the v legal orgs where groupId = &#63; and statusOrg = &#63; and rssable = &#63; from the database.
	*
	* @param groupId the group id to search with
	* @param statusOrg the status org to search with
	* @param rssable the rssable to search with
	* @throws SystemException if a system exception occurred
	*/
	public void removeByS_Rss(long groupId, boolean statusOrg, boolean rssable)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the v legal orgs where groupId = &#63; and language = &#63; and parentId = &#63; from the database.
	*
	* @param groupId the group id to search with
	* @param language the language to search with
	* @param parentId the parent id to search with
	* @throws SystemException if a system exception occurred
	*/
	public void removeByG_L_P(long groupId, java.lang.String language,
		java.lang.String parentId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the v legal orgs where groupId = &#63; and language = &#63; and parentId = &#63; and statusOrg = &#63; from the database.
	*
	* @param groupId the group id to search with
	* @param language the language to search with
	* @param parentId the parent id to search with
	* @param statusOrg the status org to search with
	* @throws SystemException if a system exception occurred
	*/
	public void removeByG_L_P_S(long groupId, java.lang.String language,
		java.lang.String parentId, boolean statusOrg)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the v legal orgs from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Counts all the v legal orgs where groupId = &#63;.
	*
	* @param groupId the group id to search with
	* @return the number of matching v legal orgs
	* @throws SystemException if a system exception occurred
	*/
	public int countByGroupId(long groupId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Counts all the v legal orgs where groupId = &#63; and language = &#63;.
	*
	* @param groupId the group id to search with
	* @param language the language to search with
	* @return the number of matching v legal orgs
	* @throws SystemException if a system exception occurred
	*/
	public int countByG_L(long groupId, java.lang.String language)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Counts all the v legal orgs where groupId = &#63; and orgId = &#63;.
	*
	* @param groupId the group id to search with
	* @param orgId the org id to search with
	* @return the number of matching v legal orgs
	* @throws SystemException if a system exception occurred
	*/
	public int countByG_O(long groupId, java.lang.String orgId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Counts all the v legal orgs where groupId = &#63; and statusOrg = &#63; and language = &#63;.
	*
	* @param groupId the group id to search with
	* @param statusOrg the status org to search with
	* @param language the language to search with
	* @return the number of matching v legal orgs
	* @throws SystemException if a system exception occurred
	*/
	public int countByS_L(long groupId, boolean statusOrg,
		java.lang.String language)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Counts all the v legal orgs where groupId = &#63; and statusOrg = &#63; and rssable = &#63;.
	*
	* @param groupId the group id to search with
	* @param statusOrg the status org to search with
	* @param rssable the rssable to search with
	* @return the number of matching v legal orgs
	* @throws SystemException if a system exception occurred
	*/
	public int countByS_Rss(long groupId, boolean statusOrg, boolean rssable)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Counts all the v legal orgs where groupId = &#63; and language = &#63; and parentId = &#63;.
	*
	* @param groupId the group id to search with
	* @param language the language to search with
	* @param parentId the parent id to search with
	* @return the number of matching v legal orgs
	* @throws SystemException if a system exception occurred
	*/
	public int countByG_L_P(long groupId, java.lang.String language,
		java.lang.String parentId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Counts all the v legal orgs where groupId = &#63; and language = &#63; and parentId = &#63; and statusOrg = &#63;.
	*
	* @param groupId the group id to search with
	* @param language the language to search with
	* @param parentId the parent id to search with
	* @param statusOrg the status org to search with
	* @return the number of matching v legal orgs
	* @throws SystemException if a system exception occurred
	*/
	public int countByG_L_P_S(long groupId, java.lang.String language,
		java.lang.String parentId, boolean statusOrg)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Counts all the v legal orgs.
	*
	* @return the number of v legal orgs
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}