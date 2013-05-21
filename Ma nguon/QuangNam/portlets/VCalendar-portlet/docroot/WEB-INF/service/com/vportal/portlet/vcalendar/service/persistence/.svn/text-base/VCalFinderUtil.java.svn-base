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

package com.vportal.portlet.vcalendar.service.persistence;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;

/**
 * @author Admin
 */
public class VCalFinderUtil {
	public static java.util.List findByGroupOrg() {
		return getFinder().findByGroupOrg();
	}

	public static VCalFinder getFinder() {
		if (_finder == null) {
			_finder = (VCalFinder)PortletBeanLocatorUtil.locate(com.vportal.portlet.vcalendar.service.ClpSerializer.SERVLET_CONTEXT_NAME,
					VCalFinder.class.getName());
		}

		return _finder;
	}

	public void setFinder(VCalFinder finder) {
		_finder = finder;
	}

	private static VCalFinder _finder;
}