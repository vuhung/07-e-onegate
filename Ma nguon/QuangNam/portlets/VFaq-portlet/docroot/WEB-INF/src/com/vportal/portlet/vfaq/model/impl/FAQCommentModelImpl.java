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

package com.vportal.portlet.vfaq.model.impl;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.DateUtil;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.impl.BaseModelImpl;
import com.liferay.portal.service.ServiceContext;
import com.liferay.portal.util.PortalUtil;

import com.liferay.portlet.expando.model.ExpandoBridge;
import com.liferay.portlet.expando.util.ExpandoBridgeFactoryUtil;

import com.vportal.portlet.vfaq.model.FAQComment;
import com.vportal.portlet.vfaq.model.FAQCommentModel;
import com.vportal.portlet.vfaq.model.FAQCommentSoap;

import java.io.Serializable;

import java.lang.reflect.Proxy;

import java.sql.Types;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * The base model implementation for the FAQComment service. Represents a row in the &quot;FAQComment&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link com.vportal.portlet.vfaq.model.FAQCommentModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link FAQCommentImpl}.
 * </p>
 *
 * <p>
 * Never modify or reference this class directly. All methods that expect a f a q comment model instance should use the {@link com.vportal.portlet.vfaq.model.FAQComment} interface instead.
 * </p>
 *
 * @author HOAN
 * @see FAQCommentImpl
 * @see com.vportal.portlet.vfaq.model.FAQComment
 * @see com.vportal.portlet.vfaq.model.FAQCommentModel
 * @generated
 */
