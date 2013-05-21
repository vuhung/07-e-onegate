

<%@include file="/html/portlet/vadvman/init.jsp"%>
<%
	ResultRow row = (ResultRow) request.getAttribute(WebKeys.SEARCH_CONTAINER_RESULT_ROW);	
	AdvType type = (AdvType) row.getObject();
%>
<liferay-ui:icon-menu>
	<!-- Edit category -->
	<c:if test="<%= AdvTypePermission.contains(permissionChecker, type, ActionKeysExt.UPDATE) %>">
		<portlet:renderURL windowState="<%= WindowState.MAXIMIZED.toString() %>" var="editURL">
			<portlet:param name="jspPage" value="/html/portlet/vadvman/vadvtype/edit_type.jsp" />
			<portlet:param name="cmd" value="showupdate" />
			<portlet:param name="redirect" value="<%= currentURL %>" />
			<portlet:param name="typeId" value="<%= Long.toString(type.getTypeId()) %>" />
		</portlet:renderURL>
		<liferay-ui:icon image="edit" url="<%= editURL %>" />		
	</c:if>
	
	<!-- Permissions -->
	<c:if test="<%= AdvTypePermission.contains(permissionChecker, type, ActionKeysExt.PERMISSIONS) %>">	
		<liferay-security:permissionsURL
			modelResource="<%= AdvType.class.getName() %>"
			modelResourceDescription="<%= type.getName() %>"
			resourcePrimKey="<%= String.valueOf(type.getTypeId()) %>"
			var="permissionsURL" />
		<liferay-ui:icon image="permissions" url="<%= permissionsURL %>" />
	</c:if>
		
	<!-- Delete -->
	<c:if test="<%= AdvTypePermission.contains(permissionChecker, type, ActionKeysExt.DELETE) %>">
		<portlet:actionURL windowState="<%= WindowState.MAXIMIZED.toString() %>"  name="_deleteType" var="deleteURL">
			<portlet:param name="cmd" value="dodelete" />
			<portlet:param name="redirect" value="<%= currentURL %>" />
			<portlet:param name="ids" value="<%= Long.toString(type.getTypeId()) %>" />
		</portlet:actionURL>
		<liferay-ui:icon-delete url="<%= deleteURL %>" />
	</c:if>
</liferay-ui:icon-menu>