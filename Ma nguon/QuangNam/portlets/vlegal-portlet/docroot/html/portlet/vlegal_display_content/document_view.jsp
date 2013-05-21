<%@page import="com.liferay.portal.kernel.util.Constants"%>
<%@page import="javax.portlet.PortletRequest"%>
<%@page import="com.liferay.portlet.PortletURLFactoryUtil"%>
<%@taglib uri="http://www.vietsoftware.com/tld" prefix="vportal" %>
<%@ include file="/html/portlet/vlegal_display_content/init.jsp" %>
<%@ include file="/html/portlet/vlegal_display_content/javascript.jsp" %>
<%@include file="/html/portlet/vlegal_display_content/css.jsp" %>

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

	
<script type="text/javascript">
var flag = false;
function <portlet:namespace/>hideInfoDocument(){
	if(flag == false){
		document.getElementById('<portlet:namespace/>detail_doc').style.display ="";
		document.<portlet:namespace/>fm.<portlet:namespace/>hide_show.src = "/vlegal-portlet/html/portlet/vlegal_display_content/images/miximize_search.gif";		
		flag = true;
	}else{
		document.getElementById('<portlet:namespace/>detail_doc').style.display ="none";
		document.<portlet:namespace/>fm.<portlet:namespace/>hide_show.src = "/vlegal-portlet/html/portlet/vlegal_display_content/images/maximize_search.gif";
		flag = false;
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
	List otherDocuments = null;
	 
	
	try {
		document = VLegalDocumentServiceUtil.getDocument(docId);
		org = VLegalOrgServiceUtil.getOrg(document.getOrgId());
		type = VLegalTypeServiceUtil.getType(document.getTypeDocId());
		field = VLegalFieldServiceUtil.getVField(document.getFieldId());
		otherDocuments = VLegalDocumentServiceUtil.getContDocumentByF_O_T(groupId, document.getTypeDocId(), document.getOrgId(), document.getFieldId(), language,document.getPromulDate(), document.getDocId(), 0, 10);
// 		otherDocuments = VLegalDocumentServiceUtil.getContDocumentByF_O_T(language, document.getTypeDocId(), document.getOrgId(), document.getFieldId(), document.getPromulDate(), document.getDocId(), 0, 10);
	} catch(Exception ex) {
		// Ignore 
	}
	
// 	PortletURL docURL = PortletURLFactoryUtil.create(request,portletSelectId, plId, PortletRequest.RENDER_PHASE);
	PortletURL docURL = renderResponse.createRenderURL();
	docURL.setParameter("jspPage", "/html/portlet/vlegal_display_content/document_view.jsp");
	docURL.setParameter("language",language);
	docURL.setParameter("groupId", String.valueOf(groupId));
	docURL.setParameter(Constants.CMD, "documentview");	
	
	// View By Org
	PortletURL orgURL = PortletURLFactoryUtil.create(request,portletSelectId, plId, PortletRequest.RENDER_PHASE);
	orgURL.setWindowState(WindowState.NORMAL);
	orgURL.setParameter("jspPage", "/html/portlet/vlegal_display_content/view.jsp");
	orgURL.setParameter("language", language);
	orgURL.setParameter("groupId", String.valueOf(groupId));
	orgURL.setParameter("cmd","viewBy");
	orgURL.setParameter("organizationid",document.getOrgId());	
	
	// View By Type
	PortletURL typeURL = PortletURLFactoryUtil.create(request,portletSelectId, plId, PortletRequest.RENDER_PHASE);
	typeURL.setWindowState(WindowState.NORMAL);
	typeURL.setParameter("jspPage", "/html/portlet/vlegal_display_content/view.jsp");
	typeURL.setParameter("language", language);
	typeURL.setParameter("groupId", String.valueOf(groupId));
	typeURL.setParameter("cmd","viewBy");
	typeURL.setParameter("typedocid", document.getTypeDocId() );
	
	List departments = (List)VLegalDDRelServiceUtil.getRelByDoc(docId);	
%>
<form name="<portlet:namespace/>fm" >
<div class="document_view" style="margin-right: 4px;">	
<table cellspacing="0" cellpadding="0" border="0" align="left" width="100%">
	<tr>
		<td width="<%=titlePortlet.length() + 180%>" align="center" class="header_vlegal_view"><%=titlePortlet%></td>
	</tr>
</table>

	
<table width="100%" border="0" cellspacing="0" cellpadding="0">
<tr>
	<td class="text_none" style="padding-left: 5px; padding-right: 5px;">
	<table class="text_none" width="100%" cellspacing="0" cellpadding="0" border="0" >
	<tr><td><td/></tr>
	
	<tr>
		<td style="padding-top:5px;">
		<table width="100%" cellspacing="0" cellpadding="0" border="0">
		<tr id="<portlet:namespace/>detail_doc" >
			<td>
				<table width="100%" cellspacing="1" cellpadding="3" bordercolor="#7994cb" border="1" bordercolor="#7994cb">
				<tr height="25">
					<th width="28%"><div align="center"><%= LanguageUtil.get(pageContext, "so") %></div></th>
					<td width="72%">&nbsp;<%= document.getNum()%></td>
				</tr>
				<tr height="25">
					<th><div align="center"><%= LanguageUtil.get(pageContext, "ki.hieu") %></div></th>
					<td>&nbsp;<%= document.getSymbol()%></td>
				</tr>
				<tr height="25">
					<th><div align="center"><%= LanguageUtil.get(pageContext, "ngay.ban.hanh") %></div></th>
					<td>&nbsp;<%= VLegalUtil.dateParser(document.getPromulDate())%></td>    
				</tr>
				<tr height="25">	
					<th><div align="center"><%= LanguageUtil.get(pageContext, "nguoi.ki") %></div></th>
					<td>&nbsp;<%= document.getSignerRels()%></td>
				</tr>
				<tr height="25">
					<th><div align="center"><%= LanguageUtil.get(pageContext, "trich.yeu") %></div></th>
					<td>&nbsp;<%= document.getSummary()%></td>    	
				</tr>
				<tr height="25">
					<th><div align="center"><%= LanguageUtil.get(pageContext, "co.quan.ban.hanh") %></div></th>
					<td>&nbsp;<%= org.getName()%></a></td> 
				</tr>
				<tr height="25">   	
					<th><div align="center"><%= LanguageUtil.get(pageContext, "phan.loai") %></div></th>
					<td>&nbsp;<%= type.getName()%></td>
				</tr>
				<tr height="25">
					<th><div align="center">L&#297;nh v&#7921;c</div></th>
					<td>&nbsp;<%= field.getName()%></td>
				</tr>
				</table>
			</td>
		</tr>
		</table>
		<td/>
	</tr>
		
	<tr><td>&nbsp;</td></tr>

	<c:if test="<%= document.getHasAttachment()%>">
	<tr><td>&nbsp;</td></tr>
	<tr>			
		<td>	<!-- CAC FILE DINH KEM -->
		<table>
		<tr>
			<td style="padding-left:5px;"><b><%= LanguageUtil.get(pageContext, "tep.tin.dinh.kem") %> :</b></td>
			<td style="padding-left:5px;">
			<vportal:file-download entryId="<%= Long.parseLong(document.getDocId()) %>" entryClass="<%= VLegalDocument.class %>" />
	</td>
		</tr>
		</table>
		</td>
	</tr>
	</c:if>
		
	<tr>
		<td style="padding-right:5px;padding-left:5px;">
			<p align="right"><img src="/vlegal-portlet/html/portlet/images/fileprint.png"/>&nbsp;<a href="javascript:expandingWindow('/html/portlet/vlegal_display_content/document_print.jsp?printDocId=<%=document.getDocId()%>');">In v&#259;n b&#7843;n</a></p>
			<table width="100%" cellpadding="0" border="0">
			<tr>
				<td><%= document.getContent() %></td>
			</tr>
			</table>
			<p align="right"><img src="/vlegal-portlet/html/portlet/images/fileprint.png"/>&nbsp;<a href="javascript:expandingWindow('/html/portlet/vlegal_display_content/document_print.jsp?printDocId=<%=document.getDocId()%>');">In v&#259;n b&#7843;n</a></p>
		</td>
	</tr>		
	</table>    	
	</td>    	
</tr>
</table>

<% 
	if (otherDocuments.size() > 0 && otherDocuments != null) 
	{
%>	<!-- CAC VAN BAN LIEN QUAN -->
<table width="100%" cellspacing="0" cellpadding="0" border="0">
  <tr>    
	<td style="padding-left:5px"><strong><%= LanguageUtil.get(pageContext, "cac.van.ban.khac") %></strong>
		<%
				for(int i=0; i<otherDocuments.size(); i++) 
				{
					VLegalDocument otherDoc = (VLegalDocument) otherDocuments.get(i);
						docURL.setParameter("docid", otherDoc.getDocId());
		%>
			<p>
			<%	
			if (document.getSummary().length()<50)
			{	
			%>	
				<a class="hover_summary" href="<%= docURL %>"><%=otherDoc.getSummary()%></a> (<%=dateFormat.format(otherDoc.getPromulDate())%>)
			<%	
			}
			else
			{
				
			%>	
				<a class="hover_summary" href="<%= docURL %>"><%= document.getSummary().substring(0, 150) %></a>... (<%=dateFormat.format(otherDoc.getPromulDate())%>)				
			<%	
			}	
			%>
			</p>
			<%
				}
			%>
	</td>
  </tr>
</table>
<%
	}
}
%>
</div>	

</form>