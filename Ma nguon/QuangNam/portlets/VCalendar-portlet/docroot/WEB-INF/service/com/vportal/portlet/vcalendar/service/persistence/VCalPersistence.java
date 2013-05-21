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

package com.vportal.portlet.vcalendar.service.persistence;

import com.liferay.portal.service.persistence.BasePersistence;

import com.vportal.portlet.vcalendar.model.VCal;

/**
 * The persistence interface for the v cal service.
 *
 * <p>
 * Never modify or reference this interface directly. Always use {@link VCalUtil} to access the v cal persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
 * </p>
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Admin
 * @see VCalPersistenceImpl
 * @see VCalUtil
 * @generated
 */
public interface VCalPersistence extends BasePersistence<VCal> {
	/**
	* Caches the v cal in the entity cache if it is enabled.
	*
	* @param vCal the v cal to cache
	*/
	public void cacheResult(com.vportal.portlet.vcalendar.model.VCal vCal);

	/**
	* Caches the v cals in the entity cache if it is enabled.
	*
	* @param vCals the v cals to cache
	*/
	public void cacheResult(
		java.util.List<com.vportal.portlet.vcalendar.model.VCal> vCals);

	/**
	* Creates a new v cal with the primary key. Does not add the v cal to the database.
	*
	* @param calId the primary key for the new v cal
	* @return the new v cal
	*/
	public com.vportal.portlet.vcalendar.model.VCal create(long calId);

