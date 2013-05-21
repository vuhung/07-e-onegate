<%@ include file="init.jsp" %>
<%@page import="com.vportal.portlet.vimagegallery.NoSuchTFCategoryException"%>
<liferay-ui:tabs names="error" backURL="javascript: history.go(-1);" />

<liferay-ui:error exception="<%= NoSuchTFCategoryException.class %>" message="the-category-could-not-be-found" />
<liferay-ui:error exception="<%= NoSuchTFImageException.class %>" message="the-image-could-not-be-found" />
<liferay-ui:error exception="<%= DeleteCategoryException.class %>" message="you-must-delete-image-before-delete-category" />

