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

package com.portlet.vdoc.model.impl;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.DateUtil;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.impl.BaseModelImpl;
import com.liferay.portal.util.PortalUtil;

import com.portlet.vdoc.model.vdocLogger;
import com.portlet.vdoc.model.vdocLoggerModel;
import com.portlet.vdoc.model.vdocLoggerSoap;

import java.io.Serializable;

import java.lang.reflect.Proxy;

import java.sql.Types;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * The base model implementation for the vdocLogger service. Represents a row in the &quot;vdocLogger&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link com.portlet.vdoc.model.vdocLoggerModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link vdocLoggerImpl}.
 * </p>
 *
 * <p>
 * Never modify or reference this class directly. All methods that expect a vdoc logger model instance should use the {@link com.portlet.vdoc.model.vdocLogger} interface instead.
 * </p>
 *
 * @author vinhnt
 * @see vdocLoggerImpl
 * @see com.portlet.vdoc.model.vdocLogger
 * @see com.portlet.vdoc.model.vdocLoggerModel
 * @generated
 */
public class vdocLoggerModelImpl extends BaseModelImpl<vdocLogger>
	implements vdocLoggerModel {
	public static final String TABLE_NAME = "vdocLogger";
	public static final Object[][] TABLE_COLUMNS = {
			{ "loggerId", new Integer(Types.VARCHAR) },
			{ "groupId", new Integer(Types.BIGINT) },
			{ "companyId", new Integer(Types.BIGINT) },
			{ "userId", new Integer(Types.BIGINT) },
			{ "createdDate", new Integer(Types.TIMESTAMP) },
			{ "createdByUser", new Integer(Types.BIGINT) },
			{ "content", new Integer(Types.VARCHAR) }
		};
	public static final String TABLE_SQL_CREATE = "create table vdocLogger (loggerId VARCHAR(75) not null primary key,groupId LONG,companyId LONG,userId LONG,createdDate DATE null,createdByUser LONG,content VARCHAR(75) null)";
	public static final String TABLE_SQL_DROP = "drop table vdocLogger";
	public static final String ORDER_BY_JPQL = " ORDER BY vdocLogger.createdDate DESC";
	public static final String ORDER_BY_SQL = " ORDER BY vdocLogger.createdDate DESC";
	public static final String DATA_SOURCE = "liferayDataSource";
	public static final String SESSION_FACTORY = "liferaySessionFactory";
	public static final String TX_MANAGER = "liferayTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.entity.cache.enabled.com.portlet.vdoc.model.vdocLogger"),
			true);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.finder.cache.enabled.com.portlet.vdoc.model.vdocLogger"),
			true);

	/**
	 * Converts the soap model instance into a normal model instance.
	 *
	 * @param soapModel the soap model instance to convert
	 * @return the normal model instance
	 */
	public static vdocLogger toModel(vdocLoggerSoap soapModel) {
		vdocLogger model = new vdocLoggerImpl();

		model.setLoggerId(soapModel.getLoggerId());
		model.setGroupId(soapModel.getGroupId());
		model.setCompanyId(soapModel.getCompanyId());
		model.setUserId(soapModel.getUserId());
		model.setCreatedDate(soapModel.getCreatedDate());
		model.setCreatedByUser(soapModel.getCreatedByUser());
		model.setContent(soapModel.getContent());

		return model;
	}

	/**
	 * Converts the soap model instances into normal model instances.
	 *
	 * @param soapModels the soap model instances to convert
	 * @return the normal model instances
	 */
	public static List<vdocLogger> toModels(vdocLoggerSoap[] soapModels) {
		List<vdocLogger> models = new ArrayList<vdocLogger>(soapModels.length);

		for (vdocLoggerSoap soapModel : soapModels) {
			models.add(toModel(soapModel));
		}

		return models;
	}

	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.util.service.ServiceProps.get(
				"lock.expiration.time.com.portlet.vdoc.model.vdocLogger"));

	public vdocLoggerModelImpl() {
	}

	public String getPrimaryKey() {
		return _loggerId;
	}

	public void setPrimaryKey(String pk) {
		setLoggerId(pk);
	}

	public Serializable getPrimaryKeyObj() {
		return _loggerId;
	}

	public String getLoggerId() {
		if (_loggerId == null) {
			return StringPool.BLANK;
		}
		else {
			return _loggerId;
		}
	}

	public void setLoggerId(String loggerId) {
		if (_originalLoggerId == null) {
			_originalLoggerId = _loggerId;
		}

		_loggerId = loggerId;
	}

	public String getOriginalLoggerId() {
		return GetterUtil.getString(_originalLoggerId);
	}

	public long getGroupId() {
		return _groupId;
	}

	public void setGroupId(long groupId) {
		if (!_setOriginalGroupId) {
			_setOriginalGroupId = true;

			_originalGroupId = _groupId;
		}

		_groupId = groupId;
	}

	public long getOriginalGroupId() {
		return _originalGroupId;
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

	public String getContent() {
		if (_content == null) {
			return StringPool.BLANK;
		}
		else {
			return _content;
		}
	}

	public void setContent(String content) {
		_content = content;
	}

	public vdocLogger toEscapedModel() {
		if (isEscapedModel()) {
			return (vdocLogger)this;
		}
		else {
			return (vdocLogger)Proxy.newProxyInstance(vdocLogger.class.getClassLoader(),
				new Class[] { vdocLogger.class },
				new AutoEscapeBeanHandler(this));
		}
	}

	public Object clone() {
		vdocLoggerImpl vdocLoggerImpl = new vdocLoggerImpl();

		vdocLoggerImpl.setLoggerId(getLoggerId());

		vdocLoggerModelImpl vdocLoggerModelImpl = vdocLoggerImpl;

		vdocLoggerModelImpl._originalLoggerId = vdocLoggerModelImpl._loggerId;

		vdocLoggerImpl.setGroupId(getGroupId());

		vdocLoggerModelImpl._originalGroupId = vdocLoggerModelImpl._groupId;

		vdocLoggerModelImpl._setOriginalGroupId = false;
		vdocLoggerImpl.setCompanyId(getCompanyId());

		vdocLoggerImpl.setUserId(getUserId());

		vdocLoggerImpl.setCreatedDate(getCreatedDate());

		vdocLoggerImpl.setCreatedByUser(getCreatedByUser());

		vdocLoggerImpl.setContent(getContent());

		return vdocLoggerImpl;
	}

	public int compareTo(vdocLogger vdocLogger) {
		int value = 0;

		value = DateUtil.compareTo(getCreatedDate(), vdocLogger.getCreatedDate());

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

		vdocLogger vdocLogger = null;

		try {
			vdocLogger = (vdocLogger)obj;
		}
		catch (ClassCastException cce) {
			return false;
		}

		String pk = vdocLogger.getPrimaryKey();

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
		StringBundler sb = new StringBundler(15);

		sb.append("{loggerId=");
		sb.append(getLoggerId());
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
		sb.append(", content=");
		sb.append(getContent());
		sb.append("}");

		return sb.toString();
	}

	public String toXmlString() {
		StringBundler sb = new StringBundler(25);

		sb.append("<model><model-name>");
		sb.append("com.portlet.vdoc.model.vdocLogger");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>loggerId</column-name><column-value><![CDATA[");
		sb.append(getLoggerId());
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
			"<column><column-name>content</column-name><column-value><![CDATA[");
		sb.append(getContent());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private String _loggerId;
	private String _originalLoggerId;
	private long _groupId;
	private long _originalGroupId;
	private boolean _setOriginalGroupId;
	private long _companyId;
	private long _userId;
	private String _userUuid;
	private Date _createdDate;
	private long _createdByUser;
	private String _content;
}