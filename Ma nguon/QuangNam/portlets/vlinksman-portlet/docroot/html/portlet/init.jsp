
<%@page import="com.liferay.portal.util.PortalUtil"%>
<%@page import="com.liferay.portlet.PortletURLUtil"%>
<%@page import="javax.portlet.PortletURL"%>
<%@page import="javax.portlet.PortletMode"%>
<%@page import="javax.portlet.WindowState"%>
<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet"%>
<%@ taglib uri="http://liferay.com/tld/theme" prefix="liferay-theme"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://liferay.com/tld/ui" prefix="liferay-ui"%>
<%@ taglib prefix="liferay-security" uri="http://liferay.com/tld/security"%>
<portlet:defineObjects />
<liferay-theme:defineObjects />
<%
	WindowState windowState = null;
	PortletMode portletMode = null;

	PortletURL currentURLObj = null;

	if (renderRequest != null) {
		windowState = renderRequest.getWindowState();
		portletMode = renderRequest.getPortletMode();

		currentURLObj = PortletURLUtil.getCurrent(renderRequest,
				renderResponse);
	} else if (resourceRequest != null) {
		windowState = resourceRequest.getWindowState();
		portletMode = resourceRequest.getPortletMode();

		//currentURLObj = PortletURLUtil.getCurrent(resourceRequest, resourceResponse);
	}

	//String currentURL = currentURLObj.toString();
	String currentURL = PortalUtil.getCurrentURL(request);
%>