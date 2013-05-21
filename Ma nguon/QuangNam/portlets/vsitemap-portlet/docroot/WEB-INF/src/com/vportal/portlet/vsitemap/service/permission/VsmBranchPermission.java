package com.vportal.portlet.vsitemap.service.permission;

import java.rmi.RemoteException;


import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.security.permission.PermissionChecker;
import com.liferay.portal.security.auth.PrincipalException;
import com.vportal.portlet.vsitemap.model.VsmBranch;
import com.vportal.portlet.vsitemap.service.VsmBranchServiceUtil;

public class VsmBranchPermission {
	
	public static void check(PermissionChecker permissionChecker, VsmBranch 
			branch, String actionId) throws PortalException, SystemException, 
			RemoteException {
		if( ! contains(permissionChecker, branch, actionId)){
			throw new PrincipalException();
		}
	}
//	public static void check(PermissionChecker permissionChecker, long branchId,
//		String actionId) throws PortalException, SystemException, RemoteException {
//
//		if (!contains(permissionChecker, branchId, actionId)) {
//			throw new PrincipalException();
//		}
//	}
	
	public static boolean contains(PermissionChecker permissionChecker, long branchId,
		String actionId) throws PortalException, SystemException,RemoteException {	
		
		VsmBranch branch = VsmBranchServiceUtil.getBranch(branchId);
		return contains(permissionChecker, branch, actionId);
	}
	
	public static boolean contains(PermissionChecker permissionChecker, 
		VsmBranch branch, String actionId) throws PortalException,
		SystemException,RemoteException {
		
		return permissionChecker.hasPermission(branch.getGroupId(), 
				VsmBranch.class.getName(),	branch.getBranchId(), actionId);
	}
}
