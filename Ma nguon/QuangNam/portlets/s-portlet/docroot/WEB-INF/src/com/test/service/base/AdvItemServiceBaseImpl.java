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

package com.test.service.base;

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

import com.test.service.AdvItemService;
import com.test.service.AdvTypeService;
import com.test.service.persistence.AdvItemFinder;
import com.test.service.persistence.AdvItemPersistence;
import com.test.service.persistence.AdvTypePersistence;

import javax.sql.DataSource;

/**
 * The base implementation of the adv item remote service.
 *
 * <p>
 * This implementation exists only as a container for the default service methods generated by ServiceBuilder. All custom service methods should be put in {@link com.test.service.impl.AdvItemServiceImpl}.
 * </p>
 *
 * <p>
 * Never modify or reference this class directly. Always use {@link com.test.service.AdvItemServiceUtil} to access the adv item remote service.
 * </p>
 *
 * @author Long
 * @see com.test.service.impl.AdvItemServiceImpl
 * @see com.test.service.AdvItemServiceUtil
 * @generated
 */
public abstract class AdvItemServiceBaseImpl extends PrincipalBean
	implements AdvItemService {
	/**
	 * Gets the adv type remote service.
	 *
	 * @return the adv type remote service
	 */
	public AdvTypeService getAdvTypeService() {
		return advTypeService;
	}

	/**
	 * Sets the adv type remote service.
	 *
	 * @param advTypeService the adv type remote service
	 */
	public void setAdvTypeService(AdvTypeService advTypeService) {
		this.advTypeService = advTypeService;
	}

	/**
	 * Gets the adv type persistence.
	 *
	 * @return the adv type persistence
	 */
	public AdvTypePersistence getAdvTypePersistence() {
		return advTypePersistence;
	}

	/**
	 * Sets the adv type persistence.
	 *
	 * @param advTypePersistence the adv type persistence
	 */
	public void setAdvTypePersistence(AdvTypePersistence advTypePersistence) {
		this.advTypePersistence = advTypePersistence;
	}

	/**
	 * Gets the adv item remote service.
	 *
	 * @return the adv item remote service
	 */
	public AdvItemService getAdvItemService() {
		return advItemService;
	}

	/**
	 * Sets the adv item remote service.
	 *
	 * @param advItemService the adv item remote service
	 */
	public void setAdvItemService(AdvItemService advItemService) {
		this.advItemService = advItemService;
	}

	/**
	 * Gets the adv item persistence.
	 *
	 * @return the adv item persistence
	 */
	public AdvItemPersistence getAdvItemPersistence() {
		return advItemPersistence;
	}

	/**
	 * Sets the adv item persistence.
	 *
	 * @param advItemPersistence the adv item persistence
	 */
	public void setAdvItemPersistence(AdvItemPersistence advItemPersistence) {
		this.advItemPersistence = advItemPersistence;
	}

	/**
	 * Gets the adv item finder.
	 *
	 * @return the adv item finder
	 */
	public AdvItemFinder getAdvItemFinder() {
		return advItemFinder;
	}

	/**
	 * Sets the adv item finder.
	 *
	 * @param advItemFinder the adv item finder
	 */
	public void setAdvItemFinder(AdvItemFinder advItemFinder) {
		this.advItemFinder = advItemFinder;
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
			DataSource dataSource = advItemPersistence.getDataSource();

			SqlUpdate sqlUpdate = SqlUpdateFactoryUtil.getSqlUpdate(dataSource,
					sql, new int[0]);

			sqlUpdate.update();
		}
		catch (Exception e) {
			throw new SystemException(e);
		}
	}

	@BeanReference(type = AdvTypeService.class)
	protected AdvTypeService advTypeService;
	@BeanReference(type = AdvTypePersistence.class)
	protected AdvTypePersistence advTypePersistence;
	@BeanReference(type = AdvItemService.class)
	protected AdvItemService advItemService;
	@BeanReference(type = AdvItemPersistence.class)
	protected AdvItemPersistence advItemPersistence;
	@BeanReference(type = AdvItemFinder.class)
	protected AdvItemFinder advItemFinder;
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