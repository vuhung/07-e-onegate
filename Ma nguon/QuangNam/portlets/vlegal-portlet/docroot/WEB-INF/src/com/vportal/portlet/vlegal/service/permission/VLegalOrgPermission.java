package com.vportal.portlet.vlegal.service.permission;

import java.rmi.RemoteException;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.security.permission.PermissionChecker;
import com.liferay.portal.security.auth.PrincipalException;
import com.vportal.portlet.vlegal.model.VLegalOrg;
import com.vportal.portlet.vlegal.service.VLegalOrgServiceUtil;

@SuppressWarnings("deprecation")
public class VLegalOrgPermission {
	public static void check(PermissionChecker permissionChecker, String orgId,
			String actionId) throws PortalException, SystemException,
			RemoteException, PrincipalException {
		if (!contains(permissionChecker, orgId, actionId)) {
			throw new PrincipalException();
		}
	}

	public static void check(PermissionChecker permissionChecker,
			VLegalOrg org, String actionId) throws PortalException,
			SystemException, PrincipalException {

		if (!contains(permissionChecker, org, actionId)) {
			throw new PrincipalException();
		}
	}

	public static boolean contains(PermissionChecker permissionChecker,
			String orgId, String actionId) throws PortalException,
			SystemException, RemoteException {
		VLegalOrg org = VLegalOrgServiceUtil.getOrg(orgId);
		return contains(permissionChecker, org, actionId);
	}

	public static boolean contains(PermissionChecker permissionChecker,
			VLegalOrg org, String actionId) throws PortalException,
			SystemException {
		return permissionChecker.hasPermission(org.getGroupId(),
				VLegalOrg.class.getName(), org.getOrgId(), actionId);
	}
}
