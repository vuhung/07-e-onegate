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

package com.vportal.portal.service;

import com.liferay.portal.kernel.annotation.Isolation;
import com.liferay.portal.kernel.annotation.Propagation;
import com.liferay.portal.kernel.annotation.Transactional;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;

/**
 * The interface for the portlet folder local service.
 *
 * <p>
 * Never modify or reference this interface directly. Always use {@link PortletFolderLocalServiceUtil} to access the portlet folder local service. Add custom service methods to {@link com.vportal.portal.service.impl.PortletFolderLocalServiceImpl} and rerun ServiceBuilder to automatically copy the method declarations to this interface.
 * </p>
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author HOAN
 * @see PortletFolderLocalServiceUtil
 * @see com.vportal.portal.service.base.PortletFolderLocalServiceBaseImpl
 * @see com.vportal.portal.service.impl.PortletFolderLocalServiceImpl
 * @generated
 */
@Transactional(isolation = Isolation.PORTAL, rollbackFor =  {
	PortalException.class, SystemException.class})
public interface PortletFolderLocalService {
	/**
	* Adds the portlet folder to the database. Also notifies the appropriate model listeners.
	*
	* @param portletFolder the portlet folder to add
	* @return the portlet folder that was added
	* @throws SystemException if a system exception occurred
	*/
	public com.vportal.portal.model.PortletFolder addPortletFolder(
		com.vportal.portal.model.PortletFolder portletFolder)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Creates a new portlet folder with the primary key. Does not add the portlet folder to the database.
	*
	* @param id the primary key for the new portlet folder
	* @return the new portlet folder
	*/
	public com.vportal.portal.model.PortletFolder createPortletFolder(long id);

	/**
	* Deletes the portlet folder with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the portlet folder to delete
	* @throws PortalException if a portlet folder with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public void deletePortletFolder(long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Deletes the portlet folder from the database. Also notifies the appropriate model listeners.
	*
	* @param portletFolder the portlet folder to delete
	* @throws SystemException if a system exception occurred
	*/
	public void deletePortletFolder(
		com.vportal.portal.model.PortletFolder portletFolder)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query to search with
	* @return the matching rows
	* @throws SystemException if a system exception occurred
	*/
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param dynamicQuery the dynamic query to search with
	* @param start the lower bound of the range of model instances to return
	* @param end the upper bound of the range of model instances to return (not inclusive)
	* @return the range of matching rows
	* @throws SystemException if a system exception occurred
	*/
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param dynamicQuery the dynamic query to search with
	* @param start the lower bound of the range of model instances to return
	* @param end the upper bound of the range of model instances to return (not inclusive)
	* @param orderByComparator the comparator to order the results by
	* @return the ordered range of matching rows
	* @throws SystemException if a system exception occurred
	*/
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Counts the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query to search with
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Gets the portlet folder with the primary key.
	*
	* @param id the primary key of the portlet folder to get
	* @return the portlet folder
	* @throws PortalException if a portlet folder with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public com.vportal.portal.model.PortletFolder getPortletFolder(long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Gets a range of all the portlet folders.
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
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public java.util.List<com.vportal.portal.model.PortletFolder> getPortletFolders(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Gets the number of portlet folders.
	*
	* @return the number of portlet folders
	* @throws SystemException if a system exception occurred
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public int getPortletFoldersCount()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Updates the portlet folder in the database. Also notifies the appropriate model listeners.
	*
	* @param portletFolder the portlet folder to update
	* @return the portlet folder that was updated
	* @throws SystemException if a system exception occurred
	*/
	public com.vportal.portal.model.PortletFolder updatePortletFolder(
		com.vportal.portal.model.PortletFolder portletFolder)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Updates the portlet folder in the database. Also notifies the appropriate model listeners.
	*
	* @param portletFolder the portlet folder to update
	* @param merge whether to merge the portlet folder with the current session. See {@link com.liferay.portal.service.persistence.BatchSession#update(com.liferay.portal.kernel.dao.orm.Session, com.liferay.portal.model.BaseModel, boolean)} for an explanation.
	* @return the portlet folder that was updated
	* @throws SystemException if a system exception occurred
	*/
	public com.vportal.portal.model.PortletFolder updatePortletFolder(
		com.vportal.portal.model.PortletFolder portletFolder, boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException;

	public com.vportal.portal.model.PortletFolder addPortletFolder(
		java.lang.String portletId, long folderId, java.lang.String description)
		throws com.liferay.portal.kernel.exception.SystemException;

	public void removePortletFolder(long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portal.NoSuchPortletFolderException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public java.util.List getByPortletId(java.lang.String portletId)
		throws com.liferay.portal.kernel.exception.SystemException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public java.util.List getByFolderId(long folderId)
		throws com.liferay.portal.kernel.exception.SystemException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public java.util.List getDLFolder(long groupId, java.lang.String portletId)
		throws com.liferay.portal.kernel.exception.SystemException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public com.vportal.portal.model.PortletFolder getPortletFolder(
		java.lang.String portletId, long folderId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vportal.portal.NoSuchPortletFolderException;
}