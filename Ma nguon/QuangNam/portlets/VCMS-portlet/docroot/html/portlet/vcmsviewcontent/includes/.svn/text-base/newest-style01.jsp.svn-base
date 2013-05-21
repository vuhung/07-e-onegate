<link href="/html/portlet/vcmsviewcontent/includes/css/common.css" rel="stylesheet" type="text/css" />

<%	//Lay cac tin tuc moi nhat
	VcmsArticle lastArticle = null;	
	List topNewestNewArticles = (List)VcmsArticleServiceUtil.getNewestNewArticles(groupId, language, 2, 0, numberArticlesInCat);//2=da xuat ban

	if(topNewestNewArticles != null && topNewestNewArticles.size()>0){

		PortletURL catURL;
		catURL = new PortletURLImpl(request,portletSelectId, plId, false);
		catURL.setParameter("struts_action", "/vcmsviewcontent/view");
		///catURL.setParameter("news-kind", "news-newest");
%>

<div class="bg_tit_c"><div class="icon_tit_c bold"><%= LanguageUtil.get(pageContext, "portlet.vcmsviewcontent.newstest-new") %></div><div class="date"><%=dateFormatDateViet.format(new Date())%></div></div>
<div class="box_new_hot_c">
	
	<%	String lead = "";
		String subLead = "";
		for (int j = 0; j < topNewestNewArticles.size(); j++) {
			VcmsArticle article = (VcmsArticle)topNewestNewArticles.get(j);
			
			lead = article.getLead();
		
			if(lead.length()<=230){
				subLead = lead;
			}else{
				subLead = lead.substring(0,230)+"...";
			}
			int intLastIndexOfBlank = subLead.lastIndexOf(" ", subLead.length()); 
			subLead = subLead.substring(0,intLastIndexOfBlank) + "...";
				
			PortletURL articleURL;
			articleURL = new PortletURLImpl(request,portletSelectId, plId, false);
			articleURL.setParameter("struts_action", "/vcmsviewcontent/view");
			articleURL.setParameter("articleId", article.getArticleId());
			///articleURL.setParameter("news-kind", "news-newest");
				//get and set categoryId
			try{
				List vcmsCARelationList =	VcmsCARelationServiceUtil.getRelationsByArticle(article.getArticleId());
				if(vcmsCARelationList!=null && vcmsCARelationList.size()>0){
					VcmsCARelation vcmsCARelation = (VcmsCARelation)vcmsCARelationList.get(0);
					String cateId = vcmsCARelation.getCategoryId();
					articleURL.setParameter("categoryId", cateId);
				}
			} catch (Exception ex) {
			
			}
%>
	<%if(Validator.isNotNull(article.getImage())){%>
	<a href="<%= articleURL %>" ><img src="<%= themeDisplay.getPathImage() + "/images?img_id=" + article.getImage()  %>" width="150" height="150"></a>
    <%}%>
    <p><a  href="<%= articleURL %>" class="green bold" style="font-size:13px"><%= article.getTitle() %></a><a style="font-size:10px;color:#9a331b"> (<%=dateFormatDate.format(article.getPublishedDate())%>)</a></p>
    <p><%=subLead%></p>
	<p class="clear"></p>
    <p style="font-size:11px;"><a href="<%= articleURL %>" class="green bold"><%= LanguageUtil.get(pageContext, "portlet.vcmsviewcontent.see-detail") %> &raquo;</a></p>
<%
		}
	}
%>

</div>

<%List nextNewestNewArticles = (List)VcmsArticleServiceUtil.getNewestNewArticles(groupId, language, 2, numberArticlesInCat, numberArticlesNextInCat);//2=da xuat ban
	if(nextNewestNewArticles != null && nextNewestNewArticles.size()>0){
%>

<div>
	<%
		if (nextNewestNewArticles.size() > 0) {
			for (int j = 0; j < nextNewestNewArticles.size(); j++) {
				VcmsArticle articleNew = (VcmsArticle)nextNewestNewArticles.get(j);

				PortletURL articleNewURL;
				articleNewURL = new PortletURLImpl(request,portletSelectId, plId, false);
				articleNewURL.setParameter("struts_action", "/vcmsviewcontent/view");
				articleNewURL.setParameter("articleId", articleNew.getArticleId());
				///articleNewURL.setParameter("news-kind", "news-newest");
					//get and set categoryId
				try{
					List vcmsCARelationList =	VcmsCARelationServiceUtil.getRelationsByArticle(articleNew.getArticleId());
					if(vcmsCARelationList!=null && vcmsCARelationList.size()>0){
						VcmsCARelation vcmsCARelation = (VcmsCARelation)vcmsCARelationList.get(0);
						String cateId = vcmsCARelation.getCategoryId();
						articleNewURL.setParameter("categoryId", cateId);
					}
				} catch (Exception ex) {
				
				}
	%>
				<p class="icon_link"><a href="<%= articleNewURL %>" class="green"><%= articleNew.getTitle() %> </a><a style="font-size:10px;color:#9a331b">(<%=dateFormatDate.format(articleNew.getPublishedDate())%>)</a></p>
	<%
		}
	}
	%>
</div>
<%	
}
%>
</div>