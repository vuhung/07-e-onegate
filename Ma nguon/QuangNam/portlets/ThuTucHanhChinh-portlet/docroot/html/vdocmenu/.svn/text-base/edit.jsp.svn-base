<%@page import="javax.portlet.ActionRequest"%>
<%@page import="com.portlet.vdoc.service.vdocOrgLocalServiceUtil"%>
<%@page import="com.portlet.vdoc.service.vdocFieldLocalServiceUtil"%>
<%@ include file="/html/vdocmenu/init.jsp" %>

<%
	PortletURL savePrefsURL = renderResponse.createActionURL();
	savePrefsURL.setParameter(ActionRequest.ACTION_NAME, "savePreferences");
%>

<script type="text/javascript">
	
	var cObjects = document.getElementsByName("<portlet:namespace />field");
	var cOrgs = document.getElementsByName("<portlet:namespace />org");
	
	function <portlet:namespace />savePreferences() {
		var fields = '';
		var orgs = '';	
		
		for (var i = 0; (cObjects != null) && (i < cObjects.length); i ++) {
			if (cObjects[i].checked) {
				fields += cObjects[i].value + ',';
			}
		}
		
		for (var j = 0; (cOrgs != null) && (j < cOrgs.length); j ++) {
			if (cOrgs[j].checked) {
				orgs += cOrgs[j].value + ',';
			}
		}		
		
		document.<portlet:namespace />fm.<portlet:namespace />fields.value = fields;
		document.<portlet:namespace />fm.<portlet:namespace />orgs.value = orgs;		
		submitForm(document.<portlet:namespace />fm, '<%= savePrefsURL %>');
	}	
	
	function <portlet:namespace />changeTheme(styleObj) {
		if(styleObj)
			if(styleObj.value==1){
				document.getElementById("<portlet:namespace/>themes_DIENBIEN").style.display = '';
				document.getElementById("<portlet:namespace/>themes_SBN").style.display = 'none';
			}else if(styleObj.value==2){
				document.getElementById("<portlet:namespace/>themes_DIENBIEN").style.display = 'none';
				document.getElementById("<portlet:namespace/>themes_SBN").style.display = '';
			}else if(styleObj.value==3){
				document.getElementById("<portlet:namespace/>themes_DIENBIEN").style.display = 'none';
				document.getElementById("<portlet:namespace/>themes_SBN").style.display = 'none';
			}
	}

	
	function <portlet:namespace/>selectPortleId(choice){
		if(choice == 1){
			jQuery("#<portlet:namespace/>choicePortletId").slideUp('fast');
		}else if(choice == 2){
			jQuery("#<portlet:namespace/>choicePortletId").slideDown('fast');
		}
	}	
	
		
	function <portlet:namespace />changeStyle(styleObj) {
		if(styleObj)
			if(styleObj.value==1){
				document.getElementById("<portlet:namespace/>style-01").style.display = '';
				document.getElementById("<portlet:namespace/>style-02").style.display = 'none';
				document.getElementById("<portlet:namespace/>style-03").style.display = 'none';
			}else if(styleObj.value==2){
				document.getElementById("<portlet:namespace/>style-01").style.display = 'none';
				document.getElementById("<portlet:namespace/>style-02").style.display = '';
				document.getElementById("<portlet:namespace/>style-03").style.display = 'none';
			}else if(styleObj.value==3){
				document.getElementById("<portlet:namespace/>style-01").style.display = 'none';
				document.getElementById("<portlet:namespace/>style-02").style.display = 'none';
				document.getElementById("<portlet:namespace/>style-03").style.display = '';
			}
	}	

</script>
	
<%
	List listField = (List)vdocFieldLocalServiceUtil.getFieldByG_L_P(groupId, language, "0");
	
	List listOrg = (List)vdocOrgLocalServiceUtil.getOrgByG_L_P(groupId, language, "0");

%>
<form name="<portlet:namespace />fm" Method="post" >	
	<input name="<portlet:namespace />fields" type="hidden" value=""/>	
	<input name="<portlet:namespace />fieldsChecked" type="hidden" value="<%=fields%>"/>
	<input name="<portlet:namespace />orgs" type="hidden" value=""/>	
	<input name="<portlet:namespace />orgsChecked" type="hidden" value="<%=orgs%>"/>


<fieldset style="border:1px dotted gray;">
<legend><strong>Cau hinh Portlet</strong></legend>	
<table width="100%" border="0" cellpadding="4" cellspacing="1">
						
<tr><td>&nbsp;</td></tr>
	
