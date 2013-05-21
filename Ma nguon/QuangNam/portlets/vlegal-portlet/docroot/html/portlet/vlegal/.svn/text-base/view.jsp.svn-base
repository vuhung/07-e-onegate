<%@page import="com.liferay.portal.kernel.util.Constants"%>
<%@page import="com.liferay.portal.theme.PortletDisplay"%>
<%@page import="com.vportal.portlet.vlegal.service.permission.VLegalDocumentPermission"%>
<%@page import="com.liferay.portal.kernel.language.UnicodeLanguageUtil"%>
<%@page import="javax.portlet.ActionRequest"%>
<%@include file="/html/portlet/vlegal/init.jsp"%>
<%@taglib uri="http://liferay.com/tld/aui" prefix="aui" %>

<portlet:defineObjects/>

<%
	String tabsNames = "";
	String tabsIcons = "";
	
	if (PortletPermissionUtil.contains(permissionChecker, plid.longValue(), PortletKeysExt.VLEGAL, ActionKeysExt.VIEW_STATISTIC)) {		
		tabsNames += "portlet.vlegal.infomation-tab";
		tabsIcons += "vlegal/tab_statistics.gif";		
	}
	if (PortletPermissionUtil.contains(permissionChecker, plid.longValue(), PortletKeysExt.VLEGAL, ActionKeysExt.VIEW_DOCUMENT)) {		
		tabsNames += ",portlet.vlegal.document-tab";
		tabsIcons += ",vlegal/tab_document.gif";
		
	}
// 	if (PortletPermissionUtil.contains(permissionChecker, plid.longValue(), PortletKeysExt.VLEGAL, ActionKeysExt.VIEW_DRAFT) && manageDraftSuggestion ) {
// 		tabsNames += ",portlet.vlegal.draft-tab";
// 		tabsIcons += ",vlegal/tab_drafts.gif";
// 	}
	if (PortletPermissionUtil.contains(permissionChecker, plid.longValue(), PortletKeysExt.VLEGAL, ActionKeysExt.VIEW_GENERAL) && viewGeneral ) {
		tabsNames += ",portlet.vlegal.generalmanage-tab";
		tabsIcons += ",vlegal/tab_generalmanage.gif";
	}
	if (PortletPermissionUtil.contains(permissionChecker, plid.longValue(), PortletKeysExt.VLEGAL, ActionKeysExt.VIEW_LOGS) && viewLog ) {
		tabsNames += ",portlet.vlegal.logger-tab";
		tabsIcons += ",vlegal/tab_logs.gif";
	}
	if (PortletPermissionUtil.contains(permissionChecker, plid.longValue(), PortletKeysExt.VLEGAL, ActionKeysExt.VIEW_CONFIG)) {
		tabsNames += ",portlet.vlegal.config-tab";
		tabsIcons += ",vlegal/tab_configurations.gif";
	}
	
	PortletURL portletURL = renderResponse.createRenderURL();
	
	portletURL.setWindowState(WindowState.MAXIMIZED);	
	portletURL.setParameter("jspPage", "/html/portlet/vlegal/view.jsp");
	portletURL.setParameter("tabs1", tabs1);
	portletURL.setParameter("tabs2", tabs2);
	portletURL.setParameter("language", language);
	portletURL.setParameter("groupId", String.valueOf(groupId));
	
