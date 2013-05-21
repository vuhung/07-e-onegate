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

package com.vportal.portlet.vlegal.model.impl;

import java.util.Date;

import com.vportal.portlet.vlegal.model.VLegalDocument;

/**
 * The model implementation for the VLegalDocument service. Represents a row in the &quot;vlegal_VLegalDocument&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * Helper methods and all application logic should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link com.vportal.portlet.vlegal.model.VLegalDocument} interface.
 * </p>
 *
 * <p>
 * Never reference this class directly. All methods that expect a v legal document model instance should use the {@link VLegalDocument} interface instead.
 * </p>
 */
public class VLegalDocumentImpl extends VLegalDocumentModelImpl
	implements VLegalDocument {
	
	private String vlegalDocumentIdString;
	
	public String getVlegalDocumentIdString()
	{
		return vlegalDocumentIdString;
	}
	
	public void setVlegalDocumentIdString(String vlegalDocumentIdString)
	{
		this.vlegalDocumentIdString = vlegalDocumentIdString;
	}
	
	public VLegalDocumentImpl() {
	}

	public boolean isExpired() {
		Date expirationDate = getExpiredDate();

		if ((expirationDate != null) && (expirationDate.before(new Date()))) {
			return true;
		} else {
			return false;
		}
	}
}