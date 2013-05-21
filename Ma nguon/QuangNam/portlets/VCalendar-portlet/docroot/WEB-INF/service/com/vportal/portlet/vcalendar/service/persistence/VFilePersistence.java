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

package com.vportal.portlet.vcalendar.service.persistence;

import com.liferay.portal.service.persistence.BasePersistence;

import com.vportal.portlet.vcalendar.model.VFile;

/**
 * The persistence interface for the v file service.
 *
 * <p>
 * Never modify or reference this interface directly. Always use {@link VFileUtil} to access the v file persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
 * </p>
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Admin
 * @see VFilePersistenceImpl
 * @see VFileUtil
 * @generated
 */
public interface VFilePersistence extends BasePersistence<VFile> {
	/**
	* Caches the v file in the entity cache if it is enabled.
	*
	* @param vFile the v file to cache
	*/
	public void cacheResult(com.vportal.portlet.vcalendar.model.VFile vFile);

	/**
	* Caches the v files in the entity cache if it is enabled.
	*
	* @param vFiles the v files to cache
	*/
	public void cacheResult(
		java.util.List<com.vportal.portlet.vcalendar.model.VFile> vFiles);

	/**
	* Creates a new v file with the primary key. Does not add the v file to the database.
	*
	* @param fileId the primary key for the new v file
	* @return the new v file
	*/
	public com.vportal.portlet.vcalendar.model.VFile create(long fileId);

	/**
	* Removes the v file with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param fileId the primary key of the v file to remove
	* @return the v file that was removed
	* @throws com.vportal.portlet.vcalendar.NoSuchVFileException if a v file with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.vportal.portlet.vcalendar.model.VFile remove(long fileId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vcalendar.NoSuchVFileException;

	public com.vportal.portlet.vcalendar.model.VFile updateImpl(
		com.vportal.portlet.vcalendar.model.VFile vFile, boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Finds the v file with the primary key or throws a {@link com.vportal.portlet.vcalendar.NoSuchVFileException} if it could not be found.
	*
	* @param fileId the primary key of the v file to find
	* @return the v file
	* @throws com.vportal.portlet.vcalendar.NoSuchVFileException if a v file with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.vportal.portlet.vcalendar.model.VFile findByPrimaryKey(
		long fileId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vcalendar.NoSuchVFileException;

	/**
	* Finds the v file with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param fileId the primary key of the v file to find
	* @return the v file, or <code>null</code> if a v file with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.vportal.portlet.vcalendar.model.VFile fetchByPrimaryKey(
		long fileId) throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Finds all the v files where status = &#63;.
	*
	* @param status the status to search with
	* @return the matching v files
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.vportal.portlet.vcalendar.model.VFile> findByGroupID(
		int status) throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Finds a range of all the v files where status = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param status the status to search with
	* @param start the lower bound of the range of v files to return
	* @param end the upper bound of the range of v files to return (not inclusive)
	* @return the range of matching v files
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.vportal.portlet.vcalendar.model.VFile> findByGroupID(
		int status, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Finds an ordered range of all the v files where status = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param status the status to search with
	* @param start the lower bound of the range of v files to return
	* @param end the upper bound of the range of v files to return (not inclusive)
	* @param orderByComparator the comparator to order the results by
	* @return the ordered range of matching v files
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.vportal.portlet.vcalendar.model.VFile> findByGroupID(
		int status, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Finds the first v file in the ordered set where status = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param status the status to search with
	* @param orderByComparator the comparator to order the set by
	* @return the first matching v file
	* @throws com.vportal.portlet.vcalendar.NoSuchVFileException if a matching v file could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.vportal.portlet.vcalendar.model.VFile findByGroupID_First(
		int status,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vcalendar.NoSuchVFileException;

	/**
	* Finds the last v file in the ordered set where status = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param status the status to search with
	* @param orderByComparator the comparator to order the set by
	* @return the last matching v file
	* @throws com.vportal.portlet.vcalendar.NoSuchVFileException if a matching v file could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.vportal.portlet.vcalendar.model.VFile findByGroupID_Last(
		int status,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vcalendar.NoSuchVFileException;

	/**
	* Finds the v files before and after the current v file in the ordered set where status = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param fileId the primary key of the current v file
	* @param status the status to search with
	* @param orderByComparator the comparator to order the set by
	* @return the previous, current, and next v file
	* @throws com.vportal.portlet.vcalendar.NoSuchVFileException if a v file with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.vportal.portlet.vcalendar.model.VFile[] findByGroupID_PrevAndNext(
		long fileId, int status,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portlet.vcalendar.NoSuchVFileException;

	/**
	* Finds all the v files.
	*
	* @return the v files
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.vportal.portlet.vcalendar.model.VFile> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Finds a range of all the v files.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of v files to return
	* @param end the upper bound of the range of v files to return (not inclusive)
	* @return the range of v files
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.vportal.portlet.vcalendar.model.VFile> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Finds an ordered range of all the v files.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of v files to return
	* @param end the upper bound of the range of v files to return (not inclusive)
	* @param orderByComparator the comparator to order the results by
	* @return the ordered range of v files
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.vportal.portlet.vcalendar.model.VFile> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the v files where status = &#63; from the database.
	*
	* @param status the status to search with
	* @throws SystemException if a system exception occurred
	*/
	public void removeByGroupID(int status)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the v files from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Counts all the v files where status = &#63;.
	*
	* @param status the status to search with
	* @return the number of matching v files
	* @throws SystemException if a system exception occurred
	*/
	public int countByGroupID(int status)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Counts all the v files.
	*
	* @return the number of v files
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}