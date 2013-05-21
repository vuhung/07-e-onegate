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

import java.io.Serializable;

import java.util.Date;

/**
 * The base model interface for the VcmsCategory service. Represents a row in the &quot;VcmsCategory&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link com.vportal.portlet.vcms.model.impl.VcmsCategoryModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link com.vportal.portlet.vcms.model.impl.VcmsCategoryImpl}.
 * </p>
 *
 * <p>
 * Never modify or reference this interface directly. All methods that expect a vcms category model instance should use the {@link VcmsCategory} interface instead.
 * </p>
 *
 * @author HOAN
 * @see VcmsCategory
 * @see com.vportal.portlet.vcms.model.impl.VcmsCategoryImpl
 * @see com.vportal.portlet.vcms.model.impl.VcmsCategoryModelImpl
 * @generated
 */
public interface VcmsCategoryModel extends BaseModel<VcmsCategory> {
	/**
	 * Gets the primary key of this vcms category.
	 *
	 * @return the primary key of this vcms category
	 */
	public String getPrimaryKey();

	/**
	 * Sets the primary key of this vcms category
	 *
	 * @param pk the primary key of this vcms category
	 */
	public void setPrimaryKey(String pk);

	/**
	 * Gets the category id of this vcms category.
	 *
	 * @return the category id of this vcms category
	 */
	@AutoEscape
	public String getCategoryId();

	/**
	 * Sets the category id of this vcms category.
	 *
	 * @param categoryId the category id of this vcms category
	 */
	public void setCategoryId(String categoryId);

	/**
	 * Gets the group id of this vcms category.
	 *
	 * @return the group id of this vcms category
	 */
	public long getGroupId();

	/**
	 * Sets the group id of this vcms category.
	 *
	 * @param groupId the group id of this vcms category
	 */
	public void setGroupId(long groupId);

	/**
	 * Gets the company id of this vcms category.
	 *
	 * @return the company id of this vcms category
	 */
	public long getCompanyId();

	/**
	 * Sets the company id of this vcms category.
	 *
	 * @param companyId the company id of this vcms category
	 */
	public void setCompanyId(long companyId);

	/**
	 * Gets the created date of this vcms category.
	 *
	 * @return the created date of this vcms category
	 */
	public Date getCreatedDate();

	/**
	 * Sets the created date of this vcms category.
	 *
	 * @param createdDate the created date of this vcms category
	 */
	public void setCreatedDate(Date createdDate);

	/**
	 * Gets the created by user of this vcms category.
	 *
	 * @return the created by user of this vcms category
	 */
	@AutoEscape
	public String getCreatedByUser();

	/**
	 * Sets the created by user of this vcms category.
	 *
	 * @param createdByUser the created by user of this vcms category
	 */
	public void setCreatedByUser(String createdByUser);

	/**
	 * Gets the modified date of this vcms category.
	 *
	 * @return the modified date of this vcms category
	 */
	public Date getModifiedDate();

	/**
	 * Sets the modified date of this vcms category.
	 *
	 * @param modifiedDate the modified date of this vcms category
	 */
	public void setModifiedDate(Date modifiedDate);

	/**
	 * Gets the modified by user of this vcms category.
	 *
	 * @return the modified by user of this vcms category
	 */
	@AutoEscape
	public String getModifiedByUser();

	/**
	 * Sets the modified by user of this vcms category.
	 *
	 * @param modifiedByUser the modified by user of this vcms category
	 */
	public void setModifiedByUser(String modifiedByUser);

	/**
	 * Gets the portion id of this vcms category.
	 *
	 * @return the portion id of this vcms category
	 */
	@AutoEscape
	public String getPortionId();

	/**
	 * Sets the portion id of this vcms category.
	 *
	 * @param portionId the portion id of this vcms category
	 */
	public void setPortionId(String portionId);

	/**
	 * Gets the parent id of this vcms category.
	 *
	 * @return the parent id of this vcms category
	 */
	@AutoEscape
	public String getParentId();

	/**
	 * Sets the parent id of this vcms category.
	 *
	 * @param parentId the parent id of this vcms category
	 */
	public void setParentId(String parentId);

