<%@page import="com.liferay.portal.kernel.util.WebKeys"%>
<%@page import="com.liferay.portal.theme.ThemeDisplay"%>
<%@page import="com.liferay.portal.kernel.language.LanguageUtil" %>
<%@page import="java.util.List" %>

<%@page import="com.portlet.vdoc.service.impl.vdocDocumentLocalServiceImpl"%>
<%@page import="com.portlet.vdoc.service.vdocFieldLocalServiceUtil"%>
<%@page import="com.portlet.vdoc.service.vdocOrgLocalServiceUtil"%>
<%@page import="com.portlet.vdoc.service.vdocDocumentLocalService"%>
<%@page import="com.portlet.vdoc.service.vdocDocumentLocalServiceUtil" %>

<%@ page import="com.portlet.vdoc.model.vdocDocument" %>
<%@ page import="com.portlet.vdoc.model.vdocField" %>
<%@ page import="com.portlet.vdoc.model.vdocOrg" %>
<%@ page import="com.portlet.vdoc.model.vdocDORel" %>

<%@ page import="com.liferay.portal.model.User" %>
<%@ page import="com.liferay.portal.service.UserLocalServiceUtil" %>
<%@ page import="com.liferay.portal.service.persistence.UserUtil" %>
<%@page import="com.liferay.portal.kernel.util.ListUtil"%>

<%@ taglib uri="http://liferay.com/tld/theme" prefix="liferay-theme" %>
<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>
<%@ taglib uri="http://liferay.com/tld/aui" prefix="aui" %>
<%@ taglib uri="http://liferay.com/tld/ui" prefix="liferay-ui" %>

<portlet:defineObjects/>
<liferay-theme:defineObjects/>
<%
	int approvalPendingDocuments = 0 ; // văn bản chưa duyệt
	int publishingPendingDocuments = 0; // văn bản đã duyệt
	int publishedDocuments = 0; // văn bản đã xuất bản
	
	int orgNum = 0; // số cơ quan đơn vị
	int field = 0; // số lĩnh vực
	
	approvalPendingDocuments = vdocDocumentLocalServiceUtil.countDocByG_L_S(groupId, language, vdocDocumentLocalServiceImpl.APPROVAL_PENDING);
	publishingPendingDocuments = vdocDocumentLocalServiceUtil.countDocByG_L_S(groupId, language, vdocDocumentLocalServiceImpl.PUBLISH_PENDING);
	publishedDocuments = vdocDocumentLocalServiceUtil.countDocByG_L_S(groupId, language, vdocDocumentLocalServiceImpl.PUBLISHED);
	
	orgNum = vdocOrgLocalServiceUtil.getOrgByG_L(groupId, language).size();
	field = vdocFieldLocalServiceUtil.getFieldByG_L(groupId, language).size();
%>

<table width="100%" border="0" cellspacing="2" cellpadding="2">
<tr>
	<td width="50%" valign="top"><fieldset style="width:95%">
		<legend><strong><%=LanguageUtil.get(pageContext,"portlet.vdoc.information-tab")%></strong></legend>
		<table width="100%" border="0" cellspacing="2" cellpadding="2" style="border: 1px solid #CCCCCC">
		<tr>	
			<td width="25%" align="center">&nbsp;</td>
			<td width="25%" align="center"><b><%=LanguageUtil.get(pageContext, "portlet.vdoc.information-tab.not-approve") %>  </b></td>
			<td width="25%" align="center"><b><%=LanguageUtil.get(pageContext, "portlet.vdoc.information-tab.approved") %></b></td>
			<td align="center"><b><%=LanguageUtil.get(pageContext, "portlet.vdoc.information-tab.published") %></b></td>
		</tr>
		<tr>
			<td align="center"><b><%=LanguageUtil.get(pageContext, "portlet.vdoc.information-tab.doc") %></b></td>
			<td align="center"><%=approvalPendingDocuments  %></td>
			<td align="center"><%=publishingPendingDocuments  %></td>
			<td align="center"><%=publishedDocuments  %></td>
		</tr>	
		</table>
	</td>	
	
	<td width="50%" valign="top"><fieldset style="width:95%" >
		<legend><strong><%=LanguageUtil.get(pageContext,"portlet.vdoc.information-tab")%></strong></legend>
		<table width="100%" border="0" cellspacing="2" cellpadding="2" style="border: 1px solid #CCCCCC">
		<tr>
			<td style="padding-left:20px;"><b><%=LanguageUtil.get(pageContext,"portlet.vdoc.information-tab.number-organizations")%></b></td>
			<td align="center"><%= orgNum %></td>
		</tr>			
		<tr>	
			<td style="padding-left:20px;"><b><%=LanguageUtil.get(pageContext,"portlet.vdoc.information-tab.number-fields")%></b></td>	
			<td align="center"><%= field %></td>
		</tr>
		</table>
	</td>
</tr>	
</table>







