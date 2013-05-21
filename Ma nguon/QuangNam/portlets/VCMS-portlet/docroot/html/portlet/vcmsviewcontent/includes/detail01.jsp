<%
	VcmsCategory category = (VcmsCategory)request.getAttribute(ConstantsExt.CATEGORY);
	VcmsArticle article = (VcmsArticle)request.getAttribute(ConstantsExt.ARTICLE);
	
	List olderArticles = (List)request.getAttribute(ConstantsExt.LIST_NEXT_OLDER_ARTICLE);
	List newArticles = (List)request.getAttribute(ConstantsExt.LIST_NEXT_NEWEST_ARTICLE);
	PortletURL catURL = new PortletURLImpl(request,portletSelectId, plId, PortletRequest.RENDER_PHASE);
	catURL.setParameter("struts_action", "/vcmsviewcontent/view");
	catURL.setParameter("categoryId", category.getCategoryId());


	PortletURL articleURL = new PortletURLImpl(request,portletSelectId, plId, PortletRequest.RENDER_PHASE);
	articleURL.setParameter("struts_action", "/vcmsviewcontent/view");
	articleURL.setParameter("articleId", article.getArticleId());
	articleURL.setParameter("categoryId", category.getCategoryId());
	articleURL.setParameter("cat_parent",category.getCategoryId());
%>
<table cellspacing="0" cellpadding="0" border="0" width="100%">
<tbody>
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
		      <table width="100%" border="0" cellspacing="0" cellpadding="0">
				  <tr>
					<td>
					  <table width="100%" border="0" cellspacing="0" cellpadding="0">
						  <tr>
							<td width="2"></td>
							<td>
							   <p><span class="text_none2">» <%=article.getTitle()%></span><br />
								  </p>
									<c:if test="<%=article.getHasImage()%>">
										<table width="100" border="0" align="left" cellpadding="7" cellspacing="0">
										<tr>
										  <td><div class="n-img"><img src="<%= themeDisplay.getPathImage() + "/images?img_id=" + article.getImage()  %>" width="183" height="143" align="absmiddle"></a></div></td>
										</tr>
									  </table>
									</c:if>
								 <p><b><%=article.getLead()%></b>
								 <br /><%=article.getContent()%></p>
							</td>
							<td width="2"></td>
						  </tr>
						 
						</table>
					</td>
				  </tr>
				  <tr>
					<td>
					
								<%
								if(article.getHasAttachment() == true){
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
																	<strong><img align=\"left\" border=\"0\" src="<%=themeDisplay.getPathThemeImages()%>/document_library/<%=attachment.getExtension()%>.png"> <%= attachment.getFileName() %><%= attachment.getFileName() %>	- [<a href="<%= themeDisplay.getPathMain() %>/vcms/download_attachment?attachmentId=<%= attachment.getAttachmentId() %>" target="_blank" class="link"><%= LanguageUtil.get(pageContext, "portlet.vcms.article.edit.download-attachment") %></a>] </strong></td>
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
				 <tr>
					<td><%@ include file="/html/portlet/vcmsviewcontent/send_article_email.jsp" %></td>
				  </tr>
				   <tr>
				  <td>
				       <div style="height: 22px; background-color: rgb(233, 241, 248); float: left; width: 98%; padding-left: 10px; padding-top: 6px; margin-top: 15px;"><strong>C&#225;c b&#224;i m&#7899;i</strong></div>
					   <div style="float: left; width: 98%; padding-left: 10px;"> 
						
							<%
									for (int j = 0; j < newArticles.size(); j++) {
										VcmsArticle articleNew = (VcmsArticle)newArticles.get(j);
			
										PortletURL articleNewURL;
										articleNewURL = new PortletURLImpl(request,portletSelectId, plId, PortletRequest.RENDER_PHASE);
										articleNewURL.setParameter("struts_action", "/vcmsviewcontent/view");
										articleNewURL.setParameter("articleId", articleNew.getArticleId());
										articleNewURL.setParameter("categoryId", category.getCategoryId());
							%>
								<div align="left" class="li-text_boxleft_dn">
								<a href="<%= articleNewURL %>"><%= articleNew.getTitle() %> </a>(<%=dateFormatDateTime.format(articleNew.getPublishedDate())%>)
								</div>
							<%
								}
							%>
						</div>	
						</td>
				</tr> 
				 <tr>
				  <td>
				       <div style="height: 22px; background-color: rgb(233, 241, 248); float: left; width: 98%; padding-left: 10px; padding-top: 6px; margin-top: 15px;"><strong>C&#225;c b&#224;i &#273;&#227; &#273;&#259;ng</strong></div>
					   <div style="float: left; width: 98%; padding-left: 10px;"> 
						
							<%
									for (int j = 0; j < olderArticles.size(); j++) {
										VcmsArticle articleNew = (VcmsArticle)olderArticles.get(j);
			
										PortletURL articleNewURL;
										articleNewURL = new PortletURLImpl(request,portletSelectId, plId, PortletRequest.RENDER_PHASE);
										articleNewURL.setParameter("struts_action", "/vcmsviewcontent/view");
										articleNewURL.setParameter("articleId", articleNew.getArticleId());
										articleNewURL.setParameter("categoryId", category.getCategoryId());
							%>
								<div align="left" class="li-text_boxleft_dn">
								<a href="<%= articleNewURL %>"><%= articleNew.getTitle() %> </a>(<%=dateFormatDateTime.format(articleNew.getPublishedDate())%>)
								</div>
							<%
								}
							%>
						</div>	
						</td>
				</tr> 
			</table>
		    </div>
  		 </div>
  </div>
</td>
</tr>
</tbody>
</table>

