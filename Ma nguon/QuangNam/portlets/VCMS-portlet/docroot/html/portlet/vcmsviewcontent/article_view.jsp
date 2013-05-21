
<script type="text/javascript" src="/html/portlet/vclipview/swfobject.js"></script>
<script language="JavaScript1.2" src="/html/portlet/vcmsviewcontent/vietuni.js" type="text/javascript"></script>	

<script language="JavaScript1.2"> setTypingMode(4); </script> 
	
<%

	String parentId = (String)session.getAttribute("CAT_PARENT_ID");
	String discussionId = ParamUtil.getString(request,"discussionId"); 
	
	int numberPage = ParamUtil.getInteger(request, "pagenum",1);
	int total = VcmsArticleServiceUtil.countOtherArticle(groupId, language,statusId, categoryId, articleId);	
	
	int per = 10;
	int pages = (total % per == 0) ? total / per : total / per + 1;
	int begin = per * (numberPage - 1);
	int end = (total>per * numberPage) ? per * numberPage : total;	

	VcmsCategory category = (VcmsCategory)request.getAttribute(ConstantsExt.CATEGORY);
	VcmsArticle article = (VcmsArticle)request.getAttribute(ConstantsExt.ARTICLE);	
	
	List olderArticles = (List)request.getAttribute(ConstantsExt.LIST_NEXT_OLDER_ARTICLE);
	List newArticles = (List)request.getAttribute(ConstantsExt.LIST_NEXT_NEWEST_ARTICLE);
	List threadArticles = (List)request.getAttribute(ConstantsExt.LIST_ARTICLE_OF_THREAD);
	
	List otherArticles = new ArrayList();	
	List listDiscussion = new ArrayList();	
	
	otherArticles = (List)VcmsArticleServiceUtil.getOtherArticle(groupId, language, statusId, categoryId, articleId, begin, end);
	
	PortletURL catURL = PortletURLFactoryUtil.create(request,portletSelectId, plId, PortletRequest.RENDER_PHASE);
	catURL.setParameter("jspPage", "/vcmsviewcontent/view");
	catURL.setParameter("categoryId", category.getCategoryId());

	PortletURL articleURL = PortletURLFactoryUtil.create(request,portletSelectId, plId, PortletRequest.RENDER_PHASE);
	articleURL.setParameter("jspPage", "/vcmsviewcontent/view");
	articleURL.setParameter("articleId", article.getArticleId());
	articleURL.setParameter("categoryId", category.getCategoryId());
	articleURL.setParameter("cat_parent",category.getCategoryId());
	
	PortletURL linkArticleURL = PortletURLFactoryUtil.create(request,portletSelectId, plId, PortletRequest.RENDER_PHASE);
	linkArticleURL.setParameter("jspPage", "/vcmsviewcontent/view");	
	linkArticleURL.setParameter("categoryId", category.getCategoryId());
	linkArticleURL.setParameter("cat_parent",category.getCategoryId());
	linkArticleURL.setParameter("articleId", "");
	
	PortletURL portletURL = PortletURLFactoryUtil.create(request,portletSelectId, plId, PortletRequest.RENDER_PHASE);
	portletURL.setParameter("jspPage", "/vcmsviewcontent/view");
	portletURL.setParameter("categoryId", category.getCategoryId());
	portletURL.setParameter("articleId","");
	
	String leadArticle = article.getLead();
	String contentArticle = article.getContent();

%>

<script language="javascript">
	
</script>
<form action="<portlet:actionURL><portlet:param name="struts_action" value="/vcmsviewcontent/view" />
	</portlet:actionURL>" method="post" name="<portlet:namespace />fm" enctype="multipart/form-data">
	<input type="hidden" name="<portlet:namespace />cmd" value="<%=Constants.ADD%>" />
	<input type="hidden" name="<portlet:namespace />discussionId" value="" /> 
	<input type="hidden" name="<portlet:namespace />redirect" value="<%=currentURL%>" />
	<input type="hidden" name="<portlet:namespace />groupId" value="<%=groupId%>">
	<input type="hidden" name="<portlet:namespace />language" value="<%=language%>">
	<input type="hidden" name="<portlet:namespace />articleId" value="<%=article.getArticleId()%>">
	<div style="width: 100%">
	<div class="l-menu"></div>
	<div class="bg_title_porlet">
		<div class="icon_porlet">
			<div class="title_porlet"><%= category.getName() %>
			</div>
		</div>
	</div>
	<div class="r-menu"></div>
	</div>
