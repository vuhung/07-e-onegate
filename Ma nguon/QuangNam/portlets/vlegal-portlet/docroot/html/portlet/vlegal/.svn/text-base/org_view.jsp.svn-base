<%@page import="com.liferay.portal.kernel.util.Constants"%>
<%@page import="com.liferay.portal.kernel.dao.search.SearchEntry"%>
<%@page import="com.vportal.portlet.vlegal.service.VLegalDocumentServiceUtil"%>
<%@page import="javax.portlet.PortletURL"%>
<%@page import="javax.portlet.WindowState"%>
<%@page import="com.liferay.portal.kernel.dao.search.ResultRow"%>
<%@page import="com.vportal.portlet.vlegal.model.VLegalOrg"%>
<%@page import="com.vportal.portlet.vlegal.service.VLegalOrgServiceUtil"%>
<%@page import="com.liferay.portal.kernel.dao.search.SearchContainer"%>
<%@page import="com.liferay.portal.kernel.util.StringPool"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%
/**
 * Copyright (c) 2000-2008 VietSoftware, Inc. All rights reserved.
 *
 */
%>
<script type="text/javascript">	

	
</script>
	<input class="portlet-form-button" type="button" value='<%= LanguageUtil.get(pageContext, "add") %>' onClick="javascript:<portlet:namespace />updateOrg('<%= Constants.ADD %>', true);" />
<%
	List headerNames = new ArrayList();

	headerNames.add("portlet.vlegal.org.name");
	headerNames.add("description");
	headerNames.add("status");
	headerNames.add("#document");
	headerNames.add(StringPool.BLANK);
	
	SearchContainer searchContainer = new SearchContainer(renderRequest, null, null, SearchContainer.DEFAULT_CUR_PARAM, SearchContainer.DEFAULT_DELTA, portletURL, headerNames, null);
	searchContainer.setEmptyResultsMessage("there-are-no-org");
	
	List results = VLegalOrgServiceUtil.getOrgByGroupId(groupId, searchContainer.getStart(), searchContainer.getEnd());
	int total =VLegalOrgServiceUtil.countOrgByGroupId(groupId);
	searchContainer.setTotal(total);
	searchContainer.setResults(results);
	List resultRows = searchContainer.getResultRows();
	for (int i = 0; i < results.size(); i++) {
		VLegalOrg org = (VLegalOrg)results.get(i);
		
		ResultRow row = new ResultRow(org, org.getPrimaryKey().toString(), i);
		
		PortletURL rowURL = renderResponse.createRenderURL();
		
		rowURL.setWindowState(WindowState.MAXIMIZED);
		
		rowURL.setParameter("jspPage", "/html/portlet/vlegal/org_edit.jsp");
		rowURL.setParameter("redirect", currentURL);
		rowURL.setParameter("orgid", org.getOrgId());
		
		StringBuffer sb = new StringBuffer();
		int position = org.getPosition();
		int documents = VLegalDocumentServiceUtil.getDocByG_L_O(groupId, language, org.getOrgId()).size();

		// Name
		row.addText(org.getName());
		
		// Description
		row.addText(org.getDescription());
		
		// Status
		if (org.getStatusOrg()){
			row.addText("<img src=\"/vlegal-portlet/html/portlet/vlegal/images/enabled.gif\" valign='middle' />");
		} else {
			row.addText("");
		}
		
		// # document
		row.addText(String.valueOf(documents));
		
		// Action
		row.addJSP("right", SearchEntry.DEFAULT_VALIGN, "/html/portlet/vlegal/org_action.jsp", application,request,response);
		// Add result row
		resultRows.add(row);
	}
%>
	<br><div class="beta-separator"></div><br>
	<liferay-ui:search-iterator searchContainer="<%= searchContainer %>" />	
