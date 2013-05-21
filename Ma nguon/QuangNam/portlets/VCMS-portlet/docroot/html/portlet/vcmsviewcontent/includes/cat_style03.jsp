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
		<div class="bg_news_top_tab_on" ><a href="<%=catURL.toString()%>" style="padding-left:15px;padding-right:15px;"><%= category.getName() %></a></div>
		<span><img src="<%= themeDisplay.getPathThemeImages() %>/DB_image/tab_active_right.gif" align="left" height="26"/></span>
	<%
		}else{
	%>
		<div class="bg_news_top_tab_off" style="padding-left:15px;padding-right:15px;"><a href="<%=catURL.toString()%>"><%= category.getName() %></a></div>   
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
	</td>
	</tr>
	<tr>
	 <td class="boder_tab_light_blue">
   <div>
           <%
		  int sumAticles = numberArticlesNextInCat+numberArticlesInCat;
		  List articlesByCat = (List)VcmsArticleServiceUtil.getTopNewArticles(groupId , language , null,catDefault, statusId , sumAticles);
		  int numberAricles =0;
		  if(articlesByCat.size()<numberArticlesInCat){
		    numberAricles = articlesByCat.size();
		  }else{
		    numberAricles =numberArticlesInCat ;
		  }
		   %>
	   <table width="100%" border="0" cellspacing="0" cellpadding="0">
		  <tr>
			<td width="70%" valign="top">
			   <table width="100%" border="0" cellspacing="0" cellpadding="0">
			    <tr>
			        <td height="10">
			        </td>
			      </tr> 
			   <%
				for (int j = 0; j < numberAricles; j++) {
					VcmsArticle article = (VcmsArticle)articlesByCat.get(j);
					PortletURL articleURL= new PortletURLImpl(request,portletSelectId, plId, PortletRequest.RENDER_PHASE);
					articleURL.setParameter("struts_action", "/vcmsviewcontent/view");
					articleURL.setParameter("articleId", article.getArticleId());
					articleURL.setParameter("categoryId", catDefault);
				%>
			    <tr>
			    <td colspan="2" align="justify" style="padding-right:15px;">
				  <div class="title_new3" style="padding-left:15px;padding-right:5px;"><a href="<%= articleURL %>">&nbsp;» &nbsp;<%= article.getTitle() %></a></div>
				</td>
					
				 <tr>
			        <td height="5">
			        </td>
			      </tr> 
				</tr>
					
				  <tr>
				  <%if (article.getHasImage()){%>
				    <td valign="top" style="padding-left:15px;">
				    	<img src="<%= themeDisplay.getPathImage() + "/images?img_id=" + article.getImage()  %>" width="140" style=" margin-bottom:5px;margin-left:5px;margin-right:5px;margin-top:2px;" align="left" />
				    </td>
					<%}%>
					<td valign="top" style="padding-left:10px;padding-right:10px;">
				       <div style="float:left;color:black;font-size:12px;font-weight:normal;" align="justify">
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
			
			<td width="30%" valign="top">
			  <div>&nbsp;</div>
				  <div class="other_new4" style="padding-right:15px;">
				  	<div><img src="<%= themeDisplay.getPathThemeImages() %>/DB_image/i_09.gif" /></div>
					  <div>
						<ul>
						  <% 
								PortletURL articleNewURL= new PortletURLImpl(request,portletSelectId, plId, PortletRequest.RENDER_PHASE);
								for (int j = numberArticlesInCat; j < articlesByCat.size(); j++) {
								VcmsArticle articleNew = (VcmsArticle)articlesByCat.get(j);
								articleNewURL.setParameter("struts_action", "/vcmsviewcontent/view");
								articleNewURL.setParameter("articleId", articleNew.getArticleId());
								articleNewURL.setParameter("categoryId", catDefault);			
							%>
						<li style="padding:2px;font-size:11px;" ><a href="<%= articleNewURL %>"><%= articleNew.getTitle() %> </a></li>
						<%	
							}
						%>				
						</ul>
					</div>
    			</div>
			  <div>&nbsp;</div>
			</td>
		  </tr>
		</table>
   </div>
   </td>
   </tr>
 <tr>
 <td width="100%" background="<%= themeDisplay.getPathThemeImages() %>/DB_image/bottom_center.gif">
    <span><img src="<%= themeDisplay.getPathThemeImages() %>/DB_image/i_07.gif" align="left" height="6"/></span>
	<span><img src="<%= themeDisplay.getPathThemeImages() %>/DB_image/bottom_right.gif" align="right" height="6"/>  </span>
	</td>	
</tr>
</table>
