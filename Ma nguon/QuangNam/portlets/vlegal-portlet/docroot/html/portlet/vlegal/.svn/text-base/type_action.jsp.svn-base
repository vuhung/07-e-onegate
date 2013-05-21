<%@page import="com.liferay.portal.kernel.util.Constants"%>
<%@page import="com.liferay.portal.kernel.dao.search.ResultRow"%>
<%@page import="com.vportal.portlet.vlegal.service.permission.VLegalTypePermission"%>
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

VLegalType type = (VLegalType)row.getObject();
%>

<liferay-ui:icon-menu>
	<c:if test="<%= VLegalTypePermission.contains(permissionChecker, type, ActionKeysExt.UPDATE) %>">
		<portlet:renderURL windowState="<%= WindowState.MAXIMIZED.toString() %>" var="editURL">
			<portlet:param name="jspPage" value="/html/portlet/vlegal/type_edit.jsp" />
			<portlet:param name="redirect" value="<%= redirect %>" />
			<portlet:param name="typeid" value="<%= type.getTypeId() %>" />
		</portlet:renderURL>
		<liferay-ui:icon image="edit" url="<%= editURL %>" />
	</c:if>
	<c:if test="<%= VLegalTypePermission.contains(permissionChecker, type, ActionKeysExt.PERMISSIONS) %>">
	<liferay-security:permissionsURL
		modelResource="<%= VLegalType.class.getName() %>"
		modelResourceDescription="<%= type.getName() %>"
		resourcePrimKey="<%= String.valueOf(type.getTypeId()) %>"
		var="permissionsURL"
	/>
	<liferay-ui:icon image="permissions" url="<%= permissionsURL %>" />
	</c:if>
	<c:if test="<%= VLegalTypePermission.contains(permissionChecker, type, ActionKeysExt.DELETE) %>">
		<portlet:actionURL name="deleteType" var="deleteUrl">
			<portlet:param name="<%= Constants.CMD %>" value="<%=Constants.DELETE%>" />
			<portlet:param name="redirect" value="<%= redirect %>" />
			<portlet:param name="typeids" value="<%= type.getTypeId() %>" />
		</portlet:actionURL>
		<liferay-ui:icon-delete url="<%= deleteUrl %>" />
	</c:if>

</liferay-ui:icon-menu>