<%@page import="com.vportal.portlet.vlegal.util.VLegalUtil"%>
<%@page import="com.vportal.portlet.vlegal.util.PortletKeysExt"%>
<%@page import="java.util.Date"%>
<%@page import="com.vportal.portlet.vlegal.service.impl.VLegalDocumentServiceImpl"%>
<%@page import="com.vportal.portlet.vlegal.service.VLegalDocumentServiceUtil"%>
<%@page import="com.liferay.portal.kernel.dao.search.RowChecker"%>
<%@page import="com.liferay.portal.kernel.dao.search.SearchContainer"%>
<%@page import="com.vportal.portlet.vlegal.model.VLegalSigner"%>
<%@page import="com.vportal.portlet.vlegal.model.VLegalField"%>
<%@page import="com.vportal.portlet.vlegal.model.VLegalType"%>
<%@page import="com.vportal.portlet.vlegal.model.VLegalOrg"%>
<%@page import="com.vportal.portlet.vlegal.service.VLegalSignerServiceUtil"%>
<%@page import="com.vportal.portlet.vlegal.service.VLegalFieldServiceUtil"%>
<%@page import="com.vportal.portlet.vlegal.service.VLegalTypeServiceUtil"%>
<%@page import="com.vportal.portlet.vlegal.service.VLegalOrgServiceUtil"%>
<%@page import="com.liferay.portal.kernel.util.Validator"%>
<%@page import="com.liferay.portal.kernel.util.StringPool"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@page import="com.liferay.portal.kernel.util.ParamUtil"%>
<%@page import="java.util.GregorianCalendar"%>
<%@page import="java.util.Calendar"%>
<%@page import="com.vportal.portlet.vlegal.util.permission.ActionKeysExt"%>
<%@page import="com.liferay.portal.service.permission.PortletPermissionUtil"%>
<%@page import="com.liferay.portal.kernel.language.LanguageUtil"%>
<%
/**
 * Copyright (c) 2000-2012 VietSoftware, Inc. All rights reserved.
 *
 */
%>
<script language="javascript">
var flag = true;
function <portlet:namespace/>miximizeSearchAdvance(){
	if(flag == false){
		document.getElementById('<portlet:namespace/>advanced_search').style.display ="";
		document.<portlet:namespace/>fm.<portlet:namespace/>button_custom_search.src = '<%=themeDisplay.getPathThemeImage() + "/vcms/miximize_search.gif" %>';
		document.<portlet:namespace/>fm.<portlet:namespace/>button_custom_search.title = "<%= LanguageUtil.get(pageContext, "portlet.vcms.button.search.miximize") %>";
		flag = true;
	}else{			
		document.getElementById('<portlet:namespace/>advanced_search').style.display ="none";
		document.<portlet:namespace/>fm.<portlet:namespace/>button_custom_search.src = '<%=themeDisplay.getPathThemeImage() + "/vcms/maximize_search.gif" %>';
		document.<portlet:namespace/>fm.<portlet:namespace/>button_custom_search.title = "<%= LanguageUtil.get(pageContext, "portlet.vcms.button.search.maximize") %>";
		flag = false;
	}
}

function <portlet:namespace/>disablePromulDate(){
	var checkPromulDate = document.getElementById('<portlet:namespace/>disablePromulDate');
	var proFrom = document.getElementById('<portlet:namespace/>proFrom');
	if (checkPromulDate.check){
		proForm.style.display = "";
	} else {
		proForm.style.display = "none";		
	}
}

</script>	
	
