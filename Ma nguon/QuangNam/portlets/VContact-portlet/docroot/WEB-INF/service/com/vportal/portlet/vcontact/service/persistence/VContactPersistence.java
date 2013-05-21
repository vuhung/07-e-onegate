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

package com.vportal.portlet.vcontact.service.persistence;

import com.liferay.portal.service.persistence.BasePersistence;

import com.vportal.portlet.vcontact.model.VContact;

/**
 * The persistence interface for the v contact service.
 *
 * <p>
 * Never modify or reference this interface directly. Always use {@link VContactUtil} to access the v contact persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
 * </p>
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Admin
 * @see VContactPersistenceImpl
 * @see VContactUtil
 * @generated
 */
public interface VContactPersistence extends BasePersistence<VContact> {
	/**
	* Caches the v contact in the entity cache if it is enabled.
	*
	* @param vContact the v contact to cache
	*/
	public void cacheResult(
		com.vportal.portlet.vcontact.model.VContact vContact);

	/**
	* Caches the v contacts in the entity cache if it is enabled.
	*
	* @param vContacts the v contacts to cache
	*/
	public void cacheResult(
		java.util.List<com.vportal.portlet.vcontact.model.VContact> vContacts);

	/**
	* Creates a new v contact with the primary key. Does not add the v contact to the database.
	*
	* @param id the primary key for the new v contact
	* @return the new v contact
	*/
	public com.vportal.portlet.vcontact.model.VContact create(long id);

