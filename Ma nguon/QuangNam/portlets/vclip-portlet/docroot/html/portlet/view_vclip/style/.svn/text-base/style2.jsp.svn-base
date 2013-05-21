<%@page import="com.liferay.portal.kernel.language.LanguageUtil"%>
<portlet:actionURL windowState="<%= LiferayWindowState.EXCLUSIVE.toString() %>" var="increaseURL">
	<portlet:param name="struts_action" value="/vclipview/view" />
	<portlet:param name="<%= Constants.CMD %>" value="<%= ConstantsExt.HITCOUNT %>" />
</portlet:actionURL>
<script language = "javascript">
	function increaseCounter(clipId) {
		url = "<%= increaseURL %>";
		url = url + "&clipId=" + clipId;
		AjaxUtil.update(url, "");
	}
</script>

<portlet:actionURL windowState="<%= LiferayWindowState.EXCLUSIVE.toString() %>" var="increaseviewURL">
	<portlet:param name="struts_action" value="/vclipview/view" />
	<portlet:param name="<%= Constants.CMD %>" value="<%= ConstantsExt.HITCOUNTVIEW %>" />
</portlet:actionURL>
<script language = "javascript">
	function increaseViewCounter(clipId) {
		url = "<%= increaseviewURL %>";
		url = url + "&clipId=" + clipId;
		AjaxUtil.update(url, "");
	}
</script>

<script type="text/javascript" src="/vclip-portlet/html/portlet/view_vclip/swfobject.js">
   
