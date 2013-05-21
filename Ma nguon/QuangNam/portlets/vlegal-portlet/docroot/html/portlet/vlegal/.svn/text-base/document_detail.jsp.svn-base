<%@page import="com.liferay.portal.kernel.util.GetterUtil"%>
<%@page import="com.liferay.portlet.PortletURLFactoryUtil"%>
<%@page import="com.liferay.portal.kernel.language.LanguageUtil"%>
<%@page import="com.vportal.portlet.vlegal.model.VLegalAttachedMessage"%>
<%@page import="com.vportal.portlet.vlegal.util.VLegalUtil"%>
<%@page import="java.util.ArrayList"%>
<%@page import="com.vportal.portlet.vlegal.service.VLegalAttachedMessageServiceUtil"%>
<%@page import="com.liferay.portal.kernel.util.Constants"%>
<%@page import="javax.portlet.PortletRequest"%>
<%-- <%@page import="com.vportal.portlet.vlegal.util.PortletURLImpl"%> --%>
<%@page import="javax.portlet.PortletURL"%>
<%@page import="java.util.List"%>
<%@page import="com.vportal.portlet.vlegal.service.VLegalFieldServiceUtil"%>
<%@page import="com.vportal.portlet.vlegal.service.VLegalTypeServiceUtil"%>
<%@page import="com.vportal.portlet.vlegal.service.VLegalOrgServiceUtil"%>
<%@page import="com.vportal.portlet.vlegal.service.VLegalDocumentServiceUtil"%>
<%@page import="com.vportal.portlet.vlegal.model.VLegalField"%>
<%@page import="com.vportal.portlet.vlegal.model.VLegalType"%>
<%@page import="com.vportal.portlet.vlegal.model.VLegalOrg"%>
<%@page import="com.vportal.portlet.vlegal.model.VLegalDocument"%>
<%@page import="com.liferay.portal.kernel.util.Validator"%>
<%@page import="com.liferay.portal.kernel.util.StringPool"%>
<%@page import="com.liferay.portal.kernel.util.ParamUtil"%>
<%-- <%@ include file="/html/portlet/vlegal_display_content/init.jsp" %> --%>
<%-- <%@ include file="/html/portlet/vlegal_display_content/javascript.jsp" %> --%>
<script language="javascript">
	var flag = true;
	function <portlet:namespace/>miximizeSearchAdvance(){
		if(flag == true){
			document.getElementById('<portlet:namespace/>detail').style.display ="none";
			document.<portlet:namespace/>fm.<portlet:namespace/>button_custom_search.src = '<%=themeDisplay.getPathThemeImage() + "/vcms/maximize_search.gif" %>';
			document.<portlet:namespace/>fm.<portlet:namespace/>button_custom_search.title = "<%= LanguageUtil.get(pageContext, "portlet.vcms.button.search.maximize") %>";

			flag = false;
		}else{
			document.getElementById('<portlet:namespace/>detail').style.display ="";
			document.<portlet:namespace/>fm.<portlet:namespace/>button_custom_search.src = '<%=themeDisplay.getPathThemeImage() + "/vcms/miximize_search.gif" %>';
			document.<portlet:namespace/>fm.<portlet:namespace/>button_custom_search.title = "<%= LanguageUtil.get(pageContext, "portlet.vcms.button.search.miximize") %>";
			flag = true;
		}
	}
</script>		
	
<%
	
String docId =  ParamUtil.getString(request, "docid", StringPool.BLANK);
String redirect =  ParamUtil.getString(request, "redirect", StringPool.BLANK);


