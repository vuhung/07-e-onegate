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

import com.vportal.portlet.vfaq.model.FAQQuestion;

import java.util.Date;
import java.util.List;

/**
 * @author    HOAN
 * @generated
 */
public class FAQQuestionJSONSerializer {
	public static JSONObject toJSONObject(FAQQuestion model) {
		JSONObject jsonObj = JSONFactoryUtil.createJSONObject();

		jsonObj.put("uuid", model.getUuid());
		jsonObj.put("id", model.getId());
		jsonObj.put("title", model.getTitle());
		jsonObj.put("content", model.getContent());
		jsonObj.put("language", model.getLanguage());
		jsonObj.put("questionOrder", model.getQuestionOrder());

		Date sentDate = model.getSentDate();

		String sentDateJSON = StringPool.BLANK;

		if (sentDate != null) {
			sentDateJSON = String.valueOf(sentDate.getTime());
		}

		jsonObj.put("sentDate", sentDateJSON);
		jsonObj.put("sentByUser", model.getSentByUser());
		jsonObj.put("senderEmail", model.getSenderEmail());
		jsonObj.put("questionType", model.getQuestionType());
		jsonObj.put("modifiedByUser", model.getModifiedByUser());

		Date modifiedDate = model.getModifiedDate();

		String modifiedDateJSON = StringPool.BLANK;

		if (modifiedDate != null) {
			modifiedDateJSON = String.valueOf(modifiedDate.getTime());
		}

		jsonObj.put("modifiedDate", modifiedDateJSON);
		jsonObj.put("hitCount", model.getHitCount());
		jsonObj.put("approved", model.getApproved());
		jsonObj.put("groupId", model.getGroupId());
		jsonObj.put("userId", model.getUserId());

		return jsonObj;
	}

	public static JSONArray toJSONArray(
		com.vportal.portlet.vfaq.model.FAQQuestion[] models) {
		JSONArray jsonArray = JSONFactoryUtil.createJSONArray();

		for (FAQQuestion model : models) {
			jsonArray.put(toJSONObject(model));
		}

		return jsonArray;
	}

	public static JSONArray toJSONArray(
		com.vportal.portlet.vfaq.model.FAQQuestion[][] models) {
		JSONArray jsonArray = JSONFactoryUtil.createJSONArray();

		for (FAQQuestion[] model : models) {
			jsonArray.put(toJSONArray(model));
		}

		return jsonArray;
	}

	public static JSONArray toJSONArray(
		List<com.vportal.portlet.vfaq.model.FAQQuestion> models) {
		JSONArray jsonArray = JSONFactoryUtil.createJSONArray();

		for (FAQQuestion model : models) {
			jsonArray.put(toJSONObject(model));
		}

		return jsonArray;
	}
}