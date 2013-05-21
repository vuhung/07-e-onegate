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

package com.vportal.portlet.vlegal.model;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * <p>
 * This class is used by
 * {@link com.vportal.portlet.vlegal.service.http.VLegalTagsServiceSoap}.
 * </p>
 *
 * @author    ACB
 * @see       com.vportal.portlet.vlegal.service.http.VLegalTagsServiceSoap
 * @generated
 */
public class VLegalTagsSoap implements Serializable {
	public static VLegalTagsSoap toSoapModel(VLegalTags model) {
		VLegalTagsSoap soapModel = new VLegalTagsSoap();

		soapModel.setTagId(model.getTagId());
		soapModel.setGroupId(model.getGroupId());
		soapModel.setCompanyId(model.getCompanyId());
		soapModel.setUserId(model.getUserId());
		soapModel.setCreatedDate(model.getCreatedDate());
		soapModel.setModifiedDate(model.getModifiedDate());
		soapModel.setName(model.getName());
		soapModel.setStatusTags(model.getStatusTags());

		return soapModel;
	}

	public static VLegalTagsSoap[] toSoapModels(VLegalTags[] models) {
		VLegalTagsSoap[] soapModels = new VLegalTagsSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static VLegalTagsSoap[][] toSoapModels(VLegalTags[][] models) {
		VLegalTagsSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new VLegalTagsSoap[models.length][models[0].length];
		}
		else {
			soapModels = new VLegalTagsSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static VLegalTagsSoap[] toSoapModels(List<VLegalTags> models) {
		List<VLegalTagsSoap> soapModels = new ArrayList<VLegalTagsSoap>(models.size());

		for (VLegalTags model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new VLegalTagsSoap[soapModels.size()]);
	}

	public VLegalTagsSoap() {
	}

	public String getPrimaryKey() {
		return _tagId;
	}

	public void setPrimaryKey(String pk) {
		setTagId(pk);
	}

	public String getTagId() {
		return _tagId;
	}

	public void setTagId(String tagId) {
		_tagId = tagId;
	}

	public long getGroupId() {
		return _groupId;
	}

	public void setGroupId(long groupId) {
		_groupId = groupId;
	}

	public long getCompanyId() {
		return _companyId;
	}

	public void setCompanyId(long companyId) {
		_companyId = companyId;
	}

	public long getUserId() {
		return _userId;
	}

	public void setUserId(long userId) {
		_userId = userId;
	}

	public Date getCreatedDate() {
		return _createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		_createdDate = createdDate;
	}

	public Date getModifiedDate() {
		return _modifiedDate;
	}

	public void setModifiedDate(Date modifiedDate) {
		_modifiedDate = modifiedDate;
	}

	public String getName() {
		return _name;
	}

	public void setName(String name) {
		_name = name;
	}

	public boolean getStatusTags() {
		return _statusTags;
	}

	public boolean isStatusTags() {
		return _statusTags;
	}

	public void setStatusTags(boolean statusTags) {
		_statusTags = statusTags;
	}

	private String _tagId;
	private long _groupId;
	private long _companyId;
	private long _userId;
	private Date _createdDate;
	private Date _modifiedDate;
	private String _name;
	private boolean _statusTags;
}