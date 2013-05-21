<%@page import="com.liferay.portal.kernel.util.Constants"%>
<%@page import="com.vportal.portlet.vlegal.InvalidFieldDescriptionExceptionException"%>
<%@page import="com.vportal.portlet.vlegal.InvalidFieldNameExceptionException"%>
<%@page import="com.vportal.portal.util.WebKeysExt"%>

<%@taglib uri="http://java.sun.com/jstl/core_rt" prefix="c" %>
<%@taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>
<%@taglib uri="http://liferay.com/tld/aui" prefix="aui" %>
<%@taglib uri="http://liferay.com/tld/faces" prefix="liferay-faces" %>
<%@taglib uri="http://liferay.com/tld/portlet" prefix="liferay-portlet" %>
<%@taglib uri="http://liferay.com/tld/security" prefix="liferay-security" %>
<%@taglib uri="http://liferay.com/tld/theme" prefix="liferay-theme" %>
<%@taglib uri="http://liferay.com/tld/ui" prefix="liferay-ui" %>
<%@taglib uri="http://liferay.com/tld/util" prefix="liferay-util" %>

<%@page import="javax.portlet.PortletURL"%>

<portlet:defineObjects/>
<%
/**
 * Copyright (c) 2012 VietSoftware, Inc. All rights reserved.
 * 	
 */
%>

<%@ include file="/html/portlet/vlegal/init.jsp" %>

<%
	String redirect = ParamUtil.getString(request, "redirect");
// 	VLegalField field = (VLegalField) request.getAttribute(WebKeysExt.VLEGAL_FIELD);
	String fieldId = ParamUtil.getString(request, "fieldid");
	VLegalField fieldDoc = null;
	if(fieldDoc != null)
	{
		fieldDoc = VLegalFieldServiceUtil.getVField(groupId, fieldId);
	}
	int field = ParamUtil.getInteger(request,"field");
%>
<script type="text/javascript">
	function <portlet:namespace/>submitForm(){
		var myform = document.<portlet:namespace />fm;
		myform.submit();
		window.close();
	
		if (window.opener && !window.opener.closed) {
			window.opener.location.reload(true);
		} 		
	}	
</script>
	
<c:if test='<%= fieldDoc != null %>'>
	<liferay-ui:tabs names="portlet.vlegal.field.edit.update" backURL="<%= redirect %>" />
</c:if>
<c:if test='<%= fieldDoc == null %>'>
	<liferay-ui:tabs names="portlet.vlegal.field.edit.add-new" backURL="<%= redirect %>" />
</c:if>	
	
<liferay-ui:error exception="<%= InvalidFieldNameExceptionException.class %>" message="portlet.vlegal.field.exception.please-enter-a-valid-field-name" />
<liferay-ui:error exception="<%= InvalidFieldDescriptionExceptionException.class %>" message="portlet.vlegal.field.exception.please-enter-a-valid-field-description" />

<portlet:actionURL name="updateField" var="updateFieldUrl" />

<form action="<%= updateFieldUrl.toString() %>" method="post" name="<portlet:namespace />fm">
<input name="<portlet:namespace /><%= Constants.CMD %>" type="hidden" value="<%= (fieldDoc==null) ? Constants.ADD : Constants.EDIT %>">
<input name="<portlet:namespace />redirect" type="hidden" value="<%= redirect %>">
<input name="<portlet:namespace />fieldid" type="hidden" value="<%= (fieldDoc != null) ? fieldDoc.getFieldId() : "" %>">
<input name="<portlet:namespace />groupId" id="<portlet:namespace />groupId" type="hidden" value="<%= groupId %>">
<table width="100%" border="0" cellspacing="0" cellpadding="0">
<tr height="30">
	<td>T&ecirc;n l&#297;nh v&#7921;c </td>
	<td><liferay-ui:input-field model="<%= VLegalField.class %>" bean="<%= fieldDoc %>" field="name" /></td>
</tr>
<tr height="30">
	<td>M&ocirc; t&#7843; t&oacute;m t&#7855;t </td>
	<td>
		<textarea name="<portlet:namespace />description" id="<portlet:namespace />description" class="lfr-textarea" ><%= (fieldDoc!=null) ? fieldDoc.getDescription() : "" %></textarea>		</td>
</tr>
<tr height="30">
	<td>Ng&ocirc;n ng&#7919; </td>
	<td>
    	<select name="<portlet:namespace />language" style="width: 230px">
			<%
				String selectedLanguage = ((fieldDoc != null) ? fieldDoc.getLanguage() : language);
				for (int i = 0; i < locales.length; i++) {
			%>		    
				<option <%= (selectedLanguage.equals(locales[i].getLanguage() + "_" + locales[i].getCountry())) ? "selected" : "" %> value="<%= locales[i].getLanguage() + "_" + locales[i].getCountry() %>"><%= locales[i].getDisplayName(locales[i]) %></option>		    
			<%
				}
			%>
	    </select></td>
</tr>
				
<tr height="30">
	<td>Tr&#7841;ng th&aacute;i </td>
	<td><input type="checkbox" class="form-text" <%= ((fieldDoc!=null) && fieldDoc.getStatusField()) ? "checked=\"checked\"" : "" %> name="<portlet:namespace />status" value="true" /></td>
</tr>
<c:if test="<%= fieldDoc == null %>">
<tr height="30">
	<td><liferay-ui:message key="permissions" /></td>
	<td>
		<liferay-ui:input-permissions
			modelName="<%= VLegalField.class.getName() %>"	/>
	</td>
</tr>
</c:if>	

</table>
<br/>
	
<c:if test="<%= field != 1%>">			
	<input class="portlet-form-button" type="submit" value='<%= LanguageUtil.get(pageContext, "save") %>'>
	<input class="portlet-form-button" type="button" value='<%= LanguageUtil.get(pageContext, "cancel") %>' onClick="self.location = '<%= redirect %>';">
</c:if>	

<c:if test="<%= field == 1%>">	
	<input class="portlet-form-button" type="button" value='<%= LanguageUtil.get(pageContext, "save") %>' onClick="javascript:<portlet:namespace />submitForm();">
	<input class="portlet-form-button" type="button" value='<%= LanguageUtil.get(pageContext, "close") %>' onClick="window.close();">
</c:if>	

</form>
	
<c:if test="<%= windowState.equals(WindowState.MAXIMIZED) || (field==1) %>">
	<script type="text/javascript">
		Liferay.Util.focusFormField(document.<portlet:namespace />fm.<portlet:namespace />name);
	</script>
</c:if>		