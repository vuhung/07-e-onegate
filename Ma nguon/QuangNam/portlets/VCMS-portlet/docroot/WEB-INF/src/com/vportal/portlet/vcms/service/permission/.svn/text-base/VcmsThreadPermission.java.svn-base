package com.vportal.portlet.vcms.service.permission;

import java.rmi.RemoteException;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.security.auth.PrincipalException;
import com.liferay.portal.security.permission.PermissionChecker;
import com.vportal.portlet.vcms.model.VcmsThread;
import com.vportal.portlet.vcms.service.VcmsThreadServiceUtil;
/**
 * 
 * @author donghh
 * @version 1.0.00, May 23, 2008
 */

public class VcmsThreadPermission {
	public static void check(PermissionChecker permissionChecker,
			long threadId,String actionId)
			throws PortalException, SystemException, RemoteException {

		if (!contains(permissionChecker, threadId, actionId)) {
			throw new PrincipalException();
		}
	}

	public static void check(PermissionChecker permissionChecker,
			VcmsThread thread, String actionId) throws PortalException,
			SystemException {

		if (!contains(permissionChecker, thread, actionId)) {
			throw new PrincipalException();
		}
	}

	public static boolean contains(PermissionChecker permissionChecker,
			long threadId, String actionId) throws PortalException,
			SystemException, RemoteException {

		VcmsThread thread = (VcmsThread) VcmsThreadServiceUtil
				.getThread(String.valueOf(threadId));

		return contains(permissionChecker, thread, actionId);
	}

	public static boolean contains(PermissionChecker permissionChecker,
			VcmsThread thread, String actionId) throws PortalException,
			SystemException {

		return permissionChecker
				.hasPermission(thread.getGroupId(), VcmsThread.class
						.getName(), thread.getThreadId(), actionId);
	}
}
