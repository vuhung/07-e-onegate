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

package com.vsi.edirectory.portlet.model.impl;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.impl.BaseModelImpl;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;
import com.liferay.portlet.expando.util.ExpandoBridgeFactoryUtil;

import com.vsi.edirectory.portlet.model.EDFunctionDepartment;
import com.vsi.edirectory.portlet.model.EDFunctionDepartmentModel;
import com.vsi.edirectory.portlet.model.EDFunctionDepartmentSoap;

import java.io.Serializable;

import java.lang.reflect.Proxy;

import java.sql.Types;

import java.util.ArrayList;
import java.util.List;

/**
 * The base model implementation for the EDFunctionDepartment service. Represents a row in the &quot;EDFunctionDepartment&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link com.vsi.edirectory.portlet.model.EDFunctionDepartmentModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link EDFunctionDepartmentImpl}.
 * </p>
 *
 * <p>
 * Never modify or reference this class directly. All methods that expect a e d function department model instance should use the {@link com.vsi.edirectory.portlet.model.EDFunctionDepartment} interface instead.
 * </p>
 *
 * @author vinhnt
 * @see EDFunctionDepartmentImpl
 * @see com.vsi.edirectory.portlet.model.EDFunctionDepartment
 * @see com.vsi.edirectory.portlet.model.EDFunctionDepartmentModel
 * @generated
 */
public class EDFunctionDepartmentModelImpl extends BaseModelImpl<EDFunctionDepartment>
	implements EDFunctionDepartmentModel {
	public static final String TABLE_NAME = "EDFunctionDepartment";
	public static final Object[][] TABLE_COLUMNS = {
			{ "id_", new Integer(Types.BIGINT) },
			{ "functionId", new Integer(Types.BIGINT) },
			{ "departmentId", new Integer(Types.BIGINT) }
		};
	public static final String TABLE_SQL_CREATE = "create table EDFunctionDepartment (id_ LONG not null primary key,functionId LONG,departmentId LONG)";
	public static final String TABLE_SQL_DROP = "drop table EDFunctionDepartment";
	public static final String ORDER_BY_JPQL = " ORDER BY edFunctionDepartment.functionId ASC, edFunctionDepartment.departmentId ASC";
	public static final String ORDER_BY_SQL = " ORDER BY EDFunctionDepartment.functionId ASC, EDFunctionDepartment.departmentId ASC";
	public static final String DATA_SOURCE = "liferayDataSource";
	public static final String SESSION_FACTORY = "liferaySessionFactory";
	public static final String TX_MANAGER = "liferayTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.entity.cache.enabled.com.vsi.edirectory.portlet.model.EDFunctionDepartment"),
			true);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.finder.cache.enabled.com.vsi.edirectory.portlet.model.EDFunctionDepartment"),
			true);

	/**
	 * Converts the soap model instance into a normal model instance.
	 *
	 * @param soapModel the soap model instance to convert
	 * @return the normal model instance
	 */
	public static EDFunctionDepartment toModel(
		EDFunctionDepartmentSoap soapModel) {
		EDFunctionDepartment model = new EDFunctionDepartmentImpl();

		model.setId(soapModel.getId());
		model.setFunctionId(soapModel.getFunctionId());
		model.setDepartmentId(soapModel.getDepartmentId());

		return model;
	}

	/**
	 * Converts the soap model instances into normal model instances.
	 *
	 * @param soapModels the soap model instances to convert
	 * @return the normal model instances
	 */
	public static List<EDFunctionDepartment> toModels(
		EDFunctionDepartmentSoap[] soapModels) {
		List<EDFunctionDepartment> models = new ArrayList<EDFunctionDepartment>(soapModels.length);

		for (EDFunctionDepartmentSoap soapModel : soapModels) {
			models.add(toModel(soapModel));
		}

		return models;
	}

	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.util.service.ServiceProps.get(
				"lock.expiration.time.com.vsi.edirectory.portlet.model.EDFunctionDepartment"));

	public EDFunctionDepartmentModelImpl() {
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

	public long getFunctionId() {
		return _functionId;
	}

	public void setFunctionId(long functionId) {
		_functionId = functionId;
	}

	public long getDepartmentId() {
		return _departmentId;
	}

	public void setDepartmentId(long departmentId) {
		_departmentId = departmentId;
	}

	public EDFunctionDepartment toEscapedModel() {
		if (isEscapedModel()) {
			return (EDFunctionDepartment)this;
		}
		else {
			return (EDFunctionDepartment)Proxy.newProxyInstance(EDFunctionDepartment.class.getClassLoader(),
				new Class[] { EDFunctionDepartment.class },
				new AutoEscapeBeanHandler(this));
		}
	}

	public ExpandoBridge getExpandoBridge() {
		if (_expandoBridge == null) {
			_expandoBridge = ExpandoBridgeFactoryUtil.getExpandoBridge(0,
					EDFunctionDepartment.class.getName(), getPrimaryKey());
		}

		return _expandoBridge;
	}

	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		getExpandoBridge().setAttributes(serviceContext);
	}

	public Object clone() {
		EDFunctionDepartmentImpl edFunctionDepartmentImpl = new EDFunctionDepartmentImpl();

		edFunctionDepartmentImpl.setId(getId());

		edFunctionDepartmentImpl.setFunctionId(getFunctionId());

		edFunctionDepartmentImpl.setDepartmentId(getDepartmentId());

		return edFunctionDepartmentImpl;
	}

	public int compareTo(EDFunctionDepartment edFunctionDepartment) {
		int value = 0;

		if (getFunctionId() < edFunctionDepartment.getFunctionId()) {
			value = -1;
		}
		else if (getFunctionId() > edFunctionDepartment.getFunctionId()) {
			value = 1;
		}
		else {
			value = 0;
		}

		if (value != 0) {
			return value;
		}

		if (getDepartmentId() < edFunctionDepartment.getDepartmentId()) {
			value = -1;
		}
		else if (getDepartmentId() > edFunctionDepartment.getDepartmentId()) {
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

		EDFunctionDepartment edFunctionDepartment = null;

		try {
			edFunctionDepartment = (EDFunctionDepartment)obj;
		}
		catch (ClassCastException cce) {
			return false;
		}

		long pk = edFunctionDepartment.getPrimaryKey();

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
		StringBundler sb = new StringBundler(7);

		sb.append("{id=");
		sb.append(getId());
		sb.append(", functionId=");
		sb.append(getFunctionId());
		sb.append(", departmentId=");
		sb.append(getDepartmentId());
		sb.append("}");

		return sb.toString();
	}

	public String toXmlString() {
		StringBundler sb = new StringBundler(13);

		sb.append("<model><model-name>");
		sb.append("com.vsi.edirectory.portlet.model.EDFunctionDepartment");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>id</column-name><column-value><![CDATA[");
		sb.append(getId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>functionId</column-name><column-value><![CDATA[");
		sb.append(getFunctionId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>departmentId</column-name><column-value><![CDATA[");
		sb.append(getDepartmentId());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _id;
	private long _functionId;
	private long _departmentId;
	private transient ExpandoBridge _expandoBridge;
}