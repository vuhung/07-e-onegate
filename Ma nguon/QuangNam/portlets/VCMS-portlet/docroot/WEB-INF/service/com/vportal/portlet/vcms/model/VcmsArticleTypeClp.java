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

package com.vportal.portlet.vcms.model;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.impl.BaseModelImpl;

import com.vportal.portlet.vcms.service.persistence.VcmsArticleTypePK;

import java.io.Serializable;

import java.lang.reflect.Proxy;

/**
 * @author HOAN
 */
public class VcmsArticleTypeClp extends BaseModelImpl<VcmsArticleType>
	implements VcmsArticleType {
	public VcmsArticleTypeClp() {
	}

	public VcmsArticleTypePK getPrimaryKey() {
		return new VcmsArticleTypePK(_typeId, _articleId);
	}

	public void setPrimaryKey(VcmsArticleTypePK pk) {
		setTypeId(pk.typeId);
		setArticleId(pk.articleId);
	}

	public Serializable getPrimaryKeyObj() {
		return new VcmsArticleTypePK(_typeId, _articleId);
	}

	public long getTypeId() {
		return _typeId;
	}

	public void setTypeId(long typeId) {
		_typeId = typeId;
	}

	public String getArticleId() {
		return _articleId;
	}

	public void setArticleId(String articleId) {
		_articleId = articleId;
	}

	public int getPosition() {
		return _position;
	}

	public void setPosition(int position) {
		_position = position;
	}

	public VcmsArticleType toEscapedModel() {
		if (isEscapedModel()) {
			return this;
		}
		else {
			return (VcmsArticleType)Proxy.newProxyInstance(VcmsArticleType.class.getClassLoader(),
				new Class[] { VcmsArticleType.class },
				new AutoEscapeBeanHandler(this));
		}
	}

	public Object clone() {
		VcmsArticleTypeClp clone = new VcmsArticleTypeClp();

		clone.setTypeId(getTypeId());
		clone.setArticleId(getArticleId());
		clone.setPosition(getPosition());

		return clone;
	}

	public int compareTo(VcmsArticleType vcmsArticleType) {
		int value = 0;

		if (getPosition() < vcmsArticleType.getPosition()) {
			value = -1;
		}
		else if (getPosition() > vcmsArticleType.getPosition()) {
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

		VcmsArticleTypeClp vcmsArticleType = null;

		try {
			vcmsArticleType = (VcmsArticleTypeClp)obj;
		}
		catch (ClassCastException cce) {
			return false;
		}

		VcmsArticleTypePK pk = vcmsArticleType.getPrimaryKey();

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
		StringBundler sb = new StringBundler(7);

		sb.append("{typeId=");
		sb.append(getTypeId());
		sb.append(", articleId=");
		sb.append(getArticleId());
		sb.append(", position=");
		sb.append(getPosition());
		sb.append("}");

		return sb.toString();
	}

	public String toXmlString() {
		StringBundler sb = new StringBundler(13);

		sb.append("<model><model-name>");
		sb.append("com.vportal.portlet.vcms.model.VcmsArticleType");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>typeId</column-name><column-value><![CDATA[");
		sb.append(getTypeId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>articleId</column-name><column-value><![CDATA[");
		sb.append(getArticleId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>position</column-name><column-value><![CDATA[");
		sb.append(getPosition());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _typeId;
	private String _articleId;
	private int _position;
}