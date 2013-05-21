<%@page import="com.liferay.portal.kernel.util.Constants"%>
<%@page import="com.liferay.portal.kernel.dao.search.SearchEntry"%>
<%@page import="com.vportal.portlet.vlegal.service.VLegalDocumentServiceUtil"%>
<%@page import="javax.portlet.WindowState"%>
<%@page import="javax.portlet.PortletURL"%>
<%@page import="com.liferay.portal.kernel.dao.search.ResultRow"%>
<%@page import="com.vportal.portlet.vlegal.model.VLegalType"%>
<%@page import="com.vportal.portlet.vlegal.service.VLegalTypeServiceUtil"%>
<%@page import="com.liferay.portal.kernel.dao.search.SearchContainer"%>
<%@page import="com.liferay.portal.kernel.util.StringPool"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@page import="com.liferay.portal.kernel.language.LanguageUtil"%>
<%
/**
 * Copyright (c) 2000-2012 VietSoftware, Inc. All rights reserved.
 *
 */
%>
<script type="text/javascript">
	
</script>
	
<input class="portlet-form-button" type="button" value='<%= LanguageUtil.get(pageContext, "add") %>' onClick="javascript:<portlet:namespace />updateType('<%= Constants.ADD %>', true);" />

<%
	List headerNames = new ArrayList();

	headerNames.add("name");
	headerNames.add("description");
	headerNames.add("status");
	headerNames.add("#document");
	headerNames.add(StringPool.BLANK);
	
	SearchContainer searchContainer = new SearchContainer(renderRequest, null, null, SearchContainer.DEFAULT_CUR_PARAM, SearchContainer.DEFAULT_DELTA, portletURL, headerNames, null);
	searchContainer.setEmptyResultsMessage("there-are-no-type");
	List results = VLegalTypeServiceUtil.getTypeByGroupId(groupId,searchContainer.getStart(), searchContainer.getEnd());
	
	int total = VLegalTypeServiceUtil.countTypeByGroupId(groupId);
	
	searchContainer.setTotal(total);
	searchContainer.setDelta(15);
	
	List resultRows = searchContainer.getResultRows();
	for (int i = 0; i < results.size(); i++) {
		VLegalType type = (VLegalType)results.get(i);
		
		ResultRow row = new ResultRow(type, type.getPrimaryKey().toString(), i);
		
		PortletURL rowURL = renderResponse.createRenderURL();
		
		rowURL.setWindowState(WindowState.MAXIMIZED);
		
		rowURL.setParameter("jspPage", "/html/portlet/vlegal/type_edit.jsp");
		rowURL.setParameter("redirect", currentURL);
		rowURL.setParameter("typeid", type.getTypeId());

		StringBuffer sb = new StringBuffer();
		int position = type.getPosition();
		
		int documents = VLegalDocumentServiceUtil.getDocByG_L_T(groupId, language, type.getTypeId()).size();
		
		// Name
		row.addText(type.getName());
		
		// Description
		row.addText(type.getDescription());
		
		// Status		
		if (type.getStatusType()){
			row.addText("<img src=\"/vlegal-portlet/html/portlet/vlegal/images/enabled.gif\" valign='middle' />");
		} else {
			row.addText("");
		}
		
		// # document
		row.addText(String.valueOf(documents));				
		
		// Action
		row.addJSP("right", SearchEntry.DEFAULT_VALIGN, "/html/portlet/vlegal/type_action.jsp", application,request,response);
		// Add result row
		resultRows.add(row);
	}
%>
	<br><div class="beta-separator"></div><br>
	<input type="hidden" name="<portlet:namespace />position" value="" />
	<liferay-ui:search-iterator searchContainer="<%= searchContainer %>" />	
	
