package com.vportal.portlet.vcms.service.permission;

import java.rmi.RemoteException;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.security.auth.PrincipalException;
import com.liferay.portal.security.permission.PermissionChecker;
import com.vportal.portlet.vcms.model.VcmsPortion;
import com.vportal.portlet.vcms.service.VcmsPortionServiceUtil;

/**
 * @author donghh
 * @version 1.0.00, May 23, 2008
 */

public class VcmsPortionPermission {

	public static void check(PermissionChecker permissionChecker,
			long portionId, String name, String actionId)
			throws PortalException, SystemException, RemoteException {

		if (!contains(permissionChecker, portionId, actionId)) {
			throw new PrincipalException();
		}
	}

	public static void check(PermissionChecker permissionChecker,
			VcmsPortion portion, String actionId) throws PortalException,
			SystemException {

		if (!contains(permissionChecker, portion, actionId)) {
			throw new PrincipalException();
		}
	}

	public static boolean contains(PermissionChecker permissionChecker,
			long portionId, String actionId) throws PortalException,
			SystemException, RemoteException {

		VcmsPortion portion = (VcmsPortion) VcmsPortionServiceUtil
				.getPortion(String.valueOf(portionId));

		return contains(permissionChecker, portion, actionId);
	}

	public static boolean contains(PermissionChecker permissionChecker,
			VcmsPortion portion, String actionId) throws PortalException,
			SystemException {

		return permissionChecker.hasPermission(portion.getGroupId(),
				VcmsPortion.class.getName(), portion.getPortionId(), actionId);
	}
}
