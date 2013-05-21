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

package com.vportal.portlet.vcms.service;

import com.liferay.portal.kernel.annotation.Isolation;
import com.liferay.portal.kernel.annotation.Propagation;
import com.liferay.portal.kernel.annotation.Transactional;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;

/**
 * The interface for the vcms article status local service.
 *
 * <p>
 * Never modify or reference this interface directly. Always use {@link VcmsArticleStatusLocalServiceUtil} to access the vcms article status local service. Add custom service methods to {@link com.vportal.portlet.vcms.service.impl.VcmsArticleStatusLocalServiceImpl} and rerun ServiceBuilder to automatically copy the method declarations to this interface.
 * </p>
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author HOAN
 * @see VcmsArticleStatusLocalServiceUtil
 * @see com.vportal.portlet.vcms.service.base.VcmsArticleStatusLocalServiceBaseImpl
 * @see com.vportal.portlet.vcms.service.impl.VcmsArticleStatusLocalServiceImpl
 * @generated
 */
@Transactional(isolation = Isolation.PORTAL, rollbackFor =  {
	PortalException.class, SystemException.class})
public interface VcmsArticleStatusLocalService {
	/**
	* Adds the vcms article status to the database. Also notifies the appropriate model listeners.
	*
	* @param vcmsArticleStatus the vcms article status to add
	* @return the vcms article status that was added
	* @throws SystemException if a system exception occurred
	*/
	public com.vportal.portlet.vcms.model.VcmsArticleStatus addVcmsArticleStatus(
		com.vportal.portlet.vcms.model.VcmsArticleStatus vcmsArticleStatus)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Creates a new vcms article status with the primary key. Does not add the vcms article status to the database.
	*
	* @param id the primary key for the new vcms article status
	* @return the new vcms article status
	*/
	public com.vportal.portlet.vcms.model.VcmsArticleStatus createVcmsArticleStatus(
		long id);

	/**
	* Deletes the vcms article status with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the vcms article status to delete
	* @throws PortalException if a vcms article status with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public void deleteVcmsArticleStatus(long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Deletes the vcms article status from the database. Also notifies the appropriate model listeners.
	*
	* @param vcmsArticleStatus the vcms article status to delete
	* @throws SystemException if a system exception occurred
	*/
	public void deleteVcmsArticleStatus(
		com.vportal.portlet.vcms.model.VcmsArticleStatus vcmsArticleStatus)
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
	* Gets the vcms article status with the primary key.
	*
	* @param id the primary key of the vcms article status to get
	* @return the vcms article status
	* @throws PortalException if a vcms article status with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public com.vportal.portlet.vcms.model.VcmsArticleStatus getVcmsArticleStatus(
		long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Gets a range of all the vcms article statuses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of vcms article statuses to return
	* @param end the upper bound of the range of vcms article statuses to return (not inclusive)
	* @return the range of vcms article statuses
	* @throws SystemException if a system exception occurred
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public java.util.List<com.vportal.portlet.vcms.model.VcmsArticleStatus> getVcmsArticleStatuses(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Gets the number of vcms article statuses.
	*
	* @return the number of vcms article statuses
	* @throws SystemException if a system exception occurred
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public int getVcmsArticleStatusesCount()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Updates the vcms article status in the database. Also notifies the appropriate model listeners.
	*
	* @param vcmsArticleStatus the vcms article status to update
	* @return the vcms article status that was updated
	* @throws SystemException if a system exception occurred
	*/
	public com.vportal.portlet.vcms.model.VcmsArticleStatus updateVcmsArticleStatus(
		com.vportal.portlet.vcms.model.VcmsArticleStatus vcmsArticleStatus)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Updates the vcms article status in the database. Also notifies the appropriate model listeners.
	*
	* @param vcmsArticleStatus the vcms article status to update
	* @param merge whether to merge the vcms article status with the current session. See {@link com.liferay.portal.service.persistence.BatchSession#update(com.liferay.portal.kernel.dao.orm.Session, com.liferay.portal.model.BaseModel, boolean)} for an explanation.
	* @return the vcms article status that was updated
	* @throws SystemException if a system exception occurred
	*/
	public com.vportal.portlet.vcms.model.VcmsArticleStatus updateVcmsArticleStatus(
		com.vportal.portlet.vcms.model.VcmsArticleStatus vcmsArticleStatus,
		boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException;

	public com.vportal.portlet.vcms.model.VcmsArticleStatus addArticleStatus(
		long statusId, java.lang.String articleId, java.lang.String categoryId,
		java.util.Date createDate, java.lang.String createdByUser,
		boolean active, long articleVersionId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.rmi.RemoteException;

	public void deleteRelationByArticleId(java.lang.String articleId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.rmi.RemoteException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public java.util.List getRelationByArticleId(java.lang.String articleId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.rmi.RemoteException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public java.util.List getRelationByArticleId(java.lang.String articleId,
		int begin, int end)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.rmi.RemoteException;

	public int countRelationByArticleId(java.lang.String articleId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.rmi.RemoteException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public java.util.List getRelationByActive(boolean active)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.rmi.RemoteException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public java.util.List getRelationByActive(boolean active, int begin, int end)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.rmi.RemoteException;

	public int countRelationByActive(boolean active)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.rmi.RemoteException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public java.util.List getRelationByUser(java.lang.String createdByUser)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.rmi.RemoteException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public java.util.List getRelationByUser(java.lang.String createdByUser,
		int begin, int end)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.rmi.RemoteException;

	public int countRelationByUser(java.lang.String createdByUser)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.rmi.RemoteException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public java.util.List getRelationByU_C(java.lang.String createdByUser,
		boolean active)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.rmi.RemoteException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public java.util.List getRelationByU_C(java.lang.String createdByUser,
		boolean active, int begin, int end)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.rmi.RemoteException;

	public int countRelationByU_C(java.lang.String createdByUser, boolean active)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.rmi.RemoteException;
}