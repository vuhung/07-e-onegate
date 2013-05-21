<%@include file="/init.jsp" %>

<%
ResultRow row = (ResultRow) request.getAttribute(
    WebKeys.SEARCH_CONTAINER_RESULT_ROW);
LinkGroup myLinkGroup = (LinkGroup)row.getObject();
long groupId = themeDisplay.getLayout().getGroupId();
String name = LinkGroup.class.getName();
String primKey = String.valueOf(myLinkGroup.getPrimaryKey());
%>

<liferay-ui:icon-menu>
 
    <portlet:actionURL name="editLinkGroup" var="editURL">
      <portlet:param name="resourcePrimKey" value="<%= primKey %>" />
    </portlet:actionURL>

    <liferay-ui:icon image="edit" message="Edit" url="<%= editURL.toString() %>" />
  
    <portlet:actionURL name="deleteLinkGroup" var="deleteURL">
      <portlet:param name="resourcePrimKey" value="<%= primKey %>" />
    </portlet:actionURL>

    <liferay-ui:icon-delete url="<%= deleteURL.toString() %>" />   
 
</liferay-ui:icon-menu>