<%
	
	String tabs2Names = "";
	String tabs2Icons = "";	
	
	if (PortletPermissionUtil.contains(permissionChecker, plid.longValue(), PortletKeysExt.VLEGAL, ActionKeysExt.VIEW_DOCUMENT_APPROVE_PENDING)) {
		tabs2Names += "portlet.vlegal.document.approval-pending";
		tabs2Icons += "vlegal/approval_pending.gif";
	}
	
	if (PortletPermissionUtil.contains(permissionChecker, plid.longValue(), PortletKeysExt.VLEGAL, ActionKeysExt.VIEW_DOCUMENT_PUBLISH_PENDING)) {
		tabs2Names += ",portlet.vlegal.document.publish-pending";
		tabs2Icons += ",vlegal/publish_pending.gif";
	}
	
	if (PortletPermissionUtil.contains(permissionChecker, plid.longValue(), PortletKeysExt.VLEGAL, ActionKeysExt.VIEW_DOCUMENT_PUBLISHED)) {
		tabs2Names += ",portlet.vlegal.document.published";
		tabs2Icons += ",vlegal/published.gif";
	}
	
	// Initial date values
	Calendar currentDate = new GregorianCalendar();
	
	int proFromDay = ParamUtil.getInteger(request, "proFromDay", curDay);
	int proFromMonth = ParamUtil.getInteger(request, "proFromMonth", curMonth);
	int proFromYear = ParamUtil.getInteger(request, "proFromYear", curYear-63);
	
	int proToDay = ParamUtil.getInteger(request, "proToDay", curDay);
	int proToMonth = ParamUtil.getInteger(request, "proToMonth", curMonth);
	int proToYear = ParamUtil.getInteger(request, "proToYear", curYear+10);	
	
	int effFromDay = ParamUtil.getInteger(request,"effFromDay", curDay);
	int effFromMonth = ParamUtil.getInteger(request,"effFromMonth" , curMonth);
	int effFromYear = ParamUtil.getInteger(request,"effFromYear", curYear-63);
	
	int effToDay = ParamUtil.getInteger(request,"effToDay", curDay);
	int effToMonth = ParamUtil.getInteger(request,"effToMonth", curMonth);
	int effToYear = ParamUtil.getInteger(request,"effToYear", curYear+10);
	
	int expFromDay = ParamUtil.getInteger(request, "expFromDay", curDay);
	int expFromMonth = ParamUtil.getInteger(request, "expFromMonth", curMonth);
	int expFromYear = ParamUtil.getInteger(request, "expFromYear", curYear-63);	
	
	int expToDay = ParamUtil.getInteger(request, "expToDay", curDay);
	int expToMonth = ParamUtil.getInteger(request, "expToMonth", curMonth);
	int expToYear = ParamUtil.getInteger(request, "expToYear", curYear+10);	

	// Convert Date...
	Date promulDateFrom  = new GregorianCalendar(proFromYear, proFromMonth, proFromDay).getTime();
	Date promulDateTo = new GregorianCalendar(proToYear, proToMonth, proToDay).getTime();
	
	Date effectiveDateFrom = new GregorianCalendar(effFromYear, effFromMonth, effFromDay).getTime();
	Date effectiveDateTo = new GregorianCalendar(effToYear, effToMonth, effToDay).getTime();
	
	Date expiredDateFrom = new GregorianCalendar(expFromYear, expFromMonth, expFromDay).getTime();
	Date expiredDateTo = new GregorianCalendar(expFromYear, expFromMonth, expFromDay).getTime();
	
	Date forwardDateFrom = null;
	Date forwardDateTo = null;
	
	List typeId = new ArrayList();
	String tId = ParamUtil.getString(request, "typeid", StringPool.BLANK);
	if(Validator.isNotNull(tId))
		typeId.add(tId);
	
	List fieldId = new ArrayList();
	String fId = ParamUtil.getString(request,"fieldid", StringPool.BLANK);
	if(Validator.isNotNull(fId))
		fieldId.add(fId);
		
	List orgId = new ArrayList();
	String oId = ParamUtil.getString(request, "orgid", StringPool.BLANK);
	if(Validator.isNotNull(oId))
		orgId.add(oId);
	
	List sigId = new ArrayList();
	String sId = ParamUtil.getString(request, "sigid", StringPool.BLANK);
	if(Validator.isNotNull(sId))
		sigId.add(sId);
	
	List departId = new ArrayList();
	String dId = ParamUtil.getString(request, "departmentid", StringPool.BLANK);
	
	String keyword = ParamUtil.getString(request,"keyword",StringPool.BLANK);
	Boolean isNum = ParamUtil.getBoolean(request,"keyword-in-num-doc",false);	
	Boolean isSymbol = ParamUtil.getBoolean(request,"keyword-in-symbol-doc",false);
	Boolean isSummary = ParamUtil.getBoolean(request,"keyword-in-summary-doc",true);
	Boolean isContent = ParamUtil.getBoolean(request,"keyword-in-content-doc",false);
	Boolean isPromulDate = ParamUtil.getBoolean(request,"isPromul-date",false);
	Boolean isEffectiveDate = ParamUtil.getBoolean(request,"isEffective-date", false);
	Boolean isExpiredDate = ParamUtil.getBoolean(request,"isExpired-date", false);
	Boolean isForwaredDate = false;
	
	String summary = ParamUtil.getString(request,"summary");
	String selectAndOr = ParamUtil.getString(request,"selectAndOr",StringPool.BLANK);	
	String cmdSearchFlag = ParamUtil.getString(request,"cmd-search-flag",StringPool.BLANK);
	String cmdSearchStatus = ParamUtil.getString(request,"cmd-search-status","0");
		
	String _orgId = ParamUtil.getString(request,"orgid",StringPool.BLANK);	
	String _typeId = ParamUtil.getString(request,"typeid",StringPool.BLANK);
	String _fieldId = ParamUtil.getString(request,"fieldid",StringPool.BLANK);
	String _sigId = ParamUtil.getString(request,"sigid",StringPool.BLANK);	
	String _departId = ParamUtil.getString(request,"departmentid", StringPool.BLANK);
	
	List organizations = new ArrayList();	// Get all active organization
	try {
		organizations = VLegalOrgServiceUtil.getAllOrgByS_L(portletGroupId.longValue(), true, language);
	} catch (Exception ex) {
		// Ignore..
	}
	
	List types = new ArrayList();	//Get all type
	try {
		types = VLegalTypeServiceUtil.getTypesByL_S(portletGroupId.longValue(), language, true);
	} catch(Exception ex) {
		// Ignore
	}
	
	List fields = new ArrayList();	//Get alll field
	try {
		fields = VLegalFieldServiceUtil.getVFieldByS_L(portletGroupId.longValue(), true,language);
	} catch(Exception ex){
		// Ignore
	}	
	
	List signers = new ArrayList();	//Get all signer
	try {
		signers = VLegalSignerServiceUtil.getAllByG_L_S(portletGroupId.longValue(), language, true);
	} catch(Exception ex) {
		// Ignore
	}
	
