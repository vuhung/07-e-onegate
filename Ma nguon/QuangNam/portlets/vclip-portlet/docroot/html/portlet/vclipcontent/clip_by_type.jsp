<table width="100%">
	<tr>
		<td>&nbsp;</td>
		<td width="33%">&nbsp;</td>
		<td width="33%">&nbsp;</td>
	</tr>	
<%
	List clipListByType = (List)request.getAttribute("clipListByType");
	List clipList = (List)request.getAttribute("clipList");
	String selectedType = ParamUtil.getString(request,"selectedType");	
	if(Validator.isNotNull(clipListByType)){
		clipList = clipListByType;
	}
	
	//Phan trang
	String sPageNum = ParamUtil.getString(request, "pagenum", "1");
	int numberPage = 1;
	if(Validator.isNotNull(sPageNum)){
		numberPage = Integer.parseInt(sPageNum);
	}
	int total = clipList.size();
	int per = Integer.parseInt(displayClipNumber);
	int pages = (total % per == 0) ? total / per : total / per + 1;		
	int begin = per * (numberPage - 1);
	int end = (total>per * numberPage) ? per * numberPage : total;
	
	List listItem = clipList.subList(begin,end);
	PortletURL portletURL = renderResponse.createRenderURL();
	portletURL.setParameter("jspPage","/html/portlet/vclipcontent/view.jsp");
	
	//View list
	for(int i= 0; i < listItem.size();i++){
		Clip clipObj = (Clip)listItem.get(i);
		if(i%3==0){
%>
		<tr>					
			<td align="center" style="vertical-align: top;">
				<a style="cursor:pointer;" onclick="getFileUrl('<%=clipObj.getUrl() %>','<%=clipObj.getId() %>')">
					<%
						if(Validator.isNotNull(clipObj.getImage())){
					%>
						<img onclick="inceaseCounterview(<%=clipObj.getId()%>)" class="thumbnailborder" width="120" height="90" src="<%= themeDisplay.getPathImage() %>/image_gallery?img_id=<%= clipObj.getImage() %>" />
					<%
						}else{
							
					%>
						<img onclick="inceaseCounterview(<%=clipObj.getId()%>)" class="thumbnailborder" width="120" height="90" src="/html/portlet/vcms/images.jpg" />
					<%																
						}
					%>
				</a><br>							
				<p class="text_none">
					<a  style="cursor:pointer; text-decoration: none;" onclick="getFileUrl('<%=clipObj.getUrl() %>','<%=clipObj.getId() %>');inceaseCounterview(<%=clipObj.getId()%>)"><%=clipObj.getTitle() %></a>
				</p>								
			</td>
		<%
			}else if(i%3==1){
		%>
			<td align="center" style="vertical-align: top;">
				<a style="cursor:pointer;" onclick="getFileUrl('<%=clipObj.getUrl() %>','<%=clipObj.getId() %>')">
					<%
						if(Validator.isNotNull(clipObj.getImage())){
					%>
						<img onclick="inceaseCounterview(<%=clipObj.getId()%>)" class="thumbnailborder" width="120" height="90" src="<%= themeDisplay.getPathImage() %>/image_gallery?img_id=<%= clipObj.getImage() %>" />
					<%
						}else{
							
					%>
						<img onclick="inceaseCounterview(<%=clipObj.getId()%>)" class="thumbnailborder" width="120" height="90" src="/html/portlet/vcms/images.jpg" />
					<%																
						}
					%>
				</a><br>							
				<p class="text_none">
					<a style="cursor:pointer; text-decoration: none;" onclick="getFileUrl('<%=clipObj.getUrl() %>','<%=clipObj.getId() %>');inceaseCounterview(<%=clipObj.getId()%>)"><%=clipObj.getTitle() %></a>
				</p>								
			</td>					
		<%
			}else{
		%>
			<td align="center" style="vertical-align: top;">
				<a style="cursor:pointer;" onclick="getFileUrl('<%=clipObj.getUrl() %>','<%=clipObj.getId() %>')">
					<%
						if(Validator.isNotNull(clipObj.getImage())){
					%>
						<img onclick="inceaseCounterview(<%=clipObj.getId()%>)" class="thumbnailborder" width="120" height="90" src="<%= themeDisplay.getPathImage() %>/image_gallery?img_id=<%= clipObj.getImage() %>" />
					<%
						}else{
							
					%>
						<img onclick="inceaseCounterview(<%=clipObj.getId()%>)" class="thumbnailborder" width="120" height="90" src="/html/portlet/vcms/images.jpg" />
					<%																
						}
					%>
				</a><br>							
				<p class="text_none">
					<a style="cursor:pointer; text-decoration: none;" onclick="getFileUrl('<%=clipObj.getUrl() %>','<%=clipObj.getId() %>');inceaseCounterview(<%=clipObj.getId()%>)"><%=clipObj.getTitle() %></a>
				</p>								
			</td>
		</tr>
		<%
			}
		}		
	%>
		
	<c:if test='<%= pages > 1 %>'>			
	<tr>
		<td class="text_none" height="40">
		<p>
			<strong>&nbsp;&nbsp;&nbsp;Trang&nbsp;&nbsp;</strong>
			<% 	
				if(numberPage >1){
					int intPrev = numberPage-1;%>
					<span><a class="style1" href="#" onclick="self.location = '<portlet:renderURL windowState="<%=WindowState.NORMAL.toString() %>"> 
						<portlet:param name="struts_action" value="/vclipcontent/view" />
						<portlet:param name="pagenum" value="<%= String.valueOf(intPrev) %>" />
						<%
							if(selectedType != null||!selectedType.equalsIgnoreCase("")){						
						%>
							<portlet:param name="selectedType" value="<%=String.valueOf(selectedType)%>"/>
						<%
							}	
						%>										
						</portlet:renderURL>';" >&lsaquo;&lsaquo; Tr&#432;&#7899;c</a></span>

			<%
				}
			%>				
			
			<% 
				for(int i = 1;i <= pages;i++){ 	
					if( i == numberPage ){%>
					<strong><a class="menu_left" href="#" onclick="self.location = '<portlet:renderURL windowState="<%=WindowState.NORMAL.toString() %>"> 
						<portlet:param name="struts_action" value="/vclipcontent/view" />					
						<portlet:param name="pagenum" value="<%= String.valueOf(i) %>" />
						<%
							if(selectedType != null||!selectedType.equalsIgnoreCase("")){						
						%>
							<portlet:param name="selectedType" value="<%=String.valueOf(selectedType)%>"/>
						<%
							}	
						%>									
						</portlet:renderURL>';" > <%=i%></a></strong>
			<%
				}else{
					
			%>	
					<strong><a class="text_download" href="#" onclick="self.location = '<portlet:renderURL windowState="<%=WindowState.NORMAL.toString() %>"> 
						<portlet:param name="struts_action" value="/vclipcontent/view" />
						<portlet:param name="pagenum" value="<%= String.valueOf(i) %>" />
						<%
							if(selectedType != null||!selectedType.equalsIgnoreCase("")){						
						%>
							<portlet:param name="selectedType" value="<%=String.valueOf(selectedType)%>"/>
						<%
							}	
						%>	
						</portlet:renderURL>';" > <%=i%></a></strong>
			<%
					}
			 	} 
		 	%>
		 	
				
			<% 	
				if(numberPage < pages){
					int intNext = numberPage + 1;
			%>
					<a class="text_download" href="#" onclick="self.location = '<portlet:renderURL windowState="<%=WindowState.NORMAL.toString() %>"> 
						<portlet:param name="struts_action" value="/vclipcontent/view" />						
						<portlet:param name="pagenum" value="<%= String.valueOf(intNext) %>" />
						<%
							if(selectedType != null||!selectedType.equalsIgnoreCase("")){						
						%>
							<portlet:param name="selectedType" value="<%=String.valueOf(selectedType)%>"/>
						<%
							}	
						%>	
						</portlet:renderURL>';" >Ti&#7871;p &rsaquo;&rsaquo;</a></td>
			<%
				}
			%>		
		</td>
	</tr>
	</c:if>	
</table>
<%
	if(clipListByType!=null){
%>
<c:if test="<%= clipListByType.size()== 0%>">	
	<div>
		<p class="public_title" style="margin-left:10px;">Ch&#432;a c&#243; clip n&#224;o trong chuy&#234;n m&#7909;c n&#224;y </p>
	</div>
</c:if>	
<%
	}
%>