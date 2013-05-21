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
<table width="100%" border="0" cellspacing="0" cellpadding="0">
  <tr>
	<td>
		 
	<div class="box_left_portlet border_orange bullet_white_orange title_orange">
				<div class="title">
	<div class="title_wrap">
	<div><%= category.getName() %></div>
	</div> 
	</div>
	<div class="content content_orange">
		  <ul>
		  <%
		for (int j = 0; j < articlesByCat.size(); j++) {
			VcmsArticle article = (VcmsArticle)articlesByCat.get(j);
			
			PortletURL articleURL= new PortletURLImpl(request,portletSelectId, plId, PortletRequest.RENDER_PHASE);
			articleURL.setParameter("struts_action", "/vcmsviewcontent/view");
			articleURL.setParameter("articleId", article.getArticleId());
			articleURL.setParameter("categoryId", category.getCategoryId());
          %>
		  
		  <li <%= j==0?"class=\"top\"":"" %>><a href="<%= articleURL %>"><%= article.getTitle() %></a></li>
		  
		  <%
		}
     %>
	  </ul>
	  </div>
	  </div>
	  </td>
 </tr>	  
</table>