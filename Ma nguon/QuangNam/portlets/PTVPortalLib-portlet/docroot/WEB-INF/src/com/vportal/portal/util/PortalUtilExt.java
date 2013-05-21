package com.vportal.portal.util;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;

import javax.portlet.ActionRequest;
import javax.portlet.RenderRequest;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.tools.ant.taskdefs.condition.Http;

import com.liferay.portal.NoSuchLayoutException;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.MethodKey;
import com.liferay.portal.kernel.util.PortalClassInvoker;
import com.liferay.portal.kernel.util.PropsUtil;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.kernel.util.WebKeys;
import com.liferay.portal.model.Layout;
import com.liferay.portal.model.LayoutTypePortlet;
import com.liferay.portal.model.Role;
import com.liferay.portal.model.User;
import com.liferay.portal.service.LayoutLocalServiceUtil;
import com.liferay.portal.service.RoleLocalServiceUtil;
import com.liferay.portal.service.UserLocalServiceUtil;
import com.liferay.portal.theme.ThemeDisplay;
import com.liferay.portal.util.PortalUtil;
import com.vportal.portal.servlet.MainServlet;

public class PortalUtilExt {
	/**
	 * Count the number of active sessions.
	 * 
	 * @param String
	 *            companyId
	 * @return Integer - Number of online sessions created.
	 * @throws Exception 
	 * @throws NumberFormatException 
	 */
	public static int getOnlineGuests(String companyId) throws NumberFormatException, Exception {

		MethodKey method = new MethodKey("com.liferay.portal.util.WebAppPool", "get",String.class, String.class,String.class);
		Object[] args = new Object[]{companyId, PropsUtilExt.LIVE_SESSIONS};
		return Integer.parseInt(GetterUtil.get((String) PortalClassInvoker.invoke(false, method, args), "0"));
		/*return Integer.parseInt(GetterUtil.get((String) WebAppPool.get(
				companyId, PropsUtilExt.LIVE_SESSIONS), "0"));*/
	}
	
	/**
	 * Count total visited.
	 * 
	 * @param String
	 *            companyId
	 * @return Integer - total visited.
	 * @throws Exception 
	 */
	
	public static int getTotalVisit(String companyId) throws Exception {
		/*return GetterUtil.getInteger((String) WebAppPool.get(
				companyId, PropsUtilExt.TOTAL_VISIT), 0);*/
		MethodKey method = new MethodKey("com.liferay.portal.util.WebAppPool", "get",String.class, String.class,String.class);
		Object[] args = new Object[]{companyId,PropsUtilExt.TOTAL_VISIT};
		return GetterUtil.getInteger((String) PortalClassInvoker.invoke(false, method, args), 0);
				
	}
	
	public static int getTotalVcmsCount(String companyId) throws Exception {
		MethodKey method = new MethodKey("com.liferay.portal.util.WebAppPool", "get",String.class, String.class,String.class);
		Object[] args = new Object[]{companyId,PropsUtilExt.VCMS_VISIT_COUNT};
		return GetterUtil.getInteger((String) PortalClassInvoker.invoke(false, method, args), 0);
		/*return GetterUtil.getInteger((String) WebAppPool.get(
				companyId, PropsUtilExt.VCMS_VISIT_COUNT), 0);*/
	}
	
	
	/**
	 * Count the number of authenticated users.
	 * 
	 * @param String
	 *            companyId
	 * @return Integer - Number of online authenticated users.
	 */
	public static int getOnlineUsers(String companyId) throws Exception {
		MethodKey method = new MethodKey("com.liferay.portal.util.WebAppPool", "get",String.class, String.class,String.class);
		//hoan get code from file com.liferay.portal.util.WebKeys
		String LIVE_USERS = "LIVE_USERS";
		//hoan
		Object[] args = new Object[]{companyId,LIVE_USERS};
		
		/*Map currentUsers = (Map) WebAppPool.get(companyId, WebKeys.LIVE_USERS);*/
		Map currentUsers = (Map) PortalClassInvoker.invoke(false, method, args);

		if ((currentUsers != null) && (currentUsers.size() > 0)) {
			return currentUsers.size();
		} else {
			return 0;
		}

	}

	/**
	 * Check if the current user is authenticated or not.
	 * 
	 * @param req
	 *            HttpServletRequest
	 * @return TRUE | FALSE
	 * @throws Exception
	 */
	public static boolean isAuthenticated(HttpServletRequest req)
			throws Exception {

		long remoteUser = GetterUtil.getLong(req.getRemoteUser());
		User localUser = PortalUtil.getUser(req);

		return ((localUser != null) && remoteUser == localUser.getUserId());
	}

	/**
	 * Check if the current user has authorization to access the portal/portlet
	 * layout.
	 * 
	 * @param req
	 *            HttpServletRequest
	 * @return TRUE | FALSE
	 * @throws Exception
	 */
	public static boolean isAuthorized(HttpServletRequest req) throws Exception {

		String[] authRoles = StringUtil.split(GetterUtil.getString(PropsUtil
				.get(PropsUtilExt.AUTH_PRIVATE_LAYOUT_ROLES), ""), ",");

		User user = PortalUtil.getUser(req);
		boolean userHasRoles = false;

		for (int i = 0; (i < authRoles.length) && !userHasRoles; i++) {

			Role role = RoleLocalServiceUtil.getRole(PortalUtil
					.getCompanyId(req), authRoles[i]);

			userHasRoles |= UserLocalServiceUtil.hasRoleUser(role.getRoleId(),
					user.getUserId());
		}

		return userHasRoles;
	}

	


