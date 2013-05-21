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

package com.vportal.portlet.vcms.service.http;

import com.liferay.portal.kernel.json.JSONArray;
import com.liferay.portal.kernel.json.JSONFactoryUtil;
import com.liferay.portal.kernel.json.JSONObject;
import com.liferay.portal.kernel.util.StringPool;

import com.vportal.portlet.vcms.model.VcmsArticle;

import java.util.Date;
import java.util.List;

/**
 * @author    HOAN
 * @generated
 */
public class VcmsArticleJSONSerializer {
	public static JSONObject toJSONObject(VcmsArticle model) {
		JSONObject jsonObj = JSONFactoryUtil.createJSONObject();

		jsonObj.put("articleId", model.getArticleId());
		jsonObj.put("groupId", model.getGroupId());
		jsonObj.put("companyId", model.getCompanyId());
		jsonObj.put("createdByUser", model.getCreatedByUser());

		Date createdDate = model.getCreatedDate();

		String createdDateJSON = StringPool.BLANK;

		if (createdDate != null) {
			createdDateJSON = String.valueOf(createdDate.getTime());
		}

		jsonObj.put("createdDate", createdDateJSON);
		jsonObj.put("modifiedByUser", model.getModifiedByUser());

		Date modifiedDate = model.getModifiedDate();

		String modifiedDateJSON = StringPool.BLANK;

		if (modifiedDate != null) {
			modifiedDateJSON = String.valueOf(modifiedDate.getTime());
		}

		jsonObj.put("modifiedDate", modifiedDateJSON);
		jsonObj.put("approvedByUser", model.getApprovedByUser());

		Date approvedDate = model.getApprovedDate();

		String approvedDateJSON = StringPool.BLANK;

		if (approvedDate != null) {
			approvedDateJSON = String.valueOf(approvedDate.getTime());
		}

		jsonObj.put("approvedDate", approvedDateJSON);
		jsonObj.put("publishedByUser", model.getPublishedByUser());

		Date publishedDate = model.getPublishedDate();

		String publishedDateJSON = StringPool.BLANK;

		if (publishedDate != null) {
			publishedDateJSON = String.valueOf(publishedDate.getTime());
		}

		jsonObj.put("publishedDate", publishedDateJSON);
		jsonObj.put("status", model.getStatus());
		jsonObj.put("title", model.getTitle());
		jsonObj.put("lead", model.getLead());
		jsonObj.put("content", model.getContent());
		jsonObj.put("hasImage", model.getHasImage());
		jsonObj.put("imageTitle", model.getImageTitle());
		jsonObj.put("image", model.getImage());
		jsonObj.put("author", model.getAuthor());
		jsonObj.put("source", model.getSource());
		jsonObj.put("language", model.getLanguage());
		jsonObj.put("userHit", model.getUserHit());
		jsonObj.put("discussible", model.getDiscussible());
		jsonObj.put("hasAttachment", model.getHasAttachment());
		jsonObj.put("hasPoll", model.getHasPoll());
		jsonObj.put("pollId", model.getPollId());

		Date effectiveDate = model.getEffectiveDate();

		String effectiveDateJSON = StringPool.BLANK;

		if (effectiveDate != null) {
			effectiveDateJSON = String.valueOf(effectiveDate.getTime());
		}

		jsonObj.put("effectiveDate", effectiveDateJSON);

		Date expireDate = model.getExpireDate();

		String expireDateJSON = StringPool.BLANK;

		if (expireDate != null) {
			expireDateJSON = String.valueOf(expireDate.getTime());
		}

		jsonObj.put("expireDate", expireDateJSON);
		jsonObj.put("sticky", model.getSticky());
		jsonObj.put("stickyNeverExpired", model.getStickyNeverExpired());

		Date stickyExpireDate = model.getStickyExpireDate();

		String stickyExpireDateJSON = StringPool.BLANK;

		if (stickyExpireDate != null) {
			stickyExpireDateJSON = String.valueOf(stickyExpireDate.getTime());
		}

		jsonObj.put("stickyExpireDate", stickyExpireDateJSON);

		return jsonObj;
	}

	public static JSONArray toJSONArray(
		com.vportal.portlet.vcms.model.VcmsArticle[] models) {
		JSONArray jsonArray = JSONFactoryUtil.createJSONArray();

		for (VcmsArticle model : models) {
			jsonArray.put(toJSONObject(model));
		}

		return jsonArray;
	}

	public static JSONArray toJSONArray(
		com.vportal.portlet.vcms.model.VcmsArticle[][] models) {
		JSONArray jsonArray = JSONFactoryUtil.createJSONArray();

		for (VcmsArticle[] model : models) {
			jsonArray.put(toJSONArray(model));
		}

		return jsonArray;
	}

	public static JSONArray toJSONArray(
		List<com.vportal.portlet.vcms.model.VcmsArticle> models) {
		JSONArray jsonArray = JSONFactoryUtil.createJSONArray();

		for (VcmsArticle model : models) {
			jsonArray.put(toJSONObject(model));
		}

		return jsonArray;
	}
}