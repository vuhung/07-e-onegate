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

import com.vportal.portlet.vcms.model.VcmsThread;

import java.util.Date;
import java.util.List;

/**
 * @author    HOAN
 * @generated
 */
public class VcmsThreadJSONSerializer {
	public static JSONObject toJSONObject(VcmsThread model) {
		JSONObject jsonObj = JSONFactoryUtil.createJSONObject();

		jsonObj.put("threadId", model.getThreadId());
		jsonObj.put("groupId", model.getGroupId());
		jsonObj.put("companyId", model.getCompanyId());

		Date createdDate = model.getCreatedDate();

		String createdDateJSON = StringPool.BLANK;

		if (createdDate != null) {
			createdDateJSON = String.valueOf(createdDate.getTime());
		}

		jsonObj.put("createdDate", createdDateJSON);
		jsonObj.put("createdByUser", model.getCreatedByUser());

		Date modifiedDate = model.getModifiedDate();

		String modifiedDateJSON = StringPool.BLANK;

		if (modifiedDate != null) {
			modifiedDateJSON = String.valueOf(modifiedDate.getTime());
		}

		jsonObj.put("modifiedDate", modifiedDateJSON);
		jsonObj.put("modifiedByUser", model.getModifiedByUser());
		jsonObj.put("title", model.getTitle());
		jsonObj.put("description", model.getDescription());
		jsonObj.put("hasImage", model.getHasImage());
		jsonObj.put("image", model.getImage());
		jsonObj.put("language", model.getLanguage());

		return jsonObj;
	}

	public static JSONArray toJSONArray(
		com.vportal.portlet.vcms.model.VcmsThread[] models) {
		JSONArray jsonArray = JSONFactoryUtil.createJSONArray();

		for (VcmsThread model : models) {
			jsonArray.put(toJSONObject(model));
		}

		return jsonArray;
	}

	public static JSONArray toJSONArray(
		com.vportal.portlet.vcms.model.VcmsThread[][] models) {
		JSONArray jsonArray = JSONFactoryUtil.createJSONArray();

		for (VcmsThread[] model : models) {
			jsonArray.put(toJSONArray(model));
		}

		return jsonArray;
	}

	public static JSONArray toJSONArray(
		List<com.vportal.portlet.vcms.model.VcmsThread> models) {
		JSONArray jsonArray = JSONFactoryUtil.createJSONArray();

		for (VcmsThread model : models) {
			jsonArray.put(toJSONObject(model));
		}

		return jsonArray;
	}
}