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

import com.vportal.portlet.vlegal.model.VLegalLogger;

/**
 * The persistence interface for the v legal logger service.
 *
 * <p>
 * Never modify or reference this interface directly. Always use {@link VLegalLoggerUtil} to access the v legal logger persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
 * </p>
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author ACB
 * @see VLegalLoggerPersistenceImpl
 * @see VLegalLoggerUtil
 * @generated
 */
public interface VLegalLoggerPersistence extends BasePersistence<VLegalLogger> {
	/**
	* Caches the v legal logger in the entity cache if it is enabled.
	*
	* @param vLegalLogger the v legal logger to cache
	*/
	public void cacheResult(
		com.vportal.portlet.vlegal.model.VLegalLogger vLegalLogger);

	/**
	* Caches the v legal loggers in the entity cache if it is enabled.
	*
	* @param vLegalLoggers the v legal loggers to cache
	*/
	public void cacheResult(
		java.util.List<com.vportal.portlet.vlegal.model.VLegalLogger> vLegalLoggers);

	/**
	* Creates a new v legal logger with the primary key. Does not add the v legal logger to the database.
	*
	* @param loggerId the primary key for the new v legal logger
	* @return the new v legal logger
	*/
	public com.vportal.portlet.vlegal.model.VLegalLogger create(
		java.lang.String loggerId);

