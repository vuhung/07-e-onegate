<%
    String parentId = (String)session.getAttribute("CAT_PARENT_ID");
    int numberPage = ParamUtil.getInteger(request, "pagenum",1);
	int total = VcmsArticleServiceUtil.countAllCategoryArticles(groupId, language,categoryId,statusId);
	int pages = (total % numberOfNews == 0) ? total / numberOfNews : total / numberOfNews + 1;
	int begin = numberOfNews * (numberPage - 1);
	int end = (total>numberOfNews * numberPage) ? numberOfNews * numberPage : total;
	int beginNextPage = end;
	int endNextPage = ((end+numberOfNews) >=total)?total:end+numberOfNews;
	List listIntroArticle = VcmsArticleServiceUtil.getAllCategoryArticles(groupId, language,categoryId,statusId,begin,end);
	    VcmsCategory category = VcmsCategoryServiceUtil.getCategory(categoryId);
	    PortletURL catURL = new PortletURLImpl(request,portletSelectId, plId, PortletRequest.RENDER_PHASE);
		catURL.setParameter("struts_action", "/vcmsviewcontent/view");
		catURL.setParameter("categoryId", category.getCategoryId());
		catURL.setParameter("cat_parent", parentId);
		catURL.setParameter("cat_style", categoryStyle);
%>

<table width="100%" border="0" cellspacing="0" cellpadding="0">
<tr>
    <td>
	<div class="box_left_portlet bullet_white_green title_blue">
          	<div class="title">
			<div class="title_wrap">
			<div><%= category.getName() %></div>
			</div> 
			</div>
			<div class="border_blue">
			   <div class="defaultcontent">
			     <%
				 if(listIntroArticle.size() == 0){
				 %>
			    	<br/>
			    	<p align="center"><img src="<%= themeDisplay.getPathThemeImage() %>/DB_image/under_construction.jpg"></p>			    	
			    <%
				}
			    %>
				<table width="100%" border="0" cellspacing="0" cellpadding="0">
				<tr>
				 <td height="10">
				 </td>
				</tr> 

		<%
				for (int j = 0; j < listIntroArticle.size(); j++) {
					VcmsArticle article = (VcmsArticle)listIntroArticle.get(j);
					
					PortletURL articleURL= new PortletURLImpl(request,portletSelectId, plId, PortletRequest.RENDER_PHASE);
					articleURL.setParameter("struts_action", "/vcmsviewcontent/view");
					articleURL.setParameter("articleId", article.getArticleId());
					articleURL.setParameter("categoryId", category.getCategoryId());
					articleURL.setParameter("cat_parent", parentId);
					articleURL.setParameter("cat_style", categoryStyle);
		%>
			<tr>
				<td>
					<table width="95%" border="0" align="center" cellpadding="0" cellspacing="0">
					  <tr>
						  <td colspan="2">
						    <div class="title_new3"><a href="<%= articleURL %>">» <%= article.getTitle() %></a></div>
						  </td>
					  </tr>
					 
					  <tr>
					  <c:if test="<%=article.getHasImage()%>">
						<td valign="top" width="100">
							<table width="100" border="0" align="left" cellpadding="7" cellspacing="0">
							  <tr>
								<td>
								  <div width="100">
								     <a href="<%= articleURL %>">
								       <img src="<%= themeDisplay.getPathImage() + "/images?img_id=" + article.getImage()  %>" width="150" align="absmiddle" style="margin: 2px 5px 5px;">
								     </a>
								   </div>
								  </td>
							  </tr>
							</table>
						</td>
					</c:if>	
						<td valign="top" >
						  <div style="font-weight:normal;font-size: 11px;color: black">
						     <%=article.getLead()%>
						   </div>			  
						</td>
					  </tr>
					  <tr>
					   <td colspan="2">
					     <div align="right"><span class="text_none">
						 </span><span class="text_detail" > <a href="<%= articleURL %>">Xem chi ti&#7871;t »&nbsp;&nbsp;</a></span></div>
					   </td>
					   </tr>
					</table>
				</td>
          </tr>
<%
		}
