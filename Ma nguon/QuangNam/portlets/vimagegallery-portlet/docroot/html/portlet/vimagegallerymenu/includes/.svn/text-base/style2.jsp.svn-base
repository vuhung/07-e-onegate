

<%@ taglib uri="http://liferay.com/tld/theme" prefix="liferay-theme" %>
<liferay-theme:defineObjects />

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
					<td width="100%" background="<%= themeDisplay.getPathThemeImage() %>/DB_image/10.gif" height="30" style="color:#FFFFFF;font-size:11px;font-weight:bold;text-transform:uppercase;" valign="middle" align="left"><%=title%></td>
				</tr>
				<tr>
					<td colspan="2">			

			 	<table cellspacing="0" cellpadding="0" border="0" align="center" width="95%">
				<%	for (int i=0;i<listCategory.size();i++){
						TFCategory category = (TFCategory)listCategory.get(i);	
						categoryURL.setParameter("categoryId", String.valueOf(category.getId()));	%>
				<tr>				 
					<td align="left" <%=(i==0)?"class='title_menu_first'":"class='title_menu'"%>><a href="<%=categoryURL%>"><%= category.getName()%></a></td>  
				</tr>
					<%}%>		
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
	<td width="196" background="<%= themeDisplay.getPathThemeImage() %>/DB_image/4.gif" height="5"></td>
	<td width="4" align="right">
		<img src="<%= themeDisplay.getPathThemeImage() %>/DB_image/5.gif" width="4" height="5" /></td>
</tr>

<tr><td colspan="3" height="4"></td></tr>		
</table>