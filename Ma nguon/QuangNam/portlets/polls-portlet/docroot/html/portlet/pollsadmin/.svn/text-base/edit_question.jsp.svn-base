<%@page import="javax.portlet.ActionRequest"%>
<%@page import="com.vportal.portlet.pollsadmin.action.WebKeys"%>
<%@page import="com.vportal.portlet.pollsadmin.action.EditQuestionAction"%>
<%@page import="com.vportal.portlet.pollsadmin.model.PollsChoice"%>
<%@page import="com.vportal.portlet.pollsadmin.service.PollsChoiceLocalServiceUtil"%>
<%@page import="com.liferay.portal.kernel.util.CalendarFactoryUtil"%>
<%@page import="java.util.Calendar"%>
<%@page import="com.liferay.portal.kernel.bean.BeanParamUtil"%>
<%@page import="com.liferay.portal.kernel.util.ParamUtil"%>
<%@page import="com.vportal.portlet.pollsadmin.model.PollsQuestion"%>

<%@include file="/html/portlet/pollsadmin/init.jsp"  %>
<%
PortletURL portletadd = renderResponse.createActionURL();
portletadd.setParameter(ActionRequest.ACTION_NAME, "addnew");

String redirect = ParamUtil.getString(request, "redirect");

PollsQuestion question = (PollsQuestion)request.getAttribute(WebKeys.POLLS_QUESTION);

long questionId = BeanParamUtil.getLong(question, request, "questionId");

boolean neverExpire = ParamUtil.getBoolean(request, "neverExpire", true);

Calendar expirationDate = CalendarFactoryUtil.getCalendar(timeZone, locale);

expirationDate.add(Calendar.MONTH, 1);

if (question != null) {
	if (question.getExpirationDate() != null) {
		neverExpire = false;

		expirationDate.setTime(question.getExpirationDate());
	}
}

List choices = new ArrayList();

int oldChoicesCount = 0;

if (question != null) {
	choices = PollsChoiceLocalServiceUtil.getChoices(questionId);

	oldChoicesCount = choices.size();
}

int choicesCount = ParamUtil.getInteger(request, "choicesCount", choices.size());

if (choicesCount < 2) {
	choicesCount = 2;
}

int choiceName = ParamUtil.getInteger(request, "choiceName");

boolean deleteChoice = false;

if (choiceName > 0) {
	deleteChoice = true;
}
%>

<script type="text/javascript">
	function <portlet:namespace />disableInputDate(date, checked) {
		eval("document.<portlet:namespace />fm.<portlet:namespace />" + date + "Month.disabled = " + checked + ";");
		eval("document.<portlet:namespace />fm.<portlet:namespace />" + date + "Day.disabled = " + checked + ";");
		eval("document.<portlet:namespace />fm.<portlet:namespace />" + date + "Year.disabled = " + checked + ";");
		eval("document.<portlet:namespace />fm.<portlet:namespace />" + date + "Hour.disabled = " + checked + ";");
		eval("document.<portlet:namespace />fm.<portlet:namespace />" + date + "Minute.disabled = " + checked + ";");
		eval("document.<portlet:namespace />fm.<portlet:namespace />" + date + "AmPm.disabled = " + checked + ";");
	}

	function <portlet:namespace />saveQuestion() {
		document.<portlet:namespace />fm.<portlet:namespace /><%= Constants.CMD %>.value = "<%= question == null ? Constants.ADD : Constants.UPDATE %>";
		submitForm(document.<portlet:namespace />fm);
	}
</script>

<form action="<%=portletadd.toString()%>" method="post" name="<portlet:namespace />fm">
<input name="<portlet:namespace /><%= Constants.CMD %>" type="hidden" value="" />
<input name="<portlet:namespace />redirect" type="hidden" value="<%= HtmlUtil.escape(redirect) %>" />
<input name="<portlet:namespace />questionId" type="hidden" value="<%= questionId %>" />
<input name="<portlet:namespace />choicesCount" type="hidden" value="<%= choicesCount %>" />
<input name="<portlet:namespace />choiceName" type="hidden" value="" />

<liferay-ui:tabs
	names="question"
	backURL="<%= redirect %>"
/>

<liferay-ui:error exception="<%= QuestionChoiceException.class %>" message="please-enter-valid-choices" />
<liferay-ui:error exception="<%= QuestionDescriptionException.class %>" message="please-enter-a-valid-description" />
<liferay-ui:error exception="<%= QuestionExpirationDateException.class %>" message="please-enter-a-valid-expiration-date" />
<liferay-ui:error exception="<%= QuestionTitleException.class %>" message="please-enter-a-valid-title" />

