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
public class VLegalDraftDocumentFinderUtil {
	public static java.util.List findOtherDraftExpiredByField(long groupId,
		java.lang.String language, java.lang.String draftId,
		java.lang.String fieldId, int status, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getFinder()
				   .findOtherDraftExpiredByField(groupId, language, draftId,
			fieldId, status, start, end);
	}

	public static int countOtherDraftExpiredByField(long groupId,
		java.lang.String language, java.lang.String draftId,
		java.lang.String fieldId, int status)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getFinder()
				   .countOtherDraftExpiredByField(groupId, language, draftId,
			fieldId, status);
	}

	public static java.util.List findDraftExpiredByParam(long groupId,
		java.lang.String language, java.lang.String fieldId,
		java.lang.String typeId, int status, java.lang.String title,
		java.lang.String content, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getFinder()
				   .findDraftExpiredByParam(groupId, language, fieldId, typeId,
			status, title, content, start, end);
	}

	public static int countDraftExpiredByParam(long groupId,
		java.lang.String language, java.lang.String fieldId,
		java.lang.String typeId, int status, java.lang.String title,
		java.lang.String content) throws com.liferay.portal.kernel.exception.SystemException {
		return getFinder()
				   .countDraftExpiredByParam(groupId, language, fieldId,
			typeId, status, title, content);
	}

	public static java.util.List findDraftByParam(long groupId,
		java.lang.String language, java.lang.String fieldId,
		java.lang.String typeId, int status, java.lang.String title,
		java.lang.String content, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getFinder()
				   .findDraftByParam(groupId, language, fieldId, typeId,
			status, title, content, start, end);
	}

	public static int countDraftByParam(long groupId,
		java.lang.String language, java.lang.String fieldId,
		java.lang.String typeId, int status, java.lang.String title,
		java.lang.String content) throws com.liferay.portal.kernel.exception.SystemException {
		return getFinder()
				   .countDraftByParam(groupId, language, fieldId, typeId,
			status, title, content);
	}

	public static java.util.List findByDraftsExpiredDateByP_L_S(long groupId,
		java.lang.String language, int status)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getFinder()
				   .findByDraftsExpiredDateByP_L_S(groupId, language, status);
	}

	public static java.util.List findByDraftsExpiredDateByP_L_S(long groupId,
		java.lang.String language, int status, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getFinder()
				   .findByDraftsExpiredDateByP_L_S(groupId, language, status,
			start, end);
	}

	public static int countByDraftsExpiredDateByP_L_S(long groupId,
		java.lang.String language, int status)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getFinder()
				   .countByDraftsExpiredDateByP_L_S(groupId, language, status);
	}

	public static java.util.List findDraftsByP_L_S_E(long groupId,
		java.lang.String language, int status)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getFinder().findDraftsByP_L_S_E(groupId, language, status);
	}

	public static java.util.List findDraftsByP_L_S_E(long groupId,
		java.lang.String language, int status, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getFinder()
				   .findDraftsByP_L_S_E(groupId, language, status, start, end);
	}

	public static int countDraftsByP_L_S_E(long groupId,
		java.lang.String language, int status)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getFinder().countDraftsByP_L_S_E(groupId, language, status);
	}

	public static java.util.List findByP_L_S(long groupId,
		java.lang.String language, int status, int quantity)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getFinder().findByP_L_S(groupId, language, status, quantity);
	}

	public static java.util.List findByF_P_L_S(java.lang.String fieldId,
		long groupId, java.lang.String language, int status, int quantity)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getFinder()
				   .findByF_P_L_S(fieldId, groupId, language, status, quantity);
	}

	public static java.util.List findByAfterD_G_L_S(java.lang.String fieldId,
		long groupId, java.lang.String language, int status, int quantity,
		java.util.Date date) throws com.liferay.portal.kernel.exception.SystemException {
		return getFinder()
				   .findByAfterD_G_L_S(fieldId, groupId, language, status,
			quantity, date);
	}

	public static VLegalDraftDocumentFinder getFinder() {
		if (_finder == null) {
			_finder = (VLegalDraftDocumentFinder)PortletBeanLocatorUtil.locate(com.vportal.portlet.vlegal.service.ClpSerializer.SERVLET_CONTEXT_NAME,
					VLegalDraftDocumentFinder.class.getName());
		}

		return _finder;
	}

	public void setFinder(VLegalDraftDocumentFinder finder) {
		_finder = finder;
	}

	private static VLegalDraftDocumentFinder _finder;
}