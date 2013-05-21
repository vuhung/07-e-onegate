
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



<div id="news_right">
    	<div class="right" id="right">

            <div class="right-01">
            	<div class="news_title"><%= category.getName() %></div>
                <div class="ctn-right-01">			
                 	 <table width="100%">
                 	 	<%
						for (int j = 0; j < articlesByCat.size(); j++) {
							VcmsArticle article = (VcmsArticle)articlesByCat.get(j);
							
							PortletURL articleURL= new PortletURLImpl(request,portletSelectId, plId, PortletRequest.RENDER_PHASE);
							articleURL.setParameter("struts_action", "/vcmsviewcontent/view");
							articleURL.setParameter("articleId", article.getArticleId());
							articleURL.setParameter("categoryId", category.getCategoryId());							
					  %>	 
                 	 <tr> 
                 	 	  <td width="100%" <%=(j%2==0)? "class='clearfix'":"class='cssbg clearfix'"%> style="padding-bottom:3px;">
	                 	 	  <table width="100%">
	                 	 	  <% if (article.getHasImage()){%>
	                 	 	  <tr>
	                 	 	  	 <td style="padding-left:3px;">
	                 	 	  		<img src="<%= themeDisplay.getPathImage() + "/images?img_id=" + article.getImage()  %>" width="53" height="53" align="left" /></td>                 	 	  	 
	                 	 	  	 <td style="width:5px;">&nbsp;</td>
	                 	 	  	 <td style="padding-right:3px;"><%= article.getTitle() %></td>
	                 	 	  </tr>
	                 	 	  <%}else{%>
	                 	 	  <tr>	  
	                 	 	  	  <td style="padding-left:3px;padding-right:3px;" align="justify" width="100%">
	                 	 	  	  	<%= article.getTitle() %>
	                 	 	  	  </td>
	                 	 	  </tr>	  
	                 	 	  <%}%>  
	                 	 	  </table>
                 	 	 </td>
                 	 </tr>
                 	 	 <%}%>  
                 	 </table>
                </div>
            </div>
            
        </div>
    </div>
