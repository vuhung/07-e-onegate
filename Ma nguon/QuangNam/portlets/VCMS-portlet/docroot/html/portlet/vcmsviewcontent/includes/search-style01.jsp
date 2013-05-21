<link href="/html/portlet/vcmsviewcontent/includes/css/common.css" rel="stylesheet" type="text/css" />	 

<%
	//Begin get the parameters of search article. Initial date values
	Calendar currentDate = new GregorianCalendar();
	int curYear = currentDate.get(Calendar.YEAR);
	int curMonth = currentDate.get(Calendar.MONTH);
	int curDay = currentDate.get(Calendar.DATE);
	
	String title = ParamUtil.getString(request, "title", "");//title
	int yearsearch = ParamUtil.getInteger(request, "year", -1);//curYear
	int monthsearch = ParamUtil.getInteger(request, "month", -1);//curMonth + 1

	PortletURL formAction = renderResponse.createActionURL();
	formAction.setParameter("struts_action", "/vcmsviewcontent/view");
%>
<script language="javascript">
	function <portlet:namespace />submitForm() {
		var fm = document.<portlet:namespace />fm;
		fm.action="<%= formAction.toString() %>";
		fm.method="post";
		fm.submit();
	}
</script>
	
<form action="<portlet:actionURL><portlet:param name="struts_action" value="/vcmsviewcontent/view" />
	</portlet:actionURL>" method="post" name="<portlet:namespace />fm" enctype="multipart/form-data" >
	<input name="<portlet:namespace /><%=ConstantsExt.CATEGORY_ID%>" type="hidden" value="<%= categoryId %>">

    <p class="bg_tit_c"><a class="icon_tit_c bold">Tin M&#7899;i Nh&#7845;t</a><a class="date"><%=dateFormatDateTime.format(new Date())%></a></p>
	<p class="tit_news"><a class="icon_news_fo">Tìm ki&#7871;m</a></p>
    <div class="box_new_hot_c">
        <p>
 	    	<table>
				<tr><%//Tim gan dung trong title%>
					<td width="28%">Tiêu &#273;&#7873; ch&#7913;a t&#7915;/c&#7909;m t&#7915;:</td>
					<td><input type="text"  style="padding:0 0 0 3px; width:150px; " id="<portlet:namespace />title" name="<portlet:namespace />title" value="<%=title%>" /></td>
				</tr>	
				
				<tr>
					<td width="28%">N&#259;m xu&#7845;t b&#7843;n:</td>
					<td><select name="year" id="year" class="txt" onchange="" >
							<option value="-1" >N&#259;m</option>
							<%for(int i=(curYear-10); i < (curYear+10); i++){ %>
								<option value="<%= i %>"> <%= i %></option>
						  	<%
							}
							%>
						</select></td>
				</tr>	
				<tr>
					<td width="28%" >Tháng:</td>
					<td><select name="month" id="month" class="txt" onchange="" >
							<option value="-1" >Tháng</option>
							<%for(int i=1; i <= 12; i++){ %>
								<option value="<%= i %>"> <%= i %></option>
						  	<%
							}
							%>
						</select></td>
				</tr>
				<tr>
					<td width="28%" >&nbsp;</td><td>&nbsp;</td>
				</tr>				
				<tr>
					<td width="28%">&nbsp;</td><td><input type="button" style="font-size:11px; height:22px; cursor:pointer"  value="Tìm ki&#7871;m" onclick="<portlet:namespace />submitForm()" ></td>
				</tr>	
			</table>
	    </p>	

        <p class="clear"></p>
        	
    </div>
	<p class="tit_news"><a class="icon_news_fo">K&#7871;t qu&#7843; tìm ki&#7871;m</a></p>
	<%
		VcmsArticle lastArticle = null;	
		List articlesByCat = new ArrayList();
		List articlesByCat1 = new ArrayList();
		VcmsCategory category = null;
			
		Date fromDate = null;
		Date toDate = null;
		if(Validator.isNotNull(categoryId)){
			if(yearsearch != -1) {
				if(monthsearch != -1) {
					fromDate = new GregorianCalendar(yearsearch, (monthsearch-1), 1).getTime();//thang can tim - 1
					toDate = new GregorianCalendar(yearsearch, (monthsearch-1), 31).getTime();
				}else{
					fromDate = new GregorianCalendar(yearsearch, 0, 1).getTime();//thang can tim - 1
					toDate = new GregorianCalendar(yearsearch, 11, 31).getTime();
				}
				articlesByCat = VcmsArticleServiceUtil.getBySearchAdvance(groupId, language, null, categoryId, fromDate, toDate, numberArticlesInCat);
			}else{
				articlesByCat = (List)VcmsArticleServiceUtil.getBySearchAdvance(groupId , language , null, categoryId, fromDate, toDate, numberArticlesInCat);
			}
		}else{
			System.out.println("-----------------Truong hop khong xet Category!");
			if(yearsearch != -1) {
				if(monthsearch != -1) {
					fromDate = new GregorianCalendar(yearsearch, (monthsearch-1), 1).getTime();//thang can tim - 1
					toDate = new GregorianCalendar(yearsearch, (monthsearch-1), 31).getTime();
				}else{
					fromDate = new GregorianCalendar(yearsearch, 0, 1).getTime();//thang can tim - 1
					toDate = new GregorianCalendar(yearsearch, 11, 31).getTime();
				}
				articlesByCat = VcmsArticleServiceUtil.getBySearchAdvance(groupId, language, title, null, fromDate, toDate, numberArticlesInCat );
			}else{
				System.out.println("-----------------thang nam null!");
				articlesByCat = VcmsArticleServiceUtil.getBySearchAdvance(groupId, language, title, null, null, null, numberArticlesInCat );
			}	
		}
		
		//if(articlesByCat != null && articlesByCat.size()>0){
	%>	
    <div style="padding:10px;" class="box_news_old">
    <%
	for (int j = 0; j < articlesByCat.size(); j++) {
		VcmsArticle article = (VcmsArticle)articlesByCat.get(j);
		
		
		String artId = "";
		String cateId = "";
		//VcmsArticle article = VcmsArticleServiceUtil.getArticle(articleId);
		List relationList = VcmsCARelationServiceUtil.getRelationsByArticle(article.getArticleId());
		VcmsCARelation relation = null;
		if((relationList != null) && (relationList.size()>0)){
			relation = (VcmsCARelation)relationList.get(0);
			cateId = relation.getCategoryId();
		}
		
		PortletURL articleURL;
		articleURL = new PortletURLImpl(request,portletSelectId, plId, false);
		articleURL.setParameter("struts_action", "/vcmsviewcontent/view");
		articleURL.setParameter("articleId", article.getArticleId());
		articleURL.setParameter("categoryId", cateId);
%>
    <p><a href="<%= articleURL %>" class="green"> >><%= article.getTitle() %> </a><a style="font-size:10px;color:#9a331b">(<%=dateFormatDateTime.format(article.getPublishedDate())%>)</a> </p>
	<p class="clear"></p>

<%
		}
	//}
%>
    </div>
	<br/><br/>
</form>