// 	List listDepartment = new ArrayList();	//Get all department
// 	try {
// 		listDepartment = (List)EDDepartmentLocalServiceUtil.getDepartmentsByL_G(language, groupId);
// 	} catch(Exception ex) {
// 		// Ignore
// 	}

%>
<liferay-ui:tabs names="<%= tabs2Names %>" param="tabs2" url="<%= portletURL.toString() %>" />

<c:if test='<%= (tabs2.equals("portlet.vlegal.document.approval-pending"))%>'>
	<input type="hidden" name="<portlet:namespace />cmd-search-status" value="0"/>
</c:if>
<c:if test='<%= (tabs2.equals("portlet.vlegal.document.publish-pending"))%>'>
	<input type="hidden" name="<portlet:namespace />cmd-search-status" value="1"/>
</c:if>
<c:if test='<%= (tabs2.equals("portlet.vlegal.document.published"))%>'>
	<input type="hidden" name="<portlet:namespace />cmd-search-status" value="2"/>
</c:if>

<input type="hidden" name="<portlet:namespace />cmd-search-flag" value="true"/>	
<input type="hidden" name="<portlet:namespace />_orgId" value="<%= (Validator.isNotNull(_orgId))?_orgId : ""%>"/>
<input type="hidden" name="<portlet:namespace />_typeId" value="<%= (Validator.isNotNull(_typeId))?_typeId : ""%>"/>
<input type="hidden" name="<portlet:namespace />_fieldId" value="<%= (Validator.isNotNull(_fieldId))?_fieldId : ""%>"/>
<input type="hidden" name="<portlet:namespace />_sigId" value="<%= (Validator.isNotNull(_sigId))?_sigId : ""%>"/>
<input type="hidden" name="<portlet:namespace />_departId" value="<%= (Validator.isNotNull(_departId)? _departId : "")%>">
<input type="hidden" name="<portlet:namespace />docids" value="" />	
	
<c:if test="<%=searchDoc%>"> <!-- SEARCH FUNCTION -->

<table width="100%" class="portlet-section-body" style="border:2px solid rgb(255,255,255)">
<tr>				
	<td width="20%"><strong>T&#7915; khóa:</strong></td>
	<td width="20%"><strong>C&#417; quan ban hành:</strong></td>
	<td width="20%"><strong>Lo&#7841;i v&#259;n b&#7843;n:</strong></td>
	<td width="20%"><strong>L&#297;nh v&#7921;c:</strong></td>
	<td width="20%"><strong>Ng&#432;&#7901;i ký:</strong></td>
</tr>

