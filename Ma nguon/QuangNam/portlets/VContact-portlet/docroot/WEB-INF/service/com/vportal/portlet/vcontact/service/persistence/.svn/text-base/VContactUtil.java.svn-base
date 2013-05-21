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

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.service.ServiceContext;

import com.vportal.portlet.vcontact.model.VContact;

import java.util.List;

/**
 * The persistence utility for the v contact service. This utility wraps {@link VContactPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Never modify this class directly. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
 * </p>
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Admin
 * @see VContactPersistence
 * @see VContactPersistenceImpl
 * @generated
 */
public class VContactUtil {
	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#clearCache()
	 */
	public static void clearCache() {
		getPersistence().clearCache();
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#clearCache(com.liferay.portal.model.BaseModel)
	 */
	public static void clearCache(VContact vContact) {
		getPersistence().clearCache(vContact);
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
	public static List<VContact> findWithDynamicQuery(DynamicQuery dynamicQuery)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<VContact> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<VContact> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#remove(com.liferay.portal.model.BaseModel)
	 */
	public static VContact remove(VContact vContact) throws SystemException {
		return getPersistence().remove(vContact);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, boolean)
	 */
	public static VContact update(VContact vContact, boolean merge)
		throws SystemException {
		return getPersistence().update(vContact, merge);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, boolean, ServiceContext)
	 */
	public static VContact update(VContact vContact, boolean merge,
		ServiceContext serviceContext) throws SystemException {
		return getPersistence().update(vContact, merge, serviceContext);
	}

	/**
	* Caches the v contact in the entity cache if it is enabled.
	*
	* @param vContact the v contact to cache
	*/
	public static void cacheResult(
		com.vportal.portlet.vcontact.model.VContact vContact) {
		getPersistence().cacheResult(vContact);
	}

	/**
	* Caches the v contacts in the entity cache if it is enabled.
	*
	* @param vContacts the v contacts to cache
	*/
	public static void cacheResult(
		java.util.List<com.vportal.portlet.vcontact.model.VContact> vContacts) {
		getPersistence().cacheResult(vContacts);
	}

	/**
	* Creates a new v contact with the primary key. Does not add the v contact to the database.
	*
	* @param id the primary key for the new v contact
	* @return the new v contact
	*/
	public static com.vportal.portlet.vcontact.model.VContact create(long id) {
		return getPersistence().create(id);
	}

	/**
	* Removes the v contact with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the v contact to remove
	* @return the v contact that was removed
	* @throws com.vportal.portlet.vcontact.NoSuchVContactException if a v contact with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.vportal.portlet.vcontact.model.VContact remove(long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vcontact.NoSuchVContactException {
		return getPersistence().remove(id);
	}

	public static com.vportal.portlet.vcontact.model.VContact updateImpl(
		com.vportal.portlet.vcontact.model.VContact vContact, boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(vContact, merge);
	}

	/**
	* Finds the v contact with the primary key or throws a {@link com.vportal.portlet.vcontact.NoSuchVContactException} if it could not be found.
	*
	* @param id the primary key of the v contact to find
	* @return the v contact
	* @throws com.vportal.portlet.vcontact.NoSuchVContactException if a v contact with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.vportal.portlet.vcontact.model.VContact findByPrimaryKey(
		long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vcontact.NoSuchVContactException {
		return getPersistence().findByPrimaryKey(id);
	}

	/**
	* Finds the v contact with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the v contact to find
	* @return the v contact, or <code>null</code> if a v contact with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.vportal.portlet.vcontact.model.VContact fetchByPrimaryKey(
		long id) throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(id);
	}

	/**
	* Finds all the v contacts where status = &#63;.
	*
	* @param status the status to search with
	* @return the matching v contacts
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.vportal.portlet.vcontact.model.VContact> findByStatus(
		int status) throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByStatus(status);
	}

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
	public static java.util.List<com.vportal.portlet.vcontact.model.VContact> findByStatus(
		int status, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByStatus(status, start, end);
	}

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
	public static java.util.List<com.vportal.portlet.vcontact.model.VContact> findByStatus(
		int status, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByStatus(status, start, end, orderByComparator);
	}

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
	public static com.vportal.portlet.vcontact.model.VContact findByStatus_First(
		int status,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vcontact.NoSuchVContactException {
		return getPersistence().findByStatus_First(status, orderByComparator);
	}

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
	public static com.vportal.portlet.vcontact.model.VContact findByStatus_Last(
		int status,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vcontact.NoSuchVContactException {
		return getPersistence().findByStatus_Last(status, orderByComparator);
	}

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
	public static com.vportal.portlet.vcontact.model.VContact[] findByStatus_PrevAndNext(
		long id, int status,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vcontact.NoSuchVContactException {
		return getPersistence()
				   .findByStatus_PrevAndNext(id, status, orderByComparator);
	}

	/**
	* Finds all the v contacts where groupId = &#63; and status = &#63;.
	*
	* @param groupId the group id to search with
	* @param status the status to search with
	* @return the matching v contacts
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.vportal.portlet.vcontact.model.VContact> findByG_S(
		long groupId, int status)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByG_S(groupId, status);
	}

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
	public static java.util.List<com.vportal.portlet.vcontact.model.VContact> findByG_S(
		long groupId, int status, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByG_S(groupId, status, start, end);
	}

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
	public static java.util.List<com.vportal.portlet.vcontact.model.VContact> findByG_S(
		long groupId, int status, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByG_S(groupId, status, start, end, orderByComparator);
	}

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
	public static com.vportal.portlet.vcontact.model.VContact findByG_S_First(
		long groupId, int status,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vcontact.NoSuchVContactException {
		return getPersistence()
				   .findByG_S_First(groupId, status, orderByComparator);
	}

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
	public static com.vportal.portlet.vcontact.model.VContact findByG_S_Last(
		long groupId, int status,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vcontact.NoSuchVContactException {
		return getPersistence()
				   .findByG_S_Last(groupId, status, orderByComparator);
	}

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
	public static com.vportal.portlet.vcontact.model.VContact[] findByG_S_PrevAndNext(
		long id, long groupId, int status,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vcontact.NoSuchVContactException {
		return getPersistence()
				   .findByG_S_PrevAndNext(id, groupId, status, orderByComparator);
	}

	/**
	* Finds all the v contacts.
	*
	* @return the v contacts
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.vportal.portlet.vcontact.model.VContact> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
	}

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
	public static java.util.List<com.vportal.portlet.vcontact.model.VContact> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

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
	public static java.util.List<com.vportal.portlet.vcontact.model.VContact> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the v contacts where status = &#63; from the database.
	*
	* @param status the status to search with
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByStatus(int status)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByStatus(status);
	}

	/**
	* Removes all the v contacts where groupId = &#63; and status = &#63; from the database.
	*
	* @param groupId the group id to search with
	* @param status the status to search with
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByG_S(long groupId, int status)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByG_S(groupId, status);
	}

	/**
	* Removes all the v contacts from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Counts all the v contacts where status = &#63;.
	*
	* @param status the status to search with
	* @return the number of matching v contacts
	* @throws SystemException if a system exception occurred
	*/
	public static int countByStatus(int status)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByStatus(status);
	}

	/**
	* Counts all the v contacts where groupId = &#63; and status = &#63;.
	*
	* @param groupId the group id to search with
	* @param status the status to search with
	* @return the number of matching v contacts
	* @throws SystemException if a system exception occurred
	*/
	public static int countByG_S(long groupId, int status)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByG_S(groupId, status);
	}

	/**
	* Counts all the v contacts.
	*
	* @return the number of v contacts
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static VContactPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (VContactPersistence)PortletBeanLocatorUtil.locate(com.vportal.portlet.vcontact.service.ClpSerializer.SERVLET_CONTEXT_NAME,
					VContactPersistence.class.getName());
		}

		return _persistence;
	}

	public void setPersistence(VContactPersistence persistence) {
		_persistence = persistence;
	}

	private static VContactPersistence _persistence;
}