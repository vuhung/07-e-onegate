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
public class VLegalDDRelPK implements Comparable<VLegalDDRelPK>, Serializable {
	public long departmentId;
	public String docId;

	public VLegalDDRelPK() {
	}

	public VLegalDDRelPK(long departmentId, String docId) {
		this.departmentId = departmentId;
		this.docId = docId;
	}

	public long getDepartmentId() {
		return departmentId;
	}

	public void setDepartmentId(long departmentId) {
		this.departmentId = departmentId;
	}

	public String getDocId() {
		return docId;
	}

	public void setDocId(String docId) {
		this.docId = docId;
	}

	public int compareTo(VLegalDDRelPK pk) {
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

		value = docId.compareTo(pk.docId);

		if (value != 0) {
			return value;
		}

		return 0;
	}

	public boolean equals(Object obj) {
		if (obj == null) {
			return false;
		}

		VLegalDDRelPK pk = null;

		try {
			pk = (VLegalDDRelPK)obj;
		}
		catch (ClassCastException cce) {
			return false;
		}

		if ((departmentId == pk.departmentId) && (docId.equals(pk.docId))) {
			return true;
		}
		else {
			return false;
		}
	}

	public int hashCode() {
		return (String.valueOf(departmentId) + String.valueOf(docId)).hashCode();
	}

	public String toString() {
		StringBundler sb = new StringBundler(10);

		sb.append(StringPool.OPEN_CURLY_BRACE);

		sb.append("departmentId");
		sb.append(StringPool.EQUAL);
		sb.append(departmentId);

		sb.append(StringPool.COMMA);
		sb.append(StringPool.SPACE);
		sb.append("docId");
		sb.append(StringPool.EQUAL);
		sb.append(docId);

		sb.append(StringPool.CLOSE_CURLY_BRACE);

		return sb.toString();
	}
}