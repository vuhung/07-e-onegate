<%
/**
 * Copyright (c) 2000-2008 VSI, Inc. All rights reserved.
 *
**/
%>

<%	
	
	List articlesByCat = VcmsArticleServiceUtil.getArticlesNewByL_S_S(groupId, language, statusId, true, numberOfStickedNews);	
	
	PortletURL catURL = PortletURLFactoryUtil.create(request,portletSelectId, plId, PortletRequest.RENDER_PHASE);
	catURL.setParameter("struts_action", "/vcmsviewcontent/view");

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
                                            	<tr><td width="4"><img src="<%= themeDisplay.getPathThemeImage() %>/HN_image/i_14_l.gif"/></td>
                                                	<td width="32"><img src="<%= themeDisplay.getPathThemeImage() %>/HN_image/icon.gif"/></td>
                                                	<td class="title">Tin n&#7893;i b&#7853;t</td>
                                                    <td width="4"><img src="<%= themeDisplay.getPathThemeImage() %>/HN_image/i_16_r.gif"/></td>
                                                </tr>
                                            </table>
    
								            <table width="100%" cellspacing="7" cellpadding="5" border="0">
                                            <%	String categoryIdNext = "";
                                            	if(Validator.isNotNull(articlesByCat) && articlesByCat.size()>0){
	                                            
	                                            	VcmsArticle articleFirst = (VcmsArticle)articlesByCat.get(0);
	                                            	VcmsCARelation categoryFirst = VcmsCARelationServiceUtil.findRelationsByArticle(articleFirst.getArticleId());
	                                            	
													if(Validator.isNotNull(categoryFirst)){
														categoryIdNext = String.valueOf(categoryFirst.getCategoryId());
													}	
													
													catURL.setParameter("categoryId", categoryIdNext);%>	
												
                                        	<tr>
                                            	<td width="50%" style="padding-left:10px;padding-right:10px;<%=articleFirst.getHasImage()? "padding-top:10px;":"padding-top:15px;"%>" valign="top">
                                            	<%	                                          		
                                        			String leadArticle = articleFirst.getLead();                                        			
													int ch = 180;
													int space = 0;
													if(leadArticle.length()>ch){
														  space = leadArticle.indexOf(" ",ch);
														  if(space>0){
															  leadArticle = leadArticle.substring(0,space) + " ...";
														  }
													}
                                            		
                                            		PortletURL articleURL = PortletURLFactoryUtil.create(request,portletSelectId, plId, PortletRequest.RENDER_PHASE);
													articleURL.setParameter("struts_action", "/vcmsviewcontent/view");
													articleURL.setParameter("articleId", articleFirst.getArticleId());
													articleURL.setParameter("categoryId", categoryIdNext);
                                            	%>
                                            	<table width="100%">
                                            	
                                            	<%if(articleFirst.getHasImage()){%>
                                            	<tr>
                                            		<td>	
								            			<img align="left" height="195" width="250" src="<%= themeDisplay.getPathImage() + "/images?img_id=" + articleFirst.getImage()  %>" />
								            		</td>
								            	</tr>
						            			<tr>	
							            			<td>
								            			<div class="textbold" align="justify" style="padding-top:5px;"><a href="<%=articleURL%>"><%=articleFirst.getTitle()%></a></div>
	                                                    <div align="justify"><%=leadArticle%></div>
							            			</td>
							            		</tr>	
							            		<%} else {%>
						            			<tr>	
							            			<td valign="top">
								            			<div class="textbold" align="justify" ><a href="<%=articleURL%>"><%=articleFirst.getTitle()%></a></div>
	                                                    <div align="justify"><%=leadArticle%></div>
							            			</td>
							            		</tr>	
							            		<%}%>	
							            	
                                            		
                                            	</table>	
                                            	</td>
                                            	
                                                <td valign="top" align="justify" style="padding-top:15px;">
                                                <%	String titleArticle = "";                                                
                                                	for(int i=1;i<articlesByCat.size();i++){
                                                		VcmsArticle article = (VcmsArticle)articlesByCat.get(i);      
                                                		                                          		
                                                		VcmsCARelation category = VcmsCARelationServiceUtil.findRelationsByArticle(articleFirst.getArticleId());
														if(Validator.isNotNull(category)){
															categoryIdNext = String.valueOf(category.getCategoryId());
														}
                                                		
                                            			titleArticle = article.getTitle();                                        			
														int ch1 = 50;
														int space1 = 0;
														if(titleArticle.length()>ch1){
															  space1 = titleArticle.indexOf(" ",ch1);
															  if(space1>0){
																  titleArticle = titleArticle.substring(0,space1) + " ...";
															  }
														}
                                                			
                                                	
                                                		PortletURL articleNextURL = PortletURLFactoryUtil.create(request,portletSelectId, plId, PortletRequest.RENDER_PHASE);
														articleNextURL.setParameter("struts_action", "/vcmsviewcontent/view");
														articleNextURL.setParameter("articleId", article.getArticleId());
														articleNextURL.setParameter("categoryId", categoryIdNext);%>	
															
                                                	<div <%=(i<articlesByCat.size()-1)? "class='textlink'":"class='textlink end'"%> >&bull;&nbsp;<a href="<%=articleNextURL%>"><%=titleArticle%></a></div>
                                                <%}%>                                                
                                                </td>
                                             </tr>
                                             <%} else {%>
                                             <tr>		
                                             	<td colspan="2" width="100%" align="center">
                                             	    <br/>
                                             		<img src="<%= themeDisplay.getPathThemeImage() %>/DB_image/under_construction.jpg">
                                             		<br/><br/>
                                             	</td> 
                                             </tr>
                                             <%}%>		
                                            </table>
                                            
                                            <c:if test="<%=Validator.isNotNull(articlesByCat) && articlesByCat.size()>0%>">	
                                            <%	StringBuilder sb = new StringBuilder();

												sb.append(themeDisplay.getPathMain());
												sb.append("/vcmsviewcontent/rss?");
												sb.append("categoryId=" + categoryIdNext);
												sb.append("&p_l_id=" + Long.toString(plId));
												sb.append("&portletSelectId=" + portletSelectId);
												String rssURL = sb.toString();
											%>		
                                            	<div class="detail">
                                            	
                                            		<a href="<%=rssURL%>"><img hspace="10" height="10" width="37" align="left" src="<%= themeDisplay.getPathThemeImage() %>/HN_image/rss.gif"/></a>
                                            	
                                            	<a href="<%=catURL%>">Xem ti&#7871;p...</a></div>   
                                            	</div>
                                            </c:if>	 
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