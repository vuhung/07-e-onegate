
<%@page import="com.liferay.portal.kernel.language.LanguageUtil"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<%@ include file="/init.jsp" %>

<%
ResultRow row = (ResultRow) request.getAttribute( WebKeys.SEARCH_CONTAINER_RESULT_ROW);
AdvItem item = (AdvItem) row.getObject();
long groupId = themeDisplay.getScopeGroupId();
String name = AdvType.class.getName();
String primKey = String.valueOf(item.getPrimaryKey());
%>

<liferay-ui:icon-menu message='<%=LanguageUtil.get(pageContext, "actions","Tac vu") %>'>

  <c:if test="<%= permissionChecker.hasPermission(groupId, name, primKey, ActionKeys.UPDATE) %>">
	<portlet:renderURL windowState="normal" var="editItemURL">
		<portlet:param name="itemId" value="<%= primKey %>"></portlet:param>
		<portlet:param name="jspPage" value="/html/manage_adv/manage_advItem/edit_item.jsp"></portlet:param>
	</portlet:renderURL>

    <liferay-ui:icon image="edit" message='<%=LanguageUtil.get(pageContext, "actions.edit","Sua") %>' url="<%= editItemURL.toString() %>" />
  </c:if>

  <c:if test="<%= permissionChecker.hasPermission(groupId, name, primKey, ActionKeys.DELETE) %>">
    <portlet:actionURL name="deleteItem" var="deleteItemURL">
      <portlet:param name="itemId" value="<%= primKey %>" />
    </portlet:actionURL>

    <liferay-ui:icon image="delete" message='<%=LanguageUtil.get(pageContext, "actions.delete","Xoa") %>'  url="<%= deleteItemURL.toString() %>" />
  </c:if>

  <c:if test="<%= permissionChecker.hasPermission(groupId, name, primKey, ActionKeys.PERMISSIONS) %>">
    <liferay-security:permissionsURL
        modelResource="<%= AdvItem.class.getName() %>"
        modelResourceDescription="<%= item.getName() %>"
        resourcePrimKey="<%= primKey %>"
        var="permissionsURL" />

    <liferay-ui:icon image="permissions" message='<%=LanguageUtil.get(pageContext, "actions.permissions","Phan quyen") %>' url="<%= permissionsURL.toString() %>" />
  </c:if>
</liferay-ui:icon-menu>





