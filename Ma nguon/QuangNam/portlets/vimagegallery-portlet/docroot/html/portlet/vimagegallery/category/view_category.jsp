

<%@page import="com.vportal.portlet.vimagegallery.util.PortletKeyExt"%>
<%	

	List listCategory = new ArrayList();
	
	listCategory = TFCategoryServiceUtil.getByGroupId(groupId);
	
	boolean showAddCategoryButton = showButtons && PortletPermissionUtil.
		contains(permissionChecker , plid.longValue() , PortletKeyExt.VIMAGEGALLERY , ActionKeysExt.ADD_CATEGORY_);	
	

%>
<%
	PortletURL categoryURL = renderResponse.createRenderURL();
	categoryURL.setParameter("jspPage","/html/portlet/vimagegallery/category/view_category.jsp");
	categoryURL.setParameter("tabs1", tabs1);
	PortletURL portletURL1 = renderResponse.createRenderURL();
	portletURL1.setParameter("jspPage", "/html/portlet/vimagegallery/category/edit_category.jsp");
//		portletURL1.setParameter("tabs1", tabs1);
	List headerNames = new ArrayList();	
	headerNames.add("T\u00ean ch\u1ee7 \u0111\u1ec1");
	headerNames.add("M\u00f4 t\u1ea3");
	headerNames.add("S\u1ed1 \u1ea3nh");
	headerNames.add("Ng\u00e0y t\u1ea1o");
	headerNames.add(StringPool.BLANK);

	SearchContainer searchCtn = new SearchContainer(renderRequest,
			null, null, SearchContainer.DEFAULT_CUR_PARAM, 10,
			categoryURL, headerNames, null);	
	
	searchCtn.setEmptyResultsMessage("there-are-no-category");	
	
	List results = new ArrayList();
	for (int i = 0; i < listCategory.size(); i++) {
		TFCategory category = (TFCategory)listCategory.get(i);
		results.add(category);
	}
	
	int total = results.size();
	searchCtn.setTotal(total);
		
	results = ListUtil.subList(results, searchCtn.getStart(), searchCtn.getEnd());
	searchCtn.setResults(results);
	
	List resultRows = searchCtn.getResultRows();
	
	for (int i = 0; i < results.size(); i++) {
		
		TFCategory category = (TFCategory) results.get(i);				
		ResultRow row = new ResultRow(category, Long.toString(category.getId()),i);
	
		PortletURL rowURL = renderResponse.createRenderURL();
		rowURL.setWindowState(WindowState.MAXIMIZED);
		rowURL.setParameter("jspPage", "/html/portlet/vimagegallery/category/edit_category.jsp");
		rowURL.setParameter("cmd", "showupdate" );
		rowURL.setParameter("id", Long.toString(category.getId()));
		rowURL.setParameter("redirect",currentURL);

		StringBuffer sm = new StringBuffer();
		sm.append("<p");		
		sm.append(">");
		sm.append("<img align=\"left\" border=\"0\" src=\"");
		sm.append(themeDisplay.getPathThemeImages());
		sm.append("/common/folder.png\">");
		sm.append("<b>");
		sm.append(category.getName());
		sm.append("</b>");

		//Name		
		row.addText(sm.toString());
		
		//Description
		TextSearchEntry rowDescription =  new TextSearchEntry("left", SearchEntry.DEFAULT_VALIGN, category.getDescription());
		row.addText(rowDescription);
		
		//Count image by category
		int imageCount = TFImageServiceUtil.countByG_C(category.getGroupId(),category.getId());
		TextSearchEntry rowImageCount = new TextSearchEntry(SearchEntry.DEFAULT_ALIGN, SearchEntry.DEFAULT_VALIGN,String.valueOf(imageCount));
		row.addText(rowImageCount);
		
		//Created date
		TextSearchEntry rowCreatedate =  new TextSearchEntry(SearchEntry.DEFAULT_ALIGN, SearchEntry.DEFAULT_VALIGN,VImagegalleryUtil.dateParser(category.getCreateDate()));
		row.addText(rowCreatedate);
		
		// Add categoryAction
		row.addJSP("right", SearchEntry.DEFAULT_VALIGN, "/html/portlet/vimagegallery/category/category_action.jsp", application, request, response);	
		resultRows.add(row);		
	}
%>
<!-- Button addCategory -->
<c:if test='<%=showAddCategoryButton%>'>
	<div class="portlet-font" style="font-weight: bold; float: left; margin-right: 10px">
		<input class="portlet-form-button" type="button" 
			value="<%= LanguageUtil.get(pageContext, "VImageGallery.form.addCategory") %>"
			onclick="window.location.href='<%= portletURL1.toString() %>'">
			

	</div>
</c:if>	

<br>
<br>


<liferay-ui:search-iterator searchContainer="<%= searchCtn %>" />
<br>
