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
import java.util.Date;
import java.util.List;

/**
 * <p>
 * This class is used by
 * {@link com.vportal.portal.service.http.AccessCounterServiceSoap}.
 * </p>
 *
 * @author    HOAN
 * @see       com.vportal.portal.service.http.AccessCounterServiceSoap
 * @generated
 */
public class AccessCounterSoap implements Serializable {
	public static AccessCounterSoap toSoapModel(AccessCounter model) {
		AccessCounterSoap soapModel = new AccessCounterSoap();

		soapModel.setId(model.getId());
		soapModel.setCompanyId(model.getCompanyId());
		soapModel.setAccessDate(model.getAccessDate());
		soapModel.setAccessCount(model.getAccessCount());

		return soapModel;
	}

	public static AccessCounterSoap[] toSoapModels(AccessCounter[] models) {
		AccessCounterSoap[] soapModels = new AccessCounterSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static AccessCounterSoap[][] toSoapModels(AccessCounter[][] models) {
		AccessCounterSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new AccessCounterSoap[models.length][models[0].length];
		}
		else {
			soapModels = new AccessCounterSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static AccessCounterSoap[] toSoapModels(List<AccessCounter> models) {
		List<AccessCounterSoap> soapModels = new ArrayList<AccessCounterSoap>(models.size());

		for (AccessCounter model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new AccessCounterSoap[soapModels.size()]);
	}

	public AccessCounterSoap() {
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

	public long getCompanyId() {
		return _companyId;
	}

	public void setCompanyId(long companyId) {
		_companyId = companyId;
	}

	public Date getAccessDate() {
		return _accessDate;
	}

	public void setAccessDate(Date accessDate) {
		_accessDate = accessDate;
	}

	public int getAccessCount() {
		return _accessCount;
	}

	public void setAccessCount(int accessCount) {
		_accessCount = accessCount;
	}

	private long _id;
	private long _companyId;
	private Date _accessDate;
	private int _accessCount;
}