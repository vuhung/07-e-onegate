<script type="text/javascript" src="/vclip-portlet/html/portlet/view_vclip/swfobject.js"></script>
<%
String clipURL[]= new String[5];
String imageURL[]= new String[5];
%>

<%	
	List listTopClip = (List)request.getAttribute(WebKeysVClip.LIST_TOP_CLIP);
%>



<table width="100%">
	<tr height="3">
	    <td />
	</tr>
	<tr>
		<td class="bg_02">
			<b class="title1">VIDEO</b>
		</td>
	</tr>
	<tr>		
		<td>
			<table cellspacing="0" cellpadding="0" border="0" width="100%">
				<tr>
					<td align="center" id="vclipview-container" style="padding-top:5px;">
						<script language = "javascript">
							function getPlayer(gid) {		
								if(navigator.appName.indexOf("Microsoft") != -1) {
									return window[gid];
								} else {
									return document[gid];
								}
								
							};
							
							var player;
							
							function playerStopC(){
								
								player.sendEvent("STOP");
							}
							function playerStartC(){
								player.sendEvent("PLAY");
							}
							function playerNextC(){
								player.sendEvent("NEXT");
							}
							function playerPrevC(){
								player.sendEvent("PREV");
							}
							
										function playerReady(obj){
								
								player = getPlayer('plyc');
								
							var objArray = new Array(<%=listTopClip.size()%>);		
 								var lst = new Array();	
							//loop url vao mang gom cac tp khac
							for(var j = 0; j < <%=listTopClip.size()%>; j++) 
								{
									
									objArray[j] = {file:itemArray[j], type: 'video', title:'video 1', duration:0, start: 0,image:itemImage[j]};			
 									if(itemArray[j] != "null")
									{
 										lst[j] = objArray[j];
 									}
										
 								}
							player.sendEvent("LOAD",lst);		
						
					};	 	
						</script>
					</td>
				</tr> 
			    <tr>
					<td>
						<div class="text_video">
						<%
	                    	int indexList = listTopClip.size()<=3?listTopClip.size():3;	
							PortletURL menuURL = PortletURLFactoryUtil.create(request,portletResource,plId1, PortletRequest.RENDER_PHASE);
							menuURL.setParameter("jspPage","/html/portlet/view_vclip/view.jsp");			
							for(int i=0;i < indexList;i++){
								Clip clipBean = (Clip)listTopClip.get(i);		
								menuURL.setParameter("clipId",String.valueOf(clipBean.getId()));													
								menuURL.setParameter(WebKeysVClip.CLIP_TYPE_ID,String.valueOf(clipBean.getClipTypeId()));							
						%>		
								<div class="text_01"> <a href="<%=menuURL.toString()%>"><%=StringUtil.shorten(clipBean.getTitle(),40) %></a></div>													
						<%
							}
						%>	   
				    	</div>										   
					</td>
				</tr>													   
			</table>				
		</td>														
	</tr>
	<tr>
		<td height="10">
		</td>
	</tr>
</table>

<script type="text/javascript">           
		var s1 = new SWFObject("/vclip-portlet/html/portlet/view_vclip/player.swf","plyc","<%=widthSize%>","<%=heightSize%>","9","#FFFFFF");		      		      
	s1.addParam("allowfullscreen","true");
		s1.addParam("allowscriptaccess","always");
		s1.addParam("wmode","transparent");			  
		s1.addParam("flashvars",'&displayclick=play&autostart=false&playlist=none&fullscreen=true');
	s1.write("vclipview-container");	    
</script>
<script language = "javascript">
	var itemArray = new Array(<%=listTopClip.size()%>);
	var itemImage = new Array(<%=listTopClip.size()%>);		
</script>
<%
	for(int i=0;i< listTopClip.size();i++)
	{	
		Clip clipBean = (Clip)listTopClip.get(i);		
		clipURL[i] = themeDisplay.getPortalURL()+themeDisplay.getPathContext()+"/documents/" + themeDisplay.getScopeGroupId() +clipBean.getUrl();			
		imageURL[i] = themeDisplay.getPathImage()+"/image_gallery?img_id="+clipBean.getImage();
		%>
			<script language = "javascript">		
				//dua url vao mang String				
				itemArray[<%=i%>] = "<%=clipURL[i]%>";
				itemImage[<%=i%>] = "<%=imageURL[i]%>";
			</script>		
		<%	
	}
%>