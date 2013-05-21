<%
	String temp1 = "box_left_portlet " + styleBullet + " " +styleTitle;
	String temp2 = styleBorder;
	
	List listLinks = new ArrayList();
	
	if(style==1){ 
		listLinks = LinksServiceUtil.getByLinkG_GL(groupId, Long.parseLong(linkgroupId));
	}else if(style==3){ 
		listLinks = LinksServiceUtil.getByGroupId(groupId);
	}
%>

<div class="<%=temp1%>">
	<div class="title">
		<div class="title_wrap">
			<div><%=titlePortlet%></div>
		</div> 
	</div>
	
	<div class="border_light_blue">
		<div class="defaultcontent">
		<table cellspacing="0" cellpadding="0" border="0" width="100%"> 
		<%	if(Validator.isNotNull(listLinks) && listLinks.size()>0){
				for(int i=0;i<listLinks.size();i++){
					Links link = (Links)listLinks.get(i);%>		
	   	<tr>
		 	<td width="5"></td>
		 	<td <%=(i<listLinks.size()-1)?"class='title_menu_first'":"class='title_menu'"%>>
	   			<a target="blank" href="<%=link.getUrl()%>"><%=link.getName()%> <%=link.getImageName()%></a>	   			
	   		</td>
	  		<td width="5"></td>
		</tr>
	  	<%}}%>
		</table>
		</div>
	</div>
</div>
			
