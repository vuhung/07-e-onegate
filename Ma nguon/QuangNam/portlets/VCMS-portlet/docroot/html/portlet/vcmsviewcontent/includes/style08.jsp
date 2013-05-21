<link href="/html/portlet/vcmsviewcontent/includes/css/common.css" rel="stylesheet" type="text/css" />	 

<%
	categoryId = String.valueOf(displayDefaultCatId);
	
	if(Validator.isNull(categoryId)){
		categoryId = ParamUtil.getString(request, "categoryId");
	}
	
	
	//Begin get the parameters of search article. Initial date values
	Calendar currentDate = new GregorianCalendar();
	int curYear = currentDate.get(Calendar.YEAR);
	int curMonth = currentDate.get(Calendar.MONTH);
	int curDay = currentDate.get(Calendar.DATE);
	
	int yearsearch = ParamUtil.getInteger(request, "year", -1);//curYear
	int monthsearch = ParamUtil.getInteger(request, "month", -1);//curMonth + 1

	PortletURL formAction = renderResponse.createActionURL();
	formAction.setParameter("struts_action", "/vcmsviewcontent/view");


	VcmsArticle lastArticle = null;	
	List articlesByCat = new ArrayList();
	VcmsCategory category = null;
		
	Date fromDate = null;
	Date toDate = null;
	if(Validator.isNotNull(categoryId)){
			System.out.println("-----------------Truong hop xet Category!=null");
		if(yearsearch != -1) {
			if(monthsearch != -1) {
				fromDate = new GregorianCalendar(yearsearch, (monthsearch-1), 1).getTime();//thang can tim - 1
				toDate = new GregorianCalendar(yearsearch, (monthsearch-1), 31).getTime();
			}else{
				fromDate = new GregorianCalendar(yearsearch, 0, 1).getTime();//thang can tim - 1
				toDate = new GregorianCalendar(yearsearch, 11, 31).getTime();
			}
			articlesByCat = VcmsArticleServiceUtil.getByCatePubishedDate(groupId, language, String.valueOf(categoryId), fromDate, toDate, numberArticlesInCat);
			category = (VcmsCategory)VcmsCategoryServiceUtil.getCategory(String.valueOf(categoryId));
		}else{
			articlesByCat = (List)VcmsArticleServiceUtil.getTopNewArticles(groupId , language , null, String.valueOf(categoryId), 2 , numberArticlesInCat);
			category = (VcmsCategory)VcmsCategoryServiceUtil.getCategory(String.valueOf(categoryId));
		}
	}else{
			System.out.println("-----------------Truong hop xet Category = null");
		if(yearsearch != -1) {
			if(monthsearch != -1) {
				fromDate = new GregorianCalendar(yearsearch, (monthsearch-1), 1).getTime();//thang can tim - 1
				toDate = new GregorianCalendar(yearsearch, (monthsearch-1), 31).getTime();
			}else{
				fromDate = new GregorianCalendar(yearsearch, 0, 1).getTime();//thang can tim - 1
				toDate = new GregorianCalendar(yearsearch, 11, 31).getTime();
			}
			articlesByCat = VcmsArticleServiceUtil.getByCatePubishedDate(groupId, language, null, fromDate, toDate, numberArticlesInCat );
			//category = (VcmsCategory)VcmsCategoryServiceUtil.getCategory(String.valueOf(categoryId));
		}else{
			articlesByCat = (List)VcmsArticleServiceUtil.getTopNewArticles(groupId , language , null, String.valueOf(displayDefaultCatId), 2 , numberArticlesInCat);
			category = (VcmsCategory)VcmsCategoryServiceUtil.getCategory(String.valueOf(displayDefaultCatId));
		}	
	}
	
	//if(articlesByCat != null && articlesByCat.size()>0){
	
		PortletURL catURL;
		catURL = new PortletURLImpl(request,portletSelectId, plId, false);
		catURL.setParameter("struts_action", "/vcmsviewcontent/view");
		//catURL.setParameter("categoryId", category.getCategoryId());
%>

<%//phan trang
	String sPageNum = ParamUtil.getString(request, "pagenum", "1");
	int numberPage = 1;
	if(Validator.isNotNull(sPageNum)){
		numberPage = Integer.parseInt(sPageNum);
	}

	int total = articlesByCat.size();
	//int total = 3;
	//int per = Integer.parseInt(numOfItemPerPage);
	int per = 10;
	int pages = (total % per == 0) ? total / per : total / per + 1;
	
	int begin = per * (numberPage - 1);
	int end = (total>per * numberPage) ? per * numberPage : total;
	List articlesByCatPage = articlesByCat.subList(begin,end);
%>

