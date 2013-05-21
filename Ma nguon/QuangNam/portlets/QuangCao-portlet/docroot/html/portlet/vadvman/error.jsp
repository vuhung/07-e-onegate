<%@page import="com.vportal.portlet.vadvman.DeleteTypeException"%>
<%@page import="com.liferay.portal.security.auth.PrincipalException"%>
<%@page import="com.vportal.portlet.vadvman.NoSuchAdvTypeException"%>
<%@page import="com.vportal.portlet.vadvman.NoSuchAdvItemException"%>
<%
/**
 * Copyright (c) VietSoftware, Inc. All rights reserved.
 *
 */
%>

<%@ include file="/html/portlet/vadvman/init.jsp" %>

<liferay-ui:tabs names="error" backURL="javascript: history.go(-1);" />

<liferay-ui:error exception="<%= NoSuchAdvItemException.class %>" message="the-item-could-not-be-found" />
<liferay-ui:error exception="<%= NoSuchAdvTypeException.class %>" message="the-type-could-not-be-found" />
<liferay-ui:error exception="<%= PrincipalException.class %>" message="you-do-not-have-the-required-permissions" />
<liferay-ui:error exception="<%= DeleteTypeException.class %>" message="you-must-delete-item-before-delete-type" />
	
	