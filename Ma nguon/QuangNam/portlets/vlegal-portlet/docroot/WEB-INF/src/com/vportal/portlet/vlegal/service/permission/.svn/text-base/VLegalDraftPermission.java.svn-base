package com.vportal.portlet.vlegal.service.permission;

import java.rmi.RemoteException;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.security.auth.PrincipalException;
import com.liferay.portal.security.permission.PermissionChecker;
import com.vportal.portlet.vlegal.model.VLegalDraftDocument;
import com.vportal.portlet.vlegal.service.VLegalDraftDocumentServiceUtil;

@SuppressWarnings("deprecation")
public class VLegalDraftPermission {
	public static void check(PermissionChecker permissionChecker,
			String draftId, String actionId) throws PortalException,
			SystemException, RemoteException, PrincipalException {
		if (!contains(permissionChecker, draftId, actionId)) {
			throw new PrincipalException();
		}
	}

	public static void check(PermissionChecker permissionChecker,
			VLegalDraftDocument draft, String actionId) throws PortalException,
			SystemException, PrincipalException {

		if (!contains(permissionChecker, draft, actionId)) {
			throw new PrincipalException();
		}
	}

	public static boolean contains(PermissionChecker permissionChecker,
			String draftId, String actionId) throws PortalException,
			SystemException, RemoteException {
		VLegalDraftDocument draft = VLegalDraftDocumentServiceUtil
				.getDraft(draftId);
		return contains(permissionChecker, draft, actionId);
	}

	public static boolean contains(PermissionChecker permissionChecker,
			VLegalDraftDocument draft, String actionId) throws PortalException,
			SystemException {
		return permissionChecker.hasPermission(draft.getGroupId(),
				VLegalDraftDocument.class.getName(), draft.getDraftId(),
				actionId);
	}
}
