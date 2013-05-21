
<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>

<%-- <%@ taglib uri="http://liferay.com/tld/aui" prefix="aui" %> --%>
<%@ taglib uri="http://liferay.com/tld/portlet" prefix="liferay-portlet" %>
<%@ taglib uri="http://liferay.com/tld/theme" prefix="liferay-theme" %>
<%@ taglib uri="http://liferay.com/tld/ui" prefix="liferay-ui" %>
<%@ taglib uri="http://liferay.com/tld/util" prefix="liferay-util" %>
<%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c" %>

<%@page import="com.liferay.portal.kernel.util.WebKeys"%>
<%@page import="com.liferay.portal.theme.ThemeDisplay"%>
<%@page import="com.liferay.portal.kernel.util.GetterUtil"%>
<%@page import="com.liferay.portal.kernel.util.ParamUtil"%>
<%@page import="com.liferay.portlet.documentlibrary.util.DLUtil"%>
<%@page import="com.liferay.portal.kernel.util.PropsUtil"%>
<%@page import="com.liferay.portal.kernel.util.ParamUtil"%>
<%@page import="com.liferay.portlet.PortletPreferencesFactoryUtil"%>
<%@page import="com.liferay.portal.kernel.util.StringPool"%>
<%@page import="com.liferay.portal.kernel.util.HtmlUtil"%>
<%@page import="com.liferay.portal.kernel.util.Validator"%>
<%@page import="javax.portlet.PortletPreferences"%>
<%@page import="java.lang.String"%>

<%-- <%@page contentType="text/html" pageEncoding="UTF-8"%>	 --%>

<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>
<%-- <%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c" %> --%>

<portlet:defineObjects />
<liferay-theme:defineObjects />
<%
PortletPreferences prefs = renderRequest.getPreferences();

String portletResource = ParamUtil.getString(request, "portletResource");

if (Validator.isNotNull(portletResource)) {
	prefs = PortletPreferencesFactoryUtil.getPortletSetup(request, portletResource);
}
 	
 	long groupId = ParamUtil.getLong(request, "groupId",0);
 	ThemeDisplay themeDisplay2= (ThemeDisplay) request.getAttribute(WebKeys.THEME_DISPLAY);
	if(groupId == 0){
		groupId = themeDisplay2.getScopeGroupId();
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