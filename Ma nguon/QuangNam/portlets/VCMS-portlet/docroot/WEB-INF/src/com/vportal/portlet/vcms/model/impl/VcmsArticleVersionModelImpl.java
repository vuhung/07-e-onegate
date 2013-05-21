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
import com.liferay.portal.kernel.util.DateUtil;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.impl.BaseModelImpl;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;
import com.liferay.portlet.expando.util.ExpandoBridgeFactoryUtil;

import com.vportal.portlet.vcms.model.VcmsArticleVersion;
import com.vportal.portlet.vcms.model.VcmsArticleVersionModel;
import com.vportal.portlet.vcms.model.VcmsArticleVersionSoap;

import java.io.Serializable;

import java.lang.reflect.Proxy;

import java.sql.Types;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * The base model implementation for the VcmsArticleVersion service. Represents a row in the &quot;VcmsArticleVersion&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link com.vportal.portlet.vcms.model.VcmsArticleVersionModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link VcmsArticleVersionImpl}.
 * </p>
 *
 * <p>
 * Never modify or reference this class directly. All methods that expect a vcms article version model instance should use the {@link com.vportal.portlet.vcms.model.VcmsArticleVersion} interface instead.
 * </p>
 *
 * @author HOAN
 * @see VcmsArticleVersionImpl
 * @see com.vportal.portlet.vcms.model.VcmsArticleVersion
 * @see com.vportal.portlet.vcms.model.VcmsArticleVersionModel
 * @generated
 */
