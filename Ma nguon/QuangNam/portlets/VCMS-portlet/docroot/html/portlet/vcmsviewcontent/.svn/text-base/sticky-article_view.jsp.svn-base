<%@ include file="/html/portlet/vcmsviewcontent/javascript.jsp" %>

<%	VcmsCategory category = (VcmsCategory)request.getAttribute(ConstantsExt.CATEGORY);
	VcmsArticle article = (VcmsArticle)request.getAttribute(ConstantsExt.ARTICLE);
	
	List nextArticles = (List)request.getAttribute(ConstantsExt.LIST_NEXT_NEWEST_ARTICLE);
	List olderArticles = (List)request.getAttribute(ConstantsExt.LIST_NEXT_OLDER_ARTICLE);
	List threadsArticle = (List)request.getAttribute(ConstantsExt.LIST_NEXT_IN_FLOW_ARTICLE);
	List newestArticles = (List)request.getAttribute(ConstantsExt.LIST_NEXT_NEWEST_ARTICLE);
	
	PortletURL catURL;
	catURL = new PortletURLImpl(request,portletSelectId, plId, false);
	catURL.setParameter("jspPage","/html/portlet/vcmsviewcontent/view.jsp" );
	catURL.setParameter("categoryId", category.getCategoryId());
	catURL.setParameter("news-kind", "news-sticky");
	

	PortletURL articleURL;
	articleURL = new PortletURLImpl(request,portletSelectId, plId, false);
	articleURL.setParameter("jspPage","/html/portlet/vcmsviewcontent/view.jsp" );
	articleURL.setParameter("articleId", article.getArticleId());
	articleURL.setParameter("categoryId", category.getCategoryId());
	articleURL.setParameter("cat_parent", category.getCategoryId());
	articleURL.setParameter("news-kind", "news-sticky");
%>
		  
<div id="<portlet:namespace/>display_content_rss">	  	  
	  <div id="<portlet:namespace/>article_view_content">
		<table width="98%" class="chanel-news no-bot j-align" border="0" cellspacing="0" cellpadding="0">
	            <tr>
			              <td>
							  <p class="title01 f-s16 no-top">
									<%= article.getTitle() %>
							  </p>
							  <span class="time"><%=dateFormatDateTime.format(article.getPublishedDate())%></span>
							  <p style="font-weight:bold ; font-size:12px"><%= article.getLead() %></p>
							  <% if(article.getHasImage()) {%> 
							  	<div class="n-img"><img src="<%= themeDisplay.getPathImage() + "/images?img_id=" + article.getImage()  %>" width="150" height="100" align="absmiddle"></div>
						  	  <%}%>
						  	  <%= article.getContent() %>
							  <%@ include file="/html/portlet/vcmsviewcontent/send_article_email.jsp" %>
							  <br/>
									<!--Get Attachment of Article...--->
									<%if(article.getHasAttachment() == true){
										List attachments = null;
										attachments = AttachmentServiceUtil.getAttachments(Long.parseLong(article.getArticleId()), VcmsArticle.class);
									
									%>
					                    <table width="100%" border="0" align="center" cellpadding="4" cellspacing="0" bordercolor="#707070" class="ntable" style="border-collapse:collapse;">
						                      	<tr>
													<th width="75%" align="left" class="bold">Tài li&#7879;u &#273;ính kèm </th>
				                          		</tr>
															<%
															for (int i = 0; i < attachments.size(); i ++) {
																	Attachment attachment = (Attachment) attachments.get(i);
															%>	
																<tr>
																	<td align="left">
																		<strong><img align=\"left\" border=\"0\" src="<%=themeDisplay.getPathThemeImages()%>/document_library/<%=attachment.getExtension()%>.png"> <%= attachment.getTitle() %><%= attachment.getAttachment() %>	- [<a href="<%= themeDisplay.getPathMain() %>/vcms/download_attachment?attachmentId=<%= attachment.getAttachmentId() %>" target="_blank" class="link"><%= LanguageUtil.get(pageContext, "portlet.vcms.article.edit.download-attachment") %></a>] </strong></td>
																</tr>
															<%}%>			
										</table>
							    	<%}%>
				  		</td>
			    </tr>
			    <tr>
			      		<td>
			      			<table width="100%" border="0" align="center" cellpadding="4" cellspacing="0" >
			      				<tr>
			      					<td align="right">
			      						<c:if test="<%=isDisplaySendEmail%>"><img src="/html/portlet/vcmsviewcontent/images/mail_send.png"> <a href="javascript:showSendFriend(true);">G&#7917;i bài vi&#7871;t cho b&#7841;n bè</a></c:if>
			      						<c:if test="<%=isDisplayPrintArticle%>"><img src="/html/portlet/vcmsviewcontent/images/fileprint.png"> <a href="javascript:expandingWindow('/html/portlet/vcmsviewcontent/print_article.jsp?printArticleId=<%=article.getArticleId()%>');">In bài vi&#7871;t</a></c:if>
			      						<c:if test="<%=isDisplayDiscussion%>"><img src="/html/portlet/vcmsviewcontent/images/editcopy.png"> <a href="">Th&#7843;o lu&#7853;n bài vi&#7871;t</a></c:if>
			      					</td>
			      				</tr>
			      			</table>
			      		
			      		</td>
			    </tr>
</table>
	</div>
		  <p class="no-bot"><b class="news-other"><u>Các tin khác:</u></b></p>
		  <p class="org2 indent u">
				<%
					if (nextArticles.size() > 0) {
						for (int j = 0; j < nextArticles.size(); j++) {
							VcmsArticle articleNewNext = (VcmsArticle)nextArticles.get(j);

							PortletURL articleNewNextURL;
							articleNewNextURL = new PortletURLImpl(request,portletSelectId, plId, false);
							articleNewNextURL.setParameter("jspPage","/html/portlet/vcmsviewcontent/view.jsp" );
							articleNewNextURL.setParameter("articleId", articleNewNext.getArticleId());
							articleNewNextURL.setParameter("categoryId", category.getCategoryId());
							articleNewNextURL.setParameter("news-kind", "news-sticky");
							
				%>
									<a href="<%= articleNewNextURL %>"><%= articleNewNext.getTitle() %> </a>
				<%
					}
				}
				%>
						  					
				<%
					if (olderArticles.size() > 0) {
						for (int j = 0; j < olderArticles.size(); j++) {
							VcmsArticle articleNew = (VcmsArticle)olderArticles.get(j);

							PortletURL articleNewURL;
							articleNewURL = new PortletURLImpl(request,portletSelectId, plId, false);
							articleNewURL.setParameter("jspPage","/html/portlet/vcmsviewcontent/view.jsp" );
							articleNewURL.setParameter("articleId", articleNew.getArticleId());
							articleNewURL.setParameter("categoryId", category.getCategoryId());
							articleNewURL.setParameter("news-kind", "news-sticky");
							
				%>
									<a href="<%= articleNewURL %>"><%= articleNew.getTitle() %> </a>
				<%
					}
				}
				%>
</p>


</div>