<%
	VcmsArticle lastArticle = null;	
	List articlesByCat = (List)VcmsArticleServiceUtil.getTopNewArticles(groupId , language , null,catId, statusId , numberArticlesInCat);
	VcmsCategory category = null;
	try{
		category = (VcmsCategory)VcmsCategoryServiceUtil.getCategory(catId);
	}catch(Exception e){
	}
	PortletURL catURL = PortletURLFactoryUtil.create(request,portletSelectId, plId, PortletRequest.RENDER_PHASE);
	catURL.setParameter("jspPage","/html/portlet/vcmsviewcontent/view.jsp" );
	catURL.setParameter("categoryId", category.getCategoryId());

%>
<table width="100%" border="0" cellspacing="0" cellpadding="0" class="dsdn">
	<tr>
		<td width="25%"></td>
		<td width="75%">	
			<table width="100%" border="0" cellspacing="0" cellpadding="0">
				<tr>
					<td>&nbsp;</td>
					<td>
						<table width="100%" border="0" cellspacing="0" cellpadding="0">
						 <%
							for (int j = 0; j < articlesByCat.size(); j++) {
								VcmsArticle article = (VcmsArticle)articlesByCat.get(j);							
								PortletURL articleURL= PortletURLFactoryUtil.create(request,portletSelectId, plId, PortletRequest.RENDER_PHASE);
								articleURL.setParameter("jspPage","/html/portlet/vcmsviewcontent/view.jsp" );
								articleURL.setParameter("articleId", article.getArticleId());
								articleURL.setParameter("categoryId", category.getCategoryId());
								if(j%5==0){
						  %>
						  	<tr>
								<%
									}
								%>	  
								<td width="1%">
								</td>
								<td width="15%" valign="top">
									<table width="100%" border="0" cellspacing="0" cellpadding="0">
										<tr>
											<td align="center" valign="top">  
												<img src="<%= themeDisplay.getPathImage() + "/images?img_id=" + article.getImage()  %>" width="100">
											</td>
										 </tr>
										 <tr>
											<td align="center" valign="top"> 
												<div>
												  <a style="font-size: 11px;" href="<%= articleURL %>"><%= StringUtil.shorten(article.getTitle(),32) %></a>
												</div>
											 </td>
										 </tr>
									</table>
								</td>
								
							<%
							if(j%5==4){
							%>	
							  </tr>
							 <% 
							  }
							}
							%>
						</table>
				</td>
				<td width="15">&nbsp;</td>
			  </tr>
			</table>	 
	  </td>
 </tr>	  
</table>