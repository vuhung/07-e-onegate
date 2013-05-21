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

package com.vportal.portlet.vcontact.model;

import com.liferay.portal.kernel.annotation.AutoEscape;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;

import java.io.Serializable;

import java.util.Date;

/**
 * The base model interface for the VContact service. Represents a row in the &quot;vcontact_VContact&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link com.vportal.portlet.vcontact.model.impl.VContactModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link com.vportal.portlet.vcontact.model.impl.VContactImpl}.
 * </p>
 *
 * <p>
 * Never modify or reference this interface directly. All methods that expect a v contact model instance should use the {@link VContact} interface instead.
 * </p>
 *
 * @author Admin
 * @see VContact
 * @see com.vportal.portlet.vcontact.model.impl.VContactImpl
 * @see com.vportal.portlet.vcontact.model.impl.VContactModelImpl
 * @generated
 */
public interface VContactModel extends BaseModel<VContact> {
	/**
	 * Gets the primary key of this v contact.
	 *
	 * @return the primary key of this v contact
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this v contact
	 *
	 * @param pk the primary key of this v contact
	 */
	public void setPrimaryKey(long pk);

	/**
	 * Gets the id of this v contact.
	 *
	 * @return the id of this v contact
	 */
	public long getId();

	/**
	 * Sets the id of this v contact.
	 *
	 * @param id the id of this v contact
	 */
	public void setId(long id);

	/**
	 * Gets the group id of this v contact.
	 *
	 * @return the group id of this v contact
	 */
	public long getGroupId();

	/**
	 * Sets the group id of this v contact.
	 *
	 * @param groupId the group id of this v contact
	 */
	public void setGroupId(long groupId);

	/**
	 * Gets the company id of this v contact.
	 *
	 * @return the company id of this v contact
	 */
	public long getCompanyId();

	/**
	 * Sets the company id of this v contact.
	 *
	 * @param companyId the company id of this v contact
	 */
	public void setCompanyId(long companyId);

	/**
	 * Gets the created date of this v contact.
	 *
	 * @return the created date of this v contact
	 */
	public Date getCreatedDate();

	/**
	 * Sets the created date of this v contact.
	 *
	 * @param createdDate the created date of this v contact
	 */
	public void setCreatedDate(Date createdDate);

	/**
	 * Gets the modified date of this v contact.
	 *
	 * @return the modified date of this v contact
	 */
	public Date getModifiedDate();

	/**
	 * Sets the modified date of this v contact.
	 *
	 * @param modifiedDate the modified date of this v contact
	 */
	public void setModifiedDate(Date modifiedDate);

	/**
	 * Gets the guest name of this v contact.
	 *
	 * @return the guest name of this v contact
	 */
	@AutoEscape
	public String getGuestName();

	/**
	 * Sets the guest name of this v contact.
	 *
	 * @param guestName the guest name of this v contact
	 */
	public void setGuestName(String guestName);

	/**
	 * Gets the email of this v contact.
	 *
	 * @return the email of this v contact
	 */
	@AutoEscape
	public String getEmail();

	/**
	 * Sets the email of this v contact.
	 *
	 * @param email the email of this v contact
	 */
	public void setEmail(String email);

	/**
	 * Gets the title of this v contact.
	 *
	 * @return the title of this v contact
	 */
	@AutoEscape
	public String getTitle();

	/**
	 * Sets the title of this v contact.
	 *
	 * @param title the title of this v contact
	 */
	public void setTitle(String title);

	/**
	 * Gets the address of this v contact.
	 *
	 * @return the address of this v contact
	 */
	@AutoEscape
	public String getAddress();

	/**
	 * Sets the address of this v contact.
	 *
	 * @param address the address of this v contact
	 */
	public void setAddress(String address);

	/**
	 * Gets the phone of this v contact.
	 *
	 * @return the phone of this v contact
	 */
	@AutoEscape
	public String getPhone();

	/**
	 * Sets the phone of this v contact.
	 *
	 * @param phone the phone of this v contact
	 */
	public void setPhone(String phone);

	/**
	 * Gets the fax of this v contact.
	 *
	 * @return the fax of this v contact
	 */
	@AutoEscape
	public String getFax();

	/**
	 * Sets the fax of this v contact.
	 *
	 * @param fax the fax of this v contact
	 */
	public void setFax(String fax);

	/**
	 * Gets the content of this v contact.
	 *
	 * @return the content of this v contact
	 */
	@AutoEscape
	public String getContent();

	/**
	 * Sets the content of this v contact.
	 *
	 * @param content the content of this v contact
	 */
	public void setContent(String content);

	/**
	 * Gets the has attach of this v contact.
	 *
	 * @return the has attach of this v contact
	 */
	public boolean getHasAttach();

	/**
	 * Determines if this v contact is has attach.
	 *
	 * @return <code>true</code> if this v contact is has attach; <code>false</code> otherwise
	 */
	public boolean isHasAttach();

	/**
	 * Sets whether this {$entity.humanName} is has attach.
	 *
	 * @param hasAttach the has attach of this v contact
	 */
	public void setHasAttach(boolean hasAttach);

	/**
	 * Gets the status of this v contact.
	 *
	 * @return the status of this v contact
	 */
	public int getStatus();

	/**
	 * Sets the status of this v contact.
	 *
	 * @param status the status of this v contact
	 */
	public void setStatus(int status);

	/**
	 * Gets a copy of this v contact as an escaped model instance by wrapping it with an {@link com.liferay.portal.kernel.bean.AutoEscapeBeanHandler}.
	 *
	 * @return the escaped model instance
	 * @see com.liferay.portal.kernel.bean.AutoEscapeBeanHandler
	 */
	public VContact toEscapedModel();

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

	public int compareTo(VContact vContact);

	public int hashCode();

	public String toString();

	public String toXmlString();
}