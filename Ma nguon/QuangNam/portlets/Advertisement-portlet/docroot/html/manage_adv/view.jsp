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

<%@page import="javax.portlet.ActionRequest"%>
<%@page import="javax.portlet.WindowState"%>
<%@page import="javax.portlet.PortletURL"%>
<%@page import="com.liferay.portal.kernel.language.UnicodeLanguageUtil" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ include file="/init.jsp" %>

<%
	String tabsName = "tab.adv.item";
			tabsName += ",tab.adv.type";
			
	PortletURL portletURL = renderResponse.createRenderURL();
	portletURL.setWindowState(WindowState.MAXIMIZED);
	
	portletURL.setParameter("tab1", tab1);
	portletURL.setParameter("tab2", tab2);
	
	PortletURL deletedocumment = renderResponse.createActionURL();
	deletedocumment.setParameter(ActionRequest.ACTION_NAME, "deletestaff");
	
%>

<liferay-ui:tabs names="<%= tabsName %>" param="tab1" url="<%=portletURL.toString()%>" > 
  <c:choose>
    	<c:when test='<%= tab1.equals("tab.adv.type") %>'>
    		<%@ include file="/html/manage_adv/manage_advType/view_type.jsp" %>
    	</c:when>
    	<c:otherwise >
    		<%@ include file="/html/manage_adv/manage_advItem/view_item.jsp" %>
    	</c:otherwise>
</c:choose>    
</liferay-ui:tabs>