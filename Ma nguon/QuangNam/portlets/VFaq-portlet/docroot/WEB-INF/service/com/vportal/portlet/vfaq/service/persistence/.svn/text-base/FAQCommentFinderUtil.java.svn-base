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

package com.vportal.portlet.vfaq.service.persistence;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;

/**
 * @author HOAN
 */
public class FAQCommentFinderUtil {
	public static java.util.List findByGroupId(long groupId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getFinder().findByGroupId(groupId);
	}

	public static java.util.List findByGroupId(long groupId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getFinder().findByGroupId(groupId, start, end);
	}

	public static int countByGroupId(long groupId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getFinder().countByGroupId(groupId);
	}

	public static FAQCommentFinder getFinder() {
		if (_finder == null) {
			_finder = (FAQCommentFinder)PortletBeanLocatorUtil.locate(com.vportal.portlet.vfaq.service.ClpSerializer.SERVLET_CONTEXT_NAME,
					FAQCommentFinder.class.getName());
		}

		return _finder;
	}

	public void setFinder(FAQCommentFinder finder) {
		_finder = finder;
	}

	private static FAQCommentFinder _finder;
}