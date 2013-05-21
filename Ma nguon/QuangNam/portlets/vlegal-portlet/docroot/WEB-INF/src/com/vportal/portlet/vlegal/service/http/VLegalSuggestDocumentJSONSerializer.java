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

package com.vportal.portlet.vlegal.service.http;

import com.liferay.portal.kernel.json.JSONArray;
import com.liferay.portal.kernel.json.JSONFactoryUtil;
import com.liferay.portal.kernel.json.JSONObject;
import com.liferay.portal.kernel.util.StringPool;

import com.vportal.portlet.vlegal.model.VLegalSuggestDocument;

import java.util.Date;
import java.util.List;

/**
 * @author    ACB
 * @generated
 */
public class VLegalSuggestDocumentJSONSerializer {
	public static JSONObject toJSONObject(VLegalSuggestDocument model) {
		JSONObject jsonObj = JSONFactoryUtil.createJSONObject();

		jsonObj.put("sugId", model.getSugId());
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
		jsonObj.put("modifiedByUser", model.getModifiedByUser());
		jsonObj.put("approved", model.getApproved());
		jsonObj.put("approvedByUser", model.getApprovedByUser());

		Date approvedDate = model.getApprovedDate();

		String approvedDateJSON = StringPool.BLANK;

		if (approvedDate != null) {
			approvedDateJSON = String.valueOf(approvedDate.getTime());
		}

		jsonObj.put("approvedDate", approvedDateJSON);
		jsonObj.put("title", model.getTitle());
		jsonObj.put("content", model.getContent());
		jsonObj.put("language", model.getLanguage());
		jsonObj.put("visitorName", model.getVisitorName());
		jsonObj.put("visitorEmail", model.getVisitorEmail());
		jsonObj.put("visitorTel", model.getVisitorTel());
		jsonObj.put("visitorAddress", model.getVisitorAddress());
		jsonObj.put("draftId", model.getDraftId());
		jsonObj.put("hasAttachment", model.getHasAttachment());

		return jsonObj;
	}

	public static JSONArray toJSONArray(
		com.vportal.portlet.vlegal.model.VLegalSuggestDocument[] models) {
		JSONArray jsonArray = JSONFactoryUtil.createJSONArray();

		for (VLegalSuggestDocument model : models) {
			jsonArray.put(toJSONObject(model));
		}

		return jsonArray;
	}

	public static JSONArray toJSONArray(
		com.vportal.portlet.vlegal.model.VLegalSuggestDocument[][] models) {
		JSONArray jsonArray = JSONFactoryUtil.createJSONArray();

		for (VLegalSuggestDocument[] model : models) {
			jsonArray.put(toJSONArray(model));
		}

		return jsonArray;
	}

	public static JSONArray toJSONArray(
		List<com.vportal.portlet.vlegal.model.VLegalSuggestDocument> models) {
		JSONArray jsonArray = JSONFactoryUtil.createJSONArray();

		for (VLegalSuggestDocument model : models) {
			jsonArray.put(toJSONObject(model));
		}

		return jsonArray;
	}
}