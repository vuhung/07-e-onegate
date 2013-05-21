
<%@page import="com.liferay.portal.util.PortalUtil"%>
<%@page import="com.liferay.portlet.PortletURLUtil"%>
<%@page import="javax.portlet.WindowState"%>
<%@page import="javax.portlet.PortletMode"%>
<%@page import="javax.portlet.PortletURL"%>
<%@ taglib uri="http://java.sun.com/portlet" prefix="portlet"%>
<%@ taglib prefix="liferay-ui" uri="http://liferay.com/tld/ui" %>
<%@ taglib uri="http://liferay.com/tld/theme" prefix="liferay-theme" %>
<%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c" %>


<portlet:defineObjects />
<liferay-theme:defineObjects />


<%
WindowState windowState = null;
PortletMode portletMode = null;
PortletURL currentURLObj = null;



if (renderRequest != null) {
	windowState = renderRequest.getWindowState();
	portletMode = renderRequest.getPortletMode();

	currentURLObj = PortletURLUtil.getCurrent(renderRequest, renderResponse);
}
else if (resourceRequest != null) {
	windowState = resourceRequest.getWindowState();
	portletMode = resourceRequest.getPortletMode();

	//currentURLObj = PortletURLUtil.getCurrent(resourceRequest, resourceResponse);
}

//String currentURL = currentURLObj.toString();
String currentURL = PortalUtil.getCurrentURL(request);
%>

<%@ include file="/html/portlet/init-ext.jsp" %>