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

package com.vportal.portlet.vcalendar.service.http;

import com.liferay.portal.kernel.json.JSONArray;
import com.liferay.portal.kernel.json.JSONFactoryUtil;
import com.liferay.portal.kernel.json.JSONObject;
import com.liferay.portal.kernel.util.StringPool;

import com.vportal.portlet.vcalendar.model.VCal;

import java.util.Date;
import java.util.List;

/**
 * @author    Admin
 * @generated
 */
public class VCalJSONSerializer {
	public static JSONObject toJSONObject(VCal model) {
		JSONObject jsonObj = JSONFactoryUtil.createJSONObject();

		jsonObj.put("calId", model.getCalId());
		jsonObj.put("groupId", model.getGroupId());
		jsonObj.put("companyId", model.getCompanyId());
		jsonObj.put("userId", model.getUserId());
		jsonObj.put("userName", model.getUserName());

		Date createDate = model.getCreateDate();

		String createDateJSON = StringPool.BLANK;

		if (createDate != null) {
			createDateJSON = String.valueOf(createDate.getTime());
		}

		jsonObj.put("createDate", createDateJSON);

		Date modifiedDate = model.getModifiedDate();

		String modifiedDateJSON = StringPool.BLANK;

		if (modifiedDate != null) {
			modifiedDateJSON = String.valueOf(modifiedDate.getTime());
		}

		jsonObj.put("modifiedDate", modifiedDateJSON);
		jsonObj.put("languageId", model.getLanguageId());
		jsonObj.put("fileId", model.getFileId());
		jsonObj.put("title", model.getTitle());
		jsonObj.put("description", model.getDescription());
		jsonObj.put("guest", model.getGuest());
		jsonObj.put("location", model.getLocation());
		jsonObj.put("time", model.getTime());

		Date startDate = model.getStartDate();

		String startDateJSON = StringPool.BLANK;

		if (startDate != null) {
			startDateJSON = String.valueOf(startDate.getTime());
		}

		jsonObj.put("startDate", startDateJSON);

		Date endDate = model.getEndDate();

		String endDateJSON = StringPool.BLANK;

		if (endDate != null) {
			endDateJSON = String.valueOf(endDate.getTime());
		}

		jsonObj.put("endDate", endDateJSON);
		jsonObj.put("status", model.getStatus());

		return jsonObj;
	}

	public static JSONArray toJSONArray(
		com.vportal.portlet.vcalendar.model.VCal[] models) {
		JSONArray jsonArray = JSONFactoryUtil.createJSONArray();

		for (VCal model : models) {
			jsonArray.put(toJSONObject(model));
		}

		return jsonArray;
	}

	public static JSONArray toJSONArray(
		com.vportal.portlet.vcalendar.model.VCal[][] models) {
		JSONArray jsonArray = JSONFactoryUtil.createJSONArray();

		for (VCal[] model : models) {
			jsonArray.put(toJSONArray(model));
		}

		return jsonArray;
	}

	public static JSONArray toJSONArray(
		List<com.vportal.portlet.vcalendar.model.VCal> models) {
		JSONArray jsonArray = JSONFactoryUtil.createJSONArray();

		for (VCal model : models) {
			jsonArray.put(toJSONObject(model));
		}

		return jsonArray;
	}
}