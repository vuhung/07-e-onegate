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

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.util.ClassLoaderProxy;

/**
 * The utility for the vcms status local service. This utility wraps {@link com.vportal.portlet.vcms.service.impl.VcmsStatusLocalServiceImpl} and is the primary access point for service operations in application layer code running on the local server.
 *
 * <p>
 * Never modify this class directly. Add custom service methods to {@link com.vportal.portlet.vcms.service.impl.VcmsStatusLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
 * </p>
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author HOAN
 * @see VcmsStatusLocalService
 * @see com.vportal.portlet.vcms.service.base.VcmsStatusLocalServiceBaseImpl
 * @see com.vportal.portlet.vcms.service.impl.VcmsStatusLocalServiceImpl
 * @generated
 */
public class VcmsStatusLocalServiceUtil {
	/**
	* Adds the vcms status to the database. Also notifies the appropriate model listeners.
	*
	* @param vcmsStatus the vcms status to add
	* @return the vcms status that was added
	* @throws SystemException if a system exception occurred
	*/
	public static com.vportal.portlet.vcms.model.VcmsStatus addVcmsStatus(
		com.vportal.portlet.vcms.model.VcmsStatus vcmsStatus)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().addVcmsStatus(vcmsStatus);
	}

	/**
	* Creates a new vcms status with the primary key. Does not add the vcms status to the database.
	*
	* @param statusId the primary key for the new vcms status
	* @return the new vcms status
	*/
	public static com.vportal.portlet.vcms.model.VcmsStatus createVcmsStatus(
		long statusId) {
		return getService().createVcmsStatus(statusId);
	}

	/**
	* Deletes the vcms status with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param statusId the primary key of the vcms status to delete
	* @throws PortalException if a vcms status with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static void deleteVcmsStatus(long statusId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		getService().deleteVcmsStatus(statusId);
	}

	/**
	* Deletes the vcms status from the database. Also notifies the appropriate model listeners.
	*
	* @param vcmsStatus the vcms status to delete
	* @throws SystemException if a system exception occurred
	*/
	public static void deleteVcmsStatus(
		com.vportal.portlet.vcms.model.VcmsStatus vcmsStatus)
		throws com.liferay.portal.kernel.exception.SystemException {
		getService().deleteVcmsStatus(vcmsStatus);
	}

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query to search with
	* @return the matching rows
	* @throws SystemException if a system exception occurred
	*/
	@SuppressWarnings("rawtypes")
	public static java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().dynamicQuery(dynamicQuery);
	}

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
	public static java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException {
		return getService().dynamicQuery(dynamicQuery, start, end);
	}

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
	public static java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .dynamicQuery(dynamicQuery, start, end, orderByComparator);
	}

	/**
	* Counts the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query to search with
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	public static long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().dynamicQueryCount(dynamicQuery);
	}

	/**
	* Gets the vcms status with the primary key.
	*
	* @param statusId the primary key of the vcms status to get
	* @return the vcms status
	* @throws PortalException if a vcms status with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.vportal.portlet.vcms.model.VcmsStatus getVcmsStatus(
		long statusId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getVcmsStatus(statusId);
	}

	/**
	* Gets a range of all the vcms statuses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of vcms statuses to return
	* @param end the upper bound of the range of vcms statuses to return (not inclusive)
	* @return the range of vcms statuses
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.vportal.portlet.vcms.model.VcmsStatus> getVcmsStatuses(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getVcmsStatuses(start, end);
	}

	/**
	* Gets the number of vcms statuses.
	*
	* @return the number of vcms statuses
	* @throws SystemException if a system exception occurred
	*/
	public static int getVcmsStatusesCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getVcmsStatusesCount();
	}

	/**
	* Updates the vcms status in the database. Also notifies the appropriate model listeners.
	*
	* @param vcmsStatus the vcms status to update
	* @return the vcms status that was updated
	* @throws SystemException if a system exception occurred
	*/
	public static com.vportal.portlet.vcms.model.VcmsStatus updateVcmsStatus(
		com.vportal.portlet.vcms.model.VcmsStatus vcmsStatus)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().updateVcmsStatus(vcmsStatus);
	}

	/**
	* Updates the vcms status in the database. Also notifies the appropriate model listeners.
	*
	* @param vcmsStatus the vcms status to update
	* @param merge whether to merge the vcms status with the current session. See {@link com.liferay.portal.service.persistence.BatchSession#update(com.liferay.portal.kernel.dao.orm.Session, com.liferay.portal.model.BaseModel, boolean)} for an explanation.
	* @return the vcms status that was updated
	* @throws SystemException if a system exception occurred
	*/
	public static com.vportal.portlet.vcms.model.VcmsStatus updateVcmsStatus(
		com.vportal.portlet.vcms.model.VcmsStatus vcmsStatus, boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().updateVcmsStatus(vcmsStatus, merge);
	}

	public static com.vportal.portlet.vcms.model.VcmsStatus addStatus(
		long companyId, long groupId, long userId, java.lang.String name,
		java.lang.String description, java.lang.String cssClass,
		java.lang.String textColor, int position, boolean isPrimary,
		boolean active, java.lang.Boolean addCommunityPermissions,
		java.lang.Boolean addGuestPermissions,
		java.lang.String[] communityPermissions,
		java.lang.String[] guestPermissions)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.rmi.RemoteException {
		return getService()
				   .addStatus(companyId, groupId, userId, name, description,
			cssClass, textColor, position, isPrimary, active,
			addCommunityPermissions, addGuestPermissions, communityPermissions,
			guestPermissions);
	}

	public static com.vportal.portlet.vcms.model.VcmsStatus updateStatus(
		long statusId, long companyId, long groupId, long userId,
		java.lang.String name, java.lang.String description,
		java.lang.String cssClass, java.lang.String textColor, int position,
		boolean isPrimary, boolean active,
		java.lang.Boolean addCommunityPermissions,
		java.lang.Boolean addGuestPermissions,
		java.lang.String[] communityPermissions,
		java.lang.String[] guestPermissions)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.rmi.RemoteException {
		return getService()
				   .updateStatus(statusId, companyId, groupId, userId, name,
			description, cssClass, textColor, position, isPrimary, active,
			addCommunityPermissions, addGuestPermissions, communityPermissions,
			guestPermissions);
	}

	public static java.util.List getStatusByPosition(int position)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.rmi.RemoteException {
		return getService().getStatusByPosition(position);
	}

	public static java.util.List getByG_P(long groupId, int position)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.rmi.RemoteException {
		return getService().getByG_P(groupId, position);
	}

	public static java.util.List getByGroupId(long groupId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.rmi.RemoteException {
		return getService().getByGroupId(groupId);
	}

	public static java.util.List getByGroupId(long groupId, int begin, int end)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.rmi.RemoteException {
		return getService().getByGroupId(groupId, begin, end);
	}

	public static int countByGroupId(long groupId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.rmi.RemoteException {
		return getService().countByGroupId(groupId);
	}

	public static com.vportal.portlet.vcms.model.VcmsStatus getByC_G_A(
		long companyId, long groupId, boolean active)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.rmi.RemoteException {
		return getService().getByC_G_A(companyId, groupId, active);
	}

	public static com.vportal.portlet.vcms.model.VcmsStatus getByA(
		boolean active)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.rmi.RemoteException {
		return getService().getByA(active);
	}

	public static void deleteStatus(long statusId, long companyId,
		long groupId, long userId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.rmi.RemoteException {
		getService().deleteStatus(statusId, companyId, groupId, userId);
	}

	public static void addResources(int statusId,
		boolean addCommunityPermissions, boolean addGuestPermissions)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		getService()
			.addResources(statusId, addCommunityPermissions, addGuestPermissions);
	}

	public static void addResources(
		com.vportal.portlet.vcms.model.VcmsStatus status,
		boolean addCommunityPermissions, boolean addGuestPermissions)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		getService()
			.addResources(status, addCommunityPermissions, addGuestPermissions);
	}

	public static void addResources(int statusId,
		java.lang.String[] communityPermissions,
		java.lang.String[] guestPermissions)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		getService()
			.addResources(statusId, communityPermissions, guestPermissions);
	}

	public static void addResources(
		com.vportal.portlet.vcms.model.VcmsStatus status,
		java.lang.String[] communityPermissions,
		java.lang.String[] guestPermissions)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		getService().addResources(status, communityPermissions, guestPermissions);
	}

	public static void clearService() {
		_service = null;
	}

	public static VcmsStatusLocalService getService() {
		if (_service == null) {
			Object obj = PortletBeanLocatorUtil.locate(ClpSerializer.SERVLET_CONTEXT_NAME,
					VcmsStatusLocalService.class.getName());
			ClassLoader portletClassLoader = (ClassLoader)PortletBeanLocatorUtil.locate(ClpSerializer.SERVLET_CONTEXT_NAME,
					"portletClassLoader");

			ClassLoaderProxy classLoaderProxy = new ClassLoaderProxy(obj,
					portletClassLoader);

			_service = new VcmsStatusLocalServiceClp(classLoaderProxy);

			ClpSerializer.setClassLoader(portletClassLoader);
		}

		return _service;
	}

	public void setService(VcmsStatusLocalService service) {
		_service = service;
	}

	private static VcmsStatusLocalService _service;
}