<%@page import="com.liferay.portal.kernel.util.Constants"%>
<%@page import="com.vportal.portlet.vlegal.InvalidTypeDescriptionException"%>
<%@page import="com.vportal.portlet.vlegal.InvalidTypeNameException"%>
<%@page import="com.vportal.portal.util.WebKeysExt"%>
<%@page import="javax.portlet.PortletMode"%>
<%@page import="javax.portlet.WindowState"%>
<%@page import="com.liferay.portal.util.PortalUtil"%>
<%@page import="com.liferay.portlet.PortletURLUtil"%>
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

<portlet:defineObjects />
<%
/**
 * Copyright (c) 2012 VietSoftware, Inc. All rights reserved.
 *
 */
%>

<%@ include file="/html/portlet/vlegal/init.jsp" %>
<%
	String redirect = ParamUtil.getString(request, "redirect");
// 	VLegalType typeDoc = (VLegalType) request.getAttribute(WebkeysExt.VLEGAL_TYPE);
	String typeId = ParamUtil.getString(request, "typeid");
	VLegalType typeDoc = VLegalTypeServiceUtil.getType(groupId, typeId);
	int type = ParamUtil.getInteger(request,"type");
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
<c:if test='<%= typeDoc != null %>'>
	<liferay-ui:tabs names="portlet.vlegal.type.edit.update" backURL="<%= redirect %>" />
</c:if>
<c:if test='<%= typeDoc == null %>'>
	<liferay-ui:tabs names="portlet.vlegal.type.edit.add-new" backURL="<%= redirect %>" />
</c:if>

<liferay-ui:error exception="<%= InvalidTypeNameException.class %>" message="portlet.vlegal.type.exception.please-enter-a-valid-type-name" />
<liferay-ui:error exception="<%= InvalidTypeDescriptionException.class %>" message="portlet.vlegal.type.exception.please-enter-a-valid-type-description" />

<portlet:actionURL name="updateType" var="updateTypeUrl" />

<form action="<%= updateTypeUrl.toString() %>" method="post" name="<portlet:namespace />fm">
<input name="<portlet:namespace /><%= Constants.CMD %>" type="hidden" value="<%= (typeDoc==null) ? Constants.ADD : Constants.UPDATE %>">
<input name="<portlet:namespace />redirect" type="hidden" value="<%= redirect %>">
<input name="<portlet:namespace />typeid" type="hidden" value="<%= (typeDoc != null) ? typeDoc.getTypeId() : "" %>">
<input name="<portlet:namespace />groupId" type="hidden" value="<%= groupId %>">

<table width="100%" border="0" cellspacing="0" cellpadding="0">
<tr height="30">
	<td>T&ecirc;n lo&#7841;i v&#259;n b&#7843;n </td>
    <td>
    	<liferay-ui:input-field model="<%= VLegalType.class %>" bean="<%= typeDoc %>" field="name" /></td>
</tr>
<tr height="30">
    <td>M&ocirc; t&#7843; t&oacute;m t&#7855;t </td>
    <td>			
		<textarea name="<portlet:namespace />description" id="<portlet:namespace />description" class="lfr-textarea" ><%= (typeDoc != null) ? typeDoc.getDescription() : "" %></textarea>	</td>
</tr>
	
<tr height="30">
	<td>Ng&ocirc;n ng&#7919; </td>
	<td>
	    <select name="<portlet:namespace />language" style="width: 230px">
	      <%
			String selectedLanguage = ((typeDoc != null) ? typeDoc.getLanguage() : language);
			for (int i = 0; i < locales.length; i++) {
			%>
		    
	      <option <%= (selectedLanguage.equals(locales[i].getLanguage() + "_" + locales[i].getCountry())) ? "selected" : "" %> value="<%= locales[i].getLanguage() + "_" + locales[i].getCountry() %>"><%= locales[i].getDisplayName(locales[i]) %></option>
		    
	      <%
			}
			%>
	    </select>	</td>
</tr>
<tr height="30">
	<td>Tr&#7841;ng th&aacute;i </td>
	<td><input type="checkbox" class="form-text" <%= ((typeDoc!=null) && typeDoc.getStatusType()) ? "checked=\"checked\"" : "" %> name="<portlet:namespace />status" value="true" /></td>
</tr>
				
<c:if test="<%= typeDoc == null %>">
<tr height="30">
    <td><liferay-ui:message key="permissions" /></td>
    <td>
		<liferay-ui:input-permissions modelName="<%= VLegalType.class.getName() %>"	/>
	</td>
</tr>
</c:if>
	
</table><br/>

<c:if test="<%= type != 1%>">			
	<input class="portlet-form-button" type="submit" value='<%= LanguageUtil.get(pageContext, "save") %>'>
	<input class="portlet-form-button" type="button" value='<%= LanguageUtil.get(pageContext, "cancel") %>' onClick="self.location = '<%= redirect %>';">
</c:if>	

<c:if test="<%= type == 1%>">	
	<input class="portlet-form-button" type="button" value='<%= LanguageUtil.get(pageContext, "save") %>' onClick="javascript:<portlet:namespace />submitForm();">
	<input class="portlet-form-button" type="button" value='<%= LanguageUtil.get(pageContext, "close") %>' onClick="window.close();">
</c:if>
	
</form>
	
<c:if test="<%= windowState.equals(WindowState.MAXIMIZED) || (type==1) %>">
	<script type="text/javascript">
		Liferay.Util.focusFormField(document.<portlet:namespace />fm.<portlet:namespace />name);
	</script>
</c:if>	