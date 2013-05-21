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

package com.portlet.vdoc.service.base;

import com.liferay.counter.service.CounterLocalService;

import com.liferay.mail.service.MailService;

import com.liferay.portal.kernel.annotation.BeanReference;
import com.liferay.portal.kernel.dao.jdbc.SqlUpdate;
import com.liferay.portal.kernel.dao.jdbc.SqlUpdateFactoryUtil;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.service.CompanyLocalService;
import com.liferay.portal.service.CompanyService;
import com.liferay.portal.service.PortletPreferencesLocalService;
import com.liferay.portal.service.PortletPreferencesService;
import com.liferay.portal.service.ResourceLocalService;
import com.liferay.portal.service.ResourceService;
import com.liferay.portal.service.UserLocalService;
import com.liferay.portal.service.UserService;
import com.liferay.portal.service.base.PrincipalBean;
import com.liferay.portal.service.persistence.CompanyPersistence;
import com.liferay.portal.service.persistence.PortletPreferencesPersistence;
import com.liferay.portal.service.persistence.ResourcePersistence;
import com.liferay.portal.service.persistence.UserPersistence;

import com.portlet.vdoc.service.persistence.vdocDORelPersistence;
import com.portlet.vdoc.service.persistence.vdocDocumentFinder;
import com.portlet.vdoc.service.persistence.vdocDocumentPersistence;
import com.portlet.vdoc.service.persistence.vdocFieldPersistence;
import com.portlet.vdoc.service.persistence.vdocLoggerPersistence;
import com.portlet.vdoc.service.persistence.vdocOrgPersistence;
import com.portlet.vdoc.service.vdocDORelLocalService;
import com.portlet.vdoc.service.vdocDORelService;
import com.portlet.vdoc.service.vdocDocumentLocalService;
import com.portlet.vdoc.service.vdocDocumentService;
import com.portlet.vdoc.service.vdocFieldLocalService;
import com.portlet.vdoc.service.vdocFieldService;
import com.portlet.vdoc.service.vdocLoggerLocalService;
import com.portlet.vdoc.service.vdocLoggerService;
import com.portlet.vdoc.service.vdocOrgLocalService;
import com.portlet.vdoc.service.vdocOrgService;

import javax.sql.DataSource;

/**
 * The base implementation of the vdoc document remote service.
 *
 * <p>
 * This implementation exists only as a container for the default service methods generated by ServiceBuilder. All custom service methods should be put in {@link com.portlet.vdoc.service.impl.vdocDocumentServiceImpl}.
 * </p>
 *
 * <p>
 * Never modify or reference this class directly. Always use {@link com.portlet.vdoc.service.vdocDocumentServiceUtil} to access the vdoc document remote service.
 * </p>
 *
 * @author vinhnt
 * @see com.portlet.vdoc.service.impl.vdocDocumentServiceImpl
 * @see com.portlet.vdoc.service.vdocDocumentServiceUtil
 * @generated
 */
