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
 * The base model interface for the FAQQuestion service. Represents a row in the &quot;FAQQuestion&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link com.vportal.portlet.vfaq.model.impl.FAQQuestionModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link com.vportal.portlet.vfaq.model.impl.FAQQuestionImpl}.
 * </p>
 *
 * <p>
 * Never modify or reference this interface directly. All methods that expect a f a q question model instance should use the {@link FAQQuestion} interface instead.
 * </p>
 *
 * @author HOAN
 * @see FAQQuestion
 * @see com.vportal.portlet.vfaq.model.impl.FAQQuestionImpl
 * @see com.vportal.portlet.vfaq.model.impl.FAQQuestionModelImpl
 * @generated
 */
public interface FAQQuestionModel extends BaseModel<FAQQuestion> {
	/**
	 * Gets the primary key of this f a q question.
	 *
	 * @return the primary key of this f a q question
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this f a q question
	 *
	 * @param pk the primary key of this f a q question
	 */
	public void setPrimaryKey(long pk);

	/**
	 * Gets the uuid of this f a q question.
	 *
	 * @return the uuid of this f a q question
	 */
	@AutoEscape
	public String getUuid();

	/**
	 * Sets the uuid of this f a q question.
	 *
	 * @param uuid the uuid of this f a q question
	 */
	public void setUuid(String uuid);

	/**
	 * Gets the id of this f a q question.
	 *
	 * @return the id of this f a q question
	 */
	public long getId();

	/**
	 * Sets the id of this f a q question.
	 *
	 * @param id the id of this f a q question
	 */
	public void setId(long id);

	/**
	 * Gets the title of this f a q question.
	 *
	 * @return the title of this f a q question
	 */
	@AutoEscape
	public String getTitle();

	/**
	 * Sets the title of this f a q question.
	 *
	 * @param title the title of this f a q question
	 */
	public void setTitle(String title);

	/**
	 * Gets the content of this f a q question.
	 *
	 * @return the content of this f a q question
	 */
	@AutoEscape
	public String getContent();

	/**
	 * Sets the content of this f a q question.
	 *
	 * @param content the content of this f a q question
	 */
	public void setContent(String content);

	/**
	 * Gets the language of this f a q question.
	 *
	 * @return the language of this f a q question
	 */
	@AutoEscape
	public String getLanguage();

	/**
	 * Sets the language of this f a q question.
	 *
	 * @param language the language of this f a q question
	 */
	public void setLanguage(String language);

	/**
	 * Gets the question order of this f a q question.
	 *
	 * @return the question order of this f a q question
	 */
	public int getQuestionOrder();

	/**
	 * Sets the question order of this f a q question.
	 *
	 * @param questionOrder the question order of this f a q question
	 */
	public void setQuestionOrder(int questionOrder);

	/**
	 * Gets the sent date of this f a q question.
	 *
	 * @return the sent date of this f a q question
	 */
	public Date getSentDate();

	/**
	 * Sets the sent date of this f a q question.
	 *
	 * @param sentDate the sent date of this f a q question
	 */
	public void setSentDate(Date sentDate);

	/**
	 * Gets the sent by user of this f a q question.
	 *
	 * @return the sent by user of this f a q question
	 */
	@AutoEscape
	public String getSentByUser();

	/**
	 * Sets the sent by user of this f a q question.
	 *
	 * @param sentByUser the sent by user of this f a q question
	 */
	public void setSentByUser(String sentByUser);

	/**
	 * Gets the sender email of this f a q question.
	 *
	 * @return the sender email of this f a q question
	 */
	@AutoEscape
	public String getSenderEmail();

	/**
	 * Sets the sender email of this f a q question.
	 *
	 * @param senderEmail the sender email of this f a q question
	 */
	public void setSenderEmail(String senderEmail);

	/**
	 * Gets the question type of this f a q question.
	 *
	 * @return the question type of this f a q question
	 */
	@AutoEscape
	public String getQuestionType();

	/**
	 * Sets the question type of this f a q question.
	 *
	 * @param questionType the question type of this f a q question
	 */
	public void setQuestionType(String questionType);

	/**
	 * Gets the modified by user of this f a q question.
	 *
	 * @return the modified by user of this f a q question
	 */
	@AutoEscape
	public String getModifiedByUser();

	/**
	 * Sets the modified by user of this f a q question.
	 *
	 * @param modifiedByUser the modified by user of this f a q question
	 */
	public void setModifiedByUser(String modifiedByUser);

	/**
	 * Gets the modified date of this f a q question.
	 *
	 * @return the modified date of this f a q question
	 */
	public Date getModifiedDate();

	/**
	 * Sets the modified date of this f a q question.
	 *
	 * @param modifiedDate the modified date of this f a q question
	 */
	public void setModifiedDate(Date modifiedDate);

	/**
	 * Gets the hit count of this f a q question.
	 *
	 * @return the hit count of this f a q question
	 */
	public int getHitCount();

	/**
	 * Sets the hit count of this f a q question.
	 *
	 * @param hitCount the hit count of this f a q question
	 */
	public void setHitCount(int hitCount);

	/**
	 * Gets the approved of this f a q question.
	 *
	 * @return the approved of this f a q question
	 */
	public boolean getApproved();

	/**
	 * Determines if this f a q question is approved.
	 *
	 * @return <code>true</code> if this f a q question is approved; <code>false</code> otherwise
	 */
	public boolean isApproved();

	/**
	 * Sets whether this {$entity.humanName} is approved.
	 *
	 * @param approved the approved of this f a q question
	 */
	public void setApproved(boolean approved);

	/**
	 * Gets the group id of this f a q question.
	 *
	 * @return the group id of this f a q question
	 */
	public long getGroupId();

	/**
	 * Sets the group id of this f a q question.
	 *
	 * @param groupId the group id of this f a q question
	 */
	public void setGroupId(long groupId);

	/**
	 * Gets the user id of this f a q question.
	 *
	 * @return the user id of this f a q question
	 */
	public long getUserId();

	/**
	 * Sets the user id of this f a q question.
	 *
	 * @param userId the user id of this f a q question
	 */
	public void setUserId(long userId);

	/**
	 * Gets the user uuid of this f a q question.
	 *
	 * @return the user uuid of this f a q question
	 * @throws SystemException if a system exception occurred
	 */
	public String getUserUuid() throws SystemException;

	/**
	 * Sets the user uuid of this f a q question.
	 *
	 * @param userUuid the user uuid of this f a q question
	 */
	public void setUserUuid(String userUuid);

	/**
	 * Gets a copy of this f a q question as an escaped model instance by wrapping it with an {@link com.liferay.portal.kernel.bean.AutoEscapeBeanHandler}.
	 *
	 * @return the escaped model instance
	 * @see com.liferay.portal.kernel.bean.AutoEscapeBeanHandler
	 */
	public FAQQuestion toEscapedModel();

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

	public int compareTo(FAQQuestion faqQuestion);

	public int hashCode();

	public String toString();

	public String toXmlString();
}