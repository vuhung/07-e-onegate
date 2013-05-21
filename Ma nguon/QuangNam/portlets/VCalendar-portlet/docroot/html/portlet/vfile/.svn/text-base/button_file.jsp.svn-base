<%@ include file="/html/portlet/vfile/init.jsp"%>


<%
	ResultRow row = (ResultRow)request.getAttribute(WebKeys.SEARCH_CONTAINER_RESULT_ROW);
	String tabs1 = ParamUtil.getString(request, "tabs1");
	Object contentObj = row.getObject();
	String parameter = "fileId";
	long id=0;
	VFile content = (VFile)contentObj;
	id = content.getFileId();
	int status=ParamUtil.getInteger(request,"status",0);
    
%>
<liferay-ui:icon-menu>
<portlet:renderURL windowState="<%= WindowState.MAXIMIZED.toString() %>" var="editURL">
	<portlet:param name="jspPage" value="/html/portlet/vfile/update_file.jsp" />
	<portlet:param name="<%= Constants.CMD %>" value="<%= Constants.UPDATE %>" />
	<portlet:param name="<%=parameter %>" value="<%= Long.toString(id) %>" />
	<portlet:param name="status" value="<%=Integer.toString(status)%>" />
	<portlet:param name="tabs" value="<%=tabs%>" />
	<portlet:param name="redirect" value="<%= currentURL %>" />
</portlet:renderURL>
<liferay-ui:icon image="edit" url="<%= editURL %>" />
<portlet:actionURL windowState="<%= WindowState.MAXIMIZED.toString() %>" var="deleteURL" name="deleteVFile">
	<portlet:param name="jspPage" value="/vcalendar/file" />
	<portlet:param name="<%= Constants.CMD %>" value="<%= Constants.DELETE %>" />
	<portlet:param name="<%=parameter %>" value="<%= Long.toString(id) %>" />
	<portlet:param name="tabs" value="<%=tabs%>" />
	<portlet:param name="status" value="<%=Integer.toString(status)%>" />
	<portlet:param name="redirect" value="<%= currentURL %>" />
</portlet:actionURL>
<liferay-ui:icon-delete url="<%= deleteURL %>" />
</liferay-ui:icon-menu>