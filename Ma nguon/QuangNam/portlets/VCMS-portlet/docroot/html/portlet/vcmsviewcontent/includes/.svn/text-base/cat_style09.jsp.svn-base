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
		 
	<div class="box_left_portlet bullet_white_orange title_orange">
				<div class="title">
	<div class="title_wrap">
	<div><%= category.getName() %></div>
	</div> 
	</div>
	<div class="border_orange">
	    <div class="content_orange">
	     <table width="100%" border="0" cellspacing="0" cellpadding="0">
		   <tr>
		    <td height="5">
		    </td>
		   </tr> 
		
		  <%
		for (int j = 0; j < articlesByCat.size(); j++) {
			VcmsArticle article = (VcmsArticle)articlesByCat.get(j);
			
			PortletURL articleURL= new PortletURLImpl(request,portletSelectId, plId, PortletRequest.RENDER_PHASE);
			articleURL.setParameter("struts_action", "/vcmsviewcontent/view");
			articleURL.setParameter("articleId", article.getArticleId());
			articleURL.setParameter("categoryId", category.getCategoryId());
          %>
		   <tr style="margin-left:5px;">
		     <td width="1%"></td>
			<td><a href="<%= articleURL %>"><img src="<%= themeDisplay.getPathImage() + "/images?img_id=" + article.getImage()  %>"   width="60px"/></a></td>
			<td width="1%"></td>
			<td valign="top"><a href="<%= articleURL %>"><%= article.getTitle() %></a></td>
			<td width="1%"></td>
		  </tr>
		  <%
		  if(j!=articlesByCat.size()-1){
		  %>
		  <tr>
		    <td colspan="4">
			  <hr width="98%" color="#CCCCCC" size="0.5px" /> 
			</td>
		  </tr>
		  <%
		  }
		}
     %>
      <tr>
	    <td height="5">
	    </td>
	   </tr>  
	  </table>
	  </div>
	  </div>
	  </div>
	  </td>
 </tr>	  
</table>