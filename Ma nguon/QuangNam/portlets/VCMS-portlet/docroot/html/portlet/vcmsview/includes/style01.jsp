		<%
		if(Validator.isNotNull(selectCategories)){
			for(int i=0; i<selectCategories.length; i++){
				VcmsCategory category = VcmsCategoryServiceUtil.getCategory(selectCategories[i]);
				if(Validator.isNotNull(category)){
					List articles = new ArrayList();
					articles = VcmsArticleServiceUtil.getArticleByC_P_L_S(selectCategories[i] , groupId , language , VcmsArticleServiceImpl.PUBLISHED);
					if(Validator.isNotNull(articles) && articles.size() > 0){
						%>
						<table width="100%" class="chanel-news" border="0" cellspacing="0" cellpadding="0">
							<tr>
								<th><div class="t2" style="background:url(<%= category.getHasImage() ? ("/image/images?img_id="+category.getImage()):"/html/portlet/vcmsview/images/g_pq.gif" %>) 0px 0px no-repeat;float:left;	width:auto;	background-color:#fff;	padding-left:22px;	padding-right:3px;	line-height:20px;">
									<a href="<portlet:renderURL><portlet:param name="struts_action" value="/vcmsview/view" /><portlet:param name="categoryId" value="<%= String.valueOf(category.getCategoryId()) %>" /></portlet:renderURL>"><%= category.getName() %></a>
								</div></th>
							</tr>
							<tr>
								<td>
						<%
						for(int j=0; j<articles.size(); j++){
							VcmsArticle article = (VcmsArticle) articles.get(j);
							if(j == 0){
							%>
									<p class="title01"><a href="<portlet:renderURL><portlet:param name="struts_action" value="/vcmsview/view" /><portlet:param name="categoryId" value="<%= String.valueOf(category.getCategoryId()) %>" /><portlet:param name="articleId" value="<%= String.valueOf(article.getArticleId()) %>" /></portlet:renderURL>"><%= article.getTitle() %></a></p>
									<% if(article.getHasImage()) {%>
										<div class="n-img"><img src="/image/images?img_id=<%= article.getImage() %>" width="115" height="99" align="absmiddle"></div>
									<% } %>
									<p><%= article.getLead() %> <span class="next u"><a href="<portlet:renderURL><portlet:param name="struts_action" value="/vcmsview/view" /><portlet:param name="categoryId" value="<%= String.valueOf(category.getCategoryId()) %>" /><portlet:param name="articleId" value="<%= String.valueOf(article.getArticleId()) %>" /></portlet:renderURL>">Xem ti&#7871;p</a> &raquo;</span></p>
								</td>
							</tr>
							<tr>
								<td><p class="blue indent u no-top-f">
							<%
							}else{ %>
								<a href="<portlet:renderURL><portlet:param name="struts_action" value="/vcmsview/view" /><portlet:param name="categoryId" value="<%= String.valueOf(category.getCategoryId()) %>" /><portlet:param name="articleId" value="<%= String.valueOf(article.getArticleId()) %>" /></portlet:renderURL>"><%= article.getTitle() %></a>
							<%
							}
						} %>
								</p></td>
							</tr>
						</table>
						<%
					}
				}
			}
		}
		%>
