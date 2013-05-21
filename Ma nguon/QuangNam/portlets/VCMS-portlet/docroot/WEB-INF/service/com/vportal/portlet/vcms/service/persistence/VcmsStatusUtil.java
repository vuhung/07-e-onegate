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

import com.vportal.portlet.vcms.model.VcmsStatus;

import java.util.List;

/**
 * The persistence utility for the vcms status service. This utility wraps {@link VcmsStatusPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
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
 * @see VcmsStatusPersistence
 * @see VcmsStatusPersistenceImpl
 * @generated
 */
public class VcmsStatusUtil {
	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#clearCache()
	 */
	public static void clearCache() {
		getPersistence().clearCache();
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#clearCache(com.liferay.portal.model.BaseModel)
	 */
	public static void clearCache(VcmsStatus vcmsStatus) {
		getPersistence().clearCache(vcmsStatus);
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
	public static List<VcmsStatus> findWithDynamicQuery(
		DynamicQuery dynamicQuery) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<VcmsStatus> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<VcmsStatus> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#remove(com.liferay.portal.model.BaseModel)
	 */
	public static VcmsStatus remove(VcmsStatus vcmsStatus)
		throws SystemException {
		return getPersistence().remove(vcmsStatus);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, boolean)
	 */
	public static VcmsStatus update(VcmsStatus vcmsStatus, boolean merge)
		throws SystemException {
		return getPersistence().update(vcmsStatus, merge);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, boolean, ServiceContext)
	 */
	public static VcmsStatus update(VcmsStatus vcmsStatus, boolean merge,
		ServiceContext serviceContext) throws SystemException {
		return getPersistence().update(vcmsStatus, merge, serviceContext);
	}

	/**
	* Caches the vcms status in the entity cache if it is enabled.
	*
	* @param vcmsStatus the vcms status to cache
	*/
	public static void cacheResult(
		com.vportal.portlet.vcms.model.VcmsStatus vcmsStatus) {
		getPersistence().cacheResult(vcmsStatus);
	}

	/**
	* Caches the vcms statuses in the entity cache if it is enabled.
	*
	* @param vcmsStatuses the vcms statuses to cache
	*/
	public static void cacheResult(
		java.util.List<com.vportal.portlet.vcms.model.VcmsStatus> vcmsStatuses) {
		getPersistence().cacheResult(vcmsStatuses);
	}

	/**
	* Creates a new vcms status with the primary key. Does not add the vcms status to the database.
	*
	* @param statusId the primary key for the new vcms status
	* @return the new vcms status
	*/
	public static com.vportal.portlet.vcms.model.VcmsStatus create(
		long statusId) {
		return getPersistence().create(statusId);
	}

	/**
	* Removes the vcms status with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param statusId the primary key of the vcms status to remove
	* @return the vcms status that was removed
	* @throws com.vportal.portlet.vcms.NoSuchVcmsStatusException if a vcms status with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.vportal.portlet.vcms.model.VcmsStatus remove(
		long statusId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vcms.NoSuchVcmsStatusException {
		return getPersistence().remove(statusId);
	}

	public static com.vportal.portlet.vcms.model.VcmsStatus updateImpl(
		com.vportal.portlet.vcms.model.VcmsStatus vcmsStatus, boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(vcmsStatus, merge);
	}

	/**
	* Finds the vcms status with the primary key or throws a {@link com.vportal.portlet.vcms.NoSuchVcmsStatusException} if it could not be found.
	*
	* @param statusId the primary key of the vcms status to find
	* @return the vcms status
	* @throws com.vportal.portlet.vcms.NoSuchVcmsStatusException if a vcms status with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.vportal.portlet.vcms.model.VcmsStatus findByPrimaryKey(
		long statusId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vcms.NoSuchVcmsStatusException {
		return getPersistence().findByPrimaryKey(statusId);
	}

	/**
	* Finds the vcms status with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param statusId the primary key of the vcms status to find
	* @return the vcms status, or <code>null</code> if a vcms status with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.vportal.portlet.vcms.model.VcmsStatus fetchByPrimaryKey(
		long statusId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(statusId);
	}

	/**
	* Finds all the vcms statuses where companyId = &#63;.
	*
	* @param companyId the company id to search with
	* @return the matching vcms statuses
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.vportal.portlet.vcms.model.VcmsStatus> findByCompanyId(
		long companyId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByCompanyId(companyId);
	}

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
	public static java.util.List<com.vportal.portlet.vcms.model.VcmsStatus> findByCompanyId(
		long companyId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByCompanyId(companyId, start, end);
	}

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
	public static java.util.List<com.vportal.portlet.vcms.model.VcmsStatus> findByCompanyId(
		long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByCompanyId(companyId, start, end, orderByComparator);
	}

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
	public static com.vportal.portlet.vcms.model.VcmsStatus findByCompanyId_First(
		long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vcms.NoSuchVcmsStatusException {
		return getPersistence()
				   .findByCompanyId_First(companyId, orderByComparator);
	}

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
	public static com.vportal.portlet.vcms.model.VcmsStatus findByCompanyId_Last(
		long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vcms.NoSuchVcmsStatusException {
		return getPersistence()
				   .findByCompanyId_Last(companyId, orderByComparator);
	}

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
	public static com.vportal.portlet.vcms.model.VcmsStatus[] findByCompanyId_PrevAndNext(
		long statusId, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vcms.NoSuchVcmsStatusException {
		return getPersistence()
				   .findByCompanyId_PrevAndNext(statusId, companyId,
			orderByComparator);
	}

	/**
	* Finds all the vcms statuses where companyId = &#63; and groupId = &#63;.
	*
	* @param companyId the company id to search with
	* @param groupId the group id to search with
	* @return the matching vcms statuses
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.vportal.portlet.vcms.model.VcmsStatus> findByC_G(
		long companyId, long groupId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByC_G(companyId, groupId);
	}

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
	public static java.util.List<com.vportal.portlet.vcms.model.VcmsStatus> findByC_G(
		long companyId, long groupId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByC_G(companyId, groupId, start, end);
	}

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
	public static java.util.List<com.vportal.portlet.vcms.model.VcmsStatus> findByC_G(
		long companyId, long groupId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByC_G(companyId, groupId, start, end, orderByComparator);
	}

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
	public static com.vportal.portlet.vcms.model.VcmsStatus findByC_G_First(
		long companyId, long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vcms.NoSuchVcmsStatusException {
		return getPersistence()
				   .findByC_G_First(companyId, groupId, orderByComparator);
	}

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
	public static com.vportal.portlet.vcms.model.VcmsStatus findByC_G_Last(
		long companyId, long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vcms.NoSuchVcmsStatusException {
		return getPersistence()
				   .findByC_G_Last(companyId, groupId, orderByComparator);
	}

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
	public static com.vportal.portlet.vcms.model.VcmsStatus[] findByC_G_PrevAndNext(
		long statusId, long companyId, long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vcms.NoSuchVcmsStatusException {
		return getPersistence()
				   .findByC_G_PrevAndNext(statusId, companyId, groupId,
			orderByComparator);
	}

	/**
	* Filters by the user's permissions and finds all the vcms statuses where companyId = &#63; and groupId = &#63;.
	*
	* @param companyId the company id to search with
	* @param groupId the group id to search with
	* @return the matching vcms statuses that the user has permission to view
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.vportal.portlet.vcms.model.VcmsStatus> filterFindByC_G(
		long companyId, long groupId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().filterFindByC_G(companyId, groupId);
	}

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
	public static java.util.List<com.vportal.portlet.vcms.model.VcmsStatus> filterFindByC_G(
		long companyId, long groupId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().filterFindByC_G(companyId, groupId, start, end);
	}

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
	public static java.util.List<com.vportal.portlet.vcms.model.VcmsStatus> filterFindByC_G(
		long companyId, long groupId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .filterFindByC_G(companyId, groupId, start, end,
			orderByComparator);
	}

	/**
	* Finds all the vcms statuses where groupId = &#63; and position = &#63;.
	*
	* @param groupId the group id to search with
	* @param position the position to search with
	* @return the matching vcms statuses
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.vportal.portlet.vcms.model.VcmsStatus> findByG_P(
		long groupId, int position)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByG_P(groupId, position);
	}

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
	public static java.util.List<com.vportal.portlet.vcms.model.VcmsStatus> findByG_P(
		long groupId, int position, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByG_P(groupId, position, start, end);
	}

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
	public static java.util.List<com.vportal.portlet.vcms.model.VcmsStatus> findByG_P(
		long groupId, int position, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByG_P(groupId, position, start, end, orderByComparator);
	}

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
	public static com.vportal.portlet.vcms.model.VcmsStatus findByG_P_First(
		long groupId, int position,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vcms.NoSuchVcmsStatusException {
		return getPersistence()
				   .findByG_P_First(groupId, position, orderByComparator);
	}

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
	public static com.vportal.portlet.vcms.model.VcmsStatus findByG_P_Last(
		long groupId, int position,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vcms.NoSuchVcmsStatusException {
		return getPersistence()
				   .findByG_P_Last(groupId, position, orderByComparator);
	}

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
	public static com.vportal.portlet.vcms.model.VcmsStatus[] findByG_P_PrevAndNext(
		long statusId, long groupId, int position,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vcms.NoSuchVcmsStatusException {
		return getPersistence()
				   .findByG_P_PrevAndNext(statusId, groupId, position,
			orderByComparator);
	}

	/**
	* Filters by the user's permissions and finds all the vcms statuses where groupId = &#63; and position = &#63;.
	*
	* @param groupId the group id to search with
	* @param position the position to search with
	* @return the matching vcms statuses that the user has permission to view
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.vportal.portlet.vcms.model.VcmsStatus> filterFindByG_P(
		long groupId, int position)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().filterFindByG_P(groupId, position);
	}

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
	public static java.util.List<com.vportal.portlet.vcms.model.VcmsStatus> filterFindByG_P(
		long groupId, int position, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().filterFindByG_P(groupId, position, start, end);
	}

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
	public static java.util.List<com.vportal.portlet.vcms.model.VcmsStatus> filterFindByG_P(
		long groupId, int position, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .filterFindByG_P(groupId, position, start, end,
			orderByComparator);
	}

	/**
	* Finds all the vcms statuses where groupId = &#63;.
	*
	* @param groupId the group id to search with
	* @return the matching vcms statuses
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.vportal.portlet.vcms.model.VcmsStatus> findByGroupId(
		long groupId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByGroupId(groupId);
	}

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
	public static java.util.List<com.vportal.portlet.vcms.model.VcmsStatus> findByGroupId(
		long groupId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByGroupId(groupId, start, end);
	}

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
	public static java.util.List<com.vportal.portlet.vcms.model.VcmsStatus> findByGroupId(
		long groupId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByGroupId(groupId, start, end, orderByComparator);
	}

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
	public static com.vportal.portlet.vcms.model.VcmsStatus findByGroupId_First(
		long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vcms.NoSuchVcmsStatusException {
		return getPersistence().findByGroupId_First(groupId, orderByComparator);
	}

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
	public static com.vportal.portlet.vcms.model.VcmsStatus findByGroupId_Last(
		long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vcms.NoSuchVcmsStatusException {
		return getPersistence().findByGroupId_Last(groupId, orderByComparator);
	}

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
	public static com.vportal.portlet.vcms.model.VcmsStatus[] findByGroupId_PrevAndNext(
		long statusId, long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vcms.NoSuchVcmsStatusException {
		return getPersistence()
				   .findByGroupId_PrevAndNext(statusId, groupId,
			orderByComparator);
	}

	/**
	* Filters by the user's permissions and finds all the vcms statuses where groupId = &#63;.
	*
	* @param groupId the group id to search with
	* @return the matching vcms statuses that the user has permission to view
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.vportal.portlet.vcms.model.VcmsStatus> filterFindByGroupId(
		long groupId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().filterFindByGroupId(groupId);
	}

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
	public static java.util.List<com.vportal.portlet.vcms.model.VcmsStatus> filterFindByGroupId(
		long groupId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().filterFindByGroupId(groupId, start, end);
	}

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
	public static java.util.List<com.vportal.portlet.vcms.model.VcmsStatus> filterFindByGroupId(
		long groupId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .filterFindByGroupId(groupId, start, end, orderByComparator);
	}

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
	public static com.vportal.portlet.vcms.model.VcmsStatus findByC_G_A(
		long companyId, long groupId, boolean active)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vcms.NoSuchVcmsStatusException {
		return getPersistence().findByC_G_A(companyId, groupId, active);
	}

	/**
	* Finds the vcms status where companyId = &#63; and groupId = &#63; and active = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param companyId the company id to search with
	* @param groupId the group id to search with
	* @param active the active to search with
	* @return the matching vcms status, or <code>null</code> if a matching vcms status could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.vportal.portlet.vcms.model.VcmsStatus fetchByC_G_A(
		long companyId, long groupId, boolean active)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByC_G_A(companyId, groupId, active);
	}

	/**
	* Finds the vcms status where companyId = &#63; and groupId = &#63; and active = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param companyId the company id to search with
	* @param groupId the group id to search with
	* @param active the active to search with
	* @return the matching vcms status, or <code>null</code> if a matching vcms status could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.vportal.portlet.vcms.model.VcmsStatus fetchByC_G_A(
		long companyId, long groupId, boolean active, boolean retrieveFromCache)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByC_G_A(companyId, groupId, active, retrieveFromCache);
	}

	/**
	* Finds the vcms status where active = &#63; or throws a {@link com.vportal.portlet.vcms.NoSuchVcmsStatusException} if it could not be found.
	*
	* @param active the active to search with
	* @return the matching vcms status
	* @throws com.vportal.portlet.vcms.NoSuchVcmsStatusException if a matching vcms status could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.vportal.portlet.vcms.model.VcmsStatus findByA(
		boolean active)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vcms.NoSuchVcmsStatusException {
		return getPersistence().findByA(active);
	}

	/**
	* Finds the vcms status where active = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param active the active to search with
	* @return the matching vcms status, or <code>null</code> if a matching vcms status could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.vportal.portlet.vcms.model.VcmsStatus fetchByA(
		boolean active)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByA(active);
	}

	/**
	* Finds the vcms status where active = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param active the active to search with
	* @return the matching vcms status, or <code>null</code> if a matching vcms status could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.vportal.portlet.vcms.model.VcmsStatus fetchByA(
		boolean active, boolean retrieveFromCache)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByA(active, retrieveFromCache);
	}

	/**
	* Finds all the vcms statuses where companyId = &#63; and active = &#63;.
	*
	* @param companyId the company id to search with
	* @param active the active to search with
	* @return the matching vcms statuses
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.vportal.portlet.vcms.model.VcmsStatus> findByC_A(
		long companyId, boolean active)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByC_A(companyId, active);
	}

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
	public static java.util.List<com.vportal.portlet.vcms.model.VcmsStatus> findByC_A(
		long companyId, boolean active, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByC_A(companyId, active, start, end);
	}

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
	public static java.util.List<com.vportal.portlet.vcms.model.VcmsStatus> findByC_A(
		long companyId, boolean active, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByC_A(companyId, active, start, end, orderByComparator);
	}

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
	public static com.vportal.portlet.vcms.model.VcmsStatus findByC_A_First(
		long companyId, boolean active,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vcms.NoSuchVcmsStatusException {
		return getPersistence()
				   .findByC_A_First(companyId, active, orderByComparator);
	}

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
	public static com.vportal.portlet.vcms.model.VcmsStatus findByC_A_Last(
		long companyId, boolean active,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vcms.NoSuchVcmsStatusException {
		return getPersistence()
				   .findByC_A_Last(companyId, active, orderByComparator);
	}

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
	public static com.vportal.portlet.vcms.model.VcmsStatus[] findByC_A_PrevAndNext(
		long statusId, long companyId, boolean active,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vcms.NoSuchVcmsStatusException {
		return getPersistence()
				   .findByC_A_PrevAndNext(statusId, companyId, active,
			orderByComparator);
	}

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
	public static com.vportal.portlet.vcms.model.VcmsStatus findByC_G_P(
		long companyId, long groupId, boolean isPrimary)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vcms.NoSuchVcmsStatusException {
		return getPersistence().findByC_G_P(companyId, groupId, isPrimary);
	}

	/**
	* Finds the vcms status where companyId = &#63; and groupId = &#63; and isPrimary = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param companyId the company id to search with
	* @param groupId the group id to search with
	* @param isPrimary the is primary to search with
	* @return the matching vcms status, or <code>null</code> if a matching vcms status could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.vportal.portlet.vcms.model.VcmsStatus fetchByC_G_P(
		long companyId, long groupId, boolean isPrimary)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByC_G_P(companyId, groupId, isPrimary);
	}

	/**
	* Finds the vcms status where companyId = &#63; and groupId = &#63; and isPrimary = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param companyId the company id to search with
	* @param groupId the group id to search with
	* @param isPrimary the is primary to search with
	* @return the matching vcms status, or <code>null</code> if a matching vcms status could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.vportal.portlet.vcms.model.VcmsStatus fetchByC_G_P(
		long companyId, long groupId, boolean isPrimary,
		boolean retrieveFromCache)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByC_G_P(companyId, groupId, isPrimary,
			retrieveFromCache);
	}

	/**
	* Finds all the vcms statuses where companyId = &#63; and isPrimary = &#63;.
	*
	* @param companyId the company id to search with
	* @param isPrimary the is primary to search with
	* @return the matching vcms statuses
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.vportal.portlet.vcms.model.VcmsStatus> findByC_P(
		long companyId, boolean isPrimary)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByC_P(companyId, isPrimary);
	}

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
	public static java.util.List<com.vportal.portlet.vcms.model.VcmsStatus> findByC_P(
		long companyId, boolean isPrimary, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByC_P(companyId, isPrimary, start, end);
	}

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
	public static java.util.List<com.vportal.portlet.vcms.model.VcmsStatus> findByC_P(
		long companyId, boolean isPrimary, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByC_P(companyId, isPrimary, start, end,
			orderByComparator);
	}

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
	public static com.vportal.portlet.vcms.model.VcmsStatus findByC_P_First(
		long companyId, boolean isPrimary,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vcms.NoSuchVcmsStatusException {
		return getPersistence()
				   .findByC_P_First(companyId, isPrimary, orderByComparator);
	}

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
	public static com.vportal.portlet.vcms.model.VcmsStatus findByC_P_Last(
		long companyId, boolean isPrimary,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vcms.NoSuchVcmsStatusException {
		return getPersistence()
				   .findByC_P_Last(companyId, isPrimary, orderByComparator);
	}

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
	public static com.vportal.portlet.vcms.model.VcmsStatus[] findByC_P_PrevAndNext(
		long statusId, long companyId, boolean isPrimary,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vcms.NoSuchVcmsStatusException {
		return getPersistence()
				   .findByC_P_PrevAndNext(statusId, companyId, isPrimary,
			orderByComparator);
	}

	/**
	* Finds all the vcms statuses.
	*
	* @return the vcms statuses
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.vportal.portlet.vcms.model.VcmsStatus> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
	}

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
	public static java.util.List<com.vportal.portlet.vcms.model.VcmsStatus> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

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
	public static java.util.List<com.vportal.portlet.vcms.model.VcmsStatus> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the vcms statuses where companyId = &#63; from the database.
	*
	* @param companyId the company id to search with
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByCompanyId(long companyId)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByCompanyId(companyId);
	}

	/**
	* Removes all the vcms statuses where companyId = &#63; and groupId = &#63; from the database.
	*
	* @param companyId the company id to search with
	* @param groupId the group id to search with
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByC_G(long companyId, long groupId)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByC_G(companyId, groupId);
	}

	/**
	* Removes all the vcms statuses where groupId = &#63; and position = &#63; from the database.
	*
	* @param groupId the group id to search with
	* @param position the position to search with
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByG_P(long groupId, int position)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByG_P(groupId, position);
	}

	/**
	* Removes all the vcms statuses where groupId = &#63; from the database.
	*
	* @param groupId the group id to search with
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByGroupId(long groupId)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByGroupId(groupId);
	}

	/**
	* Removes the vcms status where companyId = &#63; and groupId = &#63; and active = &#63; from the database.
	*
	* @param companyId the company id to search with
	* @param groupId the group id to search with
	* @param active the active to search with
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByC_G_A(long companyId, long groupId,
		boolean active)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vcms.NoSuchVcmsStatusException {
		getPersistence().removeByC_G_A(companyId, groupId, active);
	}

	/**
	* Removes the vcms status where active = &#63; from the database.
	*
	* @param active the active to search with
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByA(boolean active)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vcms.NoSuchVcmsStatusException {
		getPersistence().removeByA(active);
	}

	/**
	* Removes all the vcms statuses where companyId = &#63; and active = &#63; from the database.
	*
	* @param companyId the company id to search with
	* @param active the active to search with
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByC_A(long companyId, boolean active)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByC_A(companyId, active);
	}

	/**
	* Removes the vcms status where companyId = &#63; and groupId = &#63; and isPrimary = &#63; from the database.
	*
	* @param companyId the company id to search with
	* @param groupId the group id to search with
	* @param isPrimary the is primary to search with
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByC_G_P(long companyId, long groupId,
		boolean isPrimary)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vcms.NoSuchVcmsStatusException {
		getPersistence().removeByC_G_P(companyId, groupId, isPrimary);
	}

	/**
	* Removes all the vcms statuses where companyId = &#63; and isPrimary = &#63; from the database.
	*
	* @param companyId the company id to search with
	* @param isPrimary the is primary to search with
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByC_P(long companyId, boolean isPrimary)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByC_P(companyId, isPrimary);
	}

	/**
	* Removes all the vcms statuses from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Counts all the vcms statuses where companyId = &#63;.
	*
	* @param companyId the company id to search with
	* @return the number of matching vcms statuses
	* @throws SystemException if a system exception occurred
	*/
	public static int countByCompanyId(long companyId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByCompanyId(companyId);
	}

	/**
	* Counts all the vcms statuses where companyId = &#63; and groupId = &#63;.
	*
	* @param companyId the company id to search with
	* @param groupId the group id to search with
	* @return the number of matching vcms statuses
	* @throws SystemException if a system exception occurred
	*/
	public static int countByC_G(long companyId, long groupId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByC_G(companyId, groupId);
	}

	/**
	* Filters by the user's permissions and counts all the vcms statuses where companyId = &#63; and groupId = &#63;.
	*
	* @param companyId the company id to search with
	* @param groupId the group id to search with
	* @return the number of matching vcms statuses that the user has permission to view
	* @throws SystemException if a system exception occurred
	*/
	public static int filterCountByC_G(long companyId, long groupId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().filterCountByC_G(companyId, groupId);
	}

	/**
	* Counts all the vcms statuses where groupId = &#63; and position = &#63;.
	*
	* @param groupId the group id to search with
	* @param position the position to search with
	* @return the number of matching vcms statuses
	* @throws SystemException if a system exception occurred
	*/
	public static int countByG_P(long groupId, int position)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByG_P(groupId, position);
	}

	/**
	* Filters by the user's permissions and counts all the vcms statuses where groupId = &#63; and position = &#63;.
	*
	* @param groupId the group id to search with
	* @param position the position to search with
	* @return the number of matching vcms statuses that the user has permission to view
	* @throws SystemException if a system exception occurred
	*/
	public static int filterCountByG_P(long groupId, int position)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().filterCountByG_P(groupId, position);
	}

