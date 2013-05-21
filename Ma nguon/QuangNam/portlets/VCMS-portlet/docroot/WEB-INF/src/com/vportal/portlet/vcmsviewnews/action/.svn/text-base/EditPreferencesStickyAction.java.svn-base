package com.vportal.portlet.vcmsviewnews.action;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.PortletConfig;
import javax.portlet.PortletException;
import javax.portlet.PortletPreferences;
import javax.portlet.PortletRequest;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.util.bridges.mvc.MVCPortlet;
import com.vportal.portal.util.PropsUtilExt;
import com.vportal.portlet.vcmsviewcontent.util.LayoutPortletUtil;

public class EditPreferencesStickyAction extends MVCPortlet {
	@Override
	public void processAction(ActionRequest req,
			ActionResponse actionResponse) throws IOException, PortletException {
		// TODO Auto-generated method stub
		String selectPortletLayout = ParamUtil.getString(req,
				"selectPortletLayout", StringPool.BLANK);

		String portletSelectId = ParamUtil.getString(req, "portletSelectId",
				StringPool.BLANK);

		String strPortletIds = ParamUtil.getString(req, "strPortletIds",
				StringPool.BLANK);

		String layoutPortletId = ParamUtil.getString(req, "layoutPortletId",
				StringPool.BLANK);


		// Save these settings to preferences
		PortletPreferences prefs = req.getPreferences();

		prefs.setValue(PropsUtilExt.VCMS_VIEW_STICKY_TYPE_SELECT_PORTLETLAYOUT,
				String.valueOf(selectPortletLayout));

		prefs.setValue(PropsUtilExt.VCMS_VIEW_STICKY_TYPE_SELECT_PORTLET_ID,
				String.valueOf(portletSelectId));

		prefs.setValue(PropsUtilExt.VCMS_VIEW_STICKY_TYPE_SELECT_PORTLET_IDS,
				String.valueOf(strPortletIds));

		prefs.setValue(
				PropsUtilExt.VCMS_VIEW_STICKY_TYPE_SELECT_LAYOUT_PORTLET_ID,
				String.valueOf(layoutPortletId));

		prefs.store();

		try {
			selectLayoutPortlet(req);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

//		sendRedirect(req, res);
	}
	
	@Override
	public void render(RenderRequest request, RenderResponse response)
			throws PortletException, IOException {
		// TODO Auto-generated method stub
		try {
			selectLayoutPortlet((ActionRequest)request);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}	

	private void selectLayoutPortlet(ActionRequest req) throws Exception {

		String cmd = ParamUtil.getString(req, "cmd");
		long layoutPlid = ParamUtil.getLong(req, "layoutIdSelected");

		List selectPortletLayoutIds = null;

		// StringBuffer strPortletIds = new StringBuffer();

		if (Validator.isNotNull(cmd) && cmd.equals("SELECT_LAYOUT")) {
			selectPortletLayoutIds = LayoutPortletUtil
					.getPortletIdsByLayout(layoutPlid);
		}

		req.setAttribute("SELECT_PORTLET_LAYOUT_IDS", selectPortletLayoutIds);

		req.setAttribute("PLID_LAYOUT", String.valueOf(layoutPlid));

		List selectLayouts = new ArrayList();

		LayoutPortletUtil.getLayoutPortletIds(selectLayouts, req,
				"vcmsviewcontent_INSTANCE_");

		req.setAttribute("SELECT_LAYOUTS", selectLayouts);
	}

}
