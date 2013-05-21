<%@page import="com.liferay.portal.kernel.language.LanguageUtil"%>
<%@page import="java.util.Date"%>
<%@page import="com.vportal.portlet.vlegal.util.VLegalUtil"%>
<%@page import="com.vportal.portlet.vlegal.action.ActionUtil"%>
<%@page import="com.liferay.portal.kernel.dao.search.SearchEntry"%>
<%@page import="javax.portlet.PortletURL"%>
<%@page import="com.liferay.portal.kernel.dao.search.ResultRow"%>
<%@page import="com.vportal.portlet.vlegal.model.VLegalDraftDocument"%>
<%@page import="com.vportal.portlet.vlegal.service.impl.VLegalDraftDocumentServiceImpl"%>
<%@page import="com.vportal.portlet.vlegal.service.VLegalDraftDocumentServiceUtil"%>
<%@page import="com.liferay.portal.kernel.dao.search.RowChecker"%>
<%@page import="com.liferay.portal.kernel.dao.search.SearchContainer"%>
<%@page import="com.liferay.portal.kernel.util.StringPool"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@page import="com.liferay.portal.kernel.language.UnicodeLanguageUtil"%>
<%@page import="javax.portlet.WindowState"%>
<%@page import="com.liferay.portal.kernel.util.Constants"%>
<%
	String tabs2Names = "portlet.vlegal.draft.approval_pending,portlet.vlegal.draft.publish_pending,portlet.vlegal.draft.published,portlet.vlegal.draft.expired_suggestion,portlet.vlegal.draft.suggestions";
	//String tabs2Icons = "vlegal/approval_pending.gif,vlegal/publish_pending.gif,vlegal/published.gif,vlegal/expireddate.gif,vlegal/suggestions.gif";
	String draftImage="";
	String isExpiredDate = "";
