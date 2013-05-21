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
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.impl.BaseModelImpl;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;
import com.liferay.portlet.expando.util.ExpandoBridgeFactoryUtil;

import com.vportal.portlet.vfaq.model.FAQCategoryQuestion;
import com.vportal.portlet.vfaq.model.FAQCategoryQuestionModel;
import com.vportal.portlet.vfaq.model.FAQCategoryQuestionSoap;

import java.io.Serializable;

import java.lang.reflect.Proxy;

import java.sql.Types;

import java.util.ArrayList;
import java.util.List;

/**
 * The base model implementation for the FAQCategoryQuestion service. Represents a row in the &quot;FAQCategoryQuestion&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link com.vportal.portlet.vfaq.model.FAQCategoryQuestionModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link FAQCategoryQuestionImpl}.
 * </p>
 *
 * <p>
 * Never modify or reference this class directly. All methods that expect a f a q category question model instance should use the {@link com.vportal.portlet.vfaq.model.FAQCategoryQuestion} interface instead.
 * </p>
 *
 * @author HOAN
 * @see FAQCategoryQuestionImpl
 * @see com.vportal.portlet.vfaq.model.FAQCategoryQuestion
 * @see com.vportal.portlet.vfaq.model.FAQCategoryQuestionModel
 * @generated
 */
public class FAQCategoryQuestionModelImpl extends BaseModelImpl<FAQCategoryQuestion>
	implements FAQCategoryQuestionModel {
	public static final String TABLE_NAME = "FAQCategoryQuestion";
	public static final Object[][] TABLE_COLUMNS = {
			{ "uuid_", new Integer(Types.VARCHAR) },
			{ "id_", new Integer(Types.BIGINT) },
			{ "questionId", new Integer(Types.BIGINT) },
			{ "categoryId", new Integer(Types.BIGINT) }
		};
	public static final String TABLE_SQL_CREATE = "create table FAQCategoryQuestion (uuid_ VARCHAR(75) null,id_ LONG not null primary key,questionId LONG,categoryId LONG)";
	public static final String TABLE_SQL_DROP = "drop table FAQCategoryQuestion";
	public static final String DATA_SOURCE = "liferayDataSource";
	public static final String SESSION_FACTORY = "liferaySessionFactory";
	public static final String TX_MANAGER = "liferayTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.entity.cache.enabled.com.vportal.portlet.vfaq.model.FAQCategoryQuestion"),
			true);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.finder.cache.enabled.com.vportal.portlet.vfaq.model.FAQCategoryQuestion"),
			true);

	/**
	 * Converts the soap model instance into a normal model instance.
	 *
	 * @param soapModel the soap model instance to convert
	 * @return the normal model instance
	 */
	public static FAQCategoryQuestion toModel(FAQCategoryQuestionSoap soapModel) {
		FAQCategoryQuestion model = new FAQCategoryQuestionImpl();

		model.setUuid(soapModel.getUuid());
		model.setId(soapModel.getId());
		model.setQuestionId(soapModel.getQuestionId());
		model.setCategoryId(soapModel.getCategoryId());

		return model;
	}

	/**
	 * Converts the soap model instances into normal model instances.
	 *
	 * @param soapModels the soap model instances to convert
	 * @return the normal model instances
	 */
	public static List<FAQCategoryQuestion> toModels(
		FAQCategoryQuestionSoap[] soapModels) {
		List<FAQCategoryQuestion> models = new ArrayList<FAQCategoryQuestion>(soapModels.length);

		for (FAQCategoryQuestionSoap soapModel : soapModels) {
			models.add(toModel(soapModel));
		}

		return models;
	}

	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.util.service.ServiceProps.get(
				"lock.expiration.time.com.vportal.portlet.vfaq.model.FAQCategoryQuestion"));

	public FAQCategoryQuestionModelImpl() {
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

	public long getQuestionId() {
		return _questionId;
	}

	public void setQuestionId(long questionId) {
		_questionId = questionId;
	}

	public long getCategoryId() {
		return _categoryId;
	}

	public void setCategoryId(long categoryId) {
		_categoryId = categoryId;
	}

	public FAQCategoryQuestion toEscapedModel() {
		if (isEscapedModel()) {
			return (FAQCategoryQuestion)this;
		}
		else {
			return (FAQCategoryQuestion)Proxy.newProxyInstance(FAQCategoryQuestion.class.getClassLoader(),
				new Class[] { FAQCategoryQuestion.class },
				new AutoEscapeBeanHandler(this));
		}
	}

	public ExpandoBridge getExpandoBridge() {
		if (_expandoBridge == null) {
			_expandoBridge = ExpandoBridgeFactoryUtil.getExpandoBridge(0,
					FAQCategoryQuestion.class.getName(), getPrimaryKey());
		}

		return _expandoBridge;
	}

	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		getExpandoBridge().setAttributes(serviceContext);
	}

	public Object clone() {
		FAQCategoryQuestionImpl faqCategoryQuestionImpl = new FAQCategoryQuestionImpl();

		faqCategoryQuestionImpl.setUuid(getUuid());

		faqCategoryQuestionImpl.setId(getId());

		faqCategoryQuestionImpl.setQuestionId(getQuestionId());

		faqCategoryQuestionImpl.setCategoryId(getCategoryId());

		return faqCategoryQuestionImpl;
	}

	public int compareTo(FAQCategoryQuestion faqCategoryQuestion) {
		long pk = faqCategoryQuestion.getPrimaryKey();

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

		FAQCategoryQuestion faqCategoryQuestion = null;

		try {
			faqCategoryQuestion = (FAQCategoryQuestion)obj;
		}
		catch (ClassCastException cce) {
			return false;
		}

		long pk = faqCategoryQuestion.getPrimaryKey();

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

		sb.append("{uuid=");
		sb.append(getUuid());
		sb.append(", id=");
		sb.append(getId());
		sb.append(", questionId=");
		sb.append(getQuestionId());
		sb.append(", categoryId=");
		sb.append(getCategoryId());
		sb.append("}");

		return sb.toString();
	}

	public String toXmlString() {
		StringBundler sb = new StringBundler(16);

		sb.append("<model><model-name>");
		sb.append("com.vportal.portlet.vfaq.model.FAQCategoryQuestion");
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
			"<column><column-name>questionId</column-name><column-value><![CDATA[");
		sb.append(getQuestionId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>categoryId</column-name><column-value><![CDATA[");
		sb.append(getCategoryId());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private String _uuid;
	private long _id;
	private long _questionId;
	private long _categoryId;
	private transient ExpandoBridge _expandoBridge;
}