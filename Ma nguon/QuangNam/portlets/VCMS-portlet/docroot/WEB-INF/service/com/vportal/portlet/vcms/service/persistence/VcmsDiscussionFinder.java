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

package com.vportal.portlet.vcms.service.persistence;

/**
 * @author HOAN
 */
public interface VcmsDiscussionFinder {
	public java.util.List searchDiscussionByA_P_L_K(
		java.lang.String articleId, long groupId, java.lang.String language,
		java.lang.String keyword, boolean approved, boolean isTitle,
		boolean isContent, java.lang.String select)
		throws com.liferay.portal.kernel.exception.SystemException;
}