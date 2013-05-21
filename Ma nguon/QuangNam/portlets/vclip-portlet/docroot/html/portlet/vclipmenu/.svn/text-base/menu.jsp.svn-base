<%@ include file="/html/portlet/vclipmenu/init.jsp" %>
<jsp:directive.page import="com.vportal.portlet.vclip.util.WebKeysVClip"/>
<jsp:directive.page import="com.vportal.portlet.vclip.service.*"/>
<jsp:directive.page import="com.vportal.portlet.vclip.model.*"/>
<jsp:directive.page import="com.vportal.portlet.vclip.model.impl.*"/>
<jsp:directive.page import="java.util.ArrayList"/>
<jsp:directive.page import="com.liferay.portal.model.Portlet"/>
<jsp:directive.page import="com.liferay.portal.kernel.util.WebKeys"/>
<%@page import="com.vportal.portal.util.PortalUtilExt"%>
<div>
<%
	String language = ParamUtil.getString(request, "language", "vi_VN");
	long groupId = PortalUtilExt.getPortletGroupId(request);
	long currentPlid = PortalUtilExt.getPlid(request);
	long plId = 0;
	try{	
		plId = PortalUtilExt.getPlid(groupId, currentPlid,"vclipcontent");		
	}catch(Exception ex){
	}	
	List clipTypeList=ClipTypeServiceUtil.getLanguage(language,false);	
	%>
	
<table width="100%" border="0" cellspacing="0" cellpadding="0">
<tr>
	<td width="4" align="left" height="5">
		<img src="<%= themeDisplay.getPathThemeImage() %>/DB_image/1.gif" width="4" height="5"/></td>	
	<td height="3" background="<%= themeDisplay.getPathThemeImage() %>/DB_image/3.gif"></td>
	<td width="4" align="right">
		<img src="<%= themeDisplay.getPathThemeImage() %>/DB_image/2.gif" width="4" height="5" /></td>
</tr>
		
<tr>
   	<td width="4" align="left" background="<%= themeDisplay.getPathThemeImage() %>/DB_image/7.gif"></td>
	<td>
		<table width="100%" border="0" cellspacing="0" cellpadding="0" >
		<tr><td height="3px"></td></tr>
	
		<tr><td width="3px"></td>
		    <td>
				<table width="100%" border="0" cellspacing="0" cellpadding="0">
				<tr>
					<td width="17"><img src="<%= themeDisplay.getPathThemeImage() %>/DB_image/9.gif" width="17" height="30"/></td>
					<td width="100%" background="<%= themeDisplay.getPathThemeImage() %>/DB_image/10.gif" height="30" style="color:#FFFFFF;font-size:11px;font-weight:bold;text-transform:uppercase;" valign="middle">&nbsp;Chuyên m&#7909;c</td>
				</tr>
				<tr>
					<td colspan="2">
						 <table width="100%" border="0" cellspacing="0" cellpadding="0">
						<%	for(int i=0;i<clipTypeList.size();i++){
								ClipType t=(ClipType)clipTypeList.get(i);
								PortletURL categoryURL = new PortletURLImpl(request,"vclipcontent",plId,PortletRequest.RENDER_PHASE);
								categoryURL.setParameter("struts_action","/vclipcontent/view");
								categoryURL.setParameter(WebKeysVClip.CLIP_TYPE_ID,String.valueOf(t.getId()));	%>	
								
						 <tr>
						   <td width="5"></td>
						   <td>
								<td class="<%=(i==0)?"title_menu_first":"title_menu" %>"><a href="<%=categoryURL.toString() %>"><%= t.getName() %></a></td>
							</td>
						   <td width="5"></td>
						</tr>
						<%}%>		
						</table>
					</td>
				</tr>
				</table>
			</td>
			<td width="3px"></td>
		</tr>
		<tr><td height="3px"></td></tr>			 
		</table>
	</td>
	<td width="4" align="right" background="<%= themeDisplay.getPathThemeImage() %>/DB_image/8.gif"></td>	
</tr>
			
<tr>
	<td width="4" align="left" height="5">
		<img src="<%= themeDisplay.getPathThemeImage() %>/DB_image/6.gif" width="4" height="5"/></td>
	<td background="<%= themeDisplay.getPathThemeImage() %>/DB_image/4.gif" height="5"></td>
	<td width="4" align="right">
		<img src="<%= themeDisplay.getPathThemeImage() %>/DB_image/5.gif" width="4" height="5" /></td>
</tr>
</table>	