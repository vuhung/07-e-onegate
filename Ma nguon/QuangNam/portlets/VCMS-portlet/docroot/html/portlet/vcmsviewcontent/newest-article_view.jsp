<%@page import="com.liferay.portlet.PortletURLFactoryUtil"%>
<%@ include file="/html/portlet/vcmsviewcontent/javascript.jsp" %>
<link href="/html/portlet/vcmsviewcontent/includes/css/common.css" rel="stylesheet" type="text/css" />	
<%	VcmsCategory category = (VcmsCategory)request.getAttribute(ConstantsExt.CATEGORY);
	VcmsArticle article = (VcmsArticle)request.getAttribute(ConstantsExt.ARTICLE);
	
	List nextArticles = (List)request.getAttribute(ConstantsExt.LIST_NEXT_NEWEST_ARTICLE);
	List olderArticles = (List)request.getAttribute(ConstantsExt.LIST_NEXT_OLDER_ARTICLE);
	List threadsArticle = (List)request.getAttribute(ConstantsExt.LIST_NEXT_IN_FLOW_ARTICLE);
	List newestArticles = (List)request.getAttribute(ConstantsExt.LIST_NEXT_NEWEST_ARTICLE);
	
	PortletURL catURL;
	catURL = PortletURLFactoryUtil.create(request, portletSelectId, plid,PortletRequest.RENDER_PHASE);
	catURL.setParameter("jspPage","/html/portlet/vcmsviewcontent/view.jsp" );
	catURL.setParameter("categoryId", category.getCategoryId());
	catURL.setParameter("news-kind", "news-newest");

	PortletURL articleURL;
	articleURL = PortletURLFactoryUtil.create(request, portletSelectId, plid,PortletRequest.RENDER_PHASE);
	articleURL.setParameter("jspPage","/html/portlet/vcmsviewcontent/view.jsp" );
	articleURL.setParameter("articleId", article.getArticleId());
	articleURL.setParameter("categoryId", category.getCategoryId());
	articleURL.setParameter("cat_parent", category.getCategoryId());
	articleURL.setParameter("news-kind", "news-newest");
