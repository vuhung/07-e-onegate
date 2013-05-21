/**
 * 
 */
package com.vportal.portlet.vfaq.service.permission;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.security.auth.PrincipalException;
import com.liferay.portal.security.permission.PermissionChecker;
import com.vportal.portlet.vfaq.model.FAQQuestion;
import com.vportal.portlet.vfaq.service.FAQQuestionLocalServiceUtil;

/**
 * @author Nguyen Duy Nhat (nhatnd)
 * @since Mar 29, 2008
 */
public class FAQQuestionPermission {
	public static void check(PermissionChecker permissionChecker, long groupId,
			long questionId, String actionId) throws PortalException,
			SystemException {

		if (!contains(permissionChecker, groupId, questionId, actionId)) {
			throw new PrincipalException();
		}
	}

	public static void check(PermissionChecker permissionChecker,
			FAQQuestion question, String actionId) throws PortalException,
			SystemException {

		if (!contains(permissionChecker, question, actionId)) {
			throw new PrincipalException();
		}
	}

	public static boolean contains(PermissionChecker permissionChecker,
			long groupId, long questionId, String actionId)
			throws PortalException, SystemException {

		FAQQuestion question = FAQQuestionLocalServiceUtil.getQuestion(groupId,
				questionId);

		return contains(permissionChecker, question, actionId);
	}

	public static boolean contains(PermissionChecker permissionChecker,
			FAQQuestion question, String actionId) throws PortalException,
			SystemException {

		return permissionChecker.hasPermission(question.getGroupId(),
				FAQQuestion.class.getName(), question.getId(), actionId);
	}
}
