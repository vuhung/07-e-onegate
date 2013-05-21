package com.vportal.portlet.vlegaldisplayhot.action;

import java.util.ArrayList;
import java.util.List;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.PortletPreferences;
import javax.portlet.PortletRequest;

import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.util.bridges.mvc.MVCPortlet;
import com.vportal.portlet.vlegaldisplaycontent.util.LayoutPortletUtil;

/**
 * Portlet implementation class ViewAction
 */
public class ViewHotAction extends MVCPortlet {
 
	public void processConfig(ActionRequest req, ActionResponse res)
			throws Exception {

		String period = ParamUtil.getString(req, "period");
		String title = ParamUtil.getString(req, "title");
		boolean isMarquee = ParamUtil.getBoolean(req, "isMarquee");

		String selectPortletLayout = ParamUtil.getString(req,
				"selectPortletLayout", StringPool.BLANK);

		String portletSelectId = ParamUtil.getString(req, "portletSelectId",
				StringPool.BLANK);

		String strPortletIds = ParamUtil.getString(req, "strPortletIds",
				StringPool.BLANK);

		String layoutPortletId = ParamUtil.getString(req, "layoutPortletId",
				StringPool.BLANK);

		String styleTitle = ParamUtil.getString(req, "styleTitle");
		String styleBorder = ParamUtil.getString(req, "styleBorder");
		String styleBullet = ParamUtil.getString(req, "styleBullet");
		String styleContent = ParamUtil.getString(req, "styleContent");

		String themeType = ParamUtil.getString(req, "themeType");
		String themeSelected = ParamUtil.getString(req, "themeSelected");
		boolean isBorder = ParamUtil.getBoolean(req, "isBorder");
		String bgcolor = ParamUtil.getString(req, "bgcolor");

		int paddingLeft = ParamUtil.getInteger(req, "paddingLeft");
		int paddingRight = ParamUtil.getInteger(req, "paddingRight");

		PortletPreferences prefs = req.getPreferences();

		prefs.setValue("paddingLeft", String.valueOf(paddingLeft));
		prefs.setValue("paddingRight", String.valueOf(paddingRight));

		prefs.setValue("bgcolor", bgcolor);
		prefs.setValue("isBorder", String.valueOf(isBorder));
		prefs.setValue("selectPortletLayout", String
				.valueOf(selectPortletLayout));
		prefs.setValue("portletSelectId", String.valueOf(portletSelectId));
		prefs.setValue("strPortletIds", String.valueOf(strPortletIds));
		prefs.setValue("layoutPortletId", String.valueOf(layoutPortletId));
		prefs.setValue("period", period);
		prefs.setValue("title", title);
		prefs.setValue("isMarquee", String.valueOf(isMarquee));

		prefs.setValue("styleTitle", styleTitle);
		prefs.setValue("styleBorder", styleBorder);
		prefs.setValue("styleBullet", styleBullet);
		prefs.setValue("styleContent", styleContent);

		prefs.setValue("themeType", themeType);
		prefs.setValue("themeSelected", themeSelected);

		prefs.store();

		selectLayoutPortlet(req);

		res.setRenderParameter("jspPage", "/html/portlet/vlegal_display_hot/view.jsp");
	}

	private void selectLayoutPortlet(PortletRequest req) throws Exception {

		String cmd = ParamUtil.getString(req, "cmd");
		long layoutPlid = ParamUtil.getLong(req, "layoutIdSelected");

		List selectPortletLayoutIds = null;

		if (Validator.isNotNull(cmd) && cmd.equals("SELECT_LAYOUT")) {
			selectPortletLayoutIds = LayoutPortletUtil
					.getPortletIdsByLayout(layoutPlid);
		}

		req.setAttribute("SELECT_PORTLET_LAYOUT_IDS", selectPortletLayoutIds);

		req.setAttribute("PLID_LAYOUT", String.valueOf(layoutPlid));

		List selectLayouts = new ArrayList();

		LayoutPortletUtil.getLayoutPortletIds(selectLayouts, req,
				"viewcontentaction_WAR_vlegal-portlet_INSTANCE_");

		req.setAttribute("SELECT_LAYOUTS", selectLayouts);
	}
}