	/**
	* Removes the v cal with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param calId the primary key of the v cal to remove
	* @return the v cal that was removed
	* @throws com.vportal.portlet.vcalendar.NoSuchVCalException if a v cal with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.vportal.portlet.vcalendar.model.VCal remove(long calId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vcalendar.NoSuchVCalException;

	public com.vportal.portlet.vcalendar.model.VCal updateImpl(
		com.vportal.portlet.vcalendar.model.VCal vCal, boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Finds the v cal with the primary key or throws a {@link com.vportal.portlet.vcalendar.NoSuchVCalException} if it could not be found.
	*
	* @param calId the primary key of the v cal to find
	* @return the v cal
	* @throws com.vportal.portlet.vcalendar.NoSuchVCalException if a v cal with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.vportal.portlet.vcalendar.model.VCal findByPrimaryKey(long calId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vcalendar.NoSuchVCalException;

	/**
	* Finds the v cal with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param calId the primary key of the v cal to find
	* @return the v cal, or <code>null</code> if a v cal with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.vportal.portlet.vcalendar.model.VCal fetchByPrimaryKey(
		long calId) throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Finds all the v cals where startDate = &#63; and status = &#63; and groupId = &#63;.
	*
	* @param startDate the start date to search with
	* @param status the status to search with
	* @param groupId the group id to search with
	* @return the matching v cals
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.vportal.portlet.vcalendar.model.VCal> findByD_S_G(
		java.util.Date startDate, int status, long groupId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Finds a range of all the v cals where startDate = &#63; and status = &#63; and groupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param startDate the start date to search with
	* @param status the status to search with
	* @param groupId the group id to search with
	* @param start the lower bound of the range of v cals to return
	* @param end the upper bound of the range of v cals to return (not inclusive)
	* @return the range of matching v cals
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.vportal.portlet.vcalendar.model.VCal> findByD_S_G(
		java.util.Date startDate, int status, long groupId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Finds an ordered range of all the v cals where startDate = &#63; and status = &#63; and groupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param startDate the start date to search with
	* @param status the status to search with
	* @param groupId the group id to search with
	* @param start the lower bound of the range of v cals to return
	* @param end the upper bound of the range of v cals to return (not inclusive)
	* @param orderByComparator the comparator to order the results by
	* @return the ordered range of matching v cals
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.vportal.portlet.vcalendar.model.VCal> findByD_S_G(
		java.util.Date startDate, int status, long groupId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Finds the first v cal in the ordered set where startDate = &#63; and status = &#63; and groupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param startDate the start date to search with
	* @param status the status to search with
	* @param groupId the group id to search with
	* @param orderByComparator the comparator to order the set by
	* @return the first matching v cal
	* @throws com.vportal.portlet.vcalendar.NoSuchVCalException if a matching v cal could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.vportal.portlet.vcalendar.model.VCal findByD_S_G_First(
		java.util.Date startDate, int status, long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vcalendar.NoSuchVCalException;

	/**
	* Finds the last v cal in the ordered set where startDate = &#63; and status = &#63; and groupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param startDate the start date to search with
	* @param status the status to search with
	* @param groupId the group id to search with
	* @param orderByComparator the comparator to order the set by
	* @return the last matching v cal
	* @throws com.vportal.portlet.vcalendar.NoSuchVCalException if a matching v cal could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.vportal.portlet.vcalendar.model.VCal findByD_S_G_Last(
		java.util.Date startDate, int status, long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vcalendar.NoSuchVCalException;

	/**
	* Finds the v cals before and after the current v cal in the ordered set where startDate = &#63; and status = &#63; and groupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param calId the primary key of the current v cal
	* @param startDate the start date to search with
	* @param status the status to search with
	* @param groupId the group id to search with
	* @param orderByComparator the comparator to order the set by
	* @return the previous, current, and next v cal
	* @throws com.vportal.portlet.vcalendar.NoSuchVCalException if a v cal with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.vportal.portlet.vcalendar.model.VCal[] findByD_S_G_PrevAndNext(
		long calId, java.util.Date startDate, int status, long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vcalendar.NoSuchVCalException;

	/**
	* Finds all the v cals where userId = &#63; and startDate = &#63; and status = &#63;.
	*
	* @param userId the user id to search with
	* @param startDate the start date to search with
	* @param status the status to search with
	* @return the matching v cals
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.vportal.portlet.vcalendar.model.VCal> findByU_D_S(
		long userId, java.util.Date startDate, int status)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Finds a range of all the v cals where userId = &#63; and startDate = &#63; and status = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param userId the user id to search with
	* @param startDate the start date to search with
	* @param status the status to search with
	* @param start the lower bound of the range of v cals to return
	* @param end the upper bound of the range of v cals to return (not inclusive)
	* @return the range of matching v cals
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.vportal.portlet.vcalendar.model.VCal> findByU_D_S(
		long userId, java.util.Date startDate, int status, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Finds an ordered range of all the v cals where userId = &#63; and startDate = &#63; and status = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param userId the user id to search with
	* @param startDate the start date to search with
	* @param status the status to search with
	* @param start the lower bound of the range of v cals to return
	* @param end the upper bound of the range of v cals to return (not inclusive)
	* @param orderByComparator the comparator to order the results by
	* @return the ordered range of matching v cals
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.vportal.portlet.vcalendar.model.VCal> findByU_D_S(
		long userId, java.util.Date startDate, int status, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Finds the first v cal in the ordered set where userId = &#63; and startDate = &#63; and status = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param userId the user id to search with
	* @param startDate the start date to search with
	* @param status the status to search with
	* @param orderByComparator the comparator to order the set by
	* @return the first matching v cal
	* @throws com.vportal.portlet.vcalendar.NoSuchVCalException if a matching v cal could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.vportal.portlet.vcalendar.model.VCal findByU_D_S_First(
		long userId, java.util.Date startDate, int status,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vcalendar.NoSuchVCalException;

	/**
	* Finds the last v cal in the ordered set where userId = &#63; and startDate = &#63; and status = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param userId the user id to search with
	* @param startDate the start date to search with
	* @param status the status to search with
	* @param orderByComparator the comparator to order the set by
	* @return the last matching v cal
	* @throws com.vportal.portlet.vcalendar.NoSuchVCalException if a matching v cal could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.vportal.portlet.vcalendar.model.VCal findByU_D_S_Last(
		long userId, java.util.Date startDate, int status,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vcalendar.NoSuchVCalException;

	/**
	* Finds the v cals before and after the current v cal in the ordered set where userId = &#63; and startDate = &#63; and status = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param calId the primary key of the current v cal
	* @param userId the user id to search with
	* @param startDate the start date to search with
	* @param status the status to search with
	* @param orderByComparator the comparator to order the set by
	* @return the previous, current, and next v cal
	* @throws com.vportal.portlet.vcalendar.NoSuchVCalException if a v cal with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.vportal.portlet.vcalendar.model.VCal[] findByU_D_S_PrevAndNext(
		long calId, long userId, java.util.Date startDate, int status,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vcalendar.NoSuchVCalException;

	/**
	* Finds all the v cals where startDate = &#63; and status = &#63;.
	*
	* @param startDate the start date to search with
	* @param status the status to search with
	* @return the matching v cals
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.vportal.portlet.vcalendar.model.VCal> findByD_S(
		java.util.Date startDate, int status)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Finds a range of all the v cals where startDate = &#63; and status = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param startDate the start date to search with
	* @param status the status to search with
	* @param start the lower bound of the range of v cals to return
	* @param end the upper bound of the range of v cals to return (not inclusive)
	* @return the range of matching v cals
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.vportal.portlet.vcalendar.model.VCal> findByD_S(
		java.util.Date startDate, int status, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Finds an ordered range of all the v cals where startDate = &#63; and status = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param startDate the start date to search with
	* @param status the status to search with
	* @param start the lower bound of the range of v cals to return
	* @param end the upper bound of the range of v cals to return (not inclusive)
	* @param orderByComparator the comparator to order the results by
	* @return the ordered range of matching v cals
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.vportal.portlet.vcalendar.model.VCal> findByD_S(
		java.util.Date startDate, int status, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Finds the first v cal in the ordered set where startDate = &#63; and status = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param startDate the start date to search with
	* @param status the status to search with
	* @param orderByComparator the comparator to order the set by
	* @return the first matching v cal
	* @throws com.vportal.portlet.vcalendar.NoSuchVCalException if a matching v cal could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.vportal.portlet.vcalendar.model.VCal findByD_S_First(
		java.util.Date startDate, int status,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vcalendar.NoSuchVCalException;

	/**
	* Finds the last v cal in the ordered set where startDate = &#63; and status = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param startDate the start date to search with
	* @param status the status to search with
	* @param orderByComparator the comparator to order the set by
	* @return the last matching v cal
	* @throws com.vportal.portlet.vcalendar.NoSuchVCalException if a matching v cal could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.vportal.portlet.vcalendar.model.VCal findByD_S_Last(
		java.util.Date startDate, int status,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vcalendar.NoSuchVCalException;

	/**
	* Finds the v cals before and after the current v cal in the ordered set where startDate = &#63; and status = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param calId the primary key of the current v cal
	* @param startDate the start date to search with
	* @param status the status to search with
	* @param orderByComparator the comparator to order the set by
	* @return the previous, current, and next v cal
	* @throws com.vportal.portlet.vcalendar.NoSuchVCalException if a v cal with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.vportal.portlet.vcalendar.model.VCal[] findByD_S_PrevAndNext(
		long calId, java.util.Date startDate, int status,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vcalendar.NoSuchVCalException;

	/**
	* Finds all the v cals where userId = &#63; and startDate = &#63; and groupId = &#63; and status = &#63;.
	*
	* @param userId the user id to search with
	* @param startDate the start date to search with
	* @param groupId the group id to search with
	* @param status the status to search with
	* @return the matching v cals
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.vportal.portlet.vcalendar.model.VCal> findByF_D_G_T(
		long userId, java.util.Date startDate, long groupId, int status)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Finds a range of all the v cals where userId = &#63; and startDate = &#63; and groupId = &#63; and status = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param userId the user id to search with
	* @param startDate the start date to search with
	* @param groupId the group id to search with
	* @param status the status to search with
	* @param start the lower bound of the range of v cals to return
	* @param end the upper bound of the range of v cals to return (not inclusive)
	* @return the range of matching v cals
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.vportal.portlet.vcalendar.model.VCal> findByF_D_G_T(
		long userId, java.util.Date startDate, long groupId, int status,
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Finds an ordered range of all the v cals where userId = &#63; and startDate = &#63; and groupId = &#63; and status = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param userId the user id to search with
	* @param startDate the start date to search with
	* @param groupId the group id to search with
	* @param status the status to search with
	* @param start the lower bound of the range of v cals to return
	* @param end the upper bound of the range of v cals to return (not inclusive)
	* @param orderByComparator the comparator to order the results by
	* @return the ordered range of matching v cals
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.vportal.portlet.vcalendar.model.VCal> findByF_D_G_T(
		long userId, java.util.Date startDate, long groupId, int status,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Finds the first v cal in the ordered set where userId = &#63; and startDate = &#63; and groupId = &#63; and status = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param userId the user id to search with
	* @param startDate the start date to search with
	* @param groupId the group id to search with
	* @param status the status to search with
	* @param orderByComparator the comparator to order the set by
	* @return the first matching v cal
	* @throws com.vportal.portlet.vcalendar.NoSuchVCalException if a matching v cal could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.vportal.portlet.vcalendar.model.VCal findByF_D_G_T_First(
		long userId, java.util.Date startDate, long groupId, int status,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vcalendar.NoSuchVCalException;

	/**
	* Finds the last v cal in the ordered set where userId = &#63; and startDate = &#63; and groupId = &#63; and status = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param userId the user id to search with
	* @param startDate the start date to search with
	* @param groupId the group id to search with
	* @param status the status to search with
	* @param orderByComparator the comparator to order the set by
	* @return the last matching v cal
	* @throws com.vportal.portlet.vcalendar.NoSuchVCalException if a matching v cal could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.vportal.portlet.vcalendar.model.VCal findByF_D_G_T_Last(
		long userId, java.util.Date startDate, long groupId, int status,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vcalendar.NoSuchVCalException;

	/**
	* Finds the v cals before and after the current v cal in the ordered set where userId = &#63; and startDate = &#63; and groupId = &#63; and status = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param calId the primary key of the current v cal
	* @param userId the user id to search with
	* @param startDate the start date to search with
	* @param groupId the group id to search with
	* @param status the status to search with
	* @param orderByComparator the comparator to order the set by
	* @return the previous, current, and next v cal
	* @throws com.vportal.portlet.vcalendar.NoSuchVCalException if a v cal with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.vportal.portlet.vcalendar.model.VCal[] findByF_D_G_T_PrevAndNext(
		long calId, long userId, java.util.Date startDate, long groupId,
		int status,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vcalendar.NoSuchVCalException;

	/**
	* Finds all the v cals where userId = &#63; and startDate = &#63; and groupId = &#63;.
	*
	* @param userId the user id to search with
	* @param startDate the start date to search with
	* @param groupId the group id to search with
	* @return the matching v cals
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.vportal.portlet.vcalendar.model.VCal> findByUser(
		long userId, java.util.Date startDate, long groupId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Finds a range of all the v cals where userId = &#63; and startDate = &#63; and groupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param userId the user id to search with
	* @param startDate the start date to search with
	* @param groupId the group id to search with
	* @param start the lower bound of the range of v cals to return
	* @param end the upper bound of the range of v cals to return (not inclusive)
	* @return the range of matching v cals
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.vportal.portlet.vcalendar.model.VCal> findByUser(
		long userId, java.util.Date startDate, long groupId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Finds an ordered range of all the v cals where userId = &#63; and startDate = &#63; and groupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param userId the user id to search with
	* @param startDate the start date to search with
	* @param groupId the group id to search with
	* @param start the lower bound of the range of v cals to return
	* @param end the upper bound of the range of v cals to return (not inclusive)
	* @param orderByComparator the comparator to order the results by
	* @return the ordered range of matching v cals
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.vportal.portlet.vcalendar.model.VCal> findByUser(
		long userId, java.util.Date startDate, long groupId, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Finds the first v cal in the ordered set where userId = &#63; and startDate = &#63; and groupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param userId the user id to search with
	* @param startDate the start date to search with
	* @param groupId the group id to search with
	* @param orderByComparator the comparator to order the set by
	* @return the first matching v cal
	* @throws com.vportal.portlet.vcalendar.NoSuchVCalException if a matching v cal could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.vportal.portlet.vcalendar.model.VCal findByUser_First(
		long userId, java.util.Date startDate, long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vcalendar.NoSuchVCalException;

	/**
	* Finds the last v cal in the ordered set where userId = &#63; and startDate = &#63; and groupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param userId the user id to search with
	* @param startDate the start date to search with
	* @param groupId the group id to search with
	* @param orderByComparator the comparator to order the set by
	* @return the last matching v cal
	* @throws com.vportal.portlet.vcalendar.NoSuchVCalException if a matching v cal could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.vportal.portlet.vcalendar.model.VCal findByUser_Last(
		long userId, java.util.Date startDate, long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vcalendar.NoSuchVCalException;

	/**
	* Finds the v cals before and after the current v cal in the ordered set where userId = &#63; and startDate = &#63; and groupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param calId the primary key of the current v cal
	* @param userId the user id to search with
	* @param startDate the start date to search with
	* @param groupId the group id to search with
	* @param orderByComparator the comparator to order the set by
	* @return the previous, current, and next v cal
	* @throws com.vportal.portlet.vcalendar.NoSuchVCalException if a v cal with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.vportal.portlet.vcalendar.model.VCal[] findByUser_PrevAndNext(
		long calId, long userId, java.util.Date startDate, long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vcalendar.NoSuchVCalException;

	/**
	* Finds all the v cals where groupId = &#63;.
	*
	* @param groupId the group id to search with
	* @return the matching v cals
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.vportal.portlet.vcalendar.model.VCal> findByUserGroup(
		long groupId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Finds a range of all the v cals where groupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param groupId the group id to search with
	* @param start the lower bound of the range of v cals to return
	* @param end the upper bound of the range of v cals to return (not inclusive)
	* @return the range of matching v cals
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.vportal.portlet.vcalendar.model.VCal> findByUserGroup(
		long groupId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Finds an ordered range of all the v cals where groupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param groupId the group id to search with
	* @param start the lower bound of the range of v cals to return
	* @param end the upper bound of the range of v cals to return (not inclusive)
	* @param orderByComparator the comparator to order the results by
	* @return the ordered range of matching v cals
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.vportal.portlet.vcalendar.model.VCal> findByUserGroup(
		long groupId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Finds the first v cal in the ordered set where groupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param groupId the group id to search with
	* @param orderByComparator the comparator to order the set by
	* @return the first matching v cal
	* @throws com.vportal.portlet.vcalendar.NoSuchVCalException if a matching v cal could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.vportal.portlet.vcalendar.model.VCal findByUserGroup_First(
		long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vcalendar.NoSuchVCalException;

	/**
	* Finds the last v cal in the ordered set where groupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param groupId the group id to search with
	* @param orderByComparator the comparator to order the set by
	* @return the last matching v cal
	* @throws com.vportal.portlet.vcalendar.NoSuchVCalException if a matching v cal could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.vportal.portlet.vcalendar.model.VCal findByUserGroup_Last(
		long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vcalendar.NoSuchVCalException;

	/**
	* Finds the v cals before and after the current v cal in the ordered set where groupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param calId the primary key of the current v cal
	* @param groupId the group id to search with
	* @param orderByComparator the comparator to order the set by
	* @return the previous, current, and next v cal
	* @throws com.vportal.portlet.vcalendar.NoSuchVCalException if a v cal with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.vportal.portlet.vcalendar.model.VCal[] findByUserGroup_PrevAndNext(
		long calId, long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vcalendar.NoSuchVCalException;

	/**
	* Finds all the v cals where fileId = &#63;.
	*
	* @param fileId the file id to search with
	* @return the matching v cals
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.vportal.portlet.vcalendar.model.VCal> findByFileId(
		long fileId) throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Finds a range of all the v cals where fileId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param fileId the file id to search with
	* @param start the lower bound of the range of v cals to return
	* @param end the upper bound of the range of v cals to return (not inclusive)
	* @return the range of matching v cals
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.vportal.portlet.vcalendar.model.VCal> findByFileId(
		long fileId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Finds an ordered range of all the v cals where fileId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param fileId the file id to search with
	* @param start the lower bound of the range of v cals to return
	* @param end the upper bound of the range of v cals to return (not inclusive)
	* @param orderByComparator the comparator to order the results by
	* @return the ordered range of matching v cals
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.vportal.portlet.vcalendar.model.VCal> findByFileId(
		long fileId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Finds the first v cal in the ordered set where fileId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param fileId the file id to search with
	* @param orderByComparator the comparator to order the set by
	* @return the first matching v cal
	* @throws com.vportal.portlet.vcalendar.NoSuchVCalException if a matching v cal could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.vportal.portlet.vcalendar.model.VCal findByFileId_First(
		long fileId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vcalendar.NoSuchVCalException;

	/**
	* Finds the last v cal in the ordered set where fileId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param fileId the file id to search with
	* @param orderByComparator the comparator to order the set by
	* @return the last matching v cal
	* @throws com.vportal.portlet.vcalendar.NoSuchVCalException if a matching v cal could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.vportal.portlet.vcalendar.model.VCal findByFileId_Last(
		long fileId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vcalendar.NoSuchVCalException;

	/**
	* Finds the v cals before and after the current v cal in the ordered set where fileId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param calId the primary key of the current v cal
	* @param fileId the file id to search with
	* @param orderByComparator the comparator to order the set by
	* @return the previous, current, and next v cal
	* @throws com.vportal.portlet.vcalendar.NoSuchVCalException if a v cal with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.vportal.portlet.vcalendar.model.VCal[] findByFileId_PrevAndNext(
		long calId, long fileId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vcalendar.NoSuchVCalException;

	/**
	* Finds all the v cals.
	*
	* @return the v cals
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.vportal.portlet.vcalendar.model.VCal> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Finds a range of all the v cals.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of v cals to return
	* @param end the upper bound of the range of v cals to return (not inclusive)
	* @return the range of v cals
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.vportal.portlet.vcalendar.model.VCal> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Finds an ordered range of all the v cals.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of v cals to return
	* @param end the upper bound of the range of v cals to return (not inclusive)
	* @param orderByComparator the comparator to order the results by
	* @return the ordered range of v cals
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.vportal.portlet.vcalendar.model.VCal> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the v cals where startDate = &#63; and status = &#63; and groupId = &#63; from the database.
	*
	* @param startDate the start date to search with
	* @param status the status to search with
	* @param groupId the group id to search with
	* @throws SystemException if a system exception occurred
	*/
	public void removeByD_S_G(java.util.Date startDate, int status, long groupId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the v cals where userId = &#63; and startDate = &#63; and status = &#63; from the database.
	*
	* @param userId the user id to search with
	* @param startDate the start date to search with
	* @param status the status to search with
	* @throws SystemException if a system exception occurred
	*/
	public void removeByU_D_S(long userId, java.util.Date startDate, int status)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the v cals where startDate = &#63; and status = &#63; from the database.
	*
	* @param startDate the start date to search with
	* @param status the status to search with
	* @throws SystemException if a system exception occurred
	*/
	public void removeByD_S(java.util.Date startDate, int status)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the v cals where userId = &#63; and startDate = &#63; and groupId = &#63; and status = &#63; from the database.
	*
	* @param userId the user id to search with
	* @param startDate the start date to search with
	* @param groupId the group id to search with
	* @param status the status to search with
	* @throws SystemException if a system exception occurred
	*/
	public void removeByF_D_G_T(long userId, java.util.Date startDate,
		long groupId, int status)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the v cals where userId = &#63; and startDate = &#63; and groupId = &#63; from the database.
	*
	* @param userId the user id to search with
	* @param startDate the start date to search with
	* @param groupId the group id to search with
	* @throws SystemException if a system exception occurred
	*/
	public void removeByUser(long userId, java.util.Date startDate, long groupId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the v cals where groupId = &#63; from the database.
	*
	* @param groupId the group id to search with
	* @throws SystemException if a system exception occurred
	*/
	public void removeByUserGroup(long groupId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the v cals where fileId = &#63; from the database.
	*
	* @param fileId the file id to search with
	* @throws SystemException if a system exception occurred
	*/
	public void removeByFileId(long fileId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the v cals from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Counts all the v cals where startDate = &#63; and status = &#63; and groupId = &#63;.
	*
	* @param startDate the start date to search with
	* @param status the status to search with
	* @param groupId the group id to search with
	* @return the number of matching v cals
	* @throws SystemException if a system exception occurred
	*/
	public int countByD_S_G(java.util.Date startDate, int status, long groupId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Counts all the v cals where userId = &#63; and startDate = &#63; and status = &#63;.
	*
	* @param userId the user id to search with
	* @param startDate the start date to search with
	* @param status the status to search with
	* @return the number of matching v cals
	* @throws SystemException if a system exception occurred
	*/
	public int countByU_D_S(long userId, java.util.Date startDate, int status)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Counts all the v cals where startDate = &#63; and status = &#63;.
	*
	* @param startDate the start date to search with
	* @param status the status to search with
	* @return the number of matching v cals
	* @throws SystemException if a system exception occurred
	*/
	public int countByD_S(java.util.Date startDate, int status)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Counts all the v cals where userId = &#63; and startDate = &#63; and groupId = &#63; and status = &#63;.
	*
	* @param userId the user id to search with
	* @param startDate the start date to search with
	* @param groupId the group id to search with
	* @param status the status to search with
	* @return the number of matching v cals
	* @throws SystemException if a system exception occurred
	*/
	public int countByF_D_G_T(long userId, java.util.Date startDate,
		long groupId, int status)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Counts all the v cals where userId = &#63; and startDate = &#63; and groupId = &#63;.
	*
	* @param userId the user id to search with
	* @param startDate the start date to search with
	* @param groupId the group id to search with
	* @return the number of matching v cals
	* @throws SystemException if a system exception occurred
	*/
	public int countByUser(long userId, java.util.Date startDate, long groupId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Counts all the v cals where groupId = &#63;.
	*
	* @param groupId the group id to search with
	* @return the number of matching v cals
	* @throws SystemException if a system exception occurred
	*/
	public int countByUserGroup(long groupId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Counts all the v cals where fileId = &#63;.
	*
	* @param fileId the file id to search with
	* @return the number of matching v cals
	* @throws SystemException if a system exception occurred
	*/
	public int countByFileId(long fileId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Counts all the v cals.
	*
	* @return the number of v cals
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}