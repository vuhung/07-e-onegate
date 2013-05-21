<%
if(newestArticles != null && newestArticles.size() > 0) {
	VcmsArticle articleTop = (VcmsArticle)newestArticles.get(0);
	PortletURL articleTopURL= PortletURLFactoryUtil.create(request,portletSelectId, plId, PortletRequest.RENDER_PHASE);
	articleTopURL.setParameter("jspPage","/html/portlet/vcmsviewcontent/view.jsp" );
	articleTopURL.setParameter("articleId", articleTop.getArticleId());
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
				for (int j = 0; j < newestArticles.size();j++) {
					VcmsArticle article = (VcmsArticle)newestArticles.get(j);
					PortletURL articleURL= PortletURLFactoryUtil.create(request,portletSelectId, plId, PortletRequest.RENDER_PHASE);
					articleURL.setParameter("jspPage","/html/portlet/vcmsviewcontent/view.jsp" );
					articleURL.setParameter("articleId", article.getArticleId());
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