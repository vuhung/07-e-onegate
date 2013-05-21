<%@page import="com.liferay.portal.kernel.language.LanguageUtil"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<%@ include file="/html/vdoc_manage/init.jsp" %>

<%
ResultRow row = (ResultRow) request.getAttribute( WebKeys.SEARCH_CONTAINER_RESULT_ROW);
vdocField field  = (vdocField) row.getObject();
// long groupId = themeDisplay.getScopeGroupId();
String name = vdocField.class.getName();
String primKey = String.valueOf(field.getPrimaryKey());
%>

<liferay-ui:icon-menu message='<%=LanguageUtil.get(pageContext, "portlet.vdoc.general-manage.actions") %>'>

	<c:if test='<%= PortletPermissionUtil.contains(permissionChecker, portletDisplay.getId(), ActionKeys.UPDATE) %>'>
	<portlet:renderURL windowState="normal" var="editFieldURL">
		<portlet:param name="fieldId" value="<%= primKey %>"></portlet:param>
		<portlet:param name="jspPage" value="/html/vdoc_manage/general_manage/edit_field.jsp"></portlet:param>
	</portlet:renderURL>

    <liferay-ui:icon image="edit" message='<%=LanguageUtil.get(pageContext, "portlet.vdoc.general-manage.update") %>' url="<%= editFieldURL.toString() %>" />
  </c:if>

  <c:if test='<%= PortletPermissionUtil.contains(permissionChecker, portletDisplay.getId(), ActionKeys.DELETE) %>'>
    <portlet:actionURL name="deleteField" var="deleteFieldURL">
      <portlet:param name="fieldId" value="<%= primKey %>" />
    </portlet:actionURL>

    <liferay-ui:icon image="delete" message='<%=LanguageUtil.get(pageContext, "portlet.vdoc.general-manage.delete") %>'  url="<%= deleteFieldURL.toString() %>" />
  </c:if>

  <c:if test='<%= PortletPermissionUtil.contains(permissionChecker, portletDisplay.getId(), ActionKeys.PERMISSIONS) %>'>
    <liferay-security:permissionsURL
        modelResource="<%= vdocField.class.getName() %>"
        modelResourceDescription="<%= field.getName() %>"
        resourcePrimKey="<%= primKey %>"
        var="permissionsURL" />

    <liferay-ui:icon image="permissions" message='<%=LanguageUtil.get(pageContext, "portlet.vdoc.general-manage.permissions") %>' url="<%= permissionsURL.toString() %>" />
  </c:if>
</liferay-ui:icon-menu>





