<%@page import="com.liferay.portal.kernel.captcha.CaptchaTextException"%>
<%@ include file="/html/portlet/vcontactview/init.jsp" %>
<%@taglib prefix="vportal" uri="http://www.vietsoftware.com/tld" %>

<script language="JavaScript1.2" src="/html/portlet/vcontactview/vietuni.js" type="text/javascript"></script>
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
		
		//Validate Email
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
		submitForm(document.<portlet:namespace />fm, '<portlet:actionURL windowState="<%=WindowState.MAXIMIZED.toString()%>" name="_add"></portlet:actionURL>');
	}
	
	
	function <portlet:namespace />Clear(){
		var myform = document.<portlet:namespace />fm;		
		var name = document.<portlet:namespace />fm.<portlet:namespace />guestName;
		var email = document.<portlet:namespace />fm.<portlet:namespace />email;
		var title = document.<portlet:namespace />fm.<portlet:namespace />title;
		var phone = document.<portlet:namespace />fm.<portlet:namespace />phone;
		var content = document.<portlet:namespace />fm.<portlet:namespace />content;
		var address = document.<portlet:namespace />fm.<portlet:namespace />address;
		var fax = document.<portlet:namespace />fm.<portlet:namespace />fax;
		
		clearField(name);
		clearField(email);
		clearField(title);
		clearField(phone);
		clearField(address);
		clearField(content);
		clearField(fax);
	}
	
	function gf(p_el) {	}
	function lf(p_el) {	}
	setTypingMode(4); 
</script>
	
<script language="JavaScript1.2" src="99506.cand_files/vietuni.js" type="text/javascript"></script>
<script language="JavaScript1.2"> setTypingMode(4); </script>
<script language="JavaScript"></script>	
	
<%

	
	
	VContact vcontact = (VContact)request.getAttribute("contact");
	if (vcontact == null){
		vcontact = new VContactImpl();
	}
	
	String Id = ((vcontact != null && Long.toString(vcontact.getId()) != null) ? Long.toString(vcontact.getId()) : null);
	
	String isPhone = prefs.getValue("isPhone","false");
	String isFax = prefs.getValue("isFax","false");
	String isAddress = prefs.getValue("isAddress","false");
	String isAttach  = prefs.getValue("isAttach","true");
	String isTyping = prefs.getValue("isTyping","true");
	String isCodeActive = prefs.getValue("isCodeActive","false");
	String numberAtt = prefs.getValue("numberAtt","1");
	String style = prefs.getValue("style","2");
	String title = prefs.getValue("title","");
	String titlePortlet = prefs.getValue("titlePortlet","Liên h&#7879;");
	
	boolean _isCodeActive = Boolean.valueOf(isCodeActive);
	boolean _isPhone = Boolean.valueOf(isPhone);
	boolean _isFax = Boolean.valueOf(isFax);
	boolean _isAddress = Boolean.valueOf(isAddress);
	boolean _isAttach = Boolean.valueOf(isAttach);
	boolean _isTyping = Boolean.valueOf(isTyping);	
	
	PortletURL portletURL = renderResponse.createRenderURL();
	portletURL.setWindowState(WindowState.NORMAL);
	portletURL.setParameter("struts_action", "/vcontactview/view");
	
	
%>	
<liferay-ui:error exception="<%= CaptchaTextException.class %>" message="text-verification-failed" />	
<form action="<portlet:actionURL><portlet:param name="struts_action" value="/vcontactview/view" />
	</portlet:actionURL>" method="post" name="<portlet:namespace />fm" enctype="multipart/form-data">
	<input type="hidden" name="<portlet:namespace />cmd" value="doadd" />
	<input type="hidden" name="<portlet:namespace />Id" value="" /> 
	<input type="hidden" name="<portlet:namespace />redirect" value="<%=portletURL%>" />
	<input type="hidden" name="<portlet:namespace />groupId" value="<%=groupId%>" />


