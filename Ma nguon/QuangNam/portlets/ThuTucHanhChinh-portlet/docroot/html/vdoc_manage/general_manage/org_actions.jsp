<%@page import="com.liferay.portal.kernel.language.LanguageUtil"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<%@ include file="/html/vdoc_manage/init.jsp" %>

<%
	ResultRow row = (ResultRow) request.getAttribute( WebKeys.SEARCH_CONTAINER_RESULT_ROW);
	vdocOrg org  = (vdocOrg) row.getObject();
	String name = vdocOrg.class.getName();
	String primKey = String.valueOf(org.getPrimaryKey());
%>

<liferay-ui:icon-menu message='<%=LanguageUtil.get(pageContext, "portlet.vdoc.general-manage.actions") %>'>

	<c:if test='<%= PortletPermissionUtil.contains(permissionChecker, portletDisplay.getId(), ActionKeys.UPDATE) %>'>
	<portlet:renderURL windowState="normal" var="editOrgURL">
		<portlet:param name="orgId" value="<%= primKey %>"></portlet:param>
		<portlet:param name="jspPage" value="/html/vdoc_manage/general_manage/edit_org.jsp"></portlet:param>
	</portlet:renderURL>

    <liferay-ui:icon image="edit" message='<%=LanguageUtil.get(pageContext, "portlet.vdoc.general-manage.update") %>' url="<%= editOrgURL.toString() %>" />
  </c:if>

  <c:if test='<%= PortletPermissionUtil.contains(permissionChecker, portletDisplay.getId(), ActionKeys.DELETE) %>'>
    <portlet:actionURL name="deleteOrg" var="deleteOrgURL">
      <portlet:param name="orgId" value="<%= primKey %>" />
    </portlet:actionURL>

    <liferay-ui:icon image="delete" message='<%=LanguageUtil.get(pageContext, "portlet.vdoc.general-manage.delete") %>'  url="<%= deleteOrgURL.toString() %>" />
  </c:if>

  <c:if test='<%= PortletPermissionUtil.contains(permissionChecker, portletDisplay.getId(), ActionKeys.PERMISSIONS) %>'>
    <liferay-security:permissionsURL
        modelResource="<%= vdocOrg.class.getName() %>"
        modelResourceDescription="<%= org.getName() %>"
        resourcePrimKey="<%= primKey %>"
        var="permissionsURL" />

    <liferay-ui:icon image="permissions" message='<%=LanguageUtil.get(pageContext, "portlet.vdoc.general-manage.permissions") %>' url="<%= permissionsURL.toString() %>" />
  </c:if>
</liferay-ui:icon-menu>





