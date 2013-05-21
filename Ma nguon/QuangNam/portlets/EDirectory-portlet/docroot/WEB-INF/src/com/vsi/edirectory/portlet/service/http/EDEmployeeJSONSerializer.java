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

import com.vsi.edirectory.portlet.model.EDEmployee;

import java.util.Date;
import java.util.List;

/**
 * @author    vinhnt
 * @generated
 */
public class EDEmployeeJSONSerializer {
	public static JSONObject toJSONObject(EDEmployee model) {
		JSONObject jsonObj = JSONFactoryUtil.createJSONObject();

		jsonObj.put("uuid", model.getUuid());
		jsonObj.put("id", model.getId());

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
		jsonObj.put("title", model.getTitle());
		jsonObj.put("name", model.getName());

		Date birthday = model.getBirthday();

		String birthdayJSON = StringPool.BLANK;

		if (birthday != null) {
			birthdayJSON = String.valueOf(birthday.getTime());
		}

		jsonObj.put("birthday", birthdayJSON);
		jsonObj.put("homeSide", model.getHomeSide());
		jsonObj.put("family", model.getFamily());
		jsonObj.put("race", model.getRace());
		jsonObj.put("home", model.getHome());
		jsonObj.put("homePhone", model.getHomePhone());
		jsonObj.put("workPhone", model.getWorkPhone());
		jsonObj.put("mobilePhone", model.getMobilePhone());
		jsonObj.put("email", model.getEmail());
		jsonObj.put("departmentId", model.getDepartmentId());
		jsonObj.put("majorLevel", model.getMajorLevel());
		jsonObj.put("philosophism", model.getPhilosophism());
		jsonObj.put("foreignLanguage", model.getForeignLanguage());

		Date joinDate = model.getJoinDate();

		String joinDateJSON = StringPool.BLANK;

		if (joinDate != null) {
			joinDateJSON = String.valueOf(joinDate.getTime());
		}

		jsonObj.put("joinDate", joinDateJSON);
		jsonObj.put("image", model.getImage());
		jsonObj.put("isShowTree", model.getIsShowTree());
		jsonObj.put("otherInfo", model.getOtherInfo());
		jsonObj.put("companyId", model.getCompanyId());
		jsonObj.put("groupId", model.getGroupId());
		jsonObj.put("userId", model.getUserId());
		jsonObj.put("languageId", model.getLanguageId());
		jsonObj.put("displayOrder", model.getDisplayOrder());
		jsonObj.put("sex", model.getSex());
		jsonObj.put("status", model.getStatus());
		jsonObj.put("show", model.getShow());

		return jsonObj;
	}

	public static JSONArray toJSONArray(
		com.vsi.edirectory.portlet.model.EDEmployee[] models) {
		JSONArray jsonArray = JSONFactoryUtil.createJSONArray();

		for (EDEmployee model : models) {
			jsonArray.put(toJSONObject(model));
		}

		return jsonArray;
	}

	public static JSONArray toJSONArray(
		com.vsi.edirectory.portlet.model.EDEmployee[][] models) {
		JSONArray jsonArray = JSONFactoryUtil.createJSONArray();

		for (EDEmployee[] model : models) {
			jsonArray.put(toJSONArray(model));
		}

		return jsonArray;
	}

	public static JSONArray toJSONArray(
		List<com.vsi.edirectory.portlet.model.EDEmployee> models) {
		JSONArray jsonArray = JSONFactoryUtil.createJSONArray();

		for (EDEmployee model : models) {
			jsonArray.put(toJSONObject(model));
		}

		return jsonArray;
	}
}