<%@page import="com.liferay.portlet.PortletPreferencesFactoryUtil"%>
<%@page import="javax.portlet.PortletPreferences"%>
<%@ include file="/html/portlet/init.jsp" %>
<%@ include file="css.jsp"%>
<%@ page import="com.vportal.portlet.vadvman.*" %>
<%@ page import="com.vportal.portlet.vadvman.model.*" %>
<%@ page import="com.vportal.portlet.vadvman.model.impl.*" %>
<%@ page import="com.vportal.portlet.vadvman.action.*" %>
<%@ page import="com.vportal.portlet.vadvman.service.*" %>
<%@ page import="com.vportal.portlet.vadvman.service.impl.*" %>
<%@ page import="com.vportal.portlet.vadvman.service.permission.*" %>
<%@ page import="com.vportal.portlet.vadvman.util.*" %>

<%@ page import="com.vportal.portal.util.*" %>
<%@ page import="com.vportal.portal.model.*" %>
<%@ page import="com.vportal.portal.service.*" %>
<%@ page import="java.util.*" %>
	
<%@ page import="com.liferay.portlet.documentlibrary.*" %>
<%@ page import="com.liferay.portlet.documentlibrary.service.*" %>
<%@ page import="com.liferay.portlet.documentlibrary.util.*" %>	

	
<%
PortletPreferences prefs = renderRequest.getPreferences();

String portletResource = ParamUtil.getString(request, "portletResource");

if (Validator.isNotNull(portletResource)) {
	prefs = PortletPreferencesFactoryUtil.getPortletSetup(request, portletResource);
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
%>