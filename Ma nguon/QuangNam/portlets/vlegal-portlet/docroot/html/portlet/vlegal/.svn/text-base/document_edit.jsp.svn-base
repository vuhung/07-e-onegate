<%@page import="com.vportal.portlet.vlegal.model.VLegalAttachedMessage"%>
<%@page import="com.liferay.portal.kernel.portlet.LiferayWindowState"%>
<%@page import="com.vportal.portlet.vlegal.InvalidExpiredDateException"%>
<%@page import="com.vportal.portlet.vlegal.InvalidEffectivedDateException"%>
<%@page import="com.vportal.portlet.vlegal.InvalidPromulDateException"%>
<%@page import="com.vportal.portlet.vlegal.InvalidDocSigException"%>
<%@page import="com.vportal.portlet.vlegal.InvalidDocTypeException"%>
<%@page import="com.vportal.portlet.vlegal.InvalidDocOrgException"%>
<%@page import="com.vportal.portlet.vlegal.InvalidDocFieldException"%>
<%@page import="com.vportal.portlet.vlegal.DuplicateDocNumExceptionException"%>
<%@page import="com.vportal.portlet.vlegal.InvalidDocSummaryExceptionException"%>
<%@page import="com.vportal.portlet.vlegal.InvalidDocNumExceptionException"%>
<%@page import="com.vportal.portlet.vlegal.InvalidDocSymbolExceptionException"%>
<%@page import="com.liferay.portal.kernel.util.Constants"%>
<%@page import="com.liferay.portal.kernel.util.PropsUtil"%>
<%@page import="com.vportal.portal.service.AttachmentServiceUtil"%>
<%@page import="com.vportal.portlet.vlegal.service.VLegalTagsServiceUtil"%>
<%@page import="com.vportal.portlet.vlegal.model.VLegalDSRel"%>
<%@page import="java.util.Iterator"%>
<%@page import="com.vportal.portlet.vlegal.service.VLegalDFRelServiceUtil"%>
<%@page import="com.vportal.portlet.vlegal.service.VLegalDSRelServiceUtil"%>
<%@page import="com.vportal.portlet.vlegal.service.VLegalAttachedMessageServiceUtil"%>
<%@page import="java.util.ArrayList"%>
<%@page import="com.vportal.portal.util.WebKeysExt"%>
<%@page import="com.vportal.portlet.vlegal.model.VLegalDraftDocument"%>

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
 * Copyright (c) 2000-2012 Liferay, Inc. All rights reserved.
 *
 */
%>
<%@ include file="/html/portlet/vlegal/init.jsp" %>
	
<%
String redirect = ParamUtil.getString(request, "redirect");

String docid = ParamUtil.getString(request, "docid");

// VLegalDocument document = (VLegalDocument) request.getAttribute(WebKeysExt.VLEGAL_DOCUMENT);

VLegalDocument document =  null;

if(docid != "")
{
	try
	{
		document = VLegalDocumentServiceUtil.getDocument(groupId, docid);
	}catch(Exception ex)
	{
		
	}
}

VLegalDraftDocument ldraft = (VLegalDraftDocument)request.getAttribute(WebKeysExt.VLEGAL_DRAFT);

String docId = ((document != null) ? document.getDocId() : StringPool.BLANK);
String docSummary = ((document != null) ? document.getSummary() : StringPool.BLANK);
docSummary = ((ldraft != null) ? ldraft.getTitle() : docSummary);

String docContent = ((document != null) ? document.getContent() : StringPool.BLANK);
docContent = ((ldraft != null) ? ldraft.getContent() : docContent);

String docTypeId = ((document != null) ? document.getTypeDocId() : StringPool.BLANK);
docTypeId = ((ldraft != null) ? ldraft.getTypeId() : docTypeId);

String docOrgId = ((document != null) ? document.getOrgId() : StringPool.BLANK);

String docFieldId = ((document != null) ? document.getFieldId() : StringPool.BLANK);
docFieldId = ((ldraft != null) ? ldraft.getFieldId() : docFieldId);

String docCode = ((document != null) ? document.getDocCode() : StringPool.BLANK);
docCode = ((ldraft != null) ? ldraft.getDocCode() : docCode);

String docNum =  ((document != null) ? document.getNum() : StringPool.BLANK);
String docSymbol =  ((document != null) ? document.getSymbol() : StringPool.BLANK);

Date promulDate = ((document != null) ? document.getPromulDate() : null);
Date effectivedDate = ((document != null) ? document.getEffectivedDate() : null);
Date expiredDate = ((document != null) ? document.getExpiredDate() : null);	

List attachedMessages = new ArrayList();
List listExistSigner =  new ArrayList();
List listExistFieldRels =  new ArrayList();
List listSigner = new ArrayList();
List listSigner2 = new ArrayList();
List listField = new ArrayList();

if (Validator.isNotNull(docId)) {
	attachedMessages = VLegalAttachedMessageServiceUtil.getMessages(docId);
	listExistSigner = VLegalDSRelServiceUtil.getRelByDoc(docId);
	listExistFieldRels = VLegalDFRelServiceUtil.getRelByDoc(docId);
}
String strSigIds = "";
String strFieldIds = "";
Iterator itr = listExistSigner.iterator();

listSigner2 = VLegalSignerServiceUtil.getAllSignerByG_L(groupId, language);

