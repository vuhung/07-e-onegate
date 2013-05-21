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
public class VLegalTDRelPK implements Comparable<VLegalTDRelPK>, Serializable {
	public String docId;
	public String tagId;

	public VLegalTDRelPK() {
	}

	public VLegalTDRelPK(String docId, String tagId) {
		this.docId = docId;
		this.tagId = tagId;
	}

	public String getDocId() {
		return docId;
	}

	public void setDocId(String docId) {
		this.docId = docId;
	}

	public String getTagId() {
		return tagId;
	}

	public void setTagId(String tagId) {
		this.tagId = tagId;
	}

	public int compareTo(VLegalTDRelPK pk) {
		if (pk == null) {
			return -1;
		}

		int value = 0;

		value = docId.compareTo(pk.docId);

		if (value != 0) {
			return value;
		}

		value = tagId.compareTo(pk.tagId);

		if (value != 0) {
			return value;
		}

		return 0;
	}

	public boolean equals(Object obj) {
		if (obj == null) {
			return false;
		}

		VLegalTDRelPK pk = null;

		try {
			pk = (VLegalTDRelPK)obj;
		}
		catch (ClassCastException cce) {
			return false;
		}

		if ((docId.equals(pk.docId)) && (tagId.equals(pk.tagId))) {
			return true;
		}
		else {
			return false;
		}
	}

	public int hashCode() {
		return (String.valueOf(docId) + String.valueOf(tagId)).hashCode();
	}

	public String toString() {
		StringBundler sb = new StringBundler(10);

		sb.append(StringPool.OPEN_CURLY_BRACE);

		sb.append("docId");
		sb.append(StringPool.EQUAL);
		sb.append(docId);

		sb.append(StringPool.COMMA);
		sb.append(StringPool.SPACE);
		sb.append("tagId");
		sb.append(StringPool.EQUAL);
		sb.append(tagId);

		sb.append(StringPool.CLOSE_CURLY_BRACE);

		return sb.toString();
	}
}