<table width="100%">
	<tr><td height="3"></td></tr>
	<tr>
    	<td class="bg_02">
	        <div class="title1">
	        	<b><%=titlePortlet%></b>
			</div>
		</td>
	</tr>
	<tr>		
		<td class="boder_top" style="padding: 25px 70px 25px 80px;">
			<table width="100%" border="0" cellspacing="0" cellpadding="0">				
				<tr height="10"><td colspan="5"/></tr>
					<c:if test="<%= Validator.isNotNull(title)%>">		
					<tr>
						<td colspan="5"><div align="center"><%= title%></div></td>
					</tr>
					<tr height="10"><td colspan="5"/></tr>
					</c:if>				
				<tr height="25">		
					<td style="padding-left:8px"><%= LanguageUtil.get(pageContext, "com.vportal.portlet.vcontact.name") %>:</td>
					<td width="25">
					<td><input type="text" name="<portlet:namespace />guestName" style="width:280px;" onKeyUp="telexingVietUC(this,event);"></td>
					<td colspan="2"/>
				</tr>
														
				<tr height="25">		
					<td style="padding-left:8px">Email:</td>
					<td/>
					<td><input type="text" name="<portlet:namespace />email" style="width:280px;" ></td>
					<td colspan="2"/>
				</tr>	
									
				<c:if test="<%= _isPhone%>">
				<tr height="25">		
					<td style="padding-left:8px"><%= LanguageUtil.get(pageContext, "com.vportal.portlet.vcontact.phone") %>:</td>
					<td/>
					<td><input type="text" name="<portlet:namespace />phone" style="width:280px;" onKeyUp="telexingVietUC(this,event);" ></td>
					<td colspan="2"/>
				</tr>
				</c:if>
											
				<c:if test="<%= _isFax%>">
				<tr height="25">
					<td style="padding-left:8px">Fax:</td>
					<td/>
					<td><input type="text" name="<portlet:namespace />fax" style="width:280px;" onKeyUp="telexingVietUC(this,event);"></td>
					<td colspan="2"/>
				</tr>
				</c:if>								
				<c:if test="<%= _isAddress%>">
				<tr height="25">
					<td style="padding-left:8px"><%= LanguageUtil.get(pageContext, "com.vportal.portlet.vcontact.address") %>:</td>
					<td/>
					<td><input type="text" name="<portlet:namespace />address" style="width:280px;" onKeyUp="telexingVietUC(this,event);"></td>
					<td colspan="2"/>
				</tr>
				</c:if>
						
				<tr height="25">
					<td style="padding-left:8px"><%= LanguageUtil.get(pageContext, "com.vportal.portlet.vcontact.title") %>:</td>
					<td/>
					<td><input type="text" name="<portlet:namespace />title" style="width:280px;" onKeyUp="telexingVietUC(this,event);"></td>
					<td colspan="2"/>
				</tr>
					
				<c:if test="<%= _isAttach%>">
				<tr height="25">
					<td style="padding-left:8px"><%= LanguageUtil.get(pageContext, "com.vportal.portlet.vcontact.attach") %>:</td>
					<td/>
					<td><vportal:file-upload entryId="<%=GetterUtil.getLong(Id , 0)%>" entryClass="<%=VContact.class%>" maxAttachment="<%= Integer.valueOf(numberAtt)%>" style="2"/></td>
					<td colspan="2"/>
				</tr>
				</c:if>	
						
				<tr height="25" >
					<td colspan="2" style="padding-left:8px;"><%= LanguageUtil.get(pageContext, "com.vportal.portlet.vcontact.content") %>:</td>
					<td colspan="3" style="padding-right:8px;">
						<c:if test="<%= _isTyping%>">
						<table cellspacing="0" cellpadding="0" border="0" align="left">
						<c:if test="<%= style.equals(\"1\")%>">
						<tr>
							<td style="padding: 5px 0px;">
								<input type="radio" name="<portlet:namespace/>switch" value="OFF"   onFocus="setTypingMode(0)" />T&#7855;t
								<input type="radio" name="<portlet:namespace/>switch" value="TELEX" onFocus="setTypingMode(1)" checked>T&#7921; &#273;&#7897;ng
								<input type="radio" name="<portlet:namespace/>switch" value="TELEX" onFocus="setTypingMode(1)" />Telex
								<input type="radio" name="<portlet:namespace/>switch" value="VNI" 	onFocus="setTypingMode(2)" />VNI
								<input type="radio" name="<portlet:namespace/>switch" value="VIQR" 	onFocus="setTypingMode(3)" />VIQR
							</td>
						</tr>
						</c:if>
						<c:if test="<%= style.equals(\"2\")%>">
						<tr>
							<td style="padding: 5px 0px;">
								<input type="radio" name="<portlet:namespace/>switch" value="OFF"   onFocus="setTypingMode(0)" /><%= LanguageUtil.get(pageContext, "com.vportal.portlet.vcontact.type") %>
								<input type="radio" name="<portlet:namespace/>switch" value="TELEX" onFocus="setTypingMode(1)" checked>Telex
							</td>
						</tr>	
						</c:if>
						</table>
						</c:if>			
					</td>
				</tr>
						
				<tr>
					<td colspan="5" style="padding-left:8px;padding-right:8px">
						<textarea name="<portlet:namespace />content" style="width:375px; height:120px" onKeyUp="initTyper(this)"></textarea>
					</td>
				</tr>
					
				<tr height="10">
					<td colspan="5"></td>
				</tr>				
				<tr height="30">
					<td colspan="5" style="padding: 5px 8px;">					
						<%-- <portlet:actionURL windowState="<%= LiferayWindowState.EXCLUSIVE.toString() %>" var="captchaURL">
							<portlet:param name="struts_action" value="/vcontactview/captcha" />
						</portlet:actionURL>
						<liferay-ui:captcha url="<%= captchaURL %>" />
						 --%>
						 	<portlet:resourceURL var="captchaURL" /> 
						    <liferay-ui:captcha  url="<%=captchaURL%>" />
						    
					</td>
				</tr>
				
				<tr height="30">
					<td colspan="5" style="padding-left:8px;">
						<input  type="button" value="<liferay-ui:message key="send" />" onclick="<portlet:namespace />submitForm(1)">
						<input  type="button" value="<liferay-ui:message key="cancel" />" onclick="<portlet:namespace />Clear()" />
					</td>
				</tr>
				</table>							
			</td>
		</tr>
	</table>
	<table width="100%">
		<tr>
			<td width="4"><img src="<%= themeDisplay.getPathThemeImage() %>/HN_image/i_34.gif" width="4" height="4"/></td>
			<td id="center_bottom_background"></td>
			<td width="4"><img src="<%= themeDisplay.getPathThemeImage() %>/HN_image/i_35.gif" width="4" height="4"/></td>
		</tr>
	</table>			
</form>
