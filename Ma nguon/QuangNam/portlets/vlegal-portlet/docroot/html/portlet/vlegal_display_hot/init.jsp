<%@page import="javax.portlet.PortletPreferences"%>
<%@page import="com.liferay.portal.kernel.language.LanguageUtil"%>
<%@page import="com.liferay.portal.model.Layout"%>
<%@page import="com.liferay.portal.kernel.util.Validator"%>
<%@page import="com.liferay.portal.kernel.util.GetterUtil"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.text.DateFormat"%>
<%@page import="com.liferay.portlet.PortletPreferencesFactoryUtil"%>
<%@page import="com.liferay.portal.kernel.util.ParamUtil"%>
<%-- <%@page import="com.liferay.portal.model.PortletPreferences"%> --%>
<%@page import="com.liferay.portal.service.GroupLocalServiceUtil"%>
<%
/**
 * Copyright (c) 2000-2008 VPortal, Inc. All rights reserved.
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */
%>

<%@ include file="/html/portlet/init.jsp" %>

<%@ page import="com.vportal.portlet.vlegal.*" %>
<%@ page import="com.vportal.portlet.vlegal.model.*" %>
<%@ page import="com.vportal.portlet.vlegal.action.*" %>
<%@ page import="com.vportal.portlet.vlegal.service.*" %>
<%@ page import="com.vportal.portlet.vlegal.service.impl.*" %>
<%@ page import="com.vportal.portlet.vlegal.service.permission.*" %>
<%@ page import="com.vportal.portlet.vlegal.service.persistence.*" %>
<%@ page import="com.vportal.portlet.vlegal.util.*" %>
	
<%@ page import="com.vportal.portlet.vlegaldisplaycontent.util.*" %>
<%@ page import="com.vportal.portlet.vlegaldisplaycontent.action.*" %>

<%-- <%@ page import="com.vportal.portlet.admin.*" %> --%>
<%-- <%@ page import="com.vportal.portlet.admin.service.*" %> --%>
<%-- <%@ page import="com.vportal.portlet.admin.model.*" %> --%>

<%@ page import="com.vportal.portal.util.*" %>
<%@ page import="com.vportal.portal.model.*" %>
<%@ page import="com.vportal.portal.service.*" %>
<%@ page import="java.util.*" %>
<%@ page import="com.vportal.portlet.vlegal.util.permission.ActionKeysExt" %>

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
PortletPreferences prefs = renderRequest.getPreferences();

String portletResource = ParamUtil.getString(request, "portletResource");

if (Validator.isNotNull(portletResource)) {
        prefs = PortletPreferencesFactoryUtil.getPortletSetup(request, portletResource);
}

long groupId = GroupLocalServiceUtil.getCompanyGroup(PortalUtil.getDefaultCompanyId()).getGroupId();

// long groupId = ParamUtil.getLong(request, "groupId",0);
// if(groupId == 0){
// 	groupId = portletGroupId.longValue();
// }

String language = ParamUtil.getString(request, "language", "vi_VN");

DateFormat dateFormatDateTime = new SimpleDateFormat("dd/MM/yyyy");

Locale[] locales = LanguageUtil.getAvailableLocales();

// Layout

String portletSelectId = prefs.getValue("portletSelectId","");

String portletIds = prefs.getValue("portletIds","");

String selectPortletLayout = prefs.getValue("selectPortletLayout","");

String layoutPortletId = prefs.getValue("layoutPortletId","");

List selectLayouts = (List)request.getAttribute("SELECT_LAYOUTS");
	
long currentPlid = PortalUtilExt.getPlid(request);

boolean isMarquee = GetterUtil.getBoolean(prefs.getValue("isMarquee","false"), false);
int documentPerPortlet = GetterUtil.getInteger(prefs.getValue("documentPerPortlet", "5"));
int paddingLeft = GetterUtil.getInteger(prefs.getValue("paddingLeft",""),4);
int paddingRight = GetterUtil.getInteger(prefs.getValue("paddingRight",""),4);

String period = prefs.getValue("period","3");
String title = prefs.getValue("title","V&#259;n b&#7843;n m&#7899;i");

	
String styleBorder = prefs.getValue("styleBorder","");
String styleBullet = prefs.getValue("styleBullet","");
String styleTitle = prefs.getValue("styleTitle","");
String styleContent = prefs.getValue("styleContent","");

String themeType = prefs.getValue("themeType","1");
String themeSelected = prefs.getValue("themeSelected","");
boolean isBorder = GetterUtil.getBoolean(prefs.getValue("isBorder",""), false);
String bgcolor = prefs.getValue("bgcolor","#ffffff");

long plId = 0;

try{
	if(Validator.isNotNull(selectPortletLayout) && selectPortletLayout.equals("1")){
		//Automatically find layout & portlet id
		
		Layout firstLayout = (Layout)selectLayouts.get(0);
		long firstLayoutId = firstLayout.getPlid();
		
		String firstPortletId = LayoutPortletUtil.getPortletIdsByLayout(firstLayoutId).get(0).toString();
		
		plId = PortalUtilExt.getPlid(groupId, currentPlid, firstPortletId);
		
		portletSelectId = firstPortletId;
		
	}else{
		System.out.println("firstPortletId");
		plId = PortalUtilExt.getPlid(groupId, currentPlid, portletSelectId);
	}
}catch(Exception ex){
	System.out.println(ex.toString());
}

%>
<%!
	public static SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
	public static SimpleDateFormat yearFormat = new SimpleDateFormat("yyyy");
%>