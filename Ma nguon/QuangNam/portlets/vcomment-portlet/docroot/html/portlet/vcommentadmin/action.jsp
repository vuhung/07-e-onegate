<%@page import="com.liferay.portal.kernel.util.WebKeys"%>
<%@ include file="init.jsp" %>

<%	
	ResultRow row = (ResultRow) request.getAttribute(WebKeys.SEARCH_CONTAINER_RESULT_ROW);
	VComment bean = (VComment) row.getObject();
%>

<liferay-ui:icon-menu>
	<!-- Edit -->
   <c:if test="<%=status == 1 %>">
		<portlet:actionURL name="_update" var="editURL">
			<portlet:param name="allRowIds" value="<%= String.valueOf(bean.getId())%>" />
			<portlet:param name="statuss" value="<%= Integer.toString(status)%>" />
		</portlet:actionURL> 
		<liferay-ui:icon image='cancel-approve' url="<%=editURL%>" />	
</c:if>
<c:if test="<%=status == 0 %>">
		<portlet:actionURL name="_update" var="editURL">
			<portlet:param name="allRowIds" value="<%= String.valueOf(bean.getId())%>" />
			<portlet:param name="statuss" value="<%= Integer.toString(status)%>" />
		</portlet:actionURL> 
		<liferay-ui:icon image="processed" url="<%=editURL%>" />	
</c:if>

	<!-- Delete -->
	
	
		<portlet:actionURL name="delete_logger" var="deleteURL">>
			<portlet:param name="allRowIds" value="<%= Long.toString(bean.getId())%>" />
			<portlet:param name="statuss" value="<%= Integer.toString(status)%>" />
		</portlet:actionURL>
		<liferay-ui:icon image="delete" url="<%=deleteURL%>" />	
	

</liferay-ui:icon-menu>

