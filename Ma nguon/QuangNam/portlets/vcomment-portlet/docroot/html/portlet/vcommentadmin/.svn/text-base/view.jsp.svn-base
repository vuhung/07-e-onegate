<%@page import="javax.portlet.ActionRequest"%>
<%@page import="com.vportal.portlet.vcomment.util.VCommentUtil"%>
<%@page import="com.vportal.portlet.vcomment.model.*"%>
<%@ include file="/html/portlet/vcommentadmin/init.jsp" %>
<%@ taglib uri="http://liferay.com/tld/aui" prefix="aui" %>
<%	
List contactList = null;
	PortletURL portletURL = renderResponse.createRenderURL();
	portletURL.setWindowState(WindowState.MAXIMIZED);
	portletURL.setParameter("struts_action", "/vcontact/view");	
	PortletURL deleteloger = renderResponse.createActionURL();
	deleteloger.setParameter("tabs1", tabs1);
	deleteloger.setParameter("statuss",Integer.toString(status));
	deleteloger.setParameter(ActionRequest.ACTION_NAME, "delete_logger");
	contactList = VCommentServiceUtil.getByG_S(groupId, status);
	PortletURL updatepublish = renderResponse.createActionURL();
	updatepublish.setParameter("tabs1", tabs1);
	updatepublish.setParameter(ActionRequest.ACTION_NAME, "publishDocuments");
	//boolean showDeleteAll = showButtons && PortletPermissionUtil.
	//	contains(permissionChecker , plid.longValue(), PortletKeysExt.VCONTACT, ActionKeysExt.DELETE);
	