public class VcmsArticleVersionModelImpl extends BaseModelImpl<VcmsArticleVersion>
	implements VcmsArticleVersionModel {
	public static final String TABLE_NAME = "VcmsArticleVersion";
	public static final Object[][] TABLE_COLUMNS = {
			{ "articleVersionId", new Integer(Types.BIGINT) },
			{ "groupId", new Integer(Types.BIGINT) },
			{ "companyId", new Integer(Types.BIGINT) },
			{ "articleId", new Integer(Types.VARCHAR) },
			{ "createdByUser", new Integer(Types.VARCHAR) },
			{ "createdDate", new Integer(Types.TIMESTAMP) },
			{ "typeIds", new Integer(Types.VARCHAR) },
			{ "status", new Integer(Types.BIGINT) },
			{ "versionName", new Integer(Types.VARCHAR) },
			{ "title", new Integer(Types.VARCHAR) },
			{ "lead", new Integer(Types.VARCHAR) },
			{ "content", new Integer(Types.VARCHAR) },
			{ "hasImage", new Integer(Types.BOOLEAN) },
			{ "imageTitle", new Integer(Types.VARCHAR) },
			{ "image", new Integer(Types.VARCHAR) },
			{ "language", new Integer(Types.VARCHAR) },
			{ "userHit", new Integer(Types.INTEGER) },
			{ "author", new Integer(Types.VARCHAR) },
			{ "source", new Integer(Types.VARCHAR) },
			{ "discussible", new Integer(Types.BOOLEAN) },
			{ "hasAttachment", new Integer(Types.BOOLEAN) },
			{ "hasPoll", new Integer(Types.BOOLEAN) },
			{ "pollId", new Integer(Types.VARCHAR) },
			{ "effectiveDate", new Integer(Types.TIMESTAMP) },
			{ "expireDate", new Integer(Types.TIMESTAMP) },
			{ "sticky", new Integer(Types.BOOLEAN) },
			{ "stickyNeverExpired", new Integer(Types.BOOLEAN) },
			{ "stickyExpireDate", new Integer(Types.TIMESTAMP) }
		};
	public static final String TABLE_SQL_CREATE = "create table VcmsArticleVersion (articleVersionId LONG not null primary key,groupId LONG,companyId LONG,articleId VARCHAR(75) null,createdByUser VARCHAR(200) null,createdDate DATE null,typeIds VARCHAR(75) null,status LONG,versionName VARCHAR(200) null,title VARCHAR(500) null,lead VARCHAR(1000) null,content TEXT null,hasImage BOOLEAN,imageTitle VARCHAR(500) null,image VARCHAR(1000) null,language VARCHAR(75) null,userHit INTEGER,author VARCHAR(500) null,source VARCHAR(500) null,discussible BOOLEAN,hasAttachment BOOLEAN,hasPoll BOOLEAN,pollId VARCHAR(75) null,effectiveDate DATE null,expireDate DATE null,sticky BOOLEAN,stickyNeverExpired BOOLEAN,stickyExpireDate DATE null)";
	public static final String TABLE_SQL_DROP = "drop table VcmsArticleVersion";
	public static final String ORDER_BY_JPQL = " ORDER BY vcmsArticleVersion.createdDate DESC";
	public static final String ORDER_BY_SQL = " ORDER BY VcmsArticleVersion.createdDate DESC";
	public static final String DATA_SOURCE = "liferayDataSource";
	public static final String SESSION_FACTORY = "liferaySessionFactory";
	public static final String TX_MANAGER = "liferayTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.entity.cache.enabled.com.vportal.portlet.vcms.model.VcmsArticleVersion"),
			true);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.finder.cache.enabled.com.vportal.portlet.vcms.model.VcmsArticleVersion"),
			true);

	/**
	 * Converts the soap model instance into a normal model instance.
	 *
	 * @param soapModel the soap model instance to convert
	 * @return the normal model instance
	 */
	public static VcmsArticleVersion toModel(VcmsArticleVersionSoap soapModel) {
		VcmsArticleVersion model = new VcmsArticleVersionImpl();

		model.setArticleVersionId(soapModel.getArticleVersionId());
		model.setGroupId(soapModel.getGroupId());
		model.setCompanyId(soapModel.getCompanyId());
		model.setArticleId(soapModel.getArticleId());
		model.setCreatedByUser(soapModel.getCreatedByUser());
		model.setCreatedDate(soapModel.getCreatedDate());
		model.setTypeIds(soapModel.getTypeIds());
		model.setStatus(soapModel.getStatus());
		model.setVersionName(soapModel.getVersionName());
		model.setTitle(soapModel.getTitle());
		model.setLead(soapModel.getLead());
		model.setContent(soapModel.getContent());
		model.setHasImage(soapModel.getHasImage());
		model.setImageTitle(soapModel.getImageTitle());
		model.setImage(soapModel.getImage());
		model.setLanguage(soapModel.getLanguage());
		model.setUserHit(soapModel.getUserHit());
		model.setAuthor(soapModel.getAuthor());
		model.setSource(soapModel.getSource());
		model.setDiscussible(soapModel.getDiscussible());
		model.setHasAttachment(soapModel.getHasAttachment());
		model.setHasPoll(soapModel.getHasPoll());
		model.setPollId(soapModel.getPollId());
		model.setEffectiveDate(soapModel.getEffectiveDate());
		model.setExpireDate(soapModel.getExpireDate());
		model.setSticky(soapModel.getSticky());
		model.setStickyNeverExpired(soapModel.getStickyNeverExpired());
		model.setStickyExpireDate(soapModel.getStickyExpireDate());

		return model;
	}

	/**
	 * Converts the soap model instances into normal model instances.
	 *
	 * @param soapModels the soap model instances to convert
	 * @return the normal model instances
	 */
	public static List<VcmsArticleVersion> toModels(
		VcmsArticleVersionSoap[] soapModels) {
		List<VcmsArticleVersion> models = new ArrayList<VcmsArticleVersion>(soapModels.length);

		for (VcmsArticleVersionSoap soapModel : soapModels) {
			models.add(toModel(soapModel));
		}

		return models;
	}

	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.util.service.ServiceProps.get(
				"lock.expiration.time.com.vportal.portlet.vcms.model.VcmsArticleVersion"));

	public VcmsArticleVersionModelImpl() {
	}

	public long getPrimaryKey() {
		return _articleVersionId;
	}

	public void setPrimaryKey(long pk) {
		setArticleVersionId(pk);
	}

	public Serializable getPrimaryKeyObj() {
		return new Long(_articleVersionId);
	}

	public long getArticleVersionId() {
		return _articleVersionId;
	}

	public void setArticleVersionId(long articleVersionId) {
		_articleVersionId = articleVersionId;
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

	public String getArticleId() {
		if (_articleId == null) {
			return StringPool.BLANK;
		}
		else {
			return _articleId;
		}
	}

	public void setArticleId(String articleId) {
		_articleId = articleId;
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

	public Date getCreatedDate() {
		return _createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		_createdDate = createdDate;
	}

	public String getTypeIds() {
		if (_typeIds == null) {
			return StringPool.BLANK;
		}
		else {
			return _typeIds;
		}
	}

	public void setTypeIds(String typeIds) {
		_typeIds = typeIds;
	}

	public long getStatus() {
		return _status;
	}

	public void setStatus(long status) {
		_status = status;
	}

	public String getVersionName() {
		if (_versionName == null) {
			return StringPool.BLANK;
		}
		else {
			return _versionName;
		}
	}

	public void setVersionName(String versionName) {
		_versionName = versionName;
	}

	public String getTitle() {
		if (_title == null) {
			return StringPool.BLANK;
		}
		else {
			return _title;
		}
	}

	public void setTitle(String title) {
		_title = title;
	}

	public String getLead() {
		if (_lead == null) {
			return StringPool.BLANK;
		}
		else {
			return _lead;
		}
	}

	public void setLead(String lead) {
		_lead = lead;
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

	public boolean getHasImage() {
		return _hasImage;
	}

	public boolean isHasImage() {
		return _hasImage;
	}

	public void setHasImage(boolean hasImage) {
		_hasImage = hasImage;
	}

	public String getImageTitle() {
		if (_imageTitle == null) {
			return StringPool.BLANK;
		}
		else {
			return _imageTitle;
		}
	}

	public void setImageTitle(String imageTitle) {
		_imageTitle = imageTitle;
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

	public int getUserHit() {
		return _userHit;
	}

	public void setUserHit(int userHit) {
		_userHit = userHit;
	}

	public String getAuthor() {
		if (_author == null) {
			return StringPool.BLANK;
		}
		else {
			return _author;
		}
	}

	public void setAuthor(String author) {
		_author = author;
	}

	public String getSource() {
		if (_source == null) {
			return StringPool.BLANK;
		}
		else {
			return _source;
		}
	}

	public void setSource(String source) {
		_source = source;
	}

	public boolean getDiscussible() {
		return _discussible;
	}

	public boolean isDiscussible() {
		return _discussible;
	}

	public void setDiscussible(boolean discussible) {
		_discussible = discussible;
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

	public boolean getHasPoll() {
		return _hasPoll;
	}

	public boolean isHasPoll() {
		return _hasPoll;
	}

	public void setHasPoll(boolean hasPoll) {
		_hasPoll = hasPoll;
	}

	public String getPollId() {
		if (_pollId == null) {
			return StringPool.BLANK;
		}
		else {
			return _pollId;
		}
	}

	public void setPollId(String pollId) {
		_pollId = pollId;
	}

	public Date getEffectiveDate() {
		return _effectiveDate;
	}

	public void setEffectiveDate(Date effectiveDate) {
		_effectiveDate = effectiveDate;
	}

	public Date getExpireDate() {
		return _expireDate;
	}

	public void setExpireDate(Date expireDate) {
		_expireDate = expireDate;
	}

	public boolean getSticky() {
		return _sticky;
	}

	public boolean isSticky() {
		return _sticky;
	}

	public void setSticky(boolean sticky) {
		_sticky = sticky;
	}

	public boolean getStickyNeverExpired() {
		return _stickyNeverExpired;
	}

	public boolean isStickyNeverExpired() {
		return _stickyNeverExpired;
	}

	public void setStickyNeverExpired(boolean stickyNeverExpired) {
		_stickyNeverExpired = stickyNeverExpired;
	}

	public Date getStickyExpireDate() {
		return _stickyExpireDate;
	}

	public void setStickyExpireDate(Date stickyExpireDate) {
		_stickyExpireDate = stickyExpireDate;
	}

	public VcmsArticleVersion toEscapedModel() {
		if (isEscapedModel()) {
			return (VcmsArticleVersion)this;
		}
		else {
			return (VcmsArticleVersion)Proxy.newProxyInstance(VcmsArticleVersion.class.getClassLoader(),
				new Class[] { VcmsArticleVersion.class },
				new AutoEscapeBeanHandler(this));
		}
	}

	public ExpandoBridge getExpandoBridge() {
		if (_expandoBridge == null) {
			_expandoBridge = ExpandoBridgeFactoryUtil.getExpandoBridge(getCompanyId(),
					VcmsArticleVersion.class.getName(), getPrimaryKey());
		}

		return _expandoBridge;
	}

	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		getExpandoBridge().setAttributes(serviceContext);
	}

	public Object clone() {
		VcmsArticleVersionImpl vcmsArticleVersionImpl = new VcmsArticleVersionImpl();

		vcmsArticleVersionImpl.setArticleVersionId(getArticleVersionId());

		vcmsArticleVersionImpl.setGroupId(getGroupId());

		vcmsArticleVersionImpl.setCompanyId(getCompanyId());

		vcmsArticleVersionImpl.setArticleId(getArticleId());

		vcmsArticleVersionImpl.setCreatedByUser(getCreatedByUser());

		vcmsArticleVersionImpl.setCreatedDate(getCreatedDate());

		vcmsArticleVersionImpl.setTypeIds(getTypeIds());

		vcmsArticleVersionImpl.setStatus(getStatus());

		vcmsArticleVersionImpl.setVersionName(getVersionName());

		vcmsArticleVersionImpl.setTitle(getTitle());

		vcmsArticleVersionImpl.setLead(getLead());

		vcmsArticleVersionImpl.setContent(getContent());

		vcmsArticleVersionImpl.setHasImage(getHasImage());

		vcmsArticleVersionImpl.setImageTitle(getImageTitle());

		vcmsArticleVersionImpl.setImage(getImage());

		vcmsArticleVersionImpl.setLanguage(getLanguage());

		vcmsArticleVersionImpl.setUserHit(getUserHit());

		vcmsArticleVersionImpl.setAuthor(getAuthor());

		vcmsArticleVersionImpl.setSource(getSource());

		vcmsArticleVersionImpl.setDiscussible(getDiscussible());

		vcmsArticleVersionImpl.setHasAttachment(getHasAttachment());

		vcmsArticleVersionImpl.setHasPoll(getHasPoll());

		vcmsArticleVersionImpl.setPollId(getPollId());

		vcmsArticleVersionImpl.setEffectiveDate(getEffectiveDate());

		vcmsArticleVersionImpl.setExpireDate(getExpireDate());

		vcmsArticleVersionImpl.setSticky(getSticky());

		vcmsArticleVersionImpl.setStickyNeverExpired(getStickyNeverExpired());

		vcmsArticleVersionImpl.setStickyExpireDate(getStickyExpireDate());

		return vcmsArticleVersionImpl;
	}

	public int compareTo(VcmsArticleVersion vcmsArticleVersion) {
		int value = 0;

		value = DateUtil.compareTo(getCreatedDate(),
				vcmsArticleVersion.getCreatedDate());

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

		VcmsArticleVersion vcmsArticleVersion = null;

		try {
			vcmsArticleVersion = (VcmsArticleVersion)obj;
		}
		catch (ClassCastException cce) {
			return false;
		}

		long pk = vcmsArticleVersion.getPrimaryKey();

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
		StringBundler sb = new StringBundler(57);

		sb.append("{articleVersionId=");
		sb.append(getArticleVersionId());
		sb.append(", groupId=");
		sb.append(getGroupId());
		sb.append(", companyId=");
		sb.append(getCompanyId());
		sb.append(", articleId=");
		sb.append(getArticleId());
		sb.append(", createdByUser=");
		sb.append(getCreatedByUser());
		sb.append(", createdDate=");
		sb.append(getCreatedDate());
		sb.append(", typeIds=");
		sb.append(getTypeIds());
		sb.append(", status=");
		sb.append(getStatus());
		sb.append(", versionName=");
		sb.append(getVersionName());
		sb.append(", title=");
		sb.append(getTitle());
		sb.append(", lead=");
		sb.append(getLead());
		sb.append(", content=");
		sb.append(getContent());
		sb.append(", hasImage=");
		sb.append(getHasImage());
		sb.append(", imageTitle=");
		sb.append(getImageTitle());
		sb.append(", image=");
		sb.append(getImage());
		sb.append(", language=");
		sb.append(getLanguage());
		sb.append(", userHit=");
		sb.append(getUserHit());
		sb.append(", author=");
		sb.append(getAuthor());
		sb.append(", source=");
		sb.append(getSource());
		sb.append(", discussible=");
		sb.append(getDiscussible());
		sb.append(", hasAttachment=");
		sb.append(getHasAttachment());
		sb.append(", hasPoll=");
		sb.append(getHasPoll());
		sb.append(", pollId=");
		sb.append(getPollId());
		sb.append(", effectiveDate=");
		sb.append(getEffectiveDate());
		sb.append(", expireDate=");
		sb.append(getExpireDate());
		sb.append(", sticky=");
		sb.append(getSticky());
		sb.append(", stickyNeverExpired=");
		sb.append(getStickyNeverExpired());
		sb.append(", stickyExpireDate=");
		sb.append(getStickyExpireDate());
		sb.append("}");

		return sb.toString();
	}

	public String toXmlString() {
		StringBundler sb = new StringBundler(88);

		sb.append("<model><model-name>");
		sb.append("com.vportal.portlet.vcms.model.VcmsArticleVersion");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>articleVersionId</column-name><column-value><![CDATA[");
		sb.append(getArticleVersionId());
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
			"<column><column-name>articleId</column-name><column-value><![CDATA[");
		sb.append(getArticleId());
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
			"<column><column-name>typeIds</column-name><column-value><![CDATA[");
		sb.append(getTypeIds());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>status</column-name><column-value><![CDATA[");
		sb.append(getStatus());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>versionName</column-name><column-value><![CDATA[");
		sb.append(getVersionName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>title</column-name><column-value><![CDATA[");
		sb.append(getTitle());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>lead</column-name><column-value><![CDATA[");
		sb.append(getLead());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>content</column-name><column-value><![CDATA[");
		sb.append(getContent());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>hasImage</column-name><column-value><![CDATA[");
		sb.append(getHasImage());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>imageTitle</column-name><column-value><![CDATA[");
		sb.append(getImageTitle());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>image</column-name><column-value><![CDATA[");
		sb.append(getImage());
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
			"<column><column-name>author</column-name><column-value><![CDATA[");
		sb.append(getAuthor());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>source</column-name><column-value><![CDATA[");
		sb.append(getSource());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>discussible</column-name><column-value><![CDATA[");
		sb.append(getDiscussible());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>hasAttachment</column-name><column-value><![CDATA[");
		sb.append(getHasAttachment());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>hasPoll</column-name><column-value><![CDATA[");
		sb.append(getHasPoll());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>pollId</column-name><column-value><![CDATA[");
		sb.append(getPollId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>effectiveDate</column-name><column-value><![CDATA[");
		sb.append(getEffectiveDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>expireDate</column-name><column-value><![CDATA[");
		sb.append(getExpireDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>sticky</column-name><column-value><![CDATA[");
		sb.append(getSticky());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>stickyNeverExpired</column-name><column-value><![CDATA[");
		sb.append(getStickyNeverExpired());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>stickyExpireDate</column-name><column-value><![CDATA[");
		sb.append(getStickyExpireDate());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _articleVersionId;
	private long _groupId;
	private long _companyId;
	private String _articleId;
	private String _createdByUser;
	private Date _createdDate;
	private String _typeIds;
	private long _status;
	private String _versionName;
	private String _title;
	private String _lead;
	private String _content;
	private boolean _hasImage;
	private String _imageTitle;
	private String _image;
	private String _language;
	private int _userHit;
	private String _author;
	private String _source;
	private boolean _discussible;
	private boolean _hasAttachment;
	private boolean _hasPoll;
	private String _pollId;
	private Date _effectiveDate;
	private Date _expireDate;
	private boolean _sticky;
	private boolean _stickyNeverExpired;
	private Date _stickyExpireDate;
	private transient ExpandoBridge _expandoBridge;
}