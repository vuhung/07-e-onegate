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

package com.vportal.portlet.vlegal.model;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.impl.BaseModelImpl;

import com.vportal.portlet.vlegal.service.persistence.VLegalDURelPK;

import java.io.Serializable;

import java.lang.reflect.Proxy;

/**
 * @author ACB
 */
public class VLegalDURelClp extends BaseModelImpl<VLegalDURel>
	implements VLegalDURel {
	public VLegalDURelClp() {
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
		_userid = userid;
	}

	public VLegalDURel toEscapedModel() {
		if (isEscapedModel()) {
			return this;
		}
		else {
			return (VLegalDURel)Proxy.newProxyInstance(VLegalDURel.class.getClassLoader(),
				new Class[] { VLegalDURel.class },
				new AutoEscapeBeanHandler(this));
		}
	}

	public Object clone() {
		VLegalDURelClp clone = new VLegalDURelClp();

		clone.setDepartmentId(getDepartmentId());
		clone.setUserid(getUserid());

		return clone;
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

		VLegalDURelClp vLegalDURel = null;

		try {
			vLegalDURel = (VLegalDURelClp)obj;
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
}