List listField2 = VLegalFieldServiceUtil.getVFieldByS_L(groupId, true, language);

boolean equa = false;
for(int i=0; i<listSigner2.size(); i++){
	VLegalSigner vSigner = (VLegalSigner)listSigner2.get(i);
	for(int j=0; j<listExistSigner.size(); j++){
		VLegalDSRel vDs = (VLegalDSRel) listExistSigner.get(j);		
		if(vSigner.getSigId().equals(vDs.getSigId())){
			equa = true;
		}
	}
	if(!equa) listSigner.add(vSigner);
	equa = false;
}

boolean equa2 = false;
for(int i=0; i<listField2.size(); i++){
	VLegalField vField = (VLegalField)listField2.get(i);
	for(int j=0; j<listExistFieldRels.size(); j++){
		VLegalDFRel vDf = (VLegalDFRel) listExistFieldRels.get(j);		
		if(vField.getFieldId().equals(vDf.getFieldId())){
			equa2 = true;
		}
	}
	if(!equa2) listField.add(vField);
	equa2 = false;
}

Iterator itr2 = listExistSigner.iterator();
while (itr2.hasNext()) {
	VLegalDSRel vDs = (VLegalDSRel) itr2.next();
	strSigIds += vDs.getSigId() + ",";
}
Iterator itr3 = listExistFieldRels.iterator();
while (itr3.hasNext()) {
	VLegalDFRel vDf = (VLegalDFRel) itr3.next();
	strFieldIds += vDf.getFieldId() + ",";
}

List listTag = null;
try {
	listTag = VLegalTagsServiceUtil.getTag_Status(portletGroupId.longValue(), true);
} catch (Exception ex) {
}
if(listTag==null) {
	listTag = new ArrayList();
}

List listOrg = VLegalOrgServiceUtil.getAllOrgByS_L(portletGroupId.longValue(), true, language);
if(listOrg==null) {
	listOrg = new ArrayList();
}

List listType = VLegalTypeServiceUtil.getTypesByL_S(portletGroupId.longValue(), language, true);
if(listType==null) {
	listType = new ArrayList();
}
	
List attachmentList = null;
if(Validator.isNotNull(docId)) {
	attachmentList = AttachmentServiceUtil.getAttachments(Long.parseLong(docId), VLegalDocument.class);
} else {
	
}
if (attachmentList == null) {
	attachmentList = new ArrayList();
}

int maxAttachment = GetterUtil.get(PropsUtil.get(PropsUtilExt.VLEGAL_DOCUMENT_MAX_ATTACHMENT), 5);

String strListTags = "1,2";

Calendar currentDate = new GregorianCalendar();
	
int promulYear = currentDate.get(Calendar.YEAR);
int promulMonth = currentDate.get(Calendar.MONTH);
int promulDay = currentDate.get(Calendar.DATE);

int effectivedYear = currentDate.get(Calendar.YEAR);
int effectivedMonth = currentDate.get(Calendar.MONTH);
int effectivedDay = currentDate.get(Calendar.DATE);

int expiredYear = currentDate.get(Calendar.YEAR);
int expiredMonth = currentDate.get(Calendar.MONTH);
int expiredDay = currentDate.get(Calendar.DATE);

try {
	if (Validator.isNotNull(document)){
		promulYear = document.getPromulDate().getYear() + 1900;
		promulMonth = document.getPromulDate().getMonth();
		promulDay = document.getPromulDate().getDate();
		
		effectivedYear = document.getEffectivedDate().getYear() + 1900;
		effectivedMonth = document.getEffectivedDate().getMonth();
		effectivedDay = document.getEffectivedDate().getDate();
		
		expiredYear = document.getExpiredDate().getYear() + 1900 ;
		expiredMonth = document.getExpiredDate().getMonth();
		expiredDay = document.getExpiredDate().getDate();
	}
} catch(Exception ex){}


int promulDateDay = ParamUtil.getInteger(request, "promulDay", promulDay);
int promulDateMonth = ParamUtil.getInteger(request, "promulMonth", promulMonth);
int promulDateYear = ParamUtil.getInteger(request, "promulYear", promulYear);	

int effectivedDateDay = ParamUtil.getInteger(request, "effectivedDay", effectivedDay);
int effectivedDateMonth = ParamUtil.getInteger(request, "effectivedMonth", effectivedMonth);
int effectivedDateYear = ParamUtil.getInteger(request, "effectivedYear", effectivedYear);

int expiredDateDate = ParamUtil.getInteger(request,"expiredDay", expiredDay);
int expiredDateMonth = ParamUtil.getInteger(request,"expiredMonth", expiredMonth);
int expiredDateYear = ParamUtil.getInteger(request,"expiredYear" , expiredYear);

