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

import com.vportal.portlet.vlegal.service.persistence.VLegalDFRelPK;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.List;

/**
 * <p>
 * This class is used by
 * {@link com.vportal.portlet.vlegal.service.http.VLegalDFRelServiceSoap}.
 * </p>
 *
 * @author    ACB
 * @see       com.vportal.portlet.vlegal.service.http.VLegalDFRelServiceSoap
 * @generated
 */
public class VLegalDFRelSoap implements Serializable {
	public static VLegalDFRelSoap toSoapModel(VLegalDFRel model) {
		VLegalDFRelSoap soapModel = new VLegalDFRelSoap();

		soapModel.setFieldId(model.getFieldId());
		soapModel.setDocId(model.getDocId());

		return soapModel;
	}

	public static VLegalDFRelSoap[] toSoapModels(VLegalDFRel[] models) {
		VLegalDFRelSoap[] soapModels = new VLegalDFRelSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static VLegalDFRelSoap[][] toSoapModels(VLegalDFRel[][] models) {
		VLegalDFRelSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new VLegalDFRelSoap[models.length][models[0].length];
		}
		else {
			soapModels = new VLegalDFRelSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static VLegalDFRelSoap[] toSoapModels(List<VLegalDFRel> models) {
		List<VLegalDFRelSoap> soapModels = new ArrayList<VLegalDFRelSoap>(models.size());

		for (VLegalDFRel model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new VLegalDFRelSoap[soapModels.size()]);
	}

	public VLegalDFRelSoap() {
	}

	public VLegalDFRelPK getPrimaryKey() {
		return new VLegalDFRelPK(_fieldId, _docId);
	}

	public void setPrimaryKey(VLegalDFRelPK pk) {
		setFieldId(pk.fieldId);
		setDocId(pk.docId);
	}

	public String getFieldId() {
		return _fieldId;
	}

	public void setFieldId(String fieldId) {
		_fieldId = fieldId;
	}

	public String getDocId() {
		return _docId;
	}

	public void setDocId(String docId) {
		_docId = docId;
	}

	private String _fieldId;
	private String _docId;
}