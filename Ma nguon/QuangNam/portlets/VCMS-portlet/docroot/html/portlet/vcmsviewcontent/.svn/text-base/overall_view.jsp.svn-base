<%@page import="com.liferay.portlet.PortletURLFactoryUtil"%>
<%	
	Calendar currentDate = new GregorianCalendar();
	
	int publishFromDay = ParamUtil.getInteger(request, "fromDay", curDay);
	int publishFromMonth = ParamUtil.getInteger(request, "fromMonth", curMonth);
	int publishFromYear = ParamUtil.getInteger(request, "fromYear", curYear-1);
	
	int publishToDay = ParamUtil.getInteger(request, "toDay", curDay);
	int publishToMonth = ParamUtil.getInteger(request, "toMonth", curMonth);
	int publishToYear = ParamUtil.getInteger(request, "toYear", curYear);	
	
	Date dateFrom  = new GregorianCalendar(publishFromYear, publishFromMonth-1, publishFromDay).getTime();
	Date dateTo = new GregorianCalendar(publishToYear, publishToMonth-1, publishToDay).getTime();
	
    String parentId = (String)session.getAttribute("CAT_PARENT_ID");
    String cmd = ParamUtil.getString(request, "cmd","");
    
    int numberPage = ParamUtil.getInteger(request, "pagenum",1); 
    int total = 0;
    
    if (cmd.equals("search")){    	
		total = VcmsArticleServiceUtil.countArticleByG_L_S_C_D(groupId, language, statusId, categoryId, dateFrom, dateTo);
	} else if(Validator.isNull(cmd)) {
		total = VcmsArticleServiceUtil.countAllCategoryArticles(groupId, language,categoryId,statusId);
	} 
	
	int pages = (total % numberArticlesInCat == 0) ? total / numberArticlesInCat : total / numberArticlesInCat + 1;
	int begin = numberArticlesInCat * (numberPage - 1);
	int end = (total>numberArticlesInCat * numberPage) ? numberArticlesInCat * numberPage : total;
	
	int beginNextPage = end;
	int endNextPage = ((end+numberArticlesNextInCat) >=total)? total:end+numberArticlesNextInCat;

	List listIntroArticle = new ArrayList();

	if(cmd.equals("search")){
		listIntroArticle = VcmsArticleServiceUtil.getArticleByG_L_S_C_D(groupId, language, statusId, categoryId, dateFrom, dateTo, begin, end);		
	} else {
		listIntroArticle = VcmsArticleServiceUtil.getAllCategoryArticles(groupId, language,categoryId,statusId,begin,end);
	}
	
	
    VcmsCategory category = VcmsCategoryServiceUtil.getCategory(categoryId);
    PortletURL catURL = PortletURLFactoryUtil.create(request,portletSelectId, plId, PortletRequest.RENDER_PHASE);
	catURL.setParameter("jspPage","/html/portlet/vcmsviewcontent/view.jsp" );
	catURL.setParameter("categoryId", category.getCategoryId());
	catURL.setParameter("cat_parent", parentId);
	catURL.setParameter("cat_style", categoryStyle);
	
	PortletURL searchURL = renderResponse.createRenderURL();
	searchURL.setParameter("jspPage","/html/portlet/vcmsviewcontent/view.jsp" );
	searchURL.setParameter("categoryId", category.getCategoryId());
	searchURL.setParameter("cat_parent", parentId);	
	searchURL.setParameter("cmd","search");
	
%>
<%
	if(Validator.isNotNull(parentId) && !parentId.equals("0")){
		VcmsCategory vcmsCategoryImage = VcmsCategoryServiceUtil.getCategory(parentId);
%>
	<c:if test="<%=vcmsCategoryImage.getHasImage() %>">
		<div style="padding-bottom: 6px;">
			<img src="<%= themeDisplay.getPathImage() + "/images?img_id=" + vcmsCategoryImage.getImage() %>" border="0"/>
		</div>
	</c:if>
	
<%	
	}else{
%>
	<c:if test="<%=category.getHasImage() %>">
		<div style="padding-bottom: 6px;">
			<img src="<%= themeDisplay.getPathImage() + "/images?img_id=" + category.getImage() %>" border="0"/>
		</div>
	</c:if>
<%
	}
%>

<form  method="post" name="<portlet:namespace />fm">
<input type="hidden" name="<portlet:namespace/>cmd" value=""/>
<table width="100%">
	<tr><td height="3"></td></tr>
	<tr>		
		<td>
  			<table width="100%" class="center_top_background">  				
  				<tr>
  					<td id="left_top_tab"></td>		    			
  					<td>
  						<div align="left" class="title1"><%= category.getName() %></div>
  					</td>
					<td id="right_top_tabs"></td>
  				</tr>
  			</table>
  		</td>
  	</tr>
