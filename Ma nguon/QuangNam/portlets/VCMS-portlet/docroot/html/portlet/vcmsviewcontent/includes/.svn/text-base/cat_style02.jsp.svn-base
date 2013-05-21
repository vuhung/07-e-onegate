<table width="100%" border="0" cellspacing="0" cellpadding="0">
<tr>
    <td>
	<%
		VcmsArticle lastArticle = null;	
		List articlesByCat = (List)VcmsArticleServiceUtil.getTopNewArticles(groupId , language , null,listCategory[0], statusId , numberArticlesInCat);
		VcmsCategory category = null;
		try{
		 	category = (VcmsCategory)VcmsCategoryServiceUtil.getCategory(listCategory[0]);
		}catch(Exception e){
		}
		PortletURL catURL = new PortletURLImpl(request,portletSelectId, plId, PortletRequest.RENDER_PHASE);
		catURL.setParameter("jspPage","/html/portlet/vcmsviewcontent/view.jsp" );
		catURL.setParameter("categoryId", category.getCategoryId());
	
	%>
        <div class="title">
        	<b><%= category.getName() %></b>			
		</div>
        <div class="ct-right-01">
        	<div class="textlink">
				<%
				for (int j = 0; j < articlesByCat.size(); j++) {
					VcmsArticle article = (VcmsArticle)articlesByCat.get(j);
					
					PortletURL articleURL= new PortletURLImpl(request,portletSelectId, plId, PortletRequest.RENDER_PHASE);
					articleURL.setParameter("jspPage","/html/portlet/vcmsviewcontent/view.jsp" );
					articleURL.setParameter("articleId", article.getArticleId());
					articleURL.setParameter("categoryId", category.getCategoryId());
					if(j!=articlesByCat.size()-1){
		          %>
		          <div align="left" class="bg">» &nbsp;<a href="<%= articleURL %>"><%= StringUtil.shorten(article.getTitle(),60) %></a></div>
				  <%
				  }else{
				  %>
		          <div align="left" style="padding-top: 5px;">» &nbsp;<a href="<%= articleURL %>"><%= StringUtil.shorten(article.getTitle(),60) %></a></div>     
				<%
		        	   }
					}
				%>
			</div>
    </div>  
    
</td>
</tr>
</table>