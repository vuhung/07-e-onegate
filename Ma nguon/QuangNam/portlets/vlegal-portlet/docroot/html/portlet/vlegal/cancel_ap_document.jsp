<%@page import="com.vportal.portlet.vlegal.service.impl.VLegalDocumentServiceImpl"%>
<%@page import="com.liferay.portal.kernel.util.Constants"%>

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
 * Copyright (c) 2000-2008 VietSoftware, Inc. All rights reserved.
 *
 */
%>
<%@ include file="/html/portlet/vlegal/init.jsp" %>
<%	
	String redirect = ParamUtil.getString(request, "redirect");	
	String docId = ParamUtil.getString(request,"docids");	
	
	VLegalDocument document = new VLegalDocumentImpl();
	
	if (document == null){
		document = new VLegalDocumentImpl();
	}		
		
	document = VLegalDocumentServiceUtil.getDocument(docId);
%>

<script type="text/javascript">
	function <portlet:namespace />cancelAPDocument() {
		document.<portlet:namespace />fm.<portlet:namespace /><%= Constants.CMD %>.value = '<%= (document.getStatusDoc() == VLegalDocumentServiceImpl.PUBLISHED) ? "cancel_publish" : "cancel_approve" %>';
		submitForm(document.<portlet:namespace />fm);
	}
</script>

<portlet:actionURL name="processDocument" var="cancaelAPDocumentUrl" />

<form action="<%= cancaelAPDocumentUrl.toString() %>" method="post" name="<portlet:namespace />fm" onSubmit="<portlet:namespace />cancelAPDocument(); return false;">
<input name="<portlet:namespace /><%= Constants.CMD %>" type="hidden" value="">
<input name="<portlet:namespace />redirect" type="hidden" value="<%= redirect %>">
<input name="<portlet:namespace />docids" type="hidden" value="<%= document.getDocId() %>">

<table border="0" cellpadding="4" cellspacing="0" width="100%">
	<tr>
		<td align="left">			
			<%= LanguageUtil.get(pageContext, ((document.getStatusDoc() == VLegalDocumentServiceImpl.PUBLISHED) ? "portlet.vlegal.document.cancel-publish" :  "portlet.vlegal.document.cancel-approve")) %>: <font  style="font-size: 13pt; font-family: tahoma, arial"><%= document.getSummary() %></font>
		</td>
	</tr>
</table>
<div class="beta-separator"></div><br>
<table border="0" cellpadding="4" cellspacing="0" width="100%">
	<tr>
		<td align="left" width="100%" valign="top">
			<fieldset style="border:1px solid">
				<legend><%= LanguageUtil.get(pageContext, "portlet.vlegal.document.cancel-ap.attached-message") %> [ không b&#7855;t bu&#7897;c ]</legend>
				<table border="0" cellpadding="4" cellspacing="0" width="100%">
					<tr>
						<td align="left" width="100%">
							<textarea name="<portlet:namespace />message" rows="10" style="font-family: verdana, arial, tahoma; font-size: 13px; padding: 10px; width: 90%"></textarea>
						</td>
					</tr>
				</table>
			</fieldset>
		</td>
	</tr>
	<tr>
		<td align="center" width="100%" valign="top">			
			<input class="portlet-form-button" type="submit" value='<%= LanguageUtil.get(pageContext, ((document.getStatusDoc() == VLegalDocumentServiceImpl.PUBLISHED) ? "portlet.vlegal.document.cancel-publish" :  "portlet.vlegal.button.cancel-approve")) %>'>			
			<input class="portlet-form-button" type="button" value='<%= LanguageUtil.get(pageContext, "portlet.vlegal.button.return") %>' onClick="self.location = '<%= redirect %>';">			
		</td>
	</tr>
</table>
</form>
<script type="text/javascript">
	document.<portlet:namespace />fm.<portlet:namespace />message.focus();
</script>
