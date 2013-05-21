<%@page import="com.vportal.portlet.vpolls.util.WebKeysExt"%>
<%@page import="java.util.Iterator"%>
<%@ include file="/html/portlet/vpolls/init.jsp" %>
<%@ page import="com.liferay.portal.util.*" %>
<script type="text/javascript">	
	
	function <portlet:namespace />Vote(){
		if(document.getElementsByName("<portlet:namespace/>choiceId").checked = false){
			alert('Ban hay chon 1 lua chon');
			return false;
		}
	}
	
	function <portlet:namespace />SubmitVote(){
		submitForm(document.<portlet:namespace />fm);		
	}
</script>
	
<%
	PollsQuestion question = (PollsQuestion)request.getAttribute(WebKeysExt.POLLS_QUESTION);
	List choices = (List)request.getAttribute("choices");
	question = question.toEscapedModel();	
	String choiceId = (String)request.getAttribute("choiceId");
%>
<liferay-ui:success key="vote_added" message="thank-you-for-your-vote" />
<liferay-ui:error exception="<%= DuplicateVoteException.class %>" message="you-may-only-vote-once" />
<liferay-ui:error exception="<%= NoSuchChoiceException.class %>" message="please-select-an-option" />

	
<form action="<portlet:renderURL><portlet:param name="struts_action" value="/vpolls/view" />
	</portlet:renderURL>" method="post" name="<portlet:namespace />fm">
