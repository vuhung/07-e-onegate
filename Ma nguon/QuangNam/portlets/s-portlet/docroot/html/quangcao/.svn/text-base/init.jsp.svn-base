<%@page import="com.liferay.portal.kernel.util.StringPool"%>
<%@page import="com.liferay.portal.kernel.util.Validator"%>
<%@page import="com.test.model.AdvItem"%>
<%@page import="com.liferay.portal.kernel.util.ParamUtil"%>
<%@page import="java.util.List"%>
<%@page import="com.test.service.AdvItemServiceUtil"%>
<%@page import="com.liferay.portal.util.PortalUtil"%>
<%@page import="com.liferay.portal.kernel.util.WebKeys"%>
<%@page import="com.liferay.portal.theme.ThemeDisplay"%>
<%@page import="java.util.GregorianCalendar"%>
<%@page import="java.util.Calendar"%>
<%@taglib prefix="liferay-ui" uri="http://liferay.com/tld/ui"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%
boolean showTabQuangcaoCategory = true;
boolean showTabQuangcaoUser = true;
Calendar currentDate = new GregorianCalendar();
int curYear = currentDate.get(Calendar.YEAR);
int curMonth = currentDate.get(Calendar.MONTH);
int curDay = currentDate.get(Calendar.DATE);

ThemeDisplay themeDisplay1= (ThemeDisplay) request.getAttribute(WebKeys.THEME_DISPLAY);
long groupId1= themeDisplay1.getPortletGroupId();
long companyId= PortalUtil.getCompanyId(request);
// int totalStatus = VcmsStatusServiceUtil.countByGroupId(groupId1);
// List statusResults = VcmsStatusServiceUtil.getByGroupId(groupId1,0, totalStatus);
// String tabs1 = ParamUtil.getString(request, "tabs");
// String tabs_qly = ParamUtil.getString(request, "tabs_ql");
// String tabs3=ParamUtil.getString(request, "tabs3");
int totalItem=AdvItemServiceUtil.countItemByG(groupId1);

String tabs1=ParamUtil.getString(request,"tabs","advquangcao.quangcao.tabs.item");
List Items=AdvItemServiceUtil.getItemByG(groupId1, 0, totalItem);


%>