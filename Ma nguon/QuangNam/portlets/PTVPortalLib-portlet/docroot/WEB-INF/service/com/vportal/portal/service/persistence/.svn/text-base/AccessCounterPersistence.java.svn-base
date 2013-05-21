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

package com.vportal.portal.service.persistence;

import com.liferay.portal.service.persistence.BasePersistence;

import com.vportal.portal.model.AccessCounter;

/**
 * The persistence interface for the access counter service.
 *
 * <p>
 * Never modify or reference this interface directly. Always use {@link AccessCounterUtil} to access the access counter persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
 * </p>
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author HOAN
 * @see AccessCounterPersistenceImpl
 * @see AccessCounterUtil
 * @generated
 */
public interface AccessCounterPersistence extends BasePersistence<AccessCounter> {
	/**
	* Caches the access counter in the entity cache if it is enabled.
	*
	* @param accessCounter the access counter to cache
	*/
	public void cacheResult(
		com.vportal.portal.model.AccessCounter accessCounter);

	/**
	* Caches the access counters in the entity cache if it is enabled.
	*
	* @param accessCounters the access counters to cache
	*/
	public void cacheResult(
		java.util.List<com.vportal.portal.model.AccessCounter> accessCounters);

	/**
	* Creates a new access counter with the primary key. Does not add the access counter to the database.
	*
	* @param id the primary key for the new access counter
	* @return the new access counter
	*/
	public com.vportal.portal.model.AccessCounter create(long id);

	/**
	* Removes the access counter with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the access counter to remove
	* @return the access counter that was removed
	* @throws com.vportal.portal.NoSuchAccessCounterException if a access counter with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.vportal.portal.model.AccessCounter remove(long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portal.NoSuchAccessCounterException;

	public com.vportal.portal.model.AccessCounter updateImpl(
		com.vportal.portal.model.AccessCounter accessCounter, boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Finds the access counter with the primary key or throws a {@link com.vportal.portal.NoSuchAccessCounterException} if it could not be found.
	*
	* @param id the primary key of the access counter to find
	* @return the access counter
	* @throws com.vportal.portal.NoSuchAccessCounterException if a access counter with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.vportal.portal.model.AccessCounter findByPrimaryKey(long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portal.NoSuchAccessCounterException;

	/**
	* Finds the access counter with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the access counter to find
	* @return the access counter, or <code>null</code> if a access counter with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.vportal.portal.model.AccessCounter fetchByPrimaryKey(long id)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Finds the access counter where companyId = &#63; and accessDate = &#63; or throws a {@link com.vportal.portal.NoSuchAccessCounterException} if it could not be found.
	*
	* @param companyId the company id to search with
	* @param accessDate the access date to search with
	* @return the matching access counter
	* @throws com.vportal.portal.NoSuchAccessCounterException if a matching access counter could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.vportal.portal.model.AccessCounter findByAccessDate(
		long companyId, java.util.Date accessDate)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portal.NoSuchAccessCounterException;

	/**
	* Finds the access counter where companyId = &#63; and accessDate = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param companyId the company id to search with
	* @param accessDate the access date to search with
	* @return the matching access counter, or <code>null</code> if a matching access counter could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.vportal.portal.model.AccessCounter fetchByAccessDate(
		long companyId, java.util.Date accessDate)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Finds the access counter where companyId = &#63; and accessDate = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param companyId the company id to search with
	* @param accessDate the access date to search with
	* @return the matching access counter, or <code>null</code> if a matching access counter could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.vportal.portal.model.AccessCounter fetchByAccessDate(
		long companyId, java.util.Date accessDate, boolean retrieveFromCache)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Finds all the access counters where companyId = &#63;.
	*
	* @param companyId the company id to search with
	* @return the matching access counters
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.vportal.portal.model.AccessCounter> findByCompanyId(
		long companyId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Finds a range of all the access counters where companyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param companyId the company id to search with
	* @param start the lower bound of the range of access counters to return
	* @param end the upper bound of the range of access counters to return (not inclusive)
	* @return the range of matching access counters
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.vportal.portal.model.AccessCounter> findByCompanyId(
		long companyId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Finds an ordered range of all the access counters where companyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param companyId the company id to search with
	* @param start the lower bound of the range of access counters to return
	* @param end the upper bound of the range of access counters to return (not inclusive)
	* @param orderByComparator the comparator to order the results by
	* @return the ordered range of matching access counters
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.vportal.portal.model.AccessCounter> findByCompanyId(
		long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Finds the first access counter in the ordered set where companyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param companyId the company id to search with
	* @param orderByComparator the comparator to order the set by
	* @return the first matching access counter
	* @throws com.vportal.portal.NoSuchAccessCounterException if a matching access counter could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.vportal.portal.model.AccessCounter findByCompanyId_First(
		long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portal.NoSuchAccessCounterException;

	/**
	* Finds the last access counter in the ordered set where companyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param companyId the company id to search with
	* @param orderByComparator the comparator to order the set by
	* @return the last matching access counter
	* @throws com.vportal.portal.NoSuchAccessCounterException if a matching access counter could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.vportal.portal.model.AccessCounter findByCompanyId_Last(
		long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portal.NoSuchAccessCounterException;

	/**
	* Finds the access counters before and after the current access counter in the ordered set where companyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param id the primary key of the current access counter
	* @param companyId the company id to search with
	* @param orderByComparator the comparator to order the set by
	* @return the previous, current, and next access counter
	* @throws com.vportal.portal.NoSuchAccessCounterException if a access counter with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.vportal.portal.model.AccessCounter[] findByCompanyId_PrevAndNext(
		long id, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portal.NoSuchAccessCounterException;

	/**
	* Finds all the access counters.
	*
	* @return the access counters
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.vportal.portal.model.AccessCounter> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Finds a range of all the access counters.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of access counters to return
	* @param end the upper bound of the range of access counters to return (not inclusive)
	* @return the range of access counters
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.vportal.portal.model.AccessCounter> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Finds an ordered range of all the access counters.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of access counters to return
	* @param end the upper bound of the range of access counters to return (not inclusive)
	* @param orderByComparator the comparator to order the results by
	* @return the ordered range of access counters
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.vportal.portal.model.AccessCounter> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes the access counter where companyId = &#63; and accessDate = &#63; from the database.
	*
	* @param companyId the company id to search with
	* @param accessDate the access date to search with
	* @throws SystemException if a system exception occurred
	*/
	public void removeByAccessDate(long companyId, java.util.Date accessDate)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portal.NoSuchAccessCounterException;

	/**
	* Removes all the access counters where companyId = &#63; from the database.
	*
	* @param companyId the company id to search with
	* @throws SystemException if a system exception occurred
	*/
	public void removeByCompanyId(long companyId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the access counters from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Counts all the access counters where companyId = &#63; and accessDate = &#63;.
	*
	* @param companyId the company id to search with
	* @param accessDate the access date to search with
	* @return the number of matching access counters
	* @throws SystemException if a system exception occurred
	*/
	public int countByAccessDate(long companyId, java.util.Date accessDate)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Counts all the access counters where companyId = &#63;.
	*
	* @param companyId the company id to search with
	* @return the number of matching access counters
	* @throws SystemException if a system exception occurred
	*/
	public int countByCompanyId(long companyId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Counts all the access counters.
	*
	* @return the number of access counters
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}