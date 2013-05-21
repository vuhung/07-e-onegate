package com.portlet.weather;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.PortletPreferences;

import com.liferay.portal.kernel.util.Constants;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.util.bridges.mvc.MVCPortlet;

/**
 * Portlet implementation class weather
 */
public class weather extends MVCPortlet {

	public void processDisplayStyle(ActionRequest request,
			ActionResponse response) throws Exception {

		String cmd = ParamUtil.getString(request, Constants.CMD);

		if (!cmd.equals(Constants.UPDATE)) {
			return;
		}

		PortletPreferences prefs = request.getPreferences();

		String displayStyle = ParamUtil.getString(request, "displayStyle");

		prefs.setValue("displayStyle", displayStyle);

		prefs.store();

		response.setRenderParameter("jspPage", "/html/weather/view.jsp");

	}
}
