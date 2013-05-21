<%@ include file="/html/portlet/vfile/tabs.jsp" %>
<table border="0" cellpadding="0" cellspacing="0" width="100%">
<tr>
	<td>
	  <input type="button" value="<liferay-ui:message key="add" />" onClick="self.location = '<portlet:renderURL windowState="<%= WindowState.MAXIMIZED.toString() %>"><portlet:param name="tabs" value="<%=tabs %>" /><portlet:param name="jspPage" value="/html/portlet/vfile/edit_file.jsp" /></portlet:renderURL>';" />
	</td>
</tr>
<tr>
	<td colspan=2>
		<%
		    String language = ParamUtil.getString(request, "language", "vi_VN");
			PortletURL portletURL = renderResponse.createRenderURL();
			List headerNames = new ArrayList();
			headerNames.add("H&#7885; v&#224; T&#234;n");
			headerNames.add("Ch&#7913;c v&#7909;");
			headerNames.add("&#272;i&#7879;n tho&#7841;i");
			headerNames.add(StringPool.BLANK);
			SearchContainer searchContainer = new SearchContainer(renderRequest, null, null, SearchContainer.DEFAULT_CUR_PARAM, SearchContainer.DEFAULT_DELTA, portletURL, headerNames, null);			
			searchContainer.setEmptyResultsMessage("there-are-no-items-search");
			List results = VFileServiceUtil.findByAll(searchContainer.getStart(),searchContainer.getEnd());
			int total = VFileServiceUtil.countAll();
			searchContainer.setResults(results);
			List resultRows = searchContainer.getResultRows();
			searchContainer.setTotal(results.size());
		    for(int i=0;i<results.size();i++){
			  VFile vfile = (VFile)results.get(i);
			  ResultRow row = new ResultRow(vfile, vfile.getFileId(), i);
			   
				// Title and type
		
				row.addText(vfile.getFullname());
				row.addText(vfile.getPosition());
				row.addText(vfile.getPhone());
				// Actions
				row.addJSP("right", SearchEntry.DEFAULT_VALIGN, "/html/portlet/vfile/button_file.jsp",application,request,response);
				// Add result row
			
				resultRows.add(row);
		
			}
		%>
	<liferay-ui:search-iterator searchContainer="<%= searchContainer %>" />
	</td>
</tr>		
</table>
	