public abstract class vdocDocumentServiceBaseImpl extends PrincipalBean
	implements vdocDocumentService {
	/**
	 * Gets the vdoc document local service.
	 *
	 * @return the vdoc document local service
	 */
	public vdocDocumentLocalService getvdocDocumentLocalService() {
		return vdocDocumentLocalService;
	}

	/**
	 * Sets the vdoc document local service.
	 *
	 * @param vdocDocumentLocalService the vdoc document local service
	 */
	public void setvdocDocumentLocalService(
		vdocDocumentLocalService vdocDocumentLocalService) {
		this.vdocDocumentLocalService = vdocDocumentLocalService;
	}

	/**
	 * Gets the vdoc document remote service.
	 *
	 * @return the vdoc document remote service
	 */
	public vdocDocumentService getvdocDocumentService() {
		return vdocDocumentService;
	}

	/**
	 * Sets the vdoc document remote service.
	 *
	 * @param vdocDocumentService the vdoc document remote service
	 */
	public void setvdocDocumentService(vdocDocumentService vdocDocumentService) {
		this.vdocDocumentService = vdocDocumentService;
	}

	/**
	 * Gets the vdoc document persistence.
	 *
	 * @return the vdoc document persistence
	 */
	public vdocDocumentPersistence getvdocDocumentPersistence() {
		return vdocDocumentPersistence;
	}

	/**
	 * Sets the vdoc document persistence.
	 *
	 * @param vdocDocumentPersistence the vdoc document persistence
	 */
	public void setvdocDocumentPersistence(
		vdocDocumentPersistence vdocDocumentPersistence) {
		this.vdocDocumentPersistence = vdocDocumentPersistence;
	}

	/**
	 * Gets the vdoc document finder.
	 *
	 * @return the vdoc document finder
	 */
	public vdocDocumentFinder getvdocDocumentFinder() {
		return vdocDocumentFinder;
	}

	/**
	 * Sets the vdoc document finder.
	 *
	 * @param vdocDocumentFinder the vdoc document finder
	 */
	public void setvdocDocumentFinder(vdocDocumentFinder vdocDocumentFinder) {
		this.vdocDocumentFinder = vdocDocumentFinder;
	}

	/**
	 * Gets the vdoc field local service.
	 *
	 * @return the vdoc field local service
	 */
	public vdocFieldLocalService getvdocFieldLocalService() {
		return vdocFieldLocalService;
	}

	/**
	 * Sets the vdoc field local service.
	 *
	 * @param vdocFieldLocalService the vdoc field local service
	 */
	public void setvdocFieldLocalService(
		vdocFieldLocalService vdocFieldLocalService) {
		this.vdocFieldLocalService = vdocFieldLocalService;
	}

	/**
	 * Gets the vdoc field remote service.
	 *
	 * @return the vdoc field remote service
	 */
	public vdocFieldService getvdocFieldService() {
		return vdocFieldService;
	}

	/**
	 * Sets the vdoc field remote service.
	 *
	 * @param vdocFieldService the vdoc field remote service
	 */
	public void setvdocFieldService(vdocFieldService vdocFieldService) {
		this.vdocFieldService = vdocFieldService;
	}

	/**
	 * Gets the vdoc field persistence.
	 *
	 * @return the vdoc field persistence
	 */
	public vdocFieldPersistence getvdocFieldPersistence() {
		return vdocFieldPersistence;
	}

	/**
	 * Sets the vdoc field persistence.
	 *
	 * @param vdocFieldPersistence the vdoc field persistence
	 */
	public void setvdocFieldPersistence(
		vdocFieldPersistence vdocFieldPersistence) {
		this.vdocFieldPersistence = vdocFieldPersistence;
	}

	/**
	 * Gets the vdoc org local service.
	 *
	 * @return the vdoc org local service
	 */
	public vdocOrgLocalService getvdocOrgLocalService() {
		return vdocOrgLocalService;
	}

	/**
	 * Sets the vdoc org local service.
	 *
	 * @param vdocOrgLocalService the vdoc org local service
	 */
	public void setvdocOrgLocalService(vdocOrgLocalService vdocOrgLocalService) {
		this.vdocOrgLocalService = vdocOrgLocalService;
	}

	/**
	 * Gets the vdoc org remote service.
	 *
	 * @return the vdoc org remote service
	 */
	public vdocOrgService getvdocOrgService() {
		return vdocOrgService;
	}

	/**
	 * Sets the vdoc org remote service.
	 *
	 * @param vdocOrgService the vdoc org remote service
	 */
	public void setvdocOrgService(vdocOrgService vdocOrgService) {
		this.vdocOrgService = vdocOrgService;
	}

	/**
	 * Gets the vdoc org persistence.
	 *
	 * @return the vdoc org persistence
	 */
	public vdocOrgPersistence getvdocOrgPersistence() {
		return vdocOrgPersistence;
	}

	/**
	 * Sets the vdoc org persistence.
	 *
	 * @param vdocOrgPersistence the vdoc org persistence
	 */
	public void setvdocOrgPersistence(vdocOrgPersistence vdocOrgPersistence) {
		this.vdocOrgPersistence = vdocOrgPersistence;
	}

	/**
	 * Gets the vdoc d o rel local service.
	 *
	 * @return the vdoc d o rel local service
	 */
	public vdocDORelLocalService getvdocDORelLocalService() {
		return vdocDORelLocalService;
	}

	/**
	 * Sets the vdoc d o rel local service.
	 *
	 * @param vdocDORelLocalService the vdoc d o rel local service
	 */
	public void setvdocDORelLocalService(
		vdocDORelLocalService vdocDORelLocalService) {
		this.vdocDORelLocalService = vdocDORelLocalService;
	}

	/**
	 * Gets the vdoc d o rel remote service.
	 *
	 * @return the vdoc d o rel remote service
	 */
	public vdocDORelService getvdocDORelService() {
		return vdocDORelService;
	}

	/**
	 * Sets the vdoc d o rel remote service.
	 *
	 * @param vdocDORelService the vdoc d o rel remote service
	 */
	public void setvdocDORelService(vdocDORelService vdocDORelService) {
		this.vdocDORelService = vdocDORelService;
	}

	/**
	 * Gets the vdoc d o rel persistence.
	 *
	 * @return the vdoc d o rel persistence
	 */
	public vdocDORelPersistence getvdocDORelPersistence() {
		return vdocDORelPersistence;
	}

	/**
	 * Sets the vdoc d o rel persistence.
	 *
	 * @param vdocDORelPersistence the vdoc d o rel persistence
	 */
	public void setvdocDORelPersistence(
		vdocDORelPersistence vdocDORelPersistence) {
		this.vdocDORelPersistence = vdocDORelPersistence;
	}

	/**
	 * Gets the vdoc logger local service.
	 *
	 * @return the vdoc logger local service
	 */
	public vdocLoggerLocalService getvdocLoggerLocalService() {
		return vdocLoggerLocalService;
	}

	/**
	 * Sets the vdoc logger local service.
	 *
	 * @param vdocLoggerLocalService the vdoc logger local service
	 */
	public void setvdocLoggerLocalService(
		vdocLoggerLocalService vdocLoggerLocalService) {
		this.vdocLoggerLocalService = vdocLoggerLocalService;
	}

	/**
	 * Gets the vdoc logger remote service.
	 *
	 * @return the vdoc logger remote service
	 */
	public vdocLoggerService getvdocLoggerService() {
		return vdocLoggerService;
	}

	/**
	 * Sets the vdoc logger remote service.
	 *
	 * @param vdocLoggerService the vdoc logger remote service
	 */
	public void setvdocLoggerService(vdocLoggerService vdocLoggerService) {
		this.vdocLoggerService = vdocLoggerService;
	}

	/**
	 * Gets the vdoc logger persistence.
	 *
	 * @return the vdoc logger persistence
	 */
	public vdocLoggerPersistence getvdocLoggerPersistence() {
		return vdocLoggerPersistence;
	}

	/**
	 * Sets the vdoc logger persistence.
	 *
	 * @param vdocLoggerPersistence the vdoc logger persistence
	 */
	public void setvdocLoggerPersistence(
		vdocLoggerPersistence vdocLoggerPersistence) {
		this.vdocLoggerPersistence = vdocLoggerPersistence;
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
	 * Gets the mail remote service.
	 *
	 * @return the mail remote service
	 */
	public MailService getMailService() {
		return mailService;
	}

	/**
	 * Sets the mail remote service.
	 *
	 * @param mailService the mail remote service
	 */
	public void setMailService(MailService mailService) {
		this.mailService = mailService;
	}

	/**
	 * Gets the company local service.
	 *
	 * @return the company local service
	 */
	public CompanyLocalService getCompanyLocalService() {
		return companyLocalService;
	}

	/**
	 * Sets the company local service.
	 *
	 * @param companyLocalService the company local service
	 */
	public void setCompanyLocalService(CompanyLocalService companyLocalService) {
		this.companyLocalService = companyLocalService;
	}

	/**
	 * Gets the company remote service.
	 *
	 * @return the company remote service
	 */
	public CompanyService getCompanyService() {
		return companyService;
	}

	/**
	 * Sets the company remote service.
	 *
	 * @param companyService the company remote service
	 */
	public void setCompanyService(CompanyService companyService) {
		this.companyService = companyService;
	}

	/**
	 * Gets the company persistence.
	 *
	 * @return the company persistence
	 */
	public CompanyPersistence getCompanyPersistence() {
		return companyPersistence;
	}

	/**
	 * Sets the company persistence.
	 *
	 * @param companyPersistence the company persistence
	 */
	public void setCompanyPersistence(CompanyPersistence companyPersistence) {
		this.companyPersistence = companyPersistence;
	}

	/**
	 * Gets the portlet preferences local service.
	 *
	 * @return the portlet preferences local service
	 */
	public PortletPreferencesLocalService getPortletPreferencesLocalService() {
		return portletPreferencesLocalService;
	}

	/**
	 * Sets the portlet preferences local service.
	 *
	 * @param portletPreferencesLocalService the portlet preferences local service
	 */
	public void setPortletPreferencesLocalService(
		PortletPreferencesLocalService portletPreferencesLocalService) {
		this.portletPreferencesLocalService = portletPreferencesLocalService;
	}

	/**
	 * Gets the portlet preferences remote service.
	 *
	 * @return the portlet preferences remote service
	 */
	public PortletPreferencesService getPortletPreferencesService() {
		return portletPreferencesService;
	}

	/**
	 * Sets the portlet preferences remote service.
	 *
	 * @param portletPreferencesService the portlet preferences remote service
	 */
	public void setPortletPreferencesService(
		PortletPreferencesService portletPreferencesService) {
		this.portletPreferencesService = portletPreferencesService;
	}

	/**
	 * Gets the portlet preferences persistence.
	 *
	 * @return the portlet preferences persistence
	 */
	public PortletPreferencesPersistence getPortletPreferencesPersistence() {
		return portletPreferencesPersistence;
	}

	/**
	 * Sets the portlet preferences persistence.
	 *
	 * @param portletPreferencesPersistence the portlet preferences persistence
	 */
	public void setPortletPreferencesPersistence(
		PortletPreferencesPersistence portletPreferencesPersistence) {
		this.portletPreferencesPersistence = portletPreferencesPersistence;
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
			DataSource dataSource = vdocDocumentPersistence.getDataSource();

			SqlUpdate sqlUpdate = SqlUpdateFactoryUtil.getSqlUpdate(dataSource,
					sql, new int[0]);

			sqlUpdate.update();
		}
		catch (Exception e) {
			throw new SystemException(e);
		}
	}

	@BeanReference(type = vdocDocumentLocalService.class)
	protected vdocDocumentLocalService vdocDocumentLocalService;
	@BeanReference(type = vdocDocumentService.class)
	protected vdocDocumentService vdocDocumentService;
	@BeanReference(type = vdocDocumentPersistence.class)
	protected vdocDocumentPersistence vdocDocumentPersistence;
	@BeanReference(type = vdocDocumentFinder.class)
	protected vdocDocumentFinder vdocDocumentFinder;
	@BeanReference(type = vdocFieldLocalService.class)
	protected vdocFieldLocalService vdocFieldLocalService;
	@BeanReference(type = vdocFieldService.class)
	protected vdocFieldService vdocFieldService;
	@BeanReference(type = vdocFieldPersistence.class)
	protected vdocFieldPersistence vdocFieldPersistence;
	@BeanReference(type = vdocOrgLocalService.class)
	protected vdocOrgLocalService vdocOrgLocalService;
	@BeanReference(type = vdocOrgService.class)
	protected vdocOrgService vdocOrgService;
	@BeanReference(type = vdocOrgPersistence.class)
	protected vdocOrgPersistence vdocOrgPersistence;
	@BeanReference(type = vdocDORelLocalService.class)
	protected vdocDORelLocalService vdocDORelLocalService;
	@BeanReference(type = vdocDORelService.class)
	protected vdocDORelService vdocDORelService;
	@BeanReference(type = vdocDORelPersistence.class)
	protected vdocDORelPersistence vdocDORelPersistence;
	@BeanReference(type = vdocLoggerLocalService.class)
	protected vdocLoggerLocalService vdocLoggerLocalService;
	@BeanReference(type = vdocLoggerService.class)
	protected vdocLoggerService vdocLoggerService;
	@BeanReference(type = vdocLoggerPersistence.class)
	protected vdocLoggerPersistence vdocLoggerPersistence;
	@BeanReference(type = CounterLocalService.class)
	protected CounterLocalService counterLocalService;
	@BeanReference(type = MailService.class)
	protected MailService mailService;
	@BeanReference(type = CompanyLocalService.class)
	protected CompanyLocalService companyLocalService;
	@BeanReference(type = CompanyService.class)
	protected CompanyService companyService;
	@BeanReference(type = CompanyPersistence.class)
	protected CompanyPersistence companyPersistence;
	@BeanReference(type = PortletPreferencesLocalService.class)
	protected PortletPreferencesLocalService portletPreferencesLocalService;
	@BeanReference(type = PortletPreferencesService.class)
	protected PortletPreferencesService portletPreferencesService;
	@BeanReference(type = PortletPreferencesPersistence.class)
	protected PortletPreferencesPersistence portletPreferencesPersistence;
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