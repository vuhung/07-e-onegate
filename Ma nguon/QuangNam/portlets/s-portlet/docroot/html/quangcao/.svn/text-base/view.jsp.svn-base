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
<%@ include file="/html/quangcao/init.jsp" %>
<%@page import="javax.portlet.WindowState"%>
<%@page import="javax.portlet.PortletURL"%>
<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<portlet:defineObjects />
<%
String tabsNames = "advquangcao.quangcao.tabs.item";
tabsNames +=",advquangcao.quangcao.tabs.type";

PortletURL advquangcao = renderResponse.createRenderURL();
advquangcao.setWindowState(WindowState.MAXIMIZED);
advquangcao.setParameter("tabs", tabs1);

%>
<table width="100%">	
  <tr>
   <td width="130">
   <%if(tabs1.equals("advquangcao.quangcao.tabs.type")){%>
			<img src="/s-portlet/html/quangcao/images/document.png" width="128" height="128" style="cursor:pointer" />
		<%}else if(tabs1.equals("advquangcao.quangcao.tabs.item")){%>	
			<img src="/s-portlet/html/quangcao/images/intro_cms.png" width="128" height="128" style="cursor:pointer" />
		<%} %>
   
   </td>
   <td width="40%" style="padding-left:10px;">
   <font style="font-weight:bold;font-size:20px">
			<liferay-ui:message key="dvquangcao.quangcao.intro"/> </font>
   </td>
  </tr>
  
</table>

<div style="text-decoration: none !important;">
<liferay-ui:tabs  names="<%=tabsNames%>"  param="tabs"  url="<%=advquangcao.toString() %>"/>
</div>
<c:choose>
   <c:when test='<%= tabs1.equals("advquangcao.quangcao.tabs.item") %>'>
		<%@ include file="/html/quangcao/manage/view_item.jsp" %>
	</c:when>
	<c:when test='<%= tabs1.equals("advquangcao.quangcao.tabs.type") %>'>
	<%@ include file="/html/quangcao/manage/view_type.jsp" %>
	</c:when>
</c:choose>