	/**
	 * Gets the name of this vcms category.
	 *
	 * @return the name of this vcms category
	 */
	@AutoEscape
	public String getName();

	/**
	 * Sets the name of this vcms category.
	 *
	 * @param name the name of this vcms category
	 */
	public void setName(String name);

	/**
	 * Gets the description of this vcms category.
	 *
	 * @return the description of this vcms category
	 */
	@AutoEscape
	public String getDescription();

	/**
	 * Sets the description of this vcms category.
	 *
	 * @param description the description of this vcms category
	 */
	public void setDescription(String description);

	/**
	 * Gets the anchored of this vcms category.
	 *
	 * @return the anchored of this vcms category
	 */
	public boolean getAnchored();

	/**
	 * Determines if this vcms category is anchored.
	 *
	 * @return <code>true</code> if this vcms category is anchored; <code>false</code> otherwise
	 */
	public boolean isAnchored();

	/**
	 * Sets whether this {$entity.humanName} is anchored.
	 *
	 * @param anchored the anchored of this vcms category
	 */
	public void setAnchored(boolean anchored);

	/**
	 * Gets the href of this vcms category.
	 *
	 * @return the href of this vcms category
	 */
	@AutoEscape
	public String getHref();

	/**
	 * Sets the href of this vcms category.
	 *
	 * @param href the href of this vcms category
	 */
	public void setHref(String href);

	/**
	 * Gets the language of this vcms category.
	 *
	 * @return the language of this vcms category
	 */
	@AutoEscape
	public String getLanguage();

	/**
	 * Sets the language of this vcms category.
	 *
	 * @param language the language of this vcms category
	 */
	public void setLanguage(String language);

	/**
	 * Gets the has image of this vcms category.
	 *
	 * @return the has image of this vcms category
	 */
	public boolean getHasImage();

	/**
	 * Determines if this vcms category is has image.
	 *
	 * @return <code>true</code> if this vcms category is has image; <code>false</code> otherwise
	 */
	public boolean isHasImage();

	/**
	 * Sets whether this {$entity.humanName} is has image.
	 *
	 * @param hasImage the has image of this vcms category
	 */
	public void setHasImage(boolean hasImage);

	/**
	 * Gets the image of this vcms category.
	 *
	 * @return the image of this vcms category
	 */
	@AutoEscape
	public String getImage();

	/**
	 * Sets the image of this vcms category.
	 *
	 * @param image the image of this vcms category
	 */
	public void setImage(String image);

	/**
	 * Gets the position of this vcms category.
	 *
	 * @return the position of this vcms category
	 */
	public int getPosition();

	/**
	 * Sets the position of this vcms category.
	 *
	 * @param position the position of this vcms category
	 */
	public void setPosition(int position);

	/**
	 * Gets the user hit of this vcms category.
	 *
	 * @return the user hit of this vcms category
	 */
	public int getUserHit();

	/**
	 * Sets the user hit of this vcms category.
	 *
	 * @param userHit the user hit of this vcms category
	 */
	public void setUserHit(int userHit);

	/**
	 * Gets the rssable of this vcms category.
	 *
	 * @return the rssable of this vcms category
	 */
	public boolean getRssable();

	/**
	 * Determines if this vcms category is rssable.
	 *
	 * @return <code>true</code> if this vcms category is rssable; <code>false</code> otherwise
	 */
	public boolean isRssable();

	/**
	 * Sets whether this {$entity.humanName} is rssable.
	 *
	 * @param rssable the rssable of this vcms category
	 */
	public void setRssable(boolean rssable);

	/**
	 * Gets a copy of this vcms category as an escaped model instance by wrapping it with an {@link com.liferay.portal.kernel.bean.AutoEscapeBeanHandler}.
	 *
	 * @return the escaped model instance
	 * @see com.liferay.portal.kernel.bean.AutoEscapeBeanHandler
	 */
	public VcmsCategory toEscapedModel();

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

	public int compareTo(VcmsCategory vcmsCategory);

	public int hashCode();

	public String toString();

	public String toXmlString();
}