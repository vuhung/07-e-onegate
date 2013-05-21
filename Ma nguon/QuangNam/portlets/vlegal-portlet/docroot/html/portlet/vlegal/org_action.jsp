<%@page import="com.liferay.portal.kernel.util.Constants"%>
<%@page import="com.vportal.portlet.vlegal.service.permission.VLegalOrgPermission"%>
<%@page import="com.liferay.portal.kernel.dao.search.ResultRow"%>
<%
/**
 * Copyright (c) 2008 Vietsoftware, Inc. All rights reserved.
 *
 */
%>

<%@ include file="/html/portlet/vlegal/init.jsp" %>

<%
String redirect = currentURL;

ResultRow row = (ResultRow)request.getAttribute(WebKeys.SEARCH_CONTAINER_RESULT_ROW);

VLegalOrg org = (VLegalOrg)row.getObject();
%>

<liferay-ui:icon-menu>
	<c:if test="<%= VLegalOrgPermission.contains(permissionChecker, org, ActionKeysExt.UPDATE) %>">
		<portlet:renderURL windowState="<%= WindowState.MAXIMIZED.toString() %>" var="editURL">
			<portlet:param name="jspPage" value="/html/portlet/vlegal/org_edit.jsp" />
			<portlet:param name="redirect" value="<%= redirect %>" />
			<portlet:param name="orgid" value="<%= org.getOrgId() %>" />
		</portlet:renderURL>
		<liferay-ui:icon image="edit" url="<%= editURL %>" />
	</c:if>
	<c:if test="<%= VLegalOrgPermission.contains(permissionChecker, org, ActionKeysExt.PERMISSIONS) %>">
		<liferay-security:permissionsURL
			modelResource="<%= VLegalOrg.class.getName() %>"
			modelResourceDescription="<%= org.getName() %>"
			resourcePrimKey="<%= String.valueOf(org.getOrgId()) %>"
			var="permissionsURL"
		/>
		<liferay-ui:icon image="permissions" url="<%= permissionsURL %>" />
	</c:if>
	<c:if test="<%= VLegalOrgPermission.contains(permissionChecker, org, ActionKeysExt.DELETE) %>">
		<portlet:actionURL name="deleteOrg" var="deleteURL">
			<portlet:param name="<%= Constants.CMD %>" value="<%=Constants.DELETE%>" />
			<portlet:param name="redirect" value="<%= redirect %>" />
			<portlet:param name="orgids" value="<%= org.getOrgId() %>" />
		</portlet:actionURL>
		<liferay-ui:icon-delete url="<%= deleteURL %>" />
	</c:if>

</liferay-ui:icon-menu>