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
public class FAQQuestionFinderUtil {
	public static java.util.List findByCategoryId(long groupId,
		java.lang.String language, long categoryId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getFinder().findByCategoryId(groupId, language, categoryId);
	}

	public static java.util.List findByG_Q_A(long groupId,
		java.lang.String language, int quantity, boolean approved)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getFinder().findByG_Q_A(groupId, language, quantity, approved);
	}

	public static java.util.List findByC_S(long groupId,
		java.lang.String language, long categoryId, java.lang.String title,
		int begin, int end, boolean approved)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getFinder()
				   .findByC_S(groupId, language, categoryId, title, begin, end,
			approved);
	}

	public static java.util.List findByC_S(long groupId,
		java.lang.String language, long categoryId, java.lang.String title,
		boolean approved)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getFinder()
				   .findByC_S(groupId, language, categoryId, title, approved);
	}

	public static int countByC_S(long groupId, java.lang.String language,
		long categoryId, java.lang.String title, boolean approved)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getFinder()
				   .countByC_S(groupId, language, categoryId, title, approved);
	}

	public static java.util.List findQuestionByParam(long groupId,
		java.lang.String language, long categoryId, java.lang.String title,
		boolean approved, int begin, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getFinder()
				   .findQuestionByParam(groupId, language, categoryId, title,
			approved, begin, end);
	}

	public static int countQuestionByParam(long groupId,
		java.lang.String language, long categoryId, java.lang.String title,
		boolean approved)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getFinder()
				   .countQuestionByParam(groupId, language, categoryId, title,
			approved);
	}

	public static java.util.List findOtherQuestionByParam(long groupId,
		java.lang.String language, long Id, long categoryId, boolean approved,
		int begin, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getFinder()
				   .findOtherQuestionByParam(groupId, language, Id, categoryId,
			approved, begin, end);
	}

	public static FAQQuestionFinder getFinder() {
		if (_finder == null) {
			_finder = (FAQQuestionFinder)PortletBeanLocatorUtil.locate(com.vportal.portlet.vfaq.service.ClpSerializer.SERVLET_CONTEXT_NAME,
					FAQQuestionFinder.class.getName());
		}

		return _finder;
	}

	public void setFinder(FAQQuestionFinder finder) {
		_finder = finder;
	}

	private static FAQQuestionFinder _finder;
}