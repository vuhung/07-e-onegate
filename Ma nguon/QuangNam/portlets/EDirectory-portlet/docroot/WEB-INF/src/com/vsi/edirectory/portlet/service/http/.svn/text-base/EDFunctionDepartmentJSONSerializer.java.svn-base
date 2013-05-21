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

package com.vsi.edirectory.portlet.service.http;

import com.liferay.portal.kernel.json.JSONArray;
import com.liferay.portal.kernel.json.JSONFactoryUtil;
import com.liferay.portal.kernel.json.JSONObject;

import com.vsi.edirectory.portlet.model.EDFunctionDepartment;

import java.util.List;

/**
 * @author    vinhnt
 * @generated
 */
public class EDFunctionDepartmentJSONSerializer {
	public static JSONObject toJSONObject(EDFunctionDepartment model) {
		JSONObject jsonObj = JSONFactoryUtil.createJSONObject();

		jsonObj.put("id", model.getId());
		jsonObj.put("functionId", model.getFunctionId());
		jsonObj.put("departmentId", model.getDepartmentId());

		return jsonObj;
	}

	public static JSONArray toJSONArray(
		com.vsi.edirectory.portlet.model.EDFunctionDepartment[] models) {
		JSONArray jsonArray = JSONFactoryUtil.createJSONArray();

		for (EDFunctionDepartment model : models) {
			jsonArray.put(toJSONObject(model));
		}

		return jsonArray;
	}

	public static JSONArray toJSONArray(
		com.vsi.edirectory.portlet.model.EDFunctionDepartment[][] models) {
		JSONArray jsonArray = JSONFactoryUtil.createJSONArray();

		for (EDFunctionDepartment[] model : models) {
			jsonArray.put(toJSONArray(model));
		}

		return jsonArray;
	}

	public static JSONArray toJSONArray(
		List<com.vsi.edirectory.portlet.model.EDFunctionDepartment> models) {
		JSONArray jsonArray = JSONFactoryUtil.createJSONArray();

		for (EDFunctionDepartment model : models) {
			jsonArray.put(toJSONObject(model));
		}

		return jsonArray;
	}
}