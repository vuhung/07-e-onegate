package com.vportal.portlet.vadvman.service.permission;

import java.rmi.RemoteException;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.security.permission.PermissionChecker;
import com.liferay.portal.security.auth.PrincipalException;
import com.vportal.portlet.vadvman.model.AdvItem;
import com.vportal.portlet.vadvman.service.AdvItemServiceUtil;

public class AdvItemPermission {
	
	public static void check(PermissionChecker permissionChecker, AdvItem 
		item, String actionId) throws PortalException, SystemException, 
			RemoteException {
		if( ! contains(permissionChecker, item, actionId)){
			throw new PrincipalException();
		}
	}
	public static void check(PermissionChecker permissionChecker, long itemId,
		String actionId) throws PortalException, SystemException, RemoteException {

		if (!contains(permissionChecker, itemId, actionId)) {
			throw new PrincipalException();
		}
	}
	
	public static boolean contains(PermissionChecker permissionChecker, long itemId,
		String actionId) throws PortalException, SystemException,RemoteException {
				
		AdvItem item = AdvItemServiceUtil.getItem(itemId);
		return contains(permissionChecker, item, actionId);
	}
	
	public static boolean contains(PermissionChecker permissionChecker, 
			AdvItem item, String actionId) throws PortalException,
		SystemException,RemoteException {
		
		return permissionChecker.hasPermission(item.getGroupId(), 
				AdvItem.class.getName(),	item.getItemId(), actionId);
	}
}
