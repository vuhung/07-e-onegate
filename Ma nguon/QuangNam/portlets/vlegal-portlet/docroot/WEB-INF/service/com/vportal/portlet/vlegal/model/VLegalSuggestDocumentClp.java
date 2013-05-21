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
public class VLegalSuggestDocumentClp extends BaseModelImpl<VLegalSuggestDocument>
	implements VLegalSuggestDocument {
	public VLegalSuggestDocumentClp() {
	}

	public String getPrimaryKey() {
		return _sugId;
	}

	public void setPrimaryKey(String pk) {
		setSugId(pk);
	}

	public Serializable getPrimaryKeyObj() {
		return _sugId;
	}

	public String getSugId() {
		return _sugId;
	}

	public void setSugId(String sugId) {
		_sugId = sugId;
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

	public Date getModifiedDate() {
		return _modifiedDate;
	}

	public void setModifiedDate(Date modifiedDate) {
		_modifiedDate = modifiedDate;
	}

	public long getModifiedByUser() {
		return _modifiedByUser;
	}

	public void setModifiedByUser(long modifiedByUser) {
		_modifiedByUser = modifiedByUser;
	}

	public boolean getApproved() {
		return _approved;
	}

	public boolean isApproved() {
		return _approved;
	}

	public void setApproved(boolean approved) {
		_approved = approved;
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

	public String getTitle() {
		return _title;
	}

	public void setTitle(String title) {
		_title = title;
	}

	public String getContent() {
		return _content;
	}

	public void setContent(String content) {
		_content = content;
	}

	public String getLanguage() {
		return _language;
	}

	public void setLanguage(String language) {
		_language = language;
	}

	public String getVisitorName() {
		return _visitorName;
	}

	public void setVisitorName(String visitorName) {
		_visitorName = visitorName;
	}

	public String getVisitorEmail() {
		return _visitorEmail;
	}

	public void setVisitorEmail(String visitorEmail) {
		_visitorEmail = visitorEmail;
	}

	public String getVisitorTel() {
		return _visitorTel;
	}

	public void setVisitorTel(String visitorTel) {
		_visitorTel = visitorTel;
	}

	public String getVisitorAddress() {
		return _visitorAddress;
	}

	public void setVisitorAddress(String visitorAddress) {
		_visitorAddress = visitorAddress;
	}

	public String getDraftId() {
		return _draftId;
	}

	public void setDraftId(String draftId) {
		_draftId = draftId;
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

	public VLegalSuggestDocument toEscapedModel() {
		if (isEscapedModel()) {
			return this;
		}
		else {
			return (VLegalSuggestDocument)Proxy.newProxyInstance(VLegalSuggestDocument.class.getClassLoader(),
				new Class[] { VLegalSuggestDocument.class },
				new AutoEscapeBeanHandler(this));
		}
	}

	public Object clone() {
		VLegalSuggestDocumentClp clone = new VLegalSuggestDocumentClp();

		clone.setSugId(getSugId());
		clone.setGroupId(getGroupId());
		clone.setCompanyId(getCompanyId());
		clone.setUserId(getUserId());
		clone.setCreatedDate(getCreatedDate());
		clone.setModifiedDate(getModifiedDate());
		clone.setModifiedByUser(getModifiedByUser());
		clone.setApproved(getApproved());
		clone.setApprovedByUser(getApprovedByUser());
		clone.setApprovedDate(getApprovedDate());
		clone.setTitle(getTitle());
		clone.setContent(getContent());
		clone.setLanguage(getLanguage());
		clone.setVisitorName(getVisitorName());
		clone.setVisitorEmail(getVisitorEmail());
		clone.setVisitorTel(getVisitorTel());
		clone.setVisitorAddress(getVisitorAddress());
		clone.setDraftId(getDraftId());
		clone.setHasAttachment(getHasAttachment());

		return clone;
	}

	public int compareTo(VLegalSuggestDocument vLegalSuggestDocument) {
		int value = 0;

		value = DateUtil.compareTo(getCreatedDate(),
				vLegalSuggestDocument.getCreatedDate());

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

		VLegalSuggestDocumentClp vLegalSuggestDocument = null;

		try {
			vLegalSuggestDocument = (VLegalSuggestDocumentClp)obj;
		}
		catch (ClassCastException cce) {
			return false;
		}

		String pk = vLegalSuggestDocument.getPrimaryKey();

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
		StringBundler sb = new StringBundler(39);

		sb.append("{sugId=");
		sb.append(getSugId());
		sb.append(", groupId=");
		sb.append(getGroupId());
		sb.append(", companyId=");
		sb.append(getCompanyId());
		sb.append(", userId=");
		sb.append(getUserId());
		sb.append(", createdDate=");
		sb.append(getCreatedDate());
		sb.append(", modifiedDate=");
		sb.append(getModifiedDate());
		sb.append(", modifiedByUser=");
		sb.append(getModifiedByUser());
		sb.append(", approved=");
		sb.append(getApproved());
		sb.append(", approvedByUser=");
		sb.append(getApprovedByUser());
		sb.append(", approvedDate=");
		sb.append(getApprovedDate());
		sb.append(", title=");
		sb.append(getTitle());
		sb.append(", content=");
		sb.append(getContent());
		sb.append(", language=");
		sb.append(getLanguage());
		sb.append(", visitorName=");
		sb.append(getVisitorName());
		sb.append(", visitorEmail=");
		sb.append(getVisitorEmail());
		sb.append(", visitorTel=");
		sb.append(getVisitorTel());
		sb.append(", visitorAddress=");
		sb.append(getVisitorAddress());
		sb.append(", draftId=");
		sb.append(getDraftId());
		sb.append(", hasAttachment=");
		sb.append(getHasAttachment());
		sb.append("}");

		return sb.toString();
	}

	public String toXmlString() {
		StringBundler sb = new StringBundler(61);

		sb.append("<model><model-name>");
		sb.append("com.vportal.portlet.vlegal.model.VLegalSuggestDocument");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>sugId</column-name><column-value><![CDATA[");
		sb.append(getSugId());
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
			"<column><column-name>modifiedDate</column-name><column-value><![CDATA[");
		sb.append(getModifiedDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>modifiedByUser</column-name><column-value><![CDATA[");
		sb.append(getModifiedByUser());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>approved</column-name><column-value><![CDATA[");
		sb.append(getApproved());
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
			"<column><column-name>title</column-name><column-value><![CDATA[");
		sb.append(getTitle());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>content</column-name><column-value><![CDATA[");
		sb.append(getContent());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>language</column-name><column-value><![CDATA[");
		sb.append(getLanguage());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>visitorName</column-name><column-value><![CDATA[");
		sb.append(getVisitorName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>visitorEmail</column-name><column-value><![CDATA[");
		sb.append(getVisitorEmail());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>visitorTel</column-name><column-value><![CDATA[");
		sb.append(getVisitorTel());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>visitorAddress</column-name><column-value><![CDATA[");
		sb.append(getVisitorAddress());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>draftId</column-name><column-value><![CDATA[");
		sb.append(getDraftId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>hasAttachment</column-name><column-value><![CDATA[");
		sb.append(getHasAttachment());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private String _sugId;
	private long _groupId;
	private long _companyId;
	private long _userId;
	private String _userUuid;
	private Date _createdDate;
	private Date _modifiedDate;
	private long _modifiedByUser;
	private boolean _approved;
	private long _approvedByUser;
	private Date _approvedDate;
	private String _title;
	private String _content;
	private String _language;
	private String _visitorName;
	private String _visitorEmail;
	private String _visitorTel;
	private String _visitorAddress;
	private String _draftId;
	private boolean _hasAttachment;
}