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

package com.vportal.portal.service.base;

import com.liferay.counter.service.CounterLocalService;

import com.liferay.portal.kernel.annotation.BeanReference;
import com.liferay.portal.kernel.dao.jdbc.SqlUpdate;
import com.liferay.portal.kernel.dao.jdbc.SqlUpdateFactoryUtil;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.service.ResourceLocalService;
import com.liferay.portal.service.ResourceService;
import com.liferay.portal.service.UserLocalService;
import com.liferay.portal.service.UserService;
import com.liferay.portal.service.base.PrincipalBean;
import com.liferay.portal.service.persistence.ResourcePersistence;
import com.liferay.portal.service.persistence.UserPersistence;

import com.vportal.portal.service.AccessCounterService;
import com.vportal.portal.service.AttachmentLocalService;
import com.vportal.portal.service.AttachmentService;
import com.vportal.portal.service.PortletFolderLocalService;
import com.vportal.portal.service.PortletFolderService;
import com.vportal.portal.service.persistence.AccessCounterFinder;
import com.vportal.portal.service.persistence.AccessCounterPersistence;
import com.vportal.portal.service.persistence.AttachmentFinder;
import com.vportal.portal.service.persistence.AttachmentPersistence;
import com.vportal.portal.service.persistence.PortletFolderFinder;
import com.vportal.portal.service.persistence.PortletFolderPersistence;

import javax.sql.DataSource;

/**
 * The base implementation of the portlet folder remote service.
 *
 * <p>
 * This implementation exists only as a container for the default service methods generated by ServiceBuilder. All custom service methods should be put in {@link com.vportal.portal.service.impl.PortletFolderServiceImpl}.
 * </p>
 *
 * <p>
 * Never modify or reference this class directly. Always use {@link com.vportal.portal.service.PortletFolderServiceUtil} to access the portlet folder remote service.
 * </p>
 *
 * @author HOAN
 * @see com.vportal.portal.service.impl.PortletFolderServiceImpl
 * @see com.vportal.portal.service.PortletFolderServiceUtil
 * @generated
 */