%>
<script type="text/javascript">

	pathToImages = "<%= request.getContextPath() %>html/themes/classic/images/edir/calendar/";	
	function <portlet:namespace />disableInputDate() {		
		var checkbox = document.getElementById('<portlet:namespace />neverExpired');
		var expiredMonth = document.getElementById('<portlet:namespace />expiredMonth');
		var expiredDay = document.getElementById('<portlet:namespace />expiredDay');
		var expiredYear = document.getElementById('<portlet:namespace />expiredYear');
		
		if (checkbox.checked){
			expiredMonth.disabled = true;
			expiredDay.disabled = true;
			expiredYear.disabled = true;
		}else {
			expiredMonth.disabled = false;
			expiredDay.disabled = false;
			expiredYear.disabled = false;
		}		
	};
	
	function <portlet:namespace />selectTags(){
		
		var strId = "";
		var strName = "";
		var arrSelectCats = document.getElementsByName("listTagBox");
		var nums = arrSelectCats.length;
		
		for(var i = 0;i < nums;i++){
			if(arrSelectCats[i].checked){
				strId += arrSelectCats[i].value + ",";
				strName += document.getElementById("cat_name" + arrSelectCats[i].id).innerHTML + ",";
			}
		}
		
		document.getElementById('<portlet:namespace />tagids').value = strId;		
		document.getElementById('<portlet:namespace />listselectedtags').innerHTML = strName;	
		document.getElementById('<portlet:namespace />tags_box').innerHTML = <portlet:namespace />tagsbox.innerHTML;	
		
		Alerts.killAlert(<portlet:namespace />tagsbox);
	};
	
	function <portlet:namespace />selectTagsBf(){		
		var strId = "";
		var strName = "<ul>";
		var arrSelectCats = document.getElementsByName("listtagbox");
		var nums = arrSelectCats.length;
		
		for(var i = 0;i < nums;i++){
			if(arrSelectCats[i].checked){
				strId += arrSelectCats[i].value + ",";
				strName += "<li>" + document.getElementById("cat_name" + arrSelectCats[i].id).innerHTML + "</li>";
			}
		}
		
		strName += "</ul>"
		
		document.getElementById('<portlet:namespace />categoryids').value = strId;		
		document.getElementById('<portlet:namespace />listselectedtags').innerHTML = strName;	
		
		Alerts.killAlert(<portlet:namespace />catsbox);
	};
	function <portlet:namespace />showTagsBox(){
		document.getElementById('<portlet:namespace />tags_box').style.display = "";
	};
	function <portlet:namespace />closeTagsBox(){
		document.getElementById('<portlet:namespace />tags_box').style.display = "none";
	};
	
	function <portlet:namespace />addTag(){
		var tagName = document.getElementById("<portlet:namespace />tagname").value;
		var groupId = document.getElementById("<portlet:namespace />groupId").value;
		var url =
			"/site/vlegal/ajax?" +
			"cmd=add_tag&tagname=" + tagName +
			"&groupId=" + groupId;
		
		AjaxUtil.request(
			url, 
			{onComplete:function(xmlHttpReq){
				alert("Add successful");
			}
		});
	};
	function <portlet:namespace />checkReplaceDoc(){
		var num = document.getElementById("<portlet:namespace />repnum").value;
		var symbol = document.getElementById("<portlet:namespace />repsymbol").value;
		var groupId = document.getElementById("<portlet:namespace />groupId").value;
		var url =
			"/c/vlegal/ajax?" +
			"cmd=check_document&repnum=" + num +
			"&repsymbol=" + symbol +
			"&groupId=" + groupId;
		AjaxUtil.request(
			url, 
			{onComplete:function(xmlHttpReq){
				var jo = $J(xmlHttpReq.responseText);
				var joStatus = jo.status;
				var arrNum = jo.listnum.split("|");
				var arrSymbol = jo.listsymbol.split("|");
				var arrSummary = jo.listsummary.split("|");
				var content = "";
				for(i=0; i<arrNum.length-1; i++) {
					content += "<div style=\"padding:3px; cursor:pointer;\" class=\"portlet-section-body\" onclick=<portlet:namespace />mapReplaceDoc('"+arrNum[i]+"','"+ arrSymbol[i]+"') >" + arrNum[i] + "/" + arrSymbol[i] + "</div>";
				}
				if(joStatus==1) {
					document.getElementById("<portlet:namespace />repstatus").innerHTML = "<img src=\"<%=themeDisplay.getPathThemeImage()%>/vlegal/dot.png\" border=\"0\" />";
					document.<portlet:namespace />fm.<portlet:namespace />submitForm.disabled=false;
					document.getElementById("<portlet:namespace />search_replacedoc_result").style.display = "none";
				} else {
					document.getElementById("<portlet:namespace />repstatus").innerHTML = "";
					document.getElementById("<portlet:namespace />search_replacedoc_result").style.display = "";
					document.getElementById("<portlet:namespace />search_replacedoc_result").innerHTML = content;
					document.<portlet:namespace />fm.<portlet:namespace />submitForm.disabled=true;
				}
			}
		});
		if((num.length<=0) && (symbol.length<=0)) {
			document.<portlet:namespace />fm.<portlet:namespace />submitForm.disabled=false;
		}
	};
	
	function <portlet:namespace />mapReplaceDoc(num, symbol) {
		document.<portlet:namespace />fm.<portlet:namespace />repnum.value= num;
		document.<portlet:namespace />fm.<portlet:namespace />repsymbol.value= symbol;
		document.getElementById("<portlet:namespace />search_replacedoc_result").style.display = "none";
		document.<portlet:namespace />fm.<portlet:namespace />submitForm.disabled=false;
		document.getElementById("<portlet:namespace />repstatus").innerHTML = "<img src=\"<%=themeDisplay.getPathThemeImage()%>/vlegal/dot.png\" border=\"0\" />";
	}
	
	// Save Document and approve or publish
	function <portlet:namespace />saveDocument() {
		
		var obj1 = document.<portlet:namespace />fm.<portlet:namespace />repDoc;
		var listRepDocs = "";			
		for (var i=0;i<obj1.length;i++) {		  	  		
		  listRepDocs += obj1[i].value + (i<obj1.length - 1? ",":"");
		}
		  
		document.<portlet:namespace />fm.<portlet:namespace />listRepDocs.value = listRepDocs; 
		document.<portlet:namespace />fm.<portlet:namespace /><%= Constants.CMD %>.value = "<%= document == null ? Constants.ADD : Constants.UPDATE %>";
		document.<portlet:namespace />fm.<portlet:namespace />content.value = parent.<portlet:namespace />content.getHTML();
		submitForm(document.<portlet:namespace />fm);
	};
	
	function <portlet:namespace />initContentEditor() {
		document.<portlet:namespace />fm.<portlet:namespace />content.value = "<%= UnicodeFormatter.toString(docContent) %>";
		return "<%= UnicodeFormatter.toString(docContent) %>";
	};
	
	function <portlet:namespace />moveSigner(){
		 Liferay.Util.moveItem(document.<portlet:namespace />fm.select_signer_result, document.<portlet:namespace />fm.select_signer, false);
		 document.<portlet:namespace />fm.<portlet:namespace />signerIds.value = Liferay.Util.listSelect(document.getElementById('select_signer'));
	};
	
	function <portlet:namespace />removeSigner(){
		 Liferay.Util.moveItem(document.<portlet:namespace />fm.select_signer, document.<portlet:namespace />fm.select_signer_result, false);
		 document.<portlet:namespace />fm.<portlet:namespace />signerIds.value = Liferay.Util.listSelect(document.getElementById('select_signer'));
	};
	
	function <portlet:namespace />showSigerBox(){
		var tableSignerBox = document.getElementById("select_signer_box");
		var srcIcon = document.getElementById("iconExpand");
		if(tableSignerBox.style.display == "block") {
			tableSignerBox.style.display = "none";
			srcIcon.src = "<%=themeDisplay.getPathThemeImage()%>/arrows/02_plus.png";
		} else {
			tableSignerBox.style.display = "block";
			srcIcon.src = "<%=themeDisplay.getPathThemeImage()%>/arrows/02_minus.png";
		}
		
	};
	function <portlet:namespace />moveField(){
		 Liferay.Util.moveItem(document.<portlet:namespace />fm.select_fieldrels_result, document.<portlet:namespace />fm.select_fieldrels, false);
		 document.<portlet:namespace />fm.<portlet:namespace />fieldids.value = Liferay.Util.listSelect(document.getElementById('select_fieldrels'));
	};
	
	function <portlet:namespace />removeField(){
		 Liferay.Util.moveItem(document.<portlet:namespace />fm.select_fieldrels, document.<portlet:namespace />fm.select_fieldrels_result, false);
		 document.<portlet:namespace />fm.<portlet:namespace />fieldids.value = Liferay.Util.listSelect(document.getElementById('select_fieldrels'));
	};
	
	function <portlet:namespace />showFieldBox(){
		var tableSignerBox = document.getElementById("select_field_box");
		var srcIcon = document.getElementById("iconExpand2");
		if(tableSignerBox.style.display == "") {
			tableSignerBox.style.display = "none";
			srcIcon.src = "<%=themeDisplay.getPathThemeImage()%>/arrows/02_plus.png";
		} else {
			tableSignerBox.style.display = "";
			srcIcon.src = "<%=themeDisplay.getPathThemeImage()%>/arrows/02_minus.png";
		}
		
	};
