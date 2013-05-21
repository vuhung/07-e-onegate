<%@page import="com.liferay.portal.UserScreenNameException"%>
<%@page import="com.liferay.portal.kernel.captcha.CaptchaTextException"%>
<%@page import="javax.portlet.ActionRequest"%>
    <%@ page import="net.tanesha.recaptcha.ReCaptchaImpl" %>
    <%@ page import="net.tanesha.recaptcha.ReCaptchaResponse" %>
<%@ include file="/html/portlet/vcommentview/init.jsp" %>
<script language="JavaScript1.2" src="/html/portlet/vcommentview/vietuni.js" type="text/javascript"></script>
<script language="javascript">	
	function <portlet:namespace />submitForm(type) {	
	
		var myform = document.<portlet:namespace />fm;		
		var name = document.<portlet:namespace />fm.<portlet:namespace />guestName;
		var email = document.<portlet:namespace />fm.<portlet:namespace />email;
		var title = document.<portlet:namespace />fm.<portlet:namespace />title;
		var content = document.<portlet:namespace />fm.<portlet:namespace />content;
		resetField(name);
		resetField(email);
		resetField(title);
		if(name.value==""){
			alert("<%=LanguageUtil.get(pageContext,"vportal.portlet.gcadmin.mustEnterName")%>");
			showErrorField(name);			
			return false;
		}
		if(name.value.length > 99){
			alert("<%=LanguageUtil.get(pageContext,"vportal.portlet.gcadmin.characterLestThan")+" 300" %>");
			showErrorField(name);
			return false;
		}
		
// 		Validate Email
		var r = new RegExp(/^\w+(\.[a-zA-Z]+)*\w*@(\w+\.([a-zA-Z])+){1,4}$/);
			
		if(!r.test(email.value)){
			alert("<%=LanguageUtil.get(pageContext,"vportal.portlet.gcadmin.invalidEmail")%>");
			showErrorField(email);
			clearField(email)
			return false;
		}
		
		if(title.value==""){
			alert("<%=LanguageUtil.get(pageContext,"vportal.portlet.gcadmin.mustEnterTitle")%>");
			showErrorField(title);
			return false;
		}
				
		if(title.value.length > 300){
			alert("<%=LanguageUtil.get(pageContext,"vportal.portlet.gcadmin.characterLestThan")+" 300"%>");
			showErrorField(title);
			return false;
		}
		
		if(content.value==""){
			alert("<%=LanguageUtil.get(pageContext,"vportal.portlet.gcadmin.mustEnterContent")%>");
			showErrorField(content);
			return false;
		}		
		if(content.length > 30000){
			alert("<%=LanguageUtil.get(pageContext,"vportal.portlet.gcadmin.characterLestThan")+" 10000"%>");
			showErrorField(content);
			return false;
		}	
	
		myform.submit();
		
	}
	
	function <portlet:namespace />Clear(){
		var myform = document.<portlet:namespace />fm;		
		var name = document.<portlet:namespace />fm.<portlet:namespace />guestName;
		var email = document.<portlet:namespace />fm.<portlet:namespace />email;
		var title = document.<portlet:namespace />fm.<portlet:namespace />title;
		var fax = document.<portlet:namespace />fm.<portlet:namespace />fax;
		var phone = document.<portlet:namespace />fm.<portlet:namespace />phone;
		var content = document.<portlet:namespace />fm.<portlet:namespace />content;
		var address = document.<portlet:namespace />fm.<portlet:namespace />address;
		
		clearField(name);
		clearField(email);
		clearField(title);
		clearField(fax);
		clearField(phone);
		clearField(address);
		clearField(content);
	}
	
	function gf(p_el) {	}
	function lf(p_el) {	}
	setTypingMode(4); 
</script>
<% 
PortletURL TypeNew = renderResponse.createActionURL();
TypeNew.setParameter(ActionRequest.ACTION_NAME, "Type_Manager_New");

%>
<liferay-ui:error exception="<%= com.liferay.portal.kernel.captcha.CaptchaTextException.class %>" message="text-verification-failed" />
<liferay-ui:error exception="<%= com.liferay.portal.UserScreenNameException.class %>" message="authentication-failed" /> 
<script language="JavaScript1.2" src="99506.cand_files/vietuni.js" type="text/javascript"></script>
<script language="JavaScript1.2"> setTypingMode(4); </script>
<script language="JavaScript"></script>	
	
<%

	
%>	
<form action="<%=TypeNew.toString()%>" name="<portlet:namespace />fm" method="post">
	<input type="hidden" name="<portlet:namespace />cmd" value="doadd" />
	<input type="hidden" name="<portlet:namespace />Id" value="" /> 

