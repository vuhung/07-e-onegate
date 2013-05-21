<table width="100%" border="0" cellspacing="0" cellpadding="0">
	<tr><td height="3"></td></tr>
	<tr>	    			
		<%
		String catDefault="";
		PortletURL catURL = PortletURLFactoryUtil.create(request,portletSelectId, plId, PortletRequest.RENDER_PHASE);
		catURL.setParameter("struts_action", "/vcmsviewcontent/view");
		for(int i=0;i<listCategory.length;i++){
		  VcmsCategory category = (VcmsCategory)VcmsCategoryServiceUtil.getCategory(listCategory[i]);
		  catURL.setParameter("categoryId", category.getCategoryId());
		%>
			<td valign="top" width="50%" bgcolor="#F3EEE5">
				<table width="100%" border="0" cellspacing="0" cellpadding="0">
					<tr>
						<%
							if(i == listCategory.length - 1){
						%>									
							<td class="bg_02" colspan="2">
								<div class="title1" align="left"><a href="<%=catURL.toString()%>"><%= category.getName() %></a></div>										
							</td>
						<%
							}
							else{
						%>
							<td class="bg_02_1" colspan="2">
								<div class="title1" align="left"><a href="<%=catURL.toString()%>"><%= category.getName() %></a></div>										
							</td>
						<%
							}
						%>
					</tr>
					<tr>
						<%
							if(i==0){
						%>
						<td height="10" colspan="2" class="text_04"></td>
						<%
							}else{
						%>
						<td height="10" colspan="2" class="text_04_1"></td>	
						<%
							}
						%>
						
					</tr>
				
				<%
					int sumAticles = numberArticlesNextInCat+numberArticlesInCat;
					List articlesByCat = (List)VcmsArticleServiceUtil.getTopNewArticles(groupId , language , null, category.getCategoryId() , statusId , sumAticles);
					int numberAricles =0;
					if(articlesByCat.size()<numberArticlesInCat){
					  numberAricles = articlesByCat.size();
					}else{
					  numberAricles =numberArticlesInCat ;
					}
					
				%>					
					<tr>
						<td valign="top">
							<%
								if(numberAricles>0){
									VcmsArticle article = (VcmsArticle)articlesByCat.get(0);
									PortletURL articleTopURL= PortletURLFactoryUtil.create(request,portletSelectId, plId, PortletRequest.RENDER_PHASE);
									articleTopURL.setParameter("struts_action", "/vcmsviewcontent/view");
									articleTopURL.setParameter("articleId", article.getArticleId());
									articleTopURL.setParameter("categoryId", category.getCategoryId());	
									if(article.getHasImage()){
										%>								
											<div><a href="<%=articleTopURL %>"><img hspace="5" width="100" align="left" vspace="8" src="<%= themeDisplay.getPathImage() + "/images?img_id=" + article.getImage()  %>"/></a></div>
										<%
									}
								}
							%>													
						</td>
						<td  style="padding: 5px 5px 5px 10px;" align="justify">																					
							<%	
							for (int j = 0; j <numberAricles; j++) {
								VcmsArticle article = (VcmsArticle)articlesByCat.get(j);
								PortletURL articleURL= PortletURLFactoryUtil.create(request,portletSelectId, plId, PortletRequest.RENDER_PHASE);
								articleURL.setParameter("struts_action", "/vcmsviewcontent/view");
								articleURL.setParameter("articleId", article.getArticleId());
								articleURL.setParameter("categoryId", category.getCategoryId());									
							%>
					 				<span class="text_06"><a href="<%= articleURL %>"> <%= article.getTitle()%></a></span><br/>
										
							<%
								}
							%>							
						</td>																	
					</tr>
					<tr>
						<td align="right" colspan="2">
							<c:if test="<%=Validator.isNotNull(articlesByCat) && articlesByCat.size()>0%>">	
	                            <%	StringBuilder sb = new StringBuilder();			
								sb.append(themeDisplay.getPathMain());
								sb.append("/vcmsviewcontent/rss?");
								sb.append("categoryId=" + category.getCategoryId());
								sb.append("&p_l_id=" + Long.toString(plId));
								sb.append("&portletSelectId=" + portletSelectId);
								String rssURL = sb.toString();
							%>		
	                        	<div class="detail">                        	                        	
	                        		<a href="<%=rssURL%>"><img hspace="10" height="10" width="37" align="left" src="<%= themeDisplay.getPathThemeImage() %>/HN_image/rss.gif"/></a>
	                        	
	                        		<a href="<%=catURL.toString()%>"><img  width="57" height="15" src="<%= themeDisplay.getPathThemeImage() %>/HN_image/tinthem.gif"/></a> &nbsp; &nbsp; 
	                        	</div>   
	                        	
	                        </c:if>	
						</td>
					</tr>	
					<tr><td height="5" colspan="2"></td></tr>
				</table>									
			</td>
		<%
		}	      
	   	%>
	</tr>
	<tr><td height="3"></td></tr>
</table>