%>
<script type="text/javascript">
	function <portlet:namespace />updateSuggest(cmd,render){
		document.<portlet:namespace />fm.<portlet:namespace /><%= Constants.CMD %>.value = cmd;
		
		if (render) {
			submitForm(document.<portlet:namespace />fm, '<portlet:renderURL windowState="<%= WindowState.MAXIMIZED.toString() %>"><portlet:param name="struts_action" value="/vlegal/edit_suggest" /></portlet:renderURL>');
		} else {
			submitForm(document.<portlet:namespace />fm, '<portlet:actionURL windowState="<%= WindowState.MAXIMIZED.toString() %>"><portlet:param name="struts_action" value="/vlegal/edit_suggest" /></portlet:actionURL>');
		}
	}
	
	// Delete Drafts
	function <portlet:namespace />deleteDrafts(){
		var Ids = Liferay.Util.listCheckedExcept(document.<portlet:namespace />fm, "<portlet:namespace />allRowIds");
		if (Ids.length > 0){
			if (confirm('<%= UnicodeLanguageUtil.get(pageContext, "are-you-sure-you-want-to-delete-the-selected-draft") %>')) {
				document.<portlet:namespace />fm.<portlet:namespace />draftIds.value = Liferay.Util.listCheckedExcept(document.<portlet:namespace />fm, "<portlet:namespace />allRowIds");				
				submitForm(document.<portlet:namespace />fm, 
					'<portlet:actionURL windowState="<%= WindowState.MAXIMIZED.toString() %>"><portlet:param name="struts_action" value="/vlegal/edit_draft" /><portlet:param name="<%= Constants.CMD %>" value="Constants.DELETE" /></portlet:actionURL>');
			}
		} else {
			alert("<%= UnicodeLanguageUtil.get(pageContext, "you-must-select-draft-to-delete") %>");
		}
	}
	
	function <portlet:namespace />deleteSuggests(){
		document.<portlet:namespace />fm.<portlet:namespace />suggestionIds.value = Liferay.Util.listCheckedExcept(document.<portlet:namespace />fm, "<portlet:namespace />allRowIds");
		document.<portlet:namespace />fm.<portlet:namespace /><%= Constants.CMD %>.value = '<%= Constants.DELETE %>';
		submitForm(document.<portlet:namespace />fm, '<portlet:actionURL windowState="<%= WindowState.MAXIMIZED.toString() %>"><portlet:param name="struts_action" value="/vlegal/edit_suggest" /></portlet:actionURL>');
	}
	
	// Approve Draft
	function <portlet:namespace />approveAll_Draft(){
		var draftIds = Liferay.Util.listCheckedExcept(document.<portlet:namespace />fm, "<portlet:namespace />allRowIds");		
		if (draftIds.length > 0){
			if (confirm('<%= UnicodeLanguageUtil.get(pageContext, "are-you-sure-you-want-to-approve-the-selected-draft") %>')){
				document.<portlet:namespace />fm.<portlet:namespace />draftIds.value =  Liferay.Util.listCheckedExcept(document.<portlet:namespace />fm, "<portlet:namespace />allRowIds");
				submitForm(document.<portlet:namespace />fm, '<portlet:actionURL windowState="<%= WindowState.MAXIMIZED.toString() %>"><portlet:param name="struts_action" value="/vlegal/edit_draft" /><portlet:param name="<%= Constants.CMD %>" value="approved_draft" /></portlet:actionURL>');
			}
		} else {
			alert('<%= UnicodeLanguageUtil.get(pageContext, "you-must-select-draft-to-approve") %>');
		}
	}
	
	// Publish Draft
	function <portlet:namespace />publishAll_Draft(){
		var draftIds = Liferay.Util.listCheckedExcept(document.<portlet:namespace />fm, "<portlet:namespace />allRowIds");
		if (draftIds.length > 0){
			if (confirm('<%= UnicodeLanguageUtil.get(pageContext, "are-you-sure-you-want-to-publish-the-selected-draft") %>')) {
				document.<portlet:namespace />fm.<portlet:namespace />draftIds.value =  Liferay.Util.listCheckedExcept(document.<portlet:namespace />fm, "<portlet:namespace />allRowIds");			
				submitForm(document.<portlet:namespace />fm, '<portlet:actionURL windowState="<%= WindowState.MAXIMIZED.toString() %>"><portlet:param name="struts_action" value="/vlegal/edit_draft" /><portlet:param name="<%= Constants.CMD %>" value="published_draft" /></portlet:actionURL>');
			}
		} else {
			alert('<%= UnicodeLanguageUtil.get(pageContext, "you-must-select-draft-to-publish") %>');
		}
	}
	
	
	// Cancel Approve Draft	
	function <portlet:namespace />Cancel_approveAll_Draft(){
		var	draftIds = Liferay.Util.listCheckedExcept(document.<portlet:namespace />fm, "<portlet:namespace />allRowIds");
		if (draftIds.length > 0){
			if (confirm('<%= UnicodeLanguageUtil.get(pageContext, "are-you-sure-you-want-to-cancel-approve-the-selected-draft") %>')){
				document.<portlet:namespace />fm.<portlet:namespace />draftIds.value =  Liferay.Util.listCheckedExcept(document.<portlet:namespace />fm, "<portlet:namespace />allRowIds");
				submitForm(document.<portlet:namespace />fm, '<portlet:actionURL windowState="<%= WindowState.MAXIMIZED.toString() %>"><portlet:param name="struts_action" value="/vlegal/edit_draft" /><portlet:param name="<%= Constants.CMD %>" value="cancel_approved" /></portlet:actionURL>');
			}
		} else {
			alert('<%= UnicodeLanguageUtil.get(pageContext, "you-must-select-draft-to-cancel-approve") %>');
		}
	}
</script>	

