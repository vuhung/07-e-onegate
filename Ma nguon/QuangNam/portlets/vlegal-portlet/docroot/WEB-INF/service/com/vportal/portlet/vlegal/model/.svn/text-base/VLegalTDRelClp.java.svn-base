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

import com.vportal.portlet.vlegal.service.persistence.VLegalTDRelPK;

import java.io.Serializable;

import java.lang.reflect.Proxy;

/**
 * @author ACB
 */
public class VLegalTDRelClp extends BaseModelImpl<VLegalTDRel>
	implements VLegalTDRel {
	public VLegalTDRelClp() {
	}

	public VLegalTDRelPK getPrimaryKey() {
		return new VLegalTDRelPK(_docId, _tagId);
	}

	public void setPrimaryKey(VLegalTDRelPK pk) {
		setDocId(pk.docId);
		setTagId(pk.tagId);
	}

	public Serializable getPrimaryKeyObj() {
		return new VLegalTDRelPK(_docId, _tagId);
	}

	public String getDocId() {
		return _docId;
	}

	public void setDocId(String docId) {
		_docId = docId;
	}

	public String getTagId() {
		return _tagId;
	}

	public void setTagId(String tagId) {
		_tagId = tagId;
	}

	public VLegalTDRel toEscapedModel() {
		if (isEscapedModel()) {
			return this;
		}
		else {
			return (VLegalTDRel)Proxy.newProxyInstance(VLegalTDRel.class.getClassLoader(),
				new Class[] { VLegalTDRel.class },
				new AutoEscapeBeanHandler(this));
		}
	}

	public Object clone() {
		VLegalTDRelClp clone = new VLegalTDRelClp();

		clone.setDocId(getDocId());
		clone.setTagId(getTagId());

		return clone;
	}

	public int compareTo(VLegalTDRel vLegalTDRel) {
		int value = 0;

		value = getDocId().compareTo(vLegalTDRel.getDocId());

		value = value * -1;

		if (value != 0) {
			return value;
		}

		value = getTagId().compareTo(vLegalTDRel.getTagId());

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

		VLegalTDRelClp vLegalTDRel = null;

		try {
			vLegalTDRel = (VLegalTDRelClp)obj;
		}
		catch (ClassCastException cce) {
			return false;
		}

		VLegalTDRelPK pk = vLegalTDRel.getPrimaryKey();

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

		sb.append("{docId=");
		sb.append(getDocId());
		sb.append(", tagId=");
		sb.append(getTagId());
		sb.append("}");

		return sb.toString();
	}

	public String toXmlString() {
		StringBundler sb = new StringBundler(10);

		sb.append("<model><model-name>");
		sb.append("com.vportal.portlet.vlegal.model.VLegalTDRel");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>docId</column-name><column-value><![CDATA[");
		sb.append(getDocId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>tagId</column-name><column-value><![CDATA[");
		sb.append(getTagId());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private String _docId;
	private String _tagId;
}