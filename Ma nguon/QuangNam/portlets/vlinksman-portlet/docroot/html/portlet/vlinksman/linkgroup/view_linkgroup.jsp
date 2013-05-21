<%
	List linkGroups = LinkGroupServiceUtil.getByGroupId(groupId);
	
%>
<form name="<portlet:namespace />fm" action="<portlet:actionURL><portlet:param name="struts_action" value="/vlinksman/type" /></portlet:actionURL>" method="POST">
	<input name="<portlet:namespace />ids" type="hidden" value="">
	<input name="<portlet:namespace />cmd" type="hidden" value="">
	<input name="<portlet:namespace />redirect" type="hidden" value="<%= currentURL %>">
	
<%	
	PortletURL typeURL = renderResponse.createRenderURL();
	typeURL.setWindowState(WindowState.MAXIMIZED);	
	typeURL.setParameter("jspPage", "/html/portlet/vlinksman/linkgroup/edit_linkgroup.jsp");
		
	List headerNames = new ArrayList();
	headerNames.add("Vlinksman.name");
	headerNames.add("VLinksman.form.description");
	headerNames.add("VLinksman.form.url");
	headerNames.add("Vlinksman.index");
	headerNames.add(StringPool.BLANK);
	
	SearchContainer searchCtn = new SearchContainer(renderRequest, null, null, SearchContainer.DEFAULT_CUR_PARAM, 10, portletURL, headerNames, null);	
	searchCtn.setEmptyResultsMessage("there-are-no-linkgroups");	
	
	List results = new ArrayList();
	for (int i = 0; i < linkGroups.size(); i++) {
		LinkGroup linkGroup = (LinkGroup)linkGroups.get(i);
		results.add(linkGroup);
	}

	// Collections.sort(results);
	
	int total = results.size();
	results = ListUtil.subList(results, searchCtn.getStart(), searchCtn.getEnd());
	
	searchCtn.setResults(results);
	searchCtn.setTotal(total);

	List resultRows = searchCtn.getResultRows();
	for (int i = 0; i < results.size(); i++) {
		LinkGroup linkGroup = (LinkGroup)results.get(i);

		ResultRow row = new ResultRow(linkGroup, linkGroup.getLinkgroupId(), i);
		PortletURL rowURL = renderResponse.createRenderURL();

		rowURL.setWindowState(WindowState.MAXIMIZED);

		rowURL.setParameter("jspPage","/html/portlet/vlinksman/linkgroup/edit_linkgroup.jsp" );
		rowURL.setParameter("redirect", currentURL);
		rowURL.setParameter(Constants.CMD , "showupdate" );
		rowURL.setParameter("Id", Long.toString(linkGroup.getLinkgroupId()));

		//name
		TextSearchEntry rowName =  new TextSearchEntry("left", SearchEntry.DEFAULT_VALIGN, linkGroup.getName());
		row.addText(rowName);
	
		//description
		TextSearchEntry rowDescription =  new TextSearchEntry(SearchEntry.DEFAULT_ALIGN, SearchEntry.DEFAULT_VALIGN, linkGroup.getDescription());
		row.addText(rowDescription);
		
		//#item of typeAdv
		int count = LinksServiceUtil.getByLinkGroupId(linkGroup.getLinkgroupId()).size();
		TextSearchEntry rowLinks = new TextSearchEntry(SearchEntry.DEFAULT_ALIGN,SearchEntry.DEFAULT_VALIGN,String.valueOf(count));
		row.addText(rowLinks);
		
		//create date
		TextSearchEntry rowUrl =  new TextSearchEntry(SearchEntry.DEFAULT_ALIGN, SearchEntry.DEFAULT_VALIGN, linkGroup.getCreatedDate().toString());
		row.addText(rowUrl);
		
		//button
		row.addJSP("right", SearchEntry.DEFAULT_VALIGN, "/html/portlet/vlinksman/linkgroup/linkgroup_action.jsp",application,request,response);
		
		resultRows.add(row);
	}
%>

<input type="button" value="<%= LanguageUtil.get(pageContext, "VLinksman.form.action.add") %>"
	onclick="javascript:document.location='<portlet:renderURL>
	<portlet:param name="tabs1" value="VLinksman.title.linkgroup" />
	<portlet:param name="jspPage" value="/html/portlet/vlinksman/linkgroup/edit_linkgroup.jsp" />
	<portlet:param name="redirect" value="<%= currentURL %>"/>
	<portlet:param name="cmd" value="showadd" />
	</portlet:renderURL>'">	
	
<liferay-ui:search-iterator searchContainer="<%= searchCtn %>" />

<br>
</form>	