</table>	
	
<table width="100%" cellspacing="0" cellpadding="0" border="0">
	<tr>		
		<td class="boder_top" bgcolor="#FFFFFF" style="padding-top: 0px;">
			<%if (listIntroArticle.size()<1){%>
				<div align="center">
					<br/>		
		      			<img src="<%= themeDisplay.getPathThemeImage() %>/DB_image/under_construction.jpg">
		      		<br/><br/>
		      	</div>
			<%}%>
			
			<%	for (int j = 0; j < listIntroArticle.size(); j++) {
				VcmsArticle article = (VcmsArticle)listIntroArticle.get(j);
				
				PortletURL articleURL= PortletURLFactoryUtil.create(request,portletSelectId, plId, PortletRequest.RENDER_PHASE);
				articleURL.setParameter("jspPage","/html/portlet/vcmsviewcontent/view.jsp" );
				articleURL.setParameter("articleId", article.getArticleId());
				articleURL.setParameter("categoryId", category.getCategoryId());
			%>				
				<p></p>
	           	<table width="100%">	
		           	
		           	<tr>
		           		<c:if test="<%=article.getHasImage()%>">	
		            		<td valign="top" >
		            			<a href="<%=articleURL%>"><img align="left" width="148" src="<%= themeDisplay.getPathImage() + "/images?img_id=" + article.getImage()  %>" /></a>
		            		</td>
		            		<td width="10">&nbsp;</td>
		           		</c:if>
		           			
		           		<td valign="top" align="justify" <%=!article.getHasImage()?"colspan='3'":""%> >
		           			<a href="<%=articleURL%>"><b><%= article.getTitle() %></b></a>
		           			<br/>
		           		<%=StringUtil.shorten(HtmlUtil.extractText(article.getLead()),500)%>
		           		<div align="right" style="position:relative;bottom:0px;">
		           		aaaaaaaa	
		           		</div>
		           		</td>

		           	</tr>
		           	
	           	</table>
			
			<%}%>		
		
			<p> </p>
			<%	List listNextArticle = VcmsArticleServiceUtil.getAllCategoryArticles(groupId, language,categoryId,statusId,beginNextPage,endNextPage);															
					if (listNextArticle.size() > 0) {
						String titleArticle = ""; %>	
							
			<div class="othernews">				
					<p><b><%= LanguageUtil.get(pageContext, "com.vportal.portlet.vcmsviewcontent.otherview") %></b></p>													
						<%	for (int j = 0; j < listNextArticle.size(); j++) {
								VcmsArticle articleNew = (VcmsArticle)listNextArticle.get(j);
								
								/*
					 			titleArticle = articleNew.getTitle();                                        			
								int ch = 65;
								int space = 0;
								if(titleArticle.length()>ch){
									  space = titleArticle.indexOf(" ",ch);
									  if(space>0){
										  titleArticle = titleArticle.substring(0,space) + " ...";
									  }
								}
								*/
								
								PortletURL articleNewURL;
						
								articleNewURL = PortletURLFactoryUtil.create(request,portletSelectId, plId, PortletRequest.RENDER_PHASE);
								articleNewURL.setParameter("jspPage","/html/portlet/vcmsviewcontent/view.jsp" );
								articleNewURL.setParameter("articleId", articleNew.getArticleId());
								articleNewURL.setParameter("categoryId", category.getCategoryId());
						%>
					<div class="text_09"><a href="<%= articleNewURL %>"><%= articleNew.getTitle() %></a>&nbsp;<span style="color: rgb(144, 144, 144);">(<%=ActionUtil.dateParser(articleNew.getPublishedDate())%>)</span></div>
					<%	}}%>													
			</div>
						
					<c:if test="<%=(pages>1)%>">
	                    <p align="right">
	                    	<% 	if(numberPage >1){
								int intPrev = numberPage-1;%>
							<span><a href="#" onclick="self.location = '<portlet:renderURL windowState="<%=WindowState.NORMAL.toString() %>"> 
									<portlet:param name="jspPage" value="/portlet/vcmsviewcontent/view.jsp" />
									<portlet:param name="pagenum" value="<%= String.valueOf(intPrev) %>" />	
									<portlet:param name="categoryId" value="<%= category.getCategoryId() %>" />	
									<portlet:param name="cat_parent" value="<%= parentId %>" />
										
									<portlet:param name="fromDay" value="<%= String.valueOf(publishFromDay) %>" />
									<portlet:param name="fromMonth" value="<%= String.valueOf(publishFromMonth) %>" />
									<portlet:param name="fromYear" value="<%= String.valueOf(publishFromYear) %>" />
									<portlet:param name="toDay" value="<%= String.valueOf(publishToDay) %>" />
									<portlet:param name="toMonth" value="<%= String.valueOf(publishToMonth) %>" />
									<portlet:param name="toYear" value="<%= String.valueOf(publishToYear) %>" />			
									</portlet:renderURL>';" ><i>&lsaquo;&lsaquo; <%= LanguageUtil.get(pageContext, "com.vportal.portlet.vcmsviewcontent.prev_page") %></i></a>&nbsp; </span>
		
							<%	}	%>	
							<% 	if(numberPage < pages){
								int intNext = numberPage + 1;%>
								
								&nbsp; <a href="#" onclick="self.location = '<portlet:renderURL windowState="<%=WindowState.NORMAL.toString() %>"> 
									<portlet:param name="jspPage" value="html/portlet/vcmsviewcontent/view.jsp" />
									<portlet:param name="pagenum" value="<%= String.valueOf(intNext) %>" />	
									<portlet:param name="categoryId" value="<%= category.getCategoryId() %>" />	
									<portlet:param name="cat_parent" value="<%= parentId %>" />
										
									<portlet:param name="fromDay" value="<%= String.valueOf(publishFromDay) %>" />
									<portlet:param name="fromMonth" value="<%= String.valueOf(publishFromMonth) %>" />
									<portlet:param name="fromYear" value="<%= String.valueOf(publishFromYear) %>" />
									<portlet:param name="toDay" value="<%= String.valueOf(publishToDay) %>" />
									<portlet:param name="toMonth" value="<%= String.valueOf(publishToMonth) %>" />
									<portlet:param name="toYear" value="<%= String.valueOf(publishToYear) %>" />
									
									</portlet:renderURL>';" ><i><%= LanguageUtil.get(pageContext, "com.vportal.portlet.vcmsviewcontent.next_page") %> &rsaquo;&rsaquo;</i></a>
							<%	}  %>
								
	                    </p>
					</c:if>		
						
					<c:if test="<%=isDisplayDate%>">	
					<div style="background:#ADD3FF; padding:10px"><%= LanguageUtil.get(pageContext, "com.vportal.portlet.vcmsviewcontent.date_publish") %>
						<select class="day" name="<portlet:namespace/>fromDay">
						<%for(int i=1;i<=31;i++){%>
							<option value="<%=i%>" <%=(publishFromDay==i)?"selected":""%>><%=i%></option>
						<%}%>
						</select>
							
						<select class="day" name="<portlet:namespace/>fromMonth">
						<%for(int i=1;i<=12;i++){%>
							<option value="<%=i%>" <%=(publishFromMonth==i)?"selected":""%>><%=i%></option>
						<%}%>
						</select>
							
						<select class="day" name="<portlet:namespace/>fromYear">
						<%for(int i=2000;i<=2020;i++){%>
							<option value="<%=i%>" <%=(publishFromYear==i)?"selected":""%>><%=i%></option>
						<%}%>
						</select>
						<%= LanguageUtil.get(pageContext, "com.vportal.portlet.vcmsviewcontent.to_date") %>
							
						<select class="day" name="<portlet:namespace/>toDay">
						<%for(int i=1;i<=31;i++){%>
							<option value="<%=i%>" <%=(publishToDay==i)?"selected":""%>><%=i%></option>
						<%}%>
						</select>
							
						<select class="day" name="<portlet:namespace/>toMonth">
						<%for(int i=1;i<=12;i++){%>
							<option value="<%=i%>" <%=(publishToMonth==i)?"selected":""%>><%=i%></option>
						<%}%>
						</select>
							
						<select class="day" name="<portlet:namespace/>toYear">
						<%for(int i=2000;i<=2020;i++){%>
							<option value="<%=i%>" <%=(publishToYear==i)?"selected":""%>><%=i%></option>
						<%}%>
						</select>
						<input type="button" name="button" value="<%= LanguageUtil.get(pageContext, "com.vportal.portlet.vcmsviewcontent.find") %>" onclick="<portlet:namespace />submitForm();"/>
					</div>
				</c:if>												                 																				
		</td>
	</tr>
	</table>
	<table width="100%">
		<tr>
			<td width="4"><img src="<%= themeDisplay.getPathThemeImage() %>/HN_image/i_34.gif" width="4" height="4"/></td>
			<td id="center_bottom_background"></td>
			<td width="4"><img src="<%= themeDisplay.getPathThemeImage() %>/HN_image/i_35.gif" width="4" height="4"/></td>
		</tr>
		<tr><td colspan="3" height="3"></td></tr>
	</table>
	                            

</form>
																
<script language ="javascript">		
	function <portlet:namespace/>submitForm(){
		var myform = document.<portlet:namespace />fm;
		myform.action="<%= searchURL.toString() %>";
		myform.submit();
	}
</script>																