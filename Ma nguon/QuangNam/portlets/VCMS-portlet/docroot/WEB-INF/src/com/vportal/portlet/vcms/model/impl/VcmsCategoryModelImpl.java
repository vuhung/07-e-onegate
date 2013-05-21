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

package com.vportal.portlet.vcms.model.impl;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.impl.BaseModelImpl;

import com.vportal.portlet.vcms.model.VcmsCategory;
import com.vportal.portlet.vcms.model.VcmsCategoryModel;
import com.vportal.portlet.vcms.model.VcmsCategorySoap;

import java.io.Serializable;

import java.lang.reflect.Proxy;

import java.sql.Types;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * The base model implementation for the VcmsCategory service. Represents a row in the &quot;VcmsCategory&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link com.vportal.portlet.vcms.model.VcmsCategoryModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link VcmsCategoryImpl}.
 * </p>
 *
 * <p>
 * Never modify or reference this class directly. All methods that expect a vcms category model instance should use the {@link com.vportal.portlet.vcms.model.VcmsCategory} interface instead.
 * </p>
 *
 * @author HOAN
 * @see VcmsCategoryImpl
 * @see com.vportal.portlet.vcms.model.VcmsCategory
 * @see com.vportal.portlet.vcms.model.VcmsCategoryModel
 * @generated
 */
