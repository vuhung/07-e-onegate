<%--
/**
* Copyright (c) 2000-2010 Liferay, Inc. All rights reserved.
*
* This library is free software; you can redistribute it and/or modify it under
* the terms of the GNU Lesser General Public License as published by the Free
* Software Foundation; either version 2.1 of the License, or (at your option)
* any later version.
*
* This library is distributed in the hope that it will be useful, but WITHOUT
* ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
* FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
* details.
*/
--%>
<%@page import="com.test.service.VlookuppriceCategoryServiceUtil"%>
<%@page import="com.liferay.portal.kernel.util.ListUtil"%>
<%@page import="com.test.service.persistence.VlookuppriceCategoryUtil"%>
<%@page import="com.test.model.VlookuppriceCategory"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@page import="com.liferay.portal.kernel.language.LanguageUtil"%>
<%@include file="/html/quantri/tabs.jsp" %>
<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>
<%@taglib prefix="liferay-ui" uri="http://liferay.com/tld/ui"%>

<portlet:defineObjects />
<%

PortletURL portletDat=renderResponse.createRenderURL();
portletDat.setParameter("jspPage","/html/quantri/edit_category.jsp");
PortletURL portletView=renderResponse.createRenderURL();
portletView.setParameter("jspPage", "/html/quantri/view.jsp");
ThemeDisplay themeDisplay5= (ThemeDisplay) request.getAttribute(WebKeys.THEME_DISPLAY);

Long groupId4=Long.valueOf(themeDisplay5.getPortletGroupId());
int statuss=groupId4.intValue();

List listLookupcate=new ArrayList();
// listvacl=(List)VFileServiceUtil.findByGroupId(statuss);
listLookupcate=(List)VlookuppriceCategoryServiceUtil.findByP_P_L(groupId4, parentId,language);
%>


<form action="" method="post" name="<portlet:namespace />fm">
 <table  width="100%" cellpadding="0" cellspacing="0" border="0">
  <tr>
    <td align="left">
    <input TYPE="BUTTON" VALUE="<%=LanguageUtil.get(pageContext, "lookup.area.add") %>" ONCLICK="window.location.href='<%=portletDat.toString()%>'" />
    </td>
  </tr>
 </table>
  <liferay-ui:search-container emptyResultsMessage="lookup.area.khuvuc" delta="4"  iteratorURL="<%=portletView %>">
<liferay-ui:search-container-results >

<%

List sublist=ListUtil.subList(listLookupcate, searchContainer.getStart(), searchContainer.getEnd());
  pageContext.setAttribute("results", sublist);
   pageContext.setAttribute("total", listLookupcate.size());
%>

</liferay-ui:search-container-results>
<liferay-ui:search-container-row className="com.test.model.VlookuppriceCategory" modelVar="vlookupcate">

  
    <liferay-ui:search-container-column-text name="lookup.area.tite"  value='<%= vlookupcate.getName() %>'/>
   <liferay-ui:search-container-column-text name="description" value='<%=vlookupcate.getDescription() %>'/>
  		
	
   <liferay-ui:search-container-column-jsp path="/html/quantri/category_action.jsp"/>

</liferay-ui:search-container-row>
<liferay-ui:search-iterator/>
</liferay-ui:search-container>
</form>