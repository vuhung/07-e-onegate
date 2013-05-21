<table width="100%" border="0" cellspacing="0" cellpadding="0">
  <tr>
    <td>
	<div class="bg_news_top_tab">
	<%
	String catDefault="";
	PortletURL catURL = new PortletURLImpl(request,portletSelectId, plId, PortletRequest.RENDER_PHASE);
	catURL.setParameter("struts_action", "/vcmsviewcontent/view");
	for(int i=0;i<listCategory.length;i++){
	  VcmsCategory category = (VcmsCategory)VcmsCategoryServiceUtil.getCategory(listCategory[i]);
	  catURL.setParameter("categoryId", category.getCategoryId());
		 if(i==0){
		 catDefault = category.getCategoryId();
	%>
		<span><img src="<%= themeDisplay.getPathThemeImages() %>/DB_image/i_08.gif" align="left" height="26"/></span>
		<div class="bg_news_top_tab_on" ><a href="<%=catURL.toString()%>"><%= category.getName() %></a></div>
		<span><img src="<%= themeDisplay.getPathThemeImages() %>/DB_image/tab_active_right.gif" align="left" height="26"/></span>
	<%
		}else{
	%>
		<div class="bg_news_top_tab_off"><a href="<%=catURL.toString()%>"><%= category.getName() %></a></div>   
	<%
		  if(i!=listCategory.length-1){
	%>	 
		<div class="bg_news_top_tab_off">|</div>  
	<%
		  }
		}
	}	      
   %>
	</div>
   <div class="boder1">
           <%
		  List articlesByCat = (List)VcmsArticleServiceUtil.getTopNewArticles(groupId , language , null,catDefault, statusId , numberArticlesInCat);
		   %>
     
	   <table width="100%" border="0" cellspacing="0" cellpadding="0">
		  <tr>
			<td width="70%" valign="top">
			   <table width="100%" border="0" cellspacing="0" cellpadding="0">
			   <%
			    String lastArticles="";
				for (int j = 0; j < articlesByCat.size(); j++) {
					VcmsArticle article = (VcmsArticle)articlesByCat.get(j);
					
					PortletURL articleURL= new PortletURLImpl(request,portletSelectId, plId, PortletRequest.RENDER_PHASE);
					articleURL.setParameter("struts_action", "/vcmsviewcontent/view");
					articleURL.setParameter("articleId", article.getArticleId());
					articleURL.setParameter("categoryId", catDefault);
					if(j==articlesByCat.size()-1){
					   lastArticles = article.getArticleId();
					}
				%>
	
				  <tr>
					<td>
					  <div class="new_top2"><img src="<%= themeDisplay.getPathImage() + "/images?img_id=" + article.getImage()  %>" width="140" style="  margin:8px" align="left" />
          		  <div class="title_new3"><a href="<%= articleURL %>"><%= article.getTitle() %></a></div>
<%=article.getLead()%></div>
					</td>
				  </tr>
				 <%
						}
				%> 
				</table>
			</td>
			<td width="30%" valign="top">
			  <div class="other_new4">
			  <div><img src="<%= themeDisplay.getPathThemeImages() %>/DB_image/i_09.gif" /></div>
			  <div>
				<ul>
				  <% 
		
					if(articlesByCat.size() == numberArticlesInCat){
					   List listNextArticle = VcmsArticleServiceUtil.getOlderArticles(groupId, language, null, catDefault, lastArticles,
						statusId, numberArticlesNextInCat);
						PortletURL articleNewURL= new PortletURLImpl(request,portletSelectId, plId, PortletRequest.RENDER_PHASE);
						for (int j = 0; j < listNextArticle.size(); j++) {
						VcmsArticle articleNew = (VcmsArticle)listNextArticle.get(j);
						articleNewURL.setParameter("struts_action", "/vcmsviewcontent/view");
						articleNewURL.setParameter("articleId", articleNew.getArticleId());
						articleNewURL.setParameter("categoryId", catDefault);			
					%>
				<li><a href="<%= articleNewURL %>"><%= articleNew.getTitle() %> </a></li>
				<%	
								}
							}
							%>
				</ul>
			</div>
    </div>
			</td>
		  </tr>
		</table>
   </div>
   <div class="bottom_news_tab">
    <span><img src="<%= themeDisplay.getPathThemeImages() %>/DB_image/i_07.gif" align="left" height="6"/></span>
	<div class="bottom_center_news_tab">&nbsp;</div>
	<span><img src="<%= themeDisplay.getPathThemeImages() %>/DB_image/bottom_right.gif" align="left" height="6"/>  </span>   </div>	</td>
  </tr>
</table>
