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

import com.vportal.portlet.vlegal.service.persistence.VLegalDDRelPK;

import java.io.Serializable;

import java.lang.reflect.Proxy;

/**
 * @author ACB
 */
public class VLegalDDRelClp extends BaseModelImpl<VLegalDDRel>
	implements VLegalDDRel {
	public VLegalDDRelClp() {
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
		return _docId;
	}

	public void setDocId(String docId) {
		_docId = docId;
	}

	public VLegalDDRel toEscapedModel() {
		if (isEscapedModel()) {
			return this;
		}
		else {
			return (VLegalDDRel)Proxy.newProxyInstance(VLegalDDRel.class.getClassLoader(),
				new Class[] { VLegalDDRel.class },
				new AutoEscapeBeanHandler(this));
		}
	}

	public Object clone() {
		VLegalDDRelClp clone = new VLegalDDRelClp();

		clone.setDepartmentId(getDepartmentId());
		clone.setDocId(getDocId());

		return clone;
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

		VLegalDDRelClp vLegalDDRel = null;

		try {
			vLegalDDRel = (VLegalDDRelClp)obj;
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