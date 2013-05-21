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

import com.liferay.portal.kernel.annotation.AutoEscape;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;

import java.io.Serializable;

/**
 * The base model interface for the PortletFolder service. Represents a row in the &quot;PortletFolder&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link com.vportal.portal.model.impl.PortletFolderModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link com.vportal.portal.model.impl.PortletFolderImpl}.
 * </p>
 *
 * <p>
 * Never modify or reference this interface directly. All methods that expect a portlet folder model instance should use the {@link PortletFolder} interface instead.
 * </p>
 *
 * @author HOAN
 * @see PortletFolder
 * @see com.vportal.portal.model.impl.PortletFolderImpl
 * @see com.vportal.portal.model.impl.PortletFolderModelImpl
 * @generated
 */
public interface PortletFolderModel extends BaseModel<PortletFolder> {
	/**
	 * Gets the primary key of this portlet folder.
	 *
	 * @return the primary key of this portlet folder
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this portlet folder
	 *
	 * @param pk the primary key of this portlet folder
	 */
	public void setPrimaryKey(long pk);

	/**
	 * Gets the id of this portlet folder.
	 *
	 * @return the id of this portlet folder
	 */
	public long getId();

	/**
	 * Sets the id of this portlet folder.
	 *
	 * @param id the id of this portlet folder
	 */
	public void setId(long id);

	/**
	 * Gets the portlet id of this portlet folder.
	 *
	 * @return the portlet id of this portlet folder
	 */
	@AutoEscape
	public String getPortletId();

	/**
	 * Sets the portlet id of this portlet folder.
	 *
	 * @param portletId the portlet id of this portlet folder
	 */
	public void setPortletId(String portletId);

	/**
	 * Gets the folder id of this portlet folder.
	 *
	 * @return the folder id of this portlet folder
	 */
	public long getFolderId();

	/**
	 * Sets the folder id of this portlet folder.
	 *
	 * @param folderId the folder id of this portlet folder
	 */
	public void setFolderId(long folderId);

	/**
	 * Gets the description of this portlet folder.
	 *
	 * @return the description of this portlet folder
	 */
	@AutoEscape
	public String getDescription();

	/**
	 * Sets the description of this portlet folder.
	 *
	 * @param description the description of this portlet folder
	 */
	public void setDescription(String description);

	/**
	 * Gets a copy of this portlet folder as an escaped model instance by wrapping it with an {@link com.liferay.portal.kernel.bean.AutoEscapeBeanHandler}.
	 *
	 * @return the escaped model instance
	 * @see com.liferay.portal.kernel.bean.AutoEscapeBeanHandler
	 */
	public PortletFolder toEscapedModel();

	public boolean isNew();

	public void setNew(boolean n);

	public boolean isCachedModel();

	public void setCachedModel(boolean cachedModel);

	public boolean isEscapedModel();

	public void setEscapedModel(boolean escapedModel);

	public Serializable getPrimaryKeyObj();

	public ExpandoBridge getExpandoBridge();

	public void setExpandoBridgeAttributes(ServiceContext serviceContext);

	public Object clone();

	public int compareTo(PortletFolder portletFolder);

	public int hashCode();

	public String toString();

	public String toXmlString();
}