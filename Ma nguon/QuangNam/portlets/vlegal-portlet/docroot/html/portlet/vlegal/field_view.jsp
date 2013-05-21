<%@page import="com.liferay.portal.kernel.dao.search.SearchEntry"%>
<%@page import="com.vportal.portlet.vlegal.service.VLegalDocumentServiceUtil"%>
<%@page import="javax.portlet.PortletURL"%>
<%@page import="com.liferay.portal.kernel.dao.search.ResultRow"%>
<%@page import="com.vportal.portlet.vlegal.model.VLegalField"%>
<%@page import="com.vportal.portlet.vlegal.service.VLegalFieldServiceUtil"%>
<%@page import="com.liferay.portal.kernel.dao.search.SearchContainer"%>
<%@page import="com.liferay.portal.kernel.util.StringPool"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@page import="com.liferay.portal.kernel.language.LanguageUtil"%>
<%@page import="javax.portlet.WindowState"%>
<%@page import="com.liferay.portal.kernel.util.Constants"%>
<%
/**
 * Copyright (c) 2000-2012 VietSoftware, Inc. All rights reserved.
 *
 */
%>
<%
	PortletURL p = renderResponse.createRenderURL();
	p.setParameter("jspPage", "/html/portlet/vlegal/field_edit.jsp");
%>

<script type="text/javascript">	
	
</script>
	<input class="portlet-form-button" type="button" value='<%= LanguageUtil.get(pageContext, "add") %>' onClick="javascript:<portlet:namespace />updateField('<%= Constants.ADD %>', true);" />
<%-- 	<input class="portlet-form-button" type="button" VALUE="<%=LanguageUtil.get(pageContext, "add") %>" ONCLICK="window.location.href='<%=p.toString()%>'"> --%>

<%
	List headerNames = new ArrayList();

	headerNames.add("name");
	headerNames.add("description");
	headerNames.add("status");
	headerNames.add("#document");
	headerNames.add(StringPool.BLANK);
	
	SearchContainer searchContainer = new SearchContainer(renderRequest, null, null, SearchContainer.DEFAULT_CUR_PARAM, SearchContainer.DEFAULT_DELTA, portletURL, headerNames, null);
	searchContainer.setEmptyResultsMessage("there-are-no-field");
	List results = VLegalFieldServiceUtil.getFieldByGroupId(groupId,searchContainer.getStart(), searchContainer.getEnd());
	
	int total = VLegalFieldServiceUtil.countFieldByGroupId(groupId);
	
	searchContainer.setTotal(total);
	searchContainer.setResults(results);
	
	List resultRows = searchContainer.getResultRows();
	for (int i = 0; i < results.size(); i++) {
		VLegalField field = (VLegalField)results.get(i);
		
		ResultRow row = new ResultRow(field, field.getPrimaryKey().toString(), i);
		
		PortletURL rowURL = renderResponse.createRenderURL();
		
		rowURL.setWindowState(WindowState.MAXIMIZED);
		
		rowURL.setParameter("jspPage", "/html/portlet/vlegal/field_edit.jsp");
		rowURL.setParameter("redirect", currentURL);
		rowURL.setParameter("fieldid", field.getFieldId());
		
		StringBuffer sb = new StringBuffer();
		int documents = VLegalDocumentServiceUtil.getDocByG_L_F(groupId, language, field.getFieldId()).size();
		
		// Name
		row.addText(field.getName());
		
		// Description
		row.addText(field.getDescription());
		
		// Status
		if (field.getStatusField()){
			row.addText("<img src=\"/vlegal-portlet/html/portlet/vlegal/images/enabled.gif\" valign='middle' />");
		} else {
			row.addText("");
		}
		
		// # document
		row.addText(String.valueOf(documents));
		
		// Action
		row.addJSP("right", SearchEntry.DEFAULT_VALIGN, "/html/portlet/vlegal/field_action.jsp", application,request,response);
		// Add result row
		resultRows.add(row);
	}
%>
	<br><br><div class="beta-separator"></div>
	<liferay-ui:search-iterator searchContainer="<%= searchContainer %>" />	

