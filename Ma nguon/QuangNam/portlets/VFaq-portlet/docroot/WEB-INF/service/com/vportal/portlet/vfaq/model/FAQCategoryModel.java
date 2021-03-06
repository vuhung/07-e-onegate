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

package com.vportal.portlet.vfaq.model;

import com.liferay.portal.kernel.annotation.AutoEscape;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;

import java.io.Serializable;

import java.util.Date;

/**
 * The base model interface for the FAQCategory service. Represents a row in the &quot;vfaq_FAQCategory&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link com.vportal.portlet.vfaq.model.impl.FAQCategoryModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link com.vportal.portlet.vfaq.model.impl.FAQCategoryImpl}.
 * </p>
 *
 * <p>
 * Never modify or reference this interface directly. All methods that expect a f a q category model instance should use the {@link FAQCategory} interface instead.
 * </p>
 *
 * @author HOAN
 * @see FAQCategory
 * @see com.vportal.portlet.vfaq.model.impl.FAQCategoryImpl
 * @see com.vportal.portlet.vfaq.model.impl.FAQCategoryModelImpl
 * @generated
 */
public interface FAQCategoryModel extends BaseModel<FAQCategory> {
	/**
	 * Gets the primary key of this f a q category.
	 *
	 * @return the primary key of this f a q category
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this f a q category
	 *
	 * @param pk the primary key of this f a q category
	 */
	public void setPrimaryKey(long pk);

	/**
	 * Gets the id of this f a q category.
	 *
	 * @return the id of this f a q category
	 */
	public long getId();

	/**
	 * Sets the id of this f a q category.
	 *
	 * @param id the id of this f a q category
	 */
	public void setId(long id);

	/**
	 * Gets the name of this f a q category.
	 *
	 * @return the name of this f a q category
	 */
	@AutoEscape
	public String getName();

	/**
	 * Sets the name of this f a q category.
	 *
	 * @param name the name of this f a q category
	 */
	public void setName(String name);

	/**
	 * Gets the description of this f a q category.
	 *
	 * @return the description of this f a q category
	 */
	@AutoEscape
	public String getDescription();

	/**
	 * Sets the description of this f a q category.
	 *
	 * @param description the description of this f a q category
	 */
	public void setDescription(String description);

	/**
	 * Gets the language of this f a q category.
	 *
	 * @return the language of this f a q category
	 */
	@AutoEscape
	public String getLanguage();

	/**
	 * Sets the language of this f a q category.
	 *
	 * @param language the language of this f a q category
	 */
	public void setLanguage(String language);

	/**
	 * Gets the parent of this f a q category.
	 *
	 * @return the parent of this f a q category
	 */
	public long getParent();

	/**
	 * Sets the parent of this f a q category.
	 *
	 * @param parent the parent of this f a q category
	 */
	public void setParent(long parent);

	/**
	 * Gets the catorder of this f a q category.
	 *
	 * @return the catorder of this f a q category
	 */
	public int getCatorder();

	/**
	 * Sets the catorder of this f a q category.
	 *
	 * @param catorder the catorder of this f a q category
	 */
	public void setCatorder(int catorder);

	/**
	 * Gets the catlevel of this f a q category.
	 *
	 * @return the catlevel of this f a q category
	 */
	public int getCatlevel();

	/**
	 * Sets the catlevel of this f a q category.
	 *
	 * @param catlevel the catlevel of this f a q category
	 */
	public void setCatlevel(int catlevel);

	/**
	 * Gets the image of this f a q category.
	 *
	 * @return the image of this f a q category
	 */
	@AutoEscape
	public String getImage();

	/**
	 * Sets the image of this f a q category.
	 *
	 * @param image the image of this f a q category
	 */
	public void setImage(String image);

	/**
	 * Gets the created by user of this f a q category.
	 *
	 * @return the created by user of this f a q category
	 */
	@AutoEscape
	public String getCreatedByUser();

	/**
	 * Sets the created by user of this f a q category.
	 *
	 * @param createdByUser the created by user of this f a q category
	 */
	public void setCreatedByUser(String createdByUser);

	/**
	 * Gets the created date of this f a q category.
	 *
	 * @return the created date of this f a q category
	 */
	public Date getCreatedDate();

	/**
	 * Sets the created date of this f a q category.
	 *
	 * @param createdDate the created date of this f a q category
	 */
	public void setCreatedDate(Date createdDate);

	/**
	 * Gets the modified by user of this f a q category.
	 *
	 * @return the modified by user of this f a q category
	 */
	@AutoEscape
	public String getModifiedByUser();

	/**
	 * Sets the modified by user of this f a q category.
	 *
	 * @param modifiedByUser the modified by user of this f a q category
	 */
	public void setModifiedByUser(String modifiedByUser);

	/**
	 * Gets the modified date of this f a q category.
	 *
	 * @return the modified date of this f a q category
	 */
	public Date getModifiedDate();

	/**
	 * Sets the modified date of this f a q category.
	 *
	 * @param modifiedDate the modified date of this f a q category
	 */
	public void setModifiedDate(Date modifiedDate);

	/**
	 * Gets the group id of this f a q category.
	 *
	 * @return the group id of this f a q category
	 */
	public long getGroupId();

	/**
	 * Sets the group id of this f a q category.
	 *
	 * @param groupId the group id of this f a q category
	 */
	public void setGroupId(long groupId);

	/**
	 * Gets the user id of this f a q category.
	 *
	 * @return the user id of this f a q category
	 */
	public long getUserId();

	/**
	 * Sets the user id of this f a q category.
	 *
	 * @param userId the user id of this f a q category
	 */
	public void setUserId(long userId);

	/**
	 * Gets the user uuid of this f a q category.
	 *
	 * @return the user uuid of this f a q category
	 * @throws SystemException if a system exception occurred
	 */
	public String getUserUuid() throws SystemException;

	/**
	 * Sets the user uuid of this f a q category.
	 *
	 * @param userUuid the user uuid of this f a q category
	 */
	public void setUserUuid(String userUuid);

	/**
	 * Gets a copy of this f a q category as an escaped model instance by wrapping it with an {@link com.liferay.portal.kernel.bean.AutoEscapeBeanHandler}.
	 *
	 * @return the escaped model instance
	 * @see com.liferay.portal.kernel.bean.AutoEscapeBeanHandler
	 */
	public FAQCategory toEscapedModel();

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

	public int compareTo(FAQCategory faqCategory);

	public int hashCode();

	public String toString();

	public String toXmlString();
}