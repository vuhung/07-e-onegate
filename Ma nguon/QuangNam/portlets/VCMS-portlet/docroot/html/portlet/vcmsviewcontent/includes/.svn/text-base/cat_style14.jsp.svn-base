<%
	VcmsArticle lastArticle = null;	
	int sumAticles = numberArticlesNextInCat+numberArticlesInCat;
	List articlesByCat = (List)VcmsArticleServiceUtil.getTopNewArticles(groupId , language , null,listCategory[0], statusId , sumAticles);
	VcmsCategory category = null;
	try{
		category = (VcmsCategory)VcmsCategoryServiceUtil.getCategory(listCategory[0]);
	}catch(Exception e){
	}
	PortletURL catURL = new PortletURLImpl(request,portletSelectId, plId, PortletRequest.RENDER_PHASE);
	catURL.setParameter("struts_action", "/vcmsviewcontent/view");
	catURL.setParameter("categoryId", category.getCategoryId());
  int numberAricles =0;
	  if(articlesByCat.size()<numberArticlesInCat){
		numberAricles = articlesByCat.size();
	  }else{
		numberAricles =numberArticlesInCat ;
	  }
%>

<div align="center">
<table width="98%" border="0" cellspacing="0" cellpadding="0">
  <tr>
	<td class="bg_title_news">
	  <table width="100%" border="0" cellspacing="0" cellpadding="0">
		<tr>
		  <td width="50">&nbsp;</td>
		  <td  width="80" class="title_news2" nowrap="nowrap" align="left"><%= category.getName() %></td>
		  <td>&nbsp;</td>
		</tr>
	  </table>
	</td>
  </tr>
  <tr>
	<td class="bg_news_top">
	    <table width="100%" border="0" cellspacing="0" cellpadding="0">
		  <tr>
			<td>
			    <table width="100%" border="0" cellspacing="0" cellpadding="0">
				 <%
					for (int j = 0; j < numberAricles; j++) {
						VcmsArticle article = (VcmsArticle)articlesByCat.get(j);
						
						PortletURL articleURL= new PortletURLImpl(request,portletSelectId, plId, PortletRequest.RENDER_PHASE);
						articleURL.setParameter("struts_action", "/vcmsviewcontent/view");
						articleURL.setParameter("articleId", article.getArticleId());
						articleURL.setParameter("categoryId", category.getCategoryId());
						articleURL.setParameter("defaultShowNews", defaultShowNews);
					  %>
					   <tr>
						<td colspan="3" class="text_new" style="padding-left:20px;" align="left">
						 	<a href="<%= articleURL %>"><%= article.getTitle() %></a>
						</td>
						 <tr>
							<td colspan="2" height="5">
							</td>
						  </tr> 
						</tr>
						  <tr>
						  
						  	<c:if test="<%=article.getHasImage()%>">
							<td valign="top" style="padding-left:10px;">
							<img src="<%= themeDisplay.getPathImage() + "/images?img_id=" + article.getImage()  %>" width="140" style=" margin-bottom:5px;margin-left:5px;margin-right:5px;margin-top:2px;" align="left" />
							</td>
							</c:if>
							<td <%=article.getHasImage()?"colspan='2'":""%> valign="top">
							   <div style="float:left;color:black;font-size:12px;font-weight:normal;padding-left:5px;padding-right:5px;" align="justify">
								<%=article.getLead()%>
								</div>
							</td>
						  </tr>
						  <tr>
							<td height="3">
							</td>
						  </tr>
				 <%
				 }
				 %>
				</table>
			</td>
		  </tr>
		  <tr>
			<td valign="top" class="color_862727" style="padding-left:5px;" align="left"> 
			  <ul>
				  <% 
						PortletURL articleNewURL= new PortletURLImpl(request,portletSelectId, plId, PortletRequest.RENDER_PHASE);
						for (int j = numberArticlesInCat; j < articlesByCat.size(); j++) {
						VcmsArticle articleNew = (VcmsArticle)articlesByCat.get(j);
						articleNewURL.setParameter("struts_action", "/vcmsviewcontent/view");
						articleNewURL.setParameter("articleId", articleNew.getArticleId());
						articleNewURL.setParameter("categoryId", listCategory[0]);	
					%>
				
						   <li style="padding:1px;"><a href="<%= articleNewURL %>"><%= articleNew.getTitle() %> </a></li>
				<%		
					}
				%>
			</ul>	
			</td>
		  </tr>
		</table>
	  </td>
</tr>
<tr><td height="5"></td></tr>						  
</table>
</div>