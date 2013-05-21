<%@page import="com.liferay.portlet.PortletPreferencesFactoryUtil"%>
<%@page import="com.liferay.portal.kernel.util.Validator"%>
<%@page import="com.liferay.portal.kernel.util.ParamUtil"%>
<%@page import="javax.portlet.PortletPreferences"%>
<%@include file="/init.jsp"%>
<%
	PortletPreferences prefs = renderRequest.getPreferences();

	String portletResource = ParamUtil.getString(request,"portletResource");

	if (Validator.isNotNull(portletResource)) {
		prefs = PortletPreferencesFactoryUtil.getPortletSetup(request,portletResource);

	}

	String displayStyle = prefs.getValue("displayStyle", "3");
%>
