

<%@ include file="/html/portlet/vfile/tabs.jsp" %>

<%
    String redirect = ParamUtil.getString(request, "redirect");
	String fileId = ParamUtil.getString(request, "fileId","0");
	String cmd = ParamUtil.getString(request,Constants.CMD,Constants.ADD);
	Calendar currentDate = new GregorianCalendar();
	VFile vfile=null;
	try{
	if(!fileId.equals("0")){
	  vfile=VFileServiceUtil.findById(Long.parseLong(fileId));
	  }
	}catch(Exception e){
	}
%>
<script type="text/javascript" >
	function <portlet:namespace />saveEvent(){
		submitForm(document.<portlet:namespace />fm, '<portlet:actionURL windowState="<%=WindowState.MAXIMIZED.toString()%>" name="addVFile"></portlet:actionURL>');
	}
</script>



<form  action="<portlet:actionURL windowState="<%= WindowState.MAXIMIZED.toString() %>"><portlet:param name="struts_action" value="/vcalendar/edit_file" /></portlet:actionURL>" method="post" name="<portlet:namespace />fm" onSubmit="<portlet:namespace />saveEvent(); return false;">
<input name="<portlet:namespace /><%= Constants.CMD %>" type="hidden" value="<%= cmd%>" />
<input name="<portlet:namespace />redirect" type="hidden" value="<%= redirect %>" />
<input name="<portlet:namespace />fileId" type="hidden" value="<%= fileId %>" />

<liferay-ui:tabs
	names="event"
	backURL="<%= redirect %>"
/>
<table cellpadding="0" cellspacing="0" border="0" width="100%">
<tr >
	<td >
		<liferay-ui:message key="title" />
	</td>
	<td>
	    <input id="<portlet:namespace />title" name="<portlet:namespace />fullname" style="width: 350px;" value="<%=(vfile!=null)?vfile.getFullname():""%>" type="text">
	</td>
</tr>
<tr>
 <td height="3px;">
 </td>
 </tr>
<tr>
    <td>
		Ng&#224;y sinh
	</td>
	<td>
	    <liferay-ui:input-date
				disableNamespace="<%= false %>"
				monthParam="dateMonth"
				monthValue="<%= currentDate.get(Calendar.MONTH) %>"
				dayParam="dateDay"
				dayValue="<%= currentDate.get(Calendar.DATE) %>"
				yearParam="dateYear"
				yearValue="<%=currentDate.get(Calendar.YEAR) %>"
				yearRangeStart="<%= curYear-10 %>"
				yearRangeEnd="<%= curYear+10 %>"
				firstDayOfWeek="<%= currentDate.getFirstDayOfWeek() - 1 %>"
				disabled="<%= false %>"
			/>
	
	</td>
</tr>
<tr>
 <td height="3px;">
 </td>
 </tr>
<tr>
	<td>
		&#272;&#7883;a ch&#7881;
	</td>
	<td>
	    <input id="<portlet:namespace />address" name="<portlet:namespace />address" style="width: 350px;" value="<%=(vfile!=null)?vfile.getAddress():""%>" type="text">
	</td>
</tr>
<tr>
 <td height="3px;">
 </td>
 </tr>
<tr>
	<td>
		&#272;i&#7879;n tho&#7841;i
	</td>
	<td>
	    <input id="<portlet:namespace />title" name="<portlet:namespace />phone" style="width: 350px;" value="<%=(vfile!=null)?vfile.getPhone():""%>" type="text">
	</td>
</tr>
<tr>
 <td height="3px;">
 </td>
 </tr>
<tr>
	<td>
		Ch&#7913;c v&#7909;
	</td>
	<td>
	    <input id="<portlet:namespace />title" name="<portlet:namespace />position" style="width: 350px;" value="<%=(vfile!=null)?vfile.getPosition():""%>" type="text">
	</td>
</tr>
<tr>
 <td colspan="2">
<br />

<input type="submit" onsubmit="<portlet:namespace />saveEvent();" value="<liferay-ui:message key="save"  />" />

<input type="reset" value="<liferay-ui:message key="cancel" />" />
</td>
</tr>
</table>

</form>