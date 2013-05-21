

<%@page import="com.vportal.portlet.vimagegallery.model.TFCategory"%>
<%if(isBorder){%>		
<div align="center"  style="padding-left:<%=paddingLeft%>px;padding-right:<%=paddingRight%>px;padding-top:3px;border-style:groove;" >	
<%}else{%>	
<div align="center"  style="padding-left:<%=paddingLeft%>px;padding-right:<%=paddingRight%>px;">		
<%}%>				
<table cellspacing="3" cellpadding="5" border="0" width="100%">
<tr>
    <td bgcolor="#ffffff">
    <table cellspacing="0" cellpadding="0" border="0" width="100%">	
	<tr>	
		<td <%=(Validator.isNotNull(themeSelected))? "class='title_menuleft_xanh2'":"class='title_menuleft_xanh'"%>>&nbsp;<%=title%></td>	
	</tr>
	<tr>
		<td>
	 	<table cellspacing="0" cellpadding="0" border="0" align="center" width="95%">
		<%	for (int i=0;i<listCategory.size();i++){	
			TFCategory category = (TFCategory)listCategory.get(i);
			categoryURL.setParameter("categoryId", String.valueOf(category.getId()));
			%>	
		<tr>				 
			<td align="left" <%=(i==0)?"class='title_menu_first'":"class='title_menu'"%>><a href="<%=categoryURL%>"><%= category.getName()%></a></td>  
		</tr>
			<%}%>		
		</table>
		</td>		
	</tr>
	</table>	
	</td>	
</tr>
<tr><td height="5"></td></tr>				
</table>		
</div>

<c:if test="<%=isBorder%>">
<div style="height:5px;">&nbsp;</div>
</c:if>
