package com.vsi.vdoc.portlet;

import java.io.IOException;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.Event;
import javax.portlet.EventRequest;
import javax.portlet.EventResponse;
import javax.portlet.PortletException;
import javax.portlet.PortletPreferences;
import javax.portlet.ReadOnlyException;
import javax.portlet.ValidatorException;

import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.util.bridges.mvc.MVCPortlet;

public class VDocContent extends MVCPortlet{

	@Override
	public void processEvent(EventRequest request, EventResponse response)
			throws PortletException, IOException {
		Event event = request.getEvent();
		String orgId = (String)event.getValue();
		response.setRenderParameter("orgId", orgId);
	}
	
	public void viewVDoc(ActionRequest req, ActionResponse res) throws ReadOnlyException, ValidatorException, IOException{
		String title = ParamUtil.getString(req, "titlePortlet", StringPool.BLANK);
		String numberItem = ParamUtil.getString(req, "numberItem");
		
		PortletPreferences prefs = req.getPreferences();
		prefs.setValue("title", title);
		prefs.setValue("numberItem", numberItem);
		
		prefs.store();
		res.setRenderParameter("jspPage", "/html/vdocview/view.jsp");
	}
}