<%-- 	<table width="100%" cellspacing="0" cellpadding="0" border="0">
		<tr><td height="3"></td></tr>		
		<tr>
		    <td class="center_top_background" width="100%">
		    	<table width="100%">
		    		<tr>
		    			<td id="left_top_tab"></td>		    			
		    			<td>
		    				<div align="left" class="title1"><%= category.getName() %></div>
		    			</td>
						<td id="right_top_tabs"></td>
						
			   		</tr>
			   </table>	
			</td>
		</tr>
	</table> --%>	
	<table width="100%" cellspacing="0" cellpadding="0" border="0">
		<tr>		
			<td class="boder_top" bgcolor="#FFFFFF">
				<table width="100%" border="0" cellspacing="0" cellpadding="0">
				  <tr>
					<td width="2">&nbsp;</td>
					
					<td style="padding-top:5px;" align="justify">
						<div class="title_new3" style="padding-left:15x;padding-right:5px;padding-bottom:5px;"><%=article.getTitle()%></div>
						<div style="padding-top:0px;">
							<c:if test="<%=article.getHasImage()%>">
								<table width="100" border="0" align="left" cellpadding="7" cellspacing="0">
									<tr>
								  		<td>
								  			<div class="n-img">
								  				<img src="<%= themeDisplay.getPathImage() + "/images?img_id=" + article.getImage()  %>" width="183" align="absmiddle"></a>
								  			</div>
								  			<div style="padding: 4px;margin-right:5px;"><%=article.getImageTitle() %></div>
								  		</td>
									</tr>
							  	</table>
							</c:if>
						 	<div align="justify"><b><span style="color:gray;"><%=leadArticle.replaceAll("_linkarticle_",linkArticleURL.toString()+"")%></span></b>
						 	<br />
						 		<%=contentArticle.replaceAll("_linkarticle_",linkArticleURL.toString()+"")%>
						 	</div>
						 	<c:if test="<%=article.getHasAttachment() %>">
								<div><b>T&#224;i li&#7879;u &#273;&#237;nh k&#232;m</b>&nbsp;&nbsp;
									<vportal:file-download entryId="<%=GetterUtil.getLong(article.getArticleId(), 0) %>" entryClass="<%=VcmsArticle.class%>"  />
								</div> 
							</c:if>						 	
						</div>						
					</td>
					<td width="2"></td>
				  </tr>											 
				</table>
            
		           <!-- Gop y -->
		           <%	listDiscussion = (List)VcmsDiscussionServiceUtil.getDiscussionsByA_P_L_A(articleId, groupId, language, true);				     
					if (Validator.isNotNull(listDiscussion) && listDiscussion.size()>0){	%>
				<p><img height="24" width="28" src="/html/portlet/vcmsviewcontent/synchronize.gif"/>
					&nbsp;<b>Ph&#7843;n h&#7891;i c&#7911;a b&#7841;n &#273;&#7885;c v&#7873; bài vi&#7871;t này:</b></p>					
				<div align="center" style="overflow: auto; height: 200px;width:100%; border:1px solid #CCCCCC">
					<table width="100%" cellpadding="5" cellspacing="5" border="0">
					
					<%	for(int i=0;i<listDiscussion.size();i++){
							VcmsDiscussion discussion = (VcmsDiscussion)listDiscussion.get(i);	%>
					<tr>
						<td style="padding-left:5px;padding-top:5px;"><b><%=discussion.getVisitorName()%> - <%=discussion.getVisitorEmail()%></b>
							<span style="color: rgb(144, 144, 144);"><%=ActionUtil.dateParser(discussion.getPostedDate())%></span></td>
					</tr>				
					<tr>						
						<td style="padding-left:10px;padding-right:10px;padding-bottom:5px;" align="justify"><%=discussion.getContent()%></td>
					</tr>				
					<%}%>					
					</table>
				</div>	
				<%}%>	    
		               
		           <br/>
				<fieldset id="<portlet:namespace/>formComment" style="display:none;">
		               <legend><%= LanguageUtil.get(pageContext, "com.vportal.portlet.vcmsviewcontent.feedback") %></legend>
		               <div align="center"><table cellpadding="5" cellspacing="2" border="0">
		               	<tr><td colspan="2" align="center">
		                   	<input type="radio" name="<portlet:namespace/>switch" id="<portlet:namespace/>OFF" value="OFF"   onFocus="setTypingMode(0)" /><label for="<portlet:namespace/>OFF"><%= LanguageUtil.get(pageContext, "com.vportal.portlet.vcontact.type") %>&nbsp;</label>
							<input type="radio" name="<portlet:namespace/>switch" id="<portlet:namespace/>TELEX" value="TELEX" onFocus="setTypingMode(1)" checked><label for="<portlet:namespace/>TELEX">Telex&nbsp;</label>
							<input type="radio" name="<portlet:namespace/>switch" id="<portlet:namespace/>VNI" value="VNI" 	onFocus="setTypingMode(2)" /><label for="<portlet:namespace/>VNI">VNI</label>
		                   </tr>
		                   <tr height="25">
		                       <td align="right"><%= LanguageUtil.get(pageContext, "com.vportal.portlet.vcontact.name") %> &nbsp;</td>
		                       <td><input type="text" value="" onKeyUp="telexingVietUC(this,event);" name="<portlet:namespace/>visitorName" id="<portlet:namespace/>visitorName" style="width:300px;"/></td>
		                   </tr>
		                   <tr height="25">
		                       <td align="right">Email &nbsp;</td>
		                       <td><input type="text" value="" name="<portlet:namespace/>visitorEmail" style="width:300px;"/></td>
		                   </tr>
		                   <tr height="25">
		                       <td align="right"><%= LanguageUtil.get(pageContext, "com.vportal.portlet.vcontact.title") %> &nbsp;</td>
		                       <td><input type="text" value="" onKeyUp="telexingVietUC(this,event);" name="<portlet:namespace/>title" style="width:300px;"/></td>
		                   </tr>
		                   <tr height="25">
		                       <td align="right"><%= LanguageUtil.get(pageContext, "com.vportal.portlet.vcontact.attach") %> &nbsp;</td>
		                       <td><vportal:file-upload entryId="<%= GetterUtil.getLong(discussionId, 0) %>" entryClass="<%= VcmsArticle.class %>" maxAttachment="<%=1%>" style="2"/></td>
		                   </tr>
		                   <tr height="25">
		                       <td align="right"><%= LanguageUtil.get(pageContext, "com.vportal.portlet.vcontact.content") %> &nbsp;</td>
		                       <td><textarea name="<portlet:namespace/>content" onKeyUp="telexingVietUC(this,event);" style="width:300px;height:100px;"></textarea></td>
		                   </tr>
						<tr height="25">
		                       <td align="right">&nbsp;</td>
		                       <td><input type="button" value="<%= LanguageUtil.get(pageContext, "com.vportal.portlet.vcontact.send") %>" onclick="<portlet:namespace />submitForm()"/>&nbsp;
		                       	<input type="button" value="<%= LanguageUtil.get(pageContext, "com.vportal.portlet.vcontact.reset") %>" onclick="<portlet:namespace/>ResetDefault()"/>&nbsp;
		                       	<input type="button" value="<%= LanguageUtil.get(pageContext, "com.vportal.portlet.vcontact.close") %>" onclick="<portlet:namespace />miximizeSearchAdvance();">
		                       </td>
		                   </tr>                        
		               </table></div>
		           </fieldset>
		           					
		         	<div align="center" class="attach-print clearfix" style="width:100%">
					<table cellspacing="0" cellpadding="0" border="0" class="group3" align="center">
					<tr>														
						<td valign="middle"><img height="24" width="28" src="<%= themeDisplay.getPathThemeImage() %>/HN_image/print.gif"/></td>
						<td><a href="javascript:expandingWindow('/html/portlet/vcmsviewcontent/print_article.jsp?printArticleId=<%=article.getArticleId()%>');">&nbsp;<%= LanguageUtil.get(pageContext, "com.vportal.portlet.vcmsviewcontent.print") %>&nbsp;</a></td>
						<td valign="middle" id="<portlet:namespace/>linkComment1"><img hspace="20" height="13" width="4" src="<%= themeDisplay.getPathThemeImage() %>/HN_image/ss.gif"/></td>
						<td valign="middle" id="<portlet:namespace/>linkComment2"><img height="14" width="19" src="<%= themeDisplay.getPathThemeImage() %>/HN_image/mail.gif"/></td>
						<td id="<portlet:namespace/>linkComment3"><a href="#<portlet:namespace/>formComment" onClick ="javascript:<portlet:namespace/>miximizeSearchAdvance();">&nbsp;<%= LanguageUtil.get(pageContext, "com.vportal.portlet.vcmsviewcontent.contact") %></a></td>
						<td valign="middle"><img hspace="20" height="13" width="4" src="<%= themeDisplay.getPathThemeImage() %>/HN_image/ss.gif"/></td>
						<td valign="middle"><img height="14" width="19" src="<%= themeDisplay.getPathThemeImage() %>/HN_image/i_33.gif"/></td>
						<td><a href="javascript:history.go(-1);">&nbsp;<%= LanguageUtil.get(pageContext, "com.vportal.portlet.vcmsviewcontent.back") %>&nbsp;</a></td>
					</tr>	
					</table>		
				</div>
		            
		            <c:if test="<%=Validator.isNotNull(threadArticles) && threadArticles.size()>0%>">
				 <div class="event" align="justify">
		               <p><b><%= LanguageUtil.get(pageContext, "com.vportal.portlet.vcmsviewcontent.new_event") %></b></p>
		               <%	for (int j = 0; j < threadArticles.size(); j++) {
							VcmsArticle articleNew = (VcmsArticle)threadArticles.get(j);
		
							PortletURL articleNewURL;
							articleNewURL = PortletURLFactoryUtil.create(request,portletSelectId, plId, PortletRequest.RENDER_PHASE);
							articleNewURL.setParameter("jspPage","/html/portlet/vcmsviewcontent/view.jsp" );
							articleNewURL.setParameter("articleId", articleNew.getArticleId());
							articleNewURL.setParameter("categoryId", category.getCategoryId());
					%>
		                    <div class="text_09"> <a href="<%= articleNewURL %>"><%= articleNew.getTitle() %></a>&nbsp;<span style="color: rgb(144, 144, 144);">(<%=ActionUtil.dateParser(articleNew.getPublishedDate())%>)</span></div>
					<%}%>									                
		               <p>&nbsp;</p>
		           </div>
		           </c:if>	
		           		
		           <c:if test="<%=Validator.isNotNull(newArticles) && newArticles.size()>0%>">		
		           <p>&nbsp;</p>
		           <div class="othernews" align="justify">
		               <p><b><%= LanguageUtil.get(pageContext, "com.vportal.portlet.vcmsviewcontent.newer_news") %></b></p>
					<%	String titleArticle = "";
						for (int j = 0; j < newArticles.size(); j++) {
							VcmsArticle articleNew = (VcmsArticle)newArticles.get(j);
							
							PortletURL articleNewURL;
							articleNewURL = PortletURLFactoryUtil.create(request,portletSelectId, plId, PortletRequest.RENDER_PHASE);
							articleNewURL.setParameter("jspPage", "/vcmsviewcontent/view");
							articleNewURL.setParameter("articleId", articleNew.getArticleId());
							articleNewURL.setParameter("categoryId", category.getCategoryId());
					%>
		                   <div class="text_09"><a href="<%= articleNewURL %>"><%= articleNew.getTitle() %></a>&nbsp;<span style="color: rgb(144, 144, 144);">(<%=ActionUtil.dateParser(articleNew.getPublishedDate())%>)</span></div>
					<%}%>	
				</c:if>					
		           
		           <c:if test="<%=Validator.isNotNull(olderArticles) && olderArticles.size()>0%>">		
		           <p>&nbsp;</p>
		           <div class="othernews" align="justify">
		               <p><b><%= LanguageUtil.get(pageContext, "com.vportal.portlet.vcmsviewcontent.otherview") %></b></p>
					<%	String titleArticle = "";
						for (int j = 0; j < olderArticles.size(); j++) {
							VcmsArticle articleNew = (VcmsArticle)olderArticles.get(j);
							
							PortletURL articleNewURL;
							articleNewURL = PortletURLFactoryUtil.create(request,portletSelectId, plId, PortletRequest.RENDER_PHASE);
							articleNewURL.setParameter("jspPage", "/vcmsviewcontent/view");
							articleNewURL.setParameter("articleId", articleNew.getArticleId());
							articleNewURL.setParameter("categoryId", category.getCategoryId());
					%>
		                   <div class="text_09"><a href="<%= articleNewURL %>"><%= articleNew.getTitle() %></a>&nbsp;<span style="color: rgb(144, 144, 144);">(<%=ActionUtil.dateParser(articleNew.getPublishedDate())%>)</span></div>
					<%}%>	
					</c:if>								                
					
					
         </td>
	</tr>
	</table>

	<div>
		<table width="100%">
			<tr>
				<td width="4"><img src="<%= themeDisplay.getPathThemeImage() %>/HN_image/i_34.gif" width="4" height="4"/></td>
				<td id="center_bottom_background" width="98%"></td>
				<td width="4"><img src="<%= themeDisplay.getPathThemeImage() %>/HN_image/i_35.gif" width="4" height="4"/></td>
			</tr>
			<tr><td colspan="3" height="3"></td></tr>
		</table>
	</div>       								           	
									       		
												