<table class="lfr-table">
<tr>
	<td>
		<liferay-ui:message key="title" />
	</td>
	<td>
		<liferay-ui:input-field model="<%= PollsQuestion.class %>" bean="<%= question %>" field="title" />
	</td>
</tr>
<tr>
	<td>
		<liferay-ui:message key="description" />
	</td>
	<td>
		<liferay-ui:input-field model="<%= PollsQuestion.class %>" bean="<%= question %>" field="description" />
	</td>
</tr>
<tr>
	<td colspan="2">
		<br />
	</td>
</tr>
<tr>
	<td>
		<liferay-ui:message key="expiration-date" />
	</td>
	<td>
		<table class="lfr-table">
		<tr>
			<td>
				<liferay-ui:input-field model="<%= PollsQuestion.class %>" bean="<%= question %>" field="expirationDate" defaultValue="<%= expirationDate %>" disabled="<%= neverExpire %>" />
			</td>
			<td>
				<liferay-ui:input-checkbox param="neverExpire" defaultValue="<%= neverExpire %>" onClick='<%= renderResponse.getNamespace() + "disableInputDate(\'expirationDate\', this.checked);" %>' />

				<liferay-ui:message key="never-expire" />
			</td>
		</tr>
		</table>
	</td>
</tr>
<tr>
	<td colspan="2">
		<br />
	</td>
</tr>
<tr>
	<td>
		<liferay-ui:message key="choices" />
	</td>
	<td>
		<table class="lfr-table">
		<tr>
			<td>
				<table class="lfr-table">

				<%
				for (int i = 1; i <= choicesCount; i++) {
					char c = (char)(96 + i);

					String choiceDesc = null;

					if (deleteChoice) {
						if (i < choiceName) {
							choiceDesc = ParamUtil.getString(request, EditQuestionAction.CHOICE_DESCRIPTION_PREFIX + c);
						}
						else {
							choiceDesc = ParamUtil.getString(request, EditQuestionAction.CHOICE_DESCRIPTION_PREFIX + ((char)(96 + i + 1)));
						}
					}
					else {
						choiceDesc = ParamUtil.getString(request, EditQuestionAction.CHOICE_DESCRIPTION_PREFIX + c);
					}

					if (Validator.isNull(choiceDesc)) {
						if (question != null) {
							if (i - 1 < choices.size()) {
								PollsChoice choice = (PollsChoice)choices.get(i - 1);

								choiceDesc = choice.getDescription();
							}
						}
					}
				%>

					<tr>
						<td>
							<%= c %>.
						</td>
						<td>
							<input name="<portlet:namespace /><%= EditQuestionAction.CHOICE_NAME_PREFIX %><%= c %>" type="hidden" value="<%= c %>" />

							<liferay-ui:input-field model="<%= PollsChoice.class %>" field="description" fieldParam="<%= EditQuestionAction.CHOICE_DESCRIPTION_PREFIX + c %>" defaultValue="<%= choiceDesc %>" />
						</td>

						<c:if test="<%= ((question == null) && (i > 2)) || ((question != null) && (i > oldChoicesCount)) %>">
							<td>
								<input type="button" value="<liferay-ui:message key="delete" />" onClick="document.<portlet:namespace />fm.<portlet:namespace />choicesCount.value = '<%= choicesCount - 1 %>'; document.<portlet:namespace />fm.<portlet:namespace />choiceName.value = '<%= i %>'; submitForm(document.<portlet:namespace />fm);" />
							</td>
						</c:if>

					</tr>

				<%
				}
				%>

				</table>
			</td>
			<td valign="bottom">
				<input type="button" value="<liferay-ui:message key="add-choice" />" onClick="document.<portlet:namespace />fm.<portlet:namespace />choicesCount.value = '<%= choicesCount + 1 %>'; submitForm(document.<portlet:namespace />fm);" />
			</td>
		</tr>
		</table>
	</td>
</tr>

<c:if test="<%= question == null %>">
	<tr>
		<td colspan="2">
			<br />
		</td>
	</tr>
	<tr>
		<td>
			<liferay-ui:message key="permissions" />
		</td>
		<td>
			<liferay-ui:input-permissions
				modelName="<%= PollsQuestion.class.getName() %>"
			/>
		</td>
	</tr>
</c:if>

</table>

<br />

<input type="submit" value="<liferay-ui:message key="save" />" />

<input type="button" value="<liferay-ui:message key="cancel" />" onClick="history.back();" />

</form>

<c:if test="<%= windowState.equals(WindowState.MAXIMIZED) %>">
	<script type="text/javascript">
		Liferay.Util.focusFormField(document.<portlet:namespace />fm.<portlet:namespace />title);
	</script>
</c:if>