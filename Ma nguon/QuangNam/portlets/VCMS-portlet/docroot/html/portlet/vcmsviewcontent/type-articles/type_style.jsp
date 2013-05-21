<%
	List articleOfType = new ArrayList();
	List listCat = new ArrayList();	
	
	VcmsType vType = null;
	if (Validator.isNotNull(typeId)){
		vType = VcmsTypeServiceUtil.getType(typeId);
	}			
	System.out.println(statusId);
	if(Validator.isNotNull(catId)){
		articleOfType = (List)VcmsArticleServiceUtil.getArticleByG_L_C_S_T(groupId, language, catId,statusId, Long.parseLong(typeId), 0, articleDisplayInType);	
	}else {
		articleOfType = (List)VcmsArticleServiceUtil.getArticleByG_L_S_T(groupId, language, statusId, Long.parseLong(typeId), 0, articleDisplayInType);	
	}	
%>

<%-- <style type="text/css">
.bg_02 {	
	
	
}
.title1 {
	background:transparent url(/VCMS-portlet/html/portlet/vcmsviewcontent/images/icon.png);
	background-position: left center;
	background-repeat:no-repeat;
	padding: 7px;
	font-size:14px;
	height:30px;
	text-transform:uppercase;
	background: url(images/bg-menu.png) repeat-x left center;
}
.text_044 {	
	background:transparent url(../images/HN_image/i_299.gif);
}
</style>
<table width="100%" cellspacing="0" cellpadding="0" border="0">
	<tr height="3"><td></td></tr>                                  	
	<tr>
		<td class="bg_02">
  			<div class="title1">
  				<b><%=vType.getName()%></b>
			</div>
		</td>
	</tr>
</table>
<table width="100%">
	<tr>
		<td class="text_044">
			<div style="padding: 15px 10px 15px 10px;">
				<table width="100%">			
				<%						
					for(int i=0;i<articleOfType.size();i++){
						VcmsArticle article = (VcmsArticle)articleOfType.get(i);                              		 		
						                   		 			
						
						listCat = VcmsCARelationServiceUtil.getRelationsByArticle(article.getArticleId());
						for(int j=0;j<listCat.size();j++){
							VcmsCARelation CA = (VcmsCARelation)listCat.get(0);                                    		 				
							PortletURL articleURL= PortletURLFactoryUtil.create(request,portletSelectId, plId, PortletRequest.RENDER_PHASE);
							articleURL.setParameter("struts_action", "/vcmsviewcontent/view");
							articleURL.setParameter("articleId", article.getArticleId());
							articleURL.setParameter("categoryId", CA.getCategoryId());							
						
					%>	
							<tr height="5">
								<td colspan="4"></td>
							</tr>
		              	 	<tr>
		              	 		  <td width="5"></td>
		               	 	 	  <td width="10" valign="top" >		               	 	 	  		
		               	 	 	  		<div style="background:transparent url(<%=themeDisplay.getPathThemeImage() %>/HN_image/tieudiem_boll.gif) no-repeat scroll left 7px;">
		               	 	 	  			&nbsp;
		               	 	 	  		</div>		               	 	 	  		
		               	 	  	  </td>
		               	 	  	  <td align="left" valign="top">		               	 	  	  		
		               	 	  	  	 	<a href="<%=articleURL%>"><%=article.getTitle() %></a>		               	 	  	  	 
		               	 	  	  </td>
		               	 	  	  <td width="7"></td>
		               	 	</tr>
		               	 	<tr  height="5">
		               	 		<td colspan="4"></td>
		               	 	</tr>			                                               	 	 	
					<%
						break;
						}
					}
					%>
			     </table>
			   </div>
		</td>
	</tr>
	<tr height="3"><td></td></tr>
</table> --%>

<div class="border_portlet_news">
	<div style="width: 100%">
	<div class="l-menu"></div>
	<div class="bg_title_porlet">
		<div class="icon_porlet">
			<div class="title_porlet"><%=vType.getName()%>
			</div>
		</div>
	</div>
	<div class="r-menu"></div>
	</div>
	<div class="link_hotnews"
		style="background: #f1f0f0; border: 1px solid #ccc;">
		<ul style="margin-left: 15px;">
			<%						
					for(int i=0;i<articleOfType.size();i++){
						VcmsArticle article = (VcmsArticle)articleOfType.get(i);                              		 		
						                   		 			
						
						listCat = VcmsCARelationServiceUtil.getRelationsByArticle(article.getArticleId());
						for(int j=0;j<listCat.size();j++){
							VcmsCARelation CA = (VcmsCARelation)listCat.get(0);                                    		 				
							PortletURL articleURL= PortletURLFactoryUtil.create(request,portletSelectId, plId, PortletRequest.RENDER_PHASE);
							articleURL.setParameter("struts_action", "/vcmsviewcontent/view");
							articleURL.setParameter("articleId", article.getArticleId());
							articleURL.setParameter("categoryId", CA.getCategoryId());							
						
					%>
			<li class="li_link_portlet"><a href="<%=articleURL%>"><%=article.getTitle() %></a></li>
			<%
				break;
				}
			}
			%>
		</ul>
	</div>
	
</div>