</script>

<c:if test='<%= docId.equals("")%>'>
	<liferay-ui:tabs names="vlegal-add-new-document" backURL="<%= redirect %>" />
</c:if>
<c:if test='<%= !docId.equals("")%>'>
	<liferay-ui:tabs names="vlegal-update-document" backURL="<%= redirect %>" />
</c:if>

<%
	PortletURL p = renderResponse.createActionURL();
	p.setParameter(ActionRequest.ACTION_NAME, "updateDocument");
%>

<form action="<%= p.toString()  %>" " method="post" name="<portlet:namespace />fm" 
	onSubmit="<portlet:namespace />saveDocument(); return false;" enctype="multipart/form-data">
	
<input name="<portlet:namespace /><%= Constants.CMD %>" type="hidden" value="">
<input name="<portlet:namespace />redirect" type="hidden" value="<%= redirect %>">
<input name="<portlet:namespace />docid" type="hidden" value="<%= (document != null) ? docId : "" %>">
<input name="<portlet:namespace />groupId" id="<portlet:namespace />groupId" type="hidden" value="<%= groupId %>">
<input name="<portlet:namespace />tagids" id="<portlet:namespace />tagids" type="hidden" value="<%= strListTags %>">
<input name="<portlet:namespace />signerIds" id="<portlet:namespace />signerIds" type="hidden" value="<%=strSigIds%>">
<input name="<portlet:namespace />fieldids" id="<portlet:namespace />fieldids" type="hidden" value="<%=strFieldIds%>">
<input name="<portlet:namespace />doccode" id="<portlet:namespace />doccode" type="hidden" value="<%=docCode%>">
<input name="<portlet:namespace />language" id="<portlet:namespace />language" type="hidden" value="<%=language%>">
<input name="<portlet:namespace />listRepDocs" type="hidden" value="" />	

