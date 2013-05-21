<%	
if(newestArticles != null && newestArticles.size() > 0) {
	VcmsArticle articleTop = (VcmsArticle)newestArticles.get(0);
	PortletURL articleTopURL= PortletURLFactoryUtil.create(request,portletSelectId, plId, PortletRequest.RENDER_PHASE);
	articleTopURL.setParameter("jspPage","/html/portlet/vcmsviewcontent/view.jsp" );
	articleTopURL.setParameter("articleId", articleTop.getArticleId());
%>

<div style="clear: both;height: 290px;">
<div id="main_news">
	<div id="slide">
		<c:if test="<%=articleTop.getHasImage()%>">	
          	<a href="<%=articleTopURL%>"><img align="left" width="100%" height="266px" src="<%= themeDisplay.getPathImage() + "/images?img_id=" + articleTop.getImage()  %>" /></a>
         	</c:if>
	</div>
	<div id="list-news" style="height: 266px;">
		<ul style="margin-left: 10px;text-align: left;">
			<%						
			for (int j = 0; j < newestArticles.size();j++) {
				VcmsArticle article = (VcmsArticle)newestArticles.get(j);
				PortletURL articleURL= PortletURLFactoryUtil.create(request,portletSelectId, plId, PortletRequest.RENDER_PHASE);
				articleURL.setParameter("jspPage","/html/portlet/vcmsviewcontent/view.jsp" );
				articleURL.setParameter("articleId", article.getArticleId());
			%>
	     		<li class="text-list-news"><a href="<%=articleURL.toString()%>"><%=article.getTitle()  %></a></li>    
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