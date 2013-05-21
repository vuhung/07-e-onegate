<%@include file="init.jsp" %>

<%
	ResultRow row = (ResultRow)request.getAttribute(WebKeys.SEARCH_CONTAINER_RESULT_ROW);
	String tabs1 = ParamUtil.getString(request, "tabs1");
	Object contentObj = row.getObject();
	int status=ParamUtil.getInteger(request,"status",0);
	String parameter = "calId";
	long id=0;
	VCal content = (VCal)contentObj;
	id = content.getCalId();
%>
<liferay-ui:icon-menu>
<portlet:renderURL windowState="<%= WindowState.MAXIMIZED.toString() %>" var="editURL">
	<portlet:param name="struts_action" value="/vcalendar/edit_event" />
	<portlet:param name="<%= Constants.CMD %>" value="<%= Constants.UPDATE %>" />
	<portlet:param name="<%=parameter %>" value="<%= Long.toString(id) %>" />
	<portlet:param name="status" value="<%=Integer.toString(status)%>" />
	<portlet:param name="redirect" value="<%= currentURL %>" />
</portlet:renderURL>
<liferay-ui:icon image="edit" url="<%= editURL %>" />
<portlet:actionURL windowState="<%= WindowState.MAXIMIZED.toString() %>" var="deleteURL">
	<portlet:param name="struts_action" value="/vcalendar/leader" />
	<portlet:param name="<%= Constants.CMD %>" value="<%= Constants.DELETE %>" />
	<portlet:param name="<%=parameter %>" value="<%= Long.toString(id) %>" />
	<portlet:param name="tabs" value="<%=tabs%>" />
	<portlet:param name="tabs1" value="day" />
	<portlet:param name="status" value="<%=Integer.toString(status)%>" />
	<portlet:param name="redirect" value="<%= currentURL %>" />
</portlet:actionURL>
<liferay-ui:icon-delete url="<%= deleteURL %>" />
</liferay-ui:icon-menu>