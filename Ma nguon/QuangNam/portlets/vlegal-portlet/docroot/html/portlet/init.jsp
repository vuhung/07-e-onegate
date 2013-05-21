<!-- 
*@author: Nguyen Tien Toi
*@since: 2012
*@school: Ha Noi Open University (HOU)
 -->
<%@page import="javax.portlet.PortletMode"%>
<%@page import="javax.portlet.WindowState"%>
<%@page import="com.liferay.portal.util.PortalUtil"%>
<%@page import="com.liferay.portlet.PortletURLUtil"%>
<%@taglib uri="http://java.sun.com/jstl/core_rt" prefix="c" %>
<%@taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>
<%@taglib uri="http://liferay.com/tld/aui" prefix="aui" %>
<%@taglib uri="http://liferay.com/tld/faces" prefix="liferay-faces" %>
<%@taglib uri="http://liferay.com/tld/portlet" prefix="liferay-portlet" %>
<%@taglib uri="http://liferay.com/tld/security" prefix="liferay-security" %>
<%@taglib uri="http://liferay.com/tld/theme" prefix="liferay-theme" %>
<%@taglib uri="http://liferay.com/tld/ui" prefix="liferay-ui" %>
<%@taglib uri="http://liferay.com/tld/util" prefix="liferay-util" %>

<%@page import="javax.portlet.PortletURL"%>

<portlet:defineObjects />

<%
	WindowState windowState = null;
	PortletMode portletMode = null;
	
	PortletURL currentURLObj = null;
	
	if(renderRequest != null)
	{
		windowState = renderRequest.getWindowState();
		portletMode = renderRequest.getPortletMode();
		currentURLObj = PortletURLUtil.getCurrent(renderRequest, renderResponse);
	}
	else if(resourceRequest != null)
	{
		windowState = resourceRequest.getWindowState();
		portletMode = resourceRequest.getPortletMode();
	}
	
	String currentURL = PortalUtil.getCurrentURL(request);
%>