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
 * The base model interface for the VLegalAttachedMessage service. Represents a row in the &quot;VLegalAttachedMessage&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link com.vportal.portlet.vlegal.model.impl.VLegalAttachedMessageModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link com.vportal.portlet.vlegal.model.impl.VLegalAttachedMessageImpl}.
 * </p>
 *
 * <p>
 * Never modify or reference this interface directly. All methods that expect a v legal attached message model instance should use the {@link VLegalAttachedMessage} interface instead.
 * </p>
 *
 * @author ACB
 * @see VLegalAttachedMessage
 * @see com.vportal.portlet.vlegal.model.impl.VLegalAttachedMessageImpl
 * @see com.vportal.portlet.vlegal.model.impl.VLegalAttachedMessageModelImpl
 * @generated
 */
public interface VLegalAttachedMessageModel extends BaseModel<VLegalAttachedMessage> {
	/**
	 * Gets the primary key of this v legal attached message.
	 *
	 * @return the primary key of this v legal attached message
	 */
	public String getPrimaryKey();

	/**
	 * Sets the primary key of this v legal attached message
	 *
	 * @param pk the primary key of this v legal attached message
	 */
	public void setPrimaryKey(String pk);

	/**
	 * Gets the message id of this v legal attached message.
	 *
	 * @return the message id of this v legal attached message
	 */
	@AutoEscape
	public String getMessageId();

	/**
	 * Sets the message id of this v legal attached message.
	 *
	 * @param messageId the message id of this v legal attached message
	 */
	public void setMessageId(String messageId);

	/**
	 * Gets the group id of this v legal attached message.
	 *
	 * @return the group id of this v legal attached message
	 */
	public long getGroupId();

	/**
	 * Sets the group id of this v legal attached message.
	 *
	 * @param groupId the group id of this v legal attached message
	 */
	public void setGroupId(long groupId);

	/**
	 * Gets the company id of this v legal attached message.
	 *
	 * @return the company id of this v legal attached message
	 */
	public long getCompanyId();

	/**
	 * Sets the company id of this v legal attached message.
	 *
	 * @param companyId the company id of this v legal attached message
	 */
	public void setCompanyId(long companyId);

	/**
	 * Gets the user id of this v legal attached message.
	 *
	 * @return the user id of this v legal attached message
	 */
	public long getUserId();

	/**
	 * Sets the user id of this v legal attached message.
	 *
	 * @param userId the user id of this v legal attached message
	 */
	public void setUserId(long userId);

	/**
	 * Gets the user uuid of this v legal attached message.
	 *
	 * @return the user uuid of this v legal attached message
	 * @throws SystemException if a system exception occurred
	 */
	public String getUserUuid() throws SystemException;

	/**
	 * Sets the user uuid of this v legal attached message.
	 *
	 * @param userUuid the user uuid of this v legal attached message
	 */
	public void setUserUuid(String userUuid);

	/**
	 * Gets the created date of this v legal attached message.
	 *
	 * @return the created date of this v legal attached message
	 */
	public Date getCreatedDate();

	/**
	 * Sets the created date of this v legal attached message.
	 *
	 * @param createdDate the created date of this v legal attached message
	 */
	public void setCreatedDate(Date createdDate);

	/**
	 * Gets the created by user of this v legal attached message.
	 *
	 * @return the created by user of this v legal attached message
	 */
	public long getCreatedByUser();

	/**
	 * Sets the created by user of this v legal attached message.
	 *
	 * @param createdByUser the created by user of this v legal attached message
	 */
	public void setCreatedByUser(long createdByUser);

	/**
	 * Gets the article id of this v legal attached message.
	 *
	 * @return the article id of this v legal attached message
	 */
	@AutoEscape
	public String getArticleId();

	/**
	 * Sets the article id of this v legal attached message.
	 *
	 * @param articleId the article id of this v legal attached message
	 */
	public void setArticleId(String articleId);

	/**
	 * Gets the content of this v legal attached message.
	 *
	 * @return the content of this v legal attached message
	 */
	@AutoEscape
	public String getContent();

	/**
	 * Sets the content of this v legal attached message.
	 *
	 * @param content the content of this v legal attached message
	 */
	public void setContent(String content);

	/**
	 * Gets the read message of this v legal attached message.
	 *
	 * @return the read message of this v legal attached message
	 */
	public boolean getReadMessage();

	/**
	 * Determines if this v legal attached message is read message.
	 *
	 * @return <code>true</code> if this v legal attached message is read message; <code>false</code> otherwise
	 */
	public boolean isReadMessage();

	/**
	 * Sets whether this {$entity.humanName} is read message.
	 *
	 * @param readMessage the read message of this v legal attached message
	 */
	public void setReadMessage(boolean readMessage);

	/**
	 * Gets a copy of this v legal attached message as an escaped model instance by wrapping it with an {@link com.liferay.portal.kernel.bean.AutoEscapeBeanHandler}.
	 *
	 * @return the escaped model instance
	 * @see com.liferay.portal.kernel.bean.AutoEscapeBeanHandler
	 */
	public VLegalAttachedMessage toEscapedModel();

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

	public int compareTo(VLegalAttachedMessage vLegalAttachedMessage);

	public int hashCode();

	public String toString();

	public String toXmlString();
}