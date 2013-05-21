package com.vsi.edirectory.portlet.service.permission;

import java.rmi.RemoteException;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.security.auth.PrincipalException;
import com.liferay.portal.security.permission.PermissionChecker;
import com.vsi.edirectory.portlet.model.EDEmployee;
import com.vsi.edirectory.portlet.service.EDEmployeeLocalServiceUtil;

public class EDEmployeePermission {
	
	public static void check(PermissionChecker permissionChecker, long groupId,
			long id, String actionId) throws PortalException, SystemException,
			RemoteException {
		if (!contains(permissionChecker, groupId, id, actionId)) {
			throw new PrincipalException();
		}
	}

	public static void check(PermissionChecker permissionChecker,
			EDEmployee employee, String actionId) throws PortalException,
			SystemException {
		if (!contains(permissionChecker, employee, actionId)) {
			throw new PrincipalException();
		}
	}

	public static boolean contains(PermissionChecker permissionChecker,
			long groupId, long id, String actionId) throws PortalException,
			SystemException, RemoteException {
		EDEmployee employee = EDEmployeeLocalServiceUtil.getEmployeeByE_G(id, groupId);
		return contains(permissionChecker, employee, actionId);
	}

	public static boolean contains(PermissionChecker permissionChecker,
			EDEmployee employee, String actionId) throws PortalException,
			SystemException {
		return permissionChecker.hasPermission(employee.getGroupId(),
				EDEmployee.class.getName(), employee.getId(), actionId);
	}

}
