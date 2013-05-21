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

import com.vportal.portlet.vcms.model.VcmsLogger;

import java.util.List;

/**
 * The persistence utility for the vcms logger service. This utility wraps {@link VcmsLoggerPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
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
 * @see VcmsLoggerPersistence
 * @see VcmsLoggerPersistenceImpl
 * @generated
 */
public class VcmsLoggerUtil {
	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#clearCache()
	 */
	public static void clearCache() {
		getPersistence().clearCache();
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#clearCache(com.liferay.portal.model.BaseModel)
	 */
	public static void clearCache(VcmsLogger vcmsLogger) {
		getPersistence().clearCache(vcmsLogger);
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
	public static List<VcmsLogger> findWithDynamicQuery(
		DynamicQuery dynamicQuery) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<VcmsLogger> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<VcmsLogger> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#remove(com.liferay.portal.model.BaseModel)
	 */
	public static VcmsLogger remove(VcmsLogger vcmsLogger)
		throws SystemException {
		return getPersistence().remove(vcmsLogger);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, boolean)
	 */
	public static VcmsLogger update(VcmsLogger vcmsLogger, boolean merge)
		throws SystemException {
		return getPersistence().update(vcmsLogger, merge);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, boolean, ServiceContext)
	 */
	public static VcmsLogger update(VcmsLogger vcmsLogger, boolean merge,
		ServiceContext serviceContext) throws SystemException {
		return getPersistence().update(vcmsLogger, merge, serviceContext);
	}

	/**
	* Caches the vcms logger in the entity cache if it is enabled.
	*
	* @param vcmsLogger the vcms logger to cache
	*/
	public static void cacheResult(
		com.vportal.portlet.vcms.model.VcmsLogger vcmsLogger) {
		getPersistence().cacheResult(vcmsLogger);
	}

	/**
	* Caches the vcms loggers in the entity cache if it is enabled.
	*
	* @param vcmsLoggers the vcms loggers to cache
	*/
	public static void cacheResult(
		java.util.List<com.vportal.portlet.vcms.model.VcmsLogger> vcmsLoggers) {
		getPersistence().cacheResult(vcmsLoggers);
	}

	/**
	* Creates a new vcms logger with the primary key. Does not add the vcms logger to the database.
	*
	* @param loggerId the primary key for the new vcms logger
	* @return the new vcms logger
	*/
	public static com.vportal.portlet.vcms.model.VcmsLogger create(
		java.lang.String loggerId) {
		return getPersistence().create(loggerId);
	}

	/**
	* Removes the vcms logger with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param loggerId the primary key of the vcms logger to remove
	* @return the vcms logger that was removed
	* @throws com.vportal.portlet.vcms.NoSuchVcmsLoggerException if a vcms logger with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.vportal.portlet.vcms.model.VcmsLogger remove(
		java.lang.String loggerId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vcms.NoSuchVcmsLoggerException {
		return getPersistence().remove(loggerId);
	}

	public static com.vportal.portlet.vcms.model.VcmsLogger updateImpl(
		com.vportal.portlet.vcms.model.VcmsLogger vcmsLogger, boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(vcmsLogger, merge);
	}

	/**
	* Finds the vcms logger with the primary key or throws a {@link com.vportal.portlet.vcms.NoSuchVcmsLoggerException} if it could not be found.
	*
	* @param loggerId the primary key of the vcms logger to find
	* @return the vcms logger
	* @throws com.vportal.portlet.vcms.NoSuchVcmsLoggerException if a vcms logger with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.vportal.portlet.vcms.model.VcmsLogger findByPrimaryKey(
		java.lang.String loggerId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vcms.NoSuchVcmsLoggerException {
		return getPersistence().findByPrimaryKey(loggerId);
	}

	/**
	* Finds the vcms logger with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param loggerId the primary key of the vcms logger to find
	* @return the vcms logger, or <code>null</code> if a vcms logger with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.vportal.portlet.vcms.model.VcmsLogger fetchByPrimaryKey(
		java.lang.String loggerId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(loggerId);
	}

	/**
	* Finds all the vcms loggers where createdByUser = &#63; and createdDate = &#63;.
	*
	* @param createdByUser the created by user to search with
	* @param createdDate the created date to search with
	* @return the matching vcms loggers
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.vportal.portlet.vcms.model.VcmsLogger> findByU_D(
		java.lang.String createdByUser, java.util.Date createdDate)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByU_D(createdByUser, createdDate);
	}

	/**
	* Finds a range of all the vcms loggers where createdByUser = &#63; and createdDate = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param createdByUser the created by user to search with
	* @param createdDate the created date to search with
	* @param start the lower bound of the range of vcms loggers to return
	* @param end the upper bound of the range of vcms loggers to return (not inclusive)
	* @return the range of matching vcms loggers
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.vportal.portlet.vcms.model.VcmsLogger> findByU_D(
		java.lang.String createdByUser, java.util.Date createdDate, int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByU_D(createdByUser, createdDate, start, end);
	}

	/**
	* Finds an ordered range of all the vcms loggers where createdByUser = &#63; and createdDate = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param createdByUser the created by user to search with
	* @param createdDate the created date to search with
	* @param start the lower bound of the range of vcms loggers to return
	* @param end the upper bound of the range of vcms loggers to return (not inclusive)
	* @param orderByComparator the comparator to order the results by
	* @return the ordered range of matching vcms loggers
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.vportal.portlet.vcms.model.VcmsLogger> findByU_D(
		java.lang.String createdByUser, java.util.Date createdDate, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByU_D(createdByUser, createdDate, start, end,
			orderByComparator);
	}

	/**
	* Finds the first vcms logger in the ordered set where createdByUser = &#63; and createdDate = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param createdByUser the created by user to search with
	* @param createdDate the created date to search with
	* @param orderByComparator the comparator to order the set by
	* @return the first matching vcms logger
	* @throws com.vportal.portlet.vcms.NoSuchVcmsLoggerException if a matching vcms logger could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.vportal.portlet.vcms.model.VcmsLogger findByU_D_First(
		java.lang.String createdByUser, java.util.Date createdDate,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vcms.NoSuchVcmsLoggerException {
		return getPersistence()
				   .findByU_D_First(createdByUser, createdDate,
			orderByComparator);
	}

	/**
	* Finds the last vcms logger in the ordered set where createdByUser = &#63; and createdDate = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param createdByUser the created by user to search with
	* @param createdDate the created date to search with
	* @param orderByComparator the comparator to order the set by
	* @return the last matching vcms logger
	* @throws com.vportal.portlet.vcms.NoSuchVcmsLoggerException if a matching vcms logger could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.vportal.portlet.vcms.model.VcmsLogger findByU_D_Last(
		java.lang.String createdByUser, java.util.Date createdDate,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vcms.NoSuchVcmsLoggerException {
		return getPersistence()
				   .findByU_D_Last(createdByUser, createdDate, orderByComparator);
	}

	/**
	* Finds the vcms loggers before and after the current vcms logger in the ordered set where createdByUser = &#63; and createdDate = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param loggerId the primary key of the current vcms logger
	* @param createdByUser the created by user to search with
	* @param createdDate the created date to search with
	* @param orderByComparator the comparator to order the set by
	* @return the previous, current, and next vcms logger
	* @throws com.vportal.portlet.vcms.NoSuchVcmsLoggerException if a vcms logger with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.vportal.portlet.vcms.model.VcmsLogger[] findByU_D_PrevAndNext(
		java.lang.String loggerId, java.lang.String createdByUser,
		java.util.Date createdDate,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vcms.NoSuchVcmsLoggerException {
		return getPersistence()
				   .findByU_D_PrevAndNext(loggerId, createdByUser, createdDate,
			orderByComparator);
	}

	/**
	* Finds all the vcms loggers.
	*
	* @return the vcms loggers
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.vportal.portlet.vcms.model.VcmsLogger> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
	}

	/**
	* Finds a range of all the vcms loggers.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of vcms loggers to return
	* @param end the upper bound of the range of vcms loggers to return (not inclusive)
	* @return the range of vcms loggers
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.vportal.portlet.vcms.model.VcmsLogger> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

	/**
	* Finds an ordered range of all the vcms loggers.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of vcms loggers to return
	* @param end the upper bound of the range of vcms loggers to return (not inclusive)
	* @param orderByComparator the comparator to order the results by
	* @return the ordered range of vcms loggers
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.vportal.portlet.vcms.model.VcmsLogger> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the vcms loggers where createdByUser = &#63; and createdDate = &#63; from the database.
	*
	* @param createdByUser the created by user to search with
	* @param createdDate the created date to search with
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByU_D(java.lang.String createdByUser,
		java.util.Date createdDate)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByU_D(createdByUser, createdDate);
	}

	/**
	* Removes all the vcms loggers from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Counts all the vcms loggers where createdByUser = &#63; and createdDate = &#63;.
	*
	* @param createdByUser the created by user to search with
	* @param createdDate the created date to search with
	* @return the number of matching vcms loggers
	* @throws SystemException if a system exception occurred
	*/
	public static int countByU_D(java.lang.String createdByUser,
		java.util.Date createdDate)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByU_D(createdByUser, createdDate);
	}

	/**
	* Counts all the vcms loggers.
	*
	* @return the number of vcms loggers
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static VcmsLoggerPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (VcmsLoggerPersistence)PortletBeanLocatorUtil.locate(com.vportal.portlet.vcms.service.ClpSerializer.SERVLET_CONTEXT_NAME,
					VcmsLoggerPersistence.class.getName());
		}

		return _persistence;
	}

	public void setPersistence(VcmsLoggerPersistence persistence) {
		_persistence = persistence;
	}

	private static VcmsLoggerPersistence _persistence;
}