<liferay-ui:error exception="<%= InvalidDocSymbolExceptionException.class %>" message="portlet.vlegal.document.exception.please-enter-a-valid-document-symbol" />
<liferay-ui:error exception="<%= InvalidDocNumExceptionException.class %>" message="portlet.vlegal.document.exception.please-enter-a-valid-document-num" />
<liferay-ui:error exception="<%= InvalidDocSummaryExceptionException.class %>" message="portlet.vlegal.document.exception.please-enter-a-valid-document-summary" />
	
<liferay-ui:error exception="<%= DuplicateDocNumExceptionException.class %>" message="portlet.vlegal.document.exception.please-enter-another-document-num" />

<liferay-ui:error exception="<%= InvalidDocFieldException.class %>" message="portlet.vlegal.document.exception.please-enter-valid-field" />
<liferay-ui:error exception="<%= InvalidDocOrgException.class %>" message="portlet.vlegal.document.exception.please-enter-valid-org" />
<liferay-ui:error exception="<%= InvalidDocTypeException.class %>" message="portlet.vlegal.document.exception.please-enter-valid-type" />
<liferay-ui:error exception="<%= InvalidDocSigException.class %>" message="portlet.vlegal.document.exception.please-enter-valid-signer" />


<liferay-ui:error exception="<%= InvalidPromulDateException.class %>" message="portlet.vlegal.document.exception.please-enter-valid-promul-date" />
<liferay-ui:error exception="<%= InvalidEffectivedDateException.class %>" message="portlet.vlegal.document.exception.please-enter-valid-effective-date" />
<liferay-ui:error exception="<%= InvalidExpiredDateException.class %>" message="portlet.vlegal.document.exception.please-enter-valid-expried-date" />


