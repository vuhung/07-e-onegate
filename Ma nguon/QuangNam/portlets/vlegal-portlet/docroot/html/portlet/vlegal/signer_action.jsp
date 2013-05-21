<%@page import="com.liferay.portal.kernel.util.Constants"%>
<%@page import="com.vportal.portlet.vlegal.service.permission.VLegalSignerPermission"%>
<%@page import="com.liferay.portal.kernel.dao.search.ResultRow"%>
<%
/**
 * Copyright (c) 2000-2006 Liferay, Inc. All rights reserved.
 *
 */
%>

<%@ include file="/html/portlet/vlegal/init.jsp" %>

<%
String redirect = currentURL;

ResultRow row = (ResultRow)request.getAttribute(WebKeys.SEARCH_CONTAINER_RESULT_ROW);

VLegalSigner signer = (VLegalSigner)row.getObject();
%>

<liferay-ui:icon-menu>
	<c:if test="<%= VLegalSignerPermission.contains(permissionChecker, signer, ActionKeysExt.UPDATE) %>">
		<portlet:renderURL windowState="<%= WindowState.MAXIMIZED.toString() %>" var="editURL">
			<portlet:param name="jspPage" value="/html/portlet/vlegal/signer_edit.jsp" />
			<portlet:param name="redirect" value="<%= redirect %>" />
			<portlet:param name="sigid" value="<%= signer.getSigId() %>" />
		</portlet:renderURL>
		<liferay-ui:icon image="edit" url="<%= editURL %>" />
	</c:if>
	<c:if test="<%= VLegalSignerPermission.contains(permissionChecker, signer, ActionKeysExt.PERMISSIONS) %>">
		<liferay-security:permissionsURL
			modelResource="<%= VLegalSigner.class.getName() %>"
			modelResourceDescription='<%= signer.getFirstName() + " " + signer.getLastName() %>'
			resourcePrimKey="<%= String.valueOf(signer.getSigId()) %>"
			var="permissionsURL"
		/>
		<liferay-ui:icon image="permissions" url="<%= permissionsURL %>" />
	</c:if>	
	<c:if test="<%= VLegalSignerPermission.contains(permissionChecker, signer, ActionKeysExt.DELETE) %>">
		<portlet:actionURL name="deleteSigner" var="deleteSignerUrl">
			<portlet:param name="<%= Constants.CMD %>" value="<%= Constants.DELETE %>" />
			<portlet:param name="redirect" value="<%= redirect %>" />
			<portlet:param name="sigids" value="<%= signer.getSigId() %>" />
		</portlet:actionURL>
		<liferay-ui:icon-delete url="<%= deleteSignerUrl %>" />
	</c:if>

</liferay-ui:icon-menu>