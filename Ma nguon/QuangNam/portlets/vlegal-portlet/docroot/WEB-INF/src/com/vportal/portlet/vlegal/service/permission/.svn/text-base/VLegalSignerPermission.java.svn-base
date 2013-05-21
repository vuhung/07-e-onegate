package com.vportal.portlet.vlegal.service.permission;

import java.rmi.RemoteException;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.security.permission.PermissionChecker;
import com.liferay.portal.security.auth.PrincipalException;
import com.vportal.portlet.vlegal.model.VLegalSigner;
import com.vportal.portlet.vlegal.service.VLegalSignerServiceUtil;

@SuppressWarnings("deprecation")
public class VLegalSignerPermission {
	public static void check(PermissionChecker permissionChecker,
			String signerId, String actionId) throws PortalException,
			SystemException, RemoteException, PrincipalException {
		if (!contains(permissionChecker, signerId, actionId)) {
			throw new PrincipalException();
		}
	}

	public static void check(PermissionChecker permissionChecker,
			VLegalSigner signer, String actionId) throws PortalException,
			SystemException, PrincipalException {

		if (!contains(permissionChecker, signer, actionId)) {
			throw new PrincipalException();
		}
	}

	public static boolean contains(PermissionChecker permissionChecker,
			String signerId, String actionId) throws PortalException,
			SystemException, RemoteException {
		VLegalSigner signer = VLegalSignerServiceUtil.getSigner(signerId);
		return contains(permissionChecker, signer, actionId);
	}

	public static boolean contains(PermissionChecker permissionChecker,
			VLegalSigner signer, String actionId) throws PortalException,
			SystemException {
		return permissionChecker.hasPermission(signer.getGroupId(),
				VLegalSigner.class.getName(), signer.getSigId(), actionId);
	}
}
