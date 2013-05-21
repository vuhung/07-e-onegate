	<%@page import="java.lang.reflect.Array"%>
<%@page import="com.vsi.edirectory.portlet.model.EDEmployee"%>
<div id="div_content">
		<table id="tb_content" style="border-style:none;">
			<tr id="tr_content">
				<td align="center">
					<span class="title_tenthutuc">Ho va ten</span>
				</td>
				<td align="center" style="width: 20%;">
					<span class="title_coquanthuchien">Phong ban</span>
				</td>
				<td align="center" style="width: 15%;">
					<span class="title_taive">Chuc vu</span>
				</td>
			</tr>
			
		<%List<EDDepartment> departmentAll = EDDepartmentLocalServiceUtil.getAllDepartment();
			List<EDEmployee> EdemployeeList = null;
			EDEmployee employee = null;
// 			List ListCopy = new ArrayList();
			if(depId==0 && name.equals(""))
			{
				for (int i=0;i<departmentAll.size();i++){
				EDDepartment department = (EDDepartment)departmentAll.get(i);		
							
				 EdemployeeList = EDEmployeeLocalServiceUtil.getByDepartmentId(department.getId());
					for(int j=0;j<EdemployeeList.size();j++){
					 employee = (EDEmployee)EdemployeeList.get(j);
					 List<EDFunctionEmployee> functionEmployeeList = EDFunctionEmployeeLocalServiceUtil.getByEmployeeId(employee.getId());
						EDFunctionEmployee functionEmployee = (EDFunctionEmployee)functionEmployeeList.get(0);
						EDFunction function = EDFunctionLocalServiceUtil.getEDFunction(functionEmployee.getFunctionId());
						%>
							<tr id="tr_content_01">
								<td><div style="margin:7px;" align="left"><span class="thutuc01"><%= employee.getName()%></span> </div></td>
								<td style="width: 20%"><div style="margin:7px;" align="left"><span class="coquanthuchien01"><%=department.getName()%></span></div></td>
								<td align="center" style="width: 15%"><div style="margin:7px;" align="left"><span class="coquanthuchien01"><%=function.getName()%></span></div></td>
								
							</tr>
						<%
					
						}
					}
			
			}
			if(depId==0 && !name.equals(""))
			{
				
						
				 EdemployeeList = EDEmployeeLocalServiceUtil.getByName(name);
					for(int j=0;j<EdemployeeList.size();j++){
					 employee = (EDEmployee)EdemployeeList.get(j);
						for (int i=0;i<departmentAll.size();i++){
							EDDepartment department = (EDDepartment)departmentAll.get(i);	
							if (employee.getDepartmentId() == department.getId()){
								 List<EDFunctionEmployee> functionEmployeeList = EDFunctionEmployeeLocalServiceUtil.getByEmployeeId(employee.getId());
									EDFunctionEmployee functionEmployee = (EDFunctionEmployee)functionEmployeeList.get(0);
									EDFunction function = EDFunctionLocalServiceUtil.getEDFunction(functionEmployee.getFunctionId());
						%>
							<tr id="tr_content_01">
								<td><div style="margin:7px;" align="left"><span class="thutuc01"><%= employee.getName()%></span> </div></td>
								<td style="width: 20%"><div style="margin:7px;" align="left"><span class="coquanthuchien01"><%=department.getName()%></span></div></td>
								<td align="center" style="width: 15%"><div style="margin:7px;" align="left"><span class="coquanthuchien01"><%=function.getName()%></span></div></td>
								
							</tr>
						<%
					
						}
						}
					}
			
			}
		
			if(depId!=0 && !name.equals(""))
			{	EDDepartment department = EDDepartmentLocalServiceUtil.getEDDepartment(depId);	
			employeeList = EDEmployeeLocalServiceUtil.getByDepartmentAndName(department.getId(), name);
				for(int i=0;i<employeeList.size();i++){
						 employee = (EDEmployee)employeeList.get(i);
						 List<EDFunctionEmployee> functionEmployeeList = EDFunctionEmployeeLocalServiceUtil.getByEmployeeId(employee.getId());
							EDFunctionEmployee functionEmployee = (EDFunctionEmployee)functionEmployeeList.get(0);
							EDFunction function = EDFunctionLocalServiceUtil.getEDFunction(functionEmployee.getFunctionId());
			%>
				<tr id="tr_content_01">
					<td ><div style="margin:7px;" align="left"><span class="thutuc01"><%= employee.getName() %></span> </div></td>
					<td style="width: 20%"><div style="margin:7px;" align="left"><span class="coquanthuchien01"><%= department.getName() %></span></div></td>
					<td align="center" style="width: 15%"><div style="margin:7px;" align="left"><span class="coquanthuchien01"><%=function.getName()%></span></div></td>
				</tr>
			<%} 
			}
			if(depId!=0 && name.equals(""))
			{	EDDepartment department = EDDepartmentLocalServiceUtil.getEDDepartment(depId);	
			employeeList = EDEmployeeLocalServiceUtil.getByDepartmentId(department.getId());
				for(int i=0;i<employeeList.size();i++){
						 employee = (EDEmployee)employeeList.get(i);
						 List<EDFunctionEmployee> functionEmployeeList = EDFunctionEmployeeLocalServiceUtil.getByEmployeeId(employee.getId());
							EDFunctionEmployee functionEmployee = (EDFunctionEmployee)functionEmployeeList.get(0);
							EDFunction function = EDFunctionLocalServiceUtil.getEDFunction(functionEmployee.getFunctionId());
			%>
				<tr id="tr_content_01">
					<td ><div style="margin:7px;" align="left"><span class="thutuc01"><%= employee.getName() %></span> </div></td>
					<td style="width: 20%"><div style="margin:7px;" align="left"><span class="coquanthuchien01"><%= department.getName() %></span></div></td>
					<td align="center" style="width: 15%"><div style="margin:7px;" align="left"><span class="coquanthuchien01"><%=function.getName()%></span></div></td>
				</tr>
			<%} 
			}
			%>

			
		</table>
	</div>