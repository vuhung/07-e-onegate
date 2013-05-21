<%-- <%@ include file="/html/portlet/vadvmanview/init.jsp" %> --%>
<%@ include file="/html/view_adv/init.jsp" %>

<%@page import="com.liferay.portal.kernel.util.PropsKeys"%>
<%@page import="com.liferay.portal.kernel.language.UnicodeLanguageUtil"%>
<%@page import="com.liferay.portal.kernel.portlet.LiferayWindowState"%>
<%@page import="com.liferay.portal.kernel.language.LanguageUtil"%>

<%@page import="javax.portlet.WindowState"%>
<%@page import="javax.portlet.ActionRequest"%>
<%@page import="javax.portlet.PortletURL"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>

<%@page import="com.vsi.advertisement.portlet.model.AdvType"%>	
<%@page import="com.vsi.advertisement.portlet.model.AdvItem"%>
<%@page import="com.vsi.advertisement.portlet.service.AdvItemServiceUtil"%>
<%@page import="com.vsi.advertisement.portlet.service.AdvTypeServiceUtil"%>

<%@ taglib uri="http://liferay.com/tld/aui" prefix="aui" %>

<%	
	long _typeId = 0;
	String typeId = null;
	typeId= request.getParameter("typeId");
	if(typeId != null)
	{
   		typeId = request.getAttribute("typeIds").toString();
	}

// 	ThemeDisplay themeDisplay12= (ThemeDisplay) request.getAttribute(WebKeys.THEME_DISPLAY);
// 	long groupId12= themeDisplay12.getScopeGroupId();
	
	List<AdvType> listType = AdvTypeServiceUtil.getAllType();
	if(listType == null)
	{
		listType = new ArrayList<AdvType>();
	}
	
	List<AdvItem> listItem = new ArrayList<AdvItem>();
	
	if(!("".equals(typeId)) && (typeId != null)){
	    _typeId = Long.parseLong(typeId);
	}

	if(_typeId == 0){
		listItem = AdvItemServiceUtil.getItemByStatus(true);
		
	} else {
		listItem = AdvItemServiceUtil.getItemByTypeStatus(_typeId, true);
	}
		
	// preference
	String itemId = prefs.getValue("itemId", "");
	String width = prefs.getValue("width","196");
 	String height = prefs.getValue("height","66");
	
	String titlePortlet = prefs.getValue("titlePortlet","");
	
	String selectstyleBorder = prefs.getValue("selectstyleBorder","1");
	String selectedstyleBorder = ParamUtil.getString(request, "selectstyleBorder","");
	if(!selectedstyleBorder.equals("")){
	   selectstyleBorder = selectedstyleBorder;
	}
	String autoStart = prefs.getValue("autoStart","true");
	String autoRepeat =  prefs.getValue("autoRepeat","true");
	String controlBar = prefs.getValue("controlBar","none");
	String defaultSize = prefs.getValue("defaultSize","true");
	
	boolean _defaultSize = Boolean.valueOf(defaultSize);
%>

<script type="text/javascript" 
		src="/js/jquery.js">
</script>

<script type="text/javascript">
function <portlet:namespace />changeType() {
	var typeId = document.getElementById("<portlet:namespace/>typeId").value;
	var url = "<portlet:actionURL  name="HienThi_News"></portlet:actionURL>";
	url = url+"&_typeId="+typeId;

	jQuery('#<portlet:namespace/>ajax').load(url);
}

