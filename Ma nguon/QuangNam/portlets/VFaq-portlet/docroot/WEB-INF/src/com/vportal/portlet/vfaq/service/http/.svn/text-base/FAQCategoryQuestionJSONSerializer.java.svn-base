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

import com.vportal.portlet.vfaq.model.FAQCategoryQuestion;

import java.util.List;

/**
 * @author    HOAN
 * @generated
 */
public class FAQCategoryQuestionJSONSerializer {
	public static JSONObject toJSONObject(FAQCategoryQuestion model) {
		JSONObject jsonObj = JSONFactoryUtil.createJSONObject();

		jsonObj.put("uuid", model.getUuid());
		jsonObj.put("id", model.getId());
		jsonObj.put("questionId", model.getQuestionId());
		jsonObj.put("categoryId", model.getCategoryId());

		return jsonObj;
	}

	public static JSONArray toJSONArray(
		com.vportal.portlet.vfaq.model.FAQCategoryQuestion[] models) {
		JSONArray jsonArray = JSONFactoryUtil.createJSONArray();

		for (FAQCategoryQuestion model : models) {
			jsonArray.put(toJSONObject(model));
		}

		return jsonArray;
	}

	public static JSONArray toJSONArray(
		com.vportal.portlet.vfaq.model.FAQCategoryQuestion[][] models) {
		JSONArray jsonArray = JSONFactoryUtil.createJSONArray();

		for (FAQCategoryQuestion[] model : models) {
			jsonArray.put(toJSONArray(model));
		}

		return jsonArray;
	}

	public static JSONArray toJSONArray(
		List<com.vportal.portlet.vfaq.model.FAQCategoryQuestion> models) {
		JSONArray jsonArray = JSONFactoryUtil.createJSONArray();

		for (FAQCategoryQuestion model : models) {
			jsonArray.put(toJSONObject(model));
		}

		return jsonArray;
	}
}