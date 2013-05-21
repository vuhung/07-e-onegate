package com.vportal.portlet.vadvman.service.permission;

import java.rmi.RemoteException;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.security.permission.PermissionChecker;
import com.liferay.portal.security.auth.PrincipalException;
import com.vportal.portlet.vadvman.model.AdvType;
import com.vportal.portlet.vadvman.service.AdvTypeServiceUtil;

public class AdvTypePermission {

	public static void check(PermissionChecker permissionChecker, AdvType type,
			String actionId) throws PortalException, SystemException,
			RemoteException {
		if (!contains(permissionChecker, type, actionId)) {
			throw new PrincipalException();
		}
	}

	public static void check(PermissionChecker permissionChecker, long typeId,
			String actionId) throws PortalException, SystemException,
			RemoteException {

		if (!contains(permissionChecker, typeId, actionId)) {
			throw new PrincipalException();
		}
	}

	public static boolean contains(PermissionChecker permissionChecker,
			long typeId, String actionId) throws PortalException,
			SystemException, RemoteException {

		AdvType type = AdvTypeServiceUtil.getType(typeId);
		return contains(permissionChecker, type, actionId);
	}

	public static boolean contains(PermissionChecker permissionChecker,
			AdvType type, String actionId) throws PortalException,
			SystemException, RemoteException {

		return permissionChecker.hasPermission(type.getGroupId(), AdvType.class
				.getName(), type.getTypeId(), actionId);
	}
}
