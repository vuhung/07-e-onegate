<%@ include file="/html/portlet/init.jsp" %>
<%@page import="javax.portlet.PortletPreferences"%>
<%@page import="com.liferay.portal.kernel.util.Validator"%>
<%@page import="com.liferay.portlet.PortletPreferencesFactoryUtil"%>
<%@page import="com.liferay.portal.kernel.util.ParamUtil"%>
<%@page import="com.liferay.portal.kernel.util.GetterUtil"%>
<%@ page import="com.vportal.portlet.vlinksman.*" %>
<%@ page import="com.vportal.portlet.vlinksman.model.*" %>
<%@ page import="com.vportal.portlet.vlinksman.service.*" %>
<%@ page import="com.vportal.portlet.vlinksman.service.impl.*" %>
<%@ page import="com.vportal.portlet.vlinksman.service.permission.*" %>
<%@ page import="com.vportal.portlet.vlinksman.util.*" %>
<%@ page import="com.vportal.portal.util.*" %>
<%@ page import="com.vportal.portal.model.*" %>
<%@ page import="com.vportal.portal.service.*" %>
<%@ page import="java.util.*" %>
<style type="text/css">
	.left{
		width: 48%;
		float: left;		
	}
	.right{
		width: 48%;
		float: left;		
	}
	
	.left3{		
		width: 220px;
		float: left;
	}
	.right3{
		width: 220px;
		float: left;
	}
</style>	
<%
	PortletPreferences prefs = renderRequest.getPreferences();
	String portletResource = ParamUtil.getString(request, "portletResource"); 	
 	if (Validator.isNotNull(portletResource)) {
 	        prefs = PortletPreferencesFactoryUtil.getPortletSetup(request, portletResource);
 	}
 	
 	long groupId = ParamUtil.getLong(request, "groupId",0);
	if(groupId == 0){
		groupId = portletGroupId.longValue();
	}
	
	
	String[] linkGroupIds = prefs.getValues("linkGroupIds",null);	
	String linkgroupId = prefs.getValue("linkgroupId","");	
	String titlePortlet = prefs.getValue("titlePortlet","Liên k&#7871;t Website");
	
	int style = GetterUtil.getInteger(prefs.getValue("style",""),3);
	int typeDisplay = GetterUtil.getInteger(prefs.getValue("typeDisplay",""),1);
	
	int paddingLeft = GetterUtil.getInteger(prefs.getValue("paddingLeft",""),4);
	int paddingRight = GetterUtil.getInteger(prefs.getValue("paddingRight",""),4);
	
	String styleBorder = prefs.getValue("styleBorder","");
	String styleBullet = prefs.getValue("styleBullet","");
	String styleTitle = prefs.getValue("styleTitle","");
	String styleContent = prefs.getValue("styleContent","");
	
	String themeType = prefs.getValue("themeType","1");
	String themeSelected = prefs.getValue("themeSelected","");
	
	String lgId = ParamUtil.getString(request, "linkGroupId","0");

	boolean isBorder = GetterUtil.getBoolean(prefs.getValue("isBorder",""), false);
	String bgcolor = prefs.getValue("bgcolor","#ffffff");
%>