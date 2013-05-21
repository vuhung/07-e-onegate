<%@page import="com.liferay.portal.kernel.util.WebKeys"%>
<%@page import="com.liferay.portal.theme.ThemeDisplay"%>
<%@page import="com.liferay.portal.kernel.util.GetterUtil"%>
<%@page import="com.liferay.portal.kernel.util.ParamUtil"%>
<%@page import="com.liferay.portlet.PortletPreferencesFactoryUtil"%>
<%@page import="com.liferay.portal.kernel.util.Validator"%>
<%@page import="javax.portlet.PortletPreferences"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<portlet:defineObjects />
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%
PortletPreferences prefs = renderRequest.getPreferences();

String portletResource = ParamUtil.getString(request, "portletResource");

if (Validator.isNotNull(portletResource)) {
	prefs = PortletPreferencesFactoryUtil.getPortletSetup(request, portletResource);
}
 	
 	long groupId = ParamUtil.getLong(request, "groupId",0);
 	ThemeDisplay themeDisplay2= (ThemeDisplay) request.getAttribute(WebKeys.THEME_DISPLAY);
	if(groupId == 0){
		groupId = themeDisplay2.getPortletGroupId();
	}
	String styleBorder = prefs.getValue("styleBorder","");
	String styleBullet = prefs.getValue("styleBullet","");
	String styleTitle = prefs.getValue("styleTitle","");
	String styleContent = prefs.getValue("styleContent","");
	
	String themeType = prefs.getValue("themeType","1");
	String themeSelected = prefs.getValue("themeSelected","");

	boolean isBorder = GetterUtil.getBoolean(prefs.getValue("isBorder",""), false);
	String bgcolor = prefs.getValue("bgcolor","#ffffff");
	int paddingLeft = GetterUtil.getInteger(prefs.getValue("paddingLeft",""),0);
	int paddingRight = GetterUtil.getInteger(prefs.getValue("paddingRight",""),0);
	
	int paddingTop = GetterUtil.getInteger(prefs.getValue("paddingTop",""),0);
	int paddingBottom = GetterUtil.getInteger(prefs.getValue("paddingBottom",""),0);
	
%>