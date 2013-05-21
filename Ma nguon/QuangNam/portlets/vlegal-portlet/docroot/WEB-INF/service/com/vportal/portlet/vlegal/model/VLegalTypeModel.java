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

package com.vportal.portlet.vlegal.model;

import com.liferay.portal.kernel.annotation.AutoEscape;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;

import java.io.Serializable;

import java.util.Date;

/**
 * The base model interface for the VLegalType service. Represents a row in the &quot;VLegalType&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link com.vportal.portlet.vlegal.model.impl.VLegalTypeModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link com.vportal.portlet.vlegal.model.impl.VLegalTypeImpl}.
 * </p>
 *
 * <p>
 * Never modify or reference this interface directly. All methods that expect a v legal type model instance should use the {@link VLegalType} interface instead.
 * </p>
 *
 * @author ACB
 * @see VLegalType
 * @see com.vportal.portlet.vlegal.model.impl.VLegalTypeImpl
 * @see com.vportal.portlet.vlegal.model.impl.VLegalTypeModelImpl
 * @generated
 */
public interface VLegalTypeModel extends BaseModel<VLegalType> {
	/**
	 * Gets the primary key of this v legal type.
	 *
	 * @return the primary key of this v legal type
	 */
	public String getPrimaryKey();

	/**
	 * Sets the primary key of this v legal type
	 *
	 * @param pk the primary key of this v legal type
	 */
	public void setPrimaryKey(String pk);

	/**
	 * Gets the type id of this v legal type.
	 *
	 * @return the type id of this v legal type
	 */
	@AutoEscape
	public String getTypeId();

	/**
	 * Sets the type id of this v legal type.
	 *
	 * @param typeId the type id of this v legal type
	 */
	public void setTypeId(String typeId);

	/**
	 * Gets the group id of this v legal type.
	 *
	 * @return the group id of this v legal type
	 */
	public long getGroupId();

	/**
	 * Sets the group id of this v legal type.
	 *
	 * @param groupId the group id of this v legal type
	 */
	public void setGroupId(long groupId);

	/**
	 * Gets the company id of this v legal type.
	 *
	 * @return the company id of this v legal type
	 */
	public long getCompanyId();

	/**
	 * Sets the company id of this v legal type.
	 *
	 * @param companyId the company id of this v legal type
	 */
	public void setCompanyId(long companyId);

	/**
	 * Gets the user id of this v legal type.
	 *
	 * @return the user id of this v legal type
	 */
	public long getUserId();

	/**
	 * Sets the user id of this v legal type.
	 *
	 * @param userId the user id of this v legal type
	 */
	public void setUserId(long userId);

	/**
	 * Gets the user uuid of this v legal type.
	 *
	 * @return the user uuid of this v legal type
	 * @throws SystemException if a system exception occurred
	 */
	public String getUserUuid() throws SystemException;

	/**
	 * Sets the user uuid of this v legal type.
	 *
	 * @param userUuid the user uuid of this v legal type
	 */
	public void setUserUuid(String userUuid);

	/**
	 * Gets the created date of this v legal type.
	 *
	 * @return the created date of this v legal type
	 */
	public Date getCreatedDate();

	/**
	 * Sets the created date of this v legal type.
	 *
	 * @param createdDate the created date of this v legal type
	 */
	public void setCreatedDate(Date createdDate);

	/**
	 * Gets the modified date of this v legal type.
	 *
	 * @return the modified date of this v legal type
	 */
	public Date getModifiedDate();

	/**
	 * Sets the modified date of this v legal type.
	 *
	 * @param modifiedDate the modified date of this v legal type
	 */
	public void setModifiedDate(Date modifiedDate);

	/**
	 * Gets the created by user of this v legal type.
	 *
	 * @return the created by user of this v legal type
	 */
	public long getCreatedByUser();

	/**
	 * Sets the created by user of this v legal type.
	 *
	 * @param createdByUser the created by user of this v legal type
	 */
	public void setCreatedByUser(long createdByUser);

	/**
	 * Gets the modified by user of this v legal type.
	 *
	 * @return the modified by user of this v legal type
	 */
	public long getModifiedByUser();

	/**
	 * Sets the modified by user of this v legal type.
	 *
	 * @param modifiedByUser the modified by user of this v legal type
	 */
	public void setModifiedByUser(long modifiedByUser);

	/**
	 * Gets the name of this v legal type.
	 *
	 * @return the name of this v legal type
	 */
	@AutoEscape
	public String getName();

	/**
	 * Sets the name of this v legal type.
	 *
	 * @param name the name of this v legal type
	 */
	public void setName(String name);

	/**
	 * Gets the description of this v legal type.
	 *
	 * @return the description of this v legal type
	 */
	@AutoEscape
	public String getDescription();

	/**
	 * Sets the description of this v legal type.
	 *
	 * @param description the description of this v legal type
	 */
	public void setDescription(String description);

	/**
	 * Gets the language of this v legal type.
	 *
	 * @return the language of this v legal type
	 */
	@AutoEscape
	public String getLanguage();

	/**
	 * Sets the language of this v legal type.
	 *
	 * @param language the language of this v legal type
	 */
	public void setLanguage(String language);

	/**
	 * Gets the status type of this v legal type.
	 *
	 * @return the status type of this v legal type
	 */
	public boolean getStatusType();

	/**
	 * Determines if this v legal type is status type.
	 *
	 * @return <code>true</code> if this v legal type is status type; <code>false</code> otherwise
	 */
	public boolean isStatusType();

	/**
	 * Sets whether this {$entity.humanName} is status type.
	 *
	 * @param statusType the status type of this v legal type
	 */
	public void setStatusType(boolean statusType);

	/**
	 * Gets the rssable of this v legal type.
	 *
	 * @return the rssable of this v legal type
	 */
	public boolean getRssable();

	/**
	 * Determines if this v legal type is rssable.
	 *
	 * @return <code>true</code> if this v legal type is rssable; <code>false</code> otherwise
	 */
	public boolean isRssable();

	/**
	 * Sets whether this {$entity.humanName} is rssable.
	 *
	 * @param rssable the rssable of this v legal type
	 */
	public void setRssable(boolean rssable);

	/**
	 * Gets the position of this v legal type.
	 *
	 * @return the position of this v legal type
	 */
	public int getPosition();

	/**
	 * Sets the position of this v legal type.
	 *
	 * @param position the position of this v legal type
	 */
	public void setPosition(int position);

	/**
	 * Gets a copy of this v legal type as an escaped model instance by wrapping it with an {@link com.liferay.portal.kernel.bean.AutoEscapeBeanHandler}.
	 *
	 * @return the escaped model instance
	 * @see com.liferay.portal.kernel.bean.AutoEscapeBeanHandler
	 */
	public VLegalType toEscapedModel();

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

	public int compareTo(VLegalType vLegalType);

	public int hashCode();

	public String toString();

	public String toXmlString();
}