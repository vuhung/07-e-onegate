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
public class AccessCounterFinderUtil {
	public static int getHits(long companyId)
		throws com.liferay.portal.SystemException {
		return getFinder().getHits(companyId);
	}

	public static int getHits(long companyId, java.util.Date date)
		throws com.liferay.portal.SystemException {
		return getFinder().getHits(companyId, date);
	}

	public static AccessCounterFinder getFinder() {
		if (_finder == null) {
			_finder = (AccessCounterFinder)PortletBeanLocatorUtil.locate(com.vportal.portal.service.ClpSerializer.SERVLET_CONTEXT_NAME,
					AccessCounterFinder.class.getName());
		}

		return _finder;
	}

	public void setFinder(AccessCounterFinder finder) {
		_finder = finder;
	}

	private static AccessCounterFinder _finder;
}