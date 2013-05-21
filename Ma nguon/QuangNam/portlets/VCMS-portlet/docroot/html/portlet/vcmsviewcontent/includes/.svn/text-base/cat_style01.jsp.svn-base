<table width="100%" border="0" cellspacing="0" cellpadding="0">
  <tr>
    <td><img src="/html/portlet/vcmsviewcontent/images/0.gif" width="1" height="1" /></td>
  </tr>
<tr>
    <td class="boder-01">
<%
	VcmsArticle lastArticle = null;	
	List articlesByCat = (List)VcmsArticleServiceUtil.getTopNewArticles(groupId , language , null,listCategory[0], statusId , numberArticlesInCat);
	VcmsCategory category = null;
	try{
	  category = (VcmsCategory)VcmsCategoryServiceUtil.getCategory(listCategory[0]);
	}catch(Exception e){
	}
		PortletURL catURL = new PortletURLImpl(request,portletSelectId, plId, PortletRequest.RENDER_PHASE);
		catURL.setParameter("jspPage","/html/portlet/vcmsviewcontent/view.jsp" );
		catURL.setParameter("categoryId", category.getCategoryId());
%>
         <table width="100%" border="0" cellspacing="0" cellpadding="0">
              <tr>
                <td class="title_center">&nbsp;<a href="<%= catURL %>"><%= category.getName() %></a></td>
              </tr>
		  
<%
		for (int j = 0; j < articlesByCat.size(); j++) {
			VcmsArticle article = (VcmsArticle)articlesByCat.get(j);
			
			PortletURL articleURL= new PortletURLImpl(request,portletSelectId, plId, PortletRequest.RENDER_PHASE);
			articleURL.setParameter("jspPage","/html/portlet/vcmsviewcontent/view.jsp" );
			articleURL.setParameter("articleId", article.getArticleId());
			articleURL.setParameter("categoryId", category.getCategoryId());
%>

	<tr>
		<td>
			<table width="95%" border="0" align="center" cellpadding="0" cellspacing="0">
			<tr>
				<td height="10"><img src="/html/portlet/vcmsviewcontent/images/0.gif" width="1" height="1" /></td>
			</tr>
			<tr>
				<td>
					<div align="justify" style="margin-left:5px;">
				        <table width="100" border="0" align="left" cellpadding="7" cellspacing="0">
				          <tr>
				            <td><div class="n-img"><a href="<%= articleURL %>"><img src="<%= themeDisplay.getPathImage() + "/images?img_id=" + article.getImage()  %>" width="140" align="absmiddle"></a></div></td>
				          </tr>
				        </table>
				        <div>
				            <span class="text_none2">» <a href="<%= articleURL %>"><%= article.getTitle() %></a></span>
							<span class="text_none"><%=article.getLead()%></span><br /><br />
				        </div>
				    	<div align="right"><span class="text_none">................................................................................</span><span class="text_detail"> <a href="<%= articleURL %>">Xem chi ti&#7871;t »</a></span></div>
					</div>
				</td>
			</tr>
		    </table>
		</td>
	</tr>
	<tr>
		<td>&nbsp;</td>
	</tr>
<%
		}
		
	StringBuilder sb = new StringBuilder();

	sb.append(themeDisplay.getPathMain());
	sb.append("/vcmsviewcontent/rss?");
	sb.append("categoryId=" + category.getCategoryId());
	sb.append("&p_l_id=" + Long.toString(plId));
	sb.append("&portletSelectId=" + portletSelectId);
	String rssURL = sb.toString();
%>
	<tr><td><a href="<%=rssURL.toString()%>"><img src="<%=themeDisplay.getPathThemeImage()%>/HN_image/rss.gif"></a></td></tr>
</table>


<% 
	if(articlesByCat.size() == numberArticlesInCat){
		lastArticle = (VcmsArticle)articlesByCat.get(articlesByCat.size()-1);
		List listNextArticle = VcmsArticleServiceUtil.getOlderArticles(
			groupId, language, null, String.valueOf(displayDefaultCatId), lastArticle.getArticleId(),
			statusId, numberArticlesNextInCat);
%>

<table width="95%" border="0" align="center" cellpadding="0" cellspacing="0">
<tr>
	<td height="10"><img src="images/0.gif" width="1" height="1" /></td>
</tr>
	
<tr>
	<td>
		<p class="text_none"><strong>Tin t&#7913;c khác</strong></p>
		<p class="org2 indent u">
		<%
			if (listNextArticle.size() > 0) {
			for (int j = 0; j < listNextArticle.size(); j++) {
				VcmsArticle articleNew = (VcmsArticle)listNextArticle.get(j);

				PortletURL articleNewURL;
				articleNewURL = new PortletURLImpl(request,portletSelectId, plId, PortletRequest.RENDER_PHASE);
				articleNewURL.setParameter("jspPage","/html/portlet/vcmsviewcontent/view.jsp" );
				articleNewURL.setParameter("articleId", articleNew.getArticleId());
				articleNewURL.setParameter("categoryId", category.getCategoryId());
			%>
				<span><a href="<%= articleNewURL %>">» <%= articleNew.getTitle() %> </a></span> <span class="text_none">(<%=dateFormatDateTime.format(articleNew.getPublishedDate())%>)</span><br />
			<%}}%>
		</p>
	</td>
</tr>
</table>
<%	
}
%>
</td>
</tr>
</table>