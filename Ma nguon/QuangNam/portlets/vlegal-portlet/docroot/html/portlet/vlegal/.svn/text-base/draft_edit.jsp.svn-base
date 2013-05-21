<%@page import="com.vportal.portlet.vlegal.InvalidDraftContentException"%>
<%@page import="com.vportal.portlet.vlegal.InvalidDraftTitleException"%>
<%@page import="com.liferay.portal.kernel.util.Constants"%>
<%@page import="com.vportal.portal.util.WebKeysExt"%>
<%@page import="com.vportal.portlet.vlegal.model.impl.VLegalDraftDocumentImpl"%>
<%@page import="com.vportal.portlet.vlegal.model.VLegalDraftDocument"%>
<%@ include file="/html/portlet/vlegal/init.jsp" %>
<%	

	// Requested values	
	int sedM = ParamUtil.get(request, "sedMonth", curMonth);
	int sedD = ParamUtil.get(request, "sedDay", curDay);
	int sedY = ParamUtil.get(request, "sedYear", curYear);
	Date toDate = new GregorianCalendar(sedY, sedM, sedD).getTime();
	
	String redirect = ParamUtil.getString(request, "redirect"); 

	VLegalDraftDocument ldraft = (VLegalDraftDocument) request.getAttribute(WebKeysExt.VLEGAL_DRAFT);
	
	if ( ldraft == null) {
		ldraft = new VLegalDraftDocumentImpl();
	}
	
	List listTypes = (List) request.getAttribute(WebKeysExt.VLEGAL_LIST_TYPE);
	List listFields = (List) request.getAttribute(WebKeysExt.VLEGAL_LIST_FIELD);
		
	String draftId = ldraft != null ? ldraft.getDraftId() : StringPool.BLANK;
	String draftContent = ldraft!=null ? ldraft.getContent() : StringPool.BLANK;
	
	Calendar expiredDate = CalendarFactoryUtil.getCalendar(timeZone, locale);
	
	if (ldraft != null) {
		if (ldraft.getExpiredDate() != null) {
			expiredDate.setTime(ldraft.getExpiredDate());
		}
	}
	
	String createDraftLevel = (String)request.getAttribute(Constants.CMD);
%>
<script type="text/javascript">
	pathToImages = "<%= request.getContextPath() %>html/themes/classic/images/edir/calendar/";	
	function <portlet:namespace />saveDraft(){
		<%if(createDraftLevel!=null && createDraftLevel.equals("createDraftLevel")){ %>
			document.<portlet:namespace />fm.<portlet:namespace /><%= Constants.CMD %>.value = "createDraftLevel";
		<%}else{%>
			document.<portlet:namespace />fm.<portlet:namespace /><%= Constants.CMD %>.value = "<%= ldraft == null ? Constants.ADD : Constants.UPDATE %>";
		<%}%>
		
		document.<portlet:namespace />fm.<portlet:namespace />content.value = parent.<portlet:namespace />art_content.getHTML();
		submitForm(document.<portlet:namespace />fm);
	}

	function <portlet:namespace />initContentEditor() {
		document.<portlet:namespace />fm.<portlet:namespace />content.value = "<%= UnicodeFormatter.toString(draftContent) %>";
		return "<%= UnicodeFormatter.toString(draftContent) %>";
	};
</script>
<c:if test='<%= ldraft.getDraftId().equals("") %>'>
	<liferay-ui:tabs names="vlegal-add-new-draft" backURL="<%= redirect %>" />
</c:if>
<c:if test='<%= !ldraft.getDraftId().equals("") %>'>
	<liferay-ui:tabs names="vlegal-update-draft" backURL="<%= redirect %>" />
</c:if>

<liferay-ui:error exception="<%= InvalidDraftTitleException.class %>" message="portlet.vlegal.error.title" />
<liferay-ui:error exception="<%= InvalidDraftContentException.class %>" message="portlet.vlegal.error.content" />

<form action="<portlet:actionURL windowState="<%= WindowState.MAXIMIZED.toString() %>"><portlet:param name="updateDraft" value="updateDraftUrl" /></portlet:actionURL>" method="post" name="<portlet:namespace />fm" onSubmit="<portlet:namespace />saveDraft(); return false;" enctype="multipart/form-data">
<input name="<portlet:namespace />redirect" type="hidden" value="<%= redirect %>">
<input name="<portlet:namespace /><%= Constants.CMD %>" type="hidden" value="">	
<input name="<portlet:namespace />draftId" type="hidden" value="<%=draftId%>">
<input name="<portlet:namespace />language" type="hidden" value="<%=language %>">
<input name="<portlet:namespace />toDate" type="hidden" value="<%=toDate%>">

<table cellpadding="2" cellspacing="4" class="lfr-table">
<tr>
	<td>
		<liferay-ui:message key="portlet.vlegal.draft.title" />:		</td>
	<td>
		<liferay-ui:input-field model="<%= VLegalDraftDocument.class %>" bean="<%= ldraft %>" field="title" defaultValue="<%=ldraft != null ? ldraft.getTitle() : "" %>" />		</td>
	<td>
		<liferay-ui:message key="portlet.vlegal.draft.draftlevel" />: 
			<%if(createDraftLevel!=null && createDraftLevel.equals("createDraftLevel")){ %>
				<%=ldraft.getDraftLevel()+1 %>
			<%}else{ %>
				<%=(ldraft !=null)? ldraft.getDraftLevel():"1"%>
			<%} %>		</td>
