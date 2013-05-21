<%@page import="com.liferay.portal.kernel.util.WebKeys"%>
<%@page import="com.liferay.portal.theme.ThemeDisplay"%>
<%@page import="com.liferay.portlet.PortletPreferencesFactoryUtil"%>
<%@page import="com.liferay.portal.kernel.util.Validator"%>
<%@page import="javax.portlet.PortletPreferences"%>

<%@page import="javax.portlet.WindowState"%>
<%@page import="javax.portlet.PortletURL"%>
<%@page import="com.liferay.portal.kernel.util.ParamUtil"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>

<portlet:defineObjects />
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<% 
String tabs = ParamUtil.getString(request, "tabs", "lookup.area");
String parentId = ParamUtil.getString(request, "parentId","0");

PortletURL areaURL = renderResponse.createRenderURL();
areaURL.setWindowState(WindowState.MAXIMIZED);
areaURL.setParameter("jspPage", "/html/quantri/view.jsp");
areaURL.setParameter("parentId",parentId);
areaURL.setParameter("tabs","lookup.area");
PortletURL priceURL = renderResponse.createRenderURL();
priceURL.setWindowState(WindowState.MAXIMIZED);
priceURL.setParameter("jspPage", "/html/quantri/price.jsp");
priceURL.setParameter("tabs","lookup.price");
priceURL.setParameter("parentId",parentId);
String language = ParamUtil.getString(request, "language", "vi_VN");
long groupId = ParamUtil.getLong(request, "groupId",0);

PortletPreferences prefs = renderRequest.getPreferences();
String portletResource = ParamUtil.getString(request, "portletResource");

if (Validator.isNotNull(portletResource)) {
	prefs = PortletPreferencesFactoryUtil.getPortletSetup(request, portletResource);
}
String titlecontent = prefs.getValue("title","Tra c&#7913;u gi&#225; &#273;&#7845;t");
String contentconfig = prefs.getValue("content","");

%>