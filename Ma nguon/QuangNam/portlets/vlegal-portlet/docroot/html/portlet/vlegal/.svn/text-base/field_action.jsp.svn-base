<%@page import="com.liferay.portal.kernel.util.Constants"%>
<%@page import="com.vportal.portlet.vlegal.service.permission.VLegalFieldPermission"%>
<%@page import="com.liferay.portal.kernel.dao.search.ResultRow"%>
<%
/**
 * Copyright (c) 2008 VietSoftware, Inc. All rights reserved.
 *
 */
%>

<%@ include file="/html/portlet/vlegal/init.jsp" %>

<%
String redirect = currentURL;

ResultRow row = (ResultRow)request.getAttribute(WebKeys.SEARCH_CONTAINER_RESULT_ROW);

VLegalField field = (VLegalField)row.getObject();
%>

<liferay-ui:icon-menu>
	
	<c:if test="<%= VLegalFieldPermission.contains(permissionChecker, field, ActionKeysExt.UPDATE) %>">
		<portlet:renderURL windowState="<%= WindowState.MAXIMIZED.toString() %>" var="editURL">
			<portlet:param name="jspPage" value="/html/portlet/vlegal/field_edit.jsp" />
			<portlet:param name="redirect" value="<%= redirect %>" />
			<portlet:param name="fieldid" value="<%= field.getFieldId() %>" />
		</portlet:renderURL>
		<liferay-ui:icon image="edit" url="<%= editURL %>" />
	</c:if>
	<c:if test="<%= VLegalFieldPermission.contains(permissionChecker, field, ActionKeysExt.PERMISSIONS) %>">
		<liferay-security:permissionsURL
			modelResource="<%= VLegalField.class.getName() %>"
			modelResourceDescription="<%= field.getName() %>"
			resourcePrimKey="<%= String.valueOf(field.getFieldId()) %>"
			var="permissionsURL"
		/>
		<liferay-ui:icon image="permissions" url="<%= permissionsURL %>" />
	</c:if>	
	<c:if test="<%= VLegalFieldPermission.contains(permissionChecker, field, ActionKeysExt.DELETE) %>">
		<portlet:actionURL name="deleteField" var="deleteUrl">
			<portlet:param name="<%= Constants.CMD %>" value="<%=Constants.DELETE%>" />
			<portlet:param name="redirect" value="<%= redirect %>" />
			<portlet:param name="fieldids" value="<%= field.getFieldId() %>" />
		</portlet:actionURL>
		<liferay-ui:icon-delete url="<%= deleteUrl %>" />
	</c:if>
	

</liferay-ui:icon-menu>