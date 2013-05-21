<%@ page import="java.util.ArrayList"%>
<%@ include file="/html/vdocview/init.jsp" %>
<%@ include file="/html/vdocview/css.jsp" %>


<%
	/* Xem chi tiet Doc*/
	PortletURL viewURL = renderResponse.createRenderURL();
	viewURL.setParameter("jspPage", "/html/vdocview/view_doc_detail.jsp");

	/* Tim kiem Doc */
	PortletURL searchURL = renderResponse.createRenderURL();
	searchURL.setParameter("jspPage","/html/vdocview/view.jsp");

	String fieldId = ParamUtil.getString(request,"fieldId",StringPool.BLANK);
	String orgId = ParamUtil.getString(request,"orgId",StringPool.BLANK);
	String keywords = ParamUtil.getString(request,"keywords",StringPool.BLANK);
	
	String searchFlag = renderRequest.getParameter("cmd-sesarchdoc-flag");
	int styleOrder = ParamUtil.getInteger(request,"styleOrder",3);
	
	List<vdocDocument> listDoc = new ArrayList<vdocDocument>();
	
	int total = 0;
	total = vdocDocumentLocalServiceUtil.searchDocument(groupId, language, "", orgId, keywords, 2).size();
	int currentPage = ParamUtil.getInteger(request, "currentPage", 1);
	int itemPerPage = numberItem;
	int pages = (total % itemPerPage == 0) ? total / itemPerPage : total / itemPerPage + 1;
	int begin = itemPerPage * (currentPage - 1);
	int end = (total>itemPerPage * currentPage) ? itemPerPage * currentPage : total;
	int beginNextPage = end;
	int endNextPage = ((end+itemPerPage) >=total)?total:end+itemPerPage;
	
	listDoc = vdocDocumentLocalServiceUtil.searchDocument(groupId, language, "", orgId, keywords, 2);
%>
<script type="text/javascript">		
	function <portlet:namespace />doSearchDocuments() {
		submitForm(document.<portlet:namespace />fm, '<%=searchURL%>');
	}
</script>

<portlet:renderURL var="searchDoc">
	<portlet:param name="jspPage" value="/html/vdocview/view.jsp"/>
</portlet:renderURL>


<div id="div_title"><p><%= LanguageUtil.get(pageContext, "portlet.vdoc.view.title") %></p></div>

<form name="<portlet:namespace />fm" Method="post">
	<div  id="search_page_level2_administrative_procedures">
		<div id="left_level2_administrative_procedures">
			<p class="select_org"><%= LanguageUtil.get(pageContext, "portlet.vdoc.view.select-org") %></p>
			<select name="<portlet:namespace />orgId" class="option_org" onchange="<portlet:namespace />submitForm();">
				<option value="0">---<liferay-ui:message key="all" />---</option>
				<%			
					out.println(ActionUtil.getOrgTree(groupId,language,orgId,orgId));
				%>
			</select>
		</div>
		<div id="right_level2_administrative_procedures">
			<p class="name_doc"><%= LanguageUtil.get(pageContext, "portlet.vdoc.view.name-doc") %></p>
			<input type="text" class="text_name_doc" name="<portlet:namespace/>keywords" value="<%= keywords %>" />
			<input type="button" value="Tim kiem" style="margin-left: 10px" class="search_button"
				onclick="<portlet:namespace />submitForm();">
		</div>
	</div>
</form>

