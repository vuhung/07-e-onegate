package com.vportal.portlet.vlegal.service.permission;

import java.rmi.RemoteException;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.security.auth.PrincipalException;
import com.liferay.portal.security.permission.PermissionChecker;
import com.vportal.portlet.vlegal.model.VLegalDocument;
import com.vportal.portlet.vlegal.service.VLegalDocumentServiceUtil;

@SuppressWarnings("deprecation")
public class VLegalDocumentPermission {
	public static void check(PermissionChecker permissionChecker, String docId,
			String actionId) throws RemoteException, com.liferay.portal.kernel.exception.SystemException, com.liferay.portal.kernel.exception.PortalException {
		if (!contains(permissionChecker, docId, actionId)) {
			throw new PrincipalException();
		}
	}

	public static void check(PermissionChecker permissionChecker,
			VLegalDocument document, String actionId) throws PortalException,
			SystemException, PrincipalException {

		if (!contains(permissionChecker, document, actionId)) {
			throw new PrincipalException();
		}
	}

	public static boolean contains(PermissionChecker permissionChecker,
			String docId, String actionId) throws RemoteException, com.liferay.portal.kernel.exception.SystemException, com.liferay.portal.kernel.exception.PortalException {

		VLegalDocument document = VLegalDocumentServiceUtil.getDocument(docId);

		return contains(permissionChecker, document, actionId);
	}

	public static boolean contains(PermissionChecker permissionChecker,
			VLegalDocument document, String actionId) throws PortalException,
			SystemException {
		return permissionChecker.hasPermission(document.getGroupId(),
				VLegalDocument.class.getName(), document.getDocId(), actionId);
	}
}
