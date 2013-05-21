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
public class VLegalDraftDocumentClp extends BaseModelImpl<VLegalDraftDocument>
	implements VLegalDraftDocument {
	public VLegalDraftDocumentClp() {
	}

	public String getPrimaryKey() {
		return _draftId;
	}

	public void setPrimaryKey(String pk) {
		setDraftId(pk);
	}

	public Serializable getPrimaryKeyObj() {
		return _draftId;
	}

	public String getDraftId() {
		return _draftId;
	}

	public void setDraftId(String draftId) {
		_draftId = draftId;
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

	public long getCreatedByUser() {
		return _createdByUser;
	}

	public void setCreatedByUser(long createdByUser) {
		_createdByUser = createdByUser;
	}

	public Date getCreatedDate() {
		return _createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		_createdDate = createdDate;
	}

	public long getModifiedByUser() {
		return _modifiedByUser;
	}

	public void setModifiedByUser(long modifiedByUser) {
		_modifiedByUser = modifiedByUser;
	}

	public Date getModifiedDate() {
		return _modifiedDate;
	}

	public void setModifiedDate(Date modifiedDate) {
		_modifiedDate = modifiedDate;
	}

	public long getApprovedByUser() {
		return _approvedByUser;
	}

	public void setApprovedByUser(long approvedByUser) {
		_approvedByUser = approvedByUser;
	}

	public Date getApprovedDate() {
		return _approvedDate;
	}

	public void setApprovedDate(Date approvedDate) {
		_approvedDate = approvedDate;
	}

	public long getPublishedByUser() {
		return _publishedByUser;
	}

	public void setPublishedByUser(long publishedByUser) {
		_publishedByUser = publishedByUser;
	}

	public Date getPublishedDate() {
		return _publishedDate;
	}

	public void setPublishedDate(Date publishedDate) {
		_publishedDate = publishedDate;
	}

	public String getTitle() {
		return _title;
	}

	public void setTitle(String title) {
		_title = title;
	}

	public Date getExpiredDate() {
		return _expiredDate;
	}

	public void setExpiredDate(Date expiredDate) {
		_expiredDate = expiredDate;
	}

	public String getLanguage() {
		return _language;
	}

	public void setLanguage(String language) {
		_language = language;
	}

	public String getContent() {
		return _content;
	}

	public void setContent(String content) {
		_content = content;
	}

	public String getTypeId() {
		return _typeId;
	}

	public void setTypeId(String typeId) {
		_typeId = typeId;
	}

	public String getFieldId() {
		return _fieldId;
	}

	public void setFieldId(String fieldId) {
		_fieldId = fieldId;
	}

	public boolean getHasAttachment() {
		return _hasAttachment;
	}

	public boolean isHasAttachment() {
		return _hasAttachment;
	}

	public void setHasAttachment(boolean hasAttachment) {
		_hasAttachment = hasAttachment;
	}

	public int getDraftLevel() {
		return _draftLevel;
	}

	public void setDraftLevel(int draftLevel) {
		_draftLevel = draftLevel;
	}

	public String getDocCode() {
		return _docCode;
	}

	public void setDocCode(String docCode) {
		_docCode = docCode;
	}

	public int getStatusDraft() {
		return _statusDraft;
	}

	public void setStatusDraft(int statusDraft) {
		_statusDraft = statusDraft;
	}

	public VLegalDraftDocument toEscapedModel() {
		if (isEscapedModel()) {
			return this;
		}
		else {
			return (VLegalDraftDocument)Proxy.newProxyInstance(VLegalDraftDocument.class.getClassLoader(),
				new Class[] { VLegalDraftDocument.class },
				new AutoEscapeBeanHandler(this));
		}
	}

	public Object clone() {
		VLegalDraftDocumentClp clone = new VLegalDraftDocumentClp();

		clone.setDraftId(getDraftId());
		clone.setGroupId(getGroupId());
		clone.setCompanyId(getCompanyId());
		clone.setUserId(getUserId());
		clone.setCreatedByUser(getCreatedByUser());
		clone.setCreatedDate(getCreatedDate());
		clone.setModifiedByUser(getModifiedByUser());
		clone.setModifiedDate(getModifiedDate());
		clone.setApprovedByUser(getApprovedByUser());
		clone.setApprovedDate(getApprovedDate());
		clone.setPublishedByUser(getPublishedByUser());
		clone.setPublishedDate(getPublishedDate());
		clone.setTitle(getTitle());
		clone.setExpiredDate(getExpiredDate());
		clone.setLanguage(getLanguage());
		clone.setContent(getContent());
		clone.setTypeId(getTypeId());
		clone.setFieldId(getFieldId());
		clone.setHasAttachment(getHasAttachment());
		clone.setDraftLevel(getDraftLevel());
		clone.setDocCode(getDocCode());
		clone.setStatusDraft(getStatusDraft());

		return clone;
	}

	public int compareTo(VLegalDraftDocument vLegalDraftDocument) {
		int value = 0;

		value = DateUtil.compareTo(getCreatedDate(),
				vLegalDraftDocument.getCreatedDate());

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

		VLegalDraftDocumentClp vLegalDraftDocument = null;

		try {
			vLegalDraftDocument = (VLegalDraftDocumentClp)obj;
		}
		catch (ClassCastException cce) {
			return false;
		}

		String pk = vLegalDraftDocument.getPrimaryKey();

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
		StringBundler sb = new StringBundler(45);

		sb.append("{draftId=");
		sb.append(getDraftId());
		sb.append(", groupId=");
		sb.append(getGroupId());
		sb.append(", companyId=");
		sb.append(getCompanyId());
		sb.append(", userId=");
		sb.append(getUserId());
		sb.append(", createdByUser=");
		sb.append(getCreatedByUser());
		sb.append(", createdDate=");
		sb.append(getCreatedDate());
		sb.append(", modifiedByUser=");
		sb.append(getModifiedByUser());
		sb.append(", modifiedDate=");
		sb.append(getModifiedDate());
		sb.append(", approvedByUser=");
		sb.append(getApprovedByUser());
		sb.append(", approvedDate=");
		sb.append(getApprovedDate());
		sb.append(", publishedByUser=");
		sb.append(getPublishedByUser());
		sb.append(", publishedDate=");
		sb.append(getPublishedDate());
		sb.append(", title=");
		sb.append(getTitle());
		sb.append(", expiredDate=");
		sb.append(getExpiredDate());
		sb.append(", language=");
		sb.append(getLanguage());
		sb.append(", content=");
		sb.append(getContent());
		sb.append(", typeId=");
		sb.append(getTypeId());
		sb.append(", fieldId=");
		sb.append(getFieldId());
		sb.append(", hasAttachment=");
		sb.append(getHasAttachment());
		sb.append(", draftLevel=");
		sb.append(getDraftLevel());
		sb.append(", docCode=");
		sb.append(getDocCode());
		sb.append(", statusDraft=");
		sb.append(getStatusDraft());
		sb.append("}");

		return sb.toString();
	}

	public String toXmlString() {
		StringBundler sb = new StringBundler(70);

		sb.append("<model><model-name>");
		sb.append("com.vportal.portlet.vlegal.model.VLegalDraftDocument");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>draftId</column-name><column-value><![CDATA[");
		sb.append(getDraftId());
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
			"<column><column-name>createdByUser</column-name><column-value><![CDATA[");
		sb.append(getCreatedByUser());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>createdDate</column-name><column-value><![CDATA[");
		sb.append(getCreatedDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>modifiedByUser</column-name><column-value><![CDATA[");
		sb.append(getModifiedByUser());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>modifiedDate</column-name><column-value><![CDATA[");
		sb.append(getModifiedDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>approvedByUser</column-name><column-value><![CDATA[");
		sb.append(getApprovedByUser());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>approvedDate</column-name><column-value><![CDATA[");
		sb.append(getApprovedDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>publishedByUser</column-name><column-value><![CDATA[");
		sb.append(getPublishedByUser());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>publishedDate</column-name><column-value><![CDATA[");
		sb.append(getPublishedDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>title</column-name><column-value><![CDATA[");
		sb.append(getTitle());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>expiredDate</column-name><column-value><![CDATA[");
		sb.append(getExpiredDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>language</column-name><column-value><![CDATA[");
		sb.append(getLanguage());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>content</column-name><column-value><![CDATA[");
		sb.append(getContent());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>typeId</column-name><column-value><![CDATA[");
		sb.append(getTypeId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>fieldId</column-name><column-value><![CDATA[");
		sb.append(getFieldId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>hasAttachment</column-name><column-value><![CDATA[");
		sb.append(getHasAttachment());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>draftLevel</column-name><column-value><![CDATA[");
		sb.append(getDraftLevel());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>docCode</column-name><column-value><![CDATA[");
		sb.append(getDocCode());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>statusDraft</column-name><column-value><![CDATA[");
		sb.append(getStatusDraft());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private String _draftId;
	private long _groupId;
	private long _companyId;
	private long _userId;
	private String _userUuid;
	private long _createdByUser;
	private Date _createdDate;
	private long _modifiedByUser;
	private Date _modifiedDate;
	private long _approvedByUser;
	private Date _approvedDate;
	private long _publishedByUser;
	private Date _publishedDate;
	private String _title;
	private Date _expiredDate;
	private String _language;
	private String _content;
	private String _typeId;
	private String _fieldId;
	private boolean _hasAttachment;
	private int _draftLevel;
	private String _docCode;
	private int _statusDraft;
}