<liferay-ui:tabs names="<%= tabs2Names %>" param="tabs2" url="<%= portletURL.toString() %>" />
<c:choose>
	<c:when test='<%=tabs2.equals("portlet.vlegal.draft.expired_suggestion")%>'>
		<%
			List headerNames = new ArrayList();						
			headerNames.add("portlet.vlegal.draft.title");
			headerNames.add("portlet.vlegal.draft.draftlevel");
			headerNames.add("portlet.vlegal.draft.expireddatesuggestion");			
			headerNames.add(StringPool.BLANK);
			
			SearchContainer searchContainer = new SearchContainer(renderRequest, null, null, SearchContainer.DEFAULT_CUR_PARAM, SearchContainer.DEFAULT_DELTA, portletURL, headerNames, null);
			searchContainer.setEmptyResultsMessage("there-are-no-draft");
			
			RowChecker rowChecker = new RowChecker(renderResponse);
			searchContainer.setRowChecker(rowChecker);
			List results = VLegalDraftDocumentServiceUtil.getDraftsExpiredDateByP_L_S(groupId,language,VLegalDraftDocumentServiceImpl.PUBLISHED,searchContainer.getStart(), searchContainer.getEnd());

			int total = VLegalDraftDocumentServiceUtil.countDraftsExpiredDateByP_L_S(groupId,language,VLegalDraftDocumentServiceImpl.PUBLISHED);
			searchContainer.setTotal(total);
			searchContainer.setResults(results);
			List resultRows = searchContainer.getResultRows();
			for (int i = 0; i < results.size(); i++) {
				VLegalDraftDocument draft = (VLegalDraftDocument)results.get(i);
				
				ResultRow row = new ResultRow(draft, draft.getPrimaryKey().toString(), i);
				
				PortletURL rowURL = renderResponse.createActionURL();
				
				rowURL.setWindowState(WindowState.MAXIMIZED);
				
				rowURL.setParameter("jspPage", "/html/porlet/vlegal/draft_edit.jsp");
				rowURL.setParameter(Constants.CMD,Constants.DELETE);
				rowURL.setParameter("redirect",currentURL);
				rowURL.setParameter("draftIds",draft.getDraftId());
				
				isExpiredDate = "isExpiredDate";
				request.setAttribute("isExpiredDate",isExpiredDate);
				// Name and description
				
				StringBuffer sb = new StringBuffer();
				
				String title = draft.getTitle();
				int draftlevel = draft.getDraftLevel();
				
				sb.append("<b>"+ title + "</b>");
							
				row.addText(sb.toString());
				row.addText("<font style='color:RED;font-weight:bold'>"+draftlevel+"</font>");
				row.addText("<font style='color:RED;font-weight:bold'>"+ VLegalUtil.dateParser(draft.getExpiredDate()) +"</font>");				
				row.addText("<a href='"+rowURL +"'><img src='" + themeDisplay.getPathThemeImage() + "/vlegal/delete.gif'/>"+"</a>");
				
				// Actions
								
				row.addJSP("right", SearchEntry.DEFAULT_VALIGN, "/html/portlet/vlegal/draft_action.jsp", application,request,response);
				
				// Add result row
				
				resultRows.add(row);
			}	
		%>
			<br/>
			<br><div class="beta-separator"></div><br>
							
		<liferay-ui:search-iterator searchContainer="<%= searchContainer %>" />		
	</c:when>
			
	<c:when test='<%=tabs2.equals("portlet.vlegal.draft.suggestions") %>'>
