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
public class VLegalFieldFinderUtil {
	public static java.util.List findFieldByOrgRel(long groupId,
		java.lang.String orgId, java.lang.String language,
		java.lang.String status, java.lang.String rssable, int begin, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getFinder()
				   .findFieldByOrgRel(groupId, orgId, language, status,
			rssable, begin, end);
	}

	public static java.util.List findFieldByTypeRel(long groupId,
		java.lang.String typeId, java.lang.String language,
		java.lang.String status, java.lang.String rssable, int begin, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getFinder()
				   .findFieldByTypeRel(groupId, typeId, language, status,
			rssable, begin, end);
	}

	public static java.util.List findFieldByPS(long groupId,
		java.lang.String language, java.lang.String status,
		java.lang.String rssable, int begin, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getFinder()
				   .findFieldByPS(groupId, language, status, rssable, begin, end);
	}

	public static java.util.List findFieldExistByDoc(long groupId,
		java.lang.String language, java.lang.String typeId,
		java.lang.String orgId, int status, java.lang.String rssable,
		int begin, int end) throws com.liferay.portal.kernel.exception.SystemException {
		return getFinder()
				   .findFieldExistByDoc(groupId, language, typeId, orgId,
			status, rssable, begin, end);
	}

	public static VLegalFieldFinder getFinder() {
		if (_finder == null) {
			_finder = (VLegalFieldFinder)PortletBeanLocatorUtil.locate(com.vportal.portlet.vlegal.service.ClpSerializer.SERVLET_CONTEXT_NAME,
					VLegalFieldFinder.class.getName());
		}

		return _finder;
	}

	public void setFinder(VLegalFieldFinder finder) {
		_finder = finder;
	}

	private static VLegalFieldFinder _finder;
}