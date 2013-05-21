<%@page import="com.liferay.portal.kernel.util.ParamUtil"%>
<%@page import="com.liferay.portal.service.permission.PortletPermissionUtil"%>
<%@page import="com.liferay.portal.security.permission.PermissionChecker"%>
<%@page import="com.liferay.portal.kernel.language.LanguageUtil"%>
<%@page import="com.liferay.portal.kernel.language.UnicodeLanguageUtil" %>
<%@page import="com.liferay.portal.kernel.util.WebKeys"%>
<%@page import="com.liferay.portal.theme.ThemeDisplay"%>
<%@page import="com.vsi.edirectory.portlet.ActionUtil"%>
<%@page import="javax.portlet.PortletURL"%>
<%@page import="javax.portlet.ActionRequest"%>
<%@page import="java.util.List"%>
<%@page import="com.liferay.portal.kernel.util.ListUtil"%>

<%@page import="com.vsi.edirectory.portlet.service.EDEmployeeLocalServiceUtil"%>
<%@page import="com.vsi.edirectory.portlet.service.EDFunctionLocalServiceUtil"%>
<%@page import="com.vsi.edirectory.portlet.service.EDDepartmentLocalServiceUtil"%>
<%@page import="com.vsi.edirectory.portlet.model.EDEmployee"%>
<%@page import="com.vsi.edirectory.portlet.model.EDFunction"%>
<%@page import="com.vsi.edirectory.portlet.model.EDDepartment"%>
<%@page import="com.vsi.edirectory.portlet.service.EDFunctionLocalServiceUtil"%>

<%@ taglib uri="http://liferay.com/tld/aui" prefix="aui" %>
<%@ taglib uri="http://liferay.com/tld/ui" prefix="liferay-ui" %>
<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>
<%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c" %>
<%@ taglib uri="http://liferay.com/tld/theme" prefix="liferay-theme" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<portlet:defineObjects/>
<liferay-theme:defineObjects />

<portlet:actionURL name="deleteEmployee" var="deleteEmployeeURL"></portlet:actionURL>
<portlet:actionURL name="updateBranchPosition" var="updateBranchPositionURL"></portlet:actionURL>
<portlet:actionURL name="searchEmployee" var="searchEmployeeURL"></portlet:actionURL>
<script type="text/javascript">
function <portlet:namespace />submitdeleteEmployee() {
		submitForm(document.<portlet:namespace/>fm1, '<%= deleteEmployeeURL.toString() %>');
}
function <portlet:namespace />updateBranchPosition(selector){
	document.<portlet:namespace />fm1.<portlet:namespace />Selectposition.value = selector.value;
	submitForm(document.<portlet:namespace/>fm1, '<%=updateBranchPositionURL.toString() %>');
}

function <portlet:namespace />submitForm() {
	submitForm(document.<portlet:namespace/>fm, '<%=searchEmployeeURL.toString() %>');

}
</script>

<%
	List<EDDepartment> donviList = EDDepartmentLocalServiceUtil.getByParent(0);
	List<EDFunction> chucvuList = EDFunctionLocalServiceUtil.getAllFunction();
	int count = EDEmployeeLocalServiceUtil.getEDEmployeesCount();
	long departmentId = ParamUtil.getLong(request, "departmentId",0);
	long chucvuId = ParamUtil.getLong(request, "functionId",0);


%>



<portlet:renderURL  var="themCanBoURL">
	<portlet:param name="jspPage" value="/html/manage_edirectory/employee/add_employee.jsp"></portlet:param>
</portlet:renderURL>
<!-- <html> -->
<!-- <body> -->
<%-- 	<img alt="<%= request.getContextPath() %> %>" src="<%= request.getContextPath()+"/"+employeeTest.getImage() %>"/> --%>
<!-- </body> -->
<!-- </html> -->

