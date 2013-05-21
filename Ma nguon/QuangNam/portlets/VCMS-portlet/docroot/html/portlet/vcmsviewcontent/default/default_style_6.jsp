<%	
VcmsCategory category = null;
List articlesByCat = (List)VcmsArticleServiceUtil.getTopNewArticles(groupId , language , null, catId, statusId , numberArticlesInCat);	
try{
	category = category = (VcmsCategory)VcmsCategoryServiceUtil.getCategory(catId);
}catch(Exception e){
}
PortletURL catURL = PortletURLFactoryUtil.create(request,portletSelectId, plId, PortletRequest.RENDER_PHASE);
catURL.setParameter("jspPage","/html/portlet/vcmsviewcontent/view.jsp" );
catURL.setParameter("categoryId", category.getCategoryId());	

if(articlesByCat != null && articlesByCat.size() > 0) {
	VcmsArticle articleTop = (VcmsArticle)articlesByCat.get(0);
	PortletURL articleTopURL= PortletURLFactoryUtil.create(request,portletSelectId, plId, PortletRequest.RENDER_PHASE);
	articleTopURL.setParameter("jspPage","/html/portlet/vcmsviewcontent/view.jsp" );
	articleTopURL.setParameter("articleId", articleTop.getArticleId());
	articleTopURL.setParameter("categoryId", category.getCategoryId());
%>

<div class="portlet-border vcmsviewconent-portlet default">
	<div class="style6">
		<div class="top-article">
			<c:if test="<%=articleTop.getHasImage()%>">	
	          	<a href="<%=articleTopURL%>"><img class="imagetop" align="left" src="<%= themeDisplay.getPathImage() + "/images?img_id=" + articleTop.getImage()  %>" /></a>
	         </c:if>
	         <div class="summary">
	         	<a href="<%=articleTopURL%>">
	 				<%=StringUtil.shorten(HtmlUtil.extractText(articleTop.getContent()),100)%>
	         	</a>
	         	<span class="date">(<%=dateFormatDateTime.format(articleTop.getPublishedDate())%>)</span>
	         	<p class="content">
	         		<%=StringUtil.shorten(HtmlUtil.extractText(articleTop.getContent()),100)%>
	         	</p>
	         </div>
         </div>
		<div class="relate-article">
			<ul>
				<%						
				for (int j = 0; j < articlesByCat.size();j++) {
					VcmsArticle article = (VcmsArticle)articlesByCat.get(j);
					PortletURL articleURL= PortletURLFactoryUtil.create(request,portletSelectId, plId, PortletRequest.RENDER_PHASE);
					articleURL.setParameter("jspPage","/html/portlet/vcmsviewcontent/view.jsp" );
					articleURL.setParameter("articleId", article.getArticleId());
					articleURL.setParameter("categoryId", category.getCategoryId());
				%>
		     		<li class="list-relate-article"><a href="<%=articleURL.toString()%>"><%=StringUtil.shorten(HtmlUtil.extractText(article.getTitle()),50)%></a>(<%=dateFormatDateTime.format(article.getPublishedDate())%>)</li>    
				<%
					}
				%>
			</ul>
		</div>
	</div>
</div>

<%
}
%>