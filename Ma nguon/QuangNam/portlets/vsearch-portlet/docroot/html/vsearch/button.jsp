<%@page import="com.liferay.portlet.PortletURLUtil"%>
<%@page import="javax.portlet.WindowState"%>
<%@ include file="/init.jsp" %>
<%@ page import="com.vportal.portlet.vsearch.service.VConfigSearchServiceUtil" %>
<%@ page import="com.vportal.portlet.vsearch.model.VConfigSearch" %>
<%
String currentURL = PortletURLUtil.getCurrent(renderRequest, renderResponse).toString();
%>

<%
	
	ResultRow row = (ResultRow)request.getAttribute(WebKeys.SEARCH_CONTAINER_RESULT_ROW);
	String tabs1 = ParamUtil.getString(request, "tabs1");
	Object contentObj = row.getObject();
	String parameter = "confisearchId";
	long id=0;
	VConfigSearch content = (VConfigSearch)contentObj;
	id = content.getConfisearchId();
	String tabs = ParamUtil.getString(request, "tabs", "vcms");
%>
<liferay-ui:icon-menu>
<portlet:actionURL windowState="<%= WindowState.MAXIMIZED.toString() %>" var="deleteURL">
	<portlet:param name="struts_action" value="/vsearch/configsearch" />
	<portlet:param name="tabs" value="<%=tabs %>" />
	<portlet:param name="<%= Constants.CMD %>" value="<%= Constants.DELETE %>" />
	<portlet:param name="<%=parameter %>" value="<%= Long.toString(id) %>" />
	<portlet:param name="redirect" value="<%= currentURL %>" />
</portlet:actionURL>
<liferay-ui:icon-delete url="<%= deleteURL %>" />
</liferay-ui:icon-menu>