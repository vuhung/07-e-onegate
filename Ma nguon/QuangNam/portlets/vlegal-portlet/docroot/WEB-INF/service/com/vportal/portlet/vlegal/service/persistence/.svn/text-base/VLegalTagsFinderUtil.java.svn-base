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
public class VLegalTagsFinderUtil {
	public static java.util.List findVLegalTagsByName(long groupId,
		java.lang.String name, java.lang.String status, boolean dup, int begin,
		int end) throws com.liferay.portal.kernel.exception.SystemException {
		return getFinder()
				   .findVLegalTagsByName(groupId, name, status, dup, begin, end);
	}

	public static VLegalTagsFinder getFinder() {
		if (_finder == null) {
			_finder = (VLegalTagsFinder)PortletBeanLocatorUtil.locate(com.vportal.portlet.vlegal.service.ClpSerializer.SERVLET_CONTEXT_NAME,
					VLegalTagsFinder.class.getName());
		}

		return _finder;
	}

	public void setFinder(VLegalTagsFinder finder) {
		_finder = finder;
	}

	private static VLegalTagsFinder _finder;
}