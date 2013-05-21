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

import com.vportal.portlet.vlegal.model.VLegalDraftDocument;

import java.util.Date;
import java.util.List;

/**
 * @author    ACB
 * @generated
 */
public class VLegalDraftDocumentJSONSerializer {
	public static JSONObject toJSONObject(VLegalDraftDocument model) {
		JSONObject jsonObj = JSONFactoryUtil.createJSONObject();

		jsonObj.put("draftId", model.getDraftId());
		jsonObj.put("groupId", model.getGroupId());
		jsonObj.put("companyId", model.getCompanyId());
		jsonObj.put("userId", model.getUserId());
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
		jsonObj.put("approvedByUser", model.getApprovedByUser());

		Date approvedDate = model.getApprovedDate();

		String approvedDateJSON = StringPool.BLANK;

		if (approvedDate != null) {
			approvedDateJSON = String.valueOf(approvedDate.getTime());
		}

		jsonObj.put("approvedDate", approvedDateJSON);
		jsonObj.put("publishedByUser", model.getPublishedByUser());

		Date publishedDate = model.getPublishedDate();

		String publishedDateJSON = StringPool.BLANK;

		if (publishedDate != null) {
			publishedDateJSON = String.valueOf(publishedDate.getTime());
		}

		jsonObj.put("publishedDate", publishedDateJSON);
		jsonObj.put("title", model.getTitle());

		Date expiredDate = model.getExpiredDate();

		String expiredDateJSON = StringPool.BLANK;

		if (expiredDate != null) {
			expiredDateJSON = String.valueOf(expiredDate.getTime());
		}

		jsonObj.put("expiredDate", expiredDateJSON);
		jsonObj.put("language", model.getLanguage());
		jsonObj.put("content", model.getContent());
		jsonObj.put("typeId", model.getTypeId());
		jsonObj.put("fieldId", model.getFieldId());
		jsonObj.put("hasAttachment", model.getHasAttachment());
		jsonObj.put("draftLevel", model.getDraftLevel());
		jsonObj.put("docCode", model.getDocCode());
		jsonObj.put("statusDraft", model.getStatusDraft());

		return jsonObj;
	}

	public static JSONArray toJSONArray(
		com.vportal.portlet.vlegal.model.VLegalDraftDocument[] models) {
		JSONArray jsonArray = JSONFactoryUtil.createJSONArray();

		for (VLegalDraftDocument model : models) {
			jsonArray.put(toJSONObject(model));
		}

		return jsonArray;
	}

	public static JSONArray toJSONArray(
		com.vportal.portlet.vlegal.model.VLegalDraftDocument[][] models) {
		JSONArray jsonArray = JSONFactoryUtil.createJSONArray();

		for (VLegalDraftDocument[] model : models) {
			jsonArray.put(toJSONArray(model));
		}

		return jsonArray;
	}

	public static JSONArray toJSONArray(
		List<com.vportal.portlet.vlegal.model.VLegalDraftDocument> models) {
		JSONArray jsonArray = JSONFactoryUtil.createJSONArray();

		for (VLegalDraftDocument model : models) {
			jsonArray.put(toJSONObject(model));
		}

		return jsonArray;
	}
}