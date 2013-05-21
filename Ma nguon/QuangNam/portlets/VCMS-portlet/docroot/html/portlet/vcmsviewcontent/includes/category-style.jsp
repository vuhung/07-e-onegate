<%@ include file="/html/portlet/vcmsviewcontent/javascript.jsp" %>
<table width="100%" border="0" cellspacing="0" cellpadding="0">
  <tr>
    <td><img src="/html/portlet/vcmsviewcontent/images/0.gif" width="1" height="1" /></td>
  </tr>
<tr>
    <td class="boder">
<%
	VcmsCategory categorySelected = (VcmsCategory)VcmsCategoryServiceUtil.getCategory(categoryId);
	
	List subCategories = (List)VcmsCategoryServiceUtil.getCategoriesByParent(groupId,categoryId,language);
	
	if(subCategories == null){
		subCategories = new ArrayList();
	}
	
	if(subCategories != null && subCategories.size()>0 && categorySelected.getParentId().equals("0")){
		VcmsCategory firstCategory = (VcmsCategory)subCategories.get(0);
		
		List articlesByCategory = (List)VcmsArticleServiceUtil.getTopNewArticles(groupId , language,null,firstCategory.getCategoryId(),2,5);
		if(articlesByCategory != null && articlesByCategory.size()>0){		
			VcmsArticle article = (VcmsArticle)articlesByCategory.get(0);
%>
		<table width="100%" border="0" cellspacing="0" cellpadding="0">
              <tr>
                <td class="title_center"><%= firstCategory.getName() %></td>
              </tr>
			  <tr>
		        <td class="text_none">
					<table width="95%" border="0" align="center" cellpadding="0" cellspacing="0">
		                    <tr>
		                      <td height="10"><img src="/html/portlet/vcmsviewcontent/images/0.gif" width="1" height="1" /></td>
		                    </tr>
		                    <tr>
		                      <td><div align="right"><%=dateFormatDateTime.format(article.getPublishedDate())%></div></td>
		                    </tr>
		                    <tr>
		                      <td><div align="justify">
		                          <p><span class="text_none2">» <%=article.getTitle()%></span><br />
		                          </p>
			                        	<table width="100" border="0" align="left" cellpadding="7" cellspacing="0">
			                            <tr>
			                              <td><div class="n-img"><img src="<%= themeDisplay.getPathImage() + "/images?img_id=" + article.getImage()  %>" width="183" height="143" align="absmiddle"></a></div></td>
			                            </tr>
			                          </table>
		                         <p><b><%=article.getLead()%></b></p>
		                         <p><%=article.getContent()%></p>
								 <br />
		                      </div></td>
		                    </tr>
				<tr>
					</td>
						
						  <br/>
							  <vportal:file-download entryClass="<%=VcmsArticle.class%>" entryId="<%=Long.parseLong(article.getArticleId())%>" />
								<!--<%if(article.getHasAttachment() == true){
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
						    	<%}%>-->
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
		    </td>
          </tr>
          <tr>
            <td><%@ include file="/html/portlet/vcmsviewcontent/send_article_email.jsp" %></td>
          </tr>
        </table>
<%	}
}
if(!categorySelected.getParentId().equals("0")){
	List articlesByCategory = (List)VcmsArticleServiceUtil.getTopNewArticles(groupId , language,null,categorySelected.getCategoryId(),2,5);
		if(articlesByCategory != null && articlesByCategory.size()>0){		
			VcmsArticle article = (VcmsArticle)articlesByCategory.get(0);
%>
<table width="100%" border="0" cellspacing="0" cellpadding="0">
              <tr>
                <td class="title_center"><%= categorySelected.getName() %></td>
              </tr>
			  <tr>
		        <td class="text_none">
					<table width="95%" border="0" align="center" cellpadding="0" cellspacing="0">
		                    <tr>
		                      <td height="10"><img src="/html/portlet/vcmsviewcontent/images/0.gif" width="1" height="1" /></td>
		                    </tr>
		                    <tr>
		                      <td><div align="right"><%=dateFormatDateTime.format(article.getPublishedDate())%></div></td>
		                    </tr>
		                    <tr>
		                      <td><div align="justify">
		                          <p><span class="text_none2">» <%=article.getTitle()%></span><br />
		                          </p>
				                    <c:if test="<%=article.getHasImage()%>">
				                        <table width="100" border="0" align="left" cellpadding="7" cellspacing="0">
				                            <tr>
				                              <td><div class="n-img"><img src="<%= themeDisplay.getPathImage() + "/images?img_id=" + article.getImage()  %>" width="183" height="143" align="absmiddle"></a></div></td>
				                            </tr>
				                          </table>
									</c:if>
		                         <p><b><%=article.getLead()%></b></p>
		                         <p><%=article.getContent()%></p>
								 <br />
		                      </div></td>
		                    </tr>
				<tr>
					</td>
						
						  <br/>
							  <vportal:file-download entryClass="<%=VcmsArticle.class%>" entryId="<%=Long.parseLong(article.getArticleId())%>" />
								<!--<%if(article.getHasAttachment() == true){
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
						    	<%}%>-->
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
		    </td>
          </tr>
          <tr>
            <td><%@ include file="/html/portlet/vcmsviewcontent/send_article_email.jsp" %></td>
          </tr>
        </table>
<%}
}%>

</td>
</tr>
</table>