</tr>
	<tr>
		<td><liferay-ui:message key="portlet.vlegal.draft.fields" />:</td>
		<td>
			<select name="<portlet:namespace />fieldId" style="width:200px">
				<%if(listFields!=null && listFields.size()>0){
					for(int i=0;i<listFields.size();i++){
						VLegalField lfield = (VLegalField)listFields.get(i);	
				 %>
					<option value="<%=lfield.getFieldId()%>" <%if(ldraft!=null){if(ldraft.getFieldId().equals(lfield.getFieldId())){%>selected<%}} %> ><%=lfield.getName()%></option>
				<%}
				}else{ %>	
					<option value="no"><liferay-ui:message key="not-exist-field" /></option>
				<%} %>	
			</select>
			</td>
		<td><liferay-ui:message key="portlet.vlegal.draft.doccode" /><input class="form-text" style="width: 100%; padding: 3px; font-size: 10pt; font-family: tahoma, verdana" disabled="disabled" value="<%=(ldraft!=null)?ldraft.getDocCode():""%>" /></td>
	</tr>
	<tr>
		<td>
			<liferay-ui:message key="portlet.vlegal.draft.types" />:		</td>
		<td>
			<select name="<portlet:namespace />typeId" style="width:200px">
				<% if ( listTypes != null && listTypes.size() > 0){
					for ( int i = 0; i < listTypes.size(); i++ ){
						VLegalType ltype = (VLegalType)listTypes.get(i);	
				%>
					<option value="<%=ltype.getTypeId()%>" <% if(ldraft!=null){if(ldraft.getTypeId().equals(ltype.getTypeId())){%>selected<%}} %>><%=ltype.getName()%></option>
				<%}
				}else{ %>	
					<option value="no"><liferay-ui:message key="not-exist-type" /></option>
				<%} %>	
			</select>		</td>
		<td>&nbsp;</td>
	</tr>
	<tr>
		<td>
			<liferay-ui:message key="portlet.vlegal.draft.expireddatesuggestion" />:</td>
		<td><br />
			<input type="text" name="<portlet:namespace/>expiredDate" style="width: 100px;" maxlength="10" value="<%= VAdvmanUtil.dateParser(ldraft.getExpiredDate())%>">
			<a href="javascript:void(0);">
				<img style="margin:2px" src="<%= request.getContextPath() %>html/themes/classic/images/edir/calendar.jpg" 							
					onclick="displayCalendar(document.<portlet:namespace />fm.<portlet:namespace />expiredDate,'dd/mm/yyyy',this)">
				</a>	
			<br /><br /></td>
		<td>&nbsp;</td>
	</tr>
	<tr>
	  <td valign="top"><liferay-ui:message key="portlet.vlegal.draft.content" />:</td>
	  <td colspan="2">
			<liferay-ui:input-editor  name="<%= renderResponse.getNamespace() + "art_content" %>" editorImpl="<%= EDITOR_WYSIWYG_IMPL_KEY_DEFAULT %>" width="100%" height="500" initMethod="<%= renderResponse.getNamespace() + "initContentEditor" %>" />
			<input name="<portlet:namespace />content" type="hidden" />	  </td>
  </tr>
 <tr>
 	<td>&nbsp;</td>				
 </tr>
</table>
						
<table width="100%" cellspacing="0" cellpadding="0">
<tr>
	<td>
	<fieldset>
	<legend><strong><liferay-ui:message key="pFAQ.form.attachedFile" />:</strong></legend>		 							
			<vportal:file-upload entryId="<%= GetterUtil.getLong(ldraft.getDraftId(), 0) %>" entryClass="<%= VLegalDraftDocument.class %>" maxAttachment="<%= maxAttachmentDraft %>" />
	</fieldset>
	</td>
 </tr>
 </table>
  
  <br/>
<div align="center">
<%if(createDraftLevel!=null && createDraftLevel.equals("createDraftLevel")){ %>
	<input class="portlet-form-button" type="submit" value='<%= LanguageUtil.get(pageContext, "portlet.vlegal.draft.button.create-draft-level") %>'>
<%}else{ %>
	<input class="portlet-form-button" type="submit" value='<%= LanguageUtil.get(pageContext, "portlet.vlegal.draft.button.save") %>'>
<%} %>	
	<input class="portlet-form-button" type="button" value='<%= LanguageUtil.get(pageContext, "portlet.vlegal.draft.button.cancel") %>' onClick="self.location = '<%= redirect %>';">
</div>
</form>
				
<script type="text/javascript">
	document.<portlet:namespace />fm.<portlet:namespace />title.focus();
</script>
	
<%!
public static final String EDITOR_WYSIWYG_IMPL_KEY_DEFAULT = "editor.wysiwyg.default";
public static final String EDITOR_WYSIWYG_IMPL_KEY_SIMPLE = "editor.wysiwyg.tinymcesimple";

%>
