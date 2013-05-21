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

import com.vportal.portlet.vlegal.service.persistence.VLegalDFRelPK;

import java.io.Serializable;

import java.lang.reflect.Proxy;

/**
 * @author ACB
 */
public class VLegalDFRelClp extends BaseModelImpl<VLegalDFRel>
	implements VLegalDFRel {
	public VLegalDFRelClp() {
	}

	public VLegalDFRelPK getPrimaryKey() {
		return new VLegalDFRelPK(_fieldId, _docId);
	}

	public void setPrimaryKey(VLegalDFRelPK pk) {
		setFieldId(pk.fieldId);
		setDocId(pk.docId);
	}

	public Serializable getPrimaryKeyObj() {
		return new VLegalDFRelPK(_fieldId, _docId);
	}

	public String getFieldId() {
		return _fieldId;
	}

	public void setFieldId(String fieldId) {
		_fieldId = fieldId;
	}

	public String getDocId() {
		return _docId;
	}

	public void setDocId(String docId) {
		_docId = docId;
	}

	public VLegalDFRel toEscapedModel() {
		if (isEscapedModel()) {
			return this;
		}
		else {
			return (VLegalDFRel)Proxy.newProxyInstance(VLegalDFRel.class.getClassLoader(),
				new Class[] { VLegalDFRel.class },
				new AutoEscapeBeanHandler(this));
		}
	}

	public Object clone() {
		VLegalDFRelClp clone = new VLegalDFRelClp();

		clone.setFieldId(getFieldId());
		clone.setDocId(getDocId());

		return clone;
	}

	public int compareTo(VLegalDFRel vLegalDFRel) {
		int value = 0;

		value = getFieldId().compareTo(vLegalDFRel.getFieldId());

		value = value * -1;

		if (value != 0) {
			return value;
		}

		value = getDocId().compareTo(vLegalDFRel.getDocId());

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

		VLegalDFRelClp vLegalDFRel = null;

		try {
			vLegalDFRel = (VLegalDFRelClp)obj;
		}
		catch (ClassCastException cce) {
			return false;
		}

		VLegalDFRelPK pk = vLegalDFRel.getPrimaryKey();

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
		sb.append(", docId=");
		sb.append(getDocId());
		sb.append("}");

		return sb.toString();
	}

	public String toXmlString() {
		StringBundler sb = new StringBundler(10);

		sb.append("<model><model-name>");
		sb.append("com.vportal.portlet.vlegal.model.VLegalDFRel");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>fieldId</column-name><column-value><![CDATA[");
		sb.append(getFieldId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>docId</column-name><column-value><![CDATA[");
		sb.append(getDocId());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private String _fieldId;
	private String _docId;
}