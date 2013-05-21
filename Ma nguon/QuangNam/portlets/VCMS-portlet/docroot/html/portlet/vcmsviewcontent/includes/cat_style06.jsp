<%
	VcmsArticle lastArticle = null;	
	List articlesByCat = (List)VcmsArticleServiceUtil.getTopNewArticles(groupId , language , null,listCategory[0], statusId , numberArticlesInCat);
	VcmsCategory category = null;
	try{
		category = (VcmsCategory)VcmsCategoryServiceUtil.getCategory(listCategory[0]);
	}catch(Exception e){
	}
	PortletURL catURL = new PortletURLImpl(request,portletSelectId, plId, PortletRequest.RENDER_PHASE);
	catURL.setParameter("struts_action", "/vcmsviewcontent/view");
	catURL.setParameter("categoryId", category.getCategoryId());

%>

<table class="left_top_cms" height="150" width="100%">
	<tr>				
		<td>
			<div class="galery_title"><b><%= category.getName() %></b></div>				
			<div style="padding-bottom: 8px;">
			<%
				for (int j = 0; j < articlesByCat.size(); j++) {
					VcmsArticle article = (VcmsArticle)articlesByCat.get(j);
					
					PortletURL articleURL= new PortletURLImpl(request,portletSelectId, plId, PortletRequest.RENDER_PHASE);
					articleURL.setParameter("struts_action", "/vcmsviewcontent/view");
					articleURL.setParameter("articleId", article.getArticleId());
					articleURL.setParameter("categoryId", category.getCategoryId());
		    %>    
					<div align="left" style="padding: 7px;"> » <a href="<%= articleURL %>"><%= article.getTitle() %></a></div>
			<%					  
				}
		    %>
			  </div>
		</td>
	</tr>
</table>  	