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

import com.vportal.portlet.vlegal.service.persistence.VLegalFORelPK;

import java.io.Serializable;

import java.lang.reflect.Proxy;

/**
 * @author ACB
 */
public class VLegalFORelClp extends BaseModelImpl<VLegalFORel>
	implements VLegalFORel {
	public VLegalFORelClp() {
	}

	public VLegalFORelPK getPrimaryKey() {
		return new VLegalFORelPK(_fieldId, _orgId);
	}

	public void setPrimaryKey(VLegalFORelPK pk) {
		setFieldId(pk.fieldId);
		setOrgId(pk.orgId);
	}

	public Serializable getPrimaryKeyObj() {
		return new VLegalFORelPK(_fieldId, _orgId);
	}

	public String getFieldId() {
		return _fieldId;
	}

	public void setFieldId(String fieldId) {
		_fieldId = fieldId;
	}

	public String getOrgId() {
		return _orgId;
	}

	public void setOrgId(String orgId) {
		_orgId = orgId;
	}

	public VLegalFORel toEscapedModel() {
		if (isEscapedModel()) {
			return this;
		}
		else {
			return (VLegalFORel)Proxy.newProxyInstance(VLegalFORel.class.getClassLoader(),
				new Class[] { VLegalFORel.class },
				new AutoEscapeBeanHandler(this));
		}
	}

	public Object clone() {
		VLegalFORelClp clone = new VLegalFORelClp();

		clone.setFieldId(getFieldId());
		clone.setOrgId(getOrgId());

		return clone;
	}

	public int compareTo(VLegalFORel vLegalFORel) {
		int value = 0;

		value = getFieldId().compareTo(vLegalFORel.getFieldId());

		value = value * -1;

		if (value != 0) {
			return value;
		}

		value = getOrgId().compareTo(vLegalFORel.getOrgId());

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

		VLegalFORelClp vLegalFORel = null;

		try {
			vLegalFORel = (VLegalFORelClp)obj;
		}
		catch (ClassCastException cce) {
			return false;
		}

		VLegalFORelPK pk = vLegalFORel.getPrimaryKey();

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

		sb.append("{fieldId=");
		sb.append(getFieldId());
		sb.append(", orgId=");
		sb.append(getOrgId());
		sb.append("}");

		return sb.toString();
	}

	public String toXmlString() {
		StringBundler sb = new StringBundler(10);

		sb.append("<model><model-name>");
		sb.append("com.vportal.portlet.vlegal.model.VLegalFORel");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>fieldId</column-name><column-value><![CDATA[");
		sb.append(getFieldId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>orgId</column-name><column-value><![CDATA[");
		sb.append(getOrgId());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private String _fieldId;
	private String _orgId;
}