	/**
	* Counts all the vcms statuses where groupId = &#63;.
	*
	* @param groupId the group id to search with
	* @return the number of matching vcms statuses
	* @throws SystemException if a system exception occurred
	*/
	public static int countByGroupId(long groupId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByGroupId(groupId);
	}

	/**
	* Filters by the user's permissions and counts all the vcms statuses where groupId = &#63;.
	*
	* @param groupId the group id to search with
	* @return the number of matching vcms statuses that the user has permission to view
	* @throws SystemException if a system exception occurred
	*/
	public static int filterCountByGroupId(long groupId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().filterCountByGroupId(groupId);
	}

	/**
	* Counts all the vcms statuses where companyId = &#63; and groupId = &#63; and active = &#63;.
	*
	* @param companyId the company id to search with
	* @param groupId the group id to search with
	* @param active the active to search with
	* @return the number of matching vcms statuses
	* @throws SystemException if a system exception occurred
	*/
	public static int countByC_G_A(long companyId, long groupId, boolean active)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByC_G_A(companyId, groupId, active);
	}

	/**
	* Counts all the vcms statuses where active = &#63;.
	*
	* @param active the active to search with
	* @return the number of matching vcms statuses
	* @throws SystemException if a system exception occurred
	*/
	public static int countByA(boolean active)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByA(active);
	}

	/**
	* Counts all the vcms statuses where companyId = &#63; and active = &#63;.
	*
	* @param companyId the company id to search with
	* @param active the active to search with
	* @return the number of matching vcms statuses
	* @throws SystemException if a system exception occurred
	*/
	public static int countByC_A(long companyId, boolean active)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByC_A(companyId, active);
	}

	/**
	* Counts all the vcms statuses where companyId = &#63; and groupId = &#63; and isPrimary = &#63;.
	*
	* @param companyId the company id to search with
	* @param groupId the group id to search with
	* @param isPrimary the is primary to search with
	* @return the number of matching vcms statuses
	* @throws SystemException if a system exception occurred
	*/
	public static int countByC_G_P(long companyId, long groupId,
		boolean isPrimary)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByC_G_P(companyId, groupId, isPrimary);
	}

	/**
	* Counts all the vcms statuses where companyId = &#63; and isPrimary = &#63;.
	*
	* @param companyId the company id to search with
	* @param isPrimary the is primary to search with
	* @return the number of matching vcms statuses
	* @throws SystemException if a system exception occurred
	*/
	public static int countByC_P(long companyId, boolean isPrimary)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByC_P(companyId, isPrimary);
	}

	/**
	* Counts all the vcms statuses.
	*
	* @return the number of vcms statuses
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static VcmsStatusPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (VcmsStatusPersistence)PortletBeanLocatorUtil.locate(com.vportal.portlet.vcms.service.ClpSerializer.SERVLET_CONTEXT_NAME,
					VcmsStatusPersistence.class.getName());
		}

		return _persistence;
	}

	public void setPersistence(VcmsStatusPersistence persistence) {
		_persistence = persistence;
	}

	private static VcmsStatusPersistence _persistence;
}