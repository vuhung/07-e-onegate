
<script type="text/javascript" src="/vclip-portlet/html/portlet/vclipcontent/swfobject.js">	
  </script>
<%	
	String clipTypeId = ParamUtil.getString(request, WebKeysVClip.CLIP_TYPE_ID);

	List clipTypeList = null;
	List clipList = null;
	
	clipTypeList = (List)request.getAttribute("clipTypeList");
	clipList = (List)request.getAttribute("clipList");
	Clip reqClip= (Clip)request.getAttribute(WebKeysVClip.CLIP);
	
	List cList=clipList;
	if(reqClip==null){
		reqClip= new ClipImpl();
	}
	if(cList==null){
		cList= new ArrayList();
	}
	if(Validator.isNotNull(reqClip.getId())){
		//lay title clipType khi khong chon tu category
		Clip clipObject = ClipServiceUtil.findById(reqClip.getId());
		clipTypeId = clipObject.getClipTypeId();
		ClipType clipType = new ClipTypeImpl();
		if(Validator.isNotNull(clipType))
		{
			try{
				 clipType = ClipTypeServiceUtil.findById(clipTypeId);
			}
			catch(Exception ex)
			{}
		}
		%>
		<table width="100%">
			<tr height="3"><td></td></tr>				
			<tr>
			    <td class="center_top_background" width="100%">
			    	<table width="100%">
			    		<tr>
			    			<td id="left_top_tab"></td>		    			
			    			<td>
			    				<div align="left" class="title1"><%=clipType.getTitle()%></div>
			    			</td>
							<td id="right_top_tabs"></td>
							
							
				   		</tr>
				   </table>	
				</td>
			</tr>
		</table>
	<table width="100%" border="0" cellspacing="0" cellpadding="0">
        <tr>
        <td class="boder_top"> 	
			<table width="100%">
				<tr><td colspan="3">&nbsp;</td></tr>
				<tr valign="top">
					<td width="328">
						<table>
							<tr>
								<td width="7"></td>
								<td width="auto">
									<div id="container">					 
										<script type="text/javascript">
				                        	<%
				                        		String clipURL = reqClip.getUrl();
				                        	
				                        	%> 
				                        	   function playswf(url, img)
				                        	   {
				                        	          var s1 = new SWFObject("/vclip-portlet/html/portlet/vclipcontent/player.swf","jstest","320","260","3","0x000000");
				                        	          s1.addParam("allowfullscreen","true");
				                        	          s1.addParam("wmode","transparent");
				                        	          s1.addParam('allowscriptaccess','always');
				                        	          s1.addVariable("image",img);
				                        	          s1.addVariable("file",escape(url));
				                        	          s1.write("container");
				                        	   }
					                      	playswf('<%= themeDisplay.getPortalURL() + themeDisplay.getPathContext() + "/documents/"  + themeDisplay.getScopeGroupId()%><%= clipURL %>','<%= themeDisplay.getPathImage() %>/image_gallery?img_id=<%= reqClip.getImage() %>');                        		   
<%-- 					                      	playswf(' <%= themeDisplay.getPortalURL() + themeDisplay.getPathContext() + "/documents/"  + themeDisplay.getScopeGroupId() + StringPool.SLASH + item.getFolderId() + StringPool.SLASH + HttpUtil.encodeURL(HtmlUtil.unescape(item.getName())) %>');                        		    --%>
							
											function getPlayer(gid) {
												if(navigator.appName.indexOf("Microsoft") != -1) {
													return window[gid];
												} else {
													return document[gid];
												}
											};
											
											function addListeners() {
												if (player) { 
													player.addModelListener("STATE", "stateListener");
												} else {
													setTimeout("addListeners()",100);
												}
											}
	
											function stateListener(obj) { //get State
												currentState = obj.newstate; 
												previousState = obj.oldstate; 
												if(currentState=="PLAYING"){
													//increase view number
													inceaseCounterview(<%=reqClip.getId()%>);
												}		
											}
											function playerReady(obj){		
												player = getPlayer('jstest');
												addListeners();
											};
											
										</script>
				                    	           
				                	</div>
				                </td>
							</tr>
				        	<tr>
				        		<td width="1"></td>
								<td>
									<table width="100%">
										<tr>
											<td>
												<div style="float:left;display:<%=allowDownload.equals("true")?"block":"none"%>;">
													<a style="text-decoration: underline" href="<%= themeDisplay.getPathMain()%>/document_library/get_file?p_l_id=<%= themeDisplay.getPlid() %><%= clipURL %>" onclick= "inceaseCounter(<%=reqClip.getId()%>)"><%= LanguageUtil.get(pageContext, "com.vportal.portlet.vclip.download_title") %></a>&nbsp;&nbsp;&nbsp;
												</div>
												<div style="float:right;">
													<%=LanguageUtil.get(pageContext,"com.vportal.portlet.vclip.clip-viewcounter") %>: <b><%=reqClip.getHitcountview() %></b>
												</div>
												<div style="float:left;display:<%=allowDownload.equals("true")?"block":"none"%>;">									
													<%=LanguageUtil.get(pageContext,"com.vportal.portlet.vclip.download_counter") %> : <b> <%=reqClip.getHitcount() %></b>
												</div>
												
											</td>
										</tr>
									</table>
								</td>
				        	</tr>
				        </table>			           
	           			<br>
	           			
	            		<div style="float: right;">
	            			
	            		</div>                	
	                </td>
	                <td width="12"></td>                
					<td width="auto" valign="top">
						<span class="public_title"><%=reqClip.getTitle() %></span>
						<span>
							<p align = "left">
								<div style="display:<%=allowDescription.equals("true")?"block":"none"%>"><%=reqClip.getDescription() %></div>
							</p>
						</span>
						<span><b><%=LanguageUtil.get(pageContext,"com.vportal.portlet.vclip.date-create") %>: </b><%=dateFormatDateTime.format((reqClip.getCreatedDate()))%><br></span>
						<span><b><%=LanguageUtil.get(pageContext,"com.vportal.portlet.vclip.clip-type") %>: </b><%=clipType.getTitle() %></span>					
					</td>
				</tr>
			</table>
			</td>
		</tr>	   	    
	</table>
	<table width="100%">
		<tr>
			<td width="4"><img src="/vclip-portlet/html/portlet/vclipcontent/images/i_34.gif" width="4" height="4"/></td>
			<td id="center_bottom_background"></td>
			<td width="4"><img src="/vclip-portlet/html/portlet/vclipcontent/images/i_35.gif" width="4" height="4"/></td>
		</tr>
	</table>
								
								
	
	
	
	<%
	}else{
	%>

	<%

	
		int total = cList.size();	
		int per = Integer.parseInt(displayClipNumber);		
		String sPageNum = ParamUtil.getString(request, "pagenum", "1");		
		int numberPage = 1;
		if(Validator.isNotNull(sPageNum)){
			numberPage = Integer.parseInt(sPageNum);
		}
		
		int pages = (total % per == 0) ? total / per : total / per + 1;
		
		int begin = per * (numberPage - 1);
		int end = (total>per * numberPage) ? per * numberPage : total;
		List listItem = cList.subList(begin,end);
		
		PortletURL portletURL = renderResponse.createRenderURL();
		portletURL.setParameter("jspPage", "/html/portlet/vclipcontent/view.jsp");
		portletURL.setParameter(WebKeysVClip.CLIP_TYPE_ID,String.valueOf(clipTypeId));	
		
		//lay title cliptype khi chon tu category
		ClipType clipTypeNew = new ClipTypeImpl();
	
		if(Validator.isNotNull(clipTypeId))
		{
			clipTypeNew = ClipTypeServiceUtil.findById(clipTypeId);
		%>		
			<table width="100%" cellspacing="0" cellpadding="0" border="0">		
				<tr>
				    <td class="center_top_background" width="100%">
				    	<table width="100%">
				    		<tr>
				    			<td id="left_top_tab"></td>		    			
				    			<td>
				    				<div align="left" class="title1"><%=clipTypeNew.getTitle()%></div>
				    			</td>
								<td id="right_top_tabs"></td>
								
								
					   		</tr>
					   </table>	
					</td>
				</tr>
			</table>
		<%	
		}	
		else{	
		%>
			<table width="100%" cellspacing="0" cellpadding="0" border="0">		
				<tr>
				    <td class="center_top_background" width="100%">
				    	<table width="100%">
				    		<tr>
				    			<td id="left_top_tab"></td>		    			
				    			<td>
				    				<div align="left" class="title1"><%= LanguageUtil.get(pageContext, "com.vportal.portlet.vclip.clip-list") %></div>
				    			</td>
								<td id="right_top_tabs"></td>
								
								
					   		</tr>
					   </table>	
					</td>
				</tr>
			</table>			
		<%
		}
		%>				
	<table width="100%" cellspacing="0" cellpadding="0" border="0">
	<tr>		
		<td class="boder_top" bgcolor="#FFFFFF">	
			<table width="100%" border="0" cellspacing="0" cellpadding="0">
				<tr>
					<td>&nbsp;</td>
					<td width="33%"></td>
					<td width="33%"></td>
				</tr>
				<%
					int i;
					long groupId = PortalUtilExt.getPortletGroupId(request);
					long currentPlid = PortalUtilExt.getPlid(request);
					long plId = 0;
					try{
						plId = PortalUtilExt.getPlid(groupId,currentPlid,"vclipcontent_WAR_vclipportlet");
					}
					catch(Exception ex)
					{}	
							
					for (i = 0; i < listItem.size(); i++) {	
						
				%>		
					<%@ include file="/html/portlet/vclipcontent/style/display_item.jsp" %>	
				<%	
					}
				%>			
			</table>	
			<table width="100%">
				<tr height="23">
					<td class="text_traloi">
						<span > 
							<c:if test='<%= pages > 1 %>'>
								<script>
									function goPage(){
										document.<portlet:namespace/>fm.pagenum.value = document.<portlet:namespace/>fm.selectPage.value;
										document.<portlet:namespace/>fm.submit();
									}
								</script> 
								<form action="<%= portletURL.toString() %>" method="post" name="<portlet:namespace />fm" onSubmit="submitForm(this); return false;">
								<input type="hidden" name="pagenum" value="<%= sPageNum %>" />
									<label><%=LanguageUtil.get(pageContext,"com.vportal.portlet.vclip.clip-page") %> <label>
										<select name="selectPage" style="width:35px; " onchange="goPage();">
											<%
												for(int k = 1;k <= pages;k++){ 
											%>
												<option value="<%= k %>" <%= k == numberPage ? "selected" : "" %> ><%= k %></option>
											<% 
												} 
											%>
										</select>
									<label><%=LanguageUtil.get(pageContext,"com.vportal.portlet.vclip.clip-total") %> <%= pages %> </label>
								</form>
							</c:if>
							<c:if test='<%= (pages == 1) || (listItem.size() == 0) %>'>
								<lable><%=LanguageUtil.get(pageContext,"com.vportal.portlet.vclip.clip-show") %> <%= listItem.size()%> clip</label>
							</c:if>
						</span>
					</td>
				 </tr>
			</table>	
			</td>
		</tr>
	</table>
	<table width="100%">
		<tr>
			<td width="4"><img src="/vclip-portlet/html/portlet/vclipcontent/images/i_34.gif" width="4" height="4"/></td>
			<td id="center_bottom_background"></td>
			<td width="4"><img src="/vclip-portlet/html/portlet/vclipcontent/images/i_35.gif" width="4" height="4"/></td>
		</tr>
	</table>
				 
			
		<%	
	}
%>

