<%@page import="javax.portlet.WindowState"%>
<%@page import="com.liferay.portal.model.Layout"%>
<%@ include file="/init.jsp" %>
<%@ page import="com.vportal.portlet.vsearch.service.VConfigSearchServiceUtil" %>
<%@ page import="com.vportal.portlet.vsearch.model.VConfigSearch" %>			
<%@ page import="com.liferay.portal.kernel.dao.search.*" %>
<%@ page import="com.liferay.portal.service.LayoutLocalServiceUtil" %>
<%@ include file="/html/vsearch/tabs.jsp" %>
<%@ page import="java.util.*" %>
<%@ page import="com.liferay.portal.service.LayoutLocalServiceUtil" %>
<table border="0" cellpadding="0" cellspacing="0" width="100%">
<tr>
	<td>
	  <input type="button" value="<liferay-ui:message key="add" />" onClick="self.location = '<portlet:renderURL windowState="<%= WindowState.MAXIMIZED.toString() %>"><portlet:param name="tabs" value="<%=tabs %>" /><portlet:param name="struts_action" value="/vsearch/editsearch" /><portlet:param name="portletId" value="<%=portletId %>" /><portlet:param name="strutsaction" value="<%=strutsaction %>" /></portlet:renderURL>';" />
	</td>
</tr>
<tr>
	<td colspan=2>
		<%
		    long groupId = ParamUtil.getLong(request, "groupId",0);
			if(groupId == 0){
				groupId = portletGroupId.longValue();
			}
		    String language = ParamUtil.getString(request, "language", "vi_VN");
			SearchContainer searchContainer = new SearchContainer();
			List headerNames = new ArrayList();
			headerNames.add("layout");
			headerNames.add(StringPool.BLANK);
			
			searchContainer.setHeaderNames(headerNames);
			searchContainer.setEmptyResultsMessage("there-are-no-items-search");
			List results=null;
			results = VConfigSearchServiceUtil.findByPortlet(portletId,groupId);
		
			List resultRows = searchContainer.getResultRows();
			searchContainer.setTotal(results.size());
		    for(int i=0;i<results.size();i++){
			   VConfigSearch vConfigSearch=(VConfigSearch)results.get(i);
			   ResultRow row = new ResultRow(vConfigSearch, vConfigSearch.getConfisearchId(), i);
			   Layout curentlayout =null;
			   try{
			      curentlayout =LayoutLocalServiceUtil.getLayout(vConfigSearch.getLayoutId());
				}catch(Exception e){
				   VConfigSearchServiceUtil.deleteConfigSeach(vConfigSearch.getConfisearchId());
				}
				// Title and type
			  if(curentlayout!=null){
				row.addText(curentlayout.getHTMLTitle(language));
				// Action
				row.addJSP("right", SearchEntry.DEFAULT_VALIGN, "/html/vsearch/button.jsp");
				// Add result row
			
				resultRows.add(row);
			  }
			}
		%>
	<liferay-ui:search-iterator searchContainer="<%= searchContainer %>" />
	</td>
</tr>		
</table>

