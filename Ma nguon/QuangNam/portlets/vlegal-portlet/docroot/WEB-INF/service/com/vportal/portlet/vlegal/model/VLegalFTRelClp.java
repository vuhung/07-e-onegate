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

import com.vportal.portlet.vlegal.service.persistence.VLegalFTRelPK;

import java.io.Serializable;

import java.lang.reflect.Proxy;

/**
 * @author ACB
 */
public class VLegalFTRelClp extends BaseModelImpl<VLegalFTRel>
	implements VLegalFTRel {
	public VLegalFTRelClp() {
	}

	public VLegalFTRelPK getPrimaryKey() {
		return new VLegalFTRelPK(_fieldId, _typeId);
	}

	public void setPrimaryKey(VLegalFTRelPK pk) {
		setFieldId(pk.fieldId);
		setTypeId(pk.typeId);
	}

	public Serializable getPrimaryKeyObj() {
		return new VLegalFTRelPK(_fieldId, _typeId);
	}

	public String getFieldId() {
		return _fieldId;
	}

	public void setFieldId(String fieldId) {
		_fieldId = fieldId;
	}

	public String getTypeId() {
		return _typeId;
	}

	public void setTypeId(String typeId) {
		_typeId = typeId;
	}

	public VLegalFTRel toEscapedModel() {
		if (isEscapedModel()) {
			return this;
		}
		else {
			return (VLegalFTRel)Proxy.newProxyInstance(VLegalFTRel.class.getClassLoader(),
				new Class[] { VLegalFTRel.class },
				new AutoEscapeBeanHandler(this));
		}
	}

	public Object clone() {
		VLegalFTRelClp clone = new VLegalFTRelClp();

		clone.setFieldId(getFieldId());
		clone.setTypeId(getTypeId());

		return clone;
	}

	public int compareTo(VLegalFTRel vLegalFTRel) {
		int value = 0;

		value = getFieldId().compareTo(vLegalFTRel.getFieldId());

		value = value * -1;

		if (value != 0) {
			return value;
		}

		value = getTypeId().compareTo(vLegalFTRel.getTypeId());

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

		VLegalFTRelClp vLegalFTRel = null;

		try {
			vLegalFTRel = (VLegalFTRelClp)obj;
		}
		catch (ClassCastException cce) {
			return false;
		}

		VLegalFTRelPK pk = vLegalFTRel.getPrimaryKey();

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
		sb.append(", typeId=");
		sb.append(getTypeId());
		sb.append("}");

		return sb.toString();
	}

	public String toXmlString() {
		StringBundler sb = new StringBundler(10);

		sb.append("<model><model-name>");
		sb.append("com.vportal.portlet.vlegal.model.VLegalFTRel");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>fieldId</column-name><column-value><![CDATA[");
		sb.append(getFieldId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>typeId</column-name><column-value><![CDATA[");
		sb.append(getTypeId());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private String _fieldId;
	private String _typeId;
}