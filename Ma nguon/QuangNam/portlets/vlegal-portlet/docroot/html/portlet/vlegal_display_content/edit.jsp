<%@page import="javax.portlet.ActionRequest"%>
<%@page import="com.liferay.portal.model.Layout"%>
<%@page import="com.vportal.portlet.vlegaldisplaycontent.util.LayoutPortletUtil"%>

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
<liferay-theme:defineObjects/>

<%
/**
 * Copyright (c) 2000-2008 VietSoftware, Inc. All rights reserved.
 */
%>
<%@ include file="/html/portlet/vlegal_display_content/init.jsp" %>

<% 
	
	List selectLayouts = (List)request.getAttribute("SELECT_LAYOUTS");
	
// 	List selectLayouts = (List) renderRequest

	List selectPortletLayoutIds = (List)request.getAttribute("SELECT_PORTLET_LAYOUT_IDS");

	if(selectPortletLayoutIds == null && Validator.isNotNull(layoutPortletId)){
		try{
			selectPortletLayoutIds = LayoutPortletUtil.getPortletIdsByLayout(Long.parseLong(layoutPortletId));
		}catch(Exception ex){
		}
	}	
	String plid_layout = (String)request.getAttribute("PLID_LAYOUT");	

	if(Validator.isNull(plid_layout)||(Validator.isNotNull(plid_layout) && plid_layout.equals("0"))){
		plid_layout = layoutPortletId;
		if(portletSelectId.equals("")){
			plid_layout = String.valueOf( layout.getPlid());
			selectPortletLayoutIds =  LayoutPortletUtil.getPortletIdsByLayout(layout.getPlid());
			portletSelectId = portletDisplay.getId();

			}
	}
	
%>

<script type="text/javascript">
	function <portlet:namespace />saveConfiguration() {
		var layoutPlId = document.<portlet:namespace />fm.<portlet:namespace />layoutPortletId.value;
		if(layoutPlId != "0"){
			document.<portlet:namespace />fm.<portlet:namespace />layoutIdSelected.value = layoutPlId;
		}
		submitForm(document.<portlet:namespace />fm, '<portlet:actionURL windowState="<%= WindowState.MAXIMIZED.toString() %>"><portlet:param name="jspPage" value="/html/portlet/vlegal_display_content/edit.jsp" /></portlet:actionURL>');
	}
	
	function <portlet:namespace/>findPortletLayout(){
		var layoutPlId = document.<portlet:namespace />fm.<portlet:namespace />layoutPortletId.value;
		if(layoutPlId != "0"){
			document.<portlet:namespace />fm.<portlet:namespace />layoutIdSelected.value = layoutPlId;
		
			submitForm(document.<portlet:namespace />fm, '<portlet:renderURL windowState="<%= WindowState.MAXIMIZED.toString() %>"><portlet:param name="jspPage" value="/html/portlet/vlegal_display_menu/edit.jsp" /></portlet:renderURL>');
		}
	}
	function <portlet:namespace />changeTheme(styleObj) {
		if(styleObj)
			if(styleObj.value==1){
				document.getElementById("<portlet:namespace/>themes_DIENBIEN").style.display = '';
			}else if(styleObj.value==2){
				document.getElementById("<portlet:namespace/>themes_DIENBIEN").style.display = 'none';
			}else if(styleObj.value==3){
				document.getElementById("<portlet:namespace/>themes_DIENBIEN").style.display = 'none';		
			}
	}

</script>
<form  method="post" name="<portlet:namespace/>fm" >
<input name="<portlet:namespace />layoutIdSelected" type="hidden" value=""/>	
<input name="<portlet:namespace />cmd" type="hidden" value="SELECT_LAYOUT"/>
				
<fieldset>
<legend><b>C&#7845;u h�nh chung</b></legend>
<table width="100%" border="0" cellpadding="4" cellspacing="1">
<tr>
	<td width="50%">
		<img src="/vlegal-portlet/html/portlet/images/editcopy.png"/> L&#7921;a ch&#7885;n Layout Tab <b>ch&#7913;a Portlet Hi&#7875;n th&#7883; v&#259;n b&#7843;n ph�p quy</b> :
	</td>
	<td>
		<select name="<portlet:namespace/>layoutPortletId" onchange="javascript:<portlet:namespace/>findPortletLayout();">
			<option value="0">---------</option>
			<%
			if(selectLayouts != null && selectLayouts.size()>0){
				for(int count = 0; count<selectLayouts.size();count++){
					Layout selectLayout = (Layout)selectLayouts.get(count);
			%>
					<option value="<%=selectLayout.getPlid()%>" <%=(Validator.isNotNull(plid_layout) && plid_layout.equals(String.valueOf(selectLayout.getPlid())))?"selected":""%>><%=selectLayout.getHTMLTitle(language)%></option>
			<%}
			}
			%>
		</select>
	</td>
