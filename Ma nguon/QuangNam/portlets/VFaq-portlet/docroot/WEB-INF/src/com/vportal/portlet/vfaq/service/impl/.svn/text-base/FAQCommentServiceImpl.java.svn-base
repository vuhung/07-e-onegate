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

package com.vportal.portlet.vfaq.service.impl;

import java.util.Date;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.security.permission.ActionKeys;
import com.vportal.portlet.vfaq.model.FAQComment;
import com.vportal.portlet.vfaq.service.base.FAQCommentServiceBaseImpl;
import com.vportal.portlet.vfaq.service.permission.FAQAnswerPermission;
import com.vportal.portlet.vfaq.service.permission.FAQCommentPermission;
import com.vportal.portlet.vfaq.util.ActionKeysExt;

/**
 * The implementation of the f a q comment remote service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link com.vportal.portlet.vfaq.service.FAQCommentService} interface.
 * </p>
 *
 * <p>
 * Never reference this interface directly. Always use {@link com.vportal.portlet.vfaq.service.FAQCommentServiceUtil} to access the f a q comment remote service.
 * </p>
 *
 * <p>
 * This is a remote service. Methods of this service are expected to have security checks based on the propagated JAAS credentials because this service can be accessed remotely.
 * </p>
 *
 * @author HOAN
 * @see com.vportal.portlet.vfaq.service.base.FAQCommentServiceBaseImpl
 * @see com.vportal.portlet.vfaq.service.FAQCommentServiceUtil
 */
public class FAQCommentServiceImpl extends FAQCommentServiceBaseImpl {
	/**
	 * Them 1 comment moi vao database
	 */
	public FAQComment addComment(long groupId, long answerId, String content,
			String commName, String commEmail, boolean approved,
			String approveByUser, Date approvedDate, Date commDate, long userId)
			throws SystemException,
			PortalException {

		FAQAnswerPermission.check(getPermissionChecker(), groupId, answerId,
				ActionKeysExt.ADD_COMMENT);

		return faqCommentLocalService.addComment(answerId, content, commName,
				commEmail, approved, approveByUser, approvedDate, commDate,
				userId);
	}

	/**
	 * Them 1 comment moi vao database
	 */
	public FAQComment addComment(long groupId, long answerId, String content,
			String commName, String commEmail, boolean approved,
			String approveByUser, Date approvedDate, Date commDate,
			long userId, boolean addCommunityPermissions,
			boolean addGuestPermissions)
			throws SystemException,
			PortalException {

		FAQAnswerPermission.check(getPermissionChecker(), groupId, answerId,
				ActionKeysExt.ADD_COMMENT);

		return faqCommentLocalService.addComment(answerId, content, commName,
				commEmail, approved, approveByUser, approvedDate, commDate,
				userId, addCommunityPermissions, addGuestPermissions);
	}

	/**
	 * Them 1 comment moi vao database
	 */
	public FAQComment addComment(long groupId, long answerId, String content,
			String commName, String commEmail, boolean approved,
			String approveByUser, Date approvedDate, Date commDate,
			long userId, String[] communityPermissions,
			String[] guestPermissions)
			throws SystemException,
			PortalException {

		FAQAnswerPermission.check(getPermissionChecker(), groupId, answerId,
				ActionKeysExt.ADD_COMMENT);

		return faqCommentLocalService.addComment(answerId, content, commName,
				commEmail, approved, approveByUser, approvedDate, commDate,
				userId, communityPermissions, guestPermissions);
	}

	/**
	 * Sua 1 comment da co
	 */
	public FAQComment updateComment(long groupId, long commentId,
			String content, boolean approved, String approveByUser,
			Date approvedDate, long userId) throws SystemException,
			PortalException {

		FAQCommentPermission.check(getPermissionChecker(), groupId, commentId,
				ActionKeys.UPDATE);

		return faqCommentLocalService.updateComment(commentId, content,
				approved, approveByUser, approvedDate, userId);
	}

	public FAQComment getComment(long groupId, long commentid)
			throws SystemException, PortalException {

		FAQCommentPermission.check(getPermissionChecker(), groupId, commentid,
				ActionKeys.VIEW);

		return faqCommentLocalService.getComment(commentid);
	}

	public void removeComment(long groupId, long commentid)
			throws SystemException, PortalException {

		FAQCommentPermission.check(getPermissionChecker(), groupId, commentid,
				ActionKeys.DELETE);

		faqCommentLocalService.deleteComment(commentid);
	}

	public FAQComment unapproved(long groupId, long commentid)
			throws SystemException, PortalException {

		FAQCommentPermission.check(getPermissionChecker(), groupId, commentid,
				ActionKeysExt.UNAPPROVE_COMMENT);

		return faqCommentLocalService.unapproved(commentid);
	}
}