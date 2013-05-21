<%@page import="com.liferay.portal.kernel.util.Constants"%>
<%@page import="com.vportal.portlet.vlegal.InvalidSignerLastNameExceptionException"%>
<%@page import="com.vportal.portlet.vlegal.InvalidSignerFirstNameExceptionException"%>
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
 * Copyright (c) 2008 VietSoftware, Inc. All rights reserved.
 * 
 */
%>

<%@ include file="/html/portlet/vlegal/init.jsp" %>

<%
	String redirect = ParamUtil.getString(request, "redirect");
	String sigId = ParamUtil.getString(request, "sigid");
	VLegalSigner signer = null;
	if(sigId != null)
	{
		try
		{
			signer = VLegalSignerServiceUtil.getSigner(groupId, sigId);
		}catch(Exception ex)
		{
			
		}
	}
	
%>
<script type="text/javascript">
	
</script>

<c:if test='<%= signer != null %>'>
	<liferay-ui:tabs names="portlet.vlegal.signer.edit.update" backURL="<%= redirect %>" />
</c:if>
<c:if test='<%= signer == null %>'>
	<liferay-ui:tabs names="portlet.vlegal.signer.edit.add-new" backURL="<%= redirect %>" />
</c:if>	
	
<liferay-ui:error exception="<%= InvalidSignerFirstNameExceptionException.class %>" message="portlet.vlegal.signer.exception.please-enter-a-valid-signer-firstName" />
<liferay-ui:error exception="<%= InvalidSignerLastNameExceptionException.class %>" message="portlet.vlegal.signer.exception.please-enter-a-valid-signer-lastName" />
	
<portlet:actionURL name="updateSigner" var="updateSignerUrl"></portlet:actionURL>

<form action="<%= updateSignerUrl.toString() %>" method="post" name="<portlet:namespace />fm">
<input name="<portlet:namespace /><%= Constants.CMD %>" type="hidden" value="<%= (signer==null) ? Constants.ADD : Constants.EDIT %>">
<input name="<portlet:namespace />redirect" type="hidden" value="<%= redirect %>">
<input name="<portlet:namespace />language" type="hidden" value="<%= language %>">
<input name="<portlet:namespace />sigid" type="hidden" value="<%= (signer != null) ? signer.getSigId() : "" %>">
<table width="100%" border="0" cellspacing="0" cellpadding="0">
<tr height="30">
	<td>H&#7885;:</td>
    <td>
    	<liferay-ui:input-field model="<%= VLegalSigner.class %>" bean="<%= signer %>" field="firstName" /></td>
</tr>			
<tr height="30">
	<td>T&ecirc;n:</td>
	<td>	
		<liferay-ui:input-field model="<%= VLegalSigner.class %>" bean="<%= signer %>" field="lastName" /></td>
</tr>

<tr height="30">
	<td>Ng&ocirc;n ng&#7919;:</td>
	<td>
	    <select name="<portlet:namespace />language" style="width: 230px">
		<%
			String selectedLanguage = ((signer != null) ? signer.getLanguage() : language);
			for (int i = 0; i < locales.length; i++) {
		%>		    
		<option <%= (selectedLanguage.equals(locales[i].getLanguage() + "_" + locales[i].getCountry())) ? "selected" : "" %> value="<%= locales[i].getLanguage() + "_" + locales[i].getCountry() %>"><%= locales[i].getDisplayName(locales[i]) %></option>
		<%
			}
		%>
	    </select>
   </td>
</tr>

<tr height="30">
	<td>Tr&#7841;ng th&aacute;i: </td>
	<td><input type="checkbox" class="form-text" <%= ((signer!=null) && signer.getStatusSigner()) ? "checked=\"checked\"" : "" %> name="<portlet:namespace />status" value="true" /></td>
</tr>

<c:if test="<%= signer == null %>">
<tr height="30">
	<td><liferay-ui:message key="permissions" /></td>
	<td>
		<liferay-ui:input-permissions
					modelName="<%= VLegalSigner.class.getName() %>"
				/>
	</td>
</tr>
</c:if>
	
</table>
<br/>

<input class="portlet-form-button" type="submit" value='<%= LanguageUtil.get(pageContext, "save") %>'>
<input class="portlet-form-button" type="button" value='<%= LanguageUtil.get(pageContext, "cancel") %>' onClick="self.location = '<%= redirect %>';">
					
</form>