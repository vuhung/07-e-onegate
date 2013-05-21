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

package com.vportal.portlet.vcms.service.persistence;

import com.liferay.portal.kernel.util.DateUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;

import java.io.Serializable;

import java.util.Date;

/**
 * @author HOAN
 */
public class VcmsArticleStatusPK implements Comparable<VcmsArticleStatusPK>,
	Serializable {
	public long statusId;
	public String articleId;
	public String categoryId;
	public Date createdDate;

	public VcmsArticleStatusPK() {
	}

	public VcmsArticleStatusPK(long statusId, String articleId,
		String categoryId, Date createdDate) {
		this.statusId = statusId;
		this.articleId = articleId;
		this.categoryId = categoryId;
		this.createdDate = createdDate;
	}

	public long getStatusId() {
		return statusId;
	}

	public void setStatusId(long statusId) {
		this.statusId = statusId;
	}

	public String getArticleId() {
		return articleId;
	}

	public void setArticleId(String articleId) {
		this.articleId = articleId;
	}

	public String getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(String categoryId) {
		this.categoryId = categoryId;
	}

	public Date getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	public int compareTo(VcmsArticleStatusPK pk) {
		if (pk == null) {
			return -1;
		}

		int value = 0;

		if (statusId < pk.statusId) {
			value = -1;
		}
		else if (statusId > pk.statusId) {
			value = 1;
		}
		else {
			value = 0;
		}

		if (value != 0) {
			return value;
		}

		value = articleId.compareTo(pk.articleId);

		if (value != 0) {
			return value;
		}

		value = categoryId.compareTo(pk.categoryId);

		if (value != 0) {
			return value;
		}

		value = DateUtil.compareTo(createdDate, pk.createdDate);

		if (value != 0) {
			return value;
		}

		return 0;
	}

	public boolean equals(Object obj) {
		if (obj == null) {
			return false;
		}

		VcmsArticleStatusPK pk = null;

		try {
			pk = (VcmsArticleStatusPK)obj;
		}
		catch (ClassCastException cce) {
			return false;
		}

		if ((statusId == pk.statusId) && (articleId.equals(pk.articleId)) &&
				(categoryId.equals(pk.categoryId)) &&
				(createdDate.equals(pk.createdDate))) {
			return true;
		}
		else {
			return false;
		}
	}

	public int hashCode() {
		return (String.valueOf(statusId) + String.valueOf(articleId) +
		String.valueOf(categoryId) + createdDate.toString()).hashCode();
	}

	public String toString() {
		StringBundler sb = new StringBundler(20);

		sb.append(StringPool.OPEN_CURLY_BRACE);

		sb.append("statusId");
		sb.append(StringPool.EQUAL);
		sb.append(statusId);

		sb.append(StringPool.COMMA);
		sb.append(StringPool.SPACE);
		sb.append("articleId");
		sb.append(StringPool.EQUAL);
		sb.append(articleId);

		sb.append(StringPool.COMMA);
		sb.append(StringPool.SPACE);
		sb.append("categoryId");
		sb.append(StringPool.EQUAL);
		sb.append(categoryId);

		sb.append(StringPool.COMMA);
		sb.append(StringPool.SPACE);
		sb.append("createdDate");
		sb.append(StringPool.EQUAL);
		sb.append(createdDate);

		sb.append(StringPool.CLOSE_CURLY_BRACE);

		return sb.toString();
	}
}