<%@include file="/init.jsp" %>
<%@page contentType="text/html; charset=UTF-8"%>
<%
ResultRow row = (ResultRow) request.getAttribute(
    WebKeys.SEARCH_CONTAINER_RESULT_ROW);
Links myLinks= (Links)row.getObject();
long groupId = themeDisplay.getLayout().getGroupId();
String name = Links.class.getName();
String primKey = String.valueOf(myLinks.getPrimaryKey());
%>

<liferay-ui:icon-menu>
 
    <portlet:actionURL name="editLink" var="editURL">
      <portlet:param name="resourcePrimKey" value="<%= primKey %>" />
    </portlet:actionURL>

    <liferay-ui:icon image="edit" message="Edit" url="<%= editURL.toString() %>" />
  
    <portlet:actionURL name="deleteLink" var="deleteURL">
      <portlet:param name="resourcePrimKey" value="<%= primKey %>" />
    </portlet:actionURL>
    <liferay-ui:icon-delete url="<%= deleteURL.toString() %>"/> 
 
</liferay-ui:icon-menu>