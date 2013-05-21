
<%@page import="com.liferay.portal.kernel.util.Constants"%>
<%@page import="com.vportal.portlet.vlegal.model.VLegalLogger"%>
<%@page import="com.liferay.portal.kernel.dao.search.ResultRow"%>
<%@ include file="/html/portlet/vlegal/init.jsp" %>

<%
String redirect = currentURL;

ResultRow row = (ResultRow)request.getAttribute(WebKeys.SEARCH_CONTAINER_RESULT_ROW);

VLegalLogger logger = (VLegalLogger)row.getObject();
%>

<portlet:actionURL windowState="<%= WindowState.MAXIMIZED.toString() %>" name="deleteLog" var="deleteURL">
	<portlet:param name="<%= Constants.CMD %>" value="<%= Constants.DELETE %>" />
	<portlet:param name="redirect" value="<%= redirect %>" />
	<portlet:param name="tabs1" value="<%= tabs1 %>" />
	<portlet:param name="tabs2" value="<%= tabs2 %>" />
	<portlet:param name="loggerIds" value="<%= logger.getLoggerId() %>" />
</portlet:actionURL>

<liferay-ui:icon-delete url="<%= deleteURL %>" />&nbsp;&nbsp;