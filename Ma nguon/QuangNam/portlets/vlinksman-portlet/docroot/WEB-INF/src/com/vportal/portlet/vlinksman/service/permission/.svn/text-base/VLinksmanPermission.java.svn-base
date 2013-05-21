package com.vportal.portlet.vlinksman.service.permission;

import java.rmi.RemoteException;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.security.auth.PrincipalException;
import com.liferay.portal.security.permission.PermissionChecker;
import com.vportal.portlet.vlinksman.model.Links;
import com.vportal.portlet.vlinksman.service.LinksServiceUtil;

public class VLinksmanPermission {
	public static void check(PermissionChecker permissionChecker, Links 
			link, String actionId) throws PortalException, SystemException, 
			RemoteException {
		if( ! contains(permissionChecker, link, actionId)){
			throw new PrincipalException();
		}
	}
	public static void check(PermissionChecker permissionChecker, long linkId,
		String actionId) throws PortalException, SystemException, RemoteException {

		if (!contains(permissionChecker, linkId, actionId)) {
			throw new PrincipalException();
		}
	}
	
	public static boolean contains(PermissionChecker permissionChecker, long linkId,
		String actionId) throws PortalException, SystemException,RemoteException {	
		
		Links link = LinksServiceUtil.getLinks(linkId);
		return contains(permissionChecker, link, actionId);
	}
	
	public static boolean contains(PermissionChecker permissionChecker, 
			Links link, String actionId) throws PortalException,
		SystemException,RemoteException {
		
		return permissionChecker.hasPermission(link.getGroupId(), 
				Links.class.getName(),	link.getLinkId(), actionId);
	}
}
