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

package com.vportal.portlet.vsearch.model.impl;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.impl.BaseModelImpl;
import com.liferay.portal.service.ServiceContext;
import com.liferay.portal.util.PortalUtil;

import com.liferay.portlet.expando.model.ExpandoBridge;
import com.liferay.portlet.expando.util.ExpandoBridgeFactoryUtil;

import com.vportal.portlet.vsearch.model.VConfigSearch;
import com.vportal.portlet.vsearch.model.VConfigSearchModel;
import com.vportal.portlet.vsearch.model.VConfigSearchSoap;

import java.io.Serializable;

import java.lang.reflect.Proxy;

import java.sql.Types;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * The base model implementation for the VConfigSearch service. Represents a row in the &quot;VConfigSearch_VConfigSearch&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link com.vportal.portlet.vsearch.model.VConfigSearchModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link VConfigSearchImpl}.
 * </p>
 *
 * <p>
 * Never modify or reference this class directly. All methods that expect a v config search model instance should use the {@link com.vportal.portlet.vsearch.model.VConfigSearch} interface instead.
 * </p>
 *
 * @author Ba
 * @see VConfigSearchImpl
 * @see com.vportal.portlet.vsearch.model.VConfigSearch
 * @see com.vportal.portlet.vsearch.model.VConfigSearchModel
 * @generated
 */