<tr>
	<td><input type="text" class="form-text" style="width: 150px" name="<portlet:namespace />keyword" value="<%=Validator.isNotNull(keyword)?keyword:""%>" /></td>
	<td>
		<select class="form-text" name="<portlet:namespace />orgid" style="width: 150px">
			<option value="0">*.*</option>
			<%	for(int i=0; i<organizations.size(); i++) {		
				VLegalOrg vOrg = (VLegalOrg) organizations.get(i);
			%>
			<option value="<%=vOrg.getOrgId()%>" <%=oId.equals(vOrg.getOrgId()) ? "selected=\"selected\"" : ""%> ><%=vOrg.getName()%></option>
			<% } %>
		</select></td>
	
	<td>
		<select class="form-text" name="<portlet:namespace />typeid" style="width: 150px">
			<option value="0">*.*</option>
			<%	for(int i=0; i<types.size(); i++) {		
				VLegalType vType = (VLegalType) types.get(i);
			%>
			<option value="<%=vType.getTypeId()%>" <%=tId.equals(vType.getTypeId()) ? "selected=\"selected\"" : ""%> ><%=vType.getName()%></option>
			<% } %>
		</select></td>
			
	<td>
		<select class="form-text" name="<portlet:namespace />fieldid" style="width: 150px">
			<option value="0">*.*</option>
			<%	for(int i=0; i<fields.size(); i++) {		
				VLegalField vField = (VLegalField) fields.get(i);
			%>
			<option value="<%=vField.getFieldId()%>" <%=fId.equals(vField.getFieldId()) ? "selected=\"selected\"" : ""%> ><%=vField.getName()%></option>
			<% } %>
		</select></td>
	
	<td>
		<select class="form-text" name="<portlet:namespace />sigid" style="width: 150px">
			<option value="0">*.*</option>
			<%	for(int i=0; i<signers.size(); i++) {
				VLegalSigner vSig = (VLegalSigner) signers.get(i);
			%>
			<option value="<%=vSig.getSigId()%>" <%=sId.equals(vSig.getSigId()) ? "selected=\"selected\"" : ""%> ><%=vSig.getFirstName() + " " + vSig.getLastName() %></option>
			<% } %>
		</select></td>					
<tr>
</table>

<div id="<portlet:namespace/>advanced_search" > 	<!-- SEARCH ADVANCED -->
<table width="100%" class="portlet-section-body">
<tr height="35">
	<td width="20%">
		<input type="checkbox" id="<portlet:namespace />keyword-in-num-doc" name="<portlet:namespace />keyword-in-num-doc" <%= isNum ? "checked": "" %>>
		<label for="<portlet:namespace />keyword-in-num-doc"><strong>&nbsp;S&#7889; v&#259;n b&#7843;n</strong></label></td>
	
	<td width="20%">
		<input type="checkbox" id="<portlet:namespace />keyword-in-symbol-doc" name="<portlet:namespace />keyword-in-symbol-doc" <%= isSymbol ? "checked":"" %>>
		<label for="<portlet:namespace />keyword-in-symbol-doc"><strong>&nbsp;Ký hi&#7879;u v&#259;n b&#7843;n</strong></label></td>
	
	<td width="20%">
		<input type="checkbox" id="<portlet:namespace />keyword-in-summary-doc" name="<portlet:namespace />keyword-in-summary-doc" <%= isSummary ? "checked":"" %> disabled  >
		<label for="<portlet:namespace />keyword-in-summary-doc"><strong>&nbsp;<strong>&nbsp; Trích y&#7871;u v&#259;n b&#7843;n</strong></label></td>
	
	<td width="20%">
		<input type="checkbox" id="<portlet:namespace />keyword-in-content-doc" name="<portlet:namespace />keyword-in-content-doc" <%= isContent ? "checked": ""%> >
		<label for="<portlet:namespace />keyword-in-content-doc"><strong>&nbsp; N&#7897;i dung v&#259;n b&#7843;n</strong></label></td>
	
	<td width="20%">
		<select name="<portlet:namespace />selectAndOr" >
      		<option value="0" <%=Validator.equals(selectAndOr,"0")?"selected":""%>><%= LanguageUtil.get(pageContext, "portlet.vcms.article.search.select-or") %> </option>
      		<option value="1" <%=Validator.equals(selectAndOr,"1")?"selected":""%>><%= LanguageUtil.get(pageContext, "portlet.vcms.article.search.select-and") %></option>
        </select>
	</td>
</tr>

