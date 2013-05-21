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

package com.vportal.portlet.vfaq.service;

/**
 * <p>
 * This class is a wrapper for {@link FAQCommentService}.
 * </p>
 *
 * @author    HOAN
 * @see       FAQCommentService
 * @generated
 */
public class FAQCommentServiceWrapper implements FAQCommentService {
	public FAQCommentServiceWrapper(FAQCommentService faqCommentService) {
		_faqCommentService = faqCommentService;
	}

	/**
	* Them 1 comment moi vao database
	*/
	public com.vportal.portlet.vfaq.model.FAQComment addComment(long groupId,
		long answerId, java.lang.String content, java.lang.String commName,
		java.lang.String commEmail, boolean approved,
		java.lang.String approveByUser, java.util.Date approvedDate,
		java.util.Date commDate, long userId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _faqCommentService.addComment(groupId, answerId, content,
			commName, commEmail, approved, approveByUser, approvedDate,
			commDate, userId);
	}

	/**
	* Them 1 comment moi vao database
	*/
	public com.vportal.portlet.vfaq.model.FAQComment addComment(long groupId,
		long answerId, java.lang.String content, java.lang.String commName,
		java.lang.String commEmail, boolean approved,
		java.lang.String approveByUser, java.util.Date approvedDate,
		java.util.Date commDate, long userId, boolean addCommunityPermissions,
		boolean addGuestPermissions)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _faqCommentService.addComment(groupId, answerId, content,
			commName, commEmail, approved, approveByUser, approvedDate,
			commDate, userId, addCommunityPermissions, addGuestPermissions);
	}

	/**
	* Them 1 comment moi vao database
	*/
	public com.vportal.portlet.vfaq.model.FAQComment addComment(long groupId,
		long answerId, java.lang.String content, java.lang.String commName,
		java.lang.String commEmail, boolean approved,
		java.lang.String approveByUser, java.util.Date approvedDate,
		java.util.Date commDate, long userId,
		java.lang.String[] communityPermissions,
		java.lang.String[] guestPermissions)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _faqCommentService.addComment(groupId, answerId, content,
			commName, commEmail, approved, approveByUser, approvedDate,
			commDate, userId, communityPermissions, guestPermissions);
	}

	/**
	* Sua 1 comment da co
	*/
	public com.vportal.portlet.vfaq.model.FAQComment updateComment(
		long groupId, long commentId, java.lang.String content,
		boolean approved, java.lang.String approveByUser,
		java.util.Date approvedDate, long userId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _faqCommentService.updateComment(groupId, commentId, content,
			approved, approveByUser, approvedDate, userId);
	}

	public com.vportal.portlet.vfaq.model.FAQComment getComment(long groupId,
		long commentid)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _faqCommentService.getComment(groupId, commentid);
	}

	public void removeComment(long groupId, long commentid)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		_faqCommentService.removeComment(groupId, commentid);
	}

	public com.vportal.portlet.vfaq.model.FAQComment unapproved(long groupId,
		long commentid)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _faqCommentService.unapproved(groupId, commentid);
	}

	public FAQCommentService getWrappedFAQCommentService() {
		return _faqCommentService;
	}

	private FAQCommentService _faqCommentService;
}