package com.vportal.portlet.vcms.service.permission;

import java.rmi.RemoteException;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.security.auth.PrincipalException;
import com.liferay.portal.security.permission.PermissionChecker;
import com.vportal.portlet.vcms.model.VcmsArticle;
import com.vportal.portlet.vcms.model.VcmsType;
import com.vportal.portlet.vcms.service.VcmsTypeServiceUtil;

/**
 * 
 * @author donghh
 * @version 1.0.00, May 23, 2008
 */

public class VcmsTypePermission {
	public static void check(PermissionChecker permissionChecker, long typeId,
			String actionId) throws PortalException, SystemException,
			RemoteException {

		if (!contains(permissionChecker, typeId, actionId)) {
			throw new PrincipalException();
		}
	}

	public static void check(PermissionChecker permissionChecker,
			VcmsType type, String actionId) throws PortalException,
			SystemException {

		if (!contains(permissionChecker, type, actionId)) {
			throw new PrincipalException();
		}
	}

	public static boolean contains(PermissionChecker permissionChecker,
			long typeId, String actionId) throws PortalException,
			SystemException, RemoteException {

		VcmsType type = (VcmsType) VcmsTypeServiceUtil.getType(String
				.valueOf(typeId));

		return contains(permissionChecker, type, actionId);
	}

	public static boolean contains(PermissionChecker permissionChecker,
			VcmsType type, String actionId) throws PortalException,
			SystemException {

		return permissionChecker.hasPermission(type.getGroupId(),
				VcmsArticle.class.getName(), type.getTypeId(), actionId);
	}
}
