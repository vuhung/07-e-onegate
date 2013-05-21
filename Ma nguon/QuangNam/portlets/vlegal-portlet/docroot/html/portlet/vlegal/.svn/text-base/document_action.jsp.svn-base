<%@page import="com.liferay.portal.security.permission.ActionKeys"%>
<%@page import="com.liferay.portal.kernel.util.Constants"%>
<%@page import="com.vportal.portlet.vlegal.service.permission.VLegalDocumentPermission"%>
<%@page import="com.vportal.portlet.vlegal.service.impl.VLegalDocumentServiceImpl"%>
<%@page import="com.liferay.portal.kernel.dao.search.ResultRow"%>
<%
/**
 * Copyright (c) 2000-2008 VietSoftware, Inc. All rights reserved.
 *
 */
%>
<%@ include file="/html/portlet/vlegal/init.jsp" %>
<%
String redirect = currentURL;
ResultRow row = (ResultRow)request.getAttribute(WebKeys.SEARCH_CONTAINER_RESULT_ROW);
VLegalDocument document = (VLegalDocument)row.getObject();
%>

<liferay-ui:icon-menu>
<c:choose>
	<c:when test="<%= (document.getStatusDoc() == VLegalDocumentServiceImpl.APPROVAL_PENDING) %>">
		<c:if test="<%= VLegalDocumentPermission.contains(permissionChecker, document, ActionKeysExt.APPROVE_DOCUMENT) %>">
			<portlet:actionURL name="processDocument" var="approveURL">
				<portlet:param name="<%= Constants.CMD %>" value="approve" />
				<portlet:param name="redirect" value="<%= redirect %>" />
				<portlet:param name="docids" value="<%= document.getDocId() %>" />
			</portlet:actionURL>
			<liferay-ui:icon image="approve" url="<%= approveURL %>" />
		</c:if>	
		<c:if test="<%= VLegalDocumentPermission.contains(permissionChecker, document, ActionKeysExt.UPDATE) %>">
			<portlet:renderURL windowState="<%= WindowState.MAXIMIZED.toString() %>" var="editURL">
				<portlet:param name="jspPage" value="/html/portlet/vlegal/document_edit.jsp" />
				<portlet:param name="redirect" value="<%= redirect %>" />
				<portlet:param name="docid" value="<%= document.getDocId() %>" />
			</portlet:renderURL>
			<liferay-ui:icon image="edit" url="<%= editURL %>" />
		</c:if>	
	</c:when>
	
	<c:when test="<%= (document.getStatusDoc() == VLegalDocumentServiceImpl.PUBLISH_PENDING) %>">
		<c:if test="<%= VLegalDocumentPermission.contains(permissionChecker, document, ActionKeysExt.PUBLISH_DOCUMENT) %>">
			<portlet:actionURL name="processDocument" var="publishURL">
				<portlet:param name="<%= Constants.CMD %>" value="publish" />
				<portlet:param name="redirect" value="<%= redirect %>" />
				<portlet:param name="docids" value="<%= document.getDocId() %>" />
			</portlet:actionURL>			
			<liferay-ui:icon image="publish" url="<%= publishURL %>"/>
			
			<portlet:renderURL windowState="<%= WindowState.MAXIMIZED.toString() %>" var="cancelApproveURL">
				<portlet:param name="jspPage" value="/html/portlet/vlegal/cancel_ap_document.jsp" />
				<portlet:param name="<%= Constants.CMD %>" value="cancel_approve" />
				<portlet:param name="redirect" value="<%= redirect %>" />
				<portlet:param name="docids" value="<%= document.getDocId() %>" />
			</portlet:renderURL>
			<liferay-ui:icon image="cancel_approve" url="<%= cancelApproveURL %>"/>
			
		</c:if>
		<c:if test="<%= VLegalDocumentPermission.contains(permissionChecker, document, ActionKeysExt.UPDATE) %>">
			<portlet:renderURL windowState="<%= WindowState.MAXIMIZED.toString() %>" var="editURL">
				<portlet:param name="jspPage" value="/html/portlet/vlegal/document_edit.jsp" />
				<portlet:param name="redirect" value="<%= redirect %>" />
				<portlet:param name="docid" value="<%= document.getDocId() %>" />
			</portlet:renderURL>
			<liferay-ui:icon image="edit" url="<%= editURL %>" />
		</c:if>			
	</c:when>
				
	<c:otherwise>
		<c:if test="<%= VLegalDocumentPermission.contains(permissionChecker, document, ActionKeysExt.PUBLISH_DOCUMENT) %>">
			<portlet:renderURL windowState="<%= WindowState.MAXIMIZED.toString() %>" var="cancelPublishURL">
				<portlet:param name="jspPage" value="/html/portlet/vlegal/cancel_ap_document.jsp" />
				<portlet:param name="<%= Constants.CMD %>" value="cancel_publish" />
				<portlet:param name="redirect" value="<%= redirect %>" />
				<portlet:param name="docids" value="<%= document.getDocId() %>" />
			</portlet:renderURL>			
			<liferay-ui:icon image="cancel_publish" url="<%= cancelPublishURL %>"/>
		</c:if>
	</c:otherwise>
</c:choose>	

	<c:if test="<%= VLegalDocumentPermission.contains(permissionChecker, document, ActionKeys.PERMISSIONS) %>">
		<liferay-security:permissionsURL
			modelResource="<%= VLegalDocument.class.getName() %>"
			modelResourceDescription="<%= document.getSummary() %>"
			resourcePrimKey="<%= String.valueOf(document.getDocId()) %>"
			var="permissionsURL"
		/>
		<liferay-ui:icon image="permissions" url="<%= permissionsURL %>" />
	</c:if>
		
	<c:if test="<%= VLegalDocumentPermission.contains(permissionChecker, document, ActionKeysExt.DELETE) %>">
		<portlet:actionURL name="processDocument" var="deleteURL">
			<portlet:param name="<%= Constants.CMD %>" value="delete" />
			<portlet:param name="redirect" value="<%= redirect %>" />
			<portlet:param name="docids" value="<%= document.getDocId() %>" />
		</portlet:actionURL>
		<liferay-ui:icon-delete url="<%= deleteURL %>" />
	</c:if>
</liferay-ui:icon-menu>