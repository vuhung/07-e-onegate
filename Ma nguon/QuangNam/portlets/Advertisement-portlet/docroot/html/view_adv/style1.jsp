<%@include file="/html/view_adv/init.jsp" %>

<%
 	String temp1 = "box_left_portlet " + styleBullet + " " +styleTitle;
 	String temp2 = styleBorder;
 	System.out.println(themeDisplay.getPathMain()+ "/vadvmanview/get_file?p_l_id=" + layout.getPlid() + "&folderId=" + item.getFolderId() + "&name=" +item.getName());
 	out.println(themeDisplay.getPathMain() + "/vadvmanview/get_file?p_l_id=" +layout.getPlid()+ "&folderId=" +item.getFolderId()+ "&name=" +item.getName());
%>

<% if(themeType.equals("1")){%> <!-- THEMES DIEN BIEN -->
<%	String style_portlet = styleBullet + " " + styleTitle; %> 	
<div class="<%=temp1%>">	
	<div class="title">
		<div class="title_wrap">
<%-- 			<div><%=titlePortlet%></div> --%>
		</div>
	</div>
	
	<div align="center" class="<%=temp2%>">		   
		<table width="100%" cellpadding="0" cellspacing="1" border="0">			
		<tr>
			<td>
				Hien thi voi kich thuoc mac dinh		
				<%	if (item.isExpired()){	%>
				<div align="center">
					<b>Qu&#7843;ng cáo này &#273;ã h&#7871;t h&#7841;n hi&#7875;n th&#7883;</b>
				</div>	
				<% } else {%>
				<c:if test="<%= _defaultSize%>">	
					<div align="center">		
						<a href="<%=item.getUrl()%>" target="<%= (item.getIsTargetBlank())? "_blank":"_self"%>" > <img alt="Anh quang cao chua duoc chon" src="<%= request.getContextPath()+"/"+ item.getName() %> ">
						<img src="<%= themeDisplay.getPortalURL() + themeDisplay.getPathContext() + "/documents/" + themeDisplay.getScopeGroupId() + StringPool.SLASH + item.getFolderId() + StringPool.SLASH + HttpUtil.encodeURL(HtmlUtil.unescape(dlf.getTitle())) %>" 
								title="<%= item.getTxtMouseOver()%>" /></a>
					</div>
				</c:if>
				
				Hien thi voi kich thuoc tuy chon
				<c:if test="<%= !_defaultSize%>">
					<div align="center">		
						<a href="<%=item.getUrl()%>" target="<%= (item.getIsTargetBlank())? "_blank":"_self"%>" > <img alt="Anh quang cao chua duoc chon" src="<%= request.getContextPath()+"/"+ item.getName() %> " title="<%= item.getTxtMouseOver()%>" width="<%=w%>" height="<%=h%>"/></a>
					</div>
				</c:if>	
				<%}%>	

			</td>
		</tr>
		</table>
	  </div>
</div>
<% }%> 