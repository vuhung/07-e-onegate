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

package com.vportal.portlet.vlegal.service.persistence;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;

import java.io.Serializable;

/**
 * @author ACB
 */
public class VLegalDURelPK implements Comparable<VLegalDURelPK>, Serializable {
	public long departmentId;
	public long userid;

	public VLegalDURelPK() {
	}

	public VLegalDURelPK(long departmentId, long userid) {
		this.departmentId = departmentId;
		this.userid = userid;
	}

	public long getDepartmentId() {
		return departmentId;
	}

	public void setDepartmentId(long departmentId) {
		this.departmentId = departmentId;
	}

	public long getUserid() {
		return userid;
	}

	public void setUserid(long userid) {
		this.userid = userid;
	}

	public int compareTo(VLegalDURelPK pk) {
		if (pk == null) {
			return -1;
		}

		int value = 0;

		if (departmentId < pk.departmentId) {
			value = -1;
		}
		else if (departmentId > pk.departmentId) {
			value = 1;
		}
		else {
			value = 0;
		}

		if (value != 0) {
			return value;
		}

		if (userid < pk.userid) {
			value = -1;
		}
		else if (userid > pk.userid) {
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

		VLegalDURelPK pk = null;

		try {
			pk = (VLegalDURelPK)obj;
		}
		catch (ClassCastException cce) {
			return false;
		}

		if ((departmentId == pk.departmentId) && (userid == pk.userid)) {
			return true;
		}
		else {
			return false;
		}
	}

	public int hashCode() {
		return (String.valueOf(departmentId) + String.valueOf(userid)).hashCode();
	}

	public String toString() {
		StringBundler sb = new StringBundler(10);

		sb.append(StringPool.OPEN_CURLY_BRACE);

		sb.append("departmentId");
		sb.append(StringPool.EQUAL);
		sb.append(departmentId);

		sb.append(StringPool.COMMA);
		sb.append(StringPool.SPACE);
		sb.append("userid");
		sb.append(StringPool.EQUAL);
		sb.append(userid);

		sb.append(StringPool.CLOSE_CURLY_BRACE);

		return sb.toString();
	}
}