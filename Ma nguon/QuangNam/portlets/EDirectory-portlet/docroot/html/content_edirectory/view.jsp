<%@page import="com.vsi.edirectory.portlet.service.EDFunctionServiceUtil"%>
<%@page import="com.vsi.edirectory.portlet.model.EDFunctionEmployee"%>
<%@page import="java.util.ArrayList"%>
<%@page import="com.vsi.edirectory.portlet.service.EDFunctionEmployeeLocalServiceUtil"%>
<%@page import="com.liferay.portal.kernel.language.LanguageUtil" %>
<%@page import="com.vsi.edirectory.portlet.model.impl.EDDepartmentImpl" %>
<%@page import="com.vsi.edirectory.portlet.service.EDEmployeeLocalServiceUtil" %>
<%@taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>
<%@page contentType="text/html" pageEncoding="UTF-8" %>
<%@include file="/init.jsp" %>
<%@include file="/html/content_edirectory/css.jsp" %>

<%

		String language = ParamUtil.getString(request, "language", "en_US");
		long groupId = ParamUtil.getLong(request, "groupId", portletGroupId.longValue());
		
		/* Tim kiem Doc */
		PortletURL searchURL = renderResponse.createRenderURL();
		searchURL.setParameter("jspPage","/html/content_edirectory/view.jsp");
		
		PortletPreferences prefs = renderRequest.getPreferences();
		
		String titlePortlet = prefs.getValue("titlePortlet", "Danh b&#7841; &#273;i&#7879;n t&#7917;");
		String themeType = prefs.getValue("themeType","1");
		String themeSelected = prefs.getValue("themeSelected","");
		int numberItem = GetterUtil.getInteger(prefs.getValue("numberItem",""), 10);
		boolean showPortletBorders = GetterUtil.getBoolean(prefs.getValue("show-portlet-borders", "true"));		
		String style = prefs.getValue("style", "default");
		long depId = ParamUtil.getLong(request, "depId");
		String name = ParamUtil.getString(request, "name", StringPool.BLANK);
		
		List<EDDepartment> departmentList = EDDepartmentLocalServiceUtil.getByParent(0);
		// lay danh sach phong ban con
		List<EDDepartment> departmentListChild = EDDepartmentLocalServiceUtil.getByParent(1);
	

	
		int total = 0;
		total = EDEmployeeLocalServiceUtil.searchEmployeeByParams(groupId, language, depId, name).size();
		int numberPage = 1;
		int per = numberItem;
		int pages = 0	;
		int currentPage = ParamUtil.getInteger(request, "pagenum", 1);
		
		pages = (total % per == 0) ? total / per : total / per + 1;
		int begin = per * (currentPage - 1);
		int end = (total>per * currentPage) ? per * currentPage : total;
	
		List<EDEmployee> employeeList = new ArrayList<EDEmployee>();
		employeeList = EDEmployeeLocalServiceUtil.searchEmployeeByParams(groupId, language, depId, name);

%>

<script type="text/javascript">		
	function <portlet:namespace />doSearchDocuments() {
		submitForm(document.<portlet:namespace />fm, '<%=searchURL%>');
	}
</script>

<portlet:renderURL var="searchDoc">
	<portlet:param name="jspPage" value="/html/content_edirectory/view.jsp"/>
</portlet:renderURL>


<div id="div_title"><p id="<portlet:namespace/>titleportlet" name="<portlet:namespace/>titlePortlet"><%=(titlePortlet.equals("")) ? LanguageUtil.get(pageContext, "portlet.vdoc.view.title") : titlePortlet.toString() %></p></div>

