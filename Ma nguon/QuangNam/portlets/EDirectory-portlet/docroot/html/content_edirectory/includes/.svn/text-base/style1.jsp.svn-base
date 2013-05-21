<%@page import="com.vsi.edirectory.portlet.model.EDEmployee"%>
<%@page import="com.vsi.edirectory.portlet.service.EDFunctionEmployeeLocalServiceUtil"%>

<div id="hienthi">
	<table>
<!-- 	lay nguoi dung dau -->
		
	<%			if(depId==0 && name.equals("")){long test=0;
				List<EDDepartment> ListDepartment = EDDepartmentLocalServiceUtil.getAllDepartment();
				for (int i=0;i<ListDepartment.size();i++){
					EDDepartment edepartment = (EDDepartment)ListDepartment.get(i);
					List<EDEmployee> ListEmployee = EDEmployeeLocalServiceUtil.getByDepartmentId(edepartment.getId());
				
						if(ListEmployee.size()>0){
						EDEmployee employee = (EDEmployee)ListEmployee.get(0);
						
						if(edepartment.getParent()==0 && employee.getDisplayOrder()==0){
							EDDepartment department =	EDDepartmentLocalServiceUtil.getEDDepartment(employee.getDepartmentId());
							List<EDFunctionEmployee> functionEmployeeList = EDFunctionEmployeeLocalServiceUtil.getByEmployeeId(employee.getId());
							EDFunctionEmployee functionEmployee = (EDFunctionEmployee)functionEmployeeList.get(0);
							EDFunction function = EDFunctionLocalServiceUtil.getEDFunction(functionEmployee.getFunctionId());
						test = employee.getId();%><tr align="center">
					<td align="center" colspan="2"><%=employee.getName()%>
					<br/>
					<%=department.getName() %>
					<br/>
					<%=function.getName()%>
					<br/>
					<img width="50%"  src="<%=themeDisplay.getPathImage()%>/EDirectory-portlet?img_id=<%= employee.getImage() %>" name="<%= employee.getImage() %>">
					<br/>
					</td>
				</tr>

				<% }}%><tr><% int k=0;for(int j=0;j<ListEmployee.size();j++){
					
					EDEmployee employee = (EDEmployee)ListEmployee.get(k);
					if(test==employee.getId()){}
					else
					{	EDDepartment department =	EDDepartmentLocalServiceUtil.getEDDepartment(employee.getDepartmentId());
						List<EDFunctionEmployee> functionEmployeeList = EDFunctionEmployeeLocalServiceUtil.getByEmployeeId(employee.getId());
						EDFunctionEmployee functionEmployee = (EDFunctionEmployee)functionEmployeeList.get(0);
						EDFunction function = EDFunctionLocalServiceUtil.getEDFunction(functionEmployee.getFunctionId());
				%>
					
					<td align="center" width="50%" height="400"><%=employee.getName()%>
					<br/>
					<%=department.getName() %>
					<br/>
					<%=function.getName() %>
					<br/>
					<img width="80%" height="300" src="<%=themeDisplay.getPathImage()%>/EDirectory-portlet?img_id=<%= employee.getImage() %>" name="<%= employee.getImage() %>">
					<br/>
					</td>
					<%}k=k+1;if(k<ListEmployee.size()){
						 employee = (EDEmployee)ListEmployee.get(k);
						EDDepartment department =	EDDepartmentLocalServiceUtil.getEDDepartment(employee.getDepartmentId());
						 List<EDFunctionEmployee> functionEmployeeList = EDFunctionEmployeeLocalServiceUtil.getByEmployeeId(employee.getId());
							EDFunctionEmployee functionEmployee = (EDFunctionEmployee)functionEmployeeList.get(0);
							EDFunction function = EDFunctionLocalServiceUtil.getEDFunction(functionEmployee.getFunctionId());
					k=k+1;%>	
					<td align="center" width="50%" height="400">
					<%=employee.getName()%>
					<br/>
					<%=department.getName() %>
					<br/>
					<%=function.getName()%>
					<br/>
					<img width="80%" height="300" src="<%=themeDisplay.getPathImage()%>/EDirectory-portlet?img_id=<%= employee.getImage() %>" name="<%= employee.getImage() %>">
					<br/>
					</td>
					<% }else{break;}
					}}}
	if(depId==0 && !name.equals("")){
		long test =0;
		List<EDEmployee> EdemployeeList = EDEmployeeLocalServiceUtil.getByName(name);
		int k=0;
		for(int i=1;i<EdemployeeList.size();i++){
			EDEmployee employee = (EDEmployee)EdemployeeList.get(k);
		EDDepartment department =	EDDepartmentLocalServiceUtil.getEDDepartment(employee.getDepartmentId());
			 List<EDFunctionEmployee> functionEmployeeList = EDFunctionEmployeeLocalServiceUtil.getByEmployeeId(employee.getId());
				EDFunctionEmployee functionEmployee = (EDFunctionEmployee)functionEmployeeList.get(0);
				EDFunction function = EDFunctionLocalServiceUtil.getEDFunction(functionEmployee.getFunctionId());
			k=k+1;%>
			<tr>
				
				<td align="center" width="50%" height="400"><br/>
				<%=employee.getName()%>
				<br/>
				<%=department.getName() %>
				<br/>
				<%=function.getName() %>
				
				<br/>
				<img width="80%" height="300" src="<%=themeDisplay.getPathImage()%>/EDirectory-portlet?img_id=<%= employee.getImage() %>" name="<%= employee.getImage() %>">
				<br/>
				</td>
				<% if(k<EdemployeeList.size()){
					 employee = (EDEmployee)EdemployeeList.get(k);
					 department =	EDDepartmentLocalServiceUtil.getEDDepartment(employee.getDepartmentId());
					 functionEmployeeList = EDFunctionEmployeeLocalServiceUtil.getByEmployeeId(employee.getId());
					 functionEmployee = (EDFunctionEmployee)functionEmployeeList.get(0);
					 function = EDFunctionLocalServiceUtil.getEDFunction(functionEmployee.getFunctionId());
				%>
				<td align="center" width="50%" height="400"><br/>
				<%=employee.getName()%>
				<br/>
				<%=department.getName() %>
				<br/>
				<%=function.getName() %>
				
				<br/>
				
				<img width="80%" height="300" src="<%=themeDisplay.getPathImage()%>/EDirectory-portlet?img_id=<%= employee.getImage() %>" name="<%= employee.getImage() %>">
				<br/>
				</td>
				<%k=k+1; }else{break;}%>
			</tr>
		<%}
	}
	if(depId!=0 && !name.equals("")){
		EDDepartment department = EDDepartmentLocalServiceUtil.getEDDepartment(depId);	
		List<EDEmployee> EdemployeeList = EDEmployeeLocalServiceUtil.getByDepartmentAndName(department.getId(), name);
		int k=0;
		for(int i=0;i<EdemployeeList.size();i++){
			EDEmployee employee = (EDEmployee)EdemployeeList.get(k);
			 List<EDFunctionEmployee> functionEmployeeList = EDFunctionEmployeeLocalServiceUtil.getByEmployeeId(employee.getId());
				EDFunctionEmployee functionEmployee = (EDFunctionEmployee)functionEmployeeList.get(0);
				EDFunction function = EDFunctionLocalServiceUtil.getEDFunction(functionEmployee.getFunctionId());
				k=k+1;
%>
		<tr>
				
				<td align="center" width="50%" height="400"><br/>
				<%=employee.getName()%>
				<br/>
				<%=department.getName() %>
				<br/>
				<%=function.getName() %>
				<br/>
				<img width="80%" height="300" src="<%=themeDisplay.getPathImage()%>/EDirectory-portlet?img_id=<%= employee.getImage() %>" name="<%= employee.getImage() %>">
				<br/>
				</td>
				<% if(k<EdemployeeList.size()){
					 employee = (EDEmployee)EdemployeeList.get(k);
					 department =	EDDepartmentLocalServiceUtil.getEDDepartment(employee.getDepartmentId());
					 functionEmployeeList = EDFunctionEmployeeLocalServiceUtil.getByEmployeeId(employee.getId());
					 functionEmployee = (EDFunctionEmployee)functionEmployeeList.get(0);
					 function = EDFunctionLocalServiceUtil.getEDFunction(functionEmployee.getFunctionId());
				%>
				<td align="center" width="50%" height="400"><br/>
				<%=employee.getName()%>
				<br/>
				<%=department.getName() %>
				<br/>
				<%=function.getName() %>
				
				<br/>
				
				<img width="80%" height="300" src="<%=themeDisplay.getPathImage()%>/EDirectory-portlet?img_id=<%= employee.getImage() %>" name="<%= employee.getImage() %>">
				<br/>
				</td>
				<%k=k+1; }else{break;}%>
			</tr>
	
<%} 
		
	}
	if(depId!=0 && name.equals("")){
		EDDepartment department = EDDepartmentLocalServiceUtil.getEDDepartment(depId);	
		List<EDEmployee> EdemployeeList = EDEmployeeLocalServiceUtil.getByDepartmentId(department.getId());
		int k=0;
			for(int i=0;i<EdemployeeList.size();i++){
				EDEmployee employee = (EDEmployee)EdemployeeList.get(k);
					 List<EDFunctionEmployee> functionEmployeeList = EDFunctionEmployeeLocalServiceUtil.getByEmployeeId(employee.getId());
						EDFunctionEmployee functionEmployee = (EDFunctionEmployee)functionEmployeeList.get(0);
						EDFunction function = EDFunctionLocalServiceUtil.getEDFunction(functionEmployee.getFunctionId());
						k=k+1;
		%>
			<tr>
				
				<td align="center" width="50%" height="400"><br/>
				<%=employee.getName()%>
				<br/>
				<%=department.getName() %>
				<br/>
				<%=function.getName() %>
				
				<br/>
				<img width="80%" height="300" src="<%=themeDisplay.getPathImage()%>/EDirectory-portlet?img_id=<%= employee.getImage() %>" name="<%= employee.getImage() %>">
				<br/>
				</td>
				<% if(k<EdemployeeList.size()){
					 employee = (EDEmployee)EdemployeeList.get(k);
					 department =	EDDepartmentLocalServiceUtil.getEDDepartment(employee.getDepartmentId());
					 functionEmployeeList = EDFunctionEmployeeLocalServiceUtil.getByEmployeeId(employee.getId());
					 functionEmployee = (EDFunctionEmployee)functionEmployeeList.get(0);
					 function = EDFunctionLocalServiceUtil.getEDFunction(functionEmployee.getFunctionId());
				%>
				<td align="center" width="50%" height="400"><br/>
				<%=employee.getName()%>
				<br/>
				<%=department.getName() %>
				<br/>
				<%=function.getName() %>
				
				<br/>
				
				<img width="80%" height="300" src="<%=themeDisplay.getPathImage()%>/EDirectory-portlet?img_id=<%= employee.getImage() %>" name="<%= employee.getImage() %>">
				<br/>
				</td>
				<%k=k+1; }else{break;}%>
			</tr>
			
		<%} 
	}
	%>		
</tr>
	</table>
	
</div>
