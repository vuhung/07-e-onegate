
<%@page import="javax.portlet.ActionRequest"%>
<%@page import="com.liferay.portal.kernel.language.LanguageUtil"%>
<%@page import="com.liferay.portal.kernel.util.Validator"%>
<%@page import="com.vportal.portlet.vlegal.model.VLegalOrg"%>
<%@page import="com.vportal.portlet.vlegal.model.VLegalType"%>
<%@page import="com.liferay.portal.theme.ThemeDisplay"%>
<%@page import="javax.portlet.PortletURL"%>
<%@page import="com.vportal.portlet.vlegal.service.VLegalTypeServiceUtil"%>
<%@page import="com.vportal.portlet.vlegal.service.VLegalOrgServiceUtil"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@page import="com.liferay.portlet.PortletURLFactoryUtil"%>
<%@page import="javax.portlet.PortletRequest"%>
<%@page import="com.liferay.portal.kernel.util.Constants"%>
<%@page import="com.liferay.portal.kernel.util.ParamUtil"%>
<%@page import="com.liferay.portal.kernel.util.StringPool"%>

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
<%@ include file="/html/portlet/vlegal_display_menu/css.jsp" %>

<%@page import="javax.portlet.PortletURL"%>

<portlet:defineObjects />
<liferay-theme:defineObjects/>

<%
	String redirect = StringPool.BLANK;
	String cmd = ParamUtil.getString(request, Constants.CMD);
	String organizationId =  ParamUtil.getString(request, "organizationid", StringPool.BLANK);
	String typeDocId =  ParamUtil.getString(request, "typedocid", StringPool.BLANK);	
	
	PortletURL vlegalContentURL = PortletURLFactoryUtil.create(request,portletSelectId, plid, PortletRequest.RENDER_PHASE);
// 	PortletURL vlegalContentURL = new PortletURLImpl(request, portletSelectId, plid, PortletRequest.RENDER_PHASE);
// 	PortletURL vlegalContentURL = renderResponse.createRenderURL();

// 	PortletURL vlegalContentURL = renderResponse.createActionURL();
// 	vlegalContentURL.setParameter(ActionRequest.ACTION_PHASE, "menuAction");

// 	vlegalContentURL.setParameter("jspPage", "/html/portlet/vlegal_display_content/view.jsp");
	vlegalContentURL.setParameter("language",language);
	vlegalContentURL.setParameter("cmd","searchBasic");
	vlegalContentURL.setParameter("groupId",String.valueOf(groupId));
	
	
	// Get all active organization
		List organizations = new ArrayList();
		try 
		{
			organizations = VLegalOrgServiceUtil.getAllOrgByS_L(groupId, true, language);
// 			organizations = VLegalOrgServiceUtil.getAllOrg();
		} catch (Exception ex) {
			// Ignore..
		}
		
		// Get all active type document
		List types = new ArrayList();
		try 
		{
			types = VLegalTypeServiceUtil.getTypesByL_S(groupId, language, true);
// 			types = VLegalTypeServiceUtil.getAllTypes();
		} catch(Exception ex) {
			// Ignore
		}
		
		String temp1 = "box_left_portlet " + styleBullet + " " +styleTitle;
		String temp2 = styleBorder;
%>


<script type="text/javascript">
	function <portlet:namespace />updateField(cmd, render) 
	{
		document.<portlet:namespace />fm.<portlet:namespace /><%= Constants.CMD %>.value = cmd;		
		if (render) 
		{
			submitForm(document.<portlet:namespace />fm, '<portlet:renderURL windowState="<%= WindowState.MAXIMIZED.toString() %>"><portlet:param name="jspPage" value="/html/portlet/vlegal/field_edit.jsp" /></portlet:renderURL>');
		} 
		else 
		{
			submitForm(document.<portlet:namespace />fm, '<portlet:actionURL windowState="<%= WindowState.MAXIMIZED.toString() %>"><portlet:param name="struts_action" value="/vcms/edit_field" /></portlet:actionURL>');
		}
	}
</script>

