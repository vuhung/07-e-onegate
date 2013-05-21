package com.vportal.portlet.vclip.service.permission;

import java.rmi.RemoteException;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.security.auth.PrincipalException;
import com.liferay.portal.security.permission.PermissionChecker;
import com.vportal.portlet.vclip.model.ClipType;
import com.vportal.portlet.vclip.service.ClipTypeServiceUtil;

public class ClipTypePermission {
	public static void check(PermissionChecker permissionChecker,
			long groupId, String clipTypeId, String actionId) throws PortalException,
			SystemException, RemoteException, Exception {
		if (!contains(permissionChecker, groupId, clipTypeId, actionId)) {
			throw new PrincipalException();
		}
	}

	public static void check(PermissionChecker permissionChecker,
			ClipType clipType, String actionId) throws PortalException,
			SystemException , Exception{

		if (!contains(permissionChecker, clipType, actionId)) {
			throw new PrincipalException();
		}
	}

	public static boolean contains(PermissionChecker permissionChecker,
			long groupId, String clipTypeId, String actionId)
			throws PortalException, SystemException, RemoteException, Exception {
		ClipType clipType = ClipTypeServiceUtil.findById(clipTypeId);
		return contains(permissionChecker, clipType, actionId);
	}

	public static boolean contains(PermissionChecker permissionChecker,
			ClipType clipType, String actionId) throws PortalException,
			SystemException , Exception {
		return permissionChecker.hasPermission(clipType.getGroupId(),
				ClipType.class.getName(), clipType.getId(), actionId);
	}
}
