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

import com.vportal.portlet.vcms.model.VcmsArticle;
import com.vportal.portlet.vcms.model.VcmsArticleModel;
import com.vportal.portlet.vcms.model.VcmsArticleSoap;

import java.io.Serializable;

import java.lang.reflect.Proxy;

import java.sql.Types;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * The base model implementation for the VcmsArticle service. Represents a row in the &quot;VcmsArticle&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link com.vportal.portlet.vcms.model.VcmsArticleModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link VcmsArticleImpl}.
 * </p>
 *
 * <p>
 * Never modify or reference this class directly. All methods that expect a vcms article model instance should use the {@link com.vportal.portlet.vcms.model.VcmsArticle} interface instead.
 * </p>
 *
 * @author HOAN
 * @see VcmsArticleImpl
 * @see com.vportal.portlet.vcms.model.VcmsArticle
 * @see com.vportal.portlet.vcms.model.VcmsArticleModel
 * @generated
 */
public class VcmsArticleModelImpl extends BaseModelImpl<VcmsArticle>
	implements VcmsArticleModel {
	public static final String TABLE_NAME = "VcmsArticle";
	public static final Object[][] TABLE_COLUMNS = {
			{ "articleId", new Integer(Types.VARCHAR) },
			{ "groupId", new Integer(Types.BIGINT) },
			{ "companyId", new Integer(Types.BIGINT) },
			{ "createdByUser", new Integer(Types.VARCHAR) },
			{ "createdDate", new Integer(Types.TIMESTAMP) },
			{ "modifiedByUser", new Integer(Types.VARCHAR) },
			{ "modifiedDate", new Integer(Types.TIMESTAMP) },
			{ "approvedByUser", new Integer(Types.VARCHAR) },
			{ "approvedDate", new Integer(Types.TIMESTAMP) },
			{ "publishedByUser", new Integer(Types.VARCHAR) },
			{ "publishedDate", new Integer(Types.TIMESTAMP) },
			{ "status", new Integer(Types.BIGINT) },
			{ "title", new Integer(Types.VARCHAR) },
			{ "lead", new Integer(Types.VARCHAR) },
			{ "content", new Integer(Types.VARCHAR) },
			{ "hasImage", new Integer(Types.BOOLEAN) },
			{ "imageTitle", new Integer(Types.VARCHAR) },
			{ "image", new Integer(Types.VARCHAR) },
			{ "author", new Integer(Types.VARCHAR) },
			{ "source", new Integer(Types.VARCHAR) },
			{ "language", new Integer(Types.VARCHAR) },
			{ "userHit", new Integer(Types.INTEGER) },
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
	public static final String TABLE_SQL_CREATE = "create table VcmsArticle (articleId VARCHAR(75) not null primary key,groupId LONG,companyId LONG,createdByUser VARCHAR(75) null,createdDate DATE null,modifiedByUser VARCHAR(75) null,modifiedDate DATE null,approvedByUser VARCHAR(75) null,approvedDate DATE null,publishedByUser VARCHAR(75) null,publishedDate DATE null,status LONG,title VARCHAR(1000) null,lead VARCHAR(2000) null,content TEXT null,hasImage BOOLEAN,imageTitle VARCHAR(500) null,image VARCHAR(1000) null,author VARCHAR(500) null,source VARCHAR(500) null,language VARCHAR(75) null,userHit INTEGER,discussible BOOLEAN,hasAttachment BOOLEAN,hasPoll BOOLEAN,pollId VARCHAR(75) null,effectiveDate DATE null,expireDate DATE null,sticky BOOLEAN,stickyNeverExpired BOOLEAN,stickyExpireDate DATE null)";
	public static final String TABLE_SQL_DROP = "drop table VcmsArticle";
	public static final String ORDER_BY_JPQL = " ORDER BY vcmsArticle.modifiedDate DESC";
	public static final String ORDER_BY_SQL = " ORDER BY VcmsArticle.modifiedDate DESC";
	public static final String DATA_SOURCE = "liferayDataSource";
	public static final String SESSION_FACTORY = "liferaySessionFactory";
	public static final String TX_MANAGER = "liferayTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.entity.cache.enabled.com.vportal.portlet.vcms.model.VcmsArticle"),
			true);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.finder.cache.enabled.com.vportal.portlet.vcms.model.VcmsArticle"),
			true);

	/**
	 * Converts the soap model instance into a normal model instance.
	 *
	 * @param soapModel the soap model instance to convert
	 * @return the normal model instance
	 */
	public static VcmsArticle toModel(VcmsArticleSoap soapModel) {
		VcmsArticle model = new VcmsArticleImpl();

		model.setArticleId(soapModel.getArticleId());
		model.setGroupId(soapModel.getGroupId());
		model.setCompanyId(soapModel.getCompanyId());
		model.setCreatedByUser(soapModel.getCreatedByUser());
		model.setCreatedDate(soapModel.getCreatedDate());
		model.setModifiedByUser(soapModel.getModifiedByUser());
		model.setModifiedDate(soapModel.getModifiedDate());
		model.setApprovedByUser(soapModel.getApprovedByUser());
		model.setApprovedDate(soapModel.getApprovedDate());
		model.setPublishedByUser(soapModel.getPublishedByUser());
		model.setPublishedDate(soapModel.getPublishedDate());
		model.setStatus(soapModel.getStatus());
		model.setTitle(soapModel.getTitle());
		model.setLead(soapModel.getLead());
		model.setContent(soapModel.getContent());
		model.setHasImage(soapModel.getHasImage());
		model.setImageTitle(soapModel.getImageTitle());
		model.setImage(soapModel.getImage());
		model.setAuthor(soapModel.getAuthor());
		model.setSource(soapModel.getSource());
		model.setLanguage(soapModel.getLanguage());
		model.setUserHit(soapModel.getUserHit());
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
	public static List<VcmsArticle> toModels(VcmsArticleSoap[] soapModels) {
		List<VcmsArticle> models = new ArrayList<VcmsArticle>(soapModels.length);

		for (VcmsArticleSoap soapModel : soapModels) {
			models.add(toModel(soapModel));
		}

		return models;
	}

	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.util.service.ServiceProps.get(
				"lock.expiration.time.com.vportal.portlet.vcms.model.VcmsArticle"));

	public VcmsArticleModelImpl() {
	}

	public String getPrimaryKey() {
		return _articleId;
	}

	public void setPrimaryKey(String pk) {
		setArticleId(pk);
	}

	public Serializable getPrimaryKeyObj() {
		return _articleId;
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

	public Date getModifiedDate() {
		return _modifiedDate;
	}

	public void setModifiedDate(Date modifiedDate) {
		_modifiedDate = modifiedDate;
	}

	public String getApprovedByUser() {
		if (_approvedByUser == null) {
			return StringPool.BLANK;
		}
		else {
			return _approvedByUser;
		}
	}

	public void setApprovedByUser(String approvedByUser) {
		_approvedByUser = approvedByUser;
	}

	public Date getApprovedDate() {
		return _approvedDate;
	}

	public void setApprovedDate(Date approvedDate) {
		_approvedDate = approvedDate;
	}

	public String getPublishedByUser() {
		if (_publishedByUser == null) {
			return StringPool.BLANK;
		}
		else {
			return _publishedByUser;
		}
	}

	public void setPublishedByUser(String publishedByUser) {
		_publishedByUser = publishedByUser;
	}

	public Date getPublishedDate() {
		return _publishedDate;
	}

	public void setPublishedDate(Date publishedDate) {
		_publishedDate = publishedDate;
	}

	public long getStatus() {
		return _status;
	}

	public void setStatus(long status) {
		_status = status;
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

	public VcmsArticle toEscapedModel() {
		if (isEscapedModel()) {
			return (VcmsArticle)this;
		}
		else {
			return (VcmsArticle)Proxy.newProxyInstance(VcmsArticle.class.getClassLoader(),
				new Class[] { VcmsArticle.class },
				new AutoEscapeBeanHandler(this));
		}
	}

	public Object clone() {
		VcmsArticleImpl vcmsArticleImpl = new VcmsArticleImpl();

		vcmsArticleImpl.setArticleId(getArticleId());

		vcmsArticleImpl.setGroupId(getGroupId());

		vcmsArticleImpl.setCompanyId(getCompanyId());

		vcmsArticleImpl.setCreatedByUser(getCreatedByUser());

		vcmsArticleImpl.setCreatedDate(getCreatedDate());

		vcmsArticleImpl.setModifiedByUser(getModifiedByUser());

		vcmsArticleImpl.setModifiedDate(getModifiedDate());

		vcmsArticleImpl.setApprovedByUser(getApprovedByUser());

		vcmsArticleImpl.setApprovedDate(getApprovedDate());

		vcmsArticleImpl.setPublishedByUser(getPublishedByUser());

		vcmsArticleImpl.setPublishedDate(getPublishedDate());

		vcmsArticleImpl.setStatus(getStatus());

		vcmsArticleImpl.setTitle(getTitle());

		vcmsArticleImpl.setLead(getLead());

		vcmsArticleImpl.setContent(getContent());

		vcmsArticleImpl.setHasImage(getHasImage());

		vcmsArticleImpl.setImageTitle(getImageTitle());

		vcmsArticleImpl.setImage(getImage());

		vcmsArticleImpl.setAuthor(getAuthor());

		vcmsArticleImpl.setSource(getSource());

		vcmsArticleImpl.setLanguage(getLanguage());

		vcmsArticleImpl.setUserHit(getUserHit());

		vcmsArticleImpl.setDiscussible(getDiscussible());

		vcmsArticleImpl.setHasAttachment(getHasAttachment());

		vcmsArticleImpl.setHasPoll(getHasPoll());

		vcmsArticleImpl.setPollId(getPollId());

		vcmsArticleImpl.setEffectiveDate(getEffectiveDate());

		vcmsArticleImpl.setExpireDate(getExpireDate());

		vcmsArticleImpl.setSticky(getSticky());

		vcmsArticleImpl.setStickyNeverExpired(getStickyNeverExpired());

		vcmsArticleImpl.setStickyExpireDate(getStickyExpireDate());

		return vcmsArticleImpl;
	}

	public int compareTo(VcmsArticle vcmsArticle) {
		int value = 0;

		value = DateUtil.compareTo(getModifiedDate(),
				vcmsArticle.getModifiedDate());

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

		VcmsArticle vcmsArticle = null;

		try {
			vcmsArticle = (VcmsArticle)obj;
		}
		catch (ClassCastException cce) {
			return false;
		}

		String pk = vcmsArticle.getPrimaryKey();

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
		StringBundler sb = new StringBundler(63);

		sb.append("{articleId=");
		sb.append(getArticleId());
		sb.append(", groupId=");
		sb.append(getGroupId());
		sb.append(", companyId=");
		sb.append(getCompanyId());
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
		sb.append(", status=");
		sb.append(getStatus());
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
		sb.append(", author=");
		sb.append(getAuthor());
		sb.append(", source=");
		sb.append(getSource());
		sb.append(", language=");
		sb.append(getLanguage());
		sb.append(", userHit=");
		sb.append(getUserHit());
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
		StringBundler sb = new StringBundler(97);

		sb.append("<model><model-name>");
		sb.append("com.vportal.portlet.vcms.model.VcmsArticle");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>articleId</column-name><column-value><![CDATA[");
		sb.append(getArticleId());
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
			"<column><column-name>status</column-name><column-value><![CDATA[");
		sb.append(getStatus());
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
			"<column><column-name>author</column-name><column-value><![CDATA[");
		sb.append(getAuthor());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>source</column-name><column-value><![CDATA[");
		sb.append(getSource());
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

	private String _articleId;
	private long _groupId;
	private long _companyId;
	private String _createdByUser;
	private Date _createdDate;
	private String _modifiedByUser;
	private Date _modifiedDate;
	private String _approvedByUser;
	private Date _approvedDate;
	private String _publishedByUser;
	private Date _publishedDate;
	private long _status;
	private String _title;
	private String _lead;
	private String _content;
	private boolean _hasImage;
	private String _imageTitle;
	private String _image;
	private String _author;
	private String _source;
	private String _language;
	private int _userHit;
	private boolean _discussible;
	private boolean _hasAttachment;
	private boolean _hasPoll;
	private String _pollId;
	private Date _effectiveDate;
	private Date _expireDate;
	private boolean _sticky;
	private boolean _stickyNeverExpired;
	private Date _stickyExpireDate;
}