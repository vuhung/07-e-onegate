
<%@page import="javax.portlet.ActionRequest"%>
<%@page import="javax.portlet.PortletURL"%>
<%@page import="com.liferay.portal.kernel.util.Validator"%>
<%@page import="com.liferay.portal.kernel.language.LanguageUtil"%>
<%@page import="javax.portlet.WindowState"%>
<%@page import="com.liferay.portal.kernel.util.UnicodeFormatter"%>

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
	PortletURL p = renderResponse.createActionURL();
	p.setParameter(ActionRequest.ACTION_NAME, "updateConfiguration");
%>

<script type="text/javascript">
	function <portlet:namespace />initSuggestionEmailEditor() {
		document.<portlet:namespace />fm.<portlet:namespace />autoSuggestionEmailContent.value = "<%= UnicodeFormatter.toString(autoSuggestionEmailContent) %>";
		return "<%= UnicodeFormatter.toString(autoSuggestionEmailContent) %>";
	}
	
	function <portlet:namespace />initNotificationDraftEmailEditor() {
		document.<portlet:namespace />fm.<portlet:namespace />autoNotificationDraftEmailContent.value = "<%= UnicodeFormatter.toString(autoNotificationDraftEmailEditor) %>";
		return "<%= UnicodeFormatter.toString(autoNotificationDraftEmailEditor) %>";
	}
	
	function <portlet:namespace />hideSearch(){
		var searchDoc = document.getElementById('<portlet:namespace />searchDoc');
		var search1 = document.getElementById('<portlet:namespace/>search1');
		var search2 = document.getElementById('<portlet:namespace/>search2');
		var search3 = document.getElementById('<portlet:namespace/>search3');
		if (!searchDoc.checked){
			search1.style.display = "none";
			search2.style.display = "none";
			search3.style.display = "none";
		}else{
			search1.style.display = "";
			search2.style.display = "";
			search3.style.display = "";
		}
	}
	
	function <portlet:namespace />hideDraft(){
		var hideDraft = document.getElementById('<portlet:namespace />manageDraftSuggestion');
		var action2 = document.getElementById('<portlet:namespace/>Action2');
		var action3 = document.getElementById('<portlet:namespace/>Action3');
		var draft1 = document.getElementById('<portlet:namespace/>draft1');
		var draft2 = document.getElementById('<portlet:namespace/>draft2');
		if (hideDraft.checked){
			action2.style.display = "";
			action3.style.display = "";
			draft1.style.display = "";
			draft2.style.display = "";
		} else {
			action2.style.display = "none";
			action3.style.display = "none";
			draft1.style.display = "none";
			draft2.style.display = "none";
		}
	}
	
	
	function <portlet:namespace />saveConfiguration() {
		//document.<portlet:namespace />fm.<portlet:namespace />autoNotificationDraftEmailContent.value = parent.<portlet:namespace />autoNotificationDraftEmailContent.getHTML();
		//document.<portlet:namespace />fm.<portlet:namespace />autoSuggestionEmailContent.value = parent.<portlet:namespace />autoSuggestionEmailContent.getHTML();
		submitForm(document.<portlet:namespace />fm, '<%= p.toString() %>');
	}
</script>

<liferay-ui:tabs names="portlet.vlegal.config.general-config">
</liferay-ui:tabs>	

<form action="<%= p.toString() %>" name="<portlet:namespace />fm">

<table style="width: 100%;  border: 0; cellspacing: 1; cellpadding: 4;">
	
<tr><td colspan="4">&nbsp;</td></tr>
	
<tr>
	<td width="40%" height="32">
		<img src="/vlegal-portlet/html/portlet/images/dot.gif" style="vertical-align: middle;" />
		<label for="<portlet:namespace/>viewGeneral">Hi&#7875;n th&#7883; tab <b>QU&#7842;N LÝ CHUNG</b></label>
	</td>
	
	<td width="10%" align="center">
		<input type="checkbox" id="<portlet:namespace/>viewGeneral" name="<portlet:namespace/>viewGeneral" <%= viewGeneral ? "checked" : ""%>>
	</td>
	<td width="40%"> 
		<img src="/vlegal-portlet/html/portlet/images/dot.gif" style="vertical-align: middle;" /> 
		<label for="<portlet:namespace/>quickAction">
			Hi&#7875;n th&#7883; ch&#7913;c n&#259;ng <b>THAO TÁC NHANH</b>
		</label>
	</td>
	
	<td width="10%" align="center">
		<input type="checkbox" id="<portlet:namespace/>quickAction" name="<portlet:namespace/>quickAction" <%= quickAction? "checked":""%>>
	</td>
