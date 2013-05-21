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
<div class="dsdn">		    
	<table width="100%" border="0" cellspacing="0" cellpadding="0" >
	  	<tr>
	  		<td width="50%"></td>
			<td width="50%" style="padding: 18px 10px 10px 10px;">
							
			  	<%
					for (int j = 0; j < articlesByCat.size(); j++) {
						VcmsArticle article = (VcmsArticle)articlesByCat.get(j);
						
						PortletURL articleURL= new PortletURLImpl(request,portletSelectId, plId, PortletRequest.RENDER_PHASE);
						articleURL.setParameter("struts_action", "/vcmsviewcontent/view");
						articleURL.setParameter("articleId", article.getArticleId());
						articleURL.setParameter("categoryId", category.getCategoryId());						
					  
					  %>
					  		<p>» &nbsp; <a style="color:#d30f00; font:bold 12px Arial;" href="<%= articleURL %>"><%= StringUtil.shorten(article.getTitle(),50) %></a></p>
					  <%				  
					 						  
			 		}						
			 	%>
			</td>
		  </tr>
		  <tr>
		  		<td class="bg" colspan="2" width="100%">
		  			<div clas>
		  		</td>
		  </tr>
	</table>	   
</div>	 
