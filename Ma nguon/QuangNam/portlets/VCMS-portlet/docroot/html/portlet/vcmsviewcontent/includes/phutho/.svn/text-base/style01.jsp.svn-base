<div class="border_portlet_news">
	<div class="link_hotnews"
		style="background: #f1f0f0; border: 1px solid #ccc;">
		<ul style="margin-left: 15px;">
			<%						
					for(int i=0;i<newestArticles.size();i++){
						VcmsArticle article = (VcmsArticle)newestArticles.get(i);                              		 		                                		 				
							PortletURL articleURL= PortletURLFactoryUtil.create(request,portletSelectId, plId, PortletRequest.RENDER_PHASE);
							articleURL.setParameter("jspPage", "/html/portlet/vcmsviewcontent/view.jsp");
							articleURL.setParameter("articleId", article.getArticleId());						
					%>
			<li class="li_link_portlet"><a href="<%=articleURL%>"><%=article.getTitle() %></a></li>
			<%
				}
			%>
		</ul>
	</div>
	
</div>