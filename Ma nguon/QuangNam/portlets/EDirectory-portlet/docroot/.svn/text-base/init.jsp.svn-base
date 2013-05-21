<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>
<%@ taglib uri="http://liferay.com/tld/aui" prefix="aui" %>
<%@ taglib uri="http://liferay.com/tld/portlet" prefix="liferay-portlet" %>
<%@ taglib uri="http://liferay.com/tld/security" prefix="liferay-security" %>
<%@ taglib uri="http://liferay.com/tld/theme" prefix="liferay-theme" %>
<%@ taglib uri="http://liferay.com/tld/ui" prefix="liferay-ui" %>
<%@ taglib uri="http://liferay.com/tld/util" prefix="liferay-util" %>
<%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c" %>
<%@ taglib uri="http://www.vietsoftware.com/tld" prefix="vportal" %>

<%@ page import="javax.portlet.WindowState"%>
<%@ page import="javax.portlet.PortletURL"%>
<%@ page import="java.lang.Integer" %>
<%@ page import="java.lang.Long" %>
<%@ page import="java.util.List" %>
<%@ page import="java.util.Calendar" %>
<%@ page import="java.util.Collections" %>
<%@ page import="com.liferay.portal.kernel.util.HtmlUtil" %>
<%@ page import="com.liferay.portal.kernel.util.ParamUtil" %>
<%@ page import="com.liferay.portal.kernel.util.ListUtil" %>
<%@ page import="com.liferay.portal.kernel.util.StringPool" %>
<%@ page import="com.liferay.portal.kernel.util.Validator" %>
<%@ page import="com.liferay.portal.kernel.util.CalendarFactoryUtil" %>
<%@ page import="com.liferay.portal.kernel.dao.search.ResultRow" %>
<%@ page import="com.liferay.portal.kernel.dao.search.SearchEntry" %>
<%@ page import="com.liferay.portal.kernel.exception.SystemException" %>
<%@ page import="com.liferay.portal.kernel.util.WebKeys" %>
<%@ page import="com.liferay.portal.kernel.util.GetterUtil  " %>
<%@ page import="com.liferay.portal.kernel.util.ListUtil" %>

<%@ page import="com.liferay.portal.theme.ThemeDisplay"%>
<%@ page import="com.liferay.portal.security.permission.ActionKeys" %>
<%@ page import="com.liferay.portal.service.permission.PortalPermissionUtil" %>
<%@ page import="com.liferay.portal.service.permission.PortletPermissionUtil" %>
<%@ page import="javax.portlet.PortletPreferences " %>

<%@ page import="com.vsi.edirectory.portlet.ActionUtil" %>
<%@ page import="com.vsi.edirectory.portlet.model.EDEmployee" %>
<%@ page import="com.vsi.edirectory.portlet.model.EDDepartment" %>
<%@ page import="com.vsi.edirectory.portlet.model.EDFunction" %>
<%@ page import="com.vsi.edirectory.portlet.service.EDEmployeeLocalServiceUtil" %>
<%@ page import="com.vsi.edirectory.portlet.service.EDDepartmentLocalServiceUtil" %>
<%@ page import="com.vsi.edirectory.portlet.service.EDFunctionLocalServiceUtil" %>


<portlet:defineObjects />
<liferay-theme:defineObjects />

<%
	String tab1 = ParamUtil.getString(request, "tab1");
	String tab2 = ParamUtil.getString(request, "tab2");
	String tab3 = ParamUtil.getString(request, "tab3");
%>