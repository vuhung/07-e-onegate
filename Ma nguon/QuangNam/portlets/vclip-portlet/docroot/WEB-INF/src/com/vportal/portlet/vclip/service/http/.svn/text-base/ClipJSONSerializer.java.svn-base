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

package com.vportal.portlet.vclip.service.http;

import com.liferay.portal.kernel.json.JSONArray;
import com.liferay.portal.kernel.json.JSONFactoryUtil;
import com.liferay.portal.kernel.json.JSONObject;
import com.liferay.portal.kernel.util.StringPool;

import com.vportal.portlet.vclip.model.Clip;

import java.util.Date;
import java.util.List;

/**
 * @author    Brian Wing Shun Chan
 * @generated
 */
public class ClipJSONSerializer {
	public static JSONObject toJSONObject(Clip model) {
		JSONObject jsonObj = JSONFactoryUtil.createJSONObject();

		jsonObj.put("id", model.getId());
		jsonObj.put("clipTypeId", model.getClipTypeId());
		jsonObj.put("groupId", model.getGroupId());
		jsonObj.put("companyId", model.getCompanyId());
		jsonObj.put("userId", model.getUserId());

		Date createdDate = model.getCreatedDate();

		String createdDateJSON = StringPool.BLANK;

		if (createdDate != null) {
			createdDateJSON = String.valueOf(createdDate.getTime());
		}

		jsonObj.put("createdDate", createdDateJSON);

		Date modifiedDate = model.getModifiedDate();

		String modifiedDateJSON = StringPool.BLANK;

		if (modifiedDate != null) {
			modifiedDateJSON = String.valueOf(modifiedDate.getTime());
		}

		jsonObj.put("modifiedDate", modifiedDateJSON);
		jsonObj.put("url", model.getUrl());
		jsonObj.put("name", model.getName());
		jsonObj.put("title", model.getTitle());
		jsonObj.put("image", model.getImage());
		jsonObj.put("description", model.getDescription());
		jsonObj.put("active", model.getActive());
		jsonObj.put("language", model.getLanguage());
		jsonObj.put("hitcount", model.getHitcount());
		jsonObj.put("hitcountview", model.getHitcountview());

		return jsonObj;
	}

	public static JSONArray toJSONArray(
		com.vportal.portlet.vclip.model.Clip[] models) {
		JSONArray jsonArray = JSONFactoryUtil.createJSONArray();

		for (Clip model : models) {
			jsonArray.put(toJSONObject(model));
		}

		return jsonArray;
	}

	public static JSONArray toJSONArray(
		com.vportal.portlet.vclip.model.Clip[][] models) {
		JSONArray jsonArray = JSONFactoryUtil.createJSONArray();

		for (Clip[] model : models) {
			jsonArray.put(toJSONArray(model));
		}

		return jsonArray;
	}

	public static JSONArray toJSONArray(
		List<com.vportal.portlet.vclip.model.Clip> models) {
		JSONArray jsonArray = JSONFactoryUtil.createJSONArray();

		for (Clip model : models) {
			jsonArray.put(toJSONObject(model));
		}

		return jsonArray;
	}
}