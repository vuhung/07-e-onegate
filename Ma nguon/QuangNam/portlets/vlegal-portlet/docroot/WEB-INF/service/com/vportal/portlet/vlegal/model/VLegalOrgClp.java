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
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.impl.BaseModelImpl;
import com.liferay.portal.util.PortalUtil;

import java.io.Serializable;

import java.lang.reflect.Proxy;

import java.util.Date;

/**
 * @author ACB
 */
public class VLegalOrgClp extends BaseModelImpl<VLegalOrg> implements VLegalOrg {
	public VLegalOrgClp() {
	}

	public String getPrimaryKey() {
		return _orgId;
	}

	public void setPrimaryKey(String pk) {
		setOrgId(pk);
	}

	public Serializable getPrimaryKeyObj() {
		return _orgId;
	}

	public String getOrgId() {
		return _orgId;
	}

	public void setOrgId(String orgId) {
		_orgId = orgId;
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

	public long getCreatedByUser() {
		return _createdByUser;
	}

	public void setCreatedByUser(long createdByUser) {
		_createdByUser = createdByUser;
	}

	public long getModifiedByUser() {
		return _modifiedByUser;
	}

	public void setModifiedByUser(long modifiedByUser) {
		_modifiedByUser = modifiedByUser;
	}

	public String getName() {
		return _name;
	}

	public void setName(String name) {
		_name = name;
	}

	public String getDescription() {
		return _description;
	}

	public void setDescription(String description) {
		_description = description;
	}

	public String getParentId() {
		return _parentId;
	}

	public void setParentId(String parentId) {
		_parentId = parentId;
	}

	public String getLanguage() {
		return _language;
	}

	public void setLanguage(String language) {
		_language = language;
	}

	public boolean getStatusOrg() {
		return _statusOrg;
	}

	public boolean isStatusOrg() {
		return _statusOrg;
	}

	public void setStatusOrg(boolean statusOrg) {
		_statusOrg = statusOrg;
	}

	public boolean getRssable() {
		return _rssable;
	}

	public boolean isRssable() {
		return _rssable;
	}

	public void setRssable(boolean rssable) {
		_rssable = rssable;
	}

	public int getPosition() {
		return _position;
	}

	public void setPosition(int position) {
		_position = position;
	}

	public VLegalOrg toEscapedModel() {
		if (isEscapedModel()) {
			return this;
		}
		else {
			return (VLegalOrg)Proxy.newProxyInstance(VLegalOrg.class.getClassLoader(),
				new Class[] { VLegalOrg.class }, new AutoEscapeBeanHandler(this));
		}
	}

	public Object clone() {
		VLegalOrgClp clone = new VLegalOrgClp();

		clone.setOrgId(getOrgId());
		clone.setGroupId(getGroupId());
		clone.setCompanyId(getCompanyId());
		clone.setUserId(getUserId());
		clone.setCreatedDate(getCreatedDate());
		clone.setModifiedDate(getModifiedDate());
		clone.setCreatedByUser(getCreatedByUser());
		clone.setModifiedByUser(getModifiedByUser());
		clone.setName(getName());
		clone.setDescription(getDescription());
		clone.setParentId(getParentId());
		clone.setLanguage(getLanguage());
		clone.setStatusOrg(getStatusOrg());
		clone.setRssable(getRssable());
		clone.setPosition(getPosition());

		return clone;
	}

	public int compareTo(VLegalOrg vLegalOrg) {
		int value = 0;

		if (getPosition() < vLegalOrg.getPosition()) {
			value = -1;
		}
		else if (getPosition() > vLegalOrg.getPosition()) {
			value = 1;
		}
		else {
			value = 0;
		}

		if (value != 0) {
			return value;
		}

		return 0;
	}

	public boolean equals(Object obj) {
		if (obj == null) {
			return false;
		}

		VLegalOrgClp vLegalOrg = null;

		try {
			vLegalOrg = (VLegalOrgClp)obj;
		}
		catch (ClassCastException cce) {
			return false;
		}

		String pk = vLegalOrg.getPrimaryKey();

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
		StringBundler sb = new StringBundler(31);

		sb.append("{orgId=");
		sb.append(getOrgId());
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
		sb.append(", createdByUser=");
		sb.append(getCreatedByUser());
		sb.append(", modifiedByUser=");
		sb.append(getModifiedByUser());
		sb.append(", name=");
		sb.append(getName());
		sb.append(", description=");
		sb.append(getDescription());
		sb.append(", parentId=");
		sb.append(getParentId());
		sb.append(", language=");
		sb.append(getLanguage());
		sb.append(", statusOrg=");
		sb.append(getStatusOrg());
		sb.append(", rssable=");
		sb.append(getRssable());
		sb.append(", position=");
		sb.append(getPosition());
		sb.append("}");

		return sb.toString();
	}

	public String toXmlString() {
		StringBundler sb = new StringBundler(49);

		sb.append("<model><model-name>");
		sb.append("com.vportal.portlet.vlegal.model.VLegalOrg");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>orgId</column-name><column-value><![CDATA[");
		sb.append(getOrgId());
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
			"<column><column-name>createdByUser</column-name><column-value><![CDATA[");
		sb.append(getCreatedByUser());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>modifiedByUser</column-name><column-value><![CDATA[");
		sb.append(getModifiedByUser());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>name</column-name><column-value><![CDATA[");
		sb.append(getName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>description</column-name><column-value><![CDATA[");
		sb.append(getDescription());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>parentId</column-name><column-value><![CDATA[");
		sb.append(getParentId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>language</column-name><column-value><![CDATA[");
		sb.append(getLanguage());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>statusOrg</column-name><column-value><![CDATA[");
		sb.append(getStatusOrg());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>rssable</column-name><column-value><![CDATA[");
		sb.append(getRssable());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>position</column-name><column-value><![CDATA[");
		sb.append(getPosition());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private String _orgId;
	private long _groupId;
	private long _companyId;
	private long _userId;
	private String _userUuid;
	private Date _createdDate;
	private Date _modifiedDate;
	private long _createdByUser;
	private long _modifiedByUser;
	private String _name;
	private String _description;
	private String _parentId;
	private String _language;
	private boolean _statusOrg;
	private boolean _rssable;
	private int _position;
}