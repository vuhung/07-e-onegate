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

import com.vportal.portlet.vcms.model.VcmsStatus;

/**
 * The persistence interface for the vcms status service.
 *
 * <p>
 * Never modify or reference this interface directly. Always use {@link VcmsStatusUtil} to access the vcms status persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
 * </p>
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author HOAN
 * @see VcmsStatusPersistenceImpl
 * @see VcmsStatusUtil
 * @generated
 */
public interface VcmsStatusPersistence extends BasePersistence<VcmsStatus> {
	/**
	* Caches the vcms status in the entity cache if it is enabled.
	*
	* @param vcmsStatus the vcms status to cache
	*/
	public void cacheResult(
		com.vportal.portlet.vcms.model.VcmsStatus vcmsStatus);

	/**
	* Caches the vcms statuses in the entity cache if it is enabled.
	*
	* @param vcmsStatuses the vcms statuses to cache
	*/
	public void cacheResult(
		java.util.List<com.vportal.portlet.vcms.model.VcmsStatus> vcmsStatuses);

	/**
	* Creates a new vcms status with the primary key. Does not add the vcms status to the database.
	*
	* @param statusId the primary key for the new vcms status
	* @return the new vcms status
	*/
	public com.vportal.portlet.vcms.model.VcmsStatus create(long statusId);