	/**
	 * Get the default forward path. This will be used in such a case as after
	 * logging in or logging out...
	 * 
	 * @return String - The pre-set forward path.
	 */
	public static String getDefaultForwardPath() {

		return GetterUtil.getString(PropsUtil
				.get(PropsUtilExt.AUTH_FORWARD_PATH_DEFAULT),
				WebKeysExt.DEFAULT_REDIRECT_PATH);
	}

	/**
	 * Get the current context path, for use in such cases as redirecting a user
	 * to the previous path after logging in.
	 * 
	 * @return String - The current context path.
	 */
	public static String getCurrentContextPath(HttpServletRequest req) {

		String contextPath = req.getContextPath();

		return contextPath;
	}

	/**
	 * @author nhatnd
	 * @param companyId
	 * @return
	 * @throws Exception 
	 * @throws NumberFormatException 
	 */
	public static int getCurrentOnlineUsers(String companyId) throws NumberFormatException, Exception {
		MethodKey method = new MethodKey("com.liferay.portal.util.WebAppPool", "get",String.class, String.class,String.class);
		Object[] args = new Object[]{companyId,PropsUtilExt.LIVE_SESSIONS};
		/*return Integer.parseInt(GetterUtil.get((String) WebAppPool.get(
				companyId, PropsUtilExt.LIVE_SESSIONS), "0"));*/
		return Integer.parseInt(GetterUtil.get((String) PortalClassInvoker.invoke(false, method, args), "0"));
	}

	public static User getUser(RenderRequest req) {
		HttpServletRequest httpReq = PortalUtil.getHttpServletRequest(req);
		return getUser(httpReq);
	}

	public static User getUser(ActionRequest req) {
		HttpServletRequest httpReq = PortalUtil.getHttpServletRequest(req);
		return getUser(httpReq);
	}

	public static User getUser(HttpServletRequest req) {
		ThemeDisplay themeDisplay = (ThemeDisplay) req
				.getAttribute(WebKeys.THEME_DISPLAY);
		return themeDisplay.getUser();
	}

	public static long getUserId(HttpServletRequest req) {
		ThemeDisplay themeDisplay = (ThemeDisplay) req
				.getAttribute(WebKeys.THEME_DISPLAY);
		return themeDisplay.getUserId();
	}

	public static long getUserId(RenderRequest req) {
		HttpServletRequest httpReq = PortalUtil.getHttpServletRequest(req);
		return getUserId(httpReq);
	}

	public static long getUserId(ActionRequest req) {
		HttpServletRequest httpReq = PortalUtil.getHttpServletRequest(req);
		return getUserId(httpReq);
	}

	public static long getPortletGroupId(RenderRequest req) throws PortalException, SystemException {
		return PortalUtil.getScopeGroupId(req);
	}

	public static long getPortletGroupId(ActionRequest req) throws PortalException, SystemException {
		return PortalUtil.getScopeGroupId(req);
	}

	public static long getPortletGroupId(HttpServletRequest req) throws PortalException, SystemException {
		return PortalUtil.getScopeGroupId(req);
	}

	public static long getCompanyId(ActionRequest req) {
		return PortalUtil.getCompanyId(req);
	}

	public static long getCompanyId(RenderRequest req) {
		return PortalUtil.getCompanyId(req);
	}

	public static long getCompanyId(HttpServletRequest req) {
		return PortalUtil.getCompanyId(req);
	}

	public static long getPlid(HttpServletRequest req) {
		ThemeDisplay themeDisplay = (ThemeDisplay) req
				.getAttribute(WebKeys.THEME_DISPLAY);
		return themeDisplay.getPlid();
	}

	public static long getPlid(RenderRequest req) {
		HttpServletRequest httpReq = PortalUtil.getHttpServletRequest(req);
		return getPlid(httpReq);
	}
	public static long getPlid(long groupId, long currentPlid,
			String portletId) throws Exception {
        long plId=0;
		// check if this layout is private or not
		boolean privateLayout = false;
		Layout currentLayout = LayoutLocalServiceUtil.getLayout(currentPlid);
		privateLayout = currentLayout.getPrivateLayout();
		
		// find portlet in layout
		List layouts = LayoutLocalServiceUtil
				.getLayouts(groupId, privateLayout);

		for (int i = 0; i < layouts.size(); i++) {
			Layout layout = (Layout) layouts.get(i);		
			LayoutTypePortlet layoutTypePortlet = (LayoutTypePortlet) layout
					.getLayoutType();
			if (layoutTypePortlet.hasPortletId(portletId)) {
				plId = layout.getPlid();
			}
		}
		return plId;
	}
	public static long getPlid(ActionRequest req) {
		HttpServletRequest httpReq = PortalUtil.getHttpServletRequest(req);
		return getPlid(httpReq);
	}

	
}
