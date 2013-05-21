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

import com.vportal.portlet.vcalendar.model.VFile;

import java.util.Date;
import java.util.List;

/**
 * @author    Admin
 * @generated
 */
public class VFileJSONSerializer {
	public static JSONObject toJSONObject(VFile model) {
		JSONObject jsonObj = JSONFactoryUtil.createJSONObject();

		jsonObj.put("fileId", model.getFileId());
		jsonObj.put("fullname", model.getFullname());
		jsonObj.put("phone", model.getPhone());
		jsonObj.put("address", model.getAddress());

		Date birthday = model.getBirthday();

		String birthdayJSON = StringPool.BLANK;

		if (birthday != null) {
			birthdayJSON = String.valueOf(birthday.getTime());
		}

		jsonObj.put("birthday", birthdayJSON);
		jsonObj.put("position", model.getPosition());
		jsonObj.put("status", model.getStatus());

		return jsonObj;
	}

	public static JSONArray toJSONArray(
		com.vportal.portlet.vcalendar.model.VFile[] models) {
		JSONArray jsonArray = JSONFactoryUtil.createJSONArray();

		for (VFile model : models) {
			jsonArray.put(toJSONObject(model));
		}

		return jsonArray;
	}

	public static JSONArray toJSONArray(
		com.vportal.portlet.vcalendar.model.VFile[][] models) {
		JSONArray jsonArray = JSONFactoryUtil.createJSONArray();

		for (VFile[] model : models) {
			jsonArray.put(toJSONArray(model));
		}

		return jsonArray;
	}

	public static JSONArray toJSONArray(
		List<com.vportal.portlet.vcalendar.model.VFile> models) {
		JSONArray jsonArray = JSONFactoryUtil.createJSONArray();

		for (VFile model : models) {
			jsonArray.put(toJSONObject(model));
		}

		return jsonArray;
	}
}