package com.vportal.portlet.vimagegallery.service.permission;

import java.rmi.RemoteException;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.security.auth.PrincipalException;
import com.liferay.portal.security.permission.PermissionChecker;
import com.vportal.portlet.vimagegallery.model.TFCategory;
import com.vportal.portlet.vimagegallery.service.TFCategoryServiceUtil;

public class TFCategoryPermission {

	
	public static void check(PermissionChecker permissionChecker, TFCategory 
		tfCategory, String actionId) throws PortalException, SystemException, 
			RemoteException {
		if( ! contains(permissionChecker, tfCategory, actionId)){
			throw new PrincipalException();
		}
	}
	public static void check(PermissionChecker permissionChecker, long id,
		String actionId) throws PortalException, SystemException, RemoteException {

		if (!contains(permissionChecker, id, actionId)) {
			throw new PrincipalException();
		}
	}
	
	public static boolean contains(PermissionChecker permissionChecker, long id,
		String actionId) throws PortalException, SystemException,RemoteException {
		
		TFCategory category = TFCategoryServiceUtil.getCategory(id); 
		return contains(permissionChecker, category, actionId);
	}
	
	public static boolean contains(PermissionChecker permissionChecker, 
		TFCategory category, String actionId) throws PortalException,
		SystemException,RemoteException {
		
		return permissionChecker.hasPermission(category.getGroupId(), 
				TFCategory.class.getName(),	category.getId(), actionId);
	}
}
