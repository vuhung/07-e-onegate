<%@page import="com.liferay.portal.kernel.util.DateFormats"%>
<%@page import="com.liferay.portal.kernel.util.DateUtil"%>
<%@page import="java.text.DateFormat"%>

<%@page import="com.liferay.portal.kernel.util.CalendarUtil"%>
<%@page import="com.liferay.portal.kernel.util.CalendarFactoryUtil"%>
<%@page import="java.util.Calendar"%>
<%@page import="com.liferay.portlet.PortletPreferencesFactoryUtil"%>
<%@page import="com.liferay.portal.kernel.util.Validator"%>
<%@page import="javax.portlet.PortletPreferences"%>
<%@page import="com.liferay.portal.kernel.util.ParamUtil"%>
<%@ include file="/html/portlet/init.jsp" %>
<%@ page import="com.liferay.portal.kernel.cal.DayAndPosition" %>
<%@ page import="com.liferay.portlet.calendar.model.CalEvent" %>

<%@ page import="com.liferay.portlet.calendar.service.CalEventLocalServiceUtil" %>

<%@ page import="com.vportal.portlet.vcalendar.service.VCalServiceUtil" %>
<%@ page import="com.vportal.portlet.vcalendar.model.VCal" %>
<%@ page import="com.vportal.portal.util.PortalUtilExt" %>
<%@ page import="java.util.GregorianCalendar" %>

<%@ page import="java.util.Locale" %>
<%@ page import="java.util.TimeZone" %>
<%@ page import="com.vportal.portlet.vcalendar.util.*" %>
<%@ page import="com.vportal.portlet.vcalendar.service.VFileServiceUtil" %>
<%@ page import="com.vportal.portlet.vcalendar.model.VFile" %>
<%@ page import="com.liferay.portal.model.Organization" %>
<%@ page import="com.liferay.portal.service.OrganizationServiceUtil" %>
<%@ page import="javax.portlet.PortletURL"%>
<%@ page import="com.vportal.portal.kernel.security.permission.ActionKeysExt"%>

<%@page import="java.util.HashSet"%>
<%@page import="java.util.Set"%>
<%@page import="java.util.List"%>
<%@page import="com.vportal.portlet.vcalendar.model.VCal"%>
<%@page import="com.vportal.portlet.vcalendar.service.VCalServiceUtil"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.text.DateFormat"%>
<%@page import="java.util.Calendar"%>
<%@page import="com.liferay.portal.kernel.util.CalendarUtil"%>
<%@page import="com.liferay.portal.kernel.language.LanguageUtil"%>
<%@page import="com.liferay.portal.kernel.dao.search.SearchEntry"%>
<%@page import="com.liferay.portal.kernel.dao.search.SearchContainer"%>
<%@taglib prefix="vportal" uri="http://www.vietsoftware.com/tld" %>



<%
Long groupId = Long.valueOf(ParamUtil.getLong(request, "groupId",0));
if(groupId == 0){
	groupId = Long.valueOf(portletGroupId.longValue());
}
PortletPreferences prefs = renderRequest.getPreferences();

String portletResource = ParamUtil.getString(request, "portletResource");

if (Validator.isNotNull(portletResource)) {
	prefs = PortletPreferencesFactoryUtil.getPortletSetup(request, portletResource);
}
String defaultGroupId = prefs.getValue("groupId","0");
PortletURL personelURL = renderResponse.createRenderURL();
personelURL.setWindowState(WindowState.MAXIMIZED);
personelURL.setParameter("struts_action","/vcalendar/view");
personelURL.setParameter("tabs","vcalendar.tab.personel");
PortletURL leaderURL = renderResponse.createRenderURL();
leaderURL.setWindowState(WindowState.MAXIMIZED);
leaderURL.setParameter("struts_action","/vcalendar/leader");
leaderURL.setParameter("tabs","vcalendar.tab.leader");
PortletURL fileURL = renderResponse.createRenderURL();
fileURL.setWindowState(WindowState.MAXIMIZED);
fileURL.setParameter("struts_action","/vcalendar/file");
fileURL.setParameter("tabs","vcalendar.tab.file");
String tabs = ParamUtil.getString(request, "tabs", "vcalendar.tab.personel");
long userId = PortalUtilExt.getUserId(request);
String monthParam = request.getParameter("month");
String dayParam = request.getParameter("day");
String yearParam = request.getParameter("year");

Calendar selCal = CalendarFactoryUtil.getCalendar(timeZone, locale);

try {
	selCal.set(Calendar.YEAR, Integer.parseInt(yearParam));
}
catch (NumberFormatException nfe) {
}

try {
	if (dayParam != null) {
		selCal.set(Calendar.DATE, 1);
	}

	selCal.set(Calendar.MONTH, Integer.parseInt(monthParam));
}
catch (NumberFormatException nfe) {
}

try {
	int maxDayOfMonth = selCal.getActualMaximum(Calendar.DATE);

	int dayParamInt = Integer.parseInt(dayParam);

	if (dayParamInt > maxDayOfMonth) {
		dayParamInt = maxDayOfMonth;
	}

	selCal.set(Calendar.DATE, dayParamInt);
}
catch (NumberFormatException nfe) {
}

int selMonth = selCal.get(Calendar.MONTH);
int selDay = selCal.get(Calendar.DATE);
int selYear = selCal.get(Calendar.YEAR);
Calendar curCal = CalendarFactoryUtil.getCalendar(timeZone, locale);

int curMonth = curCal.get(Calendar.MONTH);
int curDay = curCal.get(Calendar.DATE);
int curYear = curCal.get(Calendar.YEAR);

int[] monthIds = CalendarUtil.getMonthIds();
String[] months = CalendarUtil.getMonths(locale);

String[] days = CalendarUtil.getDays(locale);

DateFormat dateFormatDate = DateFormats.getDate(locale);
DateFormat dateFormatDateTime = DateFormats.getDateTime(locale);
DateFormat dateFormatTime = DateFormats.getTime(locale);
DateFormat dateFormatISO8601 = DateUtil.getISO8601Format();

%>