<%
	String tabs2Names = "portlet.vdoc.general-manage.orgs-tab,portlet.vdoc.general-manage.fields-tab";
%>

<liferay-ui:tabs names="<%= tabs2Names %>" param="tabs2" url="<%= portletURL.toString() %>" />
<c:choose>
	<c:when test='<%= tabs2.equals("portlet.vdoc.general-manage.fields-tab") %>'>
		<%@include file="/html/vdoc_manage/general_manage/view_field.jsp" %>
	</c:when>
		
	<c:otherwise>
		<%@include file="/html/vdoc_manage/general_manage/view_org.jsp" %>
	</c:otherwise>
</c:choose>