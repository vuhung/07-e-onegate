package com.test.service.permission;

import java.rmi.RemoteException;

import com.liferay.portal.PortalException;
import com.liferay.portal.SystemException;
import com.liferay.portal.security.auth.PrincipalException;
import com.liferay.portal.security.permission.PermissionChecker;
import com.test.NoSuchAdvItemException;
import com.test.model.AdvItem;
import com.test.service.AdvItemServiceUtil;


public class AdvItemPermission {
	
	public static void check(PermissionChecker permissionChecker, AdvItem 
			item, String actionId) throws PortalException, SystemException, 
				RemoteException, PrincipalException {
			if( ! contains(permissionChecker, item, actionId)){
				throw new PrincipalException();
			}
		}
		public static void check(PermissionChecker permissionChecker, long itemId,
			String actionId) throws PortalException, RemoteException, PrincipalException, NoSuchAdvItemException, com.liferay.portal.kernel.exception.SystemException {

			if (!contains(permissionChecker, itemId, actionId)) {
				throw new PrincipalException();
			}
		}
		
		public static boolean contains(PermissionChecker permissionChecker, long itemId,
			String actionId) throws PortalException, RemoteException, NoSuchAdvItemException, com.liferay.portal.kernel.exception.SystemException {
					
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