%>


    <p class="bg_tit_c"><a class="icon_tit_c bold"><%= LanguageUtil.get(pageContext, "portlet.vcmsviewcontent.newstest-new") %></a><a class="date"><%=dateFormatDateTime.format(new Date())%></a></p>

	<p class="tit_news"><a class="icon_news_fo"><%=(category != null)? category.getName() : "" %></a></p>
    <div class="box_new_hot_c">
    	<a href="#demo"><img src="<%= themeDisplay.getPathImage() + "/images?img_id=" + article.getImage()  %>"></a>
        <p><a href="#demo" class="green bold" style="font-size:13px"><%= article.getTitle() %></a> <a style="font-size:10px;color:#9a331b">(<%=dateFormatDateTime.format(article.getPublishedDate())%>)</a></p>
        <p><%= article.getLead() %></p>
    	<p class="clear"></p>
        <p><%= article.getContent() %></p>
    	<%@ include file="/html/portlet/vcmsviewcontent/send_article_email.jsp" %>
							  <br/>
									<!--Get Attachment of Article...--->
									<%if(article.getHasAttachment() == true){
										List attachments = null;
										attachments = AttachmentServiceUtil.getAttachments(Long.parseLong(article.getArticleId()), VcmsArticle.class);
									
									%>
					                    <table width="100%" border="0" align="center" cellpadding="4" cellspacing="0" bordercolor="#707070" class="ntable" style="border-collapse:collapse;">
						                      	<tr>
													<th width="75%" align="left" class="bold"><%= LanguageUtil.get(pageContext, "portlet.vcmsviewcontent.doc-attachments") %> </th>
				                          		</tr>
															<%
															for (int i = 0; i < attachments.size(); i ++) {
																	Attachment attachment = (Attachment) attachments.get(i);
															%>	
																<tr>
																	<td align="left">
																		<img align=\"left\" border=\"0\" src="<%=themeDisplay.getPathThemeImages()%>/document_library/<%=attachment.getExtension()%>.png" height="10" width="10"> <%= attachment.getFolderId() %><%= attachment.getFileName() %>	- [<a href="<%= themeDisplay.getPathMain() %>/vcms/download_attachment?attachmentId=<%= attachment.getAttachmentId() %>" target="_blank" ><%= LanguageUtil.get(pageContext, "portlet.vcms.article.edit.download-attachment") %></a>] </td>
																</tr>

															<%}%>			
										</table>
							    	<%}%>
							    	<table width="100%" border="0" align="center" cellpadding="4" cellspacing="0" >
					      				<tr>
					      					<td align="right">
					      						<c:if test="<%=isDisplaySendEmail%>"><img src="/html/portlet/vcmsviewcontent/images/mail_send.png"> <a href="javascript:showSendFriend(true);"><%= LanguageUtil.get(pageContext, "portlet.vcmsviewcontent.send-to-my-friends") %></a></c:if>
					      						<c:if test="<%=isDisplayPrintArticle%>"><img src="/html/portlet/vcmsviewcontent/images/fileprint.png"> <a href="javascript:expandingWindow('/html/portlet/vcmsviewcontent/print_article.jsp?printArticleId=<%=article.getArticleId()%>');"><%= LanguageUtil.get(pageContext, "portlet.vcmsviewcontent.print") %></a></c:if>
					      						<c:if test="<%=isDisplayDiscussion%>"><img src="/html/portlet/vcmsviewcontent/images/editcopy.png"> <a href=""><%= LanguageUtil.get(pageContext, "portlet.vcmsviewcontent.discussion") %></a></c:if>
					      					</td>
					      				</tr>
					      			</table>
		

    </div>
	<p class="tit_news"><a class="icon_news_fo"><%= LanguageUtil.get(pageContext, "portlet.vcmsviewcontent.other-news") %></a></p>
    <div style="padding:10px;" class="box_news_old">
				<%
					if (nextArticles.size() > 0) {
						for (int j = 0; j < nextArticles.size(); j++) {
							VcmsArticle articleNewNext = (VcmsArticle)nextArticles.get(j);

							PortletURL articleNewNextURL;
							articleNewNextURL = PortletURLFactoryUtil.create(request, portletSelectId, plid,PortletRequest.RENDER_PHASE);
							articleNewNextURL.setParameter("jspPage","/html/portlet/vcmsviewcontent/view.jsp" );
							articleNewNextURL.setParameter("articleId", articleNewNext.getArticleId());
							articleNewNextURL.setParameter("categoryId", category.getCategoryId());
							articleNewNextURL.setParameter("news-kind", "news-newest");
							
				%>
									<a href="<%= articleNewNextURL %>">&raquo; &nbsp;<%= articleNewNext.getTitle() %> </a><a style="font-size:10px;color:#9a331b">(<%=dateFormatDateTime.format(article.getPublishedDate())%>)</a>
				<%
					}
				}
				%>
						  					
				<%
					if (olderArticles.size() > 0) {
						for (int j = 0; j < olderArticles.size(); j++) {
							VcmsArticle articleNew = (VcmsArticle)olderArticles.get(j);

							PortletURL articleNewURL;
							articleNewURL = PortletURLFactoryUtil.create(request, portletSelectId, plid,PortletRequest.RENDER_PHASE);
							articleNewURL.setParameter("jspPage","/html/portlet/vcmsviewcontent/view.jsp" );
							articleNewURL.setParameter("articleId", articleNew.getArticleId());
							articleNewURL.setParameter("categoryId", category.getCategoryId());
							articleNewURL.setParameter("news-kind", "news-newest");
							
				%>
									<a href="<%= articleNewURL %>"><%= articleNew.getTitle() %> </a><a style="font-size:10px;color:#9a331b">(<%=dateFormatDateTime.format(article.getPublishedDate())%>)</a>
				<%
					}
				}
				%>
    </div>

