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

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.service.ServiceContext;

import com.vportal.portlet.vlegal.model.VLegalLogger;

import java.util.List;

/**
 * The persistence utility for the v legal logger service. This utility wraps {@link VLegalLoggerPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Never modify this class directly. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
 * </p>
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author ACB
 * @see VLegalLoggerPersistence
 * @see VLegalLoggerPersistenceImpl
 * @generated
 */
public class VLegalLoggerUtil {
	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#clearCache()
	 */
	public static void clearCache() {
		getPersistence().clearCache();
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#clearCache(com.liferay.portal.model.BaseModel)
	 */
	public static void clearCache(VLegalLogger vLegalLogger) {
		getPersistence().clearCache(vLegalLogger);
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
	public static List<VLegalLogger> findWithDynamicQuery(
		DynamicQuery dynamicQuery) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<VLegalLogger> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<VLegalLogger> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#remove(com.liferay.portal.model.BaseModel)
	 */
	public static VLegalLogger remove(VLegalLogger vLegalLogger)
		throws SystemException {
		return getPersistence().remove(vLegalLogger);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, boolean)
	 */
	public static VLegalLogger update(VLegalLogger vLegalLogger, boolean merge)
		throws SystemException {
		return getPersistence().update(vLegalLogger, merge);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, boolean, ServiceContext)
	 */
	public static VLegalLogger update(VLegalLogger vLegalLogger, boolean merge,
		ServiceContext serviceContext) throws SystemException {
		return getPersistence().update(vLegalLogger, merge, serviceContext);
	}

	/**
	* Caches the v legal logger in the entity cache if it is enabled.
	*
	* @param vLegalLogger the v legal logger to cache
	*/
	public static void cacheResult(
		com.vportal.portlet.vlegal.model.VLegalLogger vLegalLogger) {
		getPersistence().cacheResult(vLegalLogger);
	}

	/**
	* Caches the v legal loggers in the entity cache if it is enabled.
	*
	* @param vLegalLoggers the v legal loggers to cache
	*/
	public static void cacheResult(
		java.util.List<com.vportal.portlet.vlegal.model.VLegalLogger> vLegalLoggers) {
		getPersistence().cacheResult(vLegalLoggers);
	}

	/**
	* Creates a new v legal logger with the primary key. Does not add the v legal logger to the database.
	*
	* @param loggerId the primary key for the new v legal logger
	* @return the new v legal logger
	*/
	public static com.vportal.portlet.vlegal.model.VLegalLogger create(
		java.lang.String loggerId) {
		return getPersistence().create(loggerId);
	}

	/**
	* Removes the v legal logger with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param loggerId the primary key of the v legal logger to remove
	* @return the v legal logger that was removed
	* @throws com.vportal.portlet.vlegal.NoSuchVLegalLoggerException if a v legal logger with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.vportal.portlet.vlegal.model.VLegalLogger remove(
		java.lang.String loggerId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vlegal.NoSuchVLegalLoggerException {
		return getPersistence().remove(loggerId);
	}

	public static com.vportal.portlet.vlegal.model.VLegalLogger updateImpl(
		com.vportal.portlet.vlegal.model.VLegalLogger vLegalLogger,
		boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(vLegalLogger, merge);
	}

	/**
	* Finds the v legal logger with the primary key or throws a {@link com.vportal.portlet.vlegal.NoSuchVLegalLoggerException} if it could not be found.
	*
	* @param loggerId the primary key of the v legal logger to find
	* @return the v legal logger
	* @throws com.vportal.portlet.vlegal.NoSuchVLegalLoggerException if a v legal logger with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.vportal.portlet.vlegal.model.VLegalLogger findByPrimaryKey(
		java.lang.String loggerId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vlegal.NoSuchVLegalLoggerException {
		return getPersistence().findByPrimaryKey(loggerId);
	}

	/**
	* Finds the v legal logger with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param loggerId the primary key of the v legal logger to find
	* @return the v legal logger, or <code>null</code> if a v legal logger with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.vportal.portlet.vlegal.model.VLegalLogger fetchByPrimaryKey(
		java.lang.String loggerId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(loggerId);
	}

	/**
	* Finds the v legal logger where groupId = &#63; and loggerId = &#63; or throws a {@link com.vportal.portlet.vlegal.NoSuchVLegalLoggerException} if it could not be found.
	*
	* @param groupId the group id to search with
	* @param loggerId the logger id to search with
	* @return the matching v legal logger
	* @throws com.vportal.portlet.vlegal.NoSuchVLegalLoggerException if a matching v legal logger could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.vportal.portlet.vlegal.model.VLegalLogger findByG_L(
		long groupId, java.lang.String loggerId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vlegal.NoSuchVLegalLoggerException {
		return getPersistence().findByG_L(groupId, loggerId);
	}

	/**
	* Finds the v legal logger where groupId = &#63; and loggerId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param groupId the group id to search with
	* @param loggerId the logger id to search with
	* @return the matching v legal logger, or <code>null</code> if a matching v legal logger could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.vportal.portlet.vlegal.model.VLegalLogger fetchByG_L(
		long groupId, java.lang.String loggerId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByG_L(groupId, loggerId);
	}

	/**
	* Finds the v legal logger where groupId = &#63; and loggerId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param groupId the group id to search with
	* @param loggerId the logger id to search with
	* @return the matching v legal logger, or <code>null</code> if a matching v legal logger could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.vportal.portlet.vlegal.model.VLegalLogger fetchByG_L(
		long groupId, java.lang.String loggerId, boolean retrieveFromCache)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByG_L(groupId, loggerId, retrieveFromCache);
	}

	/**
	* Finds all the v legal loggers where groupId = &#63; and createdByUser = &#63; and createdDate = &#63;.
	*
	* @param groupId the group id to search with
	* @param createdByUser the created by user to search with
	* @param createdDate the created date to search with
	* @return the matching v legal loggers
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.vportal.portlet.vlegal.model.VLegalLogger> findByU_D(
		long groupId, long createdByUser, java.util.Date createdDate)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByU_D(groupId, createdByUser, createdDate);
	}

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
	public static java.util.List<com.vportal.portlet.vlegal.model.VLegalLogger> findByU_D(
		long groupId, long createdByUser, java.util.Date createdDate,
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByU_D(groupId, createdByUser, createdDate, start, end);
	}

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
	public static java.util.List<com.vportal.portlet.vlegal.model.VLegalLogger> findByU_D(
		long groupId, long createdByUser, java.util.Date createdDate,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByU_D(groupId, createdByUser, createdDate, start, end,
			orderByComparator);
	}

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
	public static com.vportal.portlet.vlegal.model.VLegalLogger findByU_D_First(
		long groupId, long createdByUser, java.util.Date createdDate,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vlegal.NoSuchVLegalLoggerException {
		return getPersistence()
				   .findByU_D_First(groupId, createdByUser, createdDate,
			orderByComparator);
	}

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
	public static com.vportal.portlet.vlegal.model.VLegalLogger findByU_D_Last(
		long groupId, long createdByUser, java.util.Date createdDate,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vlegal.NoSuchVLegalLoggerException {
		return getPersistence()
				   .findByU_D_Last(groupId, createdByUser, createdDate,
			orderByComparator);
	}

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
	public static com.vportal.portlet.vlegal.model.VLegalLogger[] findByU_D_PrevAndNext(
		java.lang.String loggerId, long groupId, long createdByUser,
		java.util.Date createdDate,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vlegal.NoSuchVLegalLoggerException {
		return getPersistence()
				   .findByU_D_PrevAndNext(loggerId, groupId, createdByUser,
			createdDate, orderByComparator);
	}

	/**
	* Finds all the v legal loggers where groupId = &#63;.
	*
	* @param groupId the group id to search with
	* @return the matching v legal loggers
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.vportal.portlet.vlegal.model.VLegalLogger> findByGroupId(
		long groupId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByGroupId(groupId);
	}

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
	public static java.util.List<com.vportal.portlet.vlegal.model.VLegalLogger> findByGroupId(
		long groupId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByGroupId(groupId, start, end);
	}

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
	public static java.util.List<com.vportal.portlet.vlegal.model.VLegalLogger> findByGroupId(
		long groupId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByGroupId(groupId, start, end, orderByComparator);
	}

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
	public static com.vportal.portlet.vlegal.model.VLegalLogger findByGroupId_First(
		long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vlegal.NoSuchVLegalLoggerException {
		return getPersistence().findByGroupId_First(groupId, orderByComparator);
	}

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
	public static com.vportal.portlet.vlegal.model.VLegalLogger findByGroupId_Last(
		long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vlegal.NoSuchVLegalLoggerException {
		return getPersistence().findByGroupId_Last(groupId, orderByComparator);
	}

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
	public static com.vportal.portlet.vlegal.model.VLegalLogger[] findByGroupId_PrevAndNext(
		java.lang.String loggerId, long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vlegal.NoSuchVLegalLoggerException {
		return getPersistence()
				   .findByGroupId_PrevAndNext(loggerId, groupId,
			orderByComparator);
	}

	/**
	* Finds all the v legal loggers.
	*
	* @return the v legal loggers
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.vportal.portlet.vlegal.model.VLegalLogger> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
	}

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
	public static java.util.List<com.vportal.portlet.vlegal.model.VLegalLogger> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

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
	public static java.util.List<com.vportal.portlet.vlegal.model.VLegalLogger> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes the v legal logger where groupId = &#63; and loggerId = &#63; from the database.
	*
	* @param groupId the group id to search with
	* @param loggerId the logger id to search with
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByG_L(long groupId, java.lang.String loggerId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vlegal.NoSuchVLegalLoggerException {
		getPersistence().removeByG_L(groupId, loggerId);
	}

	/**
	* Removes all the v legal loggers where groupId = &#63; and createdByUser = &#63; and createdDate = &#63; from the database.
	*
	* @param groupId the group id to search with
	* @param createdByUser the created by user to search with
	* @param createdDate the created date to search with
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByU_D(long groupId, long createdByUser,
		java.util.Date createdDate)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByU_D(groupId, createdByUser, createdDate);
	}

	/**
	* Removes all the v legal loggers where groupId = &#63; from the database.
	*
	* @param groupId the group id to search with
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByGroupId(long groupId)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByGroupId(groupId);
	}

	/**
	* Removes all the v legal loggers from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Counts all the v legal loggers where groupId = &#63; and loggerId = &#63;.
	*
	* @param groupId the group id to search with
	* @param loggerId the logger id to search with
	* @return the number of matching v legal loggers
	* @throws SystemException if a system exception occurred
	*/
	public static int countByG_L(long groupId, java.lang.String loggerId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByG_L(groupId, loggerId);
	}

	/**
	* Counts all the v legal loggers where groupId = &#63; and createdByUser = &#63; and createdDate = &#63;.
	*
	* @param groupId the group id to search with
	* @param createdByUser the created by user to search with
	* @param createdDate the created date to search with
	* @return the number of matching v legal loggers
	* @throws SystemException if a system exception occurred
	*/
	public static int countByU_D(long groupId, long createdByUser,
		java.util.Date createdDate)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByU_D(groupId, createdByUser, createdDate);
	}

	/**
	* Counts all the v legal loggers where groupId = &#63;.
	*
	* @param groupId the group id to search with
	* @return the number of matching v legal loggers
	* @throws SystemException if a system exception occurred
	*/
	public static int countByGroupId(long groupId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByGroupId(groupId);
	}

	/**
	* Counts all the v legal loggers.
	*
	* @return the number of v legal loggers
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static VLegalLoggerPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (VLegalLoggerPersistence)PortletBeanLocatorUtil.locate(com.vportal.portlet.vlegal.service.ClpSerializer.SERVLET_CONTEXT_NAME,
					VLegalLoggerPersistence.class.getName());
		}

		return _persistence;
	}

	public void setPersistence(VLegalLoggerPersistence persistence) {
		_persistence = persistence;
	}

	private static VLegalLoggerPersistence _persistence;
}