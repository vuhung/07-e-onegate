<%@include file="/html/portlet/vlinksman/init.jsp"%>
<%
	ResultRow row = (ResultRow) request.getAttribute(WebKeys.SEARCH_CONTAINER_RESULT_ROW);	
	LinkGroup linkGroup = (LinkGroup) row.getObject();
%>
<liferay-ui:icon-menu>
	<!-- Edit category -->
	<c:if test="<%= LinkGroupPermission.contains(permissionChecker, linkGroup, ActionKeysExt.UPDATE) %>">
		<portlet:renderURL windowState="<%= WindowState.MAXIMIZED.toString() %>" var="editURL">
			<portlet:param name="jspPage" value="/html/portlet/vlinksman/linkgroup/edit_linkgroup.jsp" />
			<portlet:param name="cmd" value="doupdate" />				
			<portlet:param name="redirect" value="<%= currentURL %>" />
			<portlet:param name="Id" value="<%= String.valueOf(linkGroup.getLinkgroupId()) %>" />
		</portlet:renderURL>
		<liferay-ui:icon image="edit" url="<%= editURL %>" />		
	</c:if>
	
	<!-- Permissions -->
	<c:if test="<%= LinkGroupPermission.contains(permissionChecker, linkGroup, ActionKeysExt.PERMISSIONS) %>">	
		<liferay-security:permissionsURL
			modelResource="<%= LinkGroup.class.getName() %>"
			modelResourceDescription="<%= linkGroup.getName() %>"
			resourcePrimKey="<%= String.valueOf(linkGroup.getLinkgroupId()) %>"
			var="permissionsURL" />
		<liferay-ui:icon image="permissions" url="<%= permissionsURL %>" />
	</c:if>
		
	<!-- Delete category -->
	<c:if test="<%= LinkGroupPermission.contains(permissionChecker, linkGroup, ActionKeysExt.DELETE) %>">
		<portlet:actionURL windowState="<%= WindowState.MAXIMIZED.toString() %>" var="deleteURL" name="_deleteLinkGroup">			
			<portlet:param name="cmd" value="dodelete" />
			<portlet:param name="redirect" value="<%= currentURL %>" />
			<portlet:param name="Id" value="<%= String.valueOf(linkGroup.getLinkgroupId()) %>" />
		</portlet:actionURL>
		<liferay-ui:icon-delete url="<%= deleteURL %>" />
	</c:if>	
</liferay-ui:icon-menu>