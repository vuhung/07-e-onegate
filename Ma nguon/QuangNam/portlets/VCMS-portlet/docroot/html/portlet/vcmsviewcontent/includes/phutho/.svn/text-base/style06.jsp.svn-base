<%@page import="com.vportal.portlet.vcms.model.VcmsCARelation"%>
<%@page import="javax.portlet.PortletURL"%>
<%@page import="java.util.List"%>
<%@page import="com.vportal.portlet.vcms.service.VcmsCARelationServiceUtil"%>
<%@page import="com.vportal.portlet.vcms.model.VcmsArticle"%>
<%
	if (newestArticles != null && newestArticles.size() > 0) {
		VcmsArticle articleTop = (VcmsArticle) newestArticles.get(0);
		PortletURL articleTopURL = PortletURLFactoryUtil.create(
				request, portletSelectId, plId,
				PortletRequest.RENDER_PHASE);
		articleTopURL.setParameter("jspPage",
				"/html/portlet/vcmsviewcontent/view.jsp");
		articleTopURL.setParameter("articleId",
				articleTop.getArticleId());
		List listCategories = VcmsCARelationServiceUtil
				.getRelationsByArticle(articleTop.getArticleId());
		if (listCategories.size() > 0)
			articleTopURL.setParameter("categoryId",
					((VcmsCARelation) listCategories.get(0))
							.getCategoryId());
%>
<div class="portlet-border vcmsviewconent-portlet default">
	<div class="style06">
		<div class="topArticle">
			<c:if test="<%=articleTop.getHasImage()%>">
				<a href="<%=articleTopURL%>"><img align="left" class="image"
					width="100%" height="100%"
					src="<%=themeDisplay.getPathImage() + "/images?img_id="
							+ articleTop.getImage()%>" /></a>
			</c:if>
			<p style="z-index: 1000"><%=articleTop.getTitle()%></p>
		</div>

		<div class="nextArticle">
			<%
				for (int j = 1; j < numberArticlesDisplayImages; j++) {
						VcmsArticle articleTopNext = (VcmsArticle) newestArticles
								.get(j);
						PortletURL articleTopURLNext = PortletURLFactoryUtil
								.create(request, portletSelectId, plId,
										PortletRequest.RENDER_PHASE);
						articleTopURLNext.setParameter("jspPage",
								"/html/portlet/vcmsviewcontent/view.jsp");
						articleTopURLNext.setParameter("articleId",
								articleTopNext.getArticleId());
						List listCategoriesNext = VcmsCARelationServiceUtil
								.getRelationsByArticle(articleTopNext
										.getArticleId());
						if (listCategoriesNext.size() > 0)
							articleTopURLNext.setParameter("categoryId",
									((VcmsCARelation) listCategoriesNext.get(0))
											.getCategoryId());
			%>
			<div class="col<%=j%>" style="float: left;width: <%=100/(numberArticlesDisplayImages-1)%>%">
				<c:if test="<%=articleTopNext.getHasImage()%>">
					<a href="<%=articleTopURLNext%>"><img align="left" class="image"
						width="50%" height="100%"
						src="<%=themeDisplay.getPathImage()
								+ "/images?img_id=" + articleTopNext.getImage()%>" /></a>
				</c:if>
				<p class="text-link">
					<%=StringUtil.shorten(HtmlUtil.extractText(articleTopNext.getTitle()),100/(numberArticlesDisplayImages-1))%>
				</p>
			</div>
			<%
				}
			%>

		</div>
		<div class="relateArticle"></div>
	</div>
</div>
<%
	}
%>