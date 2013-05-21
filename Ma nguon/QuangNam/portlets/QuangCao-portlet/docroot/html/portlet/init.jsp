<%@page import="javax.portlet.PortletMode"%>
<%@page import="com.liferay.portlet.PortletURLUtil"%>
<%@page import="com.liferay.portal.util.PortalUtil"%>
<%@page import="com.vportal.portlet.vadvman.util.PortletKeysExt"%>
<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>
<%@ page import="com.liferay.portal.kernel.util.DateFormats"%>
<%@ page import="java.util.TimeZone" %>
<%@ taglib uri="http://liferay.com/tld/theme" prefix="liferay-theme" %>
<%@ taglib uri="http://liferay.com/tld/ui" prefix="liferay-ui" %>
<%@ taglib uri="http://liferay.com/tld/util" prefix="liferay-util" %>
<%@ page import="com.liferay.portal.kernel.util.ParamUtil" %>
<%@ page import="com.liferay.portal.kernel.util.CalendarFactoryUtil" %>
<%@ page import="java.util.Calendar" %>
<%@ page import="java.text.DateFormat" %>
<%@page import="javax.portlet.PortletURL"%>
<%@page import="javax.portlet.WindowState"%>
<%@page import="com.liferay.portal.service.permission.PortletPermissionUtil"%>
<%@page import="com.liferay.portal.kernel.dao.search.SearchContainer"%>
<%@page import="java.util.List"%>
<%@page import="java.util.ArrayList"%>
<%@page import="com.liferay.portal.kernel.dao.search.ResultRow"%>
<%@page import="com.liferay.portal.kernel.util.Constants"%>
<%@page import="com.liferay.portal.kernel.dao.search.TextSearchEntry"%>
<%@page import="com.liferay.portal.kernel.dao.search.SearchEntry"%>
<%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c" %>
<%@page import="com.liferay.portal.kernel.util.WebKeys"%>
<%@ taglib uri="http://liferay.com/tld/security" prefix="liferay-security" %>
<%@page import="com.liferay.portal.kernel.util.StringPool"%>
<%@page import="com.liferay.portal.kernel.util.Validator"%>
<%@page import="com.liferay.portal.kernel.portlet.LiferayWindowState"%>
<%@page import="com.liferay.portal.kernel.language.LanguageUtil"%>
<%@page import="com.liferay.portal.kernel.language.UnicodeLanguageUtil"%>
<%@page import="com.liferay.portlet.documentlibrary.model.DLFileEntry"%>
<%@page import="com.liferay.portal.kernel.util.GetterUtil"%>
<%@page import="java.util.GregorianCalendar"%>
<portlet:defineObjects />
<liferay-theme:defineObjects />
<%
	DateFormat dateFormatDateTime = DateFormats.getDateTime(locale, timeZone);
	
	long groupId = ParamUtil.getLong(request, "groupId",0);	
	if(groupId == 0){
		groupId = portletGroupId.longValue();
	}
	boolean showButtons = false;
	boolean showTabs = false;
	if (portletConfig.getPortletName().equals(PortletKeysExt.VADVMAN_NAME)) {
		showButtons = true;	
		showTabs = true;
	}	
	
	Calendar curCal = CalendarFactoryUtil.getCalendar(timeZone, locale);

	int curMonth = curCal.get(Calendar.MONTH);
	int curDay = curCal.get(Calendar.DATE);
	int curYear = curCal.get(Calendar.YEAR);
	String currentURL = PortalUtil.getCurrentURL(request);
	
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

%>