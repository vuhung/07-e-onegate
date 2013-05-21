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
public class VLegalFTRelPK implements Comparable<VLegalFTRelPK>, Serializable {
	public String fieldId;
	public String typeId;

	public VLegalFTRelPK() {
	}

	public VLegalFTRelPK(String fieldId, String typeId) {
		this.fieldId = fieldId;
		this.typeId = typeId;
	}

	public String getFieldId() {
		return fieldId;
	}

	public void setFieldId(String fieldId) {
		this.fieldId = fieldId;
	}

	public String getTypeId() {
		return typeId;
	}

	public void setTypeId(String typeId) {
		this.typeId = typeId;
	}

	public int compareTo(VLegalFTRelPK pk) {
		if (pk == null) {
			return -1;
		}

		int value = 0;

		value = fieldId.compareTo(pk.fieldId);

		if (value != 0) {
			return value;
		}

		value = typeId.compareTo(pk.typeId);

		if (value != 0) {
			return value;
		}

		return 0;
	}

	public boolean equals(Object obj) {
		if (obj == null) {
			return false;
		}

		VLegalFTRelPK pk = null;

		try {
			pk = (VLegalFTRelPK)obj;
		}
		catch (ClassCastException cce) {
			return false;
		}

		if ((fieldId.equals(pk.fieldId)) && (typeId.equals(pk.typeId))) {
			return true;
		}
		else {
			return false;
		}
	}

	public int hashCode() {
		return (String.valueOf(fieldId) + String.valueOf(typeId)).hashCode();
	}

	public String toString() {
		StringBundler sb = new StringBundler(10);

		sb.append(StringPool.OPEN_CURLY_BRACE);

		sb.append("fieldId");
		sb.append(StringPool.EQUAL);
		sb.append(fieldId);

		sb.append(StringPool.COMMA);
		sb.append(StringPool.SPACE);
		sb.append("typeId");
		sb.append(StringPool.EQUAL);
		sb.append(typeId);

		sb.append(StringPool.CLOSE_CURLY_BRACE);

		return sb.toString();
	}
}