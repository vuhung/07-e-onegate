
<%
	Calendar currentDate = new GregorianCalendar();
	
	int publishFromDay = ParamUtil.getInteger(request, "publishFromDay", curDay);
	int publishFromMonth = ParamUtil.getInteger(request, "publishFromMonth", curMonth);
	int publishFromYear = ParamUtil.getInteger(request, "publishFromYear", curYear);
	
	int publishToDay = ParamUtil.getInteger(request, "publishToDay", curDay);
	int publishToMonth = ParamUtil.getInteger(request, "publishToMonth", curMonth);
	int publishToYear = ParamUtil.getInteger(request, "publishToYear", curYear);
	 
	String parentId = (String)session.getAttribute("CAT_PARENT_ID");
    int numberPage = ParamUtil.getInteger(request, "pagenum",1);
	
	VcmsArticle lastArticle = null;	
	List articlesByCat = (List)VcmsArticleServiceUtil.getTopNewArticles(groupId , language , null,listCategory[0], statusId , numberArticlesInCat);
	VcmsCategory category = null;
	
	try{
	  category = (VcmsCategory)VcmsCategoryServiceUtil.getCategory(listCategory[0]);
	}catch(Exception e){
	}
		PortletURL catURL = new PortletURLImpl(request,portletSelectId, plId, PortletRequest.RENDER_PHASE);
		catURL.setParameter("struts_action", "/vcmsviewcontent/view");
		catURL.setParameter("categoryId", category.getCategoryId());
%>        

<div id="maincol">
  	<div class="ctn-center clearfix">
    	<div class="line-top">
        	<div class="line-bottom">
            	<div class="line-left">
                	<div class="line-right">
                    	<div class="goc-left-top">
                        	<div class="goc-right-top">
                            	<div class="goc-left-bottom">
                                	<div class="goc-right-bottom">
                                    	<div class="ct">
                                        	<table width="100%" cellspacing="0" cellpadding="0" border="0">
    										<tr>
                                        		<td width="4"><img src="<%= themeDisplay.getPathThemeImage() %>/HN_image/i_14_l.gif"/></td>
                                            	<td width="32"><img src="<%= themeDisplay.getPathThemeImage() %>/HN_image/icon.gif"/></td>
                                            	<td class="title"><%= category.getName() %></td>
                                                <td width="4"><img src="<%= themeDisplay.getPathThemeImage() %>/HN_image/i_16_r.gif"/></td>
   											</tr>
                                            </table>

											<div class="smallpage">
												<%	for (int j = 0; j < articlesByCat.size(); j++) {
													VcmsArticle article = (VcmsArticle)articlesByCat.get(j);
													
													PortletURL articleURL= new PortletURLImpl(request,portletSelectId, plId, PortletRequest.RENDER_PHASE);
													articleURL.setParameter("struts_action", "/vcmsviewcontent/view");
													articleURL.setParameter("articleId", article.getArticleId());
													articleURL.setParameter("categoryId", category.getCategoryId());
												%>				
												<div class="group1 clearfix">
									            	<table width="100%">	
									            	<tr>	
									            		<td colspan="3" style="padding-bottom:5px;"><a href="<%=articleURL%>"><b><%= article.getTitle() %></a></b></td></tr>
									            	
									            	<tr>
									            		<c:if test="<%=article.getHasImage()%>">	
										            		<td><img align="left" height="113" width="148" src="<%= themeDisplay.getPathImage() + "/images?img_id=" + article.getImage()  %>" /></td>
										            		<td width="10">&nbsp;</td>
									            		</c:if>
									            		<td valign="top" align="justify" <%=!article.getHasImage()?"colspan='3'":""%> ><%=article.getLead()%></td>
									            	</tr>
									            	</table>	
												</div>
												<%}%>		
											
												<p> </p>
												<div class="othernews">
						         					<% if(articlesByCat.size() == numberArticlesInCat){
														lastArticle = (VcmsArticle)articlesByCat.get(articlesByCat.size()-1);
														List listNextArticle = VcmsArticleServiceUtil.getOlderArticles(
															groupId, language, null, String.valueOf(displayDefaultCatId), lastArticle.getArticleId(),
															statusId, numberArticlesNextInCat);
													%>
													<div class="othernews">
														<p><b>Các tin khác</b></p>
														<%
														if (listNextArticle.size() > 0) {
															for (int j = 0; j < listNextArticle.size(); j++) {
																VcmsArticle articleNew = (VcmsArticle)listNextArticle.get(j);
												
																PortletURL articleNewURL;
																articleNewURL = new PortletURLImpl(request,portletSelectId, plId, PortletRequest.RENDER_PHASE);
																articleNewURL.setParameter("struts_action", "/vcmsviewcontent/view");
																articleNewURL.setParameter("articleId", articleNew.getArticleId());
																articleNewURL.setParameter("categoryId", category.getCategoryId());
															%>
														<p>&bull; <a href="<%= articleNewURL %>"><%= articleNew.getTitle() %> </a></p>
														<%	}}%>
													<%}%>
														<p class="more_r" align="right"><a href="#"><i>Xem ti&#7871;p</i></a></p>
														<div style="background:#FFF4E1; padding:10px">C&#225;c tin &#273;&#227; &#273;&#432;a ng&#224;y &nbsp;&nbsp;<select class="day" name="day"><option>20</option></select>
																<select class="day" name="day"><option>02</option></select>
															   <select class="day" name="day"><option>2009</option></select>
															&nbsp;&nbsp;&nbsp;T&#7899;i <select class="day" name="day"><option>02</option></select>
																<select class="day" name="day"><option>02</option></select>
																<select class="day" name="day"><option>2009</option></select>
																&nbsp;<input type="button" name="button" class="smday" value="Xem" />
														</div>
													</div>
												</div>											                 																				
											</div>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>
</div>