<%-- 		<%@include file="/html/portlet/vlegal/suggest_view.jsp" %> --%>
	</c:when>
			
	<c:otherwise>
		<%
		List headerNames = new ArrayList();

		headerNames.add("portlet.vlegal.draft.title");
		headerNames.add("portlet.vlegal.draft.draftlevel");
		headerNames.add("portlet.vlegal.draft.expireddatesuggestion");	
		
		headerNames.add(StringPool.BLANK);

		SearchContainer searchContainer = new SearchContainer(renderRequest, null, null, SearchContainer.DEFAULT_CUR_PARAM, totalItemDraftPerPage, portletURL, headerNames, null);

		RowChecker rowChecker = new RowChecker(renderResponse);
		searchContainer.setRowChecker(rowChecker);

		List results = null;
		int total = 0;
		if (tabs2.equals("portlet.vlegal.draft.published")) {
			try {
				results = VLegalDraftDocumentServiceUtil.getDraftsByP_L_S(groupId, language, VLegalDraftDocumentServiceImpl.PUBLISHED, searchContainer.getStart(), searchContainer.getEnd());		
					total = VLegalDraftDocumentServiceUtil.countDraftsByP_L_S(groupId, language, VLegalDraftDocumentServiceImpl.PUBLISHED);				
			} catch(Exception ex) {}
			//draftImage = "published.gif";
		
		} else if (tabs2.equals("portlet.vlegal.draft.publish_pending")) {
			try {
				results = VLegalDraftDocumentServiceUtil.getDraftsByP_L_S(groupId, language, VLegalDraftDocumentServiceImpl.PUBLISH_PENDING, searchContainer.getStart(), searchContainer.getEnd());	
				total = VLegalDraftDocumentServiceUtil.countDraftsByP_L_S(groupId, language, VLegalDraftDocumentServiceImpl.PUBLISH_PENDING);			
			} catch (Exception ex) {}
			//draftImage = "publish_pending.gif";
		} else {
			try {
				results = VLegalDraftDocumentServiceUtil.getDraftsByP_L_S(groupId, language, VLegalDraftDocumentServiceImpl.APPROVAL_PENDING, searchContainer.getStart(), searchContainer.getEnd());
				total = VLegalDraftDocumentServiceUtil.countDraftsByP_L_S(groupId, language, VLegalDraftDocumentServiceImpl.APPROVAL_PENDING);				
			} catch (Exception ex) {}
			tabs2 = "portlet.vlegal.draft.approval_pending";
			//draftImage = "approve.gif";
		}
		searchContainer.setTotal(total);
		searchContainer.setDelta(15);
		List resultRows = searchContainer.getResultRows();
		for (int i = 0; i < results.size(); i++) {
			VLegalDraftDocument draft = (VLegalDraftDocument)results.get(i);
			
			ResultRow row = new ResultRow(draft, draft.getPrimaryKey().toString(), i);
			PortletURL rowURL = renderResponse.createRenderURL();
						
			rowURL.setWindowState(WindowState.MAXIMIZED);			
			rowURL.setParameter("jspPage", "/html/portlet/vlegal/draft_edit.jsp");
			rowURL.setParameter("redirect", currentURL);
			rowURL.setParameter("draftId", draft.getDraftId());			
			
			// Name and description			
			StringBuffer sb = new StringBuffer();
			
			String title = draft.getTitle();
			int draftlevel = draft.getDraftLevel();
			Date expiredDate = draft.getExpiredDate();
			String expired = VLegalUtil.dateParser(expiredDate);
			
			sb.append("<b><a href=\"" + rowURL.toString() + "\">" + title + "</a></b>");
						
			row.addText(sb.toString());
			row.addText("<b>"+draftlevel+"</b>");
			if (expiredDate == null){
				row.addText("<b>" + LanguageUtil.get(pageContext, "never") + "</b>");
			}else {
				row.addText("<b>"+expired+"</b>");
			}
									
			row.addJSP("right", SearchEntry.DEFAULT_VALIGN, "/html/portlet/vlegal/draft_action.jsp", application,request,response);
			
			// Add result row			
			resultRows.add(row);
		}
		%>
			<div class="portlet-font" style="font-weight: bold; float: left; margin-right: 10px">
				<c:if test='<%= tabs2.equals("portlet.vlegal.draft.approval_pending")%>'>	<!-- APPROVAL PENDING -->
					<input class="portlet-form-button" type="button" value='<%= LanguageUtil.get(pageContext, "add") %>' onClick="<portlet:namespace />updateDraft('<%= Constants.ADD %>', true);" />
				</c:if>								
			
				<c:if test='<%= (tabs2.equals("portlet.vlegal.draft.approval_pending")) && (results.size()>0) %>'> <!-- APPROVAL PENDING -->
					<c:if test="<%= approveDraft %>">
						<input class="portlet-form-button" type="button" value='<%= LanguageUtil.get(pageContext, "approve") %>' onClick="<portlet:namespace />approveAll_Draft()"/></c:if>
					<c:if test="<%= publishDraft %>">
						<input class="portlet-form-button" type="button" value='<%= LanguageUtil.get(pageContext, "publish") %>' onClick="<portlet:namespace />publishAll_Draft()"/></c:if>
				</c:if>
					
				<c:if test='<%= (tabs2.equals("portlet.vlegal.draft.publish_pending")) && (results.size()>0 )%>'> <!-- PUBLISH PENDING -->
					<c:if test="<%= cancel_approveDraft %>">
						<input class="portlet-form-button" type="button" value='<%= LanguageUtil.get(pageContext, "unapprove") %>' onClick="<portlet:namespace />Cancel_approveAll_Draft()" /></c:if>
					<c:if test="<%= publishDraft %>">
						<input class="portlet-form-button" type="button" value='<%= LanguageUtil.get(pageContext, "publish") %>' onClick="<portlet:namespace />publishAll_Draft()" /></c:if>
				</c:if>
			</div>
			<br><div class="beta-separator"></div><br>

		<liferay-ui:search-iterator searchContainer="<%= searchContainer %>" /><br>
			
		<c:if test="<%= results.size() > 0 %>">		
			<input class="portlet-form-button" type="button" value='<%= LanguageUtil.get(pageContext, "delete") %>' onClick="<portlet:namespace />deleteDrafts()" />
			<input type="hidden" name="<portlet:namespace />draftIds" value="" /><br>
		</c:if>
	</c:otherwise>
</c:choose>
