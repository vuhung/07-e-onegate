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

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.service.ServiceContext;

import com.vportal.portal.model.PortletFolder;

import java.util.List;

/**
 * The persistence utility for the portlet folder service. This utility wraps {@link PortletFolderPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
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
 * @see PortletFolderPersistence
 * @see PortletFolderPersistenceImpl
 * @generated
 */
public class PortletFolderUtil {
	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#clearCache()
	 */
	public static void clearCache() {
		getPersistence().clearCache();
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#clearCache(com.liferay.portal.model.BaseModel)
	 */
	public static void clearCache(PortletFolder portletFolder) {
		getPersistence().clearCache(portletFolder);
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
	public static List<PortletFolder> findWithDynamicQuery(
		DynamicQuery dynamicQuery) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<PortletFolder> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<PortletFolder> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#remove(com.liferay.portal.model.BaseModel)
	 */
	public static PortletFolder remove(PortletFolder portletFolder)
		throws SystemException {
		return getPersistence().remove(portletFolder);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, boolean)
	 */
	public static PortletFolder update(PortletFolder portletFolder,
		boolean merge) throws SystemException {
		return getPersistence().update(portletFolder, merge);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, boolean, ServiceContext)
	 */
	public static PortletFolder update(PortletFolder portletFolder,
		boolean merge, ServiceContext serviceContext) throws SystemException {
		return getPersistence().update(portletFolder, merge, serviceContext);
	}

	/**
	* Caches the portlet folder in the entity cache if it is enabled.
	*
	* @param portletFolder the portlet folder to cache
	*/
	public static void cacheResult(
		com.vportal.portal.model.PortletFolder portletFolder) {
		getPersistence().cacheResult(portletFolder);
	}

	/**
	* Caches the portlet folders in the entity cache if it is enabled.
	*
	* @param portletFolders the portlet folders to cache
	*/
	public static void cacheResult(
		java.util.List<com.vportal.portal.model.PortletFolder> portletFolders) {
		getPersistence().cacheResult(portletFolders);
	}

	/**
	* Creates a new portlet folder with the primary key. Does not add the portlet folder to the database.
	*
	* @param id the primary key for the new portlet folder
	* @return the new portlet folder
	*/
	public static com.vportal.portal.model.PortletFolder create(long id) {
		return getPersistence().create(id);
	}

	/**
	* Removes the portlet folder with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the portlet folder to remove
	* @return the portlet folder that was removed
	* @throws com.vportal.portal.NoSuchPortletFolderException if a portlet folder with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.vportal.portal.model.PortletFolder remove(long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portal.NoSuchPortletFolderException {
		return getPersistence().remove(id);
	}

	public static com.vportal.portal.model.PortletFolder updateImpl(
		com.vportal.portal.model.PortletFolder portletFolder, boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(portletFolder, merge);
	}

	/**
	* Finds the portlet folder with the primary key or throws a {@link com.vportal.portal.NoSuchPortletFolderException} if it could not be found.
	*
	* @param id the primary key of the portlet folder to find
	* @return the portlet folder
	* @throws com.vportal.portal.NoSuchPortletFolderException if a portlet folder with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.vportal.portal.model.PortletFolder findByPrimaryKey(
		long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portal.NoSuchPortletFolderException {
		return getPersistence().findByPrimaryKey(id);
	}

	/**
	* Finds the portlet folder with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the portlet folder to find
	* @return the portlet folder, or <code>null</code> if a portlet folder with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.vportal.portal.model.PortletFolder fetchByPrimaryKey(
		long id) throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(id);
	}

	/**
	* Finds all the portlet folders where portletId = &#63;.
	*
	* @param portletId the portlet id to search with
	* @return the matching portlet folders
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.vportal.portal.model.PortletFolder> findByPortletId(
		java.lang.String portletId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByPortletId(portletId);
	}

	/**
	* Finds a range of all the portlet folders where portletId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param portletId the portlet id to search with
	* @param start the lower bound of the range of portlet folders to return
	* @param end the upper bound of the range of portlet folders to return (not inclusive)
	* @return the range of matching portlet folders
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.vportal.portal.model.PortletFolder> findByPortletId(
		java.lang.String portletId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByPortletId(portletId, start, end);
	}

	/**
	* Finds an ordered range of all the portlet folders where portletId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param portletId the portlet id to search with
	* @param start the lower bound of the range of portlet folders to return
	* @param end the upper bound of the range of portlet folders to return (not inclusive)
	* @param orderByComparator the comparator to order the results by
	* @return the ordered range of matching portlet folders
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.vportal.portal.model.PortletFolder> findByPortletId(
		java.lang.String portletId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByPortletId(portletId, start, end, orderByComparator);
	}

	/**
	* Finds the first portlet folder in the ordered set where portletId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param portletId the portlet id to search with
	* @param orderByComparator the comparator to order the set by
	* @return the first matching portlet folder
	* @throws com.vportal.portal.NoSuchPortletFolderException if a matching portlet folder could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.vportal.portal.model.PortletFolder findByPortletId_First(
		java.lang.String portletId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portal.NoSuchPortletFolderException {
		return getPersistence()
				   .findByPortletId_First(portletId, orderByComparator);
	}

	/**
	* Finds the last portlet folder in the ordered set where portletId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param portletId the portlet id to search with
	* @param orderByComparator the comparator to order the set by
	* @return the last matching portlet folder
	* @throws com.vportal.portal.NoSuchPortletFolderException if a matching portlet folder could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.vportal.portal.model.PortletFolder findByPortletId_Last(
		java.lang.String portletId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portal.NoSuchPortletFolderException {
		return getPersistence()
				   .findByPortletId_Last(portletId, orderByComparator);
	}

	/**
	* Finds the portlet folders before and after the current portlet folder in the ordered set where portletId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param id the primary key of the current portlet folder
	* @param portletId the portlet id to search with
	* @param orderByComparator the comparator to order the set by
	* @return the previous, current, and next portlet folder
	* @throws com.vportal.portal.NoSuchPortletFolderException if a portlet folder with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.vportal.portal.model.PortletFolder[] findByPortletId_PrevAndNext(
		long id, java.lang.String portletId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portal.NoSuchPortletFolderException {
		return getPersistence()
				   .findByPortletId_PrevAndNext(id, portletId, orderByComparator);
	}

	/**
	* Finds all the portlet folders where folderId = &#63;.
	*
	* @param folderId the folder id to search with
	* @return the matching portlet folders
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.vportal.portal.model.PortletFolder> findByFolderId(
		long folderId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByFolderId(folderId);
	}

	/**
	* Finds a range of all the portlet folders where folderId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param folderId the folder id to search with
	* @param start the lower bound of the range of portlet folders to return
	* @param end the upper bound of the range of portlet folders to return (not inclusive)
	* @return the range of matching portlet folders
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.vportal.portal.model.PortletFolder> findByFolderId(
		long folderId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByFolderId(folderId, start, end);
	}

	/**
	* Finds an ordered range of all the portlet folders where folderId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param folderId the folder id to search with
	* @param start the lower bound of the range of portlet folders to return
	* @param end the upper bound of the range of portlet folders to return (not inclusive)
	* @param orderByComparator the comparator to order the results by
	* @return the ordered range of matching portlet folders
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.vportal.portal.model.PortletFolder> findByFolderId(
		long folderId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByFolderId(folderId, start, end, orderByComparator);
	}

	/**
	* Finds the first portlet folder in the ordered set where folderId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param folderId the folder id to search with
	* @param orderByComparator the comparator to order the set by
	* @return the first matching portlet folder
	* @throws com.vportal.portal.NoSuchPortletFolderException if a matching portlet folder could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.vportal.portal.model.PortletFolder findByFolderId_First(
		long folderId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portal.NoSuchPortletFolderException {
		return getPersistence().findByFolderId_First(folderId, orderByComparator);
	}

	/**
	* Finds the last portlet folder in the ordered set where folderId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param folderId the folder id to search with
	* @param orderByComparator the comparator to order the set by
	* @return the last matching portlet folder
	* @throws com.vportal.portal.NoSuchPortletFolderException if a matching portlet folder could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.vportal.portal.model.PortletFolder findByFolderId_Last(
		long folderId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portal.NoSuchPortletFolderException {
		return getPersistence().findByFolderId_Last(folderId, orderByComparator);
	}

	/**
	* Finds the portlet folders before and after the current portlet folder in the ordered set where folderId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param id the primary key of the current portlet folder
	* @param folderId the folder id to search with
	* @param orderByComparator the comparator to order the set by
	* @return the previous, current, and next portlet folder
	* @throws com.vportal.portal.NoSuchPortletFolderException if a portlet folder with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.vportal.portal.model.PortletFolder[] findByFolderId_PrevAndNext(
		long id, long folderId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portal.NoSuchPortletFolderException {
		return getPersistence()
				   .findByFolderId_PrevAndNext(id, folderId, orderByComparator);
	}

	/**
	* Finds the portlet folder where portletId = &#63; and folderId = &#63; or throws a {@link com.vportal.portal.NoSuchPortletFolderException} if it could not be found.
	*
	* @param portletId the portlet id to search with
	* @param folderId the folder id to search with
	* @return the matching portlet folder
	* @throws com.vportal.portal.NoSuchPortletFolderException if a matching portlet folder could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.vportal.portal.model.PortletFolder findByP_F(
		java.lang.String portletId, long folderId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portal.NoSuchPortletFolderException {
		return getPersistence().findByP_F(portletId, folderId);
	}

	/**
	* Finds the portlet folder where portletId = &#63; and folderId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param portletId the portlet id to search with
	* @param folderId the folder id to search with
	* @return the matching portlet folder, or <code>null</code> if a matching portlet folder could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.vportal.portal.model.PortletFolder fetchByP_F(
		java.lang.String portletId, long folderId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByP_F(portletId, folderId);
	}

	/**
	* Finds the portlet folder where portletId = &#63; and folderId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param portletId the portlet id to search with
	* @param folderId the folder id to search with
	* @return the matching portlet folder, or <code>null</code> if a matching portlet folder could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.vportal.portal.model.PortletFolder fetchByP_F(
		java.lang.String portletId, long folderId, boolean retrieveFromCache)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByP_F(portletId, folderId, retrieveFromCache);
	}

	/**
	* Finds all the portlet folders.
	*
	* @return the portlet folders
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.vportal.portal.model.PortletFolder> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
	}

	/**
	* Finds a range of all the portlet folders.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of portlet folders to return
	* @param end the upper bound of the range of portlet folders to return (not inclusive)
	* @return the range of portlet folders
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.vportal.portal.model.PortletFolder> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

	/**
	* Finds an ordered range of all the portlet folders.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of portlet folders to return
	* @param end the upper bound of the range of portlet folders to return (not inclusive)
	* @param orderByComparator the comparator to order the results by
	* @return the ordered range of portlet folders
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.vportal.portal.model.PortletFolder> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the portlet folders where portletId = &#63; from the database.
	*
	* @param portletId the portlet id to search with
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByPortletId(java.lang.String portletId)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByPortletId(portletId);
	}

	/**
	* Removes all the portlet folders where folderId = &#63; from the database.
	*
	* @param folderId the folder id to search with
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByFolderId(long folderId)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByFolderId(folderId);
	}

	/**
	* Removes the portlet folder where portletId = &#63; and folderId = &#63; from the database.
	*
	* @param portletId the portlet id to search with
	* @param folderId the folder id to search with
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByP_F(java.lang.String portletId, long folderId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portal.NoSuchPortletFolderException {
		getPersistence().removeByP_F(portletId, folderId);
	}

	/**
	* Removes all the portlet folders from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Counts all the portlet folders where portletId = &#63;.
	*
	* @param portletId the portlet id to search with
	* @return the number of matching portlet folders
	* @throws SystemException if a system exception occurred
	*/
	public static int countByPortletId(java.lang.String portletId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByPortletId(portletId);
	}

	/**
	* Counts all the portlet folders where folderId = &#63;.
	*
	* @param folderId the folder id to search with
	* @return the number of matching portlet folders
	* @throws SystemException if a system exception occurred
	*/
	public static int countByFolderId(long folderId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByFolderId(folderId);
	}

	/**
	* Counts all the portlet folders where portletId = &#63; and folderId = &#63;.
	*
	* @param portletId the portlet id to search with
	* @param folderId the folder id to search with
	* @return the number of matching portlet folders
	* @throws SystemException if a system exception occurred
	*/
	public static int countByP_F(java.lang.String portletId, long folderId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByP_F(portletId, folderId);
	}

	/**
	* Counts all the portlet folders.
	*
	* @return the number of portlet folders
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static PortletFolderPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (PortletFolderPersistence)PortletBeanLocatorUtil.locate(com.vportal.portal.service.ClpSerializer.SERVLET_CONTEXT_NAME,
					PortletFolderPersistence.class.getName());
		}

		return _persistence;
	}

	public void setPersistence(PortletFolderPersistence persistence) {
		_persistence = persistence;
	}

	private static PortletFolderPersistence _persistence;
}