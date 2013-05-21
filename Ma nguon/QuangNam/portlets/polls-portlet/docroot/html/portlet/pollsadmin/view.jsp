
<%@page import="com.vportal.portlet.pollsadmin.service.PollsVoteLocalServiceUtil"%>
<%@page import="com.vportal.portlet.pollsadmin.model.PollsQuestion"%>
<%@page import="com.vportal.portlet.pollsadmin.service.PollsQuestionLocalServiceUtil"%>
<%@page import="com.vportal.portlet.pollsadmin.model.PollsQuestion"%>
<%@include file="/html/portlet/pollsadmin/init.jsp" %>



<form method="post" name="<portlet:namespace />fm">

<%
PortletURL portletURL = renderResponse.createRenderURL();

portletURL.setWindowState(WindowState.MAXIMIZED);

portletURL.setParameter("jspPage", "/html/portlet/pollsadmin/edit_question.jsp");

%>

	<div>
		<input type="button" value="<liferay-ui:message key="add-question" />" ONCLICK="window.location.href='<%=portletURL.toString()%>'" />
	</div>


<liferay-ui:search-container emptyResultsMessage="chua co du lieu" delta="4">
	<liferay-ui:search-container-results >
	<% 
	
	
	List list = PollsQuestionLocalServiceUtil.getQuestions(10157);
// 	int documents = VLegalDocumentServiceUtil.getDocByG_L_T(groupId, language, type.getTypeId()).size();
		List sublist = ListUtil.subList(list, searchContainer.getStart(), searchContainer.getEnd());
		pageContext.setAttribute("results", sublist);
		pageContext.setAttribute("total", list.size());
		
		
	%>
	</liferay-ui:search-container-results>
	<liferay-ui:search-container-row className="PollsQuestion"  modelVar="vc">
<%
PortletURL rowURL = renderResponse.createRenderURL();

rowURL.setWindowState(WindowState.MAXIMIZED);

rowURL.setParameter("struts_action", "/polls/view_question");
rowURL.setParameter("questionId", String.valueOf(vc.getQuestionId()));
PortletURL d = renderResponse.createRenderURL();
d.setParameter("jspPage", "/html/portlet/vlegal/manage/type/type_edit.jsp?typeid="+vc.getQuestionId());

StringBuffer sb = new StringBuffer();
sb.append("<a style= \"text-decoration:none\" href=\"" + d.toString() + "\">"  + vc.getQuestionId() + "</a>");

int votesCount = PollsVoteLocalServiceUtil.getQuestionVotesCount(vc.getQuestionId());
String LastVoteDate = null;
if (vc.getLastVoteDate() == null) {
	LastVoteDate = LanguageUtil.get(pageContext,"never") ;
}
else {
	LastVoteDate = dateFormatDateTime.format(vc.getLastVoteDate());
}

// Expiration date
String ExpirationDate = null;
if (vc.getExpirationDate() == null) {
	ExpirationDate =   LanguageUtil.get(pageContext,"never") ;
}
else {
	ExpirationDate = dateFormatDateTime.format(vc.getExpirationDate());
}


%>
		    <liferay-ui:search-container-column-text name="question"  value='<%=vc.getDescription()%>'/>
			<liferay-ui:search-container-column-text name="num-of-votes"  value='<%=String.valueOf(votesCount)%>'/>
			<liferay-ui:search-container-column-text name="last-vote-date"  value='<%=LastVoteDate%>'/>
			<liferay-ui:search-container-column-text name="expiration-date"  value='<%=ExpirationDate%>'/>

            <liferay-ui:search-container-column-jsp path="/html/portlet/pollsadmin/question_action.jsp"/>
	</liferay-ui:search-container-row>	
	<liferay-ui:search-iterator />
	
</liferay-ui:search-container>
</form>