<%@ page import="com.liferay.portal.kernel.util.WebKeys" %>
<%@ include file="/html/portlet/vsitemap/init.jsp" %>
<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>
<%@ taglib  uri="http://liferay.com/tld/ui"  prefix="liferay-ui" %>
<%@ taglib prefix="liferay-security" uri="http://liferay.com/tld/security" %>


<%	
	ResultRow row = (ResultRow) request.getAttribute(WebKeys.SEARCH_CONTAINER_RESULT_ROW);	
	VsmBranch vsmBranch = (VsmBranch)row.getObject();	
%>

<liferay-ui:icon-menu>
	<!-- Edit Branch -->
	
		<portlet:renderURL windowState="<%= WindowState.MAXIMIZED.toString() %>" var="editURL">
			<portlet:param name="jspPage" value="/html/portlet/vsitemap/edit_branch.jsp" />
			<portlet:param name="cmd" value="doupdate" />
			<portlet:param name="redirect" value="<%= currentURL %>" />
			<portlet:param name="id" value="<%= Long.toString(vsmBranch.getBranchId()) %>" />
		</portlet:renderURL>
		<liferay-ui:icon image="edit" url="<%= editURL %>" />
	
<!-- 	<!-- Permissions -->
		
<%-- 		<liferay-security:permissionsURL --%>
<%-- 			modelResource="<%= VsmBranch.class.getName() %>" --%>
<%-- 			modelResourceDescription="<%= vsmBranch.getName() %>" --%>
<%-- 			resourcePrimKey="<%= String.valueOf(vsmBranch.getBranchId()) %>" --%>
<%-- 			var="permissionsURL"/> --%>
	

	<!-- Delete branch -->

		<portlet:actionURL  name="doRemoveBranch" var="doRemoveBranchURL">
			<portlet:param name="ids" value="<%= Long.toString(vsmBranch.getBranchId()) %>" />
		</portlet:actionURL>
		<liferay-ui:icon-delete url="<%= doRemoveBranchURL %>" />
		
</liferay-ui:icon-menu>