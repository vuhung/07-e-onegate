package com.test.service.permission;

import java.rmi.RemoteException;

import com.liferay.portal.PortalException;
import com.liferay.portal.SystemException;
import com.liferay.portal.security.auth.PrincipalException;
import com.liferay.portal.security.permission.PermissionChecker;
import com.test.NoSuchAdvTypeException;
import com.test.model.AdvType;
import com.test.service.AdvTypeServiceUtil;


public class AdvTypePermission {
	public static void check(PermissionChecker permissionChecker, AdvType type,
			String actionId) throws PortalException, SystemException,
			RemoteException, PrincipalException {
		if (!contains(permissionChecker, type, actionId)) {
			throw new PrincipalException();
		}
	}

	public static void check(PermissionChecker permissionChecker, long typeId,
			String actionId) throws PortalException, RemoteException, PrincipalException, NoSuchAdvTypeException, com.liferay.portal.kernel.exception.SystemException {

		if (!contains(permissionChecker, typeId, actionId)) {
			throw new PrincipalException();
		}
	}

	public static boolean contains(PermissionChecker permissionChecker,
			long typeId, String actionId) throws PortalException,
			RemoteException, NoSuchAdvTypeException, com.liferay.portal.kernel.exception.SystemException {

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
