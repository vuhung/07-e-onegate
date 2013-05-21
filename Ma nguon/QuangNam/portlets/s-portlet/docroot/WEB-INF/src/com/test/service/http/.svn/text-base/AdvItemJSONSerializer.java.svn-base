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

package com.test.service.http;

import com.liferay.portal.kernel.json.JSONArray;
import com.liferay.portal.kernel.json.JSONFactoryUtil;
import com.liferay.portal.kernel.json.JSONObject;
import com.liferay.portal.kernel.util.StringPool;

import com.test.model.AdvItem;

import java.util.Date;
import java.util.List;

/**
 * @author    Long
 * @generated
 */
public class AdvItemJSONSerializer {
	public static JSONObject toJSONObject(AdvItem model) {
		JSONObject jsonObj = JSONFactoryUtil.createJSONObject();

		jsonObj.put("itemId", model.getItemId());

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

		Date expriedDate = model.getExpriedDate();

		String expriedDateJSON = StringPool.BLANK;

		if (expriedDate != null) {
			expriedDateJSON = String.valueOf(expriedDate.getTime());
		}

		jsonObj.put("expriedDate", expriedDateJSON);
		jsonObj.put("groupId", model.getGroupId());
		jsonObj.put("companyId", model.getCompanyId());
		jsonObj.put("name", model.getName());
		jsonObj.put("description", model.getDescription());
		jsonObj.put("url", model.getUrl());
		jsonObj.put("isTargetBlank", model.getIsTargetBlank());
		jsonObj.put("txtMouseOver", model.getTxtMouseOver());
		jsonObj.put("folderId", model.getFolderId());
		jsonObj.put("status", model.getStatus());
		jsonObj.put("typeId", model.getTypeId());

		return jsonObj;
	}

	public static JSONArray toJSONArray(com.test.model.AdvItem[] models) {
		JSONArray jsonArray = JSONFactoryUtil.createJSONArray();

		for (AdvItem model : models) {
			jsonArray.put(toJSONObject(model));
		}

		return jsonArray;
	}

	public static JSONArray toJSONArray(com.test.model.AdvItem[][] models) {
		JSONArray jsonArray = JSONFactoryUtil.createJSONArray();

		for (AdvItem[] model : models) {
			jsonArray.put(toJSONArray(model));
		}

		return jsonArray;
	}

	public static JSONArray toJSONArray(List<com.test.model.AdvItem> models) {
		JSONArray jsonArray = JSONFactoryUtil.createJSONArray();

		for (AdvItem model : models) {
			jsonArray.put(toJSONObject(model));
		}

		return jsonArray;
	}
}