	/**
	* Removes the vcms status with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param statusId the primary key of the vcms status to remove
	* @return the vcms status that was removed
	* @throws com.vportal.portlet.vcms.NoSuchVcmsStatusException if a vcms status with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.vportal.portlet.vcms.model.VcmsStatus remove(long statusId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vcms.NoSuchVcmsStatusException;

	public com.vportal.portlet.vcms.model.VcmsStatus updateImpl(
		com.vportal.portlet.vcms.model.VcmsStatus vcmsStatus, boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Finds the vcms status with the primary key or throws a {@link com.vportal.portlet.vcms.NoSuchVcmsStatusException} if it could not be found.
	*
	* @param statusId the primary key of the vcms status to find
	* @return the vcms status
	* @throws com.vportal.portlet.vcms.NoSuchVcmsStatusException if a vcms status with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.vportal.portlet.vcms.model.VcmsStatus findByPrimaryKey(
		long statusId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vcms.NoSuchVcmsStatusException;

	/**
	* Finds the vcms status with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param statusId the primary key of the vcms status to find
	* @return the vcms status, or <code>null</code> if a vcms status with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.vportal.portlet.vcms.model.VcmsStatus fetchByPrimaryKey(
		long statusId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Finds all the vcms statuses where companyId = &#63;.
	*
	* @param companyId the company id to search with
	* @return the matching vcms statuses
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.vportal.portlet.vcms.model.VcmsStatus> findByCompanyId(
		long companyId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Finds a range of all the vcms statuses where companyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param companyId the company id to search with
	* @param start the lower bound of the range of vcms statuses to return
	* @param end the upper bound of the range of vcms statuses to return (not inclusive)
	* @return the range of matching vcms statuses
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.vportal.portlet.vcms.model.VcmsStatus> findByCompanyId(
		long companyId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Finds an ordered range of all the vcms statuses where companyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param companyId the company id to search with
	* @param start the lower bound of the range of vcms statuses to return
	* @param end the upper bound of the range of vcms statuses to return (not inclusive)
	* @param orderByComparator the comparator to order the results by
	* @return the ordered range of matching vcms statuses
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.vportal.portlet.vcms.model.VcmsStatus> findByCompanyId(
		long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Finds the first vcms status in the ordered set where companyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param companyId the company id to search with
	* @param orderByComparator the comparator to order the set by
	* @return the first matching vcms status
	* @throws com.vportal.portlet.vcms.NoSuchVcmsStatusException if a matching vcms status could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.vportal.portlet.vcms.model.VcmsStatus findByCompanyId_First(
		long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vcms.NoSuchVcmsStatusException;

	/**
	* Finds the last vcms status in the ordered set where companyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param companyId the company id to search with
	* @param orderByComparator the comparator to order the set by
	* @return the last matching vcms status
	* @throws com.vportal.portlet.vcms.NoSuchVcmsStatusException if a matching vcms status could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.vportal.portlet.vcms.model.VcmsStatus findByCompanyId_Last(
		long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vcms.NoSuchVcmsStatusException;

	/**
	* Finds the vcms statuses before and after the current vcms status in the ordered set where companyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param statusId the primary key of the current vcms status
	* @param companyId the company id to search with
	* @param orderByComparator the comparator to order the set by
	* @return the previous, current, and next vcms status
	* @throws com.vportal.portlet.vcms.NoSuchVcmsStatusException if a vcms status with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.vportal.portlet.vcms.model.VcmsStatus[] findByCompanyId_PrevAndNext(
		long statusId, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vcms.NoSuchVcmsStatusException;

	/**
	* Finds all the vcms statuses where companyId = &#63; and groupId = &#63;.
	*
	* @param companyId the company id to search with
	* @param groupId the group id to search with
	* @return the matching vcms statuses
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.vportal.portlet.vcms.model.VcmsStatus> findByC_G(
		long companyId, long groupId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Finds a range of all the vcms statuses where companyId = &#63; and groupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param companyId the company id to search with
	* @param groupId the group id to search with
	* @param start the lower bound of the range of vcms statuses to return
	* @param end the upper bound of the range of vcms statuses to return (not inclusive)
	* @return the range of matching vcms statuses
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.vportal.portlet.vcms.model.VcmsStatus> findByC_G(
		long companyId, long groupId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Finds an ordered range of all the vcms statuses where companyId = &#63; and groupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param companyId the company id to search with
	* @param groupId the group id to search with
	* @param start the lower bound of the range of vcms statuses to return
	* @param end the upper bound of the range of vcms statuses to return (not inclusive)
	* @param orderByComparator the comparator to order the results by
	* @return the ordered range of matching vcms statuses
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.vportal.portlet.vcms.model.VcmsStatus> findByC_G(
		long companyId, long groupId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Finds the first vcms status in the ordered set where companyId = &#63; and groupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param companyId the company id to search with
	* @param groupId the group id to search with
	* @param orderByComparator the comparator to order the set by
	* @return the first matching vcms status
	* @throws com.vportal.portlet.vcms.NoSuchVcmsStatusException if a matching vcms status could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.vportal.portlet.vcms.model.VcmsStatus findByC_G_First(
		long companyId, long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vcms.NoSuchVcmsStatusException;

	/**
	* Finds the last vcms status in the ordered set where companyId = &#63; and groupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param companyId the company id to search with
	* @param groupId the group id to search with
	* @param orderByComparator the comparator to order the set by
	* @return the last matching vcms status
	* @throws com.vportal.portlet.vcms.NoSuchVcmsStatusException if a matching vcms status could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.vportal.portlet.vcms.model.VcmsStatus findByC_G_Last(
		long companyId, long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vcms.NoSuchVcmsStatusException;

	/**
	* Finds the vcms statuses before and after the current vcms status in the ordered set where companyId = &#63; and groupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param statusId the primary key of the current vcms status
	* @param companyId the company id to search with
	* @param groupId the group id to search with
	* @param orderByComparator the comparator to order the set by
	* @return the previous, current, and next vcms status
	* @throws com.vportal.portlet.vcms.NoSuchVcmsStatusException if a vcms status with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.vportal.portlet.vcms.model.VcmsStatus[] findByC_G_PrevAndNext(
		long statusId, long companyId, long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vcms.NoSuchVcmsStatusException;

	/**
	* Filters by the user's permissions and finds all the vcms statuses where companyId = &#63; and groupId = &#63;.
	*
	* @param companyId the company id to search with
	* @param groupId the group id to search with
	* @return the matching vcms statuses that the user has permission to view
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.vportal.portlet.vcms.model.VcmsStatus> filterFindByC_G(
		long companyId, long groupId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Filters by the user's permissions and finds a range of all the vcms statuses where companyId = &#63; and groupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param companyId the company id to search with
	* @param groupId the group id to search with
	* @param start the lower bound of the range of vcms statuses to return
	* @param end the upper bound of the range of vcms statuses to return (not inclusive)
	* @return the range of matching vcms statuses that the user has permission to view
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.vportal.portlet.vcms.model.VcmsStatus> filterFindByC_G(
		long companyId, long groupId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Filters by the user's permissions and finds an ordered range of all the vcms statuses where companyId = &#63; and groupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param companyId the company id to search with
	* @param groupId the group id to search with
	* @param start the lower bound of the range of vcms statuses to return
	* @param end the upper bound of the range of vcms statuses to return (not inclusive)
	* @param orderByComparator the comparator to order the results by
	* @return the ordered range of matching vcms statuses that the user has permission to view
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.vportal.portlet.vcms.model.VcmsStatus> filterFindByC_G(
		long companyId, long groupId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Finds all the vcms statuses where groupId = &#63; and position = &#63;.
	*
	* @param groupId the group id to search with
	* @param position the position to search with
	* @return the matching vcms statuses
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.vportal.portlet.vcms.model.VcmsStatus> findByG_P(
		long groupId, int position)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Finds a range of all the vcms statuses where groupId = &#63; and position = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param groupId the group id to search with
	* @param position the position to search with
	* @param start the lower bound of the range of vcms statuses to return
	* @param end the upper bound of the range of vcms statuses to return (not inclusive)
	* @return the range of matching vcms statuses
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.vportal.portlet.vcms.model.VcmsStatus> findByG_P(
		long groupId, int position, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Finds an ordered range of all the vcms statuses where groupId = &#63; and position = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param groupId the group id to search with
	* @param position the position to search with
	* @param start the lower bound of the range of vcms statuses to return
	* @param end the upper bound of the range of vcms statuses to return (not inclusive)
	* @param orderByComparator the comparator to order the results by
	* @return the ordered range of matching vcms statuses
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.vportal.portlet.vcms.model.VcmsStatus> findByG_P(
		long groupId, int position, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Finds the first vcms status in the ordered set where groupId = &#63; and position = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param groupId the group id to search with
	* @param position the position to search with
	* @param orderByComparator the comparator to order the set by
	* @return the first matching vcms status
	* @throws com.vportal.portlet.vcms.NoSuchVcmsStatusException if a matching vcms status could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.vportal.portlet.vcms.model.VcmsStatus findByG_P_First(
		long groupId, int position,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vcms.NoSuchVcmsStatusException;

	/**
	* Finds the last vcms status in the ordered set where groupId = &#63; and position = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param groupId the group id to search with
	* @param position the position to search with
	* @param orderByComparator the comparator to order the set by
	* @return the last matching vcms status
	* @throws com.vportal.portlet.vcms.NoSuchVcmsStatusException if a matching vcms status could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.vportal.portlet.vcms.model.VcmsStatus findByG_P_Last(
		long groupId, int position,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vcms.NoSuchVcmsStatusException;

	/**
	* Finds the vcms statuses before and after the current vcms status in the ordered set where groupId = &#63; and position = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param statusId the primary key of the current vcms status
	* @param groupId the group id to search with
	* @param position the position to search with
	* @param orderByComparator the comparator to order the set by
	* @return the previous, current, and next vcms status
	* @throws com.vportal.portlet.vcms.NoSuchVcmsStatusException if a vcms status with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.vportal.portlet.vcms.model.VcmsStatus[] findByG_P_PrevAndNext(
		long statusId, long groupId, int position,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vcms.NoSuchVcmsStatusException;

	/**
	* Filters by the user's permissions and finds all the vcms statuses where groupId = &#63; and position = &#63;.
	*
	* @param groupId the group id to search with
	* @param position the position to search with
	* @return the matching vcms statuses that the user has permission to view
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.vportal.portlet.vcms.model.VcmsStatus> filterFindByG_P(
		long groupId, int position)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Filters by the user's permissions and finds a range of all the vcms statuses where groupId = &#63; and position = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param groupId the group id to search with
	* @param position the position to search with
	* @param start the lower bound of the range of vcms statuses to return
	* @param end the upper bound of the range of vcms statuses to return (not inclusive)
	* @return the range of matching vcms statuses that the user has permission to view
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.vportal.portlet.vcms.model.VcmsStatus> filterFindByG_P(
		long groupId, int position, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Filters by the user's permissions and finds an ordered range of all the vcms statuses where groupId = &#63; and position = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param groupId the group id to search with
	* @param position the position to search with
	* @param start the lower bound of the range of vcms statuses to return
	* @param end the upper bound of the range of vcms statuses to return (not inclusive)
	* @param orderByComparator the comparator to order the results by
	* @return the ordered range of matching vcms statuses that the user has permission to view
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.vportal.portlet.vcms.model.VcmsStatus> filterFindByG_P(
		long groupId, int position, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Finds all the vcms statuses where groupId = &#63;.
	*
	* @param groupId the group id to search with
	* @return the matching vcms statuses
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.vportal.portlet.vcms.model.VcmsStatus> findByGroupId(
		long groupId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Finds a range of all the vcms statuses where groupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param groupId the group id to search with
	* @param start the lower bound of the range of vcms statuses to return
	* @param end the upper bound of the range of vcms statuses to return (not inclusive)
	* @return the range of matching vcms statuses
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.vportal.portlet.vcms.model.VcmsStatus> findByGroupId(
		long groupId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Finds an ordered range of all the vcms statuses where groupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param groupId the group id to search with
	* @param start the lower bound of the range of vcms statuses to return
	* @param end the upper bound of the range of vcms statuses to return (not inclusive)
	* @param orderByComparator the comparator to order the results by
	* @return the ordered range of matching vcms statuses
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.vportal.portlet.vcms.model.VcmsStatus> findByGroupId(
		long groupId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Finds the first vcms status in the ordered set where groupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param groupId the group id to search with
	* @param orderByComparator the comparator to order the set by
	* @return the first matching vcms status
	* @throws com.vportal.portlet.vcms.NoSuchVcmsStatusException if a matching vcms status could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.vportal.portlet.vcms.model.VcmsStatus findByGroupId_First(
		long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vcms.NoSuchVcmsStatusException;

	/**
	* Finds the last vcms status in the ordered set where groupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param groupId the group id to search with
	* @param orderByComparator the comparator to order the set by
	* @return the last matching vcms status
	* @throws com.vportal.portlet.vcms.NoSuchVcmsStatusException if a matching vcms status could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.vportal.portlet.vcms.model.VcmsStatus findByGroupId_Last(
		long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vcms.NoSuchVcmsStatusException;

	/**
	* Finds the vcms statuses before and after the current vcms status in the ordered set where groupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param statusId the primary key of the current vcms status
	* @param groupId the group id to search with
	* @param orderByComparator the comparator to order the set by
	* @return the previous, current, and next vcms status
	* @throws com.vportal.portlet.vcms.NoSuchVcmsStatusException if a vcms status with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.vportal.portlet.vcms.model.VcmsStatus[] findByGroupId_PrevAndNext(
		long statusId, long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vcms.NoSuchVcmsStatusException;

	/**
	* Filters by the user's permissions and finds all the vcms statuses where groupId = &#63;.
	*
	* @param groupId the group id to search with
	* @return the matching vcms statuses that the user has permission to view
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.vportal.portlet.vcms.model.VcmsStatus> filterFindByGroupId(
		long groupId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Filters by the user's permissions and finds a range of all the vcms statuses where groupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param groupId the group id to search with
	* @param start the lower bound of the range of vcms statuses to return
	* @param end the upper bound of the range of vcms statuses to return (not inclusive)
	* @return the range of matching vcms statuses that the user has permission to view
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.vportal.portlet.vcms.model.VcmsStatus> filterFindByGroupId(
		long groupId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Filters by the user's permissions and finds an ordered range of all the vcms statuses where groupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param groupId the group id to search with
	* @param start the lower bound of the range of vcms statuses to return
	* @param end the upper bound of the range of vcms statuses to return (not inclusive)
	* @param orderByComparator the comparator to order the results by
	* @return the ordered range of matching vcms statuses that the user has permission to view
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.vportal.portlet.vcms.model.VcmsStatus> filterFindByGroupId(
		long groupId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Finds the vcms status where companyId = &#63; and groupId = &#63; and active = &#63; or throws a {@link com.vportal.portlet.vcms.NoSuchVcmsStatusException} if it could not be found.
	*
	* @param companyId the company id to search with
	* @param groupId the group id to search with
	* @param active the active to search with
	* @return the matching vcms status
	* @throws com.vportal.portlet.vcms.NoSuchVcmsStatusException if a matching vcms status could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.vportal.portlet.vcms.model.VcmsStatus findByC_G_A(
		long companyId, long groupId, boolean active)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vcms.NoSuchVcmsStatusException;

	/**
	* Finds the vcms status where companyId = &#63; and groupId = &#63; and active = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param companyId the company id to search with
	* @param groupId the group id to search with
	* @param active the active to search with
	* @return the matching vcms status, or <code>null</code> if a matching vcms status could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.vportal.portlet.vcms.model.VcmsStatus fetchByC_G_A(
		long companyId, long groupId, boolean active)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Finds the vcms status where companyId = &#63; and groupId = &#63; and active = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param companyId the company id to search with
	* @param groupId the group id to search with
	* @param active the active to search with
	* @return the matching vcms status, or <code>null</code> if a matching vcms status could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.vportal.portlet.vcms.model.VcmsStatus fetchByC_G_A(
		long companyId, long groupId, boolean active, boolean retrieveFromCache)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Finds the vcms status where active = &#63; or throws a {@link com.vportal.portlet.vcms.NoSuchVcmsStatusException} if it could not be found.
	*
	* @param active the active to search with
	* @return the matching vcms status
	* @throws com.vportal.portlet.vcms.NoSuchVcmsStatusException if a matching vcms status could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.vportal.portlet.vcms.model.VcmsStatus findByA(boolean active)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vcms.NoSuchVcmsStatusException;

	/**
	* Finds the vcms status where active = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param active the active to search with
	* @return the matching vcms status, or <code>null</code> if a matching vcms status could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.vportal.portlet.vcms.model.VcmsStatus fetchByA(boolean active)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Finds the vcms status where active = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param active the active to search with
	* @return the matching vcms status, or <code>null</code> if a matching vcms status could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.vportal.portlet.vcms.model.VcmsStatus fetchByA(boolean active,
		boolean retrieveFromCache)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Finds all the vcms statuses where companyId = &#63; and active = &#63;.
	*
	* @param companyId the company id to search with
	* @param active the active to search with
	* @return the matching vcms statuses
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.vportal.portlet.vcms.model.VcmsStatus> findByC_A(
		long companyId, boolean active)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Finds a range of all the vcms statuses where companyId = &#63; and active = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param companyId the company id to search with
	* @param active the active to search with
	* @param start the lower bound of the range of vcms statuses to return
	* @param end the upper bound of the range of vcms statuses to return (not inclusive)
	* @return the range of matching vcms statuses
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.vportal.portlet.vcms.model.VcmsStatus> findByC_A(
		long companyId, boolean active, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Finds an ordered range of all the vcms statuses where companyId = &#63; and active = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param companyId the company id to search with
	* @param active the active to search with
	* @param start the lower bound of the range of vcms statuses to return
	* @param end the upper bound of the range of vcms statuses to return (not inclusive)
	* @param orderByComparator the comparator to order the results by
	* @return the ordered range of matching vcms statuses
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.vportal.portlet.vcms.model.VcmsStatus> findByC_A(
		long companyId, boolean active, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Finds the first vcms status in the ordered set where companyId = &#63; and active = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param companyId the company id to search with
	* @param active the active to search with
	* @param orderByComparator the comparator to order the set by
	* @return the first matching vcms status
	* @throws com.vportal.portlet.vcms.NoSuchVcmsStatusException if a matching vcms status could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.vportal.portlet.vcms.model.VcmsStatus findByC_A_First(
		long companyId, boolean active,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vcms.NoSuchVcmsStatusException;

	/**
	* Finds the last vcms status in the ordered set where companyId = &#63; and active = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param companyId the company id to search with
	* @param active the active to search with
	* @param orderByComparator the comparator to order the set by
	* @return the last matching vcms status
	* @throws com.vportal.portlet.vcms.NoSuchVcmsStatusException if a matching vcms status could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.vportal.portlet.vcms.model.VcmsStatus findByC_A_Last(
		long companyId, boolean active,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vcms.NoSuchVcmsStatusException;

	/**
	* Finds the vcms statuses before and after the current vcms status in the ordered set where companyId = &#63; and active = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param statusId the primary key of the current vcms status
	* @param companyId the company id to search with
	* @param active the active to search with
	* @param orderByComparator the comparator to order the set by
	* @return the previous, current, and next vcms status
	* @throws com.vportal.portlet.vcms.NoSuchVcmsStatusException if a vcms status with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.vportal.portlet.vcms.model.VcmsStatus[] findByC_A_PrevAndNext(
		long statusId, long companyId, boolean active,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vcms.NoSuchVcmsStatusException;

	/**
	* Finds the vcms status where companyId = &#63; and groupId = &#63; and isPrimary = &#63; or throws a {@link com.vportal.portlet.vcms.NoSuchVcmsStatusException} if it could not be found.
	*
	* @param companyId the company id to search with
	* @param groupId the group id to search with
	* @param isPrimary the is primary to search with
	* @return the matching vcms status
	* @throws com.vportal.portlet.vcms.NoSuchVcmsStatusException if a matching vcms status could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.vportal.portlet.vcms.model.VcmsStatus findByC_G_P(
		long companyId, long groupId, boolean isPrimary)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vcms.NoSuchVcmsStatusException;

	/**
	* Finds the vcms status where companyId = &#63; and groupId = &#63; and isPrimary = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param companyId the company id to search with
	* @param groupId the group id to search with
	* @param isPrimary the is primary to search with
	* @return the matching vcms status, or <code>null</code> if a matching vcms status could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.vportal.portlet.vcms.model.VcmsStatus fetchByC_G_P(
		long companyId, long groupId, boolean isPrimary)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Finds the vcms status where companyId = &#63; and groupId = &#63; and isPrimary = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param companyId the company id to search with
	* @param groupId the group id to search with
	* @param isPrimary the is primary to search with
	* @return the matching vcms status, or <code>null</code> if a matching vcms status could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.vportal.portlet.vcms.model.VcmsStatus fetchByC_G_P(
		long companyId, long groupId, boolean isPrimary,
		boolean retrieveFromCache)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Finds all the vcms statuses where companyId = &#63; and isPrimary = &#63;.
	*
	* @param companyId the company id to search with
	* @param isPrimary the is primary to search with
	* @return the matching vcms statuses
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.vportal.portlet.vcms.model.VcmsStatus> findByC_P(
		long companyId, boolean isPrimary)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Finds a range of all the vcms statuses where companyId = &#63; and isPrimary = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param companyId the company id to search with
	* @param isPrimary the is primary to search with
	* @param start the lower bound of the range of vcms statuses to return
	* @param end the upper bound of the range of vcms statuses to return (not inclusive)
	* @return the range of matching vcms statuses
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.vportal.portlet.vcms.model.VcmsStatus> findByC_P(
		long companyId, boolean isPrimary, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Finds an ordered range of all the vcms statuses where companyId = &#63; and isPrimary = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param companyId the company id to search with
	* @param isPrimary the is primary to search with
	* @param start the lower bound of the range of vcms statuses to return
	* @param end the upper bound of the range of vcms statuses to return (not inclusive)
	* @param orderByComparator the comparator to order the results by
	* @return the ordered range of matching vcms statuses
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.vportal.portlet.vcms.model.VcmsStatus> findByC_P(
		long companyId, boolean isPrimary, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Finds the first vcms status in the ordered set where companyId = &#63; and isPrimary = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param companyId the company id to search with
	* @param isPrimary the is primary to search with
	* @param orderByComparator the comparator to order the set by
	* @return the first matching vcms status
	* @throws com.vportal.portlet.vcms.NoSuchVcmsStatusException if a matching vcms status could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.vportal.portlet.vcms.model.VcmsStatus findByC_P_First(
		long companyId, boolean isPrimary,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vcms.NoSuchVcmsStatusException;

	/**
	* Finds the last vcms status in the ordered set where companyId = &#63; and isPrimary = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param companyId the company id to search with
	* @param isPrimary the is primary to search with
	* @param orderByComparator the comparator to order the set by
	* @return the last matching vcms status
	* @throws com.vportal.portlet.vcms.NoSuchVcmsStatusException if a matching vcms status could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.vportal.portlet.vcms.model.VcmsStatus findByC_P_Last(
		long companyId, boolean isPrimary,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vcms.NoSuchVcmsStatusException;

	/**
	* Finds the vcms statuses before and after the current vcms status in the ordered set where companyId = &#63; and isPrimary = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param statusId the primary key of the current vcms status
	* @param companyId the company id to search with
	* @param isPrimary the is primary to search with
	* @param orderByComparator the comparator to order the set by
	* @return the previous, current, and next vcms status
	* @throws com.vportal.portlet.vcms.NoSuchVcmsStatusException if a vcms status with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.vportal.portlet.vcms.model.VcmsStatus[] findByC_P_PrevAndNext(
		long statusId, long companyId, boolean isPrimary,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vcms.NoSuchVcmsStatusException;

	/**
	* Finds all the vcms statuses.
	*
	* @return the vcms statuses
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.vportal.portlet.vcms.model.VcmsStatus> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Finds a range of all the vcms statuses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of vcms statuses to return
	* @param end the upper bound of the range of vcms statuses to return (not inclusive)
	* @return the range of vcms statuses
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.vportal.portlet.vcms.model.VcmsStatus> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Finds an ordered range of all the vcms statuses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of vcms statuses to return
	* @param end the upper bound of the range of vcms statuses to return (not inclusive)
	* @param orderByComparator the comparator to order the results by
	* @return the ordered range of vcms statuses
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.vportal.portlet.vcms.model.VcmsStatus> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the vcms statuses where companyId = &#63; from the database.
	*
	* @param companyId the company id to search with
	* @throws SystemException if a system exception occurred
	*/
	public void removeByCompanyId(long companyId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the vcms statuses where companyId = &#63; and groupId = &#63; from the database.
	*
	* @param companyId the company id to search with
	* @param groupId the group id to search with
	* @throws SystemException if a system exception occurred
	*/
	public void removeByC_G(long companyId, long groupId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the vcms statuses where groupId = &#63; and position = &#63; from the database.
	*
	* @param groupId the group id to search with
	* @param position the position to search with
	* @throws SystemException if a system exception occurred
	*/
	public void removeByG_P(long groupId, int position)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the vcms statuses where groupId = &#63; from the database.
	*
	* @param groupId the group id to search with
	* @throws SystemException if a system exception occurred
	*/
	public void removeByGroupId(long groupId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes the vcms status where companyId = &#63; and groupId = &#63; and active = &#63; from the database.
	*
	* @param companyId the company id to search with
	* @param groupId the group id to search with
	* @param active the active to search with
	* @throws SystemException if a system exception occurred
	*/
	public void removeByC_G_A(long companyId, long groupId, boolean active)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vcms.NoSuchVcmsStatusException;

	/**
	* Removes the vcms status where active = &#63; from the database.
	*
	* @param active the active to search with
	* @throws SystemException if a system exception occurred
	*/
	public void removeByA(boolean active)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vcms.NoSuchVcmsStatusException;

	/**
	* Removes all the vcms statuses where companyId = &#63; and active = &#63; from the database.
	*
	* @param companyId the company id to search with
	* @param active the active to search with
	* @throws SystemException if a system exception occurred
	*/
	public void removeByC_A(long companyId, boolean active)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes the vcms status where companyId = &#63; and groupId = &#63; and isPrimary = &#63; from the database.
	*
	* @param companyId the company id to search with
	* @param groupId the group id to search with
	* @param isPrimary the is primary to search with
	* @throws SystemException if a system exception occurred
	*/
	public void removeByC_G_P(long companyId, long groupId, boolean isPrimary)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vcms.NoSuchVcmsStatusException;

	/**
	* Removes all the vcms statuses where companyId = &#63; and isPrimary = &#63; from the database.
	*
	* @param companyId the company id to search with
	* @param isPrimary the is primary to search with
	* @throws SystemException if a system exception occurred
	*/
	public void removeByC_P(long companyId, boolean isPrimary)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the vcms statuses from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Counts all the vcms statuses where companyId = &#63;.
	*
	* @param companyId the company id to search with
	* @return the number of matching vcms statuses
	* @throws SystemException if a system exception occurred
	*/
	public int countByCompanyId(long companyId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Counts all the vcms statuses where companyId = &#63; and groupId = &#63;.
	*
	* @param companyId the company id to search with
	* @param groupId the group id to search with
	* @return the number of matching vcms statuses
	* @throws SystemException if a system exception occurred
	*/
	public int countByC_G(long companyId, long groupId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Filters by the user's permissions and counts all the vcms statuses where companyId = &#63; and groupId = &#63;.
	*
	* @param companyId the company id to search with
	* @param groupId the group id to search with
	* @return the number of matching vcms statuses that the user has permission to view
	* @throws SystemException if a system exception occurred
	*/
	public int filterCountByC_G(long companyId, long groupId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Counts all the vcms statuses where groupId = &#63; and position = &#63;.
	*
	* @param groupId the group id to search with
	* @param position the position to search with
	* @return the number of matching vcms statuses
	* @throws SystemException if a system exception occurred
	*/
	public int countByG_P(long groupId, int position)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Filters by the user's permissions and counts all the vcms statuses where groupId = &#63; and position = &#63;.
	*
	* @param groupId the group id to search with
	* @param position the position to search with
	* @return the number of matching vcms statuses that the user has permission to view
	* @throws SystemException if a system exception occurred
	*/
	public int filterCountByG_P(long groupId, int position)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Counts all the vcms statuses where groupId = &#63;.
	*
	* @param groupId the group id to search with
	* @return the number of matching vcms statuses
	* @throws SystemException if a system exception occurred
	*/
	public int countByGroupId(long groupId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Filters by the user's permissions and counts all the vcms statuses where groupId = &#63;.
	*
	* @param groupId the group id to search with
	* @return the number of matching vcms statuses that the user has permission to view
	* @throws SystemException if a system exception occurred
	*/
	public int filterCountByGroupId(long groupId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Counts all the vcms statuses where companyId = &#63; and groupId = &#63; and active = &#63;.
	*
	* @param companyId the company id to search with
	* @param groupId the group id to search with
	* @param active the active to search with
	* @return the number of matching vcms statuses
	* @throws SystemException if a system exception occurred
	*/
	public int countByC_G_A(long companyId, long groupId, boolean active)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Counts all the vcms statuses where active = &#63;.
	*
	* @param active the active to search with
	* @return the number of matching vcms statuses
	* @throws SystemException if a system exception occurred
	*/
	public int countByA(boolean active)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Counts all the vcms statuses where companyId = &#63; and active = &#63;.
	*
	* @param companyId the company id to search with
	* @param active the active to search with
	* @return the number of matching vcms statuses
	* @throws SystemException if a system exception occurred
	*/
	public int countByC_A(long companyId, boolean active)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Counts all the vcms statuses where companyId = &#63; and groupId = &#63; and isPrimary = &#63;.
	*
	* @param companyId the company id to search with
	* @param groupId the group id to search with
	* @param isPrimary the is primary to search with
	* @return the number of matching vcms statuses
	* @throws SystemException if a system exception occurred
	*/
	public int countByC_G_P(long companyId, long groupId, boolean isPrimary)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Counts all the vcms statuses where companyId = &#63; and isPrimary = &#63;.
	*
	* @param companyId the company id to search with
	* @param isPrimary the is primary to search with
	* @return the number of matching vcms statuses
	* @throws SystemException if a system exception occurred
	*/
	public int countByC_P(long companyId, boolean isPrimary)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Counts all the vcms statuses.
	*
	* @return the number of vcms statuses
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}