public class VcmsCategoryModelImpl extends BaseModelImpl<VcmsCategory>
	implements VcmsCategoryModel {
	public static final String TABLE_NAME = "VcmsCategory";
	public static final Object[][] TABLE_COLUMNS = {
			{ "categoryId", new Integer(Types.VARCHAR) },
			{ "groupId", new Integer(Types.BIGINT) },
			{ "companyId", new Integer(Types.BIGINT) },
			{ "createdDate", new Integer(Types.TIMESTAMP) },
			{ "createdByUser", new Integer(Types.VARCHAR) },
			{ "modifiedDate", new Integer(Types.TIMESTAMP) },
			{ "modifiedByUser", new Integer(Types.VARCHAR) },
			{ "portionId", new Integer(Types.VARCHAR) },
			{ "parentId", new Integer(Types.VARCHAR) },
			{ "name", new Integer(Types.VARCHAR) },
			{ "description", new Integer(Types.VARCHAR) },
			{ "anchored", new Integer(Types.BOOLEAN) },
			{ "href", new Integer(Types.VARCHAR) },
			{ "language", new Integer(Types.VARCHAR) },
			{ "hasImage", new Integer(Types.BOOLEAN) },
			{ "image", new Integer(Types.VARCHAR) },
			{ "position", new Integer(Types.INTEGER) },
			{ "userHit", new Integer(Types.INTEGER) },
			{ "rssable", new Integer(Types.BOOLEAN) }
		};
	public static final String TABLE_SQL_CREATE = "create table VcmsCategory (categoryId VARCHAR(75) not null primary key,groupId LONG,companyId LONG,createdDate DATE null,createdByUser VARCHAR(75) null,modifiedDate DATE null,modifiedByUser VARCHAR(75) null,portionId VARCHAR(75) null,parentId VARCHAR(75) null,name VARCHAR(1000) null,description VARCHAR(2000) null,anchored BOOLEAN,href VARCHAR(500) null,language VARCHAR(75) null,hasImage BOOLEAN,image VARCHAR(1000) null,position INTEGER,userHit INTEGER,rssable BOOLEAN)";
	public static final String TABLE_SQL_DROP = "drop table VcmsCategory";
	public static final String ORDER_BY_JPQL = " ORDER BY vcmsCategory.position ASC";
	public static final String ORDER_BY_SQL = " ORDER BY VcmsCategory.position ASC";
	public static final String DATA_SOURCE = "liferayDataSource";
	public static final String SESSION_FACTORY = "liferaySessionFactory";
	public static final String TX_MANAGER = "liferayTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.entity.cache.enabled.com.vportal.portlet.vcms.model.VcmsCategory"),
			true);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.finder.cache.enabled.com.vportal.portlet.vcms.model.VcmsCategory"),
			true);

	/**
	 * Converts the soap model instance into a normal model instance.
	 *
	 * @param soapModel the soap model instance to convert
	 * @return the normal model instance
	 */
	public static VcmsCategory toModel(VcmsCategorySoap soapModel) {
		VcmsCategory model = new VcmsCategoryImpl();

		model.setCategoryId(soapModel.getCategoryId());
		model.setGroupId(soapModel.getGroupId());
		model.setCompanyId(soapModel.getCompanyId());
		model.setCreatedDate(soapModel.getCreatedDate());
		model.setCreatedByUser(soapModel.getCreatedByUser());
		model.setModifiedDate(soapModel.getModifiedDate());
		model.setModifiedByUser(soapModel.getModifiedByUser());
		model.setPortionId(soapModel.getPortionId());
		model.setParentId(soapModel.getParentId());
		model.setName(soapModel.getName());
		model.setDescription(soapModel.getDescription());
		model.setAnchored(soapModel.getAnchored());
		model.setHref(soapModel.getHref());
		model.setLanguage(soapModel.getLanguage());
		model.setHasImage(soapModel.getHasImage());
		model.setImage(soapModel.getImage());
		model.setPosition(soapModel.getPosition());
		model.setUserHit(soapModel.getUserHit());
		model.setRssable(soapModel.getRssable());

		return model;
	}

	/**
	 * Converts the soap model instances into normal model instances.
	 *
	 * @param soapModels the soap model instances to convert
	 * @return the normal model instances
	 */
	public static List<VcmsCategory> toModels(VcmsCategorySoap[] soapModels) {
		List<VcmsCategory> models = new ArrayList<VcmsCategory>(soapModels.length);

		for (VcmsCategorySoap soapModel : soapModels) {
			models.add(toModel(soapModel));
		}

		return models;
	}

	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.util.service.ServiceProps.get(
				"lock.expiration.time.com.vportal.portlet.vcms.model.VcmsCategory"));

	public VcmsCategoryModelImpl() {
	}

	public String getPrimaryKey() {
		return _categoryId;
	}

	public void setPrimaryKey(String pk) {
		setCategoryId(pk);
	}

	public Serializable getPrimaryKeyObj() {
		return _categoryId;
	}

	public String getCategoryId() {
		if (_categoryId == null) {
			return StringPool.BLANK;
		}
		else {
			return _categoryId;
		}
	}

	public void setCategoryId(String categoryId) {
		_categoryId = categoryId;
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

	public Date getCreatedDate() {
		return _createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		_createdDate = createdDate;
	}

	public String getCreatedByUser() {
		if (_createdByUser == null) {
			return StringPool.BLANK;
		}
		else {
			return _createdByUser;
		}
	}

	public void setCreatedByUser(String createdByUser) {
		_createdByUser = createdByUser;
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

	public String getPortionId() {
		if (_portionId == null) {
			return StringPool.BLANK;
		}
		else {
			return _portionId;
		}
	}

	public void setPortionId(String portionId) {
		_portionId = portionId;
	}

	public String getParentId() {
		if (_parentId == null) {
			return StringPool.BLANK;
		}
		else {
			return _parentId;
		}
	}

	public void setParentId(String parentId) {
		_parentId = parentId;
	}

	public String getName() {
		if (_name == null) {
			return StringPool.BLANK;
		}
		else {
			return _name;
		}
	}

	public void setName(String name) {
		_name = name;
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

	public boolean getAnchored() {
		return _anchored;
	}

	public boolean isAnchored() {
		return _anchored;
	}

	public void setAnchored(boolean anchored) {
		_anchored = anchored;
	}

	public String getHref() {
		if (_href == null) {
			return StringPool.BLANK;
		}
		else {
			return _href;
		}
	}

	public void setHref(String href) {
		_href = href;
	}

	public String getLanguage() {
		if (_language == null) {
			return StringPool.BLANK;
		}
		else {
			return _language;
		}
	}

	public void setLanguage(String language) {
		_language = language;
	}

	public boolean getHasImage() {
		return _hasImage;
	}

	public boolean isHasImage() {
		return _hasImage;
	}

	public void setHasImage(boolean hasImage) {
		_hasImage = hasImage;
	}

	public String getImage() {
		if (_image == null) {
			return StringPool.BLANK;
		}
		else {
			return _image;
		}
	}

	public void setImage(String image) {
		_image = image;
	}

	public int getPosition() {
		return _position;
	}

	public void setPosition(int position) {
		_position = position;
	}

	public int getUserHit() {
		return _userHit;
	}

	public void setUserHit(int userHit) {
		_userHit = userHit;
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

	public VcmsCategory toEscapedModel() {
		if (isEscapedModel()) {
			return (VcmsCategory)this;
		}
		else {
			return (VcmsCategory)Proxy.newProxyInstance(VcmsCategory.class.getClassLoader(),
				new Class[] { VcmsCategory.class },
				new AutoEscapeBeanHandler(this));
		}
	}

	public Object clone() {
		VcmsCategoryImpl vcmsCategoryImpl = new VcmsCategoryImpl();

		vcmsCategoryImpl.setCategoryId(getCategoryId());

		vcmsCategoryImpl.setGroupId(getGroupId());

		vcmsCategoryImpl.setCompanyId(getCompanyId());

		vcmsCategoryImpl.setCreatedDate(getCreatedDate());

		vcmsCategoryImpl.setCreatedByUser(getCreatedByUser());

		vcmsCategoryImpl.setModifiedDate(getModifiedDate());

		vcmsCategoryImpl.setModifiedByUser(getModifiedByUser());

		vcmsCategoryImpl.setPortionId(getPortionId());

		vcmsCategoryImpl.setParentId(getParentId());

		vcmsCategoryImpl.setName(getName());

		vcmsCategoryImpl.setDescription(getDescription());

		vcmsCategoryImpl.setAnchored(getAnchored());

		vcmsCategoryImpl.setHref(getHref());

		vcmsCategoryImpl.setLanguage(getLanguage());

		vcmsCategoryImpl.setHasImage(getHasImage());

		vcmsCategoryImpl.setImage(getImage());

		vcmsCategoryImpl.setPosition(getPosition());

		vcmsCategoryImpl.setUserHit(getUserHit());

		vcmsCategoryImpl.setRssable(getRssable());

		return vcmsCategoryImpl;
	}

	public int compareTo(VcmsCategory vcmsCategory) {
		int value = 0;

		if (getPosition() < vcmsCategory.getPosition()) {
			value = -1;
		}
		else if (getPosition() > vcmsCategory.getPosition()) {
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

		VcmsCategory vcmsCategory = null;

		try {
			vcmsCategory = (VcmsCategory)obj;
		}
		catch (ClassCastException cce) {
			return false;
		}

		String pk = vcmsCategory.getPrimaryKey();

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

		sb.append("{categoryId=");
		sb.append(getCategoryId());
		sb.append(", groupId=");
		sb.append(getGroupId());
		sb.append(", companyId=");
		sb.append(getCompanyId());
		sb.append(", createdDate=");
		sb.append(getCreatedDate());
		sb.append(", createdByUser=");
		sb.append(getCreatedByUser());
		sb.append(", modifiedDate=");
		sb.append(getModifiedDate());
		sb.append(", modifiedByUser=");
		sb.append(getModifiedByUser());
		sb.append(", portionId=");
		sb.append(getPortionId());
		sb.append(", parentId=");
		sb.append(getParentId());
		sb.append(", name=");
		sb.append(getName());
		sb.append(", description=");
		sb.append(getDescription());
		sb.append(", anchored=");
		sb.append(getAnchored());
		sb.append(", href=");
		sb.append(getHref());
		sb.append(", language=");
		sb.append(getLanguage());
		sb.append(", hasImage=");
		sb.append(getHasImage());
		sb.append(", image=");
		sb.append(getImage());
		sb.append(", position=");
		sb.append(getPosition());
		sb.append(", userHit=");
		sb.append(getUserHit());
		sb.append(", rssable=");
		sb.append(getRssable());
		sb.append("}");

		return sb.toString();
	}

	public String toXmlString() {
		StringBundler sb = new StringBundler(61);

		sb.append("<model><model-name>");
		sb.append("com.vportal.portlet.vcms.model.VcmsCategory");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>categoryId</column-name><column-value><![CDATA[");
		sb.append(getCategoryId());
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
			"<column><column-name>createdDate</column-name><column-value><![CDATA[");
		sb.append(getCreatedDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>createdByUser</column-name><column-value><![CDATA[");
		sb.append(getCreatedByUser());
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
			"<column><column-name>portionId</column-name><column-value><![CDATA[");
		sb.append(getPortionId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>parentId</column-name><column-value><![CDATA[");
		sb.append(getParentId());
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
			"<column><column-name>anchored</column-name><column-value><![CDATA[");
		sb.append(getAnchored());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>href</column-name><column-value><![CDATA[");
		sb.append(getHref());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>language</column-name><column-value><![CDATA[");
		sb.append(getLanguage());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>hasImage</column-name><column-value><![CDATA[");
		sb.append(getHasImage());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>image</column-name><column-value><![CDATA[");
		sb.append(getImage());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>position</column-name><column-value><![CDATA[");
		sb.append(getPosition());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>userHit</column-name><column-value><![CDATA[");
		sb.append(getUserHit());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>rssable</column-name><column-value><![CDATA[");
		sb.append(getRssable());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private String _categoryId;
	private long _groupId;
	private long _companyId;
	private Date _createdDate;
	private String _createdByUser;
	private Date _modifiedDate;
	private String _modifiedByUser;
	private String _portionId;
	private String _parentId;
	private String _name;
	private String _description;
	private boolean _anchored;
	private String _href;
	private String _language;
	private boolean _hasImage;
	private String _image;
	private int _position;
	private int _userHit;
	private boolean _rssable;
}