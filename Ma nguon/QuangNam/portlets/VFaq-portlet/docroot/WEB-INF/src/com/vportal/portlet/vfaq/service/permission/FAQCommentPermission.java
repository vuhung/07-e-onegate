/**
 * 
 */
package com.vportal.portlet.vfaq.service.permission;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.security.auth.PrincipalException;
import com.liferay.portal.security.permission.PermissionChecker;
import com.vportal.portlet.vfaq.model.FAQComment;
import com.vportal.portlet.vfaq.service.FAQCommentLocalServiceUtil;

/**
 * @author Nguyen Duy Nhat (nhatnd)
 * @since Mar 29, 2008
 */
public class FAQCommentPermission {
	public static void check(PermissionChecker permissionChecker, long groupId,
			long commentId, String actionId) throws PortalException,
			SystemException {

		if (!contains(permissionChecker, groupId, commentId, actionId)) {
			throw new PrincipalException();
		}
	}

	public static void check(PermissionChecker permissionChecker, long groupId,
			FAQComment comment, String actionId) throws PortalException,
			SystemException {

		if (!contains(permissionChecker, groupId, comment, actionId)) {
			throw new PrincipalException();
		}
	}

	public static boolean contains(PermissionChecker permissionChecker,
			long groupId, long commentId, String actionId)
			throws PortalException, SystemException {

		FAQComment comment = FAQCommentLocalServiceUtil.getComment(commentId);

		return contains(permissionChecker, groupId, comment, actionId);
	}

	public static boolean contains(PermissionChecker permissionChecker,
			long groupId, FAQComment comment, String actionId)
			throws PortalException, SystemException {
		return permissionChecker.hasPermission(groupId, FAQComment.class
				.getName(), comment.getId(), actionId);
	}
}
