package com.vportal.portlet.vclip.service.permission;

import java.rmi.RemoteException;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.security.auth.PrincipalException;
import com.liferay.portal.security.permission.PermissionChecker;
import com.vportal.portlet.vclip.model.Clip;
import com.vportal.portlet.vclip.service.ClipServiceUtil;

public class ClipPermission {
	public static void check(PermissionChecker permissionChecker,
			long groupId, String clipId, String actionId) throws PortalException,
			SystemException, RemoteException, Exception {
		if (!contains(permissionChecker, groupId, clipId, actionId)) {
			throw new PrincipalException();
		}
	}

	public static void check(PermissionChecker permissionChecker,
			Clip clip, String actionId) throws PortalException,
			SystemException , Exception{

		if (!contains(permissionChecker, clip, actionId)) {
			throw new PrincipalException();
		}
	}

	public static boolean contains(PermissionChecker permissionChecker,
			long groupId, String clipId, String actionId)
			throws PortalException, SystemException, RemoteException, Exception {
		Clip clip = ClipServiceUtil.findById(clipId);
		return contains(permissionChecker, clip, actionId);
	}

	public static boolean contains(PermissionChecker permissionChecker,
			Clip clip, String actionId) throws PortalException,
			SystemException , Exception {
		return permissionChecker.hasPermission(clip.getGroupId(),
				Clip.class.getName(), clip.getId(), actionId);
	}
}
