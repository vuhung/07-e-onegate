<%-- <%@ include file="/html/portlet/vadvmanview/init.jsp" %> --%>
	
<%@page import="com.liferay.portal.kernel.util.PropsKeys"%>
<%@page import="com.liferay.portal.kernel.language.UnicodeLanguageUtil"%>
<%@page import="com.liferay.portal.kernel.portlet.LiferayWindowState"%>
<%@page import="javax.portlet.ActionRequest"%>
<%@page import="com.liferay.portal.kernel.language.LanguageUtil"%>
<%@page import="javax.portlet.PortletURL"%>
<%@page import="java.util.ArrayList"%>
<%@page import="com.test.model.AdvType"%>
<%@ include file="/html/hienthiquangcao/init.jsp" %>
	
<%@page import="com.test.model.AdvItem"%>
<%@page import="com.test.service.AdvItemServiceUtil"%>
<%@page import="java.util.List"%>
<%@page import="com.test.service.AdvTypeServiceUtil"%>
<%@page import="javax.portlet.WindowState"%>
<%@ taglib uri="http://liferay.com/tld/aui" prefix="aui" %>



<%	

long _typeId = 0;
String typeId = request.getAttribute("typeIds").toString();
// 	String redirect = ParamUtil.geta(request, "redirect");
	PortletURL portletURL = renderResponse.createActionURL();
	portletURL.setWindowState(WindowState.MAXIMIZED);	
	portletURL.setParameter(ActionRequest.ACTION_NAME, "HienThi_New");
	
	//portletURL.setParameter("struts_action", "/vadvmanview/edit");
	portletURL.setParameter("jspPage","/html/hienthiquangcao/edit.jsp");
