package com.vportal.portlet.vcms.service.permission;

import java.rmi.RemoteException;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.security.auth.PrincipalException;
import com.liferay.portal.security.permission.PermissionChecker;
import com.vportal.portlet.vcms.model.VcmsDiscussion;
import com.vportal.portlet.vcms.service.VcmsDiscussionServiceUtil;

public class VcmsDiscussionPermission {
	public static void check(PermissionChecker permissionChecker,
			long discussionId, String actionId) throws PortalException,
			SystemException, RemoteException {

		if (!contains(permissionChecker, discussionId, actionId)) {
			throw new PrincipalException();
		}
	}

	public static void check(PermissionChecker permissionChecker,
			VcmsDiscussion discussion, String actionId) throws PortalException,
			SystemException {

		if (!contains(permissionChecker, discussion, actionId)) {
			throw new PrincipalException();
		}
	}

	public static boolean contains(PermissionChecker permissionChecker,
			long discussionId, String actionId) throws PortalException,
			SystemException, RemoteException {

		VcmsDiscussion discussion = (VcmsDiscussion) VcmsDiscussionServiceUtil
				.getDiscussion(String.valueOf(discussionId));

		return contains(permissionChecker, discussion, actionId);
	}

	public static boolean contains(PermissionChecker permissionChecker,
			VcmsDiscussion discussion, String actionId) throws PortalException,
			SystemException {

		return permissionChecker.hasPermission(discussion.getGroupId(),
				VcmsDiscussion.class.getName(), discussion.getDiscussionId(),
				actionId);
	}
}
