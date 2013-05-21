<%@include file="/html/portlet/vcmsviewcontent/init.jsp" %>

<%
	String defaultKeywords = LanguageUtil.get(pageContext, "search") + "...";
	String unicodeDefaultKeywords = UnicodeFormatter.toString(defaultKeywords);
	
	String keywords = ParamUtil.getString(request,"keywords", defaultKeywords);
	
	PortletURL portletURL = renderResponse.createRenderURL();
	
	portletURL.setParameter("struts_action", "/search/search");
	portletURL.setWindowState(WindowState.MAXIMIZED);

	String displayDefaultCatId = GetterUtil.getString(prefs.getValue(ConstantsExt.IS_DISPLAY_DEFAULT_CATEGORY,"0"));
	String listCategory [] = displayDefaultCatId.split(",");
	int numberArticlesInCat = GetterUtil.getInteger(prefs.getValue(ConstantsExt.NUMBER_ARTICLES_IN_CAT_DEFAULT,"5"));
	
	String categoryId = ParamUtil.getString(request,"categoryId");	
%>
<div id="ajax_table">
	 <table width="100%" border="0" cellspacing="0" cellpadding="0">
	  	<tr>
	    	<td colspan="2">
				<table width="100%" align="left" class="tab_top_navi">
					<tr>			
					<%				
					String catDefault="";
					PortletURL catURL = new PortletURLImpl(request,portletSelectId, plId, PortletRequest.RENDER_PHASE);							
					for(int i=0;i<listCategory.length;i++){
						  VcmsCategory category = (VcmsCategory)VcmsCategoryServiceUtil.getCategory(listCategory[i]);
						  catURL.setParameter("categoryId", category.getCategoryId());				  
							 if(i==0){
							 catDefault = category.getCategoryId();
						%>				
							<td id="begin_top_tap"></td>
							<td id=<%=listCategory[0].equals(categoryId)?"select_center_top_tab":"non_center_top_tab" %> ><div><b><a onClick="categoryTabView(<%=category.getCategoryId() %>)" ><%= category.getName() %></a></b></div></td>
							<td id=<%=listCategory[0].equals(categoryId)?"select_right_top_tab":"non_right_top_tab" %>></td>
						<%
							}else{
						%>
							<td id=<%=listCategory[0].equals(categoryId)?"'normal_left_top_tab'":"non_normal_left_top_tab" %>><b><a onClick="categoryTabView(<%=category.getCategoryId() %>)" ><%= category.getName() %></a></b></td>
							<td id=<%=listCategory[0].equals(categoryId)?"'normal_right_top_tab'":"non_normal_right_top_tab" %>></td>   
						<%
							  if(i!=listCategory.length-1){
						%>	 
							  
						<%
							  }
							}
						}	      
				   %>
					   		<td id="normal_top_tab" width="60%">
					   			 <form action="<%= portletURL.toString() %>" method="post" name="<portlet:namespace />fm" onSubmit="submitForm(this); return false;">
							   		<div class="title_search clearfix">
							            <div style="float:right">
							              <div style="padding-right:10px"><b><font style="font-size:11px">T&#236;m ki&#7871;m&nbsp;&nbsp;</font></b>
							                <input type="text" style="border:1px solid #979797; height:12px;" name="<portlet:namespace />keywords" class="text" value="<%= HtmlUtil.escape(keywords) %>" onBlur="if (this.value == '') { this.value = '<%= unicodeDefaultKeywords %>'; }" onFocus="if (this.value == '<%= unicodeDefaultKeywords %>') { this.value = ''; }"/>&nbsp;
							                <a href="#" onclick="<portlet:namespace />submitform();"><img src="<%= themeDisplay.getPathThemeImage() %>/HN_image/i_21.gif" height="15" width="16" border="0"/></a> &nbsp;
							              </div>
							            </div>
									</div>		
								</form>	   	
					   		</td>
						</tr>
					</table>
				</td>
			</tr>
	</table>
	<table class="border_top_tab">
			<tr><td colspan="2" height="20"></td></tr>
			<tr>
			 	<td width="45%" style="padding: 0px 7px 0px 20px;">	   		
			           <%				  
						List articlesByCat = (List)VcmsArticleServiceUtil.getTopNewArticles(groupId , language , null,categoryId, statusId , numberArticlesInCat);
										   
				   		VcmsArticle article = (VcmsArticle)articlesByCat.get(0);
				   		PortletURL articleNewURL= new PortletURLImpl(request,portletSelectId, plId, PortletRequest.RENDER_PHASE);
					   	PortletURL articleURL= new PortletURLImpl(request,portletSelectId, plId, PortletRequest.RENDER_PHASE);
						articleURL.setParameter("struts_action", "/vcmsviewcontent/view");
						articleURL.setParameter("articleId", article.getArticleId());
						articleURL.setParameter("categoryId", catDefault);
				   	%>
				   	 <table width="100%" border="0" cellspacing="0" cellpadding="0">
						  <tr>
								<td valign="top"> 
									<img src="<%= themeDisplay.getPathImage() + "/images?img_id=" + article.getImage()  %>" align="left"  height="195px" width="306px"/>
								</td>
						  </tr>
						  <tr>
								<td valign="top">
									 <div>						 	
									 	<div class="desc">
									 		<b><a href="<%=articleURL%>" style="padding-bottom:10px;" ><%=article.getTitle()%></a></b>
									 	</div> 
									   <div style="float:left;color:#000000;font:11px;font-weight:normal; text-align: justify;">
									      	<%=StringUtil.shorten(article.getLead(),230)%>   	
										</div>
								      </div>
							  	</td>
						  </tr>
					</table>
							       
	   		</td>
	   		<td width="55%" valign="top" style="padding: 0px 10px 10px 7px;">
				<table width="100%" border="0" cellspacing="0" cellpadding="0">
					<tr>
						 <td>        
					        
							    <table width="100%" border="0" cellspacing="0" cellpadding="0">										
									 
									  <%
								   for(int i=1;i<articlesByCat.size();i++){
									 VcmsArticle nextArticle = (VcmsArticle)articlesByCat.get(i);
									 VcmsCARelation category =VcmsCARelationServiceUtil.findRelationsByArticle(nextArticle.getArticleId());
									if(category!= null){
										catDefault = String.valueOf(category.getCategoryId());
									}
									 articleNewURL.setParameter("struts_action", "/vcmsviewcontent/view");
									 articleNewURL.setParameter("articleId", nextArticle.getArticleId());
									 articleNewURL.setParameter("categoryId", catDefault);
									 int ch=300;
									int space=0;
									
									String title = nextArticle.getTitle();
									if(title.length()>ch){
										  space=title.indexOf(" ",ch);
									  if(space>0){
										  title=title.substring(0,space)+"...";
									  }
								}
								
								  if((i-1)%3==0){
								  
								 }
								 %>
								 	<tr>
										<td width="30%" align="left" valign="top">
										   <table width="100%" border="0" cellspacing="0" cellpadding="0">
												  <tr>
												  		<td colspan="3">
												  			<b><a style="font-size: 11px;" href="<%=articleNewURL%>"><%=StringUtil.shorten(title,59)%></a></b>
												  		</td>
												  </tr>
												  <tr><td height="5"></td></tr>
												  <tr>
														<td align="left" valign="top"> 
															<img src="<%= themeDisplay.getPathImage() + "/images?img_id=" + nextArticle.getImage()  %>" height="60px" width="79px"/>
														</td>							  
													   <td width="5">													     
													   </td>							  
														<td align="left" valign="top"> 
														    <%=StringUtil.shorten(nextArticle.getLead(),180) %>
														</td>
												  </tr>
											</table>
										</td>
									</tr>
								 <%
								 	if(i < articlesByCat.size()-1){
								 %>
									<tr>
										<td>
											<div>
												
											</div>
											<br/>
										</td>
									</tr>
								<%
								 	}
								%>
									
								<%
								  if((i-1)%3==2){
								 
								 }
							 }
								 %>
								 <tr>
									  <td>
									  </td>
								 </tr>
							</table>							
					</td>
			</tr>
		</table>
		</td>   		
		</tr>	 
	</table>
</div>