<form name="<portlet:namespace />fm" Method="post">
	<div  id="search_page_level2_administrative_procedures">
	
		<div id="left_level2_administrative_procedures">
			<p class="select_org"><%= LanguageUtil.get(pageContext, "portlet.vdoc.view.select-org") %></p>
			<select name="<portlet:namespace />depId" class="option_org" onchange="<portlet:namespace />submitForm();">
				<option value="0">---<liferay-ui:message key="all" />---</option>
				<%for(EDDepartment dep : departmentList){ %>
				<option value="<%= dep.getId() %>" <%= dep.getId() == depId ? "selected" : "" %>> <%= dep.getName() %> </option>
					<%	List<EDDepartment> subDepList = EDDepartmentLocalServiceUtil.getByParent(dep.getId());
  					if(subDepList.size() > 0)
  					for(EDDepartment dep2 : subDepList){
					%>
						<option value="<%= dep2.getId() %>" <%= dep2.getId() == depId ? "selected" : "" %> >&nbsp;&nbsp;&nbsp;&nbsp;<%= dep2.getName() %> </option>
					<%} %>
				<%} %>
				
			</select>
		</div>
		<div id="right_level2_administrative_procedures">
			<p class="name_doc"><%= LanguageUtil.get(pageContext, "portlet.vdoc.view.name-doc") %></p>
			<input type="text" class="text_name_doc" name="<portlet:namespace/>name" value="<%= name %>" />
			<input type="button" value="Tim kiem" style="margin-left: 10px" class="search_button"
				onclick="<portlet:namespace />submitForm();">
		</div>
	</div>
</form>

<form>
<c:if test="<%=style.equals(\"default\") %>">
 <%@ include file="/html/content_edirectory/includes/default.jsp" %>
</c:if>
<c:if test="<%=style.equals(\"style1\") %>">
 <%@ include file="/html/content_edirectory/includes/style1.jsp" %>
</c:if>

	<!-- List Doc -->
<!-- 	<div id="div_content"> -->
<!-- 		<table id="tb_content" style="border-style:none;"> -->
<!-- 			<tr id="tr_content"> -->
<!-- 				<td align="center"> -->
<!-- 					<span class="title_tenthutuc">Ho va ten</span> -->
<!-- 				</td> -->
<!-- 				<td align="center" style="width: 20%;"> -->
<!-- 					<span class="title_coquanthuchien">Dien thoai</span> -->
<!-- 				</td> -->
<!-- 				<td align="center" style="width: 15%;"> -->
<!-- 					<span class="title_taive">Dia chi</span> -->
<!-- 				</td> -->
<!-- 			</tr> -->
			
<%-- 			<%	 --%>
<!-- // 				for(int i=0;i<employeeList.size();i++){ -->
<!-- // 						EDEmployee employee = (EDEmployee)employeeList.get(i);	 -->
<%-- 			%> --%>
<!-- 				<tr id="tr_content_01"> -->
<%-- 					<td ><div style="margin:7px;" align="left"><span class="thutuc01"><%= employee.getName() %></span> </div></td> --%>
<%-- 					<td style="width: 20%"><div style="margin:7px;" align="left"><span class="coquanthuchien01"><%= employee.getMobilePhone() %></span></div></td> --%>
<%-- 					<td align="center" style="width: 15%"><div style="margin:7px;" align="left"><span class="coquanthuchien01"><%= employee.getHomeSide() %></span></div></td> --%>
<!-- 				</tr> -->
<%-- 			<%} %> --%>
<!-- 		</table> -->
<!-- 	</div> -->

	
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
									if(Validator.isNotNull(name))
									{ 
									%>
										<liferay-portlet:param name= "name" value= "<%= name %>"  />  
									<%
									} 
									if(Validator.isNotNull(depId))
									{%>
										<liferay-portlet:param name= "depId" value= "<%= String.valueOf(depId)%>"  />
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
									if(Validator.isNotNull(name))
									{ 
									%>
										<liferay-portlet:param name= "name" value= "<%= name %>"  />  
									<%
									} 
									if(Validator.isNotNull(depId))
									{%>
										<liferay-portlet:param name= "depId" value= "<%= String.valueOf(depId)%>"  />
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
									if(Validator.isNotNull(name))
									{ 
									%>
										<liferay-portlet:param name= "name" value= "<%= name %>"  />  
									<%
									} 
									if(Validator.isNotNull(depId))
									{%>
										<liferay-portlet:param name= "depId" value= "<%= String.valueOf(depId)%>"  />
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
									if(Validator.isNotNull(name))
									{ 
									%>
										<liferay-portlet:param name= "name" value= "<%= name %>"  />  
									<%
									} 
									if(Validator.isNotNull(depId))
									{%>
										<liferay-portlet:param name= "depId" value= "<%= String.valueOf(depId) %>"  />
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
