<%@page import="com.liferay.portal.kernel.language.LanguageUtil"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<%@ include file="/html/vdoc_manage/init.jsp" %>

<%
	
	ResultRow row = (ResultRow)request.getAttribute(WebKeys.SEARCH_CONTAINER_RESULT_ROW);

	vdocDocument doc = (vdocDocument)row.getObject();
	
	String name = vdocDocument.class.getName();
	String primKey = String.valueOf(doc.getPrimaryKey());
	
%>

<liferay-ui:icon-menu message='<%= LanguageUtil.get(pageContext, "portlet.vdoc.document.actions") %>'>
<c:choose>
	<c:when test="<%= (doc.getStatusDoc() == vdocDocumentLocalServiceImpl.APPROVAL_PENDING)%>">		
		<portlet:actionURL windowState="<%= WindowState.MAXIMIZED.toString() %>" name="approveDocument" var="approveDocumentURL">
			<portlet:param name="docId" value="<%= doc.getDocId() %>" />
		</portlet:actionURL>
		<liferay-ui:icon image="approve" url="<%= approveDocumentURL %>" message='<%= LanguageUtil.get(pageContext, "portlet.vdoc.document.approve") %>' />

		<portlet:renderURL windowState="<%= WindowState.MAXIMIZED.toString() %>" var="editURL">
			<portlet:param name="jspPage" value="/html/vdoc_manage/document/edit_document.jsp"></portlet:param>
			<portlet:param name="docId" value="<%= doc.getDocId() %>" />
		</portlet:renderURL>
		<liferay-ui:icon image="edit" message='<%= LanguageUtil.get(pageContext, "portlet.vdoc.document.edit") %>' url="<%= editURL %>" />	
	
	</c:when>

	<c:when test="<%= (doc.getStatusDoc() == vdocDocumentLocalServiceImpl.PUBLISH_PENDING) %>">	
		<portlet:actionURL windowState="<%= WindowState.MAXIMIZED.toString() %>" name="publishDocument" var="publishDocumentURL">
			<portlet:param name="docId" value="<%= doc.getDocId() %>" />
		</portlet:actionURL>			
		<liferay-ui:icon image="publish" url="<%= publishDocumentURL %>"  message='<%= LanguageUtil.get(pageContext, "portlet.vdoc.document.publish") %>'/>

		<portlet:renderURL windowState="<%= WindowState.MAXIMIZED.toString() %>" var="cancelApproveURL">
			<portlet:param name="docId" value="<%= doc.getDocId()%>" />
			<portlet:param name="jspPage" value="/html/vdoc_manage/document/cancel_approve_publish.jsp"/>
		</portlet:renderURL>
		<liferay-ui:icon image="cancel_approve" url="<%= cancelApproveURL %>" message='<%= LanguageUtil.get(pageContext, "portlet.vdoc.document.cancel-approve") %>' />
		
		<portlet:renderURL windowState="<%= WindowState.MAXIMIZED.toString() %>" var="editDocumentURL">
			<portlet:param name="jspPage" value="/html/vdoc_manage/document/edit_document.jsp"></portlet:param>
			<portlet:param name="docId" value="<%= doc.getDocId() %>" />
		</portlet:renderURL>
		<liferay-ui:icon image="edit" message='<%= LanguageUtil.get(pageContext, "portlet.vdoc.document.edit") %>' url="<%= editDocumentURL %>" />	
	</c:when>
	
	<c:otherwise>
		<portlet:renderURL windowState="<%= WindowState.MAXIMIZED.toString() %>" var="cancelPublishURL">
			<portlet:param name="docId" value="<%= doc.getDocId()%>" />
			<portlet:param name="jspPage" value="/html/vdoc_manage/document/cancel_approve_publish.jsp"/>
		</portlet:renderURL>			
		<liferay-ui:icon image="cancel_publish" url="<%= cancelPublishURL %>" message='<%= LanguageUtil.get(pageContext, "portlet.vdoc.document.cancel-publish") %>' />
	</c:otherwise>
</c:choose>	
	
	<portlet:actionURL windowState="<%= WindowState.MAXIMIZED.toString() %>" name="deleteDocument" var="deleteDocumentURL">
		<portlet:param name="docId" value="<%= doc.getDocId() %>" />
	</portlet:actionURL>
	<liferay-ui:icon image="delete" message='<%= LanguageUtil.get(pageContext, "portlet.vdoc.document.delete") %>' url="<%= deleteDocumentURL %>" />

	<liferay-security:permissionsURL
		modelResource="<%= vdocDocument.class.getName() %>"
		modelResourceDescription="<%= doc.getTitle() %>"
		resourcePrimKey="<%= String.valueOf(doc.getDocId()) %>"
		var="permissionsURL"
	/>
	<liferay-ui:icon image="permissions" message='<%= LanguageUtil.get(pageContext, "portlet.vdoc.document.permissions") %>' url="<%= permissionsURL %>" />
	
</liferay-ui:icon-menu>