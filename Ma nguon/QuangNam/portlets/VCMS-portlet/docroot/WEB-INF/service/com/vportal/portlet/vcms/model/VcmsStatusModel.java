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
 * The base model interface for the VcmsStatus service. Represents a row in the &quot;VcmsStatus&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link com.vportal.portlet.vcms.model.impl.VcmsStatusModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link com.vportal.portlet.vcms.model.impl.VcmsStatusImpl}.
 * </p>
 *
 * <p>
 * Never modify or reference this interface directly. All methods that expect a vcms status model instance should use the {@link VcmsStatus} interface instead.
 * </p>
 *
 * @author HOAN
 * @see VcmsStatus
 * @see com.vportal.portlet.vcms.model.impl.VcmsStatusImpl
 * @see com.vportal.portlet.vcms.model.impl.VcmsStatusModelImpl
 * @generated
 */
public interface VcmsStatusModel extends BaseModel<VcmsStatus> {
	/**
	 * Gets the primary key of this vcms status.
	 *
	 * @return the primary key of this vcms status
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this vcms status
	 *
	 * @param pk the primary key of this vcms status
	 */
	public void setPrimaryKey(long pk);

	/**
	 * Gets the status id of this vcms status.
	 *
	 * @return the status id of this vcms status
	 */
	public long getStatusId();

	/**
	 * Sets the status id of this vcms status.
	 *
	 * @param statusId the status id of this vcms status
	 */
	public void setStatusId(long statusId);

	/**
	 * Gets the company id of this vcms status.
	 *
	 * @return the company id of this vcms status
	 */
	public long getCompanyId();

	/**
	 * Sets the company id of this vcms status.
	 *
	 * @param companyId the company id of this vcms status
	 */
	public void setCompanyId(long companyId);

	/**
	 * Gets the group id of this vcms status.
	 *
	 * @return the group id of this vcms status
	 */
	public long getGroupId();

	/**
	 * Sets the group id of this vcms status.
	 *
	 * @param groupId the group id of this vcms status
	 */
	public void setGroupId(long groupId);

	/**
	 * Gets the created date of this vcms status.
	 *
	 * @return the created date of this vcms status
	 */
	public Date getCreatedDate();

	/**
	 * Sets the created date of this vcms status.
	 *
	 * @param createdDate the created date of this vcms status
	 */
	public void setCreatedDate(Date createdDate);

	/**
	 * Gets the created by user of this vcms status.
	 *
	 * @return the created by user of this vcms status
	 */
	@AutoEscape
	public String getCreatedByUser();

	/**
	 * Sets the created by user of this vcms status.
	 *
	 * @param createdByUser the created by user of this vcms status
	 */
	public void setCreatedByUser(String createdByUser);

	/**
	 * Gets the modified date of this vcms status.
	 *
	 * @return the modified date of this vcms status
	 */
	public Date getModifiedDate();

	/**
	 * Sets the modified date of this vcms status.
	 *
	 * @param modifiedDate the modified date of this vcms status
	 */
	public void setModifiedDate(Date modifiedDate);

	/**
	 * Gets the modified by user of this vcms status.
	 *
	 * @return the modified by user of this vcms status
	 */
	@AutoEscape
	public String getModifiedByUser();

	/**
	 * Sets the modified by user of this vcms status.
	 *
	 * @param modifiedByUser the modified by user of this vcms status
	 */
	public void setModifiedByUser(String modifiedByUser);

	/**
	 * Gets the name of this vcms status.
	 *
	 * @return the name of this vcms status
	 */
	@AutoEscape
	public String getName();

	/**
	 * Sets the name of this vcms status.
	 *
	 * @param name the name of this vcms status
	 */
	public void setName(String name);

	/**
	 * Gets the description of this vcms status.
	 *
	 * @return the description of this vcms status
	 */
	@AutoEscape
	public String getDescription();

	/**
	 * Sets the description of this vcms status.
	 *
	 * @param description the description of this vcms status
	 */
	public void setDescription(String description);

	/**
	 * Gets the css class of this vcms status.
	 *
	 * @return the css class of this vcms status
	 */
	@AutoEscape
	public String getCssClass();

	/**
	 * Sets the css class of this vcms status.
	 *
	 * @param cssClass the css class of this vcms status
	 */
	public void setCssClass(String cssClass);

	/**
	 * Gets the text color of this vcms status.
	 *
	 * @return the text color of this vcms status
	 */
	@AutoEscape
	public String getTextColor();

	/**
	 * Sets the text color of this vcms status.
	 *
	 * @param textColor the text color of this vcms status
	 */
	public void setTextColor(String textColor);

	/**
	 * Gets the position of this vcms status.
	 *
	 * @return the position of this vcms status
	 */
	public int getPosition();

	/**
	 * Sets the position of this vcms status.
	 *
	 * @param position the position of this vcms status
	 */
	public void setPosition(int position);

	/**
	 * Gets the is primary of this vcms status.
	 *
	 * @return the is primary of this vcms status
	 */
	public boolean getIsPrimary();

	/**
	 * Determines if this vcms status is is primary.
	 *
	 * @return <code>true</code> if this vcms status is is primary; <code>false</code> otherwise
	 */
	public boolean isIsPrimary();

	/**
	 * Sets whether this {$entity.humanName} is is primary.
	 *
	 * @param isPrimary the is primary of this vcms status
	 */
	public void setIsPrimary(boolean isPrimary);

	/**
	 * Gets the active of this vcms status.
	 *
	 * @return the active of this vcms status
	 */
	public boolean getActive();

	/**
	 * Determines if this vcms status is active.
	 *
	 * @return <code>true</code> if this vcms status is active; <code>false</code> otherwise
	 */
	public boolean isActive();

	/**
	 * Sets whether this {$entity.humanName} is active.
	 *
	 * @param active the active of this vcms status
	 */
	public void setActive(boolean active);

	/**
	 * Gets a copy of this vcms status as an escaped model instance by wrapping it with an {@link com.liferay.portal.kernel.bean.AutoEscapeBeanHandler}.
	 *
	 * @return the escaped model instance
	 * @see com.liferay.portal.kernel.bean.AutoEscapeBeanHandler
	 */
	public VcmsStatus toEscapedModel();

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

	public int compareTo(VcmsStatus vcmsStatus);

	public int hashCode();

	public String toString();

	public String toXmlString();
}