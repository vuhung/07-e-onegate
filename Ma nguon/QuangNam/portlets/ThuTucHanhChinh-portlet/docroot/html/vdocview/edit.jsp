<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>
<%@ include file="/html/vdocview/init.jsp" %>
<portlet:defineObjects />

<%
	
%>
	
<portlet:actionURL  name= "viewVDoc" var="viewVDocURL"></portlet:actionURL>

<form  action="<%= viewVDocURL.toString() %>" name="fm" method="POST">	

<table  width="100%" cellspacing="1" cellpadding="4" border="0" >	
<tr>
	<td width="100%" valign="top">		
		<fieldset style="border:1px dotted gray;">
		<legend><strong>C&#7845;u hình Portlet</strong></legend>
		<table  class="lfr-table">	
		<tr height="30">
			<td><b>Tùy bi&#7871;n tiêu &#273;&#7873; :</b></td>
			<td><input type="text" name="<portlet:namespace/>titlePortlet" value="<%=titlePortlet%>" style="width:180px;"></td>
		</tr>
					
		<tr height="30">
			<td><b>S&#7889; &#273;&#7883;a ch&#7881; hi&#7875;n th&#7883; trên PORTLET</b></td>
			<td>
				<select name="<portlet:namespace/>numberItem">
					<%for(int i =10;i<30;i=i+5){%>
					<option value="<%=i%>" <%=(numberItem==i)?"selected":""%> ><%=i%></option>
					<%}%>
				</select>
			</td>
		</tr>			
		<tr><td><input type="submit" value="Save"/> </td></tr>			
		<tr><td colspan="2">&nbsp;</td></tr>				
		</table>
		</fieldset>
	</td>
</tr>
</table>

<!-- <div class="portlet-font" style="font-weight:bold;float:left; margin-right:10px"> -->
<%-- 	<input type="submit"value="<liferay-ui:message key="save" />" />		 --%>
<!-- </div> -->
<!-- <br/><br/> -->
</form>
	
