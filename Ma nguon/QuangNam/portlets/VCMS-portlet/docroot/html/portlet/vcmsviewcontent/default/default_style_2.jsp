<%	
	VcmsCategory category = null;
List articlesByCat = (List)VcmsArticleServiceUtil.getTopNewArticles(groupId , language , null, catId, statusId , numberArticlesInCat);	
//List articlesByCat = (List)VcmsArticleServiceUtil.getTopNewArticles(language , null, catId, statusId , numberArticlesInCat);
	try{
		category = category = (VcmsCategory)VcmsCategoryServiceUtil.getCategory(catId);
	}catch(Exception e){
	}
	PortletURL catURL = PortletURLFactoryUtil.create(request,portletSelectId, plId, PortletRequest.RENDER_PHASE);
	catURL.setParameter("jspPage","/html/portlet/vcmsviewcontent/view.jsp" );
	catURL.setParameter("categoryId", category.getCategoryId());	
	
	VcmsArticle articleTop = (VcmsArticle)articlesByCat.get(0);
	PortletURL articleTopURL= PortletURLFactoryUtil.create(request,portletSelectId, plId, PortletRequest.RENDER_PHASE);
	articleTopURL.setParameter("jspPage","/html/portlet/vcmsviewcontent/view.jsp" );
	articleTopURL.setParameter("articleId", articleTop.getArticleId());
	articleTopURL.setParameter("categoryId", category.getCategoryId());
%>
<table width="100%">
	<tr><td height="3"></td></tr>
	<tr>
    	<td class="bg_02">
	        <div class="title1">
	        	<b><%= category.getName() %></b>
			</div>
		</td>
	</tr>
	<tr>
		<td class="text_04">
			<table width="100%" cellpadding="5">
				<tr>
					<td><br/>
						<table width="100%">
							<tr>
								<%
									if(articleTop.getHasImage()==true){
								%>
								<td valign="top" width="220">
									<a href="<%=articleTopURL.toString()%>"><img hspace="14" align="left" width="198" vspace="5" src="<%= themeDisplay.getPathImage() + "/images?img_id=" + articleTop.getImage() %>"/></a>
								</td>
								<%
									}
								%>
								<td valign="top" align="justify" style="padding-right: 10px; <%=articleTop.getHasImage()?"":"padding-left:10px;" %>">
									<%						
									for (int j = 0; j < articlesByCat.size();j++) {
										VcmsArticle article = (VcmsArticle)articlesByCat.get(j);
										PortletURL articleURL= PortletURLFactoryUtil.create(request,portletSelectId, plId, PortletRequest.RENDER_PHASE);
										articleURL.setParameter("jspPage","/html/portlet/vcmsviewcontent/view.jsp" );
										articleURL.setParameter("articleId", article.getArticleId());
										articleURL.setParameter("categoryId", category.getCategoryId());
									%>
							     		<div class="text_01"><a href="<%=articleURL.toString()%>"><%=article.getTitle()  %></a></div>    
									<%
										}
									%>
								</td>
							</tr>
						</table>				
					</td>
				</tr>
				<tr height="30">
					<td align="right" valign="middle">
						<c:if test="<%=Validator.isNotNull(articlesByCat) && articlesByCat.size()>0%>">	
                            <%	StringBuilder sb = new StringBuilder();			
							sb.append(themeDisplay.getPathMain());
							sb.append("/vcmsviewcontent/rss?");
							sb.append("categoryId=" + category.getCategoryId());
							sb.append("&p_l_id=" + Long.toString(plId));
							sb.append("&portletSelectId=" + portletSelectId);
							String rssURL = sb.toString();
						%>		
                        	<div class="detail">                        	                        	
                        		<a href="<%=rssURL%>"><img hspace="10" height="10" width="37" align="left" src="<%= themeDisplay.getPathThemeImage() %>/HN_image/rss.gif"/></a>
                        	
                        		<a href="<%=catURL.toString()%>"><img  width="57" height="15" src="<%= themeDisplay.getPathThemeImage() %>/HN_image/tinthem.gif"/></a> &nbsp; &nbsp; 
                        	</div>   
                        	
                        </c:if>	
					</td>
				</tr>
			</table>
		</td>
	</tr>
	<tr><td height="3"></td></tr>
</table>
