
<%@page import="com.vportal.portlet.pollsadmin.action.WebKeys"%>
<%@page import="com.vportal.portlet.pollsadmin.model.PollsQuestion"%>
<%@ include file="/html/portlet/pollsadmin/init.jsp" %>

<%
ResultRow row = (ResultRow)request.getAttribute(WebKeys.SEARCH_CONTAINER_RESULT_ROW);

PollsQuestion question = (PollsQuestion)row.getObject();
%>

<liferay-ui:icon-menu>
	
		<portlet:actionURL   name="editquestion" var="editURL">
			<portlet:param name="questionId" value="<%= String.valueOf(question.getQuestionId()) %>" />
		</portlet:actionURL>

		<liferay-ui:icon image="edit" url="<%= editURL %>" />

		<portlet:actionURL name="delete" var="deleteURL">
			<portlet:param name="questionId" value="<%= String.valueOf(question.getQuestionId()) %>" />
		</portlet:actionURL>

		<liferay-ui:icon-delete url="<%= deleteURL %>" />
</liferay-ui:icon-menu>