%>
<script type="text/javascript">
	
	function <portlet:namespace />submitForm() {
		submitForm(document.<portlet:namespace />fm, '<portlet:renderURL windowState="<%= WindowState.MAXIMIZED.toString() %>"><portlet:param name="jpsPage" value="/html/portlet/vlegal/view.jsp" /><portlet:param name="<%= Constants.CMD %>" value="" /></portlet:renderURL>');
	}
	
	// search Document
	function <portlet:namespace />doSearchDocuments() {
		submitForm(document.<portlet:namespace />fm, '<portlet:renderURL windowState="<%= WindowState.MAXIMIZED.toString() %>"><portlet:param name="jspPage" value="/html/portlet/vlegal/view.jsp" /></portlet:renderURL>');
	}

	// cancel_approve document
	function <portlet:namespace />cancelApprove(){
		var docids = document.<portlet:namespace />fm.<portlet:namespace />docids.value;
		docids = Liferay.Util.listCheckedExcept(document.<portlet:namespace />fm, "<portlet:namespace />allRowIds");
		if (docids.length > 0) {
			if (confirm('<%= UnicodeLanguageUtil.get(pageContext, "are-you-sure-you-want-to-cancel-approve-the-selected-document") %>')) {
				document.<portlet:namespace />fm.<portlet:namespace />docids.value =  Liferay.Util.listCheckedExcept(document.<portlet:namespace />fm, "<portlet:namespace />allRowIds");			
				submitForm(document.<portlet:namespace />fm, 
						'<portlet:actionURL name="processDocument" var="cancel_approveUrl"><portlet:param name="<%= Constants.CMD %>" value="cancel_approve" /></portlet:actionURL>');
			}
		} else {
			alert('<%= UnicodeLanguageUtil.get(pageContext,"you-must-select-document-to-cancel-approve")%>');
		}
	}

		
	// publish all document
	function <portlet:namespace />publishAll(){
		var docids = document.<portlet:namespace />fm.<portlet:namespace />docids.value;
		docids = Liferay.Util.listCheckedExcept(document.<portlet:namespace />fm, "<portlet:namespace />allRowIds");
		if (docids.length > 0) {
			if (confirm('<%= UnicodeLanguageUtil.get(pageContext, "are-you-sure-you-want-to-publish-the-selected-document") %>')) {
				document.<portlet:namespace />fm.<portlet:namespace />docids.value =  Liferay.Util.listCheckedExcept(document.<portlet:namespace />fm, "<portlet:namespace />allRowIds");							
				submitForm(document.<portlet:namespace />fm, '<portlet:actionURL name="processDocument" var="publishUrl"><portlet:param name="<%= Constants.CMD %>" value="publish" /></portlet:actionURL>');
			}
		} else {
			alert('<%= UnicodeLanguageUtil.get(pageContext,"you-must-select-document-to-publish")%>');
		}
	}	
	
	// Update Document	
	function <portlet:namespace />updateDocument(cmd, render) {
		if (render) {
			submitForm(document.<portlet:namespace />fm, '<portlet:renderURL windowState="<%= WindowState.MAXIMIZED.toString() %>"><portlet:param name="jspPage" value="/html/portlet/vlegal/document_edit.jsp" /></portlet:renderURL>');
		} else {
			document.<portlet:namespace />fm.<portlet:namespace /><%= Constants.CMD %>.value = cmd;
			submitForm(document.<portlet:namespace />fm, '<portlet:actionURL name="updateDraft" var="updateDraftUrl"></portlet:actionURL>');
		}
	}
	
	// Update Draft
	function <portlet:namespace />updateDraft(cmd,render){
		if (render==true) {			
			submitForm(document.<portlet:namespace />fm,'<portlet:renderURL windowState="<%= WindowState.MAXIMIZED.toString() %>"><portlet:param name="jspPage" value="/html/portlet/vlegal/draft_edit.jsp" /></portlet:renderURL>');
		} else {
			document.<portlet:namespace />fm.<portlet:namespace /><%= Constants.CMD %>.value = cmd;
			submitForm(document.<portlet:namespace />fm, '<portlet:actionURL name="updateDraft" var="updateDraftUrl"></portlet:actionURL>');
		}
	}
	
	// Update Type Document
	function <portlet:namespace />updateType(cmd, render) {
		document.<portlet:namespace />fm.<portlet:namespace /><%= Constants.CMD %>.value = cmd;		
		if (render) {
			submitForm(document.<portlet:namespace />fm, '<portlet:renderURL windowState="<%= WindowState.MAXIMIZED.toString() %>"><portlet:param name="jspPage" value="/html/portlet/vlegal/type_edit.jsp" /></portlet:renderURL>');
		} else {
			submitForm(document.<portlet:namespace />fm, '<portlet:actionURL name="updateType" var="updateTypeUrl"></portlet:actionURL>');
		}
	}
	
	// Update Field Document
	function <portlet:namespace />updateField(cmd, render) {
		document.<portlet:namespace />fm.<portlet:namespace /><%= Constants.CMD %>.value = cmd;		
		if (render) {
			submitForm(document.<portlet:namespace />fm, '<portlet:renderURL windowState="<%= WindowState.MAXIMIZED.toString() %>"><portlet:param name="jspPage" value="/html/portlet/vlegal/field_edit.jsp" /></portlet:renderURL>');
		} else {
			submitForm(document.<portlet:namespace />fm, '<portlet:actionURL name="updateField" var="updateFieldUrl"></portlet:actionURL>');
		}
	}	
	// Update Org Document
	function <portlet:namespace />updateOrg(cmd, render) {
		document.<portlet:namespace />fm.<portlet:namespace /><%= Constants.CMD %>.value = cmd;		
		if (render) {
			submitForm(document.<portlet:namespace />fm, '<portlet:renderURL windowState="<%= WindowState.MAXIMIZED.toString() %>"><portlet:param name="jspPage" value="/html/portlet/vlegal/org_edit.jsp" /></portlet:renderURL>');
		} else {
			submitForm(document.<portlet:namespace />fm, '<portlet:actionURL name="updateOrg" var="updateOrgUrl"></portlet:actionURL>');
		}
	}
	
	// Update Signer Document
	function <portlet:namespace />updateSigner(cmd, render) {
		document.<portlet:namespace />fm.<portlet:namespace /><%= Constants.CMD %>.value = cmd;		
		if (render) {
			submitForm(document.<portlet:namespace />fm, '<portlet:renderURL windowState="<%= WindowState.MAXIMIZED.toString() %>"><portlet:param name="jspPage" value="/html/portlet/vlegal/signer_edit.jsp" /></portlet:renderURL>');
		} else {
			submitForm(document.<portlet:namespace />fm, '<portlet:actionURL name="updateSigner" var="updateSignerUrl"></portlet:actionURL>');
		}
	}
	
	function <portlet:namespace />deleteArticles(){
		var listsChecked = Liferay.Util.listCheckedExcept(document.<portlet:namespace />fm, "<portlet:namespace />allRowIds");
		if(listsChecked != ""){
			if(confirm('<%= LanguageUtil.get(pageContext, "portlet.vcms.article.delete-all")%>')){
				document.<portlet:namespace />fm.<portlet:namespace />articleIds.value = Liferay.Util.listCheckedExcept(document.<portlet:namespace />fm, "<portlet:namespace />allRowIds");
				document.<portlet:namespace />fm.<portlet:namespace /><%= Constants.CMD %>.value = '<%= Constants.DELETE %>';
				submitForm(document.<portlet:namespace />fm, '<portlet:actionURL windowState="<%= WindowState.MAXIMIZED.toString() %>"><portlet:param name="struts_action" value="/vcms/edit_article" /></portlet:actionURL>');
			}
		}else{
			alert("<%= LanguageUtil.get(pageContext, "portlet.vcms.article.listchecked.warning")%>");
		}
	}
	
	// Delete a document or documents 	
	function <portlet:namespace />deleteDocuments(render){
		alert("ok men's");
		var listsChecked = Liferay.Util.listCheckedExcept(document.<portlet:namespace />fm, "<portlet:namespace />allRowIds");
		alert(listsChecked);
		if (confirm('<%= UnicodeLanguageUtil.get(pageContext, "are-you-sure-you-want-to-delete-the-selected-document") %>')) {
			document.<portlet:namespace />fm.<portlet:namespace />docids.value =  Liferay.Util.listCheckedExcept(document.<portlet:namespace />fm, "<portlet:namespace />allRowIds");
			submitForm(document.<portlet:namespace />fm, '<portlet:actionURL name="processDocument" var="deleteUrl"><portlet:param name="<%= Constants.CMD %>" value="delete" /></portlet:actionURL>');
		}
	}

