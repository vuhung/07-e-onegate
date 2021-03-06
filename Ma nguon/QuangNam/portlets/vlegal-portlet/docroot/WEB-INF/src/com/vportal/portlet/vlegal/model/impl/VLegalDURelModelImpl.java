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
import com.liferay.portal.model.impl.BaseModelImpl;

import com.vportal.portlet.vlegal.model.VLegalDURel;
import com.vportal.portlet.vlegal.model.VLegalDURelModel;
import com.vportal.portlet.vlegal.model.VLegalDURelSoap;
import com.vportal.portlet.vlegal.service.persistence.VLegalDURelPK;

import java.io.Serializable;

import java.lang.reflect.Proxy;

import java.sql.Types;

import java.util.ArrayList;
import java.util.List;

/**
 * The base model implementation for the VLegalDURel service. Represents a row in the &quot;VLegalDURel&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link com.vportal.portlet.vlegal.model.VLegalDURelModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link VLegalDURelImpl}.
 * </p>
 *
 * <p>
 * Never modify or reference this class directly. All methods that expect a v legal d u rel model instance should use the {@link com.vportal.portlet.vlegal.model.VLegalDURel} interface instead.
 * </p>
 *
 * @author ACB
 * @see VLegalDURelImpl
 * @see com.vportal.portlet.vlegal.model.VLegalDURel
 * @see com.vportal.portlet.vlegal.model.VLegalDURelModel
 * @generated
 */
public class VLegalDURelModelImpl extends BaseModelImpl<VLegalDURel>
	implements VLegalDURelModel {
	public static final String TABLE_NAME = "VLegalDURel";
	public static final Object[][] TABLE_COLUMNS = {
			{ "departmentId", new Integer(Types.BIGINT) },
			{ "userid", new Integer(Types.BIGINT) }
		};
	public static final String TABLE_SQL_CREATE = "create table VLegalDURel (departmentId LONG not null,userid LONG not null,primary key (departmentId, userid))";
	public static final String TABLE_SQL_DROP = "drop table VLegalDURel";
	public static final String ORDER_BY_JPQL = " ORDER BY vLegalDURel.id.departmentId DESC, vLegalDURel.id.userid DESC";
	public static final String ORDER_BY_SQL = " ORDER BY VLegalDURel.departmentId DESC, VLegalDURel.userid DESC";
	public static final String DATA_SOURCE = "liferayDataSource";
	public static final String SESSION_FACTORY = "liferaySessionFactory";
	public static final String TX_MANAGER = "liferayTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.entity.cache.enabled.com.vportal.portlet.vlegal.model.VLegalDURel"),
			true);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.finder.cache.enabled.com.vportal.portlet.vlegal.model.VLegalDURel"),
			true);

	/**
	 * Converts the soap model instance into a normal model instance.
	 *
	 * @param soapModel the soap model instance to convert
	 * @return the normal model instance
	 */
	public static VLegalDURel toModel(VLegalDURelSoap soapModel) {
		VLegalDURel model = new VLegalDURelImpl();

		model.setDepartmentId(soapModel.getDepartmentId());
		model.setUserid(soapModel.getUserid());

		return model;
	}

	/**
	 * Converts the soap model instances into normal model instances.
	 *
	 * @param soapModels the soap model instances to convert
	 * @return the normal model instances
	 */
	public static List<VLegalDURel> toModels(VLegalDURelSoap[] soapModels) {
		List<VLegalDURel> models = new ArrayList<VLegalDURel>(soapModels.length);

		for (VLegalDURelSoap soapModel : soapModels) {
			models.add(toModel(soapModel));
		}

		return models;
	}

	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.util.service.ServiceProps.get(
				"lock.expiration.time.com.vportal.portlet.vlegal.model.VLegalDURel"));

	public VLegalDURelModelImpl() {
	}

	public VLegalDURelPK getPrimaryKey() {
		return new VLegalDURelPK(_departmentId, _userid);
	}

	public void setPrimaryKey(VLegalDURelPK pk) {
		setDepartmentId(pk.departmentId);
		setUserid(pk.userid);
	}

	public Serializable getPrimaryKeyObj() {
		return new VLegalDURelPK(_departmentId, _userid);
	}

	public long getDepartmentId() {
		return _departmentId;
	}

	public void setDepartmentId(long departmentId) {
		_departmentId = departmentId;
	}

	public long getUserid() {
		return _userid;
	}

	public void setUserid(long userid) {
		if (!_setOriginalUserid) {
			_setOriginalUserid = true;

			_originalUserid = _userid;
		}

		_userid = userid;
	}

	public long getOriginalUserid() {
		return _originalUserid;
	}

	public VLegalDURel toEscapedModel() {
		if (isEscapedModel()) {
			return (VLegalDURel)this;
		}
		else {
			return (VLegalDURel)Proxy.newProxyInstance(VLegalDURel.class.getClassLoader(),
				new Class[] { VLegalDURel.class },
				new AutoEscapeBeanHandler(this));
		}
	}

	public Object clone() {
		VLegalDURelImpl vLegalDURelImpl = new VLegalDURelImpl();

		vLegalDURelImpl.setDepartmentId(getDepartmentId());

		vLegalDURelImpl.setUserid(getUserid());

		VLegalDURelModelImpl vLegalDURelModelImpl = vLegalDURelImpl;

		vLegalDURelModelImpl._originalUserid = vLegalDURelModelImpl._userid;

		vLegalDURelModelImpl._setOriginalUserid = false;

		return vLegalDURelImpl;
	}

	public int compareTo(VLegalDURel vLegalDURel) {
		int value = 0;

		if (getDepartmentId() < vLegalDURel.getDepartmentId()) {
			value = -1;
		}
		else if (getDepartmentId() > vLegalDURel.getDepartmentId()) {
			value = 1;
		}
		else {
			value = 0;
		}

		value = value * -1;

		if (value != 0) {
			return value;
		}

		if (getUserid() < vLegalDURel.getUserid()) {
			value = -1;
		}
		else if (getUserid() > vLegalDURel.getUserid()) {
			value = 1;
		}
		else {
			value = 0;
		}

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

		VLegalDURel vLegalDURel = null;

		try {
			vLegalDURel = (VLegalDURel)obj;
		}
		catch (ClassCastException cce) {
			return false;
		}

		VLegalDURelPK pk = vLegalDURel.getPrimaryKey();

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
		sb.append(", userid=");
		sb.append(getUserid());
		sb.append("}");

		return sb.toString();
	}

	public String toXmlString() {
		StringBundler sb = new StringBundler(10);

		sb.append("<model><model-name>");
		sb.append("com.vportal.portlet.vlegal.model.VLegalDURel");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>departmentId</column-name><column-value><![CDATA[");
		sb.append(getDepartmentId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>userid</column-name><column-value><![CDATA[");
		sb.append(getUserid());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _departmentId;
	private long _userid;
	private long _originalUserid;
	private boolean _setOriginalUserid;
}