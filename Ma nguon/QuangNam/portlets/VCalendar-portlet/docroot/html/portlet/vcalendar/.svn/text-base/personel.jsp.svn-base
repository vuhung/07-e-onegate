<%
String tabs1 = ParamUtil.getString(request, "tabs1", "day");
int status = 0;
%>
<liferay-ui:tabs
	names="day,week,month,year"
	url="<%= personelURL.toString() %>"
	param="tabs1"
/>
<c:choose>
	<c:when test='<%= tabs1.equals("day") %>'>
		<%@ include file="/html/portlet/vcalendar/personel/day.jsp" %>
	</c:when>
	<c:when test='<%= tabs1.equals("week") %>'>
		<%@ include file="/html/portlet/vcalendar/personel/week.jsp" %>
	</c:when>
	<c:when test='<%= tabs1.equals("month") %>'>
		<%@ include file="/html/portlet/vcalendar/personel/month.jsp" %>
	</c:when>
	<c:when test='<%= tabs1.equals("year") %>'>
		<%@ include file="/html/portlet/vcalendar/personel/year.jsp" %>
	</c:when>
</c:choose>