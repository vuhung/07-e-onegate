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

import com.vportal.portlet.vfaq.model.FAQAnswer;

import java.util.Date;
import java.util.List;

/**
 * @author    HOAN
 * @generated
 */
public class FAQAnswerJSONSerializer {
	public static JSONObject toJSONObject(FAQAnswer model) {
		JSONObject jsonObj = JSONFactoryUtil.createJSONObject();

		jsonObj.put("uuid", model.getUuid());
		jsonObj.put("id", model.getId());
		jsonObj.put("questionid", model.getQuestionid());
		jsonObj.put("content", model.getContent());
		jsonObj.put("answerOrder", model.getAnswerOrder());
		jsonObj.put("answeredByUser", model.getAnsweredByUser());

		Date answeredDate = model.getAnsweredDate();

		String answeredDateJSON = StringPool.BLANK;

		if (answeredDate != null) {
			answeredDateJSON = String.valueOf(answeredDate.getTime());
		}

		jsonObj.put("answeredDate", answeredDateJSON);
		jsonObj.put("modifiedByUser", model.getModifiedByUser());
		jsonObj.put("language", model.getLanguage());

		Date modifiedDate = model.getModifiedDate();

		String modifiedDateJSON = StringPool.BLANK;

		if (modifiedDate != null) {
			modifiedDateJSON = String.valueOf(modifiedDate.getTime());
		}

		jsonObj.put("modifiedDate", modifiedDateJSON);
		jsonObj.put("approved", model.getApproved());
		jsonObj.put("approvedByUser", model.getApprovedByUser());

		Date approvedDate = model.getApprovedDate();

		String approvedDateJSON = StringPool.BLANK;

		if (approvedDate != null) {
			approvedDateJSON = String.valueOf(approvedDate.getTime());
		}

		jsonObj.put("approvedDate", approvedDateJSON);
		jsonObj.put("userId", model.getUserId());
		jsonObj.put("attachName", model.getAttachName());
		jsonObj.put("folderId", model.getFolderId());

		return jsonObj;
	}

	public static JSONArray toJSONArray(
		com.vportal.portlet.vfaq.model.FAQAnswer[] models) {
		JSONArray jsonArray = JSONFactoryUtil.createJSONArray();

		for (FAQAnswer model : models) {
			jsonArray.put(toJSONObject(model));
		}

		return jsonArray;
	}

	public static JSONArray toJSONArray(
		com.vportal.portlet.vfaq.model.FAQAnswer[][] models) {
		JSONArray jsonArray = JSONFactoryUtil.createJSONArray();

		for (FAQAnswer[] model : models) {
			jsonArray.put(toJSONArray(model));
		}

		return jsonArray;
	}

	public static JSONArray toJSONArray(
		List<com.vportal.portlet.vfaq.model.FAQAnswer> models) {
		JSONArray jsonArray = JSONFactoryUtil.createJSONArray();

		for (FAQAnswer model : models) {
			jsonArray.put(toJSONObject(model));
		}

		return jsonArray;
	}
}