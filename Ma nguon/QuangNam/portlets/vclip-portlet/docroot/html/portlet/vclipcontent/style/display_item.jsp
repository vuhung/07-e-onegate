<%
	Clip bean = (Clip) listItem.get(i);	
	PortletURL menuURL = PortletURLFactoryUtil.create(request,portletSelectId,plId, PortletRequest.RENDER_PHASE);
	menuURL.setParameter("jspPage","/html/portlet/vclipcontent/view.jsp");		
	menuURL.setParameter("clipId",String.valueOf(bean.getId()));
	menuURL.setParameter("test",String.valueOf(bean.getClipTypeId()));
	menuURL.setParameter(WebKeysVClip.CLIP_TYPE_ID,String.valueOf(bean.getClipTypeId()));	
	if(i % 3 == 0) {
%>
	<tr>
		<td id = "column1_clip">				
			<div style="text-align:center;">							
				<a href='<%= menuURL %>'> <img border="1" width="100" height="75" src="<%= themeDisplay.getPortalURL() %>/image/image_gallery?img_id=<%= (Long.valueOf(bean.getImage())+1) %>"></a>
				<p class="public_title"><%=bean.getTitle() %></p>				
			</div>
		</td>
		<%		
		
			}else if(i % 3 == 1) {
		%>
		<td id = "column2_clip">			
			<div style="text-align:center;">
				<a href="<%=menuURL%>"> <img border="1" width="100" height="75" src="<%= themeDisplay.getPortalURL() %>/image/image_gallery?img_id=<%= (Long.valueOf(bean.getImage())+1) %>"></a>
				<p class="public_title"><%=bean.getTitle() %></p>
			</div>
		</td>
		
		<%	
				
			}else {
		%>
		<td id ="column3_clip"> 
			<div style="text-align:center;">
				<a href="<%=menuURL%>"> <img border="1" width="100" height="75" src="<%= themeDisplay.getPathImage() %>/vimagegallery?img_id=<%= bean.getImage() %>"></a>
				<p class="public_title"><%=bean.getTitle() %></p>
			</div>
		</td>
	</tr>
		<%
			}
		%>