<c:if test="<%= searchDocByPromul%>"> <!-- Enabled search By Promul -->
<tr height="35">
	<td><input type="checkbox" id="<portlet:namespace/>isPromul-date" name="<portlet:namespace/>isPromul-date" <%= isPromulDate ? "checked":""%> >		
	  	<label for="<portlet:namespace/>isPromul-date"><strong>&nbsp;<%=LanguageUtil.get(pageContext, "portlet.vlegal.document.promul-date")%></strong></label>
	</td>	
	<td colspan="2">
		T&#7915; :<!--Ngay ban hanh 2/9/1945-->		
		<liferay-ui:input-date
			disableNamespace="<%= false %>"
			monthParam="proFromMonth"
			monthValue="8"
			dayParam="proFromDay"
			dayValue="2"
			yearParam="proFromYear"
			yearValue="<%=proFromYear %>"
			yearRangeStart="<%= curYear-63 %>"
			yearRangeEnd="<%= curYear+10 %>"
			firstDayOfWeek="<%= currentDate.getFirstDayOfWeek() - 1 %>"
			disabled="<%= false %>"
		/></td>
	<td colspan="2">
		&#272;&#7871;n: 			 
		<liferay-ui:input-date
			disableNamespace="<%= false %>"
			monthParam="proToMonth"
			monthValue="<%= proToMonth %>"
			dayParam="proToDay"
			dayValue="<%= proToDay %>"
			yearParam="proToYear"
			yearValue="<%=proToYear %>"
			yearRangeStart="<%= curYear-10 %>"
			yearRangeEnd="<%= curYear+10 %>"
			firstDayOfWeek="<%= currentDate.getFirstDayOfWeek() - 1 %>"
			disabled="<%= false %>"
		/></td>	
</tr>
</c:if>
	
<c:if test="<%= searchDocByEffective %>">	 <!-- Enabled search By Effection -->
<tr height="35">
	<td>
		<input type="checkbox" id="<portlet:namespace/>isEffective-date" name="<portlet:namespace/>isEffective-date" <%= isEffectiveDate ? "checked":""%>>			
	  	 <label for="<portlet:namespace/>isEffective-date"><strong>&nbsp;<%=LanguageUtil.get(pageContext, "portlet.vlegal.document.effective-date")%></strong></label></td>
	<td colspan="2">
		T&#7915; :<!--Ngay ban hanh 2/9/1945-->	
			
		<liferay-ui:input-date
			disableNamespace="<%= false %>"
			monthParam="effFromMonth"
			monthValue="8"
			dayParam="effFromDay"
			dayValue="2"
			yearParam="effFromYear"
			yearValue="<%=effFromYear %>"
			yearRangeStart="<%= curYear-63 %>"
			yearRangeEnd="<%= curYear+10 %>"
			firstDayOfWeek="<%= currentDate.getFirstDayOfWeek() - 1 %>"
			disabled="<%= false %>"
		/></td>
	<td colspan="2">
		&#272;&#7871;n: 
		<liferay-ui:input-date
			disableNamespace="<%= false %>"
			monthParam="effToMonth"
			monthValue="<%= effToMonth %>"
			dayParam="effToDay"
			dayValue="<%= effToDay %>"
			yearParam="effToYear"
			yearValue="<%=effToYear %>"
			yearRangeStart="<%= curYear-10 %>"
			yearRangeEnd="<%= curYear+10 %>"
			firstDayOfWeek="<%= currentDate.getFirstDayOfWeek() - 1 %>"
			disabled="<%= false %>"
		/></td>
</tr>
</c:if>
			
<c:if test="<%= searchDocByExpired %>">		<!-- Enabled search By Expired -->
<tr height="35">
	<td>
		<input type="checkbox" id="<portlet:namespace/>isExpired-date" name="<portlet:namespace/>isExpired-date" <%= isExpiredDate ? "checked":""%>>			
	  	<label for="<portlet:namespace/>isExpired-date"><strong>&nbsp;<%=LanguageUtil.get(pageContext, "portlet.vlegal.document.exprired-date")%></strong></label></td>
	<td colspan="2">
		T&#7915; :<!--Ngay ban hanh 2/9/1945-->	
			
		<liferay-ui:input-date
			disableNamespace="<%= false %>"
			monthParam="expFromMonth"
			monthValue="8"
			dayParam="expFromDay"
			dayValue="2"
			yearParam="expFromYear"
			yearValue="<%=expFromYear %>"
			yearRangeStart="<%= curYear-63 %>"
			yearRangeEnd="<%= curYear+10 %>"
			firstDayOfWeek="<%= currentDate.getFirstDayOfWeek() - 1 %>"
			disabled="<%= false %>"
		/></td>
	<td colspan="2">
		&#272;&#7871;n: 
		<liferay-ui:input-date
			disableNamespace="<%= false %>"
			monthParam="expToMonth"
			monthValue="<%= expToMonth %>"
			dayParam="expToDay"
			dayValue="<%= expToDay %>"
			yearParam="expToYear"
			yearValue="<%=expToYear %>"
			yearRangeStart="<%= curYear-10 %>"
			yearRangeEnd="<%= curYear+10 %>"
			firstDayOfWeek="<%= currentDate.getFirstDayOfWeek() - 1 %>"
			disabled="<%= false %>"
		/></td>