if(Validator.isNotNull(docId)) {
	VLegalDocument document = null;
	VLegalOrg org = null;
	VLegalType type = null; 
	VLegalField field = null;

	try {
		document = VLegalDocumentServiceUtil.getDocument(docId);	
		org = VLegalOrgServiceUtil.getOrg(document.getOrgId());
		type = VLegalTypeServiceUtil.getType(document.getTypeDocId());
		field = VLegalFieldServiceUtil.getVField(document.getFieldId());		

	} catch(Exception ex) {
		// Ignore 
	}
	
	List attachmentList = null;

	if (attachmentList == null) {
		attachmentList = new ArrayList();
	}

	PortletURL docURL = PortletURLFactoryUtil.create(request,portletSelectId, plId, PortletRequest.RENDER_PHASE);
	docURL.setParameter("jspPage", "/html/portlet/vlegal_display_content/view.jsp");
	docURL.setParameter("language",language);
	docURL.setParameter("groupId", String.valueOf(groupId));		
	docURL.setParameter(Constants.CMD, "documentview");		
		
	List readMessages = (List)VLegalAttachedMessageServiceUtil.getMessages(document.getDocId());
%>

<form name="<portlet:namespace/>fm" action="" method="">
<table width="100%" border="0" cellspacing="0" cellpadding="0">    
<tr>
	<td class="text_none" style="padding-left: 10px; padding-right: 10px;">
		<table class="text_none" width="100%" cellspacing="0" cellpadding="0" border="0" >
		<tr><td/></tr>
		<tr>
			<td>
				<table width="100%" cellspacing="0" cellpadding="0" border="0">
				<tr>
					<td>
					<div id="<portlet:namespace/>detail" style="display:none;"> 
						<table width="100%" cellspacing="1" cellpadding="3" bordercolor="#7994cb" border="1" bordercolor="#7994cb">
						<tr height="25">
							<th width="28%" bgcolor="#ffffff"><div align="center">S&#7889; v&#259;n b&#7843;n</div></th>
							<td width="72%" bgcolor="#ffffff">&nbsp;&nbsp;<%= document.getNum()%></td>
						</tr>
						<tr height="25">
							<th bgcolor="#ffffff"><div align="center">Ký hi&#7879;u</div></th>
							<td bgcolor="#ffffff">&nbsp;&nbsp;<%= document.getSymbol()%></td>
						</tr>
						<tr height="25">
							<th bgcolor="#ffffff"><div align="center">Ngày ban hành</div></th>
							<td bgcolor="#ffffff">&nbsp;&nbsp;<%= VLegalUtil.dateParser(document.getPromulDate())%></td>    
						</tr>
						<tr height="25">	
							<th bgcolor="#ffffff"><div align="center">Ng&#432;&#7901;i ký</div></th>
							<td bgcolor="#ffffff">&nbsp;&nbsp;<%= document.getSignerRels()%></td>							
						</tr>
						<tr height="25">
							<th bgcolor="#ffffff"><div align="center">Trích y&#7871;u</div></th>
							<td bgcolor="#ffffff">&nbsp;&nbsp;<%= document.getSummary()%></td>    	
						</tr>
						<tr height="25">
							<th bgcolor="#ffffff"><div align="center">C&#417; quan ban hành</div></th>
							<td bgcolor="#ffffff">&nbsp;&nbsp;<%= org.getName()%></a></td> 
						</tr>
						<tr height="25">   	
							<th bgcolor="#ffffff"><div align="center">Phân lo&#7841;i</div></th>
							<td bgcolor="#ffffff">&nbsp;&nbsp;<%= type.getName()%></td>    	
						</tr>
						<tr height="25">
							<th bgcolor="#ffffff"><div align="center">L&#297;nh v&#7921;c</div></th>
							<td bgcolor="#ffffff">&nbsp;&nbsp;<%= field.getName()%></td>    	
						</tr>
						</table>
					</div>
					</td>
				</tr>
				<tr><tr><a name="<portlet:namespace/>button_custom_search" href="#" onClick ="javascript:<portlet:namespace/>miximizeSearchAdvance();">Hi&#7879;n thông tin v&#259;n b&#7843;n</a></td></tr>				
				</table>
			<td/>
		</tr>
		
		<tr><td>&nbsp;</td></tr>
		<% if (document.getHasAttachment()){%>
		<tr>
			<td>
				<strong>T&#7879;p &#273;ính kèm </strong>				
				<vportal:file-download entryId="<%= GetterUtil.getLong(document.getDocId(), 0) %>" entryClass="<%= VLegalDocument.class %>"/>
			</td>
		</tr>
		<%}%>	
		<tr>
			<td>
				<table width="100%" cellpadding="0" border="0">
				<tr>
					<td><%= document.getContent() %></td>
				</tr>
				</table>
			</td>
		</tr>	
		<tr>
			<td><p align="right"><a href="javascript:expandingWindow('/html/portlet/vlegal_display_content/document_print.jsp?printDocId=<%=document.getDocId()%>');">In bài vi&#7871;t</p>
				<table width="100%" cellpadding="0" border="0">
				<tr>
					<td><%= document.getContent() %></td>
				</tr>
				</table>
				<p align="right"><a href="javascript:expandingWindow('/html/portlet/vlegal_display_content/document_print.jsp?printDocId=<%=document.getDocId()%>');">In bài vi&#7871;t</p>
			</td>
		</tr>
		</table>    	
	</td>    	
</tr>
</table>
<!-- Cac tin lien quan -->
<% if (otherDocuments.size() > 0) {%>
<table width="100%" cellspacing="0" cellpadding="0" border="0">
  <tr>
    <td width="2%">&ensp;</td>
	<td><strong>C&aacute;c v&#259;n b&#7843;n kh&aacute;c</strong>
		<%
			if(otherDocuments != null && otherDocuments.size() > 0 ) {
				for(int i=0; i<otherDocuments.size(); i++) {
					VLegalDocument otherDoc = (VLegalDocument) otherDocuments.get(i);
						docURL.setParameter("docid", otherDoc.getDocId());
		%>
			<p><a href="<%= docURL %>"><%=otherDoc.getSummary()%></a> (<%=dateFormat.format(otherDoc.getPromulDate())%>)</p>
		<%
				}
			}
		%>
	</td>
  </tr>
</table>
	<%}%>

<br/>
	
<% if (readMessages.size()>0) {%>
<table width="100%" border="0" cellspacing="4" cellpadding="0">
<tr>
	<td>
	<fieldset>		
	<legend><strong>Ph&#7843;n h&#7891;i:<strong></legend>
	<table>		
	<%		
		for(int j= 0;j < readMessages.size();j ++){
			VLegalAttachedMessage message = (VLegalAttachedMessage)readMessages.get(j);
	%>	
	<tr>
		
		<td><strong><%= j+1%> .</strong>&nbsp;<%= message.getContent()%><br></td>
	</tr>
	<%
			}
		}
	%>
	</table>
	</fieldset>	
	</td>
</tr>			
</table>
<%	}   %>
			
<br/>
<div>
	<input class="portlet-form-button" type="button" value='<%= LanguageUtil.get(pageContext, "back") %>' onClick="self.location = '<%= redirect %>';">
</div>
	
</form>