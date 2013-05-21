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

import com.vportal.portlet.vlegal.service.persistence.VLegalDSRelPK;

import java.io.Serializable;

import java.lang.reflect.Proxy;

/**
 * @author ACB
 */
public class VLegalDSRelClp extends BaseModelImpl<VLegalDSRel>
	implements VLegalDSRel {
	public VLegalDSRelClp() {
	}

	public VLegalDSRelPK getPrimaryKey() {
		return new VLegalDSRelPK(_sigId, _docId);
	}

	public void setPrimaryKey(VLegalDSRelPK pk) {
		setSigId(pk.sigId);
		setDocId(pk.docId);
	}

	public Serializable getPrimaryKeyObj() {
		return new VLegalDSRelPK(_sigId, _docId);
	}

	public String getSigId() {
		return _sigId;
	}

	public void setSigId(String sigId) {
		_sigId = sigId;
	}

	public String getDocId() {
		return _docId;
	}

	public void setDocId(String docId) {
		_docId = docId;
	}

	public VLegalDSRel toEscapedModel() {
		if (isEscapedModel()) {
			return this;
		}
		else {
			return (VLegalDSRel)Proxy.newProxyInstance(VLegalDSRel.class.getClassLoader(),
				new Class[] { VLegalDSRel.class },
				new AutoEscapeBeanHandler(this));
		}
	}

	public Object clone() {
		VLegalDSRelClp clone = new VLegalDSRelClp();

		clone.setSigId(getSigId());
		clone.setDocId(getDocId());

		return clone;
	}

	public int compareTo(VLegalDSRel vLegalDSRel) {
		int value = 0;

		value = getSigId().compareTo(vLegalDSRel.getSigId());

		value = value * -1;

		if (value != 0) {
			return value;
		}

		value = getDocId().compareTo(vLegalDSRel.getDocId());

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

		VLegalDSRelClp vLegalDSRel = null;

		try {
			vLegalDSRel = (VLegalDSRelClp)obj;
		}
		catch (ClassCastException cce) {
			return false;
		}

		VLegalDSRelPK pk = vLegalDSRel.getPrimaryKey();

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

		sb.append("{sigId=");
		sb.append(getSigId());
		sb.append(", docId=");
		sb.append(getDocId());
		sb.append("}");

		return sb.toString();
	}

	public String toXmlString() {
		StringBundler sb = new StringBundler(10);

		sb.append("<model><model-name>");
		sb.append("com.vportal.portlet.vlegal.model.VLegalDSRel");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>sigId</column-name><column-value><![CDATA[");
		sb.append(getSigId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>docId</column-name><column-value><![CDATA[");
		sb.append(getDocId());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private String _sigId;
	private String _docId;
}