<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="/html/weather/init.jsp"%>
<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet"%>
<%@ include file="/init.jsp"%>
<portlet:actionURL name="processDisplayStyle" var="processDisplayStyleURL" />
<portlet:defineObjects />


<aui:form action="<%=processDisplayStyleURL.toString()%>" method="post">
	<input name="<portlet:namespace />cmd" type="hidden" value="update">

	<fieldset>
		<legend>
			<b>Cấu Hình Kiểu Hiển Thị</b>
		</legend>
		<table>
			<tr>
				<td width="100">Thời Tiết :</td>
				<td><input type="radio" name="<portlet:namespace/>displayStyle"
					value="1" <%=displayStyle.equals("1") ? "checked" : ""%> /></td>
			</tr>
			<tr>
				<td>Vàng:</td>
				<td><input type="radio" name="<portlet:namespace/>displayStyle"
					value="2" <%=displayStyle.equals("2") ? "checked" : ""%> /></td>
			</tr>
			<tr>
				<td>Ngoại Tệ:</td>
				<td><input type="radio" name="<portlet:namespace/>displayStyle"
					value="3" <%=displayStyle.equals("3") ? "checked" : ""%> /></td>
			</tr>
			<tr>
				<td colspan="2" height="5"></td>
			</tr>
		</table>
		<aui:button-row>
			<aui:button type="submit" />
		</aui:button-row>

	</fieldset>

</aui:form>