</tr>
</c:if>
</table>
</div>
				
<table width="100%" border="0" align="center" class="portlet-section-body">
<tr align="right" height="35">
	<td align="left">
		<img src="<%=themeDisplay.getPathThemeImage() + "/vcms/miximize_search.gif" %>" name="<portlet:namespace/>button_custom_search" onClick ="javascript:<portlet:namespace/>miximizeSearchAdvance();" title="<%= LanguageUtil.get(pageContext, "portlet.vcms.button.search.miximize") %>"/></td>
	<td></td>
	<td>
		<input class="portlet-form-button" type="button" style="width:150px;height:23px;font-weight:bold" value="<%= LanguageUtil.get(pageContext, "search") %>" onclick="javascript:<portlet:namespace />doSearchDocuments();"></td>
</tr>
</table>
</c:if>

<%
	List headerNames = new ArrayList();

	headerNames.add("portlet.vlegal.document.num-symbol");
	
	if (tabs2.equals("portlet.vlegal.document.publish-pending")){				
		headerNames.add("approve-date");	
	} else if (tabs2.equals("portlet.vlegal.document.published")){			
		headerNames.add("publish-date");
	} else {
		headerNames.add("create-date");
	}			
	
	headerNames.add("portlet.vlegal.document.summary");
	headerNames.add(StringPool.BLANK);
	
	SearchContainer searchContainer = new SearchContainer(renderRequest, null, null, SearchContainer.DEFAULT_CUR_PARAM, totalItemDocumentPerPage, portletURL, headerNames, null);
	RowChecker rowChecker = new RowChecker(renderResponse);
	if (!tabs2.equals("portlet.vlegal.document.published")){			
		searchContainer.setRowChecker(rowChecker);
	}	
	
	searchContainer.setEmptyResultsMessage("there-are-no-documents");
	
	String documentImage = "";			
	List results = null;
	int total =0;
				
	 if (tabs2.equals("portlet.vlegal.document.published")) { // PUBLISHED
						
		if (Validator.isNotNull(cmdSearchFlag) && Validator.equals(cmdSearchFlag,"true")){
		
			results = VLegalDocumentServiceUtil.searchDocumentByParam(groupId, language, keyword, _orgId, _typeId, _fieldId, _sigId, isNum, 
				isSymbol, isSummary, isContent, isPromulDate, promulDateFrom, promulDateTo, isEffectiveDate, effectiveDateFrom, effectiveDateTo, 
				isExpiredDate, expiredDateFrom, expiredDateTo, Integer.parseInt(cmdSearchStatus), selectAndOr, searchContainer.getStart(), searchContainer.getEnd());
				total = VLegalDocumentServiceUtil.countSearchDocumentByParam(groupId, language, keyword, _orgId, _typeId, _fieldId, _sigId, isNum, 
				isSymbol, isSummary, isContent, isPromulDate, promulDateFrom, promulDateTo, isEffectiveDate, effectiveDateFrom, effectiveDateTo, 
				isExpiredDate, expiredDateFrom, expiredDateTo, Integer.parseInt(cmdSearchStatus), selectAndOr);
		} else {
			results = VLegalDocumentServiceUtil.getDocumentByP_L_S(groupId, language, VLegalDocumentServiceImpl.PUBLISHED, searchContainer.getStart(), searchContainer.getEnd());
			total = VLegalDocumentServiceUtil.countDocumentByP_L_S(groupId, language, VLegalDocumentServiceImpl.PUBLISHED);
		}
			documentImage = "published.gif";
	
	} else if (tabs2.equals("portlet.vlegal.document.publish-pending")) { // PUBLISH-PENDING
		
		if (Validator.isNotNull(cmdSearchFlag) && Validator.equals(cmdSearchFlag,"true")){
			
			results = VLegalDocumentServiceUtil.searchDocumentByParam(groupId, language, keyword, _orgId, _typeId, _fieldId, _sigId, isNum, 
				isSymbol, isSummary, isContent, isPromulDate, promulDateFrom, promulDateTo, isEffectiveDate, effectiveDateFrom, effectiveDateTo, 
				isExpiredDate, expiredDateFrom, expiredDateTo, Integer.parseInt(cmdSearchStatus), selectAndOr, searchContainer.getStart(), searchContainer.getEnd());
					total = VLegalDocumentServiceUtil.countSearchDocumentByParam(groupId, language, keyword, _orgId, _typeId, _fieldId, _sigId, isNum, 
				isSymbol, isSummary, isContent, isPromulDate, promulDateFrom, promulDateTo, isEffectiveDate, effectiveDateFrom, effectiveDateTo, 
				isExpiredDate, expiredDateFrom, expiredDateTo, Integer.parseInt(cmdSearchStatus), selectAndOr);
		
		} else {
			results = VLegalDocumentServiceUtil.getDocumentByP_L_S(groupId, language, VLegalDocumentServiceImpl.PUBLISH_PENDING, searchContainer.getStart(), searchContainer.getEnd());
			total = VLegalDocumentServiceUtil.countDocumentByP_L_S(groupId, language, VLegalDocumentServiceImpl.PUBLISH_PENDING);
		}
		documentImage = "publish_pending.gif";
		
	} else { // APPROVE-PENDING
		if (styleDisplay == 2){			
			if (permissionChecker.isOmniadmin()){						
				results = VLegalDocumentServiceUtil.getDocumentByP_L_S(groupId, language, VLegalDocumentServiceImpl.APPROVAL_PENDING, searchContainer.getStart(), searchContainer.getEnd());
				total = VLegalDocumentServiceUtil.countDocumentByP_L_S(groupId, language, VLegalDocumentServiceImpl.APPROVAL_PENDING);
			} else {
				results = VLegalDocumentServiceUtil.getAllDocumentByStatus(groupId, language, userId, VLegalDocumentServiceImpl.APPROVAL_PENDING, searchContainer.getStart(), searchContainer.getEnd());
				total = VLegalDocumentServiceUtil.countDocumentByStatus(groupId,language,userId, VLegalDocumentServiceImpl.APPROVAL_PENDING);
			}
		} else {
			if (Validator.isNotNull(cmdSearchFlag) && Validator.equals(cmdSearchFlag,"true")){
				results = VLegalDocumentServiceUtil.searchDocumentByParam(groupId, language, keyword, _orgId, _typeId, _fieldId, _sigId, isNum, 
					isSymbol, isSummary, isContent, isPromulDate, promulDateFrom, promulDateTo, isEffectiveDate, effectiveDateFrom, effectiveDateTo,
						isExpiredDate, expiredDateFrom, expiredDateTo, Integer.parseInt(cmdSearchStatus), selectAndOr, searchContainer.getStart(), searchContainer.getEnd());
			
				total = VLegalDocumentServiceUtil.countSearchDocumentByParam(groupId, language, keyword, _orgId, _typeId, _fieldId, _sigId, isNum, 
					isSymbol, isSummary, isContent, isPromulDate, promulDateFrom, promulDateTo, isEffectiveDate, effectiveDateFrom, effectiveDateTo,
						isExpiredDate, expiredDateFrom, expiredDateTo, Integer.parseInt(cmdSearchStatus), selectAndOr);
			} else {						
				results = VLegalDocumentServiceUtil.getDocumentByP_L_S(groupId, language, VLegalDocumentServiceImpl.APPROVAL_PENDING, searchContainer.getStart(), searchContainer.getEnd());
				total = VLegalDocumentServiceUtil.countDocumentByP_L_S(groupId, language, VLegalDocumentServiceImpl.APPROVAL_PENDING);
			}
		}	
		documentImage = "approval_pending.gif";
		tabs2 = "portlet.vlegal.document.approval-pending";
	}				
	
	searchContainer.setTotal(total);
	searchContainer.setResults(results);
	List resultRows = searchContainer.getResultRows();
	for (int i = 0; i < results.size(); i++) {
		VLegalDocument document = (VLegalDocument)results.get(i);
		
		ResultRow row = new ResultRow(document, document.getPrimaryKey().toString(), i);
		PortletURL rowURL = renderResponse.createRenderURL();				
		rowURL.setWindowState(WindowState.MAXIMIZED);
		
		rowURL.setParameter("jspPage", "/html/portlet/vlegal/document_edit.jsp");
		rowURL.setParameter("cmd","viewDetail");
		rowURL.setParameter("redirect", currentURL);
		rowURL.setParameter("docid", document.getDocId());
		
		StringBuffer sb2 = new StringBuffer();
		sb2.append(document.getNum() +"/"+ document.getSymbol());
		row.addText(sb2.toString());

		if (tabs2.equals("portlet.vlegal.document.publish-pending")){									
			row.addText(VLegalUtil.dateParser(document.getApprovedDate()));
		} else if (tabs2.equals("portlet.vlegal.document.published")){
			row.addText(VLegalUtil.dateParser(document.getPublishedDate()));
		} else if (tabs2.equals("portlet.vlegal.document.approval-pending")){
			row.addText(VLegalUtil.dateParser(document.getCreatedDate()));
		}
		
		
		// Name and description
		StringBuffer sb = new StringBuffer();
		
		summary = document.getSummary();
		
		int readMessages = VLegalAttachedMessageServiceUtil.count(document.getDocId(), true);
		int unreadMessages = VLegalAttachedMessageServiceUtil.count(document.getDocId(), false);
		
		sb.append("<table cellspacing='3' cellpadding='0' width='100%' border='0'>");
		sb.append("<tr>");
		sb.append("<td width='1%'><img src='" + themeDisplay.getPathThemeImage() + "/vlegal/" + documentImage + "' valign='middle' /></td>");
		sb.append("<td width='99%' align='left'>" + summary + "</b></td>");
		sb.append("</tr>");
		if ((readMessages + unreadMessages) > 0) {
			sb.append("<tr>");
			sb.append("<td width='1%'>&nbsp;</td>");
			sb.append("<td width='99%' align='left'>");
			sb.append("<span style=\"font-size: xx-small;\"><img src='" + themeDisplay.getPathThemeImage() + "/vlegal/message-notation.gif' valign='middle' />&nbsp;");
			sb.append("<b><u>" + LanguageUtil.get(pageContext, "portlet.vlegal.document.attached-message") + "</u></b>: ");
			sb.append("<a href=\"" + rowURL.toString() + "\"><b>" + unreadMessages + " " + LanguageUtil.get(pageContext, "portlet.vlegal.document.unread-attached-message") + "</b>/" + (readMessages + unreadMessages) + " " + LanguageUtil.get(pageContext, "portlet.vlegal.document.attached-message") + "</a>");
			sb.append("</span>");
			sb.append("</td>");
			sb.append("</tr>");
		}
		sb.append("</table>");
		
		row.addText(sb.toString());
		// Actions				
		row.addJSP("right", SearchEntry.DEFAULT_VALIGN, "/html/portlet/vlegal/document_action.jsp", application, request, response);
		// Add result row				
		resultRows.add(row);
	}
