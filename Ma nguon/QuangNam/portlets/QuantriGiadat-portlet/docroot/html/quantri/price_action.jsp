<%@page import="com.test.model.Vlookupprice"%>
<%@page import="com.liferay.portal.kernel.dao.search.ResultRow"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<%@include file="/html/quantri/init.jsp" %>
<%@taglib prefix="liferay-ui" uri="http://liferay.com/tld/ui" %>
<%
ResultRow rs=(ResultRow)request.getAttribute(WebKeys.SEARCH_CONTAINER_RESULT_ROW);
Vlookupprice vlooprice=(Vlookupprice)rs.getObject();
String key=vlooprice.getLookuppriceId();
%>
<liferay-ui:icon-menu>
<portlet:actionURL name="Price_Edit" var="edit_">
		<portlet:param name="lookuppriceId" value="<%=key %>"></portlet:param>
	</portlet:actionURL>
	<liferay-ui:icon image="edit" message="lookup.category.edit" url="<%=edit_.toString() %>"/>
	<portlet:actionURL name="Prices_Delete" var="delete_">
		<portlet:param name="lookuppriceId" value="<%=key %>"></portlet:param>
	</portlet:actionURL>
	<liferay-ui:icon-delete   url="<%=delete_.toString() %>"/>
	
</liferay-ui:icon-menu>