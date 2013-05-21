<%@page import="com.test.model.VlookuppriceCategory"%>
<%@page import="com.liferay.portal.kernel.util.WebKeys"%>
<%@page import="com.liferay.portal.kernel.dao.search.ResultRow"%>
<%@include file="/html/quantri/init.jsp"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@taglib prefix="liferay-ui" uri="http://liferay.com/tld/ui"%>
<% 

ResultRow rs=(ResultRow)request.getAttribute(WebKeys.SEARCH_CONTAINER_RESULT_ROW);
VlookuppriceCategory vlopricategory=(VlookuppriceCategory)rs.getObject();
String key=vlopricategory.getCategoryId();
%>

<liferay-ui:icon-menu>
<portlet:actionURL name="Category_Edit" var="edit_">
		<portlet:param name="categoryId" value="<%=key %>"></portlet:param>
	</portlet:actionURL>
	<liferay-ui:icon image="edit" message="lookup.category.edit" url="<%=edit_.toString() %>"/>
	<portlet:actionURL name="Delete_Category" var="delete_">
		<portlet:param name="categoryId" value="<%=key %>"></portlet:param>
	</portlet:actionURL>
	<liferay-ui:icon-delete   url="<%=delete_.toString() %>"/>
	
</liferay-ui:icon-menu>