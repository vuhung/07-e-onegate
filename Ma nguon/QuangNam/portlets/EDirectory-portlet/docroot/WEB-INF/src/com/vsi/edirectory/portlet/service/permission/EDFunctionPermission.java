package com.vsi.edirectory.portlet.service.permission;

import java.rmi.RemoteException;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.security.auth.PrincipalException;
import com.liferay.portal.security.permission.PermissionChecker;
import com.vsi.edirectory.portlet.model.EDFunction;
import com.vsi.edirectory.portlet.service.EDFunctionLocalServiceUtil;


public class EDFunctionPermission {
	
	public static void check(PermissionChecker permissionChecker, long groupId,
			long id, String actionId) throws PortalException, SystemException,
			RemoteException {
		if (!contains(permissionChecker, groupId, id, actionId)) {
			throw new PrincipalException();
		}
	}

	public static void check(PermissionChecker permissionChecker,
			EDFunction function, String actionId) throws PortalException,
			SystemException {
		if (!contains(permissionChecker, function, actionId)) {
			throw new PrincipalException();
		}
	}

	public static boolean contains(PermissionChecker permissionChecker,
			long groupId, long id, String actionId) throws PortalException,
			SystemException, RemoteException {
		EDFunction function = EDFunctionLocalServiceUtil.getFunctionByF_G(id, groupId);
		return contains(permissionChecker, function, actionId);
	}

	public static boolean contains(PermissionChecker permissionChecker,
			EDFunction function, String actionId) throws PortalException,
			SystemException {
		return permissionChecker.hasPermission(function.getGroupId(),
				EDFunction.class.getName(), function.getId(), actionId);
	}

}
