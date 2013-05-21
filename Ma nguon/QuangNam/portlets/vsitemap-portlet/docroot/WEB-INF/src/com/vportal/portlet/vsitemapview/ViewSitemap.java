package com.vportal.portlet.vsitemapview;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.PortletConfig;
import javax.portlet.PortletPreferences;

import com.liferay.portal.kernel.servlet.SessionMessages;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.util.bridges.mvc.MVCPortlet;

/**
 * Portlet implementation class ViewSitemap
 */
public class ViewSitemap extends MVCPortlet {
	public void processAction(ActionRequest req, ActionResponse res) {
	try {

		String themeType = ParamUtil.getString(req, "themeType");
		String themeSelected = ParamUtil.getString(req, "themeSelected");
		String titlePortlet = ParamUtil.getString(req, "titlePortlet");
		String bgcolor = ParamUtil.getString(req, "bgcolor");

		PortletPreferences prefs = req.getPreferences();

		prefs.setValue("themeType", themeType);
		prefs.setValue("themeSelected", themeSelected);
		prefs.setValue("titlePortlet", titlePortlet);
		prefs.setValue("bgcolor", bgcolor);
		prefs.store();
		} catch (Exception ex) {
		ex.printStackTrace();
	}
	res.setRenderParameter("jspPage", "/html/portlet/vsitemapview/view.jsp");

}}
