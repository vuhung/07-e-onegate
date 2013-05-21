<%@page import="com.vportal.portlet.vcms.model.VcmsCARelation"%>
<%@page import="javax.portlet.PortletURL"%>
<%@page import="java.util.List"%>
<%@page import="com.vportal.portlet.vcms.service.VcmsCARelationServiceUtil"%>
<%@page import="com.vportal.portlet.vcms.model.VcmsArticle"%>
<div class="portlet-border vcmsviewconent-portlet default">
	<div class="style05">
		<%
			for (int j = 0; j < newestArticles.size(); j++) {
				VcmsArticle article = (VcmsArticle) newestArticles.get(j);
				PortletURL articleURL = PortletURLFactoryUtil.create(request,
						portletSelectId, plId, PortletRequest.RENDER_PHASE);
				articleURL.setParameter("jspPage",
						"/html/portlet/vcmsviewcontent/view.jsp");
				articleURL.setParameter("articleId", article.getArticleId());
				List listCategories = VcmsCARelationServiceUtil.getRelationsByArticle(article.getArticleId());
				if(listCategories.size() >0)
					articleURL.setParameter("categoryId", ((VcmsCARelation)listCategories.get(0)).getCategoryId());
				if ((j + 1) % 2 == 1) {
		%>
		<div class="col1">
			<div class="border-image">
				<c:if test="<%=article.getHasImage()%>">
					<a href="<%=articleURL%>"><img align="left" class="image"
						src="<%=themeDisplay.getPathImage()
								+ "/images?img_id=" + article.getImage()%>" /></a>
				</c:if>
			</div>
			<p class="text-link">
				<a href="<%=articleURL%>"> <%=StringUtil.shorten(
							HtmlUtil.extractText(article.getContent()), 50)%>
				</a>
			</p>
		</div>
		<%
			} else {
		%>
		<div class="col2">
			<div class="border-image">
				<c:if test="<%=article.getHasImage()%>">
					<a href="<%=articleURL%>"><img align="left" class="image"
						src="<%=themeDisplay.getPathImage()
								+ "/images?img_id=" + article.getImage()%>" /></a>
				</c:if>
			</div>
			<p class="text-link">
				<a href="<%=articleURL%>"> <%=StringUtil.shorten(
							HtmlUtil.extractText(article.getContent()), 50)%>
				</a>
			</p>
		</div>
		<%
			}
		%>

		<%
			}
		%>
	</div>
</div>