package com.vsi.vdoc.portlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.PortletException;
import javax.portlet.PortletPreferences;
import javax.portlet.ProcessAction;
import javax.portlet.ReadOnlyException;
import javax.portlet.ValidatorException;
import javax.xml.namespace.QName;

import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.util.bridges.mvc.MVCPortlet;
import com.portlet.vdoc.model.vdocOrg;

public class VDocMenu extends MVCPortlet{
	
	public void ipcVdoc(ActionRequest actionRequest,
			ActionResponse actionResponse) throws IOException, PortletException {
		String orgId = actionRequest.getParameter("orgId");
		QName qName = new QName("http://liferay.com/events", "ipc.vdoc");
		actionResponse.setEvent(qName, orgId);
	}
	
	public void savePreferences(ActionRequest req, ActionResponse res) throws ReadOnlyException, ValidatorException, IOException{
		String title = ParamUtil.getString(req, "title", StringPool.BLANK);
		String url = ParamUtil.getString(req, "url");
	
		String fields = ParamUtil.getString(req, "fields",StringPool.BLANK);
		String orgs = ParamUtil.getString(req, "orgs", StringPool.BLANK);
		
		int styleDisplay = ParamUtil.getInteger(req, "styleDisplay");
		
		int documentPerPortlet = ParamUtil.getInteger(req, "documentPerPortlet");
		int period = ParamUtil.getInteger(req, "period");
		
		PortletPreferences prefs = req.getPreferences();
		
		prefs.setValue("title", title);
		prefs.setValue("url", url);
		prefs.setValue("fields", fields);
		prefs.setValue("orgs", orgs);
		prefs.setValue("styleDisplay",String.valueOf(styleDisplay) );
		prefs.setValue("documentPerPortlet", String.valueOf(documentPerPortlet));
		prefs.setValue("period", String.valueOf(period));
		
		prefs.store();
		res.setRenderParameter("jspPage", "/html/vdocmenu/view.jsp");
		
	}

}