	/**
	* Removes the v contact with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the v contact to remove
	* @return the v contact that was removed
	* @throws com.vportal.portlet.vcontact.NoSuchVContactException if a v contact with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.vportal.portlet.vcontact.model.VContact remove(long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vcontact.NoSuchVContactException;

	public com.vportal.portlet.vcontact.model.VContact updateImpl(
		com.vportal.portlet.vcontact.model.VContact vContact, boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Finds the v contact with the primary key or throws a {@link com.vportal.portlet.vcontact.NoSuchVContactException} if it could not be found.
	*
	* @param id the primary key of the v contact to find
	* @return the v contact
	* @throws com.vportal.portlet.vcontact.NoSuchVContactException if a v contact with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.vportal.portlet.vcontact.model.VContact findByPrimaryKey(long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vcontact.NoSuchVContactException;

	/**
	* Finds the v contact with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the v contact to find
	* @return the v contact, or <code>null</code> if a v contact with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.vportal.portlet.vcontact.model.VContact fetchByPrimaryKey(
		long id) throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Finds all the v contacts where status = &#63;.
	*
	* @param status the status to search with
	* @return the matching v contacts
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.vportal.portlet.vcontact.model.VContact> findByStatus(
		int status) throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Finds a range of all the v contacts where status = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param status the status to search with
	* @param start the lower bound of the range of v contacts to return
	* @param end the upper bound of the range of v contacts to return (not inclusive)
	* @return the range of matching v contacts
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.vportal.portlet.vcontact.model.VContact> findByStatus(
		int status, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Finds an ordered range of all the v contacts where status = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param status the status to search with
	* @param start the lower bound of the range of v contacts to return
	* @param end the upper bound of the range of v contacts to return (not inclusive)
	* @param orderByComparator the comparator to order the results by
	* @return the ordered range of matching v contacts
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.vportal.portlet.vcontact.model.VContact> findByStatus(
		int status, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Finds the first v contact in the ordered set where status = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param status the status to search with
	* @param orderByComparator the comparator to order the set by
	* @return the first matching v contact
	* @throws com.vportal.portlet.vcontact.NoSuchVContactException if a matching v contact could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.vportal.portlet.vcontact.model.VContact findByStatus_First(
		int status,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vcontact.NoSuchVContactException;

	/**
	* Finds the last v contact in the ordered set where status = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param status the status to search with
	* @param orderByComparator the comparator to order the set by
	* @return the last matching v contact
	* @throws com.vportal.portlet.vcontact.NoSuchVContactException if a matching v contact could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.vportal.portlet.vcontact.model.VContact findByStatus_Last(
		int status,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vcontact.NoSuchVContactException;

	/**
	* Finds the v contacts before and after the current v contact in the ordered set where status = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param id the primary key of the current v contact
	* @param status the status to search with
	* @param orderByComparator the comparator to order the set by
	* @return the previous, current, and next v contact
	* @throws com.vportal.portlet.vcontact.NoSuchVContactException if a v contact with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.vportal.portlet.vcontact.model.VContact[] findByStatus_PrevAndNext(
		long id, int status,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vcontact.NoSuchVContactException;

	/**
	* Finds all the v contacts where groupId = &#63; and status = &#63;.
	*
	* @param groupId the group id to search with
	* @param status the status to search with
	* @return the matching v contacts
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.vportal.portlet.vcontact.model.VContact> findByG_S(
		long groupId, int status)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Finds a range of all the v contacts where groupId = &#63; and status = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param groupId the group id to search with
	* @param status the status to search with
	* @param start the lower bound of the range of v contacts to return
	* @param end the upper bound of the range of v contacts to return (not inclusive)
	* @return the range of matching v contacts
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.vportal.portlet.vcontact.model.VContact> findByG_S(
		long groupId, int status, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Finds an ordered range of all the v contacts where groupId = &#63; and status = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param groupId the group id to search with
	* @param status the status to search with
	* @param start the lower bound of the range of v contacts to return
	* @param end the upper bound of the range of v contacts to return (not inclusive)
	* @param orderByComparator the comparator to order the results by
	* @return the ordered range of matching v contacts
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.vportal.portlet.vcontact.model.VContact> findByG_S(
		long groupId, int status, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Finds the first v contact in the ordered set where groupId = &#63; and status = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param groupId the group id to search with
	* @param status the status to search with
	* @param orderByComparator the comparator to order the set by
	* @return the first matching v contact
	* @throws com.vportal.portlet.vcontact.NoSuchVContactException if a matching v contact could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.vportal.portlet.vcontact.model.VContact findByG_S_First(
		long groupId, int status,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vcontact.NoSuchVContactException;

	/**
	* Finds the last v contact in the ordered set where groupId = &#63; and status = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param groupId the group id to search with
	* @param status the status to search with
	* @param orderByComparator the comparator to order the set by
	* @return the last matching v contact
	* @throws com.vportal.portlet.vcontact.NoSuchVContactException if a matching v contact could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.vportal.portlet.vcontact.model.VContact findByG_S_Last(
		long groupId, int status,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vcontact.NoSuchVContactException;

	/**
	* Finds the v contacts before and after the current v contact in the ordered set where groupId = &#63; and status = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param id the primary key of the current v contact
	* @param groupId the group id to search with
	* @param status the status to search with
	* @param orderByComparator the comparator to order the set by
	* @return the previous, current, and next v contact
	* @throws com.vportal.portlet.vcontact.NoSuchVContactException if a v contact with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.vportal.portlet.vcontact.model.VContact[] findByG_S_PrevAndNext(
		long id, long groupId, int status,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vcontact.NoSuchVContactException;

	/**
	* Finds all the v contacts.
	*
	* @return the v contacts
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.vportal.portlet.vcontact.model.VContact> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Finds a range of all the v contacts.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of v contacts to return
	* @param end the upper bound of the range of v contacts to return (not inclusive)
	* @return the range of v contacts
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.vportal.portlet.vcontact.model.VContact> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Finds an ordered range of all the v contacts.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of v contacts to return
	* @param end the upper bound of the range of v contacts to return (not inclusive)
	* @param orderByComparator the comparator to order the results by
	* @return the ordered range of v contacts
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.vportal.portlet.vcontact.model.VContact> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the v contacts where status = &#63; from the database.
	*
	* @param status the status to search with
	* @throws SystemException if a system exception occurred
	*/
	public void removeByStatus(int status)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the v contacts where groupId = &#63; and status = &#63; from the database.
	*
	* @param groupId the group id to search with
	* @param status the status to search with
	* @throws SystemException if a system exception occurred
	*/
	public void removeByG_S(long groupId, int status)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the v contacts from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Counts all the v contacts where status = &#63;.
	*
	* @param status the status to search with
	* @return the number of matching v contacts
	* @throws SystemException if a system exception occurred
	*/
	public int countByStatus(int status)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Counts all the v contacts where groupId = &#63; and status = &#63;.
	*
	* @param groupId the group id to search with
	* @param status the status to search with
	* @return the number of matching v contacts
	* @throws SystemException if a system exception occurred
	*/
	public int countByG_S(long groupId, int status)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Counts all the v contacts.
	*
	* @return the number of v contacts
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}