<table width="100%" border="0" cellspacing="2" cellpadding="2">
  <tr>
    <td valign="top">
		<table width="98%" border="0" cellspacing="5" cellpadding="2">
		  <tr>
			<td>
				<fieldset>
					<legend><strong><%= LanguageUtil.get(pageContext, "portlet.vlegal.document.num-symbol") %> </strong> </legend>
					<table width="100%" border="0" cellspacing="0" cellpadding="0">
					  <tr>
						<td width="50%"><%= LanguageUtil.get(pageContext, "portlet.vlegal.document.num") %> </td>
						<td width="50%"><%= LanguageUtil.get(pageContext, "portlet.vlegal.document.symbol") %> </td>
					  </tr>
					  <tr>
						<td><input class="form-text" type="text" style="width: 120px; font-size:15px; font-weight:bold" name="<portlet:namespace />num" value="<%= docNum %>" /></td>
						<td><input class="form-text" type="text" style="width: 120px; font-size:15px; font-weight:bold" name="<portlet:namespace />symbol" value="<%= docSymbol %>" /></td>
					  </tr>
					</table>
				</fieldset>		
			</td>
		  </tr>
		
		  <tr>
			<td>
				<fieldset>
					<legend><strong><%= LanguageUtil.get(pageContext, "portlet.vlegal.document.summary") %></strong> </legend>
					<textarea name="<portlet:namespace />summary" class="form-text" style="width: 98%; height:60px;"><%= docSummary %></textarea>
				</fieldset>		 
				</td>
		  </tr>
		  <tr>
			<td>
			<fieldset>			
				<table width="100%">				
				<tr height="30">
					<td width="30%">
						<b><%= LanguageUtil.get(pageContext, "portlet.vlegal.document.promul-date") %></b></td>					
					<td><liferay-ui:input-date
						disableNamespace="<%= false %>"
						monthParam="promulMonth"
						monthValue="<%= promulMonth %>"
						dayParam="promulDay"
						dayValue="<%= promulDay %>"
						yearParam="promulYear"
						yearValue="<%= promulYear %>"
						yearRangeStart="<%= curYear-10 %>"
						yearRangeEnd="<%= curYear+10 %>"
						firstDayOfWeek="<%= currentDate.getFirstDayOfWeek() - 1 %>"
						disabled="<%= false %>"	/></td>
					<td>&nbsp;</td>
				</tr>
				<tr height="30">
					<td>
						<b><%= LanguageUtil.get(pageContext, "portlet.vlegal.document.effective-date") %></b></td>					
					<td>
						<liferay-ui:input-date
							disableNamespace="<%= false %>"
							monthParam="effectivedMonth"
							monthValue="<%= effectivedMonth %>"
							dayParam="effectivedDay"
							dayValue="<%= effectivedDay %>"
							yearParam="effectivedYear"
							yearValue="<%= effectivedYear %>"
							yearRangeStart="<%= curYear-10 %>"
							yearRangeEnd="<%= curYear+10 %>"
							firstDayOfWeek="<%= currentDate.getFirstDayOfWeek() - 1 %>"
							disabled="<%= false %>"	/></td>
						<td>&nbsp;</td>				
				</tr>
				<tr height="30">
					<td>
						<b><%= LanguageUtil.get(pageContext, "portlet.vlegal.document.expire-date") %></b></td>										
					<td>
						<liferay-ui:input-date
							disableNamespace="<%= false %>"
							monthParam="expiredMonth"
							monthValue="<%= expiredMonth %>"
							dayParam="expiredDay"
							dayValue="<%= expiredDay %>"
							yearParam="expiredYear"
							yearValue="<%= expiredYear %>"
							yearRangeStart="<%= curYear-10 %>"
							yearRangeEnd="<%= curYear+10 %>"
							firstDayOfWeek="<%= currentDate.getFirstDayOfWeek() - 1 %>"
							disabled="<%=(expiredDate == null)? true:false%>"	/></td>
					<td>
						&nbsp;<input type="checkbox" name="<portlet:namespace/>neverExpired" id="<portlet:namespace/>neverExpired" 
							onClick="javascript:<portlet:namespace />disableInputDate();" <%= (expiredDate == null) ? "checked":""%>/>
						<label for="<portlet:namespace/>neverExpired" >Vô h&#7841;n</label>
		
					</td>
				</tr>				
				</table>		
			</fieldset>		
			</td>
		  </tr>	
		</table>
	</td>
    <td valign="top">
		<fieldset>
			<legend><strong><%= LanguageUtil.get(pageContext, "portlet.vlegal.document.infomation.advance") %></strong> </legend>
			
		<table width="98%" border="0" style="line-height:30px;">
			  <tr>
				<td width="30%"><%= LanguageUtil.get(pageContext, "portlet.vlegal.document.organization") %>: </td>
				<td width="60%">
					<select name="<portlet:namespace />orgid" style="width: 187px">
						<% 	for(int i = 0; i<listOrg.size(); i++) { 
							VLegalOrg vOrg = (VLegalOrg) listOrg.get(i);%>
							<option value="<%=vOrg.getOrgId()%>" <%=docOrgId.equalsIgnoreCase(vOrg.getOrgId()) ? "selected=\"selected\"" : ""%>><%=vOrg.getName()%></option>
						<% } %>
					</select></td>
				<td align="center">
					<img src="<%= themeDisplay.getPathThemeImage() %>/vlegal/add.gif" border="0" title="<%= LanguageUtil.get(pageContext, "portlet.add-org") %>" 
					onClick="var folderWindow = window.open('<portlet:renderURL windowState="<%= LiferayWindowState.POP_UP.toString() %>">
				   	   	<portlet:param name="jspPage" value="/html/portlet/vlegal/org_edit.jsp" />				   	
				   		<portlet:param name="type" value="1" />
				   	   	</portlet:renderURL>', 'person', 'directories=no,height=350,width=670,location=no,menubar=no,resizable=no,scrollbars=yes,status=no,toolbar=no'); void(''); folderWindow.focus();"/>	
				 </td>		
			  </tr>
			  			
			  <tr>
				<td><%= LanguageUtil.get(pageContext, "portlet.vlegal.document.type") %>: </td>
				<td>
					<select name="<portlet:namespace />typeid" style="width: 187px">
						<% 	for(int i = 0; i<listType.size(); i++) {
							VLegalType vType = (VLegalType) listType.get(i);%>
							<option value="<%=vType.getTypeId()%>" <%=docTypeId.equalsIgnoreCase(vType.getTypeId()) ? "selected=\"selected\"" : ""%> ><%=vType.getName()%></option>
						<% } %>
					</select>
				</td>
				<td align="center">
					<img src="<%= themeDisplay.getPathThemeImage() %>/vlegal/add.gif" border="0" title="<%= LanguageUtil.get(pageContext, "portlet.add-type") %>" 
					onClick="var folderWindow = window.open('<portlet:renderURL windowState="<%= LiferayWindowState.POP_UP.toString() %>">
				   	   	<portlet:param name="jspPage" value="/html/portlet/vlegal/type_edit.jsp" />				   	
				   		<portlet:param name="type" value="1" />
				   	   	</portlet:renderURL>', 'person', 'directories=no,height=350,width=670,location=no,menubar=no,resizable=no,scrollbars=yes,status=no,toolbar=no'); void(''); folderWindow.focus();"/>	
				 </td>				
			  </tr>
			  			
			  <tr>
				<td><%= LanguageUtil.get(pageContext, "portlet.vlegal.document.field") %>: </td>
				<td>
					<select name="<portlet:namespace />fieldid" style="width: 187px">
						<% 	for(int i = 0; i<listField.size(); i++) {
							VLegalField vField = (VLegalField) listField.get(i);%>
							<option value="<%=vField.getFieldId()%>" <%=docFieldId.equalsIgnoreCase(vField.getFieldId()) ? "selected=\"selected\"" : ""%>><%=vField.getName()%></option>
						<% } %>
					</select>
				</td>
				<td align="center">
					<img src="<%= themeDisplay.getPathThemeImage() %>/vlegal/add.gif" border="0" title="<%= LanguageUtil.get(pageContext, "portlet.add-field") %>" 
					onClick="var folderWindow = window.open('<portlet:renderURL windowState="<%= LiferayWindowState.POP_UP.toString() %>">
				   	   	<portlet:param name="jspPage" value="/html/portlet/vlegal/field_edit.jsp" />				   	
				   		<portlet:param name="type" value="1" />
				   	   	</portlet:renderURL>', 'person', 'directories=no,height=350,width=670,location=no,menubar=no,resizable=no,scrollbars=yes,status=no,toolbar=no'); void(''); folderWindow.focus();"/>	
				 </td>			
			  </tr>
			  			
			  <tr>
			    <td valign="top"><%= LanguageUtil.get(pageContext, "portlet.vlegal.document.field-relation") %>:</td>
			    <td colspan="2">
					<table width="100%" border="0" cellspacing="0" cellpadding="0">
					  <tr>
						<td width="65%">
							<select name="<portlet:namespace />select_fieldrels" id="select_fieldrels" size="3" style="width: 187px;">
								<%	for(int i = 0; i< listExistFieldRels.size(); i++ ) {
										VLegalDFRel vDf = (VLegalDFRel) listExistFieldRels.get(i);
										VLegalField vField = VLegalFieldServiceUtil.getVField(vDf.getFieldId()); %>
									<option value="<%=vField.getFieldId()%>"><%=vField.getName()%></option>
								<% } %>
							</select></td>
					    <td width="35%" align="center"><a href="javascript:<portlet:namespace />showFieldBox();"><img id="iconExpand2" src="<%=themeDisplay.getPathThemeImage()%>/arrows/02_plus.png" border="0" /></a></td>
					  </tr>
					  			
					  <tr id="select_field_box" style="display:none">
					    <td align="center">
							<a href="javascript: <portlet:namespace />removeField();"><img border="0" height="16" hspace="0" src="<%= themeDisplay.getPathThemeImage() %>/arrows/02_down.png" vspace="2" width="16"></a>
							<a href="javascript: <portlet:namespace />moveField();"><img src="<%=themeDisplay.getPathThemeImage()%>/arrows/02_up.png" border="0" onClick="self.focus();" /></a><br />
							<select name="select_fieldrels_result" size="5" style="width: 187px">
								<% for(int i = 0; i<listField.size(); i++) {
									VLegalField vField = (VLegalField) listField.get(i); %>
									<option value="<%=vField.getFieldId()%>"><%=vField.getName()%></option>
								<% } %>
							</select></td>
				        <td>&nbsp;</td>
					  </tr>
					</table>
				</td>
		      </tr>
		      					
			  <tr>
				<td valign="top"><%= LanguageUtil.get(pageContext, "portlet.vlegal.document.signer") %>: </td>
				<td colspan="2" valign="top">
					<table width="100%" border="0" cellspacing="0" cellpadding="0">
					  <tr>
						<td width="65%">
							<select name="select_signer" id="select_signer" size="3" style="width: 187px;">
								<%
								
								for(int i = 0; i< listExistSigner.size(); i++ ) {
								   try{
										VLegalDSRel vDs = (VLegalDSRel) listExistSigner.get(i);
										VLegalSigner vSigner = VLegalSignerServiceUtil.getSigner(vDs.getSigId());
								%>
									<option value="<%=vSigner.getSigId()%>"><%=vSigner.getFirstName() + " " + vSigner.getLastName()%></option>
								<%
								  }catch(Exception ex){
								   }
								 } 
								 
								 %>
							</select></td>
						<td width="35%" align="center">
							<a href="javascript:<portlet:namespace />showSigerBox();"><img id="iconExpand" src="<%=themeDisplay.getPathThemeImage()%>/arrows/02_plus.png" border="0" /></a></td>
					  </tr>
					</table>

					<table width="100%" border="0" cellspacing="0" cellpadding="0" id="select_signer_box" style="display:none">
					  <tr>
						<td width="65%">
							<table width="100%" border="0" cellspacing="0" cellpadding="0">
							  <tr>
								<td align="center">
									<a href="javascript: <portlet:namespace />removeSigner();"><img border="0" height="16" hspace="0" src="<%= themeDisplay.getPathThemeImage() %>/arrows/02_down.png" vspace="2" width="16"></a>
									<a href="javascript: <portlet:namespace />moveSigner();"><img src="<%=themeDisplay.getPathThemeImage()%>/arrows/02_up.png" border="0" onClick="self.focus();" /></a>								
								</td>
							  </tr>
							</table>
							<select name="select_signer_result" id="select_signer_result" style="width: 187px" size="8">
								<%	for(int i = 0; i< listSigner.size(); i++ ) {
										VLegalSigner vSigner = (VLegalSigner)listSigner.get(i);	%>
									<option value="<%=vSigner.getSigId()%>"><%=vSigner.getFirstName() + " " + vSigner.getLastName()%></option>
								<% } %>
							</select></td>
					    <td width="35%"></td>
					  </tr>
					</table></td>
			  </tr>
			  					
			   <tr>				  					
			   	   <td><%= LanguageUtil.get(pageContext, "portlet.vlegal.document.replace-doc") %>: </td>
			   	   <td>
				   	   	<select name="<portlet:namespace />repDoc" id="<portlet:namespace />repDoc" size="5" style="min-width: 187px">
						<% 
						String[] arrRepDoc = null;
						String listReplace = "";
						try{
								if(document!=null){
								   arrRepDoc = document.getReplaceDoc().split(",");
								   if (Validator.isNotNull(arrRepDoc)){
									for(int i=0;i<arrRepDoc.length;i++){
										VLegalDocument doc = VLegalDocumentServiceUtil.getDocument(arrRepDoc[i]);	
										if(i==0){
											listReplace = doc.getNum()+"/"+doc.getSymbol();
										}else{
											listReplace = listReplace +","+doc.getNum()+"/"+doc.getSymbol();
										}
																		
						%>	
				   	   		<option value="<%= arrRepDoc[i]%>"><%= doc.getNum()%>/<%=doc.getSymbol()%></option>
				  		<%
							}}}} catch(Exception ex){}
				  		%>
				  		</select>	 	
				  	</td>			   
				  	<td>		
				   	   	<input type="button" value="<liferay-ui:message key="select" />" onClick="var folderWindow = window.open('<portlet:renderURL windowState="<%= LiferayWindowState.POP_UP.toString() %>">
					   	   	<portlet:param name="struts_action" value="/vlegal/select_document" />
					   	   	<portlet:param name="documentId" value="<%=docId%>" />
					   	   	<portlet:param name="name" value="repDoc" />
					   	   	</portlet:renderURL>', 'person', 'directories=no,height=640,width=750,location=no,menubar=no,resizable=yes,scrollbars=yes,status=no,toolbar=no'); void(''); folderWindow.focus();" /></td>			   
				    </td>
			   </tr>
			   <c:if test="<%=document!=null && Validator.isNotNull(document.getReplaceDoc())%>">
			   <tr>	
			   		<td>Các v&#259;n b&#7843;n &#273;ã thay th&#7871;: </td>
			   		<td><input type="text" value="<%=listReplace%>" style="width:187px;"></td>	
			   </tr>		
			   </c:if>
		</table>
		</fieldset>
						
		
		<c:if test="<%= (attachedMessages != null) && (attachedMessages.size() > 0) %>">
			<table width="100%" border="0" cellspacing="2" cellpadding="2">
			  <tr>
				<td>
					<fieldset>
						<legend><strong><%= LanguageUtil.get(pageContext, "portlet.vlegal.document.edit.attached-message") %></strong></legend>
						<div class="portlet-msg-info" style="padding: 4px; height:100px; overflow:auto">
							<%
								for (int i = 0; i < attachedMessages.size(); i ++) {
									VLegalAttachedMessage attachedMessage = (VLegalAttachedMessage) attachedMessages.get(i);
									
									// Display...
									out.println("<img src='" + themeDisplay.getPathThemeImage() + "/vlegal/message-notation.png' valign='middle' />");
									out.println("B&#7903;i: <b>" + attachedMessage.getCreatedByUser() + "</b> Lúc: " + dateFormatDateTime.format(attachedMessage.getCreatedDate()) + "<br />");
									out.println(!attachedMessage.getReadMessage() ? ("<b>[" + LanguageUtil.get(pageContext, "portlet.vlegal.document.edit.unread-message") + "]</b> ") : "");
									out.println("<div style=\"padding:3px; font-size:11px;\">" + attachedMessage.getContent() + "</div>");
									if (i < attachedMessages.size() - 1) {
										out.println("<br /><div class=\"beta-separator\"></div>");
									}
									// Update status
									VLegalAttachedMessageServiceUtil.updateMessage(attachedMessage.getMessageId(), true);
								}
							%>
						</div>
					</fieldset>
				</td>
			  </tr>
			</table>
		</c:if>
	</td>
  </tr>
