
<%@page import="com.test.model.AdvType"%>
<%@page import="com.liferay.portal.kernel.util.WebKeys"%>
<%@page import="com.liferay.portal.kernel.dao.search.ResultRow"%>
<%@taglib prefix="liferay-ui" uri="http://liferay.com/tld/ui"%>
<%@page import="com.liferay.portal.util.PortalUtil"%>
<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>
<%
	ResultRow row = (ResultRow) request.getAttribute(WebKeys.SEARCH_CONTAINER_RESULT_ROW);	
	AdvType type = (AdvType) row.getObject();
	String  key=Long.toString(type.getTypeId());
%>
<liferay-ui:icon-menu>
  <portlet:actionURL  name="type_Edit" var="edit_">
  <portlet:param name="typeId" value="<%=key %>"></portlet:param>
  
  </portlet:actionURL>
  <liferay-ui:icon image="edit" message="viewTypeEdit" url="<%=edit_.toString() %>"/>
  <portlet:actionURL name="type_Delete" var="delete_">
		<portlet:param name="typeId" value="<%=key %>"></portlet:param>
		
	</portlet:actionURL>
	<liferay-ui:icon-delete   url="<%=delete_.toString() %>"/>
</liferay-ui:icon-menu>
