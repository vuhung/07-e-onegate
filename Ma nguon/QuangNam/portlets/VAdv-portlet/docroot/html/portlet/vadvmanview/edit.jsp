<%@ include file="/html/portlet/vadvmanview/init.jsp" %>
	

<script language="javascript">
	//Save Preferences		
	function <portlet:namespace />savePreferences() {
		submitForm(document.<portlet:namespace />fm, 
		'<portlet:actionURL windowState="<%= WindowState.MAXIMIZED.toString() %>">
		<portlet:param name="struts_action" value="/vadvmanview/edit" /></portlet:actionURL>');
	}
	
	function <portlet:namespace />changeType() {
		submitForm(document.<portlet:namespace />fm, 
		'<portlet:renderURL windowState="<%= WindowState.MAXIMIZED.toString() %>">
		<portlet:param name="struts_action" value="/vadvmanview/edit" /></portlet:renderURL>');
	}
	
	function <portlet:namespace />hide(){
		var defautltSize = document.getElementById('<portlet:namespace/>defaultSize');
		var customSize = document.getElementById('<portlet:namespace/>customSize');
		if (defautltSize.checked){
			customSize.style.display = "none";
		} else {
			customSize.style.display = "";
		}
	}	
</script>

<%	
	String redirect = ParamUtil.getString(request, "redirect");
	PortletURL portletURL = renderResponse.createRenderURL();
	portletURL.setWindowState(WindowState.MAXIMIZED);	
	portletURL.setParameter("struts_action", "/vadvmanview/edit");
	
	List listType = AdvTypeServiceUtil.getTypeByG(groupId);
	List listItem = new ArrayList();	
	
	String typeId = ParamUtil.getString(request,"typeId","0");	
	
	listItem = AdvItemServiceUtil.getItemByG_S(groupId, true);
	
	// preference
	String itemId = prefs.getValue("itemId", "");
	String width = prefs.getValue("width","196");
	String height = prefs.getValue("height","66");
	
	//String titlePortlet = prefs.getValue("titlePortlet","");
	
	String autoStart = prefs.getValue("autoStart","true");
	String autoRepeat =  prefs.getValue("autoRepeat","true");
	String controlBar = prefs.getValue("controlBar","none");
	String defaultSize = prefs.getValue("defaultSize","true");
	
	String selectstyleBorder = prefs.getValue("selectstyleBorder","1");
	
	boolean _defaultSize = Boolean.valueOf(defaultSize);
%>

<div id="ajax" style="display: block">
<form  action="<portlet:actionURL><portlet:param name="struts_action" value="/vadvmanview/edit" />
	</portlet:actionURL>" name="<portlet:namespace />fm" method="POST">	
	<input name="<portlet:namespace />redirect" type="hidden" value="<%= currentURL %>" />	
	<input name="<portlet:namespace />cmd" type="hidden" value=""/>
	<input name="<portlet:namespace />typeId" type="hidden" value=""/>	

<table  width="100%" cellspacing="1" cellpadding="4" border="0" align="center">	
<tbody>
<tr>
	<td width="100%" valign="top">		
		<fieldset style="border:1px dotted gray;">
		<legend><strong>C&#7845;u h�nh Portlet</strong></legend>
		<table class="lfr-table">
		<tr height="30">
			<td>Ch&#7885;n lo&#7841;i qu&#7843;ng c�o</td>
			<td>
				<select name="<portlet:namespace/>typeId" onchange="<portlet:namespace />changeType();" >
					<option value="0">---- T&#7845;t c&#7843; ----</option>
					<%	if(listType != null && listType.size()>0){
							for(int i = 0; i<listType.size();i++){
								AdvType type = (AdvType)listType.get(i);	%>
						<option value="<%=type.getTypeId()%>" <%= String.valueOf(type.getTypeId()).equals(typeId) ? "selected" : "" %>><%=type.getName()%></option>
					<%	}}	%>
				</select>
			</td>
		</tr>
		<tr height="30">							
			<td>Ch&#7885;n qu&#7843;ng c�o &#273;&#7875; hi&#7875;n th&#7883; :</td>
		</tr>
		</table>
						
		<table class="lfr-table" width="100%" cellspacing="1" cellpadding="4" border="0">
		<tr height="30">
			<c:if test="<%= listItem.size() == 0%>">
				<td>		
					<font color="red">Lo&#7841;i qu&#7843;ng c�o n�y &#273;ang c&#7853;p nh&#7853;t !</font>
				</td>		
			</c:if>	
			<td>						
				<table class="lfr-table" width="100%">
				<tr height="25" valign="middle">
					<td>
						<%	if(listItem != null && listItem.size()>0){
								for(int i = 0; i<listItem.size();i++){
									AdvItem item = (AdvItem)listItem.get(i);																	
						%>						
							&nbsp;<div class="<%= i%2==0?"left":"right"%>">
								<div align="left">
									<input type="radio" id="<portlet:namespace/>itemId_<%=item.getItemId()%>" name="<%= renderResponse.getNamespace()%>itemId" value="<%=item.getItemId()%>" <%= (String.valueOf(item.getItemId()).equals(itemId))? "checked":"" %>/>
									<label for="<portlet:namespace/>itemId_<%=item.getItemId()%>"><%= item.getDescription()%>&nbsp; - &nbsp; <%= item.getName()%><label>
								</div>
							</div>							
						<%}	%>
						
						<%	
							if(listItem.size()%2==1){
						%>
							<div class="right">&nbsp;</div>
						<%
								}
							}
						%>
					</td>
				</tr>
				</table>
			</td>
		</tr>
		</table>
		</fieldset>
							
		<br/>
							
		<fieldset>
		<legend><strong>C&#7845;u h�nh hi&#7875;n th&#7883;</strong></legend>
		<table width="100%">	
		<tr>
			<td width="50%"> 		
				<table width="100%">
				<tr height="25"><td><b>Ch&#7885;n ki&#7875;u hi&#7875;n th&#7883; PORTLET</b></td></tr>
				<tr height="30">
				<td><b>Style</b></td>
				<td>
					<input type="radio" value="1" name="<portlet:namespace/>selectstyleBorder" id="<portlet:namespace/>themeType_1" 
					<%=selectstyleBorder.equals("1")?"checked":""%> onchange="<portlet:namespace />changeTheme(this)">
					<label for="<portlet:namespace/>themeType_1">M&#7863;c &#273;&#7883;nh</label>
					&nbsp;&nbsp;
					<input type="radio" value="2" name="<portlet:namespace/>selectstyleBorder" id="<portlet:namespace/>themeType_2" 
						<%=selectstyleBorder.equals("2")?"checked":""%> onchange="<portlet:namespace />changeTheme(this)">
						<label for="<portlet:namespace/>themeType_2">1 c&#7897;t &#7842;nh v&#224; ch&#7919; c&#249;ng h&#224;ng</label>
					&nbsp;&nbsp;
					<input type="radio" value="3" name="<portlet:namespace/>selectstyleBorder" id="<portlet:namespace/>themeType_3" 
						<%=selectstyleBorder.equals("3")?"checked":""%> onchange="<portlet:namespace />changeTheme(this)">
						<label for="<portlet:namespace/>themeType_3">3 c&#7897;t , &#7843;nh v&#224; ch&#7919; c&#249;ng h&#224;ng</label>
				</td>
			</tr>
				</table>
			</td>
			
			
		</tr>
		</table>	
			
		<table class="lfr-table" width="100%">
		<tr height="30">
			<td width="50%" valign="top">
				<table class="lfr-talbe">
					<tr height="30">	
						<td><b><label for="<portlet:namespace/>defaultSize">Hi&#7875;n th&#7883; qu&#7843;ng c�o v&#7899;i k�ch th&#432;&#7899;c m&#7863;c &#273;&#7883;nh</label></b></td>
						<td><input type="checkbox" id="<portlet:namespace/>defaultSize" name="<portlet:namespace />defaultSize" onClick ="javascript:<portlet:namespace/>hide();" <%= _defaultSize ? "checked" : ""%> /></td>
					</tr>					
					<tr id="<portlet:namespace/>customSize" style="display:<%= _defaultSize ? "none": "" %>">						
						<td>
							<table>
							<tr height="30">
								<td>Chi&#7873;u r&#7897;ng</td>
								<td><input type="text" name="<portlet:namespace />width" style="width:30px;" value="<%= width%>"> px</td>
							</tr>
							<tr height="30">								
								<td>Chi&#7873;u cao</td>
								<td><input type="text" name="<portlet:namespace />height" style="width:30px;" value="<%= height%>"> px</td>
							</tr>
							</table >
						</td>
					</tr>
				</table>
			</td>				
			<td valign="top">
				<table class="lfr-table">
					<tr height="30">
						<td><b>C&#7845;u h�nh cho qu&#7843;ng c�o Flash, Clip:</b></td>
						<td/>
					</tr>	
					<tr height="30">
						<td>- T&#7921; &#273;&#7897;ng kh&#7903;i &#273;&#7897;ng</td>
						<td><input type="checkbox" name="<portlet:namespace />autoStart" <%= autoStart.equals("true") ? "checked": ""%> ></td>
					</tr>
						
					<tr height="30">
						<td>- T&#7921; &#273;&#7897;ng ch&#7841;y l&#7841;i</td>
						<td><input type="checkbox" name="<portlet:namespace />autoRepeat" <%= autoRepeat.equals("true") ? "checked": ""%> ></td>
					</tr>							
						
					<tr height="30">	
						<td>- Hi&#7875;n th&#7883; thanh &#273;i&#7873;u khi&#7875;n</td>
						<td>
							<select name="<portlet:namespace/>controlBar"/>
								<option value="none" <%= controlBar.equals("none")? "selected":""%>>Kh�ng hi&#7875;n th&#7883;</option>
								<option value="bottom" <%= controlBar.equals("bottom")? "selected":""%>>Hi&#7875;n th&#7883; &#7903; d&#432;&#7899;i</option>
								<option value="over" <%= controlBar.equals("over")? "selected":""%>>Hi&#7875;n th&#7883; &#7903; tr�n</option>
							</select>
						</td>
					</tr>			
				</table>
			</td>
		</tr>	
		</table>
		</fieldset>
	</td>	
</tr>
</tbody>		
</table>
					
<br/>
<div class="portlet-font" style="font-weight:bold;float:left; margin-right:10px">
	<input type="button" class="portlet-form-button" value="<liferay-ui:message key="save" />" onClick="<portlet:namespace />savePreferences();"/>		
</div>
<br/>
<br/>
</form>
<div>							