<%
	if(themeType.equals("1"))
	{
%>

<div class="<%=temp1%>" style="margin-left: 2px;">
	<div class="header_vlegal_menu">
<%-- 		<%= LanguageUtil.get(pageContext, "header.van.ban.phap.luat") %> --%>
		<%= titlePortlet %>
	</div>
	<div class="<%= temp2 %>">	
		<div  class="menu_left">
			<table class="tb_menu">
				<tr>
					<td>
						<a href="<%= vlegalContentURL %>">
							<%= LanguageUtil.get(pageContext, "moi.ban.hanh") %>
						</a>
					</td>
				</tr>
			</table>
		</div>
		<div  class="menu_left">
			<table class="tb_menu">
				<tr>
					<td>
						<a href="<%= vlegalContentURL %>">
							<%= LanguageUtil.get(pageContext, "toan.bo.van.ban") %>
						</a>
					</td>
				</tr>
			</table>
		</div>
		<div  class="menu_left">
			<table class="tb_menu">
				<tr>
					<td>
						<%= LanguageUtil.get(pageContext, "co.quan.ban.hanh") %>
					</td>
				</tr>
			</table>
		</div>
		  	  
		<c:if test="<%= organizations.size()>0%>">
		<%
			for(int i=0; i<organizations.size(); i++) { 
				VLegalOrg org = (VLegalOrg)organizations.get(i);
				vlegalContentURL.setParameter("organizationid", org.getOrgId());
				vlegalContentURL.setParameter("typedocid", "");	
				
		%>
					<div class="menu_left_01">
						<table class="tb_menu_02">
							<tr>
								<td>
									<a href="<%= vlegalContentURL %>" >
										<%= org.getName() %>
									</a>
								</td>
							</tr>
						</table>
					</div>
		<%}%>	  
		</c:if>
		  	  
		<div  class="menu_left">
			<table class="tb_menu">
				<tr>
					<td>
						<%= LanguageUtil.get(pageContext, "loai.van.ban") %>
					</td>
				</tr>
			</table>
		</div>
		  	  
		<c:if test='<%=types.size()>0 %>' >
		<% 
			for(int i=0; i<types.size(); i++) 
			{ 
				VLegalType type = (VLegalType)types.get(i);
				vlegalContentURL.setParameter("typedocid", type.getTypeId());
				vlegalContentURL.setParameter("organizationid", "");
		%>	  	  
				<div class="menu_left_01">
					<table class="tb_menu_02">
						<tr>
							<td>
								<a href="<%= vlegalContentURL %>">
									<%= type.getName() %>
								</a>
							</td>
						</tr>
					</table>
				</div>	 
		<%
			}
		%>
		</c:if>
		<div  class="menu_left">
			<table class="tb_menu_01">
				<tr>
					<td>
						<a href="<%= vlegalContentURL %>"><%= LanguageUtil.get(pageContext, "van.ban.chi.dao.dieu.hanh") %></a>
					</td>
				</tr>
			</table>
		</div>
		<div  class="menu_left">
			<table class="tb_menu_01">
				<tr>
					<td>
						<a href="<%= vlegalContentURL %>"><%= LanguageUtil.get(pageContext, "nghi.quyet.phien.hop") %></a>
					</td>
				</tr>
			</table>
		</div>	 
	</div>
</div>

<%
	}
	else if(themeType.equals("2"))
	{
%>

<div bgcolor="#e2f1ff" style="width:198px;padding-left:<%=paddingLeft%>px;padding-right:<%=paddingRight%>px;" >
	<table cellspacing="0" cellpadding="0" border="0" width="100%">
	<tr>	
		<td <%=(Validator.isNotNull(themeSelected))? "class='title_menuleft_xanh2'":"class='title_menuleft_xanh'"%>><%=titlePortlet%></td></tr>
		
	<tr>
		<td bgcolor="#ffffff">
		<table cellspacing="0" cellpadding="0" border="0" align="center" width="95%">	
		<tr>
			<td>
		    	<table width="100%" cellspacing="0" cellpadding="0" border="0">	
		       	<tr>
		        	<td width="21">
		    			<img width="21" height="23" src="/html/portlet/vlegal_display_menu/i_10.gif"/>
		    	  	</td>
		    	  	<td align="left">
		    		 	<a class="text_none2" href="<%= vlegalContentURL%>" style="text-decoration :none;">Toàn b&#7897; v&#259;n b&#7843;n</a>
		          	</td>
		       	</tr>	
		       	</table>	
			</td>
		</tr>
		    
		<tr>
			<td>
		    	<table width="100%" cellspacing="0" cellpadding="0" border="0">	
		       	<tr>
		        	<td width="21">
		    		 	<img width="21" height="23" src="/html/portlet/vlegal_display_menu/i_10.gif"/>
		    	  	</td>
		    	  	<td align="left">
		    		 	<a class="text_none2" href="<%= vlegalContentURL%>" style="text-decoration :none;">C&#417; quan ban hành</a>
		          	</td>
		       	</tr>	
		       	</table>	
		   	</td>
		</tr>
		  	  
		<c:if test="<%= organizations.size()>0%>">
		<%
			for(int i=0; i<organizations.size(); i++) { 
				VLegalOrg org = (VLegalOrg)organizations.get(i);
				vlegalContentURL.setParameter("organizationid", org.getOrgId());
				vlegalContentURL.setParameter("typedocid", "");		
				
		%>
		<tr>  
			<td><img width="1" height="1" src="/html/portlet/vlegal_display_menu/0.gif"/></td>
		</tr>
		  	  
		<tr>  
			<td height="5" bgcolor="#fff6e6"><img width="1" height="1" src="/html/portlet/vlegal_display_menu/0.gif"/></td>
		</tr>
		  	  
		<tr align="left">
		  	<td class="text_none" height="24" bgcolor="#fff6e6" style="padding-left:15px"> 
		  		&nbsp; &nbsp; &nbsp; &nbsp;<a href="<%= vlegalContentURL %>"><%=org.getName()%></a>
		  	</td>
		</tr>
		<%}%>	  
		</c:if>
		  	  
		<tr>
			<td class="content">
		    	<table width="100%" cellspacing="0" cellpadding="0" border="0">	
		       	<tr>
		          	<td width="21">
		    		 	<img width="21" height="23" src="/html/portlet/vlegal_display_menu/i_10.gif"/>
		    	  	</td>
		    	  	<td align="left">
		    		 	<a class="text_none2" href="<%= vlegalContentURL%>" style="text-decoration :none;">Lo&#7841;i v&#259;n b&#7843;n</a>
		          	</td>
		       	</tr>	
		       	</table>	
		   	</td>
		</tr>
		  	  
		<c:if test='<%=types.size()>0 %>' >
		<% 
			for(int i=0; i<types.size(); i++) { 
				VLegalType type = (VLegalType)types.get(i);
				vlegalContentURL.setParameter("typedocid", type.getTypeId());
				vlegalContentURL.setParameter("organizationid", "");
		%>	  	  
		<tr>  
			<td><img width="1" height="1" src="/html/portlet/vlegal_display_menu/0.gif"/></td>
		</tr>
			  	  
		<tr>  
			<td height="5" bgcolor="#fff6e6"><img width="1" height="1" src="/html/portlet/vlegal_display_menu/0.gif"/></td>
		</tr>
			  	  
		<tr>
			<td class="text_none" height="24" bgcolor="#fff6e6" style="padding-left:15px" align="left"> 
				&nbsp; &nbsp; &nbsp; &nbsp;<a href="<%= vlegalContentURL %>"><%=type.getName()%></a>
			</td>
		</tr>		 
		<%}%>
		</c:if>
		</table>
		</td>
	</tr>
	</table>	
</div>	
		
<% 
	}
	else if(themeType.equals("3"))
	{
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
					<td width="100%" background="<%= themeDisplay.getPathThemeImage() %>/DB_image/10.gif" height="30" style="color:#FFFFFF;font-size:11px;font-weight:bold;text-transform:uppercase;" valign="middle">&nbsp;<%=titlePortlet%></td>
				</tr>
				<tr>
					<td colspan="2">						
				
						<table width="100%" border="0" cellspacing="0" cellpadding="0">
						<tr>
							<td>
						    	<table width="100%" cellspacing="0" cellpadding="0" border="0">	
						       	<tr>
						        	<td width="21">
						    			<img width="21" height="23" src="/html/portlet/vlegal_display_menu/i_10.gif"/>
						    	  	</td>
						    	  	<td>
						    		 	<a class="text_none2" href="<%= vlegalContentURL%>" style="text-decoration :none;">Toàn b&#7897; v&#259;n b&#7843;n</a>
						          	</td>
						       	</tr>	
						       	</table>	
							</td>
						</tr>
						    
						<tr>
							<td>
						    	<table width="100%" cellspacing="0" cellpadding="0" border="0">	
						       	<tr>
						        	<td width="21">
						    		 	<img width="21" height="23" src="/html/portlet/vlegal_display_menu/i_10.gif"/>
						    	  	</td>
						    	  	<td>
						    		 	<a class="text_none2" href="<%= vlegalContentURL%>" style="text-decoration :none;">C&#417; quan ban hành</a>
						          	</td>
						       	</tr>	
						       	</table>	
						   	</td>
						</tr>
						  	  
						<c:if test="<%= organizations.size()>0%>">
						<%
							for(int i=0; i<organizations.size(); i++) { 
								VLegalOrg org = (VLegalOrg)organizations.get(i);
								vlegalContentURL.setParameter("organizationid", org.getOrgId());
								vlegalContentURL.setParameter("typedocid", "");		
								
						%>
						<tr>  
							<td><img width="1" height="1" src="/html/portlet/vlegal_display_menu/0.gif"/></td>
						</tr>
						  	  
						<tr>  
							<td height="5" bgcolor="#fff6e6"><img width="1" height="1" src="/html/portlet/vlegal_display_menu/0.gif"/></td>
						</tr>
						  	  
						<tr>
						  	<td class="text_none" height="24" bgcolor="#fff6e6" style="padding-left:15px"> 
						  		&nbsp; &nbsp; &nbsp; &nbsp;<a href="<%= vlegalContentURL %>"><%=org.getName()%></a>
						  	</td>
						</tr>
						<%}%>	  
						</c:if>
						  	  
						<tr>
							<td class="content">
						    	<table width="100%" cellspacing="0" cellpadding="0" border="0">	
						       	<tr>
						          	<td width="21">
						    		 	<img width="21" height="23" src="/html/portlet/vlegal_display_menu/i_10.gif"/>
						    	  	</td>
						    	  	<td>
						    		 	<a class="text_none2" href="<%= vlegalContentURL%>" style="text-decoration :none;">Lo&#7841;i v&#259;n b&#7843;n</a>
						          	</td>
						       	</tr>	
						       	</table>	
						   	</td>
						</tr>
						  	  
						<c:if test='<%=types.size()>0 %>' >
						<% 
							for(int i=0; i<types.size(); i++) { 
								VLegalType type = (VLegalType)types.get(i);
								vlegalContentURL.setParameter("typedocid", type.getTypeId());
								vlegalContentURL.setParameter("organizationid", "");
						%>	  	  
						<tr>  
							<td><img width="1" height="1" src="/html/portlet/vlegal_display_menu/0.gif"/></td>
						</tr>
							  	  
						<tr>  
							<td height="5" bgcolor="#fff6e6"><img width="1" height="1" src="/html/portlet/vlegal_display_menu/0.gif"/></td>
						</tr>
							  	  
						<tr>
							<td class="text_none" height="24" bgcolor="#fff6e6" style="padding-left:15px"> 
								&nbsp; &nbsp; &nbsp; &nbsp;<a href="<%= vlegalContentURL %>"><%=type.getName()%></a>
							</td>
						</tr>		 
						<%}%>
						</c:if>	 

						</table> 	
										
					</td>
				</tr>
				</table>
			</td>
			<td width="3px"></td>
		</tr>
				 
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
	
<tr><td height="4px" colspan="3"></td></tr>		
</table>		

	
<%}%>		