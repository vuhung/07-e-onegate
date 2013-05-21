package com.vportal.portlet.vlegal.service.permission;

import java.rmi.RemoteException;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.security.permission.PermissionChecker;
import com.liferay.portal.security.auth.PrincipalException;
import com.vportal.portlet.vlegal.model.VLegalField;
import com.vportal.portlet.vlegal.service.VLegalFieldServiceUtil;

@SuppressWarnings("deprecation")
public class VLegalFieldPermission {
	public static void check(PermissionChecker permissionChecker,
			String fieldId, String actionId) throws PortalException,
			SystemException, RemoteException, PrincipalException {
		if (!contains(permissionChecker, fieldId, actionId)) {
			throw new PrincipalException();
		}
	}

	public static void check(PermissionChecker permissionChecker,
			VLegalField field, String actionId) throws PortalException,
			SystemException, PrincipalException {

		if (!contains(permissionChecker, field, actionId)) {
			throw new PrincipalException();
		}
	}

	public static boolean contains(PermissionChecker permissionChecker,
			String fieldId, String actionId) throws PortalException,
			SystemException, RemoteException {
		VLegalField field = VLegalFieldServiceUtil.getVField(fieldId);
		return contains(permissionChecker, field, actionId);
	}

	public static boolean contains(PermissionChecker permissionChecker,
			VLegalField field, String actionId) throws PortalException,
			SystemException {
		return permissionChecker.hasPermission(field.getGroupId(),
				VLegalField.class.getName(), field.getFieldId(), actionId);
	}
}
