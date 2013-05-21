<%@ include file="/html/portlet/init.jsp" %>
<%@ include file="css.jsp"%>

<%@ page import="com.vportal.portlet.vimagegallery.*"%>
<%@ page import="com.vportal.portlet.vimagegallery.model.*"%>
<%@ page import="com.vportal.portlet.vimagegallery.model.impl.*"%>
<%@ page import="com.vportal.portlet.vimagegallery.service.*"%>
<%@ page import="com.vportal.portlet.vimagegallery.*"%>
<%@ page import="com.vportal.portlet.vimagegallerymenu.*"%>	
<%@ page import="com.vportal.portlet.vimagegalleryview.*"%>	
		
<%@ page import="com.vportal.portal.util.*" %>
<%@ page import="com.vportal.portal.model.*" %>
<%@ page import="com.vportal.portal.service.*" %>	
<%@ page import="com.vportal.portal.util.PortalUtilExt" %>
<%@ page import="com.liferay.portlet.PortletPreferencesFactoryUtil" %>
<%@ taglib uri="http://liferay.com/tld/portlet" prefix="liferay-portlet"%>
<%
	PortletPreferences prefs = renderRequest.getPreferences();

	String portletResource = ParamUtil.getString(request, "portletResource");
	
	if (Validator.isNotNull(portletResource)) {
		prefs = PortletPreferencesFactoryUtil.getPortletSetup(request, portletResource);
	}
	
	long groupId = PortalUtilExt.getPortletGroupId(request);
	long currentPlid = PortalUtilExt.getPlid(request);
	
	String numOfImagePerPage = prefs.getValue("numofImagePerPage", "3");
	String speed = prefs.getValue("speed","5");
	
	boolean showControl = GetterUtil.getBoolean(prefs.getValue("showControl", "true"));
	boolean showDesc = GetterUtil.getBoolean(prefs.getValue("showDesc", "true"));
	
	String styleBorder = prefs.getValue("styleBorder","");
	String styleBullet = prefs.getValue("styleBullet","");
	String styleTitle = prefs.getValue("styleTitle","");
	String styleContent = prefs.getValue("styleContent","");
	
	String themeType = prefs.getValue("themeType","1");
	String themeSelected = prefs.getValue("themeSelected","");
	
	String titlePortlet = prefs.getValue("titlePortlet","Th&#432; vi&#7879;n &#7843;nh");	
%>