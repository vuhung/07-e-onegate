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

package com.vportal.portlet.vcalendar.service.base;

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

import com.vportal.portlet.vcalendar.service.VCalLocalService;
import com.vportal.portlet.vcalendar.service.VCalService;
import com.vportal.portlet.vcalendar.service.VFileService;
import com.vportal.portlet.vcalendar.service.persistence.VCalFinder;
import com.vportal.portlet.vcalendar.service.persistence.VCalPersistence;
import com.vportal.portlet.vcalendar.service.persistence.VFilePersistence;

import javax.sql.DataSource;

/**
 * The base implementation of the v file remote service.
 *
 * <p>
 * This implementation exists only as a container for the default service methods generated by ServiceBuilder. All custom service methods should be put in {@link com.vportal.portlet.vcalendar.service.impl.VFileServiceImpl}.
 * </p>
 *
 * <p>
 * Never modify or reference this class directly. Always use {@link com.vportal.portlet.vcalendar.service.VFileServiceUtil} to access the v file remote service.
 * </p>
 *
 * @author Admin
 * @see com.vportal.portlet.vcalendar.service.impl.VFileServiceImpl
 * @see com.vportal.portlet.vcalendar.service.VFileServiceUtil
 * @generated
 */
public abstract class VFileServiceBaseImpl extends PrincipalBean
	implements VFileService {
	/**
	 * Gets the v cal local service.
	 *
	 * @return the v cal local service
	 */
	public VCalLocalService getVCalLocalService() {
		return vCalLocalService;
	}

	/**
	 * Sets the v cal local service.
	 *
	 * @param vCalLocalService the v cal local service
	 */
	public void setVCalLocalService(VCalLocalService vCalLocalService) {
		this.vCalLocalService = vCalLocalService;
	}

	/**
	 * Gets the v cal remote service.
	 *
	 * @return the v cal remote service
	 */
	public VCalService getVCalService() {
		return vCalService;
	}

	/**
	 * Sets the v cal remote service.
	 *
	 * @param vCalService the v cal remote service
	 */
	public void setVCalService(VCalService vCalService) {
		this.vCalService = vCalService;
	}

	/**
	 * Gets the v cal persistence.
	 *
	 * @return the v cal persistence
	 */
	public VCalPersistence getVCalPersistence() {
		return vCalPersistence;
	}

	/**
	 * Sets the v cal persistence.
	 *
	 * @param vCalPersistence the v cal persistence
	 */
	public void setVCalPersistence(VCalPersistence vCalPersistence) {
		this.vCalPersistence = vCalPersistence;
	}

	/**
	 * Gets the v cal finder.
	 *
	 * @return the v cal finder
	 */
	public VCalFinder getVCalFinder() {
		return vCalFinder;
	}

	/**
	 * Sets the v cal finder.
	 *
	 * @param vCalFinder the v cal finder
	 */
	public void setVCalFinder(VCalFinder vCalFinder) {
		this.vCalFinder = vCalFinder;
	}

	/**
	 * Gets the v file remote service.
	 *
	 * @return the v file remote service
	 */
	public VFileService getVFileService() {
		return vFileService;
	}

	/**
	 * Sets the v file remote service.
	 *
	 * @param vFileService the v file remote service
	 */
	public void setVFileService(VFileService vFileService) {
		this.vFileService = vFileService;
	}

	/**
	 * Gets the v file persistence.
	 *
	 * @return the v file persistence
	 */
	public VFilePersistence getVFilePersistence() {
		return vFilePersistence;
	}

	/**
	 * Sets the v file persistence.
	 *
	 * @param vFilePersistence the v file persistence
	 */
	public void setVFilePersistence(VFilePersistence vFilePersistence) {
		this.vFilePersistence = vFilePersistence;
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
			DataSource dataSource = vFilePersistence.getDataSource();

			SqlUpdate sqlUpdate = SqlUpdateFactoryUtil.getSqlUpdate(dataSource,
					sql, new int[0]);

			sqlUpdate.update();
		}
		catch (Exception e) {
			throw new SystemException(e);
		}
	}

	@BeanReference(type = VCalLocalService.class)
	protected VCalLocalService vCalLocalService;
	@BeanReference(type = VCalService.class)
	protected VCalService vCalService;
	@BeanReference(type = VCalPersistence.class)
	protected VCalPersistence vCalPersistence;
	@BeanReference(type = VCalFinder.class)
	protected VCalFinder vCalFinder;
	@BeanReference(type = VFileService.class)
	protected VFileService vFileService;
	@BeanReference(type = VFilePersistence.class)
	protected VFilePersistence vFilePersistence;
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