<script type="text/javascript">	
   function playswf(url, img)
   {
          var s1 = new SWFObject("/html/portlet/vclipview/player.swf","jstest","320","260","3","0x000000");
          s1.addParam("allowfullscreen","true");
          s1.addParam("wmode","transparent");
          s1.addParam('allowscriptaccess','always');
          s1.addVariable("image",img);
          s1.addVariable("file",escape(url));
          s1.write("insertvideoview");
   }	 	
</script>
		
<script language = "javascript">
	try{
		if(url!=null){
			url = url.replace(/&amp;/g, "&");
			playswf('<%= themeDisplay.getPathMain() %>/document_library/get_file?p_l_id=<%= themeDisplay.getPlid() %>'+url,'<%= themeDisplay.getPathImage() %>/image_gallery?img_id='+img_id);
		}
	}catch(err){
		
	}
	
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
		}		
	}
	
	function playerReady(obj){		
		player = getPlayer('jstest');
		addListeners();
	};
	
</script>	
				
</form>
<script language="javascript">	
	
	var flag = false;
	function <portlet:namespace/>miximizeSearchAdvance(){
		if(flag){
			document.getElementById('<portlet:namespace/>formComment').style.display ="";			
			document.getElementById('<portlet:namespace/>linkComment1').style.display ="none"; 
			document.getElementById('<portlet:namespace/>linkComment2').style.display ="none"; 
			document.getElementById('<portlet:namespace/>linkComment3').style.display ="none"; 
			document.getElementById('<portlet:namespace/>visitorName').focus();
			flag = false;
		}else{			
			document.getElementById('<portlet:namespace/>formComment').style.display ="none";			
			document.getElementById('<portlet:namespace/>linkComment1').style.display =""; 
			document.getElementById('<portlet:namespace/>linkComment2').style.display =""; 
			document.getElementById('<portlet:namespace/>linkComment3').style.display =""; 
			flag = true;
		}
	}
	
	<portlet:namespace/>miximizeSearchAdvance(); 
	
	function <portlet:namespace />submitForm() {				
		var myform = document.<portlet:namespace />fm;	
		
		if (document.<portlet:namespace />fm.<portlet:namespace />visitorName.value == ''){
			alert("<%=LanguageUtil.get(pageContext,"vportal.portlet.vcms.invalidName")%>");
			document.<portlet:namespace />fm.<portlet:namespace />visitorName.focus();
			return;
		}
		
		var r = new RegExp(/^\w+(\.[a-zA-Z]+)*\w*@(\w+\.([a-zA-Z])+){1,4}$/);
		if(!r.test(document.<portlet:namespace />fm.<portlet:namespace />visitorEmail.value)){
			alert("<%=LanguageUtil.get(pageContext,"vportal.portlet.vcms.invalidEmail")%>");			
			document.<portlet:namespace />fm.<portlet:namespace />visitorEmail.value = '';
			document.<portlet:namespace />fm.<portlet:namespace />visitorEmail.focus();
			return ;
		}
		
		if (document.<portlet:namespace />fm.<portlet:namespace />title.value == ''){
			alert("<%=LanguageUtil.get(pageContext,"vportal.portlet.vcms.invalidTitle")%>");
			document.<portlet:namespace />fm.<portlet:namespace />title.focus();
			return;
		}
		
		if (document.<portlet:namespace />fm.<portlet:namespace />content.value == ''){
			alert("<%=LanguageUtil.get(pageContext,"vportal.portlet.vcms.invalidContent")%>");
			document.<portlet:namespace />fm.<portlet:namespace />content.focus();
			return;
		}
		myform.submit();
		flag = true;
	}
	
	function <portlet:namespace/>ResetDefault() {	
		
		document.<portlet:namespace />fm.<portlet:namespace />visitorName.value = '';		
		document.<portlet:namespace />fm.<portlet:namespace/>visitorEmail.value = '';
		document.<portlet:namespace />fm.<portlet:namespace/>title.value = '';
		document.<portlet:namespace />fm.<portlet:namespace/>content.value = '';		
	}
	
	function gf(p_el) {	}
	function lf(p_el) {	}
	setTypingMode(4); 
</script>
<%@ include file="/html/portlet/vcmsviewcontent/javascript.jsp" %>
