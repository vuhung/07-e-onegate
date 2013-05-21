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
import com.liferay.portal.kernel.util.StringPool;

import com.vsi.edirectory.portlet.model.EDDepartment;

import java.util.Date;
import java.util.List;

/**
 * @author    vinhnt
 * @generated
 */
public class EDDepartmentJSONSerializer {
	public static JSONObject toJSONObject(EDDepartment model) {
		JSONObject jsonObj = JSONFactoryUtil.createJSONObject();

		jsonObj.put("id", model.getId());

		Date createdDate = model.getCreatedDate();

		String createdDateJSON = StringPool.BLANK;

		if (createdDate != null) {
			createdDateJSON = String.valueOf(createdDate.getTime());
		}

		jsonObj.put("createdDate", createdDateJSON);
		jsonObj.put("name", model.getName());
		jsonObj.put("parent", model.getParent());
		jsonObj.put("phone", model.getPhone());
		jsonObj.put("fax", model.getFax());
		jsonObj.put("levelEd", model.getLevelEd());
		jsonObj.put("email", model.getEmail());
		jsonObj.put("address", model.getAddress());
		jsonObj.put("description", model.getDescription());
		jsonObj.put("website", model.getWebsite());
		jsonObj.put("imgurl", model.getImgurl());
		jsonObj.put("companyId", model.getCompanyId());
		jsonObj.put("groupId", model.getGroupId());
		jsonObj.put("userId", model.getUserId());
		jsonObj.put("languageId", model.getLanguageId());
		jsonObj.put("domainId", model.getDomainId());

		return jsonObj;
	}

	public static JSONArray toJSONArray(
		com.vsi.edirectory.portlet.model.EDDepartment[] models) {
		JSONArray jsonArray = JSONFactoryUtil.createJSONArray();

		for (EDDepartment model : models) {
			jsonArray.put(toJSONObject(model));
		}

		return jsonArray;
	}

	public static JSONArray toJSONArray(
		com.vsi.edirectory.portlet.model.EDDepartment[][] models) {
		JSONArray jsonArray = JSONFactoryUtil.createJSONArray();

		for (EDDepartment[] model : models) {
			jsonArray.put(toJSONArray(model));
		}

		return jsonArray;
	}

	public static JSONArray toJSONArray(
		List<com.vsi.edirectory.portlet.model.EDDepartment> models) {
		JSONArray jsonArray = JSONFactoryUtil.createJSONArray();

		for (EDDepartment model : models) {
			jsonArray.put(toJSONObject(model));
		}

		return jsonArray;
	}
}