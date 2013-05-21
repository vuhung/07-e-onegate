		<%
		VcmsCategory category = VcmsCategoryServiceUtil.getCategory(categoryId);
		if(Validator.isNotNull(category)){
			%>
		  	<p class="bread-crum no-top"><a href="<portlet:renderURL><portlet:param name="struts_action" value="/vcmsview/view" /><portlet:param name="categoryId" value="<%= String.valueOf(category.getCategoryId()) %>" /></portlet:renderURL>"><%= category.getName() %></a></p>
			<%
		}
		
		VcmsArticle article = VcmsArticleServiceUtil.getArticle(articleId);
		if(Validator.isNotNull(article)){
			%>
			  <table width="98%" class="chanel-news no-bot j-align" border="0" cellspacing="0" cellpadding="0">
	            <tr>
	              <td>
					  <p class="title01 f-s16 no-top"><%= article.getTitle() %></p>
					  <span class="time"><%= dateFormatDateTime.format(article.getPublishedDate()) %></span>
						<% if(article.getHasImage()) {%>
							<div class="n-img"><img src="/image/images?img_id=<%= article.getImage() %>" width="115" height="99" align="absmiddle"></div>
						<% } %>
					  <b class="hot-line m5"><%= article.getLead() %></b>
		              <p><%= article.getContent() %></p>
				  </td>
	            </tr>
	            <tr>
	              <td>&nbsp;</td>
	            </tr>
	          </table>
			<%
		}
		List olderArticles = new ArrayList();
		olderArticles = VcmsArticleServiceUtil.getOlderArticles(groupId, language, null, categoryId, articleId, statusId, Integer.valueOf(numOfOtherItem));
		if(Validator.isNotNull(olderArticles) && olderArticles.size() > 0){ 
		%>
			  <p class="no-bot"><b class="news-other"><u>C�c tin kh�c:</u></b></p>
			  <p class="org2 indent u">
			<%
			for(int j=0; j<olderArticles.size(); j++){
				VcmsArticle olderArticle = (VcmsArticle) olderArticles.get(j);
			%>
				<a href="<portlet:renderURL><portlet:param name="struts_action" value="/vcmsview/view" /><portlet:param name="categoryId" value="<%= String.valueOf(categoryId) %>" /><portlet:param name="articleId" value="<%= String.valueOf(olderArticle.getArticleId()) %>" /></portlet:renderURL>"><%= olderArticle.getTitle() %></a>
			<%
			}
		}
		%>