<%
	String[] arrParam = StringUtil.split(themeDisplay.getThemeId(), "_");
	String themesId = arrParam[0];
%>	

<div id="maincol">
  	<div class="ctn-center clearfix">
    	<div class="line-top">
        	<div class="line-bottom">
            	<div class="line-left">
                	<div class="line-right">
                    	<div class="goc-left-top">
                        	<div class="goc-right-top">
                            	<div class="goc-left-bottom">
                                	<div class="goc-right-bottom">
                                    	<div class="clearfix block4">
                                    		<table cellpadding="0" cellspacing="0" border="0" width="100%">
												<tr><td width=""><img src="<%=themeDisplay.getPathThemeImage()%>/<%=themesId%>_image/i_14_l.gif"/></td>
<%-- 													<td width="32"><img src="<%=themeDisplay.getPathThemeImage()%>/<%=themesId%>_image/icon.gif" /></td> --%>
													<td class="title_left_4"><h3></h3></td>
													<td width=""><img src="<%=themeDisplay.getPathThemeImage()%>/<%=themesId%>_image/i_16_r.gif" /></td>
												</tr>
											</table>
	
											<table width="100%" border="0" cellspacing="0" cellpadding="0">
											<tr height="10"><td colspan="4">&nbsp;</td></tr>
												
											
											<tr height="30">
												<td colspan="4" align="center">
												</td>													
											</tr>
											
											
											<tr height="25">		
												<td style="padding-left:8px"><liferay-ui:message key="full-name" />&nbsp;:</td>
												<td width="25">
												<td><input type="text" name="<portlet:namespace />guestName" style="width:250px;" onKeyUp="telexingVietUC(this,event);"></td>
												<td colspan="2"/>
											</tr>
													
											<tr height="25">		
												<td style="padding-left:8px"><liferay-ui:message key="email" />&nbsp;:</td>
												<td/>
												<td><input type="text" name="<portlet:namespace />email" style="width:250px;" ></td>
												<td colspan="2"/>
											</tr>	
												
											
											<tr height="25">		
												<td style="padding-left:8px"><liferay-ui:message key="phone" />&nbsp;:</td>
												<td/>
												<td><input type="text" name="<portlet:namespace />phone" style="width:250px;" onKeyUp="telexingVietUC(this,event);" ></td>
												<td colspan="2"/>
											</tr>
											
														
											
											<tr height="25">
												<td style="padding-left:8px"><liferay-ui:message key="fax" />&nbsp;:</td>
												<td/>
												<td><input type="text" name="<portlet:namespace />fax" style="width:250px;" onKeyUp="telexingVietUC(this,event);"></td>
												<td colspan="2"/>
											</tr>
											
											<tr height="25">
												<td style="padding-left:8px"><liferay-ui:message key="address" />&nbsp;:</td>
												<td/>
												<td><input type="text" name="<portlet:namespace />address" style="width:250px;" onKeyUp="telexingVietUC(this,event);"></td>
												<td colspan="2"/>
											</tr>
											
											<tr height="25">
												<td style="padding-left:8px"><liferay-ui:message key="title" />&nbsp;:</td>
												<td/>
												<td><input type="text" name="<portlet:namespace />title" style="width:250px;" onKeyUp="telexingVietUC(this,event);"></td>
												<td colspan="2"/>
											</tr>
												
											
										
											
													
											<tr height="25" >
												<td colspan="2" style="padding-left:8px;"><liferay-ui:message key="content" />&nbsp;:</td>
												<td colspan="2" style="padding-right:8px;">
											
												</td>
											</tr>
													
											<tr>
												<td colspan="4" style="padding-left:8px;padding-right:8px">
													<textarea name="<portlet:namespace />content" style="width:382px; height:120px" onKeyUp="initTyper(this)"></textarea>
												</td>
											</tr>
												
											<tr height="10">
												<td colspan="4"></td>
											</tr>
											<tr height="30">
												<td colspan="4" style="padding-left:5px;">
														<portlet:resourceURL var="captchaURL"/>
														<liferay-ui:captcha url="<%=captchaURL%>" />
												
												<td/>
											</tr>
													
											<tr height="30">
												<td colspan="4" style="padding-left:8px;">
													<input  type="button" value="<liferay-ui:message key="send" />" onclick="<portlet:namespace />submitForm(1)">
													<input  type="button" value="<liferay-ui:message key="cancel" />" onclick="<portlet:namespace />Clear();" />
												</td>
											</tr>	
													
											</table>			

										</div>
                                	</div>
                            	</div>
                        	</div>
                    	</div>
                	</div>
            	</div>
        	</div>
    	</div>
	</div>
</div>										

</form>
