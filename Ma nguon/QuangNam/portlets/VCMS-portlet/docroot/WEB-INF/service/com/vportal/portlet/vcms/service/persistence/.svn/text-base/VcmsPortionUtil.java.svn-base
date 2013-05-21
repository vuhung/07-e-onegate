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

import com.vportal.portlet.vcms.model.VcmsPortion;

import java.util.List;

/**
 * The persistence utility for the vcms portion service. This utility wraps {@link VcmsPortionPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
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
 * @see VcmsPortionPersistence
 * @see VcmsPortionPersistenceImpl
 * @generated
 */
public class VcmsPortionUtil {
	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#clearCache()
	 */
	public static void clearCache() {
		getPersistence().clearCache();
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#clearCache(com.liferay.portal.model.BaseModel)
	 */
	public static void clearCache(VcmsPortion vcmsPortion) {
		getPersistence().clearCache(vcmsPortion);
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
	public static List<VcmsPortion> findWithDynamicQuery(
		DynamicQuery dynamicQuery) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<VcmsPortion> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<VcmsPortion> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#remove(com.liferay.portal.model.BaseModel)
	 */
	public static VcmsPortion remove(VcmsPortion vcmsPortion)
		throws SystemException {
		return getPersistence().remove(vcmsPortion);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, boolean)
	 */
	public static VcmsPortion update(VcmsPortion vcmsPortion, boolean merge)
		throws SystemException {
		return getPersistence().update(vcmsPortion, merge);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, boolean, ServiceContext)
	 */
	public static VcmsPortion update(VcmsPortion vcmsPortion, boolean merge,
		ServiceContext serviceContext) throws SystemException {
		return getPersistence().update(vcmsPortion, merge, serviceContext);
	}

	/**
	* Caches the vcms portion in the entity cache if it is enabled.
	*
	* @param vcmsPortion the vcms portion to cache
	*/
	public static void cacheResult(
		com.vportal.portlet.vcms.model.VcmsPortion vcmsPortion) {
		getPersistence().cacheResult(vcmsPortion);
	}

	/**
	* Caches the vcms portions in the entity cache if it is enabled.
	*
	* @param vcmsPortions the vcms portions to cache
	*/
	public static void cacheResult(
		java.util.List<com.vportal.portlet.vcms.model.VcmsPortion> vcmsPortions) {
		getPersistence().cacheResult(vcmsPortions);
	}

	/**
	* Creates a new vcms portion with the primary key. Does not add the vcms portion to the database.
	*
	* @param portionId the primary key for the new vcms portion
	* @return the new vcms portion
	*/
	public static com.vportal.portlet.vcms.model.VcmsPortion create(
		java.lang.String portionId) {
		return getPersistence().create(portionId);
	}

	/**
	* Removes the vcms portion with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param portionId the primary key of the vcms portion to remove
	* @return the vcms portion that was removed
	* @throws com.vportal.portlet.vcms.NoSuchVcmsPortionException if a vcms portion with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.vportal.portlet.vcms.model.VcmsPortion remove(
		java.lang.String portionId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vcms.NoSuchVcmsPortionException {
		return getPersistence().remove(portionId);
	}

	public static com.vportal.portlet.vcms.model.VcmsPortion updateImpl(
		com.vportal.portlet.vcms.model.VcmsPortion vcmsPortion, boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(vcmsPortion, merge);
	}

	/**
	* Finds the vcms portion with the primary key or throws a {@link com.vportal.portlet.vcms.NoSuchVcmsPortionException} if it could not be found.
	*
	* @param portionId the primary key of the vcms portion to find
	* @return the vcms portion
	* @throws com.vportal.portlet.vcms.NoSuchVcmsPortionException if a vcms portion with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.vportal.portlet.vcms.model.VcmsPortion findByPrimaryKey(
		java.lang.String portionId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vcms.NoSuchVcmsPortionException {
		return getPersistence().findByPrimaryKey(portionId);
	}

	/**
	* Finds the vcms portion with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param portionId the primary key of the vcms portion to find
	* @return the vcms portion, or <code>null</code> if a vcms portion with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.vportal.portlet.vcms.model.VcmsPortion fetchByPrimaryKey(
		java.lang.String portionId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(portionId);
	}

	/**
	* Finds the vcms portion where groupId = &#63; and categorizable = &#63; or throws a {@link com.vportal.portlet.vcms.NoSuchVcmsPortionException} if it could not be found.
	*
	* @param groupId the group id to search with
	* @param categorizable the categorizable to search with
	* @return the matching vcms portion
	* @throws com.vportal.portlet.vcms.NoSuchVcmsPortionException if a matching vcms portion could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.vportal.portlet.vcms.model.VcmsPortion findByCategorizable(
		long groupId, boolean categorizable)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vcms.NoSuchVcmsPortionException {
		return getPersistence().findByCategorizable(groupId, categorizable);
	}

	/**
	* Finds the vcms portion where groupId = &#63; and categorizable = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param groupId the group id to search with
	* @param categorizable the categorizable to search with
	* @return the matching vcms portion, or <code>null</code> if a matching vcms portion could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.vportal.portlet.vcms.model.VcmsPortion fetchByCategorizable(
		long groupId, boolean categorizable)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByCategorizable(groupId, categorizable);
	}

	/**
	* Finds the vcms portion where groupId = &#63; and categorizable = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param groupId the group id to search with
	* @param categorizable the categorizable to search with
	* @return the matching vcms portion, or <code>null</code> if a matching vcms portion could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.vportal.portlet.vcms.model.VcmsPortion fetchByCategorizable(
		long groupId, boolean categorizable, boolean retrieveFromCache)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByCategorizable(groupId, categorizable,
			retrieveFromCache);
	}

	/**
	* Finds the vcms portion where groupId = &#63; and code = &#63; or throws a {@link com.vportal.portlet.vcms.NoSuchVcmsPortionException} if it could not be found.
	*
	* @param groupId the group id to search with
	* @param code the code to search with
	* @return the matching vcms portion
	* @throws com.vportal.portlet.vcms.NoSuchVcmsPortionException if a matching vcms portion could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.vportal.portlet.vcms.model.VcmsPortion findByS_C(
		long groupId, java.lang.String code)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vcms.NoSuchVcmsPortionException {
		return getPersistence().findByS_C(groupId, code);
	}

	/**
	* Finds the vcms portion where groupId = &#63; and code = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param groupId the group id to search with
	* @param code the code to search with
	* @return the matching vcms portion, or <code>null</code> if a matching vcms portion could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.vportal.portlet.vcms.model.VcmsPortion fetchByS_C(
		long groupId, java.lang.String code)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByS_C(groupId, code);
	}

	/**
	* Finds the vcms portion where groupId = &#63; and code = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param groupId the group id to search with
	* @param code the code to search with
	* @return the matching vcms portion, or <code>null</code> if a matching vcms portion could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.vportal.portlet.vcms.model.VcmsPortion fetchByS_C(
		long groupId, java.lang.String code, boolean retrieveFromCache)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByS_C(groupId, code, retrieveFromCache);
	}

	/**
	* Finds all the vcms portions where groupId = &#63; and language = &#63;.
	*
	* @param groupId the group id to search with
	* @param language the language to search with
	* @return the matching vcms portions
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.vportal.portlet.vcms.model.VcmsPortion> findByS_L(
		long groupId, java.lang.String language)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByS_L(groupId, language);
	}

	/**
	* Finds a range of all the vcms portions where groupId = &#63; and language = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param groupId the group id to search with
	* @param language the language to search with
	* @param start the lower bound of the range of vcms portions to return
	* @param end the upper bound of the range of vcms portions to return (not inclusive)
	* @return the range of matching vcms portions
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.vportal.portlet.vcms.model.VcmsPortion> findByS_L(
		long groupId, java.lang.String language, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByS_L(groupId, language, start, end);
	}

	/**
	* Finds an ordered range of all the vcms portions where groupId = &#63; and language = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param groupId the group id to search with
	* @param language the language to search with
	* @param start the lower bound of the range of vcms portions to return
	* @param end the upper bound of the range of vcms portions to return (not inclusive)
	* @param orderByComparator the comparator to order the results by
	* @return the ordered range of matching vcms portions
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.vportal.portlet.vcms.model.VcmsPortion> findByS_L(
		long groupId, java.lang.String language, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByS_L(groupId, language, start, end, orderByComparator);
	}

	/**
	* Finds the first vcms portion in the ordered set where groupId = &#63; and language = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param groupId the group id to search with
	* @param language the language to search with
	* @param orderByComparator the comparator to order the set by
	* @return the first matching vcms portion
	* @throws com.vportal.portlet.vcms.NoSuchVcmsPortionException if a matching vcms portion could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.vportal.portlet.vcms.model.VcmsPortion findByS_L_First(
		long groupId, java.lang.String language,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vcms.NoSuchVcmsPortionException {
		return getPersistence()
				   .findByS_L_First(groupId, language, orderByComparator);
	}

	/**
	* Finds the last vcms portion in the ordered set where groupId = &#63; and language = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param groupId the group id to search with
	* @param language the language to search with
	* @param orderByComparator the comparator to order the set by
	* @return the last matching vcms portion
	* @throws com.vportal.portlet.vcms.NoSuchVcmsPortionException if a matching vcms portion could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.vportal.portlet.vcms.model.VcmsPortion findByS_L_Last(
		long groupId, java.lang.String language,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vcms.NoSuchVcmsPortionException {
		return getPersistence()
				   .findByS_L_Last(groupId, language, orderByComparator);
	}

	/**
	* Finds the vcms portions before and after the current vcms portion in the ordered set where groupId = &#63; and language = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param portionId the primary key of the current vcms portion
	* @param groupId the group id to search with
	* @param language the language to search with
	* @param orderByComparator the comparator to order the set by
	* @return the previous, current, and next vcms portion
	* @throws com.vportal.portlet.vcms.NoSuchVcmsPortionException if a vcms portion with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.vportal.portlet.vcms.model.VcmsPortion[] findByS_L_PrevAndNext(
		java.lang.String portionId, long groupId, java.lang.String language,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vcms.NoSuchVcmsPortionException {
		return getPersistence()
				   .findByS_L_PrevAndNext(portionId, groupId, language,
			orderByComparator);
	}

	/**
	* Finds all the vcms portions.
	*
	* @return the vcms portions
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.vportal.portlet.vcms.model.VcmsPortion> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
	}

	/**
	* Finds a range of all the vcms portions.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of vcms portions to return
	* @param end the upper bound of the range of vcms portions to return (not inclusive)
	* @return the range of vcms portions
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.vportal.portlet.vcms.model.VcmsPortion> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

	/**
	* Finds an ordered range of all the vcms portions.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of vcms portions to return
	* @param end the upper bound of the range of vcms portions to return (not inclusive)
	* @param orderByComparator the comparator to order the results by
	* @return the ordered range of vcms portions
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.vportal.portlet.vcms.model.VcmsPortion> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes the vcms portion where groupId = &#63; and categorizable = &#63; from the database.
	*
	* @param groupId the group id to search with
	* @param categorizable the categorizable to search with
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByCategorizable(long groupId, boolean categorizable)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vcms.NoSuchVcmsPortionException {
		getPersistence().removeByCategorizable(groupId, categorizable);
	}

	/**
	* Removes the vcms portion where groupId = &#63; and code = &#63; from the database.
	*
	* @param groupId the group id to search with
	* @param code the code to search with
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByS_C(long groupId, java.lang.String code)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vcms.NoSuchVcmsPortionException {
		getPersistence().removeByS_C(groupId, code);
	}

	/**
	* Removes all the vcms portions where groupId = &#63; and language = &#63; from the database.
	*
	* @param groupId the group id to search with
	* @param language the language to search with
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByS_L(long groupId, java.lang.String language)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByS_L(groupId, language);
	}

	/**
	* Removes all the vcms portions from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Counts all the vcms portions where groupId = &#63; and categorizable = &#63;.
	*
	* @param groupId the group id to search with
	* @param categorizable the categorizable to search with
	* @return the number of matching vcms portions
	* @throws SystemException if a system exception occurred
	*/
	public static int countByCategorizable(long groupId, boolean categorizable)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByCategorizable(groupId, categorizable);
	}

	/**
	* Counts all the vcms portions where groupId = &#63; and code = &#63;.
	*
	* @param groupId the group id to search with
	* @param code the code to search with
	* @return the number of matching vcms portions
	* @throws SystemException if a system exception occurred
	*/
	public static int countByS_C(long groupId, java.lang.String code)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByS_C(groupId, code);
	}

	/**
	* Counts all the vcms portions where groupId = &#63; and language = &#63;.
	*
	* @param groupId the group id to search with
	* @param language the language to search with
	* @return the number of matching vcms portions
	* @throws SystemException if a system exception occurred
	*/
	public static int countByS_L(long groupId, java.lang.String language)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByS_L(groupId, language);
	}

	/**
	* Counts all the vcms portions.
	*
	* @return the number of vcms portions
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static VcmsPortionPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (VcmsPortionPersistence)PortletBeanLocatorUtil.locate(com.vportal.portlet.vcms.service.ClpSerializer.SERVLET_CONTEXT_NAME,
					VcmsPortionPersistence.class.getName());
		}

		return _persistence;
	}

	public void setPersistence(VcmsPortionPersistence persistence) {
		_persistence = persistence;
	}

	private static VcmsPortionPersistence _persistence;
}