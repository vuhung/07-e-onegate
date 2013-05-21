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

package com.vportal.portlet.vlegal.service.base;

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

import com.vportal.portlet.vlegal.service.VLegalAttachedMessageService;
import com.vportal.portlet.vlegal.service.VLegalDDRelService;
import com.vportal.portlet.vlegal.service.VLegalDFRelService;
import com.vportal.portlet.vlegal.service.VLegalDSRelService;
import com.vportal.portlet.vlegal.service.VLegalDURelService;
import com.vportal.portlet.vlegal.service.VLegalDocumentService;
import com.vportal.portlet.vlegal.service.VLegalDraftDocumentService;
import com.vportal.portlet.vlegal.service.VLegalFORelService;
import com.vportal.portlet.vlegal.service.VLegalFTRelService;
import com.vportal.portlet.vlegal.service.VLegalFieldService;
import com.vportal.portlet.vlegal.service.VLegalLoggerService;
import com.vportal.portlet.vlegal.service.VLegalOrgService;
import com.vportal.portlet.vlegal.service.VLegalSignerService;
import com.vportal.portlet.vlegal.service.VLegalSuggestDocumentService;
import com.vportal.portlet.vlegal.service.VLegalTDRelService;
import com.vportal.portlet.vlegal.service.VLegalTagsService;
import com.vportal.portlet.vlegal.service.VLegalTypeService;
import com.vportal.portlet.vlegal.service.persistence.VLegalAttachedMessagePersistence;
import com.vportal.portlet.vlegal.service.persistence.VLegalDDRelPersistence;
import com.vportal.portlet.vlegal.service.persistence.VLegalDFRelPersistence;
import com.vportal.portlet.vlegal.service.persistence.VLegalDSRelPersistence;
import com.vportal.portlet.vlegal.service.persistence.VLegalDURelPersistence;
import com.vportal.portlet.vlegal.service.persistence.VLegalDocumentFinder;
import com.vportal.portlet.vlegal.service.persistence.VLegalDocumentPersistence;
import com.vportal.portlet.vlegal.service.persistence.VLegalDraftDocumentFinder;
import com.vportal.portlet.vlegal.service.persistence.VLegalDraftDocumentPersistence;
import com.vportal.portlet.vlegal.service.persistence.VLegalFORelPersistence;
import com.vportal.portlet.vlegal.service.persistence.VLegalFTRelPersistence;
import com.vportal.portlet.vlegal.service.persistence.VLegalFieldFinder;
import com.vportal.portlet.vlegal.service.persistence.VLegalFieldPersistence;
import com.vportal.portlet.vlegal.service.persistence.VLegalLoggerFinder;
import com.vportal.portlet.vlegal.service.persistence.VLegalLoggerPersistence;
import com.vportal.portlet.vlegal.service.persistence.VLegalOrgPersistence;
import com.vportal.portlet.vlegal.service.persistence.VLegalSignerPersistence;
import com.vportal.portlet.vlegal.service.persistence.VLegalSuggestDocumentPersistence;
import com.vportal.portlet.vlegal.service.persistence.VLegalTDRelPersistence;
import com.vportal.portlet.vlegal.service.persistence.VLegalTagsFinder;
import com.vportal.portlet.vlegal.service.persistence.VLegalTagsPersistence;
import com.vportal.portlet.vlegal.service.persistence.VLegalTypePersistence;

import javax.sql.DataSource;

/**
 * The base implementation of the v legal d f rel remote service.
 *
 * <p>
 * This implementation exists only as a container for the default service methods generated by ServiceBuilder. All custom service methods should be put in {@link com.vportal.portlet.vlegal.service.impl.VLegalDFRelServiceImpl}.
 * </p>
 *
 * <p>
 * Never modify or reference this class directly. Always use {@link com.vportal.portlet.vlegal.service.VLegalDFRelServiceUtil} to access the v legal d f rel remote service.
 * </p>
 *
 * @author ACB
 * @see com.vportal.portlet.vlegal.service.impl.VLegalDFRelServiceImpl
 * @see com.vportal.portlet.vlegal.service.VLegalDFRelServiceUtil
 * @generated
 */
