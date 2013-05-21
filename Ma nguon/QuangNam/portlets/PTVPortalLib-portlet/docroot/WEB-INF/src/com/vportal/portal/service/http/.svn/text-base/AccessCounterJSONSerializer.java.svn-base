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

package com.vportal.portal.service.http;

import com.liferay.portal.kernel.json.JSONArray;
import com.liferay.portal.kernel.json.JSONFactoryUtil;
import com.liferay.portal.kernel.json.JSONObject;
import com.liferay.portal.kernel.util.StringPool;

import com.vportal.portal.model.AccessCounter;

import java.util.Date;
import java.util.List;

/**
 * @author    HOAN
 * @generated
 */
public class AccessCounterJSONSerializer {
	public static JSONObject toJSONObject(AccessCounter model) {
		JSONObject jsonObj = JSONFactoryUtil.createJSONObject();

		jsonObj.put("id", model.getId());
		jsonObj.put("companyId", model.getCompanyId());

		Date accessDate = model.getAccessDate();

		String accessDateJSON = StringPool.BLANK;

		if (accessDate != null) {
			accessDateJSON = String.valueOf(accessDate.getTime());
		}

		jsonObj.put("accessDate", accessDateJSON);
		jsonObj.put("accessCount", model.getAccessCount());

		return jsonObj;
	}

	public static JSONArray toJSONArray(
		com.vportal.portal.model.AccessCounter[] models) {
		JSONArray jsonArray = JSONFactoryUtil.createJSONArray();

		for (AccessCounter model : models) {
			jsonArray.put(toJSONObject(model));
		}

		return jsonArray;
	}

	public static JSONArray toJSONArray(
		com.vportal.portal.model.AccessCounter[][] models) {
		JSONArray jsonArray = JSONFactoryUtil.createJSONArray();

		for (AccessCounter[] model : models) {
			jsonArray.put(toJSONArray(model));
		}

		return jsonArray;
	}

	public static JSONArray toJSONArray(
		List<com.vportal.portal.model.AccessCounter> models) {
		JSONArray jsonArray = JSONFactoryUtil.createJSONArray();

		for (AccessCounter model : models) {
			jsonArray.put(toJSONObject(model));
		}

		return jsonArray;
	}
}