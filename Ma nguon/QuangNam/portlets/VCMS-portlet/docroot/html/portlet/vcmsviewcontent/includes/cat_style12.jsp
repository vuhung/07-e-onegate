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
	<div class="box_left_portlet bullet_white_green title_blue">
	<div class="title">
		<div class="title_wrap">
		<div><%= category.getName() %></div>
		</div> 
	</div>
	<div class="border_blue">
	    <div class="defaultcontent">
		   <table width="100%" border="0" cellspacing="0" cellpadding="0">
		     <%
				for (int j = 0; j < articlesByCat.size(); j++) {
					VcmsArticle article = (VcmsArticle)articlesByCat.get(j);
					
					PortletURL articleURL= new PortletURLImpl(request,portletSelectId, plId, PortletRequest.RENDER_PHASE);
					articleURL.setParameter("struts_action", "/vcmsviewcontent/view");
					articleURL.setParameter("articleId", article.getArticleId());
					articleURL.setParameter("categoryId", category.getCategoryId());
					if(j%2==0){
				  %>
			  <tr>
			   <%
			   }
			   %>
				<td width="50%">
				 <div style=" float:left;padding:5px">
				    <table width="100%" border="0" cellspacing="0" cellpadding="0">
					  <tr>
						<td valign="top"> <img src="<%= themeDisplay.getPathImage() + "/images?img_id=" + article.getImage()  %>" width="70" style=" margin-bottom:5px;margin-left:5px;margin-right:5px;margin-top:2px;" align="left" /></td>
						<td valign="top">
						  <a href="<%= articleURL %>"><%= article.getTitle() %></a>
						</td>
					  </tr>
					</table>
				 </div> 	
				</td>
				<%
				if(j%2==1){
				%>
			  </tr>
			  <tr>
			   <td>
			     <hr size="1" color="#CCCCCC" width="90%" />
			   </td>
			    <td>
			     <hr size="1" color="#CCCCCC" width="90%" />
			   </td>
			  </tr> 
			  <%
			  }
			  }
			  %>
			</table>

	    </div>
	  </div>
	 </div>
	  </td>
 </tr>	  
</table>