<script language="javascript">
	function <portlet:namespace />submitForm() {
		var fm = document.<portlet:namespace />fm;
		fm.action="<%= formAction.toString() %>";
		fm.method="post";
		fm.submit();
	}
	
</script>

<div style="background:#FFFFFF; border:1px solid #BABABA;width:400px;">

<form action="<portlet:actionURL><portlet:param name="struts_action" value="/vcmsviewcontent/view" />
	</portlet:actionURL>" method="post" name="<portlet:namespace />fm" enctype="multipart/form-data" >
	<input name="<portlet:namespace /><%=ConstantsExt.CATEGORY_ID%>" type="hidden" value="<%= categoryId %>">
    <div class="bg_tit_c"><div class="icon_tit_c bold"><%=(category!=null) ? category.getName() : ""%></div><div class="date"></div></div>
	
   <div class="table-support" >
      <table width="98%" border="0" align="center" cellpadding="5" cellspacing="1" bordercolor="#CCCCCC">
      	<tr style="height:35px;" >
          	<td width="50%" bgcolor="#FFFFFF"  style="font-size:11px; font-weight:bold; color:#666666">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<%= LanguageUtil.get(pageContext, "portlet.vcmsviewcontent.choose-year") %>:<br /></td>
          	<td bgcolor="#FFFFFF">
           	<select name="year" id="year" style="font-size:11px; color:#666666" onchange="" >
				<option value="-1" ><%= LanguageUtil.get(pageContext, "portlet.vlegal.all") %></option>
				<%for(int i=curYear; i >= (curYear-10); i--){ %>
					<option value="<%= i %>" <%=(i == yearsearch) ? "selected" : "" %> > <%= i %></option>
			  	<%}%>
			</select>
          	</td>
        </tr>
       
        <tr style="height:35px;" >
            <td width="50%" bgcolor="#FFFFFF" style="font-size:11px; font-weight:bold; color:#666666;">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<%= LanguageUtil.get(pageContext, "portlet.vcmsviewcontent.choose-news-month") %>:</td>
            <td bgcolor="#FFFFFF">
              <select name="month" id="month" style="font-size:11px;color:#666666" onchange="" >
					<option value="-1" ><%= LanguageUtil.get(pageContext, "portlet.vlegal.all") %></option>
					<%for(int i=1; i <= 12; i++){ %>
						<option value="<%= i %>" <%=(i == monthsearch) ? "selected" : "" %> > <%= i %></option>
				  	<%}%>
			  </select>  
            </td>
      </tr>
      <tr style="height:35px;" >
        <td width="50%" bgcolor="#FFFFFF" >&nbsp;</td>
        <td bgcolor="#FFFFFF">
          <input type="button" style="font-size:11px;color:#666666" id="button" value="<%= LanguageUtil.get(pageContext, "portlet.vcmsviewcontent.search") %>" onclick="<portlet:namespace />submitForm()" >	  
        </td>
      </tr>
      </table>
      
    </div>

