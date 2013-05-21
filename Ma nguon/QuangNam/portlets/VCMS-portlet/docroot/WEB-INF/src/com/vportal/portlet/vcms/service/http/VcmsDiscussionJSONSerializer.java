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

import com.vportal.portlet.vcms.model.VcmsDiscussion;

import java.util.Date;
import java.util.List;

/**
 * @author    HOAN
 * @generated
 */
public class VcmsDiscussionJSONSerializer {
	public static JSONObject toJSONObject(VcmsDiscussion model) {
		JSONObject jsonObj = JSONFactoryUtil.createJSONObject();

		jsonObj.put("discussionId", model.getDiscussionId());
		jsonObj.put("groupId", model.getGroupId());
		jsonObj.put("companyId", model.getCompanyId());
		jsonObj.put("visitorName", model.getVisitorName());
		jsonObj.put("visitorEmail", model.getVisitorEmail());
		jsonObj.put("visitorPhone", model.getVisitorPhone());

		Date postedDate = model.getPostedDate();

		String postedDateJSON = StringPool.BLANK;

		if (postedDate != null) {
			postedDateJSON = String.valueOf(postedDate.getTime());
		}

		jsonObj.put("postedDate", postedDateJSON);
		jsonObj.put("approved", model.getApproved());
		jsonObj.put("approvedByUser", model.getApprovedByUser());

		Date approvedDate = model.getApprovedDate();

		String approvedDateJSON = StringPool.BLANK;

		if (approvedDate != null) {
			approvedDateJSON = String.valueOf(approvedDate.getTime());
		}

		jsonObj.put("approvedDate", approvedDateJSON);
		jsonObj.put("articleId", model.getArticleId());
		jsonObj.put("title", model.getTitle());
		jsonObj.put("content", model.getContent());
		jsonObj.put("language", model.getLanguage());
		jsonObj.put("hasAttachment", model.getHasAttachment());

		return jsonObj;
	}

	public static JSONArray toJSONArray(
		com.vportal.portlet.vcms.model.VcmsDiscussion[] models) {
		JSONArray jsonArray = JSONFactoryUtil.createJSONArray();

		for (VcmsDiscussion model : models) {
			jsonArray.put(toJSONObject(model));
		}

		return jsonArray;
	}

	public static JSONArray toJSONArray(
		com.vportal.portlet.vcms.model.VcmsDiscussion[][] models) {
		JSONArray jsonArray = JSONFactoryUtil.createJSONArray();

		for (VcmsDiscussion[] model : models) {
			jsonArray.put(toJSONArray(model));
		}

		return jsonArray;
	}

	public static JSONArray toJSONArray(
		List<com.vportal.portlet.vcms.model.VcmsDiscussion> models) {
		JSONArray jsonArray = JSONFactoryUtil.createJSONArray();

		for (VcmsDiscussion model : models) {
			jsonArray.put(toJSONObject(model));
		}

		return jsonArray;
	}
}