public abstract class PortletFolderServiceBaseImpl extends PrincipalBean
	implements PortletFolderService {
	/**
	 * Gets the attachment local service.
	 *
	 * @return the attachment local service
	 */
	public AttachmentLocalService getAttachmentLocalService() {
		return attachmentLocalService;
	}

	/**
	 * Sets the attachment local service.
	 *
	 * @param attachmentLocalService the attachment local service
	 */
	public void setAttachmentLocalService(
		AttachmentLocalService attachmentLocalService) {
		this.attachmentLocalService = attachmentLocalService;
	}

	/**
	 * Gets the attachment remote service.
	 *
	 * @return the attachment remote service
	 */
	public AttachmentService getAttachmentService() {
		return attachmentService;
	}

	/**
	 * Sets the attachment remote service.
	 *
	 * @param attachmentService the attachment remote service
	 */
	public void setAttachmentService(AttachmentService attachmentService) {
		this.attachmentService = attachmentService;
	}

	/**
	 * Gets the attachment persistence.
	 *
	 * @return the attachment persistence
	 */
	public AttachmentPersistence getAttachmentPersistence() {
		return attachmentPersistence;
	}

	/**
	 * Sets the attachment persistence.
	 *
	 * @param attachmentPersistence the attachment persistence
	 */
	public void setAttachmentPersistence(
		AttachmentPersistence attachmentPersistence) {
		this.attachmentPersistence = attachmentPersistence;
	}

	/**
	 * Gets the attachment finder.
	 *
	 * @return the attachment finder
	 */
	public AttachmentFinder getAttachmentFinder() {
		return attachmentFinder;
	}

	/**
	 * Sets the attachment finder.
	 *
	 * @param attachmentFinder the attachment finder
	 */
	public void setAttachmentFinder(AttachmentFinder attachmentFinder) {
		this.attachmentFinder = attachmentFinder;
	}

	/**
	 * Gets the access counter remote service.
	 *
	 * @return the access counter remote service
	 */
	public AccessCounterService getAccessCounterService() {
		return accessCounterService;
	}

	/**
	 * Sets the access counter remote service.
	 *
	 * @param accessCounterService the access counter remote service
	 */
	public void setAccessCounterService(
		AccessCounterService accessCounterService) {
		this.accessCounterService = accessCounterService;
	}

	/**
	 * Gets the access counter persistence.
	 *
	 * @return the access counter persistence
	 */
	public AccessCounterPersistence getAccessCounterPersistence() {
		return accessCounterPersistence;
	}

	/**
	 * Sets the access counter persistence.
	 *
	 * @param accessCounterPersistence the access counter persistence
	 */
	public void setAccessCounterPersistence(
		AccessCounterPersistence accessCounterPersistence) {
		this.accessCounterPersistence = accessCounterPersistence;
	}

	/**
	 * Gets the access counter finder.
	 *
	 * @return the access counter finder
	 */
	public AccessCounterFinder getAccessCounterFinder() {
		return accessCounterFinder;
	}

	/**
	 * Sets the access counter finder.
	 *
	 * @param accessCounterFinder the access counter finder
	 */
	public void setAccessCounterFinder(AccessCounterFinder accessCounterFinder) {
		this.accessCounterFinder = accessCounterFinder;
	}

	/**
	 * Gets the portlet folder local service.
	 *
	 * @return the portlet folder local service
	 */
	public PortletFolderLocalService getPortletFolderLocalService() {
		return portletFolderLocalService;
	}

	/**
	 * Sets the portlet folder local service.
	 *
	 * @param portletFolderLocalService the portlet folder local service
	 */
	public void setPortletFolderLocalService(
		PortletFolderLocalService portletFolderLocalService) {
		this.portletFolderLocalService = portletFolderLocalService;
	}

	/**
	 * Gets the portlet folder remote service.
	 *
	 * @return the portlet folder remote service
	 */
	public PortletFolderService getPortletFolderService() {
		return portletFolderService;
	}

	/**
	 * Sets the portlet folder remote service.
	 *
	 * @param portletFolderService the portlet folder remote service
	 */
	public void setPortletFolderService(
		PortletFolderService portletFolderService) {
		this.portletFolderService = portletFolderService;
	}

	/**
	 * Gets the portlet folder persistence.
	 *
	 * @return the portlet folder persistence
	 */
	public PortletFolderPersistence getPortletFolderPersistence() {
		return portletFolderPersistence;
	}

	/**
	 * Sets the portlet folder persistence.
	 *
	 * @param portletFolderPersistence the portlet folder persistence
	 */
	public void setPortletFolderPersistence(
		PortletFolderPersistence portletFolderPersistence) {
		this.portletFolderPersistence = portletFolderPersistence;
	}

	/**
	 * Gets the portlet folder finder.
	 *
	 * @return the portlet folder finder
	 */
	public PortletFolderFinder getPortletFolderFinder() {
		return portletFolderFinder;
	}

	/**
	 * Sets the portlet folder finder.
	 *
	 * @param portletFolderFinder the portlet folder finder
	 */
	public void setPortletFolderFinder(PortletFolderFinder portletFolderFinder) {
		this.portletFolderFinder = portletFolderFinder;
	}

	/**
	 * Gets the counter local service.
	 *
	 * @return the counter local service
	 */
	public CounterLocalService getCounterLocalService() {
		return counterLocalService;
	}

	/**
	 * Sets the counter local service.
	 *
	 * @param counterLocalService the counter local service
	 */
	public void setCounterLocalService(CounterLocalService counterLocalService) {
		this.counterLocalService = counterLocalService;
	}

	/**
	 * Gets the resource local service.
	 *
	 * @return the resource local service
	 */
	public ResourceLocalService getResourceLocalService() {
		return resourceLocalService;
	}

	/**
	 * Sets the resource local service.
	 *
	 * @param resourceLocalService the resource local service
	 */
	public void setResourceLocalService(
		ResourceLocalService resourceLocalService) {
		this.resourceLocalService = resourceLocalService;
	}

	/**
	 * Gets the resource remote service.
	 *
	 * @return the resource remote service
	 */
	public ResourceService getResourceService() {
		return resourceService;
	}

	/**
	 * Sets the resource remote service.
	 *
	 * @param resourceService the resource remote service
	 */
	public void setResourceService(ResourceService resourceService) {
		this.resourceService = resourceService;
	}

	/**
	 * Gets the resource persistence.
	 *
	 * @return the resource persistence
	 */
	public ResourcePersistence getResourcePersistence() {
		return resourcePersistence;
	}

	/**
	 * Sets the resource persistence.
	 *
	 * @param resourcePersistence the resource persistence
	 */
	public void setResourcePersistence(ResourcePersistence resourcePersistence) {
		this.resourcePersistence = resourcePersistence;
	}

	/**
	 * Gets the user local service.
	 *
	 * @return the user local service
	 */
	public UserLocalService getUserLocalService() {
		return userLocalService;
	}

	/**
	 * Sets the user local service.
	 *
	 * @param userLocalService the user local service
	 */
	public void setUserLocalService(UserLocalService userLocalService) {
		this.userLocalService = userLocalService;
	}

	/**
	 * Gets the user remote service.
	 *
	 * @return the user remote service
	 */
	public UserService getUserService() {
		return userService;
	}

	/**
	 * Sets the user remote service.
	 *
	 * @param userService the user remote service
	 */
	public void setUserService(UserService userService) {
		this.userService = userService;
	}

	/**
	 * Gets the user persistence.
	 *
	 * @return the user persistence
	 */
	public UserPersistence getUserPersistence() {
		return userPersistence;
	}

	/**
	 * Sets the user persistence.
	 *
	 * @param userPersistence the user persistence
	 */
	public void setUserPersistence(UserPersistence userPersistence) {
		this.userPersistence = userPersistence;
	}

	/**
	 * Performs an SQL query.
	 *
	 * @param sql the sql query to perform
	 */
	protected void runSQL(String sql) throws SystemException {
		try {
			DataSource dataSource = portletFolderPersistence.getDataSource();

			SqlUpdate sqlUpdate = SqlUpdateFactoryUtil.getSqlUpdate(dataSource,
					sql, new int[0]);

			sqlUpdate.update();
		}
		catch (Exception e) {
			throw new SystemException(e);
		}
	}

	@BeanReference(type = AttachmentLocalService.class)
	protected AttachmentLocalService attachmentLocalService;
	@BeanReference(type = AttachmentService.class)
	protected AttachmentService attachmentService;
	@BeanReference(type = AttachmentPersistence.class)
	protected AttachmentPersistence attachmentPersistence;
	@BeanReference(type = AttachmentFinder.class)
	protected AttachmentFinder attachmentFinder;
	@BeanReference(type = AccessCounterService.class)
	protected AccessCounterService accessCounterService;
	@BeanReference(type = AccessCounterPersistence.class)
	protected AccessCounterPersistence accessCounterPersistence;
	@BeanReference(type = AccessCounterFinder.class)
	protected AccessCounterFinder accessCounterFinder;
	@BeanReference(type = PortletFolderLocalService.class)
	protected PortletFolderLocalService portletFolderLocalService;
	@BeanReference(type = PortletFolderService.class)
	protected PortletFolderService portletFolderService;
	@BeanReference(type = PortletFolderPersistence.class)
	protected PortletFolderPersistence portletFolderPersistence;
	@BeanReference(type = PortletFolderFinder.class)
	protected PortletFolderFinder portletFolderFinder;
	@BeanReference(type = CounterLocalService.class)
	protected CounterLocalService counterLocalService;
	@BeanReference(type = ResourceLocalService.class)
	protected ResourceLocalService resourceLocalService;
	@BeanReference(type = ResourceService.class)
	protected ResourceService resourceService;
	@BeanReference(type = ResourcePersistence.class)
	protected ResourcePersistence resourcePersistence;
	@BeanReference(type = UserLocalService.class)
	protected UserLocalService userLocalService;
	@BeanReference(type = UserService.class)
	protected UserService userService;
	@BeanReference(type = UserPersistence.class)
	protected UserPersistence userPersistence;
}