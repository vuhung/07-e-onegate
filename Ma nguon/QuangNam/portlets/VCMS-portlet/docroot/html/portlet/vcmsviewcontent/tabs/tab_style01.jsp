<table width="100%" border="0" cellspacing="0" cellpadding="0" bgcolor="#FFFFFF">
	<tr><td height="3" colspan="2"></td></tr>
	<tr>
	    <td class="center_top_background">
	    	<table>
	    		<tr>
	    			<td id="left_top_tab"></td>
					<%
					String catDefault="";
					PortletURL catURL = PortletURLFactoryUtil.create(request,portletSelectId, plId, PortletRequest.RENDER_PHASE);
					catURL.setParameter("struts_action", "/vcmsviewcontent/view");
					for(int i=0;i<listCategory.length;i++){
					  VcmsCategory category = (VcmsCategory)VcmsCategoryServiceUtil.getCategory(listCategory[i]);
					  catURL.setParameter("categoryId", category.getCategoryId());				
						 if(i==0){
						 catDefault = category.getCategoryId();
					%>	
						<td class="menu1">	
							<div><a href="<%=catURL.toString()%>"><%= category.getName() %></a></div>
						</td>
						<td id="center_top_id">
						
						</td>					
					<%
						}else{
					%>
						<td class="menu2">
							<div><a href="<%=catURL.toString()%>"><%= category.getName() %></a></div>
						</td>					
					<%
							if( i < listCategory.length - 1){
					%>
						<td class="center_top_class"></td>	
					<%						
							
							}
						}
					}	      
				   %>
				   <td id="right_top_tab"></td>
		   		</tr>
		   </table>	
		</td>
		<td id="right_top_tabs"></td>
	</tr>
	<tr>
	 	<td class="boder_top" colspan="2"> 		 
	           <%
			  int sumAticles = numberArticlesNextInCat+numberArticlesInCat;
			  List articlesByCat = (List)VcmsArticleServiceUtil.getTopNewArticles(groupId , language , null,catDefault, statusId , sumAticles);
			  int numberAricles =0;
			  if(articlesByCat.size()<numberArticlesInCat){
			    numberAricles = articlesByCat.size();
			  }else{
			    numberAricles =numberArticlesInCat ;
			  }
			   %>
     
		   <table width="100%" border="0" cellspacing="0" cellpadding="0">
	          <tr>
		        <td height="10">
		        </td>
		      </tr> 
			  <tr>
				<td valign="top">			
					<table>
						<%
							if(numberAricles > 0){
								VcmsArticle articleTop = (VcmsArticle)articlesByCat.get(0);
								PortletURL articleURLTop= PortletURLFactoryUtil.create(request,portletSelectId, plId, PortletRequest.RENDER_PHASE);
								articleURLTop.setParameter("struts_action", "/vcmsviewcontent/view");
								articleURLTop.setParameter("articleId", articleTop.getArticleId());
								articleURLTop.setParameter("categoryId", catDefault);
						%>
						<tr>
							<%
								if(articleTop.getHasImage()){
							%>
							<td valign="top">							
								<a href="<%=articleURLTop %>"><img hspace="14"  src="<%= themeDisplay.getPathImage() + "/images?img_id=" + articleTop.getImage()  %>" width="256" align="left" /></a>							
							</td>
							<%
								}
							%>
							<td valign="top" align="justify">
								<span class="title2"><a href="<%=articleURLTop %>"><%= articleTop.getTitle() %></a></span><br/>
								<%= articleTop.getLead()%>
								<%
									for (int j = 1; j <numberAricles; j++) {
										VcmsArticle article = (VcmsArticle)articlesByCat.get(j);
										PortletURL articleURL= PortletURLFactoryUtil.create(request,portletSelectId, plId, PortletRequest.RENDER_PHASE);
										articleURL.setParameter("struts_action", "/vcmsviewcontent/view");
										articleURL.setParameter("articleId", article.getArticleId());
										articleURL.setParameter("categoryId", catDefault);
								%>
									<div class="text_01" align="justify"><a href="<%= articleURL %>"> <%= article.getTitle()%></a></div>						
								<%
									}
								%>						
							</td>
						</tr>
						<%
							}
						%>					
					  </table>				  
					</td>
				</tr>
				<tr>
					<td>
					<%
						if(articlesByCat.size()-numberArticlesInCat >0){
					%>
				  	<table width="100%" cellpadding="0" cellspacing="6" border="0">
				  		<tr><td height="20" colspan="2" ></td></tr>			  		
						<tr>
							<td class="title1" width="88" style="text-transform: uppercase;"><%= LanguageUtil.get(pageContext, "com.vportal.portlet.vcmsviewcontent.otherview") %></td>
				      		<td align="center">
					    		<hr width="95%" size="1"/>
					  		</td>										
						</tr>
						<tr><td colspan="2" height="20"></td></tr>
					</table>
					<%
						}
					%>
				  </td>
				</tr>			
				<tr>
					<td valign="top" style="padding:0px;">
						<table>
							<tr>	           
							  	<%
									PortletURL articleNewURL= PortletURLFactoryUtil.create(request,portletSelectId, plId, PortletRequest.RENDER_PHASE);
									for (int j = numberArticlesInCat; j < articlesByCat.size(); j++) {
									VcmsArticle articleNew = (VcmsArticle)articlesByCat.get(j);
									articleNewURL.setParameter("struts_action", "/vcmsviewcontent/view");
									articleNewURL.setParameter("articleId", articleNew.getArticleId());
									articleNewURL.setParameter("categoryId", catDefault);
								%>
									   <td align="center" bgcolor="#eaf5ff" style="padding:14px;font-size:11px;" valign="top" width="155">
											<%
												if(articleNew.getHasImage()){
											%>
												<div align="center" style="padding-bottom: 3px;">
												  	<a href="<%= articleNewURL %>"><img src="<%= themeDisplay.getPathImage() + "/images?img_id=" + articleNew.getImage()  %>" width="145" align="center" /></a>											  	
												</div>
												<div align="justify" style="padding: 0 3px;"><a href="<%= articleNewURL %>"><%= articleNew.getTitle()%> </a></div>
											<%
												}else{
											%>
												<div align="justify"><a href="<%= articleNewURL %>"><%= articleNew.getTitle()%> </a></div>
											<%
												}
											%>
									   </td>
								<%
									if(j != articlesByCat.size() - 1){
								%>
										<td width="10"></td>	
								<%		
									}
								%>										
								<%
									}
								%>
							</tr>
						</table>
					</td>
		  		</tr>
			</table>
	   </td>
	</tr>
	<tr>
		<td colspan="2">
			<table width="100%">
				<tr>
					<td width="4"><img src="<%= themeDisplay.getPathThemeImage() %>/HN_image/i_34.gif" width="4" height="4"/></td>
					<td id="center_bottom_background"></td>
					<td width="4"><img src="<%= themeDisplay.getPathThemeImage() %>/HN_image/i_35.gif" width="4" height="4"/></td>
				</tr>
			</table>
		</td>	
	</tr>
	<tr>
		<td height="3" colspan="2"></td>
	</tr>
</table>
