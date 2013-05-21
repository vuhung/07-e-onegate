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

import com.test.model.Vlookupprice;

import java.util.Date;
import java.util.List;

/**
 * @author    Long
 * @generated
 */
public class VlookuppriceJSONSerializer {
	public static JSONObject toJSONObject(Vlookupprice model) {
		JSONObject jsonObj = JSONFactoryUtil.createJSONObject();

		jsonObj.put("lookuppriceId", model.getLookuppriceId());
		jsonObj.put("groupId", model.getGroupId());
		jsonObj.put("companyId", model.getCompanyId());
		jsonObj.put("createdByUser", model.getCreatedByUser());

		Date createdDate = model.getCreatedDate();

		String createdDateJSON = StringPool.BLANK;

		if (createdDate != null) {
			createdDateJSON = String.valueOf(createdDate.getTime());
		}

		jsonObj.put("createdDate", createdDateJSON);
		jsonObj.put("modifiedByUser", model.getModifiedByUser());

		Date modifiedDate = model.getModifiedDate();

		String modifiedDateJSON = StringPool.BLANK;

		if (modifiedDate != null) {
			modifiedDateJSON = String.valueOf(modifiedDate.getTime());
		}

		jsonObj.put("modifiedDate", modifiedDateJSON);
		jsonObj.put("status", model.getStatus());
		jsonObj.put("price", model.getPrice());
		jsonObj.put("position1", model.getPosition1());
		jsonObj.put("position2", model.getPosition2());
		jsonObj.put("position3", model.getPosition3());
		jsonObj.put("position4", model.getPosition4());
		jsonObj.put("position5", model.getPosition5());
		jsonObj.put("title", model.getTitle());
		jsonObj.put("content", model.getContent());
		jsonObj.put("parentId", model.getParentId());
		jsonObj.put("language", model.getLanguage());
		jsonObj.put("listParent", model.getListParent());

		return jsonObj;
	}

	public static JSONArray toJSONArray(com.test.model.Vlookupprice[] models) {
		JSONArray jsonArray = JSONFactoryUtil.createJSONArray();

		for (Vlookupprice model : models) {
			jsonArray.put(toJSONObject(model));
		}

		return jsonArray;
	}

	public static JSONArray toJSONArray(com.test.model.Vlookupprice[][] models) {
		JSONArray jsonArray = JSONFactoryUtil.createJSONArray();

		for (Vlookupprice[] model : models) {
			jsonArray.put(toJSONArray(model));
		}

		return jsonArray;
	}

	public static JSONArray toJSONArray(
		List<com.test.model.Vlookupprice> models) {
		JSONArray jsonArray = JSONFactoryUtil.createJSONArray();

		for (Vlookupprice model : models) {
			jsonArray.put(toJSONObject(model));
		}

		return jsonArray;
	}
}