
	<%
		VcmsArticle lastArticle = null;	
		List articlesByCat = (List)VcmsArticleServiceUtil.getTopNewArticles(groupId , language , null, catId, statusId , numberArticlesInCat);
		VcmsCategory category = null;
		try{
		  category = (VcmsCategory)VcmsCategoryServiceUtil.getCategory(catId);
		}catch(Exception e){
		}
			PortletURL catURL = PortletURLFactoryUtil.create(request,portletSelectId, plId, PortletRequest.RENDER_PHASE);
			catURL.setParameter("jspPage","/html/portlet/vcmsviewcontent/view.jsp" );
			catURL.setParameter("categoryId", category.getCategoryId());
	%>
			
	    	<table width="100%">
	    		<tr height="3"><td colspan="3"></td></tr>
	    		<tr class="center_top_background">
	    			<td id="left_top_tab"></td>		    			
	    			<td>
	    				<div align="left" class="title1"><%= category.getName() %></div>
	    			</td>
					<td id="right_top_tabs"></td>
		   		</tr>
		   </table>f
			<table width="100%" cellspacing="0" cellpadding="0" border="0">
				<tr>		
					<td class="boder_top" bgcolor="#FFFFFF" style="padding-top:0px;">
								  
							<%
									for (int j = 0; j < articlesByCat.size(); j++) {
										VcmsArticle article = (VcmsArticle)articlesByCat.get(j);
										
										PortletURL articleURL= PortletURLFactoryUtil.create(request,portletSelectId, plId, PortletRequest.RENDER_PHASE);
										articleURL.setParameter("jspPage","/html/portlet/vcmsviewcontent/view.jsp" );
										articleURL.setParameter("articleId", article.getArticleId());
										articleURL.setParameter("categoryId", category.getCategoryId());
							%>			
									
										<table width="100%">
									    	<tr>	
									        	<td colspan="3" style="padding-bottom:5px;">
									        		<br/>
									           		<a href="<%=articleURL%>"><b><%= article.getTitle() %></b></a>
									           		<br/>
									           	</td>
									       	</tr>
									        <tr>
									           	<c:if test="<%=article.getHasImage()%>">	
									            	<td><a href="<%=articleURL%>"><img align="left" width="148" src="<%= themeDisplay.getPathImage() + "/images?img_id=" + article.getImage()  %>" /></a></td>
									            	<td width="10">&nbsp;</td>
									           	</c:if>
									           	<td valign="top" align="justify" <%=!article.getHasImage()?"colspan='3'":""%> ><%=StringUtil.shorten(HtmlUtil.extractText(article.getLead()),500)%></td>
									        </tr>
										</table>
									 
							<%
									}
							%>
						
							<%
							StringBuilder sb = new StringBuilder();
						
							sb.append(themeDisplay.getPathMain());
							sb.append("/vcmsviewcontent/rss?");
							sb.append("categoryId=" + category.getCategoryId());
							sb.append("&p_l_id=" + Long.toString(plId));
							sb.append("&portletSelectId=" + portletSelectId);
							String rssURL = sb.toString();
						%>
						<div style="float: right;">
								<a href="<%=rssURL.toString()%>">
									<img src="<%=themeDisplay.getPathThemeImage()%>/HN_image/rss.gif">
								</a>
						</div>						
						
						<% 
							if(articlesByCat.size() == numberArticlesInCat){
								lastArticle = (VcmsArticle)articlesByCat.get(articlesByCat.size()-1);
								List listNextArticle = VcmsArticleServiceUtil.getAllCategoryArticles(groupId, language,catId,statusId,numberArticlesInCat,numberArticlesInCat+numberArticlesNextInCat);
						%>
						
							<table width="95%" border="0" align="center" cellpadding="0" cellspacing="0">
								<tr>
									<td>
										<p class="text_none"><strong><%= LanguageUtil.get(pageContext, "com.vportal.portlet.vcmsviewcontent.otherview") %></strong></p>
										
											<%	String articleTitle = "";
												if (listNextArticle.size() > 0) {
												for (int j = 0; j < listNextArticle.size(); j++) {
													VcmsArticle articleNew = (VcmsArticle)listNextArticle.get(j);
													/*
													articleTitle = articleNew.getTitle();
													int ch = 60;
													int space = 0;
													if(articleTitle.length()>ch){
														  space = articleTitle.indexOf(" ",ch);
														  if(space>0){
															  articleTitle = articleTitle.substring(0,space) + " ...";
														  }
													}
													*/
													PortletURL articleNewURL;
													articleNewURL = PortletURLFactoryUtil.create(request,portletSelectId, plId, PortletRequest.RENDER_PHASE);
													articleNewURL.setParameter("jspPage","/html/portlet/vcmsviewcontent/view.jsp" );
													articleNewURL.setParameter("articleId", articleNew.getArticleId());
													articleNewURL.setParameter("categoryId", category.getCategoryId());
												%>													
													<div class="text_09"><a href="<%= articleNewURL %>"><%= articleNew.getTitle()%></a>&nbsp;<span style="color: rgb(144, 144, 144);">(<%=ActionUtil.dateParser(articleNew.getPublishedDate())%>)</span></div>
												<%}}%>
										
									</td>
								</tr>
							</table>
						<%	
						}
						%>
					</td>
				</tr>
			</table>
				
		<table width="100%">
			<tr>
				<td width="4"><img src="<%= themeDisplay.getPathThemeImage() %>/HN_image/i_34.gif" width="4" height="4"/></td>
				<td id="center_bottom_background"></td>
				<td width="4"><img src="<%= themeDisplay.getPathThemeImage() %>/HN_image/i_35.gif" width="4" height="4"/></td>
			</tr>
			<tr height="3"><td colspan="3"></td></tr>
		</table>	