<br/>
<aui:form name="fm" Method="post">
	<table>
  		<tr height="30">
    		<td width="160"><%= LanguageUtil.get(pageContext, "managecontacts.staff.view-select.agency") %> </td>
    		<td width="300"><select name="departmentId" style="width:200px" >
    				<option value="0">---&nbsp;<%= LanguageUtil.get(pageContext, "managecontacts.staff.view-select.all-agency") %> &nbsp;---</option>
    				<%for(EDDepartment donvi : donviList){ %>
    					<option value="<%= donvi.getId() %>" <%=(donvi.getId()==departmentId)? "selected=\"selected\"" : "" %>> <%= donvi.getName() %></option>
    					<% List<EDDepartment> donviCon = EDDepartmentLocalServiceUtil.getByParent(donvi.getId());
    						if(donviCon.size() >0)
    						for(EDDepartment donvi2 : donviCon) {%>
    							<option value="<%= donvi2.getId() %>" <%=(donvi2.getId()==departmentId)? "selected=\"selected\"" : "" %>> &nbsp;&nbsp;&nbsp;&nbsp;<%= donvi2.getName() %></option>
    					<%} %>
    				<%} %>    			
    			</select> 
    		</td>
    		<td></td>
  		</tr>
  		
  		<tr height="30">
  			<td><%= LanguageUtil.get(pageContext, "managecontacts.staff.view-select.position") %> </td>
  			<td><select name="functionId" style="width:200px" >
  					<option value="0">---&nbsp;<%= LanguageUtil.get(pageContext, "managecontacts.staff.view-select.position")%>&nbsp;--- </option>
  					<%for(EDFunction chucvu : chucvuList){ %>
  						<option value="<%= chucvu.getId() %>" <%=(chucvu.getId()==chucvuId)? "selected=\"selected\"" : "" %>> <%= chucvu.getName() %></option>			
  					<%} %>
  				</select> 
  			</td>
  			<td></td>
  		</tr>
  		
  		<tr height="30">
  			<td><%= LanguageUtil.get(pageContext, "managecontacts.staff.view-name.staff") %>  </td>
  			<td><aui:input name="name" label="" value="" type="text" size="40"/> </td>
  			<td><input name="" type="button" value='<%= LanguageUtil.get(pageContext, "managecontacts.staff.view-button.search")%>' onClick="<portlet:namespace/>check();"/> </td>
  		</tr>	
	</table>
</aui:form>
<br/><br/>

<c:if test='<%= PortletPermissionUtil.contains(permissionChecker, portletDisplay.getId(), "ADD_EMPLOYEE") %>' >
<input type="button" value='<%= LanguageUtil.get(pageContext, "managecontacts.staff.view-button.add.staff")%>' onClick="window.location.href='<%= themCanBoURL.toString() %>' "/>
</c:if>
<INPUT TYPE="BUTTON" VALUE='<%=LanguageUtil.get(pageContext, "managecontacts.staff.view-button.delete.staff")%>' ONCLICK="<portlet:namespace/>deleteEmployee();">

<aui:form name="fm1" Method="post">
<input name="<portlet:namespace />allRowIds" type="hidden" value="">
<input name="<portlet:namespace />docids" type="hidden" value="">
<input type="hidden" name="<portlet:namespace />Selectposition" value=""/>		

<br/><br/><br/>

<!-- Danh sách Cán bộ -->
<% 		List<EDEmployee> employeeListSearch = (List<EDEmployee>) request.getAttribute("employeeList");
%>

<br/><br/>
<%-- <portlet:renderURL var="renderTabEmployeeURL"> --%>
<%-- 	<portlet:param name="jspPage" value="/html/manage_edirectory/view.jsp?tab1=tab.danhba.canbo"/> --%>
<%-- </portlet:renderURL> --%>
<%
	PortletURL renderTabEmployeeURL = renderResponse.createRenderURL();
	renderTabEmployeeURL.setParameter("jspPage", "/html/manage_edirectory/view.jsp?tab1=tab.danhba.canbo");
%>

