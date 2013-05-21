<%
	
	List categoryArticleList = (List)request.getAttribute(ConstantsExt.LIST_CATEGORY_ARTICLE);
	
	for (int i = 0; i < categoryArticleList.size(); i++) {
		Object[] obj = (Object[])categoryArticleList.get(i);
		VcmsCategory category = (VcmsCategory)obj[0];
		List listIntroArticle = (List)obj[1];
		List listLinkArticle = (List)obj[2];
		PortletURL catURL;
		if (openNewTab > 0) {
			catURL = PortletURLFactoryUtil.create(request, portletName, plId, PortletRequest.RENDER_PHASE);
		} else {
			catURL = renderResponse.createRenderURL();
		}
		catURL.setParameter("jspPage", "/html/portlet/vcmsview/view.jsp");
		catURL.setParameter("categoryId", category.getCategoryId());

%>
		<hr />
		<div style="background: #ccc;"><a href="<%= catURL %>"><%= category.getName() %></a></div>
<%
		for (int j = 0; j < listIntroArticle.size(); j++) {
			VcmsArticle article = (VcmsArticle)listIntroArticle.get(j);
			
			PortletURL articleURL;
			if (openNewTab > 0) {
				articleURL = PortletURLFactoryUtil.create(request, portletName, plId, PortletRequest.RENDER_PHASE);
		} else {
				articleURL = renderResponse.createRenderURL();
			}
			articleURL.setParameter("jspPage", "/html/portlet/vcmsview/view.jsp");
			articleURL.setParameter("articleId", article.getArticleId());
			articleURL.setParameter("categoryId", category.getCategoryId());
%>
			<div><strong><a href="<%= articleURL %>"><%= article.getTitle() %></a></strong></div>
			<div><%= article.getLead() %></div>
<%
		}
		
		for (int j = 0; j < listLinkArticle.size(); j++) {
			VcmsArticle article = (VcmsArticle)listLinkArticle.get(j);

			PortletURL articleURL;
			if (openNewTab > 0) {
				articleURL = PortletURLFactoryUtil.create(request, portletName, plId, PortletRequest.RENDER_PHASE);
			} else {
				articleURL = renderResponse.createRenderURL();
			}
			articleURL.setParameter("jspPage", "/html/portlet/vcmsview/view.jsp");
			articleURL.setParameter("articleId", article.getArticleId());
			articleURL.setParameter("categoryId", category.getCategoryId());
%>
			<div style="border: 1px solid #ffaaee;"><a href="<%= articleURL %>"><%= article.getTitle() %></a></div>
<%
		}
	}
%>
