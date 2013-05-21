<%@ include file="/html/portlet/vlegal/init.jsp" %>
<%
	String redirect = ParamUtil.getString(request, "redirect");
	String docId = request.getParameter("docId");
	
	VLegalDocument document = new VLegalDocumentImpl();
	if (Validator.isNotNull(docId)){	
		document = VLegalDocumentServiceUtil.getDocument(docId);	
	}
	
	long _parentId = Long.valueOf(parentId);
	List listDepartment = (List)EDDepartmentLocalServiceUtil.getDepartmentByL_G_P(language,groupId,_parentId);	
	List departments = (List)EDDepartmentLocalServiceUtil.getDepartmentsByL_G(language,groupId);
%>

<liferay-ui:tabs names="portlet.vlegal.document.forward" backURL="<%= redirect %>" />

<form action="<portlet:actionURL><portlet:param name="struts_action" value="/vlegal/edit_document" />
	</portlet:actionURL>" method="post" name="<portlet:namespace />fm" >		

	<input name="<portlet:namespace />cmd" type="hidden" value="forward" />	
	<input name="<portlet:namespace />docId" type="hidden" value="<%= docId%>"/>
	<input name="<portlet:namespace />redirect" type="hidden" value="<%= redirect %>"/>
	<input name="<portlet:namespace />groupId" type="hidden" value="<%= groupId %>">
<table> 
<tr height="30">
	<td>V&#259;n b&#7843;n :</td>
	<td><b><%=document.getSummary()%></b></td>
</tr>

<tr height="5"><td colspan="2"/></tr>

<tr>
	<td>Phòng ban :</td>
	<td>
		<select name="<portlet:namespace/>departmentId" size="<%=departments.size()%>"  multiple>
		<!--<%
			for(int i=0;i<listDepartment.size();i++){
				EDDepartment department = (EDDepartment)listDepartment.get(i);
		%>
			<option value="<%= department.getId()%>"><%= department.getName()%></option>
		<%
			}
		%>-->
		
		<%
			out.println(ActionUtil.getDepartmentTree(_parentId));
		%>		
		</select>
	</td>
</tr>
			
<tr height="5"><td colspan="2"/></tr>
						
<tr height="30">
	<td>Thông báo (không b&#7855;t bu&#7897;c)</td>
	<td>
		<textarea name="<portlet:namespace />message" class="lfr-textarea" ></textarea>
	</td>
</tr>
</table>
<br/

<input class="portlet-form-button" type="submit" value='<%= LanguageUtil.get(pageContext, "forward") %>'>
<input class="portlet-form-button" type="button" value='<%= LanguageUtil.get(pageContext, "cancel") %>' onClick="self.location = '<%= redirect %>';">
	
</form>	