<input name="<portlet:namespace /><%= Constants.CMD %>" type="hidden" value="<%= Constants.ADD %>" />
<input name="<portlet:namespace />questionId" type="hidden" value="<%= question.getQuestionId() %>" />	
	
	
<% if(themeType.equals("2")){%> 
			
<table width="100%" border="0" cellspacing="0" cellpadding="0">
<tr>
	<td width="4" align="left" height="5">
		<img src="<%= themeDisplay.getPathThemeImage() %>/DB_image/1.gif" width="4" height="5"/></td>	
	<td height="3" background="<%= themeDisplay.getPathThemeImage() %>/DB_image/3.gif"></td>
	<td width="4" align="right">
		<img src="<%= themeDisplay.getPathThemeImage() %>/DB_image/2.gif" width="4" height="5" /></td>
</tr>
		
<tr>
   	<td width="4" align="left" background="<%= themeDisplay.getPathThemeImage() %>/DB_image/7.gif"></td>
	<td>
		<table width="100%" border="0" cellspacing="0" cellpadding="0" >
		<tr><td height="3px"></td></tr>
	
		<tr><td width="3px"></td>
		    <td>
				<table width="100%" border="0" cellspacing="0" cellpadding="0">
				<tr>
					<td width="17"><img src="<%= themeDisplay.getPathThemeImage() %>/DB_image/9.gif" width="17" height="30"/></td>
					<td width="100%" background="<%= themeDisplay.getPathThemeImage() %>/DB_image/10.gif" height="30" style="color:#FFFFFF;font-size:11px;font-weight:bold;text-transform:uppercase;" valign="middle">&nbsp;<%=titlePortlet%></td>
				</tr>
				<tr>
					<td colspan="2">			
				
					 <table width="100%" cellpadding="0" cellspacing="0" border="0">
					<tr style="text-align: left;">
						<td colspan="2" style="padding-left:3px;padding-right:3px;">					
							<p align="justify"><%= question.getDescription()%></p>
						</td>
					</tr>
											
					<tr>
						<td colspan="2">
						<%
							int windowHeight = 200;
							Iterator itr = choices.iterator();	
							while (itr.hasNext()) {
								PollsChoice choice = (PollsChoice)itr.next();
								choice = choice.toEscapedModel();
								windowHeight = windowHeight + 50;
						%>	
							<table>
							<tr>
								<td style="padding-top:10px;padding-left:5px;">
									<input type="radio" name="<portlet:namespace />choiceId" id="<portlet:namespace />choiceId"
										value="<%= choice.getChoiceId() %>" style="margin: 1pt 5px 1pt 0pt;" 
										<%= (String.valueOf(choice.getChoiceId()).equals(choiceId)) ? "checked":""%>	/>
								</td>
								<td style="padding-top:10px;">
									<label for="<portlet:namespace />choiceId" style="cursor: pointer; color:#3175B9;" class="text_none" ><%=choice.getDescription()%></label>
								</td>
							</tr>
							</table>
							<%	}	%>	
						</td>
					</tr>
					
					<tr>
						<td style="padding-top:10px;padding-bottom:5px;" align="center">
							<input type="button" onClick="<portlet:namespace/>SubmitVote();" value="<liferay-ui:message key="vote" />"></td>									
						<td style="padding-top:10px;padding-bottom:5px;"  align="center">
							<input type="button" value="<liferay-ui:message key="vote-results" />" onClick="var slideShowWindow = window.open('<portlet:renderURL windowState="<%= LiferayWindowState.POP_UP.toString() %>">
								<portlet:param name="jspPage" value="/html/portlet/vpolls/results.jsp"/>
								<portlet:param name="questionId" value="<%= String.valueOf(question.getQuestionId())%>" />
								</portlet:renderURL>', 'slideShow', 'directories=no,location=no,menubar=no,resizable=yes,width=400,height=<%= windowHeight%>,left='.concat((screen.width - 400)/2).concat(',top=').concat((screen.height - 300)/2)); void(''); slideShowWindow.focus();"> 
						</td>											
					</tr>
					</table>
											
					</td>
				</tr>
				</table>
			</td>
			<td width="3px"></td>
		</tr>			 
		</table>
	</td>
	<td width="4" align="right" background="<%= themeDisplay.getPathThemeImage() %>/DB_image/8.gif"></td>	
</tr>
			
<tr>
	<td width="4" align="left" height="5">
		<img src="<%= themeDisplay.getPathThemeImage() %>/DB_image/6.gif" width="4" height="5"/></td>
	<td background="<%= themeDisplay.getPathThemeImage() %>/DB_image/4.gif" height="5"></td>
	<td width="4" align="right">
		<img src="<%= themeDisplay.getPathThemeImage() %>/DB_image/5.gif" width="4" height="5" /></td>
</tr>
	
<tr><td colspan="3" height="4px;"></td></tr>
</table>
				
<%}else if(themeType.equals("1")){%> 				

<%if(isBorder){%>		
<div align="center"  style="padding-left:<%=paddingLeft%>px;padding-right:<%=paddingRight%>px;padding-top:3px;" class="boder9b9e9f">	
<%}else{%>	
<div align="center"  style="padding-left:<%=paddingLeft%>px;padding-right:<%=paddingRight%>px;">		
<%}%>						
<table cellspacing="3" cellpadding="5" border="0" width="100%">
<tr>
    <td bgcolor="#ffffff">
    <table cellspacing="0" cellpadding="0" border="0" width="100%">	
	<tr>	
		<td <%=(Validator.isNotNull(themeSelected))? "class='title_menuleft_xanh2'":"class='title_menuleft_xanh'"%>>&nbsp;<%=titlePortlet%></td>	
	</tr>
	<tr>
		<td height="75" >
	 		<table cellspacing="0" cellpadding="0" border="0" width="100%" >    
			<tr>
				<td  bgcolor="<%=bgcolor%>">
				<table cellspacing="3" cellpadding="5" border="0" align="center" width="100%">
				<tr style="text-align: left;">
				<td colspan="2" style="padding-left:3px;padding-right:3px;">					
					<p align="justify"><%= question.getDescription()%></p>
				</td>
				</tr>
									
				<tr>
					<td colspan="2">
						<table>
						<%
							int windowHeight = 200;
							Iterator itr = choices.iterator();	
							while (itr.hasNext()) {
								PollsChoice choice = (PollsChoice)itr.next();
								choice = choice.toEscapedModel();
								windowHeight = windowHeight + 50;
						%>	
						<tr>
							<td style="padding-left:5px;">
								<input type="radio" name="<portlet:namespace />choiceId" id="<portlet:namespace />choiceId_<%=choice.getChoiceId()%>"
									value="<%= choice.getChoiceId() %>" style="margin: 1pt 5px 1pt 0pt;" 
									<%= (String.valueOf(choice.getChoiceId()).equals(choiceId)) ? "checked":""%>	/>
							</td>
							<td style="padding-top:10x;">
								<label for="<portlet:namespace />choiceId_<%=choice.getChoiceId()%>" style="cursor: pointer; color:#3175B9;" class="text_none" ><%=choice.getDescription()%></label>
							</td>
						</tr>
						<%	}	%>	
						</table>
					
					</td>
				</tr>
					
				<tr>
					<td style="padding-top:10px;padding-bottom:5px;" align="center">
						<input type="button" onClick="<portlet:namespace/>SubmitVote();" value="<liferay-ui:message key="vote" />"></td>									
					<td style="padding-top:10px;padding-bottom:5px;"  align="center"> 
						<input type="button" value="<liferay-ui:message key="vote-results" />" onClick="var slideShowWindow = window.open('<portlet:renderURL windowState="<%= LiferayWindowState.POP_UP.toString() %>">
							<portlet:param name="jspPage" value="/html/portlet/vpolls/results.jsp"/>
							<portlet:param name="questionId" value="<%= String.valueOf(question.getQuestionId())%>" />
							</portlet:renderURL>', 'slideShow', 'directories=no,location=no,menubar=no,resizable=yes,width=400,height=<%= windowHeight%>,left='.concat((screen.width - 400)/2).concat(',top=').concat((screen.height - 300)/2)); void(''); slideShowWindow.focus();"> 
					</td>											
				</tr>
				</table>
				</td>	

			</tr>
			<tr><td height="5"></td></tr>			
		    </table>    			
		</td>		
	</tr>
	</table>	
	</td>	
</tr>
<tr><td height="5"></td></tr>				
</table>		
</div>		
	
<%}%>				
</form>
