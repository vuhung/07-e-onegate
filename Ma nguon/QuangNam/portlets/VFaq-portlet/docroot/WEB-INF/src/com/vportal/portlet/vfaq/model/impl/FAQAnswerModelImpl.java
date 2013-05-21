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

import com.vportal.portlet.vfaq.model.FAQAnswer;
import com.vportal.portlet.vfaq.model.FAQAnswerModel;
import com.vportal.portlet.vfaq.model.FAQAnswerSoap;

import java.io.Serializable;

import java.lang.reflect.Proxy;

import java.sql.Types;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * The base model implementation for the FAQAnswer service. Represents a row in the &quot;vfaq_FAQAnswer&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link com.vportal.portlet.vfaq.model.FAQAnswerModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link FAQAnswerImpl}.
 * </p>
 *
 * <p>
 * Never modify or reference this class directly. All methods that expect a f a q answer model instance should use the {@link com.vportal.portlet.vfaq.model.FAQAnswer} interface instead.
 * </p>
 *
 * @author HOAN
 * @see FAQAnswerImpl
 * @see com.vportal.portlet.vfaq.model.FAQAnswer
 * @see com.vportal.portlet.vfaq.model.FAQAnswerModel
 * @generated
 */
public class FAQAnswerModelImpl extends BaseModelImpl<FAQAnswer>
	implements FAQAnswerModel {
	public static final String TABLE_NAME = "vfaq_FAQAnswer";
	public static final Object[][] TABLE_COLUMNS = {
			{ "uuid_", new Integer(Types.VARCHAR) },
			{ "id_", new Integer(Types.BIGINT) },
			{ "questionid", new Integer(Types.BIGINT) },
			{ "content", new Integer(Types.VARCHAR) },
			{ "answerOrder", new Integer(Types.INTEGER) },
			{ "answeredByUser", new Integer(Types.VARCHAR) },
			{ "answeredDate", new Integer(Types.TIMESTAMP) },
			{ "modifiedByUser", new Integer(Types.VARCHAR) },
			{ "language", new Integer(Types.VARCHAR) },
			{ "modifiedDate", new Integer(Types.TIMESTAMP) },
			{ "approved", new Integer(Types.BOOLEAN) },
			{ "approvedByUser", new Integer(Types.VARCHAR) },
			{ "approvedDate", new Integer(Types.TIMESTAMP) },
			{ "userId", new Integer(Types.BIGINT) },
			{ "attachName", new Integer(Types.VARCHAR) },
			{ "folderId", new Integer(Types.BIGINT) }
		};
	public static final String TABLE_SQL_CREATE = "create table vfaq_FAQAnswer (uuid_ VARCHAR(75) null,id_ LONG not null primary key,questionid LONG,content VARCHAR(75) null,answerOrder INTEGER,answeredByUser VARCHAR(200) null,answeredDate DATE null,modifiedByUser VARCHAR(200) null,language VARCHAR(75) null,modifiedDate DATE null,approved BOOLEAN,approvedByUser VARCHAR(200) null,approvedDate DATE null,userId LONG,attachName VARCHAR(500) null,folderId LONG)";
	public static final String TABLE_SQL_DROP = "drop table vfaq_FAQAnswer";
	public static final String ORDER_BY_JPQL = " ORDER BY faqAnswer.answeredDate DESC";
	public static final String ORDER_BY_SQL = " ORDER BY vfaq_FAQAnswer.answeredDate DESC";
	public static final String DATA_SOURCE = "liferayDataSource";
	public static final String SESSION_FACTORY = "liferaySessionFactory";
	public static final String TX_MANAGER = "liferayTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.entity.cache.enabled.com.vportal.portlet.vfaq.model.FAQAnswer"),
			true);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.finder.cache.enabled.com.vportal.portlet.vfaq.model.FAQAnswer"),
			true);

	/**
	 * Converts the soap model instance into a normal model instance.
	 *
	 * @param soapModel the soap model instance to convert
	 * @return the normal model instance
	 */
	public static FAQAnswer toModel(FAQAnswerSoap soapModel) {
		FAQAnswer model = new FAQAnswerImpl();

		model.setUuid(soapModel.getUuid());
		model.setId(soapModel.getId());
		model.setQuestionid(soapModel.getQuestionid());
		model.setContent(soapModel.getContent());
		model.setAnswerOrder(soapModel.getAnswerOrder());
		model.setAnsweredByUser(soapModel.getAnsweredByUser());
		model.setAnsweredDate(soapModel.getAnsweredDate());
		model.setModifiedByUser(soapModel.getModifiedByUser());
		model.setLanguage(soapModel.getLanguage());
		model.setModifiedDate(soapModel.getModifiedDate());
		model.setApproved(soapModel.getApproved());
		model.setApprovedByUser(soapModel.getApprovedByUser());
		model.setApprovedDate(soapModel.getApprovedDate());
		model.setUserId(soapModel.getUserId());
		model.setAttachName(soapModel.getAttachName());
		model.setFolderId(soapModel.getFolderId());

		return model;
	}

	/**
	 * Converts the soap model instances into normal model instances.
	 *
	 * @param soapModels the soap model instances to convert
	 * @return the normal model instances
	 */
	public static List<FAQAnswer> toModels(FAQAnswerSoap[] soapModels) {
		List<FAQAnswer> models = new ArrayList<FAQAnswer>(soapModels.length);

		for (FAQAnswerSoap soapModel : soapModels) {
			models.add(toModel(soapModel));
		}

		return models;
	}

	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.util.service.ServiceProps.get(
				"lock.expiration.time.com.vportal.portlet.vfaq.model.FAQAnswer"));

	public FAQAnswerModelImpl() {
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

	public long getQuestionid() {
		return _questionid;
	}

	public void setQuestionid(long questionid) {
		_questionid = questionid;
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

	public int getAnswerOrder() {
		return _answerOrder;
	}

	public void setAnswerOrder(int answerOrder) {
		_answerOrder = answerOrder;
	}

	public String getAnsweredByUser() {
		if (_answeredByUser == null) {
			return StringPool.BLANK;
		}
		else {
			return _answeredByUser;
		}
	}

	public void setAnsweredByUser(String answeredByUser) {
		_answeredByUser = answeredByUser;
	}

	public Date getAnsweredDate() {
		return _answeredDate;
	}

	public void setAnsweredDate(Date answeredDate) {
		_answeredDate = answeredDate;
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

	public Date getModifiedDate() {
		return _modifiedDate;
	}

	public void setModifiedDate(Date modifiedDate) {
		_modifiedDate = modifiedDate;
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

	public String getAttachName() {
		if (_attachName == null) {
			return StringPool.BLANK;
		}
		else {
			return _attachName;
		}
	}

	public void setAttachName(String attachName) {
		_attachName = attachName;
	}

	public long getFolderId() {
		return _folderId;
	}

	public void setFolderId(long folderId) {
		_folderId = folderId;
	}

	public FAQAnswer toEscapedModel() {
		if (isEscapedModel()) {
			return (FAQAnswer)this;
		}
		else {
			return (FAQAnswer)Proxy.newProxyInstance(FAQAnswer.class.getClassLoader(),
				new Class[] { FAQAnswer.class }, new AutoEscapeBeanHandler(this));
		}
	}

	public ExpandoBridge getExpandoBridge() {
		if (_expandoBridge == null) {
			_expandoBridge = ExpandoBridgeFactoryUtil.getExpandoBridge(0,
					FAQAnswer.class.getName(), getPrimaryKey());
		}

		return _expandoBridge;
	}

	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		getExpandoBridge().setAttributes(serviceContext);
	}

	public Object clone() {
		FAQAnswerImpl faqAnswerImpl = new FAQAnswerImpl();

		faqAnswerImpl.setUuid(getUuid());

		faqAnswerImpl.setId(getId());

		faqAnswerImpl.setQuestionid(getQuestionid());

		faqAnswerImpl.setContent(getContent());

		faqAnswerImpl.setAnswerOrder(getAnswerOrder());

		faqAnswerImpl.setAnsweredByUser(getAnsweredByUser());

		faqAnswerImpl.setAnsweredDate(getAnsweredDate());

		faqAnswerImpl.setModifiedByUser(getModifiedByUser());

		faqAnswerImpl.setLanguage(getLanguage());

		faqAnswerImpl.setModifiedDate(getModifiedDate());

		faqAnswerImpl.setApproved(getApproved());

		faqAnswerImpl.setApprovedByUser(getApprovedByUser());

		faqAnswerImpl.setApprovedDate(getApprovedDate());

		faqAnswerImpl.setUserId(getUserId());

		faqAnswerImpl.setAttachName(getAttachName());

		faqAnswerImpl.setFolderId(getFolderId());

		return faqAnswerImpl;
	}

	public int compareTo(FAQAnswer faqAnswer) {
		int value = 0;

		value = DateUtil.compareTo(getAnsweredDate(),
				faqAnswer.getAnsweredDate());

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

		FAQAnswer faqAnswer = null;

		try {
			faqAnswer = (FAQAnswer)obj;
		}
		catch (ClassCastException cce) {
			return false;
		}

		long pk = faqAnswer.getPrimaryKey();

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
		StringBundler sb = new StringBundler(33);

		sb.append("{uuid=");
		sb.append(getUuid());
		sb.append(", id=");
		sb.append(getId());
		sb.append(", questionid=");
		sb.append(getQuestionid());
		sb.append(", content=");
		sb.append(getContent());
		sb.append(", answerOrder=");
		sb.append(getAnswerOrder());
		sb.append(", answeredByUser=");
		sb.append(getAnsweredByUser());
		sb.append(", answeredDate=");
		sb.append(getAnsweredDate());
		sb.append(", modifiedByUser=");
		sb.append(getModifiedByUser());
		sb.append(", language=");
		sb.append(getLanguage());
		sb.append(", modifiedDate=");
		sb.append(getModifiedDate());
		sb.append(", approved=");
		sb.append(getApproved());
		sb.append(", approvedByUser=");
		sb.append(getApprovedByUser());
		sb.append(", approvedDate=");
		sb.append(getApprovedDate());
		sb.append(", userId=");
		sb.append(getUserId());
		sb.append(", attachName=");
		sb.append(getAttachName());
		sb.append(", folderId=");
		sb.append(getFolderId());
		sb.append("}");

		return sb.toString();
	}

	public String toXmlString() {
		StringBundler sb = new StringBundler(52);

		sb.append("<model><model-name>");
		sb.append("com.vportal.portlet.vfaq.model.FAQAnswer");
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
			"<column><column-name>questionid</column-name><column-value><![CDATA[");
		sb.append(getQuestionid());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>content</column-name><column-value><![CDATA[");
		sb.append(getContent());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>answerOrder</column-name><column-value><![CDATA[");
		sb.append(getAnswerOrder());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>answeredByUser</column-name><column-value><![CDATA[");
		sb.append(getAnsweredByUser());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>answeredDate</column-name><column-value><![CDATA[");
		sb.append(getAnsweredDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>modifiedByUser</column-name><column-value><![CDATA[");
		sb.append(getModifiedByUser());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>language</column-name><column-value><![CDATA[");
		sb.append(getLanguage());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>modifiedDate</column-name><column-value><![CDATA[");
		sb.append(getModifiedDate());
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
			"<column><column-name>userId</column-name><column-value><![CDATA[");
		sb.append(getUserId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>attachName</column-name><column-value><![CDATA[");
		sb.append(getAttachName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>folderId</column-name><column-value><![CDATA[");
		sb.append(getFolderId());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private String _uuid;
	private long _id;
	private long _questionid;
	private String _content;
	private int _answerOrder;
	private String _answeredByUser;
	private Date _answeredDate;
	private String _modifiedByUser;
	private String _language;
	private Date _modifiedDate;
	private boolean _approved;
	private String _approvedByUser;
	private Date _approvedDate;
	private long _userId;
	private String _userUuid;
	private String _attachName;
	private long _folderId;
	private transient ExpandoBridge _expandoBridge;
}