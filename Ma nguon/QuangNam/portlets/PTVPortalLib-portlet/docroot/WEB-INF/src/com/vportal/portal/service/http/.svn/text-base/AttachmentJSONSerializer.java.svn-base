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

package com.vportal.portal.service.http;

import com.liferay.portal.kernel.json.JSONArray;
import com.liferay.portal.kernel.json.JSONFactoryUtil;
import com.liferay.portal.kernel.json.JSONObject;

import com.vportal.portal.model.Attachment;

import java.util.List;

/**
 * @author    HOAN
 * @generated
 */
public class AttachmentJSONSerializer {
	public static JSONObject toJSONObject(Attachment model) {
		JSONObject jsonObj = JSONFactoryUtil.createJSONObject();

		jsonObj.put("attachmentId", model.getAttachmentId());
		jsonObj.put("groupId", model.getGroupId());
		jsonObj.put("companyId", model.getCompanyId());
		jsonObj.put("entryId", model.getEntryId());
		jsonObj.put("entryClass", model.getEntryClass());
		jsonObj.put("fileEntryId", model.getFileEntryId());
		jsonObj.put("folderId", model.getFolderId());
		jsonObj.put("fileName", model.getFileName());
		jsonObj.put("imageId", model.getImageId());
		jsonObj.put("extension", model.getExtension());

		return jsonObj;
	}

	public static JSONArray toJSONArray(
		com.vportal.portal.model.Attachment[] models) {
		JSONArray jsonArray = JSONFactoryUtil.createJSONArray();

		for (Attachment model : models) {
			jsonArray.put(toJSONObject(model));
		}

		return jsonArray;
	}

	public static JSONArray toJSONArray(
		com.vportal.portal.model.Attachment[][] models) {
		JSONArray jsonArray = JSONFactoryUtil.createJSONArray();

		for (Attachment[] model : models) {
			jsonArray.put(toJSONArray(model));
		}

		return jsonArray;
	}

	public static JSONArray toJSONArray(
		List<com.vportal.portal.model.Attachment> models) {
		JSONArray jsonArray = JSONFactoryUtil.createJSONArray();

		for (Attachment model : models) {
			jsonArray.put(toJSONObject(model));
		}

		return jsonArray;
	}
}