%>
          <!-- Phan trang -->		
	<c:if test='<%= pages > 1 %>'>			
	<tr>
		<td height="40">
		<p>
			<strong>&nbsp;&nbsp;&nbsp;Trang&nbsp;&nbsp;</strong>
			<% 	
				if(numberPage >1){
					int intPrev = numberPage-1;%>
					<span><a class="style1" href="#" onclick="self.location = '<portlet:renderURL windowState="<%=WindowState.NORMAL.toString() %>"> 
						<portlet:param name="struts_action" value="/vcmsviewcontent/view" />
						<portlet:param name="pagenum" value="<%= String.valueOf(intPrev) %>" />	
						<portlet:param name="categoryId" value="<%= categoryId %>" />	
						<portlet:param name="cat_parent" value="<%= parentId %>" />	
						<portlet:param name="cat_style" value="<%= categoryStyle %>" />	
						</portlet:renderURL>';" >&lsaquo;&lsaquo; Tr&#432;&#7899;c</a></span>

			<%
				}
			%>				
			
			<% 
				for(int i = 1;i <= pages;i++){ 	
					if( i == numberPage ){
			%>
					<strong><a class="menu_left" href="#" onclick="self.location = '<portlet:renderURL windowState="<%=WindowState.NORMAL.toString() %>"> 
						<portlet:param name="struts_action" value="/vcmsviewcontent/view" />
						<portlet:param name="pagenum" value="<%= String.valueOf(i) %>" />
						<portlet:param name="categoryId" value="<%= categoryId %>" />	
						<portlet:param name="cat_parent" value="<%= parentId %>" />	
						<portlet:param name="cat_style" value="<%= categoryStyle %>" />	
						</portlet:renderURL>';" > <%=i%></a></strong>
			<%
				}else{
					
			%>	
					<strong><a class="text_download" href="#" onclick="self.location = '<portlet:renderURL windowState="<%=WindowState.NORMAL.toString() %>"> 
						<portlet:param name="struts_action" value="/vcmsviewcontent/view" />
						<portlet:param name="pagenum" value="<%= String.valueOf(i) %>" />
					    <portlet:param name="categoryId" value="<%= categoryId %>" />	
						<portlet:param name="cat_parent" value="<%= parentId %>" />	
						<portlet:param name="cat_style" value="<%= categoryStyle %>" />	
						</portlet:renderURL>';" > <%=i%></a></strong>
			<%
					}
			 	} 
		 	%>
		 	
				
			<% 	
				if(numberPage < pages){
					int intNext = numberPage + 1;
			%>
					<a class="text_download" href="#" onclick="self.location = '<portlet:renderURL windowState="<%=WindowState.NORMAL.toString() %>"> 
						<portlet:param name="struts_action" value="/vcmsviewcontent/view" />
						<portlet:param name="pagenum" value="<%= String.valueOf(intNext) %>" />	
						<portlet:param name="categoryId" value="<%= categoryId %>" />	
						<portlet:param name="cat_parent" value="<%= parentId %>" />		
						<portlet:param name="cat_style" value="<%= categoryStyle %>" />					
						</portlet:renderURL>';" >Ti&#7871;p &rsaquo;&rsaquo;</a></td>
			<%
				}
			%>		
			</p>
		</td>
	</tr>
	</c:if>		
</table>
<% 
	List listNextArticle = VcmsArticleServiceUtil.getAllCategoryArticles(groupId, language,categoryId,statusId,beginNextPage,endNextPage);
if(listNextArticle.size()>0){
%>
<table width="95%" border="0" align="center" cellpadding="0" cellspacing="0">
	<tr>
	  <td height="10">
	  </td>
	</tr>
	<tr>
	  <td>
			<div style=" height:22px; background-color:#e9f1f8; float:left;width:98%; padding-left:10px; padding-top:6px; margin-top:15px"><strong>C&#225;c th&#244;ng tin kh&#225;c</strong></div>
			<div style=" float:left; width:98%; padding-left:10px;"> 
							<%
								for (int j = 0; j < listNextArticle.size(); j++) {
										VcmsArticle articleNew = (VcmsArticle)listNextArticle.get(j);

										PortletURL articleNewURL;
										articleNewURL = new PortletURLImpl(request,portletSelectId, plId, PortletRequest.RENDER_PHASE);
										articleNewURL.setParameter("struts_action", "/vcmsviewcontent/view");
										articleNewURL.setParameter("articleId", articleNew.getArticleId());
										articleNewURL.setParameter("categoryId", category.getCategoryId());
							%>
										<div align="left" class="li-text_boxleft_dn">
										  <a href="<%= articleNewURL %>"><%= articleNew.getTitle() %> &nbsp;(<%=dateFormatDateTime.format(articleNew.getPublishedDate())%>)</a>
										  </div>
							<%
								}
							%>
			</div>
			</td>
	</tr>
</table>
<%
}
%>
			</div>
		  </div>
	  </div>
	  
	