<%@page import="com.liferay.portal.kernel.language.LanguageUtil"%>
<%@page import="com.vsi.advertisement.portlet.service.AdvTypeServiceUtil"%>
<%@page import="com.vsi.advertisement.portlet.service.AdvItemServiceUtil"%>
<%@page import="com.vsi.advertisement.portlet.model.AdvType" %>
<%@page import="javax.portlet.PortletURL"%>
<%@page import="javax.portlet.WindowState"%>
<%@page import="javax.portlet.PortletURL"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ include file="/init.jsp" %>
<%@ taglib uri="http://liferay.com/tld/aui" prefix="aui" %>
<%
	String tabsName = "tab.adv.type";
						
	PortletURL portletURL = renderResponse.createRenderURL();
	portletURL.setWindowState(WindowState.MAXIMIZED);	
	portletURL.setParameter("tab1", tab1);
	
	long typeId = Long.valueOf(renderRequest.getParameter("typeId"));
	AdvType type = AdvTypeServiceUtil.getType(typeId);
	
%>


<portlet:actionURL name="updateType" var="updateTypeURL" />

<liferay-ui:tabs names="<%= tabsName %>" param="tab1" url="<%= portletURL.toString() %>" > 

	<aui:form name="fm" Method="post" action="<%= updateTypeURL.toString() %>">
		<aui:input name="typeId" value="<%= type.getTypeId() %>" type="hidden"/>
		<table >
			<tr height="30">
				<td width="20%"><b><%= LanguageUtil.get(pageContext, "type.name","Kiểu quảng cáo") %></b></td>
				<td><aui:input name="name" value="<%= type.getName() %>" label="" style="width:350px"/>  </td>
			</tr>
			
			<tr height="30">
				<td width="20%"><b><%= LanguageUtil.get(pageContext, "type.description","Mô tả") %></b></td>
				<td> <liferay-ui:input-textarea param="description" defaultValue="<%= type.getDescription() %>" /> </td>
			</tr>	
						 
		</table>
		
			<aui:button type="submit" value='<%= LanguageUtil.get(pageContext, "actions.save","Save") %>'/>
			<aui:button type="button" value='<%= LanguageUtil.get(pageContext, "actions.cancel","Cancel") %>' onClick="history.back();"/>	
	</aui:form>
</liferay-ui:tabs>

















