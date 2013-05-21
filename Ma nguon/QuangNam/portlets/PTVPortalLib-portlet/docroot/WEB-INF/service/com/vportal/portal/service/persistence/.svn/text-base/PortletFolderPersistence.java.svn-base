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

import com.vportal.portal.model.PortletFolder;

/**
 * The persistence interface for the portlet folder service.
 *
 * <p>
 * Never modify or reference this interface directly. Always use {@link PortletFolderUtil} to access the portlet folder persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
 * </p>
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author HOAN
 * @see PortletFolderPersistenceImpl
 * @see PortletFolderUtil
 * @generated
 */
public interface PortletFolderPersistence extends BasePersistence<PortletFolder> {
	/**
	* Caches the portlet folder in the entity cache if it is enabled.
	*
	* @param portletFolder the portlet folder to cache
	*/
	public void cacheResult(
		com.vportal.portal.model.PortletFolder portletFolder);

	/**
	* Caches the portlet folders in the entity cache if it is enabled.
	*
	* @param portletFolders the portlet folders to cache
	*/
	public void cacheResult(
		java.util.List<com.vportal.portal.model.PortletFolder> portletFolders);

	/**
	* Creates a new portlet folder with the primary key. Does not add the portlet folder to the database.
	*
	* @param id the primary key for the new portlet folder
	* @return the new portlet folder
	*/
	public com.vportal.portal.model.PortletFolder create(long id);

	/**
	* Removes the portlet folder with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the portlet folder to remove
	* @return the portlet folder that was removed
	* @throws com.vportal.portal.NoSuchPortletFolderException if a portlet folder with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.vportal.portal.model.PortletFolder remove(long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portal.NoSuchPortletFolderException;

	public com.vportal.portal.model.PortletFolder updateImpl(
		com.vportal.portal.model.PortletFolder portletFolder, boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Finds the portlet folder with the primary key or throws a {@link com.vportal.portal.NoSuchPortletFolderException} if it could not be found.
	*
	* @param id the primary key of the portlet folder to find
	* @return the portlet folder
	* @throws com.vportal.portal.NoSuchPortletFolderException if a portlet folder with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.vportal.portal.model.PortletFolder findByPrimaryKey(long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portal.NoSuchPortletFolderException;

	/**
	* Finds the portlet folder with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the portlet folder to find
	* @return the portlet folder, or <code>null</code> if a portlet folder with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.vportal.portal.model.PortletFolder fetchByPrimaryKey(long id)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Finds all the portlet folders where portletId = &#63;.
	*
	* @param portletId the portlet id to search with
	* @return the matching portlet folders
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.vportal.portal.model.PortletFolder> findByPortletId(
		java.lang.String portletId)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.vportal.portal.model.PortletFolder> findByPortletId(
		java.lang.String portletId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.vportal.portal.model.PortletFolder> findByPortletId(
		java.lang.String portletId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public com.vportal.portal.model.PortletFolder findByPortletId_First(
		java.lang.String portletId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portal.NoSuchPortletFolderException;

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
	public com.vportal.portal.model.PortletFolder findByPortletId_Last(
		java.lang.String portletId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portal.NoSuchPortletFolderException;

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
	public com.vportal.portal.model.PortletFolder[] findByPortletId_PrevAndNext(
		long id, java.lang.String portletId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portal.NoSuchPortletFolderException;

	/**
	* Finds all the portlet folders where folderId = &#63;.
	*
	* @param folderId the folder id to search with
	* @return the matching portlet folders
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.vportal.portal.model.PortletFolder> findByFolderId(
		long folderId)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.vportal.portal.model.PortletFolder> findByFolderId(
		long folderId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.vportal.portal.model.PortletFolder> findByFolderId(
		long folderId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public com.vportal.portal.model.PortletFolder findByFolderId_First(
		long folderId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portal.NoSuchPortletFolderException;

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
	public com.vportal.portal.model.PortletFolder findByFolderId_Last(
		long folderId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portal.NoSuchPortletFolderException;

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
	public com.vportal.portal.model.PortletFolder[] findByFolderId_PrevAndNext(
		long id, long folderId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portal.NoSuchPortletFolderException;

	/**
	* Finds the portlet folder where portletId = &#63; and folderId = &#63; or throws a {@link com.vportal.portal.NoSuchPortletFolderException} if it could not be found.
	*
	* @param portletId the portlet id to search with
	* @param folderId the folder id to search with
	* @return the matching portlet folder
	* @throws com.vportal.portal.NoSuchPortletFolderException if a matching portlet folder could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.vportal.portal.model.PortletFolder findByP_F(
		java.lang.String portletId, long folderId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portal.NoSuchPortletFolderException;

	/**
	* Finds the portlet folder where portletId = &#63; and folderId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param portletId the portlet id to search with
	* @param folderId the folder id to search with
	* @return the matching portlet folder, or <code>null</code> if a matching portlet folder could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.vportal.portal.model.PortletFolder fetchByP_F(
		java.lang.String portletId, long folderId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Finds the portlet folder where portletId = &#63; and folderId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param portletId the portlet id to search with
	* @param folderId the folder id to search with
	* @return the matching portlet folder, or <code>null</code> if a matching portlet folder could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.vportal.portal.model.PortletFolder fetchByP_F(
		java.lang.String portletId, long folderId, boolean retrieveFromCache)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Finds all the portlet folders.
	*
	* @return the portlet folders
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.vportal.portal.model.PortletFolder> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.vportal.portal.model.PortletFolder> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.vportal.portal.model.PortletFolder> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the portlet folders where portletId = &#63; from the database.
	*
	* @param portletId the portlet id to search with
	* @throws SystemException if a system exception occurred
	*/
	public void removeByPortletId(java.lang.String portletId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the portlet folders where folderId = &#63; from the database.
	*
	* @param folderId the folder id to search with
	* @throws SystemException if a system exception occurred
	*/
	public void removeByFolderId(long folderId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes the portlet folder where portletId = &#63; and folderId = &#63; from the database.
	*
	* @param portletId the portlet id to search with
	* @param folderId the folder id to search with
	* @throws SystemException if a system exception occurred
	*/
	public void removeByP_F(java.lang.String portletId, long folderId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portal.NoSuchPortletFolderException;

	/**
	* Removes all the portlet folders from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Counts all the portlet folders where portletId = &#63;.
	*
	* @param portletId the portlet id to search with
	* @return the number of matching portlet folders
	* @throws SystemException if a system exception occurred
	*/
	public int countByPortletId(java.lang.String portletId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Counts all the portlet folders where folderId = &#63;.
	*
	* @param folderId the folder id to search with
	* @return the number of matching portlet folders
	* @throws SystemException if a system exception occurred
	*/
	public int countByFolderId(long folderId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Counts all the portlet folders where portletId = &#63; and folderId = &#63;.
	*
	* @param portletId the portlet id to search with
	* @param folderId the folder id to search with
	* @return the number of matching portlet folders
	* @throws SystemException if a system exception occurred
	*/
	public int countByP_F(java.lang.String portletId, long folderId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Counts all the portlet folders.
	*
	* @return the number of portlet folders
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}