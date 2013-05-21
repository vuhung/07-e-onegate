<%@ include file="/html/portlet/vadvmanview/init.jsp" %>
	

<script language="javascript">
	//Save Preferences		
	function <portlet:namespace />savePreferences() {
		submitForm(document.<portlet:namespace />fm, 
		'<portlet:actionURL windowState="<%= WindowState.MAXIMIZED.toString() %>"></portlet:actionURL>');
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

	function <portlet:namespace />changeTheme(styleObj) {
		if(styleObj)
			if(styleObj.value==1){
				document.getElementById("<portlet:namespace/>themes_DIENBIEN").style.display = '';			
				document.getElementById("<portlet:namespace/>themes_SBN").style.display = 'none';			
			}else if(styleObj.value==2){
				document.getElementById("<portlet:namespace/>themes_DIENBIEN").style.display = 'none';		
				document.getElementById("<portlet:namespace/>themes_SBN").style.display = '';				
			}else if(styleObj.value==3){
				document.getElementById("<portlet:namespace/>themes_DIENBIEN").style.display = 'none';
				document.getElementById("<portlet:namespace/>themes_SBN").style.display = 'none';			
			}
	} 
	
	function <portlet:namespace />changeIsBorder(styleObj) {
		if(styleObj)
			if(styleObj.value==1){
				document.getElementById("<portlet:namespace/>isBorder").style.display = '';
			}else if(styleObj.value==3){
				document.getElementById("<portlet:namespace/>isBorder").style.display = 'none';
				
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
	
	String titlePortlet = prefs.getValue("titlePortlet","");
	
	String selectstyleBorder = prefs.getValue("selectstyleBorder","1");
	String selectedstyleBorder = ParamUtil.getString(request, "selectstyleBorder","");
	if(!selectedstyleBorder.equals("")){
	   selectstyleBorder = selectedstyleBorder;
	}
	String autoStart = prefs.getValue("autoStart","true");
	String autoRepeat =  prefs.getValue("autoRepeat","true");
	String controlBar = prefs.getValue("controlBar","none");
	String defaultSize = prefs.getValue("defaultSize","true");
	
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
		<legend><strong>C&#7845;u hình Portlet</strong></legend>
		<table class="lfr-table">
		<tr height="30">
			<td>Ch&#7885;n lo&#7841;i qu&#7843;ng cáo</td>
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
			<td>Ch&#7885;n qu&#7843;ng cáo &#273;&#7875; hi&#7875;n th&#7883; :</td>
		</tr>
		</table>
						
		<table class="lfr-table" width="100%" cellspacing="1" cellpadding="4" border="0">
		<tr height="30">
			<c:if test="<%= listItem.size() == 0%>">
				<td>		
					<font color="red">Lo&#7841;i qu&#7843;ng cáo này &#273;ang c&#7853;p nh&#7853;t !</font>
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
		<legend><strong>C&#7845;u hình hi&#7875;n th&#7883;</strong></legend>
		<table width="100%">	
		<tr>
			<td width="50%"> 		
				<table width="100%">
				<tr height="25"><td><b>Ch&#7885;n ki&#7875;u hi&#7875;n th&#7883; PORTLET</b></td></tr>
				<tr>
					<td>
					<table>
					<tr height="25">
						<td><input type="radio" name="<portlet:namespace/>selectstyleBorder" id="<portlet:namespace/>selectstyleBorder_1" value="1" 
							<%=selectstyleBorder.equals("1")?"checked":""%> onchange="<portlet:namespace />changeIsBorder(this)"	></td>
						<td><label for="<portlet:namespace/>selectstyleBorder_1">Ki&#7875;u có vi&#7873;n</label></td>
					</tr>
					<tr height="25">
						<td><input type="radio" name="<portlet:namespace/>selectstyleBorder" id="<portlet:namespace/>selectstyleBorder_2" value="3" 
							<%=selectstyleBorder.equals("3")?"checked":""%>	onchange="<portlet:namespace />changeIsBorder(this)"></td>
						<td><label for="<portlet:namespace/>selectstyleBorder_2">Ki&#7875;u không có vi&#7873;n</label></td>
					</tr>
					</table>
					</td>
				</tr>
				</table>
			</td>
			
			<td >	
				<table>
				 <tr height="25">	 
				 	 <td>
				 	 	<select name="<portlet:namespace />paddingLeft" >
				 	 	<%for(int i=0;i<10;i++){%>
				 	 		<option value="<%=i%>" <%=(paddingLeft==i)?"selected":""%>><%=i%></option>
				 	 	<%}%>
				 	 	</select>
				 	 </td>
				 	 <td>&nbsp;&nbsp;C&#259;n l&#7873; trái</td>		
				 </tr>	 
				 <tr height="25">	 
				 	 <td>
				 	 	<select name="<portlet:namespace />paddingRight" >
				 	 	<%for(int j=0;j<10;j++){%>
				 	 		<option value="<%=j%>" <%=(paddingRight==j)?"selected":""%>><%=j%></option>
				 	 	<%}%>
				 	 	</select>
				 	 </td>
				 	 <td>&nbsp;&nbsp;C&#259;n l&#7873; ph&#7843;i</td>		
				 </tr>	
				</table>
			</td>
		</tr>
		</table>				
			
		
		
		<br/>
			
		<div id="<portlet:namespace/>isBorder" <%=selectstyleBorder.equals("3")?"style=\"display:none\"":""%>>
			 <table width="100%">
			<tr height="30">
				<td><b>Tùy bi&#7871;n tiêu &#273;&#7873; PORTLET</b></td>
				<td><input type="text" name="<portlet:namespace/>titlePortlet" value="<%=titlePortlet%>" style="width:200px;">
			</tr>
			<tr height="30">
				<td><b>Tùy bi&#7871;n theo THEMES</b></td>
				<td>
					<input type="radio" value="1" name="<portlet:namespace/>themeType" id="<portlet:namespace/>themeType_1" 
					<%=themeType.equals("1")?"checked":""%> onchange="<portlet:namespace />changeTheme(this)">
					<label for="<portlet:namespace/>themeType_1">Themes &#272;i&#7879;n Biên</label>
					&nbsp;&nbsp;
					<input type="radio" value="2" name="<portlet:namespace/>themeType" id="<portlet:namespace/>themeType_2" 
						<%=themeType.equals("2")?"checked":""%> onchange="<portlet:namespace />changeTheme(this)">
						<label for="<portlet:namespace/>themeType_2">Themes các s&#7903; ban ngành</label>
					&nbsp;&nbsp;
					<input type="radio" value="3" name="<portlet:namespace/>themeType" id="<portlet:namespace/>themeType_3" 
						<%=themeType.equals("3")?"checked":""%> onchange="<portlet:namespace />changeTheme(this)">
						<label for="<portlet:namespace/>themeType_3">Trang Doanh nghi&#7879;p, Ng&#432;&#7901;i dân, Du khách</label>
				</td>
			</tr>
			</table>
						
			<table width="100%">					
			<tr>
				<td colspan="2" id="<portlet:namespace/>themes_DIENBIEN" <%= (themeType.equals("1"))?"":"style=\"display:none\"" %>>
				<table width="100%">
				<tr height="30">
					<td><b>Ch&#7885;n ki&#7875;u vi&#7873;n</b></td>
					<td><b>Ch&#7885;n ki&#7875;u bullet</b></td>
					<td><b>Ch&#7885;n ki&#7875;u n&#7873;n ti&#234;u &#273;&#7873;</b></td>
					<td><b>M&#224;u n&#7873;n n&#7897;i dung</b></td>
				</tr>
								  	  
				<tr>
					<td><input type="radio" name="<portlet:namespace/>styleBorder" value="border_blue" <%= styleBorder.equals("border_blue") ? "checked":"" %>/>
					&nbsp; Xanh bi&#7875;n <span class="border_blue">&nbsp;&nbsp;&nbsp;&nbsp;</span></td>
					
					<td><input type="radio" name="<portlet:namespace/>styleBullet" value="bullet_yellow" <%= styleBullet.equals("bullet_yellow") ? "checked":"" %>/>
					&nbsp; V&#224;ng <img src="<%= themeDisplay.getPathThemeImage() %>/DB_image/bullet_yellow.gif" /></td>
						
					<td><input type="radio" name="<portlet:namespace/>styleTitle" value="title_blue" <%= styleTitle.equals("title_blue") ? "checked":"" %>/>
					&nbsp; Xanh bi&#7875;n <img src="<%= themeDisplay.getPathThemeImage() %>/DB_image/title_bg_wrap_blue.gif" /></td>
						
					<td><input type="radio" name="<portlet:namespace/>styleContent" value="content_blue" <%= styleContent.equals("content_blue") ? "checked":"" %>/>
					&nbsp; Xanh nh&#7841;t <span class="content_blue">&nbsp;&nbsp;&nbsp;&nbsp;</span> </td>
				</tr>
								
			    <tr height="30">
			        <td><input type="radio" name="<portlet:namespace/>styleBorder" value="border_light_blue" <%= styleBorder.equals("border_light_blue") ? "checked":"" %>/>
			          &nbsp; Xanh ng&#7885;c <span class="border_light_blue">&nbsp;&nbsp;&nbsp;&nbsp;</span></td>
			        
			        <td><input type="radio" name="<portlet:namespace/>styleBullet" value="bullet_white_green" <%= styleBullet.equals("bullet_white_green") ? "checked":"" %>/>
			          &nbsp; Tr&#7855;ng xanh ng&#7885;c <img src="<%= themeDisplay.getPathThemeImage() %>/DB_image/bullet_white_green.gif" /></td>
			            
			        <td><input type="radio" name="<portlet:namespace/>styleTitle" value="title_light_blue" <%= styleTitle.equals("title_light_blue") ? "checked":"" %>/>
			          &nbsp; Xanh ng&#7885;c <img src="<%= themeDisplay.getPathThemeImage() %>/DB_image/title_bg_wrap_light_blue.gif" /></td>
			        
			        <td><input type="radio" name="<portlet:namespace/>styleContent" value="content_orange" <%= styleContent.equals("content_orange") ? "checked":"" %>/>
			          &nbsp; V&#224;ng nh&#7841;t <span class="content_orange">&nbsp;&nbsp;&nbsp;&nbsp;</span> </td>    
				 
			   </tr>
			           			
			    <tr height="30">
			        <td><input type="radio" name="<portlet:namespace/>styleBorder" value="border_orange" <%= styleBorder.equals("border_orange") ? "checked":"" %>/>
			          &nbsp; Da cam  <span class="border_orange">&nbsp;&nbsp;&nbsp;&nbsp;</span></td>
			        
			        <td><input type="radio" name="<portlet:namespace/>styleBullet" value="bullet_white_orange" <%= styleBullet.equals("bullet_white_orange") ? "checked":"" %>/>
			          &nbsp; Tr&#7855;ng cam <img src="<%= themeDisplay.getPathThemeImage() %>/DB_image/bullet_white_orange.gif" /></td>
			            
			        <td><input type="radio" name="<portlet:namespace/>styleTitle" value="title_orange" <%= styleTitle.equals("title_orange") ? "checked":"" %>/>
			          &nbsp; Da cam <img src="<%= themeDisplay.getPathThemeImage() %>/DB_image/title_bg_wrap_orange.gif" /></td>
			            
				   	<td>&nbsp;</td>
			      </tr>		
			           	
			   	  <tr height="30">
			        <td><input type="radio" name="<portlet:namespace/>styleBorder" value="border_green" <%= styleBorder.equals("border_green") ? "checked":"" %>/>
			          &nbsp; Xanh l&#225; c&#226;y <span class="border_green">&nbsp;&nbsp;&nbsp;&nbsp;</span></td>
			        <td></td>
			        <td><input type="radio" name="<portlet:namespace/>styleTitle" value="title_green" <%= styleTitle.equals("title_green") ? "checked":"" %>/>
			          &nbsp; Xanh l&#225; c&#226;y <img src="<%= themeDisplay.getPathThemeImage() %>/DB_image/title_bg_wrap_green.gif" /></td>
				    <td></td>			      
			  	 </tr> 		
			          	
			        <tr height="30">
			            <td><input type="radio" name="<portlet:namespace/>styleBorder" value="" <%= styleBorder.equals("") ? "checked":"" %>/>
			              <i>&nbsp; M&#7863;c &#273;&#7883;nh (Không có vi&#7873;n)</i></td>
			              
			            <td><input type="radio" name="<portlet:namespace/>styleBullet" value="" <%= styleBullet.equals("") ? "checked":"" %>/>
			              <i>&nbsp; M&#7863;c &#273;&#7883;nh (Không có bullet)</i></td>
			                
			            <td><input type="radio" name="<portlet:namespace/>styleTitle" value="" <%= styleTitle.equals("") ? "checked":"" %>/>
			              <i>&nbsp; M&#7863;c &#273;&#7883;nh (Không có n&#7873;n ti&#234;u &#273;&#7873;)</i></td>
			                
					    <td><input type="radio" name="<portlet:namespace/>styleContent" value="" <%= styleContent.equals("") ? "checked":"" %>/>
			              <i>&nbsp; M&#7863;c &#273;&#7883;nh (Không có n&#7873;n )</i></td>
			        </tr> 	  
			       </table>
			       </td>
			    </tr>
			        			
			     <tr>
				<td colspan="2" id="<portlet:namespace/>themes_SBN" <%= (themeType.equals("2"))?"":"style=\"display:none\"" %>>
				<table width="100%">
				<tr>
					<td width="50%"  valign="top">
					<table>
					 <tr height="25">
						<td><input type="radio" value="title_menuleft_xanh2" name="<portlet:namespace/>themeSelected" id="<portlet:namespace/>custom" <%= (themeSelected.equals("title_menuleft_xanh2"))?"checked":"" %>></td>
						<td><label for="<portlet:namespace/>custom">Tr&#432;&#7901;ng h&#7907;p &#273;&#7863;c bi&#7879;t</label></td>
					</tr> 
					 <tr height="25">
						<td><input type="radio" value="" name="<portlet:namespace/>themeSelected" id="<portlet:namespace/>default" <%= (themeSelected.equals(""))?"checked":"" %>></td>
						<td><label for="<portlet:namespace/>default">M&#7863;c &#273;&#7883;nh</label></td>
					</tr>
					
					 <tr height="25">
					 	 <td><input type="checkbox" name="<portlet:namespace/>isBorder" id="<portlet:namespace/>isBorder" <%=isBorder?"checked":""%>></td>
					 	 <td><label for="<portlet:namespace/>isBorder">Hi&#7875;n th&#7883; vi&#7873;n</label></td>
					 </tr>					 
					</table>
					</td>
						 
					<td valign="top">	 
					 <table width="100%">
				 	 <tr height="25">
					 	 <td bgcolor="#eff8e8" width="20" >&nbsp;&nbsp;</span></td>
					 	 <td align="left" style="padding-left:20px;">&nbsp;<input type="radio" name="<portlet:namespace/>bgcolor" id="<portlet:namespace/>bgcolor_1" value="#eff8e8" <%=bgcolor.equals("#eff8e8")?"checked":""%>>
					 	 <label for="<portlet:namespace/>bgcolor_1">Ch&#7885;n ki&#7875;u màu 1</label></td>
					 </tr>
					 <tr height="25">
					 	 <td bgcolor="#e0f1ff" width="20" >&nbsp;&nbsp;</span></td>
					 	 <td align="left" style="padding-left:20px;">&nbsp;<input type="radio" name="<portlet:namespace/>bgcolor" id="<portlet:namespace/>bgcolor_2" value="#e0f1ff" <%=bgcolor.equals("#e0f1ff")?"checked":""%>>
					 	 <label for="<portlet:namespace/>bgcolor_2">Ch&#7885;n ki&#7875;u màu 2</label></td>
					 </tr>
					 <tr height="25">
					 	 <td bgcolor="#fff4e8" width="20" >&nbsp;&nbsp;</span></td>
					 	 <td align="left" style="padding-left:20px;">&nbsp;<input type="radio" name="<portlet:namespace/>bgcolor" id="<portlet:namespace/>bgcolor_3" value="#fff4e8" <%=bgcolor.equals("#fff4e8")?"checked":""%>>
					 	 <label for="<portlet:namespace/>bgcolor_3">Ch&#7885;n ki&#7875;u màu 3</label></td>
					 </tr>
					 <tr height="25">
					 	 <td bgcolor="#ffffff" width="20" >&nbsp;&nbsp;</span></td>
					 	 <td align="left" style="padding-left:20px;">&nbsp;<input type="radio" name="<portlet:namespace/>bgcolor" id="<portlet:namespace/>bgcolor_4" value="#ffffff" <%=bgcolor.equals("#ffffff")?"checked":""%>>
					 	 <label for="<portlet:namespace/>bgcolor_4">M&#7863;c &#273;&#7883;nh</label></td>
					 </tr>
				 	 </table>	
					</td>	
				</tr>
			   </table>
			   </td>
			</tr>	
			</table>	
		</div>
			
		<br/>
			
		<table class="lfr-table" width="100%">
		<tr height="30">
			<td width="50%" valign="top">
				<table class="lfr-talbe">
					<tr height="30">	
						<td><b><label for="<portlet:namespace/>defaultSize">Hi&#7875;n th&#7883; qu&#7843;ng cáo v&#7899;i kích th&#432;&#7899;c m&#7863;c &#273;&#7883;nh</label></b></td>
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
						<td><b>C&#7845;u hình cho qu&#7843;ng cáo Flash, Clip:</b></td>
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
								<option value="none" <%= controlBar.equals("none")? "selected":""%>>Không hi&#7875;n th&#7883;</option>
								<option value="bottom" <%= controlBar.equals("bottom")? "selected":""%>>Hi&#7875;n th&#7883; &#7903; d&#432;&#7899;i</option>
								<option value="over" <%= controlBar.equals("over")? "selected":""%>>Hi&#7875;n th&#7883; &#7903; trên</option>
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