public abstract class VLegalDFRelServiceBaseImpl extends PrincipalBean
	implements VLegalDFRelService {
	/**
	 * Gets the v legal document remote service.
	 *
	 * @return the v legal document remote service
	 */
	public VLegalDocumentService getVLegalDocumentService() {
		return vLegalDocumentService;
	}

	/**
	 * Sets the v legal document remote service.
	 *
	 * @param vLegalDocumentService the v legal document remote service
	 */
	public void setVLegalDocumentService(
		VLegalDocumentService vLegalDocumentService) {
		this.vLegalDocumentService = vLegalDocumentService;
	}

	/**
	 * Gets the v legal document persistence.
	 *
	 * @return the v legal document persistence
	 */
	public VLegalDocumentPersistence getVLegalDocumentPersistence() {
		return vLegalDocumentPersistence;
	}

	/**
	 * Sets the v legal document persistence.
	 *
	 * @param vLegalDocumentPersistence the v legal document persistence
	 */
	public void setVLegalDocumentPersistence(
		VLegalDocumentPersistence vLegalDocumentPersistence) {
		this.vLegalDocumentPersistence = vLegalDocumentPersistence;
	}

	/**
	 * Gets the v legal document finder.
	 *
	 * @return the v legal document finder
	 */
	public VLegalDocumentFinder getVLegalDocumentFinder() {
		return vLegalDocumentFinder;
	}

	/**
	 * Sets the v legal document finder.
	 *
	 * @param vLegalDocumentFinder the v legal document finder
	 */
	public void setVLegalDocumentFinder(
		VLegalDocumentFinder vLegalDocumentFinder) {
		this.vLegalDocumentFinder = vLegalDocumentFinder;
	}

	/**
	 * Gets the v legal field remote service.
	 *
	 * @return the v legal field remote service
	 */
	public VLegalFieldService getVLegalFieldService() {
		return vLegalFieldService;
	}

	/**
	 * Sets the v legal field remote service.
	 *
	 * @param vLegalFieldService the v legal field remote service
	 */
	public void setVLegalFieldService(VLegalFieldService vLegalFieldService) {
		this.vLegalFieldService = vLegalFieldService;
	}

	/**
	 * Gets the v legal field persistence.
	 *
	 * @return the v legal field persistence
	 */
	public VLegalFieldPersistence getVLegalFieldPersistence() {
		return vLegalFieldPersistence;
	}

	/**
	 * Sets the v legal field persistence.
	 *
	 * @param vLegalFieldPersistence the v legal field persistence
	 */
	public void setVLegalFieldPersistence(
		VLegalFieldPersistence vLegalFieldPersistence) {
		this.vLegalFieldPersistence = vLegalFieldPersistence;
	}

	/**
	 * Gets the v legal field finder.
	 *
	 * @return the v legal field finder
	 */
	public VLegalFieldFinder getVLegalFieldFinder() {
		return vLegalFieldFinder;
	}

	/**
	 * Sets the v legal field finder.
	 *
	 * @param vLegalFieldFinder the v legal field finder
	 */
	public void setVLegalFieldFinder(VLegalFieldFinder vLegalFieldFinder) {
		this.vLegalFieldFinder = vLegalFieldFinder;
	}

	/**
	 * Gets the v legal type remote service.
	 *
	 * @return the v legal type remote service
	 */
	public VLegalTypeService getVLegalTypeService() {
		return vLegalTypeService;
	}

	/**
	 * Sets the v legal type remote service.
	 *
	 * @param vLegalTypeService the v legal type remote service
	 */
	public void setVLegalTypeService(VLegalTypeService vLegalTypeService) {
		this.vLegalTypeService = vLegalTypeService;
	}

	/**
	 * Gets the v legal type persistence.
	 *
	 * @return the v legal type persistence
	 */
	public VLegalTypePersistence getVLegalTypePersistence() {
		return vLegalTypePersistence;
	}

	/**
	 * Sets the v legal type persistence.
	 *
	 * @param vLegalTypePersistence the v legal type persistence
	 */
	public void setVLegalTypePersistence(
		VLegalTypePersistence vLegalTypePersistence) {
		this.vLegalTypePersistence = vLegalTypePersistence;
	}

	/**
	 * Gets the v legal draft document remote service.
	 *
	 * @return the v legal draft document remote service
	 */
	public VLegalDraftDocumentService getVLegalDraftDocumentService() {
		return vLegalDraftDocumentService;
	}

	/**
	 * Sets the v legal draft document remote service.
	 *
	 * @param vLegalDraftDocumentService the v legal draft document remote service
	 */
	public void setVLegalDraftDocumentService(
		VLegalDraftDocumentService vLegalDraftDocumentService) {
		this.vLegalDraftDocumentService = vLegalDraftDocumentService;
	}

	/**
	 * Gets the v legal draft document persistence.
	 *
	 * @return the v legal draft document persistence
	 */
	public VLegalDraftDocumentPersistence getVLegalDraftDocumentPersistence() {
		return vLegalDraftDocumentPersistence;
	}

	/**
	 * Sets the v legal draft document persistence.
	 *
	 * @param vLegalDraftDocumentPersistence the v legal draft document persistence
	 */
	public void setVLegalDraftDocumentPersistence(
		VLegalDraftDocumentPersistence vLegalDraftDocumentPersistence) {
		this.vLegalDraftDocumentPersistence = vLegalDraftDocumentPersistence;
	}

	/**
	 * Gets the v legal draft document finder.
	 *
	 * @return the v legal draft document finder
	 */
	public VLegalDraftDocumentFinder getVLegalDraftDocumentFinder() {
		return vLegalDraftDocumentFinder;
	}

	/**
	 * Sets the v legal draft document finder.
	 *
	 * @param vLegalDraftDocumentFinder the v legal draft document finder
	 */
	public void setVLegalDraftDocumentFinder(
		VLegalDraftDocumentFinder vLegalDraftDocumentFinder) {
		this.vLegalDraftDocumentFinder = vLegalDraftDocumentFinder;
	}

	/**
	 * Gets the v legal suggest document remote service.
	 *
	 * @return the v legal suggest document remote service
	 */
	public VLegalSuggestDocumentService getVLegalSuggestDocumentService() {
		return vLegalSuggestDocumentService;
	}

	/**
	 * Sets the v legal suggest document remote service.
	 *
	 * @param vLegalSuggestDocumentService the v legal suggest document remote service
	 */
	public void setVLegalSuggestDocumentService(
		VLegalSuggestDocumentService vLegalSuggestDocumentService) {
		this.vLegalSuggestDocumentService = vLegalSuggestDocumentService;
	}

	/**
	 * Gets the v legal suggest document persistence.
	 *
	 * @return the v legal suggest document persistence
	 */
	public VLegalSuggestDocumentPersistence getVLegalSuggestDocumentPersistence() {
		return vLegalSuggestDocumentPersistence;
	}

	/**
	 * Sets the v legal suggest document persistence.
	 *
	 * @param vLegalSuggestDocumentPersistence the v legal suggest document persistence
	 */
	public void setVLegalSuggestDocumentPersistence(
		VLegalSuggestDocumentPersistence vLegalSuggestDocumentPersistence) {
		this.vLegalSuggestDocumentPersistence = vLegalSuggestDocumentPersistence;
	}

	/**
	 * Gets the v legal attached message remote service.
	 *
	 * @return the v legal attached message remote service
	 */
	public VLegalAttachedMessageService getVLegalAttachedMessageService() {
		return vLegalAttachedMessageService;
	}

	/**
	 * Sets the v legal attached message remote service.
	 *
	 * @param vLegalAttachedMessageService the v legal attached message remote service
	 */
	public void setVLegalAttachedMessageService(
		VLegalAttachedMessageService vLegalAttachedMessageService) {
		this.vLegalAttachedMessageService = vLegalAttachedMessageService;
	}

	/**
	 * Gets the v legal attached message persistence.
	 *
	 * @return the v legal attached message persistence
	 */
	public VLegalAttachedMessagePersistence getVLegalAttachedMessagePersistence() {
		return vLegalAttachedMessagePersistence;
	}

	/**
	 * Sets the v legal attached message persistence.
	 *
	 * @param vLegalAttachedMessagePersistence the v legal attached message persistence
	 */
	public void setVLegalAttachedMessagePersistence(
		VLegalAttachedMessagePersistence vLegalAttachedMessagePersistence) {
		this.vLegalAttachedMessagePersistence = vLegalAttachedMessagePersistence;
	}

	/**
	 * Gets the v legal org remote service.
	 *
	 * @return the v legal org remote service
	 */
	public VLegalOrgService getVLegalOrgService() {
		return vLegalOrgService;
	}

	/**
	 * Sets the v legal org remote service.
	 *
	 * @param vLegalOrgService the v legal org remote service
	 */
	public void setVLegalOrgService(VLegalOrgService vLegalOrgService) {
		this.vLegalOrgService = vLegalOrgService;
	}

	/**
	 * Gets the v legal org persistence.
	 *
	 * @return the v legal org persistence
	 */
	public VLegalOrgPersistence getVLegalOrgPersistence() {
		return vLegalOrgPersistence;
	}

	/**
	 * Sets the v legal org persistence.
	 *
	 * @param vLegalOrgPersistence the v legal org persistence
	 */
	public void setVLegalOrgPersistence(
		VLegalOrgPersistence vLegalOrgPersistence) {
		this.vLegalOrgPersistence = vLegalOrgPersistence;
	}

	/**
	 * Gets the v legal signer remote service.
	 *
	 * @return the v legal signer remote service
	 */
	public VLegalSignerService getVLegalSignerService() {
		return vLegalSignerService;
	}

	/**
	 * Sets the v legal signer remote service.
	 *
	 * @param vLegalSignerService the v legal signer remote service
	 */
	public void setVLegalSignerService(VLegalSignerService vLegalSignerService) {
		this.vLegalSignerService = vLegalSignerService;
	}

	/**
	 * Gets the v legal signer persistence.
	 *
	 * @return the v legal signer persistence
	 */
	public VLegalSignerPersistence getVLegalSignerPersistence() {
		return vLegalSignerPersistence;
	}

	/**
	 * Sets the v legal signer persistence.
	 *
	 * @param vLegalSignerPersistence the v legal signer persistence
	 */
	public void setVLegalSignerPersistence(
		VLegalSignerPersistence vLegalSignerPersistence) {
		this.vLegalSignerPersistence = vLegalSignerPersistence;
	}

	/**
	 * Gets the v legal tags remote service.
	 *
	 * @return the v legal tags remote service
	 */
	public VLegalTagsService getVLegalTagsService() {
		return vLegalTagsService;
	}

	/**
	 * Sets the v legal tags remote service.
	 *
	 * @param vLegalTagsService the v legal tags remote service
	 */
	public void setVLegalTagsService(VLegalTagsService vLegalTagsService) {
		this.vLegalTagsService = vLegalTagsService;
	}

	/**
	 * Gets the v legal tags persistence.
	 *
	 * @return the v legal tags persistence
	 */
	public VLegalTagsPersistence getVLegalTagsPersistence() {
		return vLegalTagsPersistence;
	}

	/**
	 * Sets the v legal tags persistence.
	 *
	 * @param vLegalTagsPersistence the v legal tags persistence
	 */
	public void setVLegalTagsPersistence(
		VLegalTagsPersistence vLegalTagsPersistence) {
		this.vLegalTagsPersistence = vLegalTagsPersistence;
	}

	/**
	 * Gets the v legal tags finder.
	 *
	 * @return the v legal tags finder
	 */
	public VLegalTagsFinder getVLegalTagsFinder() {
		return vLegalTagsFinder;
	}

	/**
	 * Sets the v legal tags finder.
	 *
	 * @param vLegalTagsFinder the v legal tags finder
	 */
	public void setVLegalTagsFinder(VLegalTagsFinder vLegalTagsFinder) {
		this.vLegalTagsFinder = vLegalTagsFinder;
	}

	/**
	 * Gets the v legal f o rel remote service.
	 *
	 * @return the v legal f o rel remote service
	 */
	public VLegalFORelService getVLegalFORelService() {
		return vLegalFORelService;
	}

	/**
	 * Sets the v legal f o rel remote service.
	 *
	 * @param vLegalFORelService the v legal f o rel remote service
	 */
	public void setVLegalFORelService(VLegalFORelService vLegalFORelService) {
		this.vLegalFORelService = vLegalFORelService;
	}

	/**
	 * Gets the v legal f o rel persistence.
	 *
	 * @return the v legal f o rel persistence
	 */
	public VLegalFORelPersistence getVLegalFORelPersistence() {
		return vLegalFORelPersistence;
	}

	/**
	 * Sets the v legal f o rel persistence.
	 *
	 * @param vLegalFORelPersistence the v legal f o rel persistence
	 */
	public void setVLegalFORelPersistence(
		VLegalFORelPersistence vLegalFORelPersistence) {
		this.vLegalFORelPersistence = vLegalFORelPersistence;
	}

	/**
	 * Gets the v legal f t rel remote service.
	 *
	 * @return the v legal f t rel remote service
	 */
	public VLegalFTRelService getVLegalFTRelService() {
		return vLegalFTRelService;
	}

	/**
	 * Sets the v legal f t rel remote service.
	 *
	 * @param vLegalFTRelService the v legal f t rel remote service
	 */
	public void setVLegalFTRelService(VLegalFTRelService vLegalFTRelService) {
		this.vLegalFTRelService = vLegalFTRelService;
	}

	/**
	 * Gets the v legal f t rel persistence.
	 *
	 * @return the v legal f t rel persistence
	 */
	public VLegalFTRelPersistence getVLegalFTRelPersistence() {
		return vLegalFTRelPersistence;
	}

	/**
	 * Sets the v legal f t rel persistence.
	 *
	 * @param vLegalFTRelPersistence the v legal f t rel persistence
	 */
	public void setVLegalFTRelPersistence(
		VLegalFTRelPersistence vLegalFTRelPersistence) {
		this.vLegalFTRelPersistence = vLegalFTRelPersistence;
	}

	/**
	 * Gets the v legal d f rel remote service.
	 *
	 * @return the v legal d f rel remote service
	 */
	public VLegalDFRelService getVLegalDFRelService() {
		return vLegalDFRelService;
	}

	/**
	 * Sets the v legal d f rel remote service.
	 *
	 * @param vLegalDFRelService the v legal d f rel remote service
	 */
	public void setVLegalDFRelService(VLegalDFRelService vLegalDFRelService) {
		this.vLegalDFRelService = vLegalDFRelService;
	}

	/**
	 * Gets the v legal d f rel persistence.
	 *
	 * @return the v legal d f rel persistence
	 */
	public VLegalDFRelPersistence getVLegalDFRelPersistence() {
		return vLegalDFRelPersistence;
	}

	/**
	 * Sets the v legal d f rel persistence.
	 *
	 * @param vLegalDFRelPersistence the v legal d f rel persistence
	 */
	public void setVLegalDFRelPersistence(
		VLegalDFRelPersistence vLegalDFRelPersistence) {
		this.vLegalDFRelPersistence = vLegalDFRelPersistence;
	}

	/**
	 * Gets the v legal d d rel remote service.
	 *
	 * @return the v legal d d rel remote service
	 */
	public VLegalDDRelService getVLegalDDRelService() {
		return vLegalDDRelService;
	}

	/**
	 * Sets the v legal d d rel remote service.
	 *
	 * @param vLegalDDRelService the v legal d d rel remote service
	 */
	public void setVLegalDDRelService(VLegalDDRelService vLegalDDRelService) {
		this.vLegalDDRelService = vLegalDDRelService;
	}

	/**
	 * Gets the v legal d d rel persistence.
	 *
	 * @return the v legal d d rel persistence
	 */
	public VLegalDDRelPersistence getVLegalDDRelPersistence() {
		return vLegalDDRelPersistence;
	}

	/**
	 * Sets the v legal d d rel persistence.
	 *
	 * @param vLegalDDRelPersistence the v legal d d rel persistence
	 */
	public void setVLegalDDRelPersistence(
		VLegalDDRelPersistence vLegalDDRelPersistence) {
		this.vLegalDDRelPersistence = vLegalDDRelPersistence;
	}

	/**
	 * Gets the v legal d u rel remote service.
	 *
	 * @return the v legal d u rel remote service
	 */
	public VLegalDURelService getVLegalDURelService() {
		return vLegalDURelService;
	}

	/**
	 * Sets the v legal d u rel remote service.
	 *
	 * @param vLegalDURelService the v legal d u rel remote service
	 */
	public void setVLegalDURelService(VLegalDURelService vLegalDURelService) {
		this.vLegalDURelService = vLegalDURelService;
	}

	/**
	 * Gets the v legal d u rel persistence.
	 *
	 * @return the v legal d u rel persistence
	 */
	public VLegalDURelPersistence getVLegalDURelPersistence() {
		return vLegalDURelPersistence;
	}

	/**
	 * Sets the v legal d u rel persistence.
	 *
	 * @param vLegalDURelPersistence the v legal d u rel persistence
	 */
	public void setVLegalDURelPersistence(
		VLegalDURelPersistence vLegalDURelPersistence) {
		this.vLegalDURelPersistence = vLegalDURelPersistence;
	}

	/**
	 * Gets the v legal d s rel remote service.
	 *
	 * @return the v legal d s rel remote service
	 */
	public VLegalDSRelService getVLegalDSRelService() {
		return vLegalDSRelService;
	}

	/**
	 * Sets the v legal d s rel remote service.
	 *
	 * @param vLegalDSRelService the v legal d s rel remote service
	 */
	public void setVLegalDSRelService(VLegalDSRelService vLegalDSRelService) {
		this.vLegalDSRelService = vLegalDSRelService;
	}

	/**
	 * Gets the v legal d s rel persistence.
	 *
	 * @return the v legal d s rel persistence
	 */
	public VLegalDSRelPersistence getVLegalDSRelPersistence() {
		return vLegalDSRelPersistence;
	}

	/**
	 * Sets the v legal d s rel persistence.
	 *
	 * @param vLegalDSRelPersistence the v legal d s rel persistence
	 */
	public void setVLegalDSRelPersistence(
		VLegalDSRelPersistence vLegalDSRelPersistence) {
		this.vLegalDSRelPersistence = vLegalDSRelPersistence;
	}

	/**
	 * Gets the v legal t d rel remote service.
	 *
	 * @return the v legal t d rel remote service
	 */
	public VLegalTDRelService getVLegalTDRelService() {
		return vLegalTDRelService;
	}

	/**
	 * Sets the v legal t d rel remote service.
	 *
	 * @param vLegalTDRelService the v legal t d rel remote service
	 */
	public void setVLegalTDRelService(VLegalTDRelService vLegalTDRelService) {
		this.vLegalTDRelService = vLegalTDRelService;
	}

	/**
	 * Gets the v legal t d rel persistence.
	 *
	 * @return the v legal t d rel persistence
	 */
	public VLegalTDRelPersistence getVLegalTDRelPersistence() {
		return vLegalTDRelPersistence;
	}

	/**
	 * Sets the v legal t d rel persistence.
	 *
	 * @param vLegalTDRelPersistence the v legal t d rel persistence
	 */
	public void setVLegalTDRelPersistence(
		VLegalTDRelPersistence vLegalTDRelPersistence) {
		this.vLegalTDRelPersistence = vLegalTDRelPersistence;
	}

	/**
	 * Gets the v legal logger remote service.
	 *
	 * @return the v legal logger remote service
	 */
	public VLegalLoggerService getVLegalLoggerService() {
		return vLegalLoggerService;
	}

	/**
	 * Sets the v legal logger remote service.
	 *
	 * @param vLegalLoggerService the v legal logger remote service
	 */
	public void setVLegalLoggerService(VLegalLoggerService vLegalLoggerService) {
		this.vLegalLoggerService = vLegalLoggerService;
	}

	/**
	 * Gets the v legal logger persistence.
	 *
	 * @return the v legal logger persistence
	 */
	public VLegalLoggerPersistence getVLegalLoggerPersistence() {
		return vLegalLoggerPersistence;
	}

	/**
	 * Sets the v legal logger persistence.
	 *
	 * @param vLegalLoggerPersistence the v legal logger persistence
	 */
	public void setVLegalLoggerPersistence(
		VLegalLoggerPersistence vLegalLoggerPersistence) {
		this.vLegalLoggerPersistence = vLegalLoggerPersistence;
	}

	/**
	 * Gets the v legal logger finder.
	 *
	 * @return the v legal logger finder
	 */
	public VLegalLoggerFinder getVLegalLoggerFinder() {
		return vLegalLoggerFinder;
	}

	/**
	 * Sets the v legal logger finder.
	 *
	 * @param vLegalLoggerFinder the v legal logger finder
	 */
	public void setVLegalLoggerFinder(VLegalLoggerFinder vLegalLoggerFinder) {
		this.vLegalLoggerFinder = vLegalLoggerFinder;
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
			DataSource dataSource = vLegalDFRelPersistence.getDataSource();

			SqlUpdate sqlUpdate = SqlUpdateFactoryUtil.getSqlUpdate(dataSource,
					sql, new int[0]);

			sqlUpdate.update();
		}
		catch (Exception e) {
			throw new SystemException(e);
		}
	}

	@BeanReference(type = VLegalDocumentService.class)
	protected VLegalDocumentService vLegalDocumentService;
	@BeanReference(type = VLegalDocumentPersistence.class)
	protected VLegalDocumentPersistence vLegalDocumentPersistence;
	@BeanReference(type = VLegalDocumentFinder.class)
	protected VLegalDocumentFinder vLegalDocumentFinder;
	@BeanReference(type = VLegalFieldService.class)
	protected VLegalFieldService vLegalFieldService;
	@BeanReference(type = VLegalFieldPersistence.class)
	protected VLegalFieldPersistence vLegalFieldPersistence;
	@BeanReference(type = VLegalFieldFinder.class)
	protected VLegalFieldFinder vLegalFieldFinder;
	@BeanReference(type = VLegalTypeService.class)
	protected VLegalTypeService vLegalTypeService;
	@BeanReference(type = VLegalTypePersistence.class)
	protected VLegalTypePersistence vLegalTypePersistence;
	@BeanReference(type = VLegalDraftDocumentService.class)
	protected VLegalDraftDocumentService vLegalDraftDocumentService;
	@BeanReference(type = VLegalDraftDocumentPersistence.class)
	protected VLegalDraftDocumentPersistence vLegalDraftDocumentPersistence;
	@BeanReference(type = VLegalDraftDocumentFinder.class)
	protected VLegalDraftDocumentFinder vLegalDraftDocumentFinder;
	@BeanReference(type = VLegalSuggestDocumentService.class)
	protected VLegalSuggestDocumentService vLegalSuggestDocumentService;
	@BeanReference(type = VLegalSuggestDocumentPersistence.class)
	protected VLegalSuggestDocumentPersistence vLegalSuggestDocumentPersistence;
	@BeanReference(type = VLegalAttachedMessageService.class)
	protected VLegalAttachedMessageService vLegalAttachedMessageService;
	@BeanReference(type = VLegalAttachedMessagePersistence.class)
	protected VLegalAttachedMessagePersistence vLegalAttachedMessagePersistence;
	@BeanReference(type = VLegalOrgService.class)
	protected VLegalOrgService vLegalOrgService;
	@BeanReference(type = VLegalOrgPersistence.class)
	protected VLegalOrgPersistence vLegalOrgPersistence;
	@BeanReference(type = VLegalSignerService.class)
	protected VLegalSignerService vLegalSignerService;
	@BeanReference(type = VLegalSignerPersistence.class)
	protected VLegalSignerPersistence vLegalSignerPersistence;
	@BeanReference(type = VLegalTagsService.class)
	protected VLegalTagsService vLegalTagsService;
	@BeanReference(type = VLegalTagsPersistence.class)
	protected VLegalTagsPersistence vLegalTagsPersistence;
	@BeanReference(type = VLegalTagsFinder.class)
	protected VLegalTagsFinder vLegalTagsFinder;
	@BeanReference(type = VLegalFORelService.class)
	protected VLegalFORelService vLegalFORelService;
	@BeanReference(type = VLegalFORelPersistence.class)
	protected VLegalFORelPersistence vLegalFORelPersistence;
	@BeanReference(type = VLegalFTRelService.class)
	protected VLegalFTRelService vLegalFTRelService;
	@BeanReference(type = VLegalFTRelPersistence.class)
	protected VLegalFTRelPersistence vLegalFTRelPersistence;
	@BeanReference(type = VLegalDFRelService.class)
	protected VLegalDFRelService vLegalDFRelService;
	@BeanReference(type = VLegalDFRelPersistence.class)
	protected VLegalDFRelPersistence vLegalDFRelPersistence;
	@BeanReference(type = VLegalDDRelService.class)
	protected VLegalDDRelService vLegalDDRelService;
	@BeanReference(type = VLegalDDRelPersistence.class)
	protected VLegalDDRelPersistence vLegalDDRelPersistence;
	@BeanReference(type = VLegalDURelService.class)
	protected VLegalDURelService vLegalDURelService;
	@BeanReference(type = VLegalDURelPersistence.class)
	protected VLegalDURelPersistence vLegalDURelPersistence;
	@BeanReference(type = VLegalDSRelService.class)
	protected VLegalDSRelService vLegalDSRelService;
	@BeanReference(type = VLegalDSRelPersistence.class)
	protected VLegalDSRelPersistence vLegalDSRelPersistence;
	@BeanReference(type = VLegalTDRelService.class)
	protected VLegalTDRelService vLegalTDRelService;
	@BeanReference(type = VLegalTDRelPersistence.class)
	protected VLegalTDRelPersistence vLegalTDRelPersistence;
	@BeanReference(type = VLegalLoggerService.class)
	protected VLegalLoggerService vLegalLoggerService;
	@BeanReference(type = VLegalLoggerPersistence.class)
	protected VLegalLoggerPersistence vLegalLoggerPersistence;
	@BeanReference(type = VLegalLoggerFinder.class)
	protected VLegalLoggerFinder vLegalLoggerFinder;
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