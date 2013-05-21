<div style="height:350px;">
	<div class="border_portlet_news">
		<div class="l-menu"></div>
		<div class="bg_title_porlet">
			<div class="icon_porlet">
				<div class="title_porlet">
					<ul class="menu" style="list-style-type: none;">
	
	                        
	                        <%
						String catDefault="";
						PortletURL catURL = PortletURLFactoryUtil.create(request,portletSelectId, plId, PortletRequest.RENDER_PHASE);
						catURL.setParameter("jspPage","/html/portlet/vcmsviewcontent/view.jsp");
						for(int i=0;i<listCategory.length;i++){
						  VcmsCategory category = (VcmsCategory)VcmsCategoryServiceUtil.getCategory(listCategory[i]);
						  catURL.setParameter("categoryId", category.getCategoryId());				
							 if(i==0){
							 catDefault = category.getCategoryId();
						%>	
							<li><a class="title_porlet" href="<%=catURL.toString()%>"><%= category.getName() %></a></li>				
						<%
							}else{
						%>
							<li><a class="title_porlet" href="<%=catURL.toString()%>"><%= category.getName() %></a></li>				
						<%
							}
						}	      
					   %>
					   </ul>
				</div>
			</div>
		</div>
		<div class="r-menu"></div>
		 <%
			  int sumAticles = numberArticlesNextInCat+1;
			  List articlesByCat = (List)VcmsArticleServiceUtil.getTopNewArticles(groupId , language , null,catDefault, statusId , sumAticles);
			  int numberAricles =0;
			  if(articlesByCat.size()<numberArticlesInCat){
			    numberAricles = articlesByCat.size();
			  }else{
			    numberAricles =numberArticlesInCat ;
			  }
			   %>
		<div class="default_category_porlet">
			
				<div class="left_default_category_porlet">
					<%
						if(numberAricles > 0){
							VcmsArticle articleTop = (VcmsArticle)articlesByCat.get(0);
							PortletURL articleURLTop= PortletURLFactoryUtil.create(request,portletSelectId, plId, PortletRequest.RENDER_PHASE);
							articleURLTop.setParameter("jspPage", "/html/portlet/vcmsviewcontent/view.jsp");
							articleURLTop.setParameter("articleId", articleTop.getArticleId());
							articleURLTop.setParameter("categoryId", catDefault);
						%>
					<div class="news_category">
							<%
								if(articleTop.getHasImage()){
							%>
							<a href="<%=articleURLTop %>"><img height="130px" style="padding-right: 10px" src="<%= themeDisplay.getPathImage() + "/images?img_id=" + articleTop.getImage()  %>" width="205px" align="left" /></a>
							<%
								}
							%>
							<p>
								<a href="<%=articleURLTop %>"><%=articleTop.getTitle() %></a>
							</p>
							<p>
								<%=articleTop.getLead() %>
							</p>
					</div>
					
					<div class="relate_news_category">
						
							<div  >
								<ul>
									<%
									if(numberAricles-1 >0){
										
										for(int i=1;i<numberAricles;i++){
											VcmsArticle articleOther = (VcmsArticle)articlesByCat.get(i);
											PortletURL articleOtherUrl= PortletURLFactoryUtil.create(request,portletSelectId, plId, PortletRequest.RENDER_PHASE);
											articleOtherUrl.setParameter("jspPage", "/html/portlet/vcmsviewcontent/view.jsp");
											articleOtherUrl.setParameter("articleId", articleTop.getArticleId());
											articleOtherUrl.setParameter("categoryId", catDefault);
											
								%>
										<li class="text-list-news" style="list-style-type: none;"><a href="<%=articleOtherUrl.toString()%>"><%=articleOther.getTitle()  %></a></li> 
								<%
										}
									}
								%>
							</ul>
							</div>
					</div>
					<%
						}
					%>
				</div>
				<div class="right_default_category_porlet">
					<ul style="list-style-type: none;padding-left: 10px;">
						<%
							for(int i=1;i<listCategory.length;i++){
							VcmsCategory category = (VcmsCategory)VcmsCategoryServiceUtil.getCategory(listCategory[i]);
							List listArticlesByOtherCat = (List)VcmsArticleServiceUtil.getTopNewArticles(groupId , language , null,category.getCategoryId(), statusId , 1);
							
							if(listArticlesByOtherCat.size()>0){
								VcmsArticle articlesByOtherCat = (VcmsArticle)listArticlesByOtherCat.get(0);
								PortletURL articlesByOtherCatUrl= PortletURLFactoryUtil.create(request,portletSelectId, plId, PortletRequest.RENDER_PHASE);
								articlesByOtherCatUrl.setParameter("jspPage", "/html/portlet/vcmsviewcontent/view.jsp");
								articlesByOtherCatUrl.setParameter("articleId", articlesByOtherCat.getArticleId());
								articlesByOtherCatUrl.setParameter("categoryId", category.getCategoryId());
						%>		
								<li>
									<%
										if(articlesByOtherCat.getHasImage()){
									%>
										<a href="<%=articlesByOtherCatUrl %>"><img height="60px" src="<%= themeDisplay.getPathImage() + "/images?img_id=" + articlesByOtherCat.getImage()  %>" width="60px" align="left" /></a>
										<a href="<%=articlesByOtherCatUrl %>"><%=articlesByOtherCat.getTitle()  %></a>
									<%} %>
								</li>
							
						<%
									
								} 
							}
						%>
					</ul>
				</div>
				
		</div>
	</div>
</div>