public class VConfigSearchModelImpl extends BaseModelImpl<VConfigSearch>
	implements VConfigSearchModel {
	public static final String TABLE_NAME = "VConfigSearch_VConfigSearch";
	public static final Object[][] TABLE_COLUMNS = {
			{ "confisearchId", new Integer(Types.BIGINT) },
			{ "groupId", new Integer(Types.BIGINT) },
			{ "companyId", new Integer(Types.BIGINT) },
			{ "userId", new Integer(Types.BIGINT) },
			{ "userName", new Integer(Types.VARCHAR) },
			{ "createDate", new Integer(Types.TIMESTAMP) },
			{ "modifiedDate", new Integer(Types.TIMESTAMP) },
			{ "modifiedByUser", new Integer(Types.VARCHAR) },
			{ "languageId", new Integer(Types.VARCHAR) },
			{ "layoutId", new Integer(Types.BIGINT) },
			{ "portletId", new Integer(Types.VARCHAR) },
			{ "portleturl", new Integer(Types.VARCHAR) }
		};
	public static final String TABLE_SQL_CREATE = "create table VConfigSearch_VConfigSearch (confisearchId LONG not null primary key,groupId LONG,companyId LONG,userId LONG,userName VARCHAR(75) null,createDate DATE null,modifiedDate DATE null,modifiedByUser VARCHAR(75) null,languageId VARCHAR(75) null,layoutId LONG,portletId VARCHAR(75) null,portleturl VARCHAR(75) null)";
	public static final String TABLE_SQL_DROP = "drop table VConfigSearch_VConfigSearch";
	public static final String ORDER_BY_JPQL = " ORDER BY vConfigSearch.portletId ASC";
	public static final String ORDER_BY_SQL = " ORDER BY VConfigSearch_VConfigSearch.portletId ASC";
	public static final String DATA_SOURCE = "liferayDataSource";
	public static final String SESSION_FACTORY = "liferaySessionFactory";
	public static final String TX_MANAGER = "liferayTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.entity.cache.enabled.com.vportal.portlet.vsearch.model.VConfigSearch"),
			true);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.finder.cache.enabled.com.vportal.portlet.vsearch.model.VConfigSearch"),
			true);

	/**
	 * Converts the soap model instance into a normal model instance.
	 *
	 * @param soapModel the soap model instance to convert
	 * @return the normal model instance
	 */
	public static VConfigSearch toModel(VConfigSearchSoap soapModel) {
		VConfigSearch model = new VConfigSearchImpl();

		model.setConfisearchId(soapModel.getConfisearchId());
		model.setGroupId(soapModel.getGroupId());
		model.setCompanyId(soapModel.getCompanyId());
		model.setUserId(soapModel.getUserId());
		model.setUserName(soapModel.getUserName());
		model.setCreateDate(soapModel.getCreateDate());
		model.setModifiedDate(soapModel.getModifiedDate());
		model.setModifiedByUser(soapModel.getModifiedByUser());
		model.setLanguageId(soapModel.getLanguageId());
		model.setLayoutId(soapModel.getLayoutId());
		model.setPortletId(soapModel.getPortletId());
		model.setPortleturl(soapModel.getPortleturl());

		return model;
	}

	/**
	 * Converts the soap model instances into normal model instances.
	 *
	 * @param soapModels the soap model instances to convert
	 * @return the normal model instances
	 */
	public static List<VConfigSearch> toModels(VConfigSearchSoap[] soapModels) {
		List<VConfigSearch> models = new ArrayList<VConfigSearch>(soapModels.length);

		for (VConfigSearchSoap soapModel : soapModels) {
			models.add(toModel(soapModel));
		}

		return models;
	}

	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.util.service.ServiceProps.get(
				"lock.expiration.time.com.vportal.portlet.vsearch.model.VConfigSearch"));

	public VConfigSearchModelImpl() {
	}

	public long getPrimaryKey() {
		return _confisearchId;
	}

	public void setPrimaryKey(long pk) {
		setConfisearchId(pk);
	}

	public Serializable getPrimaryKeyObj() {
		return new Long(_confisearchId);
	}

	public long getConfisearchId() {
		return _confisearchId;
	}

	public void setConfisearchId(long confisearchId) {
		_confisearchId = confisearchId;
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

	public String getUserName() {
		if (_userName == null) {
			return StringPool.BLANK;
		}
		else {
			return _userName;
		}
	}

	public void setUserName(String userName) {
		_userName = userName;
	}

	public Date getCreateDate() {
		return _createDate;
	}

	public void setCreateDate(Date createDate) {
		_createDate = createDate;
	}

	public Date getModifiedDate() {
		return _modifiedDate;
	}

	public void setModifiedDate(Date modifiedDate) {
		_modifiedDate = modifiedDate;
	}

	public String getModifiedByUser() {
		if (_modifiedByUser == null) {
			return StringPool.BLANK;
		}
		else {
			return _modifiedByUser;
		}
	}

	public void setModifiedByUser(String modifiedByUser) {
		_modifiedByUser = modifiedByUser;
	}

	public String getLanguageId() {
		if (_languageId == null) {
			return StringPool.BLANK;
		}
		else {
			return _languageId;
		}
	}

	public void setLanguageId(String languageId) {
		_languageId = languageId;
	}

	public long getLayoutId() {
		return _layoutId;
	}

	public void setLayoutId(long layoutId) {
		_layoutId = layoutId;
	}

	public String getPortletId() {
		if (_portletId == null) {
			return StringPool.BLANK;
		}
		else {
			return _portletId;
		}
	}

	public void setPortletId(String portletId) {
		if (_originalPortletId == null) {
			_originalPortletId = _portletId;
		}

		_portletId = portletId;
	}

	public String getOriginalPortletId() {
		return GetterUtil.getString(_originalPortletId);
	}

	public String getPortleturl() {
		if (_portleturl == null) {
			return StringPool.BLANK;
		}
		else {
			return _portleturl;
		}
	}

	public void setPortleturl(String portleturl) {
		_portleturl = portleturl;
	}

	public VConfigSearch toEscapedModel() {
		if (isEscapedModel()) {
			return (VConfigSearch)this;
		}
		else {
			return (VConfigSearch)Proxy.newProxyInstance(VConfigSearch.class.getClassLoader(),
				new Class[] { VConfigSearch.class },
				new AutoEscapeBeanHandler(this));
		}
	}

	public ExpandoBridge getExpandoBridge() {
		if (_expandoBridge == null) {
			_expandoBridge = ExpandoBridgeFactoryUtil.getExpandoBridge(getCompanyId(),
					VConfigSearch.class.getName(), getPrimaryKey());
		}

		return _expandoBridge;
	}

	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		getExpandoBridge().setAttributes(serviceContext);
	}

	public Object clone() {
		VConfigSearchImpl vConfigSearchImpl = new VConfigSearchImpl();

		vConfigSearchImpl.setConfisearchId(getConfisearchId());

		vConfigSearchImpl.setGroupId(getGroupId());

		VConfigSearchModelImpl vConfigSearchModelImpl = vConfigSearchImpl;

		vConfigSearchModelImpl._originalGroupId = vConfigSearchModelImpl._groupId;

		vConfigSearchModelImpl._setOriginalGroupId = false;
		vConfigSearchImpl.setCompanyId(getCompanyId());

		vConfigSearchImpl.setUserId(getUserId());

		vConfigSearchImpl.setUserName(getUserName());

		vConfigSearchImpl.setCreateDate(getCreateDate());

		vConfigSearchImpl.setModifiedDate(getModifiedDate());

		vConfigSearchImpl.setModifiedByUser(getModifiedByUser());

		vConfigSearchImpl.setLanguageId(getLanguageId());

		vConfigSearchImpl.setLayoutId(getLayoutId());

		vConfigSearchImpl.setPortletId(getPortletId());

		vConfigSearchModelImpl._originalPortletId = vConfigSearchModelImpl._portletId;

		vConfigSearchImpl.setPortleturl(getPortleturl());

		return vConfigSearchImpl;
	}

	public int compareTo(VConfigSearch vConfigSearch) {
		int value = 0;

		value = getPortletId().toLowerCase()
					.compareTo(vConfigSearch.getPortletId().toLowerCase());

		if (value != 0) {
			return value;
		}

		return 0;
	}

	public boolean equals(Object obj) {
		if (obj == null) {
			return false;
		}

		VConfigSearch vConfigSearch = null;

		try {
			vConfigSearch = (VConfigSearch)obj;
		}
		catch (ClassCastException cce) {
			return false;
		}

		long pk = vConfigSearch.getPrimaryKey();

		if (getPrimaryKey() == pk) {
			return true;
		}
		else {
			return false;
		}
	}

	public int hashCode() {
		return (int)getPrimaryKey();
	}

	public String toString() {
		StringBundler sb = new StringBundler(25);

		sb.append("{confisearchId=");
		sb.append(getConfisearchId());
		sb.append(", groupId=");
		sb.append(getGroupId());
		sb.append(", companyId=");
		sb.append(getCompanyId());
		sb.append(", userId=");
		sb.append(getUserId());
		sb.append(", userName=");
		sb.append(getUserName());
		sb.append(", createDate=");
		sb.append(getCreateDate());
		sb.append(", modifiedDate=");
		sb.append(getModifiedDate());
		sb.append(", modifiedByUser=");
		sb.append(getModifiedByUser());
		sb.append(", languageId=");
		sb.append(getLanguageId());
		sb.append(", layoutId=");
		sb.append(getLayoutId());
		sb.append(", portletId=");
		sb.append(getPortletId());
		sb.append(", portleturl=");
		sb.append(getPortleturl());
		sb.append("}");

		return sb.toString();
	}

	public String toXmlString() {
		StringBundler sb = new StringBundler(40);

		sb.append("<model><model-name>");
		sb.append("com.vportal.portlet.vsearch.model.VConfigSearch");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>confisearchId</column-name><column-value><![CDATA[");
		sb.append(getConfisearchId());
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
			"<column><column-name>userName</column-name><column-value><![CDATA[");
		sb.append(getUserName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>createDate</column-name><column-value><![CDATA[");
		sb.append(getCreateDate());
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
			"<column><column-name>languageId</column-name><column-value><![CDATA[");
		sb.append(getLanguageId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>layoutId</column-name><column-value><![CDATA[");
		sb.append(getLayoutId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>portletId</column-name><column-value><![CDATA[");
		sb.append(getPortletId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>portleturl</column-name><column-value><![CDATA[");
		sb.append(getPortleturl());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _confisearchId;
	private long _groupId;
	private long _originalGroupId;
	private boolean _setOriginalGroupId;
	private long _companyId;
	private long _userId;
	private String _userUuid;
	private String _userName;
	private Date _createDate;
	private Date _modifiedDate;
	private String _modifiedByUser;
	private String _languageId;
	private long _layoutId;
	private String _portletId;
	private String _originalPortletId;
	private String _portleturl;
	private transient ExpandoBridge _expandoBridge;
}