<form>
	<!-- List Doc -->
	<div id="div_content">
		<table id="tb_content" style="border-style:none;">
			<tr id="tr_content">
				<td align="center">
					<span class="title_tenthutuc">Ten thu tuc</span>
				</td>
				<td align="center" style="width: 20%;">
					<span class="title_coquanthuchien">Co quan thuc hien</span>
				</td>
				<td align="center" style="width: 15%;">
					<span class="title_taive">Tai ve</span>
				</td>
			</tr>
			
			<%	
				for(int i=0;i<listDoc.size();i++){
						vdocDocument doc = (vdocDocument)listDoc.get(i);
					
						viewURL.setParameter("docId",doc.getDocId());
						if(Validator.isNotNull(fieldId)){		
								viewURL.setParameter("fieldId",fieldId);
						}
						if(Validator.isNotNull(orgId)){		
								viewURL.setParameter("orgId",orgId);
						}
						
			%>
				<tr id="tr_content_01">
					<td ><div style="margin:7px;" align="left"><span class="thutuc01"><a href="<%=viewURL%>">&nbsp;<%=doc.getTitle()%></a></span> </div></td>
					<td style="width: 20%"><div style="margin:7px;" align="left"><span class="coquanthuchien01"><%= doc.getOrgRels() %></span></div></td>
					<td align="center" style="width: 15%"></td>
				</tr>
			<%} %>
		</table>
	</div>
	
	<!-- Phan trang -->
	<div style="width: 100%;">
		<table style="width: 100%;">
			<tr style="width: 100%;">
				<td style="float: right;">
				
				</td>
				<td style="text-align: center;">
					<strong>
						<%= begin %>-<%= end %>
					</strong>
					<strong>| <%= total %> |</strong>
					<strong>&nbsp;&nbsp;&nbsp;Trang&nbsp;&nbsp;&nbsp;</strong>
					<%
						if(currentPage > 1){
							int intPrev = currentPage - 1;
					%>
					<span>	
						<a class="phantrang" href="<liferay-portlet:renderURL > 
									<liferay-portlet:param name= "pagenum" value= "<%= String.valueOf(intPrev) %>"  />  
									<liferay-portlet:param name= "jspPage" value= "/html/content_edirectory/view.jsp"  />
									<%
									if(Validator.isNotNull(keywords))
									{ 
									%>
										<liferay-portlet:param name= "keywords" value= "<%= keywords %>"  />  
									<%
									} 
									if(Validator.isNotNull(orgId))
									{%>
										<liferay-portlet:param name= "orgId" value= "<%= orgId %>"  />
									<%
									}
									if(Validator.isNotNull(fieldId))
									{
									%>
										  <liferay-portlet:param name= "fieldId" value= "<%= fieldId %>"  />
									<%
									} 
									%>
						  		</liferay-portlet:renderURL>" > &lsaquo;&lsaquo; Truoc</a>
					</span>					
					<%
						} 
					%>
					<%
						for(int i = 1; i <= currentPage; i++)
						{
							if(i == currentPage)
							{
					%>
							<strong>	
							<a class="phantrang" href="<liferay-portlet:renderURL > 
									<liferay-portlet:param name= "pagenum" value= "<%= String.valueOf(i) %>"  />  
									<liferay-portlet:param name= "jspPage" value= "/html/content_edirectory/view.jsp"  />
									<%
									if(Validator.isNotNull(keywords))
									{ 
									%>
										<liferay-portlet:param name= "keywords" value= "<%= keywords %>"  />  
									<%
									} 
									if(Validator.isNotNull(orgId))
									{%>
										<liferay-portlet:param name= "orgId" value= "<%= orgId %>"  />
									<%
									}
									if(Validator.isNotNull(fieldId))
									{
									%>
										  <liferay-portlet:param name= "fieldId" value= "<%= fieldId %>"  />
									<%
									} 
									%>
						  		</liferay-portlet:renderURL>" ><%= i %></a>
						</strong>
						<%
							}
							else
							{
						%>
						<strong>	
							<a class="phantrang" href="<liferay-portlet:renderURL > 
									<liferay-portlet:param name= "pagenum" value= "<%= String.valueOf(i) %>"  />  
									<liferay-portlet:param name= "jspPage" value= "/html/content_edirectory/view.jsp"  />
									<%
									if(Validator.isNotNull(keywords))
									{ 
									%>
										<liferay-portlet:param name= "keywords" value= "<%= keywords %>"  />  
									<%
									} 
									if(Validator.isNotNull(orgId))
									{%>
										<liferay-portlet:param name= "orgId" value= "<%= orgId %>"  />
									<%
									}
									if(Validator.isNotNull(fieldId))
									{
									%>
										  <liferay-portlet:param name= "fieldId" value= "<%= fieldId %>"  />
									<%
									} 
									%>
						  		</liferay-portlet:renderURL>" ><%= i %></a>
						</strong>
						<%
							}
						}
						%>
						<%
							if(currentPage < pages)
							{
								int intNext = currentPage + 1;
						%>
						 <span>	
							<a class="phantrang" href="<liferay-portlet:renderURL > 
									<liferay-portlet:param name= "pagenum" value= "<%= String.valueOf(intNext) %>"  />  
									<liferay-portlet:param name= "jspPage" value= "/html/content_edirectory/view.jsp"  />
									<%
									if(Validator.isNotNull(keywords))
									{ 
									%>
										<liferay-portlet:param name= "keywords" value= "<%= keywords %>"  />  
									<%
									} 
									if(Validator.isNotNull(orgId))
									{%>
										<liferay-portlet:param name= "orgId" value= "<%= orgId %>"  />
									<%
									}
									if(Validator.isNotNull(fieldId))
									{
									%>
										  <liferay-portlet:param name= "fieldId" value= "<%= fieldId %>"  />
									<%
									} 
									%>
						  		</liferay-portlet:renderURL>" > Sau &rsaquo;&rsaquo;</a>
						</span>	
						<%
							}
						%> 
				</td>
				<td style="float: left;">
						
				</td>
			</tr>
		</table>
	</div>
	
</form>

<script language ="javascript">		
	function <portlet:namespace/>submitForm(){
		var myform = document.<portlet:namespace />fm;
		myform.action="<%= searchURL.toString() %>";
		myform.submit();
	}
</script>	








