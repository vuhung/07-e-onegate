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

package com.vportal.portlet.vfaq.service.base;

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

import com.vportal.portlet.vfaq.service.FAQAnswerLocalService;
import com.vportal.portlet.vfaq.service.FAQAnswerService;
import com.vportal.portlet.vfaq.service.FAQCategoryLocalService;
import com.vportal.portlet.vfaq.service.FAQCategoryQuestionLocalService;
import com.vportal.portlet.vfaq.service.FAQCategoryQuestionService;
import com.vportal.portlet.vfaq.service.FAQCategoryService;
import com.vportal.portlet.vfaq.service.FAQCommentLocalService;
import com.vportal.portlet.vfaq.service.FAQCommentService;
import com.vportal.portlet.vfaq.service.FAQQuestionLocalService;
import com.vportal.portlet.vfaq.service.FAQQuestionService;
import com.vportal.portlet.vfaq.service.persistence.FAQAnswerFinder;
import com.vportal.portlet.vfaq.service.persistence.FAQAnswerPersistence;
import com.vportal.portlet.vfaq.service.persistence.FAQCategoryFinder;
import com.vportal.portlet.vfaq.service.persistence.FAQCategoryPersistence;
import com.vportal.portlet.vfaq.service.persistence.FAQCategoryQuestionPersistence;
import com.vportal.portlet.vfaq.service.persistence.FAQCommentFinder;
import com.vportal.portlet.vfaq.service.persistence.FAQCommentPersistence;
import com.vportal.portlet.vfaq.service.persistence.FAQQuestionFinder;
import com.vportal.portlet.vfaq.service.persistence.FAQQuestionPersistence;

import javax.sql.DataSource;

/**
 * The base implementation of the f a q question remote service.
 *
 * <p>
 * This implementation exists only as a container for the default service methods generated by ServiceBuilder. All custom service methods should be put in {@link com.vportal.portlet.vfaq.service.impl.FAQQuestionServiceImpl}.
 * </p>
 *
 * <p>
 * Never modify or reference this class directly. Always use {@link com.vportal.portlet.vfaq.service.FAQQuestionServiceUtil} to access the f a q question remote service.
 * </p>
 *
 * @author HOAN
 * @see com.vportal.portlet.vfaq.service.impl.FAQQuestionServiceImpl
 * @see com.vportal.portlet.vfaq.service.FAQQuestionServiceUtil
 * @generated
 */