// 	// Delete a log or logs 
// 	function <portlet:namespace />deleteLogs() {
// 		var loggerIds = document.<portlet:namespace />fm.<portlet:namespace />loggerIds.value;
// 		loggerIds = Liferay.Util.listCheckedExcept(document.<portlet:namespace />fm, "<portlet:namespace />allRowIds");
// 		if (loggerIds.length >0){
<%-- 			if (confirm('<%= UnicodeLanguageUtil.get(pageContext, "are-you-sure-you-want-to-delete-the-selected-log") %>')) { --%>
// 				document.<portlet:namespace />fm.<portlet:namespace />loggerIds.value = Liferay.Util.listCheckedExcept(document.<portlet:namespace />fm, "<portlet:namespace />allRowIds");			
<%-- 				submitForm(document.<portlet:namespace />fm, '<portlet:actionURL windowState="<%= WindowState.MAXIMIZED.toString() %>"><portlet:param name="struts_action" value="/vlegal/edit_logger" /><portlet:param name="<%= Constants.CMD %>" value="delete" /></portlet:actionURL>'); --%>
// 			}
// 		} else {
<%-- 			alert('<%= UnicodeLanguageUtil.get(pageContext, "you-must-select-log-to-delete") %>'); --%>
// 		}
// 	}
	
	// Update position of TypeDoc
	function <portlet:namespace />updateTypePosition(selector) {
		document.<portlet:namespace />fm.<portlet:namespace />position.value = selector.value;
		document.<portlet:namespace />fm.<portlet:namespace />cmd.value = 'update_position';
		submitForm(document.<portlet:namespace />fm, '<portlet:actionURL windowState="<%= WindowState.MAXIMIZED.toString() %>"><portlet:param name="struts_action" value="/vlegal/edit_type" /></portlet:actionURL>');
	}
	
	// Update position of OrgDoc
	function <portlet:namespace />updateOrgPosition(selector) {
		document.<portlet:namespace />fm.<portlet:namespace />position.value = selector.value;
		document.<portlet:namespace />fm.<portlet:namespace />cmd.value = 'update_position';
		submitForm(document.<portlet:namespace />fm, '<portlet:actionURL windowState="<%= WindowState.MAXIMIZED.toString() %>"><portlet:param name="struts_action" value="/vlegal/edit_org" /></portlet:actionURL>');
	}
	
	// Quick Action
	function <portlet:namespace />choiceAction(){
		var type = document.<portlet:namespace/>fm.<portlet:namespace/>action.value;
		if (type == 1){
			<portlet:namespace />updateDocument('<%= Constants.ADD %>', true);
		} else if (type == 2){
			<portlet:namespace />updateDraft('<%= Constants.ADD %>',true);
		} else if (type == 3){
			<portlet:namespace />updateType('<%= Constants.ADD %>', true);
		} else if (type == 4){
			<portlet:namespace />updateField('<%= Constants.ADD %>', true);
		} else if (type == 5){
			<portlet:namespace />updateOrg('<%= Constants.ADD %>', true);
		} else if (type == 6){
			<portlet:namespace />updateSigner('<%= Constants.ADD %>', true);
		}
	}

</script>
		
<c:if test='<%= Validator.isNotNull(tabsNames)%>'>
<div class="boder">
<form action="<%= portletURL.toString() %>" method="post" name="<portlet:namespace />fm" onSubmit="submitForm(this); return false;">
<input name="<portlet:namespace /><%= Constants.CMD %>" type="hidden" value="">
<input name="<portlet:namespace />tabs1" type="hidden" value="<%= tabs1 %>">
<input name="<portlet:namespace />tabs2" type="hidden" value="<%= tabs2 %>">
<input name="<portlet:namespace />redirect" type="hidden" value="<portlet:renderURL windowState="<%= WindowState.MAXIMIZED.toString() %>"><portlet:param name="jspPage" value="/html/portlet/vlegal/view.jsp" /><portlet:param name="tabs1" value="<%= tabs1 %>" /><portlet:param name="tabs2" value="<%= tabs2 %>" /></portlet:renderURL>">

<div align="left">
<table width="100%" border="0" cellspacing="2" cellpadding="2">
  <tr>
    <td width="5%"><img src="<%= themeDisplay.getPathThemeImage() %>/vlegal-portlet/html/portlet/vlegal/images/heading.gif" border="0" /></td>
    <td width="1%">&nbsp;</td>
    <% if (styleDisplay == 2){%>
    	<td width="49%"><font style="font-weight:bold;font-size:20px"><%=customTitle%></font></td>
    <%}else{ %>    
    	<td width="49%"><font style="font-weight:bold;font-size:20px">H&#7878; TH&#7888;NG QU&#7842;N LÝ V&#258;N B&#7842;N PHÁP QUY</font></td>
    <%}%>
    <td width="45" align="right">
    <c:if test="<%= quickAction%>">
    	<b>Thao tác nhanh :</b>
		<select name="<portlet:namespace/>action" onchange="<portlet:namespace/>choiceAction()">
			<option value="0">-- Ch&#7885;n thao tác --</option>
			<option value="1">Thêm m&#7899;i v&#259;n b&#7843;n</option>
		<c:if test="<%=manageDraftSuggestion%>">
			<option value="2">Thêm m&#7899;i d&#7921; th&#7843;o</option>
		</c:if>
	
		<c:if test="<%=viewGeneral%>">
			<option value="3">Thêm m&#7899;i th&#7875; lo&#7841;i v&#259;n b&#7843;n</option>
			<option value="4">Thêm m&#7899;i l&#297;nh v&#7921;c v&#259;n b&#7843;n</option>
			<option value="5">Thêm m&#7899;i c&#417; quan ban hành</option>
			<option value="6">Thêm m&#7899;i ng&#432;&#7901;i kí</option>
		</c:if>
		</select>
	</c:if>
	</td>
  </tr>
</table>	
</div>
	
<br><div class="beta-separator"></div>

<form action="<%= portletURL.toString() %>" method="post" name="<portlet:namespace />fm" onSubmit="submitForm(this); return false;">
	<input name="<portlet:namespace /><%= Constants.CMD %>" type="hidden" value="">
	<input name="<portlet:namespace />redirect" type="hidden" value="<portlet:renderURL 
		windowState="<%= WindowState.MAXIMIZED.toString() %>">
		<portlet:param name="jspPage" value="/html/portlet/vlegal/view.jsp" />
		<portlet:param name="tabs1" value="<%= tabs1 %>" />
		<portlet:param name="tabs2" value="<%= tabs2 %>" />
		</portlet:renderURL>">
	
<liferay-ui:tabs names="<%= tabsNames %>" param="tabs1" url="<%= portletURL.toString() %>" />
	<c:choose>
		<c:when test='<%=tabs1.equals("portlet.vlegal.generalmanage-tab")%>'>
			<%@include file="/html/portlet/vlegal/general_manage.jsp" %>
		</c:when>
		<c:when test='<%=tabs1.equals("portlet.vlegal.logger-tab")%>'>
			<%@include file="/html/portlet/vlegal/log_view.jsp" %>
		</c:when>				
<%-- 		<c:when test='<%= tabs1.equals("portlet.vlegal.draft-tab") && manageDraftSuggestion%>'> --%>
<%-- 			<%@include file="/html/portlet/vlegal/draft_view.jsp" %> --%>
<%-- 		</c:when>		 --%>
		<c:when test='<%= tabs1.equals("portlet.vlegal.document-tab")%>'>
			<%@include file="/html/portlet/vlegal/document_view.jsp" %>
		</c:when>	
		<c:when test='<%=tabs1.equals("portlet.vlegal.config-tab")%>'>
			<%@include file="/html/portlet/vlegal/configuration.jsp" %>
		</c:when>
		<c:otherwise>
			<%@include file="/html/portlet/vlegal/statistics.jsp" %>
		</c:otherwise>
	</c:choose>
</form>
</div>	
</c:if>