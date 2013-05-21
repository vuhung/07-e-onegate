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
public class VLegalDSRelPK implements Comparable<VLegalDSRelPK>, Serializable {
	public String sigId;
	public String docId;

	public VLegalDSRelPK() {
	}

	public VLegalDSRelPK(String sigId, String docId) {
		this.sigId = sigId;
		this.docId = docId;
	}

	public String getSigId() {
		return sigId;
	}

	public void setSigId(String sigId) {
		this.sigId = sigId;
	}

	public String getDocId() {
		return docId;
	}

	public void setDocId(String docId) {
		this.docId = docId;
	}

	public int compareTo(VLegalDSRelPK pk) {
		if (pk == null) {
			return -1;
		}

		int value = 0;

		value = sigId.compareTo(pk.sigId);

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

		VLegalDSRelPK pk = null;

		try {
			pk = (VLegalDSRelPK)obj;
		}
		catch (ClassCastException cce) {
			return false;
		}

		if ((sigId.equals(pk.sigId)) && (docId.equals(pk.docId))) {
			return true;
		}
		else {
			return false;
		}
	}

	public int hashCode() {
		return (String.valueOf(sigId) + String.valueOf(docId)).hashCode();
	}

	public String toString() {
		StringBundler sb = new StringBundler(10);

		sb.append(StringPool.OPEN_CURLY_BRACE);

		sb.append("sigId");
		sb.append(StringPool.EQUAL);
		sb.append(sigId);

		sb.append(StringPool.COMMA);
		sb.append(StringPool.SPACE);
		sb.append("docId");
		sb.append(StringPool.EQUAL);
		sb.append(docId);

		sb.append(StringPool.CLOSE_CURLY_BRACE);

		return sb.toString();
	}
}