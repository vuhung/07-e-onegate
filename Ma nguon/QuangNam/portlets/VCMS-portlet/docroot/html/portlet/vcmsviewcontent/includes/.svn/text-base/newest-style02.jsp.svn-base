  <div><img src="images/0.gif" width="1" height="5"></div>
    
<%	//Lay cac tin tuc moi nhat
	VcmsArticle lastArticle = null;	
	List topNewestNewArticles = (List)VcmsArticleServiceUtil.getNewestNewArticles(groupId, language, 2, 0, numberArticlesInCat);//2=da xuat ban

	if(topNewestNewArticles != null && topNewestNewArticles.size()>0){

		PortletURL catURL;
		catURL = new PortletURLImpl(request,portletSelectId, plId, false);
		catURL.setParameter("struts_action", "/vcmsviewcontent/view");
		catURL.setParameter("news-kind", "news-newest");
%>
		  
<div id="<portlet:namespace/>display_content_rss">
<%
		for (int j = 0; j < topNewestNewArticles.size(); j++) {
			VcmsArticle article = (VcmsArticle)topNewestNewArticles.get(j);

			PortletURL articleURL;
			articleURL = new PortletURLImpl(request,portletSelectId, plId, false);
			articleURL.setParameter("struts_action", "/vcmsviewcontent/view");
			articleURL.setParameter("articleId", article.getArticleId());
			articleURL.setParameter("news-kind", "news-newest");
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
			<table width="100%" class="chanel-news no-bot" border="0" cellspacing="0" cellpadding="0">
            <tr>
              <td>
					<a href="<%= articleURL %>" class="title01"><%= article.getTitle() %></a><span class="time">(<%=dateFormatDateTime.format(article.getPublishedDate())%>)</span>
    		  </td>
            </tr>
            <tr>
              <td>&nbsp;</td>
            </tr>
          </table>

<%
		}
	}
%>