<liferay-ui:search-container emptyResultsMessage='<%=LanguageUtil.get(pageContext, "message.display.table") %>' delta="15" iteratorURL="<%= renderTabEmployeeURL %>">
	<liferay-ui:search-container-results>
		<%		
			results = EDEmployeeLocalServiceUtil.getAllEmployee();
			if(employeeListSearch != null ){
			results = ListUtil.subList(employeeListSearch, searchContainer.getStart(), searchContainer.getEnd());
			total = employeeListSearch.size();
			}
			pageContext.setAttribute("results", results);
			pageContext.setAttribute("total", total);
 		%>
	</liferay-ui:search-container-results>
	<liferay-ui:search-container-row className="com.vsi.edirectory.portlet.model.EDEmployee" keyProperty="id" modelVar="employee" rowVar="employeeId">
		<%	
	         String name1 = "<input type='checkbox' name='<portlet:namespace />allRowIds' onclick='Liferay.Util.checkAll(AUI().one(this).ancestor('table.taglib-search-iterator'), '<portlet:namespace/> allRowId', this);'/>";
	         String name="<input type='checkbox'  onclick=\"Liferay.Util.checkAll(AUI().one(this).ancestor('table.taglib-search-iterator'), '<portlet:namespace />allRowIds', this);\" />";
	         String input="<input type='checkbox' name='<portlet:namespace />allRowIds' value='"+employee.getId()+"'/>";	       
		%>
		<liferay-ui:search-container-column-text name="<%=name %>" value="<%=input %>" />
		<liferay-ui:search-container-column-text name='<%= LanguageUtil.get(pageContext, "managecontacts.staff.view-title.table.staff") %>' property="name"/>
		<liferay-ui:search-container-column-text name='<%= LanguageUtil.get(pageContext, "managecontacts.staff.view-title.table.agency") %>' value= "<%= EDDepartmentLocalServiceUtil.getEDDepartment(employee.getDepartmentId()).getName() %>"  />
		<liferay-ui:search-container-column-text name='<%= LanguageUtil.get(pageContext, "managecontacts.staff.view-title.table.level") %>' >
			<select id="SelectPosition" name="SelectPosition" onchange="javascript:<portlet:namespace />updateBranchPosition(this)" >
				<% EDEmployee employeeid = EDEmployeeLocalServiceUtil.getEDEmployee(Long.valueOf(employee.getPrimaryKey()));
				List<EDEmployee> listEmployee = EDEmployeeLocalServiceUtil.getByDepartmentId(employeeid.getDepartmentId());
				for(int j = 0; j < listEmployee.size(); j++) {  %> 
					<option value='<%=j + "|" + employeeid.getId()%>' <%=(j==employeeid.getDisplayOrder()) ? "selected=\"selected\"" : "" %>><%=j %></option>
				<% } %> 
				
			</select> 
			</liferay-ui:search-container-column-text>
		<liferay-ui:search-container-column-jsp	path="/html/manage_edirectory/employee/actions_employee.jsp" align="right" />
	</liferay-ui:search-container-row>
	<liferay-ui:search-iterator searchContainer="<%= searchContainer %>" />
</liferay-ui:search-container>
</aui:form>

<aui:script >
	Liferay.provide(
		window,
		'<portlet:namespace />deleteEmployee',
		function() {
		
		document.<portlet:namespace />fm1.<portlet:namespace />allRowIds.value = Liferay.Util.listCheckedExcept(document.<portlet:namespace />fm1, "allRowIds");
		
		if(document.<portlet:namespace />fm1.<portlet:namespace />allRowIds.value.length>0)
		{
			if (confirm('<%= LanguageUtil.get(pageContext, "are-you-want-to-delete-staff","aaabbb") %>')) {
			
		        document.<portlet:namespace />fm1.<portlet:namespace />allRowIds.value = Liferay.Util.listCheckedExcept(document.<portlet:namespace />fm1, "allRowIds");
		    
				<portlet:namespace/>submitdeleteEmployee();
			}
		}	else{
			alert('<%= LanguageUtil.get(pageContext, "you-must-select-log-to-delete","bbb") %>');
			}
		},
		['liferay-util-list-fields']
	);
		Liferay.provide(
		window,
		'<portlet:namespace />check',
		function() {
		
		
			<portlet:namespace />submitForm();
		},
		['liferay-util-list-fields']
	);
</aui:script>
  				
  	
<%-- <portlet:actionURL name="searchEmployeeByParams" var="searchEmployeeURL"/> --%>

<%-- <form method="post" name="fm" action="<%= searchEmployeeURL %>"> --%>
<!-- 	<input type="submit" value="Tim kiem"/> -->
<!-- </form>					 -->
  				
  				
  				
  				
  				
  				
  				
  				
  				
  				
  				
  				
  				
  				