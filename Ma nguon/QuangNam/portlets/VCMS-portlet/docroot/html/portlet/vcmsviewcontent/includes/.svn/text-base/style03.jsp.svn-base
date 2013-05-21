<script language="javascript">	
	function <portlet:namespace/>sendDataFromContent(catURL){
		document.<portlet:namespace/>fm.action = catURL;
		document.<portlet:namespace/>fm.submit();
	}
</script>
<form name="<portlet:namespace/>fm" method="POST">
<table width="100%" border="0" cellspacing="0" cellpadding="0">
  <tr>
    <td><img src="/html/portlet/vcmsviewcontent/images/0.gif" width="1" height="1" /></td>
  </tr>
<tr>
    <td class="boder">
<%
	List listIntroArticle = null;
	VcmsArticle lastArticle = null;
	String selectedDisplayCats[] = StringUtil.split(strSelectedDisplayCats,",");
	
	if(numberArticlesPerParentCat > 0){
	
	// Display articles in parent category
	List listArticleByParentCat = (List)VcmsArticleServiceUtil.getTopNewArticles(groupId , language,null,categoryId,statusId,numberArticlesPerParentCat);
	
	if(listArticleByParentCat != null && listArticleByParentCat.size()>0){
		VcmsCategory parentCategory = (VcmsCategory)VcmsCategoryServiceUtil.getCategory(categoryId);

%>
         <table width="100%" border="0" cellspacing="0" cellpadding="0">
              <tr>
                <td class="title_center"><%= parentCategory.getName() %></td>
              </tr>
<%
		for(int i=0; i<listArticleByParentCat.size();i++){
			
			VcmsArticle article = (VcmsArticle)listArticleByParentCat.get(i);
			
			PortletURL articleURL;
			articleURL = new PortletURLImpl(request,portletSelectId, plId, PortletRequest.RENDER_PHASE);
			articleURL.setParameter("struts_action", "/vcmsviewcontent/view");
			articleURL.setParameter("articleId", article.getArticleId());
			articleURL.setParameter("categoryId", categoryId);
%>
<tr>
                <td>
		    			<table width="95%" border="0" align="center" cellpadding="0" cellspacing="0">
		                  <tr>
		                    <td height="10"><img src="/html/portlet/vcmsviewcontent/images/0.gif" width="1" height="1" /></td>
		                  </tr>
		                  <tr>
		                    <td>
		    					<div align="justify">
			                        <table width="100" border="0" align="left" cellpadding="7" cellspacing="0">
			                          <tr>
			                            <td><div class="n-img"><a href="<%= articleURL %>"><img src="<%= themeDisplay.getPathImage() + "/images?img_id=" + article.getImage()  %>" height="143" align="absmiddle"></a></div></td>
			                          </tr>
			                        </table>
			                        <div>
				                        <span class="text_none2">» <a href="<%= articleURL %>"><%= article.getTitle() %></a></span>
				    					<span class="text_none"><%=article.getLead()%></span><br /><br />
			                        </div>
		                        	<!--<div align="right"><span class="text_none">................................................................................</span><span class="text_detail"> <a href="<%= articleURL %>">Xem chi ti&#7871;t »</a></span></div>-->
		                    	</div>
		    				</td>
		                  </tr>
		                </table>
				</td>
          </tr>
          <tr>
	        <td>&nbsp;</td>
	      </tr>

<%		}
	}else{
		List listCategoriesByParent = (List)VcmsCategoryServiceUtil.getCategoriesByParent(groupId , categoryId , language);
			if(listCategoriesByParent == null || listCategoriesByParent.size() == 0){
%>
		<table width="100%" class="chanel-news no-bot" border="0" cellspacing="0" cellpadding="4" align="center">
	            <tr>
		              <td align="center">
							<br/><img src="/html/portlet/vcmsviewcontent/images/under_construction.jpg"/><br/><br/>
					  </td>
				</tr>
		</table>
<%		}
	}
}
	// Display articles in each children category
    if(selectedDisplayCats.length > 0){
	  for (int i = 0; i < selectedDisplayCats.length; i++) {
		VcmsCategory subcategory = (VcmsCategory)VcmsCategoryServiceUtil.getCategory(selectedDisplayCats[i]);
		
		PortletURL catURL = new PortletURLImpl(request,portletSelectId, plId, PortletRequest.RENDER_PHASE);
		catURL.setParameter("struts_action", "/vcmsviewcontent/view");
		catURL.setParameter("categoryId",subcategory.getCategoryId());
		catURL.setParameter("cat_parent",subcategory.getParentId());
		catURL.setParameter("categoriesSelectedCats", categoriesConfiguration);
		catURL.setParameter("groupId", String.valueOf(groupId));
		catURL.setParameter("language", language);
		catURL.setWindowState(WindowState.NORMAL);
		
		listIntroArticle = (List)VcmsArticleServiceUtil.getTopNewArticles(groupId , language,null,subcategory.getCategoryId(),statusId,numberArticlesPerChildrenCat);
		
		if(listIntroArticle != null && listIntroArticle.size()>0){
%>
         <table width="100%" border="0" cellspacing="0" cellpadding="0">
              <tr>
                <td class="title_center"><a href="<%= catURL %>"><%= subcategory.getName() %></a></td>
              </tr>
<%
		for (int j = 0; j < listIntroArticle.size(); j++) {
			VcmsArticle article = (VcmsArticle)listIntroArticle.get(j);
			
			PortletURL articleURL;
			articleURL = new PortletURLImpl(request,portletSelectId, plId, PortletRequest.RENDER_PHASE);
			articleURL.setParameter("struts_action", "/vcmsviewcontent/view");
			articleURL.setParameter("articleId", article.getArticleId());
			articleURL.setParameter("categoryId", subcategory.getCategoryId());
%>
		<tr>
                <td>
		    			<table width="95%" border="0" align="center" cellpadding="0" cellspacing="0">
		                  <tr>
		                    <td height="10"><img src="/html/portlet/vcmsviewcontent/images/0.gif" width="1" height="1" /></td>
		                  </tr>
		                  <tr>
		                    <td>
		    					<div align="justify">
			                        <table width="100" border="0" align="left" cellpadding="7" cellspacing="0">
			                          <tr>
			                            <td><div class="n-img"><a href="<%= articleURL %>"><img src="<%= themeDisplay.getPathImage() + "/images?img_id=" + article.getImage()  %>" width="183" height="143" align="absmiddle"></a></div></td>
			                          </tr>
			                        </table>
			                        <div>
				                        <span class="text_none2">» <a href="<%= articleURL %>"><%= article.getTitle() %></a></span>
				    					<span class="text_none"><%=article.getLead()%></span><br /><br />
			                        </div>
		                        	<!--<div align="right"><span class="text_none">................................................................................</span><span class="text_detail"> <a href="<%= articleURL %>">Xem chi ti&#7871;t »</a></span></div>-->
		                    	</div>
		    				</td>
		                  </tr>
		                </table>
				</td>
          </tr>
          <tr>
	        <td>&nbsp;</td>
	      </tr>
<%
		}

%>

</table>
<% 

if(listIntroArticle.size() == numberArticlesPerChildrenCat){
		lastArticle = (VcmsArticle)listIntroArticle.get(listIntroArticle.size()-1);
  	    
  	    List listNextArticle = VcmsArticleServiceUtil.getOlderArticles(
					groupId, language, null, subcategory.getCategoryId(), lastArticle.getArticleId(),
					statusId, numberNextArticlesPerChildrenCat);
		
	if(listNextArticle != null && listNextArticle.size()>0){
%>

<table width="95%" border="0" align="center" cellpadding="0" cellspacing="0">
	<tr>
	  <td height="10"><img src="images/0.gif" width="1" height="1" /></td>
	</tr>
	<tr>
	  <td>
			<p class="text_none"><strong>Tin t&#7913;c khác</strong></p>
					  <p class="org2 indent u">
							<%
								if (listNextArticle.size() > 0) {
									for (int j = 0; j < listNextArticle.size(); j++) {
										VcmsArticle articleNew = (VcmsArticle)listNextArticle.get(j);

										PortletURL articleNewURL;
										articleNewURL = new PortletURLImpl(request,portletSelectId, plId, PortletRequest.RENDER_PHASE);
										articleNewURL.setParameter("struts_action", "/vcmsviewcontent/view");
										articleNewURL.setParameter("articleId", articleNew.getArticleId());
										articleNewURL.setParameter("categoryId", subcategory.getCategoryId());
							%>
										<span><a href="<%= articleNewURL %>">» <%= articleNew.getTitle() %> </a></span> <span class="text_none">(<%=dateFormatDateTime.format(articleNew.getPublishedDate())%>)</span>
							<%
								}
							}
							%>
			</p>
			</td>
	</tr>
</table>
<%			}
		}
%>
<%		}else{
	
	%>
	<!--<table width="100%" class="chanel-news no-bot" border="0" cellspacing="0" cellpadding="4" align="center">
            <tr>
	              <td align="center">
						<br/><img src="/html/portlet/vcmsviewcontent/images/under_construction.jpg"/><br/><br/>
				  </td>
			</tr>
	</table>	
	-->
<%		}
	}
}
%>
		</td>
	</tr>
</table>
</form>