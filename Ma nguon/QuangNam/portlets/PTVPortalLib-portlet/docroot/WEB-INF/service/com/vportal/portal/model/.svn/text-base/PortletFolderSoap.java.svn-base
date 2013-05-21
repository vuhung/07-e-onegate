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

package com.vportal.portal.model;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.List;

/**
 * <p>
 * This class is used by
 * {@link com.vportal.portal.service.http.PortletFolderServiceSoap}.
 * </p>
 *
 * @author    HOAN
 * @see       com.vportal.portal.service.http.PortletFolderServiceSoap
 * @generated
 */
public class PortletFolderSoap implements Serializable {
	public static PortletFolderSoap toSoapModel(PortletFolder model) {
		PortletFolderSoap soapModel = new PortletFolderSoap();

		soapModel.setId(model.getId());
		soapModel.setPortletId(model.getPortletId());
		soapModel.setFolderId(model.getFolderId());
		soapModel.setDescription(model.getDescription());

		return soapModel;
	}

	public static PortletFolderSoap[] toSoapModels(PortletFolder[] models) {
		PortletFolderSoap[] soapModels = new PortletFolderSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static PortletFolderSoap[][] toSoapModels(PortletFolder[][] models) {
		PortletFolderSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new PortletFolderSoap[models.length][models[0].length];
		}
		else {
			soapModels = new PortletFolderSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static PortletFolderSoap[] toSoapModels(List<PortletFolder> models) {
		List<PortletFolderSoap> soapModels = new ArrayList<PortletFolderSoap>(models.size());

		for (PortletFolder model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new PortletFolderSoap[soapModels.size()]);
	}

	public PortletFolderSoap() {
	}

	public long getPrimaryKey() {
		return _id;
	}

	public void setPrimaryKey(long pk) {
		setId(pk);
	}

	public long getId() {
		return _id;
	}

	public void setId(long id) {
		_id = id;
	}

	public String getPortletId() {
		return _portletId;
	}

	public void setPortletId(String portletId) {
		_portletId = portletId;
	}

	public long getFolderId() {
		return _folderId;
	}

	public void setFolderId(long folderId) {
		_folderId = folderId;
	}

	public String getDescription() {
		return _description;
	}

	public void setDescription(String description) {
		_description = description;
	}

	private long _id;
	private String _portletId;
	private long _folderId;
	private String _description;
}