function <portlet:namespace />hide(){
	var defautltSize = document.getElementById('<portlet:namespace/>defaultSize');
	var customSize = document.getElementById('<portlet:namespace/>customSize');
	if (defautltSize.checked){
		customSize.style.display = "none";
	} else {
		customSize.style.display = "";
	}
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

function <portlet:namespace />changeIsBorder(styleObj) {
	if(styleObj)
		if(styleObj.value==1){
			document.getElementById("<portlet:namespace/>isBorder").style.display = '';
		}else if(styleObj.value==2){
			document.getElementById("<portlet:namespace/>isBorder").style.display = 'none';
			
		}
}
</script>

<portlet:actionURL name="viewAdv" var="viewAdvURL" />

<div id="<portlet:namespace/>ajax" >
<form  action="<%=viewAdvURL.toString() %>" name="<porlet:namespace/>fm" method="post" >	
	<input name="<portlet:namespace />cmd" type="hidden" value=""/>
	<input name="<portlet:namespace />typeId" type="hidden" value=""/>	

<table  width="100%" cellspacing="1" cellpadding="4" border="0" align="center">	
<tr>
	<td width="100%" valign="top">		
		<fieldset style="border:1px dotted gray;">
		<legend><strong><b><%= LanguageUtil.get(pageContext, "config.portlet") %></b></strong></legend>
		<table class="lfr-table">
		<tr height="30">
			<td><%= LanguageUtil.get(pageContext, "choose.type.adv") %></td>
			<td>
				<select name="<portlet:namespace/>typeId" id="<portlet:namespace/>typeId" onchange="<portlet:namespace/>changeType() ;" >
					<option value="0">----<%= LanguageUtil.get(pageContext, "actions.searchAll") %>----</option>
					<%	if(listType != null && listType.size()>0){
							for(int i = 0; i<listType.size();i++){
								AdvType type = (AdvType)listType.get(i);	%>
						<option value="<%=type.getTypeId()%>" <%= String.valueOf(type.getTypeId()).equals(typeId) ? "selected" : "" %>><%=type.getName()%></option>
					<%	}}	%>
				</select>
			</td>
		</tr>
		<tr height="30">							
			<td><%= LanguageUtil.get(pageContext, "choose.item.adv") %>:</td>
		</tr>
		</table>
						
		<table class="lfr-table" width="100%" cellspacing="1" cellpadding="4" border="0">
		<tr height="30">
			<c:if test="<%= listItem.size() == 0%>">
				<td>		
					<font color="red"><%= LanguageUtil.get(pageContext, "no.item.adv") %></font>
				</td>		
			</c:if>	
			<td>						
				<table class="lfr-table" width="100%">
				<%	if(listItem != null && listItem.size()>0){
						for(int i = 0; i<listItem.size();i++){
							AdvItem item = (AdvItem)listItem.get(i);	
				%>
				<% if(i%2==0){ %>
				<tr height="25" valign="middle">
				<%} %>
					<td>
						<input type="radio" id="<portlet:namespace/>itemId_<%=item.getItemId()%>" name="<%= renderResponse.getNamespace()%>itemId" value="<%=item.getItemId()%>" <%= (String.valueOf(item.getItemId()).equals(itemId))? "checked":"" %>/>
						<label for="<portlet:namespace/>itemId_<%=item.getItemId()%>"><%= item.getDescription()%>&nbsp; - &nbsp; <%= item.getName()%><label>
					</td>
				<% if(i%2==1){ %>		
				</tr>				
				
				<%}}} %>
				</table>
			</td>
		</tr>
		</table>
		</fieldset>
							
		<br/>
							
		<fieldset>
		<legend><strong><b><%= LanguageUtil.get(pageContext, "config.display") %></b></strong></legend>
		<table width="100%">
		
		<tr>
			<td colspan="2"> 		
				<table width="100%">
				<tr height="25"><td><b><%= LanguageUtil.get(pageContext, "choose.typeDisplay") %></b></td></tr>
				<tr>
					<td>
					<table>
					<tr height="25">
						<td><input type="radio" name="<portlet:namespace/>selectstyleBorder" id="<portlet:namespace/>selectstyleBorder_1" value="1" 
							<%=selectstyleBorder.equals("1")?"checked":""%> onchange="<portlet:namespace />changeIsBorder(this)"	></td>
						<td><label for="<portlet:namespace/>selectstyleBorder_1"><%= LanguageUtil.get(pageContext, "type.border") %></label></td>
					</tr>
					<tr height="25">
						<td><input type="radio" name="<portlet:namespace/>selectstyleBorder" id="<portlet:namespace/>selectstyleBorder_2" value="2" 
							<%=selectstyleBorder.equals("2")?"checked":""%>	onchange="<portlet:namespace />changeIsBorder(this)"></td>
						<td><label for="<portlet:namespace/>selectstyleBorder_2"><%= LanguageUtil.get(pageContext, "type.nonBorder") %></label></td>
					</tr>
					
					</table>
					</td>
				</tr>
				</table>
			</td>	
		</tr>	
				
		<tr>
			<td width="50%">				
				<table>	
				<tr height="25">	 
				 	 <td>
				 	 	<select name="<portlet:namespace />paddingLeft" >
				 	 	<%for(int i=0;i<10;i++){%>
				 	 		<option value="<%=i%>" <%=(paddingLeft==i)?"selected":""%>><%=i%></option>
				 	 	<%}%>
				 	 	</select>
				 	 </td>
			 		 <td>&nbsp;&nbsp;<%= LanguageUtil.get(pageContext, "type.alignLeft") %></td>		
				 </tr>	 
				 <tr height="25">	 
				 	 <td>
				 	 	<select name="<portlet:namespace />paddingRight" >
				 	 	<%for(int j=0 ; j<10 ;j++){%>
				 	 		<option value="<%=j%>" <%=(paddingRight==j)?"selected":""%>><%=j%></option>
				 	 	<%}%>
				 	 	</select>
				 	 </td>
				 	 <td>&nbsp;&nbsp;<%= LanguageUtil.get(pageContext, "type.alignRight") %></td>		
				 </tr>	
				</table>	
			</td>
									
<!-- 			<td width="50%">				 -->
<!-- 				<table>	 -->
<!-- 				<tr height="25">	  -->
<!-- 				 	<td> -->
<%-- 				 	 	<select name="<portlet:namespace />paddingTop" > --%>
<%-- 					 	 	<%for(int i=0;i<16;i++){%> --%>
<%-- 					 	 		<option value="<%=i%>" <%=(paddingTop==i)?"selected":""%>><%=i%></option> --%>
<%-- 					 	 	<%}%> --%>
<!-- 					 	 	</select> -->
<!-- 					</td> -->
<!-- 				 	<td>&nbsp;&nbsp;Can le trên</td>		 -->
<!-- 				</tr>	  -->
<!-- 				<tr height="25">	  -->
<!-- 				 	 <td> -->
<%-- 				 	 	<select name="<portlet:namespace />paddingBottom" > --%>
<%-- 				 	 	<%for(int j=0;j<16;j++){%> --%>
<%-- 				 	 		<option value="<%=j%>" <%=(paddingBottom==j)?"selected":""%>><%=j%></option> --%>
<%-- 				 	 	<%}%> --%>
<!-- 				 	 	</select> -->
<!-- 				 	 </td> -->
<!-- 				 	 <td>&nbsp;&nbsp;Can le duoi</td>		 -->
<!-- 				 </tr>		 -->
<!-- 				</table> -->
<!-- 			</td>	 -->
		</tr>
		</table>
		
		<br/>	
			
		<table class="lfr-table"  width="100%">
		<tr height="30">
			<td width="50%" valign="top">
				<table class="lfr-talbe">
					<tr height="30">	
						<td><b><label for="<portlet:namespace/>defaultSize"><%= LanguageUtil.get(pageContext, "display.adv.sizeDefault") %></label></b></td>
						<td><input type="checkbox" id="<portlet:namespace/>defaultSize" name="<portlet:namespace />defaultSize" onClick ="javascript:<portlet:namespace/>hide();" <%= _defaultSize ? "checked" : ""%> /></td>
					</tr>					
					<tr id="<portlet:namespace/>customSize" style="display:<%= _defaultSize ? "none": "" %>">						
						<td>
							<table>
							<tr height="30">
								<td><%= LanguageUtil.get(pageContext, "size.width") %></td>
								<td><input type="text" name="<portlet:namespace />width" style="width:30px;" value="<%= width%>"> px</td>
							</tr>
							<tr height="30">								
								<td><%= LanguageUtil.get(pageContext, "size.height") %></td>
								<td><input type="text" name="<portlet:namespace />height" style="width:30px;" value="<%= height%>"> px</td>
							</tr>
							</table >
						</td>
					</tr>
				</table>
			</td>				
			<td valign="top">
				<table class="lfr-table">
					<tr height="30">
						<td><b><%= LanguageUtil.get(pageContext, "config.adv.flash-clip") %>:</b></td>
						<td/>
					</tr>	
					<tr height="30">
						<td>- <%= LanguageUtil.get(pageContext, "config.adv.flash-clip.auto-start") %></td>
						<td><input type="checkbox" name="<portlet:namespace />autoStart" <%= autoStart.equals("true") ? "checked": ""%> ></td>
					</tr>
						
					<tr height="30">
						<td>- <%= LanguageUtil.get(pageContext, "config.adv.flash-clip.auto-replay") %></td>
						<td><input type="checkbox" name="<portlet:namespace />autoRepeat" <%= autoRepeat.equals("true") ? "checked": ""%> ></td>
					</tr>							
									
				</table>
			</td>
		</tr>	
		</table>
		
		<div id="<portlet:namespace/>isBorder" <%=selectstyleBorder.equals("3")?"style=\"display:none\"":""%>>
			<table width="100%">
			<tr height="30">
				<td><b><%= LanguageUtil.get(pageContext, "title.portlet") %></b></td>
				<td><input type="text" name="<portlet:namespace/>titlePortlet" value="<%=titlePortlet%>" style="width:200px;">
			</tr>
			</table>	
		</div>			
					
		</fieldset>
	</td>	
</tr>
		
</table>
					
<br/>
<div class="portlet-font" style="font-weight:bold;float:left; margin-right:10px">

<input type="submit" value="<%=LanguageUtil.get(pageContext, "actions.save") %>"/>
</div>
<br/>
<br/>
</form>
</div>	
						

