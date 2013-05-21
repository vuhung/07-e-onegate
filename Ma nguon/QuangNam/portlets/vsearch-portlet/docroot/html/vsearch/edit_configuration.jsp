<%@page import="javax.portlet.WindowState"%>
<%@page import="com.liferay.portlet.PortletURLUtil"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="/html/vsearch/init.jsp" %>
<%@ include file="/init.jsp" %>
<%
String currentURL = PortletURLUtil.getCurrent(renderRequest, renderResponse).toString();
%>

<script language="javascript">
	//Save Preferences		
	function <portlet:namespace />savePreferences() {
		submitForm(document.<portlet:namespace />fm, '<portlet:actionURL windowState="<%= WindowState.MAXIMIZED.toString()%>"><portlet:param name="struts_action" value="/search/edit_configuration" /></portlet:actionURL>');
	}
	
	function <portlet:namespace />changeStyle(styleObj) {
		if(styleObj.value==1){
			document.getElementById("<portlet:namespace/>themes").style.display = '';
		}else if(styleObj.value==2){
			document.getElementById("<portlet:namespace/>themes").style.display = 'none';
		}else if (styleObj.value==3){
			document.getElementById("<portlet:namespace/>themes").style.display = 'none';
		}
	}
	
</script>

<%	
	String redirect = ParamUtil.getString(request, "redirect");
	PortletURL portletURL = renderResponse.createRenderURL();
	portletURL.setWindowState(WindowState.MAXIMIZED);	
	portletURL.setParameter("struts_action", "/search/edit_configuration");

%>
<form  action="<portlet:actionURL><portlet:param name="struts_action" value="/edit_configuration" />
	</portlet:actionURL>" name="<portlet:namespace />fm" method="POST">	
	<input name="<portlet:namespace />redirect" type="hidden" value="<%=currentURL%>" />	
	<input name="<portlet:namespace />cmd" type="hidden" value=""/>

<table  width="100%" cellspacing="1" cellpadding="4" border="0" align="center">	
<tr>
	<td width="100%" valign="top">		
		<fieldset style="border:1px dotted gray;">
			<legend><strong>C&#7845;u hình Portlet</strong></legend>
							
		</fieldset>
	</td>
</tr>
</table>
<br/><br/>
<div class="portlet-font" style="font-weight:bold;float:left; margin-right:10px">
	<input type="button" class="portlet-form-button" value="<liferay-ui:message key="save" />" onClick="<portlet:namespace />savePreferences();"/>		
</div>
<br/>
<br/>
</form>