</table>


<table width="100%" border="0" cellspacing="0" cellpadding="0">
  <tr>
    <td colspan="2">
	<br /><div class="beta-separator"></div>
		<strong>N&#7897;i dung v&#259;n b&#7843;n</strong>
		<liferay-ui:input-editor  name='<%= renderResponse.getNamespace() + "content" %>' editorImpl="<%= EDITOR_WYSIWYG_IMPL_KEY_DEFAULT %>" width="100%" height="500" initMethod='<%= renderResponse.getNamespace() + "initContentEditor" %>' />
		<input name="<portlet:namespace />content" type="hidden" />	</td>
    </tr>
  <tr>
</table>
	
<br/>

<table width="100%" border="0" cellspacing="0" cellpadding="0">
<tr>	
	<td>
	<fieldset>
	<legend><strong><liferay-ui:message key="portlet.vlegal.document.attachment" />:</strong></legend>
		<vportal:file-upload entryId="<%= GetterUtil.getLong(docId, 0) %>" entryClass="<%= VLegalDocument.class %>" maxAttachment="<%= maxAttachmentDocument %>"/>
	</fieldset>
	</td>
</tr>
</table>


<br />
<div class="beta-separator"></div>
<div align="center">	
	<input class="portlet-form-button" type="submit" name="<portlet:namespace />submitForm" value='<%= LanguageUtil.get(pageContext, "portlet.vlegal.draft.button.save") %>'>	
	<input class="portlet-form-button" type="button" value='<%= LanguageUtil.get(pageContext, "portlet.vlegal.draft.button.cancel") %>' onClick="self.location = '<%= redirect %>';">	
</div>
</form>

<%!
	public static final String EDITOR_WYSIWYG_IMPL_KEY_DEFAULT = "editor.wysiwyg.default";
	public static final String EDITOR_WYSIWYG_IMPL_KEY_SIMPLE = "editor.wysiwyg.default";
%> 

<c:if test="<%= windowState.equals(WindowState.MAXIMIZED) %>">
	<script type="text/javascript">
		Liferay.Util.focusFormField(document.<portlet:namespace />fm.<portlet:namespace />num);
	</script>
</c:if>	