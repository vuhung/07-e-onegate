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

package com.vportal.portal.service.persistence;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;

/**
 * @author HOAN
 */
public class PortletFolderFinderUtil {
	public static java.util.List findDLFolder(long groupId,
		java.lang.String portletId) {
		return getFinder().findDLFolder(groupId, portletId);
	}

	public static PortletFolderFinder getFinder() {
		if (_finder == null) {
			_finder = (PortletFolderFinder)PortletBeanLocatorUtil.locate(com.vportal.portal.service.ClpSerializer.SERVLET_CONTEXT_NAME,
					PortletFolderFinder.class.getName());
		}

		return _finder;
	}

	public void setFinder(PortletFolderFinder finder) {
		_finder = finder;
	}

	private static PortletFolderFinder _finder;
}