</tr>
		
<tr>
	<td width="40%" height="32">
		<img src="/vlegal-portlet/html/portlet/images/dot.gif" style="vertical-align: middle;" />
		<label for="<portlet:namespace/>viewLog">Hi&#7875;n th&#7883; tab <b>NH&#7852;T KÝ</b></label>
	</td>
			
	<td align="center">
		<input type="checkbox" id="<portlet:namespace/>viewLog" name="<portlet:namespace/>viewLog" <%= viewLog? "checked":""%>>
	</td>
	
	<td width="40%">
		<img src="/vlegal-portlet/html/portlet/images/dot.gif" style="vertical-align: middle;" />
		Hi&#7875;n th&#7883; ch&#7913;c n&#259;ng <b>TÌM KI&#7870;M</b>
	</td>
		
	<td align="center">	
		<input type="checkbox" name="<portlet:namespace/>searchDoc" id="<portlet:namespace/>searchDoc" <%= searchDoc?"checked":""%> onClick ="javascript:<portlet:namespace/>hideSearch();"/>
	</td>	

</tr>
		
<%-- <tr id="<portlet:namespace/>Action" style="display:<%= (styleDisplay == 2)? "none":""%>">	 --%>
<!-- 	<td width="40%" height="32"> -->
<%-- 		<img src="<%= themeDisplay.getPathThemeImage() %>/vlegal/dot.gif" valign="middle" /> --%>
<!-- 		Hi&#7875;n th&#7883; tab <b>D&#7920; TH&#7842;O</b></td> -->
	
<!-- 	<td align="center"> -->
<%-- 		<input type="checkbox" name="<portlet:namespace/>manageDraftSuggestion"  --%>
<%-- 		id="<portlet:namespace/>manageDraftSuggestion" <%= manageDraftSuggestion ? "checked":"" %> --%>
<%-- 		onClick ="javascript:<portlet:namespace/>hideDraft();" ></td>	 --%>
	
<!-- 	<td colspan="2">&nbsp;</td>			 -->

<!-- </tr> -->

<tr><td colspan="4">&nbsp;</td></tr>	
	
<tr id="<portlet:namespace/>search1" style='display:<%= searchDoc? "": "none" %>'>
	<td width="40%" height="32">
		<img src="/vlegal-portlet/html/portlet/images/dot.gif" style="vertical-align: middle;" />
		<%= LanguageUtil.get(pageContext, "portlet.vlegal.config.document.search-by-promulDate") %>
	</td>
	
	<td width="10%" align="center">
		<input type="checkbox" name="<portlet:namespace/>searchDocByPromul" <%= searchDocByPromul? "checked":"" %> />
	</td>
	
	<td colspan="2"/>
	
</tr>
		
<tr id="<portlet:namespace/>search2" style='display:<%= searchDoc? "": "none" %>'>
	<td width="40%" height="32">
		<img src="/vlegal-portlet/html/portlet/images/dot.gif" style="vertical-align: middle;" />
		<%= LanguageUtil.get(pageContext, "portlet.vlegal.config.document.search-by-expiredDate") %>
	</td>
	
	<td width="10%" align="center">
		<input type="checkbox" name="<portlet:namespace/>searchDocByExpired" <%= searchDocByExpired? "checked":""%> />
	</td>
	
	<td colspan="2"/>	
	
</tr>
	
<tr id="<portlet:namespace/>search3" style='display:<%= searchDoc? "": "none" %>'>
	<td width="40%" height="32">
		<img src="/vlegal-portlet/html/portlet/images/dot.gif" style="vertical-align: middle;" />
		<%= LanguageUtil.get(pageContext, "portlet.vlegal.config.document.search-by-effectiveDate") %>
	</td>
		
	<td width="10%" align="center">
		<input type="checkbox" name="<portlet:namespace/>searchDocByEffective" <%= searchDocByEffective? "checked": ""%> />
	</td>
	
	<td colspan="2"/>
</tr>

<tr><td colspan="4">&nbsp;</td></tr>	