public class FAQCommentModelImpl extends BaseModelImpl<FAQComment>
	implements FAQCommentModel {
	public static final String TABLE_NAME = "FAQComment";
	public static final Object[][] TABLE_COLUMNS = {
			{ "uuid_", new Integer(Types.VARCHAR) },
			{ "id_", new Integer(Types.BIGINT) },
			{ "answerid", new Integer(Types.BIGINT) },
			{ "content", new Integer(Types.VARCHAR) },
			{ "commName", new Integer(Types.VARCHAR) },
			{ "commEmail", new Integer(Types.VARCHAR) },
			{ "approved", new Integer(Types.BOOLEAN) },
			{ "approveByUser", new Integer(Types.VARCHAR) },
			{ "approvedDate", new Integer(Types.TIMESTAMP) },
			{ "commDate", new Integer(Types.TIMESTAMP) },
			{ "userId", new Integer(Types.BIGINT) }
		};
	public static final String TABLE_SQL_CREATE = "create table FAQComment (uuid_ VARCHAR(75) null,id_ LONG not null primary key,answerid LONG,content VARCHAR(75) null,commName VARCHAR(500) null,commEmail VARCHAR(200) null,approved BOOLEAN,approveByUser VARCHAR(200) null,approvedDate DATE null,commDate DATE null,userId LONG)";
	public static final String TABLE_SQL_DROP = "drop table FAQComment";
	public static final String ORDER_BY_JPQL = " ORDER BY faqComment.commDate DESC";
	public static final String ORDER_BY_SQL = " ORDER BY FAQComment.commDate DESC";
	public static final String DATA_SOURCE = "liferayDataSource";
	public static final String SESSION_FACTORY = "liferaySessionFactory";
	public static final String TX_MANAGER = "liferayTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.entity.cache.enabled.com.vportal.portlet.vfaq.model.FAQComment"),
			true);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.finder.cache.enabled.com.vportal.portlet.vfaq.model.FAQComment"),
			true);

	/**
	 * Converts the soap model instance into a normal model instance.
	 *
	 * @param soapModel the soap model instance to convert
	 * @return the normal model instance
	 */
	public static FAQComment toModel(FAQCommentSoap soapModel) {
		FAQComment model = new FAQCommentImpl();

		model.setUuid(soapModel.getUuid());
		model.setId(soapModel.getId());
		model.setAnswerid(soapModel.getAnswerid());
		model.setContent(soapModel.getContent());
		model.setCommName(soapModel.getCommName());
		model.setCommEmail(soapModel.getCommEmail());
		model.setApproved(soapModel.getApproved());
		model.setApproveByUser(soapModel.getApproveByUser());
		model.setApprovedDate(soapModel.getApprovedDate());
		model.setCommDate(soapModel.getCommDate());
		model.setUserId(soapModel.getUserId());

		return model;
	}

	/**
	 * Converts the soap model instances into normal model instances.
	 *
	 * @param soapModels the soap model instances to convert
	 * @return the normal model instances
	 */
	public static List<FAQComment> toModels(FAQCommentSoap[] soapModels) {
		List<FAQComment> models = new ArrayList<FAQComment>(soapModels.length);

		for (FAQCommentSoap soapModel : soapModels) {
			models.add(toModel(soapModel));
		}

		return models;
	}

	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.util.service.ServiceProps.get(
				"lock.expiration.time.com.vportal.portlet.vfaq.model.FAQComment"));

	public FAQCommentModelImpl() {
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

	public String getUuid() {
		if (_uuid == null) {
			return StringPool.BLANK;
		}
		else {
			return _uuid;
		}
	}

	public void setUuid(String uuid) {
		_uuid = uuid;
	}

	public long getId() {
		return _id;
	}

	public void setId(long id) {
		_id = id;
	}

	public long getAnswerid() {
		return _answerid;
	}

	public void setAnswerid(long answerid) {
		_answerid = answerid;
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

	public String getCommName() {
		if (_commName == null) {
			return StringPool.BLANK;
		}
		else {
			return _commName;
		}
	}

	public void setCommName(String commName) {
		_commName = commName;
	}

	public String getCommEmail() {
		if (_commEmail == null) {
			return StringPool.BLANK;
		}
		else {
			return _commEmail;
		}
	}

	public void setCommEmail(String commEmail) {
		_commEmail = commEmail;
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

	public String getApproveByUser() {
		if (_approveByUser == null) {
			return StringPool.BLANK;
		}
		else {
			return _approveByUser;
		}
	}

	public void setApproveByUser(String approveByUser) {
		_approveByUser = approveByUser;
	}

	public Date getApprovedDate() {
		return _approvedDate;
	}

	public void setApprovedDate(Date approvedDate) {
		_approvedDate = approvedDate;
	}

	public Date getCommDate() {
		return _commDate;
	}

	public void setCommDate(Date commDate) {
		_commDate = commDate;
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

	public FAQComment toEscapedModel() {
		if (isEscapedModel()) {
			return (FAQComment)this;
		}
		else {
			return (FAQComment)Proxy.newProxyInstance(FAQComment.class.getClassLoader(),
				new Class[] { FAQComment.class },
				new AutoEscapeBeanHandler(this));
		}
	}

	public ExpandoBridge getExpandoBridge() {
		if (_expandoBridge == null) {
			_expandoBridge = ExpandoBridgeFactoryUtil.getExpandoBridge(0,
					FAQComment.class.getName(), getPrimaryKey());
		}

		return _expandoBridge;
	}

	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		getExpandoBridge().setAttributes(serviceContext);
	}

	public Object clone() {
		FAQCommentImpl faqCommentImpl = new FAQCommentImpl();

		faqCommentImpl.setUuid(getUuid());

		faqCommentImpl.setId(getId());

		faqCommentImpl.setAnswerid(getAnswerid());

		faqCommentImpl.setContent(getContent());

		faqCommentImpl.setCommName(getCommName());

		faqCommentImpl.setCommEmail(getCommEmail());

		faqCommentImpl.setApproved(getApproved());

		faqCommentImpl.setApproveByUser(getApproveByUser());

		faqCommentImpl.setApprovedDate(getApprovedDate());

		faqCommentImpl.setCommDate(getCommDate());

		faqCommentImpl.setUserId(getUserId());

		return faqCommentImpl;
	}

	public int compareTo(FAQComment faqComment) {
		int value = 0;

		value = DateUtil.compareTo(getCommDate(), faqComment.getCommDate());

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

		FAQComment faqComment = null;

		try {
			faqComment = (FAQComment)obj;
		}
		catch (ClassCastException cce) {
			return false;
		}

		long pk = faqComment.getPrimaryKey();

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
		StringBundler sb = new StringBundler(23);

		sb.append("{uuid=");
		sb.append(getUuid());
		sb.append(", id=");
		sb.append(getId());
		sb.append(", answerid=");
		sb.append(getAnswerid());
		sb.append(", content=");
		sb.append(getContent());
		sb.append(", commName=");
		sb.append(getCommName());
		sb.append(", commEmail=");
		sb.append(getCommEmail());
		sb.append(", approved=");
		sb.append(getApproved());
		sb.append(", approveByUser=");
		sb.append(getApproveByUser());
		sb.append(", approvedDate=");
		sb.append(getApprovedDate());
		sb.append(", commDate=");
		sb.append(getCommDate());
		sb.append(", userId=");
		sb.append(getUserId());
		sb.append("}");

		return sb.toString();
	}

	public String toXmlString() {
		StringBundler sb = new StringBundler(37);

		sb.append("<model><model-name>");
		sb.append("com.vportal.portlet.vfaq.model.FAQComment");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>uuid</column-name><column-value><![CDATA[");
		sb.append(getUuid());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>id</column-name><column-value><![CDATA[");
		sb.append(getId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>answerid</column-name><column-value><![CDATA[");
		sb.append(getAnswerid());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>content</column-name><column-value><![CDATA[");
		sb.append(getContent());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>commName</column-name><column-value><![CDATA[");
		sb.append(getCommName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>commEmail</column-name><column-value><![CDATA[");
		sb.append(getCommEmail());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>approved</column-name><column-value><![CDATA[");
		sb.append(getApproved());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>approveByUser</column-name><column-value><![CDATA[");
		sb.append(getApproveByUser());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>approvedDate</column-name><column-value><![CDATA[");
		sb.append(getApprovedDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>commDate</column-name><column-value><![CDATA[");
		sb.append(getCommDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>userId</column-name><column-value><![CDATA[");
		sb.append(getUserId());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private String _uuid;
	private long _id;
	private long _answerid;
	private String _content;
	private String _commName;
	private String _commEmail;
	private boolean _approved;
	private String _approveByUser;
	private Date _approvedDate;
	private Date _commDate;
	private long _userId;
	private String _userUuid;
	private transient ExpandoBridge _expandoBridge;
}