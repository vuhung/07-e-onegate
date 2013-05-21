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

/**
 * The model interface for the VLegalDocument service. Represents a row in the &quot;VLegalDocument&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * Never modify this interface directly. Add methods to {@link com.vportal.portlet.vlegal.model.impl.VLegalDocumentImpl} and rerun ServiceBuilder to automatically copy the method declarations to this interface.
 * </p>
 *
 * <p>
 * Never reference this interface directly. All methods that expect a v legal document model instance should use the {@link VLegalDocument} interface instead.
 * </p>
 *
 * @author ACB
 * @see VLegalDocumentModel
 * @see com.vportal.portlet.vlegal.model.impl.VLegalDocumentImpl
 * @see com.vportal.portlet.vlegal.model.impl.VLegalDocumentModelImpl
 * @generated
 */
public interface VLegalDocument extends VLegalDocumentModel {
	public java.lang.String getVlegalDocumentIdString();

	public void setVlegalDocumentIdString(
		java.lang.String vlegalDocumentIdString);

	public boolean isExpired();
}