</tr>
<tr>
	<td width="50%">
		<img src="/vlegal-portlet/html/portlet/images/editcopy.png"/> L&#7921;a ch&#7885;n <b>Portlet Hi&#7875;n th&#7883; v&#259;n b&#7843;n ph�p quy</b>:
	</td>
	<td>
		<select name="<portlet:namespace/>portletSelectId">
			<%
				if(selectPortletLayoutIds != null && selectPortletLayoutIds.size()>0){
					for(int count = 0; count<selectPortletLayoutIds.size();count++){
						String portletLayoutId = (String)selectPortletLayoutIds.get(count);
			%>
							<option value="<%=portletLayoutId%>" <%=(Validator.isNotNull(portletSelectId) && portletSelectId.equals(portletLayoutId))?"selected":""%>><%=portletLayoutId%></option>
			<%
				}
			 }
			%>
		</select>
	</td>
</tr>
				
<tr>
	<td><img src="/vlegal-portlet/html/portlet/images/editcopy.png"/> <b>S&#7889; v&#259;n b&#7843;n</b> hi&#7875;n th&#7883; tr�n m&#7897;t trang</td>
	<td>
		<select name="<portlet:namespace />documentPerPage" style="width:50px">
			<%	
				for(int i=5; i< 30;i=i+5){
			%>
				<option value="<%=i%>" <%= (documentPerPage == i) ? "selected" : "" %> ><%=i%></option>
			<%	
				} 
			%>
		</select>
	</td>
</tr>

<tr><td colspan="2">&nbsp;</td></tr>
				
<tr>
	<td colspan="2">
		<table width="100%">
		<tr height="25">
			<td><b>T�y bi&#7871;n ti�u &#273;&#7873; PORTLET</b></td>
			<td><input type="text" name="<portlet:namespace/>titlePortlet" value="<%=titlePortlet%>" style="width:200px;"></td>
		</tr>
		
		<tr height="25">
			<td><b>T�y bi&#7871;n theo THEMES</b></td>
			<td>
				<input type="radio" value="1" name="<portlet:namespace/>themeType" id="<portlet:namespace/>themeType_1" 
					<%=themeType.equals("1")?"checked":""%> onchange="<portlet:namespace />changeTheme(this)">
					<label for="<portlet:namespace/>themeType_1">Themes &#272;i&#7879;n Bi�n</label>
				&nbsp;&nbsp;
				<input type="radio" value="2" name="<portlet:namespace/>themeType" id="<portlet:namespace/>themeType_2" 
					<%=themeType.equals("2")?"checked":""%> onchange="<portlet:namespace />changeTheme(this)">
					<label for="<portlet:namespace/>themeType_2">Themes c�c s&#7903; ban ng�nh</label>
				&nbsp;&nbsp;
				<input type="radio" value="3" name="<portlet:namespace/>themeType" id="<portlet:namespace/>themeType_3" 
					<%=themeType.equals("3")?"checked":""%> onchange="<portlet:namespace />changeTheme(this)">
					<label for="<portlet:namespace/>themeType_3">Trang Doanh nghi&#7879;p, Ng&#432;&#7901;i d�n, Du kh�ch</label>	
			</td>
		</tr>
		</table>
	</td>
</tr>
			
<tr><td colspan="2">&nbsp;</td></tr>