%>
<script type="text/javascript">
	function <portlet:namespace/>deleteAll() {
		var Ids = document.<portlet:namespace/>fm.<portlet:namespace />Ids.value;
		Ids = Liferay.Util.listCheckedExcept(document.<portlet:namespace />fm, "<portlet:namespace />allRowIds");
		if (Ids.length > 0 ){
			if (confirm('B\u1EA1n c\u00F3 ch\u1EAFc ch\u1EAFn mu\u1ED1n x\u00F3a c\u00E1c g\u00F3p \u00FD \u0111\u00E3 ch\u1ECDn')) {
				document.<portlet:namespace />fm.<portlet:namespace />cmd.value = "dodelete";
				document.<portlet:namespace />fm.<portlet:namespace />Ids.value = Liferay.Util.listCheckedExcept(document.<portlet:namespace />fm, "<portlet:namespace />allRowIds");
				submitForm(document.<portlet:namespace />fm, 
						"<portlet:actionURL windowState="<%=WindowState.MAXIMIZED.toString()%>">
						<portlet:param name="struts_action" value="/vcontact/contact" /> </portlet:actionURL>");
			}
		} else {
				alert("B\u1EA1n vui l\u00F2ng ch\u1ECDn g\u00F3p \u00FD");
		}
	}
	function <portlet:namespace/>submitFormDeleteloger(){
		var myform = document.<portlet:namespace />fm;
		myform.action= "<%=deleteloger.toString() %>"
		myform.submit();
		window.close(); 

		if (window.opener && !window.opener.closed) {
			window.opener.location.reload(true);
		} 		
	}
	function <portlet:namespace/>submitFormupdatePublish(){
		var myform = document.<portlet:namespace />fm;
		 
		myform.action= "<%=updatepublish.toString() %>";
		myform.submit();
		window.close(); 
		
		if (window.opener && !window.opener.closed) {
			window.opener.location.reload(true);
		} 	
		  
	}
</script>	
	


<form  method="POST" name="<portlet:namespace />fm">
	<input type="hidden" name="<portlet:namespace/>cmd" value="">
	<input name="<portlet:namespace />Ids" type="hidden" value="">

<liferay-ui:tabs names="<%= tabsNames %>"
			url="<%= portletURL.toString() %>" />
	
<br/>
<%
			PortletURL p = renderResponse.createRenderURL();
			p.setParameter("tabs1", tabs1);
			
			%>
<c:if test="<%= contactList.size() > 0%>">


	<input class="portlet-form-button" type="button" value='<%= LanguageUtil.get(pageContext, "delete") %>' onClick="javascript:<portlet:namespace />deleteArticles();" />
	</c:if>
	<input type="hidden" name="<portlet:namespace />loggerIds" value="" />
	<input type="hidden" name="<portlet:namespace />allRowIds" value="" />

	<liferay-ui:search-container emptyResultsMessage="chua co du lieu" delta="4" iteratorURL="<%=p %>" >
	<liferay-ui:search-container-results >
	<% 
	
	List list = VCommentServiceUtil.getByG_S(groupId, status);
// 	int documents = VLegalDocumentServiceUtil.getDocByG_L_T(groupId, language, type.getTypeId()).size();
		List sublist = ListUtil.subList(list, searchContainer.getStart(), searchContainer.getEnd());
		pageContext.setAttribute("results", sublist);
		pageContext.setAttribute("total", list.size());
	%>
	
	</liferay-ui:search-container-results>
	<liferay-ui:search-container-row className="VComment"  modelVar="vc">
	<%	
	         //String name1 = "<input type='checkbox' name='<portlet:namespace />allRowIds' onclick='Liferay.Util.checkAll(AUI().one(this).ancestor('table.taglib-search-iterator'), '<portlet:namespace/>allRowId', this);'/>";
	         String name="<input type='checkbox'  onclick=\"Liferay.Util.checkAll(AUI().one(this).ancestor('table.taglib-search-iterator'), '<portlet:namespace />allRowIds', this);\" />";
	         //String input1 ="<input type='checkbox' name='<portlet:namespace />allRowId' value='"+ vc.getId() +"'/>";
	         String input="<input type='checkbox' name='<portlet:namespace />allRowIds' value='"+vc.getId()+"'/>";
	       
		%>
		
			<liferay-ui:search-container-column-text  name="<%=name %>" value="<%=input %>" />
			<liferay-ui:search-container-column-text name="name"  value='<%= vc.getGuestName() %>'/>
			<liferay-ui:search-container-column-text name="title"  value='<%= vc.getTitle() %>'/>
			<liferay-ui:search-container-column-text name="email"  value='<%= vc.getEmail() %>'/>
			<liferay-ui:search-container-column-text name="send-date"  value='<%=VCommentUtil.dateParser(vc.getCreatedDate())%>'/>

		
<liferay-ui:search-container-column-jsp path="/html/portlet/vcommentadmin/action.jsp"/>
	</liferay-ui:search-container-row>	
	<liferay-ui:search-iterator />
	
</liferay-ui:search-container>













</form>

<aui:script>
	Liferay.provide(
		window,
		'<portlet:namespace />deleteArticles',
		function() {
		document.<portlet:namespace />fm.<portlet:namespace />allRowIds.value = Liferay.Util.listCheckedExcept(document.<portlet:namespace />fm, "allRowIds");
		if(document.<portlet:namespace />fm.<portlet:namespace />allRowIds.value.length>0)
		{
			if (confirm('<%= UnicodeLanguageUtil.get(pageContext, "are-you-sure-you-want-to-delete-the-selected-log") %>')) {
		        document.<portlet:namespace />fm.<portlet:namespace />allRowIds.value = Liferay.Util.listCheckedExcept(document.<portlet:namespace />fm, "allRowIds");
				<portlet:namespace/>submitFormDeleteloger();
			}
		}	else{
			alert('<%= UnicodeLanguageUtil.get(pageContext, "you-must-select-log-to-delete") %>');
			}
		},
		['liferay-util-list-fields']
	);
Liferay.provide(
		window,
		'<portlet:namespace />updatepublish',
		function() {
		
		document.<portlet:namespace />fm.<portlet:namespace />allRowIds.value = Liferay.Util.listCheckedExcept(document.<portlet:namespace />fm, "allRowIds");
		
		if(document.<portlet:namespace />fm.<portlet:namespace />allRowIds.value.length>0)
		{
			if (confirm('<%= UnicodeLanguageUtil.get(pageContext, "are-you-sure-you-want-to-delete-the-selected-log") %>')) {
			
		        document.<portlet:namespace />fm.<portlet:namespace />allRowIds.value = Liferay.Util.listCheckedExcept(document.<portlet:namespace />fm, "allRowIds");
		 
				<portlet:namespace/>submitFormupdatePublish();
			}
		}	else{
			alert('<%= UnicodeLanguageUtil.get(pageContext, "you-must-select-log-to-delete") %>');
			}
		},
		['liferay-util-list-fields']
	);
</aui:script>