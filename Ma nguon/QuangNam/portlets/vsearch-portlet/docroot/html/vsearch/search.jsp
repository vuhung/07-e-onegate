<%@page import="javax.portlet.WindowState"%>
<%@ include file="/html/vsearch/init.jsp" %>
<%@ include file="/init.jsp" %>
<%@ page import="com.liferay.portal.kernel.language.*" %>

<%
String defaultKeywords = LanguageUtil.get(pageContext, "search") + "...";

String unicodeDefaultKeywords = UnicodeFormatter.toString(defaultKeywords);

String keywords = ParamUtil.getString(request,"keywords", "");

PortletURL portletURL = renderResponse.createRenderURL();

portletURL.setWindowState(WindowState.MAXIMIZED);

portletURL.setParameter("struts_action", "/search/search");
%>

<form action="<%= portletURL.toString() %>" method="post" name="<portlet:namespace />fm" onSubmit="submitForm(this); return false;">
 
<table width="100%" height="70" style="background:transparent url(<%=themeDisplay.getPathThemeImage() %>/HN_image/ico_dulieutk1.jpg) no-repeat; margin: 3px 0px;">  
	  	<tr>
	  		<td  height="100%">
		  		<div style="padding-top: 17px;">
		  			<div style="float:left;">
		  				&nbsp;&nbsp; <input name="<portlet:namespace />keywords" style="width: 135px;" type="text" value="<%= HtmlUtil.escape(keywords) %>" onBlur="if (this.value == '') { this.value = '<%= unicodeDefaultKeywords %>'; }" onFocus="if (this.value == '<%= unicodeDefaultKeywords %>') { this.value = ''; }" />
		  			</div>
		  			<div style="float:right">
		  				<input type="button" onclick="<portlet:namespace />submitform();" name="button" id="button" value="T&#236;m" />&nbsp;
		  			</div>	  		
		  		</div>
		  	</td>
		</tr>
</table>

</form>
<SCRIPT language="JavaScript">
	function <portlet:namespace />submitform()
	{
	  document.<portlet:namespace />fm.submit();
	}
</SCRIPT> 
