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

package com.vportal.portlet.vcms.model;

import com.liferay.portal.kernel.annotation.AutoEscape;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;

import com.vportal.portlet.vcms.service.persistence.VcmsCARelationPK;

import java.io.Serializable;

import java.util.Date;

/**
 * The base model interface for the VcmsCARelation service. Represents a row in the &quot;VcmsCARelation&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link com.vportal.portlet.vcms.model.impl.VcmsCARelationModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link com.vportal.portlet.vcms.model.impl.VcmsCARelationImpl}.
 * </p>
 *
 * <p>
 * Never modify or reference this interface directly. All methods that expect a vcms c a relation model instance should use the {@link VcmsCARelation} interface instead.
 * </p>
 *
 * @author HOAN
 * @see VcmsCARelation
 * @see com.vportal.portlet.vcms.model.impl.VcmsCARelationImpl
 * @see com.vportal.portlet.vcms.model.impl.VcmsCARelationModelImpl
 * @generated
 */
public interface VcmsCARelationModel extends BaseModel<VcmsCARelation> {
	/**
	 * Gets the primary key of this vcms c a relation.
	 *
	 * @return the primary key of this vcms c a relation
	 */
	public VcmsCARelationPK getPrimaryKey();

	/**
	 * Sets the primary key of this vcms c a relation
	 *
	 * @param pk the primary key of this vcms c a relation
	 */
	public void setPrimaryKey(VcmsCARelationPK pk);

	/**
	 * Gets the category id of this vcms c a relation.
	 *
	 * @return the category id of this vcms c a relation
	 */
	@AutoEscape
	public String getCategoryId();

	/**
	 * Sets the category id of this vcms c a relation.
	 *
	 * @param categoryId the category id of this vcms c a relation
	 */
	public void setCategoryId(String categoryId);

	/**
	 * Gets the article id of this vcms c a relation.
	 *
	 * @return the article id of this vcms c a relation
	 */
	@AutoEscape
	public String getArticleId();

	/**
	 * Sets the article id of this vcms c a relation.
	 *
	 * @param articleId the article id of this vcms c a relation
	 */
	public void setArticleId(String articleId);

	/**
	 * Gets the created date of this vcms c a relation.
	 *
	 * @return the created date of this vcms c a relation
	 */
	public Date getCreatedDate();

	/**
	 * Sets the created date of this vcms c a relation.
	 *
	 * @param createdDate the created date of this vcms c a relation
	 */
	public void setCreatedDate(Date createdDate);

	/**
	 * Gets the created by user of this vcms c a relation.
	 *
	 * @return the created by user of this vcms c a relation
	 */
	@AutoEscape
	public String getCreatedByUser();

	/**
	 * Sets the created by user of this vcms c a relation.
	 *
	 * @param createdByUser the created by user of this vcms c a relation
	 */
	public void setCreatedByUser(String createdByUser);

	/**
	 * Gets the status of this vcms c a relation.
	 *
	 * @return the status of this vcms c a relation
	 */
	public long getStatus();

	/**
	 * Sets the status of this vcms c a relation.
	 *
	 * @param status the status of this vcms c a relation
	 */
	public void setStatus(long status);

	/**
	 * Gets a copy of this vcms c a relation as an escaped model instance by wrapping it with an {@link com.liferay.portal.kernel.bean.AutoEscapeBeanHandler}.
	 *
	 * @return the escaped model instance
	 * @see com.liferay.portal.kernel.bean.AutoEscapeBeanHandler
	 */
	public VcmsCARelation toEscapedModel();

	public boolean isNew();

	public void setNew(boolean n);

	public boolean isCachedModel();

	public void setCachedModel(boolean cachedModel);

	public boolean isEscapedModel();

	public void setEscapedModel(boolean escapedModel);

	public Serializable getPrimaryKeyObj();

	public ExpandoBridge getExpandoBridge();

	public void setExpandoBridgeAttributes(ServiceContext serviceContext);

	public Object clone();

	public int compareTo(VcmsCARelation vcmsCARelation);

	public int hashCode();

	public String toString();

	public String toXmlString();
}