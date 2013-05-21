package com.vportal.portlet.vlegal.service.permission;

import java.rmi.RemoteException;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.security.auth.PrincipalException;
import com.liferay.portal.security.permission.PermissionChecker;
import com.vportal.portlet.vlegal.model.VLegalDocument;
import com.vportal.portlet.vlegal.model.VLegalType;
import com.vportal.portlet.vlegal.service.VLegalTypeServiceUtil;

@SuppressWarnings("deprecation")
public class VLegalTypePermission {
	public static void check(PermissionChecker permissionChecker,
			String typeId, String actionId) throws PortalException,
			SystemException, RemoteException, PrincipalException {
		if (!contains(permissionChecker, typeId, actionId)) {
			throw new PrincipalException();
		}
	}

	public static void check(PermissionChecker permissionChecker,
			VLegalType type, String actionId) throws PortalException,
			SystemException, PrincipalException {

		if (!contains(permissionChecker, type, actionId)) {
			throw new PrincipalException();
		}
	}

	public static boolean contains(PermissionChecker permissionChecker,
			String typeId, String actionId) throws PortalException,
			SystemException, RemoteException {
		VLegalType type = VLegalTypeServiceUtil.getType(typeId);
		return contains(permissionChecker, type, actionId);
	}

	public static boolean contains(PermissionChecker permissionChecker,
			VLegalType type, String actionId) throws PortalException,
			SystemException {
		return permissionChecker.hasPermission(type.getGroupId(),
				VLegalType.class.getName(), type.getTypeId(), actionId);
	}
}
