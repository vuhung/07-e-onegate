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

package com.vportal.portlet.vlegal.service.persistence;

/**
 * @author ACB
 */
public interface VLegalFieldFinder {
	public java.util.List findFieldByOrgRel(long groupId,
		java.lang.String orgId, java.lang.String language,
		java.lang.String status, java.lang.String rssable, int begin, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	public java.util.List findFieldByTypeRel(long groupId,
		java.lang.String typeId, java.lang.String language,
		java.lang.String status, java.lang.String rssable, int begin, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	public java.util.List findFieldByPS(long groupId,
		java.lang.String language, java.lang.String status,
		java.lang.String rssable, int begin, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	public java.util.List findFieldExistByDoc(long groupId,
		java.lang.String language, java.lang.String typeId,
		java.lang.String orgId, int status, java.lang.String rssable,
		int begin, int end) throws com.liferay.portal.kernel.exception.SystemException;
}