<tr>
	<td>
	<table width="100%" border="0" cellpadding="4" cellspacing="1">
	<tr height="30">
		<td>
			<b>Tuy bien tieu de</b>&nbsp;&nbsp;<input type="text" name="<portlet:namespace />title" value="<%=title%>" style="width:250px;"/></td>
	</tr>
	
	<tr height="30">
		<td>
			<b>Tuy bien URL</b>&nbsp;&nbsp;<input type="text" name="<portlet:namespace />url" value="<%=url%>" style="width:250px;"/></td>
	</tr>
	
	
	<tr height="30">
		<td>
			<b>Chon kieu hien thi Portlet</b></td>
	</tr>
		
	<tr height="30">	
		<td>
			<table width="100%">
			<tr>
				<td><input type="radio" name="<portlet:namespace/>styleDisplay" id="<portlet:namespace/>style_1" 
					value="1" <%=(styleDisplay==1)?"checked":""%> onchange="<portlet:namespace />changeStyle(this)"></td>
				<td><label for="<portlet:namespace/>style_1">Thu tuc moi nhat</label></td>
			</tr>
			<tr>
				<td><input type="radio" name="<portlet:namespace/>styleDisplay" id="<portlet:namespace/>style_2" 
					value="2" <%=(styleDisplay==2)?"checked":""%> onchange="<portlet:namespace />changeStyle(this)"></td>
				<td><label for="<portlet:namespace/>style_2">Hien thi theo linh vuc</label></td>
			</tr>
			<tr>
				<td><input type="radio" name="<portlet:namespace/>styleDisplay" id="<portlet:namespace/>style_3" 
					value="3" <%=(styleDisplay==3)?"checked":""%> onchange="<portlet:namespace />changeStyle(this)"></td>
				<td><label for="<portlet:namespace/>style_3">Hien thi theo don vi/to chuc</label></td>
			</tr>
			</table>		
		</td>
	</tr>
		
	<tr><td>&nbsp;</td></tr>	
	</table>
	</td>
</tr>	
</table>

<div id="<portlet:namespace/>style-01" <%= (styleDisplay==1)?"":"style=\"display:none\"" %>>
	<table width="100%" cellspacing="1" cellpadding="0" border="0" >
	<tr>
		<td width="30%">So thu tuc duoc hien thi</td>
		<td>
			<select name="<portlet:namespace />documentPerPortlet" style="width:50px">
			<%	for(int i=5; i< 30;i=i+5){	%>
				<option value="<%=i%>" <%= (documentPerPortlet == i )? "selected":"" %>><%=i%></option>
			<%	}  %>
			</select>
		</td>
	</tr>
				
	<tr>
		<td width="20%">Thu tuc duoc xuat ban cach day</td>
		<td>
			<select name="<portlet:namespace/>period">
				<option value="1" <%= (period==1) ? "selected":""%>>1 tháng</option>
				<option value="3" <%= (period==3) ? "selected":""%>>3 tháng</option>
				<option value="6" <%= (period==6) ? "selected":""%>>6 tháng</option>
				<option value="12" <%= (period==12) ? "selected":""%>>12 tháng</option>
			</select>
		</td>
	</tr>	
	</table>
</div>
			
<div id="<portlet:namespace/>style-02" <%= (styleDisplay==2)?"":"style=\"display:none\"" %>>
	<table width="100%" cellspacing="1" cellpadding="0" border="0" >
	<tr height="30">
		<td><b>Chon linh vuc hien thi</b></td>
	</tr>
	<tr><td>
		<%=	ActionUtil.getFieldCheckbox(listField, renderResponse.getNamespace())%>
	</td></tr>
	</table>
</div>
	
<div id="<portlet:namespace/>style-03" <%= (styleDisplay==3)?"":"style=\"display:none\"" %>>
	<table width="100%" cellspacing="1" cellpadding="0" border="0" >
	<tr height="30">
		<td><b>Chon don vi / to chuc hien thi</b></td>
	</tr>
	<tr><td>
		<%=	ActionUtil.getOrgCheckbox(listOrg, renderResponse.getNamespace())%>
	</td></tr>
	</table>
</div>	
			
		
<br/>

</fieldset>
<br/>		
<div class="portlet-font" style="font-weight:bold;float:left; margin-right:10px">
	<input type="button" value="Save" onClick="<portlet:namespace />savePreferences();">		
</div>
<br/>			
</form>
	
<script type="text/javascript">
	var fieldsChecked = document.<portlet:namespace />fm.<portlet:namespace />fieldsChecked.value;
	var orgsChecked = document.<portlet:namespace />fm.<portlet:namespace />orgsChecked.value;
	var arrFieldsChecked = new Array();	
	arrFieldsChecked = fieldsChecked.split(",");
	
	var arrOrgsChecked = new Array();
	arrOrgsChecked = orgsChecked.split(",");
	
	
	var catObjects = document.getElementsByName("<portlet:namespace />field");
	for (var i = 0; (arrFieldsChecked != null) && (i < arrFieldsChecked.length); i ++) {
		for (var j = 0; (catObjects != null) && (j < catObjects.length); j ++) {
			if(catObjects[j].value == arrFieldsChecked[i]){
				catObjects[j].checked = true;
			}
		}
	}
	
	var orgObjects = document.getElementsByName("<portlet:namespace />org");
	for (var i = 0; (arrOrgsChecked != null) && (i < arrOrgsChecked.length); i ++) {
		for (var j = 0; (orgObjects != null) && (j < orgObjects.length); j ++) {
			if(orgObjects[j].value == arrOrgsChecked[i]){
				orgObjects[j].checked = true;
			}
		}
	}
</script>	