// 	PortletURL change = renderResponse.createActionURL();
// 	change.setParameter("tabsNames", "advquangcao.quangcao.tabs.item");
// 	change.setParameter(ActionRequest.ACTION_NAME, "HienThi_New");
ThemeDisplay themeDisplay12= (ThemeDisplay) request.getAttribute(WebKeys.THEME_DISPLAY);
long groupId12= themeDisplay12.getPortletGroupId();
	List listType = AdvTypeServiceUtil.getTypeByG(groupId12);
	if(listType ==null)
	{
		listType=new ArrayList();
	}
	List listItem = new ArrayList();	
	


	
	if(!("".equals(typeId)) && (typeId != null)){
	    _typeId = Long.parseLong(typeId);
	}

	if(_typeId == 0){
		listItem = AdvItemServiceUtil.getItemByG_S(groupId12, true);	
		
	} else {
		listItem = AdvItemServiceUtil.getItemByG_T_S(groupId12,_typeId, true);
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
<script type="text/javascript" src="<%=request.getContextPath()%>/js/jquery.js"></script>
<script  lang='javascript'>


function <portlet:namespace />changeType() {
	var typeId = document.getElementById("<portlet:namespace/>typeId").value;
	var url = "<portlet:actionURL  name="HienThi_News"></portlet:actionURL>";
	url = url+"&typeId="+typeId;

	jQuery('#<portlet:namespace/>ajax').load(url);
}
function <portlet:namespace />changeIsBorder(styleObj) {
	if(styleObj)
		if(styleObj.value==1){
			document.getElementById("<portlet:namespace/>isBorder").style.display = '';
		}else if(styleObj.value==3){
			document.getElementById("<portlet:namespace/>isBorder").style.display = 'none';
			
		}
}

</script>


	

<div id="<portlet:namespace/>ajax" >


<form  action="<%=portletURL.toString() %>" name="<porlet:namespace/>fm" method="post" >	
	<input name="<portlet:namespace />cmd" type="hidden" value=""/>
	<input name="<portlet:namespace />typeId" type="hidden" value=""/>	

<table  width="100%" cellspacing="1" cellpadding="4" border="0" align="center">	
<tr>
	<td width="100%" valign="top">		
		<fieldset style="border:1px dotted gray;">
		<legend><strong>C&#7845;u hình Portlet</strong></legend>
		<table class="lfr-table">
		<tr height="30">
			<td>Ch&#7885;n lo&#7841;i qu&#7843;ng cáo</td>
			<td>
				<select name="<portlet:namespace/>typeId" id="<portlet:namespace/>typeId" onchange="<portlet:namespace/>changeType() ;" >
					<option value="0">---- T&#7845;t c&#7843; ----</option>
					<%	if(listType != null && listType.size()>0){
							for(int i = 0; i<listType.size();i++){
								AdvType type = (AdvType)listType.get(i);	%>
						<option value="<%=type.getTypeId()%>" <%= String.valueOf(type.getTypeId()).equals(typeId) ? "selected" : "" %>><%=type.getName()%></option>
					<%	}}	%>
				</select>
			</td>
		</tr>
		<tr height="30">							
			<td>Ch&#7885;n qu&#7843;ng cáo &#273;&#7875; hi&#7875;n th&#7883; :</td>
		</tr>
		</table>
						
		<table class="lfr-table" width="100%" cellspacing="1" cellpadding="4" border="0">
		<tr height="30">
			<c:if test="<%= listItem.size() == 0%>">
				<td>		
					<font color="red">Lo&#7841;i qu&#7843;ng cáo này &#273;ang c&#7853;p nh&#7853;t !</font>
				</td>		
			</c:if>	
			<td>						
				<table class="lfr-table" width="100%">
				<%	if(listItem != null && listItem.size()>0){
						for(int i = 0; i<listItem.size();i++){
							AdvItem item = (AdvItem)listItem.get(i);	%>
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
		<legend><strong>C&#7845;u hình hi&#7875;n th&#7883;</strong></legend>
		<table width="100%">
		
		<tr>
			<td colspan="2"> 		
				<table width="100%">
				<tr height="25"><td><b>Ch&#7885;n ki&#7875;u hi&#7875;n th&#7883; PORTLET</b></td></tr>
				<tr>
					<td>
					<table>
					<tr height="25">
						<td><input type="radio" name="<portlet:namespace/>selectstyleBorder" id="<portlet:namespace/>selectstyleBorder_1" value="1" 
							<%=selectstyleBorder.equals("1")?"checked":""%> onchange="<portlet:namespace />changeIsBorder(this)"	></td>
						<td><label for="<portlet:namespace/>selectstyleBorder_1">Ki&#7875;u có vi&#7873;n</label></td>
					</tr>
					<tr height="25">
						<td><input type="radio" name="<portlet:namespace/>selectstyleBorder" id="<portlet:namespace/>selectstyleBorder_2" value="3" 
							<%=selectstyleBorder.equals("3")?"checked":""%>	onchange="<portlet:namespace />changeIsBorder(this)"></td>
						<td><label for="<portlet:namespace/>selectstyleBorder_2">Ki&#7875;u không có vi&#7873;n</label></td>
					</tr>
					<tr height="25">
						<td><input type="radio" name="<portlet:namespace/>selectstyleBorder" id="<portlet:namespace/>selectstyleBorder_3" value="3" 
							<%=selectstyleBorder.equals("3")?"checked":""%>	onchange="<portlet:namespace />changeIsBorder(this)"></td>
						<td><label for="<portlet:namespace/>selectstyleBorder_3">T&#7881; gi&#225; v&#224;ng</label></td>
					</tr>
					<tr height="25">
						<td><input type="radio" name="<portlet:namespace/>selectstyleBorder" id="<portlet:namespace/>selectstyleBorder_4" value="4" 
							<%=selectstyleBorder.equals("4")?"checked":""%>	onchange="<portlet:namespace />changeIsBorder(this)"></td>
						<td><label for="<portlet:namespace/>selectstyleBorder_4">Bi&#7875;u &#273;&#7891; ch&#7915;ng kho&#225;n</label></td>
					</tr>
					
					<tr height="25">
						<td><input type="radio" name="<portlet:namespace/>selectstyleBorder" id="<portlet:namespace/>selectstyleBorder_5" value="5" 
							<%=selectstyleBorder.equals("5")?"checked":""%>	onchange="<portlet:namespace />changeIsBorder(this)"></td>
						<td><label for="<portlet:namespace/>selectstyleBorder_5">Giao d&#7883;ch ch&#7913;ng kho&#225;n</label></td>
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
			 		 <td>&nbsp;&nbsp;C&#259;n l&#7873; trái</td>		
				 </tr>	 
				 <tr height="25">	 
				 	 <td>
				 	 	<select name="<portlet:namespace />paddingRight" >
				 	 	<%for(int j=0;j<10;j++){%>
				 	 		<option value="<%=j%>" <%=(paddingRight==j)?"selected":""%>><%=j%></option>
				 	 	<%}%>
				 	 	</select>
				 	 </td>
				 	 <td>&nbsp;&nbsp;C&#259;n l&#7873; ph&#7843;i</td>		
				 </tr>	
				</table>	
			</td>
									
			<td width="50%">				
				<table>	
				<tr height="25">	 
				 	<td>
				 	 	<select name="<portlet:namespace />paddingTop" >
					 	 	<%for(int i=0;i<16;i++){%>
					 	 		<option value="<%=i%>" <%=(paddingTop==i)?"selected":""%>><%=i%></option>
					 	 	<%}%>
					 	 	</select>
					</td>
				 	<td>&nbsp;&nbsp;C&#259;n l&#7873; trên</td>		
				</tr>	 
				<tr height="25">	 
				 	 <td>
				 	 	<select name="<portlet:namespace />paddingBottom" >
				 	 	<%for(int j=0;j<16;j++){%>
				 	 		<option value="<%=j%>" <%=(paddingBottom==j)?"selected":""%>><%=j%></option>
				 	 	<%}%>
				 	 	</select>
				 	 </td>
				 	 <td>&nbsp;&nbsp;C&#259;n l&#7873; d&#432;&#7899;i</td>		
				 </tr>	
				</table>
			</td>	
		</tr>
		</table>
		
		<br/>	
			
		<table class="lfr-table" width="100%">
		<tr height="30">
			<td width="50%" valign="top">
				<table class="lfr-talbe">
					<tr height="30">	
						<td><b><label for="<portlet:namespace/>defaultSize">Hi&#7875;n th&#7883; qu&#7843;ng cáo v&#7899;i kích th&#432;&#7899;c m&#7863;c &#273;&#7883;nh</label></b></td>
						<td><input type="checkbox" id="<portlet:namespace/>defaultSize" name="<portlet:namespace />defaultSize" onClick ="javascript:<portlet:namespace/>hide();" <%= _defaultSize ? "checked" : ""%> /></td>
					</tr>					
					<tr id="<portlet:namespace/>customSize" style="display:<%= _defaultSize ? "none": "" %>">						
						<td>
							<table>
							<tr height="30">
								<td>Chi&#7873;u r&#7897;ng</td>
								<td><input type="text" name="<portlet:namespace />width" style="width:30px;" value="<%= width%>"> px</td>
							</tr>
							<tr height="30">								
								<td>Chi&#7873;u cao</td>
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
						<td><b>C&#7845;u hình cho qu&#7843;ng cáo Flash, Clip:</b></td>
						<td/>
					</tr>	
					<tr height="30">
						<td>- T&#7921; &#273;&#7897;ng kh&#7903;i &#273;&#7897;ng</td>
						<td><input type="checkbox" name="<portlet:namespace />autoStart" <%= autoStart.equals("true") ? "checked": ""%> ></td>
					</tr>
						
					<tr height="30">
						<td>- T&#7921; &#273;&#7897;ng ch&#7841;y l&#7841;i</td>
						<td><input type="checkbox" name="<portlet:namespace />autoRepeat" <%= autoRepeat.equals("true") ? "checked": ""%> ></td>
					</tr>							
						
					<!-- <tr height="30">	
						<td>- Hi&#7875;n th&#7883; thanh &#273;i&#7873;u khi&#7875;n</td>
						<td>
							<select name="<portlet:namespace/>controlBar"/>
								<option value="none" <%= controlBar.equals("none")? "selected":""%>>Không hi&#7875;n th&#7883;</option>
								<option value="bottom" <%= controlBar.equals("bottom")? "selected":""%>>Hi&#7875;n th&#7883; &#7903; d&#432;&#7899;i</option>
								<option value="over" <%= controlBar.equals("over")? "selected":""%>>Hi&#7875;n th&#7883; &#7903; trên</option>
							</select>
						</td>
					</tr> -->			
				</table>
			</td>
		</tr>	
		</table>
		
		<div id="<portlet:namespace/>isBorder" <%=selectstyleBorder.equals("3")?"style=\"display:none\"":""%>>
			<table width="100%">
			<tr height="30">
				<td><b>Tùy bi&#7871;n tiêu &#273;&#7873; PORTLET</b></td>
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

<input type="submit" value="<%=LanguageUtil.get(pageContext, "save") %>"/>
</div>
<br/>
<br/>
</form>
</div>	
						

