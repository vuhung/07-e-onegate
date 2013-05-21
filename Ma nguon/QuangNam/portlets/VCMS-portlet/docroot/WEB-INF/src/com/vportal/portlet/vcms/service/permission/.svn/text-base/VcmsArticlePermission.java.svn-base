package com.vportal.portlet.vcms.service.permission;

import java.rmi.RemoteException;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.security.auth.PrincipalException;
import com.liferay.portal.security.permission.PermissionChecker;
import com.vportal.portlet.vcms.model.VcmsArticle;
import com.vportal.portlet.vcms.service.VcmsArticleServiceUtil;
/**
 * 
 * @author donghh
 * @version 1.0.00, May 23, 2008
 */

public class VcmsArticlePermission {
	public static void check(PermissionChecker permissionChecker,
			long articleId,String actionId)
			throws PortalException, SystemException, RemoteException {

		if (!contains(permissionChecker, articleId, actionId)) {
			throw new PrincipalException();
		}
	}

	public static void check(PermissionChecker permissionChecker,
			VcmsArticle article, String actionId) throws PortalException,
			SystemException {

		if (!contains(permissionChecker, article, actionId)) {
			throw new PrincipalException();
		}
	}

	public static boolean contains(PermissionChecker permissionChecker,
			long articleId, String actionId) throws PortalException,
			SystemException, RemoteException {

		VcmsArticle article = (VcmsArticle) VcmsArticleServiceUtil
				.getArticle(String.valueOf(articleId));

		return contains(permissionChecker, article, actionId);
	}

	public static boolean contains(PermissionChecker permissionChecker,
			VcmsArticle article, String actionId) throws PortalException,
			SystemException {

		return permissionChecker
				.hasPermission(article.getGroupId(), VcmsArticle.class
						.getName(), article.getArticleId(), actionId);
	}
}