public abstract class FAQQuestionServiceBaseImpl extends PrincipalBean
	implements FAQQuestionService {
	/**
	 * Gets the f a q category local service.
	 *
	 * @return the f a q category local service
	 */
	public FAQCategoryLocalService getFAQCategoryLocalService() {
		return faqCategoryLocalService;
	}

	/**
	 * Sets the f a q category local service.
	 *
	 * @param faqCategoryLocalService the f a q category local service
	 */
	public void setFAQCategoryLocalService(
		FAQCategoryLocalService faqCategoryLocalService) {
		this.faqCategoryLocalService = faqCategoryLocalService;
	}

	/**
	 * Gets the f a q category remote service.
	 *
	 * @return the f a q category remote service
	 */
	public FAQCategoryService getFAQCategoryService() {
		return faqCategoryService;
	}

	/**
	 * Sets the f a q category remote service.
	 *
	 * @param faqCategoryService the f a q category remote service
	 */
	public void setFAQCategoryService(FAQCategoryService faqCategoryService) {
		this.faqCategoryService = faqCategoryService;
	}

	/**
	 * Gets the f a q category persistence.
	 *
	 * @return the f a q category persistence
	 */
	public FAQCategoryPersistence getFAQCategoryPersistence() {
		return faqCategoryPersistence;
	}

	/**
	 * Sets the f a q category persistence.
	 *
	 * @param faqCategoryPersistence the f a q category persistence
	 */
	public void setFAQCategoryPersistence(
		FAQCategoryPersistence faqCategoryPersistence) {
		this.faqCategoryPersistence = faqCategoryPersistence;
	}

	/**
	 * Gets the f a q category finder.
	 *
	 * @return the f a q category finder
	 */
	public FAQCategoryFinder getFAQCategoryFinder() {
		return faqCategoryFinder;
	}

	/**
	 * Sets the f a q category finder.
	 *
	 * @param faqCategoryFinder the f a q category finder
	 */
	public void setFAQCategoryFinder(FAQCategoryFinder faqCategoryFinder) {
		this.faqCategoryFinder = faqCategoryFinder;
	}

	/**
	 * Gets the f a q question local service.
	 *
	 * @return the f a q question local service
	 */
	public FAQQuestionLocalService getFAQQuestionLocalService() {
		return faqQuestionLocalService;
	}

	/**
	 * Sets the f a q question local service.
	 *
	 * @param faqQuestionLocalService the f a q question local service
	 */
	public void setFAQQuestionLocalService(
		FAQQuestionLocalService faqQuestionLocalService) {
		this.faqQuestionLocalService = faqQuestionLocalService;
	}

	/**
	 * Gets the f a q question remote service.
	 *
	 * @return the f a q question remote service
	 */
	public FAQQuestionService getFAQQuestionService() {
		return faqQuestionService;
	}

	/**
	 * Sets the f a q question remote service.
	 *
	 * @param faqQuestionService the f a q question remote service
	 */
	public void setFAQQuestionService(FAQQuestionService faqQuestionService) {
		this.faqQuestionService = faqQuestionService;
	}

	/**
	 * Gets the f a q question persistence.
	 *
	 * @return the f a q question persistence
	 */
	public FAQQuestionPersistence getFAQQuestionPersistence() {
		return faqQuestionPersistence;
	}

	/**
	 * Sets the f a q question persistence.
	 *
	 * @param faqQuestionPersistence the f a q question persistence
	 */
	public void setFAQQuestionPersistence(
		FAQQuestionPersistence faqQuestionPersistence) {
		this.faqQuestionPersistence = faqQuestionPersistence;
	}

	/**
	 * Gets the f a q question finder.
	 *
	 * @return the f a q question finder
	 */
	public FAQQuestionFinder getFAQQuestionFinder() {
		return faqQuestionFinder;
	}

	/**
	 * Sets the f a q question finder.
	 *
	 * @param faqQuestionFinder the f a q question finder
	 */
	public void setFAQQuestionFinder(FAQQuestionFinder faqQuestionFinder) {
		this.faqQuestionFinder = faqQuestionFinder;
	}

	/**
	 * Gets the f a q category question local service.
	 *
	 * @return the f a q category question local service
	 */
	public FAQCategoryQuestionLocalService getFAQCategoryQuestionLocalService() {
		return faqCategoryQuestionLocalService;
	}

	/**
	 * Sets the f a q category question local service.
	 *
	 * @param faqCategoryQuestionLocalService the f a q category question local service
	 */
	public void setFAQCategoryQuestionLocalService(
		FAQCategoryQuestionLocalService faqCategoryQuestionLocalService) {
		this.faqCategoryQuestionLocalService = faqCategoryQuestionLocalService;
	}

	/**
	 * Gets the f a q category question remote service.
	 *
	 * @return the f a q category question remote service
	 */
	public FAQCategoryQuestionService getFAQCategoryQuestionService() {
		return faqCategoryQuestionService;
	}

	/**
	 * Sets the f a q category question remote service.
	 *
	 * @param faqCategoryQuestionService the f a q category question remote service
	 */
	public void setFAQCategoryQuestionService(
		FAQCategoryQuestionService faqCategoryQuestionService) {
		this.faqCategoryQuestionService = faqCategoryQuestionService;
	}

	/**
	 * Gets the f a q category question persistence.
	 *
	 * @return the f a q category question persistence
	 */
	public FAQCategoryQuestionPersistence getFAQCategoryQuestionPersistence() {
		return faqCategoryQuestionPersistence;
	}

	/**
	 * Sets the f a q category question persistence.
	 *
	 * @param faqCategoryQuestionPersistence the f a q category question persistence
	 */
	public void setFAQCategoryQuestionPersistence(
		FAQCategoryQuestionPersistence faqCategoryQuestionPersistence) {
		this.faqCategoryQuestionPersistence = faqCategoryQuestionPersistence;
	}

	/**
	 * Gets the f a q answer local service.
	 *
	 * @return the f a q answer local service
	 */
	public FAQAnswerLocalService getFAQAnswerLocalService() {
		return faqAnswerLocalService;
	}

	/**
	 * Sets the f a q answer local service.
	 *
	 * @param faqAnswerLocalService the f a q answer local service
	 */
	public void setFAQAnswerLocalService(
		FAQAnswerLocalService faqAnswerLocalService) {
		this.faqAnswerLocalService = faqAnswerLocalService;
	}

	/**
	 * Gets the f a q answer remote service.
	 *
	 * @return the f a q answer remote service
	 */
	public FAQAnswerService getFAQAnswerService() {
		return faqAnswerService;
	}

	/**
	 * Sets the f a q answer remote service.
	 *
	 * @param faqAnswerService the f a q answer remote service
	 */
	public void setFAQAnswerService(FAQAnswerService faqAnswerService) {
		this.faqAnswerService = faqAnswerService;
	}

	/**
	 * Gets the f a q answer persistence.
	 *
	 * @return the f a q answer persistence
	 */
	public FAQAnswerPersistence getFAQAnswerPersistence() {
		return faqAnswerPersistence;
	}

	/**
	 * Sets the f a q answer persistence.
	 *
	 * @param faqAnswerPersistence the f a q answer persistence
	 */
	public void setFAQAnswerPersistence(
		FAQAnswerPersistence faqAnswerPersistence) {
		this.faqAnswerPersistence = faqAnswerPersistence;
	}

	/**
	 * Gets the f a q answer finder.
	 *
	 * @return the f a q answer finder
	 */
	public FAQAnswerFinder getFAQAnswerFinder() {
		return faqAnswerFinder;
	}

	/**
	 * Sets the f a q answer finder.
	 *
	 * @param faqAnswerFinder the f a q answer finder
	 */
	public void setFAQAnswerFinder(FAQAnswerFinder faqAnswerFinder) {
		this.faqAnswerFinder = faqAnswerFinder;
	}

	/**
	 * Gets the f a q comment local service.
	 *
	 * @return the f a q comment local service
	 */
	public FAQCommentLocalService getFAQCommentLocalService() {
		return faqCommentLocalService;
	}

	/**
	 * Sets the f a q comment local service.
	 *
	 * @param faqCommentLocalService the f a q comment local service
	 */
	public void setFAQCommentLocalService(
		FAQCommentLocalService faqCommentLocalService) {
		this.faqCommentLocalService = faqCommentLocalService;
	}

	/**
	 * Gets the f a q comment remote service.
	 *
	 * @return the f a q comment remote service
	 */
	public FAQCommentService getFAQCommentService() {
		return faqCommentService;
	}

	/**
	 * Sets the f a q comment remote service.
	 *
	 * @param faqCommentService the f a q comment remote service
	 */
	public void setFAQCommentService(FAQCommentService faqCommentService) {
		this.faqCommentService = faqCommentService;
	}

	/**
	 * Gets the f a q comment persistence.
	 *
	 * @return the f a q comment persistence
	 */
	public FAQCommentPersistence getFAQCommentPersistence() {
		return faqCommentPersistence;
	}

	/**
	 * Sets the f a q comment persistence.
	 *
	 * @param faqCommentPersistence the f a q comment persistence
	 */
	public void setFAQCommentPersistence(
		FAQCommentPersistence faqCommentPersistence) {
		this.faqCommentPersistence = faqCommentPersistence;
	}

	/**
	 * Gets the f a q comment finder.
	 *
	 * @return the f a q comment finder
	 */
	public FAQCommentFinder getFAQCommentFinder() {
		return faqCommentFinder;
	}

	/**
	 * Sets the f a q comment finder.
	 *
	 * @param faqCommentFinder the f a q comment finder
	 */
	public void setFAQCommentFinder(FAQCommentFinder faqCommentFinder) {
		this.faqCommentFinder = faqCommentFinder;
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
			DataSource dataSource = faqQuestionPersistence.getDataSource();

			SqlUpdate sqlUpdate = SqlUpdateFactoryUtil.getSqlUpdate(dataSource,
					sql, new int[0]);

			sqlUpdate.update();
		}
		catch (Exception e) {
			throw new SystemException(e);
		}
	}

	@BeanReference(type = FAQCategoryLocalService.class)
	protected FAQCategoryLocalService faqCategoryLocalService;
	@BeanReference(type = FAQCategoryService.class)
	protected FAQCategoryService faqCategoryService;
	@BeanReference(type = FAQCategoryPersistence.class)
	protected FAQCategoryPersistence faqCategoryPersistence;
	@BeanReference(type = FAQCategoryFinder.class)
	protected FAQCategoryFinder faqCategoryFinder;
	@BeanReference(type = FAQQuestionLocalService.class)
	protected FAQQuestionLocalService faqQuestionLocalService;
	@BeanReference(type = FAQQuestionService.class)
	protected FAQQuestionService faqQuestionService;
	@BeanReference(type = FAQQuestionPersistence.class)
	protected FAQQuestionPersistence faqQuestionPersistence;
	@BeanReference(type = FAQQuestionFinder.class)
	protected FAQQuestionFinder faqQuestionFinder;
	@BeanReference(type = FAQCategoryQuestionLocalService.class)
	protected FAQCategoryQuestionLocalService faqCategoryQuestionLocalService;
	@BeanReference(type = FAQCategoryQuestionService.class)
	protected FAQCategoryQuestionService faqCategoryQuestionService;
	@BeanReference(type = FAQCategoryQuestionPersistence.class)
	protected FAQCategoryQuestionPersistence faqCategoryQuestionPersistence;
	@BeanReference(type = FAQAnswerLocalService.class)
	protected FAQAnswerLocalService faqAnswerLocalService;
	@BeanReference(type = FAQAnswerService.class)
	protected FAQAnswerService faqAnswerService;
	@BeanReference(type = FAQAnswerPersistence.class)
	protected FAQAnswerPersistence faqAnswerPersistence;
	@BeanReference(type = FAQAnswerFinder.class)
	protected FAQAnswerFinder faqAnswerFinder;
	@BeanReference(type = FAQCommentLocalService.class)
	protected FAQCommentLocalService faqCommentLocalService;
	@BeanReference(type = FAQCommentService.class)
	protected FAQCommentService faqCommentService;
	@BeanReference(type = FAQCommentPersistence.class)
	protected FAQCommentPersistence faqCommentPersistence;
	@BeanReference(type = FAQCommentFinder.class)
	protected FAQCommentFinder faqCommentFinder;
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