%>
<br/>
	

<!-- Button -->
<div class="portlet-font" style="font-weight: bold; float: left; margin-right: 10px;">
	<c:if test='<%= tabs2.equals("portlet.vlegal.document.approval-pending")%>'>
		<input class="portlet-form-button" type="button" value='<%= LanguageUtil.get(pageContext, "add") %>' onClick="javascript:<portlet:namespace />updateDocument('<%= Constants.ADD %>', true);" />
		<input class="portlet-form-button" type="button" value='<%= LanguageUtil.get(pageContext, "delete") %>' onClick="javascript:<portlet:namespace />deleteDocuments(true);" />
	</c:if>	
</div>

<br><div class="beta-separator"></div><br>


<c:if test='<%= cmdSearchFlag.equals("true")%>'>	
	<div class="portlet-font" style="font-weight:bold;" align="center">
		<% if (results.size()>0){%>
			<strong><font color="red">K&#7871;t qu&#7843; tìm ki&#7871;m - T&#7893;ng s&#7889; v&#259;n b&#7843;n &#273;&#432;&#7907;c tìm th&#7845;y : <%= results.size()%></font></strong><br>
		<%  }else {%>
			<strong><font color="red">Không tìm th&#7845;y v&#259;n b&#7843;n nào th&#7887;a mãn yêu c&#7847;u tìm ki&#7871;m.</font></strong><br>
		<%	}	%>
	</div>
</c:if>

<liferay-ui:search-iterator searchContainer="<%= searchContainer %>" /><br>