</form>                	  
    <div class="table-support"  >
	    <p class="tit_news"><a class="icon_news_fo"><%= LanguageUtil.get(pageContext, "portlet.vcmsviewcontent.search-results") %></a></p><br/>
		<%if( (articlesByCatPage==null) || (articlesByCatPage.size()>0)){%>
		    <table width="96%" border="1" align="center" cellpadding="5" cellspacing="15" bgcolor="#FFFFFF" bordercolor="#CCCCCC">
		      <tbody>
					<%for (int j = 0; j < articlesByCatPage.size(); j++) {
						VcmsArticle article = (VcmsArticle)articlesByCatPage.get(j);
						
						PortletURL articleURL;
						articleURL = new PortletURLImpl(request,portletSelectId, plId, false);
						articleURL.setParameter("struts_action", "/vcmsviewcontent/view");
					%>
						<!--Get Attachment of Article...-->
						<%if(article.getHasAttachment() == true){
							List attachments = null;
							attachments = AttachmentLocalServiceUtil.getAttachments(Long.parseLong(article.getArticleId()), VcmsArticle.class);
							
							for (int i = 0; i < attachments.size(); i ++) {
									Attachment attachment = (Attachment) attachments.get(i);
							%>	
							 <tr height="30px;">
			                  <td width="8%" bgcolor="#FFFFFF" style="padding-left:3px;padding-right:3px"><div align="center"><img align=\"center\" border=\"0\" width="18" height="18" src="<%=themeDisplay.getPathThemeImages()%>/document_library/<%=attachment.getExtension()%>.png"></div></td>
			                  <td width="80%" bgcolor="#FFFFFF" style="font-size:11px;color:#9a331b;padding-left:7px">» <%= attachment.getFileName() %> </td>
			                  <td width="12%" bgcolor="#FFFFFF" align="center"><p><a href="<%= themeDisplay.getPathMain() %>/vcms/download_attachment?attachmentId=<%= attachment.getAttachmentId() %>" target="_blank" class="green"><%= LanguageUtil.get(pageContext, "portlet.vcmsviewcontent.download-file") %></a></p></td>
			                </tr>
							<%}%>
						<%}%>
					<%}//END:for%>		
		       
		      </tbody>
		    </table>
		<%}else{%>
			<table width="96%" border="0" align="center" cellpadding="5" cellspacing="15" bgcolor="#FFFFFF" >
		      <tbody>
		        <tr>
		      		<td align="center" style="font-size:11px;color:#FF0000;" >
		      			<%= LanguageUtil.get(pageContext, "portlet.vcmsviewcontent.no-result") %>
		      		</td>
		      	</tr>	
		      </tbody>  
			</table>	  
		<%}%>		      	  
	    
	</div>

	<p><c:if test='<%= pages > 1 %>'><%//phan trang%>
		<table width="96%" border="0" align="center" cellpadding="5" cellspacing="1">
		  <tr>
			<td width="10%" bgcolor="#FFFFFF"  style="font-size:11px; color:#666666"><%= LanguageUtil.get(pageContext, "portlet.vcmsviewcontent.page") %>:</td>		
				<td bgcolor="#FFFFFF"><p style="font-size:11px;color:#2E9327">
				<% 	if(numberPage >1){
					int intPrev = numberPage-1;%>
					<a style="font-size:11px;color:#2E9327" href="#" onclick="self.location = '<portlet:renderURL windowState="<%=WindowState.NORMAL.toString() %>"> 
							<portlet:param name="struts_action" value="/vcmsviewcontent/view" />
							<portlet:param name="pagenum" value="<%= String.valueOf(intPrev) %>" />
							<portlet:param name="categoryId" value="<%= String.valueOf(categoryId) %>" />
							<portlet:param name="year" value="<%= String.valueOf(yearsearch) %>" />
							<portlet:param name="month" value="<%= String.valueOf(monthsearch) %>" />
							</portlet:renderURL>';" > &laquo; <%= LanguageUtil.get(pageContext, "portlet.vcmsviewcontent.previous") %></a>
				<%}%>
				
				<% for(int i = 1;i <= pages;i++){ %>
					<%if( i == numberPage ){%>
					<strong><a style="font-size:11px;color:#9a331b" href="#" onclick="self.location = '<portlet:renderURL windowState="<%=WindowState.NORMAL.toString() %>"> 
						<portlet:param name="struts_action" value="/vcmsviewcontent/view" />
						<portlet:param name="pagenum" value="<%= String.valueOf(i) %>" />
						<portlet:param name="categoryId" value="<%= String.valueOf(categoryId) %>" />
						<portlet:param name="year" value="<%= String.valueOf(yearsearch) %>" />
						<portlet:param name="month" value="<%= String.valueOf(monthsearch) %>" />
						</portlet:renderURL>';" > <%=i%></a></strong>
					<%}else{%>
				
					<strong><a style="font-size:11px;color:#2E9327" href="#" onclick="self.location = '<portlet:renderURL windowState="<%=WindowState.NORMAL.toString() %>"> 
						<portlet:param name="struts_action" value="/vcmsviewcontent/view" />
						<portlet:param name="pagenum" value="<%= String.valueOf(i) %>" />
						<portlet:param name="categoryId" value="<%= String.valueOf(categoryId) %>" />
						<portlet:param name="year" value="<%= String.valueOf(yearsearch) %>" />
						<portlet:param name="month" value="<%= String.valueOf(monthsearch) %>" />
						</portlet:renderURL>';" > <%=i%></a></strong>
					<%}%>	

				<% } %>
				
				<% 	if(numberPage < pages){
					int intNext = numberPage + 1;%>
					<a style="font-size:11px;color:#2E9327" href="#" onclick="self.location = '<portlet:renderURL windowState="<%=WindowState.NORMAL.toString() %>"> 
							<portlet:param name="struts_action" value="/vcmsviewcontent/view" />
							<portlet:param name="pagenum" value="<%= String.valueOf(intNext) %>" />
							<portlet:param name="categoryId" value="<%= String.valueOf(categoryId) %>" />
							<portlet:param name="year" value="<%= String.valueOf(yearsearch) %>" />
							<portlet:param name="month" value="<%= String.valueOf(monthsearch) %>" />
							</portlet:renderURL>';" > <%= LanguageUtil.get(pageContext, "portlet.vcmsviewcontent.next") %> &rsaquo;&rsaquo;</a></td>
				<%}%>
			</tr>
		</table>
	</c:if> </p>

</div>



