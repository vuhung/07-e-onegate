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

import com.vportal.portlet.vcms.model.VcmsType;

import java.util.List;

/**
 * The persistence utility for the vcms type service. This utility wraps {@link VcmsTypePersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
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
 * @see VcmsTypePersistence
 * @see VcmsTypePersistenceImpl
 * @generated
 */
public class VcmsTypeUtil {
	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#clearCache()
	 */
	public static void clearCache() {
		getPersistence().clearCache();
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#clearCache(com.liferay.portal.model.BaseModel)
	 */
	public static void clearCache(VcmsType vcmsType) {
		getPersistence().clearCache(vcmsType);
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
	public static List<VcmsType> findWithDynamicQuery(DynamicQuery dynamicQuery)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<VcmsType> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<VcmsType> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#remove(com.liferay.portal.model.BaseModel)
	 */
	public static VcmsType remove(VcmsType vcmsType) throws SystemException {
		return getPersistence().remove(vcmsType);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, boolean)
	 */
	public static VcmsType update(VcmsType vcmsType, boolean merge)
		throws SystemException {
		return getPersistence().update(vcmsType, merge);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, boolean, ServiceContext)
	 */
	public static VcmsType update(VcmsType vcmsType, boolean merge,
		ServiceContext serviceContext) throws SystemException {
		return getPersistence().update(vcmsType, merge, serviceContext);
	}

	/**
	* Caches the vcms type in the entity cache if it is enabled.
	*
	* @param vcmsType the vcms type to cache
	*/
	public static void cacheResult(
		com.vportal.portlet.vcms.model.VcmsType vcmsType) {
		getPersistence().cacheResult(vcmsType);
	}

	/**
	* Caches the vcms types in the entity cache if it is enabled.
	*
	* @param vcmsTypes the vcms types to cache
	*/
	public static void cacheResult(
		java.util.List<com.vportal.portlet.vcms.model.VcmsType> vcmsTypes) {
		getPersistence().cacheResult(vcmsTypes);
	}

	/**
	* Creates a new vcms type with the primary key. Does not add the vcms type to the database.
	*
	* @param typeId the primary key for the new vcms type
	* @return the new vcms type
	*/
	public static com.vportal.portlet.vcms.model.VcmsType create(
		java.lang.String typeId) {
		return getPersistence().create(typeId);
	}

	/**
	* Removes the vcms type with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param typeId the primary key of the vcms type to remove
	* @return the vcms type that was removed
	* @throws com.vportal.portlet.vcms.NoSuchVcmsTypeException if a vcms type with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.vportal.portlet.vcms.model.VcmsType remove(
		java.lang.String typeId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vcms.NoSuchVcmsTypeException {
		return getPersistence().remove(typeId);
	}

	public static com.vportal.portlet.vcms.model.VcmsType updateImpl(
		com.vportal.portlet.vcms.model.VcmsType vcmsType, boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(vcmsType, merge);
	}

	/**
	* Finds the vcms type with the primary key or throws a {@link com.vportal.portlet.vcms.NoSuchVcmsTypeException} if it could not be found.
	*
	* @param typeId the primary key of the vcms type to find
	* @return the vcms type
	* @throws com.vportal.portlet.vcms.NoSuchVcmsTypeException if a vcms type with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.vportal.portlet.vcms.model.VcmsType findByPrimaryKey(
		java.lang.String typeId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vcms.NoSuchVcmsTypeException {
		return getPersistence().findByPrimaryKey(typeId);
	}

	/**
	* Finds the vcms type with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param typeId the primary key of the vcms type to find
	* @return the vcms type, or <code>null</code> if a vcms type with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.vportal.portlet.vcms.model.VcmsType fetchByPrimaryKey(
		java.lang.String typeId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(typeId);
	}

	/**
	* Finds the vcms type where groupId = &#63; and code = &#63; or throws a {@link com.vportal.portlet.vcms.NoSuchVcmsTypeException} if it could not be found.
	*
	* @param groupId the group id to search with
	* @param code the code to search with
	* @return the matching vcms type
	* @throws com.vportal.portlet.vcms.NoSuchVcmsTypeException if a matching vcms type could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.vportal.portlet.vcms.model.VcmsType findByS_C(
		long groupId, java.lang.String code)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vcms.NoSuchVcmsTypeException {
		return getPersistence().findByS_C(groupId, code);
	}

	/**
	* Finds the vcms type where groupId = &#63; and code = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param groupId the group id to search with
	* @param code the code to search with
	* @return the matching vcms type, or <code>null</code> if a matching vcms type could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.vportal.portlet.vcms.model.VcmsType fetchByS_C(
		long groupId, java.lang.String code)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByS_C(groupId, code);
	}

	/**
	* Finds the vcms type where groupId = &#63; and code = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param groupId the group id to search with
	* @param code the code to search with
	* @return the matching vcms type, or <code>null</code> if a matching vcms type could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.vportal.portlet.vcms.model.VcmsType fetchByS_C(
		long groupId, java.lang.String code, boolean retrieveFromCache)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByS_C(groupId, code, retrieveFromCache);
	}

	/**
	* Finds all the vcms types where groupId = &#63; and language = &#63;.
	*
	* @param groupId the group id to search with
	* @param language the language to search with
	* @return the matching vcms types
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.vportal.portlet.vcms.model.VcmsType> findByS_L(
		long groupId, java.lang.String language)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByS_L(groupId, language);
	}

	/**
	* Finds a range of all the vcms types where groupId = &#63; and language = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param groupId the group id to search with
	* @param language the language to search with
	* @param start the lower bound of the range of vcms types to return
	* @param end the upper bound of the range of vcms types to return (not inclusive)
	* @return the range of matching vcms types
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.vportal.portlet.vcms.model.VcmsType> findByS_L(
		long groupId, java.lang.String language, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByS_L(groupId, language, start, end);
	}

	/**
	* Finds an ordered range of all the vcms types where groupId = &#63; and language = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param groupId the group id to search with
	* @param language the language to search with
	* @param start the lower bound of the range of vcms types to return
	* @param end the upper bound of the range of vcms types to return (not inclusive)
	* @param orderByComparator the comparator to order the results by
	* @return the ordered range of matching vcms types
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.vportal.portlet.vcms.model.VcmsType> findByS_L(
		long groupId, java.lang.String language, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByS_L(groupId, language, start, end, orderByComparator);
	}

	/**
	* Finds the first vcms type in the ordered set where groupId = &#63; and language = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param groupId the group id to search with
	* @param language the language to search with
	* @param orderByComparator the comparator to order the set by
	* @return the first matching vcms type
	* @throws com.vportal.portlet.vcms.NoSuchVcmsTypeException if a matching vcms type could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.vportal.portlet.vcms.model.VcmsType findByS_L_First(
		long groupId, java.lang.String language,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vcms.NoSuchVcmsTypeException {
		return getPersistence()
				   .findByS_L_First(groupId, language, orderByComparator);
	}

	/**
	* Finds the last vcms type in the ordered set where groupId = &#63; and language = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param groupId the group id to search with
	* @param language the language to search with
	* @param orderByComparator the comparator to order the set by
	* @return the last matching vcms type
	* @throws com.vportal.portlet.vcms.NoSuchVcmsTypeException if a matching vcms type could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.vportal.portlet.vcms.model.VcmsType findByS_L_Last(
		long groupId, java.lang.String language,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vcms.NoSuchVcmsTypeException {
		return getPersistence()
				   .findByS_L_Last(groupId, language, orderByComparator);
	}

	/**
	* Finds the vcms types before and after the current vcms type in the ordered set where groupId = &#63; and language = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param typeId the primary key of the current vcms type
	* @param groupId the group id to search with
	* @param language the language to search with
	* @param orderByComparator the comparator to order the set by
	* @return the previous, current, and next vcms type
	* @throws com.vportal.portlet.vcms.NoSuchVcmsTypeException if a vcms type with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.vportal.portlet.vcms.model.VcmsType[] findByS_L_PrevAndNext(
		java.lang.String typeId, long groupId, java.lang.String language,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vcms.NoSuchVcmsTypeException {
		return getPersistence()
				   .findByS_L_PrevAndNext(typeId, groupId, language,
			orderByComparator);
	}

	/**
	* Finds all the vcms types.
	*
	* @return the vcms types
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.vportal.portlet.vcms.model.VcmsType> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
	}

	/**
	* Finds a range of all the vcms types.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of vcms types to return
	* @param end the upper bound of the range of vcms types to return (not inclusive)
	* @return the range of vcms types
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.vportal.portlet.vcms.model.VcmsType> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

	/**
	* Finds an ordered range of all the vcms types.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of vcms types to return
	* @param end the upper bound of the range of vcms types to return (not inclusive)
	* @param orderByComparator the comparator to order the results by
	* @return the ordered range of vcms types
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.vportal.portlet.vcms.model.VcmsType> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes the vcms type where groupId = &#63; and code = &#63; from the database.
	*
	* @param groupId the group id to search with
	* @param code the code to search with
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByS_C(long groupId, java.lang.String code)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vcms.NoSuchVcmsTypeException {
		getPersistence().removeByS_C(groupId, code);
	}

	/**
	* Removes all the vcms types where groupId = &#63; and language = &#63; from the database.
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
	* Removes all the vcms types from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Counts all the vcms types where groupId = &#63; and code = &#63;.
	*
	* @param groupId the group id to search with
	* @param code the code to search with
	* @return the number of matching vcms types
	* @throws SystemException if a system exception occurred
	*/
	public static int countByS_C(long groupId, java.lang.String code)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByS_C(groupId, code);
	}

	/**
	* Counts all the vcms types where groupId = &#63; and language = &#63;.
	*
	* @param groupId the group id to search with
	* @param language the language to search with
	* @return the number of matching vcms types
	* @throws SystemException if a system exception occurred
	*/
	public static int countByS_L(long groupId, java.lang.String language)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByS_L(groupId, language);
	}

	/**
	* Counts all the vcms types.
	*
	* @return the number of vcms types
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static VcmsTypePersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (VcmsTypePersistence)PortletBeanLocatorUtil.locate(com.vportal.portlet.vcms.service.ClpSerializer.SERVLET_CONTEXT_NAME,
					VcmsTypePersistence.class.getName());
		}

		return _persistence;
	}

	public void setPersistence(VcmsTypePersistence persistence) {
		_persistence = persistence;
	}

	private static VcmsTypePersistence _persistence;
}