package com.vportal.util;

import javax.portlet.ActionRequest;
import javax.portlet.PortletRequest;
import javax.portlet.RenderRequest;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import com.liferay.portal.util.PortalUtil;

/**
 * @author donghh
 * @version 1.0.00, Jun 11, 2008
 */

public class SystemServiceUtil {
	public static HttpSession getSession(PortletRequest req) {
		/*RenderRequestImpl reqImpl = (RenderRequestImpl) req;

		HttpServletRequest httpReq = reqImpl.getHttpServletRequest();*/
		HttpServletRequest httpReq = PortalUtil.getHttpServletRequest(req);
		return httpReq.getSession();
		
	}

	public static HttpSession getSession(ActionRequest req) {
		/*HttpServletRequest httpReq = ((ActionRequestImpl) req)
				.getHttpServletRequest();

		// HttpServletRequest httpReq = reqImpl.getHttpServletRequest();
*/
		HttpServletRequest httpReq = PortalUtil.getHttpServletRequest(req);
		return httpReq.getSession();
	}

	public static HttpSession getSession(RenderRequest req) {
		/*HttpServletRequest httpReq = ((RenderRequestImpl) req)
				.getHttpServletRequest();*/
		HttpServletRequest httpReq = PortalUtil.getHttpServletRequest(req);
		return httpReq.getSession();
	}

}
