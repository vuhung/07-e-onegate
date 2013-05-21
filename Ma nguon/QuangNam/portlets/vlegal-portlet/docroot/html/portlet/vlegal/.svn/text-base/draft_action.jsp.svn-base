<%@page import="com.liferay.portal.kernel.util.Constants"%>
<%@page import="com.liferay.portal.security.permission.ActionKeys"%>
<%@page import="com.vportal.portlet.vlegal.service.permission.VLegalDraftPermission"%>
<%@page import="com.vportal.portlet.vlegal.service.impl.VLegalDraftDocumentServiceImpl"%>
<%@page import="com.vportal.portlet.vlegal.model.VLegalDraftDocument"%>
<%@page import="com.liferay.portal.kernel.dao.search.ResultRow"%>
<%@ include file="/html/portlet/vlegal/init.jsp" %>
<%
	String redirect = currentURL;
	ResultRow row = (ResultRow)request.getAttribute(WebKeys.SEARCH_CONTAINER_RESULT_ROW);
	VLegalDraftDocument draft = (VLegalDraftDocument)row.getObject();
	String isExpiredDate = (String)request.getAttribute("isExpiredDate");
%>
<liferay-ui:icon-menu>
	<c:choose>
		<c:when test="<%= (draft.getStatusDraft() == VLegalDraftDocumentServiceImpl.PUBLISHED) %>">
			<%-- // Create Draft Level --%>
			<portlet:renderURL windowState="<%= WindowState.MAXIMIZED.toString() %>" var="createDraftLevel">
				<portlet:param name="jspPage" value="/html/portlet/vlegal/draft_edit.jsp" />
				<portlet:param name="<%= Constants.CMD %>" value="createDraftLevel" />
				<portlet:param name="redirect" value="<%= redirect %>" />
				<portlet:param name="draftId" value="<%= draft.getDraftId() %>" />
			</portlet:renderURL>
			
			<liferay-ui:icon image="create_draft" url="<%= createDraftLevel %>" message="<%= LanguageUtil.get(pageContext, "portlet.vlegal.tooltip.create-draft-level") %>"/>
			
			<%-- // Create Document--%>
			<portlet:renderURL windowState="<%= WindowState.MAXIMIZED.toString() %>" var="createDocument">
				<portlet:param name="jspPage" value="/html/portlet/vlegal/document_edit.jsp" />
				<portlet:param name="<%= Constants.CMD %>" value="createDocument" />
				<portlet:param name="redirect" value="<%= redirect %>" />
				<portlet:param name="draftId" value="<%= draft.getDraftId() %>" />
			</portlet:renderURL>
			<liferay-ui:icon image="create_document" url="<%= createDocument %>" message="<%= LanguageUtil.get(pageContext, "portlet.vlegal.tooltip.create-document-from-draft") %>"/>			
	</c:when>
	<c:when test="<%= (draft.getStatusDraft() == VLegalDraftDocumentServiceImpl.APPROVAL_PENDING) %>">	
		<portlet:actionURL windowState="<%= WindowState.MAXIMIZED.toString() %>" var="approveURL">
			<portlet:param name="updateDraft" value="updateDraftUrl" />
			<portlet:param name="<%= Constants.CMD %>" value="approved_draft" />
			<portlet:param name="redirect" value="<%= redirect %>" />
			<portlet:param name="draftIds" value="<%= draft.getDraftId() %>" />
		</portlet:actionURL>
		<liferay-ui:icon image="approve" url="<%= approveURL %>" message="<%= LanguageUtil.get(pageContext, "portlet.vlegal.tooltip.approve-draft") %>"/>
					
		<c:if test="<%= VLegalDraftPermission.contains(permissionChecker, draft, ActionKeys.PERMISSIONS) %>">
			<liferay-security:permissionsURL
				modelResource="<%= VLegalDraftDocument.class.getName() %>"
				modelResourceDescription="<%= draft.getTitle() %>"
				resourcePrimKey="<%= String.valueOf(draft.getDraftId()) %>"
				var="permissionsURL"
			/>
			<liferay-ui:icon image="permissions" url="<%= permissionsURL %>" />
		</c:if>
	</c:when>
	</c:choose>			
		<c:if test="<%= draft.getStatusDraft() == VLegalDraftDocumentServiceImpl.PUBLISH_PENDING %>">
			<portlet:actionURL windowState="<%= WindowState.MAXIMIZED.toString() %>" var="publishURL">
				<portlet:param name="updateDraft" value="updateDraftUrl" />
				<portlet:param name="<%= Constants.CMD %>" value="published_draft" />
				<portlet:param name="redirect" value="<%= redirect %>" />
				<portlet:param name="draftIds" value="<%= draft.getDraftId() %>" />
			</portlet:actionURL>
			<liferay-ui:icon image="publish" url="<%= publishURL %>" message="<%= LanguageUtil.get(pageContext, "portlet.vlegal.tooltip.published-draft") %>"/>
			
			<portlet:actionURL windowState="<%= WindowState.MAXIMIZED.toString() %>" var="cancelApproveURL">
				<portlet:param name="updateDraft" value="updateDraftUrl" />
				<portlet:param name="<%= Constants.CMD %>" value="cancel_approved" />
				<portlet:param name="redirect" value="<%= redirect %>" />
				<portlet:param name="draftIds" value="<%= draft.getDraftId() %>" />
			</portlet:actionURL>
			<liferay-ui:icon image="cancel_approve" url="<%= cancelApproveURL %>" message="<%= LanguageUtil.get(pageContext, "portlet.vlegal.tooltip.cancel-approve-draft") %>"/>
		</c:if>
		
		<c:if test="<%= draft.getStatusDraft() == VLegalDraftDocumentServiceImpl.PUBLISHED %>">
			<portlet:actionURL windowState="<%= WindowState.MAXIMIZED.toString() %>" var="cancelPublishURL">
				<portlet:param name="updateDraft" value="updateDraftUrl />
				<portlet:param name="<%= Constants.CMD %>" value="cancel_published" />
				<portlet:param name="redirect" value="<%= redirect %>" />
				<portlet:param name="draftIds" value="<%= draft.getDraftId() %>" />
			</portlet:actionURL>
			<liferay-ui:icon image="cancel_publish" url="<%= cancelPublishURL %>" message="<%= LanguageUtil.get(pageContext, "portlet.vlegal.tooltip.cancel-publish-draft") %>" />
		</c:if>
		
		<portlet:renderURL windowState="<%= WindowState.MAXIMIZED.toString() %>" var="editURL">
			<portlet:param name="updateDraft" value="updateDraftUrl" />
			<portlet:param name="redirect" value="<%= redirect %>" />
			<portlet:param name="draftId" value="<%= draft.getDraftId() %>" />
		</portlet:renderURL>
		<liferay-ui:icon image="edit" url="<%= editURL %>" />
		
		<portlet:actionURL windowState="<%= WindowState.MAXIMIZED.toString() %>" var="deleteURL">
			<portlet:param name="updateDraft" value="updateDraftUrl" />
			<portlet:param name="<%= Constants.CMD %>" value="<%= Constants.DELETE %>" />
			<portlet:param name="redirect" value="<%= redirect %>" />
			<portlet:param name="draftIds" value="<%= draft.getDraftId() %>" />
		</portlet:actionURL>
		<liferay-ui:icon-delete url="<%= deleteURL %>" />
</liferay-ui:icon-menu>