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

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.DateUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.impl.BaseModelImpl;
import com.liferay.portal.util.PortalUtil;

import java.io.Serializable;

import java.lang.reflect.Proxy;

import java.util.Date;

/**
 * @author ACB
 */
public class VLegalAttachedMessageClp extends BaseModelImpl<VLegalAttachedMessage>
	implements VLegalAttachedMessage {
	public VLegalAttachedMessageClp() {
	}

	public String getPrimaryKey() {
		return _messageId;
	}

	public void setPrimaryKey(String pk) {
		setMessageId(pk);
	}

	public Serializable getPrimaryKeyObj() {
		return _messageId;
	}

	public String getMessageId() {
		return _messageId;
	}

	public void setMessageId(String messageId) {
		_messageId = messageId;
	}

	public long getGroupId() {
		return _groupId;
	}

	public void setGroupId(long groupId) {
		_groupId = groupId;
	}

	public long getCompanyId() {
		return _companyId;
	}

	public void setCompanyId(long companyId) {
		_companyId = companyId;
	}

	public long getUserId() {
		return _userId;
	}

	public void setUserId(long userId) {
		_userId = userId;
	}

	public String getUserUuid() throws SystemException {
		return PortalUtil.getUserValue(getUserId(), "uuid", _userUuid);
	}

	public void setUserUuid(String userUuid) {
		_userUuid = userUuid;
	}

	public Date getCreatedDate() {
		return _createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		_createdDate = createdDate;
	}

	public long getCreatedByUser() {
		return _createdByUser;
	}

	public void setCreatedByUser(long createdByUser) {
		_createdByUser = createdByUser;
	}

	public String getArticleId() {
		return _articleId;
	}

	public void setArticleId(String articleId) {
		_articleId = articleId;
	}

	public String getContent() {
		return _content;
	}

	public void setContent(String content) {
		_content = content;
	}

	public boolean getReadMessage() {
		return _readMessage;
	}

	public boolean isReadMessage() {
		return _readMessage;
	}

	public void setReadMessage(boolean readMessage) {
		_readMessage = readMessage;
	}

	public VLegalAttachedMessage toEscapedModel() {
		if (isEscapedModel()) {
			return this;
		}
		else {
			return (VLegalAttachedMessage)Proxy.newProxyInstance(VLegalAttachedMessage.class.getClassLoader(),
				new Class[] { VLegalAttachedMessage.class },
				new AutoEscapeBeanHandler(this));
		}
	}

	public Object clone() {
		VLegalAttachedMessageClp clone = new VLegalAttachedMessageClp();

		clone.setMessageId(getMessageId());
		clone.setGroupId(getGroupId());
		clone.setCompanyId(getCompanyId());
		clone.setUserId(getUserId());
		clone.setCreatedDate(getCreatedDate());
		clone.setCreatedByUser(getCreatedByUser());
		clone.setArticleId(getArticleId());
		clone.setContent(getContent());
		clone.setReadMessage(getReadMessage());

		return clone;
	}

	public int compareTo(VLegalAttachedMessage vLegalAttachedMessage) {
		int value = 0;

		value = DateUtil.compareTo(getCreatedDate(),
				vLegalAttachedMessage.getCreatedDate());

		value = value * -1;

		if (value != 0) {
			return value;
		}

		return 0;
	}

	public boolean equals(Object obj) {
		if (obj == null) {
			return false;
		}

		VLegalAttachedMessageClp vLegalAttachedMessage = null;

		try {
			vLegalAttachedMessage = (VLegalAttachedMessageClp)obj;
		}
		catch (ClassCastException cce) {
			return false;
		}

		String pk = vLegalAttachedMessage.getPrimaryKey();

		if (getPrimaryKey().equals(pk)) {
			return true;
		}
		else {
			return false;
		}
	}

	public int hashCode() {
		return getPrimaryKey().hashCode();
	}

	public String toString() {
		StringBundler sb = new StringBundler(19);

		sb.append("{messageId=");
		sb.append(getMessageId());
		sb.append(", groupId=");
		sb.append(getGroupId());
		sb.append(", companyId=");
		sb.append(getCompanyId());
		sb.append(", userId=");
		sb.append(getUserId());
		sb.append(", createdDate=");
		sb.append(getCreatedDate());
		sb.append(", createdByUser=");
		sb.append(getCreatedByUser());
		sb.append(", articleId=");
		sb.append(getArticleId());
		sb.append(", content=");
		sb.append(getContent());
		sb.append(", readMessage=");
		sb.append(getReadMessage());
		sb.append("}");

		return sb.toString();
	}

	public String toXmlString() {
		StringBundler sb = new StringBundler(31);

		sb.append("<model><model-name>");
		sb.append("com.vportal.portlet.vlegal.model.VLegalAttachedMessage");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>messageId</column-name><column-value><![CDATA[");
		sb.append(getMessageId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>groupId</column-name><column-value><![CDATA[");
		sb.append(getGroupId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>companyId</column-name><column-value><![CDATA[");
		sb.append(getCompanyId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>userId</column-name><column-value><![CDATA[");
		sb.append(getUserId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>createdDate</column-name><column-value><![CDATA[");
		sb.append(getCreatedDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>createdByUser</column-name><column-value><![CDATA[");
		sb.append(getCreatedByUser());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>articleId</column-name><column-value><![CDATA[");
		sb.append(getArticleId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>content</column-name><column-value><![CDATA[");
		sb.append(getContent());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>readMessage</column-name><column-value><![CDATA[");
		sb.append(getReadMessage());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private String _messageId;
	private long _groupId;
	private long _companyId;
	private long _userId;
	private String _userUuid;
	private Date _createdDate;
	private long _createdByUser;
	private String _articleId;
	private String _content;
	private boolean _readMessage;
}