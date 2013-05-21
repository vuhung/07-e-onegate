<%@page import="com.liferay.portal.kernel.language.LanguageUtil" %>
<%@ include file="/init.jsp" %>

<portlet:defineObjects/>
<%	
	PortletPreferences prefs1 = renderRequest.getPreferences();
	int maxAttachmentDocument1 = GetterUtil.getInteger(prefs1.getValue("numberFile", "5"));
%>

<portlet:actionURL name="editConfig" var="editConfigURL" />

<form name="<portlet:namespace />fm1" method="post" action="<%= editConfigURL %>">	
<!-- 		<input type="submit" value="Save1"/>												 -->
</form>

<form name="<portlet:namespace />fm2" method="post" action="<%=editConfigURL %>">
	<table width="50%" border="0" cellspacing="1" cellpadding="4">
	<tr>
		<td>S&#7889; t&#7853;p tin &#273;ính kèm th&#7911; t&#7909;c</td>
		<td>
			<select name="<portlet:namespace />numberFile">
				<%for(int i=1;i<=10;i++){%>
					<option value="<%=i%>" <%= (maxAttachmentDocument1 == i) ? "selected" : "" %>><%=i%></option>
				<%}%>						
			</select></td>
	</tr>
	</table>
					
	<br/>
	<div align="center">
	<input type="submit" value="Save"  />
	</div>
</form>