<tr>
	<td width="40%" height="32">
		<img src="/vlegal-portlet/html/portlet/images/dot.gif" style="vertical-align: middle;" />
		T&#7893;ng s&#7889; t&#7879;p tin t&#7889;i &#273;a kèm theo v&#259;n b&#7843;n
	</td>
	
	<td width="10%" align="center">
		<select name="<portlet:namespace />maxAttachmentDocument">
			<%for(int i=1;i<=10;i++){%>
				<option value="<%=i%>" <%= (maxAttachmentDocument == i) ? "selected" : "" %>><%=i%></option>
			<%}%>						
		</select>
	</td>
			
	<td width="40%">
		<img src="/vlegal-portlet/html/portlet/images/dot.gif" style="vertical-align: middle;" />
		<%= LanguageUtil.get(pageContext, "portlet.vlegal.config.document.itemperpage") %>
	</td>
		
	<td width="10%" align="center">
		<select name="<portlet:namespace />itemPerPageDocument" >
			<option value="10" <%= (totalItemDocumentPerPage == 10)? "selected" : "" %> >10</option>
			<option value="20" <%= (totalItemDocumentPerPage == 20)? "selected" : "" %> >20</option>
			<option value="50" <%= (totalItemDocumentPerPage == 50)? "selected" : "" %> >50</option>
			<option value="100" <%= (totalItemDocumentPerPage == 100)? "selected" : "" %> >100</option>
			<option value="200" <%= (totalItemDocumentPerPage == 200)? "selected" : "" %> >200</option>						
		</select>
	</td>
</tr>

<tr id="<portlet:namespace/>draft1" style='display:<%= manageDraftSuggestion ? "": "none" %>'>
	<td width="40%" height="32">
		<img src="/vlegal-portlet/html/portlet/images/dot.gif" style="vertical-align: middle;" />
  		<%= LanguageUtil.get(pageContext, "portlet.vlegal.config.draft.maxattachment") %>
  	</td>
  	
  	<td width="10%" align="center">
  		<select name="<portlet:namespace />maxAttachmentDraft" >
			<%for(int i=1;i<=10;i++){%>
				<option value="<%=i%>" <%=(maxAttachmentDraft == i)?"selected":""%>><%=i%></option>
			<%}%>
  		</select>
  	</td>	
  			
  	<td width="40%">
		<img src="/vlegal-portlet/html/portlet/images/dot.gif" style="vertical-align: middle;" />
		<%= LanguageUtil.get(pageContext, "portlet.vlegal.config.draft.itemperpage") %>
	</td>

	<td align="center">
		<select name="<portlet:namespace />itemPerPageDraft" >
			<%for(int i=5;i<=50;i=i+5){%>
				<option value="<%=i%>" <%=(totalItemDraftPerPage == i)?"selected":""%>><%=i%></option>
			<%}%>						
		</select>
	</td>	
</tr>
			
<tr id="<portlet:namespace/>draft2" style='display:<%= (manageDraftSuggestion==true)? "": "none" %>'>
  	<td height="32">
		<img src="/vlegal-portlet/html/portlet/images/dot.gif" style="vertical-align: middle;" />
		<%= LanguageUtil.get(pageContext, "portlet.vlegal.config.suggestion.maxattachment") %>
	</td>
  	
  	<td align="center">
		<select name="<portlet:namespace />maxAttachmentSuggestion" >
			<%for(int i=1;i<=10;i++){%>
				<option value="<%=i%>" <%=(maxAttachmentSuggestion == i)?"selected":""%>><%=i%></option>
			<%}%>						
		</select>
	</td>
	
	<td width="40%">
		<img src="/vlegal-portlet/html/portlet/images/dot.gif" style="vertical-align: middle;" />
		<%= LanguageUtil.get(pageContext, "portlet.vlegal.config.suggestion.itemperpage") %>
	</td>

	<td align="center">
		<select name="<portlet:namespace />itemPerPageSuggestion" >
			<option value="10" <%= (totalItemSuggestionPerPage == 10)? "selected" : "" %> >10</option>
			<option value="20" <%= (totalItemSuggestionPerPage == 20)? "selected" : "" %> >20</option>
			<option value="50" <%= (totalItemSuggestionPerPage == 50)? "selected" : "" %> >50</option>
			<option value="100" <%= (totalItemSuggestionPerPage == 100)? "selected" : "" %> >100</option>
			<option value="200" <%= (totalItemSuggestionPerPage == 200)? "selected" : "" %> >200</option>						
		</select>
	</td>
</tr>



</table>

<br/>
<div align="center">
	<input class="portlet-form-button" type="button" value='<%= LanguageUtil.get(pageContext, "portlet.vlegal.config.button.save") %>' onClick="javascript:<portlet:namespace />saveConfiguration();">												
</div>		
<br/>
</form>
<%!
public static final String EDITOR_WYSIWYG_IMPL_KEY_DEFAULT = "editor.wysiwyg.default";
%>