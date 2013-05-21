<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%
	String temp1 = "box_left_portlet " + styleBullet + " " +styleTitle;
	String temp2 = styleBorder;
	
	List listLinks = new ArrayList();
%>


<div class="<%=temp1%>">
	<div class="title">
		<div class="title_wrap">
			<div><%=titlePortlet%></div>
		</div> 
	</div>
	
	<div class="border_light_blue">
		<div class="defaultcontent">
		<table width="100%">
		<tr>
			<td>
		<%	for(int i=0;i<linkGroupIds.length;i++){
			LinkGroup linkGroup = LinkGroupServiceUtil.getLinkGroup(Long.parseLong(linkGroupIds[i]));
			listLinks = LinksServiceUtil.getByLinkG_GL(groupId, linkGroup.getLinkgroupId());
						
			%>
		<c:if test="<%= linkGroupIds.length < 3 %>">
			&nbsp;<div class="<%= i%2==0?"left":"right"%>">
				<div class="left" >
					<div><b>&nbsp;&nbsp;&nbsp;</b></div>
					<div>
						<table width="100%">
						
						<%	for(int j=0;j<listLinks.size();j++){
							Links link = (Links)listLinks.get(j);	%>
							<tr height="25">								
								<td style="padding-left:20px;"><a href="<%=link.getUrl()%>" target="blank"> <%=link.getName()%></td>								
							</tr>	
							
						<%}%>	
						
						</table>
					</div>
				</div>			
			</div>
		</c:if>	
		<c:if test="<%= linkGroupIds.length >= 3 %>">
			&nbsp;<div class="<%= i%3==0?"left3":"right3"%>">
				<div class="left3" >
					<div><b>&nbsp;&nbsp;&nbsp;</b></div>
					<div>
						<table width="100%">
						<%	for(int j=0;j<listLinks.size();j++){
							Links link = (Links)listLinks.get(j);	%>
							<tr height="25">	
								<td style="padding-left:20px;"><a href="<%=link.getUrl()%>" target="<%= (link.getIsTargetBlank())? "_blank":"_self"%>"> <%=link.getName()%></td>
							</tr>	
						<%}%>	
						</table>
					</div>
				</div>			
			</div>
		</c:if>
			<%}%>
			</td>
		</tr>
		</table>		
		</div>
</div>
			