	/**
	* Removes the v legal logger with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param loggerId the primary key of the v legal logger to remove
	* @return the v legal logger that was removed
	* @throws com.vportal.portlet.vlegal.NoSuchVLegalLoggerException if a v legal logger with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.vportal.portlet.vlegal.model.VLegalLogger remove(
		java.lang.String loggerId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vlegal.NoSuchVLegalLoggerException;

	public com.vportal.portlet.vlegal.model.VLegalLogger updateImpl(
		com.vportal.portlet.vlegal.model.VLegalLogger vLegalLogger,
		boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Finds the v legal logger with the primary key or throws a {@link com.vportal.portlet.vlegal.NoSuchVLegalLoggerException} if it could not be found.
	*
	* @param loggerId the primary key of the v legal logger to find
	* @return the v legal logger
	* @throws com.vportal.portlet.vlegal.NoSuchVLegalLoggerException if a v legal logger with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.vportal.portlet.vlegal.model.VLegalLogger findByPrimaryKey(
		java.lang.String loggerId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vlegal.NoSuchVLegalLoggerException;

	/**
	* Finds the v legal logger with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param loggerId the primary key of the v legal logger to find
	* @return the v legal logger, or <code>null</code> if a v legal logger with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.vportal.portlet.vlegal.model.VLegalLogger fetchByPrimaryKey(
		java.lang.String loggerId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Finds the v legal logger where groupId = &#63; and loggerId = &#63; or throws a {@link com.vportal.portlet.vlegal.NoSuchVLegalLoggerException} if it could not be found.
	*
	* @param groupId the group id to search with
	* @param loggerId the logger id to search with
	* @return the matching v legal logger
	* @throws com.vportal.portlet.vlegal.NoSuchVLegalLoggerException if a matching v legal logger could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.vportal.portlet.vlegal.model.VLegalLogger findByG_L(
		long groupId, java.lang.String loggerId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vlegal.NoSuchVLegalLoggerException;

	/**
	* Finds the v legal logger where groupId = &#63; and loggerId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param groupId the group id to search with
	* @param loggerId the logger id to search with
	* @return the matching v legal logger, or <code>null</code> if a matching v legal logger could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.vportal.portlet.vlegal.model.VLegalLogger fetchByG_L(
		long groupId, java.lang.String loggerId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Finds the v legal logger where groupId = &#63; and loggerId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param groupId the group id to search with
	* @param loggerId the logger id to search with
	* @return the matching v legal logger, or <code>null</code> if a matching v legal logger could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.vportal.portlet.vlegal.model.VLegalLogger fetchByG_L(
		long groupId, java.lang.String loggerId, boolean retrieveFromCache)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Finds all the v legal loggers where groupId = &#63; and createdByUser = &#63; and createdDate = &#63;.
	*
	* @param groupId the group id to search with
	* @param createdByUser the created by user to search with
	* @param createdDate the created date to search with
	* @return the matching v legal loggers
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.vportal.portlet.vlegal.model.VLegalLogger> findByU_D(
		long groupId, long createdByUser, java.util.Date createdDate)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Finds a range of all the v legal loggers where groupId = &#63; and createdByUser = &#63; and createdDate = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param groupId the group id to search with
	* @param createdByUser the created by user to search with
	* @param createdDate the created date to search with
	* @param start the lower bound of the range of v legal loggers to return
	* @param end the upper bound of the range of v legal loggers to return (not inclusive)
	* @return the range of matching v legal loggers
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.vportal.portlet.vlegal.model.VLegalLogger> findByU_D(
		long groupId, long createdByUser, java.util.Date createdDate,
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Finds an ordered range of all the v legal loggers where groupId = &#63; and createdByUser = &#63; and createdDate = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param groupId the group id to search with
	* @param createdByUser the created by user to search with
	* @param createdDate the created date to search with
	* @param start the lower bound of the range of v legal loggers to return
	* @param end the upper bound of the range of v legal loggers to return (not inclusive)
	* @param orderByComparator the comparator to order the results by
	* @return the ordered range of matching v legal loggers
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.vportal.portlet.vlegal.model.VLegalLogger> findByU_D(
		long groupId, long createdByUser, java.util.Date createdDate,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Finds the first v legal logger in the ordered set where groupId = &#63; and createdByUser = &#63; and createdDate = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param groupId the group id to search with
	* @param createdByUser the created by user to search with
	* @param createdDate the created date to search with
	* @param orderByComparator the comparator to order the set by
	* @return the first matching v legal logger
	* @throws com.vportal.portlet.vlegal.NoSuchVLegalLoggerException if a matching v legal logger could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.vportal.portlet.vlegal.model.VLegalLogger findByU_D_First(
		long groupId, long createdByUser, java.util.Date createdDate,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vlegal.NoSuchVLegalLoggerException;

	/**
	* Finds the last v legal logger in the ordered set where groupId = &#63; and createdByUser = &#63; and createdDate = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param groupId the group id to search with
	* @param createdByUser the created by user to search with
	* @param createdDate the created date to search with
	* @param orderByComparator the comparator to order the set by
	* @return the last matching v legal logger
	* @throws com.vportal.portlet.vlegal.NoSuchVLegalLoggerException if a matching v legal logger could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.vportal.portlet.vlegal.model.VLegalLogger findByU_D_Last(
		long groupId, long createdByUser, java.util.Date createdDate,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vlegal.NoSuchVLegalLoggerException;

	/**
	* Finds the v legal loggers before and after the current v legal logger in the ordered set where groupId = &#63; and createdByUser = &#63; and createdDate = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param loggerId the primary key of the current v legal logger
	* @param groupId the group id to search with
	* @param createdByUser the created by user to search with
	* @param createdDate the created date to search with
	* @param orderByComparator the comparator to order the set by
	* @return the previous, current, and next v legal logger
	* @throws com.vportal.portlet.vlegal.NoSuchVLegalLoggerException if a v legal logger with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.vportal.portlet.vlegal.model.VLegalLogger[] findByU_D_PrevAndNext(
		java.lang.String loggerId, long groupId, long createdByUser,
		java.util.Date createdDate,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vlegal.NoSuchVLegalLoggerException;

	/**
	* Finds all the v legal loggers where groupId = &#63;.
	*
	* @param groupId the group id to search with
	* @return the matching v legal loggers
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.vportal.portlet.vlegal.model.VLegalLogger> findByGroupId(
		long groupId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Finds a range of all the v legal loggers where groupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param groupId the group id to search with
	* @param start the lower bound of the range of v legal loggers to return
	* @param end the upper bound of the range of v legal loggers to return (not inclusive)
	* @return the range of matching v legal loggers
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.vportal.portlet.vlegal.model.VLegalLogger> findByGroupId(
		long groupId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Finds an ordered range of all the v legal loggers where groupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param groupId the group id to search with
	* @param start the lower bound of the range of v legal loggers to return
	* @param end the upper bound of the range of v legal loggers to return (not inclusive)
	* @param orderByComparator the comparator to order the results by
	* @return the ordered range of matching v legal loggers
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.vportal.portlet.vlegal.model.VLegalLogger> findByGroupId(
		long groupId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Finds the first v legal logger in the ordered set where groupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param groupId the group id to search with
	* @param orderByComparator the comparator to order the set by
	* @return the first matching v legal logger
	* @throws com.vportal.portlet.vlegal.NoSuchVLegalLoggerException if a matching v legal logger could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.vportal.portlet.vlegal.model.VLegalLogger findByGroupId_First(
		long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vlegal.NoSuchVLegalLoggerException;

	/**
	* Finds the last v legal logger in the ordered set where groupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param groupId the group id to search with
	* @param orderByComparator the comparator to order the set by
	* @return the last matching v legal logger
	* @throws com.vportal.portlet.vlegal.NoSuchVLegalLoggerException if a matching v legal logger could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.vportal.portlet.vlegal.model.VLegalLogger findByGroupId_Last(
		long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vlegal.NoSuchVLegalLoggerException;

	/**
	* Finds the v legal loggers before and after the current v legal logger in the ordered set where groupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param loggerId the primary key of the current v legal logger
	* @param groupId the group id to search with
	* @param orderByComparator the comparator to order the set by
	* @return the previous, current, and next v legal logger
	* @throws com.vportal.portlet.vlegal.NoSuchVLegalLoggerException if a v legal logger with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.vportal.portlet.vlegal.model.VLegalLogger[] findByGroupId_PrevAndNext(
		java.lang.String loggerId, long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vlegal.NoSuchVLegalLoggerException;

	/**
	* Finds all the v legal loggers.
	*
	* @return the v legal loggers
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.vportal.portlet.vlegal.model.VLegalLogger> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Finds a range of all the v legal loggers.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of v legal loggers to return
	* @param end the upper bound of the range of v legal loggers to return (not inclusive)
	* @return the range of v legal loggers
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.vportal.portlet.vlegal.model.VLegalLogger> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Finds an ordered range of all the v legal loggers.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of v legal loggers to return
	* @param end the upper bound of the range of v legal loggers to return (not inclusive)
	* @param orderByComparator the comparator to order the results by
	* @return the ordered range of v legal loggers
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.vportal.portlet.vlegal.model.VLegalLogger> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes the v legal logger where groupId = &#63; and loggerId = &#63; from the database.
	*
	* @param groupId the group id to search with
	* @param loggerId the logger id to search with
	* @throws SystemException if a system exception occurred
	*/
	public void removeByG_L(long groupId, java.lang.String loggerId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vlegal.NoSuchVLegalLoggerException;

	/**
	* Removes all the v legal loggers where groupId = &#63; and createdByUser = &#63; and createdDate = &#63; from the database.
	*
	* @param groupId the group id to search with
	* @param createdByUser the created by user to search with
	* @param createdDate the created date to search with
	* @throws SystemException if a system exception occurred
	*/
	public void removeByU_D(long groupId, long createdByUser,
		java.util.Date createdDate)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the v legal loggers where groupId = &#63; from the database.
	*
	* @param groupId the group id to search with
	* @throws SystemException if a system exception occurred
	*/
	public void removeByGroupId(long groupId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the v legal loggers from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Counts all the v legal loggers where groupId = &#63; and loggerId = &#63;.
	*
	* @param groupId the group id to search with
	* @param loggerId the logger id to search with
	* @return the number of matching v legal loggers
	* @throws SystemException if a system exception occurred
	*/
	public int countByG_L(long groupId, java.lang.String loggerId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Counts all the v legal loggers where groupId = &#63; and createdByUser = &#63; and createdDate = &#63;.
	*
	* @param groupId the group id to search with
	* @param createdByUser the created by user to search with
	* @param createdDate the created date to search with
	* @return the number of matching v legal loggers
	* @throws SystemException if a system exception occurred
	*/
	public int countByU_D(long groupId, long createdByUser,
		java.util.Date createdDate)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Counts all the v legal loggers where groupId = &#63;.
	*
	* @param groupId the group id to search with
	* @return the number of matching v legal loggers
	* @throws SystemException if a system exception occurred
	*/
	public int countByGroupId(long groupId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Counts all the v legal loggers.
	*
	* @return the number of v legal loggers
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}