<%@page import="javax.portlet.WindowState"%>
<%@page import="com.vportal.portlet.vlegal.model.VLegalDocument"%>
<%@page import="com.vportal.portlet.vlegal.model.VLegalAttachedMessage"%>
<%@page import="java.util.ArrayList"%>
<%@page import="com.liferay.portal.kernel.language.LanguageUtil"%>
<%@page import="com.vportal.portlet.vlegal.service.VLegalSuggestDocumentServiceUtil"%>
<%@page import="com.vportal.portlet.vlegal.service.VLegalSignerServiceUtil"%>
<%@page import="com.vportal.portlet.vlegal.service.VLegalTypeServiceUtil"%>
<%@page import="com.vportal.portlet.vlegal.service.VLegalOrgServiceUtil"%>
<%@page import="com.vportal.portlet.vlegal.service.VLegalFieldServiceUtil"%>
<%@page import="com.vportal.portlet.vlegal.service.impl.VLegalDraftDocumentServiceImpl"%>
<%@page import="com.vportal.portlet.vlegal.service.VLegalAttachedMessageServiceUtil"%>
<%@page import="com.vportal.portlet.vlegal.service.VLegalDraftDocumentServiceUtil"%>
<%@page import="com.vportal.portlet.vlegal.service.impl.VLegalDocumentServiceImpl"%>
<%@page import="com.vportal.portlet.vlegal.service.VLegalDocumentServiceUtil"%>
<%@page import="java.util.List"%>

<%
/**
 * Copyright (c) 2000-2012 VietSoftware, Inc. All rights reserved.
 *
 */
%>
<%
	int approvalPendingDocuments = 0;
	int publishPendingDocuments = 0;
	int publishedDocuments = 0;	
	int approvalPendingDrafts = 0;
	int publishPendingDrafts = 0;
	int publishedDrafts = 0;
	int expireDrafts = 0;
	List attachedMessages = null;
	int totalField = 0;
	int totalOrg = 0;
	int totalType = 0;
	int totalSigner = 0;
	int totalSuggest = 0;
	
	try {
		approvalPendingDocuments = VLegalDocumentServiceUtil.countByStatus(groupId, language, VLegalDocumentServiceImpl.APPROVAL_PENDING);
		publishPendingDocuments = VLegalDocumentServiceUtil.countByStatus(groupId, language, VLegalDocumentServiceImpl.PUBLISH_PENDING);
		publishedDocuments = VLegalDocumentServiceUtil.getDocumentByP_L_S(groupId, language, VLegalDocumentServiceImpl.PUBLISHED).size();
		
		approvalPendingDrafts = VLegalDraftDocumentServiceUtil.countByStatus(groupId, language, VLegalDraftDocumentServiceImpl.APPROVAL_PENDING);
		publishPendingDrafts = VLegalDraftDocumentServiceUtil.countByStatus(groupId, language, VLegalDraftDocumentServiceImpl.PUBLISH_PENDING);
		publishedDrafts = VLegalDraftDocumentServiceUtil.getDraftsByP_L_S_E(groupId, language, VLegalDraftDocumentServiceImpl.PUBLISHED).size();
		expireDrafts = VLegalDraftDocumentServiceUtil.getDraftsExpiredDateByP_L_S(groupId,language,VLegalDraftDocumentServiceImpl.PUBLISHED).size();
		attachedMessages = VLegalAttachedMessageServiceUtil.getAllMessageByStatus(groupId,false);

		totalField = VLegalFieldServiceUtil.getVFieldByS_L(groupId, true, language).size();
		totalOrg = VLegalOrgServiceUtil.getAllOrgByS_L(groupId, true, language).size();
		totalType = VLegalTypeServiceUtil.getTypesByL_S(groupId, language, true).size();
		totalSigner = VLegalSignerServiceUtil.getAllSignerByG_L(groupId, language).size();
		totalSuggest = VLegalSuggestDocumentServiceUtil.getSuggestionsByP_L_A(groupId, language, false).size();
		
	} catch(Exception ex) {
		// ignore
	}
	
	if(attachedMessages==null){
		attachedMessages = new ArrayList();
	}
