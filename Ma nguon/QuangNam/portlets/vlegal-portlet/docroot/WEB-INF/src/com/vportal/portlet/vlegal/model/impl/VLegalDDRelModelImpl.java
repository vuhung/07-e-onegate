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

package com.vportal.portlet.vlegal.model.impl;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.impl.BaseModelImpl;

import com.vportal.portlet.vlegal.model.VLegalDDRel;
import com.vportal.portlet.vlegal.model.VLegalDDRelModel;
import com.vportal.portlet.vlegal.model.VLegalDDRelSoap;
import com.vportal.portlet.vlegal.service.persistence.VLegalDDRelPK;

import java.io.Serializable;

import java.lang.reflect.Proxy;

import java.sql.Types;

import java.util.ArrayList;
import java.util.List;

/**
 * The base model implementation for the VLegalDDRel service. Represents a row in the &quot;VLegalDDRel&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link com.vportal.portlet.vlegal.model.VLegalDDRelModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link VLegalDDRelImpl}.
 * </p>
 *
 * <p>
 * Never modify or reference this class directly. All methods that expect a v legal d d rel model instance should use the {@link com.vportal.portlet.vlegal.model.VLegalDDRel} interface instead.
 * </p>
 *
 * @author ACB
 * @see VLegalDDRelImpl
 * @see com.vportal.portlet.vlegal.model.VLegalDDRel
 * @see com.vportal.portlet.vlegal.model.VLegalDDRelModel
 * @generated
 */
public class VLegalDDRelModelImpl extends BaseModelImpl<VLegalDDRel>
	implements VLegalDDRelModel {
	public static final String TABLE_NAME = "VLegalDDRel";
	public static final Object[][] TABLE_COLUMNS = {
			{ "departmentId", new Integer(Types.BIGINT) },
			{ "docId", new Integer(Types.VARCHAR) }
		};
	public static final String TABLE_SQL_CREATE = "create table VLegalDDRel (departmentId LONG not null,docId VARCHAR(75) not null,primary key (departmentId, docId))";
	public static final String TABLE_SQL_DROP = "drop table VLegalDDRel";
	public static final String ORDER_BY_JPQL = " ORDER BY vLegalDDRel.id.departmentId DESC, vLegalDDRel.id.docId DESC";
	public static final String ORDER_BY_SQL = " ORDER BY VLegalDDRel.departmentId DESC, VLegalDDRel.docId DESC";
	public static final String DATA_SOURCE = "liferayDataSource";
	public static final String SESSION_FACTORY = "liferaySessionFactory";
	public static final String TX_MANAGER = "liferayTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.entity.cache.enabled.com.vportal.portlet.vlegal.model.VLegalDDRel"),
			true);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.finder.cache.enabled.com.vportal.portlet.vlegal.model.VLegalDDRel"),
			true);

	/**
	 * Converts the soap model instance into a normal model instance.
	 *
	 * @param soapModel the soap model instance to convert
	 * @return the normal model instance
	 */
	public static VLegalDDRel toModel(VLegalDDRelSoap soapModel) {
		VLegalDDRel model = new VLegalDDRelImpl();

		model.setDepartmentId(soapModel.getDepartmentId());
		model.setDocId(soapModel.getDocId());

		return model;
	}

	/**
	 * Converts the soap model instances into normal model instances.
	 *
	 * @param soapModels the soap model instances to convert
	 * @return the normal model instances
	 */
	public static List<VLegalDDRel> toModels(VLegalDDRelSoap[] soapModels) {
		List<VLegalDDRel> models = new ArrayList<VLegalDDRel>(soapModels.length);

		for (VLegalDDRelSoap soapModel : soapModels) {
			models.add(toModel(soapModel));
		}

		return models;
	}

	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.util.service.ServiceProps.get(
				"lock.expiration.time.com.vportal.portlet.vlegal.model.VLegalDDRel"));

	public VLegalDDRelModelImpl() {
	}

	public VLegalDDRelPK getPrimaryKey() {
		return new VLegalDDRelPK(_departmentId, _docId);
	}

	public void setPrimaryKey(VLegalDDRelPK pk) {
		setDepartmentId(pk.departmentId);
		setDocId(pk.docId);
	}

	public Serializable getPrimaryKeyObj() {
		return new VLegalDDRelPK(_departmentId, _docId);
	}

	public long getDepartmentId() {
		return _departmentId;
	}

	public void setDepartmentId(long departmentId) {
		_departmentId = departmentId;
	}

	public String getDocId() {
		if (_docId == null) {
			return StringPool.BLANK;
		}
		else {
			return _docId;
		}
	}

	public void setDocId(String docId) {
		_docId = docId;
	}

	public VLegalDDRel toEscapedModel() {
		if (isEscapedModel()) {
			return (VLegalDDRel)this;
		}
		else {
			return (VLegalDDRel)Proxy.newProxyInstance(VLegalDDRel.class.getClassLoader(),
				new Class[] { VLegalDDRel.class },
				new AutoEscapeBeanHandler(this));
		}
	}

	public Object clone() {
		VLegalDDRelImpl vLegalDDRelImpl = new VLegalDDRelImpl();

		vLegalDDRelImpl.setDepartmentId(getDepartmentId());

		vLegalDDRelImpl.setDocId(getDocId());

		return vLegalDDRelImpl;
	}

	public int compareTo(VLegalDDRel vLegalDDRel) {
		int value = 0;

		if (getDepartmentId() < vLegalDDRel.getDepartmentId()) {
			value = -1;
		}
		else if (getDepartmentId() > vLegalDDRel.getDepartmentId()) {
			value = 1;
		}
		else {
			value = 0;
		}

		value = value * -1;

		if (value != 0) {
			return value;
		}

		value = getDocId().compareTo(vLegalDDRel.getDocId());

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

		VLegalDDRel vLegalDDRel = null;

		try {
			vLegalDDRel = (VLegalDDRel)obj;
		}
		catch (ClassCastException cce) {
			return false;
		}

		VLegalDDRelPK pk = vLegalDDRel.getPrimaryKey();

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
		StringBundler sb = new StringBundler(5);

		sb.append("{departmentId=");
		sb.append(getDepartmentId());
		sb.append(", docId=");
		sb.append(getDocId());
		sb.append("}");

		return sb.toString();
	}

	public String toXmlString() {
		StringBundler sb = new StringBundler(10);

		sb.append("<model><model-name>");
		sb.append("com.vportal.portlet.vlegal.model.VLegalDDRel");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>departmentId</column-name><column-value><![CDATA[");
		sb.append(getDepartmentId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>docId</column-name><column-value><![CDATA[");
		sb.append(getDocId());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _departmentId;
	private String _docId;
}