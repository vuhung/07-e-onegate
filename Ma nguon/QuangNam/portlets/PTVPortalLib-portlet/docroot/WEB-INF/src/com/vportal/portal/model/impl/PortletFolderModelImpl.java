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

package com.vportal.portal.model.impl;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.impl.BaseModelImpl;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;
import com.liferay.portlet.expando.util.ExpandoBridgeFactoryUtil;

import com.vportal.portal.model.PortletFolder;
import com.vportal.portal.model.PortletFolderModel;
import com.vportal.portal.model.PortletFolderSoap;

import java.io.Serializable;

import java.lang.reflect.Proxy;

import java.sql.Types;

import java.util.ArrayList;
import java.util.List;

/**
 * The base model implementation for the PortletFolder service. Represents a row in the &quot;PortletFolder&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link com.vportal.portal.model.PortletFolderModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link PortletFolderImpl}.
 * </p>
 *
 * <p>
 * Never modify or reference this class directly. All methods that expect a portlet folder model instance should use the {@link com.vportal.portal.model.PortletFolder} interface instead.
 * </p>
 *
 * @author HOAN
 * @see PortletFolderImpl
 * @see com.vportal.portal.model.PortletFolder
 * @see com.vportal.portal.model.PortletFolderModel
 * @generated
 */
public class PortletFolderModelImpl extends BaseModelImpl<PortletFolder>
	implements PortletFolderModel {
	public static final String TABLE_NAME = "PortletFolder";
	public static final Object[][] TABLE_COLUMNS = {
			{ "id_", new Integer(Types.BIGINT) },
			{ "portletId", new Integer(Types.VARCHAR) },
			{ "folderId", new Integer(Types.BIGINT) },
			{ "description", new Integer(Types.VARCHAR) }
		};
	public static final String TABLE_SQL_CREATE = "create table PortletFolder (id_ LONG not null primary key,portletId VARCHAR(75) null,folderId LONG,description VARCHAR(75) null)";
	public static final String TABLE_SQL_DROP = "drop table PortletFolder";
	public static final String DATA_SOURCE = "liferayDataSource";
	public static final String SESSION_FACTORY = "liferaySessionFactory";
	public static final String TX_MANAGER = "liferayTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.entity.cache.enabled.com.vportal.portal.model.PortletFolder"),
			true);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.finder.cache.enabled.com.vportal.portal.model.PortletFolder"),
			true);

	/**
	 * Converts the soap model instance into a normal model instance.
	 *
	 * @param soapModel the soap model instance to convert
	 * @return the normal model instance
	 */
	public static PortletFolder toModel(PortletFolderSoap soapModel) {
		PortletFolder model = new PortletFolderImpl();

		model.setId(soapModel.getId());
		model.setPortletId(soapModel.getPortletId());
		model.setFolderId(soapModel.getFolderId());
		model.setDescription(soapModel.getDescription());

		return model;
	}

	/**
	 * Converts the soap model instances into normal model instances.
	 *
	 * @param soapModels the soap model instances to convert
	 * @return the normal model instances
	 */
	public static List<PortletFolder> toModels(PortletFolderSoap[] soapModels) {
		List<PortletFolder> models = new ArrayList<PortletFolder>(soapModels.length);

		for (PortletFolderSoap soapModel : soapModels) {
			models.add(toModel(soapModel));
		}

		return models;
	}

	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.util.service.ServiceProps.get(
				"lock.expiration.time.com.vportal.portal.model.PortletFolder"));

	public PortletFolderModelImpl() {
	}

	public long getPrimaryKey() {
		return _id;
	}

	public void setPrimaryKey(long pk) {
		setId(pk);
	}

	public Serializable getPrimaryKeyObj() {
		return new Long(_id);
	}

	public long getId() {
		return _id;
	}

	public void setId(long id) {
		_id = id;
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

	public long getFolderId() {
		return _folderId;
	}

	public void setFolderId(long folderId) {
		if (!_setOriginalFolderId) {
			_setOriginalFolderId = true;

			_originalFolderId = _folderId;
		}

		_folderId = folderId;
	}

	public long getOriginalFolderId() {
		return _originalFolderId;
	}

	public String getDescription() {
		if (_description == null) {
			return StringPool.BLANK;
		}
		else {
			return _description;
		}
	}

	public void setDescription(String description) {
		_description = description;
	}

	public PortletFolder toEscapedModel() {
		if (isEscapedModel()) {
			return (PortletFolder)this;
		}
		else {
			return (PortletFolder)Proxy.newProxyInstance(PortletFolder.class.getClassLoader(),
				new Class[] { PortletFolder.class },
				new AutoEscapeBeanHandler(this));
		}
	}

	public ExpandoBridge getExpandoBridge() {
		if (_expandoBridge == null) {
			_expandoBridge = ExpandoBridgeFactoryUtil.getExpandoBridge(0,
					PortletFolder.class.getName(), getPrimaryKey());
		}

		return _expandoBridge;
	}

	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		getExpandoBridge().setAttributes(serviceContext);
	}

	public Object clone() {
		PortletFolderImpl portletFolderImpl = new PortletFolderImpl();

		portletFolderImpl.setId(getId());

		portletFolderImpl.setPortletId(getPortletId());

		PortletFolderModelImpl portletFolderModelImpl = portletFolderImpl;

		portletFolderModelImpl._originalPortletId = portletFolderModelImpl._portletId;

		portletFolderImpl.setFolderId(getFolderId());

		portletFolderModelImpl._originalFolderId = portletFolderModelImpl._folderId;

		portletFolderModelImpl._setOriginalFolderId = false;
		portletFolderImpl.setDescription(getDescription());

		return portletFolderImpl;
	}

	public int compareTo(PortletFolder portletFolder) {
		long pk = portletFolder.getPrimaryKey();

		if (getPrimaryKey() < pk) {
			return -1;
		}
		else if (getPrimaryKey() > pk) {
			return 1;
		}
		else {
			return 0;
		}
	}

	public boolean equals(Object obj) {
		if (obj == null) {
			return false;
		}

		PortletFolder portletFolder = null;

		try {
			portletFolder = (PortletFolder)obj;
		}
		catch (ClassCastException cce) {
			return false;
		}

		long pk = portletFolder.getPrimaryKey();

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
		StringBundler sb = new StringBundler(9);

		sb.append("{id=");
		sb.append(getId());
		sb.append(", portletId=");
		sb.append(getPortletId());
		sb.append(", folderId=");
		sb.append(getFolderId());
		sb.append(", description=");
		sb.append(getDescription());
		sb.append("}");

		return sb.toString();
	}

	public String toXmlString() {
		StringBundler sb = new StringBundler(16);

		sb.append("<model><model-name>");
		sb.append("com.vportal.portal.model.PortletFolder");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>id</column-name><column-value><![CDATA[");
		sb.append(getId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>portletId</column-name><column-value><![CDATA[");
		sb.append(getPortletId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>folderId</column-name><column-value><![CDATA[");
		sb.append(getFolderId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>description</column-name><column-value><![CDATA[");
		sb.append(getDescription());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _id;
	private String _portletId;
	private String _originalPortletId;
	private long _folderId;
	private long _originalFolderId;
	private boolean _setOriginalFolderId;
	private String _description;
	private transient ExpandoBridge _expandoBridge;
}