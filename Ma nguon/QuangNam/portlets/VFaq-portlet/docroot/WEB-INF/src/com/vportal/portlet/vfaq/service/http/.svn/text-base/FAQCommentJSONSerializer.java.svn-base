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

package com.vportal.portlet.vfaq.service.http;

import com.liferay.portal.kernel.json.JSONArray;
import com.liferay.portal.kernel.json.JSONFactoryUtil;
import com.liferay.portal.kernel.json.JSONObject;
import com.liferay.portal.kernel.util.StringPool;

import com.vportal.portlet.vfaq.model.FAQComment;

import java.util.Date;
import java.util.List;

/**
 * @author    HOAN
 * @generated
 */
public class FAQCommentJSONSerializer {
	public static JSONObject toJSONObject(FAQComment model) {
		JSONObject jsonObj = JSONFactoryUtil.createJSONObject();

		jsonObj.put("uuid", model.getUuid());
		jsonObj.put("id", model.getId());
		jsonObj.put("answerid", model.getAnswerid());
		jsonObj.put("content", model.getContent());
		jsonObj.put("commName", model.getCommName());
		jsonObj.put("commEmail", model.getCommEmail());
		jsonObj.put("approved", model.getApproved());
		jsonObj.put("approveByUser", model.getApproveByUser());

		Date approvedDate = model.getApprovedDate();

		String approvedDateJSON = StringPool.BLANK;

		if (approvedDate != null) {
			approvedDateJSON = String.valueOf(approvedDate.getTime());
		}

		jsonObj.put("approvedDate", approvedDateJSON);

		Date commDate = model.getCommDate();

		String commDateJSON = StringPool.BLANK;

		if (commDate != null) {
			commDateJSON = String.valueOf(commDate.getTime());
		}

		jsonObj.put("commDate", commDateJSON);
		jsonObj.put("userId", model.getUserId());

		return jsonObj;
	}

	public static JSONArray toJSONArray(
		com.vportal.portlet.vfaq.model.FAQComment[] models) {
		JSONArray jsonArray = JSONFactoryUtil.createJSONArray();

		for (FAQComment model : models) {
			jsonArray.put(toJSONObject(model));
		}

		return jsonArray;
	}

	public static JSONArray toJSONArray(
		com.vportal.portlet.vfaq.model.FAQComment[][] models) {
		JSONArray jsonArray = JSONFactoryUtil.createJSONArray();

		for (FAQComment[] model : models) {
			jsonArray.put(toJSONArray(model));
		}

		return jsonArray;
	}

	public static JSONArray toJSONArray(
		List<com.vportal.portlet.vfaq.model.FAQComment> models) {
		JSONArray jsonArray = JSONFactoryUtil.createJSONArray();

		for (FAQComment model : models) {
			jsonArray.put(toJSONObject(model));
		}

		return jsonArray;
	}
}