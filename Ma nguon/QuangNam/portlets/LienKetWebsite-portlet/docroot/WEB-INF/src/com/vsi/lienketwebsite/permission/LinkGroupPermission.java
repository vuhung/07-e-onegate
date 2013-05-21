package com.vsi.lienketwebsite.permission;

import java.rmi.RemoteException;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.security.auth.PrincipalException;
import com.liferay.portal.security.permission.PermissionChecker;
import com.vsi.lienketwebsite.model.LinkGroup;
import com.vsi.lienketwebsite.model.Links;
import com.vsi.lienketwebsite.service.LinkGroupServiceUtil;

public class LinkGroupPermission {
	/*
	public static void check(PermissionChecker permissionChecker,
			LinkGroup linkGroup, String actionId) throws PortalException,
			SystemException, RemoteException {
		if (!contains(permissionChecker, linkGroup, actionId)) {
			throw new PrincipalException();
		}
	}

	public static void check(PermissionChecker permissionChecker,
			long linkgroupId, String actionId) throws PortalException,
			SystemException, RemoteException {

		if (!contains(permissionChecker, linkgroupId, actionId)) {
			throw new PrincipalException();
		}
	}

	public static boolean contains(PermissionChecker permissionChecker,
			long linkgroupId, String actionId) throws PortalException,
			SystemException, RemoteException {

		LinkGroup linkGroup = LinkGroupServiceUtil.getLinkGroup(linkgroupId);
		return contains(permissionChecker, linkGroup, actionId);
	}

	public static boolean contains(PermissionChecker permissionChecker,
			LinkGroup linkGroup, String actionId) throws PortalException,
			SystemException, RemoteException {

		return permissionChecker.hasPermission(linkGroup.getGroupId(),
				Links.class.getName(), linkGroup.getLinkgroupId(), actionId);
	}
*/
}
