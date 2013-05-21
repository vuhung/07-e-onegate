<%@page import="com.liferay.portal.service.GroupLocalServiceUtil"%>
<%@page import="com.liferay.portlet.PortletPreferencesFactoryUtil"%>
<%@page import="javax.portlet.PortletPreferences"%>
<%@page import="com.liferay.portal.kernel.language.LanguageUtil"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.text.DateFormat"%>
<%@page import="com.liferay.portal.kernel.util.StringPool"%>
<%@page import="com.liferay.portal.kernel.util.GetterUtil"%>
<%@page import="com.liferay.portal.kernel.util.Validator"%>
<%@page import="com.liferay.portal.kernel.util.ParamUtil"%>
<%
/**
 * Copyright (c) 2000-2012 VPortal, Inc. All rights reserved.
 *
 */
%>

<%@ include file="/html/portlet/init.jsp" %>
	
<%-- <%@ page import="com.vportal.portlet.edirectory.*" %> --%>
<%-- <%@ page import="com.vportal.portlet.edirectory.model.*" %> --%>
<%-- <%@ page import="com.vportal.portlet.edirectory.action.*" %> --%>
<%-- <%@ page import="com.vportal.portlet.edirectory.service.*" %> --%>
<%-- <%@ page import="com.vportal.portlet.edirectory.service.impl.*" %>	 --%>

<%@ page import="com.vportal.portlet.vlegal.*" %>
<%@ page import="com.vportal.portlet.vlegal.model.*" %>
<%@ page import="com.vportal.portlet.vlegal.action.*" %>
<%@ page import="com.vportal.portlet.vlegal.service.*" %>
<%@ page import="com.vportal.portlet.vlegal.service.impl.*" %>
<%@ page import="com.vportal.portlet.vlegal.service.permission.*" %>
<%@ page import="com.vportal.portlet.vlegal.service.persistence.*" %>
<%@ page import="com.vportal.portlet.vlegal.util.*" %>
	
<%@ page import="com.vportal.portlet.vlegaldisplaycontent.util.*" %>
<%@ page import="com.vportal.portlet.vlegaldisplaymenu.action.*" %>

<%-- <%@ page import="com.vportal.portlet.admin.*" %> --%>
<%-- <%@ page import="com.vportal.portlet.admin.service.*" %> --%>
<%-- <%@ page import="com.vportal.portlet.admin.model.*" %> --%>

<%@ page import="com.vportal.portal.util.*" %>
<%@ page import="com.vportal.portal.model.*" %>
<%@ page import="com.vportal.portal.service.*" %>
<%@ page import="java.util.*" %>
<%@ page import="com.vportal.portlet.vlegal.util.permission.ActionKeysExt" %>

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
<liferay-theme:defineObjects/>


<%
	PortletPreferences prefs = renderRequest.getPreferences();
	
	String portletResource = ParamUtil.getString(request, "portletResource");
	
	if (Validator.isNotNull(portletResource)) {
		prefs = PortletPreferencesFactoryUtil.getPortletSetup(request, portletResource);
		System.out.println("Portlte Resource ----> " + prefs);
	}
	
	String pagesize = GetterUtil.getString(prefs.getValue("v-pagesize", StringPool.BLANK));
	
	String language = ParamUtil.getString(request, "language", "vi_VN");
	
	DateFormat dateFormatDateTime = new SimpleDateFormat("dd/MM/yyyy");
	
	Locale[] locales = LanguageUtil.getAvailableLocales();
	
	String layoutPortletId = prefs.getValue(ConstantKeysUtil.LAYOUT_PORTLET_ID,"");

	String portletSelectId = prefs.getValue(ConstantKeysUtil.PORTLET_SELECTED_ID,"viewcontentaction");	
	
	String style = prefs.getValue("style","1");
	String titlePortlet = prefs.getValue("titlePortlet","V&#259;n b&#7843;n pháp quy");
	
	String styleBorder = prefs.getValue("styleBorder","");
	String styleBullet = prefs.getValue("styleBullet","");
	String styleTitle = prefs.getValue("styleTitle","");
	String styleContent = prefs.getValue("styleContent","");
	
	String themeType = prefs.getValue("themeType","1");
	String themeSelected = prefs.getValue("themeSelected","");
	
	boolean isBorder = GetterUtil.getBoolean(prefs.getValue("isBorder",""), false);
	String bgcolor = prefs.getValue("bgcolor","#ffffff");
	
	long companyId = PortalUtil.getCompanyId(request);
	
	long groupId = ParamUtil.getLong(request, "groupId", portletGroupId.longValue());
// 	long groupId = PortalUtilExt.getPortletGroupId(request);
// 	long groupId = GroupLocalServiceUtil.getCompanyGroup(PortalUtil.getDefaultCompanyId()).getGroupId();
	
	long currentPlid = PortalUtilExt.getPlid(request);
	
	long userId = PortalUtilExt.getUserId(request);
	
	int paddingLeft = GetterUtil.getInteger(prefs.getValue("paddingLeft",""),4);
	int paddingRight = GetterUtil.getInteger(prefs.getValue("paddingRight",""),4);
	
	long plId = 0;
	
	try{
		plId = PortalUtilExt.getPlid(groupId, currentPlid, portletSelectId);
	}catch(Exception ex){
		System.out.println("Not found Layout...");
	}


%>
<%!
	public static SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
	public static SimpleDateFormat yearFormat = new SimpleDateFormat("yyyy");
%>