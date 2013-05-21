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

package com.vportal.portal.model;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.util.DateUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.impl.BaseModelImpl;

import java.io.Serializable;

import java.lang.reflect.Proxy;

import java.util.Date;

/**
 * @author HOAN
 */
public class AccessCounterClp extends BaseModelImpl<AccessCounter>
	implements AccessCounter {
	public AccessCounterClp() {
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

	public long getCompanyId() {
		return _companyId;
	}

	public void setCompanyId(long companyId) {
		_companyId = companyId;
	}

	public Date getAccessDate() {
		return _accessDate;
	}

	public void setAccessDate(Date accessDate) {
		_accessDate = accessDate;
	}

	public int getAccessCount() {
		return _accessCount;
	}

	public void setAccessCount(int accessCount) {
		_accessCount = accessCount;
	}

	public AccessCounter toEscapedModel() {
		if (isEscapedModel()) {
			return this;
		}
		else {
			return (AccessCounter)Proxy.newProxyInstance(AccessCounter.class.getClassLoader(),
				new Class[] { AccessCounter.class },
				new AutoEscapeBeanHandler(this));
		}
	}

	public Object clone() {
		AccessCounterClp clone = new AccessCounterClp();

		clone.setId(getId());
		clone.setCompanyId(getCompanyId());
		clone.setAccessDate(getAccessDate());
		clone.setAccessCount(getAccessCount());

		return clone;
	}

	public int compareTo(AccessCounter accessCounter) {
		int value = 0;

		value = DateUtil.compareTo(getAccessDate(),
				accessCounter.getAccessDate());

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

		AccessCounterClp accessCounter = null;

		try {
			accessCounter = (AccessCounterClp)obj;
		}
		catch (ClassCastException cce) {
			return false;
		}

		long pk = accessCounter.getPrimaryKey();

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
		StringBundler sb = new StringBundler(9);

		sb.append("{id=");
		sb.append(getId());
		sb.append(", companyId=");
		sb.append(getCompanyId());
		sb.append(", accessDate=");
		sb.append(getAccessDate());
		sb.append(", accessCount=");
		sb.append(getAccessCount());
		sb.append("}");

		return sb.toString();
	}

	public String toXmlString() {
		StringBundler sb = new StringBundler(16);

		sb.append("<model><model-name>");
		sb.append("com.vportal.portal.model.AccessCounter");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>id</column-name><column-value><![CDATA[");
		sb.append(getId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>companyId</column-name><column-value><![CDATA[");
		sb.append(getCompanyId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>accessDate</column-name><column-value><![CDATA[");
		sb.append(getAccessDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>accessCount</column-name><column-value><![CDATA[");
		sb.append(getAccessCount());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _id;
	private long _companyId;
	private Date _accessDate;
	private int _accessCount;
}