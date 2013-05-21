<%@page import="com.liferay.portal.kernel.dao.search.SearchEntry"%>
<%@page import="javax.portlet.PortletURL"%>
<%@page import="com.liferay.portal.kernel.dao.search.ResultRow"%>
<%@page import="com.vportal.portlet.vlegal.model.VLegalSigner"%>
<%@page import="com.vportal.portlet.vlegal.service.VLegalSignerServiceUtil"%>
<%@page import="com.liferay.portal.kernel.dao.search.SearchContainer"%>
<%@page import="com.liferay.portal.kernel.util.StringPool"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@page import="com.liferay.portal.kernel.language.LanguageUtil"%>
<%@page import="javax.portlet.WindowState"%>
<%@page import="com.liferay.portal.kernel.util.Constants"%>
<%
/**
 * Copyright (c) 2000-2008 VietSoftware, Inc. All rights reserved.
 *
 */
%>
<script type="text/javascript">
	function <portlet:namespace />deleteSigners(){
		document.<portlet:namespace />fm.<portlet:namespace />sigids.value = listCheckedExcept(document.<portlet:namespace />fm, "<portlet:namespace />allRowIds");
		document.<portlet:namespace />fm.<portlet:namespace /><%= Constants.CMD %>.value = '<%= Constants.DELETE %>';
		submitForm(document.<portlet:namespace />fm, '<portlet:actionURL windowState="<%= WindowState.MAXIMIZED.toString() %>"><portlet:param name="updateSigner" value="updateSignerUrl" /></portlet:actionURL>');
	}
	
</script>
	<input class="portlet-form-button" type="button" value='<%= LanguageUtil.get(pageContext, "add") %>' onClick="javascript:<portlet:namespace />updateSigner('<%= Constants.ADD %>', true);" />
<%
	List headerNames = new ArrayList();

	headerNames.add("name");
	headerNames.add("status");
	headerNames.add(StringPool.BLANK);
	
	SearchContainer searchContainer = new SearchContainer(renderRequest, null, null, SearchContainer.DEFAULT_CUR_PARAM, SearchContainer.DEFAULT_DELTA, portletURL, headerNames, null);
	searchContainer.setEmptyResultsMessage("there-are-no-sig");

	List results = VLegalSignerServiceUtil.getSignerByGroupId(groupId, searchContainer.getStart(), searchContainer.getEnd());
	int total = VLegalSignerServiceUtil.countSignerByGroupId(groupId);
	searchContainer.setTotal(total);
	searchContainer.setResults(results);
	
	List resultRows = searchContainer.getResultRows();
	for (int i = 0; i < results.size(); i++) {
		VLegalSigner signer = (VLegalSigner)results.get(i);
		
		ResultRow row = new ResultRow(signer, signer.getPrimaryKey().toString(), i);
		
		PortletURL rowURL = renderResponse.createRenderURL();
		
		rowURL.setWindowState(WindowState.MAXIMIZED);
		
		rowURL.setParameter("jspPage", "/html/portlet/vlegal/signer_edit.jsp");
		rowURL.setParameter("redirect", currentURL);
		rowURL.setParameter("sigid", signer.getSigId());
		
		// Add Content
		row.addText(signer.getFirstName() + " " + signer.getLastName());
		
		// Status
		if (signer.getStatusSigner()){
			row.addText("<img src=\"/vlegal-portlet/html/portlet/vlegal/images/enabled.gif\" valign='middle' />");		
		} else {
			row.addText("");
		}

		
		
		// Action
		row.addJSP("right", SearchEntry.DEFAULT_VALIGN, "/html/portlet/vlegal/signer_action.jsp", application,request,response);
		// Add result row
		resultRows.add(row);
	}
%>
	<br><div class="beta-separator"></div><br>
	<liferay-ui:search-iterator searchContainer="<%= searchContainer %>" />

