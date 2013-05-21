package com.vportal.portlet.vlegaldisplaymenu.action;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.PortletConfig;
import javax.portlet.PortletException;
import javax.portlet.PortletPreferences;
import javax.portlet.PortletRequest;
import javax.portlet.ProcessAction;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;
import javax.xml.namespace.QName;

import com.liferay.portal.kernel.portlet.ConfigurationAction;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.kernel.util.WebKeys;
import com.liferay.portal.theme.ThemeDisplay;
import com.liferay.util.bridges.mvc.MVCPortlet;
import com.vportal.portlet.vlegaldisplaycontent.util.ConstantKeysUtil;
import com.vportal.portlet.vlegaldisplaycontent.util.LayoutPortletUtil;

/**
 * Portlet implementation class ViewAction
 */
public class ViewMenuAction extends MVCPortlet {
	
	@ProcessAction(name="menuAction")
	public void processAction(ActionRequest request, ActionResponse response)
	{
		try
		{
			ThemeDisplay themeDisplay = (ThemeDisplay)request.getAttribute(WebKeys.THEME_DISPLAY);
			long groupId = themeDisplay.getScopeGroupId();
			String organizationid = request.getParameter("organizationid");
			String typedocid = request.getParameter("typedocid");
			String language = request.getParameter("language");
			String searchBasic = request.getParameter("searchBasic");
			
			PortletPreferences prefs = request.getPreferences();
	
			String titlePortlet = ParamUtil.getString(request, "titlePortlet");
			
			String layoutPortletId = ParamUtil.getString(request, "layoutPortletId",
					StringPool.BLANK);
	
			String portletSelectId = ParamUtil.getString(request, "portletSelectId",
					StringPool.BLANK);
	
			prefs.setValue(ConstantKeysUtil.LAYOUT_PORTLET_ID, String
					.valueOf(layoutPortletId));
	
			prefs.setValue(ConstantKeysUtil.PORTLET_SELECTED_ID, String
					.valueOf(portletSelectId));
			
			prefs.setValue("titlePortlet", titlePortlet);
	
			prefs.store();
	
			selectLayoutPortlet(request);
			
			response.setRenderParameter("organizationid", organizationid);
			response.setRenderParameter("typedocid", typedocid);
			response.setRenderParameter("language", language);
			response.setRenderParameter("searchBasic", searchBasic);
			
		}catch(Exception ex)
		{
			
		}
	}
	
	@Override
	public void render(RenderRequest request, RenderResponse response) throws PortletException, IOException
	{
		
		try {
			
			selectLayoutPortlet(request);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		super.render(request, response);
	}

	@SuppressWarnings("rawtypes")
	private void selectLayoutPortlet(PortletRequest req) throws Exception {

		String cmd = ParamUtil.getString(req, "cmd");

		long layoutPlid = ParamUtil.getLong(req, "layoutIdSelected");

		List selectPortletLayoutIds = null;

		if (Validator.isNotNull(cmd) && cmd.equals("SELECT_LAYOUT")) {
			selectPortletLayoutIds = LayoutPortletUtil.getPortletIdsByLayout(layoutPlid);
		}

		req.setAttribute("SELECT_PORTLET_LAYOUT_IDS", selectPortletLayoutIds);

		req.setAttribute("PLID_LAYOUT", String.valueOf(layoutPlid));

		List selectLayouts = new ArrayList();
		
		LayoutPortletUtil.getLayoutPortletIds(selectLayouts, req,"viewcontentaction_WAR_vlegalportlet_INSTANCE_");

		req.setAttribute("SELECT_LAYOUTS", selectLayouts);
	}


}