%>
<table width="100%" border="0" cellspacing="2" cellpadding="2">
  <tr>
    <td width="50%" align="left" valign="top">
		<fieldset style="width:95%">
			<legend><strong><%=LanguageUtil.get(pageContext,"portlet.vlegal.infomation-tab")%></strong></legend>
			<table width="100%" border="0" cellspacing="2" cellpadding="2" style="border: 1px solid #CCCCCC">
			  <tr style="font-weight: bold;" class="portlet-section-header">
			    <td width="9%" style="border-bottom: 1px solid">&nbsp;</td>
				<td width="30%" style="border-bottom: 1px solid">&nbsp;</td>
				<td width="28%" style="border-bottom: 1px solid">V&#259;n b&#7843;n </td>
				<%if(manageDraftSuggestion){%>
			    <td width="33%" style="border-bottom: 1px solid">D&#7921; th&#7843;o </td>
				<%}else{%>
				<td width="33%" style="border-bottom: 1px solid">&nbsp; </td>
				<%}%>	
			  </tr>
			  <tr class="portlet-section-body">
			    <td><img src="<%= themeDisplay.getPathThemeImage() %>/vlegal/dot.gif" valign="middle" /></td>
			    <td> <%=LanguageUtil.get(pageContext,"portlet.vlegal.document.approval-pending")%></td>
			    <td><div align="left"><%=approvalPendingDocuments%></div></td>
			    <%if(manageDraftSuggestion){%> 
		        <td><div align="left"><%=approvalPendingDrafts%></div></td>
		        <%}else{%>	
		        <td><div align="left">&nbsp;</div></td>	
		        <%}%>	
			  </tr>
			  <tr class="portlet-section-alternate">
			    <td><img src="<%= themeDisplay.getPathThemeImage() %>/vlegal/dot.gif" valign="middle" /></td>
			    <td> <%=LanguageUtil.get(pageContext,"portlet.vlegal.document.publish-pending")%></td>
			    <td><div align="left"><%=publishPendingDocuments%></div></td>
			    <%if(manageDraftSuggestion){%>  
		        <td><div align="left"><%=publishPendingDrafts%></div></td>
		        <%}else{%>	
		        <td><div align="left">&nbsp;</div></td>	
		        <%}%>		
			  </tr>
			  <tr class="portlet-section-body">
			    <td><img src="<%= themeDisplay.getPathThemeImage() %>/vlegal/dot.gif" valign="middle" /></td>
			    <td><%=LanguageUtil.get(pageContext,"portlet.vlegal.document.published")%></td>
			    <td><div align="left"><%=publishedDocuments%></div></td>
			    <%if(manageDraftSuggestion){%>	
		        <td><div align="left"><%=publishedDrafts%></div></td>
		        <%}else{%>	
		        <td><div align="left">&nbsp;</div></td>	
		        <%}%>		
			  </tr>			
			  <%if(manageDraftSuggestion){%>
			  <tr class="portlet-section-alternate">
			    <td><img src="<%= themeDisplay.getPathThemeImage() %>/vlegal/dot.gif" valign="middle" /></td>
			    <td><%=LanguageUtil.get(pageContext,"portlet.vlegal.draft.expired_suggestion")%></td>
			    <td><div align="left"></div></td>			    
		        <td><div align="left"><%=expireDrafts%></div></td>
			  </tr>
			  <%}%>
			  <tr>
			    <td>&nbsp;</td>
			    <td><strong>T&#7893;ng s&#7889;</strong> </td>
			    <td><div align="left"><strong><%=approvalPendingDocuments + publishPendingDocuments + publishedDocuments%></strong></div></td>
			    <%if(manageDraftSuggestion){%>	
			    <td><div align="left"><strong><%=approvalPendingDrafts + publishPendingDrafts + publishedDrafts + expireDrafts%></strong></div></td>
			 	<%}else{%>	
		        <td><div align="left">&nbsp;</div></td>	
		        <%}%>	
		      </tr>
			</table>
		</fieldset>
		<br/>
		<fieldset style="width:95%">
			<table width="100%" border="0" cellspacing="2" cellpadding="2" style="border: 1px solid #CCCCCC">
			  <tr style="font-weight: bold;" class="portlet-section-header">
			  	<td colspan="3" style="border-bottom: 1px solid">&nbsp;</td>
			  </tr>			  
			  <tr class="portlet-section-body">
			  	<td><img src="<%= themeDisplay.getPathThemeImage() %>/vlegal/dot.gif" valign="middle" /></td>
				<td><strong>L&#297;nh v&#7921;c </strong></td>
				<td><%=totalField%></td>
			  </tr>
			  <tr class="portlet-section-alternate">
			  	<td><img src="<%= themeDisplay.getPathThemeImage() %>/vlegal/dot.gif" valign="middle" /></td>  
				<td><strong>Lo&#7841;i v&#259;n b&#7843;n <strong></td>
				<td><%=totalType%></td>
			  </tr>
			  <tr class="portlet-section-body">
			  	<td><img src="<%= themeDisplay.getPathThemeImage() %>/vlegal/dot.gif" valign="middle" /></td> 	  
			    <td><strong>C&#417; quan ban h&agrave;nh <strong></td>
			    <td><%=totalOrg%></td>			    
		      </tr>
			  <tr class="portlet-section-alternate">
			  	<td><img src="<%= themeDisplay.getPathThemeImage() %>/vlegal/dot.gif" valign="middle" /></td>  
				<td><strong>T&#7893;ng s&#7889; ng&#432;&#7901;i ký</strong></td>
				<td><%=totalSigner%></td>
			  </tr>
			  <%if(manageDraftSuggestion){%>
			  <tr class="portlet-section-body">
			  	<td><img src="<%= themeDisplay.getPathThemeImage() %>/vlegal/dot.gif" valign="middle" /></td>  
				<td><strong>Góp ý ch&#432;a duy&#7879;t</strong></td>
				<td><%=totalSuggest%></td>
			  </tr>
			  <%}%>
	  		</table>
		</fieldset>
	</td>
    <td width="50%" valign="top">
		<fieldset style:"heigth:230px;">
			<legend><strong><%=LanguageUtil.get(pageContext, "portlet.vlegal.document.cancel-publish")%></strong> </legend>
				<div class="portlet-msg-info" style="padding: 4px; height:200px; overflow:auto">
					<%
						for (int i = 0; i < attachedMessages.size(); i ++) {
							VLegalAttachedMessage attachedMessage = (VLegalAttachedMessage) attachedMessages.get(i);
							String docId = attachedMessage.getArticleId();
							VLegalDocument vDoc = VLegalDocumentServiceUtil.getDocument(docId);
							// Display...
							out.println("<img src='" + themeDisplay.getPathThemeImage() + "/vlegal/message-notation.gif' valign='middle' />");
					%>
							<portlet:renderURL windowState="<%= WindowState.MAXIMIZED.toString() %>" var="editURL">
								<portlet:param name="jspPage" value="/html/portlet/vlegal/document_edit.jsp" />
								<portlet:param name="redirect" value="<%= currentURL %>" />
								<portlet:param name="docid" value="<%= docId %>" />
							</portlet:renderURL>
							<b><%=vDoc.getNum()%>/<%=vDoc.getSymbol()%></b>
							<liferay-ui:icon image="edit" url="<%= editURL %>" message="<%= vDoc.getSummary() %>" />
					<%
							
							out.println("<div style=\"padding:3px; font-size:11px;\">B&#7903;i: " + attachedMessage.getCreatedByUser() + " Lúc: " + dateFormatDateTime.format(attachedMessage.getCreatedDate()) + "</div>");
							out.println("<div style=\"padding:3px; font-size:12px;\">" + attachedMessage.getContent() + "</div>");
							if (i < attachedMessages.size() - 1) {
								out.println("<div class=\"beta-separator\"></div>");
							}
							// Update status
							//VLegalAttachedMessageServiceUtil.updateMessage(attachedMessage.getMessageId(), true);
						}
					%>
				</div>
		</fieldset>
	</td>
  </tr>
</table>
