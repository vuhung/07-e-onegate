<%@ include file="/html/portlet/vcalendar/init.jsp" %>
<table width="100%" border="0" cellspacing="0" cellpadding="0">
<%
String tabs1 = ParamUtil.getString(request, "tabs1", "day");
int status = 1;
%> 
  <tr>
    <td>
	  <liferay-ui:tabs
	names="day,week,month,year"
	url="<%= leaderURL.toString() %>"
	param="tabs1"
	/>
	<c:choose>
		<c:when test='<%= tabs1.equals("day") %>'>
			<%@ include file="/html/portlet/vcalendar/leader/day.jsp" %>
		</c:when>
		<c:when test='<%= tabs1.equals("week") %>'>
			<%@ include file="/html/portlet/vcalendar/leader/week.jsp" %>
		</c:when>
		<c:when test='<%= tabs1.equals("month") %>'>
			<%@ include file="/html/portlet/vcalendar/leader/month.jsp" %>
		</c:when>
		<c:when test='<%= tabs1.equals("year") %>'>
			<%@ include file="/html/portlet/vcalendar/leader/year.jsp" %>
		</c:when>
	</c:choose>
	</td>
	</tr>
</table>