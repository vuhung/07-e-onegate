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

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;

/**
 * @author ACB
 */
public class VLegalLoggerFinderUtil {
	public static java.util.List findByUser(java.lang.String createdByUser)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getFinder().findByUser(createdByUser);
	}

	public static java.util.List findByPeriod(java.util.Date from,
		java.util.Date to) throws com.liferay.portal.kernel.exception.SystemException {
		return getFinder().findByPeriod(from, to);
	}

	public static void removeByPeriod(java.util.Date from, java.util.Date to)
		throws com.liferay.portal.kernel.exception.SystemException {
		getFinder().removeByPeriod(from, to);
	}

	public static VLegalLoggerFinder getFinder() {
		if (_finder == null) {
			_finder = (VLegalLoggerFinder)PortletBeanLocatorUtil.locate(com.vportal.portlet.vlegal.service.ClpSerializer.SERVLET_CONTEXT_NAME,
					VLegalLoggerFinder.class.getName());
		}

		return _finder;
	}

	public void setFinder(VLegalLoggerFinder finder) {
		_finder = finder;
	}

	private static VLegalLoggerFinder _finder;
}