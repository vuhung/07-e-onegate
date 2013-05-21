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
public class VLegalDocumentClp extends BaseModelImpl<VLegalDocument>
	implements VLegalDocument {
	public VLegalDocumentClp() {
	}

	public String getPrimaryKey() {
		return _docId;
	}

	public void setPrimaryKey(String pk) {
		setDocId(pk);
	}

	public Serializable getPrimaryKeyObj() {
		return _docId;
	}

	public String getDocId() {
		return _docId;
	}

	public void setDocId(String docId) {
		_docId = docId;
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

	public long getForwardedByUser() {
		return _forwardedByUser;
	}

	public void setForwardedByUser(long forwardedByUser) {
		_forwardedByUser = forwardedByUser;
	}

	public Date getForwardedDate() {
		return _forwardedDate;
	}

	public void setForwardedDate(Date forwardedDate) {
		_forwardedDate = forwardedDate;
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

	public String getSymbol() {
		return _symbol;
	}

	public void setSymbol(String symbol) {
		_symbol = symbol;
	}

	public String getNum() {
		return _num;
	}

	public void setNum(String num) {
		_num = num;
	}

	public Date getPromulDate() {
		return _promulDate;
	}

	public void setPromulDate(Date promulDate) {
		_promulDate = promulDate;
	}

	public Date getEffectivedDate() {
		return _effectivedDate;
	}

	public void setEffectivedDate(Date effectivedDate) {
		_effectivedDate = effectivedDate;
	}

	public Date getExpiredDate() {
		return _expiredDate;
	}

	public void setExpiredDate(Date expiredDate) {
		_expiredDate = expiredDate;
	}

	public String getReplaceDoc() {
		return _replaceDoc;
	}

	public void setReplaceDoc(String replaceDoc) {
		_replaceDoc = replaceDoc;
	}

	public String getSummary() {
		return _summary;
	}

	public void setSummary(String summary) {
		_summary = summary;
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

	public int getUserHit() {
		return _userHit;
	}

	public void setUserHit(int userHit) {
		_userHit = userHit;
	}

	public int getStatusDoc() {
		return _statusDoc;
	}

	public void setStatusDoc(int statusDoc) {
		_statusDoc = statusDoc;
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

	public String getTypeDocId() {
		return _typeDocId;
	}

	public void setTypeDocId(String typeDocId) {
		_typeDocId = typeDocId;
	}

	public String getFieldId() {
		return _fieldId;
	}

	public void setFieldId(String fieldId) {
		_fieldId = fieldId;
	}

	public String getOrgId() {
		return _orgId;
	}

	public void setOrgId(String orgId) {
		_orgId = orgId;
	}

	public String getOrgRels() {
		return _orgRels;
	}

	public void setOrgRels(String orgRels) {
		_orgRels = orgRels;
	}

	public String getSignerRels() {
		return _signerRels;
	}

	public void setSignerRels(String signerRels) {
		_signerRels = signerRels;
	}

	public String getFieldRels() {
		return _fieldRels;
	}

	public void setFieldRels(String fieldRels) {
		_fieldRels = fieldRels;
	}

	public String getNumRels() {
		return _numRels;
	}

	public void setNumRels(String numRels) {
		_numRels = numRels;
	}

	public String getDocCode() {
		return _docCode;
	}

	public void setDocCode(String docCode) {
		_docCode = docCode;
	}

	public String getDepartmentRels() {
		return _departmentRels;
	}

	public void setDepartmentRels(String departmentRels) {
		_departmentRels = departmentRels;
	}

	public java.lang.String getVlegalDocumentIdString() {
		throw new UnsupportedOperationException();
	}

	public void setVlegalDocumentIdString(
		java.lang.String vlegalDocumentIdString) {
		throw new UnsupportedOperationException();
	}

	public boolean isExpired() {
		throw new UnsupportedOperationException();
	}

	public VLegalDocument toEscapedModel() {
		if (isEscapedModel()) {
			return this;
		}
		else {
			return (VLegalDocument)Proxy.newProxyInstance(VLegalDocument.class.getClassLoader(),
				new Class[] { VLegalDocument.class },
				new AutoEscapeBeanHandler(this));
		}
	}

	public Object clone() {
		VLegalDocumentClp clone = new VLegalDocumentClp();

		clone.setDocId(getDocId());
		clone.setGroupId(getGroupId());
		clone.setCompanyId(getCompanyId());
		clone.setUserId(getUserId());
		clone.setCreatedByUser(getCreatedByUser());
		clone.setCreatedDate(getCreatedDate());
		clone.setModifiedByUser(getModifiedByUser());
		clone.setModifiedDate(getModifiedDate());
		clone.setApprovedByUser(getApprovedByUser());
		clone.setApprovedDate(getApprovedDate());
		clone.setForwardedByUser(getForwardedByUser());
		clone.setForwardedDate(getForwardedDate());
		clone.setPublishedByUser(getPublishedByUser());
		clone.setPublishedDate(getPublishedDate());
		clone.setSymbol(getSymbol());
		clone.setNum(getNum());
		clone.setPromulDate(getPromulDate());
		clone.setEffectivedDate(getEffectivedDate());
		clone.setExpiredDate(getExpiredDate());
		clone.setReplaceDoc(getReplaceDoc());
		clone.setSummary(getSummary());
		clone.setContent(getContent());
		clone.setLanguage(getLanguage());
		clone.setUserHit(getUserHit());
		clone.setStatusDoc(getStatusDoc());
		clone.setHasAttachment(getHasAttachment());
		clone.setTypeDocId(getTypeDocId());
		clone.setFieldId(getFieldId());
		clone.setOrgId(getOrgId());
		clone.setOrgRels(getOrgRels());
		clone.setSignerRels(getSignerRels());
		clone.setFieldRels(getFieldRels());
		clone.setNumRels(getNumRels());
		clone.setDocCode(getDocCode());
		clone.setDepartmentRels(getDepartmentRels());

		return clone;
	}

	public int compareTo(VLegalDocument vLegalDocument) {
		int value = 0;

		value = DateUtil.compareTo(getPromulDate(),
				vLegalDocument.getPromulDate());

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

		VLegalDocumentClp vLegalDocument = null;

		try {
			vLegalDocument = (VLegalDocumentClp)obj;
		}
		catch (ClassCastException cce) {
			return false;
		}

		String pk = vLegalDocument.getPrimaryKey();

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
		StringBundler sb = new StringBundler(71);

		sb.append("{docId=");
		sb.append(getDocId());
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
		sb.append(", forwardedByUser=");
		sb.append(getForwardedByUser());
		sb.append(", forwardedDate=");
		sb.append(getForwardedDate());
		sb.append(", publishedByUser=");
		sb.append(getPublishedByUser());
		sb.append(", publishedDate=");
		sb.append(getPublishedDate());
		sb.append(", symbol=");
		sb.append(getSymbol());
		sb.append(", num=");
		sb.append(getNum());
		sb.append(", promulDate=");
		sb.append(getPromulDate());
		sb.append(", effectivedDate=");
		sb.append(getEffectivedDate());
		sb.append(", expiredDate=");
		sb.append(getExpiredDate());
		sb.append(", replaceDoc=");
		sb.append(getReplaceDoc());
		sb.append(", summary=");
		sb.append(getSummary());
		sb.append(", content=");
		sb.append(getContent());
		sb.append(", language=");
		sb.append(getLanguage());
		sb.append(", userHit=");
		sb.append(getUserHit());
		sb.append(", statusDoc=");
		sb.append(getStatusDoc());
		sb.append(", hasAttachment=");
		sb.append(getHasAttachment());
		sb.append(", typeDocId=");
		sb.append(getTypeDocId());
		sb.append(", fieldId=");
		sb.append(getFieldId());
		sb.append(", orgId=");
		sb.append(getOrgId());
		sb.append(", orgRels=");
		sb.append(getOrgRels());
		sb.append(", signerRels=");
		sb.append(getSignerRels());
		sb.append(", fieldRels=");
		sb.append(getFieldRels());
		sb.append(", numRels=");
		sb.append(getNumRels());
		sb.append(", docCode=");
		sb.append(getDocCode());
		sb.append(", departmentRels=");
		sb.append(getDepartmentRels());
		sb.append("}");

		return sb.toString();
	}

	public String toXmlString() {
		StringBundler sb = new StringBundler(109);

		sb.append("<model><model-name>");
		sb.append("com.vportal.portlet.vlegal.model.VLegalDocument");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>docId</column-name><column-value><![CDATA[");
		sb.append(getDocId());
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
			"<column><column-name>forwardedByUser</column-name><column-value><![CDATA[");
		sb.append(getForwardedByUser());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>forwardedDate</column-name><column-value><![CDATA[");
		sb.append(getForwardedDate());
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
			"<column><column-name>symbol</column-name><column-value><![CDATA[");
		sb.append(getSymbol());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>num</column-name><column-value><![CDATA[");
		sb.append(getNum());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>promulDate</column-name><column-value><![CDATA[");
		sb.append(getPromulDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>effectivedDate</column-name><column-value><![CDATA[");
		sb.append(getEffectivedDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>expiredDate</column-name><column-value><![CDATA[");
		sb.append(getExpiredDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>replaceDoc</column-name><column-value><![CDATA[");
		sb.append(getReplaceDoc());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>summary</column-name><column-value><![CDATA[");
		sb.append(getSummary());
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
			"<column><column-name>userHit</column-name><column-value><![CDATA[");
		sb.append(getUserHit());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>statusDoc</column-name><column-value><![CDATA[");
		sb.append(getStatusDoc());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>hasAttachment</column-name><column-value><![CDATA[");
		sb.append(getHasAttachment());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>typeDocId</column-name><column-value><![CDATA[");
		sb.append(getTypeDocId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>fieldId</column-name><column-value><![CDATA[");
		sb.append(getFieldId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>orgId</column-name><column-value><![CDATA[");
		sb.append(getOrgId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>orgRels</column-name><column-value><![CDATA[");
		sb.append(getOrgRels());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>signerRels</column-name><column-value><![CDATA[");
		sb.append(getSignerRels());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>fieldRels</column-name><column-value><![CDATA[");
		sb.append(getFieldRels());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>numRels</column-name><column-value><![CDATA[");
		sb.append(getNumRels());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>docCode</column-name><column-value><![CDATA[");
		sb.append(getDocCode());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>departmentRels</column-name><column-value><![CDATA[");
		sb.append(getDepartmentRels());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private String _docId;
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
	private long _forwardedByUser;
	private Date _forwardedDate;
	private long _publishedByUser;
	private Date _publishedDate;
	private String _symbol;
	private String _num;
	private Date _promulDate;
	private Date _effectivedDate;
	private Date _expiredDate;
	private String _replaceDoc;
	private String _summary;
	private String _content;
	private String _language;
	private int _userHit;
	private int _statusDoc;
	private boolean _hasAttachment;
	private String _typeDocId;
	private String _fieldId;
	private String _orgId;
	private String _orgRels;
	private String _signerRels;
	private String _fieldRels;
	private String _numRels;
	private String _docCode;
	private String _departmentRels;
}