<tr>
	<td colspan="2" id="<portlet:namespace/>themes_DIENBIEN" <%= (themeType.equals("1"))?"":"style=\"display:none\"" %>>
	<table width="100%">
	<tr height="30">
		<td><b>Ch&#7885;n ki&#7875;u vi&#7873;n</b></td>
		<td><b>Ch&#7885;n ki&#7875;u bullet</b></td>
		<td><b>Ch&#7885;n ki&#7875;u n&#7873;n ti&#234;u &#273;&#7873;</b></td>
		<td><b>M&#224;u n&#7873;n n&#7897;i dung</b></td>
	</tr>
			  	  
	<tr>
		<td><input type="radio" name="<portlet:namespace/>styleBorder" value="border_blue" <%= styleBorder.equals("border_blue") ? "checked":"" %>/>
		&nbsp; Xanh bi&#7875;n <span class="border_blue">&nbsp;&nbsp;&nbsp;&nbsp;</span></td>
		
		<td><input type="radio" name="<portlet:namespace/>styleBullet" value="bullet_yellow" <%= styleBullet.equals("bullet_yellow") ? "checked":"" %>/>
		&nbsp; V&#224;ng <img src="<%= themeDisplay.getPathThemeImage() %>/DB_image/bullet_yellow.gif" /></td>
			
		<td><input type="radio" name="<portlet:namespace/>styleTitle" value="title_blue" <%= styleTitle.equals("title_blue") ? "checked":"" %>/>
		&nbsp; Xanh bi&#7875;n <img src="<%= themeDisplay.getPathThemeImage() %>/DB_image/title_bg_wrap_blue.gif" /></td>
			
		<td><input type="radio" name="<portlet:namespace/>styleContent" value="content_blue" <%= styleContent.equals("content_blue") ? "checked":"" %>/>
		&nbsp; Xanh nh&#7841;t <span class="content_blue">&nbsp;&nbsp;&nbsp;&nbsp;</span> </td>
	</tr>
			
    <tr height="30">
        <td><input type="radio" name="<portlet:namespace/>styleBorder" value="border_light_blue" <%= styleBorder.equals("border_light_blue") ? "checked":"" %>/>
          &nbsp; Xanh ng&#7885;c <span class="border_light_blue">&nbsp;&nbsp;&nbsp;&nbsp;</span></td>
        
        <td><input type="radio" name="<portlet:namespace/>styleBullet" value="bullet_white_green" <%= styleBullet.equals("bullet_white_green") ? "checked":"" %>/>
          &nbsp; Tr&#7855;ng xanh ng&#7885;c <img src="<%= themeDisplay.getPathThemeImage() %>/DB_image/bullet_white_green.gif" /></td>
            
        <td><input type="radio" name="<portlet:namespace/>styleTitle" value="title_light_blue" <%= styleTitle.equals("title_light_blue") ? "checked":"" %>/>
          &nbsp; Xanh ng&#7885;c <img src="<%= themeDisplay.getPathThemeImage() %>/DB_image/title_bg_wrap_light_blue.gif" /></td>
        
        <td><input type="radio" name="<portlet:namespace/>styleContent" value="content_orange" <%= styleContent.equals("content_orange") ? "checked":"" %>/>
          &nbsp; V&#224;ng nh&#7841;t <span class="content_orange">&nbsp;&nbsp;&nbsp;&nbsp;</span> </td>    
	 
   </tr>
   			
    <tr height="30">
        <td><input type="radio" name="<portlet:namespace/>styleBorder" value="border_orange" <%= styleBorder.equals("border_orange") ? "checked":"" %>/>
          &nbsp; Da cam  <span class="border_orange">&nbsp;&nbsp;&nbsp;&nbsp;</span></td>
        
        <td><input type="radio" name="<portlet:namespace/>styleBullet" value="bullet_white_orange" <%= styleBullet.equals("bullet_white_orange") ? "checked":"" %>/>
          &nbsp; Tr&#7855;ng cam <img src="<%= themeDisplay.getPathThemeImage() %>/DB_image/bullet_white_orange.gif" /></td>
            
        <td><input type="radio" name="<portlet:namespace/>styleTitle" value="title_orange" <%= styleTitle.equals("title_orange") ? "checked":"" %>/>
          &nbsp; Da cam <img src="<%= themeDisplay.getPathThemeImage() %>/DB_image/title_bg_wrap_orange.gif" /></td>
            
	   	<td>&nbsp;</td>
      </tr>		
   	
   	  <tr height="30">
        <td><input type="radio" name="<portlet:namespace/>styleBorder" value="border_green" <%= styleBorder.equals("border_green") ? "checked":"" %>/>
          &nbsp; Xanh l&#225; c&#226;y <span class="border_green">&nbsp;&nbsp;&nbsp;&nbsp;</span></td>
        <td></td>
        <td><input type="radio" name="<portlet:namespace/>styleTitle" value="title_green" <%= styleTitle.equals("title_green") ? "checked":"" %>/>
          &nbsp; Xanh l&#225; c&#226;y <img src="<%= themeDisplay.getPathThemeImage() %>/DB_image/title_bg_wrap_green.gif" /></td>
	    <td></td>			      
  	 </tr> 		
  	
    <tr height="30">
        <td><input type="radio" name="<portlet:namespace/>styleBorder" value="" <%= styleBorder.equals("") ? "checked":"" %>/>
          <i>&nbsp; M&#7863;c &#273;&#7883;nh (Kh�ng c� vi&#7873;n)</i></td>
          
        <td><input type="radio" name="<portlet:namespace/>styleBullet" value="" <%= styleBullet.equals("") ? "checked":"" %>/>
          <i>&nbsp; M&#7863;c &#273;&#7883;nh (Kh�ng c� bullet)</i></td>
            
        <td><input type="radio" name="<portlet:namespace/>styleTitle" value="" <%= styleTitle.equals("") ? "checked":"" %>/>
          <i>&nbsp; M&#7863;c &#273;&#7883;nh (Kh�ng c� n&#7873;n ti&#234;u &#273;&#7873;)</i></td>
            
	    <td><input type="radio" name="<portlet:namespace/>styleContent" value="" <%= styleContent.equals("") ? "checked":"" %>/>
          <i>&nbsp; M&#7863;c &#273;&#7883;nh (Kh�ng c� n&#7873;n )</i></td>
    </tr> 	  
   </table>
   </td>
</tr>
	
</table>
</fieldset>
	<br/>
	<input type="button" value="<liferay-ui:message key="save" />" onClick="<portlet:namespace />saveConfiguration();" />
</form>