</script>
<div id="<portlet:namespace/>clip_content">
<table align = "center" id = "tablecss">
	<tr id = "live" style="border:1px #BB0000 solid">
		<td align = "center">
				<%
					long groupId = PortalUtilExt.getPortletGroupId(request);
					long currentPlid = PortalUtilExt.getPlid(request);
					long plId = 0;
					try {
						plId = PortalUtilExt.getPlid(groupId, currentPlid, "vclipview");
					} catch (Exception ext) {
					}
					String categoryId = ParamUtil.getString(request, "categoryId");
					List ctList = (List) request
							.getAttribute(WebKeysVClip.CLIP_TYPE_RESULT_SEARCH);
					if (ctList == null) {
						ctList = new ArrayList();
					}

					try {
						for (int i = 0; i < selectCategories.length; i++) {

							ClipType cliptype = ClipTypeServiceUtil
							.findById(selectCategories[i]);
							PortletURL categoryURL = PortletURLFactoryUtil.create(request,
							"vclipview", plId, PortletRequest.RENDER_PHASE);
							categoryURL
							.setParameter("jspPage", "/html/portlet/view_vclip/view.jsp");
							categoryURL.setParameter(WebKeysVClip.CLIP_TYPE_ID, String
							.valueOf(cliptype.getId()));
							categoryURL.setParameter(WebKeysVClip.OBJECT,
							ClipType.class.getName());
							String upName = cliptype.getTitle();

							if (i == 0) {
				%>	
							<a id="clipLink" href="javascript:void(0);" onclick="javascript:<portlet:namespace/>viewClipByCat('<%=String.valueOf(cliptype.getId())%>','<%=ClipType.class.getName()%>');"><%=upName.toUpperCase()%></a>
					<%
					} else {
					%>		
							<a id="clipLink" href="javascript:void(0);" onclick="javascript:<portlet:namespace/>viewClipByCat('<%=String.valueOf(cliptype.getId())%>','<%=ClipType.class.getName()%>');" > /<%=upName.toUpperCase()%></a>						 
					<%
						 							}
						 							}
						 						} catch (Exception ex) {
						 						}
						 					%>
					
					<script language="javascript">
							function playswf(url, img)
							   {
							          var s1 = new SWFObject("/vclip-portlet/html/portlet/view_vclip/mediaplayer.swf","jstest","160","103","3");
							          s1.addParam("allowfullscreen","true");
							          s1.addParam('allowscriptaccess','always');          
							          s1.addVariable('width','160');          
							          s1.addVariable('height','103');          
							          s1.addVariable("image",img);
							          s1.addVariable("file",escape(url));	                                    	                                    
							          s1.addVariable("showstop","false");
							          s1.addVariable("backcolor","0x000000");
							          s1.addVariable("lightcolor","0x000000");
							          s1.addVariable("frontcolor","0xFEFEFE");
							          s1.addVariable('javascriptid','jstest');
								  	  s1.addVariable('enablejs','true');
							          s1.write("vclipview-container");
							   }							
						   function <portlet:namespace/>viewClipByCat(clipTypeId , ClipObjName){
									var url_view = "<portlet:renderURL windowState="<%= LiferayWindowState.EXCLUSIVE.toString() %>"><portlet:param name="jspPage" value="/html/portlet/view_vclip/view.jsp" /></portlet:renderURL>";
									url_view = url_view + "&clipTypeId="+clipTypeId;
									url_view = url_view + "&object="+ClipObjName;
									document.getElementById('<portlet:namespace/>clip_content').innerHTML = "<p><img src='/vclip-portlet/html/portlet/view_vclip/images/loading_animation.gif' align='center'/></p>";
// 									AjaxUtil.update(url_view, "<portlet:namespace/>clip_content", oncomplete = function() {
// 											clipTest = "";
// 										});
									jQuery('<portlet:namespace/>clip_content').load(url_view);
						   }
					</script>
					<link href="/vclip-portlet/html/portlet/view_vclip/css/show.css" rel="stylesheet" type="text/css" />
				</td>
		</tr>
		<%
			Clip clip = (Clip) request.getAttribute(WebKeysVClip.CLIP);
			if (clip == null) {
				clip = new ClipImpl();
			}
			if (!clip.getId().equals("")) {
		%>			
			
			<tr style="border:1px #BB0000 solid">
				<td id="vclipview-container" class="media" name="<%=clip.getId()%>">
                        <script type="text/javascript">              
                		
                	
                		//location.href = location.href+'clipTest'+<%=clip.getId().toString()%>;
                        <%
                        	String clipURL = clip.getUrl();//.replace("&", "&amp;amp;");                      	
                        	
                        %>
                        
	                      playswf('<%= themeDisplay.getPortalURL()+themeDisplay.getPathContext()+"/documents/" +themeDisplay.getScopeGroupId() %><%= clipURL %>','<%= themeDisplay.getPortalURL()%>/image/image_gallery?img_id=<%=(Long.valueOf(clip.getImage())+1) %>');
                        		   
                        </script>
                        <script type="text/javascript">							
							function sendEvent(swf,typ,prm){ 
							  thisMovie(swf).sendEvent(typ,prm); 
							};														
							function getUpdate(typ,pr1,pr2,swf){
								if(typ == 'state') 
								{ 				
									if(pr1==2)
									{   									    
										//alert(jQuery("#vclipview-container").attr("name"));
										increaseViewCounter(jQuery("#vclipview-container").attr("name"));
									}
								}
							};			
							function thisMovie(swf) {
							  if(navigator.appName.indexOf("Microsoft") != -1) {
							    return window[swf];
							  } else {
							    return document[swf];
							  }
							};	
						</script>
               </td>
            </tr>
            <tr id = "row3">
            	<td><table width="100%"><tr>                       	
           		<td><a style = "text-decoration: underline;"
				href="<%= themeDisplay.getPathMain()%>/document_library/get_file?p_l_id=<%= themeDisplay.getPlid() %><%= clipURL %>"
				onclick="increaseCounter(<%=clip.getId()%>)" onmousemove="ToolTip.show(event, this, '<%=LanguageUtil.get(pageContext,"com.vportal.portlet.vclip.download_counter") %> : <%=clip.getHitcount()%>')">
				<%= LanguageUtil.get(pageContext, "com.vportal.portlet.vclip.download_title") %></a><b> (<%=clip.getHitcount()%>)</b></td>
				<td style="text-align: right;"><%=LanguageUtil.get(pageContext,"com.vportal.portlet.vclip.clip-viewcounter") %>: <b><%=clip.getHitcountview()%></b></td>
				</tr></table>				
		<%
				PortletURL clipURL1;
				if (openNewTab == 0) {
					clipURL1 = PortletURLFactoryUtil.create(request, receivedPortletId,
					plId1, PortletRequest.RENDER_PHASE);
				} else {

					clipURL1 = renderResponse.createRenderURL();
				}
				clipURL1.setParameter("jspPage", receivedPortletAction);
				clipURL1.setParameter("clipId", clip.getId());
				clipURL1.setParameter("clipTypeId", clip.getClipTypeId());
		%>       		
            		
            		<a id="continuelink" href="<%=clipURL1 %>">Clip khác »</a>
            		
            	</td>
            </tr>             		
			<%
             					} else {
             					%>
		<tr height="50" style="border:1px #BB0000 solid">
			<td>
		 		<p id = "error"><%=LanguageUtil.get(pageContext,"com.vportal.portlet.vclip.notfound-message") %></p>	 	
		 	</td>
		</tr>
		<%
		}
		%>
	</table>
</div>


