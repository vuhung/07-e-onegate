<%@page import="com.liferay.portal.kernel.util.WebKeys"%>
<%@page import="com.liferay.portal.kernel.dao.search.ResultRow"%>
<%@page import="com.test.model.AdvItem"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"

    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="liferay-ui" uri="http://liferay.com/tld/ui"%>
    <%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%
	ResultRow row = (ResultRow) request.getAttribute(WebKeys.SEARCH_CONTAINER_RESULT_ROW);	
	AdvItem type = (AdvItem) row.getObject();
	String  key=Long.toString(type.getItemId());
%>
<liferay-ui:icon-menu>
  <portlet:actionURL  name="Item_Edit" var="edits">
  <portlet:param name="itemId" value="<%=key %>"></portlet:param>
  
  </portlet:actionURL>
  <liferay-ui:icon image="edit" message="viewTypeEdit" url="<%=edits.toString() %>" />
  <portlet:actionURL name="Item_Delete" var="delete_">
		<portlet:param name="itemId" value="<%=key %>"></portlet:param>
		
	</portlet:actionURL>
	<liferay-ui:icon-delete    url="<%=delete_.toString() %>"/>
</liferay-ui:icon-menu>