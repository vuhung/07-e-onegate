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

import com.vportal.portlet.vcms.model.VcmsType;

/**
 * The persistence interface for the vcms type service.
 *
 * <p>
 * Never modify or reference this interface directly. Always use {@link VcmsTypeUtil} to access the vcms type persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
 * </p>
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author HOAN
 * @see VcmsTypePersistenceImpl
 * @see VcmsTypeUtil
 * @generated
 */
public interface VcmsTypePersistence extends BasePersistence<VcmsType> {
	/**
	* Caches the vcms type in the entity cache if it is enabled.
	*
	* @param vcmsType the vcms type to cache
	*/
	public void cacheResult(com.vportal.portlet.vcms.model.VcmsType vcmsType);

	/**
	* Caches the vcms types in the entity cache if it is enabled.
	*
	* @param vcmsTypes the vcms types to cache
	*/
	public void cacheResult(
		java.util.List<com.vportal.portlet.vcms.model.VcmsType> vcmsTypes);

	/**
	* Creates a new vcms type with the primary key. Does not add the vcms type to the database.
	*
	* @param typeId the primary key for the new vcms type
	* @return the new vcms type
	*/
	public com.vportal.portlet.vcms.model.VcmsType create(
		java.lang.String typeId);

	/**
	* Removes the vcms type with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param typeId the primary key of the vcms type to remove
	* @return the vcms type that was removed
	* @throws com.vportal.portlet.vcms.NoSuchVcmsTypeException if a vcms type with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.vportal.portlet.vcms.model.VcmsType remove(
		java.lang.String typeId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vcms.NoSuchVcmsTypeException;

	public com.vportal.portlet.vcms.model.VcmsType updateImpl(
		com.vportal.portlet.vcms.model.VcmsType vcmsType, boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Finds the vcms type with the primary key or throws a {@link com.vportal.portlet.vcms.NoSuchVcmsTypeException} if it could not be found.
	*
	* @param typeId the primary key of the vcms type to find
	* @return the vcms type
	* @throws com.vportal.portlet.vcms.NoSuchVcmsTypeException if a vcms type with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.vportal.portlet.vcms.model.VcmsType findByPrimaryKey(
		java.lang.String typeId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vcms.NoSuchVcmsTypeException;

	/**
	* Finds the vcms type with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param typeId the primary key of the vcms type to find
	* @return the vcms type, or <code>null</code> if a vcms type with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.vportal.portlet.vcms.model.VcmsType fetchByPrimaryKey(
		java.lang.String typeId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Finds the vcms type where groupId = &#63; and code = &#63; or throws a {@link com.vportal.portlet.vcms.NoSuchVcmsTypeException} if it could not be found.
	*
	* @param groupId the group id to search with
	* @param code the code to search with
	* @return the matching vcms type
	* @throws com.vportal.portlet.vcms.NoSuchVcmsTypeException if a matching vcms type could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.vportal.portlet.vcms.model.VcmsType findByS_C(long groupId,
		java.lang.String code)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vcms.NoSuchVcmsTypeException;

	/**
	* Finds the vcms type where groupId = &#63; and code = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param groupId the group id to search with
	* @param code the code to search with
	* @return the matching vcms type, or <code>null</code> if a matching vcms type could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.vportal.portlet.vcms.model.VcmsType fetchByS_C(long groupId,
		java.lang.String code)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Finds the vcms type where groupId = &#63; and code = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param groupId the group id to search with
	* @param code the code to search with
	* @return the matching vcms type, or <code>null</code> if a matching vcms type could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.vportal.portlet.vcms.model.VcmsType fetchByS_C(long groupId,
		java.lang.String code, boolean retrieveFromCache)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Finds all the vcms types where groupId = &#63; and language = &#63;.
	*
	* @param groupId the group id to search with
	* @param language the language to search with
	* @return the matching vcms types
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.vportal.portlet.vcms.model.VcmsType> findByS_L(
		long groupId, java.lang.String language)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.vportal.portlet.vcms.model.VcmsType> findByS_L(
		long groupId, java.lang.String language, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.vportal.portlet.vcms.model.VcmsType> findByS_L(
		long groupId, java.lang.String language, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public com.vportal.portlet.vcms.model.VcmsType findByS_L_First(
		long groupId, java.lang.String language,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vcms.NoSuchVcmsTypeException;

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
	public com.vportal.portlet.vcms.model.VcmsType findByS_L_Last(
		long groupId, java.lang.String language,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vcms.NoSuchVcmsTypeException;

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
	public com.vportal.portlet.vcms.model.VcmsType[] findByS_L_PrevAndNext(
		java.lang.String typeId, long groupId, java.lang.String language,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vcms.NoSuchVcmsTypeException;

	/**
	* Finds all the vcms types.
	*
	* @return the vcms types
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.vportal.portlet.vcms.model.VcmsType> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.vportal.portlet.vcms.model.VcmsType> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.vportal.portlet.vcms.model.VcmsType> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes the vcms type where groupId = &#63; and code = &#63; from the database.
	*
	* @param groupId the group id to search with
	* @param code the code to search with
	* @throws SystemException if a system exception occurred
	*/
	public void removeByS_C(long groupId, java.lang.String code)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vcms.NoSuchVcmsTypeException;

	/**
	* Removes all the vcms types where groupId = &#63; and language = &#63; from the database.
	*
	* @param groupId the group id to search with
	* @param language the language to search with
	* @throws SystemException if a system exception occurred
	*/
	public void removeByS_L(long groupId, java.lang.String language)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the vcms types from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Counts all the vcms types where groupId = &#63; and code = &#63;.
	*
	* @param groupId the group id to search with
	* @param code the code to search with
	* @return the number of matching vcms types
	* @throws SystemException if a system exception occurred
	*/
	public int countByS_C(long groupId, java.lang.String code)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Counts all the vcms types where groupId = &#63; and language = &#63;.
	*
	* @param groupId the group id to search with
	* @param language the language to search with
	* @return the number of matching vcms types
	* @throws SystemException if a system exception occurred
	*/
	public int countByS_L(long groupId, java.lang.String language)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Counts all the vcms types.
	*
	* @return the number of vcms types
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}