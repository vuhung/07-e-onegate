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

package com.portlet.vdoc.service.http;

import com.liferay.portal.kernel.json.JSONArray;
import com.liferay.portal.kernel.json.JSONFactoryUtil;
import com.liferay.portal.kernel.json.JSONObject;
import com.liferay.portal.kernel.util.StringPool;

import com.portlet.vdoc.model.vdocLogger;

import java.util.Date;
import java.util.List;

/**
 * @author    vinhnt
 * @generated
 */
public class vdocLoggerJSONSerializer {
	public static JSONObject toJSONObject(vdocLogger model) {
		JSONObject jsonObj = JSONFactoryUtil.createJSONObject();

		jsonObj.put("loggerId", model.getLoggerId());
		jsonObj.put("groupId", model.getGroupId());
		jsonObj.put("companyId", model.getCompanyId());
		jsonObj.put("userId", model.getUserId());

		Date createdDate = model.getCreatedDate();

		String createdDateJSON = StringPool.BLANK;

		if (createdDate != null) {
			createdDateJSON = String.valueOf(createdDate.getTime());
		}

		jsonObj.put("createdDate", createdDateJSON);
		jsonObj.put("createdByUser", model.getCreatedByUser());
		jsonObj.put("content", model.getContent());

		return jsonObj;
	}

	public static JSONArray toJSONArray(
		com.portlet.vdoc.model.vdocLogger[] models) {
		JSONArray jsonArray = JSONFactoryUtil.createJSONArray();

		for (vdocLogger model : models) {
			jsonArray.put(toJSONObject(model));
		}

		return jsonArray;
	}

	public static JSONArray toJSONArray(
		com.portlet.vdoc.model.vdocLogger[][] models) {
		JSONArray jsonArray = JSONFactoryUtil.createJSONArray();

		for (vdocLogger[] model : models) {
			jsonArray.put(toJSONArray(model));
		}

		return jsonArray;
	}

	public static JSONArray toJSONArray(
		List<com.portlet.vdoc.model.vdocLogger> models) {
		JSONArray jsonArray = JSONFactoryUtil.createJSONArray();

		for (vdocLogger model : models) {
			jsonArray.put(toJSONObject(model));
		}

		return jsonArray;
	}
}