<%@ include file="/html/portlet/vpolls/init.jsp" %>
	
<%
	questionId = ParamUtil.getLong(request, "questionId", questionId);

	List questions = PollsQuestionLocalServiceUtil.getQuestions(portletGroupId.longValue());
%>	
	
<script type="text/javascript">	
	function <portlet:namespace />changeTheme(styleObj) {
		if(styleObj)
			if(styleObj.value==1){		
				document.getElementById("<portlet:namespace/>themes_SBN").style.display = '';
			}else if(styleObj.value==2){				
				document.getElementById("<portlet:namespace/>themes_SBN").style.display = 'none';
			}
	}	
	
	function <portlet:namespace />savePreferences() {
		submitForm(document.<portlet:namespace />fm, 
		'<portlet:actionURL name="savePreferences" windowState="<%= WindowState.MAXIMIZED.toString() %>"></portlet:actionURL>');
	}
</script>

<form  action="<portlet:actionURL><portlet:param name="struts_action" value="/vpolls/edit" />
	</portlet:actionURL>" name="<portlet:namespace />fm" method="POST">

	<input name="<portlet:namespace /><%= Constants.CMD %>" type="hidden" value="<%= Constants.UPDATE %>" />
<table width="100%" cellspacing="1" cellpadding="4" border="0" align="center">

<tr>
	<td width="100%" valign="top">
		<fieldset style="border:1px dotted gray;"> 
			<legend><strong>C&#7845;u h�nh</strong></legend>
			<table>
			<tr height="30">
				<td>Ch&#7885;n c�u h&#7887;i:</td>
				<td>
					<select name="<portlet:namespace />questionId">
						<%
							for (int i = 0; i < questions.size(); i++) {
								PollsQuestion question = (PollsQuestion)questions.get(i);
								question = question.toEscapedModel();
						%>
							<option <%= (questionId == question.getQuestionId()) ? "selected" : "" %>
								value="<%= question.getQuestionId() %>"><%= question.getTitle() %></option>
						<%
							}
						%>

					</select>
				</td>
			</tr>
			
			<tr height="30">			
				<td>T�y bi&#7871;n ti�u &#273;&#7873; PORTLET</td>
				<td><input type="text" name="<portlet:namespace/>titlePortlet" value="<%=titlePortlet%>" style="width:200px;"></td>
			
			</tr>
						
				
			<tr height="30">
				<td><b>T�y bi&#7871;n theo THEMES</b></td>
				<td>
					<input type="radio" value="1" name="<portlet:namespace/>themeType" id="<portlet:namespace/>themeType_1" 
						<%=themeType.equals("1")?"checked":""%> onchange="<portlet:namespace />changeTheme(this)">
						<label for="<portlet:namespace/>themeType_1">Themes c�c s&#7903; ban ng�nh</label>
					&nbsp;&nbsp;
					<input type="radio" value="2" name="<portlet:namespace/>themeType" id="<portlet:namespace/>themeType_2" 
						<%=themeType.equals("2")?"checked":""%> onchange="<portlet:namespace />changeTheme(this)">
						<label for="<portlet:namespace/>themeType_2">Trang Doanh nghi&#7879;p, Ng&#432;&#7901;i d�n, Du kh�ch</label>
				</td>
			</tr>
				
			<tr><td colspan="2">&nbsp;</td></tr>			

			<tr>
				<td colspan="2" id="<portlet:namespace/>themes_SBN" <%= (themeType.equals("1"))?"":"style=\"display:none\"" %>>
				<table width="100%">
				<tr>
					<td width="33%"  valign="top">
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
						 
					<td width="33%" valign="top">	 
					 <table>
				 	 <tr height="25">
					 	 <td bgcolor="#eff8e8" width="20" >&nbsp;&nbsp;</span></td>
					 	 <td align="left" style="padding-left:20px;">&nbsp;<input type="radio" name="<portlet:namespace/>bgcolor" id="<portlet:namespace/>bgcolor_1" value="#eff8e8" <%=bgcolor.equals("#eff8e8")?"checked":""%>>
					 	 <label for="<portlet:namespace/>bgcolor_1">Ch&#7885;n ki&#7875;u m�u 1</label></td>
					 </tr>
					 <tr height="25">
					 	 <td bgcolor="#e0f1ff" width="20" >&nbsp;&nbsp;</span></td>
					 	 <td align="left" style="padding-left:20px;">&nbsp;<input type="radio" name="<portlet:namespace/>bgcolor" id="<portlet:namespace/>bgcolor_2" value="#e0f1ff" <%=bgcolor.equals("#e0f1ff")?"checked":""%>>
					 	 <label for="<portlet:namespace/>bgcolor_2">Ch&#7885;n ki&#7875;u m�u 2</label></td>
					 </tr>
					 <tr height="25">
					 	 <td bgcolor="#fff4e8" width="20" >&nbsp;&nbsp;</span></td>
					 	 <td align="left" style="padding-left:20px;">&nbsp;<input type="radio" name="<portlet:namespace/>bgcolor" id="<portlet:namespace/>bgcolor_3" value="#fff4e8" <%=bgcolor.equals("#fff4e8")?"checked":""%>>
					 	 <label for="<portlet:namespace/>bgcolor_3">Ch&#7885;n ki&#7875;u m�u 3</label></td>
					 </tr>
					 <tr height="25">
					 	 <td bgcolor="#ffffff" width="20" >&nbsp;&nbsp;</span></td>
					 	 <td align="left" style="padding-left:20px;">&nbsp;<input type="radio" name="<portlet:namespace/>bgcolor" id="<portlet:namespace/>bgcolor_4" value="#ffffff" <%=bgcolor.equals("#ffffff")?"checked":""%>>
					 	 <label for="<portlet:namespace/>bgcolor_4">M&#7863;c &#273;&#7883;nh</label></td>
					 </tr>
				 	 </table>	
					</td>
					
					<td valign="top">		
						<table>
						 <tr height="25">	 
						 	 <td>
						 	 	<select name="<portlet:namespace />paddingLeft" >
						 	 	<%for(int i=0;i<10;i++){%>
						 	 		<option value="<%=i%>" <%=(paddingLeft==i)?"selected":""%>><%=i%></option>
						 	 	<%}%>
						 	 	</select>
						 	 </td>
						 	 <td>&nbsp;C&#259;n l&#7873; tr�i</td>		
						 </tr>	 
						 <tr height="25">	 
						 	 <td>
						 	 	<select name="<portlet:namespace />paddingRight" >
						 	 	<%for(int j=0;j<10;j++){%>
						 	 		<option value="<%=j%>" <%=(paddingRight==j)?"selected":""%>><%=j%></option>
						 	 	<%}%>
						 	 	</select>
						 	 </td>
						 	 <td>&nbsp;C&#259;n l&#7873; ph&#7843;i</td>		
						 </tr>	 	 
						</table>
					</td>	
				</tr>
			   </table>
			   </td>
			</tr>	
						
			</table>
		</fieldset>
	</td>
</tr>
<tr>
	<td><input type="button" value="<liferay-ui:message key="save" />" onClick="<portlet:namespace />savePreferences();"></td>
</tr>
</table>
						
</form>
