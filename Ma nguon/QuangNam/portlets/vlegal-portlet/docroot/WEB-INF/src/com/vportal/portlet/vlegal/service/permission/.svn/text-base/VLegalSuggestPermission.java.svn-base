package com.vportal.portlet.vlegal.service.permission;

import java.rmi.RemoteException;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.security.permission.PermissionChecker;
import com.liferay.portal.security.auth.PrincipalException;
import com.vportal.portlet.vlegal.model.VLegalSuggestDocument;
import com.vportal.portlet.vlegal.service.VLegalSuggestDocumentServiceUtil;

@SuppressWarnings("deprecation")
public class VLegalSuggestPermission {
	public static void check(PermissionChecker permissionChecker, String subId,
			String actionId) throws PortalException, SystemException,
			RemoteException, PrincipalException {
		if (!contains(permissionChecker, subId, actionId)) {
			throw new PrincipalException();
		}
	}

	public static void check(PermissionChecker permissionChecker,
			VLegalSuggestDocument suggest, String actionId)
			throws PortalException, SystemException, PrincipalException {

		if (!contains(permissionChecker, suggest, actionId)) {
			throw new PrincipalException();
		}
	}

	public static boolean contains(PermissionChecker permissionChecker,
			String sugId, String actionId) throws PortalException,
			SystemException, RemoteException {
		VLegalSuggestDocument suggest = VLegalSuggestDocumentServiceUtil
				.getSuggestion(sugId);
		return contains(permissionChecker, suggest, actionId);
	}

	public static boolean contains(PermissionChecker permissionChecker,
			VLegalSuggestDocument suggest, String actionId)
			throws PortalException, SystemException {
		return permissionChecker.hasPermission(suggest.getGroupId(),
				VLegalSuggestDocument.class.getName(), suggest.getSugId(),
				actionId);
	}
}
