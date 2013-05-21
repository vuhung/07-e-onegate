<%@include file="init.jsp"%>
	
<%
	List listBranch = new ArrayList();	
	List listByParent = new ArrayList();	
%>	

<% if (themeType.equals("2")){%>

<table cellspacing="0" cellpadding="0" border="0" width="98%" align="center">
<tr>	
	<td class="bg_title_news2">
	<table cellspacing="0" cellpadding="0" border="0" align="left" width="100%">
	<tr>
		<td width="40">&nbsp;</td>
		<td width="<%=titlePortlet.length() + 100%>" align="center" class="title_news"><%=titlePortlet%></td>
		<td>&nbsp;</td>
	</tr>
	</table>
	</td>
</tr>	
</table>

<div>
	
<table class="site-map" width="91%" cellspacing="0" cellpadding="0" border="0" align="center">
<tr><td height="10"></td></tr>		
<%
	listBranch = VsmBranchServiceUtil.getByG_L_P(groupId, language, 0);	
	for (int i=0;i<listBranch.size();i++){
		VsmBranch branch = (VsmBranch)listBranch.get(i);
%>
<tr>
	<td>
		<a href="<%=branch.getHref()%>" target="_blank"><%= branch.getName()%></a>
		<table class="sub-smap" width="100%" cellspacing="0" cellpadding="0" border="0">

				<%
					listByParent = VsmBranchServiceUtil.getByG_L_P(groupId, language,branch.getBranchId());
					for(int j=0;j<listByParent.size();j++){
						VsmBranch b = (VsmBranch)listByParent.get(j);
				%>
				<tr>
					<td width="30%"/>
					<td><a href="<%=b.getHref()%>"><%= b.getName()%></td>							
				</tr>
				<%
					}	
				%>

		</table>
	</td>			
</tr>
	<%}	%>	
<tr><td height="10"></td></tr>				
</table>
	
</div>	
<% } else if (themeType.equals("3")){ %> <!--  Giao dien  trang DN _ ND _ DK -->

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
						
					<table class="site-map" width="91%" cellspacing="0" cellpadding="0" border="0" align="center">
					<tr><td height="10"></td></tr>		
					<%
						listBranch = VsmBranchServiceUtil.getByG_L_P(groupId, language, 0);	
						for (int i=0;i<listBranch.size();i++){
							VsmBranch branch = (VsmBranch)listBranch.get(i);
					%>
					<tr>
						<td>
							<a href="<%=branch.getHref()%>"><%= branch.getName()%></a>
							<table class="sub-smap" width="100%" cellspacing="0" cellpadding="0" border="0">

									<%
										listByParent = VsmBranchServiceUtil.getByG_L_P(groupId, language,branch.getBranchId());
										for(int j=0;j<listByParent.size();j++){
											VsmBranch b = (VsmBranch)listByParent.get(j);
									%>
									<tr>
										<td width="30%"/>
										<td><a href="<%=b.getHref()%>"><%= b.getName()%></td>							
									</tr>
									<%
										}	
									%>

							</table>
						</td>			
					</tr>
						<%}	%>	
					<tr><td height="10"></td></tr>				
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
<tr><td height="4px" colspan="3"></td></tr>		
</table>


<%	} %>